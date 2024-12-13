package com.exemplo.escola.model;

import java.time.LocalDate;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.ManyToOne;
import javax.persistence.*;

@Entity
public class Aluno {
	
	 	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String nome;
	    private String matricula;
	    private String email;
	    private LocalDate dataNascimento;

	    @ManyToOne
	    private Turma turma;

	    @OneToMany(mappedBy = "aluno", cascade = CascadeType.ALL)
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

	      public String getMatricula() {
	            return matricula;
	      }

	      public void setMatricula(String matricula) {
	            this.matricula = matricula;
	      }

	      public String getEmail() {
	            return email;
	      }

	      public void setEmail(String email) {
	            this.email = email;
	      }

	      public LocalDate getDataNasc() {
	            return dataNascimento;
	      }

	      
	      public void setDataNasc(LocalDate dataNascimento) {
	            this.dataNascimento = dataNascimento;
	      }

	      
	      public List<Nota> getNota() {
	            return notas;	      
	      }

	      
	      public void setCompras(List<Nota> notas) {
	            this.notas = notas;
	      }
	
	
}
