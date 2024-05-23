package com.google.android.material.textfield;

import android.R;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AbstractC1225y0;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.C1167f;
import androidx.appcompat.widget.C1211t1;
import androidx.core.content.AbstractC1388a;
import androidx.core.graphics.drawable.AbstractC1414a;
import androidx.core.text.C1462a;
import androidx.core.view.AbstractC1579n0;
import androidx.core.view.AbstractC1613w;
import androidx.core.view.C1490a;
import androidx.core.view.accessibility.C1507g0;
import androidx.core.widget.AbstractC1640l;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.internal.AbstractC6336c;
import com.google.android.material.internal.AbstractC6355v;
import com.google.android.material.internal.AbstractC6359z;
import com.google.android.material.internal.C6334a;
import com.google.android.material.internal.CheckableImageButton;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p013a7.AbstractC0638a;
import p193h0.AbstractC19694b;
import p357n6.AbstractC23577b;
import p357n6.AbstractC23578c;
import p357n6.AbstractC23579d;
import p357n6.AbstractC23581f;
import p357n6.AbstractC23583h;
import p357n6.AbstractC23585j;
import p357n6.AbstractC23586k;
import p357n6.AbstractC23587l;
import p382o6.AbstractC24041a;
import p439q6.AbstractC25136a;
import p599w6.AbstractC28774c;
import p706z6.C31689h;
import p706z6.C31694m;

/* loaded from: classes3.dex */
public class TextInputLayout extends LinearLayout {

    /* renamed from: b1 */
    private static final int f35978b1 = AbstractC23586k.Widget_Design_TextInputLayout;

    /* renamed from: A */
    private boolean f35979A;

    /* renamed from: A0 */
    private PorterDuff.Mode f35980A0;

    /* renamed from: B */
    private TextView f35981B;

    /* renamed from: B0 */
    private boolean f35982B0;

    /* renamed from: C */
    private int f35983C;

    /* renamed from: C0 */
    private Drawable f35984C0;

    /* renamed from: D */
    private int f35985D;

    /* renamed from: D0 */
    private int f35986D0;

    /* renamed from: E */
    private CharSequence f35987E;

    /* renamed from: E0 */
    private Drawable f35988E0;

    /* renamed from: F */
    private boolean f35989F;

    /* renamed from: F0 */
    private View.OnLongClickListener f35990F0;

    /* renamed from: G */
    private TextView f35991G;

    /* renamed from: G0 */
    private View.OnLongClickListener f35992G0;

    /* renamed from: H */
    private ColorStateList f35993H;

    /* renamed from: H0 */
    private final CheckableImageButton f35994H0;

    /* renamed from: I */
    private int f35995I;

    /* renamed from: I0 */
    private ColorStateList f35996I0;

    /* renamed from: J */
    private ColorStateList f35997J;

    /* renamed from: J0 */
    private ColorStateList f35998J0;

    /* renamed from: K */
    private ColorStateList f35999K;

    /* renamed from: K0 */
    private ColorStateList f36000K0;

    /* renamed from: L */
    private CharSequence f36001L;

    /* renamed from: L0 */
    private int f36002L0;

    /* renamed from: M */
    private final TextView f36003M;

    /* renamed from: M0 */
    private int f36004M0;

    /* renamed from: N */
    private CharSequence f36005N;

    /* renamed from: N0 */
    private int f36006N0;

    /* renamed from: O */
    private final TextView f36007O;

    /* renamed from: O0 */
    private ColorStateList f36008O0;

    /* renamed from: P */
    private boolean f36009P;

    /* renamed from: P0 */
    private int f36010P0;

    /* renamed from: Q */
    private CharSequence f36011Q;

    /* renamed from: Q0 */
    private int f36012Q0;

    /* renamed from: R */
    private boolean f36013R;

    /* renamed from: R0 */
    private int f36014R0;

    /* renamed from: S */
    private C31689h f36015S;

    /* renamed from: S0 */
    private int f36016S0;

    /* renamed from: T */
    private C31689h f36017T;

    /* renamed from: T0 */
    private int f36018T0;

    /* renamed from: U */
    private C31694m f36019U;

    /* renamed from: U0 */
    private boolean f36020U0;

    /* renamed from: V */
    private final int f36021V;

    /* renamed from: V0 */
    final C6334a f36022V0;

    /* renamed from: W */
    private int f36023W;

    /* renamed from: W0 */
    private boolean f36024W0;

    /* renamed from: X0 */
    private boolean f36025X0;

    /* renamed from: Y0 */
    private ValueAnimator f36026Y0;

    /* renamed from: Z0 */
    private boolean f36027Z0;

    /* renamed from: a0 */
    private int f36028a0;

    /* renamed from: a1 */
    private boolean f36029a1;

    /* renamed from: b0 */
    private int f36030b0;

    /* renamed from: c0 */
    private int f36031c0;

    /* renamed from: d0 */
    private int f36032d0;

    /* renamed from: e0 */
    private int f36033e0;

    /* renamed from: f0 */
    private int f36034f0;

    /* renamed from: g0 */
    private int f36035g0;

    /* renamed from: h0 */
    private final Rect f36036h0;

    /* renamed from: i0 */
    private final Rect f36037i0;

    /* renamed from: j0 */
    private final RectF f36038j0;

    /* renamed from: k0 */
    private Typeface f36039k0;

    /* renamed from: l0 */
    private final CheckableImageButton f36040l0;

    /* renamed from: m0 */
    private ColorStateList f36041m0;

    /* renamed from: n0 */
    private boolean f36042n0;

    /* renamed from: o0 */
    private PorterDuff.Mode f36043o0;

    /* renamed from: p */
    private final FrameLayout f36044p;

    /* renamed from: p0 */
    private boolean f36045p0;

    /* renamed from: q */
    private final LinearLayout f36046q;

    /* renamed from: q0 */
    private Drawable f36047q0;

    /* renamed from: r */
    private final LinearLayout f36048r;

    /* renamed from: r0 */
    private int f36049r0;

    /* renamed from: s */
    private final FrameLayout f36050s;

    /* renamed from: s0 */
    private View.OnLongClickListener f36051s0;

    /* renamed from: t */
    EditText f36052t;

    /* renamed from: t0 */
    private final LinkedHashSet f36053t0;

    /* renamed from: u */
    private CharSequence f36054u;

    /* renamed from: u0 */
    private int f36055u0;

    /* renamed from: v */
    private int f36056v;

    /* renamed from: v0 */
    private final SparseArray f36057v0;

    /* renamed from: w */
    private int f36058w;

    /* renamed from: w0 */
    private final CheckableImageButton f36059w0;

    /* renamed from: x */
    private final C6433f f36060x;

    /* renamed from: x0 */
    private final LinkedHashSet f36061x0;

    /* renamed from: y */
    boolean f36062y;

    /* renamed from: y0 */
    private ColorStateList f36063y0;

    /* renamed from: z */
    private int f36064z;

    /* renamed from: z0 */
    private boolean f36065z0;

    /* loaded from: classes3.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C6420a();

        /* renamed from: r */
        CharSequence f36066r;

        /* renamed from: s */
        boolean f36067s;

        /* renamed from: t */
        CharSequence f36068t;

        /* renamed from: u */
        CharSequence f36069u;

        /* renamed from: v */
        CharSequence f36070v;

