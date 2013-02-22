Progress Indication library

It defines interfaces and mechanisms for producing progress generation
without passing around progress objects.

It does this by mapping progress handlers with threads, so that any code
can find and use the progress interface corresponding to its thread.
