package sg0;

import android.util.Base64;
import ao0.C2269b;
import ao0.InterfaceC2268a;
import bn0.AbstractC2933b;
import bo0.C3066a;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import en0.InterfaceC18494a;
import en0.InterfaceC18512s;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.io.InputStream;
import java.security.Key;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.MessageDigest;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import on0.AbstractC24322d0;
import on0.C24321d;
import org.bouncycastle.asn1.AbstractC24446k;
import org.bouncycastle.asn1.C24443i0;
import pm0.AbstractC24856m;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.C24861r;
import pm0.C24869z;
import pm0.InterfaceC24854k;

/* renamed from: sg0.a */
/* loaded from: classes7.dex */
public final class C26245a {

    /* renamed from: a */
    public static final C26245a f124654a = new C26245a();

    /* renamed from: b */
    private static final InterfaceC24854k f124655b;

    /* renamed from: sg0.a$a */
    /* loaded from: classes7.dex */
    static final class a extends AbstractC19075u implements InterfaceC18512s {

        /* renamed from: q */
        final /* synthetic */ Mac f124656q;

        /* renamed from: r */
        final /* synthetic */ byte[] f124657r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Mac mac, byte[] bArr) {
            super(5);
            this.f124656q = mac;
            this.f124657r = bArr;
        }

        /* renamed from: a */
        public final void m134960a(byte[] bArr, int i11, byte[] bArr2, byte[] bArr3, int i12) {
            AbstractC19074t.m100208f(bArr, "S");
            AbstractC19074t.m100208f(bArr2, "buf");
            AbstractC19074t.m100208f(bArr3, "out");
            this.f124656q.update(bArr, 0, bArr.length);
            this.f124656q.update(bArr2, 0, bArr2.length);
            this.f124656q.doFinal(this.f124657r, 0);
            byte[] bArr4 = this.f124657r;
            System.arraycopy(bArr4, 0, bArr3, i12, bArr4.length);
            for (int i13 = 1; i13 < i11; i13++) {
                Mac mac = this.f124656q;
                byte[] bArr5 = this.f124657r;
                mac.update(bArr5, 0, bArr5.length);
                this.f124656q.doFinal(this.f124657r, 0);
                int length = this.f124657r.length;
                for (int i14 = 0; i14 < length; i14++) {
                    int i15 = i12 + i14;
                    bArr3[i15] = (byte) (bArr3[i15] ^ this.f124657r[i14]);
                }
            }
        }

