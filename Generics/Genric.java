package Generics;

import java.util.concurrent.Callable;

public class Genric<T extends Number> {
	public String hii() {
		return "Hello ji from Genric";
	}
	public<T> void hii2() {
		System.out.println("What is this");
	}
}

class Generic2<T> extends Genric{
	public String hii() {
		return "Hello ji from Generic2";
	}
	
	public<T> void methodOne(Genric<? super T> g2) {
		System.out.println("This is not it");
	}
}
