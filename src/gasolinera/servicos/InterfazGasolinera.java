package gasolinera.servicos;

import java.util.List;

import gasolinera.entidades.Gasolinera;

public interface InterfazGasolinera {

	
	public List<Gasolinera> RepostajeNormal(List<Gasolinera> baseDatos);
	
	public List<Gasolinera> RepostajeFactura(List<Gasolinera> baseDatos);
}
