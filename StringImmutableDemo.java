import java.io.*;
import java.lang.*;
class StringImmutableDemo{
public static void main(String args[]){
String s="SASI";
s.concat("SITE");
System.out.println("After concatinate s1 and s2- "+s);
String s1="ANUSHA";
s=s1.concat("PERURI");
System.out.println("After concatinate s1 and s2- "+s);
}
}
