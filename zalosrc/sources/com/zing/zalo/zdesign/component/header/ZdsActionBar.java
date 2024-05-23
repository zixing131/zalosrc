package com.zing.zalo.zdesign.component.header;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import bi0.AbstractC2807a;
import bi0.AbstractC2809c;
import bi0.AbstractC2810d;
import bi0.AbstractC2811e;
import bi0.AbstractC2812f;
import bi0.AbstractC2815i;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.Button;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import com.zing.zalo.zdesign.component.popover.C17033b;
import com.zing.zalo.zdesign.component.popover.C17035d;
import com.zing.zalo.zdesign.component.popover.PopoverView;
import fn0.AbstractC19074t;
import ui0.C27276c;
import zl0.AbstractC32226c;

/* loaded from: classes7.dex */
public final class ZdsActionBar extends RelativeLayout {

    /* renamed from: A */
    private C17035d f86799A;

    /* renamed from: B */
    private PopoverView f86800B;

    /* renamed from: C */
    private C17033b f86801C;

    /* renamed from: D */
    private C17035d f86802D;

    /* renamed from: E */
    private PopoverView f86803E;

    /* renamed from: F */
    private C17033b f86804F;

    /* renamed from: G */
    private C17035d f86805G;

    /* renamed from: H */
    private RobotoTextView f86806H;

    /* renamed from: I */
    private RobotoTextView f86807I;

    /* renamed from: J */
    private View f86808J;

    /* renamed from: K */
    private ViewGroup f86809K;

    /* renamed from: L */
    private ViewGroup f86810L;

    /* renamed from: M */
    private ViewGroup f86811M;

    /* renamed from: N */
    private ViewGroup f86812N;

    /* renamed from: O */
    private boolean f86813O;

    /* renamed from: P */
    private int f86814P;

    /* renamed from: Q */
    private int f86815Q;

    /* renamed from: R */
    private int f86816R;

    /* renamed from: S */
    private AbstractC16987c f86817S;

    /* renamed from: T */
    private int f86818T;

    /* renamed from: U */
    private int f86819U;

    /* renamed from: V */
    private final int f86820V;

    /* renamed from: p */
    private int f86821p;

    /* renamed from: q */
    private int f86822q;

    /* renamed from: r */
    private int f86823r;

    /* renamed from: s */
    private int f86824s;

    /* renamed from: t */
    private Button f86825t;

    /* renamed from: u */
    private Button f86826u;

    /* renamed from: v */
    private Button f86827v;

    /* renamed from: w */
    private Button f86828w;

    /* renamed from: x */
    private Button f86829x;

    /* renamed from: y */
    private PopoverView f86830y;

    /* renamed from: z */
    private C17033b f86831z;

    /* renamed from: com.zing.zalo.zdesign.component.header.ZdsActionBar$a */
    /* loaded from: classes7.dex */
    public enum EnumC16985a {
        BLUE(0),
        WHITE(1),
        TRANSPARENT(2);


        /* renamed from: p */
        private final int f86836p;

        EnumC16985a(int i11) {
            this.f86836p = i11;
        }

        /* renamed from: c */
        public final int m91010c() {
            return this.f86836p;
        }
    }

    /* renamed from: com.zing.zalo.zdesign.component.header.ZdsActionBar$b */
    /* loaded from: classes7.dex */
    public enum EnumC16986b {
        APP_TYPE(0),
        WEB_TYPE(1);


        /* renamed from: p */
        private final int f86840p;

        EnumC16986b(int i11) {
            this.f86840p = i11;
        }

        /* renamed from: c */
        public final int m91012c() {
            return this.f86840p;
        }
    }

    /* renamed from: com.zing.zalo.zdesign.component.header.ZdsActionBar$c */
    /* loaded from: classes7.dex */
    public static abstract class AbstractC16987c {
        /* renamed from: a */
        public void mo39913a() {
        }

        /* renamed from: b */
        public void mo39914b() {
        }

        /* renamed from: c */
        public void m91013c() {
        }
    }

    /* renamed from: com.zing.zalo.zdesign.component.header.ZdsActionBar$d */
    /* loaded from: classes7.dex */
    public enum EnumC16988d {
        NONE(0),
        BACK(1),
        CLOSE(2),
        DOWN(3),
        CLOSE_BACK(4),
        CUSTOM(5);


        /* renamed from: p */
        private final int f86848p;

        EnumC16988d(int i11) {
            this.f86848p = i11;
        }

        /* renamed from: c */
        public final int m91015c() {
            return this.f86848p;
        }
    }

    /* renamed from: com.zing.zalo.zdesign.component.header.ZdsActionBar$e */
    /* loaded from: classes7.dex */
    public enum EnumC16989e {
        TITLE(0),
        CUSTOM(1);


        /* renamed from: p */
        private final int f86852p;

        EnumC16989e(int i11) {
            this.f86852p = i11;
        }

        /* renamed from: c */
        public final int m91017c() {
            return this.f86852p;
        }
    }

    /* renamed from: com.zing.zalo.zdesign.component.header.ZdsActionBar$f */
    /* loaded from: classes7.dex */
    public enum EnumC16990f {
        NONE(0),
        ICON(1),
        TEXT(2),
        CUSTOM(3);


        /* renamed from: p */
        private final int f86858p;

        EnumC16990f(int i11) {
            this.f86858p = i11;
        }

