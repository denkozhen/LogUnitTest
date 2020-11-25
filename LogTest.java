package sample;

import org.junit.Assert;

import static org.junit.jupiter.api.Assertions.*;

class LogTest {

    @org.junit.jupiter.api.Test
    void main() {
        int a = 13;
        int b =11;
        int c = 33;
        int f = 15;
        int max = 0;
        int result =0;
        int expect = Log.taskRelease(a,b,max,result, f);
        int actual = 4;
        Assert.assertEquals(expect,actual);
    }


}
