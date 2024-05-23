package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.InterfaceC1077j;
import androidx.appcompat.widget.MenuPopupWindow;
import androidx.core.view.AbstractC1579n0;
import p175g0.AbstractC19181d;
import p175g0.AbstractC19184g;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.view.menu.l */
/* loaded from: classes2.dex */
public final class ViewOnKeyListenerC1079l extends AbstractC1075h implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, InterfaceC1077j, View.OnKeyListener {

    /* renamed from: K */
    private static final int f4090K = AbstractC19184g.abc_popup_menu_item_layout;

    /* renamed from: A */
    private PopupWindow.OnDismissListener f4091A;

    /* renamed from: B */
    private View f4092B;

    /* renamed from: C */
    View f4093C;

    /* renamed from: D */
    private InterfaceC1077j.a f4094D;

    /* renamed from: E */
    ViewTreeObserver f4095E;

    /* renamed from: F */
    private boolean f4096F;

    /* renamed from: G */
    private boolean f4097G;

    /* renamed from: H */
    private int f4098H;

    /* renamed from: J */
    private boolean f4100J;

    /* renamed from: q */
    private final Context f4101q;

    /* renamed from: r */
    private final C1072e f4102r;

    /* renamed from: s */
    private final C1071d f4103s;

    /* renamed from: t */
    private final boolean f4104t;

    /* renamed from: u */
    private final int f4105u;

    /* renamed from: v */
    private final int f4106v;

    /* renamed from: w */
    private final int f4107w;

    /* renamed from: x */
    final MenuPopupWindow f4108x;

    /* renamed from: y */
    final ViewTreeObserver.OnGlobalLayoutListener f4109y = new a();

    /* renamed from: z */
    private final View.OnAttachStateChangeListener f4110z = new b();

    /* renamed from: I */
    private int f4099I = 0;

    /* renamed from: androidx.appcompat.view.menu.l$a */
    /* loaded from: classes2.dex */
    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (ViewOnKeyListenerC1079l.this.mo5012b() && !ViewOnKeyListenerC1079l.this.f4108x.m5294B()) {
                View view = ViewOnKeyListenerC1079l.this.f4093C;
                if (view != null && view.isShown()) {
                    ViewOnKeyListenerC1079l.this.f4108x.mo5011a();
                } else {
                    ViewOnKeyListenerC1079l.this.dismiss();
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.l$b */
    /* loaded from: classes2.dex */
    class b implements View.OnAttachStateChangeListener {
        b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = ViewOnKeyListenerC1079l.this.f4095E;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    ViewOnKeyListenerC1079l.this.f4095E = view.getViewTreeObserver();
                }
                ViewOnKeyListenerC1079l viewOnKeyListenerC1079l = ViewOnKeyListenerC1079l.this;
                viewOnKeyListenerC1079l.f4095E.removeGlobalOnLayoutListener(viewOnKeyListenerC1079l.f4109y);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public ViewOnKeyListenerC1079l(Context context, C1072e c1072e, View view, int i11, int i12, boolean z11) {
        this.f4101q = context;
        this.f4102r = c1072e;
        this.f4104t = z11;
        this.f4103s = new C1071d(c1072e, LayoutInflater.from(context), z11, f4090K);
        this.f4106v = i11;
        this.f4107w = i12;
        Resources resources = context.getResources();
        this.f4105u = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(AbstractC19181d.abc_config_prefDialogWidth));
        this.f4092B = view;
        this.f4108x = new MenuPopupWindow(context, null, i11, i12);
        c1072e.m5076c(this, context);
    }

    /* renamed from: C */
    private boolean m5148C() {
        View view;
        boolean z11;
        if (mo5012b()) {
            return true;
        }
        if (this.f4096F || (view = this.f4092B) == null) {
            return false;
        }
        this.f4093C = view;
        this.f4108x.m5302K(this);
        this.f4108x.m5303L(this);
        this.f4108x.m5301J(true);
        View view2 = this.f4093C;
        if (this.f4095E == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f4095E = viewTreeObserver;
        if (z11) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f4109y);
        }
        view2.addOnAttachStateChangeListener(this.f4110z);
        this.f4108x.m5295D(view2);
        this.f4108x.m5298G(this.f4099I);
        if (!this.f4097G) {
            this.f4098H = AbstractC1075h.m5131r(this.f4103s, null, this.f4101q, this.f4105u);
            this.f4097G = true;
        }
        this.f4108x.m5297F(this.f4098H);
        this.f4108x.m5300I(2);
        this.f4108x.m5299H(m5132q());
        this.f4108x.mo5011a();
        ListView mo5018p = this.f4108x.mo5018p();
        mo5018p.setOnKeyListener(this);
        if (this.f4100J && this.f4102r.m5098z() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f4101q).inflate(AbstractC19184g.abc_popup_menu_header_item_layout, (ViewGroup) mo5018p, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            if (textView != null) {
                textView.setText(this.f4102r.m5098z());
            }
            frameLayout.setEnabled(false);
            mo5018p.addHeaderView(frameLayout, null, false);
        }
        this.f4108x.mo5262n(this.f4103s);
        this.f4108x.mo5011a();
        return true;
    }

