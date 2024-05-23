package com.zing.zalo.p077ui.mycloud.collection;

import android.os.Bundle;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import mm0.AbstractC23350e;
import org.json.JSONObject;
import p205hc.InterfaceC19969h;

/* renamed from: com.zing.zalo.ui.mycloud.collection.f */
/* loaded from: classes6.dex */
public final class C12559f implements InterfaceC19969h {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private String f65571a = "";

    /* renamed from: b */
    private String f65572b = "";

    /* renamed from: c */
    private ArrayList f65573c = new ArrayList();

    /* renamed from: d */
    private JSONObject f65574d = new JSONObject();

    /* renamed from: e */
    private boolean f65575e;

    /* renamed from: com.zing.zalo.ui.mycloud.collection.f$a */
    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C12559f m70758a(Bundle bundle) {
            C12559f c12559f = new C12559f();
            if (bundle != null) {
                ArrayList parcelableArrayList = bundle.getParcelableArrayList("listMsgId");
                if (parcelableArrayList != null) {
                    c12559f.m70753e().clear();
                    c12559f.m70753e().addAll(parcelableArrayList);
                }
                String string = bundle.getString("entryPoint", "");
                AbstractC19074t.m100207e(string, "getString(...)");
                c12559f.m70754f(string);
                String string2 = bundle.getString("jsDataLog", "");
                AbstractC19074t.m100207e(string2, "getString(...)");
                c12559f.m70756h(string2);
                c12559f.m70755g(bundle.getBoolean("forceShowIcon", false));
                try {
                    if (c12559f.m70751c().length() > 0) {
                        JSONObject jSONObject = new JSONObject(c12559f.m70751c());
                        if (jSONObject.has("mt")) {
                            JSONObject jSONObject2 = jSONObject.getJSONObject("mt");
                            AbstractC19074t.m100207e(jSONObject2, "getJSONObject(...)");
                            c12559f.m70757i(jSONObject2);
                        }
                    }
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                }
            }
            return c12559f;
        }
    }

    /* renamed from: a */
    public final String m70749a() {
        return this.f65571a;
    }

    /* renamed from: b */
    public final boolean m70750b() {
        return this.f65575e;
    }

    /* renamed from: c */
    public final String m70751c() {
        return this.f65572b;
    }

    /* renamed from: d */
    public final JSONObject m70752d() {
        return this.f65574d;
    }

    /* renamed from: e */
    public final ArrayList m70753e() {
        return this.f65573c;
    }

    /* renamed from: f */
    public final void m70754f(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f65571a = str;
    }

    /* renamed from: g */
    public final void m70755g(boolean z11) {
        this.f65575e = z11;
    }

    /* renamed from: h */
    public final void m70756h(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f65572b = str;
    }

    /* renamed from: i */
    public final void m70757i(JSONObject jSONObject) {
        AbstractC19074t.m100208f(jSONObject, "<set-?>");
        this.f65574d = jSONObject;
    }
}
