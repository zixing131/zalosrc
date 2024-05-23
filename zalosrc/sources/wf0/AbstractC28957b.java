package wf0;

import android.net.wifi.WifiConfiguration;
import android.text.TextUtils;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import wf0.AbstractC28957b;

/* renamed from: wf0.b */
/* loaded from: classes5.dex */
public abstract class AbstractC28957b {
    public static final a Companion = new a(null);

    /* renamed from: wf0.b$a */
    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: wf0.b$a$a, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        static final class C33023a extends AbstractC19075u implements InterfaceC18509p {

            /* renamed from: q */
            public static final C33023a f134042q = new C33023a();

            C33023a() {
                super(2);
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Integer mo240pC(WifiConfiguration wifiConfiguration, WifiConfiguration wifiConfiguration2) {
                AbstractC19074t.m100208f(wifiConfiguration, "o1");
                AbstractC19074t.m100208f(wifiConfiguration2, "o2");
                return Integer.valueOf(wifiConfiguration.priority - wifiConfiguration2.priority);
            }
        }

        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public static final int m144621e(InterfaceC18509p interfaceC18509p, Object obj, Object obj2) {
            AbstractC19074t.m100208f(interfaceC18509p, "$tmp0");
            return ((Number) interfaceC18509p.mo240pC(obj, obj2)).intValue();
        }

        /* renamed from: b */
        public final String m144622b(String str) {
            AbstractC19074t.m100208f(str, "ssid");
            if (TextUtils.isEmpty(str)) {
                return "";
            }
            int length = str.length() - 1;
            if (length >= 0) {
                if (str.charAt(0) != '\"' || str.charAt(length) != '\"') {
                    return "\"" + str + "\"";
                }
                return str;
            }
            return str;
        }

        /* renamed from: c */
        public final String m144623c(WifiConfiguration wifiConfiguration) {
            AbstractC19074t.m100208f(wifiConfiguration, "config");
            ArrayList arrayList = new ArrayList();
            String str = "open";
            if (wifiConfiguration.allowedKeyManagement.get(0)) {
                if (wifiConfiguration.wepKeys[0] != null) {
                    str = "WEP";
                }
                arrayList.add(str);
            }
            if (wifiConfiguration.allowedKeyManagement.get(2) || wifiConfiguration.allowedKeyManagement.get(3)) {
                str = "EAP";
                arrayList.add("EAP");
            }
            if (wifiConfiguration.allowedKeyManagement.get(1)) {
                arrayList.add("PSK");
                return "PSK";
            }
            return str;
        }

        /* renamed from: d */
        public final void m144624d(List list) {
            AbstractC19074t.m100208f(list, "configurations");
            final C33023a c33023a = C33023a.f134042q;
            Collections.sort(list, new Comparator() { // from class: wf0.a
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int m144621e;
                    m144621e = AbstractC28957b.a.m144621e(InterfaceC18509p.this, obj, obj2);
                    return m144621e;
                }
            });
        }
    }
}
