package me0;

import ae.C0766k;
import am.AbstractC0924m0;
import am.C0945x;
import android.text.TextUtils;
import androidx.core.util.C1483e;
import cm.C3594a;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.data.backuprestore.model.C7924a;
import com.zing.zalo.data.backuprestore.model.TargetBackupInfo;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import gw.C19669z;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONObject;
import p142ey.C18644n;
import p173fz.C19172a;
import p248iy.AbstractC20887g;
import p304ks.C21927m;
import p348mi.AbstractC23309i;
import p461qu.AbstractC25495a;

/* renamed from: me0.r2 */
/* loaded from: classes4.dex */
public abstract class AbstractC23195r2 {

    /* renamed from: a */
    public static int f112439a = 0;

    /* renamed from: b */
    public static int f112440b = 1;

    /* renamed from: c */
    public static int f112441c = 2;

    /* renamed from: d */
    public static boolean f112442d = false;

    /* renamed from: e */
    public static boolean f112443e = false;

    /* renamed from: f */
    public static int f112444f = 0;

    /* renamed from: g */
    public static boolean f112445g = false;

    /* renamed from: h */
    public static Set f112446h = new HashSet();

    /* renamed from: i */
    public static final long[] f112447i = {900000, 15000, 30000, 60000, 90000, 150000, 200000, 300000};

    /* renamed from: j */
    private static final AtomicInteger f112448j = new AtomicInteger(1);

    /* renamed from: k */
    private static final AtomicInteger f112449k = new AtomicInteger(1);

    /* renamed from: l */
    private static long f112450l = 0;

    /* renamed from: m */
    private static long f112451m = 0;

    /* renamed from: n */
    private static boolean f112452n = false;

    /* renamed from: o */
    private static boolean f112453o = false;

