/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist_class;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author joaojrmachado
 */
public class Class_8_Oct {

    public static void main(String[] args) {
        List<String> person_name = new ArrayList<String>();
        
        // inserindo pessoas
        person_name.add("Didi");
        person_name.add("Dedé");
        person_name.add("Mussum");
        person_name.add("Zacarias");
        person_name.add("Mussum");
        
        // printando o Arraylist
        System.out.println("\n\t Primeiro método de print:");
        for (int i = 0; i < person_name.size(); i++) {
            System.out.println(person_name.get(i));
        }
        
        // removendo pelo indice/nome
        person_name.remove(3);
        person_name.remove("Mussum");
        
        //outro for para printar o Arraylist
        System.out.println("\n\t Segundo método de print:");
        for (String s : person_name) {
            System.out.println(s);
        }
        
        //trocando a pessoa nome = Didi para Beto Carrero
        int idx = person_name.indexOf("Mussum");
        System.out.println(idx);
        person_name.set(3, "Beto Carrero");
        
        System.out.println("\n\t Terceiro método de print:");
        Iterator it = person_name.iterator();
        while(it.hasNext()){
            System.out.println(" "+it.next());
        }
        
    }     
}
