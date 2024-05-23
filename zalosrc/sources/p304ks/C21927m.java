package p304ks;

import ae.C0766k;
import ae.InterfaceC0765j;
import ag0.C0824j;
import am.AbstractC0906d0;
import am.AbstractC0924m0;
import am.AbstractC0939u;
import am.C0943w;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.common.chat.label.C7860a;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.p077ui.maintab.MainTabView;
import com.zing.zalo.p077ui.zviews.ZaloListView;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalocore.CoreUtility;
import fg0.ThreadFactoryC18928a;
import gw.C19669z;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import me0.AbstractC23028c0;
import me0.AbstractC23063f2;
import me0.AbstractC23174p3;
import me0.AbstractC23262x6;
import mm0.AbstractC23349d;
import mm0.AbstractC23350e;
import nh0.C23793c;
import o70.C24099q0;
import org.json.JSONArray;
import org.json.JSONObject;
import p142ey.C18631a;
import p142ey.C18635e;
import p142ey.C18644n;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;
import p348mi.C23302b;
import p363nh.C23744a;
import p461qu.AbstractC25495a;
import p716zh.C31853b5;
import p716zh.C31874cb;
import p716zh.C31901e8;
import p716zh.C31973j5;
import p716zh.C32035n7;
import p716zh.C32134u7;
import r30.C25637g;
import r30.C25639i;
import vg.C28203u6;
import wd0.C28926f;

/* renamed from: ks.m */
/* loaded from: classes.dex */
public final class C21927m {

    /* renamed from: Q */
    static final String f107772Q = "m";

    /* renamed from: U */
    private static volatile C21927m f107776U;

    /* renamed from: q */
    InterfaceC0765j f107813q;

    /* renamed from: R */
    public static Map f107773R = Collections.synchronizedMap(new HashMap());

    /* renamed from: S */
    public static int f107774S = 0;

    /* renamed from: T */
    public static Map f107775T = Collections.synchronizedMap(new HashMap());

    /* renamed from: V */
    public static int f107777V = 0;

    /* renamed from: W */
    public static int f107778W = 0;

    /* renamed from: X */
    public static int f107779X = 0;

    /* renamed from: Y */
    public static final String[] f107780Y = {"68386082"};

    /* renamed from: a */
    Map f107797a = Collections.synchronizedMap(new HashMap());

    /* renamed from: b */
    final List f107798b = new ArrayList();

    /* renamed from: c */
    C31853b5 f107799c = new C31853b5();

    /* renamed from: d */
    C31853b5 f107800d = new C31853b5();

    /* renamed from: e */
    C31853b5 f107801e = new C31853b5();

    /* renamed from: f */
    C31853b5 f107802f = new C31853b5();

    /* renamed from: g */
    final Map f107803g = Collections.synchronizedMap(new HashMap());

    /* renamed from: h */
    List f107804h = new ArrayList();

    /* renamed from: i */
    ArrayList f107805i = new ArrayList();

    /* renamed from: j */
    ArrayList f107806j = new ArrayList();

    /* renamed from: k */
    Map f107807k = Collections.synchronizedMap(new HashMap());

    /* renamed from: l */
    List f107808l = new ArrayList();

    /* renamed from: m */
    ArrayList f107809m = new ArrayList();

    /* renamed from: n */
    Map f107810n = Collections.synchronizedMap(new HashMap());

    /* renamed from: o */
    public final AtomicBoolean f107811o = new AtomicBoolean(false);

    /* renamed from: p */
    long f107812p = 0;

    /* renamed from: r */
    boolean f107814r = false;

    /* renamed from: s */
    boolean f107815s = false;

    /* renamed from: t */
    boolean f107816t = true;

    /* renamed from: u */
    boolean f107817u = false;

    /* renamed from: v */
    boolean f107818v = false;

    /* renamed from: w */
    boolean f107819w = false;

    /* renamed from: x */
    private final Executor f107820x = Executors.newSingleThreadExecutor(new ThreadFactoryC18928a("FriendManager"));

    /* renamed from: y */
    boolean f107821y = false;

    /* renamed from: z */
    final List f107822z = new ArrayList();

    /* renamed from: A */
    final String f107781A = MainApplication.getAppContext().getString(AbstractC8020f0.str_alphabe);

    /* renamed from: B */
    public int f107782B = 0;

    /* renamed from: C */
    public int f107783C = 0;

    /* renamed from: D */
    public int f107784D = -1;

    /* renamed from: E */
    public int f107785E = -1;

    /* renamed from: F */
    public int f107786F = -1;

    /* renamed from: G */
    public int f107787G = -1;

    /* renamed from: H */
    public int f107788H = -1;

    /* renamed from: I */
    public int f107789I = -1;

    /* renamed from: J */
    public int f107790J = 0;

    /* renamed from: K */
    public int f107791K = 0;

