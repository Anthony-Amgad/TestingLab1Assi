import java.util.ArrayList;

public class YoungPhysicist {

    public static String yp(ArrayList<Integer[]> arr){
        int x = 0; int y = 0; int z = 0;
        if(arr.size()<1 || arr.size()>100) return null;
        for(int i = 0; i < arr.size(); i++){
            if(arr.get(i)[0]<-100 || arr.get(i)[1]<-100 || arr.get(i)[2]<-100 || arr.get(i)[0]>100 || arr.get(i)[1]>100 || arr.get(i)[2]>100) return null;
            x += arr.get(i)[0];
            y += arr.get(i)[1];
            z += arr.get(i)[2];
        }

        if(x==0&&y==0&&z==0) return "YES";
        return "NO";

    }

}
