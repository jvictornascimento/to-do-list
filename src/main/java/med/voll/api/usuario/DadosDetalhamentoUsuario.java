package med.voll.api.usuario;

import med.voll.api.domain.usuario.Usuario;

public record DadosDetalhamentoUsuario(String id, String login,String senha) {

    public DadosDetalhamentoUsuario(Usuario usuario){
        this(usuario.getId(),usuario.getLogin(), usuario.getSenha());
    }
}
