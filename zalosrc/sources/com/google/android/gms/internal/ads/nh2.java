package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.Base64;
import java.net.URLDecoder;

/* loaded from: classes2.dex */
public final class nh2 extends kd2 {

    /* renamed from: e */
    private wo2 f25185e;

    /* renamed from: f */
    private byte[] f25186f;

    /* renamed from: g */
    private int f25187g;

    /* renamed from: h */
    private int f25188h;

    public nh2() {
        super(false);
    }

    @Override // com.google.android.gms.internal.ads.td4
    /* renamed from: a */
    public final int mo19942a(byte[] bArr, int i11, int i12) {
        if (i12 == 0) {
            return 0;
        }
        int i13 = this.f25188h;
        if (i13 == 0) {
            return -1;
        }
        int min = Math.min(i12, i13);
        System.arraycopy(g92.m22347h(this.f25186f), this.f25187g, bArr, i11, min);
        this.f25187g += min;
        this.f25188h -= min;
        m23893b(min);
        return min;
    }

    @Override // com.google.android.gms.internal.ads.qj2
    /* renamed from: d */
    public final long mo19943d(wo2 wo2Var) {
        m23895l(wo2Var);
        this.f25185e = wo2Var;
        Uri uri = wo2Var.f30043a;
        String scheme = uri.getScheme();
        v71.m27174e("data".equals(scheme), "Unsupported scheme: ".concat(String.valueOf(scheme)));
        String[] m22314H = g92.m22314H(uri.getSchemeSpecificPart(), ",");
        if (m22314H.length == 2) {
            String str = m22314H[1];
            if (m22314H[0].contains(";base64")) {
                try {
                    this.f25186f = Base64.decode(str, 0);
                } catch (IllegalArgumentException e11) {
                    throw zzbu.m28712b("Error while parsing Base64 encoded string: ".concat(String.valueOf(str)), e11);
                }
            } else {
                this.f25186f = g92.m22308B(URLDecoder.decode(str, w43.f29780a.name()));
            }
            long j11 = wo2Var.f30048f;
            int length = this.f25186f.length;
            if (j11 <= length) {
                int i11 = (int) j11;
                this.f25187g = i11;
                int i12 = length - i11;
                this.f25188h = i12;
                long j12 = wo2Var.f30049g;
                if (j12 != -1) {
                    this.f25188h = (int) Math.min(i12, j12);
                }
                m23896m(wo2Var);
                long j13 = wo2Var.f30049g;
                if (j13 != -1) {
                    return j13;
                }
                return this.f25188h;
            }
            this.f25186f = null;
            throw new zzey(2008);
        }
        throw zzbu.m28712b("Unexpected URI format: ".concat(String.valueOf(uri)), null);
    }

    @Override // com.google.android.gms.internal.ads.qj2
    public final Uri zzc() {
        wo2 wo2Var = this.f25185e;
        if (wo2Var != null) {
            return wo2Var.f30043a;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.qj2
    public final void zzd() {
        if (this.f25186f != null) {
            this.f25186f = null;
            m23894k();
        }
        this.f25185e = null;
    }
}
