package p685yl;

import android.os.Build;
import com.zing.zalocore.CoreUtility;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.nio.charset.Charset;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import mm0.AbstractC23352g;
import on0.C24321d;
import p479rc.C25725b;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import sc.C26220b;
import sg0.C26245a;

/* renamed from: yl.a */
/* loaded from: classes3.dex */
public final class C31017a {
    public static final b Companion = new b(null);

    /* renamed from: a */
    private static final InterfaceC24854k f143077a;

    /* renamed from: yl.a$a */
    /* loaded from: classes3.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f143078q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C31017a mo12V4() {
            return c.f143079a.m150822a();
        }
    }

    /* renamed from: yl.a$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: c */
        public final String m150820c() {
            return AbstractC23352g.m122788d(CoreUtility.f89233i) + "_5b!B*2AX@";
        }

        /* renamed from: b */
        public final C31017a m150821b() {
            return (C31017a) C31017a.f143077a.getValue();
        }
    }

    /* renamed from: yl.a$c */
    /* loaded from: classes3.dex */
    public static final class c {

        /* renamed from: a */
        public static final c f143079a = new c();

        /* renamed from: b */
        private static final C31017a f143080b = new C31017a();

        private c() {
        }

        /* renamed from: a */
        public final C31017a m150822a() {
            return f143080b;
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(a.f143078q);
        f143077a = m129210a;
    }

    /* renamed from: g */
    private final byte[] m150804g(byte[] bArr, Key key) {
        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
        cipher.init(2, key);
        byte[] doFinal = cipher.doFinal(bArr);
        AbstractC19074t.m100207e(doFinal, "doFinal(...)");
        return doFinal;
    }

    /* renamed from: i */
    private final byte[] m150805i(byte[] bArr, Key key) {
        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
        cipher.init(1, key);
        byte[] doFinal = cipher.doFinal(bArr);
        AbstractC19074t.m100207e(doFinal, "doFinal(...)");
        return doFinal;
    }

    /* renamed from: k */
    private final Key m150806k(C25725b c25725b) {
        return C26245a.f124654a.m134945c(c25725b.m132705b(), "AES", 3);
    }

    /* renamed from: l */
    public static final C31017a m150807l() {
        return Companion.m150821b();
    }

    /* renamed from: o */
    private final String m150808o(String str) {
        String str2 = str + "_" + CoreUtility.f89233i + "_5b!B*2AX@";
        AbstractC19074t.m100207e(str2, "toString(...)");
        return str2;
    }

    /* renamed from: b */
    public final C25725b m150809b(String str, int i11) {
        AbstractC19074t.m100208f(str, "backupKey");
        if (!m150816m(i11)) {
            return new C25725b(i11, new byte[0], "");
        }
        if (i11 == 0) {
            return m150810c();
        }
        if (str.length() != 0) {
            if (i11 == 1) {
                return m150811d(str);
            }
            byte[] m150817n = m150817n(str);
            return new C25725b(i11, m150817n, C26245a.m134942u(C26245a.f124654a, m150817n, 0, 2, null));
        }
        throw new IllegalStateException("FAILED to build Backup Key of type (" + i11 + "). Input is empty!");
    }

    /* renamed from: c */
    public final C25725b m150810c() {
        String m122788d = AbstractC23352g.m122788d(CoreUtility.f89233i);
        AbstractC19074t.m100207e(m122788d, "md5(...)");
        byte[] bytes = m122788d.getBytes(C24321d.f117408b);
        AbstractC19074t.m100207e(bytes, "getBytes(...)");
        C26245a c26245a = C26245a.f124654a;
        String str = CoreUtility.f89233i;
        AbstractC19074t.m100207e(str, "currentUserUid");
        return new C25725b(0, bytes, c26245a.m134958s(str));
    }

    /* renamed from: d */
    public final C25725b m150811d(String str) {
        AbstractC19074t.m100208f(str, "pwd");
        String m150808o = m150808o(str);
        String m122788d = AbstractC23352g.m122788d(m150808o);
        AbstractC19074t.m100207e(m122788d, "md5(...)");
        byte[] bytes = m122788d.getBytes(C24321d.f117408b);
        AbstractC19074t.m100207e(bytes, "getBytes(...)");
        return new C25725b(1, bytes, C26245a.f124654a.m134958s(m150808o));
    }

    /* renamed from: e */
    public final String m150812e(String str, int i11) {
        AbstractC19074t.m100208f(str, "backupKey");
        return m150809b(str, i11).m132706c();
    }

    /* renamed from: f */
    public final String m150813f(String str, int i11) {
        AbstractC19074t.m100208f(str, "rawPass");
        if (i11 != 0) {
            if (i11 == 1) {
                String str2 = str + "_" + CoreUtility.f89233i + "_5b!B*2AX@";
                AbstractC19074t.m100205c(str2);
                return str2;
            }
            throw new Exception("GetLegacyDecryptKeyException: encryptionType: " + i11 + " is invalid!");
        }
        String str3 = CoreUtility.f89233i;
        AbstractC19074t.m100205c(str3);
        return str3;
    }

    /* renamed from: h */
    public final byte[] m150814h(byte[] bArr, C25725b c25725b) {
        AbstractC19074t.m100208f(bArr, "encryptedData");
        AbstractC19074t.m100208f(c25725b, "backupKey");
        C26220b.m134827j("decryptUsingBackupKey(): encryptedData.size=" + bArr.length + ", backupKey=" + c25725b, null, 2, null);
        return m150804g(bArr, m150806k(c25725b));
    }

    /* renamed from: j */
    public final byte[] m150815j(byte[] bArr, C25725b c25725b) {
        AbstractC19074t.m100208f(bArr, "data");
        AbstractC19074t.m100208f(c25725b, "backupKey");
        return m150805i(bArr, m150806k(c25725b));
    }

    /* renamed from: m */
    public final boolean m150816m(int i11) {
        return i11 == 0 || i11 == 1 || i11 == 2 || i11 == 3;
    }

    /* renamed from: n */
    public final byte[] m150817n(String str) {
        AbstractC19074t.m100208f(str, "key");
        if (Build.VERSION.SDK_INT < 26) {
            C26245a c26245a = C26245a.f124654a;
            Charset charset = C24321d.f117408b;
            byte[] bytes = str.getBytes(charset);
            AbstractC19074t.m100207e(bytes, "getBytes(...)");
            byte[] bytes2 = Companion.m150820c().getBytes(charset);
            AbstractC19074t.m100207e(bytes2, "getBytes(...)");
            return c26245a.m134957r("HmacSHA256", bytes, bytes2, 10000, 32);
        }
        char[] charArray = str.toCharArray();
        AbstractC19074t.m100207e(charArray, "toCharArray(...)");
        byte[] bytes3 = Companion.m150820c().getBytes(C24321d.f117408b);
        AbstractC19074t.m100207e(bytes3, "getBytes(...)");
        byte[] encoded = SecretKeyFactory.getInstance("PBKDF2withHmacSHA256").generateSecret(new PBEKeySpec(charArray, bytes3, 10000, 256)).getEncoded();
        AbstractC19074t.m100207e(encoded, "getEncoded(...)");
        return encoded;
    }
}
