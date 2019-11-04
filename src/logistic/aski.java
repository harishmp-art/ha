package logistic;

public class aski 
{
	public static void main(String[] args) 
	{
	String s1="hello hi";
	String []arr=s1.split(" ");
	int s2=arr.length-1;
	for (int i1=0;i1<=s2;i1++)
	{
	if (arr[i1]!=null)
	{
	for (int j=i1+1;j<=s2;j++)
	{
		if (arr[i1].equals(arr[j]))
		{
			arr[j]=null;
		}
	}
	}
	}
	for (int i=0;i<=s2;i++)
	{
		if (arr[i]!=null)
		{
			System.out.print(arr[i]);
		}
	}
}
}