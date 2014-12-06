package activefx.tradserver.domain;

import org.junit.Assert;
import org.junit.Test;

public class PersonTest {

    @Test
    public void testPerson()
    {
        Person person = new Person();
        person.setName("Steve");
        Assert.assertEquals(person.getName(),"Steve");
    }

}