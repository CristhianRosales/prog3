import java.awt.Dimension;
import java.util.Timer;
import java.util.TimerTask;


public class Metodos  extends javax.swing.JLabel {   
    private Timer tiempo ;
    private TimerTask task;
    private static int speed = 60;
    private int frame=1;
    boolean run = false;
    private int im;
    
    public Metodos(Dimension d){        
        this.setSize(d);
    }  
    
    public void setimage(int n){ 
        int b = ((int)(Math.random()*9)+1);
        this.setIcon(new javax.swing.ImageIcon(getClass().getResource("/figuras/figura" + b + ".png"))); 
        setim(b);
    }
    
    public static void setvelocidad(int v){
        Metodos.speed= v;        
    }
    
    public void startAnimation() {    
           run=true;
           tiempo = new Timer();
           task = new TimerTask() {               
               public void run() {
                   frame++;                   
                   if (frame<=9){
                        setimage(frame);
                   }
                   else{frame=1;}
               }
           };                                             
           tiempo.schedule(task,0,speed); 
    }
    
    public void stopAnimation() {        
        tiempo.cancel();
        task.cancel();
        run=false;                                            
    }

    public void setim(int a) {
        this.im = a;
    }
    
    public int getIm() {
        return im;
    }
}


