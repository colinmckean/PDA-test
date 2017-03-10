import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;


public class TestPda{
  Pda pda;

  @Before
  public void before(){
    pda = new Pda();
  }
  @Test
  public void testFunc1_true(){
    assertEquals(true, pda.func1(1));
  }
  @Test
  public void testFunc2_false(){
    assertEquals(false, pda.func1(2));
  }

  @Test
  public void testMax_aIsHigher(){
    assertEquals(2,pda.max(2,1));
  }

  @Test
  public void testMax_bIsHigher(){
    assertEquals(2,pda.max(1,2));
  }

  @Test
  public void test_looper(){
    assertEquals(10, pda.looper());
  }

  @Test
  public void checkLoop(){
    assertEquals("looper passed", pda.checkLoop());
  }
}