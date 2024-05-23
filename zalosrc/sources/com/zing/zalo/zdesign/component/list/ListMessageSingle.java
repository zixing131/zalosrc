package com.zing.zalo.zdesign.component.list;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import bi0.AbstractC2811e;
import bi0.AbstractC2812f;
import bi0.AbstractC2815i;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.Avatar;
import fn0.AbstractC19074t;

/* loaded from: classes7.dex */
public class ListMessageSingle extends RelativeLayout {

    /* renamed from: A */
    private RelativeLayout f86998A;

    /* renamed from: B */
    private RelativeLayout f86999B;

    /* renamed from: C */
    private RelativeLayout f87000C;

    /* renamed from: D */
    private RelativeLayout f87001D;

    /* renamed from: E */
    private Drawable f87002E;

    /* renamed from: F */
    private Drawable f87003F;

    /* renamed from: G */
    private Drawable f87004G;

    /* renamed from: H */
    private Drawable f87005H;

    /* renamed from: I */
    private Drawable f87006I;

    /* renamed from: p */
    private CheckBox f87007p;

    /* renamed from: q */
    private Avatar f87008q;

    /* renamed from: r */
    private RobotoTextView f87009r;

    /* renamed from: s */
    private ImageView f87010s;

    /* renamed from: t */
    private ImageView f87011t;

    /* renamed from: u */
    private RobotoTextView f87012u;

    /* renamed from: v */
    private RobotoTextView f87013v;

    /* renamed from: w */
    private ImageView f87014w;

    /* renamed from: x */
    private RobotoTextView f87015x;

    /* renamed from: y */
    private ImageView f87016y;

    /* renamed from: z */
    private RelativeLayout f87017z;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ListMessageSingle(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        AbstractC19074t.m100208f(context, "context");
    }

    /* renamed from: a */
    private final void m91080a() {
        setIconMute(this.f87004G);
        setIconPin(this.f87003F);
        setIconCustomMsg(this.f87005H);
        setIconSuggestMsg(this.f87006I);
        setAvatar(this.f87002E);
    }

