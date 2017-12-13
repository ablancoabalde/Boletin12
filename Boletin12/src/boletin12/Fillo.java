/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin12;

/**
 *
 * @author ablancoabalde
 */
public class Fillo extends Pai {

    @Override
    public int m1() {
        return super.m1();
    }

    @Override
    public void m2() {
        super.m2();
        System.out.println("Avó m2 ");
    }

    public void m3() {
        super.m3();
        System.out.println(" Fillo.m3 ");
    }
}
