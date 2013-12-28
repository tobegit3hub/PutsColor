package cn.chendihao;

/**
 * PutsColor
 */
public class PutsColor {

  public static void puts_red(String string){
    System.out.println("\033[0;31m" + string + "\033[0m");
  }

  public static void puts_green(String string){
    System.out.println("\033[0;32m" + string + "\033[0m");
  }

  public static void puts_yellow(String string){
    System.out.println("\033[0;33m" + string + "\033[0m");
  }

  public static void puts_blue(String string){
    System.out.println("\033[0;34m" + string + "\033[0m");
  }

  public static void puts_purple(String string){
    System.out.println("\033[0;35m" + string + "\033[0m");
  }

  public static void puts_cyan(String string){
    System.out.println("\033[0;36m" + string + "\033[0m");
  }
  
  public static void puts_grey(String string){
    System.out.println("\033[0;37m" + string + "\033[0m");
  }

}
