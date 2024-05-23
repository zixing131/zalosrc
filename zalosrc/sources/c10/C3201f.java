package c10;

import com.zing.zalo.shortvideo.data.utils.AbstractC9465b;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import kotlinx.serialization.json.JsonObject;

/* renamed from: c10.f */
/* loaded from: classes5.dex */
public final class C3201f {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final String f13693a;

    /* renamed from: c10.f$a */
    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: c10.f$a$a, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        static final class C32684a extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            public static final C32684a f13694q = new C32684a();

            C32684a() {
                super(1);
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C3201f mo205i9(JsonObject jsonObject) {
                AbstractC19074t.m100208f(jsonObject, "json");
                return new C3201f(AbstractC9465b.m51742w(jsonObject, new String[]{"live_id"}, null, 2, null));
            }
        }

        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final InterfaceC18505l m16286a() {
            return C32684a.f13694q;
        }
    }

    public C3201f(String str) {
        AbstractC19074t.m100208f(str, "liveId");
        this.f13693a = str;
    }

    /* renamed from: a */
    public final String m16285a() {
        return this.f13693a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3201f) && AbstractC19074t.m100204b(this.f13693a, ((C3201f) obj).f13693a);
    }

    public int hashCode() {
        return this.f13693a.hashCode();
    }

    public String toString() {
        return "CommonLivestream(liveId=" + this.f13693a + ")";
    }
}
