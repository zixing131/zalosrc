package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class c53 {

    /* renamed from: a */
    private final String f18114a;

    /* renamed from: b */
    private final b53 f18115b;

    /* renamed from: c */
    private b53 f18116c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ c53(String str, a53 a53Var) {
        b53 b53Var = new b53(null);
        this.f18115b = b53Var;
        this.f18116c = b53Var;
        str.getClass();
        this.f18114a = str;
    }

    /* renamed from: a */
    public final c53 m20808a(Object obj) {
        b53 b53Var = new b53(null);
        this.f18116c.f17599b = b53Var;
        this.f18116c = b53Var;
        b53Var.f17598a = obj;
        return this;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append(this.f18114a);
        sb2.append('{');
        b53 b53Var = this.f18115b.f17599b;
        String str = "";
        while (b53Var != null) {
            Object obj = b53Var.f17598a;
            sb2.append(str);
            if (obj != null && obj.getClass().isArray()) {
                sb2.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r3.length() - 1);
            } else {
                sb2.append(obj);
            }
            b53Var = b53Var.f17599b;
            str = ", ";
        }
        sb2.append('}');
        return sb2.toString();
    }
}
