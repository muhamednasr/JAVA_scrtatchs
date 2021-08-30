
import javax.swing.JOptionPane;

public class TaskStrings {
    
     public static void main(String[] args) {
   String s = JOptionPane.showInputDialog("enter your mail");
   int atindex = s.indexOf("@");
   int comindex = s.indexOf(".com");
    if(s.contains("@"))
    {
        System.out.println("ooooooooooook");
                }
    else
             System.out.println("noooooooo include || @ ||");
    if(s.contains(".com")){
        System.out.println("oooooooooooook");}
    else
             System.out.println("nooooo include || .com ||");
    
         
   if(atindex != 0 && atindex<comindex){ System.out.println("ok");}
   else {
       System.out.println("wrong mail ");}
}
    
}
