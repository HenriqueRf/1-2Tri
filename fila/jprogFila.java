public class jprogFila {
    public static void main(String [] args){
        Fila f = new Fila();
        f.inserir("1");
        f.inserir("2");
        f.inserir("3");
        while (!f.vazia()){
            System.out.println(f.retirar());
        }
    }
}
