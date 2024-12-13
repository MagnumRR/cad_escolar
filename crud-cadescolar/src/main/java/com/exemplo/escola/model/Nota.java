package com.exemplo.escola.model;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Nota {

	  	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	  	private double valor;
	    private LocalDate dataAvaliacao;
	  	
	  	
	    @ManyToOne
	    private Aluno aluno;

	    @ManyToOne
	    private Disciplina disciplina;
	    
	    public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public Aluno getAluno() {
			return aluno;
		}
		public void setAluno(Aluno aluno) {
			this.aluno = aluno;
		}
		public Disciplina getDisciplina() {
			return disciplina;
		}
		public void setDisciplina(Disciplina disciplina) {
			this.disciplina = disciplina;
		}
		public double getValor() {
			return valor;
		}
		public void setValor(double valor) {
			this.valor = valor;
		}
		public LocalDate getDataAvaliacao() {
			return dataAvaliacao;
		}
		public void setDataAvaliacao(LocalDate dataAvaliacao) {
			this.dataAvaliacao = dataAvaliacao;
		}
	   
	
}
