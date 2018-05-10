package application.data.mapping;
// Generated 09/05/2018 23:15:18 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Perfil generated by hbm2java
 */
public class Perfil  implements java.io.Serializable {


     private int id;
     private String nome;
     private Set perfilusuarios = new HashSet(0);

    public Perfil() {
    }

	
    public Perfil(int id) {
        this.id = id;
    }
    public Perfil(int id, String nome, Set perfilusuarios) {
       this.id = id;
       this.nome = nome;
       this.perfilusuarios = perfilusuarios;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Set getPerfilusuarios() {
        return this.perfilusuarios;
    }
    
    public void setPerfilusuarios(Set perfilusuarios) {
        this.perfilusuarios = perfilusuarios;
    }




}


