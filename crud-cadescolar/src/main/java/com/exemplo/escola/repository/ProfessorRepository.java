package com.exemplo.escola.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.exemplo.escola.model.Professor;

@Repository
public interface ProfessorRepository extends JpaRepository <Professor, Long> {

	void deleteById(Long id);

}
