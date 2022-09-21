package coreJava;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] names= {"John","Jacob","Jerry"};
		
		for(int i=0;i<names.length;i++)
		{
			
		System.out.println("My name is "+ names[i]);	
		}
		
		for(int i=names.length-1;i>=0;i--) 
		{
			System.out.println(names[i]);
		}
	}

}
