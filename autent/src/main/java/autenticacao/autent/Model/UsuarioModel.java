package autenticacao.autent.Model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity(name = "Usuário")
@Table(name ="Usuários")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter

public class UsuarioModel {
    @Id
       @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;

        @Column(unique = true )
        private String email;

        private String password;

        @ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.PERSIST)
          @JoinTable(name = "Usuário_Rules", joinColumns=@JoinColumn(name ="usuario_id"), inverseJoinColumns=@JoinColumn(name="Rules_id"))
           private List<RulesModel> rules; 

           

}
