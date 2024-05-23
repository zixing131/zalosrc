package com.zing.zalo.p077ui.maintab.me;

import com.zing.zalo.zinstant.C17244x0;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import p173fz.C19172a;

/* renamed from: com.zing.zalo.ui.maintab.me.b */
/* loaded from: classes5.dex */
public final class C12159b {

    /* renamed from: a */
    public static final C12159b f63441a = new C12159b();

    /* renamed from: b */
    private static Map f63442b = new LinkedHashMap();

    /* renamed from: c */
    private static boolean f63443c;

    /* renamed from: com.zing.zalo.ui.maintab.me.b$a */
    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: a */
        private int f63444a;

        /* renamed from: b */
        private boolean f63445b;

        /* renamed from: c */
        private C17244x0 f63446c;

        public a(JSONObject jSONObject, int i11) {
            this.f63444a = i11;
            if (jSONObject != null) {
                try {
                    this.f63446c = new C17244x0(53, jSONObject);
                } catch (Exception e11) {
                    AbstractC20110a.f98889a.mo104549b(e11);
                }
            }
        }

        /* renamed from: a */
        public final int m68000a() {
            return this.f63444a;
        }

        /* renamed from: b */
        public final C17244x0 m68001b() {
            return this.f63446c;
        }

        /* renamed from: c */
        public final boolean m68002c() {
            return this.f63445b;
        }

        /* renamed from: d */
        public final void m68003d(boolean z11) {
            this.f63445b = z11;
        }
    }

    /* renamed from: com.zing.zalo.ui.maintab.me.b$b */
    /* loaded from: classes5.dex */
    public static final class b {

        /* renamed from: a */
        private int f63447a;

        /* renamed from: b */
        private boolean f63448b;

        /* renamed from: c */
        private List f63449c = new ArrayList();

        /* renamed from: d */
        private List f63450d = new ArrayList();

        public b(JSONObject jSONObject) {
            this.f63448b = true;
            if (jSONObject != null) {
                this.f63447a = jSONObject.optInt("insertBellowItem", 0);
                this.f63448b = jSONObject.optInt("splitSection", 0) == 1;
                JSONArray optJSONArray = jSONObject.optJSONArray("itemOrder");
                if (optJSONArray != null) {
                    int length = optJSONArray.length();
                    for (int i11 = 0; i11 < length; i11++) {
                        this.f63450d.add(Integer.valueOf(optJSONArray.optInt(i11)));
                    }
                }
            }
        }

        /* renamed from: a */
        public final int m68004a() {
            return this.f63447a;
        }

        /* renamed from: b */
        public final List m68005b() {
            return this.f63450d;
        }

        /* renamed from: c */
        public final List m68006c() {
            return this.f63449c;
        }

        /* renamed from: d */
        public final boolean m68007d() {
            return this.f63448b;
        }
    }

    private C12159b() {
    }

    /* renamed from: a */
    public final void m67997a() {
        f63442b.clear();
        f63443c = false;
    }

    /* renamed from: b */
    public final Map m67998b() {
        return f63442b;
    }

    /* renamed from: c */
    public final void m67999c() {
        if (f63443c) {
            return;
        }
        try {
            JSONObject m100604o = C19172a.m100604o("features@tabme@dynamicZinstants", null, 2, null);
            JSONObject optJSONObject = m100604o.optJSONObject("sections");
            if (optJSONObject != null) {
                f63442b.clear();
                Iterator<String> keys = optJSONObject.keys();
                AbstractC19074t.m100207e(keys, "keys(...)");
                while (keys.hasNext()) {
                    JSONObject optJSONObject2 = optJSONObject.optJSONObject(keys.next());
                    if (optJSONObject2 != null && optJSONObject2.optInt("enable", 0) == 1) {
                        b bVar = new b(optJSONObject2);
                        f63442b.put(Integer.valueOf(bVar.m68004a()), bVar);
                    }
                }
                JSONObject optJSONObject3 = m100604o.optJSONObject("items");
                if (optJSONObject3 != null) {
                    AbstractC19074t.m100205c(optJSONObject3);
                    for (b bVar2 : f63442b.values()) {
                        int size = bVar2.m68005b().size();
                        for (int i11 = 0; i11 < size; i11++) {
                            JSONObject optJSONObject4 = optJSONObject3.optJSONObject(String.valueOf(((Number) bVar2.m68005b().get(i11)).intValue()));
                            if (optJSONObject4 != null && optJSONObject4.optInt("enable", 0) == 1) {
                                bVar2.m68006c().add(new a(optJSONObject4.optJSONObject("data"), ((Number) bVar2.m68005b().get(i11)).intValue()));
                            }
                        }
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        f63443c = true;
    }
}
