package p055ce;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;
import p348mi.AbstractC23309i;

/* renamed from: ce.l */
/* loaded from: classes3.dex */
public final class C3443l {
    public static final c Companion = new c(null);

    /* renamed from: a */
    private final h f14461a = new h();

    /* renamed from: b */
    private final a f14462b = new a();

    /* renamed from: c */
    private final g f14463c = new g();

    /* renamed from: d */
    private final b f14464d = new b();

    /* renamed from: e */
    private final e f14465e = new e();

    /* renamed from: f */
    private final f f14466f = new f();

    /* renamed from: g */
    private final i f14467g = new i();

    /* renamed from: h */
    private final d f14468h = new d();

    /* renamed from: ce.l$a */
    /* loaded from: classes3.dex */
    public static final class a {
        public static final C32692a Companion = new C32692a(null);

        /* renamed from: a */
        private int f14469a;

        /* renamed from: b */
        private final HashMap f14470b = new HashMap();

        /* renamed from: c */
        private final HashMap f14471c = new HashMap();

        /* renamed from: d */
        private final HashMap f14472d = new HashMap();

        /* renamed from: ce.l$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C32692a {
            private C32692a() {
            }

            public /* synthetic */ C32692a(AbstractC19060k abstractC19060k) {
                this();
            }
        }

        /* renamed from: a */
        public final boolean m17312a(int i11) {
            Integer num = (Integer) this.f14470b.get(String.valueOf(i11));
            if (num == null) {
                num = 0;
            }
            if (num.intValue() < 1) {
                return false;
            }
            return true;
        }

        /* renamed from: b */
        public final int m17313b(int i11) {
            Integer num = (Integer) this.f14472d.get(String.valueOf(i11));
            if (num == null) {
                return 0;
            }
            return num.intValue();
        }

        /* renamed from: c */
        public final int m17314c(int i11) {
            Integer num = (Integer) this.f14471c.get(String.valueOf(i11));
            if (num == null) {
                return 0;
            }
            return num.intValue();
        }

