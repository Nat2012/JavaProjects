package datatype;

public final class  FinalExample {
    static final int DECLARATION_CONSTANT = 500;
    private static final String staticVariable;

    private final String ConstructorVariable;

    static {
        staticVariable = "";
    }

    public FinalExample(String constructorVariable) {
        ConstructorVariable = constructorVariable;
    }
}
