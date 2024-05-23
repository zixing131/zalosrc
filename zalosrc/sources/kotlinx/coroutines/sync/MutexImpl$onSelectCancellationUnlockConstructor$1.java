package kotlinx.coroutines.sync;

import en0.InterfaceC18505l;
import en0.InterfaceC18510q;
import fn0.AbstractC19075u;
import kotlinx.coroutines.selects.SelectInstance;
import pm0.C24848g0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class MutexImpl$onSelectCancellationUnlockConstructor$1 extends AbstractC19075u implements InterfaceC18510q {

    /* renamed from: q */
    final /* synthetic */ MutexImpl f107586q;

    /* renamed from: kotlinx.coroutines.sync.MutexImpl$onSelectCancellationUnlockConstructor$1$1 */
    /* loaded from: classes7.dex */
    public static final class C218781 extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ MutexImpl f107587q;

        /* renamed from: r */
        final /* synthetic */ Object f107588r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C218781(MutexImpl mutexImpl, Object obj) {
            super(1);
            this.f107587q = mutexImpl;
            this.f107588r = obj;
        }

        /* renamed from: a */
        public final void m113908a(Throwable th2) {
            this.f107587q.mo113890c(this.f107588r);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m113908a((Throwable) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MutexImpl$onSelectCancellationUnlockConstructor$1(MutexImpl mutexImpl) {
        super(3);
        this.f107586q = mutexImpl;
    }

    @Override // en0.InterfaceC18510q
    /* renamed from: a */
    public final InterfaceC18505l mo45599Hr(SelectInstance selectInstance, Object obj, Object obj2) {
        return new C218781(this.f107586q, obj);
    }
}
