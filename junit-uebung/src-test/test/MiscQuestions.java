package test;

import java.util.MissingFormatArgumentException;
import static org.junit.Assert.*;
import org.junit.*;



public class MiscQuestions {

  @Test(expected = MissingFormatArgumentException.class)
  public void testStringFormatWithOrWithoutPlaceholders() throws Exception {
    assertEquals("A=A", String.format("A=%s", "A"));
    assertEquals("A=", String.format("A=", "A"));
   
    String.format("A=%s");
  }
}
