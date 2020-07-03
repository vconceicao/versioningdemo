package org.ea;

public class VersioningDemo {

	
	
	public static void main(String[] args) {
		System.out.println("Hello Word!");
		System.out.println("");
		System.out.println("This program is running the version " + VersioningDemo.class.getPackage().getImplementationVersion());
	}
}
