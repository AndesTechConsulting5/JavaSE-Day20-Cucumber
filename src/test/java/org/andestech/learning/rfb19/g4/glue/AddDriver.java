package org.andestech.learning.rfb19.g4.glue;

import cucumber.api.java.Before;
import cucumber.api.java.ru.Дано;
import cucumber.api.java.ru.Если;
import cucumber.api.java.ru.То;
import org.testng.Assert;

public class AddDriver {

    private int a,b,c;

    @Before
    public void init(){
        System.out.println("+++++" + this);

    }

    @Если("даны два числа {int} и {int}")
    public void даны_два_числа_и(Integer a, Integer b) {
        // Write code here that turns the phrase above into concrete actions
       this.a = a; this.b = b;
    }

    @То("их сумма будет {int}")
    public void их_сумма_будет(Integer result) {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(result+0, a+b);
    }


    @Дано("два числа {int} и {int}.")
    public void два_числа_и(Integer a, Integer b) {
        // Write code here that turns the phrase above into concrete actions
        this.a = a; this.b = b;
    }


}
