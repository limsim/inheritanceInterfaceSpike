package org.theSpike;

import org.junit.Test;

public class TheUser {
    @Test
    public void myTest() {
        theInterface something = new OtherClass();
        something.method1();
        something.method2();
    }

    @Test
    public void dummy() {
        theInterface something = new theClass();
        something.method1();
        something.method2();
    }
}
