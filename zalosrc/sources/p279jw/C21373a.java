package p279jw;

import ae.C0766k;
import ag0.C0824j;
import am.AbstractC0924m0;
import am.AbstractC0939u;
import android.content.res.Resources;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.p062db.C7956b;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.p077ui.chat.C11598e;
import en0.InterfaceC18494a;
import fn0.AbstractC19061k0;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import java.util.ArrayList;
import kw.C21956b;
import mm0.AbstractC23350e;
import on0.AbstractC24341v;
import org.json.JSONArray;
import org.json.JSONObject;
import p246iw.C20843c0;
import p304ks.AbstractC21935u;
import p348mi.AbstractC23306f;
import p363nh.C23744a;
import p528ts.C26893h;
import p620wt.AbstractC29233h;
import p620wt.AbstractC29235j;
import p620wt.C29234i;
import p620wt.InterfaceC29232g;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import th.C26686g;

/* renamed from: jw.a */
/* loaded from: classes4.dex */
public final class C21373a {

    /* renamed from: a */
    public static final C21373a f104231a = new C21373a();

    /* renamed from: b */
    private static final String f104232b;

    /* renamed from: c */
    private static final C29234i f104233c;

    /* renamed from: d */
    private static final InterfaceC29232g f104234d;

    /* renamed from: e */
    private static final InterfaceC29232g f104235e;

    /* renamed from: f */
    private static final InterfaceC29232g f104236f;

    /* renamed from: g */
    private static final InterfaceC29232g f104237g;

    /* renamed from: h */
    private static boolean f104238h;

    /* renamed from: i */
    private static boolean f104239i;

    /* renamed from: j */
    private static boolean f104240j;

    /* renamed from: k */
    private static ContactProfile f104241k;

    /* renamed from: l */
    private static final InterfaceC24854k f104242l;

    /* renamed from: m */
    private static int f104243m;

