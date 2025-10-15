class Student
{
	private int roll;
	private String name;
	private String college;
	
	Student()
	{
		IO.println("0 arg constructor");
	}
	
	Student(int roll,String name,String college)
	{
		IO.println("3 arg constructor");
		this.roll=roll;
		this.name=name;
		this.college=college;
	}
	public int getRoll()
	{
		return this.roll;
	}
	public void setRoll(int roll)
	{
		this.roll=roll;
	}
	
	
	public String getName()
	{
		return this.name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	
	
	public String getCollege()
	{
		return this.college;
	}
	public void setCollege(String college)
	{
		this.college=college;
	}	
	
	
	@Override
	public String toString()
	{
		return this.getName()+" with roll no "+this.getRoll()+
		"  reads in the college "+this.getCollege();
	}
	
	
	}
	