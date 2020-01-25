class fact
{
public static void main(String args[])
{
fact f=new fact();
f.factorial();
}
void factorial()
{
int fact=1;
for(int i=1;i<=4;i++)
{
fact=fact*i;
}
System.out.println("factorial"+fact);
}
}

