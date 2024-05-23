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
import bi0.AbstractC2808b;
import bi0.AbstractC2810d;
import bi0.AbstractC2811e;
import bi0.AbstractC2812f;
import bi0.AbstractC2815i;
import bi0.AbstractC2816j;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.Avatar;
import com.zing.zalo.zdesign.component.Divider;
import com.zing.zalo.zdesign.component.GlowingReddot;
import com.zing.zalo.zdesign.component.InterfaceC16976f1;
import com.zing.zalo.zdesign.component.TrackingImageView;
import fn0.AbstractC19074t;
import java.lang.ref.WeakReference;
import ri0.C25808b;
import ui0.C27280g;

/* loaded from: classes7.dex */
public class ListItemMeTab extends RelativeLayout implements InterfaceC16976f1 {

    /* renamed from: p */
    private C25808b f86969p;

    /* renamed from: q */
    private Divider f86970q;

    /* renamed from: r */
    private GlowingReddot f86971r;

    /* renamed from: s */
    private ImageView f86972s;

    /* renamed from: t */
    private Avatar f86973t;

    /* renamed from: u */
    private Avatar f86974u;

    /* renamed from: v */
    private TrackingImageView f86975v;

    /* renamed from: w */
    private RobotoTextView f86976w;

    /* renamed from: x */
    private RobotoTextView f86977x;

    /* renamed from: y */
    private int f86978y;

    /* renamed from: z */
    private Drawable f86979z;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ListItemMeTab(Context context) {
        this(context, null);
        AbstractC19074t.m100208f(context, "context");
    }

    /* renamed from: a */
    private final void m91068a() {
        this.f86976w.setSingleLine(true);
        this.f86976w.setEllipsize(TextUtils.TruncateAt.END);
        this.f86977x.setSingleLine(false);
        TrackingImageView trackingImageView = this.f86975v;
        Context context = getContext();
        AbstractC19074t.m100207e(context, "context");
        trackingImageView.setImageDrawable(C27280g.m139659b(context, AbstractC2810d.zds_ic_switch_users_line_24, AbstractC2808b.f150820b50));
    }

