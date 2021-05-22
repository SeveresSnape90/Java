public class Prime
{
public static void main(String[] args)
{
int start = Integer.parseInt(args[0]);
int end = Integer.parseInt(args[1]);
int count;
for(int i = start ; i <= end ; i++)
{
count = 0;
for(int j = 1 ; j <= i ; j++)
{
if(i % j == 0)
count = count+1;
}
if(count == 2)
System.out.println(i);
}
}
}