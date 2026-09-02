public class Livro {
    String titulo;
    String autor;
    int paginas;

    void mostrarInfo() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Paginas: " + paginas);
    }

    public static void main(String[] args) {
        Livro livro1 = new Livro();
        Livro livro2 = new Livro();
        Livro livro3 = new Livro();

        livro1.titulo = "Chapéu";
        livro1.autor = "Monteiro Lobato";
        livro1.paginas = 40;

        livro2.titulo = "Boné";
        livro2.autor = "Matheus";
        livro2.paginas = 40;

        livro3.titulo = "Capacete";
        livro3.autor = "Serroso";
        livro3.paginas = 100;

        livro1.mostrarInfo();
        livro2.mostrarInfo();
        livro3.mostrarInfo();
    }
}