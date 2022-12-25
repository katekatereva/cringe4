package condition;

import javax.print.DocFlavor;

public enum Position {

    STAND("вскакивает на ноги", "все еще стоит"),
    LIE("ложится", "жестко тильтует и все еще лежит\""),

    READ("читал", "продолжал читать"),
    BRRR("сделал несколько кругов", "продолжает дуть ветер"),
    SING("напевал веселую песенку", "продолжал шизовать"),
    SLOW("замедлялся, чтобы чет рассмотреть", "остановился нафиг"),
    CRINGE("склонял на бок голову", "прищуривал глазки"),
    SOCRINGE("прервал размышления", "бубнит"),

    SIT("присел", "сидит");
    private String notEq;
    private String eq;
    Position(String notEq , String eq) {
        this.notEq = notEq;
        this.eq = eq;
    }
    public String getString(Position prev) {
        return prev == this ? eq : notEq;
    }
}

