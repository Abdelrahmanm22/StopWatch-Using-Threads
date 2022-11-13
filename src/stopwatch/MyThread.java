/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stopwatch;

/**
 *
 * @author future
 */
public class MyThread extends Thread{
    String name;
    public MyThread(String name){
        this.name =name; 
    }
    
    public void run(){
        for(int i=1;i>0;i++){
            System.out.println(i);
            if(i%100==0){
                try{
                    Thread.sleep(4000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            
            }
        }
    }
}   
