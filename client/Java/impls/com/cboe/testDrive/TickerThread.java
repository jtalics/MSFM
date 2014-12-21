
/**
 * Title:        <p>
 * Description:  <p>
 * Copyright:    Copyright (c) <p>
 * Company:      <p>
 * @author
 * @version 1.0
 */
package com.cboe.testDrive;
import com.cboe.idl.consumers.*;
import com.cboe.idl.cmiUtil.*;
import java.util.*;
import com.cboe.idl.cmiMarketData.TickerStruct;
import com.cboe.idl.cmiProduct.*;
import com.cboe.idl.events.*;
import com.cboe.infrastructureServices.eventService.*;
import com.cboe.infrastructureServices.traderService.*;
import com.cboe.infrastructureServices.orbService.*;
import com.cboe.infrastructureServices.foundationFramework.*;
import com.cboe.infrastructureServices.systemsManagementService.*;
import java.io.IOException;
import com.cboe.application.shared.*;
import com.cboe.idl.cmiSession.*;
import com.cboe.idl.marketData.*;

public class TickerThread extends Thread {
  private TickerEventConsumer tickerEventConsumer = null;
  private SessionProductStruct[] products = null;
  private int testLength = 100000;
  private int msgRate = 0;

  public TickerThread(SessionProductStruct[] products, TickerEventConsumer tickerEventConsumer, int msgRate) {
    this.products = products;
    this.tickerEventConsumer = tickerEventConsumer;
    this.msgRate = msgRate;
  }

  public void run()
  {
    int reportEvery = 200;
    int total = 0;
    while (true)
    {
        long startTime = System.currentTimeMillis( );
        long curTime = 0;
        long remainTime = 0;
        long cumWaitTime = 0;
        int waitCnt = 0;
        int currentProduct = 0;
        int[] seq = {1};
        long time0 = System.currentTimeMillis( );

        try {
          for (int x = 0; x < testLength; x++)
          {
            if ( currentProduct >= products.length )
                 currentProduct = 0;

            InternalTickerStruct intTickerStruct = UnitTestHelper.createTickerStruct(products[currentProduct].sessionName,products[currentProduct].productStruct.productKeys, products[currentProduct].productStruct.productName.productSymbol);
                  //aMarketDataPublisher.acceptMarketData(seq, tickerStruct);
            total++;
            if (x % reportEvery == 0)
            {
            System.out.println(total + " Ticker published...."+ products[currentProduct].productStruct.productKeys.productKey+ ":" + products[currentProduct].productStruct.productName.productSymbol);
            }
            tickerEventConsumer.acceptTicker(seq, intTickerStruct);

            currentProduct++;

            if ( msgRate != 0 && x % msgRate == 0 )
            {
              curTime = System.currentTimeMillis();

              remainTime = 1000 - (curTime - startTime) - 20; // 20 = Fudge factor for sleep...
              if ( remainTime > 20 ) {
                waitCnt++;
                cumWaitTime += remainTime;
                try {
                   Thread.sleep( remainTime );
                } catch ( Exception e ) {}
              }
              startTime = System.currentTimeMillis( );
            }

          }
          System.out.println("actual message rate = " + (testLength*1000)/(System.currentTimeMillis( )-time0));

        }
        catch (Exception e)
        {
          e.printStackTrace();
          System.exit(1);
        }
    }
  }
}