    @Override // p336m0.InterfaceC22701e
    /* renamed from: a */
    public void mo5011a() {
        if (m5148C()) {
        } else {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // p336m0.InterfaceC22701e
    /* renamed from: b */
    public boolean mo5012b() {
        if (!this.f4096F && this.f4108x.mo5012b()) {
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1077j
    /* renamed from: c */
    public void mo4988c(C1072e c1072e, boolean z11) {
        if (c1072e != this.f4102r) {
            return;
        }
        dismiss();
        InterfaceC1077j.a aVar = this.f4094D;
        if (aVar != null) {
            aVar.mo4850c(c1072e, z11);
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC1075h
    /* renamed from: d */
    public void mo5013d(C1072e c1072e) {
    }

    @Override // p336m0.InterfaceC22701e
    public void dismiss() {
        if (mo5012b()) {
            this.f4108x.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1077j
    /* renamed from: h */
    public void mo4993h(InterfaceC1077j.a aVar) {
        this.f4094D = aVar;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1077j
    /* renamed from: i */
    public void mo5015i(Parcelable parcelable) {
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1077j
    /* renamed from: j */
    public boolean mo4994j(SubMenuC1080m subMenuC1080m) {
        if (subMenuC1080m.hasVisibleItems()) {
            C1076i c1076i = new C1076i(this.f4101q, subMenuC1080m, this.f4093C, this.f4104t, this.f4106v, this.f4107w);
            c1076i.m5144j(this.f4094D);
            c1076i.m5141g(AbstractC1075h.m5129A(subMenuC1080m));
            c1076i.m5143i(this.f4091A);
            this.f4091A = null;
            this.f4102r.m5080e(false);
            int m5309d = this.f4108x.m5309d();
            int m5313m = this.f4108x.m5313m();
            if ((Gravity.getAbsoluteGravity(this.f4099I, AbstractC1579n0.m7812G(this.f4092B)) & 7) == 5) {
                m5309d += this.f4092B.getWidth();
            }
            if (c1076i.m5147n(m5309d, m5313m)) {
                InterfaceC1077j.a aVar = this.f4094D;
                if (aVar != null) {
                    aVar.mo4851d(subMenuC1080m);
                    return true;
                }
                return true;
            }
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
        this.f4097G = false;
        C1071d c1071d = this.f4103s;
        if (c1071d != null) {
            c1071d.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1077j
    /* renamed from: m */
    public boolean mo5017m() {
        return false;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f4096F = true;
        this.f4102r.close();
        ViewTreeObserver viewTreeObserver = this.f4095E;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f4095E = this.f4093C.getViewTreeObserver();
            }
            this.f4095E.removeGlobalOnLayoutListener(this.f4109y);
            this.f4095E = null;
        }
        this.f4093C.removeOnAttachStateChangeListener(this.f4110z);
        PopupWindow.OnDismissListener onDismissListener = this.f4091A;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
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
        return this.f4108x.mo5018p();
    }

    @Override // androidx.appcompat.view.menu.AbstractC1075h
    /* renamed from: s */
    public void mo5019s(View view) {
        this.f4092B = view;
    }

    @Override // androidx.appcompat.view.menu.AbstractC1075h
    /* renamed from: u */
    public void mo5020u(boolean z11) {
        this.f4103s.m5038d(z11);
    }

    @Override // androidx.appcompat.view.menu.AbstractC1075h
    /* renamed from: v */
    public void mo5021v(int i11) {
        this.f4099I = i11;
    }

    @Override // androidx.appcompat.view.menu.AbstractC1075h
    /* renamed from: w */
    public void mo5022w(int i11) {
        this.f4108x.m5310f(i11);
    }

    @Override // androidx.appcompat.view.menu.AbstractC1075h
    /* renamed from: x */
    public void mo5023x(PopupWindow.OnDismissListener onDismissListener) {
        this.f4091A = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.AbstractC1075h
    /* renamed from: y */
    public void mo5024y(boolean z11) {
        this.f4100J = z11;
    }

    @Override // androidx.appcompat.view.menu.AbstractC1075h
    /* renamed from: z */
    public void mo5025z(int i11) {
        this.f4108x.m5312j(i11);
    }
}
