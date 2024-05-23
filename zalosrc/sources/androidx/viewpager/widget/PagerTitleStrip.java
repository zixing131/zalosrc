package androidx.viewpager.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.text.method.SingleLineTransformationMethod;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.core.widget.AbstractC1640l;
import androidx.viewpager.widget.ViewPager;
import java.lang.ref.WeakReference;
import java.util.Locale;

@ViewPager.InterfaceC2057e
/* loaded from: classes2.dex */
public class PagerTitleStrip extends ViewGroup {

    /* renamed from: D */
    private static final int[] f8767D = {R.attr.textAppearance, R.attr.textSize, R.attr.textColor, R.attr.gravity};

    /* renamed from: E */
    private static final int[] f8768E = {R.attr.textAllCaps};

    /* renamed from: A */
    private WeakReference f8769A;

    /* renamed from: B */
    private int f8770B;

    /* renamed from: C */
    int f8771C;

    /* renamed from: p */
    ViewPager f8772p;

    /* renamed from: q */
    TextView f8773q;

    /* renamed from: r */
    TextView f8774r;

    /* renamed from: s */
    TextView f8775s;

    /* renamed from: t */
    private int f8776t;

    /* renamed from: u */
    float f8777u;

    /* renamed from: v */
    private int f8778v;

    /* renamed from: w */
    private int f8779w;

    /* renamed from: x */
    private boolean f8780x;

    /* renamed from: y */
    private boolean f8781y;

    /* renamed from: z */
    private final C2050a f8782z;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.viewpager.widget.PagerTitleStrip$a */
    /* loaded from: classes2.dex */
    public class C2050a extends DataSetObserver implements ViewPager.InterfaceC2061i, ViewPager.InterfaceC2060h {

        /* renamed from: p */
        private int f8783p;

