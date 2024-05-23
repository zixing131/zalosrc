package com.zing.p058v4.view;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.text.method.SingleLineTransformationMethod;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.core.widget.AbstractC1640l;
import com.zing.p058v4.view.ViewPager;
import java.lang.ref.WeakReference;
import java.util.Locale;

@ViewPager.InterfaceC6871f
/* loaded from: classes3.dex */
public class PagerTitleStrip extends ViewGroup {

    /* renamed from: D */
    private static final int[] f37699D = {R.attr.textAppearance, R.attr.textSize, R.attr.textColor, R.attr.gravity};

    /* renamed from: E */
    private static final int[] f37700E = {R.attr.textAllCaps};

    /* renamed from: A */
    private WeakReference f37701A;

    /* renamed from: B */
    private int f37702B;

    /* renamed from: C */
    int f37703C;

    /* renamed from: p */
    ViewPager f37704p;

    /* renamed from: q */
    TextView f37705q;

    /* renamed from: r */
    TextView f37706r;

    /* renamed from: s */
    TextView f37707s;

    /* renamed from: t */
    private int f37708t;

    /* renamed from: u */
    float f37709u;

    /* renamed from: v */
    private int f37710v;

    /* renamed from: w */
    private int f37711w;

    /* renamed from: x */
    private boolean f37712x;

    /* renamed from: y */
    private boolean f37713y;

    /* renamed from: z */
    private final C6863a f37714z;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.zing.v4.view.PagerTitleStrip$a */
    /* loaded from: classes3.dex */
    public class C6863a extends DataSetObserver implements ViewPager.InterfaceC6875j, ViewPager.InterfaceC6874i {

        /* renamed from: p */
        private int f37715p;

        C6863a() {
        }

        @Override // com.zing.p058v4.view.ViewPager.InterfaceC6874i
        /* renamed from: a */
        public void mo35301a(ViewPager viewPager, AbstractC6881a abstractC6881a, AbstractC6881a abstractC6881a2) {
            PagerTitleStrip.this.m35299b(abstractC6881a, abstractC6881a2);
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            PagerTitleStrip pagerTitleStrip = PagerTitleStrip.this;
            pagerTitleStrip.m35300c(pagerTitleStrip.f37704p.getCurrentItem(), PagerTitleStrip.this.f37704p.getAdapter());
            PagerTitleStrip pagerTitleStrip2 = PagerTitleStrip.this;
            float f11 = pagerTitleStrip2.f37709u;
            if (f11 < 0.0f) {
                f11 = 0.0f;
            }
            pagerTitleStrip2.mo35297d(pagerTitleStrip2.f37704p.getCurrentItem(), f11, true);
        }

        @Override // com.zing.p058v4.view.ViewPager.InterfaceC6875j
        public void onPageScrollStateChanged(int i11) {
            this.f37715p = i11;
        }

        @Override // com.zing.p058v4.view.ViewPager.InterfaceC6875j
        public void onPageScrolled(int i11, float f11, int i12) {
            if (f11 > 0.5f) {
                i11++;
            }
            PagerTitleStrip.this.mo35297d(i11, f11, false);
        }

