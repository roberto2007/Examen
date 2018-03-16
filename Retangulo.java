package retangulo;
import javax.swing.*;
public class Retangulo 
{
JTextArea texto;
JScrollPane barra;
private double ancho;
private double longitud;
double area, perimetro;

public Retangulo()
        {
         texto=new JTextArea(20,40);
         barra=new JScrollPane(texto); 
         ancho=1;
         longitud=1;
        }
public void recibe_datos()
{
    ancho=Double.parseDouble(JOptionPane.showInputDialog("¿Cuál es el ancho del Rectangulo en metros?"));
    longitud=Double.parseDouble(JOptionPane.showInputDialog("¿Cuál es la longutud del Rectangulo en metros?"));
    
}
public void area()
{
    if(ancho>1&ancho<20)
    {
        if(longitud>1&longitud<20)
        {
          area=ancho*longitud;
          texto.append("El área del rectangulo es de "+area+" metros cuadrados\n");
        }
        else 
        {
            texto.append("Lo siento la longitud es negativa, menor a 1 o mayor a 20 \n");
        }
    }
    else
    {
        texto.append("Lo siento el ancho es negativo, menor a 1 o mayor a 20 \n");
    }
     JOptionPane.showMessageDialog(null, barra);
}
public void perimetro()
{
    if(ancho>1&ancho<20)
    {
        if(longitud>1&longitud<20)
        {
          perimetro=(2*longitud)+(2*ancho);
          texto.append("El valor del Perimetro del triangulo es de "+perimetro+" metros \n");
        }
        else 
        {
            texto.append("Lo siento la longitud es negativa, menor a 1 o mayor a 20 \n");
        }
    }
    else
    {
        texto.append("Lo siento el ancho es negativo, menor a 1 o mayor a 20 \n");
    }
     JOptionPane.showMessageDialog(null, barra);
}
    public static void main(String[] args) 
    {
      Retangulo obj =new Retangulo();
      obj.recibe_datos();
      obj.area();
      obj.perimetro();
    }
    
}
