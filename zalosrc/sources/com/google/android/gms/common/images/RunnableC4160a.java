package com.google.android.gms.common.images;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.internal.AbstractC4169c;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.google.android.gms.common.images.a */
/* loaded from: classes2.dex */
final class RunnableC4160a implements Runnable {

    /* renamed from: p */
    private final Uri f16521p;

    /* renamed from: q */
    private final ParcelFileDescriptor f16522q;

    public RunnableC4160a(ImageManager imageManager, Uri uri, ParcelFileDescriptor parcelFileDescriptor) {
        this.f16521p = uri;
        this.f16522q = parcelFileDescriptor;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bitmap bitmap;
        boolean z11;
        AbstractC4169c.m19634b("LoadBitmapFromDiskRunnable can't be executed in the main thread");
        ParcelFileDescriptor parcelFileDescriptor = this.f16522q;
        Bitmap bitmap2 = null;
        boolean z12 = false;
        if (parcelFileDescriptor != null) {
            try {
                bitmap2 = BitmapFactory.decodeFileDescriptor(parcelFileDescriptor.getFileDescriptor());
            } catch (OutOfMemoryError unused) {
                "OOM while loading bitmap for uri: ".concat(String.valueOf(this.f16521p));
                z12 = true;
            }
            try {
                this.f16522q.close();
            } catch (IOException unused2) {
            }
            bitmap = bitmap2;
            z11 = z12;
        } else {
            bitmap = null;
            z11 = false;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        ImageManager.m19602b(null).post(new RunnableC4161b(null, this.f16521p, bitmap, z11, countDownLatch));
        try {
            countDownLatch.await();
        } catch (InterruptedException unused3) {
            "Latch interrupted while posting ".concat(String.valueOf(this.f16521p));
        }
    }
}
