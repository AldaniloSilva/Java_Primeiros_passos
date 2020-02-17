/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeiro_passo;
import java.util.Scanner;

/**
 *
 * @author Alipio
 */
public class EstadoTabuada extends MaquinaEstadoConsole{
    @Override
    public boolean Executa() {
        boolean sair = false;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um número para calcular a tabuada");
        int n = in.nextInt();
        in.nextLine();
        System.out.println();
        
        for (int i=0; i<11; i++)
        {
            System.out.println(n + "X" + i + "=" + (n*i));
        }
        
        
        System.out.println("Deseja continuar nesse app? y/n");
        String resposta = in.nextLine();
        if(resposta.equals("y"))
            return sair;
        else
            return true;
            
            
       
        
          
    }
    
}
