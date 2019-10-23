package videojuegos;

public class arcade extends Videojuegos {
    
    private int mundos;
    private boolean infinito;
    private String nombre;

    public arcade(int mundos, boolean infinito, String nombre, String usuarioDelJugador, int niveles, int cantidadDeAvatares, int inventario, boolean online, boolean actualizaciones) {
        super(usuarioDelJugador, niveles, cantidadDeAvatares, inventario, online, actualizaciones);
        this.mundos = mundos;
        this.infinito = infinito;
        this.nombre = nombre;
    }

    public int getMundos() {
        return mundos;
    }

    public void setMundos(int mundos) {
        this.mundos = mundos;
    }

    public boolean isInfinito() {
        return infinito;
    }

    public void setInfinito(boolean infinito) {
        this.infinito = infinito;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void mundos(int nuevosMundos){
        if(nuevosMundos<=this.mundos){
            System.out.println("no hay nuevos mundos: ");
        
        }else{
            this.mundos = nuevosMundos;
            System.out.println("los nuevos mundos son; ");
        }
    }
    
}
