package p510sq;

import android.os.Bundle;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.feed.adapters.C8050a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import p716zh.C32002l4;

/* renamed from: sq.a */
/* loaded from: classes4.dex */
public final class C26365a {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private String f125220a;

    /* renamed from: b */
    private boolean f125221b;

    /* renamed from: c */
    private String f125222c;

    /* renamed from: d */
    private C32002l4 f125223d;

    /* renamed from: e */
    private TrackingSource f125224e;

    /* renamed from: f */
    private boolean f125225f;

    /* renamed from: g */
    private String f125226g;

    /* renamed from: h */
    private int f125227h;

    /* renamed from: i */
    private boolean f125228i;

    /* renamed from: j */
    private boolean f125229j;

    /* renamed from: k */
    private boolean f125230k;

    /* renamed from: l */
    private int f125231l;

    /* renamed from: m */
    private String f125232m;

    /* renamed from: n */
    private boolean f125233n;

    /* renamed from: o */
    private int f125234o;

    /* renamed from: p */
    private ContactProfile f125235p;

    /* renamed from: q */
    private boolean f125236q;

    /* renamed from: r */
    private C8050a.d0 f125237r;

    /* renamed from: s */
    private int f125238s;

    /* renamed from: t */
    private boolean f125239t;

    /* renamed from: sq.a$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final Bundle m135733a(C26365a c26365a) {
            String str = null;
            if (c26365a == null) {
                return null;
            }
            Bundle bundle = new Bundle();
            bundle.putString("userID", c26365a.m135724l());
            bundle.putBoolean("fromPlugin", c26365a.m135728p());
            bundle.putString("str_source_action_log", c26365a.m135721i());
            C32002l4 m135715c = c26365a.m135715c();
            if (m135715c != null) {
                str = m135715c.m154277l();
            }
            bundle.putString("extra_entry_point_flow", str);
            bundle.putBoolean("bol_is_show_profile_photo", c26365a.m135732t());
            bundle.putString("STR_QUICK_ACCESS_VISIBLE_ACTION_TYPE", c26365a.m135719g());
            bundle.putInt("int_extra_action_list_action", c26365a.m135713a());
            bundle.putBoolean("fromChat", c26365a.m135725m());
            bundle.putBoolean("fromFriendSuggest", c26365a.m135727o());
            bundle.putBoolean("fromFriendRequest", c26365a.m135726n());
            bundle.putInt("extra_source_friend", c26365a.m135716d());
            bundle.putString("str_extra_phone_num_from_search", c26365a.m135718f());
            bundle.putBoolean("extra_from_noti_friend_update_profile_music", c26365a.m135730r());
            bundle.putInt("extra_source_friend", c26365a.m135722j());
            bundle.putParcelable("contact_extra_profile", c26365a.m135714b());
            bundle.putBoolean("bol_is_show_profile_photo", c26365a.m135731s());
            bundle.putSerializable("extra_default_tab", c26365a.m135717e());
            bundle.putInt("int_show_with_flag", c26365a.m135720h());
            return bundle;
        }
    }

    /* renamed from: sq.a$b */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a */
        private final String f125240a;

        /* renamed from: b */
        private final C32002l4 f125241b;

        /* renamed from: c */
        private boolean f125242c;

        /* renamed from: d */
        private TrackingSource f125243d;

        /* renamed from: f */
        private boolean f125245f;

        /* renamed from: i */
        private boolean f125248i;

        /* renamed from: j */
        private boolean f125249j;

        /* renamed from: k */
        private boolean f125250k;

        /* renamed from: n */
        private boolean f125253n;

        /* renamed from: p */
        private ContactProfile f125255p;

        /* renamed from: q */
        private boolean f125256q;

        /* renamed from: r */
        private C8050a.d0 f125257r;

        /* renamed from: t */
        private boolean f125259t;

        /* renamed from: e */
        private String f125244e = "";

        /* renamed from: g */
        private String f125246g = "";

        /* renamed from: h */
        private int f125247h = -1;

        /* renamed from: l */
        private int f125251l = -1;

        /* renamed from: m */
        private String f125252m = "";

        /* renamed from: o */
        private int f125254o = -1;

        /* renamed from: s */
        private int f125258s = -1;

        public b(String str, C32002l4 c32002l4) {
            this.f125240a = str;
            this.f125241b = c32002l4;
        }

        /* renamed from: A */
        public final boolean m135734A() {
            return this.f125245f;
        }

        /* renamed from: B */
        public final b m135735B(C8050a.d0 d0Var) {
            if (d0Var != null) {
                this.f125257r = d0Var;
            }
            return this;
        }

        /* renamed from: C */
        public final b m135736C(String str) {
            AbstractC19074t.m100208f(str, "phoneNumFromSearchFriend");
            this.f125252m = str;
            return this;
        }

        /* renamed from: D */
        public final b m135737D(String str) {
            AbstractC19074t.m100208f(str, "quickAccessActionTypeVisible");
            this.f125246g = str;
            return this;
        }

        /* renamed from: E */
        public final b m135738E(int i11) {
            this.f125258s = i11;
            return this;
        }

        /* renamed from: F */
        public final b m135739F(String str) {
            AbstractC19074t.m100208f(str, "sourceAction");
            this.f125244e = str;
            return this;
        }

        /* renamed from: G */
        public final b m135740G(int i11) {
            this.f125254o = i11;
            return this;
        }

        /* renamed from: H */
        public final b m135741H(TrackingSource trackingSource) {
            this.f125243d = trackingSource;
            return this;
        }

        /* renamed from: a */
        public final b m135742a(int i11) {
            this.f125247h = i11;
            return this;
        }

