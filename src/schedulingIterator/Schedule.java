/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schedulingIterator;

import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author christian
 */
public class Schedule {
    private TreeSet<Friend> schedule;
    
    public Schedule(){
        schedule = new TreeSet<Friend>();
    }
    
    public void includ(Friend fr){
        schedule.add(fr);
    }
    
    public void showMember(){
        Iterator it = schedule.iterator();
        while(it.hasNext()){
            Friend currentFriend = (Friend) it.next();
            System.out.println(currentFriend.toString());
        }
    }
    
    public void removeMember(int id){
        Iterator it = schedule.iterator();
        while(it.hasNext()){
            Friend currentFriend = (Friend) it.next();
            if(currentFriend.getId() == id)
                it.remove();
        }
    }
    
    public void alterMember(int id, String nome, int mes){
        Iterator it = schedule.iterator();
        while(it.hasNext()){
            Friend fr = (Friend) it.next();
            if(id == fr.getId()){
                fr.setNome(nome);
                fr.setMes(mes);
            }
        }        
    }
    
    public void listSameMonth(int month){
        Iterator it = schedule.iterator();
        while(it.hasNext()){
            Friend fr = (Friend) it.next();
            if(fr.getMes() == month){
                System.out.println(fr.toString());
            }
        }
    }
}
