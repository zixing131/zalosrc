package pm0;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* renamed from: pm0.p */
/* loaded from: classes7.dex */
public final class C24859p extends Error {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24859p(String str) {
        super(str);
        AbstractC19074t.m100208f(str, "message");
    }

    public /* synthetic */ C24859p(String str, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? "An operation is not implemented." : str);
    }
}
