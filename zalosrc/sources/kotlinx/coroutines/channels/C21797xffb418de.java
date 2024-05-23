package kotlinx.coroutines.channels;

import en0.InterfaceC18505l;
import en0.InterfaceC18510q;
import fn0.AbstractC19075u;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import kotlinx.coroutines.selects.SelectInstance;
import pm0.C24848g0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: kotlinx.coroutines.channels.BufferedChannel$onUndeliveredElementReceiveCancellationConstructor$1$1 */
/* loaded from: classes7.dex */
public final class C21797xffb418de extends AbstractC19075u implements InterfaceC18510q {

    /* renamed from: q */
    final /* synthetic */ BufferedChannel f106027q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: kotlinx.coroutines.channels.BufferedChannel$onUndeliveredElementReceiveCancellationConstructor$1$1$1, reason: invalid class name */
    /* loaded from: classes7.dex */
    public static final class AnonymousClass1 extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ Object f106028q;

        /* renamed from: r */
        final /* synthetic */ BufferedChannel f106029r;

        /* renamed from: s */
        final /* synthetic */ SelectInstance f106030s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Object obj, BufferedChannel bufferedChannel, SelectInstance selectInstance) {
            super(1);
            this.f106028q = obj;
            this.f106029r = bufferedChannel;
            this.f106030s = selectInstance;
        }

        /* renamed from: a */
        public final void m113041a(Throwable th2) {
            if (this.f106028q != BufferedChannelKt.m113072z()) {
                OnUndeliveredElementKt.m113695b(this.f106029r.f106012q, this.f106028q, this.f106030s.getContext());
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m113041a((Throwable) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21797xffb418de(BufferedChannel bufferedChannel) {
        super(3);
        this.f106027q = bufferedChannel;
    }

    @Override // en0.InterfaceC18510q
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final InterfaceC18505l mo45599Hr(SelectInstance selectInstance, Object obj, Object obj2) {
        return new AnonymousClass1(obj2, this.f106027q, selectInstance);
    }
}
