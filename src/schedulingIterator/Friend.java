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
public class Friend implements Comparable<Friend>{
    private int id;
    private String nome;
    private int mes;

    public Friend(int id, String nome, int mes) {
        this.id = id;
        this.nome = nome;
        this.mes = mes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }
    
    @Override
    public String toString(){
        return "Nome:" + getNome() + " Aniversario " + getMes();
    }
    
    @Override
    public int compareTo(Friend fr){
        return id-fr.id;
    }
}