    /* renamed from: me0.r2$a */
    /* loaded from: classes4.dex */
    public class a implements InterfaceC20094a {
        a() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            int i11;
            int i12;
            if (c20096c.m104491c() == -69) {
                AbstractC23195r2.f112448j.set(0);
            } else if (AbstractC23195r2.f112448j.incrementAndGet() >= AbstractC23195r2.f112447i.length) {
                AbstractC23195r2.f112448j.set(1);
            }
            AbstractC23195r2.f112452n = false;
            if (C19172a.m100600k("core@enable_api_native", 0) == 1) {
                i11 = 125005;
            } else {
                i11 = 125004;
            }
            AbstractC20887g.m109240r(i11, String.format("getHiddenChat error: %d, retry: %d", Integer.valueOf(c20096c.m104491c()), Integer.valueOf(AbstractC23195r2.f112448j.get())));
            if (C23055e5.m118271f() && c20096c.m104491c() == 502) {
                if (C19172a.m100600k("core@enable_api_native", 0) == 1) {
                    i12 = 125007;
                } else {
                    i12 = 125006;
                }
                AbstractC20887g.m109240r(i12, String.format("getHiddenChat retry: %d", Integer.valueOf(AbstractC23195r2.f112448j.get())));
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:58:0x0060, code lost:            if (android.text.TextUtils.isEmpty(p348mi.AbstractC23309i.m122303q0()) != false) goto L90;     */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x0062, code lost:            p248iy.AbstractC20887g.m109230h(70002, "reset hidden chat get api");     */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x006a, code lost:            p304ks.C21927m.m114302u().m114326b0();     */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0089 A[DONT_GENERATE] */
        /* JADX WARN: Removed duplicated region for block: B:18:0x008a A[Catch: all -> 0x004e, Exception -> 0x0051, TryCatch #1 {Exception -> 0x0051, blocks: (B:3:0x0002, B:5:0x0037, B:8:0x0040, B:10:0x004a, B:12:0x0083, B:18:0x008a, B:20:0x0092, B:21:0x0095, B:22:0x00a2, B:24:0x00a8, B:26:0x00bb, B:27:0x00cc, B:29:0x00d6, B:31:0x00e3, B:34:0x00e9, B:35:0x00fe, B:37:0x0104, B:41:0x0114, B:48:0x0124, B:49:0x0128, B:51:0x012d, B:57:0x0058, B:59:0x0062, B:60:0x006a, B:61:0x007e), top: B:2:0x0002, outer: #0 }] */
        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void mo927b(Object obj) {
            JSONObject optJSONObject;
            boolean m121493Ug;
            String optString;
            boolean z11;
            try {
                try {
                    C19669z.f97568P.set(true);
                    AbstractC23309i.m120911Eq(System.currentTimeMillis());
                    optJSONObject = ((JSONObject) obj).optJSONObject("data");
                    AbstractC23309i.m122448ty(optJSONObject.optLong("expiredDuration", 0L) * 1000);
                    m121493Ug = AbstractC23309i.m121493Ug();
                    optString = optJSONObject.optString("pin", "");
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                if (!TextUtils.isEmpty(optString) && optString.length() == 32) {
                    if (!optString.equals(AbstractC23309i.m122303q0())) {
                        AbstractC23309i.m122654zi(optString);
                    }
                    z11 = false;
                    if (!TextUtils.isEmpty(optString)) {
                        return;
                    }
                    int optInt = optJSONObject.optInt("resetCount", 0);
                    if (optInt > 0) {
                        AbstractC0924m0.m2914Am(optInt);
                    }
                    JSONArray optJSONArray = optJSONObject.optJSONArray("hiddens");
                    HashSet hashSet = new HashSet();
                    boolean z12 = false;
                    for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                        JSONObject optJSONObject2 = optJSONArray.optJSONObject(i11);
                        String optString2 = optJSONObject2.optString("sourceId");
                        if (optJSONObject2.optInt(ZinstantMetaConstant.IMPRESSION_META_TYPE, 0) == 2) {
                            optString2 = "group_" + optString2;
                        }
                        if (!C21927m.m114302u().m114345m(optString2)) {
                            C21927m.m114302u().m114333g(optString2, new ContactProfile(optString2), true, false);
                            z12 = true;
                        }
                        hashSet.add(optString2);
                    }
                    Iterator it = new ArrayList(C21927m.m114302u().m114358t().values()).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        ContactProfile contactProfile = (ContactProfile) it.next();
                        if (!hashSet.contains(contactProfile.f42434r)) {
                            if (m121493Ug) {
                                C21927m.m114302u().m114348n0(contactProfile.f42434r, false);
                                z12 = true;
                            } else {
                                z11 = true;
                                break;
                            }
                        }
                    }
                    if (!m121493Ug) {
                        if (z11) {
                            AbstractC23309i.m121432St(true);
                        } else {
                            AbstractC23309i.m121584Wx(true);
                        }
                    }
                    if (z12) {
                        C19669z.m103146Y().m103198O0();
                        C18644n.m98524E();
                    }
                    AbstractC23195r2.f112448j.set(1);
                    AbstractC23195r2.f112452n = false;
                    AbstractC23195r2.f112442d = true;
                    return;
                }
                optString = AbstractC23309i.m122303q0();
                z11 = true;
                if (!TextUtils.isEmpty(optString)) {
                }
            } finally {
                AbstractC23195r2.f112448j.set(1);
                AbstractC23195r2.f112452n = false;
                AbstractC23195r2.f112442d = true;
            }
        }
    }

    /* renamed from: me0.r2$b */
    /* loaded from: classes4.dex */
    public class b implements InterfaceC20094a {
        b() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            if (c20096c.m104491c() == -69) {
                AbstractC23195r2.f112449k.set(0);
            } else if (AbstractC23195r2.f112449k.incrementAndGet() >= AbstractC23195r2.f112447i.length) {
                AbstractC23195r2.f112449k.set(1);
            }
            AbstractC23195r2.f112453o = false;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC23309i.m121584Wx(true);
            AbstractC23309i.m121432St(false);
            AbstractC23195r2.f112449k.set(1);
            AbstractC23195r2.f112453o = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: me0.r2$c */
    /* loaded from: classes4.dex */
    public class c implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ InterfaceC20094a f112454a;

