package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* renamed from: com.google.android.gms.internal.ads.gl */
/* loaded from: classes2.dex */
final class C4542gl {

    /* renamed from: a */
    public final String f20724a;

    /* renamed from: b */
    public final boolean f20725b;

    public C4542gl(String str, boolean z11) {
        this.f20724a = str;
        this.f20725b = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == C4542gl.class) {
            C4542gl c4542gl = (C4542gl) obj;
            if (TextUtils.equals(this.f20724a, c4542gl.f20724a) && this.f20725b == c4542gl.f20725b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i11;
        String str = this.f20724a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i12 = (hashCode + 31) * 31;
        if (true != this.f20725b) {
            i11 = 1237;
        } else {
            i11 = 1231;
        }
        return i12 + i11;
    }
}
