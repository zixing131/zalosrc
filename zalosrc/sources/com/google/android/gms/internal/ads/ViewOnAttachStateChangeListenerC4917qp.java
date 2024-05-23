package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzbz;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.qp */
/* loaded from: classes2.dex */
public final class ViewOnAttachStateChangeListenerC4917qp implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Application.ActivityLifecycleCallbacks {

    /* renamed from: E */
    private static final long f26907E = ((Long) zzay.zzc().m21823b(AbstractC4554gx.f21238f1)).longValue();

    /* renamed from: C */
    private final DisplayMetrics f26910C;

    /* renamed from: D */
    private final Rect f26911D;

    /* renamed from: p */
    private final Context f26912p;

    /* renamed from: q */
    private Application f26913q;

    /* renamed from: r */
    private final WindowManager f26914r;

    /* renamed from: s */
    private final PowerManager f26915s;

    /* renamed from: t */
    private final KeyguardManager f26916t;

    /* renamed from: u */
    BroadcastReceiver f26917u;

    /* renamed from: v */
    private WeakReference f26918v;

    /* renamed from: w */
    final WeakReference f26919w;

    /* renamed from: x */
    private C4436dq f26920x;

    /* renamed from: y */
    private final zzbz f26921y = new zzbz(f26907E);

    /* renamed from: z */
    private boolean f26922z = false;

    /* renamed from: A */
    private int f26908A = -1;

    /* renamed from: B */
    private final HashSet f26909B = new HashSet();

