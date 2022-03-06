package StructuralPatterns.adapter;

public class Main {

    public static void main(String[] args) {
        Priz priz = new Priz();

        Utu utu = new Utu();
        Buzdolabi buzdolabi = new Buzdolabi();

        priz.elektrikVer(utu);
        priz.elektrikVer(buzdolabi);

        IphoneTelefon iphoneTelefon = new IphoneTelefon();

        // Direkt bu şekilde olmaz, çünkü priz elektriklievaleti beklerken iphonetelefon bunu karşılamıyor.
        // Prizi veya Telefon sınıf veya interface'i değiştirmek mantıklı değil. Bu nedenle araya bir adaptör yazılması
        // gerekiyor. Bunlar dışarıdan alınmış farklı kütüphaneler bile olabilir. Amaç bunları uygun şekjilde convert edebilmek


        // priz.elektrikVer(iphoneTelefon);

        // Telefonu prize uygun şekilde convert etmiş olduk.
        TelefonEEAAdapter telefonEEAAdapter = new TelefonEEAAdapter(iphoneTelefon);
        priz.elektrikVer(telefonEEAAdapter);

        // Sonuç olarak ütü ve buzdolabı instance'ları 220 volt ile eea yapısına uygun şekilde çalışırken
        // araya yazılan telefoneeaadapter ile istediğimiz telefon modelini de uygun volt ile şarj edebiliyoruz.



    }
}
