package com.zing.zalo.shortvideo.p072ui.component.bts;

import android.content.Context;
import android.graphics.Rect;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import androidx.core.view.C1547f0;
import com.zing.zalo.shortvideo.p072ui.component.bts.BottomSheetLayout;
import com.zing.zalo.shortvideo.p072ui.widget.p075rv.OverScrollableRecyclerView;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import hn0.AbstractC20104d;
import java.util.HashMap;
import ln0.AbstractC22543l;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.C24860q;
import pm0.InterfaceC24854k;
import r20.AbstractC25622b;
import r20.C25624d;
import r20.C25626f;
import r20.C25627g;
import r20.C25628h;
import s20.AbstractC26104f;
import s20.AbstractC26108j;
import s20.AbstractC26112n;
import v00.AbstractC27407b;
import v00.AbstractC27409d;

/* loaded from: classes5.dex */
public final class BottomSheetLayout extends FrameLayout {

    /* renamed from: A */
    private int f50379A;

    /* renamed from: B */
    private int f50380B;

    /* renamed from: C */
    private int f50381C;

    /* renamed from: D */
    private boolean f50382D;

    /* renamed from: E */
    private boolean f50383E;

    /* renamed from: F */
    private boolean f50384F;

    /* renamed from: G */
    private boolean f50385G;

    /* renamed from: H */
    private boolean f50386H;

    /* renamed from: I */
    private VelocityTracker f50387I;

    /* renamed from: J */
    private MotionEvent f50388J;

    /* renamed from: K */
    private MotionEvent f50389K;

    /* renamed from: L */
    private MotionEvent f50390L;

    /* renamed from: M */
    private HashMap f50391M;

    /* renamed from: N */
    private InterfaceC18494a f50392N;

    /* renamed from: O */
    private InterfaceC18494a f50393O;

    /* renamed from: P */
    private final InterfaceC24854k f50394P;

    /* renamed from: Q */
    private final InterfaceC24854k f50395Q;

    /* renamed from: R */
    private final InterfaceC24854k f50396R;

    /* renamed from: S */
    private final InterfaceC24854k f50397S;

    /* renamed from: p */
    private final C1547f0 f50398p;

    /* renamed from: q */
    private final int f50399q;

    /* renamed from: r */
    private final int f50400r;

    /* renamed from: s */
    private final int f50401s;

    /* renamed from: t */
    private AbstractC25622b f50402t;

    /* renamed from: u */
    private float f50403u;

    /* renamed from: v */
    private float f50404v;

    /* renamed from: w */
    private float f50405w;

    /* renamed from: x */
    private float f50406x;

    /* renamed from: y */
    private float f50407y;

    /* renamed from: z */
    private int f50408z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.component.bts.BottomSheetLayout$a */
    /* loaded from: classes5.dex */
    public static final class C9474a extends AbstractC19075u implements InterfaceC18505l {
        C9474a() {
            super(1);
        }

