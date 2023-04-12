package org.practice.thread.excerise.Sync;

public class Increment {
    int count;
    synchronized void increment()
    {
        ++this.count;
    }
}