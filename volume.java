class vol
{
int bl,bb,bw;
void setvol(int l,int b,int w)
{
bl=l;
bb=b;
bw=w;
}
void calval()
{
int res;
res=bl*bb*bw;
System.out.println(res);
}
void getvol()
{
System.out.println(bl);
System.out.println(bb);
System.out.println(bw);
}
public static void main(String args[])
{
vol v=new vol();
v.setvol(2,3,2);
v.getvol();
v.calval();

}
}



