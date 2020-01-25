class max
{
public static void main(String args[])
{
int a[]={1,2,3};
int i=0,min,max,temp=0;
for(i=0;i<a.length;i++)
{
if(a[0]>a[i])
{
temp=a[0];
a[0]=a[i];
a[i]=temp;
}
}
System.out.println(a[0]);
for(i=0;i<a.length;i++)
{
if(a[0]<a[i])
{
temp=a[0];
a[0]=a[i];
a[i]=temp;
}
}
System.out.println(a[0]);

}
}


