package com.zing.zalo.p077ui.chattag;

import com.zing.zalo.p077ui.chattag.C11840d;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p162fh.C18935d;
import p205hc.AbstractC19962a;
import p205hc.InterfaceC19966e;
import p205hc.InterfaceC19968g;
import p210hh.C20060c;
import v60.InterfaceC27934f;

/* renamed from: com.zing.zalo.ui.chattag.d */
/* loaded from: classes5.dex */
public final class C11840d extends AbstractC19962a implements InterfaceC19966e {

    /* renamed from: t */
    private final HashMap f61629t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11840d(InterfaceC27934f interfaceC27934f) {
        super(interfaceC27934f);
        AbstractC19074t.m100208f(interfaceC27934f, "mvpView");
        this.f61629t = new HashMap();
    }

    /* renamed from: Kp */
    private final List m65804Kp() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f61629t.values());
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Sp */
    public static final void m65805Sp(C11840d c11840d, InterfaceC27934f interfaceC27934f) {
        AbstractC19074t.m100208f(c11840d, "this$0");
        AbstractC19074t.m100208f(interfaceC27934f, "$this_apply");
        List m99229q = C18935d.Companion.m99234a().m99229q();
        c11840d.m65807Wp(m99229q);
        interfaceC27934f.mo65753VG(m99229q);
        interfaceC27934f.mo65754d8(c11840d.f61629t.size());
    }

    /* renamed from: Tp */
    private final void m65806Tp(List list) {
        this.f61629t.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C20060c c20060c = (C20060c) it.next();
            this.f61629t.put(Integer.valueOf(c20060c.m104215d()), c20060c);
        }
    }

    /* renamed from: Wp */
    private final void m65807Wp(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C20060c c20060c = (C20060c) it.next();
            if (this.f61629t.containsKey(Integer.valueOf(c20060c.m104215d()))) {
                arrayList.add(c20060c);
            }
        }
        m65806Tp(arrayList);
    }

    /* renamed from: Jp */
    public void m65808Jp() {
        this.f61629t.clear();
    }

    /* renamed from: Mp */
    public boolean m65809Mp(int i11) {
        return this.f61629t.containsKey(Integer.valueOf(i11));
    }

    /* renamed from: Np */
    public void m65810Np() {
        C18935d.b bVar = C18935d.Companion;
        bVar.m99234a().m99224h();
        bVar.m99234a().m99223f(m65804Kp());
        C11837a.Companion.m65784a().m65778i(this.f61629t.size());
    }

    /* renamed from: Op */
    public void m65811Op(C11839c c11839c, InterfaceC19968g interfaceC19968g) {
        super.mo995Nd(c11839c, interfaceC19968g);
        m65806Tp(C18935d.Companion.m99234a().m99230r());
    }

    /* renamed from: Pp */
    public int m65812Pp(C20060c c20060c, boolean z11) {
        AbstractC19074t.m100208f(c20060c, "item");
        if (z11) {
            this.f61629t.put(Integer.valueOf(c20060c.m104215d()), c20060c);
        } else {
            this.f61629t.remove(Integer.valueOf(c20060c.m104215d()));
        }
        return this.f61629t.size();
    }

    /* renamed from: Qp */
    public void m65813Qp() {
        ((InterfaceC27934f) m103742Dp()).mo65755sE();
    }

    /* renamed from: Rp */
    public void m65814Rp() {
        final InterfaceC27934f interfaceC27934f = (InterfaceC27934f) m103742Dp();
        interfaceC27934f.mo70710wy(new Runnable() { // from class: v60.g
            @Override // java.lang.Runnable
            public final void run() {
                C11840d.m65805Sp(C11840d.this, interfaceC27934f);
            }
        });
    }
}
