package org.example;

import java.time.LocalDate;


public class Anotacoes {
    //Atributos
    private int id;
    private String texto;
    private LocalDate data;

    public Anotacoes(String texto, int id){
        this.texto = texto;
        this.id = id;
        this.data = LocalDate.now();

    }
    @Override
    public String toString(){
        return id + " - " + texto + " - " + data;

    }

    public String getTexto(){
        return texto;
    }
    public void setTexto(String texto){
        this.texto = texto;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public LocalDate getData(){
        return data;
    }


}
