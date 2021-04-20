/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encomiendas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author User
 */
public class Empresa {

    private Encomienda[] encomiendas;
    private List<Encomienda> encomiendasCaras;

    public Empresa(Encomienda[] encomiendas) {
        this.encomiendas = encomiendas;
    }

    public Encomienda[] getEncomiendas() {
        return encomiendas;
    }

    public void setEncomiendas(Encomienda[] encomiendas) {
        this.encomiendas = encomiendas;
    }

    public List<Encomienda> getEncomiendasCaras() {
        return encomiendasCaras;
    }

    public void setEncomiendasCaras(List<Encomienda> encomiendasCaras) {
        this.encomiendasCaras = encomiendasCaras;
    }

//Método 1    
    public void generarLista(double importe) {
        encomiendasCaras = new ArrayList();
        for (int i = 0; i < encomiendas.length; i++) {
            if (encomiendas[i].getImporte() < importe) {
                encomiendasCaras.add(encomiendas[i]);
            }
        }
    }

//Método 2    
    public double[] determinarImporteAcumulado() {
        double[] acumulador = new double[15];
        for (Encomienda e : encomiendasCaras) {
            acumulador[e.getTipoEnvio()] += e.getImporte();
        }
        return acumulador;
    }

//Método 3
    public Encomienda calcularEncomiendasCliente2() {
        List<Encomienda> encomiendasCliente2 = new ArrayList();
        if (encomiendasCaras != null) {
            for (Encomienda encomiendaCara : encomiendasCaras) {
                if (encomiendaCara.getCliente().getCategoria() == 2) {
                    encomiendasCliente2.add(encomiendaCara);
                }
            }
            Collections.sort(encomiendasCliente2, new EncomiendasComparatorImporte());
            if (encomiendasCliente2.isEmpty()) {
                return null;
            } else {
                if (encomiendasCliente2.size() > 1) {
                    return encomiendasCliente2.get(1);
                } else {
                    return encomiendasCliente2.get(0);
                }
            }
        }
        return null;
    }

//Método 4
    public boolean existeCliente(int nroCliente) {
        if (encomiendasCaras != null) {
            for (Encomienda e : encomiendasCaras) {
                return e.getCliente().getNro() == nroCliente;
            }
        }
        return false;
    }

//Método 5
    public boolean eliminarCliente(int nroCliente) {
        Encomienda encomiendaAEliminar = null;
        if (encomiendasCaras != null) {
            for (Encomienda e : encomiendasCaras) {
                if (existeCliente(nroCliente)) {
                    encomiendaAEliminar = e;
                    break;
                }
            }
            if (encomiendaAEliminar != null) {
                encomiendasCaras.remove(encomiendaAEliminar);
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

}