        @Override // en0.InterfaceC18512s
        /* renamed from: aD */
        public /* bridge */ /* synthetic */ Object mo97872aD(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            m134960a((byte[]) obj, ((Number) obj2).intValue(), (byte[]) obj3, (byte[]) obj4, ((Number) obj5).intValue());
            return C24848g0.f119245a;
        }
    }

    /* renamed from: sg0.a$b */
    /* loaded from: classes7.dex */
    static final class b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final b f124658q = new b();

        b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SecureRandom mo12V4() {
            return new SecureRandom();
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(b.f124658q);
        f124655b = m129210a;
    }

    private C26245a() {
    }

    /* renamed from: j */
    private final SecureRandom m134939j() {
        return (SecureRandom) f124655b.getValue();
    }

    /* renamed from: o */
    public static /* synthetic */ String m134940o(C26245a c26245a, InputStream inputStream, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 4096;
        }
        return c26245a.m134953l(inputStream, i11);
    }

    /* renamed from: p */
    public static /* synthetic */ String m134941p(C26245a c26245a, byte[] bArr, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 4096;
        }
        return c26245a.m134955n(bArr, i11);
    }

    /* renamed from: u */
    public static /* synthetic */ String m134942u(C26245a c26245a, byte[] bArr, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 4096;
        }
        return c26245a.m134959t(bArr, i11);
    }

    /* renamed from: a */
    public final byte[] m134943a(String str) {
        AbstractC19074t.m100208f(str, "input");
        byte[] decode = Base64.decode(str, 2);
        AbstractC19074t.m100207e(decode, "decode(...)");
        return decode;
    }

    /* renamed from: b */
    public final String m134944b(byte[] bArr) {
        AbstractC19074t.m100208f(bArr, ZMediaPlayer.OnNativeInvokeListener.ARG_BYTES);
        String encodeToString = Base64.encodeToString(bArr, 2);
        AbstractC19074t.m100207e(encodeToString, "encodeToString(...)");
        return encodeToString;
    }

    /* renamed from: c */
    public final Key m134945c(byte[] bArr, String str, int i11) {
        AbstractC19074t.m100208f(bArr, "key");
        AbstractC19074t.m100208f(str, "algorithm");
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    return new SecretKeySpec(bArr, str);
                }
                throw new IllegalArgumentException("Unsupported keyType " + i11);
            }
            PrivateKey generatePrivate = KeyFactory.getInstance(str).generatePrivate(new PKCS8EncodedKeySpec(bArr));
            AbstractC19074t.m100207e(generatePrivate, "generatePrivate(...)");
            return generatePrivate;
        }
        PublicKey generatePublic = KeyFactory.getInstance(str).generatePublic(new X509EncodedKeySpec(bArr));
        AbstractC19074t.m100207e(generatePublic, "generatePublic(...)");
        return generatePublic;
    }

    /* renamed from: d */
    public final KeyPair m134946d(byte[] bArr, byte[] bArr2, String str) {
        AbstractC19074t.m100208f(bArr, "publicKey");
        AbstractC19074t.m100208f(bArr2, "privateKey");
        AbstractC19074t.m100208f(str, "algorithm");
        Key m134945c = m134945c(bArr, str, 1);
        AbstractC19074t.m100206d(m134945c, "null cannot be cast to non-null type java.security.PublicKey");
        Key m134945c2 = m134945c(bArr2, str, 2);
        AbstractC19074t.m100206d(m134945c2, "null cannot be cast to non-null type java.security.PrivateKey");
        return new KeyPair((PublicKey) m134945c, (PrivateKey) m134945c2);
    }

    /* renamed from: e */
    public final byte[] m134947e(byte[] bArr) {
        AbstractC19074t.m100208f(bArr, "pkcs1Encoded");
        byte[] m157481d = new C2269b(new C3066a(InterfaceC2268a.f9545b, C24443i0.f117974a), AbstractC24446k.m127783m(bArr)).m157481d();
        AbstractC19074t.m100207e(m157481d, "getEncoded(...)");
        return m157481d;
    }

    /* renamed from: f */
    public final byte[] m134948f(byte[] bArr) {
        AbstractC19074t.m100208f(bArr, "pkcs8encoded");
        byte[] m157481d = C2269b.m11995f(bArr).m11997g().mo11996c().m157481d();
        AbstractC19074t.m100207e(m157481d, "getEncoded(...)");
        return m157481d;
    }

    /* renamed from: g */
    public final byte[] m134949g(int i11) {
        byte[] bArr = new byte[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            bArr[i12] = 0;
        }
        return bArr;
    }

    /* renamed from: h */
    public final byte[] m134950h(int i11) {
        byte[] bArr = new byte[i11];
        m134939j().nextBytes(bArr);
        return bArr;
    }

    /* renamed from: i */
    public final SecretKey m134951i(String str, int i11) {
        AbstractC19074t.m100208f(str, "keyAlgorithm");
        KeyGenerator keyGenerator = KeyGenerator.getInstance(str);
        keyGenerator.init(i11);
        SecretKey generateKey = keyGenerator.generateKey();
        AbstractC19074t.m100207e(generateKey, "let(...)");
        return generateKey;
    }

    /* renamed from: k */
    public final String m134952k(byte[] bArr) {
        AbstractC19074t.m100208f(bArr, ZMediaPlayer.OnNativeInvokeListener.ARG_BYTES);
        StringBuilder sb2 = new StringBuilder();
        for (byte b11 : bArr) {
            String m126982a = AbstractC24322d0.m126982a(C24869z.m129260c(b11 & 255), 16);
            if (m126982a.length() == 1) {
                sb2.append('0');
            }
            sb2.append(m126982a);
        }
        String sb3 = sb2.toString();
        AbstractC19074t.m100207e(sb3, "toString(...)");
        return sb3;
    }

    /* renamed from: l */
    public final String m134953l(InputStream inputStream, int i11) {
        Object m129218b;
        String m134952k;
        AbstractC19074t.m100208f(inputStream, "input");
        try {
            C24861r.a aVar = C24861r.f119264q;
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            try {
                byte[] bArr = new byte[8192];
                int read = inputStream.read(bArr);
                while (read >= 0) {
                    messageDigest.update(bArr, 0, read);
                    read = inputStream.read(bArr);
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
                AbstractC2933b.m13890a(inputStream, null);
                byte[] digest = messageDigest.digest();
                if (i11 == 4097) {
                    AbstractC19074t.m100205c(digest);
                    m134952k = m134944b(digest);
                } else {
                    AbstractC19074t.m100205c(digest);
                    m134952k = m134952k(digest);
                }
                m129218b = C24861r.m129218b(m134952k);
            } finally {
            }
        } catch (Throwable th2) {
            C24861r.a aVar2 = C24861r.f119264q;
            m129218b = C24861r.m129218b(AbstractC24862s.m129227a(th2));
        }
        if (C24861r.m129221e(m129218b) != null) {
            m129218b = "";
        }
        return (String) m129218b;
    }

    /* renamed from: m */
    public final String m134954m(String str) {
        AbstractC19074t.m100208f(str, "utf8");
        byte[] bytes = str.getBytes(C24321d.f117408b);
        AbstractC19074t.m100207e(bytes, "getBytes(...)");
        return m134941p(this, bytes, 0, 2, null);
    }

    /* renamed from: n */
    public final String m134955n(byte[] bArr, int i11) {
        Object m129218b;
        String m134952k;
        AbstractC19074t.m100208f(bArr, "input");
        try {
            C24861r.a aVar = C24861r.f119264q;
            byte[] digest = MessageDigest.getInstance("MD5").digest(bArr);
            if (i11 == 4097) {
                AbstractC19074t.m100205c(digest);
                m134952k = m134944b(digest);
            } else {
                AbstractC19074t.m100205c(digest);
                m134952k = m134952k(digest);
            }
            m129218b = C24861r.m129218b(m134952k);
        } catch (Throwable th2) {
            C24861r.a aVar2 = C24861r.f119264q;
            m129218b = C24861r.m129218b(AbstractC24862s.m129227a(th2));
        }
        if (C24861r.m129221e(m129218b) != null) {
            m129218b = "";
        }
        return (String) m129218b;
    }

    /* renamed from: q */
    public final String m134956q(String str) {
        AbstractC19074t.m100208f(str, "key");
        return "vtnkh" + m134954m(str);
    }

    /* renamed from: r */
    public final byte[] m134957r(String str, byte[] bArr, byte[] bArr2, int i11, int i12) {
        AbstractC19074t.m100208f(str, "hmacAlgo");
        AbstractC19074t.m100208f(bArr, "password");
        AbstractC19074t.m100208f(bArr2, "salt");
        Mac mac = Mac.getInstance(str);
        mac.init(new SecretKeySpec(bArr, str));
        int macLength = mac.getMacLength();
        int i13 = ((i12 + macLength) - 1) / macLength;
        byte[] bArr3 = new byte[4];
        byte[] bArr4 = new byte[i13 * macLength];
        a aVar = new a(mac, new byte[macLength]);
        if (1 <= i13) {
            int i14 = 0;
            int i15 = 1;
            while (true) {
                int i16 = 3;
                while (true) {
                    byte b11 = (byte) (bArr3[i16] + 1);
                    bArr3[i16] = b11;
                    if (b11 != 0) {
                        break;
                    }
                    i16--;
                }
                aVar.mo97872aD(bArr2, Integer.valueOf(i11), bArr3, bArr4, Integer.valueOf(i14));
                i14 += macLength;
                if (i15 == i13) {
                    break;
                }
                i15++;
            }
        }
        return bArr4;
    }

    /* renamed from: s */
    public final String m134958s(String str) {
        AbstractC19074t.m100208f(str, "utf8");
        byte[] bytes = str.getBytes(C24321d.f117408b);
        AbstractC19074t.m100207e(bytes, "getBytes(...)");
        return m134942u(this, bytes, 0, 2, null);
    }

    /* renamed from: t */
    public final String m134959t(byte[] bArr, int i11) {
        Object m129218b;
        String m134952k;
        AbstractC19074t.m100208f(bArr, ZMediaPlayer.OnNativeInvokeListener.ARG_BYTES);
        try {
            C24861r.a aVar = C24861r.f119264q;
            byte[] digest = MessageDigest.getInstance("SHA-256").digest(bArr);
            if (i11 == 4097) {
                AbstractC19074t.m100205c(digest);
                m134952k = m134944b(digest);
            } else {
                AbstractC19074t.m100205c(digest);
                m134952k = m134952k(digest);
            }
            m129218b = C24861r.m129218b(m134952k);
        } catch (Throwable th2) {
            C24861r.a aVar2 = C24861r.f119264q;
            m129218b = C24861r.m129218b(AbstractC24862s.m129227a(th2));
        }
        if (C24861r.m129221e(m129218b) != null) {
            m129218b = "";
        }
        return (String) m129218b;
    }
}
