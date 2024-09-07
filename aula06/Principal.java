public class Principal{
    public static void main(String[] args){
        ListaDupla<String> lista = new ListaDupla<String>("Alunos");
        lista.imprimeLista();
        lista.addInicio("Rafael");
        lista.imprimeLista();
        lista.addInicio("Iago");
        lista.imprimeLista();
        lista.addFinal("Miguel");
        lista.imprimeLista();
        lista.removeInicio();
        lista.imprimeLista();
        lista.removeFinal();
        lista.imprimeLista();
    }
}