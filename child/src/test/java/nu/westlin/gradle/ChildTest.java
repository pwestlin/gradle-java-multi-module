package nu.westlin.gradle;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ChildTest {

    @Test
    public void construct() {
        assertThat(new Child("Bosse").getName(), is("Bosse"));
    }
}