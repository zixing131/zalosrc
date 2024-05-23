package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes2.dex */
public final class wy1 {

    /* renamed from: e */
    private static wy1 f30266e;

    /* renamed from: a */
    private final Handler f30267a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    private final CopyOnWriteArrayList f30268b = new CopyOnWriteArrayList();

    /* renamed from: c */
    private final Object f30269c = new Object();

    /* renamed from: d */
    private int f30270d = 0;

    private wy1(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        g92.m22333a(context, new vx1(this, null), intentFilter);
    }

    /* renamed from: b */
    public static synchronized wy1 m27734b(Context context) {
        wy1 wy1Var;
        synchronized (wy1.class) {
            try {
                if (f30266e == null) {
                    f30266e = new wy1(context);
                }
                wy1Var = f30266e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return wy1Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static /* synthetic */ void m27735c(wy1 wy1Var, int i11) {
        synchronized (wy1Var.f30269c) {
            try {
                if (wy1Var.f30270d == i11) {
                    return;
                }
                wy1Var.f30270d = i11;
                Iterator it = wy1Var.f30268b.iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    kj4 kj4Var = (kj4) weakReference.get();
                    if (kj4Var != null) {
                        kj4Var.f23344a.m24617g(i11);
                    } else {
                        wy1Var.f30268b.remove(weakReference);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: a */
    public final int m27736a() {
        int i11;
        synchronized (this.f30269c) {
            i11 = this.f30270d;
        }
        return i11;
    }

    /* renamed from: d */
    public final void m27737d(final kj4 kj4Var) {
        Iterator it = this.f30268b.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference.get() == null) {
                this.f30268b.remove(weakReference);
            }
        }
        this.f30268b.add(new WeakReference(kj4Var));
        final byte[] bArr = null;
        this.f30267a.post(new Runnable(kj4Var, bArr) { // from class: com.google.android.gms.internal.ads.ou1

            /* renamed from: q */
            public final /* synthetic */ kj4 f25954q;

            @Override // java.lang.Runnable
            public final void run() {
                wy1 wy1Var = wy1.this;
                kj4 kj4Var2 = this.f25954q;
                kj4Var2.f23344a.m24617g(wy1Var.m27736a());
            }
        });
    }
}
