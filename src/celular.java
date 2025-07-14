public final class celular extends Iphone {


    
    public int volume;
    public String numeroTelefonico;
    public String ipDeNavegacao;

    public celular( String senha, int volume, String numeroTelefonico, String ipDeNavegacao){
        super(senha);
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
    public int getVolume() {
        return volume;
    }

    public void setNumeroTelefonico(String numeroTelefonico) {
        this.numeroTelefonico = numeroTelefonico;
    }
    public String getNumeroTelefonico() {
        return numeroTelefonico;
    }

    public void setIpDeNavegacao(String ipDeNavegacao) {
        this.ipDeNavegacao = ipDeNavegacao;
    }
    public String getIpDeNavegacao() {
        return ipDeNavegacao;
    }


    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando música...");
    }

    @Override
    public void tocarMusica() {
        System.out.println("Tocando música...");
    }

    @Override
    public void pausarMusica(double som) {
        System.out.println("Pausando música no volume: " + som);
    }
}
