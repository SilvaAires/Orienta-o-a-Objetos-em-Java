package Main;

import java.time.LocalDate;

import Entidades.Bootcamp;
import Entidades.Curso;
import Entidades.Dev;
import Entidades.Mentoria;

public class Main {
	public static void main(String[] args) {
		Curso c = new Curso();
		c.setCargaHorario(123);
		c.setDescricao("d");
		c.setTitulo("b");
		Curso c1 = new Curso();
		c1.setCargaHorario(1231);
		c1.setDescricao("d1");
		c1.setTitulo("b1");
		Curso c2 = new Curso();
		c2.setCargaHorario(1232);
		c2.setDescricao("d2");
		c2.setTitulo("b2");
		
		Mentoria me = new Mentoria();
		me.setData("Dia");
		me.setDescricao("a");
		me.setTitulo("c");
		
		Bootcamp bo = new Bootcamp();
		bo.setNome("ds");
		bo.setDescricao("er");
		bo.getCont().add(c);
		bo.getCont().add(c1);
		bo.getCont().add(c2);
		bo.getCont().add(me);
		
		Dev de = new Dev();
		de.setNome("reoker");
		de.inscreverBootcamp(bo);
		System.out.println(de.getConInscritos());
		de.progredir();
		System.out.println(de.getConConcluidos());
		
		Dev de3 = new Dev();
		de3.setNome("rfsdad");
		de3.inscreverBootcamp(bo);
		System.out.println(de3.getConInscritos());
		de.progredir();
		System.out.println(de3.getConConcluidos());
	}
}
