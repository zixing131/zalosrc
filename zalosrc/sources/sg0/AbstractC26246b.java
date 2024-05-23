package sg0;

import fn0.AbstractC19074t;
import java.security.Key;

/* renamed from: sg0.b */
/* loaded from: classes7.dex */
public abstract class AbstractC26246b {
    /* renamed from: a */
    public static final String m134962a(Key key) {
        AbstractC19074t.m100208f(key, "<this>");
        byte[] encoded = key.getEncoded();
        AbstractC19074t.m100207e(encoded, "getEncoded(...)");
        return m134963b(encoded);
    }

    /* renamed from: b */
    public static final String m134963b(byte[] bArr) {
        AbstractC19074t.m100208f(bArr, "<this>");
        return C26245a.f124654a.m134944b(bArr);
    }

    /* renamed from: c */
    public static final byte[] m134964c(String str) {
        AbstractC19074t.m100208f(str, "<this>");
        return C26245a.f124654a.m134943a(str);
    }

    /* renamed from: d */
    public static final byte[] m134965d(Key key) {
        AbstractC19074t.m100208f(key, "<this>");
        C26245a c26245a = C26245a.f124654a;
        byte[] encoded = key.getEncoded();
        AbstractC19074t.m100207e(encoded, "getEncoded(...)");
        return c26245a.m134948f(encoded);
    }
}
