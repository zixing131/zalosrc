package g40;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import gm0.AbstractC19509c;
import ho0.AbstractC20110a;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

/* renamed from: g40.a */
/* loaded from: classes5.dex */
public final class C19226a {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private Cipher f95696a;

    /* renamed from: b */
    private final String f95697b = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA66LGF81uRv1H5X5bWtejXgmSRv7ftiS5YFeCX27WuYdDmgSpXhmQwer2G7sCM9lx/Mwb4yu+J/o1sAxFT+VC8dQ/v5nqtbQsYRtNsSsDlFO4Ywk4+Gka0v8SItEeP8OsA1WXrhA25WsSVsyqAxRhKub29VP5Sq7XWwJdXYDkB5zjd/aq9lYaSWM1ALD1bh4xpd4lLfvWpEh1nIztUhQSTnme4I4kH5+q972fPljlN43E6HoBCUZjvUxkDcgBHN7h65H3HZILLUh2wfAhXPhTusgQ1kgL2kbNfyZcdRxGN0nb+Iu6dBTAA2129Cbn1fyFTsPsl8JZuzzaJrfK8mYi0wIDAQAB";

    /* renamed from: c */
    private final String f95698c = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCadK233epDebignHqb8X3l0jtidYbqSNZYWO+tcuRwbpD9qxupOh+VOOOyFz87mnk589ceJHAmmz7Q5MRBQtAgAxvrjmHvi1OrMbr7jlp0t+YtF6E+nWXzEkWGR2fRxOJ4Dco6NUQLO2/buSpuMgEcALLyItyw+NgRqyNnjP/ijJpH66qqcY3+4s4b6V/vngjOVfZb+UR0R2QDNo2/8MCrKYCv8D4ZT8PGCrqil9UL9EUkzNV5Y6FjSJxTsrI9x0raJap4qz9EUqWHXV6LZ6B1ZzXpB16BMsx6nl1iCEwg1JqbN2pnog/2bZv9/9w/VDDRqPruoP/8NlZDtq8jZvAdAgMBAAECggEAR32GArrGeaDXYg/LeG6YdU2Piw0W+03nWFEh7shlD909YwxV60gp4inIyl+UNwRS5A4HHb6D4nqs4odgh0xjhM2rmKX4kqWMfoqwH0tOdwO/mFN9oLu9unpUj8hxN1jH8gV/+t04t3I1XiAgkYy3kryIFycnuwoTCGqMIpvSvIrYGBaZt6SmU9HC3RvFMckrsUTIrFBKUMX12EThxDj+qtv7v0aOKOHyGnRAvDWU8Ft91ps0vcmShH0rbD2p69yt/376gkLwNq0xcBM4kvRbsI/spQQpZMjuY11yw0wAJ2fCXnY095/khzOo5UIKsc+JZM47/b5NVDCDbnYw8zRbiQKBgQDyRWf/6hDqr2wlS5ht2UfqmqJXE+RNB8RYkbkVbkFBDLm3x3IZmImbjX5Co9lzOT+8zcqoJXGu8lcpTcMR4eL7w5RpebHYakkQOzdcScYjPX0nWKxUZ4RtH7kPQPW/KMLn9Byv/FyGmA3e8Xjqy8Ogsprgp0ZORQmvRGFyvx7UvwKBgQCjNVjl29peIyfys5mffIRruOvuITxbL2iS17xGiMnJwGh4n0l8U/F1rJH6YSk3BOHRDX4j3g+vUFpZ+uexKEWDzIu8CBfqHvmqYpvIgz9eFhNdqqmskTJjXqTpY/kvwLDQ1IDdyAv+4tqMJLksuxhKreLelCq/32XXOoeoXsSmIwKBgQCW3ce8opq0OldDBkc+qJ7TJkZPqXBy05JegShbgxQZmP4Rxp5z9/xBJKRqhTQFP7JENXasrNyVUA4dB3KhMSQzGYDTCdhI5y7mb6myy7IaAdFs7hgqW2gouCd6qz4dMxnkbaxrnuBTZF7G5WIh/I+vA2nU2fW7CdzVCuUQGpntawKBgGSVjjIrass1k3sqYPU/wkS5dP4PkakI8MP/HVPDHcmvQTOFx75N5bQGJPlQRBxab+ltDV6Bjt0XAngOABjYnu75cuzxd/ucF3aAy02qRbVwmYLSmTt3SLyhKbWFHZ/me5JYRQtqLKprmRFh2JXOwMvVmspeOnKB9bvNoKmNrlhNAoGATxOzaLtz03FbTHrYMRpSwY6Fu/K42TH/b9zj8r8xTMy8bibgPylKX+BaXg7QXcACwQBAuZ65BY4GhM+LngNmxH+4K5OO+xeUQfbPt3FyMKxZ8dzmuRed6m3aDNnQkfUU4/mRU5/LA7BDe6L/UfTWXW5cWZVvsovY9ejbIBiJwjg=";

