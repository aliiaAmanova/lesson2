import java.util.Random;

public class Main {
    public static void main (String[] args){
       String goOutside = permission(generateRandomAge(), 2);
        System.out.println("Что мне сделать? "+ goOutside);
        String goForWalk = permission(generateRandomAge(), 15);
        System.out.println("Можно пойти гулять? "+ goForWalk);
        String getOutOfTheHouse = permission(generateRandomAge(), 4);
        System.out.println("Могу я выйти на улицу? "+ getOutOfTheHouse);
        String goTouchSomeGrass = permission(generateRandomAge(), 32);
        System.out.println("Можно гулять? "+ goTouchSomeGrass);
        String stayHome = permission(generateRandomAge(), 2);
        System.out.println("Мне остаться дома? "+ stayHome);

    }
    public static String permission (int ageOfThePerson, int temperature ) {
        if ((ageOfThePerson >= 20 && ageOfThePerson <= 45 && temperature >= -20 && temperature <= 30) ||
            ( ageOfThePerson <20 && temperature <= 0 && temperature >= 28 ) ||
            (ageOfThePerson > 45 && temperature <= -10 && temperature >= 25)) {
         return "Можно идти гулять";

    } else {
            return "Оставайтесь дома";
        }

    }
public static int generateRandomAge (){
        Random rand =new Random();
        return rand.nextInt(80) + 5;

}

}



