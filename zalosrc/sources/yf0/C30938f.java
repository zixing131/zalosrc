package yf0;

import ae.C0766k;
import am.C0927o;
import android.content.Context;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lv.InterfaceC22656d;
import org.json.JSONObject;
import p140ev.C18614c;
import qm0.AbstractC25366r;

/* renamed from: yf0.f */
/* loaded from: classes5.dex */
public class C30938f {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private static C30938f f142807a;

    /* renamed from: yf0.f$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final synchronized C30938f m150466a() {
            C30938f c30938f;
            try {
                if (C30938f.f142807a == null) {
                    C30938f.f142807a = new C30938f();
                }
                c30938f = C30938f.f142807a;
                AbstractC19074t.m100205c(c30938f);
            } catch (Throwable th2) {
                throw th2;
            }
            return c30938f;
        }
    }

    /* renamed from: yf0.f$b */
    /* loaded from: classes5.dex */
    public static final class b implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ InterfaceC22656d f142808a;

        b(InterfaceC22656d interfaceC22656d) {
            this.f142808a = interfaceC22656d;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "errorMessage");
            InterfaceC22656d interfaceC22656d = this.f142808a;
            if (interfaceC22656d != null) {
                interfaceC22656d.mo117237b(c20096c);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, "data");
            JSONObject jSONObject = new JSONObject(obj.toString());
            InterfaceC22656d interfaceC22656d = this.f142808a;
            if (interfaceC22656d != null) {
                interfaceC22656d.mo117236a(jSONObject);
            }
        }
    }

    /* renamed from: yf0.f$c */
    /* loaded from: classes5.dex */
    public static final class c implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ Context f142809a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f142810b;

        /* renamed from: c */
        final /* synthetic */ InterfaceC22656d f142811c;

        c(Context context, ArrayList arrayList, InterfaceC22656d interfaceC22656d) {
            this.f142809a = context;
            this.f142810b = arrayList;
            this.f142811c = interfaceC22656d;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "errorMessage");
            InterfaceC22656d interfaceC22656d = this.f142811c;
            if (interfaceC22656d != null) {
                interfaceC22656d.mo117237b(c20096c);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, C0927o.f3427r);
            try {
                JSONObject jSONObject = new JSONObject(obj.toString()).getJSONObject("data");
                C30930b m150239a = C30930b.Companion.m150239a();
                Context context = this.f142809a;
                ArrayList arrayList = this.f142810b;
                AbstractC19074t.m100205c(jSONObject);
                m150239a.m150236g(context, arrayList, jSONObject);
                InterfaceC22656d interfaceC22656d = this.f142811c;
                if (interfaceC22656d != null) {
                    interfaceC22656d.mo117236a(jSONObject);
                }
            } catch (Exception unused) {
                mo926a(new C20096c(-1, "Jump Failed"));
            }
        }
    }

    /* renamed from: e */
    private final void m150462e(Context context, List list, boolean z11, boolean z12, InterfaceC22656d interfaceC22656d) {
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject = new JSONObject();
        if (z12) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C18614c c18614c = (C18614c) it.next();
                JSONObject m150235c = C30930b.Companion.m150239a().m150235c(context, c18614c.m98361l(), c18614c.m98360k());
                if (m150235c != null) {
                    jSONObject.put(String.valueOf(c18614c.m98357h()), m150235c);
                } else {
                    arrayList.add(c18614c);
                }
            }
        } else {
            arrayList.addAll(list);
        }
        if (jSONObject.length() > 0 && interfaceC22656d != null) {
            interfaceC22656d.mo117236a(jSONObject);
        }
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new c(context, arrayList, interfaceC22656d));
        if (!arrayList.isEmpty()) {
            if (z11) {
                c0766k.mo1744t8(arrayList);
            } else {
                c0766k.mo1502O8(arrayList);
            }
        }
    }

    /* renamed from: c */
    public final void m150463c(Context context, C18614c c18614c, boolean z11, InterfaceC22656d interfaceC22656d) {
        List m131496e;
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(c18614c, "jumpRequest");
        m131496e = AbstractC25366r.m131496e(c18614c);
        m150462e(context, m131496e, false, z11, interfaceC22656d);
    }

    /* renamed from: d */
    public final void m150464d(C18614c c18614c, InterfaceC22656d interfaceC22656d) {
        AbstractC19074t.m100208f(c18614c, "jumpInput");
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new b(interfaceC22656d));
        c0766k.mo1559V9(c18614c);
    }

    /* renamed from: f */
    public final void m150465f(Context context, C18614c c18614c, InterfaceC22656d interfaceC22656d) {
        List m131496e;
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(c18614c, "jumpInput");
        m131496e = AbstractC25366r.m131496e(c18614c);
        m150462e(context, m131496e, true, true, interfaceC22656d);
    }
}
