package com.google.android.gms.internal.ads;

import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public abstract class bu3 extends bt3 {

    /* renamed from: b */
    private static final Logger f17986b = Logger.getLogger(bu3.class.getName());

    /* renamed from: c */
    private static final boolean f17987c = ix3.m23439a();

    /* renamed from: a */
    cu3 f17988a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ bu3(au3 au3Var) {
    }

    /* renamed from: E */
    public static int m20726E(mt3 mt3Var) {
        int mo22168p = mt3Var.mo22168p();
        return m20733f(mo22168p) + mo22168p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: F */
    public static int m20727F(int i11, zv3 zv3Var, tw3 tw3Var) {
        int m20733f = m20733f(i11 << 3);
        int i12 = m20733f + m20733f;
        vs3 vs3Var = (vs3) zv3Var;
        int mo26774d = vs3Var.mo26774d();
        if (mo26774d == -1) {
            mo26774d = tw3Var.zza(vs3Var);
            vs3Var.mo26778j(mo26774d);
        }
        return i12 + mo26774d;
    }

    /* renamed from: G */
    public static int m20728G(int i11) {
        if (i11 >= 0) {
            return m20733f(i11);
        }
        return 10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static int m20729b(zv3 zv3Var, tw3 tw3Var) {
        vs3 vs3Var = (vs3) zv3Var;
        int mo26774d = vs3Var.mo26774d();
        if (mo26774d == -1) {
            mo26774d = tw3Var.zza(vs3Var);
            vs3Var.mo26778j(mo26774d);
        }
        return m20733f(mo26774d) + mo26774d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static int m20730c(int i11) {
        if (i11 > 4096) {
            return 4096;
        }
        return i11;
    }

    /* renamed from: d */
    public static int m20731d(String str) {
        int length;
        try {
            length = nx3.m25035e(str);
        } catch (mx3 unused) {
            length = str.getBytes(dv3.f19426b).length;
        }
        return m20733f(length) + length;
    }

    /* renamed from: e */
    public static int m20732e(int i11) {
        return m20733f(i11 << 3);
    }

    /* renamed from: f */
    public static int m20733f(int i11) {
        if ((i11 & (-128)) == 0) {
            return 1;
        }
        if ((i11 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i11) == 0) {
            return 3;
        }
        return (i11 & (-268435456)) == 0 ? 4 : 5;
    }

    /* renamed from: g */
    public static int m20734g(long j11) {
        int i11;
        if (((-128) & j11) == 0) {
            return 1;
        }
        if (j11 < 0) {
            return 10;
        }
        if (((-34359738368L) & j11) != 0) {
            j11 >>>= 28;
            i11 = 6;
        } else {
            i11 = 2;
        }
        if (((-2097152) & j11) != 0) {
            i11 += 2;
            j11 >>>= 14;
        }
        return (j11 & (-16384)) != 0 ? i11 + 1 : i11;
    }

    /* renamed from: h */
    public static bu3 m20735h(byte[] bArr) {
        return new yt3(bArr, 0, bArr.length);
    }

    /* renamed from: i */
    public static bu3 m20736i(OutputStream outputStream, int i11) {
        return new zt3(outputStream, i11);
    }

    /* renamed from: A */
    public abstract void mo20738A(int i11, int i12);

    /* renamed from: B */
    public abstract void mo20739B(int i11);

    /* renamed from: C */
    public abstract void mo20740C(int i11, long j11);

    /* renamed from: D */
    public abstract void mo20741D(long j11);

    @Override // com.google.android.gms.internal.ads.bt3
    /* renamed from: a */
    public abstract void mo20711a(byte[] bArr, int i11, int i12);

    /* renamed from: j */
    public final void m20742j() {
        if (mo20748q() == 0) {
        } else {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public final void m20743k(String str, mx3 mx3Var) {
        f17986b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) mx3Var);
        byte[] bytes = str.getBytes(dv3.f19426b);
        try {
            int length = bytes.length;
            mo20739B(length);
            mo20711a(bytes, 0, length);
        } catch (IndexOutOfBoundsException e11) {
            throw new zzgqi(e11);
        }
    }

    /* renamed from: m */
    public abstract void mo20744m();

    /* renamed from: n */
    public abstract void mo20745n(byte b11);

    /* renamed from: o */
    public abstract void mo20746o(int i11, boolean z11);

    /* renamed from: p */
    public abstract void mo20747p(int i11, mt3 mt3Var);

    /* renamed from: q */
    public abstract int mo20748q();

    /* renamed from: r */
    public abstract void mo20749r(int i11, int i12);

    /* renamed from: s */
    public abstract void mo20750s(int i11);

    /* renamed from: t */
    public abstract void mo20751t(int i11, long j11);

    /* renamed from: u */
    public abstract void mo20752u(long j11);

    /* renamed from: v */
    public abstract void mo20753v(int i11, int i12);

    /* renamed from: w */
    public abstract void mo20754w(int i11);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public abstract void mo20755x(int i11, zv3 zv3Var, tw3 tw3Var);

    /* renamed from: y */
    public abstract void mo20756y(int i11, String str);

    /* renamed from: z */
    public abstract void mo20757z(int i11, int i12);
}
