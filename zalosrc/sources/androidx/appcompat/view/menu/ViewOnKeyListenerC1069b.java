package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.InterfaceC1077j;
import androidx.appcompat.widget.InterfaceC1169f1;
import androidx.appcompat.widget.MenuPopupWindow;
import androidx.core.view.AbstractC1579n0;
import androidx.core.view.AbstractC1602t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p175g0.AbstractC19181d;
import p175g0.AbstractC19184g;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.view.menu.b */
/* loaded from: classes2.dex */
public final class ViewOnKeyListenerC1069b extends AbstractC1075h implements InterfaceC1077j, View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: Q */
    private static final int f3958Q = AbstractC19184g.abc_cascading_menu_item_layout;

    /* renamed from: D */
    private View f3962D;

    /* renamed from: E */
    View f3963E;

    /* renamed from: G */
    private boolean f3965G;

    /* renamed from: H */
    private boolean f3966H;

    /* renamed from: I */
    private int f3967I;

    /* renamed from: J */
    private int f3968J;

    /* renamed from: L */
    private boolean f3970L;

    /* renamed from: M */
    private InterfaceC1077j.a f3971M;

    /* renamed from: N */
    ViewTreeObserver f3972N;

    /* renamed from: O */
    private PopupWindow.OnDismissListener f3973O;

    /* renamed from: P */
    boolean f3974P;

    /* renamed from: q */
    private final Context f3975q;

    /* renamed from: r */
    private final int f3976r;

    /* renamed from: s */
    private final int f3977s;

    /* renamed from: t */
    private final int f3978t;

    /* renamed from: u */
    private final boolean f3979u;

    /* renamed from: v */
    final Handler f3980v;

    /* renamed from: w */
    private final List f3981w = new ArrayList();

    /* renamed from: x */
    final List f3982x = new ArrayList();

    /* renamed from: y */
    final ViewTreeObserver.OnGlobalLayoutListener f3983y = new a();

    /* renamed from: z */
    private final View.OnAttachStateChangeListener f3984z = new b();

    /* renamed from: A */
    private final InterfaceC1169f1 f3959A = new c();

    /* renamed from: B */
    private int f3960B = 0;

    /* renamed from: C */
    private int f3961C = 0;

    /* renamed from: K */
    private boolean f3969K = false;

    /* renamed from: F */
    private int f3964F = m5008G();

    /* renamed from: androidx.appcompat.view.menu.b$a */
    /* loaded from: classes2.dex */
    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (ViewOnKeyListenerC1069b.this.mo5012b() && ViewOnKeyListenerC1069b.this.f3982x.size() > 0 && !((d) ViewOnKeyListenerC1069b.this.f3982x.get(0)).f3992a.m5294B()) {
                View view = ViewOnKeyListenerC1069b.this.f3963E;
                if (view != null && view.isShown()) {
                    Iterator it = ViewOnKeyListenerC1069b.this.f3982x.iterator();
                    while (it.hasNext()) {
                        ((d) it.next()).f3992a.mo5011a();
                    }
                    return;
                }
                ViewOnKeyListenerC1069b.this.dismiss();
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.b$b */
    /* loaded from: classes2.dex */
    class b implements View.OnAttachStateChangeListener {
        b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = ViewOnKeyListenerC1069b.this.f3972N;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    ViewOnKeyListenerC1069b.this.f3972N = view.getViewTreeObserver();
                }
                ViewOnKeyListenerC1069b viewOnKeyListenerC1069b = ViewOnKeyListenerC1069b.this;
                viewOnKeyListenerC1069b.f3972N.removeGlobalOnLayoutListener(viewOnKeyListenerC1069b.f3983y);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* renamed from: androidx.appcompat.view.menu.b$c */
    /* loaded from: classes2.dex */
    class c implements InterfaceC1169f1 {

        /* renamed from: androidx.appcompat.view.menu.b$c$a */
        /* loaded from: classes2.dex */
        class a implements Runnable {

            /* renamed from: p */
            final /* synthetic */ d f3988p;

            /* renamed from: q */
            final /* synthetic */ MenuItem f3989q;

            /* renamed from: r */
            final /* synthetic */ C1072e f3990r;

            a(d dVar, MenuItem menuItem, C1072e c1072e) {
                this.f3988p = dVar;
                this.f3989q = menuItem;
                this.f3990r = c1072e;
            }

            @Override // java.lang.Runnable
            public void run() {
                d dVar = this.f3988p;
                if (dVar != null) {
                    ViewOnKeyListenerC1069b.this.f3974P = true;
                    dVar.f3993b.m5080e(false);
                    ViewOnKeyListenerC1069b.this.f3974P = false;
                }
                if (this.f3989q.isEnabled() && this.f3989q.hasSubMenu()) {
                    this.f3990r.m5061N(this.f3989q, 4);
                }
            }
        }

        c() {
        }

        @Override // androidx.appcompat.widget.InterfaceC1169f1
        /* renamed from: e */
        public void mo5026e(C1072e c1072e, MenuItem menuItem) {
            d dVar = null;
            ViewOnKeyListenerC1069b.this.f3980v.removeCallbacksAndMessages(null);
            int size = ViewOnKeyListenerC1069b.this.f3982x.size();
            int i11 = 0;
            while (true) {
                if (i11 < size) {
                    if (c1072e == ((d) ViewOnKeyListenerC1069b.this.f3982x.get(i11)).f3993b) {
                        break;
                    } else {
                        i11++;
                    }
                } else {
                    i11 = -1;
                    break;
                }
            }
            if (i11 == -1) {
                return;
            }
            int i12 = i11 + 1;
            if (i12 < ViewOnKeyListenerC1069b.this.f3982x.size()) {
                dVar = (d) ViewOnKeyListenerC1069b.this.f3982x.get(i12);
            }
            ViewOnKeyListenerC1069b.this.f3980v.postAtTime(new a(dVar, menuItem, c1072e), c1072e, SystemClock.uptimeMillis() + 200);
        }

        @Override // androidx.appcompat.widget.InterfaceC1169f1
        /* renamed from: o */
        public void mo5027o(C1072e c1072e, MenuItem menuItem) {
            ViewOnKeyListenerC1069b.this.f3980v.removeCallbacksAndMessages(c1072e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.view.menu.b$d */
    /* loaded from: classes2.dex */
    public static class d {

        /* renamed from: a */
        public final MenuPopupWindow f3992a;

        /* renamed from: b */
        public final C1072e f3993b;

        /* renamed from: c */
        public final int f3994c;

        public d(MenuPopupWindow menuPopupWindow, C1072e c1072e, int i11) {
            this.f3992a = menuPopupWindow;
            this.f3993b = c1072e;
            this.f3994c = i11;
        }

        /* renamed from: a */
        public ListView m5028a() {
            return this.f3992a.mo5018p();
        }
    }

    public ViewOnKeyListenerC1069b(Context context, View view, int i11, int i12, boolean z11) {
        this.f3975q = context;
        this.f3962D = view;
        this.f3977s = i11;
        this.f3978t = i12;
        this.f3979u = z11;
        Resources resources = context.getResources();
        this.f3976r = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(AbstractC19181d.abc_config_prefDialogWidth));
        this.f3980v = new Handler();
    }

    /* renamed from: C */
    private MenuPopupWindow m5004C() {
        MenuPopupWindow menuPopupWindow = new MenuPopupWindow(this.f3975q, null, this.f3977s, this.f3978t);
        menuPopupWindow.m5324T(this.f3959A);
        menuPopupWindow.m5303L(this);
        menuPopupWindow.m5302K(this);
        menuPopupWindow.m5295D(this.f3962D);
        menuPopupWindow.m5298G(this.f3961C);
        menuPopupWindow.m5301J(true);
        menuPopupWindow.m5300I(2);
        return menuPopupWindow;
    }

    /* renamed from: D */
    private int m5005D(C1072e c1072e) {
        int size = this.f3982x.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (c1072e == ((d) this.f3982x.get(i11)).f3993b) {
                return i11;
            }
        }
        return -1;
    }

    /* renamed from: E */
    private MenuItem m5006E(C1072e c1072e, C1072e c1072e2) {
        int size = c1072e.size();
        for (int i11 = 0; i11 < size; i11++) {
            MenuItem item = c1072e.getItem(i11);
            if (item.hasSubMenu() && c1072e2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    /* renamed from: F */
    private View m5007F(d dVar, C1072e c1072e) {
        C1071d c1071d;
        int i11;
        int firstVisiblePosition;
        MenuItem m5006E = m5006E(dVar.f3993b, c1072e);
        if (m5006E == null) {
            return null;
        }
        ListView m5028a = dVar.m5028a();
        ListAdapter adapter = m5028a.getAdapter();
        int i12 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            i11 = headerViewListAdapter.getHeadersCount();
            c1071d = (C1071d) headerViewListAdapter.getWrappedAdapter();
        } else {
            c1071d = (C1071d) adapter;
            i11 = 0;
        }
        int count = c1071d.getCount();
        while (true) {
            if (i12 < count) {
                if (m5006E == c1071d.getItem(i12)) {
                    break;
                }
                i12++;
            } else {
                i12 = -1;
                break;
            }
        }
        if (i12 == -1 || (firstVisiblePosition = (i12 + i11) - m5028a.getFirstVisiblePosition()) < 0 || firstVisiblePosition >= m5028a.getChildCount()) {
            return null;
        }
        return m5028a.getChildAt(firstVisiblePosition);
    }

    /* renamed from: G */
    private int m5008G() {
        if (AbstractC1579n0.m7812G(this.f3962D) != 1) {
            return 1;
        }
        return 0;
    }

    /* renamed from: H */
    private int m5009H(int i11) {
        List list = this.f3982x;
        ListView m5028a = ((d) list.get(list.size() - 1)).m5028a();
        int[] iArr = new int[2];
        m5028a.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f3963E.getWindowVisibleDisplayFrame(rect);
        if (this.f3964F == 1) {
            if (iArr[0] + m5028a.getWidth() + i11 <= rect.right) {
                return 1;
            }
            return 0;
        }
        if (iArr[0] - i11 < 0) {
            return 1;
        }
        return 0;
    }

    /* renamed from: I */
    private void m5010I(C1072e c1072e) {
        d dVar;
        View view;
        boolean z11;
        int i11;
        int i12;
        int i13;
        LayoutInflater from = LayoutInflater.from(this.f3975q);
        C1071d c1071d = new C1071d(c1072e, from, this.f3979u, f3958Q);
        if (!mo5012b() && this.f3969K) {
            c1071d.m5038d(true);
        } else if (mo5012b()) {
            c1071d.m5038d(AbstractC1075h.m5129A(c1072e));
        }
        int m5131r = AbstractC1075h.m5131r(c1071d, null, this.f3975q, this.f3976r);
        MenuPopupWindow m5004C = m5004C();
        m5004C.mo5262n(c1071d);
        m5004C.m5297F(m5131r);
        m5004C.m5298G(this.f3961C);
        if (this.f3982x.size() > 0) {
            List list = this.f3982x;
            dVar = (d) list.get(list.size() - 1);
            view = m5007F(dVar, c1072e);
        } else {
            dVar = null;
            view = null;
        }
        if (view != null) {
            m5004C.m5325U(false);
            m5004C.m5322R(null);
            int m5009H = m5009H(m5131r);
            if (m5009H == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f3964F = m5009H;
            if (Build.VERSION.SDK_INT >= 26) {
                m5004C.m5295D(view);
                i12 = 0;
                i11 = 0;
            } else {
                int[] iArr = new int[2];
                this.f3962D.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                if ((this.f3961C & 7) == 5) {
                    iArr[0] = iArr[0] + this.f3962D.getWidth();
                    iArr2[0] = iArr2[0] + view.getWidth();
                }
                i11 = iArr2[0] - iArr[0];
                i12 = iArr2[1] - iArr[1];
            }
            if ((this.f3961C & 5) == 5) {
                if (!z11) {
                    m5131r = view.getWidth();
                    i13 = i11 - m5131r;
                }
                i13 = i11 + m5131r;
            } else {
                if (z11) {
                    m5131r = view.getWidth();
                    i13 = i11 + m5131r;
                }
                i13 = i11 - m5131r;
            }
            m5004C.m5310f(i13);
            m5004C.m5304M(true);
            m5004C.m5312j(i12);
        } else {
            if (this.f3965G) {
                m5004C.m5310f(this.f3967I);
            }
            if (this.f3966H) {
                m5004C.m5312j(this.f3968J);
            }
            m5004C.m5299H(m5132q());
        }
        this.f3982x.add(new d(m5004C, c1072e, this.f3964F));
        m5004C.mo5011a();
        ListView mo5018p = m5004C.mo5018p();
        mo5018p.setOnKeyListener(this);
        if (dVar == null && this.f3970L && c1072e.m5098z() != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(AbstractC19184g.abc_popup_menu_header_item_layout, (ViewGroup) mo5018p, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(c1072e.m5098z());
            mo5018p.addHeaderView(frameLayout, null, false);
            m5004C.mo5011a();
        }
    }

    @Override // p336m0.InterfaceC22701e
    /* renamed from: a */
    public void mo5011a() {
        boolean z11;
        if (mo5012b()) {
            return;
        }
        Iterator it = this.f3981w.iterator();
        while (it.hasNext()) {
            m5010I((C1072e) it.next());
        }
        this.f3981w.clear();
        View view = this.f3962D;
        this.f3963E = view;
        if (view != null) {
            if (this.f3972N == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f3972N = viewTreeObserver;
            if (z11) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f3983y);
            }
            this.f3963E.addOnAttachStateChangeListener(this.f3984z);
        }
    }

    @Override // p336m0.InterfaceC22701e
    /* renamed from: b */
    public boolean mo5012b() {
        if (this.f3982x.size() <= 0 || !((d) this.f3982x.get(0)).f3992a.mo5012b()) {
            return false;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1077j
    /* renamed from: c */
    public void mo4988c(C1072e c1072e, boolean z11) {
        int m5005D = m5005D(c1072e);
        if (m5005D < 0) {
            return;
        }
        int i11 = m5005D + 1;
        if (i11 < this.f3982x.size()) {
            ((d) this.f3982x.get(i11)).f3993b.m5080e(false);
        }
        d dVar = (d) this.f3982x.remove(m5005D);
        dVar.f3993b.m5063Q(this);
        if (this.f3974P) {
            dVar.f3992a.m5323S(null);
            dVar.f3992a.m5296E(0);
        }
        dVar.f3992a.dismiss();
        int size = this.f3982x.size();
        if (size > 0) {
            this.f3964F = ((d) this.f3982x.get(size - 1)).f3994c;
        } else {
            this.f3964F = m5008G();
        }
        if (size == 0) {
            dismiss();
            InterfaceC1077j.a aVar = this.f3971M;
            if (aVar != null) {
                aVar.mo4850c(c1072e, true);
            }
            ViewTreeObserver viewTreeObserver = this.f3972N;
            if (viewTreeObserver != null) {
                if (viewTreeObserver.isAlive()) {
                    this.f3972N.removeGlobalOnLayoutListener(this.f3983y);
                }
                this.f3972N = null;
            }
            this.f3963E.removeOnAttachStateChangeListener(this.f3984z);
            this.f3973O.onDismiss();
            return;
        }
        if (z11) {
            ((d) this.f3982x.get(0)).f3993b.m5080e(false);
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC1075h
    /* renamed from: d */
    public void mo5013d(C1072e c1072e) {
        c1072e.m5076c(this, this.f3975q);
        if (mo5012b()) {
            m5010I(c1072e);
        } else {
            this.f3981w.add(c1072e);
        }
    }

    @Override // p336m0.InterfaceC22701e
    public void dismiss() {
        int size = this.f3982x.size();
        if (size > 0) {
            d[] dVarArr = (d[]) this.f3982x.toArray(new d[size]);
            for (int i11 = size - 1; i11 >= 0; i11--) {
                d dVar = dVarArr[i11];
                if (dVar.f3992a.mo5012b()) {
                    dVar.f3992a.dismiss();
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC1075h
    /* renamed from: e */
    protected boolean mo5014e() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1077j
    /* renamed from: h */
    public void mo4993h(InterfaceC1077j.a aVar) {
        this.f3971M = aVar;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1077j
    /* renamed from: i */
    public void mo5015i(Parcelable parcelable) {
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1077j
    /* renamed from: j */
    public boolean mo4994j(SubMenuC1080m subMenuC1080m) {
        for (d dVar : this.f3982x) {
            if (subMenuC1080m == dVar.f3993b) {
                dVar.m5028a().requestFocus();
                return true;
            }
        }
        if (subMenuC1080m.hasVisibleItems()) {
            mo5013d(subMenuC1080m);
            InterfaceC1077j.a aVar = this.f3971M;
            if (aVar != null) {
                aVar.mo4851d(subMenuC1080m);
            }
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1077j
    /* renamed from: k */
    public Parcelable mo5016k() {
        return null;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1077j
    /* renamed from: l */
    public void mo4995l(boolean z11) {
        Iterator it = this.f3982x.iterator();
        while (it.hasNext()) {
            AbstractC1075h.m5130B(((d) it.next()).m5028a().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1077j
    /* renamed from: m */
    public boolean mo5017m() {
        return false;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        d dVar;
        int size = this.f3982x.size();
        int i11 = 0;
        while (true) {
            if (i11 < size) {
                dVar = (d) this.f3982x.get(i11);
                if (!dVar.f3992a.mo5012b()) {
                    break;
                } else {
                    i11++;
                }
            } else {
                dVar = null;
                break;
            }
        }
        if (dVar != null) {
            dVar.f3993b.m5080e(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i11, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && i11 == 82) {
            dismiss();
            return true;
        }
        return false;
    }

    @Override // p336m0.InterfaceC22701e
    /* renamed from: p */
    public ListView mo5018p() {
        if (this.f3982x.isEmpty()) {
            return null;
        }
        return ((d) this.f3982x.get(r0.size() - 1)).m5028a();
    }

    @Override // androidx.appcompat.view.menu.AbstractC1075h
    /* renamed from: s */
    public void mo5019s(View view) {
        if (this.f3962D != view) {
            this.f3962D = view;
            this.f3961C = AbstractC1602t.m8182b(this.f3960B, AbstractC1579n0.m7812G(view));
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC1075h
    /* renamed from: u */
    public void mo5020u(boolean z11) {
        this.f3969K = z11;
    }

    @Override // androidx.appcompat.view.menu.AbstractC1075h
    /* renamed from: v */
    public void mo5021v(int i11) {
        if (this.f3960B != i11) {
            this.f3960B = i11;
            this.f3961C = AbstractC1602t.m8182b(i11, AbstractC1579n0.m7812G(this.f3962D));
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC1075h
    /* renamed from: w */
    public void mo5022w(int i11) {
        this.f3965G = true;
        this.f3967I = i11;
    }

    @Override // androidx.appcompat.view.menu.AbstractC1075h
    /* renamed from: x */
    public void mo5023x(PopupWindow.OnDismissListener onDismissListener) {
        this.f3973O = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.AbstractC1075h
    /* renamed from: y */
    public void mo5024y(boolean z11) {
        this.f3970L = z11;
    }

    @Override // androidx.appcompat.view.menu.AbstractC1075h
    /* renamed from: z */
    public void mo5025z(int i11) {
        this.f3966H = true;
        this.f3968J = i11;
    }
}
