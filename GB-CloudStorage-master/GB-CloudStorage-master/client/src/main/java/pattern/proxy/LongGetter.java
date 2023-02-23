package pattern.proxy;

public interface LongGetter {

    default long getLong (long value) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return value;
    }
}
