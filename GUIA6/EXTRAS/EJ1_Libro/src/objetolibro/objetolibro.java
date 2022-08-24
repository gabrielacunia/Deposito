/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetolibro;

/**
 *
 * @author GACUNA
 */
public class objetolibro {
    private int isnb;
    private String titulo;
    private int paginas;
    private String autor;

    public objetolibro() {
    }

    public objetolibro(int isnb, String titulo, int paginas, String autor) {
        this.isnb = isnb;
        this.titulo = titulo;
        this.paginas = paginas;
        this.autor = autor;
    }

    public int getIsnb() {
        return isnb;
    }

    public void setIsnb(int isnb) {
        this.isnb = isnb;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "objetolibro{" + "isnb=" + isnb + ", titulo=" + titulo + ", paginas=" + paginas + ", autor=" + autor + '}';
    }
    
}
