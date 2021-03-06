package io.eventuate.messaging.activemq.spring.consumer;

public class Subscription {

  private Runnable closingCallback;

  public Subscription(Runnable closingCallback) {
    this.closingCallback = closingCallback;
  }

  public void close() {
    closingCallback.run();
  }
}
