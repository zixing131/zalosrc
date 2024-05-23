package kotlinx.coroutines.selects;

import en0.InterfaceC18510q;
import fn0.AbstractC19060k;

/* loaded from: classes7.dex */
public final class SelectClause0Impl implements SelectClause0 {

    /* renamed from: a */
    private final Object f107511a;

    /* renamed from: b */
    private final InterfaceC18510q f107512b;

    /* renamed from: c */
    private final InterfaceC18510q f107513c;

    /* renamed from: d */
    private final InterfaceC18510q f107514d;

    public SelectClause0Impl(Object obj, InterfaceC18510q interfaceC18510q, InterfaceC18510q interfaceC18510q2) {
        InterfaceC18510q interfaceC18510q3;
        this.f107511a = obj;
        this.f107512b = interfaceC18510q;
        this.f107513c = interfaceC18510q2;
        interfaceC18510q3 = SelectKt.f107545a;
        this.f107514d = interfaceC18510q3;
    }

    @Override // kotlinx.coroutines.selects.SelectClause
    /* renamed from: a */
    public InterfaceC18510q mo113834a() {
        return this.f107512b;
    }

    @Override // kotlinx.coroutines.selects.SelectClause
    /* renamed from: b */
    public InterfaceC18510q mo113835b() {
        return this.f107513c;
    }

    @Override // kotlinx.coroutines.selects.SelectClause
    /* renamed from: c */
    public InterfaceC18510q mo113836c() {
        return this.f107514d;
    }

    @Override // kotlinx.coroutines.selects.SelectClause
    /* renamed from: d */
    public Object mo113837d() {
        return this.f107511a;
    }

    public /* synthetic */ SelectClause0Impl(Object obj, InterfaceC18510q interfaceC18510q, InterfaceC18510q interfaceC18510q2, int i11, AbstractC19060k abstractC19060k) {
        this(obj, interfaceC18510q, (i11 & 4) != 0 ? null : interfaceC18510q2);
    }
}
