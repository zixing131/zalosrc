package com.zing.zalo.p077ui.zviews;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import bi0.AbstractC2807a;
import com.zing.zalo.uicontrol.C16658t0;
import com.zing.zalo.uicontrol.C16666v0;
import com.zing.zalo.uidrawing.ModulesView;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.List;
import me0.AbstractC23136l9;
import me0.C23212s8;

/* loaded from: classes6.dex */
public class MiniAppZinstantSkeleton extends LinearLayout {

    /* renamed from: p */
    private C16658t0 f75158p;

    /* renamed from: q */
    private int[] f75159q;

    /* renamed from: r */
    private RectF f75160r;

    /* renamed from: s */
    private Matrix f75161s;

    /* renamed from: t */
    private C16658t0.b f75162t;

    /* renamed from: u */
    private ModulesView f75163u;

    /* renamed from: v */
    private List f75164v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MiniAppZinstantSkeleton(Context context) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        this.f75159q = new int[2];
        this.f75160r = new RectF();
        this.f75161s = new Matrix();
        this.f75162t = new C16658t0.b() { // from class: com.zing.zalo.ui.zviews.yx
            public /* synthetic */ C16392yx() {
            }

            @Override // com.zing.zalo.uicontrol.C16658t0.b
            /* renamed from: a */
            public final void mo44637a(C16658t0 c16658t0, RectF rectF) {
                MiniAppZinstantSkeleton.m81785e(MiniAppZinstantSkeleton.this, c16658t0, rectF);
            }
        };
        this.f75163u = new ModulesView(getContext());
        this.f75164v = new ArrayList();
        m81784d();
    }

    /* renamed from: d */
    private final void m81784d() {
        setOrientation(1);
        setGravity(1);
        setPadding(AbstractC23136l9.m118742r(16.0f), 0, AbstractC23136l9.m118742r(16.0f), AbstractC23136l9.m118742r(8.0f));
        addView(this.f75163u, new LinearLayout.LayoutParams(-1, -2));
        this.f75163u.setClickable(false);
        mo81275b();
        this.f75158p = new C16658t0(getContext());
        Rect rect = new Rect();
        rect.set(0, 0, AbstractC23136l9.m118722k0(), AbstractC23136l9.m118713h0());
        C16658t0 c16658t0 = this.f75158p;
        AbstractC19074t.m100205c(c16658t0);
        c16658t0.m88778d(rect);
        C16658t0 c16658t02 = this.f75158p;
        AbstractC19074t.m100205c(c16658t02);
        c16658t02.m88782h(this.f75162t);
        C16658t0 c16658t03 = this.f75158p;
        AbstractC19074t.m100205c(c16658t03);
        c16658t03.m88779e(100);
        m81786f();
    }

    /* renamed from: e */
    public static final void m81785e(MiniAppZinstantSkeleton miniAppZinstantSkeleton, C16658t0 c16658t0, RectF rectF) {
        AbstractC19074t.m100208f(miniAppZinstantSkeleton, "this$0");
        try {
            miniAppZinstantSkeleton.getLocationOnScreen(miniAppZinstantSkeleton.f75159q);
            miniAppZinstantSkeleton.f75160r.setEmpty();
            miniAppZinstantSkeleton.f75161s.reset();
            Matrix matrix = miniAppZinstantSkeleton.f75161s;
            int[] iArr = miniAppZinstantSkeleton.f75159q;
            matrix.setTranslate(-iArr[0], -iArr[1]);
            miniAppZinstantSkeleton.f75161s.mapRect(miniAppZinstantSkeleton.f75160r, rectF);
            for (C16666v0 c16666v0 : miniAppZinstantSkeleton.f75164v) {
                RectF rectF2 = miniAppZinstantSkeleton.f75160r;
                C16658t0 c16658t02 = miniAppZinstantSkeleton.f75158p;
                AbstractC19074t.m100205c(c16658t02);
                c16666v0.m88810k1(rectF2, c16658t02.m88776b());
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: f */
    private final void m81786f() {
        C16658t0 c16658t0 = this.f75158p;
        if (c16658t0 != null) {
            c16658t0.mo88784j();
        }
    }

    /* renamed from: g */
    private final void m81787g() {
        C16658t0 c16658t0 = this.f75158p;
        if (c16658t0 != null) {
            c16658t0.m88785k();
        }
    }

    /* renamed from: b */
    public void mo81275b() {
    }

    /* renamed from: c */
    public final void m81788c(C16666v0 c16666v0) {
        int i11;
        AbstractC19074t.m100208f(c16666v0, "component");
        c16666v0.m88807h1(AbstractC23136l9.m118742r(4.0f));
        Context context = getContext();
        if (C23212s8.m119603k()) {
            i11 = AbstractC2807a.page_background_03;
        } else {
            i11 = AbstractC2807a.ui_background_disabled;
        }
        c16666v0.m88811l1(C23212s8.m119607o(context, i11));
        this.f75164v.add(c16666v0);
        this.f75163u.mo69681L(c16666v0);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        m81786f();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m81787g();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MiniAppZinstantSkeleton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        this.f75159q = new int[2];
        this.f75160r = new RectF();
        this.f75161s = new Matrix();
        this.f75162t = new C16658t0.b() { // from class: com.zing.zalo.ui.zviews.yx
            public /* synthetic */ C16392yx() {
            }

            @Override // com.zing.zalo.uicontrol.C16658t0.b
            /* renamed from: a */
            public final void mo44637a(C16658t0 c16658t0, RectF rectF) {
                MiniAppZinstantSkeleton.m81785e(MiniAppZinstantSkeleton.this, c16658t0, rectF);
            }
        };
        this.f75163u = new ModulesView(getContext());
        this.f75164v = new ArrayList();
        m81784d();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MiniAppZinstantSkeleton(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
        this.f75159q = new int[2];
        this.f75160r = new RectF();
        this.f75161s = new Matrix();
        this.f75162t = new C16658t0.b() { // from class: com.zing.zalo.ui.zviews.yx
            public /* synthetic */ C16392yx() {
            }

            @Override // com.zing.zalo.uicontrol.C16658t0.b
            /* renamed from: a */
            public final void mo44637a(C16658t0 c16658t0, RectF rectF) {
                MiniAppZinstantSkeleton.m81785e(MiniAppZinstantSkeleton.this, c16658t0, rectF);
            }
        };
        this.f75163u = new ModulesView(getContext());
        this.f75164v = new ArrayList();
        m81784d();
    }
}
