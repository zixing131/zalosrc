package fm;

import java.nio.ByteBuffer;
import p602w9.AbstractC28826b;
import p602w9.C28825a;

/* renamed from: fm.j */
/* loaded from: classes3.dex */
public final class C19007j extends AbstractC28826b {
    /* renamed from: j */
    public static void m99928j(C28825a c28825a, int i11) {
        c28825a.m144094h(3, i11, 0);
    }

    /* renamed from: k */
    public static void m99929k(C28825a c28825a, int i11) {
        c28825a.m144098l(4, i11, 0);
    }

    /* renamed from: l */
    public static void m99930l(C28825a c28825a, int i11) {
        c28825a.m144094h(0, i11, 0);
    }

    /* renamed from: m */
    public static void m99931m(C28825a c28825a, int i11) {
        c28825a.m144094h(1, i11, 0);
    }

    /* renamed from: n */
    public static void m99932n(C28825a c28825a, int i11) {
        c28825a.m144094h(2, i11, 0);
    }

    /* renamed from: p */
    public static int m99933p(C28825a c28825a, int i11, int i12, int i13, int i14, int i15) {
        c28825a.m144085I(5);
        m99929k(c28825a, i15);
        m99928j(c28825a, i14);
        m99932n(c28825a, i13);
        m99931m(c28825a, i12);
        m99930l(c28825a, i11);
        return m99934q(c28825a);
    }

    /* renamed from: q */
    public static int m99934q(C28825a c28825a) {
        return c28825a.m144101p();
    }

    /* renamed from: h */
    public C19007j m99935h(int i11, ByteBuffer byteBuffer) {
        m99936i(i11, byteBuffer);
        return this;
    }

    /* renamed from: i */
    public void m99936i(int i11, ByteBuffer byteBuffer) {
        m144116c(i11, byteBuffer);
    }

    /* renamed from: o */
    public int m99937o() {
        int m144115b = m144115b(10);
        if (m144115b != 0) {
            return this.f133529b.getInt(m144115b + this.f133528a);
        }
        return 0;
    }

    /* renamed from: r */
    public String m99938r() {
        int m144115b = m144115b(12);
        if (m144115b != 0) {
            return m144117d(m144115b + this.f133528a);
        }
        return null;
    }

    /* renamed from: s */
    public int m99939s() {
        int m144115b = m144115b(4);
        if (m144115b != 0) {
            return this.f133529b.getInt(m144115b + this.f133528a);
        }
        return 0;
    }

    /* renamed from: t */
    public int m99940t() {
        int m144115b = m144115b(6);
        if (m144115b != 0) {
            return this.f133529b.getInt(m144115b + this.f133528a);
        }
        return 0;
    }

    /* renamed from: u */
    public int m99941u() {
        int m144115b = m144115b(8);
        if (m144115b != 0) {
            return this.f133529b.getInt(m144115b + this.f133528a);
        }
        return 0;
    }
}
