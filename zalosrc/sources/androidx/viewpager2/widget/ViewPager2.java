package androidx.viewpager2.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.AbstractC1579n0;
import androidx.core.view.accessibility.C1507g0;
import androidx.core.view.accessibility.InterfaceC1513j0;
import androidx.recyclerview.widget.C1929v;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import p353n2.AbstractC23523a;

/* loaded from: classes2.dex */
public final class ViewPager2 extends ViewGroup {

    /* renamed from: J */
    static boolean f8870J = true;

    /* renamed from: A */
    C2085e f8871A;

    /* renamed from: B */
    private C2082b f8872B;

    /* renamed from: C */
    private C2083c f8873C;

    /* renamed from: D */
    private C2084d f8874D;

    /* renamed from: E */
    private RecyclerView.AbstractC1885l f8875E;

    /* renamed from: F */
    private boolean f8876F;

    /* renamed from: G */
    private boolean f8877G;

    /* renamed from: H */
    private int f8878H;

    /* renamed from: I */
    AbstractC2071e f8879I;

    /* renamed from: p */
    private final Rect f8880p;

    /* renamed from: q */
    private final Rect f8881q;

    /* renamed from: r */
    private C2082b f8882r;

    /* renamed from: s */
    int f8883s;

    /* renamed from: t */
    boolean f8884t;

    /* renamed from: u */
    private RecyclerView.AbstractC1882i f8885u;

    /* renamed from: v */
    private LinearLayoutManager f8886v;

    /* renamed from: w */
    private int f8887w;

    /* renamed from: x */
    private Parcelable f8888x;

    /* renamed from: y */
    RecyclerView f8889y;

    /* renamed from: z */
    private C1929v f8890z;

