package com.google.android.gms.internal.measurement;

import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.measurement.e9 */
/* loaded from: classes.dex */
public abstract class AbstractC5357e9 extends AbstractC5492m8 {

    /* renamed from: b */
    private static final Logger f32352b = Logger.getLogger(AbstractC5357e9.class.getName());

    /* renamed from: c */
    private static final boolean f32353c = AbstractC5648vb.m29778C();

    /* renamed from: d */
    public static final /* synthetic */ int f32354d = 0;

    /* renamed from: a */
    C5374f9 f32355a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ AbstractC5357e9(AbstractC5340d9 abstractC5340d9) {
    }

    /* renamed from: A */
    public static AbstractC5357e9 m29083A(byte[] bArr, int i11, int i12) {
        return new C5323c9(bArr, 0, i12);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static /* bridge */ /* synthetic */ boolean m29084c() {
        return f32353c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public static int m29085u(int i11, InterfaceC5647va interfaceC5647va, InterfaceC5393gb interfaceC5393gb) {
        int mo29187d = ((AbstractC5407h8) interfaceC5647va).mo29187d(interfaceC5393gb);
        int m29089y = m29089y(i11 << 3);
        return m29089y + m29089y + mo29187d;
    }

    /* renamed from: v */
    public static int m29086v(int i11) {
        if (i11 >= 0) {
            return m29089y(i11);
        }
        return 10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public static int m29087w(InterfaceC5647va interfaceC5647va, InterfaceC5393gb interfaceC5393gb) {
        int mo29187d = ((AbstractC5407h8) interfaceC5647va).mo29187d(interfaceC5393gb);
        return m29089y(mo29187d) + mo29187d;
    }

    /* renamed from: x */
    public static int m29088x(String str) {
        int length;
        try {
            length = AbstractC5292ac.m28888c(str);
        } catch (C5716zb unused) {
            length = str.getBytes(AbstractC5290aa.f32257b).length;
        }
        return m29089y(length) + length;
    }

    /* renamed from: y */
    public static int m29089y(int i11) {
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

    /* renamed from: z */
    public static int m29090z(long j11) {
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
            j11 >>>= 14;
            i11 += 2;
        }
        return (j11 & (-16384)) != 0 ? i11 + 1 : i11;
    }

    /* renamed from: a */
    public final void m29091a() {
        if (mo28973d() == 0) {
        } else {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m29092b(String str, C5716zb c5716zb) {
        f32352b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) c5716zb);
        byte[] bytes = str.getBytes(AbstractC5290aa.f32257b);
        try {
            int length = bytes.length;
            mo28987r(length);
            mo28983n(bytes, 0, length);
        } catch (IndexOutOfBoundsException e11) {
            throw new zzkg(e11);
        }
    }

    /* renamed from: d */
    public abstract int mo28973d();

    /* renamed from: e */
    public abstract void mo28974e(byte b11);

    /* renamed from: f */
    public abstract void mo28975f(int i11, boolean z11);

    /* renamed from: g */
    public abstract void mo28976g(int i11, AbstractC5679x8 abstractC5679x8);

    /* renamed from: h */
    public abstract void mo28977h(int i11, int i12);

    /* renamed from: i */
    public abstract void mo28978i(int i11);

    /* renamed from: j */
    public abstract void mo28979j(int i11, long j11);

    /* renamed from: k */
    public abstract void mo28980k(long j11);

    /* renamed from: l */
    public abstract void mo28981l(int i11, int i12);

    /* renamed from: m */
    public abstract void mo28982m(int i11);

    /* renamed from: n */
    public abstract void mo28983n(byte[] bArr, int i11, int i12);

    /* renamed from: o */
    public abstract void mo28984o(int i11, String str);

    /* renamed from: p */
    public abstract void mo28985p(int i11, int i12);

    /* renamed from: q */
    public abstract void mo28986q(int i11, int i12);

    /* renamed from: r */
    public abstract void mo28987r(int i11);

    /* renamed from: s */
    public abstract void mo28988s(int i11, long j11);

    /* renamed from: t */
    public abstract void mo28989t(long j11);
}
