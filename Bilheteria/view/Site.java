/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bilheteria.view;

import Bilheteria.controller.ThreadComprador;
import Threads.controller.Ingresso;
import java.util.concurrent.Semaphore;

/**
 *
 * @author augusto
 */
public class Site {
    public static void main(String[] args) {
        Ingresso.qtd = 100;
        Semaphore semaforo = new Semaphore(1);
        for (int idComprador = 0; idComprador < 300; idComprador++) {
            Thread tComprador = new ThreadComprador(idComprador,semaforo);
            tComprador.start();
        }
    }
}