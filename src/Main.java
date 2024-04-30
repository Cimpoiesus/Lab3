public class Main {
    public static void main(String[] args) {
        Paragraf p1 = new Paragraf("This is a paragraph.");
        Paragraf p2 = new Paragraf("Another paragraph here.");
        Paragraf p3 = new Paragraf("Yet another paragraph.");

        Pagina pagina = new Pagina(p1, p2, p3);



        pagina.searchPattern("This");

    }
}