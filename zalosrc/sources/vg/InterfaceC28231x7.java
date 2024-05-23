package vg;

import fn0.AbstractC19074t;
import on0.AbstractC24342w;
import org.json.JSONObject;

/* renamed from: vg.x7 */
/* loaded from: classes3.dex */
public interface InterfaceC28231x7 {
    public static final a Companion = a.f131652a;

    /* renamed from: vg.x7$a */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a */
        static final /* synthetic */ a f131652a = new a();

        private a() {
        }

        /* renamed from: a */
        public final InterfaceC28231x7 m142189a(String str, JSONObject jSONObject) {
            int m127173b0;
            int m127173b02;
            int m127173b03;
            AbstractC19074t.m100208f(str, "tipCat");
            AbstractC19074t.m100208f(jSONObject, "jsonObject");
            m127173b0 = AbstractC24342w.m127173b0(str, "tip.tabme.new_feature", 0, false, 6, null);
            if (m127173b0 < 0) {
                m127173b02 = AbstractC24342w.m127173b0(str, "tip.tabme.critical_issue", 0, false, 6, null);
                if (m127173b02 < 0) {
                    m127173b03 = AbstractC24342w.m127173b0(str, "tip.attachment.promotetool", 0, false, 6, null);
                    if (m127173b03 >= 0) {
                        return new C28240y7().m142214e(jSONObject);
                    }
                    return null;
                }
            }
            return new C28035c8().m141477f(jSONObject);
        }
    }

    /* renamed from: a */
    JSONObject mo141472a();
}
