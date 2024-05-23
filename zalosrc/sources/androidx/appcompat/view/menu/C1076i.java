package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.InterfaceC1077j;
import androidx.core.view.AbstractC1579n0;
import androidx.core.view.AbstractC1602t;
import p175g0.AbstractC19181d;

/* renamed from: androidx.appcompat.view.menu.i */
/* loaded from: classes2.dex */
public class C1076i {

    /* renamed from: a */
    private final Context f4077a;

    /* renamed from: b */
    private final C1072e f4078b;

    /* renamed from: c */
    private final boolean f4079c;

    /* renamed from: d */
    private final int f4080d;

    /* renamed from: e */
    private final int f4081e;

    /* renamed from: f */
    private View f4082f;

    /* renamed from: g */
    private int f4083g;

    /* renamed from: h */
    private boolean f4084h;

    /* renamed from: i */
    private InterfaceC1077j.a f4085i;

    /* renamed from: j */
    private AbstractC1075h f4086j;

    /* renamed from: k */
    private PopupWindow.OnDismissListener f4087k;

    /* renamed from: l */
    private final PopupWindow.OnDismissListener f4088l;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.view.menu.i$a */
    /* loaded from: classes2.dex */
    public class a implements PopupWindow.OnDismissListener {
        a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            C1076i.this.mo5139e();
        }
    }

    public C1076i(Context context, C1072e c1072e, View view, boolean z11, int i11) {
        this(context, c1072e, view, z11, i11, 0);
    }

    /* renamed from: a */
    private AbstractC1075h m5134a() {
        AbstractC1075h viewOnKeyListenerC1079l;
        Display defaultDisplay = ((WindowManager) this.f4077a.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        if (Math.min(point.x, point.y) >= this.f4077a.getResources().getDimensionPixelSize(AbstractC19181d.abc_cascading_menus_min_smallest_width)) {
            viewOnKeyListenerC1079l = new ViewOnKeyListenerC1069b(this.f4077a, this.f4082f, this.f4080d, this.f4081e, this.f4079c);
        } else {
            viewOnKeyListenerC1079l = new ViewOnKeyListenerC1079l(this.f4077a, this.f4078b, this.f4082f, this.f4080d, this.f4081e, this.f4079c);
        }
        viewOnKeyListenerC1079l.mo5013d(this.f4078b);
        viewOnKeyListenerC1079l.mo5023x(this.f4088l);
        viewOnKeyListenerC1079l.mo5019s(this.f4082f);
        viewOnKeyListenerC1079l.mo4993h(this.f4085i);
        viewOnKeyListenerC1079l.mo5020u(this.f4084h);
        viewOnKeyListenerC1079l.mo5021v(this.f4083g);
        return viewOnKeyListenerC1079l;
    }

    /* renamed from: l */
    private void m5135l(int i11, int i12, boolean z11, boolean z12) {
        AbstractC1075h m5137c = m5137c();
        m5137c.mo5024y(z12);
        if (z11) {
            if ((AbstractC1602t.m8182b(this.f4083g, AbstractC1579n0.m7812G(this.f4082f)) & 7) == 5) {
                i11 -= this.f4082f.getWidth();
            }
            m5137c.mo5022w(i11);
            m5137c.mo5025z(i12);
            int i13 = (int) ((this.f4077a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            m5137c.m5133t(new Rect(i11 - i13, i12 - i13, i11 + i13, i12 + i13));
        }
        m5137c.mo5011a();
    }

    /* renamed from: b */
    public void m5136b() {
        if (m5138d()) {
            this.f4086j.dismiss();
        }
    }

    /* renamed from: c */
    public AbstractC1075h m5137c() {
        if (this.f4086j == null) {
            this.f4086j = m5134a();
        }
        return this.f4086j;
    }

    /* renamed from: d */
    public boolean m5138d() {
        AbstractC1075h abstractC1075h = this.f4086j;
        if (abstractC1075h != null && abstractC1075h.mo5012b()) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public void mo5139e() {
        this.f4086j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f4087k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    /* renamed from: f */
    public void m5140f(View view) {
        this.f4082f = view;
    }

    /* renamed from: g */
    public void m5141g(boolean z11) {
        this.f4084h = z11;
        AbstractC1075h abstractC1075h = this.f4086j;
        if (abstractC1075h != null) {
            abstractC1075h.mo5020u(z11);
        }
    }

    /* renamed from: h */
    public void m5142h(int i11) {
        this.f4083g = i11;
    }

    /* renamed from: i */
    public void m5143i(PopupWindow.OnDismissListener onDismissListener) {
        this.f4087k = onDismissListener;
    }

    /* renamed from: j */
    public void m5144j(InterfaceC1077j.a aVar) {
        this.f4085i = aVar;
        AbstractC1075h abstractC1075h = this.f4086j;
        if (abstractC1075h != null) {
            abstractC1075h.mo4993h(aVar);
        }
    }

    /* renamed from: k */
    public void m5145k() {
        if (m5146m()) {
        } else {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    /* renamed from: m */
    public boolean m5146m() {
        if (m5138d()) {
            return true;
        }
        if (this.f4082f == null) {
            return false;
        }
        m5135l(0, 0, false, false);
        return true;
    }

    /* renamed from: n */
    public boolean m5147n(int i11, int i12) {
        if (m5138d()) {
            return true;
        }
        if (this.f4082f == null) {
            return false;
        }
        m5135l(i11, i12, true, true);
        return true;
    }

    public C1076i(Context context, C1072e c1072e, View view, boolean z11, int i11, int i12) {
        this.f4083g = 8388611;
        this.f4088l = new a();
        this.f4077a = context;
        this.f4078b = c1072e;
        this.f4082f = view;
        this.f4079c = z11;
        this.f4080d = i11;
        this.f4081e = i12;
    }
}
