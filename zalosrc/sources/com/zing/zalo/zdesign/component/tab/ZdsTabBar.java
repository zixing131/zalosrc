package com.zing.zalo.zdesign.component.tab;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.drawable.AbstractC1414a;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bi0.AbstractC2809c;
import bi0.AbstractC2810d;
import bi0.AbstractC2815i;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.Badge;
import com.zing.zalo.zdesign.component.C16974f;
import com.zing.zalo.zdesign.component.Divider;
import com.zing.zalo.zdesign.component.EnumC16980h;
import com.zing.zalo.zdesign.component.EnumC16991i;
import com.zing.zalo.zdesign.component.TrackingImageView;
import com.zing.zalo.zdesign.component.chip.ZdsChip;
import com.zing.zalo.zdesign.component.chip.ZdsTabChip;
import com.zing.zalo.zdesign.component.tab.ZdsTabBar;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Iterator;
import p227i3.C20218v;
import pi0.AbstractC24766a;
import pi0.C24767b;
import pi0.C24773h;
import pm0.C24848g0;
import si0.C26273a;
import si0.C26274b;
import ti0.C26703b;
import ti0.C26705d;
import ti0.C26708g;
import ui0.AbstractC27281h;
import ui0.C27276c;

/* loaded from: classes7.dex */
public final class ZdsTabBar extends FrameLayout {

    /* renamed from: A */
    private boolean f87271A;

    /* renamed from: B */
    private int f87272B;

    /* renamed from: C */
    private int f87273C;

    /* renamed from: D */
    private int f87274D;

    /* renamed from: E */
    private int f87275E;

    /* renamed from: F */
    private int f87276F;

    /* renamed from: G */
    private int f87277G;

    /* renamed from: H */
    private int f87278H;

    /* renamed from: I */
    private int f87279I;

    /* renamed from: J */
    private int f87280J;

    /* renamed from: K */
    private int f87281K;

    /* renamed from: L */
    private C17057c f87282L;

    /* renamed from: M */
    private ValueAnimator f87283M;

    /* renamed from: N */
    private ValueAnimator f87284N;

    /* renamed from: O */
    private AnimatorListenerAdapter f87285O;

    /* renamed from: P */
    private View f87286P;

    /* renamed from: Q */
    private int f87287Q;

    /* renamed from: R */
    private boolean f87288R;

    /* renamed from: S */
    private boolean f87289S;

    /* renamed from: p */
    private final int f87290p;

    /* renamed from: q */
    private final int f87291q;

    /* renamed from: r */
    private RecyclerView f87292r;

    /* renamed from: s */
    private C17058d f87293s;

    /* renamed from: t */
    private InterfaceC17059e f87294t;

    /* renamed from: u */
    private InterfaceC17060f f87295u;

    /* renamed from: v */
    private C17063i f87296v;

    /* renamed from: w */
    private Divider f87297w;

    /* renamed from: x */
    private int f87298x;

    /* renamed from: y */
    private int f87299y;

    /* renamed from: z */
    private int f87300z;

