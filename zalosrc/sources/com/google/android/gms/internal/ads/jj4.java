package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class jj4 {

    /* renamed from: a */
    private int f22849a;

    /* renamed from: b */
    private int f22850b;

    /* renamed from: c */
    private int f22851c = 0;

    /* renamed from: d */
    private cj4[] f22852d = new cj4[100];

    public jj4(boolean z11, int i11) {
    }

    /* renamed from: a */
    public final synchronized int m23623a() {
        return this.f22850b * 65536;
    }

    /* renamed from: b */
    public final synchronized cj4 m23624b() {
        cj4 cj4Var;
        try {
            this.f22850b++;
            int i11 = this.f22851c;
            if (i11 > 0) {
                cj4[] cj4VarArr = this.f22852d;
                int i12 = i11 - 1;
                this.f22851c = i12;
                cj4Var = cj4VarArr[i12];
                cj4Var.getClass();
                cj4VarArr[i12] = null;
            } else {
                cj4Var = new cj4(new byte[65536], 0);
                int i13 = this.f22850b;
                cj4[] cj4VarArr2 = this.f22852d;
                int length = cj4VarArr2.length;
                if (i13 > length) {
                    this.f22852d = (cj4[]) Arrays.copyOf(cj4VarArr2, length + length);
                    return cj4Var;
                }
            }
            return cj4Var;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: c */
    public final synchronized void m23625c(cj4 cj4Var) {
        cj4[] cj4VarArr = this.f22852d;
        int i11 = this.f22851c;
        this.f22851c = i11 + 1;
        cj4VarArr[i11] = cj4Var;
        this.f22850b--;
        notifyAll();
    }

    /* renamed from: d */
    public final synchronized void m23626d(dj4 dj4Var) {
        while (dj4Var != null) {
            try {
                cj4[] cj4VarArr = this.f22852d;
                int i11 = this.f22851c;
                this.f22851c = i11 + 1;
                cj4VarArr[i11] = dj4Var.zzc();
                this.f22850b--;
                dj4Var = dj4Var.zzd();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        notifyAll();
    }

    /* renamed from: e */
    public final synchronized void m23627e() {
        m23628f(0);
    }

    /* renamed from: f */
    public final synchronized void m23628f(int i11) {
        int i12 = this.f22849a;
        this.f22849a = i11;
        if (i11 < i12) {
            m23629g();
        }
    }

    /* renamed from: g */
    public final synchronized void m23629g() {
        int max = Math.max(0, g92.m22321O(this.f22849a, 65536) - this.f22850b);
        int i11 = this.f22851c;
        if (max >= i11) {
            return;
        }
        Arrays.fill(this.f22852d, max, i11, (Object) null);
        this.f22851c = max;
    }
}
