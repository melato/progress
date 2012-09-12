/* 
 * Copyright (c) Alex Athanasopoulos 2007
 */
package org.melato.progress;

/**
 * Exception thrown by the progress indication framework when an operation is canceled.
 * @author Alex Athanasopoulos
 * @date Dec 1, 2007
 */
public class CanceledException extends RuntimeException {
  // consider using java.util.concurrent.CancellationException
  // The american spelling is canceled.  The british spelling is cancelled.
	static private final long serialVersionUID = 1L;
}
