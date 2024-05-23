package com.zing.zalo.zdesign.component;

import ac.C0708i;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import bi0.AbstractC2814h;
import bi0.AbstractC2815i;
import ci0.C3532a;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.p077ui.widget.C13694n1;
import com.zing.zalo.p077ui.widget.C13699o1;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import fn0.AbstractC19074t;
import java.lang.ref.WeakReference;
import pm0.C24860q;
import ri0.C25808b;
import ti0.C26703b;
import ti0.C26705d;
import ui0.C27276c;

/* loaded from: classes7.dex */
public final class Badge extends LinearLayout implements InterfaceC16976f1 {

    /* renamed from: p */
    private C25808b f86187p;

    /* renamed from: q */
    private C3532a f86188q;

    /* renamed from: r */
    private String f86189r;

    /* renamed from: s */
    private C0708i f86190s;

    /* renamed from: t */
    private boolean f86191t;

    /* renamed from: com.zing.zalo.zdesign.component.Badge$a */
    /* loaded from: classes7.dex */
    public static final class C16909a implements C3532a.a {
        C16909a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Badge(Context context) {
        this(context, null);
        AbstractC19074t.m100208f(context, "context");
    }

    /* renamed from: a */
    private final void m90487a() {
        C24860q c24860q;
        C3532a c3532a = this.f86188q;
        Drawable drawable = null;
        if (c3532a != null) {
            Context context = getContext();
            AbstractC19074t.m100207e(context, "context");
            c24860q = c3532a.m17896a(context);
        } else {
            c24860q = null;
        }
        if (c24860q != null) {
            drawable = (Drawable) c24860q.m129215c();
        }
        setBackground(drawable);
    }

    /* renamed from: b */
    private final void m90488b() {
        C16974f m17898c;
        float m139649b;
        Typeface m76486a;
        setOrientation(0);
        removeAllViews();
        m90487a();
        C3532a c3532a = this.f86188q;
        if (c3532a != null && (m17898c = c3532a.m17898c()) != null) {
            Context context = getContext();
            AbstractC19074t.m100207e(context, "context");
            RobotoTextView robotoTextView = new RobotoTextView(context);
            robotoTextView.mo75850g(true);
            Context context2 = robotoTextView.getContext();
            AbstractC19074t.m100207e(context2, "context");
            C26703b m137293a = C26705d.m137293a(context2, AbstractC2814h.t_xxxxsmall_m);
            Float m137292s = m137293a.m137292s();
            if (m137292s != null) {
                m139649b = m137292s.floatValue();
            } else {
                Context context3 = robotoTextView.getContext();
                AbstractC19074t.m100207e(context3, "context");
                m139649b = C27276c.m139649b(context3, 10);
            }
            robotoTextView.setTextSize(0, m139649b);
            C13694n1 m137282i = m137293a.m137282i();
            if (m137282i == null) {
                m76486a = Typeface.DEFAULT_BOLD;
            } else {
                C13699o1 c13699o1 = C13699o1.f70798a;
                Context context4 = robotoTextView.getContext();
                AbstractC19074t.m100207e(context4, "context");
                m76486a = c13699o1.m76486a(context4, m137282i.m76440b(), Integer.valueOf(m137282i.m76446h()));
            }
            robotoTextView.setTypeface(m76486a);
            robotoTextView.setSingleLine(true);
            robotoTextView.setMaxLines(1);
            robotoTextView.setText(m17898c.m90957g());
            robotoTextView.setTextColor(m17898c.m90958h());
            if (m17898c.m90954d() != null) {
                m90489c(m17898c, robotoTextView);
            } else {
                m90490d(m17898c, robotoTextView);
            }
        }
    }

