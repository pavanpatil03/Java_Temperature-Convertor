import java.util.Scanner;

class TemperatureConvertor
{
public static void main(String arg[] )
{
int i=1;
while(i<=6)
{
Scanner sc=new Scanner(System.in);
System.out.println("***TEMPERATURE CONVERTOR***");
System.out.println("PRESS 1 For celcius to farenheit");
System.out.println("PRESS 2 For celcius to kelvin");
System.out.println("PRESS 3 For farenheit to celcius");
System.out.println("PRESS 4 For farenheit to kelvin");
System.out.println("PRESS 5 For  kelvin to celcius");
System.out.println("PRESS 6 For kelvin to farenheit");

int x=sc.nextInt();
if(x==1)
{
System.out.println(" enter celcius value");
double a=sc.nextDouble ();
 a=(a*9/5)+32;
System.out.println("farenheit value is ="+a+"F");
}
else if(x==2)
{
System.out.println(" enter celcius value");
double b=sc.nextDouble ();
 b=(b+273.15);
System.out.println("  kelvin value is ="+b+"K");
}
else if(x==3)
{
System.out.println(" enter farenheit value");
double c=sc.nextDouble ();
 c=(c-32)*5/9;
System.out.println(" celcius value i ="+c+"C");
}
else if(x==4)
{
System.out.println(" enter farenheit value");
double d=sc.nextDouble ();
 d=(d-32)*5/9+273.15;
System.out.println(" kelvin value is ="+d+"K");
}
else if(x==5)
{
System.out.println(" enter kelvin value");
double e=sc.nextDouble ();
 e=(e-273.15);
System.out.println("celcius value is ="+e+"F");
}
else
{
System.out.println(" enter kelvin value");
double f=sc.nextDouble();
 f=(f-273.15)*9/5+32;
System.out.println(" farenheit value is ="+f+"C");
}
i++;
}
}
}