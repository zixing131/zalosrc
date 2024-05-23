package com.zing.zalo.uicontrol;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ExpandableListView;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TableRow;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.p058v4.widget.SwipeRefreshLayout;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.AbstractC8915g0;
import com.zing.zalo.AbstractC8923h0;
import com.zing.zalo.p077ui.widget.C13718q1;
import com.zing.zalo.uicontrol.SwipeRefreshListView;
import me0.AbstractC23136l9;
import me0.AbstractC23202r9;
import p348mi.AbstractC23309i;
import s00.AbstractC26080o;

/* loaded from: classes4.dex */
public class SwipeRefreshListView extends SwipeRefreshLayout {

    /* renamed from: A0 */
    boolean f83573A0;

    /* renamed from: B0 */
    boolean f83574B0;

    /* renamed from: C0 */
    SwipeRefreshLayout.InterfaceC6891i f83575C0;

    /* renamed from: D0 */
    View.OnClickListener f83576D0;

    /* renamed from: E0 */
    View.OnClickListener f83577E0;

    /* renamed from: l0 */
    View f83578l0;

    /* renamed from: m0 */
    public ListView f83579m0;

    /* renamed from: n0 */
    public ExpandableListView f83580n0;

    /* renamed from: o0 */
    public GridView f83581o0;

    /* renamed from: p0 */
    public RecyclerView f83582p0;

    /* renamed from: q0 */
    Handler f83583q0;

    /* renamed from: r0 */
    boolean f83584r0;

    /* renamed from: s0 */
    View f83585s0;

    /* renamed from: t0 */
    long f83586t0;

    /* renamed from: u0 */
    int f83587u0;

    /* renamed from: v0 */
    ViewStub f83588v0;

    /* renamed from: w0 */
    ViewStub f83589w0;

    /* renamed from: x0 */
    ViewStub f83590x0;

    /* renamed from: y0 */
    LinearLayout f83591y0;

    /* renamed from: z0 */
    Snackbar f83592z0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.uicontrol.SwipeRefreshListView$a */
    /* loaded from: classes4.dex */
    public class C16548a extends AnimatorListenerAdapter {

        /* renamed from: p */
        final /* synthetic */ boolean f83593p;

