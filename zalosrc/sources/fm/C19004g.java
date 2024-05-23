package fm;

import java.nio.ByteBuffer;
import p602w9.AbstractC28826b;
import p602w9.C28825a;

/* renamed from: fm.g */
/* loaded from: classes3.dex */
public final class C19004g extends AbstractC28826b {
    /* renamed from: j */
    public static void m99899j(C28825a c28825a, int i11) {
        c28825a.m144098l(2, i11, 0);
    }

    /* renamed from: k */
    public static void m99900k(C28825a c28825a, byte b11) {
        c28825a.m144090d(1, b11, 0);
    }

    /* renamed from: l */
    public static void m99901l(C28825a c28825a, int i11) {
        c28825a.m144094h(0, i11, 0);
    }

    /* renamed from: m */
    public static int m99902m(C28825a c28825a, int i11, byte b11, int i12) {
        c28825a.m144085I(3);
        m99899j(c28825a, i12);
        m99901l(c28825a, i11);
        m99900k(c28825a, b11);
        return m99903o(c28825a);
    }

    /* renamed from: o */
    public static int m99903o(C28825a c28825a) {
        return c28825a.m144101p();
    }

    /* renamed from: h */
    public C19004g m99904h(int i11, ByteBuffer byteBuffer) {
        m99905i(i11, byteBuffer);
        return this;
    }

    /* renamed from: i */
    public void m99905i(int i11, ByteBuffer byteBuffer) {
        m144116c(i11, byteBuffer);
    }

    /* renamed from: n */
    public String m99906n() {
        int m144115b = m144115b(8);
        if (m144115b != 0) {
            return m144117d(m144115b + this.f133528a);
        }
        return null;
    }

    /* renamed from: p */
    public byte m99907p() {
        int m144115b = m144115b(6);
        if (m144115b != 0) {
            return this.f133529b.get(m144115b + this.f133528a);
        }
        return (byte) 0;
    }

    /* renamed from: q */
    public int m99908q() {
        int m144115b = m144115b(4);
        if (m144115b != 0) {
            return this.f133529b.getInt(m144115b + this.f133528a);
        }
        return 0;
    }
}
