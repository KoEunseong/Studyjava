package langPackage;

import java.util.Objects;
import java.util.Random;

public class RandomEx2 {
        public static void main(String[] args) {
            Objects.equals(1, 1);
            System.out.println(new Random().nextInt(100));
            System.out.println(new Random().nextInt(100));

            Random r1 = new Random(100);
            Random r2 = new Random(100);
//		for(int i = 0;i<5;i++) {
            System.out.println(r1.nextInt());
            System.out.println(r2.nextInt());
            //	}

        }
    }

