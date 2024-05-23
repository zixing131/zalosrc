package p348mi;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p602w9.AbstractC28826b;
import p602w9.C28825a;

/* renamed from: mi.a */
/* loaded from: classes.dex */
public final class C23301a extends AbstractC28826b {
    /* renamed from: j */
    public static void m120509j(C28825a c28825a, long j11) {
        c28825a.m144095i(1, j11, 0L);
    }

    /* renamed from: k */
    public static void m120510k(C28825a c28825a, long j11) {
        c28825a.m144095i(0, j11, 0L);
    }

    /* renamed from: l */
    public static int m120511l(C28825a c28825a, long j11, long j12) {
        c28825a.m144085I(2);
        m120509j(c28825a, j12);
        m120510k(c28825a, j11);
        return m120512n(c28825a);
    }

    /* renamed from: n */
    public static int m120512n(C28825a c28825a) {
        return c28825a.m144101p();
    }

    /* renamed from: o */
    public static C23301a m120513o(ByteBuffer byteBuffer) {
        return m120514p(byteBuffer, new C23301a());
    }

    /* renamed from: p */
    public static C23301a m120514p(ByteBuffer byteBuffer, C23301a c23301a) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return c23301a.m120515h(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    /* renamed from: h */
    public C23301a m120515h(int i11, ByteBuffer byteBuffer) {
        m120516i(i11, byteBuffer);
        return this;
    }

    /* renamed from: i */
    public void m120516i(int i11, ByteBuffer byteBuffer) {
        m144116c(i11, byteBuffer);
    }

    /* renamed from: m */
    public long m120517m() {
        int m144115b = m144115b(6);
        if (m144115b != 0) {
            return this.f133529b.getLong(m144115b + this.f133528a);
        }
        return 0L;
    }

    /* renamed from: q */
    public long m120518q() {
        int m144115b = m144115b(4);
        if (m144115b != 0) {
            return this.f133529b.getLong(m144115b + this.f133528a);
        }
        return 0L;
    }
}
