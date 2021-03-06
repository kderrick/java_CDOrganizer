import org.junit.*;
import static org.junit.Assert.*;

public class CompactDiscTest {

  @Test
  public void CompactDisc_checkThatCDInstantiatesCorrectly_true() {
    CompactDisc testCD = new CompactDisc("IV");
    assertEquals(true, testCD instanceof CompactDisc);
  }

  @Test
  public void CompactDisc_getTitle() {
    CompactDisc testCD = new CompactDisc("IV");
    assertEquals("IV", testCD.getTitle());
  }

  @Test
  public void CompactDisc_getArtist() {
    CompactDisc testCD = new CompactDisc("IV");
    assertEquals("", testCD.getArtist());
  }

  @Test
  public void CompactDisc_setArtist() {
    CompactDisc testCD = new CompactDisc("IV");
    testCD.setArtist("Led Zeppelin");
    assertEquals("Led Zeppelin", testCD.getArtist());
  }

  @Test
  public void all_returnsAllInstancesOfCompactDisc_true() {
    CompactDisc firstDisc = new CompactDisc("IV");
    CompactDisc secondDisc = new CompactDisc("III");
    assertTrue(CompactDisc.all().contains(firstDisc));
    assertTrue(CompactDisc.all().contains(secondDisc));

  }

  @Test
  public void newId_compactDiscInstantiatesWithAnId_True() {
    CompactDisc testCD = new CompactDisc("IV");
    assertEquals(CompactDisc.all().size(), testCD.getId());
  }

    @Test
    public void find_returnsTaskWithSameId_secondCD() {
      CompactDisc firstCompactDisc = new CompactDisc("IV");
      CompactDisc secondCompactDisc = new CompactDisc("III");
      assertEquals(CompactDisc.find(secondCompactDisc.getId()), secondCompactDisc);
    }


}
