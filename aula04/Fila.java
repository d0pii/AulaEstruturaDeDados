public class Fila<T>{
    private String nomeFila;
    private No<T> ultimoNo;
    private No<T> primeiroNo;

    public Fila(){
        this("Fila");
    }

    public Fila(String nomeFila){
        this.nomeFila = nomeFila;
        this.primeiroNo = null;
        this.ultimoNo = null;
    }

    public void enfileirar(T dado){
        No<T> novoNo = new No<T>(dado);
        if(ultimoNo == null){
            primeiroNo = ultimoNo = novoNo;
        }else{
            ultimoNo.setnextNo(novoNo);
            ultimoNo = novoNo;
        }
    }

    public void desenfiliar(){
        if(primeiroNo == null ){
            System.out.println("Lista vazia");

            return null;

        }else{
            System.out.printf("O valor {%s} foi removido", primeiroNo.getDado());
            primeiroNo = primeiroNo.getnextNo();
        }
    }

    public void imprimiDados(){
        if(primeiroNo == null){
            System.out.println("Lista vazia");
        }else{
            System.out.printf("Dados da lista %s: \n", this.nomeFila);

            No<T> objAux = primeiroNo;
            while(objAux != null){
            System.out.printf("{%s}\n",objAux.getDado());
            objAux = objAux.getnextNo();
            }
        }
    }
}