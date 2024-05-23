package fm;

import java.nio.ByteBuffer;
import p602w9.AbstractC28826b;
import p602w9.C28825a;

/* renamed from: fm.i */
/* loaded from: classes3.dex */
public final class C19006i extends AbstractC28826b {
    /* renamed from: j */
    public static void m99914j(C28825a c28825a, int i11) {
        c28825a.m144098l(4, i11, 0);
    }

    /* renamed from: k */
    public static void m99915k(C28825a c28825a, int i11) {
        c28825a.m144094h(3, i11, 0);
    }

    /* renamed from: l */
    public static void m99916l(C28825a c28825a, int i11) {
        c28825a.m144094h(2, i11, 0);
    }

    /* renamed from: m */
    public static void m99917m(C28825a c28825a, int i11) {
        c28825a.m144094h(0, i11, 0);
    }

    /* renamed from: n */
    public static void m99918n(C28825a c28825a, int i11) {
        c28825a.m144094h(1, i11, 0);
    }

    /* renamed from: o */
    public static int m99919o(C28825a c28825a, int i11, int i12, int i13, int i14, int i15) {
        c28825a.m144085I(5);
        m99914j(c28825a, i15);
        m99915k(c28825a, i14);
        m99916l(c28825a, i13);
        m99918n(c28825a, i12);
        m99917m(c28825a, i11);
        return m99920p(c28825a);
    }

    /* renamed from: p */
    public static int m99920p(C28825a c28825a) {
        return c28825a.m144101p();
    }

    /* renamed from: h */
    public C19006i m99921h(int i11, ByteBuffer byteBuffer) {
        m99922i(i11, byteBuffer);
        return this;
    }

    /* renamed from: i */
    public void m99922i(int i11, ByteBuffer byteBuffer) {
        m144116c(i11, byteBuffer);
    }

    /* renamed from: q */
    public String m99923q() {
        int m144115b = m144115b(12);
        if (m144115b != 0) {
            return m144117d(m144115b + this.f133528a);
        }
        return null;
    }

    /* renamed from: r */
    public int m99924r() {
        int m144115b = m144115b(10);
        if (m144115b != 0) {
            return this.f133529b.getInt(m144115b + this.f133528a);
        }
        return 0;
    }

    /* renamed from: s */
    public int m99925s() {
        int m144115b = m144115b(8);
        if (m144115b != 0) {
            return this.f133529b.getInt(m144115b + this.f133528a);
        }
        return 0;
    }

    /* renamed from: t */
    public int m99926t() {
        int m144115b = m144115b(4);
        if (m144115b != 0) {
            return this.f133529b.getInt(m144115b + this.f133528a);
        }
        return 0;
    }

    /* renamed from: u */
    public int m99927u() {
        int m144115b = m144115b(6);
        if (m144115b != 0) {
            return this.f133529b.getInt(m144115b + this.f133528a);
        }
        return 0;
    }
}