    /* renamed from: c */
    private final void m90489c(C16974f c16974f, RobotoTextView robotoTextView) {
        if (c16974f.m90954d() == null) {
            return;
        }
        RecyclingImageView recyclingImageView = new RecyclingImageView(getContext());
        Context context = getContext();
        AbstractC19074t.m100207e(context, "context");
        int m139649b = C27276c.m139649b(context, c16974f.m90956f().m90985c());
        Context context2 = getContext();
        AbstractC19074t.m100207e(context2, "context");
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(m139649b, C27276c.m139649b(context2, c16974f.m90956f().m90985c()));
        if (c16974f.m90955e() != 0) {
            Drawable m90954d = c16974f.m90954d();
            AbstractC19074t.m100205c(m90954d);
            m90954d.setTint(c16974f.m90955e());
        }
        recyclingImageView.setImageDrawable(c16974f.m90954d());
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        Context context3 = getContext();
        AbstractC19074t.m100207e(context3, "context");
        setPadding(0, 0, 0, C27276c.m139649b(context3, 1));
        if (c16974f.m90957g().length() > 0) {
            setGravity(16);
            if (!c16974f.m90964n()) {
                Context context4 = getContext();
                AbstractC19074t.m100207e(context4, "context");
                int m139649b2 = C27276c.m139649b(context4, 2);
                Context context5 = getContext();
                AbstractC19074t.m100207e(context5, "context");
                layoutParams2.setMargins(m139649b2, 0, C27276c.m139649b(context5, 6), 0);
                robotoTextView.setLayoutParams(layoutParams2);
                recyclingImageView.setLayoutParams(layoutParams);
                addView(recyclingImageView);
                addView(robotoTextView);
                return;
            }
            Context context6 = getContext();
            AbstractC19074t.m100207e(context6, "context");
            int m139649b3 = C27276c.m139649b(context6, 2);
            Context context7 = getContext();
            AbstractC19074t.m100207e(context7, "context");
            layoutParams.setMargins(m139649b3, 0, C27276c.m139649b(context7, 2), 0);
            Context context8 = getContext();
            AbstractC19074t.m100207e(context8, "context");
            int m139649b4 = C27276c.m139649b(context8, 0);
            Context context9 = getContext();
            AbstractC19074t.m100207e(context9, "context");
            layoutParams2.setMargins(m139649b4, 0, C27276c.m139649b(context9, 8), 0);
            robotoTextView.setLayoutParams(layoutParams2);
            recyclingImageView.setLayoutParams(layoutParams);
            addView(recyclingImageView);
            addView(robotoTextView);
            return;
        }
        if (c16974f.m90961k() == EnumC16991i.SYSTEM_STATUS_WARNING || c16974f.m90961k() == EnumC16991i.SYSTEM_STATUS_DANGER) {
            Context context10 = getContext();
            AbstractC19074t.m100207e(context10, "context");
            layoutParams.topMargin = C27276c.m139649b(context10, 1);
        }
        recyclingImageView.setLayoutParams(layoutParams);
        addView(recyclingImageView);
        setGravity(17);
    }

    /* renamed from: d */
    private final void m90490d(C16974f c16974f, RobotoTextView robotoTextView) {
        if (c16974f.m90957g().length() > 0) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            Context context = getContext();
            AbstractC19074t.m100207e(context, "context");
            setPadding(0, 0, 0, C27276c.m139649b(context, 1));
            if (c16974f.m90957g().length() > 1) {
                if (!c16974f.m90964n()) {
                    Context context2 = getContext();
                    AbstractC19074t.m100207e(context2, "context");
                    int m139649b = C27276c.m139649b(context2, 6);
                    Context context3 = getContext();
                    AbstractC19074t.m100207e(context3, "context");
                    layoutParams.setMargins(m139649b, 0, C27276c.m139649b(context3, 6), 0);
                } else {
                    Context context4 = getContext();
                    AbstractC19074t.m100207e(context4, "context");
                    int m139649b2 = C27276c.m139649b(context4, 8);
                    Context context5 = getContext();
                    AbstractC19074t.m100207e(context5, "context");
                    layoutParams.setMargins(m139649b2, 0, C27276c.m139649b(context5, 8), 0);
                }
            } else {
                layoutParams.setMargins(0, 0, 0, 0);
            }
            robotoTextView.setLayoutParams(layoutParams);
            addView(robotoTextView);
            setGravity(17);
        }
    }

