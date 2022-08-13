
package mapalidio;

/**
 *
 * @author Lidio Bravo
 */
public class Ingresso{
    
    //Atributos
    private int codigo;
    private String nome;
    private String CPF;
    private Evento eventorel;
    private boolean pago;
    
    
    //Construtor

    public Ingresso() {
        this.pago = false;
    }

    
    // Métodos Getter e Setter
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public Evento getEventorel() {
        return eventorel;
    }

    public void setEventorel(Evento eventorel) {
        this.eventorel = eventorel;
    }

    public boolean isPago() {
        return pago;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }
    
    //Métodos especiais
    
    public void pagar(){ //Verifica se o ingresso foi pago anteriormente ou não...
        if(this.pago == false){
            this.pago = true;
        }else{
            System.out.println("O Ingresso já foi pago anteriormente!!!");
        }
    }

    public String mostrarResumo() {
        System.out.println("---------------------------------------");
        return "###    Ingresso    ###\n" + "codigo = " + codigo + "\nnome = " + nome + "\nCPF = " + CPF + "\neventorel = " + eventorel.getNome() + "\nData = " + eventorel.getData();
    }
    
    
    
    
}
    
