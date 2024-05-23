package androidx.fragment.app;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.Transformation;
import androidx.activity.AbstractC1011e;
import androidx.activity.InterfaceC1012f;
import androidx.activity.OnBackPressedDispatcher;
import androidx.core.util.AbstractC1480b;
import androidx.core.util.C1481c;
import androidx.core.view.ViewTreeObserverOnPreDrawListenerC1563j0;
import androidx.fragment.app.AbstractC1733g;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1785o;
import androidx.lifecycle.C1808z0;
import androidx.lifecycle.InterfaceC1756a1;
import androidx.lifecycle.InterfaceC1801w;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p664y.AbstractC30228a;
import p665y0.C30240b;

/* renamed from: androidx.fragment.app.h */
/* loaded from: classes2.dex */
public final class LayoutInflaterFactory2C1734h extends AbstractC1733g implements LayoutInflater.Factory2 {

    /* renamed from: W */
    static boolean f7048W = false;

    /* renamed from: X */
    static final Interpolator f7049X = new DecelerateInterpolator(2.5f);

    /* renamed from: Y */
    static final Interpolator f7050Y = new DecelerateInterpolator(1.5f);

    /* renamed from: A */
    ArrayList f7051A;

    /* renamed from: B */
    ArrayList f7052B;

    /* renamed from: C */
    ArrayList f7053C;

    /* renamed from: F */
    AbstractC1732f f7056F;

    /* renamed from: G */
    AbstractC1729c f7057G;

    /* renamed from: H */
    Fragment f7058H;

    /* renamed from: I */
    Fragment f7059I;

    /* renamed from: J */
    boolean f7060J;

    /* renamed from: K */
    boolean f7061K;

    /* renamed from: L */
    boolean f7062L;

    /* renamed from: M */
    boolean f7063M;

    /* renamed from: N */
    boolean f7064N;

    /* renamed from: O */
    ArrayList f7065O;

    /* renamed from: P */
    ArrayList f7066P;

    /* renamed from: Q */
    ArrayList f7067Q;

    /* renamed from: T */
    ArrayList f7070T;

    /* renamed from: U */
    private C1735i f7071U;

    /* renamed from: r */
    ArrayList f7073r;

    /* renamed from: s */
    boolean f7074s;

    /* renamed from: w */
    ArrayList f7078w;

    /* renamed from: x */
    ArrayList f7079x;

    /* renamed from: y */
    private OnBackPressedDispatcher f7080y;

    /* renamed from: t */
    int f7075t = 0;

    /* renamed from: u */
    final ArrayList f7076u = new ArrayList();

    /* renamed from: v */
    final HashMap f7077v = new HashMap();

    /* renamed from: z */
    private final AbstractC1011e f7081z = new a(false);

    /* renamed from: D */
    private final CopyOnWriteArrayList f7054D = new CopyOnWriteArrayList();

    /* renamed from: E */
    int f7055E = 0;

    /* renamed from: R */
    Bundle f7068R = null;

    /* renamed from: S */
    SparseArray f7069S = null;

    /* renamed from: V */
    Runnable f7072V = new b();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.h$a */
    /* loaded from: classes2.dex */
    public class a extends AbstractC1011e {
        a(boolean z11) {
            super(z11);
        }

        @Override // androidx.activity.AbstractC1011e
        /* renamed from: b */
        public void mo4662b() {
            LayoutInflaterFactory2C1734h.this.m9048D0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.h$b */
    /* loaded from: classes2.dex */
    public class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LayoutInflaterFactory2C1734h.this.m9109n0();
        }
    }

    /* renamed from: androidx.fragment.app.h$c */
    /* loaded from: classes2.dex */
    public class c implements Animation.AnimationListener {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f7084a;

        /* renamed from: b */
        final /* synthetic */ Fragment f7085b;

