package fm;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p602w9.AbstractC28826b;
import p602w9.C28825a;

/* renamed from: fm.s */
/* loaded from: classes3.dex */
public final class C19016s extends AbstractC28826b {
    /* renamed from: j */
    public static void m100019j(C28825a c28825a, int i11) {
        c28825a.m144098l(0, i11, 0);
    }

    /* renamed from: k */
    public static int m100020k(C28825a c28825a, int[] iArr) {
        c28825a.m144086J(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            c28825a.m144097k(iArr[length]);
        }
        return c28825a.m144102q();
    }

    /* renamed from: l */
    public static int m100021l(C28825a c28825a, int i11) {
        c28825a.m144085I(1);
        m100019j(c28825a, i11);
        return m100022m(c28825a);
    }

    /* renamed from: m */
    public static int m100022m(C28825a c28825a) {
        return c28825a.m144101p();
    }

    /* renamed from: n */
    public static C19016s m100023n(ByteBuffer byteBuffer) {
        return m100024o(byteBuffer, new C19016s());
    }

    /* renamed from: o */
    public static C19016s m100024o(ByteBuffer byteBuffer, C19016s c19016s) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return c19016s.m100025h(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    /* renamed from: h */
    public C19016s m100025h(int i11, ByteBuffer byteBuffer) {
        m100026i(i11, byteBuffer);
        return this;
    }

    /* renamed from: i */
    public void m100026i(int i11, ByteBuffer byteBuffer) {
        m144116c(i11, byteBuffer);
    }

    /* renamed from: p */
    public C19013p m100027p(int i11) {
        return m100028q(new C19013p(), i11);
    }

    /* renamed from: q */
    public C19013p m100028q(C19013p c19013p, int i11) {
        int m144115b = m144115b(4);
        if (m144115b != 0) {
            return c19013p.m99999h(m144114a(m144118f(m144115b) + (i11 * 4)), this.f133529b);
        }
        return null;
    }

    /* renamed from: r */
    public int m100029r() {
        int m144115b = m144115b(4);
        if (m144115b != 0) {
            return m144119g(m144115b);
        }
        return 0;
    }
}
