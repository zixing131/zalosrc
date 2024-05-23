package com.zing.zalo.zdesign.component.list;

import ac.C0708i;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import bi0.AbstractC2811e;
import bi0.AbstractC2812f;
import bi0.AbstractC2815i;
import bi0.AbstractC2816j;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.Divider;
import com.zing.zalo.zdesign.component.InterfaceC16976f1;
import com.zing.zalo.zdesign.component.TrackingImageView;
import fn0.AbstractC19074t;
import java.lang.ref.WeakReference;
import ri0.C25808b;
import ui0.C27276c;

/* loaded from: classes7.dex */
public class ListItemSettingIcon extends RelativeLayout implements InterfaceC16976f1 {

    /* renamed from: A */
    private RobotoTextView f86980A;

    /* renamed from: B */
    private RobotoTextView f86981B;

    /* renamed from: C */
    private ImageView f86982C;

    /* renamed from: D */
    private ImageView f86983D;

    /* renamed from: E */
    private TrackingImageView f86984E;

    /* renamed from: F */
    private TrackingImageView f86985F;

    /* renamed from: G */
    private Divider f86986G;

    /* renamed from: p */
    private C25808b f86987p;

    /* renamed from: q */
    private int f86988q;

    /* renamed from: r */
    private Drawable f86989r;

    /* renamed from: s */
    private int f86990s;

    /* renamed from: t */
    private Drawable f86991t;

    /* renamed from: u */
    private int f86992u;

    /* renamed from: v */
    private Drawable f86993v;

    /* renamed from: w */
    private int f86994w;

    /* renamed from: x */
    private Drawable f86995x;

    /* renamed from: y */
    private RobotoTextView f86996y;

    /* renamed from: z */
    private RobotoTextView f86997z;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ListItemSettingIcon(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        AbstractC19074t.m100208f(context, "context");
    }

    /* renamed from: a */
    private final void m91073a() {
        this.f86996y.setSingleLine(true);
        this.f86996y.setEllipsize(TextUtils.TruncateAt.END);
        this.f86997z.setSingleLine(false);
        if (this.f86982C.getVisibility() == 0) {
            Divider divider = this.f86986G;
            Context context = getContext();
            AbstractC19074t.m100207e(context, "context");
            divider.m90563c(C27276c.m139649b(context, 56), 0, 0, 0);
            return;
        }
        this.f86986G.m90563c(0, 0, 0, 0);
    }