    /* renamed from: g40.a$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final byte[] m100880a(String str) {
            byte[] m101978a = AbstractC19509c.m101978a(str);
            AbstractC19074t.m100207e(m101978a, "decode(...)");
            return m101978a;
        }

        /* renamed from: b */
        public final String m100881b(byte[] bArr) {
            String m101979b = AbstractC19509c.m101979b(bArr);
            AbstractC19074t.m100207e(m101979b, "encode(...)");
            return m101979b;
        }
    }

    public C19226a() {
        m100877c();
    }

    /* renamed from: c */
    private final void m100877c() {
        try {
            this.f95696a = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            AbstractC20110a.f98889a.mo104548a("Init Cipher success", new Object[0]);
        } catch (NoSuchAlgorithmException e11) {
            throw new RuntimeException("Failed to get Cipher", e11);
        } catch (NoSuchPaddingException e12) {
            throw new RuntimeException("Failed to get Cipher", e12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x002a A[Catch: IllegalBlockSizeException -> 0x0012, BadPaddingException -> 0x0014, InvalidKeyException -> 0x0016, TRY_LEAVE, TryCatch #3 {InvalidKeyException -> 0x0016, BadPaddingException -> 0x0014, IllegalBlockSizeException -> 0x0012, blocks: (B:3:0x0002, B:5:0x002a, B:15:0x001c, B:12:0x0022), top: B:2:0x0002 }] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final byte[] m100878a(byte[] bArr, byte[] bArr2) {
        PublicKey publicKey;
        try {
            try {
                publicKey = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(bArr));
            } catch (InvalidKeyException e11) {
                AbstractC20110a.a aVar = AbstractC20110a.f98889a;
                aVar.mo104559s("InvalidKeyException when init cipher", new Object[0]);
                aVar.mo104552e(e11);
            } catch (BadPaddingException e12) {
                AbstractC20110a.a aVar2 = AbstractC20110a.f98889a;
                aVar2.mo104559s("BadPaddingException when do final", new Object[0]);
                aVar2.mo104552e(e12);
            } catch (IllegalBlockSizeException e13) {
                AbstractC20110a.a aVar3 = AbstractC20110a.f98889a;
                aVar3.mo104559s("IllegalBlockSizeException when do final", new Object[0]);
                aVar3.mo104552e(e13);
            }
        } catch (NoSuchAlgorithmException e14) {
            AbstractC20110a.f98889a.mo104552e(e14);
            publicKey = null;
            if (publicKey != null) {
            }
            return null;
        } catch (InvalidKeySpecException e15) {
            AbstractC20110a.f98889a.mo104552e(e15);
            publicKey = null;
            if (publicKey != null) {
            }
            return null;
        }
        if (publicKey != null) {
            Cipher cipher = this.f95696a;
            AbstractC19074t.m100205c(cipher);
            cipher.init(1, publicKey);
            Cipher cipher2 = this.f95696a;
            AbstractC19074t.m100205c(cipher2);
            byte[] doFinal = cipher2.doFinal(bArr2);
            AbstractC20110a.f98889a.mo104548a("Encrypt file success", new Object[0]);
            return doFinal;
        }
        return null;
    }

    /* renamed from: b */
    public final byte[] m100879b() {
        byte[] bArr = new byte[32];
        new SecureRandom().nextBytes(bArr);
        return bArr;
    }
}
