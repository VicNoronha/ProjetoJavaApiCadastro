import Modelo.Usuario;
import Servicos.Servicos;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        System.out.println("----------------------------------------------");
        System.out.println("-------Plataforma de cadastro --------");
        System.out.println("Digite o seu e-mail cadastrado");
        Scanner scanner = new Scanner(System.in);
        String emailUsuario = scanner.nextLine();
        System.out.println("Digite a senha ");
        int senha = scanner.nextInt();


        Servicos login = new Servicos();
        login.cadastrarNovoUsuario(emailUsuario + senha );
        System.out.println(emailUsuario);

        Servicos desativarCadastro = new Servicos();
        desativarCadastro.buscaUsuario("usuari2@gmail.com");
        desativarCadastro.buscaUsuario("usuario2@gmail.com");
       // System.out.println(desativarCadastro);

    }
}


