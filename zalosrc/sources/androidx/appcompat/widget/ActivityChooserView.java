package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.core.view.AbstractC1530b;
import androidx.core.view.AbstractC1579n0;
import androidx.core.view.accessibility.C1507g0;
import p175g0.AbstractC19181d;
import p175g0.AbstractC19183f;
import p175g0.AbstractC19184g;
import p175g0.AbstractC19185h;
import p175g0.AbstractC19187j;
import p336m0.InterfaceC22701e;

/* loaded from: classes2.dex */
public class ActivityChooserView extends ViewGroup {

    /* renamed from: A */
    private final ViewTreeObserver.OnGlobalLayoutListener f4222A;

    /* renamed from: B */
    private ListPopupWindow f4223B;

    /* renamed from: C */
    PopupWindow.OnDismissListener f4224C;

    /* renamed from: D */
    boolean f4225D;

    /* renamed from: E */
    int f4226E;

    /* renamed from: F */
    private boolean f4227F;

    /* renamed from: G */
    private int f4228G;

    /* renamed from: p */
    final C1102f f4229p;

    /* renamed from: q */
    private final ViewOnClickListenerC1103g f4230q;

    /* renamed from: r */
    private final View f4231r;

    /* renamed from: s */
    private final Drawable f4232s;

    /* renamed from: t */
    final FrameLayout f4233t;

    /* renamed from: u */
    private final ImageView f4234u;

    /* renamed from: v */
    final FrameLayout f4235v;

    /* renamed from: w */
    private final ImageView f4236w;

    /* renamed from: x */
    private final int f4237x;

    /* renamed from: y */
    AbstractC1530b f4238y;

    /* renamed from: z */
    final DataSetObserver f4239z;

    /* loaded from: classes2.dex */
    public static class InnerLayout extends LinearLayout {

        /* renamed from: p */
        private static final int[] f4240p = {R.attr.background};

