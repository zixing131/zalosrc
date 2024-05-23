package com.google.android.gms.common.api;

/* loaded from: classes.dex */
public class ApiException extends Exception {

    /* renamed from: p */
    protected final Status f16159p;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ApiException(Status status) {
        super(r0 + ": " + r1);
        String str;
        int m19220F = status.m19220F();
        if (status.m19221J() != null) {
            str = status.m19221J();
        } else {
            str = "";
        }
        this.f16159p = status;
    }

    /* renamed from: a */
    public Status m19215a() {
        return this.f16159p;
    }

    /* renamed from: b */
    public int m19216b() {
        return this.f16159p.m19220F();
    }
}
