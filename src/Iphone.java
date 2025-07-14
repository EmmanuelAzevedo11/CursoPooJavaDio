public abstract class  Iphone implements AparelhoTelefonico, navegadorDeInternet, reprodutorDeMusica {

    private static String ipDeMaquina = "1034014834FF";
    private String senha;
    public static String modelo = "iphone xrs";
    public static int anoFabricacao = 2019;

    public Iphone( String senha){
        this.senha = senha;
    }

      
    public void ligarTelefone(){
    }
    public void desligarTelefone(){
    }
    public void aumentarSom(){
    }
    public void diminuirSom(){
    }
    public void conectarWifi(){
    }

    public String getIpDeMaquina() {
        return ipDeMaquina;
    }
    public void setIpDeMaquina(String ipDeMaquina) {
        this.ipDeMaquina = ipDeMaquina;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

}
