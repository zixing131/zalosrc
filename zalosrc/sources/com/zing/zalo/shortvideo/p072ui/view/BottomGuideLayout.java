package com.zing.zalo.shortvideo.p072ui.view;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import c20.C3226p;
import com.zing.zalo.shortvideo.p072ui.view.BottomGuideLayout;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import mj0.AbstractC23322a;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import s20.AbstractC26112n;
import ui0.C27280g;
import v00.AbstractC27406a;
import v00.AbstractC27407b;
import v00.AbstractC27409d;

/* loaded from: classes5.dex */
public final class BottomGuideLayout extends LinearLayout {

    /* renamed from: p */
    private final InterfaceC24854k f52571p;

    /* renamed from: q */
    private final InterfaceC24854k f52572q;

    /* renamed from: r */
    private final int f52573r;

    /* renamed from: s */
    private final int f52574s;

    /* renamed from: t */
    private final Interpolator f52575t;

    /* renamed from: u */
    private long f52576u;

    /* renamed from: com.zing.zalo.shortvideo.ui.view.BottomGuideLayout$a */
    /* loaded from: classes5.dex */
    static final class C10131a extends AbstractC19075u implements InterfaceC18494a {
        C10131a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ImageView mo12V4() {
            return (ImageView) BottomGuideLayout.this.findViewById(AbstractC27409d.icoGuideBottom);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.BottomGuideLayout$b */
    /* loaded from: classes5.dex */
    static final class C10132b extends AbstractC19075u implements InterfaceC18494a {
        C10132b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TextView mo12V4() {
            return (TextView) BottomGuideLayout.this.findViewById(AbstractC27409d.txtGuideBottom);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomGuideLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        AbstractC19074t.m100208f(context, "context");
        m129210a = AbstractC24856m.m129210a(new C10131a());
        this.f52571p = m129210a;
        m129210a2 = AbstractC24856m.m129210a(new C10132b());
        this.f52572q = m129210a2;
        this.f52573r = AbstractC26112n.m134433y(this, AbstractC27407b.zch_page_video_footer_height);
        this.f52574s = AbstractC26112n.m134433y(this, AbstractC27407b.zch_page_video_bottom_guide_adjust);
        this.f52575t = new Interpolator() { // from class: m20.f
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f11) {
                float m53964b;
                m53964b = BottomGuideLayout.m53964b(f11);
                return m53964b;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static final float m53964b(float f11) {
        return (float) Math.min((Math.sin(((f11 * 6.283185307179586d) / 1000) + 2.827433388230814d) * 1.5d) + 0.5d, 1.0d);
    }

    private final ImageView getIcoGuide() {
        Object value = this.f52571p.getValue();
        AbstractC19074t.m100207e(value, "getValue(...)");
        return (ImageView) value;
    }

    private final TextView getTxtGuide() {
        Object value = this.f52572q.getValue();
        AbstractC19074t.m100207e(value, "getValue(...)");
        return (TextView) value;
    }

    /* renamed from: c */
    public final void m53965c() {
        this.f52576u = System.currentTimeMillis();
        AbstractC26112n.m134431w0(getIcoGuide());
        AbstractC26112n.m134431w0(getTxtGuide());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        AbstractC19074t.m100208f(canvas, "canvas");
        super.dispatchDraw(canvas);
        if (this.f52576u == 0) {
            return;
        }
        float interpolation = this.f52575t.getInterpolation((float) (System.currentTimeMillis() - this.f52576u));
        float f11 = this.f52574s * interpolation;
        float f12 = (interpolation * 0.25f) + 0.75f;
        View[] viewArr = {getIcoGuide(), getTxtGuide()};
        for (int i11 = 0; i11 < 2; i11++) {
            View view = viewArr[i11];
            view.setTranslationY(-f11);
            view.setAlpha(f12);
        }
        invalidate();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        ImageView icoGuide = getIcoGuide();
        Context context = getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        icoGuide.setImageDrawable(C27280g.m139659b(context, AbstractC23322a.zds_ic_chevron_double_up_line_24, AbstractC27406a.zch_icon_primary));
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        int i13;
        if (C3226p.Companion.m16362e()) {
            i13 = this.f52573r;
        } else {
            i13 = 0;
        }
        AbstractC26112n.m134411m0(this, i13);
        super.onMeasure(i11, i12);
    }
}
