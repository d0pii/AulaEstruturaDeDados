public class Principal{

    public static void main(String[] args){
        Fila<String> fila = new Fila<String>("Alunos");

        fila.enfileirar("111");
        fila.imprimiDados();
        fila.enfileirar("222");
        fila.imprimiDados();
        fila.enfileirar("333");
        fila.imprimiDados();
        fila.desenfiliar();
        fila.imprimiDados();
    }
}