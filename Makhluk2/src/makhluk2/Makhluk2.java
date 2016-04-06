/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package makhluk2;

import net.slashie.libjcsi.ConsoleSystemInterface;
import net.slashie.libjcsi.jcurses.JCursesConsoleInterface;
import net.slashie.libjcsi.wswing.WSwingConsoleInterface;

/**
 *
 * @author Ali-pc
 */
public class Makhluk2 {
    public static void main(String[] args) {
        World W = new World();
        W.initDisplay();
        Point P = new Point(15,15);
        ConsoleSystemInterface csi = new WSwingConsoleInterface("wawa");
        
        try {
             
                 csi.cls();
                 csi.print(10, 10, "baaaaaaaa");
                } catch (ExceptionInInitializerError e) {

                } 
                finally {
                    
                }
        System.out.println("wawaw");
    }
}
