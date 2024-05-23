package com.zing.zalo.qrwallet.widget;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import bi0.AbstractC2808b;
import com.zing.zalo.qrwallet.widget.QRWalletSkeletonView;
import com.zing.zalo.uicontrol.C16658t0;
import com.zing.zalo.uicontrol.C16662u0;
import com.zing.zalo.uicontrol.C16666v0;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.ModulesView;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ln0.AbstractC22543l;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import me0.C23212s8;
import zl0.AbstractC32232i;

/* loaded from: classes4.dex */
public final class QRWalletSkeletonView extends LinearLayout {

    /* renamed from: A */
    private final int f49176A;

    /* renamed from: B */
    private int[] f49177B;

    /* renamed from: C */
    private RectF f49178C;

    /* renamed from: D */
    private Matrix f49179D;

    /* renamed from: E */
    private C16658t0 f49180E;

    /* renamed from: F */
    private C16658t0.b f49181F;

    /* renamed from: p */
    private ModulesView f49182p;

    /* renamed from: q */
    private List f49183q;

    /* renamed from: r */
    private final int f49184r;

    /* renamed from: s */
    private final int f49185s;

    /* renamed from: t */
    private final int f49186t;

    /* renamed from: u */
    private final int f49187u;

    /* renamed from: v */
    private final int f49188v;

    /* renamed from: w */
    private final int f49189w;

    /* renamed from: x */
    private final int f49190x;

    /* renamed from: y */
    private final int f49191y;

    /* renamed from: z */
    private final int f49192z;

    /* renamed from: com.zing.zalo.qrwallet.widget.QRWalletSkeletonView$a */
    /* loaded from: classes4.dex */
    public static final class ViewTreeObserverOnPreDrawListenerC9273a implements ViewTreeObserver.OnPreDrawListener {
        ViewTreeObserverOnPreDrawListenerC9273a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            int m116584g;
            QRWalletSkeletonView.this.getViewTreeObserver().removeOnPreDrawListener(this);
            QRWalletSkeletonView qRWalletSkeletonView = QRWalletSkeletonView.this;
            qRWalletSkeletonView.getLocationOnScreen(qRWalletSkeletonView.f49177B);
            int i11 = QRWalletSkeletonView.this.f49177B[1];
            int m118713h0 = AbstractC23136l9.m118713h0();
            if (m118713h0 <= 0) {
                return false;
            }
            for (C16666v0 c16666v0 : QRWalletSkeletonView.this.f49183q) {
                int m88806g1 = c16666v0.m88806g1();
                m116584g = AbstractC22543l.m116584g(255, ((int) (255 * (1 - (((c16666v0.m89098H() + i11) * 1.0f) / m118713h0)))) + 100);
                if (m116584g < 0) {
                    m116584g = 0;
                }
                c16666v0.m88811l1(Color.argb(m116584g, Color.red(m88806g1), Color.green(m88806g1), Color.blue(m88806g1)));
            }
            return false;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public QRWalletSkeletonView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC19074t.m100208f(context, "context");
    }

    /* renamed from: d */
    private final void m49652d(C16666v0 c16666v0) {
        Context context;
        int i11;
        c16666v0.m88807h1(AbstractC23222t7.f112556e);
        if (C23212s8.m119603k()) {
            context = c16666v0.getContext();
            i11 = AbstractC2808b.ng20;
        } else {
            context = c16666v0.getContext();
            i11 = AbstractC2808b.ng80;
        }
        c16666v0.m88811l1(AbstractC23136l9.m118641B(context, i11));
        this.f49183q.add(c16666v0);
        this.f49182p.mo69681L(c16666v0);
    }

    /* renamed from: e */
    private final void m49653e() {
        Context context;
        int i11;
        C16658t0 c16658t0 = this.f49180E;
        if (C23212s8.m119603k()) {
            context = getContext();
            i11 = AbstractC2808b.ng10;
        } else {
            context = getContext();
            i11 = AbstractC2808b.ng70;
        }
        c16658t0.m88781g(AbstractC23136l9.m118641B(context, i11));
        Rect rect = new Rect();
        rect.set(0, 0, AbstractC23136l9.m118722k0(), AbstractC23136l9.m118713h0());
        c16658t0.m88778d(rect);
        c16658t0.m88782h(this.f49181F);
    }

    /* renamed from: f */
    private final void m49654f() {
        addView(this.f49182p, new LinearLayout.LayoutParams(-1, -2));
        this.f49182p.mo44090O();
    }

