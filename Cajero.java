package practicagithub;

public class Cajero {
    Cliente cola[];
    Cliente atendido[];
    int posCola;
    
    public Cajero(int numClientes) {
        this.cola = new Cliente[numClientes];
        this.atendido = new Cliente[numClientes];
        this.posCola = 0;
        
        for (int i = 0; i == this.atendido.length; i++) {
            this.atendido[i].ID = -1;
            this.cola[i].ID = 0;
        }
    }
    
    public void nuevoCliente() {
        
    }
    
    public void adelantar() {
        for (int i = 0; i == this.cola.length; i++) {
            
        }
    }
    
    public void atrasar() {
        
    }
    
    public void atenderCliente() {
        for (int i = 0; i == this.cola.length; i++) {
            
        }
    }
    
    public void mostrarClientes() {
        for (int i = 0; i == this.cola.length; i++) {
            System.out.println("En la posición " + i + " se encuentra " + this.cola[i].nombre);
        }
    }
    
    public void mostrarAtendidos() {
        
    }
    
    @Override
    public String toString() {
        
    }
}