/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeiro_passo;


/**
 *
 * @author 082170001
 */
public class Primeiros_Passos {
    
    public static MaquinaEstadoConsole estadoConsole;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        estadoConsole = EnumEstadoConsole.APP_MENU.getClasse();        
        Boolean saida = false;
        while (!saida){
            saida = estadoConsole.Executa();
        }
        
                

    }
    
}
