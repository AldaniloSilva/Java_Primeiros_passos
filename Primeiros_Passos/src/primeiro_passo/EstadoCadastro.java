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
public class EstadoCadastro extends MaquinaEstadoConsole{
    @Override
    public boolean Executa() {
        boolean sair = false;
        String nome, cidade;
        int idade;
        Scanner in = new Scanner(System.in);
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        nome = entrada.nextLine();
        System.out.println("Digite sua idade:");
        idade = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Digite sua cidade");
        cidade = entrada.nextLine();
        System.out.println("Olá. Seu nome é " + nome);
        System.out.println("Sua idade é " + idade);
        System.out.println("Sua cidade é "+ cidade);
        
        System.out.println("Deseja continuar nesse app? y/n");
        String resposta = in.nextLine();
        if(resposta.equals("y"))
            return sair;
        else
            return true;
    
    }
    
}
