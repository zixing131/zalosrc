package p690yq;

import bo.C3020p0;
import bo.C3039t0;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import org.json.JSONObject;
import p185gc.AbstractC19383g;
import p509sp.C26359h;
import p509sp.InterfaceC26357f;
import p654xq.C30196f;
import p654xq.InterfaceC30193c;

/* renamed from: yq.b */
/* loaded from: classes4.dex */
public final class C31050b extends AbstractC19383g {

    /* renamed from: a */
    private final InterfaceC30193c f143172a;

    /* renamed from: b */
    private final InterfaceC26357f f143173b;

    /* renamed from: yq.b$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a */
        private final C3020p0 f143174a;

        public a(C3020p0 c3020p0) {
            AbstractC19074t.m100208f(c3020p0, "feedItem");
            this.f143174a = c3020p0;
        }

        /* renamed from: a */
        public final C3020p0 m150885a() {
            return this.f143174a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && AbstractC19074t.m100204b(this.f143174a, ((a) obj).f143174a);
        }

        public int hashCode() {
            return this.f143174a.hashCode();
        }

        public String toString() {
            return "Params(feedItem=" + this.f143174a + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: yq.b$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ a f143175q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(a aVar) {
            super(0);
            this.f143175q = aVar;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo12V4() {
            JSONObject jSONObject;
            String str = this.f143175q.m150885a().f12057p;
            C3039t0 c3039t0 = this.f143175q.m150885a().f12025E;
            if (c3039t0 != null) {
                jSONObject = c3039t0.m14614a();
            } else {
                jSONObject = null;
            }
            return "Start execute use case - feed id: " + str + " - footer: " + jSONObject;
        }
    }

    public C31050b() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19383g
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo12006b(a aVar) {
        AbstractC19074t.m100208f(aVar, "params");
        this.f143173b.mo135685a("REAL_TIME_LIKE_COMMENT", "USE_CASE_UPDATE_CACHED_REAL_TIME_LIKE_COMMENT_INFO", new b(aVar));
        this.f143172a.mo148866a(aVar.m150885a());
    }

    public /* synthetic */ C31050b(InterfaceC30193c interfaceC30193c, InterfaceC26357f interfaceC26357f, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? C30196f.a.m148915c(C30196f.Companion, null, null, null, null, null, 31, null) : interfaceC30193c, (i11 & 2) != 0 ? C26359h.f125209a : interfaceC26357f);
    }

    public C31050b(InterfaceC30193c interfaceC30193c, InterfaceC26357f interfaceC26357f) {
        AbstractC19074t.m100208f(interfaceC30193c, "repository");
        AbstractC19074t.m100208f(interfaceC26357f, "logFlow");
        this.f143172a = interfaceC30193c;
        this.f143173b = interfaceC26357f;
    }
}
