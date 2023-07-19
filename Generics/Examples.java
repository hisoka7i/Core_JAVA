package Generics;

public class Examples {
	public static void main(String[] args) {
		Genric<?> g1 = new Genric<Number>();
		System.out.println(g1.hii());
		g1.hii2();
		Generic2<Integer> g2 = new Generic2<>();
		System.out.println(g2.hii());
		
		Generic2<Float> g3 = new Generic2<Float>();
		g3.methodOne(g2);
		//g3.methodOne((Generic2<Integer>)g2);
	}
}
