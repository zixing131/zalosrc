package j50;

import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k50.C21473a;

/* renamed from: j50.i */
/* loaded from: classes5.dex */
public final class C20929i implements InterfaceC20923c {

    /* renamed from: p */
    private final List f102801p = new ArrayList();

    @Override // j50.InterfaceC20923c
    /* renamed from: c */
    public List mo105983c() {
        if (this.f102801p.isEmpty()) {
            return null;
        }
        return this.f102801p;
    }

    @Override // j50.InterfaceC20923c
    /* renamed from: j */
    public void mo105990j(C21473a c21473a) {
        AbstractC19074t.m100208f(c21473a, "songCategory");
        Iterator it = this.f102801p.iterator();
        int i11 = 0;
        while (true) {
            if (it.hasNext()) {
                if (((C21473a) it.next()).m111074f() == c21473a.m111074f()) {
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
            this.f102801p.set(i11, c21473a);
        } else {
            this.f102801p.add(c21473a);
        }
    }
}
