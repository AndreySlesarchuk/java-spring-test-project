package by.atmm.gof.behavioral.observer.bank;
/**
 * Created by Andrey Slesarchuk on 07/26/2020.
 */
public interface Observer {
  //method to update the observer, used by subject
  public void update(Subject subject);
}
