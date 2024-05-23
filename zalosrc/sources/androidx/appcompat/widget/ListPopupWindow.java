package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.core.view.AbstractC1579n0;
import androidx.core.widget.AbstractC1638j;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import java.lang.reflect.Method;
import p175g0.AbstractC19178a;
import p175g0.AbstractC19187j;
import p336m0.InterfaceC22701e;

/* loaded from: classes2.dex */
public class ListPopupWindow implements InterfaceC22701e {

    /* renamed from: V */
    private static Method f4341V;

    /* renamed from: W */
    private static Method f4342W;

    /* renamed from: X */
    private static Method f4343X;

    /* renamed from: A */
    private int f4344A;

    /* renamed from: B */
    private boolean f4345B;

    /* renamed from: C */
    private boolean f4346C;

    /* renamed from: D */
    int f4347D;

    /* renamed from: E */
    private View f4348E;

    /* renamed from: F */
    private int f4349F;

    /* renamed from: G */
    private DataSetObserver f4350G;

    /* renamed from: H */
    private View f4351H;

    /* renamed from: I */
    private Drawable f4352I;

    /* renamed from: J */
    private AdapterView.OnItemClickListener f4353J;

    /* renamed from: K */
    private AdapterView.OnItemSelectedListener f4354K;

    /* renamed from: L */
    final RunnableC1118g f4355L;

    /* renamed from: M */
    private final ViewOnTouchListenerC1117f f4356M;

    /* renamed from: N */
    private final C1116e f4357N;

    /* renamed from: O */
    private final RunnableC1114c f4358O;

    /* renamed from: P */
    private Runnable f4359P;

    /* renamed from: Q */
    final Handler f4360Q;

    /* renamed from: R */
    private final Rect f4361R;

    /* renamed from: S */
    private Rect f4362S;

    /* renamed from: T */
    private boolean f4363T;

    /* renamed from: U */
    PopupWindow f4364U;

    /* renamed from: p */
    private Context f4365p;

    /* renamed from: q */
    private ListAdapter f4366q;

    /* renamed from: r */
    C1228z0 f4367r;

    /* renamed from: s */
    private int f4368s;

    /* renamed from: t */
    private int f4369t;

    /* renamed from: u */
    private int f4370u;

    /* renamed from: v */
    private int f4371v;

    /* renamed from: w */
    private int f4372w;

    /* renamed from: x */
    private boolean f4373x;

    /* renamed from: y */
    private boolean f4374y;

