package cenfotec.katas.cesar.test;

import cenfotec.katas.cesar.Cesar;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCesar {
    @Test
    public void testEncryptaCesar() {
        String text = "Z";
        String result = Cesar.EncryptaCesar(text, 2);

        assertEquals("B",result,"Should return B as string");
    }

}
