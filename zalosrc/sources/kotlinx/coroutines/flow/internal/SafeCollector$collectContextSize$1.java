package kotlinx.coroutines.flow.internal;

import en0.InterfaceC18509p;
import fn0.AbstractC19075u;
import um0.InterfaceC27315f;

/* loaded from: classes7.dex */
final class SafeCollector$collectContextSize$1 extends AbstractC19075u implements InterfaceC18509p {

    /* renamed from: q */
    public static final SafeCollector$collectContextSize$1 f107321q = new SafeCollector$collectContextSize$1();

    SafeCollector$collectContextSize$1() {
        super(2);
    }

    /* renamed from: a */
    public final Integer m113559a(int i11, InterfaceC27315f.b bVar) {
        return Integer.valueOf(i11 + 1);
    }

    @Override // en0.InterfaceC18509p
    /* renamed from: pC */
    public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
        return m113559a(((Number) obj).intValue(), (InterfaceC27315f.b) obj2);
    }
}
