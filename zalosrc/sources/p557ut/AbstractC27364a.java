package p557ut;

import gm0.AbstractC19509c;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;

/* renamed from: ut.a */
/* loaded from: classes4.dex */
public abstract class AbstractC27364a {
    /* renamed from: a */
    public static byte[] m140202a(byte[] bArr, String str) {
        try {
            return m140203b(bArr, m140204c(str));
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static byte[] m140203b(byte[] bArr, PublicKey publicKey) {
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
    private static PublicKey m140204c(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(AbstractC19509c.m101978a(str)));
        } catch (Exception unused) {
            return null;
        }
    }
}
