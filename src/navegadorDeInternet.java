public interface navegadorDeInternet {

    default void exibirPagina(){
        System.out.println("Exibindo página");
    }
    default void procurarDominio(){
        System.out.println("Procurando...");
    }
    default void limparNavegacao(){
        System.out.println("Limpando..");
    }

}
