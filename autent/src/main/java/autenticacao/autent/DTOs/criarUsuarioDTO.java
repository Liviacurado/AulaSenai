package autenticacao.autent.DTOs;

import autenticacao.autent.Enum.RulesEnum;

public record criarUsuarioDTO(

    String email,
    String password,
    RulesEnum rules
) {

}
