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
public class name implements java.io.Serializable{
    protected int id;
    protected String _name;
    protected String[] sk;
    protected schedule sch;
    public name(int id, String _name, String[] sk, schedule sch){
        this.id = id;
        this._name = _name;
        this.sk = sk;
        this.sch = sch;
    }
}


