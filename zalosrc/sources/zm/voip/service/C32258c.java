package zm.voip.service;

import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import ho0.AbstractC20110a;
import me0.AbstractC23104j;
import org.json.JSONObject;
import p097db.C17844c;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* renamed from: zm.voip.service.c */
/* loaded from: classes7.dex */
public final class C32258c {

    /* renamed from: a */
    public static final C32258c f148854a = new C32258c();

    /* renamed from: b */
    private static final InterfaceC24854k f148855b;

    /* renamed from: zm.voip.service.c$a */
    /* loaded from: classes7.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f148856q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C17844c mo12V4() {
            return new C17844c();
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(a.f148856q);
        f148855b = m129210a;
    }

    private C32258c() {
    }

    /* renamed from: a */
    private final C17844c m155743a() {
        return (C17844c) f148855b.getValue();
    }

    /* renamed from: b */
    public static final String m155744b(String str) {
        if (str == null) {
            return "";
        }
        try {
            if (str.length() == 0) {
                return "";
            }
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObject2 = new JSONObject();
            if (jSONObject.optInt("battery") == 1) {
                jSONObject2.put("battery", BatteryInfoHelper.f148742a.m155523d());
            }
            if (jSONObject.optInt("temperature") == 1) {
                jSONObject2.put("temperature", C32354v.m156385b());
            }
            if (jSONObject.optInt("cpu") == 1) {
                C32258c c32258c = f148854a;
                if (c32258c.m155745c()) {
                    c32258c.m155743a().m94220g();
                    jSONObject2.put("cpuDevice", c32258c.m155743a().m94218a());
                    jSONObject2.put("cpuApp", c32258c.m155743a().m94219b());
                } else {
                    jSONObject2.put("cpuDevice", 0);
                    jSONObject2.put("cpuApp", 0);
                }
            }
            String jSONObject3 = jSONObject2.toString();
            AbstractC19074t.m100207e(jSONObject3, "toString(...)");
            return jSONObject3;
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
            return "";
        }
    }

    /* renamed from: c */
    private final boolean m155745c() {
        return !AbstractC23104j.m118480b(26);
    }
}
