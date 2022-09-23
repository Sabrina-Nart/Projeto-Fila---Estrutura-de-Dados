
package tad;

public class Fila implements Cloneable{ 
    
    private int primeiro; 
    private int ultimo;
    private String[] valor;
    
    public Fila(int tamanho){ 
        this.valor = new String[tamanho];
        this.clearQueue(); 
    }
       
    public void clearQueue(){
        this.primeiro = -1; 
        this.ultimo = -1;
    }
    
    public boolean isEmptyQuenue(){
        return this.primeiro == -1;
    }

    public boolean isFullQueue(){
        return this.ultimo == this.valor.length -1; 
    }
    
    public boolean enQueue(String novo){ 
        if (isFullQueue()){ 
            return false;
        }
        
        if (isEmptyQuenue()){ 
            this.primeiro = 0;
        }
        
        this.ultimo++;
        this.valor[this.ultimo] = novo;
        return true;
    }
    
    public boolean deQueue(){
        
        if (this.isEmptyQuenue()){
           return false; 
        }
        
        if (this.primeiro == this.ultimo){ 
           this.clearQueue();
           return true;
        }
        
        this.primeiro++; 
        return true;
    }
    
    public String firstQueue(){ 
        return (this.isEmptyQuenue() ? "FILA VÁZIA" : this.valor[this.primeiro]);
    }

    public Fila clone() throws CloneNotSupportedException{
        return (Fila) super.clone();
    }
    
}
