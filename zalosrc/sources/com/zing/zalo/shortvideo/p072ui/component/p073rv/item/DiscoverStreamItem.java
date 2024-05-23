package com.zing.zalo.shortvideo.p072ui.component.p073rv.item;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.zing.zalo.shortvideo.p072ui.widget.p074iv.RoundedImageView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.SimpleShadowTextView;
import fn0.AbstractC19074t;
import hn0.AbstractC20104d;
import mj0.AbstractC23322a;
import q10.C25038o;
import s20.AbstractC26105g;
import s20.AbstractC26112n;
import ui0.C27280g;
import v00.AbstractC27406a;
import v00.AbstractC27407b;

/* loaded from: classes5.dex */
public final class DiscoverStreamItem extends FrameLayout {

    /* renamed from: p */
    private float f50642p;

    /* renamed from: q */
    private final int f50643q;

    /* renamed from: r */
    private final int f50644r;

    /* renamed from: s */
    private final int f50645s;

    /* renamed from: t */
    public C25038o f50646t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiscoverStreamItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        this.f50642p = 0.9090909f;
        this.f50643q = AbstractC26112n.m134433y(this, AbstractC27407b.zch_padding_2);
        this.f50644r = AbstractC26112n.m134433y(this, AbstractC27407b.zch_padding_4);
        this.f50645s = AbstractC26112n.m134433y(this, AbstractC27407b.zch_padding_8);
    }

    public final C25038o getBinding() {
        C25038o c25038o = this.f50646t;
        if (c25038o != null) {
            return c25038o;
        }
        AbstractC19074t.m100223u("binding");
        return null;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        C25038o m129904a = C25038o.m129904a(this);
        AbstractC19074t.m100207e(m129904a, "bind(...)");
        SimpleShadowTextView simpleShadowTextView = m129904a.f120141u;
        AbstractC19074t.m100207e(simpleShadowTextView, "tvViewer");
        Context context = getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        AbstractC26112n.m134401h0(simpleShadowTextView, C27280g.m139659b(context, AbstractC23322a.zds_ic_user_solid_16, AbstractC27406a.zch_text_inverse_subtle));
        SimpleShadowTextView simpleShadowTextView2 = m129904a.f120139s;
        AbstractC19074t.m100207e(simpleShadowTextView2, "tvLive");
        AbstractC26112n.m134391c0(simpleShadowTextView2, AbstractC26112n.m134426u(this, AbstractC27406a.zch_red_r50), AbstractC26105g.m134347n(4));
        m129904a.f120137q.m55955j(AbstractC26105g.m134347n(4), RoundedImageView.EnumC10755b.f54377p);
        setBinding(m129904a);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int i15 = this.f50643q;
        C25038o binding = getBinding();
        RoundedImageView roundedImageView = binding.f120137q;
        AbstractC19074t.m100207e(roundedImageView, "ivCover");
        AbstractC26112n.m134383X(roundedImageView, 0, i15);
        int i16 = this.f50645s;
        SimpleShadowTextView simpleShadowTextView = binding.f120139s;
        AbstractC19074t.m100207e(simpleShadowTextView, "tvLive");
        AbstractC26112n.m134383X(simpleShadowTextView, i16, i15 + i16);
        SimpleShadowTextView simpleShadowTextView2 = binding.f120139s;
        AbstractC19074t.m100207e(simpleShadowTextView2, "tvLive");
        int m134424t = AbstractC26112n.m134424t(simpleShadowTextView2) - (binding.f120141u.getMeasuredHeight() / 2);
        int right = binding.f120139s.getRight() + this.f50645s;
        SimpleShadowTextView simpleShadowTextView3 = binding.f120141u;
        AbstractC19074t.m100207e(simpleShadowTextView3, "tvViewer");
        AbstractC26112n.m134383X(simpleShadowTextView3, m134424t, right);
        int i17 = this.f50643q + this.f50645s;
        int measuredHeight = getMeasuredHeight() - this.f50644r;
        SimpleShadowTextView simpleShadowTextView4 = binding.f120138r;
        AbstractC19074t.m100207e(simpleShadowTextView4, "tvChannelName");
        AbstractC26112n.m134381V(simpleShadowTextView4, measuredHeight, i17);
        int top = binding.f120138r.getTop();
        SimpleShadowTextView simpleShadowTextView5 = binding.f120140t;
        AbstractC19074t.m100207e(simpleShadowTextView5, "tvTitle");
        AbstractC26112n.m134381V(simpleShadowTextView5, top, i17);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        int m104529e;
        int size = View.MeasureSpec.getSize(i11);
        m104529e = AbstractC20104d.m104529e(((size - getPaddingLeft()) - getPaddingRight()) / this.f50642p);
        int i13 = size - (this.f50643q * 2);
        C25038o binding = getBinding();
        RoundedImageView roundedImageView = binding.f120137q;
        AbstractC19074t.m100207e(roundedImageView, "ivCover");
        AbstractC26112n.m134387a0(roundedImageView, i13, 1073741824, m104529e, 1073741824);
        SimpleShadowTextView simpleShadowTextView = binding.f120139s;
        AbstractC19074t.m100207e(simpleShadowTextView, "tvLive");
        AbstractC26112n.m134387a0(simpleShadowTextView, 0, 0, 0, 0);
        SimpleShadowTextView simpleShadowTextView2 = binding.f120141u;
        AbstractC19074t.m100207e(simpleShadowTextView2, "tvViewer");
        AbstractC26112n.m134387a0(simpleShadowTextView2, 0, 0, 0, 0);
        int i14 = i13 - (this.f50645s * 2);
        SimpleShadowTextView simpleShadowTextView3 = binding.f120140t;
        AbstractC19074t.m100207e(simpleShadowTextView3, "tvTitle");
        AbstractC26112n.m134387a0(simpleShadowTextView3, i14, Integer.MIN_VALUE, 0, 0);
        SimpleShadowTextView simpleShadowTextView4 = binding.f120138r;
        AbstractC19074t.m100207e(simpleShadowTextView4, "tvChannelName");
        AbstractC26112n.m134387a0(simpleShadowTextView4, i14, Integer.MIN_VALUE, 0, 0);
        setMeasuredDimension(size, m104529e);
    }

    public final void setBinding(C25038o c25038o) {
        AbstractC19074t.m100208f(c25038o, "<set-?>");
        this.f50646t = c25038o;
    }
}
