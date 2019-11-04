package logistic;

public class duplicate 
{
	public static void main(String[]args)
	{
	String s1="hello hi";
	char []arr=s1.toCharArray();
	int n=arr.length-1;
	for(int i=0;i<n;i++)
	{
		if(arr[i]!=0)
		{
			for (int j=i+1;j<=n;j++)
			{
				if (arr[i]==arr[j])
				{
					arr[j]=0;
				}
			}
		}
		
	}
for (int i=0;i<=n;i++)
{
 if (arr[i]!=0)
 {
	 System.out.print(arr[i]);
 }
}
	

	
	}
}
