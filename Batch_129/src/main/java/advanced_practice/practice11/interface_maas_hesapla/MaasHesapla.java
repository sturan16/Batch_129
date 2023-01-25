package advanced_practice.practice11.interface_maas_hesapla;

public class MaasHesapla implements MaasArtir,Vergi{
    @Override
    public double yillikEkstra(int calismaYili) {
        return calismaYili*100;
    }

    @Override
    public double saatlikEkstra(int calismaSaati) {
        if(calismaSaati>160) {
            return (calismaSaati - 160) * 10;
        }else {
            return 0;
        }
    }

    @Override
    public double vergi(int calismaYili, double brutMaas) {
        if(calismaYili>=10){
            return brutMaas*0.3;
        }else {
            return brutMaas*0.2;
        }
    }

    public double netMaas(double brutMaas,int calismaYili,int calismaSaati){

        return brutMaas+yillikEkstra(calismaYili)+saatlikEkstra(calismaSaati)-vergi(calismaYili,brutMaas);

    }
}
