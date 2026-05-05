package catcafe;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class test_1 {

    @Test
    void test_neues_cafe_ist_leer() {
        // given: Ein neues Katzen-Café wird eröffnet
        CatCafe cafe = new CatCafe();

        // when: Wir rufen die Anzahl der Katzen ab
        int anzahl = cafe.getKatzenAnzahl(); // (Methodenname hängt von deinem Code ab!)

        // then: Die Anzahl sollte 0 sein
        Assertions.assertEquals(0, anzahl);
    }
}