    /* renamed from: b */
    private final void m91069b(AttributeSet attributeSet, int i11, int i12) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC2815i.ListItemMeTab, i11, i12);
            AbstractC19074t.m100207e(obtainStyledAttributes, "context.obtainStyledAttr…tyleRes\n                )");
            String string = obtainStyledAttributes.getString(AbstractC2815i.ListItemMeTab_title);
            String str = "";
            if (string == null) {
                string = "";
            }
            setTitle(string);
            String string2 = obtainStyledAttributes.getString(AbstractC2815i.ListItemMeTab_subtitle);
            if (string2 != null) {
                str = string2;
            }
            setSubtitle(str);
            this.f86979z = obtainStyledAttributes.getDrawable(AbstractC2815i.ListItemMeTab_iconNotify);
            this.f86978y = obtainStyledAttributes.getColor(AbstractC2815i.ListItemMeTab_iconNotifyTintColor, 0);
            obtainStyledAttributes.recycle();
            m91068a();
            m91071d();
        }
    }

    /* renamed from: c */
    static /* synthetic */ void m91070c(ListItemMeTab listItemMeTab, AttributeSet attributeSet, int i11, int i12, int i13, Object obj) {
        if (obj == null) {
            if ((i13 & 2) != 0) {
                i11 = 0;
            }
            if ((i13 & 4) != 0) {
                i12 = 0;
            }
            listItemMeTab.m91069b(attributeSet, i11, i12);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: parseAttributes");
    }

    /* renamed from: d */
    private final void m91071d() {
        if (this.f86979z == null) {
            this.f86972s.setVisibility(8);
            return;
        }
        AbstractC2816j.a aVar = AbstractC2816j.Companion;
        Context context = getContext();
        AbstractC19074t.m100207e(context, "context");
        int m13592a = aVar.m13592a(context, this.f86978y);
        int i11 = this.f86978y;
        if (i11 != 0) {
            if (m13592a != 0) {
                Drawable drawable = this.f86979z;
                if (drawable != null) {
                    drawable.setTint(m13592a);
                    return;
                }
                return;
            }
            Drawable drawable2 = this.f86979z;
            if (drawable2 != null) {
                drawable2.setTint(i11);
            }
        }
    }

    /* renamed from: e */
    public final void m91072e(boolean z11) {
        if (z11) {
            this.f86975v.setVisibility(8);
            this.f86974u.setVisibility(0);
        } else {
            this.f86975v.setVisibility(0);
            this.f86974u.setVisibility(8);
        }
    }

    public final Avatar getAvtLeft() {
        return this.f86973t;
    }

    public final Avatar getAvtRight() {
        return this.f86974u;
    }

    public final Divider getDivider() {
        return this.f86970q;
    }

    public final GlowingReddot getGlowingReddot() {
        return this.f86971r;
    }

    public final ImageView getIconNotify() {
        return this.f86972s;
    }

    public final TrackingImageView getIconRight() {
        return this.f86975v;
    }

    public final CharSequence getSubtitle() {
        CharSequence text = this.f86977x.getText();
        AbstractC19074t.m100207e(text, "subtitleTextView.text");
        return text;
    }

    public final CharSequence getTitle() {
        CharSequence text = this.f86976w.getText();
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

    public final void setAvtLeft(Avatar avatar) {
        AbstractC19074t.m100208f(avatar, "<set-?>");
        this.f86973t = avatar;
    }

    public final void setAvtRight(Avatar avatar) {
        AbstractC19074t.m100208f(avatar, "<set-?>");
        this.f86974u = avatar;
    }

    public final void setDivider(Divider divider) {
        AbstractC19074t.m100208f(divider, "<set-?>");
        this.f86970q = divider;
    }

    public final void setGlowingReddot(GlowingReddot glowingReddot) {
        AbstractC19074t.m100208f(glowingReddot, "<set-?>");
        this.f86971r = glowingReddot;
    }

    public final void setIconNotify(ImageView imageView) {
        AbstractC19074t.m100208f(imageView, "<set-?>");
        this.f86972s = imageView;
    }

    public final void setIconRight(TrackingImageView trackingImageView) {
        AbstractC19074t.m100208f(trackingImageView, "<set-?>");
        this.f86975v = trackingImageView;
    }

    @Override // com.zing.zalo.zdesign.component.InterfaceC16976f1
    public void setIdTracking(String str) {
        AbstractC19074t.m100208f(str, "id");
        C25808b c25808b = this.f86969p;
        if (c25808b != null) {
            c25808b.m133075d(str);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        C25808b c25808b = this.f86969p;
        if (c25808b == null || !c25808b.m133076e(onClickListener)) {
            super.setOnClickListener(onClickListener);
        }
    }

    public final void setSubTitleSingleLine(boolean z11) {
        if (z11) {
            this.f86977x.setSingleLine(true);
            this.f86977x.setEllipsize(TextUtils.TruncateAt.END);
        } else {
            this.f86977x.setSingleLine(false);
        }
    }

    public final void setSubtitle(CharSequence charSequence) {
        int i11;
        AbstractC19074t.m100208f(charSequence, "value");
        this.f86977x.setText(charSequence);
        RobotoTextView robotoTextView = this.f86977x;
        if (charSequence.length() == 0) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        robotoTextView.setVisibility(i11);
    }

    public final void setSubtitleColor(int i11) {
        this.f86977x.setTextColor(i11);
    }

    public final void setSubtitleStyleBold(boolean z11) {
        this.f86977x.setTextStyleBold(z11);
    }

    public final void setTitle(CharSequence charSequence) {
        AbstractC19074t.m100208f(charSequence, "value");
        this.f86976w.setText(charSequence);
    }

    public final void setTitleColor(int i11) {
        this.f86976w.setTextColor(i11);
    }

    public final void setTitleStyleBold(boolean z11) {
        this.f86976w.setTextStyleBold(z11);
    }

    @Override // com.zing.zalo.zdesign.component.InterfaceC16976f1
    public void setTrackingExtraData(C0708i c0708i) {
        C25808b c25808b = this.f86969p;
        if (c25808b != null) {
            c25808b.m133077f(c0708i);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ListItemMeTab(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        AbstractC19074t.m100208f(context, "context");
    }

    public final void setIconNotify(Drawable drawable) {
        this.f86979z = drawable;
        if (drawable != null) {
            this.f86972s.setImageDrawable(drawable);
            this.f86972s.setVisibility(0);
        }
    }

    public final void setSubtitleColor(ColorStateList colorStateList) {
        AbstractC19074t.m100208f(colorStateList, "colorStateList");
        this.f86977x.setTextColor(colorStateList);
    }

    public final void setTitleColor(ColorStateList colorStateList) {
        AbstractC19074t.m100208f(colorStateList, "colorStateList");
        this.f86976w.setTextColor(colorStateList);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListItemMeTab(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
        this.f86969p = new C25808b(new WeakReference(this));
        LayoutInflater.from(context).inflate(AbstractC2812f.item_list_me_tab, this);
        View findViewById = findViewById(AbstractC2811e.avt_left_list_me_tab);
        AbstractC19074t.m100207e(findViewById, "findViewById(R.id.avt_left_list_me_tab)");
        this.f86973t = (Avatar) findViewById;
        View findViewById2 = findViewById(AbstractC2811e.icon_setting_reminder);
        AbstractC19074t.m100207e(findViewById2, "findViewById(R.id.icon_setting_reminder)");
        this.f86972s = (ImageView) findViewById2;
        View findViewById3 = findViewById(AbstractC2811e.title_list_me_tab);
        AbstractC19074t.m100207e(findViewById3, "findViewById(R.id.title_list_me_tab)");
        this.f86976w = (RobotoTextView) findViewById3;
        View findViewById4 = findViewById(AbstractC2811e.subtitle_list_me_tab);
        AbstractC19074t.m100207e(findViewById4, "findViewById(R.id.subtitle_list_me_tab)");
        this.f86977x = (RobotoTextView) findViewById4;
        View findViewById5 = findViewById(AbstractC2811e.icon_right_list_me_tab);
        AbstractC19074t.m100207e(findViewById5, "findViewById(R.id.icon_right_list_me_tab)");
        this.f86975v = (TrackingImageView) findViewById5;
        View findViewById6 = findViewById(AbstractC2811e.avt_right_list_me_tab);
        AbstractC19074t.m100207e(findViewById6, "findViewById(R.id.avt_right_list_me_tab)");
        this.f86974u = (Avatar) findViewById6;
        View findViewById7 = findViewById(AbstractC2811e.divider_list_item);
        AbstractC19074t.m100207e(findViewById7, "findViewById(R.id.divider_list_item)");
        this.f86970q = (Divider) findViewById7;
        View findViewById8 = findViewById(AbstractC2811e.glowing_reddot);
        AbstractC19074t.m100207e(findViewById8, "findViewById(R.id.glowing_reddot)");
        this.f86971r = (GlowingReddot) findViewById8;
        m91070c(this, attributeSet, i11, 0, 4, null);
    }
}
