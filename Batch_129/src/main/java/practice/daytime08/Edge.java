package practice.daytime08;

public class Edge extends Browser {
    String adresCubugu;

    public Edge() {
    }

    public Edge(String adresCubugu) {
        this.adresCubugu = adresCubugu;
    }
    @Override
    public void search(){
        System.out.println("Edgeler aratma yaparlar....");
    }

    @Override
    public void sifreKaydetme(){
        System.out.println("Edgeler istenildiginde sifre kaydederler....");
    }
}
