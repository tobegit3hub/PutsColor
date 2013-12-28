package cn.chendihao;

import junit.framework.TestCase;

import org.junit.Test;

public class TestPutsColor extends TestCase {

  @Test
  public static void testPutsRed(){
    PutsColor.puts_red("Hello, I'm red.");
  }

  @Test
  public static void testPutsGreen(){
    PutsColor.puts_green("What's wrong with green?");
  }

  @Test
  public static void testPutsYellow(){
    PutsColor.puts_yellow("I'm innocent yellow.");
  }

  @Test
  public static void testPutsBlue(){
    PutsColor.puts_blue("I know because it's blue.");
  }

  @Test
  public static void testPutsPurple(){
    PutsColor.puts_purple("Don't forget the purple");
  }

  @Test
  public static void testPutsCyan(){
    PutsColor.puts_cyan("Cyan is hard to remember.");
  }

  @Test
  public static void testPutsGrey(){
    PutsColor.puts_grey("Actually grep is the last one.");
  }

}
