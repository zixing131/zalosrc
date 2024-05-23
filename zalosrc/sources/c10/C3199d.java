package c10;

import com.zing.zalo.shortvideo.data.utils.AbstractC9465b;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import kotlinx.serialization.json.JsonObject;

/* renamed from: c10.d */
/* loaded from: classes5.dex */
public final class C3199d {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final String f13689a;

    /* renamed from: c10.d$a */
    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: c10.d$a$a, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        static final class C32682a extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            public static final C32682a f13690q = new C32682a();

            C32682a() {
                super(1);
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C3199d mo205i9(JsonObject jsonObject) {
                AbstractC19074t.m100208f(jsonObject, "json");
                return new C3199d(AbstractC9465b.m51742w(jsonObject, new String[]{"hashtag"}, null, 2, null));
            }
        }

        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final InterfaceC18505l m16280a() {
            return C32682a.f13690q;
        }
    }

    public C3199d(String str) {
        AbstractC19074t.m100208f(str, "hashtag");
        this.f13689a = str;
    }

    /* renamed from: a */
    public final String m16279a() {
        return this.f13689a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3199d) && AbstractC19074t.m100204b(this.f13689a, ((C3199d) obj).f13689a);
    }

    public int hashCode() {
        return this.f13689a.hashCode();
    }

    public String toString() {
        return "CommonHashtag(hashtag=" + this.f13689a + ")";
    }
}
