package com.zing.zalocore.utils.cryptology;

import android.text.TextUtils;
import com.zing.zalocore.CoreUtility;
import gm0.AbstractC19512f;
import ho0.AbstractC20110a;
import java.io.File;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import jm0.AbstractC21309s;

/* loaded from: classes.dex */
public final class CoreUtils {

    /* renamed from: a */
    public static boolean f89409a = false;

    /* renamed from: b */
    public static Random f89410b = new Random();

    /* renamed from: a */
    public static String m93446a(String str) {
        try {
            String mo100078f = CoreUtility.m93148a().mo100078f();
            if (mo100078f != null && mo100078f.length() >= 32) {
                StringBuilder sb2 = new StringBuilder(32);
                for (int i11 = 0; i11 < 16; i11++) {
                    sb2.append(mo100078f.charAt(i11 * 2));
                }
                int length = mo100078f.length() - 1;
                for (int i12 = 0; i12 < 16; i12++) {
                    sb2.append(mo100078f.charAt(length - (i12 * 2)));
                }
                SecretKeySpec secretKeySpec = new SecretKeySpec(sb2.toString().getBytes(), "AES/CBC/PKCS5Padding");
                Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
                cipher.init(1, secretKeySpec, new IvParameterSpec(m93448c()));
                return AbstractC19512f.m101985d(cipher.doFinal(str.getBytes("utf-8")));
            }
            return null;
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            return null;
        }
    }

    /* renamed from: b */
    public static String m93447b(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (!f89409a) {
                m93452g(m93450e().getPath());
            }
            return encodeHttpParamsNative(str);
        } catch (Throwable th2) {
            AbstractC20110a.m104539h(th2);
            return m93446a(str);
        }
    }

    /* renamed from: c */
    public static byte[] m93448c() {
        byte[] bArr = new byte[16];
        byte[] bArr2 = new byte[16];
        Arrays.fill(bArr2, (byte) 1);
        new SecureRandom().nextBytes(bArr);
        for (int i11 = 0; i11 < 16; i11++) {
            byte b11 = bArr[i11];
            bArr[i11] = (byte) ((bArr2[i11] * b11) - b11);
        }
        return bArr;
    }

    /* renamed from: d */
    public static String m93449d(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return generateSignatureNative(str);
        } catch (Throwable th2) {
            AbstractC20110a.m104539h(th2);
            return AbstractC21309s.m110338b(str, CoreUtility.f89227c);
        }
    }

    /* renamed from: e */
    public static File m93450e() {
        return new File(CoreUtility.getAppContext().getNoBackupFilesDir(), "ZALO-INSTALLATION");
    }

    private static native String encodeHttpParamsNative(String str);

    private static native String encodeSocketParamsNative(String str, int i11);

    /* renamed from: f */
    public static String m93451f() {
        try {
            if (!f89409a) {
                m93452g(m93450e().getPath());
            }
            return getZCIDNative();
        } catch (Throwable th2) {
            AbstractC20110a.m104539h(th2);
            return CoreUtility.m93148a().mo100078f();
        }
    }

    /* renamed from: g */
    public static void m93452g(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            AbstractC20110a.m104535d("initHttpParams: %s", str);
            String mo100079g = CoreUtility.m93148a().mo100079g();
            if (!TextUtils.isEmpty(mo100079g)) {
                synchronized (CoreUtils.class) {
                    initHttpParamsSNative(mo100079g);
                    f89409a = true;
                }
            }
        } catch (Throwable th2) {
            AbstractC20110a.m104539h(th2);
            CoreUtility.m93148a().mo100074a(th2);
        }
    }

    private static native String generateSignatureNative(String str);

    private static native String getZCIDNative();

    /* renamed from: h */
    public static void m93453h(long j11) {
        try {
            AbstractC20110a.m104535d("initSocketAuthenParams: %d", Long.valueOf(j11));
            initSocketParamsNative(j11);
        } catch (Throwable th2) {
            AbstractC20110a.m104539h(th2);
        }
    }

    private static native void initHttpParamsNative(String str);

    private static native void initHttpParamsSNative(String str);

    private static native void initSocketParamsNative(long j11);
}
