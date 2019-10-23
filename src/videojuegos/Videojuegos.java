package videojuegos;

public class Videojuegos {

    private String usuarioDelJugador;
    private int niveles;
    private int cantidadDeAvatares;
    private int inventario;
    private boolean online;
    private boolean actualizaciones;

    public Videojuegos(String usuarioDelJugador, int niveles, int cantidadDeAvatares, int inventario, boolean online, boolean actualizaciones) {
        this.usuarioDelJugador = usuarioDelJugador;
        this.niveles = niveles;
        this.cantidadDeAvatares = cantidadDeAvatares;
        this.inventario = inventario;
        this.online = online;
        this.actualizaciones = actualizaciones;
    }
    
    
    public void usuarioUsado(){
        String usado = null;
        usuarioDelJugador = usado;
    }
    public void experiencePoints (){
        niveles = 1;
    }
    public void nuevosAvatares (){
        cantidadDeAvatares = 2;
    }
    public void nuevasHerramientas (){
        inventario = 5;
    }
    public void internet (){
        online = true;
    }
    public void actualizaciones(){
        actualizaciones = true;
    }

    public String getUsuarioDelJugador() {
        return usuarioDelJugador;
    }

    public void setUsuarioDelJugador(String usuarioDelJugador) {
        this.usuarioDelJugador = usuarioDelJugador;
    }

    public int getNiveles() {
        return niveles;
    }

    public void setNiveles(int niveles) {
        this.niveles = niveles;
    }

    public int getCantidadDeAvatares() {
        return cantidadDeAvatares;
    }

    public void setCantidadDeAvatares(int cantidadDeAvatares) {
        this.cantidadDeAvatares = cantidadDeAvatares;
    }

    public int getInventario() {
        return inventario;
    }

    public void setInventario(int inventario) {
        this.inventario = inventario;
    }

    public boolean isOnline() {
        return online;
    }

    public void setOnline(boolean online) {
        this.online = online;
    }

    public boolean isActualizaciones() {
        return actualizaciones;
    }

    public void setActualizaciones(boolean actualizaciones) {
        this.actualizaciones = actualizaciones;
    }
        

    public void nuevosAvatares(int nuevaCantidadDeAvatares){
        if(nuevaCantidadDeAvatares<=this.cantidadDeAvatares){
            System.out.println("No hay nuevos avatares: ");
        }else{
            this.cantidadDeAvatares = nuevaCantidadDeAvatares;
            System.out.println("Los nuevos avatares son: ");         
        }
    }
   
    
    }
    

