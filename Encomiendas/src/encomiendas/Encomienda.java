/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encomiendas;

/**
 *
 * @author User
 */
public class Encomienda {

    private static int contador;
    private int nro;
    private Cliente cliente;
    private int destino;
    private int tipoEnvio;
    private double importe;

    public Encomienda() {
        nro = contador++;
    }

    public Encomienda(Cliente cliente, int destino, int tipoEnvio, double importe) {
        nro = contador++;
        this.cliente = cliente;
        this.destino = destino;
        this.tipoEnvio = tipoEnvio;
        this.importe = importe;
    }

    public int getNro() {
        return nro;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getDestino() {
        return destino;
    }

    public void setDestino(int destino) {
        this.destino = destino;
    }

    public int getTipoEnvio() {
        return tipoEnvio;
    }

    public void setTipoEnvio(int tipoEnvio) {
        this.tipoEnvio = tipoEnvio;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }
    
    public String toString(){
        return "\nEncomienda: \nNro. encomienda: " + nro +
                "Destino: " + destino + 
                "Importe: " + importe +
                "Cliente: " + cliente.toString();
    }

}
