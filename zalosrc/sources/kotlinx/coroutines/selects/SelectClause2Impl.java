package kotlinx.coroutines.selects;

import en0.InterfaceC18510q;
import fn0.AbstractC19060k;

/* loaded from: classes7.dex */
public final class SelectClause2Impl<P, Q> implements SelectClause2<P, Q> {

    /* renamed from: a */
    private final Object f107519a;

    /* renamed from: b */
    private final InterfaceC18510q f107520b;

    /* renamed from: c */
    private final InterfaceC18510q f107521c;

    /* renamed from: d */
    private final InterfaceC18510q f107522d;

    public SelectClause2Impl(Object obj, InterfaceC18510q interfaceC18510q, InterfaceC18510q interfaceC18510q2, InterfaceC18510q interfaceC18510q3) {
        this.f107519a = obj;
        this.f107520b = interfaceC18510q;
        this.f107521c = interfaceC18510q2;
        this.f107522d = interfaceC18510q3;
    }

    @Override // kotlinx.coroutines.selects.SelectClause
    /* renamed from: a */
    public InterfaceC18510q mo113834a() {
        return this.f107520b;
    }

    @Override // kotlinx.coroutines.selects.SelectClause
    /* renamed from: c */
    public InterfaceC18510q mo113836c() {
        return this.f107521c;
    }

    public /* synthetic */ SelectClause2Impl(Object obj, InterfaceC18510q interfaceC18510q, InterfaceC18510q interfaceC18510q2, InterfaceC18510q interfaceC18510q3, int i11, AbstractC19060k abstractC19060k) {
        this(obj, interfaceC18510q, interfaceC18510q2, (i11 & 8) != 0 ? null : interfaceC18510q3);
    }
}
