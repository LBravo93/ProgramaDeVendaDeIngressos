
package mapalidio;

/**
 *
 * @author Lidio Bravo
 */
public class IngressoVip extends Ingresso{
    
    //Atributos
    private double pvip;
    
    //Método calcular preço
    //Acredito não haver necessidade de um método imprimir valor á que este método calcula e imprime o valor especificando o tipo do ingresso
    public void calcularVip(){
        this.pvip = getEventorel().getValorunico() + ((getEventorel().getValorunico() * 30) / 100);
        System.out.printf("Preço do ingresso Vip: R$%2.2f\n",pvip);                                   
    }
    
    
    //Métodos Getter e Setter

    public double getPrecovip() {
        return pvip;
    }

    public void setPrecovip(double precovip) {
        this.pvip = precovip;
    }
    
    
}
