package exception_handling;

public interface CheckedExceptionHandlerConsumer<Target,ExceptionObj extends  Exception> {
    public void accept(Target target) throws ExceptionObj;
}
