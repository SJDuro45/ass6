/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package as6;

//import com.google.gson.Gson;
import as6.model.name;
import as6.model.schedule;
import as6.model.nameList;
import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.net.URLEncoder;
import java.util.Base64;

/**
 *
 * @author csc190
 */
public class client{
    
    
    protected static nameList buildnameList(){
        // Create schedules
        String[] Evil = {"M", "W", "F"};
        int[] Evil2 = {9, 10, 11, 12, 19, 20}; 
        String[] MiniMe = {"T", "W", "F"};
        int[] MiniMe2 = {9, 10, 12, 14, 15, 16, 17, 18};
        String[] NumberTwo = {"M", "F"};
        int[] NumberTwo2 = {12, 13, 14, 15, 16, 17, 18};
        String[] AustinPower = {"T", "R"};
        int[] AustinPower2 = {8, 9, 10, 11, 12, 13, 14};
        schedule[] arrschedule = new schedule[]{
            new schedule(Evil, Evil2),
            new schedule(MiniMe, MiniMe2),
            new schedule(NumberTwo, NumberTwo2),
            new schedule(AustinPower, AustinPower2)
        };
        
        // Create Skills
        String[] eSK = {"Butcher", "Saucier", "Baker"};
        String[] mSK = {"Saucier", "Baker"};
        String[] tSK = {"Butcher", "Dishwasher"};
        String[] pSK = {"Baker", "Saucier"};
        
        //Create nameloyees
        name[] arrnames = {
            new name(101, "Dr. Evil", eSK, arrschedule[0]),
            new name(102, "Mini Me", mSK, arrschedule[1]),
            new name(103, "Number Two", tSK, arrschedule[2]),
            new name(104, "Austin Powers", pSK, arrschedule[3])
        };
        nameList namelist = new nameList(arrnames);
        return namelist;
    }

    public static void main(String[] args) throws Exception {
        String op = args[0];
 //       System.out.print(args[0]+ " "+args[1]+ " "+args[2] +" "+args[3]);
        //System.out.println(op);
        nameList emps = buildnameList();
        String url = "http://localhost/as6.php";
        String nameContent = Utils.toStr(emps);
        //System.out.println(nameContent);
        String datastr;
        if (op.equals("1")){
            //System.out.println("here1");
            datastr = "op=uploadnames&namelist=" + nameContent;
        } else {
            //System.out.println("here2");
            datastr = "op=getAvailnames&skill="+args[1]+"&day=" +args[2]+"&hour=" +args[3];
            System.out.println("Searching for a: " + args[1] + " Who can work at: " + args[2] + args[3]);
        }   
            

            String response = Utils.httpsPost(url, datastr);
            System.out.println(response);

    }
}