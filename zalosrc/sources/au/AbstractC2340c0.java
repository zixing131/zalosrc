package au;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.text.TextUtils;
import java.security.MessageDigest;
import mm0.AbstractC23350e;
import mm0.AbstractC23352g;

/* renamed from: au.c0 */
/* loaded from: classes4.dex */
public abstract class AbstractC2340c0 {

    /* renamed from: a */
    private static String f9838a;

    /* renamed from: a */
    public static String m12302a(Context context) {
        if (!TextUtils.isEmpty(f9838a)) {
            return f9838a;
        }
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures[0].toByteArray());
            StringBuffer stringBuffer = new StringBuffer();
            for (byte b11 : digest) {
                String hexString = Integer.toHexString(b11 & 255);
                if (hexString.length() == 1) {
                    stringBuffer.append("0");
                }
                stringBuffer.append(hexString);
            }
            String stringBuffer2 = stringBuffer.toString();
            f9838a = stringBuffer2;
            return stringBuffer2;
        } catch (Exception e11) {
            AbstractC23350e.m122776f("MainApplication", e11);
            return "";
        }
    }

    /* renamed from: b */
    public static String m12303b(Context context) {
        try {
            Signature[] signatureArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures;
            if (signatureArr == null || signatureArr.length <= 0) {
                return "";
            }
            return AbstractC23352g.m122788d(signatureArr[0].toCharsString());
        } catch (PackageManager.NameNotFoundException e11) {
            AbstractC23350e.m122776f("MainApplication", e11);
            return "";
        }
    }
}