    public ViewOnAttachStateChangeListenerC4917qp(Context context, View view) {
        View view2;
        Context applicationContext = context.getApplicationContext();
        this.f26912p = applicationContext;
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        this.f26914r = windowManager;
        this.f26915s = (PowerManager) applicationContext.getSystemService("power");
        this.f26916t = (KeyguardManager) context.getSystemService("keyguard");
        if (applicationContext instanceof Application) {
            Application application = (Application) applicationContext;
            this.f26913q = application;
            this.f26920x = new C4436dq(application, this);
        }
        this.f26910C = context.getResources().getDisplayMetrics();
        Rect rect = new Rect();
        this.f26911D = rect;
        rect.right = windowManager.getDefaultDisplay().getWidth();
        rect.bottom = windowManager.getDefaultDisplay().getHeight();
        WeakReference weakReference = this.f26919w;
        if (weakReference != null) {
            view2 = (View) weakReference.get();
        } else {
            view2 = null;
        }
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(this);
            m25848m(view2);
        }
        this.f26919w = new WeakReference(view);
        if (view != null) {
            if (view.isAttachedToWindow()) {
                m25847l(view);
            }
            view.addOnAttachStateChangeListener(this);
        }
    }

    /* renamed from: h */
    private final int m25843h(int i11) {
        return (int) (i11 / this.f26910C.density);
    }

    /* renamed from: i */
    private final void m25844i(Activity activity, int i11) {
        Window window;
        if (this.f26919w == null || (window = activity.getWindow()) == null) {
            return;
        }
        View peekDecorView = window.peekDecorView();
        View view = (View) this.f26919w.get();
        if (view != null && peekDecorView != null && view.getRootView() == peekDecorView.getRootView()) {
            this.f26908A = i11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x012f, code lost:            if (r11 == 0) goto L59;     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0119, code lost:            if (r11 == 0) goto L59;     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0131, code lost:            r3 = 1;        r11 = 0;     */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m25845j(int i11) {
        WeakReference weakReference;
        View view;
        boolean z11;
        boolean z12;
        List emptyList;
        int i12;
        boolean z13;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        if (this.f26909B.isEmpty() || (weakReference = this.f26919w) == null) {
            return;
        }
        View view2 = (View) weakReference.get();
        Rect rect = new Rect();
        Rect rect2 = new Rect();
        Rect rect3 = new Rect();
        Rect rect4 = new Rect();
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        boolean z14 = true;
        if (view2 != null) {
            z11 = view2.getGlobalVisibleRect(rect2);
            z12 = view2.getLocalVisibleRect(rect3);
            view2.getHitRect(rect4);
            try {
                view2.getLocationOnScreen(iArr);
                view2.getLocationInWindow(iArr2);
            } catch (Exception e11) {
                yk0.zzh("Failure getting view location.", e11);
            }
            int i19 = iArr[0];
            rect.left = i19;
            rect.top = iArr[1];
            rect.right = i19 + view2.getWidth();
            rect.bottom = rect.top + view2.getHeight();
            view = view2;
        } else {
            view = null;
            z11 = false;
            z12 = false;
        }
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21268i1)).booleanValue() && view != null) {
            try {
                emptyList = new ArrayList();
                ViewParent parent = view.getParent();
                while (parent instanceof View) {
                    View view3 = (View) parent;
                    Rect rect5 = new Rect();
                    if (view3.isScrollContainer() && view3.getGlobalVisibleRect(rect5)) {
                        emptyList.add(m25849a(rect5));
                    }
                    parent = parent.getParent();
                }
            } catch (Exception e12) {
                zzt.zzo().m22945t(e12, "PositionWatcher.getParentScrollViewRects");
                emptyList = Collections.emptyList();
            }
        } else {
            emptyList = Collections.emptyList();
        }
        List list = emptyList;
        if (view != null) {
            i12 = view.getWindowVisibility();
        } else {
            i12 = 8;
        }
        int i21 = this.f26908A;
        if (i21 != -1) {
            i12 = i21;
        }
        zzt.zzp();
        long zzt = zzs.zzt(view);
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21315m8)).booleanValue()) {
            if (view2 != null) {
                zzt.zzp();
                if (zzs.zzP(view, this.f26915s, this.f26916t) && z11 && z12) {
                    if (zzt >= ((Integer) zzay.zzc().m21823b(AbstractC4554gx.f21345p8)).intValue()) {
                    }
                }
            }
            z13 = 0;
        } else {
            if (view2 != null) {
                zzt.zzp();
                if (zzs.zzP(view, this.f26915s, this.f26916t)) {
                    if (z11) {
                        if (z12) {
                        }
                    }
                }
            }
            z13 = 0;
        }
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21365r8)).booleanValue()) {
            zzt.zzp();
            if (true != zzs.zzP(view, this.f26915s, this.f26916t)) {
                i14 = 0;
            } else {
                i14 = 64;
            }
            if (true != z11) {
                i15 = 0;
            } else {
                i15 = 8;
            }
            int i22 = i14 | i15;
            if (true != z12) {
                i16 = 0;
            } else {
                i16 = 16;
            }
            int i23 = i22 | i16;
            if (i12 == 0) {
                i17 = 128;
            } else {
                i17 = 0;
            }
            int i24 = i17 | i23;
            if (zzt >= ((Integer) zzay.zzc().m21823b(AbstractC4554gx.f21345p8)).intValue()) {
                i18 = 32;
            } else {
                i18 = 0;
            }
            zzt.zzp();
            zzs.zzF(view, i24 | i18 | z13, null);
        }
        if (i11 == 1 && !this.f26921y.zzb() && z13 == this.f26922z) {
            return;
        }
        if (z13 == 0 && !this.f26922z && i11 == 1) {
            return;
        }
        long mo105914b = zzt.zzB().mo105914b();
        boolean isScreenOn = this.f26915s.isScreenOn();
        if (view == null || !view.isAttachedToWindow()) {
            z14 = false;
        }
        if (view != null) {
            i13 = view.getWindowVisibility();
        } else {
            i13 = 8;
        }
        C4842op c4842op = new C4842op(mo105914b, isScreenOn, z14, i13, m25849a(this.f26911D), m25849a(rect), m25849a(rect2), z11, m25849a(rect3), z12, zzt, m25849a(rect4), this.f26910C.density, z13, list);
        Iterator it = this.f26909B.iterator();
        while (it.hasNext()) {
            ((InterfaceC4880pp) it.next()).mo21778m0(c4842op);
        }
        this.f26922z = z13;
    }

    /* renamed from: k */
    private final void m25846k() {
        zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.mp
            @Override // java.lang.Runnable
            public final void run() {
                ViewOnAttachStateChangeListenerC4917qp.this.m25851d();
            }
        });
    }

    /* renamed from: l */
    private final void m25847l(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.f26918v = new WeakReference(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.f26917u == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            this.f26917u = new C4805np(this);
            zzt.zzv().zzc(this.f26912p, this.f26917u, intentFilter);
        }
        Application application = this.f26913q;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.f26920x);
            } catch (Exception e11) {
                yk0.zzh("Error registering activity lifecycle callbacks.", e11);
            }
        }
    }

    /* renamed from: m */
    private final void m25848m(View view) {
        try {
            WeakReference weakReference = this.f26918v;
            if (weakReference != null) {
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) weakReference.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.f26918v = null;
            }
        } catch (Exception e11) {
            yk0.zzh("Error while unregistering listeners from the last ViewTreeObserver.", e11);
        }
        try {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnScrollChangedListener(this);
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
            }
        } catch (Exception e12) {
            yk0.zzh("Error while unregistering listeners from the ViewTreeObserver.", e12);
        }
        if (this.f26917u != null) {
            try {
                zzt.zzv().zzd(this.f26912p, this.f26917u);
            } catch (IllegalStateException e13) {
                yk0.zzh("Failed trying to unregister the receiver", e13);
            } catch (Exception e14) {
                zzt.zzo().m22945t(e14, "ActiveViewUnit.stopScreenStatusMonitoring");
            }
            this.f26917u = null;
        }
        Application application = this.f26913q;
        if (application != null) {
            try {
                application.unregisterActivityLifecycleCallbacks(this.f26920x);
            } catch (Exception e15) {
                yk0.zzh("Error registering activity lifecycle callbacks.", e15);
            }
        }
    }

    /* renamed from: a */
    final Rect m25849a(Rect rect) {
        return new Rect(m25843h(rect.left), m25843h(rect.top), m25843h(rect.right), m25843h(rect.bottom));
    }

    /* renamed from: c */
    public final void m25850c(InterfaceC4880pp interfaceC4880pp) {
        this.f26909B.add(interfaceC4880pp);
        m25845j(3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ void m25851d() {
        m25845j(3);
    }

    /* renamed from: e */
    public final void m25852e(InterfaceC4880pp interfaceC4880pp) {
        this.f26909B.remove(interfaceC4880pp);
    }

    /* renamed from: f */
    public final void m25853f() {
        this.f26921y.zza(f26907E);
    }

    /* renamed from: g */
    public final void m25854g(long j11) {
        this.f26921y.zza(j11);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        m25844i(activity, 0);
        m25845j(3);
        m25846k();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        m25845j(3);
        m25846k();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        m25844i(activity, 4);
        m25845j(3);
        m25846k();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        m25844i(activity, 0);
        m25845j(3);
        m25846k();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        m25845j(3);
        m25846k();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        m25844i(activity, 0);
        m25845j(3);
        m25846k();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        m25845j(3);
        m25846k();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        m25845j(2);
        m25846k();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        m25845j(1);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f26908A = -1;
        m25847l(view);
        m25845j(3);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f26908A = -1;
        m25845j(3);
        m25846k();
        m25848m(view);
    }
}
