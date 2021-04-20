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
public class Cliente {
    private int nro;
    private int categoria;
    
    public Cliente(){
        
    }
    
    public Cliente(int nro, int categoria){
        this.nro = nro;
        this.categoria = categoria;
    }

    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }
    
    public String toString(){
        return "\nCliente:\nNúmero: " + nro + "\nCategoría: " + categoria;
    }
    
    
    
}
