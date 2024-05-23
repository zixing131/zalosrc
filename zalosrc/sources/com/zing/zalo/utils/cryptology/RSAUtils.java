package com.zing.zalo.utils.cryptology;

import com.zing.zalo.utils.Keep;
import gm0.AbstractC19509c;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;

@Keep
/* loaded from: classes.dex */
public class RSAUtils {
    /* renamed from: a */
    public static byte[] m89293a(byte[] bArr, PrivateKey privateKey) {
        try {
            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            cipher.init(2, privateKey);
            cipher.update(bArr);
            return cipher.doFinal();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static byte[] m89294b(byte[] bArr, PublicKey publicKey) {
        try {
            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            cipher.init(1, publicKey);
            cipher.update(bArr);
            return cipher.doFinal();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: c */
    private static PrivateKey m89295c(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePrivate(new PKCS8EncodedKeySpec(AbstractC19509c.m101978a(str)));
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: d */
    private static PublicKey m89296d(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(AbstractC19509c.m101978a(str)));
        } catch (Exception unused) {
            return null;
        }
    }

    @Keep
    public static byte[] decrypt(byte[] bArr, byte[] bArr2) {
        try {
            return m89293a(AbstractC19509c.m101978a(new String(bArr, "utf-8")), m89295c(new String(bArr2, "utf-8")));
        } catch (Exception unused) {
            return null;
        }
    }

    @Keep
    public static byte[] encodeBase64(byte[] bArr) {
        try {
            return AbstractC19509c.m101979b(bArr).getBytes("utf-8");
        } catch (Exception unused) {
            return null;
        }
    }

    @Keep
    public static byte[] encrypt(byte[] bArr, byte[] bArr2) {
        try {
            return m89294b(bArr, m89296d(new String(bArr2, "utf-8")));
        } catch (Exception unused) {
            return null;
        }
    }

    public static native void testNativeAccess();
}
