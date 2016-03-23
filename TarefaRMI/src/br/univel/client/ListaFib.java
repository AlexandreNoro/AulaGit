package br.univel.client;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import br.univel.common.Tarefa;

class ListaFib implements Tarefa<Integer, List<Integer>>, Serializable {
	
	private void add(List<Integer> lista, int a) {
		
		lista.add(a);
		System.out.println("Gerando " + a);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public List<Integer> executar(Integer p) {
		// TODO Auto-generated method stub
		
		List<Integer> lista = new ArrayList<>();
		
		for (int a=0, b=1, i=0; i<p; b+=a, a=b-a, i++) {
			add(lista, a);
		}
		return lista;

	}

}
