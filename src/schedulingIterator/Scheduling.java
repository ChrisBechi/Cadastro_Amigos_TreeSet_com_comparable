/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schedulingIterator;

/**
 *
 * @author christian
 */
public class Scheduling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Schedule sc = new Schedule();
        sc.includ(new Friend(1, "Augusto", 2));
        sc.includ(new Friend(2, "Fernando", 8));
        sc.includ(new Friend(3, "George", 3));
        sc.includ(new Friend(4, "Kelvin", 3));
        sc.listSameMonth(3);
        sc.alterMember(3,"Pamela",6);
        System.out.println("--------------------------------");
        sc.showMember();
    }
    
}
