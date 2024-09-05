public class Principal{
    public static void main(String[] args){
        ListaDupla<String> lista = new ListaDupla<String>("Alunos");
        lista.imprimeLista();
        lista.addInicio("Rafael");
        lista.imprimeLista();
        lista.addFinal("Miguel");
        lista.imprimeLista();
    }
}