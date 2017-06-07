
public class Main {

	public static void main(String[] args) {
		Clase1 cuadrado;
		cuadrado= new Clase1();
			cuadrado.altura=(float)(3.4);
			cuadrado.area=25;
			cuadrado.base=5;
				System.out.println(cuadrado.toString());
				
		Clase2 triangulo;
		triangulo= new Clase2();
			triangulo.altura=12;
			triangulo.area=30;
			triangulo.base=5;
				System.out.println(triangulo.toString());
				
		Clase3 trapecio;
		trapecio= new Clase3();
			trapecio.altura=4;
			trapecio.area=100;
			trapecio.baseMay=16;
			trapecio.baseMen=9;
				System.out.println(trapecio.toString());
				
		Clase4 rombo;
		rombo= new Clase4();
			rombo.altura=8;
			rombo.diagonalMay=5;
			rombo.diagonalMen=2;
			rombo.area=5;
				System.out.println(rombo.toString());
				
		Clase5 rectangulo;
		rectangulo= new Clase5();
			rectangulo.altura=10;
			rectangulo.area=50;
			rectangulo.base=5;
				System.out.println(rectangulo.toString());
	}

}
