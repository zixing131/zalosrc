package com.zing.zalo.shortvideo.p072ui.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.EllipsizedTextView;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import mj0.AbstractC23322a;
import o20.C23989b;
import p10.EnumC24601e;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import s20.AbstractC26105g;
import s20.AbstractC26112n;
import ui0.C27280g;
import v00.AbstractC27406a;
import v00.AbstractC27407b;
import v00.AbstractC27409d;
import v00.AbstractC27413h;

/* loaded from: classes5.dex */
public final class ChannelLivestreamInfoLayout extends FrameLayout {

    /* renamed from: A */
    private final InterfaceC24854k f53960A;

    /* renamed from: B */
    private final Paint f53961B;

    /* renamed from: C */
    private final InterfaceC24854k f53962C;

    /* renamed from: p */
    private final int f53963p;

    /* renamed from: q */
    private final InterfaceC24854k f53964q;

    /* renamed from: r */
    private final InterfaceC24854k f53965r;

    /* renamed from: s */
    private final InterfaceC24854k f53966s;

    /* renamed from: t */
    private final InterfaceC24854k f53967t;

    /* renamed from: u */
    private final int f53968u;

    /* renamed from: v */
    private final int f53969v;

    /* renamed from: w */
    private final int f53970w;

    /* renamed from: x */
    private final int f53971x;

    /* renamed from: y */
    private float f53972y;

