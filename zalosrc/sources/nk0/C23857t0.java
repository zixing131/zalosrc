package nk0;

import com.zing.zalo.zinstant.component.p081ui.scrollview.InterfaceC17126d;
import com.zing.zalo.zinstant.zom.node.ZOM;
import com.zing.zalo.zinstant.zom.node.ZOMContainer;
import fn0.AbstractC19074t;
import java.lang.ref.WeakReference;
import qk0.AbstractC25310f;

/* renamed from: nk0.t0 */
/* loaded from: classes7.dex */
public final class C23857t0 extends AbstractC23838k1 {

    /* renamed from: k */
    private WeakReference f115201k;

    /* renamed from: l */
    private C23855s0 f115202l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23857t0(C23855s0 c23855s0, ZOMContainer zOMContainer) {
        super(c23855s0, zOMContainer);
        AbstractC19074t.m100208f(c23855s0, "zinstantRoot");
        AbstractC19074t.m100208f(zOMContainer, "zomContainer");
        this.f115201k = new WeakReference(null);
        ZOM[] zomArr = zOMContainer.mChildren;
        if (zomArr != null && zomArr.length == 1) {
            C23855s0 c23855s02 = new C23855s0(zomArr[0]);
            AbstractC25310f abstractC25310f = c23855s02.f115179c;
            if (abstractC25310f != null) {
                abstractC25310f.m131009L0(m130996B());
            }
            c23855s02.m124640e0(c23855s0);
            this.f115202l = c23855s02;
            return;
        }
        throw new IllegalArgumentException("ScrollView must have only one child");
    }

    /* renamed from: e1 */
    public final C23855s0 m124654e1() {
        return this.f115202l;
    }

    @Override // nk0.AbstractC23838k1
    /* renamed from: f1, reason: merged with bridge method [inline-methods] */
    public InterfaceC17126d mo124407X0() {
        return (InterfaceC17126d) this.f115201k.get();
    }

    /* renamed from: g1 */
    public final void m124656g1(InterfaceC17126d interfaceC17126d) {
        AbstractC19074t.m100208f(interfaceC17126d, "scrollViewImpl");
        this.f115201k = new WeakReference(interfaceC17126d);
    }

    @Override // nk0.AbstractC23838k1, qk0.AbstractC25310f
    /* renamed from: n0 */
    public void mo124436n0() {
        super.mo124436n0();
        AbstractC25310f abstractC25310f = this.f115202l.f115179c;
        if (abstractC25310f != null) {
            abstractC25310f.m131009L0(m130996B());
            abstractC25310f.m131013W();
        }
    }
}
