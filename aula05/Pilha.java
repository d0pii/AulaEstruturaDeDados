public class Pilha<T>{

    private String nomePilha;
    private No<T> topo;

    public Pilha(){
        this("");
    }

    public Pilha(String nomePilha){
        this.nomePilha = nomePilha;
        this.topo = null;
    }

    public void push(T dado){
        No<T> novoNo = new No<T>(dado);
        novoNo.setnextNo(topo);
        topo = novoNo;
    }

    public T peek(){
        if(topo == null){
            System.out.println("Pilhas Vazia");
            return null;
        }
        return topo.getDado();
    }

    public T pop(){
        if(topo == null){
            System.out.println("Pilhas Vazia");
            return null;
        }
        T dadoTemp = topo.getDado();
        topo = topo.getnextNo();
        return dadoTemp;
    }
    
    public void imprimePilha(){
        if(topo == null){
            System.out.println("Pilha Vazia");
        }else{
            System.out.println("Dados da pilha" + nomePilha);
            No<T> aux = topo;
            while(aux != null){
                System.out.println("{"+ aux.getDado() +"}");
                aux = aux.getnextNo();
            }
        }
    }
}