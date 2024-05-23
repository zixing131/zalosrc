package com.google.android.gms.internal.ads;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.ve */
/* loaded from: classes2.dex */
public final class C5091ve {

    /* renamed from: e */
    private static final String[] f29280e = {"android:establish_vpn_service", "android:establish_vpn_manager"};

    /* renamed from: a */
    private long f29281a = 0;

    /* renamed from: b */
    private long f29282b = 0;

    /* renamed from: c */
    private long f29283c = -1;

    /* renamed from: d */
    private boolean f29284d = false;

    C5091ve(Context context, Executor executor, String[] strArr) {
        if (Build.VERSION.SDK_INT < 30) {
            return;
        }
        try {
            ((AppOpsManager) context.getSystemService("appops")).startWatchingActive(strArr, executor, new C5017te(this));
        } catch (IllegalArgumentException | NoSuchMethodError unused) {
        }
    }

    /* renamed from: d */
    public static C5091ve m27210d(Context context, Executor executor) {
        return new C5091ve(context, executor, f29280e);
    }

    /* renamed from: b */
    public final long m27214b() {
        long j11 = this.f29283c;
        this.f29283c = -1L;
        return j11;
    }

    /* renamed from: c */
    public final long m27215c() {
        if (this.f29284d) {
            return this.f29282b - this.f29281a;
        }
        return -1L;
    }

    /* renamed from: h */
    public final void m27216h() {
        if (this.f29284d) {
            this.f29282b = System.currentTimeMillis();
        }
    }
}
