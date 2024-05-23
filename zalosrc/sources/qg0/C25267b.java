package qg0;

import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.security.Key;
import java.security.KeyStore;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.spec.GCMParameterSpec;
import tg0.C26676b;
import vg.AbstractC28129m4;
import vg.AbstractC28138n4;

/* renamed from: qg0.b */
/* loaded from: classes7.dex */
public final class C25267b extends AbstractC25269d {
    public static final d Companion = new d(null);

    /* renamed from: a */
    private final e f121168a;

    /* renamed from: qg0.b$a */
    /* loaded from: classes7.dex */
    private static class a extends e {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(KeyStore keyStore) {
            super(keyStore);
            AbstractC19074t.m100208f(keyStore, "keyStore");
        }

        @Override // qg0.AbstractC25269d
        /* renamed from: c */
        public byte[] mo130732c(byte[] bArr) {
            AbstractC19074t.m100208f(bArr, "wrappedKey");
            return bArr;
        }

        @Override // qg0.AbstractC25269d
        /* renamed from: e */
        public byte[] mo130733e(byte[] bArr) {
            AbstractC19074t.m100208f(bArr, "keyToWrap");
            return bArr;
        }
    }

    /* renamed from: qg0.b$b */
    /* loaded from: classes7.dex */
    private static class b extends e {
        public static final a Companion = new a(null);

        /* renamed from: qg0.b$b$a */
        /* loaded from: classes7.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC19060k abstractC19060k) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(KeyStore keyStore) {
            super(keyStore);
            AbstractC19074t.m100208f(keyStore, "keyStore");
            m130734i();
        }

        /* renamed from: i */
        private final void m130734i() {
            try {
                if (!C25267b.Companion.m130738b(m130740g(), m130739f())) {
                    KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
                    keyGenerator.init(m130735h());
                    keyGenerator.generateKey();
                }
            } catch (Exception e11) {
                C26676b.m136954d("HardwareSecureKeyWrapperImpl", e11);
            }
        }

        @Override // qg0.AbstractC25269d
        /* renamed from: c */
        public byte[] mo130732c(byte[] bArr) {
            AbstractC19074t.m100208f(bArr, "wrappedKey");
            try {
                Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
                byte[] bArr2 = new byte[12];
                int length = bArr.length - 12;
                byte[] bArr3 = new byte[length];
                System.arraycopy(bArr, 0, bArr2, 0, 12);
                System.arraycopy(bArr, 12, bArr3, 0, length);
                cipher.init(2, m130736j(), new GCMParameterSpec(128, bArr2));
                byte[] doFinal = cipher.doFinal(bArr3);
                AbstractC19074t.m100205c(doFinal);
                return doFinal;
            } catch (Exception e11) {
                C26676b.m136954d("HardwareSecureKeyWrapperImpl", e11);
                throw e11;
            }
        }

        @Override // qg0.AbstractC25269d
        /* renamed from: e */
        public byte[] mo130733e(byte[] bArr) {
            AbstractC19074t.m100208f(bArr, "keyToWrap");
            try {
                Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
                cipher.init(1, m130736j());
                byte[] doFinal = cipher.doFinal(bArr);
                byte[] iv2 = cipher.getIV();
                byte[] bArr2 = new byte[iv2.length + doFinal.length];
                System.arraycopy(iv2, 0, bArr2, 0, iv2.length);
                System.arraycopy(doFinal, 0, bArr2, iv2.length, doFinal.length);
                return bArr2;
            } catch (Exception e11) {
                C26676b.m136954d("HardwareSecureKeyWrapperImpl", e11);
                throw e11;
            }
        }

        /* renamed from: h */
        protected KeyGenParameterSpec m130735h() {
            KeyGenParameterSpec.Builder blockModes;
            KeyGenParameterSpec.Builder encryptionPaddings;
            KeyGenParameterSpec build;
            AbstractC28138n4.m141618a();
            blockModes = AbstractC28129m4.m141616a(m130739f(), 3).setBlockModes("GCM");
            encryptionPaddings = blockModes.setEncryptionPaddings("NoPadding");
            build = encryptionPaddings.build();
            AbstractC19074t.m100207e(build, "build(...)");
            return build;
        }

        /* renamed from: j */
        public final Key m130736j() {
            Key key = m130740g().getKey(m130739f(), null);
            AbstractC19074t.m100207e(key, "getKey(...)");
            return key;
        }
    }

