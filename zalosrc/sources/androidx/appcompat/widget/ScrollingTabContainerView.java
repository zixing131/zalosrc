package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.LinearLayoutCompat;
import p175g0.AbstractC19178a;
import p310l0.C21980a;
import p664y.AbstractC30228a;

/* loaded from: classes2.dex */
public class ScrollingTabContainerView extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* renamed from: y */
    private static final Interpolator f4389y = new DecelerateInterpolator();

    /* renamed from: p */
    Runnable f4390p;

    /* renamed from: q */
    private ViewOnClickListenerC1121c f4391q;

    /* renamed from: r */
    LinearLayoutCompat f4392r;

    /* renamed from: s */
    private Spinner f4393s;

    /* renamed from: t */
    private boolean f4394t;

    /* renamed from: u */
    int f4395u;

    /* renamed from: v */
    int f4396v;

    /* renamed from: w */
    private int f4397w;

    /* renamed from: x */
    private int f4398x;

    /* renamed from: androidx.appcompat.widget.ScrollingTabContainerView$a */
    /* loaded from: classes2.dex */
    public class RunnableC1119a implements Runnable {

        /* renamed from: p */
        final /* synthetic */ View f4399p;

        RunnableC1119a(View view) {
            this.f4399p = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            ScrollingTabContainerView.this.smoothScrollTo(this.f4399p.getLeft() - ((ScrollingTabContainerView.this.getWidth() - this.f4399p.getWidth()) / 2), 0);
            ScrollingTabContainerView.this.f4390p = null;
        }
    }

    /* renamed from: androidx.appcompat.widget.ScrollingTabContainerView$b */
    /* loaded from: classes2.dex */
    public class C1120b extends BaseAdapter {
        C1120b() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return ScrollingTabContainerView.this.f4392r.getChildCount();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i11) {
            ((C1122d) ScrollingTabContainerView.this.f4392r.getChildAt(i11)).m5335b();
            return null;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i11) {
            return i11;
        }

        @Override // android.widget.Adapter
        public View getView(int i11, View view, ViewGroup viewGroup) {
            if (view == null) {
                ScrollingTabContainerView scrollingTabContainerView = ScrollingTabContainerView.this;
                AbstractC30228a.m149044a(getItem(i11));
                return scrollingTabContainerView.m5333c(null, true);
            }
            AbstractC30228a.m149044a(getItem(i11));
            ((C1122d) view).m5334a(null);
            return view;
        }
    }

    /* renamed from: androidx.appcompat.widget.ScrollingTabContainerView$c */
    /* loaded from: classes2.dex */
    public class ViewOnClickListenerC1121c implements View.OnClickListener {
        ViewOnClickListenerC1121c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ((C1122d) view).m5335b();
            throw null;
        }
    }

    /* renamed from: androidx.appcompat.widget.ScrollingTabContainerView$d */
    /* loaded from: classes2.dex */
    public class C1122d extends LinearLayout {

        /* renamed from: p */
        private final int[] f4403p;

        public C1122d(Context context, ActionBar.AbstractC1024a abstractC1024a, boolean z11) {
            super(context, null, AbstractC19178a.actionBarTabStyle);
            int[] iArr = {R.attr.background};
            this.f4403p = iArr;
            C1211t1 m5716v = C1211t1.m5716v(context, null, iArr, AbstractC19178a.actionBarTabStyle, 0);
            if (m5716v.m5735s(0)) {
                setBackgroundDrawable(m5716v.m5723g(0));
            }
            m5716v.m5736w();
            if (z11) {
                setGravity(8388627);
            }
            m5336c();
        }

        /* renamed from: a */
        public void m5334a(ActionBar.AbstractC1024a abstractC1024a) {
            m5336c();
        }

        /* renamed from: b */
        public ActionBar.AbstractC1024a m5335b() {
            return null;
        }

        /* renamed from: c */
        public void m5336c() {
            throw null;
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i11, int i12) {
            super.onMeasure(i11, i12);
            if (ScrollingTabContainerView.this.f4395u > 0) {
                int measuredWidth = getMeasuredWidth();
                int i13 = ScrollingTabContainerView.this.f4395u;
                if (measuredWidth > i13) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i13, 1073741824), i12);
                }
            }
        }

        @Override // android.view.View
        public void setSelected(boolean z11) {
            boolean z12;
            if (isSelected() != z11) {
                z12 = true;
            } else {
                z12 = false;
            }
            super.setSelected(z11);
            if (z12 && z11) {
                sendAccessibilityEvent(4);
            }
        }
    }

    /* renamed from: b */
    private Spinner m5328b() {
        AppCompatSpinner appCompatSpinner = new AppCompatSpinner(getContext(), null, AbstractC19178a.actionDropDownStyle);
        appCompatSpinner.setLayoutParams(new LinearLayoutCompat.LayoutParams(-2, -1));
        appCompatSpinner.setOnItemSelectedListener(this);
        return appCompatSpinner;
    }

    /* renamed from: d */
    private boolean m5329d() {
        Spinner spinner = this.f4393s;
        if (spinner != null && spinner.getParent() == this) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    private void m5330e() {
        if (m5329d()) {
            return;
        }
        if (this.f4393s == null) {
            this.f4393s = m5328b();
        }
        removeView(this.f4392r);
        addView(this.f4393s, new ViewGroup.LayoutParams(-2, -1));
        if (this.f4393s.getAdapter() == null) {
            this.f4393s.setAdapter((SpinnerAdapter) new C1120b());
        }
        Runnable runnable = this.f4390p;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.f4390p = null;
        }
        this.f4393s.setSelection(this.f4398x);
    }

    /* renamed from: f */
    private boolean m5331f() {
        if (!m5329d()) {
            return false;
        }
        removeView(this.f4393s);
        addView(this.f4392r, new ViewGroup.LayoutParams(-2, -1));
        setTabSelected(this.f4393s.getSelectedItemPosition());
        return false;
    }

    /* renamed from: a */
    public void m5332a(int i11) {
        View childAt = this.f4392r.getChildAt(i11);
        Runnable runnable = this.f4390p;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        RunnableC1119a runnableC1119a = new RunnableC1119a(childAt);
        this.f4390p = runnableC1119a;
        post(runnableC1119a);
    }

    /* renamed from: c */
    C1122d m5333c(ActionBar.AbstractC1024a abstractC1024a, boolean z11) {
        C1122d c1122d = new C1122d(getContext(), abstractC1024a, z11);
        if (z11) {
            c1122d.setBackgroundDrawable(null);
            c1122d.setLayoutParams(new AbsListView.LayoutParams(-1, this.f4397w));
        } else {
            c1122d.setFocusable(true);
            if (this.f4391q == null) {
                this.f4391q = new ViewOnClickListenerC1121c();
            }
            c1122d.setOnClickListener(this.f4391q);
        }
        return c1122d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.f4390p;
        if (runnable != null) {
            post(runnable);
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C21980a m114787b = C21980a.m114787b(getContext());
        setContentHeight(m114787b.m114792f());
        this.f4396v = m114787b.m114791e();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f4390p;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView adapterView, View view, int i11, long j11) {
        ((C1122d) view).m5335b();
        throw null;
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i11, int i12) {
        boolean z11;
        int mode = View.MeasureSpec.getMode(i11);
        if (mode == 1073741824) {
            z11 = true;
        } else {
            z11 = false;
        }
        setFillViewport(z11);
        int childCount = this.f4392r.getChildCount();
        if (childCount > 1 && (mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            if (childCount > 2) {
                this.f4395u = (int) (View.MeasureSpec.getSize(i11) * 0.4f);
            } else {
                this.f4395u = View.MeasureSpec.getSize(i11) / 2;
            }
            this.f4395u = Math.min(this.f4395u, this.f4396v);
        } else {
            this.f4395u = -1;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f4397w, 1073741824);
        if (!z11 && this.f4394t) {
            this.f4392r.measure(0, makeMeasureSpec);
            if (this.f4392r.getMeasuredWidth() > View.MeasureSpec.getSize(i11)) {
                m5330e();
            } else {
                m5331f();
            }
        } else {
            m5331f();
        }
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(i11, makeMeasureSpec);
        int measuredWidth2 = getMeasuredWidth();
        if (z11 && measuredWidth != measuredWidth2) {
            setTabSelected(this.f4398x);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView adapterView) {
    }

    public void setAllowCollapse(boolean z11) {
        this.f4394t = z11;
    }

    public void setContentHeight(int i11) {
        this.f4397w = i11;
        requestLayout();
    }

    public void setTabSelected(int i11) {
        boolean z11;
        this.f4398x = i11;
        int childCount = this.f4392r.getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = this.f4392r.getChildAt(i12);
            if (i12 == i11) {
                z11 = true;
            } else {
                z11 = false;
            }
            childAt.setSelected(z11);
            if (z11) {
                m5332a(i11);
            }
        }
        Spinner spinner = this.f4393s;
        if (spinner != null && i11 >= 0) {
            spinner.setSelection(i11);
        }
    }
}
