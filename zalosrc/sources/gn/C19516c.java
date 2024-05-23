package gn;

import ae.C0766k;
import ag0.C0824j;
import am.AbstractC0939u;
import c30.C3245i;
import c30.C3247j;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalocore.CoreUtility;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
import p248iy.AbstractC20887g;
import vg.C28020b3;

/* renamed from: gn.c */
/* loaded from: classes3.dex */
public final class C19516c {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private C3245i f96879a;

    /* renamed from: b */
    private final int f96880b;

    /* renamed from: c */
    private final int f96881c;

    /* renamed from: d */
    private final int f96882d;

    /* renamed from: e */
    private c f96883e;

    /* renamed from: f */
    private b f96884f;

    /* renamed from: gn.c$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: gn.c$b */
    /* loaded from: classes3.dex */
    public interface b {
        /* renamed from: a */
        void mo102009a(int i11);
    }

    /* renamed from: gn.c$c */
    /* loaded from: classes3.dex */
    public interface c {
        /* renamed from: a */
        void mo2310a(int i11, C20096c c20096c);

        /* renamed from: b */
        void mo2311b(int i11, ArrayList arrayList);
    }

    /* renamed from: gn.c$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC20094a {
        d() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "error_message");
            try {
                c m102012b = C19516c.this.m102012b();
                if (m102012b != null) {
                    m102012b.mo2310a(C19516c.this.m102013c().f13854b, c20096c);
                }
                b m102011a = C19516c.this.m102011a();
                if (m102011a != null) {
                    m102011a.mo102009a(C19516c.this.m102013c().f13854b);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, "entity");
            try {
                JSONObject jSONObject = ((JSONObject) obj).getJSONObject("data").getJSONObject("cate");
                if (C19516c.this.m102013c().f13854b < 0) {
                    c m102012b = C19516c.this.m102012b();
                    if (m102012b != null) {
                        m102012b.mo2310a(C19516c.this.m102013c().f13854b, new C20096c(502, "CMD 175 wrong sticker cate id"));
                    }
                    b m102011a = C19516c.this.m102011a();
                    if (m102011a != null) {
                        m102011a.mo102009a(C19516c.this.m102013c().f13854b);
                        return;
                    }
                    return;
                }
                C19516c.this.m102016f(new C3245i(jSONObject));
                if (C19516c.this.m102013c().f13854b == 39) {
                    AbstractC20887g.m109230h(1000000, "start 172 on 175");
                }
                C19516c.this.m102017g();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: gn.c$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC20094a {
        e() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "error_message");
            try {
                c m102012b = C19516c.this.m102012b();
                if (m102012b != null) {
                    m102012b.mo2310a(C19516c.this.m102013c().f13854b, c20096c);
                }
                b m102011a = C19516c.this.m102011a();
                if (m102011a != null) {
                    m102011a.mo102009a(C19516c.this.m102013c().f13854b);
                }
                AbstractC20887g.m109244v(26013, null, 2, null);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, "entity");
            try {
                ArrayList arrayList = new ArrayList();
                JSONArray jSONArray = ((JSONObject) obj).getJSONObject("data").getJSONArray("list");
                int length = jSONArray.length();
                for (int i11 = 0; i11 < length; i11++) {
                    arrayList.add(new C3247j(jSONArray.getJSONObject(i11)));
                }
                if (C19516c.this.m102013c().f13854b == 39) {
                    AbstractC20887g.m109230h(1000000, "172 success, cate size: " + arrayList.size());
                }
                if (arrayList.size() > 0) {
                    C7960e.m41971c6().m42419i4(C19516c.this.m102013c().f13854b, "");
                    C28020b3.f130648a.m141180C(C19516c.this.m102013c(), arrayList);
                    if (C19516c.this.m102013c().f13854b == 39) {
                        AbstractC20887g.m109230h(1000000, "is insert successfully: " + C7960e.m41971c6().m42273T6("39").size());
                    }
                    c m102012b = C19516c.this.m102012b();
                    if (m102012b != null) {
                        m102012b.mo2311b(C19516c.this.m102013c().f13854b, arrayList);
                    }
                } else {
                    c m102012b2 = C19516c.this.m102012b();
                    if (m102012b2 != null) {
                        m102012b2.mo2310a(C19516c.this.m102013c().f13854b, new C20096c(1001, "Empty info"));
                    }
                }
                b m102011a = C19516c.this.m102011a();
                if (m102011a != null) {
                    m102011a.mo102009a(C19516c.this.m102013c().f13854b);
                }
                AbstractC20887g.m109217D(26013, null, 2, null);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: gn.c$f */
    /* loaded from: classes3.dex */
    public static final class f implements InterfaceC20094a {

