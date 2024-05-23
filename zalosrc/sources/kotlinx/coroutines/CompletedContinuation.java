package kotlinx.coroutines;

import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* loaded from: classes7.dex */
final class CompletedContinuation {

    /* renamed from: a */
    public final Object f105822a;

    /* renamed from: b */
    public final CancelHandler f105823b;

    /* renamed from: c */
    public final InterfaceC18505l f105824c;

    /* renamed from: d */
    public final Object f105825d;

    /* renamed from: e */
    public final Throwable f105826e;

    public CompletedContinuation(Object obj, CancelHandler cancelHandler, InterfaceC18505l interfaceC18505l, Object obj2, Throwable th2) {
        this.f105822a = obj;
        this.f105823b = cancelHandler;
        this.f105824c = interfaceC18505l;
        this.f105825d = obj2;
        this.f105826e = th2;
    }

    /* renamed from: b */
    public static /* synthetic */ CompletedContinuation m112600b(CompletedContinuation completedContinuation, Object obj, CancelHandler cancelHandler, InterfaceC18505l interfaceC18505l, Object obj2, Throwable th2, int i11, Object obj3) {
        if ((i11 & 1) != 0) {
            obj = completedContinuation.f105822a;
        }
        if ((i11 & 2) != 0) {
            cancelHandler = completedContinuation.f105823b;
        }
        CancelHandler cancelHandler2 = cancelHandler;
        if ((i11 & 4) != 0) {
            interfaceC18505l = completedContinuation.f105824c;
        }
        InterfaceC18505l interfaceC18505l2 = interfaceC18505l;
        if ((i11 & 8) != 0) {
            obj2 = completedContinuation.f105825d;
        }
        Object obj4 = obj2;
        if ((i11 & 16) != 0) {
            th2 = completedContinuation.f105826e;
        }
        return completedContinuation.m112601a(obj, cancelHandler2, interfaceC18505l2, obj4, th2);
    }

    /* renamed from: a */
    public final CompletedContinuation m112601a(Object obj, CancelHandler cancelHandler, InterfaceC18505l interfaceC18505l, Object obj2, Throwable th2) {
        return new CompletedContinuation(obj, cancelHandler, interfaceC18505l, obj2, th2);
    }

    /* renamed from: c */
    public final boolean m112602c() {
        return this.f105826e != null;
    }

    /* renamed from: d */
    public final void m112603d(CancellableContinuationImpl cancellableContinuationImpl, Throwable th2) {
        CancelHandler cancelHandler = this.f105823b;
        if (cancelHandler != null) {
            cancellableContinuationImpl.m112586p(cancelHandler, th2);
        }
        InterfaceC18505l interfaceC18505l = this.f105824c;
        if (interfaceC18505l != null) {
            cancellableContinuationImpl.m112587q(interfaceC18505l, th2);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompletedContinuation)) {
            return false;
        }
        CompletedContinuation completedContinuation = (CompletedContinuation) obj;
        return AbstractC19074t.m100204b(this.f105822a, completedContinuation.f105822a) && AbstractC19074t.m100204b(this.f105823b, completedContinuation.f105823b) && AbstractC19074t.m100204b(this.f105824c, completedContinuation.f105824c) && AbstractC19074t.m100204b(this.f105825d, completedContinuation.f105825d) && AbstractC19074t.m100204b(this.f105826e, completedContinuation.f105826e);
    }

    public int hashCode() {
        Object obj = this.f105822a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        CancelHandler cancelHandler = this.f105823b;
        int hashCode2 = (hashCode + (cancelHandler == null ? 0 : cancelHandler.hashCode())) * 31;
        InterfaceC18505l interfaceC18505l = this.f105824c;
        int hashCode3 = (hashCode2 + (interfaceC18505l == null ? 0 : interfaceC18505l.hashCode())) * 31;
        Object obj2 = this.f105825d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th2 = this.f105826e;
        return hashCode4 + (th2 != null ? th2.hashCode() : 0);
    }

    public String toString() {
        return "CompletedContinuation(result=" + this.f105822a + ", cancelHandler=" + this.f105823b + ", onCancellation=" + this.f105824c + ", idempotentResume=" + this.f105825d + ", cancelCause=" + this.f105826e + ')';
    }

    public /* synthetic */ CompletedContinuation(Object obj, CancelHandler cancelHandler, InterfaceC18505l interfaceC18505l, Object obj2, Throwable th2, int i11, AbstractC19060k abstractC19060k) {
        this(obj, (i11 & 2) != 0 ? null : cancelHandler, (i11 & 4) != 0 ? null : interfaceC18505l, (i11 & 8) != 0 ? null : obj2, (i11 & 16) != 0 ? null : th2);
    }
}
