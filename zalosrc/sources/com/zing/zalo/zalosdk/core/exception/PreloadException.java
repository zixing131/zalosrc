package com.zing.zalo.zalosdk.core.exception;

/* loaded from: classes.dex */
public class PreloadException extends Exception {

    /* renamed from: p */
    private String f86028p;

    public PreloadException(String str) {
        this.f86028p = str;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f86028p;
    }
}
