package view;

import java.util.concurrent.Semaphore;

import controller.ThreadCar;

/**
 * 
 * @author Augusto Rocha Nascimento
 *	10 carros vêm de lugares distintos, distantes de 1 a 3 km, 
 *	com velocidades entre 10 a 15 m por 30ms 
 *	Se encontram em um estacionamento com 3 vagas.
 *	Levam de 0,5 a 3 segundos na vaga e saem. Os que encontrarem vaga,
 *	devem parar, se estiver lotado, aguardar em fila por ordem de chegada 
 */
public class CarPark {
	public static void main(String[] args) {
		int permissoes = 3;
		Semaphore semaforo = new Semaphore(permissoes);
		for (int idCar = 0 ; idCar < 10 ; idCar++) {
			Thread tCar = new ThreadCar(idCar, semaforo);
			tCar.start();
		}
	}
}
