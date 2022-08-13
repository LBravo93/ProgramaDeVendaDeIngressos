
package mapalidio;

/**
 *
 * @author Lidio Bravo
 */
public class IngressoPista extends Ingresso{
    
    //Atributos
    private double ppista;
    
    //Método calcular preço
    //Acredito não haver necessidade de um método imprimir valor ja que este método calcula e imprime o valor especificando o tipo do ingresso
    public void calcularPista(){
        this.ppista = getEventorel().getValorunico();
        System.out.printf("Preço do ingresso Pista: R$%2.2f\n",ppista);
    }
    
    
    //Métodos getter setter
    public double getPrecopista() {
        return ppista;
    }

    public void setPrecopista(double precopista) {
        this.ppista = precopista;
    }
    
}
