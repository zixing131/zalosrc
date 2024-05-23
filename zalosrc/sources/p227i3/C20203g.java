package p227i3;

import android.util.Base64;
import java.security.MessageDigest;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: i3.g */
/* loaded from: classes2.dex */
public class C20203g {

    /* renamed from: a */
    private static C20203g f99851a;

    private C20203g() {
    }

    /* renamed from: d */
    public static C20203g m105349d() {
        if (f99851a == null) {
            synchronized (C20203g.class) {
                try {
                    if (f99851a == null) {
                        f99851a = new C20203g();
                    }
                } finally {
                }
            }
        }
        return f99851a;
    }

    /* renamed from: e */
    private byte[] m105350e(String str, String str2) {
        try {
            byte[] m105353c = m105353c(MessageDigest.getInstance("md5").digest(str2.getBytes("utf-8")), 24);
            int i11 = 16;
            for (int i12 = 0; i12 < 8; i12++) {
                m105353c[i11] = m105353c[i12];
                i11++;
            }
            SecretKeySpec secretKeySpec = new SecretKeySpec(m105353c, "DESede");
            IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
            Cipher cipher = Cipher.getInstance("DESede/CBC/PKCS5Padding");
            cipher.init(1, secretKeySpec, ivParameterSpec);
            return cipher.doFinal(str.getBytes("utf-8"));
        } catch (Exception e11) {
            throw new Exception(e11.getMessage());
        }
    }

    /* renamed from: a */
    public String m105351a(String str, String str2) {
        String str3 = null;
        try {
            str3 = Base64.encodeToString(m105350e(str, str2), 0);
            return str3.replace("\n", "").replace("\r", "");
        } catch (Exception e11) {
            e11.printStackTrace();
            return str3;
        }
    }

    /* renamed from: b */
    public byte[] m105352b() {
        byte[] bArr = new byte[16];
        try {
            new SecureRandom().nextBytes(bArr);
        } catch (Exception unused) {
        }
        return bArr;
    }

    /* renamed from: c */
    public byte[] m105353c(byte[] bArr, int i11) {
        try {
            byte[] bArr2 = new byte[i11];
            for (int i12 = 0; i12 < bArr.length; i12++) {
                bArr2[i12] = bArr[i12];
            }
            for (int length = bArr.length; length < i11; length++) {
                bArr2[length] = 0;
            }
            return bArr2;
        } catch (Exception e11) {
            throw new Exception(e11.getMessage());
        }
    }
}
