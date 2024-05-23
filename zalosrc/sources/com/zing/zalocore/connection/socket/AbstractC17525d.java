package com.zing.zalocore.connection.socket;

import com.zing.zalocore.utils.cryptology.CoreUtils;
import gm0.AbstractC19509c;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.zing.zalocore.connection.socket.d */
/* loaded from: classes7.dex */
public abstract class AbstractC17525d {
    /* renamed from: a */
    public static String m93353a(String str, String str2) {
        return m93354b(CoreUtils.m93448c(), str, str2);
    }

    /* renamed from: b */
    public static String m93354b(byte[] bArr, String str, String str2) {
        SecretKeySpec secretKeySpec = new SecretKeySpec(AbstractC19509c.m101978a(str), "AES");
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        byte[] m101978a = AbstractC19509c.m101978a(str2);
        cipher.init(2, secretKeySpec, new IvParameterSpec(bArr));
        return new String(cipher.doFinal(m101978a));
    }

    /* renamed from: c */
    public static String m93355c(String str, String str2) {
        return m93356d(CoreUtils.m93448c(), str, str2);
    }

    /* renamed from: d */
    public static String m93356d(byte[] bArr, String str, String str2) {
        SecretKeySpec secretKeySpec = new SecretKeySpec(AbstractC19509c.m101978a(str), "AES");
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(1, secretKeySpec, new IvParameterSpec(bArr));
        return AbstractC19509c.m101979b(cipher.doFinal(str2.getBytes("UTF-8")));
    }

    /* renamed from: e */
    public static byte[] m93357e(byte[] bArr, String str, String str2) {
        SecretKeySpec secretKeySpec = new SecretKeySpec(AbstractC19509c.m101978a(str), "AES");
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(1, secretKeySpec, new IvParameterSpec(bArr));
        return cipher.doFinal(str2.getBytes("UTF-8"));
    }

    /* renamed from: f */
    public static byte[] m93358f() {
        byte[] bArr = new byte[16];
        SecureRandom.getInstance("SHA1PRNG").nextBytes(bArr);
        return bArr;
    }

    /* renamed from: g */
    public static boolean m93359g(String str, String str2) {
        boolean z11;
        try {
            try {
                z11 = m93355c(str, "Zalo sản phẩm cho người Việt.").equals(str2);
            } catch (Exception e11) {
                e11.printStackTrace();
                z11 = false;
            }
            try {
                if (!m93353a(str, str2).equals("Zalo sản phẩm cho người Việt.")) {
                    return false;
                }
                return z11;
            } catch (Exception e12) {
                e12.printStackTrace();
                return false;
            }
        } catch (Exception e13) {
            e13.printStackTrace();
            return false;
        }
    }
}
