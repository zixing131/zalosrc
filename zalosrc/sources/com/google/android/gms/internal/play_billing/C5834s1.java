package com.google.android.gms.internal.play_billing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.play_billing.s1 */
/* loaded from: classes2.dex */
final class C5834s1 extends AbstractC5858w1 {

    /* renamed from: c */
    private static final Class f33430c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    public /* synthetic */ C5834s1(AbstractC5828r1 abstractC5828r1) {
        super(null);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5858w1
    /* renamed from: a */
    public final void mo30465a(Object obj, long j11) {
        Object unmodifiableList;
        List list = (List) AbstractC5770h3.m30258k(obj, j11);
        if (list instanceof InterfaceC5822q1) {
            unmodifiableList = ((InterfaceC5822q1) list).zze();
        } else if (!f33430c.isAssignableFrom(list.getClass())) {
            if ((list instanceof InterfaceC5817p2) && (list instanceof InterfaceC5798m1)) {
                InterfaceC5798m1 interfaceC5798m1 = (InterfaceC5798m1) list;
                if (interfaceC5798m1.zzc()) {
                    interfaceC5798m1.zzb();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        } else {
            return;
        }
        AbstractC5770h3.m30271x(obj, j11, unmodifiableList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.play_billing.AbstractC5858w1
    /* renamed from: b */
    public final void mo30466b(Object obj, Object obj2, long j11) {
        C5816p1 c5816p1;
        List list = (List) AbstractC5770h3.m30258k(obj2, j11);
        int size = list.size();
        List list2 = (List) AbstractC5770h3.m30258k(obj, j11);
        if (list2.isEmpty()) {
            if (list2 instanceof InterfaceC5822q1) {
                list2 = new C5816p1(size);
            } else if ((list2 instanceof InterfaceC5817p2) && (list2 instanceof InterfaceC5798m1)) {
                list2 = ((InterfaceC5798m1) list2).mo30360c(size);
            } else {
                list2 = new ArrayList(size);
            }
            AbstractC5770h3.m30271x(obj, j11, list2);
        } else {
            if (f33430c.isAssignableFrom(list2.getClass())) {
                ArrayList arrayList = new ArrayList(list2.size() + size);
                arrayList.addAll(list2);
                AbstractC5770h3.m30271x(obj, j11, arrayList);
                c5816p1 = arrayList;
            } else if (list2 instanceof C5739c3) {
                C5816p1 c5816p12 = new C5816p1(list2.size() + size);
                c5816p12.addAll(c5816p12.size(), (C5739c3) list2);
                AbstractC5770h3.m30271x(obj, j11, c5816p12);
                c5816p1 = c5816p12;
            } else if ((list2 instanceof InterfaceC5817p2) && (list2 instanceof InterfaceC5798m1)) {
                InterfaceC5798m1 interfaceC5798m1 = (InterfaceC5798m1) list2;
                if (!interfaceC5798m1.zzc()) {
                    list2 = interfaceC5798m1.mo30360c(list2.size() + size);
                    AbstractC5770h3.m30271x(obj, j11, list2);
                }
            }
            list2 = c5816p1;
        }
        int size2 = list2.size();
        int size3 = list.size();
        if (size2 > 0 && size3 > 0) {
            list2.addAll(list);
        }
        if (size2 > 0) {
            list = list2;
        }
        AbstractC5770h3.m30271x(obj, j11, list);
    }
}
