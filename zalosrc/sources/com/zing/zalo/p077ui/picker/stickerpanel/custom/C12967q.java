package com.zing.zalo.p077ui.picker.stickerpanel.custom;

import c30.C3245i;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import y90.EnumC30860d;

/* renamed from: com.zing.zalo.ui.picker.stickerpanel.custom.q */
/* loaded from: classes6.dex */
public final class C12967q implements InterfaceC12965o {

    /* renamed from: a */
    private final List f67087a;

    /* renamed from: b */
    private final List f67088b;

    /* renamed from: c */
    private final List f67089c;

    public C12967q(List list, List list2) {
        AbstractC19074t.m100208f(list, "downloadedPagerList");
        AbstractC19074t.m100208f(list2, "promotionPagerList");
        this.f67087a = list;
        this.f67088b = list2;
        ArrayList arrayList = new ArrayList();
        this.f67089c = arrayList;
        arrayList.addAll(list);
        arrayList.addAll(list2);
    }

    @Override // com.zing.zalo.p077ui.picker.stickerpanel.custom.InterfaceC12965o
    /* renamed from: a */
    public EnumC30860d mo72857a() {
        return EnumC30860d.f142401A;
    }

    @Override // com.zing.zalo.p077ui.picker.stickerpanel.custom.InterfaceC12965o
    /* renamed from: b */
    public long mo72858b() {
        return mo72857a().hashCode();
    }

    /* renamed from: c */
    public final List m72863c() {
        return this.f67087a;
    }

    /* renamed from: d */
    public final List m72864d() {
        return this.f67088b;
    }

    /* renamed from: e */
    public final C3245i m72865e(int i11) {
        if (i11 >= 0 && i11 < this.f67089c.size()) {
            return ((AbstractC12964n) this.f67089c.get(i11)).m72862c();
        }
        return null;
    }

    /* renamed from: f */
    public final int m72866f(int i11) {
        Iterator it = this.f67089c.iterator();
        int i12 = 0;
        while (it.hasNext()) {
            int i13 = i12 + 1;
            if (((AbstractC12964n) it.next()).m72862c().m16463e() != i11) {
                i12 = i13;
            } else {
                return i12;
            }
        }
        return -1;
    }

    /* renamed from: g */
    public final List m72867g() {
        return this.f67089c;
    }
}
