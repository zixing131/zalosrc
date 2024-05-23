package com.google.android.gms.internal.ads;

import android.util.Base64;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class or2 {
    public or2() {
        try {
            gf3.m22433a();
        } catch (GeneralSecurityException e11) {
            zze.zza("Failed to Configure Aead. ".concat(e11.toString()));
            zzt.zzo().m22945t(e11, "CryptoUtils.registerAead");
        }
    }

    /* renamed from: a */
    public static final String m25246a() {
        jt3 m24724G = mt3.m24724G();
        try {
            td3.m26600b(ke3.m23931b(je3.m23608a("AES128_GCM")), rd3.m26072b(m24724G));
        } catch (IOException | GeneralSecurityException e11) {
            zze.zza("Failed to generate key".concat(e11.toString()));
            zzt.zzo().m22945t(e11, "CryptoUtils.generateKey");
        }
        String encodeToString = Base64.encodeToString(m24724G.m23751b().m24738k(), 11);
        m24724G.m23752c();
        return encodeToString;
    }

    /* renamed from: b */
    public static final String m25247b(byte[] bArr, byte[] bArr2, String str, ys1 ys1Var) {
        ke3 m25248c = m25248c(str);
        if (m25248c == null) {
            return null;
        }
        try {
            byte[] mo22153a = ((pd3) m25248c.m23933d(pd3.class)).mo22153a(bArr, bArr2);
            ys1Var.m28337a().put("ds", "1");
            return new String(mo22153a, "UTF-8");
        } catch (UnsupportedEncodingException | GeneralSecurityException e11) {
            zze.zza("Failed to decrypt ".concat(e11.toString()));
            zzt.zzo().m22945t(e11, "CryptoUtils.decrypt");
            ys1Var.m28337a().put("dsf", e11.toString());
            return null;
        }
    }

    /* renamed from: c */
    private static final ke3 m25248c(String str) {
        try {
            return td3.m26599a(qd3.m25694b(Base64.decode(str, 11)));
        } catch (IOException | GeneralSecurityException e11) {
            zze.zza("Failed to get keysethandle".concat(e11.toString()));
            zzt.zzo().m22945t(e11, "CryptoUtils.getHandle");
            return null;
        }
    }
}