        C2050a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC2060h
        /* renamed from: a */
        public void mo11158a(ViewPager viewPager, AbstractC2065a abstractC2065a, AbstractC2065a abstractC2065a2) {
            PagerTitleStrip.this.m11156b(abstractC2065a, abstractC2065a2);
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            PagerTitleStrip pagerTitleStrip = PagerTitleStrip.this;
            pagerTitleStrip.m11157c(pagerTitleStrip.f8772p.getCurrentItem(), PagerTitleStrip.this.f8772p.getAdapter());
            PagerTitleStrip pagerTitleStrip2 = PagerTitleStrip.this;
            float f11 = pagerTitleStrip2.f8777u;
            if (f11 < 0.0f) {
                f11 = 0.0f;
            }
            pagerTitleStrip2.mo11154d(pagerTitleStrip2.f8772p.getCurrentItem(), f11, true);
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC2061i
        public void onPageScrollStateChanged(int i11) {
            this.f8783p = i11;
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC2061i
        public void onPageScrolled(int i11, float f11, int i12) {
            if (f11 > 0.5f) {
                i11++;
            }
            PagerTitleStrip.this.mo11154d(i11, f11, false);
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC2061i
        public void onPageSelected(int i11) {
            if (this.f8783p == 0) {
                PagerTitleStrip pagerTitleStrip = PagerTitleStrip.this;
                pagerTitleStrip.m11157c(pagerTitleStrip.f8772p.getCurrentItem(), PagerTitleStrip.this.f8772p.getAdapter());
                PagerTitleStrip pagerTitleStrip2 = PagerTitleStrip.this;
                float f11 = pagerTitleStrip2.f8777u;
                if (f11 < 0.0f) {
                    f11 = 0.0f;
                }
                pagerTitleStrip2.mo11154d(pagerTitleStrip2.f8772p.getCurrentItem(), f11, true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.viewpager.widget.PagerTitleStrip$b */
    /* loaded from: classes2.dex */
    public static class C2051b extends SingleLineTransformationMethod {

        /* renamed from: a */
        private Locale f8785a;

        C2051b(Context context) {
            this.f8785a = context.getResources().getConfiguration().locale;
        }

        @Override // android.text.method.ReplacementTransformationMethod, android.text.method.TransformationMethod
        public CharSequence getTransformation(CharSequence charSequence, View view) {
            CharSequence transformation = super.getTransformation(charSequence, view);
            if (transformation != null) {
                return transformation.toString().toUpperCase(this.f8785a);
            }
            return null;
        }
    }

    public PagerTitleStrip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8776t = -1;
        this.f8777u = -1.0f;
        this.f8782z = new C2050a();
        TextView textView = new TextView(context);
        this.f8773q = textView;
        addView(textView);
        TextView textView2 = new TextView(context);
        this.f8774r = textView2;
        addView(textView2);
        TextView textView3 = new TextView(context);
        this.f8775s = textView3;
        addView(textView3);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f8767D);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            AbstractC1640l.m8424o(this.f8773q, resourceId);
            AbstractC1640l.m8424o(this.f8774r, resourceId);
            AbstractC1640l.m8424o(this.f8775s, resourceId);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        if (dimensionPixelSize != 0) {
            m11155a(0, dimensionPixelSize);
        }
        if (obtainStyledAttributes.hasValue(2)) {
            int color = obtainStyledAttributes.getColor(2, 0);
            this.f8773q.setTextColor(color);
            this.f8774r.setTextColor(color);
            this.f8775s.setTextColor(color);
        }
        this.f8779w = obtainStyledAttributes.getInteger(3, 80);
        obtainStyledAttributes.recycle();
        this.f8771C = this.f8774r.getTextColors().getDefaultColor();
        setNonPrimaryAlpha(0.6f);
        TextView textView4 = this.f8773q;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView4.setEllipsize(truncateAt);
        this.f8774r.setEllipsize(truncateAt);
        this.f8775s.setEllipsize(truncateAt);
        if (resourceId != 0) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, f8768E);
            boolean z11 = obtainStyledAttributes2.getBoolean(0, false);
            obtainStyledAttributes2.recycle();
            if (z11) {
                setSingleLineAllCaps(this.f8773q);
                setSingleLineAllCaps(this.f8774r);
                setSingleLineAllCaps(this.f8775s);
                this.f8778v = (int) (context.getResources().getDisplayMetrics().density * 16.0f);
            }
        }
        this.f8773q.setSingleLine();
        this.f8774r.setSingleLine();
        this.f8775s.setSingleLine();
        this.f8778v = (int) (context.getResources().getDisplayMetrics().density * 16.0f);
    }

    private static void setSingleLineAllCaps(TextView textView) {
        textView.setTransformationMethod(new C2051b(textView.getContext()));
    }

    /* renamed from: a */
    public void m11155a(int i11, float f11) {
        this.f8773q.setTextSize(i11, f11);
        this.f8774r.setTextSize(i11, f11);
        this.f8775s.setTextSize(i11, f11);
    }

    /* renamed from: b */
    void m11156b(AbstractC2065a abstractC2065a, AbstractC2065a abstractC2065a2) {
        if (abstractC2065a != null) {
            abstractC2065a.m11235s(this.f8782z);
            this.f8769A = null;
        }
        if (abstractC2065a2 != null) {
            abstractC2065a2.m11227k(this.f8782z);
            this.f8769A = new WeakReference(abstractC2065a2);
        }
        ViewPager viewPager = this.f8772p;
        if (viewPager != null) {
            this.f8776t = -1;
            this.f8777u = -1.0f;
            m11157c(viewPager.getCurrentItem(), abstractC2065a2);
            requestLayout();
        }
    }

    /* renamed from: c */
    void m11157c(int i11, AbstractC2065a abstractC2065a) {
        int i12;
        CharSequence charSequence;
        CharSequence charSequence2;
        if (abstractC2065a != null) {
            i12 = abstractC2065a.mo11220d();
        } else {
            i12 = 0;
        }
        this.f8780x = true;
        CharSequence charSequence3 = null;
        if (i11 >= 1 && abstractC2065a != null) {
            charSequence = abstractC2065a.m11222f(i11 - 1);
        } else {
            charSequence = null;
        }
        this.f8773q.setText(charSequence);
        TextView textView = this.f8774r;
        if (abstractC2065a != null && i11 < i12) {
            charSequence2 = abstractC2065a.m11222f(i11);
        } else {
            charSequence2 = null;
        }
        textView.setText(charSequence2);
        int i13 = i11 + 1;
        if (i13 < i12 && abstractC2065a != null) {
            charSequence3 = abstractC2065a.m11222f(i13);
        }
        this.f8775s.setText(charSequence3);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, (int) (((getWidth() - getPaddingLeft()) - getPaddingRight()) * 0.8f)), Integer.MIN_VALUE);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.max(0, (getHeight() - getPaddingTop()) - getPaddingBottom()), Integer.MIN_VALUE);
        this.f8773q.measure(makeMeasureSpec, makeMeasureSpec2);
        this.f8774r.measure(makeMeasureSpec, makeMeasureSpec2);
        this.f8775s.measure(makeMeasureSpec, makeMeasureSpec2);
        this.f8776t = i11;
        if (!this.f8781y) {
            mo11154d(i11, this.f8777u, false);
        }
        this.f8780x = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo11154d(int i11, float f11, boolean z11) {
        int i12;
        int i13;
        int i14;
        int i15;
        if (i11 != this.f8776t) {
            m11157c(i11, this.f8772p.getAdapter());
        } else if (!z11 && f11 == this.f8777u) {
            return;
        }
        this.f8781y = true;
        int measuredWidth = this.f8773q.getMeasuredWidth();
        int measuredWidth2 = this.f8774r.getMeasuredWidth();
        int measuredWidth3 = this.f8775s.getMeasuredWidth();
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
        int baseline = this.f8773q.getBaseline();
        int baseline2 = this.f8774r.getBaseline();
        int baseline3 = this.f8775s.getBaseline();
        int max = Math.max(Math.max(baseline, baseline2), baseline3);
        int i22 = max - baseline;
        int i23 = max - baseline2;
        int i24 = max - baseline3;
        int max2 = Math.max(Math.max(this.f8773q.getMeasuredHeight() + i22, this.f8774r.getMeasuredHeight() + i23), this.f8775s.getMeasuredHeight() + i24);
        int i25 = this.f8779w & 112;
        if (i25 != 16) {
            if (i25 != 80) {
                i13 = i22 + paddingTop;
                i14 = i23 + paddingTop;
                i15 = paddingTop + i24;
                TextView textView = this.f8774r;
                textView.layout(i19, i14, i21, textView.getMeasuredHeight() + i14);
                int min = Math.min(paddingLeft, (i19 - this.f8778v) - measuredWidth);
                TextView textView2 = this.f8773q;
                textView2.layout(min, i13, measuredWidth + min, textView2.getMeasuredHeight() + i13);
                int max3 = Math.max((width - paddingRight) - measuredWidth3, i21 + this.f8778v);
                TextView textView3 = this.f8775s;
                textView3.layout(max3, i15, max3 + measuredWidth3, textView3.getMeasuredHeight() + i15);
                this.f8777u = f11;
                this.f8781y = false;
            }
            i12 = (height - paddingBottom) - max2;
        } else {
            i12 = (((height - paddingTop) - paddingBottom) - max2) / 2;
        }
        i13 = i22 + i12;
        i14 = i23 + i12;
        i15 = i12 + i24;
        TextView textView4 = this.f8774r;
        textView4.layout(i19, i14, i21, textView4.getMeasuredHeight() + i14);
        int min2 = Math.min(paddingLeft, (i19 - this.f8778v) - measuredWidth);
        TextView textView22 = this.f8773q;
        textView22.layout(min2, i13, measuredWidth + min2, textView22.getMeasuredHeight() + i13);
        int max32 = Math.max((width - paddingRight) - measuredWidth3, i21 + this.f8778v);
        TextView textView32 = this.f8775s;
        textView32.layout(max32, i15, max32 + measuredWidth3, textView32.getMeasuredHeight() + i15);
        this.f8777u = f11;
        this.f8781y = false;
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
        return this.f8778v;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        AbstractC2065a abstractC2065a;
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof ViewPager) {
            ViewPager viewPager = (ViewPager) parent;
            AbstractC2065a adapter = viewPager.getAdapter();
            viewPager.m11192W(this.f8782z);
            viewPager.m11197b(this.f8782z);
            this.f8772p = viewPager;
            WeakReference weakReference = this.f8769A;
            if (weakReference != null) {
                abstractC2065a = (AbstractC2065a) weakReference.get();
            } else {
                abstractC2065a = null;
            }
            m11156b(abstractC2065a, adapter);
            return;
        }
        throw new IllegalStateException("PagerTitleStrip must be a direct child of a ViewPager.");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ViewPager viewPager = this.f8772p;
        if (viewPager != null) {
            m11156b(viewPager.getAdapter(), null);
            this.f8772p.m11192W(null);
            this.f8772p.m11187O(this.f8782z);
            this.f8772p = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        if (this.f8772p != null) {
            float f11 = this.f8777u;
            if (f11 < 0.0f) {
                f11 = 0.0f;
            }
            mo11154d(this.f8776t, f11, true);
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
            this.f8773q.measure(childMeasureSpec2, childMeasureSpec);
            this.f8774r.measure(childMeasureSpec2, childMeasureSpec);
            this.f8775s.measure(childMeasureSpec2, childMeasureSpec);
            if (View.MeasureSpec.getMode(i12) == 1073741824) {
                max = View.MeasureSpec.getSize(i12);
            } else {
                max = Math.max(getMinHeight(), this.f8774r.getMeasuredHeight() + paddingTop);
            }
            setMeasuredDimension(size, View.resolveSizeAndState(max, i12, this.f8774r.getMeasuredState() << 16));
            return;
        }
        throw new IllegalStateException("Must measure with an exact width");
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (!this.f8780x) {
            super.requestLayout();
        }
    }

    public void setGravity(int i11) {
        this.f8779w = i11;
        requestLayout();
    }

    public void setNonPrimaryAlpha(float f11) {
        int i11 = ((int) (f11 * 255.0f)) & 255;
        this.f8770B = i11;
        int i12 = (i11 << 24) | (this.f8771C & 16777215);
        this.f8773q.setTextColor(i12);
        this.f8775s.setTextColor(i12);
    }

    public void setTextColor(int i11) {
        this.f8771C = i11;
        this.f8774r.setTextColor(i11);
        int i12 = (this.f8770B << 24) | (this.f8771C & 16777215);
        this.f8773q.setTextColor(i12);
        this.f8775s.setTextColor(i12);
    }

    public void setTextSpacing(int i11) {
        this.f8778v = i11;
        requestLayout();
    }
}
