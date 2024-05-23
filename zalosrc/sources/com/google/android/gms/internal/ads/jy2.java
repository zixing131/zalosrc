package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.os.Bundle;
import android.view.View;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class jy2 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: s */
    private static final jy2 f23025s = new jy2();

    /* renamed from: p */
    private boolean f23026p;

    /* renamed from: q */
    private boolean f23027q;

    /* renamed from: r */
    private oy2 f23028r;

    private jy2() {
    }

    /* renamed from: a */
    public static jy2 m23780a() {
        return f23025s;
    }

    /* renamed from: e */
    private final void m23781e() {
        String str;
        boolean z11 = this.f23027q;
        Iterator it = iy2.m23465a().m23467c().iterator();
        while (it.hasNext()) {
            uy2 m28060g = ((xx2) it.next()).m28060g();
            if (m28060g.m27098k()) {
                if (true != z11) {
                    str = "foregrounded";
                } else {
                    str = "backgrounded";
                }
                ny2.m25043a().m25044b(m28060g.m27088a(), "setState", str);
            }
        }
    }

    /* renamed from: f */
    private final void m23782f(boolean z11) {
        if (this.f23027q != z11) {
            this.f23027q = z11;
            if (this.f23026p) {
                m23781e();
                if (this.f23028r != null) {
                    if (!z11) {
                        iz2.m23475d().m23483i();
                    } else {
                        iz2.m23475d().m23482h();
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public final void m23783b() {
        this.f23026p = true;
        this.f23027q = false;
        m23781e();
    }

    /* renamed from: c */
    public final void m23784c() {
        this.f23026p = false;
        this.f23027q = false;
        this.f23028r = null;
    }

    /* renamed from: d */
    public final void m23785d(oy2 oy2Var) {
        this.f23028r = oy2Var;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        m23782f(false);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        View m28059f;
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        int i11 = runningAppProcessInfo.importance;
        boolean z11 = true;
        boolean z12 = true;
        for (xx2 xx2Var : iy2.m23465a().m23466b()) {
            if (xx2Var.m28063j() && (m28059f = xx2Var.m28059f()) != null && m28059f.hasWindowFocus()) {
                z12 = false;
            }
        }
        if (i11 == 100 || !z12) {
            z11 = false;
        }
        m23782f(z11);
    }
}
