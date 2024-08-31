class No<T>{

    private T dado;
    private No<T> nextNo;

    public No(T dado){
        this.dado = dado;
        this.nextNo = null;
    }

    public void setnextNo(No<T> nextNo){
        this.nextNo = nextNo;
    }

    public No<T> getnextNo(){
        return this.nextNo;
    }

    public void setDado(T dado){
        this.dado = dado;
    }

    public T getDado(){
        return this.dado;
    }

    public String imprimeDados(){
        return "{ Dado: " + getDado() + "}";
    }
}
