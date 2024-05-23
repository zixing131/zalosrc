package p246iw;

import ae.C0766k;
import ag0.AbstractC0837p0;
import am.AbstractC0924m0;
import am.C0927o;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.C7904b;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.p062db.C7959d;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import dg0.AbstractC17930e;
import dj.C17945a0;
import dj.C17969i0;
import dj.C18013y0;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19059j0;
import gg0.AbstractC19444a;
import gw.AbstractC19646n0;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import hn0.AbstractC20104d;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kw.C21955a;
import kw.C21956b;
import ln0.AbstractC22543l;
import me0.AbstractC23136l9;
import me0.AbstractC23262x6;
import mm0.AbstractC23350e;
import mw.AbstractC23463h;
import mw.C23459d;
import on0.AbstractC24341v;
import on0.C24329j;
import org.json.JSONArray;
import org.json.JSONObject;
import p246iw.C20843c0;
import p279jw.C21373a;
import p348mi.AbstractC23306f;
import p363nh.C23744a;
import p365nk.C23805a;
import p716zh.C32098s;
import pk.C24799c;
import pk.C24800d;
import pk.C24801e;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import qm0.AbstractC25332a0;
import qm0.AbstractC25368s;

/* renamed from: iw.c0 */
/* loaded from: classes4.dex */
public final class C20843c0 {
    public static final a Companion = new a(null);

    /* renamed from: A */
    private boolean f102431A;

    /* renamed from: B */
    private boolean f102432B;

    /* renamed from: a */
    private final InterfaceC24854k f102433a;

    /* renamed from: b */
    private final String f102434b;

    /* renamed from: c */
    private long f102435c;

    /* renamed from: d */
    private boolean f102436d;

    /* renamed from: e */
    private final List f102437e;

    /* renamed from: f */
    private final Map f102438f;

    /* renamed from: g */
    private final Map f102439g;

    /* renamed from: h */
    private final Map f102440h;

    /* renamed from: i */
    private final Map f102441i;

    /* renamed from: j */
    private final Map f102442j;

    /* renamed from: k */
    private final Map f102443k;

    /* renamed from: l */
    private final Map f102444l;

    /* renamed from: m */
    private boolean f102445m;

    /* renamed from: n */
    private final Map f102446n;

    /* renamed from: o */
    private String f102447o;

    /* renamed from: p */
    private String f102448p;

    /* renamed from: q */
    private final Map f102449q;

    /* renamed from: r */
    private int f102450r;

    /* renamed from: s */
    private int f102451s;

    /* renamed from: t */
    private boolean f102452t;

    /* renamed from: u */
    private final Comparator f102453u;

    /* renamed from: v */
    private final Comparator f102454v;

    /* renamed from: w */
    private boolean f102455w;

    /* renamed from: x */
    private boolean f102456x;

    /* renamed from: y */
    private boolean f102457y;

    /* renamed from: z */
    private boolean f102458z;

    /* renamed from: iw.c0$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C20843c0 m109092a() {
            return b.f102459a.m109093a();
        }
    }

    /* renamed from: iw.c0$b */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a */
        public static final b f102459a = new b();

        /* renamed from: b */
        private static final C20843c0 f102460b = new C20843c0(null);

        private b() {
        }

