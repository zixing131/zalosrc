package com.google.android.gms.common.images;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.SystemClock;
import com.google.android.gms.common.images.ImageManager;
import com.google.android.gms.common.internal.AbstractC4169c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
import p664y.AbstractC30228a;

/* renamed from: com.google.android.gms.common.images.b */
/* loaded from: classes2.dex */
final class RunnableC4161b implements Runnable {

    /* renamed from: p */
    private final Uri f16523p;

    /* renamed from: q */
    private final Bitmap f16524q;

    /* renamed from: r */
    private final CountDownLatch f16525r;

    public RunnableC4161b(ImageManager imageManager, Uri uri, Bitmap bitmap, boolean z11, CountDownLatch countDownLatch) {
        this.f16523p = uri;
        this.f16524q = bitmap;
        this.f16525r = countDownLatch;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        HashSet hashSet;
        ArrayList arrayList;
        AbstractC4169c.m19633a("OnBitmapLoadedRunnable must be executed in the main thread");
        Bitmap bitmap = this.f16524q;
        ImageManager.ImageReceiver imageReceiver = (ImageManager.ImageReceiver) ImageManager.m19607g(null).remove(this.f16523p);
        if (imageReceiver != null) {
            arrayList = imageReceiver.f16516q;
            if (arrayList.size() > 0) {
                AbstractC30228a.m149044a(arrayList.get(0));
                if (this.f16524q != null && bitmap != null) {
                    ImageManager.m19601a(null);
                    throw null;
                }
                ImageManager.m19606f(null).put(this.f16523p, Long.valueOf(SystemClock.elapsedRealtime()));
                ImageManager.m19601a(null);
                ImageManager.m19603c(null);
                throw null;
            }
        }
        this.f16525r.countDown();
        obj = ImageManager.f16513a;
        synchronized (obj) {
            hashSet = ImageManager.f16514b;
            hashSet.remove(this.f16523p);
        }
    }
}
