package Project;

public class Song {
    public static void main(String[] args) throws InterruptedException {

        String[] lyrics = {
            "Enakenna yaarum illaye",
            "Unakathu thona vilaiye",
            "Enakenna yaarum illaye",
            "Unakathu thonavillaiye",
            "",
            "Kadal thandi pogum kadhali",
            "Kai meeri poguthe en vidhi",
            "Nagaramal nindru pogume",
            "En vazhkaiyin rathi",
            "",
            "Kadal thandi pogum kadhali",
            "Kai meeri poguthe en vidhi",
            "Nagaramal nindru pogume",
            "En vazhkaiyin rathi",
            "",
            "Padhi kadhal thandha pene",
            "Methiyum vendum",
            "Nee pona pinbu enthan manamo",
            "Irundu thaan pogum",
            "",
            "Kathiru enru nee soli ponaal",
            "Athuve pothum",
            "Maranthiru enru nee soli nernthal",
            "Uyyire pogum",
            "",
            "Enakenna yaarum ilaye",
            "Unakathu thonavillaiye",
            "Enakena yaarum illaye",
            "Unakathu thonavillaiye",
            "",
            "Bodha neethane",
            "Thallaaduren nane",
            "Onn kamam vename",
            "Onn kadhal pothume",
            "",
            "Kadal thaandi pogum kaadhali",
            "Kai meeri poguthe en vidhi",
            "Nagaraamal nindru pogume",
            "En vaazhkaiyin rathi",
            "",
            "Padhi kadhal thandha pene",
            "Meethiyum vendum",
            "Nee pona pinbu enthan manamo",
            "Irundu than pogum",
            "",
            "Kathiru enru nee soli ponaal",
            "Athuve pothum",
            "Maranthiru enru nee solli nernthal",
            "Uyyire pogum",
            "",
            "Enakenna yarum ilaye",
            "Unakathu thonavillaiye",
            "Enakenna",
            "",
            "En bodha neethane",
            "Thalaaduren naane",
            "Onn kaamam vename",
            "Onn kadhal pothume",
            "",
            "En boda neethane",
            "Thalladuren naane",
            "Onn kamam vename",
            "Onn kadhal pothume",
            "",
            "Enakkena yaarum illaye",
            "Unakathu thonavilaiye",
            "Enakkenna yaarum illaye",
            "Unakathu thonavilaiye",
            "",
            "Enakenna yarum illaye",
            "Unakathu thonavilaiye",
            "Enakena yaarum ilaye",
            "Unakathu thonavilaiye"
        };

        // Delay per line (in seconds)
        double[] delays = {
            1.8, 1.8, 1.8, 1.8, 0.2,
            1.8, 1.8, 1.8, 1.8, 0.4,
            1.8, 1.8, 1.8, 2.0, 0.4,
            1.6, 1.4, 1.8, 2.0, 0.4,
            1.6, 1.8, 1.8, 2.0, 0.3,
            1.8, 1.8, 1.8, 2.0, 0.2,
            1.6, 1.6, 1.8, 1.8, 0.3,
            1.8, 1.8, 1.8, 2.0, 0.4,
            1.8, 1.8, 1.8, 2.0, 0.4,
            1.6, 1.8, 1.8, 2.0, 0.4,
            1.8, 1.8, 1.8, 2.0, 0.3,
            1.8, 1.8, 1.8, 2.0, 0.3,
            1.6, 1.8, 1.8, 2.0, 0.4,
            1.8, 1.8, 1.8, 2.0, 0.3,
            1.8, 1.8, 1.8, 2.0, 0.3,
            1.8, 1.8, 1.8, 2.0
        };

        System.out.println("\n🎵 Enakenna Yaarum Illaye – Experimental Console Version 🎵\n");
        Thread.sleep(1200);

        for (int i = 0; i < lyrics.length; i++) {
            String line = lyrics[i];

            // Print each letter with a typing animation
            for (char ch : line.toCharArray()) {
                System.out.print(ch);
                System.out.flush();
                Thread.sleep(65); // typing speed
            }

            System.out.println(); // move to next line

            // Delay between lines if available
            if (i < delays.length) {
                Thread.sleep((int) (delays[i] * 1000));
            } else {
                Thread.sleep(1200);
            }
        }

        System.out.println("\n🎧 End of Song 🎧");
    }
}