        /* renamed from: a */
        public final void m51795a(float f11) {
            BottomSheetLayout.this.m51794z((int) f11);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m51795a(((Number) obj).floatValue());
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.component.bts.BottomSheetLayout$b */
    /* loaded from: classes5.dex */
    public static final class C9475b extends AbstractC19075u implements InterfaceC18494a {
        C9475b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m51796a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m51796a() {
            BottomSheetLayout.this.f50382D = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.component.bts.BottomSheetLayout$c */
    /* loaded from: classes5.dex */
    public static final class C9476c extends AbstractC19075u implements InterfaceC18505l {
        C9476c() {
            super(1);
        }

        /* renamed from: a */
        public final void m51797a(float f11) {
            BottomSheetLayout.this.m51794z((int) f11);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m51797a(((Number) obj).floatValue());
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.component.bts.BottomSheetLayout$d */
    /* loaded from: classes5.dex */
    public static final class C9477d extends AbstractC19075u implements InterfaceC18494a {
        C9477d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m51798a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m51798a() {
            BottomSheetLayout.this.f50392N.mo12V4();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.component.bts.BottomSheetLayout$e */
    /* loaded from: classes5.dex */
    public static final class C9478e extends AbstractC19075u implements InterfaceC18505l {
        C9478e() {
            super(1);
        }

        /* renamed from: a */
        public final void m51799a(float f11) {
            BottomSheetLayout.this.m51790B(f11);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m51799a(((Number) obj).floatValue());
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.component.bts.BottomSheetLayout$f */
    /* loaded from: classes5.dex */
    public static final class C9479f extends AbstractC19075u implements InterfaceC18505l {
        C9479f() {
            super(1);
        }

        /* renamed from: a */
        public final void m51800a(float f11) {
            BottomSheetLayout.this.m51790B(f11);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m51800a(((Number) obj).floatValue());
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.bts.BottomSheetLayout$g */
    /* loaded from: classes5.dex */
    static final class C9480g extends AbstractC19075u implements InterfaceC18494a {
        C9480g() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final View mo12V4() {
            return BottomSheetLayout.this.findViewById(AbstractC27409d.btnClose);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.bts.BottomSheetLayout$h */
    /* loaded from: classes5.dex */
    static final class C9481h extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C9481h f50416q = new C9481h();

        C9481h() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m51802a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m51802a() {
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.bts.BottomSheetLayout$i */
    /* loaded from: classes5.dex */
    static final class C9482i extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C9482i f50417q = new C9482i();

        C9482i() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m51803a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m51803a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.component.bts.BottomSheetLayout$j */
    /* loaded from: classes5.dex */
    public static final class C9483j extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C9483j f50418q = new C9483j();

        C9483j() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m51804a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m51804a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.component.bts.BottomSheetLayout$k */
    /* loaded from: classes5.dex */
    public static final class C9484k extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final C9484k f50419q = new C9484k();

        C9484k() {
            super(1);
        }

        /* renamed from: a */
        public final void m51805a(float f11) {
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m51805a(((Number) obj).floatValue());
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.component.bts.BottomSheetLayout$l */
    /* loaded from: classes5.dex */
    public static final class C9485l extends AbstractC19075u implements InterfaceC18494a {
        C9485l() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m51806a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m51806a() {
            BottomSheetLayout.this.f50392N.mo12V4();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.component.bts.BottomSheetLayout$m */
    /* loaded from: classes5.dex */
    public static final class C9486m extends AbstractC19075u implements InterfaceC18505l {
        C9486m() {
            super(1);
        }

        /* renamed from: a */
        public final void m51807a(float f11) {
            BottomSheetLayout.this.m51790B(f11);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m51807a(((Number) obj).floatValue());
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.bts.BottomSheetLayout$n */
    /* loaded from: classes5.dex */
    static final class C9487n extends AbstractC19075u implements InterfaceC18494a {
        C9487n() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final View mo12V4() {
            return BottomSheetLayout.this.findViewById(AbstractC27409d.lytContainer);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.bts.BottomSheetLayout$o */
    /* loaded from: classes5.dex */
    static final class C9488o extends AbstractC19075u implements InterfaceC18494a {
        C9488o() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m51809a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m51809a() {
            BottomSheetLayout.this.f50393O.mo12V4();
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.bts.BottomSheetLayout$p */
    /* loaded from: classes5.dex */
    static final class C9489p extends AbstractC19075u implements InterfaceC18505l {
        C9489p() {
            super(1);
        }

        /* renamed from: a */
        public final void m51810a(float f11) {
            BottomSheetLayout.this.m51790B(f11);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m51810a(((Number) obj).floatValue());
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.component.bts.BottomSheetLayout$q */
    /* loaded from: classes5.dex */
    public static final class C9490q extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C9490q f50425q = new C9490q();

        C9490q() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m51811a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m51811a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.component.bts.BottomSheetLayout$r */
    /* loaded from: classes5.dex */
    public static final class C9491r extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final C9491r f50426q = new C9491r();

        C9491r() {
            super(1);
        }

        /* renamed from: a */
        public final void m51812a(float f11) {
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m51812a(((Number) obj).floatValue());
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.bts.BottomSheetLayout$s */
    /* loaded from: classes5.dex */
    static final class C9492s extends AbstractC19075u implements InterfaceC18494a {
        C9492s() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final View mo12V4() {
            return BottomSheetLayout.this.findViewById(AbstractC27409d.touchOutside);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.bts.BottomSheetLayout$t */
    /* loaded from: classes5.dex */
    static final class C9493t extends AbstractC19075u implements InterfaceC18494a {
        C9493t() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final View mo12V4() {
            return BottomSheetLayout.this.findViewById(AbstractC27409d.vieThumb);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        InterfaceC24854k m129210a3;
        InterfaceC24854k m129210a4;
        AbstractC19074t.m100208f(context, "context");
        this.f50398p = new C1547f0(this);
        this.f50399q = AbstractC26112n.m134365F(this);
        this.f50400r = AbstractC26112n.m134433y(this, AbstractC27407b.zch_bts_header_height);
        this.f50401s = AbstractC26112n.m134433y(this, AbstractC27407b.zch_bts_thumb_height);
        this.f50403u = Float.NaN;
        this.f50391M = new HashMap();
        this.f50392N = C9481h.f50416q;
        this.f50393O = C9482i.f50417q;
        m129210a = AbstractC24856m.m129210a(new C9492s());
        this.f50394P = m129210a;
        m129210a2 = AbstractC24856m.m129210a(new C9487n());
        this.f50395Q = m129210a2;
        m129210a3 = AbstractC24856m.m129210a(new C9493t());
        this.f50396R = m129210a3;
        m129210a4 = AbstractC24856m.m129210a(new C9480g());
        this.f50397S = m129210a4;
    }

    /* renamed from: A */
    public static /* synthetic */ void m51768A(BottomSheetLayout bottomSheetLayout, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = (int) bottomSheetLayout.f50406x;
        }
        bottomSheetLayout.m51794z(i11);
    }

    /* renamed from: C */
    public static /* synthetic */ void m51769C(BottomSheetLayout bottomSheetLayout, float f11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = 0.0f;
        }
        bottomSheetLayout.m51790B(f11);
    }

    private final View getBtnClose() {
        return (View) this.f50397S.getValue();
    }

    private final View getLytContainer() {
        return (View) this.f50395Q.getValue();
    }

    private final View getTouchOutside() {
        return (View) this.f50394P.getValue();
    }

    private final View getVieThumb() {
        return (View) this.f50396R.getValue();
    }

    /* renamed from: i */
    private final void m51778i(float f11) {
        float m116579b;
        float m116579b2;
        if (this.f50382D && this.f50403u == 0.0f) {
            int i11 = this.f50408z;
            float f12 = this.f50406x;
            if (i11 >= ((int) f12)) {
                if (f11 <= 0.0f && (f11 != 0.0f || i11 >= (this.f50407y + f12) / 2.0f)) {
                    m51786v(i11, this.f50407y, -f11, new C9475b(), new C9476c());
                    return;
                } else {
                    m51787w(this, i11, f12, -f11, null, new C9474a(), 8, null);
                    return;
                }
            }
        }
        if (f11 <= 0.0f && (f11 != 0.0f || getLytContainer().getTranslationY() <= getLytContainer().getMeasuredHeight() / 2.0f)) {
            m51787w(this, this.f50403u, 0.0f, f11, null, new C9479f(), 10, null);
            return;
        }
        float translationY = getLytContainer().getTranslationY();
        float measuredHeight = getLytContainer().getMeasuredHeight();
        m116579b = AbstractC22543l.m116579b((r0.getMeasuredHeight() - getLytContainer().getTranslationY()) * 4.0f, this.f50380B);
        m116579b2 = AbstractC22543l.m116579b(m116579b, f11);
        m51782m(this, 0.0f, translationY, measuredHeight, m116579b2, new C9477d(), new C9478e(), 1, null);
        View lytContainer = getLytContainer();
        AbstractC19074t.m100207e(lytContainer, "<get-lytContainer>(...)");
        AbstractC26112n.m134369J(lytContainer);
    }

    /* renamed from: j */
    static /* synthetic */ void m51779j(BottomSheetLayout bottomSheetLayout, float f11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = 0.0f;
        }
        bottomSheetLayout.m51778i(f11);
    }

    /* renamed from: k */
    private final Rect m51780k(View view) {
        if (view.getParent() instanceof BottomSheetLayout) {
            return AbstractC26112n.m134360A(view);
        }
        Object parent = view.getParent();
        AbstractC19074t.m100206d(parent, "null cannot be cast to non-null type android.view.View");
        Rect m51780k = m51780k((View) parent);
        Rect m134360A = AbstractC26112n.m134360A(view);
        int i11 = m134360A.left;
        if (i11 > 0) {
            m134360A.left = i11 + m51780k.left;
        } else {
            m134360A.left = m51780k.left;
        }
        int i12 = m134360A.top;
        if (i12 > 0) {
            m134360A.top = i12 + m51780k.top;
        } else {
            m134360A.top = m51780k.top;
        }
        if (m134360A.right < m51780k.width()) {
            m134360A.right += m51780k.left;
        } else {
            m134360A.right = m51780k.right;
        }
        if (m134360A.bottom < m51780k.height()) {
            m134360A.bottom += m51780k.top;
        } else {
            m134360A.bottom = m51780k.bottom;
        }
        return m134360A;
    }

    /* renamed from: l */
    private final void m51781l(float f11, float f12, float f13, float f14, final InterfaceC18494a interfaceC18494a, final InterfaceC18505l interfaceC18505l) {
        if (f12 >= f11 && f12 <= f13 && f14 != 0.0f) {
            C25624d c25624d = new C25624d(new C25626f(f12));
            c25624d.m132328c(new AbstractC25622b.r() { // from class: v10.b
                @Override // r20.AbstractC25622b.r
                /* renamed from: a */
                public final void mo52475a(AbstractC25622b abstractC25622b, float f15, float f16) {
                    BottomSheetLayout.m51783n(InterfaceC18505l.this, abstractC25622b, f15, f16);
                }
            });
            c25624d.m132327b(new AbstractC25622b.q() { // from class: v10.c
                @Override // r20.AbstractC25622b.q
                /* renamed from: a */
                public final void mo52476a(AbstractC25622b abstractC25622b, boolean z11, float f15, float f16) {
                    BottomSheetLayout.m51784p(InterfaceC18494a.this, abstractC25622b, z11, f15, f16);
                }
            });
            c25624d.m132372u(f14);
            c25624d.m132371t(f11);
            c25624d.m132370s(f13);
            c25624d.m132369r(0.1f);
            c25624d.mo132336n();
            this.f50402t = c25624d;
            return;
        }
        interfaceC18494a.mo12V4();
    }

    /* renamed from: m */
    static /* synthetic */ void m51782m(BottomSheetLayout bottomSheetLayout, float f11, float f12, float f13, float f14, InterfaceC18494a interfaceC18494a, InterfaceC18505l interfaceC18505l, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = 0.0f;
        }
        if ((i11 & 2) != 0) {
            f12 = 0.0f;
        }
        if ((i11 & 4) != 0) {
            f13 = 0.0f;
        }
        if ((i11 & 8) != 0) {
            f14 = 0.0f;
        }
        if ((i11 & 16) != 0) {
            interfaceC18494a = C9483j.f50418q;
        }
        if ((i11 & 32) != 0) {
            interfaceC18505l = C9484k.f50419q;
        }
        bottomSheetLayout.m51781l(f11, f12, f13, f14, interfaceC18494a, interfaceC18505l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public static final void m51783n(InterfaceC18505l interfaceC18505l, AbstractC25622b abstractC25622b, float f11, float f12) {
        AbstractC19074t.m100208f(interfaceC18505l, "$updAction");
        interfaceC18505l.mo205i9(Float.valueOf(f11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public static final void m51784p(InterfaceC18494a interfaceC18494a, AbstractC25622b abstractC25622b, boolean z11, float f11, float f12) {
        AbstractC19074t.m100208f(interfaceC18494a, "$endAction");
        if (!z11) {
            interfaceC18494a.mo12V4();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public static final void m51785r(BottomSheetLayout bottomSheetLayout, View view) {
        AbstractC19074t.m100208f(bottomSheetLayout, "this$0");
        bottomSheetLayout.m51791q();
    }

    /* renamed from: v */
    private final void m51786v(float f11, float f12, float f13, final InterfaceC18494a interfaceC18494a, final InterfaceC18505l interfaceC18505l) {
        if (f11 == f12 && f13 == 0.0f) {
            interfaceC18505l.mo205i9(Float.valueOf(f12));
            interfaceC18494a.mo12V4();
            return;
        }
        C25627g c25627g = new C25627g(new C25626f(f11));
        C25628h c25628h = new C25628h();
        c25628h.m132386d(1.0f);
        c25628h.m132388f(1000.0f);
        c25627g.m132382t(c25628h);
        c25627g.m132328c(new AbstractC25622b.r() { // from class: v10.e
            @Override // r20.AbstractC25622b.r
            /* renamed from: a */
            public final void mo52475a(AbstractC25622b abstractC25622b, float f14, float f15) {
                BottomSheetLayout.m51788x(InterfaceC18505l.this, abstractC25622b, f14, f15);
            }
        });
        c25627g.m132327b(new AbstractC25622b.q() { // from class: v10.f
            @Override // r20.AbstractC25622b.q
            /* renamed from: a */
            public final void mo52476a(AbstractC25622b abstractC25622b, boolean z11, float f14, float f15) {
                BottomSheetLayout.m51789y(InterfaceC18494a.this, abstractC25622b, z11, f14, f15);
            }
        });
        c25627g.m132335m(f13);
        c25627g.m132380q(f12);
        this.f50402t = c25627g;
    }

    /* renamed from: w */
    static /* synthetic */ void m51787w(BottomSheetLayout bottomSheetLayout, float f11, float f12, float f13, InterfaceC18494a interfaceC18494a, InterfaceC18505l interfaceC18505l, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = 0.0f;
        }
        if ((i11 & 2) != 0) {
            f12 = 0.0f;
        }
        if ((i11 & 4) != 0) {
            f13 = 0.0f;
        }
        if ((i11 & 8) != 0) {
            interfaceC18494a = C9490q.f50425q;
        }
        if ((i11 & 16) != 0) {
            interfaceC18505l = C9491r.f50426q;
        }
        bottomSheetLayout.m51786v(f11, f12, f13, interfaceC18494a, interfaceC18505l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public static final void m51788x(InterfaceC18505l interfaceC18505l, AbstractC25622b abstractC25622b, float f11, float f12) {
        AbstractC19074t.m100208f(interfaceC18505l, "$updAction");
        interfaceC18505l.mo205i9(Float.valueOf(f11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public static final void m51789y(InterfaceC18494a interfaceC18494a, AbstractC25622b abstractC25622b, boolean z11, float f11, float f12) {
        AbstractC19074t.m100208f(interfaceC18494a, "$endAction");
        if (!z11) {
            interfaceC18494a.mo12V4();
        }
    }

    /* renamed from: B */
    public final void m51790B(float f11) {
        getLytContainer().setTranslationY(f11);
        getBtnClose().setTranslationY(f11);
        getVieThumb().setTranslationY(f11);
        this.f50403u = f11;
        if (f11 < 0.0f) {
            setAlpha(1.0f);
            getLytContainer().setPivotY(0.0f);
            getLytContainer().setScaleY(1.0f - (f11 / getLytContainer().getMeasuredHeight()));
        } else {
            setAlpha(1.0f - (f11 / getLytContainer().getMeasuredHeight()));
            getLytContainer().setScaleY(1.0f);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        AbstractC19074t.m100208f(motionEvent, "event");
        if (this.f50386H) {
            if (motionEvent.getActionMasked() == 3 || motionEvent.getActionMasked() == 1) {
                this.f50386H = false;
            }
            return onTouchEvent(motionEvent);
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f50388J = AbstractC26104f.m134330a(motionEvent);
        }
        this.f50390L = AbstractC26104f.m134330a(motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f50398p.m7761a();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f50391M.clear();
        AbstractC25622b abstractC25622b = this.f50402t;
        if (abstractC25622b != null) {
            abstractC25622b.m132329d();
        }
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f50379A = viewConfiguration.getScaledTouchSlop();
        this.f50380B = viewConfiguration.getScaledMinimumFlingVelocity() * 10;
        this.f50381C = viewConfiguration.getScaledMaximumFlingVelocity();
        getBtnClose().setOnClickListener(new View.OnClickListener() { // from class: v10.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BottomSheetLayout.m51785r(BottomSheetLayout.this, view);
            }
        });
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        AbstractC19074t.m100208f(motionEvent, "event");
        AbstractC25622b abstractC25622b = this.f50402t;
        if (abstractC25622b != null && abstractC25622b.m132331h()) {
            return true;
        }
        onTouchEvent(motionEvent);
        if (this.f50387I != null) {
            return true;
        }
        return false;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        View touchOutside = getTouchOutside();
        AbstractC19074t.m100207e(touchOutside, "<get-touchOutside>(...)");
        AbstractC26112n.m134382W(touchOutside, measuredHeight, measuredWidth);
        if (this.f50385G) {
            int measuredWidth2 = getLytContainer().getMeasuredWidth() + ((measuredWidth - getLytContainer().getMeasuredWidth()) / 2);
            View lytContainer = getLytContainer();
            AbstractC19074t.m100207e(lytContainer, "<get-lytContainer>(...)");
            AbstractC26112n.m134382W(lytContainer, measuredHeight, measuredWidth2);
        } else {
            View lytContainer2 = getLytContainer();
            AbstractC19074t.m100207e(lytContainer2, "<get-lytContainer>(...)");
            AbstractC26112n.m134382W(lytContainer2, measuredHeight, measuredWidth);
        }
        View btnClose = getBtnClose();
        AbstractC19074t.m100207e(btnClose, "<get-btnClose>(...)");
        if (AbstractC26112n.m134378S(btnClose)) {
            int measuredWidth3 = getMeasuredWidth();
            int top = getLytContainer().getTop();
            if (this.f50385G) {
                View btnClose2 = getBtnClose();
                AbstractC19074t.m100207e(btnClose2, "<get-btnClose>(...)");
                AbstractC26112n.m134384Y(btnClose2, top, getLytContainer().getRight());
                return;
            } else {
                View btnClose3 = getBtnClose();
                AbstractC19074t.m100207e(btnClose3, "<get-btnClose>(...)");
                AbstractC26112n.m134384Y(btnClose3, top, measuredWidth3);
                return;
            }
        }
        int measuredWidth4 = (getMeasuredWidth() - getVieThumb().getMeasuredWidth()) / 2;
        int top2 = getLytContainer().getTop();
        View vieThumb = getVieThumb();
        AbstractC19074t.m100207e(vieThumb, "<get-vieThumb>(...)");
        AbstractC26112n.m134383X(vieThumb, top2, measuredWidth4);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        int i13;
        int i14;
        int size = View.MeasureSpec.getSize(i11);
        int size2 = View.MeasureSpec.getSize(i12);
        View touchOutside = getTouchOutside();
        AbstractC19074t.m100207e(touchOutside, "<get-touchOutside>(...)");
        AbstractC26112n.m134387a0(touchOutside, size, 1073741824, size2, 1073741824);
        View btnClose = getBtnClose();
        AbstractC19074t.m100207e(btnClose, "<get-btnClose>(...)");
        boolean z11 = false;
        if (AbstractC26112n.m134378S(btnClose)) {
            View btnClose2 = getBtnClose();
            AbstractC19074t.m100207e(btnClose2, "<get-btnClose>(...)");
            int i15 = this.f50400r;
            AbstractC26112n.m134387a0(btnClose2, i15, 1073741824, i15, 1073741824);
        } else {
            View vieThumb = getVieThumb();
            AbstractC19074t.m100207e(vieThumb, "<get-vieThumb>(...)");
            AbstractC26112n.m134387a0(vieThumb, 0, 0, this.f50401s, 1073741824);
        }
        int i16 = size2 - this.f50399q;
        if (this.f50404v > 0.0f) {
            if (getMeasuredHeight() != size2) {
                this.f50406x = this.f50404v;
                this.f50407y = this.f50405w;
                this.f50408z = 0;
            }
            if (this.f50408z == 0) {
                float f11 = this.f50406x;
                if (f11 <= 1.0f) {
                    float f12 = f11 * i16;
                    this.f50406x = f12;
                    this.f50408z = (int) f12;
                } else {
                    float f13 = i16;
                    if (f11 <= f13) {
                        this.f50408z = (int) f11;
                    } else if (f11 >= f13) {
                        this.f50408z = i16;
                        this.f50406x = f13;
                    }
                }
                if (this.f50405w > 0.0f) {
                    float f14 = this.f50407y;
                    if (f14 <= 1.0f) {
                        this.f50407y = f14 * i16;
                    }
                    float f15 = i16;
                    if (this.f50407y >= f15) {
                        this.f50407y = f15;
                    }
                    float f16 = this.f50407y;
                    float f17 = this.f50406x;
                    if (f16 <= f17) {
                        this.f50407y = 0.0f;
                    }
                    if (this.f50407y > f17 && this.f50384F) {
                        View lytContainer = getLytContainer();
                        AbstractC19074t.m100207e(lytContainer, "<get-lytContainer>(...)");
                        AbstractC26112n.m134387a0(lytContainer, size, 1073741824, (int) this.f50407y, Integer.MIN_VALUE);
                        if (this.f50406x >= getLytContainer().getMeasuredHeight()) {
                            this.f50406x = getLytContainer().getMeasuredHeight();
                            this.f50408z = getLytContainer().getMeasuredHeight();
                            this.f50407y = 0.0f;
                        } else {
                            this.f50407y = getLytContainer().getMeasuredHeight();
                        }
                    }
                }
                if (this.f50407y > this.f50406x) {
                    z11 = true;
                }
                this.f50382D = z11;
            }
            View lytContainer2 = getLytContainer();
            AbstractC19074t.m100207e(lytContainer2, "<get-lytContainer>(...)");
            if (this.f50385G) {
                i14 = size / 2;
            } else {
                i14 = size;
            }
            AbstractC26112n.m134387a0(lytContainer2, i14, 1073741824, this.f50408z, 1073741824);
        } else {
            float f18 = this.f50405w;
            if (f18 > 0.0f) {
                if (f18 <= 1.0f) {
                    i16 = (int) (i16 * f18);
                } else {
                    i16 = Math.min(i16, (int) f18);
                }
            }
            View lytContainer3 = getLytContainer();
            AbstractC19074t.m100207e(lytContainer3, "<get-lytContainer>(...)");
            if (this.f50385G) {
                i13 = size / 2;
            } else {
                i13 = size;
            }
            AbstractC26112n.m134387a0(lytContainer3, i13, 1073741824, i16, Integer.MIN_VALUE);
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f11, float f12, boolean z11) {
        AbstractC19074t.m100208f(view, "child");
        if (this.f50383E && !z11) {
            m51778i(-f12);
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f11, float f12) {
        AbstractC19074t.m100208f(view, "child");
        if (this.f50383E && this.f50403u > 0.0f) {
            m51778i(-f12);
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i11, int i12, int[] iArr) {
        Integer num;
        int m104529e;
        AbstractC19074t.m100208f(view, "child");
        AbstractC19074t.m100208f(iArr, "consumed");
        if (this.f50383E) {
            if (i12 > 0) {
                float f11 = this.f50403u;
                if (f11 > i12) {
                    iArr[1] = i12;
                } else {
                    iArr[1] = (int) f11;
                }
                int i13 = iArr[1];
                if (i13 > 0) {
                    m51790B(f11 - i13);
                }
                if (this.f50382D) {
                    float f12 = m51780k(view).top;
                    MotionEvent motionEvent = this.f50390L;
                    AbstractC19074t.m100205c(motionEvent);
                    float y11 = f12 - motionEvent.getY();
                    if (y11 > 0.0f) {
                        float f13 = this.f50407y;
                        int i14 = this.f50408z;
                        if (y11 >= f13 - i14) {
                            iArr[1] = iArr[1] + ((int) (f13 - i14));
                            m51794z((int) f13);
                        } else {
                            int i15 = iArr[1];
                            m104529e = AbstractC20104d.m104529e(y11);
                            iArr[1] = i15 + m104529e;
                            m51794z((int) (y11 + this.f50408z));
                        }
                        this.f50386H = true;
                        view.dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 3, 0.0f, 0.0f, 0));
                        MotionEvent motionEvent2 = this.f50390L;
                        AbstractC19074t.m100205c(motionEvent2);
                        dispatchTouchEvent(motionEvent2);
                        return;
                    }
                    return;
                }
                return;
            }
            if ((view instanceof OverScrollableRecyclerView) && !view.canScrollVertically(-1) && ((OverScrollableRecyclerView) view).getOffsetY() >= 0.0f && (num = (Integer) this.f50391M.get(view)) != null && num.intValue() == 0) {
                m51790B(this.f50403u - i12);
                iArr[1] = i12;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i11, int i12, int i13, int i14) {
        Integer num;
        float f11;
        AbstractC19074t.m100208f(view, "child");
        if (i12 != 0) {
            HashMap hashMap = this.f50391M;
            Integer num2 = (Integer) hashMap.get(view);
            if (num2 == null) {
                num2 = 0;
            }
            hashMap.put(view, Integer.valueOf(num2.intValue() + Math.abs(i12)));
        }
        if (this.f50383E && i14 < 0) {
            if (((view instanceof OverScrollableRecyclerView) && (((OverScrollableRecyclerView) view).getOffsetY() != 0.0f || view.canScrollVertically(-1))) || (num = (Integer) this.f50391M.get(view)) == null || num.intValue() != 0) {
                return;
            }
            float measuredHeight = this.f50403u - getLytContainer().getMeasuredHeight();
            float f12 = i14;
            if (measuredHeight > f12) {
                f11 = this.f50403u - measuredHeight;
            } else {
                f11 = this.f50403u - f12;
            }
            m51790B(f11);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i11) {
        AbstractC19074t.m100208f(view, "child");
        AbstractC19074t.m100208f(view2, ZinstantMetaConstant.TARGET_VIEWPORT);
        this.f50391M.put(view2, 0);
        this.f50398p.m7762b(view, view2, i11);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i11, int i12, int i13, int i14) {
        if (Float.isNaN(this.f50403u)) {
            m51790B(getLytContainer().getMeasuredHeight());
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i11) {
        AbstractC19074t.m100208f(view, "child");
        AbstractC19074t.m100208f(view2, ZinstantMetaConstant.TARGET_VIEWPORT);
        return (i11 & 2) != 0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        AbstractC25622b abstractC25622b;
        AbstractC19074t.m100208f(view, "child");
        if (this.f50383E && !this.f50386H && ((abstractC25622b = this.f50402t) == null || !abstractC25622b.m132331h())) {
            m51779j(this, 0.0f, 1, null);
        }
        this.f50398p.m7764d(view);
        this.f50391M.remove(view);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        AbstractC19074t.m100208f(motionEvent, "event");
        AbstractC25622b abstractC25622b = this.f50402t;
        if (abstractC25622b != null && abstractC25622b.m132331h()) {
            return true;
        }
        int actionMasked = motionEvent.getActionMasked();
        boolean z11 = false;
        if (actionMasked != 0) {
            float f11 = 0.0f;
            if (actionMasked != 2) {
                if (this.f50389K == null) {
                    MotionEvent motionEvent2 = this.f50388J;
                    if (motionEvent2 != null) {
                        if (this.f50385G && (motionEvent.getX() < getLytContainer().getLeft() || motionEvent.getX() > getLytContainer().getRight())) {
                            z11 = true;
                        }
                        if ((motionEvent2.getY() < getLytContainer().getTop() && motionEvent.getY() < getLytContainer().getTop()) || z11) {
                            m51791q();
                        }
                    }
                } else {
                    VelocityTracker velocityTracker2 = this.f50387I;
                    if (velocityTracker2 != null) {
                        AbstractC19074t.m100205c(velocityTracker2);
                        velocityTracker2.addMovement(motionEvent);
                        VelocityTracker velocityTracker3 = this.f50387I;
                        AbstractC19074t.m100205c(velocityTracker3);
                        velocityTracker3.computeCurrentVelocity(1000, this.f50381C);
                        VelocityTracker velocityTracker4 = this.f50387I;
                        AbstractC19074t.m100205c(velocityTracker4);
                        C24860q m134358c = AbstractC26108j.m134358c(velocityTracker4, this.f50380B, this.f50381C);
                        boolean booleanValue = ((Boolean) m134358c.m129213a()).booleanValue();
                        float floatValue = ((Number) m134358c.m129214b()).floatValue();
                        if (booleanValue) {
                            f11 = floatValue;
                        }
                        m51778i(f11);
                        this.f50387I = null;
                    }
                    this.f50389K = null;
                }
            } else {
                MotionEvent motionEvent3 = this.f50389K;
                if (motionEvent3 != null && getNestedScrollAxes() == 0 && this.f50387I == null && AbstractC26104f.m134333d(motionEvent3, motionEvent, this.f50379A)) {
                    VelocityTracker obtain = VelocityTracker.obtain();
                    this.f50387I = obtain;
                    AbstractC19074t.m100205c(obtain);
                    obtain.addMovement(motionEvent3);
                    this.f50389K = AbstractC26104f.m134330a(motionEvent);
                }
                MotionEvent motionEvent4 = this.f50389K;
                if (motionEvent4 != null && getNestedScrollAxes() == 0 && (velocityTracker = this.f50387I) != null) {
                    AbstractC19074t.m100205c(velocityTracker);
                    velocityTracker.addMovement(motionEvent);
                    float y11 = motionEvent.getY() - motionEvent4.getY();
                    if (y11 < 0.0f) {
                        if (this.f50403u != 0.0f) {
                            m51769C(this, 0.0f, 1, null);
                        }
                        if (this.f50382D) {
                            m51794z((int) Math.min(this.f50406x - y11, this.f50407y));
                        }
                    } else {
                        if (this.f50382D && this.f50408z != ((int) this.f50406x)) {
                            m51768A(this, 0, 1, null);
                        }
                        m51790B(Math.min(y11, getLytContainer().getMeasuredHeight()));
                    }
                }
            }
        } else {
            if (this.f50385G && motionEvent.getX() > getLytContainer().getLeft() && motionEvent.getX() < getLytContainer().getRight() && motionEvent.getY() > getLytContainer().getTop()) {
                z11 = true;
            }
            View vieThumb = getVieThumb();
            AbstractC19074t.m100207e(vieThumb, "<get-vieThumb>(...)");
            if (AbstractC26112n.m134380U(vieThumb) && getVieThumb().getLeft() <= motionEvent.getX() && getVieThumb().getRight() >= motionEvent.getX() && getVieThumb().getTop() <= motionEvent.getY() && getVieThumb().getBottom() >= motionEvent.getY()) {
                this.f50389K = AbstractC26104f.m134330a(motionEvent);
            } else if (this.f50383E && ((!this.f50385G && motionEvent.getY() >= getLytContainer().getTop()) || z11)) {
                this.f50389K = AbstractC26104f.m134330a(motionEvent);
            } else {
                this.f50389K = null;
            }
            this.f50387I = null;
        }
        return true;
    }

    /* renamed from: q */
    public final void m51791q() {
        float m116579b;
        float translationY = getLytContainer().getTranslationY();
        float measuredHeight = getLytContainer().getMeasuredHeight();
        m116579b = AbstractC22543l.m116579b((r0.getMeasuredHeight() - getLytContainer().getTranslationY()) * 4.0f, this.f50380B);
        m51782m(this, 0.0f, translationY, measuredHeight, m116579b, new C9485l(), new C9486m(), 1, null);
        View lytContainer = getLytContainer();
        AbstractC19074t.m100207e(lytContainer, "<get-lytContainer>(...)");
        AbstractC26112n.m134369J(lytContainer);
    }

    /* renamed from: s */
    public final void m51792s() {
        View btnClose = getBtnClose();
        AbstractC19074t.m100207e(btnClose, "<get-btnClose>(...)");
        AbstractC26112n.m134367H(btnClose);
        View vieThumb = getVieThumb();
        AbstractC19074t.m100207e(vieThumb, "<get-vieThumb>(...)");
        AbstractC26112n.m134367H(vieThumb);
    }

    public final void setContentSwipeable$zshort_release(boolean z11) {
        this.f50383E = z11;
    }

    public final void setDefaultHeightSpec$zshort_release(float f11) {
        this.f50404v = f11;
    }

    public final void setDismissByButton$zshort_release(boolean z11) {
        if (z11) {
            View lytContainer = getLytContainer();
            AbstractC19074t.m100207e(lytContainer, "<get-lytContainer>(...)");
            AbstractC26112n.m134419q0(lytContainer, 0);
            View btnClose = getBtnClose();
            AbstractC19074t.m100207e(btnClose, "<get-btnClose>(...)");
            AbstractC26112n.m134431w0(btnClose);
            View vieThumb = getVieThumb();
            AbstractC19074t.m100207e(vieThumb, "<get-vieThumb>(...)");
            AbstractC26112n.m134367H(vieThumb);
            return;
        }
        View lytContainer2 = getLytContainer();
        AbstractC19074t.m100207e(lytContainer2, "<get-lytContainer>(...)");
        AbstractC26112n.m134419q0(lytContainer2, this.f50401s);
        View btnClose2 = getBtnClose();
        AbstractC19074t.m100207e(btnClose2, "<get-btnClose>(...)");
        AbstractC26112n.m134367H(btnClose2);
        View vieThumb2 = getVieThumb();
        AbstractC19074t.m100207e(vieThumb2, "<get-vieThumb>(...)");
        AbstractC26112n.m134431w0(vieThumb2);
    }

    public final void setHiddenAction$zshort_release(InterfaceC18494a interfaceC18494a) {
        AbstractC19074t.m100208f(interfaceC18494a, "action");
        this.f50392N = interfaceC18494a;
    }

    public final void setIsLandscape$zshort_release(boolean z11) {
        this.f50385G = z11;
    }

    public final void setMaximumHeightSpec$zshort_release(float f11) {
        this.f50405w = f11;
    }

    public final void setReadyAction$zshort_release(InterfaceC18494a interfaceC18494a) {
        AbstractC19074t.m100208f(interfaceC18494a, "action");
        this.f50393O = interfaceC18494a;
    }

    public final void setStaticContentView$zshort_release(boolean z11) {
        this.f50384F = z11;
    }

    /* renamed from: u */
    public final void m51793u() {
        m51787w(this, this.f50403u, 0.0f, 0.0f, new C9488o(), new C9489p(), 6, null);
    }

    /* renamed from: z */
    public final void m51794z(int i11) {
        this.f50408z = Math.max(0, i11);
        requestLayout();
    }
}
