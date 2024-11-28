package Apirest.modelo.servicios;

import java.util.List;

import Apirest.modelo.entidad.Usuario;

public interface UsuarioService {

    public List<Usuario> findAll(); 

    public Usuario save(Usuario usuario);

    public Usuario findById(Long id);

    public void delete(Long id); 

    public Usuario update(Usuario usuario, Long id); 
}
