package com.google.android.material.timepicker;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.core.view.AbstractC1579n0;
import androidx.core.view.C1490a;
import androidx.core.view.accessibility.C1507g0;
import com.google.android.material.timepicker.ClockHandView;
import java.util.Arrays;
import p193h0.AbstractC19694b;
import p357n6.AbstractC23577b;
import p357n6.AbstractC23578c;
import p357n6.AbstractC23579d;
import p357n6.AbstractC23581f;
import p357n6.AbstractC23583h;
import p357n6.AbstractC23586k;
import p357n6.AbstractC23587l;
import p599w6.AbstractC28774c;

/* loaded from: classes3.dex */
class ClockFaceView extends RadialViewGroup implements ClockHandView.InterfaceC6450c {

    /* renamed from: Q */
    private final ClockHandView f36169Q;

    /* renamed from: R */
    private final Rect f36170R;

    /* renamed from: S */
    private final RectF f36171S;

    /* renamed from: T */
    private final SparseArray f36172T;

    /* renamed from: U */
    private final C1490a f36173U;

    /* renamed from: V */
    private final int[] f36174V;

    /* renamed from: W */
    private final float[] f36175W;

    /* renamed from: a0 */
    private final int f36176a0;

    /* renamed from: b0 */
    private final int f36177b0;

    /* renamed from: c0 */
    private final int f36178c0;

    /* renamed from: d0 */
    private final int f36179d0;

    /* renamed from: e0 */
    private String[] f36180e0;

    /* renamed from: f0 */
    private float f36181f0;

    /* renamed from: g0 */
    private final ColorStateList f36182g0;

