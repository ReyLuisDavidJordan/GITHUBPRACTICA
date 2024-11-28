package Apirest.modelo.dao;

import org.springframework.data.repository.CrudRepository;

import Apirest.modelo.entidad.Usuario;

public interface UsuarioDao extends CrudRepository<Usuario, Long> {

}
