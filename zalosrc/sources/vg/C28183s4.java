package vg;

import android.security.keystore.KeyGenParameterSpec;
import fn0.AbstractC19074t;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

/* renamed from: vg.s4 */
/* loaded from: classes3.dex */
public final class C28183s4 {

    /* renamed from: a */
    public static final C28183s4 f131320a = new C28183s4();

    private C28183s4() {
    }

    /* renamed from: a */
    private final KeyStore m141742a() {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            return keyStore;
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    /* renamed from: c */
    private final Key m141743c(String str) {
        try {
            KeyStore m141742a = m141742a();
            AbstractC19074t.m100205c(m141742a);
            return m141742a.getKey(str, null);
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    /* renamed from: e */
    private final boolean m141744e(Key key) {
        return key != null;
    }

    /* renamed from: b */
    public final SecretKey m141745b(String str) {
        KeyGenParameterSpec build;
        AbstractC19074t.m100208f(str, "keyName");
        try {
            AbstractC28138n4.m141618a();
            KeyGenParameterSpec.Builder m141616a = AbstractC28129m4.m141616a(str, 3);
            m141616a.setBlockModes("CBC");
            m141616a.setUserAuthenticationRequired(true);
            m141616a.setEncryptionPaddings("PKCS7Padding");
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            build = m141616a.build();
            keyGenerator.init(build);
            return keyGenerator.generateKey();
        } catch (Throwable th2) {
            throw new RuntimeException("Failed to generateKey", th2);
        }
    }

    /* renamed from: d */
    public final SecretKey m141746d(String str) {
        AbstractC19074t.m100208f(str, "keyName");
        Key m141743c = m141743c(str);
        if (!m141744e(m141743c)) {
            m141743c = m141745b(str);
        }
        return (SecretKey) m141743c;
    }

    /* renamed from: f */
    public final void m141747f(String str) {
        AbstractC19074t.m100208f(str, "keyName");
        if (m141744e(m141743c(str))) {
            KeyStore m141742a = m141742a();
            try {
                AbstractC19074t.m100205c(m141742a);
                m141742a.deleteEntry(str);
            } catch (KeyStoreException e11) {
                e11.printStackTrace();
            }
        }
    }
}
