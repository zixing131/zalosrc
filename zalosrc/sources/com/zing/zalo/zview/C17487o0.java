package com.zing.zalo.zview;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.app.C1358n;
import androidx.core.app.InterfaceC1338f1;
import androidx.core.util.InterfaceC1479a;
import androidx.core.view.AbstractC1579n0;
import androidx.lifecycle.C1808z0;
import androidx.lifecycle.InterfaceC1756a1;
import androidx.lifecycle.InterfaceC1801w;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.C17503s0;
import com.zing.zalo.zview.SlideAnimationLayout;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.passcode.PassCodeView;
import com.zing.zalocore.CoreUtility;
import gg0.AbstractC19444a;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import p542ub.InterfaceC27218a;
import zl0.AbstractC32227d;
import zl0.AbstractC32235l;

/* renamed from: com.zing.zalo.zview.o0 */
/* loaded from: classes.dex */
public class C17487o0 {

    /* renamed from: H */
    static int f89095H = 1;

    /* renamed from: I */
    static int f89096I = 2;

    /* renamed from: J */
    static int f89097J = 3;

    /* renamed from: K */
    static int f89098K = 4;

    /* renamed from: L */
    static int f89099L = 5;

    /* renamed from: B */
    private C17499q0 f89101B;

    /* renamed from: i */
    boolean f89115i;

    /* renamed from: j */
    InterfaceC27218a f89116j;

    /* renamed from: k */
    InterfaceC17502s f89117k;

    /* renamed from: q */
    Runnable f89123q;

    /* renamed from: r */
    Runnable f89124r;

    /* renamed from: v */
    PassCodeView f89128v;

    /* renamed from: w */
    boolean f89129w;

    /* renamed from: x */
    FrameLayout f89130x;

    /* renamed from: a */
    final List f89107a = new ArrayList();

    /* renamed from: b */
    public String f89108b = null;

    /* renamed from: c */
    public boolean f89109c = false;

    /* renamed from: d */
    ArrayList f89110d = new ArrayList();

    /* renamed from: e */
    ArrayList f89111e = new ArrayList();

    /* renamed from: f */
    ArrayList f89112f = new ArrayList();

    /* renamed from: g */
    ArrayList f89113g = null;

    /* renamed from: h */
    int f89114h = 0;

    /* renamed from: l */
    ZaloView f89118l = null;

    /* renamed from: m */
    boolean f89119m = false;

    /* renamed from: n */
    Handler f89120n = new Handler(Looper.getMainLooper());

    /* renamed from: o */
    Class f89121o = null;

    /* renamed from: p */
    AnimatorSet f89122p = null;

    /* renamed from: s */
    Runnable f89125s = null;

    /* renamed from: t */
    int f89126t = 0;

    /* renamed from: u */
    SplashView f89127u = null;

    /* renamed from: y */
    List f89131y = new ArrayList();

    /* renamed from: z */
    private final InterfaceC1479a f89132z = new InterfaceC1479a() { // from class: com.zing.zalo.zview.v
        public /* synthetic */ C17508v() {
        }

        @Override // androidx.core.util.InterfaceC1479a
        public final void accept(Object obj) {
            C17487o0.this.m92947d1((C1358n) obj);
        }
    };

    /* renamed from: A */
    PassCodeView.InterfaceC17496g f89100A = new a();

    /* renamed from: C */
    private AbstractC17504t f89102C = null;

    /* renamed from: D */
    private AbstractC17504t f89103D = new b();

    /* renamed from: E */
    private final CopyOnWriteArrayList f89104E = new CopyOnWriteArrayList();

    /* renamed from: F */
    Handler f89105F = new c(Looper.getMainLooper());

    /* renamed from: G */
    PassCodeView.InterfaceC17494e f89106G = new PassCodeView.InterfaceC17494e() { // from class: com.zing.zalo.zview.f0
        public /* synthetic */ C17469f0() {
        }

        @Override // com.zing.zalo.zview.passcode.PassCodeView.InterfaceC17494e
        /* renamed from: a */
        public final void mo92925a() {
            C17487o0.this.m92949e1();
        }
    };

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zview.o0$a */
    /* loaded from: classes.dex */
    public class a implements PassCodeView.InterfaceC17496g {
        a() {
        }

        @Override // com.zing.zalo.zview.passcode.PassCodeView.InterfaceC17496g
        /* renamed from: a */
        public void mo93097a() {
            C17487o0 c17487o0 = C17487o0.this;
            c17487o0.m93000F1(c17487o0.f89128v);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zview.o0$b */
    /* loaded from: classes.dex */
    public class b extends AbstractC17504t {
        b() {
        }

        @Override // com.zing.zalo.zview.AbstractC17504t
        /* renamed from: a */
        public ZaloView mo93098a(ClassLoader classLoader, String str, Bundle bundle) {
            return ZaloView.m92633kJ(C17487o0.this.f89116j.getContext(), str, bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zview.o0$c */
    /* loaded from: classes.dex */
    public class c extends Handler {
        c(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            ZaloView zaloView;
            View view;
            View view2;
            Object obj;
            ZaloView zaloView2;
            Bundle bundle;
            int i11 = message.what;
            if (i11 == C17487o0.f89095H) {
                int i12 = message.arg2;
                C17478k c17478k = (C17478k) message.obj;
                C17487o0.this.m93017M();
                if (!C17487o0.this.f89110d.isEmpty()) {
                    if (message.arg1 == 0 && C17487o0.this.f89110d.size() >= 2) {
                        ArrayList arrayList = C17487o0.this.f89110d;
                        obj = arrayList.get(arrayList.size() - 2);
                    } else {
                        ArrayList arrayList2 = C17487o0.this.f89110d;
                        obj = arrayList2.get(arrayList2.size() - 1);
                    }
                    C17478k c17478k2 = (C17478k) obj;
                    if (message.arg1 == 1) {
                        C17487o0.this.f89110d.add(c17478k);
                    }
                    if (ZaloView.InterfaceC17422g.class.isAssignableFrom(c17478k2.f89074a) && ZaloView.InterfaceC17422g.class.isAssignableFrom(c17478k.f89074a)) {
                        AbstractC32227d.m155417a("ZaloViewManager", "mMainHandler#handleMessage(SHOW_VIEW)>>> Not allow to have multiple instances LiveStreamView on top of stack, remove the old one");
                        C17487o0.this.m93005H1(c17478k2, 0);
                        C17487o0.this.m93017M();
                    } else if (c17478k.f89074a.getName().equals(c17478k2.f89074a.getName()) && ((zaloView2 = c17478k.f89075b) == null || ((zaloView2.f88776p0 || !zaloView2.f88773n0) && ((bundle = zaloView2.f88783t) == null || !bundle.containsKey("SHOW_WITH_FLAGS") || (c17478k.f89075b.f88783t.getInt("SHOW_WITH_FLAGS") & 134217728) != 134217728)))) {
                        AbstractC32227d.m155417a("ZaloViewManager", "mMainHandler#handleMessage(SHOW_VIEW)>>> Not allow to have multiple instances on top of stack, remove the old one");
                        C17487o0.this.m93005H1(c17478k2, 0);
                        C17487o0.this.m93017M();
                    }
                } else if (message.arg1 == 1) {
                    C17487o0.this.f89110d.add(c17478k);
                }
                if (C17487o0.this.m93048Y0()) {
                    AbstractC32227d.m155419c("ZaloViewManager", "mMainHandler#handleMessage(SHOW_VIEW)>>> Cannot show ZaloView " + c17478k.f89075b + ", PassCodeView is showing");
                    c17478k.f89075b.f88771l0 = C17487o0.this.f89110d.indexOf(c17478k);
                    ZaloView zaloView3 = c17478k.f89075b;
                    if (zaloView3 != null && (zaloView3.f88773n0 || zaloView3.f88776p0)) {
                        C17487o0.this.m93031R(c17478k);
                    }
                    C17487o0.this.f89109c = false;
                    return;
                }
                c17478k.f89080g = false;
                C17487o0.this.m93071l2(c17478k, i12);
                return;
            }
            if (i11 == C17487o0.f89096I) {
                int i13 = message.arg2;
                C17478k c17478k3 = (C17478k) message.obj;
                C17487o0 c17487o0 = C17487o0.this;
                if (c17487o0.f89119m && c17487o0.m93048Y0()) {
                    AbstractC32227d.m155419c("ZaloViewManager", "mMainHandler#handleMessage(SHOW_CHILD_VIEW)>>> Cannot show ZaloView " + c17478k3.f89075b + ", PassCodeView is showing");
                    c17478k3.f89075b.f88771l0 = C17487o0.this.f89111e.indexOf(c17478k3);
                    C17487o0.this.f89109c = false;
                    return;
                }
                c17478k3.f89080g = false;
                C17487o0.this.m93046X1(c17478k3, i13);
                return;
            }
            if (i11 == C17487o0.f89097J) {
                C17487o0.this.m93017M();
                C17487o0.this.m93005H1((C17478k) message.obj, message.arg2);
                return;
            }
            if (i11 == C17487o0.f89098K) {
                ZaloView zaloView4 = (ZaloView) message.obj;
                if (zaloView4 != null && (view2 = zaloView4.f88746M) != null && zaloView4.f88741H) {
                    zaloView4.f88741H = false;
                    view2.setVisibility(0);
                    zaloView4.mo67117MJ(false);
                    return;
                }
                return;
            }
            if (i11 == C17487o0.f89099L && (zaloView = (ZaloView) message.obj) != null && (view = zaloView.f88746M) != null && !zaloView.f88741H) {
                zaloView.f88741H = true;
                view.setVisibility(8);
                zaloView.mo67117MJ(true);
            }
        }
    }

    /* renamed from: com.zing.zalo.zview.o0$d */
    /* loaded from: classes7.dex */
    public class d implements Runnable {

        /* renamed from: p */
        final /* synthetic */ ZaloView f89136p;

        /* renamed from: q */
        final /* synthetic */ View f89137q;

        /* renamed from: r */
        final /* synthetic */ int f89138r;

        /* renamed from: com.zing.zalo.zview.o0$d$a */
        /* loaded from: classes7.dex */
        class a extends AnimatorListenerAdapter {
            a() {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                super.onAnimationCancel(animator);
                C17487o0.this.m92935R0();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                C17487o0.this.m92935R0();
            }
        }

        d(ZaloView zaloView, View view, int i11) {
            this.f89136p = zaloView;
            this.f89137q = view;
            this.f89138r = i11;
        }

        @Override // java.lang.Runnable
        public void run() {
            C17487o0.this.f89125s = null;
            AbstractC32235l.m155474e(this.f89136p.f88747N, this.f89137q, this.f89138r, new a());
        }
    }

    /* renamed from: com.zing.zalo.zview.o0$e */
    /* loaded from: classes7.dex */
    public class e extends AnimatorListenerAdapter {
        e() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            C17487o0.this.m92935R0();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            C17487o0.this.m92935R0();
        }
    }

    /* renamed from: com.zing.zalo.zview.o0$f */
    /* loaded from: classes7.dex */
    public class f extends AnimatorListenerAdapter {

        /* renamed from: p */
        final /* synthetic */ ZaloView f89142p;

        f(ZaloView zaloView) {
            this.f89142p = zaloView;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            C17487o0.this.m92965m1(this.f89142p);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            C17487o0.this.m92965m1(this.f89142p);
        }
    }

    /* renamed from: com.zing.zalo.zview.o0$g */
    /* loaded from: classes7.dex */
    public class g extends AnimatorListenerAdapter {

        /* renamed from: p */
        final /* synthetic */ C17478k f89144p;

        g(C17478k c17478k) {
            this.f89144p = c17478k;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            C17487o0.this.m92955h1(this.f89144p);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            C17487o0.this.m92955h1(this.f89144p);
        }
    }

    /* renamed from: com.zing.zalo.zview.o0$h */
    /* loaded from: classes7.dex */
    public class h extends AnimatorListenerAdapter {
        h() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            C17487o0.this.m92953g1();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            C17487o0.this.m92953g1();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zview.o0$i */
    /* loaded from: classes7.dex */
    public class i implements Runnable {

        /* renamed from: com.zing.zalo.zview.o0$i$a */
        /* loaded from: classes7.dex */
        class a extends AnimatorListenerAdapter {
            a() {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                super.onAnimationCancel(animator);
                AbstractC32227d.m155417a("ZaloViewManager", "requestDismissSplashScreen onAnimationEnd");
                C17487o0 c17487o0 = C17487o0.this;
                SplashView splashView = c17487o0.f89127u;
                if (splashView != null) {
                    c17487o0.m93000F1(splashView);
                    C17487o0.this.f89127u = null;
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                AbstractC32227d.m155417a("ZaloViewManager", "requestDismissSplashScreen onAnimationEnd");
                C17487o0 c17487o0 = C17487o0.this;
                SplashView splashView = c17487o0.f89127u;
                if (splashView != null) {
                    c17487o0.m93000F1(splashView);
                    C17487o0.this.f89127u = null;
                }
            }
        }

        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SplashView splashView = C17487o0.this.f89127u;
            if (splashView != null) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(splashView, "alpha", 1.0f, 0.0f);
                ofFloat.setInterpolator(new DecelerateInterpolator());
                ofFloat.setDuration(500L);
                ofFloat.addListener(new a());
                ofFloat.start();
            }
        }
    }

    /* renamed from: com.zing.zalo.zview.o0$j */
    /* loaded from: classes.dex */
    public static abstract class j {
        /* renamed from: a */
        public void m93099a(C17487o0 c17487o0, ZaloView zaloView, Bundle bundle) {
        }

        /* renamed from: b */
        public void mo37231b(C17487o0 c17487o0, ZaloView zaloView, Bundle bundle) {
        }

        /* renamed from: c */
        public abstract void mo37232c(C17487o0 c17487o0, ZaloView zaloView);

        /* renamed from: d */
        public void m93100d(C17487o0 c17487o0, ZaloView zaloView) {
        }

        /* renamed from: e */
        public void mo37233e(C17487o0 c17487o0, ZaloView zaloView) {
        }

        /* renamed from: f */
        public void mo37234f(C17487o0 c17487o0, ZaloView zaloView, Bundle bundle) {
        }

        /* renamed from: g */
        public void mo37235g(C17487o0 c17487o0, ZaloView zaloView) {
        }

        /* renamed from: h */
        public void m93101h(C17487o0 c17487o0, ZaloView zaloView, Bundle bundle) {
        }

        /* renamed from: i */
        public void mo37236i(C17487o0 c17487o0, ZaloView zaloView) {
        }

        /* renamed from: j */
        public void mo37237j(C17487o0 c17487o0, ZaloView zaloView) {
        }

        /* renamed from: k */
        public void m93102k(C17487o0 c17487o0, ZaloView zaloView, View view, Bundle bundle) {
        }

        /* renamed from: l */
        public void m93103l(C17487o0 c17487o0, ZaloView zaloView) {
        }
    }

    /* renamed from: com.zing.zalo.zview.o0$k */
    /* loaded from: classes.dex */
    public static final class k {

        /* renamed from: a */
        final j f89149a;

        /* renamed from: b */
        final boolean f89150b;

        k(j jVar, boolean z11) {
            this.f89149a = jVar;
            this.f89150b = z11;
        }
    }

    /* renamed from: com.zing.zalo.zview.o0$l */
    /* loaded from: classes.dex */
    public interface l {
        /* renamed from: gp */
        void mo35571gp(ZaloView zaloView);

        /* renamed from: o7 */
        void mo35578o7(ZaloView zaloView);

        /* renamed from: r5 */
        void mo35582r5(ZaloView zaloView);
    }

    /* renamed from: B0 */
    private void m92933B0() {
        if (this.f89101B == null) {
            InterfaceC27218a interfaceC27218a = this.f89116j;
            if (interfaceC27218a instanceof InterfaceC1756a1) {
                this.f89101B = C17499q0.m93119O(((InterfaceC1756a1) interfaceC27218a).mo4644Oc());
            } else {
                this.f89101B = new C17499q0();
            }
        }
    }

    /* renamed from: J */
    private int m92934J(String str, int i11) {
        ZaloView zaloView;
        ZaloViewState zaloViewState;
        Bundle bundle;
        C17478k c17478k = (C17478k) this.f89110d.get(i11);
        String str2 = null;
        if (c17478k != null) {
            zaloView = c17478k.f89075b;
        } else {
            zaloView = null;
        }
        if (zaloView != null) {
            str2 = zaloView.mo81386eJ();
        } else if (c17478k != null && (zaloViewState = c17478k.f89076c) != null && (bundle = zaloViewState.f88804x) != null) {
            bundle.setClassLoader(this.f89116j.getContext().getClassLoader());
            str2 = c17478k.f89076c.f88804x.getString("zaloviewmaganger:zaloview_unique_key");
        }
        if (!TextUtils.equals(str, str2)) {
            return -1;
        }
        return i11;
    }

    /* renamed from: R0 */
    public void m92935R0() {
        if (this.f89123q != null) {
            this.f89120n.post(new Runnable() { // from class: com.zing.zalo.zview.d0
                public /* synthetic */ RunnableC17455d0() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C17487o0.this.m92943b1();
                }
            });
        }
    }

    /* renamed from: S0 */
    public void m92953g1() {
        if (this.f89124r != null) {
            this.f89120n.post(new Runnable() { // from class: com.zing.zalo.zview.a0
                public /* synthetic */ RunnableC17430a0() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C17487o0.this.m92945c1();
                }
            });
        }
    }

    /* renamed from: T0 */
    public void m92955h1(C17478k c17478k) {
        ZaloView zaloView;
        if (c17478k != null && (zaloView = c17478k.f89075b) != null) {
            zaloView.mo37122XJ(false, true);
            c17478k.f89075b.f88788x = false;
        }
        m93010J1(c17478k);
        this.f89109c = false;
    }

    /* renamed from: T1 */
    private Bundle m92938T1(ZaloView zaloView) {
        Bundle bundle = new Bundle();
        zaloView.m92675mK(bundle);
        m93070l0(zaloView, bundle, false);
        if (bundle.isEmpty()) {
            bundle = null;
        }
        if (zaloView.f88746M != null) {
            m93040V1(zaloView);
        }
        if (zaloView.f88765f0 != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putString("zaloviewmaganger:child_target_state", zaloView.f88765f0);
            bundle.putInt("zaloviewmaganger:child_target_req_state", zaloView.f88766g0);
        }
        if (zaloView.f88779r != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("zaloviewmaganger:view_state", zaloView.f88779r);
        }
        if (!zaloView.f88749P) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("zaloviewmaganger:user_visible_hint", zaloView.f88749P);
        }
        String mo81386eJ = zaloView.mo81386eJ();
        if (!TextUtils.isEmpty(mo81386eJ)) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putString("zaloviewmaganger:zaloview_unique_key", mo81386eJ);
        }
        return bundle;
    }

    /* renamed from: U0 */
    public void m92965m1(ZaloView zaloView) {
        if (zaloView != null) {
            zaloView.mo37122XJ(true, false);
            zaloView.f88788x = false;
        }
        this.f89109c = false;
        m93022N1(zaloView);
    }

    /* renamed from: a1 */
    public /* synthetic */ void m92941a1(l lVar) {
        this.f89107a.add(lVar);
    }

    /* renamed from: b1 */
    public /* synthetic */ void m92943b1() {
        Runnable runnable = this.f89123q;
        if (runnable != null) {
            runnable.run();
            this.f89123q = null;
        } else {
            this.f89109c = false;
        }
    }

    /* renamed from: c1 */
    public /* synthetic */ void m92945c1() {
        Runnable runnable = this.f89124r;
        if (runnable != null) {
            runnable.run();
            this.f89124r = null;
        } else {
            this.f89109c = false;
        }
    }

