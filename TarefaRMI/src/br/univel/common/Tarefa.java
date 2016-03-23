package br.univel.common;

public interface Tarefa<P, R> {
	
	/*
	 * Qual o tipo de retorno deste método?
	 * 
	 */
	
	
	public R executar(P p);

}


/*
 * GENERICS
 *  
*/