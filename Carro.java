package Model;

import java.util.Objects;

public class Carro {

    private String cor;
    private String marca;
    private String ano;
    private String modelo;
    private boolean ligado;
    private int velocidadeAtual;

    public Carro(String cor, String marca, String ano, String modelo) {
        this.cor = cor;
        this.marca = marca;
        this.ano = ano;
        this.modelo = modelo;
        this.ligado = false;
        this.velocidadeAtual = 0;
    }


    @Override
    public String toString() {
        return "Carro{" +
                "cor='" + cor + '\'' +
                ", marca='" + marca + '\'' +
                ", ano='" + ano + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ligado=" + ligado +
                ", velocidadeAtual=" + velocidadeAtual +
                '}';
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Boolean getLigado() {
        return ligado;
    }

    public void setVelocidadeAtual(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }
    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carro carro = (Carro) o;
        return cor.equals(carro.cor) && marca.equals(carro.marca) && ano.equals(carro.ano) && modelo.equals(carro.modelo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cor, marca, ano, modelo);
    }
}
