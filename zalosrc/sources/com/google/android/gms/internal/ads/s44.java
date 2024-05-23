package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class s44 {

    /* renamed from: a */
    public final long f27537a;

    /* renamed from: b */
    public final mr0 f27538b;

    /* renamed from: c */
    public final int f27539c;

    /* renamed from: d */
    public final gf4 f27540d;

    /* renamed from: e */
    public final long f27541e;

    /* renamed from: f */
    public final mr0 f27542f;

    /* renamed from: g */
    public final int f27543g;

    /* renamed from: h */
    public final gf4 f27544h;

    /* renamed from: i */
    public final long f27545i;

    /* renamed from: j */
    public final long f27546j;

    public s44(long j11, mr0 mr0Var, int i11, gf4 gf4Var, long j12, mr0 mr0Var2, int i12, gf4 gf4Var2, long j13, long j14) {
        this.f27537a = j11;
        this.f27538b = mr0Var;
        this.f27539c = i11;
        this.f27540d = gf4Var;
        this.f27541e = j12;
        this.f27542f = mr0Var2;
        this.f27543g = i12;
        this.f27544h = gf4Var2;
        this.f27545i = j13;
        this.f27546j = j14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && s44.class == obj.getClass()) {
            s44 s44Var = (s44) obj;
            if (this.f27537a == s44Var.f27537a && this.f27539c == s44Var.f27539c && this.f27541e == s44Var.f27541e && this.f27543g == s44Var.f27543g && this.f27545i == s44Var.f27545i && this.f27546j == s44Var.f27546j && e53.m21617a(this.f27538b, s44Var.f27538b) && e53.m21617a(this.f27540d, s44Var.f27540d) && e53.m21617a(this.f27542f, s44Var.f27542f) && e53.m21617a(this.f27544h, s44Var.f27544h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f27537a), this.f27538b, Integer.valueOf(this.f27539c), this.f27540d, Long.valueOf(this.f27541e), this.f27542f, Integer.valueOf(this.f27543g), this.f27544h, Long.valueOf(this.f27545i), Long.valueOf(this.f27546j)});
    }
}
