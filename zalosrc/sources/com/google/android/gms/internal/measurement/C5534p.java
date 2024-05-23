package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.p */
/* loaded from: classes2.dex */
public final class C5534p extends AbstractC5432j implements InterfaceC5483m {

    /* renamed from: r */
    protected final List f32714r;

    /* renamed from: s */
    protected final List f32715s;

    /* renamed from: t */
    protected C5590s4 f32716t;

    private C5534p(C5534p c5534p) {
        super(c5534p.f32427p);
        ArrayList arrayList = new ArrayList(c5534p.f32714r.size());
        this.f32714r = arrayList;
        arrayList.addAll(c5534p.f32714r);
        ArrayList arrayList2 = new ArrayList(c5534p.f32715s.size());
        this.f32715s = arrayList2;
        arrayList2.addAll(c5534p.f32715s);
        this.f32716t = c5534p.f32716t;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC5432j
    /* renamed from: a */
    public final InterfaceC5551q mo28891a(C5590s4 c5590s4, List list) {
        C5590s4 m29588a = this.f32716t.m29588a();
        for (int i11 = 0; i11 < this.f32714r.size(); i11++) {
            if (i11 < list.size()) {
                m29588a.m29592e((String) this.f32714r.get(i11), c5590s4.m29589b((InterfaceC5551q) list.get(i11)));
            } else {
                m29588a.m29592e((String) this.f32714r.get(i11), InterfaceC5551q.f32730d);
            }
        }
        for (InterfaceC5551q interfaceC5551q : this.f32715s) {
            InterfaceC5551q m29589b = m29588a.m29589b(interfaceC5551q);
            if (m29589b instanceof C5568r) {
                m29589b = m29588a.m29589b(interfaceC5551q);
            }
            if (m29589b instanceof C5398h) {
                return ((C5398h) m29589b).m29165a();
            }
        }
        return InterfaceC5551q.f32730d;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC5432j, com.google.android.gms.internal.measurement.InterfaceC5551q
    public final InterfaceC5551q zzd() {
        return new C5534p(this);
    }

    public C5534p(String str, List list, List list2, C5590s4 c5590s4) {
        super(str);
        this.f32714r = new ArrayList();
        this.f32716t = c5590s4;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.f32714r.add(((InterfaceC5551q) it.next()).zzi());
            }
        }
        this.f32715s = new ArrayList(list2);
    }
}
