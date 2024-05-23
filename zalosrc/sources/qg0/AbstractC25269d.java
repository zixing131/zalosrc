package qg0;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.security.Key;
import sg0.C26245a;

/* renamed from: qg0.d */
/* loaded from: classes7.dex */
public abstract class AbstractC25269d {
    public static final a Companion = new a(null);

    /* renamed from: qg0.d$a */
    /* loaded from: classes7.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: a */
    protected Key mo130783a(byte[] bArr, String str, int i11) {
        AbstractC19074t.m100208f(bArr, "key");
        AbstractC19074t.m100208f(str, "algorithm");
        return C26245a.f124654a.m134945c(bArr, str, i11);
    }

    /* renamed from: b */
    public final Key m130784b(byte[] bArr, String str, int i11) {
        AbstractC19074t.m100208f(bArr, "wrappedKey");
        AbstractC19074t.m100208f(str, "wrappedKeyAlgorithm");
        return mo130783a(mo130732c(bArr), str, i11);
    }

    /* renamed from: c */
    public abstract byte[] mo130732c(byte[] bArr);

    /* renamed from: d */
    public final byte[] m130785d(Key key) {
        AbstractC19074t.m100208f(key, "keyToWrap");
        byte[] encoded = key.getEncoded();
        AbstractC19074t.m100207e(encoded, "getEncoded(...)");
        return mo130733e(encoded);
    }

    /* renamed from: e */
    public abstract byte[] mo130733e(byte[] bArr);
}
