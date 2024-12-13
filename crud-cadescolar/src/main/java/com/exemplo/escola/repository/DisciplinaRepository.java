package com.exemplo.escola.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.exemplo.escola.model.Disciplina;

@Repository
public interface DisciplinaRepository extends JpaRepository <Disciplina, Long> {

	void deleteById(Long id);
	
}
