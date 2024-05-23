package p399op;

import fn0.AbstractC19074t;
import p426pp.C24903f;

/* renamed from: op.s */
/* loaded from: classes4.dex */
public final class C24407s extends AbstractC24389a implements InterfaceC24397i {
    public C24407s() {
        super(200, null, 2, null);
    }

    @Override // p399op.AbstractC24389a, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (!(obj instanceof C24903f)) {
            return false;
        }
        return m127661z((C24903f) obj);
    }

    @Override // p399op.InterfaceC24397i
    /* renamed from: r */
    public C24903f mo127608r(String str) {
        AbstractC19074t.m100208f(str, "idSong");
        return (C24903f) get(str);
    }

    @Override // p399op.InterfaceC24397i
    /* renamed from: t */
    public void mo127609t(C24903f c24903f) {
        AbstractC19074t.m100208f(c24903f, "songStreaming");
        put(c24903f.m129502e(), c24903f);
    }

    /* renamed from: z */
    public /* bridge */ boolean m127661z(C24903f c24903f) {
        return super.containsValue(c24903f);
    }
}
