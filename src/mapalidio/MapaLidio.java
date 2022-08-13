
package mapalidio;

/**
 *
 * @author Lidio Bravo
 */
public class MapaLidio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        //Criação do evento com valor único de 50 e capacidade máxima de 6(pouco, eu sei. mas aumentei aqui a capacidade e testei, funcionou!!)
        Evento rock = new Evento("Rock in Maringá", "30/08/2022", 50.0, 6);
        
        //Ingresso 1 
        IngressoPista i1 = new IngressoPista();
        i1.setCodigo(01);
        i1.setNome("Paulo Oliveira");
        i1.setCPF("111.111.111-1");
        i1.setEventorel(rock);
        System.out.println(i1.mostrarResumo());
        i1.calcularPista();
        i1.pagar();
        rock.venderIngresso(i1);



        //Ingresso 2
        IngressoPista i2 = new IngressoPista();
        i2.setCodigo(02);
        i2.setNome("Mariana Silva");
        i2.setCPF("222.222.222-2");
        i2.setEventorel(rock);
        System.out.println(i2.mostrarResumo());
        i2.calcularPista();
        i2.pagar();
        rock.venderIngresso(i2);


        //Ingresso 3
        IngressoVip i3 = new IngressoVip();
        i3.setCodigo(03);
        i3.setNome("Aline Lourenço");
        i3.setCPF("333.333.333-3");
        i3.setEventorel(rock);
        System.out.println(i3.mostrarResumo());
        i3.calcularVip();
        i3.pagar();
        rock.venderIngresso(i3);



        //Ingresso 4
        IngressoVip i4 = new IngressoVip();
        i4.setCodigo(04);
        i4.setNome("Rafael Machado");
        i4.setCPF("444.444.444-4");
        i4.setEventorel(rock);
        System.out.println(i4.mostrarResumo());
        i4.calcularVip();
        rock.venderIngresso(i4);//Testando módulo que verifica se o ingresso foi pago antes de adicionar na lista
        i4.pagar();
        rock.venderIngresso(i4);



        //Ingresso 5
        IngressoCamarote i5 = new IngressoCamarote();
        i5.setCodigo(05);
        i5.setNome("Jhonni Cabral");
        i5.setCPF("555.555.555-5");
        i5.setEventorel(rock);
        System.out.println(i5.mostrarResumo());
        i5.calcularCamarote();
        i5.pagar();
        rock.venderIngresso(i5);



        //Ingresso 6
        IngressoCamarote i6 = new IngressoCamarote();
        i6.setCodigo(06);
        i6.setNome("Jaqueline Santos");
        i6.setCPF("666.666.666-6");
        i6.setEventorel(rock);
        System.out.println(i6.mostrarResumo());
        i6.calcularCamarote();
        i6.pagar();
        rock.venderIngresso(i6);



        //Ingresso 7 teste da capacidade máxima
        IngressoPista i7 = new IngressoPista(); //Ingresso criado para testar a módulo que verifica se o evento está cheio
        i7.setCodigo(07);
        i7.setNome("Luana Ramos");
        i7.setCPF("777.777.777-7");
        i7.setEventorel(rock);
        System.out.println(i7.mostrarResumo());
        i7.calcularPista();
        i7.pagar();
        rock.venderIngresso(i7);
        
        
        
        //Mostrar lista de ingressos vendidos
        rock.mostrarVendidos();
        

     }
    
}
