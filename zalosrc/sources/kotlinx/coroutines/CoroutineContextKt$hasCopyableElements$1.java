package kotlinx.coroutines;

import en0.InterfaceC18509p;
import fn0.AbstractC19075u;
import um0.InterfaceC27315f;

/* loaded from: classes.dex */
final class CoroutineContextKt$hasCopyableElements$1 extends AbstractC19075u implements InterfaceC18509p {

    /* renamed from: q */
    public static final CoroutineContextKt$hasCopyableElements$1 f105834q = new CoroutineContextKt$hasCopyableElements$1();

    CoroutineContextKt$hasCopyableElements$1() {
        super(2);
    }

    /* renamed from: a */
    public final Boolean m112621a(boolean z11, InterfaceC27315f.b bVar) {
        boolean z12;
        if (!z11 && !(bVar instanceof CopyableThreadContextElement)) {
            z12 = false;
        } else {
            z12 = true;
        }
        return Boolean.valueOf(z12);
    }

    @Override // en0.InterfaceC18509p
    /* renamed from: pC */
    public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
        return m112621a(((Boolean) obj).booleanValue(), (InterfaceC27315f.b) obj2);
    }
}
