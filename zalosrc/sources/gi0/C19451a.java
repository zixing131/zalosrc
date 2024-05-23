package gi0;

import android.R;
import android.content.Context;
import android.view.Window;
import androidx.core.content.AbstractC1388a;
import bi0.AbstractC2808b;
import en0.InterfaceC18505l;
import fn0.AbstractC19074t;
import pm0.C24848g0;

/* renamed from: gi0.a */
/* loaded from: classes7.dex */
public class C19451a implements InterfaceC18505l {

    /* renamed from: p */
    private boolean f96564p;

    /* renamed from: q */
    private boolean f96565q;

    /* renamed from: d */
    private final int m101749d(Window window, int i11) {
        if (this.f96565q) {
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            return i11 | 8192;
        }
        return i11 & (-8193);
    }

    /* renamed from: a */
    public void m101750a(Window window) {
        Context context;
        int i11;
        AbstractC19074t.m100208f(window, "p1");
        if (this.f96564p) {
            context = window.getContext();
            i11 = R.color.transparent;
        } else {
            context = window.getContext();
            i11 = AbstractC2808b.statusBarColor;
        }
        window.setStatusBarColor(AbstractC1388a.m6961c(context, i11));
        window.getDecorView().setSystemUiVisibility(m101749d(window, window.getDecorView().getSystemUiVisibility()));
    }

    /* renamed from: b */
    public final void m101751b(boolean z11) {
        this.f96565q = z11;
    }

    /* renamed from: c */
    public final void m101752c(boolean z11) {
        this.f96564p = z11;
    }

    @Override // en0.InterfaceC18505l
    /* renamed from: i9 */
    public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
        m101750a((Window) obj);
        return C24848g0.f119245a;
    }
}
