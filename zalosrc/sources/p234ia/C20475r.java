package p234ia;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.Set;
import p234ia.C20448a;

/* renamed from: ia.r */
/* loaded from: classes3.dex */
final class C20475r extends PhantomReference implements C20448a.a {

    /* renamed from: a */
    private final Set f100709a;

    /* renamed from: b */
    private final Runnable f100710b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C20475r(Object obj, ReferenceQueue referenceQueue, Set set, Runnable runnable, AbstractC20474q abstractC20474q) {
        super(obj, referenceQueue);
        this.f100709a = set;
        this.f100710b = runnable;
    }

    @Override // p234ia.C20448a.a
    /* renamed from: a */
    public final void mo106483a() {
        if (!this.f100709a.remove(this)) {
            return;
        }
        clear();
        this.f100710b.run();
    }
}