        C16548a(boolean z11) {
            this.f83593p = z11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public /* synthetic */ void m88213c() {
            SwipeRefreshLayout.InterfaceC6891i interfaceC6891i = SwipeRefreshListView.this.f83575C0;
            if (interfaceC6891i != null) {
                interfaceC6891i.mo12137a();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m88214d() {
            SwipeRefreshListView.this.m88208U();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            SwipeRefreshListView.this.f83574B0 = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            SwipeRefreshListView swipeRefreshListView = SwipeRefreshListView.this;
            swipeRefreshListView.f83574B0 = false;
            swipeRefreshListView.f83578l0.setVisibility(8);
            SwipeRefreshListView swipeRefreshListView2 = SwipeRefreshListView.this;
            swipeRefreshListView2.f83584r0 = false;
            if (this.f83593p && swipeRefreshListView2.f83583q0 != null) {
                swipeRefreshListView2.setRefreshing(true);
                SwipeRefreshListView.this.f83583q0.postDelayed(new Runnable() { // from class: com.zing.zalo.uicontrol.o2
                    @Override // java.lang.Runnable
                    public final void run() {
                        SwipeRefreshListView.C16548a.this.m88213c();
                    }
                }, 2000L);
                SwipeRefreshListView.this.f83583q0.postDelayed(new Runnable() { // from class: com.zing.zalo.uicontrol.p2
                    @Override // java.lang.Runnable
                    public final void run() {
                        SwipeRefreshListView.C16548a.this.m88214d();
                    }
                }, 200L);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            SwipeRefreshListView.this.f83574B0 = true;
        }
    }

    public SwipeRefreshListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f83586t0 = 0L;
        this.f83587u0 = 0;
        this.f83573A0 = false;
        this.f83574B0 = false;
        this.f83576D0 = new View.OnClickListener() { // from class: com.zing.zalo.uicontrol.k2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SwipeRefreshListView.this.m88196S(view);
            }
        };
        this.f83577E0 = new View.OnClickListener() { // from class: com.zing.zalo.uicontrol.l2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SwipeRefreshListView.this.m88197T(view);
            }
        };
        m88204M(context, attributeSet);
        m88205N(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Q */
    public /* synthetic */ void m88194Q() {
        SwipeRefreshLayout.InterfaceC6891i interfaceC6891i = this.f83575C0;
        if (interfaceC6891i != null) {
            interfaceC6891i.mo12137a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: R */
    public static /* synthetic */ void m88195R(SwipeRefreshLayout.InterfaceC6891i interfaceC6891i) {
        if (interfaceC6891i != null) {
            interfaceC6891i.mo12137a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: S */
    public /* synthetic */ void m88196S(View view) {
        m88201J(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: T */
    public /* synthetic */ void m88197T(View view) {
        m88198G();
    }

    /* renamed from: G */
    public void m88198G() {
        m88199H(2000L);
    }

    /* renamed from: H */
    public void m88199H(long j11) {
        if (j11 <= 0) {
            j11 = 2000;
        }
        try {
            setRefreshing(true);
            Handler handler = this.f83583q0;
            if (handler != null) {
                handler.postDelayed(new Runnable() { // from class: com.zing.zalo.uicontrol.m2
                    @Override // java.lang.Runnable
                    public final void run() {
                        SwipeRefreshListView.this.m88194Q();
                    }
                }, j11);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: I */
    public void m88200I(final SwipeRefreshLayout.InterfaceC6891i interfaceC6891i) {
        try {
            setRefreshing(true);
            Handler handler = this.f83583q0;
            if (handler != null) {
                handler.postDelayed(new Runnable() { // from class: com.zing.zalo.uicontrol.n2
                    @Override // java.lang.Runnable
                    public final void run() {
                        SwipeRefreshListView.m88195R(SwipeRefreshLayout.InterfaceC6891i.this);
                    }
                }, 2000L);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: J */
    public void m88201J(boolean z11) {
        try {
            View view = this.f83578l0;
            if (view != null && view.getVisibility() == 0 && !this.f83574B0) {
                AbstractC23202r9.m119547o(this.f83578l0, r0.getHeight(), new C16548a(z11));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: K */
    public void m88202K() {
        try {
            Snackbar snackbar = this.f83592z0;
            if (snackbar != null) {
                snackbar.m88023f();
                this.f83586t0 = 0L;
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: L */
    void m88203L() {
        ViewStub viewStub;
        try {
            int i11 = this.f83587u0;
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3 && (viewStub = this.f83590x0) != null && this.f83582p0 == null) {
                        RecyclerView recyclerView = (RecyclerView) viewStub.inflate();
                        this.f83582p0 = recyclerView;
                        recyclerView.setVisibility(8);
                    }
                } else {
                    ViewStub viewStub2 = this.f83589w0;
                    if (viewStub2 != null && this.f83581o0 == null) {
                        GridView gridView = (GridView) viewStub2.inflate();
                        this.f83581o0 = gridView;
                        gridView.setVisibility(8);
                    }
                }
            } else {
                ViewStub viewStub3 = this.f83588v0;
                if (viewStub3 != null && this.f83580n0 == null) {
                    ExpandableListView expandableListView = (ExpandableListView) viewStub3.inflate();
                    this.f83580n0 = expandableListView;
                    expandableListView.setVisibility(8);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: M */
    void m88204M(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, AbstractC8923h0.SwipeRefreshListView, 0, 0);
        try {
            try {
                this.f83587u0 = obtainStyledAttributes.getInt(AbstractC8923h0.SwipeRefreshListView_modeContent, 0);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: N */
    void m88205N(Context context) {
        try {
            setColorSchemeResources(AbstractC16801x.cM1);
            this.f83583q0 = new Handler(Looper.getMainLooper());
            View inflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(AbstractC7409c0.layout_swipe_refresh_list_view, this);
            this.f83579m0 = (ListView) inflate.findViewById(AbstractC6918a0.listview);
            this.f83588v0 = (ViewStub) inflate.findViewById(AbstractC6918a0.expanablelist_stub);
            this.f83589w0 = (ViewStub) inflate.findViewById(AbstractC6918a0.gridview_stub);
            this.f83590x0 = (ViewStub) findViewById(AbstractC6918a0.recycleview_stub);
            this.f83591y0 = (LinearLayout) findViewById(AbstractC6918a0.sticky_header_container);
            m88203L();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: O */
    void m88206O() {
        Typeface m76694c;
        try {
            View view = this.f83585s0;
            if (view == null) {
                view = ((Activity) getContext()).getWindow().getDecorView().findViewById(R.id.content);
            }
            Snackbar m88030s = Snackbar.m88017q(view, getResources().getString(AbstractC8020f0.str_connection_error), 0).m88030s(getResources().getString(AbstractC8020f0.str_retry), this.f83577E0);
            this.f83592z0 = m88030s;
            View m88025i = m88030s.m88025i();
            m88025i.setBackgroundColor(AbstractC23136l9.m118641B(getContext(), AbstractC16801x.bg_connect_notif_error));
            TextView textView = (TextView) m88025i.findViewById(AbstractC6918a0.snackbar_text);
            textView.setTextColor(AbstractC23136l9.m118641B(getContext(), AbstractC16801x.cMtxt1));
            TextView textView2 = (TextView) m88025i.findViewById(AbstractC6918a0.snackbar_action);
            TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, AbstractC23136l9.m118742r(26.0f));
            layoutParams.gravity = 8388629;
            textView2.setLayoutParams(layoutParams);
            textView2.setGravity(17);
            textView2.setTextAppearance(getContext(), AbstractC8915g0.btnType1_small);
            textView2.setBackgroundResource(AbstractC16803z.bg_btn_type1_small);
            textView2.setPadding(0, 0, 0, 0);
            textView2.setMinWidth(AbstractC23136l9.m118742r(70.0f));
            textView2.setTextColor(AbstractC23136l9.m118645D(getContext(), AbstractC16801x.bg_btn_type1_text));
            this.f83592z0.m88033v(AbstractC26080o.a.f124275b);
            if (AbstractC23309i.m122089kb() == 0 && (m76694c = C13718q1.m76694c(getContext(), 5)) != null) {
                textView.setTypeface(m76694c);
                textView2.setTypeface(m76694c);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: P */
    public boolean m88207P() {
        Snackbar snackbar = this.f83592z0;
        if (snackbar != null && snackbar.m88027k()) {
            return true;
        }
        return false;
    }

    /* renamed from: U */
    void m88208U() {
        try {
            ViewGroup viewGroup = (ViewGroup) ((Activity) getContext()).getWindow().getDecorView().findViewById(R.id.content);
            View findViewWithTag = viewGroup.findViewWithTag("zalo_error_container");
            this.f83578l0 = findViewWithTag;
            if (findViewWithTag != null) {
                viewGroup.removeView(findViewWithTag);
                this.f83578l0 = null;
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: V */
    public void m88209V() {
        try {
            m88206O();
            this.f83592z0.m88019B();
            this.f83586t0 = System.currentTimeMillis();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: W */
    public void m88210W(int i11) {
        try {
            m88206O();
            this.f83592z0.m88033v(i11);
            this.f83592z0.m88019B();
            this.f83586t0 = System.currentTimeMillis();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.p058v4.widget.SwipeRefreshLayout
    /* renamed from: c */
    public boolean mo35356c() {
        boolean z11;
        ExpandableListView expandableListView = this.f83580n0;
        if (expandableListView != null && expandableListView.getVisibility() == 0) {
            if (this.f83580n0.getChildCount() > 0 && (this.f83580n0.getFirstVisiblePosition() > 0 || this.f83580n0.getChildAt(0).getTop() < this.f83580n0.getPaddingTop())) {
                return true;
            }
            return false;
        }
        GridView gridView = this.f83581o0;
        if (gridView != null && gridView.getVisibility() == 0) {
            if (this.f83581o0.getChildCount() > 0 && (this.f83581o0.getFirstVisiblePosition() > 0 || this.f83581o0.getChildAt(0).getTop() < this.f83581o0.getPaddingTop())) {
                return true;
            }
            return false;
        }
        RecyclerView recyclerView = this.f83582p0;
        if (recyclerView != null && recyclerView.getVisibility() == 0) {
            if ((this.f83582p0.getLayoutManager() instanceof LinearLayoutManager) && ((LinearLayoutManager) this.f83582p0.getLayoutManager()).m9740Y1() > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (this.f83582p0.getChildCount() > 0 && (z11 || this.f83582p0.getChildAt(0).getTop() < this.f83582p0.getPaddingTop())) {
                return true;
            }
            return false;
        }
        ListView listView = this.f83579m0;
        if (listView != null && listView.getChildCount() > 0 && (this.f83579m0.getFirstVisiblePosition() > 0 || this.f83579m0.getChildAt(0).getTop() < this.f83579m0.getPaddingTop())) {
            return true;
        }
        return false;
    }

    public ViewGroup getStickyHeaderView() {
        return this.f83591y0;
    }

    public void setContainerViewSnackBar(View view) {
        this.f83585s0 = view;
    }

    @Override // com.zing.p058v4.widget.SwipeRefreshLayout
    public void setOnRefreshListener(SwipeRefreshLayout.InterfaceC6891i interfaceC6891i) {
        this.f83575C0 = interfaceC6891i;
        super.setOnRefreshListener(interfaceC6891i);
    }
}
