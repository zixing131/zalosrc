package x80;

import fn0.AbstractC19074t;
import java.util.ArrayList;
import kw.C21955a;
import org.json.JSONObject;
import p205hc.AbstractC19962a;
import p205hc.InterfaceC19966e;
import p348mi.AbstractC23306f;
import pk.C24799c;

/* renamed from: x80.i0 */
/* loaded from: classes6.dex */
public final class C29492i0 extends AbstractC19962a implements InterfaceC19966e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29492i0(InterfaceC29490h0 interfaceC29490h0) {
        super(interfaceC29490h0);
        AbstractC19074t.m100208f(interfaceC29490h0, "mvpView");
    }

    /* renamed from: Ip */
    public void m146728Ip() {
        ((InterfaceC29490h0) m103742Dp()).mo70708CC();
    }

    /* renamed from: Jp */
    public void m146729Jp(C24799c c24799c, ArrayList arrayList, String str, JSONObject jSONObject, boolean z11) {
        AbstractC19074t.m100208f(c24799c, "collectionInfo");
        AbstractC19074t.m100208f(arrayList, "listMsgId");
        AbstractC19074t.m100208f(str, "entryPoint");
        AbstractC19074t.m100208f(jSONObject, "jsonObjectStatsMsgType");
        AbstractC23306f.m120602N0().m109073U(c24799c.m128824d(), arrayList, (byte) 0, c24799c.m128825e(), true, C21955a.f108070a.m114638e(str, jSONObject, c24799c.m128832l()), z11);
    }
}