    /* renamed from: jw.a$a */
    /* loaded from: classes4.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f104244q = new a();

        a() {
            super(0);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0052, code lost:            return r8;     */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x004f, code lost:            if (am.AbstractC0924m0.m3275N6() != 0) goto L44;     */
        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final C21374b mo12V4() {
            C21374b c21374b = new C21374b(false, 0, 0L, 0, 15, null);
            try {
                try {
                    String m3388R3 = AbstractC0924m0.m3388R3();
                    AbstractC19074t.m100207e(m3388R3, "getMyCloudAutoSyncMsgConfig(...)");
                    if (m3388R3.length() > 0) {
                        C21373a.f104231a.m110767B(c21374b, new JSONObject(m3388R3));
                    }
                } catch (Exception e11) {
                    AbstractC23350e.m122776f(C21373a.f104232b, e11);
                }
            } finally {
                if (AbstractC0924m0.m3275N6() == 0) {
                    AbstractC0924m0.m2917Ap(AbstractC23306f.m120579F1().mo124308a());
                }
            }
        }
    }

    /* renamed from: jw.a$b */
    /* loaded from: classes4.dex */
    static final class b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final b f104245q = new b();

        b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final Boolean mo12V4() {
            return Boolean.valueOf(AbstractC0924m0.m3336P9());
        }
    }

    /* renamed from: jw.a$c */
    /* loaded from: classes4.dex */
    static final class c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final c f104246q = new c();

        c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C26686g mo12V4() {
            C26686g c26686g = new C26686g(false, 0L, 0L, 7, null);
            try {
                String m3505V4 = AbstractC0924m0.m3505V4();
                if (m3505V4 != null && m3505V4.length() != 0) {
                    C21373a.f104231a.m110768D(c26686g, new JSONObject(m3505V4));
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f(C21373a.f104232b, e11);
            }
            return c26686g;
        }
    }

    /* renamed from: jw.a$d */
    /* loaded from: classes4.dex */
    public static final class d implements InterfaceC20094a {
        d() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "errorMessage");
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            boolean m127126v;
            if (obj != null) {
                try {
                    ContactProfile contactProfile = new ContactProfile((JSONObject) obj);
                    if (C7960e.m41971c6() != null) {
                        String str = contactProfile.f42434r;
                        AbstractC19074t.m100207e(str, "uid");
                        if (str.length() > 0) {
                            m127126v = AbstractC24341v.m127126v(contactProfile.f42434r, "null", true);
                            if (!m127126v) {
                                C7960e.m41971c6().m42221O7(contactProfile, AbstractC21935u.m114558y(contactProfile.f42434r));
                            }
                        }
                    }
                    C21373a.f104231a.m110792O(contactProfile);
                    C23744a.Companion.m124119a().m124116d(5200, new Object[0]);
                } catch (Exception e11) {
                    AbstractC23350e.m122776f(C21373a.f104232b, e11);
                }
            }
        }
    }

    /* renamed from: jw.a$e */
    /* loaded from: classes4.dex */
    static final class e extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final e f104247q = new e();

        e() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final ArrayList mo12V4() {
            ArrayList arrayList = new ArrayList();
            try {
                String m3505V4 = AbstractC0924m0.m3505V4();
                AbstractC19074t.m100207e(m3505V4, "getSavedMessageLargeFileConfig(...)");
                if (m3505V4.length() > 0) {
                    C21373a.f104231a.m110770G(arrayList, new JSONObject(m3505V4));
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f(C21373a.f104232b, e11);
            }
            return arrayList;
        }
    }

    /* renamed from: jw.a$f */
    /* loaded from: classes4.dex */
    static final class f extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final f f104248q = new f();

        f() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C21375c mo12V4() {
            C21375c c21375c = new C21375c(false, 0, 3, null);
            try {
                String m3475U3 = AbstractC0924m0.m3475U3();
                AbstractC19074t.m100207e(m3475U3, "getMyCloudListingConfig(...)");
                if (m3475U3.length() > 0) {
                    C21373a.f104231a.m110769F(c21375c, new JSONObject(m3475U3));
                }
                if (c21375c.m110825b()) {
                    C20843c0 m120602N0 = AbstractC23306f.m120602N0();
                    AbstractC19074t.m100207e(m120602N0, "provideMyCloudCollectionManager(...)");
                    C20843c0.m108986b0(m120602N0, false, new ArrayList(), 1, null);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f(C21373a.f104232b, e11);
            }
            return c21375c;
        }
    }

    /* renamed from: jw.a$g */
    /* loaded from: classes4.dex */
    public static final class g extends AbstractC0939u {
        g() {
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            boolean z11;
            try {
                C7960e.m41971c6().m42223Ob("204278670");
                MessageId m41531W = C7956b.Companion.m41573b().m41531W("204278670");
                if (m41531W != null) {
                    z11 = m41531W.m41059z();
                } else {
                    z11 = false;
                }
                AbstractC0924m0.m3233Lm(z11);
            } catch (Exception e11) {
                AbstractC23350e.m122776f(C21373a.f104232b, e11);
            }
        }
    }

    static {
        InterfaceC24854k m129210a;
        String mo100163c = AbstractC19061k0.m100169b(C21373a.class).mo100163c();
        if (mo100163c == null) {
            mo100163c = "FileTransferConfig";
        }
        f104232b = mo100163c;
        C29234i m145994a = AbstractC29235j.m145994a();
        f104233c = m145994a;
        f104234d = AbstractC29233h.m145991b(m145994a, b.f104245q);
        f104235e = AbstractC29233h.m145991b(m145994a, a.f104244q);
        f104236f = AbstractC29233h.m145991b(m145994a, f.f104248q);
        f104237g = AbstractC29233h.m145991b(m145994a, e.f104247q);
        f104238h = AbstractC0924m0.m3280Nb();
        m129210a = AbstractC24856m.m129210a(c.f104246q);
        f104242l = m129210a;
        f104243m = AbstractC0924m0.m3446T3();
    }

    private C21373a() {
    }

    /* renamed from: B */
    public final void m110767B(C21374b c21374b, JSONObject jSONObject) {
        boolean z11;
        if (jSONObject.optInt("enable", 0) > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        c21374b.m110820f(z11);
        c21374b.m110821g(jSONObject.optInt("max_msg", 10000));
        if (c21374b.m110817c() <= 0) {
            c21374b.m110821g(10000);
        }
        c21374b.m110822h(jSONObject.optLong("request_delay", 0L));
        if (c21374b.m110818d() < 0) {
            c21374b.m110822h(0L);
        }
        c21374b.m110823i(jSONObject.optInt("synced_version", 0));
    }

    /* renamed from: D */
    public final void m110768D(C26686g c26686g, JSONObject jSONObject) {
        int optInt = jSONObject.optInt("show_large_file_status");
        long optLong = jSONObject.optLong("large_file_size", 104857600L);
        long optLong2 = jSONObject.optLong("large_file_expire_time", 604800L);
        boolean z11 = true;
        if (optInt != 1) {
            z11 = false;
        }
        c26686g.m137059g(z11);
        c26686g.m137058f(optLong);
        c26686g.m137057e(optLong2);
    }

    /* renamed from: F */
    public final void m110769F(C21375c c21375c, JSONObject jSONObject) {
        C21956b.m114656f(f104232b, "parseMyCloudListingConfig(): " + jSONObject, null, 4, null);
        boolean z11 = false;
        if (jSONObject.optInt("enable", 0) > 0) {
            z11 = true;
        }
        c21375c.m110827d(z11);
        c21375c.m110826c(jSONObject.optInt("default_view_mode", C11598e.e.f60096p.ordinal()));
        if (!AbstractC0924m0.m3897ib()) {
            f104231a.m110793P(c21375c.m110824a());
        }
    }

    /* renamed from: G */
    public final void m110770G(ArrayList arrayList, JSONObject jSONObject) {
        String str;
        try {
            ArrayList arrayList2 = new ArrayList();
            JSONArray optJSONArray = jSONObject.optJSONArray("collection_thumbs");
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                for (int i11 = 0; i11 < length; i11++) {
                    Object obj = optJSONArray.get(i11);
                    if (obj instanceof String) {
                        str = (String) obj;
                    } else {
                        str = null;
                    }
                    if (str != null) {
                        arrayList2.add(str);
                    }
                }
                arrayList.clear();
                arrayList.addAll(arrayList2);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f104232b, e11);
        }
    }

    /* renamed from: f */
    private final void m110776f(C21374b c21374b) {
        C26893h.Companion.m138599b(c21374b);
        m110798j().m110815a(c21374b);
    }

    /* renamed from: o */
    private final boolean m110777o() {
        return AbstractC0924m0.m3309Ob();
    }

    /* renamed from: p */
    private final boolean m110778p() {
        return AbstractC0924m0.m2931Ba();
    }

    /* renamed from: q */
    private final boolean m110779q() {
        return AbstractC0924m0.m2960Ca();
    }

    /* renamed from: s */
    private final void m110780s() {
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new d());
        c0766k.mo1514Q4("204278670", 0, new TrackingSource((short) 1025));
    }

    /* renamed from: x */
    private final boolean m110781x() {
        return AbstractC0924m0.m3897ib();
    }

    /* renamed from: A */
    public final boolean m110782A() {
        if (!m110807w().m110825b() || m110781x()) {
            return false;
        }
        if (m110777o() && !AbstractC21935u.m114549p()) {
            return false;
        }
        return true;
    }

    /* renamed from: C */
    public final void m110783C(JSONObject jSONObject) {
        boolean z11;
        AbstractC19074t.m100208f(jSONObject, "jsonObject");
        boolean z12 = false;
        if (jSONObject.optInt("enable") == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 != f104238h) {
            m110780s();
            if (z11) {
                C0824j.m2153b(new g());
            }
        }
        m110789L(z11);
        try {
            int optInt = jSONObject.optInt("show_large_file_status");
            long optLong = jSONObject.optLong("large_file_size", 104857600L);
            long optLong2 = jSONObject.optLong("large_file_expire_time", 604800L);
            JSONArray optJSONArray = jSONObject.optJSONArray("collection_thumbs");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("show_large_file_status", optInt);
            jSONObject2.put("large_file_size", optLong);
            jSONObject2.put("large_file_expire_time", optLong2);
            jSONObject2.put("collection_thumbs", optJSONArray);
            AbstractC0924m0.m3262Mm(jSONObject2.toString());
            C26686g m110803r = m110803r();
            if (optInt == 1) {
                z12 = true;
            }
            m110803r.m137059g(z12);
            m110803r.m137058f(optLong);
            m110803r.m137057e(optLong2);
            m110770G(m110804t(), jSONObject);
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f104232b, e11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0039 A[Catch: Exception -> 0x0026, TryCatch #0 {Exception -> 0x0026, blocks: (B:3:0x0005, B:6:0x0012, B:9:0x001f, B:12:0x0029, B:14:0x0039, B:15:0x003c, B:18:0x004b, B:20:0x0061, B:24:0x0069), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
    /* renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m110784E(JSONObject jSONObject) {
        boolean z11;
        String str;
        JSONObject optJSONObject;
        String jSONObject2;
        AbstractC19074t.m100208f(jSONObject, "config");
        try {
            boolean z12 = false;
            if (jSONObject.optInt("enable_new_offline", 0) > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            AbstractC0924m0.m3053Fg(z11);
            JSONObject optJSONObject2 = jSONObject.optJSONObject("auto_sync_msg");
            String str2 = "";
            if (optJSONObject2 != null) {
                str = optJSONObject2.toString();
                if (str == null) {
                }
                C21374b c21374b = new C21374b(false, 0, 0L, 0, 15, null);
                if (optJSONObject2 != null) {
                    m110767B(c21374b, optJSONObject2);
                }
                m110776f(c21374b);
                AbstractC0924m0.m3667al(str);
                if (jSONObject.optInt("enable_attachment", 0) > 0) {
                    z12 = true;
                }
                AbstractC0924m0.m3313Of(z12);
                AbstractC0924m0.m4381yk(jSONObject.optInt("max_send", 10));
                optJSONObject = jSONObject.optJSONObject("listing_mode");
                if (optJSONObject != null && (jSONObject2 = optJSONObject.toString()) != null) {
                    str2 = jSONObject2;
                }
                AbstractC0924m0.m3757dl(str2);
            }
            str = "";
            C21374b c21374b2 = new C21374b(false, 0, 0L, 0, 15, null);
            if (optJSONObject2 != null) {
            }
            m110776f(c21374b2);
            AbstractC0924m0.m3667al(str);
            if (jSONObject.optInt("enable_attachment", 0) > 0) {
            }
            AbstractC0924m0.m3313Of(z12);
            AbstractC0924m0.m4381yk(jSONObject.optInt("max_send", 10));
            optJSONObject = jSONObject.optJSONObject("listing_mode");
            if (optJSONObject != null) {
                str2 = jSONObject2;
            }
            AbstractC0924m0.m3757dl(str2);
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f104232b, e11);
        }
    }

    /* renamed from: H */
    public final void m110785H() {
        f104233c.m145993b();
    }

    /* renamed from: I */
    public final void m110786I(boolean z11) {
        f104240j = z11;
    }

    /* renamed from: J */
    public final void m110787J(boolean z11) {
        f104239i = z11;
    }

    /* renamed from: K */
    public final void m110788K(int i11) {
        f104243m = i11;
    }

    /* renamed from: L */
    public final void m110789L(boolean z11) {
        f104238h = z11;
        AbstractC0924m0.m3204Km(z11);
    }

    /* renamed from: M */
    public final void m110790M() {
        AbstractC0924m0.m2967Ch(true);
    }

    /* renamed from: N */
    public final void m110791N() {
        AbstractC0924m0.m2996Dh(true);
    }

    /* renamed from: O */
    public final void m110792O(ContactProfile contactProfile) {
        f104241k = contactProfile;
    }

    /* renamed from: P */
    public final void m110793P(int i11) {
        AbstractC0924m0.m3727cl(i11);
        f104243m = i11;
    }

    /* renamed from: Q */
    public final void m110794Q() {
        AbstractC0924m0.m3787el(true);
    }

    /* renamed from: g */
    public final void m110795g() {
        if (f104238h) {
            m110789L(false);
        }
    }

    /* renamed from: h */
    public final boolean m110796h() {
        return f104240j;
    }

    /* renamed from: i */
    public final boolean m110797i() {
        return f104239i;
    }

    /* renamed from: j */
    public final C21374b m110798j() {
        return (C21374b) f104235e.getValue();
    }

    /* renamed from: k */
    public final int m110799k() {
        return f104243m;
    }

    /* renamed from: l */
    public final boolean m110800l() {
        return AbstractC0924m0.m3895i9();
    }

    /* renamed from: m */
    public final boolean m110801m() {
        return ((Boolean) f104234d.getValue()).booleanValue();
    }

    /* renamed from: n */
    public final boolean m110802n() {
        return f104238h;
    }

    /* renamed from: r */
    public final C26686g m110803r() {
        return (C26686g) f104242l.getValue();
    }

    /* renamed from: t */
    public final ArrayList m110804t() {
        return (ArrayList) f104237g.getValue();
    }

    /* renamed from: u */
    public final String m110805u() {
        int i11;
        String m114547n = AbstractC21935u.m114547n();
        if (m114547n == null || m114547n.length() == 0) {
            Resources resources = MainApplication.Companion.m35500c().getResources();
            if (f104238h) {
                i11 = AbstractC8020f0.str_saved_messages_title;
            } else {
                i11 = AbstractC8020f0.str_file_transfer;
            }
            m114547n = resources.getString(i11);
        }
        AbstractC19074t.m100205c(m114547n);
        return m114547n;
    }

    /* renamed from: v */
    public final int m110806v() {
        return AbstractC0924m0.m4335x3();
    }

    /* renamed from: w */
    public final C21375c m110807w() {
        return (C21375c) f104236f.getValue();
    }

    /* renamed from: y */
    public final boolean m110808y() {
        if (!f104238h || !m110800l() || m110778p()) {
            return false;
        }
        return true;
    }

    /* renamed from: z */
    public final boolean m110809z() {
        if (!f104238h || !m110800l() || m110779q()) {
            return false;
        }
        return true;
    }
}
