package br.com.viktor.annotation;
import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Inherited
public @interface ExemploAnotacao {
	String value();
	
	String[] nomes();
	
	RetentionPolicy[] value2();
	
	RetentionPolicy value3();
	
	String nomeDefault() default "";
}

//Anotações (Annotations) Mecanismos para adicionar informações de metadados ao código fonte.

//Annotations usam o @ seguido do nome. 

//Tipos: Anotações Marcadoras, Anotações de valor único, Anotações Completas

//Meta-Anotações -> São anotações utilizadas na criação de anotações. java.lang.annotation; @Retention; @Documented; @Target; @Inherited

//@Retention ->

//@Documented -> Quando for criado o javadoc a Annotation será exibida.

//@Inhertied -> passar a anotação por herança entre Classes // Prof disse ter nunca usado.

//Regras para criação -> 1° Quando há apenas um único parâmentro, o nome dele deverá ser "value",
//2° sobre uso de excessão, 3° O método não deve possuir corpo = método abstratro,  entre outras.....



//Exercício do Módulo. Criar uma annotation "Tabela" ela vai receber um valor que é o nome da tabela. Subir no github