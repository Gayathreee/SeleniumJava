package week3.org.abstraction;

public class Automation extends MultipleLangauge implements Language,TestTool {
	
	public int a=7;
	
	public static String name = "Gayathri";
	
	public final int c =10;
	
	public void Selenium() {
		// TODO Auto-generated method stub
		
		System.out.println("Implementing Selenium...");
		
	}
	
	public static void noObject() {
		System.out.println("Inside static Method");
		Automation.name = "Gayathri Balakrishnan";
		System.out.println(Automation.name);
	}
	
	public void Java() {
		// TODO Auto-generated method stub
		System.out.println("Implementing Java...");
	}
	
	public void ruby() {
		// TODO Auto-generated method stub
		System.out.println("Implementing Ruby...");
	}
	
	public void python() {
		System.out.println("Extending Python Programming");
	}
	
	public void parentPython() {
		super.python();
		System.out.println(this.a);
		System.out.println(c);
	//	c = c+2;
	}
	
	public static void main(String[] args) {
		Automation autoObj = new Automation();
		autoObj.python();
		autoObj.ruby();
		autoObj.Java();
		autoObj.Selenium();
		autoObj.parentPython();
		
		System.out.println(Automation.name);
		
		//final method
		autoObj.check();
		
		//static Method calling
		Automation.noObject();
		
		//Static object writing
		System.out.println(Automation.name);
		
	}
	
	

	
}
