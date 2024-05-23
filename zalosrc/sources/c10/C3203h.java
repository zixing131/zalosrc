package c10;

import com.zing.zalo.shortvideo.data.utils.AbstractC9465b;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import kotlinx.serialization.json.JsonObject;

/* renamed from: c10.h */
/* loaded from: classes5.dex */
public final class C3203h {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final String f13697a;

    /* renamed from: c10.h$a */
    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: c10.h$a$a, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        static final class C32686a extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            public static final C32686a f13698q = new C32686a();

            C32686a() {
                super(1);
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C3203h mo205i9(JsonObject jsonObject) {
                AbstractC19074t.m100208f(jsonObject, "json");
                return new C3203h(AbstractC9465b.m51742w(jsonObject, new String[]{"keyword"}, null, 2, null));
            }
        }

        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final InterfaceC18505l m16292a() {
            return C32686a.f13698q;
        }
    }

    public C3203h(String str) {
        AbstractC19074t.m100208f(str, "keyword");
        this.f13697a = str;
    }

    /* renamed from: a */
    public final String m16291a() {
        return this.f13697a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3203h) && AbstractC19074t.m100204b(this.f13697a, ((C3203h) obj).f13697a);
    }

    public int hashCode() {
        return this.f13697a.hashCode();
    }

    public String toString() {
        return "CommonSearch(keyword=" + this.f13697a + ")";
    }
}
