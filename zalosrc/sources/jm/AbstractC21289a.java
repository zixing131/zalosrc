package jm;

import am.AbstractC0924m0;
import com.zing.zalocore.CoreUtility;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import hu.C20128b;
import java.util.concurrent.atomic.AtomicBoolean;
import mm0.AbstractC23350e;
import org.json.JSONObject;
import p173fz.C19172a;
import p405ov.C24561c;

/* renamed from: jm.a */
/* loaded from: classes.dex */
public abstract class AbstractC21289a {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private static AtomicBoolean f103726a = new AtomicBoolean(false);

    /* renamed from: jm.a$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final int m110247a() {
            return C19172a.m100601l("device_classification@class_value", 0, 2, null);
        }

        /* renamed from: b */
        public final AtomicBoolean m110248b() {
            return AbstractC21289a.f103726a;
        }

        /* renamed from: c */
        public final boolean m110249c() {
            return AbstractC0924m0.m4285vb();
        }

        /* renamed from: d */
        public final void m110250d() {
            C24561c.m127942b("CurrentDevice", "Mark [" + C20128b.m104768o() + "] of user " + CoreUtility.f89233i + " as OLD device");
            AbstractC0924m0.m4295vl(false);
        }

        /* renamed from: e */
        public final void m110251e(JSONObject jSONObject) {
            AbstractC19074t.m100208f(jSONObject, "data");
            try {
                if (jSONObject.has("new_device")) {
                    boolean z11 = false;
                    int optInt = jSONObject.optInt("new_device", 0);
                    C24561c.m127942b("CurrentDevice", "parseDeviceConfig(): newDevice=" + optInt);
                    if (optInt == 1) {
                        z11 = true;
                    }
                    AbstractC0924m0.m4295vl(z11);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("CurrentDevice", e11);
            }
        }
    }

    /* renamed from: b */
    public static final int m110245b() {
        return Companion.m110247a();
    }

    /* renamed from: c */
    public static final void m110246c(JSONObject jSONObject) {
        Companion.m110251e(jSONObject);
    }
}
