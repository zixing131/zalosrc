package p045c1;

import java.util.ArrayList;
import p700z0.C31132c;

/* renamed from: c1.n */
/* loaded from: classes2.dex */
public abstract class AbstractC3195n extends C3186e {

    /* renamed from: U0 */
    public ArrayList f13678U0 = new ArrayList();

    /* renamed from: a */
    public void m16263a(C3186e c3186e) {
        this.f13678U0.add(c3186e);
        if (c3186e.m16048M() != null) {
            ((AbstractC3195n) c3186e.m16048M()).m16265w1(c3186e);
        }
        c3186e.m16087f1(this);
    }

    /* renamed from: u1 */
    public ArrayList m16264u1() {
        return this.f13678U0;
    }

    @Override // p045c1.C3186e
    /* renamed from: v0 */
    public void mo16126v0() {
        this.f13678U0.clear();
        super.mo16126v0();
    }

    /* renamed from: v1 */
    public abstract void mo16165v1();

    /* renamed from: w1 */
    public void m16265w1(C3186e c3186e) {
        this.f13678U0.remove(c3186e);
        c3186e.mo16126v0();
    }

    /* renamed from: x1 */
    public void m16266x1() {
        this.f13678U0.clear();
    }

    @Override // p045c1.C3186e
    /* renamed from: z0 */
    public void mo16134z0(C31132c c31132c) {
        super.mo16134z0(c31132c);
        int size = this.f13678U0.size();
        for (int i11 = 0; i11 < size; i11++) {
            ((C3186e) this.f13678U0.get(i11)).mo16134z0(c31132c);
        }
    }
}
