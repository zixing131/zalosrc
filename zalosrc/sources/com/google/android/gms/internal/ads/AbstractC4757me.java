package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import java.lang.reflect.Method;
import java.security.GeneralSecurityException;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.me */
/* loaded from: classes2.dex */
public abstract class AbstractC4757me {

    /* renamed from: a */
    static xd3 f24481a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0034, code lost:            if (r0 != null) goto L56;     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m24551a(C4719le c4719le) {
        Method m24247j;
        xd3 m25472a;
        if (f24481a != null) {
            return true;
        }
        String str = (String) zzay.zzc().m21823b(AbstractC4554gx.f21399v2);
        if (str == null || str.length() == 0) {
            if (c4719le == null || (m24247j = c4719le.m24247j("hwvIMOeohSBrCWT4pVkQok22g/l0cZbbqOTmNbjObWwcwhLlaFMNibQmd2cIB1Vb", "24f7+wNdQe8HQwz0gPH2QIzxUp8iQNA20yBU7Dg74Sc=")) == null) {
                str = null;
            } else {
                str = (String) m24247j.invoke(null, new Object[0]);
            }
        }
        try {
            ke3 m25426a = pe3.m25426a(AbstractC5163xb.m27876b(str, true));
            for (sp3 sp3Var : mh3.f24531a.m27045H()) {
                if (!sp3Var.m26388I().isEmpty()) {
                    if (!sp3Var.m26387H().isEmpty()) {
                        if (!sp3Var.m26386G().isEmpty()) {
                            if (!sp3Var.m26386G().equals("TinkAead") && !sp3Var.m26386G().equals("TinkMac") && !sp3Var.m26386G().equals("TinkHybridDecrypt") && !sp3Var.m26386G().equals("TinkHybridEncrypt") && !sp3Var.m26386G().equals("TinkPublicKeySign") && !sp3Var.m26386G().equals("TinkPublicKeyVerify") && !sp3Var.m26386G().equals("TinkStreamingAead") && !sp3Var.m26386G().equals("TinkDeterministicAead")) {
                                df3.m21367a(sp3Var.m26386G());
                                throw null;
                            }
                        } else {
                            throw new GeneralSecurityException("Missing catalogue_name.");
                        }
                    } else {
                        throw new GeneralSecurityException("Missing primitive_name.");
                    }
                } else {
                    throw new GeneralSecurityException("Missing type_url.");
                }
            }
            m25472a = ph3.m25472a(m25426a);
            f24481a = m25472a;
        } catch (IllegalArgumentException | GeneralSecurityException unused) {
        }
        if (m25472a != null) {
            return true;
        }
        return false;
    }
}
