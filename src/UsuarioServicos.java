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

    public boolean DesativarCadastro(Usuario usuario) {
        //Verifica se é um usuário válido
        if (usuario == null){
            return false;
        }
        // Verifica se o usuário está ativo
        if (!usuario.getStatus().equalsIgnoreCase("ATIVO")) {
            return false;
        }
        usuario.setStatus("INATIVO");
        return true;

        }
    }




