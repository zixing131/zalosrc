package com.zing.zalo.libbubbleview;

import ac.C0708i;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import bi0.AbstractC2807a;
import bi0.AbstractC2814h;
import com.androidquery.util.AbstractC3972e;
import com.zing.zalo.libbubbleview.AbstractC8948a;
import com.zing.zalo.libbubbleview.p066ui.FloatingRoundedLayout;
import com.zing.zalo.libbubbleview.p066ui.RoundedImageView;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import le0.AbstractC22459a;
import p193h0.AbstractC19694b;
import p310l0.C21983d;
import p354n3.C23528a;
import p363nh.C23744a;
import p471r3.EnumC25629a;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;
import yt.AbstractC31072b;
import yt.AbstractC31079i;
import yt.C31071a;
import yt.C31081k;
import yt.EnumC31074d;

/* loaded from: classes4.dex */
public final class FloatingItemView extends FloatingRoundedLayout {
    public static final C8945a Companion = new C8945a(null);

    /* renamed from: C */
    private final int f47777C;

    /* renamed from: D */
    private final int f47778D;

    /* renamed from: E */
    private C8949b f47779E;

    /* renamed from: F */
    private EnumC8947c f47780F;

    /* renamed from: G */
    private boolean f47781G;

    /* renamed from: H */
    private InterfaceC8946b f47782H;

    /* renamed from: I */
    private C31071a f47783I;

    /* renamed from: J */
    private float f47784J;

    /* renamed from: K */
    private float f47785K;

    /* renamed from: L */
    private float f47786L;

    /* renamed from: M */
    private float f47787M;

    /* renamed from: N */
    private int f47788N;

    /* renamed from: O */
    private int f47789O;

    /* renamed from: P */
    private float f47790P;

    /* renamed from: Q */
    private float f47791Q;

    /* renamed from: R */
    private boolean f47792R;

    /* renamed from: S */
    private boolean f47793S;

    /* renamed from: T */
    private AbstractC31072b f47794T;

    /* renamed from: U */
    private boolean f47795U;

    /* renamed from: V */
    private RoundedImageView f47796V;

    /* renamed from: W */
    private boolean f47797W;

    /* renamed from: a0 */
    private int f47798a0;

    /* renamed from: b0 */
    private int f47799b0;

    /* renamed from: c0 */
    private float f47800c0;

    /* renamed from: d0 */
    private float f47801d0;

    /* renamed from: e0 */
    private float f47802e0;

    /* renamed from: f0 */
    private float f47803f0;

    /* renamed from: g0 */
    private float f47804g0;

    /* renamed from: h0 */
    private float f47805h0;

    /* renamed from: i0 */
    private EnumC8947c f47806i0;

    /* renamed from: com.zing.zalo.libbubbleview.FloatingItemView$a */
    /* loaded from: classes4.dex */
    public static final class C8945a {
        private C8945a() {
        }

        public /* synthetic */ C8945a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.libbubbleview.FloatingItemView$b */
    /* loaded from: classes4.dex */
    public interface InterfaceC8946b {
        /* renamed from: a */
        float mo47734a();

        /* renamed from: b */
        RoundedImageView mo47735b();

        /* renamed from: c */
        float mo47736c();

        /* renamed from: d */
        float mo47737d();

        /* renamed from: e */
        float mo47738e();

        /* renamed from: f */
        void mo47739f(float f11, float f12);

        /* renamed from: g */
        float mo47740g();

        /* renamed from: h */
        void mo47741h(AbstractC31072b abstractC31072b);

        /* renamed from: i */
        float mo47742i();

        /* renamed from: j */
        C0708i mo47743j(AbstractC31072b abstractC31072b);

        /* renamed from: k */
        void mo47744k(AbstractC31072b abstractC31072b);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: com.zing.zalo.libbubbleview.FloatingItemView$c */
    /* loaded from: classes4.dex */
    public static final class EnumC8947c {

        /* renamed from: p */
        public static final EnumC8947c f47807p = new EnumC8947c("FREE", 0);

        /* renamed from: q */
        public static final EnumC8947c f47808q = new EnumC8947c("CAPTURED", 1);

        /* renamed from: r */
        private static final /* synthetic */ EnumC8947c[] f47809r;

