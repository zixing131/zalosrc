package com.zing.zalocore.connection.socket;

/* loaded from: classes7.dex */
public class NativeIPPort extends IPPort {

    /* renamed from: s */
    private String f89276s;

    public NativeIPPort(String str, int i11) {
        super(str, i11);
        this.f89276s = "";
    }

    /* renamed from: e */
    public String m93202e() {
        String str = this.f89276s;
        return str == null ? "" : str;
    }

    public NativeIPPort(String str, int i11, long j11, String str2) {
        super(str, i11, j11);
        this.f89276s = str2;
    }
}
