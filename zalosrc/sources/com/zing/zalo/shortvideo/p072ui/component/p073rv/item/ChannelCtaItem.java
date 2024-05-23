package com.zing.zalo.shortvideo.p072ui.component.p073rv.item;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.shortvideo.data.model.CtaItem;
import fn0.AbstractC19074t;
import p354n3.C23528a;
import q10.C25023k;
import s20.AbstractC26112n;
import v00.AbstractC27407b;
import v00.AbstractC27408c;

/* loaded from: classes5.dex */
public final class ChannelCtaItem extends FrameLayout {

    /* renamed from: p */
    private C25023k f50548p;

    /* renamed from: q */
    private final int f50549q;

    /* renamed from: r */
    private final int f50550r;

    /* renamed from: s */
    private final int f50551s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelCtaItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        this.f50549q = AbstractC26112n.m134433y(this, AbstractC27407b.zch_layout_channel_size_cta_icon);
        this.f50550r = AbstractC26112n.m134433y(this, AbstractC27407b.zch_layout_channel_cta_height);
        this.f50551s = AbstractC26112n.m134433y(this, AbstractC27407b.zch_layout_channel_padding_cta_item);
    }

    /* renamed from: a */
    public final void m52048a(CtaItem ctaItem, View.OnClickListener onClickListener) {
        AbstractC19074t.m100208f(ctaItem, "item");
        AbstractC19074t.m100208f(onClickListener, "onClickListener");
        C25023k c25023k = this.f50548p;
        if (c25023k != null) {
            c25023k.f120017r.setText(ctaItem.m50909c());
            C23528a c23528a = (C23528a) new C23528a(getContext()).m123612r(c25023k.f120016q);
            c23528a.m123599d();
            c25023k.getRoot().setBackgroundResource(AbstractC27408c.zch_bg_cta_channel);
            ChannelCtaItem root = c25023k.getRoot();
            AbstractC19074t.m100207e(root, "getRoot(...)");
            AbstractC26112n.m134405j0(root, onClickListener);
        }
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f50548p = C25023k.m129863a(this);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        C25023k c25023k = this.f50548p;
        if (c25023k != null) {
            RecyclingImageView recyclingImageView = c25023k.f120016q;
            AbstractC19074t.m100207e(recyclingImageView, "ivIcon");
            AbstractC26112n.m134383X(recyclingImageView, (getMeasuredHeight() - this.f50549q) / 2, this.f50551s);
            RobotoTextView robotoTextView = c25023k.f120017r;
            AbstractC19074t.m100207e(robotoTextView, "tvCta");
            AbstractC26112n.m134383X(robotoTextView, 0, c25023k.f120016q.getRight() + this.f50551s);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        C25023k c25023k = this.f50548p;
        if (c25023k != null) {
            RecyclingImageView recyclingImageView = c25023k.f120016q;
            AbstractC19074t.m100207e(recyclingImageView, "ivIcon");
            int i13 = this.f50549q;
            AbstractC26112n.m134387a0(recyclingImageView, i13, 1073741824, i13, 1073741824);
            RobotoTextView robotoTextView = c25023k.f120017r;
            AbstractC19074t.m100207e(robotoTextView, "tvCta");
            AbstractC26112n.m134387a0(robotoTextView, 0, 0, this.f50550r, 1073741824);
            setMeasuredDimension(this.f50549q + c25023k.f120017r.getMeasuredWidth() + (this.f50551s * 3), this.f50550r);
        }
    }
}
