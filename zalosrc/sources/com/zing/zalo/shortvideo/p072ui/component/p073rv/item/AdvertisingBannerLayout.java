package com.zing.zalo.shortvideo.p072ui.component.p073rv.item;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import c20.C3226p;
import com.zing.zalo.shortvideo.p072ui.widget.p074iv.RoundedImageView;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import ln0.AbstractC22543l;
import mj0.AbstractC23322a;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import q20.C25085h;
import s20.AbstractC26112n;
import v00.AbstractC27406a;
import v00.AbstractC27407b;
import v00.AbstractC27409d;

/* loaded from: classes5.dex */
public final class AdvertisingBannerLayout extends FrameLayout {

    /* renamed from: p */
    private final int f50514p;

    /* renamed from: q */
    private final int f50515q;

    /* renamed from: r */
    private final int f50516r;

    /* renamed from: s */
    private final DecelerateInterpolator f50517s;

    /* renamed from: t */
    private long f50518t;

    /* renamed from: u */
    private long f50519u;

    /* renamed from: v */
    private final InterfaceC24854k f50520v;

    /* renamed from: w */
    private final InterfaceC24854k f50521w;

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.AdvertisingBannerLayout$a */
    /* loaded from: classes5.dex */
    static final class C9545a extends AbstractC19075u implements InterfaceC18494a {
        C9545a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ImageView mo12V4() {
            return (ImageView) AdvertisingBannerLayout.this.findViewById(AbstractC27409d.btnCloseBanner);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.AdvertisingBannerLayout$b */
    /* loaded from: classes5.dex */
    static final class C9546b extends AbstractC19075u implements InterfaceC18494a {
        C9546b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final RoundedImageView mo12V4() {
            return (RoundedImageView) AdvertisingBannerLayout.this.findViewById(AbstractC27409d.rivAdvertisingBanner);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvertisingBannerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        AbstractC19074t.m100208f(context, "context");
        this.f50514p = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_video_advertising_sponsored_margin);
        this.f50515q = AbstractC26112n.m134433y(this, AbstractC27407b.zch_radius_4dp);
        this.f50516r = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_video_advertising_banner_close_size);
        this.f50517s = new DecelerateInterpolator();
        this.f50519u = 500L;
        m129210a = AbstractC24856m.m129210a(new C9546b());
        this.f50520v = m129210a;
        m129210a2 = AbstractC24856m.m129210a(new C9545a());
        this.f50521w = m129210a2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static final void m52010b(AdvertisingBannerLayout advertisingBannerLayout) {
        AbstractC19074t.m100208f(advertisingBannerLayout, "this$0");
        advertisingBannerLayout.requestLayout();
    }

    private final ImageView getBtnClose() {
        Object value = this.f50521w.getValue();
        AbstractC19074t.m100207e(value, "getValue(...)");
        return (ImageView) value;
    }

    private final RoundedImageView getRivBanner() {
        Object value = this.f50520v.getValue();
        AbstractC19074t.m100207e(value, "getValue(...)");
        return (RoundedImageView) value;
    }

    /* renamed from: c */
    public final void m52011c() {
        this.f50518t = System.currentTimeMillis();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        getRivBanner().m55955j(this.f50515q, RoundedImageView.EnumC10755b.f54377p);
        getBtnClose().setImageDrawable(C25085h.m130020g(C25085h.f120485a, AbstractC27406a.zch_black_a30, AbstractC27407b.zch_radius_2dp, 0, 0, AbstractC23322a.zds_ic_close_line_16, AbstractC27406a.zch_icon_primary, AbstractC27407b.zch_item_video_advertising_banner_close_inset, 12, null));
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int i15 = this.f50514p;
        AbstractC26112n.m134383X(getRivBanner(), i15, 0);
        AbstractC26112n.m134384Y(getBtnClose(), i15, getRivBanner().getMeasuredWidth());
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        float m116587j;
        int size = View.MeasureSpec.getSize(i11);
        int i13 = this.f50514p;
        if (C3226p.Companion.m16364g()) {
            int i14 = size / 2;
            AbstractC26112n.m134387a0(getRivBanner(), i14, 1073741824, (i14 / 16) * 9, 1073741824);
        } else {
            AbstractC26112n.m134387a0(getRivBanner(), size, 1073741824, (size / 16) * 9, 1073741824);
        }
        int measuredHeight = i13 + getRivBanner().getMeasuredHeight();
        ImageView btnClose = getBtnClose();
        int i15 = this.f50516r;
        AbstractC26112n.m134387a0(btnClose, i15, 1073741824, i15, 1073741824);
        if (this.f50518t > 0) {
            float currentTimeMillis = ((float) (System.currentTimeMillis() - this.f50518t)) / ((float) this.f50519u);
            DecelerateInterpolator decelerateInterpolator = this.f50517s;
            m116587j = AbstractC22543l.m116587j(currentTimeMillis, 0.0f, 1.0f);
            float interpolation = decelerateInterpolator.getInterpolation(m116587j);
            if (interpolation < 1.0f) {
                measuredHeight = (int) (measuredHeight * interpolation);
                post(new Runnable() { // from class: com.zing.zalo.shortvideo.ui.component.rv.item.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        AdvertisingBannerLayout.m52010b(AdvertisingBannerLayout.this);
                    }
                });
            } else {
                this.f50518t = 0L;
            }
        }
        setMeasuredDimension(size, measuredHeight);
    }
}
