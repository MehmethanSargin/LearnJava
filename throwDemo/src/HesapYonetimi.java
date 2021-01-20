public class HesapYonetimi {
    private double hesap;


    public void yatirma (double tutar){
        hesap = getHesap() + tutar;
    }

    public void cekme (double tutar) throws BakiyeYetersizException {
        if (hesap>=tutar){
            hesap = getHesap() - tutar;
        }else {
           throw new BakiyeYetersizException("Bakiye Yetersiz");
        }

    }
    public double getHesap() {
        return hesap;
    }
}
