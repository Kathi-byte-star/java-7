import currency.*;
import distance.*;
import time.*;
import java.util.Scanner;
public class Convertor
{
public static void main(String[] args)
{
int code,currency_code,distance_code,time_code;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the code 1: Currency\n2:Distance\n3:Time");
code=sc.nextInt();
if(code==1)
{
CurrencyConvertor cc=new CurrencyConvertor();
System.out.println("Enter the Currency code 1:Euro\n2:Dollar\n3:Yen");
currency_code=sc.nextInt();
if(currency_code==1)
{
cc.convertInrtoEuro();
cc.convertEurotoInr();
}
else if(currency_code==2)
{
cc.convertInrtoDollar();
cc.convertDollarToInr();
}
else if(currency_code==3)
{
cc.convertInrtoYen();
cc.convertYentoInr();
}
else
{
System.out.println("Invalid Code");
}
}
else if(code==2)
{
DistanceConvertor dc=new DistanceConvertor();
System.out.println("Enter the Distance code1: Meter\n2:Miles");
distance_code=sc.nextInt();
if(distance_code==1)
{
dc.convertMeterToKm();
dc.convertKmToMeter();
}
else if(distance_code==2)
{
dc.convertMilesToKm();
dc.convertKmToMiles();
}
else
{
System.out.println("Invalid Code");
}
}
else if(code==3)
{
TimeConvertor tc=new TimeConvertor();
System.out.println("Entyer the Time code 1: Minutes\n2:Seconds");
time_code=sc.nextInt();
if(time_code==1)
{
tc.convertHourToMinute();
tc.convertMinuteToHour();
}
else if(time_code==2)
{
tc.convertHourToSeconds();
tc.convertSecondsToHour();
}
else
{
System.out.println("Invalid code");
}
}
else
{
System.out.println("Invalid Code");
}
}
}