    /* renamed from: androidx.viewpager2.widget.ViewPager2$a */
    /* loaded from: classes2.dex */
    class C2067a extends AbstractC2073g {
        C2067a() {
            super(null);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC2073g, androidx.recyclerview.widget.RecyclerView.AbstractC1882i
        /* renamed from: a */
        public void mo10026a() {
            ViewPager2 viewPager2 = ViewPager2.this;
            viewPager2.f8884t = true;
            viewPager2.f8871A.m11302o();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.viewpager2.widget.ViewPager2$b */
    /* loaded from: classes2.dex */
    public class C2068b extends AbstractC2075i {
        C2068b() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC2075i
        /* renamed from: a */
        public void mo11254a(int i11) {
            if (i11 == 0) {
                ViewPager2.this.m11249n();
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC2075i
        /* renamed from: c */
        public void mo11255c(int i11) {
            ViewPager2 viewPager2 = ViewPager2.this;
            if (viewPager2.f8883s != i11) {
                viewPager2.f8883s = i11;
                viewPager2.f8879I.mo11272q();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.viewpager2.widget.ViewPager2$c */
    /* loaded from: classes2.dex */
    public class C2069c extends AbstractC2075i {
        C2069c() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC2075i
        /* renamed from: c */
        public void mo11255c(int i11) {
            ViewPager2.this.clearFocus();
            if (ViewPager2.this.hasFocus()) {
                ViewPager2.this.f8889y.requestFocus(2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.viewpager2.widget.ViewPager2$d */
    /* loaded from: classes2.dex */
    public class C2070d implements RecyclerView.InterfaceC1889p {
        C2070d() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC1889p
        /* renamed from: b */
        public void mo10173b(View view) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC1889p
        /* renamed from: d */
        public void mo10174d(View view) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            if (((ViewGroup.MarginLayoutParams) layoutParams).width == -1 && ((ViewGroup.MarginLayoutParams) layoutParams).height == -1) {
            } else {
                throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.viewpager2.widget.ViewPager2$e */
    /* loaded from: classes2.dex */
    public abstract class AbstractC2071e {
        private AbstractC2071e() {
        }

        /* renamed from: a */
        boolean mo11256a() {
            return false;
        }

        /* renamed from: b */
        boolean mo11257b(int i11) {
            return false;
        }

        /* renamed from: c */
        boolean mo11258c(int i11, Bundle bundle) {
            return false;
        }

        /* renamed from: d */
        boolean mo11259d() {
            return false;
        }

        /* renamed from: e */
        void mo11260e(RecyclerView.AbstractC1880g abstractC1880g) {
        }

        /* renamed from: f */
        void mo11261f(RecyclerView.AbstractC1880g abstractC1880g) {
        }

        /* renamed from: g */
        String mo11262g() {
            throw new IllegalStateException("Not implemented.");
        }

        /* renamed from: h */
        void mo11263h(C2082b c2082b, RecyclerView recyclerView) {
        }

        /* renamed from: i */
        void mo11264i(AccessibilityNodeInfo accessibilityNodeInfo) {
        }

        /* renamed from: j */
        void mo11265j(C1507g0 c1507g0) {
        }

        /* renamed from: k */
        boolean mo11266k(int i11) {
            throw new IllegalStateException("Not implemented.");
        }

        /* renamed from: l */
        boolean mo11267l(int i11, Bundle bundle) {
            throw new IllegalStateException("Not implemented.");
        }

        /* renamed from: m */
        void mo11268m() {
        }

        /* renamed from: n */
        CharSequence mo11269n() {
            throw new IllegalStateException("Not implemented.");
        }

        /* renamed from: o */
        void mo11270o(AccessibilityEvent accessibilityEvent) {
        }

        /* renamed from: p */
        void mo11271p() {
        }

        /* renamed from: q */
        void mo11272q() {
        }

        /* renamed from: r */
        void mo11273r() {
        }

        /* renamed from: s */
        void mo11274s() {
        }

        /* synthetic */ AbstractC2071e(ViewPager2 viewPager2, C2067a c2067a) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.viewpager2.widget.ViewPager2$f */
    /* loaded from: classes2.dex */
    public class C2072f extends AbstractC2071e {
        C2072f() {
            super(ViewPager2.this, null);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC2071e
        /* renamed from: b */
        public boolean mo11257b(int i11) {
            if ((i11 == 8192 || i11 == 4096) && !ViewPager2.this.m11244e()) {
                return true;
            }
            return false;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC2071e
        /* renamed from: d */
        public boolean mo11259d() {
            return true;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC2071e
        /* renamed from: j */
        public void mo11265j(C1507g0 c1507g0) {
            if (!ViewPager2.this.m11244e()) {
                c1507g0.m7608U(C1507g0.a.f6456r);
                c1507g0.m7608U(C1507g0.a.f6455q);
                c1507g0.m7653y0(false);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC2071e
        /* renamed from: k */
        public boolean mo11266k(int i11) {
            if (mo11257b(i11)) {
                return false;
            }
            throw new IllegalStateException();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC2071e
        /* renamed from: n */
        public CharSequence mo11269n() {
            if (mo11259d()) {
                return "androidx.viewpager.widget.ViewPager";
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$g */
    /* loaded from: classes2.dex */
    private static abstract class AbstractC2073g extends RecyclerView.AbstractC1882i {
        private AbstractC2073g() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1882i
        /* renamed from: a */
        public abstract void mo10026a();

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1882i
        /* renamed from: b */
        public final void mo10027b(int i11, int i12) {
            mo10026a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1882i
        /* renamed from: c */
        public final void mo10028c(int i11, int i12, Object obj) {
            mo10026a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1882i
        /* renamed from: d */
        public final void mo10029d(int i11, int i12) {
            mo10026a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1882i
        /* renamed from: e */
        public final void mo10030e(int i11, int i12, int i13) {
            mo10026a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1882i
        /* renamed from: f */
        public final void mo10031f(int i11, int i12) {
            mo10026a();
        }

        /* synthetic */ AbstractC2073g(C2067a c2067a) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.viewpager2.widget.ViewPager2$h */
    /* loaded from: classes2.dex */
    public class C2074h extends LinearLayoutManager {
        C2074h(Context context) {
            super(context);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.recyclerview.widget.LinearLayoutManager
        /* renamed from: K1 */
        public void mo9731K1(RecyclerView.C1899z c1899z, int[] iArr) {
            int offscreenPageLimit = ViewPager2.this.getOffscreenPageLimit();
            if (offscreenPageLimit == -1) {
                super.mo9731K1(c1899z, iArr);
                return;
            }
            int pageSize = ViewPager2.this.getPageSize() * offscreenPageLimit;
            iArr[0] = pageSize;
            iArr[1] = pageSize;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1888o
        /* renamed from: L0 */
        public void mo10096L0(RecyclerView.C1894u c1894u, RecyclerView.C1899z c1899z, C1507g0 c1507g0) {
            super.mo10096L0(c1894u, c1899z, c1507g0);
            ViewPager2.this.f8879I.mo11265j(c1507g0);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1888o
        /* renamed from: f1 */
        public boolean mo10123f1(RecyclerView.C1894u c1894u, RecyclerView.C1899z c1899z, int i11, Bundle bundle) {
            if (ViewPager2.this.f8879I.mo11257b(i11)) {
                return ViewPager2.this.f8879I.mo11266k(i11);
            }
            return super.mo10123f1(c1894u, c1899z, i11, bundle);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1888o
        /* renamed from: q1 */
        public boolean mo10150q1(RecyclerView recyclerView, View view, Rect rect, boolean z11, boolean z12) {
            return false;
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$i */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC2075i {
        /* renamed from: a */
        public void mo11254a(int i11) {
        }

        /* renamed from: b */
        public void mo11275b(int i11, float f11, int i12) {
        }

        /* renamed from: c */
        public abstract void mo11255c(int i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.viewpager2.widget.ViewPager2$j */
    /* loaded from: classes2.dex */
    public class C2076j extends AbstractC2071e {

        /* renamed from: b */
        private final InterfaceC1513j0 f8901b;

        /* renamed from: c */
        private final InterfaceC1513j0 f8902c;

        /* renamed from: d */
        private RecyclerView.AbstractC1882i f8903d;

        /* renamed from: androidx.viewpager2.widget.ViewPager2$j$a */
        /* loaded from: classes2.dex */
        class a implements InterfaceC1513j0 {
            a() {
            }

            @Override // androidx.core.view.accessibility.InterfaceC1513j0
            /* renamed from: a */
            public boolean mo7681a(View view, InterfaceC1513j0.a aVar) {
                C2076j.this.m11278v(((ViewPager2) view).getCurrentItem() + 1);
                return true;
            }
        }

        /* renamed from: androidx.viewpager2.widget.ViewPager2$j$b */
        /* loaded from: classes2.dex */
        class b implements InterfaceC1513j0 {
            b() {
            }

            @Override // androidx.core.view.accessibility.InterfaceC1513j0
            /* renamed from: a */
            public boolean mo7681a(View view, InterfaceC1513j0.a aVar) {
                C2076j.this.m11278v(((ViewPager2) view).getCurrentItem() - 1);
                return true;
            }
        }

        /* renamed from: androidx.viewpager2.widget.ViewPager2$j$c */
        /* loaded from: classes2.dex */
        class c extends AbstractC2073g {
            c() {
                super(null);
            }

            @Override // androidx.viewpager2.widget.ViewPager2.AbstractC2073g, androidx.recyclerview.widget.RecyclerView.AbstractC1882i
            /* renamed from: a */
            public void mo10026a() {
                C2076j.this.m11279w();
            }
        }

        C2076j() {
            super(ViewPager2.this, null);
            this.f8901b = new a();
            this.f8902c = new b();
        }

        /* renamed from: t */
        private void m11276t(AccessibilityNodeInfo accessibilityNodeInfo) {
            int i11;
            int i12;
            if (ViewPager2.this.getAdapter() != null) {
                if (ViewPager2.this.getOrientation() == 1) {
                    i11 = ViewPager2.this.getAdapter().mo10003k();
                } else {
                    i12 = ViewPager2.this.getAdapter().mo10003k();
                    i11 = 0;
                    C1507g0.m7571I0(accessibilityNodeInfo).m7622f0(C1507g0.b.m7661b(i11, i12, false, 0));
                }
            } else {
                i11 = 0;
            }
            i12 = 0;
            C1507g0.m7571I0(accessibilityNodeInfo).m7622f0(C1507g0.b.m7661b(i11, i12, false, 0));
        }

        /* renamed from: u */
        private void m11277u(AccessibilityNodeInfo accessibilityNodeInfo) {
            int mo10003k;
            RecyclerView.AbstractC1880g adapter = ViewPager2.this.getAdapter();
            if (adapter != null && (mo10003k = adapter.mo10003k()) != 0 && ViewPager2.this.m11244e()) {
                if (ViewPager2.this.f8883s > 0) {
                    accessibilityNodeInfo.addAction(8192);
                }
                if (ViewPager2.this.f8883s < mo10003k - 1) {
                    accessibilityNodeInfo.addAction(4096);
                }
                accessibilityNodeInfo.setScrollable(true);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC2071e
        /* renamed from: a */
        public boolean mo11256a() {
            return true;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC2071e
        /* renamed from: c */
        public boolean mo11258c(int i11, Bundle bundle) {
            return i11 == 8192 || i11 == 4096;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC2071e
        /* renamed from: e */
        public void mo11260e(RecyclerView.AbstractC1880g abstractC1880g) {
            m11279w();
            if (abstractC1880g != null) {
                abstractC1880g.m9998I(this.f8903d);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC2071e
        /* renamed from: f */
        public void mo11261f(RecyclerView.AbstractC1880g abstractC1880g) {
            if (abstractC1880g != null) {
                abstractC1880g.m10000K(this.f8903d);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC2071e
        /* renamed from: g */
        public String mo11262g() {
            if (mo11256a()) {
                return "androidx.viewpager.widget.ViewPager";
            }
            throw new IllegalStateException();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC2071e
        /* renamed from: h */
        public void mo11263h(C2082b c2082b, RecyclerView recyclerView) {
            AbstractC1579n0.m7823L0(recyclerView, 2);
            this.f8903d = new c();
            if (AbstractC1579n0.m7808E(ViewPager2.this) == 0) {
                AbstractC1579n0.m7823L0(ViewPager2.this, 1);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC2071e
        /* renamed from: i */
        public void mo11264i(AccessibilityNodeInfo accessibilityNodeInfo) {
            m11276t(accessibilityNodeInfo);
            m11277u(accessibilityNodeInfo);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC2071e
        /* renamed from: l */
        public boolean mo11267l(int i11, Bundle bundle) {
            int currentItem;
            if (mo11258c(i11, bundle)) {
                if (i11 == 8192) {
                    currentItem = ViewPager2.this.getCurrentItem() - 1;
                } else {
                    currentItem = ViewPager2.this.getCurrentItem() + 1;
                }
                m11278v(currentItem);
                return true;
            }
            throw new IllegalStateException();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC2071e
        /* renamed from: m */
        public void mo11268m() {
            m11279w();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC2071e
        /* renamed from: o */
        public void mo11270o(AccessibilityEvent accessibilityEvent) {
            accessibilityEvent.setSource(ViewPager2.this);
            accessibilityEvent.setClassName(mo11262g());
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC2071e
        /* renamed from: p */
        public void mo11271p() {
            m11279w();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC2071e
        /* renamed from: q */
        public void mo11272q() {
            m11279w();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC2071e
        /* renamed from: r */
        public void mo11273r() {
            m11279w();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC2071e
        /* renamed from: s */
        public void mo11274s() {
            m11279w();
        }

        /* renamed from: v */
        void m11278v(int i11) {
            if (ViewPager2.this.m11244e()) {
                ViewPager2.this.m11248k(i11, true);
            }
        }

        /* renamed from: w */
        void m11279w() {
            int mo10003k;
            int i11;
            ViewPager2 viewPager2 = ViewPager2.this;
            int i12 = R.id.accessibilityActionPageLeft;
            AbstractC1579n0.m7904u0(viewPager2, R.id.accessibilityActionPageLeft);
            AbstractC1579n0.m7904u0(viewPager2, R.id.accessibilityActionPageRight);
            AbstractC1579n0.m7904u0(viewPager2, R.id.accessibilityActionPageUp);
            AbstractC1579n0.m7904u0(viewPager2, R.id.accessibilityActionPageDown);
            if (ViewPager2.this.getAdapter() == null || (mo10003k = ViewPager2.this.getAdapter().mo10003k()) == 0 || !ViewPager2.this.m11244e()) {
                return;
            }
            if (ViewPager2.this.getOrientation() == 0) {
                boolean m11243d = ViewPager2.this.m11243d();
                if (m11243d) {
                    i11 = R.id.accessibilityActionPageLeft;
                } else {
                    i11 = R.id.accessibilityActionPageRight;
                }
                if (m11243d) {
                    i12 = R.id.accessibilityActionPageRight;
                }
                if (ViewPager2.this.f8883s < mo10003k - 1) {
                    AbstractC1579n0.m7908w0(viewPager2, new C1507g0.a(i11, null), null, this.f8901b);
                }
                if (ViewPager2.this.f8883s > 0) {
                    AbstractC1579n0.m7908w0(viewPager2, new C1507g0.a(i12, null), null, this.f8902c);
                    return;
                }
                return;
            }
            if (ViewPager2.this.f8883s < mo10003k - 1) {
                AbstractC1579n0.m7908w0(viewPager2, new C1507g0.a(R.id.accessibilityActionPageDown, null), null, this.f8901b);
            }
            if (ViewPager2.this.f8883s > 0) {
                AbstractC1579n0.m7908w0(viewPager2, new C1507g0.a(R.id.accessibilityActionPageUp, null), null, this.f8902c);
            }
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$k */
    /* loaded from: classes2.dex */
    public interface InterfaceC2077k {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.viewpager2.widget.ViewPager2$l */
    /* loaded from: classes2.dex */
    public class C2078l extends C1929v {
        C2078l() {
        }

        @Override // androidx.recyclerview.widget.C1929v, androidx.recyclerview.widget.AbstractC1906a0
        /* renamed from: h */
        public View mo10402h(RecyclerView.AbstractC1888o abstractC1888o) {
            if (ViewPager2.this.m11242c()) {
                return null;
            }
            return super.mo10402h(abstractC1888o);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.viewpager2.widget.ViewPager2$m */
    /* loaded from: classes2.dex */
    public class C2079m extends RecyclerView {
        C2079m(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
        public CharSequence getAccessibilityClassName() {
            if (ViewPager2.this.f8879I.mo11259d()) {
                return ViewPager2.this.f8879I.mo11269n();
            }
            return super.getAccessibilityClassName();
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setFromIndex(ViewPager2.this.f8883s);
            accessibilityEvent.setToIndex(ViewPager2.this.f8883s);
            ViewPager2.this.f8879I.mo11270o(accessibilityEvent);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (ViewPager2.this.m11244e() && super.onInterceptTouchEvent(motionEvent)) {
                return true;
            }
            return false;
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            if (ViewPager2.this.m11244e() && super.onTouchEvent(motionEvent)) {
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.viewpager2.widget.ViewPager2$n */
    /* loaded from: classes2.dex */
    public static class RunnableC2080n implements Runnable {

        /* renamed from: p */
        private final int f8910p;

        /* renamed from: q */
        private final RecyclerView f8911q;

        RunnableC2080n(int i11, RecyclerView recyclerView) {
            this.f8910p = i11;
            this.f8911q = recyclerView;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f8911q.mo9854S1(this.f8910p);
        }
    }

    public ViewPager2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8880p = new Rect();
        this.f8881q = new Rect();
        this.f8882r = new C2082b(3);
        this.f8884t = false;
        this.f8885u = new C2067a();
        this.f8887w = -1;
        this.f8875E = null;
        this.f8876F = false;
        this.f8877G = true;
        this.f8878H = -1;
        m11237b(context, attributeSet);
    }

    /* renamed from: a */
    private RecyclerView.InterfaceC1889p m11236a() {
        return new C2070d();
    }

    /* renamed from: b */
    private void m11237b(Context context, AttributeSet attributeSet) {
        AbstractC2071e c2072f;
        if (f8870J) {
            c2072f = new C2076j();
        } else {
            c2072f = new C2072f();
        }
        this.f8879I = c2072f;
        C2079m c2079m = new C2079m(context);
        this.f8889y = c2079m;
        c2079m.setId(AbstractC1579n0.m7889n());
        this.f8889y.setDescendantFocusability(131072);
        C2074h c2074h = new C2074h(context);
        this.f8886v = c2074h;
        this.f8889y.setLayoutManager(c2074h);
        this.f8889y.setScrollingTouchSlop(1);
        m11240l(context, attributeSet);
        this.f8889y.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.f8889y.m9822C(m11236a());
        C2085e c2085e = new C2085e(this);
        this.f8871A = c2085e;
        this.f8873C = new C2083c(this, c2085e, this.f8889y);
        C2078l c2078l = new C2078l();
        this.f8890z = c2078l;
        c2078l.mo10397b(this.f8889y);
        this.f8889y.m9826E(this.f8871A);
        C2082b c2082b = new C2082b(3);
        this.f8872B = c2082b;
        this.f8871A.m11304r(c2082b);
        C2068b c2068b = new C2068b();
        C2069c c2069c = new C2069c();
        this.f8872B.m11286d(c2068b);
        this.f8872B.m11286d(c2069c);
        this.f8879I.mo11263h(this.f8872B, this.f8889y);
        this.f8872B.m11286d(this.f8882r);
        C2084d c2084d = new C2084d(this.f8886v);
        this.f8874D = c2084d;
        this.f8872B.m11286d(c2084d);
        RecyclerView recyclerView = this.f8889y;
        attachViewToParent(recyclerView, 0, recyclerView.getLayoutParams());
    }

    /* renamed from: f */
    private void m11238f(RecyclerView.AbstractC1880g abstractC1880g) {
        if (abstractC1880g != null) {
            abstractC1880g.m9998I(this.f8885u);
        }
    }

    /* renamed from: i */
    private void m11239i() {
        RecyclerView.AbstractC1880g adapter;
        if (this.f8887w == -1 || (adapter = getAdapter()) == null) {
            return;
        }
        if (this.f8888x != null) {
            this.f8888x = null;
        }
        int max = Math.max(0, Math.min(this.f8887w, adapter.mo10003k() - 1));
        this.f8883s = max;
        this.f8887w = -1;
        this.f8889y.m9837K1(max);
        this.f8879I.mo11268m();
    }

    /* renamed from: l */
    private void m11240l(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC23523a.ViewPager2);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, AbstractC23523a.ViewPager2, attributeSet, obtainStyledAttributes, 0, 0);
        }
        try {
            setOrientation(obtainStyledAttributes.getInt(AbstractC23523a.ViewPager2_android_orientation, 0));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: m */
    private void m11241m(RecyclerView.AbstractC1880g abstractC1880g) {
        if (abstractC1880g != null) {
            abstractC1880g.m10000K(this.f8885u);
        }
    }

    /* renamed from: c */
    public boolean m11242c() {
        return this.f8873C.m11287a();
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i11) {
        return this.f8889y.canScrollHorizontally(i11);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i11) {
        return this.f8889y.canScrollVertically(i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean m11243d() {
        if (this.f8886v.m10116d0() == 1) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray sparseArray) {
        Parcelable parcelable = (Parcelable) sparseArray.get(getId());
        if (parcelable instanceof SavedState) {
            int i11 = ((SavedState) parcelable).f8891p;
            sparseArray.put(this.f8889y.getId(), sparseArray.get(i11));
            sparseArray.remove(i11);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        m11239i();
    }

    /* renamed from: e */
    public boolean m11244e() {
        return this.f8877G;
    }

    /* renamed from: g */
    public void m11245g(AbstractC2075i abstractC2075i) {
        this.f8882r.m11286d(abstractC2075i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (this.f8879I.mo11256a()) {
            return this.f8879I.mo11262g();
        }
        return super.getAccessibilityClassName();
    }

    public RecyclerView.AbstractC1880g getAdapter() {
        return this.f8889y.getAdapter();
    }

    public int getCurrentItem() {
        return this.f8883s;
    }

    public int getItemDecorationCount() {
        return this.f8889y.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.f8878H;
    }

    public int getOrientation() {
        return this.f8886v.m9750h();
    }

    int getPageSize() {
        int height;
        int paddingBottom;
        RecyclerView recyclerView = this.f8889y;
        if (getOrientation() == 0) {
            height = recyclerView.getWidth() - recyclerView.getPaddingLeft();
            paddingBottom = recyclerView.getPaddingRight();
        } else {
            height = recyclerView.getHeight() - recyclerView.getPaddingTop();
            paddingBottom = recyclerView.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    public int getScrollState() {
        return this.f8871A.m11299k();
    }

    /* renamed from: h */
    public void m11246h() {
        this.f8874D.m11288d();
    }

    /* renamed from: j */
    public void m11247j(int i11, boolean z11) {
        if (!m11242c()) {
            m11248k(i11, z11);
            return;
        }
        throw new IllegalStateException("Cannot change current item when ViewPager2 is fake dragging");
    }

    /* renamed from: k */
    void m11248k(int i11, boolean z11) {
        int i12;
        RecyclerView.AbstractC1880g adapter = getAdapter();
        if (adapter == null) {
            if (this.f8887w != -1) {
                this.f8887w = Math.max(i11, 0);
                return;
            }
            return;
        }
        if (adapter.mo10003k() <= 0) {
            return;
        }
        int min = Math.min(Math.max(i11, 0), adapter.mo10003k() - 1);
        if (min == this.f8883s && this.f8871A.m11301m()) {
            return;
        }
        int i13 = this.f8883s;
        if (min == i13 && z11) {
            return;
        }
        double d11 = i13;
        this.f8883s = min;
        this.f8879I.mo11272q();
        if (!this.f8871A.m11301m()) {
            d11 = this.f8871A.m11298j();
        }
        this.f8871A.m11303p(min, z11);
        if (!z11) {
            this.f8889y.m9837K1(min);
            return;
        }
        double d12 = min;
        if (Math.abs(d12 - d11) > 3.0d) {
            RecyclerView recyclerView = this.f8889y;
            if (d12 > d11) {
                i12 = min - 3;
            } else {
                i12 = min + 3;
            }
            recyclerView.m9837K1(i12);
            RecyclerView recyclerView2 = this.f8889y;
            recyclerView2.post(new RunnableC2080n(min, recyclerView2));
            return;
        }
        this.f8889y.mo9854S1(min);
    }

    /* renamed from: n */
    void m11249n() {
        C1929v c1929v = this.f8890z;
        if (c1929v != null) {
            View mo10402h = c1929v.mo10402h(this.f8886v);
            if (mo10402h == null) {
                return;
            }
            int m10112b = this.f8886v.m10112b(mo10402h);
            if (m10112b != this.f8883s && getScrollState() == 0) {
                this.f8872B.mo11255c(m10112b);
            }
            this.f8884t = false;
            return;
        }
        throw new IllegalStateException("Design assumption violated.");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f8879I.mo11264i(accessibilityNodeInfo);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int measuredWidth = this.f8889y.getMeasuredWidth();
        int measuredHeight = this.f8889y.getMeasuredHeight();
        this.f8880p.left = getPaddingLeft();
        this.f8880p.right = (i13 - i11) - getPaddingRight();
        this.f8880p.top = getPaddingTop();
        this.f8880p.bottom = (i14 - i12) - getPaddingBottom();
        Gravity.apply(8388659, measuredWidth, measuredHeight, this.f8880p, this.f8881q);
        RecyclerView recyclerView = this.f8889y;
        Rect rect = this.f8881q;
        recyclerView.layout(rect.left, rect.top, rect.right, rect.bottom);
        if (this.f8884t) {
            m11249n();
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i11, int i12) {
        measureChild(this.f8889y, i11, i12);
        int measuredWidth = this.f8889y.getMeasuredWidth();
        int measuredHeight = this.f8889y.getMeasuredHeight();
        int measuredState = this.f8889y.getMeasuredState();
        int paddingLeft = measuredWidth + getPaddingLeft() + getPaddingRight();
        int paddingTop = measuredHeight + getPaddingTop() + getPaddingBottom();
        setMeasuredDimension(View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i11, measuredState), View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i12, measuredState << 16));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f8887w = savedState.f8892q;
        this.f8888x = savedState.f8893r;
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f8891p = this.f8889y.getId();
        int i11 = this.f8887w;
        if (i11 == -1) {
            i11 = this.f8883s;
        }
        savedState.f8892q = i11;
        Parcelable parcelable = this.f8888x;
        if (parcelable != null) {
            savedState.f8893r = parcelable;
        } else {
            this.f8889y.getAdapter();
        }
        return savedState;
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        throw new IllegalStateException(ViewPager2.class.getSimpleName() + " does not support direct child views");
    }

    @Override // android.view.View
    public boolean performAccessibilityAction(int i11, Bundle bundle) {
        if (this.f8879I.mo11258c(i11, bundle)) {
            return this.f8879I.mo11267l(i11, bundle);
        }
        return super.performAccessibilityAction(i11, bundle);
    }

    public void setAdapter(RecyclerView.AbstractC1880g abstractC1880g) {
        RecyclerView.AbstractC1880g adapter = this.f8889y.getAdapter();
        this.f8879I.mo11261f(adapter);
        m11241m(adapter);
        this.f8889y.setAdapter(abstractC1880g);
        this.f8883s = 0;
        m11239i();
        this.f8879I.mo11260e(abstractC1880g);
        m11238f(abstractC1880g);
    }

    public void setCurrentItem(int i11) {
        m11247j(i11, true);
    }

    @Override // android.view.View
    public void setLayoutDirection(int i11) {
        super.setLayoutDirection(i11);
        this.f8879I.mo11271p();
    }

    public void setOffscreenPageLimit(int i11) {
        if (i11 < 1 && i11 != -1) {
            throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        }
        this.f8878H = i11;
        this.f8889y.requestLayout();
    }

    public void setOrientation(int i11) {
        this.f8886v.m9723C2(i11);
        this.f8879I.mo11273r();
    }

    public void setPageTransformer(InterfaceC2077k interfaceC2077k) {
        if (interfaceC2077k != null) {
            if (!this.f8876F) {
                this.f8875E = this.f8889y.getItemAnimator();
                this.f8876F = true;
            }
            this.f8889y.setItemAnimator(null);
        } else if (this.f8876F) {
            this.f8889y.setItemAnimator(this.f8875E);
            this.f8875E = null;
            this.f8876F = false;
        }
        this.f8874D.m11288d();
        if (interfaceC2077k == null) {
            return;
        }
        this.f8874D.m11289e(interfaceC2077k);
        m11246h();
    }

    public void setUserInputEnabled(boolean z11) {
        this.f8877G = z11;
        this.f8879I.mo11274s();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C2066a();

        /* renamed from: p */
        int f8891p;

        /* renamed from: q */
        int f8892q;

        /* renamed from: r */
        Parcelable f8893r;

        /* renamed from: androidx.viewpager2.widget.ViewPager2$SavedState$a */
        /* loaded from: classes2.dex */
        static class C2066a implements Parcelable.ClassLoaderCreator {
            C2066a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return createFromParcel(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                if (Build.VERSION.SDK_INT >= 24) {
                    return new SavedState(parcel, classLoader);
                }
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i11) {
                return new SavedState[i11];
            }
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            m11250a(parcel, classLoader);
        }

        /* renamed from: a */
        private void m11250a(Parcel parcel, ClassLoader classLoader) {
            this.f8891p = parcel.readInt();
            this.f8892q = parcel.readInt();
            this.f8893r = parcel.readParcelable(classLoader);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            super.writeToParcel(parcel, i11);
            parcel.writeInt(this.f8891p);
            parcel.writeInt(this.f8892q);
            parcel.writeParcelable(this.f8893r, i11);
        }

        SavedState(Parcel parcel) {
            super(parcel);
            m11250a(parcel, null);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public ViewPager2(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f8880p = new Rect();
        this.f8881q = new Rect();
        this.f8882r = new C2082b(3);
        this.f8884t = false;
        this.f8885u = new C2067a();
        this.f8887w = -1;
        this.f8875E = null;
        this.f8876F = false;
        this.f8877G = true;
        this.f8878H = -1;
        m11237b(context, attributeSet);
    }
}
