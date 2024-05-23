package com.zing.zalo.shortvideo.p072ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import s20.AbstractC26105g;
import s20.AbstractC26112n;
import v00.AbstractC27407b;
import v00.AbstractC27409d;

/* loaded from: classes5.dex */
public final class LivestreamChannelInfoLayout extends FrameLayout {

    /* renamed from: p */
    private final InterfaceC24854k f54086p;

    /* renamed from: q */
    private final InterfaceC24854k f54087q;

    /* renamed from: r */
    private final InterfaceC24854k f54088r;

    /* renamed from: s */
    private final InterfaceC24854k f54089s;

    /* renamed from: t */
    private final int f54090t;

    /* renamed from: u */
    private final int f54091u;

    /* renamed from: v */
    private final int f54092v;

    /* renamed from: w */
    private final int f54093w;

    /* renamed from: x */
    private final int f54094x;

    /* renamed from: y */
    private final int f54095y;

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.LivestreamChannelInfoLayout$a */
    /* loaded from: classes5.dex */
    static final class C10683a extends AbstractC19075u implements InterfaceC18494a {
        C10683a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final View mo12V4() {
            return LivestreamChannelInfoLayout.this.findViewById(AbstractC27409d.ivAvatar);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.LivestreamChannelInfoLayout$b */
    /* loaded from: classes5.dex */
    static final class C10684b extends AbstractC19075u implements InterfaceC18494a {
        C10684b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final View mo12V4() {
            return LivestreamChannelInfoLayout.this.findViewById(AbstractC27409d.btnFollowSuggest);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.LivestreamChannelInfoLayout$c */
    /* loaded from: classes5.dex */
    static final class C10685c extends AbstractC19075u implements InterfaceC18494a {
        C10685c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final View mo12V4() {
            return LivestreamChannelInfoLayout.this.findViewById(AbstractC27409d.lytStats);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.LivestreamChannelInfoLayout$d */
    /* loaded from: classes5.dex */
    static final class C10686d extends AbstractC19075u implements InterfaceC18494a {
        C10686d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final View mo12V4() {
            return LivestreamChannelInfoLayout.this.findViewById(AbstractC27409d.tvUserName);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LivestreamChannelInfoLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        InterfaceC24854k m129210a3;
        InterfaceC24854k m129210a4;
        AbstractC19074t.m100208f(context, "context");
        m129210a = AbstractC24856m.m129210a(new C10683a());
        this.f54086p = m129210a;
        m129210a2 = AbstractC24856m.m129210a(new C10686d());
        this.f54087q = m129210a2;
        m129210a3 = AbstractC24856m.m129210a(new C10685c());
        this.f54088r = m129210a3;
        m129210a4 = AbstractC24856m.m129210a(new C10684b());
        this.f54089s = m129210a4;
        this.f54090t = AbstractC26112n.m134433y(this, AbstractC27407b.zch_page_search_channel_avatar_size);
        this.f54091u = AbstractC26105g.m134347n(32);
        this.f54092v = AbstractC26105g.m134347n(32);
        this.f54093w = AbstractC26105g.m134347n(10);
        this.f54094x = AbstractC26105g.m134347n(24);
        this.f54095y = AbstractC26105g.m134347n(24);
    }

    private final View getAivAvatar() {
        Object value = this.f54086p.getValue();
        AbstractC19074t.m100207e(value, "getValue(...)");
        return (View) value;
    }

    private final View getBtnFollowSuggest() {
        Object value = this.f54089s.getValue();
        AbstractC19074t.m100207e(value, "getValue(...)");
        return (View) value;
    }

    private final View getLytStats() {
        Object value = this.f54088r.getValue();
        AbstractC19074t.m100207e(value, "getValue(...)");
        return (View) value;
    }

    private final View getTvUserName() {
        Object value = this.f54087q.getValue();
        AbstractC19074t.m100207e(value, "getValue(...)");
        return (View) value;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        AbstractC26112n.m134383X(getAivAvatar(), this.f54091u, (getMeasuredWidth() - getAivAvatar().getMeasuredWidth()) / 2);
        AbstractC26112n.m134383X(getTvUserName(), getAivAvatar().getBottom() + this.f54093w, (getMeasuredWidth() - getTvUserName().getMeasuredWidth()) / 2);
        AbstractC26112n.m134383X(getLytStats(), getTvUserName().getBottom() + this.f54094x, 0);
        AbstractC26112n.m134383X(getBtnFollowSuggest(), getLytStats().getBottom() + this.f54095y, 0);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        int size = View.MeasureSpec.getSize(i11);
        View aivAvatar = getAivAvatar();
        int i13 = this.f54090t;
        AbstractC26112n.m134387a0(aivAvatar, i13, 1073741824, i13, 1073741824);
        AbstractC26112n.m134387a0(getTvUserName(), size - (this.f54091u * 2), 1073741824, 0, 0);
        AbstractC26112n.m134387a0(getLytStats(), size - (this.f54091u * 2), 1073741824, this.f54090t, 1073741824);
        AbstractC26112n.m134387a0(getBtnFollowSuggest(), size - (this.f54091u * 2), 1073741824, 0, 0);
        setMeasuredDimension(size - (this.f54091u * 2), this.f54092v + getAivAvatar().getMeasuredHeight() + this.f54093w + getTvUserName().getMeasuredHeight() + this.f54094x + getLytStats().getMeasuredHeight() + this.f54095y + getBtnFollowSuggest().getMeasuredHeight() + this.f54092v);
    }
}
