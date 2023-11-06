public class App {
    public static void main(String[] args) throws Exception {

        //Creo l'oggetto
        Libro libro1=new Libro();

        //Creo le proprietà
        libro1.titolo="I miti greci";
        libro1.numeroPagine= 722;
        libro1.genere="Mitologia greca";

        System.out.println("Il titolo del primo libro è: "+libro1.titolo+";"+" il genere è: "+libro1.genere+";"+" il numero di pagine è: "+libro1.numeroPagine);

        Libro libro2=new Libro();
        libro2.titolo="La fisica che piace";
        libro2.numeroPagine= 239;
        libro2.genere="Scientifico";
        
        System.out.println("Il titolo del secondo libro è: "+libro2.titolo+";"+" il genere è: "+libro2.genere+";"+" il numero di pagine è: "+libro2.numeroPagine);
    }
}