        /* renamed from: com.google.android.material.textfield.TextInputLayout$SavedState$a */
        /* loaded from: classes3.dex */
        static class C6420a implements Parcelable.ClassLoaderCreator {
            C6420a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public SavedState[] newArray(int i11) {
                return new SavedState[i11];
            }
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f36066r) + " hint=" + ((Object) this.f36068t) + " helperText=" + ((Object) this.f36069u) + " placeholderText=" + ((Object) this.f36070v) + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            super.writeToParcel(parcel, i11);
            TextUtils.writeToParcel(this.f36066r, parcel, i11);
            parcel.writeInt(this.f36067s ? 1 : 0);
            TextUtils.writeToParcel(this.f36068t, parcel, i11);
            TextUtils.writeToParcel(this.f36069u, parcel, i11);
            TextUtils.writeToParcel(this.f36070v, parcel, i11);
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
            this.f36066r = (CharSequence) creator.createFromParcel(parcel);
            this.f36067s = parcel.readInt() == 1;
            this.f36068t = (CharSequence) creator.createFromParcel(parcel);
            this.f36069u = (CharSequence) creator.createFromParcel(parcel);
            this.f36070v = (CharSequence) creator.createFromParcel(parcel);
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$a */
    /* loaded from: classes3.dex */
    public class C6421a implements TextWatcher {
        C6421a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            TextInputLayout.this.m33133x0(!r0.f36029a1);
            TextInputLayout textInputLayout = TextInputLayout.this;
            if (textInputLayout.f36062y) {
                textInputLayout.m33131p0(editable.length());
            }
            if (TextInputLayout.this.f35989F) {
                TextInputLayout.this.m33053B0(editable.length());
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$b */
    /* loaded from: classes3.dex */
    class RunnableC6422b implements Runnable {
        RunnableC6422b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.f36059w0.performClick();
            TextInputLayout.this.f36059w0.jumpDrawablesToCurrentState();
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$c */
    /* loaded from: classes3.dex */
    class RunnableC6423c implements Runnable {
        RunnableC6423c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.f36052t.requestLayout();
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$d */
    /* loaded from: classes3.dex */
    public class C6424d implements ValueAnimator.AnimatorUpdateListener {
        C6424d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.f36022V0.m32537p0(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$e */
    /* loaded from: classes3.dex */
    public static class C6425e extends C1490a {

        /* renamed from: d */
        private final TextInputLayout f36075d;

        public C6425e(TextInputLayout textInputLayout) {
            this.f36075d = textInputLayout;
        }

        @Override // androidx.core.view.C1490a
        /* renamed from: g */
        public void mo7510g(View view, C1507g0 c1507g0) {
            CharSequence charSequence;
            String str;
            super.mo7510g(view, c1507g0);
            EditText editText = this.f36075d.getEditText();
            if (editText != null) {
                charSequence = editText.getText();
            } else {
                charSequence = null;
            }
            CharSequence hint = this.f36075d.getHint();
            CharSequence error = this.f36075d.getError();
            CharSequence placeholderText = this.f36075d.getPlaceholderText();
            int counterMaxLength = this.f36075d.getCounterMaxLength();
            CharSequence counterOverflowDescription = this.f36075d.getCounterOverflowDescription();
            boolean isEmpty = TextUtils.isEmpty(charSequence);
            boolean z11 = !isEmpty;
            boolean z12 = true;
            boolean z13 = !TextUtils.isEmpty(hint);
            boolean z14 = !this.f36075d.m33121P();
            boolean z15 = !TextUtils.isEmpty(error);
            if (!z15 && TextUtils.isEmpty(counterOverflowDescription)) {
                z12 = false;
            }
            if (z13) {
                str = hint.toString();
            } else {
                str = "";
            }
            if (z11) {
                c1507g0.m7592E0(charSequence);
            } else if (!TextUtils.isEmpty(str)) {
                c1507g0.m7592E0(str);
                if (z14 && placeholderText != null) {
                    c1507g0.m7592E0(str + ", " + ((Object) placeholderText));
                }
            } else if (placeholderText != null) {
                c1507g0.m7592E0(placeholderText);
            }
            if (!TextUtils.isEmpty(str)) {
                if (Build.VERSION.SDK_INT >= 26) {
                    c1507g0.m7634n0(str);
                } else {
                    if (z11) {
                        str = ((Object) charSequence) + ", " + str;
                    }
                    c1507g0.m7592E0(str);
                }
                c1507g0.m7585A0(isEmpty);
            }
            if (charSequence == null || charSequence.length() != counterMaxLength) {
                counterMaxLength = -1;
            }
            c1507g0.m7638p0(counterMaxLength);
            if (z12) {
                if (!z15) {
                    error = counterOverflowDescription;
                }
                c1507g0.m7627j0(error);
            }
            if (editText != null) {
                editText.setLabelFor(AbstractC23581f.textinput_helper_text);
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$f */
    /* loaded from: classes3.dex */
    public interface InterfaceC6426f {
        /* renamed from: a */
        void mo33137a(TextInputLayout textInputLayout);
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$g */
    /* loaded from: classes3.dex */
    public interface InterfaceC6427g {
        /* renamed from: a */
        void mo33138a(TextInputLayout textInputLayout, int i11);
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC23577b.textInputStyle);
    }

    /* renamed from: A */
    private void m33050A() {
        if (m33054C()) {
            ((C6430c) this.f36015S).m33156u0();
        }
    }

    /* renamed from: A0 */
    private void m33051A0() {
        int length;
        EditText editText = this.f36052t;
        if (editText == null) {
            length = 0;
        } else {
            length = editText.getText().length();
        }
        m33053B0(length);
    }

    /* renamed from: B */
    private void m33052B(boolean z11) {
        ValueAnimator valueAnimator = this.f36026Y0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f36026Y0.cancel();
        }
        if (z11 && this.f36025X0) {
            m33130i(1.0f);
        } else {
            this.f36022V0.m32537p0(1.0f);
        }
        this.f36020U0 = false;
        if (m33054C()) {
            m33073V();
        }
        m33051A0();
        m33057D0();
        m33063G0();
    }

    /* renamed from: B0 */
    public void m33053B0(int i11) {
        if (i11 == 0 && !this.f36020U0) {
            m33092k0();
        } else {
            m33068L();
        }
    }

    /* renamed from: C */
    private boolean m33054C() {
        if (this.f36009P && !TextUtils.isEmpty(this.f36011Q) && (this.f36015S instanceof C6430c)) {
            return true;
        }
        return false;
    }

    /* renamed from: C0 */
    private void m33055C0() {
        int m7820K;
        if (this.f36052t == null) {
            return;
        }
        if (m33123S()) {
            m7820K = 0;
        } else {
            m7820K = AbstractC1579n0.m7820K(this.f36052t);
        }
        AbstractC1579n0.m7837S0(this.f36003M, m7820K, this.f36052t.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(AbstractC23579d.material_input_text_to_prefix_suffix_padding), this.f36052t.getCompoundPaddingBottom());
    }

    /* renamed from: D */
    private void m33056D() {
        Iterator it = this.f36053t0.iterator();
        while (it.hasNext()) {
            ((InterfaceC6426f) it.next()).mo33137a(this);
        }
    }

    /* renamed from: D0 */
    private void m33057D0() {
        int i11;
        TextView textView = this.f36003M;
        if (this.f36001L != null && !m33121P()) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        textView.setVisibility(i11);
        m33107t0();
    }

    /* renamed from: E */
    private void m33058E(int i11) {
        Iterator it = this.f36061x0.iterator();
        while (it.hasNext()) {
            ((InterfaceC6427g) it.next()).mo33138a(this, i11);
        }
    }

    /* renamed from: E0 */
    private void m33059E0(boolean z11, boolean z12) {
        int defaultColor = this.f36008O0.getDefaultColor();
        int colorForState = this.f36008O0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.f36008O0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z11) {
            this.f36034f0 = colorForState2;
        } else if (z12) {
            this.f36034f0 = colorForState;
        } else {
            this.f36034f0 = defaultColor;
        }
    }

    /* renamed from: F */
    private void m33060F(Canvas canvas) {
        C31689h c31689h = this.f36017T;
        if (c31689h != null) {
            Rect bounds = c31689h.getBounds();
            bounds.top = bounds.bottom - this.f36031c0;
            this.f36017T.draw(canvas);
        }
    }

    /* renamed from: F0 */
    private void m33061F0() {
        int i11;
        if (this.f36052t == null) {
            return;
        }
        if (!m33119M() && !m33069N()) {
            i11 = AbstractC1579n0.m7818J(this.f36052t);
        } else {
            i11 = 0;
        }
        AbstractC1579n0.m7837S0(this.f36007O, getContext().getResources().getDimensionPixelSize(AbstractC23579d.material_input_text_to_prefix_suffix_padding), this.f36052t.getPaddingTop(), i11, this.f36052t.getPaddingBottom());
    }

    /* renamed from: G */
    private void m33062G(Canvas canvas) {
        if (this.f36009P) {
            this.f36022V0.m32533m(canvas);
        }
    }

    /* renamed from: G0 */
    private void m33063G0() {
        boolean z11;
        int visibility = this.f36007O.getVisibility();
        int i11 = 0;
        if (this.f36005N != null && !m33121P()) {
            z11 = true;
        } else {
            z11 = false;
        }
        TextView textView = this.f36007O;
        if (!z11) {
            i11 = 8;
        }
        textView.setVisibility(i11);
        if (visibility != this.f36007O.getVisibility()) {
            getEndIconDelegate().mo33149c(z11);
        }
        m33107t0();
    }

    /* renamed from: H */
    private void m33064H(boolean z11) {
        ValueAnimator valueAnimator = this.f36026Y0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f36026Y0.cancel();
        }
        if (z11 && this.f36025X0) {
            m33130i(0.0f);
        } else {
            this.f36022V0.m32537p0(0.0f);
        }
        if (m33054C() && ((C6430c) this.f36015S).m33155r0()) {
            m33050A();
        }
        this.f36020U0 = true;
        m33068L();
        m33057D0();
        m33063G0();
    }

    /* renamed from: I */
    private int m33065I(int i11, boolean z11) {
        int compoundPaddingLeft = i11 + this.f36052t.getCompoundPaddingLeft();
        if (this.f36001L != null && !z11) {
            return (compoundPaddingLeft - this.f36003M.getMeasuredWidth()) + this.f36003M.getPaddingLeft();
        }
        return compoundPaddingLeft;
    }

    /* renamed from: J */
    private int m33066J(int i11, boolean z11) {
        int compoundPaddingRight = i11 - this.f36052t.getCompoundPaddingRight();
        if (this.f36001L != null && z11) {
            return compoundPaddingRight + (this.f36003M.getMeasuredWidth() - this.f36003M.getPaddingRight());
        }
        return compoundPaddingRight;
    }

    /* renamed from: K */
    private boolean m33067K() {
        return this.f36055u0 != 0;
    }

    /* renamed from: L */
    private void m33068L() {
        TextView textView = this.f35991G;
        if (textView != null && this.f35989F) {
            textView.setText((CharSequence) null);
            this.f35991G.setVisibility(4);
        }
    }

    /* renamed from: N */
    private boolean m33069N() {
        if (this.f35994H0.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: R */
    private boolean m33070R() {
        if (this.f36028a0 == 1 && this.f36052t.getMinLines() <= 1) {
            return true;
        }
        return false;
    }

    /* renamed from: T */
    private int[] m33071T(CheckableImageButton checkableImageButton) {
        int[] drawableState = getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
        return copyOf;
    }

    /* renamed from: U */
    private void m33072U() {
        m33101q();
        m33080c0();
        m33118H0();
        m33096m0();
        m33086h();
        if (this.f36028a0 != 0) {
            m33112w0();
        }
    }

    /* renamed from: V */
    private void m33073V() {
        if (!m33054C()) {
            return;
        }
        RectF rectF = this.f36038j0;
        this.f36022V0.m32536p(rectF, this.f36052t.getWidth(), this.f36052t.getGravity());
        m33093l(rectF);
        int i11 = this.f36031c0;
        this.f36023W = i11;
        rectF.top = 0.0f;
        rectF.bottom = i11;
        rectF.offset(-getPaddingLeft(), 0.0f);
        ((C6430c) this.f36015S).m33158x0(rectF);
    }

    /* renamed from: W */
    private static void m33074W(ViewGroup viewGroup, boolean z11) {
        int childCount = viewGroup.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = viewGroup.getChildAt(i11);
            childAt.setEnabled(z11);
            if (childAt instanceof ViewGroup) {
                m33074W((ViewGroup) childAt, z11);
            }
        }
    }

    /* renamed from: Z */
    private void m33075Z(CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() != null && colorStateList != null && colorStateList.isStateful()) {
            int colorForState = colorStateList.getColorForState(m33071T(checkableImageButton), colorStateList.getDefaultColor());
            Drawable mutate = AbstractC1414a.m7200r(drawable).mutate();
            AbstractC1414a.m7197o(mutate, ColorStateList.valueOf(colorForState));
            checkableImageButton.setImageDrawable(mutate);
        }
    }

    /* renamed from: b0 */
    private void m33078b0() {
        TextView textView = this.f35991G;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    /* renamed from: c0 */
    private void m33080c0() {
        if (m33090j0()) {
            AbstractC1579n0.m7807D0(this.f36052t, this.f36015S);
        }
    }

    /* renamed from: d0 */
    private static void m33082d0(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean z11;
        boolean m7850Z = AbstractC1579n0.m7850Z(checkableImageButton);
        boolean z12 = false;
        int i11 = 1;
        if (onLongClickListener != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (m7850Z || z11) {
            z12 = true;
        }
        checkableImageButton.setFocusable(z12);
        checkableImageButton.setClickable(m7850Z);
        checkableImageButton.setPressable(m7850Z);
        checkableImageButton.setLongClickable(z11);
        if (!z12) {
            i11 = 2;
        }
        AbstractC1579n0.m7823L0(checkableImageButton, i11);
    }

    /* renamed from: e0 */
    private static void m33083e0(CheckableImageButton checkableImageButton, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnClickListener(onClickListener);
        m33082d0(checkableImageButton, onLongClickListener);
    }

    /* renamed from: f0 */
    private static void m33084f0(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        m33082d0(checkableImageButton, onLongClickListener);
    }

    /* renamed from: g */
    private void m33085g() {
        TextView textView = this.f35991G;
        if (textView != null) {
            this.f36044p.addView(textView);
            this.f35991G.setVisibility(0);
        }
    }

    private AbstractC6432e getEndIconDelegate() {
        AbstractC6432e abstractC6432e = (AbstractC6432e) this.f36057v0.get(this.f36055u0);
        if (abstractC6432e == null) {
            return (AbstractC6432e) this.f36057v0.get(0);
        }
        return abstractC6432e;
    }

    private CheckableImageButton getEndIconToUpdateDummyDrawable() {
        if (this.f35994H0.getVisibility() == 0) {
            return this.f35994H0;
        }
        if (m33067K() && m33119M()) {
            return this.f36059w0;
        }
        return null;
    }

    /* renamed from: h */
    private void m33086h() {
        if (this.f36052t != null && this.f36028a0 == 1) {
            if (AbstractC28774c.m143980h(getContext())) {
                EditText editText = this.f36052t;
                AbstractC1579n0.m7837S0(editText, AbstractC1579n0.m7820K(editText), getResources().getDimensionPixelSize(AbstractC23579d.material_filled_edittext_font_2_0_padding_top), AbstractC1579n0.m7818J(this.f36052t), getResources().getDimensionPixelSize(AbstractC23579d.material_filled_edittext_font_2_0_padding_bottom));
            } else if (AbstractC28774c.m143979g(getContext())) {
                EditText editText2 = this.f36052t;
                AbstractC1579n0.m7837S0(editText2, AbstractC1579n0.m7820K(editText2), getResources().getDimensionPixelSize(AbstractC23579d.material_filled_edittext_font_1_3_padding_top), AbstractC1579n0.m7818J(this.f36052t), getResources().getDimensionPixelSize(AbstractC23579d.material_filled_edittext_font_1_3_padding_bottom));
            }
        }
    }

    /* renamed from: h0 */
    private boolean m33087h0() {
        if ((this.f35994H0.getVisibility() == 0 || ((m33067K() && m33119M()) || this.f36005N != null)) && this.f36048r.getMeasuredWidth() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: i0 */
    private boolean m33088i0() {
        if ((getStartIconDrawable() != null || this.f36001L != null) && this.f36046q.getMeasuredWidth() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    private void m33089j() {
        C31689h c31689h = this.f36015S;
        if (c31689h == null) {
            return;
        }
        c31689h.setShapeAppearanceModel(this.f36019U);
        if (m33114y()) {
            this.f36015S.m152451k0(this.f36031c0, this.f36034f0);
        }
        int m33103r = m33103r();
        this.f36035g0 = m33103r;
        this.f36015S.m152442c0(ColorStateList.valueOf(m33103r));
        if (this.f36055u0 == 3) {
            this.f36052t.getBackground().invalidateSelf();
        }
        m33091k();
        invalidate();
    }

    /* renamed from: j0 */
    private boolean m33090j0() {
        EditText editText = this.f36052t;
        if (editText != null && this.f36015S != null && editText.getBackground() == null && this.f36028a0 != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    private void m33091k() {
        if (this.f36017T == null) {
            return;
        }
        if (m33116z()) {
            this.f36017T.m152442c0(ColorStateList.valueOf(this.f36034f0));
        }
        invalidate();
    }

    /* renamed from: k0 */
    private void m33092k0() {
        TextView textView = this.f35991G;
        if (textView != null && this.f35989F) {
            textView.setText(this.f35987E);
            this.f35991G.setVisibility(0);
            this.f35991G.bringToFront();
        }
    }

    /* renamed from: l */
    private void m33093l(RectF rectF) {
        float f11 = rectF.left;
        int i11 = this.f36021V;
        rectF.left = f11 - i11;
        rectF.right += i11;
    }

    /* renamed from: l0 */
    private void m33094l0(boolean z11) {
        if (z11 && getEndIconDrawable() != null) {
            Drawable mutate = AbstractC1414a.m7200r(getEndIconDrawable()).mutate();
            AbstractC1414a.m7196n(mutate, this.f36060x.m33222o());
            this.f36059w0.setImageDrawable(mutate);
            return;
        }
        m33095m();
    }

    /* renamed from: m */
    private void m33095m() {
        m33097n(this.f36059w0, this.f36065z0, this.f36063y0, this.f35982B0, this.f35980A0);
    }

    /* renamed from: m0 */
    private void m33096m0() {
        if (this.f36028a0 == 1) {
            if (AbstractC28774c.m143980h(getContext())) {
                this.f36030b0 = getResources().getDimensionPixelSize(AbstractC23579d.material_font_2_0_box_collapsed_padding_top);
            } else if (AbstractC28774c.m143979g(getContext())) {
                this.f36030b0 = getResources().getDimensionPixelSize(AbstractC23579d.material_font_1_3_box_collapsed_padding_top);
            }
        }
    }

    /* renamed from: n */
    private void m33097n(CheckableImageButton checkableImageButton, boolean z11, ColorStateList colorStateList, boolean z12, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null && (z11 || z12)) {
            drawable = AbstractC1414a.m7200r(drawable).mutate();
            if (z11) {
                AbstractC1414a.m7197o(drawable, colorStateList);
            }
            if (z12) {
                AbstractC1414a.m7198p(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    /* renamed from: n0 */
    private void m33098n0(Rect rect) {
        C31689h c31689h = this.f36017T;
        if (c31689h != null) {
            int i11 = rect.bottom;
            c31689h.setBounds(rect.left, i11 - this.f36033e0, rect.right, i11);
        }
    }

    /* renamed from: o0 */
    private void m33099o0() {
        int length;
        if (this.f35981B != null) {
            EditText editText = this.f36052t;
            if (editText == null) {
                length = 0;
            } else {
                length = editText.getText().length();
            }
            m33131p0(length);
        }
    }

    /* renamed from: p */
    private void m33100p() {
        m33097n(this.f36040l0, this.f36042n0, this.f36041m0, this.f36045p0, this.f36043o0);
    }

    /* renamed from: q */
    private void m33101q() {
        int i11 = this.f36028a0;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    if (this.f36009P && !(this.f36015S instanceof C6430c)) {
                        this.f36015S = new C6430c(this.f36019U);
                    } else {
                        this.f36015S = new C31689h(this.f36019U);
                    }
                    this.f36017T = null;
                    return;
                }
                throw new IllegalArgumentException(this.f36028a0 + " is illegal; only @BoxBackgroundMode constants are supported.");
            }
            this.f36015S = new C31689h(this.f36019U);
            this.f36017T = new C31689h();
            return;
        }
        this.f36015S = null;
        this.f36017T = null;
    }

    /* renamed from: q0 */
    private static void m33102q0(Context context, TextView textView, int i11, int i12, boolean z11) {
        int i13;
        if (z11) {
            i13 = AbstractC23585j.character_counter_overflowed_content_description;
        } else {
            i13 = AbstractC23585j.character_counter_content_description;
        }
        textView.setContentDescription(context.getString(i13, Integer.valueOf(i11), Integer.valueOf(i12)));
    }

    /* renamed from: r */
    private int m33103r() {
        int i11 = this.f36035g0;
        if (this.f36028a0 == 1) {
            return AbstractC25136a.m130296f(AbstractC25136a.m130295e(this, AbstractC23577b.colorSurface, 0), this.f36035g0);
        }
        return i11;
    }

    /* renamed from: r0 */
    private void m33104r0() {
        int i11;
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.f35981B;
        if (textView != null) {
            if (this.f35979A) {
                i11 = this.f35983C;
            } else {
                i11 = this.f35985D;
            }
            m33129g0(textView, i11);
            if (!this.f35979A && (colorStateList2 = this.f35997J) != null) {
                this.f35981B.setTextColor(colorStateList2);
            }
            if (this.f35979A && (colorStateList = this.f35999K) != null) {
                this.f35981B.setTextColor(colorStateList);
            }
        }
    }

    /* renamed from: s */
    private Rect m33105s(Rect rect) {
        boolean z11;
        if (this.f36052t != null) {
            Rect rect2 = this.f36037i0;
            if (AbstractC1579n0.m7812G(this) == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            rect2.bottom = rect.bottom;
            int i11 = this.f36028a0;
            if (i11 != 1) {
                if (i11 != 2) {
                    rect2.left = m33065I(rect.left, z11);
                    rect2.top = getPaddingTop();
                    rect2.right = m33066J(rect.right, z11);
                    return rect2;
                }
                rect2.left = rect.left + this.f36052t.getPaddingLeft();
                rect2.top = rect.top - m33113x();
                rect2.right = rect.right - this.f36052t.getPaddingRight();
                return rect2;
            }
            rect2.left = m33065I(rect.left, z11);
            rect2.top = rect.top + this.f36030b0;
            rect2.right = m33066J(rect.right, z11);
            return rect2;
        }
        throw new IllegalStateException();
    }

    /* renamed from: s0 */
    private void m33106s0() {
        if (m33054C() && !this.f36020U0 && this.f36023W != this.f36031c0) {
            m33050A();
            m33073V();
        }
    }

    private void setEditText(EditText editText) {
        if (this.f36052t == null) {
            if (this.f36055u0 != 3) {
                boolean z11 = editText instanceof TextInputEditText;
            }
            this.f36052t = editText;
            setMinWidth(this.f36056v);
            setMaxWidth(this.f36058w);
            m33072U();
            setTextInputAccessibilityDelegate(new C6425e(this));
            this.f36022V0.m32507C0(this.f36052t.getTypeface());
            this.f36022V0.m32534m0(this.f36052t.getTextSize());
            int gravity = this.f36052t.getGravity();
            this.f36022V0.m32525c0((gravity & (-113)) | 48);
            this.f36022V0.m32532l0(gravity);
            this.f36052t.addTextChangedListener(new C6421a());
            if (this.f35998J0 == null) {
                this.f35998J0 = this.f36052t.getHintTextColors();
            }
            if (this.f36009P) {
                if (TextUtils.isEmpty(this.f36011Q)) {
                    CharSequence hint = this.f36052t.getHint();
                    this.f36054u = hint;
                    setHint(hint);
                    this.f36052t.setHint((CharSequence) null);
                }
                this.f36013R = true;
            }
            if (this.f35981B != null) {
                m33131p0(this.f36052t.getText().length());
            }
            m33132u0();
            this.f36060x.m33217e();
            this.f36046q.bringToFront();
            this.f36048r.bringToFront();
            this.f36050s.bringToFront();
            this.f35994H0.bringToFront();
            m33056D();
            m33055C0();
            m33061F0();
            if (!isEnabled()) {
                editText.setEnabled(false);
            }
            m33115y0(false, true);
            return;
        }
        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }

    private void setErrorIconVisible(boolean z11) {
        int i11;
        CheckableImageButton checkableImageButton = this.f35994H0;
        int i12 = 8;
        if (z11) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        checkableImageButton.setVisibility(i11);
        FrameLayout frameLayout = this.f36050s;
        if (!z11) {
            i12 = 0;
        }
        frameLayout.setVisibility(i12);
        m33061F0();
        if (!m33067K()) {
            m33107t0();
        }
    }

    private void setHintInternal(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.f36011Q)) {
            this.f36011Q = charSequence;
            this.f36022V0.m32503A0(charSequence);
            if (!this.f36020U0) {
                m33073V();
            }
        }
    }

    private void setPlaceholderTextEnabled(boolean z11) {
        if (this.f35989F == z11) {
            return;
        }
        if (z11) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
            this.f35991G = appCompatTextView;
            appCompatTextView.setId(AbstractC23581f.textinput_placeholder);
            AbstractC1579n0.m7803B0(this.f35991G, 1);
            setPlaceholderTextAppearance(this.f35995I);
            setPlaceholderTextColor(this.f35993H);
            m33085g();
        } else {
            m33078b0();
            this.f35991G = null;
        }
        this.f35989F = z11;
    }

    /* renamed from: t0 */
    private boolean m33107t0() {
        boolean z11;
        if (this.f36052t == null) {
            return false;
        }
        boolean z12 = true;
        if (m33088i0()) {
            int measuredWidth = this.f36046q.getMeasuredWidth() - this.f36052t.getPaddingLeft();
            if (this.f36047q0 == null || this.f36049r0 != measuredWidth) {
                ColorDrawable colorDrawable = new ColorDrawable();
                this.f36047q0 = colorDrawable;
                this.f36049r0 = measuredWidth;
                colorDrawable.setBounds(0, 0, measuredWidth, 1);
            }
            Drawable[] m8410a = AbstractC1640l.m8410a(this.f36052t);
            Drawable drawable = m8410a[0];
            Drawable drawable2 = this.f36047q0;
            if (drawable != drawable2) {
                AbstractC1640l.m8419j(this.f36052t, drawable2, m8410a[1], m8410a[2], m8410a[3]);
                z11 = true;
            }
            z11 = false;
        } else {
            if (this.f36047q0 != null) {
                Drawable[] m8410a2 = AbstractC1640l.m8410a(this.f36052t);
                AbstractC1640l.m8419j(this.f36052t, null, m8410a2[1], m8410a2[2], m8410a2[3]);
                this.f36047q0 = null;
                z11 = true;
            }
            z11 = false;
        }
        if (m33087h0()) {
            int measuredWidth2 = this.f36007O.getMeasuredWidth() - this.f36052t.getPaddingRight();
            CheckableImageButton endIconToUpdateDummyDrawable = getEndIconToUpdateDummyDrawable();
            if (endIconToUpdateDummyDrawable != null) {
                measuredWidth2 = measuredWidth2 + endIconToUpdateDummyDrawable.getMeasuredWidth() + AbstractC1613w.m8235b((ViewGroup.MarginLayoutParams) endIconToUpdateDummyDrawable.getLayoutParams());
            }
            Drawable[] m8410a3 = AbstractC1640l.m8410a(this.f36052t);
            Drawable drawable3 = this.f35984C0;
            if (drawable3 != null && this.f35986D0 != measuredWidth2) {
                this.f35986D0 = measuredWidth2;
                drawable3.setBounds(0, 0, measuredWidth2, 1);
                AbstractC1640l.m8419j(this.f36052t, m8410a3[0], m8410a3[1], this.f35984C0, m8410a3[3]);
            } else {
                if (drawable3 == null) {
                    ColorDrawable colorDrawable2 = new ColorDrawable();
                    this.f35984C0 = colorDrawable2;
                    this.f35986D0 = measuredWidth2;
                    colorDrawable2.setBounds(0, 0, measuredWidth2, 1);
                }
                Drawable drawable4 = m8410a3[2];
                Drawable drawable5 = this.f35984C0;
                if (drawable4 != drawable5) {
                    this.f35988E0 = drawable4;
                    AbstractC1640l.m8419j(this.f36052t, m8410a3[0], m8410a3[1], drawable5, m8410a3[3]);
                } else {
                    z12 = z11;
                }
            }
        } else if (this.f35984C0 != null) {
            Drawable[] m8410a4 = AbstractC1640l.m8410a(this.f36052t);
            if (m8410a4[2] == this.f35984C0) {
                AbstractC1640l.m8419j(this.f36052t, m8410a4[0], m8410a4[1], this.f35988E0, m8410a4[3]);
            } else {
                z12 = z11;
            }
            this.f35984C0 = null;
        } else {
            return z11;
        }
        return z12;
    }

    /* renamed from: u */
    private int m33108u(Rect rect, Rect rect2, float f11) {
        if (m33070R()) {
            return (int) (rect2.top + f11);
        }
        return rect.bottom - this.f36052t.getCompoundPaddingBottom();
    }

    /* renamed from: v */
    private int m33109v(Rect rect, float f11) {
        if (m33070R()) {
            return (int) (rect.centerY() - (f11 / 2.0f));
        }
        return rect.top + this.f36052t.getCompoundPaddingTop();
    }

    /* renamed from: v0 */
    private boolean m33110v0() {
        int max;
        if (this.f36052t == null || this.f36052t.getMeasuredHeight() >= (max = Math.max(this.f36048r.getMeasuredHeight(), this.f36046q.getMeasuredHeight()))) {
            return false;
        }
        this.f36052t.setMinimumHeight(max);
        return true;
    }

    /* renamed from: w */
    private Rect m33111w(Rect rect) {
        if (this.f36052t != null) {
            Rect rect2 = this.f36037i0;
            float m32504B = this.f36022V0.m32504B();
            rect2.left = rect.left + this.f36052t.getCompoundPaddingLeft();
            rect2.top = m33109v(rect, m32504B);
            rect2.right = rect.right - this.f36052t.getCompoundPaddingRight();
            rect2.bottom = m33108u(rect, rect2, m32504B);
            return rect2;
        }
        throw new IllegalStateException();
    }

    /* renamed from: w0 */
    private void m33112w0() {
        if (this.f36028a0 != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f36044p.getLayoutParams();
            int m33113x = m33113x();
            if (m33113x != layoutParams.topMargin) {
                layoutParams.topMargin = m33113x;
                this.f36044p.requestLayout();
            }
        }
    }

    /* renamed from: x */
    private int m33113x() {
        float m32542s;
        if (!this.f36009P) {
            return 0;
        }
        int i11 = this.f36028a0;
        if (i11 != 0 && i11 != 1) {
            if (i11 != 2) {
                return 0;
            }
            m32542s = this.f36022V0.m32542s() / 2.0f;
        } else {
            m32542s = this.f36022V0.m32542s();
        }
        return (int) m32542s;
    }

    /* renamed from: y */
    private boolean m33114y() {
        if (this.f36028a0 == 2 && m33116z()) {
            return true;
        }
        return false;
    }

    /* renamed from: y0 */
    private void m33115y0(boolean z11, boolean z12) {
        boolean z13;
        ColorStateList colorStateList;
        TextView textView;
        int i11;
        boolean isEnabled = isEnabled();
        EditText editText = this.f36052t;
        boolean z14 = false;
        if (editText != null && !TextUtils.isEmpty(editText.getText())) {
            z13 = true;
        } else {
            z13 = false;
        }
        EditText editText2 = this.f36052t;
        if (editText2 != null && editText2.hasFocus()) {
            z14 = true;
        }
        boolean m33219k = this.f36060x.m33219k();
        ColorStateList colorStateList2 = this.f35998J0;
        if (colorStateList2 != null) {
            this.f36022V0.m32523b0(colorStateList2);
            this.f36022V0.m32531k0(this.f35998J0);
        }
        if (!isEnabled) {
            ColorStateList colorStateList3 = this.f35998J0;
            if (colorStateList3 != null) {
                i11 = colorStateList3.getColorForState(new int[]{-16842910}, this.f36018T0);
            } else {
                i11 = this.f36018T0;
            }
            this.f36022V0.m32523b0(ColorStateList.valueOf(i11));
            this.f36022V0.m32531k0(ColorStateList.valueOf(i11));
        } else if (m33219k) {
            this.f36022V0.m32523b0(this.f36060x.m33223p());
        } else if (this.f35979A && (textView = this.f35981B) != null) {
            this.f36022V0.m32523b0(textView.getTextColors());
        } else if (z14 && (colorStateList = this.f36000K0) != null) {
            this.f36022V0.m32523b0(colorStateList);
        }
        if (!z13 && this.f36024W0 && (!isEnabled() || !z14)) {
            if (z12 || !this.f36020U0) {
                m33064H(z11);
                return;
            }
            return;
        }
        if (z12 || this.f36020U0) {
            m33052B(z11);
        }
    }

    /* renamed from: z */
    private boolean m33116z() {
        return this.f36031c0 > -1 && this.f36034f0 != 0;
    }

    /* renamed from: z0 */
    private void m33117z0() {
        EditText editText;
        if (this.f35991G != null && (editText = this.f36052t) != null) {
            this.f35991G.setGravity(editText.getGravity());
            this.f35991G.setPadding(this.f36052t.getCompoundPaddingLeft(), this.f36052t.getCompoundPaddingTop(), this.f36052t.getCompoundPaddingRight(), this.f36052t.getCompoundPaddingBottom());
        }
    }

    /* renamed from: H0 */
    public void m33118H0() {
        boolean z11;
        boolean z12;
        TextView textView;
        EditText editText;
        EditText editText2;
        if (this.f36015S != null && this.f36028a0 != 0) {
            boolean z13 = false;
            if (!isFocused() && ((editText2 = this.f36052t) == null || !editText2.hasFocus())) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (!isHovered() && ((editText = this.f36052t) == null || !editText.isHovered())) {
                z12 = false;
            } else {
                z12 = true;
            }
            if (!isEnabled()) {
                this.f36034f0 = this.f36018T0;
            } else if (this.f36060x.m33219k()) {
                if (this.f36008O0 != null) {
                    m33059E0(z11, z12);
                } else {
                    this.f36034f0 = this.f36060x.m33222o();
                }
            } else if (this.f35979A && (textView = this.f35981B) != null) {
                if (this.f36008O0 != null) {
                    m33059E0(z11, z12);
                } else {
                    this.f36034f0 = textView.getCurrentTextColor();
                }
            } else if (z11) {
                this.f36034f0 = this.f36006N0;
            } else if (z12) {
                this.f36034f0 = this.f36004M0;
            } else {
                this.f36034f0 = this.f36002L0;
            }
            if (getErrorIconDrawable() != null && this.f36060x.m33229x() && this.f36060x.m33219k()) {
                z13 = true;
            }
            setErrorIconVisible(z13);
            m33125Y();
            m33126a0();
            m33124X();
            if (getEndIconDelegate().mo33190d()) {
                m33094l0(this.f36060x.m33219k());
            }
            if (z11 && isEnabled()) {
                this.f36031c0 = this.f36033e0;
            } else {
                this.f36031c0 = this.f36032d0;
            }
            if (this.f36028a0 == 2) {
                m33106s0();
            }
            if (this.f36028a0 == 1) {
                if (!isEnabled()) {
                    this.f36035g0 = this.f36012Q0;
                } else if (z12 && !z11) {
                    this.f36035g0 = this.f36016S0;
                } else if (z11) {
                    this.f36035g0 = this.f36014R0;
                } else {
                    this.f36035g0 = this.f36010P0;
                }
            }
            m33089j();
        }
    }

    /* renamed from: M */
    public boolean m33119M() {
        if (this.f36050s.getVisibility() == 0 && this.f36059w0.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: O */
    public boolean m33120O() {
        return this.f36060x.m33230y();
    }

    /* renamed from: P */
    final boolean m33121P() {
        return this.f36020U0;
    }

    /* renamed from: Q */
    public boolean m33122Q() {
        return this.f36013R;
    }

    /* renamed from: S */
    public boolean m33123S() {
        if (this.f36040l0.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: X */
    public void m33124X() {
        m33075Z(this.f36059w0, this.f36063y0);
    }

    /* renamed from: Y */
    public void m33125Y() {
        m33075Z(this.f35994H0, this.f35996I0);
    }

    /* renamed from: a0 */
    public void m33126a0() {
        m33075Z(this.f36040l0, this.f36041m0);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i11, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
            this.f36044p.addView(view, layoutParams2);
            this.f36044p.setLayoutParams(layoutParams);
            m33112w0();
            setEditText((EditText) view);
            return;
        }
        super.addView(view, i11, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i11) {
        AutofillId autofillId;
        ViewStructure newChild;
        EditText editText = this.f36052t;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i11);
            return;
        }
        if (this.f36054u == null) {
            autofillId = getAutofillId();
            viewStructure.setAutofillId(autofillId);
            onProvideAutofillStructure(viewStructure, i11);
            onProvideAutofillVirtualStructure(viewStructure, i11);
            viewStructure.setChildCount(this.f36044p.getChildCount());
            for (int i12 = 0; i12 < this.f36044p.getChildCount(); i12++) {
                View childAt = this.f36044p.getChildAt(i12);
                newChild = viewStructure.newChild(i12);
                childAt.dispatchProvideAutofillStructure(newChild, i11);
                if (childAt == this.f36052t) {
                    newChild.setHint(getHint());
                }
            }
            return;
        }
        boolean z11 = this.f36013R;
        this.f36013R = false;
        CharSequence hint = editText.getHint();
        this.f36052t.setHint(this.f36054u);
        try {
            super.dispatchProvideAutofillStructure(viewStructure, i11);
        } finally {
            this.f36052t.setHint(hint);
            this.f36013R = z11;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.f36029a1 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f36029a1 = false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        m33062G(canvas);
        m33060F(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        boolean z11;
        if (this.f36027Z0) {
            return;
        }
        boolean z12 = true;
        this.f36027Z0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        C6334a c6334a = this.f36022V0;
        if (c6334a != null) {
            z11 = c6334a.m32552z0(drawableState);
        } else {
            z11 = false;
        }
        if (this.f36052t != null) {
            if (!AbstractC1579n0.m7865e0(this) || !isEnabled()) {
                z12 = false;
            }
            m33133x0(z12);
        }
        m33132u0();
        m33118H0();
        if (z11) {
            invalidate();
        }
        this.f36027Z0 = false;
    }

    /* renamed from: e */
    public void m33127e(InterfaceC6426f interfaceC6426f) {
        this.f36053t0.add(interfaceC6426f);
        if (this.f36052t != null) {
            interfaceC6426f.mo33137a(this);
        }
    }

    /* renamed from: f */
    public void m33128f(InterfaceC6427g interfaceC6427g) {
        this.f36061x0.add(interfaceC6427g);
    }

    /* renamed from: g0 */
    public void m33129g0(TextView textView, int i11) {
        try {
            AbstractC1640l.m8424o(textView, i11);
        } catch (Exception unused) {
        }
        if (Build.VERSION.SDK_INT >= 23) {
            if (textView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
            AbstractC1640l.m8424o(textView, AbstractC23586k.TextAppearance_AppCompat_Caption);
            textView.setTextColor(AbstractC1388a.m6961c(getContext(), AbstractC23578c.design_error));
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f36052t;
        if (editText != null) {
            return editText.getBaseline() + getPaddingTop() + m33113x();
        }
        return super.getBaseline();
    }

    public C31689h getBoxBackground() {
        int i11 = this.f36028a0;
        if (i11 != 1 && i11 != 2) {
            throw new IllegalStateException();
        }
        return this.f36015S;
    }

    public int getBoxBackgroundColor() {
        return this.f36035g0;
    }

    public int getBoxBackgroundMode() {
        return this.f36028a0;
    }

    public float getBoxCornerRadiusBottomEnd() {
        return this.f36015S.m152457u();
    }

    public float getBoxCornerRadiusBottomStart() {
        return this.f36015S.m152458v();
    }

    public float getBoxCornerRadiusTopEnd() {
        return this.f36015S.m152432L();
    }

    public float getBoxCornerRadiusTopStart() {
        return this.f36015S.m152431K();
    }

    public int getBoxStrokeColor() {
        return this.f36006N0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f36008O0;
    }

    public int getBoxStrokeWidth() {
        return this.f36032d0;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f36033e0;
    }

    public int getCounterMaxLength() {
        return this.f36064z;
    }

    CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (this.f36062y && this.f35979A && (textView = this.f35981B) != null) {
            return textView.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f35997J;
    }

    public ColorStateList getCounterTextColor() {
        return this.f35997J;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f35998J0;
    }

    public EditText getEditText() {
        return this.f36052t;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f36059w0.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f36059w0.getDrawable();
    }

    public int getEndIconMode() {
        return this.f36055u0;
    }

    public CheckableImageButton getEndIconView() {
        return this.f36059w0;
    }

    public CharSequence getError() {
        if (this.f36060x.m33229x()) {
            return this.f36060x.m33221n();
        }
        return null;
    }

    public CharSequence getErrorContentDescription() {
        return this.f36060x.m33220m();
    }

    public int getErrorCurrentTextColors() {
        return this.f36060x.m33222o();
    }

    public Drawable getErrorIconDrawable() {
        return this.f35994H0.getDrawable();
    }

    final int getErrorTextCurrentColor() {
        return this.f36060x.m33222o();
    }

    public CharSequence getHelperText() {
        if (this.f36060x.m33230y()) {
            return this.f36060x.m33224q();
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        return this.f36060x.m33225r();
    }

    public CharSequence getHint() {
        if (this.f36009P) {
            return this.f36011Q;
        }
        return null;
    }

    final float getHintCollapsedTextHeight() {
        return this.f36022V0.m32542s();
    }

    final int getHintCurrentCollapsedTextColor() {
        return this.f36022V0.m32547w();
    }

    public ColorStateList getHintTextColor() {
        return this.f36000K0;
    }

    public int getMaxWidth() {
        return this.f36058w;
    }

    public int getMinWidth() {
        return this.f36056v;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f36059w0.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f36059w0.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.f35989F) {
            return this.f35987E;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f35995I;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f35993H;
    }

    public CharSequence getPrefixText() {
        return this.f36001L;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f36003M.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.f36003M;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f36040l0.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f36040l0.getDrawable();
    }

    public CharSequence getSuffixText() {
        return this.f36005N;
    }

    public ColorStateList getSuffixTextColor() {
        return this.f36007O.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.f36007O;
    }

    public Typeface getTypeface() {
        return this.f36039k0;
    }

    /* renamed from: i */
    void m33130i(float f11) {
        if (this.f36022V0.m32508D() == f11) {
            return;
        }
        if (this.f36026Y0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f36026Y0 = valueAnimator;
            valueAnimator.setInterpolator(AbstractC24041a.f116359b);
            this.f36026Y0.setDuration(167L);
            this.f36026Y0.addUpdateListener(new C6424d());
        }
        this.f36026Y0.setFloatValues(this.f36022V0.m32508D(), f11);
        this.f36026Y0.start();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        EditText editText = this.f36052t;
        if (editText != null) {
            Rect rect = this.f36036h0;
            AbstractC6336c.m32555a(this, editText, rect);
            m33098n0(rect);
            if (this.f36009P) {
                this.f36022V0.m32534m0(this.f36052t.getTextSize());
                int gravity = this.f36052t.getGravity();
                this.f36022V0.m32525c0((gravity & (-113)) | 48);
                this.f36022V0.m32532l0(gravity);
                this.f36022V0.m32521Y(m33105s(rect));
                this.f36022V0.m32529h0(m33111w(rect));
                this.f36022V0.m32518U();
                if (m33054C() && !this.f36020U0) {
                    m33073V();
                }
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        boolean m33110v0 = m33110v0();
        boolean m33107t0 = m33107t0();
        if (m33110v0 || m33107t0) {
            this.f36052t.post(new RunnableC6423c());
        }
        m33117z0();
        m33055C0();
        m33061F0();
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.m8457a());
        setError(savedState.f36066r);
        if (savedState.f36067s) {
            this.f36059w0.post(new RunnableC6422b());
        }
        setHint(savedState.f36068t);
        setHelperText(savedState.f36069u);
        setPlaceholderText(savedState.f36070v);
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        boolean z11;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (this.f36060x.m33219k()) {
            savedState.f36066r = getError();
        }
        if (m33067K() && this.f36059w0.isChecked()) {
            z11 = true;
        } else {
            z11 = false;
        }
        savedState.f36067s = z11;
        savedState.f36068t = getHint();
        savedState.f36069u = getHelperText();
        savedState.f36070v = getPlaceholderText();
        return savedState;
    }

    /* renamed from: p0 */
    void m33131p0(int i11) {
        boolean z11;
        boolean z12 = this.f35979A;
        int i12 = this.f36064z;
        if (i12 == -1) {
            this.f35981B.setText(String.valueOf(i11));
            this.f35981B.setContentDescription(null);
            this.f35979A = false;
        } else {
            if (i11 > i12) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f35979A = z11;
            m33102q0(getContext(), this.f35981B, i11, this.f36064z, this.f35979A);
            if (z12 != this.f35979A) {
                m33104r0();
            }
            this.f35981B.setText(C1462a.m7419c().m7426j(getContext().getString(AbstractC23585j.character_counter_pattern, Integer.valueOf(i11), Integer.valueOf(this.f36064z))));
        }
        if (this.f36052t != null && z12 != this.f35979A) {
            m33133x0(false);
            m33118H0();
            m33132u0();
        }
    }

    public void setBoxBackgroundColor(int i11) {
        if (this.f36035g0 != i11) {
            this.f36035g0 = i11;
            this.f36010P0 = i11;
            this.f36014R0 = i11;
            this.f36016S0 = i11;
            m33089j();
        }
    }

    public void setBoxBackgroundColorResource(int i11) {
        setBoxBackgroundColor(AbstractC1388a.m6961c(getContext(), i11));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f36010P0 = defaultColor;
        this.f36035g0 = defaultColor;
        this.f36012Q0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f36014R0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.f36016S0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        m33089j();
    }

    public void setBoxBackgroundMode(int i11) {
        if (i11 == this.f36028a0) {
            return;
        }
        this.f36028a0 = i11;
        if (this.f36052t != null) {
            m33072U();
        }
    }

    public void setBoxStrokeColor(int i11) {
        if (this.f36006N0 != i11) {
            this.f36006N0 = i11;
            m33118H0();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f36002L0 = colorStateList.getDefaultColor();
            this.f36018T0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f36004M0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.f36006N0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.f36006N0 != colorStateList.getDefaultColor()) {
            this.f36006N0 = colorStateList.getDefaultColor();
        }
        m33118H0();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f36008O0 != colorStateList) {
            this.f36008O0 = colorStateList;
            m33118H0();
        }
    }

    public void setBoxStrokeWidth(int i11) {
        this.f36032d0 = i11;
        m33118H0();
    }

    public void setBoxStrokeWidthFocused(int i11) {
        this.f36033e0 = i11;
        m33118H0();
    }

    public void setBoxStrokeWidthFocusedResource(int i11) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i11));
    }

    public void setBoxStrokeWidthResource(int i11) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i11));
    }

    public void setCounterEnabled(boolean z11) {
        if (this.f36062y != z11) {
            if (z11) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
                this.f35981B = appCompatTextView;
                appCompatTextView.setId(AbstractC23581f.textinput_counter);
                Typeface typeface = this.f36039k0;
                if (typeface != null) {
                    this.f35981B.setTypeface(typeface);
                }
                this.f35981B.setMaxLines(1);
                this.f36060x.m33216d(this.f35981B, 2);
                AbstractC1613w.m8237d((ViewGroup.MarginLayoutParams) this.f35981B.getLayoutParams(), getResources().getDimensionPixelOffset(AbstractC23579d.mtrl_textinput_counter_margin_start));
                m33104r0();
                m33099o0();
            } else {
                this.f36060x.m33231z(this.f35981B, 2);
                this.f35981B = null;
            }
            this.f36062y = z11;
        }
    }

    public void setCounterMaxLength(int i11) {
        if (this.f36064z != i11) {
            if (i11 > 0) {
                this.f36064z = i11;
            } else {
                this.f36064z = -1;
            }
            if (this.f36062y) {
                m33099o0();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i11) {
        if (this.f35983C != i11) {
            this.f35983C = i11;
            m33104r0();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f35999K != colorStateList) {
            this.f35999K = colorStateList;
            m33104r0();
        }
    }

    public void setCounterTextAppearance(int i11) {
        if (this.f35985D != i11) {
            this.f35985D = i11;
            m33104r0();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f35997J != colorStateList) {
            this.f35997J = colorStateList;
            m33104r0();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f35998J0 = colorStateList;
        this.f36000K0 = colorStateList;
        if (this.f36052t != null) {
            m33133x0(false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z11) {
        m33074W(this, z11);
        super.setEnabled(z11);
    }

    public void setEndIconActivated(boolean z11) {
        this.f36059w0.setActivated(z11);
    }

    public void setEndIconCheckable(boolean z11) {
        this.f36059w0.setCheckable(z11);
    }

    public void setEndIconContentDescription(int i11) {
        setEndIconContentDescription(i11 != 0 ? getResources().getText(i11) : null);
    }

    public void setEndIconDrawable(int i11) {
        setEndIconDrawable(i11 != 0 ? AbstractC19694b.m103336d(getContext(), i11) : null);
    }

    public void setEndIconMode(int i11) {
        boolean z11;
        int i12 = this.f36055u0;
        this.f36055u0 = i11;
        m33058E(i12);
        if (i11 != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        setEndIconVisible(z11);
        if (getEndIconDelegate().mo33189b(this.f36028a0)) {
            getEndIconDelegate().mo33148a();
            m33095m();
            return;
        }
        throw new IllegalStateException("The current box background mode " + this.f36028a0 + " is not supported by the end icon mode " + i11);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        m33083e0(this.f36059w0, onClickListener, this.f35990F0);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f35990F0 = onLongClickListener;
        m33084f0(this.f36059w0, onLongClickListener);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        if (this.f36063y0 != colorStateList) {
            this.f36063y0 = colorStateList;
            this.f36065z0 = true;
            m33095m();
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        if (this.f35980A0 != mode) {
            this.f35980A0 = mode;
            this.f35982B0 = true;
            m33095m();
        }
    }

    public void setEndIconVisible(boolean z11) {
        int i11;
        if (m33119M() != z11) {
            CheckableImageButton checkableImageButton = this.f36059w0;
            if (z11) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            checkableImageButton.setVisibility(i11);
            m33061F0();
            m33107t0();
        }
    }

    public void setError(CharSequence charSequence) {
        if (!this.f36060x.m33229x()) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            this.f36060x.m33214M(charSequence);
        } else {
            this.f36060x.m33226t();
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        this.f36060x.m33206B(charSequence);
    }

    public void setErrorEnabled(boolean z11) {
        this.f36060x.m33207C(z11);
    }

    public void setErrorIconDrawable(int i11) {
        setErrorIconDrawable(i11 != 0 ? AbstractC19694b.m103336d(getContext(), i11) : null);
        m33125Y();
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        m33083e0(this.f35994H0, onClickListener, this.f35992G0);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f35992G0 = onLongClickListener;
        m33084f0(this.f35994H0, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        this.f35996I0 = colorStateList;
        Drawable drawable = this.f35994H0.getDrawable();
        if (drawable != null) {
            drawable = AbstractC1414a.m7200r(drawable).mutate();
            AbstractC1414a.m7197o(drawable, colorStateList);
        }
        if (this.f35994H0.getDrawable() != drawable) {
            this.f35994H0.setImageDrawable(drawable);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f35994H0.getDrawable();
        if (drawable != null) {
            drawable = AbstractC1414a.m7200r(drawable).mutate();
            AbstractC1414a.m7198p(drawable, mode);
        }
        if (this.f35994H0.getDrawable() != drawable) {
            this.f35994H0.setImageDrawable(drawable);
        }
    }

    public void setErrorTextAppearance(int i11) {
        this.f36060x.m33208D(i11);
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        this.f36060x.m33209E(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z11) {
        if (this.f36024W0 != z11) {
            this.f36024W0 = z11;
            m33133x0(false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            if (m33120O()) {
                setHelperTextEnabled(false);
            }
        } else {
            if (!m33120O()) {
                setHelperTextEnabled(true);
            }
            this.f36060x.m33215N(charSequence);
        }
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        this.f36060x.m33212H(colorStateList);
    }

    public void setHelperTextEnabled(boolean z11) {
        this.f36060x.m33211G(z11);
    }

    public void setHelperTextTextAppearance(int i11) {
        this.f36060x.m33210F(i11);
    }

    public void setHint(CharSequence charSequence) {
        if (this.f36009P) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(ZVideoUtilMetadata.FF_PROFILE_H264_INTRA);
        }
    }

    public void setHintAnimationEnabled(boolean z11) {
        this.f36025X0 = z11;
    }

    public void setHintEnabled(boolean z11) {
        if (z11 != this.f36009P) {
            this.f36009P = z11;
            if (!z11) {
                this.f36013R = false;
                if (!TextUtils.isEmpty(this.f36011Q) && TextUtils.isEmpty(this.f36052t.getHint())) {
                    this.f36052t.setHint(this.f36011Q);
                }
                setHintInternal(null);
            } else {
                CharSequence hint = this.f36052t.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f36011Q)) {
                        setHint(hint);
                    }
                    this.f36052t.setHint((CharSequence) null);
                }
                this.f36013R = true;
            }
            if (this.f36052t != null) {
                m33112w0();
            }
        }
    }

    public void setHintTextAppearance(int i11) {
        this.f36022V0.m32522Z(i11);
        this.f36000K0 = this.f36022V0.m32538q();
        if (this.f36052t != null) {
            m33133x0(false);
            m33112w0();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f36000K0 != colorStateList) {
            if (this.f35998J0 == null) {
                this.f36022V0.m32523b0(colorStateList);
            }
            this.f36000K0 = colorStateList;
            if (this.f36052t != null) {
                m33133x0(false);
            }
        }
    }

    public void setMaxWidth(int i11) {
        this.f36058w = i11;
        EditText editText = this.f36052t;
        if (editText != null && i11 != -1) {
            editText.setMaxWidth(i11);
        }
    }

    public void setMaxWidthResource(int i11) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i11));
    }

    public void setMinWidth(int i11) {
        this.f36056v = i11;
        EditText editText = this.f36052t;
        if (editText != null && i11 != -1) {
            editText.setMinWidth(i11);
        }
    }

    public void setMinWidthResource(int i11) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i11));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i11) {
        setPasswordVisibilityToggleContentDescription(i11 != 0 ? getResources().getText(i11) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i11) {
        setPasswordVisibilityToggleDrawable(i11 != 0 ? AbstractC19694b.m103336d(getContext(), i11) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z11) {
        if (z11 && this.f36055u0 != 1) {
            setEndIconMode(1);
        } else if (!z11) {
            setEndIconMode(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.f36063y0 = colorStateList;
        this.f36065z0 = true;
        m33095m();
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.f35980A0 = mode;
        this.f35982B0 = true;
        m33095m();
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.f35989F && TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f35989F) {
                setPlaceholderTextEnabled(true);
            }
            this.f35987E = charSequence;
        }
        m33051A0();
    }

    public void setPlaceholderTextAppearance(int i11) {
        this.f35995I = i11;
        TextView textView = this.f35991G;
        if (textView != null) {
            AbstractC1640l.m8424o(textView, i11);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f35993H != colorStateList) {
            this.f35993H = colorStateList;
            TextView textView = this.f35991G;
            if (textView != null && colorStateList != null) {
                textView.setTextColor(colorStateList);
            }
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        CharSequence charSequence2;
        if (TextUtils.isEmpty(charSequence)) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        this.f36001L = charSequence2;
        this.f36003M.setText(charSequence);
        m33057D0();
    }

    public void setPrefixTextAppearance(int i11) {
        AbstractC1640l.m8424o(this.f36003M, i11);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f36003M.setTextColor(colorStateList);
    }

    public void setStartIconCheckable(boolean z11) {
        this.f36040l0.setCheckable(z11);
    }

    public void setStartIconContentDescription(int i11) {
        setStartIconContentDescription(i11 != 0 ? getResources().getText(i11) : null);
    }

    public void setStartIconDrawable(int i11) {
        setStartIconDrawable(i11 != 0 ? AbstractC19694b.m103336d(getContext(), i11) : null);
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        m33083e0(this.f36040l0, onClickListener, this.f36051s0);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f36051s0 = onLongClickListener;
        m33084f0(this.f36040l0, onLongClickListener);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        if (this.f36041m0 != colorStateList) {
            this.f36041m0 = colorStateList;
            this.f36042n0 = true;
            m33100p();
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        if (this.f36043o0 != mode) {
            this.f36043o0 = mode;
            this.f36045p0 = true;
            m33100p();
        }
    }

    public void setStartIconVisible(boolean z11) {
        int i11;
        if (m33123S() != z11) {
            CheckableImageButton checkableImageButton = this.f36040l0;
            if (z11) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            checkableImageButton.setVisibility(i11);
            m33055C0();
            m33107t0();
        }
    }

    public void setSuffixText(CharSequence charSequence) {
        CharSequence charSequence2;
        if (TextUtils.isEmpty(charSequence)) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        this.f36005N = charSequence2;
        this.f36007O.setText(charSequence);
        m33063G0();
    }

    public void setSuffixTextAppearance(int i11) {
        AbstractC1640l.m8424o(this.f36007O, i11);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f36007O.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(C6425e c6425e) {
        EditText editText = this.f36052t;
        if (editText != null) {
            AbstractC1579n0.m7801A0(editText, c6425e);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f36039k0) {
            this.f36039k0 = typeface;
            this.f36022V0.m32507C0(typeface);
            this.f36060x.m33213J(typeface);
            TextView textView = this.f35981B;
            if (textView != null) {
                textView.setTypeface(typeface);
            }
        }
    }

    /* renamed from: u0 */
    public void m33132u0() {
        Drawable background;
        TextView textView;
        EditText editText = this.f36052t;
        if (editText == null || this.f36028a0 != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        if (AbstractC1225y0.m5769a(background)) {
            background = background.mutate();
        }
        if (this.f36060x.m33219k()) {
            background.setColorFilter(C1167f.m5529e(this.f36060x.m33222o(), PorterDuff.Mode.SRC_IN));
        } else if (this.f35979A && (textView = this.f35981B) != null) {
            background.setColorFilter(C1167f.m5529e(textView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            AbstractC1414a.m7185c(background);
            this.f36052t.refreshDrawableState();
        }
    }

    /* renamed from: x0 */
    public void m33133x0(boolean z11) {
        m33115y0(z11, false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v43 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TextInputLayout(Context context, AttributeSet attributeSet, int i11) {
        super(AbstractC0638a.m909c(context, attributeSet, i11, r9), attributeSet, i11);
        int i12;
        ?? r32;
        int i13 = f35978b1;
        this.f36056v = -1;
        this.f36058w = -1;
        this.f36060x = new C6433f(this);
        this.f36036h0 = new Rect();
        this.f36037i0 = new Rect();
        this.f36038j0 = new RectF();
        this.f36053t0 = new LinkedHashSet();
        this.f36055u0 = 0;
        SparseArray sparseArray = new SparseArray();
        this.f36057v0 = sparseArray;
        this.f36061x0 = new LinkedHashSet();
        C6334a c6334a = new C6334a(this);
        this.f36022V0 = c6334a;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f36044p = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        addView(frameLayout);
        LinearLayout linearLayout = new LinearLayout(context2);
        this.f36046q = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        frameLayout.addView(linearLayout);
        LinearLayout linearLayout2 = new LinearLayout(context2);
        this.f36048r = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        frameLayout.addView(linearLayout2);
        FrameLayout frameLayout2 = new FrameLayout(context2);
        this.f36050s = frameLayout2;
        frameLayout2.setLayoutParams(new FrameLayout.LayoutParams(-2, -1));
        TimeInterpolator timeInterpolator = AbstractC24041a.f116358a;
        c6334a.m32505B0(timeInterpolator);
        c6334a.m32549x0(timeInterpolator);
        c6334a.m32525c0(8388659);
        C1211t1 m32640i = AbstractC6355v.m32640i(context2, attributeSet, AbstractC23587l.TextInputLayout, i11, i13, AbstractC23587l.TextInputLayout_counterTextAppearance, AbstractC23587l.TextInputLayout_counterOverflowTextAppearance, AbstractC23587l.TextInputLayout_errorTextAppearance, AbstractC23587l.TextInputLayout_helperTextTextAppearance, AbstractC23587l.TextInputLayout_hintTextAppearance);
        this.f36009P = m32640i.m5717a(AbstractC23587l.TextInputLayout_hintEnabled, true);
        setHint(m32640i.m5732p(AbstractC23587l.TextInputLayout_android_hint));
        this.f36025X0 = m32640i.m5717a(AbstractC23587l.TextInputLayout_hintAnimationEnabled, true);
        this.f36024W0 = m32640i.m5717a(AbstractC23587l.TextInputLayout_expandedHintEnabled, true);
        if (m32640i.m5735s(AbstractC23587l.TextInputLayout_android_minWidth)) {
            i12 = -1;
            setMinWidth(m32640i.m5722f(AbstractC23587l.TextInputLayout_android_minWidth, -1));
        } else {
            i12 = -1;
        }
        if (m32640i.m5735s(AbstractC23587l.TextInputLayout_android_maxWidth)) {
            setMaxWidth(m32640i.m5722f(AbstractC23587l.TextInputLayout_android_maxWidth, i12));
        }
        this.f36019U = C31694m.m152475e(context2, attributeSet, i11, i13).m152519m();
        this.f36021V = context2.getResources().getDimensionPixelOffset(AbstractC23579d.mtrl_textinput_box_label_cutout_padding);
        this.f36030b0 = m32640i.m5721e(AbstractC23587l.TextInputLayout_boxCollapsedPaddingTop, 0);
        this.f36032d0 = m32640i.m5722f(AbstractC23587l.TextInputLayout_boxStrokeWidth, context2.getResources().getDimensionPixelSize(AbstractC23579d.mtrl_textinput_box_stroke_width_default));
        this.f36033e0 = m32640i.m5722f(AbstractC23587l.TextInputLayout_boxStrokeWidthFocused, context2.getResources().getDimensionPixelSize(AbstractC23579d.mtrl_textinput_box_stroke_width_focused));
        this.f36031c0 = this.f36032d0;
        float m5720d = m32640i.m5720d(AbstractC23587l.TextInputLayout_boxCornerRadiusTopStart, -1.0f);
        float m5720d2 = m32640i.m5720d(AbstractC23587l.TextInputLayout_boxCornerRadiusTopEnd, -1.0f);
        float m5720d3 = m32640i.m5720d(AbstractC23587l.TextInputLayout_boxCornerRadiusBottomEnd, -1.0f);
        float m5720d4 = m32640i.m5720d(AbstractC23587l.TextInputLayout_boxCornerRadiusBottomStart, -1.0f);
        C31694m.b m152492v = this.f36019U.m152492v();
        if (m5720d >= 0.0f) {
            m152492v.m152513E(m5720d);
        }
        if (m5720d2 >= 0.0f) {
            m152492v.m152517I(m5720d2);
        }
        if (m5720d3 >= 0.0f) {
            m152492v.m152531z(m5720d3);
        }
        if (m5720d4 >= 0.0f) {
            m152492v.m152527v(m5720d4);
        }
        this.f36019U = m152492v.m152519m();
        ColorStateList m143974b = AbstractC28774c.m143974b(context2, m32640i, AbstractC23587l.TextInputLayout_boxBackgroundColor);
        if (m143974b != null) {
            int defaultColor = m143974b.getDefaultColor();
            this.f36010P0 = defaultColor;
            this.f36035g0 = defaultColor;
            if (m143974b.isStateful()) {
                this.f36012Q0 = m143974b.getColorForState(new int[]{-16842910}, -1);
                this.f36014R0 = m143974b.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.f36016S0 = m143974b.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.f36014R0 = this.f36010P0;
                ColorStateList m103335c = AbstractC19694b.m103335c(context2, AbstractC23578c.mtrl_filled_background_color);
                this.f36012Q0 = m103335c.getColorForState(new int[]{-16842910}, -1);
                this.f36016S0 = m103335c.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.f36035g0 = 0;
            this.f36010P0 = 0;
            this.f36012Q0 = 0;
            this.f36014R0 = 0;
            this.f36016S0 = 0;
        }
        if (m32640i.m5735s(AbstractC23587l.TextInputLayout_android_textColorHint)) {
            ColorStateList m5719c = m32640i.m5719c(AbstractC23587l.TextInputLayout_android_textColorHint);
            this.f36000K0 = m5719c;
            this.f35998J0 = m5719c;
        }
        ColorStateList m143974b2 = AbstractC28774c.m143974b(context2, m32640i, AbstractC23587l.TextInputLayout_boxStrokeColor);
        this.f36006N0 = m32640i.m5718b(AbstractC23587l.TextInputLayout_boxStrokeColor, 0);
        this.f36002L0 = AbstractC1388a.m6961c(context2, AbstractC23578c.mtrl_textinput_default_box_stroke_color);
        this.f36018T0 = AbstractC1388a.m6961c(context2, AbstractC23578c.mtrl_textinput_disabled_color);
        this.f36004M0 = AbstractC1388a.m6961c(context2, AbstractC23578c.mtrl_textinput_hovered_box_stroke_color);
        if (m143974b2 != null) {
            setBoxStrokeColorStateList(m143974b2);
        }
        if (m32640i.m5735s(AbstractC23587l.TextInputLayout_boxStrokeErrorColor)) {
            setBoxStrokeErrorColor(AbstractC28774c.m143974b(context2, m32640i, AbstractC23587l.TextInputLayout_boxStrokeErrorColor));
        }
        if (m32640i.m5730n(AbstractC23587l.TextInputLayout_hintTextAppearance, -1) != -1) {
            r32 = 0;
            setHintTextAppearance(m32640i.m5730n(AbstractC23587l.TextInputLayout_hintTextAppearance, 0));
        } else {
            r32 = 0;
        }
        int m5730n = m32640i.m5730n(AbstractC23587l.TextInputLayout_errorTextAppearance, r32);
        CharSequence m5732p = m32640i.m5732p(AbstractC23587l.TextInputLayout_errorContentDescription);
        boolean m5717a = m32640i.m5717a(AbstractC23587l.TextInputLayout_errorEnabled, r32);
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(AbstractC23583h.design_text_input_end_icon, linearLayout2, (boolean) r32);
        this.f35994H0 = checkableImageButton;
        checkableImageButton.setId(AbstractC23581f.text_input_error_icon);
        checkableImageButton.setVisibility(8);
        if (AbstractC28774c.m143979g(context2)) {
            AbstractC1613w.m8237d((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), r32);
        }
        if (m32640i.m5735s(AbstractC23587l.TextInputLayout_errorIconDrawable)) {
            setErrorIconDrawable(m32640i.m5723g(AbstractC23587l.TextInputLayout_errorIconDrawable));
        }
        if (m32640i.m5735s(AbstractC23587l.TextInputLayout_errorIconTint)) {
            setErrorIconTintList(AbstractC28774c.m143974b(context2, m32640i, AbstractC23587l.TextInputLayout_errorIconTint));
        }
        if (m32640i.m5735s(AbstractC23587l.TextInputLayout_errorIconTintMode)) {
            setErrorIconTintMode(AbstractC6359z.m32654i(m32640i.m5727k(AbstractC23587l.TextInputLayout_errorIconTintMode, -1), null));
        }
        checkableImageButton.setContentDescription(getResources().getText(AbstractC23585j.error_icon_content_description));
        AbstractC1579n0.m7823L0(checkableImageButton, 2);
        checkableImageButton.setClickable(false);
        checkableImageButton.setPressable(false);
        checkableImageButton.setFocusable(false);
        int m5730n2 = m32640i.m5730n(AbstractC23587l.TextInputLayout_helperTextTextAppearance, 0);
        boolean m5717a2 = m32640i.m5717a(AbstractC23587l.TextInputLayout_helperTextEnabled, false);
        CharSequence m5732p2 = m32640i.m5732p(AbstractC23587l.TextInputLayout_helperText);
        int m5730n3 = m32640i.m5730n(AbstractC23587l.TextInputLayout_placeholderTextAppearance, 0);
        CharSequence m5732p3 = m32640i.m5732p(AbstractC23587l.TextInputLayout_placeholderText);
        int m5730n4 = m32640i.m5730n(AbstractC23587l.TextInputLayout_prefixTextAppearance, 0);
        CharSequence m5732p4 = m32640i.m5732p(AbstractC23587l.TextInputLayout_prefixText);
        int m5730n5 = m32640i.m5730n(AbstractC23587l.TextInputLayout_suffixTextAppearance, 0);
        CharSequence m5732p5 = m32640i.m5732p(AbstractC23587l.TextInputLayout_suffixText);
        boolean m5717a3 = m32640i.m5717a(AbstractC23587l.TextInputLayout_counterEnabled, false);
        setCounterMaxLength(m32640i.m5727k(AbstractC23587l.TextInputLayout_counterMaxLength, -1));
        this.f35985D = m32640i.m5730n(AbstractC23587l.TextInputLayout_counterTextAppearance, 0);
        this.f35983C = m32640i.m5730n(AbstractC23587l.TextInputLayout_counterOverflowTextAppearance, 0);
        CheckableImageButton checkableImageButton2 = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(AbstractC23583h.design_text_input_start_icon, (ViewGroup) linearLayout, false);
        this.f36040l0 = checkableImageButton2;
        checkableImageButton2.setVisibility(8);
        if (AbstractC28774c.m143979g(context2)) {
            AbstractC1613w.m8236c((ViewGroup.MarginLayoutParams) checkableImageButton2.getLayoutParams(), 0);
        }
        setStartIconOnClickListener(null);
        setStartIconOnLongClickListener(null);
        if (m32640i.m5735s(AbstractC23587l.TextInputLayout_startIconDrawable)) {
            setStartIconDrawable(m32640i.m5723g(AbstractC23587l.TextInputLayout_startIconDrawable));
            if (m32640i.m5735s(AbstractC23587l.TextInputLayout_startIconContentDescription)) {
                setStartIconContentDescription(m32640i.m5732p(AbstractC23587l.TextInputLayout_startIconContentDescription));
            }
            setStartIconCheckable(m32640i.m5717a(AbstractC23587l.TextInputLayout_startIconCheckable, true));
        }
        if (m32640i.m5735s(AbstractC23587l.TextInputLayout_startIconTint)) {
            setStartIconTintList(AbstractC28774c.m143974b(context2, m32640i, AbstractC23587l.TextInputLayout_startIconTint));
        }
        if (m32640i.m5735s(AbstractC23587l.TextInputLayout_startIconTintMode)) {
            setStartIconTintMode(AbstractC6359z.m32654i(m32640i.m5727k(AbstractC23587l.TextInputLayout_startIconTintMode, -1), null));
        }
        setBoxBackgroundMode(m32640i.m5727k(AbstractC23587l.TextInputLayout_boxBackgroundMode, 0));
        CheckableImageButton checkableImageButton3 = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(AbstractC23583h.design_text_input_end_icon, (ViewGroup) frameLayout2, false);
        this.f36059w0 = checkableImageButton3;
        frameLayout2.addView(checkableImageButton3);
        checkableImageButton3.setVisibility(8);
        if (AbstractC28774c.m143979g(context2)) {
            AbstractC1613w.m8237d((ViewGroup.MarginLayoutParams) checkableImageButton3.getLayoutParams(), 0);
        }
        sparseArray.append(-1, new C6429b(this));
        sparseArray.append(0, new C6434g(this));
        sparseArray.append(1, new C6435h(this));
        sparseArray.append(2, new C6428a(this));
        sparseArray.append(3, new C6431d(this));
        if (m32640i.m5735s(AbstractC23587l.TextInputLayout_endIconMode)) {
            setEndIconMode(m32640i.m5727k(AbstractC23587l.TextInputLayout_endIconMode, 0));
            if (m32640i.m5735s(AbstractC23587l.TextInputLayout_endIconDrawable)) {
                setEndIconDrawable(m32640i.m5723g(AbstractC23587l.TextInputLayout_endIconDrawable));
            }
            if (m32640i.m5735s(AbstractC23587l.TextInputLayout_endIconContentDescription)) {
                setEndIconContentDescription(m32640i.m5732p(AbstractC23587l.TextInputLayout_endIconContentDescription));
            }
            setEndIconCheckable(m32640i.m5717a(AbstractC23587l.TextInputLayout_endIconCheckable, true));
        } else if (m32640i.m5735s(AbstractC23587l.TextInputLayout_passwordToggleEnabled)) {
            setEndIconMode(m32640i.m5717a(AbstractC23587l.TextInputLayout_passwordToggleEnabled, false) ? 1 : 0);
            setEndIconDrawable(m32640i.m5723g(AbstractC23587l.TextInputLayout_passwordToggleDrawable));
            setEndIconContentDescription(m32640i.m5732p(AbstractC23587l.TextInputLayout_passwordToggleContentDescription));
            if (m32640i.m5735s(AbstractC23587l.TextInputLayout_passwordToggleTint)) {
                setEndIconTintList(AbstractC28774c.m143974b(context2, m32640i, AbstractC23587l.TextInputLayout_passwordToggleTint));
            }
            if (m32640i.m5735s(AbstractC23587l.TextInputLayout_passwordToggleTintMode)) {
                setEndIconTintMode(AbstractC6359z.m32654i(m32640i.m5727k(AbstractC23587l.TextInputLayout_passwordToggleTintMode, -1), null));
            }
        }
        if (!m32640i.m5735s(AbstractC23587l.TextInputLayout_passwordToggleEnabled)) {
            if (m32640i.m5735s(AbstractC23587l.TextInputLayout_endIconTint)) {
                setEndIconTintList(AbstractC28774c.m143974b(context2, m32640i, AbstractC23587l.TextInputLayout_endIconTint));
            }
            if (m32640i.m5735s(AbstractC23587l.TextInputLayout_endIconTintMode)) {
                setEndIconTintMode(AbstractC6359z.m32654i(m32640i.m5727k(AbstractC23587l.TextInputLayout_endIconTintMode, -1), null));
            }
        }
        AppCompatTextView appCompatTextView = new AppCompatTextView(context2);
        this.f36003M = appCompatTextView;
        appCompatTextView.setId(AbstractC23581f.textinput_prefix_text);
        appCompatTextView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        AbstractC1579n0.m7803B0(appCompatTextView, 1);
        linearLayout.addView(checkableImageButton2);
        linearLayout.addView(appCompatTextView);
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(context2);
        this.f36007O = appCompatTextView2;
        appCompatTextView2.setId(AbstractC23581f.textinput_suffix_text);
        appCompatTextView2.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 80));
        AbstractC1579n0.m7803B0(appCompatTextView2, 1);
        linearLayout2.addView(appCompatTextView2);
        linearLayout2.addView(checkableImageButton);
        linearLayout2.addView(frameLayout2);
        setHelperTextEnabled(m5717a2);
        setHelperText(m5732p2);
        setHelperTextTextAppearance(m5730n2);
        setErrorEnabled(m5717a);
        setErrorTextAppearance(m5730n);
        setErrorContentDescription(m5732p);
        setCounterTextAppearance(this.f35985D);
        setCounterOverflowTextAppearance(this.f35983C);
        setPlaceholderText(m5732p3);
        setPlaceholderTextAppearance(m5730n3);
        setPrefixText(m5732p4);
        setPrefixTextAppearance(m5730n4);
        setSuffixText(m5732p5);
        setSuffixTextAppearance(m5730n5);
        if (m32640i.m5735s(AbstractC23587l.TextInputLayout_errorTextColor)) {
            setErrorTextColor(m32640i.m5719c(AbstractC23587l.TextInputLayout_errorTextColor));
        }
        if (m32640i.m5735s(AbstractC23587l.TextInputLayout_helperTextTextColor)) {
            setHelperTextColor(m32640i.m5719c(AbstractC23587l.TextInputLayout_helperTextTextColor));
        }
        if (m32640i.m5735s(AbstractC23587l.TextInputLayout_hintTextColor)) {
            setHintTextColor(m32640i.m5719c(AbstractC23587l.TextInputLayout_hintTextColor));
        }
        if (m32640i.m5735s(AbstractC23587l.TextInputLayout_counterTextColor)) {
            setCounterTextColor(m32640i.m5719c(AbstractC23587l.TextInputLayout_counterTextColor));
        }
        if (m32640i.m5735s(AbstractC23587l.TextInputLayout_counterOverflowTextColor)) {
            setCounterOverflowTextColor(m32640i.m5719c(AbstractC23587l.TextInputLayout_counterOverflowTextColor));
        }
        if (m32640i.m5735s(AbstractC23587l.TextInputLayout_placeholderTextColor)) {
            setPlaceholderTextColor(m32640i.m5719c(AbstractC23587l.TextInputLayout_placeholderTextColor));
        }
        if (m32640i.m5735s(AbstractC23587l.TextInputLayout_prefixTextColor)) {
            setPrefixTextColor(m32640i.m5719c(AbstractC23587l.TextInputLayout_prefixTextColor));
        }
        if (m32640i.m5735s(AbstractC23587l.TextInputLayout_suffixTextColor)) {
            setSuffixTextColor(m32640i.m5719c(AbstractC23587l.TextInputLayout_suffixTextColor));
        }
        setCounterEnabled(m5717a3);
        setEnabled(m32640i.m5717a(AbstractC23587l.TextInputLayout_android_enabled, true));
        m32640i.m5736w();
        AbstractC1579n0.m7823L0(this, 2);
        if (Build.VERSION.SDK_INT >= 26) {
            AbstractC1579n0.m7825M0(this, 1);
        }
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        if (getEndIconContentDescription() != charSequence) {
            this.f36059w0.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.f36059w0.setImageDrawable(drawable);
        m33124X();
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        if (getStartIconContentDescription() != charSequence) {
            this.f36040l0.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f36040l0.setImageDrawable(drawable);
        if (drawable != null) {
            setStartIconVisible(true);
            m33126a0();
        } else {
            setStartIconVisible(false);
            setStartIconOnClickListener(null);
            setStartIconOnLongClickListener(null);
            setStartIconContentDescription((CharSequence) null);
        }
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f35994H0.setImageDrawable(drawable);
        setErrorIconVisible(drawable != null && this.f36060x.m33229x());
    }

    public void setHint(int i11) {
        setHint(i11 != 0 ? getResources().getText(i11) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f36059w0.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f36059w0.setImageDrawable(drawable);
    }
}
