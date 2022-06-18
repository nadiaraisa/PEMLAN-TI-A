package UBFood;

class Main {
    public static void main(String[] args) throws Exception {
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Basko Pak Sahid", "Bakso", 8000));
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Nasgor Mblebes", "Nasi Goreng Jawa", 10000));
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Ayam Geprek Kak Ros", "Ayam Kota Ekstra Nasi", 10000));
        DataMerchant.tampilData();
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant(DataMerchant.in));
        DataMerchant.tampilData();
    }
}
