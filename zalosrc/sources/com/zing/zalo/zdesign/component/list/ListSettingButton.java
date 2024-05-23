package com.zing.zalo.zdesign.component.list;

import ac.C0708i;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import bi0.AbstractC2811e;
import bi0.AbstractC2812f;
import bi0.AbstractC2814h;
import bi0.AbstractC2815i;
import bi0.AbstractC2816j;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.Button;
import com.zing.zalo.zdesign.component.Divider;
import com.zing.zalo.zdesign.component.InterfaceC16976f1;
import fn0.AbstractC19074t;
import java.lang.ref.WeakReference;
import ri0.C25808b;
import ui0.C27276c;

/* loaded from: classes7.dex */
public class ListSettingButton extends RelativeLayout implements InterfaceC16976f1 {

    /* renamed from: A */
    private int f87018A;

    /* renamed from: B */
    private Drawable f87019B;

    /* renamed from: C */
    private int f87020C;

    /* renamed from: D */
    private Drawable f87021D;

    /* renamed from: p */
    private C25808b f87022p;

    /* renamed from: q */
    private RobotoTextView f87023q;

    /* renamed from: r */
    private RobotoTextView f87024r;

    /* renamed from: s */
    public Button f87025s;

    /* renamed from: t */
    private Divider f87026t;

    /* renamed from: u */
    private ImageView f87027u;

    /* renamed from: v */
    private ImageView f87028v;

    /* renamed from: w */
    public FrameLayout f87029w;

    /* renamed from: x */
    private int f87030x;

    /* renamed from: y */
    private RelativeLayout f87031y;

