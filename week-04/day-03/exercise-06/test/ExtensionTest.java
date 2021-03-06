import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ExtensionTest {

  Extension extension = new Extension();

  @Test
  void testAdd_2and3is5() {
    assertEquals(5, extension.add(2, 3));
  }

  @Test
  void testAdd_1and4is5() {
    assertEquals(5, extension.add(1, 4));
  }

  @Test
  void testMaxOfThree_first() {
    assertEquals(5, extension.maxOfThree(5, 4, 3));
  }

  @Test
  void testMaxOfThree_third() {
    assertEquals(5, extension.maxOfThree(3, 4, 5));
  }

  @Test
  void testMedian_four() {
    assertEquals(4.5, extension.median(Arrays.asList(7, 5, 3, 4)));
  }

  @Test
  void testMedian_five() {
    assertEquals(3, extension.median(Arrays.asList(1, 2, 3, 4, 5)));
  }

  @Test
  void testIsVowel_a() {
    assertTrue(extension.isVowel('A'));
  }

  @Test
  void testIsVowel_u() {
    assertTrue(extension.isVowel('U'));
  }

  @Test
  void testTranslate_bemutatkozik() {
    assertEquals("bevemuvutavatkovozivik", extension.translate("bemutatkozik"));
  }

  @Test
  void testTranslate_kolbice() {
    assertEquals("lavagovopuvus", extension.translate("lagopus"));
  }
}