package br.univel.common;

public interface Tarefa<P, R> {
	
	/*
	 * Qual o tipo de retorno deste m�todo?
	 * 
	 */
	
	
	public R executar(P p);

}


/*
 * GENERICS
 *  
*/