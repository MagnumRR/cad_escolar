package com.exemplo.escola.model;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.ManyToOne;
import javax.persistence.*;

@Entity
public class Disciplina {

	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String nome;
	    private int cargaHoraria;

	    @ManyToOne
	    private Professor professor;

	    @ManyToMany(mappedBy = "disciplinas")
	    private List<Turma> turmas;

	    @OneToMany(mappedBy = "disciplina", cascade = CascadeType.ALL)
	    private List<Nota> notas;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public int getCargaHoraria() {
			return cargaHoraria;
		}

		public void setCargaHoraria(int cargaHoraria) {
			this.cargaHoraria = cargaHoraria;
		}

		public List<Turma> getTurmas() {
			return turmas;
		}

		public void setTurmas(List<Turma> turmas) {
			this.turmas = turmas;
		}

		public List<Nota> getNotas() {
			return notas;
		}

		public void setNotas(List<Nota> notas) {
			this.notas = notas;
		}
	    
	
}
