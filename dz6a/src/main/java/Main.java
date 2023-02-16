public class Main {
    public static void main(String[] args) throws Exception {

        PersonMapper pmap = new PersonMapper();

        Person filippo = pmap.getPerson(1);


        System.out.println(filippo);

        Person martino = pmap.getPerson(1);


        martino.setName("Martino");


        System.out.println(filippo);


        System.out.println(martino);
    }
}