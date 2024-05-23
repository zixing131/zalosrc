package fm;

import java.nio.ByteBuffer;
import p602w9.AbstractC28826b;
import p602w9.C28825a;

/* renamed from: fm.l */
/* loaded from: classes3.dex */
public final class C19009l extends AbstractC28826b {
    /* renamed from: j */
    public static void m99966j(C28825a c28825a, int i11) {
        c28825a.m144098l(1, i11, 0);
    }

    /* renamed from: k */
    public static void m99967k(C28825a c28825a, int i11) {
        c28825a.m144094h(0, i11, 0);
    }

    /* renamed from: l */
    public static int m99968l(C28825a c28825a, int i11, int i12) {
        c28825a.m144085I(2);
        m99966j(c28825a, i12);
        m99967k(c28825a, i11);
        return m99969n(c28825a);
    }

    /* renamed from: n */
    public static int m99969n(C28825a c28825a) {
        return c28825a.m144101p();
    }

    /* renamed from: h */
    public C19009l m99970h(int i11, ByteBuffer byteBuffer) {
        m99971i(i11, byteBuffer);
        return this;
    }

    /* renamed from: i */
    public void m99971i(int i11, ByteBuffer byteBuffer) {
        m144116c(i11, byteBuffer);
    }

    /* renamed from: m */
    public String m99972m() {
        int m144115b = m144115b(6);
        if (m144115b != 0) {
            return m144117d(m144115b + this.f133528a);
        }
        return null;
    }

    /* renamed from: o */
    public int m99973o() {
        int m144115b = m144115b(4);
        if (m144115b != 0) {
            return this.f133529b.getInt(m144115b + this.f133528a);
        }
        return 0;
    }
}
