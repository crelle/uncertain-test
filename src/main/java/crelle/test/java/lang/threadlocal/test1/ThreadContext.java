package crelle.test.java.lang.threadlocal.test1;

public class ThreadContext {
    private String userId;

    private Long transactionId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }

    public String toString() {
        return "userId:" + userId + ",transactionId:" + transactionId;
    }
}
