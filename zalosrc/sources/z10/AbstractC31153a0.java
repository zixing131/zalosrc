package z10;

import androidx.recyclerview.widget.RecyclerView;
import fn0.AbstractC19074t;

/* renamed from: z10.a0 */
/* loaded from: classes5.dex */
public abstract class AbstractC31153a0 extends RecyclerView.AbstractC1880g {

    /* renamed from: r */
    private int f143596r;

    /* renamed from: s */
    private int f143597s;

    /* renamed from: t */
    private boolean f143598t;

    public AbstractC31153a0(int i11) {
        this.f143596r = i11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: A */
    public void mo9990A(RecyclerView.AbstractC1876c0 abstractC1876c0, int i11) {
        AbstractC19074t.m100208f(abstractC1876c0, "holder");
        m151446O(i11);
    }

    /* renamed from: L */
    public boolean mo151443L() {
        if (mo10003k() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: M */
    public final boolean m151444M() {
        return this.f143598t;
    }

    /* renamed from: N */
    public final void m151445N() {
        this.f143598t = false;
    }

    /* renamed from: O */
    public final void m151446O(int i11) {
        if (this.f143597s != mo10003k()) {
            this.f143597s = mo10003k();
            this.f143598t = false;
        }
        int i12 = i11 + 1;
        if (this.f143597s == this.f143596r + i12 && !this.f143598t) {
            this.f143598t = true;
            mo151429P();
        }
        if (this.f143597s == i12 && !this.f143598t) {
            this.f143598t = true;
            mo151429P();
        }
    }

    /* renamed from: P */
    public abstract void mo151429P();

    /* renamed from: Q */
    public final void m151447Q(int i11) {
        this.f143596r = i11;
    }
}