    /* renamed from: com.google.android.material.timepicker.ClockFaceView$a */
    /* loaded from: classes3.dex */
    class ViewTreeObserverOnPreDrawListenerC6446a implements ViewTreeObserver.OnPreDrawListener {
        ViewTreeObserverOnPreDrawListenerC6446a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            if (!ClockFaceView.this.isShown()) {
                return true;
            }
            ClockFaceView.this.getViewTreeObserver().removeOnPreDrawListener(this);
            ClockFaceView.this.mo33260F(((ClockFaceView.this.getHeight() / 2) - ClockFaceView.this.f36169Q.m33272g()) - ClockFaceView.this.f36176a0);
            return true;
        }
    }

    /* renamed from: com.google.android.material.timepicker.ClockFaceView$b */
    /* loaded from: classes3.dex */
    class C6447b extends C1490a {
        C6447b() {
        }

        @Override // androidx.core.view.C1490a
        /* renamed from: g */
        public void mo7510g(View view, C1507g0 c1507g0) {
            super.mo7510g(view, c1507g0);
            int intValue = ((Integer) view.getTag(AbstractC23581f.material_value_index)).intValue();
            if (intValue > 0) {
                c1507g0.m7594F0((View) ClockFaceView.this.f36172T.get(intValue - 1));
            }
            c1507g0.m7623g0(C1507g0.c.m7662a(0, 1, intValue, 1, false, view.isSelected()));
        }
    }

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC23577b.materialClockStyle);
    }

    /* renamed from: M */
    private void m33256M() {
        RectF m33270d = this.f36169Q.m33270d();
        for (int i11 = 0; i11 < this.f36172T.size(); i11++) {
            TextView textView = (TextView) this.f36172T.get(i11);
            if (textView != null) {
                textView.getDrawingRect(this.f36170R);
                this.f36170R.offset(textView.getPaddingLeft(), textView.getPaddingTop());
                offsetDescendantRectToMyCoords(textView, this.f36170R);
                this.f36171S.set(this.f36170R);
                textView.getPaint().setShader(m33257N(m33270d, this.f36171S));
                textView.invalidate();
            }
        }
    }

    /* renamed from: N */
    private RadialGradient m33257N(RectF rectF, RectF rectF2) {
        if (!RectF.intersects(rectF, rectF2)) {
            return null;
        }
        return new RadialGradient(rectF.centerX() - this.f36171S.left, rectF.centerY() - this.f36171S.top, rectF.width() * 0.5f, this.f36174V, this.f36175W, Shader.TileMode.CLAMP);
    }

    /* renamed from: O */
    private static float m33258O(float f11, float f12, float f13) {
        return Math.max(Math.max(f11, f12), f13);
    }

    /* renamed from: Q */
    private void m33259Q(int i11) {
        LayoutInflater from = LayoutInflater.from(getContext());
        int size = this.f36172T.size();
        for (int i12 = 0; i12 < Math.max(this.f36180e0.length, size); i12++) {
            TextView textView = (TextView) this.f36172T.get(i12);
            if (i12 >= this.f36180e0.length) {
                removeView(textView);
                this.f36172T.remove(i12);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(AbstractC23583h.material_clockface_textview, (ViewGroup) this, false);
                    this.f36172T.put(i12, textView);
                    addView(textView);
                }
                textView.setVisibility(0);
                textView.setText(this.f36180e0[i12]);
                textView.setTag(AbstractC23581f.material_value_index, Integer.valueOf(i12));
                AbstractC1579n0.m7801A0(textView, this.f36173U);
                textView.setTextColor(this.f36182g0);
                if (i11 != 0) {
                    textView.setContentDescription(getResources().getString(i11, this.f36180e0[i12]));
                }
            }
        }
    }

    @Override // com.google.android.material.timepicker.RadialViewGroup
    /* renamed from: F */
    public void mo33260F(int i11) {
        if (i11 != m33279E()) {
            super.mo33260F(i11);
            this.f36169Q.m33273j(m33279E());
        }
    }

    /* renamed from: P */
    public void m33261P(String[] strArr, int i11) {
        this.f36180e0 = strArr;
        m33259Q(i11);
    }

    @Override // com.google.android.material.timepicker.ClockHandView.InterfaceC6450c
    /* renamed from: a */
    public void mo33262a(float f11, boolean z11) {
        if (Math.abs(this.f36181f0 - f11) > 0.001f) {
            this.f36181f0 = f11;
            m33256M();
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C1507g0.m7571I0(accessibilityNodeInfo).m7622f0(C1507g0.b.m7661b(1, this.f36180e0.length, false, 1));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        m33256M();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public void onMeasure(int i11, int i12) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int m33258O = (int) (this.f36179d0 / m33258O(this.f36177b0 / displayMetrics.heightPixels, this.f36178c0 / displayMetrics.widthPixels, 1.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(m33258O, 1073741824);
        setMeasuredDimension(m33258O, m33258O);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public ClockFaceView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f36170R = new Rect();
        this.f36171S = new RectF();
        this.f36172T = new SparseArray();
        this.f36175W = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC23587l.ClockFaceView, i11, AbstractC23586k.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        ColorStateList m143973a = AbstractC28774c.m143973a(context, obtainStyledAttributes, AbstractC23587l.ClockFaceView_clockNumberTextColor);
        this.f36182g0 = m143973a;
        LayoutInflater.from(context).inflate(AbstractC23583h.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(AbstractC23581f.material_clock_hand);
        this.f36169Q = clockHandView;
        this.f36176a0 = resources.getDimensionPixelSize(AbstractC23579d.material_clock_hand_padding);
        int colorForState = m143973a.getColorForState(new int[]{R.attr.state_selected}, m143973a.getDefaultColor());
        this.f36174V = new int[]{colorForState, colorForState, m143973a.getDefaultColor()};
        clockHandView.m33269b(this);
        int defaultColor = AbstractC19694b.m103335c(context, AbstractC23578c.material_timepicker_clockface).getDefaultColor();
        ColorStateList m143973a2 = AbstractC28774c.m143973a(context, obtainStyledAttributes, AbstractC23587l.ClockFaceView_clockFaceBackgroundColor);
        setBackgroundColor(m143973a2 != null ? m143973a2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC6446a());
        setFocusable(true);
        obtainStyledAttributes.recycle();
        this.f36173U = new C6447b();
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        m33261P(strArr, 0);
        this.f36177b0 = resources.getDimensionPixelSize(AbstractC23579d.material_time_picker_minimum_screen_height);
        this.f36178c0 = resources.getDimensionPixelSize(AbstractC23579d.material_time_picker_minimum_screen_width);
        this.f36179d0 = resources.getDimensionPixelSize(AbstractC23579d.material_clock_size);
    }
}
