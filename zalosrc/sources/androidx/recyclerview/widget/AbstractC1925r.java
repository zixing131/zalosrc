package androidx.recyclerview.widget;

import androidx.recyclerview.widget.AbstractC1915h;
import androidx.recyclerview.widget.C1909c;
import androidx.recyclerview.widget.C1911d;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* renamed from: androidx.recyclerview.widget.r */
/* loaded from: classes2.dex */
public abstract class AbstractC1925r extends RecyclerView.AbstractC1880g {

    /* renamed from: r */
    final C1911d f8209r;

    /* renamed from: s */
    private final C1911d.b f8210s;

    /* renamed from: androidx.recyclerview.widget.r$a */
    /* loaded from: classes2.dex */
    class a implements C1911d.b {
        a() {
        }

        @Override // androidx.recyclerview.widget.C1911d.b
        /* renamed from: a */
        public void mo10448a(List list, List list2) {
            AbstractC1925r.this.m10634N(list, list2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC1925r(AbstractC1915h.d dVar) {
        a aVar = new a();
        this.f8210s = aVar;
        C1911d c1911d = new C1911d(new C1907b(this), new C1909c.a(dVar).m10420a());
        this.f8209r = c1911d;
        c1911d.m10443a(aVar);
    }

    /* renamed from: L */
    public List m10632L() {
        return this.f8209r.m10444b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: M */
    public Object m10633M(int i11) {
        return this.f8209r.m10444b().get(i11);
    }

    /* renamed from: N */
    public void m10634N(List list, List list2) {
    }

    /* renamed from: O */
    public void m10635O(List list) {
        this.f8209r.m10446e(list);
    }

    /* renamed from: P */
    public void m10636P(List list, Runnable runnable) {
        this.f8209r.m10447f(list, runnable);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        return this.f8209r.m10444b().size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC1925r(C1909c c1909c) {
        a aVar = new a();
        this.f8210s = aVar;
        C1911d c1911d = new C1911d(new C1907b(this), c1909c);
        this.f8209r = c1911d;
        c1911d.m10443a(aVar);
    }
}
