import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;



class MyPanel extends JPanel implements Runnable{

    public MyPanel(){
        this.setBackground(Color.magenta);
        new Thread(this).start();
        
    }

    @Override  
    public void paintComponent(Graphics g)
    {
     super.paintComponent(g);
     g.drawString(new Date().toLocaleString(), 180, 200);
    }
    
    @Override
    public void run(){
        while (true) {
            try 
            {
                this.repaint();
                Thread.sleep(1000);
            } 
            catch (InterruptedException e) 
            {
              Logger.getLogger(MyPanel.class.getName()).log(Level.SEVERE, null,e);
            }
        }
    }
}

