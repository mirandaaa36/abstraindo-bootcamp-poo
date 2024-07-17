package desafio_POO_bootcamp;

import java.time.LocalDate;

public class Main {
	
	public static void main(String[] args) {
		
		Curso python = new Curso();
		Mentoria carreira = new Mentoria();
		
		//System.out.println(python);
		//System.out.println(carreira);
		
		python.setTitulo("Python para iniciantes");
		python.setDescricao("Sintaxe básica");
		python.setCargaHoraria(10);
		
		//System.out.println(python);
		
		carreira.setData(LocalDate.now());
		carreira.setDescricao("BlaBlaBla");
		carreira.setTitulo("Tech Talk");
		
		//System.out.println(carreira);
		
		// Conteudo conteudo = new Curso();
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição Bootcamp Java Dev");
		bootcamp.getConteudos().add(python);
		bootcamp.getConteudos().add(carreira);
		
		Dev devMatheus = new Dev();
		devMatheus.setNome("Matheus");
		devMatheus.inscreverBootcamp(bootcamp);
		devMatheus.progredir();
		devMatheus.progredir();
		System.out.println("Conteúdo Inscritos Matheus: " + devMatheus.getConteudosInscritos());
		System.out.println("Conteúdo Concluídos Matheus: " + devMatheus.getConteudosConcluidos());
		System.out.println("XP Acumulada: " + devMatheus.calcularXP());
		
		Dev devJoao = new Dev();
		devJoao.setNome("João");
		devJoao.inscreverBootcamp(bootcamp);
		devJoao.progredir();
		System.out.println("Conteúdo Inscritos João: " + devJoao.getConteudosInscritos());
		System.out.println("Conteúdo Concluídos João: " + devJoao.getConteudosConcluidos());
		System.out.println("XP Acumulada: " + devJoao.calcularXP());
		
		
		
		
		
		
		
	}

}
