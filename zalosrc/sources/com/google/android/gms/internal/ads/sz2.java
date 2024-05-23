package com.google.android.gms.internal.ads;

import android.os.Build;
import java.io.File;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.cert.X509Certificate;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class sz2 {

    /* renamed from: c */
    protected static final byte[] f28065c = {61, 122, 18, 35, 1, -102, -93, -99, -98, -96, -29, 67, 106, -73, -64, -119, 107, -5, 79, -74, 121, -12, -34, 95, -25, -62, 63, 50, 108, -113, -103, 74};

    /* renamed from: d */
    protected static final byte[] f28066d = {16, 57, 56, -18, 69, 55, -27, -98, -114, -25, -110, -10, 84, 80, 79, -72, 52, 111, -58, -77, 70, -48, -69, -60, 65, 95, -61, 57, -4, -4, -114, -63};

    /* renamed from: a */
    private final byte[] f28067a = f28066d;

    /* renamed from: b */
    private final byte[] f28068b = f28065c;

    /* renamed from: a */
    public final boolean m26458a(File file) {
        try {
            X509Certificate[][] m27563a = AbstractC5121w7.m27563a(file.getAbsolutePath());
            if (m27563a.length == 1) {
                byte[] digest = MessageDigest.getInstance("SHA-256").digest(m27563a[0][0].getEncoded());
                if (Arrays.equals(this.f28068b, digest)) {
                    return true;
                }
                if (!"user".equals(Build.TYPE) && Arrays.equals(this.f28067a, digest)) {
                    return true;
                }
                return false;
            }
            throw new GeneralSecurityException("APK has more than one signature.");
        } catch (zzajg e11) {
            throw new GeneralSecurityException("Package is not signed", e11);
        } catch (IOException e12) {
            e = e12;
            throw new GeneralSecurityException("Failed to verify signatures", e);
        } catch (RuntimeException e13) {
            e = e13;
            throw new GeneralSecurityException("Failed to verify signatures", e);
        }
    }
}
