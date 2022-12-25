package condition;

public enum EmotionsActions {
    DELIGHT("пришел в восторг","остается в восторг"),
    JOY("начал радоваться","радуется"),
    DOUBT("начал сомневаться","сомневается"),
    NODOUBT("не сомневался","убедился"),
    NEUTRAL("успокоился","остается спокойным"),
    MISS("Почувствовал, что он соскучился", "все еще скучает"),
    THINK("подумал", "размышлял"),
    ENVY("начал завидовать","завидует");
    private String notEq;
    private String eq;
    EmotionsActions(String notEq , String eq) {
        this.notEq = notEq;
        this.eq = eq;
    }
    public String getString(EmotionsActions prev) {
        return prev == this ? eq : notEq;
    }
}
