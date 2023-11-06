public class App {
    public static void main(String[] args) throws Exception {
        
        
        //Creo l'oggetto
        Automobile bmw=new Automobile();
        bmw.marca="Bmw";
        bmw.modello="Serie3";
        bmw.cilindrata=3000;
        bmw.colore="Nero";
        System.out.print("la marca è: "+bmw.marca+";"+ " il moello è: "+ bmw.modello+";"+" la cilindrata è: "+ bmw.cilindrata+";"+" il colore è: "+ bmw.colore+ "\n");

        Automobile mercedes=new Automobile();
        mercedes.marca="Mercedes";
        mercedes.modello="Classe_C";
        mercedes.cilindrata=2200;
        mercedes.colore="Grigio";
        System.out.println("la marca è: "+mercedes.marca+";"+ " il moello è: "+ mercedes.modello+";"+" la cilindrata è: "+ mercedes.cilindrata+";"+" il colore è: "+ mercedes.colore);
    }
}
