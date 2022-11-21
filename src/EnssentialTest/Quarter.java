package EnssentialTest;

public class Quarter {
    public String quarter(int month){
        return (month%3 == 0 ? month/3 : month/3 +1) + "분기";
    }

}
