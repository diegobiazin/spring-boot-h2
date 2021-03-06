package com.diegobiazin.cursomc.repositories;

import com.diegobiazin.cursomc.domain.Estado;
import com.diegobiazin.cursomc.domain.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer> {

}
