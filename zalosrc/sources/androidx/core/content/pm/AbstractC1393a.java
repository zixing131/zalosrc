package androidx.core.content.pm;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;

/* renamed from: androidx.core.content.pm.a */
/* loaded from: classes2.dex */
public abstract class AbstractC1393a {

    /* renamed from: androidx.core.content.pm.a$a */
    /* loaded from: classes2.dex */
    private static class a {
        /* renamed from: a */
        static Signature[] m7001a(SigningInfo signingInfo) {
            return signingInfo.getApkContentsSigners();
        }

        /* renamed from: b */
        static long m7002b(PackageInfo packageInfo) {
            return packageInfo.getLongVersionCode();
        }

        /* renamed from: c */
        static Signature[] m7003c(SigningInfo signingInfo) {
            return signingInfo.getSigningCertificateHistory();
        }

        /* renamed from: d */
        static boolean m7004d(SigningInfo signingInfo) {
            return signingInfo.hasMultipleSigners();
        }

        /* renamed from: e */
        static boolean m7005e(PackageManager packageManager, String str, byte[] bArr, int i11) {
            return packageManager.hasSigningCertificate(str, bArr, i11);
        }
    }

    /* renamed from: a */
    public static long m7000a(PackageInfo packageInfo) {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.m7002b(packageInfo);
        }
        return packageInfo.versionCode;
    }
}
