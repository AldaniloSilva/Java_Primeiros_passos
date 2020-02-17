/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeiro_passo;
import java.util.Scanner;
import primeiro_passo.Primeiros_Passos;

/**
 *
 * @author Alipio
 */
public class MenuPrincipal extends MaquinaEstadoConsole{
    @Override
    public boolean Executa(){
        boolean sair = false;
        Scanner in = new Scanner(System.in);
        System.out.println("Bem-vindo!");
        System.out.println("Indique a opção desejada!");
        System.out.println("0 - Sair");
        System.out.println("1 - App Tabuada");
        System.out.println("2 - App Cadastro");            
        int opcao = in.nextInt();
        in.nextLine();
        switch(opcao)
        {
            case 0:
                sair = true;
                break;
            case 1:
                primeiro_passo.Primeiros_Passos.estadoConsole = 
                        EnumEstadoConsole.APP_TABUADA.getClasse();
                break;
            case 2:
                primeiro_passo.Primeiros_Passos.estadoConsole = 
                        EnumEstadoConsole.APP_CADASTRO.getClasse();           
                break;
        }
        return sair;
    }

}
