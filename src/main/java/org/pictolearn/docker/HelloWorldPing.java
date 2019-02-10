package org.pictolearn.docker;

public class HelloWorld {

	public static void main(String args[]) throws Exception{
		for(int i = 0 ; i < 100; i++){
			System.out.println("Hi BMG " + i );
			Thread.sleep(1000);
		}
	}
	}
