package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.fa */
/* loaded from: classes.dex */
final class C5375fa extends AbstractC5443ja {

    /* renamed from: c */
    private static final Class f32372c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    public /* synthetic */ C5375fa(AbstractC5358ea abstractC5358ea) {
        super(null);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC5443ja
    /* renamed from: a */
    public final void mo29140a(Object obj, long j11) {
        Object unmodifiableList;
        List list = (List) AbstractC5648vb.m29791k(obj, j11);
        if (list instanceof InterfaceC5341da) {
            unmodifiableList = ((InterfaceC5341da) list).zze();
        } else {
            if (f32372c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof InterfaceC5325cb) && (list instanceof InterfaceC5714z9)) {
                InterfaceC5714z9 interfaceC5714z9 = (InterfaceC5714z9) list;
                if (interfaceC5714z9.zzc()) {
                    interfaceC5714z9.zzb();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        AbstractC5648vb.m29804x(obj, j11, unmodifiableList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.AbstractC5443ja
    /* renamed from: b */
    public final void mo29141b(Object obj, Object obj2, long j11) {
        C5324ca c5324ca;
        List list = (List) AbstractC5648vb.m29791k(obj2, j11);
        int size = list.size();
        List list2 = (List) AbstractC5648vb.m29791k(obj, j11);
        if (list2.isEmpty()) {
            if (list2 instanceof InterfaceC5341da) {
                list2 = new C5324ca(size);
            } else if ((list2 instanceof InterfaceC5325cb) && (list2 instanceof InterfaceC5714z9)) {
                list2 = ((InterfaceC5714z9) list2).mo28992c(size);
            } else {
                list2 = new ArrayList(size);
            }
            AbstractC5648vb.m29804x(obj, j11, list2);
        } else {
            if (f32372c.isAssignableFrom(list2.getClass())) {
                ArrayList arrayList = new ArrayList(list2.size() + size);
                arrayList.addAll(list2);
                AbstractC5648vb.m29804x(obj, j11, arrayList);
                c5324ca = arrayList;
            } else if (list2 instanceof C5563qb) {
                C5324ca c5324ca2 = new C5324ca(list2.size() + size);
                c5324ca2.addAll(c5324ca2.size(), (C5563qb) list2);
                AbstractC5648vb.m29804x(obj, j11, c5324ca2);
                c5324ca = c5324ca2;
            } else if ((list2 instanceof InterfaceC5325cb) && (list2 instanceof InterfaceC5714z9)) {
                InterfaceC5714z9 interfaceC5714z9 = (InterfaceC5714z9) list2;
                if (!interfaceC5714z9.zzc()) {
                    list2 = interfaceC5714z9.mo28992c(list2.size() + size);
                    AbstractC5648vb.m29804x(obj, j11, list2);
                }
            }
            list2 = c5324ca;
        }
        int size2 = list2.size();
        int size3 = list.size();
        if (size2 > 0 && size3 > 0) {
            list2.addAll(list);
        }
        if (size2 > 0) {
            list = list2;
        }
        AbstractC5648vb.m29804x(obj, j11, list);
    }
}
