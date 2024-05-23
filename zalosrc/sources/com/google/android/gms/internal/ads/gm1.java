package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Looper;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzbo;
import com.google.android.gms.ads.internal.util.zze;
import java.util.concurrent.Executor;
import p229i5.InterfaceC20285f;

/* loaded from: classes2.dex */
public final class gm1 {

    /* renamed from: a */
    private final zzbo f20733a;

    /* renamed from: b */
    private final InterfaceC20285f f20734b;

    /* renamed from: c */
    private final Executor f20735c;

    public gm1(zzbo zzboVar, InterfaceC20285f interfaceC20285f, Executor executor) {
        this.f20733a = zzboVar;
        this.f20734b = interfaceC20285f;
        this.f20735c = executor;
    }

    /* renamed from: c */
    private final Bitmap m22470c(byte[] bArr, BitmapFactory.Options options) {
        long mo105914b = this.f20734b.mo105914b();
        boolean z11 = false;
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        long mo105914b2 = this.f20734b.mo105914b();
        if (decodeByteArray != null) {
            int width = decodeByteArray.getWidth();
            int height = decodeByteArray.getHeight();
            int allocationByteCount = decodeByteArray.getAllocationByteCount();
            long j11 = mo105914b2 - mo105914b;
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                z11 = true;
            }
            zze.zza("Decoded image w: " + width + " h:" + height + " bytes: " + allocationByteCount + " time: " + j11 + " on ui thread: " + z11);
        }
        return decodeByteArray;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ Bitmap m22471a(double d11, boolean z11, C4639j8 c4639j8) {
        byte[] bArr = c4639j8.f22715b;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDensity = (int) (d11 * 160.0d);
        if (!z11) {
            options.inPreferredConfig = Bitmap.Config.RGB_565;
        }
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21282j5)).booleanValue()) {
            options.inJustDecodeBounds = true;
            m22470c(bArr, options);
            options.inJustDecodeBounds = false;
            int i11 = options.outWidth * options.outHeight;
            if (i11 > 0) {
                options.inSampleSize = 1 << ((33 - Integer.numberOfLeadingZeros((i11 - 1) / ((Integer) zzay.zzc().m21823b(AbstractC4554gx.f21292k5)).intValue())) / 2);
            }
        }
        return m22470c(bArr, options);
    }

    /* renamed from: b */
    public final tc3 m22472b(String str, final double d11, final boolean z11) {
        return kc3.m23881m(this.f20733a.zza(str), new y43() { // from class: com.google.android.gms.internal.ads.fm1
            @Override // com.google.android.gms.internal.ads.y43
            public final Object apply(Object obj) {
                return gm1.this.m22471a(d11, z11, (C4639j8) obj);
            }
        }, this.f20735c);
    }
}
