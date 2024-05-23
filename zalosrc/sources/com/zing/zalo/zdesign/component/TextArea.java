package com.zing.zalo.zdesign.component;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import bi0.AbstractC2807a;
import bi0.AbstractC2814h;
import bi0.AbstractC2815i;
import bi0.AbstractC2816j;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.inputfield.BaseInputField;
import com.zing.zalo.zdesign.component.inputfield.EditText;
import com.zing.zalo.zdesign.component.inputfield.EnumC17006h;
import com.zing.zalocore.CoreUtility;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import kotlin.NoWhenBranchMatchedException;
import qm0.AbstractC25356m;
import ti0.C26703b;
import ti0.C26705d;
import ti0.C26708g;
import ui0.C27276c;

/* loaded from: classes7.dex */
public class TextArea extends BaseInputField {
    public static final C16934a Companion = new C16934a(null);

    /* renamed from: b0 */
    private static final int f86429b0;

    /* renamed from: c0 */
    private static final int f86430c0;

    /* renamed from: V */
    private int f86431V;

    /* renamed from: W */
    private RobotoTextView f86432W;

    /* renamed from: a0 */
    private EnumC17053t f86433a0;

    /* renamed from: com.zing.zalo.zdesign.component.TextArea$a */
    /* loaded from: classes7.dex */
    public static final class C16934a {
        private C16934a() {
        }

        public /* synthetic */ C16934a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.zdesign.component.TextArea$b */
    /* loaded from: classes7.dex */
    public /* synthetic */ class C16935b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f86434a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f86435b;

