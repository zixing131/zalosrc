package fm;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p602w9.AbstractC28826b;

/* renamed from: fm.z */
/* loaded from: classes3.dex */
public final class C19023z extends AbstractC28826b {
    /* renamed from: j */
    public static C19023z m100067j(ByteBuffer byteBuffer) {
        return m100068k(byteBuffer, new C19023z());
    }

    /* renamed from: k */
    public static C19023z m100068k(ByteBuffer byteBuffer, C19023z c19023z) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return c19023z.m100069h(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    /* renamed from: h */
    public C19023z m100069h(int i11, ByteBuffer byteBuffer) {
        m100070i(i11, byteBuffer);
        return this;
    }

    /* renamed from: i */
    public void m100070i(int i11, ByteBuffer byteBuffer) {
        m144116c(i11, byteBuffer);
    }

    /* renamed from: l */
    public C19012o m100071l(int i11) {
        return m100072m(new C19012o(), i11);
    }

    /* renamed from: m */
    public C19012o m100072m(C19012o c19012o, int i11) {
        int m144115b = m144115b(4);
        if (m144115b != 0) {
            return c19012o.m99982h(m144114a(m144118f(m144115b) + (i11 * 4)), this.f133529b);
        }
        return null;
    }

    /* renamed from: n */
    public int m100073n() {
        int m144115b = m144115b(4);
        if (m144115b != 0) {
            return m144119g(m144115b);
        }
        return 0;
    }
}
