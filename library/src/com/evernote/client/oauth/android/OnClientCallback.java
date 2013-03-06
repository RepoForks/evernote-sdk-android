package com.evernote.client.oauth.android;

/**
 * This class must be implemented to use the {@link AsyncNoteStoreClient} and the {@link AsyncUserStoreClient}
 */
public interface OnClientCallback<T, Y extends Throwable> {

  /**
   * @param data sent to callback when the async operation has completed positively
   */
  public abstract void onResultsReceived(T data);

  /**
   * @param exception is the error sent to the callback when the async operation has completed negatively
   */
  public abstract void onErrorReceived(Y exception);
}
