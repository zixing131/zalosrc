package com.zing.zalo.zalocloud.exception;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* loaded from: classes7.dex */
public final class ZaloCloudDBException extends Exception {

    /* renamed from: p */
    private final int f85362p;

    /* renamed from: q */
    private final String f85363q;

    public ZaloCloudDBException() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZaloCloudDBException)) {
            return false;
        }
        ZaloCloudDBException zaloCloudDBException = (ZaloCloudDBException) obj;
        return this.f85362p == zaloCloudDBException.f85362p && AbstractC19074t.m100204b(this.f85363q, zaloCloudDBException.f85363q);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return "(" + this.f85362p + ") " + this.f85363q;
    }

    public int hashCode() {
        return (this.f85362p * 31) + this.f85363q.hashCode();
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "ZaloCloudDBException(errorCode=" + this.f85362p + ", errorMessage=" + this.f85363q + ")";
    }

    public /* synthetic */ ZaloCloudDBException(int i11, String str, int i12, AbstractC19060k abstractC19060k) {
        this((i12 & 1) != 0 ? -1 : i11, (i12 & 2) != 0 ? "" : str);
    }

    public ZaloCloudDBException(int i11, String str) {
        AbstractC19074t.m100208f(str, "errorMessage");
        this.f85362p = i11;
        this.f85363q = str;
    }
}
