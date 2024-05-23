package c10;

import com.zing.zalo.shortvideo.data.utils.AbstractC9465b;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import kotlinx.serialization.json.JsonObject;

/* renamed from: c10.e */
/* loaded from: classes5.dex */
public final class C3200e {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final String f13691a;

    /* renamed from: c10.e$a */
    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: c10.e$a$a, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        static final class C32683a extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            public static final C32683a f13692q = new C32683a();

            C32683a() {
                super(1);
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C3200e mo205i9(JsonObject jsonObject) {
                AbstractC19074t.m100208f(jsonObject, "json");
                return new C3200e(AbstractC9465b.m51742w(jsonObject, new String[]{ZMediaPlayer.OnNativeInvokeListener.ARG_URL}, null, 2, null));
            }
        }

        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final InterfaceC18505l m16283a() {
            return C32683a.f13692q;
        }
    }

    public C3200e(String str) {
        AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        this.f13691a = str;
    }

    /* renamed from: a */
    public final String m16282a() {
        return this.f13691a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3200e) && AbstractC19074t.m100204b(this.f13691a, ((C3200e) obj).f13691a);
    }

    public int hashCode() {
        return this.f13691a.hashCode();
    }

    public String toString() {
        return "CommonLink(url=" + this.f13691a + ")";
    }
}
