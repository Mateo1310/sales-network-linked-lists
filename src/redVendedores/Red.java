package redVendedores;


public class Red {

	public Red() {
		vendedorList = new ListaVendedor();
	}
	ListaVendedor vendedorList;
	int cantVendedoresRight;
	int cantVendedoresLeft;

	float saldoTotalRight;
	float saldoTotalLeft;
	float saldoTotalRed;
	
	
	public void agregarVendedorRight(Vendedor vendedor) {
		vendedorList.insertRight(vendedor);
		cantVendedoresRight++;
	
	}
	
	public void agregarVendedorLeft(Vendedor vendedor) {
		vendedorList.insertLeft(vendedor);
		cantVendedoresLeft++;
	
	}

	public void calcularTotalSaldoRight() {
		saldoTotalRight = 0;
		NodoVendedor tmp = vendedorList.head;
		while (tmp != null) {
			saldoTotalRight = saldoTotalRight + tmp.vendedor.saldo;
			tmp = tmp.right;
		}
	}

	public void calcularTotalSaldoLeft() {
		saldoTotalLeft = 0;
		NodoVendedor tmp = vendedorList.head;
		while (tmp != null) {
			saldoTotalLeft = saldoTotalLeft + tmp.vendedor.saldo;
			tmp = tmp.left;
		}
	}

	public void calcularTotalSaldoRed() {
		saldoTotalRed = saldoTotalRight+saldoTotalLeft;
	}

	public Vendedor saldoMayorRight() {
		NodoVendedor tmp = vendedorList.head;
		Vendedor saldoMayorRight = tmp.vendedor;
		tmp = tmp.right;

		while (tmp != null) {

			if (tmp.vendedor.saldo > saldoMayorRight.saldo) {
				saldoMayorRight = tmp.vendedor;
			}
			tmp = tmp.right;
		}

		return saldoMayorRight;
	}

	public Vendedor saldoMayorLeft() {
		NodoVendedor tmp = vendedorList.head;
		Vendedor saldoMayorLeft = tmp.vendedor;
		tmp = tmp.left;

		while (tmp != null) {

			if (tmp.vendedor.saldo > saldoMayorLeft.saldo) {
				saldoMayorLeft = tmp.vendedor;
			}
			tmp = tmp.left;
		}

		return saldoMayorLeft;
	}

	public Vendedor saldoMayor() {
		Vendedor vendedorMayorSaldo;
		if (saldoMayorRight().saldo > saldoMayorLeft().saldo) {
			vendedorMayorSaldo = saldoMayorRight();
		} else {
			vendedorMayorSaldo = saldoMayorLeft();
		}
		return vendedorMayorSaldo;
	}
	
	public Vendedor saldoMenorRight() {
		NodoVendedor tmp = vendedorList.head;
		Vendedor saldoMenorRight= tmp.vendedor;
		tmp = tmp.right;

		while (tmp != null) {

			if (tmp.vendedor.saldo < saldoMenorRight.saldo) {
				saldoMenorRight = tmp.vendedor;
			}
			tmp = tmp.right;
		}

		return saldoMenorRight;
	}

	public Vendedor saldoMenorLeft() {
		NodoVendedor tmp = vendedorList.head;
		Vendedor saldoMenorLeft = tmp.vendedor;
		tmp = tmp.left;

		while (tmp != null) {

			if (tmp.vendedor.saldo < saldoMenorLeft.saldo) {
				saldoMenorLeft = tmp.vendedor;
			}
			tmp = tmp.right;
		}

		return saldoMenorLeft;
	}

	public Vendedor saldoMenor() {
		Vendedor vendedorMenorSaldo;
		if (saldoMenorRight().saldo < saldoMenorLeft().saldo) {
			vendedorMenorSaldo = saldoMenorRight();
		} else {
			vendedorMenorSaldo = saldoMenorLeft();
		}
		return vendedorMenorSaldo;
	}
	
	public void ejecutarMetodos() {
		calcularTotalSaldoRight();
		calcularTotalSaldoLeft();
		calcularTotalSaldoRed();
		saldoMayorRight();
		saldoMayorLeft();
		saldoMayor();
		saldoMenorRight();
		saldoMenorLeft();
		saldoMenor();
	}

}
