package person;

import condition.*;
import myexception.Umer;
import myexception.UnsupportedMethod;

import java.util.Scanner;

public class Human extends Character implements ChangedEmotions, ChangedGeoposition, ChangePosition{
    final private String specifity;

    public Human(String name, int age, String type, Position pos, GeopositionActions geo, EmotionsActions emo, String specifity){
        super(name, age, type, pos, geo, emo);
        this.specifity = specifity;

    }
    public String getSpecifity() {
        return this.specifity;
    }


    //анонимус

    public void hearsZzz(){

        class Bee extends Character{
            public Bee(){
                super("Пчел", 1, "bzz", Position.STAND, GeopositionActions.OUTSIDE, EmotionsActions.NEUTRAL);
            }

            @Override
            public void changePos(Position pam2) {
                throw new UnsupportedMethod();
            }
        }

        Bee bee = new Bee();

        System.out.println(bee);
        System.out.println(this.getName() + " услышал " + bee.getName());
        try {
            throw new Umer(bee.getName());
        } catch (Umer e){
            System.out.println(e.getMessage() + ", потому что старый. Пчёлы не живут год.");
        }

    }


    @Override
    public void changeEmot(EmotionsActions state) {
        EmotionsActions prevEmo = this.getEmo();
        this.setEmotions(state);
        String personName = this.getName();
        Convert<EmotionsActions> con = x -> x.getString(prevEmo);
        System.out.println(personName + " " + con.write(state));
    }



    @Override
    public void changePos(Position pam2) {
        if (Math.random() >= 0.1) {
            Position prevPos = this.getPos();
            this.setPos(pam2);
            String personName = this.getName();
            Convert<Position> con = x -> x.getString(prevPos);
            System.out.println(personName + " " + con.write(pam2));
        } else {
            throw new Umer(this.getName());
        }
    }

    class Opinion{
        public void returnPositiv(){
            System.out.println("Супер позитивный чел получается");
        }
        public void returnNoName(){
            System.out.println("ноунейм получается");
        }
        public void returnNegative(){
            System.out.println("фу фу фу, негативный");
        }

    }


    @Override
    public void changeGeop(GeopositionActions pam) {
        GeopositionActions prevGeo = this.getGeo();
        this.setGeo(pam);
        String personName = this.getName();
        Convert<GeopositionActions> con = x -> x.getString(prevGeo);
        System.out.println(personName + " " + con.write(pam));
    }
}
