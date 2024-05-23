package fm;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p602w9.AbstractC28826b;
import p602w9.C28825a;

/* renamed from: fm.a */
/* loaded from: classes3.dex */
public final class C18998a extends AbstractC28826b {
    /* renamed from: A */
    public static void m99747A(C28825a c28825a, int i11) {
        c28825a.m144098l(18, i11, 0);
    }

    /* renamed from: B */
    public static void m99748B(C28825a c28825a, long j11) {
        c28825a.m144095i(8, j11, 0L);
    }

    /* renamed from: C */
    public static void m99749C(C28825a c28825a, int i11) {
        c28825a.m144098l(20, i11, 0);
    }

    /* renamed from: D */
    public static void m99750D(C28825a c28825a, int i11) {
        c28825a.m144094h(23, i11, 0);
    }

    /* renamed from: E */
    public static void m99751E(C28825a c28825a, long j11) {
        c28825a.m144095i(24, j11, 0L);
    }

    /* renamed from: F */
    public static void m99752F(C28825a c28825a, byte b11) {
        c28825a.m144090d(1, b11, 0);
    }

    /* renamed from: G */
    public static void m99753G(C28825a c28825a, int i11) {
        c28825a.m144094h(4, i11, 0);
    }

    /* renamed from: H */
    public static void m99754H(C28825a c28825a, long j11) {
        c28825a.m144095i(11, j11, 0L);
    }

    /* renamed from: I */
    public static void m99755I(C28825a c28825a, long j11) {
        c28825a.m144095i(10, j11, 0L);
    }

    /* renamed from: O */
    public static int m99756O(C28825a c28825a, int[] iArr) {
        c28825a.m144086J(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            c28825a.m144097k(iArr[length]);
        }
        return c28825a.m144102q();
    }

    /* renamed from: P */
    public static int m99757P(C28825a c28825a, int[] iArr) {
        c28825a.m144086J(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            c28825a.m144097k(iArr[length]);
        }
        return c28825a.m144102q();
    }

    /* renamed from: T */
    public static int m99758T(C28825a c28825a) {
        return c28825a.m144101p();
    }

    /* renamed from: Y */
    public static C18998a m99759Y(ByteBuffer byteBuffer) {
        return m99760Z(byteBuffer, new C18998a());
    }

