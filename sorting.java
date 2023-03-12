public class sorting 
{
public static void main (String args[])
{
String s[] ={"yasin","mohammed","house"};

for(int i=0;i<s.length;i=i+1)
{
for(int j=i+1;j<s.length;j=j+1)
{
if(s[i].compareTo(s[j])>0)   
{
String temp = s[i];
s[i]= s[j];
s[j]= temp;
}
}

}
for(String a:s)
{
System.out.println(a);
}

}
}
