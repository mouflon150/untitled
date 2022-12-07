package task2;

public enum Region {

    BATKEN("Исфана"),
    ISSYK_KUL("Море"),
    OSH("Самса"),
    JALAL_ABAD("Арстанбап"),
    TALAS("Памятник Манаса"),
    NARYN("Водохранилище"),
    CHUI("Кумыз");

    final String feature;

    Region(String feature) {
        this.feature = feature;
    }
}
