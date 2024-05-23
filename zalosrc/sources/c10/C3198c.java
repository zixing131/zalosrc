package c10;

import com.zing.zalo.shortvideo.data.utils.AbstractC9465b;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import kotlinx.serialization.json.JsonObject;

/* renamed from: c10.c */
/* loaded from: classes5.dex */
public final class C3198c {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final String f13687a;

    /* renamed from: c10.c$a */
    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: c10.c$a$a, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        static final class C32681a extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            public static final C32681a f13688q = new C32681a();

            C32681a() {
                super(1);
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C3198c mo205i9(JsonObject jsonObject) {
                AbstractC19074t.m100208f(jsonObject, "json");
                return new C3198c(AbstractC9465b.m51742w(jsonObject, new String[]{"collection_id"}, null, 2, null));
            }
        }

        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final InterfaceC18505l m16277a() {
            return C32681a.f13688q;
        }
    }

    public C3198c(String str) {
        AbstractC19074t.m100208f(str, "collectionId");
        this.f13687a = str;
    }

    /* renamed from: a */
    public final String m16276a() {
        return this.f13687a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3198c) && AbstractC19074t.m100204b(this.f13687a, ((C3198c) obj).f13687a);
    }

    public int hashCode() {
        return this.f13687a.hashCode();
    }

    public String toString() {
        return "CommonCollection(collectionId=" + this.f13687a + ")";
    }
}
