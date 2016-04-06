/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package makhluk2;

import java.util.HashSet;
import java.util.Set;
import net.slashie.libjcsi.ConsoleSystemInterface;
import net.slashie.libjcsi.jcurses.JCursesConsoleInterface;
import net.slashie.libjcsi.wswing.WSwingConsoleInterface;

/**
 *
 * @author Ali-pc
 */
public class Makhluk2 {
    public static void main(String[] args) {
        Point P = new Point(15,15);
         Point P1 = new Point(5,18);
    Polisi m1 = new Polisi(P1);
    Point P2 = new Point(2,20);
    Karnivora m2 = new Karnivora();
    Factory.makeHyena(m2);
    m2.setPosisi(P2);
        
    Point P5 = new Point(20,18);
    Pemburu m3 = new Pemburu(P5);
    Point P4 = new Point(15,29);
    Herbivora m4 = new Herbivora();
    Factory.makeGajah(m4);
    m4.setPosisi(P4);
    Point P9 = new Point(13,18);

    World W = new World();
    W.fillDaftar(m1);
    W.fillDaftar(m3);
    W.fillDaftar(m2);
    W.fillDaftar(m4);

    Point P3 = new Point(0,31);

    W.initDisplay();
    try {
        Thread.sleep(2000);
    } catch (Exception e) {
        
    } finally {
        
    }

    W.initDraw(m1);
    W.initDraw(m2);
    W.initDraw(m3);
    W.initDraw(m4);

    W.setCount(0);
    while(!W.isGameOver())
    {

        W.sinyal();

        for (int i = 0; i < W.get_count(); i++)
        {
            //if(W.get_daftar(i) != NULL)
                W.hidup(W.get_daftar(i));
        }
        for (int i = 0; i < W.get_count(); i++)
        {
            //if(W.get_daftar(i) != NULL)
                W.aging(W.get_daftar(i));
        }

        
        W.updateDisplay();
        W.setCount(W.getCount()+1);
        try{
            Thread.sleep(100);
            
        } catch (Exception e) {
            
        } finally {
            
        }
    }

    W.draw(P3, '.');
    
    W.draw(P3, '.');
        try {
            //sW.initDisplay();
            
        } catch (Exception e) {
            
        } finally {
            
        }
    }
}
