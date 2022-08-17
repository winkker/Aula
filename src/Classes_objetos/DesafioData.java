package Classes_objetos;

public class DesafioData {

    int dia, mes, ano;

    DesafioData() {
        this(1, 1, 1970);
    }

    DesafioData(int dia, int mes, int ano) {

        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }


    String dataFormatada() {

        return dia + "/" + mes + "/" + ano;
    }

}
