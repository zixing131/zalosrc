package com.zing.zalo.zdesign.component.inputfield;

import ac.C0708i;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import bi0.AbstractC2807a;
import bi0.AbstractC2809c;
import bi0.AbstractC2810d;
import bi0.AbstractC2811e;
import bi0.AbstractC2812f;
import bi0.AbstractC2814h;
import bi0.AbstractC2815i;
import bi0.AbstractC2816j;
import com.zing.zalo.p077ui.widget.EditTextWithContextMenu;
import fn0.AbstractC19074t;
import kotlin.NoWhenBranchMatchedException;
import qm0.AbstractC25356m;
import ui0.C27276c;
import ui0.C27280g;

/* loaded from: classes7.dex */
public class BaseInputField extends RelativeLayout {

    /* renamed from: A */
    private int f86880A;

    /* renamed from: B */
    private int f86881B;

    /* renamed from: C */
    private int f86882C;

    /* renamed from: D */
    private int f86883D;

    /* renamed from: E */
    private int f86884E;

    /* renamed from: F */
    private int f86885F;

    /* renamed from: G */
    private int f86886G;

    /* renamed from: H */
    private int f86887H;

    /* renamed from: I */
    private boolean f86888I;

    /* renamed from: J */
    private InterfaceC16996d f86889J;

    /* renamed from: K */
    private InterfaceC16995c f86890K;

    /* renamed from: L */
    private InterfaceC16996d f86891L;

    /* renamed from: M */
    private boolean f86892M;

    /* renamed from: N */
    private EnumC17006h f86893N;

    /* renamed from: O */
    private CharSequence f86894O;

    /* renamed from: P */
    private CharSequence f86895P;

    /* renamed from: Q */
    private EnumC17007i f86896Q;

    /* renamed from: R */
    private int f86897R;

    /* renamed from: S */
    private Drawable f86898S;

    /* renamed from: T */
    private Drawable f86899T;

    /* renamed from: U */
    private Drawable f86900U;

    /* renamed from: p */
    private final TextView f86901p;

    /* renamed from: q */
    private final TextView f86902q;

    /* renamed from: r */
    private final TextView f86903r;

    /* renamed from: s */
    private final EditText f86904s;

    /* renamed from: t */
    private final LinearLayout f86905t;

    /* renamed from: u */
    private final LinearLayout f86906u;

    /* renamed from: v */
    private final LinearLayout f86907v;

    /* renamed from: w */
    private final LinearLayout f86908w;

    /* renamed from: x */
    private final LinearLayout f86909x;

    /* renamed from: y */
    private ImageView f86910y;

    /* renamed from: z */
    private ImageView f86911z;

    /* renamed from: com.zing.zalo.zdesign.component.inputfield.BaseInputField$a */
    /* loaded from: classes7.dex */
    public static final class C16993a extends EditTextWithContextMenu.AbstractC13498a {
        C16993a() {
        }

        @Override // com.zing.zalo.p077ui.widget.EditTextWithContextMenu.AbstractC13498a
        /* renamed from: a */
        public void mo36093a() {
            InterfaceC16995c interfaceC16995c;
            if (BaseInputField.this.f86892M && (interfaceC16995c = BaseInputField.this.f86890K) != null) {
                interfaceC16995c.mo50287a();
            }
        }
    }

    /* renamed from: com.zing.zalo.zdesign.component.inputfield.BaseInputField$b */
    /* loaded from: classes7.dex */
    public static final class C16994b implements InputFilter {

        /* renamed from: a */
        private final int f86913a;

        /* renamed from: b */
        private final InterfaceC16996d f86914b;

        public C16994b(int i11, InterfaceC16996d interfaceC16996d) {
            this.f86913a = i11;
            this.f86914b = interfaceC16996d;
        }

