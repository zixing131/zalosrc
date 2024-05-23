package kotlinx.coroutines.flow.internal;

import fn0.AbstractC19074t;
import java.util.Arrays;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot;
import pm0.C24848g0;
import pm0.C24861r;

/* loaded from: classes.dex */
public abstract class AbstractSharedFlow<S extends AbstractSharedFlowSlot<?>> {

    /* renamed from: p */
    private AbstractSharedFlowSlot[] f107187p;

    /* renamed from: q */
    private int f107188q;

    /* renamed from: r */
    private int f107189r;

    /* renamed from: s */
    private SubscriptionCountStateFlow f107190s;

    /* renamed from: e */
    public static final /* synthetic */ int m113514e(AbstractSharedFlow abstractSharedFlow) {
        return abstractSharedFlow.f107188q;
    }

    /* renamed from: f */
    public static final /* synthetic */ AbstractSharedFlowSlot[] m113515f(AbstractSharedFlow abstractSharedFlow) {
        return abstractSharedFlow.f107187p;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: g */
    public final AbstractSharedFlowSlot m113516g() {
        AbstractSharedFlowSlot abstractSharedFlowSlot;
        SubscriptionCountStateFlow subscriptionCountStateFlow;
        synchronized (this) {
            try {
                AbstractSharedFlowSlot[] abstractSharedFlowSlotArr = this.f107187p;
                if (abstractSharedFlowSlotArr == null) {
                    abstractSharedFlowSlotArr = mo113476k(2);
                    this.f107187p = abstractSharedFlowSlotArr;
                } else if (this.f107188q >= abstractSharedFlowSlotArr.length) {
                    Object[] copyOf = Arrays.copyOf(abstractSharedFlowSlotArr, abstractSharedFlowSlotArr.length * 2);
                    AbstractC19074t.m100207e(copyOf, "copyOf(this, newSize)");
                    this.f107187p = (AbstractSharedFlowSlot[]) copyOf;
                    abstractSharedFlowSlotArr = (AbstractSharedFlowSlot[]) copyOf;
                }
                int i11 = this.f107189r;
                do {
                    abstractSharedFlowSlot = abstractSharedFlowSlotArr[i11];
                    if (abstractSharedFlowSlot == null) {
                        abstractSharedFlowSlot = mo113475j();
                        abstractSharedFlowSlotArr[i11] = abstractSharedFlowSlot;
                    }
                    i11++;
                    if (i11 >= abstractSharedFlowSlotArr.length) {
                        i11 = 0;
                    }
                    AbstractC19074t.m100206d(abstractSharedFlowSlot, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                } while (!abstractSharedFlowSlot.mo113484a(this));
                this.f107189r = i11;
                this.f107188q++;
                subscriptionCountStateFlow = this.f107190s;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (subscriptionCountStateFlow != null) {
            subscriptionCountStateFlow.m113566b0(1);
        }
        return abstractSharedFlowSlot;
    }

    /* renamed from: h */
    public final StateFlow m113517h() {
        SubscriptionCountStateFlow subscriptionCountStateFlow;
        synchronized (this) {
            subscriptionCountStateFlow = this.f107190s;
            if (subscriptionCountStateFlow == null) {
                subscriptionCountStateFlow = new SubscriptionCountStateFlow(this.f107188q);
                this.f107190s = subscriptionCountStateFlow;
            }
        }
        return subscriptionCountStateFlow;
    }

    /* renamed from: j */
    protected abstract AbstractSharedFlowSlot mo113475j();

    /* renamed from: k */
    protected abstract AbstractSharedFlowSlot[] mo113476k(int i11);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: m */
    public final void m113518m(AbstractSharedFlowSlot abstractSharedFlowSlot) {
        SubscriptionCountStateFlow subscriptionCountStateFlow;
        int i11;
        Continuation[] mo113485b;
        synchronized (this) {
            try {
                int i12 = this.f107188q - 1;
                this.f107188q = i12;
                subscriptionCountStateFlow = this.f107190s;
                if (i12 == 0) {
                    this.f107189r = 0;
                }
                AbstractC19074t.m100206d(abstractSharedFlowSlot, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                mo113485b = abstractSharedFlowSlot.mo113485b(this);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        for (Continuation continuation : mo113485b) {
            if (continuation != null) {
                C24861r.a aVar = C24861r.f119264q;
                continuation.mo112492g(C24861r.m129218b(C24848g0.f119245a));
            }
        }
        if (subscriptionCountStateFlow != null) {
            subscriptionCountStateFlow.m113566b0(-1);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: n */
    public final int m113519n() {
        return this.f107188q;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: o */
    public final AbstractSharedFlowSlot[] m113520o() {
        return this.f107187p;
    }
}
