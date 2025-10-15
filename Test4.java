class Test4
{
	static void main()
	{
		Student s1=new Student();
		s1.setRoll(1);
		s1.setName("Rupkatha");
		s1.setCollege("Techno");
		
		Student s2=new Student(2,"Priti","Iem");
		
		IO.println(s1);
		IO.println(s2);
		
		IO.println("-".repeat(30));
		
		Student sr[]=new Student[2];
		sr[0]=s1;
		sr[1]=s2;
		
		for(int i=0;i<sr.length;i++)
			IO.println(sr[i]);
		
		
		Student sr2[]=new Student[3];
		
		for(int i=0;i<sr2.length;i++)
		{
			int r=Integer.parseInt(IO.readln("enter roll"));
			String n=IO.readln("enter name");
			String c=IO.readln("enter college");
			Student e=new Student(r,n,c);
			sr2[i]=e;			
		}
		IO.println("-".repeat(30));
		for(Student f:sr2)
			IO.println(f);
		
		
		
			
		
		
		
		
		
		
	}
}
