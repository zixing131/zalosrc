package ze0;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import ve0.C27995d;

/* renamed from: ze0.g */
/* loaded from: classes4.dex */
final class C31801g implements InterfaceC31803i {

    /* renamed from: a */
    private final ConcurrentMap f145954a = new ConcurrentHashMap();

    /* renamed from: b */
    private final a f145955b;

    /* renamed from: ze0.g$a */
    /* loaded from: classes4.dex */
    interface a {
        /* renamed from: a */
        Object mo152831a(C27995d c27995d);
    }

    private C31801g(a aVar) {
        this.f145955b = aVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static C31801g m152832b() {
        return new C31801g(new a() { // from class: ze0.e
            @Override // ze0.C31801g.a
            /* renamed from: a */
            public final Object mo152831a(C27995d c27995d) {
                return Integer.valueOf(c27995d.m141065a());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static C31801g m152833c() {
        return new C31801g(new a() { // from class: ze0.f
            @Override // ze0.C31801g.a
            /* renamed from: a */
            public final Object mo152831a(C27995d c27995d) {
                return c27995d.m141071d();
            }
        });
    }

    @Override // ze0.InterfaceC31803i
    /* renamed from: a */
    public void mo152828a(C27995d c27995d) {
        this.f145954a.put(this.f145955b.mo152831a(c27995d), c27995d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public a m152834d() {
        return this.f145955b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public C27995d m152835e(Object obj) {
        if (obj != null) {
            return (C27995d) this.f145954a.get(obj);
        }
        return null;
    }
}
