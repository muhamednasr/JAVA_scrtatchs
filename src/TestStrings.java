
import javax.swing.JOptionPane;


class TestStrings {
    public static void main(String[] args) {
        
 
    String nam = JOptionPane.showInputDialog("plz enter your name ");
        System.out.println(nam.length());
        System.out.println(nam.toUpperCase());
        System.out.println(nam.toLowerCase());
        System.out.println(nam.charAt(3));
        System.out.println(nam.indexOf("sr"));
        System.out.println(nam.contains("asR"));
        System.out.println(nam.concat(" NASR"));
        System.out.println(nam.replace("sR", "sr"));
        
}
}