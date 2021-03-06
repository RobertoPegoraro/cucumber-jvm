package cucumber.api.event;

import cucumber.api.TestCase;

public final class WriteEvent extends TestCaseEvent {
    public final String text;
    public final String name;
    
    @Deprecated
    public WriteEvent(Long timeStamp, TestCase testCase, String text) {
        this(timeStamp, 0, testCase, text);
    }

    public WriteEvent(Long timeStamp, long timeStampMillis, TestCase testCase, String text) {
        super(timeStamp, timeStampMillis, testCase);
        this.text = text;
        this.name = null;
    }
    
    public WriteEvent(Long timeStamp, long timeStampMillis, TestCase testCase, String name, String text) {
        super(timeStamp, timeStampMillis, testCase);
        this.name = name;
        this.text = text;
    }
}