        static {
            int[] iArr = new int[EnumC17053t.values().length];
            try {
                iArr[EnumC17053t.Never.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC17053t.Always.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC17053t.WhileEditing.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f86434a = iArr;
            int[] iArr2 = new int[EnumC17006h.values().length];
            try {
                iArr2[EnumC17006h.Never.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[EnumC17006h.Always.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[EnumC17006h.WhileEditing.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[EnumC17006h.UnlessEditing.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            f86435b = iArr2;
        }
    }

    /* renamed from: com.zing.zalo.zdesign.component.TextArea$c */
    /* loaded from: classes7.dex */
    public static final class C16936c implements TextWatcher {
        C16936c() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            RobotoTextView robotoTextView = TextArea.this.f86432W;
            if (robotoTextView == null) {
                AbstractC19074t.m100223u("counterTextView");
                robotoTextView = null;
            }
            robotoTextView.setText(String.valueOf(TextArea.this.f86431V - TextArea.this.getCurrentCharCount()));
            TextArea.this.m90693M();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        }
    }

    static {
        Context appContext = CoreUtility.getAppContext();
        AbstractC19074t.m100207e(appContext, "getAppContext()");
        f86429b0 = C27276c.m139649b(appContext, 120);
        Context appContext2 = CoreUtility.getAppContext();
        AbstractC19074t.m100207e(appContext2, "getAppContext()");
        f86430c0 = C27276c.m139649b(appContext2, 400);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextArea(Context context) {
        this(context, null);
        AbstractC19074t.m100208f(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M */
    public final void m90693M() {
        int i11 = 8;
        RobotoTextView robotoTextView = null;
        if (this.f86431V == Integer.MAX_VALUE) {
            RobotoTextView robotoTextView2 = this.f86432W;
            if (robotoTextView2 == null) {
                AbstractC19074t.m100223u("counterTextView");
            } else {
                robotoTextView = robotoTextView2;
            }
            robotoTextView.setVisibility(8);
            return;
        }
        int i12 = C16935b.f86434a[this.f86433a0.ordinal()];
        boolean z11 = true;
        if (i12 != 1) {
            if (i12 != 2) {
                if (i12 == 3) {
                    z11 = getEditText().isFocused();
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
        } else {
            z11 = false;
        }
        RobotoTextView robotoTextView3 = this.f86432W;
        if (robotoTextView3 == null) {
            AbstractC19074t.m100223u("counterTextView");
        } else {
            robotoTextView = robotoTextView3;
        }
        if (z11) {
            i11 = 0;
        }
        robotoTextView.setVisibility(i11);
    }

    /* renamed from: N */
    private final void m90694N() {
        LinearLayout rightControlsLayout = getRightControlsLayout();
        Context context = getContext();
        AbstractC19074t.m100207e(context, "context");
        rightControlsLayout.setPadding(0, 0, 0, C27276c.m139649b(context, 12));
        Context context2 = getContext();
        AbstractC19074t.m100207e(context2, "context");
        this.f86432W = new RobotoTextView(context2);
        setMaxLength(this.f86431V);
        getRightLayoutInput().setGravity(5);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(12);
        Context context3 = getContext();
        AbstractC19074t.m100207e(context3, "context");
        layoutParams.setMarginStart(C27276c.m139649b(context3, 12));
        Context context4 = getContext();
        AbstractC19074t.m100207e(context4, "context");
        layoutParams.setMarginEnd(C27276c.m139649b(context4, 12));
        Context context5 = getContext();
        AbstractC19074t.m100207e(context5, "context");
        C26703b m137293a = C26705d.m137293a(context5, AbstractC2814h.t_xxxsmall_m);
        RobotoTextView robotoTextView = this.f86432W;
        RobotoTextView robotoTextView2 = null;
        if (robotoTextView == null) {
            AbstractC19074t.m100223u("counterTextView");
            robotoTextView = null;
        }
        new C26708g(robotoTextView).m137319a(m137293a);
        RobotoTextView robotoTextView3 = this.f86432W;
        if (robotoTextView3 == null) {
            AbstractC19074t.m100223u("counterTextView");
            robotoTextView3 = null;
        }
        AbstractC2816j.a aVar = AbstractC2816j.Companion;
        Context context6 = getContext();
        AbstractC19074t.m100207e(context6, "context");
        robotoTextView3.setTextColor(aVar.m13592a(context6, AbstractC2807a.text_02));
        getRightLayoutTextArea().setVisibility(0);
        LinearLayout rightLayoutTextArea = getRightLayoutTextArea();
        RobotoTextView robotoTextView4 = this.f86432W;
        if (robotoTextView4 == null) {
            AbstractC19074t.m100223u("counterTextView");
        } else {
            robotoTextView2 = robotoTextView4;
        }
        rightLayoutTextArea.addView(robotoTextView2, layoutParams);
        m90693M();
        getEditText().addTextChangedListener(new C16936c());
        getEditText().setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.zing.zalo.zdesign.component.a1
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z11) {
                TextArea.m90695O(TextArea.this, view, z11);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O */
    public static final void m90695O(TextArea textArea, View view, boolean z11) {
        AbstractC19074t.m100208f(textArea, "this$0");
        textArea.m90693M();
    }

    /* renamed from: P */
    private final void m90696P() {
        Context context = getContext();
        AbstractC19074t.m100207e(context, "context");
        int m139649b = C27276c.m139649b(context, 12);
        getEditText().setPadding(getEditText().getPaddingLeft(), m139649b, getEditText().getPaddingRight(), m139649b);
        getEditText().setOverScrollMode(0);
        getEditText().setInputType(getEditText().getInputType() | 1);
        getEditText().setSingleLine(false);
        getEditText().setGravity(48);
        getEditText().setOnTouchListener(new View.OnTouchListener() { // from class: com.zing.zalo.zdesign.component.z0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean m90697Q;
                m90697Q = TextArea.m90697Q(TextArea.this, view, motionEvent);
                return m90697Q;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Q */
    public static final boolean m90697Q(TextArea textArea, View view, MotionEvent motionEvent) {
        AbstractC19074t.m100208f(textArea, "this$0");
        if (textArea.getEditText().hasFocus()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            if ((motionEvent.getAction() & 255) == 8) {
                view.getParent().requestDisallowInterceptTouchEvent(false);
                return true;
            }
        }
        return false;
    }

    /* renamed from: R */
    private final void m90698R(AttributeSet attributeSet, int i11) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC2815i.TextArea, i11, 0);
            AbstractC19074t.m100207e(obtainStyledAttributes, "context.obtainStyledAttr…      0\n                )");
            getEditText().setMaxHeight(obtainStyledAttributes.getDimensionPixelSize(AbstractC2815i.TextArea_maxHeight, f86430c0));
            getEditText().setMinHeight(obtainStyledAttributes.getDimensionPixelSize(AbstractC2815i.TextArea_minHeight, f86429b0));
            if (obtainStyledAttributes.hasValue(AbstractC2815i.TextArea_maxLines)) {
                getEditText().setMaxLines(obtainStyledAttributes.getInt(AbstractC2815i.TextArea_maxLines, -1));
            }
            if (obtainStyledAttributes.hasValue(AbstractC2815i.TextArea_minLines)) {
                getEditText().setMinLines(obtainStyledAttributes.getDimensionPixelSize(AbstractC2815i.TextArea_minLines, -1));
            }
            if (obtainStyledAttributes.hasValue(AbstractC2815i.TextArea_maxLength)) {
                setMaxLength(obtainStyledAttributes.getInt(AbstractC2815i.TextArea_maxLength, this.f86431V));
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: S */
    private final void m90699S() {
        Context context = getContext();
        AbstractC19074t.m100207e(context, "context");
        int m139649b = C27276c.m139649b(context, 40);
        Context context2 = getContext();
        AbstractC19074t.m100207e(context2, "context");
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(m139649b, C27276c.m139649b(context2, 40));
        Context context3 = getContext();
        AbstractC19074t.m100207e(context3, "context");
        layoutParams.topMargin = C27276c.m139649b(context3, 3);
        getIcClearText().setLayoutParams(layoutParams);
        setBaseFormPaddingRight(0);
        LinearLayout rightControlsLayout = getRightControlsLayout();
        Context context4 = getContext();
        AbstractC19074t.m100207e(context4, "context");
        rightControlsLayout.setMinimumWidth(C27276c.m139649b(context4, 12));
        ViewGroup.LayoutParams layoutParams2 = getIcStateAccepted().getLayoutParams();
        if (!(layoutParams2 instanceof ViewGroup.MarginLayoutParams)) {
            layoutParams2 = null;
        }
        AbstractC19074t.m100206d(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
        Context context5 = getContext();
        AbstractC19074t.m100207e(context5, "context");
        marginLayoutParams.topMargin = C27276c.m139649b(context5, 15);
        Context context6 = getContext();
        AbstractC19074t.m100207e(context6, "context");
        marginLayoutParams.rightMargin = C27276c.m139649b(context6, 0);
        getIcStateAccepted().setLayoutParams(layoutParams2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getCurrentCharCount() {
        return String.valueOf(getEditText().getText()).length();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0033, code lost:            if (java.lang.String.valueOf(getEditText().getText()).length() > 0) goto L24;     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0058, code lost:            if (java.lang.String.valueOf(getEditText().getText()).length() > 0) goto L24;     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006b, code lost:            if (java.lang.String.valueOf(getEditText().getText()).length() > 0) goto L24;     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0073  */
    @Override // com.zing.zalo.zdesign.component.inputfield.BaseInputField
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo76216r() {
        int i11 = C16935b.f86435b[getClearIconMode().ordinal()];
        int i12 = 4;
        boolean z11 = true;
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 == 4) {
                        if (!getEditText().isFocused()) {
                        }
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } else if (getEditText().isFocused()) {
                }
            }
            ImageView icClearText = getIcClearText();
            if (z11) {
                i12 = 0;
            }
            icClearText.setVisibility(i12);
        }
        z11 = false;
        ImageView icClearText2 = getIcClearText();
        if (z11) {
        }
        icClearText2.setVisibility(i12);
    }

    public final void setCharCounterMode(EnumC17053t enumC17053t) {
        AbstractC19074t.m100208f(enumC17053t, "mode");
        this.f86433a0 = enumC17053t;
        m90693M();
    }

    @Override // com.zing.zalo.zdesign.component.inputfield.BaseInputField, android.view.View
    public void setEnabled(boolean z11) {
        super.setEnabled(z11);
        if (!z11) {
            RobotoTextView robotoTextView = this.f86432W;
            if (robotoTextView == null) {
                AbstractC19074t.m100223u("counterTextView");
                robotoTextView = null;
            }
            robotoTextView.setVisibility(8);
            return;
        }
        mo76216r();
    }

    @Override // com.zing.zalo.zdesign.component.inputfield.BaseInputField
    public void setMaxLength(int i11) {
        Object[] m131334q;
        Object[] m131333p;
        this.f86431V = i11;
        Object[] objArr = new InputFilter[0];
        InputFilter[] filters = getEditText().getFilters();
        AbstractC19074t.m100207e(filters, "editText.filters");
        for (InputFilter inputFilter : filters) {
            if (!(inputFilter instanceof BaseInputField.C16994b)) {
                AbstractC19074t.m100207e(inputFilter, "it");
                objArr = AbstractC25356m.m131333p(objArr, inputFilter);
            }
        }
        getEditText().setFilters(new InputFilter[0]);
        EditText editText = getEditText();
        InputFilter[] filters2 = editText.getFilters();
        AbstractC19074t.m100207e(filters2, "editText.filters");
        m131334q = AbstractC25356m.m131334q(filters2, objArr);
        editText.setFilters((InputFilter[]) m131334q);
        EditText editText2 = getEditText();
        InputFilter[] filters3 = editText2.getFilters();
        AbstractC19074t.m100207e(filters3, "editText.filters");
        m131333p = AbstractC25356m.m131333p(filters3, new BaseInputField.C16994b(i11, getDefaultTextLengthExceedListener()));
        editText2.setFilters((InputFilter[]) m131333p);
        RobotoTextView robotoTextView = this.f86432W;
        if (robotoTextView == null) {
            AbstractC19074t.m100223u("counterTextView");
            robotoTextView = null;
        }
        robotoTextView.setText(String.valueOf(i11 - getCurrentCharCount()));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextArea(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        AbstractC19074t.m100208f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextArea(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
        this.f86431V = Integer.MAX_VALUE;
        this.f86433a0 = EnumC17053t.WhileEditing;
        m91047v();
        m90699S();
        m90696P();
        m90694N();
        m90698R(attributeSet, i11);
    }
}
