package com.zing.zalo.p077ui.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TextView;
import com.zing.p058v4.view.AbstractC6881a;
import com.zing.p058v4.view.ViewPager;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8923h0;
import java.util.HashMap;
import java.util.Map;
import me0.AbstractC23136l9;
import o70.C24105t0;

/* loaded from: classes.dex */
public class SlidingTabLayout extends HorizontalScrollView {

    /* renamed from: p */
    int f69618p;

    /* renamed from: q */
    int f69619q;

    /* renamed from: r */
    int f69620r;

    /* renamed from: s */
    boolean f69621s;

    /* renamed from: t */
    protected ViewPager f69622t;

    /* renamed from: u */
    protected ViewPager.InterfaceC6875j f69623u;

    /* renamed from: v */
    public int f69624v;

    /* renamed from: w */
    protected final SlidingTabStrip f69625w;

    /* renamed from: x */
    InterfaceC13529b f69626x;

    /* renamed from: y */
    Map f69627y;

    /* renamed from: com.zing.zalo.ui.widget.SlidingTabLayout$a */
    /* loaded from: classes.dex */
    private class C13528a implements ViewPager.InterfaceC6875j {

        /* renamed from: p */
        int f69628p;

        @Override // com.zing.p058v4.view.ViewPager.InterfaceC6875j
        public void onPageScrollStateChanged(int i11) {
            this.f69628p = i11;
            ViewPager.InterfaceC6875j interfaceC6875j = SlidingTabLayout.this.f69623u;
            if (interfaceC6875j != null) {
                interfaceC6875j.onPageScrollStateChanged(i11);
            }
        }

        @Override // com.zing.p058v4.view.ViewPager.InterfaceC6875j
        public void onPageScrolled(int i11, float f11, int i12) {
            SlidingTabLayout slidingTabLayout = SlidingTabLayout.this;
            int i13 = slidingTabLayout.f69624v;
            if (i13 != 0) {
                i11 %= i13;
                if (i11 != i13 - 1 || f11 == 0.0f) {
                    int childCount = slidingTabLayout.f69625w.getChildCount();
                    if (childCount != 0 && i11 >= 0 && i11 < childCount) {
                        SlidingTabLayout.this.f69625w.m75897c(i11, f11);
                    } else {
                        return;
                    }
                }
            } else {
                int childCount2 = slidingTabLayout.f69625w.getChildCount();
                if (childCount2 != 0 && i11 >= 0 && i11 < childCount2) {
                    SlidingTabLayout.this.f69625w.m75897c(i11, f11);
                } else {
                    return;
                }
            }
            ViewPager.InterfaceC6875j interfaceC6875j = SlidingTabLayout.this.f69623u;
            if (interfaceC6875j != null) {
                interfaceC6875j.onPageScrolled(i11, f11, i12);
            }
        }

