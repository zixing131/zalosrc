package kotlinx.coroutines.flow;

import java.util.Collection;
import kotlin.coroutines.Continuation;
import wm0.AbstractC29096d;
import wm0.InterfaceC29098f;

/* JADX INFO: Access modifiers changed from: package-private */
@InterfaceC29098f(m145344c = "kotlinx.coroutines.flow.FlowKt__CollectionKt", m145345f = "Collection.kt", m145346l = {26}, m145347m = "toCollection")
/* loaded from: classes7.dex */
public final class FlowKt__CollectionKt$toCollection$1<T, C extends Collection<? super T>> extends AbstractC29096d {

    /* renamed from: s */
    Object f106517s;

    /* renamed from: t */
    /* synthetic */ Object f106518t;

    /* renamed from: u */
    int f106519u;

    /* JADX INFO: Access modifiers changed from: package-private */
    public FlowKt__CollectionKt$toCollection$1(Continuation continuation) {
        super(continuation);
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: o */
    public final Object mo239o(Object obj) {
        this.f106518t = obj;
        this.f106519u |= Integer.MIN_VALUE;
        return FlowKt.m113281Q(null, null, this);
    }
}
