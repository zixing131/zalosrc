package com.zing.zalo.webview;

import fn0.AbstractC19074t;

/* renamed from: com.zing.zalo.webview.p */
/* loaded from: classes5.dex */
public final class C16800p {

    /* renamed from: a */
    private final int f85285a;

    /* renamed from: b */
    private final String f85286b;

    public C16800p(int i11, String str) {
        this.f85285a = i11;
        this.f85286b = str;
    }

    /* renamed from: a */
    public final String m89733a() {
        return this.f85286b;
    }

    /* renamed from: b */
    public final int m89734b() {
        return this.f85285a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16800p)) {
            return false;
        }
        C16800p c16800p = (C16800p) obj;
        return this.f85285a == c16800p.f85285a && AbstractC19074t.m100204b(this.f85286b, c16800p.f85286b);
    }

    public int hashCode() {
        int i11 = this.f85285a * 31;
        String str = this.f85286b;
        return i11 + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "WebviewInMiniApp(sessionId=" + this.f85285a + ", maId=" + this.f85286b + ")";
    }
}
