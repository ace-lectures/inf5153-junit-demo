package tests;

import uutf.TestCase;

import static uutf.Assertions.assertEquals;

public class ThrowAnException extends TestCase {

    @Override
    protected void test() {
       throw new RuntimeException();
    }

}