        @Override // com.zing.p058v4.view.ViewPager.InterfaceC6875j
        public void onPageSelected(int i11) {
            try {
                if (this.f69628p == 0) {
                    SlidingTabLayout.this.f69625w.m75897c(i11, 0.0f);
                    SlidingTabLayout.this.m75893f(i11);
                }
                ViewPager.InterfaceC6875j interfaceC6875j = SlidingTabLayout.this.f69623u;
                if (interfaceC6875j != null) {
                    interfaceC6875j.onPageSelected(i11);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        private C13528a() {
        }
    }

    /* renamed from: com.zing.zalo.ui.widget.SlidingTabLayout$b */
    /* loaded from: classes6.dex */
    public interface InterfaceC13529b {
        /* renamed from: a */
        void mo67720a(View view, int i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.zing.zalo.ui.widget.SlidingTabLayout$c */
    /* loaded from: classes.dex */
    public class ViewOnClickListenerC13530c implements View.OnClickListener {
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            for (int i11 = 0; i11 < SlidingTabLayout.this.f69625w.getChildCount(); i11++) {
                if (view == SlidingTabLayout.this.f69625w.getChildAt(i11)) {
                    InterfaceC13529b interfaceC13529b = SlidingTabLayout.this.f69626x;
                    if (interfaceC13529b != null) {
                        interfaceC13529b.mo67720a(view, i11);
                    }
                    SlidingTabLayout.this.f69622t.setCurrentItem(i11);
                    SlidingTabLayout.this.f69625w.m75896b(i11);
                    return;
                }
            }
        }

        private ViewOnClickListenerC13530c() {
        }
    }

    /* renamed from: com.zing.zalo.ui.widget.SlidingTabLayout$d */
    /* loaded from: classes6.dex */
    public interface InterfaceC13531d {
        /* renamed from: a */
        int mo39372a(int i11);

        /* renamed from: b */
        int mo39373b(int i11);
    }

    public SlidingTabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC16781w.SlidingTabLayoutStyle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public View mo39378a(Context context) {
        return LayoutInflater.from(context).inflate(AbstractC7409c0.circle_indicator, (ViewGroup) this.f69625w, false);
    }

    /* renamed from: b */
    protected TextView m75889b(Context context, CharSequence charSequence) {
        RobotoTextView robotoTextView = new RobotoTextView(context);
        robotoTextView.setId(AbstractC6918a0.tabsText);
        robotoTextView.setLayoutParams(new TableLayout.LayoutParams(-1, -1, 1.0f));
        robotoTextView.setGravity(17);
        robotoTextView.setTextSize(0, getResources().getDimensionPixelSize(AbstractC16802y.tab_title_text_size));
        robotoTextView.setTextColor(AbstractC23136l9.m118645D(context, AbstractC16803z.subtab_text_selector));
        robotoTextView.setTypeface(Typeface.DEFAULT_BOLD);
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(R.attr.selectableItemBackground, typedValue, true);
        robotoTextView.setBackgroundResource(typedValue.resourceId);
        robotoTextView.setAllCaps(true);
        int i11 = (int) (getResources().getDisplayMetrics().density * 16.0f);
        robotoTextView.setPadding(i11, i11, i11, i11);
        if (!TextUtils.isEmpty(charSequence)) {
            robotoTextView.setText(charSequence);
        }
        return robotoTextView;
    }

    /* renamed from: c */
    protected View m75890c(Context context, int i11) {
        View inflate = LayoutInflater.from(context).inflate(AbstractC7409c0.new_stencils_tabs_bg, (ViewGroup) this.f69625w, false);
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(R.attr.selectableItemBackground, typedValue, true);
        inflate.setBackgroundResource(typedValue.resourceId);
        ((ImageView) inflate.findViewById(AbstractC6918a0.icon)).setImageResource(i11);
        return inflate;
    }

    /* renamed from: d */
    public void m75891d() {
        this.f69625w.removeAllViews();
        ViewPager viewPager = this.f69622t;
        if (viewPager != null) {
            viewPager.setOnPageChangeListener(new C13528a());
            m75892e();
            if (this.f69622t.getAdapter() != null) {
                SlidingTabStrip slidingTabStrip = this.f69625w;
                int i11 = this.f69624v;
                if (i11 == 0) {
                    i11 = this.f69622t.getAdapter().mo35335g();
                }
                slidingTabStrip.setWeightSum(i11);
            }
        }
    }

    /* renamed from: e */
    protected void m75892e() {
        int i11;
        View view;
        View view2;
        View view3;
        AbstractC6881a adapter = this.f69622t.getAdapter();
        ViewOnClickListenerC13530c viewOnClickListenerC13530c = new ViewOnClickListenerC13530c();
        int i12 = this.f69624v;
        if (i12 == 0) {
            i12 = adapter.mo35335g();
        }
        int i13 = this.f69620r;
        if (i13 != 1) {
            if (i13 != 2) {
                for (int i14 = 0; i14 < i12; i14++) {
                    if (this.f69619q != 0) {
                        view3 = LayoutInflater.from(getContext()).inflate(this.f69619q, (ViewGroup) this.f69625w, false);
                    } else {
                        view3 = null;
                    }
                    if (view3 == null) {
                        view3 = m75889b(getContext(), adapter.mo35337i(i14));
                    }
                    if (view3 != null) {
                        view3.setOnClickListener(viewOnClickListenerC13530c);
                        this.f69625w.addView(view3);
                    }
                }
            } else {
                for (int i15 = 0; i15 < i12; i15++) {
                    if (this.f69619q != 0) {
                        view2 = LayoutInflater.from(getContext()).inflate(this.f69619q, (ViewGroup) this.f69625w, false);
                    } else {
                        view2 = null;
                    }
                    if (view2 == null) {
                        view2 = mo39378a(getContext());
                    }
                    if (view2 != null) {
                        view2.setOnClickListener(viewOnClickListenerC13530c);
                        this.f69625w.addView(view2);
                    }
                }
            }
        } else {
            int[] iArr = new int[i12];
            if (adapter instanceof C24105t0) {
                iArr = ((C24105t0) adapter).m125989A();
            } else {
                for (int i16 = 0; i16 < i12; i16++) {
                    iArr[i16] = 0;
                }
            }
            for (int i17 = 0; i17 < i12; i17++) {
                if (iArr != null && iArr.length > i17) {
                    i11 = iArr[i17];
                } else {
                    i11 = 0;
                }
                if (this.f69619q != 0) {
                    view = LayoutInflater.from(getContext()).inflate(this.f69619q, (ViewGroup) this.f69625w, false);
                } else {
                    view = null;
                }
                if (view == null) {
                    view = m75890c(getContext(), i11);
                }
                if (this.f69621s) {
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
                    layoutParams.width = 0;
                    layoutParams.weight = 1.0f;
                }
                if (view != null) {
                    view.setOnClickListener(viewOnClickListenerC13530c);
                    this.f69625w.addView(view);
                    if (i17 == this.f69622t.getCurrentItem()) {
                        view.setSelected(true);
                    }
                }
            }
        }
        this.f69627y.clear();
    }

    /* renamed from: f */
    public void m75893f(int i11) {
        View childAt;
        int childCount = this.f69625w.getChildCount();
        if (childCount != 0 && i11 >= 0 && i11 < childCount && (childAt = this.f69625w.getChildAt(i11)) != null) {
            int left = (childAt.getLeft() - childAt.getWidth()) - getScrollX();
            int right = ((childAt.getRight() + childAt.getWidth()) - getWidth()) - getScrollX();
            if (right > 0) {
                smoothScrollBy(right, 0);
            } else if (left < 0) {
                smoothScrollBy(left, 0);
            }
        }
    }

    public SlidingTabStrip getTabStrip() {
        return this.f69625w;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewPager viewPager = this.f69622t;
        if (viewPager != null) {
            m75893f(viewPager.getCurrentItem());
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null && motionEvent.getAction() == 0) {
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
        } else if (motionEvent != null && ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3 || motionEvent.getAction() == 6) && getParent() != null)) {
            getParent().requestDisallowInterceptTouchEvent(false);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void setCustomTabColorizer(InterfaceC13531d interfaceC13531d) {
        this.f69625w.setCustomTabColorizer(interfaceC13531d);
    }

    public void setDistributeEvenly(boolean z11) {
        this.f69621s = z11;
    }

    public void setDividerColors(int... iArr) {
        this.f69625w.setDividerColors(iArr);
    }

    public void setEnableDivider(boolean z11) {
        this.f69625w.setEnableDivider(z11);
    }

    public void setOnPageChangeListener(ViewPager.InterfaceC6875j interfaceC6875j) {
        this.f69623u = interfaceC6875j;
    }

    public void setOnTabClickListener(InterfaceC13529b interfaceC13529b) {
        this.f69626x = interfaceC13529b;
    }

    public void setSelectedIndicatorColors(int... iArr) {
        this.f69625w.setSelectedIndicatorColors(iArr);
    }

    public void setViewPager(ViewPager viewPager) {
        float mo35335g;
        this.f69625w.removeAllViews();
        this.f69622t = viewPager;
        if (viewPager != null) {
            viewPager.setOnPageChangeListener(new C13528a());
            m75892e();
            if (viewPager.getAdapter() != null) {
                SlidingTabStrip slidingTabStrip = this.f69625w;
                int i11 = this.f69624v;
                if (i11 != 0) {
                    mo35335g = i11;
                } else {
                    mo35335g = viewPager.getAdapter().mo35335g();
                }
                slidingTabStrip.setWeightSum(mo35335g);
            }
        }
    }

    public SlidingTabLayout(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f69620r = 0;
        this.f69624v = 0;
        this.f69627y = new HashMap();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC8923h0.SlidingTabLayout, i11, 0);
        try {
            this.f69620r = obtainStyledAttributes.getInt(AbstractC8923h0.SlidingTabLayout_typeOfTab, 0);
            obtainStyledAttributes.recycle();
            setHorizontalScrollBarEnabled(false);
            this.f69618p = (int) (getResources().getDisplayMetrics().density * 24.0f);
            SlidingTabStrip slidingTabStrip = new SlidingTabStrip(context);
            this.f69625w = slidingTabStrip;
            slidingTabStrip.setBackgroundColor(0);
            if (this.f69620r == 2) {
                setFillViewport(false);
                slidingTabStrip.setCircleView(true);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -1);
                layoutParams.gravity = 17;
                addView(slidingTabStrip, layoutParams);
                slidingTabStrip.setPadding(5, 0, 5, 0);
                return;
            }
            setFillViewport(true);
            addView(slidingTabStrip, -1, -1);
        } catch (Throwable th2) {
            if (obtainStyledAttributes != null) {
                obtainStyledAttributes.recycle();
            }
            throw th2;
        }
    }
}
