package autenticacao.autent.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import autenticacao.autent.Model.UsuarioModel;



public interface UsuarioRepository extends JpaRepository<UsuarioModel, Long> {

      Optional<UsuarioModel> findByEmail(String email);
}
