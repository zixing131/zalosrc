package c10;

import com.zing.zalo.shortvideo.data.model.Channel;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import kotlinx.serialization.json.JsonObject;

/* renamed from: c10.b */
/* loaded from: classes5.dex */
public final class C3197b {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final Channel f13685a;

    /* renamed from: c10.b$a */
    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: c10.b$a$a, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        static final class C32680a extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            public static final C32680a f13686q = new C32680a();

            C32680a() {
                super(1);
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C3197b mo205i9(JsonObject jsonObject) {
                AbstractC19074t.m100208f(jsonObject, "json");
                return new C3197b(Channel.C9382b.Companion.m50798a(jsonObject));
            }
        }

        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final InterfaceC18505l m16274a() {
            return C32680a.f13686q;
        }
    }

    public C3197b(Channel channel) {
        AbstractC19074t.m100208f(channel, "channel");
        this.f13685a = channel;
    }

    /* renamed from: a */
    public final Channel m16273a() {
        return this.f13685a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3197b) && AbstractC19074t.m100204b(this.f13685a, ((C3197b) obj).f13685a);
    }

    public int hashCode() {
        return this.f13685a.hashCode();
    }

    public String toString() {
        return "CommonChannel(channel=" + this.f13685a + ")";
    }
}
