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
public class Pai extends Avo {

    @Override
    public int m1() {
        return 1;
    }

    @Override
    public void m2() {
        super.m2();
        System.out.println("Pai. m2 ");
    }

    public void m4(int i) {
        super.m4();
        System.out.println("Pai m4 ");
    }
}
