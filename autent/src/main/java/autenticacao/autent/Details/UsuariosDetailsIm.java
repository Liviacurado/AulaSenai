package autenticacao.autent.Details;

import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.Collector;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import autenticacao.autent.Model.UsuarioModel;
import lombok.Getter;

@Getter
public class UsuariosDetailsIm implements UserDetails{

    private UsuarioModel user;


    public UsuariosDetailsIm(UsuarioModel user){
        this.user= user;

    }



    @Override 
    public Collection <? extends GrantedAuthority> getAuthorities(){
        return user.getRules().stream().map(rules -> new SimpleGrantedAuthority(rules.getTipo().tipo())).collect(Collectors.toList());
    }
            @Override
            public String getPassword(){
               return user.getPassword();
             }
             @Override
              public String getUsername(){
                return user.getEmail();

                }
              @Override
               public boolean isAccountNonExpired(){
                 return true;
                   }
                  @Override
                 public boolean isAccountNonLocked(){
                 return true;
                        }

                     @Override
                      public boolean isCredentialsNonExpired(){
                       return true;
                            }
                       @Override
                          public boolean isEnabled(){
                           return true;
                               }


           
}