    /* renamed from: qg0.b$c */
    /* loaded from: classes7.dex */
    private static final class c extends b {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(KeyStore keyStore) {
            super(keyStore);
            AbstractC19074t.m100208f(keyStore, "keyStore");
        }
    }

    /* renamed from: qg0.b$d */
    /* loaded from: classes7.dex */
    public static final class d {
        private d() {
        }

        public /* synthetic */ d(AbstractC19060k abstractC19060k) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0 */
        /* JADX WARN: Type inference failed for: r1v1, types: [java.security.KeyStore$ProtectionParameter] */
        /* JADX WARN: Type inference failed for: r1v3 */
        /* JADX WARN: Type inference failed for: r1v4, types: [javax.crypto.SecretKey] */
        /* JADX WARN: Type inference failed for: r1v5 */
        /* JADX WARN: Type inference failed for: r6v0, types: [java.security.KeyStore] */
        /* renamed from: b */
        public final boolean m130738b(KeyStore keyStore, String str) {
            KeyStore.SecretKeyEntry secretKeyEntry;
            ?? r12 = 0;
            Exception e11 = null;
            int i11 = 0;
            while (i11 <= 3) {
                try {
                    if (!keyStore.containsAlias(str)) {
                        return false;
                    }
                    KeyStore.Entry entry = keyStore.getEntry(str, r12);
                    if (entry instanceof KeyStore.SecretKeyEntry) {
                        secretKeyEntry = (KeyStore.SecretKeyEntry) entry;
                    } else {
                        secretKeyEntry = r12;
                    }
                    if (secretKeyEntry != null) {
                        r12 = secretKeyEntry.getSecretKey();
                    }
                    if (r12 == 0) {
                        return false;
                    }
                    return true;
                } catch (Exception e12) {
                    e11 = e12;
                    i11++;
                    r12 = r12;
                }
            }
            if (e11 != null) {
                C26676b.m136953c(e11);
            }
            return false;
        }
    }

    /* renamed from: qg0.b$e */
    /* loaded from: classes7.dex */
    public static abstract class e extends AbstractC25269d {

        /* renamed from: a */
        private final KeyStore f121169a;

        public e(KeyStore keyStore) {
            AbstractC19074t.m100208f(keyStore, "keyStore");
            this.f121169a = keyStore;
        }

        /* renamed from: f */
        public final String m130739f() {
            return "HardwareSecureKeyWrapper";
        }

        /* renamed from: g */
        public final KeyStore m130740g() {
            return this.f121169a;
        }
    }

    /* renamed from: qg0.b$f */
    /* loaded from: classes7.dex */
    private static class f extends e {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(KeyStore keyStore) {
            super(keyStore);
            AbstractC19074t.m100208f(keyStore, "keyStore");
        }

        @Override // qg0.AbstractC25269d
        /* renamed from: c */
        public byte[] mo130732c(byte[] bArr) {
            AbstractC19074t.m100208f(bArr, "wrappedKey");
            return bArr;
        }

        @Override // qg0.AbstractC25269d
        /* renamed from: e */
        public byte[] mo130733e(byte[] bArr) {
            AbstractC19074t.m100208f(bArr, "keyToWrap");
            return bArr;
        }
    }

    public C25267b(KeyStore keyStore) {
        e aVar;
        AbstractC19074t.m100208f(keyStore, "keyStore");
        if (!Companion.m130738b(keyStore, "HardwareSecureKeyWrapper")) {
            aVar = new f(keyStore);
        } else {
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 28) {
                aVar = new c(keyStore);
            } else if (i11 >= 23) {
                aVar = new b(keyStore);
            } else {
                aVar = new a(keyStore);
            }
        }
        this.f121168a = aVar;
    }

    @Override // qg0.AbstractC25269d
    /* renamed from: c */
    public byte[] mo130732c(byte[] bArr) {
        AbstractC19074t.m100208f(bArr, "wrappedKey");
        return this.f121168a.mo130732c(bArr);
    }

    @Override // qg0.AbstractC25269d
    /* renamed from: e */
    public byte[] mo130733e(byte[] bArr) {
        AbstractC19074t.m100208f(bArr, "keyToWrap");
        return this.f121168a.mo130733e(bArr);
    }
}
