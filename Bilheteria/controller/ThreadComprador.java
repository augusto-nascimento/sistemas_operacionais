/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bilheteria.controller;

import Threads.controller.Ingresso;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author augusto
 */
public class ThreadComprador extends Thread{
    private int idComprador;
    private Semaphore semaforo;
    public ThreadComprador(int idComprador, Semaphore semaforo) {
                    this.idComprador = idComprador;
                    this.semaforo = semaforo;
    }
    @Override
    public void run(){
        int tempoLogin = 0, qtdIngressos = 0;
        try {
            tempoLogin = login();
        } catch (InterruptedException ex) {
            Logger.getLogger(ThreadComprador.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (tempoLogin>1000) {
            System.out.println("TimeOut login para comprador: " + this.idComprador
                                + " Tempo:" + tempoLogin);
        } else {
            try {
                qtdIngressos = compra();
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadComprador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (qtdIngressos>0) {
            try {
                    semaforo.acquire();
                    efetuaCompra(qtdIngressos);
            } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
            } finally {
                    semaforo.release();
            }        
            
        }       
    }
    public int login() throws InterruptedException{
        int tempoLogin = (int) (Math.random() * 1950) + 50;
        Thread.sleep(tempoLogin);
        return tempoLogin;
    }
    public int compra() throws InterruptedException {
        int qtdIngressos = (int) (Math.random() * 4 ) + 1;
        int tempoCompra = (int) (Math.random() * 2000) + 1000;
        Thread.sleep(tempoCompra);
        if (tempoCompra>2500) {
            System.out.println("TimeOut compra para comprador: " + this.idComprador
                                + " Tempo:" + tempoCompra);           
          return -1;
        } else {
          return qtdIngressos;
        }
    }
    public void efetuaCompra(int qtdIngressos) {
        int qtd = Ingresso.qtd - qtdIngressos;
        
        if (qtd >= 0) {
            Ingresso.qtd = qtd;
            System.out.println("comprador " + this.idComprador
                                + " comprou " + qtdIngressos + " ingressos"
                                + " restam " + Ingresso.qtd + " ingressos");
            
        } else {
            System.out.println("comprador " + this.idComprador
                                + " não comprou " + qtdIngressos + " ingressos"
                                + " havia somente " + Ingresso.qtd + " ingressos");
        }
    }
}