        /* renamed from: s */
        private static final /* synthetic */ InterfaceC30165a f47810s;

        static {
            EnumC8947c[] m47745b = m47745b();
            f47809r = m47745b;
            f47810s = AbstractC30166b.m148796a(m47745b);
        }

        private EnumC8947c(String str, int i11) {
        }

        /* renamed from: b */
        private static final /* synthetic */ EnumC8947c[] m47745b() {
            return new EnumC8947c[]{f47807p, f47808q};
        }

        public static EnumC8947c valueOf(String str) {
            return (EnumC8947c) Enum.valueOf(EnumC8947c.class, str);
        }

        public static EnumC8947c[] values() {
            return (EnumC8947c[]) f47809r.clone();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FloatingItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        AbstractC8948a.a aVar = AbstractC8948a.Companion;
        Context context2 = getContext();
        AbstractC19074t.m100205c(context2);
        this.f47777C = aVar.m47751c(context2, 100.0f);
        this.f47778D = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.f47795U = true;
        this.f47804g0 = 1.0f;
        this.f47805h0 = 0.5f;
        throw new IllegalArgumentException("This constructor cannot be used");
    }

    /* renamed from: e */
    private final void m47726e() {
        AbstractC8948a.a aVar = AbstractC8948a.Companion;
        Context context = getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        C31071a c31071a = this.f47783I;
        View view = null;
        if (c31071a == null) {
            AbstractC19074t.m100223u("floatingConfig");
            c31071a = null;
        }
        this.f47798a0 = aVar.m47751c(context, c31071a.m150983j());
        Context context2 = getContext();
        AbstractC19074t.m100207e(context2, "getContext(...)");
        C31071a c31071a2 = this.f47783I;
        if (c31071a2 == null) {
            AbstractC19074t.m100223u("floatingConfig");
            c31071a2 = null;
        }
        float m150983j = c31071a2.m150983j();
        C31071a c31071a3 = this.f47783I;
        if (c31071a3 == null) {
            AbstractC19074t.m100223u("floatingConfig");
            c31071a3 = null;
        }
        this.f47799b0 = aVar.m47751c(context2, m150983j * c31071a3.m150976c());
        AbstractC19074t.m100207e(getContext(), "getContext(...)");
        setCornerRadius(aVar.m47751c(r1, 8.0f));
        AbstractC19074t.m100207e(getContext(), "getContext(...)");
        m47822c(aVar.m47751c(r1, 1.0f), AbstractC22459a.m116119a(getContext(), AbstractC2807a.border_01));
        this.f47796V = new RoundedImageView(getContext());
        Context context3 = getContext();
        AbstractC19074t.m100207e(context3, "getContext(...)");
        C31071a c31071a4 = this.f47783I;
        if (c31071a4 == null) {
            AbstractC19074t.m100223u("floatingConfig");
            c31071a4 = null;
        }
        int m47751c = aVar.m47751c(context3, c31071a4.m150987n());
        Context context4 = getContext();
        AbstractC19074t.m100207e(context4, "getContext(...)");
        C31071a c31071a5 = this.f47783I;
        if (c31071a5 == null) {
            AbstractC19074t.m100223u("floatingConfig");
            c31071a5 = null;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(m47751c, aVar.m47751c(context4, c31071a5.m150985l()));
        layoutParams.addRule(10, -1);
        layoutParams.addRule(20, -1);
        C31071a c31071a6 = this.f47783I;
        if (c31071a6 == null) {
            AbstractC19074t.m100223u("floatingConfig");
            c31071a6 = null;
        }
        if (c31071a6.m150988o()) {
            RoundedImageView roundedImageView = this.f47796V;
            if (roundedImageView == null) {
                AbstractC19074t.m100223u("imgFloating");
                roundedImageView = null;
            }
            roundedImageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            RoundedImageView roundedImageView2 = this.f47796V;
            if (roundedImageView2 == null) {
                AbstractC19074t.m100223u("imgFloating");
                roundedImageView2 = null;
            }
            roundedImageView2.setBackground(AbstractC19694b.m103336d(getContext(), AbstractC31079i.mini_app_floating_avt_normal));
        } else {
            RoundedImageView roundedImageView3 = this.f47796V;
            if (roundedImageView3 == null) {
                AbstractC19074t.m100223u("imgFloating");
                roundedImageView3 = null;
            }
            roundedImageView3.setScaleType(ImageView.ScaleType.CENTER_CROP);
            AbstractC31072b abstractC31072b = this.f47794T;
            if (abstractC31072b == null) {
                AbstractC19074t.m100223u("floatingItemData");
                abstractC31072b = null;
            }
            m47728j(abstractC31072b);
        }
        View view2 = this.f47796V;
        if (view2 == null) {
            AbstractC19074t.m100223u("imgFloating");
        } else {
            view = view2;
        }
        addView(view, layoutParams);
        m47727i();
        setImageBackground(false);
        setIdTracking("ma_open_from_floating");
    }

    /* renamed from: i */
    private final void m47727i() {
        boolean z11;
        float f11;
        float f12;
        float m150986m;
        float m150984k;
        float f13;
        float m150990q;
        EnumC8947c enumC8947c = this.f47806i0;
        EnumC8947c enumC8947c2 = this.f47780F;
        if (enumC8947c == enumC8947c2) {
            return;
        }
        this.f47806i0 = enumC8947c2;
        if (enumC8947c2 == EnumC8947c.f47808q) {
            z11 = true;
        } else {
            z11 = false;
        }
        RoundedImageView roundedImageView = this.f47796V;
        C31071a c31071a = null;
        if (roundedImageView == null) {
            AbstractC19074t.m100223u("imgFloating");
            roundedImageView = null;
        }
        ViewGroup.LayoutParams layoutParams = roundedImageView.getLayoutParams();
        AbstractC8948a.a aVar = AbstractC8948a.Companion;
        Context context = getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        C31071a c31071a2 = this.f47783I;
        if (c31071a2 == null) {
            AbstractC19074t.m100223u("floatingConfig");
            c31071a2 = null;
        }
        float m150987n = c31071a2.m150987n();
        float f14 = 1.0f;
        if (z11) {
            C31071a c31071a3 = this.f47783I;
            if (c31071a3 == null) {
                AbstractC19074t.m100223u("floatingConfig");
                c31071a3 = null;
            }
            f11 = c31071a3.m150976c();
        } else {
            f11 = 1.0f;
        }
        layoutParams.width = aVar.m47751c(context, m150987n * f11);
        Context context2 = getContext();
        AbstractC19074t.m100207e(context2, "getContext(...)");
        C31071a c31071a4 = this.f47783I;
        if (c31071a4 == null) {
            AbstractC19074t.m100223u("floatingConfig");
            c31071a4 = null;
        }
        float m150985l = c31071a4.m150985l();
        if (z11) {
            C31071a c31071a5 = this.f47783I;
            if (c31071a5 == null) {
                AbstractC19074t.m100223u("floatingConfig");
                c31071a5 = null;
            }
            f12 = c31071a5.m150976c();
        } else {
            f12 = 1.0f;
        }
        layoutParams.height = aVar.m47751c(context2, m150985l * f12);
        RoundedImageView roundedImageView2 = this.f47796V;
        if (roundedImageView2 == null) {
            AbstractC19074t.m100223u("imgFloating");
            roundedImageView2 = null;
        }
        roundedImageView2.setLayoutParams(layoutParams);
        C31071a c31071a6 = this.f47783I;
        if (z11) {
            if (c31071a6 == null) {
                AbstractC19074t.m100223u("floatingConfig");
                c31071a6 = null;
            }
            float m150976c = c31071a6.m150976c();
            C31071a c31071a7 = this.f47783I;
            if (c31071a7 == null) {
                AbstractC19074t.m100223u("floatingConfig");
                c31071a7 = null;
            }
            m150986m = m150976c * c31071a7.m150986m();
        } else {
            if (c31071a6 == null) {
                AbstractC19074t.m100223u("floatingConfig");
                c31071a6 = null;
            }
            m150986m = c31071a6.m150986m();
        }
        RoundedImageView roundedImageView3 = this.f47796V;
        if (roundedImageView3 == null) {
            AbstractC19074t.m100223u("imgFloating");
            roundedImageView3 = null;
        }
        roundedImageView3.m47825j(m150986m, m150986m, m150986m, m150986m);
        RoundedImageView roundedImageView4 = this.f47796V;
        if (roundedImageView4 == null) {
            AbstractC19074t.m100223u("imgFloating");
            roundedImageView4 = null;
        }
        C31071a c31071a8 = this.f47783I;
        if (z11) {
            if (c31071a8 == null) {
                AbstractC19074t.m100223u("floatingConfig");
                c31071a8 = null;
            }
            float m150976c2 = c31071a8.m150976c();
            C31071a c31071a9 = this.f47783I;
            if (c31071a9 == null) {
                AbstractC19074t.m100223u("floatingConfig");
                c31071a9 = null;
            }
            m150984k = m150976c2 * c31071a9.m150984k();
        } else {
            if (c31071a8 == null) {
                AbstractC19074t.m100223u("floatingConfig");
                c31071a8 = null;
            }
            m150984k = c31071a8.m150984k();
        }
        roundedImageView4.setBorderWidthDP(m150984k);
        InterfaceC8946b interfaceC8946b = this.f47782H;
        if (interfaceC8946b == null) {
            AbstractC19074t.m100223u("mAButtonListener");
            interfaceC8946b = null;
        }
        RoundedImageView mo47735b = interfaceC8946b.mo47735b();
        if (mo47735b == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams2 = mo47735b.getLayoutParams();
        Context context3 = getContext();
        AbstractC19074t.m100207e(context3, "getContext(...)");
        C31071a c31071a10 = this.f47783I;
        if (c31071a10 == null) {
            AbstractC19074t.m100223u("floatingConfig");
            c31071a10 = null;
        }
        float m150991r = c31071a10.m150991r();
        if (z11) {
            C31071a c31071a11 = this.f47783I;
            if (c31071a11 == null) {
                AbstractC19074t.m100223u("floatingConfig");
                c31071a11 = null;
            }
            f13 = c31071a11.m150976c();
        } else {
            f13 = 1.0f;
        }
        layoutParams2.width = aVar.m47751c(context3, m150991r * f13);
        Context context4 = getContext();
        AbstractC19074t.m100207e(context4, "getContext(...)");
        C31071a c31071a12 = this.f47783I;
        if (c31071a12 == null) {
            AbstractC19074t.m100223u("floatingConfig");
            c31071a12 = null;
        }
        float m150991r2 = c31071a12.m150991r();
        if (z11) {
            C31071a c31071a13 = this.f47783I;
            if (c31071a13 == null) {
                AbstractC19074t.m100223u("floatingConfig");
                c31071a13 = null;
            }
            f14 = c31071a13.m150976c();
        }
        layoutParams2.height = aVar.m47751c(context4, m150991r2 * f14);
        C31071a c31071a14 = this.f47783I;
        if (c31071a14 == null) {
            AbstractC19074t.m100223u("floatingConfig");
            c31071a14 = null;
        }
        float m150976c3 = c31071a14.m150976c();
        C31071a c31071a15 = this.f47783I;
        if (c31071a15 == null) {
            AbstractC19074t.m100223u("floatingConfig");
            c31071a15 = null;
        }
        mo47735b.setBorderWidthDP(m150976c3 * c31071a15.m150975b());
        if (z11) {
            C31071a c31071a16 = this.f47783I;
            if (c31071a16 == null) {
                AbstractC19074t.m100223u("floatingConfig");
                c31071a16 = null;
            }
            float m150990q2 = c31071a16.m150990q();
            C31071a c31071a17 = this.f47783I;
            if (c31071a17 == null) {
                AbstractC19074t.m100223u("floatingConfig");
            } else {
                c31071a = c31071a17;
            }
            m150990q = m150990q2 * c31071a.m150976c();
        } else {
            C31071a c31071a18 = this.f47783I;
            if (c31071a18 == null) {
                AbstractC19074t.m100223u("floatingConfig");
            } else {
                c31071a = c31071a18;
            }
            m150990q = c31071a.m150990q();
        }
        mo47735b.m47825j(m150990q, m150990q, m150990q, m150990q);
        mo47735b.setLayoutParams(layoutParams2);
    }

    /* renamed from: j */
    private final void m47728j(AbstractC31072b abstractC31072b) {
        EnumC25629a enumC25629a;
        Bitmap mo102607a = abstractC31072b.mo102607a();
        RoundedImageView roundedImageView = null;
        if (mo102607a != null) {
            RoundedImageView roundedImageView2 = this.f47796V;
            if (roundedImageView2 == null) {
                AbstractC19074t.m100223u("imgFloating");
            } else {
                roundedImageView = roundedImageView2;
            }
            roundedImageView.setImageBitmap(mo102607a);
            return;
        }
        String mo102608b = abstractC31072b.mo102608b();
        if (mo102608b != null) {
            C23528a c23528a = new C23528a(getContext());
            RoundedImageView roundedImageView3 = this.f47796V;
            if (roundedImageView3 == null) {
                AbstractC19074t.m100223u("imgFloating");
            } else {
                roundedImageView = roundedImageView3;
            }
            C23528a c23528a2 = (C23528a) c23528a.m123612r(roundedImageView);
            if (AbstractC3972e.m18765V()) {
                enumC25629a = EnumC25629a.IN_BITMAP;
            } else {
                enumC25629a = EnumC25629a.DEFAULT;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0063, code lost:            if (r6 > r0) goto L23;     */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m47729k(float f11, float f12, boolean z11, long j11, boolean z12) {
        float f13;
        float f14;
        float f15;
        InterfaceC8946b interfaceC8946b = this.f47782H;
        InterfaceC8946b interfaceC8946b2 = null;
        if (interfaceC8946b == null) {
            AbstractC19074t.m100223u("mAButtonListener");
            interfaceC8946b = null;
        }
        this.f47800c0 = interfaceC8946b.mo47742i();
        InterfaceC8946b interfaceC8946b3 = this.f47782H;
        if (interfaceC8946b3 == null) {
            AbstractC19074t.m100223u("mAButtonListener");
            interfaceC8946b3 = null;
        }
        this.f47801d0 = interfaceC8946b3.mo47737d();
        InterfaceC8946b interfaceC8946b4 = this.f47782H;
        if (interfaceC8946b4 == null) {
            AbstractC19074t.m100223u("mAButtonListener");
            interfaceC8946b4 = null;
        }
        this.f47802e0 = interfaceC8946b4.mo47736c();
        InterfaceC8946b interfaceC8946b5 = this.f47782H;
        if (interfaceC8946b5 == null) {
            AbstractC19074t.m100223u("mAButtonListener");
            interfaceC8946b5 = null;
        }
        this.f47803f0 = interfaceC8946b5.mo47734a();
        InterfaceC8946b interfaceC8946b6 = this.f47782H;
        if (interfaceC8946b6 == null) {
            AbstractC19074t.m100223u("mAButtonListener");
            interfaceC8946b6 = null;
        }
        if (f11 > (interfaceC8946b6.mo47736c() - this.f47788N) / 2) {
            f13 = this.f47802e0;
        } else {
            f13 = this.f47800c0;
        }
        float f16 = this.f47801d0;
        if (f12 >= f16) {
            f16 = this.f47803f0;
        }
        f12 = f16;
        if (z11) {
            m47732g(f13, f12, j11);
        }
        InterfaceC8946b interfaceC8946b7 = this.f47782H;
        if (interfaceC8946b7 == null) {
            AbstractC19074t.m100223u("mAButtonListener");
            interfaceC8946b7 = null;
        }
        float mo47736c = interfaceC8946b7.mo47736c();
        InterfaceC8946b interfaceC8946b8 = this.f47782H;
        if (interfaceC8946b8 == null) {
            AbstractC19074t.m100223u("mAButtonListener");
            interfaceC8946b8 = null;
        }
        float mo47734a = interfaceC8946b8.mo47734a();
        if (mo47736c > 0.0f) {
            f14 = f13 / mo47736c;
        } else {
            f14 = 1.0f;
        }
        this.f47804g0 = f14;
        if (mo47734a > 0.0f) {
            f15 = f12 / mo47734a;
        } else {
            f15 = 0.5f;
        }
        this.f47805h0 = f15;
        if (z12) {
            InterfaceC8946b interfaceC8946b9 = this.f47782H;
            if (interfaceC8946b9 == null) {
                AbstractC19074t.m100223u("mAButtonListener");
            } else {
                interfaceC8946b2 = interfaceC8946b9;
            }
            interfaceC8946b2.mo47739f(this.f47804g0, this.f47805h0);
        }
    }

    /* renamed from: l */
    static /* synthetic */ void m47730l(FloatingItemView floatingItemView, float f11, float f12, boolean z11, long j11, boolean z12, int i11, Object obj) {
        boolean z13;
        boolean z14;
        if ((i11 & 4) != 0) {
            z13 = true;
        } else {
            z13 = z11;
        }
        if ((i11 & 8) != 0) {
            j11 = 0;
        }
        long j12 = j11;
        if ((i11 & 16) != 0) {
            z14 = false;
        } else {
            z14 = z12;
        }
        floatingItemView.m47729k(f11, f12, z13, j12, z14);
    }

    private final void setImageBackground(boolean z11) {
        int i11;
        if (z11) {
            i11 = AbstractC2807a.ui_background_pressed;
        } else {
            i11 = AbstractC2807a.container;
        }
        setBackgroundColor(AbstractC22459a.m116119a(getContext(), i11));
    }

    /* renamed from: f */
    public final void m47731f() {
        float f11 = this.f47804g0;
        if (f11 < 0.0f || f11 > 1.0f) {
            this.f47804g0 = 1.0f;
        }
        float f12 = this.f47805h0;
        if (f12 < 0.0f || f12 > 1.0f) {
            this.f47805h0 = 0.5f;
        }
        float f13 = this.f47804g0;
        InterfaceC8946b interfaceC8946b = this.f47782H;
        InterfaceC8946b interfaceC8946b2 = null;
        if (interfaceC8946b == null) {
            AbstractC19074t.m100223u("mAButtonListener");
            interfaceC8946b = null;
        }
        float mo47736c = f13 * interfaceC8946b.mo47736c();
        float f14 = this.f47805h0;
        InterfaceC8946b interfaceC8946b3 = this.f47782H;
        if (interfaceC8946b3 == null) {
            AbstractC19074t.m100223u("mAButtonListener");
        } else {
            interfaceC8946b2 = interfaceC8946b3;
        }
        m47730l(this, mo47736c, f14 * interfaceC8946b2.mo47734a(), false, 0L, false, 28, null);
    }

    /* renamed from: g */
    public final void m47732g(float f11, float f12, long j11) {
        ViewPropertyAnimator animate;
        int i11;
        int i12;
        ViewPropertyAnimator duration;
        animate().x(f11).y(f12).setDuration(j11).start();
        InterfaceC8946b interfaceC8946b = this.f47782H;
        if (interfaceC8946b == null) {
            AbstractC19074t.m100223u("mAButtonListener");
            interfaceC8946b = null;
        }
        RoundedImageView mo47735b = interfaceC8946b.mo47735b();
        if (mo47735b != null && (animate = mo47735b.animate()) != null) {
            EnumC8947c enumC8947c = this.f47780F;
            EnumC8947c enumC8947c2 = EnumC8947c.f47808q;
            if (enumC8947c == enumC8947c2) {
                i11 = this.f47799b0;
            } else {
                i11 = this.f47798a0;
            }
            ViewPropertyAnimator x11 = animate.x(f11 + i11);
            if (x11 != null) {
                if (this.f47780F == enumC8947c2) {
                    i12 = this.f47799b0;
                } else {
                    i12 = this.f47798a0;
                }
                ViewPropertyAnimator y11 = x11.y(f12 + i12);
                if (y11 != null && (duration = y11.setDuration(j11)) != null) {
                    duration.start();
                }
            }
        }
    }

    public final String getItemId() {
        AbstractC31072b abstractC31072b = this.f47794T;
        if (abstractC31072b == null) {
            AbstractC19074t.m100223u("floatingItemData");
            abstractC31072b = null;
        }
        return abstractC31072b.mo102610d();
    }

    /* renamed from: h */
    public final void m47733h(float f11, float f12) {
        m47730l(this, f11, f12, false, 0L, false, 28, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        AbstractC31072b abstractC31072b = this.f47794T;
        if (abstractC31072b == null) {
            AbstractC19074t.m100223u("floatingItemData");
            abstractC31072b = null;
        }
        if (abstractC31072b.mo102609c() == EnumC31074d.f143266q) {
            C23744a.Companion.m124119a().m124116d(15004, 0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AbstractC31072b abstractC31072b = this.f47794T;
        if (abstractC31072b == null) {
            AbstractC19074t.m100223u("floatingItemData");
            abstractC31072b = null;
        }
        if (abstractC31072b.mo102609c() == EnumC31074d.f143266q) {
            C23744a.Companion.m124119a().m124116d(15004, 8);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        FloatingCloseButton floatingCloseButton;
        C31081k m47758b;
        double d11;
        int[] iArr;
        AbstractC19074t.m100208f(motionEvent, "motionEvent");
        if (this.f47793S) {
            return false;
        }
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        int action = motionEvent.getAction();
        C8949b c8949b = this.f47779E;
        InterfaceC8946b interfaceC8946b = null;
        C31071a c31071a = null;
        AbstractC31072b abstractC31072b = null;
        if (c8949b != null) {
            floatingCloseButton = c8949b.m47760d();
        } else {
            floatingCloseButton = null;
        }
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    long eventTime = motionEvent.getEventTime() - motionEvent.getDownTime();
                    if (Math.hypot(this.f47786L, this.f47787M) > this.f47778D && eventTime > ViewConfiguration.getTapTimeout()) {
                        this.f47781G = true;
                        if (floatingCloseButton != null) {
                            floatingCloseButton.m47720f();
                        }
                    }
                    if (this.f47781G) {
                        this.f47797W = true;
                        C8949b c8949b2 = this.f47779E;
                        if (c8949b2 != null) {
                            d11 = c8949b2.m47762f(rawX, rawY);
                        } else {
                            d11 = 0.0d;
                        }
                        if (d11 < this.f47777C) {
                            this.f47780F = EnumC8947c.f47808q;
                            m47727i();
                            C8949b c8949b3 = this.f47779E;
                            if (c8949b3 == null || (iArr = c8949b3.m47759c(this)) == null) {
                                iArr = new int[2];
                            }
                            m47732g(iArr[0], iArr[1], 0L);
                            if (floatingCloseButton != null) {
                                C31071a c31071a2 = this.f47783I;
                                if (c31071a2 == null) {
                                    AbstractC19074t.m100223u("floatingConfig");
                                } else {
                                    c31071a = c31071a2;
                                }
                                floatingCloseButton.m47722i(c31071a.m150977d());
                            }
                            if (this.f47795U) {
                                this.f47795U = false;
                                AbstractC8948a.a aVar = AbstractC8948a.Companion;
                                Context context = getContext();
                                AbstractC19074t.m100207e(context, "getContext(...)");
                                aVar.m47754i(context, 50L);
                            }
                        } else {
                            this.f47795U = true;
                            this.f47780F = EnumC8947c.f47807p;
                            if (floatingCloseButton != null) {
                                floatingCloseButton.m47723j();
                            }
                            this.f47788N = getWidth();
                            this.f47789O = getHeight();
                            float f11 = rawX + this.f47786L;
                            this.f47790P = f11;
                            float f12 = rawY + this.f47787M;
                            this.f47791Q = f12;
                            m47732g(f11, f12, 0L);
                            m47727i();
                        }
                    }
                }
            } else {
                setImageBackground(false);
                this.f47781G = false;
                if (floatingCloseButton != null) {
                    floatingCloseButton.m47721g(true);
                }
                if (this.f47780F == EnumC8947c.f47808q) {
                    this.f47793S = true;
                    C8949b c8949b4 = this.f47779E;
                    if (c8949b4 != null && (m47758b = c8949b4.m47758b()) != null) {
                        m47758b.m151012p();
                    }
                    InterfaceC8946b interfaceC8946b2 = this.f47782H;
                    if (interfaceC8946b2 == null) {
                        AbstractC19074t.m100223u("mAButtonListener");
                        interfaceC8946b2 = null;
                    }
                    AbstractC31072b abstractC31072b2 = this.f47794T;
                    if (abstractC31072b2 == null) {
                        AbstractC19074t.m100223u("floatingItemData");
                    } else {
                        abstractC31072b = abstractC31072b2;
                    }
                    interfaceC8946b2.mo47744k(abstractC31072b);
                    return true;
                }
                this.f47780F = EnumC8947c.f47807p;
                float f13 = this.f47786L + rawX;
                float f14 = this.f47787M + rawY;
                float f15 = rawX - this.f47784J;
                float f16 = rawY - this.f47785K;
                if (Math.abs(f15) < 10.0f && Math.abs(f16) < 10.0f) {
                    performClick();
                    return true;
                }
                m47729k(f13, f14, this.f47797W, 300L, true);
            }
        } else {
            setImageBackground(true);
            this.f47792R = false;
            this.f47784J = rawX;
            this.f47785K = rawY;
            this.f47786L = getX() - this.f47784J;
            this.f47787M = getY() - this.f47785K;
            this.f47780F = EnumC8947c.f47807p;
            this.f47797W = false;
            InterfaceC8946b interfaceC8946b3 = this.f47782H;
            if (interfaceC8946b3 == null) {
                AbstractC19074t.m100223u("mAButtonListener");
                interfaceC8946b3 = null;
            }
            this.f47800c0 = interfaceC8946b3.mo47742i();
            InterfaceC8946b interfaceC8946b4 = this.f47782H;
            if (interfaceC8946b4 == null) {
                AbstractC19074t.m100223u("mAButtonListener");
                interfaceC8946b4 = null;
            }
            this.f47801d0 = interfaceC8946b4.mo47737d();
            InterfaceC8946b interfaceC8946b5 = this.f47782H;
            if (interfaceC8946b5 == null) {
                AbstractC19074t.m100223u("mAButtonListener");
                interfaceC8946b5 = null;
            }
            this.f47802e0 = interfaceC8946b5.mo47736c();
            InterfaceC8946b interfaceC8946b6 = this.f47782H;
            if (interfaceC8946b6 == null) {
                AbstractC19074t.m100223u("mAButtonListener");
            } else {
                interfaceC8946b = interfaceC8946b6;
            }
            this.f47803f0 = interfaceC8946b.mo47734a();
        }
        return true;
    }

    @Override // android.view.View
    public boolean performClick() {
        InterfaceC8946b interfaceC8946b = this.f47782H;
        AbstractC31072b abstractC31072b = null;
        if (interfaceC8946b == null) {
            AbstractC19074t.m100223u("mAButtonListener");
            interfaceC8946b = null;
        }
        AbstractC31072b abstractC31072b2 = this.f47794T;
        if (abstractC31072b2 == null) {
            AbstractC19074t.m100223u("floatingItemData");
            abstractC31072b2 = null;
        }
        C0708i mo47743j = interfaceC8946b.mo47743j(abstractC31072b2);
        if (mo47743j != null) {
            setTrackingExtraData(mo47743j);
        }
        InterfaceC8946b interfaceC8946b2 = this.f47782H;
        if (interfaceC8946b2 == null) {
            AbstractC19074t.m100223u("mAButtonListener");
            interfaceC8946b2 = null;
        }
        AbstractC31072b abstractC31072b3 = this.f47794T;
        if (abstractC31072b3 == null) {
            AbstractC19074t.m100223u("floatingItemData");
        } else {
            abstractC31072b = abstractC31072b3;
        }
        interfaceC8946b2.mo47741h(abstractC31072b);
        return super.performClick();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FloatingItemView(C8949b c8949b, Context context, AbstractC31072b abstractC31072b, InterfaceC8946b interfaceC8946b, C31071a c31071a) {
        super(new C21983d(context, AbstractC2814h.shadow_level_03), null, AbstractC2814h.shadow_level_03);
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(abstractC31072b, "floatingItemData");
        AbstractC19074t.m100208f(interfaceC8946b, "mAButtonListener");
        AbstractC19074t.m100208f(c31071a, "floatingConfig");
        AbstractC8948a.a aVar = AbstractC8948a.Companion;
        Context context2 = getContext();
        AbstractC19074t.m100205c(context2);
        this.f47777C = aVar.m47751c(context2, 100.0f);
        this.f47778D = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.f47795U = true;
        this.f47804g0 = 1.0f;
        this.f47805h0 = 0.5f;
        this.f47779E = c8949b;
        this.f47794T = abstractC31072b;
        this.f47782H = interfaceC8946b;
        this.f47783I = c31071a;
        m47726e();
    }
}
