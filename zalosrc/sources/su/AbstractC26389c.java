package su;

import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import com.zing.zalocore.utils.cryptology.CoreUtils;
import gm0.AbstractC19512f;
import java.io.File;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import mm0.AbstractC23352g;
import p239ih.C20556f;

/* renamed from: su.c */
/* loaded from: classes4.dex */
public abstract class AbstractC26389c {
    /* renamed from: a */
    public static boolean m135985a(String str, String str2) {
        try {
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || !new C20556f(str).m106830b()) {
                return false;
            }
            String m135988d = m135988d(str);
            if (TextUtils.isEmpty(m135988d)) {
                return false;
            }
            if (!TextUtils.equals(str2, m135988d)) {
                return false;
            }
            return true;
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return false;
    }

    /* renamed from: b */
    public static String m135986b(String str, String str2) {
        try {
            Charset charset = StandardCharsets.UTF_8;
            SecretKeySpec secretKeySpec = new SecretKeySpec(str.getBytes(charset), "AES/CBC/PKCS5Padding");
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(2, secretKeySpec, new IvParameterSpec(CoreUtils.m93448c()));
            return new String(cipher.doFinal(AbstractC19512f.m101984c(str2)), charset);
        } catch (Exception e11) {
            e11.printStackTrace();
            return "";
        }
    }

    /* renamed from: c */
    public static String m135987c(File file) {
        try {
            String m122785a = AbstractC23352g.m122785a(file);
            if (m122785a == null) {
                return "";
            }
            return m122785a;
        } catch (Exception e11) {
            e11.printStackTrace();
            return "";
        }
    }

    /* renamed from: d */
    public static String m135988d(String str) {
        try {
            C20556f c20556f = new C20556f(str);
            ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = null;
            try {
                if (c20556f.m106844q()) {
                    String m106831c = c20556f.m106831c();
                    if (!TextUtils.isEmpty(m106831c)) {
                        C20556f c20556f2 = new C20556f(m106831c);
                        if (c20556f2.m106830b()) {
                            autoCloseInputStream = (ParcelFileDescriptor.AutoCloseInputStream) c20556f2.m106838k();
                        }
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            if (autoCloseInputStream == null) {
                autoCloseInputStream = (ParcelFileDescriptor.AutoCloseInputStream) c20556f.m106838k();
            }
            String m122786b = AbstractC23352g.m122786b(autoCloseInputStream);
            if (m122786b == null) {
                return "";
            }
            return m122786b;
        } catch (Exception e12) {
            e12.printStackTrace();
            return "";
        }
    }

    /* renamed from: e */
    public static String m135989e(String str) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA-256").digest(str.getBytes(StandardCharsets.UTF_8));
            StringBuilder sb2 = new StringBuilder();
            for (byte b11 : digest) {
                String hexString = Integer.toHexString(b11 & 255);
                if (hexString.length() == 1) {
                    sb2.append('0');
                }
                sb2.append(hexString);
            }
            return sb2.toString();
        } catch (Exception e11) {
            throw new RuntimeException(e11);
        }
    }
}
