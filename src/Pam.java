import myexception.Umer;
import person.*;
import condition.*;

public class Pam {
    public static void main(String[] args) {
        Human malish = new Human("Малыш", 10, "жестко хочет собаку", Position.SIT, GeopositionActions.INSIDE, EmotionsActions.NEUTRAL, "давнозавидует");
        Human karlson = new Human("Карлсон", 35, "самый лучший товарищ по играм", Position.STAND, GeopositionActions.OUTSIDE, EmotionsActions.NEUTRAL, "живет на крыше");
        Human gunilla = new Human("Гунилла", 10, "хороший товарищ", Position.SIT, GeopositionActions.CITY, EmotionsActions.NEUTRAL, "быть никем");
        Human krister = new Human("Кристер", 10, "хороший товарищ", Position.SIT, GeopositionActions.CITY, EmotionsActions.NEUTRAL, "хвастается собака");
        NoHuman effa = new NoHuman("Еффа", 0, "небольшой человек", Position.SIT, GeopositionActions.CITY, EmotionsActions.NEUTRAL);
        malish.changeEmot(EmotionsActions.MISS);


        System.out.println(karlson.getName() + " \"Неприятности -- это пустяки, дело житейское, и расстраиваться тут нечего\"");
        malish.changeEmot(EmotionsActions.THINK);
        System.out.println("\"Неужели Карлсон больше никогда не прилетит?\"");
        try {
            malish.changePos(Position.LIE);
        } catch (Umer e) {
            System.out.println(e.getMessage());
            System.out.println("Дальше ничего не будет, все пошли на похороны");
            System.exit(0);
        }
        try {
            malish.changePos(Position.READ);
        } catch (Umer e) {
            System.out.println(e.getMessage());
            System.out.println("Дальше ничего не будет, все пошли на похороны");
            System.exit(0);
        }
        malish.hearsZzz();
        try {
            malish.changePos(Position.STAND);
        } catch (Umer e) {
            System.out.println(e.getMessage());
            System.out.println("Дальше ничего не будет, все пошли на похороны");
            System.exit(0);
        }
        karlson.changeGeop(GeopositionActions.INSIDE);
        try {
            karlson.changePos(Position.BRRR);
        } catch (Umer e) {
            System.out.println(e.getMessage());
            System.out.println("Дальше ничего не будет, все пошли на похороны");
            System.exit(0);
        }
        try {
            karlson.changePos(Position.SING);
        } catch (Umer e) {
            System.out.println(e.getMessage());
            System.out.println("Дальше ничего не будет, все пошли на похороны");
            System.exit(0);
        }
        try {
            karlson.changePos(Position.CRINGE);
        } catch (Umer e) {
            System.out.println(e.getMessage());
            System.out.println("Дальше ничего не будет, все пошли на похороны");
            System.exit(0);
        }
        try {
            karlson.changePos(Position.CRINGE);
        } catch (Umer e) {
            System.out.println(e.getMessage());
            System.out.println("Дальше ничего не будет, все пошли на похороны");
            System.exit(0);
        };
        malish.changeEmot(EmotionsActions.DELIGHT);
        malish.changeEmot(EmotionsActions.JOY);
        karlson.changeGeop(GeopositionActions.INSIDE);
        malish.changeEmot(EmotionsActions.NODOUBT);
        System.out.println(karlson.getName() + " " + karlson.getType());
        malish.changeEmot(EmotionsActions.NODOUBT);
        System.out.println(krister.getName() + " " + gunilla.getName() + " " + krister.getType());
        System.out.println(karlson.getName() + " " + karlson.getSpecifity());
        System.out.println(krister.getName() + " " + krister.getSpecifity() + " " + malish.getName() + " " + malish.getSpecifity());
        System.out.println("Если он завтра опять будет хвастаться Еффой, я ему расскажу про Карлсона. Что стоит его Еффа по сравнению с Карлсоном, который живет на крыше! Так я ему и скажу");
        System.out.println(malish.getName() + " " + malish.getType());
        try {
            karlson.changePos(Position.SOCRINGE);
        } catch (Umer e) {
            System.out.println(e.getMessage());
            System.out.println("Дальше ничего не будет, все пошли на похороны");
            System.exit(0);
        }

    }
}
