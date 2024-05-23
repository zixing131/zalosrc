package com.zing.zalo.p077ui.widget.mini.program.actionbar;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.AbstractC8915g0;
import com.zing.zalo.p077ui.widget.C13718q1;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import fn0.AbstractC19074t;
import me0.AbstractC23136l9;
import p170fv.AbstractC19147a;
import p170fv.C19157k;
import p170fv.C19159m;
import p170fv.EnumC19152f;
import p262jb.AbstractC21196a;
import p307kv.AbstractC21954k;

/* loaded from: classes6.dex */
public final class MPNormalActionBar extends MiniProgramActionBar {

    /* renamed from: A */
    private boolean f70731A;

    /* renamed from: B */
    private EnumC19152f f70732B;

    /* renamed from: w */
    private TextView f70733w;

    /* renamed from: x */
    private Integer f70734x;

    /* renamed from: y */
    private int f70735y;

    /* renamed from: z */
    private C19159m f70736z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MPNormalActionBar(Context context) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        this.f70735y = 2;
        this.f70732B = EnumC19152f.f95191p;
        setId(AbstractC6918a0.mp_wv_normal_action_bar);
        m76428l();
    }

    /* renamed from: l */
    private final void m76428l() {
        removeAllViews();
        Integer num = this.f70734x;
        if (num != null) {
            AbstractC19074t.m100205c(num);
            setBackgroundColor(num.intValue());
        } else {
            setBackgroundResource(AbstractC16803z.stencil_bg_action_bar);
        }
        int dimension = (int) getContext().getResources().getDimension(AbstractC16802y.icon_header_mp_size_width);
        Context context = getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        RobotoTextView robotoTextView = new RobotoTextView(context);
        this.f70733w = robotoTextView;
        AbstractC19074t.m100205c(robotoTextView);
        robotoTextView.setId(AbstractC6918a0.mp_wv_tv_title_id);
        TextView textView = this.f70733w;
        AbstractC19074t.m100205c(textView);
        textView.setTextColor(m76437j(AbstractC21196a.TextColor1));
        TextView textView2 = this.f70733w;
        AbstractC19074t.m100205c(textView2);
        textView2.setSingleLine(true);
        TextView textView3 = this.f70733w;
        AbstractC19074t.m100205c(textView3);
        textView3.setLines(1);
        TextView textView4 = this.f70733w;
        AbstractC19074t.m100205c(textView4);
        textView4.setMaxLines(1);
        TextView textView5 = this.f70733w;
        AbstractC19074t.m100205c(textView5);
        textView5.setTextSize(1, 16.0f);
        TextView textView6 = this.f70733w;
        AbstractC19074t.m100205c(textView6);
        textView6.setEllipsize(TextUtils.TruncateAt.END);
        TextView textView7 = this.f70733w;
        AbstractC19074t.m100205c(textView7);
        textView7.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.app_name));
        TextView textView8 = this.f70733w;
        AbstractC19074t.m100205c(textView8);
        Context context2 = getContext();
        AbstractC19074t.m100205c(context2);
        textView8.setBackgroundColor(AbstractC23136l9.m118641B(context2, AbstractC16801x.transparent));
        TextView textView9 = this.f70733w;
        AbstractC19074t.m100205c(textView9);
        Context context3 = getContext();
        AbstractC19074t.m100207e(context3, "getContext(...)");
        textView9.setTypeface(C13718q1.m76694c(context3, 7));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(6, AbstractC6918a0.mp_wv_right_menu_container);
        layoutParams.addRule(8, AbstractC6918a0.mp_wv_right_menu_container);
        int dimension2 = (int) getContext().getResources().getDimension(AbstractC16802y.mp_action_bar_padding);
        if (this.f70732B == EnumC19152f.f95192q) {
            layoutParams.addRule(13, -1);
            layoutParams.getMarginStart();
            TextView textView10 = this.f70733w;
            AbstractC19074t.m100205c(textView10);
            textView10.setGravity(17);
            dimension2 = dimension * 2;
        } else {
            layoutParams.addRule(17, AbstractC6918a0.mp_wv_left_menu_container);
            TextView textView11 = this.f70733w;
            AbstractC19074t.m100205c(textView11);
            textView11.setGravity(8388627);
            layoutParams.addRule(16, AbstractC6918a0.mp_wv_right_menu_container);
        }
        layoutParams.setMarginStart(dimension2);
        layoutParams.setMarginEnd(dimension2);
        addView(this.f70733w, layoutParams);
        m76429m();
        LinearLayout m76436i = m76436i();
        m76436i.setId(AbstractC6918a0.mp_wv_right_menu_container);
        m76436i.addView(MiniProgramActionBar.m76434h(this, m76438k(AbstractC16781w.IconMPMenu), AbstractC6918a0.mp_wv_menu_id, dimension, 0, 0, m76438k(AbstractC16781w.BackgroundButtonMPLeftCurve), "ma_open_menu", 24, null));
        View view = new View(getContext());
        view.setBackgroundColor(m76437j(AbstractC16781w.LineViewMiniProgramColor));
        m76436i.addView(view, new RelativeLayout.LayoutParams((int) getContext().getResources().getDimension(AbstractC16802y.mp_action_bar_divider_width), (int) getContext().getResources().getDimension(AbstractC16802y.mp_action_bar_divider_height)));
        m76436i.addView(MiniProgramActionBar.m76434h(this, m76438k(AbstractC16781w.IconMPExit), AbstractC6918a0.mp_wv_exit_id, dimension, 0, 0, m76438k(AbstractC16781w.BackgroundButtonMPRightCurve), "ma_close_mini_app", 24, null));
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(21, -1);
        layoutParams2.addRule(10, -1);
        addView(m76436i, layoutParams2);
    }

    /* renamed from: m */
    private final void m76429m() {
        boolean z11;
        FrameLayout frameLayout;
        int i11 = this.f70735y;
        if ((i11 == 0 || i11 == 2) && this.f70731A) {
            z11 = true;
        } else {
            z11 = false;
        }
        int dimension = (int) getContext().getResources().getDimension(AbstractC16802y.icon_header_mp_size);
        if (z11) {
            frameLayout = new FrameLayout(getContext());
            frameLayout.addView(MiniProgramActionBar.m76434h(this, m76438k(AbstractC16781w.IconMPBack), AbstractC6918a0.mp_wv_back_id, 0, 0, 0, m76438k(AbstractC16781w.BackgroundButtonMPCurve), "mp_back_menu", 28, null), new RelativeLayout.LayoutParams(dimension, dimension));
        } else {
            frameLayout = new FrameLayout(getContext());
        }
        frameLayout.setId(AbstractC6918a0.mp_wv_left_menu_container);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(9, -1);
        layoutParams.addRule(10, -1);
        addView(frameLayout, layoutParams);
    }

    /* renamed from: n */
    public final void m76430n(boolean z11, AbstractC19147a abstractC19147a) {
        Integer num;
        boolean z12;
        int i11;
        Boolean bool;
        Integer num2;
        Integer num3;
        String str;
        int i12;
        String str2 = null;
        if (abstractC19147a != null) {
            num = abstractC19147a.m100473e();
        } else {
            num = null;
        }
        boolean z13 = true;
        if (z11 != this.f70731A) {
            this.f70731A = z11;
            z12 = true;
        } else {
            z12 = false;
        }
        int currentTheme = getCurrentTheme();
        if (!AbstractC19074t.m100204b(this.f70734x, num)) {
            this.f70734x = num;
            z12 = true;
        } else if (num == null) {
            currentTheme = AbstractC8915g0.ThemeDefault_Dark;
        } else {
            if (AbstractC21954k.Companion.m114624s(num)) {
                i11 = AbstractC8915g0.ThemeDefault_Dark;
            } else {
                i11 = AbstractC8915g0.ThemeDefault_Light;
            }
            currentTheme = i11;
        }
        if (abstractC19147a != null) {
            bool = abstractC19147a.m100478j();
        } else {
            bool = null;
        }
        if (bool != null) {
            if (AbstractC19074t.m100204b(abstractC19147a.m100478j(), Boolean.TRUE)) {
                i12 = AbstractC8915g0.ThemeDefault_Dark;
            } else {
                i12 = AbstractC8915g0.ThemeDefault_Light;
            }
            currentTheme = i12;
        }
        if (currentTheme != getCurrentTheme()) {
            setCurrentTheme(currentTheme);
            z12 = true;
        }
        if (abstractC19147a instanceof C19157k) {
            C19157k c19157k = (C19157k) abstractC19147a;
            int mo100491b = c19157k.mo100491b();
            if (mo100491b != this.f70735y) {
                this.f70735y = mo100491b;
                z12 = true;
            }
            C19159m m100498t = c19157k.m100498t();
            if (m100498t != null) {
                num2 = Integer.valueOf(m100498t.m100502a());
            } else {
                num2 = null;
            }
            C19159m c19159m = this.f70736z;
            if (c19159m != null) {
                num3 = Integer.valueOf(c19159m.m100502a());
            } else {
                num3 = null;
            }
            if (AbstractC19074t.m100204b(num2, num3)) {
                if (m100498t != null) {
                    str = m100498t.m100503b();
                } else {
                    str = null;
                }
                C19159m c19159m2 = this.f70736z;
                if (c19159m2 != null) {
                    str2 = c19159m2.m100503b();
                }
                if (AbstractC19074t.m100204b(str, str2)) {
                    z13 = z12;
                }
            }
            this.f70736z = m100498t;
            if (this.f70732B != c19157k.m100497s()) {
                this.f70732B = c19157k.m100497s();
                m76428l();
            }
            z12 = z13;
        }
        if (!z12) {
            return;
        }
        m76428l();
    }

    public final void setTitle(String str) {
        AbstractC19074t.m100208f(str, "title");
        TextView textView = this.f70733w;
        if (textView != null) {
            textView.setText(str);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MPNormalActionBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(attributeSet, "attrs");
        this.f70735y = 2;
        this.f70732B = EnumC19152f.f95191p;
        setId(AbstractC6918a0.mp_wv_normal_action_bar);
        m76428l();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MPNormalActionBar(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(attributeSet, "attrs");
        this.f70735y = 2;
        this.f70732B = EnumC19152f.f95191p;
        setId(AbstractC6918a0.mp_wv_normal_action_bar);
        m76428l();
    }
}
