/*
/ 1- Classe
/ 2 - Atributos
/ 3 - Modificadores de acesso
/ 4- Getters e Setters
/ 5- To String
/ 6 - Construtor vazio
/
 */

package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{

    private int cargaHoraria;


    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }


    public Curso() {
    }



    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }





    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }


}
