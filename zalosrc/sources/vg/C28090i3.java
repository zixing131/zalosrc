package vg;

import am.AbstractC0924m0;
import fn0.AbstractC19074t;
import gm0.AbstractC19509c;
import ho0.AbstractC20110a;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import on0.AbstractC24342w;

/* renamed from: vg.i3 */
/* loaded from: classes3.dex */
public final class C28090i3 {

    /* renamed from: a */
    public static final C28090i3 f131039a = new C28090i3();

    private C28090i3() {
    }

    /* renamed from: b */
    private final void m141551b() {
        try {
            byte[] bArr = new byte[256];
            new SecureRandom().nextBytes(bArr);
            AbstractC0924m0.m2939Bi(AbstractC19509c.m101979b(bArr));
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: c */
    private final void m141552c() {
        C28183s4.f131320a.m141747f("zalo_fingerprint_key");
    }

    /* renamed from: a */
    public final String m141553a() {
        String m2980D1;
        String m2980D12;
        boolean m127149O;
        try {
            Cipher.getInstance("AES/CBC/PKCS7Padding").init(1, C28183s4.f131320a.m141746d("zalo_fingerprint_key"));
            m2980D1 = AbstractC0924m0.m2980D1();
            m2980D12 = AbstractC0924m0.m2980D1();
        } catch (Exception e11) {
            if (AbstractC28080h3.m141539a(e11)) {
                AbstractC0924m0.m2939Bi("");
                m141552c();
                m141551b();
            } else {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
        if (m2980D12 != null && m2980D12.length() != 0) {
            AbstractC19074t.m100205c(m2980D1);
            m127149O = AbstractC24342w.m127149O(m2980D1, "\n", false, 2, null);
            if (m127149O) {
            }
            String m2980D13 = AbstractC0924m0.m2980D1();
            AbstractC19074t.m100207e(m2980D13, "getKeyBioState(...)");
            return m2980D13;
        }
        m141551b();
        String m2980D132 = AbstractC0924m0.m2980D1();
        AbstractC19074t.m100207e(m2980D132, "getKeyBioState(...)");
        return m2980D132;
    }
}
