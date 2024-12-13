package com.exemplo.escola.model;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.*;


@Entity
public class Professor {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String nome;
	    private String email;
	    private String disciplinaPrincipal;

	    @OneToMany(mappedBy = "professor", cascade = CascadeType.ALL)
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

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getDisciplinaPrincipal() {
			return disciplinaPrincipal;
		}

		public void setDisciplinaPrincipal(String disciplinaPrincipal) {
			this.disciplinaPrincipal = disciplinaPrincipal;
		}

		public List<Disciplina> getDisciplinas() {
			return disciplinas;
		}

		public void setDisciplinas(List<Disciplina> disciplinas) {
			this.disciplinas = disciplinas;
		}

	    	
	
}
