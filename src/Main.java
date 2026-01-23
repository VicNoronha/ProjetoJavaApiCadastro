import Modelo.Usuario;
import Servicos.Servicos;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Servicos servicos = new Servicos();

        Usuario usuarioCadastrado = new Usuario("Vicc",
                "vicc.noronha@gmail.com ",
                "234424",
                "ATIVO");

        System.out.println("---------------------------------------");
        System.out.println("-------Plataforma de Cadastro -------");
        System.out.println("Digite o e-mail cadastrado: ");
        String emailUsuario = scanner.nextLine();

        System.out.println("Digite a senha: ");
        String senhaUsuario = scanner.nextLine();

        boolean loginValido = servicos.login(usuarioCadastrado, emailUsuario, senhaUsuario);
        if(loginValido){
            System.out.println("Login realizado com sucesso");
        } else {
            System.out.println("Dados inválidos");
        }


        scanner.close();











    }
}


