package com.zing.zalo.p062db.zadb.wrapper;

/* loaded from: classes3.dex */
public class ZdbApiCode {
    public int error_code;

    public String toString() {
        switch (this.error_code) {
            case 0:
                return "ZDBAPI_SUCCESS(" + this.error_code + ")";
            case 1:
                return "ZDBAPI_ERR_IS_MIGRATEING(" + this.error_code + ")";
            case 2:
                return "ZDBAPI_ERR_INVALID_UID(" + this.error_code + ")";
            case 3:
                return "ZDBAPI_ERR_INVALID_PARAMS(" + this.error_code + ")";
            case 4:
                return "ZDBAPI_ERR_OPERATOR_FAIL(" + this.error_code + ")";
            case 5:
                return "ZDBAPI_ERR_TIMEOUT(" + this.error_code + ")";
            case 6:
                return "ZDBAPI_ERR_OUT_OF_MEMORY(" + this.error_code + ")";
            case 7:
                return "ZDBAPI_ERR_CONFIG_NOT_SET(" + this.error_code + ")";
            case 8:
                return "ZDBAPI_ERR_OPEN_DB_SEARCH_CHAT(" + this.error_code + ")";
            default:
                return "UNKNOWN(" + this.error_code + ")";
        }
    }
}
