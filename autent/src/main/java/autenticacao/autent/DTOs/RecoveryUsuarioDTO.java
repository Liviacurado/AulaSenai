package autenticacao.autent.DTOs;

import java.util.List;

import autenticacao.autent.Model.RulesModel;

public record RecoveryUsuarioDTO(
Long id,
String email,
List<RulesModel> rules
) {

}