    /* renamed from: b */
    private final void m91074b(AttributeSet attributeSet, int i11, int i12) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC2815i.ListItemSettingIcon, i11, i12);
            AbstractC19074t.m100207e(obtainStyledAttributes, "context.obtainStyledAttr…tyleRes\n                )");
            String string = obtainStyledAttributes.getString(AbstractC2815i.ListItemSettingIcon_title);
            String str = "";
            if (string == null) {
                string = "";
            }
            setTitle(string);
            String string2 = obtainStyledAttributes.getString(AbstractC2815i.ListItemSettingIcon_subtitle);
            if (string2 != null) {
                str = string2;
            }
            setSubtitle(str);
            this.f86989r = obtainStyledAttributes.getDrawable(AbstractC2815i.ListItemSettingIcon_iconLeft);
            this.f86988q = obtainStyledAttributes.getColor(AbstractC2815i.ListItemSettingIcon_iconLeftTintColor, 0);
            this.f86991t = obtainStyledAttributes.getDrawable(AbstractC2815i.ListItemSettingIcon_iconRightFirst);
            this.f86990s = obtainStyledAttributes.getColor(AbstractC2815i.ListItemSettingIcon_iconRightFirstTintColor, 0);
            this.f86993v = obtainStyledAttributes.getDrawable(AbstractC2815i.ListItemSettingIcon_iconRightSecond);
            this.f86992u = obtainStyledAttributes.getColor(AbstractC2815i.ListItemSettingIcon_iconRightSecondTintColor, 0);
            this.f86995x = obtainStyledAttributes.getDrawable(AbstractC2815i.ListItemSettingIcon_iconNotify);
            this.f86994w = obtainStyledAttributes.getColor(AbstractC2815i.ListItemSettingIcon_iconNotifyTintColor, 0);
            obtainStyledAttributes.recycle();
            m91076d();
            m91078f();
            m91079g();
            m91077e();
            m91073a();
        }
    }

    /* renamed from: c */
    static /* synthetic */ void m91075c(ListItemSettingIcon listItemSettingIcon, AttributeSet attributeSet, int i11, int i12, int i13, Object obj) {
        if (obj == null) {
            if ((i13 & 2) != 0) {
                i11 = 0;
            }
            if ((i13 & 4) != 0) {
                i12 = 0;
            }
            listItemSettingIcon.m91074b(attributeSet, i11, i12);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: parseAttributes");
    }

    /* renamed from: d */
    private final void m91076d() {
        if (this.f86989r == null) {
            this.f86982C.setVisibility(8);
            return;
        }
        AbstractC2816j.a aVar = AbstractC2816j.Companion;
        Context context = getContext();
        AbstractC19074t.m100207e(context, "context");
        int m13592a = aVar.m13592a(context, this.f86988q);
        int i11 = this.f86988q;
        if (i11 != 0) {
            if (m13592a != 0) {
                Drawable drawable = this.f86989r;
                if (drawable != null) {
                    drawable.setTint(m13592a);
                }
            } else {
                Drawable drawable2 = this.f86989r;
                if (drawable2 != null) {
                    drawable2.setTint(i11);
                }
            }
        }
        this.f86982C.setImageDrawable(this.f86989r);
        this.f86982C.setVisibility(0);
    }

    /* renamed from: e */
    private final void m91077e() {
        if (this.f86995x == null) {
            this.f86983D.setVisibility(8);
            return;
        }
        AbstractC2816j.a aVar = AbstractC2816j.Companion;
        Context context = getContext();
        AbstractC19074t.m100207e(context, "context");
        int m13592a = aVar.m13592a(context, this.f86994w);
        int i11 = this.f86994w;
        if (i11 != 0) {
            if (m13592a != 0) {
                Drawable drawable = this.f86995x;
                if (drawable != null) {
                    drawable.setTint(m13592a);
                }
            } else {
                Drawable drawable2 = this.f86995x;
                if (drawable2 != null) {
                    drawable2.setTint(i11);
                }
            }
        }
        this.f86983D.setImageDrawable(this.f86995x);
        this.f86983D.setVisibility(0);
    }

    /* renamed from: f */
    private final void m91078f() {
        if (this.f86991t == null) {
            this.f86984E.setVisibility(8);
            return;
        }
        AbstractC2816j.a aVar = AbstractC2816j.Companion;
        Context context = getContext();
        AbstractC19074t.m100207e(context, "context");
        int m13592a = aVar.m13592a(context, this.f86990s);
        int i11 = this.f86990s;
        if (i11 != 0) {
            if (m13592a != 0) {
                Drawable drawable = this.f86991t;
                if (drawable != null) {
                    drawable.setTint(m13592a);
                }
            } else {
                Drawable drawable2 = this.f86991t;
                if (drawable2 != null) {
                    drawable2.setTint(i11);
                }
            }
        }
        this.f86984E.setImageDrawable(this.f86991t);
        this.f86984E.setVisibility(0);
    }

    /* renamed from: g */
    private final void m91079g() {
        if (this.f86993v == null) {
            this.f86985F.setVisibility(8);
            return;
        }
        AbstractC2816j.a aVar = AbstractC2816j.Companion;
        Context context = getContext();
        AbstractC19074t.m100207e(context, "context");
        int m13592a = aVar.m13592a(context, this.f86992u);
        int i11 = this.f86992u;
        if (i11 != 0) {
            if (m13592a != 0) {
                Drawable drawable = this.f86993v;
                if (drawable != null) {
                    drawable.setTint(m13592a);
                }
            } else {
                Drawable drawable2 = this.f86993v;
                if (drawable2 != null) {
                    drawable2.setTint(i11);
                }
            }
        }
        this.f86985F.setImageDrawable(this.f86993v);
        this.f86985F.setVisibility(0);
    }

    public final RobotoTextView getBadgeNew() {
        return this.f86981B;
    }

    public final CharSequence getBracketContent() {
        CharSequence text = this.f86980A.getText();
        AbstractC19074t.m100207e(text, "bracketContentTextView.text");
        return text;
    }

    public final RobotoTextView getBracketContentTextView() {
        return this.f86980A;
    }

    public final Divider getDivider() {
        return this.f86986G;
    }

    public final ImageView getIconLeft() {
        return this.f86982C;
    }

    public final ImageView getIconNotify() {
        return this.f86983D;
    }

    public final TrackingImageView getIconRightFirst() {
        return this.f86984E;
    }

    public final TrackingImageView getIconRightSecond() {
        return this.f86985F;
    }

    public final CharSequence getSubtitle() {
        CharSequence text = this.f86997z.getText();
        AbstractC19074t.m100207e(text, "subtitleTextView.text");
        return text;
    }

    public final CharSequence getTitle() {
        CharSequence text = this.f86996y.getText();
        AbstractC19074t.m100207e(text, "titleTextView.text");
        return text;
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        AbstractC19074t.m100208f(canvas, "canvas");
        super.onDraw(canvas);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected final void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
    }

    public final void setBadgeNew(RobotoTextView robotoTextView) {
        AbstractC19074t.m100208f(robotoTextView, "<set-?>");
        this.f86981B = robotoTextView;
    }

    public final void setBracketContent(CharSequence charSequence) {
        int i11;
        AbstractC19074t.m100208f(charSequence, "value");
        this.f86980A.setText(charSequence);
        RobotoTextView robotoTextView = this.f86980A;
        if (charSequence.length() == 0) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        robotoTextView.setVisibility(i11);
    }

    public final void setBracketContentTextView(RobotoTextView robotoTextView) {
        AbstractC19074t.m100208f(robotoTextView, "<set-?>");
        this.f86980A = robotoTextView;
    }

    public final void setDivider(Divider divider) {
        AbstractC19074t.m100208f(divider, "<set-?>");
        this.f86986G = divider;
    }

    public final void setIconLeft(ImageView imageView) {
        AbstractC19074t.m100208f(imageView, "<set-?>");
        this.f86982C = imageView;
    }

    public final void setIconNotify(ImageView imageView) {
        AbstractC19074t.m100208f(imageView, "<set-?>");
        this.f86983D = imageView;
    }

    public final void setIconRightFirst(TrackingImageView trackingImageView) {
        AbstractC19074t.m100208f(trackingImageView, "<set-?>");
        this.f86984E = trackingImageView;
    }

    public final void setIconRightSecond(TrackingImageView trackingImageView) {
        AbstractC19074t.m100208f(trackingImageView, "<set-?>");
        this.f86985F = trackingImageView;
    }

    @Override // com.zing.zalo.zdesign.component.InterfaceC16976f1
    public void setIdTracking(String str) {
        AbstractC19074t.m100208f(str, "id");
        C25808b c25808b = this.f86987p;
        if (c25808b != null) {
            c25808b.m133075d(str);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        C25808b c25808b = this.f86987p;
        if (c25808b == null || !c25808b.m133076e(onClickListener)) {
            super.setOnClickListener(onClickListener);
        }
    }

    public final void setSubTitleSingleLine(boolean z11) {
        if (z11) {
            this.f86997z.setSingleLine(true);
            this.f86997z.setEllipsize(TextUtils.TruncateAt.END);
        } else {
            this.f86997z.setSingleLine(false);
        }
    }

    public final void setSubtitle(CharSequence charSequence) {
        int i11;
        AbstractC19074t.m100208f(charSequence, "value");
        this.f86997z.setText(charSequence);
        RobotoTextView robotoTextView = this.f86997z;
        if (charSequence.length() == 0) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        robotoTextView.setVisibility(i11);
    }

    public final void setSubtitleColor(int i11) {
        this.f86997z.setTextColor(i11);
    }

    public final void setSubtitleStyleBold(boolean z11) {
        this.f86997z.setTextStyleBold(z11);
    }

    public final void setTitle(CharSequence charSequence) {
        AbstractC19074t.m100208f(charSequence, "value");
        this.f86996y.setText(charSequence);
    }

    public final void setTitleColor(int i11) {
        this.f86996y.setTextColor(i11);
    }

    public final void setTitleStyleBold(boolean z11) {
        this.f86996y.setTextStyleBold(z11);
    }

    @Override // com.zing.zalo.zdesign.component.InterfaceC16976f1
    public void setTrackingExtraData(C0708i c0708i) {
        C25808b c25808b = this.f86987p;
        if (c25808b != null) {
            c25808b.m133077f(c0708i);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListItemSettingIcon(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
        this.f86987p = new C25808b(new WeakReference(this));
        LayoutInflater.from(context).inflate(AbstractC2812f.item_list_setting_icon, this);
        View findViewById = findViewById(AbstractC2811e.icon_left_list_setting);
        AbstractC19074t.m100207e(findViewById, "findViewById(R.id.icon_left_list_setting)");
        this.f86982C = (ImageView) findViewById;
        View findViewById2 = findViewById(AbstractC2811e.icon_setting_reminder);
        AbstractC19074t.m100207e(findViewById2, "findViewById(R.id.icon_setting_reminder)");
        this.f86983D = (ImageView) findViewById2;
        View findViewById3 = findViewById(AbstractC2811e.title_list_setting);
        AbstractC19074t.m100207e(findViewById3, "findViewById(R.id.title_list_setting)");
        this.f86996y = (RobotoTextView) findViewById3;
        View findViewById4 = findViewById(AbstractC2811e.subtitle_list_setting);
        AbstractC19074t.m100207e(findViewById4, "findViewById(R.id.subtitle_list_setting)");
        this.f86997z = (RobotoTextView) findViewById4;
        View findViewById5 = findViewById(AbstractC2811e.icon_right_list_setting_first);
        AbstractC19074t.m100207e(findViewById5, "findViewById(R.id.icon_right_list_setting_first)");
        this.f86984E = (TrackingImageView) findViewById5;
        View findViewById6 = findViewById(AbstractC2811e.icon_right_list_setting_second);
        AbstractC19074t.m100207e(findViewById6, "findViewById(R.id.icon_right_list_setting_second)");
        this.f86985F = (TrackingImageView) findViewById6;
        View findViewById7 = findViewById(AbstractC2811e.divider_list_item);
        AbstractC19074t.m100207e(findViewById7, "findViewById(R.id.divider_list_item)");
        this.f86986G = (Divider) findViewById7;
        View findViewById8 = findViewById(AbstractC2811e.badgeNew);
        AbstractC19074t.m100207e(findViewById8, "findViewById(R.id.badgeNew)");
        this.f86981B = (RobotoTextView) findViewById8;
        View findViewById9 = findViewById(AbstractC2811e.bracket_content_list_setting);
        AbstractC19074t.m100207e(findViewById9, "findViewById(R.id.bracket_content_list_setting)");
        this.f86980A = (RobotoTextView) findViewById9;
        m91075c(this, attributeSet, i11, 0, 4, null);
    }

    public final void setIconLeft(Drawable drawable) {
        this.f86989r = drawable;
        if (drawable != null) {
            this.f86982C.setImageDrawable(drawable);
            this.f86982C.setVisibility(0);
        }
    }

    public final void setIconNotify(Drawable drawable) {
        this.f86995x = drawable;
        if (drawable != null) {
            this.f86983D.setImageDrawable(drawable);
            this.f86983D.setVisibility(0);
        }
    }

    public final void setIconRightFirst(Drawable drawable) {
        this.f86991t = drawable;
        if (drawable != null) {
            this.f86984E.setImageDrawable(drawable);
            this.f86984E.setVisibility(0);
        }
    }

    public final void setIconRightSecond(Drawable drawable) {
        this.f86993v = drawable;
        if (drawable != null) {
            this.f86985F.setImageDrawable(drawable);
            this.f86985F.setVisibility(0);
        }
    }

    public final void setSubtitleColor(ColorStateList colorStateList) {
        AbstractC19074t.m100208f(colorStateList, "colorStateList");
        this.f86997z.setTextColor(colorStateList);
    }

    public final void setTitleColor(ColorStateList colorStateList) {
        AbstractC19074t.m100208f(colorStateList, "colorStateList");
        this.f86996y.setTextColor(colorStateList);
    }
}
