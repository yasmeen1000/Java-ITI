import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;



class MyPanel extends JPanel implements Runnable{


    private int x;

    public MyPanel(){
        this.setBackground(Color.cyan);
        x = 0;
        new Thread(this).start(); 
    }

    @Override  
    public void paintComponent(Graphics g){
     super.paintComponent(g);
     
     g.drawString("Hi Hello",x, 200);
    }

    @Override
    public void run(){
        while (true) {
            try {
                x += 100;

                if (x > getWidth()) {
                    x = 0; 
                }
                this.repaint();
                Thread.sleep(500);
            }
            catch (InterruptedException e) 
            {
              Logger.getLogger(MyPanel.class.getName()).log(Level.SEVERE, null,e);
            }
        }
    }
}