        /* renamed from: androidx.fragment.app.h$c$a */
        /* loaded from: classes2.dex */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (c.this.f7085b.m8861k() != null) {
                    c.this.f7085b.m8838b1(null);
                    c cVar = c.this;
                    LayoutInflaterFactory2C1734h layoutInflaterFactory2C1734h = LayoutInflaterFactory2C1734h.this;
                    Fragment fragment = cVar.f7085b;
                    layoutInflaterFactory2C1734h.m9076T0(fragment, fragment.m8795F(), 0, 0, false);
                }
            }
        }

        c(ViewGroup viewGroup, Fragment fragment) {
            this.f7084a = viewGroup;
            this.f7085b = fragment;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f7084a.post(new a());
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: androidx.fragment.app.h$d */
    /* loaded from: classes2.dex */
    public class d extends AnimatorListenerAdapter {

        /* renamed from: p */
        final /* synthetic */ ViewGroup f7088p;

        /* renamed from: q */
        final /* synthetic */ View f7089q;

        /* renamed from: r */
        final /* synthetic */ Fragment f7090r;

        d(ViewGroup viewGroup, View view, Fragment fragment) {
            this.f7088p = viewGroup;
            this.f7089q = view;
            this.f7090r = fragment;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f7088p.endViewTransition(this.f7089q);
            Animator m8864l = this.f7090r.m8864l();
            this.f7090r.m8840c1(null);
            if (m8864l != null && this.f7088p.indexOfChild(this.f7089q) < 0) {
                LayoutInflaterFactory2C1734h layoutInflaterFactory2C1734h = LayoutInflaterFactory2C1734h.this;
                Fragment fragment = this.f7090r;
                layoutInflaterFactory2C1734h.m9076T0(fragment, fragment.m8795F(), 0, 0, false);
            }
        }
    }

    /* renamed from: androidx.fragment.app.h$e */
    /* loaded from: classes2.dex */
    public class e extends AnimatorListenerAdapter {

        /* renamed from: p */
        final /* synthetic */ ViewGroup f7092p;

        /* renamed from: q */
        final /* synthetic */ View f7093q;

        /* renamed from: r */
        final /* synthetic */ Fragment f7094r;

        e(ViewGroup viewGroup, View view, Fragment fragment) {
            this.f7092p = viewGroup;
            this.f7093q = view;
            this.f7094r = fragment;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f7092p.endViewTransition(this.f7093q);
            animator.removeListener(this);
            Fragment fragment = this.f7094r;
            View view = fragment.f6938V;
            if (view != null && fragment.f6930N) {
                view.setVisibility(8);
            }
        }
    }

    /* renamed from: androidx.fragment.app.h$f */
    /* loaded from: classes2.dex */
    public class f extends C1731e {
        f() {
        }

        @Override // androidx.fragment.app.C1731e
        /* renamed from: a */
        public Fragment mo8986a(ClassLoader classLoader, String str) {
            AbstractC1732f abstractC1732f = LayoutInflaterFactory2C1734h.this.f7056F;
            return abstractC1732f.m8957a(abstractC1732f.m8988e(), str, null);
        }
    }

    /* renamed from: androidx.fragment.app.h$i */
    /* loaded from: classes2.dex */
    public static final class i {

        /* renamed from: a */
        final AbstractC1733g.a f7104a;

        /* renamed from: b */
        final boolean f7105b;

        i(AbstractC1733g.a aVar, boolean z11) {
            this.f7104a = aVar;
            this.f7105b = z11;
        }
    }

    /* renamed from: androidx.fragment.app.h$j */
    /* loaded from: classes2.dex */
    public static class j {

        /* renamed from: a */
        public static final int[] f7106a = {R.attr.name, R.attr.id, R.attr.tag};
    }

    /* renamed from: androidx.fragment.app.h$k */
    /* loaded from: classes2.dex */
    public interface k {
        /* renamed from: a */
        boolean mo8933a(ArrayList arrayList, ArrayList arrayList2);
    }

    /* renamed from: androidx.fragment.app.h$l */
    /* loaded from: classes2.dex */
    private class l implements k {

        /* renamed from: a */
        final String f7107a;

        /* renamed from: b */
        final int f7108b;

        /* renamed from: c */
        final int f7109c;

        l(String str, int i11, int i12) {
            this.f7107a = str;
            this.f7108b = i11;
            this.f7109c = i12;
        }

        @Override // androidx.fragment.app.LayoutInflaterFactory2C1734h.k
        /* renamed from: a */
        public boolean mo8933a(ArrayList arrayList, ArrayList arrayList2) {
            Fragment fragment = LayoutInflaterFactory2C1734h.this.f7059I;
            if (fragment != null && this.f7108b < 0 && this.f7107a == null && fragment.m8866m().mo8997h()) {
                return false;
            }
            return LayoutInflaterFactory2C1734h.this.m9083X0(arrayList, arrayList2, this.f7107a, this.f7108b, this.f7109c);
        }
    }

    /* renamed from: androidx.fragment.app.h$m */
    /* loaded from: classes2.dex */
    public static class m implements Fragment.InterfaceC1721e {

        /* renamed from: a */
        final boolean f7111a;

        /* renamed from: b */
        final C1727a f7112b;

        /* renamed from: c */
        private int f7113c;

        m(C1727a c1727a, boolean z11) {
            this.f7111a = z11;
            this.f7112b = c1727a;
        }

        @Override // androidx.fragment.app.Fragment.InterfaceC1721e
        /* renamed from: a */
        public void mo8899a() {
            this.f7113c++;
        }

        @Override // androidx.fragment.app.Fragment.InterfaceC1721e
        /* renamed from: b */
        public void mo8900b() {
            int i11 = this.f7113c - 1;
            this.f7113c = i11;
            if (i11 != 0) {
                return;
            }
            this.f7112b.f7024s.m9101j1();
        }

        /* renamed from: c */
        public void m9126c() {
            C1727a c1727a = this.f7112b;
            c1727a.f7024s.m9120x(c1727a, this.f7111a, false, false);
        }

        /* renamed from: d */
        public void m9127d() {
            boolean z11;
            if (this.f7113c > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            LayoutInflaterFactory2C1734h layoutInflaterFactory2C1734h = this.f7112b.f7024s;
            int size = layoutInflaterFactory2C1734h.f7076u.size();
            for (int i11 = 0; i11 < size; i11++) {
                Fragment fragment = (Fragment) layoutInflaterFactory2C1734h.f7076u.get(i11);
                fragment.m8854h1(null);
                if (z11 && fragment.m8809N()) {
                    fragment.m8863k1();
                }
            }
            C1727a c1727a = this.f7112b;
            c1727a.f7024s.m9120x(c1727a, this.f7111a, !z11, true);
        }

        /* renamed from: e */
        public boolean m9128e() {
            return this.f7113c == 0;
        }
    }

    /* renamed from: G0 */
    private boolean m9015G0(Fragment fragment) {
        if ((fragment.f6934R && fragment.f6935S) || fragment.f6925I.m9118u()) {
            return true;
        }
        return false;
    }

    /* renamed from: M0 */
    static g m9016M0(float f11, float f12) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(f11, f12);
        alphaAnimation.setInterpolator(f7050Y);
        alphaAnimation.setDuration(220L);
        return new g(alphaAnimation);
    }

    /* renamed from: O0 */
    static g m9017O0(float f11, float f12, float f13, float f14) {
        AnimationSet animationSet = new AnimationSet(false);
        ScaleAnimation scaleAnimation = new ScaleAnimation(f11, f12, f11, f12, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setInterpolator(f7049X);
        scaleAnimation.setDuration(220L);
        animationSet.addAnimation(scaleAnimation);
        AlphaAnimation alphaAnimation = new AlphaAnimation(f13, f14);
        alphaAnimation.setInterpolator(f7050Y);
        alphaAnimation.setDuration(220L);
        animationSet.addAnimation(alphaAnimation);
        return new g(animationSet);
    }

    /* renamed from: P0 */
    private void m9018P0(C30240b c30240b) {
        int size = c30240b.size();
        for (int i11 = 0; i11 < size; i11++) {
            Fragment fragment = (Fragment) c30240b.m149117r(i11);
            if (!fragment.f6965z) {
                View m8832Y0 = fragment.m8832Y0();
                fragment.f6946d0 = m8832Y0.getAlpha();
                m8832Y0.setAlpha(0.0f);
            }
        }
    }

    /* renamed from: W0 */
    private boolean m9019W0(String str, int i11, int i12) {
        m9109n0();
        m9027l0(true);
        Fragment fragment = this.f7059I;
        if (fragment != null && i11 < 0 && str == null && fragment.m8866m().mo8997h()) {
            return true;
        }
        boolean m9083X0 = m9083X0(this.f7065O, this.f7066P, str, i11, i12);
        if (m9083X0) {
            this.f7074s = true;
            try {
                m9022b1(this.f7065O, this.f7066P);
            } finally {
                m9039w();
            }
        }
        m9034r1();
        m9099i0();
        m9035t();
        return m9083X0;
    }

    /* renamed from: Y0 */
    private int m9020Y0(ArrayList arrayList, ArrayList arrayList2, int i11, int i12, C30240b c30240b) {
        int i13 = i12;
        for (int i14 = i12 - 1; i14 >= i11; i14--) {
            C1727a c1727a = (C1727a) arrayList.get(i14);
            boolean booleanValue = ((Boolean) arrayList2.get(i14)).booleanValue();
            if (c1727a.m8948s() && !c1727a.m8947q(arrayList, i14 + 1, i12)) {
                if (this.f7070T == null) {
                    this.f7070T = new ArrayList();
                }
                m mVar = new m(c1727a, booleanValue);
                this.f7070T.add(mVar);
                c1727a.m8950u(mVar);
                if (booleanValue) {
                    c1727a.m8942l();
                } else {
                    c1727a.m8943m(false);
                }
                i13--;
                if (i14 != i13) {
                    arrayList.remove(i14);
                    arrayList.add(i13, c1727a);
                }
                m9026l(c30240b);
            }
        }
        return i13;
    }

    /* renamed from: Z */
    private void m9021Z(Fragment fragment) {
        if (fragment != null && this.f7077v.get(fragment.f6959t) == fragment) {
            fragment.m8816Q0();
        }
    }

    /* renamed from: b1 */
    private void m9022b1(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList != null && !arrayList.isEmpty()) {
            if (arrayList2 != null && arrayList.size() == arrayList2.size()) {
                m9032q0(arrayList, arrayList2);
                int size = arrayList.size();
                int i11 = 0;
                int i12 = 0;
                while (i11 < size) {
                    if (!((C1727a) arrayList.get(i11)).f7137q) {
                        if (i12 != i11) {
                            m9029p0(arrayList, arrayList2, i12, i11);
                        }
                        i12 = i11 + 1;
                        if (((Boolean) arrayList2.get(i11)).booleanValue()) {
                            while (i12 < size && ((Boolean) arrayList2.get(i12)).booleanValue() && !((C1727a) arrayList.get(i12)).f7137q) {
                                i12++;
                            }
                        }
                        m9029p0(arrayList, arrayList2, i11, i12);
                        i11 = i12 - 1;
                    }
                    i11++;
                }
                if (i12 != size) {
                    m9029p0(arrayList, arrayList2, i12, size);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error with the back stack records");
        }
    }

    /* renamed from: f1 */
    public static int m9023f1(int i11) {
        if (i11 == 4097) {
            return 8194;
        }
        if (i11 != 4099) {
            return i11 != 8194 ? 0 : 4097;
        }
        return 4099;
    }

    /* renamed from: g0 */
    private void m9024g0(int i11) {
        try {
            this.f7074s = true;
            m9072R0(i11, false);
            this.f7074s = false;
            m9109n0();
        } catch (Throwable th2) {
            this.f7074s = false;
            throw th2;
        }
    }

    /* renamed from: j0 */
    private void m9025j0() {
        for (Fragment fragment : this.f7077v.values()) {
            if (fragment != null) {
                if (fragment.m8861k() != null) {
                    int m8795F = fragment.m8795F();
                    View m8861k = fragment.m8861k();
                    Animation animation = m8861k.getAnimation();
                    if (animation != null) {
                        animation.cancel();
                        m8861k.clearAnimation();
                    }
                    fragment.m8838b1(null);
                    m9076T0(fragment, m8795F, 0, 0, false);
                } else if (fragment.m8864l() != null) {
                    fragment.m8864l().end();
                }
            }
        }
    }

    /* renamed from: l */
    private void m9026l(C30240b c30240b) {
        int i11 = this.f7055E;
        if (i11 < 1) {
            return;
        }
        int min = Math.min(i11, 3);
        int size = this.f7076u.size();
        for (int i12 = 0; i12 < size; i12++) {
            Fragment fragment = (Fragment) this.f7076u.get(i12);
            if (fragment.f6955p < min) {
                m9076T0(fragment, min, fragment.m8884v(), fragment.m8886w(), false);
                if (fragment.f6938V != null && !fragment.f6930N && fragment.f6944b0) {
                    c30240b.add(fragment);
                }
            }
        }
    }

    /* renamed from: l0 */
    private void m9027l0(boolean z11) {
        if (!this.f7074s) {
            if (this.f7056F != null) {
                if (Looper.myLooper() == this.f7056F.m8989f().getLooper()) {
                    if (!z11) {
                        m9038v();
                    }
                    if (this.f7065O == null) {
                        this.f7065O = new ArrayList();
                        this.f7066P = new ArrayList();
                    }
                    this.f7074s = true;
                    try {
                        m9032q0(null, null);
                        return;
                    } finally {
                        this.f7074s = false;
                    }
                }
                throw new IllegalStateException("Must be called from main thread of fragment host");
            }
            throw new IllegalStateException("Fragment host has been destroyed");
        }
        throw new IllegalStateException("FragmentManager is already executing transactions");
    }

    /* renamed from: o0 */
    private static void m9028o0(ArrayList arrayList, ArrayList arrayList2, int i11, int i12) {
        while (i11 < i12) {
            C1727a c1727a = (C1727a) arrayList.get(i11);
            boolean z11 = true;
            if (((Boolean) arrayList2.get(i11)).booleanValue()) {
                c1727a.m8938h(-1);
                if (i11 != i12 - 1) {
                    z11 = false;
                }
                c1727a.m8943m(z11);
            } else {
                c1727a.m8938h(1);
                c1727a.m8942l();
            }
            i11++;
        }
    }

    /* renamed from: p0 */
    private void m9029p0(ArrayList arrayList, ArrayList arrayList2, int i11, int i12) {
        int i13;
        int i14;
        int i15 = i11;
        boolean z11 = ((C1727a) arrayList.get(i15)).f7137q;
        ArrayList arrayList3 = this.f7067Q;
        if (arrayList3 == null) {
            this.f7067Q = new ArrayList();
        } else {
            arrayList3.clear();
        }
        this.f7067Q.addAll(this.f7076u);
        Fragment m9044B0 = m9044B0();
        boolean z12 = false;
        for (int i16 = i15; i16 < i12; i16++) {
            C1727a c1727a = (C1727a) arrayList.get(i16);
            if (!((Boolean) arrayList2.get(i16)).booleanValue()) {
                m9044B0 = c1727a.m8944n(this.f7067Q, m9044B0);
            } else {
                m9044B0 = c1727a.m8951v(this.f7067Q, m9044B0);
            }
            if (!z12 && !c1727a.f7128h) {
                z12 = false;
            } else {
                z12 = true;
            }
        }
        this.f7067Q.clear();
        if (!z11) {
            AbstractC1737k.m9142B(this, arrayList, arrayList2, i11, i12, false);
        }
        m9028o0(arrayList, arrayList2, i11, i12);
        if (z11) {
            C30240b c30240b = new C30240b();
            m9026l(c30240b);
            int m9020Y0 = m9020Y0(arrayList, arrayList2, i11, i12, c30240b);
            m9018P0(c30240b);
            i13 = m9020Y0;
        } else {
            i13 = i12;
        }
        if (i13 != i15 && z11) {
            AbstractC1737k.m9142B(this, arrayList, arrayList2, i11, i13, true);
            m9072R0(this.f7055E, true);
        }
        while (i15 < i12) {
            C1727a c1727a2 = (C1727a) arrayList.get(i15);
            if (((Boolean) arrayList2.get(i15)).booleanValue() && (i14 = c1727a2.f7026u) >= 0) {
                m9119v0(i14);
                c1727a2.f7026u = -1;
            }
            c1727a2.m8949t();
            i15++;
        }
        if (z12) {
            m9092d1();
        }
    }

    /* renamed from: p1 */
    private void m9030p1(RuntimeException runtimeException) {
        runtimeException.getMessage();
        PrintWriter printWriter = new PrintWriter(new C1481c("FragmentManager"));
        AbstractC1732f abstractC1732f = this.f7056F;
        try {
            if (abstractC1732f != null) {
                abstractC1732f.mo8913h("  ", null, printWriter, new String[0]);
            } else {
                mo8991b("  ", null, printWriter, new String[0]);
            }
            throw runtimeException;
        } catch (Exception unused) {
            throw runtimeException;
        }
    }

    /* renamed from: q */
    private void m9031q(Fragment fragment, g gVar, int i11) {
        View view = fragment.f6938V;
        ViewGroup viewGroup = fragment.f6937U;
        viewGroup.startViewTransition(view);
        fragment.m8857i1(i11);
        if (gVar.f7097a != null) {
            h hVar = new h(gVar.f7097a, viewGroup, view);
            fragment.m8838b1(fragment.f6938V);
            hVar.setAnimationListener(new c(viewGroup, fragment));
            fragment.f6938V.startAnimation(hVar);
            return;
        }
        Animator animator = gVar.f7098b;
        fragment.m8840c1(animator);
        animator.addListener(new d(viewGroup, view, fragment));
        animator.setTarget(fragment.f6938V);
        animator.start();
    }

    /* renamed from: q0 */
    private void m9032q0(ArrayList arrayList, ArrayList arrayList2) {
        int size;
        int indexOf;
        int indexOf2;
        ArrayList arrayList3 = this.f7070T;
        if (arrayList3 == null) {
            size = 0;
        } else {
            size = arrayList3.size();
        }
        int i11 = 0;
        while (i11 < size) {
            m mVar = (m) this.f7070T.get(i11);
            if (arrayList != null && !mVar.f7111a && (indexOf2 = arrayList.indexOf(mVar.f7112b)) != -1 && ((Boolean) arrayList2.get(indexOf2)).booleanValue()) {
                this.f7070T.remove(i11);
                i11--;
                size--;
                mVar.m9126c();
            } else if (mVar.m9128e() || (arrayList != null && mVar.f7112b.m8947q(arrayList, 0, arrayList.size()))) {
                this.f7070T.remove(i11);
                i11--;
                size--;
                if (arrayList != null && !mVar.f7111a && (indexOf = arrayList.indexOf(mVar.f7112b)) != -1 && ((Boolean) arrayList2.get(indexOf)).booleanValue()) {
                    mVar.m9126c();
                } else {
                    mVar.m9127d();
                }
            }
            i11++;
        }
    }

    /* renamed from: q1 */
    public static int m9033q1(int i11, boolean z11) {
        if (i11 == 4097) {
            return z11 ? 1 : 2;
        }
        if (i11 == 4099) {
            return z11 ? 5 : 6;
        }
        if (i11 != 8194) {
            return -1;
        }
        return z11 ? 3 : 4;
    }

    /* renamed from: r1 */
    private void m9034r1() {
        ArrayList arrayList = this.f7073r;
        boolean z11 = true;
        if (arrayList != null && !arrayList.isEmpty()) {
            this.f7081z.m4666f(true);
            return;
        }
        AbstractC1011e abstractC1011e = this.f7081z;
        if (m9121x0() <= 0 || !m9055H0(this.f7058H)) {
            z11 = false;
        }
        abstractC1011e.m4666f(z11);
    }

    /* renamed from: t */
    private void m9035t() {
        this.f7077v.values().removeAll(Collections.singleton(null));
    }

    /* renamed from: t0 */
    private Fragment m9036t0(Fragment fragment) {
        ViewGroup viewGroup = fragment.f6937U;
        View view = fragment.f6938V;
        if (viewGroup != null && view != null) {
            for (int indexOf = this.f7076u.indexOf(fragment) - 1; indexOf >= 0; indexOf--) {
                Fragment fragment2 = (Fragment) this.f7076u.get(indexOf);
                if (fragment2.f6937U == viewGroup && fragment2.f6938V != null) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    /* renamed from: u0 */
    private void m9037u0() {
        if (this.f7070T != null) {
            while (!this.f7070T.isEmpty()) {
                ((m) this.f7070T.remove(0)).m9127d();
            }
        }
    }

    /* renamed from: v */
    private void m9038v() {
        if (!m9059J0()) {
        } else {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    /* renamed from: w */
    private void m9039w() {
        this.f7074s = false;
        this.f7066P.clear();
        this.f7065O.clear();
    }

    /* renamed from: w0 */
    private boolean m9040w0(ArrayList arrayList, ArrayList arrayList2) {
        synchronized (this) {
            try {
                ArrayList arrayList3 = this.f7073r;
                if (arrayList3 != null && arrayList3.size() != 0) {
                    int size = this.f7073r.size();
                    boolean z11 = false;
                    for (int i11 = 0; i11 < size; i11++) {
                        z11 |= ((k) this.f7073r.get(i11)).mo8933a(arrayList, arrayList2);
                    }
                    this.f7073r.clear();
                    this.f7056F.m8989f().removeCallbacks(this.f7072V);
                    return z11;
                }
                return false;
            } finally {
            }
        }
    }

    /* renamed from: A */
    public void m9041A() {
        this.f7061K = false;
        this.f7062L = false;
        m9024g0(2);
    }

    /* renamed from: A0 */
    public LayoutInflater.Factory2 m9042A0() {
        return this;
    }

    /* renamed from: B */
    public void m9043B(Configuration configuration) {
        for (int i11 = 0; i11 < this.f7076u.size(); i11++) {
            Fragment fragment = (Fragment) this.f7076u.get(i11);
            if (fragment != null) {
                fragment.m8786A0(configuration);
            }
        }
    }

    /* renamed from: B0 */
    public Fragment m9044B0() {
        return this.f7059I;
    }

    /* renamed from: C */
    public boolean m9045C(MenuItem menuItem) {
        if (this.f7055E < 1) {
            return false;
        }
        for (int i11 = 0; i11 < this.f7076u.size(); i11++) {
            Fragment fragment = (Fragment) this.f7076u.get(i11);
            if (fragment != null && fragment.m8788B0(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: C0 */
    public C1808z0 m9046C0(Fragment fragment) {
        return this.f7071U.m9135R(fragment);
    }

    /* renamed from: D */
    public void m9047D() {
        this.f7061K = false;
        this.f7062L = false;
        m9024g0(1);
    }

    /* renamed from: D0 */
    void m9048D0() {
        m9109n0();
        if (this.f7081z.m4663c()) {
            mo8997h();
        } else {
            this.f7080y.m4658c();
        }
    }

    /* renamed from: E */
    public boolean m9049E(Menu menu, MenuInflater menuInflater) {
        if (this.f7055E < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z11 = false;
        for (int i11 = 0; i11 < this.f7076u.size(); i11++) {
            Fragment fragment = (Fragment) this.f7076u.get(i11);
            if (fragment != null && fragment.m8792D0(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(fragment);
                z11 = true;
            }
        }
        if (this.f7079x != null) {
            for (int i12 = 0; i12 < this.f7079x.size(); i12++) {
                Fragment fragment2 = (Fragment) this.f7079x.get(i12);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.m8842d0();
                }
            }
        }
        this.f7079x = arrayList;
        return z11;
    }

    /* renamed from: E0 */
    public void m9050E0(Fragment fragment) {
        if (f7048W) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("hide: ");
            sb2.append(fragment);
        }
        if (!fragment.f6930N) {
            fragment.f6930N = true;
            fragment.f6945c0 = true ^ fragment.f6945c0;
        }
    }

    /* renamed from: F */
    public void m9051F() {
        this.f7063M = true;
        m9109n0();
        m9024g0(0);
        this.f7056F = null;
        this.f7057G = null;
        this.f7058H = null;
        if (this.f7080y != null) {
            this.f7081z.m4664d();
            this.f7080y = null;
        }
    }

    /* renamed from: F0 */
    public boolean m9052F0() {
        return this.f7063M;
    }

    /* renamed from: G */
    public void m9053G() {
        m9024g0(1);
    }

    /* renamed from: H */
    public void m9054H() {
        for (int i11 = 0; i11 < this.f7076u.size(); i11++) {
            Fragment fragment = (Fragment) this.f7076u.get(i11);
            if (fragment != null) {
                fragment.m8803J0();
            }
        }
    }

    /* renamed from: H0 */
    public boolean m9055H0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        LayoutInflaterFactory2C1734h layoutInflaterFactory2C1734h = fragment.f6923G;
        if (fragment == layoutInflaterFactory2C1734h.m9044B0() && m9055H0(layoutInflaterFactory2C1734h.f7058H)) {
            return true;
        }
        return false;
    }

    /* renamed from: I */
    public void m9056I(boolean z11) {
        for (int size = this.f7076u.size() - 1; size >= 0; size--) {
            Fragment fragment = (Fragment) this.f7076u.get(size);
            if (fragment != null) {
                fragment.m8804K0(z11);
            }
        }
    }

    /* renamed from: I0 */
    public boolean m9057I0(int i11) {
        return this.f7055E >= i11;
    }

    /* renamed from: J */
    void m9058J(Fragment fragment, Bundle bundle, boolean z11) {
        Fragment fragment2 = this.f7058H;
        if (fragment2 != null) {
            AbstractC1733g m8878s = fragment2.m8878s();
            if (m8878s instanceof LayoutInflaterFactory2C1734h) {
                ((LayoutInflaterFactory2C1734h) m8878s).m9058J(fragment, bundle, true);
            }
        }
        Iterator it = this.f7054D.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            if (!z11 || iVar.f7105b) {
                iVar.f7104a.m9001a(this, fragment, bundle);
            }
        }
    }

    /* renamed from: J0 */
    public boolean m9059J0() {
        return this.f7061K || this.f7062L;
    }

    /* renamed from: K */
    void m9060K(Fragment fragment, Context context, boolean z11) {
        Fragment fragment2 = this.f7058H;
        if (fragment2 != null) {
            AbstractC1733g m8878s = fragment2.m8878s();
            if (m8878s instanceof LayoutInflaterFactory2C1734h) {
                ((LayoutInflaterFactory2C1734h) m8878s).m9060K(fragment, context, true);
            }
        }
        Iterator it = this.f7054D.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            if (!z11 || iVar.f7105b) {
                iVar.f7104a.m9002b(this, fragment, context);
            }
        }
    }

    /* renamed from: K0 */
    g m9061K0(Fragment fragment, int i11, boolean z11, int i12) {
        int m9033q1;
        int m8884v = fragment.m8884v();
        fragment.m8848f1(0);
        ViewGroup viewGroup = fragment.f6937U;
        if (viewGroup != null && viewGroup.getLayoutTransition() != null) {
            return null;
        }
        Animation m8831Y = fragment.m8831Y(i11, z11, m8884v);
        if (m8831Y != null) {
            return new g(m8831Y);
        }
        Animator m8833Z = fragment.m8833Z(i11, z11, m8884v);
        if (m8833Z != null) {
            return new g(m8833Z);
        }
        if (m8884v != 0) {
            boolean equals = "anim".equals(this.f7056F.m8988e().getResources().getResourceTypeName(m8884v));
            if (equals) {
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(this.f7056F.m8988e(), m8884v);
                    if (loadAnimation != null) {
                        return new g(loadAnimation);
                    }
                } catch (Resources.NotFoundException e11) {
                    throw e11;
                } catch (RuntimeException unused) {
                }
            }
            try {
                Animator loadAnimator = AnimatorInflater.loadAnimator(this.f7056F.m8988e(), m8884v);
                if (loadAnimator != null) {
                    return new g(loadAnimator);
                }
            } catch (RuntimeException e12) {
                if (!equals) {
                    Animation loadAnimation2 = AnimationUtils.loadAnimation(this.f7056F.m8988e(), m8884v);
                    if (loadAnimation2 != null) {
                        return new g(loadAnimation2);
                    }
                } else {
                    throw e12;
                }
            }
        }
        if (i11 == 0 || (m9033q1 = m9033q1(i11, z11)) < 0) {
            return null;
        }
        switch (m9033q1) {
            case 1:
                return m9017O0(1.125f, 1.0f, 0.0f, 1.0f);
            case 2:
                return m9017O0(1.0f, 0.975f, 1.0f, 0.0f);
            case 3:
                return m9017O0(0.975f, 1.0f, 0.0f, 1.0f);
            case 4:
                return m9017O0(1.0f, 1.075f, 1.0f, 0.0f);
            case 5:
                return m9016M0(0.0f, 1.0f);
            case 6:
                return m9016M0(1.0f, 0.0f);
            default:
                if (i12 == 0 && this.f7056F.mo8917l()) {
                    this.f7056F.mo8916k();
                }
                return null;
        }
    }

    /* renamed from: L */
    void m9062L(Fragment fragment, Bundle bundle, boolean z11) {
        Fragment fragment2 = this.f7058H;
        if (fragment2 != null) {
            AbstractC1733g m8878s = fragment2.m8878s();
            if (m8878s instanceof LayoutInflaterFactory2C1734h) {
                ((LayoutInflaterFactory2C1734h) m8878s).m9062L(fragment, bundle, true);
            }
        }
        Iterator it = this.f7054D.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            if (!z11 || iVar.f7105b) {
                iVar.f7104a.m9003c(this, fragment, bundle);
            }
        }
    }

    /* renamed from: L0 */
    public void m9063L0(Fragment fragment) {
        if (this.f7077v.get(fragment.f6959t) != null) {
            return;
        }
        this.f7077v.put(fragment.f6959t, fragment);
        if (fragment.f6933Q) {
            if (fragment.f6932P) {
                m9111o(fragment);
            } else {
                m9090c1(fragment);
            }
            fragment.f6933Q = false;
        }
        if (f7048W) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Added fragment to active set ");
            sb2.append(fragment);
        }
    }

    /* renamed from: M */
    void m9064M(Fragment fragment, boolean z11) {
        Fragment fragment2 = this.f7058H;
        if (fragment2 != null) {
            AbstractC1733g m8878s = fragment2.m8878s();
            if (m8878s instanceof LayoutInflaterFactory2C1734h) {
                ((LayoutInflaterFactory2C1734h) m8878s).m9064M(fragment, true);
            }
        }
        Iterator it = this.f7054D.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            if (!z11 || iVar.f7105b) {
                iVar.f7104a.m9004d(this, fragment);
            }
        }
    }

    /* renamed from: N */
    void m9065N(Fragment fragment, boolean z11) {
        Fragment fragment2 = this.f7058H;
        if (fragment2 != null) {
            AbstractC1733g m8878s = fragment2.m8878s();
            if (m8878s instanceof LayoutInflaterFactory2C1734h) {
                ((LayoutInflaterFactory2C1734h) m8878s).m9065N(fragment, true);
            }
        }
        Iterator it = this.f7054D.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            if (!z11 || iVar.f7105b) {
                iVar.f7104a.m9005e(this, fragment);
            }
        }
    }

    /* renamed from: N0 */
    void m9066N0(Fragment fragment) {
        if (this.f7077v.get(fragment.f6959t) == null) {
            return;
        }
        if (f7048W) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Removed fragment from active set ");
            sb2.append(fragment);
        }
        for (Fragment fragment2 : this.f7077v.values()) {
            if (fragment2 != null && fragment.f6959t.equals(fragment2.f6962w)) {
                fragment2.f6961v = fragment;
                fragment2.f6962w = null;
            }
        }
        this.f7077v.put(fragment.f6959t, null);
        m9090c1(fragment);
        String str = fragment.f6962w;
        if (str != null) {
            fragment.f6961v = (Fragment) this.f7077v.get(str);
        }
        fragment.m8802J();
    }

    /* renamed from: O */
    void m9067O(Fragment fragment, boolean z11) {
        Fragment fragment2 = this.f7058H;
        if (fragment2 != null) {
            AbstractC1733g m8878s = fragment2.m8878s();
            if (m8878s instanceof LayoutInflaterFactory2C1734h) {
                ((LayoutInflaterFactory2C1734h) m8878s).m9067O(fragment, true);
            }
        }
        Iterator it = this.f7054D.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            if (!z11 || iVar.f7105b) {
                iVar.f7104a.mo9006f(this, fragment);
            }
        }
    }

    /* renamed from: P */
    void m9068P(Fragment fragment, Context context, boolean z11) {
        Fragment fragment2 = this.f7058H;
        if (fragment2 != null) {
            AbstractC1733g m8878s = fragment2.m8878s();
            if (m8878s instanceof LayoutInflaterFactory2C1734h) {
                ((LayoutInflaterFactory2C1734h) m8878s).m9068P(fragment, context, true);
            }
        }
        Iterator it = this.f7054D.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            if (!z11 || iVar.f7105b) {
                iVar.f7104a.m9007g(this, fragment, context);
            }
        }
    }

    /* renamed from: Q */
    void m9069Q(Fragment fragment, Bundle bundle, boolean z11) {
        Fragment fragment2 = this.f7058H;
        if (fragment2 != null) {
            AbstractC1733g m8878s = fragment2.m8878s();
            if (m8878s instanceof LayoutInflaterFactory2C1734h) {
                ((LayoutInflaterFactory2C1734h) m8878s).m9069Q(fragment, bundle, true);
            }
        }
        Iterator it = this.f7054D.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            if (!z11 || iVar.f7105b) {
                iVar.f7104a.m9008h(this, fragment, bundle);
            }
        }
    }

    /* renamed from: Q0 */
    public void m9070Q0(Fragment fragment) {
        if (fragment == null) {
            return;
        }
        if (!this.f7077v.containsKey(fragment.f6959t)) {
            if (f7048W) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Ignoring moving ");
                sb2.append(fragment);
                sb2.append(" to state ");
                sb2.append(this.f7055E);
                sb2.append("since it is not added to ");
                sb2.append(this);
                return;
            }
            return;
        }
        int i11 = this.f7055E;
        if (fragment.f6917A) {
            if (fragment.m8807M()) {
                i11 = Math.min(i11, 1);
            } else {
                i11 = Math.min(i11, 0);
            }
        }
        m9076T0(fragment, i11, fragment.m8886w(), fragment.m8888x(), false);
        if (fragment.f6938V != null) {
            Fragment m9036t0 = m9036t0(fragment);
            if (m9036t0 != null) {
                View view = m9036t0.f6938V;
                ViewGroup viewGroup = fragment.f6937U;
                int indexOfChild = viewGroup.indexOfChild(view);
                int indexOfChild2 = viewGroup.indexOfChild(fragment.f6938V);
                if (indexOfChild2 < indexOfChild) {
                    viewGroup.removeViewAt(indexOfChild2);
                    viewGroup.addView(fragment.f6938V, indexOfChild);
                }
            }
            if (fragment.f6944b0 && fragment.f6937U != null) {
                float f11 = fragment.f6946d0;
                if (f11 > 0.0f) {
                    fragment.f6938V.setAlpha(f11);
                }
                fragment.f6946d0 = 0.0f;
                fragment.f6944b0 = false;
                g m9061K0 = m9061K0(fragment, fragment.m8886w(), true, fragment.m8888x());
                if (m9061K0 != null) {
                    Animation animation = m9061K0.f7097a;
                    if (animation != null) {
                        fragment.f6938V.startAnimation(animation);
                    } else {
                        m9061K0.f7098b.setTarget(fragment.f6938V);
                        m9061K0.f7098b.start();
                    }
                }
            }
        }
        if (fragment.f6945c0) {
            m9122y(fragment);
        }
    }

    /* renamed from: R */
    void m9071R(Fragment fragment, boolean z11) {
        Fragment fragment2 = this.f7058H;
        if (fragment2 != null) {
            AbstractC1733g m8878s = fragment2.m8878s();
            if (m8878s instanceof LayoutInflaterFactory2C1734h) {
                ((LayoutInflaterFactory2C1734h) m8878s).m9071R(fragment, true);
            }
        }
        Iterator it = this.f7054D.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            if (!z11 || iVar.f7105b) {
                iVar.f7104a.mo9009i(this, fragment);
            }
        }
    }

    /* renamed from: R0 */
    public void m9072R0(int i11, boolean z11) {
        AbstractC1732f abstractC1732f;
        if (this.f7056F == null && i11 != 0) {
            throw new IllegalStateException("No activity");
        }
        if (!z11 && i11 == this.f7055E) {
            return;
        }
        this.f7055E = i11;
        int size = this.f7076u.size();
        for (int i12 = 0; i12 < size; i12++) {
            m9070Q0((Fragment) this.f7076u.get(i12));
        }
        for (Fragment fragment : this.f7077v.values()) {
            if (fragment != null && (fragment.f6917A || fragment.f6931O)) {
                if (!fragment.f6944b0) {
                    m9070Q0(fragment);
                }
            }
        }
        m9112o1();
        if (this.f7060J && (abstractC1732f = this.f7056F) != null && this.f7055E == 4) {
            abstractC1732f.mo8920o();
            this.f7060J = false;
        }
    }

    /* renamed from: S */
    void m9073S(Fragment fragment, Bundle bundle, boolean z11) {
        Fragment fragment2 = this.f7058H;
        if (fragment2 != null) {
            AbstractC1733g m8878s = fragment2.m8878s();
            if (m8878s instanceof LayoutInflaterFactory2C1734h) {
                ((LayoutInflaterFactory2C1734h) m8878s).m9073S(fragment, bundle, true);
            }
        }
        Iterator it = this.f7054D.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            if (!z11 || iVar.f7105b) {
                iVar.f7104a.m9010j(this, fragment, bundle);
            }
        }
    }

    /* renamed from: S0 */
    void m9074S0(Fragment fragment) {
        m9076T0(fragment, this.f7055E, 0, 0, false);
    }

    /* renamed from: T */
    void m9075T(Fragment fragment, boolean z11) {
        Fragment fragment2 = this.f7058H;
        if (fragment2 != null) {
            AbstractC1733g m8878s = fragment2.m8878s();
            if (m8878s instanceof LayoutInflaterFactory2C1734h) {
                ((LayoutInflaterFactory2C1734h) m8878s).m9075T(fragment, true);
            }
        }
        Iterator it = this.f7054D.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            if (!z11 || iVar.f7105b) {
                iVar.f7104a.m9011k(this, fragment);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0083, code lost:            if (r0 != 3) goto L532;     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02c2  */
    /* renamed from: T0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m9076T0(Fragment fragment, int i11, int i12, int i13, boolean z11) {
        int i14;
        int min;
        Fragment fragment2;
        ViewGroup viewGroup;
        String str;
        ViewGroup viewGroup2;
        String str2;
        int i15;
        int i16 = 1;
        boolean isChangingConfigurations = true;
        if (!fragment.f6965z || fragment.f6931O) {
            i14 = i11;
            if (i14 > 1) {
                i14 = 1;
            }
        } else {
            i14 = i11;
        }
        if (fragment.f6917A && i14 > (i15 = fragment.f6955p)) {
            i14 = (i15 == 0 && fragment.m8807M()) ? 1 : fragment.f6955p;
        }
        if (fragment.f6940X && fragment.f6955p < 3 && i14 > 2) {
            i14 = 2;
        }
        AbstractC1785o.b bVar = fragment.f6949g0;
        if (bVar == AbstractC1785o.b.CREATED) {
            min = Math.min(i14, 1);
        } else {
            min = Math.min(i14, bVar.ordinal());
        }
        int i17 = min;
        int i18 = fragment.f6955p;
        if (i18 <= i17) {
            if (fragment.f6918B && !fragment.f6919C) {
                return;
            }
            if (fragment.m8861k() != null || fragment.m8864l() != null) {
                fragment.m8838b1(null);
                fragment.m8840c1(null);
                m9076T0(fragment, fragment.m8795F(), 0, 0, true);
            }
            int i19 = fragment.f6955p;
            if (i19 != 0) {
                if (i19 != 1) {
                    if (i19 != 2) {
                    }
                    if (i17 > 2) {
                        if (f7048W) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("moveto STARTED: ");
                            sb2.append(fragment);
                        }
                        fragment.m8822T0();
                        m9075T(fragment, false);
                    }
                    if (i17 > 3) {
                        if (f7048W) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("moveto RESUMED: ");
                            sb3.append(fragment);
                        }
                        fragment.m8818R0();
                        m9071R(fragment, false);
                        fragment.f6956q = null;
                        fragment.f6957r = null;
                    }
                }
            } else if (i17 > 0) {
                if (f7048W) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("moveto CREATED: ");
                    sb4.append(fragment);
                }
                Bundle bundle = fragment.f6956q;
                if (bundle != null) {
                    bundle.setClassLoader(this.f7056F.m8988e().getClassLoader());
                    fragment.f6957r = fragment.f6956q.getSparseParcelableArray("android:view_state");
                    Fragment m9125z0 = m9125z0(fragment.f6956q, "android:target_state");
                    String str3 = m9125z0 != null ? m9125z0.f6959t : null;
                    fragment.f6962w = str3;
                    if (str3 != null) {
                        fragment.f6963x = fragment.f6956q.getInt("android:target_req_state", 0);
                    }
                    Boolean bool = fragment.f6958s;
                    if (bool != null) {
                        fragment.f6941Y = bool.booleanValue();
                        fragment.f6958s = null;
                    } else {
                        fragment.f6941Y = fragment.f6956q.getBoolean("android:user_visible_hint", true);
                    }
                    if (!fragment.f6941Y) {
                        fragment.f6940X = true;
                        if (i17 > 2) {
                            i17 = 2;
                        }
                    }
                }
                AbstractC1732f abstractC1732f = this.f7056F;
                fragment.f6924H = abstractC1732f;
                Fragment fragment3 = this.f7058H;
                fragment.f6926J = fragment3;
                fragment.f6923G = fragment3 != null ? fragment3.f6925I : abstractC1732f.f7045t;
                Fragment fragment4 = fragment.f6961v;
                if (fragment4 != null) {
                    Object obj = this.f7077v.get(fragment4.f6959t);
                    Fragment fragment5 = fragment.f6961v;
                    if (obj == fragment5) {
                        if (fragment5.f6955p < 1) {
                            str = "Fragment ";
                            m9076T0(fragment5, 1, 0, 0, true);
                        } else {
                            str = "Fragment ";
                        }
                        fragment.f6962w = fragment.f6961v.f6959t;
                        fragment.f6961v = null;
                    } else {
                        throw new IllegalStateException("Fragment " + fragment + " declared target fragment " + fragment.f6961v + " that does not belong to this FragmentManager!");
                    }
                } else {
                    str = "Fragment ";
                }
                String str4 = fragment.f6962w;
                if (str4 != null) {
                    Fragment fragment6 = (Fragment) this.f7077v.get(str4);
                    if (fragment6 != null) {
                        if (fragment6.f6955p < 1) {
                            m9076T0(fragment6, 1, 0, 0, true);
                        }
                    } else {
                        throw new IllegalStateException(str + fragment + " declared target fragment " + fragment.f6962w + " that does not belong to this FragmentManager!");
                    }
                }
                m9068P(fragment, this.f7056F.m8988e(), false);
                fragment.m8893z0();
                Fragment fragment7 = fragment.f6926J;
                if (fragment7 == null) {
                    this.f7056F.mo8912g(fragment);
                } else {
                    fragment7.m8825V(fragment);
                }
                m9060K(fragment, this.f7056F.m8988e(), false);
                if (!fragment.f6948f0) {
                    m9069Q(fragment, fragment.f6956q, false);
                    fragment.m8790C0(fragment.f6956q);
                    m9062L(fragment, fragment.f6956q, false);
                } else {
                    fragment.m8834Z0(fragment.f6956q);
                    fragment.f6955p = 1;
                }
            }
            if (i17 > 0) {
                m9106m0(fragment);
            }
            if (i17 > 1) {
                if (f7048W) {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("moveto ACTIVITY_CREATED: ");
                    sb5.append(fragment);
                }
                if (!fragment.f6918B) {
                    int i21 = fragment.f6928L;
                    if (i21 != 0) {
                        if (i21 == -1) {
                            m9030p1(new IllegalArgumentException("Cannot create fragment " + fragment + " for a container view with no id"));
                        }
                        viewGroup2 = (ViewGroup) this.f7057G.mo8897b(fragment.f6928L);
                        if (viewGroup2 == null && !fragment.f6920D) {
                            try {
                                str2 = fragment.m8785A().getResourceName(fragment.f6928L);
                            } catch (Resources.NotFoundException unused) {
                                str2 = "unknown";
                            }
                            m9030p1(new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(fragment.f6928L) + " (" + str2 + ") for fragment " + fragment));
                        }
                    } else {
                        viewGroup2 = null;
                    }
                    fragment.f6937U = viewGroup2;
                    fragment.m8794E0(fragment.m8801I0(fragment.f6956q), viewGroup2, fragment.f6956q);
                    View view = fragment.f6938V;
                    if (view != null) {
                        fragment.f6939W = view;
                        view.setSaveFromParentEnabled(false);
                        if (viewGroup2 != null) {
                            viewGroup2.addView(fragment.f6938V);
                        }
                        if (fragment.f6930N) {
                            fragment.f6938V.setVisibility(8);
                        }
                        fragment.m8887w0(fragment.f6938V, fragment.f6956q);
                        m9079V(fragment, fragment.f6938V, fragment.f6956q, false);
                        fragment.f6944b0 = fragment.f6938V.getVisibility() == 0 && fragment.f6937U != null;
                    } else {
                        fragment.f6939W = null;
                    }
                }
                fragment.m8891y0(fragment.f6956q);
                m9058J(fragment, fragment.f6956q, false);
                if (fragment.f6938V != null) {
                    fragment.m8836a1(fragment.f6956q);
                }
                fragment.f6956q = null;
            }
            if (i17 > 2) {
            }
            if (i17 > 3) {
            }
        } else if (i18 > i17) {
            if (i18 != 1) {
                if (i18 != 2) {
                    if (i18 != 3) {
                        if (i18 == 4) {
                            if (i17 < 4) {
                                if (f7048W) {
                                    StringBuilder sb6 = new StringBuilder();
                                    sb6.append("movefrom RESUMED: ");
                                    sb6.append(fragment);
                                }
                                fragment.m8810N0();
                                m9067O(fragment, false);
                            }
                        }
                    }
                    if (i17 < 3) {
                        if (f7048W) {
                            StringBuilder sb7 = new StringBuilder();
                            sb7.append("movefrom STARTED: ");
                            sb7.append(fragment);
                        }
                        fragment.m8824U0();
                        m9077U(fragment, false);
                    }
                }
                if (i17 < 2) {
                    if (f7048W) {
                        StringBuilder sb8 = new StringBuilder();
                        sb8.append("movefrom ACTIVITY_CREATED: ");
                        sb8.append(fragment);
                    }
                    if (fragment.f6938V != null && this.f7056F.mo8918m(fragment) && fragment.f6957r == null) {
                        m9100i1(fragment);
                    }
                    fragment.m8798G0();
                    m9081W(fragment, false);
                    View view2 = fragment.f6938V;
                    if (view2 != null && (viewGroup = fragment.f6937U) != null) {
                        viewGroup.endViewTransition(view2);
                        fragment.f6938V.clearAnimation();
                        if (fragment.m8890y() == null || !fragment.m8890y().f6917A) {
                            g m9061K0 = (this.f7055E <= 0 || this.f7063M || fragment.f6938V.getVisibility() != 0 || fragment.f6946d0 < 0.0f) ? null : m9061K0(fragment, i12, false, i13);
                            fragment.f6946d0 = 0.0f;
                            if (m9061K0 != null) {
                                m9031q(fragment, m9061K0, i17);
                            }
                            fragment.f6937U.removeView(fragment.f6938V);
                        }
                    }
                    fragment.f6937U = null;
                    fragment.f6938V = null;
                    fragment.f6951i0 = null;
                    fragment.f6952j0.mo9224q(null);
                    fragment.f6939W = null;
                    fragment.f6919C = false;
                }
            }
            if (i17 < 1) {
                if (this.f7063M) {
                    if (fragment.m8861k() != null) {
                        View m8861k = fragment.m8861k();
                        fragment.m8838b1(null);
                        m8861k.clearAnimation();
                    } else if (fragment.m8864l() != null) {
                        Animator m8864l = fragment.m8864l();
                        fragment.m8840c1(null);
                        m8864l.cancel();
                    }
                }
                if (fragment.m8861k() == null && fragment.m8864l() == null) {
                    if (f7048W) {
                        StringBuilder sb9 = new StringBuilder();
                        sb9.append("movefrom CREATED: ");
                        sb9.append(fragment);
                    }
                    boolean z12 = fragment.f6917A && !fragment.m8807M();
                    if (!z12 && !this.f7071U.m9138U(fragment)) {
                        fragment.f6955p = 0;
                    } else {
                        AbstractC1732f abstractC1732f2 = this.f7056F;
                        if (abstractC1732f2 instanceof InterfaceC1756a1) {
                            isChangingConfigurations = this.f7071U.m9136S();
                        } else if (abstractC1732f2.m8988e() instanceof Activity) {
                            isChangingConfigurations = true ^ ((Activity) this.f7056F.m8988e()).isChangingConfigurations();
                        }
                        if (z12 || isChangingConfigurations) {
                            this.f7071U.m9132N(fragment);
                        }
                        fragment.m8796F0();
                        m9064M(fragment, false);
                    }
                    fragment.m8800H0();
                    m9065N(fragment, false);
                    if (!z11) {
                        if (!z12 && !this.f7071U.m9138U(fragment)) {
                            fragment.f6924H = null;
                            fragment.f6926J = null;
                            fragment.f6923G = null;
                            String str5 = fragment.f6962w;
                            if (str5 != null && (fragment2 = (Fragment) this.f7077v.get(str5)) != null && fragment2.m8787B()) {
                                fragment.f6961v = fragment2;
                            }
                        } else {
                            m9066N0(fragment);
                        }
                    }
                } else {
                    fragment.m8857i1(i17);
                    if (fragment.f6955p == i16) {
                        StringBuilder sb10 = new StringBuilder();
                        sb10.append("moveToState: Fragment state for ");
                        sb10.append(fragment);
                        sb10.append(" not updated inline; expected state ");
                        sb10.append(i16);
                        sb10.append(" found ");
                        sb10.append(fragment.f6955p);
                        fragment.f6955p = i16;
                        return;
                    }
                    return;
                }
            }
        }
        i16 = i17;
        if (fragment.f6955p == i16) {
        }
    }

    /* renamed from: U */
    void m9077U(Fragment fragment, boolean z11) {
        Fragment fragment2 = this.f7058H;
        if (fragment2 != null) {
            AbstractC1733g m8878s = fragment2.m8878s();
            if (m8878s instanceof LayoutInflaterFactory2C1734h) {
                ((LayoutInflaterFactory2C1734h) m8878s).m9077U(fragment, true);
            }
        }
        Iterator it = this.f7054D.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            if (!z11 || iVar.f7105b) {
                iVar.f7104a.m9012l(this, fragment);
            }
        }
    }

    /* renamed from: U0 */
    public void m9078U0() {
        this.f7061K = false;
        this.f7062L = false;
        int size = this.f7076u.size();
        for (int i11 = 0; i11 < size; i11++) {
            Fragment fragment = (Fragment) this.f7076u.get(i11);
            if (fragment != null) {
                fragment.m8815Q();
            }
        }
    }

    /* renamed from: V */
    void m9079V(Fragment fragment, View view, Bundle bundle, boolean z11) {
        Fragment fragment2 = this.f7058H;
        if (fragment2 != null) {
            AbstractC1733g m8878s = fragment2.m8878s();
            if (m8878s instanceof LayoutInflaterFactory2C1734h) {
                ((LayoutInflaterFactory2C1734h) m8878s).m9079V(fragment, view, bundle, true);
            }
        }
        Iterator it = this.f7054D.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            if (!z11 || iVar.f7105b) {
                iVar.f7104a.m9013m(this, fragment, view, bundle);
            }
        }
    }

    /* renamed from: V0 */
    public void m9080V0(Fragment fragment) {
        if (fragment.f6940X) {
            if (this.f7074s) {
                this.f7064N = true;
            } else {
                fragment.f6940X = false;
                m9076T0(fragment, this.f7055E, 0, 0, false);
            }
        }
    }

    /* renamed from: W */
    void m9081W(Fragment fragment, boolean z11) {
        Fragment fragment2 = this.f7058H;
        if (fragment2 != null) {
            AbstractC1733g m8878s = fragment2.m8878s();
            if (m8878s instanceof LayoutInflaterFactory2C1734h) {
                ((LayoutInflaterFactory2C1734h) m8878s).m9081W(fragment, true);
            }
        }
        Iterator it = this.f7054D.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            if (!z11 || iVar.f7105b) {
                iVar.f7104a.m9014n(this, fragment);
            }
        }
    }

    /* renamed from: X */
    public boolean m9082X(MenuItem menuItem) {
        if (this.f7055E < 1) {
            return false;
        }
        for (int i11 = 0; i11 < this.f7076u.size(); i11++) {
            Fragment fragment = (Fragment) this.f7076u.get(i11);
            if (fragment != null && fragment.m8806L0(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: X0 */
    boolean m9083X0(ArrayList arrayList, ArrayList arrayList2, String str, int i11, int i12) {
        int i13;
        ArrayList arrayList3 = this.f7078w;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && i11 < 0 && (i12 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.f7078w.remove(size));
            arrayList2.add(Boolean.TRUE);
        } else {
            if (str == null && i11 < 0) {
                i13 = -1;
            } else {
                int size2 = arrayList3.size() - 1;
                while (size2 >= 0) {
                    C1727a c1727a = (C1727a) this.f7078w.get(size2);
                    if ((str != null && str.equals(c1727a.m8945o())) || (i11 >= 0 && i11 == c1727a.f7026u)) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    return false;
                }
                if ((i12 & 1) != 0) {
                    while (true) {
                        size2--;
                        if (size2 < 0) {
                            break;
                        }
                        C1727a c1727a2 = (C1727a) this.f7078w.get(size2);
                        if (str == null || !str.equals(c1727a2.m8945o())) {
                            if (i11 < 0 || i11 != c1727a2.f7026u) {
                                break;
                            }
                        }
                    }
                }
                i13 = size2;
            }
            if (i13 == this.f7078w.size() - 1) {
                return false;
            }
            for (int size3 = this.f7078w.size() - 1; size3 > i13; size3--) {
                arrayList.add(this.f7078w.remove(size3));
                arrayList2.add(Boolean.TRUE);
            }
        }
        return true;
    }

    /* renamed from: Y */
    public void m9084Y(Menu menu) {
        if (this.f7055E < 1) {
            return;
        }
        for (int i11 = 0; i11 < this.f7076u.size(); i11++) {
            Fragment fragment = (Fragment) this.f7076u.get(i11);
            if (fragment != null) {
                fragment.m8808M0(menu);
            }
        }
    }

    /* renamed from: Z0 */
    public void m9085Z0(Bundle bundle, String str, Fragment fragment) {
        if (fragment.f6923G != this) {
            m9030p1(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        bundle.putString(str, fragment.f6959t);
    }

    @Override // androidx.fragment.app.AbstractC1733g
    /* renamed from: a */
    public AbstractC1736j mo8990a() {
        return new C1727a(this);
    }

    /* renamed from: a0 */
    public void m9086a0() {
        m9024g0(3);
    }

    /* renamed from: a1 */
    public void m9087a1(Fragment fragment) {
        if (f7048W) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("remove: ");
            sb2.append(fragment);
            sb2.append(" nesting=");
            sb2.append(fragment.f6922F);
        }
        boolean z11 = !fragment.m8807M();
        if (!fragment.f6931O || z11) {
            synchronized (this.f7076u) {
                this.f7076u.remove(fragment);
            }
            if (m9015G0(fragment)) {
                this.f7060J = true;
            }
            fragment.f6965z = false;
            fragment.f6917A = true;
        }
    }

    @Override // androidx.fragment.app.AbstractC1733g
    /* renamed from: b */
    public void mo8991b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        int size3;
        int size4;
        String str2 = str + "    ";
        if (!this.f7077v.isEmpty()) {
            printWriter.print(str);
            printWriter.print("Active Fragments in ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(":");
            for (Fragment fragment : this.f7077v.values()) {
                printWriter.print(str);
                printWriter.println(fragment);
                if (fragment != null) {
                    fragment.mo8844e(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }
        int size5 = this.f7076u.size();
        if (size5 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i11 = 0; i11 < size5; i11++) {
                Fragment fragment2 = (Fragment) this.f7076u.get(i11);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i11);
                printWriter.print(": ");
                printWriter.println(fragment2.toString());
            }
        }
        ArrayList arrayList = this.f7079x;
        if (arrayList != null && (size4 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i12 = 0; i12 < size4; i12++) {
                Fragment fragment3 = (Fragment) this.f7079x.get(i12);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i12);
                printWriter.print(": ");
                printWriter.println(fragment3.toString());
            }
        }
        ArrayList arrayList2 = this.f7078w;
        if (arrayList2 != null && (size3 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i13 = 0; i13 < size3; i13++) {
                C1727a c1727a = (C1727a) this.f7078w.get(i13);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i13);
                printWriter.print(": ");
                printWriter.println(c1727a.toString());
                c1727a.m8940j(str2, printWriter);
            }
        }
        synchronized (this) {
            try {
                ArrayList arrayList3 = this.f7051A;
                if (arrayList3 != null && (size2 = arrayList3.size()) > 0) {
                    printWriter.print(str);
                    printWriter.println("Back Stack Indices:");
                    for (int i14 = 0; i14 < size2; i14++) {
                        Object obj = (C1727a) this.f7051A.get(i14);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i14);
                        printWriter.print(": ");
                        printWriter.println(obj);
                    }
                }
                ArrayList arrayList4 = this.f7052B;
                if (arrayList4 != null && arrayList4.size() > 0) {
                    printWriter.print(str);
                    printWriter.print("mAvailBackStackIndices: ");
                    printWriter.println(Arrays.toString(this.f7052B.toArray()));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        ArrayList arrayList5 = this.f7073r;
        if (arrayList5 != null && (size = arrayList5.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Pending Actions:");
            for (int i15 = 0; i15 < size; i15++) {
                Object obj2 = (k) this.f7073r.get(i15);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i15);
                printWriter.print(": ");
                printWriter.println(obj2);
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f7056F);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f7057G);
        if (this.f7058H != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f7058H);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f7055E);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f7061K);
        printWriter.print(" mStopped=");
        printWriter.print(this.f7062L);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f7063M);
        if (this.f7060J) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f7060J);
        }
    }

    /* renamed from: b0 */
    public void m9088b0(boolean z11) {
        for (int size = this.f7076u.size() - 1; size >= 0; size--) {
            Fragment fragment = (Fragment) this.f7076u.get(size);
            if (fragment != null) {
                fragment.m8812O0(z11);
            }
        }
    }

    @Override // androidx.fragment.app.AbstractC1733g
    /* renamed from: c */
    public boolean mo8992c() {
        boolean m9109n0 = m9109n0();
        m9037u0();
        return m9109n0;
    }

    /* renamed from: c0 */
    public boolean m9089c0(Menu menu) {
        if (this.f7055E < 1) {
            return false;
        }
        boolean z11 = false;
        for (int i11 = 0; i11 < this.f7076u.size(); i11++) {
            Fragment fragment = (Fragment) this.f7076u.get(i11);
            if (fragment != null && fragment.m8814P0(menu)) {
                z11 = true;
            }
        }
        return z11;
    }

    /* renamed from: c1 */
    void m9090c1(Fragment fragment) {
        if (!m9059J0() && this.f7071U.m9137T(fragment) && f7048W) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Updating retained Fragments: Removed ");
            sb2.append(fragment);
        }
    }

    @Override // androidx.fragment.app.AbstractC1733g
    /* renamed from: d */
    public Fragment mo8993d(String str) {
        if (str != null) {
            for (int size = this.f7076u.size() - 1; size >= 0; size--) {
                Fragment fragment = (Fragment) this.f7076u.get(size);
                if (fragment != null && str.equals(fragment.f6929M)) {
                    return fragment;
                }
            }
        }
        if (str != null) {
            for (Fragment fragment2 : this.f7077v.values()) {
                if (fragment2 != null && str.equals(fragment2.f6929M)) {
                    return fragment2;
                }
            }
            return null;
        }
        return null;
    }

    /* renamed from: d0 */
    public void m9091d0() {
        m9034r1();
        m9021Z(this.f7059I);
    }

    /* renamed from: d1 */
    void m9092d1() {
        ArrayList arrayList = this.f7053C;
        if (arrayList != null && arrayList.size() > 0) {
            AbstractC30228a.m149044a(this.f7053C.get(0));
            throw null;
        }
    }

    @Override // androidx.fragment.app.AbstractC1733g
    /* renamed from: e */
    public C1731e mo8994e() {
        if (super.mo8994e() == AbstractC1733g.f7046q) {
            Fragment fragment = this.f7058H;
            if (fragment != null) {
                return fragment.f6923G.mo8994e();
            }
            m8999j(new f());
        }
        return super.mo8994e();
    }

    /* renamed from: e0 */
    public void m9093e0() {
        this.f7061K = false;
        this.f7062L = false;
        m9024g0(4);
    }

    /* renamed from: e1 */
    public void m9094e1(Parcelable parcelable) {
        FragmentState fragmentState;
        String str;
        if (parcelable == null) {
            return;
        }
        FragmentManagerState fragmentManagerState = (FragmentManagerState) parcelable;
        if (fragmentManagerState.f6999p == null) {
            return;
        }
        for (Fragment fragment : this.f7071U.m9134Q()) {
            if (f7048W) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("restoreSaveState: re-attaching retained ");
                sb2.append(fragment);
            }
            Iterator it = fragmentManagerState.f6999p.iterator();
            while (true) {
                if (it.hasNext()) {
                    fragmentState = (FragmentState) it.next();
                    if (fragmentState.f7008q.equals(fragment.f6959t)) {
                        break;
                    }
                } else {
                    fragmentState = null;
                    break;
                }
            }
            if (fragmentState == null) {
                if (f7048W) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Discarding retained Fragment ");
                    sb3.append(fragment);
                    sb3.append(" that was not found in the set of active Fragments ");
                    sb3.append(fragmentManagerState.f6999p);
                }
                m9076T0(fragment, 1, 0, 0, false);
                fragment.f6917A = true;
                m9076T0(fragment, 0, 0, 0, false);
            } else {
                fragmentState.f7006C = fragment;
                fragment.f6957r = null;
                fragment.f6922F = 0;
                fragment.f6919C = false;
                fragment.f6965z = false;
                Fragment fragment2 = fragment.f6961v;
                if (fragment2 != null) {
                    str = fragment2.f6959t;
                } else {
                    str = null;
                }
                fragment.f6962w = str;
                fragment.f6961v = null;
                Bundle bundle = fragmentState.f7005B;
                if (bundle != null) {
                    bundle.setClassLoader(this.f7056F.m8988e().getClassLoader());
                    fragment.f6957r = fragmentState.f7005B.getSparseParcelableArray("android:view_state");
                    fragment.f6956q = fragmentState.f7005B;
                }
            }
        }
        this.f7077v.clear();
        Iterator it2 = fragmentManagerState.f6999p.iterator();
        while (it2.hasNext()) {
            FragmentState fragmentState2 = (FragmentState) it2.next();
            if (fragmentState2 != null) {
                Fragment m8924a = fragmentState2.m8924a(this.f7056F.m8988e().getClassLoader(), mo8994e());
                m8924a.f6923G = this;
                if (f7048W) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("restoreSaveState: active (");
                    sb4.append(m8924a.f6959t);
                    sb4.append("): ");
                    sb4.append(m8924a);
                }
                this.f7077v.put(m8924a.f6959t, m8924a);
                fragmentState2.f7006C = null;
            }
        }
        this.f7076u.clear();
        ArrayList arrayList = fragmentManagerState.f7000q;
        if (arrayList != null) {
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                String str2 = (String) it3.next();
                Fragment fragment3 = (Fragment) this.f7077v.get(str2);
                if (fragment3 == null) {
                    m9030p1(new IllegalStateException("No instantiated fragment for (" + str2 + ")"));
                }
                fragment3.f6965z = true;
                if (f7048W) {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("restoreSaveState: added (");
                    sb5.append(str2);
                    sb5.append("): ");
                    sb5.append(fragment3);
                }
                if (!this.f7076u.contains(fragment3)) {
                    synchronized (this.f7076u) {
                        this.f7076u.add(fragment3);
                    }
                } else {
                    throw new IllegalStateException("Already added " + fragment3);
                }
            }
        }
        if (fragmentManagerState.f7001r != null) {
            this.f7078w = new ArrayList(fragmentManagerState.f7001r.length);
            int i11 = 0;
            while (true) {
                BackStackState[] backStackStateArr = fragmentManagerState.f7001r;
                if (i11 >= backStackStateArr.length) {
                    break;
                }
                C1727a m8779a = backStackStateArr[i11].m8779a(this);
                if (f7048W) {
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append("restoreAllState: back stack #");
                    sb6.append(i11);
                    sb6.append(" (index ");
                    sb6.append(m8779a.f7026u);
                    sb6.append("): ");
                    sb6.append(m8779a);
                    PrintWriter printWriter = new PrintWriter(new C1481c("FragmentManager"));
                    m8779a.m8941k("  ", printWriter, false);
                    printWriter.close();
                }
                this.f7078w.add(m8779a);
                int i12 = m8779a.f7026u;
                if (i12 >= 0) {
                    m9103k1(i12, m8779a);
                }
                i11++;
            }
        } else {
            this.f7078w = null;
        }
        String str3 = fragmentManagerState.f7002s;
        if (str3 != null) {
            Fragment fragment4 = (Fragment) this.f7077v.get(str3);
            this.f7059I = fragment4;
            m9021Z(fragment4);
        }
        this.f7075t = fragmentManagerState.f7003t;
    }

    @Override // androidx.fragment.app.AbstractC1733g
    /* renamed from: f */
    public List mo8995f() {
        List list;
        if (this.f7076u.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f7076u) {
            list = (List) this.f7076u.clone();
        }
        return list;
    }

    /* renamed from: f0 */
    public void m9095f0() {
        this.f7061K = false;
        this.f7062L = false;
        m9024g0(3);
    }

    @Override // androidx.fragment.app.AbstractC1733g
    /* renamed from: g */
    public void mo8996g(int i11, int i12) {
        if (i11 >= 0) {
            m9102k0(new l(null, i11, i12), false);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i11);
    }

    /* renamed from: g1 */
    public Parcelable m9096g1() {
        ArrayList arrayList;
        int size;
        m9037u0();
        m9025j0();
        m9109n0();
        this.f7061K = true;
        BackStackState[] backStackStateArr = null;
        if (this.f7077v.isEmpty()) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList(this.f7077v.size());
        boolean z11 = false;
        for (Fragment fragment : this.f7077v.values()) {
            if (fragment != null) {
                if (fragment.f6923G != this) {
                    m9030p1(new IllegalStateException("Failure saving state: active " + fragment + " was removed from the FragmentManager"));
                }
                FragmentState fragmentState = new FragmentState(fragment);
                arrayList2.add(fragmentState);
                if (fragment.f6955p > 0 && fragmentState.f7005B == null) {
                    fragmentState.f7005B = m9098h1(fragment);
                    String str = fragment.f6962w;
                    if (str != null) {
                        Fragment fragment2 = (Fragment) this.f7077v.get(str);
                        if (fragment2 == null) {
                            m9030p1(new IllegalStateException("Failure saving state: " + fragment + " has target not in fragment manager: " + fragment.f6962w));
                        }
                        if (fragmentState.f7005B == null) {
                            fragmentState.f7005B = new Bundle();
                        }
                        m9085Z0(fragmentState.f7005B, "android:target_state", fragment2);
                        int i11 = fragment.f6963x;
                        if (i11 != 0) {
                            fragmentState.f7005B.putInt("android:target_req_state", i11);
                        }
                    }
                } else {
                    fragmentState.f7005B = fragment.f6956q;
                }
                if (f7048W) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Saved state of ");
                    sb2.append(fragment);
                    sb2.append(": ");
                    sb2.append(fragmentState.f7005B);
                }
                z11 = true;
            }
        }
        if (!z11) {
            return null;
        }
        int size2 = this.f7076u.size();
        if (size2 > 0) {
            arrayList = new ArrayList(size2);
            Iterator it = this.f7076u.iterator();
            while (it.hasNext()) {
                Fragment fragment3 = (Fragment) it.next();
                arrayList.add(fragment3.f6959t);
                if (fragment3.f6923G != this) {
                    m9030p1(new IllegalStateException("Failure saving state: active " + fragment3 + " was removed from the FragmentManager"));
                }
                if (f7048W) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("saveAllState: adding fragment (");
                    sb3.append(fragment3.f6959t);
                    sb3.append("): ");
                    sb3.append(fragment3);
                }
            }
        } else {
            arrayList = null;
        }
        ArrayList arrayList3 = this.f7078w;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            backStackStateArr = new BackStackState[size];
            for (int i12 = 0; i12 < size; i12++) {
                backStackStateArr[i12] = new BackStackState((C1727a) this.f7078w.get(i12));
                if (f7048W) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("saveAllState: adding back stack #");
                    sb4.append(i12);
                    sb4.append(": ");
                    sb4.append(this.f7078w.get(i12));
                }
            }
        }
        FragmentManagerState fragmentManagerState = new FragmentManagerState();
        fragmentManagerState.f6999p = arrayList2;
        fragmentManagerState.f7000q = arrayList;
        fragmentManagerState.f7001r = backStackStateArr;
        Fragment fragment4 = this.f7059I;
        if (fragment4 != null) {
            fragmentManagerState.f7002s = fragment4.f6959t;
        }
        fragmentManagerState.f7003t = this.f7075t;
        return fragmentManagerState;
    }

    @Override // androidx.fragment.app.AbstractC1733g
    /* renamed from: h */
    public boolean mo8997h() {
        m9038v();
        return m9019W0(null, -1, 0);
    }

    /* renamed from: h0 */
    public void m9097h0() {
        this.f7062L = true;
        m9024g0(2);
    }

    /* renamed from: h1 */
    Bundle m9098h1(Fragment fragment) {
        if (this.f7068R == null) {
            this.f7068R = new Bundle();
        }
        fragment.m8820S0(this.f7068R);
        m9073S(fragment, this.f7068R, false);
        Bundle bundle = null;
        if (!this.f7068R.isEmpty()) {
            Bundle bundle2 = this.f7068R;
            this.f7068R = null;
            bundle = bundle2;
        }
        if (fragment.f6938V != null) {
            m9100i1(fragment);
        }
        if (fragment.f6957r != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", fragment.f6957r);
        }
        if (!fragment.f6941Y) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", fragment.f6941Y);
        }
        return bundle;
    }

    @Override // androidx.fragment.app.AbstractC1733g
    /* renamed from: i */
    public void mo8998i(AbstractC1733g.a aVar, boolean z11) {
        this.f7054D.add(new i(aVar, z11));
    }

    /* renamed from: i0 */
    void m9099i0() {
        if (this.f7064N) {
            this.f7064N = false;
            m9112o1();
        }
    }

    /* renamed from: i1 */
    void m9100i1(Fragment fragment) {
        if (fragment.f6939W == null) {
            return;
        }
        SparseArray sparseArray = this.f7069S;
        if (sparseArray == null) {
            this.f7069S = new SparseArray();
        } else {
            sparseArray.clear();
        }
        fragment.f6939W.saveHierarchyState(this.f7069S);
        if (this.f7069S.size() > 0) {
            fragment.f6957r = this.f7069S;
            this.f7069S = null;
        }
    }

    /* renamed from: j1 */
    void m9101j1() {
        boolean z11;
        synchronized (this) {
            try {
                ArrayList arrayList = this.f7070T;
                boolean z12 = false;
                if (arrayList != null && !arrayList.isEmpty()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                ArrayList arrayList2 = this.f7073r;
                if (arrayList2 != null && arrayList2.size() == 1) {
                    z12 = true;
                }
                if (z11 || z12) {
                    this.f7056F.m8989f().removeCallbacks(this.f7072V);
                    this.f7056F.m8989f().post(this.f7072V);
                    m9034r1();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.fragment.app.AbstractC1733g
    /* renamed from: k */
    public void mo9000k(AbstractC1733g.a aVar) {
        synchronized (this.f7054D) {
            try {
                int size = this.f7054D.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size) {
                        break;
                    }
                    if (((i) this.f7054D.get(i11)).f7104a == aVar) {
                        this.f7054D.remove(i11);
                        break;
                    }
                    i11++;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x002a, code lost:            return;     */
    /* renamed from: k0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m9102k0(k kVar, boolean z11) {
        if (!z11) {
            m9038v();
        }
        synchronized (this) {
            try {
                if (!this.f7063M && this.f7056F != null) {
                    if (this.f7073r == null) {
                        this.f7073r = new ArrayList();
                    }
                    this.f7073r.add(kVar);
                    m9101j1();
                    return;
                }
                throw new IllegalStateException("Activity has been destroyed");
            } finally {
            }
        }
    }

    /* renamed from: k1 */
    public void m9103k1(int i11, C1727a c1727a) {
        synchronized (this) {
            try {
                if (this.f7051A == null) {
                    this.f7051A = new ArrayList();
                }
                int size = this.f7051A.size();
                if (i11 < size) {
                    if (f7048W) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Setting back stack index ");
                        sb2.append(i11);
                        sb2.append(" to ");
                        sb2.append(c1727a);
                    }
                    this.f7051A.set(i11, c1727a);
                } else {
                    while (size < i11) {
                        this.f7051A.add(null);
                        if (this.f7052B == null) {
                            this.f7052B = new ArrayList();
                        }
                        if (f7048W) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("Adding available back stack index ");
                            sb3.append(size);
                        }
                        this.f7052B.add(Integer.valueOf(size));
                        size++;
                    }
                    if (f7048W) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("Adding back stack index ");
                        sb4.append(i11);
                        sb4.append(" with ");
                        sb4.append(c1727a);
                    }
                    this.f7051A.add(c1727a);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: l1 */
    public void m9104l1(Fragment fragment, AbstractC1785o.b bVar) {
        if (this.f7077v.get(fragment.f6959t) == fragment && (fragment.f6924H == null || fragment.m8878s() == this)) {
            fragment.f6949g0 = bVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    /* renamed from: m */
    public void m9105m(C1727a c1727a) {
        if (this.f7078w == null) {
            this.f7078w = new ArrayList();
        }
        this.f7078w.add(c1727a);
    }

    /* renamed from: m0 */
    void m9106m0(Fragment fragment) {
        if (fragment.f6918B && !fragment.f6921E) {
            fragment.m8794E0(fragment.m8801I0(fragment.f6956q), null, fragment.f6956q);
            View view = fragment.f6938V;
            if (view != null) {
                fragment.f6939W = view;
                view.setSaveFromParentEnabled(false);
                if (fragment.f6930N) {
                    fragment.f6938V.setVisibility(8);
                }
                fragment.m8887w0(fragment.f6938V, fragment.f6956q);
                m9079V(fragment, fragment.f6938V, fragment.f6956q, false);
                return;
            }
            fragment.f6939W = null;
        }
    }

    /* renamed from: m1 */
    public void m9107m1(Fragment fragment) {
        if (fragment != null && (this.f7077v.get(fragment.f6959t) != fragment || (fragment.f6924H != null && fragment.m8878s() != this))) {
            throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
        }
        Fragment fragment2 = this.f7059I;
        this.f7059I = fragment;
        m9021Z(fragment2);
        m9021Z(this.f7059I);
    }

    /* renamed from: n */
    public void m9108n(Fragment fragment, boolean z11) {
        if (f7048W) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("add: ");
            sb2.append(fragment);
        }
        m9063L0(fragment);
        if (!fragment.f6931O) {
            if (!this.f7076u.contains(fragment)) {
                synchronized (this.f7076u) {
                    this.f7076u.add(fragment);
                }
                fragment.f6965z = true;
                fragment.f6917A = false;
                if (fragment.f6938V == null) {
                    fragment.f6945c0 = false;
                }
                if (m9015G0(fragment)) {
                    this.f7060J = true;
                }
                if (z11) {
                    m9074S0(fragment);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Fragment already added: " + fragment);
        }
    }

    /* renamed from: n0 */
    public boolean m9109n0() {
        m9027l0(true);
        boolean z11 = false;
        while (m9040w0(this.f7065O, this.f7066P)) {
            this.f7074s = true;
            try {
                m9022b1(this.f7065O, this.f7066P);
                m9039w();
                z11 = true;
            } catch (Throwable th2) {
                m9039w();
                throw th2;
            }
        }
        m9034r1();
        m9099i0();
        m9035t();
        return z11;
    }

    /* renamed from: n1 */
    public void m9110n1(Fragment fragment) {
        if (f7048W) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("show: ");
            sb2.append(fragment);
        }
        if (fragment.f6930N) {
            fragment.f6930N = false;
            fragment.f6945c0 = !fragment.f6945c0;
        }
    }

    /* renamed from: o */
    void m9111o(Fragment fragment) {
        if (!m9059J0() && this.f7071U.m9131M(fragment) && f7048W) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Updating retained Fragments: Added ");
            sb2.append(fragment);
        }
    }

    /* renamed from: o1 */
    void m9112o1() {
        for (Fragment fragment : this.f7077v.values()) {
            if (fragment != null) {
                m9080V0(fragment);
            }
        }
    }

    @Override // android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f7106a);
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(0);
        }
        String str2 = attributeValue;
        int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        String string = obtainStyledAttributes.getString(2);
        obtainStyledAttributes.recycle();
        if (str2 == null || !C1731e.m8983b(context.getClassLoader(), str2)) {
            return null;
        }
        int id2 = view != null ? view.getId() : 0;
        if (id2 == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + str2);
        }
        Fragment m9115r0 = resourceId != -1 ? m9115r0(resourceId) : null;
        if (m9115r0 == null && string != null) {
            m9115r0 = mo8993d(string);
        }
        if (m9115r0 == null && id2 != -1) {
            m9115r0 = m9115r0(id2);
        }
        if (f7048W) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("onCreateView: id=0x");
            sb2.append(Integer.toHexString(resourceId));
            sb2.append(" fname=");
            sb2.append(str2);
            sb2.append(" existing=");
            sb2.append(m9115r0);
        }
        if (m9115r0 == null) {
            m9115r0 = mo8994e().mo8986a(context.getClassLoader(), str2);
            m9115r0.f6918B = true;
            m9115r0.f6927K = resourceId != 0 ? resourceId : id2;
            m9115r0.f6928L = id2;
            m9115r0.f6929M = string;
            m9115r0.f6919C = true;
            m9115r0.f6923G = this;
            AbstractC1732f abstractC1732f = this.f7056F;
            m9115r0.f6924H = abstractC1732f;
            m9115r0.m8859j0(abstractC1732f.m8988e(), attributeSet, m9115r0.f6956q);
            m9108n(m9115r0, true);
        } else if (!m9115r0.f6919C) {
            m9115r0.f6919C = true;
            AbstractC1732f abstractC1732f2 = this.f7056F;
            m9115r0.f6924H = abstractC1732f2;
            m9115r0.m8859j0(abstractC1732f2.m8988e(), attributeSet, m9115r0.f6956q);
        } else {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id2) + " with another fragment for " + str2);
        }
        Fragment fragment = m9115r0;
        if (this.f7055E < 1 && fragment.f6918B) {
            m9076T0(fragment, 1, 0, 0, false);
        } else {
            m9074S0(fragment);
        }
        View view2 = fragment.f6938V;
        if (view2 != null) {
            if (resourceId != 0) {
                view2.setId(resourceId);
            }
            if (fragment.f6938V.getTag() == null) {
                fragment.f6938V.setTag(string);
            }
            return fragment.f6938V;
        }
        throw new IllegalStateException("Fragment " + str2 + " did not create a view.");
    }

    /* renamed from: p */
    public int m9113p(C1727a c1727a) {
        synchronized (this) {
            try {
                ArrayList arrayList = this.f7052B;
                if (arrayList != null && arrayList.size() > 0) {
                    int intValue = ((Integer) this.f7052B.remove(r0.size() - 1)).intValue();
                    if (f7048W) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Adding back stack index ");
                        sb2.append(intValue);
                        sb2.append(" with ");
                        sb2.append(c1727a);
                    }
                    this.f7051A.set(intValue, c1727a);
                    return intValue;
                }
                if (this.f7051A == null) {
                    this.f7051A = new ArrayList();
                }
                int size = this.f7051A.size();
                if (f7048W) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Setting back stack index ");
                    sb3.append(size);
                    sb3.append(" to ");
                    sb3.append(c1727a);
                }
                this.f7051A.add(c1727a);
                return size;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: r */
    public void m9114r(AbstractC1732f abstractC1732f, AbstractC1729c abstractC1729c, Fragment fragment) {
        if (this.f7056F == null) {
            this.f7056F = abstractC1732f;
            this.f7057G = abstractC1729c;
            this.f7058H = fragment;
            if (fragment != null) {
                m9034r1();
            }
            if (abstractC1732f instanceof InterfaceC1012f) {
                InterfaceC1012f interfaceC1012f = (InterfaceC1012f) abstractC1732f;
                OnBackPressedDispatcher mo4642Ko = interfaceC1012f.mo4642Ko();
                this.f7080y = mo4642Ko;
                InterfaceC1801w interfaceC1801w = interfaceC1012f;
                if (fragment != null) {
                    interfaceC1801w = fragment;
                }
                mo4642Ko.m4656a(interfaceC1801w, this.f7081z);
            }
            if (fragment != null) {
                this.f7071U = fragment.f6923G.m9123y0(fragment);
                return;
            } else if (abstractC1732f instanceof InterfaceC1756a1) {
                this.f7071U = C1735i.m9129P(((InterfaceC1756a1) abstractC1732f).mo4644Oc());
                return;
            } else {
                this.f7071U = new C1735i(false);
                return;
            }
        }
        throw new IllegalStateException("Already attached");
    }

    /* renamed from: r0 */
    public Fragment m9115r0(int i11) {
        for (int size = this.f7076u.size() - 1; size >= 0; size--) {
            Fragment fragment = (Fragment) this.f7076u.get(size);
            if (fragment != null && fragment.f6927K == i11) {
                return fragment;
            }
        }
        for (Fragment fragment2 : this.f7077v.values()) {
            if (fragment2 != null && fragment2.f6927K == i11) {
                return fragment2;
            }
        }
        return null;
    }

    /* renamed from: s */
    public void m9116s(Fragment fragment) {
        if (f7048W) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("attach: ");
            sb2.append(fragment);
        }
        if (fragment.f6931O) {
            fragment.f6931O = false;
            if (!fragment.f6965z) {
                if (!this.f7076u.contains(fragment)) {
                    if (f7048W) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("add from attach: ");
                        sb3.append(fragment);
                    }
                    synchronized (this.f7076u) {
                        this.f7076u.add(fragment);
                    }
                    fragment.f6965z = true;
                    if (m9015G0(fragment)) {
                        this.f7060J = true;
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("Fragment already added: " + fragment);
            }
        }
    }

    /* renamed from: s0 */
    public Fragment m9117s0(String str) {
        Fragment m8849g;
        for (Fragment fragment : this.f7077v.values()) {
            if (fragment != null && (m8849g = fragment.m8849g(str)) != null) {
                return m8849g;
            }
        }
        return null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        Fragment fragment = this.f7058H;
        if (fragment != null) {
            AbstractC1480b.m7473a(fragment, sb2);
        } else {
            AbstractC1480b.m7473a(this.f7056F, sb2);
        }
        sb2.append("}}");
        return sb2.toString();
    }

    /* renamed from: u */
    boolean m9118u() {
        boolean z11 = false;
        for (Fragment fragment : this.f7077v.values()) {
            if (fragment != null) {
                z11 = m9015G0(fragment);
            }
            if (z11) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: v0 */
    public void m9119v0(int i11) {
        synchronized (this) {
            try {
                this.f7051A.set(i11, null);
                if (this.f7052B == null) {
                    this.f7052B = new ArrayList();
                }
                if (f7048W) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Freeing back stack index ");
                    sb2.append(i11);
                }
                this.f7052B.add(Integer.valueOf(i11));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: x */
    void m9120x(C1727a c1727a, boolean z11, boolean z12, boolean z13) {
        if (z11) {
            c1727a.m8943m(z13);
        } else {
            c1727a.m8942l();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(c1727a);
        arrayList2.add(Boolean.valueOf(z11));
        if (z12) {
            AbstractC1737k.m9142B(this, arrayList, arrayList2, 0, 1, true);
        }
        if (z13) {
            m9072R0(this.f7055E, true);
        }
        for (Fragment fragment : this.f7077v.values()) {
            if (fragment != null && fragment.f6938V != null && fragment.f6944b0 && c1727a.m8946p(fragment.f6928L)) {
                float f11 = fragment.f6946d0;
                if (f11 > 0.0f) {
                    fragment.f6938V.setAlpha(f11);
                }
                if (z13) {
                    fragment.f6946d0 = 0.0f;
                } else {
                    fragment.f6946d0 = -1.0f;
                    fragment.f6944b0 = false;
                }
            }
        }
    }

    /* renamed from: x0 */
    public int m9121x0() {
        ArrayList arrayList = this.f7078w;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    /* renamed from: y */
    void m9122y(Fragment fragment) {
        int i11;
        Animator animator;
        if (fragment.f6938V != null) {
            g m9061K0 = m9061K0(fragment, fragment.m8886w(), !fragment.f6930N, fragment.m8888x());
            if (m9061K0 != null && (animator = m9061K0.f7098b) != null) {
                animator.setTarget(fragment.f6938V);
                if (fragment.f6930N) {
                    if (fragment.m8805L()) {
                        fragment.m8846e1(false);
                    } else {
                        ViewGroup viewGroup = fragment.f6937U;
                        View view = fragment.f6938V;
                        viewGroup.startViewTransition(view);
                        m9061K0.f7098b.addListener(new e(viewGroup, view, fragment));
                    }
                } else {
                    fragment.f6938V.setVisibility(0);
                }
                m9061K0.f7098b.start();
            } else {
                if (m9061K0 != null) {
                    fragment.f6938V.startAnimation(m9061K0.f7097a);
                    m9061K0.f7097a.start();
                }
                if (fragment.f6930N && !fragment.m8805L()) {
                    i11 = 8;
                } else {
                    i11 = 0;
                }
                fragment.f6938V.setVisibility(i11);
                if (fragment.m8805L()) {
                    fragment.m8846e1(false);
                }
            }
        }
        if (fragment.f6965z && m9015G0(fragment)) {
            this.f7060J = true;
        }
        fragment.f6945c0 = false;
        fragment.m8853h0(fragment.f6930N);
    }

    /* renamed from: y0 */
    C1735i m9123y0(Fragment fragment) {
        return this.f7071U.m9133O(fragment);
    }

    /* renamed from: z */
    public void m9124z(Fragment fragment) {
        if (f7048W) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("detach: ");
            sb2.append(fragment);
        }
        if (!fragment.f6931O) {
            fragment.f6931O = true;
            if (fragment.f6965z) {
                if (f7048W) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("remove from detach: ");
                    sb3.append(fragment);
                }
                synchronized (this.f7076u) {
                    this.f7076u.remove(fragment);
                }
                if (m9015G0(fragment)) {
                    this.f7060J = true;
                }
                fragment.f6965z = false;
            }
        }
    }

    /* renamed from: z0 */
    public Fragment m9125z0(Bundle bundle, String str) {
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        Fragment fragment = (Fragment) this.f7077v.get(string);
        if (fragment == null) {
            m9030p1(new IllegalStateException("Fragment no longer exists for key " + str + ": unique id " + string));
        }
        return fragment;
    }

    /* renamed from: androidx.fragment.app.h$g */
    /* loaded from: classes2.dex */
    public static class g {

        /* renamed from: a */
        public final Animation f7097a;

        /* renamed from: b */
        public final Animator f7098b;

        g(Animation animation) {
            this.f7097a = animation;
            this.f7098b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }

        g(Animator animator) {
            this.f7097a = null;
            this.f7098b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }
    }

    /* renamed from: androidx.fragment.app.h$h */
    /* loaded from: classes2.dex */
    public static class h extends AnimationSet implements Runnable {

        /* renamed from: p */
        private final ViewGroup f7099p;

        /* renamed from: q */
        private final View f7100q;

        /* renamed from: r */
        private boolean f7101r;

        /* renamed from: s */
        private boolean f7102s;

        /* renamed from: t */
        private boolean f7103t;

        h(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f7103t = true;
            this.f7099p = viewGroup;
            this.f7100q = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long j11, Transformation transformation) {
            this.f7103t = true;
            if (this.f7101r) {
                return !this.f7102s;
            }
            if (!super.getTransformation(j11, transformation)) {
                this.f7101r = true;
                ViewTreeObserverOnPreDrawListenerC1563j0.m7780a(this.f7099p, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!this.f7101r && this.f7103t) {
                this.f7103t = false;
                this.f7099p.post(this);
            } else {
                this.f7099p.endViewTransition(this.f7100q);
                this.f7102s = true;
            }
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long j11, Transformation transformation, float f11) {
            this.f7103t = true;
            if (this.f7101r) {
                return !this.f7102s;
            }
            if (!super.getTransformation(j11, transformation, f11)) {
                this.f7101r = true;
                ViewTreeObserverOnPreDrawListenerC1563j0.m7780a(this.f7099p, this);
            }
            return true;
        }
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
