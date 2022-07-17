package SamplePackage;


public class student { 
	
	int sid;
	char grade;
	String sname;
	
	public void getvalue(int id, String name,char g)
	{
		int sid=id;
		sname=name;
		grade=g;
	}
	
	
    public void display()
    {
    	System.out.println(sid+" "+sname+" "+grade);
    }

	public static void main(String[] args) {
	
	student stu1=new student();
	
	stu1.getvalue(1010,"john",'A');
	
	
	
	}

}
