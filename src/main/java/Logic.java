/**
 * Created by Admin on 02.11.2019.
 */
public class Logic {
    public static void main (String args []){
        boolean dc= false;
        System.out.println("dc= " + dc);
        System.out.println("!dc=" + !dc);
        boolean marvel= true;
        System.out.println("dc || marvel"+(dc||marvel));
        System.out.println("dc && marvel " + (dc && marvel));
        System.out.println("dc==marvel "+ (dc==marvel));
        System.out.println("dc==marvel || dc && !marvel " + (dc==(marvel|| dc) && !marvel));
    }
}
