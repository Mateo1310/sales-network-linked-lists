package redVendedores;



public class ListaVendedor {
	
	NodoVendedor head;
	void insertRight(Vendedor vendedor) {
		
		NodoVendedor nuevoNodo = new NodoVendedor();
		nuevoNodo.vendedor = vendedor;
		
		if(head == null) {
			head = nuevoNodo;
		}
		else {
			NodoVendedor tmp = head;
			while(tmp.right != null) {
				tmp = tmp.right;
			}
			tmp.right = nuevoNodo;
		}
	}
	
	void insertLeft(Vendedor vendedor) {
		
		NodoVendedor nuevoNodo = new NodoVendedor();
		nuevoNodo.vendedor = vendedor;
		
		if(head == null) {
			head = nuevoNodo;
		}
		else {
			NodoVendedor tmp = head;
			while(tmp.left != null) {
				tmp = tmp.left;
			}
			tmp.left = nuevoNodo;
		}
	}
}
