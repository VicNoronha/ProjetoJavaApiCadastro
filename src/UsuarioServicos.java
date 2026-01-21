import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class UsuarioServicos {
    // Nessa classe vamos fazer as validações do login e senha

    public boolean login(Usuario usuario, String email, String senha) {
        // Verifica se os dados são válidos para autenticar o usuário

        if (!usuario.getEmail().equals(email)) {    // Se o email digitado não for igual ao email cadastrado: login inválido
            return false;
        }
        if (!usuario.getSenha().equals(senha)) {
            return false;
        }
        return !usuario.getStatus().equalsIgnoreCase("ATIVO"); //Simplificado pela IDE
    }


    public boolean DesativarCadastro(Usuario usuario) { // Método para Desativar Cadastro de usuários
        //Verifica se é um usuário válido
        if (usuario == null) {
            return false;
        }
        // Verifica se o usuário está ativo
        if (!usuario.getStatus().equalsIgnoreCase("ATIVO")) {
            return false;
        }
        usuario.setStatus("INATIVO");
        return true;

    }


    List<String> ListadeEmails = new ArrayList<>(); // Lista de emails

    public String CadastrarNovoUsuario(String nome, String email, String dataNascimento) { // Método para Cadastrar novos usuários no sistema

        for (String emailCadastrado : ListadeEmails) { // For verifica a lista de e-mails
            if (emailCadastrado.equalsIgnoreCase(email)) {
                return " O e-mail já está cadastrado, por favor efetue o login ";
            }
        }

        ListadeEmails.add(email); // Add o e-mail novo na lista de cadastro
        return " O usuário cadastrado com sucesso ";
    }
}