    /* renamed from: Z */
    public static C18998a m99760Z(ByteBuffer byteBuffer, C18998a c18998a) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return c18998a.m99798h(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    /* renamed from: j */
    public static void m99761j(C28825a c28825a, int i11) {
        c28825a.m144098l(16, i11, 0);
    }

    /* renamed from: k */
    public static void m99762k(C28825a c28825a, int i11) {
        c28825a.m144098l(14, i11, 0);
    }

    /* renamed from: l */
    public static void m99763l(C28825a c28825a, long j11) {
        c28825a.m144095i(9, j11, 0L);
    }

    /* renamed from: m */
    public static void m99764m(C28825a c28825a, int i11) {
        c28825a.m144094h(7, i11, 0);
    }

    /* renamed from: n */
    public static void m99765n(C28825a c28825a, byte b11) {
        c28825a.m144090d(2, b11, 0);
    }

    /* renamed from: o */
    public static void m99766o(C28825a c28825a, int i11) {
        c28825a.m144098l(13, i11, 0);
    }

    /* renamed from: p */
    public static void m99767p(C28825a c28825a, int i11) {
        c28825a.m144098l(25, i11, 0);
    }

    /* renamed from: q */
    public static void m99768q(C28825a c28825a, int i11) {
        c28825a.m144098l(21, i11, 0);
    }

    /* renamed from: r */
    public static void m99769r(C28825a c28825a, int i11) {
        c28825a.m144094h(3, i11, 0);
    }

    /* renamed from: s */
    public static void m99770s(C28825a c28825a, long j11) {
        c28825a.m144095i(6, j11, 0L);
    }

    /* renamed from: t */
    public static void m99771t(C28825a c28825a, byte b11) {
        c28825a.m144090d(0, b11, 0);
    }

    /* renamed from: t0 */
    public static void m99772t0(C28825a c28825a) {
        c28825a.m144085I(26);
    }

    /* renamed from: u */
    public static void m99773u(C28825a c28825a, int i11) {
        c28825a.m144098l(22, i11, 0);
    }

    /* renamed from: v */
    public static void m99774v(C28825a c28825a, int i11) {
        c28825a.m144098l(15, i11, 0);
    }

    /* renamed from: w */
    public static void m99775w(C28825a c28825a, int i11) {
        c28825a.m144098l(19, i11, 0);
    }

    /* renamed from: x */
    public static void m99776x(C28825a c28825a, int i11) {
        c28825a.m144098l(12, i11, 0);
    }

    /* renamed from: y */
    public static void m99777y(C28825a c28825a, int i11) {
        c28825a.m144094h(5, i11, 0);
    }

    /* renamed from: z */
    public static void m99778z(C28825a c28825a, int i11) {
        c28825a.m144098l(17, i11, 0);
    }

    /* renamed from: J */
    public C19003f m99779J(int i11) {
        return m99780K(new C19003f(), i11);
    }

    /* renamed from: K */
    public C19003f m99780K(C19003f c19003f, int i11) {
        int m144115b = m144115b(36);
        if (m144115b != 0) {
            return c19003f.m99893h(m144114a(m144118f(m144115b) + (i11 * 4)), this.f133529b);
        }
        return null;
    }

    /* renamed from: L */
    public int m99781L() {
        int m144115b = m144115b(36);
        if (m144115b != 0) {
            return m144119g(m144115b);
        }
        return 0;
    }

    /* renamed from: M */
    public String m99782M() {
        int m144115b = m144115b(32);
        if (m144115b != 0) {
            return m144117d(m144115b + this.f133528a);
        }
        return null;
    }

    /* renamed from: N */
    public long m99783N() {
        int m144115b = m144115b(22);
        if (m144115b != 0) {
            return this.f133529b.getLong(m144115b + this.f133528a);
        }
        return 0L;
    }

    /* renamed from: Q */
    public int m99784Q() {
        int m144115b = m144115b(18);
        if (m144115b != 0) {
            return this.f133529b.getInt(m144115b + this.f133528a);
        }
        return 0;
    }

    /* renamed from: R */
    public byte m99785R() {
        int m144115b = m144115b(8);
        if (m144115b != 0) {
            return this.f133529b.get(m144115b + this.f133528a);
        }
        return (byte) 0;
    }

    /* renamed from: S */
    public String m99786S() {
        int m144115b = m144115b(30);
        if (m144115b != 0) {
            return m144117d(m144115b + this.f133528a);
        }
        return null;
    }

    /* renamed from: U */
    public String m99787U() {
        int m144115b = m144115b(54);
        if (m144115b != 0) {
            return m144117d(m144115b + this.f133528a);
        }
        return null;
    }

    /* renamed from: V */
    public C19004g m99788V() {
        return m99789W(new C19004g());
    }

    /* renamed from: W */
    public C19004g m99789W(C19004g c19004g) {
        int m144115b = m144115b(46);
        if (m144115b != 0) {
            return c19004g.m99904h(m144114a(m144115b + this.f133528a), this.f133529b);
        }
        return null;
    }

    /* renamed from: X */
    public int m99790X() {
        int m144115b = m144115b(10);
        if (m144115b != 0) {
            return this.f133529b.getInt(m144115b + this.f133528a);
        }
        return 0;
    }

    /* renamed from: a0 */
    public long m99791a0() {
        int m144115b = m144115b(16);
        if (m144115b != 0) {
            return this.f133529b.getLong(m144115b + this.f133528a);
        }
        return 0L;
    }

    /* renamed from: b0 */
    public byte m99792b0() {
        int m144115b = m144115b(4);
        if (m144115b != 0) {
            return this.f133529b.get(m144115b + this.f133528a);
        }
        return (byte) 0;
    }

    /* renamed from: c0 */
    public C19001d m99793c0() {
        return m99794d0(new C19001d());
    }

    /* renamed from: d0 */
    public C19001d m99794d0(C19001d c19001d) {
        int m144115b = m144115b(48);
        if (m144115b != 0) {
            return c19001d.m99857h(m144114a(m144115b + this.f133528a), this.f133529b);
        }
        return null;
    }

    /* renamed from: e0 */
    public String m99795e0() {
        int m144115b = m144115b(34);
        if (m144115b != 0) {
            return m144117d(m144115b + this.f133528a);
        }
        return null;
    }

    /* renamed from: f0 */
    public C19006i m99796f0(int i11) {
        return m99797g0(new C19006i(), i11);
    }

    /* renamed from: g0 */
    public C19006i m99797g0(C19006i c19006i, int i11) {
        int m144115b = m144115b(42);
        if (m144115b != 0) {
            return c19006i.m99921h(m144114a(m144118f(m144115b) + (i11 * 4)), this.f133529b);
        }
        return null;
    }

    /* renamed from: h */
    public C18998a m99798h(int i11, ByteBuffer byteBuffer) {
        m99800i(i11, byteBuffer);
        return this;
    }

    /* renamed from: h0 */
    public int m99799h0() {
        int m144115b = m144115b(42);
        if (m144115b != 0) {
            return m144119g(m144115b);
        }
        return 0;
    }

    /* renamed from: i */
    public void m99800i(int i11, ByteBuffer byteBuffer) {
        m144116c(i11, byteBuffer);
    }

    /* renamed from: i0 */
    public String m99801i0() {
        int m144115b = m144115b(28);
        if (m144115b != 0) {
            return m144117d(m144115b + this.f133528a);
        }
        return null;
    }

    /* renamed from: j0 */
    public int m99802j0() {
        int m144115b = m144115b(14);
        if (m144115b != 0) {
            return this.f133529b.getInt(m144115b + this.f133528a);
        }
        return 0;
    }

    /* renamed from: k0 */
    public C19007j m99803k0() {
        return m99804l0(new C19007j());
    }

    /* renamed from: l0 */
    public C19007j m99804l0(C19007j c19007j) {
        int m144115b = m144115b(38);
        if (m144115b != 0) {
            return c19007j.m99935h(m144114a(m144115b + this.f133528a), this.f133529b);
        }
        return null;
    }

    /* renamed from: m0 */
    public C19008k m99805m0() {
        return m99806n0(new C19008k());
    }

    /* renamed from: n0 */
    public C19008k m99806n0(C19008k c19008k) {
        int m144115b = m144115b(40);
        if (m144115b != 0) {
            return c19008k.m99959h(m144114a(m144115b + this.f133528a), this.f133529b);
        }
        return null;
    }

    /* renamed from: o0 */
    public long m99807o0() {
        int m144115b = m144115b(20);
        if (m144115b != 0) {
            return this.f133529b.getLong(m144115b + this.f133528a);
        }
        return 0L;
    }

    /* renamed from: p0 */
    public C19009l m99808p0() {
        return m99809q0(new C19009l());
    }

    /* renamed from: q0 */
    public C19009l m99809q0(C19009l c19009l) {
        int m144115b = m144115b(44);
        if (m144115b != 0) {
            return c19009l.m99970h(m144114a(m144115b + this.f133528a), this.f133529b);
        }
        return null;
    }

    /* renamed from: r0 */
    public int m99810r0() {
        int m144115b = m144115b(50);
        if (m144115b != 0) {
            return this.f133529b.getInt(m144115b + this.f133528a);
        }
        return 0;
    }

    /* renamed from: s0 */
    public long m99811s0() {
        int m144115b = m144115b(52);
        if (m144115b != 0) {
            return this.f133529b.getLong(m144115b + this.f133528a);
        }
        return 0L;
    }

    /* renamed from: u0 */
    public byte m99812u0() {
        int m144115b = m144115b(6);
        if (m144115b != 0) {
            return this.f133529b.get(m144115b + this.f133528a);
        }
        return (byte) 0;
    }

    /* renamed from: v0 */
    public int m99813v0() {
        int m144115b = m144115b(12);
        if (m144115b != 0) {
            return this.f133529b.getInt(m144115b + this.f133528a);
        }
        return 0;
    }

    /* renamed from: w0 */
    public long m99814w0() {
        int m144115b = m144115b(26);
        if (m144115b != 0) {
            return this.f133529b.getLong(m144115b + this.f133528a);
        }
        return 0L;
    }

    /* renamed from: x0 */
    public long m99815x0() {
        int m144115b = m144115b(24);
        if (m144115b != 0) {
            return this.f133529b.getLong(m144115b + this.f133528a);
        }
        return 0L;
    }
}
