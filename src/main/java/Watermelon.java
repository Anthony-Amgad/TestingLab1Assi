public class Watermelon {

    public static String watermelon(int w){
        if(w>=1 && w<=100){
            if(w % 2 == 0 && w != 2) return "YES";
            return "NO";
        }
        return null;
    }

}
