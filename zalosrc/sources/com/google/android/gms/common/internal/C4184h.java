package com.google.android.gms.common.internal;

import android.util.Log;

/* renamed from: com.google.android.gms.common.internal.h */
/* loaded from: classes2.dex */
public final class C4184h {

    /* renamed from: a */
    private final String f16618a;

    /* renamed from: b */
    private final String f16619b;

    public C4184h(String str) {
        this(str, null);
    }

    /* renamed from: g */
    private final String m19688g(String str) {
        String str2 = this.f16619b;
        if (str2 == null) {
            return str;
        }
        return str2.concat(str);
    }

    /* renamed from: a */
    public boolean m19689a(int i11) {
        return Log.isLoggable(this.f16618a, i11);
    }

    /* renamed from: b */
    public void m19690b(String str, String str2) {
        if (m19689a(3)) {
            m19688g(str2);
        }
    }

    /* renamed from: c */
    public void m19691c(String str, String str2) {
        if (m19689a(6)) {
            m19688g(str2);
        }
    }

    /* renamed from: d */
    public void m19692d(String str, String str2, Throwable th2) {
        if (m19689a(6)) {
            m19688g(str2);
        }
    }

    /* renamed from: e */
    public void m19693e(String str, String str2) {
        if (m19689a(2)) {
            m19688g(str2);
        }
    }

    /* renamed from: f */
    public void m19694f(String str, String str2) {
        if (m19689a(5)) {
            m19688g(str2);
        }
    }

    public C4184h(String str, String str2) {
        AbstractC4205o.m19723l(str, "log tag cannot be null");
        AbstractC4205o.m19714c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.f16618a = str;
        if (str2 == null || str2.length() <= 0) {
            this.f16619b = null;
        } else {
            this.f16619b = str2;
        }
    }
}
