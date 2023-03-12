public class search
{
public static void main (String args[])
{
String o = "mohammed";
char search = 'd';
boolean flag = false;
for(int i =0;i<o.length();i=i+1)
{
if(o.charAt(i)== search)
{
flag=true;

}
}
System.out.println(flag);


}


}
