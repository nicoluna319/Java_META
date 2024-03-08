public class Libro {
 //   1.Atributos
    private String titulo;
    private String autor;
    private String publicacion;

    private boolean prestado;

    public Libro(String titulo, String autor, String publicacion, boolean prestado) {
        this.titulo = titulo;
        this.autor = autor;
        this.publicacion = publicacion;
        this.prestado = prestado;
    }

//2.Métodos

    /*public String getTitulo() {
        return this.titulo;

    }

    public String getAutor(){
        return this.autor;
    }
    public String getPublicacion(){
        return this.publicacion;
    }

    public boolean getPrestado(){
        return this.prestado;
    }

    //Metodos para guardar los valores de los atributos
    public void  setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void  setAutor(String autor){
        this.autor = autor;
    }

    public void  setPrestado(boolean prestado){
        this.prestado = prestado;
    }

    public void setPublicacion(String publicacion){

    }*/

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getPublicacion() {
        return publicacion;
    }

    public void setPublicacion(String publicacion) {
        this.publicacion = publicacion;
    }

    public boolean isPrestado() {
        return prestado;
    }


    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    public void cambiarEstado(){
       /* if (this.prestado){
            this.prestado = false;
        }else {

        }*/
        this.prestado = !this.prestado;
        System.out.println("Estado del libro actualizado correctamente");
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", publicacion='" + publicacion + '\'' +
                ", prestado=" + prestado +
                '}';
    }
}

