package com.exemplo.escola.model;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.ManyToMany;
import javax.persistence.*;


@Entity
public class Turma {

	 	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String nome;
	    private int ano;

	    @OneToMany(mappedBy = "turma", cascade = CascadeType.ALL)
	    private List<Aluno> alunos;

	    @ManyToMany
	    @JoinTable(
	        name = "turma_disciplina",
	        joinColumns = @JoinColumn(name = "turma_id"),
	        inverseJoinColumns = @JoinColumn(name = "disciplina_id")
	    )
	    private List<Disciplina> disciplinas;

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

		public int getAno() {
			return ano;
		}

		public void setAno(int ano) {
			this.ano = ano;
		}

		public List<Aluno> getAlunos() {
			return alunos;
		}

		public void setAlunos(List<Aluno> alunos) {
			this.alunos = alunos;
		}

		public List<Disciplina> getDisciplinas() {
			return disciplinas;
		}

		public void setDisciplinas(List<Disciplina> disciplinas) {
			this.disciplinas = disciplinas;
		}
	
	
}
