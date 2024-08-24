public class Principal{

    public static void main(String[] args){
        Lista<String> lista = new Lista<String>("Alunos");

        lista.addInicio("Rafael");
        lista.imprimiDados();
        lista.addInicio("Gabriel");
        lista.imprimiDados();
        lista.addFinal("Miguel");
        lista.imprimiDados();
        lista.removeInicio();
        lista.imprimiDados();
        lista.removeFinal();
        lista.imprimiDados();
    }
}