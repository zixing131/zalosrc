package com.zing.zalo.shortvideo.p072ui.widget.p074iv;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.p077ui.widget.C13718q1;
import com.zing.zalo.shortvideo.data.model.Channel;
import com.zing.zalo.shortvideo.data.model.User;
import en0.InterfaceC18505l;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import mj0.AbstractC23322a;
import on0.AbstractC24341v;
import p354n3.C23528a;
import pm0.C24848g0;
import pm0.C24860q;
import q20.C25082e;
import s20.AbstractC26100b;
import s20.AbstractC26112n;
import v00.AbstractC27406a;
import v00.AbstractC27408c;
import v00.AbstractC27414i;

/* loaded from: classes5.dex */
public final class AvatarImageView extends FrameLayout {

    /* renamed from: p */
    private float f54332p;

    /* renamed from: q */
    private final Paint f54333q;

    /* renamed from: r */
    private GradientDrawable f54334r;

    /* renamed from: s */
    private Paint f54335s;

    /* renamed from: t */
    private final C23528a f54336t;

    /* renamed from: u */
    private final RecyclingImageView f54337u;

    /* renamed from: v */
    private final TextView f54338v;

    /* renamed from: w */
    private final ImageView f54339w;

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.iv.AvatarImageView$a */
    /* loaded from: classes5.dex */
    static final class C10749a extends AbstractC19075u implements InterfaceC18505l {
        C10749a() {
            super(1);
        }

        /* renamed from: a */
        public final void m55930a(TypedArray typedArray) {
            AbstractC19074t.m100208f(typedArray, "$this$obtain");
            AvatarImageView avatarImageView = AvatarImageView.this;
            avatarImageView.f54332p = typedArray.getDimension(AbstractC27414i.ZchAvatarImageView_zchCornerRadius, avatarImageView.f54332p);
            Paint paint = AvatarImageView.this.f54333q;
            paint.setColor(typedArray.getColor(AbstractC27414i.ZchAvatarImageView_zchStrokeColor, -1));
            paint.setStrokeWidth(typedArray.getDimension(AbstractC27414i.ZchAvatarImageView_zchStrokeWidth, 0.0f));
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m55930a((TypedArray) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.iv.AvatarImageView$b */
    /* loaded from: classes5.dex */
    public static final class C10750b extends ViewOutlineProvider {
        C10750b() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            AbstractC19074t.m100208f(view, "view");
            AbstractC19074t.m100208f(outline, "outline");
            float cornerRadius = AvatarImageView.this.getCornerRadius();
            Drawable background = AvatarImageView.this.f54339w.getBackground();
            AbstractC19074t.m100206d(background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
            ((GradientDrawable) background).setCornerRadii(new float[]{cornerRadius, cornerRadius, 0.0f, 0.0f, cornerRadius, cornerRadius, 0.0f, 0.0f});
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), cornerRadius);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AvatarImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        this.f54332p = Float.MAX_VALUE;
        Paint paint = new Paint();
        paint.setFlags(1);
        paint.setStyle(Paint.Style.STROKE);
        this.f54333q = paint;
        this.f54336t = new C23528a(context);
        int[] iArr = AbstractC27414i.ZchAvatarImageView;
        AbstractC19074t.m100207e(iArr, "ZchAvatarImageView");
        AbstractC26100b.m134297c(attributeSet, context, iArr, new C10749a());
        RecyclingImageView recyclingImageView = new RecyclingImageView(context);
        recyclingImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.f54337u = recyclingImageView;
        addView(recyclingImageView);
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        appCompatTextView.setTypeface(AbstractC26112n.m134364E(appCompatTextView, 9));
        appCompatTextView.setGravity(17);
        this.f54338v = appCompatTextView;
        appCompatTextView.setTextColor(-1);
        appCompatTextView.setLetterSpacing(0.05f);
        appCompatTextView.setIncludeFontPadding(false);
        addView(appCompatTextView);
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(AbstractC23322a.zch_ic_logo_channel_solid_16);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(-1);
        imageView.setBackground(gradientDrawable);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        this.f54339w = imageView;
        AbstractC26112n.m134367H(imageView);
        addView(imageView);
        setClipToOutline(true);
        setOutlineProvider(new C10750b());
        setWillNotDraw(false);
    }

    /* renamed from: e */
    private final float m55922e(float f11, float f12) {
        return (getWidth() / 32.0f) * f11 * f12;
    }

    /* renamed from: f */
    static /* synthetic */ float m55923f(AvatarImageView avatarImageView, float f11, float f12, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            f12 = 0.75f;
        }
        return avatarImageView.m55922e(f11, f12);
    }

