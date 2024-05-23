package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
final class jv3 extends ov3 {

    /* renamed from: c */
    private static final Class f23010c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    public /* synthetic */ jv3(iv3 iv3Var) {
        super(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: f */
    private static List m23759f(Object obj, long j11, int i11) {
        gv3 gv3Var;
        List arrayList;
        List list = (List) ix3.m23454p(obj, j11);
        if (list.isEmpty()) {
            if (list instanceof hv3) {
                arrayList = new gv3(i11);
            } else if ((list instanceof gw3) && (list instanceof cv3)) {
                arrayList = ((cv3) list).mo21159c(i11);
            } else {
                arrayList = new ArrayList(i11);
            }
            ix3.m23434D(obj, j11, arrayList);
            return arrayList;
        }
        if (f23010c.isAssignableFrom(list.getClass())) {
            ArrayList arrayList2 = new ArrayList(list.size() + i11);
            arrayList2.addAll(list);
            ix3.m23434D(obj, j11, arrayList2);
            gv3Var = arrayList2;
        } else if (list instanceof dx3) {
            gv3 gv3Var2 = new gv3(list.size() + i11);
            gv3Var2.addAll(gv3Var2.size(), (dx3) list);
            ix3.m23434D(obj, j11, gv3Var2);
            gv3Var = gv3Var2;
        } else {
            if ((list instanceof gw3) && (list instanceof cv3)) {
                cv3 cv3Var = (cv3) list;
                if (!cv3Var.zzc()) {
                    cv3 mo21159c = cv3Var.mo21159c(list.size() + i11);
                    ix3.m23434D(obj, j11, mo21159c);
                    return mo21159c;
                }
                return list;
            }
            return list;
        }
        return gv3Var;
    }

    @Override // com.google.android.gms.internal.ads.ov3
    /* renamed from: a */
    public final List mo23760a(Object obj, long j11) {
        return m23759f(obj, j11, 10);
    }

    @Override // com.google.android.gms.internal.ads.ov3
    /* renamed from: b */
    public final void mo23761b(Object obj, long j11) {
        Object unmodifiableList;
        List list = (List) ix3.m23454p(obj, j11);
        if (list instanceof hv3) {
            unmodifiableList = ((hv3) list).zze();
        } else {
            if (f23010c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof gw3) && (list instanceof cv3)) {
                cv3 cv3Var = (cv3) list;
                if (cv3Var.zzc()) {
                    cv3Var.zzb();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        ix3.m23434D(obj, j11, unmodifiableList);
    }

    @Override // com.google.android.gms.internal.ads.ov3
    /* renamed from: c */
    public final void mo23762c(Object obj, Object obj2, long j11) {
        List list = (List) ix3.m23454p(obj2, j11);
        List m23759f = m23759f(obj, j11, list.size());
        int size = m23759f.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            m23759f.addAll(list);
        }
        if (size > 0) {
            list = m23759f;
        }
        ix3.m23434D(obj, j11, list);
    }
}
