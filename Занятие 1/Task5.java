package library;

public class Task5 {
public static void main (String[] args) {
	
int a=25;
short b=25000;
int result1=a+b;

long c=1000;
double d=400.5;
double result2= c-d;

float e=30.5f;
double i=30.5;
double result3=e*i;

if (c>d){
	boolean result4=true;
	System.out.println("c more that d="+result4); }
else {
	boolean result4=false;
	System.out.println("c more that d="+result4); }
if (e<a){
	boolean result5=true;
	System.out.println("e not more that a="+result5); }
else {
	boolean result5=false;
	System.out.println("e not more that a="+result5); }

if (d==i){
	boolean result6=true;
	System.out.println("d equally i="+result6); }
else {
	boolean result6=false;
	System.out.println("d equally i="+result6); }
if (a!=c){
	boolean result7=true;
	System.out.println("a not equally i="+result7); }
else {
	boolean result7=false;
	System.out.println("a not equally i="+result7); }

System.out.println("a+b="+result1);
System.out.println("c-d="+result2);
System.out.println("e*i="+result3);

}
}