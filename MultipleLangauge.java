package week3.org.abstraction;

public abstract class MultipleLangauge {
	public int a = 5;
	public void python() {
		System.out.println("Inside Python Programming");
	}
	
	public abstract void ruby();
	
	public final void check() {
		System.out.println("running final....");
	}

}
