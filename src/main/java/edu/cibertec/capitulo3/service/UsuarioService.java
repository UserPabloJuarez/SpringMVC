package edu.cibertec.capitulo3.service;

import edu.cibertec.capitulo3.dao.UsuarioDAO;
import edu.cibertec.capitulo3.entity.UsuarioEntity;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    
    @Autowired
    private UsuarioDAO usuarioDAO;
    
    public UsuarioEntity validarLogin(UsuarioEntity usuario){
        return usuarioDAO.validarLogin(usuario);
    }
    
    public void insertaUsuario(UsuarioEntity ue)
    {
        usuarioDAO.insertaUsuario(ue);
    }
    
    public List<UsuarioEntity> getListaUsuarios(){
        return usuarioDAO.getListaUsuarios();
    }
    
}
