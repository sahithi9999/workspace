class multi
{
public static void main(String main[])
{
int arr[][]={{1,2},{2,4}};
int arr1[][]={{2,1},{1,2}};
int i,j,k;
int arr2[][]=new int[2][2];
for(i=0;i<arr.length;i++)
{
for(j=0;j<arr1.length;j++)
{
arr2[i][j]=0;
for(k=0;k<arr2.length;k++)
{
arr2[i][j]+=arr[i][k]*arr1[k][j];
}
System.out.print(arr2[i][j]+ " ");
}
}
}
}


