/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package as6.model;

/**
 *
 * @author csc190
 */
public class schedule implements java.io.Serializable{
    protected String[] d;
    protected int[] h;
    public schedule(String[] d, int[] h){
        this.d = d;
        this.h = h;
    }
}
