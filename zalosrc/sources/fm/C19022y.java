package fm;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p602w9.AbstractC28826b;

/* renamed from: fm.y */
/* loaded from: classes3.dex */
public final class C19022y extends AbstractC28826b {
    /* renamed from: j */
    public static C19022y m100060j(ByteBuffer byteBuffer) {
        return m100061k(byteBuffer, new C19022y());
    }

    /* renamed from: k */
    public static C19022y m100061k(ByteBuffer byteBuffer, C19022y c19022y) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return c19022y.m100062h(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    /* renamed from: h */
    public C19022y m100062h(int i11, ByteBuffer byteBuffer) {
        m100063i(i11, byteBuffer);
        return this;
    }

    /* renamed from: i */
    public void m100063i(int i11, ByteBuffer byteBuffer) {
        m144116c(i11, byteBuffer);
    }

    /* renamed from: l */
    public C19011n m100064l(int i11) {
        return m100065m(new C19011n(), i11);
    }

    /* renamed from: m */
    public C19011n m100065m(C19011n c19011n, int i11) {
        int m144115b = m144115b(4);
        if (m144115b != 0) {
            return c19011n.m99978h(m144114a(m144118f(m144115b) + (i11 * 4)), this.f133529b);
        }
        return null;
    }

    /* renamed from: n */
    public int m100066n() {
        int m144115b = m144115b(4);
        if (m144115b != 0) {
            return m144119g(m144115b);
        }
        return 0;
    }
}
