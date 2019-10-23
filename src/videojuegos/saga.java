package videojuegos;

public class saga extends Videojuegos{
    
    private int episodios;
    private boolean ingles;
    private String autor; 


    public saga(int episodios, boolean ingles, String autor, String usuarioDelJugador, int niveles, int cantidadDeAvatares, int inventario, boolean online, boolean actualizaciones) {
        super(usuarioDelJugador, niveles, cantidadDeAvatares, inventario, online, actualizaciones);
        this.episodios = episodios;
        this.ingles = ingles;
        this.autor = autor;
    }

    public int getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public boolean isIngles() {
        return ingles;
    }

    public void setIngles(boolean ingles) {
        this.ingles = ingles;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public void episodios(int nuevosEpisodios){
        if(nuevosEpisodios<=this.episodios){
            System.out.println("no hay nuevos episodios: ");
            
        }else{
            this.episodios = nuevosEpisodios;
            System.out.println("Los nuevos episodios son: ");
        }
    }
 
}