        /* renamed from: a */
        public final C20843c0 m109093a() {
            return f102460b;
        }
    }

    /* renamed from: iw.c0$c */
    /* loaded from: classes4.dex */
    public static final class c implements InterfaceC20094a {

        /* renamed from: b */
        final /* synthetic */ byte f102462b;

        /* renamed from: c */
        final /* synthetic */ long f102463c;

        /* renamed from: d */
        final /* synthetic */ ArrayList f102464d;

        /* renamed from: e */
        final /* synthetic */ boolean f102465e;

        /* renamed from: f */
        final /* synthetic */ boolean f102466f;

        /* renamed from: g */
        final /* synthetic */ C0766k f102467g;

        c(byte b11, long j11, ArrayList arrayList, boolean z11, boolean z12, C0766k c0766k) {
            this.f102462b = b11;
            this.f102463c = j11;
            this.f102464d = arrayList;
            this.f102465e = z11;
            this.f102466f = z12;
            this.f102467g = c0766k;
        }

        /* renamed from: e */
        public static final void m109096e(C20843c0 c20843c0, long j11, byte b11, boolean z11, int i11, boolean z12) {
            AbstractC19074t.m100208f(c20843c0, "this$0");
            C24799c m109091x0 = c20843c0.m109091x0(j11);
            if (m109091x0 != null) {
                C23459d.f113954a.m123167g(null, m109091x0, b11, z11, i11, "", z12);
            }
        }

        /* renamed from: f */
        public static final void m109097f(C20843c0 c20843c0, long j11, byte b11, boolean z11, C20096c c20096c, C19059j0 c19059j0) {
            AbstractC19074t.m100208f(c20843c0, "this$0");
            AbstractC19074t.m100208f(c20096c, "$this_apply");
            AbstractC19074t.m100208f(c19059j0, "$msgError");
            C24799c m109091x0 = c20843c0.m109091x0(j11);
            if (m109091x0 != null) {
                C23459d.m123160h(C23459d.f113954a, null, m109091x0, b11, z11, c20096c.m104491c(), (CharSequence) c19059j0.f94941p, false, 64, null);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            String m127114D;
            C20843c0.this.f102431A = false;
            C19059j0 c19059j0 = new C19059j0();
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.unknown_error);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            c19059j0.f94941p = m118743r0;
            if (this.f102462b == 0) {
                C23744a.Companion.m124119a().m124116d(5210, new Object[0]);
            }
            if (c20096c != null) {
                String m104493e = c20096c.m104493e();
                AbstractC19074t.m100207e(m104493e, "getMessageBase(...)");
                m127114D = AbstractC24341v.m127114D(m104493e, "(" + c20096c.m104491c() + ")", "", false, 4, null);
                c19059j0.f94941p = m127114D;
            }
            if (c20096c != null) {
                AbstractC19444a.m101694b(new Runnable() { // from class: iw.e0

                    /* renamed from: q */
                    public final /* synthetic */ long f102509q;

                    /* renamed from: r */
                    public final /* synthetic */ byte f102510r;

                    /* renamed from: s */
                    public final /* synthetic */ boolean f102511s;

                    /* renamed from: t */
                    public final /* synthetic */ C20096c f102512t;

                    /* renamed from: u */
                    public final /* synthetic */ C19059j0 f102513u;

                    public /* synthetic */ RunnableC20847e0(long j11, byte b11, boolean z11, C20096c c20096c2, C19059j0 c19059j02) {
                        r2 = j11;
                        r4 = b11;
                        r5 = z11;
                        r6 = c20096c2;
                        r7 = c19059j02;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C20843c0.c.m109097f(C20843c0.this, r2, r4, r5, r6, r7);
                    }
                }, 800L);
            }
            String str = this.f102467g.f2541a;
            AbstractC19074t.m100207e(str, "TAG");
            C21956b.m114654d(str, "addOrRemoveItemOfCollection(): FAILED. Error=" + c20096c2, C21956b.d.f108096s);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            JSONObject optJSONObject;
            C20843c0.this.f102431A = false;
            AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type org.json.JSONObject");
            JSONObject jSONObject = (JSONObject) obj;
            int optInt = jSONObject.optInt("error_code", 0);
            if (optInt == 0 && (optJSONObject = jSONObject.optJSONObject("data")) != null) {
                C20843c0.this.m108961Q0(this.f102463c, this.f102462b, optJSONObject.optJSONArray("success"), optJSONObject.optLong("lastModifiedItemTime", 0L), optJSONObject.optBoolean("needResync", false));
            }
            if (this.f102462b == 0) {
                C23744a.Companion.m124119a().m124116d(5210, new Object[0]);
            } else {
                C23744a.Companion.m124119a().m124116d(5214, Long.valueOf(this.f102463c), this.f102464d);
            }
            AbstractC19444a.m101694b(new Runnable() { // from class: iw.d0

                /* renamed from: q */
                public final /* synthetic */ long f102498q;

                /* renamed from: r */
                public final /* synthetic */ byte f102499r;

                /* renamed from: s */
                public final /* synthetic */ boolean f102500s;

                /* renamed from: t */
                public final /* synthetic */ int f102501t;

                /* renamed from: u */
                public final /* synthetic */ boolean f102502u;

                public /* synthetic */ RunnableC20845d0(long j11, byte b11, boolean z11, int optInt2, boolean z12) {
                    r2 = j11;
                    r4 = b11;
                    r5 = z11;
                    r6 = optInt2;
                    r7 = z12;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C20843c0.c.m109096e(C20843c0.this, r2, r4, r5, r6, r7);
                }
            }, 800L);
        }
    }

    /* renamed from: iw.c0$d */
    /* loaded from: classes4.dex */
    public static final class d implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ List f102468a;

        /* renamed from: b */
        final /* synthetic */ C20843c0 f102469b;

        d(List list, C20843c0 c20843c0) {
            this.f102468a = list;
            this.f102469b = c20843c0;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "errorMessage");
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, C0927o.f3427r);
            try {
                JSONObject optJSONObject = ((JSONObject) obj).optJSONObject("data");
                if (optJSONObject != null) {
                    String optString = optJSONObject.optString("friendId");
                    if (AbstractC19074t.m100204b("204278670", optString)) {
                        ArrayList arrayList = new ArrayList();
                        JSONArray jSONArray = optJSONObject.getJSONArray("items");
                        int length = jSONArray.length();
                        for (int i11 = 0; i11 < length; i11++) {
                            Object obj2 = jSONArray.get(i11);
                            AbstractC19074t.m100206d(obj2, "null cannot be cast to non-null type org.json.JSONObject");
                            arrayList.add(new C7904b((JSONObject) obj2, optString));
                        }
                        ArrayList arrayList2 = new ArrayList();
                        HashMap hashMap = new HashMap();
                        for (C17945a0 c17945a0 : this.f102468a) {
                            arrayList2.add(c17945a0.m95029V3());
                            String valueOf = String.valueOf(AbstractC19646n0.m102878B(c17945a0.m95041W4(), false));
                            if (hashMap.containsKey(valueOf)) {
                                Object obj3 = hashMap.get(valueOf);
                                AbstractC19074t.m100205c(obj3);
                                hashMap.put(valueOf, Integer.valueOf(((Number) obj3).intValue() + 1));
                            } else {
                                hashMap.put(valueOf, 1);
                            }
                        }
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            C7904b c7904b = (C7904b) it.next();
                            if (c7904b.m40778p()) {
                                MessageId messageId = c7904b.f42747s;
                                if (messageId != null) {
                                    arrayList2.add(messageId);
                                }
                                String valueOf2 = String.valueOf(AbstractC19646n0.m102878B(c7904b.f42746r, false));
                                if (hashMap.containsKey(valueOf2)) {
                                    Object obj4 = hashMap.get(valueOf2);
                                    AbstractC19074t.m100205c(obj4);
                                    hashMap.put(valueOf2, Integer.valueOf(((Number) obj4).intValue() + 1));
                                } else {
                                    hashMap.put(valueOf2, 1);
                                }
                            }
                        }
                        if (!arrayList2.isEmpty()) {
                            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_pin_collection_name);
                            AbstractC19074t.m100207e(m118743r0, "getString(...)");
                            C20843c0.m109030t0(this.f102469b, new C24799c(0L, m118743r0, 0, 0L, "", 0L, "", 0L, null, false, false, 1965, null), arrayList2, C21955a.f108070a.m114641h("", hashMap, true), true, false, false, false, 112, null);
                            return;
                        }
                        AbstractC0924m0.m3754di(true);
                    }
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
    }

    /* renamed from: iw.c0$e */
    /* loaded from: classes4.dex */
    public static final class e implements InterfaceC20094a {

        /* renamed from: b */
        final /* synthetic */ boolean f102471b;

        /* renamed from: c */
        final /* synthetic */ boolean f102472c;

        /* renamed from: d */
        final /* synthetic */ ArrayList f102473d;

        /* renamed from: e */
        final /* synthetic */ boolean f102474e;

        /* renamed from: f */
        final /* synthetic */ boolean f102475f;

        /* renamed from: g */
        final /* synthetic */ C0766k f102476g;

        e(boolean z11, boolean z12, ArrayList arrayList, boolean z13, boolean z14, C0766k c0766k) {
            this.f102471b = z11;
            this.f102472c = z12;
            this.f102473d = arrayList;
            this.f102474e = z13;
            this.f102475f = z14;
            this.f102476g = c0766k;
        }

        /* renamed from: e */
        public static final void m109100e() {
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_create_new_collection_success);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            C23744a.Companion.m124119a().m124116d(5211, 0, m118743r0, "");
        }

        /* renamed from: f */
        public static final void m109101f(C20096c c20096c, C19059j0 c19059j0) {
            AbstractC19074t.m100208f(c19059j0, "$msgError");
            if (c20096c != null) {
                C23744a.Companion.m124119a().m124116d(5211, Integer.valueOf(c20096c.m104491c()), "", c19059j0.f94941p);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            String m127114D;
            C20843c0.this.m109064N1(false);
            C19059j0 c19059j0 = new C19059j0();
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.error_unknown);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            c19059j0.f94941p = m118743r0;
            if (c20096c != null) {
                if (this.f102471b) {
                    if (c20096c.m104491c() == -109) {
                        AbstractC0924m0.m3370Qe(true);
                    }
                } else {
                    String m104493e = c20096c.m104493e();
                    AbstractC19074t.m100207e(m104493e, "getMessageBase(...)");
                    m127114D = AbstractC24341v.m127114D(m104493e, "(" + c20096c.m104491c() + ")", "", false, 4, null);
                    c19059j0.f94941p = m127114D;
                }
            }
            if (!this.f102471b) {
                if (true ^ this.f102473d.isEmpty()) {
                    C23744a.Companion.m124119a().m124116d(5210, new Object[0]);
                }
                AbstractC19444a.m101694b(new Runnable() { // from class: iw.f0

                    /* renamed from: q */
                    public final /* synthetic */ C19059j0 f102517q;

                    public /* synthetic */ RunnableC20849f0(C19059j0 c19059j02) {
                        r2 = c19059j02;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C20843c0.e.m109101f(C20096c.this, r2);
                    }
                }, 500L);
            }
            String str = this.f102476g.f2541a;
            AbstractC19074t.m100207e(str, "TAG");
            C21956b.m114654d(str, "createCollectionInfo(): FAILED. Error=" + c20096c, C21956b.d.f108096s);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            JSONObject optJSONObject;
            boolean z11;
            C20843c0.this.m109064N1(false);
            AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type org.json.JSONObject");
            JSONObject jSONObject = (JSONObject) obj;
            if (jSONObject.optInt("error_code", 0) == 0 && (optJSONObject = jSONObject.optJSONObject("data")) != null) {
                C20843c0 c20843c0 = C20843c0.this;
                boolean z12 = this.f102471b;
                boolean z13 = this.f102472c;
                ArrayList arrayList = this.f102473d;
                boolean z14 = this.f102474e;
                boolean z15 = this.f102475f;
                JSONObject optJSONObject2 = optJSONObject.optJSONObject("collectionInfo");
                JSONArray optJSONArray = optJSONObject.optJSONArray("listMsgId");
                boolean optBoolean = optJSONObject.optBoolean("needResync", false);
                long optLong = optJSONObject.optLong("lastModifiedInfoTime", 0L);
                if ((!z12 || z13) && (!arrayList.isEmpty())) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                c20843c0.m108967T0(optJSONObject2, optJSONArray, optLong, optBoolean, z11, z14, z15);
                if (z12) {
                    AbstractC0924m0.m3754di(true);
                    AbstractC0924m0.m3370Qe(true);
                }
            }
            if (!this.f102471b || this.f102472c) {
                if (!this.f102473d.isEmpty()) {
                    C23744a.Companion.m124119a().m124116d(5210, new Object[0]);
                } else {
                    AbstractC19444a.m101694b(new Runnable() { // from class: iw.g0
                        @Override // java.lang.Runnable
                        public final void run() {
                            C20843c0.e.m109100e();
                        }
                    }, 500L);
                }
            }
        }
    }

    /* renamed from: iw.c0$f */
    /* loaded from: classes4.dex */
    public static final class f implements InterfaceC20094a {

        /* renamed from: b */
        final /* synthetic */ boolean f102478b;

        /* renamed from: c */
        final /* synthetic */ boolean f102479c;

        /* renamed from: d */
        final /* synthetic */ C0766k f102480d;

        /* renamed from: e */
        final /* synthetic */ long f102481e;

        f(boolean z11, boolean z12, C0766k c0766k, long j11) {
            this.f102478b = z11;
            this.f102479c = z12;
            this.f102480d = c0766k;
            this.f102481e = j11;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            C20843c0.this.m109066O1(false);
            C23744a.Companion.m124119a().m124116d(5209, new Object[0]);
            String str = this.f102480d.f2541a;
            AbstractC19074t.m100207e(str, "TAG");
            C21956b.m114654d(str, "getListCollectionInfo(): FAILED. Error=" + c20096c, C21956b.d.f108096s);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0119  */
        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void mo927b(Object obj) {
            JSONObject optJSONObject;
            boolean z11;
            boolean z12;
            boolean z13;
            boolean z14;
            C20843c0.this.m109066O1(false);
            AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type org.json.JSONObject");
            JSONObject jSONObject = (JSONObject) obj;
            if (jSONObject.optInt("error_code", 0) == 0 && (optJSONObject = jSONObject.optJSONObject("data")) != null) {
                boolean z15 = this.f102478b;
                boolean z16 = this.f102479c;
                C0766k c0766k = this.f102480d;
                C20843c0 c20843c0 = C20843c0.this;
                long j11 = this.f102481e;
                JSONArray optJSONArray = optJSONObject.optJSONArray("listInfo");
                boolean optBoolean = optJSONObject.optBoolean("hasMore");
                long optLong = optJSONObject.optLong("lastCollectionId");
                long optLong2 = optJSONObject.optLong("lastModifiedInfoTime", 0L);
                if (z15 && z16) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (optJSONArray != null) {
                    AbstractC19074t.m100205c(optJSONArray);
                    if (optJSONArray.length() > 0) {
                        z12 = true;
                        if (!z11) {
                            if (z12) {
                                String str = c0766k.f2541a;
                                AbstractC19074t.m100207e(str, "TAG");
                                C21956b.m114657g(str, "getListCollectionInfo(): First request auto sync isOutDate=" + z12);
                                int m41783f0 = C7959d.Companion.m41850e().m41783f0();
                                String str2 = c0766k.f2541a;
                                AbstractC19074t.m100207e(str2, "TAG");
                                C21956b.m114657g(str2, "Delete list collection info in DB: numDeleted=" + m41783f0);
                                c20843c0.m109060L1(optBoolean);
                                c20843c0.m109062M1(optLong);
                                AbstractC0924m0.m3403Ri(optLong2);
                                if (!c20843c0.f102445m && c20843c0.m109052E0()) {
                                    z14 = false;
                                } else {
                                    z14 = true;
                                }
                                c20843c0.f102445m = z14;
                                c20843c0.m108979Y0(optJSONArray, z15);
                                return;
                            }
                            String str3 = c0766k.f2541a;
                            AbstractC19074t.m100207e(str3, "TAG");
                            C21956b.m114657g(str3, "getListCollectionInfo(): First request auto sync isOutDate=" + z12);
                            boolean m2991Dc = AbstractC0924m0.m2991Dc();
                            if (!m2991Dc) {
                                c20843c0.m109062M1(C7959d.Companion.m41850e().m41809n1());
                                c20843c0.m109047B0(j11, 0L, z15, false);
                                String str4 = c0766k.f2541a;
                                AbstractC19074t.m100207e(str4, "TAG");
                                C21956b.m114657g(str4, "getListCollectionInfo(): isPrevSyncDone=" + m2991Dc + " -> continue sync data from lastCollectionId=" + c20843c0.m109053F0());
                                return;
                            }
                            return;
                        }
                        c20843c0.m109060L1(optBoolean);
                        c20843c0.m109062M1(optLong);
                        AbstractC0924m0.m3403Ri(optLong2);
                        if (!c20843c0.f102445m && c20843c0.m109052E0()) {
                            z13 = false;
                        } else {
                            z13 = true;
                        }
                        c20843c0.f102445m = z13;
                        c20843c0.m108979Y0(optJSONArray, z15);
                        return;
                    }
                }
                z12 = false;
                if (!z11) {
                }
            }
        }
    }

    /* renamed from: iw.c0$g */
    /* loaded from: classes4.dex */
    public static final class g implements InterfaceC20094a {

        /* renamed from: b */
        final /* synthetic */ boolean f102483b;

        /* renamed from: c */
        final /* synthetic */ long f102484c;

        /* renamed from: d */
        final /* synthetic */ boolean f102485d;

        /* renamed from: e */
        final /* synthetic */ C0766k f102486e;

        g(boolean z11, long j11, boolean z12, C0766k c0766k) {
            this.f102483b = z11;
            this.f102484c = j11;
            this.f102485d = z12;
            this.f102486e = c0766k;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            C20843c0.this.m109068P1(false);
            Map map = C20843c0.this.f102439g;
            AbstractC19074t.m100207e(map, "access$getMMapListSyncItemDone$p(...)");
            map.put(Long.valueOf(this.f102484c), Long.valueOf(this.f102484c));
            if (this.f102483b) {
                AbstractC23306f.m120602N0().m109072T1(6);
                C23744a.Companion.m124119a().m124116d(5207, 6, Long.valueOf(this.f102484c));
            } else {
                C23744a.Companion.m124119a().m124116d(5202, Long.valueOf(this.f102484c));
            }
            String str = this.f102486e.f2541a;
            AbstractC19074t.m100207e(str, "TAG");
            C21956b.m114654d(str, "getListItemOfCollection(): FAILED. Error=" + c20096c, C21956b.d.f108096s);
        }

        /* JADX WARN: Removed duplicated region for block: B:39:0x01e3 A[Catch: Exception -> 0x00c4, TRY_LEAVE, TryCatch #1 {Exception -> 0x00c4, blocks: (B:3:0x0006, B:5:0x001a, B:7:0x0022, B:11:0x0068, B:20:0x008f, B:23:0x00a1, B:24:0x00c9, B:26:0x00f0, B:27:0x00f3, B:29:0x0103, B:30:0x0106, B:31:0x0132, B:33:0x0142, B:35:0x015f, B:36:0x01af, B:37:0x01d3, B:39:0x01e3), top: B:2:0x0006 }] */
        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void mo927b(Object obj) {
            JSONObject optJSONObject;
            MessageId m41062g;
            boolean z11;
            C24801e c24801e;
            ArrayList m131500h;
            g gVar = this;
            try {
                C20843c0.this.m109068P1(false);
                AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type org.json.JSONObject");
                JSONObject jSONObject = (JSONObject) obj;
                if (jSONObject.optInt("error_code", 0) == 0 && (optJSONObject = jSONObject.optJSONObject("data")) != null) {
                    C20843c0 c20843c0 = C20843c0.this;
                    long j11 = gVar.f102484c;
                    boolean z12 = gVar.f102483b;
                    boolean z13 = gVar.f102485d;
                    C0766k c0766k = gVar.f102486e;
                    boolean optBoolean = optJSONObject.optBoolean("hasMore", false);
                    JSONObject optJSONObject2 = optJSONObject.optJSONObject("lastMsgId");
                    if (optJSONObject2 != null) {
                        try {
                            AbstractC19074t.m100205c(optJSONObject2);
                            m41062g = MessageId.C7932a.m41062g(MessageId.Companion, String.valueOf(optJSONObject2.optLong("cli", 0L)), String.valueOf(optJSONObject2.optLong("glb", 0L)), c20843c0.f102434b, null, 8, null);
                        } catch (Exception e11) {
                            e = e11;
                            if (gVar.f102483b) {
                                AbstractC23306f.m120602N0().m109072T1(6);
                                C23744a.Companion.m124119a().m124116d(5207, 6, Long.valueOf(gVar.f102484c));
                            } else {
                                C23744a.Companion.m124119a().m124116d(5202, Long.valueOf(gVar.f102484c));
                            }
                            AbstractC23350e.m122778h(e);
                            return;
                        }
                    } else {
                        m41062g = null;
                    }
                    long optLong = optJSONObject.optLong("lastModifiedItemTime", 0L);
                    c20843c0.m108989c0(j11);
                    JSONArray optJSONArray = optJSONObject.optJSONArray("listMsgId");
                    if (optJSONArray != null) {
                        AbstractC19074t.m100205c(optJSONArray);
                        if (optJSONArray.length() > 0) {
                            z11 = true;
                            if (!z12 && z13) {
                                if (z11) {
                                    C24801e c24801e2 = (C24801e) c20843c0.f102438f.get(Long.valueOf(j11));
                                    if (c24801e2 != null) {
                                        if (optBoolean) {
                                            AbstractC0924m0.m3550Wk(true);
                                            C23744a.Companion.m124119a().m124116d(5207, 5, Long.valueOf(j11));
                                        }
                                        String str = c0766k.f2541a;
                                        AbstractC19074t.m100207e(str, "TAG");
                                        C21956b.m114657g(str, "getListItemOfCollection(): First request auto sync isOutDate=" + z11);
                                        HashMap hashMap = (HashMap) c20843c0.f102443k.get(Long.valueOf(j11));
                                        if (hashMap != null) {
                                            hashMap.clear();
                                        }
                                        ArrayList arrayList = (ArrayList) c20843c0.f102440h.get(Long.valueOf(j11));
                                        if (arrayList != null) {
                                            arrayList.clear();
                                        }
                                        C7959d.a aVar = C7959d.Companion;
                                        C7959d m41850e = aVar.m41850e();
                                        m131500h = AbstractC25368s.m131500h(Long.valueOf(j11));
                                        m41850e.m41831v0(m131500h);
                                        c24801e2.m128863f(optBoolean);
                                        c24801e2.m128864g(m41062g);
                                        aVar.m41850e().m41704G3(j11, c24801e2);
                                        c20843c0.m108984a1(j11, optJSONArray, optLong, z12, z13);
                                    }
                                } else {
                                    C24801e c24801e3 = (C24801e) c20843c0.f102438f.get(Long.valueOf(j11));
                                    if (c24801e3 != null) {
                                        String str2 = c0766k.f2541a;
                                        AbstractC19074t.m100207e(str2, "TAG");
                                        C21956b.m114657g(str2, "getListItemOfCollection(): First request auto sync isOutDate=" + z11);
                                        if (c24801e3.m128859b()) {
                                            AbstractC0924m0.m3550Wk(true);
                                            C23744a.Companion.m124119a().m124116d(5207, 5, Long.valueOf(j11));
                                            c24801e3.m128865h(0L);
                                            String str3 = c0766k.f2541a;
                                            AbstractC19074t.m100207e(str3, "TAG");
                                            C21956b.m114657g(str3, "getListItemOfCollection(): continue sync data from lastItem=" + c24801e3.m128860c());
                                            c20843c0.m109050D0(j11, c24801e3.m128860c(), c24801e3.m128861d(), z12, false);
                                        } else {
                                            AbstractC23306f.m120602N0().m109072T1(7);
                                            AbstractC0924m0.m3521Vk(true);
                                            Map map = c20843c0.f102439g;
                                            AbstractC19074t.m100207e(map, "access$getMMapListSyncItemDone$p(...)");
                                            map.put(Long.valueOf(j11), Long.valueOf(j11));
                                            c20843c0.m108994e0(j11);
                                        }
                                    }
                                }
                            } else {
                                c24801e = (C24801e) c20843c0.f102438f.get(Long.valueOf(j11));
                                if (c24801e != null) {
                                    c24801e.m128863f(optBoolean);
                                    c24801e.m128864g(m41062g);
                                    C7959d.Companion.m41850e().m41704G3(j11, c24801e);
                                    c20843c0.m108984a1(j11, optJSONArray, optLong, z12, z13);
                                }
                            }
                        }
                    }
                    z11 = false;
                    if (!z12) {
                    }
                    c24801e = (C24801e) c20843c0.f102438f.get(Long.valueOf(j11));
                    if (c24801e != null) {
                    }
                }
            } catch (Exception e12) {
                e = e12;
                gVar = this;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: iw.c0$h */
    /* loaded from: classes4.dex */
    public static final class h extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final h f102487q = new h();

        h() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C23805a mo12V4() {
            return AbstractC23306f.m120605O0();
        }
    }

    /* renamed from: iw.c0$i */
    /* loaded from: classes4.dex */
    public static final class i implements InterfaceC20094a {

        /* renamed from: b */
        final /* synthetic */ C0766k f102489b;

        i(C0766k c0766k) {
            this.f102489b = c0766k;
        }

        /* renamed from: e */
        public static final void m109105e(int i11) {
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_delete_collection_success);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            C23744a.Companion.m124119a().m124116d(5213, Integer.valueOf(i11), m118743r0, "");
        }

        /* renamed from: f */
        public static final void m109106f(C20096c c20096c, C19059j0 c19059j0) {
            AbstractC19074t.m100208f(c19059j0, "$msgError");
            if (c20096c != null) {
                C23744a.Companion.m124119a().m124116d(5213, Integer.valueOf(c20096c.m104491c()), "", c19059j0.f94941p);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            String m127114D;
            C20843c0.this.m109069Q1(false);
            C19059j0 c19059j0 = new C19059j0();
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.error_unknown);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            c19059j0.f94941p = m118743r0;
            if (c20096c != null) {
                String m104493e = c20096c.m104493e();
                AbstractC19074t.m100207e(m104493e, "getMessageBase(...)");
                m127114D = AbstractC24341v.m127114D(m104493e, "(" + c20096c.m104491c() + ")", "", false, 4, null);
                c19059j0.f94941p = m127114D;
            }
            AbstractC19444a.m101694b(new Runnable() { // from class: iw.h0

                /* renamed from: q */
                public final /* synthetic */ C19059j0 f102525q;

                public /* synthetic */ RunnableC20853h0(C19059j0 c19059j02) {
                    r2 = c19059j02;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C20843c0.i.m109106f(C20096c.this, r2);
                }
            }, 500L);
            String str = this.f102489b.f2541a;
            AbstractC19074t.m100207e(str, "TAG");
            C21956b.m114654d(str, "removeCollectionInfo(): FAILED. Error=" + c20096c, C21956b.d.f108096s);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            C20843c0.this.m109069Q1(false);
            AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type org.json.JSONObject");
            JSONObject jSONObject = (JSONObject) obj;
            int optInt = jSONObject.optInt("error_code", 0);
            if (optInt == 0) {
                JSONObject optJSONObject = jSONObject.optJSONObject("data");
                if (optJSONObject != null) {
                    C20843c0.this.m109006i1(optJSONObject.optJSONArray("success"), optJSONObject.optLong("lastModifiedInfoTime", 0L), optJSONObject.optBoolean("needResync", false));
                }
                AbstractC19444a.m101694b(new Runnable() { // from class: iw.i0

                    /* renamed from: p */
                    public final /* synthetic */ int f102527p;

                    public /* synthetic */ RunnableC20855i0(int optInt2) {
                        r1 = optInt2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C20843c0.i.m109105e(r1);
                    }
                }, 500L);
            }
        }
    }

    /* renamed from: iw.c0$j */
    /* loaded from: classes4.dex */
    public static final class j implements InterfaceC20094a {

        /* renamed from: b */
        final /* synthetic */ C0766k f102491b;

        j(C0766k c0766k) {
            this.f102491b = c0766k;
        }

        /* renamed from: e */
        public static final void m109109e(int i11) {
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_update_collection_success);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            C23744a.Companion.m124119a().m124116d(5212, Integer.valueOf(i11), m118743r0, "");
        }

        /* renamed from: f */
        public static final void m109110f(C20096c c20096c, C19059j0 c19059j0) {
            AbstractC19074t.m100208f(c19059j0, "$msgError");
            if (c20096c != null) {
                C23744a.Companion.m124119a().m124116d(5212, Integer.valueOf(c20096c.m104491c()), "", c19059j0.f94941p);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            String m127114D;
            C20843c0.this.m109070R1(false);
            C19059j0 c19059j0 = new C19059j0();
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.error_unknown);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            c19059j0.f94941p = m118743r0;
            if (c20096c != null) {
                String m104493e = c20096c.m104493e();
                AbstractC19074t.m100207e(m104493e, "getMessageBase(...)");
                m127114D = AbstractC24341v.m127114D(m104493e, "(" + c20096c.m104491c() + ")", "", false, 4, null);
                c19059j0.f94941p = m127114D;
            }
            AbstractC19444a.m101694b(new Runnable() { // from class: iw.j0

                /* renamed from: q */
                public final /* synthetic */ C19059j0 f102530q;

                public /* synthetic */ RunnableC20857j0(C19059j0 c19059j02) {
                    r2 = c19059j02;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C20843c0.j.m109110f(C20096c.this, r2);
                }
            }, 500L);
            String str = this.f102491b.f2541a;
            AbstractC19074t.m100207e(str, "TAG");
            C21956b.m114654d(str, "updateCollectionInfo(): FAILED. Error=" + c20096c, C21956b.d.f108096s);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            C20843c0.this.m109070R1(false);
            AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type org.json.JSONObject");
            JSONObject jSONObject = (JSONObject) obj;
            int optInt = jSONObject.optInt("error_code", 0);
            if (optInt == 0) {
                JSONObject optJSONObject = jSONObject.optJSONObject("data");
                if (optJSONObject != null) {
                    C20843c0.this.m109012k1(optJSONObject.optJSONObject("collectionInfo"), optJSONObject.optLong("lastModifiedInfoTime", 0L), optJSONObject.optBoolean("needResync", false));
                }
                AbstractC19444a.m101694b(new Runnable() { // from class: iw.k0

                    /* renamed from: p */
                    public final /* synthetic */ int f102534p;

                    public /* synthetic */ RunnableC20859k0(int optInt2) {
                        r1 = optInt2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C20843c0.j.m109109e(r1);
                    }
                }, 500L);
            }
        }
    }

    public /* synthetic */ C20843c0(AbstractC19060k abstractC19060k) {
        this();
    }

    /* renamed from: A0 */
    public static final C20843c0 m108936A0() {
        return Companion.m109092a();
    }

    /* renamed from: B1 */
    public static final void m108938B1(long j11, C24801e c24801e) {
        AbstractC19074t.m100208f(c24801e, "$this_apply");
        C7959d.Companion.m41850e().m41704G3(j11, c24801e);
    }

    /* renamed from: E1 */
    private final void m108942E1(C24800d c24800d) {
        MessageId m128853f = c24800d.m128853f();
        if (m128853f != null) {
            long m128852e = c24800d.m128852e();
            if (this.f102440h.containsKey(Long.valueOf(m128852e))) {
                Object obj = this.f102440h.get(Long.valueOf(m128852e));
                AbstractC19074t.m100205c(obj);
                Iterator it = ((ArrayList) obj).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    AbstractC19074t.m100207e(next, "next(...)");
                    C24800d c24800d2 = (C24800d) next;
                    if (AbstractC19074t.m100204b(m128853f, c24800d2.m128853f())) {
                        Object obj2 = this.f102440h.get(Long.valueOf(m128852e));
                        AbstractC19074t.m100205c(obj2);
                        ((ArrayList) obj2).remove(c24800d2);
                        break;
                    }
                }
            }
            HashMap hashMap = (HashMap) this.f102443k.get(Long.valueOf(m128852e));
            if (hashMap != null) {
            }
        }
    }

    /* renamed from: F1 */
    private final void m108944F1(long j11, ArrayList arrayList) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f102442j.get(Long.valueOf(j11));
        if (linkedHashMap != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                linkedHashMap.remove(Long.valueOf(((MessageId) it.next()).m41045i()));
            }
            m109011k0(j11);
            AbstractC19444a.m101697e(new Runnable() { // from class: iw.i

                /* renamed from: p */
                public final /* synthetic */ long f102526p;

                public /* synthetic */ RunnableC20854i(long j112) {
                    r1 = j112;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C20843c0.m108946G1(r1);
                }
            });
        }
    }

    /* renamed from: G1 */
    public static final void m108946G1(long j11) {
        C23744a.Companion.m124119a().m124116d(5202, Long.valueOf(j11), Long.valueOf(System.currentTimeMillis()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x000e, code lost:            if (r7 != 4) goto L133;     */
    /* renamed from: H0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final String m108948H0(C17945a0 c17945a0, int i11) {
        C32098s c32098s;
        C32098s c32098s2;
        C18013y0 c18013y0 = null;
        String str = "";
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 3) {
                    str = c17945a0.m94929K2().f91011p;
                }
            }
            if (AbstractC19646n0.m103044x1(c17945a0.m95041W4())) {
                str = ((Object) "") + c17945a0.m95019U3() + ".";
            }
            if (AbstractC19646n0.m103011o1(c17945a0)) {
                String str2 = c17945a0.m94929K2().f91011p;
                if (str2 != null && str2.length() != 0) {
                    str = ((Object) str) + c17945a0.m94929K2().f91011p + ".";
                }
                String str3 = c17945a0.m94929K2().f91015t;
                if (str3 != null && str3.length() != 0) {
                    str = ((Object) str) + c17945a0.m94929K2().f91015t + ".";
                }
                C17969i0 m94929K2 = c17945a0.m94929K2();
                if (m94929K2 instanceof C18013y0) {
                    c18013y0 = (C18013y0) m94929K2;
                }
                if (c18013y0 != null && (c32098s2 = c18013y0.f91251B) != null) {
                    str = ((Object) str) + c32098s2.f147953c + ".";
                }
            }
        } else {
            if (AbstractC19646n0.m103044x1(c17945a0.m95041W4())) {
                str = ((Object) "") + c17945a0.m95019U3() + ".";
            }
            if (AbstractC19646n0.m103011o1(c17945a0) && AbstractC19646n0.m103011o1(c17945a0)) {
                String str4 = c17945a0.m94929K2().f91011p;
                if (str4 != null && str4.length() != 0) {
                    str = ((Object) str) + c17945a0.m94929K2().f91011p + ".";
                }
                String str5 = c17945a0.m94929K2().f91015t;
                if (str5 != null && str5.length() != 0) {
                    str = ((Object) str) + c17945a0.m94929K2().f91015t + ".";
                }
                C17969i0 m94929K22 = c17945a0.m94929K2();
                if (m94929K22 instanceof C18013y0) {
                    c18013y0 = (C18013y0) m94929K22;
                }
                if (c18013y0 != null && (c32098s = c18013y0.f91251B) != null) {
                    str = ((Object) str) + c32098s.f147953c + ".";
                }
            }
            if (AbstractC19646n0.m103003m1(c17945a0.m95041W4())) {
                str = ((Object) str) + c17945a0.m94929K2().f91011p + ".";
            }
        }
        if (str.length() > 0) {
            String m120003p = AbstractC23262x6.m120003p(str, true);
            AbstractC19074t.m100207e(m120003p, "convertSignToNoSign(...)");
            return m120003p;
        }
        return str;
    }

    /* renamed from: I0 */
    private final C23805a m108950I0() {
        return (C23805a) this.f102433a.getValue();
    }

    /* renamed from: I1 */
    private final void m108951I1() {
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: iw.o
            @Override // java.lang.Runnable
            public final void run() {
                C20843c0.m108953J1();
            }
        });
    }

    /* renamed from: J1 */
    public static final void m108953J1() {
        AbstractC0924m0.m3550Wk(false);
        AbstractC0924m0.m3521Vk(false);
    }

    /* renamed from: Q0 */
    public final void m108961Q0(long j11, byte b11, JSONArray jSONArray, long j12, boolean z11) {
        if (jSONArray != null) {
            try {
                ArrayList arrayList = new ArrayList();
                int length = jSONArray.length();
                for (int i11 = 0; i11 < length; i11++) {
                    Object obj = jSONArray.get(i11);
                    AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type org.json.JSONObject");
                    arrayList.add(C24800d.Companion.m128857a(j11, (JSONObject) obj));
                }
                Integer num = null;
                if (b11 == 0) {
                    ArrayList arrayList2 = new ArrayList();
                    if (arrayList.isEmpty()) {
                        return;
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        AbstractC19074t.m100207e(next, "next(...)");
                        C24800d c24800d = (C24800d) next;
                        MessageId m128853f = c24800d.m128853f();
                        if (m128853f != null) {
                            m108966T(this, c24800d, false, 2, null);
                            arrayList2.add(m128853f);
                        }
                    }
                    m108972W(j11, arrayList2);
                    AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: iw.b0

                        /* renamed from: p */
                        public final /* synthetic */ ArrayList f102425p;

                        public /* synthetic */ RunnableC20841b0(ArrayList arrayList3) {
                            r1 = arrayList3;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            C20843c0.m108963R0(r1);
                        }
                    });
                } else if (b11 == 1) {
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it2 = arrayList3.iterator();
                    while (it2.hasNext()) {
                        Object next2 = it2.next();
                        AbstractC19074t.m100207e(next2, "next(...)");
                        C24800d c24800d2 = (C24800d) next2;
                        MessageId m128853f2 = c24800d2.m128853f();
                        if (m128853f2 != null) {
                            m108942E1(c24800d2);
                            arrayList3.add(m128853f2);
                        }
                    }
                    m108944F1(j11, arrayList3);
                    AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: iw.b

                        /* renamed from: p */
                        public final /* synthetic */ long f102422p;

                        /* renamed from: q */
                        public final /* synthetic */ ArrayList f102423q;

                        /* renamed from: r */
                        public final /* synthetic */ byte f102424r;

                        public /* synthetic */ RunnableC20840b(long j112, ArrayList arrayList32, byte b112) {
                            r1 = j112;
                            r3 = arrayList32;
                            r4 = b112;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            C20843c0.m108965S0(r1, r3, r4);
                        }
                    });
                }
                ArrayList arrayList4 = (ArrayList) this.f102440h.get(Long.valueOf(j112));
                if (arrayList4 != null) {
                    num = Integer.valueOf(arrayList4.size());
                }
                C21956b.m114657g("SMLMyCloudCollection", "handleAddOrRemoveItemOfCollection(): type=" + ((int) b112) + " \nlistSuccess=" + arrayList32 + "\ncached on mem: collectionId=" + j112 + " size=" + num);
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
                return;
            }
        }
        m109005i0(j112, j12, z11);
    }

    /* renamed from: R0 */
    public static final void m108963R0(ArrayList arrayList) {
        AbstractC19074t.m100208f(arrayList, "$listItemSuccess");
        C7959d.Companion.m41850e().m41748S1(arrayList);
    }

    /* renamed from: S */
    private final boolean m108964S(C24800d c24800d, boolean z11) {
        MessageId m128853f = c24800d.m128853f();
        if (m128853f != null) {
            long m128852e = c24800d.m128852e();
            m108989c0(m128852e);
            Object obj = this.f102443k.get(Long.valueOf(m128852e));
            AbstractC19074t.m100205c(obj);
            if (!((HashMap) obj).containsKey(Long.valueOf(m128853f.m41045i()))) {
                if (z11) {
                    Object obj2 = this.f102440h.get(Long.valueOf(m128852e));
                    AbstractC19074t.m100205c(obj2);
                    ((ArrayList) obj2).add(0, c24800d);
                } else {
                    Object obj3 = this.f102440h.get(Long.valueOf(m128852e));
                    AbstractC19074t.m100205c(obj3);
                    ((ArrayList) obj3).add(c24800d);
                }
                Object obj4 = this.f102443k.get(Long.valueOf(m128852e));
                AbstractC19074t.m100205c(obj4);
                ((Map) obj4).put(Long.valueOf(m128853f.m41045i()), m128853f);
                return true;
            }
        }
        return false;
    }

    /* renamed from: S0 */
    public static final void m108965S0(long j11, ArrayList arrayList, byte b11) {
        AbstractC19074t.m100208f(arrayList, "$listItemSuccess");
        C21956b.m114657g("SMLMyCloudCollection", "handleAddOrRemoveItemOfCollection(): type=" + ((int) b11) + ", numItemDeleted=" + C7959d.Companion.m41850e().m41833w0(j11, arrayList));
    }

    /* renamed from: T */
    static /* synthetic */ boolean m108966T(C20843c0 c20843c0, C24800d c24800d, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return c20843c0.m108964S(c24800d, z11);
    }

    /* renamed from: T0 */
    public final void m108967T0(JSONObject jSONObject, JSONArray jSONArray, long j11, boolean z11, boolean z12, boolean z13, boolean z14) {
        List m131177E0;
        if (jSONObject != null) {
            C24799c m128845b = C24799c.Companion.m128845b(jSONObject);
            long m128824d = m128845b.m128824d();
            List list = this.f102437e;
            AbstractC19074t.m100207e(list, "mListCollectionInfo");
            List list2 = list;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    if (((C24799c) it.next()).m128824d() == m128824d) {
                        C21956b.m114657g("SMLMyCloudCollection", "handleCreateCollectionInfo(): is exist " + C24799c.Companion.m128846c(m128845b));
                        return;
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            if (m128845b.m128832l()) {
                this.f102437e.remove(m109056J0());
            }
            arrayList.addAll(this.f102437e);
            arrayList.add(m128845b);
            this.f102437e.clear();
            List list3 = this.f102437e;
            m131177E0 = AbstractC25332a0.m131177E0(arrayList, this.f102453u);
            list3.addAll(m131177E0);
            Map map = this.f102438f;
            AbstractC19074t.m100207e(map, "mMapInfoLoadItemCollection");
            map.put(Long.valueOf(m128845b.m128824d()), C24801e.Companion.m128866a(m128845b.m128829i()));
            m108989c0(m128824d);
            ArrayList arrayList2 = new ArrayList();
            if (jSONArray != null) {
                int length = jSONArray.length();
                for (int i11 = 0; i11 < length; i11++) {
                    Object obj = jSONArray.get(i11);
                    AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type org.json.JSONObject");
                    C24800d m128857a = C24800d.Companion.m128857a(m128824d, (JSONObject) obj);
                    if (m108966T(this, m128857a, false, 2, null)) {
                        arrayList2.add(m128857a);
                    }
                }
            }
            AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: iw.w

                /* renamed from: q */
                public final /* synthetic */ ArrayList f102558q;

                public /* synthetic */ RunnableC20872w(ArrayList arrayList22) {
                    r2 = arrayList22;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C20843c0.m108970V0(C24799c.this, r2);
                }
            });
            if ((!arrayList22.isEmpty()) && z12) {
                AbstractC19444a.m101694b(new Runnable() { // from class: iw.x

                    /* renamed from: q */
                    public final /* synthetic */ boolean f102560q;

                    /* renamed from: r */
                    public final /* synthetic */ boolean f102561r;

                    public /* synthetic */ RunnableC20873x(boolean z132, boolean z142) {
                        r2 = z132;
                        r3 = z142;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C20843c0.m108973W0(C24799c.this, r2, r3);
                    }
                }, 800L);
            }
            C23744a.Companion.m124119a().m124116d(5204, m128845b);
            if (m128845b.m128832l()) {
                AbstractC19444a.m101695c(new Runnable() { // from class: iw.y
                    public /* synthetic */ RunnableC20874y() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C20843c0.m108976X0(C24799c.this);
                    }
                });
            }
            C21956b.m114657g("SMLMyCloudCollection", "handleCreateCollectionInfo(): " + C24799c.Companion.m128846c(m128845b));
        }
        m109002h0(j11, z11);
    }

    /* renamed from: U0 */
    static /* synthetic */ void m108968U0(C20843c0 c20843c0, JSONObject jSONObject, JSONArray jSONArray, long j11, boolean z11, boolean z12, boolean z13, boolean z14, int i11, Object obj) {
        boolean z15;
        boolean z16;
        boolean z17;
        if ((i11 & 16) != 0) {
            z15 = false;
        } else {
            z15 = z12;
        }
        if ((i11 & 32) != 0) {
            z16 = false;
        } else {
            z16 = z13;
        }
        if ((i11 & 64) != 0) {
            z17 = false;
        } else {
            z17 = z14;
        }
        c20843c0.m108967T0(jSONObject, jSONArray, j11, z11, z15, z16, z17);
    }

    /* renamed from: V */
    public static /* synthetic */ void m108969V(C20843c0 c20843c0, long j11, ArrayList arrayList, byte b11, long j12, boolean z11, String str, boolean z12, int i11, Object obj) {
        String str2;
        boolean z13;
        if ((i11 & 32) != 0) {
            str2 = "";
        } else {
            str2 = str;
        }
        if ((i11 & 64) != 0) {
            z13 = false;
        } else {
            z13 = z12;
        }
        c20843c0.m109073U(j11, arrayList, b11, j12, z11, str2, z13);
    }

    /* renamed from: V0 */
    public static final void m108970V0(C24799c c24799c, ArrayList arrayList) {
        AbstractC19074t.m100208f(c24799c, "$collectionInfo");
        AbstractC19074t.m100208f(arrayList, "$listNeedInsertDB");
        C7959d.a aVar = C7959d.Companion;
        aVar.m41850e().m41744R1(c24799c);
        if (!arrayList.isEmpty()) {
            aVar.m41850e().m41748S1(arrayList);
        }
    }

    /* renamed from: V1 */
    private final void m108971V1(long j11) {
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: iw.n

            /* renamed from: q */
            public final /* synthetic */ long f102544q;

            public /* synthetic */ RunnableC20863n(long j112) {
                r2 = j112;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C20843c0.m108974W1(C20843c0.this, r2);
            }
        });
    }

    /* renamed from: W */
    private final void m108972W(long j11, ArrayList arrayList) {
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: iw.h

            /* renamed from: q */
            public final /* synthetic */ ArrayList f102522q;

            /* renamed from: r */
            public final /* synthetic */ long f102523r;

            public /* synthetic */ RunnableC20852h(ArrayList arrayList2, long j112) {
                r2 = arrayList2;
                r3 = j112;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C20843c0.m108975X(C20843c0.this, r2, r3);
            }
        });
    }

    /* renamed from: W0 */
    public static final void m108973W0(C24799c c24799c, boolean z11, boolean z12) {
        AbstractC19074t.m100208f(c24799c, "$collectionInfo");
        C23459d.f113954a.m123167g(null, c24799c, (byte) 0, z11, 0, "", z12);
    }

    /* renamed from: W1 */
    public static final void m108974W1(C20843c0 c20843c0, long j11) {
        AbstractC19074t.m100208f(c20843c0, "this$0");
        C24799c m109091x0 = c20843c0.m109091x0(j11);
        if (m109091x0 != null && m109091x0.m128831k()) {
            return;
        }
        c20843c0.m108989c0(j11);
        c20843c0.m108991d0(j11);
        C24801e c24801e = (C24801e) c20843c0.f102438f.get(Long.valueOf(j11));
        if (c24801e != null && !c20843c0.f102439g.containsKey(Long.valueOf(j11))) {
            c20843c0.m108951I1();
            c20843c0.m109050D0(j11, null, c24801e.m128861d(), true, true);
        }
    }

    /* renamed from: X */
    public static final void m108975X(C20843c0 c20843c0, ArrayList arrayList, long j11) {
        AbstractC19074t.m100208f(c20843c0, "this$0");
        AbstractC19074t.m100208f(arrayList, "$listMsgId");
        LinkedHashMap m124383f = c20843c0.m108950I0().m124383f("204278670", arrayList);
        if (c20843c0.f102442j.containsKey(Long.valueOf(j11))) {
            Object obj = c20843c0.f102442j.get(Long.valueOf(j11));
            AbstractC19074t.m100205c(obj);
            LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
            for (Map.Entry entry : m124383f.entrySet()) {
                long longValue = ((Number) entry.getKey()).longValue();
                linkedHashMap.put(Long.valueOf(longValue), (C17945a0) entry.getValue());
            }
            c20843c0.m109011k0(j11);
            AbstractC19444a.m101697e(new Runnable() { // from class: iw.r

                /* renamed from: p */
                public final /* synthetic */ long f102548p;

                public /* synthetic */ RunnableC20867r(long j112) {
                    r1 = j112;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C20843c0.m108978Y(r1);
                }
            });
        }
    }

    /* renamed from: X0 */
    public static final void m108976X0(C24799c c24799c) {
        AbstractC19074t.m100208f(c24799c, "$collectionInfo");
        C23744a.Companion.m124119a().m124116d(5215, Long.valueOf(c24799c.m128824d()));
    }

    /* renamed from: X1 */
    private final void m108977X1() {
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: iw.u
            public /* synthetic */ RunnableC20870u() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C20843c0.m108980Y1(C20843c0.this);
            }
        });
    }

    /* renamed from: Y */
    public static final void m108978Y(long j11) {
        C23744a.Companion.m124119a().m124116d(5202, Long.valueOf(j11), Long.valueOf(System.currentTimeMillis()));
    }

    /* renamed from: Y0 */
    public final void m108979Y0(JSONArray jSONArray, boolean z11) {
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: iw.g

            /* renamed from: p */
            public final /* synthetic */ JSONArray f102518p;

            /* renamed from: q */
            public final /* synthetic */ boolean f102519q;

            /* renamed from: r */
            public final /* synthetic */ C20843c0 f102520r;

            public /* synthetic */ RunnableC20850g(JSONArray jSONArray2, boolean z112, C20843c0 this) {
                r1 = jSONArray2;
                r2 = z112;
                r3 = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C20843c0.m108982Z0(r1, r2, r3);
            }
        });
    }

    /* renamed from: Y1 */
    public static final void m108980Y1(C20843c0 c20843c0) {
        AbstractC19074t.m100208f(c20843c0, "this$0");
        if (!c20843c0.f102445m) {
            c20843c0.f102435c = -1L;
            c20843c0.m109047B0(-1L, c20843c0.m109054G0(), true, true);
        }
    }

    /* renamed from: Z */
    private final String m108981Z(String str) {
        Object m131216p0;
        String m120002o = AbstractC23262x6.m120002o(str);
        AbstractC19074t.m100207e(m120002o, "convertSignToNoSign(...)");
        List m127021i = new C24329j("(\\W|_)+").m127021i(m120002o, 0);
        ArrayList arrayList = new ArrayList();
        for (Object obj : m127021i) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        String str2 = "(\\b|_)";
        if (arrayList.size() > 1) {
            int size = arrayList.size() - 1;
            for (int i11 = 0; i11 < size; i11++) {
                str2 = str2 + arrayList.get(i11) + "(\\W|_)+";
            }
        }
        if (!arrayList.isEmpty()) {
            m131216p0 = AbstractC25332a0.m131216p0(arrayList);
            return str2 + m131216p0;
        }
        return "";
    }

    /* renamed from: Z0 */
    public static final void m108982Z0(JSONArray jSONArray, boolean z11, C20843c0 c20843c0) {
        AbstractC19074t.m100208f(c20843c0, "this$0");
        if (jSONArray != null) {
            int length = jSONArray.length();
            for (int i11 = 0; i11 < length; i11++) {
                C24799c.a aVar = C24799c.Companion;
                Object obj = jSONArray.get(i11);
                AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type org.json.JSONObject");
                C24799c m128845b = aVar.m128845b((JSONObject) obj);
                if (c20843c0.f102438f.containsKey(Long.valueOf(m128845b.m128824d()))) {
                    C24801e.a aVar2 = C24801e.Companion;
                    Object obj2 = c20843c0.f102438f.get(Long.valueOf(m128845b.m128824d()));
                    AbstractC19074t.m100205c(obj2);
                    m128845b.m128842v(aVar2.m128867b((C24801e) obj2));
                } else {
                    Map map = c20843c0.f102438f;
                    AbstractC19074t.m100207e(map, "mMapInfoLoadItemCollection");
                    map.put(Long.valueOf(m128845b.m128824d()), C24801e.Companion.m128866a(m128845b.m128829i()));
                }
                C21956b.m114657g("SMLMyCloudCollection", "handleGetListCollectionInfo(): insertDB=" + C7959d.Companion.m41850e().m41744R1(m128845b) + " " + aVar.m128846c(m128845b));
            }
        }
        if (z11) {
            if (!c20843c0.f102445m) {
                c20843c0.m109047B0(c20843c0.f102435c, 0L, z11, false);
            } else {
                c20843c0.m109089v1(false);
            }
        }
        AbstractC0924m0.m3583Xo(c20843c0.f102445m);
    }

    /* renamed from: a1 */
    public final void m108984a1(long j11, JSONArray jSONArray, long j12, boolean z11, boolean z12) {
        Integer num;
        C24801e c24801e;
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            int length = jSONArray.length();
            for (int i11 = 0; i11 < length; i11++) {
                Object obj = jSONArray.get(i11);
                AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type org.json.JSONObject");
                C24800d m128857a = C24800d.Companion.m128857a(j11, (JSONObject) obj);
                MessageId m128853f = m128857a.m128853f();
                if (m128853f != null && m128853f.m41059z()) {
                    arrayList.add(m128857a);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            AbstractC19074t.m100207e(next, "next(...)");
            C24800d c24800d = (C24800d) next;
            if (m108966T(this, c24800d, false, 2, null)) {
                arrayList2.add(c24800d);
            }
        }
        if (!arrayList2.isEmpty()) {
            C7959d.Companion.m41850e().m41748S1(arrayList2);
        }
        if (z12) {
            C24799c m109091x0 = m109091x0(j11);
            if (m109091x0 == null) {
                m109091x0 = C7959d.Companion.m41850e().m41820q1(j11);
            }
            if (m109091x0 != null) {
                m109091x0.m128837q(j12);
                C7959d.Companion.m41850e().m41842y3(m109091x0);
            }
        }
        C24801e c24801e2 = (C24801e) this.f102438f.get(Long.valueOf(j11));
        if (c24801e2 != null) {
            if (z11 && c24801e2.m128859b()) {
                c24801e = c24801e2;
                AbstractC17930e.Companion.m94551d().mo94531e(new Runnable() { // from class: iw.t

                    /* renamed from: q */
                    public final /* synthetic */ long f102551q;

                    /* renamed from: r */
                    public final /* synthetic */ C24801e f102552r;

                    /* renamed from: s */
                    public final /* synthetic */ boolean f102553s;

                    public /* synthetic */ RunnableC20869t(long j112, C24801e c24801e22, boolean z112) {
                        r2 = j112;
                        r4 = c24801e22;
                        r5 = z112;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C20843c0.m108987b1(C20843c0.this, r2, r4, r5);
                    }
                }, 0L);
            } else {
                c24801e = c24801e22;
            }
            if (!c24801e.m128859b()) {
                C24801e c24801e3 = c24801e;
                c24801e3.m128865h(j12);
                C7959d.Companion.m41850e().m41704G3(j112, c24801e3);
                Map map = this.f102439g;
                AbstractC19074t.m100207e(map, "mMapListSyncItemDone");
                map.put(Long.valueOf(j112), Long.valueOf(j112));
                if (z112) {
                    AbstractC0924m0.m3521Vk(true);
                    C23744a.Companion.m124119a().m124116d(5207, 7, Long.valueOf(j112));
                } else {
                    C23744a.Companion.m124119a().m124116d(5202, Long.valueOf(j112));
                }
            }
        }
        Object obj2 = this.f102438f.get(Long.valueOf(j112));
        int size = arrayList.size();
        ArrayList arrayList3 = (ArrayList) this.f102440h.get(Long.valueOf(j112));
        if (arrayList3 != null) {
            num = Integer.valueOf(arrayList3.size());
        } else {
            num = null;
        }
        C21956b.m114657g("SMLMyCloudCollection", "handleGetListItemOfCollection(): " + obj2 + "\npage load size=" + size + " \nlist item size=" + num);
    }

    /* renamed from: b0 */
    public static /* synthetic */ void m108986b0(C20843c0 c20843c0, boolean z11, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        c20843c0.m109076a0(z11, list);
    }

    /* renamed from: b1 */
    public static final void m108987b1(C20843c0 c20843c0, long j11, C24801e c24801e, boolean z11) {
        AbstractC19074t.m100208f(c20843c0, "this$0");
        AbstractC19074t.m100208f(c24801e, "$this_apply");
        c20843c0.m109050D0(j11, c24801e.m128860c(), 0L, z11, false);
    }

    /* renamed from: c0 */
    public final void m108989c0(long j11) {
        if (!this.f102443k.containsKey(Long.valueOf(j11))) {
            Map map = this.f102443k;
            AbstractC19074t.m100207e(map, "mMapCheckDupItemOfCollection");
            map.put(Long.valueOf(j11), new HashMap());
        }
        if (!this.f102440h.containsKey(Long.valueOf(j11))) {
            Map map2 = this.f102440h;
            AbstractC19074t.m100207e(map2, "mMapListItemOfCollection");
            map2.put(Long.valueOf(j11), new ArrayList());
        }
        if (!this.f102442j.containsKey(Long.valueOf(j11))) {
            Map map3 = this.f102442j;
            AbstractC19074t.m100207e(map3, "mMapItemCollectionToChatContent");
            map3.put(Long.valueOf(j11), new LinkedHashMap());
        }
    }

    /* renamed from: d0 */
    private final void m108991d0(long j11) {
        if (!this.f102438f.containsKey(Long.valueOf(j11))) {
            Map map = this.f102438f;
            AbstractC19074t.m100207e(map, "mMapInfoLoadItemCollection");
            map.put(Long.valueOf(j11), new C24801e(j11, false, null, 0L, 14, null));
            C24799c m41820q1 = C7959d.Companion.m41850e().m41820q1(j11);
            if (m41820q1 != null && m41820q1.m128829i().length() > 0) {
                Map map2 = this.f102438f;
                AbstractC19074t.m100207e(map2, "mMapInfoLoadItemCollection");
                map2.put(Long.valueOf(j11), C24801e.Companion.m128866a(m41820q1.m128829i()));
            }
        }
    }

    /* renamed from: d1 */
    public static final void m108992d1(long j11, C20843c0 c20843c0, JSONArray jSONArray, long j12, long j13) {
        AbstractC19074t.m100208f(c20843c0, "this$0");
        C24799c m41820q1 = C7959d.Companion.m41850e().m41820q1(j11);
        if (m41820q1 != null) {
            c20843c0.m108961Q0(j11, (byte) 0, jSONArray, 0L, false);
            if (m41820q1.m128825e() == j12) {
                c20843c0.m109005i0(j11, j13, false);
            }
        }
    }

    /* renamed from: e0 */
    public final void m108994e0(long j11) {
        if (m109045z1(j11)) {
            AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: iw.q

                /* renamed from: q */
                public final /* synthetic */ long f102547q;

                public /* synthetic */ RunnableC20866q(long j112) {
                    r2 = j112;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C20843c0.m108997f0(C20843c0.this, r2);
                }
            });
        }
    }

    /* renamed from: e1 */
    public static final void m108995e1(long j11, C20843c0 c20843c0, JSONArray jSONArray, long j12, long j13) {
        AbstractC19074t.m100208f(c20843c0, "this$0");
        C24799c m41820q1 = C7959d.Companion.m41850e().m41820q1(j11);
        if (m41820q1 != null) {
            c20843c0.m108961Q0(j11, (byte) 1, jSONArray, 0L, false);
            if (m41820q1.m128825e() == j12) {
                c20843c0.m109005i0(j11, j13, false);
            }
        }
    }

    /* renamed from: f0 */
    public static final void m108997f0(C20843c0 c20843c0, long j11) {
        C24799c m109091x0;
        ArrayList arrayList;
        LinkedHashMap linkedHashMap;
        String str;
        int i11;
        AbstractC19074t.m100208f(c20843c0, "this$0");
        if (c20843c0.m109045z1(j11) && (m109091x0 = c20843c0.m109091x0(j11)) != null && (arrayList = (ArrayList) c20843c0.f102440h.get(Long.valueOf(j11))) != null && (linkedHashMap = (LinkedHashMap) c20843c0.f102446n.get(Long.valueOf(j11))) != null) {
            if (m109091x0.m128832l()) {
                str = "pinned";
            } else {
                str = "manual";
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", j11);
            jSONObject.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, str);
            jSONObject.put("total_item", arrayList.size());
            LinkedHashMap linkedHashMap2 = (LinkedHashMap) c20843c0.f102442j.get(Long.valueOf(j11));
            if (linkedHashMap2 != null) {
                i11 = linkedHashMap2.size();
            } else {
                i11 = 0;
            }
            jSONObject.put("total_exist", i11);
            Object obj = linkedHashMap.get(0);
            AbstractC19074t.m100205c(obj);
            jSONObject.put("all", ((ArrayList) obj).size());
            Object obj2 = linkedHashMap.get(1);
            AbstractC19074t.m100205c(obj2);
            jSONObject.put("text", ((ArrayList) obj2).size());
            Object obj3 = linkedHashMap.get(2);
            AbstractC19074t.m100205c(obj3);
            jSONObject.put("media", ((ArrayList) obj3).size());
            Object obj4 = linkedHashMap.get(4);
            AbstractC19074t.m100205c(obj4);
            jSONObject.put("link", ((ArrayList) obj4).size());
            Object obj5 = linkedHashMap.get(3);
            AbstractC19074t.m100205c(obj5);
            jSONObject.put("file", ((ArrayList) obj5).size());
            C21955a c21955a = C21955a.f108070a;
            String jSONObject2 = jSONObject.toString();
            AbstractC19074t.m100207e(jSONObject2, "toString(...)");
            c21955a.m114650q(j11, "", jSONObject2);
        }
    }

    /* renamed from: f1 */
    public static final void m108998f1(long j11, C20843c0 c20843c0, JSONArray jSONArray, JSONObject jSONObject, long j12) {
        AbstractC19074t.m100208f(c20843c0, "this$0");
        AbstractC19074t.m100208f(jSONArray, "$listItemObject");
        C24799c m41820q1 = C7959d.Companion.m41850e().m41820q1(j11);
        if (m41820q1 != null) {
            c20843c0.m108961Q0(j11, (byte) 1, jSONArray, 0L, false);
            long j13 = 0;
            if (jSONObject != null) {
                j13 = jSONObject.optLong(String.valueOf(j11), 0L);
            }
            long j14 = j13;
            if (m41820q1.m128825e() == j14) {
                c20843c0.m109005i0(j11, j12, false);
            }
            C21956b.m114657g("SMLMyCloudCollection", "ACTION_TYPE_NOTIF_REMOVE_LIST_ITEM_OF_MULTI_COLLECTION -> clientLastModifiedItemTime=" + m41820q1.m128825e() + " lastModifiedItemTimeServerOld=" + j14 + " lastModifiedItemTimeServer=" + j12);
        }
    }

    /* renamed from: g1 */
    public static final void m109000g1(C20843c0 c20843c0, long j11) {
        AbstractC19074t.m100208f(c20843c0, "this$0");
        ArrayList arrayList = new ArrayList();
        Iterator it = C7959d.Companion.m41850e().m41732O0().iterator();
        while (it.hasNext()) {
            Object next = it.next();
            AbstractC19074t.m100207e(next, "next(...)");
            C24799c c24799c = (C24799c) next;
            arrayList.add(Long.valueOf(c24799c.m128824d()));
            c20843c0.m109005i0(c24799c.m128824d(), j11, false);
        }
        C7959d.Companion.m41850e().m41831v0(arrayList);
        AbstractC23306f.m120602N0().m109080m0();
        AbstractC19444a.m101697e(new Runnable() { // from class: iw.m

            /* renamed from: p */
            public final /* synthetic */ ArrayList f102542p;

            public /* synthetic */ RunnableC20862m(ArrayList arrayList2) {
                r1 = arrayList2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C20843c0.m109003h1(r1);
            }
        });
    }

    /* renamed from: h0 */
    private final void m109002h0(long j11, boolean z11) {
        if (z11) {
            m109049C1();
        } else if (AbstractC0924m0.m2991Dc() && j11 > m109054G0()) {
            AbstractC0924m0.m3403Ri(j11);
        }
    }

    /* renamed from: h1 */
    public static final void m109003h1(ArrayList arrayList) {
        AbstractC19074t.m100208f(arrayList, "$listCollectionId");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C23744a.Companion.m124119a().m124116d(5202, (Long) it.next());
        }
    }

    /* renamed from: i0 */
    private final void m109005i0(long j11, long j12, boolean z11) {
        if (z11) {
            m109046A1(j11);
        } else {
            AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: iw.k

                /* renamed from: q */
                public final /* synthetic */ long f102532q;

                /* renamed from: r */
                public final /* synthetic */ long f102533r;

                public /* synthetic */ RunnableC20858k(long j112, long j122) {
                    r2 = j112;
                    r4 = j122;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C20843c0.m109008j0(C20843c0.this, r2, r4);
                }
            });
        }
    }

    /* renamed from: i1 */
    public final void m109006i1(JSONArray jSONArray, long j11, boolean z11) {
        try {
            ArrayList arrayList = new ArrayList();
            if (jSONArray != null) {
                int length = jSONArray.length();
                for (int i11 = 0; i11 < length; i11++) {
                    long parseLong = Long.parseLong(jSONArray.get(i11).toString());
                    arrayList.add(Long.valueOf(parseLong));
                    Map map = this.f102443k;
                    AbstractC19074t.m100207e(map, "mMapCheckDupItemOfCollection");
                    synchronized (map) {
                    }
                    Map map2 = this.f102442j;
                    AbstractC19074t.m100207e(map2, "mMapItemCollectionToChatContent");
                    synchronized (map2) {
                    }
                    Map map3 = this.f102440h;
                    AbstractC19074t.m100207e(map3, "mMapListItemOfCollection");
                    synchronized (map3) {
                    }
                    List list = this.f102437e;
                    AbstractC19074t.m100207e(list, "mListCollectionInfo");
                    synchronized (list) {
                        C24799c m109091x0 = m109091x0(parseLong);
                        if (m109091x0 != null) {
                            this.f102437e.remove(m109091x0);
                        }
                    }
                }
            }
            if (arrayList.size() > 0) {
                AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: iw.j

                    /* renamed from: p */
                    public final /* synthetic */ ArrayList f102528p;

                    public /* synthetic */ RunnableC20856j(ArrayList arrayList2) {
                        r1 = arrayList2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C20843c0.m109009j1(r1);
                    }
                });
                C23744a.Companion.m124119a().m124116d(5205, arrayList2);
            }
            m109002h0(j11, z11);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: j0 */
    public static final void m109008j0(C20843c0 c20843c0, long j11, long j12) {
        AbstractC19074t.m100208f(c20843c0, "this$0");
        C24799c m109091x0 = c20843c0.m109091x0(j11);
        if (m109091x0 == null) {
            m109091x0 = C7959d.Companion.m41850e().m41820q1(j11);
        }
        if (m109091x0 != null) {
            C24801e c24801e = (C24801e) c20843c0.f102438f.get(Long.valueOf(j11));
            if (c24801e == null) {
                c24801e = C24801e.Companion.m128866a(m109091x0.m128829i());
                c24801e.m128865h(m109091x0.m128825e());
            }
            if (!c24801e.m128859b() && m109091x0.m128825e() < j12) {
                m109091x0.m128837q(j12);
                c24801e.m128865h(j12);
                C7959d.a aVar = C7959d.Companion;
                aVar.m41850e().m41842y3(m109091x0);
                aVar.m41850e().m41704G3(j11, c24801e);
            }
        }
    }

    /* renamed from: j1 */
    public static final void m109009j1(ArrayList arrayList) {
        AbstractC19074t.m100208f(arrayList, "$listRemovedSuccess");
        C7959d.a aVar = C7959d.Companion;
        C21956b.m114657g("SMLMyCloudCollection", "handleRemoveCollectionInfo(): remove=" + arrayList + ", numCollectionInfoDeleted=" + aVar.m41850e().m41830u0(arrayList) + ", numItemCollectionDeleted=" + aVar.m41850e().m41831v0(arrayList));
    }

    /* renamed from: k0 */
    private final void m109011k0(long j11) {
        List m131177E0;
        Collection values;
        try {
            ArrayList<C17945a0> arrayList = new ArrayList();
            LinkedHashMap linkedHashMap = (LinkedHashMap) this.f102442j.get(Long.valueOf(j11));
            if (linkedHashMap != null && (values = linkedHashMap.values()) != null) {
                arrayList.addAll(values);
            }
            HashMap hashMap = new HashMap();
            if (m109081m1(j11)) {
                this.f102444l.clear();
                ArrayList arrayList2 = (ArrayList) this.f102440h.get(Long.valueOf(j11));
                if (arrayList2 != null) {
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        AbstractC19074t.m100207e(next, "next(...)");
                        C24800d c24800d = (C24800d) next;
                        MessageId m128853f = c24800d.m128853f();
                        if (m128853f != null) {
                            hashMap.put(Long.valueOf(m128853f.m41045i()), c24800d);
                        }
                    }
                }
                for (C17945a0 c17945a0 : arrayList) {
                    long m41045i = c17945a0.m95029V3().m41045i();
                    C24800d c24800d2 = (C24800d) hashMap.get(Long.valueOf(m41045i));
                    if (c24800d2 != null) {
                        long m128851d = c24800d2.m128851d() * 1000;
                        Map map = this.f102444l;
                        AbstractC19074t.m100207e(map, "mMapTimeAddCollectionPin");
                        map.put(Long.valueOf(m41045i), Long.valueOf(m128851d));
                        c17945a0.m95146gb(m128851d);
                    }
                }
            }
            ArrayList<C17945a0> arrayList3 = new ArrayList();
            m131177E0 = AbstractC25332a0.m131177E0(arrayList, this.f102454v);
            arrayList3.addAll(m131177E0);
            Map map2 = this.f102446n;
            AbstractC19074t.m100207e(map2, "mMapChatContentClassifyByType");
            map2.put(Long.valueOf(j11), new LinkedHashMap());
            Object obj = this.f102446n.get(Long.valueOf(j11));
            AbstractC19074t.m100205c(obj);
            ((Map) obj).put(0, new ArrayList());
            Object obj2 = this.f102446n.get(Long.valueOf(j11));
            AbstractC19074t.m100205c(obj2);
            ((Map) obj2).put(1, new ArrayList());
            Object obj3 = this.f102446n.get(Long.valueOf(j11));
            AbstractC19074t.m100205c(obj3);
            ((Map) obj3).put(2, new ArrayList());
            Object obj4 = this.f102446n.get(Long.valueOf(j11));
            AbstractC19074t.m100205c(obj4);
            ((Map) obj4).put(4, new ArrayList());
            Object obj5 = this.f102446n.get(Long.valueOf(j11));
            AbstractC19074t.m100205c(obj5);
            ((Map) obj5).put(3, new ArrayList());
            for (C17945a0 c17945a02 : arrayList3) {
                if (AbstractC23463h.m123190r(c17945a02)) {
                    Object obj6 = this.f102446n.get(Long.valueOf(j11));
                    AbstractC19074t.m100205c(obj6);
                    Object obj7 = ((LinkedHashMap) obj6).get(0);
                    AbstractC19074t.m100205c(obj7);
                    ((ArrayList) obj7).add(c17945a02);
                    if (m109027r1(c17945a02)) {
                        Object obj8 = this.f102446n.get(Long.valueOf(j11));
                        AbstractC19074t.m100205c(obj8);
                        Object obj9 = ((LinkedHashMap) obj8).get(1);
                        AbstractC19074t.m100205c(obj9);
                        ((ArrayList) obj9).add(c17945a02);
                    }
                    if (m109024q1(c17945a02)) {
                        Object obj10 = this.f102446n.get(Long.valueOf(j11));
                        AbstractC19074t.m100205c(obj10);
                        Object obj11 = ((LinkedHashMap) obj10).get(2);
                        AbstractC19074t.m100205c(obj11);
                        ((ArrayList) obj11).add(c17945a02);
                    }
                    if (m109021p1(c17945a02)) {
                        Object obj12 = this.f102446n.get(Long.valueOf(j11));
                        AbstractC19074t.m100205c(obj12);
                        Object obj13 = ((LinkedHashMap) obj12).get(4);
                        AbstractC19074t.m100205c(obj13);
                        ((ArrayList) obj13).add(c17945a02);
                    }
                    if (m109019o1(c17945a02)) {
                        Object obj14 = this.f102446n.get(Long.valueOf(j11));
                        AbstractC19074t.m100205c(obj14);
                        Object obj15 = ((LinkedHashMap) obj14).get(3);
                        AbstractC19074t.m100205c(obj15);
                        ((ArrayList) obj15).add(c17945a02);
                    }
                }
            }
            AbstractC19444a.m101697e(new Runnable() { // from class: iw.s

                /* renamed from: p */
                public final /* synthetic */ long f102549p;

                public /* synthetic */ RunnableC20868s(long j112) {
                    r1 = j112;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C20843c0.m109014l0(r1);
                }
            });
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: k1 */
    public final void m109012k1(JSONObject jSONObject, long j11, boolean z11) {
        if (jSONObject != null) {
            C24799c.a aVar = C24799c.Companion;
            C24799c m128845b = aVar.m128845b(jSONObject);
            C24799c m109091x0 = m109091x0(m128845b.m128824d());
            if (m109091x0 != null) {
                aVar.m128844a(m128845b, m109091x0);
            }
            AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: iw.a0
                public /* synthetic */ RunnableC20839a0() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C20843c0.m109015l1(C24799c.this);
                }
            });
            C21956b.m114657g("SMLMyCloudCollection", "handleUpdateCollectionInfo(): " + aVar.m128846c(m128845b));
            C23744a.Companion.m124119a().m124116d(5203, Long.valueOf(m128845b.m128824d()));
        }
        m109002h0(j11, z11);
    }

    /* renamed from: l0 */
    public static final void m109014l0(long j11) {
        C23744a.Companion.m124119a().m124116d(5203, Long.valueOf(j11));
    }

    /* renamed from: l1 */
    public static final void m109015l1(C24799c c24799c) {
        AbstractC19074t.m100208f(c24799c, "$collectionInfo");
        C7959d.Companion.m41850e().m41842y3(c24799c);
    }

    /* renamed from: o1 */
    private final boolean m109019o1(C17945a0 c17945a0) {
        for (Object obj : AbstractC19646n0.m102882C0()) {
            AbstractC19074t.m100207e(obj, "next(...)");
            if (((Number) obj).intValue() == c17945a0.m95041W4()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: p1 */
    private final boolean m109021p1(C17945a0 c17945a0) {
        return AbstractC23463h.m123186n(c17945a0);
    }

    /* renamed from: q0 */
    public static final int m109023q0(C17945a0 c17945a0, C17945a0 c17945a02) {
        int m104526b;
        int m104526b2;
        if (c17945a0.m95313z4() != c17945a02.m95313z4()) {
            m104526b2 = AbstractC20104d.m104526b(c17945a02.m95313z4() - c17945a0.m95313z4());
            return m104526b2;
        }
        m104526b = AbstractC20104d.m104526b(c17945a02.m94974P4() - c17945a0.m94974P4());
        return m104526b;
    }

    /* renamed from: q1 */
    private final boolean m109024q1(C17945a0 c17945a0) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(AbstractC19646n0.m102906K0());
        arrayList.addAll(AbstractC19646n0.m102942W0());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            AbstractC19074t.m100207e(next, "next(...)");
            if (((Number) next).intValue() == c17945a0.m95041W4()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: r0 */
    public static final int m109026r0(C24799c c24799c, C24799c c24799c2) {
        long m116581d;
        long m116581d2;
        int m104526b;
        if (c24799c2.m128832l()) {
            return 1;
        }
        if (!c24799c.m128832l()) {
            m116581d = AbstractC22543l.m116581d(c24799c.m128826f(), c24799c.m128825e());
            m116581d2 = AbstractC22543l.m116581d(c24799c2.m128826f(), c24799c2.m128825e());
            m104526b = AbstractC20104d.m104526b(m116581d2 - m116581d);
            return m104526b;
        }
        return -1;
    }

    /* renamed from: r1 */
    private final boolean m109027r1(C17945a0 c17945a0) {
        boolean z11;
        for (Object obj : AbstractC19646n0.m102921P0()) {
            AbstractC19074t.m100207e(obj, "next(...)");
            if (((Number) obj).intValue() == c17945a0.m95041W4()) {
                return true;
            }
        }
        Iterator it = AbstractC19646n0.m102912M0().iterator();
        while (true) {
            z11 = false;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            AbstractC19074t.m100207e(next, "next(...)");
            if (((Number) next).intValue() == c17945a0.m95041W4()) {
                C17969i0 m94929K2 = c17945a0.m94929K2();
                if (AbstractC19074t.m100204b(m94929K2.f91016u, "recommened.link") && m94929K2.f91011p.length() > 0) {
                    z11 = true;
                }
                if (z11) {
                    break;
                }
            }
        }
        return z11;
    }

    /* renamed from: t0 */
    public static /* synthetic */ void m109030t0(C20843c0 c20843c0, C24799c c24799c, ArrayList arrayList, String str, boolean z11, boolean z12, boolean z13, boolean z14, int i11, Object obj) {
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        if ((i11 & 8) != 0) {
            z15 = false;
        } else {
            z15 = z11;
        }
        if ((i11 & 16) != 0) {
            z16 = false;
        } else {
            z16 = z12;
        }
        if ((i11 & 32) != 0) {
            z17 = false;
        } else {
            z17 = z13;
        }
        if ((i11 & 64) != 0) {
            z18 = false;
        } else {
            z18 = z14;
        }
        c20843c0.m109086s0(c24799c, arrayList, str, z15, z16, z17, z18);
    }

    /* renamed from: t1 */
    private final void m109031t1(long j11, boolean z11) {
        m109082n0(j11);
        Iterator it = C7959d.Companion.m41850e().m41797j2(Long.valueOf(j11)).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            AbstractC19074t.m100207e(next, "next(...)");
            m108966T(this, (C24800d) next, false, 2, null);
        }
        m109039x1(j11);
        if (z11) {
            m108971V1(j11);
        }
        Map map = this.f102441i;
        AbstractC19074t.m100207e(map, "mMapCheckItemCollectionCachedOnMem");
        map.put(Long.valueOf(j11), Boolean.TRUE);
    }

    /* renamed from: u0 */
    private final ArrayList m109033u0(ArrayList arrayList, int i11) {
        try {
            C24329j c24329j = new C24329j(this.f102448p);
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (c24329j.m127015a(m108948H0((C17945a0) obj, i11))) {
                    arrayList2.add(obj);
                }
            }
            return arrayList2;
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            return arrayList;
        }
    }

    /* renamed from: u1 */
    static /* synthetic */ void m109034u1(C20843c0 c20843c0, long j11, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        c20843c0.m109031t1(j11, z11);
    }

    /* renamed from: w1 */
    public static final void m109037w1(C20843c0 c20843c0, boolean z11) {
        List m131177E0;
        AbstractC19074t.m100208f(c20843c0, "this$0");
        List list = c20843c0.f102437e;
        AbstractC19074t.m100207e(list, "mListCollectionInfo");
        synchronized (list) {
            try {
                c20843c0.f102437e.clear();
                if (c20843c0.f102452t) {
                    c20843c0.f102437e.clear();
                    c20843c0.f102437e.addAll(c20843c0.m109041y0());
                    C23744a.Companion.m124119a().m124116d(5201, new Object[0]);
                } else {
                    List list2 = c20843c0.f102437e;
                    m131177E0 = AbstractC25332a0.m131177E0(C7959d.Companion.m41850e().m41732O0(), c20843c0.f102453u);
                    list2.addAll(m131177E0);
                    if (c20843c0.m109056J0() == null) {
                        c20843c0.f102437e.add(0, c20843c0.m109044z0());
                    }
                    for (Object obj : c20843c0.f102437e) {
                        AbstractC19074t.m100207e(obj, "next(...)");
                        C24799c c24799c = (C24799c) obj;
                        if (!c20843c0.f102438f.containsKey(Long.valueOf(c24799c.m128824d()))) {
                            Map map = c20843c0.f102438f;
                            AbstractC19074t.m100207e(map, "mMapInfoLoadItemCollection");
                            Long valueOf = Long.valueOf(c24799c.m128824d());
                            C24801e m128866a = C24801e.Companion.m128866a(c24799c.m128829i());
                            m128866a.m128865h(c24799c.m128825e());
                            map.put(valueOf, m128866a);
                        }
                        C21956b.m114657g("SMLMyCloudCollection", String.valueOf(C24799c.Companion.m128846c(c24799c)));
                    }
                    C23744a.Companion.m124119a().m124116d(5201, new Object[0]);
                }
                if (z11) {
                    c20843c0.m108977X1();
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: x1 */
    private final void m109039x1(long j11) {
        ArrayList arrayList = new ArrayList();
        m108989c0(j11);
        m108991d0(j11);
        if (this.f102438f.containsKey(Long.valueOf(j11))) {
            if (this.f102440h.containsKey(Long.valueOf(j11))) {
                Object obj = this.f102440h.get(Long.valueOf(j11));
                AbstractC19074t.m100205c(obj);
                Iterator it = ((ArrayList) obj).iterator();
                while (it.hasNext()) {
                    MessageId m128853f = ((C24800d) it.next()).m128853f();
                    if (m128853f != null) {
                        arrayList.add(m128853f);
                    }
                }
            }
            LinkedHashMap m124383f = C23805a.Companion.m124389a().m124383f("204278670", arrayList);
            Map map = this.f102442j;
            AbstractC19074t.m100207e(map, "mMapItemCollectionToChatContent");
            map.put(Long.valueOf(j11), m124383f);
            m109011k0(j11);
            AbstractC19444a.m101697e(new Runnable() { // from class: iw.p

                /* renamed from: p */
                public final /* synthetic */ long f102545p;

                public /* synthetic */ RunnableC20865p(long j112) {
                    r1 = j112;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C20843c0.m109042y1(r1);
                }
            });
        }
    }

    /* renamed from: y0 */
    private final ArrayList m109041y0() {
        ArrayList arrayList = new ArrayList();
        C24799c m109044z0 = m109044z0();
        arrayList.add(m109044z0);
        long m128824d = m109044z0.m128824d();
        C24799c c24799c = new C24799c(0L, null, 0, 0L, null, 0L, null, 0L, null, false, false, 2047, null);
        c24799c.m128836p(m128824d + 1);
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_fake_collection_name);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        c24799c.m128839s(m118743r0);
        c24799c.m128840t(false);
        c24799c.m128835o(true);
        arrayList.add(c24799c);
        return arrayList;
    }

    /* renamed from: y1 */
    public static final void m109042y1(long j11) {
        C23744a.Companion.m124119a().m124116d(5202, Long.valueOf(j11), Long.valueOf(System.currentTimeMillis()));
    }

    /* renamed from: z0 */
    private final C24799c m109044z0() {
        C24799c c24799c = new C24799c(0L, null, 0, 0L, null, 0L, null, 0L, null, false, false, 2047, null);
        c24799c.m128836p(1L);
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_pin_collection_name);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        c24799c.m128839s(m118743r0);
        c24799c.m128840t(true);
        c24799c.m128835o(true);
        return c24799c;
    }

    /* renamed from: z1 */
    private final boolean m109045z1(long j11) {
        if (!this.f102449q.containsKey(Long.valueOf(j11)) && AbstractC0924m0.m3807fb() && this.f102439g.containsKey(Long.valueOf(j11))) {
            return true;
        }
        return false;
    }

    /* renamed from: A1 */
    public final void m109046A1(long j11) {
        C24801e c24801e = (C24801e) this.f102438f.get(Long.valueOf(j11));
        if (c24801e != null) {
            c24801e.m128863f(true);
            AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: iw.z

                /* renamed from: p */
                public final /* synthetic */ long f102563p;

                /* renamed from: q */
                public final /* synthetic */ C24801e f102564q;

                public /* synthetic */ RunnableC20875z(long j112, C24801e c24801e2) {
                    r1 = j112;
                    r3 = c24801e2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C20843c0.m108938B1(r1, r3);
                }
            });
            this.f102439g.remove(Long.valueOf(j112));
            m108971V1(j112);
        }
    }

    /* renamed from: B0 */
    public final void m109047B0(long j11, long j12, boolean z11, boolean z12) {
        if (this.f102455w) {
            return;
        }
        this.f102455w = true;
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new f(z11, z12, c0766k, j11));
        c0766k.m1854k0(j11, j12);
    }

    /* renamed from: C0 */
    public final List m109048C0() {
        List list = this.f102437e;
        AbstractC19074t.m100207e(list, "mListCollectionInfo");
        return list;
    }

    /* renamed from: C1 */
    public final void m109049C1() {
        this.f102445m = false;
        AbstractC0924m0.m3583Xo(false);
        this.f102436d = true;
        m108977X1();
    }

    /* renamed from: D0 */
    public final void m109050D0(long j11, MessageId messageId, long j12, boolean z11, boolean z12) {
        String str;
        if (messageId != null) {
            str = messageId.toString();
        } else {
            str = null;
        }
        C21956b.m114657g("SMLMyCloudCollection", "getListItemOfCollection(): collectionId=" + j11 + " lastItem=" + str + " lastModifiedItemTime=" + j12);
        if (this.f102432B) {
            return;
        }
        this.f102432B = true;
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new g(z11, j11, z12, c0766k));
        c0766k.m1852j0(j11, messageId, j12);
    }

    /* renamed from: D1 */
    public final void m109051D1(ArrayList arrayList) {
        AbstractC19074t.m100208f(arrayList, "listCollectionId");
        if (this.f102458z) {
            return;
        }
        this.f102458z = true;
        String m114639f = C21955a.f108070a.m114639f("collection_detail");
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new i(c0766k));
        c0766k.m1860n0(arrayList, m109054G0(), m114639f);
    }

    /* renamed from: E0 */
    public final boolean m109052E0() {
        return this.f102436d;
    }

    /* renamed from: F0 */
    public final long m109053F0() {
        return this.f102435c;
    }

    /* renamed from: G0 */
    public final long m109054G0() {
        return AbstractC0924m0.m3415S1();
    }

    /* renamed from: H1 */
    public final void m109055H1(long j11) {
        this.f102439g.remove(Long.valueOf(j11));
        this.f102438f.remove(Long.valueOf(j11));
    }

    /* renamed from: J0 */
    public final C24799c m109056J0() {
        Object obj;
        List list = this.f102437e;
        AbstractC19074t.m100207e(list, "mListCollectionInfo");
        Iterator it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((C24799c) obj).m128832l()) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        C24799c c24799c = (C24799c) obj;
        if (c24799c == null) {
            return null;
        }
        return c24799c;
    }

    /* renamed from: K0 */
    public final String m109057K0() {
        return this.f102448p;
    }

    /* renamed from: K1 */
    public final void m109058K1(long j11) {
        Map map = this.f102449q;
        AbstractC19074t.m100207e(map, "mMapLogStatsCollectionDetail");
        map.put(Long.valueOf(j11), Long.valueOf(j11));
    }

    /* renamed from: L0 */
    public final boolean m109059L0() {
        return this.f102452t;
    }

    /* renamed from: L1 */
    public final void m109060L1(boolean z11) {
        this.f102436d = z11;
    }

    /* renamed from: M0 */
    public final int m109061M0() {
        return this.f102451s;
    }

    /* renamed from: M1 */
    public final void m109062M1(long j11) {
        this.f102435c = j11;
    }

    /* renamed from: N0 */
    public final int m109063N0() {
        return this.f102450r;
    }

    /* renamed from: N1 */
    public final void m109064N1(boolean z11) {
        this.f102456x = z11;
    }

    /* renamed from: O0 */
    public final int m109065O0() {
        return this.f102437e.size();
    }

    /* renamed from: O1 */
    public final void m109066O1(boolean z11) {
        this.f102455w = z11;
    }

    /* renamed from: P0 */
    public final int m109067P0(long j11) {
        ArrayList arrayList;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f102446n.get(Long.valueOf(j11));
        if (linkedHashMap == null || (arrayList = (ArrayList) linkedHashMap.get(0)) == null) {
            return 0;
        }
        return arrayList.size();
    }

    /* renamed from: P1 */
    public final void m109068P1(boolean z11) {
        this.f102432B = z11;
    }

    /* renamed from: Q1 */
    public final void m109069Q1(boolean z11) {
        this.f102458z = z11;
    }

    /* renamed from: R1 */
    public final void m109070R1(boolean z11) {
        this.f102457y = z11;
    }

    /* renamed from: S1 */
    public final void m109071S1(boolean z11) {
        this.f102452t = z11;
    }

    /* renamed from: T1 */
    public final void m109072T1(int i11) {
        this.f102451s = i11;
    }

    /* renamed from: U */
    public final void m109073U(long j11, ArrayList arrayList, byte b11, long j12, boolean z11, String str, boolean z12) {
        C24799c m109056J0;
        AbstractC19074t.m100208f(arrayList, "listItem");
        AbstractC19074t.m100208f(str, "trackingLogData");
        if (!AbstractC0924m0.m3480U8() && b11 == 0 && (m109056J0 = m109056J0()) != null && j11 == m109056J0.m128824d() && m109056J0.m128831k()) {
            m109086s0(m109056J0, arrayList, str, true, m109056J0.m128831k(), z11, z12);
        } else {
            if (this.f102431A) {
                return;
            }
            this.f102431A = true;
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new c(b11, j11, arrayList, z11, z12, c0766k));
            c0766k.m1841e(j11, arrayList, b11, j12, str);
        }
    }

    /* renamed from: U1 */
    public final void m109074U1(int i11) {
        this.f102450r = i11;
    }

    /* renamed from: Z1 */
    public final void m109075Z1(C24799c c24799c) {
        AbstractC19074t.m100208f(c24799c, "collectionInfo");
        if (this.f102457y) {
            return;
        }
        this.f102457y = true;
        String m114640g = C21955a.f108070a.m114640g("collection_detail_rename");
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new j(c0766k));
        c0766k.m1802B0(c24799c, m109054G0(), m114640g);
    }

    /* renamed from: a0 */
    public final void m109076a0(boolean z11, List list) {
        AbstractC19074t.m100208f(list, "currentListPinMsg");
        if (!AbstractC0924m0.m3480U8() || z11) {
            if (AbstractC0924m0.m3250Ma()) {
                ArrayList arrayList = new ArrayList();
                HashMap hashMap = new HashMap();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C17945a0 c17945a0 = (C17945a0) it.next();
                    arrayList.add(c17945a0.m95029V3());
                    String valueOf = String.valueOf(AbstractC19646n0.m102878B(c17945a0.m95041W4(), false));
                    if (hashMap.containsKey(valueOf)) {
                        Object obj = hashMap.get(valueOf);
                        AbstractC19074t.m100205c(obj);
                        hashMap.put(valueOf, Integer.valueOf(((Number) obj).intValue() + 1));
                    } else {
                        hashMap.put(valueOf, 1);
                    }
                }
                if (!arrayList.isEmpty()) {
                    String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_pin_collection_name);
                    AbstractC19074t.m100207e(m118743r0, "getString(...)");
                    m109030t0(this, new C24799c(0L, m118743r0, 0, 0L, "", 0L, "", 0L, null, false, false, 1965, null), arrayList, C21955a.f108070a.m114641h("", hashMap, true), true, false, false, false, 112, null);
                }
            } else {
                C0766k c0766k = new C0766k();
                c0766k.mo1704o8(new d(list, this));
                c0766k.mo1434G5("204278670", 0L);
            }
        }
    }

    /* renamed from: a2 */
    public final void m109077a2(long j11, String str) {
        AbstractC19074t.m100208f(str, "searchText");
        this.f102447o = str;
        this.f102448p = m108981Z(str);
        C23744a.Companion.m124119a().m124116d(5202, Long.valueOf(j11));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: iw.c.<init>(long, iw.c0, org.json.JSONArray, long, long):void, class status: GENERATED_AND_UNLOADED
        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:289)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isArgUnused(ProcessVariables.java:146)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.lambda$isVarUnused$0(ProcessVariables.java:131)
        	at jadx.core.utils.ListUtils.allMatch(ListUtils.java:172)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isVarUnused(ProcessVariables.java:131)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:64)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    /* renamed from: c1 */
    public final void m109078c1(org.json.JSONObject r17) {
        /*
            Method dump skipped, instructions count: 512
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p246iw.C20843c0.m109078c1(org.json.JSONObject):void");
    }

    /* renamed from: g0 */
    public final void m109079g0() {
        if (C21373a.f104231a.m110807w().m110825b() && this.f102452t) {
            this.f102452t = false;
        }
    }

    /* renamed from: m0 */
    public final void m109080m0() {
        this.f102441i.clear();
    }

    /* renamed from: m1 */
    public final boolean m109081m1(long j11) {
        C24799c m109091x0 = m109091x0(j11);
        if (m109091x0 != null) {
            return m109091x0.m128832l();
        }
        return false;
    }

    /* renamed from: n0 */
    public final void m109082n0(long j11) {
        HashMap hashMap = (HashMap) this.f102443k.get(Long.valueOf(j11));
        if (hashMap != null) {
            hashMap.clear();
        }
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f102442j.get(Long.valueOf(j11));
        if (linkedHashMap != null) {
            linkedHashMap.clear();
        }
        ArrayList arrayList = (ArrayList) this.f102440h.get(Long.valueOf(j11));
        if (arrayList != null) {
            arrayList.clear();
        }
        this.f102446n.remove(Long.valueOf(j11));
        this.f102441i.remove(Long.valueOf(j11));
        this.f102438f.remove(Long.valueOf(j11));
    }

    /* renamed from: n1 */
    public final boolean m109083n1() {
        if (this.f102447o.length() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: o0 */
    public final void m109084o0() {
        this.f102435c = -1L;
        this.f102436d = true;
        this.f102445m = false;
        this.f102447o = "";
        this.f102448p = "";
        this.f102450r = -1;
        this.f102451s = -1;
        this.f102437e.clear();
        this.f102438f.clear();
        this.f102439g.clear();
        this.f102440h.clear();
        this.f102441i.clear();
        this.f102442j.clear();
        this.f102443k.clear();
        this.f102444l.clear();
        this.f102446n.clear();
    }

    /* renamed from: p0 */
    public final void m109085p0(long j11) {
        this.f102441i.remove(Long.valueOf(j11));
    }

    /* renamed from: s0 */
    public final void m109086s0(C24799c c24799c, ArrayList arrayList, String str, boolean z11, boolean z12, boolean z13, boolean z14) {
        AbstractC19074t.m100208f(c24799c, "collectionInfo");
        AbstractC19074t.m100208f(arrayList, "listItem");
        AbstractC19074t.m100208f(str, "trackingLogData");
        if (this.f102456x) {
            return;
        }
        this.f102456x = true;
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new e(z11, z12, arrayList, z13, z14, c0766k));
        c0766k.m1853k(c24799c, arrayList, m109054G0(), z11, str);
    }

    /* renamed from: s1 */
    public final boolean m109087s1() {
        return this.f102445m;
    }

    /* renamed from: v0 */
    public final List m109088v0(long j11, List list) {
        AbstractC19074t.m100208f(list, "listMsgId");
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f102442j.get(Long.valueOf(j11));
        if (linkedHashMap != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C17945a0 c17945a0 = (C17945a0) linkedHashMap.get(Long.valueOf(((MessageId) it.next()).m41045i()));
                if (c17945a0 != null) {
                    AbstractC19074t.m100205c(c17945a0);
                    arrayList.add(c17945a0);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: v1 */
    public final void m109089v1(boolean z11) {
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: iw.v

            /* renamed from: q */
            public final /* synthetic */ boolean f102556q;

            public /* synthetic */ RunnableC20871v(boolean z112) {
                r2 = z112;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C20843c0.m109037w1(C20843c0.this, r2);
            }
        });
    }

    /* renamed from: w0 */
    public final ArrayList m109090w0(long j11, int i11) {
        LinkedHashMap linkedHashMap;
        try {
            try {
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
            if (this.f102441i.containsKey(Long.valueOf(j11)) && (linkedHashMap = (LinkedHashMap) this.f102446n.get(Long.valueOf(j11))) != null && linkedHashMap.containsKey(Integer.valueOf(i11))) {
                ArrayList arrayList = new ArrayList();
                Object obj = linkedHashMap.get(Integer.valueOf(i11));
                AbstractC19074t.m100205c(obj);
                arrayList.addAll((Collection) obj);
                if (m109083n1()) {
                    return m109033u0(arrayList, i11);
                }
                C21956b.m114657g("SMLMyCloudCollection", "Show cached data: size=" + arrayList.size());
                return arrayList;
            }
            if (i11 == 0) {
                m109034u1(this, j11, false, 2, null);
                C24848g0 c24848g0 = C24848g0.f119245a;
                LinkedHashMap linkedHashMap2 = (LinkedHashMap) this.f102446n.get(Long.valueOf(j11));
                if (linkedHashMap2 != null && linkedHashMap2.containsKey(Integer.valueOf(i11))) {
                    ArrayList arrayList2 = new ArrayList();
                    Object obj2 = linkedHashMap2.get(Integer.valueOf(i11));
                    AbstractC19074t.m100205c(obj2);
                    arrayList2.addAll((Collection) obj2);
                    if (m109083n1()) {
                        return m109033u0(arrayList2, i11);
                    }
                    return arrayList2;
                }
            }
            return new ArrayList();
        } finally {
            m108994e0(j11);
        }
    }

    /* renamed from: x0 */
    public final C24799c m109091x0(long j11) {
        Object obj;
        C24799c c24799c;
        List list = this.f102437e;
        AbstractC19074t.m100207e(list, "mListCollectionInfo");
        synchronized (list) {
            try {
                List list2 = this.f102437e;
                AbstractC19074t.m100207e(list2, "mListCollectionInfo");
                Iterator it = list2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (((C24799c) obj).m128824d() == j11) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                c24799c = (C24799c) obj;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c24799c;
    }

    private C20843c0() {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(h.f102487q);
        this.f102433a = m129210a;
        this.f102434b = "204278670";
        this.f102435c = -1L;
        this.f102436d = true;
        this.f102437e = Collections.synchronizedList(new ArrayList());
        this.f102438f = Collections.synchronizedMap(new HashMap());
        this.f102439g = Collections.synchronizedMap(new HashMap());
        this.f102440h = Collections.synchronizedMap(new HashMap());
        this.f102441i = Collections.synchronizedMap(new HashMap());
        this.f102442j = Collections.synchronizedMap(new HashMap());
        this.f102443k = Collections.synchronizedMap(new HashMap());
        this.f102444l = Collections.synchronizedMap(new HashMap());
        this.f102446n = Collections.synchronizedMap(new HashMap());
        this.f102447o = "";
        this.f102448p = "";
        this.f102449q = Collections.synchronizedMap(new HashMap());
        this.f102450r = -1;
        this.f102451s = -1;
        this.f102453u = new Comparator() { // from class: iw.a
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m109026r0;
                m109026r0 = C20843c0.m109026r0((C24799c) obj, (C24799c) obj2);
                return m109026r0;
            }
        };
        this.f102454v = new Comparator() { // from class: iw.l
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m109023q0;
                m109023q0 = C20843c0.m109023q0((C17945a0) obj, (C17945a0) obj2);
                return m109023q0;
            }
        };
    }
}
