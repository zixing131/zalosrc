package com.zing.zalo.zdesign.component.chip;

import ac.C0708i;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.C1295c;
import androidx.constraintlayout.widget.ConstraintLayout;
import bi0.AbstractC2809c;
import bi0.AbstractC2811e;
import bi0.AbstractC2812f;
import bi0.AbstractC2815i;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.Badge;
import com.zing.zalo.zdesign.component.C16974f;
import com.zing.zalo.zdesign.component.EnumC16980h;
import com.zing.zalo.zdesign.component.EnumC16991i;
import com.zing.zalo.zdesign.component.InterfaceC16976f1;
import com.zing.zalo.zdesign.component.TrackingImageView;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import fn0.AbstractC19074t;
import java.lang.ref.WeakReference;
import ri0.C25808b;
import ti0.C26705d;
import ti0.C26708g;

/* loaded from: classes7.dex */
public abstract class ZdsChip extends FrameLayout implements InterfaceC16976f1 {

    /* renamed from: A */
    private View f86606A;

    /* renamed from: B */
    private RobotoTextView f86607B;

    /* renamed from: C */
    private Badge f86608C;

    /* renamed from: D */
    private int f86609D;

    /* renamed from: E */
    private int f86610E;

    /* renamed from: F */
    private int f86611F;

    /* renamed from: G */
    private int f86612G;

    /* renamed from: H */
    private int f86613H;

    /* renamed from: I */
    private int f86614I;

    /* renamed from: J */
    private int f86615J;

    /* renamed from: K */
    private int f86616K;

    /* renamed from: L */
    private int f86617L;

    /* renamed from: M */
    private int f86618M;

    /* renamed from: N */
    private int f86619N;

    /* renamed from: O */
    private int f86620O;

    /* renamed from: P */
    private int f86621P;

    /* renamed from: Q */
    private int f86622Q;

    /* renamed from: R */
    private int f86623R;

    /* renamed from: S */
    private int f86624S;

    /* renamed from: T */
    private int f86625T;

    /* renamed from: U */
    private boolean f86626U;

    /* renamed from: V */
    private boolean f86627V;

    /* renamed from: W */
    private int f86628W;

    /* renamed from: a0 */
    private boolean f86629a0;

    /* renamed from: p */
    private C25808b f86630p;

    /* renamed from: q */
    private int f86631q;

    /* renamed from: r */
    private int f86632r;

    /* renamed from: s */
    private int f86633s;

    /* renamed from: t */
    private ConstraintLayout f86634t;

    /* renamed from: u */
    private LinearLayout f86635u;

    /* renamed from: v */
    private ViewGroup f86636v;

    /* renamed from: w */
    private ViewGroup f86637w;

    /* renamed from: x */
    private ViewGroup f86638x;

    /* renamed from: y */
    private TrackingImageView f86639y;

    /* renamed from: z */
    private View f86640z;

    /* renamed from: com.zing.zalo.zdesign.component.chip.ZdsChip$a */
    /* loaded from: classes7.dex */
    public enum EnumC16962a {
        TAB_CHIP(0),
        INPUT_CHIP(1),
        CHOICE_CHIP(2),
        ACTION_CHIP(3);


        /* renamed from: p */
        private final int f86646p;

        EnumC16962a(int i11) {
            this.f86646p = i11;
        }

        /* renamed from: c */
        public final int m90842c() {
            return this.f86646p;
        }
    }

    /* renamed from: com.zing.zalo.zdesign.component.chip.ZdsChip$b */
    /* loaded from: classes7.dex */
    public enum EnumC16963b {
        NONE(0),
        AVATAR(1),
        ICON(2),
        CUSTOM(3);


        /* renamed from: p */
        private final int f86652p;

        EnumC16963b(int i11) {
            this.f86652p = i11;
        }

        /* renamed from: c */
        public final int m90844c() {
            return this.f86652p;
        }
    }

    /* renamed from: com.zing.zalo.zdesign.component.chip.ZdsChip$c */
    /* loaded from: classes7.dex */
    public enum EnumC16964c {
        NONE(0),
        TEXT(1),
        BUTTON(2),
        CUSTOM(3);


        /* renamed from: p */
        private final int f86658p;

