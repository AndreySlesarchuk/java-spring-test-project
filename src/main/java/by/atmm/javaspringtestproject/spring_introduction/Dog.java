package by.atmm.javaspringtestproject.spring_introduction;

/**
 *  @author Andrey Slesarchuk
 *  @date 2022-06-01
 */


public class Dog implements Pet {

  public Dog() {
    System.out.println("Dog bean is created!");
  }

  @Override
  public void say() {
    System.out.println("Boow-wow");
  }
}
