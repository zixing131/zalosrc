package fm;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p602w9.AbstractC28826b;

/* renamed from: fm.v */
/* loaded from: classes3.dex */
public final class C19019v extends AbstractC28826b {
    /* renamed from: j */
    public static C19019v m100045j(ByteBuffer byteBuffer) {
        return m100046k(byteBuffer, new C19019v());
    }

    /* renamed from: k */
    public static C19019v m100046k(ByteBuffer byteBuffer, C19019v c19019v) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return c19019v.m100047h(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    /* renamed from: h */
    public C19019v m100047h(int i11, ByteBuffer byteBuffer) {
        m100048i(i11, byteBuffer);
        return this;
    }

    /* renamed from: i */
    public void m100048i(int i11, ByteBuffer byteBuffer) {
        m144116c(i11, byteBuffer);
    }

    /* renamed from: l */
    public C19002e m100049l(int i11) {
        return m100050m(new C19002e(), i11);
    }

    /* renamed from: m */
    public C19002e m100050m(C19002e c19002e, int i11) {
        int m144115b = m144115b(4);
        if (m144115b != 0) {
            return c19002e.m99860h(m144114a(m144118f(m144115b) + (i11 * 4)), this.f133529b);
        }
        return null;
    }

    /* renamed from: n */
    public int m100051n() {
        int m144115b = m144115b(4);
        if (m144115b != 0) {
            return m144119g(m144115b);
        }
        return 0;
    }
}
