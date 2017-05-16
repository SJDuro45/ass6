/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package as6.model;

import java.util.ArrayList;

/**
 *
 * @author csc190
 */
public class nameList implements java.io.Serializable{
    name[] names;
    public nameList(name[] names){
        this.names = names;
    }
    
    public String getNameID(int id){
        for(int i = 0; i < this.names.length; i++){
            if(this.names[i].id == id){
                return names[i]._name;
            }
        }
        return null;
    }
    
    public ArrayList<Integer> getNameSch(String d, int h){
        ArrayList<Integer> s = new ArrayList<>();
        for(int i=0; i< names.length; i++){
            for(int j=0; j<names[i].sch.d.length; j++){
                if(this.names[i].sch.d[j].equals(d)){
                    for(int k=0; k<names[i].sch.h.length; k++){
                        if (this.names[i].sch.h[k] == h) {
                            s.add(names[i].id);
                        }
                    }
                }
            }
        }
        return s;
    }
    
    public ArrayList<Integer> getnameSkill(String sks){
        ArrayList<Integer> s = new ArrayList<>();
        for(int i=0; i < names.length; i++){
            for(int j=0; j<names[i].sk.length; j++){
                if (names[i].sk[j].equals(sks)){
                    s.add(names[i].id);
                }
            }
        }
        return s;
    }

}