    /* renamed from: z */
    private EnumC24601e f53973z;

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.ChannelLivestreamInfoLayout$a */
    /* loaded from: classes5.dex */
    public static final class C10649a extends ViewOutlineProvider {
        C10649a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            AbstractC19074t.m100208f(view, "view");
            AbstractC19074t.m100208f(outline, "outline");
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), ChannelLivestreamInfoLayout.this.f53972y);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.ChannelLivestreamInfoLayout$b */
    /* loaded from: classes5.dex */
    public /* synthetic */ class C10650b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f53975a;

        static {
            int[] iArr = new int[EnumC24601e.values().length];
            try {
                iArr[EnumC24601e.f118373r.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC24601e.f118377v.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC24601e.f118375t.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f53975a = iArr;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.ChannelLivestreamInfoLayout$c */
    /* loaded from: classes5.dex */
    static final class C10651c extends AbstractC19075u implements InterfaceC18494a {
        C10651c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final RectF mo12V4() {
            float m134347n = AbstractC26105g.m134347n(1) / 2;
            return new RectF(m134347n, m134347n, ChannelLivestreamInfoLayout.this.getWidth() - m134347n, ChannelLivestreamInfoLayout.this.getHeight() - m134347n);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.ChannelLivestreamInfoLayout$d */
    /* loaded from: classes5.dex */
    static final class C10652d extends AbstractC19075u implements InterfaceC18494a {
        C10652d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final View mo12V4() {
            return ChannelLivestreamInfoLayout.this.findViewById(AbstractC27409d.ivArrowRight);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.ChannelLivestreamInfoLayout$e */
    /* loaded from: classes5.dex */
    static final class C10653e extends AbstractC19075u implements InterfaceC18494a {
        C10653e() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ImageView mo12V4() {
            return (ImageView) ChannelLivestreamInfoLayout.this.findViewById(AbstractC27409d.ivChannelLive);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.ChannelLivestreamInfoLayout$f */
    /* loaded from: classes5.dex */
    static final class C10654f extends AbstractC19075u implements InterfaceC18494a {
        C10654f() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m55649a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m55649a() {
            ChannelLivestreamInfoLayout.this.invalidate();
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.ChannelLivestreamInfoLayout$g */
    /* loaded from: classes5.dex */
    static final class C10655g extends AbstractC19075u implements InterfaceC18494a {
        C10655g() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C23989b mo12V4() {
            return new C23989b(AbstractC26112n.m134426u(ChannelLivestreamInfoLayout.this, AbstractC27406a.zhg_bg_streaming), 30);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.ChannelLivestreamInfoLayout$h */
    /* loaded from: classes5.dex */
    static final class C10656h extends AbstractC19075u implements InterfaceC18494a {
        C10656h() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EllipsizedTextView mo12V4() {
            return (EllipsizedTextView) ChannelLivestreamInfoLayout.this.findViewById(AbstractC27409d.tvStateLive);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.ChannelLivestreamInfoLayout$i */
    /* loaded from: classes5.dex */
    static final class C10657i extends AbstractC19075u implements InterfaceC18494a {
        C10657i() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EllipsizedTextView mo12V4() {
            return (EllipsizedTextView) ChannelLivestreamInfoLayout.this.findViewById(AbstractC27409d.tvTitle);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelLivestreamInfoLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        InterfaceC24854k m129210a3;
        InterfaceC24854k m129210a4;
        InterfaceC24854k m129210a5;
        InterfaceC24854k m129210a6;
        AbstractC19074t.m100208f(context, "context");
        this.f53963p = 3;
        m129210a = AbstractC24856m.m129210a(new C10653e());
        this.f53964q = m129210a;
        m129210a2 = AbstractC24856m.m129210a(new C10656h());
        this.f53965r = m129210a2;
        m129210a3 = AbstractC24856m.m129210a(new C10657i());
        this.f53966s = m129210a3;
        m129210a4 = AbstractC24856m.m129210a(new C10652d());
        this.f53967t = m129210a4;
        this.f53968u = AbstractC26112n.m134433y(this, AbstractC27407b.zch_layout_channel_info_ic_live_size);
        this.f53969v = AbstractC26112n.m134433y(this, AbstractC27407b.zch_padding_12);
        this.f53970w = AbstractC26112n.m134433y(this, AbstractC27407b.zch_padding_8);
        this.f53971x = AbstractC26105g.m134347n(2);
        this.f53972y = AbstractC26105g.m134347n(6);
        m129210a5 = AbstractC24856m.m129210a(new C10655g());
        this.f53960A = m129210a5;
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(AbstractC26112n.m134426u(this, AbstractC27406a.zch_divider));
        paint.setStrokeWidth(AbstractC26105g.m134347n(1));
        paint.setStrokeCap(Paint.Cap.ROUND);
        this.f53961B = paint;
        m129210a6 = AbstractC24856m.m129210a(new C10651c());
        this.f53962C = m129210a6;
        setClipToOutline(true);
        setOutlineProvider(new C10649a());
    }

    private final RectF getBgRect() {
        return (RectF) this.f53962C.getValue();
    }

    private final View getIvArrowRight() {
        Object value = this.f53967t.getValue();
        AbstractC19074t.m100207e(value, "getValue(...)");
        return (View) value;
    }

    private final ImageView getIvLive() {
        Object value = this.f53964q.getValue();
        AbstractC19074t.m100207e(value, "getValue(...)");
        return (ImageView) value;
    }

    private final C23989b getRender() {
        return (C23989b) this.f53960A.getValue();
    }

    private final EllipsizedTextView getTvStateLive() {
        Object value = this.f53965r.getValue();
        AbstractC19074t.m100207e(value, "getValue(...)");
        return (EllipsizedTextView) value;
    }

    private final EllipsizedTextView getTvTitle() {
        Object value = this.f53966s.getValue();
        AbstractC19074t.m100207e(value, "getValue(...)");
        return (EllipsizedTextView) value;
    }

    /* renamed from: b */
    public final void m55644b() {
        getRender().m125515e();
    }

    /* renamed from: c */
    public final void m55645c(EnumC24601e enumC24601e, String str, Long l11) {
        String m55826b;
        AbstractC19074t.m100208f(enumC24601e, "status");
        if (l11 != null && str != null) {
            this.f53973z = enumC24601e;
            int i11 = C10650b.f53975a[enumC24601e.ordinal()];
            if (i11 != 1 && i11 != 2) {
                if (i11 != 3) {
                    getRender().m125515e();
                    AbstractC26112n.m134367H(this);
                    return;
                }
                AbstractC26112n.m134431w0(this);
                getRender().m125515e();
                if (System.currentTimeMillis() < l11.longValue()) {
                    getIvLive().setImageResource(AbstractC23322a.zch_ic_calendar_line_16);
                    EllipsizedTextView tvStateLive = getTvStateLive();
                    Context context = getContext();
                    int i12 = AbstractC27413h.zch_item_livestream_start_at;
                    m55826b = AbstractC10723c.m55826b(l11.longValue(), "hh:mm, dd/MM");
                    tvStateLive.setText(context.getString(i12, m55826b));
                    getTvStateLive().setTextColor(AbstractC26112n.m134426u(this, AbstractC27406a.zch_text_primary));
                    getTvTitle().setText(str);
                    getTvTitle().setTextColor(AbstractC26112n.m134426u(this, AbstractC27406a.zch_text_primary_a60));
                } else {
                    ImageView ivLive = getIvLive();
                    Context context2 = getContext();
                    AbstractC19074t.m100207e(context2, "getContext(...)");
                    ivLive.setImageDrawable(C27280g.m139659b(context2, AbstractC23322a.zch_ic_live_solid_16, AbstractC27406a.zch_icon_accent_red));
                    getTvStateLive().setText(getContext().getString(AbstractC27413h.zch_item_livestream_is_open));
                    getTvStateLive().setTextColor(AbstractC26112n.m134426u(this, AbstractC27406a.zch_icon_accent_red));
                    getTvTitle().setText(str);
                    getTvTitle().setTextColor(AbstractC26112n.m134426u(this, AbstractC27406a.zch_text_primary));
                }
                getTvTitle().setText(str);
                return;
            }
            AbstractC26112n.m134431w0(this);
            ImageView ivLive2 = getIvLive();
            Context context3 = getContext();
            AbstractC19074t.m100207e(context3, "getContext(...)");
            ivLive2.setImageDrawable(C27280g.m139659b(context3, AbstractC23322a.zch_ic_live_solid_16, AbstractC27406a.zch_icon_accent_red));
            getTvStateLive().setText(getContext().getString(AbstractC27413h.zch_session_live_is_streaming));
            getTvStateLive().setTextColor(AbstractC26112n.m134426u(this, AbstractC27406a.zch_text_accent_red));
            getTvTitle().setText(str);
            getTvTitle().setTextColor(AbstractC26112n.m134426u(this, AbstractC27406a.zch_text_primary));
            getRender().m125514d();
            setBackgroundColor(AbstractC26112n.m134426u(this, AbstractC27406a.zhg_bg_streaming));
            return;
        }
        this.f53973z = EnumC24601e.f118372q;
        AbstractC26112n.m134367H(this);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        AbstractC19074t.m100208f(canvas, "canvas");
        if (this.f53973z == EnumC24601e.f118373r) {
            getRender().m125512b(canvas);
        } else {
            RectF bgRect = getBgRect();
            float f11 = this.f53972y;
            canvas.drawRoundRect(bgRect, f11, f11, this.f53961B);
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        getRender().m125513c(new C10654f());
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int measuredHeight = getMeasuredHeight() / 2;
        if (AbstractC26112n.m134378S(getIvArrowRight())) {
            AbstractC26112n.m134384Y(getIvArrowRight(), measuredHeight - (getIvArrowRight().getMeasuredHeight() / 2), getWidth() - this.f53969v);
        }
        EllipsizedTextView tvStateLive = getTvStateLive();
        int i15 = this.f53969v;
        AbstractC26112n.m134383X(tvStateLive, i15, getIvLive().getMeasuredWidth() + i15 + this.f53970w);
        AbstractC26112n.m134383X(getIvLive(), getTvStateLive().getTop(), this.f53969v);
        AbstractC26112n.m134383X(getTvTitle(), getTvStateLive().getBottom() + this.f53971x, getTvStateLive().getLeft());
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        int size = View.MeasureSpec.getSize(i11);
        if (AbstractC26112n.m134378S(getIvLive())) {
            ImageView ivLive = getIvLive();
            int i13 = this.f53968u;
            AbstractC26112n.m134387a0(ivLive, i13, 1073741824, i13, 1073741824);
        }
        if (AbstractC26112n.m134378S(getIvArrowRight())) {
            View ivArrowRight = getIvArrowRight();
            int i14 = this.f53968u;
            AbstractC26112n.m134387a0(ivArrowRight, i14, 1073741824, i14, 1073741824);
        }
        int measuredWidth = (((size - (this.f53969v * 2)) - getIvLive().getMeasuredWidth()) - (this.f53970w * 2)) - getIvArrowRight().getMeasuredWidth();
        AbstractC26112n.m134387a0(getTvStateLive(), measuredWidth, 1073741824, 0, 0);
        AbstractC26112n.m134387a0(getTvTitle(), measuredWidth, 1073741824, 0, 0);
        int measuredHeight = getTvStateLive().getMeasuredHeight() + getTvTitle().getMeasuredHeight() + (this.f53969v * 2) + this.f53971x;
        getRender().m125511a(size / 2, measuredHeight, this.f53963p);
        setMeasuredDimension(size, measuredHeight);
    }
}
