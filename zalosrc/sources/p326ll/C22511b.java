package p326ll;

import f40.C18719a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import il.C20604a;
import org.json.JSONObject;
import p348mi.AbstractC23306f;

/* renamed from: ll.b */
/* loaded from: classes3.dex */
public final class C22511b {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final C20604a f110167a;

    /* renamed from: ll.b$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public C22511b(C20604a c20604a) {
        AbstractC19074t.m100208f(c20604a, "transferMsgRepo");
        this.f110167a = c20604a;
    }

    /* renamed from: a */
    public final void m116397a(JSONObject jSONObject) {
        AbstractC19074t.m100208f(jSONObject, "data");
        C18719a.m98712e("SMLTransferMsgPacketHandler", "Handle cmd PC request transfer: " + jSONObject, C18719a.a.f94035r);
        AbstractC23306f.m120585H1().m16686s(jSONObject, false);
    }
}
