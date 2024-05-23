package com.zing.zalo.p077ui.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import com.zing.p058v4.view.ViewPager;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8923h0;
import java.util.Locale;

/* loaded from: classes6.dex */
public class PagerSlidingTabStrip extends HorizontalScrollView {

    /* renamed from: S */
    private static final int[] f69411S = {R.attr.textSize, R.attr.textColor};

    /* renamed from: A */
    int f69412A;

    /* renamed from: B */
    int f69413B;

    /* renamed from: C */
    int f69414C;

    /* renamed from: D */
    boolean f69415D;

    /* renamed from: E */
    boolean f69416E;

    /* renamed from: F */
    int f69417F;

    /* renamed from: G */
    int f69418G;

    /* renamed from: H */
    int f69419H;

    /* renamed from: I */
    int f69420I;

    /* renamed from: J */
    int f69421J;

    /* renamed from: K */
    int f69422K;

    /* renamed from: L */
    int f69423L;

    /* renamed from: M */
    int f69424M;

    /* renamed from: N */
    Typeface f69425N;

    /* renamed from: O */
    int f69426O;

    /* renamed from: P */
    int f69427P;

    /* renamed from: Q */
    int f69428Q;

    /* renamed from: R */
    Locale f69429R;

    /* renamed from: p */
    LinearLayout.LayoutParams f69430p;

    /* renamed from: q */
    LinearLayout.LayoutParams f69431q;

    /* renamed from: r */
    final C13515c f69432r;

    /* renamed from: s */
    public ViewPager.InterfaceC6875j f69433s;

    /* renamed from: t */
    LinearLayout f69434t;

    /* renamed from: u */
    ViewPager f69435u;

    /* renamed from: v */
    int f69436v;

    /* renamed from: w */
    int f69437w;

    /* renamed from: x */
    float f69438x;

    /* renamed from: y */
    Paint f69439y;

    /* renamed from: z */
    Paint f69440z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C13512a();

        /* renamed from: p */
        int f69441p;

