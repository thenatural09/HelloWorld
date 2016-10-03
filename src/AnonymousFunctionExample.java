import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * Created by Troy on 10/3/16.
 */
public class AnonymousFunctionExample {
    public static void main(String[] args) {
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from anonymous class");
            }
        };

        r1.run();

        Runnable r2 = () -> {
            System.out.println("from really weird place");
        };

        r2.run();
    }
}
