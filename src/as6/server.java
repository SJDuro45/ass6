/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package as6;

import as6.model.nameList;
import java.util.ArrayList;
/**
 *
 * @author csc190
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class server{
    protected static void updateName(String val){
        try{
        String qry = "UPDATE employees SET namelist='" + val +"' WHERE name='name'";
        Utils.execNonQuery(qry);
        System.out.println("Uploaded!");
        }catch(Exception e){
            System.out.println(e);
        }
    }

    protected static String getAvailNames(String skill, String day, String hour){
        //1. retrieve all names
        String qry = "SELECT emplist FROM employees WHERE name='name'";
        String empObjStr = Utils.execQuery(qry);
        
        //String day = time.substring(0,1);
        int time = Integer.parseInt(hour);
        if(empObjStr==null) return "Failure 1";
        nameList names = (nameList) Utils.toObj(empObjStr);
        if(names==null) return "Failure 2";
        ArrayList<Integer> nSk = names.getnameSkill(skill);
        ArrayList<Integer> nSch = names.getNameSch(day, time);
        
        // Search for employees that match the skill and availablity
        String list = "";
        for (int i=0; i<nSk.size(); i++){
            for(int j=0; j<nSch.size(); j++){
                if (nSk.get(i).equals(nSch.get(j))){
                    //availNames.add(nSch.get(j));
                    list = names.getNameID(nSch.get(j));
                    System.out.println(list);
                }
            }
            
        }
        
        
        return "";
    }
    public static void main(String [] args){
        String op = args[0];
        if(op.equals("uploadNames")){
            updateName(args[1]);
        }else{
            String available = getAvailNames(args[1], args[2], args[3]);
            System.out.println(available);
        }
    }
}
