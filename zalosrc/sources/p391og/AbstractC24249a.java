package p391og;

import bg0.AbstractC2796b;
import fn0.AbstractC19074t;
import java.util.UUID;
import p141ex.AbstractC18630e;

/* renamed from: og.a */
/* loaded from: classes3.dex */
public abstract class AbstractC24249a extends AbstractC2796b.a {

    /* renamed from: r */
    private final String f117136r;

    /* renamed from: s */
    private final int f117137s;

    /* renamed from: t */
    private Exception f117138t;

    /* renamed from: u */
    private long f117139u;

    /* renamed from: v */
    private String f117140v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC24249a(String str, int i11, boolean z11, Runnable runnable) {
        super(i11, runnable);
        AbstractC19074t.m100208f(str, "threadId");
        AbstractC19074t.m100208f(runnable, "task");
        this.f117136r = str;
        this.f117137s = i11;
        this.f117140v = "";
        if (z11) {
            this.f117138t = new Exception("ChatTask[" + str + "]");
            this.f117139u = m126585b();
            String uuid = UUID.randomUUID().toString();
            AbstractC19074t.m100207e(uuid, "toString(...)");
            this.f117140v = uuid;
        }
    }

    /* renamed from: b */
    private final long m126585b() {
        return System.currentTimeMillis();
    }

    /* renamed from: c */
    public final Exception m126586c() {
        return this.f117138t;
    }

    /* renamed from: d */
    public final int m126587d() {
        return this.f117137s;
    }

    /* renamed from: e */
    public final String m126588e() {
        return this.f117140v;
    }

    /* renamed from: f */
    public final String m126589f() {
        return this.f117136r;
    }

    @Override // bg0.AbstractC2796b.a, java.lang.Runnable
    public void run() {
        long m126585b = m126585b() - this.f117139u;
        long m126585b2 = m126585b();
        super.run();
        AbstractC18630e.m98439b(-1, this.f117138t, m126585b, m126585b() - m126585b2, this.f117140v, false, this.f117136r);
    }
}