        /* renamed from: c */
        public final int m91019c() {
            return this.f86858p;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ZdsActionBar(Context context) {
        this(context, null);
        AbstractC19074t.m100208f(context, "context");
    }

    /* renamed from: g */
    private final void m90994g() {
        if (this.f86831z == null) {
            this.f86831z = new C17033b(null, 1, 0 == true ? 1 : 0);
        }
    }

    /* renamed from: h */
    private final void m90995h() {
        if (this.f86801C == null) {
            this.f86801C = new C17033b(null, 1, 0 == true ? 1 : 0);
        }
    }

    /* renamed from: i */
    private final void m90996i() {
        if (this.f86804F == null) {
            this.f86804F = new C17033b(null, 1, 0 == true ? 1 : 0);
        }
    }

    /* renamed from: j */
    private final void m90997j(TypedArray typedArray) {
        View view;
        String string;
        Drawable drawable;
        String string2;
        Drawable drawable2;
        String string3;
        Drawable drawable3;
        int resourceId = typedArray.getResourceId(AbstractC2815i.ZdsActionBar_iconButtonStyle, 0);
        int resourceId2 = typedArray.getResourceId(AbstractC2815i.ZdsActionBar_textButtonStyle, 0);
        if (typedArray.hasValue(AbstractC2815i.ZdsActionBar_android_background)) {
            setBackground(typedArray.getDrawable(AbstractC2815i.ZdsActionBar_android_background));
        }
        if (typedArray.hasValue(AbstractC2815i.ZdsActionBar_backgroundType)) {
            this.f86816R = typedArray.getInt(AbstractC2815i.ZdsActionBar_backgroundType, EnumC16985a.BLUE.m91010c());
        }
        if (typedArray.hasValue(AbstractC2815i.ZdsActionBar_actionbarType)) {
            setActionBarType(typedArray.getInt(AbstractC2815i.ZdsActionBar_actionbarType, EnumC16986b.APP_TYPE.m91012c()));
        }
        Button button = this.f86825t;
        if (button != null) {
            button.m90539c(resourceId);
        }
        Button button2 = this.f86826u;
        if (button2 != null) {
            button2.m90539c(resourceId);
        }
        if (typedArray.hasValue(AbstractC2815i.ZdsActionBar_leadingType)) {
            setLeadingType(typedArray.getInt(AbstractC2815i.ZdsActionBar_leadingType, EnumC16988d.NONE.m91015c()));
        }
        if (typedArray.hasValue(AbstractC2815i.ZdsActionBar_middleTitleTextColor)) {
            setMiddleTitleTextColor(typedArray.getColor(AbstractC2815i.ZdsActionBar_middleTitleTextColor, 0));
        }
        if (typedArray.hasValue(AbstractC2815i.ZdsActionBar_middleSubtitleTextColor)) {
            setMiddleSubTitleTextColor(typedArray.getColor(AbstractC2815i.ZdsActionBar_middleSubtitleTextColor, 0));
        }
        if (typedArray.hasValue(AbstractC2815i.ZdsActionBar_middleType)) {
            setMiddleType(typedArray.getInt(AbstractC2815i.ZdsActionBar_middleType, EnumC16989e.TITLE.m91017c()));
        }
        String str = "";
        if (typedArray.hasValue(AbstractC2815i.ZdsActionBar_middleTitleText)) {
            String string4 = typedArray.getString(AbstractC2815i.ZdsActionBar_middleTitleText);
            if (string4 == null) {
                string4 = "";
            }
            setMiddleTitle(string4);
        } else {
            setMiddleTitle("");
        }
        if (typedArray.hasValue(AbstractC2815i.ZdsActionBar_middleSubTitleText)) {
            String string5 = typedArray.getString(AbstractC2815i.ZdsActionBar_middleSubTitleText);
            if (string5 != null) {
                str = string5;
            }
            setMiddleSubtitle(str);
        } else {
            setMiddleSubtitle("");
        }
        setTrailingButton1Style(resourceId);
        setTrailingButton2Style(resourceId);
        setTrailingButton3Style(resourceId);
        if (typedArray.hasValue(AbstractC2815i.ZdsActionBar_trailingType)) {
            setTrailingType(typedArray.getInt(AbstractC2815i.ZdsActionBar_trailingType, EnumC16990f.NONE.m91019c()));
        }
        if (typedArray.hasValue(AbstractC2815i.ZdsActionBar_trailingIconButton) && (drawable3 = typedArray.getDrawable(AbstractC2815i.ZdsActionBar_trailingIconButton)) != null) {
            setTrailingIconButton(drawable3);
        }
        if (typedArray.hasValue(AbstractC2815i.ZdsActionBar_idTrailingButton) && (string3 = typedArray.getString(AbstractC2815i.ZdsActionBar_idTrailingButton)) != null) {
            setIdTrailingButton(string3);
        }
        if (typedArray.hasValue(AbstractC2815i.ZdsActionBar_trailingIconButton2) && (drawable2 = typedArray.getDrawable(AbstractC2815i.ZdsActionBar_trailingIconButton2)) != null) {
            setTrailingIconButton2(drawable2);
        }
        if (typedArray.hasValue(AbstractC2815i.ZdsActionBar_idTrailingButton2) && (string2 = typedArray.getString(AbstractC2815i.ZdsActionBar_idTrailingButton2)) != null) {
            setIdTrailingButton2(string2);
        }
        if (this.f86821p == EnumC16986b.APP_TYPE.m91012c()) {
            m91008u(typedArray.getDrawable(AbstractC2815i.ZdsActionBar_middleTitleIcon), typedArray.getDrawable(AbstractC2815i.ZdsActionBar_middleTitleIcon2), typedArray.getColor(AbstractC2815i.ZdsActionBar_middleTitleIconTintColor, 0), typedArray.getColor(AbstractC2815i.ZdsActionBar_middleTitleIconTintColor2, 0));
            if (typedArray.hasValue(AbstractC2815i.ZdsActionBar_trailingIconButton3) && (drawable = typedArray.getDrawable(AbstractC2815i.ZdsActionBar_trailingIconButton3)) != null) {
                setTrailingIconButton3(drawable);
            }
            if (typedArray.hasValue(AbstractC2815i.ZdsActionBar_idTrailingButton3) && (string = typedArray.getString(AbstractC2815i.ZdsActionBar_idTrailingButton3)) != null) {
                setIdTrailingButton3(string);
            }
        }
        if (typedArray.hasValue(AbstractC2815i.ZdsActionBar_trailingTextButton)) {
            setTrailingButton1Style(resourceId2);
            String string6 = typedArray.getString(AbstractC2815i.ZdsActionBar_trailingTextButton);
            if (string6 != null) {
                setTrailingButtonText(string6);
            }
        }
        if (typedArray.hasValue(AbstractC2815i.ZdsActionBar_headerDividerColor) && (view = this.f86808J) != null) {
            view.setBackground(typedArray.getDrawable(AbstractC2815i.ZdsActionBar_headerDividerColor));
        }
        typedArray.recycle();
    }

    /* renamed from: k */
    private final void m90998k(AttributeSet attributeSet, int i11, int i12) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC2815i.ZdsActionBar, i11, i12);
        AbstractC19074t.m100207e(obtainStyledAttributes, "context.obtainStyledAttr…r, defStyle, defStyleRes)");
        m90997j(obtainStyledAttributes);
    }

