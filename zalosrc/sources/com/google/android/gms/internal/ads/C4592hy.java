package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.MotionEvent;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.hy */
/* loaded from: classes2.dex */
public final class C4592hy {

    /* renamed from: a */
    private MotionEvent f21951a = MotionEvent.obtain(0, 0, 1, 0.0f, 0.0f, 0);

    /* renamed from: b */
    private MotionEvent f21952b = MotionEvent.obtain(0, 0, 0, 0.0f, 0.0f, 0);

    /* renamed from: c */
    private final Context f21953c;

    /* renamed from: d */
    private final ScheduledExecutorService f21954d;

    /* renamed from: e */
    private final vw2 f21955e;

    /* renamed from: f */
    private final C4665jy f21956f;

    public C4592hy(Context context, ScheduledExecutorService scheduledExecutorService, C4665jy c4665jy, vw2 vw2Var, byte[] bArr) {
        this.f21953c = context;
        this.f21954d = scheduledExecutorService;
        this.f21956f = c4665jy;
        this.f21955e = vw2Var;
    }

    /* renamed from: a */
    public final tc3 m23078a() {
        return (ac3) kc3.m23883o(ac3.m20071D(kc3.m23877i(null)), ((Long) AbstractC5186xy.f30674c.m24091e()).longValue(), TimeUnit.MILLISECONDS, this.f21954d);
    }

    /* renamed from: b */
    public final void m23079b(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1 && motionEvent.getEventTime() > this.f21951a.getEventTime()) {
            this.f21951a = MotionEvent.obtain(motionEvent);
        } else if (motionEvent.getAction() == 0 && motionEvent.getEventTime() > this.f21952b.getEventTime()) {
            this.f21952b = MotionEvent.obtain(motionEvent);
        }
    }
}
