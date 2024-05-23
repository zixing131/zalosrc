package kotlinx.coroutines;

import en0.InterfaceC18509p;
import fn0.AbstractC19075u;
import fn0.C19059j0;
import um0.InterfaceC27315f;

/* loaded from: classes7.dex */
final class CoroutineContextKt$foldCopies$folded$1 extends AbstractC19075u implements InterfaceC18509p {

    /* renamed from: q */
    final /* synthetic */ C19059j0 f105832q;

    /* renamed from: r */
    final /* synthetic */ boolean f105833r;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineContextKt$foldCopies$folded$1(C19059j0 c19059j0, boolean z11) {
        super(2);
        this.f105832q = c19059j0;
        this.f105833r = z11;
    }

    @Override // en0.InterfaceC18509p
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final InterfaceC27315f mo240pC(InterfaceC27315f interfaceC27315f, InterfaceC27315f.b bVar) {
        if (!(bVar instanceof CopyableThreadContextElement)) {
            return interfaceC27315f.mo112823d0(bVar);
        }
        InterfaceC27315f.b mo112624d = ((InterfaceC27315f) this.f105832q.f94941p).mo112624d(bVar.getKey());
        if (mo112624d == null) {
            CopyableThreadContextElement copyableThreadContextElement = (CopyableThreadContextElement) bVar;
            if (this.f105833r) {
                copyableThreadContextElement = copyableThreadContextElement.m112610J();
            }
            return interfaceC27315f.mo112823d0(copyableThreadContextElement);
        }
        C19059j0 c19059j0 = this.f105832q;
        c19059j0.f94941p = ((InterfaceC27315f) c19059j0.f94941p).mo112625i(bVar.getKey());
        return interfaceC27315f.mo112823d0(((CopyableThreadContextElement) bVar).m112611K(mo112624d));
    }
}