    /* renamed from: l */
    static /* synthetic */ void m90999l(ZdsActionBar zdsActionBar, AttributeSet attributeSet, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = 0;
        }
        zdsActionBar.m90998k(attributeSet, i11, i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public static final void m91000m(ZdsActionBar zdsActionBar, View view) {
        AbstractC19074t.m100208f(zdsActionBar, "this$0");
        AbstractC16987c abstractC16987c = zdsActionBar.f86817S;
        if (abstractC16987c != null) {
            abstractC16987c.mo39913a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public static final void m91001n(ZdsActionBar zdsActionBar, View view) {
        AbstractC19074t.m100208f(zdsActionBar, "this$0");
        AbstractC16987c abstractC16987c = zdsActionBar.f86817S;
        if (abstractC16987c != null) {
            abstractC16987c.mo39914b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public static final void m91002p(ZdsActionBar zdsActionBar, View view) {
        AbstractC19074t.m100208f(zdsActionBar, "this$0");
        AbstractC16987c abstractC16987c = zdsActionBar.f86817S;
        if (abstractC16987c != null) {
            abstractC16987c.mo39914b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public static final void m91003q(ZdsActionBar zdsActionBar, View view) {
        AbstractC19074t.m100208f(zdsActionBar, "this$0");
        AbstractC16987c abstractC16987c = zdsActionBar.f86817S;
        if (abstractC16987c != null) {
            abstractC16987c.mo39913a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public static final void m91004r(ZdsActionBar zdsActionBar, View view) {
        AbstractC19074t.m100208f(zdsActionBar, "this$0");
        AbstractC16987c abstractC16987c = zdsActionBar.f86817S;
        if (abstractC16987c != null) {
            abstractC16987c.m91013c();
        }
    }

    /* renamed from: v */
    private final void m91005v() {
        int i11 = this.f86815Q;
        int m155409h = AbstractC32226c.m155409h(getRootView());
        this.f86815Q = m155409h;
        if (m155409h != i11) {
            requestLayout();
        }
    }

    /* renamed from: f */
    public final void m91006f(Context context, int i11) {
        AbstractC19074t.m100208f(context, "context");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i11, AbstractC2815i.ZdsActionBar);
        AbstractC19074t.m100207e(obtainStyledAttributes, "context.obtainStyledAttr…R.styleable.ZdsActionBar)");
        m90997j(obtainStyledAttributes);
    }

    public final int getActionBarHeight() {
        return this.f86814P;
    }

    public final int getActionBarType() {
        return this.f86821p;
    }

    public final int getBackgroundType() {
        return this.f86816R;
    }

    public final View getDivider() {
        return this.f86808J;
    }

    public final Button getLeadingButton() {
        return this.f86825t;
    }

    public final Button getLeadingButton2() {
        return this.f86826u;
    }

    public final int getLeadingType() {
        return this.f86822q;
    }

    public final String getMiddleSubtitle() {
        CharSequence charSequence;
        RobotoTextView robotoTextView = this.f86807I;
        if (robotoTextView != null) {
            charSequence = robotoTextView.getText();
        } else {
            charSequence = null;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        return (String) charSequence;
    }

    public final String getMiddleTitle() {
        CharSequence charSequence;
        RobotoTextView robotoTextView = this.f86806H;
        if (robotoTextView != null) {
            charSequence = robotoTextView.getText();
        } else {
            charSequence = null;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        return (String) charSequence;
    }

    public final int getMiddleType() {
        return this.f86823r;
    }

    public final int getTopInset() {
        if (this.f86813O) {
            return this.f86815Q;
        }
        return 0;
    }

    public final Button getTrailingButton() {
        return this.f86827v;
    }

    public final Button getTrailingButton2() {
        return this.f86828w;
    }

    public final Button getTrailingButton3() {
        return this.f86829x;
    }

    public final String getTrailingButtonText() {
        Button button;
        Object obj = "";
        if (this.f86824s != EnumC16990f.TEXT.m91019c() || (button = this.f86827v) == null) {
            return "";
        }
        Object text = button.getText();
        if (text != null) {
            obj = text;
        }
        return obj.toString();
    }

    public final PopoverView<Object> getTrailingMenu() {
        return this.f86830y;
    }

    public final PopoverView<Object> getTrailingMenu2() {
        return this.f86800B;
    }

    public final PopoverView<Object> getTrailingMenu3() {
        return this.f86803E;
    }

    public final int getTrailingType() {
        return this.f86824s;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        m91005v();
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int i15 = (this.f86814P - this.f86818T) / 2;
        int topInset = getTopInset();
        int i16 = i12 + topInset + i15;
        int i17 = this.f86814P + topInset;
        ViewGroup viewGroup = this.f86812N;
        viewGroup.layout(viewGroup.getLeft(), i16, this.f86812N.getLeft() + this.f86812N.getMeasuredWidth(), this.f86812N.getMeasuredHeight() + i16);
        View view = this.f86808J;
        if (view != null) {
            view.layout(this.f86812N.getLeft(), i17 - this.f86819U, this.f86812N.getLeft() + this.f86812N.getMeasuredWidth(), i17);
        }
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        super.onMeasure(i11, View.MeasureSpec.makeMeasureSpec(this.f86814P + getTopInset(), 1073741824));
    }

    /* renamed from: s */
    public final void m91007s(String str, String str2) {
        AbstractC19074t.m100208f(str, "title");
        AbstractC19074t.m100208f(str2, "subTitle");
        if (this.f86823r == EnumC16989e.TITLE.m91017c()) {
            if (str.length() > 0) {
                RobotoTextView robotoTextView = this.f86806H;
                if (robotoTextView != null) {
                    robotoTextView.setVisibility(0);
                    robotoTextView.setText(str);
                }
            } else {
                RobotoTextView robotoTextView2 = this.f86806H;
                if (robotoTextView2 != null) {
                    robotoTextView2.setVisibility(8);
                }
            }
            if (str2.length() > 0) {
                RobotoTextView robotoTextView3 = this.f86807I;
                if (robotoTextView3 != null) {
                    robotoTextView3.setVisibility(0);
                    robotoTextView3.setText(str2);
                    return;
                }
                return;
            }
            RobotoTextView robotoTextView4 = this.f86807I;
            if (robotoTextView4 != null) {
                robotoTextView4.setVisibility(8);
            }
        }
    }

    public final void setActionBarType(int i11) {
        this.f86821p = i11;
        if (i11 == EnumC16986b.APP_TYPE.m91012c()) {
            ViewGroup viewGroup = this.f86810L;
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(1, AbstractC2811e.leading_container);
            layoutParams.addRule(0, AbstractC2811e.trailing_container);
            Context context = getContext();
            AbstractC19074t.m100207e(context, "context");
            layoutParams.leftMargin = C27276c.m139649b(context, 4);
            viewGroup.setLayoutParams(layoutParams);
            ViewGroup viewGroup2 = this.f86809K;
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
            Context context2 = getContext();
            AbstractC19074t.m100207e(context2, "context");
            layoutParams2.leftMargin = C27276c.m139649b(context2, 8);
            Context context3 = getContext();
            AbstractC19074t.m100207e(context3, "context");
            layoutParams2.bottomMargin = C27276c.m139649b(context3, 4);
            Context context4 = getContext();
            AbstractC19074t.m100207e(context4, "context");
            layoutParams2.topMargin = C27276c.m139649b(context4, 4);
            setGravity(16);
            layoutParams2.addRule(20, -1);
            layoutParams2.addRule(15, -1);
            viewGroup2.setLayoutParams(layoutParams2);
            return;
        }
        if (i11 == EnumC16986b.WEB_TYPE.m91012c()) {
            ViewGroup viewGroup3 = this.f86810L;
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams3.addRule(13, -1);
            viewGroup3.setLayoutParams(layoutParams3);
            ViewGroup viewGroup4 = this.f86809K;
            RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
            Context context5 = getContext();
            AbstractC19074t.m100207e(context5, "context");
            layoutParams4.leftMargin = C27276c.m139649b(context5, 8);
            Context context6 = getContext();
            AbstractC19074t.m100207e(context6, "context");
            layoutParams4.rightMargin = C27276c.m139649b(context6, 16);
            Context context7 = getContext();
            AbstractC19074t.m100207e(context7, "context");
            layoutParams4.bottomMargin = C27276c.m139649b(context7, 4);
            Context context8 = getContext();
            AbstractC19074t.m100207e(context8, "context");
            layoutParams4.topMargin = C27276c.m139649b(context8, 4);
            setGravity(16);
            layoutParams4.addRule(20, -1);
            layoutParams4.addRule(15, -1);
            viewGroup4.setLayoutParams(layoutParams4);
        }
    }

    public final void setActionbarHeight(int i11) {
        Context context = getContext();
        AbstractC19074t.m100207e(context, "context");
        this.f86814P = C27276c.m139649b(context, i11);
        requestLayout();
    }

    public final void setCustomLeadingItem(View view) {
        AbstractC19074t.m100208f(view, "view");
        if (view.getParent() != null && (view.getParent() instanceof ViewGroup)) {
            ViewParent parent = view.getParent();
            AbstractC19074t.m100206d(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) parent).removeView(view);
        }
        this.f86809K.addView(view);
    }

    public final void setCustomMiddleItem(View view) {
        AbstractC19074t.m100208f(view, "view");
        if (view.getParent() != null && (view.getParent() instanceof ViewGroup)) {
            ViewParent parent = view.getParent();
            AbstractC19074t.m100206d(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) parent).removeView(view);
        }
        this.f86810L.addView(view);
    }

    public final void setCustomTrailingItem(View view) {
        AbstractC19074t.m100208f(view, "view");
        if (view.getParent() != null && (view.getParent() instanceof ViewGroup)) {
            ViewParent parent = view.getParent();
            AbstractC19074t.m100206d(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) parent).removeView(view);
        }
        this.f86811M.addView(view);
    }

    public final void setEnableTrailingButton(boolean z11) {
        Button button = this.f86827v;
        if (button != null) {
            button.setEnabled(z11);
        }
    }

    public final void setEnableTrailingButton2(boolean z11) {
        Button button = this.f86828w;
        if (button != null) {
            button.setEnabled(z11);
        }
    }

    public final void setEnableTrailingButton3(boolean z11) {
        Button button = this.f86829x;
        if (button != null) {
            button.setEnabled(z11);
        }
    }

    public final void setIdTrailingButton(String str) {
        AbstractC19074t.m100208f(str, "id");
        Button button = this.f86827v;
        if (button != null) {
            button.setIdTracking(str);
        }
    }

    public final void setIdTrailingButton2(String str) {
        AbstractC19074t.m100208f(str, "id");
        Button button = this.f86828w;
        if (button != null) {
            button.setIdTracking(str);
        }
    }

    public final void setIdTrailingButton3(String str) {
        AbstractC19074t.m100208f(str, "id");
        Button button = this.f86829x;
        if (button != null) {
            button.setIdTracking(str);
        }
    }

    public final void setLeadingButton1Color(int i11) {
        Button button = this.f86825t;
        if (button != null) {
            button.setSupportiveIconTintColor(ColorStateList.valueOf(i11));
        }
    }

    public final void setLeadingButton1Style(int i11) {
        Button button = this.f86825t;
        if (button != null && button.getVisibility() == 0) {
            button.m90539c(i11);
        }
    }

    public final void setLeadingButton2Color(int i11) {
        Button button = this.f86826u;
        if (button != null) {
            button.setSupportiveIconTintColor(ColorStateList.valueOf(i11));
        }
    }

    public final void setLeadingButton2Style(int i11) {
        Button button = this.f86826u;
        if (button != null && button.getVisibility() == 0) {
            button.m90539c(i11);
        }
    }

    public final void setLeadingFunctionCallback(AbstractC16987c abstractC16987c) {
        AbstractC19074t.m100208f(abstractC16987c, "callback");
        this.f86817S = abstractC16987c;
    }

    public final void setLeadingType(int i11) {
        this.f86822q = i11;
        this.f86809K.setVisibility(0);
        int i12 = this.f86822q;
        if (i12 == EnumC16988d.NONE.m91015c()) {
            this.f86809K.setVisibility(8);
            if (this.f86821p == EnumC16986b.APP_TYPE.m91012c() && (this.f86810L.getLayoutParams() instanceof RelativeLayout.LayoutParams)) {
                ViewGroup.LayoutParams layoutParams = this.f86810L.getLayoutParams();
                AbstractC19074t.m100206d(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                Context context = getContext();
                AbstractC19074t.m100207e(context, "context");
                ((RelativeLayout.LayoutParams) layoutParams).leftMargin = C27276c.m139649b(context, 8);
                return;
            }
            return;
        }
        if (i12 == EnumC16988d.BACK.m91015c()) {
            if (this.f86821p == EnumC16986b.APP_TYPE.m91012c()) {
                Button button = this.f86826u;
                if (button != null) {
                    button.setVisibility(8);
                }
                Button button2 = this.f86825t;
                if (button2 != null) {
                    button2.setVisibility(0);
                    button2.setSupportiveIcon(AbstractC2810d.zds_ic_arrow_left_line_24);
                    button2.setIdTracking("leading_back_btn_id");
                    button2.setOnClickListener(new View.OnClickListener() { // from class: gi0.b
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            ZdsActionBar.m91000m(ZdsActionBar.this, view);
                        }
                    });
                    return;
                }
                return;
            }
            this.f86809K.setVisibility(8);
            return;
        }
        if (i12 == EnumC16988d.CLOSE.m91015c()) {
            Button button3 = this.f86826u;
            if (button3 != null) {
                button3.setVisibility(8);
            }
            Button button4 = this.f86825t;
            if (button4 != null) {
                button4.setVisibility(0);
                button4.setSupportiveIcon(AbstractC2810d.zds_ic_close_line_24);
                button4.setIdTracking("leading_close_btn_id");
                button4.setOnClickListener(new View.OnClickListener() { // from class: gi0.c
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ZdsActionBar.m91001n(ZdsActionBar.this, view);
                    }
                });
                return;
            }
            return;
        }
        if (i12 == EnumC16988d.CLOSE_BACK.m91015c()) {
            if (this.f86821p == EnumC16986b.WEB_TYPE.m91012c()) {
                Button button5 = this.f86825t;
                if (button5 != null) {
                    button5.setVisibility(0);
                    button5.setSupportiveIcon(AbstractC2810d.zds_ic_close_line_24);
                    button5.setIdTracking("leading_close_btn_id");
                    button5.setOnClickListener(new View.OnClickListener() { // from class: gi0.d
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            ZdsActionBar.m91002p(ZdsActionBar.this, view);
                        }
                    });
                }
                Button button6 = this.f86826u;
                if (button6 != null) {
                    button6.setVisibility(0);
                    button6.setSupportiveIcon(AbstractC2810d.zds_ic_arrow_left_line_24);
                    button6.setIdTracking("leading_back_btn_id");
                    button6.setOnClickListener(new View.OnClickListener() { // from class: gi0.e
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            ZdsActionBar.m91003q(ZdsActionBar.this, view);
                        }
                    });
                    return;
                }
                return;
            }
            this.f86809K.setVisibility(8);
            return;
        }
        if (i12 == EnumC16988d.DOWN.m91015c()) {
            if (this.f86821p == EnumC16986b.APP_TYPE.m91012c()) {
                Button button7 = this.f86826u;
                if (button7 != null) {
                    button7.setVisibility(8);
                }
                Button button8 = this.f86825t;
                if (button8 != null) {
                    button8.setVisibility(0);
                    button8.setSupportiveIcon(AbstractC2810d.zds_ic_chevron_down_line_24);
                    button8.setIdTracking("leading_down_btn_id");
                    button8.setOnClickListener(new View.OnClickListener() { // from class: gi0.f
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            ZdsActionBar.m91004r(ZdsActionBar.this, view);
                        }
                    });
                    return;
                }
                return;
            }
            this.f86809K.setVisibility(8);
            return;
        }
        if (i12 == EnumC16988d.CUSTOM.m91015c()) {
            Button button9 = this.f86825t;
            if (button9 != null) {
                button9.setVisibility(8);
            }
            Button button10 = this.f86826u;
            if (button10 != null) {
                button10.setVisibility(8);
            }
        }
    }

    public final void setMiddleSubTitleTextColor(int i11) {
        RobotoTextView robotoTextView = this.f86807I;
        if (robotoTextView != null) {
            robotoTextView.setTextColor(i11);
        }
    }

    public final void setMiddleSubtitle(String str) {
        AbstractC19074t.m100208f(str, "subTitle");
        if (this.f86823r == EnumC16989e.TITLE.m91017c()) {
            if (str.length() > 0) {
                RobotoTextView robotoTextView = this.f86807I;
                if (robotoTextView != null) {
                    robotoTextView.setVisibility(0);
                    robotoTextView.setText(str);
                    return;
                }
                return;
            }
            RobotoTextView robotoTextView2 = this.f86807I;
            if (robotoTextView2 != null) {
                robotoTextView2.setVisibility(8);
            }
        }
    }

    public final void setMiddleTitle(String str) {
        AbstractC19074t.m100208f(str, "title");
        if (this.f86823r == EnumC16989e.TITLE.m91017c()) {
            if (str.length() > 0) {
                RobotoTextView robotoTextView = this.f86806H;
                if (robotoTextView != null) {
                    robotoTextView.setVisibility(0);
                    robotoTextView.setText(str);
                    return;
                }
                return;
            }
            RobotoTextView robotoTextView2 = this.f86806H;
            if (robotoTextView2 != null) {
                robotoTextView2.setVisibility(8);
            }
        }
    }

    public final void setMiddleTitleTextColor(int i11) {
        RobotoTextView robotoTextView = this.f86806H;
        if (robotoTextView != null) {
            robotoTextView.setTextColor(i11);
        }
    }

    public final void setMiddleType(int i11) {
        this.f86823r = i11;
        RobotoTextView robotoTextView = this.f86806H;
        if (robotoTextView != null) {
            robotoTextView.setVisibility(8);
        }
        RobotoTextView robotoTextView2 = this.f86807I;
        if (robotoTextView2 != null) {
            robotoTextView2.setVisibility(8);
        }
        if (this.f86823r == EnumC16989e.TITLE.m91017c()) {
            RobotoTextView robotoTextView3 = this.f86806H;
            if (robotoTextView3 != null) {
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                if (this.f86821p == EnumC16986b.APP_TYPE.m91012c()) {
                    layoutParams.addRule(9, -1);
                } else if (this.f86821p == EnumC16986b.WEB_TYPE.m91012c()) {
                    layoutParams.addRule(14, -1);
                }
                robotoTextView3.setLayoutParams(layoutParams);
                robotoTextView3.setVisibility(0);
            }
            RobotoTextView robotoTextView4 = this.f86807I;
            if (robotoTextView4 != null) {
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams2.addRule(3, AbstractC2811e.txtTitle);
                if (this.f86821p == EnumC16986b.APP_TYPE.m91012c()) {
                    layoutParams2.addRule(9, -1);
                } else if (this.f86821p == EnumC16986b.WEB_TYPE.m91012c()) {
                    layoutParams2.addRule(14, -1);
                }
                robotoTextView4.setLayoutParams(layoutParams2);
                robotoTextView4.setVisibility(0);
                return;
            }
            return;
        }
        EnumC16989e.CUSTOM.m91017c();
    }

    public final void setOccupyStatusBar(boolean z11) {
        this.f86813O = z11;
    }

    public final void setOnClickListenerTrailingButton(View.OnClickListener onClickListener) {
        Button button = this.f86827v;
        if (button != null) {
            button.setOnClickListener(onClickListener);
        }
    }

    public final void setOnClickListenerTrailingButton2(View.OnClickListener onClickListener) {
        Button button = this.f86828w;
        if (button != null) {
            button.setOnClickListener(onClickListener);
        }
    }

    public final void setOnClickListenerTrailingButton3(View.OnClickListener onClickListener) {
        Button button = this.f86829x;
        if (button != null) {
            button.setOnClickListener(onClickListener);
        }
    }

    public final void setOnMenuItemClickTrailingButton(C17033b.b bVar) {
        AbstractC19074t.m100208f(bVar, "onItemClickListener");
        m90994g();
        C17033b c17033b = this.f86831z;
        AbstractC19074t.m100205c(c17033b);
        c17033b.m91192R(bVar);
    }

    public final void setOnMenuItemClickTrailingButton2(C17033b.b bVar) {
        AbstractC19074t.m100208f(bVar, "onItemClickListener");
        m90995h();
        C17033b c17033b = this.f86801C;
        AbstractC19074t.m100205c(c17033b);
        c17033b.m91192R(bVar);
    }

    public final void setOnMenuItemClickTrailingButton3(C17033b.b bVar) {
        AbstractC19074t.m100208f(bVar, "onItemClickListener");
        m90996i();
        C17033b c17033b = this.f86804F;
        AbstractC19074t.m100205c(c17033b);
        c17033b.m91192R(bVar);
    }

    public final void setTrailingButton1Color(int i11) {
        Button button = this.f86827v;
        if (button != null) {
            button.setSupportiveIconTintColor(ColorStateList.valueOf(i11));
        }
    }

    public final void setTrailingButton1Style(int i11) {
        Button button = this.f86827v;
        if (button != null) {
            button.m90539c(i11);
        }
    }

    public final void setTrailingButton2Color(int i11) {
        Button button = this.f86828w;
        if (button != null) {
            button.setSupportiveIconTintColor(ColorStateList.valueOf(i11));
        }
    }

    public final void setTrailingButton2Style(int i11) {
        Button button = this.f86828w;
        if (button != null) {
            button.m90539c(i11);
        }
    }

    public final void setTrailingButton3Color(int i11) {
        Button button = this.f86829x;
        if (button != null) {
            button.setSupportiveIconTintColor(ColorStateList.valueOf(i11));
        }
    }

    public final void setTrailingButton3Style(int i11) {
        Button button = this.f86829x;
        if (button != null) {
            button.m90539c(i11);
        }
    }

    public final void setTrailingButtonText(String str) {
        Button button;
        AbstractC19074t.m100208f(str, "trailingText");
        if (this.f86824s == EnumC16990f.TEXT.m91019c() && (button = this.f86827v) != null) {
            if (!TextUtils.isEmpty(str)) {
                button.setVisibility(0);
                button.setText(str);
                button.setSupportiveIcon((Drawable) null);
                return;
            }
            button.setVisibility(8);
        }
    }

    public final void setTrailingIconButton(Drawable drawable) {
        Button button;
        AbstractC19074t.m100208f(drawable, "icon");
        if (this.f86824s == EnumC16990f.ICON.m91019c() && (button = this.f86827v) != null) {
            button.setVisibility(0);
            button.setSupportiveIcon(drawable);
            button.setText("");
        }
    }

    public final void setTrailingIconButton2(Drawable drawable) {
        Button button;
        AbstractC19074t.m100208f(drawable, "icon");
        if (this.f86824s == EnumC16990f.ICON.m91019c() && (button = this.f86828w) != null) {
            button.setVisibility(0);
            button.setSupportiveIcon(drawable);
            button.setText("");
        }
    }

    public final void setTrailingIconButton3(Drawable drawable) {
        Button button;
        AbstractC19074t.m100208f(drawable, "icon");
        if (this.f86824s == EnumC16990f.ICON.m91019c() && (button = this.f86829x) != null) {
            button.setVisibility(0);
            button.setSupportiveIcon(drawable);
            button.setText("");
        }
    }

    public final void setTrailingMenuConfigs(C17035d c17035d) {
        AbstractC19074t.m100208f(c17035d, "customConfigs");
        this.f86799A = c17035d;
        PopoverView popoverView = this.f86830y;
        if (popoverView != null && this.f86831z != null && popoverView != null) {
            AbstractC19074t.m100205c(c17035d);
            popoverView.m91178H(c17035d, this.f86831z);
        }
    }

    public final void setTrailingMenuConfigs2(C17035d c17035d) {
        AbstractC19074t.m100208f(c17035d, "customConfigs");
        this.f86802D = c17035d;
        PopoverView popoverView = this.f86800B;
        if (popoverView != null && this.f86801C != null && popoverView != null) {
            AbstractC19074t.m100205c(c17035d);
            popoverView.m91178H(c17035d, this.f86801C);
        }
    }

    public final void setTrailingMenuConfigs3(C17035d c17035d) {
        AbstractC19074t.m100208f(c17035d, "customConfigs");
        this.f86805G = c17035d;
        PopoverView popoverView = this.f86803E;
        if (popoverView != null && this.f86804F != null && popoverView != null) {
            AbstractC19074t.m100205c(c17035d);
            popoverView.m91178H(c17035d, this.f86804F);
        }
    }

    public final void setTrailingType(int i11) {
        int i12;
        this.f86824s = i11;
        ViewGroup viewGroup = this.f86811M;
        EnumC16990f enumC16990f = EnumC16990f.NONE;
        if (i11 == enumC16990f.m91019c()) {
            i12 = 8;
        } else {
            i12 = 0;
        }
        viewGroup.setVisibility(i12);
        Button button = this.f86827v;
        if (button != null) {
            button.setVisibility(8);
        }
        Button button2 = this.f86828w;
        if (button2 != null) {
            button2.setVisibility(8);
        }
        Button button3 = this.f86829x;
        if (button3 != null) {
            button3.setVisibility(8);
        }
        if (this.f86824s == enumC16990f.m91019c() && this.f86821p == EnumC16986b.APP_TYPE.m91012c() && (this.f86810L.getLayoutParams() instanceof RelativeLayout.LayoutParams)) {
            ViewGroup.LayoutParams layoutParams = this.f86810L.getLayoutParams();
            AbstractC19074t.m100206d(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            Context context = getContext();
            AbstractC19074t.m100207e(context, "context");
            ((RelativeLayout.LayoutParams) layoutParams).rightMargin = C27276c.m139649b(context, 16);
        }
    }

    /* renamed from: u */
    public final void m91008u(Drawable drawable, Drawable drawable2, int i11, int i12) {
        RobotoTextView robotoTextView;
        if (this.f86823r == EnumC16989e.TITLE.m91017c() && (robotoTextView = this.f86806H) != null) {
            if (drawable != null) {
                drawable.setTint(i11);
            }
            if (drawable != null) {
                Context context = robotoTextView.getContext();
                AbstractC19074t.m100207e(context, "context");
                int m139649b = C27276c.m139649b(context, 16);
                Context context2 = robotoTextView.getContext();
                AbstractC19074t.m100207e(context2, "context");
                drawable.setBounds(0, 0, m139649b, C27276c.m139649b(context2, 16));
            }
            if (drawable2 != null) {
                drawable2.setTint(i12);
            }
            if (drawable2 != null) {
                Context context3 = robotoTextView.getContext();
                AbstractC19074t.m100207e(context3, "context");
                int m139649b2 = C27276c.m139649b(context3, 16);
                Context context4 = robotoTextView.getContext();
                AbstractC19074t.m100207e(context4, "context");
                drawable2.setBounds(0, 0, m139649b2, C27276c.m139649b(context4, 16));
            }
            robotoTextView.setCompoundDrawables(drawable, null, drawable2, null);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ZdsActionBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC2807a.headerDefaultStyle);
        AbstractC19074t.m100208f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZdsActionBar(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
        this.f86821p = EnumC16986b.APP_TYPE.m91012c();
        this.f86822q = EnumC16988d.NONE.m91015c();
        this.f86823r = EnumC16989e.TITLE.m91017c();
        this.f86824s = EnumC16990f.NONE.m91019c();
        this.f86813O = true;
        this.f86816R = EnumC16985a.BLUE.m91010c();
        Context context2 = getContext();
        AbstractC19074t.m100207e(context2, "context");
        this.f86820V = C27276c.m139649b(context2, 8);
        this.f86818T = context.getResources().getDimensionPixelSize(AbstractC2809c.header_bar_height);
        this.f86819U = C27276c.m139648a(context, 0.5f);
        this.f86814P = this.f86818T;
        LayoutInflater.from(context).inflate(AbstractC2812f.zds_action_bar_layout, this);
        View findViewById = findViewById(AbstractC2811e.actionbar_container);
        AbstractC19074t.m100207e(findViewById, "findViewById(R.id.actionbar_container)");
        this.f86812N = (ViewGroup) findViewById;
        View findViewById2 = findViewById(AbstractC2811e.leading_container);
        AbstractC19074t.m100207e(findViewById2, "findViewById(R.id.leading_container)");
        this.f86809K = (ViewGroup) findViewById2;
        View findViewById3 = findViewById(AbstractC2811e.middle_container);
        AbstractC19074t.m100207e(findViewById3, "findViewById(R.id.middle_container)");
        this.f86810L = (ViewGroup) findViewById3;
        View findViewById4 = findViewById(AbstractC2811e.trailing_container);
        AbstractC19074t.m100207e(findViewById4, "findViewById(R.id.trailing_container)");
        this.f86811M = (ViewGroup) findViewById4;
        this.f86825t = (Button) this.f86809K.findViewById(AbstractC2811e.btn_leading_1);
        this.f86826u = (Button) this.f86809K.findViewById(AbstractC2811e.btn_leading_2);
        this.f86827v = (Button) this.f86811M.findViewById(AbstractC2811e.btn_trailing_1);
        this.f86828w = (Button) this.f86811M.findViewById(AbstractC2811e.btn_trailing_2);
        this.f86829x = (Button) this.f86811M.findViewById(AbstractC2811e.btn_trailing_3);
        this.f86806H = (RobotoTextView) this.f86810L.findViewById(AbstractC2811e.txtTitle);
        this.f86807I = (RobotoTextView) this.f86810L.findViewById(AbstractC2811e.txtSubTitle);
        this.f86808J = new View(context);
        addView(this.f86808J, new RelativeLayout.LayoutParams(-1, this.f86819U));
        m90999l(this, attributeSet, i11, 0, 4, null);
    }
}
