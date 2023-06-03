package startAgain;

public class SecondWind {

    private SecondWind(){}

    String name = "Sharif u Kabir";

    public static SecondWind objAccess(){
        SecondWind secondwind = new SecondWind();
        return secondwind;
    }
    public static void main(String[] args) {
        System.out.println("hi");
        SecondWind secondwind=objAccess();

    }
}
