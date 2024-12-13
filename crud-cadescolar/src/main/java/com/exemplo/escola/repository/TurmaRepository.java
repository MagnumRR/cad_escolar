package com.exemplo.escola.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.exemplo.escola.model.Turma;

@Repository
public interface TurmaRepository extends JpaRepository <Turma, Long> {

	void deleteById(Long id);

}
