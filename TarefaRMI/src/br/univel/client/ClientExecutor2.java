package br.univel.client;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import br.univel.common.ExecutorRMI;

public class ClientExecutor2 {

	protected ExecutorRMI servico;

	public ClientExecutor2() {

		Registry registry;
		try {
			registry = LocateRegistry.getRegistry("127.0.0.1", 1818);
			servico = (ExecutorRMI) registry.lookup(ExecutorRMI.NOME);
			
			System.out.println("Enviado para o server...");
			
			servico.executar(new ListaFib(), 10).forEach(System.out::println);

			System.out.println("Fim.");

		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (NotBoundException e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		new ClientExecutor2();
	}
}
