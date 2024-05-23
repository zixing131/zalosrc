package com.zing.zalo.shortvideo.p072ui.widget;

import android.content.Context;
import android.graphics.Outline;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import com.zing.zalo.shortvideo.data.model.InAppNotification;
import com.zing.zalo.shortvideo.p072ui.widget.p074iv.AvatarImageView;
import com.zing.zalo.shortvideo.p072ui.widget.p074iv.PulseImageView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.EllipsizedTextView;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import ln0.AbstractC22543l;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import s20.AbstractC26105g;
import s20.AbstractC26112n;
import v00.AbstractC27407b;
import v00.AbstractC27408c;
import v00.AbstractC27409d;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* loaded from: classes5.dex */
public final class ZchInAppNotificationView extends FrameLayout {

    /* renamed from: p */
    private final int f54206p;

    /* renamed from: q */
    private final int f54207q;

    /* renamed from: r */
    private final int f54208r;

    /* renamed from: s */
    private final int f54209s;

    /* renamed from: t */
    private final int f54210t;

    /* renamed from: u */
    private final int f54211u;

    /* renamed from: v */
    private final int f54212v;

    /* renamed from: w */
    private final InterfaceC24854k f54213w;

    /* renamed from: x */
    private final InterfaceC24854k f54214x;

    /* renamed from: y */
    private final InterfaceC24854k f54215y;

    /* renamed from: z */
    private final InterfaceC24854k f54216z;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: com.zing.zalo.shortvideo.ui.widget.ZchInAppNotificationView$a */
    /* loaded from: classes5.dex */
    public static final class EnumC10715a {

        /* renamed from: q */
        public static final EnumC10715a f54217q = new EnumC10715a("CHANNEL", 0, 1);

        /* renamed from: r */
        public static final EnumC10715a f54218r = new EnumC10715a("USER", 1, 2);

        /* renamed from: s */
        public static final EnumC10715a f54219s = new EnumC10715a("IAB", 2, 3);

        /* renamed from: t */
        private static final /* synthetic */ EnumC10715a[] f54220t;

        /* renamed from: u */
        private static final /* synthetic */ InterfaceC30165a f54221u;

        /* renamed from: p */
        private final int f54222p;

        static {
            EnumC10715a[] m55819b = m55819b();
            f54220t = m55819b;
            f54221u = AbstractC30166b.m148796a(m55819b);
        }

        private EnumC10715a(String str, int i11, int i12) {
            this.f54222p = i12;
        }

        /* renamed from: b */
        private static final /* synthetic */ EnumC10715a[] m55819b() {
            return new EnumC10715a[]{f54217q, f54218r, f54219s};
        }

        public static EnumC10715a valueOf(String str) {
            return (EnumC10715a) Enum.valueOf(EnumC10715a.class, str);
        }

        public static EnumC10715a[] values() {
            return (EnumC10715a[]) f54220t.clone();
        }

