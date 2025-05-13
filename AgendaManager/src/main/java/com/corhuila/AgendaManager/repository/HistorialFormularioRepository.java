package com.corhuila.AgendaManager.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import com.corhuila.AgendaManager.entity.HistorialFormulario;

@Repository
public interface HistorialFormularioRepository extends JpaRepository<HistorialFormulario, Long> {
    List<HistorialFormulario> findByUsuario(String usuario);
}