    /* renamed from: z */
    private boolean f4375z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.ListPopupWindow$a */
    /* loaded from: classes2.dex */
    public class RunnableC1112a implements Runnable {
        RunnableC1112a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            View m5316t = ListPopupWindow.this.m5316t();
            if (m5316t != null && m5316t.getWindowToken() != null) {
                ListPopupWindow.this.mo5011a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.ListPopupWindow$b */
    /* loaded from: classes2.dex */
    public class C1113b implements AdapterView.OnItemSelectedListener {
        C1113b() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i11, long j11) {
            C1228z0 c1228z0;
            if (i11 != -1 && (c1228z0 = ListPopupWindow.this.f4367r) != null) {
                c1228z0.setListSelectionHidden(false);
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.ListPopupWindow$c */
    /* loaded from: classes2.dex */
    public class RunnableC1114c implements Runnable {
        RunnableC1114c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ListPopupWindow.this.m5314r();
        }
    }

    /* renamed from: androidx.appcompat.widget.ListPopupWindow$d */
    /* loaded from: classes2.dex */
    private class C1115d extends DataSetObserver {
        C1115d() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            if (ListPopupWindow.this.mo5012b()) {
                ListPopupWindow.this.mo5011a();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            ListPopupWindow.this.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.ListPopupWindow$e */
    /* loaded from: classes2.dex */
    public class C1116e implements AbsListView.OnScrollListener {
        C1116e() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i11, int i12, int i13) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i11) {
            if (i11 == 1 && !ListPopupWindow.this.m5293A() && ListPopupWindow.this.f4364U.getContentView() != null) {
                ListPopupWindow listPopupWindow = ListPopupWindow.this;
                listPopupWindow.f4360Q.removeCallbacks(listPopupWindow.f4355L);
                ListPopupWindow.this.f4355L.run();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.ListPopupWindow$f */
    /* loaded from: classes2.dex */
    public class ViewOnTouchListenerC1117f implements View.OnTouchListener {
        ViewOnTouchListenerC1117f() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x11 = (int) motionEvent.getX();
            int y11 = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = ListPopupWindow.this.f4364U) != null && popupWindow.isShowing() && x11 >= 0 && x11 < ListPopupWindow.this.f4364U.getWidth() && y11 >= 0 && y11 < ListPopupWindow.this.f4364U.getHeight()) {
                ListPopupWindow listPopupWindow = ListPopupWindow.this;
                listPopupWindow.f4360Q.postDelayed(listPopupWindow.f4355L, 250L);
                return false;
            }
            if (action == 1) {
                ListPopupWindow listPopupWindow2 = ListPopupWindow.this;
                listPopupWindow2.f4360Q.removeCallbacks(listPopupWindow2.f4355L);
                return false;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.ListPopupWindow$g */
    /* loaded from: classes2.dex */
    public class RunnableC1118g implements Runnable {
        RunnableC1118g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C1228z0 c1228z0 = ListPopupWindow.this.f4367r;
            if (c1228z0 != null && AbstractC1579n0.m7862d0(c1228z0) && ListPopupWindow.this.f4367r.getCount() > ListPopupWindow.this.f4367r.getChildCount()) {
                int childCount = ListPopupWindow.this.f4367r.getChildCount();
                ListPopupWindow listPopupWindow = ListPopupWindow.this;
                if (childCount <= listPopupWindow.f4347D) {
                    listPopupWindow.f4364U.setInputMethodMode(2);
                    ListPopupWindow.this.mo5011a();
                }
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f4341V = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
            }
            try {
                f4343X = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                f4342W = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
            } catch (NoSuchMethodException unused3) {
            }
        }
    }

    public ListPopupWindow(Context context) {
        this(context, null, AbstractC19178a.listPopupWindowStyle);
    }

    /* renamed from: C */
    private void m5289C() {
        View view = this.f4348E;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f4348E);
            }
        }
    }

    /* renamed from: N */
    private void m5290N(boolean z11) {
        if (Build.VERSION.SDK_INT > 28) {
            this.f4364U.setIsClippedToScreen(z11);
            return;
        }
        Method method = f4341V;
        if (method != null) {
            try {
                method.invoke(this.f4364U, Boolean.valueOf(z11));
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: q */
    private int m5291q() {
        int i11;
        int i12;
        int makeMeasureSpec;
        int i13;
        boolean z11 = true;
        if (this.f4367r == null) {
            Context context = this.f4365p;
            this.f4359P = new RunnableC1112a();
            C1228z0 mo5315s = mo5315s(context, !this.f4363T);
            this.f4367r = mo5315s;
            Drawable drawable = this.f4352I;
            if (drawable != null) {
                mo5315s.setSelector(drawable);
            }
            this.f4367r.setAdapter(this.f4366q);
            this.f4367r.setOnItemClickListener(this.f4353J);
            this.f4367r.setFocusable(true);
            this.f4367r.setFocusableInTouchMode(true);
            this.f4367r.setOnItemSelectedListener(new C1113b());
            this.f4367r.setOnScrollListener(this.f4357N);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f4354K;
            if (onItemSelectedListener != null) {
                this.f4367r.setOnItemSelectedListener(onItemSelectedListener);
            }
            View view = this.f4367r;
            View view2 = this.f4348E;
            if (view2 != null) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0f);
                int i14 = this.f4349F;
                if (i14 != 0) {
                    if (i14 != 1) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Invalid hint position ");
                        sb2.append(this.f4349F);
                    } else {
                        linearLayout.addView(view, layoutParams);
                        linearLayout.addView(view2);
                    }
                } else {
                    linearLayout.addView(view2);
                    linearLayout.addView(view, layoutParams);
                }
                int i15 = this.f4369t;
                if (i15 >= 0) {
                    i13 = Integer.MIN_VALUE;
                } else {
                    i15 = 0;
                    i13 = 0;
                }
                view2.measure(View.MeasureSpec.makeMeasureSpec(i15, i13), 0);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) view2.getLayoutParams();
                i11 = view2.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin;
                view = linearLayout;
            } else {
                i11 = 0;
            }
            this.f4364U.setContentView(view);
        } else {
            View view3 = this.f4348E;
            if (view3 != null) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) view3.getLayoutParams();
                i11 = view3.getMeasuredHeight() + layoutParams3.topMargin + layoutParams3.bottomMargin;
            } else {
                i11 = 0;
            }
        }
        Drawable background = this.f4364U.getBackground();
        if (background != null) {
            background.getPadding(this.f4361R);
            Rect rect = this.f4361R;
            int i16 = rect.top;
            i12 = rect.bottom + i16;
            if (!this.f4373x) {
                this.f4371v = -i16;
            }
        } else {
            this.f4361R.setEmpty();
            i12 = 0;
        }
        if (this.f4364U.getInputMethodMode() != 2) {
            z11 = false;
        }
        int m5292u = m5292u(m5316t(), this.f4371v, z11);
        if (!this.f4345B && this.f4368s != -1) {
            int i17 = this.f4369t;
            if (i17 != -2) {
                if (i17 != -1) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i17, 1073741824);
                } else {
                    int i18 = this.f4365p.getResources().getDisplayMetrics().widthPixels;
                    Rect rect2 = this.f4361R;
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i18 - (rect2.left + rect2.right), 1073741824);
                }
            } else {
                int i19 = this.f4365p.getResources().getDisplayMetrics().widthPixels;
                Rect rect3 = this.f4361R;
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i19 - (rect3.left + rect3.right), Integer.MIN_VALUE);
            }
            int mo5326d = this.f4367r.mo5326d(makeMeasureSpec, 0, -1, m5292u - i11, -1);
            if (mo5326d > 0) {
                i11 += i12 + this.f4367r.getPaddingTop() + this.f4367r.getPaddingBottom();
            }
            return mo5326d + i11;
        }
        return m5292u + i12;
    }

    /* renamed from: u */
    private int m5292u(View view, int i11, boolean z11) {
        int maxAvailableHeight;
        if (Build.VERSION.SDK_INT > 23) {
            maxAvailableHeight = this.f4364U.getMaxAvailableHeight(view, i11, z11);
            return maxAvailableHeight;
        }
        Method method = f4342W;
        if (method != null) {
            try {
                return ((Integer) method.invoke(this.f4364U, view, Integer.valueOf(i11), Boolean.valueOf(z11))).intValue();
            } catch (Exception unused) {
            }
        }
        return this.f4364U.getMaxAvailableHeight(view, i11);
    }

    /* renamed from: A */
    public boolean m5293A() {
        if (this.f4364U.getInputMethodMode() == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: B */
    public boolean m5294B() {
        return this.f4363T;
    }

    /* renamed from: D */
    public void m5295D(View view) {
        this.f4351H = view;
    }

    /* renamed from: E */
    public void m5296E(int i11) {
        this.f4364U.setAnimationStyle(i11);
    }

    /* renamed from: F */
    public void m5297F(int i11) {
        Drawable background = this.f4364U.getBackground();
        if (background != null) {
            background.getPadding(this.f4361R);
            Rect rect = this.f4361R;
            this.f4369t = rect.left + rect.right + i11;
            return;
        }
        m5307Q(i11);
    }

    /* renamed from: G */
    public void m5298G(int i11) {
        this.f4344A = i11;
    }

    /* renamed from: H */
    public void m5299H(Rect rect) {
        Rect rect2;
        if (rect != null) {
            rect2 = new Rect(rect);
        } else {
            rect2 = null;
        }
        this.f4362S = rect2;
    }

    /* renamed from: I */
    public void m5300I(int i11) {
        this.f4364U.setInputMethodMode(i11);
    }

    /* renamed from: J */
    public void m5301J(boolean z11) {
        this.f4363T = z11;
        this.f4364U.setFocusable(z11);
    }

    /* renamed from: K */
    public void m5302K(PopupWindow.OnDismissListener onDismissListener) {
        this.f4364U.setOnDismissListener(onDismissListener);
    }

    /* renamed from: L */
    public void m5303L(AdapterView.OnItemClickListener onItemClickListener) {
        this.f4353J = onItemClickListener;
    }

    /* renamed from: M */
    public void m5304M(boolean z11) {
        this.f4375z = true;
        this.f4374y = z11;
    }

    /* renamed from: O */
    public void m5305O(int i11) {
        this.f4349F = i11;
    }

    /* renamed from: P */
    public void m5306P(int i11) {
        C1228z0 c1228z0 = this.f4367r;
        if (mo5012b() && c1228z0 != null) {
            c1228z0.setListSelectionHidden(false);
            c1228z0.setSelection(i11);
            if (c1228z0.getChoiceMode() != 0) {
                c1228z0.setItemChecked(i11, true);
            }
        }
    }

    /* renamed from: Q */
    public void m5307Q(int i11) {
        this.f4369t = i11;
    }

    @Override // p336m0.InterfaceC22701e
    /* renamed from: a */
    public void mo5011a() {
        boolean z11;
        int i11;
        int i12;
        int i13;
        int i14;
        int m5291q = m5291q();
        boolean m5293A = m5293A();
        AbstractC1638j.m8402b(this.f4364U, this.f4372w);
        boolean z12 = true;
        if (this.f4364U.isShowing()) {
            if (!AbstractC1579n0.m7862d0(m5316t())) {
                return;
            }
            int i15 = this.f4369t;
            if (i15 == -1) {
                i15 = -1;
            } else if (i15 == -2) {
                i15 = m5316t().getWidth();
            }
            int i16 = this.f4368s;
            if (i16 == -1) {
                if (!m5293A) {
                    m5291q = -1;
                }
                if (m5293A) {
                    PopupWindow popupWindow = this.f4364U;
                    if (this.f4369t == -1) {
                        i14 = -1;
                    } else {
                        i14 = 0;
                    }
                    popupWindow.setWidth(i14);
                    this.f4364U.setHeight(0);
                } else {
                    PopupWindow popupWindow2 = this.f4364U;
                    if (this.f4369t == -1) {
                        i13 = -1;
                    } else {
                        i13 = 0;
                    }
                    popupWindow2.setWidth(i13);
                    this.f4364U.setHeight(-1);
                }
            } else if (i16 != -2) {
                m5291q = i16;
            }
            PopupWindow popupWindow3 = this.f4364U;
            if (this.f4346C || this.f4345B) {
                z12 = false;
            }
            popupWindow3.setOutsideTouchable(z12);
            PopupWindow popupWindow4 = this.f4364U;
            View m5316t = m5316t();
            int i17 = this.f4370u;
            int i18 = this.f4371v;
            if (i15 < 0) {
                i11 = -1;
            } else {
                i11 = i15;
            }
            if (m5291q < 0) {
                i12 = -1;
            } else {
                i12 = m5291q;
            }
            popupWindow4.update(m5316t, i17, i18, i11, i12);
            return;
        }
        int i19 = this.f4369t;
        if (i19 == -1) {
            i19 = -1;
        } else if (i19 == -2) {
            i19 = m5316t().getWidth();
        }
        int i21 = this.f4368s;
        if (i21 == -1) {
            m5291q = -1;
        } else if (i21 != -2) {
            m5291q = i21;
        }
        this.f4364U.setWidth(i19);
        this.f4364U.setHeight(m5291q);
        m5290N(true);
        PopupWindow popupWindow5 = this.f4364U;
        if (!this.f4346C && !this.f4345B) {
            z11 = true;
        } else {
            z11 = false;
        }
        popupWindow5.setOutsideTouchable(z11);
        this.f4364U.setTouchInterceptor(this.f4356M);
        if (this.f4375z) {
            AbstractC1638j.m8401a(this.f4364U, this.f4374y);
        }
        if (Build.VERSION.SDK_INT > 28) {
            this.f4364U.setEpicenterBounds(this.f4362S);
        } else {
            Method method = f4343X;
            if (method != null) {
                try {
                    method.invoke(this.f4364U, this.f4362S);
                } catch (Exception unused) {
                }
            }
        }
        AbstractC1638j.m8403c(this.f4364U, m5316t(), this.f4370u, this.f4371v, this.f4344A);
        this.f4367r.setSelection(-1);
        if (!this.f4363T || this.f4367r.isInTouchMode()) {
            m5314r();
        }
        if (!this.f4363T) {
            this.f4360Q.post(this.f4358O);
        }
    }

    @Override // p336m0.InterfaceC22701e
    /* renamed from: b */
    public boolean mo5012b() {
        return this.f4364U.isShowing();
    }

    /* renamed from: c */
    public void m5308c(Drawable drawable) {
        this.f4364U.setBackgroundDrawable(drawable);
    }

    /* renamed from: d */
    public int m5309d() {
        return this.f4370u;
    }

    @Override // p336m0.InterfaceC22701e
    public void dismiss() {
        this.f4364U.dismiss();
        m5289C();
        this.f4364U.setContentView(null);
        this.f4367r = null;
        this.f4360Q.removeCallbacks(this.f4355L);
    }

    /* renamed from: f */
    public void m5310f(int i11) {
        this.f4370u = i11;
    }

    /* renamed from: h */
    public Drawable m5311h() {
        return this.f4364U.getBackground();
    }

    /* renamed from: j */
    public void m5312j(int i11) {
        this.f4371v = i11;
        this.f4373x = true;
    }

    /* renamed from: m */
    public int m5313m() {
        if (this.f4373x) {
            return this.f4371v;
        }
        return 0;
    }

    /* renamed from: n */
    public void mo5262n(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f4350G;
        if (dataSetObserver == null) {
            this.f4350G = new C1115d();
        } else {
            ListAdapter listAdapter2 = this.f4366q;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f4366q = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f4350G);
        }
        C1228z0 c1228z0 = this.f4367r;
        if (c1228z0 != null) {
            c1228z0.setAdapter(this.f4366q);
        }
    }

    @Override // p336m0.InterfaceC22701e
    /* renamed from: p */
    public ListView mo5018p() {
        return this.f4367r;
    }

    /* renamed from: r */
    public void m5314r() {
        C1228z0 c1228z0 = this.f4367r;
        if (c1228z0 != null) {
            c1228z0.setListSelectionHidden(true);
            c1228z0.requestLayout();
        }
    }

    /* renamed from: s */
    C1228z0 mo5315s(Context context, boolean z11) {
        return new C1228z0(context, z11);
    }

    /* renamed from: t */
    public View m5316t() {
        return this.f4351H;
    }

    /* renamed from: v */
    public Object m5317v() {
        if (!mo5012b()) {
            return null;
        }
        return this.f4367r.getSelectedItem();
    }

    /* renamed from: w */
    public long m5318w() {
        if (!mo5012b()) {
            return Long.MIN_VALUE;
        }
        return this.f4367r.getSelectedItemId();
    }

    /* renamed from: x */
    public int m5319x() {
        if (!mo5012b()) {
            return -1;
        }
        return this.f4367r.getSelectedItemPosition();
    }

    /* renamed from: y */
    public View m5320y() {
        if (!mo5012b()) {
            return null;
        }
        return this.f4367r.getSelectedView();
    }

    /* renamed from: z */
    public int m5321z() {
        return this.f4369t;
    }

    public ListPopupWindow(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC19178a.listPopupWindowStyle);
    }

    public ListPopupWindow(Context context, AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0);
    }

    public ListPopupWindow(Context context, AttributeSet attributeSet, int i11, int i12) {
        this.f4368s = -2;
        this.f4369t = -2;
        this.f4372w = ZAbstractBase.ZVU_BLEND_PERCENTAGE;
        this.f4344A = 0;
        this.f4345B = false;
        this.f4346C = false;
        this.f4347D = Integer.MAX_VALUE;
        this.f4349F = 0;
        this.f4355L = new RunnableC1118g();
        this.f4356M = new ViewOnTouchListenerC1117f();
        this.f4357N = new C1116e();
        this.f4358O = new RunnableC1114c();
        this.f4361R = new Rect();
        this.f4365p = context;
        this.f4360Q = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC19187j.ListPopupWindow, i11, i12);
        this.f4370u = obtainStyledAttributes.getDimensionPixelOffset(AbstractC19187j.ListPopupWindow_android_dropDownHorizontalOffset, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(AbstractC19187j.ListPopupWindow_android_dropDownVerticalOffset, 0);
        this.f4371v = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f4373x = true;
        }
        obtainStyledAttributes.recycle();
        AppCompatPopupWindow appCompatPopupWindow = new AppCompatPopupWindow(context, attributeSet, i11, i12);
        this.f4364U = appCompatPopupWindow;
        appCompatPopupWindow.setInputMethodMode(1);
    }
}
