package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class jj0 {

    /* renamed from: j */
    public static final g94 f22832j = new g94() { // from class: com.google.android.gms.internal.ads.ii0
    };

    /* renamed from: a */
    public final Object f22833a;

    /* renamed from: b */
    public final int f22834b;

    /* renamed from: c */
    public final C4330au f22835c;

    /* renamed from: d */
    public final Object f22836d;

    /* renamed from: e */
    public final int f22837e;

    /* renamed from: f */
    public final long f22838f;

    /* renamed from: g */
    public final long f22839g;

    /* renamed from: h */
    public final int f22840h;

    /* renamed from: i */
    public final int f22841i;

    public jj0(Object obj, int i11, C4330au c4330au, Object obj2, int i12, long j11, long j12, int i13, int i14) {
        this.f22833a = obj;
        this.f22834b = i11;
        this.f22835c = c4330au;
        this.f22836d = obj2;
        this.f22837e = i12;
        this.f22838f = j11;
        this.f22839g = j12;
        this.f22840h = i13;
        this.f22841i = i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && jj0.class == obj.getClass()) {
            jj0 jj0Var = (jj0) obj;
            if (this.f22834b == jj0Var.f22834b && this.f22837e == jj0Var.f22837e && this.f22838f == jj0Var.f22838f && this.f22839g == jj0Var.f22839g && this.f22840h == jj0Var.f22840h && this.f22841i == jj0Var.f22841i && e53.m21617a(this.f22833a, jj0Var.f22833a) && e53.m21617a(this.f22836d, jj0Var.f22836d) && e53.m21617a(this.f22835c, jj0Var.f22835c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f22833a, Integer.valueOf(this.f22834b), this.f22835c, this.f22836d, Integer.valueOf(this.f22837e), Long.valueOf(this.f22838f), Long.valueOf(this.f22839g), Integer.valueOf(this.f22840h), Integer.valueOf(this.f22841i)});
    }
}
