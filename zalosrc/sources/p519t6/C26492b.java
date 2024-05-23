package p519t6;

import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: t6.b */
/* loaded from: classes3.dex */
public final class C26492b {

    /* renamed from: a */
    private final View f125725a;

    /* renamed from: b */
    private boolean f125726b = false;

    /* renamed from: c */
    private int f125727c = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public C26492b(InterfaceC26491a interfaceC26491a) {
        this.f125725a = (View) interfaceC26491a;
    }

    /* renamed from: a */
    private void m136458a() {
        ViewParent parent = this.f125725a.getParent();
        if (parent instanceof CoordinatorLayout) {
            ((CoordinatorLayout) parent).m6530m(this.f125725a);
        }
    }

    /* renamed from: b */
    public int m136459b() {
        return this.f125727c;
    }

    /* renamed from: c */
    public boolean m136460c() {
        return this.f125726b;
    }

    /* renamed from: d */
    public void m136461d(Bundle bundle) {
        this.f125726b = bundle.getBoolean("expanded", false);
        this.f125727c = bundle.getInt("expandedComponentIdHint", 0);
        if (this.f125726b) {
            m136458a();
        }
    }

    /* renamed from: e */
    public Bundle m136462e() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", this.f125726b);
        bundle.putInt("expandedComponentIdHint", this.f125727c);
        return bundle;
    }

    /* renamed from: f */
    public void m136463f(int i11) {
        this.f125727c = i11;
    }
}
