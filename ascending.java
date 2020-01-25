class ascending
{
public static void main(String args[])
{
int a[]={10,20,50,30};
int i,temp,j;
for(i=0;i<a.length;i++)
{
for(j=i+1;j<a.length;j++)
{
if(a[i]>a[j])
{
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
for(i=0;i<a.length;i++)
{
System.out.println(a[i]);
}
for(i=0;i<a.length;i++)
{
for(j=i+1;j<a.length;j++)
{
if(a[i]<a[j])
{
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
for(i=0;i<a.length;i++)
{
System.out.println(a[i]);
}
}
}