    /* renamed from: d1 */
    public /* synthetic */ void m92947d1(C1358n c1358n) {
        m93057d0(c1358n.m6785a());
    }

    /* renamed from: e1 */
    public /* synthetic */ void m92949e1() {
        Handler handler = this.f89120n;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.zing.zalo.zview.b0
                public /* synthetic */ RunnableC17451b0() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C17487o0.this.m93036U();
                }
            });
        }
    }

    /* renamed from: f1 */
    public /* synthetic */ void m92951f1(C17478k c17478k) {
        m93023O(this.f89110d.indexOf(c17478k));
    }

    /* renamed from: i1 */
    public /* synthetic */ void m92957i1(C17478k c17478k, C17478k c17478k2) {
        ZaloView zaloView;
        ZaloView zaloView2;
        if (c17478k != null && (zaloView2 = c17478k.f89075b) != null) {
            zaloView2.f88764e0 = false;
            zaloView2.mo37122XJ(false, true);
        }
        m93010J1(c17478k);
        if (c17478k2 != null && (zaloView = c17478k2.f89075b) != null) {
            zaloView.f88764e0 = false;
            zaloView.f88761b0 = false;
            zaloView.mo37122XJ(true, true);
            c17478k2.f89075b.f88788x = false;
        }
        this.f89124r = null;
        this.f89109c = false;
        if (c17478k != null) {
            m93022N1(c17478k.f89075b);
        }
        if (c17478k2 != null) {
            m93023O(this.f89110d.indexOf(c17478k2));
        }
        m93011K(true);
    }

    /* renamed from: j1 */
    public /* synthetic */ void m92959j1(l lVar) {
        this.f89107a.remove(lVar);
    }

    /* renamed from: k1 */
    public static /* synthetic */ void m92961k1(View view) {
    }

    /* renamed from: l1 */
    public /* synthetic */ void m92963l1(String str, boolean z11) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        int m92990C0 = m92990C0(str, true);
        if (z11) {
            if (m92990C0 >= 0) {
                ArrayList arrayList = new ArrayList(this.f89110d.subList(m92990C0, this.f89110d.size() - 1));
                this.f89113g = arrayList;
                this.f89110d.removeAll(arrayList);
                return;
            }
            return;
        }
        if (m92990C0 >= 0) {
            for (int size = this.f89110d.size() - 1; size > m92990C0; size--) {
                m93010J1((C17478k) this.f89110d.get(size));
            }
        }
    }

    /* renamed from: n1 */
    public /* synthetic */ void m92967n1(ArrayList arrayList) {
        this.f89110d.removeAll(arrayList);
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            m93073m2((C17478k) arrayList.get(size), true);
        }
        ArrayList arrayList2 = this.f89113g;
        if (arrayList2 != null) {
            arrayList2.removeAll(arrayList);
        }
    }

    /* renamed from: o1 */
    public /* synthetic */ void m92969o1(ArrayList arrayList) {
        this.f89110d.removeAll(arrayList);
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            m93073m2((C17478k) arrayList.get(size), true);
        }
        ArrayList arrayList2 = this.f89113g;
        if (arrayList2 != null) {
            arrayList2.removeAll(arrayList);
        }
    }

    /* renamed from: p1 */
    public /* synthetic */ void m92971p1(ZaloView zaloView, C17478k c17478k, C17478k c17478k2) {
        this.f89121o = null;
        if (zaloView != null) {
            zaloView.f88764e0 = false;
        }
        if (zaloView != null && zaloView.m92681pJ()) {
            AbstractC32227d.m155417a("ZaloViewManager", "showZaloViewInternal#onOpenAnimationEndRunnable ZaloView is being removed. Return, zv= " + zaloView);
            this.f89109c = false;
            this.f89123q = null;
            return;
        }
        boolean z11 = true;
        if (zaloView != null) {
            zaloView.f88761b0 = false;
            zaloView.mo37122XJ(true, false);
            zaloView.f88788x = false;
        }
        ArrayList arrayList = this.f89113g;
        if (arrayList != null && !arrayList.isEmpty()) {
            this.f89120n.post(new Runnable() { // from class: com.zing.zalo.zview.c0

                /* renamed from: q */
                public final /* synthetic */ ArrayList f88895q;

                public /* synthetic */ RunnableC17453c0(ArrayList arrayList2) {
                    r2 = arrayList2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C17487o0.this.m92969o1(r2);
                }
            });
        } else if (zaloView != null && zaloView.f88773n0 && zaloView.f88771l0 < this.f89110d.size() - 1) {
            m93054a2(zaloView.f88771l0);
        } else if (zaloView.f88776p0) {
            m93031R(c17478k);
        } else {
            if (c17478k2 != null && c17478k2.f89075b != null && !ZaloView.InterfaceC17421f.class.isAssignableFrom(c17478k.f89074a)) {
                if (zaloView.m92642L3() == null || !zaloView.m92642L3().containsKey("SHOW_WITH_FLAGS") || (zaloView.m92642L3().getInt("SHOW_WITH_FLAGS") & 33554432) != 33554432) {
                    z11 = false;
                }
                m93073m2(c17478k2, z11);
            }
            m93014L();
            m93011K(false);
        }
        if (ZaloView.InterfaceC17425j.class.isAssignableFrom(c17478k.f89074a)) {
            m93020N(c17478k);
        }
        m93022N1(zaloView);
        this.f89109c = false;
    }

    /* renamed from: q0 */
    private void m92973q0() {
        PassCodeView passCodeView = this.f89128v;
        if (passCodeView != null && passCodeView.isShown()) {
            this.f89128v.m93110g();
        }
    }

    /* renamed from: q1 */
    public /* synthetic */ void m92974q1() {
        AnimatorSet animatorSet = this.f89122p;
        if (animatorSet != null && !animatorSet.isStarted()) {
            this.f89122p.start();
        }
    }

    /* renamed from: r0 */
    private void m92976r0() {
        PassCodeView passCodeView = this.f89128v;
        if (passCodeView != null && passCodeView.isShown()) {
            this.f89128v.m93111h();
        }
    }

    /* renamed from: s0 */
    private void m92978s0() {
        PassCodeView passCodeView = this.f89128v;
        if (passCodeView != null && passCodeView.isShown()) {
            this.f89128v.m93112i();
        }
    }

    /* renamed from: v1 */
    private void m92982v1(C17478k c17478k, int i11) {
        if (c17478k.f89075b == null) {
            c17478k.f89075b = m93028P1(c17478k);
        }
        m93082t1(c17478k, i11);
    }

    /* renamed from: y0 */
    private void m92983y0(int i11) {
        m93080s1(i11, false);
    }

    /* renamed from: A */
    public void m92984A(boolean z11, int i11) {
        ZaloView zaloView;
        View view;
        int i12 = i11 + 2;
        if (this.f89110d.size() < i12) {
            return;
        }
        ArrayList arrayList = this.f89110d;
        C17478k c17478k = (C17478k) arrayList.get(arrayList.size() - (i11 + 1));
        if (c17478k != null && (zaloView = c17478k.f89075b) != null && !zaloView.f88764e0) {
            ArrayList arrayList2 = this.f89110d;
            m92987B(z11, (C17478k) arrayList2.get(arrayList2.size() - i12));
            ZaloView zaloView2 = c17478k.f89075b;
            if (zaloView2 != null && (view = zaloView2.f88746M) != null) {
                view.bringToFront();
            }
        }
    }

    /* renamed from: A0 */
    public void m92985A0(int i11) {
        if (i11 >= 0) {
            for (int size = this.f89110d.size() - 2; size >= i11; size--) {
                m93010J1((C17478k) this.f89110d.get(size));
            }
        }
    }

    /* renamed from: A1 */
    public void m92986A1(boolean z11) {
        if (!this.f89110d.isEmpty()) {
            int m93009J0 = m93009J0();
            do {
                ZaloView zaloView = ((C17478k) this.f89110d.get(m93009J0)).f89075b;
                if (zaloView != null && !zaloView.f88787w) {
                    zaloView.mo72216WJ(z11);
                }
                m93009J0--;
                if (!(zaloView instanceof ZaloView.InterfaceC17421f)) {
                    break;
                }
            } while (m93009J0 >= 0);
        }
        if (!this.f89111e.isEmpty()) {
            Iterator it = this.f89111e.iterator();
            while (it.hasNext()) {
                ZaloView zaloView2 = ((C17478k) it.next()).f89075b;
                if (zaloView2 != null && !zaloView2.m92681pJ()) {
                    zaloView2.mo72216WJ(z11);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: B */
    void m92987B(boolean z11, C17478k c17478k) {
        ZaloView m93028P1;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        Bundle bundle;
        int indexOf;
        if (c17478k != null && (m93028P1 = m93028P1(c17478k)) != 0) {
            if (ZaloView.InterfaceC17421f.class.isAssignableFrom(c17478k.f89074a) && this.f89110d.indexOf(c17478k) - 1 >= 0 && indexOf < this.f89110d.size() - 2) {
                m92987B(z11, (C17478k) this.f89110d.get(indexOf));
            }
            if (z11) {
                View view = m93028P1.f88746M;
                if (view != null && view.getParent() != null && ZaloView.InterfaceC17418c.class.isAssignableFrom(c17478k.f89074a)) {
                    View view2 = m93028P1.f88746M;
                    if (view2 != null) {
                        view2.setVisibility(0);
                        return;
                    }
                    return;
                }
                m93028P1.f88735B = this.f89116j;
                View view3 = m93028P1.f88746M;
                int i11 = m93028P1.f88739F;
                if (i11 != 0) {
                    viewGroup2 = (ViewGroup) this.f89117k.findViewById(i11);
                } else {
                    viewGroup2 = null;
                }
                if (view3 == null) {
                    if (m93028P1.f88775p < 2) {
                        m93082t1(c17478k, 2);
                        return;
                    }
                    ZaloViewState zaloViewState = c17478k.f89076c;
                    if (zaloViewState != null) {
                        bundle = zaloViewState.f88804x;
                    } else {
                        bundle = m93028P1.f88777q;
                    }
                    m93028P1.m92663fK(m93028P1.mo79283UI(m93028P1.f88777q), viewGroup2, m93028P1.f88777q);
                    View view4 = m93028P1.f88746M;
                    if (view4 != null) {
                        m93028P1.f88747N = view4;
                        view4 = SlideAnimationLayout.m92610g(view4, this);
                        SlideAnimationLayout slideAnimationLayout = (SlideAnimationLayout) view4;
                        slideAnimationLayout.setOwnerZaloViewName(m93028P1.toString());
                        if (m93028P1 instanceof SlideAnimationLayout.InterfaceC17409d) {
                            slideAnimationLayout.setSlidingListener((SlideAnimationLayout.InterfaceC17409d) m93028P1);
                        }
                    } else {
                        m93028P1.f88747N = null;
                    }
                    m93028P1.f88746M = view4;
                    if (view4 != null && viewGroup2 != null) {
                        if (view4.getVisibility() != 0) {
                            view4.setVisibility(0);
                        }
                        if (view4.getParent() == null || !view4.getParent().equals(viewGroup2)) {
                            ViewGroup viewGroup3 = (ViewGroup) view4.getParent();
                            if (viewGroup3 != null) {
                                viewGroup3.removeView(view4);
                            }
                            m93089x(viewGroup2, view4);
                            m93028P1.mo59563AJ();
                        }
                    }
                    m93028P1.f88745L = viewGroup2;
                    View view5 = m93028P1.f88746M;
                    if (view5 != null) {
                        m93028P1.mo37125ZJ(view5, bundle);
                        return;
                    }
                    return;
                }
                if (view3.getVisibility() != 0) {
                    view3.setVisibility(0);
                }
                if (viewGroup2 != null) {
                    if (view3.getParent() == null || !view3.getParent().equals(viewGroup2)) {
                        ViewGroup viewGroup4 = (ViewGroup) view3.getParent();
                        if (viewGroup4 != null) {
                            viewGroup4.removeView(view3);
                        }
                        m93089x(viewGroup2, view3);
                        m93028P1.mo59563AJ();
                        return;
                    }
                    return;
                }
                return;
            }
            if (ZaloView.f88732u0 && !ZaloView.InterfaceC17418c.class.isAssignableFrom(c17478k.f89074a)) {
                View view6 = m93028P1.f88746M;
                if (view6 != null && (viewGroup = (ViewGroup) view6.getParent()) != null) {
                    viewGroup.removeView(view6);
                    m93028P1.mo39029LJ();
                    return;
                }
                return;
            }
            View view7 = m93028P1.f88746M;
            if (view7 != null) {
                view7.setVisibility(8);
            }
        }
    }

    /* renamed from: B1 */
    public void m92988B1(boolean z11) {
        if (!this.f89110d.isEmpty()) {
            int m93009J0 = m93009J0();
            do {
                ZaloView zaloView = ((C17478k) this.f89110d.get(m93009J0)).f89075b;
                if (zaloView != null && !zaloView.f88787w) {
                    zaloView.mo39045bK(z11);
                }
                m93009J0--;
                if (!(zaloView instanceof ZaloView.InterfaceC17421f)) {
                    break;
                }
            } while (m93009J0 >= 0);
        }
        if (!this.f89111e.isEmpty()) {
            Iterator it = this.f89111e.iterator();
            while (it.hasNext()) {
                ZaloView zaloView2 = ((C17478k) it.next()).f89075b;
                if (zaloView2 != null && !zaloView2.m92681pJ()) {
                    zaloView2.mo39045bK(z11);
                }
            }
        }
    }

    /* renamed from: C */
    public void m92989C(InterfaceC27218a interfaceC27218a, InterfaceC17502s interfaceC17502s, ZaloView zaloView) {
        boolean z11;
        this.f89116j = interfaceC27218a;
        this.f89117k = interfaceC17502s;
        this.f89118l = zaloView;
        if (zaloView == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f89119m = z11;
        if (zaloView != null) {
            this.f89101B = zaloView.f88736C.m93007I0(zaloView);
        } else if (interfaceC27218a instanceof InterfaceC1756a1) {
            this.f89101B = C17499q0.m93119O(((InterfaceC1756a1) interfaceC27218a).mo4644Oc());
        } else {
            this.f89101B = new C17499q0();
        }
        if (interfaceC27218a instanceof InterfaceC1338f1) {
            ((InterfaceC1338f1) interfaceC27218a).mo4639C0(this.f89132z);
        }
        if (this.f89129w) {
            m93016L1(true);
        }
    }

    /* renamed from: C0 */
    public int m92990C0(String str, boolean z11) {
        if (TextUtils.isEmpty(str) || this.f89110d.isEmpty()) {
            return -1;
        }
        int size = this.f89110d.size();
        if (!z11) {
            int i11 = -1;
            for (int i12 = 0; i12 < size; i12++) {
                i11 = m92934J(str, i12);
                if (i11 > -1) {
                    break;
                }
            }
            return i11;
        }
        int i13 = -1;
        for (int i14 = size - 1; i14 >= 0; i14--) {
            i13 = m92934J(str, i14);
            if (i13 > -1) {
                break;
            }
        }
        return i13;
    }

    /* renamed from: C1 */
    public void m92991C1(ZaloView zaloView) {
        if (zaloView.f88748O) {
            zaloView.f88748O = false;
            m93084u1(zaloView, this.f89114h);
        }
    }

    /* renamed from: D */
    public void m92992D(C17499q0 c17499q0) {
        this.f89101B = c17499q0;
    }

    /* renamed from: D0 */
    public ZaloView m92993D0(Class cls) {
        ZaloView zaloView = null;
        if (cls == null) {
            return null;
        }
        if (!this.f89111e.isEmpty()) {
            int size = this.f89111e.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    break;
                }
                ZaloView zaloView2 = ((C17478k) this.f89111e.get(i11)).f89075b;
                if (zaloView2 != null && zaloView2.getClass().equals(cls)) {
                    zaloView = zaloView2;
                    break;
                }
                i11++;
            }
        }
        if (!this.f89110d.isEmpty()) {
            int size2 = this.f89110d.size();
            for (int i12 = 0; i12 < size2; i12++) {
                ZaloView zaloView3 = ((C17478k) this.f89110d.get(i12)).f89075b;
                if (zaloView3 != null && zaloView3.getClass().equals(cls)) {
                    return zaloView3;
                }
            }
            return zaloView;
        }
        return zaloView;
    }

    /* renamed from: D1 */
    public void m92994D1(Bundle bundle, String str, ZaloView zaloView) {
        String str2;
        int size = this.f89111e.size() - 1;
        while (true) {
            if (size >= 0) {
                C17478k c17478k = (C17478k) this.f89111e.get(size);
                ZaloView zaloView2 = c17478k.f89075b;
                if ((zaloView2 != null && zaloView2.equals(zaloView)) || ((str2 = c17478k.f89078e) != null && str2.equals(zaloView.f88781s))) {
                    break;
                } else {
                    size--;
                }
            } else {
                size = -1;
                break;
            }
        }
        if (size >= 0 && size < this.f89111e.size()) {
            bundle.putInt(str, size);
        }
    }

    /* renamed from: E */
    public C17507u0 m92995E(ZaloView zaloView, boolean z11) {
        return new C17507u0(this, zaloView, z11);
    }

    /* renamed from: E0 */
    public ZaloView m92996E0(String str) {
        ZaloView zaloView = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!this.f89111e.isEmpty()) {
            int size = this.f89111e.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    break;
                }
                ZaloView zaloView2 = ((C17478k) this.f89111e.get(i11)).f89075b;
                if (zaloView2 != null && str.equals(zaloView2.f88740G)) {
                    zaloView = zaloView2;
                    break;
                }
                i11++;
            }
        }
        if (!this.f89110d.isEmpty()) {
            int size2 = this.f89110d.size();
            for (int i12 = 0; i12 < size2; i12++) {
                ZaloView zaloView3 = ((C17478k) this.f89110d.get(i12)).f89075b;
                if (zaloView3 != null && str.equals(zaloView3.f88740G)) {
                    return zaloView3;
                }
            }
            return zaloView;
        }
        return zaloView;
    }

    /* renamed from: E1 */
    public void m92997E1(j jVar, boolean z11) {
        this.f89104E.add(new k(jVar, z11));
    }

    /* renamed from: F */
    public C17507u0 m92998F(Class cls, boolean z11) {
        return new C17507u0(this, cls, z11);
    }

    /* renamed from: F0 */
    public int m92999F0() {
        ArrayList arrayList = this.f89111e;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    /* renamed from: F1 */
    public void m93000F1(View view) {
        ViewGroup viewGroup;
        if (view != null && this.f89130x != null && !this.f89131y.isEmpty()) {
            int size = this.f89131y.size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                if (((C17503s0) this.f89131y.get(size)).f89194b == view) {
                    this.f89131y.remove(size);
                    break;
                }
                size--;
            }
            this.f89130x.removeView(view);
            if (this.f89130x.getChildCount() == 0 && (viewGroup = (ViewGroup) this.f89130x.getParent()) != null) {
                viewGroup.removeView(this.f89130x);
            }
        }
    }

    /* renamed from: G */
    void m93001G(ZaloView zaloView) {
        synchronized (this.f89107a) {
            try {
                Iterator it = this.f89107a.iterator();
                while (it.hasNext()) {
                    ((l) it.next()).mo35578o7(zaloView);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: G0 */
    public boolean m93002G0() {
        return this.f89109c;
    }

    /* renamed from: G1 */
    public boolean mo92702G1(ZaloView zaloView, int i11) {
        int i12;
        C17478k c17478k;
        C17478k c17478k2;
        InterfaceC1801w interfaceC1801w;
        if (zaloView != null && !zaloView.m92681pJ()) {
            if (!this.f89110d.isEmpty()) {
                i12 = this.f89110d.size() - 1;
                while (i12 >= 0) {
                    c17478k = (C17478k) this.f89110d.get(i12);
                    if (c17478k.f89078e.equals(zaloView.f88781s)) {
                        break;
                    }
                    i12--;
                }
            }
            i12 = -1;
            c17478k = null;
            if (c17478k == null && !this.f89111e.isEmpty()) {
                int size = this.f89111e.size() - 1;
                while (true) {
                    if (size < 0) {
                        break;
                    }
                    C17478k c17478k3 = (C17478k) this.f89111e.get(size);
                    if (c17478k3.f89078e.equals(zaloView.f88781s)) {
                        c17478k = c17478k3;
                        break;
                    }
                    size--;
                }
            }
            if (i12 >= 0 && i12 < this.f89110d.size() - 1 && (c17478k2 = (C17478k) this.f89110d.get(i12 + 1)) != null && ZaloView.InterfaceC17423h.class.isAssignableFrom(c17478k2.f89074a) && (interfaceC1801w = c17478k2.f89075b) != null && ((ZaloView.InterfaceC17423h) interfaceC1801w).mo66383c8()) {
                Message message = new Message();
                message.what = f89097J;
                message.obj = c17478k2;
                message.arg2 = 0;
                this.f89105F.sendMessage(message);
            }
            if (c17478k != null) {
                Message message2 = new Message();
                message2.what = f89097J;
                message2.obj = c17478k;
                message2.arg2 = i11;
                this.f89105F.sendMessage(message2);
                this.f89109c = true;
                return true;
            }
            this.f89109c = false;
            return false;
        }
        if (AbstractC17482m.f89087a && zaloView != null) {
            AbstractC20110a.m104538g("%s while removing it", zaloView.getClass().getSimpleName());
        }
        AbstractC32227d.m155419c("ZaloViewManager", "removeZaloView>>> ZaloView is null or being removed, return. zv=" + zaloView);
        return true;
    }

    /* renamed from: H */
    void m93003H(ZaloView zaloView) {
        synchronized (this.f89107a) {
            try {
                Iterator it = this.f89107a.iterator();
                while (it.hasNext()) {
                    ((l) it.next()).mo35582r5(zaloView);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: H0 */
    public ZaloView m93004H0() {
        if (!this.f89110d.isEmpty() && this.f89110d.size() >= 2) {
            ArrayList arrayList = this.f89110d;
            return ((C17478k) arrayList.get(arrayList.size() - 2)).f89075b;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: H1 */
    public void m93005H1(C17478k c17478k, int i11) {
        boolean z11;
        C17478k c17478k2;
        View view;
        ZaloView zaloView;
        ZaloView zaloView2;
        ZaloView zaloView3;
        ZaloView zaloView4;
        int i12;
        C17478k c17478k3;
        ZaloView m93028P1;
        if (c17478k == null) {
            return;
        }
        AbstractC32227d.m155417a("ZaloViewManager", "removeZaloViewInternal, remove stackRecord: zClass= " + c17478k.f89074a + ", zaloView= " + c17478k.f89075b);
        ZaloView zaloView5 = c17478k.f89075b;
        if (zaloView5 != null && zaloView5.m92677nJ()) {
            AbstractC32227d.m155417a("ZaloViewManager", "removeZaloViewInternal, ZaloView has been detached, return");
            return;
        }
        ZaloView m93028P12 = m93028P1(c17478k);
        m93003H(m93028P12);
        int i13 = i11;
        if (i13 == 3) {
            i13 = 0;
        }
        if (i13 != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f89109c = true;
        if (this.f89111e.contains(c17478k)) {
            m93028P12.f88787w = true;
            if (!z11) {
                m93028P12.mo49153YJ(false, true);
                m93028P12.mo37122XJ(false, true);
                m93028P12.f88788x = false;
                m93010J1(c17478k);
                this.f89109c = false;
                return;
            }
            AnimatorSet mo39022HJ = m93028P12.mo39022HJ(false, new Runnable() { // from class: com.zing.zalo.zview.k0

                /* renamed from: q */
                public final /* synthetic */ C17478k f89083q;

                public /* synthetic */ RunnableC17479k0(C17478k c17478k4) {
                    r2 = c17478k4;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C17487o0.this.m92955h1(r2);
                }
            });
            if (mo39022HJ == null) {
                this.f89122p = null;
                AbstractC32235l.m155472c(m93028P12.f88747N, null, i13, new g(c17478k4));
                return;
            } else {
                this.f89122p = mo39022HJ;
                if (!mo39022HJ.isStarted()) {
                    mo39022HJ.start();
                    return;
                }
                return;
            }
        }
        if (this.f89110d.isEmpty()) {
            this.f89109c = false;
            AbstractC32227d.m155419c("ZaloViewManager", "removeZaloViewInternal>>> mViewsStack is empty, return");
            return;
        }
        if (this.f89110d.size() == 1) {
            InterfaceC27218a interfaceC27218a = this.f89116j;
            if (interfaceC27218a != null && interfaceC27218a.mo35577o() && this.f89116j.mo35585v() != null) {
                m93028P12.f88787w = true;
                int i14 = m93028P12.f88785u;
                if (i14 != 0) {
                    this.f89116j.onActivityResult(i14, m93028P12.f88769j0, m93028P12.f88770k0);
                }
            }
        } else if (m93028P12 != null) {
            m93028P12.f88787w = true;
        }
        int indexOf = this.f89110d.indexOf(c17478k4);
        AbstractC32227d.m155417a("ZaloViewManager", "removeZaloViewInternal, Stack record currentIndex= " + indexOf);
        if (indexOf < 0) {
            this.f89109c = false;
            AbstractC32227d.m155419c("ZaloViewManager", "removeZaloViewInternal>>> StackRecord does not exist in mViewsStack, return. zClass= " + c17478k4.f89074a);
            return;
        }
        if (indexOf > 0) {
            c17478k2 = (C17478k) this.f89110d.get(indexOf - 1);
        } else {
            c17478k2 = null;
        }
        if (indexOf >= 0 && indexOf < this.f89110d.size() - 1) {
            int size = this.f89110d.size() - 1;
            while (true) {
                if (size > indexOf) {
                    ZaloView zaloView6 = ((C17478k) this.f89110d.get(size)).f89075b;
                    if (zaloView6 != null && !zaloView6.f88787w) {
                        c17478k2 = null;
                        z11 = false;
                        break;
                    }
                    size--;
                } else {
                    break;
                }
            }
        }
        if (c17478k2 != null) {
            ZaloView m93028P13 = m93028P1(c17478k2);
            m93022N1(m93028P13);
            AbstractC32227d.m155417a("ZaloViewManager", "removeZaloViewInternal, Back stack record bsr, zaloView= " + m93028P13 + ", class= " + c17478k2.f89074a + ", uuid= " + c17478k2.f89078e);
            if (m93028P13 != 0) {
                m93028P13.f88787w = false;
                int i15 = 2;
                if (ZaloView.InterfaceC17421f.class.isAssignableFrom(c17478k2.f89074a)) {
                    if (m93028P13.f88775p == 0) {
                        m93082t1(c17478k2, 2);
                    }
                    int indexOf2 = this.f89110d.indexOf(c17478k2);
                    while (true) {
                        indexOf2--;
                        if (indexOf2 < 0) {
                            break;
                        }
                        C17478k c17478k4 = (C17478k) this.f89110d.get(indexOf2);
                        ZaloView m93028P14 = m93028P1(c17478k4);
                        if (m93028P14 != null) {
                            if (m93028P14.f88775p < i15) {
                                m93082t1(c17478k4, i15);
                            } else {
                                View view2 = m93028P14.f88746M;
                                if (view2 != null) {
                                    if (view2.getVisibility() != 0) {
                                        view2.setVisibility(0);
                                    }
                                    ViewGroup viewGroup = (ViewGroup) view2.getParent();
                                    if (viewGroup == null || !viewGroup.equals(m93028P14.f88745L)) {
                                        if (viewGroup != null) {
                                            viewGroup.removeView(view2);
                                        }
                                        ViewGroup viewGroup2 = m93028P14.f88745L;
                                        if (viewGroup2 != null) {
                                            viewGroup2.addView(view2, 0);
                                            m93028P14.mo59563AJ();
                                        }
                                    }
                                }
                            }
                        }
                        if (c17478k4 == null || !ZaloView.InterfaceC17421f.class.isAssignableFrom(c17478k4.f89074a) || indexOf2 < 0) {
                            break;
                        } else {
                            i15 = 2;
                        }
                    }
                }
                if (m93028P13.f88775p >= 2) {
                    if (ZaloView.InterfaceC17418c.class.isAssignableFrom(c17478k2.f89074a)) {
                        m93028P13.f88746M.setVisibility(0);
                    } else {
                        View view3 = m93028P13.f88746M;
                        if (view3 != null) {
                            if (view3.getVisibility() != 0) {
                                view3.setVisibility(0);
                            }
                            ViewGroup viewGroup3 = (ViewGroup) view3.getParent();
                            if (viewGroup3 == null || !viewGroup3.equals(m93028P13.f88745L)) {
                                if (viewGroup3 != null) {
                                    viewGroup3.removeView(view3);
                                }
                                ViewGroup viewGroup4 = m93028P13.f88745L;
                                if (viewGroup4 != null) {
                                    m93089x(viewGroup4, view3);
                                    m93028P13.mo59563AJ();
                                }
                            }
                        }
                    }
                }
                if (ZaloView.InterfaceC17423h.class.isAssignableFrom(c17478k2.f89074a) && ((ZaloView.InterfaceC17423h) m93028P13).mo66383c8() && (i12 = indexOf - 2) >= 0 && (c17478k3 = (C17478k) this.f89110d.get(i12)) != null && (m93028P1 = m93028P1(c17478k3)) != null) {
                    if (m93028P1.f88775p < 2) {
                        m93082t1(c17478k3, 2);
                    } else {
                        View view4 = m93028P1.f88746M;
                        if (view4 != null) {
                            if (view4.getVisibility() != 0) {
                                view4.setVisibility(0);
                            }
                            ViewGroup viewGroup5 = (ViewGroup) view4.getParent();
                            if (viewGroup5 == null || !viewGroup5.equals(m93028P1.f88745L)) {
                                if (viewGroup5 != null) {
                                    viewGroup5.removeView(view4);
                                }
                                ViewGroup viewGroup6 = m93028P1.f88745L;
                                if (viewGroup6 != null) {
                                    viewGroup6.addView(view4, 0);
                                    m93028P1.mo59563AJ();
                                }
                            }
                        }
                    }
                    m93082t1(c17478k3, 5);
                }
                if (m93028P12 != null && m93028P12.f88785u != 0) {
                    m93082t1(c17478k2, 4);
                    if (m93028P12.f88768i0 == null) {
                        InterfaceC27218a interfaceC27218a2 = this.f89116j;
                        if (interfaceC27218a2 != null) {
                            interfaceC27218a2.onActivityResult(m93028P12.f88785u, m93028P12.f88769j0, m93028P12.f88770k0);
                        }
                    } else {
                        int size2 = this.f89110d.size() - 1;
                        while (true) {
                            if (size2 < 0) {
                                break;
                            }
                            C17478k c17478k5 = (C17478k) this.f89110d.get(size2);
                            if (c17478k5 != null && c17478k5.f89078e.equals(m93028P12.f88768i0)) {
                                ZaloView m93028P15 = m93028P1(c17478k5);
                                if (m93028P15.f88775p < 2) {
                                    m93082t1(c17478k5, 2);
                                }
                                if (m93028P15.m92674mJ() && !m93028P15.m92681pJ()) {
                                    m93028P15.onActivityResult(m93028P12.f88785u, m93028P12.f88769j0, m93028P12.f88770k0);
                                }
                            } else {
                                size2--;
                            }
                        }
                    }
                    String str = m93028P12.f88768i0;
                    if (str != null && str.equals(this.f89108b)) {
                        this.f89108b = null;
                    }
                }
                ZaloView zaloView7 = c17478k2.f89075b;
                if (zaloView7 != null) {
                    zaloView7.f88761b0 = z11;
                }
                m93082t1(c17478k2, 5);
                View view5 = m93028P12.f88746M;
                if (view5 != null) {
                    view5.bringToFront();
                }
            }
        } else if (this.f89110d.size() == 1 && this.f89118l == null) {
            InterfaceC27218a interfaceC27218a3 = this.f89116j;
            if (interfaceC27218a3 != null && interfaceC27218a3.mo35577o() && this.f89116j.mo35585v() != null) {
                this.f89116j.mo35585v().setVisibility(0);
            } else {
                this.f89109c = false;
                return;
            }
        }
        this.f89124r = new Runnable() { // from class: com.zing.zalo.zview.l0

            /* renamed from: q */
            public final /* synthetic */ C17478k f89085q;

            /* renamed from: r */
            public final /* synthetic */ C17478k f89086r;

            public /* synthetic */ RunnableC17481l0(C17478k c17478k42, C17478k c17478k22) {
                r2 = c17478k42;
                r3 = c17478k22;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C17487o0.this.m92957i1(r2, r3);
            }
        };
        if (!z11) {
            if (m93028P12 != null) {
                m93028P12.mo49153YJ(false, true);
            }
            if (c17478k22 != null && (zaloView4 = c17478k22.f89075b) != null) {
                zaloView4.mo49153YJ(true, true);
            }
            if (m93028P12 != null && m93028P12.f88767h0) {
                m93028P12.mo37122XJ(false, true);
                m93028P12.f88788x = false;
                if (c17478k22 != null && (zaloView3 = c17478k22.f89075b) != null) {
                    zaloView3.mo37122XJ(true, true);
                    c17478k22.f89075b.f88788x = false;
                }
                m93010J1(c17478k42);
                this.f89109c = false;
                this.f89120n.post(new Runnable() { // from class: com.zing.zalo.zview.m0

                    /* renamed from: q */
                    public final /* synthetic */ C17478k f89089q;

                    public /* synthetic */ RunnableC17483m0(C17478k c17478k22) {
                        r2 = c17478k22;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C17487o0.this.m92951f1(r2);
                    }
                });
                return;
            }
            m92953g1();
            return;
        }
        if (m93028P12 != null) {
            m93028P12.f88764e0 = true;
            m93028P12.mo49153YJ(false, true);
        }
        if (c17478k22 != null && (zaloView2 = c17478k22.f89075b) != null) {
            zaloView2.f88764e0 = true;
            zaloView2.mo49153YJ(true, true);
        }
        AnimatorSet mo39022HJ2 = m93028P12.mo39022HJ(false, new Runnable() { // from class: com.zing.zalo.zview.n0
            public /* synthetic */ RunnableC17485n0() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C17487o0.this.m92953g1();
            }
        });
        if (mo39022HJ2 == null) {
            this.f89122p = null;
            if (c17478k22 != null && (zaloView = c17478k22.f89075b) != null) {
                view = zaloView.f88746M;
            } else {
                view = null;
            }
            AbstractC32235l.m155472c(m93028P12.f88747N, view, i13, new h());
            return;
        }
        this.f89122p = mo39022HJ2;
        if (!mo39022HJ2.isStarted()) {
            mo39022HJ2.start();
        }
    }

    /* renamed from: I */
    void m93006I(ZaloView zaloView) {
        synchronized (this.f89107a) {
            try {
                Iterator it = this.f89107a.iterator();
                while (it.hasNext()) {
                    ((l) it.next()).mo35571gp(zaloView);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: I0 */
    public C17499q0 m93007I0(ZaloView zaloView) {
        m92933B0();
        return this.f89101B.m93121N(zaloView);
    }

    /* renamed from: I1 */
    public void m93008I1(l lVar) {
        this.f89120n.post(new Runnable() { // from class: com.zing.zalo.zview.w

            /* renamed from: q */
            public final /* synthetic */ C17487o0.l f89214q;

            public /* synthetic */ RunnableC17509w(C17487o0.l lVar2) {
                r2 = lVar2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C17487o0.this.m92959j1(r2);
            }
        });
    }

    /* renamed from: J0 */
    public int m93009J0() {
        return this.f89110d.size() - 1;
    }

    /* renamed from: J1 */
    public void m93010J1(C17478k c17478k) {
        if (c17478k == null) {
            return;
        }
        AbstractC32227d.m155417a("ZaloViewManager", "removeZaloViewRemoveOld, stackRecord: zaloView" + c17478k.f89075b + ", uuid= " + c17478k.f89078e + ", zClass= " + c17478k.f89074a);
        this.f89110d.remove(c17478k);
        this.f89111e.remove(c17478k);
        ZaloView zaloView = c17478k.f89075b;
        if (zaloView == null) {
            return;
        }
        if (zaloView.f88775p >= 3) {
            c17478k.f89081h = false;
            m93082t1(c17478k, 3);
        }
        if (zaloView.m92642L3() != null && zaloView.m92642L3().containsKey("SHOW_WITH_FLAGS")) {
            zaloView.m92642L3().remove("SHOW_WITH_FLAGS");
        }
        if (ZaloView.InterfaceC17424i.class.isAssignableFrom(zaloView.getClass())) {
            View view = zaloView.f88746M;
            if (view != null) {
                if (ZaloView.InterfaceC17418c.class.isAssignableFrom(zaloView.getClass())) {
                    view.setVisibility(8);
                } else {
                    ViewGroup viewGroup = (ViewGroup) view.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(view);
                        zaloView.mo39029LJ();
                    }
                }
                AbstractC1579n0.m7805C0(view, 1.0f);
                AbstractC1579n0.m7845W0(view, 1.0f);
                AbstractC1579n0.m7847X0(view, 1.0f);
                AbstractC1579n0.m7854a1(view, 0.0f);
                AbstractC1579n0.m7857b1(view, 0.0f);
            }
            View view2 = zaloView.f88747N;
            if (view2 != null) {
                AbstractC1579n0.m7805C0(view2, 1.0f);
                AbstractC1579n0.m7845W0(zaloView.f88747N, 1.0f);
                AbstractC1579n0.m7847X0(zaloView.f88747N, 1.0f);
                AbstractC1579n0.m7854a1(zaloView.f88747N, 0.0f);
                AbstractC1579n0.m7857b1(zaloView.f88747N, 0.0f);
            }
            zaloView.f88786v = false;
            this.f89112f.add(c17478k);
        } else {
            m93082t1(c17478k, 0);
            c17478k.f89076c = null;
        }
        zaloView.f88787w = false;
        m93006I(zaloView);
    }

    /* renamed from: K */
    void m93011K(boolean z11) {
        C17478k c17478k;
        ZaloView zaloView;
        View view;
        int size;
        ZaloView zaloView2;
        if (!ZaloView.f88732u0 && ZaloView.f88733v0 >= 2) {
            if (!z11) {
                if (this.f89110d.size() > ZaloView.f88733v0) {
                    ArrayList arrayList = this.f89110d;
                    C17478k c17478k2 = (C17478k) arrayList.get(arrayList.size() - ZaloView.f88733v0);
                    if (!ZaloView.InterfaceC17421f.class.isAssignableFrom(c17478k2.f89074a) && !ZaloView.InterfaceC17420e.class.isAssignableFrom(c17478k2.f89074a)) {
                        size = -1;
                    } else {
                        size = this.f89110d.size() - ZaloView.f88733v0;
                        while (size >= 1) {
                            size--;
                            C17478k c17478k3 = (C17478k) this.f89110d.get(size);
                            if (c17478k3 != null && (ZaloView.InterfaceC17421f.class.isAssignableFrom(c17478k3.f89074a) || ZaloView.InterfaceC17420e.class.isAssignableFrom(c17478k3.f89074a))) {
                                if (size < 0) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    if (size < 0) {
                        size = this.f89110d.size() - ZaloView.f88733v0;
                    }
                    for (int i11 = size - 1; i11 >= 0; i11--) {
                        C17478k c17478k4 = (C17478k) this.f89110d.get(i11);
                        if (c17478k4 != null && (zaloView2 = c17478k4.f89075b) != null && zaloView2.f88746M != null) {
                            if (ZaloView.InterfaceC17418c.class.isAssignableFrom(c17478k4.f89074a)) {
                                c17478k4.f89075b.f88746M.setVisibility(8);
                            } else {
                                ViewGroup viewGroup = (ViewGroup) c17478k4.f89075b.f88746M.getParent();
                                if (viewGroup != null) {
                                    viewGroup.removeView(c17478k4.f89075b.f88746M);
                                    c17478k4.f89075b.mo39029LJ();
                                }
                            }
                        }
                    }
                    return;
                }
                return;
            }
            for (int i12 = 1; i12 <= ZaloView.f88733v0 + 1; i12++) {
                int size2 = this.f89110d.size() - i12;
                if (size2 >= 0 && size2 < this.f89110d.size() - 1 && (c17478k = (C17478k) this.f89110d.get(size2)) != null && (zaloView = c17478k.f89075b) != null && (view = zaloView.f88746M) != null && zaloView.f88745L != null && zaloView.f88775p > 2 && view.getParent() == null) {
                    ZaloView zaloView3 = c17478k.f89075b;
                    zaloView3.f88745L.addView(zaloView3.f88746M, 0);
                    c17478k.f89075b.mo59563AJ();
                }
            }
        }
    }

    /* renamed from: K0 */
    public ZaloView m93012K0() {
        if (this.f89110d.isEmpty()) {
            return null;
        }
        return ((C17478k) this.f89110d.get(r0.size() - 1)).f89075b;
    }

    /* renamed from: K1 */
    public void m93013K1() {
        AbstractC32227d.m155417a("ZaloViewManager", "requestDismissSplashScreen");
        if (this.f89127u != null) {
            this.f89120n.post(new i());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004d, code lost:            r0 = r5.f89110d.size() - r5.f89126t;     */
    /* renamed from: L */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void m93014L() {
        int i11;
        if (this.f89126t > 0 && this.f89110d.size() > this.f89126t) {
            ArrayList arrayList = this.f89110d;
            if (ZaloView.InterfaceC17421f.class.isAssignableFrom(((C17478k) arrayList.get(arrayList.size() - this.f89126t)).f89074a)) {
                i11 = this.f89110d.size() - this.f89126t;
                while (i11 >= 0) {
                    i11--;
                    C17478k c17478k = (C17478k) this.f89110d.get(i11);
                    if (c17478k == null || !ZaloView.InterfaceC17421f.class.isAssignableFrom(c17478k.f89074a) || i11 < 0) {
                        break;
                    }
                }
            } else {
                i11 = -1;
            }
            for (int i12 = i11 - 1; i12 >= 0; i12--) {
                C17478k c17478k2 = (C17478k) this.f89110d.get(i12);
                if (!ZaloView.InterfaceC17424i.class.isAssignableFrom(c17478k2.f89074a) && c17478k2.f89075b != null) {
                    if (c17478k2.f89076c == null) {
                        ZaloViewState zaloViewState = new ZaloViewState(c17478k2.f89075b);
                        ZaloView zaloView = c17478k2.f89075b;
                        Bundle bundle = zaloView.f88777q;
                        if (bundle != null) {
                            zaloViewState.f88804x = bundle;
                        } else {
                            zaloViewState.f88804x = m92938T1(zaloView);
                        }
                        c17478k2.f89076c = zaloViewState;
                    }
                    m93082t1(c17478k2, 0);
                    c17478k2.f89075b = null;
                }
            }
        }
    }

    /* renamed from: L0 */
    public C1808z0 m93015L0(ZaloView zaloView) {
        return this.f89101B.m93122P(zaloView);
    }

    /* renamed from: L1 */
    public void m93016L1(boolean z11) {
        AbstractC32227d.m155417a("ZaloViewManager", "requestPassCodeView show= " + z11);
        this.f89129w = z11;
        if (z11) {
            if (this.f89116j != null) {
                m93052Z1();
                return;
            }
            return;
        }
        m93036U();
    }

    /* renamed from: M */
    public void m93017M() {
        View view;
        View view2;
        ViewGroup viewGroup;
        if (this.f89119m) {
            if (this.f89125s != null) {
                m93030Q1();
            }
            AnimatorSet animatorSet = this.f89122p;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.f89122p = null;
            }
            AbstractC32235l.m155471b();
            Runnable runnable = this.f89124r;
            if (runnable != null) {
                this.f89120n.removeCallbacks(runnable);
                this.f89124r.run();
                this.f89124r = null;
            }
            Runnable runnable2 = this.f89123q;
            if (runnable2 != null) {
                this.f89120n.removeCallbacks(runnable2);
                this.f89123q.run();
                this.f89123q = null;
            }
            if (!this.f89110d.isEmpty() && !this.f89129w) {
                C17478k c17478k = (C17478k) this.f89110d.get(r0.size() - 1);
                if (c17478k != null) {
                    ZaloView zaloView = c17478k.f89075b;
                    if (zaloView != null && (view2 = zaloView.f88746M) != null && view2.getParent() == null) {
                        ZaloView zaloView2 = c17478k.f89075b;
                        View view3 = zaloView2.f88746M;
                        if (view3.getVisibility() != 0) {
                            view3.setVisibility(0);
                        }
                        ViewGroup viewGroup2 = zaloView2.f88745L;
                        if (viewGroup2 != null) {
                            m93089x(viewGroup2, view3);
                            zaloView2.mo59563AJ();
                        } else {
                            int i11 = zaloView2.f88739F;
                            if (i11 > 0 && (viewGroup = (ViewGroup) this.f89117k.findViewById(i11)) != null) {
                                zaloView2.f88745L = viewGroup;
                                m93089x(viewGroup, view3);
                                zaloView2.mo59563AJ();
                            }
                        }
                    }
                    ZaloView zaloView3 = c17478k.f89075b;
                    if (zaloView3 != null && (view = zaloView3.f88747N) != null && AbstractC1579n0.m7903u(view) < 1.0f) {
                        m93022N1(c17478k.f89075b);
                    }
                }
            }
        }
    }

    /* renamed from: M0 */
    public int m93018M0() {
        ArrayList arrayList = this.f89110d;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    /* renamed from: M1 */
    public void m93019M1(String str, int i11) {
        AbstractC32227d.m155417a("ZaloViewManager", "requestShowSplashScreen");
        if (this.f89127u == null) {
            SplashView splashView = new SplashView(this.f89116j.getContext());
            this.f89127u = splashView;
            splashView.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.zview.y
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C17487o0.m92961k1(view);
                }
            });
        }
        SplashView splashView2 = this.f89127u;
        if (splashView2 != null) {
            TextView textView = splashView2.f88718p;
            if (textView != null) {
                textView.setText(str);
            }
            ImageView imageView = this.f89127u.f88719q;
            if (imageView != null) {
                imageView.setImageResource(i11);
            }
            m93086w(this.f89127u, 1000, null);
        }
    }

    /* renamed from: N */
    void m93020N(C17478k c17478k) {
        Class mo66706bC;
        if (c17478k != null) {
            InterfaceC1801w interfaceC1801w = c17478k.f89075b;
            if (!(interfaceC1801w instanceof ZaloView.InterfaceC17425j) || (mo66706bC = ((ZaloView.InterfaceC17425j) interfaceC1801w).mo66706bC()) == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (int i11 = 0; i11 < this.f89110d.size() && i11 < c17478k.f89075b.f88771l0; i11++) {
                C17478k c17478k2 = (C17478k) this.f89110d.get(i11);
                if (mo66706bC.isAssignableFrom(c17478k2.f89074a)) {
                    arrayList.add(c17478k2);
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                m93073m2((C17478k) it.next(), true);
            }
            Iterator it2 = this.f89110d.iterator();
            while (it2.hasNext()) {
                C17478k c17478k3 = (C17478k) it2.next();
                ZaloView zaloView = c17478k3.f89075b;
                if (zaloView != null) {
                    zaloView.f88771l0 = this.f89110d.indexOf(c17478k3);
                }
            }
        }
    }

    /* renamed from: N0 */
    public InterfaceC27218a m93021N0() {
        return this.f89116j;
    }

    /* renamed from: N1 */
    void m93022N1(ZaloView zaloView) {
        if (zaloView != null) {
            try {
                View view = zaloView.f88746M;
                if (view != null) {
                    AbstractC1579n0.m7845W0(view, 1.0f);
                    AbstractC1579n0.m7847X0(zaloView.f88746M, 1.0f);
                    AbstractC1579n0.m7805C0(zaloView.f88746M, 1.0f);
                    AbstractC1579n0.m7854a1(zaloView.f88746M, 0.0f);
                    AbstractC1579n0.m7857b1(zaloView.f88746M, 0.0f);
                    zaloView.f88746M.setLayerType(0, null);
                    View view2 = zaloView.f88747N;
                    if (view2 != null) {
                        AbstractC1579n0.m7845W0(view2, 1.0f);
                        AbstractC1579n0.m7847X0(zaloView.f88747N, 1.0f);
                        AbstractC1579n0.m7805C0(zaloView.f88747N, 1.0f);
                        AbstractC1579n0.m7854a1(zaloView.f88747N, 0.0f);
                        AbstractC1579n0.m7857b1(zaloView.f88747N, 0.0f);
                        zaloView.f88747N.setLayerType(0, null);
                    }
                }
            } catch (NullPointerException e11) {
                e11.printStackTrace();
                AbstractC32227d.m155418b("ZaloViewManager", "resetAnimationValues NullPointerException thrown", e11);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: O */
    void m93023O(int i11) {
        ViewGroup viewGroup;
        Bundle bundle;
        View view;
        if (this.f89117k != null && ZaloActivity.f37907R && i11 >= 1 && i11 <= this.f89110d.size() - 1) {
            int i12 = i11 - 1;
            C17478k c17478k = (C17478k) this.f89110d.get(i12);
            ZaloView m93028P1 = m93028P1(c17478k);
            if (m93028P1 != 0 && !m93028P1.f88787w) {
                if (m93028P1.f88746M == null) {
                    ViewGroup viewGroup2 = null;
                    if (m93028P1.f88775p < 2) {
                        int i13 = m93028P1.f88739F;
                        m93028P1.f88739F = 0;
                        m93082t1(c17478k, 2);
                        m93028P1.f88739F = i13;
                        if (i13 != 0) {
                            viewGroup2 = (ViewGroup) this.f89117k.findViewById(i13);
                        }
                        m93028P1.f88745L = viewGroup2;
                    } else {
                        int i14 = m93028P1.f88739F;
                        if (i14 != 0) {
                            viewGroup = (ViewGroup) this.f89117k.findViewById(i14);
                        } else {
                            viewGroup = null;
                        }
                        ZaloViewState zaloViewState = c17478k.f89076c;
                        if (zaloViewState != null) {
                            bundle = zaloViewState.f88804x;
                        } else {
                            bundle = m93028P1.f88777q;
                        }
                        m93028P1.m92663fK(m93028P1.mo79283UI(m93028P1.f88777q), viewGroup, m93028P1.f88777q);
                        View view2 = m93028P1.f88746M;
                        if (view2 != null) {
                            m93028P1.f88747N = view2;
                            view2 = SlideAnimationLayout.m92610g(view2, this);
                            SlideAnimationLayout slideAnimationLayout = (SlideAnimationLayout) view2;
                            slideAnimationLayout.setOwnerZaloViewName(m93028P1.toString());
                            if (m93028P1 instanceof SlideAnimationLayout.InterfaceC17409d) {
                                slideAnimationLayout.setSlidingListener((SlideAnimationLayout.InterfaceC17409d) m93028P1);
                            }
                        } else {
                            m93028P1.f88747N = null;
                        }
                        m93028P1.f88746M = view2;
                        m93028P1.f88745L = viewGroup;
                        if (view2 != null) {
                            m93028P1.mo37125ZJ(view2, bundle);
                            m93076o0(m93028P1, m93028P1.f88746M, m93028P1.f88777q, false);
                        }
                    }
                    if (i11 == m93009J0() && (view = m93028P1.f88746M) != null && m93028P1.f88745L != null) {
                        view.setVisibility(4);
                        m93028P1.f88745L.addView(m93028P1.f88746M, 0);
                    }
                }
                if (ZaloView.InterfaceC17421f.class.isAssignableFrom(c17478k.f89074a)) {
                    m93023O(i12);
                }
            }
        }
    }

    /* renamed from: O0 */
    public ZaloView m93024O0(Bundle bundle, String str) {
        int i11 = bundle.getInt(str, -1);
        if (i11 == -1) {
            return null;
        }
        if (i11 < this.f89111e.size()) {
            ZaloView m93028P1 = m93028P1((C17478k) this.f89111e.get(i11));
            if (m93028P1 != null) {
                return m93028P1;
            }
            throw new IllegalStateException("ZaloView no longer exists for key " + str + ": index " + i11);
        }
        throw new IllegalStateException("ZaloView no longer exists for key " + str + ": index " + i11);
    }

    /* renamed from: O1 */
    public void m93025O1(Parcelable parcelable) {
        if (parcelable == null) {
            return;
        }
        ZaloViewManagerState zaloViewManagerState = (ZaloViewManagerState) parcelable;
        int i11 = 0;
        if (zaloViewManagerState.f88794p != null) {
            this.f89110d = new ArrayList(zaloViewManagerState.f88794p.length);
            int i12 = 0;
            while (true) {
                StackRecordState[] stackRecordStateArr = zaloViewManagerState.f88794p;
                if (i12 >= stackRecordStateArr.length) {
                    break;
                }
                StackRecordState stackRecordState = stackRecordStateArr[i12];
                if (stackRecordState != null) {
                    C17478k m92615a = stackRecordState.m92615a(this);
                    m92615a.f89079f = true;
                    this.f89110d.add(m92615a);
                    stackRecordState.f88723s = null;
                }
                i12++;
            }
        }
        if (zaloViewManagerState.f88795q != null) {
            this.f89111e = new ArrayList(zaloViewManagerState.f88795q.length);
            while (true) {
                StackRecordState[] stackRecordStateArr2 = zaloViewManagerState.f88795q;
                if (i11 < stackRecordStateArr2.length) {
                    StackRecordState stackRecordState2 = stackRecordStateArr2[i11];
                    if (stackRecordState2 != null) {
                        C17478k m92615a2 = stackRecordState2.m92615a(this);
                        m92615a2.f89079f = true;
                        this.f89111e.add(m92615a2);
                        stackRecordState2.f88723s = null;
                    }
                    i11++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: P */
    public boolean m93026P(ZaloView zaloView) {
        ZaloView zaloView2;
        ZaloView zaloView3;
        if (zaloView == null) {
            return false;
        }
        try {
            ArrayList arrayList = this.f89111e;
            if (arrayList != null && !arrayList.isEmpty()) {
                for (int size = this.f89111e.size() - 1; size >= 0; size--) {
                    if (this.f89111e.get(size) != null) {
                        zaloView3 = ((C17478k) this.f89111e.get(size)).f89075b;
                    } else {
                        zaloView3 = null;
                    }
                    if (zaloView3 != null && zaloView3.equals(zaloView)) {
                        return true;
                    }
                }
            }
            ArrayList arrayList2 = this.f89110d;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                for (int size2 = this.f89110d.size() - 1; size2 >= 0; size2--) {
                    if (this.f89110d.get(size2) != null) {
                        zaloView2 = ((C17478k) this.f89110d.get(size2)).f89075b;
                    } else {
                        zaloView2 = null;
                    }
                    if (zaloView2 != null && zaloView2.equals(zaloView)) {
                        return true;
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return false;
    }

    /* renamed from: P0 */
    public AbstractC17504t m93027P0() {
        AbstractC17504t abstractC17504t = this.f89102C;
        if (abstractC17504t != null) {
            return abstractC17504t;
        }
        ZaloView zaloView = this.f89118l;
        if (zaloView != null) {
            return zaloView.f88736C.m93027P0();
        }
        return this.f89103D;
    }

    /* renamed from: P1 */
    ZaloView m93028P1(C17478k c17478k) {
        Bundle bundle;
        if (c17478k == null) {
            AbstractC32227d.m155419c("ZaloViewManager", "restoreZaloView>>> StackRecord is null, return");
            return null;
        }
        if (c17478k.f89075b == null) {
            ZaloViewState zaloViewState = c17478k.f89076c;
            if (zaloViewState != null) {
                ZaloView m92699a = zaloViewState.m92699a(this, this.f89118l);
                c17478k.f89075b = m92699a;
                m92699a.m92669jJ();
                ZaloView zaloView = c17478k.f89075b;
                zaloView.f88735B = this.f89116j;
                zaloView.f88786v = true;
                zaloView.f88781s = c17478k.f89078e;
                ZaloViewState zaloViewState2 = c17478k.f89076c;
                if (zaloViewState2 != null && (bundle = zaloViewState2.f88804x) != null && bundle.containsKey("zaloviewmaganger:child_target_state")) {
                    c17478k.f89075b.f88765f0 = c17478k.f89076c.f88804x.getString("zaloviewmaganger:child_target_state");
                    c17478k.f89075b.f88766g0 = c17478k.f89076c.f88804x.getInt("zaloviewmaganger:child_target_req_state");
                }
            } else {
                AbstractC32227d.m155419c("ZaloViewManager", "restoreZaloView>>> ZaloViewState is null, return null");
            }
        }
        AbstractC32227d.m155419c("ZaloViewManager", "restoreZaloView>>> END ZaloView= " + c17478k.f89075b);
        return c17478k.f89075b;
    }

    /* renamed from: Q */
    public boolean m93029Q(Class cls) {
        if (cls == null) {
            return false;
        }
        if (!this.f89111e.isEmpty()) {
            for (int size = this.f89111e.size() - 1; size >= 0; size--) {
                if (((C17478k) this.f89111e.get(size)).f89074a.equals(cls)) {
                    return true;
                }
            }
        }
        if (!this.f89110d.isEmpty()) {
            for (int size2 = this.f89110d.size() - 1; size2 >= 0; size2--) {
                if (((C17478k) this.f89110d.get(size2)).f89074a.equals(cls)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: Q0 */
    public boolean mo92703Q0() {
        InterfaceC27218a interfaceC27218a;
        if (this.f89110d.isEmpty()) {
            return false;
        }
        if (this.f89110d.size() == 1 && (interfaceC27218a = this.f89116j) != null && (!interfaceC27218a.mo35577o() || this.f89116j.mo35585v() == null)) {
            this.f89109c = false;
            return false;
        }
        C17478k c17478k = (C17478k) this.f89110d.get(m93009J0());
        Message message = new Message();
        message.what = f89097J;
        message.obj = c17478k;
        ZaloView zaloView = c17478k.f89075b;
        if (zaloView != null) {
            message.arg2 = zaloView.f88756W;
        }
        this.f89105F.sendMessage(message);
        this.f89109c = true;
        return true;
    }

    /* renamed from: Q1 */
    public void m93030Q1() {
        Runnable runnable = this.f89125s;
        if (runnable != null) {
            this.f89105F.removeCallbacks(runnable);
            this.f89125s.run();
            this.f89125s = null;
        }
    }

    /* renamed from: R */
    void m93031R(C17478k c17478k) {
        ZaloView zaloView;
        ZaloView zaloView2;
        if (c17478k != null) {
            this.f89109c = true;
            ZaloView zaloView3 = c17478k.f89075b;
            if (zaloView3.f88776p0) {
                int i11 = zaloView3.f88772m0;
                if (i11 >= 0 && i11 < this.f89110d.size() - 1) {
                    for (int size = this.f89110d.size() - 2; size >= zaloView3.f88772m0; size--) {
                        C17478k c17478k2 = (C17478k) this.f89110d.get(size);
                        if (c17478k2 != null && (zaloView2 = c17478k2.f89075b) != null) {
                            zaloView2.f88787w = true;
                        }
                    }
                }
                m93049Y1(zaloView3.f88772m0);
                zaloView3.f88776p0 = false;
                zaloView3.f88772m0 = -1;
                zaloView3.f88771l0 = this.f89110d.indexOf(c17478k);
            } else {
                int i12 = zaloView3.f88771l0;
                if (i12 >= 0 && i12 < this.f89110d.size() - 1) {
                    for (int size2 = this.f89110d.size() - 1; size2 > zaloView3.f88771l0; size2--) {
                        C17478k c17478k3 = (C17478k) this.f89110d.get(size2);
                        if (c17478k3 != null && (zaloView = c17478k3.f89075b) != null) {
                            zaloView.f88787w = true;
                        }
                    }
                }
                m93054a2(zaloView3.f88771l0);
            }
            this.f89109c = false;
        }
    }

    /* renamed from: R1 */
    public void m93032R1(String str, boolean z11) {
        AbstractC19444a.m101697e(new Runnable() { // from class: com.zing.zalo.zview.e0

            /* renamed from: q */
            public final /* synthetic */ String f89059q;

            /* renamed from: r */
            public final /* synthetic */ boolean f89060r;

            public /* synthetic */ RunnableC17467e0(String str2, boolean z112) {
                r2 = str2;
                r3 = z112;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C17487o0.this.m92963l1(r2, r3);
            }
        });
    }

    /* renamed from: S */
    public Message m93033S(ZaloView zaloView, int i11) {
        if (zaloView != null && !zaloView.m92681pJ()) {
            if (this.f89111e.isEmpty()) {
                return null;
            }
            for (int size = this.f89111e.size() - 1; size >= 0; size--) {
                C17478k c17478k = (C17478k) this.f89111e.get(size);
                if (c17478k.f89078e.equals(zaloView.f88781s)) {
                    Message obtain = Message.obtain();
                    obtain.what = f89097J;
                    obtain.arg2 = i11;
                    obtain.obj = c17478k;
                    return obtain;
                }
            }
            return null;
        }
        AbstractC32227d.m155419c("ZaloViewManager", "createMessageRemoveChildZaloView>>> ZaloView is null or being removed, return. zv=" + zaloView);
        return null;
    }

    /* renamed from: S1 */
    public Parcelable m93034S1() {
        ZaloView zaloView;
        ZaloView zaloView2;
        StackRecordState[] stackRecordStateArr = new StackRecordState[this.f89110d.size()];
        for (int i11 = 0; i11 < this.f89110d.size(); i11++) {
            C17478k c17478k = (C17478k) this.f89110d.get(i11);
            if (c17478k.f89076c == null && (zaloView2 = c17478k.f89075b) != null) {
                ZaloViewState zaloViewState = new ZaloViewState(zaloView2);
                if (zaloView2.f88775p >= 2) {
                    Bundle bundle = zaloView2.f88777q;
                    if (bundle == null) {
                        bundle = m92938T1(zaloView2);
                    }
                    zaloViewState.f88804x = bundle;
                }
                c17478k.f89076c = zaloViewState;
            }
            stackRecordStateArr[i11] = new StackRecordState(c17478k);
        }
        StackRecordState[] stackRecordStateArr2 = new StackRecordState[this.f89111e.size()];
        for (int i12 = 0; i12 < this.f89111e.size(); i12++) {
            C17478k c17478k2 = (C17478k) this.f89111e.get(i12);
            if (c17478k2.f89076c == null && (zaloView = c17478k2.f89075b) != null) {
                ZaloViewState zaloViewState2 = new ZaloViewState(zaloView);
                Bundle bundle2 = zaloView.f88777q;
                if (bundle2 == null) {
                    bundle2 = m92938T1(zaloView);
                }
                zaloViewState2.f88804x = bundle2;
                c17478k2.f89076c = zaloViewState2;
            }
            stackRecordStateArr2[i12] = new StackRecordState(c17478k2);
        }
        ZaloViewManagerState zaloViewManagerState = new ZaloViewManagerState();
        zaloViewManagerState.f88794p = stackRecordStateArr;
        zaloViewManagerState.f88795q = stackRecordStateArr2;
        return zaloViewManagerState;
    }

    /* renamed from: T */
    public Message m93035T(int i11, ZaloView zaloView, Bundle bundle, int i12, String str, int i13, boolean z11) {
        Message obtain;
        if (bundle != null) {
            zaloView.mo60305zK(bundle);
        }
        zaloView.m92669jJ();
        zaloView.f88735B = this.f89116j;
        zaloView.f88739F = i11;
        zaloView.f88785u = i12;
        zaloView.f88768i0 = this.f89108b;
        zaloView.f88756W = i13;
        if (TextUtils.isEmpty(str)) {
            str = "ZaloView";
        }
        zaloView.f88740G = str;
        zaloView.f88786v = true;
        C17478k c17478k = new C17478k(this);
        c17478k.f89074a = zaloView.getClass();
        c17478k.f89075b = zaloView;
        c17478k.f89076c = null;
        String uuid = UUID.randomUUID().toString();
        zaloView.f88781s = uuid;
        c17478k.f89078e = uuid;
        if (z11) {
            zaloView.f88771l0 = this.f89110d.size() - 1;
            obtain = Message.obtain();
            obtain.what = f89095H;
            obtain.obj = c17478k;
            obtain.arg1 = 1;
            obtain.arg2 = i13;
            if (m93048Y0()) {
                c17478k.f89080g = true;
            }
        } else {
            this.f89111e.add(c17478k);
            zaloView.f88771l0 = this.f89111e.size() - 1;
            obtain = Message.obtain();
            obtain.what = f89096I;
            obtain.obj = c17478k;
            obtain.arg2 = i13;
            if (this.f89119m && m93048Y0()) {
                c17478k.f89080g = true;
            }
        }
        return obtain;
    }

    /* renamed from: U */
    public void m93036U() {
        AbstractC32227d.m155417a("ZaloViewManager", "dismissPassCodeView");
        this.f89129w = false;
        PassCodeView passCodeView = this.f89128v;
        if (passCodeView != null && passCodeView.getParent() != null) {
            if (this.f89110d.isEmpty()) {
                if (AbstractC17482m.f89087a) {
                    AbstractC20110a.m104535d("dismissPassCodeView while view stack is empty", new Object[0]);
                }
                AbstractC32227d.m155417a("ZaloViewManager", "dismissPassCodeView while view stack is empty");
            } else {
                C17478k c17478k = (C17478k) this.f89110d.get(m93009J0());
                if (c17478k != null && c17478k.f89080g) {
                    c17478k.f89080g = false;
                    m93071l2(c17478k, 0);
                } else {
                    m92982v1(c17478k, this.f89114h);
                }
            }
            Iterator it = this.f89110d.iterator();
            while (it.hasNext()) {
                C17478k c17478k2 = (C17478k) it.next();
                if (c17478k2 != null) {
                    c17478k2.f89080g = false;
                }
            }
            if (this.f89119m) {
                Iterator it2 = this.f89111e.iterator();
                while (it2.hasNext()) {
                    C17478k c17478k3 = (C17478k) it2.next();
                    if (c17478k3 != null) {
                        if (c17478k3.f89080g) {
                            m93046X1(c17478k3, 0);
                        } else {
                            m92982v1(c17478k3, this.f89114h);
                        }
                        c17478k3.f89080g = false;
                    }
                }
            }
            this.f89109c = false;
            this.f89128v.m93107c();
        }
    }

    /* renamed from: U1 */
    public ZaloView.SavedState m93037U1(ZaloView zaloView) {
        Bundle m92938T1;
        if (!zaloView.f88786v || zaloView.f88787w || (m92938T1 = m92938T1(zaloView)) == null) {
            return null;
        }
        return new ZaloView.SavedState(m92938T1);
    }

    /* renamed from: V */
    public void m93038V() {
        if (AbstractC17482m.f89087a) {
            AbstractC20110a.m104541j(" ZaloView.ACTIVITY_CREATED", new Object[0]);
        }
        m92983y0(2);
    }

    /* renamed from: V0 */
    public boolean m93039V0() {
        ZaloView zaloView;
        try {
            if (this.f89110d.size() > 0) {
                C17478k c17478k = (C17478k) this.f89110d.get(r0.size() - 1);
                if (c17478k != null && (zaloView = c17478k.f89075b) != null && ZaloView.InterfaceC17423h.class.isAssignableFrom(zaloView.getClass())) {
                    return ((ZaloView.InterfaceC17423h) c17478k.f89075b).mo66383c8();
                }
                return false;
            }
            return false;
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    /* renamed from: V1 */
    void m93040V1(ZaloView zaloView) {
        if (zaloView.f88747N == null) {
            return;
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        zaloView.f88747N.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            zaloView.f88779r = sparseArray;
        }
    }

    /* renamed from: W */
    public void m93041W(WindowInsets windowInsets) {
        Iterator it = this.f89110d.iterator();
        while (it.hasNext()) {
            ZaloView zaloView = ((C17478k) it.next()).f89075b;
            if (zaloView != null && !zaloView.m92681pJ()) {
                zaloView.mo46830yJ(windowInsets);
            }
        }
        Iterator it2 = this.f89111e.iterator();
        while (it2.hasNext()) {
            ZaloView zaloView2 = ((C17478k) it2.next()).f89075b;
            if (zaloView2 != null && !zaloView2.m92681pJ()) {
                zaloView2.mo46830yJ(windowInsets);
            }
        }
    }

    /* renamed from: W0 */
    public boolean m93042W0() {
        ZaloView m93012K0 = m93012K0();
        if (m93012K0 != null) {
            return m93012K0.f88776p0;
        }
        return false;
    }

    /* renamed from: W1 */
    public void m93043W1(int i11) {
        if (i11 < 0) {
            i11 = 0;
        } else if (ZaloActivity.f37907R && i11 == 1) {
            i11 = 2;
        }
        this.f89126t = i11;
    }

    /* renamed from: X */
    public boolean m93044X(MenuItem menuItem) {
        if (!this.f89110d.isEmpty()) {
            ZaloView zaloView = ((C17478k) this.f89110d.get(m93009J0())).f89075b;
            if (zaloView != null && !zaloView.f88787w && zaloView.mo87132BJ(menuItem)) {
                return true;
            }
        }
        if (!this.f89111e.isEmpty()) {
            Iterator it = this.f89111e.iterator();
            while (it.hasNext()) {
                ZaloView zaloView2 = ((C17478k) it.next()).f89075b;
                if (zaloView2 != null && !zaloView2.m92681pJ() && zaloView2.mo87132BJ(menuItem)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    /* renamed from: X0 */
    public void m93045X0(ZaloView zaloView) {
        Message message = new Message();
        message.what = f89099L;
        message.obj = zaloView;
        this.f89105F.sendMessage(message);
    }

    /* renamed from: X1 */
    public void m93046X1(C17478k c17478k, int i11) {
        this.f89109c = true;
        ZaloView m93028P1 = m93028P1(c17478k);
        m93028P1.f88735B = this.f89116j;
        m93001G(m93028P1);
        m93082t1(c17478k, this.f89114h);
        if (i11 == 0) {
            m93028P1.mo49153YJ(true, false);
            m93028P1.mo37122XJ(true, false);
            m93028P1.f88788x = false;
            this.f89109c = false;
            m93022N1(m93028P1);
            return;
        }
        m93028P1.mo49153YJ(true, false);
        AnimatorSet mo39022HJ = m93028P1.mo39022HJ(true, new Runnable() { // from class: com.zing.zalo.zview.z

            /* renamed from: q */
            public final /* synthetic */ ZaloView f89224q;

            public /* synthetic */ RunnableC17512z(ZaloView m93028P12) {
                r2 = m93028P12;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C17487o0.this.m92965m1(r2);
            }
        });
        if (mo39022HJ == null) {
            this.f89122p = null;
            AbstractC32235l.m155474e(m93028P12.f88746M, null, i11, new f(m93028P12));
        } else {
            this.f89122p = mo39022HJ;
            if (!mo39022HJ.isStarted()) {
                mo39022HJ.start();
            }
        }
    }

    /* renamed from: Y */
    public void m93047Y() {
        if (AbstractC17482m.f89087a) {
            AbstractC20110a.m104541j(" ZaloView.CREATED", new Object[0]);
        }
        m92983y0(1);
    }

    /* renamed from: Y0 */
    public boolean m93048Y0() {
        return this.f89129w;
    }

    /* renamed from: Y1 */
    void m93049Y1(int i11) {
        if (i11 >= 0 && i11 < this.f89110d.size() - 1) {
            for (int size = this.f89110d.size() - 2; size >= i11; size--) {
                m93073m2((C17478k) this.f89110d.get(size), true);
            }
        }
    }

    /* renamed from: Z */
    public void m93050Z() {
        if (AbstractC17482m.f89087a) {
            AbstractC20110a.m104541j(" ZaloView.DESTROYED", new Object[0]);
        }
        this.f89115i = true;
        m93080s1(0, true);
        this.f89117k = null;
        this.f89118l = null;
        this.f89108b = null;
        InterfaceC27218a interfaceC27218a = this.f89116j;
        if (interfaceC27218a instanceof InterfaceC1338f1) {
            ((InterfaceC1338f1) interfaceC27218a).mo4643N(this.f89132z);
        }
    }

    /* renamed from: Z0 */
    public boolean m93051Z0(String str) {
        ZaloView zaloView;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (!this.f89111e.isEmpty()) {
            int size = this.f89111e.size();
            for (int i11 = 0; i11 < size; i11++) {
                zaloView = ((C17478k) this.f89111e.get(i11)).f89075b;
                if (zaloView != null && zaloView.f88740G.startsWith(str)) {
                    break;
                }
            }
        }
        zaloView = null;
        if (!this.f89110d.isEmpty()) {
            int size2 = this.f89110d.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size2) {
                    break;
                }
                ZaloView zaloView2 = ((C17478k) this.f89110d.get(i12)).f89075b;
                if (zaloView2 != null && zaloView2.f88740G.startsWith(str)) {
                    zaloView = zaloView2;
                    break;
                }
                i12++;
            }
        }
        if (zaloView == null) {
            return false;
        }
        return true;
    }

    /* renamed from: Z1 */
    void m93052Z1() {
        AbstractC32227d.m155417a("ZaloViewManager", "showPassCodeView");
        PassCodeView passCodeView = this.f89128v;
        if (passCodeView == null || passCodeView.f89173t != this.f89116j.mo35552K0()) {
            PassCodeView passCodeView2 = new PassCodeView(this.f89116j.getContext(), this.f89116j.mo35552K0());
            this.f89128v = passCodeView2;
            passCodeView2.setAcceptedPassCodeListener(this.f89106G);
            this.f89128v.setPassCodeContainerListener(this.f89100A);
        }
        PassCodeView passCodeView3 = this.f89128v;
        if (passCodeView3 != null) {
            m93086w(passCodeView3, 999, null);
            this.f89128v.m93115l();
        }
    }

    /* renamed from: a0 */
    public void m93053a0() {
        if (AbstractC17482m.f89087a) {
            AbstractC20110a.m104541j(" ZaloView.DESTROY_VIEW", new Object[0]);
        }
        m93080s1(1, true);
    }

    /* renamed from: a2 */
    void m93054a2(int i11) {
        if (i11 >= 0 && i11 < this.f89110d.size()) {
            for (int size = this.f89110d.size() - 1; size > i11; size--) {
                m93073m2((C17478k) this.f89110d.get(size), true);
            }
        }
    }

    /* renamed from: b0 */
    public void mo57056b0(boolean z11) {
        if (AbstractC17482m.f89087a) {
            AbstractC20110a.m104541j(" ZaloView.DESTROY_VIEW_CHANGE_SETTING", new Object[0]);
        }
        if (this.f89129w) {
            return;
        }
        if (!this.f89110d.isEmpty()) {
            int size = this.f89110d.size() - (z11 ? 1 : 0);
            for (int i11 = 0; i11 < size; i11++) {
                m93082t1((C17478k) this.f89110d.get(i11), 1);
            }
        }
        if (!this.f89111e.isEmpty()) {
            for (int size2 = this.f89111e.size() - 1; size2 >= 0; size2--) {
                m92982v1((C17478k) this.f89111e.get(size2), 1);
            }
        }
        if (!this.f89112f.isEmpty()) {
            for (int size3 = this.f89112f.size() - 1; size3 >= 0; size3--) {
                m92982v1((C17478k) this.f89112f.get(size3), 1);
            }
        }
        ArrayList arrayList = this.f89113g;
        if (arrayList != null && !arrayList.isEmpty()) {
            for (int size4 = this.f89113g.size() - 1; size4 >= 0; size4--) {
                m92982v1((C17478k) this.f89113g.get(size4), 1);
            }
        }
        if (!this.f89110d.isEmpty() && !z11) {
            ArrayList arrayList2 = this.f89110d;
            m93082t1((C17478k) arrayList2.get(arrayList2.size() - 1), this.f89114h);
            if (this.f89110d.size() > 1) {
                ArrayList arrayList3 = this.f89110d;
                m93082t1((C17478k) arrayList3.get(arrayList3.size() - 2), 2);
            }
        }
    }

    /* renamed from: b2 */
    public ZaloView mo93055b2(int i11, ZaloView zaloView, Bundle bundle, int i12, String str, int i13, boolean z11) {
        AbstractC32227d.m155417a("ZaloViewManager", "showZaloView, zaloView= " + zaloView + ", addBackStack= " + z11);
        this.f89109c = true;
        Message m93035T = m93035T(i11, zaloView, bundle, i12, str, i13, z11);
        if (m93035T != null) {
            this.f89105F.sendMessage(m93035T);
        } else {
            this.f89109c = false;
        }
        return zaloView;
    }

    /* renamed from: c0 */
    public void m93056c0() {
        for (int size = this.f89110d.size() - 1; size >= 0; size--) {
            ZaloView zaloView = ((C17478k) this.f89110d.get(size)).f89075b;
            if (zaloView != null && !zaloView.m92681pJ()) {
                zaloView.m92668iK();
            }
        }
        Iterator it = this.f89111e.iterator();
        while (it.hasNext()) {
            ZaloView zaloView2 = ((C17478k) it.next()).f89075b;
            if (zaloView2 != null && !zaloView2.m92681pJ()) {
                zaloView2.m92668iK();
            }
        }
    }

    /* renamed from: c2 */
    public ZaloView mo57057c2(int i11, Class cls, Bundle bundle, int i12, String str, int i13, boolean z11) {
        String str2;
        ZaloView zaloView;
        Class<?> cls2;
        if (cls != null && (!this.f89119m || !this.f89109c || (cls2 = this.f89121o) == null || !cls.isAssignableFrom(cls2))) {
            if (!AbstractC19444a.m101693a()) {
                AbstractC20110a.m104539h(new IllegalStateException("showZaloView must be called on the main thread. zClass is " + cls.getName()));
            }
            this.f89109c = true;
            this.f89121o = cls;
            int i14 = 0;
            if (bundle != null && bundle.containsKey("SHOW_WITH_FLAGS") && (bundle.getInt("SHOW_WITH_FLAGS") & 16777216) == 16777216 && !this.f89110d.isEmpty()) {
                ArrayList arrayList = this.f89110d;
                C17478k c17478k = (C17478k) arrayList.get(arrayList.size() - 1);
                if (cls.getName().equals(c17478k.f89074a.getName()) && (zaloView = c17478k.f89075b) != null && !zaloView.m92681pJ() && (zaloView.f88775p > 0 || c17478k.f89080g)) {
                    zaloView.mo60305zK(bundle);
                    zaloView.f88785u = i12;
                    zaloView.f88768i0 = this.f89108b;
                    zaloView.f88756W = i13;
                    if (zaloView.f88775p > 0) {
                        zaloView.f88774o0 = true;
                    }
                    this.f89109c = false;
                    if (!c17478k.f89080g) {
                        m93082t1(c17478k, this.f89114h);
                    }
                    return zaloView;
                }
            }
            int i15 = -1;
            if (bundle != null && bundle.containsKey("SHOW_WITH_FLAGS")) {
                int i16 = bundle.getInt("SHOW_WITH_FLAGS");
                if ((i16 & 7340032) == 7340032 && this.f89110d.size() > 1) {
                    if (this.f89113g == null) {
                        this.f89113g = new ArrayList();
                    }
                    for (int i17 = 1; i17 < this.f89110d.size(); i17++) {
                        this.f89113g.add((C17478k) this.f89110d.get(i17));
                    }
                } else if ((i16 & 67108864) == 67108864) {
                    if (this.f89113g == null) {
                        this.f89113g = new ArrayList();
                    }
                    this.f89113g.addAll(this.f89110d);
                    this.f89110d.clear();
                } else if ((i16 & 16777216) == 16777216 && !this.f89110d.isEmpty()) {
                    int size = this.f89110d.size() - 1;
                    C17478k c17478k2 = null;
                    while (true) {
                        if (size >= 0) {
                            c17478k2 = (C17478k) this.f89110d.get(size);
                            if (cls.getName().equals(c17478k2.f89074a.getName())) {
                                break;
                            }
                            size--;
                        } else {
                            size = -1;
                            break;
                        }
                    }
                    if (size >= 0 && size < this.f89110d.size()) {
                        ZaloView m93028P1 = m93028P1(c17478k2);
                        c17478k2.f89075b = m93028P1;
                        if (m93028P1 != null) {
                            m93028P1.mo60305zK(bundle);
                            m93028P1.f88785u = i12;
                            m93028P1.f88768i0 = this.f89108b;
                            m93028P1.f88756W = i13;
                            m93028P1.f88773n0 = true;
                            if (m93028P1.f88775p > 0) {
                                m93028P1.f88774o0 = true;
                            }
                        }
                        Message message = new Message();
                        message.what = f89095H;
                        message.obj = c17478k2;
                        if (m93048Y0()) {
                            c17478k2.f89080g = true;
                        }
                        message.arg1 = 0;
                        message.arg2 = i13;
                        this.f89105F.sendMessage(message);
                        return c17478k2.f89075b;
                    }
                }
            }
            if (ZaloView.InterfaceC17426k.class.isAssignableFrom(cls)) {
                C17478k c17478k3 = null;
                int i18 = 0;
                while (true) {
                    if (i18 < this.f89110d.size()) {
                        c17478k3 = (C17478k) this.f89110d.get(i18);
                        if (cls.getName().equals(c17478k3.f89074a.getName())) {
                            break;
                        }
                        i18++;
                    } else {
                        i18 = -1;
                        break;
                    }
                }
                if (i18 >= 0 && i18 < this.f89110d.size()) {
                    ZaloView m93028P12 = m93028P1(c17478k3);
                    if (m93028P12 != null) {
                        m93028P12.mo60305zK(bundle);
                        m93028P12.f88785u = i12;
                        m93028P12.f88768i0 = this.f89108b;
                        m93028P12.f88756W = i13;
                        m93028P12.f88773n0 = true;
                        if (m93028P12.f88775p > 0) {
                            m93028P12.f88774o0 = true;
                        }
                    }
                    Message message2 = new Message();
                    message2.what = f89095H;
                    message2.obj = c17478k3;
                    if (m93048Y0()) {
                        c17478k3.f89080g = true;
                    }
                    message2.arg1 = 0;
                    message2.arg2 = i13;
                    this.f89105F.sendMessage(message2);
                    return c17478k3.f89075b;
                }
            }
            if (!this.f89112f.isEmpty() && ZaloView.InterfaceC17424i.class.isAssignableFrom(cls)) {
                int size2 = this.f89112f.size() - 1;
                C17478k c17478k4 = null;
                while (true) {
                    if (size2 >= 0) {
                        c17478k4 = (C17478k) this.f89112f.get(size2);
                        if (cls.getName().equals(c17478k4.f89074a.getName())) {
                            break;
                        }
                        size2--;
                    } else {
                        size2 = -1;
                        break;
                    }
                }
                if (size2 >= 0 && size2 < this.f89112f.size() && c17478k4 != null) {
                    ZaloView m93028P13 = m93028P1(c17478k4);
                    this.f89112f.remove(size2);
                    if (m93028P13 != null) {
                        m93028P13.mo60305zK(bundle);
                        m93028P13.f88785u = i12;
                        m93028P13.f88768i0 = this.f89108b;
                        m93028P13.f88756W = i13;
                        m93028P13.f88773n0 = true;
                        m93028P13.f88774o0 = true;
                        m93028P13.f88786v = true;
                        m93028P13.f88787w = false;
                        m93028P13.f88771l0 = this.f89110d.size() - 1;
                    }
                    Message message3 = new Message();
                    message3.what = f89095H;
                    message3.obj = c17478k4;
                    if (m93048Y0()) {
                        c17478k4.f89080g = true;
                        message3.arg1 = 1;
                    } else {
                        this.f89110d.add(c17478k4);
                        message3.arg1 = 0;
                    }
                    message3.arg2 = i13;
                    this.f89105F.sendMessage(message3);
                    return c17478k4.f89075b;
                }
            }
            if (ZaloView.InterfaceC17417b.class.isAssignableFrom(cls)) {
                while (true) {
                    if (i14 >= this.f89110d.size()) {
                        break;
                    }
                    if (cls.getName().equals(((C17478k) this.f89110d.get(i14)).f89074a.getName())) {
                        i15 = i14;
                        break;
                    }
                    i14++;
                }
                if (i15 >= 0 && i15 < this.f89110d.size()) {
                    ZaloView mo93098a = m93027P0().mo93098a(this.f89116j.getContext().getClassLoader(), cls.getName(), null);
                    mo93098a.f88776p0 = true;
                    mo93098a.f88772m0 = i15;
                    mo93098a.f88771l0 = i15;
                    this.f89105F.sendMessage(m93035T(i11, mo93098a, bundle, i12, str, i13, z11));
                    return mo93098a;
                }
            }
            ZaloView mo93098a2 = m93027P0().mo93098a(this.f89116j.getContext().getClassLoader(), cls.getName(), null);
            mo93055b2(i11, mo93098a2, bundle, i12, str, i13, z11);
            return mo93098a2;
        }
        AbstractC32227d.m155419c("ZaloViewManager", "showZaloView>>> Cannot show ZaloView, return. mAddingOrRemovingView= " + this.f89109c + ", zClass= " + cls + ", mShowingClass= " + this.f89121o);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Cannot show ZaloView, return. zClass is ");
        if (cls != null) {
            str2 = cls.getName();
        } else {
            str2 = "null";
        }
        sb2.append(str2);
        AbstractC20110a.m104539h(new IllegalStateException(sb2.toString()));
        return null;
    }

    /* renamed from: d0 */
    public void m93057d0(boolean z11) {
        if (!this.f89111e.isEmpty()) {
            Iterator it = this.f89111e.iterator();
            while (it.hasNext()) {
                ZaloView zaloView = ((C17478k) it.next()).f89075b;
                if (zaloView != null && !zaloView.m92681pJ()) {
                    zaloView.m92670jK(z11);
                }
            }
        }
        if (!this.f89110d.isEmpty()) {
            Iterator it2 = this.f89110d.iterator();
            while (it2.hasNext()) {
                ZaloView zaloView2 = ((C17478k) it2.next()).f89075b;
                if (zaloView2 != null && !zaloView2.m92681pJ()) {
                    zaloView2.m92670jK(z11);
                }
            }
        }
    }

    /* renamed from: d2 */
    public void m93058d2(int i11, ZaloView zaloView, int i12, String str, int i13, boolean z11) {
        mo93055b2(i11, zaloView, null, i12, str, i13, z11);
    }

    /* renamed from: e0 */
    void m93059e0(ZaloView zaloView, Bundle bundle, boolean z11) {
        ZaloView zaloView2 = this.f89118l;
        if (zaloView2 != null) {
            C17487o0 m92662fJ = zaloView2.m92662fJ();
            if (m92662fJ instanceof C17487o0) {
                m92662fJ.m93059e0(zaloView, bundle, true);
            }
        }
        Iterator it = this.f89104E.iterator();
        while (it.hasNext()) {
            k kVar = (k) it.next();
            if (!z11 || kVar.f89150b) {
                kVar.f89149a.m93099a(this, zaloView, bundle);
            }
        }
    }

    /* renamed from: e2 */
    public void m93060e2(int i11, ZaloView zaloView, String str, int i12, boolean z11) {
        mo93055b2(i11, zaloView, null, 0, str, i12, z11);
    }

    /* renamed from: f0 */
    void m93061f0(ZaloView zaloView, Bundle bundle, boolean z11) {
        ZaloView zaloView2 = this.f89118l;
        if (zaloView2 != null) {
            C17487o0 m92662fJ = zaloView2.m92662fJ();
            if (m92662fJ instanceof C17487o0) {
                m92662fJ.m93061f0(zaloView, bundle, true);
            }
        }
        Iterator it = this.f89104E.iterator();
        while (it.hasNext()) {
            k kVar = (k) it.next();
            if (!z11 || kVar.f89150b) {
                kVar.f89149a.mo37231b(this, zaloView, bundle);
            }
        }
    }

    /* renamed from: f2 */
    public void m93062f2(int i11, Class cls, Bundle bundle, int i12, boolean z11) {
        mo57057c2(i11, cls, bundle, 0, null, i12, z11);
    }

    /* renamed from: g0 */
    void m93063g0(ZaloView zaloView, boolean z11) {
        ZaloView zaloView2 = this.f89118l;
        if (zaloView2 != null) {
            C17487o0 m92662fJ = zaloView2.m92662fJ();
            if (m92662fJ instanceof C17487o0) {
                m92662fJ.m93063g0(zaloView, true);
            }
        }
        Iterator it = this.f89104E.iterator();
        while (it.hasNext()) {
            k kVar = (k) it.next();
            if (!z11 || kVar.f89150b) {
                kVar.f89149a.mo37232c(this, zaloView);
            }
        }
    }

    /* renamed from: g2 */
    public void mo89692g2(ZaloView zaloView, int i11, int i12, boolean z11) {
        int i13;
        ZaloView zaloView2 = this.f89118l;
        if (zaloView2 != null) {
            View view = zaloView2.f88747N;
            if (view != null) {
                mo93055b2(view.getId(), zaloView, null, i11, null, i12, z11);
                return;
            } else {
                AbstractC32227d.m155419c("ZaloViewManager", "showZaloView(ZaloView,int,int,boolean)>>> Cannot show ZaloView, return. mParentZaloView.mInnerView is null");
                AbstractC20110a.m104539h(new IllegalStateException("Cannot show ZaloView, return. mParentZaloView.mInnerView is null"));
                return;
            }
        }
        InterfaceC27218a interfaceC27218a = this.f89116j;
        if (interfaceC27218a != null && interfaceC27218a.mo35585v() != null) {
            i13 = this.f89116j.mo35585v().getId();
        } else {
            i13 = R.id.content;
        }
        mo93055b2(i13, zaloView, null, i11, null, i12, z11);
    }

    /* renamed from: h0 */
    void m93064h0(ZaloView zaloView, boolean z11) {
        ZaloView zaloView2 = this.f89118l;
        if (zaloView2 != null) {
            C17487o0 m92662fJ = zaloView2.m92662fJ();
            if (m92662fJ instanceof C17487o0) {
                m92662fJ.m93064h0(zaloView, true);
            }
        }
        Iterator it = this.f89104E.iterator();
        while (it.hasNext()) {
            k kVar = (k) it.next();
            if (!z11 || kVar.f89150b) {
                kVar.f89149a.m93100d(this, zaloView);
            }
        }
    }

    /* renamed from: h2 */
    public void mo89693h2(ZaloView zaloView, String str, int i11, boolean z11) {
        int i12;
        ZaloView zaloView2 = this.f89118l;
        if (zaloView2 != null) {
            View view = zaloView2.f88747N;
            if (view != null) {
                m93060e2(view.getId(), zaloView, str, i11, z11);
                return;
            } else {
                AbstractC32227d.m155419c("ZaloViewManager", "showZaloViowew(ZaloView,String,int,boolean)>>> Cannot show ZaloView, return. mParentZaloView.mInnerView is null");
                AbstractC20110a.m104539h(new IllegalStateException("Cannot show ZaloView, return. mParentZaloView.mInnerView is null"));
                return;
            }
        }
        InterfaceC27218a interfaceC27218a = this.f89116j;
        if (interfaceC27218a != null && interfaceC27218a.mo35585v() != null) {
            i12 = this.f89116j.mo35585v().getId();
        } else {
            i12 = R.id.content;
        }
        m93060e2(i12, zaloView, str, i11, z11);
    }

    /* renamed from: i0 */
    void m93065i0(ZaloView zaloView, boolean z11) {
        ZaloView zaloView2 = this.f89118l;
        if (zaloView2 != null) {
            C17487o0 m92662fJ = zaloView2.m92662fJ();
            if (m92662fJ instanceof C17487o0) {
                m92662fJ.m93065i0(zaloView, true);
            }
        }
        Iterator it = this.f89104E.iterator();
        while (it.hasNext()) {
            k kVar = (k) it.next();
            if (!z11 || kVar.f89150b) {
                kVar.f89149a.mo37233e(this, zaloView);
            }
        }
    }

    /* renamed from: i2 */
    public void m93066i2(Class cls, Bundle bundle, int i11, int i12, boolean z11) {
        mo89694j2(cls, bundle, i11, null, i12, z11);
    }

    /* renamed from: j0 */
    void m93067j0(ZaloView zaloView, Bundle bundle, boolean z11) {
        ZaloView zaloView2 = this.f89118l;
        if (zaloView2 != null) {
            C17487o0 m92662fJ = zaloView2.m92662fJ();
            if (m92662fJ instanceof C17487o0) {
                m92662fJ.m93067j0(zaloView, bundle, true);
            }
        }
        Iterator it = this.f89104E.iterator();
        while (it.hasNext()) {
            k kVar = (k) it.next();
            if (!z11 || kVar.f89150b) {
                kVar.f89149a.mo37234f(this, zaloView, bundle);
            }
        }
    }

    /* renamed from: j2 */
    public void mo89694j2(Class cls, Bundle bundle, int i11, String str, int i12, boolean z11) {
        int i13;
        ZaloView zaloView = this.f89118l;
        if (zaloView != null) {
            View view = zaloView.f88747N;
            if (view != null) {
                mo57057c2(view.getId(), cls, bundle, i11, str, i12, z11);
                return;
            } else {
                AbstractC32227d.m155419c("ZaloViewManager", "showZaloView(Class,Bundle,int,String,int,boolean)>>> Cannot show ZaloView, return. mParentZaloView.mInnerView is null");
                AbstractC20110a.m104539h(new IllegalStateException("Cannot show ZaloView, return. mParentZaloView.mInnerView is null"));
                return;
            }
        }
        InterfaceC27218a interfaceC27218a = this.f89116j;
        if (interfaceC27218a != null && interfaceC27218a.mo35585v() != null) {
            i13 = this.f89116j.mo35585v().getId();
        } else {
            i13 = R.id.content;
        }
        mo57057c2(i13, cls, bundle, i11, str, i12, z11);
    }

    /* renamed from: k0 */
    void m93068k0(ZaloView zaloView, boolean z11) {
        ZaloView zaloView2 = this.f89118l;
        if (zaloView2 != null) {
            C17487o0 m92662fJ = zaloView2.m92662fJ();
            if (m92662fJ instanceof C17487o0) {
                m92662fJ.m93068k0(zaloView, true);
            }
        }
        Iterator it = this.f89104E.iterator();
        while (it.hasNext()) {
            k kVar = (k) it.next();
            if (!z11 || kVar.f89150b) {
                kVar.f89149a.mo37235g(this, zaloView);
            }
        }
    }

    /* renamed from: k2 */
    public void m93069k2(Class cls, Bundle bundle, int i11, boolean z11) {
        mo89694j2(cls, bundle, 0, null, i11, z11);
    }

    /* renamed from: l0 */
    void m93070l0(ZaloView zaloView, Bundle bundle, boolean z11) {
        ZaloView zaloView2 = this.f89118l;
        if (zaloView2 != null) {
            C17487o0 m92662fJ = zaloView2.m92662fJ();
            if (m92662fJ instanceof C17487o0) {
                m92662fJ.m93070l0(zaloView, bundle, true);
            }
        }
        Iterator it = this.f89104E.iterator();
        while (it.hasNext()) {
            k kVar = (k) it.next();
            if (!z11 || kVar.f89150b) {
                kVar.f89149a.m93101h(this, zaloView, bundle);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0081, code lost:            zl0.AbstractC32227d.m155417a("ZaloViewManager", "showZaloViewInternal, Back stack record, zaloView= " + r8.f89075b + ", class= " + r8.f89074a + ", uuid= " + r8.f89078e);        r1 = new java.lang.StringBuilder();        r1.append("showZaloViewInternal, Back stack record state= ");        r5 = r8.f89075b;     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b3, code lost:            if (r5 == null) goto L141;     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b5, code lost:            r5 = java.lang.Integer.valueOf(r5.f88775p);     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00bd, code lost:            r1.append(r5);        zl0.AbstractC32227d.m155417a("ZaloViewManager", r1.toString());     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00bc, code lost:            r5 = null;     */
    /* renamed from: l2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m93071l2(C17478k c17478k, int i11) {
        boolean z11;
        View view;
        View view2;
        ZaloView zaloView;
        boolean z12;
        ViewGroup viewGroup;
        InterfaceC1801w interfaceC1801w;
        this.f89109c = true;
        int indexOf = this.f89110d.indexOf(c17478k);
        ZaloView zaloView2 = c17478k.f89075b;
        zaloView2.f88771l0 = indexOf;
        m93001G(zaloView2);
        zaloView2.f88787w = false;
        AbstractC32227d.m155417a("ZaloViewManager", "showZaloViewInternal, zaloView= " + zaloView2 + ", class= " + c17478k.f89074a + ", uuid= " + c17478k.f89078e + ", index= " + indexOf);
        View view3 = null;
        C17478k c17478k2 = null;
        for (int i12 = zaloView2.f88771l0 - 1; i12 >= 0; i12--) {
            if (i12 < this.f89110d.size() && (c17478k2 = (C17478k) this.f89110d.get(i12)) != null && !c17478k2.f89080g) {
                if (!ZaloView.InterfaceC17423h.class.isAssignableFrom(c17478k2.f89074a) || (interfaceC1801w = c17478k2.f89075b) == null || !((ZaloView.InterfaceC17423h) interfaceC1801w).mo66383c8()) {
                    break;
                } else {
                    m93082t1(c17478k2, 3);
                }
            }
        }
        zaloView2.f88735B = this.f89116j;
        View view4 = zaloView2.f88746M;
        if (view4 != null && zaloView2.f88773n0) {
            if (view4.getVisibility() != 0) {
                zaloView2.f88746M.setVisibility(0);
                zaloView2.f88746M.bringToFront();
            }
            if (zaloView2.f88746M.getParent() == null && (viewGroup = zaloView2.f88745L) != null) {
                m93089x(viewGroup, zaloView2.f88746M);
                zaloView2.mo59563AJ();
            }
        }
        if (i11 != 0 && this.f89116j.mo35572i0()) {
            z11 = true;
        } else {
            z11 = false;
        }
        zaloView2.f88761b0 = z11;
        m93082t1(c17478k2, 3);
        m93082t1(c17478k, this.f89114h);
        if (!z11) {
            zaloView2.mo49153YJ(true, false);
            zaloView2.mo37122XJ(true, false);
            zaloView2.f88788x = false;
            ArrayList arrayList = this.f89113g;
            if (arrayList != null && !arrayList.isEmpty()) {
                this.f89120n.post(new Runnable() { // from class: com.zing.zalo.zview.g0

                    /* renamed from: q */
                    public final /* synthetic */ ArrayList f89065q;

                    public /* synthetic */ RunnableC17471g0(ArrayList arrayList2) {
                        r2 = arrayList2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C17487o0.this.m92967n1(r2);
                    }
                });
            } else if (zaloView2.f88773n0 && zaloView2.f88771l0 < this.f89110d.size() - 1) {
                m93054a2(zaloView2.f88771l0);
            } else if (zaloView2.f88776p0) {
                m93031R(c17478k);
            } else if (c17478k2 != null && c17478k2.f89075b != null) {
                if (!ZaloView.InterfaceC17421f.class.isAssignableFrom(c17478k.f89074a)) {
                    if (zaloView2.m92642L3() != null && zaloView2.m92642L3().containsKey("SHOW_WITH_FLAGS")) {
                        if ((zaloView2.m92642L3().getInt("SHOW_WITH_FLAGS") & 33554432) == 33554432) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (z12) {
                            zaloView2.f88771l0--;
                        }
                    } else {
                        z12 = false;
                    }
                    m93073m2(c17478k2, z12);
                }
                m93014L();
                m93011K(false);
            }
            if (ZaloView.InterfaceC17425j.class.isAssignableFrom(c17478k.f89074a)) {
                m93020N(c17478k);
            }
            m93022N1(zaloView2);
            this.f89109c = false;
            return;
        }
        this.f89123q = new Runnable() { // from class: com.zing.zalo.zview.h0

            /* renamed from: q */
            public final /* synthetic */ ZaloView f89067q;

            /* renamed from: r */
            public final /* synthetic */ C17478k f89068r;

            /* renamed from: s */
            public final /* synthetic */ C17478k f89069s;

            public /* synthetic */ RunnableC17473h0(ZaloView zaloView22, C17478k c17478k3, C17478k c17478k22) {
                r2 = zaloView22;
                r3 = c17478k3;
                r4 = c17478k22;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C17487o0.this.m92971p1(r2, r3, r4);
            }
        };
        zaloView22.f88764e0 = true;
        zaloView22.mo49153YJ(true, false);
        AnimatorSet mo39022HJ = zaloView22.mo39022HJ(true, new Runnable() { // from class: com.zing.zalo.zview.i0
            public /* synthetic */ RunnableC17475i0() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C17487o0.this.m92935R0();
            }
        });
        if (mo39022HJ == null) {
            this.f89122p = null;
            if (c17478k22 != null && (zaloView = c17478k22.f89075b) != null) {
                view3 = zaloView.f88746M;
            }
            if (zaloView22.f88747N == null && (view2 = zaloView22.f88746M) != null && ((ViewGroup) view2).getChildCount() > 0) {
                zaloView22.f88747N = ((ViewGroup) zaloView22.f88746M).getChildAt(0);
            }
            if (zaloView22.mo49160wJ()) {
                if ((i11 == 1 || i11 == 3 || i11 == 2) && (view = zaloView22.f88747N) != null) {
                    AbstractC1579n0.m7805C0(view, 0.0f);
                }
                Handler handler = this.f89105F;
                d dVar = new d(zaloView22, view3, i11);
                this.f89125s = dVar;
                handler.postDelayed(dVar, 100L);
                return;
            }
            AbstractC32235l.m155474e(zaloView22.f88747N, view3, i11, new e());
            return;
        }
        this.f89122p = mo39022HJ;
        this.f89105F.post(new Runnable() { // from class: com.zing.zalo.zview.j0
            public /* synthetic */ RunnableC17477j0() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C17487o0.this.m92974q1();
            }
        });
    }

    /* renamed from: m0 */
    void m93072m0(ZaloView zaloView, boolean z11) {
        ZaloView zaloView2 = this.f89118l;
        if (zaloView2 != null) {
            C17487o0 m92662fJ = zaloView2.m92662fJ();
            if (m92662fJ instanceof C17487o0) {
                m92662fJ.m93072m0(zaloView, true);
            }
        }
        Iterator it = this.f89104E.iterator();
        while (it.hasNext()) {
            k kVar = (k) it.next();
            if (!z11 || kVar.f89150b) {
                kVar.f89149a.mo37236i(this, zaloView);
            }
        }
    }

    /* renamed from: m2 */
    void m93073m2(C17478k c17478k, boolean z11) {
        int indexOf;
        if (c17478k == null) {
            return;
        }
        ZaloView zaloView = c17478k.f89075b;
        AbstractC32227d.m155417a("ZaloViewManager", "showZaloViewRemoveOld, stackRecord: " + c17478k.f89078e + ", zaloView= " + zaloView + ", zClass= " + c17478k.f89074a);
        if (zaloView == null) {
            InterfaceC27218a interfaceC27218a = this.f89116j;
            if (interfaceC27218a != null && interfaceC27218a.mo35577o() && this.f89116j.mo35585v() != null) {
                this.f89116j.mo35585v().setVisibility(8);
                return;
            } else {
                if (z11) {
                    this.f89110d.remove(c17478k);
                    this.f89111e.remove(c17478k);
                    return;
                }
                return;
            }
        }
        zaloView.f88787w = z11;
        if (ZaloView.InterfaceC17421f.class.isAssignableFrom(c17478k.f89074a) && !z11 && (indexOf = this.f89110d.indexOf(c17478k)) > 0 && indexOf < this.f89110d.size() - 1) {
            m93073m2((C17478k) this.f89110d.get(indexOf - 1), false);
        }
        m93082t1(c17478k, 3);
        if (z11) {
            m93082t1(c17478k, 0);
            this.f89110d.remove(c17478k);
            this.f89111e.remove(c17478k);
            ArrayList arrayList = this.f89113g;
            if (arrayList != null) {
                arrayList.remove(c17478k);
            }
            zaloView.f88787w = false;
            m93006I(zaloView);
            return;
        }
        if (zaloView.f88746M != null) {
            if (ZaloView.f88732u0 && !ZaloView.InterfaceC17418c.class.isAssignableFrom(c17478k.f89074a)) {
                ViewGroup viewGroup = (ViewGroup) zaloView.f88746M.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(zaloView.f88746M);
                    zaloView.mo39029LJ();
                    return;
                }
                return;
            }
            zaloView.f88746M.setVisibility(8);
        }
    }

    /* renamed from: n0 */
    void m93074n0(ZaloView zaloView, boolean z11) {
        ZaloView zaloView2 = this.f89118l;
        if (zaloView2 != null) {
            C17487o0 m92662fJ = zaloView2.m92662fJ();
            if (m92662fJ instanceof C17487o0) {
                m92662fJ.m93074n0(zaloView, true);
            }
        }
        Iterator it = this.f89104E.iterator();
        while (it.hasNext()) {
            k kVar = (k) it.next();
            if (!z11 || kVar.f89150b) {
                kVar.f89149a.mo37237j(this, zaloView);
            }
        }
    }

    /* renamed from: n2 */
    public void m93075n2(j jVar) {
        synchronized (this.f89104E) {
            try {
                int size = this.f89104E.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size) {
                        break;
                    }
                    if (((k) this.f89104E.get(i11)).f89149a == jVar) {
                        this.f89104E.remove(i11);
                        break;
                    }
                    i11++;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: o0 */
    void m93076o0(ZaloView zaloView, View view, Bundle bundle, boolean z11) {
        C17487o0 m92662fJ;
        ZaloView zaloView2 = this.f89118l;
        if (zaloView2 != null && (m92662fJ = zaloView2.m92662fJ()) != null) {
            m92662fJ.m93076o0(zaloView, view, bundle, true);
        }
        Iterator it = this.f89104E.iterator();
        while (it.hasNext()) {
            k kVar = (k) it.next();
            if (!z11 || kVar.f89150b) {
                kVar.f89149a.m93102k(this, zaloView, view, bundle);
            }
        }
    }

    /* renamed from: o2 */
    public void m93077o2(ZaloView zaloView) {
        Message message = new Message();
        message.what = f89098K;
        message.obj = zaloView;
        this.f89105F.sendMessage(message);
    }

    /* renamed from: p0 */
    void m93078p0(ZaloView zaloView, boolean z11) {
        ZaloView zaloView2 = this.f89118l;
        if (zaloView2 != null) {
            C17487o0 m92662fJ = zaloView2.m92662fJ();
            if (m92662fJ instanceof C17487o0) {
                m92662fJ.m93078p0(zaloView, true);
            }
        }
        Iterator it = this.f89104E.iterator();
        while (it.hasNext()) {
            k kVar = (k) it.next();
            if (!z11 || kVar.f89150b) {
                kVar.f89149a.m93103l(this, zaloView);
            }
        }
    }

    /* renamed from: r1 */
    public void mo93079r1(boolean z11) {
        if (this.f89110d.size() > 1) {
            C17478k c17478k = (C17478k) this.f89110d.get(r0.size() - 2);
            if (z11) {
                m93082t1(c17478k, 5);
            } else {
                m93082t1(c17478k, 3);
            }
        }
    }

    /* renamed from: s1 */
    void m93080s1(int i11, boolean z11) {
        InterfaceC1801w interfaceC1801w;
        C17478k c17478k;
        this.f89114h = i11;
        if (this.f89129w) {
            return;
        }
        if (!this.f89110d.isEmpty()) {
            if (z11) {
                int size = this.f89110d.size();
                for (int i12 = 0; i12 < size; i12++) {
                    m93082t1((C17478k) this.f89110d.get(i12), i11);
                }
            } else {
                C17478k c17478k2 = (C17478k) this.f89110d.get(m93009J0());
                m92982v1(c17478k2, i11);
                if (i11 < 4) {
                    if (ZaloView.InterfaceC17421f.class.isAssignableFrom(c17478k2.f89074a)) {
                        int m93009J0 = m93009J0();
                        do {
                            m93009J0--;
                            if (m93009J0 >= 0) {
                                c17478k = (C17478k) this.f89110d.get(m93009J0);
                                c17478k.f89075b = m93028P1(c17478k);
                                m93082t1(c17478k, this.f89114h);
                            } else {
                                c17478k = null;
                            }
                            if (c17478k == null) {
                                break;
                            }
                        } while (ZaloView.InterfaceC17421f.class.isAssignableFrom(c17478k.f89074a));
                    } else if (i11 == 2) {
                        m93023O(m93009J0());
                    }
                }
                if (ZaloView.InterfaceC17423h.class.isAssignableFrom(c17478k2.f89074a) && (interfaceC1801w = c17478k2.f89075b) != null && ((ZaloView.InterfaceC17423h) interfaceC1801w).mo66383c8() && this.f89110d.size() > 1) {
                    m93082t1((C17478k) this.f89110d.get(m93009J0() - 1), this.f89114h);
                }
            }
        }
        if (!this.f89111e.isEmpty()) {
            for (int size2 = this.f89111e.size() - 1; size2 >= 0; size2--) {
                m92982v1((C17478k) this.f89111e.get(size2), i11);
            }
        }
        if (z11) {
            if (!this.f89112f.isEmpty()) {
                for (int size3 = this.f89112f.size() - 1; size3 >= 0; size3--) {
                    m92982v1((C17478k) this.f89112f.get(size3), i11);
                }
            }
            ArrayList arrayList = this.f89113g;
            if (arrayList != null && !arrayList.isEmpty()) {
                for (int size4 = this.f89113g.size() - 1; size4 >= 0; size4--) {
                    m92982v1((C17478k) this.f89113g.get(size4), i11);
                }
            }
        }
    }

    /* renamed from: t0 */
    public void m93081t0() {
        if (AbstractC17482m.f89087a) {
            AbstractC20110a.m104541j(" ZaloView.PAUSED", new Object[0]);
        }
        m92983y0(4);
        m92973q0();
    }

    /* JADX WARN: Code restructure failed: missing block: B:212:0x05bb, code lost:            if (r1 != false) goto L458;     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0407  */
    /* renamed from: t1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void m93082t1(C17478k c17478k, int i11) {
        Object obj;
        boolean z11;
        ViewGroup viewGroup;
        C17487o0 c17487o0;
        Bundle bundle;
        String str;
        ViewGroup viewGroup2;
        ZaloView zaloView;
        InterfaceC17502s interfaceC17502s;
        Bundle bundle2;
        boolean z12;
        boolean z13;
        int i12 = i11;
        if (c17478k == null) {
            return;
        }
        ZaloView zaloView2 = c17478k.f89075b;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("moveToState, stackRecord: zaloView= ");
        sb2.append(c17478k.f89075b);
        sb2.append(", zClass= ");
        sb2.append(c17478k.f89074a);
        sb2.append(", uuid= ");
        sb2.append(c17478k.f89078e);
        sb2.append(", newState= ");
        sb2.append(i12);
        sb2.append(", zv.mState= ");
        if (zaloView2 != 0) {
            obj = Integer.valueOf(zaloView2.f88775p);
        } else {
            obj = "N/A";
        }
        sb2.append(obj);
        AbstractC32227d.m155417a("ZaloViewManager", sb2.toString());
        if (zaloView2 == 0) {
            return;
        }
        if ((!zaloView2.f88786v || zaloView2.f88742I) && i12 > 1) {
            AbstractC32227d.m155417a("ZaloViewManager", "moveToState, ZaloView is has not been added or has been detached, assign state ZaloView.CREATED");
            i12 = 1;
        }
        if ((this.f89116j.isFinishing() || zaloView2.f88787w) && i12 > zaloView2.f88775p) {
            AbstractC32227d.m155417a("ZaloViewManager", "moveToState, removing, don't move state up");
            i12 = zaloView2.f88775p;
        }
        if (zaloView2.f88748O && zaloView2.f88775p < 4 && i12 > 3) {
            AbstractC32227d.m155417a("ZaloViewManager", "moveToState, deferred start");
            i12 = 3;
        }
        int i13 = zaloView2.f88775p;
        if (i13 < i12) {
            if (c17478k.f89080g) {
                AbstractC32227d.m155417a("ZaloViewManager", "moveToState(StackRecord,int)>>> mWaitingPassCodeDismiss == true, return");
                return;
            }
            if (i13 != 0) {
                if (i13 == 1) {
                    str = "elapsedTime= ";
                } else if (i13 == 2 || i13 == 3) {
                    str = "elapsedTime= ";
                    if (i12 > 3) {
                        if (zaloView2.f88746M != null && this.f89110d.contains(c17478k)) {
                            if (zaloView2.f88746M.getParent() == null) {
                                if (zaloView2.f88745L == null) {
                                    zaloView2.f88745L = (ViewGroup) this.f89117k.findViewById(zaloView2.f88739F);
                                }
                                ViewGroup viewGroup3 = zaloView2.f88745L;
                                if (viewGroup3 != null) {
                                    m93089x(viewGroup3, zaloView2.f88746M);
                                }
                            } else {
                                z12 = false;
                                zaloView2.f88746M.setVisibility(0);
                                if (zaloView2.f88774o0) {
                                    long currentTimeMillis = System.currentTimeMillis();
                                    zaloView2.mo39032PJ();
                                    zaloView2.f88774o0 = z12;
                                    AbstractC32227d.m155417a("ZaloViewManager", str + (System.currentTimeMillis() - currentTimeMillis) + "\tonNewIntent\tZaloView= " + zaloView2);
                                }
                                long currentTimeMillis2 = System.currentTimeMillis();
                                zaloView2.m92678nK();
                                AbstractC32227d.m155417a("ZaloViewManager", str + (System.currentTimeMillis() - currentTimeMillis2) + "\tonStart\t\tZaloView= " + zaloView2);
                                z13 = false;
                                m93072m0(zaloView2, false);
                                if (i12 > 4) {
                                    boolean z14 = c17478k.f89079f;
                                    zaloView2.f88787w = z13;
                                    if (zaloView2.f88774o0) {
                                        long currentTimeMillis3 = System.currentTimeMillis();
                                        zaloView2.mo39032PJ();
                                        zaloView2.f88774o0 = z13;
                                        AbstractC32227d.m155417a("ZaloViewManager", str + (System.currentTimeMillis() - currentTimeMillis3) + "\tonNewIntent\tZaloView= " + zaloView2);
                                    }
                                    long currentTimeMillis4 = System.currentTimeMillis();
                                    zaloView2.m92673lK();
                                    AbstractC32227d.m155417a("ZaloViewManager", str + (System.currentTimeMillis() - currentTimeMillis4) + "\tonResume\tZaloView= " + zaloView2);
                                    m93068k0(zaloView2, false);
                                    zaloView2.f88790z = true;
                                    c17478k.f89079f = false;
                                    zaloView2.f88779r = null;
                                    zaloView2.f88777q = null;
                                    c17478k.f89076c = null;
                                    if (z14 && m93012K0() == zaloView2) {
                                        zaloView2.mo49153YJ(true, false);
                                        zaloView2.mo37122XJ(true, false);
                                        zaloView2.f88788x = false;
                                    }
                                }
                            }
                        }
                        z12 = false;
                        if (zaloView2.f88774o0) {
                        }
                        long currentTimeMillis22 = System.currentTimeMillis();
                        zaloView2.m92678nK();
                        AbstractC32227d.m155417a("ZaloViewManager", str + (System.currentTimeMillis() - currentTimeMillis22) + "\tonStart\t\tZaloView= " + zaloView2);
                        z13 = false;
                        m93072m0(zaloView2, false);
                        if (i12 > 4) {
                        }
                    }
                    z13 = false;
                    if (i12 > 4) {
                    }
                } else if (i13 == 4) {
                    str = "elapsedTime= ";
                    z13 = false;
                    if (i12 > 4) {
                    }
                }
            } else {
                zaloView2.f88735B = this.f89116j;
                ZaloView zaloView3 = this.f89118l;
                zaloView2.f88738E = zaloView3;
                if (zaloView3 == null) {
                    c17487o0 = this;
                } else {
                    c17487o0 = zaloView3.f88737D;
                }
                zaloView2.f88736C = c17487o0;
                long currentTimeMillis5 = System.currentTimeMillis();
                InterfaceC27218a interfaceC27218a = this.f89116j;
                if (interfaceC27218a instanceof ZaloActivity) {
                    zaloView2.mo40210zJ((ZaloActivity) interfaceC27218a);
                } else {
                    zaloView2.mo40210zJ(null);
                }
                AbstractC32227d.m155417a("ZaloViewManager", "elapsedTime= " + (System.currentTimeMillis() - currentTimeMillis5) + "\tonAttach\tZaloView= " + zaloView2);
                ZaloViewState zaloViewState = c17478k.f89076c;
                if (zaloViewState != null) {
                    bundle = zaloViewState.f88804x;
                } else {
                    bundle = zaloView2.f88777q;
                }
                zaloView2.f88777q = bundle;
                if (bundle != null) {
                    zaloView2.f88788x = true;
                    bundle.setClassLoader(this.f89116j.getContext().getClassLoader());
                    zaloView2.f88779r = zaloView2.f88777q.getSparseParcelableArray("zaloviewmaganger:view_state");
                    boolean z15 = zaloView2.f88777q.getBoolean("zaloviewmaganger:user_visible_hint", true);
                    zaloView2.f88749P = z15;
                    if (!z15) {
                        zaloView2.f88748O = true;
                        if (i12 > 3) {
                            i12 = 3;
                        }
                    }
                }
                m93067j0(zaloView2, zaloView2.f88777q, false);
                long currentTimeMillis6 = System.currentTimeMillis();
                zaloView2.m92661eK(zaloView2.f88777q);
                long currentTimeMillis7 = System.currentTimeMillis();
                m93061f0(zaloView2, zaloView2.f88777q, false);
                StringBuilder sb3 = new StringBuilder();
                str = "elapsedTime= ";
                sb3.append(str);
                sb3.append(currentTimeMillis7 - currentTimeMillis6);
                sb3.append("\tonCreate\tZaloView= ");
                sb3.append(zaloView2);
                AbstractC32227d.m155417a("ZaloViewManager", sb3.toString());
            }
            if (i12 > 1) {
                if (zaloView2.f88777q == null) {
                    ZaloViewState zaloViewState2 = c17478k.f89076c;
                    if (zaloViewState2 != null) {
                        bundle2 = zaloViewState2.f88804x;
                    } else {
                        bundle2 = null;
                    }
                    zaloView2.f88777q = bundle2;
                    if (bundle2 != null) {
                        zaloView2.f88788x = true;
                        zaloView2.f88779r = bundle2.getSparseParcelableArray("zaloviewmaganger:view_state");
                        boolean z16 = zaloView2.f88777q.getBoolean("zaloviewmaganger:user_visible_hint", true);
                        zaloView2.f88749P = z16;
                        if (!z16) {
                            zaloView2.f88748O = true;
                            if (i12 > 3) {
                                i12 = 3;
                            }
                        }
                    }
                }
                if (zaloView2.f88739F != 0 && this.f89117k == null) {
                    CoreUtility.m93148a().mo100074a(new Exception("NPE - mContainer null. zaloview= " + zaloView2 + ", tag= ZaloView, in chat head mode: " + this.f89116j.mo35576n3() + ", mState= " + zaloView2.f88775p + ", newState= " + i12 + ", topZv= " + m93012K0() + ", is finishing= " + this.f89116j.isFinishing()));
                }
                View view = zaloView2.f88746M;
                int i14 = zaloView2.f88739F;
                if (i14 != 0 && (interfaceC17502s = this.f89117k) != null) {
                    viewGroup2 = (ViewGroup) interfaceC17502s.findViewById(i14);
                } else {
                    viewGroup2 = null;
                }
                if (view == null) {
                    long currentTimeMillis8 = System.currentTimeMillis();
                    zaloView2.m92663fK(zaloView2.mo79283UI(zaloView2.f88777q), viewGroup2, zaloView2.f88777q);
                    View view2 = zaloView2.f88746M;
                    AbstractC32227d.m155417a("ZaloViewManager", str + (System.currentTimeMillis() - currentTimeMillis8) + "\tperformCreateView\tZaloView= " + zaloView2);
                    if (view2 != null) {
                        zaloView2.f88747N = view2;
                        view2 = SlideAnimationLayout.m92610g(view2, this);
                        SlideAnimationLayout slideAnimationLayout = (SlideAnimationLayout) view2;
                        slideAnimationLayout.setOwnerZaloViewName(zaloView2.toString());
                        if (zaloView2 instanceof SlideAnimationLayout.InterfaceC17409d) {
                            slideAnimationLayout.setSlidingListener((SlideAnimationLayout.InterfaceC17409d) zaloView2);
                        }
                    } else {
                        zaloView2.f88747N = null;
                    }
                    zaloView2.f88746M = view2;
                    if (viewGroup2 != null && view2 != null) {
                        int indexOf = this.f89110d.indexOf(c17478k);
                        if (this.f89110d.contains(c17478k) && indexOf >= 0 && indexOf < this.f89110d.size() - 1) {
                            C17478k c17478k2 = (C17478k) this.f89110d.get(indexOf + 1);
                            if ((zaloView2 instanceof ZaloView.InterfaceC17426k) && (zaloView = c17478k2.f89075b) != null && zaloView.f88787w) {
                                m93089x(viewGroup2, view2);
                                zaloView2.mo59563AJ();
                            } else {
                                ZaloView zaloView4 = c17478k2.f89075b;
                                if ((zaloView4 != null && zaloView4.f88787w) || ZaloView.InterfaceC17421f.class.isAssignableFrom(c17478k2.f89074a)) {
                                    viewGroup2.addView(view2, 0);
                                    zaloView2.mo59563AJ();
                                } else {
                                    viewGroup2.addView(view2, 0);
                                    zaloView2.mo59563AJ();
                                }
                            }
                        } else {
                            m93089x(viewGroup2, view2);
                            zaloView2.mo59563AJ();
                        }
                    }
                    if (zaloView2.f88746M != null) {
                        long currentTimeMillis9 = System.currentTimeMillis();
                        zaloView2.mo37125ZJ(zaloView2.f88746M, zaloView2.f88777q);
                        AbstractC32227d.m155417a("ZaloViewManager", str + (System.currentTimeMillis() - currentTimeMillis9) + "\tonViewCreated\tZaloView= " + zaloView2);
                        m93076o0(zaloView2, zaloView2.f88746M, zaloView2.f88777q, false);
                    }
                } else {
                    if (view.getVisibility() != 0) {
                        view.setVisibility(0);
                    }
                    ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                    if (viewGroup4 != null) {
                        if (!viewGroup4.equals(viewGroup2)) {
                            viewGroup4.removeView(view);
                            if (viewGroup2 != null) {
                                int indexOf2 = this.f89110d.indexOf(c17478k);
                                if (this.f89110d.contains(c17478k) && indexOf2 >= 0 && indexOf2 < this.f89110d.size() - 1) {
                                    viewGroup2.addView(view, 0);
                                } else {
                                    m93089x(viewGroup2, view);
                                }
                                zaloView2.mo59563AJ();
                            }
                        }
                    } else if (viewGroup2 != null) {
                        int indexOf3 = this.f89110d.indexOf(c17478k);
                        if (this.f89110d.contains(c17478k) && indexOf3 >= 0 && indexOf3 < this.f89110d.size() - 1) {
                            viewGroup2.addView(view, 0);
                        } else {
                            m93089x(viewGroup2, view);
                        }
                        zaloView2.mo59563AJ();
                    }
                }
                zaloView2.f88745L = viewGroup2;
                long currentTimeMillis10 = System.currentTimeMillis();
                zaloView2.mo37493TJ();
                AbstractC32227d.m155417a("ZaloViewManager", str + (System.currentTimeMillis() - currentTimeMillis10) + "\tonSetupActionBar\tZaloView= " + zaloView2);
                long currentTimeMillis11 = System.currentTimeMillis();
                zaloView2.m92658cK(zaloView2.f88777q);
                AbstractC32227d.m155417a("ZaloViewManager", str + (System.currentTimeMillis() - currentTimeMillis11) + "\tonActivityCreated\tZaloView= " + zaloView2);
                m93059e0(zaloView2, zaloView2.f88777q, false);
                if (zaloView2.f88746M != null) {
                    zaloView2.m92694yK(zaloView2.f88777q);
                }
                zaloView2.f88777q = null;
                c17478k.f89076c = null;
                c17478k.f89080g = false;
            }
            if (i12 > 3) {
            }
            z13 = false;
            if (i12 > 4) {
            }
        } else if (i13 > i12) {
            if (i13 != 1) {
                if (i13 != 2 && i13 != 3) {
                    if (i13 != 4) {
                        if (i13 == 5) {
                            if (i12 < 5) {
                                long currentTimeMillis12 = System.currentTimeMillis();
                                zaloView2.m92671kK(c17478k.f89081h);
                                AbstractC32227d.m155417a("ZaloViewManager", "elapsedTime= " + (System.currentTimeMillis() - currentTimeMillis12) + "\tonPause\t\tZaloView= " + zaloView2);
                                m93065i0(zaloView2, false);
                                zaloView2.f88790z = false;
                                if (c17478k.f89081h) {
                                    ZaloViewState zaloViewState3 = new ZaloViewState(zaloView2);
                                    c17478k.f89076c = zaloViewState3;
                                    zaloViewState3.f88804x = m92938T1(zaloView2);
                                }
                            }
                        }
                    }
                    if (i12 < 4) {
                        long currentTimeMillis13 = System.currentTimeMillis();
                        zaloView2.m92680oK();
                        AbstractC32227d.m155417a("ZaloViewManager", "elapsedTime= " + (System.currentTimeMillis() - currentTimeMillis13) + "\tonStop\t\tZaloView= " + zaloView2);
                        m93074n0(zaloView2, false);
                    }
                }
                if (i12 < 2) {
                    if (zaloView2.f88746M != null && !this.f89116j.isFinishing() && zaloView2.f88779r == null) {
                        m93040V1(zaloView2);
                    }
                    long currentTimeMillis14 = System.currentTimeMillis();
                    zaloView2.m92667hK();
                    AbstractC32227d.m155417a("ZaloViewManager", "elapsedTime= " + (System.currentTimeMillis() - currentTimeMillis14) + "\tonDestroyView\tZaloView= " + zaloView2);
                    m93078p0(zaloView2, false);
                    View view3 = zaloView2.f88746M;
                    if (view3 != null && (viewGroup = (ViewGroup) view3.getParent()) != null) {
                        viewGroup.removeView(view3);
                        zaloView2.mo39029LJ();
                    }
                    zaloView2.f88746M = null;
                    zaloView2.f88745L = null;
                }
            }
            if (i12 < 1) {
                if (this.f89118l != null) {
                    z11 = this.f89101B.m93123Q();
                } else {
                    Object obj2 = this.f89116j;
                    if (obj2 instanceof Activity) {
                        z11 = !((Activity) obj2).isChangingConfigurations();
                    }
                    this.f89101B.m93120M(zaloView2);
                    long currentTimeMillis15 = System.currentTimeMillis();
                    zaloView2.m92665gK();
                    AbstractC32227d.m155417a("ZaloViewManager", "elapsedTime= " + (System.currentTimeMillis() - currentTimeMillis15) + "\tonDestroy\tZaloView= " + zaloView2);
                    m93063g0(zaloView2, false);
                    zaloView2.f88786v = false;
                    zaloView2.f88742I = true;
                    long currentTimeMillis16 = System.currentTimeMillis();
                    zaloView2.mo40200KJ();
                    AbstractC32227d.m155417a("ZaloViewManager", "elapsedTime= " + (System.currentTimeMillis() - currentTimeMillis16) + "\tonDetach\tZaloView= " + zaloView2);
                    m93064h0(zaloView2, false);
                }
            }
        } else if (i13 == i12) {
            AbstractC32227d.m155417a("ZaloViewManager", "moveToState, Same state= " + zaloView2.f88775p);
            if (i12 == 5 && zaloView2.f88774o0) {
                zaloView2.mo39032PJ();
                zaloView2.f88774o0 = false;
            }
        }
        zaloView2.f88775p = i12;
        AbstractC32227d.m155417a("ZaloViewManager", "moveToState, END zv.mState= " + zaloView2.f88775p);
    }

    /* renamed from: u0 */
    public void m93083u0() {
        m93080s1(2, true);
    }

    /* renamed from: u1 */
    void m93084u1(ZaloView zaloView, int i11) {
        if (zaloView != null) {
            C17478k c17478k = null;
            for (int size = this.f89111e.size() - 1; size >= 0; size--) {
                c17478k = (C17478k) this.f89111e.get(size);
                if (c17478k.f89078e.equals(zaloView.f88781s)) {
                    break;
                }
            }
            m93082t1(c17478k, i11);
        }
    }

    /* renamed from: v0 */
    public void m93085v0(int i11, String[] strArr, int[] iArr) {
        if (!this.f89110d.isEmpty()) {
            int m93009J0 = m93009J0();
            do {
                ZaloView zaloView = ((C17478k) this.f89110d.get(m93009J0)).f89075b;
                if (zaloView != null && !zaloView.f88787w) {
                    zaloView.onRequestPermissionsResult(i11, strArr, iArr);
                }
                m93009J0--;
                if (!(zaloView instanceof ZaloView.InterfaceC17421f)) {
                    break;
                }
            } while (m93009J0 >= 0);
        }
        if (!this.f89111e.isEmpty()) {
            Iterator it = this.f89111e.iterator();
            while (it.hasNext()) {
                ZaloView zaloView2 = ((C17478k) it.next()).f89075b;
                if (zaloView2 != null && !zaloView2.m92681pJ()) {
                    zaloView2.onRequestPermissionsResult(i11, strArr, iArr);
                }
            }
        }
        List list = this.f89131y;
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                C17503s0.a aVar = ((C17503s0) it2.next()).f89195c;
                if (aVar != null) {
                    aVar.onRequestPermissionsResult(i11, strArr, iArr);
                }
            }
        }
    }

    /* renamed from: w */
    public void m93086w(View view, int i11, C17503s0.a aVar) {
        if (view == null) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        if (this.f89130x == null) {
            this.f89130x = new FrameLayout(this.f89116j.getContext());
        }
        ViewGroup viewGroup2 = (ViewGroup) this.f89116j.findViewById(R.id.content);
        ViewGroup viewGroup3 = (ViewGroup) this.f89130x.getParent();
        if (viewGroup3 != null && viewGroup3 != viewGroup2) {
            viewGroup3.removeView(this.f89130x);
            viewGroup3 = null;
        }
        if (viewGroup3 == null) {
            viewGroup2.addView(this.f89130x, new FrameLayout.LayoutParams(-1, -1));
        }
        int i12 = 0;
        this.f89130x.setVisibility(0);
        int i13 = 0;
        while (i12 < this.f89131y.size() && ((C17503s0) this.f89131y.get(i12)).f89193a <= i11) {
            i13 = i12 + 1;
            i12 = i13;
        }
        C17503s0 c17503s0 = new C17503s0(i11, view, aVar);
        FrameLayout frameLayout = this.f89130x;
        if (frameLayout != null) {
            if (i13 < frameLayout.getChildCount()) {
                this.f89130x.addView(view, i13);
            } else {
                this.f89130x.addView(view);
            }
        }
        if (i13 < this.f89131y.size()) {
            this.f89131y.add(i13, c17503s0);
        } else {
            this.f89131y.add(c17503s0);
        }
    }

    /* renamed from: w0 */
    public void m93087w0() {
        if (AbstractC17482m.f89087a) {
            AbstractC20110a.m104541j(" ZaloView.RESUMED", new Object[0]);
        }
        m92983y0(5);
        m92976r0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: w1 */
    public void m93088w1(int i11, int i12, Intent intent) {
        boolean z11;
        if (this.f89110d.size() > 0) {
            int size = this.f89110d.size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                C17478k c17478k = (C17478k) this.f89110d.get(size);
                ZaloView zaloView = c17478k.f89075b;
                if (zaloView != 0) {
                    if (ZaloView.InterfaceC17423h.class.isAssignableFrom(c17478k.f89074a) && ((ZaloView.InterfaceC17423h) zaloView).mo66383c8()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!zaloView.m92681pJ() && !z11) {
                        zaloView.onActivityResult(i11, i12, intent);
                        break;
                    }
                }
                size--;
            }
        }
        if (this.f89111e.size() > 0) {
            for (int size2 = this.f89111e.size() - 1; size2 >= 0; size2--) {
                ZaloView zaloView2 = ((C17478k) this.f89111e.get(size2)).f89075b;
                if (zaloView2 != null && !zaloView2.m92681pJ()) {
                    zaloView2.onActivityResult(i11, i12, intent);
                }
            }
        }
    }

    /* renamed from: x */
    void m93089x(ViewGroup viewGroup, View view) {
        int indexOfChild;
        if (viewGroup != null && view != null) {
            viewGroup.addView(view);
            int childCount = viewGroup.getChildCount();
            FrameLayout frameLayout = this.f89130x;
            if (frameLayout != null && (indexOfChild = viewGroup.indexOfChild(frameLayout)) >= 0 && indexOfChild < childCount - 1) {
                this.f89130x.bringToFront();
            }
        }
    }

    /* renamed from: x0 */
    public void m93090x0() {
        if (AbstractC17482m.f89087a) {
            AbstractC20110a.m104541j(" ZaloView.STARTED", new Object[0]);
        }
        m92983y0(4);
    }

    /* renamed from: x1 */
    public void m93091x1(Configuration configuration) {
        if (!this.f89110d.isEmpty()) {
            int m93009J0 = m93009J0();
            do {
                ZaloView zaloView = ((C17478k) this.f89110d.get(m93009J0)).f89075b;
                if (zaloView != null && !zaloView.f88787w) {
                    zaloView.m92660dK(configuration);
                }
                m93009J0--;
                if (!(zaloView instanceof ZaloView.InterfaceC17421f)) {
                    break;
                }
            } while (m93009J0 >= 0);
        }
        if (!this.f89111e.isEmpty()) {
            Iterator it = this.f89111e.iterator();
            while (it.hasNext()) {
                ZaloView zaloView2 = ((C17478k) it.next()).f89075b;
                if (zaloView2 != null && !zaloView2.m92681pJ()) {
                    zaloView2.m92660dK(configuration);
                }
            }
        }
    }

    /* renamed from: y */
    public void m93092y(l lVar) {
        this.f89120n.post(new Runnable() { // from class: com.zing.zalo.zview.x

            /* renamed from: q */
            public final /* synthetic */ C17487o0.l f89222q;

            public /* synthetic */ RunnableC17510x(C17487o0.l lVar2) {
                r2 = lVar2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C17487o0.this.m92941a1(r2);
            }
        });
    }

    /* renamed from: y1 */
    public boolean m93093y1(int i11, KeyEvent keyEvent) {
        if (this.f89110d.isEmpty()) {
            return false;
        }
        ArrayList arrayList = this.f89110d;
        ZaloView zaloView = ((C17478k) arrayList.get(arrayList.size() - 1)).f89075b;
        if (zaloView == null || !zaloView.mo39030NJ(i11, keyEvent)) {
            return false;
        }
        return true;
    }

    /* renamed from: z */
    public void m93094z(boolean z11) {
        m92984A(z11, 0);
    }

    /* renamed from: z0 */
    public void m93095z0() {
        if (AbstractC17482m.f89087a) {
            AbstractC20110a.m104541j(" ZaloView.STOPPED", new Object[0]);
        }
        m92983y0(3);
        m92978s0();
    }

    /* renamed from: z1 */
    public boolean m93096z1(int i11, KeyEvent keyEvent) {
        if (!this.f89110d.isEmpty()) {
            ArrayList arrayList = this.f89110d;
            ZaloView zaloView = ((C17478k) arrayList.get(arrayList.size() - 1)).f89075b;
            if (zaloView != null && zaloView.onKeyUp(i11, keyEvent)) {
                return true;
            }
        }
        if (i11 == 4 && mo92703Q0()) {
            return true;
        }
        return false;
    }
}