        /* renamed from: c */
        public final int m55820c() {
            return this.f54222p;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.ZchInAppNotificationView$b */
    /* loaded from: classes5.dex */
    static final class C10716b extends AbstractC19075u implements InterfaceC18494a {
        C10716b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AvatarImageView mo12V4() {
            return (AvatarImageView) ZchInAppNotificationView.this.findViewById(AbstractC27409d.ivAvatar);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.ZchInAppNotificationView$c */
    /* loaded from: classes5.dex */
    static final class C10717c extends AbstractC19075u implements InterfaceC18494a {
        C10717c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PulseImageView mo12V4() {
            return (PulseImageView) ZchInAppNotificationView.this.findViewById(AbstractC27409d.ivRing);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.ZchInAppNotificationView$d */
    /* loaded from: classes5.dex */
    public static final class C10718d extends ViewOutlineProvider {

        /* renamed from: a */
        final /* synthetic */ int f54225a;

        /* renamed from: b */
        final /* synthetic */ ZchInAppNotificationView f54226b;

        C10718d(int i11, ZchInAppNotificationView zchInAppNotificationView) {
            this.f54225a = i11;
            this.f54226b = zchInAppNotificationView;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            AbstractC19074t.m100208f(view, "view");
            AbstractC19074t.m100208f(outline, "outline");
            int i11 = this.f54225a;
            outline.setRoundRect(i11, i11, view.getWidth() - this.f54225a, view.getHeight() - this.f54225a, this.f54226b.f54212v);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.ZchInAppNotificationView$e */
    /* loaded from: classes5.dex */
    static final class C10719e extends AbstractC19075u implements InterfaceC18494a {
        C10719e() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EllipsizedTextView mo12V4() {
            return (EllipsizedTextView) ZchInAppNotificationView.this.findViewById(AbstractC27409d.tvDes);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.ZchInAppNotificationView$f */
    /* loaded from: classes5.dex */
    static final class C10720f extends AbstractC19075u implements InterfaceC18494a {
        C10720f() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EllipsizedTextView mo12V4() {
            return (EllipsizedTextView) ZchInAppNotificationView.this.findViewById(AbstractC27409d.tvTitle);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZchInAppNotificationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        InterfaceC24854k m129210a3;
        InterfaceC24854k m129210a4;
        AbstractC19074t.m100208f(context, "context");
        this.f54206p = AbstractC26112n.m134433y(this, AbstractC27407b.zch_padding_16);
        this.f54207q = AbstractC26112n.m134433y(this, AbstractC27407b.zch_padding_12);
        this.f54208r = AbstractC26112n.m134433y(this, AbstractC27407b.zch_padding_4);
        this.f54209s = AbstractC26112n.m134433y(this, AbstractC27407b.zch_in_app_noti_avatar_size);
        this.f54210t = AbstractC26112n.m134433y(this, AbstractC27407b.zch_in_app_noti_iv_ring_size);
        this.f54211u = AbstractC26112n.m134433y(this, AbstractC27407b.zch_radius_4dp);
        this.f54212v = AbstractC26112n.m134433y(this, AbstractC27407b.zch_radius_8dp);
        m129210a = AbstractC24856m.m129210a(new C10716b());
        this.f54213w = m129210a;
        m129210a2 = AbstractC24856m.m129210a(new C10717c());
        this.f54214x = m129210a2;
        m129210a3 = AbstractC24856m.m129210a(new C10720f());
        this.f54215y = m129210a3;
        m129210a4 = AbstractC24856m.m129210a(new C10719e());
        this.f54216z = m129210a4;
    }

    private final AvatarImageView getIvAvatar() {
        Object value = this.f54213w.getValue();
        AbstractC19074t.m100207e(value, "getValue(...)");
        return (AvatarImageView) value;
    }

    private final PulseImageView getIvRing() {
        Object value = this.f54214x.getValue();
        AbstractC19074t.m100207e(value, "getValue(...)");
        return (PulseImageView) value;
    }

    private final EllipsizedTextView getTvDes() {
        Object value = this.f54216z.getValue();
        AbstractC19074t.m100207e(value, "getValue(...)");
        return (EllipsizedTextView) value;
    }

    private final EllipsizedTextView getTvTitle() {
        Object value = this.f54215y.getValue();
        AbstractC19074t.m100207e(value, "getValue(...)");
        return (EllipsizedTextView) value;
    }

    /* renamed from: b */
    public final void m55818b(InAppNotification inAppNotification) {
        AbstractC19074t.m100208f(inAppNotification, "data");
        getIvAvatar().setChannelIconVisible(false);
        getTvTitle().setText(inAppNotification.m50972f());
        AbstractC26112n.m134395e0(getTvDes(), inAppNotification.m50967a());
        if (inAppNotification.m50970d() == 2) {
            getIvAvatar().setCornerRadius(Float.MAX_VALUE);
            AvatarImageView.m55926k(getIvAvatar(), inAppNotification.m50968b(), AbstractC27408c.zch_placeholder_avatar_user, false, 4, null);
        } else {
            getIvAvatar().setCornerRadius(this.f54211u);
            AvatarImageView.m55926k(getIvAvatar(), inAppNotification.m50968b(), AbstractC27408c.zch_placeholder_avatar_channel, false, 4, null);
        }
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        int i11 = this.f54208r;
        setClipToOutline(true);
        setOutlineProvider(new C10718d(i11, this));
        setClipToOutline(true);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int i15 = this.f54206p;
        AbstractC26112n.m134383X(getIvAvatar(), AbstractC26112n.m134424t(this) - (getIvAvatar().getMeasuredHeight() / 2), i15);
        int right = getIvAvatar().getRight() + this.f54207q;
        AbstractC26112n.m134383X(getTvTitle(), AbstractC26112n.m134424t(this) - (((getTvTitle().getMeasuredHeight() + getTvDes().getMeasuredHeight()) + this.f54208r) / 2), right);
        AbstractC26112n.m134383X(getTvDes(), getTvTitle().getBottom() + this.f54208r, right);
        AbstractC26112n.m134382W(getIvRing(), getIvAvatar().getBottom() + AbstractC26105g.m134347n(5), getIvAvatar().getRight() + AbstractC26105g.m134347n(5));
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        int m116580c;
        int size = View.MeasureSpec.getSize(i11);
        int i13 = this.f54206p * 2;
        AvatarImageView ivAvatar = getIvAvatar();
        int i14 = this.f54209s;
        AbstractC26112n.m134387a0(ivAvatar, i14, 1073741824, i14, 1073741824);
        AbstractC26112n.m134387a0(getTvTitle(), 0, 0, 0, 0);
        AbstractC26112n.m134387a0(getTvDes(), 0, 0, 0, 0);
        PulseImageView ivRing = getIvRing();
        int i15 = this.f54210t;
        AbstractC26112n.m134387a0(ivRing, i15, 1073741824, i15, 1073741824);
        m116580c = AbstractC22543l.m116580c(getIvAvatar().getMeasuredHeight(), getTvTitle().getMeasuredHeight() + getTvDes().getMeasuredHeight() + this.f54208r);
        setMeasuredDimension(size, i13 + m116580c);
    }
}
