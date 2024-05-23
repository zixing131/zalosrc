package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

/* loaded from: classes2.dex */
public final class a74 implements f94 {

    /* renamed from: h */
    public static final a63 f16959h = y64.f30819p;

    /* renamed from: i */
    private static final Random f16960i = new Random();

    /* renamed from: d */
    private final a63 f16964d;

    /* renamed from: e */
    private e94 f16965e;

    /* renamed from: g */
    private String f16967g;

    /* renamed from: a */
    private final jq0 f16961a = new jq0();

    /* renamed from: b */
    private final ho0 f16962b = new ho0();

    /* renamed from: c */
    private final HashMap f16963c = new HashMap();

    /* renamed from: f */
    private mr0 f16966f = mr0.f24725a;

    public a74(a63 a63Var) {
        this.f16964d = a63Var;
    }

    /* renamed from: j */
    private final z64 m20024j(int i11, gf4 gf4Var) {
        long j11;
        gf4 gf4Var2;
        gf4 gf4Var3;
        z64 z64Var = null;
        long j12 = Long.MAX_VALUE;
        for (z64 z64Var2 : this.f16963c.values()) {
            z64Var2.m28448g(i11, gf4Var);
            if (z64Var2.m28449j(i11, gf4Var)) {
                j11 = z64Var2.f31391c;
                if (j11 != -1 && j11 >= j12) {
                    if (j11 == j12) {
                        int i12 = g92.f20474a;
                        gf4Var2 = z64Var.f31392d;
                        if (gf4Var2 != null) {
                            gf4Var3 = z64Var2.f31392d;
                            if (gf4Var3 != null) {
                                z64Var = z64Var2;
                            }
                        }
                    }
                } else {
                    z64Var = z64Var2;
                    j12 = j11;
                }
            }
        }
        if (z64Var == null) {
            String m20025k = m20025k();
            z64 z64Var3 = new z64(this, m20025k, i11, gf4Var);
            this.f16963c.put(m20025k, z64Var3);
            return z64Var3;
        }
        return z64Var;
    }

