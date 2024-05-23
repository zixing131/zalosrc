package kotlinx.coroutines.internal;

import en0.InterfaceC18505l;
import fn0.AbstractC19075u;
import pm0.C24848g0;
import um0.InterfaceC27315f;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class OnUndeliveredElementKt$bindCancellationFun$1 extends AbstractC19075u implements InterfaceC18505l {

    /* renamed from: q */
    final /* synthetic */ InterfaceC18505l f107409q;

    /* renamed from: r */
    final /* synthetic */ Object f107410r;

    /* renamed from: s */
    final /* synthetic */ InterfaceC27315f f107411s;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnUndeliveredElementKt$bindCancellationFun$1(InterfaceC18505l interfaceC18505l, Object obj, InterfaceC27315f interfaceC27315f) {
        super(1);
        this.f107409q = interfaceC18505l;
        this.f107410r = obj;
        this.f107411s = interfaceC27315f;
    }

    /* renamed from: a */
    public final void m113698a(Throwable th2) {
        OnUndeliveredElementKt.m113695b(this.f107409q, this.f107410r, this.f107411s);
    }

    @Override // en0.InterfaceC18505l
    /* renamed from: i9 */
    public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
        m113698a((Throwable) obj);
        return C24848g0.f119245a;
    }
}
