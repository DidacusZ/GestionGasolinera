package gasolinera.servicos;

import java.util.List;
import java.util.Scanner;

import gasolinera.entidades.Gasolinera;

public class ImplGasolinera implements InterfazGasolinera {

	// metodos:

	// NUEVO RESPOSTAJE
	// NORMAL: se guarda la fecha, los litros y el importe.
	// FACTURA: se guarda la fecha, los litros, el importe, el DNI del cliente y la
	// matrícula del vehículo.

	// Generador de id

	public List<Gasolinera> RepostajeNormal(List<Gasolinera> baseDatos) {

		Gasolinera objetoGasolinera = new Gasolinera();
		Scanner sc = new Scanner(System.in);
		String fecha = "aaaaaaaaaaaaaa";
		double litros = 0.0;
		double importe = 0.0;

		// pedir datos
		System.out.print("Introduce la fecha de hoy: ");
		fecha = sc.next();
		System.out.print("Introduce los litros a repostar: ");
		litros = sc.nextDouble();
		System.out.print("Introduce el importe: ");
		importe = sc.nextDouble();

		// guardar datos
		objetoGasolinera.setId(calculoIdGaso(baseDatos));
		objetoGasolinera.setFecha(fecha);
		objetoGasolinera.setLitros(litros);
		objetoGasolinera.setImporte(importe);

		// guardar objeto en BBDD
		baseDatos.add(objetoGasolinera);

		return baseDatos;
	}

	public List<Gasolinera> RepostajeFactura(List<Gasolinera> baseDatos) {

		Gasolinera objetoGasolinera = new Gasolinera();
		Scanner sc = new Scanner(System.in);
		String fecha = "aaaaaaaaaaaaaa";
		double litros = 0.0;
		double importe = 0.0;
		
		String dni = "aaaaaaaaaaaaaa";
		String matricula = "aaaaaaaaaaaaaa";

		// pedir datos RepoNormal
		System.out.print("Introduce la fecha de hoy: ");
		fecha = sc.next();
		System.out.print("Introduce los litros a repostar: ");
		litros = sc.nextDouble();
		System.out.print("Introduce el importe: ");
		importe = sc.nextDouble();

		// guardar datos RepoNormal
		objetoGasolinera.setId(calculoIdGaso(baseDatos));
		objetoGasolinera.setFecha(fecha);
		objetoGasolinera.setLitros(litros);
		objetoGasolinera.setImporte(importe);

		
		// pedir datos RepoFactura
		System.out.print("Introduce tu DNI: ");
		dni = sc.next();
		System.out.print("Introduce la matricula de tu coche: ");
		matricula = sc.next();
		
		// guardar datos RepoFactura
		objetoGasolinera.setDni(dni);
		objetoGasolinera.setMatricula(matricula);
		
		// guardar objeto en BBDD
		baseDatos.add(objetoGasolinera);
		
		return baseDatos;
	}

	private int calculoIdGaso(List<Gasolinera> baseDatos) {// private cuando solo se us en esa clase
		int auxiliar = 0;

		for (int i = 0; i < baseDatos.size(); i++) {
			int j = baseDatos.get(i).getId();
			if (auxiliar < j) {
				auxiliar = j;
			}
		}
		return auxiliar + 1;
	}

	private void Respostaje() {

		
		
	}
}
