package p558uu;

import android.view.View;
import androidx.core.view.C1580n1;
import androidx.core.view.InterfaceC1551g0;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p227i3.C20218v;

/* renamed from: uu.e */
/* loaded from: classes.dex */
public final class C27369e implements InterfaceC27368d, InterfaceC1551g0 {

    /* renamed from: a */
    private C1580n1 f128926a;

    /* renamed from: b */
    private final List f128927b = new ArrayList();

    @Override // p558uu.InterfaceC27368d
    /* renamed from: a */
    public void mo140210a(InterfaceC27370f interfaceC27370f) {
        AbstractC19074t.m100208f(interfaceC27370f, "watcher");
        if (!this.f128927b.contains(interfaceC27370f)) {
            this.f128927b.add(interfaceC27370f);
        }
    }

    @Override // p558uu.InterfaceC27368d
    /* renamed from: b */
    public C1580n1 mo140211b() {
        return this.f128926a;
    }

    @Override // androidx.core.view.InterfaceC1551g0
    /* renamed from: c */
    public C1580n1 mo4846c(View view, C1580n1 c1580n1) {
        AbstractC19074t.m100208f(view, C20218v.f100059b);
        AbstractC19074t.m100208f(c1580n1, "insets");
        m140213e(c1580n1);
        return c1580n1;
    }

    @Override // p558uu.InterfaceC27368d
    /* renamed from: d */
    public void mo140212d(InterfaceC27370f interfaceC27370f) {
        AbstractC19074t.m100208f(interfaceC27370f, "watcher");
        this.f128927b.remove(interfaceC27370f);
    }

    /* renamed from: e */
    public final void m140213e(C1580n1 c1580n1) {
        AbstractC19074t.m100208f(c1580n1, "windowInsets");
        m140214f(c1580n1);
        Iterator it = this.f128927b.iterator();
        while (it.hasNext()) {
            ((InterfaceC27370f) it.next()).mo89428d(c1580n1);
        }
    }

    /* renamed from: f */
    public void m140214f(C1580n1 c1580n1) {
        this.f128926a = c1580n1;
    }
}
