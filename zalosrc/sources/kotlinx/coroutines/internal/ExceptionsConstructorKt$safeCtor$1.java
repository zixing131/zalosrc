package kotlinx.coroutines.internal;

import en0.InterfaceC18505l;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import pm0.AbstractC24862s;
import pm0.C24861r;

/* loaded from: classes7.dex */
final class ExceptionsConstructorKt$safeCtor$1 extends AbstractC19075u implements InterfaceC18505l {

    /* renamed from: q */
    final /* synthetic */ InterfaceC18505l f107371q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExceptionsConstructorKt$safeCtor$1(InterfaceC18505l interfaceC18505l) {
        super(1);
        this.f107371q = interfaceC18505l;
    }

    @Override // en0.InterfaceC18505l
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Throwable mo205i9(Throwable th2) {
        Object m129218b;
        InterfaceC18505l interfaceC18505l = this.f107371q;
        Object obj = null;
        try {
            C24861r.a aVar = C24861r.f119264q;
            Throwable th3 = (Throwable) interfaceC18505l.mo205i9(th2);
            if (!AbstractC19074t.m100204b(th2.getMessage(), th3.getMessage()) && !AbstractC19074t.m100204b(th3.getMessage(), th2.toString())) {
                th3 = null;
            }
            m129218b = C24861r.m129218b(th3);
        } catch (Throwable th4) {
            C24861r.a aVar2 = C24861r.f119264q;
            m129218b = C24861r.m129218b(AbstractC24862s.m129227a(th4));
        }
        if (!C24861r.m129223g(m129218b)) {
            obj = m129218b;
        }
        return (Throwable) obj;
    }
}
