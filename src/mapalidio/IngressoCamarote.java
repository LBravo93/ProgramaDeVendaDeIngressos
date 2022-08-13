
package mapalidio;

/**
 *
 * @author Lidio Bravo
 */
public class IngressoCamarote extends Ingresso{
    
    //Atributos
    private double pcamarote;
    
    
    //Método calcular preço
    //Acredito não haver necessidade de um método imprimir valor á que este método calcula e imprime o valor especificando o tipo do ingresso
    public void calcularCamarote(){
        this.pcamarote = getEventorel().getValorunico() + ((getEventorel().getValorunico() * 60) / 100);
        System.out.printf("Preço do ingresso Camarote: R$%2.2f\n",this.pcamarote);
    }
}
