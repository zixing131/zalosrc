package p229i5;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import p289k5.C21472e;

/* renamed from: i5.a */
/* loaded from: classes2.dex */
public abstract class AbstractC20280a {
    /* renamed from: a */
    public static byte[] m105897a(Context context, String str) {
        MessageDigest m105898b;
        PackageInfo m111064f = C21472e.m111067a(context).m111064f(str, 64);
        Signature[] signatureArr = m111064f.signatures;
        if (signatureArr != null && signatureArr.length == 1 && (m105898b = m105898b("SHA1")) != null) {
            return m105898b.digest(m111064f.signatures[0].toByteArray());
        }
        return null;
    }

    /* renamed from: b */
    public static MessageDigest m105898b(String str) {
        MessageDigest messageDigest;
        for (int i11 = 0; i11 < 2; i11++) {
            try {
                messageDigest = MessageDigest.getInstance(str);
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }
}