    /* renamed from: com.zing.zalo.zdesign.component.tab.ZdsTabBar$a */
    /* loaded from: classes7.dex */
    public static final class ViewTreeObserverOnGlobalLayoutListenerC17055a implements ViewTreeObserver.OnGlobalLayoutListener {
        ViewTreeObserverOnGlobalLayoutListenerC17055a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (ZdsTabBar.this.isShown()) {
                ZdsTabBar.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                ZdsTabBar zdsTabBar = ZdsTabBar.this;
                zdsTabBar.f87300z = zdsTabBar.getWidth();
                ZdsTabBar.this.m91305S();
            }
        }
    }

    /* renamed from: com.zing.zalo.zdesign.component.tab.ZdsTabBar$b */
    /* loaded from: classes7.dex */
    public static final class C17056b implements RecyclerView.InterfaceC1889p {
        C17056b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public static final void m91308e(ZdsTabBar zdsTabBar, View view) {
            RecyclerView recyclerView;
            int i11;
            AbstractC19074t.m100208f(zdsTabBar, "this$0");
            if (zdsTabBar.isEnabled() && (recyclerView = zdsTabBar.f87292r) != null) {
                RecyclerView.AbstractC1876c0 m9823C0 = recyclerView.m9823C0(view);
                if (m9823C0 != null) {
                    i11 = m9823C0.m9929A();
                } else {
                    i11 = 0;
                }
                recyclerView.cancelPendingInputEvents();
                int m91319P = zdsTabBar.f87296v.m91319P(i11);
                AbstractC24766a m91324U = zdsTabBar.f87296v.m91324U(m91319P);
                if (m91324U != null && !m91324U.m128734b()) {
                    return;
                }
                ZdsTabBar.m91272K(zdsTabBar, m91319P, false, 2, null);
                InterfaceC17059e interfaceC17059e = zdsTabBar.f87294t;
                if (interfaceC17059e != null) {
                    AbstractC19074t.m100207e(view, C20218v.f100059b);
                    interfaceC17059e.mo87275i0(recyclerView, m91319P, view);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public static final boolean m91309f(ZdsTabBar zdsTabBar, View view) {
            RecyclerView recyclerView;
            int i11;
            AbstractC19074t.m100208f(zdsTabBar, "this$0");
            if (!zdsTabBar.isEnabled() || (recyclerView = zdsTabBar.f87292r) == null) {
                return false;
            }
            RecyclerView.AbstractC1876c0 m9823C0 = recyclerView.m9823C0(view);
            if (m9823C0 != null) {
                i11 = m9823C0.m9929A();
            } else {
                i11 = 0;
            }
            recyclerView.cancelPendingInputEvents();
            InterfaceC17060f interfaceC17060f = zdsTabBar.f87295u;
            if (interfaceC17060f == null) {
                return false;
            }
            AbstractC19074t.m100207e(view, C20218v.f100059b);
            return interfaceC17060f.mo91310T3(recyclerView, i11, view);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC1889p
        /* renamed from: b */
        public void mo10173b(View view) {
            AbstractC19074t.m100208f(view, "view");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC1889p
        /* renamed from: d */
        public void mo10174d(View view) {
            AbstractC19074t.m100208f(view, "view");
            final ZdsTabBar zdsTabBar = ZdsTabBar.this;
            view.setOnClickListener(new View.OnClickListener() { // from class: pi0.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    ZdsTabBar.C17056b.m91308e(ZdsTabBar.this, view2);
                }
            });
            final ZdsTabBar zdsTabBar2 = ZdsTabBar.this;
            view.setOnLongClickListener(new View.OnLongClickListener() { // from class: pi0.f
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view2) {
                    boolean m91309f;
                    m91309f = ZdsTabBar.C17056b.m91309f(ZdsTabBar.this, view2);
                    return m91309f;
                }
            });
        }
    }

    /* renamed from: com.zing.zalo.zdesign.component.tab.ZdsTabBar$c */
    /* loaded from: classes7.dex */
    private final class C17057c extends LinearLayoutManager {
        public C17057c(Context context) {
            super(context, 0, false);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1888o
        /* renamed from: W0 */
        public void mo9666W0(RecyclerView.C1899z c1899z) {
            ZdsTabBar.this.f87271A = true;
            super.mo9666W0(c1899z);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1888o
        /* renamed from: u1 */
        public int mo9676u1(int i11, RecyclerView.C1894u c1894u, RecyclerView.C1899z c1899z) {
            int mo9676u1 = super.mo9676u1(i11, c1894u, c1899z);
            if (ZdsTabBar.this.f87288R) {
                ZdsTabBar.this.f87287Q -= mo9676u1;
                ValueAnimator valueAnimator = ZdsTabBar.this.f87283M;
                float f11 = ZdsTabBar.this.f87287Q;
                AbstractC19074t.m100207e(ZdsTabBar.this.getContext(), "context");
                valueAnimator.setFloatValues(ZdsTabBar.this.f87286P.getX(), f11 + C27276c.m139648a(r1, 12.0f));
                if (!ZdsTabBar.this.f87283M.isRunning()) {
                    ZdsTabBar.this.f87283M.start();
                }
            }
            return mo9676u1;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1888o
        /* renamed from: x */
        public boolean mo9757x() {
            if (ZdsTabBar.this.f87272B == EnumC17062h.FIXED_WIDTH.m91314c()) {
                return false;
            }
            if (ZdsTabBar.this.f87271A) {
                int allItemWidth = ZdsTabBar.this.getAllItemWidth();
                if (!super.mo9757x() || allItemWidth <= Resources.getSystem().getDisplayMetrics().widthPixels) {
                    return false;
                }
                return true;
            }
            return super.mo9757x();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.zing.zalo.zdesign.component.tab.ZdsTabBar$d */
    /* loaded from: classes7.dex */
    public final class C17058d extends RecyclerView.AbstractC1887n {

        /* renamed from: a */
        private final int f87304a;

        public C17058d(int i11) {
            this.f87304a = i11;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1887n
        /* renamed from: g */
        public void mo10066g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1899z c1899z) {
            int i11;
            AbstractC19074t.m100208f(rect, "outRect");
            AbstractC19074t.m100208f(view, "view");
            AbstractC19074t.m100208f(recyclerView, "parent");
            AbstractC19074t.m100208f(c1899z, "state");
            ZdsTabBar zdsTabBar = ZdsTabBar.this;
            int m9817A0 = recyclerView.m9817A0(view);
            AbstractC24766a m91323T = zdsTabBar.f87296v.m91323T(m9817A0);
            if (m91323T != null) {
                i11 = m91323T.m128737e();
            } else {
                i11 = -1;
            }
            if (i11 == -1) {
                if (m9817A0 < zdsTabBar.f87296v.m91322S() && m9817A0 >= zdsTabBar.f87296v.m91321R()) {
                    i11 = this.f87304a;
                } else {
                    i11 = 0;
                }
            }
            rect.right = i11;
        }
    }

    /* renamed from: com.zing.zalo.zdesign.component.tab.ZdsTabBar$e */
    /* loaded from: classes7.dex */
    public interface InterfaceC17059e {
        /* renamed from: i0 */
        void mo87275i0(RecyclerView recyclerView, int i11, View view);
    }

    /* renamed from: com.zing.zalo.zdesign.component.tab.ZdsTabBar$f */
    /* loaded from: classes7.dex */
    public interface InterfaceC17060f {
        /* renamed from: T3 */
        boolean mo91310T3(RecyclerView recyclerView, int i11, View view);
    }

    /* renamed from: com.zing.zalo.zdesign.component.tab.ZdsTabBar$g */
    /* loaded from: classes7.dex */
    public enum EnumC17061g {
        NORMAL_TAB(0),
        CHIP_TAB(1);


        /* renamed from: p */
        private final int f87309p;

        EnumC17061g(int i11) {
            this.f87309p = i11;
        }

        /* renamed from: c */
        public final int m91312c() {
            return this.f87309p;
        }
    }

    /* renamed from: com.zing.zalo.zdesign.component.tab.ZdsTabBar$h */
    /* loaded from: classes7.dex */
    public enum EnumC17062h {
        FIXED_WIDTH(0),
        SCROLLABLE(1);


        /* renamed from: p */
        private final int f87313p;

        EnumC17062h(int i11) {
            this.f87313p = i11;
        }

        /* renamed from: c */
        public final int m91314c() {
            return this.f87313p;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.zing.zalo.zdesign.component.tab.ZdsTabBar$i */
    /* loaded from: classes7.dex */
    public final class C17063i extends RecyclerView.AbstractC1880g {

        /* renamed from: A */
        private int f87314A;

        /* renamed from: r */
        private ArrayList f87316r = new ArrayList();

        /* renamed from: s */
        private LayoutInflater f87317s;

        /* renamed from: t */
        private int f87318t;

        /* renamed from: u */
        private int f87319u;

        /* renamed from: v */
        private C24767b f87320v;

        /* renamed from: w */
        private C24767b f87321w;

        /* renamed from: x */
        private int f87322x;

        /* renamed from: y */
        private int f87323y;

        /* renamed from: z */
        private int f87324z;

        /* renamed from: com.zing.zalo.zdesign.component.tab.ZdsTabBar$i$a */
        /* loaded from: classes7.dex */
        public final class a extends c {

            /* renamed from: J */
            private C26273a f87325J;

            /* renamed from: K */
            final /* synthetic */ C17063i f87326K;

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public a(C17063i c17063i, C26273a c26273a) {
                super(c17063i, r0);
                AbstractC19074t.m100208f(c26273a, "itemBinding");
                this.f87326K = c17063i;
                TabItemView root = c26273a.getRoot();
                AbstractC19074t.m100207e(root, "itemBinding.root");
                this.f87325J = c26273a;
            }

            @Override // com.zing.zalo.zdesign.component.tab.ZdsTabBar.C17063i.c
            /* renamed from: i0 */
            public void mo91338i0() {
            }
        }

        /* renamed from: com.zing.zalo.zdesign.component.tab.ZdsTabBar$i$b */
        /* loaded from: classes7.dex */
        public final class b extends c {

            /* renamed from: J */
            private final View f87327J;

            /* renamed from: K */
            final /* synthetic */ C17063i f87328K;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(C17063i c17063i, View view) {
                super(c17063i, view);
                AbstractC19074t.m100208f(view, "emptyView");
                this.f87328K = c17063i;
                this.f87327J = view;
            }

            @Override // com.zing.zalo.zdesign.component.tab.ZdsTabBar.C17063i.c
            /* renamed from: i0 */
            public void mo91338i0() {
            }

            /* renamed from: j0 */
            public final void m91339j0(C24767b c24767b) {
                AbstractC19074t.m100208f(c24767b, "zdsEmptyTabItem");
                if (this.f87327J.getLayoutParams() == null) {
                    this.f87327J.setLayoutParams(new FrameLayout.LayoutParams(c24767b.m128745k(), -1));
                } else {
                    this.f87327J.getLayoutParams().width = c24767b.m128745k();
                }
            }
        }

        /* renamed from: com.zing.zalo.zdesign.component.tab.ZdsTabBar$i$c */
        /* loaded from: classes7.dex */
        public abstract class c extends RecyclerView.AbstractC1876c0 {

            /* renamed from: I */
            final /* synthetic */ C17063i f87329I;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(C17063i c17063i, View view) {
                super(view);
                AbstractC19074t.m100208f(view, "root");
                this.f87329I = c17063i;
            }

            /* renamed from: i0 */
            public abstract void mo91338i0();
        }

        /* renamed from: com.zing.zalo.zdesign.component.tab.ZdsTabBar$i$d */
        /* loaded from: classes7.dex */
        public final class d extends c {

            /* renamed from: J */
            private C26274b f87330J;

            /* renamed from: K */
            final /* synthetic */ C17063i f87331K;

            /* renamed from: com.zing.zalo.zdesign.component.tab.ZdsTabBar$i$d$a */
            /* loaded from: classes7.dex */
            public /* synthetic */ class a {

                /* renamed from: a */
                public static final /* synthetic */ int[] f87332a;

                static {
                    int[] iArr = new int[C24773h.a.values().length];
                    try {
                        iArr[C24773h.a.NONE.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[C24773h.a.NUMBER.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[C24773h.a.CUSTOM.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    f87332a = iArr;
                }
            }

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public d(C17063i c17063i, C26274b c26274b) {
                super(c17063i, r0);
                AbstractC19074t.m100208f(c26274b, "itemBinding");
                this.f87331K = c17063i;
                TabItemView root = c26274b.getRoot();
                AbstractC19074t.m100207e(root, "itemBinding.root");
                this.f87330J = c26274b;
                Badge badge = c26274b.f124714r;
                Context context = ZdsTabBar.this.getContext();
                AbstractC19074t.m100207e(context, "context");
                C16974f c16974f = new C16974f(context);
                c16974f.m90974x(EnumC16991i.NEW_DOT);
                c16974f.m90971u(EnumC16980h.SIZE_8);
                badge.m90493g(c16974f);
            }

            @Override // com.zing.zalo.zdesign.component.tab.ZdsTabBar.C17063i.c
            /* renamed from: i0 */
            public void mo91338i0() {
            }

            /* renamed from: j0 */
            public final void m91340j0(C24773h c24773h) {
                FrameLayout frameLayout;
                Drawable mutate;
                Drawable.ConstantState constantState;
                AbstractC19074t.m100208f(c24773h, "tabItem");
                if (c24773h.m128733a() != this.f87330J.getRoot().getWidth() && ZdsTabBar.this.f87272B == EnumC17062h.SCROLLABLE.m91314c()) {
                    c24773h.m128740h(this.f87330J.getRoot().getWidth());
                }
                if ((this.f87330J.getRoot() instanceof TabItemView) && c24773h.m128735c().length() > 0) {
                    this.f87330J.getRoot().setIdTracking(c24773h.m128735c());
                }
                C16974f m128747k = c24773h.m128747k();
                if (m128747k != null) {
                    this.f87330J.f124714r.m90493g(m128747k);
                }
                this.f87330J.f124721y.setVisibility(c24773h.m128752p().length() > 0 ? 0 : 8);
                this.f87330J.f124717u.setVisibility(c24773h.m128750n() != null ? 0 : 8);
                if (this.f87330J.f124721y.getVisibility() == 0) {
                    this.f87330J.f124721y.setText(c24773h.m128752p());
                    Context context = ZdsTabBar.this.getContext();
                    AbstractC19074t.m100207e(context, "context");
                    C26703b m137293a = C26705d.m137293a(context, c24773h.m128738f() ? ZdsTabBar.this.f87274D : ZdsTabBar.this.f87275E);
                    RobotoTextView robotoTextView = this.f87330J.f124721y;
                    AbstractC19074t.m100207e(robotoTextView, "tabItemBinding.txtContent");
                    new C26708g(robotoTextView).m137319a(m137293a);
                    this.f87330J.f124721y.setEllipsize(TextUtils.TruncateAt.END);
                    this.f87330J.f124721y.setSingleLine(true);
                    this.f87330J.f124721y.setAllCaps(false);
                    this.f87330J.f124721y.setTextColor(c24773h.m128738f() ? ZdsTabBar.this.f87278H : ZdsTabBar.this.f87279I);
                }
                ViewGroup.LayoutParams layoutParams = null;
                if (this.f87330J.f124717u.getVisibility() == 0) {
                    Drawable m128750n = c24773h.m128750n();
                    if (m128750n != null) {
                        ZdsTabBar zdsTabBar = ZdsTabBar.this;
                        AbstractC1414a.m7196n(m128750n, c24773h.m128738f() ? zdsTabBar.f87280J : zdsTabBar.f87281K);
                    }
                    TrackingImageView trackingImageView = this.f87330J.f124718v;
                    Drawable m128750n2 = c24773h.m128750n();
                    trackingImageView.setImageDrawable((m128750n2 == null || (mutate = m128750n2.mutate()) == null || (constantState = mutate.getConstantState()) == null) ? null : constantState.newDrawable());
                }
                c24773h.m128756t(this.f87330J.f124715s);
                this.f87330J.f124715s.setVisibility((ZdsTabBar.this.f87289S || !c24773h.m128738f()) ? 8 : 0);
                if (c24773h.m128738f() && !ZdsTabBar.this.f87289S) {
                    View view = ZdsTabBar.this.f87286P;
                    float x11 = this.f87330J.getRoot().getX();
                    AbstractC19074t.m100207e(ZdsTabBar.this.getContext(), "context");
                    view.setX(x11 + C27276c.m139648a(r7, 12.0f));
                }
                this.f87330J.f124714r.setVisibility(c24773h.m128749m() ? 0 : 4);
                this.f87330J.f124720x.setVisibility(0);
                int i11 = a.f87332a[c24773h.m128754r().ordinal()];
                if (i11 == 1) {
                    this.f87330J.f124720x.setVisibility(8);
                } else if (i11 == 2) {
                    this.f87330J.f124713q.setVisibility(8);
                    this.f87330J.f124722z.setVisibility(0);
                    this.f87330J.f124722z.setText(c24773h.m128751o());
                    Context context2 = ZdsTabBar.this.getContext();
                    AbstractC19074t.m100207e(context2, "context");
                    C26703b m137293a2 = C26705d.m137293a(context2, c24773h.m128738f() ? ZdsTabBar.this.f87276F : ZdsTabBar.this.f87277G);
                    RobotoTextView robotoTextView2 = this.f87330J.f124722z;
                    AbstractC19074t.m100207e(robotoTextView2, "tabItemBinding.txtNumber");
                    new C26708g(robotoTextView2).m137319a(m137293a2);
                    this.f87330J.f124722z.setEllipsize(TextUtils.TruncateAt.END);
                    this.f87330J.f124722z.setSingleLine(true);
                    this.f87330J.f124722z.setAllCaps(false);
                    this.f87330J.f124722z.setTextColor(c24773h.m128738f() ? ZdsTabBar.this.f87278H : ZdsTabBar.this.f87279I);
                } else if (i11 == 3) {
                    if (c24773h.m128753q() == null) {
                        this.f87330J.f124720x.setVisibility(8);
                    }
                    if (this.f87330J.f124720x.getVisibility() == 0) {
                        this.f87330J.f124713q.setVisibility(0);
                        this.f87330J.f124722z.setVisibility(8);
                        View m128753q = c24773h.m128753q();
                        if (m128753q != null) {
                            this.f87330J.f124713q.removeAllViews();
                            this.f87330J.f124713q.addView(m128753q);
                        }
                    }
                }
                int i12 = ZdsTabBar.this.f87299y;
                if (ZdsTabBar.this.f87272B == EnumC17062h.FIXED_WIDTH.m91314c() && ZdsTabBar.this.f87300z > 0) {
                    i12 = ZdsTabBar.this.f87300z / ZdsTabBar.this.f87298x;
                    if (ZdsTabBar.this.f87299y != 0 && i12 > ZdsTabBar.this.f87299y) {
                        i12 = ZdsTabBar.this.f87299y;
                    }
                    this.f87330J.getRoot().getLayoutParams().width = i12;
                }
                if (i12 != 0) {
                    ViewGroup.LayoutParams layoutParams2 = this.f87330J.f124716t.getLayoutParams();
                    if (layoutParams2 instanceof ConstraintLayout.LayoutParams) {
                        ((ConstraintLayout.LayoutParams) layoutParams2).f5506T = i12;
                    }
                    this.f87330J.f124716t.setLayoutParams(layoutParams2);
                    ViewGroup.LayoutParams layoutParams3 = this.f87330J.f124721y.getLayoutParams();
                    ViewGroup.LayoutParams layoutParams4 = this.f87330J.f124718v.getLayoutParams();
                    if ((layoutParams3 instanceof ConstraintLayout.LayoutParams) && (layoutParams4 instanceof ConstraintLayout.LayoutParams)) {
                        if (c24773h.m128754r() == C24773h.a.NUMBER) {
                            layoutParams = this.f87330J.f124722z.getLayoutParams();
                        } else if (c24773h.m128754r() == C24773h.a.CUSTOM && (frameLayout = this.f87330J.f124713q) != null) {
                            layoutParams = frameLayout.getLayoutParams();
                        }
                        if (layoutParams instanceof ConstraintLayout.LayoutParams) {
                            int dimensionPixelSize = (i12 - (this.f87330J.f124720x.getVisibility() == 0 ? ((ConstraintLayout.LayoutParams) layoutParams).f5506T + ZdsTabBar.this.getResources().getDimensionPixelSize(AbstractC2809c.tab_trailing_item_marginLeft) : 0)) - (this.f87330J.f124717u.getVisibility() == 0 ? ((ConstraintLayout.LayoutParams) layoutParams4).f5506T + ZdsTabBar.this.getResources().getDimensionPixelSize(AbstractC2809c.tab_leading_item_marginRight) : 0);
                            ((ConstraintLayout.LayoutParams) layoutParams3).f5506T = dimensionPixelSize >= 0 ? dimensionPixelSize : 0;
                            this.f87330J.f124721y.setLayoutParams(layoutParams3);
                        }
                    }
                    this.f87330J.getRoot().requestLayout();
                }
            }
        }

        /* renamed from: com.zing.zalo.zdesign.component.tab.ZdsTabBar$i$e */
        /* loaded from: classes7.dex */
        public final class e extends c {

            /* renamed from: J */
            private final ZdsTabChip f87333J;

            /* renamed from: K */
            private C24773h f87334K;

            /* renamed from: L */
            final /* synthetic */ C17063i f87335L;

            /* renamed from: com.zing.zalo.zdesign.component.tab.ZdsTabBar$i$e$a */
            /* loaded from: classes7.dex */
            public /* synthetic */ class a {

                /* renamed from: a */
                public static final /* synthetic */ int[] f87336a;

                static {
                    int[] iArr = new int[C24773h.a.values().length];
                    try {
                        iArr[C24773h.a.NONE.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[C24773h.a.NUMBER.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[C24773h.a.CUSTOM.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    f87336a = iArr;
                }
            }

            /* renamed from: com.zing.zalo.zdesign.component.tab.ZdsTabBar$i$e$b */
            /* loaded from: classes7.dex */
            public static final class b implements ViewTreeObserver.OnGlobalLayoutListener {
                b() {
                }

                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    C24773h c24773h = e.this.f87334K;
                    if (c24773h != null) {
                        e eVar = e.this;
                        if (c24773h.m128733a() != eVar.f7784p.getWidth() && eVar.f7784p.getWidth() != 0) {
                            c24773h.m128740h(eVar.f7784p.getWidth());
                        }
                    }
                    e.this.f7784p.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                }
            }

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public e(C17063i c17063i, ZdsTabChip zdsTabChip) {
                super(c17063i, r0);
                AbstractC19074t.m100208f(zdsTabChip, "zdsTabChip");
                this.f87335L = c17063i;
                View rootView = zdsTabChip.getRootView();
                AbstractC19074t.m100207e(rootView, "zdsTabChip.rootView");
                this.f87333J = zdsTabChip;
            }

            @Override // com.zing.zalo.zdesign.component.tab.ZdsTabBar.C17063i.c
            /* renamed from: i0 */
            public void mo91338i0() {
                this.f7784p.getViewTreeObserver().addOnGlobalLayoutListener(new b());
            }

            /* renamed from: k0 */
            public final void m91342k0(C24773h c24773h) {
                ZdsChip.EnumC16963b enumC16963b;
                AbstractC19074t.m100208f(c24773h, "tabItem");
                this.f87334K = c24773h;
                ZdsTabChip zdsTabChip = this.f87333J;
                ZdsTabBar zdsTabBar = ZdsTabBar.this;
                if (zdsTabBar.f87299y != 0) {
                    zdsTabChip.setMaxItemWidth(zdsTabBar.f87299y);
                }
                zdsTabChip.setIdTracking(c24773h.m128735c());
                zdsTabChip.setZdsChipSelected(c24773h.m128738f());
                zdsTabChip.setMiddleText(c24773h.m128752p());
                if (c24773h.m128750n() != null) {
                    enumC16963b = ZdsChip.EnumC16963b.ICON;
                } else {
                    enumC16963b = ZdsChip.EnumC16963b.NONE;
                }
                zdsTabChip.setChipLeadingType(enumC16963b.m90844c());
                Drawable m128750n = c24773h.m128750n();
                if (m128750n != null) {
                    zdsTabChip.setLeadingIcon(m128750n);
                }
                zdsTabChip.m90831b(c24773h.m128749m());
                int i11 = a.f87336a[c24773h.m128754r().ordinal()];
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 == 3) {
                            zdsTabChip.setChipTrailingType(ZdsChip.EnumC16964c.NONE.m90846c());
                        }
                    } else {
                        zdsTabChip.setChipTrailingType(ZdsChip.EnumC16964c.TEXT.m90846c());
                    }
                } else {
                    zdsTabChip.setChipTrailingType(ZdsChip.EnumC16964c.NONE.m90846c());
                }
                zdsTabChip.setTrailingText(c24773h.m128751o());
                zdsTabChip.setEnable(c24773h.m128734b());
            }
        }

        public C17063i() {
            LayoutInflater from = LayoutInflater.from(ZdsTabBar.this.getContext());
            AbstractC19074t.m100207e(from, "from(context)");
            this.f87317s = from;
            this.f87318t = -1;
            this.f87319u = -1;
            this.f87320v = new C24767b();
            this.f87321w = new C24767b();
            this.f87322x = -1;
            this.f87323y = -1;
            this.f87324z = -1;
            this.f87314A = -1;
        }

        /* renamed from: L */
        public final void m91315L(int i11) {
            boolean z11;
            int m91320Q = m91320Q(i11);
            int m91322S = m91322S() + 1;
            for (int m91321R = m91321R(); m91321R < m91322S; m91321R++) {
                boolean m128738f = ((AbstractC24766a) this.f87316r.get(m91321R)).m128738f();
                if (m91321R == m91320Q) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                ((AbstractC24766a) this.f87316r.get(m91321R)).m128739g(z11);
                if (z11) {
                    if (this.f87316r.get(m91321R) instanceof C24773h) {
                        Object obj = this.f87316r.get(m91321R);
                        AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type com.zing.zalo.zdesign.component.tab.ZdsTabItem");
                        ((C24773h) obj).m128757u(false);
                    }
                    this.f87319u = this.f87318t;
                    this.f87318t = m91321R;
                }
                if (m128738f != z11 && (this.f87316r.get(m91321R) instanceof C24773h)) {
                    m91332c0(m91321R);
                }
            }
        }

        /* renamed from: M */
        public final void m91316M(C24773h c24773h) {
            int i11;
            AbstractC19074t.m100208f(c24773h, "item");
            if (ZdsTabBar.this.f87273C == EnumC17061g.NORMAL_TAB.m91312c()) {
                this.f87316r.add(c24773h);
                return;
            }
            int i12 = this.f87324z;
            if (i12 == -1) {
                ArrayList arrayList = this.f87316r;
                if (arrayList.size() > 1) {
                    i11 = this.f87316r.size() - 1;
                } else {
                    i11 = 0;
                }
                arrayList.add(i11, c24773h);
                return;
            }
            this.f87316r.add(i12, c24773h);
            this.f87324z++;
            this.f87314A++;
        }

        /* renamed from: N */
        public final boolean m91317N(int i11) {
            if (i11 >= m91321R() && i11 <= m91322S()) {
                return false;
            }
            return true;
        }

        /* renamed from: O */
        public final void m91318O() {
            this.f87316r.clear();
            if (ZdsTabBar.this.f87273C == EnumC17061g.CHIP_TAB.m91312c()) {
                this.f87316r.add(this.f87320v);
                this.f87316r.add(this.f87321w);
            }
            m91336g0();
        }

        /* renamed from: P */
        public final int m91319P(int i11) {
            if (ZdsTabBar.this.f87273C != EnumC17061g.NORMAL_TAB.m91312c()) {
                return i11 - 1;
            }
            return i11;
        }

        /* renamed from: Q */
        public final int m91320Q(int i11) {
            if (ZdsTabBar.this.f87273C != EnumC17061g.NORMAL_TAB.m91312c()) {
                return i11 + 1;
            }
            return i11;
        }

        /* renamed from: R */
        public final int m91321R() {
            if (ZdsTabBar.this.f87273C == EnumC17061g.NORMAL_TAB.m91312c()) {
                return 0;
            }
            return 1;
        }

        /* renamed from: S */
        public final int m91322S() {
            if (ZdsTabBar.this.f87273C == EnumC17061g.NORMAL_TAB.m91312c()) {
                return this.f87316r.size() - 1;
            }
            return this.f87316r.size() - 2;
        }

        /* renamed from: T */
        public final AbstractC24766a m91323T(int i11) {
            int m91321R = m91321R();
            if (i11 < m91322S() + 1 && m91321R <= i11) {
                return (AbstractC24766a) this.f87316r.get(i11);
            }
            return null;
        }

        /* renamed from: U */
        public final AbstractC24766a m91324U(int i11) {
            return m91323T(m91320Q(i11));
        }

        /* renamed from: V */
        public final ArrayList m91325V() {
            return this.f87316r;
        }

        /* renamed from: W */
        public final C24767b m91326W() {
            return this.f87320v;
        }

        /* renamed from: X */
        public final int m91327X() {
            return this.f87319u;
        }

        /* renamed from: Y */
        public final int m91328Y() {
            return this.f87318t;
        }

        /* renamed from: Z */
        public final C24767b m91329Z() {
            return this.f87321w;
        }

        /* renamed from: a0 */
        public final boolean m91330a0(int i11) {
            if (m91320Q(i11) == m91328Y()) {
                return true;
            }
            return false;
        }

        /* renamed from: b0 */
        public final boolean m91331b0(int i11) {
            return m91317N(m91320Q(i11));
        }

        /* renamed from: c0 */
        public final void m91332c0(int i11) {
            m10009q(i11);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
        /* renamed from: d0, reason: merged with bridge method [inline-methods] */
        public void mo9990A(c cVar, int i11) {
            AbstractC19074t.m100208f(cVar, "holder");
            if (cVar instanceof d) {
                if (this.f87316r.get(i11) instanceof C24773h) {
                    Object obj = this.f87316r.get(i11);
                    AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type com.zing.zalo.zdesign.component.tab.ZdsTabItem");
                    ((d) cVar).m91340j0((C24773h) obj);
                    return;
                }
                return;
            }
            if (cVar instanceof e) {
                if (this.f87316r.get(i11) instanceof C24773h) {
                    Object obj2 = this.f87316r.get(i11);
                    AbstractC19074t.m100206d(obj2, "null cannot be cast to non-null type com.zing.zalo.zdesign.component.tab.ZdsTabItem");
                    ((e) cVar).m91342k0((C24773h) obj2);
                    return;
                }
                return;
            }
            if (cVar instanceof b) {
                if (this.f87316r.get(i11) instanceof C24767b) {
                    Object obj3 = this.f87316r.get(i11);
                    AbstractC19074t.m100206d(obj3, "null cannot be cast to non-null type com.zing.zalo.zdesign.component.tab.ZdsEmptyTabItem");
                    ((b) cVar).m91339j0((C24767b) obj3);
                    return;
                }
                return;
            }
            if (cVar instanceof a) {
                this.f87316r.get(i11);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
        /* renamed from: e0, reason: merged with bridge method [inline-methods] */
        public c mo9992C(ViewGroup viewGroup, int i11) {
            AbstractC19074t.m100208f(viewGroup, "parent");
            if (i11 == AbstractC24766a.a.NORMAL.m128744c()) {
                C26274b m135163c = C26274b.m135163c(this.f87317s, viewGroup, false);
                AbstractC19074t.m100207e(m135163c, "inflate(inflater, parent, false)");
                if (ZdsTabBar.this.f87272B == EnumC17062h.FIXED_WIDTH.m91314c()) {
                    ViewGroup.LayoutParams layoutParams = m135163c.f124714r.getLayoutParams();
                    if (layoutParams instanceof ConstraintLayout.LayoutParams) {
                        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                        layoutParams2.f5527h = -1;
                        ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin = 0;
                    }
                }
                return new d(this, m135163c);
            }
            if (i11 == AbstractC24766a.a.CHIP.m128744c()) {
                Context context = ZdsTabBar.this.getContext();
                AbstractC19074t.m100207e(context, "context");
                ZdsTabChip zdsTabChip = new ZdsTabChip(context);
                if (ZdsTabBar.this.f87299y != 0) {
                    zdsTabChip.setMaxItemWidth(ZdsTabBar.this.f87299y);
                }
                return new e(this, zdsTabChip);
            }
            if (i11 == AbstractC24766a.a.EMPTY.m128744c()) {
                return new b(this, new View(ZdsTabBar.this.getContext()));
            }
            if (i11 == AbstractC24766a.a.CUSTOM.m128744c()) {
                C26273a m135160c = C26273a.m135160c(this.f87317s, viewGroup, false);
                AbstractC19074t.m100207e(m135160c, "inflate(inflater, parent, false)");
                return new a(this, m135160c);
            }
            C26274b m135163c2 = C26274b.m135163c(this.f87317s, viewGroup, false);
            AbstractC19074t.m100207e(m135163c2, "inflate(inflater, parent, false)");
            return new d(this, m135163c2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
        /* renamed from: f0, reason: merged with bridge method [inline-methods] */
        public void mo9995F(c cVar) {
            AbstractC19074t.m100208f(cVar, "holder");
            cVar.mo91338i0();
        }

        /* renamed from: g0 */
        public final void m91336g0() {
            this.f87322x = -1;
            this.f87323y = -1;
            this.f87324z = -1;
            this.f87314A = -1;
        }

        /* renamed from: h0 */
        public final void m91337h0() {
            m10008p();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
        /* renamed from: k */
        public int mo10003k() {
            return this.f87316r.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
        /* renamed from: m */
        public int mo10005m(int i11) {
            return ((AbstractC24766a) this.f87316r.get(i11)).m128736d();
        }
    }

    /* renamed from: com.zing.zalo.zdesign.component.tab.ZdsTabBar$j */
    /* loaded from: classes7.dex */
    public static final class C17064j extends AnimatorListenerAdapter {
        C17064j() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public static final void m91344b(ZdsTabBar zdsTabBar) {
            AbstractC19074t.m100208f(zdsTabBar, "this$0");
            zdsTabBar.f87289S = false;
            zdsTabBar.f87288R = false;
            zdsTabBar.f87286P.setVisibility(8);
            int m91328Y = zdsTabBar.f87296v.m91328Y();
            if (m91328Y >= zdsTabBar.f87296v.m91321R() && m91328Y < zdsTabBar.f87296v.m91322S() + 1) {
                zdsTabBar.f87271A = false;
                if (zdsTabBar.f87296v.m91325V().get(m91328Y) instanceof C24773h) {
                    Object obj = zdsTabBar.f87296v.m91325V().get(m91328Y);
                    AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type com.zing.zalo.zdesign.component.tab.ZdsTabItem");
                    View m128748l = ((C24773h) obj).m128748l();
                    if (m128748l != null) {
                        m128748l.setVisibility(0);
                    }
                }
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC19074t.m100208f(animator, "animation");
            final ZdsTabBar zdsTabBar = ZdsTabBar.this;
            zdsTabBar.postDelayed(new Runnable() { // from class: pi0.g
                @Override // java.lang.Runnable
                public final void run() {
                    ZdsTabBar.C17064j.m91344b(ZdsTabBar.this);
                }
            }, 100L);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            AbstractC19074t.m100208f(animator, "animation");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ZdsTabBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        AbstractC19074t.m100208f(context, "context");
    }

    /* renamed from: K */
    public static /* synthetic */ void m91272K(ZdsTabBar zdsTabBar, int i11, boolean z11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            z11 = true;
        }
        zdsTabBar.m91301J(i11, z11);
    }

    /* renamed from: N */
    private final void m91273N(int i11) {
        View view;
        if (this.f87283M.isRunning()) {
            this.f87289S = false;
            return;
        }
        int m91320Q = this.f87296v.m91320Q(i11);
        RecyclerView recyclerView = this.f87292r;
        if (recyclerView != null) {
            RecyclerView.AbstractC1888o layoutManager = recyclerView.getLayoutManager();
            if (layoutManager != null) {
                view = layoutManager.mo9732P(m91320Q);
            } else {
                view = null;
            }
            if (view != null) {
                int m91327X = this.f87296v.m91327X();
                if (m91327X >= this.f87296v.m91321R() && m91327X < this.f87296v.m91322S() + 1 && (this.f87296v.m91325V().get(m91327X) instanceof C24773h)) {
                    Object obj = this.f87296v.m91325V().get(m91327X);
                    AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type com.zing.zalo.zdesign.component.tab.ZdsTabItem");
                    View m128748l = ((C24773h) obj).m128748l();
                    if (m128748l != null) {
                        m128748l.setVisibility(8);
                    }
                }
                int left = view.getLeft();
                int width = (recyclerView.getWidth() - view.getWidth()) / 2;
                if (this.f87272B == EnumC17062h.SCROLLABLE.m91314c()) {
                    recyclerView.m9845O1(left - width, 0);
                }
                if (this.f87273C == EnumC17061g.NORMAL_TAB.m91312c()) {
                    if (this.f87285O == null) {
                        C17064j c17064j = new C17064j();
                        this.f87285O = c17064j;
                        this.f87283M.addListener(c17064j);
                    }
                    this.f87287Q = left;
                    this.f87288R = true;
                    this.f87286P.setVisibility(0);
                    if (this.f87272B == EnumC17062h.FIXED_WIDTH.m91314c()) {
                        ViewGroup.LayoutParams layoutParams = this.f87286P.getLayoutParams();
                        int width2 = view.getWidth();
                        Context context = recyclerView.getContext();
                        AbstractC19074t.m100207e(context, "context");
                        layoutParams.width = width2 - C27276c.m139649b(context, 24);
                        ValueAnimator valueAnimator = this.f87283M;
                        float x11 = view.getX();
                        AbstractC19074t.m100207e(recyclerView.getContext(), "context");
                        valueAnimator.setFloatValues(this.f87286P.getX(), x11 + C27276c.m139648a(r0, 12.0f));
                        this.f87283M.start();
                        return;
                    }
                    if (left - width == 0) {
                        ValueAnimator valueAnimator2 = this.f87283M;
                        float f11 = left;
                        AbstractC19074t.m100207e(recyclerView.getContext(), "context");
                        valueAnimator2.setFloatValues(this.f87286P.getX(), f11 + C27276c.m139648a(r2, 12.0f));
                        this.f87283M.start();
                    }
                    ValueAnimator valueAnimator3 = this.f87284N;
                    int i12 = this.f87286P.getLayoutParams().width;
                    int width3 = view.getWidth();
                    Context context2 = recyclerView.getContext();
                    AbstractC19074t.m100207e(context2, "context");
                    valueAnimator3.setIntValues(i12, width3 - C27276c.m139649b(context2, 24));
                    this.f87284N.start();
                    return;
                }
                this.f87289S = false;
                return;
            }
            this.f87289S = false;
        }
    }

    /* renamed from: P */
    private final void m91274P(TypedArray typedArray) {
        RecyclerView recyclerView;
        if (typedArray.hasValue(AbstractC2815i.ZdsTabBar_android_background)) {
            setBackground(typedArray.getDrawable(AbstractC2815i.ZdsTabBar_android_background));
        }
        if (typedArray.hasValue(AbstractC2815i.ZdsTabBar_textActiveStyle)) {
            this.f87274D = typedArray.getResourceId(AbstractC2815i.ZdsTabBar_textActiveStyle, 0);
        }
        if (typedArray.hasValue(AbstractC2815i.ZdsTabBar_textInActiveStyle)) {
            this.f87275E = typedArray.getResourceId(AbstractC2815i.ZdsTabBar_textInActiveStyle, 0);
        }
        if (typedArray.hasValue(AbstractC2815i.ZdsTabBar_textNumberActiveStyle)) {
            this.f87276F = typedArray.getResourceId(AbstractC2815i.ZdsTabBar_textNumberActiveStyle, 0);
        }
        if (typedArray.hasValue(AbstractC2815i.ZdsTabBar_textNumberInActiveStyle)) {
            this.f87277G = typedArray.getResourceId(AbstractC2815i.ZdsTabBar_textNumberInActiveStyle, 0);
        }
        if (typedArray.hasValue(AbstractC2815i.ZdsTabBar_textActiveColor)) {
            this.f87278H = typedArray.getColor(AbstractC2815i.ZdsTabBar_textActiveColor, 0);
        }
        if (typedArray.hasValue(AbstractC2815i.ZdsTabBar_textInActiveColor)) {
            this.f87279I = typedArray.getColor(AbstractC2815i.ZdsTabBar_textInActiveColor, 0);
        }
        if (typedArray.hasValue(AbstractC2815i.ZdsTabBar_iconActiveColor)) {
            this.f87280J = typedArray.getColor(AbstractC2815i.ZdsTabBar_iconActiveColor, 0);
        }
        if (typedArray.hasValue(AbstractC2815i.ZdsTabBar_iconInActiveColor)) {
            this.f87281K = typedArray.getColor(AbstractC2815i.ZdsTabBar_iconInActiveColor, 0);
        }
        setTabType(typedArray.getInt(AbstractC2815i.ZdsTabBar_tabType, EnumC17062h.FIXED_WIDTH.m91314c()));
        if (typedArray.hasValue(AbstractC2815i.ZdsTabBar_fixedTabCount)) {
            if (this.f87272B != EnumC17062h.SCROLLABLE.m91314c()) {
                setFixedTabCount(typedArray.getInt(AbstractC2815i.ZdsTabBar_fixedTabCount, this.f87290p));
            } else {
                throw new Exception("Cannot use fixedTabCount in ScrollableTab");
            }
        }
        int i11 = AbstractC2815i.ZdsTabBar_tabSubType;
        EnumC17061g enumC17061g = EnumC17061g.NORMAL_TAB;
        setSubTabType(typedArray.getInt(i11, enumC17061g.m91312c()));
        if (this.f87273C == EnumC17061g.CHIP_TAB.m91312c()) {
            this.f87297w.setVisibility(8);
            C17058d c17058d = new C17058d(getResources().getDimensionPixelSize(AbstractC2809c.tab_chip_margin));
            this.f87293s = c17058d;
            RecyclerView recyclerView2 = this.f87292r;
            if (recyclerView2 != null) {
                AbstractC19074t.m100205c(c17058d);
                recyclerView2.m9816A(c17058d);
            }
        } else if (this.f87273C == enumC17061g.m91312c() && (recyclerView = this.f87292r) != null) {
            recyclerView.setLayoutParams(new FrameLayout.LayoutParams(-2, this.f87291q));
        }
        if (typedArray.hasValue(AbstractC2815i.ZdsTabBar_tabItemMaxWidth)) {
            this.f87299y = typedArray.getDimensionPixelSize(AbstractC2815i.ZdsTabBar_tabItemMaxWidth, AbstractC2809c.tab_item_max_width);
        }
        typedArray.recycle();
    }

    /* renamed from: Q */
    private final void m91275Q(AttributeSet attributeSet, int i11, int i12) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC2815i.ZdsTabBar, i11, i12);
        AbstractC19074t.m100207e(obtainStyledAttributes, "context.obtainStyledAttr…r, defStyle, defStyleRes)");
        m91274P(obtainStyledAttributes);
    }

    /* renamed from: R */
    static /* synthetic */ void m91276R(ZdsTabBar zdsTabBar, AttributeSet attributeSet, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = 0;
        }
        zdsTabBar.m91275Q(attributeSet, i11, i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static final void m91279c(ZdsTabBar zdsTabBar, ValueAnimator valueAnimator) {
        AbstractC19074t.m100208f(zdsTabBar, "this$0");
        AbstractC19074t.m100208f(valueAnimator, "animation");
        ViewGroup.LayoutParams layoutParams = zdsTabBar.f87286P.getLayoutParams();
        Object animatedValue = valueAnimator.getAnimatedValue();
        AbstractC19074t.m100206d(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        layoutParams.width = ((Integer) animatedValue).intValue();
        zdsTabBar.f87286P.requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static final void m91280d(ZdsTabBar zdsTabBar, ValueAnimator valueAnimator) {
        AbstractC19074t.m100208f(zdsTabBar, "this$0");
        AbstractC19074t.m100208f(valueAnimator, "animation");
        View view = zdsTabBar.f87286P;
        Object animatedValue = valueAnimator.getAnimatedValue();
        AbstractC19074t.m100206d(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        view.setX(((Float) animatedValue).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getAllItemWidth() {
        int i11;
        int i12;
        Iterator it = this.f87296v.m91325V().iterator();
        int i13 = 0;
        while (it.hasNext()) {
            AbstractC24766a abstractC24766a = (AbstractC24766a) it.next();
            if (abstractC24766a instanceof C24767b) {
                i12 = ((C24767b) abstractC24766a).m128745k();
            } else {
                int m128733a = abstractC24766a.m128733a();
                if (abstractC24766a.m128736d() != AbstractC24766a.a.NORMAL.m128744c()) {
                    if (abstractC24766a.m128737e() == -1) {
                        i11 = getResources().getDimensionPixelSize(AbstractC2809c.tab_chip_margin);
                    } else {
                        i11 = abstractC24766a.m128737e();
                    }
                } else {
                    i11 = 0;
                }
                i12 = i11 + m128733a;
            }
            i13 += i12;
        }
        return i13;
    }

    /* renamed from: J */
    public final void m91301J(int i11, boolean z11) {
        if (this.f87296v.m91331b0(i11) || this.f87296v.m91330a0(i11)) {
            return;
        }
        if (this.f87273C == EnumC17061g.CHIP_TAB.m91312c() && z11 && AbstractC27281h.Companion.m139666b()) {
            new Exception("Chip Tab cannot animate").printStackTrace();
            AbstractC20110a.m104545n(String.valueOf(C24848g0.f119245a), new Object[0]);
        }
        this.f87271A = false;
        this.f87296v.m91315L(i11);
        this.f87289S = z11;
        if (z11) {
            m91273N(i11);
        } else {
            this.f87286P.setVisibility(8);
        }
    }

    /* renamed from: L */
    public final void m91302L(C24773h c24773h) {
        AbstractC24766a.a aVar;
        AbstractC19074t.m100208f(c24773h, "zdsTabItem");
        if (this.f87272B != EnumC17062h.SCROLLABLE.m91314c()) {
            if (this.f87273C != EnumC17061g.CHIP_TAB.m91312c()) {
                if (this.f87296v.mo10003k() < this.f87298x) {
                    if (this.f87273C == EnumC17061g.NORMAL_TAB.m91312c()) {
                        aVar = AbstractC24766a.a.NORMAL;
                    } else {
                        aVar = AbstractC24766a.a.CHIP;
                    }
                    c24773h.m128742j(aVar.m128744c());
                    this.f87296v.m91316M(c24773h);
                    return;
                }
                throw new Exception("Cannot add more item");
            }
            throw new Exception("Chip Tab cannot be fixed width");
        }
        throw new Exception("Only FixedTab can use this function");
    }

    /* renamed from: M */
    public final void m91303M(C24773h c24773h) {
        AbstractC24766a.a aVar;
        AbstractC19074t.m100208f(c24773h, "zdsTabItem");
        if (this.f87272B != EnumC17062h.FIXED_WIDTH.m91314c()) {
            if (this.f87273C == EnumC17061g.NORMAL_TAB.m91312c()) {
                aVar = AbstractC24766a.a.NORMAL;
            } else {
                aVar = AbstractC24766a.a.CHIP;
            }
            c24773h.m128742j(aVar.m128744c());
            this.f87296v.m91316M(c24773h);
            return;
        }
        throw new Exception("Only ScrollableTab can use this function");
    }

    /* renamed from: O */
    public final View m91304O(int i11) {
        RecyclerView.AbstractC1888o layoutManager;
        int m91320Q = this.f87296v.m91320Q(i11);
        RecyclerView recyclerView = this.f87292r;
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null) {
            return layoutManager.mo9732P(m91320Q);
        }
        return null;
    }

    /* renamed from: S */
    public final void m91305S() {
        this.f87271A = false;
        this.f87296v.m91337h0();
    }

    public final int getActiveItemPosition() {
        C17063i c17063i = this.f87296v;
        return c17063i.m91319P(c17063i.m91328Y());
    }

    public final int getFixedTabCount() {
        return this.f87298x;
    }

    public final int getItemMaxWidth() {
        return this.f87299y;
    }

    public final int getSubTabType() {
        return this.f87273C;
    }

    public final int getTabItemCount() {
        if (this.f87273C == EnumC17061g.NORMAL_TAB.m91312c()) {
            return this.f87296v.mo10003k();
        }
        return this.f87296v.mo10003k() - 2;
    }

    public final int getTabType() {
        return this.f87272B;
    }

    public final void setFixedTabCount(int i11) {
        if (i11 >= this.f87290p) {
            this.f87298x = i11;
            return;
        }
        throw new Exception("fixedTabCount can't be less than " + this.f87290p);
    }

    public final void setItemMaxWidth(int i11) {
        Context context = getContext();
        AbstractC19074t.m100207e(context, "context");
        this.f87299y = C27276c.m139649b(context, i11);
    }

    public final void setLeftPadding(int i11) {
        if (this.f87273C != EnumC17061g.NORMAL_TAB.m91312c()) {
            if (this.f87272B != EnumC17062h.FIXED_WIDTH.m91314c()) {
                C24767b m91326W = this.f87296v.m91326W();
                Context context = getContext();
                AbstractC19074t.m100207e(context, "context");
                m91326W.m128746l(C27276c.m139649b(context, i11));
                this.f87296v.m91332c0(0);
                return;
            }
            throw new Exception("Fixed Width Tab cannot set left padding");
        }
        throw new Exception("Normal Tab cannot set left padding");
    }

    public final void setOnItemClickListener(InterfaceC17059e interfaceC17059e) {
        AbstractC19074t.m100208f(interfaceC17059e, "onItemClickListener");
        this.f87294t = interfaceC17059e;
    }

    public final void setOnItemLongClickListener(InterfaceC17060f interfaceC17060f) {
        AbstractC19074t.m100208f(interfaceC17060f, "onItemLongClickListener");
        this.f87295u = interfaceC17060f;
    }

    public final void setRightPadding(int i11) {
        int i12;
        if (this.f87273C != EnumC17061g.NORMAL_TAB.m91312c()) {
            if (this.f87272B != EnumC17062h.FIXED_WIDTH.m91314c()) {
                C24767b m91329Z = this.f87296v.m91329Z();
                Context context = getContext();
                AbstractC19074t.m100207e(context, "context");
                m91329Z.m128746l(C27276c.m139649b(context, i11));
                C17063i c17063i = this.f87296v;
                if (c17063i.m91325V().size() > 0) {
                    i12 = this.f87296v.m91322S() + 1;
                } else {
                    i12 = 0;
                }
                c17063i.m91332c0(i12);
                return;
            }
            throw new Exception("Fixed Width Tab cannot set right padding");
        }
        throw new Exception("Normal Tab cannot set right padding");
    }

    public final void setSubTabType(int i11) {
        int i12;
        if (this.f87272B == EnumC17062h.FIXED_WIDTH.m91314c() && i11 == EnumC17061g.CHIP_TAB.m91312c()) {
            throw new Exception("Chip Tab cannot be fixed width");
        }
        if (this.f87273C != i11) {
            this.f87273C = i11;
            this.f87296v.m91318O();
        }
        View view = this.f87286P;
        if (this.f87273C == EnumC17061g.CHIP_TAB.m91312c()) {
            i12 = 8;
        } else {
            i12 = 0;
        }
        view.setVisibility(i12);
    }

    public final void setTabType(int i11) {
        this.f87272B = i11;
        if (i11 == EnumC17062h.FIXED_WIDTH.m91314c()) {
            setSubTabType(EnumC17061g.NORMAL_TAB.m91312c());
            RecyclerView recyclerView = this.f87292r;
            if (recyclerView != null) {
                recyclerView.setNestedScrollingEnabled(false);
            }
            this.f87299y = getResources().getDimensionPixelSize(AbstractC2809c.tab_item_max_width);
            return;
        }
        if (i11 == EnumC17062h.SCROLLABLE.m91314c()) {
            RecyclerView recyclerView2 = this.f87292r;
            if (recyclerView2 != null) {
                recyclerView2.setNestedScrollingEnabled(true);
            }
            setItemMaxWidth(0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZdsTabBar(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
        this.f87290p = 2;
        Context context2 = getContext();
        AbstractC19074t.m100207e(context2, "context");
        this.f87291q = C27276c.m139649b(context2, 44);
        this.f87296v = new C17063i();
        Context context3 = getContext();
        AbstractC19074t.m100207e(context3, "context");
        this.f87297w = new Divider(context3);
        this.f87298x = 2;
        this.f87272B = EnumC17062h.FIXED_WIDTH.m91314c();
        this.f87273C = EnumC17061g.NORMAL_TAB.m91312c();
        this.f87283M = new ValueAnimator();
        this.f87284N = new ValueAnimator();
        this.f87286P = new View(getContext());
        getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC17055a());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 48;
        setLayoutParams(layoutParams);
        Divider divider = this.f87297w;
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams2.gravity = 80;
        divider.setLayoutParams(layoutParams2);
        addView(this.f87297w);
        RecyclerView recyclerView = new RecyclerView(context);
        C17057c c17057c = new C17057c(context);
        this.f87282L = c17057c;
        recyclerView.setLayoutManager(c17057c);
        recyclerView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        recyclerView.setAdapter(this.f87296v);
        recyclerView.m9822C(new C17056b());
        this.f87292r = recyclerView;
        addView(recyclerView);
        View view = this.f87286P;
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(C27276c.m139649b(context, 100), (int) getResources().getDimension(AbstractC2809c.indicator_height));
        layoutParams3.gravity = 80;
        view.setLayoutParams(layoutParams3);
        this.f87286P.setBackgroundResource(AbstractC2810d.tab_indicator_bg);
        this.f87286P.setX(0.0f);
        addView(this.f87286P);
        this.f87284N.setInterpolator(new LinearInterpolator());
        this.f87284N.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: pi0.c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ZdsTabBar.m91279c(ZdsTabBar.this, valueAnimator);
            }
        });
        this.f87284N.setDuration(150L);
        this.f87283M.setInterpolator(new LinearInterpolator());
        this.f87283M.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: pi0.d
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ZdsTabBar.m91280d(ZdsTabBar.this, valueAnimator);
            }
        });
        this.f87283M.setDuration(150L);
        m91276R(this, attributeSet, i11, 0, 4, null);
    }
}
