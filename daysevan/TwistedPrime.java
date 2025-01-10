package daysevan;

public class TwistedPrime {
    public static String isTwistedPrime(int number){
        if(number==2||number==3||number==5||number==7||number%2!=0&&
        number%3!=0&&number%5!=0&&number%7!=0){
            StringBuilder builder= new StringBuilder();
            builder.append(number);
            int reversed = Integer.parseInt(builder.reverse().toString());
            if(reversed==2||reversed==3||reversed==5||reversed==7||reversed%2!=0&&
            reversed%3!=0&&reversed%5!=0&&reversed%7!=0)
                return number+" Its a twisted prime";
        }
        return number+" Its not twisted prime";
    }
    public static void main(String[] args) {
        System.out.println(isTwistedPrime(199));
    }
}
