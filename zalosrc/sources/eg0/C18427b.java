package eg0;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import p391og.AbstractC24249a;
import rh0.AbstractC25803k;

/* renamed from: eg0.b */
/* loaded from: classes6.dex */
public class C18427b extends AbstractC24249a {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C18427b(String str, Runnable runnable) {
        this(str, 0, runnable, 2, null);
        AbstractC19074t.m100208f(str, "threadId");
        AbstractC19074t.m100208f(runnable, "task");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18427b(String str, int i11, Runnable runnable) {
        super(str, i11, AbstractC25803k.m132965e(), runnable);
        AbstractC19074t.m100208f(str, "threadId");
        AbstractC19074t.m100208f(runnable, "task");
    }

    public /* synthetic */ C18427b(String str, int i11, Runnable runnable, int i12, AbstractC19060k abstractC19060k) {
        this(str, (i12 & 2) != 0 ? 1 : i11, runnable);
    }
}
