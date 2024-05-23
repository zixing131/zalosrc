package com.zing.zalo.zalocloud.exception;

import fn0.AbstractC19074t;

/* loaded from: classes7.dex */
public final class ZaloCloudItemException extends Exception {

    /* renamed from: p */
    private final String f85364p;

    public ZaloCloudItemException(String str) {
        AbstractC19074t.m100208f(str, "errorMessage");
        this.f85364p = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ZaloCloudItemException) && AbstractC19074t.m100204b(this.f85364p, ((ZaloCloudItemException) obj).f85364p);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f85364p;
    }

    public int hashCode() {
        return this.f85364p.hashCode();
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "ZaloCloudItemException(errorMessage=" + this.f85364p + ")";
    }
}
