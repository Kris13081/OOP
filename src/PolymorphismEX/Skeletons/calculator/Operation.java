package PolymorphismEX.Skeletons.calculator;

public interface Operation {
    void addOperand(int operand);
    int getResult();
    boolean isCompleted();
}
