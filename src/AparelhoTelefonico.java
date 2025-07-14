public interface AparelhoTelefonico {
    
    default void atenderLigacao(){
        System.out.println("Atendendo ligação");
    }
    default void desligarLigacao(){
        System.out.println("Desligando ligação");
    }
    default void ligar(){
        System.out.println("Ligar");
    }
    default void ouvirCorreioDeVoz(){
        System.out.println("Ouvindo correio de voz");
    }
}
