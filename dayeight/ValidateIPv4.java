package dayeight;

public class ValidateIPv4 {
    public static boolean validateIPv4(String s) { 
        String[] parts = s.split("\\."); 
        if (parts.length != 4)
            return false; 
        for (String part : parts) { 
            if (!part.matches("\\d+"))
                return false; 
            int num = Integer.parseInt(part);
            if (num < 0 || num > 255 || !part.equals(String.valueOf(num))) 
                return false; 
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(validateIPv4("222.111.111.111"));
        System.out.println(validateIPv4("5555..555"));
        System.out.println(validateIPv4("0.0.0.255"));
        System.out.println(validateIPv4("0.0.0.0255"));
    }
}
