package fm;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p602w9.AbstractC28826b;
import p602w9.C28825a;

/* renamed from: fm.t */
/* loaded from: classes3.dex */
public final class C19017t extends AbstractC28826b {
    /* renamed from: j */
    public static void m100030j(C28825a c28825a, int i11) {
        c28825a.m144098l(0, i11, 0);
    }

    /* renamed from: k */
    public static int m100031k(C28825a c28825a, int[] iArr) {
        c28825a.m144086J(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            c28825a.m144097k(iArr[length]);
        }
        return c28825a.m144102q();
    }

    /* renamed from: l */
    public static int m100032l(C28825a c28825a, int i11) {
        c28825a.m144085I(1);
        m100030j(c28825a, i11);
        return m100033m(c28825a);
    }

    /* renamed from: m */
    public static int m100033m(C28825a c28825a) {
        return c28825a.m144101p();
    }

    /* renamed from: n */
    public static C19017t m100034n(ByteBuffer byteBuffer) {
        return m100035o(byteBuffer, new C19017t());
    }

    /* renamed from: o */
    public static C19017t m100035o(ByteBuffer byteBuffer, C19017t c19017t) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return c19017t.m100036h(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    /* renamed from: h */
    public C19017t m100036h(int i11, ByteBuffer byteBuffer) {
        m100037i(i11, byteBuffer);
        return this;
    }

    /* renamed from: i */
    public void m100037i(int i11, ByteBuffer byteBuffer) {
        m144116c(i11, byteBuffer);
    }

    /* renamed from: p */
    public C18998a m100038p(int i11) {
        return m100039q(new C18998a(), i11);
    }

    /* renamed from: q */
    public C18998a m100039q(C18998a c18998a, int i11) {
        int m144115b = m144115b(4);
        if (m144115b != 0) {
            return c18998a.m99798h(m144114a(m144118f(m144115b) + (i11 * 4)), this.f133529b);
        }
        return null;
    }

    /* renamed from: r */
    public int m100040r() {
        int m144115b = m144115b(4);
        if (m144115b != 0) {
            return m144119g(m144115b);
        }
        return 0;
    }
}
