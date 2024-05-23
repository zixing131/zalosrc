package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.ads.se */
/* loaded from: classes2.dex */
public final class ViewOnAttachStateChangeListenerC4980se implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Application.ActivityLifecycleCallbacks {

    /* renamed from: B */
    private static final Handler f27631B = new Handler(Looper.getMainLooper());

    /* renamed from: p */
    private final Context f27633p;

    /* renamed from: q */
    private Application f27634q;

    /* renamed from: r */
    private final PowerManager f27635r;

    /* renamed from: s */
    private final KeyguardManager f27636s;

    /* renamed from: t */
    private BroadcastReceiver f27637t;

    /* renamed from: u */
    private final zzapx f27638u;

    /* renamed from: v */
    private WeakReference f27639v;

    /* renamed from: w */
    private WeakReference f27640w;

    /* renamed from: x */
    private C4387ce f27641x;

    /* renamed from: y */
    private byte f27642y = -1;

    /* renamed from: z */
    private int f27643z = -1;

    /* renamed from: A */
    private long f27632A = -3;

    public ViewOnAttachStateChangeListenerC4980se(Context context, zzapx zzapxVar) {
        Context applicationContext = context.getApplicationContext();
        this.f27633p = applicationContext;
        this.f27638u = zzapxVar;
        this.f27635r = (PowerManager) applicationContext.getSystemService("power");
        this.f27636s = (KeyguardManager) applicationContext.getSystemService("keyguard");
        if (applicationContext instanceof Application) {
            Application application = (Application) applicationContext;
            this.f27634q = application;
            this.f27641x = new C4387ce(application, this);
        }
        m26286d(null);
    }

    /* renamed from: e */
    private final void m26279e(Activity activity, int i11) {
        Window window;
        if (this.f27640w == null || (window = activity.getWindow()) == null) {
            return;
        }
        View peekDecorView = window.peekDecorView();
        View m26285b = m26285b();
        if (m26285b != null && peekDecorView != null && m26285b.getRootView() == peekDecorView.getRootView()) {
            this.f27643z = i11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005c, code lost:            if ((r5.flags & 524288) != 0) goto L38;     */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m26280f() {
        int i11;
        long j11;
        Activity m25167b;
        WindowManager.LayoutParams attributes;
        if (this.f27640w == null) {
            return;
        }
        View m26285b = m26285b();
        if (m26285b == null) {
            this.f27632A = -3L;
            this.f27642y = (byte) -1;
            return;
        }
        if (m26285b.getVisibility() != 0) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        if (!m26285b.isShown()) {
            i11 |= 2;
        }
        PowerManager powerManager = this.f27635r;
        if (powerManager != null && !powerManager.isScreenOn()) {
            i11 |= 4;
        }
        if (!this.f27638u.m28675a()) {
            KeyguardManager keyguardManager = this.f27636s;
            if (keyguardManager != null && keyguardManager.inKeyguardRestrictedInputMode() && (m25167b = AbstractC4831oe.m25167b(m26285b)) != null) {
                Window window = m25167b.getWindow();
                if (window == null) {
                    attributes = null;
                } else {
                    attributes = window.getAttributes();
                }
                if (attributes != null) {
                }
            }
            i11 |= 8;
        }
        if (!m26285b.getGlobalVisibleRect(new Rect())) {
            i11 |= 16;
        }
        if (!m26285b.getLocalVisibleRect(new Rect())) {
            i11 |= 32;
        }
        int windowVisibility = m26285b.getWindowVisibility();
        int i12 = this.f27643z;
        if (i12 != -1) {
            windowVisibility = i12;
        }
        if (windowVisibility != 0) {
            i11 |= 64;
        }
        if (this.f27642y != i11) {
            this.f27642y = (byte) i11;
            if (i11 == 0) {
                j11 = SystemClock.elapsedRealtime();
            } else {
                j11 = (-3) - i11;
            }
            this.f27632A = j11;
        }
    }

    /* renamed from: g */
    private final void m26281g() {
        f27631B.post(new RunnableC4906qe(this));
    }

    /* renamed from: h */
    private final void m26282h(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.f27639v = new WeakReference(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.f27637t == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            C4943re c4943re = new C4943re(this);
            this.f27637t = c4943re;
            this.f27633p.registerReceiver(c4943re, intentFilter);
        }
        Application application = this.f27634q;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.f27641x);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: i */
    private final void m26283i(View view) {
        try {
            WeakReference weakReference = this.f27639v;
            if (weakReference != null) {
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) weakReference.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.f27639v = null;
            }
        } catch (Exception unused) {
        }
        try {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnScrollChangedListener(this);
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
            }
        } catch (Exception unused2) {
        }
        BroadcastReceiver broadcastReceiver = this.f27637t;
        if (broadcastReceiver != null) {
            try {
                this.f27633p.unregisterReceiver(broadcastReceiver);
            } catch (Exception unused3) {
            }
            this.f27637t = null;
        }
        Application application = this.f27634q;
        if (application != null) {
            try {
                application.unregisterActivityLifecycleCallbacks(this.f27641x);
            } catch (Exception unused4) {
            }
        }
    }

    /* renamed from: a */
    public final long m26284a() {
        if (this.f27632A <= -2 && m26285b() == null) {
            this.f27632A = -3L;
        }
        return this.f27632A;
    }

    /* renamed from: b */
    final View m26285b() {
        WeakReference weakReference = this.f27640w;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final void m26286d(View view) {
        long j11;
        View m26285b = m26285b();
        if (m26285b != null) {
            m26285b.removeOnAttachStateChangeListener(this);
            m26283i(m26285b);
        }
        this.f27640w = new WeakReference(view);
        if (view != null) {
            if (view.getWindowToken() != null || view.getWindowVisibility() != 8) {
                m26282h(view);
            }
            view.addOnAttachStateChangeListener(this);
            j11 = -2;
        } else {
            j11 = -3;
        }
        this.f27632A = j11;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        m26279e(activity, 0);
        m26280f();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        m26280f();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        m26279e(activity, 4);
        m26280f();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        m26279e(activity, 0);
        m26280f();
        m26281g();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        m26280f();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        m26279e(activity, 0);
        m26280f();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        m26280f();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        m26280f();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        m26280f();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f27643z = -1;
        m26282h(view);
        m26280f();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f27643z = -1;
        m26280f();
        m26281g();
        m26283i(view);
    }
}
