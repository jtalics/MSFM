#topUsage - top 20 have disk usage greater than 50%
# Usage: $0 hostname...
#
# pwadmin_output_file should be generated by command such as
#     pwadmin -request showCurrentList > pwadmin_output_file
#

if [ -z "$1" ] ; then
    echo "Usage: `basename $0` host..."
    exit 1
fi

export SSH="ssh -q -o Batchmode=yes "
ALIVEHOST=$*
PROG=`basename $0`
DATADIR=/var/tmp/$PROG.data

\rm -rf $DATADIR 2>/dev/null
mkdir -p $DATADIR
echo "\t\t$(df -k . |head -1)"
integer THRESHOLD=50
for i in $ALIVEHOST
do 
    case $i in 
        fix2[12])
            IPATH="/apps/fixcas/prod/infra"
	  	    ;;
	*) IPATH="/sbt/prod/infra";;
    esac
    ($SSH $i "df -k  . |grep -v File") >> $DATADIR/$i.OUTFILE &
done

wait
for i in $DATADIR/*.OUTFILE
do
    utilized=$(cat $i |/usr/bin/awk '{print $5}' |sed 's/%//g')
    let digitUtil="$utilized + 0"
    if (( "$digitUtil" > "$THRESHOLD" || "$digitUtil" == 100 )) 
    then
        cp $i $i.TOP
    fi
done
for i in $DATADIR/*TOP
do
    [[ -f $i ]] && {
        name=`echo $i |sed 's#^'$DATADIR'.##;s/.OUTFILE.TOP//'`	
        echo "CAS: $name $(cat $i)"
    }
done |sort -nr +6 |head -20
\rm -rf $DATADIR

exit 0
