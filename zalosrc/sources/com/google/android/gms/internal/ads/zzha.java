package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class zzha extends zzbw {

    /* renamed from: z */
    public static final g94 f32138z = a14.f16877a;

    /* renamed from: s */
    public final int f32139s;

    /* renamed from: t */
    public final String f32140t;

    /* renamed from: u */
    public final int f32141u;

    /* renamed from: v */
    public final C4671k3 f32142v;

    /* renamed from: w */
    public final int f32143w;

    /* renamed from: x */
    public final g10 f32144x;

    /* renamed from: y */
    final boolean f32145y;

    private zzha(int i11, Throwable th2, int i12) {
        this(i11, th2, null, i12, null, -1, null, 4, false);
    }

    /* renamed from: b */
    public static zzha m28830b(Throwable th2, String str, int i11, C4671k3 c4671k3, int i12, boolean z11, int i13) {
        int i14;
        if (c4671k3 == null) {
            i14 = 4;
        } else {
            i14 = i12;
        }
        return new zzha(1, th2, null, i13, str, i11, c4671k3, i14, z11);
    }

    /* renamed from: c */
    public static zzha m28831c(IOException iOException, int i11) {
        return new zzha(0, iOException, i11);
    }

    /* renamed from: d */
    public static zzha m28832d(RuntimeException runtimeException, int i11) {
        return new zzha(2, runtimeException, i11);
    }

    /* renamed from: a */
    public final zzha m28833a(g10 g10Var) {
        String message = getMessage();
        int i11 = g92.f20474a;
        return new zzha(message, getCause(), this.f31928p, this.f32139s, this.f32140t, this.f32141u, this.f32142v, this.f32143w, g10Var, this.f31929q, this.f32145y);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private zzha(int i11, Throwable th2, String str, int i12, String str2, int i13, C4671k3 c4671k3, int i14, boolean z11) {
        this(TextUtils.isEmpty(null) ? r0 : r0.concat(": null"), th2, i12, i11, str2, i13, c4671k3, i14, null, SystemClock.elapsedRealtime(), z11);
        String str3;
        if (i11 == 0) {
            str3 = "Source error";
        } else if (i11 != 1) {
            str3 = "Unexpected runtime error";
        } else {
            str3 = str2 + " error, index=" + i13 + ", format=" + String.valueOf(c4671k3) + ", format_supported=" + g92.m22355m(i14);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private zzha(String str, Throwable th2, int i11, int i12, String str2, int i13, C4671k3 c4671k3, int i14, g10 g10Var, long j11, boolean z11) {
        super(str, th2, i11, j11);
        int i15;
        boolean z12;
        if (z11) {
            i15 = i12;
            if (i15 != 1) {
                z12 = false;
                v71.m27173d(z12);
                v71.m27173d(th2 != null);
                this.f32139s = i15;
                this.f32140t = str2;
                this.f32141u = i13;
                this.f32142v = c4671k3;
                this.f32143w = i14;
                this.f32144x = g10Var;
                this.f32145y = z11;
            }
            i15 = 1;
        } else {
            i15 = i12;
        }
        z12 = true;
        v71.m27173d(z12);
        v71.m27173d(th2 != null);
        this.f32139s = i15;
        this.f32140t = str2;
        this.f32141u = i13;
        this.f32142v = c4671k3;
        this.f32143w = i14;
        this.f32144x = g10Var;
        this.f32145y = z11;
    }
}
