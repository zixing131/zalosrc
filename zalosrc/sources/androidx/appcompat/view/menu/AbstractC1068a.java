package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.InterfaceC1077j;
import androidx.appcompat.view.menu.InterfaceC1078k;
import java.util.ArrayList;

/* renamed from: androidx.appcompat.view.menu.a */
/* loaded from: classes2.dex */
public abstract class AbstractC1068a implements InterfaceC1077j {

    /* renamed from: p */
    protected Context f3948p;

    /* renamed from: q */
    protected Context f3949q;

    /* renamed from: r */
    protected C1072e f3950r;

    /* renamed from: s */
    protected LayoutInflater f3951s;

    /* renamed from: t */
    protected LayoutInflater f3952t;

    /* renamed from: u */
    private InterfaceC1077j.a f3953u;

    /* renamed from: v */
    private int f3954v;

    /* renamed from: w */
    private int f3955w;

    /* renamed from: x */
    protected InterfaceC1078k f3956x;

    /* renamed from: y */
    private int f3957y;

    public AbstractC1068a(Context context, int i11, int i12) {
        this.f3948p = context;
        this.f3951s = LayoutInflater.from(context);
        this.f3954v = i11;
        this.f3955w = i12;
    }

    /* renamed from: b */
    protected void m4987b(View view, int i11) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f3956x).addView(view, i11);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1077j
    /* renamed from: c */
    public void mo4988c(C1072e c1072e, boolean z11) {
        InterfaceC1077j.a aVar = this.f3953u;
        if (aVar != null) {
            aVar.mo4850c(c1072e, z11);
        }
    }

    /* renamed from: d */
    public abstract void mo4989d(C1074g c1074g, InterfaceC1078k.a aVar);

    /* renamed from: e */
    public InterfaceC1078k.a m4990e(ViewGroup viewGroup) {
        return (InterfaceC1078k.a) this.f3951s.inflate(this.f3955w, viewGroup, false);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1077j
    /* renamed from: f */
    public int mo4991f() {
        return this.f3957y;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1077j
    /* renamed from: g */
    public boolean mo4992g(C1072e c1072e, C1074g c1074g) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1077j
    /* renamed from: h */
    public void mo4993h(InterfaceC1077j.a aVar) {
        this.f3953u = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.appcompat.view.menu.e] */
    @Override // androidx.appcompat.view.menu.InterfaceC1077j
    /* renamed from: j */
    public boolean mo4994j(SubMenuC1080m subMenuC1080m) {
        InterfaceC1077j.a aVar = this.f3953u;
        SubMenuC1080m subMenuC1080m2 = subMenuC1080m;
        if (aVar != null) {
            if (subMenuC1080m == null) {
                subMenuC1080m2 = this.f3950r;
            }
            return aVar.mo4851d(subMenuC1080m2);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.InterfaceC1077j
    /* renamed from: l */
    public void mo4995l(boolean z11) {
        C1074g c1074g;
        ViewGroup viewGroup = (ViewGroup) this.f3956x;
        if (viewGroup == null) {
            return;
        }
        C1072e c1072e = this.f3950r;
        int i11 = 0;
        if (c1072e != null) {
            c1072e.m5092t();
            ArrayList m5054G = this.f3950r.m5054G();
            int size = m5054G.size();
            int i12 = 0;
            for (int i13 = 0; i13 < size; i13++) {
                C1074g c1074g2 = (C1074g) m5054G.get(i13);
                if (mo5003u(i12, c1074g2)) {
                    View childAt = viewGroup.getChildAt(i12);
                    if (childAt instanceof InterfaceC1078k.a) {
                        c1074g = ((InterfaceC1078k.a) childAt).getItemData();
                    } else {
                        c1074g = null;
                    }
                    View mo5000r = mo5000r(c1074g2, childAt, viewGroup);
                    if (c1074g2 != c1074g) {
                        mo5000r.setPressed(false);
                        mo5000r.jumpDrawablesToCurrentState();
                    }
                    if (mo5000r != childAt) {
                        m4987b(mo5000r, i12);
                    }
                    i12++;
                }
            }
            i11 = i12;
        }
        while (i11 < viewGroup.getChildCount()) {
            if (!mo4998p(viewGroup, i11)) {
                i11++;
            }
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1077j
    /* renamed from: n */
    public boolean mo4996n(C1072e c1072e, C1074g c1074g) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1077j
    /* renamed from: o */
    public void mo4997o(Context context, C1072e c1072e) {
        this.f3949q = context;
        this.f3952t = LayoutInflater.from(context);
        this.f3950r = c1072e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: p */
    public boolean mo4998p(ViewGroup viewGroup, int i11) {
        viewGroup.removeViewAt(i11);
        return true;
    }

    /* renamed from: q */
    public InterfaceC1077j.a m4999q() {
        return this.f3953u;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: r */
    public View mo5000r(C1074g c1074g, View view, ViewGroup viewGroup) {
        InterfaceC1078k.a aVar;
        if (view instanceof InterfaceC1078k.a) {
            aVar = (InterfaceC1078k.a) view;
        } else {
            aVar = m4990e(viewGroup);
        }
        mo4989d(c1074g, aVar);
        return (View) aVar;
    }

    /* renamed from: s */
    public InterfaceC1078k mo5001s(ViewGroup viewGroup) {
        if (this.f3956x == null) {
            InterfaceC1078k interfaceC1078k = (InterfaceC1078k) this.f3951s.inflate(this.f3954v, viewGroup, false);
            this.f3956x = interfaceC1078k;
            interfaceC1078k.mo4980h(this.f3950r);
            mo4995l(true);
        }
        return this.f3956x;
    }

    /* renamed from: t */
    public void m5002t(int i11) {
        this.f3957y = i11;
    }

    /* renamed from: u */
    public abstract boolean mo5003u(int i11, C1074g c1074g);
}