        public InnerLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            C1211t1 m5715u = C1211t1.m5715u(context, attributeSet, f4240p);
            setBackgroundDrawable(m5715u.m5723g(0));
            m5715u.m5736w();
        }
    }

    /* renamed from: androidx.appcompat.widget.ActivityChooserView$a */
    /* loaded from: classes2.dex */
    class C1097a extends DataSetObserver {
        C1097a() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            super.onChanged();
            ActivityChooserView.this.f4229p.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            super.onInvalidated();
            ActivityChooserView.this.f4229p.notifyDataSetInvalidated();
        }
    }

    /* renamed from: androidx.appcompat.widget.ActivityChooserView$b */
    /* loaded from: classes2.dex */
    class ViewTreeObserverOnGlobalLayoutListenerC1098b implements ViewTreeObserver.OnGlobalLayoutListener {
        ViewTreeObserverOnGlobalLayoutListenerC1098b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (ActivityChooserView.this.m5230b()) {
                if (!ActivityChooserView.this.isShown()) {
                    ActivityChooserView.this.getListPopupWindow().dismiss();
                    return;
                }
                ActivityChooserView.this.getListPopupWindow().mo5011a();
                AbstractC1530b abstractC1530b = ActivityChooserView.this.f4238y;
                if (abstractC1530b != null) {
                    abstractC1530b.m7707j(true);
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.ActivityChooserView$c */
    /* loaded from: classes2.dex */
    class C1099c extends View.AccessibilityDelegate {
        C1099c() {
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            C1507g0.m7571I0(accessibilityNodeInfo).m7613a0(true);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActivityChooserView$d */
    /* loaded from: classes2.dex */
    class C1100d extends AbstractViewOnTouchListenerC1155b1 {
        C1100d(View view) {
            super(view);
        }

        @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC1155b1
        /* renamed from: b */
        public InterfaceC22701e mo4976b() {
            return ActivityChooserView.this.getListPopupWindow();
        }

        @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC1155b1
        /* renamed from: c */
        protected boolean mo4977c() {
            ActivityChooserView.this.m5231c();
            return true;
        }

        @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC1155b1
        /* renamed from: d */
        protected boolean mo5210d() {
            ActivityChooserView.this.m5229a();
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActivityChooserView$e */
    /* loaded from: classes2.dex */
    class C1101e extends DataSetObserver {
        C1101e() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            super.onChanged();
            ActivityChooserView.this.m5233e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.ActivityChooserView$f */
    /* loaded from: classes2.dex */
    public class C1102f extends BaseAdapter {

        /* renamed from: p */
        private int f4246p = 4;

        /* renamed from: q */
        private boolean f4247q;

        /* renamed from: r */
        private boolean f4248r;

        /* renamed from: s */
        private boolean f4249s;

        C1102f() {
        }

        /* renamed from: a */
        public int m5234a() {
            throw null;
        }

        /* renamed from: b */
        public AbstractC1157c m5235b() {
            return null;
        }

        /* renamed from: c */
        public ResolveInfo m5236c() {
            throw null;
        }

        /* renamed from: d */
        public int m5237d() {
            throw null;
        }

        /* renamed from: e */
        public boolean m5238e() {
            return this.f4247q;
        }

        /* renamed from: f */
        public void m5239f(AbstractC1157c abstractC1157c) {
            ActivityChooserView.this.f4229p.m5235b();
            notifyDataSetChanged();
        }

        @Override // android.widget.Adapter
        public int getCount() {
            throw null;
        }

        @Override // android.widget.Adapter
        public Object getItem(int i11) {
            int itemViewType = getItemViewType(i11);
            if (itemViewType != 0) {
                if (itemViewType == 1) {
                    return null;
                }
                throw new IllegalArgumentException();
            }
            if (!this.f4247q) {
                throw null;
            }
            throw null;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i11) {
            return i11;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getItemViewType(int i11) {
            if (this.f4249s && i11 == getCount() - 1) {
                return 1;
            }
            return 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i11, View view, ViewGroup viewGroup) {
            int itemViewType = getItemViewType(i11);
            if (itemViewType != 0) {
                if (itemViewType == 1) {
                    if (view == null || view.getId() != 1) {
                        View inflate = LayoutInflater.from(ActivityChooserView.this.getContext()).inflate(AbstractC19184g.abc_activity_chooser_view_list_item, viewGroup, false);
                        inflate.setId(1);
                        ((TextView) inflate.findViewById(AbstractC19183f.title)).setText(ActivityChooserView.this.getContext().getString(AbstractC19185h.abc_activity_chooser_view_see_all));
                        return inflate;
                    }
                    return view;
                }
                throw new IllegalArgumentException();
            }
            if (view == null || view.getId() != AbstractC19183f.list_item) {
                view = LayoutInflater.from(ActivityChooserView.this.getContext()).inflate(AbstractC19184g.abc_activity_chooser_view_list_item, viewGroup, false);
            }
            PackageManager packageManager = ActivityChooserView.this.getContext().getPackageManager();
            ImageView imageView = (ImageView) view.findViewById(AbstractC19183f.icon);
            ResolveInfo resolveInfo = (ResolveInfo) getItem(i11);
            imageView.setImageDrawable(resolveInfo.loadIcon(packageManager));
            ((TextView) view.findViewById(AbstractC19183f.title)).setText(resolveInfo.loadLabel(packageManager));
            if (this.f4247q && i11 == 0 && this.f4248r) {
                view.setActivated(true);
            } else {
                view.setActivated(false);
            }
            return view;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getViewTypeCount() {
            return 3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.ActivityChooserView$g */
    /* loaded from: classes2.dex */
    public class ViewOnClickListenerC1103g implements AdapterView.OnItemClickListener, View.OnClickListener, View.OnLongClickListener, PopupWindow.OnDismissListener {
        ViewOnClickListenerC1103g() {
        }

        /* renamed from: a */
        private void m5240a() {
            PopupWindow.OnDismissListener onDismissListener = ActivityChooserView.this.f4224C;
            if (onDismissListener != null) {
                onDismissListener.onDismiss();
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (view != activityChooserView.f4235v) {
                if (view == activityChooserView.f4233t) {
                    activityChooserView.f4225D = false;
                    activityChooserView.m5232d(activityChooserView.f4226E);
                    return;
                }
                throw new IllegalArgumentException();
            }
            activityChooserView.m5229a();
            ActivityChooserView.this.f4229p.m5236c();
            ActivityChooserView.this.f4229p.m5235b();
            throw null;
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            m5240a();
            AbstractC1530b abstractC1530b = ActivityChooserView.this.f4238y;
            if (abstractC1530b != null) {
                abstractC1530b.m7707j(false);
            }
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i11, long j11) {
            int itemViewType = ((C1102f) adapterView.getAdapter()).getItemViewType(i11);
            if (itemViewType != 0) {
                if (itemViewType == 1) {
                    ActivityChooserView.this.m5232d(Integer.MAX_VALUE);
                    return;
                }
                throw new IllegalArgumentException();
            }
            ActivityChooserView.this.m5229a();
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (activityChooserView.f4225D) {
                if (i11 <= 0) {
                    return;
                }
                activityChooserView.f4229p.m5235b();
                throw null;
            }
            activityChooserView.f4229p.m5238e();
            ActivityChooserView.this.f4229p.m5235b();
            throw null;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (view == activityChooserView.f4235v) {
                if (activityChooserView.f4229p.getCount() > 0) {
                    ActivityChooserView activityChooserView2 = ActivityChooserView.this;
                    activityChooserView2.f4225D = true;
                    activityChooserView2.m5232d(activityChooserView2.f4226E);
                }
                return true;
            }
            throw new IllegalArgumentException();
        }
    }

    public ActivityChooserView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public boolean m5229a() {
        if (m5230b()) {
            getListPopupWindow().dismiss();
            ViewTreeObserver viewTreeObserver = getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeGlobalOnLayoutListener(this.f4222A);
                return true;
            }
            return true;
        }
        return true;
    }

    /* renamed from: b */
    public boolean m5230b() {
        return getListPopupWindow().mo5012b();
    }

    /* renamed from: c */
    public boolean m5231c() {
        if (m5230b() || !this.f4227F) {
            return false;
        }
        this.f4225D = false;
        m5232d(this.f4226E);
        return true;
    }

    /* renamed from: d */
    void m5232d(int i11) {
        this.f4229p.m5235b();
        throw new IllegalStateException("No data model. Did you call #setDataModel?");
    }

    /* renamed from: e */
    void m5233e() {
        if (this.f4229p.getCount() > 0) {
            this.f4233t.setEnabled(true);
        } else {
            this.f4233t.setEnabled(false);
        }
        int m5234a = this.f4229p.m5234a();
        int m5237d = this.f4229p.m5237d();
        if (m5234a != 1 && (m5234a <= 1 || m5237d <= 0)) {
            this.f4235v.setVisibility(8);
        } else {
            this.f4235v.setVisibility(0);
            ResolveInfo m5236c = this.f4229p.m5236c();
            PackageManager packageManager = getContext().getPackageManager();
            this.f4236w.setImageDrawable(m5236c.loadIcon(packageManager));
            if (this.f4228G != 0) {
                this.f4235v.setContentDescription(getContext().getString(this.f4228G, m5236c.loadLabel(packageManager)));
            }
        }
        if (this.f4235v.getVisibility() == 0) {
            this.f4231r.setBackgroundDrawable(this.f4232s);
        } else {
            this.f4231r.setBackgroundDrawable(null);
        }
    }

    public AbstractC1157c getDataModel() {
        this.f4229p.m5235b();
        return null;
    }

    ListPopupWindow getListPopupWindow() {
        if (this.f4223B == null) {
            ListPopupWindow listPopupWindow = new ListPopupWindow(getContext());
            this.f4223B = listPopupWindow;
            listPopupWindow.mo5262n(this.f4229p);
            this.f4223B.m5295D(this);
            this.f4223B.m5301J(true);
            this.f4223B.m5303L(this.f4230q);
            this.f4223B.m5302K(this.f4230q);
        }
        return this.f4223B;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f4229p.m5235b();
        this.f4227F = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f4229p.m5235b();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f4222A);
        }
        if (m5230b()) {
            m5229a();
        }
        this.f4227F = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        this.f4231r.layout(0, 0, i13 - i11, i14 - i12);
        if (!m5230b()) {
            m5229a();
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i11, int i12) {
        View view = this.f4231r;
        if (this.f4235v.getVisibility() != 0) {
            i12 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i12), 1073741824);
        }
        measureChild(view, i11, i12);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    public void setActivityChooserModel(AbstractC1157c abstractC1157c) {
        this.f4229p.m5239f(abstractC1157c);
        if (m5230b()) {
            m5229a();
            m5231c();
        }
    }

    public void setDefaultActionButtonContentDescription(int i11) {
        this.f4228G = i11;
    }

    public void setExpandActivityOverflowButtonContentDescription(int i11) {
        this.f4234u.setContentDescription(getContext().getString(i11));
    }

    public void setExpandActivityOverflowButtonDrawable(Drawable drawable) {
        this.f4234u.setImageDrawable(drawable);
    }

    public void setInitialActivityCount(int i11) {
        this.f4226E = i11;
    }

    public void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.f4224C = onDismissListener;
    }

    public void setProvider(AbstractC1530b abstractC1530b) {
        this.f4238y = abstractC1530b;
    }

    public ActivityChooserView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f4239z = new C1097a();
        this.f4222A = new ViewTreeObserverOnGlobalLayoutListenerC1098b();
        this.f4226E = 4;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC19187j.ActivityChooserView, i11, 0);
        AbstractC1579n0.m7912y0(this, context, AbstractC19187j.ActivityChooserView, attributeSet, obtainStyledAttributes, i11, 0);
        this.f4226E = obtainStyledAttributes.getInt(AbstractC19187j.ActivityChooserView_initialActivityCount, 4);
        Drawable drawable = obtainStyledAttributes.getDrawable(AbstractC19187j.ActivityChooserView_expandActivityOverflowButtonDrawable);
        obtainStyledAttributes.recycle();
        LayoutInflater.from(getContext()).inflate(AbstractC19184g.abc_activity_chooser_view, (ViewGroup) this, true);
        ViewOnClickListenerC1103g viewOnClickListenerC1103g = new ViewOnClickListenerC1103g();
        this.f4230q = viewOnClickListenerC1103g;
        View findViewById = findViewById(AbstractC19183f.activity_chooser_view_content);
        this.f4231r = findViewById;
        this.f4232s = findViewById.getBackground();
        FrameLayout frameLayout = (FrameLayout) findViewById(AbstractC19183f.default_activity_button);
        this.f4235v = frameLayout;
        frameLayout.setOnClickListener(viewOnClickListenerC1103g);
        frameLayout.setOnLongClickListener(viewOnClickListenerC1103g);
        this.f4236w = (ImageView) frameLayout.findViewById(AbstractC19183f.image);
        FrameLayout frameLayout2 = (FrameLayout) findViewById(AbstractC19183f.expand_activities_button);
        frameLayout2.setOnClickListener(viewOnClickListenerC1103g);
        frameLayout2.setAccessibilityDelegate(new C1099c());
        frameLayout2.setOnTouchListener(new C1100d(frameLayout2));
        this.f4233t = frameLayout2;
        ImageView imageView = (ImageView) frameLayout2.findViewById(AbstractC19183f.image);
        this.f4234u = imageView;
        imageView.setImageDrawable(drawable);
        C1102f c1102f = new C1102f();
        this.f4229p = c1102f;
        c1102f.registerDataSetObserver(new C1101e());
        Resources resources = context.getResources();
        this.f4237x = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(AbstractC19181d.abc_config_prefDialogWidth));
    }
}
