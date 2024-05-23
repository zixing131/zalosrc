package p170fv;

import fn0.AbstractC19060k;
import fn0.AbstractC19061k0;
import fn0.AbstractC19074t;
import mn0.InterfaceC23364b;
import org.json.JSONObject;

/* renamed from: fv.a */
/* loaded from: classes4.dex */
public abstract class AbstractC19147a {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private int f95181a;

    /* renamed from: b */
    private Integer f95182b;

    /* renamed from: c */
    private Integer f95183c;

    /* renamed from: d */
    private int f95184d;

    /* renamed from: e */
    private String f95185e;

    /* renamed from: f */
    private Boolean f95186f;

    /* renamed from: g */
    private String f95187g;

    /* renamed from: fv.a$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final int m100487a(int i11) {
            if (i11 == 0) {
                return 0;
            }
            if (i11 != 1) {
                return (i11 == 2 || i11 != 3) ? 2 : 3;
            }
            return 1;
        }

        /* renamed from: b */
        public final boolean m100488b(AbstractC19147a abstractC19147a, InterfaceC23364b interfaceC23364b) {
            AbstractC19074t.m100208f(interfaceC23364b, "zClass");
            if (abstractC19147a != null && AbstractC19074t.m100204b(AbstractC19061k0.m100169b(abstractC19147a.getClass()), interfaceC23364b)) {
                return true;
            }
            return false;
        }

        /* renamed from: c */
        public final AbstractC19147a m100489c(JSONObject jSONObject) {
            AbstractC19147a c19157k;
            try {
                if (jSONObject == null) {
                    return new C19157k(null);
                }
                int i11 = jSONObject.getInt("actionbarType");
                JSONObject optJSONObject = jSONObject.optJSONObject("dataConfig");
                JSONObject optJSONObject2 = jSONObject.optJSONObject("homeConfig");
                switch (i11) {
                    case 0:
                        c19157k = new C19157k(optJSONObject);
                        break;
                    case 1:
                        c19157k = new C19156j(optJSONObject);
                        break;
                    case 2:
                        c19157k = new C19153g(optJSONObject);
                        break;
                    case 3:
                        c19157k = new C19150d(optJSONObject);
                        break;
                    case 4:
                        c19157k = new C19151e();
                        break;
                    case 5:
                        c19157k = new C19154h(optJSONObject);
                        break;
                    case 6:
                        c19157k = new C19155i(optJSONObject);
                        break;
                    default:
                        c19157k = new C19157k(optJSONObject);
                        break;
                }
                if (optJSONObject2 != null && (c19157k instanceof C19156j)) {
                    ((C19156j) c19157k).m100499u(new C19159m(optJSONObject2));
                }
                return c19157k;
            } catch (Exception e11) {
                e11.printStackTrace();
                return new C19157k();
            }
        }
    }

    public AbstractC19147a() {
    }

    public AbstractC19147a(JSONObject jSONObject) {
    }

    /* renamed from: c */
    public boolean m100471c() {
        return this.f95182b != null;
    }

    /* renamed from: d */
    public final String m100472d() {
        return this.f95187g;
    }

    /* renamed from: e */
    public final Integer m100473e() {
        return this.f95182b;
    }

    /* renamed from: f */
    public final int m100474f() {
        return this.f95184d;
    }

    /* renamed from: g */
    public final String m100475g() {
        return this.f95185e;
    }

    /* renamed from: h */
    public final Integer m100476h() {
        return this.f95183c;
    }

    /* renamed from: i */
    public final int m100477i() {
        return this.f95181a;
    }

    /* renamed from: j */
    public final Boolean m100478j() {
        return this.f95186f;
    }

    /* renamed from: k */
    public void m100479k(int i11) {
        this.f95183c = this.f95182b;
        this.f95182b = Integer.valueOf(i11);
    }

    /* renamed from: l */
    public final void m100480l(String str) {
        this.f95187g = str;
    }

    /* renamed from: m */
    public final void m100481m(Integer num) {
        this.f95182b = num;
    }

    /* renamed from: n */
    public final void m100482n(int i11) {
        this.f95184d = i11;
    }

    /* renamed from: o */
    public final void m100483o(Boolean bool) {
        this.f95186f = bool;
    }

    /* renamed from: p */
    public final void m100484p(String str) {
        this.f95185e = str;
    }

    /* renamed from: q */
    public final void m100485q(Integer num) {
        this.f95183c = num;
    }

    /* renamed from: r */
    public final void m100486r(int i11) {
        this.f95181a = i11;
    }
}
