package kotlinx.coroutines;

import en0.InterfaceC18509p;
import fn0.AbstractC19075u;
import um0.InterfaceC27315f;

/* loaded from: classes7.dex */
final class CoroutineContextKt$foldCopies$1 extends AbstractC19075u implements InterfaceC18509p {

    /* renamed from: q */
    public static final CoroutineContextKt$foldCopies$1 f105831q = new CoroutineContextKt$foldCopies$1();

    CoroutineContextKt$foldCopies$1() {
        super(2);
    }

    @Override // en0.InterfaceC18509p
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final InterfaceC27315f mo240pC(InterfaceC27315f interfaceC27315f, InterfaceC27315f.b bVar) {
        if (bVar instanceof CopyableThreadContextElement) {
            return interfaceC27315f.mo112823d0(((CopyableThreadContextElement) bVar).m112610J());
        }
        return interfaceC27315f.mo112823d0(bVar);
    }
}
