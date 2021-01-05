package com.gavilan.sistemanotificacionesdemo.models.repositories;

import com.gavilan.sistemanotificacionesdemo.models.entities.TokenVerificacion;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TokenVerificacionRepository extends CrudRepository<TokenVerificacion, Long> {

    Optional<TokenVerificacion> findByToken(String token);

}