        @Override // android.text.InputFilter
        public CharSequence filter(CharSequence charSequence, int i11, int i12, Spanned spanned, int i13, int i14) {
            AbstractC19074t.m100208f(charSequence, "source");
            AbstractC19074t.m100208f(spanned, "dest");
            int length = this.f86913a - (spanned.length() - (i14 - i13));
            if (length <= 0) {
                InterfaceC16996d interfaceC16996d = this.f86914b;
                if (interfaceC16996d == null) {
                    return "";
                }
                interfaceC16996d.mo91048a(true);
                return "";
            }
            if (length >= i12 - i11) {
                InterfaceC16996d interfaceC16996d2 = this.f86914b;
                if (interfaceC16996d2 != null) {
                    interfaceC16996d2.mo91048a(false);
                }
                return null;
            }
            InterfaceC16996d interfaceC16996d3 = this.f86914b;
            if (interfaceC16996d3 != null) {
                interfaceC16996d3.mo91048a(true);
            }
            int i15 = length + i11;
            if (Character.isHighSurrogate(charSequence.charAt(i15 - 1)) && i15 - 1 == i11) {
                return "";
            }
            return charSequence.subSequence(i11, i15);
        }
    }

    /* renamed from: com.zing.zalo.zdesign.component.inputfield.BaseInputField$c */
    /* loaded from: classes7.dex */
    public interface InterfaceC16995c {
        /* renamed from: a */
        void mo50287a();
    }

    /* renamed from: com.zing.zalo.zdesign.component.inputfield.BaseInputField$d */
    /* loaded from: classes7.dex */
    public interface InterfaceC16996d {
        /* renamed from: a */
        void mo91048a(boolean z11);
    }

