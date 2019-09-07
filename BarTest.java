public class BarTest {

	public static void main(String args[]) {
		Bar hersh = new Bar("milk", 1, 4);
		hersh.getPerimeter();
		System.out.println(hersh.getPerimeter());
		hersh.getArea();
		System.out.println(hersh.getArea());
		hersh.isSquare();
		System.out.println(hersh.isSquare());
		//hersh.calculateCost();
		//System.out.println(hersh.calculateCost());
		hersh.getDetails();
		System.out.println(hersh.getDetails());
		hersh.drawBar();




	}
}