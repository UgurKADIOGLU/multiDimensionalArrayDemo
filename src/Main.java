public class Main {

    public static void main(String[] args) {
        String[][] sehirler = new String[3][3];
        sehirler[0][0] = "İstanbul";
        sehirler[0][1] = "Bursa";
        sehirler[0][2] = "Edirne";
        sehirler[1][0] = "Ankara";
        sehirler[1][1] = "Konya";
        sehirler[1][2] = "Eskişehir";
        sehirler[2][0] = "İzmir";
        sehirler[2][1] = "Aydın";
        sehirler[2][2] = "Muğla";

        for (int i=0;i<sehirler.length;i++
             ) {
System.out.println(sehirler[i][i]);
        }
    }
}
