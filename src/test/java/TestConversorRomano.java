import org.junit.Assert;
import org.junit.Test;

public class TestConversorRomano {

    @Test
    public void testConversorRomano(){
        Assert.assertEquals(ConversorRomano.aRomano(1), "I");
        Assert.assertEquals(ConversorRomano.aRomano(2), "II");
        Assert.assertEquals(ConversorRomano.aRomano(3), "III");
        Assert.assertEquals(ConversorRomano.aRomano(4), "IV");
        Assert.assertEquals(ConversorRomano.aRomano(5), "V");
        Assert.assertEquals(ConversorRomano.aRomano(6), "VI");
        Assert.assertEquals(ConversorRomano.aRomano(7), "VII");
        Assert.assertEquals(ConversorRomano.aRomano(8), "VIII");
        Assert.assertEquals(ConversorRomano.aRomano(9), "IX");
        Assert.assertEquals(ConversorRomano.aRomano(10), "X");
        Assert.assertEquals(ConversorRomano.aRomano(11), "XI");
        Assert.assertEquals(ConversorRomano.aRomano(12), "XII");
        Assert.assertEquals(ConversorRomano.aRomano(13), "XIII");
        Assert.assertEquals(ConversorRomano.aRomano(14), "XIV");
        Assert.assertEquals(ConversorRomano.aRomano(15), "XV");
        Assert.assertEquals(ConversorRomano.aRomano(16), "XVI");
        Assert.assertEquals(ConversorRomano.aRomano(17), "XVII");
        Assert.assertEquals(ConversorRomano.aRomano(18), "XVIII");
        Assert.assertEquals(ConversorRomano.aRomano(19), "XIX");
        Assert.assertEquals(ConversorRomano.aRomano(20), "XX");
        Assert.assertEquals(ConversorRomano.aRomano(30), "XXX");
        Assert.assertEquals(ConversorRomano.aRomano(40), "XL");
        Assert.assertEquals(ConversorRomano.aRomano(50), "L");
        Assert.assertEquals(ConversorRomano.aRomano(60), "LX");
        Assert.assertEquals(ConversorRomano.aRomano(70), "LXX");
        Assert.assertEquals(ConversorRomano.aRomano(80), "LXXX");
        Assert.assertEquals(ConversorRomano.aRomano(90), "XC");
        Assert.assertEquals(ConversorRomano.aRomano(100), "C");
        Assert.assertEquals(ConversorRomano.aRomano(200), "CC");
        Assert.assertEquals(ConversorRomano.aRomano(300), "CCC");
        Assert.assertEquals(ConversorRomano.aRomano(400), "CD");
        Assert.assertEquals(ConversorRomano.aRomano(500), "D");
        Assert.assertEquals(ConversorRomano.aRomano(600), "DC");
        Assert.assertEquals(ConversorRomano.aRomano(700), "DCC");
        Assert.assertEquals(ConversorRomano.aRomano(800), "DCCC");
        Assert.assertEquals(ConversorRomano.aRomano(900), "CM");
        Assert.assertEquals(ConversorRomano.aRomano(1000), "M");
    }
}