    /* renamed from: com.zing.zalo.zdesign.component.inputfield.BaseInputField$e */
    /* loaded from: classes7.dex */
    public /* synthetic */ class C16997e {

        /* renamed from: a */
        public static final /* synthetic */ int[] f86915a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f86916b;

        static {
            int[] iArr = new int[EnumC17007i.values().length];
            try {
                iArr[EnumC17007i.ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC17007i.ACCEPTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f86915a = iArr;
            int[] iArr2 = new int[EnumC17006h.values().length];
            try {
                iArr2[EnumC17006h.Never.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[EnumC17006h.Always.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[EnumC17006h.WhileEditing.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[EnumC17006h.UnlessEditing.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            f86916b = iArr2;
        }
    }

    /* renamed from: com.zing.zalo.zdesign.component.inputfield.BaseInputField$f */
    /* loaded from: classes7.dex */
    public static final class C16998f implements TextWatcher {
        C16998f() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            BaseInputField.this.mo76216r();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BaseInputField(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        AbstractC19074t.m100208f(context, "context");
    }

    /* renamed from: A */
    static /* synthetic */ void m91022A(BaseInputField baseInputField, AttributeSet attributeSet, int i11, int i12, int i13, Object obj) {
        if (obj == null) {
            if ((i13 & 2) != 0) {
                i11 = 0;
            }
            if ((i13 & 4) != 0) {
                i12 = AbstractC2814h.BaseInputField;
            }
            baseInputField.m91042z(attributeSet, i11, i12);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: parseAttributes");
    }

    /* renamed from: F */
    private final void m91023F() {
        Context context = getContext();
        AbstractC19074t.m100207e(context, "context");
        int m139649b = C27276c.m139649b(context, 12);
        this.f86881B = m139649b;
        if (this.f86907v.indexOfChild(this.f86910y) != -1 && this.f86910y.getVisibility() == 0) {
            ViewGroup.LayoutParams layoutParams = null;
            if (this.f86907v.indexOfChild(this.f86911z) != -1 && this.f86911z.getVisibility() == 0) {
                ViewGroup.LayoutParams layoutParams2 = this.f86911z.getLayoutParams();
                if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                    layoutParams = layoutParams2;
                }
                AbstractC19074t.m100206d(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = 0;
                this.f86911z.setLayoutParams(layoutParams);
                return;
            }
            this.f86881B = 0;
            ViewGroup.LayoutParams layoutParams3 = this.f86911z.getLayoutParams();
            if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
                layoutParams = layoutParams3;
            }
            AbstractC19074t.m100206d(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = m139649b;
            this.f86911z.setLayoutParams(layoutParams);
        }
    }

    private final int getHelperTextColor() {
        return this.f86897R;
    }

    private final Drawable getHelperTextIcon() {
        if (C16997e.f86915a[this.f86896Q.ordinal()] == 1) {
            Context context = getContext();
            AbstractC19074t.m100207e(context, "context");
            return C27280g.m139660c(context, AbstractC2810d.zds_ic_warning_solid_16, AbstractC2807a.input_field_text_secondary_error);
        }
        Context context2 = getContext();
        AbstractC19074t.m100207e(context2, "context");
        return C27280g.m139660c(context2, AbstractC2810d.zds_ic_info_circle_line_16, AbstractC2807a.input_field_text_secondary);
    }

    /* renamed from: h */
    public static final void m91031h(BaseInputField baseInputField, View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        AbstractC19074t.m100208f(baseInputField, "this$0");
        baseInputField.f86886G = Math.abs(i13 - i11);
        baseInputField.m91037s();
    }

    /* renamed from: i */
    public static final void m91032i(BaseInputField baseInputField, View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        AbstractC19074t.m100208f(baseInputField, "this$0");
        baseInputField.f86885F = Math.abs(i13 - i11);
        baseInputField.m91037s();
    }

    /* renamed from: j */
    public static final void m91033j(BaseInputField baseInputField, View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        AbstractC19074t.m100208f(baseInputField, "this$0");
        baseInputField.f86887H = Math.abs(i14 - i12);
        baseInputField.m91037s();
    }

    /* renamed from: k */
    public static final void m91034k(BaseInputField baseInputField, boolean z11) {
        AbstractC19074t.m100208f(baseInputField, "this$0");
        if (baseInputField.f86892M != z11) {
            baseInputField.f86892M = z11;
        }
        InterfaceC16996d interfaceC16996d = baseInputField.f86891L;
        if (interfaceC16996d != null) {
            interfaceC16996d.mo91048a(z11);
        }
    }

    /* renamed from: s */
    private final void m91037s() {
        post(new Runnable() { // from class: com.zing.zalo.zdesign.component.inputfield.g
            public /* synthetic */ RunnableC17005g() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                BaseInputField.m91038u(BaseInputField.this);
            }
        });
    }

    private final void setHelperTextColor(int i11) {
        this.f86897R = i11;
        this.f86903r.setTextColor(i11);
        Drawable helperTextIcon = getHelperTextIcon();
        if (helperTextIcon != null) {
            helperTextIcon.setTint(this.f86897R);
        }
    }

    /* renamed from: u */
    public static final void m91038u(BaseInputField baseInputField) {
        AbstractC19074t.m100208f(baseInputField, "this$0");
        int i11 = baseInputField.f86882C;
        int i12 = baseInputField.f86885F;
        if (i11 != i12 || baseInputField.f86883D != baseInputField.f86886G || baseInputField.f86884E != baseInputField.f86887H) {
            baseInputField.f86882C = i12;
            baseInputField.f86883D = baseInputField.f86886G;
            baseInputField.f86884E = baseInputField.f86887H;
            baseInputField.m91023F();
            EditText editText = baseInputField.f86904s;
            editText.setPadding(baseInputField.f86882C + baseInputField.f86880A, editText.getPaddingTop(), baseInputField.f86883D + baseInputField.f86881B, baseInputField.f86904s.getPaddingBottom());
        }
    }

    /* renamed from: w */
    public static final void m91039w(BaseInputField baseInputField, View view) {
        AbstractC19074t.m100208f(baseInputField, "this$0");
        if (baseInputField.isEnabled()) {
            baseInputField.f86904s.setText("");
        }
    }

    /* renamed from: x */
    public static final void m91040x(BaseInputField baseInputField, View view, boolean z11) {
        AbstractC19074t.m100208f(baseInputField, "this$0");
        baseInputField.mo76216r();
    }

    /* renamed from: y */
    private final void m91041y() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        Context context = getContext();
        AbstractC19074t.m100207e(context, "context");
        layoutParams.rightMargin = C27276c.m139649b(context, 12);
        this.f86911z.setScaleType(ImageView.ScaleType.CENTER);
        ImageView imageView = this.f86911z;
        Context context2 = getContext();
        AbstractC19074t.m100207e(context2, "context");
        imageView.setImageDrawable(C27280g.m139660c(context2, AbstractC2810d.zds_ic_check_circle_solid_16, AbstractC2807a.input_field_icon_accepted));
        this.f86907v.addView(this.f86911z, layoutParams);
        this.f86911z.setVisibility(8);
    }

    /* renamed from: z */
    private final void m91042z(AttributeSet attributeSet, int i11, int i12) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC2815i.BaseInputField, i11, i12);
            AbstractC19074t.m100207e(obtainStyledAttributes, "context.obtainStyledAttr…tyleRes\n                )");
            if (obtainStyledAttributes.hasValue(AbstractC2815i.BaseInputField_android_inputType)) {
                this.f86904s.setInputType(obtainStyledAttributes.getInt(AbstractC2815i.BaseInputField_android_inputType, 0));
            }
            this.f86904s.setHint(obtainStyledAttributes.getString(AbstractC2815i.BaseInputField_fieldHint));
            this.f86904s.setText(obtainStyledAttributes.getString(AbstractC2815i.BaseInputField_fieldText));
            String string = obtainStyledAttributes.getString(AbstractC2815i.BaseInputField_fieldLabel);
            String str = "";
            if (string == null) {
                string = "";
            }
            setLabel(string);
            String string2 = obtainStyledAttributes.getString(AbstractC2815i.BaseInputField_fieldHelper);
            if (string2 != null) {
                str = string2;
            }
            setHelperText(str);
            setEnabled(obtainStyledAttributes.getBoolean(AbstractC2815i.BaseInputField_android_enabled, true));
            this.f86898S = obtainStyledAttributes.getDrawable(AbstractC2815i.BaseInputField_backgroundNormal);
            this.f86899T = obtainStyledAttributes.getDrawable(AbstractC2815i.BaseInputField_backgroundError);
            this.f86900U = obtainStyledAttributes.getDrawable(AbstractC2815i.BaseInputField_backgroundAccepted);
            this.f86896Q = EnumC17007i.NORMAL;
            String string3 = obtainStyledAttributes.getString(AbstractC2815i.BaseInputField_trackingId);
            if (string3 != null && string3.length() != 0) {
                setIdTracking(string3);
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: B */
    public final void m91043B(boolean z11) {
        int i11;
        TextView textView = this.f86903r;
        if (z11 && isEnabled()) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        textView.setVisibility(i11);
    }

    /* renamed from: C */
    public final void m91044C(boolean z11) {
        this.f86888I = z11;
        setFieldState(this.f86896Q);
    }

    /* renamed from: D */
    public final void m91045D(boolean z11) {
        int i11;
        TextView textView = this.f86901p;
        if (z11) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        textView.setVisibility(i11);
    }

    /* renamed from: E */
    public final void m91046E(boolean z11) {
        int i11;
        TextView textView = this.f86902q;
        if (z11) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        textView.setVisibility(i11);
    }

    protected final int getBaseFormPaddingLeft() {
        return this.f86880A;
    }

    protected final int getBaseFormPaddingRight() {
        return this.f86881B;
    }

    public final EnumC17006h getClearIconMode() {
        return this.f86893N;
    }

    public final InterfaceC16996d getDefaultTextLengthExceedListener() {
        return this.f86889J;
    }

    public final EditText getEditText() {
        return this.f86904s;
    }

    public final CharSequence getErrorText() {
        return this.f86895P;
    }

    public final CharSequence getHelperText() {
        return this.f86894O;
    }

    public final ImageView getIcClearText() {
        return this.f86910y;
    }

    public final ImageView getIcStateAccepted() {
        return this.f86911z;
    }

    public final CharSequence getLabel() {
        CharSequence text = this.f86901p.getText();
        AbstractC19074t.m100207e(text, "labelTextView.text");
        return text;
    }

    public final LinearLayout getLeftControlsLayout() {
        return this.f86905t;
    }

    public final LinearLayout getRightControlsLayout() {
        return this.f86909x;
    }

    public final LinearLayout getRightLayoutInput() {
        return this.f86907v;
    }

    public final LinearLayout getRightLayoutTextArea() {
        return this.f86908w;
    }

    /* renamed from: n */
    public void mo90604n() {
        boolean z11;
        Drawable drawable = this.f86900U;
        if (drawable != null) {
            this.f86904s.setBackground(drawable);
            this.f86903r.setText(this.f86894O);
            if (this.f86894O.length() > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            m91043B(z11);
            this.f86911z.setVisibility(0);
        }
    }

    /* renamed from: p */
    public void mo90605p() {
        boolean z11;
        Drawable drawable = this.f86899T;
        if (drawable != null) {
            this.f86904s.setBackground(drawable);
            this.f86903r.setText(this.f86895P);
            if (this.f86895P.length() > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            m91043B(z11);
            this.f86911z.setVisibility(8);
        }
    }

    /* renamed from: q */
    public void mo76215q() {
        boolean z11;
        Drawable drawable = this.f86898S;
        if (drawable != null) {
            this.f86904s.setBackground(drawable);
            this.f86903r.setText(this.f86894O);
            if (this.f86894O.length() > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            m91043B(z11);
            mo76216r();
            this.f86911z.setVisibility(8);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:            if (java.lang.String.valueOf(r4.f86904s.getText()).length() > 0) goto L56;     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004e, code lost:            if (java.lang.String.valueOf(r4.f86904s.getText()).length() > 0) goto L56;     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005f, code lost:            if (java.lang.String.valueOf(r4.f86904s.getText()).length() > 0) goto L56;     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0066  */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo76216r() {
        int i11 = C16997e.f86916b[this.f86893N.ordinal()];
        boolean z11 = true;
        int i12 = 0;
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 == 4) {
                        if (!this.f86904s.isFocused()) {
                        }
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } else if (this.f86904s.isFocused()) {
                }
            }
            ImageView imageView = this.f86910y;
            if (!z11) {
                i12 = 8;
            }
            imageView.setVisibility(i12);
        }
        z11 = false;
        ImageView imageView2 = this.f86910y;
        if (!z11) {
        }
        imageView2.setVisibility(i12);
    }

    public final void setBaseFormPaddingLeft(int i11) {
        this.f86880A = i11;
    }

    public final void setBaseFormPaddingRight(int i11) {
        this.f86881B = i11;
    }

    public final void setClearIconMode(EnumC17006h enumC17006h) {
        AbstractC19074t.m100208f(enumC17006h, "value");
        this.f86893N = enumC17006h;
        mo76216r();
    }

    protected final void setDefaultTextLengthExceedListener(InterfaceC16996d interfaceC16996d) {
        this.f86889J = interfaceC16996d;
    }

    @Override // android.view.View
    public void setEnabled(boolean z11) {
        super.setEnabled(z11);
        this.f86904s.setEnabled(z11);
        this.f86901p.setEnabled(z11);
        if (!z11) {
            this.f86910y.setVisibility(8);
            m91043B(false);
        } else {
            mo76216r();
            setFieldState(this.f86896Q);
        }
    }

    public final void setErrorText(CharSequence charSequence) {
        int i11;
        AbstractC19074t.m100208f(charSequence, "value");
        this.f86895P = charSequence;
        if (this.f86896Q == EnumC17007i.ERROR) {
            this.f86903r.setText(charSequence);
            TextView textView = this.f86903r;
            if (charSequence.length() > 0) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            textView.setVisibility(i11);
        }
    }

    public final void setFieldState(EnumC17007i enumC17007i) {
        int m13592a;
        AbstractC19074t.m100208f(enumC17007i, "fieldState");
        this.f86896Q = enumC17007i;
        int[] iArr = C16997e.f86915a;
        int i11 = iArr[enumC17007i.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                mo76215q();
            } else {
                mo90604n();
            }
        } else {
            mo90605p();
        }
        if (iArr[enumC17007i.ordinal()] == 1) {
            AbstractC2816j.a aVar = AbstractC2816j.Companion;
            Context context = getContext();
            AbstractC19074t.m100207e(context, "context");
            m13592a = aVar.m13592a(context, AbstractC2807a.input_field_text_secondary_error);
        } else {
            AbstractC2816j.a aVar2 = AbstractC2816j.Companion;
            Context context2 = getContext();
            AbstractC19074t.m100207e(context2, "context");
            m13592a = aVar2.m13592a(context2, AbstractC2807a.input_field_text_secondary);
        }
        setHelperTextColor(m13592a);
        if (this.f86888I) {
            Drawable helperTextIcon = getHelperTextIcon();
            if (helperTextIcon != null) {
                helperTextIcon.setTint(getHelperTextColor());
            }
            this.f86903r.setCompoundDrawablesWithIntrinsicBounds(helperTextIcon, (Drawable) null, (Drawable) null, (Drawable) null);
            return;
        }
        this.f86903r.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public void setForceOffAutoFill(boolean z11) {
        this.f86904s.setForceOffAutoFill$zdesign_release(z11);
    }

    public final void setHelperText(CharSequence charSequence) {
        int i11;
        AbstractC19074t.m100208f(charSequence, "value");
        this.f86894O = charSequence;
        if (this.f86896Q != EnumC17007i.ERROR) {
            this.f86903r.setText(charSequence);
            TextView textView = this.f86903r;
            if (charSequence.length() > 0) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            textView.setVisibility(i11);
        }
    }

    protected final void setIcClearText(ImageView imageView) {
        AbstractC19074t.m100208f(imageView, "<set-?>");
        this.f86910y = imageView;
    }

    protected final void setIcStateAccepted(ImageView imageView) {
        AbstractC19074t.m100208f(imageView, "<set-?>");
        this.f86911z = imageView;
    }

    public final void setIdTracking(String str) {
        AbstractC19074t.m100208f(str, "id");
        this.f86904s.setIdTracking(str);
    }

    public final void setLabel(CharSequence charSequence) {
        int i11;
        AbstractC19074t.m100208f(charSequence, "value");
        this.f86901p.setText(charSequence);
        TextView textView = this.f86901p;
        if (charSequence.length() == 0) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        textView.setVisibility(i11);
    }

    public void setMaxLength(int i11) {
        Object[] m131334q;
        Object[] m131333p;
        Object[] objArr = new InputFilter[0];
        InputFilter[] filters = this.f86904s.getFilters();
        AbstractC19074t.m100207e(filters, "editText.filters");
        for (InputFilter inputFilter : filters) {
            if (!(inputFilter instanceof C16994b)) {
                AbstractC19074t.m100207e(inputFilter, "it");
                objArr = AbstractC25356m.m131333p(objArr, inputFilter);
            }
        }
        this.f86904s.setFilters(new InputFilter[0]);
        EditText editText = this.f86904s;
        InputFilter[] filters2 = editText.getFilters();
        AbstractC19074t.m100207e(filters2, "editText.filters");
        m131334q = AbstractC25356m.m131334q(filters2, objArr);
        editText.setFilters((InputFilter[]) m131334q);
        EditText editText2 = this.f86904s;
        InputFilter[] filters3 = editText2.getFilters();
        AbstractC19074t.m100207e(filters3, "editText.filters");
        m131333p = AbstractC25356m.m131333p(filters3, new C16994b(i11, this.f86889J));
        editText2.setFilters((InputFilter[]) m131333p);
    }

    public final void setPasteTextLengthExceedListener(InterfaceC16995c interfaceC16995c) {
        AbstractC19074t.m100208f(interfaceC16995c, "listener");
        this.f86890K = interfaceC16995c;
    }

    public final void setTextLengthExceedListener(InterfaceC16996d interfaceC16996d) {
        AbstractC19074t.m100208f(interfaceC16996d, "listener");
        this.f86891L = interfaceC16996d;
    }

    public final void setTrackingExtraData(C0708i c0708i) {
        this.f86904s.setTrackingExtraData(c0708i);
    }

    /* renamed from: v */
    public final void m91047v() {
        Context context = getContext();
        AbstractC19074t.m100207e(context, "context");
        int m139649b = C27276c.m139649b(context, 40);
        Context context2 = getContext();
        AbstractC19074t.m100207e(context2, "context");
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(m139649b, C27276c.m139649b(context2, 40));
        this.f86910y.setScaleType(ImageView.ScaleType.CENTER);
        ImageView imageView = this.f86910y;
        Context context3 = getContext();
        AbstractC19074t.m100207e(context3, "context");
        imageView.setImageDrawable(C27280g.m139660c(context3, AbstractC2810d.zds_ic_close_circle_solid_16, AbstractC2807a.icon_01));
        this.f86907v.addView(this.f86910y, layoutParams);
        this.f86910y.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.zdesign.component.inputfield.e
            public /* synthetic */ ViewOnClickListenerC17003e() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseInputField.m91039w(BaseInputField.this, view);
            }
        });
        mo76216r();
        this.f86904s.addTextChangedListener(new C16998f());
        this.f86904s.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.zing.zalo.zdesign.component.inputfield.f
            public /* synthetic */ ViewOnFocusChangeListenerC17004f() {
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z11) {
                BaseInputField.m91040x(BaseInputField.this, view, z11);
            }
        });
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseInputField(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
        this.f86893N = EnumC17006h.WhileEditing;
        this.f86894O = "";
        this.f86895P = "Error message";
        this.f86896Q = EnumC17007i.NORMAL;
        LayoutInflater.from(context).inflate(AbstractC2812f.form_content, this);
        View findViewById = findViewById(AbstractC2811e.tv_form_label);
        AbstractC19074t.m100207e(findViewById, "findViewById(R.id.tv_form_label)");
        TextView textView = (TextView) findViewById;
        this.f86901p = textView;
        View findViewById2 = findViewById(AbstractC2811e.tv_form_label_required);
        AbstractC19074t.m100207e(findViewById2, "findViewById(R.id.tv_form_label_required)");
        this.f86902q = (TextView) findViewById2;
        View findViewById3 = findViewById(AbstractC2811e.tv_form_helper);
        AbstractC19074t.m100207e(findViewById3, "findViewById(R.id.tv_form_helper)");
        TextView textView2 = (TextView) findViewById3;
        this.f86903r = textView2;
        View findViewById4 = findViewById(AbstractC2811e.edt_form_content);
        AbstractC19074t.m100207e(findViewById4, "findViewById(R.id.edt_form_content)");
        EditText editText = (EditText) findViewById4;
        this.f86904s = editText;
        editText.setSaveEnabled(false);
        editText.setMinHeight(context.getResources().getDimensionPixelSize(AbstractC2809c.form_edit_text_min_height));
        View findViewById5 = findViewById(AbstractC2811e.ll_form_left_controls);
        AbstractC19074t.m100207e(findViewById5, "findViewById(R.id.ll_form_left_controls)");
        LinearLayout linearLayout = (LinearLayout) findViewById5;
        this.f86905t = linearLayout;
        View findViewById6 = findViewById(AbstractC2811e.ll_form_bottom_controls);
        AbstractC19074t.m100207e(findViewById6, "findViewById(R.id.ll_form_bottom_controls)");
        LinearLayout linearLayout2 = (LinearLayout) findViewById6;
        this.f86906u = linearLayout2;
        View findViewById7 = findViewById(AbstractC2811e.ll_input_right_controls);
        AbstractC19074t.m100207e(findViewById7, "findViewById(R.id.ll_input_right_controls)");
        this.f86907v = (LinearLayout) findViewById7;
        View findViewById8 = findViewById(AbstractC2811e.ll_textarea_right_controls);
        AbstractC19074t.m100207e(findViewById8, "findViewById(R.id.ll_textarea_right_controls)");
        this.f86908w = (LinearLayout) findViewById8;
        View findViewById9 = findViewById(AbstractC2811e.ll_field_right_controls);
        AbstractC19074t.m100207e(findViewById9, "findViewById(R.id.ll_field_right_controls)");
        LinearLayout linearLayout3 = (LinearLayout) findViewById9;
        this.f86909x = linearLayout3;
        this.f86910y = new ImageView(context);
        this.f86911z = new ImageView(context);
        m91022A(this, attributeSet, i11, 0, 4, null);
        this.f86880A = C27276c.m139649b(context, 12);
        linearLayout3.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.zing.zalo.zdesign.component.inputfield.a
            public /* synthetic */ ViewOnLayoutChangeListenerC16999a() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
                BaseInputField.m91031h(BaseInputField.this, view, i12, i13, i14, i15, i16, i17, i18, i19);
            }
        });
        linearLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.zing.zalo.zdesign.component.inputfield.b
            public /* synthetic */ ViewOnLayoutChangeListenerC17000b() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
                BaseInputField.m91032i(BaseInputField.this, view, i12, i13, i14, i15, i16, i17, i18, i19);
            }
        });
        linearLayout2.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.zing.zalo.zdesign.component.inputfield.c
            public /* synthetic */ ViewOnLayoutChangeListenerC17001c() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
                BaseInputField.m91033j(BaseInputField.this, view, i12, i13, i14, i15, i16, i17, i18, i19);
            }
        });
        m91041y();
        textView.setMaxLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView2.setSingleLine(false);
        textView2.setEllipsize(truncateAt);
        this.f86889J = new InterfaceC16996d() { // from class: com.zing.zalo.zdesign.component.inputfield.d
            public /* synthetic */ C17002d() {
            }

            @Override // com.zing.zalo.zdesign.component.inputfield.BaseInputField.InterfaceC16996d
            /* renamed from: a */
            public final void mo91048a(boolean z11) {
                BaseInputField.m91034k(BaseInputField.this, z11);
            }
        };
        editText.setTextContextChangeListener(new C16993a());
    }
}