        @Override // com.zing.p058v4.view.ViewPager.InterfaceC6875j
        public void onPageSelected(int i11) {
            if (this.f37715p == 0) {
                PagerTitleStrip pagerTitleStrip = PagerTitleStrip.this;
                pagerTitleStrip.m35300c(pagerTitleStrip.f37704p.getCurrentItem(), PagerTitleStrip.this.f37704p.getAdapter());
                PagerTitleStrip pagerTitleStrip2 = PagerTitleStrip.this;
                float f11 = pagerTitleStrip2.f37709u;
                if (f11 < 0.0f) {
                    f11 = 0.0f;
                }
                pagerTitleStrip2.mo35297d(pagerTitleStrip2.f37704p.getCurrentItem(), f11, true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.zing.v4.view.PagerTitleStrip$b */
    /* loaded from: classes3.dex */
    public static class C6864b extends SingleLineTransformationMethod {

        /* renamed from: a */
        private Locale f37717a;

        C6864b(Context context) {
            this.f37717a = context.getResources().getConfiguration().locale;
        }

        @Override // android.text.method.ReplacementTransformationMethod, android.text.method.TransformationMethod
        public CharSequence getTransformation(CharSequence charSequence, View view) {
            CharSequence transformation = super.getTransformation(charSequence, view);
            if (transformation != null) {
                return transformation.toString().toUpperCase(this.f37717a);
            }
            return null;
        }
    }

    public PagerTitleStrip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f37708t = -1;
        this.f37709u = -1.0f;
        this.f37714z = new C6863a();
        TextView textView = new TextView(context);
        this.f37705q = textView;
        addView(textView);
        TextView textView2 = new TextView(context);
        this.f37706r = textView2;
        addView(textView2);
        TextView textView3 = new TextView(context);
        this.f37707s = textView3;
        addView(textView3);
        int[] iArr = f37699D;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, 0, 0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            AbstractC1640l.m8424o(this.f37705q, resourceId);
            AbstractC1640l.m8424o(this.f37706r, resourceId);
            AbstractC1640l.m8424o(this.f37707s, resourceId);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        if (dimensionPixelSize != 0) {
            m35298a(0, dimensionPixelSize);
        }
        if (obtainStyledAttributes.hasValue(2)) {
            int color = obtainStyledAttributes.getColor(2, 0);
            this.f37705q.setTextColor(color);
            this.f37706r.setTextColor(color);
            this.f37707s.setTextColor(color);
        }
        this.f37711w = obtainStyledAttributes.getInteger(3, 80);
        obtainStyledAttributes.recycle();
        this.f37703C = this.f37706r.getTextColors().getDefaultColor();
        setNonPrimaryAlpha(0.6f);
        TextView textView4 = this.f37705q;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView4.setEllipsize(truncateAt);
        this.f37706r.setEllipsize(truncateAt);
        this.f37707s.setEllipsize(truncateAt);
        if (resourceId != 0) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, f37700E);
            boolean z11 = obtainStyledAttributes2.getBoolean(0, false);
            obtainStyledAttributes2.recycle();
            if (z11) {
                setSingleLineAllCaps(this.f37705q);
                setSingleLineAllCaps(this.f37706r);
                setSingleLineAllCaps(this.f37707s);
                this.f37710v = (int) (context.getResources().getDisplayMetrics().density * 16.0f);
            }
        }
        this.f37705q.setSingleLine();
        this.f37706r.setSingleLine();
        this.f37707s.setSingleLine();
        this.f37710v = (int) (context.getResources().getDisplayMetrics().density * 16.0f);
    }

    private static void setSingleLineAllCaps(TextView textView) {
        textView.setTransformationMethod(new C6864b(textView.getContext()));
    }

    /* renamed from: a */
    public void m35298a(int i11, float f11) {
        this.f37705q.setTextSize(i11, f11);
        this.f37706r.setTextSize(i11, f11);
        this.f37707s.setTextSize(i11, f11);
    }

    /* renamed from: b */
    void m35299b(AbstractC6881a abstractC6881a, AbstractC6881a abstractC6881a2) {
        if (abstractC6881a != null) {
            abstractC6881a.m35350v(this.f37714z);
            this.f37701A = null;
        }
        if (abstractC6881a2 != null) {
            abstractC6881a2.m35342n(this.f37714z);
            this.f37701A = new WeakReference(abstractC6881a2);
        }
        ViewPager viewPager = this.f37704p;
        if (viewPager != null) {
            this.f37708t = -1;
            this.f37709u = -1.0f;
            m35300c(viewPager.getCurrentItem(), abstractC6881a2);
            requestLayout();
        }
    }

