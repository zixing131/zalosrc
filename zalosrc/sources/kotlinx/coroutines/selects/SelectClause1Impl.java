package kotlinx.coroutines.selects;

import en0.InterfaceC18510q;

/* loaded from: classes7.dex */
public final class SelectClause1Impl<Q> implements SelectClause1<Q> {

    /* renamed from: a */
    private final Object f107515a;

    /* renamed from: b */
    private final InterfaceC18510q f107516b;

    /* renamed from: c */
    private final InterfaceC18510q f107517c;

    /* renamed from: d */
    private final InterfaceC18510q f107518d;

    public SelectClause1Impl(Object obj, InterfaceC18510q interfaceC18510q, InterfaceC18510q interfaceC18510q2, InterfaceC18510q interfaceC18510q3) {
        this.f107515a = obj;
        this.f107516b = interfaceC18510q;
        this.f107517c = interfaceC18510q2;
        this.f107518d = interfaceC18510q3;
    }

    @Override // kotlinx.coroutines.selects.SelectClause
    /* renamed from: a */
    public InterfaceC18510q mo113834a() {
        return this.f107516b;
    }

    @Override // kotlinx.coroutines.selects.SelectClause
    /* renamed from: b */
    public InterfaceC18510q mo113835b() {
        return this.f107518d;
    }

    @Override // kotlinx.coroutines.selects.SelectClause
    /* renamed from: c */
    public InterfaceC18510q mo113836c() {
        return this.f107517c;
    }

    @Override // kotlinx.coroutines.selects.SelectClause
    /* renamed from: d */
    public Object mo113837d() {
        return this.f107515a;
    }
}