        /* renamed from: d */
        public final void m17315d(JSONObject jSONObject) {
            AbstractC19074t.m100208f(jSONObject, "jsonObject");
            try {
                this.f14469a = jSONObject.optInt("fea_id");
                JSONObject optJSONObject = jSONObject.optJSONObject("enable");
                if (optJSONObject != null) {
                    AbstractC3444m.m17339b(this.f14470b, optJSONObject);
                }
                JSONObject optJSONObject2 = jSONObject.optJSONObject("config");
                if (optJSONObject2 != null) {
                    JSONObject optJSONObject3 = optJSONObject2.optJSONObject("limit_template_create");
                    if (optJSONObject3 != null) {
                        AbstractC3444m.m17339b(this.f14471c, optJSONObject3);
                    }
                    JSONObject optJSONObject4 = optJSONObject2.optJSONObject("limit_template_active");
                    if (optJSONObject4 != null) {
                        AbstractC3444m.m17339b(this.f14472d, optJSONObject4);
                    }
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
    }

    /* renamed from: ce.l$b */
    /* loaded from: classes3.dex */
    public static final class b {
        public static final a Companion = new a(null);

        /* renamed from: a */
        private final HashMap f14473a = new HashMap();

        /* renamed from: ce.l$b$a */
        /* loaded from: classes3.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC19060k abstractC19060k) {
                this();
            }
        }

        /* renamed from: a */
        public final boolean m17316a(int i11) {
            Integer num = (Integer) this.f14473a.get(String.valueOf(i11));
            if (num == null) {
                num = 0;
            }
            if (num.intValue() < 1) {
                return false;
            }
            return true;
        }

        /* renamed from: b */
        public final void m17317b(JSONObject jSONObject) {
            JSONObject optJSONObject;
            AbstractC19074t.m100208f(jSONObject, "jsonObject");
            try {
                JSONObject optJSONObject2 = jSONObject.optJSONObject("config");
                if (optJSONObject2 != null && (optJSONObject = optJSONObject2.optJSONObject("unbox_stranger_thread")) != null) {
                    AbstractC3444m.m17339b(this.f14473a, optJSONObject);
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
    }

    /* renamed from: ce.l$c */
    /* loaded from: classes3.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: ce.l$d */
    /* loaded from: classes3.dex */
    public static final class d {
        public static final a Companion = new a(null);

        /* renamed from: a */
        private final HashMap f14474a = new HashMap();

        /* renamed from: ce.l$d$a */
        /* loaded from: classes3.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC19060k abstractC19060k) {
                this();
            }
        }

        /* renamed from: a */
        public final int m17318a(int i11) {
            Integer num = (Integer) this.f14474a.get(String.valueOf(i11));
            if (num == null) {
                return AbstractC23309i.m120737A0();
            }
            return num.intValue();
        }

        /* renamed from: b */
        public final void m17319b(JSONObject jSONObject) {
            JSONObject optJSONObject;
            AbstractC19074t.m100208f(jSONObject, "jsonObject");
            try {
                JSONObject optJSONObject2 = jSONObject.optJSONObject("config");
                if (optJSONObject2 != null && (optJSONObject = optJSONObject2.optJSONObject("max_group")) != null) {
                    AbstractC19074t.m100205c(optJSONObject);
                    Iterator<String> keys = optJSONObject.keys();
                    AbstractC19074t.m100207e(keys, "keys(...)");
                    while (keys.hasNext()) {
                        String next = keys.next();
                        HashMap hashMap = this.f14474a;
                        AbstractC19074t.m100205c(next);
                        int optInt = optJSONObject.optInt(next, 0);
                        if (optInt <= 0) {
                            optInt = AbstractC23309i.m120737A0();
                        }
                        hashMap.put(next, Integer.valueOf(optInt));
                    }
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
    }

    /* renamed from: ce.l$e */
    /* loaded from: classes3.dex */
    public static final class e {
        public static final a Companion = new a(null);

        /* renamed from: a */
        private final HashMap f14475a = new HashMap();

        /* renamed from: b */
        private final HashMap f14476b = new HashMap();

        /* renamed from: c */
        private final HashMap f14477c = new HashMap();

        /* renamed from: d */
        private final HashMap f14478d = new HashMap();

        /* renamed from: e */
        private final HashMap f14479e = new HashMap();

        /* renamed from: f */
        private final HashMap f14480f = new HashMap();

        /* renamed from: ce.l$e$a */
        /* loaded from: classes3.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC19060k abstractC19060k) {
                this();
            }
        }

        /* renamed from: a */
        public final boolean m17320a(int i11) {
            Integer num = (Integer) this.f14477c.get(String.valueOf(i11));
            if (num == null) {
                num = 0;
            }
            if (num.intValue() < 1) {
                return false;
            }
            return true;
        }

        /* renamed from: b */
        public final boolean m17321b(int i11) {
            Integer num = (Integer) this.f14476b.get(String.valueOf(i11));
            if (num == null) {
                num = 0;
            }
            if (num.intValue() < 1) {
                return false;
            }
            return true;
        }

        /* renamed from: c */
        public final boolean m17322c(int i11) {
            Integer num = (Integer) this.f14480f.get(String.valueOf(i11));
            if (num == null) {
                num = 0;
            }
            if (num.intValue() < 1) {
                return false;
            }
            return true;
        }

        /* renamed from: d */
        public final boolean m17323d(int i11) {
            Integer num = (Integer) this.f14475a.get(String.valueOf(i11));
            if (num == null) {
                num = 0;
            }
            if (num.intValue() < 1) {
                return false;
            }
            return true;
        }

        /* renamed from: e */
        public final boolean m17324e(int i11) {
            Integer num = (Integer) this.f14478d.get(String.valueOf(i11));
            if (num == null) {
                num = 0;
            }
            if (num.intValue() < 1) {
                return false;
            }
            return true;
        }

        /* renamed from: f */
        public final void m17325f(JSONObject jSONObject) {
            AbstractC19074t.m100208f(jSONObject, "jsonObject");
            try {
                JSONObject optJSONObject = jSONObject.optJSONObject("config");
                if (optJSONObject != null) {
                    JSONObject optJSONObject2 = optJSONObject.optJSONObject("enable_at_globalsearch");
                    if (optJSONObject2 != null) {
                        AbstractC3444m.m17339b(this.f14475a, optJSONObject2);
                    }
                    JSONObject optJSONObject3 = optJSONObject.optJSONObject("enable_at_contact");
                    if (optJSONObject3 != null) {
                        AbstractC3444m.m17339b(this.f14476b, optJSONObject3);
                    }
                    JSONObject optJSONObject4 = optJSONObject.optJSONObject("enable_at_chat");
                    if (optJSONObject4 != null) {
                        AbstractC3444m.m17339b(this.f14477c, optJSONObject4);
                    }
                    JSONObject optJSONObject5 = optJSONObject.optJSONObject("enable_at_social");
                    if (optJSONObject5 != null) {
                        AbstractC3444m.m17339b(this.f14478d, optJSONObject5);
                    }
                    JSONObject optJSONObject6 = optJSONObject.optJSONObject("enable_at_mini_profile");
                    if (optJSONObject6 != null) {
                        AbstractC3444m.m17339b(this.f14479e, optJSONObject6);
                    }
                    JSONObject optJSONObject7 = optJSONObject.optJSONObject("enable_at_friend_request");
                    if (optJSONObject7 != null) {
                        AbstractC3444m.m17339b(this.f14480f, optJSONObject7);
                    }
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
    }

    /* renamed from: ce.l$f */
    /* loaded from: classes3.dex */
    public static final class f {
        public static final a Companion = new a(null);

        /* renamed from: a */
        private final HashMap f14481a = new HashMap();

        /* renamed from: ce.l$f$a */
        /* loaded from: classes3.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC19060k abstractC19060k) {
                this();
            }
        }

        /* renamed from: a */
        public final boolean m17326a(int i11) {
            Integer num = (Integer) this.f14481a.get(String.valueOf(i11));
            if (num == null) {
                num = 0;
            }
            if (num.intValue() < 1) {
                return false;
            }
            return true;
        }

        /* renamed from: b */
        public final void m17327b(JSONObject jSONObject) {
            JSONObject optJSONObject;
            AbstractC19074t.m100208f(jSONObject, "jsonObject");
            try {
                JSONObject optJSONObject2 = jSONObject.optJSONObject("config");
                if (optJSONObject2 != null && (optJSONObject = optJSONObject2.optJSONObject("enable_at_social")) != null) {
                    AbstractC3444m.m17339b(this.f14481a, optJSONObject);
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
    }

    /* renamed from: ce.l$g */
    /* loaded from: classes3.dex */
    public static final class g {
        public static final a Companion = new a(null);

        /* renamed from: a */
        private int f14482a;

        /* renamed from: b */
        private final HashMap f14483b = new HashMap();

        /* renamed from: c */
        private final HashMap f14484c = new HashMap();

        /* renamed from: d */
        private final HashMap f14485d = new HashMap();

        /* renamed from: e */
        private final HashMap f14486e = new HashMap();

        /* renamed from: ce.l$g$a */
        /* loaded from: classes3.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC19060k abstractC19060k) {
                this();
            }
        }

        /* renamed from: a */
        public final boolean m17328a(int i11) {
            Integer num = (Integer) this.f14483b.get(String.valueOf(i11));
            if (num == null) {
                num = 0;
            }
            if (num.intValue() < 1) {
                return false;
            }
            return true;
        }

        /* renamed from: b */
        public final int m17329b(int i11) {
            Integer num = (Integer) this.f14486e.get(String.valueOf(i11));
            if (num == null) {
                return 0;
            }
            return num.intValue();
        }

        /* renamed from: c */
        public final int m17330c(int i11) {
            Integer num = (Integer) this.f14485d.get(String.valueOf(i11));
            if (num == null) {
                return 0;
            }
            return num.intValue();
        }

        /* renamed from: d */
        public final void m17331d(JSONObject jSONObject) {
            AbstractC19074t.m100208f(jSONObject, "jsonObject");
            try {
                this.f14482a = jSONObject.optInt("fea_id");
                JSONObject optJSONObject = jSONObject.optJSONObject("enable");
                if (optJSONObject != null) {
                    AbstractC3444m.m17339b(this.f14483b, optJSONObject);
                }
                JSONObject optJSONObject2 = jSONObject.optJSONObject("config");
                if (optJSONObject2 != null) {
                    JSONObject optJSONObject3 = optJSONObject2.optJSONObject("limit_total_product_create");
                    if (optJSONObject3 != null) {
                        AbstractC3444m.m17339b(this.f14484c, optJSONObject3);
                    }
                    JSONObject optJSONObject4 = optJSONObject2.optJSONObject("limit_total_catalog_create");
                    if (optJSONObject4 != null) {
                        AbstractC3444m.m17339b(this.f14485d, optJSONObject4);
                    }
                    JSONObject optJSONObject5 = optJSONObject2.optJSONObject("limit_photo_per_product");
                    if (optJSONObject5 != null) {
                        AbstractC3444m.m17339b(this.f14486e, optJSONObject5);
                    }
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
    }

    /* renamed from: ce.l$h */
    /* loaded from: classes3.dex */
    public static final class h {
        public static final a Companion = new a(null);

        /* renamed from: a */
        private int f14487a;

        /* renamed from: b */
        private final HashMap f14488b = new HashMap();

        /* renamed from: c */
        private final HashMap f14489c = new HashMap();

        /* renamed from: d */
        private final HashMap f14490d = new HashMap();

        /* renamed from: e */
        private final HashMap f14491e = new HashMap();

        /* renamed from: ce.l$h$a */
        /* loaded from: classes3.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC19060k abstractC19060k) {
                this();
            }
        }

        /* renamed from: a */
        public final boolean m17332a(int i11) {
            Integer num = (Integer) this.f14488b.get(String.valueOf(i11));
            if (num == null) {
                num = 0;
            }
            if (num.intValue() < 1) {
                return false;
            }
            return true;
        }

        /* renamed from: b */
        public final int m17333b(int i11) {
            Integer num = (Integer) this.f14489c.get(String.valueOf(i11));
            if (num == null) {
                return 0;
            }
            return num.intValue();
        }

        /* renamed from: c */
        public final void m17334c(JSONObject jSONObject) {
            AbstractC19074t.m100208f(jSONObject, "jsonObject");
            try {
                this.f14487a = jSONObject.optInt("fea_id");
                JSONObject optJSONObject = jSONObject.optJSONObject("enable");
                if (optJSONObject != null) {
                    AbstractC3444m.m17339b(this.f14488b, optJSONObject);
                }
                JSONObject optJSONObject2 = jSONObject.optJSONObject("config");
                if (optJSONObject2 != null) {
                    JSONObject optJSONObject3 = optJSONObject2.optJSONObject("limit_template_create");
                    if (optJSONObject3 != null) {
                        AbstractC3444m.m17339b(this.f14489c, optJSONObject3);
                    }
                    JSONObject optJSONObject4 = optJSONObject2.optJSONObject("enable_qm_file");
                    if (optJSONObject4 != null) {
                        AbstractC3444m.m17339b(this.f14490d, optJSONObject4);
                    }
                    JSONObject optJSONObject5 = optJSONObject2.optJSONObject("enable_qm_rtf");
                    if (optJSONObject5 != null) {
                        AbstractC3444m.m17339b(this.f14491e, optJSONObject5);
                    }
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
    }

    /* renamed from: ce.l$i */
    /* loaded from: classes3.dex */
    public static final class i {
        public static final a Companion = new a(null);

        /* renamed from: a */
        private final HashMap f14492a = new HashMap();

        /* renamed from: b */
        private final HashMap f14493b = new HashMap();

        /* renamed from: ce.l$i$a */
        /* loaded from: classes3.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC19060k abstractC19060k) {
                this();
            }
        }

        /* renamed from: a */
        public final boolean m17335a(int i11) {
            Integer num = (Integer) this.f14492a.get(String.valueOf(i11));
            if (num == null) {
                num = 0;
            }
            if (num.intValue() < 1) {
                return false;
            }
            return true;
        }

        /* renamed from: b */
        public final void m17336b(JSONObject jSONObject) {
            AbstractC19074t.m100208f(jSONObject, "jsonObject");
            try {
                JSONObject optJSONObject = jSONObject.optJSONObject("config");
                if (optJSONObject != null) {
                    JSONObject optJSONObject2 = optJSONObject.optJSONObject("change_stranger_privacy_settings");
                    if (optJSONObject2 != null) {
                        AbstractC3444m.m17339b(this.f14492a, optJSONObject2);
                    }
                    JSONObject optJSONObject3 = optJSONObject.optJSONObject("display_category_at_profile");
                    if (optJSONObject3 != null) {
                        AbstractC3444m.m17339b(this.f14493b, optJSONObject3);
                    }
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }

        /* renamed from: c */
        public final boolean m17337c(int i11) {
            Integer num = (Integer) this.f14493b.get(String.valueOf(i11));
            if (num == null) {
                num = 0;
            }
            if (num.intValue() < 1) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: a */
    public final a m17302a() {
        return this.f14462b;
    }

    /* renamed from: b */
    public final b m17303b() {
        return this.f14464d;
    }

    /* renamed from: c */
    public final d m17304c() {
        return this.f14468h;
    }

    /* renamed from: d */
    public final e m17305d() {
        return this.f14465e;
    }

    /* renamed from: e */
    public final f m17306e() {
        return this.f14466f;
    }

    /* renamed from: f */
    public final g m17307f() {
        return this.f14463c;
    }

    /* renamed from: g */
    public final h m17308g() {
        return this.f14461a;
    }

    /* renamed from: h */
    public final i m17309h() {
        return this.f14467g;
    }

    /* renamed from: i */
    public final void m17310i(JSONObject jSONObject) {
        AbstractC19074t.m100208f(jSONObject, "jsonObject");
        JSONObject optJSONObject = jSONObject.optJSONObject("qm");
        if (optJSONObject != null) {
            this.f14461a.m17334c(optJSONObject);
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("ar");
        if (optJSONObject2 != null) {
            this.f14462b.m17315d(optJSONObject2);
        }
        JSONObject optJSONObject3 = jSONObject.optJSONObject("catalog");
        if (optJSONObject3 != null) {
            this.f14463c.m17331d(optJSONObject3);
        }
        JSONObject optJSONObject4 = jSONObject.optJSONObject("chat");
        if (optJSONObject4 != null) {
            this.f14464d.m17317b(optJSONObject4);
        }
        JSONObject optJSONObject5 = jSONObject.optJSONObject("social");
        if (optJSONObject5 != null) {
            this.f14467g.m17336b(optJSONObject5);
        }
        JSONObject optJSONObject6 = jSONObject.optJSONObject("group");
        if (optJSONObject6 != null) {
            this.f14468h.m17319b(optJSONObject6);
        }
    }

    /* renamed from: j */
    public final void m17311j(JSONObject jSONObject) {
        AbstractC19074t.m100208f(jSONObject, "jsonObject");
        JSONObject optJSONObject = jSONObject.optJSONObject("label_apply_for_friend");
        if (optJSONObject != null) {
            this.f14465e.m17325f(optJSONObject);
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("label_apply_for_owner");
        if (optJSONObject2 != null) {
            this.f14466f.m17327b(optJSONObject2);
        }
    }
}
