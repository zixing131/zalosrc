package c10;

import com.zing.zalo.shortvideo.data.utils.AbstractC9465b;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import kotlinx.serialization.json.JsonObject;

/* renamed from: c10.g */
/* loaded from: classes5.dex */
public final class C3202g {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final String f13695a;

    /* renamed from: c10.g$a */
    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: c10.g$a$a, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        static final class C32685a extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            public static final C32685a f13696q = new C32685a();

            C32685a() {
                super(1);
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C3202g mo205i9(JsonObject jsonObject) {
                AbstractC19074t.m100208f(jsonObject, "json");
                return new C3202g(AbstractC9465b.m51742w(jsonObject, new String[]{"location_data"}, null, 2, null));
            }
        }

        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final InterfaceC18505l m16289a() {
            return C32685a.f13696q;
        }
    }

    public C3202g(String str) {
        AbstractC19074t.m100208f(str, ZVideoUtilMetadata.ZMETADATA_KEY_LOCATION);
        this.f13695a = str;
    }

    /* renamed from: a */
    public final String m16288a() {
        return this.f13695a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3202g) && AbstractC19074t.m100204b(this.f13695a, ((C3202g) obj).f13695a);
    }

    public int hashCode() {
        return this.f13695a.hashCode();
    }

    public String toString() {
        return "CommonLocation(location=" + this.f13695a + ")";
    }
}