        EnumC16964c(int i11) {
            this.f86658p = i11;
        }

        /* renamed from: c */
        public final int m90846c() {
            return this.f86658p;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ZdsChip(Context context) {
        this(context, null);
        AbstractC19074t.m100208f(context, "context");
    }

    /* renamed from: g */
    private final void m90828g(AttributeSet attributeSet, int i11, int i12) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC2815i.ZdsChip, i11, i12);
        AbstractC19074t.m100207e(obtainStyledAttributes, "context.obtainStyledAttr…p, defStyle, defStyleRes)");
        mo90835f(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: h */
    static /* synthetic */ void m90829h(ZdsChip zdsChip, AttributeSet attributeSet, int i11, int i12, int i13, Object obj) {
        if (obj == null) {
            if ((i13 & 2) != 0) {
                i11 = 0;
            }
            if ((i13 & 4) != 0) {
                i12 = 0;
            }
            zdsChip.m90828g(attributeSet, i11, i12);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: parseAttributes");
    }

    /* renamed from: a */
    public void mo90830a() {
        RobotoTextView robotoTextView = this.f86607B;
        if (robotoTextView != null) {
            Context context = robotoTextView.getContext();
            AbstractC19074t.m100207e(context, "context");
            new C26708g(robotoTextView).m137319a(C26705d.m137293a(context, this.f86609D));
            robotoTextView.setTextColor(this.f86614I);
        }
        TrackingImageView trackingImageView = this.f86639y;
        if (trackingImageView != null) {
            trackingImageView.setColorFilter(this.f86618M);
        }
    }

    /* renamed from: b */
    public final void m90831b(boolean z11) {
        int i11;
        Badge badge = this.f86608C;
        if (badge != null) {
            if (z11) {
                i11 = 0;
            } else {
                i11 = 4;
            }
            badge.setVisibility(i11);
        }
    }

    /* renamed from: c */
    public void mo90832c() {
        Context context = getContext();
        AbstractC19074t.m100207e(context, "context");
        Badge badge = new Badge(context);
        new C1295c().m6456p(this.f86634t);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.rightMargin = badge.getResources().getDimensionPixelSize(AbstractC2809c.chip_badge_marginRight);
        layoutParams.topMargin = badge.getResources().getDimensionPixelSize(AbstractC2809c.chip_badge_marginTop);
        layoutParams.gravity = 53;
        badge.setLayoutParams(layoutParams);
        Context context2 = badge.getContext();
        AbstractC19074t.m100207e(context2, "context");
        C16974f c16974f = new C16974f(context2);
        c16974f.m90971u(EnumC16980h.SIZE_8);
        c16974f.m90974x(EnumC16991i.NEW_DOT);
        c16974f.m90970t(true);
        badge.m90493g(c16974f);
        badge.setVisibility(4);
        this.f86608C = badge;
        addView(badge);
    }

    /* renamed from: d */
    public final boolean m90833d() {
        return this.f86626U;
    }

    /* renamed from: e */
    public final boolean m90834e() {
        return this.f86627V;
    }

    /* renamed from: f */
    public void mo90835f(TypedArray typedArray) {
        Drawable drawable;
        AbstractC19074t.m100208f(typedArray, "typedArray");
        setChipLeadingType(typedArray.getInt(AbstractC2815i.ZdsChip_chipLeadingType, EnumC16963b.NONE.m90844c()));
        setChipTrailingType(typedArray.getInt(AbstractC2815i.ZdsChip_chipTrailingType, EnumC16964c.NONE.m90846c()));
        if (typedArray.hasValue(AbstractC2815i.ZdsChip_chipLeadingIcon) && (drawable = typedArray.getDrawable(AbstractC2815i.ZdsChip_chipLeadingIcon)) != null) {
            setLeadingIcon(drawable);
        }
        if (typedArray.hasValue(AbstractC2815i.ZdsChip_chipMiddleText)) {
            String string = typedArray.getString(AbstractC2815i.ZdsChip_chipMiddleText);
            if (string == null) {
                string = "";
            }
            setMiddleText(string);
        }
    }

    protected final int getChipLeadingIconDisabledColor() {
        return this.f86619N;
    }

    public final int getChipLeadingIconEnabledColor() {
        return this.f86618M;
    }

    public final int getChipLeadingIconPressedColor() {
        return this.f86620O;
    }

    protected final int getChipLeadingIconSelectedColor() {
        return this.f86621P;
    }

    public final int getChipTextDisabledColor() {
        return this.f86615J;
    }

    protected final int getChipTextDisabledStyle() {
        return this.f86610E;
    }

    public final int getChipTextEnabledColor() {
        return this.f86614I;
    }

    public final int getChipTextEnabledStyle() {
        return this.f86609D;
    }

    public final int getChipTextPressedColor() {
        return this.f86616K;
    }

    public final int getChipTextPressedStyle() {
        return this.f86611F;
    }

    public final int getChipTextSelectedColor() {
        return this.f86617L;
    }

    protected final int getChipTextSelectedStyle() {
        return this.f86612G;
    }

    public final int getChipTrailingIconDisabledColor() {
        return this.f86623R;
    }

    public final int getChipTrailingIconEnabledColor() {
        return this.f86622Q;
    }

    protected final int getChipTrailingIconPressedColor() {
        return this.f86624S;
    }

    protected final int getChipTrailingIconSelectedColor() {
        return this.f86625T;
    }

    public final int getChipTrailingTextStyle() {
        return this.f86613H;
    }

    protected final int getChipType() {
        return this.f86631q;
    }

    protected final Badge getDot() {
        return this.f86608C;
    }

    public final boolean getEnableMargin() {
        return this.f86629a0;
    }

    public final int getItemMaxWidth() {
        return this.f86628W;
    }

    public final ViewGroup getLeadingContainer() {
        return this.f86636v;
    }

    public final TrackingImageView getLeadingIcon() {
        return this.f86639y;
    }

    public final int getLeadingType() {
        return this.f86632r;
    }

    public final ConstraintLayout getMainContainer() {
        return this.f86634t;
    }

    public final ViewGroup getMiddleContainer() {
        return this.f86638x;
    }

    public final RobotoTextView getMiddleText() {
        return this.f86607B;
    }

    public final int getTrailingType() {
        return this.f86633s;
    }

    /* renamed from: i */
    protected void mo90826i() {
    }

    /* renamed from: j */
    public final void m90836j(int i11) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(i11, AbstractC2815i.ZdsChip);
        AbstractC19074t.m100207e(obtainStyledAttributes, "context.obtainStyledAttr…sId, R.styleable.ZdsChip)");
        if (obtainStyledAttributes.hasValue(AbstractC2815i.ZdsChip_chipType)) {
            setType(obtainStyledAttributes.getInt(AbstractC2815i.ZdsChip_chipType, EnumC16962a.TAB_CHIP.m90842c()));
        }
        if (obtainStyledAttributes.hasValue(AbstractC2815i.ZdsChip_chipTextEnabledStyle)) {
            this.f86609D = obtainStyledAttributes.getResourceId(AbstractC2815i.ZdsChip_chipTextEnabledStyle, 0);
        }
        if (obtainStyledAttributes.hasValue(AbstractC2815i.ZdsChip_chipTextDisabledStyle)) {
            this.f86610E = obtainStyledAttributes.getResourceId(AbstractC2815i.ZdsChip_chipTextDisabledStyle, 0);
        }
        if (obtainStyledAttributes.hasValue(AbstractC2815i.ZdsChip_chipTextPressedStyle)) {
            this.f86611F = obtainStyledAttributes.getResourceId(AbstractC2815i.ZdsChip_chipTextPressedStyle, 0);
        }
        if (obtainStyledAttributes.hasValue(AbstractC2815i.ZdsChip_chipTextSelectedStyle)) {
            this.f86612G = obtainStyledAttributes.getResourceId(AbstractC2815i.ZdsChip_chipTextSelectedStyle, 0);
        }
        if (obtainStyledAttributes.hasValue(AbstractC2815i.ZdsChip_chipTrailingTextStyle)) {
            this.f86613H = obtainStyledAttributes.getResourceId(AbstractC2815i.ZdsChip_chipTrailingTextStyle, 0);
        }
        if (obtainStyledAttributes.hasValue(AbstractC2815i.ZdsChip_chipTextEnabledColor)) {
            this.f86614I = obtainStyledAttributes.getColor(AbstractC2815i.ZdsChip_chipTextEnabledColor, 0);
        }
        if (obtainStyledAttributes.hasValue(AbstractC2815i.ZdsChip_chipTextDisabledColor)) {
            this.f86615J = obtainStyledAttributes.getColor(AbstractC2815i.ZdsChip_chipTextDisabledColor, 0);
        }
        if (obtainStyledAttributes.hasValue(AbstractC2815i.ZdsChip_chipTextPressedColor)) {
            this.f86616K = obtainStyledAttributes.getColor(AbstractC2815i.ZdsChip_chipTextPressedColor, 0);
        }
        if (obtainStyledAttributes.hasValue(AbstractC2815i.ZdsChip_chipTextSelectedColor)) {
            this.f86617L = obtainStyledAttributes.getColor(AbstractC2815i.ZdsChip_chipTextSelectedColor, 0);
        }
        if (obtainStyledAttributes.hasValue(AbstractC2815i.ZdsChip_chipLeadingIconEnabledColor)) {
            this.f86618M = obtainStyledAttributes.getColor(AbstractC2815i.ZdsChip_chipLeadingIconEnabledColor, 0);
        }
        if (obtainStyledAttributes.hasValue(AbstractC2815i.ZdsChip_chipLeadingIconDisabledColor)) {
            this.f86619N = obtainStyledAttributes.getColor(AbstractC2815i.ZdsChip_chipLeadingIconDisabledColor, 0);
        }
        if (obtainStyledAttributes.hasValue(AbstractC2815i.ZdsChip_chipLeadingIconPressedColor)) {
            this.f86620O = obtainStyledAttributes.getColor(AbstractC2815i.ZdsChip_chipLeadingIconPressedColor, 0);
        }
        if (obtainStyledAttributes.hasValue(AbstractC2815i.ZdsChip_chipLeadingIconSelectedColor)) {
            this.f86621P = obtainStyledAttributes.getColor(AbstractC2815i.ZdsChip_chipLeadingIconSelectedColor, 0);
        }
        if (obtainStyledAttributes.hasValue(AbstractC2815i.ZdsChip_chipTrailingIconEnabledColor)) {
            this.f86622Q = obtainStyledAttributes.getColor(AbstractC2815i.ZdsChip_chipTrailingIconEnabledColor, 0);
        }
        if (obtainStyledAttributes.hasValue(AbstractC2815i.ZdsChip_chipTrailingIconDisabledColor)) {
            this.f86623R = obtainStyledAttributes.getColor(AbstractC2815i.ZdsChip_chipTrailingIconDisabledColor, 0);
        }
        if (obtainStyledAttributes.hasValue(AbstractC2815i.ZdsChip_chipTrailingIconPressedColor)) {
            this.f86624S = obtainStyledAttributes.getColor(AbstractC2815i.ZdsChip_chipTrailingIconPressedColor, 0);
        }
        if (obtainStyledAttributes.hasValue(AbstractC2815i.ZdsChip_chipTrailingIconSelectedColor)) {
            this.f86625T = obtainStyledAttributes.getColor(AbstractC2815i.ZdsChip_chipTrailingIconSelectedColor, 0);
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: k */
    protected void mo90827k() {
    }

    /* renamed from: l */
    public void mo90837l() {
        int i11;
        int i12;
        ViewGroup viewGroup = this.f86636v;
        int i13 = 0;
        if (viewGroup != null) {
            if (this.f86632r == EnumC16963b.NONE.m90844c()) {
                i12 = 8;
            } else {
                i12 = 0;
            }
            viewGroup.setVisibility(i12);
        }
        TrackingImageView trackingImageView = this.f86639y;
        if (trackingImageView != null) {
            if (this.f86632r == EnumC16963b.ICON.m90844c()) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            trackingImageView.setVisibility(i11);
        }
        View view = this.f86640z;
        if (view != null) {
            if (this.f86632r != EnumC16963b.CUSTOM.m90844c()) {
                i13 = 8;
            }
            view.setVisibility(i13);
        }
    }

    /* renamed from: m */
    public void mo90838m() {
        int i11;
        ViewGroup viewGroup = this.f86637w;
        int i12 = 0;
        if (viewGroup != null) {
            if (this.f86633s == EnumC16964c.NONE.m90846c()) {
                i11 = 8;
            } else {
                i11 = 0;
            }
            viewGroup.setVisibility(i11);
        }
        View view = this.f86606A;
        if (view != null) {
            if (this.f86633s != EnumC16964c.CUSTOM.m90846c()) {
                i12 = 8;
            }
            view.setVisibility(i12);
        }
    }

    /* renamed from: n */
    protected boolean mo90839n(int i11) {
        return true;
    }

    /* renamed from: p */
    protected boolean mo90840p(int i11) {
        return true;
    }

    protected final void setChipEnabled(boolean z11) {
        this.f86626U = z11;
    }

    protected final void setChipLeadingIconDisabledColor(int i11) {
        this.f86619N = i11;
    }

    protected final void setChipLeadingIconEnabledColor(int i11) {
        this.f86618M = i11;
    }

    protected final void setChipLeadingIconPressedColor(int i11) {
        this.f86620O = i11;
    }

    protected final void setChipLeadingIconSelectedColor(int i11) {
        this.f86621P = i11;
    }

    public final void setChipLeadingType(int i11) {
        if (!mo90839n(i11)) {
            return;
        }
        this.f86632r = i11;
        mo90837l();
    }

    protected final void setChipSelected(boolean z11) {
        this.f86627V = z11;
    }

    protected final void setChipTextDisabledColor(int i11) {
        this.f86615J = i11;
    }

    protected final void setChipTextDisabledStyle(int i11) {
        this.f86610E = i11;
    }

    protected final void setChipTextEnabledColor(int i11) {
        this.f86614I = i11;
    }

    protected final void setChipTextEnabledStyle(int i11) {
        this.f86609D = i11;
    }

    protected final void setChipTextPressedColor(int i11) {
        this.f86616K = i11;
    }

    protected final void setChipTextPressedStyle(int i11) {
        this.f86611F = i11;
    }

    protected final void setChipTextSelectedColor(int i11) {
        this.f86617L = i11;
    }

    protected final void setChipTextSelectedStyle(int i11) {
        this.f86612G = i11;
    }

    protected final void setChipTrailingIconDisabledColor(int i11) {
        this.f86623R = i11;
    }

    protected final void setChipTrailingIconEnabledColor(int i11) {
        this.f86622Q = i11;
    }

    protected final void setChipTrailingIconPressedColor(int i11) {
        this.f86624S = i11;
    }

    protected final void setChipTrailingIconSelectedColor(int i11) {
        this.f86625T = i11;
    }

    protected final void setChipTrailingTextStyle(int i11) {
        this.f86613H = i11;
    }

    public final void setChipTrailingType(int i11) {
        if (!mo90840p(i11)) {
            return;
        }
        this.f86633s = i11;
        mo90838m();
    }

    protected final void setChipType(int i11) {
        this.f86631q = i11;
    }

    protected final void setDot(Badge badge) {
        this.f86608C = badge;
    }

    public final void setDotType(EnumC16991i enumC16991i) {
        C16974f config;
        AbstractC19074t.m100208f(enumC16991i, ZinstantMetaConstant.IMPRESSION_META_TYPE);
        Badge badge = this.f86608C;
        if (badge != null && (config = badge.getConfig()) != null) {
            config.m90974x(enumC16991i);
            Badge badge2 = this.f86608C;
            if (badge2 != null) {
                badge2.m90493g(config);
            }
        }
    }

    public void setEnable(boolean z11) {
        int i11;
        int i12;
        boolean z12;
        int i13;
        int i14;
        if (z11 && (z12 = this.f86627V)) {
            TrackingImageView trackingImageView = this.f86639y;
            if (trackingImageView != null) {
                if (z12) {
                    i14 = this.f86621P;
                } else {
                    i14 = this.f86618M;
                }
                trackingImageView.setColorFilter(i14);
            }
            RobotoTextView robotoTextView = this.f86607B;
            if (robotoTextView != null) {
                if (this.f86627V) {
                    i13 = this.f86617L;
                } else {
                    i13 = this.f86614I;
                }
                robotoTextView.setTextColor(i13);
            }
        } else {
            TrackingImageView trackingImageView2 = this.f86639y;
            if (trackingImageView2 != null) {
                if (z11) {
                    i12 = this.f86618M;
                } else {
                    i12 = this.f86619N;
                }
                trackingImageView2.setColorFilter(i12);
            }
            RobotoTextView robotoTextView2 = this.f86607B;
            if (robotoTextView2 != null) {
                if (z11) {
                    i11 = this.f86614I;
                } else {
                    i11 = this.f86615J;
                }
                robotoTextView2.setTextColor(i11);
            }
        }
        ConstraintLayout constraintLayout = this.f86634t;
        if (constraintLayout != null) {
            constraintLayout.setEnabled(z11);
        }
        this.f86626U = z11;
    }

    public final void setEnableMargin(boolean z11) {
        this.f86629a0 = z11;
    }

    @Override // com.zing.zalo.zdesign.component.InterfaceC16976f1
    public void setIdTracking(String str) {
        AbstractC19074t.m100208f(str, "id");
        C25808b c25808b = this.f86630p;
        if (c25808b != null) {
            c25808b.m133075d(str);
        }
    }

    protected final void setItemMaxWidth(int i11) {
        this.f86628W = i11;
    }

    protected final void setLeadingContainer(ViewGroup viewGroup) {
        this.f86636v = viewGroup;
    }

    public final void setLeadingCustom(View view) {
        ViewGroup viewGroup;
        AbstractC19074t.m100208f(view, "customView");
        if (this.f86632r == EnumC16963b.CUSTOM.m90844c()) {
            if (!AbstractC19074t.m100204b(this.f86640z, view) && (viewGroup = this.f86636v) != null) {
                View view2 = this.f86640z;
                if (view2 != null) {
                    viewGroup.removeView(view2);
                }
                this.f86640z = view;
                if (view != null) {
                    viewGroup.addView(view);
                    return;
                }
                return;
            }
            return;
        }
        throw new Exception("set leading type = CUSTOM before set custom view");
    }

    protected final void setLeadingIcon(TrackingImageView trackingImageView) {
        this.f86639y = trackingImageView;
    }

    protected final void setLeadingType(int i11) {
        this.f86632r = i11;
    }

    protected final void setMainContainer(ConstraintLayout constraintLayout) {
        this.f86634t = constraintLayout;
    }

    public void setMaxItemWidth(int i11) {
        if (i11 != 0 && this.f86628W != i11) {
            this.f86628W = i11;
            LinearLayout linearLayout = this.f86635u;
            if (linearLayout != null) {
                ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
                if (layoutParams instanceof ConstraintLayout.LayoutParams) {
                    ((ConstraintLayout.LayoutParams) layoutParams).f5506T = i11;
                }
                linearLayout.setLayoutParams(layoutParams);
            }
        }
    }

    protected final void setMiddleContainer(ViewGroup viewGroup) {
        this.f86638x = viewGroup;
    }

    protected final void setMiddleText(RobotoTextView robotoTextView) {
        this.f86607B = robotoTextView;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        if (!this.f86626U) {
            return;
        }
        C25808b c25808b = this.f86630p;
        if (c25808b == null || !c25808b.m133076e(onClickListener)) {
            super.setOnClickListener(onClickListener);
        }
    }

    @Override // com.zing.zalo.zdesign.component.InterfaceC16976f1
    public void setTrackingExtraData(C0708i c0708i) {
        C25808b c25808b = this.f86630p;
        if (c25808b != null) {
            c25808b.m133077f(c0708i);
        }
    }

    public final void setTrailingCustom(View view) {
        ViewGroup viewGroup;
        AbstractC19074t.m100208f(view, "customView");
        if (this.f86633s == EnumC16964c.CUSTOM.m90846c()) {
            if (!AbstractC19074t.m100204b(this.f86606A, view) && (viewGroup = this.f86637w) != null) {
                View view2 = this.f86606A;
                if (view2 != null) {
                    viewGroup.removeView(view2);
                }
                this.f86606A = view;
                if (view != null) {
                    viewGroup.addView(view);
                    return;
                }
                return;
            }
            return;
        }
        throw new Exception("set trailing type = CUSTOM before set custom view");
    }

    protected final void setTrailingType(int i11) {
        this.f86633s = i11;
    }

    public final void setType(int i11) {
        this.f86631q = i11;
    }

    public void setZdsChipSelected(boolean z11) {
        int i11;
        int i12;
        int i13;
        if (!this.f86626U) {
            return;
        }
        this.f86627V = z11;
        RobotoTextView robotoTextView = this.f86607B;
        if (robotoTextView != null) {
            Context context = robotoTextView.getContext();
            AbstractC19074t.m100207e(context, "context");
            if (z11) {
                i12 = this.f86612G;
            } else {
                i12 = this.f86609D;
            }
            new C26708g(robotoTextView).m137319a(C26705d.m137293a(context, i12));
            if (z11) {
                i13 = this.f86617L;
            } else {
                i13 = this.f86614I;
            }
            robotoTextView.setTextColor(i13);
        }
        TrackingImageView trackingImageView = this.f86639y;
        if (trackingImageView != null) {
            if (z11) {
                i11 = this.f86621P;
            } else {
                i11 = this.f86618M;
            }
            trackingImageView.setColorFilter(i11);
        }
        ConstraintLayout constraintLayout = this.f86634t;
        if (constraintLayout != null) {
            constraintLayout.setSelected(z11);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ZdsChip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        AbstractC19074t.m100208f(context, "context");
    }

    public final void setLeadingIcon(Drawable drawable) {
        AbstractC19074t.m100208f(drawable, "icon");
        if (this.f86632r != EnumC16963b.ICON.m90844c()) {
            TrackingImageView trackingImageView = this.f86639y;
            if (trackingImageView == null) {
                return;
            }
            trackingImageView.setVisibility(8);
            return;
        }
        TrackingImageView trackingImageView2 = this.f86639y;
        if (trackingImageView2 != null) {
            trackingImageView2.setVisibility(0);
            trackingImageView2.setImageDrawable(drawable);
        }
    }

    public final void setMiddleText(String str) {
        AbstractC19074t.m100208f(str, "middleTxt");
        if (str.length() <= 0) {
            RobotoTextView robotoTextView = this.f86607B;
            if (robotoTextView == null) {
                return;
            }
            robotoTextView.setVisibility(8);
            return;
        }
        RobotoTextView robotoTextView2 = this.f86607B;
        if (robotoTextView2 != null) {
            robotoTextView2.setText(str);
            robotoTextView2.setVisibility(0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZdsChip(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
        this.f86631q = EnumC16962a.TAB_CHIP.m90842c();
        this.f86632r = EnumC16963b.NONE.m90844c();
        this.f86633s = EnumC16964c.NONE.m90846c();
        this.f86626U = true;
        this.f86630p = new C25808b(new WeakReference(this));
        LayoutInflater.from(context).inflate(AbstractC2812f.zds_chip_component, this);
        this.f86634t = (ConstraintLayout) findViewById(AbstractC2811e.main_container);
        this.f86635u = (LinearLayout) findViewById(AbstractC2811e.item_container);
        this.f86636v = (ViewGroup) findViewById(AbstractC2811e.leading_container);
        this.f86607B = (RobotoTextView) findViewById(AbstractC2811e.middle_text);
        this.f86637w = (ViewGroup) findViewById(AbstractC2811e.trailing_container);
        this.f86638x = (ViewGroup) findViewById(AbstractC2811e.middleContainer);
        this.f86639y = (TrackingImageView) findViewById(AbstractC2811e.leading_icon);
        LinearLayout linearLayout = this.f86635u;
        if (linearLayout != null) {
            ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
            if (layoutParams instanceof ConstraintLayout.LayoutParams) {
                ((ConstraintLayout.LayoutParams) layoutParams).f5504R = linearLayout.getResources().getDimensionPixelSize(AbstractC2809c.chip_min_width);
            }
        }
        mo90832c();
        mo90826i();
        mo90830a();
        m90829h(this, attributeSet, i11, 0, 4, null);
        mo90827k();
    }
}
