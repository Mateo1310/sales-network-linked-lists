package redVendedores;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class Program {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		Red pepito = new Red();

		BufferedReader bf = new BufferedReader(new FileReader(
				"C:\\Users\\mathe\\eclipse-workspace\\Taller1Corte2\\src\\redVendedores\\datos-vendedores.txt"));

		String[] arrDatosVendedorRight;
		String[] arrDatosVendedorLeft;

		int cantVendedoresRight = Integer.parseInt(bf.readLine());
		for (int i = 0; i < cantVendedoresRight; i++) {
			arrDatosVendedorRight = bf.readLine().split(",");
			Vendedor vendedorRight = new Vendedor(Integer.parseInt(arrDatosVendedorRight[0]),
					Float.parseFloat(arrDatosVendedorRight[1]));
			pepito.agregarVendedorRight(vendedorRight);
		}
			int cantVendedoresLeft = Integer.parseInt(bf.readLine());
			for (int j = 0; j < cantVendedoresLeft; j++) {
				arrDatosVendedorLeft = bf.readLine().split(",");
				Vendedor vendedorLeft = new Vendedor(Integer.parseInt(arrDatosVendedorLeft[0]),
						Float.parseFloat(arrDatosVendedorLeft[1]));
				pepito.agregarVendedorLeft(vendedorLeft);
	
				
			}
			
			pepito.ejecutarMetodos();
		
		Float saldoTotalRed = pepito.saldoTotalRed;
		System.out.println("El saldo total de la red es : $ " + saldoTotalRed);

		Vendedor vendedorSaldoMayor = pepito.saldoMayor();
		System.out.println("El vendedor con mayor saldo es: " + vendedorSaldoMayor.id);

		Vendedor vendedorSaldoMenor = pepito.saldoMenor();
		System.out.println("El vendedor con menor saldo es: " + vendedorSaldoMenor.id);

	}

}
