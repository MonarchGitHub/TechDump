import java.util.Scanner;
import javax.swing.*;
import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;

public class alarmMain {

    Timer clock;

    public alarmMain(int sec) {
        clock = new Timer();
        clock.schedule(new runtime(), sec);

    }

    class runtime extends TimerTask {

        public void run() {
            System.out.println("Joke's over, You're dead" + "\n");
            int count=10,limit=100;

            JFrame frame = new JFrame();
            JPanel panel = new JPanel();
            JLabel label = new JLabel("Catch me if you can");
            label.setOpaque(true);
             panel.add(label);
            panel.setBorder(BorderFactory.createEmptyBorder(100,200,100,200));
            panel.setLayout(new GridLayout(1,1));
            frame.add(panel, BorderLayout.CENTER);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setTitle("Sussy Baka");
            frame.pack();
            while (count>0){
                int x = (int)Math.floor(Math.random()*(500+1)+0);
                int y = (int)Math.floor(Math.random()*(500+1)+0);
                frame.setVisible(true);
                frame.setLocation(x, y);
                count--;
                try{

                    Thread.sleep(300);        //Runs after delay
                }catch(InterruptedException ex){
                    break;
                }
                frame.setVisible(false);
                frame.dispose();
            }

            frame.setVisible(true);
            clock.cancel();
        }
    }

    public static void main(String[] args) {
        int seconds=1000;
//        Scanner obj = new Scanner(System.in);
//        System.out.println("Enter Time in seconds"+"\n");
//        seconds = obj.nextInt();
        new alarmMain(seconds);
        System.out.println("Reminder Set for 1 second"+"\n");
        //        Runtime.getRuntime().exec("taskkill /F /PID 827");
    }
}
