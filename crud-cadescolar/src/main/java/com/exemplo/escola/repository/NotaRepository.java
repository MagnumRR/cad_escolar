package com.exemplo.escola.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.exemplo.escola.model.Nota;


@Repository
public interface NotaRepository extends JpaRepository <Nota, Long> {

	void deleteById(Long id);

}