        /* renamed from: com.zing.zalo.ui.widget.PagerSlidingTabStrip$SavedState$a */
        /* loaded from: classes6.dex */
        class C13512a implements Parcelable.Creator {
            C13512a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i11) {
                return new SavedState[i11];
            }
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            super.writeToParcel(parcel, i11);
            parcel.writeInt(this.f69441p);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f69441p = parcel.readInt();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.widget.PagerSlidingTabStrip$a */
    /* loaded from: classes6.dex */
    public class ViewTreeObserverOnGlobalLayoutListenerC13513a implements ViewTreeObserver.OnGlobalLayoutListener {
        ViewTreeObserverOnGlobalLayoutListenerC13513a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            PagerSlidingTabStrip.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            PagerSlidingTabStrip pagerSlidingTabStrip = PagerSlidingTabStrip.this;
            pagerSlidingTabStrip.f69437w = pagerSlidingTabStrip.f69435u.getCurrentItem();
            PagerSlidingTabStrip pagerSlidingTabStrip2 = PagerSlidingTabStrip.this;
            pagerSlidingTabStrip2.m75809e(pagerSlidingTabStrip2.f69437w, 0);
        }
    }

    /* renamed from: com.zing.zalo.ui.widget.PagerSlidingTabStrip$b */
    /* loaded from: classes6.dex */
    public interface InterfaceC13514b {
        /* renamed from: b */
        View mo36134b(int i11);
    }

    /* renamed from: com.zing.zalo.ui.widget.PagerSlidingTabStrip$c */
    /* loaded from: classes6.dex */
    private class C13515c implements ViewPager.InterfaceC6875j {
        @Override // com.zing.p058v4.view.ViewPager.InterfaceC6875j
        public void onPageScrollStateChanged(int i11) {
            if (i11 == 0) {
                PagerSlidingTabStrip pagerSlidingTabStrip = PagerSlidingTabStrip.this;
                pagerSlidingTabStrip.m75809e(pagerSlidingTabStrip.f69435u.getCurrentItem(), 0);
            }
            ViewPager.InterfaceC6875j interfaceC6875j = PagerSlidingTabStrip.this.f69433s;
            if (interfaceC6875j != null) {
                interfaceC6875j.onPageScrollStateChanged(i11);
            }
        }

        @Override // com.zing.p058v4.view.ViewPager.InterfaceC6875j
        public void onPageScrolled(int i11, float f11, int i12) {
            PagerSlidingTabStrip pagerSlidingTabStrip = PagerSlidingTabStrip.this;
            pagerSlidingTabStrip.f69437w = i11;
            pagerSlidingTabStrip.f69438x = f11;
            pagerSlidingTabStrip.m75809e(i11, (int) (pagerSlidingTabStrip.f69434t.getChildAt(i11).getWidth() * f11));
            PagerSlidingTabStrip.this.invalidate();
            ViewPager.InterfaceC6875j interfaceC6875j = PagerSlidingTabStrip.this.f69433s;
            if (interfaceC6875j != null) {
                interfaceC6875j.onPageScrolled(i11, f11, i12);
            }
        }

        @Override // com.zing.p058v4.view.ViewPager.InterfaceC6875j
        public void onPageSelected(int i11) {
            ViewPager.InterfaceC6875j interfaceC6875j = PagerSlidingTabStrip.this.f69433s;
            if (interfaceC6875j != null) {
                interfaceC6875j.onPageSelected(i11);
            }
            PagerSlidingTabStrip.this.m75810f();
        }

        private C13515c() {
        }
    }

    public PagerSlidingTabStrip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f69432r = new C13515c();
        this.f69437w = 0;
        this.f69438x = 0.0f;
        this.f69412A = -10066330;
        this.f69413B = 436207616;
        this.f69414C = 436207616;
        this.f69415D = false;
        this.f69416E = true;
        this.f69417F = 52;
        this.f69418G = 8;
        this.f69419H = 2;
        this.f69420I = 12;
        this.f69421J = 12;
        this.f69422K = 1;
        this.f69423L = 12;
        this.f69424M = -10066330;
        this.f69425N = null;
        this.f69426O = 1;
        this.f69427P = 0;
        this.f69428Q = AbstractC16803z.background_tab;
        setFillViewport(true);
        setWillNotDraw(false);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f69434t = linearLayout;
        linearLayout.setOrientation(0);
        this.f69434t.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(this.f69434t);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f69417F = (int) TypedValue.applyDimension(1, this.f69417F, displayMetrics);
        this.f69418G = (int) TypedValue.applyDimension(1, this.f69418G, displayMetrics);
        this.f69419H = (int) TypedValue.applyDimension(1, this.f69419H, displayMetrics);
        this.f69420I = (int) TypedValue.applyDimension(1, this.f69420I, displayMetrics);
        this.f69421J = (int) TypedValue.applyDimension(1, this.f69421J, displayMetrics);
        this.f69422K = (int) TypedValue.applyDimension(1, this.f69422K, displayMetrics);
        this.f69423L = (int) TypedValue.applyDimension(1, this.f69423L, displayMetrics);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f69411S);
        this.f69423L = obtainStyledAttributes.getDimensionPixelSize(0, this.f69423L);
        this.f69424M = obtainStyledAttributes.getColor(1, this.f69424M);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC8923h0.PagerSlidingTabStrip);
        this.f69412A = obtainStyledAttributes2.getColor(AbstractC8923h0.PagerSlidingTabStrip_pstsIndicatorColor, this.f69412A);
        this.f69413B = obtainStyledAttributes2.getColor(AbstractC8923h0.PagerSlidingTabStrip_pstsUnderlineColor, this.f69413B);
        this.f69414C = obtainStyledAttributes2.getColor(AbstractC8923h0.PagerSlidingTabStrip_pstsDividerColor, this.f69414C);
        this.f69418G = obtainStyledAttributes2.getDimensionPixelSize(AbstractC8923h0.PagerSlidingTabStrip_pstsIndicatorHeight, this.f69418G);
        this.f69419H = obtainStyledAttributes2.getDimensionPixelSize(AbstractC8923h0.PagerSlidingTabStrip_pstsUnderlineHeight, this.f69419H);
        this.f69420I = obtainStyledAttributes2.getDimensionPixelSize(AbstractC8923h0.PagerSlidingTabStrip_pstsDividerPadding, this.f69420I);
        this.f69421J = obtainStyledAttributes2.getDimensionPixelSize(AbstractC8923h0.PagerSlidingTabStrip_pstsTabPaddingLeftRight, this.f69421J);
        this.f69428Q = obtainStyledAttributes2.getResourceId(AbstractC8923h0.PagerSlidingTabStrip_pstsTabBackground, this.f69428Q);
        this.f69415D = obtainStyledAttributes2.getBoolean(AbstractC8923h0.PagerSlidingTabStrip_pstsShouldExpand, this.f69415D);
        this.f69417F = obtainStyledAttributes2.getDimensionPixelSize(AbstractC8923h0.PagerSlidingTabStrip_pstsScrollOffset, this.f69417F);
        this.f69416E = obtainStyledAttributes2.getBoolean(AbstractC8923h0.PagerSlidingTabStrip_pstsTextAllCaps, this.f69416E);
        obtainStyledAttributes2.recycle();
        Paint paint = new Paint();
        this.f69439y = paint;
        paint.setAntiAlias(true);
        this.f69439y.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f69440z = paint2;
        paint2.setAntiAlias(true);
        this.f69440z.setStrokeWidth(this.f69422K);
        this.f69430p = new LinearLayout.LayoutParams(-2, -1);
        this.f69431q = new LinearLayout.LayoutParams(0, -1, 1.0f);
        if (this.f69429R == null) {
            this.f69429R = getResources().getConfiguration().locale;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m75806c(int i11, View view) {
        this.f69435u.setCurrentItem(i11);
        m75810f();
    }

    /* renamed from: b */
    void m75807b(final int i11, View view) {
        LinearLayout.LayoutParams layoutParams;
        view.setFocusable(true);
        view.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.widget.y0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                PagerSlidingTabStrip.this.m75806c(i11, view2);
            }
        });
        int i12 = this.f69421J;
        view.setPadding(i12, 0, i12, 0);
        LinearLayout linearLayout = this.f69434t;
        if (this.f69415D) {
            layoutParams = this.f69431q;
        } else {
            layoutParams = this.f69430p;
        }
        linearLayout.addView(view, i11, layoutParams);
    }

    /* renamed from: d */
    public void m75808d() {
        this.f69434t.removeAllViews();
        this.f69436v = this.f69435u.getAdapter().mo35335g();
        for (int i11 = 0; i11 < this.f69436v; i11++) {
            m75807b(i11, ((InterfaceC13514b) this.f69435u.getAdapter()).mo36134b(i11));
        }
        m75810f();
        getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC13513a());
    }

    /* renamed from: e */
    void m75809e(int i11, int i12) {
        if (this.f69436v == 0) {
            return;
        }
        int left = this.f69434t.getChildAt(i11).getLeft() + i12;
        if (i11 > 0 || i12 > 0) {
            left -= this.f69417F;
        }
        if (left != this.f69427P) {
            this.f69427P = left;
            scrollTo(left, 0);
        }
    }

    /* renamed from: f */
    void m75810f() {
        boolean z11;
        for (int i11 = 0; i11 < this.f69436v; i11++) {
            View childAt = this.f69434t.getChildAt(i11);
            childAt.setBackgroundResource(this.f69428Q);
            if (this.f69435u.getCurrentItem() == i11) {
                z11 = true;
            } else {
                z11 = false;
            }
            childAt.setSelected(z11);
        }
    }

    public int getDividerColor() {
        return this.f69414C;
    }

    public int getDividerPadding() {
        return this.f69420I;
    }

    public int getIndicatorColor() {
        return this.f69412A;
    }

    public int getIndicatorHeight() {
        return this.f69418G;
    }

    public int getScrollOffset() {
        return this.f69417F;
    }

    public boolean getShouldExpand() {
        return this.f69415D;
    }

    public int getTabBackground() {
        return this.f69428Q;
    }

    public int getTabPaddingLeftRight() {
        return this.f69421J;
    }

    public int getTextColor() {
        return this.f69424M;
    }

    public int getTextSize() {
        return this.f69423L;
    }

    public int getUnderlineColor() {
        return this.f69413B;
    }

    public int getUnderlineHeight() {
        return this.f69419H;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int i11;
        super.onDraw(canvas);
        if (!isInEditMode() && this.f69436v != 0) {
            int height = getHeight();
            this.f69439y.setColor(this.f69412A);
            View childAt = this.f69434t.getChildAt(this.f69437w);
            float left = childAt.getLeft();
            float right = childAt.getRight();
            if (this.f69438x > 0.0f && (i11 = this.f69437w) < this.f69436v - 1) {
                View childAt2 = this.f69434t.getChildAt(i11 + 1);
                float left2 = childAt2.getLeft();
                float right2 = childAt2.getRight();
                float f11 = this.f69438x;
                left = (left2 * f11) + ((1.0f - f11) * left);
                right = (right2 * f11) + ((1.0f - f11) * right);
            }
            float f12 = height;
            canvas.drawRect(left, height - this.f69418G, right, f12, this.f69439y);
            this.f69439y.setColor(this.f69413B);
            canvas.drawRect(0.0f, height - this.f69419H, this.f69434t.getWidth(), f12, this.f69439y);
            this.f69440z.setColor(this.f69414C);
            for (int i12 = 0; i12 < this.f69436v - 1; i12++) {
                View childAt3 = this.f69434t.getChildAt(i12);
                canvas.drawLine(childAt3.getRight(), this.f69420I, childAt3.getRight(), height - this.f69420I, this.f69440z);
            }
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f69437w = savedState.f69441p;
        requestLayout();
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f69441p = this.f69437w;
        return savedState;
    }

    public void setAllCaps(boolean z11) {
        this.f69416E = z11;
    }

    public void setDividerColor(int i11) {
        this.f69414C = i11;
        invalidate();
    }

    public void setDividerColorResource(int i11) {
        this.f69414C = getResources().getColor(i11);
        invalidate();
    }

    public void setDividerPadding(int i11) {
        this.f69420I = i11;
        invalidate();
    }

    public void setIndicatorColor(int i11) {
        this.f69412A = i11;
        invalidate();
    }

    public void setIndicatorColorResource(int i11) {
        this.f69412A = getResources().getColor(i11);
        invalidate();
    }

    public void setIndicatorHeight(int i11) {
        this.f69418G = i11;
        invalidate();
    }

    public void setOnPageChangeListener(ViewPager.InterfaceC6875j interfaceC6875j) {
        this.f69433s = interfaceC6875j;
    }

    public void setScrollOffset(int i11) {
        this.f69417F = i11;
    }

    public void setShouldExpand(boolean z11) {
        this.f69415D = z11;
        requestLayout();
    }

    public void setTabBackground(int i11) {
        this.f69428Q = i11;
    }

    public void setTabPaddingLeftRight(int i11) {
        this.f69421J = i11;
        m75810f();
    }

    public void setTextColor(int i11) {
        this.f69424M = i11;
        m75810f();
    }

    public void setTextColorResource(int i11) {
        this.f69424M = getResources().getColor(i11);
        m75810f();
    }

    public void setTextSize(int i11) {
        this.f69423L = i11;
        m75810f();
    }

    public void setUnderlineColor(int i11) {
        this.f69413B = i11;
        invalidate();
    }

    public void setUnderlineColorResource(int i11) {
        this.f69413B = getResources().getColor(i11);
        invalidate();
    }

    public void setUnderlineHeight(int i11) {
        this.f69419H = i11;
        invalidate();
    }

    public void setViewPager(ViewPager viewPager) {
        this.f69435u = viewPager;
        if (viewPager.getAdapter() != null) {
            viewPager.setOnPageChangeListener(this.f69432r);
            m75808d();
            return;
        }
        throw new IllegalStateException("ViewPager does not have adapter instance.");
    }
}
