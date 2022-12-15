package airbnb.models.entities;

public class Reserva {
    private int id_reserva;
    private Item id_item;
    private Locatario locatario;
    private int qtd_dias;
    private int qtd_pessoas;
    private double valor_total;

    public Reserva(int id_reserva, Item id_item, Locatario locatario, int qtd_dias, int qtd_pessoas, double valor_total) {
        this.id_reserva = id_reserva;
        this.locatario = locatario;
        this.qtd_dias = qtd_dias;
        this.qtd_pessoas = qtd_pessoas;
        this.valor_total = valor_total;
        this.id_item = id_item;
    }

    public Reserva(){}

    public int getId_reserva() {
        return id_reserva;
    }

    public void setId_reserva(int id_reserva) {
        this.id_reserva = id_reserva;
    }

    public Locatario getLocatario() {
        return locatario;
    }

    public void setLocatario(Locatario locatario) {
        this.locatario = locatario;
    }

    public int getQtd_dias() {
        return qtd_dias;
    }

    public void setQtd_dias(int qtd_dias) {
        this.qtd_dias = qtd_dias;
    }

    public int getQtd_pessoas() {
        return qtd_pessoas;
    }

    public void setQtd_pessoas(int qtd_pessoas) {
        this.qtd_pessoas = qtd_pessoas;
    }

    public double getValor_total() {
        valor_total = qtd_dias * id_item.getValor_diaria();
        return valor_total;
    }

    public void setValor_total(double valor_total) {
        this.valor_total = valor_total;
    }

    public Item getId_item() {
        return id_item;
    }

    public void setId_item(Item id_item) {
        this.id_item = id_item;
    }

    
    
}
