package crelle.test.java.auxiliary.beans;

/**
 * @Author: 张强
 * @Date: 2024/5/22 16:03
 * @Description:
 */public enum StoreType {
    LIGHT_AUTH_STORE(1, "轻认证门店"),
    SASS_STORE(2, "SaaS门店");

    private final int code;
    private final String description;

    StoreType(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public static StoreType fromCode(int code) {
        for (StoreType type : StoreType.values()) {
            if (type.code == code) {
                return type;
            }
        }
        throw new IllegalArgumentException("Unknown code: " + code);
    }

}
