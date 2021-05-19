package javaDemo;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		
		//int x= 90;
		
		
		  
		  
		
		 
		
		
		MyClazz clazz1 = new MyClazz();
		
		
		
		System.out.println(clazz1);
		
		
		System.gc();

	}

}




class MyClazz{
	
	@Override
	public String toString() {
		return "My Msg";
	}
	
	
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println(new Date());
	}
	
}
