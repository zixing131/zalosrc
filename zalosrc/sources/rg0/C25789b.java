package rg0;

import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: rg0.b */
/* loaded from: classes7.dex */
public final class C25789b {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final ConcurrentHashMap f122983a;

    /* renamed from: rg0.b$a */
    /* loaded from: classes7.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C25789b m132927a() {
            return b.f122984a.m132928a();
        }
    }

    /* renamed from: rg0.b$b */
    /* loaded from: classes7.dex */
    private static final class b {

        /* renamed from: a */
        public static final b f122984a = new b();

        /* renamed from: b */
        private static final C25789b f122985b = new C25789b(null);

        private b() {
        }

        /* renamed from: a */
        public final C25789b m132928a() {
            return f122985b;
        }
    }

    /* renamed from: rg0.b$c */
    /* loaded from: classes7.dex */
    static final class c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ int f122986q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(int i11) {
            super(0);
            this.f122986q = i11;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25788a mo12V4() {
            int i11 = this.f122986q;
            if (i11 != 1) {
                if (i11 == 2) {
                    return new C25791d();
                }
                throw new RuntimeException("Could not create media encryption for un-supported algorithm version: " + this.f122986q);
            }
            return new C25790c();
        }
    }

    public /* synthetic */ C25789b(AbstractC19060k abstractC19060k) {
        this();
    }

    /* renamed from: a */
    public final InterfaceC25788a m132926a(int i11) {
        c cVar = new c(i11);
        ConcurrentHashMap concurrentHashMap = this.f122983a;
        Integer valueOf = Integer.valueOf(i11);
        Object obj = concurrentHashMap.get(valueOf);
        if (obj == null) {
            Object mo12V4 = cVar.mo12V4();
            Object putIfAbsent = concurrentHashMap.putIfAbsent(valueOf, mo12V4);
            if (putIfAbsent == null) {
                obj = mo12V4;
            } else {
                obj = putIfAbsent;
            }
        }
        AbstractC19074t.m100207e(obj, "getOrPut(...)");
        return (InterfaceC25788a) obj;
    }

    private C25789b() {
        this.f122983a = new ConcurrentHashMap();
    }
}
