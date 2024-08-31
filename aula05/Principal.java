public class Principal{
    public static void main(String[] args){
        System.out.println("===Testando Pilha===");
        Pilha<String> Pilha = new Pilha<String>("Letras");

        Pilha.push("A");
        Pilha.push("B");
        Pilha.push("C");
        Pilha.imprimePilha();

        System.out.println("Topo da pilha " + Pilha.peek());
        System.out.println("Elemento vazio " + Pilha.pop());
        Pilha.imprimePilha();
    }
    
}