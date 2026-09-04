public class PortoGrande extends BasePorto{
    @Override
    public void atracarBarco(Barco barco){
        if (barco.getTamanho() >= 10) {barcosAtracados.add(barco); System.out.println(barco.getNome() +" atracado no porto grande");}
    }
}
