class SmartPhone {
    private String marca;
    private String modelo;

    public SmartPhone(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return marca + " " + modelo;
    }
}
