package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.cardview.widget.a */
/* loaded from: classes2.dex */
public class C1240a implements InterfaceC1242c {
    /* renamed from: p */
    private C1243d m5869p(InterfaceC1241b interfaceC1241b) {
        return (C1243d) interfaceC1241b.mo5866d();
    }

    @Override // androidx.cardview.widget.InterfaceC1242c
    /* renamed from: a */
    public void mo5870a(InterfaceC1241b interfaceC1241b, float f11) {
        m5869p(interfaceC1241b).m5893h(f11);
    }

    @Override // androidx.cardview.widget.InterfaceC1242c
    /* renamed from: b */
    public float mo5871b(InterfaceC1241b interfaceC1241b) {
        return m5869p(interfaceC1241b).m5890d();
    }

    @Override // androidx.cardview.widget.InterfaceC1242c
    /* renamed from: c */
    public void mo5872c(InterfaceC1241b interfaceC1241b, float f11) {
        interfaceC1241b.mo5868f().setElevation(f11);
    }

    @Override // androidx.cardview.widget.InterfaceC1242c
    /* renamed from: d */
    public float mo5873d(InterfaceC1241b interfaceC1241b) {
        return m5869p(interfaceC1241b).m5889c();
    }

    @Override // androidx.cardview.widget.InterfaceC1242c
    /* renamed from: e */
    public ColorStateList mo5874e(InterfaceC1241b interfaceC1241b) {
        return m5869p(interfaceC1241b).m5888b();
    }

    @Override // androidx.cardview.widget.InterfaceC1242c
    /* renamed from: f */
    public float mo5875f(InterfaceC1241b interfaceC1241b) {
        return mo5871b(interfaceC1241b) * 2.0f;
    }

    @Override // androidx.cardview.widget.InterfaceC1242c
    /* renamed from: g */
    public void mo5876g(InterfaceC1241b interfaceC1241b) {
        mo5884o(interfaceC1241b, mo5873d(interfaceC1241b));
    }

    @Override // androidx.cardview.widget.InterfaceC1242c
    /* renamed from: h */
    public void mo5877h(InterfaceC1241b interfaceC1241b, Context context, ColorStateList colorStateList, float f11, float f12, float f13) {
        interfaceC1241b.mo5864b(new C1243d(colorStateList, f11));
        View mo5868f = interfaceC1241b.mo5868f();
        mo5868f.setClipToOutline(true);
        mo5868f.setElevation(f12);
        mo5884o(interfaceC1241b, f13);
    }

    @Override // androidx.cardview.widget.InterfaceC1242c
    /* renamed from: i */
    public float mo5878i(InterfaceC1241b interfaceC1241b) {
        return interfaceC1241b.mo5868f().getElevation();
    }

    @Override // androidx.cardview.widget.InterfaceC1242c
    /* renamed from: j */
    public void mo5879j(InterfaceC1241b interfaceC1241b) {
        mo5884o(interfaceC1241b, mo5873d(interfaceC1241b));
    }

    @Override // androidx.cardview.widget.InterfaceC1242c
    /* renamed from: k */
    public void mo5880k(InterfaceC1241b interfaceC1241b) {
        if (!interfaceC1241b.mo5865c()) {
            interfaceC1241b.mo5863a(0, 0, 0, 0);
            return;
        }
        float mo5873d = mo5873d(interfaceC1241b);
        float mo5871b = mo5871b(interfaceC1241b);
        int ceil = (int) Math.ceil(AbstractC1244e.m5894a(mo5873d, mo5871b, interfaceC1241b.mo5867e()));
        int ceil2 = (int) Math.ceil(AbstractC1244e.m5895b(mo5873d, mo5871b, interfaceC1241b.mo5867e()));
        interfaceC1241b.mo5863a(ceil, ceil2, ceil, ceil2);
    }

    @Override // androidx.cardview.widget.InterfaceC1242c
    /* renamed from: l */
    public void mo5881l() {
    }

    @Override // androidx.cardview.widget.InterfaceC1242c
    /* renamed from: m */
    public float mo5882m(InterfaceC1241b interfaceC1241b) {
        return mo5871b(interfaceC1241b) * 2.0f;
    }

    @Override // androidx.cardview.widget.InterfaceC1242c
    /* renamed from: n */
    public void mo5883n(InterfaceC1241b interfaceC1241b, ColorStateList colorStateList) {
        m5869p(interfaceC1241b).m5891f(colorStateList);
    }

    @Override // androidx.cardview.widget.InterfaceC1242c
    /* renamed from: o */
    public void mo5884o(InterfaceC1241b interfaceC1241b, float f11) {
        m5869p(interfaceC1241b).m5892g(f11, interfaceC1241b.mo5865c(), interfaceC1241b.mo5867e());
        mo5880k(interfaceC1241b);
    }
}
