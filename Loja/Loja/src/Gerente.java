public class Gerente extends Funcionario {
private String usuário;
private String departamento;

public Gerente(String usuário, String departamento) {
    this.usuário = usuário;
    this.departamento = departamento;
}
public String getUsuário() {
    return usuário;
}
public void setUsuário(String usuário) {
    this.usuário = usuário;
}
public String getDepartamento() {
    return departamento;
}
public void setDepartamento(String departamento) {
    this.departamento = departamento;
}
public String realizarReuniao (boolean realizou ){
    if (realizou == true )
    return "Reunião realizada com sucesso !!";
    else 
    return "Reunião não realizada";
}

}
