
package mapalidio;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Lidio Bravo
 */
public class Evento {
    //Atributos
    private String nome;
    private String data;
    private double valorunico;
    private int capacidademax;
    private List<Ingresso> listaingresso;

    //Construtor
    public Evento(String nome, String data, double valorunico, int capacidademax) {
        this.nome = nome;
        this.data = data;
        this.valorunico = valorunico;
        this.capacidademax = capacidademax;
        this.listaingresso = new ArrayList<Ingresso>();     
    }
    
    
    //Métodos Getter e Setter

    public String getNome() {
        return nome;
    }

    public List<Ingresso> getListaingresso() {
        return listaingresso;
    }

    public void setListaingresso(List<Ingresso> listaingresso) {
        this.listaingresso = listaingresso;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public double getValorunico() {
        return valorunico;
    }

    public void setValorunico(double valorunico) {
        this.valorunico = valorunico;
    }

    public int getCapacidademax() {
        return capacidademax;
    }

    public void setCapacidademax(int capacidademax) {
        this.capacidademax = capacidademax;
    }
    
    
    //Métodos especiais
    public void venderIngresso(Ingresso ingresso){   //Diferente o método Ingresso.pagar(), este verifica se foi pago e se cabe na lista para então adicionar o ingresso.
        int quantlista = this.listaingresso.size();
       if(quantlista +1 <= this.getCapacidademax()){
            if(ingresso.isPago() == true){
                this.listaingresso.add(ingresso);
                System.out.println("Ingresso adicionado na lista com sucesso.");
            }else{
                System.out.println("É necessário pagar o ingresso antes de adicionar na lista.");
            }
        }else{
            System.out.println("DESCULPE, EVENTO LOTADO.");
        }
    }
    

    public void mostrarVendidos(){
        System.out.println("---------------------------------------");
        System.out.println("###    INGRESSOS VENDIDOS    ###");
        for (Ingresso i: this.listaingresso){
            System.out.println("Código: " + i.getCodigo() + " | Nome: " + i.getNome());
        }
    }       
}

