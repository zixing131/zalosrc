package p043c;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import p174g.AbstractC19175a;

/* renamed from: c.g */
/* loaded from: classes2.dex */
public final class C3171g {

    /* renamed from: a */
    private static C3171g f13397a;

    private C3171g() {
    }

    /* renamed from: a */
    public static C3171g m15959a() {
        if (f13397a == null) {
            f13397a = new C3171g();
        }
        return f13397a;
    }

    /* renamed from: b */
    private String m15960b(String str) {
        return str.replace('_', '/').replace('-', '+');
    }

    /* renamed from: d */
    private byte[] m15961d(byte[] bArr, String str) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(2, new SecretKeySpec(bArr, "AES"), new IvParameterSpec(new byte[16]));
            return cipher.doFinal(AbstractC19175a.m100630d(str));
        } catch (Exception e11) {
            throw new Exception(e11.getMessage());
        }
    }

    /* renamed from: c */
    public String m15962c(String str, String str2) {
        String m15960b = m15960b(str2);
        if (str.length() >= 16) {
            return new String(m15961d(str.substring(0, 16).getBytes(), m15960b), "UTF-8");
        }
        throw new Exception("length of key invalid");
    }
}
