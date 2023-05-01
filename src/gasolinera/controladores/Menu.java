package gasolinera.controladores;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import gasolinera.entidades.Gasolinera;
import gasolinera.servicos.ImplGasolinera;
import gasolinera.servicos.ImplMenu;
import gasolinera.servicos.InterfazGasolinera;
import gasolinera.servicos.InterfazMenu;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Objetos para llamar a los metodos de sus clases
		InterfazMenu menu = new ImplMenu();
		InterfazGasolinera gasolinera = new ImplGasolinera();

		// base de datos
		List<Gasolinera> BD = new ArrayList();

		// escaner
		Scanner sc = new Scanner(System.in);

		// declaracion variables
		int num;
		boolean verdad = true;

		do {
			menu.MostarMenu();
			num = sc.nextInt();
			switch (num) {

			case 1:
				BD = gasolinera.RepostajeNormal(BD);

				break;

			case 2:
				BD = gasolinera.RepostajeFactura(BD);

				break;

			case 3:

				for (int i = 0; i < BD.size(); i++) {
					System.out.println(BD.get(i).toString());
				}

				System.out.println("Pulsa una tecla para volver al menu");
				
				break;

			case 0:
				verdad = false;
				break;

			}

		} while (verdad);

		System.out.println("ads");

	}

}
