package test.io.github.caffetteria.test.pubblicazione1;

import io.github.caffetteria.test.pubblicazione1.Test1;
import org.fugerit.java.core.lang.helpers.BooleanUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestTest1 {

    @Test
    void test1() {
        Test1 t = new Test1();
        t.setParam1(BooleanUtils.BOOLEAN_1);
        Assertions.assertEquals( BooleanUtils.BOOLEAN_1, t.getParam1() );
    }

}
