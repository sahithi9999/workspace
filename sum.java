class sum1
{
public static void main(String args[])
{
int sum=0,avg=0,i;
int a[]={2,3,6,1};
for(i=0;i<a.length;i++)
{
sum=sum+a[i];
avg=sum/a.length;
}
System.out.println(sum+" " +avg);
}
}