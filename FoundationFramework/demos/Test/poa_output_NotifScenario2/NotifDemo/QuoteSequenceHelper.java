//
// Java generated by the OrbixWeb IDL compiler 
//

package NotifDemo;


public class QuoteSequenceHelper
{
    public static void insert (org.omg.CORBA.Any any, NotifDemo.QuoteStruct[] value)
    {
        any.insert_Streamable(new NotifDemo.QuoteSequenceHolder(value));
    }
    public static NotifDemo.QuoteStruct[] extract (org.omg.CORBA.Any any)
    {
        if (!any.type().equal(type())) 
            throw new org.omg.CORBA.BAD_TYPECODE("Error inserting/extracting value from typecode.");
        else
            return read(any.create_input_stream()); 
    }
    private static org.omg.CORBA.TypeCode _type;
    public static org.omg.CORBA.TypeCode type()
    {
        if (_type == null) {
            org.omg.CORBA.TypeCode _tc = NotifDemo.QuoteStructHelper.type();
            _type =  org.omg.CORBA.ORB.init().create_sequence_tc(0, _tc);

        }
        return _type;
    }
    public static org.omg.CORBA.ORB _orb () {
        return org.omg.CORBA.ORB.init(); 
    }
    public static String id () {
        return "IDL:NotifDemo/QuoteSequence:1.0";
    }
    public static NotifDemo.QuoteStruct[] read (org.omg.CORBA.portable.InputStream _stream)
    {
        int _l = _stream.read_long();
        NotifDemo.QuoteStruct value []= new NotifDemo.QuoteStruct[_l];
        for (int _i0 = 0; _i0 < value.length; _i0++) {
            value[_i0] = NotifDemo.QuoteStructHelper.read (_stream);
        }
        return value;
    }
    public static void write (org.omg.CORBA.portable.OutputStream _stream, NotifDemo.QuoteStruct[] value)
    {
        _stream.write_long(value.length);
        for (int _i0 = 0; _i0 < value.length; _i0++) {
            NotifDemo.QuoteStructHelper.write (_stream, value[_i0]);
        }
    }
}
