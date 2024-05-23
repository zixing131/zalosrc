package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.internal.measurement.C5301b4;
import com.google.android.gms.internal.measurement.C5332d1;
import com.google.android.gms.internal.measurement.C5444jb;
import com.google.android.gms.internal.measurement.C5455k5;
import com.google.android.gms.internal.measurement.C5489m5;
import com.google.android.gms.internal.measurement.C5606t3;
import com.google.android.gms.internal.measurement.C5618tf;
import com.google.android.gms.internal.measurement.C5623u3;
import com.google.android.gms.internal.measurement.C5635uf;
import com.google.android.gms.internal.measurement.C5657w3;
import com.google.android.gms.internal.measurement.C5674x3;
import com.google.android.gms.internal.measurement.InterfaceC5329cf;
import com.google.android.gms.internal.measurement.zzd;
import com.google.android.gms.internal.measurement.zzll;
import com.google.android.gms.measurement.internal.C6061m4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import p230i6.AbstractC20325q;
import p665y0.C30239a;
import p665y0.C30243e;

/* renamed from: com.google.android.gms.measurement.internal.m4 */
/* loaded from: classes.dex */
public final class C6061m4 extends AbstractC6208z8 implements InterfaceC5979f {

    /* renamed from: d */
    private final Map f34205d;

    /* renamed from: e */
    final Map f34206e;

    /* renamed from: f */
    final Map f34207f;

    /* renamed from: g */
    final Map f34208g;

    /* renamed from: h */
    private final Map f34209h;

    /* renamed from: i */
    private final Map f34210i;

    /* renamed from: j */
    final C30243e f34211j;

    /* renamed from: k */
    final InterfaceC5329cf f34212k;

    /* renamed from: l */
    private final Map f34213l;

    /* renamed from: m */
    private final Map f34214m;

    /* renamed from: n */
    private final Map f34215n;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6061m4(C6055l9 c6055l9) {
        super(c6055l9);
        this.f34205d = new C30239a();
        this.f34206e = new C30239a();
        this.f34207f = new C30239a();
        this.f34208g = new C30239a();
        this.f34209h = new C30239a();
        this.f34213l = new C30239a();
        this.f34214m = new C30239a();
        this.f34215n = new C30239a();
        this.f34210i = new C30239a();
        this.f34211j = new C6028j4(this, 20);
        this.f34212k = new C6039k4(this);
    }

    /* renamed from: l */
    private final C5674x3 m31112l(String str, byte[] bArr) {
        Long l11;
        if (bArr == null) {
            return C5674x3.m29993G();
        }
        try {
            C5674x3 c5674x3 = (C5674x3) ((C5657w3) C6077n9.m31151C(C5674x3.m29991E(), bArr)).m29557k();
            C6060m3 m31201u = this.f34158a.mo31033c().m31201u();
            String str2 = null;
            if (c5674x3.m30010U()) {
                l11 = Long.valueOf(c5674x3.m29998C());
            } else {
                l11 = null;
            }
            if (c5674x3.m30009T()) {
                str2 = c5674x3.m30000H();
            }
            m31201u.m31110c("Parsed config. version, gmp_app_id", l11, str2);
            return c5674x3;
        } catch (zzll e11) {
            this.f34158a.mo31033c().m31202w().m31110c("Unable to merge remote config. appId", C6082o3.m31193z(str), e11);
            return C5674x3.m29993G();
        } catch (RuntimeException e12) {
            this.f34158a.mo31033c().m31202w().m31110c("Unable to merge remote config. appId", C6082o3.m31193z(str), e12);
            return C5674x3.m29993G();
        }
    }