    /* renamed from: g */
    private final void m49655g() {
        int i11 = this.f49186t + this.f49184r;
        C16666v0 c16666v0 = new C16666v0(getContext());
        c16666v0.m89106L().m89060k0(this.f49190x).m89030N(this.f49191y).m89073z(Boolean.TRUE).m89032P(this.f49186t, i11, 0, 0);
        m49652d(c16666v0);
        int i12 = i11 + this.f49191y;
        int i13 = 0;
        while (i13 < 2) {
            int i14 = this.f49185s * i13;
            int i15 = this.f49187u;
            int i16 = i13 + 1;
            int i17 = i14 + (i15 * i16) + i12;
            if (i13 != 1) {
                i15 = 0;
            }
            C16666v0 c16666v02 = new C16666v0(getContext());
            C16718f m89073z = c16666v02.m89106L().m89060k0(this.f49189w).m89030N(this.f49189w).m89073z(Boolean.TRUE);
            int i18 = this.f49186t;
            m89073z.m89032P(i18, i17, i18, i15);
            m49652d(c16666v02);
            int i19 = i17 + this.f49188v;
            C16666v0 c16666v03 = new C16666v0(getContext());
            c16666v03.m89106L().m89060k0(this.f49192z).m89030N(this.f49176A).m89054h0(c16666v02).m89032P(0, i19, 0, 0);
            m49652d(c16666v03);
            i13 = i16;
        }
    }

    /* renamed from: h */
    private final void m49656h() {
        getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC9273a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public static final void m49657i(QRWalletSkeletonView qRWalletSkeletonView, C16658t0 c16658t0, RectF rectF) {
        AbstractC19074t.m100208f(qRWalletSkeletonView, "this$0");
        qRWalletSkeletonView.getLocationOnScreen(qRWalletSkeletonView.f49177B);
        qRWalletSkeletonView.f49178C.setEmpty();
        qRWalletSkeletonView.f49179D.reset();
        Matrix matrix = qRWalletSkeletonView.f49179D;
        int[] iArr = qRWalletSkeletonView.f49177B;
        matrix.setTranslate(-iArr[0], -iArr[1]);
        qRWalletSkeletonView.f49179D.mapRect(qRWalletSkeletonView.f49178C, rectF);
        Iterator it = qRWalletSkeletonView.f49183q.iterator();
        while (it.hasNext()) {
            ((C16666v0) it.next()).m88810k1(qRWalletSkeletonView.f49178C, qRWalletSkeletonView.f49180E.m88776b());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f49180E.mo88784j();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f49180E.m88785k();
    }

    @Override // android.view.View
    public void setVisibility(int i11) {
        super.setVisibility(i11);
        if (i11 != 0) {
            this.f49180E.m88785k();
        } else {
            this.f49180E.mo88784j();
        }
    }

    public /* synthetic */ QRWalletSkeletonView(Context context, AttributeSet attributeSet, int i11, int i12, AbstractC19060k abstractC19060k) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QRWalletSkeletonView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
        this.f49182p = new ModulesView(context);
        this.f49183q = new ArrayList();
        this.f49184r = AbstractC32232i.m155453a(48.0f);
        this.f49185s = AbstractC32232i.m155453a(40.0f);
        this.f49186t = AbstractC32232i.m155453a(16.0f);
        this.f49187u = AbstractC32232i.m155453a(24.0f);
        this.f49188v = AbstractC32232i.m155453a(12.0f);
        this.f49189w = AbstractC32232i.m155453a(40.0f);
        this.f49190x = AbstractC32232i.m155453a(259.0f);
        this.f49191y = AbstractC32232i.m155453a(18.0f);
        this.f49192z = AbstractC32232i.m155453a(140.0f);
        this.f49176A = AbstractC32232i.m155453a(16.0f);
        this.f49177B = new int[2];
        this.f49178C = new RectF();
        this.f49179D = new Matrix();
        this.f49180E = new C16662u0(context);
        this.f49181F = new C16658t0.b() { // from class: yy.a
            @Override // com.zing.zalo.uicontrol.C16658t0.b
            /* renamed from: a */
            public final void mo44637a(C16658t0 c16658t0, RectF rectF) {
                QRWalletSkeletonView.m49657i(QRWalletSkeletonView.this, c16658t0, rectF);
            }
        };
        setOrientation(1);
        m49654f();
        m49655g();
        m49653e();
        this.f49180E.mo88784j();
        m49656h();
    }
}
