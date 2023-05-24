package PankajDemo;

public class ThredExp1 implements Runnable{
		
	  public void run() 
	  { 
		  System.out.println("Run Exp 1"); 
	  }
	  
	  public void run(int a)
	  {
		  System.out.println(a);
	  }
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThredExp1 t2 = new ThredExp1();
		Thread t1 = new Thread(t2);
		t1.start();
		t2.run(10);
	}

}
