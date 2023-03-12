public class removeallduplicares
{
public static void main (String args[])
{
String name = "mandana";
// string to char array conversion 
char s[]= new char [name.length()];
for(int i=0;i<s.length;i=i+1)
{
 s[i]= name.charAt(i);
}
// logic to remove duplicates
for(int i=0;i<s.length;i=i+1)
{
for(int j=i+1;j<s.length;j=j+1)
{
if(s[i]==s[j])
{
 s[j]=' ';
}
}
}
//logic for print
for(char m:s)
{
System.out.println(m);
}
System.out.println();



}
}