        c(InterfaceC20094a interfaceC20094a) {
            this.f112454a = interfaceC20094a;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            InterfaceC20094a interfaceC20094a = this.f112454a;
            if (interfaceC20094a != null) {
                interfaceC20094a.mo926a(c20096c);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            int optInt;
            try {
                JSONObject optJSONObject = ((JSONObject) obj).optJSONObject("data");
                if (optJSONObject != null && (optInt = optJSONObject.optInt("resetCount", 0)) > 0) {
                    AbstractC0924m0.m2914Am(optInt);
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
            InterfaceC20094a interfaceC20094a = this.f112454a;
            if (interfaceC20094a != null) {
                interfaceC20094a.mo927b(obj);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: me0.r2$d */
    /* loaded from: classes4.dex */
    public class d implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ InterfaceC20094a f112455a;

        d(InterfaceC20094a interfaceC20094a) {
            this.f112455a = interfaceC20094a;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            InterfaceC20094a interfaceC20094a = this.f112455a;
            if (interfaceC20094a != null) {
                interfaceC20094a.mo926a(c20096c);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            int optInt;
            try {
                JSONObject optJSONObject = ((JSONObject) obj).optJSONObject("data");
                if (optJSONObject != null && (optInt = optJSONObject.optInt("resetCount", 0)) > 0) {
                    AbstractC0924m0.m2914Am(optInt);
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
            InterfaceC20094a interfaceC20094a = this.f112455a;
            if (interfaceC20094a != null) {
                interfaceC20094a.mo927b(obj);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: me0.r2$e */
    /* loaded from: classes4.dex */
    public class e implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ InterfaceC20094a f112456a;

        e(InterfaceC20094a interfaceC20094a) {
            this.f112456a = interfaceC20094a;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            InterfaceC20094a interfaceC20094a = this.f112456a;
            if (interfaceC20094a != null) {
                interfaceC20094a.mo926a(c20096c);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            int optInt;
            try {
                JSONObject optJSONObject = ((JSONObject) obj).optJSONObject("data");
                if (optJSONObject != null && (optInt = optJSONObject.optInt("resetCount", 0)) > 0) {
                    AbstractC0924m0.m2914Am(optInt);
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
            InterfaceC20094a interfaceC20094a = this.f112456a;
            if (interfaceC20094a != null) {
                interfaceC20094a.mo927b(obj);
            }
        }
    }

    /* renamed from: e */
    public static void m119518e(String str, String str2, byte b11, InterfaceC20094a interfaceC20094a) {
        try {
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new c(interfaceC20094a));
            ArrayList arrayList = new ArrayList();
            if (!TextUtils.isEmpty(str)) {
                if (AbstractC25495a.m132079d(str)) {
                    arrayList.add(new C1483e(Integer.valueOf(Integer.parseInt(str.substring(6))), 2));
                } else {
                    arrayList.add(new C1483e(Integer.valueOf(Integer.parseInt(str)), 1));
                }
            }
            c0766k.mo1642g5(arrayList, str2, b11);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: f */
    public static synchronized void m119519f() {
        synchronized (AbstractC23195r2.class) {
            try {
                try {
                    if (!f112452n && System.currentTimeMillis() - AbstractC23309i.m121932g6() > AbstractC23309i.m121637Yc() && System.currentTimeMillis() - f112451m >= f112447i[f112448j.get()]) {
                        f112451m = System.currentTimeMillis();
                        C0766k c0766k = new C0766k();
                        c0766k.mo1704o8(new a());
                        f112452n = true;
                        if (C19172a.m100600k("core@enable_api_native", 0) == 1) {
                            c0766k.mo1572X6(true);
                            AbstractC20887g.m109230h(125003, "");
                        } else {
                            c0766k.mo1572X6(false);
                            AbstractC20887g.m109230h(125002, "");
                        }
                    }
                    m119526m();
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: g */
    public static JSONObject m119520g() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(AbstractC23309i.m122303q0())) {
                ArrayList<ContactProfile> arrayList = new ArrayList(C21927m.m114302u().m114358t().values());
                JSONArray jSONArray = new JSONArray();
                for (ContactProfile contactProfile : arrayList) {
                    JSONObject jSONObject2 = new JSONObject();
                    if (AbstractC25495a.m132079d(contactProfile.f42434r)) {
                        jSONObject2.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, 2);
                        jSONObject2.put("id", contactProfile.f42434r.substring(6));
                    } else {
                        jSONObject2.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, 1);
                        jSONObject2.put("id", contactProfile.f42434r);
                    }
                    jSONArray.put(jSONObject2);
                }
                jSONObject.put("resetCount", AbstractC0924m0.m3302O4());
                jSONObject.put("threads", jSONArray);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return jSONObject;
    }

    /* renamed from: h */
    public static void m119521h() {
        AbstractC23309i.m121390Ro(false);
        AbstractC23309i.m120911Eq(0L);
        AbstractC23309i.m121432St(false);
        f112444f = f112439a;
        f112448j.set(1);
        f112449k.set(1);
        f112450l = 0L;
        f112451m = 0L;
        f112443e = false;
        f112445g = false;
    }

    /* renamed from: i */
    public static void m119522i(String str, InterfaceC20094a interfaceC20094a) {
        int parseInt;
        int i11;
        try {
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new d(interfaceC20094a));
            if (AbstractC25495a.m132079d(str)) {
                parseInt = Integer.parseInt(str.substring(6));
                i11 = 2;
            } else {
                parseInt = Integer.parseInt(str);
                i11 = 1;
            }
            c0766k.mo1634f5(parseInt, i11);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: j */
    public static void m119523j(InterfaceC20094a interfaceC20094a) {
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new e(interfaceC20094a));
        c0766k.mo1396B7();
    }

    /* renamed from: k */
    public static boolean m119524k(C3594a c3594a, C0945x c0945x) {
        if (c0945x != null && !c0945x.m4492f()) {
            if (!c0945x.m4488b(c3594a.f15175b, c3594a.f15176c)) {
                AbstractC20110a.m104545n("Thread %s - %s NOT hidden - should restore", Long.valueOf(c3594a.f15175b), c3594a.f15179f);
                return true;
            }
            if (c0945x.m4490d() != AbstractC0924m0.m3302O4()) {
                AbstractC20110a.m104545n("Thread %s - %s HIDDEN - should NOT restore (%d - %d) !!!", Long.valueOf(c3594a.f15175b), c3594a.f15179f, Integer.valueOf(c0945x.m4490d()), Integer.valueOf(AbstractC0924m0.m3302O4()));
                return false;
            }
            AbstractC20110a.m104545n("Thread %s - %s HIDDEN - but reset count the same(%d) - should restore", Long.valueOf(c3594a.f15175b), c3594a.f15179f, Integer.valueOf(c0945x.m4490d()));
        }
        return true;
    }

    /* renamed from: l */
    public static boolean m119525l(C7924a c7924a) {
        TargetBackupInfo targetBackupInfo;
        if (c7924a == null || (targetBackupInfo = c7924a.f42886u) == null || targetBackupInfo.m40961q() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    private static void m119526m() {
        if (!f112453o && AbstractC23309i.m122652zg() && System.currentTimeMillis() - f112450l >= f112447i[f112449k.get()]) {
            f112450l = System.currentTimeMillis();
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new b());
            f112453o = true;
            ArrayList arrayList = new ArrayList();
            for (ContactProfile contactProfile : new ArrayList(C21927m.m114302u().m114358t().values())) {
                if (contactProfile.m40374K0()) {
                    arrayList.add(new C1483e(Integer.valueOf(Integer.parseInt(contactProfile.f42434r.substring(6))), 2));
                } else {
                    arrayList.add(new C1483e(Integer.valueOf(Integer.parseInt(contactProfile.f42434r)), 1));
                }
            }
            c0766k.mo1642g5(arrayList, AbstractC23309i.m122303q0(), (byte) 1);
        }
    }
}
