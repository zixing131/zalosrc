package p399op;

import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p426pp.C24901d;

/* renamed from: op.l */
/* loaded from: classes4.dex */
public final class C24400l implements InterfaceC24393e {

    /* renamed from: p */
    private final List f117815p = new ArrayList();

    @Override // p399op.InterfaceC24393e
    /* renamed from: c */
    public List mo127595c() {
        if (this.f117815p.isEmpty()) {
            return null;
        }
        return this.f117815p;
    }

    @Override // p399op.InterfaceC24393e
    /* renamed from: m */
    public void mo127596m(C24901d c24901d) {
        AbstractC19074t.m100208f(c24901d, "songCategory");
        Iterator it = this.f117815p.iterator();
        int i11 = 0;
        while (true) {
            if (it.hasNext()) {
                if (((C24901d) it.next()).m129480f() == c24901d.m129480f()) {
                    break;
                } else {
                    i11++;
                }
            } else {
                i11 = -1;
                break;
            }
        }
        if (i11 > -1) {
            this.f117815p.set(i11, c24901d);
        } else {
            this.f117815p.add(c24901d);
        }
    }
}
