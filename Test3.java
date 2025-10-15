class Test3
{
	static void main()
	{
		int x[]={1,2,3,4,5,6,7,8,9,10};
		
		for(int i=0;i<x.length;i++)
			IO.println("i is "+i+" value is "+x[i]);
		
		IO.println("-".repeat(40));
		
		for(int r:x)
			IO.println(r);
		
		
	}
}