    /* renamed from: g */
    private final Drawable m55924g(String str) {
        C24860q m130011a = C25082e.f120481a.m130011a(str);
        return new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{((Number) m130011a.m129215c()).intValue(), ((Number) m130011a.m129216d()).intValue()});
    }

    /* renamed from: h */
    private final String m55925h(String str) {
        return C25082e.f120481a.m130012b(str);
    }

    /* renamed from: k */
    public static /* synthetic */ void m55926k(AvatarImageView avatarImageView, String str, int i11, boolean z11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            z11 = true;
        }
        avatarImageView.m55928i(str, i11, z11);
    }

    /* renamed from: l */
    public static /* synthetic */ void m55927l(AvatarImageView avatarImageView, String str, String str2, String str3, int i11, boolean z11, int i12, Object obj) {
        int i13;
        boolean z12;
        if ((i12 & 8) != 0) {
            i13 = 0;
        } else {
            i13 = i11;
        }
        if ((i12 & 16) != 0) {
            z12 = true;
        } else {
            z12 = z11;
        }
        avatarImageView.m55929j(str, str2, str3, i13, z12);
    }

    public final float getCornerRadius() {
        float width;
        float f11 = this.f54332p;
        if (f11 <= 0.0f) {
            return 0.0f;
        }
        if (f11 <= 1.0f) {
            width = f11 * getWidth();
        } else {
            if (f11 <= getWidth() / 2.0f) {
                return this.f54332p;
            }
            width = getWidth();
        }
        return width / 2.0f;
    }

    /* renamed from: i */
    public final void m55928i(String str, int i11, boolean z11) {
        m55929j(null, null, str, i11, z11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0012, code lost:            if (r15 != false) goto L9;     */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m55929j(String str, String str2, String str3, int i11, boolean z11) {
        Drawable drawable;
        boolean m127128x;
        boolean m127124t;
        if (z11) {
            if (str3 != null) {
                m127128x = AbstractC24341v.m127128x(str3);
                if (!m127128x) {
                    m127124t = AbstractC24341v.m127124t(str3, "default", true);
                }
            }
            this.f54338v.setBackground(m55924g(str));
            this.f54338v.setText(m55925h(str2));
            AbstractC26112n.m134431w0(this.f54338v);
            AbstractC26112n.m134367H(this.f54337u);
            return;
        }
        C23528a c23528a = (C23528a) this.f54336t.m123612r(this.f54337u);
        c23528a.m123599d();
        if (i11 != 0) {
            drawable = AbstractC26112n.m134434z(this, i11);
        } else {
            drawable = null;
        }
        AbstractC26112n.m134431w0(this.f54337u);
        AbstractC26112n.m134367H(this.f54338v);
    }

    @Override // android.view.View
    public void onDrawForeground(Canvas canvas) {
        AbstractC19074t.m100208f(canvas, "canvas");
        if (getWidth() > 0 && getHeight() > 0) {
            GradientDrawable gradientDrawable = this.f54334r;
            if (gradientDrawable != null) {
                int m134426u = AbstractC26112n.m134426u(this, AbstractC27406a.zch_red_r50);
                gradientDrawable.setStroke((int) m55923f(this, 1.0f, 0.0f, 2, null), m134426u);
                gradientDrawable.setColor(0);
                gradientDrawable.setCornerRadius(getCornerRadius() - (r4 / 2));
                gradientDrawable.setBounds(0, 0, getWidth(), getHeight());
                gradientDrawable.draw(canvas);
                int m55923f = (int) m55923f(this, 20.0f, 0.0f, 2, null);
                int m55923f2 = (int) m55923f(this, 9.0f, 0.0f, 2, null);
                float m55923f3 = m55923f(this, 2.0f, 0.0f, 2, null);
                gradientDrawable.setStroke(0, 0);
                gradientDrawable.setColor(m134426u);
                gradientDrawable.setCornerRadii(new float[]{m55923f3, m55923f3, m55923f3, m55923f3, 0.0f, 0.0f, 0.0f, 0.0f});
                gradientDrawable.setBounds((getWidth() - m55923f) / 2, getHeight() - m55923f2, (getWidth() + m55923f) / 2, getHeight());
                gradientDrawable.draw(canvas);
                Paint paint = this.f54335s;
                AbstractC19074t.m100205c(paint);
                paint.setTextSize(m55923f(this, 7.0f, 0.0f, 2, null));
                canvas.drawText("LIVE", getWidth() / 2.0f, getHeight() - ((m55923f2 + (paint.getFontMetrics().ascent * 0.75f)) / 2.0f), paint);
                return;
            }
            if (this.f54333q.getStrokeWidth() > 0.0f) {
                float strokeWidth = this.f54333q.getStrokeWidth() / 2.0f;
                float cornerRadius = getCornerRadius() - strokeWidth;
                canvas.drawRoundRect(strokeWidth, strokeWidth, getWidth() - strokeWidth, getHeight() - strokeWidth, cornerRadius, cornerRadius, this.f54333q);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        if (AbstractC26112n.m134378S(this.f54337u)) {
            AbstractC26112n.m134383X(this.f54337u, 0, 0);
        }
        if (AbstractC26112n.m134378S(this.f54338v)) {
            AbstractC26112n.m134383X(this.f54338v, 0, 0);
        }
        if (AbstractC26112n.m134378S(this.f54339w)) {
            int measuredWidth = getMeasuredWidth();
            AbstractC26112n.m134382W(this.f54339w, getMeasuredHeight(), measuredWidth);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        int size = View.MeasureSpec.getSize(i11);
        int size2 = View.MeasureSpec.getSize(i12);
        if (AbstractC26112n.m134378S(this.f54337u)) {
            AbstractC26112n.m134387a0(this.f54337u, size, 1073741824, size2, 1073741824);
        }
        if (AbstractC26112n.m134378S(this.f54338v)) {
            AbstractC26112n.m134387a0(this.f54338v, size, 1073741824, size2, 1073741824);
        }
        if (AbstractC26112n.m134378S(this.f54339w)) {
            int i13 = (size * 3) / 8;
            AbstractC26112n.m134387a0(this.f54339w, i13, 1073741824, i13, 1073741824);
            int i14 = i13 / 12;
            this.f54339w.setPadding(i14, i14, i14, i14);
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i11, int i12, int i13, int i14) {
        this.f54338v.setTextSize(0, i11 * 0.45f);
    }

    public final void setAvatar(User user) {
        AbstractC19074t.m100208f(user, "user");
        m55927l(this, user.m51234g(), user.m51235h(), user.m51230c(), AbstractC27408c.zch_placeholder_avatar_user, false, 16, null);
        setChannelIconVisible(false);
    }

    public final void setChannelIconVisible(boolean z11) {
        if (z11) {
            AbstractC26112n.m134431w0(this.f54339w);
        } else {
            AbstractC26112n.m134367H(this.f54339w);
        }
    }

    public final void setChannelLiveStatus(boolean z11) {
        if (z11) {
            this.f54334r = new GradientDrawable();
            Paint paint = new Paint();
            paint.setFlags(1);
            paint.setColor(AbstractC26112n.m134426u(this, AbstractC27406a.zch_text_primary));
            Context context = getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            paint.setTypeface(C13718q1.m76693b(context));
            paint.setTextAlign(Paint.Align.CENTER);
            this.f54335s = paint;
        } else {
            this.f54334r = null;
            this.f54335s = null;
        }
        invalidate();
    }

    public final void setCornerRadius(float f11) {
        this.f54332p = f11;
        invalidateOutline();
    }

    public final void setAvatar(Channel channel) {
        AbstractC19074t.m100208f(channel, "channel");
        m55927l(this, channel.m50769l(), channel.m50775o(), channel.m50754c(), AbstractC27408c.zch_placeholder_avatar_channel, false, 16, null);
    }
}