        /* renamed from: b */
        public final C26365a m135743b() {
            return new C26365a(this, null);
        }

        /* renamed from: c */
        public final b m135744c(ContactProfile contactProfile) {
            AbstractC19074t.m100208f(contactProfile, "contactProfile");
            this.f125255p = contactProfile;
            return this;
        }

        /* renamed from: d */
        public final int m135745d() {
            return this.f125247h;
        }

        /* renamed from: e */
        public final ContactProfile m135746e() {
            return this.f125255p;
        }

        /* renamed from: f */
        public final C32002l4 m135747f() {
            return this.f125241b;
        }

        /* renamed from: g */
        public final int m135748g() {
            return this.f125251l;
        }

        /* renamed from: h */
        public final C8050a.d0 m135749h() {
            return this.f125257r;
        }

        /* renamed from: i */
        public final String m135750i() {
            return this.f125252m;
        }

        /* renamed from: j */
        public final String m135751j() {
            return this.f125246g;
        }

        /* renamed from: k */
        public final int m135752k() {
            return this.f125258s;
        }

        /* renamed from: l */
        public final String m135753l() {
            return this.f125244e;
        }

        /* renamed from: m */
        public final int m135754m() {
            return this.f125254o;
        }

        /* renamed from: n */
        public final TrackingSource m135755n() {
            return this.f125243d;
        }

        /* renamed from: o */
        public final String m135756o() {
            return this.f125240a;
        }

        /* renamed from: p */
        public final b m135757p(boolean z11) {
            this.f125248i = z11;
            return this;
        }

        /* renamed from: q */
        public final boolean m135758q() {
            return this.f125248i;
        }

        /* renamed from: r */
        public final b m135759r(boolean z11) {
            this.f125250k = z11;
            return this;
        }

        /* renamed from: s */
        public final boolean m135760s() {
            return this.f125250k;
        }

        /* renamed from: t */
        public final b m135761t(boolean z11) {
            this.f125249j = z11;
            return this;
        }

        /* renamed from: u */
        public final boolean m135762u() {
            return this.f125249j;
        }

        /* renamed from: v */
        public final boolean m135763v() {
            return this.f125242c;
        }

        /* renamed from: w */
        public final boolean m135764w() {
            return this.f125259t;
        }

        /* renamed from: x */
        public final boolean m135765x() {
            return this.f125253n;
        }

        /* renamed from: y */
        public final boolean m135766y() {
            return this.f125256q;
        }

        /* renamed from: z */
        public final b m135767z(boolean z11) {
            this.f125245f = z11;
            return this;
        }
    }

    public /* synthetic */ C26365a(b bVar, AbstractC19060k abstractC19060k) {
        this(bVar);
    }

    /* renamed from: a */
    public final int m135713a() {
        return this.f125227h;
    }

    /* renamed from: b */
    public final ContactProfile m135714b() {
        return this.f125235p;
    }

    /* renamed from: c */
    public final C32002l4 m135715c() {
        return this.f125223d;
    }

    /* renamed from: d */
    public final int m135716d() {
        return this.f125231l;
    }

    /* renamed from: e */
    public final C8050a.d0 m135717e() {
        return this.f125237r;
    }

    /* renamed from: f */
    public final String m135718f() {
        return this.f125232m;
    }

    /* renamed from: g */
    public final String m135719g() {
        return this.f125226g;
    }

    /* renamed from: h */
    public final int m135720h() {
        return this.f125238s;
    }

    /* renamed from: i */
    public final String m135721i() {
        return this.f125222c;
    }

    /* renamed from: j */
    public final int m135722j() {
        return this.f125234o;
    }

    /* renamed from: k */
    public final TrackingSource m135723k() {
        return this.f125224e;
    }

    /* renamed from: l */
    public final String m135724l() {
        return this.f125220a;
    }

    /* renamed from: m */
    public final boolean m135725m() {
        return this.f125228i;
    }

    /* renamed from: n */
    public final boolean m135726n() {
        return this.f125230k;
    }

    /* renamed from: o */
    public final boolean m135727o() {
        return this.f125229j;
    }

    /* renamed from: p */
    public final boolean m135728p() {
        return this.f125221b;
    }

    /* renamed from: q */
    public final boolean m135729q() {
        return this.f125239t;
    }

    /* renamed from: r */
    public final boolean m135730r() {
        return this.f125233n;
    }

    /* renamed from: s */
    public final boolean m135731s() {
        return this.f125236q;
    }

    /* renamed from: t */
    public final boolean m135732t() {
        return this.f125225f;
    }

    private C26365a(b bVar) {
        this.f125220a = "";
        this.f125222c = "";
        this.f125226g = "";
        this.f125227h = -1;
        this.f125231l = -1;
        this.f125232m = "";
        this.f125238s = -1;
        this.f125220a = bVar.m135756o();
        this.f125221b = bVar.m135763v();
        this.f125222c = bVar.m135753l();
        this.f125223d = bVar.m135747f();
        this.f125224e = bVar.m135755n();
        this.f125225f = bVar.m135734A();
        this.f125226g = bVar.m135751j();
        this.f125227h = bVar.m135745d();
        this.f125228i = bVar.m135758q();
        this.f125229j = bVar.m135762u();
        this.f125230k = bVar.m135760s();
        this.f125231l = bVar.m135748g();
        this.f125232m = bVar.m135750i();
        this.f125233n = bVar.m135765x();
        this.f125234o = bVar.m135754m();
        this.f125235p = bVar.m135746e();
        this.f125236q = bVar.m135766y();
        this.f125237r = bVar.m135749h();
        this.f125238s = bVar.m135752k();
        this.f125239t = bVar.m135764w();
    }
}
