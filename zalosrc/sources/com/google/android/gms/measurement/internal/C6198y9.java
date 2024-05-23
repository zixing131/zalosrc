package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C5285a5;
import com.google.android.gms.internal.measurement.C5302b5;
import com.google.android.gms.internal.measurement.C5319c5;
import com.google.android.gms.internal.measurement.C5336d5;
import com.google.android.gms.internal.measurement.C5386g4;
import com.google.android.gms.internal.measurement.C5403h4;
import com.google.android.gms.internal.measurement.C5420i4;
import com.google.android.gms.internal.measurement.C5437j4;
import com.google.android.gms.internal.measurement.C5649vc;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p230i6.AbstractC20310c0;
import p665y0.C30239a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.y9 */
/* loaded from: classes2.dex */
public final class C6198y9 {

    /* renamed from: a */
    private String f34629a;

    /* renamed from: b */
    private boolean f34630b;

    /* renamed from: c */
    private C5302b5 f34631c;

    /* renamed from: d */
    private BitSet f34632d;

    /* renamed from: e */
    private BitSet f34633e;

    /* renamed from: f */
    private Map f34634f;

    /* renamed from: g */
    private Map f34635g;

    /* renamed from: h */
    final /* synthetic */ C5933b f34636h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C6198y9(C5933b c5933b, String str, AbstractC20310c0 abstractC20310c0) {
        this.f34636h = c5933b;
        this.f34629a = str;
        this.f34630b = true;
        this.f34632d = new BitSet();
        this.f34633e = new BitSet();
        this.f34634f = new C30239a();
        this.f34635g = new C30239a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final C5403h4 m31500a(int i11) {
        ArrayList arrayList;
        List list;
        C5386g4 m29168B = C5403h4.m29168B();
        m29168B.m29147o(i11);
        m29168B.m29149q(this.f34630b);
        C5302b5 c5302b5 = this.f34631c;
        if (c5302b5 != null) {
            m29168B.m29150r(c5302b5);
        }
        C5285a5 m28925E = C5302b5.m28925E();
        m28925E.m28866p(C6077n9.m31152H(this.f34632d));
        m28925E.m28868r(C6077n9.m31152H(this.f34633e));
        Map map = this.f34634f;
        if (map == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(map.size());
            Iterator it = this.f34634f.keySet().iterator();
            while (it.hasNext()) {
                int intValue = ((Integer) it.next()).intValue();
                Long l11 = (Long) this.f34634f.get(Integer.valueOf(intValue));
                if (l11 != null) {
                    C5420i4 m29272C = C5437j4.m29272C();
                    m29272C.m29205p(intValue);
                    m29272C.m29204o(l11.longValue());
                    arrayList2.add((C5437j4) m29272C.m29557k());
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            m28925E.m28865o(arrayList);
        }
        Map map2 = this.f34635g;
        if (map2 == null) {
            list = Collections.emptyList();
        } else {
            ArrayList arrayList3 = new ArrayList(map2.size());
            for (Integer num : this.f34635g.keySet()) {
                C5319c5 m29055D = C5336d5.m29055D();
                m29055D.m28967p(num.intValue());
                List list2 = (List) this.f34635g.get(num);
                if (list2 != null) {
                    Collections.sort(list2);
                    m29055D.m28966o(list2);
                }
                arrayList3.add((C5336d5) m29055D.m29557k());
            }
            list = arrayList3;
        }
        m28925E.m28867q(list);
        m29168B.m29148p(m28925E);
        return (C5403h4) m29168B.m29557k();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final void m31501c(AbstractC5944ba abstractC5944ba) {
        int mo30795a = abstractC5944ba.mo30795a();
        Boolean bool = abstractC5944ba.f33798c;
        if (bool != null) {
            BitSet bitSet = this.f34633e;
            bool.booleanValue();
            bitSet.set(mo30795a, true);
        }
        Boolean bool2 = abstractC5944ba.f33799d;
        if (bool2 != null) {
            this.f34632d.set(mo30795a, bool2.booleanValue());
        }
        if (abstractC5944ba.f33800e != null) {
            Map map = this.f34634f;
            Integer valueOf = Integer.valueOf(mo30795a);
            Long l11 = (Long) map.get(valueOf);
            long longValue = abstractC5944ba.f33800e.longValue() / 1000;
            if (l11 == null || longValue > l11.longValue()) {
                this.f34634f.put(valueOf, Long.valueOf(longValue));
            }
        }
        if (abstractC5944ba.f33801f != null) {
            Map map2 = this.f34635g;
            Integer valueOf2 = Integer.valueOf(mo30795a);
            List list = (List) map2.get(valueOf2);
            if (list == null) {
                list = new ArrayList();
                this.f34635g.put(valueOf2, list);
            }
            if (abstractC5944ba.mo30797c()) {
                list.clear();
            }
            C5649vc.m29807b();
            C5990g m31401z = this.f34636h.f34158a.m31401z();
            String str = this.f34629a;
            C5961d3 c5961d3 = AbstractC5972e3.f33908a0;
            if (m31401z.m30913B(str, c5961d3) && abstractC5944ba.mo30796b()) {
                list.clear();
            }
            C5649vc.m29807b();
            if (this.f34636h.f34158a.m31401z().m30913B(this.f34629a, c5961d3)) {
                Long valueOf3 = Long.valueOf(abstractC5944ba.f33801f.longValue() / 1000);
                if (!list.contains(valueOf3)) {
                    list.add(valueOf3);
                    return;
                }
                return;
            }
            list.add(Long.valueOf(abstractC5944ba.f33801f.longValue() / 1000));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C6198y9(C5933b c5933b, String str, C5302b5 c5302b5, BitSet bitSet, BitSet bitSet2, Map map, Map map2, AbstractC20310c0 abstractC20310c0) {
        this.f34636h = c5933b;
        this.f34629a = str;
        this.f34632d = bitSet;
        this.f34633e = bitSet2;
        this.f34634f = map;
        this.f34635g = new C30239a();
        for (Integer num : map2.keySet()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) map2.get(num));
            this.f34635g.put(num, arrayList);
        }
        this.f34630b = false;
        this.f34631c = c5302b5;
    }
}
