package com.google.android.gms.internal.play_billing;

import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.play_billing.u0 */
/* loaded from: classes2.dex */
public abstract class AbstractC5845u0 extends AbstractC5743d0 {

    /* renamed from: b */
    private static final Logger f33431b = Logger.getLogger(AbstractC5845u0.class.getName());

    /* renamed from: c */
    private static final boolean f33432c = AbstractC5770h3.m30245C();

    /* renamed from: d */
    public static final /* synthetic */ int f33433d = 0;

    /* renamed from: a */
    C5851v0 f33434a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ AbstractC5845u0(AbstractC5839t0 abstractC5839t0) {
    }

    /* renamed from: A */
    public static AbstractC5845u0 m30482A(byte[] bArr, int i11, int i12) {
        return new C5833s0(bArr, 0, i12);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static /* bridge */ /* synthetic */ boolean m30483c() {
        return f33432c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public static int m30484u(int i11, InterfaceC5775i2 interfaceC5775i2, InterfaceC5835s2 interfaceC5835s2) {
        int mo30283b = ((AbstractC5868y) interfaceC5775i2).mo30283b(interfaceC5835s2);
        int m30488y = m30488y(i11 << 3);
        return m30488y + m30488y + mo30283b;
    }

    /* renamed from: v */
    public static int m30485v(int i11) {
        if (i11 >= 0) {
            return m30488y(i11);
        }
        return 10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public static int m30486w(InterfaceC5775i2 interfaceC5775i2, InterfaceC5835s2 interfaceC5835s2) {
        int mo30283b = ((AbstractC5868y) interfaceC5775i2).mo30283b(interfaceC5835s2);
        return m30488y(mo30283b) + mo30283b;
    }

    /* renamed from: x */
    public static int m30487x(String str) {
        int length;
        try {
            length = AbstractC5800m3.m30364c(str);
        } catch (C5794l3 unused) {
            length = str.getBytes(AbstractC5804n1.f33376b).length;
        }
        return m30488y(length) + length;
    }

    /* renamed from: y */
    public static int m30488y(int i11) {
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
    public static int m30489z(long j11) {
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
    public final void m30490a() {
        if (mo30448d() == 0) {
        } else {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m30491b(String str, C5794l3 c5794l3) {
        f33431b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) c5794l3);
        byte[] bytes = str.getBytes(AbstractC5804n1.f33376b);
        try {
            int length = bytes.length;
            mo30462r(length);
            mo30458n(bytes, 0, length);
        } catch (IndexOutOfBoundsException e11) {
            throw new zzec(e11);
        }
    }

    /* renamed from: d */
    public abstract int mo30448d();

    /* renamed from: e */
    public abstract void mo30449e(byte b11);

    /* renamed from: f */
    public abstract void mo30450f(int i11, boolean z11);

    /* renamed from: g */
    public abstract void mo30451g(int i11, AbstractC5803n0 abstractC5803n0);

    /* renamed from: h */
    public abstract void mo30452h(int i11, int i12);

    /* renamed from: i */
    public abstract void mo30453i(int i11);

    /* renamed from: j */
    public abstract void mo30454j(int i11, long j11);

    /* renamed from: k */
    public abstract void mo30455k(long j11);

    /* renamed from: l */
    public abstract void mo30456l(int i11, int i12);

    /* renamed from: m */
    public abstract void mo30457m(int i11);

    /* renamed from: n */
    public abstract void mo30458n(byte[] bArr, int i11, int i12);

    /* renamed from: o */
    public abstract void mo30459o(int i11, String str);

    /* renamed from: p */
    public abstract void mo30460p(int i11, int i12);

    /* renamed from: q */
    public abstract void mo30461q(int i11, int i12);

    /* renamed from: r */
    public abstract void mo30462r(int i11);

    /* renamed from: s */
    public abstract void mo30463s(int i11, long j11);

    /* renamed from: t */
    public abstract void mo30464t(long j11);
}
