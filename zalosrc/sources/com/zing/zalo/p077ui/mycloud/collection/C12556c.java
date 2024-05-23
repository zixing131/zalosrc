package com.zing.zalo.p077ui.mycloud.collection;

import android.os.Bundle;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import mm0.AbstractC23350e;
import org.json.JSONObject;
import p205hc.InterfaceC19969h;

/* renamed from: com.zing.zalo.ui.mycloud.collection.c */
/* loaded from: classes6.dex */
public final class C12556c implements InterfaceC19969h {
    public static final a Companion = new a(null);

    /* renamed from: b */
    private int f65563b;

    /* renamed from: c */
    private long f65564c;

    /* renamed from: d */
    private boolean f65565d;

    /* renamed from: g */
    private boolean f65568g;

    /* renamed from: a */
    private String f65562a = "";

    /* renamed from: e */
    private ArrayList f65566e = new ArrayList();

    /* renamed from: f */
    private JSONObject f65567f = new JSONObject();

    /* renamed from: com.zing.zalo.ui.mycloud.collection.c$a */
    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C12556c m70735a(Bundle bundle) {
            C12556c c12556c = new C12556c();
            if (bundle != null) {
                String string = bundle.getString("entryPoint", "");
                AbstractC19074t.m100207e(string, "getString(...)");
                c12556c.m70730i(string);
                c12556c.m70734m(bundle.getInt("viewMode", 0));
                c12556c.m70729h(bundle.getLong("collectionId", 0L));
                c12556c.m70733l(bundle.getBoolean("startCollectionDetail", false));
                c12556c.m70731j(bundle.getBoolean("forceShowIcon", false));
                ArrayList parcelableArrayList = bundle.getParcelableArrayList("listMsgId");
                if (parcelableArrayList != null) {
                    c12556c.m70726e().clear();
                    c12556c.m70726e().addAll(parcelableArrayList);
                }
                String string2 = bundle.getString("statsMsgType", "");
                AbstractC19074t.m100205c(string2);
                if (string2.length() > 0) {
                    try {
                        JSONObject jSONObject = new JSONObject(string2);
                        if (jSONObject.has("mt")) {
                            JSONObject jSONObject2 = jSONObject.getJSONObject("mt");
                            AbstractC19074t.m100207e(jSONObject2, "getJSONObject(...)");
                            c12556c.m70732k(jSONObject2);
                        }
                    } catch (Exception e11) {
                        AbstractC23350e.m122778h(e11);
                    }
                }
            }
            return c12556c;
        }
    }

    /* renamed from: a */
    public final long m70722a() {
        return this.f65564c;
    }

    /* renamed from: b */
    public final String m70723b() {
        return this.f65562a;
    }

    /* renamed from: c */
    public final boolean m70724c() {
        return this.f65568g;
    }

    /* renamed from: d */
    public final JSONObject m70725d() {
        return this.f65567f;
    }

    /* renamed from: e */
    public final ArrayList m70726e() {
        return this.f65566e;
    }

    /* renamed from: f */
    public final int m70727f() {
        return this.f65563b;
    }

    /* renamed from: g */
    public final boolean m70728g() {
        return this.f65565d;
    }

    /* renamed from: h */
    public final void m70729h(long j11) {
        this.f65564c = j11;
    }

    /* renamed from: i */
    public final void m70730i(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f65562a = str;
    }

    /* renamed from: j */
    public final void m70731j(boolean z11) {
        this.f65568g = z11;
    }

    /* renamed from: k */
    public final void m70732k(JSONObject jSONObject) {
        AbstractC19074t.m100208f(jSONObject, "<set-?>");
        this.f65567f = jSONObject;
    }

    /* renamed from: l */
    public final void m70733l(boolean z11) {
        this.f65565d = z11;
    }

    /* renamed from: m */
    public final void m70734m(int i11) {
        this.f65563b = i11;
    }
}
