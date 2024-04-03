package org.example.state.ex2;

public interface PackageState {
    void next(Package p);
    void prev(Package p);

    void printStatus();
}