    /* renamed from: z */
    private CharSequence f87032z;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ListSettingButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        AbstractC19074t.m100208f(context, "context");
    }

    /* renamed from: a */
    private final void m91083a() {
        int i11;
        getButton().setText(this.f87032z);
        Button button = getButton();
        if (this.f87032z.length() == 0) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        button.setVisibility(i11);
        if (this.f87027u.getVisibility() == 0) {
            Divider divider = this.f87026t;
            Context context = getContext();
            AbstractC19074t.m100207e(context, "context");
            divider.m90563c(C27276c.m139649b(context, 56), 0, 0, 0);
            return;
        }
        this.f87026t.m90563c(0, 0, 0, 0);
    }

    /* renamed from: b */
    private final void m91084b(AttributeSet attributeSet, int i11, int i12) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC2815i.ListSettingButton, i11, i12);
            AbstractC19074t.m100207e(obtainStyledAttributes, "context.obtainStyledAttr…tyleRes\n                )");
            String string = obtainStyledAttributes.getString(AbstractC2815i.ListSettingButton_title);
            String str = "";
            if (string == null) {
                string = "";
            }
            setTitle(string);
            String string2 = obtainStyledAttributes.getString(AbstractC2815i.ListSettingButton_subtitle);
            if (string2 == null) {
                string2 = "";
            }
            setSubtitle(string2);
            this.f87019B = obtainStyledAttributes.getDrawable(AbstractC2815i.ListSettingButton_iconLeft);
            this.f87018A = obtainStyledAttributes.getColor(AbstractC2815i.ListSettingButton_iconLeftTintColor, 0);
            String string3 = obtainStyledAttributes.getString(AbstractC2815i.ListSettingButton_textButton);
            if (string3 != null) {
                str = string3;
            }
            this.f87032z = str;
            this.f87021D = obtainStyledAttributes.getDrawable(AbstractC2815i.ListSettingButton_iconRight);
            this.f87020C = obtainStyledAttributes.getColor(AbstractC2815i.ListSettingButton_iconRightTintColor, 0);
            this.f87030x = obtainStyledAttributes.getResourceId(AbstractC2815i.ListSettingButton_styleButton, AbstractC2814h.ButtonSmall_Tertiary);
            obtainStyledAttributes.recycle();
            m91086d();
            m91087e();
            m91083a();
        }
    }

    /* renamed from: c */
    static /* synthetic */ void m91085c(ListSettingButton listSettingButton, AttributeSet attributeSet, int i11, int i12, int i13, Object obj) {
        if (obj == null) {
            if ((i13 & 2) != 0) {
                i11 = 0;
            }
            if ((i13 & 4) != 0) {
                i12 = 0;
            }
            listSettingButton.m91084b(attributeSet, i11, i12);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: parseAttributes");
    }

    /* renamed from: d */
    private final void m91086d() {
        int i11 = 8;
        if (this.f87019B == null) {
            this.f87031y.setVisibility(8);
            return;
        }
        AbstractC2816j.a aVar = AbstractC2816j.Companion;
        Context context = getContext();
        AbstractC19074t.m100207e(context, "context");
        int m13592a = aVar.m13592a(context, this.f87018A);
        int i12 = this.f87018A;
        if (i12 != 0) {
            if (m13592a != 0) {
                Drawable drawable = this.f87019B;
                if (drawable != null) {
                    drawable.setTint(m13592a);
                }
            } else {
                Drawable drawable2 = this.f87019B;
                if (drawable2 != null) {
                    drawable2.setTint(i12);
                }
            }
        }
        this.f87027u.setImageDrawable(this.f87019B);
        RelativeLayout relativeLayout = this.f87031y;
        if (this.f87019B != null) {
            i11 = 0;
        }
        relativeLayout.setVisibility(i11);
    }

    /* renamed from: e */
    private final void m91087e() {
        if (this.f87021D == null) {
            this.f87028v.setVisibility(8);
            return;
        }
        AbstractC2816j.a aVar = AbstractC2816j.Companion;
        Context context = getContext();
        AbstractC19074t.m100207e(context, "context");
        int m13592a = aVar.m13592a(context, this.f87020C);
        int i11 = this.f87020C;
        if (i11 != 0) {
            if (m13592a != 0) {
                Drawable drawable = this.f87021D;
                if (drawable != null) {
                    drawable.setTint(m13592a);
                }
            } else {
                Drawable drawable2 = this.f87021D;
                if (drawable2 != null) {
                    drawable2.setTint(i11);
                }
            }
        }
        this.f87028v.setImageDrawable(this.f87021D);
        this.f87028v.setVisibility(0);
    }

    public final Button getButton() {
        Button button = this.f87025s;
        if (button != null) {
            return button;
        }
        AbstractC19074t.m100223u("button");
        return null;
    }

    public final FrameLayout getButtonFrameLayout() {
        FrameLayout frameLayout = this.f87029w;
        if (frameLayout != null) {
            return frameLayout;
        }
        AbstractC19074t.m100223u("buttonFrameLayout");
        return null;
    }

    public final Divider getDivider() {
        return this.f87026t;
    }

    public final ImageView getIconLeft() {
        return this.f87027u;
    }

    public final ImageView getIconRight() {
        return this.f87028v;
    }

    public final RelativeLayout getRlIconLeftContainer() {
        return this.f87031y;
    }

    public final CharSequence getSubtitle() {
        CharSequence text = this.f87024r.getText();
        AbstractC19074t.m100207e(text, "subtitleTextView.text");
        return text;
    }

    public final CharSequence getTextButton() {
        return this.f87032z;
    }

    public final CharSequence getTitle() {
        CharSequence text = this.f87023q.getText();
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

    public final void setButton(Button button) {
        AbstractC19074t.m100208f(button, "<set-?>");
        this.f87025s = button;
    }

    public final void setButtonFrameLayout(FrameLayout frameLayout) {
        AbstractC19074t.m100208f(frameLayout, "<set-?>");
        this.f87029w = frameLayout;
    }

    public final void setDivider(Divider divider) {
        AbstractC19074t.m100208f(divider, "<set-?>");
        this.f87026t = divider;
    }

    public final void setIconLeft(ImageView imageView) {
        AbstractC19074t.m100208f(imageView, "<set-?>");
        this.f87027u = imageView;
    }

    public final void setIconRight(ImageView imageView) {
        AbstractC19074t.m100208f(imageView, "<set-?>");
        this.f87028v = imageView;
    }

    @Override // com.zing.zalo.zdesign.component.InterfaceC16976f1
    public void setIdTracking(String str) {
        AbstractC19074t.m100208f(str, "id");
        C25808b c25808b = this.f87022p;
        if (c25808b != null) {
            c25808b.m133075d(str);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        C25808b c25808b = this.f87022p;
        if (c25808b == null || !c25808b.m133076e(onClickListener)) {
            super.setOnClickListener(onClickListener);
        }
    }

    public final void setRlIconLeftContainer(RelativeLayout relativeLayout) {
        AbstractC19074t.m100208f(relativeLayout, "<set-?>");
        this.f87031y = relativeLayout;
    }

    public final void setSubtitle(CharSequence charSequence) {
        int i11;
        AbstractC19074t.m100208f(charSequence, "value");
        this.f87024r.setText(charSequence);
        RobotoTextView robotoTextView = this.f87024r;
        if (charSequence.length() == 0) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        robotoTextView.setVisibility(i11);
    }

    public final void setSubtitleColor(int i11) {
        this.f87024r.setTextColor(i11);
    }

    public final void setSubtitleStyleBold(boolean z11) {
        this.f87024r.setTextStyleBold(z11);
    }

    public final void setTextButton(CharSequence charSequence) {
        AbstractC19074t.m100208f(charSequence, "<set-?>");
        this.f87032z = charSequence;
    }

    public final void setTitle(CharSequence charSequence) {
        AbstractC19074t.m100208f(charSequence, "value");
        this.f87023q.setText(charSequence);
    }

    public final void setTitleColor(int i11) {
        this.f87023q.setTextColor(i11);
    }

    public final void setTitleStyleBold(boolean z11) {
        this.f87023q.setTextStyleBold(z11);
    }

    @Override // com.zing.zalo.zdesign.component.InterfaceC16976f1
    public void setTrackingExtraData(C0708i c0708i) {
        C25808b c25808b = this.f87022p;
        if (c25808b != null) {
            c25808b.m133077f(c0708i);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListSettingButton(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
        this.f87032z = "";
        this.f87022p = new C25808b(new WeakReference(this));
        LayoutInflater.from(context).inflate(AbstractC2812f.item_list_setting_button, this);
        View findViewById = findViewById(AbstractC2811e.icon_left_list_setting);
        AbstractC19074t.m100207e(findViewById, "findViewById(R.id.icon_left_list_setting)");
        this.f87027u = (ImageView) findViewById;
        View findViewById2 = findViewById(AbstractC2811e.title_list_setting);
        AbstractC19074t.m100207e(findViewById2, "findViewById(R.id.title_list_setting)");
        this.f87023q = (RobotoTextView) findViewById2;
        View findViewById3 = findViewById(AbstractC2811e.subtitle_list_setting);
        AbstractC19074t.m100207e(findViewById3, "findViewById(R.id.subtitle_list_setting)");
        this.f87024r = (RobotoTextView) findViewById3;
        View findViewById4 = findViewById(AbstractC2811e.icon_left_list_setting_container);
        AbstractC19074t.m100207e(findViewById4, "findViewById(R.id.icon_l…t_list_setting_container)");
        this.f87031y = (RelativeLayout) findViewById4;
        View findViewById5 = findViewById(AbstractC2811e.icon_right_list_setting);
        AbstractC19074t.m100207e(findViewById5, "findViewById(R.id.icon_right_list_setting)");
        this.f87028v = (ImageView) findViewById5;
        View findViewById6 = findViewById(AbstractC2811e.button_list_setting);
        AbstractC19074t.m100207e(findViewById6, "findViewById(R.id.button_list_setting)");
        setButton((Button) findViewById6);
        View findViewById7 = findViewById(AbstractC2811e.divider_list_setting_button);
        AbstractC19074t.m100207e(findViewById7, "findViewById(R.id.divider_list_setting_button)");
        this.f87026t = (Divider) findViewById7;
        m91085c(this, attributeSet, i11, 0, 4, null);
        this.f87023q.setMaxLines(2);
    }

    public final void setIconLeft(Drawable drawable) {
        this.f87019B = drawable;
        m91086d();
    }

    public final void setIconRight(Drawable drawable) {
        this.f87021D = drawable;
        m91087e();
    }

    public final void setSubtitleColor(ColorStateList colorStateList) {
        AbstractC19074t.m100208f(colorStateList, "colorStateList");
        this.f87024r.setTextColor(colorStateList);
    }

    public final void setTextButton(String str) {
        AbstractC19074t.m100208f(str, "text");
        this.f87032z = str;
        getButton().setText(this.f87032z);
        getButton().setVisibility(this.f87032z.length() == 0 ? 8 : 0);
    }

    public final void setTitleColor(ColorStateList colorStateList) {
        AbstractC19074t.m100208f(colorStateList, "colorStateList");
        this.f87023q.setTextColor(colorStateList);
    }
}
