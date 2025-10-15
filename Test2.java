class Test2
{
	static void main()
	{
		for(int i=0;i<10;i++)
			IO.println("Hello I am Java");
		IO.println("-".repeat(40));
		for(int i=0;i<10;i++)
			IO.println("i is "+i);
		IO.println("-".repeat(40));
		
		int x=1;
		while(x<=10)
		{
			IO.println("x is "+x);
			x++;
		}
		IO.println("-".repeat(40));
		
		int y=1;
		do
		{
			IO.println("y is "+y);
			y++;
		}
		while(y<=10);
	}
}
