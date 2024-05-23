package p590vy;

import android.os.Bundle;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import p205hc.InterfaceC19969h;

/* renamed from: vy.a */
/* loaded from: classes4.dex */
public final class C28672a implements InterfaceC19969h {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final String f133084a;

    /* renamed from: b */
    private final String f133085b;

    /* renamed from: vy.a$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C28672a m143585a(Bundle bundle) {
            if (bundle != null) {
                String string = bundle.getString("CONVERSATION_ID", "");
                String string2 = bundle.getString("zinstant_api_info", "");
                AbstractC19074t.m100205c(string);
                AbstractC19074t.m100205c(string2);
                return new C28672a(string, string2);
            }
            return null;
        }
    }

    public C28672a(String str, String str2) {
        AbstractC19074t.m100208f(str, "ownerId");
        AbstractC19074t.m100208f(str2, "jsonZinstantApiInfo");
        this.f133084a = str;
        this.f133085b = str2;
    }

    /* renamed from: a */
    public final String m143583a() {
        return this.f133085b;
    }

    /* renamed from: b */
    public final String m143584b() {
        return this.f133084a;
    }
}
