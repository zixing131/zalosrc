package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* loaded from: classes2.dex */
final class rd4 {

    /* renamed from: a */
    public final String f27168a;

    /* renamed from: b */
    public final boolean f27169b;

    /* renamed from: c */
    public final boolean f27170c;

    public rd4(String str, boolean z11, boolean z12) {
        this.f27168a = str;
        this.f27169b = z11;
        this.f27170c = z12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == rd4.class) {
            rd4 rd4Var = (rd4) obj;
            if (TextUtils.equals(this.f27168a, rd4Var.f27168a) && this.f27169b == rd4Var.f27169b && this.f27170c == rd4Var.f27170c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i11;
        int hashCode = (this.f27168a.hashCode() + 31) * 31;
        int i12 = 1231;
        if (true != this.f27169b) {
            i11 = 1237;
        } else {
            i11 = 1231;
        }
        int i13 = (hashCode + i11) * 31;
        if (true != this.f27170c) {
            i12 = 1237;
        }
        return i13 + i12;
    }
}
