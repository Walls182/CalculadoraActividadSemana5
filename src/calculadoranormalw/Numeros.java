/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoranormalw;

/**
 *
 * @author Walls
 */
public abstract class Numeros  {
    
    
    // Nota: en la actividad dicen crear una clase abstracta, pero al heredar en el gui no
    //   deja heredar de dos clases, por eso se uso la implementacion en la gui, pero igual la dejo jsjs
  private int n;
    public Numeros(){
    }
    public Numeros(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    
    
    
    public abstract int sumar(int n);
     public abstract int restar(int n);
      public abstract int multiplicar(int n);
       public abstract int dividir(int n);
    
}