    /* renamed from: k */
    public static String m20025k() {
        byte[] bArr = new byte[12];
        f16960i.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    /* renamed from: l */
    private final void m20026l(s44 s44Var) {
        String str;
        long j11;
        gf4 gf4Var;
        gf4 gf4Var2;
        gf4 gf4Var3;
        String unused;
        String unused2;
        if (s44Var.f27538b.m24700o()) {
            this.f16967g = null;
            return;
        }
        z64 z64Var = (z64) this.f16963c.get(this.f16967g);
        z64 m20024j = m20024j(s44Var.f27539c, s44Var.f27540d);
        str = m20024j.f31389a;
        this.f16967g = str;
        mo20032f(s44Var);
        gf4 gf4Var4 = s44Var.f27540d;
        if (gf4Var4 != null && gf4Var4.m22262b()) {
            if (z64Var != null) {
                j11 = z64Var.f31391c;
                if (j11 == s44Var.f27540d.f20366d) {
                    gf4Var = z64Var.f31392d;
                    if (gf4Var != null) {
                        gf4Var2 = z64Var.f31392d;
                        if (gf4Var2.f20364b == s44Var.f27540d.f20364b) {
                            gf4Var3 = z64Var.f31392d;
                            if (gf4Var3.f20365c == s44Var.f27540d.f20365c) {
                                return;
                            }
                        }
                    }
                }
            }
            gf4 gf4Var5 = s44Var.f27540d;
            unused = m20024j(s44Var.f27539c, new gf4(gf4Var5.f20363a, gf4Var5.f20366d)).f31389a;
            unused2 = m20024j.f31389a;
        }
    }

    @Override // com.google.android.gms.internal.ads.f94
    /* renamed from: a */
    public final synchronized void mo20027a(s44 s44Var) {
        boolean z11;
        String str;
        String str2;
        try {
            this.f16965e.getClass();
            mr0 mr0Var = this.f16966f;
            this.f16966f = s44Var.f27538b;
            Iterator it = this.f16963c.values().iterator();
            while (it.hasNext()) {
                z64 z64Var = (z64) it.next();
                if (z64Var.m28451l(mr0Var, this.f16966f) && !z64Var.m28450k(s44Var)) {
                }
                it.remove();
                z11 = z64Var.f31393e;
                if (z11) {
                    str = z64Var.f31389a;
                    if (str.equals(this.f16967g)) {
                        this.f16967g = null;
                    }
                    e94 e94Var = this.f16965e;
                    str2 = z64Var.f31389a;
                    e94Var.mo21301b(s44Var, str2, false);
                }
            }
            m20026l(s44Var);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.f94
    /* renamed from: b */
    public final synchronized String mo20028b(mr0 mr0Var, gf4 gf4Var) {
        String str;
        str = m20024j(mr0Var.mo23650n(gf4Var.f20363a, this.f16962b).f21855c, gf4Var).f31389a;
        return str;
    }

    @Override // com.google.android.gms.internal.ads.f94
    /* renamed from: c */
    public final void mo20029c(e94 e94Var) {
        this.f16965e = e94Var;
    }

    @Override // com.google.android.gms.internal.ads.f94
    /* renamed from: d */
    public final synchronized void mo20030d(s44 s44Var) {
        boolean z11;
        e94 e94Var;
        String str;
        this.f16967g = null;
        Iterator it = this.f16963c.values().iterator();
        while (it.hasNext()) {
            z64 z64Var = (z64) it.next();
            it.remove();
            z11 = z64Var.f31393e;
            if (z11 && (e94Var = this.f16965e) != null) {
                str = z64Var.f31389a;
                e94Var.mo21301b(s44Var, str, false);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.f94
    /* renamed from: e */
    public final synchronized void mo20031e(s44 s44Var, int i11) {
        boolean z11;
        String str;
        String str2;
        boolean z12;
        try {
            this.f16965e.getClass();
            Iterator it = this.f16963c.values().iterator();
            while (it.hasNext()) {
                z64 z64Var = (z64) it.next();
                if (z64Var.m28450k(s44Var)) {
                    it.remove();
                    z11 = z64Var.f31393e;
                    if (z11) {
                        str = z64Var.f31389a;
                        boolean equals = str.equals(this.f16967g);
                        boolean z13 = false;
                        if (i11 == 0 && equals) {
                            z12 = z64Var.f31394f;
                            if (z12) {
                                z13 = true;
                            }
                        }
                        if (equals) {
                            this.f16967g = null;
                        }
                        e94 e94Var = this.f16965e;
                        str2 = z64Var.f31389a;
                        e94Var.mo21301b(s44Var, str2, z13);
                    }
                }
            }
            m20026l(s44Var);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0040, code lost:            if (r1 < r3) goto L72;     */
    @Override // com.google.android.gms.internal.ads.f94
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void mo20032f(s44 s44Var) {
        boolean z11;
        String str;
        boolean z12;
        String str2;
        boolean z13;
        String str3;
        long j11;
        long j12;
        int i11;
        String unused;
        String unused2;
        try {
            this.f16965e.getClass();
        } catch (Throwable th2) {
            throw th2;
        }
        if (s44Var.f27538b.m24700o()) {
            return;
        }
        z64 z64Var = (z64) this.f16963c.get(this.f16967g);
        if (s44Var.f27540d != null && z64Var != null) {
            j11 = z64Var.f31391c;
            if (j11 == -1) {
                i11 = z64Var.f31390b;
                if (i11 == s44Var.f27539c) {
                }
                return;
            } else {
                long j13 = s44Var.f27540d.f20366d;
                j12 = z64Var.f31391c;
            }
            throw th2;
        }
        z64 m20024j = m20024j(s44Var.f27539c, s44Var.f27540d);
        if (this.f16967g == null) {
            str3 = m20024j.f31389a;
            this.f16967g = str3;
        }
        gf4 gf4Var = s44Var.f27540d;
        if (gf4Var != null && gf4Var.m22262b()) {
            z64 m20024j2 = m20024j(s44Var.f27539c, new gf4(gf4Var.f20363a, gf4Var.f20366d, gf4Var.f20364b));
            z13 = m20024j2.f31393e;
            if (!z13) {
                m20024j2.f31393e = true;
                s44Var.f27538b.mo23650n(s44Var.f27540d.f20363a, this.f16962b);
                this.f16962b.m22986h(s44Var.f27540d.f20364b);
                Math.max(0L, g92.m22352j0(0L) + g92.m22352j0(0L));
                unused = m20024j2.f31389a;
            }
        }
        z11 = m20024j.f31393e;
        if (!z11) {
            m20024j.f31393e = true;
            unused2 = m20024j.f31389a;
        }
        str = m20024j.f31389a;
        if (str.equals(this.f16967g)) {
            z12 = m20024j.f31394f;
            if (!z12) {
                m20024j.f31394f = true;
                e94 e94Var = this.f16965e;
                str2 = m20024j.f31389a;
                e94Var.mo21303d(s44Var, str2);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.f94
    public final synchronized String zzd() {
        return this.f16967g;
    }
}