    /* renamed from: m */
    private final void m31113m(String str, C5657w3 c5657w3) {
        HashSet hashSet = new HashSet();
        C30239a c30239a = new C30239a();
        C30239a c30239a2 = new C30239a();
        C30239a c30239a3 = new C30239a();
        Iterator it = c5657w3.m29854v().iterator();
        while (it.hasNext()) {
            hashSet.add(((C5606t3) it.next()).m29607B());
        }
        for (int i11 = 0; i11 < c5657w3.m29848o(); i11++) {
            C5623u3 c5623u3 = (C5623u3) c5657w3.m29849p(i11).m29649i();
            if (c5623u3.m29665q().isEmpty()) {
                this.f34158a.mo31033c().m31202w().m31108a("EventConfig contained null event name");
            } else {
                String m29665q = c5623u3.m29665q();
                String m106025b = AbstractC20325q.m106025b(c5623u3.m29665q());
                if (!TextUtils.isEmpty(m106025b)) {
                    c5623u3.m29664p(m106025b);
                    c5657w3.m29851r(i11, c5623u3);
                }
                if (c5623u3.m29668u() && c5623u3.m29666r()) {
                    c30239a.put(m29665q, Boolean.TRUE);
                }
                if (c5623u3.m29669v() && c5623u3.m29667s()) {
                    c30239a2.put(c5623u3.m29665q(), Boolean.TRUE);
                }
                if (c5623u3.m29670w()) {
                    if (c5623u3.m29663o() >= 2 && c5623u3.m29663o() <= 65535) {
                        c30239a3.put(c5623u3.m29665q(), Integer.valueOf(c5623u3.m29663o()));
                    } else {
                        this.f34158a.mo31033c().m31202w().m31110c("Invalid sampling rate. Event name, sample rate", c5623u3.m29665q(), Integer.valueOf(c5623u3.m29663o()));
                    }
                }
            }
        }
        this.f34206e.put(str, hashSet);
        this.f34207f.put(str, c30239a);
        this.f34208g.put(str, c30239a2);
        this.f34210i.put(str, c30239a3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a3, code lost:            if (r2 == null) goto L9;     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0122  */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m31114n(String str) {
        SQLiteException e11;
        Cursor cursor;
        C6001h c6001h;
        m31504h();
        mo31036g();
        AbstractC4205o.m19718g(str);
        if (this.f34209h.get(str) == null) {
            C6034k m31074W = this.f34628b.m31074W();
            AbstractC4205o.m19718g(str);
            m31074W.mo31036g();
            m31074W.m31504h();
            Cursor cursor2 = null;
            try {
                cursor = m31074W.m30988P().query("apps", new String[]{"remote_config", "config_last_modified_time", "e_tag"}, "app_id=?", new String[]{str}, null, null, null);
            } catch (SQLiteException e12) {
                e11 = e12;
                cursor = null;
            } catch (Throwable th2) {
                th = th2;
                if (cursor2 != null) {
                }
                throw th;
            }
            try {
                try {
                } catch (Throwable th3) {
                    th = th3;
                    cursor2 = cursor;
                    if (cursor2 != null) {
                        cursor2.close();
                    }
                    throw th;
                }
            } catch (SQLiteException e13) {
                e11 = e13;
                m31074W.f34158a.mo31033c().m31197q().m31110c("Error querying remote config. appId", C6082o3.m31193z(str), e11);
            }
            if (cursor.moveToFirst()) {
                byte[] blob = cursor.getBlob(0);
                String string = cursor.getString(1);
                String string2 = cursor.getString(2);
                if (cursor.moveToNext()) {
                    m31074W.f34158a.mo31033c().m31197q().m31109b("Got multiple records for app config, expected one. appId", C6082o3.m31193z(str));
                }
                if (blob != null) {
                    c6001h = new C6001h(blob, string, string2);
                    cursor.close();
                    if (c6001h != null) {
                        this.f34205d.put(str, null);
                        this.f34207f.put(str, null);
                        this.f34206e.put(str, null);
                        this.f34208g.put(str, null);
                        this.f34209h.put(str, null);
                        this.f34213l.put(str, null);
                        this.f34214m.put(str, null);
                        this.f34215n.put(str, null);
                        this.f34210i.put(str, null);
                        return;
                    }
                    C5657w3 c5657w3 = (C5657w3) m31112l(str, c6001h.f34048a).m29649i();
                    m31113m(str, c5657w3);
                    this.f34205d.put(str, m31116p((C5674x3) c5657w3.m29557k()));
                    this.f34209h.put(str, (C5674x3) c5657w3.m29557k());
                    m31115o(str, (C5674x3) c5657w3.m29557k());
                    this.f34213l.put(str, c5657w3.m29852s());
                    this.f34214m.put(str, c6001h.f34049b);
                    this.f34215n.put(str, c6001h.f34050c);
                    return;
                }
            }
            cursor.close();
            c6001h = null;
            if (c6001h != null) {
            }
        }
    }

    /* renamed from: o */
    private final void m31115o(final String str, C5674x3 c5674x3) {
        if (c5674x3.m29996A() != 0) {
            this.f34158a.mo31033c().m31201u().m31109b("EES programs found", Integer.valueOf(c5674x3.m29996A()));
            C5489m5 c5489m5 = (C5489m5) c5674x3.m30006O().get(0);
            try {
                C5332d1 c5332d1 = new C5332d1();
                c5332d1.m29039d("internal.remoteConfig", new Callable() { // from class: com.google.android.gms.measurement.internal.h4
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return new C5444jb("internal.remoteConfig", new C6050l4(C6061m4.this, str));
                    }
                });
                c5332d1.m29039d("internal.appMetadata", new Callable() { // from class: i6.l
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        final C6061m4 c6061m4 = C6061m4.this;
                        final String str2 = str;
                        return new C5635uf("internal.appMetadata", new Callable() { // from class: com.google.android.gms.measurement.internal.g4
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                C6061m4 c6061m42 = C6061m4.this;
                                String str3 = str2;
                                C6084o5 m30990R = c6061m42.f34628b.m31074W().m30990R(str3);
                                HashMap hashMap = new HashMap();
                                hashMap.put("platform", "android");
                                hashMap.put("package_name", str3);
                                c6061m42.f34158a.m31401z().m30926p();
                                hashMap.put("gmp_version", 76003L);
                                if (m30990R != null) {
                                    String m31254l0 = m30990R.m31254l0();
                                    if (m31254l0 != null) {
                                        hashMap.put("app_version", m31254l0);
                                    }
                                    hashMap.put("app_version_int", Long.valueOf(m30990R.m31220P()));
                                    hashMap.put("dynamite_version", Long.valueOf(m30990R.m31229Y()));
                                }
                                return hashMap;
                            }
                        });
                    }
                });
                c5332d1.m29039d("internal.logger", new Callable() { // from class: com.google.android.gms.measurement.internal.i4
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return new C5618tf(C6061m4.this.f34212k);
                    }
                });
                c5332d1.m29038c(c5489m5);
                this.f34211j.m149140e(str, c5332d1);
                this.f34158a.mo31033c().m31201u().m31110c("EES program loaded for appId, activities", str, Integer.valueOf(c5489m5.m29439A().m29208A()));
                Iterator it = c5489m5.m29439A().m29209D().iterator();
                while (it.hasNext()) {
                    this.f34158a.mo31033c().m31201u().m31109b("EES program activity", ((C5455k5) it.next()).m29360B());
                }
                return;
            } catch (zzd unused) {
                this.f34158a.mo31033c().m31197q().m31109b("Failed to load EES program. appId", str);
                return;
            }
        }
        this.f34211j.m149141f(str);
    }

    /* renamed from: p */
    private static final Map m31116p(C5674x3 c5674x3) {
        C30239a c30239a = new C30239a();
        if (c5674x3 != null) {
            for (C5301b4 c5301b4 : c5674x3.m30007P()) {
                c30239a.put(c5301b4.m28923B(), c5301b4.m28924C());
            }
        }
        return c30239a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public static /* bridge */ /* synthetic */ C5332d1 m31117r(C6061m4 c6061m4, String str) {
        c6061m4.m31504h();
        AbstractC4205o.m19718g(str);
        if (!c6061m4.m31121C(str)) {
            return null;
        }
        if (c6061m4.f34209h.containsKey(str) && c6061m4.f34209h.get(str) != null) {
            c6061m4.m31115o(str, (C5674x3) c6061m4.f34209h.get(str));
        } else {
            c6061m4.m31114n(str);
        }
        return (C5332d1) c6061m4.f34211j.m149142i().get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A */
    public final void m31119A(String str) {
        mo31036g();
        this.f34209h.remove(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B */
    public final boolean m31120B(String str) {
        mo31036g();
        C5674x3 m31134s = m31134s(str);
        if (m31134s == null) {
            return false;
        }
        return m31134s.m30008S();
    }

    /* renamed from: C */
    public final boolean m31121C(String str) {
        C5674x3 c5674x3;
        if (TextUtils.isEmpty(str) || (c5674x3 = (C5674x3) this.f34209h.get(str)) == null || c5674x3.m29996A() == 0) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: D */
    public final boolean m31122D(String str) {
        return "1".equals(mo30834d(str, "measurement.upload.blacklist_internal"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: E */
    public final boolean m31123E(String str, String str2) {
        Boolean bool;
        mo31036g();
        m31114n(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map map = (Map) this.f34208g.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: F */
    public final boolean m31124F(String str, String str2) {
        Boolean bool;
        mo31036g();
        m31114n(str);
        if (m31122D(str) && C6121r9.m31300Y(str2)) {
            return true;
        }
        if (m31125G(str) && C6121r9.m31301Z(str2)) {
            return true;
        }
        Map map = (Map) this.f34207f.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: G */
    public final boolean m31125G(String str) {
        return "1".equals(mo30834d(str, "measurement.upload.blacklist_public"));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: H */
    public final boolean m31126H(String str, byte[] bArr, String str2, String str3) {
        m31504h();
        mo31036g();
        AbstractC4205o.m19718g(str);
        C5657w3 c5657w3 = (C5657w3) m31112l(str, bArr).m29649i();
        m31113m(str, c5657w3);
        m31115o(str, (C5674x3) c5657w3.m29557k());
        this.f34209h.put(str, (C5674x3) c5657w3.m29557k());
        this.f34213l.put(str, c5657w3.m29852s());
        this.f34214m.put(str, str2);
        this.f34215n.put(str, str3);
        this.f34205d.put(str, m31116p((C5674x3) c5657w3.m29557k()));
        this.f34628b.m31074W().m31007m(str, new ArrayList(c5657w3.m29853u()));
        try {
            c5657w3.m29850q();
            bArr = ((C5674x3) c5657w3.m29557k()).m29188f();
        } catch (RuntimeException e11) {
            this.f34158a.mo31033c().m31202w().m31110c("Unable to serialize reduced-size config. Storing full config instead. appId", C6082o3.m31193z(str), e11);
        }
        C6034k m31074W = this.f34628b.m31074W();
        AbstractC4205o.m19718g(str);
        m31074W.mo31036g();
        m31074W.m31504h();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr);
        contentValues.put("config_last_modified_time", str2);
        contentValues.put("e_tag", str3);
        try {
            if (m31074W.m30988P().update("apps", contentValues, "app_id = ?", new String[]{str}) == 0) {
                m31074W.f34158a.mo31033c().m31197q().m31109b("Failed to update remote config (got 0). appId", C6082o3.m31193z(str));
            }
        } catch (SQLiteException e12) {
            m31074W.f34158a.mo31033c().m31197q().m31110c("Error storing remote config. appId", C6082o3.m31193z(str), e12);
        }
        this.f34209h.put(str, (C5674x3) c5657w3.m29557k());
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: I */
    public final boolean m31127I(String str) {
        mo31036g();
        m31114n(str);
        if (this.f34206e.get(str) != null && ((Set) this.f34206e.get(str)).contains("app_instance_id")) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J */
    public final boolean m31128J(String str) {
        mo31036g();
        m31114n(str);
        if (this.f34206e.get(str) == null) {
            return false;
        }
        if (!((Set) this.f34206e.get(str)).contains("device_model") && !((Set) this.f34206e.get(str)).contains("device_info")) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: K */
    public final boolean m31129K(String str) {
        mo31036g();
        m31114n(str);
        if (this.f34206e.get(str) != null && ((Set) this.f34206e.get(str)).contains("enhanced_user_id")) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: L */
    public final boolean m31130L(String str) {
        mo31036g();
        m31114n(str);
        if (this.f34206e.get(str) != null && ((Set) this.f34206e.get(str)).contains("google_signals")) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: M */
    public final boolean m31131M(String str) {
        mo31036g();
        m31114n(str);
        if (this.f34206e.get(str) == null) {
            return false;
        }
        if (!((Set) this.f34206e.get(str)).contains("os_version") && !((Set) this.f34206e.get(str)).contains("device_info")) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: N */
    public final boolean m31132N(String str) {
        mo31036g();
        m31114n(str);
        if (this.f34206e.get(str) != null && ((Set) this.f34206e.get(str)).contains("user_id")) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC5979f
    /* renamed from: d */
    public final String mo30834d(String str, String str2) {
        mo31036g();
        m31114n(str);
        Map map = (Map) this.f34205d.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6208z8
    /* renamed from: k */
    protected final boolean mo30801k() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public final int m31133q(String str, String str2) {
        Integer num;
        mo31036g();
        m31114n(str);
        Map map = (Map) this.f34210i.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: s */
    public final C5674x3 m31134s(String str) {
        m31504h();
        mo31036g();
        AbstractC4205o.m19718g(str);
        m31114n(str);
        return (C5674x3) this.f34209h.get(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: t */
    public final String m31135t(String str) {
        mo31036g();
        return (String) this.f34215n.get(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: u */
    public final String m31136u(String str) {
        mo31036g();
        return (String) this.f34214m.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public final String m31137w(String str) {
        mo31036g();
        m31114n(str);
        return (String) this.f34213l.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public final Set m31138y(String str) {
        mo31036g();
        m31114n(str);
        return (Set) this.f34206e.get(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: z */
    public final void m31139z(String str) {
        mo31036g();
        this.f34214m.put(str, null);
    }
}
