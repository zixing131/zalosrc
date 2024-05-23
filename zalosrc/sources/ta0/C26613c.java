package ta0;

import ag0.C0815e1;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import hu.C20128b;
import java.util.concurrent.TimeUnit;
import k30.C21459a;
import nh0.InterfaceC23792b;
import org.json.JSONObject;
import p348mi.AbstractC23306f;
import p361nb.C23648e;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* renamed from: ta0.c */
/* loaded from: classes6.dex */
public final class C26613c {

    /* renamed from: a */
    public static final C26613c f126018a = new C26613c();

    /* renamed from: b */
    private static final InterfaceC24854k f126019b;

    /* renamed from: c */
    private static final InterfaceC24854k f126020c;

    /* renamed from: ta0.c$a */
    /* loaded from: classes6.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f126021q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC23792b mo12V4() {
            return AbstractC23306f.m120579F1();
        }
    }

    /* renamed from: ta0.c$b */
    /* loaded from: classes6.dex */
    static final class b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final b f126022q = new b();

        b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0815e1 mo12V4() {
            return C0815e1.m2075D();
        }
    }

    static {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        m129210a = AbstractC24856m.m129210a(a.f126021q);
        f126019b = m129210a;
        m129210a2 = AbstractC24856m.m129210a(b.f126022q);
        f126020c = m129210a2;
    }

    private C26613c() {
    }

    /* renamed from: a */
    private final InterfaceC23792b m136635a() {
        return (InterfaceC23792b) f126019b.getValue();
    }

    /* renamed from: b */
    private final C0815e1 m136636b() {
        return (C0815e1) f126020c.getValue();
    }

    /* renamed from: c */
    public final void m136637c(String str, String str2, int i11) {
        AbstractC19074t.m100208f(str, "entryPoint");
        AbstractC19074t.m100208f(str2, "actionId");
        String jSONObject = new JSONObject().put("free_storage", i11).toString();
        AbstractC19074t.m100207e(jSONObject, "toString(...)");
        m136636b().m2100V(new C23648e(52, str, 0, str2, jSONObject), false);
    }

    /* renamed from: d */
    public final void m136638d(String str, int i11) {
        AbstractC19074t.m100208f(str, "screenId");
        String jSONObject = new JSONObject().put("free_storage", i11).toString();
        AbstractC19074t.m100207e(jSONObject, "toString(...)");
        m136636b().m2100V(new C23648e(52, "", 1, str, jSONObject), false);
    }

    /* renamed from: e */
    public final void m136639e() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("fs_warning", C21459a.m111034b(C20128b.m104764k()));
        String jSONObject2 = jSONObject.toString();
        AbstractC19074t.m100207e(jSONObject2, "toString(...)");
        m136636b().m2100V(new C23648e(52, "", 1, "storage_warning_begin", jSONObject2), false);
    }

    /* renamed from: f */
    public final void m136640f(long j11, int i11) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("fs_warning", i11);
        jSONObject.put("fs_current", C21459a.m111034b(C20128b.m104764k()));
        jSONObject.put("delta_day", TimeUnit.MILLISECONDS.toDays(f126018a.m136635a().mo124314i() - j11));
        String jSONObject2 = jSONObject.toString();
        AbstractC19074t.m100207e(jSONObject2, "toString(...)");
        m136636b().m2100V(new C23648e(52, "", 1, "storage_warning_end", jSONObject2), false);
    }
}
