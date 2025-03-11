package retojueves;

import java.util.ArrayList;

/**
 * Clase que representa el catálogo del museo.
 */
public class Catalogo {
    private ArrayList<Obra> obras;

    public Catalogo() {
        this.obras = new ArrayList<>();
    }

    public boolean anadeObra(Obra obra) {
        for (Obra o : obras) {
            if (o.getNumeroInventario() == obra.getNumeroInventario()) {
                return false;
            }
        }
        obras.add(obra);
        return true;
    }

    public boolean eliminaObra(int numeroInventario) {
        ArrayList<Obra> obrasAEliminar = new ArrayList<>();
        
        for (Obra o: obras) {
            if (o.getNumeroInventario() == numeroInventario) {
                obrasAEliminar.add(o);
            }
        }

        boolean eliminado = !obrasAEliminar.isEmpty();
        obras.removeAll(obrasAEliminar); 

        return eliminado; 
    }


    public Obra buscaObra(int numeroInventario) {
        for (Obra o : obras) {
            if (o.getNumeroInventario() == numeroInventario) {
                return o;
            }
        }
        return null;
    }

    public double superficie() {
        double suma = 0;
        for (Obra o : obras) {
            if (o instanceof Pintura) {
                suma += ((Pintura) o).superficie();
            }
        }
        return suma;
    }

    public int masAlta() {
        double maxAltura = -1;
        int numInventario = -1;
        for (Obra o : obras) {
            if (o instanceof Escultura) {
                Escultura e = (Escultura) o;
                if (e.getAltura() > maxAltura) {
                    maxAltura = e.getAltura();
                    numInventario = e.getNumeroInventario();
                }
            }
        }
        return numInventario;
    }
}