    /* renamed from: b */
    private final void m91081b(AttributeSet attributeSet, int i11, int i12) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC2815i.ListMessageSingle, i11, i12);
            AbstractC19074t.m100207e(obtainStyledAttributes, "context.obtainStyledAttr…tyleRes\n                )");
            String string = obtainStyledAttributes.getString(AbstractC2815i.ListMessageSingle_heading);
            String str = "";
            if (string == null) {
                string = "";
            }
            setName(string);
            String string2 = obtainStyledAttributes.getString(AbstractC2815i.ListMessageSingle_content);
            if (string2 == null) {
                string2 = "";
            }
            setCustomMsg(string2);
            String string3 = obtainStyledAttributes.getString(AbstractC2815i.ListMessageSingle_time);
            if (string3 == null) {
                string3 = "";
            }
            setTime(string3);
            String string4 = obtainStyledAttributes.getString(AbstractC2815i.ListMessageSingle_suggestMsg);
            if (string4 != null) {
                str = string4;
            }
            setSuggestMsg(str);
            this.f87002E = obtainStyledAttributes.getDrawable(AbstractC2815i.ListMessageSingle_avatar);
            this.f87004G = obtainStyledAttributes.getDrawable(AbstractC2815i.ListMessageSingle_iconMute);
            this.f87003F = obtainStyledAttributes.getDrawable(AbstractC2815i.ListMessageSingle_iconPin);
            this.f87005H = obtainStyledAttributes.getDrawable(AbstractC2815i.ListMessageSingle_customMsgIcon);
            this.f87006I = obtainStyledAttributes.getDrawable(AbstractC2815i.ListMessageSingle_suggestMsgIcon);
            setShowCheckBox(obtainStyledAttributes.getBoolean(AbstractC2815i.ListMessageSingle_showCheckbox, false));
            obtainStyledAttributes.recycle();
            m91080a();
        }
    }

    /* renamed from: c */
    static /* synthetic */ void m91082c(ListMessageSingle listMessageSingle, AttributeSet attributeSet, int i11, int i12, int i13, Object obj) {
        if (obj == null) {
            if ((i13 & 2) != 0) {
                i11 = 0;
            }
            if ((i13 & 4) != 0) {
                i12 = 0;
            }
            listMessageSingle.m91081b(attributeSet, i11, i12);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: parseAttributes");
    }

    public final Avatar getAvatar() {
        return this.f87008q;
    }

    public final CheckBox getCheckbox() {
        return this.f87007p;
    }

    public final CharSequence getCustomMsg() {
        CharSequence text = this.f87013v.getText();
        AbstractC19074t.m100207e(text, "customMsgTextView.text");
        return text;
    }

    public final RobotoTextView getCustomMsgTextView() {
        return this.f87013v;
    }

    public final ImageView getIconCustomMsg() {
        return this.f87014w;
    }

    public final ImageView getIconMute() {
        return this.f87010s;
    }

    public final ImageView getIconPin() {
        return this.f87011t;
    }

    public final ImageView getIconSuggestMsg() {
        return this.f87016y;
    }

    public final CharSequence getName() {
        CharSequence text = this.f87009r.getText();
        AbstractC19074t.m100207e(text, "nameTextView.text");
        return text;
    }

    public final RobotoTextView getNameTextView() {
        return this.f87009r;
    }

    public final RelativeLayout getRlContentContainer() {
        return this.f86998A;
    }

    public final RelativeLayout getRlCustomListMsg() {
        return this.f87000C;
    }

    public final RelativeLayout getRlLine1RightSide() {
        return this.f86999B;
    }

    public final RelativeLayout getRlListMessageSingle() {
        return this.f87017z;
    }

    public final RelativeLayout getRlSuggestListMsg() {
        return this.f87001D;
    }

    public final CharSequence getSuggestMsg() {
        CharSequence text = this.f87015x.getText();
        AbstractC19074t.m100207e(text, "suggestMsgTextView.text");
        return text;
    }

    public final RobotoTextView getSuggestMsgTextView() {
        return this.f87015x;
    }

    public final CharSequence getTime() {
        CharSequence text = this.f87012u.getText();
        AbstractC19074t.m100207e(text, "timeTextView.text");
        return text;
    }

    public final RobotoTextView getTimeTextView() {
        return this.f87012u;
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

    public final void setAvatar(Avatar avatar) {
        AbstractC19074t.m100208f(avatar, "<set-?>");
        this.f87008q = avatar;
    }

    public final void setCheckbox(CheckBox checkBox) {
        AbstractC19074t.m100208f(checkBox, "<set-?>");
        this.f87007p = checkBox;
    }

    public final void setCustomMsg(CharSequence charSequence) {
        int i11;
        AbstractC19074t.m100208f(charSequence, "value");
        this.f87013v.setText(charSequence);
        RobotoTextView robotoTextView = this.f87013v;
        if (charSequence.length() == 0) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        robotoTextView.setVisibility(i11);
    }

    public final void setCustomMsgTextView(RobotoTextView robotoTextView) {
        AbstractC19074t.m100208f(robotoTextView, "<set-?>");
        this.f87013v = robotoTextView;
    }

    public final void setIconCustomMsg(ImageView imageView) {
        AbstractC19074t.m100208f(imageView, "<set-?>");
        this.f87014w = imageView;
    }

    public final void setIconMute(ImageView imageView) {
        AbstractC19074t.m100208f(imageView, "<set-?>");
        this.f87010s = imageView;
    }

    public final void setIconPin(ImageView imageView) {
        AbstractC19074t.m100208f(imageView, "<set-?>");
        this.f87011t = imageView;
    }

    public final void setIconSuggestMsg(ImageView imageView) {
        AbstractC19074t.m100208f(imageView, "<set-?>");
        this.f87016y = imageView;
    }

    public final void setName(CharSequence charSequence) {
        AbstractC19074t.m100208f(charSequence, "value");
        this.f87009r.setText(charSequence);
    }

    public final void setNameTextView(RobotoTextView robotoTextView) {
        AbstractC19074t.m100208f(robotoTextView, "<set-?>");
        this.f87009r = robotoTextView;
    }

    public final void setRlContentContainer(RelativeLayout relativeLayout) {
        AbstractC19074t.m100208f(relativeLayout, "<set-?>");
        this.f86998A = relativeLayout;
    }

    public final void setRlCustomListMsg(RelativeLayout relativeLayout) {
        AbstractC19074t.m100208f(relativeLayout, "<set-?>");
        this.f87000C = relativeLayout;
    }

    public final void setRlLine1RightSide(RelativeLayout relativeLayout) {
        AbstractC19074t.m100208f(relativeLayout, "<set-?>");
        this.f86999B = relativeLayout;
    }

    public final void setRlListMessageSingle(RelativeLayout relativeLayout) {
        AbstractC19074t.m100208f(relativeLayout, "<set-?>");
        this.f87017z = relativeLayout;
    }

    public final void setRlSuggestListMsg(RelativeLayout relativeLayout) {
        AbstractC19074t.m100208f(relativeLayout, "<set-?>");
        this.f87001D = relativeLayout;
    }

    public final void setShowCheckBox(boolean z11) {
        int i11;
        CheckBox checkBox = this.f87007p;
        if (z11) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        checkBox.setVisibility(i11);
    }

    public final void setSuggestMsg(CharSequence charSequence) {
        int i11;
        AbstractC19074t.m100208f(charSequence, "value");
        this.f87015x.setText(charSequence);
        RobotoTextView robotoTextView = this.f87015x;
        if (charSequence.length() == 0) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        robotoTextView.setVisibility(i11);
    }

    public final void setSuggestMsgTextView(RobotoTextView robotoTextView) {
        AbstractC19074t.m100208f(robotoTextView, "<set-?>");
        this.f87015x = robotoTextView;
    }

    public final void setTime(CharSequence charSequence) {
        int i11;
        AbstractC19074t.m100208f(charSequence, "value");
        this.f87012u.setText(charSequence);
        RobotoTextView robotoTextView = this.f87012u;
        if (charSequence.length() == 0) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        robotoTextView.setVisibility(i11);
    }

    public final void setTimeTextView(RobotoTextView robotoTextView) {
        AbstractC19074t.m100208f(robotoTextView, "<set-?>");
        this.f87012u = robotoTextView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListMessageSingle(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
        LayoutInflater.from(context).inflate(AbstractC2812f.item_list_message_single, this);
        View findViewById = findViewById(AbstractC2811e.cb_list_message);
        AbstractC19074t.m100207e(findViewById, "findViewById(R.id.cb_list_message)");
        this.f87007p = (CheckBox) findViewById;
        View findViewById2 = findViewById(AbstractC2811e.avatar_list_message);
        AbstractC19074t.m100207e(findViewById2, "findViewById(R.id.avatar_list_message)");
        this.f87008q = (Avatar) findViewById2;
        View findViewById3 = findViewById(AbstractC2811e.name_list_message);
        AbstractC19074t.m100207e(findViewById3, "findViewById(R.id.name_list_message)");
        this.f87009r = (RobotoTextView) findViewById3;
        View findViewById4 = findViewById(AbstractC2811e.custom_msg_list_message);
        AbstractC19074t.m100207e(findViewById4, "findViewById(R.id.custom_msg_list_message)");
        this.f87013v = (RobotoTextView) findViewById4;
        View findViewById5 = findViewById(AbstractC2811e.icon_pin_list_message);
        AbstractC19074t.m100207e(findViewById5, "findViewById(R.id.icon_pin_list_message)");
        this.f87011t = (ImageView) findViewById5;
        View findViewById6 = findViewById(AbstractC2811e.icon_mute_list_message);
        AbstractC19074t.m100207e(findViewById6, "findViewById(R.id.icon_mute_list_message)");
        this.f87010s = (ImageView) findViewById6;
        View findViewById7 = findViewById(AbstractC2811e.tv_time_list_setting);
        AbstractC19074t.m100207e(findViewById7, "findViewById(R.id.tv_time_list_setting)");
        this.f87012u = (RobotoTextView) findViewById7;
        View findViewById8 = findViewById(AbstractC2811e.custom_icon_list_message);
        AbstractC19074t.m100207e(findViewById8, "findViewById(R.id.custom_icon_list_message)");
        this.f87014w = (ImageView) findViewById8;
        View findViewById9 = findViewById(AbstractC2811e.suggest_icon_list_message);
        AbstractC19074t.m100207e(findViewById9, "findViewById(R.id.suggest_icon_list_message)");
        this.f87016y = (ImageView) findViewById9;
        View findViewById10 = findViewById(AbstractC2811e.suggest_msg_list_message);
        AbstractC19074t.m100207e(findViewById10, "findViewById(R.id.suggest_msg_list_message)");
        this.f87015x = (RobotoTextView) findViewById10;
        View findViewById11 = findViewById(AbstractC2811e.content_container_list_message);
        AbstractC19074t.m100207e(findViewById11, "findViewById(R.id.content_container_list_message)");
        this.f86998A = (RelativeLayout) findViewById11;
        View findViewById12 = findViewById(AbstractC2811e.rl_custom_msg_list_message);
        AbstractC19074t.m100207e(findViewById12, "findViewById(R.id.rl_custom_msg_list_message)");
        this.f87000C = (RelativeLayout) findViewById12;
        View findViewById13 = findViewById(AbstractC2811e.rl_list_message_line1_right_side);
        AbstractC19074t.m100207e(findViewById13, "findViewById(R.id.rl_lis…message_line1_right_side)");
        this.f86999B = (RelativeLayout) findViewById13;
        View findViewById14 = findViewById(AbstractC2811e.rl_list_message_single);
        AbstractC19074t.m100207e(findViewById14, "findViewById(R.id.rl_list_message_single)");
        this.f87017z = (RelativeLayout) findViewById14;
        View findViewById15 = findViewById(AbstractC2811e.rl_suggest_msg_list_message);
        AbstractC19074t.m100207e(findViewById15, "findViewById(R.id.rl_suggest_msg_list_message)");
        this.f87001D = (RelativeLayout) findViewById15;
        m91082c(this, attributeSet, i11, 0, 4, null);
    }

    private final void setAvatar(Drawable drawable) {
        this.f87002E = drawable;
        this.f87008q.setImageDrawable(drawable);
    }

    public final void setIconCustomMsg(Drawable drawable) {
        this.f87005H = drawable;
        this.f87014w.setImageDrawable(drawable);
        this.f87014w.setVisibility(drawable != null ? 0 : 8);
    }

    public final void setIconMute(Drawable drawable) {
        this.f87004G = drawable;
        this.f87010s.setImageDrawable(drawable);
        this.f87010s.setVisibility(drawable != null ? 0 : 8);
    }

    public final void setIconPin(Drawable drawable) {
        this.f87003F = drawable;
        this.f87011t.setImageDrawable(drawable);
        this.f87011t.setVisibility(drawable != null ? 0 : 8);
    }

    public final void setIconSuggestMsg(Drawable drawable) {
        this.f87006I = drawable;
        this.f87016y.setImageDrawable(drawable);
        this.f87016y.setVisibility(drawable != null ? 0 : 8);
    }
}
