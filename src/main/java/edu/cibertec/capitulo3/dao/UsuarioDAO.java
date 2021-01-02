package edu.cibertec.capitulo3.dao;

import edu.cibertec.capitulo3.entity.UsuarioEntity;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class UsuarioDAO {

    private static List<UsuarioEntity> listaUsuarios;
    
    static {
        listaUsuarios = new ArrayList<>();
        listaUsuarios.add(new UsuarioEntity("jose", "12345", "Jose Perez"));
        listaUsuarios.add(new UsuarioEntity("maria", "54321", "maria Gonzales"));
    }
    
    public void insertaUsuario(UsuarioEntity ue)
    {
        listaUsuarios.add(ue);
    }
    
    public List<UsuarioEntity> getListaUsuarios(){
        return listaUsuarios;
    }
   
    
    public UsuarioEntity validarLogin(UsuarioEntity usuario)
    {
        if (usuario.getUsuario().equalsIgnoreCase("user") &&
                usuario.getClave().equals("12345"))
            usuario.setNombreCompleto("Nombre completo del usuario");
        else
            usuario = null;
            
        return usuario;
    }
    
}
