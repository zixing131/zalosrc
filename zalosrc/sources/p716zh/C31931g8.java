package p716zh;

import ag0.C0856z;
import android.text.TextUtils;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p062db.C7962g;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.C19067n0;
import java.util.Arrays;
import java.util.HashMap;
import on0.AbstractC24341v;
import p132ej.C18451m;
import p227i3.C20217u;
import p461qu.AbstractC25495a;

/* renamed from: zh.g8 */
/* loaded from: classes3.dex */
public final class C31931g8 {
    public static final a Companion = new a(null);

    /* renamed from: g */
    private static final HashMap f146703g;

    /* renamed from: a */
    private String f146704a;

    /* renamed from: b */
    private String f146705b;

    /* renamed from: c */
    private long f146706c;

    /* renamed from: d */
    public ContactProfile f146707d;

    /* renamed from: e */
    public C31973j5 f146708e;

    /* renamed from: f */
    public boolean f146709f;

    /* renamed from: zh.g8$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C31931g8 m153440a(String str, String str2, long j11) {
            AbstractC19074t.m100208f(str2, "uid");
            C31931g8 c31931g8 = new C31931g8();
            c31931g8.m153438j(str2);
            c31931g8.m153437i(str);
            c31931g8.m153436h(j11);
            return c31931g8;
        }

        /* renamed from: b */
        public final C31931g8 m153441b(int i11, long j11) {
            C31931g8 c31931g8 = new C31931g8();
            c31931g8.m153438j(String.valueOf(j11));
            c31931g8.m153436h(C0856z.Companion.m2415a());
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        c31931g8.m153437i("m");
                    }
                } else {
                    c31931g8.m153437i(C7962g.f43287r);
                }
            } else {
                c31931g8.m153437i(C20217u.f99970o);
            }
            return c31931g8;
        }

        /* renamed from: c */
        public final C31931g8 m153442c(String str) {
            AbstractC19074t.m100208f(str, "uid");
            C31931g8 c31931g8 = new C31931g8();
            if (!TextUtils.isEmpty(str)) {
                if (AbstractC25495a.m132081f(str)) {
                    c31931g8.m153437i("m");
                    c31931g8.m153438j("1");
                } else if (AbstractC25495a.m132079d(str)) {
                    c31931g8.m153437i(C7962g.f43287r);
                    c31931g8.m153438j(AbstractC25495a.m132088m(str));
                } else {
                    c31931g8.m153437i(C20217u.f99970o);
                    c31931g8.m153438j(str);
                }
                c31931g8.m153436h(C0856z.Companion.m2415a());
            }
            return c31931g8;
        }

        /* renamed from: d */
        public final boolean m153443d(int i11) {
            return i11 == 1 || i11 == 2 || i11 == 3;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f146703g = hashMap;
        hashMap.put(C20217u.f99970o, "");
        hashMap.put(C7962g.f43287r, "group_");
        hashMap.put("m", "m");
    }

    public C31931g8() {
        this.f146704a = "";
        this.f146706c = C0856z.Companion.m2415a();
        this.f146705b = C20217u.f99970o;
        this.f146704a = "";
    }

    /* renamed from: a */
    public static final C31931g8 m153429a(String str, String str2, long j11) {
        return Companion.m153440a(str, str2, j11);
    }

    /* renamed from: b */
    public static final C31931g8 m153430b(int i11, long j11) {
        return Companion.m153441b(i11, j11);
    }

    /* renamed from: c */
    public static final C31931g8 m153431c(String str) {
        return Companion.m153442c(str);
    }

    /* renamed from: g */
    public static final boolean m153432g(int i11) {
        return Companion.m153443d(i11);
    }

    /* renamed from: d */
    public final long m153433d() {
        return this.f146706c;
    }

    /* renamed from: e */
    public final String m153434e() {
        return this.f146705b;
    }

    /* renamed from: f */
    public final String m153435f() {
        return this.f146704a;
    }

    /* renamed from: h */
    public final void m153436h(long j11) {
        this.f146706c = j11;
    }

    /* renamed from: i */
    public final void m153437i(String str) {
        this.f146705b = str;
    }

    /* renamed from: j */
    public final void m153438j(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f146704a = str;
    }

    /* renamed from: k */
    public final String m153439k() {
        C19067n0 c19067n0 = C19067n0.f94947a;
        String format = String.format("%s%s", Arrays.copyOf(new Object[]{f146703g.get(this.f146705b), this.f146704a}, 2));
        AbstractC19074t.m100207e(format, "format(...)");
        return format;
    }

    public String toString() {
        return "PinItem {uid: " + this.f146704a + ", type: " + this.f146705b + ", time: " + this.f146706c + "}";
    }

    public C31931g8(String str) {
        boolean m127120J;
        boolean m127120J2;
        boolean m127120J3;
        AbstractC19074t.m100208f(str, "itemJsonData");
        this.f146704a = "";
        C0856z.a aVar = C0856z.Companion;
        this.f146706c = aVar.m2415a();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            m127120J = AbstractC24341v.m127120J(str, C20217u.f99970o, false, 2, null);
            if (!m127120J) {
                m127120J2 = AbstractC24341v.m127120J(str, C7962g.f43287r, false, 2, null);
                if (!m127120J2) {
                    m127120J3 = AbstractC24341v.m127120J(str, "m", false, 2, null);
                    if (m127120J3) {
                        this.f146705b = "m";
                        String substring = str.substring(1);
                        AbstractC19074t.m100207e(substring, "substring(...)");
                        this.f146704a = substring;
                    }
                } else {
                    this.f146705b = C7962g.f43287r;
                    String substring2 = str.substring(1);
                    AbstractC19074t.m100207e(substring2, "substring(...)");
                    this.f146704a = substring2;
                }
            } else {
                this.f146705b = C20217u.f99970o;
                String substring3 = str.substring(1);
                AbstractC19074t.m100207e(substring3, "substring(...)");
                this.f146704a = substring3;
            }
            this.f146706c = aVar.m2415a();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public C31931g8(C18451m c18451m) {
        this.f146704a = "";
        C0856z.a aVar = C0856z.Companion;
        this.f146706c = aVar.m2415a();
        if (c18451m == null || TextUtils.isEmpty(c18451m.mo97719a())) {
            return;
        }
        try {
            if (c18451m.m97766i()) {
                this.f146705b = "m";
                this.f146704a = "1";
            } else if (c18451m.mo97724g()) {
                this.f146705b = C7962g.f43287r;
                this.f146704a = AbstractC25495a.m132088m(c18451m.mo97719a());
            } else {
                this.f146705b = C20217u.f99970o;
                this.f146704a = c18451m.mo97719a();
            }
            this.f146706c = aVar.m2415a();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
