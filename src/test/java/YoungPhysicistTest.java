import static org.junit.Assert.*;
import org.junit.Test;

import java.util.ArrayList;

public class YoungPhysicistTest {

    @Test
    public void ypt(){
       YoungPhysicist yp = new YoungPhysicist();
       Integer[] a = {1,2,3};
       Integer[] b = {2,3,1};
       Integer[] c = {-3,-5,-4};
       Integer[] d = {-3,-5,-200};
       Integer[] e = {5,-6,-7};
       Integer[] f = {5,-6,200};

       ArrayList<Integer[]> main = new ArrayList<Integer[]>();

       main.add(a); main.add(b); main.add(c);
       assertEquals(yp.yp(main),"YES");
       main.clear();
       main.add(a); main.add(b); main.add(e);
       assertEquals(yp.yp(main),"NO");
       main.clear();
       main.add(a); main.add(d); main.add(e);
       assertEquals(yp.yp(main),null);
       main.clear();
       main.add(a); main.add(f); main.add(b);
       assertEquals(yp.yp(main),null);
       main.clear();
       assertEquals(yp.yp(main),null);
       for(int i = 0; i<101; i++) main.add(a);
       assertEquals(yp.yp(main),null);


    }
}