    /* renamed from: e */
    private final void m90491e(AttributeSet attributeSet, int i11, int i12) {
        EnumC16991i enumC16991i;
        EnumC16980h enumC16980h;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC2815i.Badge, i11, i12);
        AbstractC19074t.m100207e(obtainStyledAttributes, "context.obtainStyledAttr…defStyleRes\n            )");
        Context context = getContext();
        AbstractC19074t.m100207e(context, "context");
        C16974f c16974f = new C16974f(context);
        C3532a c3532a = this.f86188q;
        if (c3532a == null || (enumC16991i = c3532a.m17905k(obtainStyledAttributes.getInt(AbstractC2815i.Badge_badgeType, EnumC16991i.FEATURE_NUMBER.m91021c()))) == null) {
            enumC16991i = EnumC16991i.CUSTOM;
        }
        c16974f.m90974x(enumC16991i);
        C3532a c3532a2 = this.f86188q;
        if (c3532a2 == null || (enumC16980h = c3532a2.m17904j(obtainStyledAttributes.getInt(AbstractC2815i.Badge_badgeSize, EnumC16980h.SIZE_10.m90985c()))) == null) {
            enumC16980h = EnumC16980h.SIZE_16;
        }
        c16974f.m90971u(enumC16980h);
        c16974f.m90966p(obtainStyledAttributes.getColor(AbstractC2815i.Badge_badgeBorderColor, 0));
        c16974f.m90965o(obtainStyledAttributes.getColor(AbstractC2815i.Badge_badgeBackgroundColor, 0));
        String string = obtainStyledAttributes.getString(AbstractC2815i.Badge_badgeText);
        if (string == null) {
            string = "";
        } else {
            AbstractC19074t.m100207e(string, "typedArray.getString(R.s…le.Badge_badgeText) ?: \"\"");
        }
        c16974f.m90972v(string);
        c16974f.m90967q(obtainStyledAttributes.getDrawable(AbstractC2815i.Badge_badgeIcon));
        c16974f.m90968r(obtainStyledAttributes.getColor(AbstractC2815i.Badge_badgeIconColor, c16974f.m90955e()));
        c16974f.m90973w(obtainStyledAttributes.getColor(AbstractC2815i.Badge_badgeTextColor, c16974f.m90958h()));
        c16974f.m90969s(obtainStyledAttributes.getBoolean(AbstractC2815i.Badge_isMuted, false));
        c16974f.m90970t(obtainStyledAttributes.getBoolean(AbstractC2815i.Badge_isShownBadgeBorder, false));
        String string2 = obtainStyledAttributes.getString(AbstractC2815i.Badge_trackingId);
        if (string2 != null && string2.length() != 0) {
            setIdTracking(string2);
        }
        obtainStyledAttributes.recycle();
        C3532a c3532a3 = this.f86188q;
        if (c3532a3 != null) {
            Context context2 = getContext();
            AbstractC19074t.m100207e(context2, "context");
            c3532a3.m17903i(context2, c16974f);
        }
        m90488b();
    }

    /* renamed from: f */
    static /* synthetic */ void m90492f(Badge badge, AttributeSet attributeSet, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = 0;
        }
        badge.m90491e(attributeSet, i11, i12);
    }

    /* renamed from: g */
    public final void m90493g(C16974f c16974f) {
        AbstractC19074t.m100208f(c16974f, "config");
        C3532a c3532a = this.f86188q;
        if (c3532a != null) {
            Context context = getContext();
            AbstractC19074t.m100207e(context, "context");
            c3532a.m17903i(context, c16974f);
        }
        this.f86189r = c16974f.m90960j();
        this.f86190s = c16974f.m90959i();
        if (this.f86189r.length() > 0) {
            setIdTracking(this.f86189r);
            setTrackingExtraData(this.f86190s);
        }
        m90488b();
        requestLayout();
    }

    public final C16974f getConfig() {
        C3532a c3532a = this.f86188q;
        if (c3532a != null) {
            return c3532a.m17898c();
        }
        return null;
    }

    public final int getCurrentBadgeSize() {
        C3532a c3532a = this.f86188q;
        if (c3532a != null) {
            Context context = getContext();
            AbstractC19074t.m100207e(context, "context");
            return c3532a.m17899d(context);
        }
        return 0;
    }

    public final boolean getMIsAlive() {
        return this.f86191t;
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        AbstractC19074t.m100208f(drawable, "drawable");
        super.invalidateDrawable(drawable);
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f86191t = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        this.f86191t = false;
        super.onDetachedFromWindow();
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onDraw(Canvas canvas) {
        AbstractC19074t.m100208f(canvas, "canvas");
        super.onDraw(canvas);
        C3532a c3532a = this.f86188q;
        if (c3532a != null) {
            c3532a.m17897b(canvas, getWidth(), getHeight());
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        int i13;
        C16974f m17898c;
        int measuredWidth;
        super.onMeasure(i11, i12);
        C3532a c3532a = this.f86188q;
        if (c3532a != null) {
            Context context = getContext();
            AbstractC19074t.m100207e(context, "context");
            i13 = c3532a.m17899d(context);
        } else {
            i13 = 0;
        }
        C3532a c3532a2 = this.f86188q;
        if (c3532a2 != null && (m17898c = c3532a2.m17898c()) != null) {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i13, 1073741824);
            if (m17898c.m90957g().length() == 0) {
                if (m17898c.m90961k() != EnumC16991i.SYSTEM_STATUS_WARNING && m17898c.m90961k() != EnumC16991i.SYSTEM_STATUS_DANGER) {
                    setMeasuredDimension(makeMeasureSpec, makeMeasureSpec);
                    return;
                }
                return;
            }
            if (getMeasuredWidth() <= i13) {
                measuredWidth = makeMeasureSpec;
            } else {
                measuredWidth = getMeasuredWidth();
            }
            setMeasuredDimension(measuredWidth, makeMeasureSpec);
        }
    }

    public final void setBadgeText(CharSequence charSequence) {
        AbstractC19074t.m100208f(charSequence, "text");
        C3532a c3532a = this.f86188q;
        if (c3532a != null) {
            c3532a.m17901g(charSequence);
        }
        m90488b();
    }

    @Override // com.zing.zalo.zdesign.component.InterfaceC16976f1
    public void setIdTracking(String str) {
        AbstractC19074t.m100208f(str, "id");
        C25808b c25808b = this.f86187p;
        if (c25808b != null) {
            c25808b.m133075d(str);
        }
    }

    public final void setMIsAlive(boolean z11) {
        this.f86191t = z11;
    }

    public final void setMuted(boolean z11) {
        C3532a c3532a = this.f86188q;
        if (c3532a != null) {
            Context context = getContext();
            AbstractC19074t.m100207e(context, "context");
            c3532a.m17902h(context, z11);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        C25808b c25808b = this.f86187p;
        if (c25808b == null || !c25808b.m133076e(onClickListener)) {
            super.setOnClickListener(onClickListener);
        }
    }

    @Override // com.zing.zalo.zdesign.component.InterfaceC16976f1
    public void setTrackingExtraData(C0708i c0708i) {
        C25808b c25808b = this.f86187p;
        if (c25808b != null) {
            c25808b.m133077f(c0708i);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Badge(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        AbstractC19074t.m100208f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Badge(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
        this.f86189r = "";
        this.f86188q = new C3532a(new C16909a());
        this.f86187p = new C25808b(new WeakReference(this));
        m90492f(this, attributeSet, i11, 0, 4, null);
    }
}