    /* renamed from: L */
    Runnable f107792L = new Runnable() { // from class: ks.j
        public /* synthetic */ RunnableC21924j() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C21927m.this.m114296X();
        }
    };

    /* renamed from: M */
    public int f107793M = 0;

    /* renamed from: N */
    public int f107794N = 0;

    /* renamed from: O */
    public boolean f107795O = false;

    /* renamed from: P */
    public boolean f107796P = false;

    /* renamed from: ks.m$a */
    /* loaded from: classes4.dex */
    public class a extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ String f107823a;

        a(String str) {
            this.f107823a = str;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7960e.m41971c6().m42511q9(this.f107823a);
            C7960e.m41971c6().m42376e4(this.f107823a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ks.m$b */
    /* loaded from: classes4.dex */
    public class b extends AbstractC0939u {
        b() {
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7960e.m41971c6().m42180Kb();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ks.m$c */
    /* loaded from: classes4.dex */
    public class c extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ String f107826a;

        c(String str) {
            this.f107826a = str;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C21928n.m114372h().m114387q(this.f107826a, 1);
        }
    }

    /* renamed from: ks.m$d */
    /* loaded from: classes4.dex */
    public class d implements InterfaceC20094a {
        d() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            C21927m.this.f107814r = false;
            AbstractC23350e.m122774d(C21927m.f107772Q, "ERROR updateOnlineList");
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            JSONObject jSONObject;
            JSONArray optJSONArray;
            try {
                try {
                    jSONObject = new JSONObject(obj.toString());
                } catch (Exception e11) {
                    AbstractC23350e.m122774d(C21927m.f107772Q, e11.toString());
                }
                if (jSONObject.isNull("data")) {
                    C21927m c21927m = C21927m.this;
                    c21927m.f107815s = false;
                    c21927m.f107814r = false;
                    return;
                }
                JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                synchronized (C21927m.m114302u().f107798b) {
                    C21927m.m114302u().f107798b.clear();
                }
                synchronized (C21927m.m114302u().m114303A()) {
                    C21927m.m114302u().m114303A().clear();
                    if (!jSONObject2.isNull("onlines") && (optJSONArray = jSONObject2.optJSONArray("onlines")) != null) {
                        long mo124311f = C23793c.m124316k().mo124311f();
                        for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                            try {
                                JSONObject jSONObject3 = optJSONArray.getJSONObject(i11);
                                C32134u7 c32134u7 = new C32134u7();
                                c32134u7.f148218a = jSONObject3.optString("userId");
                                c32134u7.f148219b = jSONObject3.optString("status");
                                C21927m.m114302u().m114364w0(c32134u7.f148218a, mo124311f);
                                C21927m.m114302u().m114303A().add(c32134u7);
                            } catch (Exception e12) {
                                AbstractC23350e.m122774d(C21927m.f107772Q, e12.toString());
                            }
                        }
                    }
                }
                if (!jSONObject2.isNull("ownerStatus")) {
                    String optString = jSONObject2.optString("ownerStatus");
                    ContactProfile contactProfile = AbstractC23304d.f113368c0;
                    if (contactProfile != null) {
                        contactProfile.f42458z = optString;
                        AbstractC23309i.m121068Iz(contactProfile.m40373K());
                    }
                }
                C21927m.f107774S = 2;
                C18644n.m98524E();
                C21927m c21927m2 = C21927m.this;
                c21927m2.f107815s = false;
                c21927m2.f107814r = false;
            } finally {
                C21927m c21927m3 = C21927m.this;
                c21927m3.f107815s = false;
                c21927m3.f107814r = false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ks.m$e */
    /* loaded from: classes4.dex */
    public class e implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ boolean f107829a;

        e(boolean z11) {
            this.f107829a = z11;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            C21927m.this.f107817u = false;
            C21927m.f107777V = 0;
            AbstractC23309i.m121467Tr(System.currentTimeMillis());
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v1 */
        /* JADX WARN: Type inference failed for: r2v12 */
        /* JADX WARN: Type inference failed for: r2v4, types: [boolean, int] */
        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            JSONArray jSONArray;
            int i11 = 0;
            ?? r22 = 0;
            try {
                try {
                    Map synchronizedMap = Collections.synchronizedMap(new HashMap());
                    for (int i12 = 0; i12 < C21927m.this.f107800d.size(); i12++) {
                        try {
                            synchronizedMap.put(((ContactProfile) C21927m.this.f107800d.get(i12)).f42434r, ((ContactProfile) C21927m.this.f107800d.get(i12)).f42434r);
                        } catch (Throwable th2) {
                            th = th2;
                            C21927m.this.f107817u = r22;
                            C21927m.f107777V = r22;
                            AbstractC23309i.m121467Tr(System.currentTimeMillis());
                            C19669z.m103146Y().m103198O0();
                            C18644n.m98524E();
                            throw th;
                        }
                    }
                    C21927m.this.m114312J().clear();
                    JSONArray jSONArray2 = new JSONObject(obj.toString()).getJSONArray("data");
                    int i13 = 0;
                    while (i13 < jSONArray2.length()) {
                        try {
                            JSONObject jSONObject = jSONArray2.getJSONObject(i13);
                            String string = jSONObject.getString("userId");
                            String string2 = jSONObject.getString("username");
                            String string3 = jSONObject.getString("displayName");
                            String string4 = jSONObject.getString("avatar");
                            String string5 = jSONObject.getString("phoneNumber");
                            boolean equals = jSONObject.optString("isFr").equals("1");
                            long j11 = jSONObject.getLong("lastActionTime");
                            int i14 = jSONObject.getInt("isActive");
                            int optInt = jSONObject.optInt("gender", i11);
                            String optString = jSONObject.optString("uname");
                            jSONArray = jSONArray2;
                            try {
                                String optString2 = jSONObject.optString("globalId");
                                ContactProfile contactProfile = new ContactProfile(string);
                                contactProfile.f42443u = string2;
                                contactProfile.f42437s = string3;
                                contactProfile.f42446v = string4;
                                contactProfile.f42455y = string5;
                                contactProfile.f42382U0 = i14;
                                contactProfile.f42336F = j11;
                                contactProfile.f42449w = optInt;
                                contactProfile.f42460z1 = optString;
                                contactProfile.m40407h1(optString2);
                                C21927m.this.f107800d.add(contactProfile);
                                synchronizedMap.remove(string);
                                if (!this.f107829a) {
                                    contactProfile.f42330D = System.currentTimeMillis();
                                }
                                C7960e.m41971c6().m42131G7(contactProfile, equals);
                                C28203u6.f131407a.m141824w(contactProfile);
                                C7960e.m41971c6().m42234Pb(contactProfile.f42434r);
                            } catch (Exception e11) {
                                e = e11;
                                e.printStackTrace();
                                i13++;
                                jSONArray2 = jSONArray;
                                i11 = 0;
                            }
                        } catch (Exception e12) {
                            e = e12;
                            jSONArray = jSONArray2;
                        }
                        i13++;
                        jSONArray2 = jSONArray;
                        i11 = 0;
                    }
                    if (C7960e.m41971c6() != null) {
                        C7960e.m41971c6().m42288Uc(synchronizedMap);
                    }
                    C21927m.m114302u().m114314L();
                } catch (Exception e13) {
                    e13.printStackTrace();
                }
                C21927m.this.f107817u = false;
                C21927m.f107777V = 0;
                AbstractC23309i.m121467Tr(System.currentTimeMillis());
                C19669z.m103146Y().m103198O0();
                C18644n.m98524E();
            } catch (Throwable th3) {
                th = th3;
                r22 = 0;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ks.m$f */
    /* loaded from: classes4.dex */
    public class f implements InterfaceC20094a {
        f() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                try {
                    AbstractC23309i.m121252Ny(AbstractC23304d.m120542m(C21927m.f107778W));
                    AbstractC23309i.m121578Wr(System.currentTimeMillis());
                    C21927m.f107778W++;
                    long[] jArr = AbstractC23304d.f113397j;
                    if (jArr != null && C21927m.f107778W == jArr.length) {
                        C21927m.f107778W = 0;
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            } finally {
                C21927m.this.f107818v = false;
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                try {
                    JSONObject jSONObject = new JSONObject(obj.toString());
                    JSONArray jSONArray = new JSONArray();
                    if (!jSONObject.isNull("data")) {
                        jSONArray = new JSONArray(jSONObject.getString("data"));
                    }
                    C7960e.m41971c6().m42501pb();
                    for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                        try {
                            String valueOf = String.valueOf(jSONArray.get(i11));
                            if (!TextUtils.isEmpty(valueOf) && !CoreUtility.f89233i.equals(valueOf)) {
                                C7960e.m41971c6().m42413h8(valueOf);
                            }
                        } catch (Exception e11) {
                            e11.printStackTrace();
                        }
                    }
                } catch (Exception e12) {
                    e12.printStackTrace();
                }
                C21927m.this.f107818v = false;
                C21927m.f107778W = 0;
                AbstractC23309i.m121252Ny(604800000L);
                AbstractC23309i.m121578Wr(System.currentTimeMillis());
                C18644n.m98531l().m98556s("getFavoriteFriendDONE");
            } catch (Throwable th2) {
                C21927m.this.f107818v = false;
                C21927m.f107778W = 0;
                AbstractC23309i.m121252Ny(604800000L);
                AbstractC23309i.m121578Wr(System.currentTimeMillis());
                C18644n.m98531l().m98556s("getFavoriteFriendDONE");
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ks.m$g */
    /* loaded from: classes4.dex */
    public class g implements InterfaceC20094a {

        /* renamed from: ks.m$g$a */
        /* loaded from: classes4.dex */
        class a extends AbstractC0939u {

            /* renamed from: a */
            final /* synthetic */ ContactProfile f107833a;

            a(ContactProfile contactProfile) {
                this.f107833a = contactProfile;
            }

            @Override // p660xw.InterfaceC30214a
            /* renamed from: a */
            public void mo928a() {
                C7960e.m41971c6().m42349b8(this.f107833a);
                C7960e.m41971c6().m42492od(this.f107833a);
            }
        }

        g() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            C21927m.f107779X++;
            if (c20096c != null && c20096c.m104491c() == -69) {
                AbstractC23309i.m121615Xr(System.currentTimeMillis());
                AbstractC23309i.m121178Ly(AbstractC23309i.m121555W4());
            } else {
                if (C21927m.f107779X == 0) {
                    C21927m.f107779X = 1;
                }
                AbstractC23309i.m121615Xr(System.currentTimeMillis());
                if (C21927m.m114302u().m114357s().isEmpty()) {
                    AbstractC23309i.m121178Ly(C21927m.f107779X * 300000);
                } else {
                    AbstractC23309i.m121178Ly(C21927m.f107779X * 900000);
                }
                if (C21927m.f107779X >= 3) {
                    C21927m.f107779X = 0;
                }
            }
            C21927m.this.f107819w = false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            boolean z11 = false;
            try {
                try {
                    C21927m.f107779X = 0;
                    AbstractC23309i.m121615Xr(System.currentTimeMillis());
                    AbstractC23309i.m121178Ly(AbstractC23309i.m121555W4());
                    Map synchronizedMap = Collections.synchronizedMap(new HashMap());
                    C31853b5 c31853b5 = C21927m.this.f107799c;
                    if (c31853b5 != null) {
                        try {
                            if (c31853b5.isEmpty()) {
                                C7960e.m41971c6().m42301W5();
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            C21927m.this.f107819w = z11;
                            throw th;
                        }
                    }
                    for (int i11 = 0; i11 < C21927m.this.f107799c.size(); i11++) {
                        synchronizedMap.put(((ContactProfile) C21927m.this.f107799c.get(i11)).f42434r, ((ContactProfile) C21927m.this.f107799c.get(i11)).f42434r);
                    }
                    C31853b5 c31853b52 = C21927m.this.f107799c;
                    if (c31853b52 != null) {
                        c31853b52.clear();
                    }
                    JSONArray jSONArray = new JSONObject(obj.toString()).getJSONArray("data");
                    for (int i12 = 0; i12 < jSONArray.length(); i12++) {
                        try {
                            JSONObject jSONObject = (JSONObject) jSONArray.get(i12);
                            String optString = jSONObject.optString("uid");
                            boolean optBoolean = jSONObject.optBoolean("is_fan");
                            String optString2 = jSONObject.optString("avt");
                            String optString3 = jSONObject.optString("stt");
                            int optInt = jSONObject.optInt("ttf");
                            String optString4 = jSONObject.optString("dpn");
                            boolean optBoolean2 = jSONObject.optBoolean("chatable");
                            int optInt2 = jSONObject.optInt(ZinstantMetaConstant.IMPRESSION_META_TYPE);
                            int optInt3 = jSONObject.optInt("group_msg", 1);
                            String optString5 = jSONObject.optString("desc");
                            String optString6 = jSONObject.optString("alias");
                            ContactProfile contactProfile = new ContactProfile(optString);
                            contactProfile.f42441t0 = optBoolean;
                            contactProfile.f42446v = optString2;
                            contactProfile.f42458z = optString3;
                            contactProfile.f42438s0 = optInt;
                            contactProfile.f42437s = optString4;
                            contactProfile.f42440t = AbstractC23262x6.m120002o(optString4);
                            contactProfile.f42444u0 = optBoolean2;
                            contactProfile.f42447v0 = optInt2;
                            contactProfile.f42352K0 = optInt2;
                            contactProfile.f42453x0 = optInt3;
                            contactProfile.f42436r1 = new SpannableStringBuilder(optString5);
                            contactProfile.f42442t1 = optString6;
                            C21927m.this.f107799c.add(contactProfile);
                            if (synchronizedMap.containsKey(optString)) {
                                synchronizedMap.remove(optString);
                            }
                            C0824j.m2153b(new a(contactProfile));
                        } catch (Exception e11) {
                            e11.printStackTrace();
                        }
                    }
                    if (synchronizedMap.size() > 0) {
                        C7960e.m41971c6().m42536sc(synchronizedMap);
                    }
                    C19669z.m103146Y().m103198O0();
                } catch (Exception e12) {
                    e12.printStackTrace();
                }
                C21927m.this.f107819w = false;
            } catch (Throwable th3) {
                th = th3;
                z11 = false;
            }
        }
    }

    /* renamed from: ks.m$h */
    /* loaded from: classes4.dex */
    public class h implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ ArrayList f107835a;

        /* renamed from: ks.m$h$a */
        /* loaded from: classes4.dex */
        class a extends AbstractC0939u {

            /* renamed from: a */
            final /* synthetic */ String f107837a;

            /* renamed from: b */
            final /* synthetic */ int f107838b;

            a(String str, int i11) {
                this.f107837a = str;
                this.f107838b = i11;
            }

            @Override // p660xw.InterfaceC30214a
            /* renamed from: a */
            public void mo928a() {
                try {
                    C7960e.m41971c6().m42415hc(this.f107837a);
                    if (this.f107838b == h.this.f107835a.size() - 1) {
                        C18644n.m98531l().m98538F();
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        }

        h(ArrayList arrayList) {
            this.f107835a = arrayList;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                JSONObject jSONObject = (JSONObject) obj;
                if (!jSONObject.isNull("error_code") && jSONObject.getInt("error_code") == 0) {
                    JSONArray jSONArray = new JSONArray();
                    try {
                        if (!jSONObject.isNull("data")) {
                            jSONArray = new JSONArray(jSONObject.getString("data"));
                        }
                    } catch (Exception e11) {
                        AbstractC20110a.m104539h(e11);
                    }
                    for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                        Integer num = (Integer) jSONArray.get(i11);
                        if (this.f107835a.contains(num)) {
                            this.f107835a.remove(num);
                        }
                    }
                    int size = this.f107835a.size();
                    for (int i12 = 0; i12 < size; i12++) {
                        C0824j.m2153b(new a(String.valueOf(this.f107835a.get(i12)), i12));
                    }
                    C18644n.m98524E();
                }
            } catch (Exception e12) {
                e12.printStackTrace();
            }
        }
    }

    /* renamed from: ks.m$i */
    /* loaded from: classes4.dex */
    public class i extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ String f107840a;

        /* renamed from: b */
        final /* synthetic */ long f107841b;

        i(String str, long j11) {
            this.f107840a = str;
            this.f107841b = j11;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7960e.m41971c6().m42465m8(this.f107840a, this.f107841b, -1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ks.m$j */
    /* loaded from: classes4.dex */
    public class j extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ String f107843a;

        /* renamed from: b */
        final /* synthetic */ String f107844b;

        /* renamed from: c */
        final /* synthetic */ TrackingSource f107845c;

        j(String str, String str2, TrackingSource trackingSource) {
            this.f107843a = str;
            this.f107844b = str2;
            this.f107845c = trackingSource;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            try {
                if (!TextUtils.isEmpty(this.f107843a) && !TextUtils.isEmpty(this.f107844b) && this.f107845c != null) {
                    C7960e.m41971c6().m42312X8(this.f107843a, this.f107844b, this.f107845c.m40686z());
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: ks.m$k */
    /* loaded from: classes4.dex */
    public class k extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ String f107847a;

        k(String str) {
            this.f107847a = str;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7960e.m41971c6().m42235Pc(this.f107847a);
        }
    }

    private C21927m() {
    }

    /* renamed from: T */
    public static boolean m114293T(ContactProfile contactProfile) {
        if (contactProfile != null) {
            try {
                if (!TextUtils.isEmpty(contactProfile.f42434r)) {
                    String str = contactProfile.f42434r;
                    List list = C19669z.f97579a0;
                    if (list.size() > 0) {
                        synchronized (list) {
                            int i11 = 0;
                            while (true) {
                                try {
                                    List list2 = C19669z.f97579a0;
                                    if (i11 < list2.size()) {
                                        if (str.equals((String) list2.get(i11))) {
                                            return true;
                                        }
                                        i11++;
                                    }
                                } finally {
                                }
                            }
                        }
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        return false;
    }

    /* renamed from: V */
    public static /* synthetic */ void m114294V(C28926f c28926f, String str) {
        c28926f.m101508a(new C28926f.b(str));
    }

    /* renamed from: W */
    public static /* synthetic */ int m114295W(ContactProfile contactProfile, ContactProfile contactProfile2) {
        return (int) (contactProfile2.m40402e0() - contactProfile.m40402e0());
    }

    /* renamed from: X */
    public /* synthetic */ void m114296X() {
        try {
            if (!TextUtils.isEmpty(CoreUtility.f89233i)) {
                try {
                    try {
                        List m114323Y = m114323Y();
                        synchronized (this.f107822z) {
                            this.f107822z.clear();
                            this.f107822z.addAll(m114323Y);
                        }
                        this.f107821y = true;
                    } catch (Exception e11) {
                        e11.printStackTrace();
                        this.f107821y = true;
                    }
                    m114325a0();
                } catch (Throwable th2) {
                    this.f107821y = true;
                    m114325a0();
                    throw th2;
                }
            }
        } catch (Exception e12) {
            AbstractC23350e.m122776f(f107772Q, e12);
        }
    }

    /* renamed from: c0 */
    public static C31874cb m114300c0(JSONObject jSONObject, int i11) {
        int i12;
        C31874cb c31874cb = null;
        if (jSONObject == null) {
            return null;
        }
        try {
            if (jSONObject.isNull("uid")) {
                return null;
            }
            C31874cb c31874cb2 = new C31874cb();
            try {
                c31874cb2.f146385a = jSONObject.optString("uid");
                c31874cb2.f146394j = jSONObject.optString("phone");
                c31874cb2.f146386b = jSONObject.optString("status");
                c31874cb2.f146387c = jSONObject.optString("dpn");
                jSONObject.optString("sgway");
                c31874cb2.f146391g = jSONObject.optInt("group_msg");
                c31874cb2.f146390f = jSONObject.optInt(ZinstantMetaConstant.IMPRESSION_META_TYPE);
                c31874cb2.f146396l = jSONObject.optString("msg");
                c31874cb2.f146397m = jSONObject.optString("customText");
                c31874cb2.f146393i = jSONObject.optString("avt");
                c31874cb2.f146398n = jSONObject.optLong("time");
                c31874cb2.f146395k = jSONObject.optInt("ged");
                c31874cb2.f146388d = jSONObject.optInt("age");
                if (jSONObject.has("ranking")) {
                    i12 = jSONObject.optInt("ranking");
                } else {
                    i12 = -1;
                }
                if (jSONObject.has("srcType")) {
                    c31874cb2.f146399o = jSONObject.optInt("srcType");
                } else {
                    int optInt = jSONObject.optInt("src");
                    if (optInt != 4 && optInt != 5) {
                        c31874cb2.f146399o = 1;
                    }
                    c31874cb2.f146399o = 2;
                }
                c31874cb2.f146392h = jSONObject.optString("usr");
                c31874cb2.f146389e = jSONObject.optInt("reqSrc");
                c31874cb2.f146406v = jSONObject.optInt("visibleActionMain", 1);
                c31874cb2.f146407w = jSONObject.optInt("visibleActionRemove", 1);
                c31874cb2.f146402r = jSONObject.optInt("account_type", 0);
                c31874cb2.f146403s = jSONObject.optString("business_account", "");
                c31874cb2.f146400p = i11;
                if (C23302b.f113247a.m120523d(c31874cb2.f146393i)) {
                    c31874cb2.f146401q = AbstractC23028c0.m118087g(c31874cb2.m153180d(true, false));
                }
                if (c31874cb2.f146389e == 41 && !TextUtils.isEmpty(c31874cb2.f146394j) && AbstractC0906d0.m2800f(MainApplication.getAppContext(), c31874cb2.f146394j) == null) {
                    c31874cb2.f146394j = "";
                }
                if (i12 != -1) {
                    ContactProfile mo98491j = AbstractC23063f2.m118350b(false).mo98491j(c31874cb2.f146385a);
                    if (mo98491j != null) {
                        mo98491j.f42369Q = i12;
                    }
                    C7960e.m41971c6().m42566vd(c31874cb2.f146385a, i12);
                }
                return c31874cb2;
            } catch (Exception e11) {
                e = e11;
                c31874cb = c31874cb2;
                e.printStackTrace();
                return c31874cb;
            }
        } catch (Exception e12) {
            e = e12;
        }
    }

    /* renamed from: s0 */
    private void m114301s0() {
        synchronized (m114302u().f107798b) {
            C32134u7 c32134u7 = new C32134u7();
            c32134u7.f148218a = "-13";
            c32134u7.f148219b = "";
            m114302u().m114303A().add(c32134u7);
            this.f107815s = true;
            C18644n.m98524E();
        }
    }

    /* renamed from: u */
    public static synchronized C21927m m114302u() {
        C21927m c21927m;
        synchronized (C21927m.class) {
            try {
                if (f107776U == null) {
                    synchronized (C21927m.class) {
                        try {
                            if (f107776U == null) {
                                f107776U = new C21927m();
                            }
                        } finally {
                        }
                    }
                }
                c21927m = f107776U;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c21927m;
    }

    /* renamed from: A */
    public List m114303A() {
        return this.f107798b;
    }

    /* renamed from: B */
    public Set m114304B() {
        HashSet hashSet = new HashSet();
        try {
            synchronized (this.f107798b) {
                try {
                    for (C32134u7 c32134u7 : this.f107798b) {
                        if (c32134u7 != null && !TextUtils.isEmpty(c32134u7.f148218a)) {
                            hashSet.add(c32134u7.f148218a);
                        }
                    }
                } finally {
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return hashSet;
    }

    /* renamed from: C */
    int m114305C(int i11) {
        if (i11 != -1) {
            return (i11 == 33 || i11 == 30 || i11 == 31) ? 1 : 9;
        }
        return 0;
    }

    /* renamed from: D */
    public TrackingSource m114306D(String str) {
        TrackingSource trackingSource;
        try {
            Map map = this.f107810n;
            if (map != null && map.containsKey(str)) {
                trackingSource = (TrackingSource) this.f107810n.get(str);
            } else {
                trackingSource = null;
            }
            TrackingSource m114310H = m114310H(str);
            if (m114310H != null) {
                if (trackingSource != null) {
                    if (m114349o(trackingSource.m40683t()) < m114349o(m114310H.m40683t())) {
                    }
                }
                return m114310H;
            }
            return trackingSource;
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    /* renamed from: E */
    public int m114307E(String str) {
        try {
            Map map = this.f107797a;
            if (map == null || !map.containsKey(str)) {
                return -1;
            }
            return ((TrackingSource) this.f107797a.get(str)).m40683t();
        } catch (Exception e11) {
            e11.printStackTrace();
            return -1;
        }
    }

    /* renamed from: F */
    public Map m114308F() {
        return this.f107797a;
    }

    /* renamed from: G */
    public C31853b5 m114309G() {
        return this.f107801e;
    }

    /* renamed from: H */
    public TrackingSource m114310H(String str) {
        Map map = this.f107797a;
        if (map != null && map.containsKey(str)) {
            return (TrackingSource) this.f107797a.get(str);
        }
        return null;
    }

    /* renamed from: I */
    public void m114311I(int i11) {
        boolean z11;
        try {
            if (!this.f107817u && !AbstractC23304d.f113427q1.get() && !AbstractC23304d.f113431r1.get()) {
                if (AbstractC23309i.m122495v7() == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                C0766k c0766k = new C0766k();
                c0766k.mo1704o8(new e(z11));
                this.f107817u = true;
                c0766k.mo1493N7(i11);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: J */
    public C31853b5 m114312J() {
        return this.f107800d;
    }

    /* renamed from: K */
    public void m114313K() {
        try {
            if (!this.f107818v && !AbstractC23304d.f113427q1.get() && !AbstractC23304d.f113431r1.get() && !C18644n.m98531l().f93827g.get() && !C18644n.m98531l().f93828h.get()) {
                C0766k c0766k = new C0766k();
                c0766k.mo1704o8(new f());
                this.f107818v = true;
                c0766k.mo1504Oa();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: L */
    public void m114314L() {
        Exception e11;
        try {
            try {
                C18635e m98553p = C18644n.m98531l().m98553p();
                int i11 = 0;
                boolean z11 = false;
                while (true) {
                    boolean z12 = true;
                    if (i11 >= m98553p.size()) {
                        break;
                    }
                    try {
                        ContactProfile contactProfile = (ContactProfile) m98553p.get(i11);
                        if (contactProfile != null) {
                            String str = contactProfile.f42455y;
                            C31901e8 m2800f = AbstractC0906d0.m2800f(MainApplication.getAppContext(), str);
                            if (m2800f != null && m2800f.m153301s()) {
                                long parseLong = Long.parseLong(contactProfile.f42434r);
                                if (m2800f.m153300r() != parseLong) {
                                    try {
                                        AbstractC0906d0.m2805k(MainApplication.getAppContext(), str, parseLong);
                                        z11 = true;
                                    } catch (Exception e12) {
                                        e11 = e12;
                                        AbstractC23350e.m122776f(f107772Q, e11);
                                        z11 = z12;
                                        i11++;
                                    }
                                }
                            } else {
                                C31901e8 m2801g = AbstractC0906d0.m2801g(MainApplication.getAppContext(), contactProfile.f42434r);
                                if (m2801g != null) {
                                    m2801g.m153291A(0L);
                                    z11 = true;
                                }
                            }
                        }
                    } catch (Exception e13) {
                        z12 = z11;
                        e11 = e13;
                    }
                    i11++;
                }
                for (int i12 = 0; i12 < this.f107800d.size(); i12++) {
                    try {
                        ContactProfile contactProfile2 = (ContactProfile) this.f107800d.get(i12);
                        if (contactProfile2 != null) {
                            String str2 = contactProfile2.f42455y;
                            C31901e8 m2800f2 = AbstractC0906d0.m2800f(MainApplication.getAppContext(), str2);
                            if (m2800f2 != null && m2800f2.m153301s()) {
                                long parseLong2 = Long.parseLong(contactProfile2.f42434r);
                                if (m2800f2.m153300r() != parseLong2) {
                                    try {
                                        AbstractC0906d0.m2805k(MainApplication.getAppContext(), str2, parseLong2);
                                        z11 = true;
                                    } catch (Exception e14) {
                                        e = e14;
                                        z11 = true;
                                        AbstractC23350e.m122776f(f107772Q, e);
                                    }
                                }
                            } else {
                                C31901e8 m2801g2 = AbstractC0906d0.m2801g(MainApplication.getAppContext(), contactProfile2.f42434r);
                                if (m2801g2 != null) {
                                    m2801g2.m153291A(0L);
                                    z11 = true;
                                }
                            }
                        }
                    } catch (Exception e15) {
                        e = e15;
                    }
                }
                if (z11 || !AbstractC23309i.m122487v()) {
                    AbstractC23028c0.m118095o(MainApplication.getAppContext());
                }
                AbstractC0906d0.m2795a();
            } catch (Exception e16) {
                AbstractC23350e.m122776f(f107772Q, e16);
            }
        } catch (OutOfMemoryError e17) {
            AbstractC23350e.m122776f(f107772Q, e17);
        }
    }

    /* renamed from: M */
    public boolean m114315M() {
        boolean z11;
        synchronized (this.f107822z) {
            z11 = this.f107821y;
        }
        return z11;
    }

    /* renamed from: N */
    public boolean m114316N(int i11) {
        return i11 >= this.f107788H && i11 <= this.f107789I;
    }

    /* renamed from: O */
    public boolean m114317O(int i11) {
        return i11 >= this.f107784D && i11 <= this.f107785E;
    }

    /* renamed from: P */
    public boolean m114318P(String str) {
        C31853b5 c31853b5;
        if (!TextUtils.isEmpty(str) && (c31853b5 = this.f107799c) != null && c31853b5.m153137g(str)) {
            return true;
        }
        return false;
    }

    /* renamed from: Q */
    public boolean m114319Q(String str) {
        boolean z11;
        int i11 = 0;
        if (m114318P(str) && this.f107799c.m153138j(str) != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11 && !TextUtils.isEmpty(str)) {
            while (true) {
                String[] strArr = f107780Y;
                if (i11 >= strArr.length) {
                    break;
                }
                if (str.equals(strArr[i11])) {
                    return true;
                }
                i11++;
            }
        }
        return z11;
    }

    /* renamed from: R */
    public boolean m114320R(String str) {
        List list = this.f107808l;
        if (list != null) {
            return list.contains(str);
        }
        return false;
    }

    /* renamed from: S */
    public boolean m114321S(String str) {
        ArrayList arrayList;
        try {
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        if (!TextUtils.isEmpty(str) && (arrayList = this.f107805i) != null && arrayList.size() != 0) {
            for (int i11 = 0; i11 < this.f107805i.size(); i11++) {
                if (str.trim().equals(((C32035n7) this.f107805i.get(i11)).m154511b())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    /* renamed from: U */
    public boolean m114322U(String str) {
        C31853b5 c31853b5 = this.f107799c;
        if (c31853b5 != null) {
            if (c31853b5.isEmpty()) {
                return C7960e.m41971c6().m42085C9(str);
            }
            return this.f107799c.m153137g(str);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0298 A[Catch: all -> 0x0067, Exception -> 0x006b, TryCatch #1 {Exception -> 0x006b, blocks: (B:362:0x0048, B:364:0x005c, B:22:0x007b, B:24:0x0083, B:26:0x008f, B:32:0x00b8, B:34:0x00c2, B:36:0x00d0, B:38:0x00de, B:40:0x0108, B:42:0x011c, B:46:0x0185, B:47:0x0127, B:49:0x0131, B:51:0x0163, B:52:0x0177, B:54:0x017e, B:59:0x0189, B:61:0x0196, B:63:0x01a2, B:67:0x01c2, B:71:0x01e0, B:92:0x028e, B:103:0x0298, B:105:0x029d, B:107:0x02d3, B:109:0x02d9, B:111:0x02e2, B:112:0x02fb, B:113:0x02ef, B:246:0x0321, B:355:0x02ab, B:357:0x02c8, B:99:0x028b), top: B:361:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02e2 A[Catch: all -> 0x0067, Exception -> 0x006b, TryCatch #1 {Exception -> 0x006b, blocks: (B:362:0x0048, B:364:0x005c, B:22:0x007b, B:24:0x0083, B:26:0x008f, B:32:0x00b8, B:34:0x00c2, B:36:0x00d0, B:38:0x00de, B:40:0x0108, B:42:0x011c, B:46:0x0185, B:47:0x0127, B:49:0x0131, B:51:0x0163, B:52:0x0177, B:54:0x017e, B:59:0x0189, B:61:0x0196, B:63:0x01a2, B:67:0x01c2, B:71:0x01e0, B:92:0x028e, B:103:0x0298, B:105:0x029d, B:107:0x02d3, B:109:0x02d9, B:111:0x02e2, B:112:0x02fb, B:113:0x02ef, B:246:0x0321, B:355:0x02ab, B:357:0x02c8, B:99:0x028b), top: B:361:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02ef A[Catch: all -> 0x0067, Exception -> 0x006b, TryCatch #1 {Exception -> 0x006b, blocks: (B:362:0x0048, B:364:0x005c, B:22:0x007b, B:24:0x0083, B:26:0x008f, B:32:0x00b8, B:34:0x00c2, B:36:0x00d0, B:38:0x00de, B:40:0x0108, B:42:0x011c, B:46:0x0185, B:47:0x0127, B:49:0x0131, B:51:0x0163, B:52:0x0177, B:54:0x017e, B:59:0x0189, B:61:0x0196, B:63:0x01a2, B:67:0x01c2, B:71:0x01e0, B:92:0x028e, B:103:0x0298, B:105:0x029d, B:107:0x02d3, B:109:0x02d9, B:111:0x02e2, B:112:0x02fb, B:113:0x02ef, B:246:0x0321, B:355:0x02ab, B:357:0x02c8, B:99:0x028b), top: B:361:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x04e1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0710 A[Catch: all -> 0x051e, Exception -> 0x070a, TryCatch #3 {Exception -> 0x070a, blocks: (B:128:0x06fe, B:189:0x06fb, B:224:0x0710, B:226:0x0721, B:227:0x0724, B:228:0x0727, B:230:0x073b, B:232:0x0742, B:234:0x074c, B:235:0x0754, B:237:0x0760), top: B:188:0x06fb }] */
    /* JADX WARN: Removed duplicated region for block: B:230:0x073b A[Catch: all -> 0x051e, Exception -> 0x070a, TryCatch #3 {Exception -> 0x070a, blocks: (B:128:0x06fe, B:189:0x06fb, B:224:0x0710, B:226:0x0721, B:227:0x0724, B:228:0x0727, B:230:0x073b, B:232:0x0742, B:234:0x074c, B:235:0x0754, B:237:0x0760), top: B:188:0x06fb }] */
    /* JADX WARN: Removed duplicated region for block: B:234:0x074c A[Catch: all -> 0x051e, Exception -> 0x070a, TryCatch #3 {Exception -> 0x070a, blocks: (B:128:0x06fe, B:189:0x06fb, B:224:0x0710, B:226:0x0721, B:227:0x0724, B:228:0x0727, B:230:0x073b, B:232:0x0742, B:234:0x074c, B:235:0x0754, B:237:0x0760), top: B:188:0x06fb }] */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0754 A[Catch: all -> 0x051e, Exception -> 0x070a, TryCatch #3 {Exception -> 0x070a, blocks: (B:128:0x06fe, B:189:0x06fb, B:224:0x0710, B:226:0x0721, B:227:0x0724, B:228:0x0727, B:230:0x073b, B:232:0x0742, B:234:0x074c, B:235:0x0754, B:237:0x0760), top: B:188:0x06fb }] */
    /* JADX WARN: Removed duplicated region for block: B:240:0x030d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x02a5 A[Catch: all -> 0x0767, Exception -> 0x076b, TRY_ENTER, TRY_LEAVE, TryCatch #18 {Exception -> 0x076b, all -> 0x0767, blocks: (B:8:0x0020, B:12:0x0031, B:17:0x003e, B:19:0x006f, B:30:0x009c, B:65:0x01ac, B:69:0x01c5, B:72:0x01f1, B:114:0x0301, B:116:0x04bc, B:353:0x02a5, B:359:0x01e5), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x01e5 A[Catch: all -> 0x0767, Exception -> 0x076b, TRY_ENTER, TryCatch #18 {Exception -> 0x076b, all -> 0x0767, blocks: (B:8:0x0020, B:12:0x0031, B:17:0x003e, B:19:0x006f, B:30:0x009c, B:65:0x01ac, B:69:0x01c5, B:72:0x01f1, B:114:0x0301, B:116:0x04bc, B:353:0x02a5, B:359:0x01e5), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01c2 A[Catch: all -> 0x0067, Exception -> 0x006b, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x006b, blocks: (B:362:0x0048, B:364:0x005c, B:22:0x007b, B:24:0x0083, B:26:0x008f, B:32:0x00b8, B:34:0x00c2, B:36:0x00d0, B:38:0x00de, B:40:0x0108, B:42:0x011c, B:46:0x0185, B:47:0x0127, B:49:0x0131, B:51:0x0163, B:52:0x0177, B:54:0x017e, B:59:0x0189, B:61:0x0196, B:63:0x01a2, B:67:0x01c2, B:71:0x01e0, B:92:0x028e, B:103:0x0298, B:105:0x029d, B:107:0x02d3, B:109:0x02d9, B:111:0x02e2, B:112:0x02fb, B:113:0x02ef, B:246:0x0321, B:355:0x02ab, B:357:0x02c8, B:99:0x028b), top: B:361:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01e0 A[Catch: all -> 0x0067, Exception -> 0x006b, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x006b, blocks: (B:362:0x0048, B:364:0x005c, B:22:0x007b, B:24:0x0083, B:26:0x008f, B:32:0x00b8, B:34:0x00c2, B:36:0x00d0, B:38:0x00de, B:40:0x0108, B:42:0x011c, B:46:0x0185, B:47:0x0127, B:49:0x0131, B:51:0x0163, B:52:0x0177, B:54:0x017e, B:59:0x0189, B:61:0x0196, B:63:0x01a2, B:67:0x01c2, B:71:0x01e0, B:92:0x028e, B:103:0x0298, B:105:0x029d, B:107:0x02d3, B:109:0x02d9, B:111:0x02e2, B:112:0x02fb, B:113:0x02ef, B:246:0x0321, B:355:0x02ab, B:357:0x02c8, B:99:0x028b), top: B:361:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01fb  */
    /* JADX WARN: Type inference failed for: r14v26 */
    /* JADX WARN: Type inference failed for: r14v27 */
    /* JADX WARN: Type inference failed for: r14v36 */
    /* JADX WARN: Type inference failed for: r14v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* renamed from: Y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    List m114323Y() {
        Exception exc;
        Throwable th2;
        boolean z11;
        int size;
        ?? m98559v;
        int i11;
        Exception exc2;
        int i12;
        int i13;
        Throwable th3;
        int i14;
        ArrayList arrayList;
        boolean z12;
        int i15;
        ContactProfile m98552o;
        int size2;
        int i16;
        int i17;
        long m122316qd;
        C18635e c18635e;
        int i18;
        boolean z13;
        int i19;
        Exception exc3;
        ContactProfile contactProfile;
        char charAt;
        String str;
        boolean z14;
        boolean z15;
        String str2;
        ContactProfile m98552o2;
        ContactProfile m98552o3;
        if (ZaloListView.m86977gN()) {
            return m114324Z();
        }
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList2 = new ArrayList();
        this.f107786F = -1;
        this.f107787G = -1;
        this.f107784D = -1;
        this.f107785E = -1;
        int i21 = 0;
        try {
        } catch (Exception e11) {
            e = e11;
        } catch (Throwable th4) {
            th = th4;
        }
        if (!C18644n.m98531l().m98551n().get()) {
            this.f107790J = 0;
            return arrayList2;
        }
        if (AbstractC23309i.m120781B7() == 1) {
            this.f107790J = 0;
            return arrayList2;
        }
        if (C18644n.m98531l().m98559v()) {
            try {
                try {
                    if (Math.abs(AbstractC23309i.m120781B7() - System.currentTimeMillis()) > 86400000 && AbstractC23309i.m121366R0() % 8 == 0) {
                        this.f107790J = 0;
                        return arrayList2;
                    }
                } catch (Throwable th5) {
                    th2 = th5;
                    this.f107790J = i21;
                    throw th2;
                }
            } catch (Exception e12) {
                exc = e12;
                exc.printStackTrace();
                this.f107790J = i21;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("**time load All Contact: ");
                sb2.append(System.currentTimeMillis() - currentTimeMillis);
                StringBuilder sb3 = new StringBuilder();
                sb3.append("ZaloFriendManager Zalolist size: ");
                sb3.append(arrayList2.size());
                return arrayList2;
            }
        }
        if (C18644n.m98531l().m98559v() && (AbstractC23309i.m120781B7() == 0 || C18644n.m98531l().f93827g.get() || C18644n.m98531l().m98557t())) {
            this.f107790J = 0;
            return arrayList2;
        }
        this.f107782B = 0;
        this.f107783C = 0;
        boolean z16 = true;
        boolean z17 = !TextUtils.isEmpty(AbstractC23309i.m122303q0());
        int m98555r = C18644n.m98531l().m98555r();
        if (AbstractC23309i.m121081Jb() == 1 && m114302u().m114367y() != null && m114302u().m114367y().size() > 0 && m98555r >= m114302u().m114367y().size()) {
            ContactProfile contactProfile2 = new ContactProfile();
            contactProfile2.f42437s = MainApplication.getAppContext().getString(AbstractC8020f0.str_label_header_newfiend);
            contactProfile2.m40403e1(false);
            contactProfile2.f42407e1 = true;
            contactProfile2.f42403c1 = false;
            arrayList2.add(contactProfile2);
            for (int size3 = m114302u().m114367y().size() - 1; size3 >= 0; size3--) {
                String m154511b = ((C32035n7) m114302u().m114367y().get(size3)).m154511b();
                if ((!z17 || !m114302u().m114345m(m154511b)) && (m98552o3 = C18644n.m98531l().m98552o(m154511b)) != null) {
                    ContactProfile contactProfile3 = new ContactProfile(m98552o3.f42434r);
                    contactProfile3.f42446v = m98552o3.f42446v;
                    contactProfile3.f42443u = m98552o3.f42443u;
                    contactProfile3.f42437s = m98552o3.f42437s;
                    contactProfile3.f42455y = m98552o3.f42455y;
                    contactProfile3.f42404d0 = m98552o3.f42404d0;
                    contactProfile3.f42460z1 = m98552o3.f42460z1;
                    contactProfile3.f42361N0 = m98552o3.f42361N0;
                    contactProfile3.f42403c1 = true;
                    contactProfile3.m40403e1(true);
                    if (C23302b.f113247a.m120523d(contactProfile3.f42446v)) {
                        contactProfile3.f42427o1 = AbstractC23028c0.m118087g(contactProfile3.m40385R(true, false, C18631a.m98446i().f93755g.get()));
                    }
                    arrayList2.add(contactProfile3);
                    if (this.f107784D == -1) {
                        this.f107784D = arrayList2.size() - 1;
                    }
                }
            }
            this.f107785E = arrayList2.size() - 1;
            if (arrayList2.size() == 1 && !((ContactProfile) arrayList2.get(0)).m40366G0()) {
                arrayList2.remove(0);
                this.f107785E = -1;
                this.f107784D = -1;
            } else {
                z11 = true;
                ContactProfile contactProfile4 = new ContactProfile();
                contactProfile4.f42437s = MainApplication.getAppContext().getString(AbstractC8020f0.str_label_grid_favorite);
                contactProfile4.m40403e1(false);
                if (!z11) {
                    contactProfile4.f42407e1 = true;
                    z11 = true;
                }
                contactProfile4.f42403c1 = false;
                arrayList2.add(contactProfile4);
                this.f107788H = -1;
                this.f107789I = -1;
                if (m114302u().m114351p().size() <= AbstractC23309i.m121115K8()) {
                    size = AbstractC23309i.m121115K8();
                } else {
                    size = m114302u().m114351p().size();
                }
                m98559v = C18644n.m98531l().m98559v();
                if (m98559v != 0) {
                    m98559v = 0;
                    i11 = 0;
                    while (m98559v < size) {
                        try {
                            String str3 = "";
                            if (m98559v < m114302u().m114351p().size()) {
                                str3 = (String) m114302u().m114351p().get(m98559v == true ? 1 : 0);
                            }
                            String str4 = str3;
                            if (!TextUtils.isEmpty(str4) && (m98552o2 = C18644n.m98531l().m98552o(str4)) != null) {
                                ContactProfile contactProfile5 = new ContactProfile(m98552o2.f42434r);
                                contactProfile5.f42446v = m98552o2.f42446v;
                                contactProfile5.f42443u = m98552o2.f42443u;
                                contactProfile5.f42437s = m98552o2.f42437s;
                                contactProfile5.f42455y = m98552o2.f42455y;
                                contactProfile5.f42460z1 = m98552o2.f42460z1;
                                contactProfile5.f42404d0 = m98552o2.f42404d0;
                                contactProfile5.f42361N0 = m98552o2.f42361N0;
                                contactProfile5.m40403e1(true);
                                if (C23302b.f113247a.m120523d(contactProfile5.f42446v)) {
                                    contactProfile5.f42427o1 = AbstractC23028c0.m118087g(contactProfile5.m40385R(true, false, C18631a.m98446i().f93755g.get()));
                                }
                                arrayList2.add(contactProfile5);
                                i11++;
                                if (this.f107788H == -1) {
                                    this.f107788H = arrayList2.size() - 1;
                                }
                            }
                        } catch (Exception e13) {
                            e13.printStackTrace();
                        }
                        m98559v = (m98559v == true ? 1 : 0) + 1;
                    }
                } else {
                    i11 = 0;
                }
                if (i11 <= 0) {
                    if (this.f107789I == -1) {
                        this.f107789I = arrayList2.size() - 1;
                    }
                } else if (arrayList2.size() > 0 && ((ContactProfile) arrayList2.get(arrayList2.size() - 1)).f42437s.equals(MainApplication.getAppContext().getString(AbstractC8020f0.str_label_grid_favorite))) {
                    arrayList2.remove(arrayList2.size() - 1);
                    z11 = false;
                }
                if (i11 > 0 && i11 < AbstractC23309i.m121115K8()) {
                    ContactProfile contactProfile6 = new ContactProfile("-1");
                    if (i11 != 0) {
                        contactProfile6.f42437s = MainApplication.getAppContext().getString(AbstractC8020f0.str_func_add_favorite_exist_more);
                    } else {
                        contactProfile6.f42437s = MainApplication.getAppContext().getString(AbstractC8020f0.str_func_add_favorite_more);
                    }
                    contactProfile6.m40403e1(true);
                    arrayList2.add(contactProfile6);
                }
                this.f107783C = arrayList2.size();
                if (AbstractC23309i.m121118Kb() == 1) {
                    try {
                        try {
                            if (AbstractC23309i.m121308Pg()) {
                                ContactProfile contactProfile7 = new ContactProfile("-2");
                                contactProfile7.m40403e1(true);
                                if (i11 <= 0 && !z11) {
                                    contactProfile7.f42407e1 = true;
                                    z11 = true;
                                }
                                arrayList2.add(contactProfile7);
                                arrayList2.size();
                                if (m114302u().m114303A() != null && m114302u().m114303A().size() > 0 && m98555r >= 0 && AbstractC23309i.m121308Pg()) {
                                    try {
                                        try {
                                        } catch (Throwable th6) {
                                            th3 = th6;
                                            i14 = m98559v;
                                        }
                                    } catch (Exception e14) {
                                        exc2 = e14;
                                        i12 = 0;
                                    }
                                    synchronized (m114302u().m114303A()) {
                                        try {
                                            ArrayList arrayList3 = new ArrayList();
                                            for (int i22 = 0; i22 < m114302u().m114303A().size(); i22++) {
                                                C32134u7 c32134u7 = (C32134u7) m114302u().m114303A().get(i22);
                                                String str5 = c32134u7.f148218a;
                                                if (!CoreUtility.f89233i.equals(str5) && !m114302u().m114312J().m153137g(str5) && ((!z17 || !m114302u().m114345m(str5)) && (m98552o = C18644n.m98531l().m98552o(str5)) != null)) {
                                                    m98552o.f42458z = c32134u7.f148219b;
                                                    arrayList3.add(m98552o);
                                                }
                                            }
                                            int size4 = arrayList3.size();
                                            int min = Math.min(AbstractC23309i.m120929F7(), size4);
                                            int i23 = 0;
                                            int i24 = 0;
                                            while (true) {
                                                if (i23 >= size4) {
                                                    break;
                                                }
                                                ContactProfile contactProfile8 = (ContactProfile) arrayList3.get(i23);
                                                if (contactProfile8 != null) {
                                                    ContactProfile contactProfile9 = new ContactProfile(contactProfile8);
                                                    contactProfile9.f42430p1 = z16;
                                                    if (i24 == size4 - 1) {
                                                        z12 = true;
                                                    } else {
                                                        z12 = false;
                                                    }
                                                    contactProfile9.f42405d1 = z12;
                                                    if (C23302b.f113247a.m120523d(contactProfile9.f42446v)) {
                                                        arrayList = arrayList3;
                                                        contactProfile9.f42427o1 = AbstractC23028c0.m118087g(contactProfile9.m40385R(true, false, C18631a.m98446i().f93755g.get()));
                                                    } else {
                                                        arrayList = arrayList3;
                                                    }
                                                    arrayList2.add(contactProfile9);
                                                    i24++;
                                                    int i25 = min - ((i23 - i24) + 1);
                                                    if (size4 > 3 && i24 >= i25) {
                                                        ContactProfile contactProfile10 = new ContactProfile("-5");
                                                        if (i24 < size4) {
                                                            if (i25 == 3) {
                                                                contactProfile10.f42335E1 = 0;
                                                                i15 = 1;
                                                            } else {
                                                                i15 = 1;
                                                                contactProfile10.f42335E1 = 1;
                                                            }
                                                        } else {
                                                            i15 = 1;
                                                            contactProfile10.f42335E1 = 2;
                                                        }
                                                        this.f107787G = arrayList2.size() - i15;
                                                        arrayList2.add(contactProfile10);
                                                    } else if (this.f107786F == -1) {
                                                        this.f107786F = arrayList2.size() - 1;
                                                    }
                                                } else {
                                                    arrayList = arrayList3;
                                                }
                                                i23++;
                                                arrayList3 = arrayList;
                                                z16 = true;
                                                i24 = i24;
                                            }
                                            if (this.f107787G == -1) {
                                                this.f107787G = arrayList2.size() - 1;
                                            }
                                            i13 = i24;
                                            if (i13 > 0) {
                                                z11 = true;
                                            }
                                        } catch (Throwable th7) {
                                            th3 = th7;
                                            i14 = 0;
                                            try {
                                                throw th3;
                                            } catch (Exception e15) {
                                                exc2 = e15;
                                                i12 = i14;
                                                AbstractC23350e.m122774d(f107772Q, exc2.toString());
                                                i13 = i12;
                                                if (i13 > 0) {
                                                }
                                                if (AbstractC23309i.m121308Pg()) {
                                                    ContactProfile contactProfile11 = new ContactProfile("-4");
                                                    contactProfile11.f42437s = MainApplication.getAppContext().getString(AbstractC8020f0.str_des_empty_list_online);
                                                    contactProfile11.m40403e1(true);
                                                    arrayList2.add(contactProfile11);
                                                }
                                                this.f107782B = arrayList2.size();
                                                C18635e mo98465a = C18644n.m98531l().mo98465a(null, true);
                                                int m122127lb = AbstractC23309i.m122127lb();
                                                int size5 = arrayList2.size();
                                                size2 = mo98465a.size();
                                                int i26 = -1;
                                                char c11 = '#';
                                                i16 = 0;
                                                i17 = 0;
                                                while (i17 < size2) {
                                                }
                                                if (i16 > 0) {
                                                }
                                                C25639i.m132496q().m132458b();
                                                C25637g.m132489q().m132458b();
                                                if (AbstractC23309i.m120740A3() != 0) {
                                                }
                                                this.f107790J = i16;
                                                StringBuilder sb22 = new StringBuilder();
                                                sb22.append("**time load All Contact: ");
                                                sb22.append(System.currentTimeMillis() - currentTimeMillis);
                                                StringBuilder sb32 = new StringBuilder();
                                                sb32.append("ZaloFriendManager Zalolist size: ");
                                                sb32.append(arrayList2.size());
                                                return arrayList2;
                                            }
                                        }
                                    }
                                }
                                if (AbstractC23309i.m121308Pg() && m114302u().m114303A().size() == 0) {
                                    ContactProfile contactProfile112 = new ContactProfile("-4");
                                    contactProfile112.f42437s = MainApplication.getAppContext().getString(AbstractC8020f0.str_des_empty_list_online);
                                    contactProfile112.m40403e1(true);
                                    arrayList2.add(contactProfile112);
                                }
                            } else {
                                ContactProfile contactProfile12 = new ContactProfile("-7");
                                if (!z11) {
                                    contactProfile12.f42407e1 = true;
                                    z11 = true;
                                }
                                arrayList2.add(contactProfile12);
                            }
                        } catch (Exception e16) {
                            e = e16;
                            exc = e;
                            i21 = 0;
                            exc.printStackTrace();
                            this.f107790J = i21;
                            StringBuilder sb222 = new StringBuilder();
                            sb222.append("**time load All Contact: ");
                            sb222.append(System.currentTimeMillis() - currentTimeMillis);
                            StringBuilder sb322 = new StringBuilder();
                            sb322.append("ZaloFriendManager Zalolist size: ");
                            sb322.append(arrayList2.size());
                            return arrayList2;
                        }
                    } catch (Throwable th8) {
                        th = th8;
                        th2 = th;
                        i21 = 0;
                        this.f107790J = i21;
                        throw th2;
                    }
                }
                this.f107782B = arrayList2.size();
                C18635e mo98465a2 = C18644n.m98531l().mo98465a(null, true);
                int m122127lb2 = AbstractC23309i.m122127lb();
                int size52 = arrayList2.size();
                size2 = mo98465a2.size();
                int i262 = -1;
                char c112 = '#';
                i16 = 0;
                i17 = 0;
                while (i17 < size2) {
                    try {
                        try {
                            contactProfile = (ContactProfile) mo98465a2.get(i17);
                        } catch (Throwable th9) {
                            th2 = th9;
                            i21 = i16;
                            this.f107790J = i21;
                            throw th2;
                        }
                    } catch (Exception e17) {
                        e = e17;
                        c18635e = mo98465a2;
                    }
                    if (contactProfile != null) {
                        c18635e = mo98465a2;
                        try {
                        } catch (Exception e18) {
                            e = e18;
                            i18 = m122127lb2;
                            z13 = z17;
                            i19 = size2;
                            exc3 = e;
                            try {
                                exc3.printStackTrace();
                                i17++;
                                mo98465a2 = c18635e;
                                size2 = i19;
                                m122127lb2 = i18;
                                z17 = z13;
                            } catch (Exception e19) {
                                exc = e19;
                                i21 = i16;
                                exc.printStackTrace();
                                this.f107790J = i21;
                                StringBuilder sb2222 = new StringBuilder();
                                sb2222.append("**time load All Contact: ");
                                sb2222.append(System.currentTimeMillis() - currentTimeMillis);
                                StringBuilder sb3222 = new StringBuilder();
                                sb3222.append("ZaloFriendManager Zalolist size: ");
                                sb3222.append(arrayList2.size());
                                return arrayList2;
                            }
                        }
                        if (!TextUtils.isEmpty(contactProfile.f42434r)) {
                            i19 = size2;
                            try {
                            } catch (Exception e21) {
                                e = e21;
                                i18 = m122127lb2;
                                z13 = z17;
                            }
                            if (!contactProfile.f42434r.equals(CoreUtility.f89233i)) {
                                if (z17) {
                                    try {
                                        if (m114302u().m114345m(contactProfile.f42434r)) {
                                        }
                                    } catch (Exception e22) {
                                        exc3 = e22;
                                        i18 = m122127lb2;
                                        z13 = z17;
                                        exc3.printStackTrace();
                                        i17++;
                                        mo98465a2 = c18635e;
                                        size2 = i19;
                                        m122127lb2 = i18;
                                        z17 = z13;
                                    }
                                }
                                if (m122127lb2 != 1 || contactProfile.f42382U0 != 0) {
                                    if (TextUtils.isEmpty(contactProfile.f42440t)) {
                                        StringBuilder sb4 = new StringBuilder();
                                        sb4.append("");
                                        i18 = m122127lb2;
                                        z13 = z17;
                                        try {
                                            sb4.append(contactProfile.m40385R(true, false, C18631a.m98446i().f93755g.get()).trim().charAt(0));
                                            charAt = AbstractC23262x6.m120002o(sb4.toString()).trim().toUpperCase(Locale.ENGLISH).charAt(0);
                                        } catch (Exception e23) {
                                            e = e23;
                                            exc3 = e;
                                            exc3.printStackTrace();
                                            i17++;
                                            mo98465a2 = c18635e;
                                            size2 = i19;
                                            m122127lb2 = i18;
                                            z17 = z13;
                                        }
                                    } else {
                                        i18 = m122127lb2;
                                        z13 = z17;
                                        charAt = ("" + contactProfile.f42440t.trim().charAt(0)).toUpperCase(Locale.ENGLISH).charAt(0);
                                    }
                                    i262++;
                                    if (i262 != 0) {
                                        if (this.f107781A.indexOf(c112) != -1) {
                                            if (charAt > c112) {
                                                if (this.f107781A.indexOf(charAt) != -1) {
                                                    ContactProfile contactProfile13 = new ContactProfile();
                                                    contactProfile13.f42437s = "" + charAt;
                                                    contactProfile13.m40403e1(false);
                                                    contactProfile13.f42403c1 = false;
                                                    contactProfile13.f42335E1 = 1;
                                                    int size6 = arrayList2.size();
                                                    if (size6 > 0) {
                                                        int i27 = size6 - 1;
                                                        if (((ContactProfile) arrayList2.get(i27)).m40366G0()) {
                                                            ((ContactProfile) arrayList2.get(i27)).f42405d1 = true;
                                                        }
                                                    }
                                                    arrayList2.add(contactProfile13);
                                                } else {
                                                    ContactProfile contactProfile14 = new ContactProfile();
                                                    if (this.f107781A.indexOf(charAt) == -1) {
                                                        str2 = "##";
                                                    } else {
                                                        str2 = "" + charAt;
                                                    }
                                                    contactProfile14.f42437s = str2;
                                                    contactProfile14.m40403e1(false);
                                                    contactProfile14.f42335E1 = 1;
                                                    contactProfile14.f42403c1 = false;
                                                    arrayList2.add(contactProfile14);
                                                }
                                            }
                                        } else if (this.f107781A.indexOf(charAt) != -1) {
                                            ContactProfile contactProfile15 = new ContactProfile();
                                            contactProfile15.f42437s = "" + charAt;
                                            contactProfile15.m40403e1(false);
                                            contactProfile15.f42335E1 = 1;
                                            contactProfile15.f42403c1 = false;
                                            int size7 = arrayList2.size();
                                            if (size7 > 0) {
                                                int i28 = size7 - 1;
                                                if (((ContactProfile) arrayList2.get(i28)).m40366G0()) {
                                                    ((ContactProfile) arrayList2.get(i28)).f42405d1 = true;
                                                }
                                            }
                                            arrayList2.add(contactProfile15);
                                        }
                                        z14 = false;
                                        z15 = true;
                                    } else {
                                        ContactProfile contactProfile16 = new ContactProfile();
                                        if (this.f107781A.indexOf(charAt) == -1) {
                                            str = "#";
                                        } else {
                                            str = "" + charAt;
                                        }
                                        contactProfile16.f42437s = str;
                                        z14 = false;
                                        contactProfile16.m40403e1(false);
                                        z15 = true;
                                        contactProfile16.f42335E1 = 1;
                                        contactProfile16.f42403c1 = false;
                                        arrayList2.add(contactProfile16);
                                    }
                                    contactProfile.m40403e1(z15);
                                    contactProfile.f42403c1 = z14;
                                    contactProfile.f42405d1 = z14;
                                    contactProfile.f42399a1.clear();
                                    if (C23302b.f113247a.m120523d(contactProfile.f42446v)) {
                                        contactProfile.f42427o1 = AbstractC23028c0.m118087g(contactProfile.m40385R(true, false, C18631a.m98446i().f93755g.get()));
                                    }
                                    arrayList2.add(contactProfile);
                                    i16++;
                                    c112 = charAt;
                                    i17++;
                                    mo98465a2 = c18635e;
                                    size2 = i19;
                                    m122127lb2 = i18;
                                    z17 = z13;
                                }
                            }
                            i18 = m122127lb2;
                            z13 = z17;
                            i17++;
                            mo98465a2 = c18635e;
                            size2 = i19;
                            m122127lb2 = i18;
                            z17 = z13;
                        }
                    } else {
                        c18635e = mo98465a2;
                    }
                    i18 = m122127lb2;
                    z13 = z17;
                    i19 = size2;
                    i17++;
                    mo98465a2 = c18635e;
                    size2 = i19;
                    m122127lb2 = i18;
                    z17 = z13;
                }
                if (i16 > 0) {
                    int min2 = Math.min(size52, arrayList2.size());
                    ContactProfile contactProfile17 = new ContactProfile("-6");
                    if (!z11) {
                        contactProfile17.f42407e1 = true;
                    }
                    arrayList2.add(min2, contactProfile17);
                }
                C25639i.m132496q().m132458b();
                C25637g.m132489q().m132458b();
                if (AbstractC23309i.m120740A3() != 0 && AbstractC23309i.m120970Gb() == 1) {
                    m122316qd = AbstractC23309i.m122316qd();
                    if (m122316qd != 0) {
                        AbstractC23309i.m121289Oy(System.currentTimeMillis());
                    } else if (System.currentTimeMillis() - m122316qd >= 432000000) {
                        AbstractC23309i.m121324Pw(0);
                    }
                }
                this.f107790J = i16;
                StringBuilder sb22222 = new StringBuilder();
                sb22222.append("**time load All Contact: ");
                sb22222.append(System.currentTimeMillis() - currentTimeMillis);
                StringBuilder sb32222 = new StringBuilder();
                sb32222.append("ZaloFriendManager Zalolist size: ");
                sb32222.append(arrayList2.size());
                return arrayList2;
            }
        }
        z11 = false;
        ContactProfile contactProfile42 = new ContactProfile();
        contactProfile42.f42437s = MainApplication.getAppContext().getString(AbstractC8020f0.str_label_grid_favorite);
        contactProfile42.m40403e1(false);
        if (!z11) {
        }
        contactProfile42.f42403c1 = false;
        arrayList2.add(contactProfile42);
        this.f107788H = -1;
        this.f107789I = -1;
        if (m114302u().m114351p().size() <= AbstractC23309i.m121115K8()) {
        }
        m98559v = C18644n.m98531l().m98559v();
        if (m98559v != 0) {
        }
        if (i11 <= 0) {
        }
        if (i11 > 0) {
            ContactProfile contactProfile62 = new ContactProfile("-1");
            if (i11 != 0) {
            }
            contactProfile62.m40403e1(true);
            arrayList2.add(contactProfile62);
        }
        this.f107783C = arrayList2.size();
        if (AbstractC23309i.m121118Kb() == 1) {
        }
        this.f107782B = arrayList2.size();
        C18635e mo98465a22 = C18644n.m98531l().mo98465a(null, true);
        int m122127lb22 = AbstractC23309i.m122127lb();
        int size522 = arrayList2.size();
        size2 = mo98465a22.size();
        int i2622 = -1;
        char c1122 = '#';
        i16 = 0;
        i17 = 0;
        while (i17 < size2) {
        }
        if (i16 > 0) {
        }
        C25639i.m132496q().m132458b();
        C25637g.m132489q().m132458b();
        if (AbstractC23309i.m120740A3() != 0) {
            m122316qd = AbstractC23309i.m122316qd();
            if (m122316qd != 0) {
            }
        }
        this.f107790J = i16;
        StringBuilder sb222222 = new StringBuilder();
        sb222222.append("**time load All Contact: ");
        sb222222.append(System.currentTimeMillis() - currentTimeMillis);
        StringBuilder sb322222 = new StringBuilder();
        sb322222.append("ZaloFriendManager Zalolist size: ");
        sb322222.append(arrayList2.size());
        return arrayList2;
    }

    /* renamed from: Z */
    List m114324Z() {
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        long currentTimeMillis = System.currentTimeMillis();
        this.f107788H = -1;
        this.f107789I = -1;
        this.f107786F = -1;
        this.f107787G = -1;
        this.f107784D = -1;
        this.f107785E = -1;
        this.f107782B = 0;
        this.f107783C = 0;
        try {
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        if (!C18644n.m98531l().m98551n().get()) {
            return arrayList;
        }
        if (AbstractC23309i.m120781B7() == 1) {
            return arrayList;
        }
        if (C18644n.m98531l().m98559v() && Math.abs(AbstractC23309i.m120781B7() - System.currentTimeMillis()) > 86400000 && AbstractC23309i.m121366R0() % 8 == 0) {
            return arrayList;
        }
        if (C18644n.m98531l().m98559v() && (AbstractC23309i.m120781B7() == 0 || C18644n.m98531l().f93827g.get() || C18644n.m98531l().m98557t())) {
            return arrayList;
        }
        boolean z11 = !TextUtils.isEmpty(AbstractC23309i.m122303q0());
        arrayList.add(new ContactProfile("-8"));
        this.f107794N = m114335h(arrayList, z11, hashSet);
        int m114329e = m114329e(arrayList, z11, hashSet);
        this.f107793M = m114329e;
        if (m114329e == 0 && this.f107791K == 2) {
            this.f107791K = 0;
        }
        m114327d(arrayList, z11, hashSet);
        this.f107783C = arrayList.size();
        this.f107782B = arrayList.size();
        this.f107790J = m114339j(arrayList, z11, hashSet);
        C25639i.m132496q().m132458b();
        C25637g.m132489q().m132458b();
        if (AbstractC23309i.m120740A3() != 0 && AbstractC23309i.m120970Gb() == 1) {
            long m122316qd = AbstractC23309i.m122316qd();
            if (m122316qd == 0) {
                AbstractC23309i.m121289Oy(System.currentTimeMillis());
            } else if (System.currentTimeMillis() - m122316qd >= 432000000) {
                AbstractC23309i.m121324Pw(0);
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("**time load All Contact: ");
        sb2.append(System.currentTimeMillis() - currentTimeMillis);
        StringBuilder sb3 = new StringBuilder();
        sb3.append("ZaloFriendManager Zalolist size: ");
        sb3.append(arrayList.size());
        return arrayList;
    }

    /* renamed from: a0 */
    public void m114325a0() {
        C23744a.m124114c().m124116d(6073, new Object[0]);
    }

    /* renamed from: b0 */
    public void m114326b0() {
        try {
            try {
                AbstractC23309i.m121432St(false);
                m114302u().m114347n();
                m114302u().m114358t().clear();
                C0824j.m2153b(new b());
                AbstractC23309i.m122654zi("");
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        } finally {
            C19669z.m103146Y().m103198O0();
            C18644n.m98524E();
        }
    }

    /* renamed from: d */
    void m114327d(List list, boolean z11, Set set) {
        int size;
        String str;
        ContactProfile m98552o;
        if (this.f107791K == 0) {
            ContactProfile contactProfile = new ContactProfile();
            contactProfile.f42437s = MainApplication.getAppContext().getString(AbstractC8020f0.str_label_grid_favorite);
            contactProfile.m40403e1(false);
            contactProfile.f42407e1 = true;
            list.add(contactProfile);
            if (m114302u().m114351p().size() > AbstractC23309i.m121115K8()) {
                size = AbstractC23309i.m121115K8();
            } else {
                size = m114302u().m114351p().size();
            }
            if (!C18644n.m98531l().m98559v()) {
                int i11 = 0;
                for (int i12 = 0; i12 < size; i12++) {
                    try {
                        if (i12 >= m114302u().m114351p().size()) {
                            str = "";
                        } else {
                            str = (String) m114302u().m114351p().get(i12);
                        }
                        if (!TextUtils.isEmpty(str) && ((!z11 || !m114302u().m114345m(str)) && (m98552o = C18644n.m98531l().m98552o(str)) != null)) {
                            ContactProfile contactProfile2 = new ContactProfile(m98552o.f42434r);
                            contactProfile2.f42446v = m98552o.f42446v;
                            contactProfile2.f42443u = m98552o.f42443u;
                            contactProfile2.f42437s = m98552o.f42437s;
                            contactProfile2.f42455y = m98552o.f42455y;
                            contactProfile2.f42460z1 = m98552o.f42460z1;
                            contactProfile2.f42404d0 = m98552o.f42404d0;
                            contactProfile2.f42361N0 = m98552o.f42361N0;
                            contactProfile2.m40403e1(true);
                            contactProfile2.f42430p1 = set.contains(contactProfile2.f42434r);
                            contactProfile2.f42458z = "";
                            if (C23302b.f113247a.m120523d(contactProfile2.f42446v)) {
                                contactProfile2.f42427o1 = AbstractC23028c0.m118087g(contactProfile2.m40385R(true, false, C18631a.m98446i().f93755g.get()));
                            }
                            list.add(contactProfile2);
                            i11++;
                            if (this.f107788H == -1) {
                                this.f107788H = list.size() - 1;
                            }
                        }
                    } catch (Exception e11) {
                        e11.printStackTrace();
                    }
                }
                if (i11 > 0) {
                    this.f107789I = list.size() - 1;
                    return;
                }
            }
            if (list.size() > 0 && ((ContactProfile) list.get(list.size() - 1)).f42437s.equals(MainApplication.getAppContext().getString(AbstractC8020f0.str_label_grid_favorite))) {
                list.remove(list.size() - 1);
            }
        }
    }

    /* renamed from: d0 */
    public void m114328d0(String str, TrackingSource trackingSource) {
        try {
            Map map = this.f107810n;
            if (map != null) {
                if (map.containsKey(str)) {
                    TrackingSource trackingSource2 = (TrackingSource) this.f107810n.get(str);
                    if (trackingSource2 != null) {
                        int m40683t = trackingSource2.m40683t();
                        int m40683t2 = trackingSource.m40683t();
                        int m114349o = m114349o(m40683t);
                        int m114349o2 = m114349o(m40683t2);
                        if (m40683t != m40683t2) {
                            if (m114349o2 > m114349o || (m114349o2 == m114349o && m114349o2 == 9)) {
                                this.f107810n.put(str, trackingSource);
                            }
                        } else {
                            trackingSource2.m40685y(trackingSource.m40680m());
                            this.f107810n.put(str, trackingSource2);
                        }
                    } else {
                        this.f107810n.put(str, trackingSource);
                    }
                } else {
                    this.f107810n.put(str, trackingSource);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: e */
    public int m114329e(List list, boolean z11, Set set) {
        ContactProfile m98552o;
        int m98555r = C18644n.m98531l().m98555r();
        if (AbstractC23309i.m121081Jb() != 1 || m114302u().m114367y() == null || m114302u().m114367y().size() <= 0 || m98555r < m114302u().m114367y().size()) {
            return 0;
        }
        int i11 = 0;
        for (int size = m114302u().m114367y().size() - 1; size >= 0; size--) {
            String m154511b = ((C32035n7) m114302u().m114367y().get(size)).m154511b();
            if ((!z11 || !m114302u().m114345m(m154511b)) && (m98552o = C18644n.m98531l().m98552o(m154511b)) != null) {
                if (i11 == 0 && this.f107791K == 2) {
                    ContactProfile contactProfile = new ContactProfile("-12");
                    contactProfile.m40403e1(true);
                    list.add(contactProfile);
                }
                i11++;
                if (this.f107791K == 2) {
                    ContactProfile contactProfile2 = new ContactProfile(m98552o.f42434r);
                    contactProfile2.f42446v = m98552o.f42446v;
                    contactProfile2.f42443u = m98552o.f42443u;
                    contactProfile2.f42437s = m98552o.f42437s;
                    contactProfile2.f42455y = m98552o.f42455y;
                    contactProfile2.f42404d0 = m98552o.f42404d0;
                    contactProfile2.f42460z1 = m98552o.f42460z1;
                    contactProfile2.f42361N0 = m98552o.f42361N0;
                    contactProfile2.f42403c1 = false;
                    contactProfile2.m40403e1(true);
                    contactProfile2.f42430p1 = set.contains(contactProfile2.f42434r);
                    contactProfile2.f42458z = "";
                    if (C23302b.f113247a.m120523d(contactProfile2.f42446v)) {
                        contactProfile2.f42427o1 = AbstractC23028c0.m118087g(contactProfile2.m40385R(true, false, C18631a.m98446i().f93755g.get()));
                    }
                    list.add(contactProfile2);
                    if (this.f107784D == -1) {
                        this.f107784D = list.size() - 1;
                    }
                }
            }
        }
        if (i11 > 0 && this.f107791K == 2) {
            this.f107785E = list.size() - 1;
        }
        return i11;
    }

    /* renamed from: e0 */
    public void m114330e0(String str, TrackingSource trackingSource) {
        try {
            Map map = this.f107797a;
            if (map != null) {
                if (map.containsKey(str)) {
                    TrackingSource trackingSource2 = (TrackingSource) this.f107797a.get(str);
                    if (trackingSource2 != null) {
                        int m40683t = trackingSource2.m40683t();
                        int m40683t2 = trackingSource.m40683t();
                        int m114305C = m114305C(m40683t);
                        int m114305C2 = m114305C(m40683t2);
                        if (m40683t != m40683t2) {
                            if (m114305C2 > m114305C || (m114305C2 == m114305C && m114305C2 == 9)) {
                                this.f107797a.put(str, trackingSource);
                            }
                        } else {
                            trackingSource2.m40685y(trackingSource.m40680m());
                            this.f107797a.put(str, trackingSource2);
                        }
                    } else {
                        this.f107797a.put(str, trackingSource);
                    }
                } else {
                    this.f107797a.put(str, trackingSource);
                }
                if (trackingSource.m40683t() != -1 && trackingSource.m40683t() != 30 && trackingSource.m40683t() != 10) {
                    C0824j.m2153b(new j(CoreUtility.f89233i, str, (TrackingSource) this.f107797a.get(str)));
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: f */
    public void m114331f(String str, ContactProfile contactProfile, boolean z11) {
        m114333g(str, contactProfile, z11, true);
    }

    /* renamed from: f0 */
    public void m114332f0(String str, long j11, boolean z11) {
        try {
            String valueOf = String.valueOf(j11);
            String valueOf2 = String.valueOf(System.currentTimeMillis());
            int length = valueOf.length() - valueOf2.length();
            if (length > 0) {
                int i11 = 1;
                for (int i12 = 0; i12 < length; i12++) {
                    i11 *= 10;
                }
                if (i11 > 1) {
                    long j12 = i11;
                    if (String.valueOf(j11 / j12).length() == valueOf2.length()) {
                        j11 /= j12;
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        if (z11) {
            try {
                C0824j.m2153b(new i(str, j11));
            } catch (Exception e12) {
                e12.printStackTrace();
                return;
            }
        }
        Map map = C19669z.f97576X;
        if (map != null) {
            map.put(str, Long.valueOf(j11));
        }
    }

    /* renamed from: g */
    public void m114333g(String str, ContactProfile contactProfile, boolean z11, boolean z12) {
        try {
            synchronized (this.f107803g) {
                this.f107803g.put(str, contactProfile);
            }
            if (z11) {
                C0824j.m2153b(new a(str));
                C7860a.Companion.m40303b().m40289k0(str);
                AbstractC23304d.f113435s1.set(true);
                C23744a.m124114c().m124116d(27, new Object[0]);
                C23744a.m124114c().m124116d(61, new Object[0]);
                C23744a.m124114c().m124116d(85, str);
                if (z12) {
                    C18644n.m98524E();
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: g0 */
    public void m114334g0(String str) {
        try {
            C0824j.m2153b(new c(str));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: h */
    public int m114335h(List list, boolean z11, Set set) {
        ContactProfile contactProfile;
        ContactProfile m98552o;
        if (AbstractC23309i.m121118Kb() == 1) {
            this.f107795O = true;
            if (AbstractC23309i.m121308Pg()) {
                this.f107796P = true;
                synchronized (m114302u().m114303A()) {
                    for (int i11 = 0; i11 < m114302u().m114303A().size(); i11++) {
                        try {
                            String str = ((C32134u7) m114302u().m114303A().get(i11)).f148218a;
                            if (!CoreUtility.f89233i.equals(str) && !m114302u().m114312J().m153137g(str) && ((!z11 || !m114302u().m114345m(str)) && (m98552o = C18644n.m98531l().m98552o(str)) != null)) {
                                set.add(str);
                                if (this.f107791K == 1) {
                                    ContactProfile contactProfile2 = new ContactProfile(m98552o);
                                    contactProfile2.f42430p1 = true;
                                    contactProfile2.f42458z = "";
                                    if (C23302b.f113247a.m120523d(contactProfile2.f42446v)) {
                                        contactProfile2.f42427o1 = AbstractC23028c0.m118087g(contactProfile2.m40385R(true, false, C18631a.m98446i().f93755g.get()));
                                    }
                                    list.add(contactProfile2);
                                }
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                if (set.size() == 0 && this.f107791K == 1) {
                    if (!this.f107815s && !this.f107816t) {
                        contactProfile = new ContactProfile("-10");
                        contactProfile.f42437s = MainApplication.getAppContext().getString(AbstractC8020f0.str_des_empty_list_online);
                        contactProfile.m40403e1(true);
                    } else {
                        contactProfile = new ContactProfile("-13");
                    }
                    list.add(contactProfile);
                }
            } else {
                this.f107796P = false;
                if (this.f107791K == 1) {
                    ContactProfile contactProfile3 = new ContactProfile("-9");
                    contactProfile3.m40403e1(true);
                    list.add(contactProfile3);
                }
            }
        } else {
            this.f107795O = false;
        }
        return set.size();
    }

    /* renamed from: h0 */
    public void m114336h0() {
        this.f107820x.execute(this.f107792L);
    }

    /* renamed from: i */
    public void m114337i(String str) {
        if (this.f107808l == null) {
            this.f107808l = new ArrayList();
        }
        this.f107808l.add(str);
    }

    /* renamed from: i0 */
    public void m114338i0(ArrayList arrayList) {
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new h(arrayList));
        c0766k.mo1563W5(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* renamed from: j */
    int m114339j(List list, boolean z11, Set set) {
        ContactProfile contactProfile;
        char charAt;
        String str;
        boolean z12;
        String str2;
        ?? r42 = 1;
        C18635e mo98465a = C18644n.m98531l().mo98465a(null, true);
        int m122127lb = AbstractC23309i.m122127lb();
        int size = mo98465a.size();
        int i11 = -1;
        char c11 = '#';
        int i12 = 0;
        int i13 = 0;
        int i14 = -1;
        while (i12 < size) {
            try {
                contactProfile = (ContactProfile) mo98465a.get(i12);
            } catch (Exception e11) {
                e = e11;
            }
            if (contactProfile != 0 && !TextUtils.isEmpty(contactProfile.f42434r) && !contactProfile.f42434r.equals(CoreUtility.f89233i) && ((!z11 || !m114302u().m114345m(contactProfile.f42434r)) && (m122127lb != r42 || contactProfile.f42382U0 != 0))) {
                if (this.f107791K == 0) {
                    if (TextUtils.isEmpty(contactProfile.f42440t)) {
                        charAt = AbstractC23262x6.m120002o("" + contactProfile.m40385R(r42, false, C18631a.m98446i().f93755g.get()).trim().charAt(0)).trim().toUpperCase(Locale.ENGLISH).charAt(0);
                    } else {
                        charAt = ("" + contactProfile.f42440t.trim().charAt(0)).toUpperCase(Locale.ENGLISH).charAt(0);
                    }
                    i14++;
                    if (i14 != 0) {
                        if (this.f107781A.indexOf(c11) != i11) {
                            if (charAt > c11) {
                                if (this.f107781A.indexOf(charAt) != i11) {
                                    ContactProfile contactProfile2 = new ContactProfile();
                                    contactProfile2.f42437s = "" + charAt;
                                    contactProfile2.m40403e1(false);
                                    contactProfile2.f42403c1 = false;
                                    contactProfile2.f42335E1 = r42;
                                    int size2 = list.size();
                                    if (size2 > 0) {
                                        int i15 = size2 - 1;
                                        if (((ContactProfile) list.get(i15)).m40366G0()) {
                                            ((ContactProfile) list.get(i15)).f42405d1 = r42;
                                        }
                                    }
                                    list.add(contactProfile2);
                                } else {
                                    ContactProfile contactProfile3 = new ContactProfile();
                                    if (this.f107781A.indexOf(charAt) == -1) {
                                        str2 = "##";
                                    } else {
                                        str2 = "" + charAt;
                                    }
                                    contactProfile3.f42437s = str2;
                                    contactProfile3.m40403e1(false);
                                    contactProfile3.f42335E1 = 1;
                                    contactProfile3.f42403c1 = false;
                                    list.add(contactProfile3);
                                }
                            }
                        } else if (this.f107781A.indexOf(charAt) != -1) {
                            ContactProfile contactProfile4 = new ContactProfile();
                            contactProfile4.f42437s = "" + charAt;
                            contactProfile4.m40403e1(false);
                            contactProfile4.f42335E1 = 1;
                            contactProfile4.f42403c1 = false;
                            int size3 = list.size();
                            if (size3 > 0) {
                                int i16 = size3 - 1;
                                if (((ContactProfile) list.get(i16)).m40366G0()) {
                                    ((ContactProfile) list.get(i16)).f42405d1 = true;
                                }
                            }
                            list.add(contactProfile4);
                        }
                        z12 = true;
                    } else {
                        ContactProfile contactProfile5 = new ContactProfile();
                        if (this.f107781A.indexOf(charAt) == -1) {
                            str = "#";
                        } else {
                            try {
                                str = "" + charAt;
                            } catch (Exception e12) {
                                e = e12;
                                e.printStackTrace();
                                i12++;
                                r42 = 1;
                                i11 = -1;
                            }
                        }
                        contactProfile5.f42437s = str;
                        contactProfile5.m40403e1(false);
                        z12 = true;
                        contactProfile5.f42335E1 = 1;
                        contactProfile5.f42403c1 = false;
                        list.add(contactProfile5);
                    }
                    contactProfile.m40403e1(z12);
                    contactProfile.f42403c1 = false;
                    contactProfile.f42405d1 = false;
                    contactProfile.f42399a1.clear();
                    try {
                        contactProfile.f42430p1 = set.contains(contactProfile.f42434r);
                        contactProfile.f42458z = "";
                        if (C23302b.f113247a.m120523d(contactProfile.f42446v)) {
                            try {
                                contactProfile.f42427o1 = AbstractC23028c0.m118087g(contactProfile.m40385R(true, false, C18631a.m98446i().f93755g.get()));
                            } catch (Exception e13) {
                                e = e13;
                                e.printStackTrace();
                                i12++;
                                r42 = 1;
                                i11 = -1;
                            }
                        }
                        list.add(contactProfile);
                        c11 = charAt;
                    } catch (Exception e14) {
                        e = e14;
                        e.printStackTrace();
                        i12++;
                        r42 = 1;
                        i11 = -1;
                    }
                }
                i13++;
                i12++;
                r42 = 1;
                i11 = -1;
            }
            i12++;
            r42 = 1;
            i11 = -1;
        }
        return i13;
    }

    /* renamed from: j0 */
    public void m114340j0(String str) {
        try {
            for (int size = this.f107809m.size() - 1; size >= 0; size--) {
                String str2 = (String) this.f107809m.get(size);
                if (!TextUtils.isEmpty(str2) && str.equals(str2)) {
                    this.f107809m.remove(size);
                    return;
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: k */
    public void m114341k(ContactProfile contactProfile) {
        if (contactProfile != null) {
            try {
                String str = contactProfile.f42455y;
                C31901e8 m2800f = AbstractC0906d0.m2800f(MainApplication.getAppContext(), str);
                if (m2800f != null && m2800f.m153301s()) {
                    long parseLong = Long.parseLong(contactProfile.f42434r);
                    if (m2800f.m153300r() != parseLong) {
                        AbstractC0906d0.m2805k(MainApplication.getAppContext(), str, parseLong);
                        AbstractC23028c0.m118095o(MainApplication.getAppContext());
                    }
                } else {
                    C31901e8 m2801g = AbstractC0906d0.m2801g(MainApplication.getAppContext(), contactProfile.f42434r);
                    if (m2801g != null) {
                        m2801g.m153291A(0L);
                        AbstractC23028c0.m118095o(MainApplication.getAppContext());
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f(f107772Q, e11);
                return;
            } catch (OutOfMemoryError e12) {
                AbstractC23350e.m122776f(f107772Q, e12);
                return;
            }
        }
        if (AbstractC23309i.m122487v()) {
            return;
        }
        AbstractC23028c0.m118095o(MainApplication.getAppContext());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: k0 */
    public void m114342k0(String str) {
        try {
            C31853b5 c31853b5 = this.f107799c;
            if (c31853b5 != null) {
                for (int size = c31853b5.size() - 1; size >= 0; size--) {
                    if (str.equals(((ContactProfile) this.f107799c.get(size)).f42434r)) {
                        this.f107799c.remove(size);
                        return;
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: l */
    public boolean m114343l(List list) {
        boolean z11 = false;
        if (list != null) {
            try {
                if (!list.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = list.iterator();
                    boolean z12 = false;
                    boolean z13 = false;
                    while (it.hasNext()) {
                        try {
                            String str = (String) it.next();
                            if (!TextUtils.isEmpty(str)) {
                                for (int size = this.f107805i.size() - 1; size >= 0; size--) {
                                    if (str.trim().equals(((C32035n7) this.f107805i.get(size)).m154511b())) {
                                        this.f107805i.remove(size);
                                        if (!z13) {
                                            String m121820d8 = AbstractC23309i.m121820d8();
                                            if (!TextUtils.isEmpty(m121820d8)) {
                                                arrayList = new ArrayList(Arrays.asList(TextUtils.split(m121820d8, ",")));
                                            }
                                            z13 = true;
                                        }
                                        if (!arrayList.isEmpty() && arrayList.contains(str)) {
                                            arrayList.remove(str);
                                            int i11 = AbstractC23304d.f113341W;
                                            if (i11 > 0) {
                                                int i12 = i11 - 1;
                                                AbstractC23304d.f113341W = i12;
                                                if (i12 == 0) {
                                                    AbstractC23304d.f113337V = false;
                                                    AbstractC0924m0.m3693bh(false);
                                                }
                                            }
                                        }
                                        if (!z12) {
                                            z12 = true;
                                        }
                                    }
                                }
                            }
                        } catch (Exception e11) {
                            e = e11;
                            z11 = z12;
                            e.printStackTrace();
                            return z11;
                        }
                    }
                    if (z12) {
                        AbstractC23309i.m122370ru(MainApplication.getAppContext(), AbstractC23304d.f113341W);
                        AbstractC23309i.m120913Es(TextUtils.join(",", arrayList));
                        m114370z0();
                        return z12;
                    }
                    return z12;
                }
            } catch (Exception e12) {
                e = e12;
            }
        }
        return false;
    }

    /* renamed from: l0 */
    public void m114344l0(String str) {
        List<String> list = this.f107808l;
        if (list != null) {
            for (String str2 : list) {
                if (str2.equals(str)) {
                    this.f107808l.remove(str2);
                }
            }
        }
    }

    /* renamed from: m */
    public boolean m114345m(String str) {
        boolean containsKey;
        synchronized (this.f107803g) {
            containsKey = this.f107803g.containsKey(str);
        }
        return containsKey;
    }

    /* renamed from: m0 */
    public void m114346m0(String str) {
        m114348n0(str, true);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: ks.k.<init>(wd0.f, java.lang.String):void, class status: GENERATED_AND_UNLOADED
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
    /* renamed from: n */
    public void m114347n() {
        /*
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Exception -> L66
            r0.<init>()     // Catch: java.lang.Exception -> L66
            java.util.Map r1 = r7.f107803g     // Catch: java.lang.Exception -> L34
            monitor-enter(r1)     // Catch: java.lang.Exception -> L34
            java.util.Map r2 = r7.f107803g     // Catch: java.lang.Throwable -> L2e
            java.util.Set r2 = r2.entrySet()     // Catch: java.lang.Throwable -> L2e
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L2e
        L12:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L2e
            if (r3 == 0) goto L30
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L2e
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r3 = r3.getKey()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L2e
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L2e
            if (r4 != 0) goto L12
            r0.add(r3)     // Catch: java.lang.Throwable -> L2e
            goto L12
        L2e:
            r2 = move-exception
            goto L32
        L30:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2e
            goto L38
        L32:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2e
            throw r2     // Catch: java.lang.Exception -> L34
        L34:
            r1 = move-exception
            r1.printStackTrace()     // Catch: java.lang.Exception -> L66
        L38:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Exception -> L66
            r1.<init>(r0)     // Catch: java.lang.Exception -> L66
            boolean r0 = r1.isEmpty()     // Catch: java.lang.Exception -> L66
            if (r0 != 0) goto L6a
            wd0.f r0 = p348mi.AbstractC23306f.m120613R()     // Catch: java.lang.Exception -> L66
            r2 = 0
        L48:
            int r3 = r1.size()     // Catch: java.lang.Exception -> L66
            if (r2 >= r3) goto L6a
            java.lang.Object r3 = r1.get(r2)     // Catch: java.lang.Exception -> L66
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Exception -> L66
            mg.a r4 = mg.C23288a.f113033a     // Catch: java.lang.Exception -> L66
            eg0.b r5 = new eg0.b     // Catch: java.lang.Exception -> L66
            ks.k r6 = new ks.k     // Catch: java.lang.Exception -> L66
            r6.<init>()     // Catch: java.lang.Exception -> L66
            r5.<init>(r3, r6)     // Catch: java.lang.Exception -> L66
            r4.mo13474a(r5)     // Catch: java.lang.Exception -> L66
            int r2 = r2 + 1
            goto L48
        L66:
            r0 = move-exception
            r0.printStackTrace()
        L6a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p304ks.C21927m.m114347n():void");
    }

    /* renamed from: n0 */
    public void m114348n0(String str, boolean z11) {
        try {
            synchronized (this.f107803g) {
                try {
                    if (this.f107803g.containsKey(str)) {
                        this.f107803g.remove(str);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            C0824j.m2153b(new k(str));
            AbstractC23304d.f113435s1.set(true);
            C23744a.m124114c().m124116d(27, new Object[0]);
            C23744a.m124114c().m124116d(61, new Object[0]);
            C23744a.m124114c().m124116d(86, str);
            if (z11) {
                C18644n.m98524E();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: o */
    int m114349o(int i11) {
        if (i11 == -1 || i11 == 0) {
            return 0;
        }
        if (i11 == 30 || i11 == 31 || i11 == 33) {
            return 1;
        }
        return i11 != 9000 ? 9 : 0;
    }

    /* renamed from: o0 */
    public boolean m114350o0(String str) {
        boolean z11 = false;
        try {
            boolean z12 = false;
            for (int size = this.f107805i.size() - 1; size >= 0; size--) {
                try {
                    if (str.trim().equals(((C32035n7) this.f107805i.get(size)).m154511b())) {
                        this.f107805i.remove(size);
                        String m121820d8 = AbstractC23309i.m121820d8();
                        ArrayList arrayList = new ArrayList();
                        if (!TextUtils.isEmpty(m121820d8)) {
                            arrayList = new ArrayList(Arrays.asList(TextUtils.split(m121820d8, ",")));
                        }
                        if (arrayList.contains(str)) {
                            arrayList.remove(str);
                            int i11 = AbstractC23304d.f113341W;
                            if (i11 > 0) {
                                int i12 = i11 - 1;
                                AbstractC23304d.f113341W = i12;
                                if (i12 == 0) {
                                    AbstractC23304d.f113337V = false;
                                    AbstractC0924m0.m3693bh(false);
                                }
                            }
                        }
                        AbstractC23309i.m122370ru(MainApplication.getAppContext(), AbstractC23304d.f113341W);
                        AbstractC23309i.m120913Es(TextUtils.join(",", arrayList));
                        z12 = true;
                    }
                } catch (Exception e11) {
                    e = e11;
                    z11 = z12;
                    e.printStackTrace();
                    return z11;
                }
            }
            if (z12) {
                m114370z0();
                return z12;
            }
            return z12;
        } catch (Exception e12) {
            e = e12;
        }
    }

    /* renamed from: p */
    public ArrayList m114351p() {
        return this.f107809m;
    }

    /* renamed from: p0 */
    public void m114352p0(String str) {
        try {
            Map map = this.f107797a;
            if (map != null && map.containsKey(str)) {
                this.f107797a.remove(str);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: q */
    public ArrayList m114353q() {
        return this.f107806j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: q0 */
    public void m114354q0(String str) {
        try {
            for (int size = this.f107800d.size() - 1; size >= 0; size--) {
                if (str.equals(((ContactProfile) this.f107800d.get(size)).f42434r)) {
                    this.f107800d.remove(size);
                    return;
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: r */
    public List m114355r() {
        ArrayList arrayList;
        synchronized (this.f107822z) {
            arrayList = new ArrayList(this.f107822z);
        }
        return arrayList;
    }

    /* renamed from: r0 */
    public void m114356r0() {
        this.f107812p = 0L;
    }

    /* renamed from: s */
    public C31853b5 m114357s() {
        return this.f107799c;
    }

    /* renamed from: t */
    public Map m114358t() {
        return this.f107803g;
    }

    /* renamed from: t0 */
    public void m114359t0(int i11) {
        if (i11 != this.f107791K) {
            this.f107791K = i11;
            m114336h0();
        }
    }

    /* renamed from: u0 */
    public void m114360u0(String str, int i11) {
        C31853b5 c31853b5 = this.f107799c;
        if (c31853b5 != null && c31853b5.m153137g(str)) {
            ContactProfile m153138j = this.f107799c.m153138j(str);
            m153138j.f42447v0 = i11;
            m153138j.f42352K0 = i11;
            C7960e.m41971c6().m42067Ad(str, i11);
        }
    }

    /* renamed from: v */
    public long m114361v(String str) {
        try {
            if (AbstractC23309i.m121146L2() == 1) {
                if (!AbstractC23309i.m121308Pg()) {
                    return 0L;
                }
                Map map = C19669z.f97577Y;
                if (map.containsKey(str) && ((Integer) map.get(str)).intValue() == 0) {
                    return 0L;
                }
                Map map2 = C19669z.f97576X;
                if (map2.containsKey(str)) {
                    return ((Long) map2.get(str)).longValue();
                }
            } else {
                Map map3 = this.f107807k;
                if (map3 != null && map3.containsKey(str)) {
                    return ((Long) this.f107807k.get(str)).longValue();
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return 0L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: v0 */
    public void m114362v0(String str, int i11) {
        try {
            C31853b5 c31853b5 = this.f107799c;
            if (c31853b5 != null) {
                for (int size = c31853b5.size() - 1; size >= 0; size--) {
                    if (str.equals(((ContactProfile) this.f107799c.get(size)).f42434r)) {
                        ((ContactProfile) this.f107799c.get(size)).f42438s0 = i11;
                        return;
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: w */
    public void m114363w(int i11, int i12, int i13) {
        try {
            if (this.f107819w) {
                return;
            }
            this.f107819w = true;
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new g());
            c0766k.mo1468K6(i13, 1);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: w0 */
    public void m114364w0(String str, long j11) {
        try {
            String valueOf = String.valueOf(j11);
            String valueOf2 = String.valueOf(System.currentTimeMillis());
            int length = valueOf.length() - valueOf2.length();
            if (length > 0) {
                int i11 = 1;
                for (int i12 = 0; i12 < length; i12++) {
                    i11 *= 10;
                }
                if (i11 > 1) {
                    long j12 = i11;
                    if (String.valueOf(j11 / j12).length() == valueOf2.length()) {
                        j11 /= j12;
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        try {
            if (this.f107807k.containsKey(str)) {
                if (((Long) this.f107807k.get(str)).longValue() < j11) {
                    this.f107807k.remove(str);
                    this.f107807k.put(str, Long.valueOf(j11));
                    return;
                }
                return;
            }
            this.f107807k.put(str, Long.valueOf(j11));
        } catch (Exception e12) {
            e12.printStackTrace();
        }
    }

    /* renamed from: x */
    public ArrayList m114365x() {
        ArrayList arrayList = new ArrayList();
        try {
            synchronized (this.f107803g) {
                try {
                    for (Map.Entry entry : this.f107803g.entrySet()) {
                        try {
                            ContactProfile contactProfile = (ContactProfile) entry.getValue();
                            String str = (String) entry.getKey();
                            if (contactProfile != null && !TextUtils.isEmpty(contactProfile.f42434r) && !TextUtils.isEmpty(contactProfile.f42437s) && !TextUtils.isEmpty(contactProfile.f42446v)) {
                                arrayList.add(contactProfile);
                            } else if (!TextUtils.isEmpty(str)) {
                                if (AbstractC25495a.m132079d(str)) {
                                    C31973j5 m4472f = C0943w.m4462l().m4472f(AbstractC25495a.m132088m(str));
                                    if (m4472f != null) {
                                        ContactProfile contactProfile2 = new ContactProfile(1, m4472f.m153781r());
                                        contactProfile2.f42437s = m4472f.m153793y();
                                        contactProfile2.f42446v = m4472f.m153756e();
                                        arrayList.add(contactProfile2);
                                    }
                                } else {
                                    ContactProfile m141809c = C28203u6.f131407a.m141809c(str);
                                    if (m141809c != null) {
                                        arrayList.add(m141809c);
                                    }
                                }
                            }
                        } catch (Exception e11) {
                            e11.printStackTrace();
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (!arrayList.isEmpty()) {
                Collections.sort(arrayList, new Comparator() { // from class: ks.l
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        int m114295W;
                        m114295W = C21927m.m114295W((ContactProfile) obj, (ContactProfile) obj2);
                        return m114295W;
                    }
                });
            }
        } catch (Exception e12) {
            e12.printStackTrace();
        }
        return arrayList;
    }

    /* renamed from: x0 */
    public void m114366x0() {
        try {
            if (this.f107816t && m114302u().f107798b.isEmpty()) {
                m114301s0();
                this.f107816t = false;
            }
            if (!this.f107814r && !TextUtils.isEmpty(CoreUtility.f89233i) && System.currentTimeMillis() - this.f107812p > 60000 && MainTabView.m67645lM() != null && MainTabView.m67645lM().m67696kM() == C24099q0.m125958k().m125972p() && (MainTabView.m67645lM() instanceof MainTabView) && (MainTabView.m67645lM().m92676n2().mo35579p().m93012K0() instanceof MainTabView) && AbstractC23349d.m122770h() && !AbstractC23174p3.m119378c()) {
                if (this.f107813q == null) {
                    this.f107813q = new C0766k();
                }
                this.f107813q.mo1704o8(new d());
                this.f107814r = true;
                this.f107813q.mo1598a9();
                this.f107812p = System.currentTimeMillis();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: y */
    public ArrayList m114367y() {
        return this.f107805i;
    }

    /* renamed from: y0 */
    public void m114368y0(String str, long j11) {
        m114302u().m114364w0(str, j11);
        if (AbstractC23309i.m121146L2() == 1) {
            m114302u().m114332f0(str, j11, false);
        }
    }

    /* renamed from: z */
    public List m114369z() {
        return this.f107804h;
    }

    /* renamed from: z0 */
    public synchronized void m114370z0() {
        try {
            try {
                ArrayList arrayList = new ArrayList();
                for (int i11 = 0; i11 < this.f107805i.size(); i11++) {
                    try {
                        C32035n7 c32035n7 = (C32035n7) this.f107805i.get(i11);
                        if (c32035n7.f147507c > 0) {
                            arrayList.add(c32035n7.m154511b() + "_" + c32035n7.m154510a() + "_" + c32035n7.f147507c);
                        } else {
                            arrayList.add(c32035n7.m154511b() + "_" + c32035n7.m154510a());
                        }
                    } catch (Exception e11) {
                        e11.printStackTrace();
                    }
                }
                AbstractC23309i.m120876Ds(TextUtils.join(",", arrayList));
            } catch (Exception e12) {
                e12.printStackTrace();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
