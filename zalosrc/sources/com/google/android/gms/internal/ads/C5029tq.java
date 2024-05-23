package com.google.android.gms.internal.ads;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.tq */
/* loaded from: classes2.dex */
final class C5029tq {

    /* renamed from: a */
    ByteArrayOutputStream f28468a = new ByteArrayOutputStream(4096);

    /* renamed from: b */
    Base64OutputStream f28469b = new Base64OutputStream(this.f28468a, 10);

    public final String toString() {
        try {
            this.f28469b.close();
        } catch (IOException e11) {
            yk0.zzh("HashManager: Unable to convert to Base64.", e11);
        }
        try {
            this.f28468a.close();
            return this.f28468a.toString();
        } catch (IOException e12) {
            yk0.zzh("HashManager: Unable to convert to Base64.", e12);
            return "";
        } finally {
            this.f28468a = null;
            this.f28469b = null;
        }
    }
}