        /* renamed from: gn.c$f$a */
        /* loaded from: classes3.dex */
        public static final class a extends AbstractC0939u {

            /* renamed from: a */
            final /* synthetic */ C19516c f96888a;

            /* renamed from: b */
            final /* synthetic */ ArrayList f96889b;

            a(C19516c c19516c, ArrayList arrayList) {
                this.f96888a = c19516c;
                this.f96889b = arrayList;
            }

            @Override // p660xw.InterfaceC30214a
            /* renamed from: a */
            public void mo928a() {
                C7960e.m41971c6().m42419i4(this.f96888a.m102013c().f13854b, null);
                C7960e.m41971c6().m42101E(this.f96889b);
            }
        }

        f() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "error_message");
            try {
                c m102012b = C19516c.this.m102012b();
                if (m102012b != null) {
                    m102012b.mo2310a(C19516c.this.m102013c().f13854b, c20096c);
                }
                b m102011a = C19516c.this.m102011a();
                if (m102011a != null) {
                    m102011a.mo102009a(C19516c.this.m102013c().f13854b);
                }
                AbstractC20887g.m109244v(26013, null, 2, null);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, "entity");
            try {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("getDEcorDetail: ");
                sb2.append(obj);
                JSONArray jSONArray = ((JSONObject) obj).getJSONObject("data").getJSONArray("list");
                ArrayList arrayList = new ArrayList(jSONArray.length());
                int length = jSONArray.length();
                for (int i11 = 0; i11 < length; i11++) {
                    C3247j c3247j = new C3247j(jSONArray.getJSONObject(i11));
                    c3247j.f13888a = C19516c.this.m102013c().f13854b;
                    arrayList.add(c3247j);
                }
                if (arrayList.size() > 0) {
                    C0824j.m2153b(new a(C19516c.this, arrayList));
                }
                c m102012b = C19516c.this.m102012b();
                if (m102012b != null) {
                    m102012b.mo2311b(C19516c.this.m102013c().f13854b, arrayList);
                }
                b m102011a = C19516c.this.m102011a();
                if (m102011a != null) {
                    m102011a.mo102009a(C19516c.this.m102013c().f13854b);
                }
                AbstractC20887g.m109217D(26013, null, 2, null);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    public C19516c(C3245i c3245i, int i11, int i12, int i13) {
        AbstractC19074t.m100208f(c3245i, "stickerCate");
        this.f96879a = c3245i;
        this.f96880b = i11;
        this.f96881c = i12;
        this.f96882d = i13;
    }

    /* renamed from: a */
    public final b m102011a() {
        return this.f96884f;
    }

    /* renamed from: b */
    public final c m102012b() {
        return this.f96883e;
    }

    /* renamed from: c */
    public final C3245i m102013c() {
        return this.f96879a;
    }

    /* renamed from: d */
    public final void m102014d(b bVar) {
        this.f96884f = bVar;
    }

    /* renamed from: e */
    public final void m102015e(c cVar) {
        this.f96883e = cVar;
    }

    /* renamed from: f */
    public final void m102016f(C3245i c3245i) {
        AbstractC19074t.m100208f(c3245i, "<set-?>");
        this.f96879a = c3245i;
    }

    /* renamed from: g */
    public final void m102017g() {
        try {
            int i11 = this.f96881c;
            if (i11 == 0) {
                String str = this.f96879a.f13858f;
                AbstractC19074t.m100207e(str, "iconUrl");
                if (str.length() == 0) {
                    C0766k c0766k = new C0766k();
                    c0766k.mo1704o8(new d());
                    c0766k.mo1407Ca(this.f96879a.f13854b);
                    return;
                }
                if (this.f96879a.f13854b == 39) {
                    AbstractC20887g.m109230h(1000000, "request 172");
                }
                C0766k c0766k2 = new C0766k();
                c0766k2.mo1704o8(new e());
                int m42253R6 = C7960e.m41971c6().m42253R6(CoreUtility.f89233i) + 1;
                c0766k2.mo1537T3(this.f96879a.f13854b, this.f96880b, m42253R6, this.f96882d);
                return;
            }
            if (i11 == 1) {
                C0766k c0766k3 = new C0766k();
                c0766k3.mo1704o8(new f());
                c0766k3.mo1537T3(this.f96879a.f13854b, 9, -1, this.f96882d);
            } else {
                b bVar = this.f96884f;
                if (bVar != null) {
                    bVar.mo102009a(this.f96879a.f13854b);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
