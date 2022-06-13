package dio.OO;


class Carro {
    String cor;
    String modelo;
    int capacidadeTanque;

    Carro(String cor,String modelo, int capacidadeTanque) {
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }

    public Carro() {

    }

    void setCor(String cor) {
        this.cor = cor;
    }

    void setModelo(String modelo) {
        this.modelo = modelo;
    }

    String getCor() {
        return cor;
    }

    String getModelo() {
        return modelo;
    }

    void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    double totalValorTanque(double ValorCombustivel){
        return capacidadeTanque * ValorCombustivel;

    }
}