    /* renamed from: c */
    void m35300c(int i11, AbstractC6881a abstractC6881a) {
        int i12;
        CharSequence charSequence;
        CharSequence charSequence2;
        if (abstractC6881a != null) {
            i12 = abstractC6881a.mo35335g();
        } else {
            i12 = 0;
        }
        this.f37712x = true;
        CharSequence charSequence3 = null;
        if (i11 >= 1 && abstractC6881a != null) {
            charSequence = abstractC6881a.mo35337i(i11 - 1);
        } else {
            charSequence = null;
        }
        this.f37705q.setText(charSequence);
        TextView textView = this.f37706r;
        if (abstractC6881a != null && i11 < i12) {
            charSequence2 = abstractC6881a.mo35337i(i11);
        } else {
            charSequence2 = null;
        }
        textView.setText(charSequence2);
        int i13 = i11 + 1;
        if (i13 < i12 && abstractC6881a != null) {
            charSequence3 = abstractC6881a.mo35337i(i13);
        }
        this.f37707s.setText(charSequence3);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, (int) (((getWidth() - getPaddingLeft()) - getPaddingRight()) * 0.8f)), Integer.MIN_VALUE);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.max(0, (getHeight() - getPaddingTop()) - getPaddingBottom()), Integer.MIN_VALUE);
        this.f37705q.measure(makeMeasureSpec, makeMeasureSpec2);
        this.f37706r.measure(makeMeasureSpec, makeMeasureSpec2);
        this.f37707s.measure(makeMeasureSpec, makeMeasureSpec2);
        this.f37708t = i11;
        if (!this.f37713y) {
            mo35297d(i11, this.f37709u, false);
        }
        this.f37712x = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo35297d(int i11, float f11, boolean z11) {
        int i12;
        int i13;
        int i14;
        int i15;
        if (i11 != this.f37708t) {
            m35300c(i11, this.f37704p.getAdapter());
        } else if (!z11 && f11 == this.f37709u) {
            return;
        }
        this.f37713y = true;
        int measuredWidth = this.f37705q.getMeasuredWidth();
        int measuredWidth2 = this.f37706r.getMeasuredWidth();
        int measuredWidth3 = this.f37707s.getMeasuredWidth();
        int i16 = measuredWidth2 / 2;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i17 = paddingRight + i16;
        int i18 = (width - (paddingLeft + i16)) - i17;
        float f12 = 0.5f + f11;
        if (f12 > 1.0f) {
            f12 -= 1.0f;
        }
        int i19 = ((width - i17) - ((int) (i18 * f12))) - i16;
        int i21 = measuredWidth2 + i19;
        int baseline = this.f37705q.getBaseline();
        int baseline2 = this.f37706r.getBaseline();
        int baseline3 = this.f37707s.getBaseline();
        int max = Math.max(Math.max(baseline, baseline2), baseline3);
        int i22 = max - baseline;
        int i23 = max - baseline2;
        int i24 = max - baseline3;
        int max2 = Math.max(Math.max(this.f37705q.getMeasuredHeight() + i22, this.f37706r.getMeasuredHeight() + i23), this.f37707s.getMeasuredHeight() + i24);
        int i25 = this.f37711w & 112;
        if (i25 != 16) {
            if (i25 != 80) {
                i13 = i22 + paddingTop;
                i14 = i23 + paddingTop;
                i15 = paddingTop + i24;
                TextView textView = this.f37706r;
                textView.layout(i19, i14, i21, textView.getMeasuredHeight() + i14);
                int min = Math.min(paddingLeft, (i19 - this.f37710v) - measuredWidth);
                TextView textView2 = this.f37705q;
                textView2.layout(min, i13, measuredWidth + min, textView2.getMeasuredHeight() + i13);
                int max3 = Math.max((width - paddingRight) - measuredWidth3, i21 + this.f37710v);
                TextView textView3 = this.f37707s;
                textView3.layout(max3, i15, max3 + measuredWidth3, textView3.getMeasuredHeight() + i15);
                this.f37709u = f11;
                this.f37713y = false;
            }
            i12 = (height - paddingBottom) - max2;
        } else {
            i12 = (((height - paddingTop) - paddingBottom) - max2) / 2;
        }
        i13 = i22 + i12;
        i14 = i23 + i12;
        i15 = i12 + i24;
        TextView textView4 = this.f37706r;
        textView4.layout(i19, i14, i21, textView4.getMeasuredHeight() + i14);
        int min2 = Math.min(paddingLeft, (i19 - this.f37710v) - measuredWidth);
        TextView textView22 = this.f37705q;
        textView22.layout(min2, i13, measuredWidth + min2, textView22.getMeasuredHeight() + i13);
        int max32 = Math.max((width - paddingRight) - measuredWidth3, i21 + this.f37710v);
        TextView textView32 = this.f37707s;
        textView32.layout(max32, i15, max32 + measuredWidth3, textView32.getMeasuredHeight() + i15);
        this.f37709u = f11;
        this.f37713y = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getMinHeight() {
        Drawable background = getBackground();
        if (background != null) {
            return background.getIntrinsicHeight();
        }
        return 0;
    }

    public int getTextSpacing() {
        return this.f37710v;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        AbstractC6881a abstractC6881a;
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof ViewPager) {
            ViewPager viewPager = (ViewPager) parent;
            AbstractC6881a adapter = viewPager.getAdapter();
            viewPager.setInternalPageChangeListener(this.f37714z);
            viewPager.addOnAdapterChangeListener(this.f37714z);
            this.f37704p = viewPager;
            WeakReference weakReference = this.f37701A;
            if (weakReference != null) {
                abstractC6881a = (AbstractC6881a) weakReference.get();
            } else {
                abstractC6881a = null;
            }
            m35299b(abstractC6881a, adapter);
            return;
        }
        throw new IllegalStateException("PagerTitleStrip must be a direct child of a ViewPager.");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ViewPager viewPager = this.f37704p;
        if (viewPager != null) {
            m35299b(viewPager.getAdapter(), null);
            this.f37704p.setInternalPageChangeListener(null);
            this.f37704p.removeOnAdapterChangeListener(this.f37714z);
            this.f37704p = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        if (this.f37704p != null) {
            float f11 = this.f37709u;
            if (f11 < 0.0f) {
                f11 = 0.0f;
            }
            mo35297d(this.f37708t, f11, true);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i11, int i12) {
        int max;
        if (View.MeasureSpec.getMode(i11) == 1073741824) {
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i12, paddingTop, -2);
            int size = View.MeasureSpec.getSize(i11);
            int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i11, (int) (size * 0.2f), -2);
            this.f37705q.measure(childMeasureSpec2, childMeasureSpec);
            this.f37706r.measure(childMeasureSpec2, childMeasureSpec);
            this.f37707s.measure(childMeasureSpec2, childMeasureSpec);
            if (View.MeasureSpec.getMode(i12) == 1073741824) {
                max = View.MeasureSpec.getSize(i12);
            } else {
                max = Math.max(getMinHeight(), this.f37706r.getMeasuredHeight() + paddingTop);
            }
            setMeasuredDimension(size, View.resolveSizeAndState(max, i12, this.f37706r.getMeasuredState() << 16));
            return;
        }
        throw new IllegalStateException("Must measure with an exact width");
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (!this.f37712x) {
            super.requestLayout();
        }
    }

    public void setGravity(int i11) {
        this.f37711w = i11;
        requestLayout();
    }

    public void setNonPrimaryAlpha(float f11) {
        int i11 = ((int) (f11 * 255.0f)) & 255;
        this.f37702B = i11;
        int i12 = (i11 << 24) | (this.f37703C & 16777215);
        this.f37705q.setTextColor(i12);
        this.f37707s.setTextColor(i12);
    }

    public void setTextColor(int i11) {
        this.f37703C = i11;
        this.f37706r.setTextColor(i11);
        int i12 = (this.f37702B << 24) | (this.f37703C & 16777215);
        this.f37705q.setTextColor(i12);
        this.f37707s.setTextColor(i12);
    }

    public void setTextSpacing(int i11) {
        this.f37710v = i11;
        requestLayout();
    }
}
