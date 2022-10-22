/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maquina.expendedora;
import static java.lang.Thread.sleep;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import javax.swing.JTextArea;

/**
 *
 * @author JoeL
 */
public class Publicidad extends Thread
{
  public  String CAD;
    Thread hilo;

    @Override
    
    public void run()
    {
     
       if(hilo!=null)
       {
            System.out.println("");
            int band=1;
            SimpleDateFormat formateador = new SimpleDateFormat(
            "dd 'de' MMMM 'de' yyyy", new Locale("ES"));
            Date fechaDate = new Date();
            
            //---------------------------------------------------------
            Calendar calendario = new GregorianCalendar();
            int hora, minutos, segundos;
            hora =calendario.get(Calendar.HOUR_OF_DAY);
            minutos = calendario.get(Calendar.MINUTE);
            segundos = calendario.get(Calendar.SECOND);
            //---------------------------------------------------------
            String cad="¡Destapa tu Felicidad con Coca-Cola!";
            String cad1="¡Rompe la Rutina... Prueba Pepsi!";
            String cad2="¡Las cosas como son...Toma Sprite!";
            String cad4="¡Mas Fanta, Mas Diversión, Donde Tú Quieras!";
            String cad3=hora + ":" + minutos + ":" + segundos;
            
            String fecha = formateador.format(fechaDate)+" "+cad3;
            while(band==1)
            {
                System.out.println(fecha);
                System.out.println(cad);
                this.CAD=cad;
                System.out.println(cad1);
                System.out.println(cad2);
                System.out.println(cad3);
                System.out.println(cad4);
//                repet(cad);
//                repet(cad1);
//                repet(cad2);
//                repet(cad4);
            }
            
       }
    } 
    public void tiempo()
    {
        try 
        {
            sleep(175);
        } catch (InterruptedException e)
        {
            System.out.println("Interrupcion hilo ");
        } 
    }
    public void repet(String cadena)
    {
        for (int i = 0; i<cadena.length(); i++) 
        {
            System.out.println(cadena.charAt(i)+"");
            tiempo();
        }
        System.out.println("");
    }
}
