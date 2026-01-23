package Servicos;

import Modelo.Usuario;

import java.util.ArrayList;
import java.util.List;

public class Servicos {

    // Nessa classe vamos fazer as validações do login e senha

    public boolean login(Usuario usuario, String email, String senha) {
        // Verifica se os dados são válidos para autenticar o usuário

        if (!usuario.getEmail().equals(email)) {    // Se o email digitado não for igual ao email cadastrado: login inválido
            return false;
        }
        if (!usuario.getSenha().equals(senha)) {
            return false;
        }
        return usuario.getStatus().equalsIgnoreCase("ATIVO");
    }


    public boolean desativarCadastro(Usuario usuario) {
        //Verifica se é um usuário válido
        if (usuario == null) {
            return false;
        }
        // Verifica se o usuário está ativo
        if (!usuario.getStatus().equalsIgnoreCase("ATIVO")) {
            return false;
        }
        usuario.setStatus("INATIVO"); // Só desativa o cadastro se tiver ativo
        return true;

    }


    private List<String> listadeEmails = new ArrayList<>();

    public String cadastrarNovoUsuario (String email) {

        for (String emailCadastrado : listadeEmails) {
            if (emailCadastrado.equalsIgnoreCase(email)) {
                return " O e-mail já está cadastrado, por favor efetue o login ";
            }
        }

        listadeEmails.add(email);
        return " O usuário cadastrado com sucesso ";
    }


// Método para BuscarUsuários

    public String buscaUsuario (String email) {
        for (String emailSalvo : listadeEmails) {
            if (emailSalvo.equalsIgnoreCase(email)) {
                return "O email já está cadastrado";
            }
        }
        return "Usuário não encontrado";

    }
}












