package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.internal.measurement.AbstractC5473l6;
import com.google.android.gms.internal.measurement.C5286a6;
import com.google.android.gms.internal.measurement.C5346df;
import com.google.android.gms.internal.measurement.C5353e5;
import com.google.android.gms.internal.measurement.C5370f5;
import com.google.android.gms.internal.measurement.C5429id;
import com.google.android.gms.internal.measurement.C5454k4;
import com.google.android.gms.internal.measurement.C5471l4;
import com.google.android.gms.internal.measurement.C5480ld;
import com.google.android.gms.internal.measurement.C5522o4;
import com.google.android.gms.internal.measurement.C5531od;
import com.google.android.gms.internal.measurement.C5539p4;
import com.google.android.gms.internal.measurement.C5547pc;
import com.google.android.gms.internal.measurement.C5607t4;
import com.google.android.gms.internal.measurement.C5617te;
import com.google.android.gms.internal.measurement.C5624u4;
import com.google.android.gms.internal.measurement.C5641v4;
import com.google.android.gms.internal.measurement.C5658w4;
import com.google.android.gms.internal.measurement.C5674x3;
import com.google.android.gms.internal.measurement.C5684xd;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.zip.GZIPInputStream;
import p198h5.C19879b;
import p229i5.InterfaceC20285f;
import p230i6.AbstractC20325q;
import p230i6.C20307b;
import p230i6.EnumC20305a;
import p230i6.RunnableC20309c;
import p289k5.C21472e;
import p665y0.C30239a;

/* renamed from: com.google.android.gms.measurement.internal.l9 */
/* loaded from: classes.dex */
public final class C6055l9 implements InterfaceC6073n5 {

    /* renamed from: F */
    private static volatile C6055l9 f34164F;

    /* renamed from: A */
    private final Map f34165A;

    /* renamed from: B */
    private final Map f34166B;

    /* renamed from: C */
    private C6184x6 f34167C;

    /* renamed from: D */
    private String f34168D;

    /* renamed from: a */
    private final C6061m4 f34170a;

    /* renamed from: b */
    private final C6137t3 f34171b;

    /* renamed from: c */
    private C6034k f34172c;

    /* renamed from: d */
    private C6170w3 f34173d;

    /* renamed from: e */
    private C6186x8 f34174e;

    /* renamed from: f */
    private C5933b f34175f;

    /* renamed from: g */
    private final C6077n9 f34176g;

    /* renamed from: h */
    private C6173w6 f34177h;

    /* renamed from: i */
    private C5999g8 f34178i;

    /* renamed from: j */
    private final C5943b9 f34179j;

    /* renamed from: k */
    private C5984f4 f34180k;

    /* renamed from: l */
    private final C6127s4 f34181l;

    /* renamed from: n */
    private boolean f34183n;

    /* renamed from: o */
    long f34184o;

    /* renamed from: p */
    private List f34185p;

    /* renamed from: q */
    private int f34186q;

    /* renamed from: r */
    private int f34187r;

    /* renamed from: s */
    private boolean f34188s;

    /* renamed from: t */
    private boolean f34189t;

    /* renamed from: u */
    private boolean f34190u;

    /* renamed from: v */
    private FileLock f34191v;

    /* renamed from: w */
    private FileChannel f34192w;

    /* renamed from: x */
    private List f34193x;

    /* renamed from: y */
    private List f34194y;

    /* renamed from: z */
    private long f34195z;

    /* renamed from: m */
    private boolean f34182m = false;

    /* renamed from: E */
    private final InterfaceC6110q9 f34169E = new C6022i9(this);

    C6055l9(C6066m9 c6066m9, C6127s4 c6127s4) {
        AbstractC4205o.m19722k(c6066m9);
        this.f34181l = C6127s4.m31363H(c6066m9.f34223a, null, null);
        this.f34195z = -1L;
        this.f34179j = new C5943b9(this);
        C6077n9 c6077n9 = new C6077n9(this);
        c6077n9.m31505i();
        this.f34176g = c6077n9;
        C6137t3 c6137t3 = new C6137t3(this);
        c6137t3.m31505i();
        this.f34171b = c6137t3;
        C6061m4 c6061m4 = new C6061m4(this);
        c6061m4.m31505i();
        this.f34170a = c6061m4;
        this.f34165A = new HashMap();
        this.f34166B = new HashMap();
        mo31037v().m31296z(new RunnableC5955c9(this, c6066m9));
    }

    /* renamed from: G */
    static final void m31049G(C5454k4 c5454k4, int i11, String str) {
        List m29346E = c5454k4.m29346E();
        for (int i12 = 0; i12 < m29346E.size(); i12++) {
            if ("_err".equals(((C5539p4) m29346E.get(i12)).m29518G())) {
                return;
            }
        }
        C5522o4 m29501E = C5539p4.m29501E();
        m29501E.m29482y("_err");
        m29501E.m29481x(Long.valueOf(i11).longValue());
        C5539p4 c5539p4 = (C5539p4) m29501E.m29557k();
        C5522o4 m29501E2 = C5539p4.m29501E();
        m29501E2.m29482y("_ev");
        m29501E2.m29483z(str);
        C5539p4 c5539p42 = (C5539p4) m29501E2.m29557k();
        c5454k4.m29353u(c5539p4);
        c5454k4.m29353u(c5539p42);
    }

    /* renamed from: H */
    static final void m31050H(C5454k4 c5454k4, String str) {
        List m29346E = c5454k4.m29346E();
        for (int i11 = 0; i11 < m29346E.size(); i11++) {
            if (str.equals(((C5539p4) m29346E.get(i11)).m29518G())) {
                c5454k4.m29355w(i11);
                return;
            }
        }
    }

    /* renamed from: I */
    private final zzq m31051I(String str) {
        C6034k c6034k = this.f34172c;
        m31060R(c6034k);
        C6084o5 m30990R = c6034k.m30990R(str);
        if (m30990R != null && !TextUtils.isEmpty(m30990R.m31254l0())) {
            Boolean m31052J = m31052J(m30990R);
            if (m31052J != null && !m31052J.booleanValue()) {
                mo31033c().m31197q().m31109b("App version does not match; dropping. appId", C6082o3.m31193z(str));
                return null;
            }
            String m31258n0 = m30990R.m31258n0();
            String m31254l0 = m30990R.m31254l0();
            long m31220P = m30990R.m31220P();
            String m31252k0 = m30990R.m31252k0();
            long m31232a0 = m30990R.m31232a0();
            long m31228X = m30990R.m31228X();
            boolean m31217M = m30990R.m31217M();
            String m31256m0 = m30990R.m31256m0();
            m30990R.m31205A();
            return new zzq(str, m31258n0, m31254l0, m31220P, m31252k0, m31232a0, m31228X, (String) null, m31217M, false, m31256m0, 0L, 0L, 0, m30990R.m31216L(), false, m30990R.m31244g0(), m30990R.m31242f0(), m30990R.m31229Y(), m30990R.m31237d(), (String) null, m31073V(str).m106013h(), "", (String) null, m30990R.m31219O(), m30990R.m31240e0());
        }
        mo31033c().m31196p().m31109b("No app data available; dropping", str);
        return null;
    }

    /* renamed from: J */
    private final Boolean m31052J(C6084o5 c6084o5) {
        try {
            if (c6084o5.m31220P() != -2147483648L) {
                if (c6084o5.m31220P() == C21472e.m111067a(this.f34181l.mo31032b()).m111064f(c6084o5.m31248i0(), 0).versionCode) {
                    return Boolean.TRUE;
                }
            } else {
                String str = C21472e.m111067a(this.f34181l.mo31032b()).m111064f(c6084o5.m31248i0(), 0).versionName;
                String m31254l0 = c6084o5.m31254l0();
                if (m31254l0 != null && m31254l0.equals(str)) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: K */
    private final void m31053K() {
        mo31037v().mo31036g();
        if (!this.f34188s && !this.f34189t && !this.f34190u) {
            mo31033c().m31201u().m31108a("Stopping uploading service(s)");
            List list = this.f34185p;
            if (list == null) {
                return;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            ((List) AbstractC4205o.m19722k(this.f34185p)).clear();
            return;
        }
        mo31033c().m31201u().m31111d("Not stopping services. fetch, network, upload", Boolean.valueOf(this.f34188s), Boolean.valueOf(this.f34189t), Boolean.valueOf(this.f34190u));
    }

    /* renamed from: L */
    private final void m31054L(C5641v4 c5641v4, long j11, boolean z11) {
        String str;
        C6099p9 c6099p9;
        String str2;
        C6034k c6034k = this.f34172c;
        m31060R(c6034k);
        if (true != z11) {
            str = "_lte";
        } else {
            str = "_se";
        }
        C6099p9 m30995X = c6034k.m30995X(c5641v4.m29749n0(), str);
        if (m30995X != null && m30995X.f34342e != null) {
            c6099p9 = new C6099p9(c5641v4.m29749n0(), "auto", str, mo31031a().mo105913a(), Long.valueOf(((Long) m30995X.f34342e).longValue() + j11));
        } else {
            c6099p9 = new C6099p9(c5641v4.m29749n0(), "auto", str, mo31031a().mo105913a(), Long.valueOf(j11));
        }
        C5353e5 m29116D = C5370f5.m29116D();
        m29116D.m29078u(str);
        m29116D.m29079v(mo31031a().mo105913a());
        m29116D.m29077s(((Long) c6099p9.f34342e).longValue());
        C5370f5 c5370f5 = (C5370f5) m29116D.m29557k();
        int m31166w = C6077n9.m31166w(c5641v4, str);
        if (m31166w >= 0) {
            c5641v4.m29746k0(m31166w, c5370f5);
        } else {
            c5641v4.m29708E0(c5370f5);
        }
        if (j11 > 0) {
            C6034k c6034k2 = this.f34172c;
            m31060R(c6034k2);
            c6034k2.m31017x(c6099p9);
            if (true != z11) {
                str2 = "lifetime";
            } else {
                str2 = "session-scoped";
            }
            mo31033c().m31201u().m31110c("Updated engagement user property. scope, value", str2, c6099p9.f34342e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0239  */
    /* renamed from: M */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m31055M() {
        long max;
        long j11;
        mo31037v().mo31036g();
        m31082e();
        if (this.f34184o > 0) {
            long abs = 3600000 - Math.abs(mo31031a().mo105914b() - this.f34184o);
            if (abs > 0) {
                mo31033c().m31201u().m31109b("Upload has been suspended. Will update scheduling later in approximately ms", Long.valueOf(abs));
                m31077Z().m31473c();
                C6186x8 c6186x8 = this.f34174e;
                m31060R(c6186x8);
                c6186x8.m31490l();
                return;
            }
            this.f34184o = 0L;
        }
        if (this.f34181l.m31397q() && m31057O()) {
            long mo105913a = mo31031a().mo105913a();
            m31072U();
            long max2 = Math.max(0L, ((Long) AbstractC5972e3.f33876C.m30827a(null)).longValue());
            C6034k c6034k = this.f34172c;
            m31060R(c6034k);
            boolean z11 = true;
            if (!c6034k.m31013s()) {
                C6034k c6034k2 = this.f34172c;
                m31060R(c6034k2);
                if (!c6034k2.m31012r()) {
                    z11 = false;
                }
            }
            if (z11) {
                String m30930t = m31072U().m30930t();
                if (!TextUtils.isEmpty(m30930t) && !".none.".equals(m30930t)) {
                    m31072U();
                    max = Math.max(0L, ((Long) AbstractC5972e3.f33953x.m30827a(null)).longValue());
                } else {
                    m31072U();
                    max = Math.max(0L, ((Long) AbstractC5972e3.f33951w.m30827a(null)).longValue());
                }
            } else {
                m31072U();
                max = Math.max(0L, ((Long) AbstractC5972e3.f33949v.m30827a(null)).longValue());
            }
            long m31502a = this.f34178i.f34041g.m31502a();
            long m31502a2 = this.f34178i.f34042h.m31502a();
            C6034k c6034k3 = this.f34172c;
            m31060R(c6034k3);
            boolean z12 = z11;
            long m30985M = c6034k3.m30985M();
            C6034k c6034k4 = this.f34172c;
            m31060R(c6034k4);
            long max3 = Math.max(m30985M, c6034k4.m30986N());
            if (max3 != 0) {
                long abs2 = mo105913a - Math.abs(max3 - mo105913a);
                long abs3 = mo105913a - Math.abs(m31502a - mo105913a);
                long abs4 = mo105913a - Math.abs(m31502a2 - mo105913a);
                j11 = abs2 + max2;
                long max4 = Math.max(abs3, abs4);
                if (z12 && max4 > 0) {
                    j11 = Math.min(abs2, max4) + max;
                }
                C6077n9 c6077n9 = this.f34176g;
                m31060R(c6077n9);
                if (!c6077n9.m31176M(max4, max)) {
                    j11 = max4 + max;
                }
                if (abs4 != 0 && abs4 >= abs2) {
                    int i11 = 0;
                    while (true) {
                        m31072U();
                        if (i11 >= Math.min(20, Math.max(0, ((Integer) AbstractC5972e3.f33880E.m30827a(null)).intValue()))) {
                            break;
                        }
                        m31072U();
                        j11 += Math.max(0L, ((Long) AbstractC5972e3.f33878D.m30827a(null)).longValue()) * (1 << i11);
                        if (j11 > abs4) {
                            break;
                        } else {
                            i11++;
                        }
                    }
                }
                if (j11 == 0) {
                    C6137t3 c6137t3 = this.f34171b;
                    m31060R(c6137t3);
                    if (c6137t3.m31451l()) {
                        long m31502a3 = this.f34178i.f34040f.m31502a();
                        m31072U();
                        long max5 = Math.max(0L, ((Long) AbstractC5972e3.f33945t.m30827a(null)).longValue());
                        C6077n9 c6077n92 = this.f34176g;
                        m31060R(c6077n92);
                        if (!c6077n92.m31176M(m31502a3, max5)) {
                            j11 = Math.max(j11, m31502a3 + max5);
                        }
                        m31077Z().m31473c();
                        long mo105913a2 = j11 - mo31031a().mo105913a();
                        if (mo105913a2 <= 0) {
                            m31072U();
                            mo105913a2 = Math.max(0L, ((Long) AbstractC5972e3.f33955y.m30827a(null)).longValue());
                            this.f34178i.f34041g.m31503b(mo31031a().mo105913a());
                        }
                        mo31033c().m31201u().m31109b("Upload scheduled in approximately ms", Long.valueOf(mo105913a2));
                        C6186x8 c6186x82 = this.f34174e;
                        m31060R(c6186x82);
                        c6186x82.m31491m(mo105913a2);
                        return;
                    }
                    mo31033c().m31201u().m31108a("No network");
                    m31077Z().m31472b();
                    C6186x8 c6186x83 = this.f34174e;
                    m31060R(c6186x83);
                    c6186x83.m31490l();
                    return;
                }
                mo31033c().m31201u().m31108a("Next upload time is 0");
                m31077Z().m31473c();
                C6186x8 c6186x84 = this.f34174e;
                m31060R(c6186x84);
                c6186x84.m31490l();
                return;
            }
            j11 = 0;
            if (j11 == 0) {
            }
        } else {
            mo31033c().m31201u().m31108a("Nothing to upload or uploading impossible");
            m31077Z().m31473c();
            C6186x8 c6186x85 = this.f34174e;
            m31060R(c6186x85);
            c6186x85.m31490l();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:363:0x0b33, code lost:            if (r10 > (com.google.android.gms.measurement.internal.C5990g.m30910h() + r8)) goto L803;     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x037c A[Catch: all -> 0x00eb, TryCatch #2 {all -> 0x00eb, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b3, B:20:0x00c5, B:22:0x00cf, B:25:0x04f4, B:26:0x00fa, B:28:0x010a, B:31:0x012a, B:33:0x0130, B:35:0x0140, B:37:0x014e, B:39:0x015e, B:41:0x016b, B:46:0x016e, B:49:0x0185, B:55:0x01bc, B:58:0x01c6, B:60:0x01d4, B:62:0x0219, B:63:0x01f0, B:65:0x0200, B:72:0x0226, B:74:0x0252, B:75:0x027c, B:77:0x02b3, B:78:0x02b9, B:81:0x02c5, B:83:0x02fb, B:84:0x0316, B:86:0x031c, B:88:0x032a, B:90:0x033d, B:91:0x0332, B:99:0x0344, B:102:0x034b, B:103:0x0363, B:105:0x037c, B:106:0x0388, B:109:0x0392, B:113:0x03b5, B:114:0x03a4, B:123:0x0433, B:125:0x043f, B:128:0x0452, B:130:0x0463, B:132:0x046f, B:134:0x04e0, B:141:0x048a, B:143:0x0498, B:146:0x04ad, B:148:0x04be, B:150:0x04ca, B:152:0x03bd, B:154:0x03c9, B:156:0x03d5, B:160:0x041b, B:161:0x03f3, B:164:0x0405, B:166:0x040b, B:168:0x0415, B:178:0x050a, B:180:0x0518, B:182:0x0523, B:184:0x0557, B:185:0x052c, B:187:0x0537, B:189:0x053d, B:191:0x0549, B:193:0x0551, B:196:0x0559, B:197:0x0565, B:200:0x056d, B:203:0x057f, B:204:0x058b, B:206:0x0593, B:207:0x05b8, B:209:0x05dd, B:211:0x05ee, B:213:0x05f4, B:215:0x0600, B:216:0x0631, B:218:0x0637, B:222:0x0645, B:220:0x0649, B:224:0x064c, B:225:0x064f, B:226:0x065d, B:228:0x0663, B:230:0x0673, B:231:0x067a, B:233:0x0686, B:235:0x068d, B:238:0x0690, B:240:0x06ce, B:241:0x06e1, B:243:0x06e7, B:246:0x0701, B:248:0x071c, B:250:0x0735, B:252:0x073a, B:254:0x073e, B:256:0x0742, B:258:0x074c, B:259:0x0756, B:261:0x075a, B:263:0x0760, B:264:0x076e, B:265:0x0777, B:268:0x09c2, B:269:0x0783, B:334:0x079a, B:272:0x07b6, B:274:0x07da, B:275:0x07e2, B:277:0x07e8, B:281:0x07fa, B:286:0x0823, B:287:0x0846, B:289:0x0852, B:291:0x0867, B:292:0x08a8, B:295:0x08c0, B:297:0x08c7, B:299:0x08d6, B:301:0x08da, B:303:0x08de, B:305:0x08e2, B:306:0x08ee, B:307:0x08f3, B:309:0x08f9, B:311:0x0915, B:312:0x091a, B:313:0x09bf, B:315:0x0934, B:317:0x093c, B:320:0x0963, B:322:0x098f, B:323:0x0996, B:325:0x09a8, B:327:0x09b0, B:328:0x0949, B:332:0x080e, B:338:0x07a1, B:340:0x09cd, B:342:0x09da, B:343:0x09e0, B:344:0x09e8, B:346:0x09ee, B:349:0x0a08, B:351:0x0a19, B:352:0x0a8d, B:354:0x0a93, B:356:0x0aab, B:359:0x0ab2, B:360:0x0ae1, B:362:0x0b23, B:364:0x0b58, B:366:0x0b5c, B:367:0x0b67, B:369:0x0baa, B:371:0x0bb7, B:373:0x0bc6, B:377:0x0be0, B:380:0x0bf9, B:381:0x0b35, B:382:0x0aba, B:384:0x0ac6, B:385:0x0aca, B:386:0x0c11, B:387:0x0c29, B:390:0x0c31, B:392:0x0c36, B:395:0x0c46, B:397:0x0c60, B:398:0x0c7b, B:400:0x0c84, B:401:0x0ca3, B:408:0x0c90, B:409:0x0a31, B:411:0x0a37, B:413:0x0a41, B:414:0x0a48, B:419:0x0a58, B:420:0x0a5f, B:422:0x0a7e, B:423:0x0a85, B:424:0x0a82, B:425:0x0a5c, B:427:0x0a45, B:429:0x0598, B:431:0x059e, B:434:0x0cb5), top: B:2:0x000e, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x043f A[Catch: all -> 0x00eb, TryCatch #2 {all -> 0x00eb, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b3, B:20:0x00c5, B:22:0x00cf, B:25:0x04f4, B:26:0x00fa, B:28:0x010a, B:31:0x012a, B:33:0x0130, B:35:0x0140, B:37:0x014e, B:39:0x015e, B:41:0x016b, B:46:0x016e, B:49:0x0185, B:55:0x01bc, B:58:0x01c6, B:60:0x01d4, B:62:0x0219, B:63:0x01f0, B:65:0x0200, B:72:0x0226, B:74:0x0252, B:75:0x027c, B:77:0x02b3, B:78:0x02b9, B:81:0x02c5, B:83:0x02fb, B:84:0x0316, B:86:0x031c, B:88:0x032a, B:90:0x033d, B:91:0x0332, B:99:0x0344, B:102:0x034b, B:103:0x0363, B:105:0x037c, B:106:0x0388, B:109:0x0392, B:113:0x03b5, B:114:0x03a4, B:123:0x0433, B:125:0x043f, B:128:0x0452, B:130:0x0463, B:132:0x046f, B:134:0x04e0, B:141:0x048a, B:143:0x0498, B:146:0x04ad, B:148:0x04be, B:150:0x04ca, B:152:0x03bd, B:154:0x03c9, B:156:0x03d5, B:160:0x041b, B:161:0x03f3, B:164:0x0405, B:166:0x040b, B:168:0x0415, B:178:0x050a, B:180:0x0518, B:182:0x0523, B:184:0x0557, B:185:0x052c, B:187:0x0537, B:189:0x053d, B:191:0x0549, B:193:0x0551, B:196:0x0559, B:197:0x0565, B:200:0x056d, B:203:0x057f, B:204:0x058b, B:206:0x0593, B:207:0x05b8, B:209:0x05dd, B:211:0x05ee, B:213:0x05f4, B:215:0x0600, B:216:0x0631, B:218:0x0637, B:222:0x0645, B:220:0x0649, B:224:0x064c, B:225:0x064f, B:226:0x065d, B:228:0x0663, B:230:0x0673, B:231:0x067a, B:233:0x0686, B:235:0x068d, B:238:0x0690, B:240:0x06ce, B:241:0x06e1, B:243:0x06e7, B:246:0x0701, B:248:0x071c, B:250:0x0735, B:252:0x073a, B:254:0x073e, B:256:0x0742, B:258:0x074c, B:259:0x0756, B:261:0x075a, B:263:0x0760, B:264:0x076e, B:265:0x0777, B:268:0x09c2, B:269:0x0783, B:334:0x079a, B:272:0x07b6, B:274:0x07da, B:275:0x07e2, B:277:0x07e8, B:281:0x07fa, B:286:0x0823, B:287:0x0846, B:289:0x0852, B:291:0x0867, B:292:0x08a8, B:295:0x08c0, B:297:0x08c7, B:299:0x08d6, B:301:0x08da, B:303:0x08de, B:305:0x08e2, B:306:0x08ee, B:307:0x08f3, B:309:0x08f9, B:311:0x0915, B:312:0x091a, B:313:0x09bf, B:315:0x0934, B:317:0x093c, B:320:0x0963, B:322:0x098f, B:323:0x0996, B:325:0x09a8, B:327:0x09b0, B:328:0x0949, B:332:0x080e, B:338:0x07a1, B:340:0x09cd, B:342:0x09da, B:343:0x09e0, B:344:0x09e8, B:346:0x09ee, B:349:0x0a08, B:351:0x0a19, B:352:0x0a8d, B:354:0x0a93, B:356:0x0aab, B:359:0x0ab2, B:360:0x0ae1, B:362:0x0b23, B:364:0x0b58, B:366:0x0b5c, B:367:0x0b67, B:369:0x0baa, B:371:0x0bb7, B:373:0x0bc6, B:377:0x0be0, B:380:0x0bf9, B:381:0x0b35, B:382:0x0aba, B:384:0x0ac6, B:385:0x0aca, B:386:0x0c11, B:387:0x0c29, B:390:0x0c31, B:392:0x0c36, B:395:0x0c46, B:397:0x0c60, B:398:0x0c7b, B:400:0x0c84, B:401:0x0ca3, B:408:0x0c90, B:409:0x0a31, B:411:0x0a37, B:413:0x0a41, B:414:0x0a48, B:419:0x0a58, B:420:0x0a5f, B:422:0x0a7e, B:423:0x0a85, B:424:0x0a82, B:425:0x0a5c, B:427:0x0a45, B:429:0x0598, B:431:0x059e, B:434:0x0cb5), top: B:2:0x000e, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x048a A[Catch: all -> 0x00eb, TryCatch #2 {all -> 0x00eb, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b3, B:20:0x00c5, B:22:0x00cf, B:25:0x04f4, B:26:0x00fa, B:28:0x010a, B:31:0x012a, B:33:0x0130, B:35:0x0140, B:37:0x014e, B:39:0x015e, B:41:0x016b, B:46:0x016e, B:49:0x0185, B:55:0x01bc, B:58:0x01c6, B:60:0x01d4, B:62:0x0219, B:63:0x01f0, B:65:0x0200, B:72:0x0226, B:74:0x0252, B:75:0x027c, B:77:0x02b3, B:78:0x02b9, B:81:0x02c5, B:83:0x02fb, B:84:0x0316, B:86:0x031c, B:88:0x032a, B:90:0x033d, B:91:0x0332, B:99:0x0344, B:102:0x034b, B:103:0x0363, B:105:0x037c, B:106:0x0388, B:109:0x0392, B:113:0x03b5, B:114:0x03a4, B:123:0x0433, B:125:0x043f, B:128:0x0452, B:130:0x0463, B:132:0x046f, B:134:0x04e0, B:141:0x048a, B:143:0x0498, B:146:0x04ad, B:148:0x04be, B:150:0x04ca, B:152:0x03bd, B:154:0x03c9, B:156:0x03d5, B:160:0x041b, B:161:0x03f3, B:164:0x0405, B:166:0x040b, B:168:0x0415, B:178:0x050a, B:180:0x0518, B:182:0x0523, B:184:0x0557, B:185:0x052c, B:187:0x0537, B:189:0x053d, B:191:0x0549, B:193:0x0551, B:196:0x0559, B:197:0x0565, B:200:0x056d, B:203:0x057f, B:204:0x058b, B:206:0x0593, B:207:0x05b8, B:209:0x05dd, B:211:0x05ee, B:213:0x05f4, B:215:0x0600, B:216:0x0631, B:218:0x0637, B:222:0x0645, B:220:0x0649, B:224:0x064c, B:225:0x064f, B:226:0x065d, B:228:0x0663, B:230:0x0673, B:231:0x067a, B:233:0x0686, B:235:0x068d, B:238:0x0690, B:240:0x06ce, B:241:0x06e1, B:243:0x06e7, B:246:0x0701, B:248:0x071c, B:250:0x0735, B:252:0x073a, B:254:0x073e, B:256:0x0742, B:258:0x074c, B:259:0x0756, B:261:0x075a, B:263:0x0760, B:264:0x076e, B:265:0x0777, B:268:0x09c2, B:269:0x0783, B:334:0x079a, B:272:0x07b6, B:274:0x07da, B:275:0x07e2, B:277:0x07e8, B:281:0x07fa, B:286:0x0823, B:287:0x0846, B:289:0x0852, B:291:0x0867, B:292:0x08a8, B:295:0x08c0, B:297:0x08c7, B:299:0x08d6, B:301:0x08da, B:303:0x08de, B:305:0x08e2, B:306:0x08ee, B:307:0x08f3, B:309:0x08f9, B:311:0x0915, B:312:0x091a, B:313:0x09bf, B:315:0x0934, B:317:0x093c, B:320:0x0963, B:322:0x098f, B:323:0x0996, B:325:0x09a8, B:327:0x09b0, B:328:0x0949, B:332:0x080e, B:338:0x07a1, B:340:0x09cd, B:342:0x09da, B:343:0x09e0, B:344:0x09e8, B:346:0x09ee, B:349:0x0a08, B:351:0x0a19, B:352:0x0a8d, B:354:0x0a93, B:356:0x0aab, B:359:0x0ab2, B:360:0x0ae1, B:362:0x0b23, B:364:0x0b58, B:366:0x0b5c, B:367:0x0b67, B:369:0x0baa, B:371:0x0bb7, B:373:0x0bc6, B:377:0x0be0, B:380:0x0bf9, B:381:0x0b35, B:382:0x0aba, B:384:0x0ac6, B:385:0x0aca, B:386:0x0c11, B:387:0x0c29, B:390:0x0c31, B:392:0x0c36, B:395:0x0c46, B:397:0x0c60, B:398:0x0c7b, B:400:0x0c84, B:401:0x0ca3, B:408:0x0c90, B:409:0x0a31, B:411:0x0a37, B:413:0x0a41, B:414:0x0a48, B:419:0x0a58, B:420:0x0a5f, B:422:0x0a7e, B:423:0x0a85, B:424:0x0a82, B:425:0x0a5c, B:427:0x0a45, B:429:0x0598, B:431:0x059e, B:434:0x0cb5), top: B:2:0x000e, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:274:0x07da A[Catch: all -> 0x00eb, TryCatch #2 {all -> 0x00eb, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b3, B:20:0x00c5, B:22:0x00cf, B:25:0x04f4, B:26:0x00fa, B:28:0x010a, B:31:0x012a, B:33:0x0130, B:35:0x0140, B:37:0x014e, B:39:0x015e, B:41:0x016b, B:46:0x016e, B:49:0x0185, B:55:0x01bc, B:58:0x01c6, B:60:0x01d4, B:62:0x0219, B:63:0x01f0, B:65:0x0200, B:72:0x0226, B:74:0x0252, B:75:0x027c, B:77:0x02b3, B:78:0x02b9, B:81:0x02c5, B:83:0x02fb, B:84:0x0316, B:86:0x031c, B:88:0x032a, B:90:0x033d, B:91:0x0332, B:99:0x0344, B:102:0x034b, B:103:0x0363, B:105:0x037c, B:106:0x0388, B:109:0x0392, B:113:0x03b5, B:114:0x03a4, B:123:0x0433, B:125:0x043f, B:128:0x0452, B:130:0x0463, B:132:0x046f, B:134:0x04e0, B:141:0x048a, B:143:0x0498, B:146:0x04ad, B:148:0x04be, B:150:0x04ca, B:152:0x03bd, B:154:0x03c9, B:156:0x03d5, B:160:0x041b, B:161:0x03f3, B:164:0x0405, B:166:0x040b, B:168:0x0415, B:178:0x050a, B:180:0x0518, B:182:0x0523, B:184:0x0557, B:185:0x052c, B:187:0x0537, B:189:0x053d, B:191:0x0549, B:193:0x0551, B:196:0x0559, B:197:0x0565, B:200:0x056d, B:203:0x057f, B:204:0x058b, B:206:0x0593, B:207:0x05b8, B:209:0x05dd, B:211:0x05ee, B:213:0x05f4, B:215:0x0600, B:216:0x0631, B:218:0x0637, B:222:0x0645, B:220:0x0649, B:224:0x064c, B:225:0x064f, B:226:0x065d, B:228:0x0663, B:230:0x0673, B:231:0x067a, B:233:0x0686, B:235:0x068d, B:238:0x0690, B:240:0x06ce, B:241:0x06e1, B:243:0x06e7, B:246:0x0701, B:248:0x071c, B:250:0x0735, B:252:0x073a, B:254:0x073e, B:256:0x0742, B:258:0x074c, B:259:0x0756, B:261:0x075a, B:263:0x0760, B:264:0x076e, B:265:0x0777, B:268:0x09c2, B:269:0x0783, B:334:0x079a, B:272:0x07b6, B:274:0x07da, B:275:0x07e2, B:277:0x07e8, B:281:0x07fa, B:286:0x0823, B:287:0x0846, B:289:0x0852, B:291:0x0867, B:292:0x08a8, B:295:0x08c0, B:297:0x08c7, B:299:0x08d6, B:301:0x08da, B:303:0x08de, B:305:0x08e2, B:306:0x08ee, B:307:0x08f3, B:309:0x08f9, B:311:0x0915, B:312:0x091a, B:313:0x09bf, B:315:0x0934, B:317:0x093c, B:320:0x0963, B:322:0x098f, B:323:0x0996, B:325:0x09a8, B:327:0x09b0, B:328:0x0949, B:332:0x080e, B:338:0x07a1, B:340:0x09cd, B:342:0x09da, B:343:0x09e0, B:344:0x09e8, B:346:0x09ee, B:349:0x0a08, B:351:0x0a19, B:352:0x0a8d, B:354:0x0a93, B:356:0x0aab, B:359:0x0ab2, B:360:0x0ae1, B:362:0x0b23, B:364:0x0b58, B:366:0x0b5c, B:367:0x0b67, B:369:0x0baa, B:371:0x0bb7, B:373:0x0bc6, B:377:0x0be0, B:380:0x0bf9, B:381:0x0b35, B:382:0x0aba, B:384:0x0ac6, B:385:0x0aca, B:386:0x0c11, B:387:0x0c29, B:390:0x0c31, B:392:0x0c36, B:395:0x0c46, B:397:0x0c60, B:398:0x0c7b, B:400:0x0c84, B:401:0x0ca3, B:408:0x0c90, B:409:0x0a31, B:411:0x0a37, B:413:0x0a41, B:414:0x0a48, B:419:0x0a58, B:420:0x0a5f, B:422:0x0a7e, B:423:0x0a85, B:424:0x0a82, B:425:0x0a5c, B:427:0x0a45, B:429:0x0598, B:431:0x059e, B:434:0x0cb5), top: B:2:0x000e, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0823 A[Catch: all -> 0x00eb, TryCatch #2 {all -> 0x00eb, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b3, B:20:0x00c5, B:22:0x00cf, B:25:0x04f4, B:26:0x00fa, B:28:0x010a, B:31:0x012a, B:33:0x0130, B:35:0x0140, B:37:0x014e, B:39:0x015e, B:41:0x016b, B:46:0x016e, B:49:0x0185, B:55:0x01bc, B:58:0x01c6, B:60:0x01d4, B:62:0x0219, B:63:0x01f0, B:65:0x0200, B:72:0x0226, B:74:0x0252, B:75:0x027c, B:77:0x02b3, B:78:0x02b9, B:81:0x02c5, B:83:0x02fb, B:84:0x0316, B:86:0x031c, B:88:0x032a, B:90:0x033d, B:91:0x0332, B:99:0x0344, B:102:0x034b, B:103:0x0363, B:105:0x037c, B:106:0x0388, B:109:0x0392, B:113:0x03b5, B:114:0x03a4, B:123:0x0433, B:125:0x043f, B:128:0x0452, B:130:0x0463, B:132:0x046f, B:134:0x04e0, B:141:0x048a, B:143:0x0498, B:146:0x04ad, B:148:0x04be, B:150:0x04ca, B:152:0x03bd, B:154:0x03c9, B:156:0x03d5, B:160:0x041b, B:161:0x03f3, B:164:0x0405, B:166:0x040b, B:168:0x0415, B:178:0x050a, B:180:0x0518, B:182:0x0523, B:184:0x0557, B:185:0x052c, B:187:0x0537, B:189:0x053d, B:191:0x0549, B:193:0x0551, B:196:0x0559, B:197:0x0565, B:200:0x056d, B:203:0x057f, B:204:0x058b, B:206:0x0593, B:207:0x05b8, B:209:0x05dd, B:211:0x05ee, B:213:0x05f4, B:215:0x0600, B:216:0x0631, B:218:0x0637, B:222:0x0645, B:220:0x0649, B:224:0x064c, B:225:0x064f, B:226:0x065d, B:228:0x0663, B:230:0x0673, B:231:0x067a, B:233:0x0686, B:235:0x068d, B:238:0x0690, B:240:0x06ce, B:241:0x06e1, B:243:0x06e7, B:246:0x0701, B:248:0x071c, B:250:0x0735, B:252:0x073a, B:254:0x073e, B:256:0x0742, B:258:0x074c, B:259:0x0756, B:261:0x075a, B:263:0x0760, B:264:0x076e, B:265:0x0777, B:268:0x09c2, B:269:0x0783, B:334:0x079a, B:272:0x07b6, B:274:0x07da, B:275:0x07e2, B:277:0x07e8, B:281:0x07fa, B:286:0x0823, B:287:0x0846, B:289:0x0852, B:291:0x0867, B:292:0x08a8, B:295:0x08c0, B:297:0x08c7, B:299:0x08d6, B:301:0x08da, B:303:0x08de, B:305:0x08e2, B:306:0x08ee, B:307:0x08f3, B:309:0x08f9, B:311:0x0915, B:312:0x091a, B:313:0x09bf, B:315:0x0934, B:317:0x093c, B:320:0x0963, B:322:0x098f, B:323:0x0996, B:325:0x09a8, B:327:0x09b0, B:328:0x0949, B:332:0x080e, B:338:0x07a1, B:340:0x09cd, B:342:0x09da, B:343:0x09e0, B:344:0x09e8, B:346:0x09ee, B:349:0x0a08, B:351:0x0a19, B:352:0x0a8d, B:354:0x0a93, B:356:0x0aab, B:359:0x0ab2, B:360:0x0ae1, B:362:0x0b23, B:364:0x0b58, B:366:0x0b5c, B:367:0x0b67, B:369:0x0baa, B:371:0x0bb7, B:373:0x0bc6, B:377:0x0be0, B:380:0x0bf9, B:381:0x0b35, B:382:0x0aba, B:384:0x0ac6, B:385:0x0aca, B:386:0x0c11, B:387:0x0c29, B:390:0x0c31, B:392:0x0c36, B:395:0x0c46, B:397:0x0c60, B:398:0x0c7b, B:400:0x0c84, B:401:0x0ca3, B:408:0x0c90, B:409:0x0a31, B:411:0x0a37, B:413:0x0a41, B:414:0x0a48, B:419:0x0a58, B:420:0x0a5f, B:422:0x0a7e, B:423:0x0a85, B:424:0x0a82, B:425:0x0a5c, B:427:0x0a45, B:429:0x0598, B:431:0x059e, B:434:0x0cb5), top: B:2:0x000e, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0846 A[Catch: all -> 0x00eb, TryCatch #2 {all -> 0x00eb, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b3, B:20:0x00c5, B:22:0x00cf, B:25:0x04f4, B:26:0x00fa, B:28:0x010a, B:31:0x012a, B:33:0x0130, B:35:0x0140, B:37:0x014e, B:39:0x015e, B:41:0x016b, B:46:0x016e, B:49:0x0185, B:55:0x01bc, B:58:0x01c6, B:60:0x01d4, B:62:0x0219, B:63:0x01f0, B:65:0x0200, B:72:0x0226, B:74:0x0252, B:75:0x027c, B:77:0x02b3, B:78:0x02b9, B:81:0x02c5, B:83:0x02fb, B:84:0x0316, B:86:0x031c, B:88:0x032a, B:90:0x033d, B:91:0x0332, B:99:0x0344, B:102:0x034b, B:103:0x0363, B:105:0x037c, B:106:0x0388, B:109:0x0392, B:113:0x03b5, B:114:0x03a4, B:123:0x0433, B:125:0x043f, B:128:0x0452, B:130:0x0463, B:132:0x046f, B:134:0x04e0, B:141:0x048a, B:143:0x0498, B:146:0x04ad, B:148:0x04be, B:150:0x04ca, B:152:0x03bd, B:154:0x03c9, B:156:0x03d5, B:160:0x041b, B:161:0x03f3, B:164:0x0405, B:166:0x040b, B:168:0x0415, B:178:0x050a, B:180:0x0518, B:182:0x0523, B:184:0x0557, B:185:0x052c, B:187:0x0537, B:189:0x053d, B:191:0x0549, B:193:0x0551, B:196:0x0559, B:197:0x0565, B:200:0x056d, B:203:0x057f, B:204:0x058b, B:206:0x0593, B:207:0x05b8, B:209:0x05dd, B:211:0x05ee, B:213:0x05f4, B:215:0x0600, B:216:0x0631, B:218:0x0637, B:222:0x0645, B:220:0x0649, B:224:0x064c, B:225:0x064f, B:226:0x065d, B:228:0x0663, B:230:0x0673, B:231:0x067a, B:233:0x0686, B:235:0x068d, B:238:0x0690, B:240:0x06ce, B:241:0x06e1, B:243:0x06e7, B:246:0x0701, B:248:0x071c, B:250:0x0735, B:252:0x073a, B:254:0x073e, B:256:0x0742, B:258:0x074c, B:259:0x0756, B:261:0x075a, B:263:0x0760, B:264:0x076e, B:265:0x0777, B:268:0x09c2, B:269:0x0783, B:334:0x079a, B:272:0x07b6, B:274:0x07da, B:275:0x07e2, B:277:0x07e8, B:281:0x07fa, B:286:0x0823, B:287:0x0846, B:289:0x0852, B:291:0x0867, B:292:0x08a8, B:295:0x08c0, B:297:0x08c7, B:299:0x08d6, B:301:0x08da, B:303:0x08de, B:305:0x08e2, B:306:0x08ee, B:307:0x08f3, B:309:0x08f9, B:311:0x0915, B:312:0x091a, B:313:0x09bf, B:315:0x0934, B:317:0x093c, B:320:0x0963, B:322:0x098f, B:323:0x0996, B:325:0x09a8, B:327:0x09b0, B:328:0x0949, B:332:0x080e, B:338:0x07a1, B:340:0x09cd, B:342:0x09da, B:343:0x09e0, B:344:0x09e8, B:346:0x09ee, B:349:0x0a08, B:351:0x0a19, B:352:0x0a8d, B:354:0x0a93, B:356:0x0aab, B:359:0x0ab2, B:360:0x0ae1, B:362:0x0b23, B:364:0x0b58, B:366:0x0b5c, B:367:0x0b67, B:369:0x0baa, B:371:0x0bb7, B:373:0x0bc6, B:377:0x0be0, B:380:0x0bf9, B:381:0x0b35, B:382:0x0aba, B:384:0x0ac6, B:385:0x0aca, B:386:0x0c11, B:387:0x0c29, B:390:0x0c31, B:392:0x0c36, B:395:0x0c46, B:397:0x0c60, B:398:0x0c7b, B:400:0x0c84, B:401:0x0ca3, B:408:0x0c90, B:409:0x0a31, B:411:0x0a37, B:413:0x0a41, B:414:0x0a48, B:419:0x0a58, B:420:0x0a5f, B:422:0x0a7e, B:423:0x0a85, B:424:0x0a82, B:425:0x0a5c, B:427:0x0a45, B:429:0x0598, B:431:0x059e, B:434:0x0cb5), top: B:2:0x000e, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:294:0x08bd  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x08c7 A[Catch: all -> 0x00eb, TryCatch #2 {all -> 0x00eb, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b3, B:20:0x00c5, B:22:0x00cf, B:25:0x04f4, B:26:0x00fa, B:28:0x010a, B:31:0x012a, B:33:0x0130, B:35:0x0140, B:37:0x014e, B:39:0x015e, B:41:0x016b, B:46:0x016e, B:49:0x0185, B:55:0x01bc, B:58:0x01c6, B:60:0x01d4, B:62:0x0219, B:63:0x01f0, B:65:0x0200, B:72:0x0226, B:74:0x0252, B:75:0x027c, B:77:0x02b3, B:78:0x02b9, B:81:0x02c5, B:83:0x02fb, B:84:0x0316, B:86:0x031c, B:88:0x032a, B:90:0x033d, B:91:0x0332, B:99:0x0344, B:102:0x034b, B:103:0x0363, B:105:0x037c, B:106:0x0388, B:109:0x0392, B:113:0x03b5, B:114:0x03a4, B:123:0x0433, B:125:0x043f, B:128:0x0452, B:130:0x0463, B:132:0x046f, B:134:0x04e0, B:141:0x048a, B:143:0x0498, B:146:0x04ad, B:148:0x04be, B:150:0x04ca, B:152:0x03bd, B:154:0x03c9, B:156:0x03d5, B:160:0x041b, B:161:0x03f3, B:164:0x0405, B:166:0x040b, B:168:0x0415, B:178:0x050a, B:180:0x0518, B:182:0x0523, B:184:0x0557, B:185:0x052c, B:187:0x0537, B:189:0x053d, B:191:0x0549, B:193:0x0551, B:196:0x0559, B:197:0x0565, B:200:0x056d, B:203:0x057f, B:204:0x058b, B:206:0x0593, B:207:0x05b8, B:209:0x05dd, B:211:0x05ee, B:213:0x05f4, B:215:0x0600, B:216:0x0631, B:218:0x0637, B:222:0x0645, B:220:0x0649, B:224:0x064c, B:225:0x064f, B:226:0x065d, B:228:0x0663, B:230:0x0673, B:231:0x067a, B:233:0x0686, B:235:0x068d, B:238:0x0690, B:240:0x06ce, B:241:0x06e1, B:243:0x06e7, B:246:0x0701, B:248:0x071c, B:250:0x0735, B:252:0x073a, B:254:0x073e, B:256:0x0742, B:258:0x074c, B:259:0x0756, B:261:0x075a, B:263:0x0760, B:264:0x076e, B:265:0x0777, B:268:0x09c2, B:269:0x0783, B:334:0x079a, B:272:0x07b6, B:274:0x07da, B:275:0x07e2, B:277:0x07e8, B:281:0x07fa, B:286:0x0823, B:287:0x0846, B:289:0x0852, B:291:0x0867, B:292:0x08a8, B:295:0x08c0, B:297:0x08c7, B:299:0x08d6, B:301:0x08da, B:303:0x08de, B:305:0x08e2, B:306:0x08ee, B:307:0x08f3, B:309:0x08f9, B:311:0x0915, B:312:0x091a, B:313:0x09bf, B:315:0x0934, B:317:0x093c, B:320:0x0963, B:322:0x098f, B:323:0x0996, B:325:0x09a8, B:327:0x09b0, B:328:0x0949, B:332:0x080e, B:338:0x07a1, B:340:0x09cd, B:342:0x09da, B:343:0x09e0, B:344:0x09e8, B:346:0x09ee, B:349:0x0a08, B:351:0x0a19, B:352:0x0a8d, B:354:0x0a93, B:356:0x0aab, B:359:0x0ab2, B:360:0x0ae1, B:362:0x0b23, B:364:0x0b58, B:366:0x0b5c, B:367:0x0b67, B:369:0x0baa, B:371:0x0bb7, B:373:0x0bc6, B:377:0x0be0, B:380:0x0bf9, B:381:0x0b35, B:382:0x0aba, B:384:0x0ac6, B:385:0x0aca, B:386:0x0c11, B:387:0x0c29, B:390:0x0c31, B:392:0x0c36, B:395:0x0c46, B:397:0x0c60, B:398:0x0c7b, B:400:0x0c84, B:401:0x0ca3, B:408:0x0c90, B:409:0x0a31, B:411:0x0a37, B:413:0x0a41, B:414:0x0a48, B:419:0x0a58, B:420:0x0a5f, B:422:0x0a7e, B:423:0x0a85, B:424:0x0a82, B:425:0x0a5c, B:427:0x0a45, B:429:0x0598, B:431:0x059e, B:434:0x0cb5), top: B:2:0x000e, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:307:0x08f3 A[Catch: all -> 0x00eb, TryCatch #2 {all -> 0x00eb, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b3, B:20:0x00c5, B:22:0x00cf, B:25:0x04f4, B:26:0x00fa, B:28:0x010a, B:31:0x012a, B:33:0x0130, B:35:0x0140, B:37:0x014e, B:39:0x015e, B:41:0x016b, B:46:0x016e, B:49:0x0185, B:55:0x01bc, B:58:0x01c6, B:60:0x01d4, B:62:0x0219, B:63:0x01f0, B:65:0x0200, B:72:0x0226, B:74:0x0252, B:75:0x027c, B:77:0x02b3, B:78:0x02b9, B:81:0x02c5, B:83:0x02fb, B:84:0x0316, B:86:0x031c, B:88:0x032a, B:90:0x033d, B:91:0x0332, B:99:0x0344, B:102:0x034b, B:103:0x0363, B:105:0x037c, B:106:0x0388, B:109:0x0392, B:113:0x03b5, B:114:0x03a4, B:123:0x0433, B:125:0x043f, B:128:0x0452, B:130:0x0463, B:132:0x046f, B:134:0x04e0, B:141:0x048a, B:143:0x0498, B:146:0x04ad, B:148:0x04be, B:150:0x04ca, B:152:0x03bd, B:154:0x03c9, B:156:0x03d5, B:160:0x041b, B:161:0x03f3, B:164:0x0405, B:166:0x040b, B:168:0x0415, B:178:0x050a, B:180:0x0518, B:182:0x0523, B:184:0x0557, B:185:0x052c, B:187:0x0537, B:189:0x053d, B:191:0x0549, B:193:0x0551, B:196:0x0559, B:197:0x0565, B:200:0x056d, B:203:0x057f, B:204:0x058b, B:206:0x0593, B:207:0x05b8, B:209:0x05dd, B:211:0x05ee, B:213:0x05f4, B:215:0x0600, B:216:0x0631, B:218:0x0637, B:222:0x0645, B:220:0x0649, B:224:0x064c, B:225:0x064f, B:226:0x065d, B:228:0x0663, B:230:0x0673, B:231:0x067a, B:233:0x0686, B:235:0x068d, B:238:0x0690, B:240:0x06ce, B:241:0x06e1, B:243:0x06e7, B:246:0x0701, B:248:0x071c, B:250:0x0735, B:252:0x073a, B:254:0x073e, B:256:0x0742, B:258:0x074c, B:259:0x0756, B:261:0x075a, B:263:0x0760, B:264:0x076e, B:265:0x0777, B:268:0x09c2, B:269:0x0783, B:334:0x079a, B:272:0x07b6, B:274:0x07da, B:275:0x07e2, B:277:0x07e8, B:281:0x07fa, B:286:0x0823, B:287:0x0846, B:289:0x0852, B:291:0x0867, B:292:0x08a8, B:295:0x08c0, B:297:0x08c7, B:299:0x08d6, B:301:0x08da, B:303:0x08de, B:305:0x08e2, B:306:0x08ee, B:307:0x08f3, B:309:0x08f9, B:311:0x0915, B:312:0x091a, B:313:0x09bf, B:315:0x0934, B:317:0x093c, B:320:0x0963, B:322:0x098f, B:323:0x0996, B:325:0x09a8, B:327:0x09b0, B:328:0x0949, B:332:0x080e, B:338:0x07a1, B:340:0x09cd, B:342:0x09da, B:343:0x09e0, B:344:0x09e8, B:346:0x09ee, B:349:0x0a08, B:351:0x0a19, B:352:0x0a8d, B:354:0x0a93, B:356:0x0aab, B:359:0x0ab2, B:360:0x0ae1, B:362:0x0b23, B:364:0x0b58, B:366:0x0b5c, B:367:0x0b67, B:369:0x0baa, B:371:0x0bb7, B:373:0x0bc6, B:377:0x0be0, B:380:0x0bf9, B:381:0x0b35, B:382:0x0aba, B:384:0x0ac6, B:385:0x0aca, B:386:0x0c11, B:387:0x0c29, B:390:0x0c31, B:392:0x0c36, B:395:0x0c46, B:397:0x0c60, B:398:0x0c7b, B:400:0x0c84, B:401:0x0ca3, B:408:0x0c90, B:409:0x0a31, B:411:0x0a37, B:413:0x0a41, B:414:0x0a48, B:419:0x0a58, B:420:0x0a5f, B:422:0x0a7e, B:423:0x0a85, B:424:0x0a82, B:425:0x0a5c, B:427:0x0a45, B:429:0x0598, B:431:0x059e, B:434:0x0cb5), top: B:2:0x000e, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:329:0x08bf  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0b23 A[Catch: all -> 0x00eb, TryCatch #2 {all -> 0x00eb, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b3, B:20:0x00c5, B:22:0x00cf, B:25:0x04f4, B:26:0x00fa, B:28:0x010a, B:31:0x012a, B:33:0x0130, B:35:0x0140, B:37:0x014e, B:39:0x015e, B:41:0x016b, B:46:0x016e, B:49:0x0185, B:55:0x01bc, B:58:0x01c6, B:60:0x01d4, B:62:0x0219, B:63:0x01f0, B:65:0x0200, B:72:0x0226, B:74:0x0252, B:75:0x027c, B:77:0x02b3, B:78:0x02b9, B:81:0x02c5, B:83:0x02fb, B:84:0x0316, B:86:0x031c, B:88:0x032a, B:90:0x033d, B:91:0x0332, B:99:0x0344, B:102:0x034b, B:103:0x0363, B:105:0x037c, B:106:0x0388, B:109:0x0392, B:113:0x03b5, B:114:0x03a4, B:123:0x0433, B:125:0x043f, B:128:0x0452, B:130:0x0463, B:132:0x046f, B:134:0x04e0, B:141:0x048a, B:143:0x0498, B:146:0x04ad, B:148:0x04be, B:150:0x04ca, B:152:0x03bd, B:154:0x03c9, B:156:0x03d5, B:160:0x041b, B:161:0x03f3, B:164:0x0405, B:166:0x040b, B:168:0x0415, B:178:0x050a, B:180:0x0518, B:182:0x0523, B:184:0x0557, B:185:0x052c, B:187:0x0537, B:189:0x053d, B:191:0x0549, B:193:0x0551, B:196:0x0559, B:197:0x0565, B:200:0x056d, B:203:0x057f, B:204:0x058b, B:206:0x0593, B:207:0x05b8, B:209:0x05dd, B:211:0x05ee, B:213:0x05f4, B:215:0x0600, B:216:0x0631, B:218:0x0637, B:222:0x0645, B:220:0x0649, B:224:0x064c, B:225:0x064f, B:226:0x065d, B:228:0x0663, B:230:0x0673, B:231:0x067a, B:233:0x0686, B:235:0x068d, B:238:0x0690, B:240:0x06ce, B:241:0x06e1, B:243:0x06e7, B:246:0x0701, B:248:0x071c, B:250:0x0735, B:252:0x073a, B:254:0x073e, B:256:0x0742, B:258:0x074c, B:259:0x0756, B:261:0x075a, B:263:0x0760, B:264:0x076e, B:265:0x0777, B:268:0x09c2, B:269:0x0783, B:334:0x079a, B:272:0x07b6, B:274:0x07da, B:275:0x07e2, B:277:0x07e8, B:281:0x07fa, B:286:0x0823, B:287:0x0846, B:289:0x0852, B:291:0x0867, B:292:0x08a8, B:295:0x08c0, B:297:0x08c7, B:299:0x08d6, B:301:0x08da, B:303:0x08de, B:305:0x08e2, B:306:0x08ee, B:307:0x08f3, B:309:0x08f9, B:311:0x0915, B:312:0x091a, B:313:0x09bf, B:315:0x0934, B:317:0x093c, B:320:0x0963, B:322:0x098f, B:323:0x0996, B:325:0x09a8, B:327:0x09b0, B:328:0x0949, B:332:0x080e, B:338:0x07a1, B:340:0x09cd, B:342:0x09da, B:343:0x09e0, B:344:0x09e8, B:346:0x09ee, B:349:0x0a08, B:351:0x0a19, B:352:0x0a8d, B:354:0x0a93, B:356:0x0aab, B:359:0x0ab2, B:360:0x0ae1, B:362:0x0b23, B:364:0x0b58, B:366:0x0b5c, B:367:0x0b67, B:369:0x0baa, B:371:0x0bb7, B:373:0x0bc6, B:377:0x0be0, B:380:0x0bf9, B:381:0x0b35, B:382:0x0aba, B:384:0x0ac6, B:385:0x0aca, B:386:0x0c11, B:387:0x0c29, B:390:0x0c31, B:392:0x0c36, B:395:0x0c46, B:397:0x0c60, B:398:0x0c7b, B:400:0x0c84, B:401:0x0ca3, B:408:0x0c90, B:409:0x0a31, B:411:0x0a37, B:413:0x0a41, B:414:0x0a48, B:419:0x0a58, B:420:0x0a5f, B:422:0x0a7e, B:423:0x0a85, B:424:0x0a82, B:425:0x0a5c, B:427:0x0a45, B:429:0x0598, B:431:0x059e, B:434:0x0cb5), top: B:2:0x000e, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:369:0x0baa A[Catch: all -> 0x00eb, TRY_LEAVE, TryCatch #2 {all -> 0x00eb, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b3, B:20:0x00c5, B:22:0x00cf, B:25:0x04f4, B:26:0x00fa, B:28:0x010a, B:31:0x012a, B:33:0x0130, B:35:0x0140, B:37:0x014e, B:39:0x015e, B:41:0x016b, B:46:0x016e, B:49:0x0185, B:55:0x01bc, B:58:0x01c6, B:60:0x01d4, B:62:0x0219, B:63:0x01f0, B:65:0x0200, B:72:0x0226, B:74:0x0252, B:75:0x027c, B:77:0x02b3, B:78:0x02b9, B:81:0x02c5, B:83:0x02fb, B:84:0x0316, B:86:0x031c, B:88:0x032a, B:90:0x033d, B:91:0x0332, B:99:0x0344, B:102:0x034b, B:103:0x0363, B:105:0x037c, B:106:0x0388, B:109:0x0392, B:113:0x03b5, B:114:0x03a4, B:123:0x0433, B:125:0x043f, B:128:0x0452, B:130:0x0463, B:132:0x046f, B:134:0x04e0, B:141:0x048a, B:143:0x0498, B:146:0x04ad, B:148:0x04be, B:150:0x04ca, B:152:0x03bd, B:154:0x03c9, B:156:0x03d5, B:160:0x041b, B:161:0x03f3, B:164:0x0405, B:166:0x040b, B:168:0x0415, B:178:0x050a, B:180:0x0518, B:182:0x0523, B:184:0x0557, B:185:0x052c, B:187:0x0537, B:189:0x053d, B:191:0x0549, B:193:0x0551, B:196:0x0559, B:197:0x0565, B:200:0x056d, B:203:0x057f, B:204:0x058b, B:206:0x0593, B:207:0x05b8, B:209:0x05dd, B:211:0x05ee, B:213:0x05f4, B:215:0x0600, B:216:0x0631, B:218:0x0637, B:222:0x0645, B:220:0x0649, B:224:0x064c, B:225:0x064f, B:226:0x065d, B:228:0x0663, B:230:0x0673, B:231:0x067a, B:233:0x0686, B:235:0x068d, B:238:0x0690, B:240:0x06ce, B:241:0x06e1, B:243:0x06e7, B:246:0x0701, B:248:0x071c, B:250:0x0735, B:252:0x073a, B:254:0x073e, B:256:0x0742, B:258:0x074c, B:259:0x0756, B:261:0x075a, B:263:0x0760, B:264:0x076e, B:265:0x0777, B:268:0x09c2, B:269:0x0783, B:334:0x079a, B:272:0x07b6, B:274:0x07da, B:275:0x07e2, B:277:0x07e8, B:281:0x07fa, B:286:0x0823, B:287:0x0846, B:289:0x0852, B:291:0x0867, B:292:0x08a8, B:295:0x08c0, B:297:0x08c7, B:299:0x08d6, B:301:0x08da, B:303:0x08de, B:305:0x08e2, B:306:0x08ee, B:307:0x08f3, B:309:0x08f9, B:311:0x0915, B:312:0x091a, B:313:0x09bf, B:315:0x0934, B:317:0x093c, B:320:0x0963, B:322:0x098f, B:323:0x0996, B:325:0x09a8, B:327:0x09b0, B:328:0x0949, B:332:0x080e, B:338:0x07a1, B:340:0x09cd, B:342:0x09da, B:343:0x09e0, B:344:0x09e8, B:346:0x09ee, B:349:0x0a08, B:351:0x0a19, B:352:0x0a8d, B:354:0x0a93, B:356:0x0aab, B:359:0x0ab2, B:360:0x0ae1, B:362:0x0b23, B:364:0x0b58, B:366:0x0b5c, B:367:0x0b67, B:369:0x0baa, B:371:0x0bb7, B:373:0x0bc6, B:377:0x0be0, B:380:0x0bf9, B:381:0x0b35, B:382:0x0aba, B:384:0x0ac6, B:385:0x0aca, B:386:0x0c11, B:387:0x0c29, B:390:0x0c31, B:392:0x0c36, B:395:0x0c46, B:397:0x0c60, B:398:0x0c7b, B:400:0x0c84, B:401:0x0ca3, B:408:0x0c90, B:409:0x0a31, B:411:0x0a37, B:413:0x0a41, B:414:0x0a48, B:419:0x0a58, B:420:0x0a5f, B:422:0x0a7e, B:423:0x0a85, B:424:0x0a82, B:425:0x0a5c, B:427:0x0a45, B:429:0x0598, B:431:0x059e, B:434:0x0cb5), top: B:2:0x000e, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:373:0x0bc6 A[Catch: all -> 0x00eb, SQLiteException -> 0x0bde, TRY_LEAVE, TryCatch #4 {SQLiteException -> 0x0bde, blocks: (B:371:0x0bb7, B:373:0x0bc6), top: B:370:0x0bb7, outer: #2 }] */
    /* renamed from: N */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean m31056N(String str, long j11) {
        int i11;
        C5641v4 c5641v4;
        C5641v4 c5641v42;
        C6033j9 c6033j9;
        C6034k c6034k;
        C5658w4 c5658w4;
        long mo105913a;
        long m29938I1;
        ContentValues contentValues;
        long parseLong;
        int m31133q;
        long j12;
        Long l11;
        boolean z11;
        SecureRandom secureRandom;
        C6033j9 c6033j92;
        C5641v4 c5641v43;
        Long l12;
        Boolean bool;
        long m31355u0;
        C5641v4 c5641v44;
        Long l13;
        String str2;
        int i12;
        C5454k4 c5454k4;
        C5454k4 c5454k42;
        int i13;
        int i14;
        C5454k4 c5454k43;
        String str3 = "_npa";
        String str4 = "_ai";
        C6034k c6034k2 = this.f34172c;
        m31060R(c6034k2);
        c6034k2.m31002e0();
        try {
            C6033j9 c6033j93 = new C6033j9(this, null);
            C6034k c6034k3 = this.f34172c;
            m31060R(c6034k3);
            c6034k3.m30982G(null, j11, this.f34195z, c6033j93);
            List list = c6033j93.f34118c;
            if (list != null && !list.isEmpty()) {
                C5641v4 c5641v45 = (C5641v4) c6033j93.f34116a.m29649i();
                c5641v45.m29716J0();
                C5454k4 c5454k44 = null;
                C5454k4 c5454k45 = null;
                int i15 = 0;
                int i16 = 0;
                int i17 = 0;
                int i18 = -1;
                int i19 = -1;
                while (true) {
                    i11 = i17;
                    c5641v4 = c5641v45;
                    if (i15 >= c6033j93.f34118c.size()) {
                        break;
                    }
                    C5454k4 c5454k46 = (C5454k4) ((C5471l4) c6033j93.f34118c.get(i15)).m29649i();
                    C6061m4 c6061m4 = this.f34170a;
                    m31060R(c6061m4);
                    String str5 = str3;
                    if (c6061m4.m31124F(c6033j93.f34116a.m29956V1(), c5454k46.m29345D())) {
                        int i21 = i16;
                        mo31033c().m31202w().m31110c("Dropping blocked raw event. appId", C6082o3.m31193z(c6033j93.f34116a.m29956V1()), this.f34181l.m31372D().m30964d(c5454k46.m29345D()));
                        C6061m4 c6061m42 = this.f34170a;
                        m31060R(c6061m42);
                        if (!c6061m42.m31122D(c6033j93.f34116a.m29956V1())) {
                            C6061m4 c6061m43 = this.f34170a;
                            m31060R(c6061m43);
                            if (!c6061m43.m31125G(c6033j93.f34116a.m29956V1()) && !"_err".equals(c5454k46.m29345D())) {
                                m31087h0().m31317C(this.f34169E, c6033j93.f34116a.m29956V1(), 11, "_ev", c5454k46.m29345D(), 0);
                            }
                        }
                        str2 = str4;
                        i17 = i11;
                        c5641v45 = c5641v4;
                        i16 = i21;
                    } else {
                        int i22 = i16;
                        if (c5454k46.m29345D().equals(AbstractC20325q.m106024a(str4))) {
                            c5454k46.m29356x(str4);
                            mo31033c().m31201u().m31108a("Renaming ad_impression to _ai");
                            if (Log.isLoggable(mo31033c().m31194D(), 5)) {
                                for (int i23 = 0; i23 < c5454k46.m29348o(); i23++) {
                                    if ("ad_platform".equals(c5454k46.m29344C(i23).m29518G()) && !c5454k46.m29344C(i23).m29519H().isEmpty() && "admob".equalsIgnoreCase(c5454k46.m29344C(i23).m29519H())) {
                                        mo31033c().m31203x().m31108a("AdMob ad impression logged from app. Potentially duplicative.");
                                    }
                                }
                            }
                        }
                        C6061m4 c6061m44 = this.f34170a;
                        m31060R(c6061m44);
                        boolean m31123E = c6061m44.m31123E(c6033j93.f34116a.m29956V1(), c5454k46.m29345D());
                        if (!m31123E) {
                            m31060R(this.f34176g);
                            String m29345D = c5454k46.m29345D();
                            AbstractC4205o.m19718g(m29345D);
                            str2 = str4;
                            i12 = i15;
                            if (m29345D.hashCode() != 95027 || !m29345D.equals("_ui")) {
                                c5454k42 = c5454k44;
                                i13 = i18;
                                c5454k4 = c5454k45;
                                i14 = i19;
                                m31123E = false;
                                if (m31123E) {
                                    ArrayList arrayList = new ArrayList(c5454k46.m29346E());
                                    int i24 = -1;
                                    int i25 = -1;
                                    for (int i26 = 0; i26 < arrayList.size(); i26++) {
                                        if ("value".equals(((C5539p4) arrayList.get(i26)).m29518G())) {
                                            i24 = i26;
                                        } else if ("currency".equals(((C5539p4) arrayList.get(i26)).m29518G())) {
                                            i25 = i26;
                                        }
                                    }
                                    if (i24 != -1) {
                                        if (!((C5539p4) arrayList.get(i24)).m29523W() && !((C5539p4) arrayList.get(i24)).m29521U()) {
                                            mo31033c().m31203x().m31108a("Value must be specified with a numeric type.");
                                            c5454k46.m29355w(i24);
                                            m31050H(c5454k46, "_c");
                                            m31049G(c5454k46, 18, "value");
                                        } else {
                                            if (i25 != -1) {
                                                String m29519H = ((C5539p4) arrayList.get(i25)).m29519H();
                                                if (m29519H.length() == 3) {
                                                    int i27 = 0;
                                                    while (i27 < m29519H.length()) {
                                                        int codePointAt = m29519H.codePointAt(i27);
                                                        if (Character.isLetter(codePointAt)) {
                                                            i27 += Character.charCount(codePointAt);
                                                        }
                                                    }
                                                }
                                            }
                                            mo31033c().m31203x().m31108a("Value parameter discarded. You must also supply a 3-letter ISO_4217 currency code in the currency parameter.");
                                            c5454k46.m29355w(i24);
                                            m31050H(c5454k46, "_c");
                                            m31049G(c5454k46, 19, "currency");
                                            break;
                                        }
                                    }
                                    if ("_e".equals(c5454k46.m29345D())) {
                                        m31060R(this.f34176g);
                                        if (C6077n9.m31157m((C5471l4) c5454k46.m29557k(), "_fr") == null) {
                                            if (c5454k4 != null && Math.abs(c5454k4.m29350q() - c5454k46.m29350q()) <= 1000) {
                                                C5454k4 c5454k47 = (C5454k4) c5454k4.clone();
                                                if (m31058P(c5454k46, c5454k47)) {
                                                    c5641v45 = c5641v4;
                                                    c5641v45.m29714I(i14, c5454k47);
                                                    i19 = i14;
                                                    i18 = i13;
                                                    c5454k44 = null;
                                                    c5454k45 = null;
                                                    i15 = i12;
                                                    c6033j93.f34118c.set(i15, (C5471l4) c5454k46.m29557k());
                                                    i16 = i22 + 1;
                                                    c5641v45.m29704C0(c5454k46);
                                                    i17 = i11;
                                                }
                                            }
                                            c5641v45 = c5641v4;
                                            c5454k44 = c5454k46;
                                            i19 = i14;
                                            i18 = i22;
                                            c5454k45 = c5454k4;
                                            i15 = i12;
                                            c6033j93.f34118c.set(i15, (C5471l4) c5454k46.m29557k());
                                            i16 = i22 + 1;
                                            c5641v45.m29704C0(c5454k46);
                                            i17 = i11;
                                        } else {
                                            c5641v45 = c5641v4;
                                            i18 = i13;
                                            i19 = i14;
                                            c5454k44 = c5454k42;
                                            c5454k45 = c5454k4;
                                            i15 = i12;
                                            c6033j93.f34118c.set(i15, (C5471l4) c5454k46.m29557k());
                                            i16 = i22 + 1;
                                            c5641v45.m29704C0(c5454k46);
                                            i17 = i11;
                                        }
                                    } else {
                                        c5641v45 = c5641v4;
                                        if ("_vs".equals(c5454k46.m29345D())) {
                                            m31060R(this.f34176g);
                                            if (C6077n9.m31157m((C5471l4) c5454k46.m29557k(), "_et") == null) {
                                                if (c5454k42 != null && Math.abs(c5454k42.m29350q() - c5454k46.m29350q()) <= 1000) {
                                                    C5454k4 c5454k48 = (C5454k4) c5454k42.clone();
                                                    if (m31058P(c5454k48, c5454k46)) {
                                                        int i28 = i13;
                                                        c5641v45.m29714I(i28, c5454k48);
                                                        i18 = i28;
                                                        i19 = i14;
                                                        c5454k44 = null;
                                                        c5454k45 = null;
                                                        i15 = i12;
                                                        c6033j93.f34118c.set(i15, (C5471l4) c5454k46.m29557k());
                                                        i16 = i22 + 1;
                                                        c5641v45.m29704C0(c5454k46);
                                                        i17 = i11;
                                                    }
                                                }
                                                c5454k45 = c5454k46;
                                                i18 = i13;
                                                i19 = i22;
                                                c5454k44 = c5454k42;
                                                i15 = i12;
                                                c6033j93.f34118c.set(i15, (C5471l4) c5454k46.m29557k());
                                                i16 = i22 + 1;
                                                c5641v45.m29704C0(c5454k46);
                                                i17 = i11;
                                            }
                                        }
                                        i18 = i13;
                                        i19 = i14;
                                        c5454k44 = c5454k42;
                                        c5454k45 = c5454k4;
                                        i15 = i12;
                                        c6033j93.f34118c.set(i15, (C5471l4) c5454k46.m29557k());
                                        i16 = i22 + 1;
                                        c5641v45.m29704C0(c5454k46);
                                        i17 = i11;
                                    }
                                }
                                if ("_e".equals(c5454k46.m29345D())) {
                                }
                            }
                        } else {
                            str2 = str4;
                            i12 = i15;
                        }
                        i13 = i18;
                        int i29 = 0;
                        boolean z12 = false;
                        boolean z13 = false;
                        while (true) {
                            c5454k42 = c5454k44;
                            if (i29 >= c5454k46.m29348o()) {
                                break;
                            }
                            if ("_c".equals(c5454k46.m29344C(i29).m29518G())) {
                                C5522o4 c5522o4 = (C5522o4) c5454k46.m29344C(i29).m29649i();
                                c5454k43 = c5454k45;
                                c5522o4.m29481x(1L);
                                c5454k46.m29358z(i29, (C5539p4) c5522o4.m29557k());
                                z12 = true;
                            } else {
                                c5454k43 = c5454k45;
                                if ("_r".equals(c5454k46.m29344C(i29).m29518G())) {
                                    C5522o4 c5522o42 = (C5522o4) c5454k46.m29344C(i29).m29649i();
                                    c5522o42.m29481x(1L);
                                    c5454k46.m29358z(i29, (C5539p4) c5522o42.m29557k());
                                    z13 = true;
                                }
                            }
                            i29++;
                            c5454k44 = c5454k42;
                            c5454k45 = c5454k43;
                        }
                        c5454k4 = c5454k45;
                        if (!z12 && m31123E) {
                            mo31033c().m31201u().m31109b("Marking event as conversion", this.f34181l.m31372D().m30964d(c5454k46.m29345D()));
                            C5522o4 m29501E = C5539p4.m29501E();
                            m29501E.m29482y("_c");
                            m29501E.m29481x(1L);
                            c5454k46.m29352s(m29501E);
                        }
                        if (!z13) {
                            mo31033c().m31201u().m31109b("Marking event as real-time", this.f34181l.m31372D().m30964d(c5454k46.m29345D()));
                            C5522o4 m29501E2 = C5539p4.m29501E();
                            m29501E2.m29482y("_r");
                            m29501E2.m29481x(1L);
                            c5454k46.m29352s(m29501E2);
                        }
                        C6034k c6034k4 = this.f34172c;
                        m31060R(c6034k4);
                        i14 = i19;
                        if (c6034k4.m30992T(m31069F(), c6033j93.f34116a.m29956V1(), false, false, false, false, true).f34076e > m31072U().m30924n(c6033j93.f34116a.m29956V1(), AbstractC5972e3.f33939q)) {
                            m31050H(c5454k46, "_r");
                        } else {
                            i11 = 1;
                        }
                        if (C6121r9.m31301Z(c5454k46.m29345D()) && m31123E) {
                            C6034k c6034k5 = this.f34172c;
                            m31060R(c6034k5);
                            if (c6034k5.m30992T(m31069F(), c6033j93.f34116a.m29956V1(), false, false, true, false, false).f34074c > m31072U().m30924n(c6033j93.f34116a.m29956V1(), AbstractC5972e3.f33937p)) {
                                mo31033c().m31202w().m31109b("Too many conversions. Not logging as conversion. appId", C6082o3.m31193z(c6033j93.f34116a.m29956V1()));
                                C5522o4 c5522o43 = null;
                                boolean z14 = false;
                                int i31 = -1;
                                for (int i32 = 0; i32 < c5454k46.m29348o(); i32++) {
                                    C5539p4 m29344C = c5454k46.m29344C(i32);
                                    if ("_c".equals(m29344C.m29518G())) {
                                        c5522o43 = (C5522o4) m29344C.m29649i();
                                        i31 = i32;
                                    } else if ("_err".equals(m29344C.m29518G())) {
                                        z14 = true;
                                    }
                                }
                                if (z14) {
                                    if (c5522o43 != null) {
                                        c5454k46.m29355w(i31);
                                    } else {
                                        c5522o43 = null;
                                    }
                                }
                                if (c5522o43 != null) {
                                    C5522o4 c5522o44 = (C5522o4) c5522o43.clone();
                                    c5522o44.m29482y("_err");
                                    c5522o44.m29481x(10L);
                                    c5454k46.m29358z(i31, (C5539p4) c5522o44.m29557k());
                                } else {
                                    mo31033c().m31197q().m31109b("Did not find conversion parameter. appId", C6082o3.m31193z(c6033j93.f34116a.m29956V1()));
                                }
                            }
                        }
                        if (m31123E) {
                        }
                        if ("_e".equals(c5454k46.m29345D())) {
                        }
                    }
                    i15++;
                    str3 = str5;
                    str4 = str2;
                }
                String str6 = str3;
                C5641v4 c5641v46 = c5641v4;
                long j13 = 0;
                int i33 = 0;
                while (i33 < i16) {
                    C5471l4 m29765w0 = c5641v46.m29765w0(i33);
                    if ("_e".equals(m29765w0.m29398H())) {
                        m31060R(this.f34176g);
                        if (C6077n9.m31157m(m29765w0, "_fr") != null) {
                            c5641v46.m29750o(i33);
                            i16--;
                            i33--;
                            i33++;
                        }
                    }
                    m31060R(this.f34176g);
                    C5539p4 m31157m = C6077n9.m31157m(m29765w0, "_et");
                    if (m31157m != null) {
                        if (m31157m.m29523W()) {
                            l13 = Long.valueOf(m31157m.m29517D());
                        } else {
                            l13 = null;
                        }
                        if (l13 != null && l13.longValue() > 0) {
                            j13 += l13.longValue();
                        }
                    }
                    i33++;
                }
                m31054L(c5641v46, j13, false);
                Iterator it = c5641v46.m29756r0().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if ("_s".equals(((C5471l4) it.next()).m29398H())) {
                        C6034k c6034k6 = this.f34172c;
                        m31060R(c6034k6);
                        c6034k6.m31006l(c5641v46.m29749n0(), "_se");
                        break;
                    }
                }
                if (C6077n9.m31166w(c5641v46, "_sid") >= 0) {
                    m31054L(c5641v46, j13, true);
                } else {
                    int m31166w = C6077n9.m31166w(c5641v46, "_se");
                    if (m31166w >= 0) {
                        c5641v46.m29751p(m31166w);
                        mo31033c().m31197q().m31109b("Session engagement user property is in the bundle without session ID. appId", C6082o3.m31193z(c6033j93.f34116a.m29956V1()));
                    }
                }
                C6077n9 c6077n9 = this.f34176g;
                m31060R(c6077n9);
                c6077n9.f34158a.mo31033c().m31201u().m31108a("Checking account type status for ad personalization signals");
                C6061m4 c6061m45 = c6077n9.f34628b.f34170a;
                m31060R(c6061m45);
                if (c6061m45.m31120B(c5641v46.m29749n0())) {
                    C6034k c6034k7 = c6077n9.f34628b.f34172c;
                    m31060R(c6034k7);
                    C6084o5 m30990R = c6034k7.m30990R(c5641v46.m29749n0());
                    if (m30990R != null && m30990R.m31216L() && c6077n9.f34158a.m31369A().m31185r()) {
                        c6077n9.f34158a.mo31033c().m31196p().m31108a("Turning off ad personalization due to account type");
                        C5353e5 m29116D = C5370f5.m29116D();
                        m29116D.m29078u(str6);
                        m29116D.m29079v(c6077n9.f34158a.m31369A().m31181n());
                        m29116D.m29077s(1L);
                        C5370f5 c5370f5 = (C5370f5) m29116D.m29557k();
                        int i34 = 0;
                        while (true) {
                            if (i34 < c5641v46.m29759t0()) {
                                if (str6.equals(c5641v46.m29748m0(i34).m29129F())) {
                                    c5641v46.m29746k0(i34, c5370f5);
                                    break;
                                }
                                i34++;
                            } else {
                                c5641v46.m29708E0(c5370f5);
                                break;
                            }
                        }
                    }
                }
                c5641v46.m29741e0(Long.MAX_VALUE);
                c5641v46.m29710G(Long.MIN_VALUE);
                for (int i35 = 0; i35 < c5641v46.m29732U(); i35++) {
                    C5471l4 m29765w02 = c5641v46.m29765w0(i35);
                    if (m29765w02.m29396D() < c5641v46.m29763v0()) {
                        c5641v46.m29741e0(m29765w02.m29396D());
                    }
                    if (m29765w02.m29396D() > c5641v46.m29761u0()) {
                        c5641v46.m29710G(m29765w02.m29396D());
                    }
                }
                c5641v46.m29729R0();
                c5641v46.m29711G0();
                C5933b c5933b = this.f34175f;
                m31060R(c5933b);
                c5641v46.m29767x0(c5933b.m30802l(c5641v46.m29749n0(), c5641v46.m29756r0(), c5641v46.m29758s0(), Long.valueOf(c5641v46.m29763v0()), Long.valueOf(c5641v46.m29761u0())));
                if (m31072U().m30917F(c6033j93.f34116a.m29956V1())) {
                    HashMap hashMap = new HashMap();
                    ArrayList arrayList2 = new ArrayList();
                    SecureRandom m31353t = m31087h0().m31353t();
                    int i36 = 0;
                    while (i36 < c5641v46.m29732U()) {
                        C5454k4 c5454k49 = (C5454k4) c5641v46.m29765w0(i36).m29649i();
                        if (c5454k49.m29345D().equals("_ep")) {
                            m31060R(this.f34176g);
                            String str7 = (String) C6077n9.m31158n((C5471l4) c5454k49.m29557k(), "_en");
                            C6100q c6100q = (C6100q) hashMap.get(str7);
                            if (c6100q == null) {
                                C6034k c6034k8 = this.f34172c;
                                m31060R(c6034k8);
                                c6100q = c6034k8.m30994V(c6033j93.f34116a.m29956V1(), (String) AbstractC4205o.m19722k(str7));
                                if (c6100q != null) {
                                    hashMap.put(str7, c6100q);
                                }
                            }
                            if (c6100q != null && c6100q.f34351i == null) {
                                Long l14 = c6100q.f34352j;
                                if (l14 != null && l14.longValue() > 1) {
                                    m31060R(this.f34176g);
                                    C6077n9.m31155P(c5454k49, "_sr", c6100q.f34352j);
                                }
                                Boolean bool2 = c6100q.f34353k;
                                if (bool2 != null && bool2.booleanValue()) {
                                    m31060R(this.f34176g);
                                    C6077n9.m31155P(c5454k49, "_efs", 1L);
                                }
                                arrayList2.add((C5471l4) c5454k49.m29557k());
                            }
                            c5641v46.m29714I(i36, c5454k49);
                        } else {
                            C6061m4 c6061m46 = this.f34170a;
                            m31060R(c6061m46);
                            String m29956V1 = c6033j93.f34116a.m29956V1();
                            String mo30834d = c6061m46.mo30834d(m29956V1, "measurement.account.time_zone_offset_minutes");
                            if (!TextUtils.isEmpty(mo30834d)) {
                                try {
                                    parseLong = Long.parseLong(mo30834d);
                                } catch (NumberFormatException e11) {
                                    c6061m46.f34158a.mo31033c().m31202w().m31110c("Unable to parse timezone offset. appId", C6082o3.m31193z(m29956V1), e11);
                                }
                                long m31355u02 = m31087h0().m31355u0(c5454k49.m29350q(), parseLong);
                                C5471l4 c5471l4 = (C5471l4) c5454k49.m29557k();
                                Long l15 = 1L;
                                long j14 = parseLong;
                                if (!TextUtils.isEmpty("_dbg")) {
                                    Iterator it2 = c5471l4.m29399I().iterator();
                                    while (true) {
                                        if (!it2.hasNext()) {
                                            break;
                                        }
                                        C5539p4 c5539p4 = (C5539p4) it2.next();
                                        Iterator it3 = it2;
                                        if ("_dbg".equals(c5539p4.m29518G())) {
                                            if (l15.equals(Long.valueOf(c5539p4.m29517D()))) {
                                                m31133q = 1;
                                            }
                                        } else {
                                            it2 = it3;
                                        }
                                    }
                                }
                                C6061m4 c6061m47 = this.f34170a;
                                m31060R(c6061m47);
                                m31133q = c6061m47.m31133q(c6033j93.f34116a.m29956V1(), c5454k49.m29345D());
                                if (m31133q > 0) {
                                    mo31033c().m31202w().m31110c("Sample rate must be positive. event, rate", c5454k49.m29345D(), Integer.valueOf(m31133q));
                                    arrayList2.add((C5471l4) c5454k49.m29557k());
                                    c5641v46.m29714I(i36, c5454k49);
                                } else {
                                    C6100q c6100q2 = (C6100q) hashMap.get(c5454k49.m29345D());
                                    if (c6100q2 == null) {
                                        C6034k c6034k9 = this.f34172c;
                                        m31060R(c6034k9);
                                        c6100q2 = c6034k9.m30994V(c6033j93.f34116a.m29956V1(), c5454k49.m29345D());
                                        if (c6100q2 == null) {
                                            j12 = m31355u02;
                                            mo31033c().m31202w().m31110c("Event being bundled has no eventAggregate. appId, eventName", c6033j93.f34116a.m29956V1(), c5454k49.m29345D());
                                            c6100q2 = new C6100q(c6033j93.f34116a.m29956V1(), c5454k49.m29345D(), 1L, 1L, 1L, c5454k49.m29350q(), 0L, null, null, null, null);
                                            m31060R(this.f34176g);
                                            l11 = (Long) C6077n9.m31158n((C5471l4) c5454k49.m29557k(), "_eid");
                                            if (l11 == null) {
                                                z11 = true;
                                            } else {
                                                z11 = false;
                                            }
                                            Boolean valueOf = Boolean.valueOf(z11);
                                            if (m31133q != 1) {
                                                arrayList2.add((C5471l4) c5454k49.m29557k());
                                                if (valueOf.booleanValue() && (c6100q2.f34351i != null || c6100q2.f34352j != null || c6100q2.f34353k != null)) {
                                                    hashMap.put(c5454k49.m29345D(), c6100q2.m31278a(null, null, null));
                                                }
                                                c5641v46.m29714I(i36, c5454k49);
                                            } else {
                                                if (m31353t.nextInt(m31133q) == 0) {
                                                    m31060R(this.f34176g);
                                                    Long valueOf2 = Long.valueOf(m31133q);
                                                    C6077n9.m31155P(c5454k49, "_sr", valueOf2);
                                                    arrayList2.add((C5471l4) c5454k49.m29557k());
                                                    if (valueOf.booleanValue()) {
                                                        c6100q2 = c6100q2.m31278a(null, valueOf2, null);
                                                    }
                                                    hashMap.put(c5454k49.m29345D(), c6100q2.m31279b(c5454k49.m29350q(), j12));
                                                    c6033j92 = c6033j93;
                                                    c5641v44 = c5641v46;
                                                    secureRandom = m31353t;
                                                } else {
                                                    long j15 = j12;
                                                    secureRandom = m31353t;
                                                    Long l16 = c6100q2.f34350h;
                                                    if (l16 != null) {
                                                        m31355u0 = l16.longValue();
                                                        c6033j92 = c6033j93;
                                                        c5641v43 = c5641v46;
                                                        l12 = l11;
                                                        bool = valueOf;
                                                    } else {
                                                        c6033j92 = c6033j93;
                                                        c5641v43 = c5641v46;
                                                        l12 = l11;
                                                        bool = valueOf;
                                                        m31355u0 = m31087h0().m31355u0(c5454k49.m29349p(), j14);
                                                    }
                                                    if (m31355u0 != j15) {
                                                        m31060R(this.f34176g);
                                                        C6077n9.m31155P(c5454k49, "_efs", 1L);
                                                        m31060R(this.f34176g);
                                                        Long valueOf3 = Long.valueOf(m31133q);
                                                        C6077n9.m31155P(c5454k49, "_sr", valueOf3);
                                                        arrayList2.add((C5471l4) c5454k49.m29557k());
                                                        if (bool.booleanValue()) {
                                                            c6100q2 = c6100q2.m31278a(null, valueOf3, Boolean.TRUE);
                                                        }
                                                        hashMap.put(c5454k49.m29345D(), c6100q2.m31279b(c5454k49.m29350q(), j15));
                                                    } else if (bool.booleanValue()) {
                                                        hashMap.put(c5454k49.m29345D(), c6100q2.m31278a(l12, null, null));
                                                    }
                                                    c5641v44 = c5641v43;
                                                }
                                                c5641v44.m29714I(i36, c5454k49);
                                                i36++;
                                                c5641v46 = c5641v44;
                                                m31353t = secureRandom;
                                                c6033j93 = c6033j92;
                                            }
                                        }
                                    }
                                    j12 = m31355u02;
                                    m31060R(this.f34176g);
                                    l11 = (Long) C6077n9.m31158n((C5471l4) c5454k49.m29557k(), "_eid");
                                    if (l11 == null) {
                                    }
                                    Boolean valueOf4 = Boolean.valueOf(z11);
                                    if (m31133q != 1) {
                                    }
                                }
                            }
                            parseLong = 0;
                            long m31355u022 = m31087h0().m31355u0(c5454k49.m29350q(), parseLong);
                            C5471l4 c5471l42 = (C5471l4) c5454k49.m29557k();
                            Long l152 = 1L;
                            long j142 = parseLong;
                            if (!TextUtils.isEmpty("_dbg")) {
                            }
                            C6061m4 c6061m472 = this.f34170a;
                            m31060R(c6061m472);
                            m31133q = c6061m472.m31133q(c6033j93.f34116a.m29956V1(), c5454k49.m29345D());
                            if (m31133q > 0) {
                            }
                        }
                        c6033j92 = c6033j93;
                        c5641v44 = c5641v46;
                        secureRandom = m31353t;
                        i36++;
                        c5641v46 = c5641v44;
                        m31353t = secureRandom;
                        c6033j93 = c6033j92;
                    }
                    C6033j9 c6033j94 = c6033j93;
                    c5641v42 = c5641v46;
                    if (arrayList2.size() < c5641v42.m29732U()) {
                        c5641v42.m29716J0();
                        c5641v42.m29769y0(arrayList2);
                    }
                    for (Map.Entry entry : hashMap.entrySet()) {
                        C6034k c6034k10 = this.f34172c;
                        m31060R(c6034k10);
                        c6034k10.m31010p((C6100q) entry.getValue());
                    }
                    c6033j9 = c6033j94;
                } else {
                    c5641v42 = c5641v46;
                    c6033j9 = c6033j93;
                }
                String m29956V12 = c6033j9.f34116a.m29956V1();
                C6034k c6034k11 = this.f34172c;
                m31060R(c6034k11);
                C6084o5 m30990R2 = c6034k11.m30990R(m29956V12);
                if (m30990R2 == null) {
                    mo31033c().m31197q().m31109b("Bundling raw events w/o app info. appId", C6082o3.m31193z(c6033j9.f34116a.m29956V1()));
                } else if (c5641v42.m29732U() > 0) {
                    long m31234b0 = m30990R2.m31234b0();
                    if (m31234b0 != 0) {
                        c5641v42.m29734W(m31234b0);
                    } else {
                        c5641v42.m29722N0();
                    }
                    long m31238d0 = m30990R2.m31238d0();
                    if (m31238d0 != 0) {
                        m31234b0 = m31238d0;
                    }
                    if (m31234b0 != 0) {
                        c5641v42.m29735X(m31234b0);
                    } else {
                        c5641v42.m29724O0();
                    }
                    m30990R2.m31241f();
                    c5641v42.m29766x((int) m30990R2.m31236c0());
                    m30990R2.m31208D(c5641v42.m29763v0());
                    m30990R2.m31206B(c5641v42.m29761u0());
                    String m31246h0 = m30990R2.m31246h0();
                    if (m31246h0 != null) {
                        c5641v42.m29725P(m31246h0);
                    } else {
                        c5641v42.m29717K0();
                    }
                    C6034k c6034k12 = this.f34172c;
                    m31060R(c6034k12);
                    c6034k12.m31009o(m30990R2);
                }
                if (c5641v42.m29732U() > 0) {
                    this.f34181l.mo31035f();
                    C6061m4 c6061m48 = this.f34170a;
                    m31060R(c6061m48);
                    C5674x3 m31134s = c6061m48.m31134s(c6033j9.f34116a.m29956V1());
                    try {
                        try {
                            if (m31134s != null && m31134s.m30010U()) {
                                c5641v42.m29770z(m31134s.m29998C());
                                c6034k = this.f34172c;
                                m31060R(c6034k);
                                c5658w4 = (C5658w4) c5641v42.m29557k();
                                c6034k.mo31036g();
                                c6034k.m31504h();
                                AbstractC4205o.m19722k(c5658w4);
                                AbstractC4205o.m19718g(c5658w4.m29956V1());
                                AbstractC4205o.m19726o(c5658w4.m29966m1());
                                c6034k.m31005h0();
                                mo105913a = c6034k.f34158a.mo31031a().mo105913a();
                                m29938I1 = c5658w4.m29938I1();
                                c6034k.f34158a.m31401z();
                                if (m29938I1 >= mo105913a - C5990g.m30910h()) {
                                    long m29938I12 = c5658w4.m29938I1();
                                    c6034k.f34158a.m31401z();
                                }
                                c6034k.f34158a.mo31033c().m31202w().m31111d("Storing bundle outside of the max uploading time span. appId, now, timestamp", C6082o3.m31193z(c5658w4.m29956V1()), Long.valueOf(mo105913a), Long.valueOf(c5658w4.m29938I1()));
                                byte[] m29188f = c5658w4.m29188f();
                                C6077n9 c6077n92 = c6034k.f34628b.f34176g;
                                m31060R(c6077n92);
                                byte[] m31177O = c6077n92.m31177O(m29188f);
                                c6034k.f34158a.mo31033c().m31201u().m31109b("Saving bundle, size", Integer.valueOf(m31177O.length));
                                contentValues = new ContentValues();
                                contentValues.put("app_id", c5658w4.m29956V1());
                                contentValues.put("bundle_end_timestamp", Long.valueOf(c5658w4.m29938I1()));
                                contentValues.put("data", m31177O);
                                contentValues.put("has_realtime", Integer.valueOf(i11));
                                if (c5658w4.m29972s1()) {
                                    contentValues.put("retry_count", Integer.valueOf(c5658w4.m29926C1()));
                                }
                                if (c6034k.m30988P().insert("queue", null, contentValues) == -1) {
                                    c6034k.f34158a.mo31033c().m31197q().m31109b("Failed to insert bundle (got -1). appId", C6082o3.m31193z(c5658w4.m29956V1()));
                                }
                            }
                            if (c6034k.m30988P().insert("queue", null, contentValues) == -1) {
                            }
                        } catch (SQLiteException e12) {
                            c6034k.f34158a.mo31033c().m31197q().m31110c("Error storing bundle. appId", C6082o3.m31193z(c5658w4.m29956V1()), e12);
                        }
                        C6077n9 c6077n922 = c6034k.f34628b.f34176g;
                        m31060R(c6077n922);
                        byte[] m31177O2 = c6077n922.m31177O(m29188f);
                        c6034k.f34158a.mo31033c().m31201u().m31109b("Saving bundle, size", Integer.valueOf(m31177O2.length));
                        contentValues = new ContentValues();
                        contentValues.put("app_id", c5658w4.m29956V1());
                        contentValues.put("bundle_end_timestamp", Long.valueOf(c5658w4.m29938I1()));
                        contentValues.put("data", m31177O2);
                        contentValues.put("has_realtime", Integer.valueOf(i11));
                        if (c5658w4.m29972s1()) {
                        }
                    } catch (IOException e13) {
                        c6034k.f34158a.mo31033c().m31197q().m31110c("Data loss. Failed to serialize bundle. appId", C6082o3.m31193z(c5658w4.m29956V1()), e13);
                    }
                    if (c6033j9.f34116a.m29933G().isEmpty()) {
                        c5641v42.m29770z(-1L);
                    } else {
                        mo31033c().m31202w().m31109b("Did not find measurement config or missing version info. appId", C6082o3.m31193z(c6033j9.f34116a.m29956V1()));
                    }
                    c6034k = this.f34172c;
                    m31060R(c6034k);
                    c5658w4 = (C5658w4) c5641v42.m29557k();
                    c6034k.mo31036g();
                    c6034k.m31504h();
                    AbstractC4205o.m19722k(c5658w4);
                    AbstractC4205o.m19718g(c5658w4.m29956V1());
                    AbstractC4205o.m19726o(c5658w4.m29966m1());
                    c6034k.m31005h0();
                    mo105913a = c6034k.f34158a.mo31031a().mo105913a();
                    m29938I1 = c5658w4.m29938I1();
                    c6034k.f34158a.m31401z();
                    if (m29938I1 >= mo105913a - C5990g.m30910h()) {
                    }
                    c6034k.f34158a.mo31033c().m31202w().m31111d("Storing bundle outside of the max uploading time span. appId, now, timestamp", C6082o3.m31193z(c5658w4.m29956V1()), Long.valueOf(mo105913a), Long.valueOf(c5658w4.m29938I1()));
                    byte[] m29188f2 = c5658w4.m29188f();
                }
                C6034k c6034k13 = this.f34172c;
                m31060R(c6034k13);
                List list2 = c6033j9.f34117b;
                AbstractC4205o.m19722k(list2);
                c6034k13.mo31036g();
                c6034k13.m31504h();
                StringBuilder sb2 = new StringBuilder("rowid in (");
                for (int i37 = 0; i37 < list2.size(); i37++) {
                    if (i37 != 0) {
                        sb2.append(",");
                    }
                    sb2.append(((Long) list2.get(i37)).longValue());
                }
                sb2.append(")");
                int delete = c6034k13.m30988P().delete("raw_events", sb2.toString(), null);
                if (delete != list2.size()) {
                    c6034k13.f34158a.mo31033c().m31197q().m31110c("Deleted fewer rows from raw events table than expected", Integer.valueOf(delete), Integer.valueOf(list2.size()));
                }
                C6034k c6034k14 = this.f34172c;
                m31060R(c6034k14);
                try {
                    c6034k14.m30988P().execSQL("delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)", new String[]{m29956V12, m29956V12});
                } catch (SQLiteException e14) {
                    c6034k14.f34158a.mo31033c().m31197q().m31110c("Failed to remove unused event metadata. appId", C6082o3.m31193z(m29956V12), e14);
                }
                C6034k c6034k15 = this.f34172c;
                m31060R(c6034k15);
                c6034k15.m31008n();
                C6034k c6034k16 = this.f34172c;
                m31060R(c6034k16);
                c6034k16.m31003f0();
                return true;
            }
            C6034k c6034k17 = this.f34172c;
            m31060R(c6034k17);
            c6034k17.m31008n();
            C6034k c6034k18 = this.f34172c;
            m31060R(c6034k18);
            c6034k18.m31003f0();
            return false;
        } catch (Throwable th2) {
            C6034k c6034k19 = this.f34172c;
            m31060R(c6034k19);
            c6034k19.m31003f0();
            throw th2;
        }
    }

    /* renamed from: O */
    private final boolean m31057O() {
        mo31037v().mo31036g();
        m31082e();
        C6034k c6034k = this.f34172c;
        m31060R(c6034k);
        if (!c6034k.m31011q()) {
            C6034k c6034k2 = this.f34172c;
            m31060R(c6034k2);
            if (TextUtils.isEmpty(c6034k2.m30997Z())) {
                return false;
            }
            return true;
        }
        return true;
    }

    /* renamed from: P */
    private final boolean m31058P(C5454k4 c5454k4, C5454k4 c5454k42) {
        String m29519H;
        AbstractC4205o.m19712a("_e".equals(c5454k4.m29345D()));
        m31060R(this.f34176g);
        C5539p4 m31157m = C6077n9.m31157m((C5471l4) c5454k4.m29557k(), "_sc");
        String str = null;
        if (m31157m == null) {
            m29519H = null;
        } else {
            m29519H = m31157m.m29519H();
        }
        m31060R(this.f34176g);
        C5539p4 m31157m2 = C6077n9.m31157m((C5471l4) c5454k42.m29557k(), "_pc");
        if (m31157m2 != null) {
            str = m31157m2.m29519H();
        }
        if (str != null && str.equals(m29519H)) {
            AbstractC4205o.m19712a("_e".equals(c5454k4.m29345D()));
            m31060R(this.f34176g);
            C5539p4 m31157m3 = C6077n9.m31157m((C5471l4) c5454k4.m29557k(), "_et");
            if (m31157m3 != null && m31157m3.m29523W() && m31157m3.m29517D() > 0) {
                long m29517D = m31157m3.m29517D();
                m31060R(this.f34176g);
                C5539p4 m31157m4 = C6077n9.m31157m((C5471l4) c5454k42.m29557k(), "_et");
                if (m31157m4 != null && m31157m4.m29517D() > 0) {
                    m29517D += m31157m4.m29517D();
                }
                m31060R(this.f34176g);
                C6077n9.m31155P(c5454k42, "_et", Long.valueOf(m29517D));
                m31060R(this.f34176g);
                C6077n9.m31155P(c5454k4, "_fr", 1L);
                return true;
            }
            return true;
        }
        return false;
    }

    /* renamed from: Q */
    private static final boolean m31059Q(zzq zzqVar) {
        if (TextUtils.isEmpty(zzqVar.f34703q) && TextUtils.isEmpty(zzqVar.f34692F)) {
            return false;
        }
        return true;
    }

    /* renamed from: R */
    private static final AbstractC6208z8 m31060R(AbstractC6208z8 abstractC6208z8) {
        if (abstractC6208z8 != null) {
            if (abstractC6208z8.m31506j()) {
                return abstractC6208z8;
            }
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(abstractC6208z8.getClass())));
        }
        throw new IllegalStateException("Upload Component not created");
    }

    /* renamed from: f0 */
    public static C6055l9 m31062f0(Context context) {
        AbstractC4205o.m19722k(context);
        AbstractC4205o.m19722k(context.getApplicationContext());
        if (f34164F == null) {
            synchronized (C6055l9.class) {
                try {
                    if (f34164F == null) {
                        f34164F = new C6055l9((C6066m9) AbstractC4205o.m19722k(new C6066m9(context)), null);
                    }
                } finally {
                }
            }
        }
        return f34164F;
    }

    /* renamed from: k0 */
    public static /* bridge */ /* synthetic */ void m31063k0(C6055l9 c6055l9, C6066m9 c6066m9) {
        c6055l9.mo31037v().mo31036g();
        c6055l9.f34180k = new C5984f4(c6055l9);
        C6034k c6034k = new C6034k(c6055l9);
        c6034k.m31505i();
        c6055l9.f34172c = c6034k;
        c6055l9.m31072U().m30935z((InterfaceC5979f) AbstractC4205o.m19722k(c6055l9.f34170a));
        C5999g8 c5999g8 = new C5999g8(c6055l9);
        c5999g8.m31505i();
        c6055l9.f34178i = c5999g8;
        C5933b c5933b = new C5933b(c6055l9);
        c5933b.m31505i();
        c6055l9.f34175f = c5933b;
        C6173w6 c6173w6 = new C6173w6(c6055l9);
        c6173w6.m31505i();
        c6055l9.f34177h = c6173w6;
        C6186x8 c6186x8 = new C6186x8(c6055l9);
        c6186x8.m31505i();
        c6055l9.f34174e = c6186x8;
        c6055l9.f34173d = new C6170w3(c6055l9);
        if (c6055l9.f34186q != c6055l9.f34187r) {
            c6055l9.mo31033c().m31197q().m31110c("Not all upload components initialized", Integer.valueOf(c6055l9.f34186q), Integer.valueOf(c6055l9.f34187r));
        }
        c6055l9.f34182m = true;
    }

    /* renamed from: A */
    public final void m31064A(String str, C20307b c20307b) {
        mo31037v().mo31036g();
        m31082e();
        this.f34165A.put(str, c20307b);
        C6034k c6034k = this.f34172c;
        m31060R(c6034k);
        AbstractC4205o.m19722k(str);
        AbstractC4205o.m19722k(c20307b);
        c6034k.mo31036g();
        c6034k.m31504h();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", c20307b.m106013h());
        try {
            if (c6034k.m30988P().insertWithOnConflict("consent_settings", null, contentValues, 5) == -1) {
                c6034k.f34158a.mo31033c().m31197q().m31109b("Failed to insert/update consent setting (got -1). appId", C6082o3.m31193z(str));
            }
        } catch (SQLiteException e11) {
            c6034k.f34158a.mo31033c().m31197q().m31110c("Error storing consent setting. appId, error", C6082o3.m31193z(str), e11);
        }
    }

    /* renamed from: B */
    public final void m31065B(zzli zzliVar, zzq zzqVar) {
        long j11;
        int i11;
        int i12;
        mo31037v().mo31036g();
        m31082e();
        if (!m31059Q(zzqVar)) {
            return;
        }
        if (!zzqVar.f34709w) {
            m31070S(zzqVar);
            return;
        }
        int m31348p0 = m31087h0().m31348p0(zzliVar.f34681q);
        if (m31348p0 != 0) {
            C6121r9 m31087h0 = m31087h0();
            String str = zzliVar.f34681q;
            m31072U();
            String m31349q = m31087h0.m31349q(str, 24, true);
            String str2 = zzliVar.f34681q;
            if (str2 != null) {
                i12 = str2.length();
            } else {
                i12 = 0;
            }
            m31087h0().m31317C(this.f34169E, zzqVar.f34702p, m31348p0, "_ev", m31349q, i12);
            return;
        }
        int m31341l0 = m31087h0().m31341l0(zzliVar.f34681q, zzliVar.m31514t());
        if (m31341l0 != 0) {
            C6121r9 m31087h02 = m31087h0();
            String str3 = zzliVar.f34681q;
            m31072U();
            String m31349q2 = m31087h02.m31349q(str3, 24, true);
            Object m31514t = zzliVar.m31514t();
            if (m31514t == null || (!(m31514t instanceof String) && !(m31514t instanceof CharSequence))) {
                i11 = 0;
            } else {
                i11 = m31514t.toString().length();
            }
            m31087h0().m31317C(this.f34169E, zzqVar.f34702p, m31341l0, "_ev", m31349q2, i11);
            return;
        }
        Object m31345o = m31087h0().m31345o(zzliVar.f34681q, zzliVar.m31514t());
        if (m31345o == null) {
            return;
        }
        if ("_sid".equals(zzliVar.f34681q)) {
            long j12 = zzliVar.f34682r;
            String str4 = zzliVar.f34685u;
            String str5 = (String) AbstractC4205o.m19722k(zzqVar.f34702p);
            C6034k c6034k = this.f34172c;
            m31060R(c6034k);
            C6099p9 m30995X = c6034k.m30995X(str5, "_sno");
            if (m30995X != null) {
                Object obj = m30995X.f34342e;
                if (obj instanceof Long) {
                    j11 = ((Long) obj).longValue();
                    m31065B(new zzli("_sno", j12, Long.valueOf(j11 + 1), str4), zzqVar);
                }
            }
            if (m30995X != null) {
                mo31033c().m31202w().m31109b("Retrieved last session number from database does not contain a valid (long) value", m30995X.f34342e);
            }
            C6034k c6034k2 = this.f34172c;
            m31060R(c6034k2);
            C6100q m30994V = c6034k2.m30994V(str5, "_s");
            if (m30994V != null) {
                j11 = m30994V.f34345c;
                mo31033c().m31201u().m31109b("Backfill the session number. Last used session number", Long.valueOf(j11));
            } else {
                j11 = 0;
            }
            m31065B(new zzli("_sno", j12, Long.valueOf(j11 + 1), str4), zzqVar);
        }
        C6099p9 c6099p9 = new C6099p9((String) AbstractC4205o.m19722k(zzqVar.f34702p), (String) AbstractC4205o.m19722k(zzliVar.f34685u), zzliVar.f34681q, zzliVar.f34682r, m31345o);
        mo31033c().m31201u().m31110c("Setting user property", this.f34181l.m31372D().m30966f(c6099p9.f34340c), m31345o);
        C6034k c6034k3 = this.f34172c;
        m31060R(c6034k3);
        c6034k3.m31002e0();
        try {
            if ("_id".equals(c6099p9.f34340c)) {
                C6034k c6034k4 = this.f34172c;
                m31060R(c6034k4);
                C6099p9 m30995X2 = c6034k4.m30995X(zzqVar.f34702p, "_id");
                if (m30995X2 != null && !c6099p9.f34342e.equals(m30995X2.f34342e)) {
                    C6034k c6034k5 = this.f34172c;
                    m31060R(c6034k5);
                    c6034k5.m31006l(zzqVar.f34702p, "_lair");
                }
            }
            m31070S(zzqVar);
            C6034k c6034k6 = this.f34172c;
            m31060R(c6034k6);
            boolean m31017x = c6034k6.m31017x(c6099p9);
            C6034k c6034k7 = this.f34172c;
            m31060R(c6034k7);
            c6034k7.m31008n();
            if (!m31017x) {
                mo31033c().m31197q().m31110c("Too many unique user properties are set. Ignoring user property", this.f34181l.m31372D().m30966f(c6099p9.f34340c), c6099p9.f34342e);
                m31087h0().m31317C(this.f34169E, zzqVar.f34702p, 9, null, null, 0);
            }
            C6034k c6034k8 = this.f34172c;
            m31060R(c6034k8);
            c6034k8.m31003f0();
        } catch (Throwable th2) {
            C6034k c6034k9 = this.f34172c;
            m31060R(c6034k9);
            c6034k9.m31003f0();
            throw th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:242:0x0522, code lost:            if (r3 == null) goto L487;     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x012e, code lost:            if (r11 == null) goto L339;     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:234:0x052b A[Catch: all -> 0x0034, TryCatch #12 {all -> 0x0034, blocks: (B:3:0x0010, B:5:0x0021, B:10:0x0038, B:12:0x003e, B:14:0x004e, B:16:0x0056, B:18:0x005c, B:20:0x0067, B:22:0x0077, B:24:0x0082, B:26:0x0095, B:28:0x00b4, B:30:0x00ba, B:32:0x00bd, B:34:0x00c9, B:35:0x00e0, B:37:0x00f1, B:39:0x00f7, B:45:0x010c, B:46:0x0131, B:56:0x0136, B:57:0x0139, B:62:0x013a, B:65:0x0162, B:68:0x016a, B:76:0x01a4, B:78:0x02ae, B:80:0x02b4, B:82:0x02c0, B:83:0x02c4, B:85:0x02ca, B:88:0x02de, B:91:0x02e7, B:93:0x02ed, B:97:0x0312, B:98:0x0302, B:101:0x030c, B:107:0x0315, B:109:0x0330, B:112:0x033f, B:114:0x0363, B:116:0x039d, B:118:0x03a2, B:120:0x03aa, B:121:0x03ad, B:123:0x03b2, B:124:0x03b5, B:126:0x03c1, B:128:0x03d7, B:131:0x03df, B:133:0x03f0, B:134:0x0401, B:136:0x0416, B:138:0x0423, B:139:0x0438, B:141:0x0443, B:142:0x044c, B:144:0x0431, B:145:0x049c, B:171:0x0280, B:193:0x02ab, B:210:0x04b4, B:211:0x04b7, B:223:0x04b8, B:230:0x04f8, B:232:0x0525, B:234:0x052b, B:236:0x0536, B:239:0x0506, B:249:0x0541, B:250:0x0544), top: B:2:0x0010, inners: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0136 A[Catch: all -> 0x0034, TryCatch #12 {all -> 0x0034, blocks: (B:3:0x0010, B:5:0x0021, B:10:0x0038, B:12:0x003e, B:14:0x004e, B:16:0x0056, B:18:0x005c, B:20:0x0067, B:22:0x0077, B:24:0x0082, B:26:0x0095, B:28:0x00b4, B:30:0x00ba, B:32:0x00bd, B:34:0x00c9, B:35:0x00e0, B:37:0x00f1, B:39:0x00f7, B:45:0x010c, B:46:0x0131, B:56:0x0136, B:57:0x0139, B:62:0x013a, B:65:0x0162, B:68:0x016a, B:76:0x01a4, B:78:0x02ae, B:80:0x02b4, B:82:0x02c0, B:83:0x02c4, B:85:0x02ca, B:88:0x02de, B:91:0x02e7, B:93:0x02ed, B:97:0x0312, B:98:0x0302, B:101:0x030c, B:107:0x0315, B:109:0x0330, B:112:0x033f, B:114:0x0363, B:116:0x039d, B:118:0x03a2, B:120:0x03aa, B:121:0x03ad, B:123:0x03b2, B:124:0x03b5, B:126:0x03c1, B:128:0x03d7, B:131:0x03df, B:133:0x03f0, B:134:0x0401, B:136:0x0416, B:138:0x0423, B:139:0x0438, B:141:0x0443, B:142:0x044c, B:144:0x0431, B:145:0x049c, B:171:0x0280, B:193:0x02ab, B:210:0x04b4, B:211:0x04b7, B:223:0x04b8, B:230:0x04f8, B:232:0x0525, B:234:0x052b, B:236:0x0536, B:239:0x0506, B:249:0x0541, B:250:0x0544), top: B:2:0x0010, inners: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02b4 A[Catch: all -> 0x0034, TryCatch #12 {all -> 0x0034, blocks: (B:3:0x0010, B:5:0x0021, B:10:0x0038, B:12:0x003e, B:14:0x004e, B:16:0x0056, B:18:0x005c, B:20:0x0067, B:22:0x0077, B:24:0x0082, B:26:0x0095, B:28:0x00b4, B:30:0x00ba, B:32:0x00bd, B:34:0x00c9, B:35:0x00e0, B:37:0x00f1, B:39:0x00f7, B:45:0x010c, B:46:0x0131, B:56:0x0136, B:57:0x0139, B:62:0x013a, B:65:0x0162, B:68:0x016a, B:76:0x01a4, B:78:0x02ae, B:80:0x02b4, B:82:0x02c0, B:83:0x02c4, B:85:0x02ca, B:88:0x02de, B:91:0x02e7, B:93:0x02ed, B:97:0x0312, B:98:0x0302, B:101:0x030c, B:107:0x0315, B:109:0x0330, B:112:0x033f, B:114:0x0363, B:116:0x039d, B:118:0x03a2, B:120:0x03aa, B:121:0x03ad, B:123:0x03b2, B:124:0x03b5, B:126:0x03c1, B:128:0x03d7, B:131:0x03df, B:133:0x03f0, B:134:0x0401, B:136:0x0416, B:138:0x0423, B:139:0x0438, B:141:0x0443, B:142:0x044c, B:144:0x0431, B:145:0x049c, B:171:0x0280, B:193:0x02ab, B:210:0x04b4, B:211:0x04b7, B:223:0x04b8, B:230:0x04f8, B:232:0x0525, B:234:0x052b, B:236:0x0536, B:239:0x0506, B:249:0x0541, B:250:0x0544), top: B:2:0x0010, inners: #8 }] */
    /* renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m31066C() {
        Cursor cursor;
        Cursor cursor2;
        String str;
        boolean z11;
        boolean z12;
        Cursor cursor3;
        long j11;
        Cursor cursor4;
        List emptyList;
        boolean z13;
        String str2;
        String str3;
        byte[] byteArray;
        Cursor cursor5;
        mo31037v().mo31036g();
        m31082e();
        int i11 = 1;
        this.f34190u = true;
        int i12 = 0;
        try {
            this.f34181l.mo31035f();
            Boolean m30871J = this.f34181l.m31379L().m30871J();
            if (m30871J == null) {
                mo31033c().m31202w().m31108a("Upload data called on the client side before use of service was decided");
                this.f34190u = false;
            } else if (m30871J.booleanValue()) {
                mo31033c().m31197q().m31108a("Upload called in the client side when service should be used");
                this.f34190u = false;
            } else if (this.f34184o > 0) {
                m31055M();
                this.f34190u = false;
            } else {
                mo31037v().mo31036g();
                if (this.f34193x != null) {
                    mo31033c().m31201u().m31108a("Uploading requested multiple times");
                    this.f34190u = false;
                } else {
                    C6137t3 c6137t3 = this.f34171b;
                    m31060R(c6137t3);
                    if (!c6137t3.m31451l()) {
                        mo31033c().m31201u().m31108a("Network not connected, ignoring upload request");
                        m31055M();
                        this.f34190u = false;
                    } else {
                        long mo105913a = mo31031a().mo105913a();
                        Cursor cursor6 = null;
                        int m30924n = m31072U().m30924n(null, AbstractC5972e3.f33900T);
                        m31072U();
                        long m30909I = mo105913a - C5990g.m30909I();
                        for (int i13 = 0; i13 < m30924n && m31056N(null, m30909I); i13++) {
                        }
                        long m31502a = this.f34178i.f34041g.m31502a();
                        if (m31502a != 0) {
                            mo31033c().m31196p().m31109b("Uploading events. Elapsed time since last upload attempt (ms)", Long.valueOf(Math.abs(mo105913a - m31502a)));
                        }
                        C6034k c6034k = this.f34172c;
                        m31060R(c6034k);
                        String m30997Z = c6034k.m30997Z();
                        long j12 = -1;
                        if (!TextUtils.isEmpty(m30997Z)) {
                            if (this.f34195z == -1) {
                                C6034k c6034k2 = this.f34172c;
                                m31060R(c6034k2);
                                try {
                                    cursor5 = c6034k2.m30988P().rawQuery("select rowid from raw_events order by rowid desc limit 1;", null);
                                } catch (SQLiteException e11) {
                                    e = e11;
                                    cursor5 = null;
                                } catch (Throwable th2) {
                                    th = th2;
                                    if (cursor6 != null) {
                                    }
                                    throw th;
                                }
                                try {
                                    try {
                                        if (cursor5.moveToFirst()) {
                                            j12 = cursor5.getLong(0);
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        cursor6 = cursor5;
                                        if (cursor6 != null) {
                                            cursor6.close();
                                        }
                                        throw th;
                                    }
                                } catch (SQLiteException e12) {
                                    e = e12;
                                    c6034k2.f34158a.mo31033c().m31197q().m31109b("Error querying raw events", e);
                                }
                                cursor5.close();
                                this.f34195z = j12;
                            }
                            int m30924n2 = m31072U().m30924n(m30997Z, AbstractC5972e3.f33923i);
                            int max = Math.max(0, m31072U().m30924n(m30997Z, AbstractC5972e3.f33925j));
                            C6034k c6034k3 = this.f34172c;
                            m31060R(c6034k3);
                            c6034k3.mo31036g();
                            c6034k3.m31504h();
                            if (m30924n2 > 0) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            AbstractC4205o.m19712a(z11);
                            if (max > 0) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            AbstractC4205o.m19712a(z12);
                            AbstractC4205o.m19718g(m30997Z);
                            try {
                                cursor4 = c6034k3.m30988P().query("queue", new String[]{"rowid", "data", "retry_count"}, "app_id=?", new String[]{m30997Z}, null, null, "rowid", String.valueOf(m30924n2));
                            } catch (SQLiteException e13) {
                                e = e13;
                                j11 = mo105913a;
                                cursor4 = null;
                            } catch (Throwable th4) {
                                th = th4;
                                cursor3 = null;
                            }
                            try {
                                try {
                                    if (!cursor4.moveToFirst()) {
                                        emptyList = Collections.emptyList();
                                        cursor4.close();
                                        j11 = mo105913a;
                                    } else {
                                        ArrayList arrayList = new ArrayList();
                                        int i14 = 0;
                                        while (true) {
                                            long j13 = cursor4.getLong(i12);
                                            try {
                                                byte[] blob = cursor4.getBlob(i11);
                                                C6077n9 c6077n9 = c6034k3.f34628b.f34176g;
                                                m31060R(c6077n9);
                                                try {
                                                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(blob);
                                                    GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                                                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                                    byte[] bArr = new byte[1024];
                                                    j11 = mo105913a;
                                                    while (true) {
                                                        try {
                                                            try {
                                                                int read = gZIPInputStream.read(bArr);
                                                                if (read <= 0) {
                                                                    break;
                                                                } else {
                                                                    byteArrayOutputStream.write(bArr, 0, read);
                                                                }
                                                            } catch (IOException e14) {
                                                                e = e14;
                                                                try {
                                                                    c6077n9.f34158a.mo31033c().m31197q().m31109b("Failed to ungzip content", e);
                                                                    throw e;
                                                                    break;
                                                                } catch (IOException e15) {
                                                                    e = e15;
                                                                    c6034k3.f34158a.mo31033c().m31197q().m31110c("Failed to unzip queued bundle. appId", C6082o3.m31193z(m30997Z), e);
                                                                    if (cursor4.moveToNext()) {
                                                                        break;
                                                                    }
                                                                    mo105913a = j11;
                                                                    i11 = 1;
                                                                    i12 = 0;
                                                                    cursor4.close();
                                                                    emptyList = arrayList;
                                                                    if (!emptyList.isEmpty()) {
                                                                    }
                                                                    this.f34190u = false;
                                                                    m31053K();
                                                                }
                                                            }
                                                        } catch (SQLiteException e16) {
                                                            e = e16;
                                                            c6034k3.f34158a.mo31033c().m31197q().m31110c("Error querying bundles. appId", C6082o3.m31193z(m30997Z), e);
                                                            emptyList = Collections.emptyList();
                                                            if (cursor4 != null) {
                                                                cursor4.close();
                                                            }
                                                            if (!emptyList.isEmpty()) {
                                                            }
                                                            this.f34190u = false;
                                                            m31053K();
                                                        }
                                                    }
                                                    gZIPInputStream.close();
                                                    byteArrayInputStream.close();
                                                    byteArray = byteArrayOutputStream.toByteArray();
                                                } catch (IOException e17) {
                                                    e = e17;
                                                    j11 = mo105913a;
                                                }
                                            } catch (IOException e18) {
                                                e = e18;
                                                j11 = mo105913a;
                                            }
                                            if (!arrayList.isEmpty() && byteArray.length + i14 > max) {
                                                break;
                                            }
                                            try {
                                                C5641v4 c5641v4 = (C5641v4) C6077n9.m31151C(C5658w4.m29872R1(), byteArray);
                                                if (!cursor4.isNull(2)) {
                                                    c5641v4.m29738b0(cursor4.getInt(2));
                                                }
                                                i14 += byteArray.length;
                                                arrayList.add(Pair.create((C5658w4) c5641v4.m29557k(), Long.valueOf(j13)));
                                            } catch (IOException e19) {
                                                c6034k3.f34158a.mo31033c().m31197q().m31110c("Failed to merge queued bundle. appId", C6082o3.m31193z(m30997Z), e19);
                                            }
                                            if (cursor4.moveToNext() || i14 > max) {
                                                break;
                                                break;
                                            } else {
                                                mo105913a = j11;
                                                i11 = 1;
                                                i12 = 0;
                                            }
                                        }
                                        cursor4.close();
                                        emptyList = arrayList;
                                    }
                                } catch (SQLiteException e21) {
                                    e = e21;
                                    j11 = mo105913a;
                                }
                                if (!emptyList.isEmpty()) {
                                    if (m31073V(m30997Z).m106014i(EnumC20305a.AD_STORAGE)) {
                                        Iterator it = emptyList.iterator();
                                        while (true) {
                                            if (it.hasNext()) {
                                                C5658w4 c5658w4 = (C5658w4) ((Pair) it.next()).first;
                                                if (!c5658w4.m29942L().isEmpty()) {
                                                    str3 = c5658w4.m29942L();
                                                    break;
                                                }
                                            } else {
                                                str3 = null;
                                                break;
                                            }
                                        }
                                        if (str3 != null) {
                                            int i15 = 0;
                                            while (true) {
                                                if (i15 >= emptyList.size()) {
                                                    break;
                                                }
                                                C5658w4 c5658w42 = (C5658w4) ((Pair) emptyList.get(i15)).first;
                                                if (!c5658w42.m29942L().isEmpty() && !c5658w42.m29942L().equals(str3)) {
                                                    emptyList = emptyList.subList(0, i15);
                                                    break;
                                                }
                                                i15++;
                                            }
                                        }
                                    }
                                    C5607t4 m29671A = C5624u4.m29671A();
                                    int size = emptyList.size();
                                    ArrayList arrayList2 = new ArrayList(emptyList.size());
                                    if (m31072U().m30914C(m30997Z) && m31073V(m30997Z).m106014i(EnumC20305a.AD_STORAGE)) {
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    boolean m106014i = m31073V(m30997Z).m106014i(EnumC20305a.AD_STORAGE);
                                    boolean m106014i2 = m31073V(m30997Z).m106014i(EnumC20305a.ANALYTICS_STORAGE);
                                    C5617te.m29656b();
                                    boolean m30913B = m31072U().m30913B(m30997Z, AbstractC5972e3.f33940q0);
                                    int i16 = 0;
                                    while (i16 < size) {
                                        C5641v4 c5641v42 = (C5641v4) ((C5658w4) ((Pair) emptyList.get(i16)).first).m29649i();
                                        arrayList2.add((Long) ((Pair) emptyList.get(i16)).second);
                                        m31072U().m30926p();
                                        c5641v42.m29745j0(76003L);
                                        long j14 = j11;
                                        c5641v42.m29744h0(j14);
                                        this.f34181l.mo31035f();
                                        c5641v42.m29739c0(false);
                                        if (!z13) {
                                            c5641v42.m29715I0();
                                        }
                                        if (!m106014i) {
                                            c5641v42.m29726P0();
                                            c5641v42.m29719L0();
                                        }
                                        if (!m106014i2) {
                                            c5641v42.m29709F0();
                                        }
                                        m31084g(m30997Z, c5641v42);
                                        if (!m30913B) {
                                            c5641v42.m29727Q0();
                                        }
                                        if (m31072U().m30913B(m30997Z, AbstractC5972e3.f33904X)) {
                                            byte[] m29188f = ((C5658w4) c5641v42.m29557k()).m29188f();
                                            C6077n9 c6077n92 = this.f34176g;
                                            m31060R(c6077n92);
                                            c5641v42.m29768y(c6077n92.m31178x(m29188f));
                                        }
                                        m29671A.m29608o(c5641v42);
                                        i16++;
                                        j11 = j14;
                                    }
                                    long j15 = j11;
                                    if (Log.isLoggable(mo31033c().m31194D(), 2)) {
                                        C6077n9 c6077n93 = this.f34176g;
                                        m31060R(c6077n93);
                                        str2 = c6077n93.m31169D((C5624u4) m29671A.m29557k());
                                    } else {
                                        str2 = null;
                                    }
                                    m31060R(this.f34176g);
                                    byte[] m29188f2 = ((C5624u4) m29671A.m29557k()).m29188f();
                                    C5931a9 m30806h = this.f34179j.m30806h(m30997Z);
                                    try {
                                        AbstractC4205o.m19712a(!arrayList2.isEmpty());
                                        if (this.f34193x != null) {
                                            mo31033c().m31197q().m31108a("Set uploading progress before finishing the previous upload");
                                        } else {
                                            this.f34193x = new ArrayList(arrayList2);
                                        }
                                        this.f34178i.f34042h.m31503b(j15);
                                        String str4 = "?";
                                        if (size > 0) {
                                            str4 = m29671A.m29609p(0).m29956V1();
                                        }
                                        mo31033c().m31201u().m31111d("Uploading data. app, uncompressed size, data", str4, Integer.valueOf(m29188f2.length), str2);
                                        this.f34189t = true;
                                        C6137t3 c6137t32 = this.f34171b;
                                        m31060R(c6137t32);
                                        URL url = new URL(m30806h.m30793a());
                                        Map m30794b = m30806h.m30794b();
                                        C5967d9 c5967d9 = new C5967d9(this, m30997Z);
                                        c6137t32.mo31036g();
                                        c6137t32.m31504h();
                                        AbstractC4205o.m19722k(url);
                                        AbstractC4205o.m19722k(m29188f2);
                                        AbstractC4205o.m19722k(c5967d9);
                                        c6137t32.f34158a.mo31037v().m31295y(new RunnableC6126s3(c6137t32, m30997Z, url, m29188f2, m30794b, c5967d9));
                                    } catch (MalformedURLException unused) {
                                        mo31033c().m31197q().m31110c("Failed to parse upload URL. Not uploading. appId", C6082o3.m31193z(m30997Z), m30806h.m30793a());
                                    }
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                cursor3 = cursor4;
                                if (cursor3 != null) {
                                    cursor3.close();
                                }
                                throw th;
                            }
                        } else {
                            try {
                                this.f34195z = -1L;
                                C6034k c6034k4 = this.f34172c;
                                m31060R(c6034k4);
                                m31072U();
                                long m30909I2 = mo105913a - C5990g.m30909I();
                                c6034k4.mo31036g();
                                c6034k4.m31504h();
                                try {
                                    cursor2 = c6034k4.m30988P().rawQuery("select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;", new String[]{String.valueOf(m30909I2)});
                                } catch (SQLiteException e22) {
                                    e = e22;
                                    cursor2 = null;
                                } catch (Throwable th6) {
                                    th = th6;
                                    cursor = null;
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    throw th;
                                }
                                try {
                                } catch (SQLiteException e23) {
                                    e = e23;
                                    c6034k4.f34158a.mo31033c().m31197q().m31109b("Error selecting expired configs", e);
                                }
                                if (!cursor2.moveToFirst()) {
                                    c6034k4.f34158a.mo31033c().m31201u().m31108a("No expired configs for apps with pending events");
                                    cursor2.close();
                                    str = null;
                                    if (!TextUtils.isEmpty(str)) {
                                        C6034k c6034k5 = this.f34172c;
                                        m31060R(c6034k5);
                                        C6084o5 m30990R = c6034k5.m30990R(str);
                                        if (m30990R != null) {
                                            m31086h(m30990R);
                                        }
                                    }
                                } else {
                                    str = cursor2.getString(0);
                                    cursor2.close();
                                    if (!TextUtils.isEmpty(str)) {
                                    }
                                }
                            } catch (Throwable th7) {
                                th = th7;
                                cursor = null;
                            }
                        }
                        this.f34190u = false;
                    }
                }
            }
            m31053K();
        } catch (Throwable th8) {
            this.f34190u = false;
            m31053K();
            throw th8;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(21:307|(2:309|(7:311|312|(1:314)|58|(0)(0)|61|(0)(0)))|315|316|317|318|319|320|321|322|323|324|325|326|327|312|(0)|58|(0)(0)|61|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(55:270|271|272|109|(0)|112|(0)(0)|121|(0)|124|(0)|127|(0)|130|(2:132|136)|137|(0)|140|(0)|143|(2:145|147)|148|(0)|151|(0)(0)|(34:155|157|(1:158)|265|172|(0)|(0)|177|(0)|188|(0)|191|(0)|196|(0)|202|(0)|207|(0)|210|(1:211)|215|216|217|218|219|(3:220|(0)(0)|224)|227|228|229|(0)(0)|232|233|234)|266|(0)|177|(0)|188|(0)|191|(0)|196|(0)|202|(0)|207|(0)|210|(1:211)|215|216|217|218|219|(3:220|(0)(0)|224)|227|228|229|(0)(0)|232|233|234) */
    /* JADX WARN: Can't wrap try/catch for region: R(59:(2:70|(5:72|(1:74)|75|76|77))|78|(2:80|(5:82|(1:84)|85|86|87))|88|89|(1:91)|92|(2:94|(1:98))|99|100|101|102|103|104|105|106|107|108|109|(1:111)|112|(2:114|(1:120)(3:117|118|119))(1:268)|121|(1:123)|124|(1:126)|127|(1:129)|130|(1:136)|137|(1:139)|140|(1:142)|143|(1:147)|148|(1:150)|151|(1:153)(1:267)|(12:(33:157|(4:160|(3:162|163|(3:165|166|(3:168|169|171)(1:257))(1:259))(1:264)|258|158)|265|172|(1:174)|(1:176)|177|(2:181|(2:185|(1:187)))|188|(1:190)|191|(2:193|(1:195))|196|(3:198|(1:200)|201)|202|(1:206)|207|(1:209)|210|(3:213|214|211)|215|216|217|218|219|(2:220|(2:222|(1:225)(1:224))(3:241|242|(1:247)(1:246)))|227|228|229|(1:231)(2:236|237)|232|233|234)|217|218|219|(3:220|(0)(0)|224)|227|228|229|(0)(0)|232|233|234)|266|(0)|177|(3:179|181|(3:183|185|(0)))|188|(0)|191|(0)|196|(0)|202|(2:204|206)|207|(0)|210|(1:211)|215|216) */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x09da, code lost:            r13 = 1;     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x0a95, code lost:            r0 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x0a9d, code lost:            r3.f34158a.mo31033c().m31197q().m31110c("Error storing raw event. appId", com.google.android.gms.measurement.internal.C6082o3.m31193z(r7.f34311a), r0);     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x0ab3, code lost:            r0 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x0ad0, code lost:            mo31033c().m31197q().m31110c("Data loss. Failed to insert raw event metadata. appId", com.google.android.gms.measurement.internal.C6082o3.m31193z(r4.m29749n0()), r0);     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x02f8, code lost:            r0 = e;     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x030c, code lost:            r12.f34158a.mo31033c().m31197q().m31110c("Error pruning currencies. appId", com.google.android.gms.measurement.internal.C6082o3.m31193z(r10), r0);     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x02fb, code lost:            r0 = e;     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x02fc, code lost:            r32 = "app_id";     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x0304, code lost:            r0 = e;     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x0305, code lost:            r31 = "metadata_fingerprint";        r32 = "app_id";        r18 = r18;     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0573 A[Catch: all -> 0x01c4, TryCatch #2 {all -> 0x01c4, blocks: (B:45:0x019f, B:48:0x01ae, B:50:0x01b8, B:53:0x01c8, B:58:0x0373, B:61:0x03a8, B:63:0x03e8, B:65:0x03ed, B:66:0x0404, B:70:0x0417, B:72:0x042e, B:74:0x0435, B:75:0x044c, B:80:0x0476, B:84:0x0497, B:85:0x04ae, B:88:0x04bf, B:91:0x04dc, B:92:0x04f0, B:94:0x04fa, B:96:0x0507, B:98:0x050d, B:99:0x0516, B:101:0x0524, B:104:0x0539, B:107:0x0549, B:111:0x0573, B:112:0x0588, B:114:0x05b4, B:117:0x05cc, B:120:0x060f, B:121:0x063b, B:123:0x0678, B:124:0x067d, B:126:0x0685, B:127:0x068a, B:129:0x0692, B:130:0x0697, B:132:0x06a2, B:134:0x06ae, B:136:0x06bc, B:137:0x06c1, B:139:0x06ca, B:140:0x06ce, B:142:0x06db, B:143:0x06e0, B:145:0x0707, B:147:0x070f, B:148:0x0714, B:150:0x071c, B:151:0x071f, B:153:0x0743, B:155:0x074e, B:157:0x0757, B:158:0x0770, B:160:0x0776, B:163:0x078a, B:166:0x0796, B:169:0x07a3, B:262:0x07bd, B:172:0x07cd, B:176:0x07d6, B:177:0x07d9, B:179:0x07f7, B:181:0x07fb, B:183:0x080d, B:185:0x0811, B:187:0x081c, B:188:0x0825, B:190:0x086b, B:191:0x0870, B:193:0x0878, B:195:0x0881, B:196:0x0884, B:198:0x0891, B:200:0x08b1, B:201:0x08be, B:202:0x08f4, B:204:0x08fc, B:206:0x0906, B:207:0x0913, B:209:0x091d, B:210:0x092a, B:211:0x0936, B:213:0x093c, B:216:0x096c, B:218:0x09b2, B:219:0x09bc, B:220:0x09c8, B:222:0x09ce, B:227:0x0a20, B:229:0x0a70, B:231:0x0a7f, B:232:0x0ae5, B:237:0x0a9a, B:240:0x0a9d, B:242:0x09df, B:244:0x0a0b, B:251:0x0ab8, B:252:0x0acf, B:256:0x0ad0, B:267:0x0748, B:268:0x062d, B:272:0x055b, B:279:0x0389, B:280:0x0390, B:282:0x0396, B:285:0x03a2, B:290:0x01df, B:293:0x01eb, B:295:0x0202, B:300:0x021b, B:303:0x0259, B:305:0x025f, B:307:0x026d, B:309:0x027e, B:311:0x0289, B:312:0x0338, B:314:0x0343, B:316:0x02bc, B:318:0x02d6, B:323:0x02e1, B:326:0x02ea, B:327:0x031f, B:331:0x030c, B:339:0x0229, B:342:0x024f), top: B:44:0x019f, inners: #4, #6, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x05b4 A[Catch: all -> 0x01c4, TryCatch #2 {all -> 0x01c4, blocks: (B:45:0x019f, B:48:0x01ae, B:50:0x01b8, B:53:0x01c8, B:58:0x0373, B:61:0x03a8, B:63:0x03e8, B:65:0x03ed, B:66:0x0404, B:70:0x0417, B:72:0x042e, B:74:0x0435, B:75:0x044c, B:80:0x0476, B:84:0x0497, B:85:0x04ae, B:88:0x04bf, B:91:0x04dc, B:92:0x04f0, B:94:0x04fa, B:96:0x0507, B:98:0x050d, B:99:0x0516, B:101:0x0524, B:104:0x0539, B:107:0x0549, B:111:0x0573, B:112:0x0588, B:114:0x05b4, B:117:0x05cc, B:120:0x060f, B:121:0x063b, B:123:0x0678, B:124:0x067d, B:126:0x0685, B:127:0x068a, B:129:0x0692, B:130:0x0697, B:132:0x06a2, B:134:0x06ae, B:136:0x06bc, B:137:0x06c1, B:139:0x06ca, B:140:0x06ce, B:142:0x06db, B:143:0x06e0, B:145:0x0707, B:147:0x070f, B:148:0x0714, B:150:0x071c, B:151:0x071f, B:153:0x0743, B:155:0x074e, B:157:0x0757, B:158:0x0770, B:160:0x0776, B:163:0x078a, B:166:0x0796, B:169:0x07a3, B:262:0x07bd, B:172:0x07cd, B:176:0x07d6, B:177:0x07d9, B:179:0x07f7, B:181:0x07fb, B:183:0x080d, B:185:0x0811, B:187:0x081c, B:188:0x0825, B:190:0x086b, B:191:0x0870, B:193:0x0878, B:195:0x0881, B:196:0x0884, B:198:0x0891, B:200:0x08b1, B:201:0x08be, B:202:0x08f4, B:204:0x08fc, B:206:0x0906, B:207:0x0913, B:209:0x091d, B:210:0x092a, B:211:0x0936, B:213:0x093c, B:216:0x096c, B:218:0x09b2, B:219:0x09bc, B:220:0x09c8, B:222:0x09ce, B:227:0x0a20, B:229:0x0a70, B:231:0x0a7f, B:232:0x0ae5, B:237:0x0a9a, B:240:0x0a9d, B:242:0x09df, B:244:0x0a0b, B:251:0x0ab8, B:252:0x0acf, B:256:0x0ad0, B:267:0x0748, B:268:0x062d, B:272:0x055b, B:279:0x0389, B:280:0x0390, B:282:0x0396, B:285:0x03a2, B:290:0x01df, B:293:0x01eb, B:295:0x0202, B:300:0x021b, B:303:0x0259, B:305:0x025f, B:307:0x026d, B:309:0x027e, B:311:0x0289, B:312:0x0338, B:314:0x0343, B:316:0x02bc, B:318:0x02d6, B:323:0x02e1, B:326:0x02ea, B:327:0x031f, B:331:0x030c, B:339:0x0229, B:342:0x024f), top: B:44:0x019f, inners: #4, #6, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0678 A[Catch: all -> 0x01c4, TryCatch #2 {all -> 0x01c4, blocks: (B:45:0x019f, B:48:0x01ae, B:50:0x01b8, B:53:0x01c8, B:58:0x0373, B:61:0x03a8, B:63:0x03e8, B:65:0x03ed, B:66:0x0404, B:70:0x0417, B:72:0x042e, B:74:0x0435, B:75:0x044c, B:80:0x0476, B:84:0x0497, B:85:0x04ae, B:88:0x04bf, B:91:0x04dc, B:92:0x04f0, B:94:0x04fa, B:96:0x0507, B:98:0x050d, B:99:0x0516, B:101:0x0524, B:104:0x0539, B:107:0x0549, B:111:0x0573, B:112:0x0588, B:114:0x05b4, B:117:0x05cc, B:120:0x060f, B:121:0x063b, B:123:0x0678, B:124:0x067d, B:126:0x0685, B:127:0x068a, B:129:0x0692, B:130:0x0697, B:132:0x06a2, B:134:0x06ae, B:136:0x06bc, B:137:0x06c1, B:139:0x06ca, B:140:0x06ce, B:142:0x06db, B:143:0x06e0, B:145:0x0707, B:147:0x070f, B:148:0x0714, B:150:0x071c, B:151:0x071f, B:153:0x0743, B:155:0x074e, B:157:0x0757, B:158:0x0770, B:160:0x0776, B:163:0x078a, B:166:0x0796, B:169:0x07a3, B:262:0x07bd, B:172:0x07cd, B:176:0x07d6, B:177:0x07d9, B:179:0x07f7, B:181:0x07fb, B:183:0x080d, B:185:0x0811, B:187:0x081c, B:188:0x0825, B:190:0x086b, B:191:0x0870, B:193:0x0878, B:195:0x0881, B:196:0x0884, B:198:0x0891, B:200:0x08b1, B:201:0x08be, B:202:0x08f4, B:204:0x08fc, B:206:0x0906, B:207:0x0913, B:209:0x091d, B:210:0x092a, B:211:0x0936, B:213:0x093c, B:216:0x096c, B:218:0x09b2, B:219:0x09bc, B:220:0x09c8, B:222:0x09ce, B:227:0x0a20, B:229:0x0a70, B:231:0x0a7f, B:232:0x0ae5, B:237:0x0a9a, B:240:0x0a9d, B:242:0x09df, B:244:0x0a0b, B:251:0x0ab8, B:252:0x0acf, B:256:0x0ad0, B:267:0x0748, B:268:0x062d, B:272:0x055b, B:279:0x0389, B:280:0x0390, B:282:0x0396, B:285:0x03a2, B:290:0x01df, B:293:0x01eb, B:295:0x0202, B:300:0x021b, B:303:0x0259, B:305:0x025f, B:307:0x026d, B:309:0x027e, B:311:0x0289, B:312:0x0338, B:314:0x0343, B:316:0x02bc, B:318:0x02d6, B:323:0x02e1, B:326:0x02ea, B:327:0x031f, B:331:0x030c, B:339:0x0229, B:342:0x024f), top: B:44:0x019f, inners: #4, #6, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0685 A[Catch: all -> 0x01c4, TryCatch #2 {all -> 0x01c4, blocks: (B:45:0x019f, B:48:0x01ae, B:50:0x01b8, B:53:0x01c8, B:58:0x0373, B:61:0x03a8, B:63:0x03e8, B:65:0x03ed, B:66:0x0404, B:70:0x0417, B:72:0x042e, B:74:0x0435, B:75:0x044c, B:80:0x0476, B:84:0x0497, B:85:0x04ae, B:88:0x04bf, B:91:0x04dc, B:92:0x04f0, B:94:0x04fa, B:96:0x0507, B:98:0x050d, B:99:0x0516, B:101:0x0524, B:104:0x0539, B:107:0x0549, B:111:0x0573, B:112:0x0588, B:114:0x05b4, B:117:0x05cc, B:120:0x060f, B:121:0x063b, B:123:0x0678, B:124:0x067d, B:126:0x0685, B:127:0x068a, B:129:0x0692, B:130:0x0697, B:132:0x06a2, B:134:0x06ae, B:136:0x06bc, B:137:0x06c1, B:139:0x06ca, B:140:0x06ce, B:142:0x06db, B:143:0x06e0, B:145:0x0707, B:147:0x070f, B:148:0x0714, B:150:0x071c, B:151:0x071f, B:153:0x0743, B:155:0x074e, B:157:0x0757, B:158:0x0770, B:160:0x0776, B:163:0x078a, B:166:0x0796, B:169:0x07a3, B:262:0x07bd, B:172:0x07cd, B:176:0x07d6, B:177:0x07d9, B:179:0x07f7, B:181:0x07fb, B:183:0x080d, B:185:0x0811, B:187:0x081c, B:188:0x0825, B:190:0x086b, B:191:0x0870, B:193:0x0878, B:195:0x0881, B:196:0x0884, B:198:0x0891, B:200:0x08b1, B:201:0x08be, B:202:0x08f4, B:204:0x08fc, B:206:0x0906, B:207:0x0913, B:209:0x091d, B:210:0x092a, B:211:0x0936, B:213:0x093c, B:216:0x096c, B:218:0x09b2, B:219:0x09bc, B:220:0x09c8, B:222:0x09ce, B:227:0x0a20, B:229:0x0a70, B:231:0x0a7f, B:232:0x0ae5, B:237:0x0a9a, B:240:0x0a9d, B:242:0x09df, B:244:0x0a0b, B:251:0x0ab8, B:252:0x0acf, B:256:0x0ad0, B:267:0x0748, B:268:0x062d, B:272:0x055b, B:279:0x0389, B:280:0x0390, B:282:0x0396, B:285:0x03a2, B:290:0x01df, B:293:0x01eb, B:295:0x0202, B:300:0x021b, B:303:0x0259, B:305:0x025f, B:307:0x026d, B:309:0x027e, B:311:0x0289, B:312:0x0338, B:314:0x0343, B:316:0x02bc, B:318:0x02d6, B:323:0x02e1, B:326:0x02ea, B:327:0x031f, B:331:0x030c, B:339:0x0229, B:342:0x024f), top: B:44:0x019f, inners: #4, #6, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0692 A[Catch: all -> 0x01c4, TryCatch #2 {all -> 0x01c4, blocks: (B:45:0x019f, B:48:0x01ae, B:50:0x01b8, B:53:0x01c8, B:58:0x0373, B:61:0x03a8, B:63:0x03e8, B:65:0x03ed, B:66:0x0404, B:70:0x0417, B:72:0x042e, B:74:0x0435, B:75:0x044c, B:80:0x0476, B:84:0x0497, B:85:0x04ae, B:88:0x04bf, B:91:0x04dc, B:92:0x04f0, B:94:0x04fa, B:96:0x0507, B:98:0x050d, B:99:0x0516, B:101:0x0524, B:104:0x0539, B:107:0x0549, B:111:0x0573, B:112:0x0588, B:114:0x05b4, B:117:0x05cc, B:120:0x060f, B:121:0x063b, B:123:0x0678, B:124:0x067d, B:126:0x0685, B:127:0x068a, B:129:0x0692, B:130:0x0697, B:132:0x06a2, B:134:0x06ae, B:136:0x06bc, B:137:0x06c1, B:139:0x06ca, B:140:0x06ce, B:142:0x06db, B:143:0x06e0, B:145:0x0707, B:147:0x070f, B:148:0x0714, B:150:0x071c, B:151:0x071f, B:153:0x0743, B:155:0x074e, B:157:0x0757, B:158:0x0770, B:160:0x0776, B:163:0x078a, B:166:0x0796, B:169:0x07a3, B:262:0x07bd, B:172:0x07cd, B:176:0x07d6, B:177:0x07d9, B:179:0x07f7, B:181:0x07fb, B:183:0x080d, B:185:0x0811, B:187:0x081c, B:188:0x0825, B:190:0x086b, B:191:0x0870, B:193:0x0878, B:195:0x0881, B:196:0x0884, B:198:0x0891, B:200:0x08b1, B:201:0x08be, B:202:0x08f4, B:204:0x08fc, B:206:0x0906, B:207:0x0913, B:209:0x091d, B:210:0x092a, B:211:0x0936, B:213:0x093c, B:216:0x096c, B:218:0x09b2, B:219:0x09bc, B:220:0x09c8, B:222:0x09ce, B:227:0x0a20, B:229:0x0a70, B:231:0x0a7f, B:232:0x0ae5, B:237:0x0a9a, B:240:0x0a9d, B:242:0x09df, B:244:0x0a0b, B:251:0x0ab8, B:252:0x0acf, B:256:0x0ad0, B:267:0x0748, B:268:0x062d, B:272:0x055b, B:279:0x0389, B:280:0x0390, B:282:0x0396, B:285:0x03a2, B:290:0x01df, B:293:0x01eb, B:295:0x0202, B:300:0x021b, B:303:0x0259, B:305:0x025f, B:307:0x026d, B:309:0x027e, B:311:0x0289, B:312:0x0338, B:314:0x0343, B:316:0x02bc, B:318:0x02d6, B:323:0x02e1, B:326:0x02ea, B:327:0x031f, B:331:0x030c, B:339:0x0229, B:342:0x024f), top: B:44:0x019f, inners: #4, #6, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x06ca A[Catch: all -> 0x01c4, TryCatch #2 {all -> 0x01c4, blocks: (B:45:0x019f, B:48:0x01ae, B:50:0x01b8, B:53:0x01c8, B:58:0x0373, B:61:0x03a8, B:63:0x03e8, B:65:0x03ed, B:66:0x0404, B:70:0x0417, B:72:0x042e, B:74:0x0435, B:75:0x044c, B:80:0x0476, B:84:0x0497, B:85:0x04ae, B:88:0x04bf, B:91:0x04dc, B:92:0x04f0, B:94:0x04fa, B:96:0x0507, B:98:0x050d, B:99:0x0516, B:101:0x0524, B:104:0x0539, B:107:0x0549, B:111:0x0573, B:112:0x0588, B:114:0x05b4, B:117:0x05cc, B:120:0x060f, B:121:0x063b, B:123:0x0678, B:124:0x067d, B:126:0x0685, B:127:0x068a, B:129:0x0692, B:130:0x0697, B:132:0x06a2, B:134:0x06ae, B:136:0x06bc, B:137:0x06c1, B:139:0x06ca, B:140:0x06ce, B:142:0x06db, B:143:0x06e0, B:145:0x0707, B:147:0x070f, B:148:0x0714, B:150:0x071c, B:151:0x071f, B:153:0x0743, B:155:0x074e, B:157:0x0757, B:158:0x0770, B:160:0x0776, B:163:0x078a, B:166:0x0796, B:169:0x07a3, B:262:0x07bd, B:172:0x07cd, B:176:0x07d6, B:177:0x07d9, B:179:0x07f7, B:181:0x07fb, B:183:0x080d, B:185:0x0811, B:187:0x081c, B:188:0x0825, B:190:0x086b, B:191:0x0870, B:193:0x0878, B:195:0x0881, B:196:0x0884, B:198:0x0891, B:200:0x08b1, B:201:0x08be, B:202:0x08f4, B:204:0x08fc, B:206:0x0906, B:207:0x0913, B:209:0x091d, B:210:0x092a, B:211:0x0936, B:213:0x093c, B:216:0x096c, B:218:0x09b2, B:219:0x09bc, B:220:0x09c8, B:222:0x09ce, B:227:0x0a20, B:229:0x0a70, B:231:0x0a7f, B:232:0x0ae5, B:237:0x0a9a, B:240:0x0a9d, B:242:0x09df, B:244:0x0a0b, B:251:0x0ab8, B:252:0x0acf, B:256:0x0ad0, B:267:0x0748, B:268:0x062d, B:272:0x055b, B:279:0x0389, B:280:0x0390, B:282:0x0396, B:285:0x03a2, B:290:0x01df, B:293:0x01eb, B:295:0x0202, B:300:0x021b, B:303:0x0259, B:305:0x025f, B:307:0x026d, B:309:0x027e, B:311:0x0289, B:312:0x0338, B:314:0x0343, B:316:0x02bc, B:318:0x02d6, B:323:0x02e1, B:326:0x02ea, B:327:0x031f, B:331:0x030c, B:339:0x0229, B:342:0x024f), top: B:44:0x019f, inners: #4, #6, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x06db A[Catch: all -> 0x01c4, TryCatch #2 {all -> 0x01c4, blocks: (B:45:0x019f, B:48:0x01ae, B:50:0x01b8, B:53:0x01c8, B:58:0x0373, B:61:0x03a8, B:63:0x03e8, B:65:0x03ed, B:66:0x0404, B:70:0x0417, B:72:0x042e, B:74:0x0435, B:75:0x044c, B:80:0x0476, B:84:0x0497, B:85:0x04ae, B:88:0x04bf, B:91:0x04dc, B:92:0x04f0, B:94:0x04fa, B:96:0x0507, B:98:0x050d, B:99:0x0516, B:101:0x0524, B:104:0x0539, B:107:0x0549, B:111:0x0573, B:112:0x0588, B:114:0x05b4, B:117:0x05cc, B:120:0x060f, B:121:0x063b, B:123:0x0678, B:124:0x067d, B:126:0x0685, B:127:0x068a, B:129:0x0692, B:130:0x0697, B:132:0x06a2, B:134:0x06ae, B:136:0x06bc, B:137:0x06c1, B:139:0x06ca, B:140:0x06ce, B:142:0x06db, B:143:0x06e0, B:145:0x0707, B:147:0x070f, B:148:0x0714, B:150:0x071c, B:151:0x071f, B:153:0x0743, B:155:0x074e, B:157:0x0757, B:158:0x0770, B:160:0x0776, B:163:0x078a, B:166:0x0796, B:169:0x07a3, B:262:0x07bd, B:172:0x07cd, B:176:0x07d6, B:177:0x07d9, B:179:0x07f7, B:181:0x07fb, B:183:0x080d, B:185:0x0811, B:187:0x081c, B:188:0x0825, B:190:0x086b, B:191:0x0870, B:193:0x0878, B:195:0x0881, B:196:0x0884, B:198:0x0891, B:200:0x08b1, B:201:0x08be, B:202:0x08f4, B:204:0x08fc, B:206:0x0906, B:207:0x0913, B:209:0x091d, B:210:0x092a, B:211:0x0936, B:213:0x093c, B:216:0x096c, B:218:0x09b2, B:219:0x09bc, B:220:0x09c8, B:222:0x09ce, B:227:0x0a20, B:229:0x0a70, B:231:0x0a7f, B:232:0x0ae5, B:237:0x0a9a, B:240:0x0a9d, B:242:0x09df, B:244:0x0a0b, B:251:0x0ab8, B:252:0x0acf, B:256:0x0ad0, B:267:0x0748, B:268:0x062d, B:272:0x055b, B:279:0x0389, B:280:0x0390, B:282:0x0396, B:285:0x03a2, B:290:0x01df, B:293:0x01eb, B:295:0x0202, B:300:0x021b, B:303:0x0259, B:305:0x025f, B:307:0x026d, B:309:0x027e, B:311:0x0289, B:312:0x0338, B:314:0x0343, B:316:0x02bc, B:318:0x02d6, B:323:0x02e1, B:326:0x02ea, B:327:0x031f, B:331:0x030c, B:339:0x0229, B:342:0x024f), top: B:44:0x019f, inners: #4, #6, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x071c A[Catch: all -> 0x01c4, TryCatch #2 {all -> 0x01c4, blocks: (B:45:0x019f, B:48:0x01ae, B:50:0x01b8, B:53:0x01c8, B:58:0x0373, B:61:0x03a8, B:63:0x03e8, B:65:0x03ed, B:66:0x0404, B:70:0x0417, B:72:0x042e, B:74:0x0435, B:75:0x044c, B:80:0x0476, B:84:0x0497, B:85:0x04ae, B:88:0x04bf, B:91:0x04dc, B:92:0x04f0, B:94:0x04fa, B:96:0x0507, B:98:0x050d, B:99:0x0516, B:101:0x0524, B:104:0x0539, B:107:0x0549, B:111:0x0573, B:112:0x0588, B:114:0x05b4, B:117:0x05cc, B:120:0x060f, B:121:0x063b, B:123:0x0678, B:124:0x067d, B:126:0x0685, B:127:0x068a, B:129:0x0692, B:130:0x0697, B:132:0x06a2, B:134:0x06ae, B:136:0x06bc, B:137:0x06c1, B:139:0x06ca, B:140:0x06ce, B:142:0x06db, B:143:0x06e0, B:145:0x0707, B:147:0x070f, B:148:0x0714, B:150:0x071c, B:151:0x071f, B:153:0x0743, B:155:0x074e, B:157:0x0757, B:158:0x0770, B:160:0x0776, B:163:0x078a, B:166:0x0796, B:169:0x07a3, B:262:0x07bd, B:172:0x07cd, B:176:0x07d6, B:177:0x07d9, B:179:0x07f7, B:181:0x07fb, B:183:0x080d, B:185:0x0811, B:187:0x081c, B:188:0x0825, B:190:0x086b, B:191:0x0870, B:193:0x0878, B:195:0x0881, B:196:0x0884, B:198:0x0891, B:200:0x08b1, B:201:0x08be, B:202:0x08f4, B:204:0x08fc, B:206:0x0906, B:207:0x0913, B:209:0x091d, B:210:0x092a, B:211:0x0936, B:213:0x093c, B:216:0x096c, B:218:0x09b2, B:219:0x09bc, B:220:0x09c8, B:222:0x09ce, B:227:0x0a20, B:229:0x0a70, B:231:0x0a7f, B:232:0x0ae5, B:237:0x0a9a, B:240:0x0a9d, B:242:0x09df, B:244:0x0a0b, B:251:0x0ab8, B:252:0x0acf, B:256:0x0ad0, B:267:0x0748, B:268:0x062d, B:272:0x055b, B:279:0x0389, B:280:0x0390, B:282:0x0396, B:285:0x03a2, B:290:0x01df, B:293:0x01eb, B:295:0x0202, B:300:0x021b, B:303:0x0259, B:305:0x025f, B:307:0x026d, B:309:0x027e, B:311:0x0289, B:312:0x0338, B:314:0x0343, B:316:0x02bc, B:318:0x02d6, B:323:0x02e1, B:326:0x02ea, B:327:0x031f, B:331:0x030c, B:339:0x0229, B:342:0x024f), top: B:44:0x019f, inners: #4, #6, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0743 A[Catch: all -> 0x01c4, TryCatch #2 {all -> 0x01c4, blocks: (B:45:0x019f, B:48:0x01ae, B:50:0x01b8, B:53:0x01c8, B:58:0x0373, B:61:0x03a8, B:63:0x03e8, B:65:0x03ed, B:66:0x0404, B:70:0x0417, B:72:0x042e, B:74:0x0435, B:75:0x044c, B:80:0x0476, B:84:0x0497, B:85:0x04ae, B:88:0x04bf, B:91:0x04dc, B:92:0x04f0, B:94:0x04fa, B:96:0x0507, B:98:0x050d, B:99:0x0516, B:101:0x0524, B:104:0x0539, B:107:0x0549, B:111:0x0573, B:112:0x0588, B:114:0x05b4, B:117:0x05cc, B:120:0x060f, B:121:0x063b, B:123:0x0678, B:124:0x067d, B:126:0x0685, B:127:0x068a, B:129:0x0692, B:130:0x0697, B:132:0x06a2, B:134:0x06ae, B:136:0x06bc, B:137:0x06c1, B:139:0x06ca, B:140:0x06ce, B:142:0x06db, B:143:0x06e0, B:145:0x0707, B:147:0x070f, B:148:0x0714, B:150:0x071c, B:151:0x071f, B:153:0x0743, B:155:0x074e, B:157:0x0757, B:158:0x0770, B:160:0x0776, B:163:0x078a, B:166:0x0796, B:169:0x07a3, B:262:0x07bd, B:172:0x07cd, B:176:0x07d6, B:177:0x07d9, B:179:0x07f7, B:181:0x07fb, B:183:0x080d, B:185:0x0811, B:187:0x081c, B:188:0x0825, B:190:0x086b, B:191:0x0870, B:193:0x0878, B:195:0x0881, B:196:0x0884, B:198:0x0891, B:200:0x08b1, B:201:0x08be, B:202:0x08f4, B:204:0x08fc, B:206:0x0906, B:207:0x0913, B:209:0x091d, B:210:0x092a, B:211:0x0936, B:213:0x093c, B:216:0x096c, B:218:0x09b2, B:219:0x09bc, B:220:0x09c8, B:222:0x09ce, B:227:0x0a20, B:229:0x0a70, B:231:0x0a7f, B:232:0x0ae5, B:237:0x0a9a, B:240:0x0a9d, B:242:0x09df, B:244:0x0a0b, B:251:0x0ab8, B:252:0x0acf, B:256:0x0ad0, B:267:0x0748, B:268:0x062d, B:272:0x055b, B:279:0x0389, B:280:0x0390, B:282:0x0396, B:285:0x03a2, B:290:0x01df, B:293:0x01eb, B:295:0x0202, B:300:0x021b, B:303:0x0259, B:305:0x025f, B:307:0x026d, B:309:0x027e, B:311:0x0289, B:312:0x0338, B:314:0x0343, B:316:0x02bc, B:318:0x02d6, B:323:0x02e1, B:326:0x02ea, B:327:0x031f, B:331:0x030c, B:339:0x0229, B:342:0x024f), top: B:44:0x019f, inners: #4, #6, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0776 A[Catch: all -> 0x01c4, TRY_LEAVE, TryCatch #2 {all -> 0x01c4, blocks: (B:45:0x019f, B:48:0x01ae, B:50:0x01b8, B:53:0x01c8, B:58:0x0373, B:61:0x03a8, B:63:0x03e8, B:65:0x03ed, B:66:0x0404, B:70:0x0417, B:72:0x042e, B:74:0x0435, B:75:0x044c, B:80:0x0476, B:84:0x0497, B:85:0x04ae, B:88:0x04bf, B:91:0x04dc, B:92:0x04f0, B:94:0x04fa, B:96:0x0507, B:98:0x050d, B:99:0x0516, B:101:0x0524, B:104:0x0539, B:107:0x0549, B:111:0x0573, B:112:0x0588, B:114:0x05b4, B:117:0x05cc, B:120:0x060f, B:121:0x063b, B:123:0x0678, B:124:0x067d, B:126:0x0685, B:127:0x068a, B:129:0x0692, B:130:0x0697, B:132:0x06a2, B:134:0x06ae, B:136:0x06bc, B:137:0x06c1, B:139:0x06ca, B:140:0x06ce, B:142:0x06db, B:143:0x06e0, B:145:0x0707, B:147:0x070f, B:148:0x0714, B:150:0x071c, B:151:0x071f, B:153:0x0743, B:155:0x074e, B:157:0x0757, B:158:0x0770, B:160:0x0776, B:163:0x078a, B:166:0x0796, B:169:0x07a3, B:262:0x07bd, B:172:0x07cd, B:176:0x07d6, B:177:0x07d9, B:179:0x07f7, B:181:0x07fb, B:183:0x080d, B:185:0x0811, B:187:0x081c, B:188:0x0825, B:190:0x086b, B:191:0x0870, B:193:0x0878, B:195:0x0881, B:196:0x0884, B:198:0x0891, B:200:0x08b1, B:201:0x08be, B:202:0x08f4, B:204:0x08fc, B:206:0x0906, B:207:0x0913, B:209:0x091d, B:210:0x092a, B:211:0x0936, B:213:0x093c, B:216:0x096c, B:218:0x09b2, B:219:0x09bc, B:220:0x09c8, B:222:0x09ce, B:227:0x0a20, B:229:0x0a70, B:231:0x0a7f, B:232:0x0ae5, B:237:0x0a9a, B:240:0x0a9d, B:242:0x09df, B:244:0x0a0b, B:251:0x0ab8, B:252:0x0acf, B:256:0x0ad0, B:267:0x0748, B:268:0x062d, B:272:0x055b, B:279:0x0389, B:280:0x0390, B:282:0x0396, B:285:0x03a2, B:290:0x01df, B:293:0x01eb, B:295:0x0202, B:300:0x021b, B:303:0x0259, B:305:0x025f, B:307:0x026d, B:309:0x027e, B:311:0x0289, B:312:0x0338, B:314:0x0343, B:316:0x02bc, B:318:0x02d6, B:323:0x02e1, B:326:0x02ea, B:327:0x031f, B:331:0x030c, B:339:0x0229, B:342:0x024f), top: B:44:0x019f, inners: #4, #6, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x07d3  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x07d6 A[Catch: all -> 0x01c4, TryCatch #2 {all -> 0x01c4, blocks: (B:45:0x019f, B:48:0x01ae, B:50:0x01b8, B:53:0x01c8, B:58:0x0373, B:61:0x03a8, B:63:0x03e8, B:65:0x03ed, B:66:0x0404, B:70:0x0417, B:72:0x042e, B:74:0x0435, B:75:0x044c, B:80:0x0476, B:84:0x0497, B:85:0x04ae, B:88:0x04bf, B:91:0x04dc, B:92:0x04f0, B:94:0x04fa, B:96:0x0507, B:98:0x050d, B:99:0x0516, B:101:0x0524, B:104:0x0539, B:107:0x0549, B:111:0x0573, B:112:0x0588, B:114:0x05b4, B:117:0x05cc, B:120:0x060f, B:121:0x063b, B:123:0x0678, B:124:0x067d, B:126:0x0685, B:127:0x068a, B:129:0x0692, B:130:0x0697, B:132:0x06a2, B:134:0x06ae, B:136:0x06bc, B:137:0x06c1, B:139:0x06ca, B:140:0x06ce, B:142:0x06db, B:143:0x06e0, B:145:0x0707, B:147:0x070f, B:148:0x0714, B:150:0x071c, B:151:0x071f, B:153:0x0743, B:155:0x074e, B:157:0x0757, B:158:0x0770, B:160:0x0776, B:163:0x078a, B:166:0x0796, B:169:0x07a3, B:262:0x07bd, B:172:0x07cd, B:176:0x07d6, B:177:0x07d9, B:179:0x07f7, B:181:0x07fb, B:183:0x080d, B:185:0x0811, B:187:0x081c, B:188:0x0825, B:190:0x086b, B:191:0x0870, B:193:0x0878, B:195:0x0881, B:196:0x0884, B:198:0x0891, B:200:0x08b1, B:201:0x08be, B:202:0x08f4, B:204:0x08fc, B:206:0x0906, B:207:0x0913, B:209:0x091d, B:210:0x092a, B:211:0x0936, B:213:0x093c, B:216:0x096c, B:218:0x09b2, B:219:0x09bc, B:220:0x09c8, B:222:0x09ce, B:227:0x0a20, B:229:0x0a70, B:231:0x0a7f, B:232:0x0ae5, B:237:0x0a9a, B:240:0x0a9d, B:242:0x09df, B:244:0x0a0b, B:251:0x0ab8, B:252:0x0acf, B:256:0x0ad0, B:267:0x0748, B:268:0x062d, B:272:0x055b, B:279:0x0389, B:280:0x0390, B:282:0x0396, B:285:0x03a2, B:290:0x01df, B:293:0x01eb, B:295:0x0202, B:300:0x021b, B:303:0x0259, B:305:0x025f, B:307:0x026d, B:309:0x027e, B:311:0x0289, B:312:0x0338, B:314:0x0343, B:316:0x02bc, B:318:0x02d6, B:323:0x02e1, B:326:0x02ea, B:327:0x031f, B:331:0x030c, B:339:0x0229, B:342:0x024f), top: B:44:0x019f, inners: #4, #6, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x07f7 A[Catch: all -> 0x01c4, TryCatch #2 {all -> 0x01c4, blocks: (B:45:0x019f, B:48:0x01ae, B:50:0x01b8, B:53:0x01c8, B:58:0x0373, B:61:0x03a8, B:63:0x03e8, B:65:0x03ed, B:66:0x0404, B:70:0x0417, B:72:0x042e, B:74:0x0435, B:75:0x044c, B:80:0x0476, B:84:0x0497, B:85:0x04ae, B:88:0x04bf, B:91:0x04dc, B:92:0x04f0, B:94:0x04fa, B:96:0x0507, B:98:0x050d, B:99:0x0516, B:101:0x0524, B:104:0x0539, B:107:0x0549, B:111:0x0573, B:112:0x0588, B:114:0x05b4, B:117:0x05cc, B:120:0x060f, B:121:0x063b, B:123:0x0678, B:124:0x067d, B:126:0x0685, B:127:0x068a, B:129:0x0692, B:130:0x0697, B:132:0x06a2, B:134:0x06ae, B:136:0x06bc, B:137:0x06c1, B:139:0x06ca, B:140:0x06ce, B:142:0x06db, B:143:0x06e0, B:145:0x0707, B:147:0x070f, B:148:0x0714, B:150:0x071c, B:151:0x071f, B:153:0x0743, B:155:0x074e, B:157:0x0757, B:158:0x0770, B:160:0x0776, B:163:0x078a, B:166:0x0796, B:169:0x07a3, B:262:0x07bd, B:172:0x07cd, B:176:0x07d6, B:177:0x07d9, B:179:0x07f7, B:181:0x07fb, B:183:0x080d, B:185:0x0811, B:187:0x081c, B:188:0x0825, B:190:0x086b, B:191:0x0870, B:193:0x0878, B:195:0x0881, B:196:0x0884, B:198:0x0891, B:200:0x08b1, B:201:0x08be, B:202:0x08f4, B:204:0x08fc, B:206:0x0906, B:207:0x0913, B:209:0x091d, B:210:0x092a, B:211:0x0936, B:213:0x093c, B:216:0x096c, B:218:0x09b2, B:219:0x09bc, B:220:0x09c8, B:222:0x09ce, B:227:0x0a20, B:229:0x0a70, B:231:0x0a7f, B:232:0x0ae5, B:237:0x0a9a, B:240:0x0a9d, B:242:0x09df, B:244:0x0a0b, B:251:0x0ab8, B:252:0x0acf, B:256:0x0ad0, B:267:0x0748, B:268:0x062d, B:272:0x055b, B:279:0x0389, B:280:0x0390, B:282:0x0396, B:285:0x03a2, B:290:0x01df, B:293:0x01eb, B:295:0x0202, B:300:0x021b, B:303:0x0259, B:305:0x025f, B:307:0x026d, B:309:0x027e, B:311:0x0289, B:312:0x0338, B:314:0x0343, B:316:0x02bc, B:318:0x02d6, B:323:0x02e1, B:326:0x02ea, B:327:0x031f, B:331:0x030c, B:339:0x0229, B:342:0x024f), top: B:44:0x019f, inners: #4, #6, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x081c A[Catch: all -> 0x01c4, TryCatch #2 {all -> 0x01c4, blocks: (B:45:0x019f, B:48:0x01ae, B:50:0x01b8, B:53:0x01c8, B:58:0x0373, B:61:0x03a8, B:63:0x03e8, B:65:0x03ed, B:66:0x0404, B:70:0x0417, B:72:0x042e, B:74:0x0435, B:75:0x044c, B:80:0x0476, B:84:0x0497, B:85:0x04ae, B:88:0x04bf, B:91:0x04dc, B:92:0x04f0, B:94:0x04fa, B:96:0x0507, B:98:0x050d, B:99:0x0516, B:101:0x0524, B:104:0x0539, B:107:0x0549, B:111:0x0573, B:112:0x0588, B:114:0x05b4, B:117:0x05cc, B:120:0x060f, B:121:0x063b, B:123:0x0678, B:124:0x067d, B:126:0x0685, B:127:0x068a, B:129:0x0692, B:130:0x0697, B:132:0x06a2, B:134:0x06ae, B:136:0x06bc, B:137:0x06c1, B:139:0x06ca, B:140:0x06ce, B:142:0x06db, B:143:0x06e0, B:145:0x0707, B:147:0x070f, B:148:0x0714, B:150:0x071c, B:151:0x071f, B:153:0x0743, B:155:0x074e, B:157:0x0757, B:158:0x0770, B:160:0x0776, B:163:0x078a, B:166:0x0796, B:169:0x07a3, B:262:0x07bd, B:172:0x07cd, B:176:0x07d6, B:177:0x07d9, B:179:0x07f7, B:181:0x07fb, B:183:0x080d, B:185:0x0811, B:187:0x081c, B:188:0x0825, B:190:0x086b, B:191:0x0870, B:193:0x0878, B:195:0x0881, B:196:0x0884, B:198:0x0891, B:200:0x08b1, B:201:0x08be, B:202:0x08f4, B:204:0x08fc, B:206:0x0906, B:207:0x0913, B:209:0x091d, B:210:0x092a, B:211:0x0936, B:213:0x093c, B:216:0x096c, B:218:0x09b2, B:219:0x09bc, B:220:0x09c8, B:222:0x09ce, B:227:0x0a20, B:229:0x0a70, B:231:0x0a7f, B:232:0x0ae5, B:237:0x0a9a, B:240:0x0a9d, B:242:0x09df, B:244:0x0a0b, B:251:0x0ab8, B:252:0x0acf, B:256:0x0ad0, B:267:0x0748, B:268:0x062d, B:272:0x055b, B:279:0x0389, B:280:0x0390, B:282:0x0396, B:285:0x03a2, B:290:0x01df, B:293:0x01eb, B:295:0x0202, B:300:0x021b, B:303:0x0259, B:305:0x025f, B:307:0x026d, B:309:0x027e, B:311:0x0289, B:312:0x0338, B:314:0x0343, B:316:0x02bc, B:318:0x02d6, B:323:0x02e1, B:326:0x02ea, B:327:0x031f, B:331:0x030c, B:339:0x0229, B:342:0x024f), top: B:44:0x019f, inners: #4, #6, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x086b A[Catch: all -> 0x01c4, TryCatch #2 {all -> 0x01c4, blocks: (B:45:0x019f, B:48:0x01ae, B:50:0x01b8, B:53:0x01c8, B:58:0x0373, B:61:0x03a8, B:63:0x03e8, B:65:0x03ed, B:66:0x0404, B:70:0x0417, B:72:0x042e, B:74:0x0435, B:75:0x044c, B:80:0x0476, B:84:0x0497, B:85:0x04ae, B:88:0x04bf, B:91:0x04dc, B:92:0x04f0, B:94:0x04fa, B:96:0x0507, B:98:0x050d, B:99:0x0516, B:101:0x0524, B:104:0x0539, B:107:0x0549, B:111:0x0573, B:112:0x0588, B:114:0x05b4, B:117:0x05cc, B:120:0x060f, B:121:0x063b, B:123:0x0678, B:124:0x067d, B:126:0x0685, B:127:0x068a, B:129:0x0692, B:130:0x0697, B:132:0x06a2, B:134:0x06ae, B:136:0x06bc, B:137:0x06c1, B:139:0x06ca, B:140:0x06ce, B:142:0x06db, B:143:0x06e0, B:145:0x0707, B:147:0x070f, B:148:0x0714, B:150:0x071c, B:151:0x071f, B:153:0x0743, B:155:0x074e, B:157:0x0757, B:158:0x0770, B:160:0x0776, B:163:0x078a, B:166:0x0796, B:169:0x07a3, B:262:0x07bd, B:172:0x07cd, B:176:0x07d6, B:177:0x07d9, B:179:0x07f7, B:181:0x07fb, B:183:0x080d, B:185:0x0811, B:187:0x081c, B:188:0x0825, B:190:0x086b, B:191:0x0870, B:193:0x0878, B:195:0x0881, B:196:0x0884, B:198:0x0891, B:200:0x08b1, B:201:0x08be, B:202:0x08f4, B:204:0x08fc, B:206:0x0906, B:207:0x0913, B:209:0x091d, B:210:0x092a, B:211:0x0936, B:213:0x093c, B:216:0x096c, B:218:0x09b2, B:219:0x09bc, B:220:0x09c8, B:222:0x09ce, B:227:0x0a20, B:229:0x0a70, B:231:0x0a7f, B:232:0x0ae5, B:237:0x0a9a, B:240:0x0a9d, B:242:0x09df, B:244:0x0a0b, B:251:0x0ab8, B:252:0x0acf, B:256:0x0ad0, B:267:0x0748, B:268:0x062d, B:272:0x055b, B:279:0x0389, B:280:0x0390, B:282:0x0396, B:285:0x03a2, B:290:0x01df, B:293:0x01eb, B:295:0x0202, B:300:0x021b, B:303:0x0259, B:305:0x025f, B:307:0x026d, B:309:0x027e, B:311:0x0289, B:312:0x0338, B:314:0x0343, B:316:0x02bc, B:318:0x02d6, B:323:0x02e1, B:326:0x02ea, B:327:0x031f, B:331:0x030c, B:339:0x0229, B:342:0x024f), top: B:44:0x019f, inners: #4, #6, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0878 A[Catch: all -> 0x01c4, TryCatch #2 {all -> 0x01c4, blocks: (B:45:0x019f, B:48:0x01ae, B:50:0x01b8, B:53:0x01c8, B:58:0x0373, B:61:0x03a8, B:63:0x03e8, B:65:0x03ed, B:66:0x0404, B:70:0x0417, B:72:0x042e, B:74:0x0435, B:75:0x044c, B:80:0x0476, B:84:0x0497, B:85:0x04ae, B:88:0x04bf, B:91:0x04dc, B:92:0x04f0, B:94:0x04fa, B:96:0x0507, B:98:0x050d, B:99:0x0516, B:101:0x0524, B:104:0x0539, B:107:0x0549, B:111:0x0573, B:112:0x0588, B:114:0x05b4, B:117:0x05cc, B:120:0x060f, B:121:0x063b, B:123:0x0678, B:124:0x067d, B:126:0x0685, B:127:0x068a, B:129:0x0692, B:130:0x0697, B:132:0x06a2, B:134:0x06ae, B:136:0x06bc, B:137:0x06c1, B:139:0x06ca, B:140:0x06ce, B:142:0x06db, B:143:0x06e0, B:145:0x0707, B:147:0x070f, B:148:0x0714, B:150:0x071c, B:151:0x071f, B:153:0x0743, B:155:0x074e, B:157:0x0757, B:158:0x0770, B:160:0x0776, B:163:0x078a, B:166:0x0796, B:169:0x07a3, B:262:0x07bd, B:172:0x07cd, B:176:0x07d6, B:177:0x07d9, B:179:0x07f7, B:181:0x07fb, B:183:0x080d, B:185:0x0811, B:187:0x081c, B:188:0x0825, B:190:0x086b, B:191:0x0870, B:193:0x0878, B:195:0x0881, B:196:0x0884, B:198:0x0891, B:200:0x08b1, B:201:0x08be, B:202:0x08f4, B:204:0x08fc, B:206:0x0906, B:207:0x0913, B:209:0x091d, B:210:0x092a, B:211:0x0936, B:213:0x093c, B:216:0x096c, B:218:0x09b2, B:219:0x09bc, B:220:0x09c8, B:222:0x09ce, B:227:0x0a20, B:229:0x0a70, B:231:0x0a7f, B:232:0x0ae5, B:237:0x0a9a, B:240:0x0a9d, B:242:0x09df, B:244:0x0a0b, B:251:0x0ab8, B:252:0x0acf, B:256:0x0ad0, B:267:0x0748, B:268:0x062d, B:272:0x055b, B:279:0x0389, B:280:0x0390, B:282:0x0396, B:285:0x03a2, B:290:0x01df, B:293:0x01eb, B:295:0x0202, B:300:0x021b, B:303:0x0259, B:305:0x025f, B:307:0x026d, B:309:0x027e, B:311:0x0289, B:312:0x0338, B:314:0x0343, B:316:0x02bc, B:318:0x02d6, B:323:0x02e1, B:326:0x02ea, B:327:0x031f, B:331:0x030c, B:339:0x0229, B:342:0x024f), top: B:44:0x019f, inners: #4, #6, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0891 A[Catch: all -> 0x01c4, TryCatch #2 {all -> 0x01c4, blocks: (B:45:0x019f, B:48:0x01ae, B:50:0x01b8, B:53:0x01c8, B:58:0x0373, B:61:0x03a8, B:63:0x03e8, B:65:0x03ed, B:66:0x0404, B:70:0x0417, B:72:0x042e, B:74:0x0435, B:75:0x044c, B:80:0x0476, B:84:0x0497, B:85:0x04ae, B:88:0x04bf, B:91:0x04dc, B:92:0x04f0, B:94:0x04fa, B:96:0x0507, B:98:0x050d, B:99:0x0516, B:101:0x0524, B:104:0x0539, B:107:0x0549, B:111:0x0573, B:112:0x0588, B:114:0x05b4, B:117:0x05cc, B:120:0x060f, B:121:0x063b, B:123:0x0678, B:124:0x067d, B:126:0x0685, B:127:0x068a, B:129:0x0692, B:130:0x0697, B:132:0x06a2, B:134:0x06ae, B:136:0x06bc, B:137:0x06c1, B:139:0x06ca, B:140:0x06ce, B:142:0x06db, B:143:0x06e0, B:145:0x0707, B:147:0x070f, B:148:0x0714, B:150:0x071c, B:151:0x071f, B:153:0x0743, B:155:0x074e, B:157:0x0757, B:158:0x0770, B:160:0x0776, B:163:0x078a, B:166:0x0796, B:169:0x07a3, B:262:0x07bd, B:172:0x07cd, B:176:0x07d6, B:177:0x07d9, B:179:0x07f7, B:181:0x07fb, B:183:0x080d, B:185:0x0811, B:187:0x081c, B:188:0x0825, B:190:0x086b, B:191:0x0870, B:193:0x0878, B:195:0x0881, B:196:0x0884, B:198:0x0891, B:200:0x08b1, B:201:0x08be, B:202:0x08f4, B:204:0x08fc, B:206:0x0906, B:207:0x0913, B:209:0x091d, B:210:0x092a, B:211:0x0936, B:213:0x093c, B:216:0x096c, B:218:0x09b2, B:219:0x09bc, B:220:0x09c8, B:222:0x09ce, B:227:0x0a20, B:229:0x0a70, B:231:0x0a7f, B:232:0x0ae5, B:237:0x0a9a, B:240:0x0a9d, B:242:0x09df, B:244:0x0a0b, B:251:0x0ab8, B:252:0x0acf, B:256:0x0ad0, B:267:0x0748, B:268:0x062d, B:272:0x055b, B:279:0x0389, B:280:0x0390, B:282:0x0396, B:285:0x03a2, B:290:0x01df, B:293:0x01eb, B:295:0x0202, B:300:0x021b, B:303:0x0259, B:305:0x025f, B:307:0x026d, B:309:0x027e, B:311:0x0289, B:312:0x0338, B:314:0x0343, B:316:0x02bc, B:318:0x02d6, B:323:0x02e1, B:326:0x02ea, B:327:0x031f, B:331:0x030c, B:339:0x0229, B:342:0x024f), top: B:44:0x019f, inners: #4, #6, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x08fc A[Catch: all -> 0x01c4, TryCatch #2 {all -> 0x01c4, blocks: (B:45:0x019f, B:48:0x01ae, B:50:0x01b8, B:53:0x01c8, B:58:0x0373, B:61:0x03a8, B:63:0x03e8, B:65:0x03ed, B:66:0x0404, B:70:0x0417, B:72:0x042e, B:74:0x0435, B:75:0x044c, B:80:0x0476, B:84:0x0497, B:85:0x04ae, B:88:0x04bf, B:91:0x04dc, B:92:0x04f0, B:94:0x04fa, B:96:0x0507, B:98:0x050d, B:99:0x0516, B:101:0x0524, B:104:0x0539, B:107:0x0549, B:111:0x0573, B:112:0x0588, B:114:0x05b4, B:117:0x05cc, B:120:0x060f, B:121:0x063b, B:123:0x0678, B:124:0x067d, B:126:0x0685, B:127:0x068a, B:129:0x0692, B:130:0x0697, B:132:0x06a2, B:134:0x06ae, B:136:0x06bc, B:137:0x06c1, B:139:0x06ca, B:140:0x06ce, B:142:0x06db, B:143:0x06e0, B:145:0x0707, B:147:0x070f, B:148:0x0714, B:150:0x071c, B:151:0x071f, B:153:0x0743, B:155:0x074e, B:157:0x0757, B:158:0x0770, B:160:0x0776, B:163:0x078a, B:166:0x0796, B:169:0x07a3, B:262:0x07bd, B:172:0x07cd, B:176:0x07d6, B:177:0x07d9, B:179:0x07f7, B:181:0x07fb, B:183:0x080d, B:185:0x0811, B:187:0x081c, B:188:0x0825, B:190:0x086b, B:191:0x0870, B:193:0x0878, B:195:0x0881, B:196:0x0884, B:198:0x0891, B:200:0x08b1, B:201:0x08be, B:202:0x08f4, B:204:0x08fc, B:206:0x0906, B:207:0x0913, B:209:0x091d, B:210:0x092a, B:211:0x0936, B:213:0x093c, B:216:0x096c, B:218:0x09b2, B:219:0x09bc, B:220:0x09c8, B:222:0x09ce, B:227:0x0a20, B:229:0x0a70, B:231:0x0a7f, B:232:0x0ae5, B:237:0x0a9a, B:240:0x0a9d, B:242:0x09df, B:244:0x0a0b, B:251:0x0ab8, B:252:0x0acf, B:256:0x0ad0, B:267:0x0748, B:268:0x062d, B:272:0x055b, B:279:0x0389, B:280:0x0390, B:282:0x0396, B:285:0x03a2, B:290:0x01df, B:293:0x01eb, B:295:0x0202, B:300:0x021b, B:303:0x0259, B:305:0x025f, B:307:0x026d, B:309:0x027e, B:311:0x0289, B:312:0x0338, B:314:0x0343, B:316:0x02bc, B:318:0x02d6, B:323:0x02e1, B:326:0x02ea, B:327:0x031f, B:331:0x030c, B:339:0x0229, B:342:0x024f), top: B:44:0x019f, inners: #4, #6, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x091d A[Catch: all -> 0x01c4, TryCatch #2 {all -> 0x01c4, blocks: (B:45:0x019f, B:48:0x01ae, B:50:0x01b8, B:53:0x01c8, B:58:0x0373, B:61:0x03a8, B:63:0x03e8, B:65:0x03ed, B:66:0x0404, B:70:0x0417, B:72:0x042e, B:74:0x0435, B:75:0x044c, B:80:0x0476, B:84:0x0497, B:85:0x04ae, B:88:0x04bf, B:91:0x04dc, B:92:0x04f0, B:94:0x04fa, B:96:0x0507, B:98:0x050d, B:99:0x0516, B:101:0x0524, B:104:0x0539, B:107:0x0549, B:111:0x0573, B:112:0x0588, B:114:0x05b4, B:117:0x05cc, B:120:0x060f, B:121:0x063b, B:123:0x0678, B:124:0x067d, B:126:0x0685, B:127:0x068a, B:129:0x0692, B:130:0x0697, B:132:0x06a2, B:134:0x06ae, B:136:0x06bc, B:137:0x06c1, B:139:0x06ca, B:140:0x06ce, B:142:0x06db, B:143:0x06e0, B:145:0x0707, B:147:0x070f, B:148:0x0714, B:150:0x071c, B:151:0x071f, B:153:0x0743, B:155:0x074e, B:157:0x0757, B:158:0x0770, B:160:0x0776, B:163:0x078a, B:166:0x0796, B:169:0x07a3, B:262:0x07bd, B:172:0x07cd, B:176:0x07d6, B:177:0x07d9, B:179:0x07f7, B:181:0x07fb, B:183:0x080d, B:185:0x0811, B:187:0x081c, B:188:0x0825, B:190:0x086b, B:191:0x0870, B:193:0x0878, B:195:0x0881, B:196:0x0884, B:198:0x0891, B:200:0x08b1, B:201:0x08be, B:202:0x08f4, B:204:0x08fc, B:206:0x0906, B:207:0x0913, B:209:0x091d, B:210:0x092a, B:211:0x0936, B:213:0x093c, B:216:0x096c, B:218:0x09b2, B:219:0x09bc, B:220:0x09c8, B:222:0x09ce, B:227:0x0a20, B:229:0x0a70, B:231:0x0a7f, B:232:0x0ae5, B:237:0x0a9a, B:240:0x0a9d, B:242:0x09df, B:244:0x0a0b, B:251:0x0ab8, B:252:0x0acf, B:256:0x0ad0, B:267:0x0748, B:268:0x062d, B:272:0x055b, B:279:0x0389, B:280:0x0390, B:282:0x0396, B:285:0x03a2, B:290:0x01df, B:293:0x01eb, B:295:0x0202, B:300:0x021b, B:303:0x0259, B:305:0x025f, B:307:0x026d, B:309:0x027e, B:311:0x0289, B:312:0x0338, B:314:0x0343, B:316:0x02bc, B:318:0x02d6, B:323:0x02e1, B:326:0x02ea, B:327:0x031f, B:331:0x030c, B:339:0x0229, B:342:0x024f), top: B:44:0x019f, inners: #4, #6, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x093c A[Catch: all -> 0x01c4, TRY_LEAVE, TryCatch #2 {all -> 0x01c4, blocks: (B:45:0x019f, B:48:0x01ae, B:50:0x01b8, B:53:0x01c8, B:58:0x0373, B:61:0x03a8, B:63:0x03e8, B:65:0x03ed, B:66:0x0404, B:70:0x0417, B:72:0x042e, B:74:0x0435, B:75:0x044c, B:80:0x0476, B:84:0x0497, B:85:0x04ae, B:88:0x04bf, B:91:0x04dc, B:92:0x04f0, B:94:0x04fa, B:96:0x0507, B:98:0x050d, B:99:0x0516, B:101:0x0524, B:104:0x0539, B:107:0x0549, B:111:0x0573, B:112:0x0588, B:114:0x05b4, B:117:0x05cc, B:120:0x060f, B:121:0x063b, B:123:0x0678, B:124:0x067d, B:126:0x0685, B:127:0x068a, B:129:0x0692, B:130:0x0697, B:132:0x06a2, B:134:0x06ae, B:136:0x06bc, B:137:0x06c1, B:139:0x06ca, B:140:0x06ce, B:142:0x06db, B:143:0x06e0, B:145:0x0707, B:147:0x070f, B:148:0x0714, B:150:0x071c, B:151:0x071f, B:153:0x0743, B:155:0x074e, B:157:0x0757, B:158:0x0770, B:160:0x0776, B:163:0x078a, B:166:0x0796, B:169:0x07a3, B:262:0x07bd, B:172:0x07cd, B:176:0x07d6, B:177:0x07d9, B:179:0x07f7, B:181:0x07fb, B:183:0x080d, B:185:0x0811, B:187:0x081c, B:188:0x0825, B:190:0x086b, B:191:0x0870, B:193:0x0878, B:195:0x0881, B:196:0x0884, B:198:0x0891, B:200:0x08b1, B:201:0x08be, B:202:0x08f4, B:204:0x08fc, B:206:0x0906, B:207:0x0913, B:209:0x091d, B:210:0x092a, B:211:0x0936, B:213:0x093c, B:216:0x096c, B:218:0x09b2, B:219:0x09bc, B:220:0x09c8, B:222:0x09ce, B:227:0x0a20, B:229:0x0a70, B:231:0x0a7f, B:232:0x0ae5, B:237:0x0a9a, B:240:0x0a9d, B:242:0x09df, B:244:0x0a0b, B:251:0x0ab8, B:252:0x0acf, B:256:0x0ad0, B:267:0x0748, B:268:0x062d, B:272:0x055b, B:279:0x0389, B:280:0x0390, B:282:0x0396, B:285:0x03a2, B:290:0x01df, B:293:0x01eb, B:295:0x0202, B:300:0x021b, B:303:0x0259, B:305:0x025f, B:307:0x026d, B:309:0x027e, B:311:0x0289, B:312:0x0338, B:314:0x0343, B:316:0x02bc, B:318:0x02d6, B:323:0x02e1, B:326:0x02ea, B:327:0x031f, B:331:0x030c, B:339:0x0229, B:342:0x024f), top: B:44:0x019f, inners: #4, #6, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:222:0x09ce A[Catch: all -> 0x01c4, TryCatch #2 {all -> 0x01c4, blocks: (B:45:0x019f, B:48:0x01ae, B:50:0x01b8, B:53:0x01c8, B:58:0x0373, B:61:0x03a8, B:63:0x03e8, B:65:0x03ed, B:66:0x0404, B:70:0x0417, B:72:0x042e, B:74:0x0435, B:75:0x044c, B:80:0x0476, B:84:0x0497, B:85:0x04ae, B:88:0x04bf, B:91:0x04dc, B:92:0x04f0, B:94:0x04fa, B:96:0x0507, B:98:0x050d, B:99:0x0516, B:101:0x0524, B:104:0x0539, B:107:0x0549, B:111:0x0573, B:112:0x0588, B:114:0x05b4, B:117:0x05cc, B:120:0x060f, B:121:0x063b, B:123:0x0678, B:124:0x067d, B:126:0x0685, B:127:0x068a, B:129:0x0692, B:130:0x0697, B:132:0x06a2, B:134:0x06ae, B:136:0x06bc, B:137:0x06c1, B:139:0x06ca, B:140:0x06ce, B:142:0x06db, B:143:0x06e0, B:145:0x0707, B:147:0x070f, B:148:0x0714, B:150:0x071c, B:151:0x071f, B:153:0x0743, B:155:0x074e, B:157:0x0757, B:158:0x0770, B:160:0x0776, B:163:0x078a, B:166:0x0796, B:169:0x07a3, B:262:0x07bd, B:172:0x07cd, B:176:0x07d6, B:177:0x07d9, B:179:0x07f7, B:181:0x07fb, B:183:0x080d, B:185:0x0811, B:187:0x081c, B:188:0x0825, B:190:0x086b, B:191:0x0870, B:193:0x0878, B:195:0x0881, B:196:0x0884, B:198:0x0891, B:200:0x08b1, B:201:0x08be, B:202:0x08f4, B:204:0x08fc, B:206:0x0906, B:207:0x0913, B:209:0x091d, B:210:0x092a, B:211:0x0936, B:213:0x093c, B:216:0x096c, B:218:0x09b2, B:219:0x09bc, B:220:0x09c8, B:222:0x09ce, B:227:0x0a20, B:229:0x0a70, B:231:0x0a7f, B:232:0x0ae5, B:237:0x0a9a, B:240:0x0a9d, B:242:0x09df, B:244:0x0a0b, B:251:0x0ab8, B:252:0x0acf, B:256:0x0ad0, B:267:0x0748, B:268:0x062d, B:272:0x055b, B:279:0x0389, B:280:0x0390, B:282:0x0396, B:285:0x03a2, B:290:0x01df, B:293:0x01eb, B:295:0x0202, B:300:0x021b, B:303:0x0259, B:305:0x025f, B:307:0x026d, B:309:0x027e, B:311:0x0289, B:312:0x0338, B:314:0x0343, B:316:0x02bc, B:318:0x02d6, B:323:0x02e1, B:326:0x02ea, B:327:0x031f, B:331:0x030c, B:339:0x0229, B:342:0x024f), top: B:44:0x019f, inners: #4, #6, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0a7f A[Catch: all -> 0x01c4, SQLiteException -> 0x0a95, TRY_LEAVE, TryCatch #6 {SQLiteException -> 0x0a95, blocks: (B:229:0x0a70, B:231:0x0a7f), top: B:228:0x0a70, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0a98  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x09df A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0748 A[Catch: all -> 0x01c4, TryCatch #2 {all -> 0x01c4, blocks: (B:45:0x019f, B:48:0x01ae, B:50:0x01b8, B:53:0x01c8, B:58:0x0373, B:61:0x03a8, B:63:0x03e8, B:65:0x03ed, B:66:0x0404, B:70:0x0417, B:72:0x042e, B:74:0x0435, B:75:0x044c, B:80:0x0476, B:84:0x0497, B:85:0x04ae, B:88:0x04bf, B:91:0x04dc, B:92:0x04f0, B:94:0x04fa, B:96:0x0507, B:98:0x050d, B:99:0x0516, B:101:0x0524, B:104:0x0539, B:107:0x0549, B:111:0x0573, B:112:0x0588, B:114:0x05b4, B:117:0x05cc, B:120:0x060f, B:121:0x063b, B:123:0x0678, B:124:0x067d, B:126:0x0685, B:127:0x068a, B:129:0x0692, B:130:0x0697, B:132:0x06a2, B:134:0x06ae, B:136:0x06bc, B:137:0x06c1, B:139:0x06ca, B:140:0x06ce, B:142:0x06db, B:143:0x06e0, B:145:0x0707, B:147:0x070f, B:148:0x0714, B:150:0x071c, B:151:0x071f, B:153:0x0743, B:155:0x074e, B:157:0x0757, B:158:0x0770, B:160:0x0776, B:163:0x078a, B:166:0x0796, B:169:0x07a3, B:262:0x07bd, B:172:0x07cd, B:176:0x07d6, B:177:0x07d9, B:179:0x07f7, B:181:0x07fb, B:183:0x080d, B:185:0x0811, B:187:0x081c, B:188:0x0825, B:190:0x086b, B:191:0x0870, B:193:0x0878, B:195:0x0881, B:196:0x0884, B:198:0x0891, B:200:0x08b1, B:201:0x08be, B:202:0x08f4, B:204:0x08fc, B:206:0x0906, B:207:0x0913, B:209:0x091d, B:210:0x092a, B:211:0x0936, B:213:0x093c, B:216:0x096c, B:218:0x09b2, B:219:0x09bc, B:220:0x09c8, B:222:0x09ce, B:227:0x0a20, B:229:0x0a70, B:231:0x0a7f, B:232:0x0ae5, B:237:0x0a9a, B:240:0x0a9d, B:242:0x09df, B:244:0x0a0b, B:251:0x0ab8, B:252:0x0acf, B:256:0x0ad0, B:267:0x0748, B:268:0x062d, B:272:0x055b, B:279:0x0389, B:280:0x0390, B:282:0x0396, B:285:0x03a2, B:290:0x01df, B:293:0x01eb, B:295:0x0202, B:300:0x021b, B:303:0x0259, B:305:0x025f, B:307:0x026d, B:309:0x027e, B:311:0x0289, B:312:0x0338, B:314:0x0343, B:316:0x02bc, B:318:0x02d6, B:323:0x02e1, B:326:0x02ea, B:327:0x031f, B:331:0x030c, B:339:0x0229, B:342:0x024f), top: B:44:0x019f, inners: #4, #6, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:268:0x062d A[Catch: all -> 0x01c4, TryCatch #2 {all -> 0x01c4, blocks: (B:45:0x019f, B:48:0x01ae, B:50:0x01b8, B:53:0x01c8, B:58:0x0373, B:61:0x03a8, B:63:0x03e8, B:65:0x03ed, B:66:0x0404, B:70:0x0417, B:72:0x042e, B:74:0x0435, B:75:0x044c, B:80:0x0476, B:84:0x0497, B:85:0x04ae, B:88:0x04bf, B:91:0x04dc, B:92:0x04f0, B:94:0x04fa, B:96:0x0507, B:98:0x050d, B:99:0x0516, B:101:0x0524, B:104:0x0539, B:107:0x0549, B:111:0x0573, B:112:0x0588, B:114:0x05b4, B:117:0x05cc, B:120:0x060f, B:121:0x063b, B:123:0x0678, B:124:0x067d, B:126:0x0685, B:127:0x068a, B:129:0x0692, B:130:0x0697, B:132:0x06a2, B:134:0x06ae, B:136:0x06bc, B:137:0x06c1, B:139:0x06ca, B:140:0x06ce, B:142:0x06db, B:143:0x06e0, B:145:0x0707, B:147:0x070f, B:148:0x0714, B:150:0x071c, B:151:0x071f, B:153:0x0743, B:155:0x074e, B:157:0x0757, B:158:0x0770, B:160:0x0776, B:163:0x078a, B:166:0x0796, B:169:0x07a3, B:262:0x07bd, B:172:0x07cd, B:176:0x07d6, B:177:0x07d9, B:179:0x07f7, B:181:0x07fb, B:183:0x080d, B:185:0x0811, B:187:0x081c, B:188:0x0825, B:190:0x086b, B:191:0x0870, B:193:0x0878, B:195:0x0881, B:196:0x0884, B:198:0x0891, B:200:0x08b1, B:201:0x08be, B:202:0x08f4, B:204:0x08fc, B:206:0x0906, B:207:0x0913, B:209:0x091d, B:210:0x092a, B:211:0x0936, B:213:0x093c, B:216:0x096c, B:218:0x09b2, B:219:0x09bc, B:220:0x09c8, B:222:0x09ce, B:227:0x0a20, B:229:0x0a70, B:231:0x0a7f, B:232:0x0ae5, B:237:0x0a9a, B:240:0x0a9d, B:242:0x09df, B:244:0x0a0b, B:251:0x0ab8, B:252:0x0acf, B:256:0x0ad0, B:267:0x0748, B:268:0x062d, B:272:0x055b, B:279:0x0389, B:280:0x0390, B:282:0x0396, B:285:0x03a2, B:290:0x01df, B:293:0x01eb, B:295:0x0202, B:300:0x021b, B:303:0x0259, B:305:0x025f, B:307:0x026d, B:309:0x027e, B:311:0x0289, B:312:0x0338, B:314:0x0343, B:316:0x02bc, B:318:0x02d6, B:323:0x02e1, B:326:0x02ea, B:327:0x031f, B:331:0x030c, B:339:0x0229, B:342:0x024f), top: B:44:0x019f, inners: #4, #6, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0389 A[Catch: all -> 0x01c4, TryCatch #2 {all -> 0x01c4, blocks: (B:45:0x019f, B:48:0x01ae, B:50:0x01b8, B:53:0x01c8, B:58:0x0373, B:61:0x03a8, B:63:0x03e8, B:65:0x03ed, B:66:0x0404, B:70:0x0417, B:72:0x042e, B:74:0x0435, B:75:0x044c, B:80:0x0476, B:84:0x0497, B:85:0x04ae, B:88:0x04bf, B:91:0x04dc, B:92:0x04f0, B:94:0x04fa, B:96:0x0507, B:98:0x050d, B:99:0x0516, B:101:0x0524, B:104:0x0539, B:107:0x0549, B:111:0x0573, B:112:0x0588, B:114:0x05b4, B:117:0x05cc, B:120:0x060f, B:121:0x063b, B:123:0x0678, B:124:0x067d, B:126:0x0685, B:127:0x068a, B:129:0x0692, B:130:0x0697, B:132:0x06a2, B:134:0x06ae, B:136:0x06bc, B:137:0x06c1, B:139:0x06ca, B:140:0x06ce, B:142:0x06db, B:143:0x06e0, B:145:0x0707, B:147:0x070f, B:148:0x0714, B:150:0x071c, B:151:0x071f, B:153:0x0743, B:155:0x074e, B:157:0x0757, B:158:0x0770, B:160:0x0776, B:163:0x078a, B:166:0x0796, B:169:0x07a3, B:262:0x07bd, B:172:0x07cd, B:176:0x07d6, B:177:0x07d9, B:179:0x07f7, B:181:0x07fb, B:183:0x080d, B:185:0x0811, B:187:0x081c, B:188:0x0825, B:190:0x086b, B:191:0x0870, B:193:0x0878, B:195:0x0881, B:196:0x0884, B:198:0x0891, B:200:0x08b1, B:201:0x08be, B:202:0x08f4, B:204:0x08fc, B:206:0x0906, B:207:0x0913, B:209:0x091d, B:210:0x092a, B:211:0x0936, B:213:0x093c, B:216:0x096c, B:218:0x09b2, B:219:0x09bc, B:220:0x09c8, B:222:0x09ce, B:227:0x0a20, B:229:0x0a70, B:231:0x0a7f, B:232:0x0ae5, B:237:0x0a9a, B:240:0x0a9d, B:242:0x09df, B:244:0x0a0b, B:251:0x0ab8, B:252:0x0acf, B:256:0x0ad0, B:267:0x0748, B:268:0x062d, B:272:0x055b, B:279:0x0389, B:280:0x0390, B:282:0x0396, B:285:0x03a2, B:290:0x01df, B:293:0x01eb, B:295:0x0202, B:300:0x021b, B:303:0x0259, B:305:0x025f, B:307:0x026d, B:309:0x027e, B:311:0x0289, B:312:0x0338, B:314:0x0343, B:316:0x02bc, B:318:0x02d6, B:323:0x02e1, B:326:0x02ea, B:327:0x031f, B:331:0x030c, B:339:0x0229, B:342:0x024f), top: B:44:0x019f, inners: #4, #6, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0343 A[Catch: all -> 0x01c4, TryCatch #2 {all -> 0x01c4, blocks: (B:45:0x019f, B:48:0x01ae, B:50:0x01b8, B:53:0x01c8, B:58:0x0373, B:61:0x03a8, B:63:0x03e8, B:65:0x03ed, B:66:0x0404, B:70:0x0417, B:72:0x042e, B:74:0x0435, B:75:0x044c, B:80:0x0476, B:84:0x0497, B:85:0x04ae, B:88:0x04bf, B:91:0x04dc, B:92:0x04f0, B:94:0x04fa, B:96:0x0507, B:98:0x050d, B:99:0x0516, B:101:0x0524, B:104:0x0539, B:107:0x0549, B:111:0x0573, B:112:0x0588, B:114:0x05b4, B:117:0x05cc, B:120:0x060f, B:121:0x063b, B:123:0x0678, B:124:0x067d, B:126:0x0685, B:127:0x068a, B:129:0x0692, B:130:0x0697, B:132:0x06a2, B:134:0x06ae, B:136:0x06bc, B:137:0x06c1, B:139:0x06ca, B:140:0x06ce, B:142:0x06db, B:143:0x06e0, B:145:0x0707, B:147:0x070f, B:148:0x0714, B:150:0x071c, B:151:0x071f, B:153:0x0743, B:155:0x074e, B:157:0x0757, B:158:0x0770, B:160:0x0776, B:163:0x078a, B:166:0x0796, B:169:0x07a3, B:262:0x07bd, B:172:0x07cd, B:176:0x07d6, B:177:0x07d9, B:179:0x07f7, B:181:0x07fb, B:183:0x080d, B:185:0x0811, B:187:0x081c, B:188:0x0825, B:190:0x086b, B:191:0x0870, B:193:0x0878, B:195:0x0881, B:196:0x0884, B:198:0x0891, B:200:0x08b1, B:201:0x08be, B:202:0x08f4, B:204:0x08fc, B:206:0x0906, B:207:0x0913, B:209:0x091d, B:210:0x092a, B:211:0x0936, B:213:0x093c, B:216:0x096c, B:218:0x09b2, B:219:0x09bc, B:220:0x09c8, B:222:0x09ce, B:227:0x0a20, B:229:0x0a70, B:231:0x0a7f, B:232:0x0ae5, B:237:0x0a9a, B:240:0x0a9d, B:242:0x09df, B:244:0x0a0b, B:251:0x0ab8, B:252:0x0acf, B:256:0x0ad0, B:267:0x0748, B:268:0x062d, B:272:0x055b, B:279:0x0389, B:280:0x0390, B:282:0x0396, B:285:0x03a2, B:290:0x01df, B:293:0x01eb, B:295:0x0202, B:300:0x021b, B:303:0x0259, B:305:0x025f, B:307:0x026d, B:309:0x027e, B:311:0x0289, B:312:0x0338, B:314:0x0343, B:316:0x02bc, B:318:0x02d6, B:323:0x02e1, B:326:0x02ea, B:327:0x031f, B:331:0x030c, B:339:0x0229, B:342:0x024f), top: B:44:0x019f, inners: #4, #6, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x03e8 A[Catch: all -> 0x01c4, TryCatch #2 {all -> 0x01c4, blocks: (B:45:0x019f, B:48:0x01ae, B:50:0x01b8, B:53:0x01c8, B:58:0x0373, B:61:0x03a8, B:63:0x03e8, B:65:0x03ed, B:66:0x0404, B:70:0x0417, B:72:0x042e, B:74:0x0435, B:75:0x044c, B:80:0x0476, B:84:0x0497, B:85:0x04ae, B:88:0x04bf, B:91:0x04dc, B:92:0x04f0, B:94:0x04fa, B:96:0x0507, B:98:0x050d, B:99:0x0516, B:101:0x0524, B:104:0x0539, B:107:0x0549, B:111:0x0573, B:112:0x0588, B:114:0x05b4, B:117:0x05cc, B:120:0x060f, B:121:0x063b, B:123:0x0678, B:124:0x067d, B:126:0x0685, B:127:0x068a, B:129:0x0692, B:130:0x0697, B:132:0x06a2, B:134:0x06ae, B:136:0x06bc, B:137:0x06c1, B:139:0x06ca, B:140:0x06ce, B:142:0x06db, B:143:0x06e0, B:145:0x0707, B:147:0x070f, B:148:0x0714, B:150:0x071c, B:151:0x071f, B:153:0x0743, B:155:0x074e, B:157:0x0757, B:158:0x0770, B:160:0x0776, B:163:0x078a, B:166:0x0796, B:169:0x07a3, B:262:0x07bd, B:172:0x07cd, B:176:0x07d6, B:177:0x07d9, B:179:0x07f7, B:181:0x07fb, B:183:0x080d, B:185:0x0811, B:187:0x081c, B:188:0x0825, B:190:0x086b, B:191:0x0870, B:193:0x0878, B:195:0x0881, B:196:0x0884, B:198:0x0891, B:200:0x08b1, B:201:0x08be, B:202:0x08f4, B:204:0x08fc, B:206:0x0906, B:207:0x0913, B:209:0x091d, B:210:0x092a, B:211:0x0936, B:213:0x093c, B:216:0x096c, B:218:0x09b2, B:219:0x09bc, B:220:0x09c8, B:222:0x09ce, B:227:0x0a20, B:229:0x0a70, B:231:0x0a7f, B:232:0x0ae5, B:237:0x0a9a, B:240:0x0a9d, B:242:0x09df, B:244:0x0a0b, B:251:0x0ab8, B:252:0x0acf, B:256:0x0ad0, B:267:0x0748, B:268:0x062d, B:272:0x055b, B:279:0x0389, B:280:0x0390, B:282:0x0396, B:285:0x03a2, B:290:0x01df, B:293:0x01eb, B:295:0x0202, B:300:0x021b, B:303:0x0259, B:305:0x025f, B:307:0x026d, B:309:0x027e, B:311:0x0289, B:312:0x0338, B:314:0x0343, B:316:0x02bc, B:318:0x02d6, B:323:0x02e1, B:326:0x02ea, B:327:0x031f, B:331:0x030c, B:339:0x0229, B:342:0x024f), top: B:44:0x019f, inners: #4, #6, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0415  */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void m31067D(zzaw zzawVar, zzq zzqVar) {
        int i11;
        boolean z11;
        long longValue;
        String str;
        String str2;
        C6099p9 c6099p9;
        String str3;
        C6034k c6034k;
        zzau zzauVar;
        long j11;
        long intValue;
        String str4;
        long j12;
        C6089p c6089p;
        String str5;
        String str6;
        C6100q m30994V;
        C6100q m31280c;
        C5641v4 m29872R1;
        long j13;
        long j14;
        C5286a6 m28873a;
        Map m28875b;
        ArrayList arrayList;
        C20307b m106009c;
        EnumC20305a enumC20305a;
        C6084o5 m30990R;
        List m31000c0;
        int i12;
        C6034k c6034k2;
        C5658w4 c5658w4;
        C6034k c6034k3;
        C6111r c6111r;
        int i13;
        ContentValues contentValues;
        String str7;
        Pair m30948m;
        Object obj;
        AbstractC4205o.m19722k(zzqVar);
        AbstractC4205o.m19718g(zzqVar.f34702p);
        long nanoTime = System.nanoTime();
        mo31037v().mo31036g();
        m31082e();
        String str8 = zzqVar.f34702p;
        m31060R(this.f34176g);
        if (!C6077n9.m31156l(zzawVar, zzqVar)) {
            return;
        }
        if (zzqVar.f34709w) {
            C6061m4 c6061m4 = this.f34170a;
            m31060R(c6061m4);
            String str9 = "_err";
            if (c6061m4.m31124F(str8, zzawVar.f34676p)) {
                mo31033c().m31202w().m31110c("Dropping blocked event. appId", C6082o3.m31193z(str8), this.f34181l.m31372D().m30964d(zzawVar.f34676p));
                C6061m4 c6061m42 = this.f34170a;
                m31060R(c6061m42);
                if (!c6061m42.m31122D(str8)) {
                    C6061m4 c6061m43 = this.f34170a;
                    m31060R(c6061m43);
                    if (!c6061m43.m31125G(str8)) {
                        if (!"_err".equals(zzawVar.f34676p)) {
                            m31087h0().m31317C(this.f34169E, str8, 11, "_ev", zzawVar.f34676p, 0);
                            return;
                        }
                        return;
                    }
                }
                C6034k c6034k4 = this.f34172c;
                m31060R(c6034k4);
                C6084o5 m30990R2 = c6034k4.m30990R(str8);
                if (m30990R2 != null) {
                    long abs = Math.abs(mo31031a().mo105913a() - Math.max(m30990R2.m31230Z(), m30990R2.m31221Q()));
                    m31072U();
                    if (abs > ((Long) AbstractC5972e3.f33874B.m30827a(null)).longValue()) {
                        mo31033c().m31196p().m31108a("Fetching config for blocked app");
                        m31086h(m30990R2);
                        return;
                    }
                    return;
                }
                return;
            }
            C6093p3 m31273b = C6093p3.m31273b(zzawVar);
            m31087h0().m31316B(m31273b, m31072U().m30923m(str8));
            C5531od.m29487b();
            if (m31072U().m30913B(null, AbstractC5972e3.f33877C0)) {
                i11 = m31072U().m30925o(str8, AbstractC5972e3.f33899S, 10, 35);
            } else {
                i11 = 0;
            }
            Iterator it = new TreeSet(m31273b.f34323d.keySet()).iterator();
            while (it.hasNext()) {
                String str10 = (String) it.next();
                if ("items".equals(str10)) {
                    C6121r9 m31087h0 = m31087h0();
                    Iterator it2 = it;
                    Parcelable[] parcelableArray = m31273b.f34323d.getParcelableArray(str10);
                    C5531od.m29487b();
                    m31087h0.m31315A(parcelableArray, i11, m31072U().m30913B(null, AbstractC5972e3.f33877C0));
                    it = it2;
                    str9 = str9;
                    nanoTime = nanoTime;
                }
            }
            long j15 = nanoTime;
            String str11 = str9;
            zzaw m31274a = m31273b.m31274a();
            if (Log.isLoggable(mo31033c().m31194D(), 2)) {
                mo31033c().m31201u().m31109b("Logging event", this.f34181l.m31372D().m30963c(m31274a));
            }
            C5480ld.m29433b();
            m31072U().m30913B(null, AbstractC5972e3.f33958z0);
            C6034k c6034k5 = this.f34172c;
            m31060R(c6034k5);
            c6034k5.m31002e0();
            try {
                m31070S(zzqVar);
                if ("ecommerce_purchase".equals(m31274a.f34676p) || "purchase".equals(m31274a.f34676p) || "refund".equals(m31274a.f34676p)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!"_iap".equals(m31274a.f34676p)) {
                    if (z11) {
                        z11 = true;
                    }
                    str = "metadata_fingerprint";
                    str2 = "app_id";
                    str3 = str11;
                    boolean m31301Z = C6121r9.m31301Z(m31274a.f34676p);
                    boolean equals = str3.equals(m31274a.f34676p);
                    m31087h0();
                    zzauVar = m31274a.f34677q;
                    if (zzauVar != null) {
                        j11 = 0;
                    } else {
                        C6111r c6111r2 = new C6111r(zzauVar);
                        j11 = 0;
                        while (c6111r2.hasNext()) {
                            if (zzauVar.m31512M(c6111r2.next()) instanceof Parcelable[]) {
                                j11 += ((Parcelable[]) r14).length;
                            }
                        }
                    }
                    C6034k c6034k6 = this.f34172c;
                    m31060R(c6034k6);
                    C6012i m30993U = c6034k6.m30993U(m31069F(), str8, j11 + 1, true, m31301Z, false, equals, false);
                    long j16 = m30993U.f34073b;
                    m31072U();
                    intValue = j16 - ((Integer) AbstractC5972e3.f33931m.m30827a(null)).intValue();
                    if (intValue <= 0) {
                        if (intValue % 1000 == 1) {
                            mo31033c().m31197q().m31110c("Data loss. Too many events logged. appId, count", C6082o3.m31193z(str8), Long.valueOf(m30993U.f34073b));
                        }
                        C6034k c6034k7 = this.f34172c;
                        m31060R(c6034k7);
                        c6034k7.m31008n();
                        C6034k c6034k8 = this.f34172c;
                        m31060R(c6034k8);
                        c6034k8.m31003f0();
                        return;
                    }
                    if (m31301Z) {
                        long j17 = m30993U.f34072a;
                        m31072U();
                        long intValue2 = j17 - ((Integer) AbstractC5972e3.f33935o.m30827a(null)).intValue();
                        if (intValue2 > 0) {
                            if (intValue2 % 1000 == 1) {
                                mo31033c().m31197q().m31110c("Data loss. Too many public events logged. appId, count", C6082o3.m31193z(str8), Long.valueOf(m30993U.f34072a));
                            }
                            m31087h0().m31317C(this.f34169E, str8, 16, "_ev", m31274a.f34676p, 0);
                            C6034k c6034k9 = this.f34172c;
                            m31060R(c6034k9);
                            c6034k9.m31008n();
                            C6034k c6034k10 = this.f34172c;
                            m31060R(c6034k10);
                            c6034k10.m31003f0();
                            return;
                        }
                    }
                    if (equals) {
                        long max = m30993U.f34075d - Math.max(0, Math.min(1000000, m31072U().m30924n(zzqVar.f34702p, AbstractC5972e3.f33933n)));
                        if (max > 0) {
                            if (max == 1) {
                                mo31033c().m31197q().m31110c("Too many error events logged. appId, count", C6082o3.m31193z(str8), Long.valueOf(m30993U.f34075d));
                            }
                            C6034k c6034k11 = this.f34172c;
                            m31060R(c6034k11);
                            c6034k11.m31008n();
                            C6034k c6034k12 = this.f34172c;
                            m31060R(c6034k12);
                            c6034k12.m31003f0();
                            return;
                        }
                    }
                    Bundle m31509F = m31274a.f34677q.m31509F();
                    m31087h0().m31318D(m31509F, "_o", m31274a.f34678r);
                    if (m31087h0().m31335U(str8)) {
                        m31087h0().m31318D(m31509F, "_dbg", 1L);
                        m31087h0().m31318D(m31509F, "_r", 1L);
                    }
                    if ("_s".equals(m31274a.f34676p)) {
                        C6034k c6034k13 = this.f34172c;
                        m31060R(c6034k13);
                        C6099p9 m30995X = c6034k13.m30995X(zzqVar.f34702p, "_sno");
                        if (m30995X != null && (m30995X.f34342e instanceof Long)) {
                            m31087h0().m31318D(m31509F, "_sno", m30995X.f34342e);
                        }
                    }
                    C6034k c6034k14 = this.f34172c;
                    m31060R(c6034k14);
                    AbstractC4205o.m19718g(str8);
                    c6034k14.mo31036g();
                    c6034k14.m31504h();
                    try {
                        try {
                            str4 = "raw_events";
                        } catch (SQLiteException e11) {
                            e = e11;
                            str4 = "raw_events";
                        }
                        try {
                            j12 = c6034k14.m30988P().delete(str4, "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str8, String.valueOf(Math.max(0, Math.min(1000000, c6034k14.f34158a.m31401z().m30924n(str8, AbstractC5972e3.f33941r))))});
                        } catch (SQLiteException e12) {
                            e = e12;
                            c6034k14.f34158a.mo31033c().m31197q().m31110c("Error deleting over the limit events. appId", C6082o3.m31193z(str8), e);
                            j12 = 0;
                            if (j12 > 0) {
                            }
                            C6127s4 c6127s4 = this.f34181l;
                            String str12 = m31274a.f34678r;
                            String str13 = m31274a.f34676p;
                            long j18 = m31274a.f34679s;
                            str5 = str4;
                            str6 = "_r";
                            c6089p = new C6089p(c6127s4, str12, str8, str13, j18, 0L, m31509F);
                            C6034k c6034k15 = this.f34172c;
                            m31060R(c6034k15);
                            m30994V = c6034k15.m30994V(str8, c6089p.f34312b);
                            if (m30994V != null) {
                            }
                            C6034k c6034k16 = this.f34172c;
                            m31060R(c6034k16);
                            c6034k16.m31010p(m31280c);
                            mo31037v().mo31036g();
                            m31082e();
                            AbstractC4205o.m19722k(c6089p);
                            AbstractC4205o.m19722k(zzqVar);
                            AbstractC4205o.m19718g(c6089p.f34311a);
                            AbstractC4205o.m19712a(c6089p.f34311a.equals(zzqVar.f34702p));
                            m29872R1 = C5658w4.m29872R1();
                            m29872R1.m29736Y(1);
                            m29872R1.m29731T("android");
                            if (!TextUtils.isEmpty(zzqVar.f34702p)) {
                            }
                            if (!TextUtils.isEmpty(zzqVar.f34705s)) {
                            }
                            if (!TextUtils.isEmpty(zzqVar.f34704r)) {
                            }
                            C5617te.m29656b();
                            if (!TextUtils.isEmpty(zzqVar.f34699M)) {
                                m29872R1.m29740d0(zzqVar.f34699M);
                            }
                            j13 = zzqVar.f34711y;
                            if (j13 != -2147483648L) {
                            }
                            m29872R1.m29723O(zzqVar.f34706t);
                            if (!TextUtils.isEmpty(zzqVar.f34703q)) {
                            }
                            m29872R1.m29699A(m31073V((String) AbstractC4205o.m19722k(zzqVar.f34702p)).m106009c(C20307b.m106004b(zzqVar.f34697K)).m106013h());
                            if (m29872R1.m29752p0().isEmpty()) {
                                m29872R1.m29753q(zzqVar.f34692F);
                            }
                            j14 = zzqVar.f34707u;
                            if (j14 != 0) {
                            }
                            m29872R1.m29707E(zzqVar.f34694H);
                            C6077n9 c6077n9 = this.f34176g;
                            m31060R(c6077n9);
                            m28873a = C5286a6.m28873a(c6077n9.f34628b.f34181l.mo31032b().getContentResolver(), AbstractC5473l6.m29403a("com.google.android.gms.measurement"), RunnableC20309c.f100290p);
                            if (m28873a != null) {
                            }
                            if (m28875b != null) {
                                arrayList = new ArrayList();
                                int intValue3 = ((Integer) AbstractC5972e3.f33898R.m30827a(null)).intValue();
                                while (r8.hasNext()) {
                                }
                                if (arrayList.isEmpty()) {
                                }
                                if (arrayList != null) {
                                }
                                m106009c = m31073V((String) AbstractC4205o.m19722k(zzqVar.f34702p)).m106009c(C20307b.m106004b(zzqVar.f34697K));
                                enumC20305a = EnumC20305a.AD_STORAGE;
                                if (m106009c.m106014i(enumC20305a)) {
                                }
                                this.f34181l.m31369A().m31140j();
                                m29872R1.m29703C(Build.MODEL);
                                this.f34181l.m31369A().m31140j();
                                m29872R1.m29730S(Build.VERSION.RELEASE);
                                m29872R1.m29743g0((int) this.f34181l.m31369A().m31182o());
                                m29872R1.m29747l0(this.f34181l.m31369A().m31183p());
                                C5684xd.m30030b();
                                if (m31072U().m30913B(null, AbstractC5972e3.f33885G0)) {
                                }
                                if (this.f34181l.m31394n()) {
                                }
                                C6034k c6034k17 = this.f34172c;
                                m31060R(c6034k17);
                                m30990R = c6034k17.m30990R(zzqVar.f34702p);
                                if (m30990R == null) {
                                }
                                if (m106009c.m106014i(EnumC20305a.ANALYTICS_STORAGE)) {
                                }
                                if (!TextUtils.isEmpty(m30990R.m31256m0())) {
                                }
                                C6034k c6034k18 = this.f34172c;
                                m31060R(c6034k18);
                                m31000c0 = c6034k18.m31000c0(zzqVar.f34702p);
                                while (i12 < m31000c0.size()) {
                                }
                                c6034k2 = this.f34172c;
                                m31060R(c6034k2);
                                c5658w4 = (C5658w4) m29872R1.m29557k();
                                c6034k2.mo31036g();
                                c6034k2.m31504h();
                                AbstractC4205o.m19722k(c5658w4);
                                AbstractC4205o.m19718g(c5658w4.m29956V1());
                                byte[] m29188f = c5658w4.m29188f();
                                C6077n9 c6077n92 = c6034k2.f34628b.f34176g;
                                m31060R(c6077n92);
                                long m31178x = c6077n92.m31178x(m29188f);
                                ContentValues contentValues2 = new ContentValues();
                                String str14 = str2;
                                contentValues2.put(str14, c5658w4.m29956V1());
                                String str15 = str;
                                contentValues2.put(str15, Long.valueOf(m31178x));
                                contentValues2.put("metadata", m29188f);
                                c6034k2.m30988P().insertWithOnConflict("raw_events_metadata", null, contentValues2, 4);
                                c6034k3 = this.f34172c;
                                m31060R(c6034k3);
                                c6111r = new C6111r(c6089p.f34316f);
                                while (true) {
                                    if (!c6111r.hasNext()) {
                                    }
                                    str6 = str7;
                                }
                                c6034k3.mo31036g();
                                c6034k3.m31504h();
                                AbstractC4205o.m19722k(c6089p);
                                AbstractC4205o.m19718g(c6089p.f34311a);
                                C6077n9 c6077n93 = c6034k3.f34628b.f34176g;
                                m31060R(c6077n93);
                                byte[] m29188f2 = c6077n93.m31168B(c6089p).m29188f();
                                contentValues = new ContentValues();
                                contentValues.put(str14, c6089p.f34311a);
                                contentValues.put("name", c6089p.f34312b);
                                contentValues.put("timestamp", Long.valueOf(c6089p.f34314d));
                                contentValues.put(str15, Long.valueOf(m31178x));
                                contentValues.put("data", m29188f2);
                                contentValues.put("realtime", Integer.valueOf(i13));
                                if (c6034k3.m30988P().insert(str5, null, contentValues) != -1) {
                                }
                                C6034k c6034k19 = this.f34172c;
                                m31060R(c6034k19);
                                c6034k19.m31008n();
                                C6034k c6034k20 = this.f34172c;
                                m31060R(c6034k20);
                                c6034k20.m31003f0();
                                m31055M();
                                mo31033c().m31201u().m31109b("Background event processing time, ms", Long.valueOf(((System.nanoTime() - j15) + 500000) / 1000000));
                                return;
                            }
                            arrayList = null;
                            if (arrayList != null) {
                            }
                            m106009c = m31073V((String) AbstractC4205o.m19722k(zzqVar.f34702p)).m106009c(C20307b.m106004b(zzqVar.f34697K));
                            enumC20305a = EnumC20305a.AD_STORAGE;
                            if (m106009c.m106014i(enumC20305a)) {
                            }
                            this.f34181l.m31369A().m31140j();
                            m29872R1.m29703C(Build.MODEL);
                            this.f34181l.m31369A().m31140j();
                            m29872R1.m29730S(Build.VERSION.RELEASE);
                            m29872R1.m29743g0((int) this.f34181l.m31369A().m31182o());
                            m29872R1.m29747l0(this.f34181l.m31369A().m31183p());
                            C5684xd.m30030b();
                            if (m31072U().m30913B(null, AbstractC5972e3.f33885G0)) {
                            }
                            if (this.f34181l.m31394n()) {
                            }
                            C6034k c6034k172 = this.f34172c;
                            m31060R(c6034k172);
                            m30990R = c6034k172.m30990R(zzqVar.f34702p);
                            if (m30990R == null) {
                            }
                            if (m106009c.m106014i(EnumC20305a.ANALYTICS_STORAGE)) {
                            }
                            if (!TextUtils.isEmpty(m30990R.m31256m0())) {
                            }
                            C6034k c6034k182 = this.f34172c;
                            m31060R(c6034k182);
                            m31000c0 = c6034k182.m31000c0(zzqVar.f34702p);
                            while (i12 < m31000c0.size()) {
                            }
                            c6034k2 = this.f34172c;
                            m31060R(c6034k2);
                            c5658w4 = (C5658w4) m29872R1.m29557k();
                            c6034k2.mo31036g();
                            c6034k2.m31504h();
                            AbstractC4205o.m19722k(c5658w4);
                            AbstractC4205o.m19718g(c5658w4.m29956V1());
                            byte[] m29188f3 = c5658w4.m29188f();
                            C6077n9 c6077n922 = c6034k2.f34628b.f34176g;
                            m31060R(c6077n922);
                            long m31178x2 = c6077n922.m31178x(m29188f3);
                            ContentValues contentValues22 = new ContentValues();
                            String str142 = str2;
                            contentValues22.put(str142, c5658w4.m29956V1());
                            String str152 = str;
                            contentValues22.put(str152, Long.valueOf(m31178x2));
                            contentValues22.put("metadata", m29188f3);
                            c6034k2.m30988P().insertWithOnConflict("raw_events_metadata", null, contentValues22, 4);
                            c6034k3 = this.f34172c;
                            m31060R(c6034k3);
                            c6111r = new C6111r(c6089p.f34316f);
                            while (true) {
                                if (!c6111r.hasNext()) {
                                }
                                str6 = str7;
                            }
                            c6034k3.mo31036g();
                            c6034k3.m31504h();
                            AbstractC4205o.m19722k(c6089p);
                            AbstractC4205o.m19718g(c6089p.f34311a);
                            C6077n9 c6077n932 = c6034k3.f34628b.f34176g;
                            m31060R(c6077n932);
                            byte[] m29188f22 = c6077n932.m31168B(c6089p).m29188f();
                            contentValues = new ContentValues();
                            contentValues.put(str142, c6089p.f34311a);
                            contentValues.put("name", c6089p.f34312b);
                            contentValues.put("timestamp", Long.valueOf(c6089p.f34314d));
                            contentValues.put(str152, Long.valueOf(m31178x2));
                            contentValues.put("data", m29188f22);
                            contentValues.put("realtime", Integer.valueOf(i13));
                            if (c6034k3.m30988P().insert(str5, null, contentValues) != -1) {
                            }
                            C6034k c6034k192 = this.f34172c;
                            m31060R(c6034k192);
                            c6034k192.m31008n();
                            C6034k c6034k202 = this.f34172c;
                            m31060R(c6034k202);
                            c6034k202.m31003f0();
                            m31055M();
                            mo31033c().m31201u().m31109b("Background event processing time, ms", Long.valueOf(((System.nanoTime() - j15) + 500000) / 1000000));
                            return;
                        }
                    } catch (SQLiteException e13) {
                        e = e13;
                        str4 = "raw_events";
                    }
                    if (j12 > 0) {
                        mo31033c().m31202w().m31110c("Data lost. Too many events stored on disk, deleted. appId", C6082o3.m31193z(str8), Long.valueOf(j12));
                    }
                    C6127s4 c6127s42 = this.f34181l;
                    String str122 = m31274a.f34678r;
                    String str132 = m31274a.f34676p;
                    long j182 = m31274a.f34679s;
                    str5 = str4;
                    str6 = "_r";
                    c6089p = new C6089p(c6127s42, str122, str8, str132, j182, 0L, m31509F);
                    C6034k c6034k152 = this.f34172c;
                    m31060R(c6034k152);
                    m30994V = c6034k152.m30994V(str8, c6089p.f34312b);
                    if (m30994V != null) {
                        C6034k c6034k21 = this.f34172c;
                        m31060R(c6034k21);
                        if (c6034k21.m30987O(str8) >= m31072U().m30921k(str8) && m31301Z) {
                            mo31033c().m31197q().m31111d("Too many event names used, ignoring event. appId, name, supported count", C6082o3.m31193z(str8), this.f34181l.m31372D().m30964d(c6089p.f34312b), Integer.valueOf(m31072U().m30921k(str8)));
                            m31087h0().m31317C(this.f34169E, str8, 8, null, null, 0);
                            C6034k c6034k22 = this.f34172c;
                            m31060R(c6034k22);
                            c6034k22.m31003f0();
                            return;
                        }
                        m31280c = new C6100q(str8, c6089p.f34312b, 0L, 0L, 0L, c6089p.f34314d, 0L, null, null, null, null);
                    } else {
                        c6089p = c6089p.m31272a(this.f34181l, m30994V.f34348f);
                        m31280c = m30994V.m31280c(c6089p.f34314d);
                    }
                    C6034k c6034k162 = this.f34172c;
                    m31060R(c6034k162);
                    c6034k162.m31010p(m31280c);
                    mo31037v().mo31036g();
                    m31082e();
                    AbstractC4205o.m19722k(c6089p);
                    AbstractC4205o.m19722k(zzqVar);
                    AbstractC4205o.m19718g(c6089p.f34311a);
                    AbstractC4205o.m19712a(c6089p.f34311a.equals(zzqVar.f34702p));
                    m29872R1 = C5658w4.m29872R1();
                    m29872R1.m29736Y(1);
                    m29872R1.m29731T("android");
                    if (!TextUtils.isEmpty(zzqVar.f34702p)) {
                        m29872R1.m29755r(zzqVar.f34702p);
                    }
                    if (!TextUtils.isEmpty(zzqVar.f34705s)) {
                        m29872R1.m29760u(zzqVar.f34705s);
                    }
                    if (!TextUtils.isEmpty(zzqVar.f34704r)) {
                        m29872R1.m29762v(zzqVar.f34704r);
                    }
                    C5617te.m29656b();
                    if (!TextUtils.isEmpty(zzqVar.f34699M) && (m31072U().m30913B(null, AbstractC5972e3.f33936o0) || m31072U().m30913B(zzqVar.f34702p, AbstractC5972e3.f33940q0))) {
                        m29872R1.m29740d0(zzqVar.f34699M);
                    }
                    j13 = zzqVar.f34711y;
                    if (j13 != -2147483648L) {
                        m29872R1.m29764w((int) j13);
                    }
                    m29872R1.m29723O(zzqVar.f34706t);
                    if (!TextUtils.isEmpty(zzqVar.f34703q)) {
                        m29872R1.m29721N(zzqVar.f34703q);
                    }
                    m29872R1.m29699A(m31073V((String) AbstractC4205o.m19722k(zzqVar.f34702p)).m106009c(C20307b.m106004b(zzqVar.f34697K)).m106013h());
                    if (m29872R1.m29752p0().isEmpty() && !TextUtils.isEmpty(zzqVar.f34692F)) {
                        m29872R1.m29753q(zzqVar.f34692F);
                    }
                    j14 = zzqVar.f34707u;
                    if (j14 != 0) {
                        m29872R1.m29701B(j14);
                    }
                    m29872R1.m29707E(zzqVar.f34694H);
                    C6077n9 c6077n94 = this.f34176g;
                    m31060R(c6077n94);
                    m28873a = C5286a6.m28873a(c6077n94.f34628b.f34181l.mo31032b().getContentResolver(), AbstractC5473l6.m29403a("com.google.android.gms.measurement"), RunnableC20309c.f100290p);
                    if (m28873a != null) {
                        m28875b = Collections.emptyMap();
                    } else {
                        m28875b = m28873a.m28875b();
                    }
                    try {
                        if (m28875b != null && !m28875b.isEmpty()) {
                            arrayList = new ArrayList();
                            int intValue32 = ((Integer) AbstractC5972e3.f33898R.m30827a(null)).intValue();
                            for (Map.Entry entry : m28875b.entrySet()) {
                                if (((String) entry.getKey()).startsWith("measurement.id.")) {
                                    try {
                                        int parseInt = Integer.parseInt((String) entry.getValue());
                                        if (parseInt != 0) {
                                            arrayList.add(Integer.valueOf(parseInt));
                                            if (arrayList.size() >= intValue32) {
                                                c6077n94.f34158a.mo31033c().m31202w().m31109b("Too many experiment IDs. Number of IDs", Integer.valueOf(arrayList.size()));
                                                break;
                                            }
                                            continue;
                                        } else {
                                            continue;
                                        }
                                    } catch (NumberFormatException e14) {
                                        c6077n94.f34158a.mo31033c().m31202w().m31109b("Experiment ID NumberFormatException", e14);
                                    }
                                }
                            }
                            if (arrayList.isEmpty()) {
                            }
                            if (arrayList != null) {
                                m29872R1.m29771z0(arrayList);
                            }
                            m106009c = m31073V((String) AbstractC4205o.m19722k(zzqVar.f34702p)).m106009c(C20307b.m106004b(zzqVar.f34697K));
                            enumC20305a = EnumC20305a.AD_STORAGE;
                            if (m106009c.m106014i(enumC20305a) && zzqVar.f34690D) {
                                m30948m = this.f34178i.m30948m(zzqVar.f34702p, m106009c);
                                if (!TextUtils.isEmpty((CharSequence) m30948m.first) && zzqVar.f34690D) {
                                    m29872R1.m29737a0((String) m30948m.first);
                                    obj = m30948m.second;
                                    if (obj != null) {
                                        m29872R1.m29728R(((Boolean) obj).booleanValue());
                                    }
                                }
                            }
                            this.f34181l.m31369A().m31140j();
                            m29872R1.m29703C(Build.MODEL);
                            this.f34181l.m31369A().m31140j();
                            m29872R1.m29730S(Build.VERSION.RELEASE);
                            m29872R1.m29743g0((int) this.f34181l.m31369A().m31182o());
                            m29872R1.m29747l0(this.f34181l.m31369A().m31183p());
                            C5684xd.m30030b();
                            if (m31072U().m30913B(null, AbstractC5972e3.f33885G0)) {
                                m29872R1.m29742f0(zzqVar.f34701O);
                            }
                            if (this.f34181l.m31394n()) {
                                m29872R1.m29749n0();
                                if (!TextUtils.isEmpty(null)) {
                                    m29872R1.m29705D(null);
                                }
                            }
                            C6034k c6034k1722 = this.f34172c;
                            m31060R(c6034k1722);
                            m30990R = c6034k1722.m30990R(zzqVar.f34702p);
                            if (m30990R == null) {
                                m30990R = new C6084o5(this.f34181l, zzqVar.f34702p);
                                m30990R.m31247i(m31089i0(m106009c));
                                m30990R.m31267w(zzqVar.f34712z);
                                m30990R.m31268x(zzqVar.f34703q);
                                if (m106009c.m106014i(enumC20305a)) {
                                    m30990R.m31211G(this.f34178i.m30949n(zzqVar.f34702p, zzqVar.f34690D));
                                }
                                m30990R.m31207C(0L);
                                m30990R.m31208D(0L);
                                m30990R.m31206B(0L);
                                m30990R.m31251k(zzqVar.f34704r);
                                m30990R.m31253l(zzqVar.f34711y);
                                m30990R.m31249j(zzqVar.f34705s);
                                m30990R.m31269y(zzqVar.f34706t);
                                m30990R.m31264t(zzqVar.f34707u);
                                m30990R.m31209E(zzqVar.f34709w);
                                m30990R.m31265u(zzqVar.f34694H);
                                C6034k c6034k23 = this.f34172c;
                                m31060R(c6034k23);
                                c6034k23.m31009o(m30990R);
                            }
                            if (m106009c.m106014i(EnumC20305a.ANALYTICS_STORAGE) && !TextUtils.isEmpty(m30990R.m31250j0())) {
                                m29872R1.m29757s((String) AbstractC4205o.m19722k(m30990R.m31250j0()));
                            }
                            if (!TextUtils.isEmpty(m30990R.m31256m0())) {
                                m29872R1.m29718L((String) AbstractC4205o.m19722k(m30990R.m31256m0()));
                            }
                            C6034k c6034k1822 = this.f34172c;
                            m31060R(c6034k1822);
                            m31000c0 = c6034k1822.m31000c0(zzqVar.f34702p);
                            for (i12 = 0; i12 < m31000c0.size(); i12++) {
                                C5353e5 m29116D = C5370f5.m29116D();
                                m29116D.m29078u(((C6099p9) m31000c0.get(i12)).f34340c);
                                m29116D.m29079v(((C6099p9) m31000c0.get(i12)).f34341d);
                                C6077n9 c6077n95 = this.f34176g;
                                m31060R(c6077n95);
                                c6077n95.m31175K(m29116D, ((C6099p9) m31000c0.get(i12)).f34342e);
                                m29872R1.m29706D0(m29116D);
                            }
                            c6034k2 = this.f34172c;
                            m31060R(c6034k2);
                            c5658w4 = (C5658w4) m29872R1.m29557k();
                            c6034k2.mo31036g();
                            c6034k2.m31504h();
                            AbstractC4205o.m19722k(c5658w4);
                            AbstractC4205o.m19718g(c5658w4.m29956V1());
                            byte[] m29188f32 = c5658w4.m29188f();
                            C6077n9 c6077n9222 = c6034k2.f34628b.f34176g;
                            m31060R(c6077n9222);
                            long m31178x22 = c6077n9222.m31178x(m29188f32);
                            ContentValues contentValues222 = new ContentValues();
                            String str1422 = str2;
                            contentValues222.put(str1422, c5658w4.m29956V1());
                            String str1522 = str;
                            contentValues222.put(str1522, Long.valueOf(m31178x22));
                            contentValues222.put("metadata", m29188f32);
                            c6034k2.m30988P().insertWithOnConflict("raw_events_metadata", null, contentValues222, 4);
                            c6034k3 = this.f34172c;
                            m31060R(c6034k3);
                            c6111r = new C6111r(c6089p.f34316f);
                            while (true) {
                                if (!c6111r.hasNext()) {
                                    str7 = str6;
                                    if (str7.equals(c6111r.next())) {
                                        break;
                                    } else {
                                        str6 = str7;
                                    }
                                } else {
                                    C6061m4 c6061m44 = this.f34170a;
                                    m31060R(c6061m44);
                                    boolean m31123E = c6061m44.m31123E(c6089p.f34311a, c6089p.f34312b);
                                    C6034k c6034k24 = this.f34172c;
                                    m31060R(c6034k24);
                                    C6012i m30992T = c6034k24.m30992T(m31069F(), c6089p.f34311a, false, false, false, false, false);
                                    if (!m31123E || m30992T.f34076e >= m31072U().m30924n(c6089p.f34311a, AbstractC5972e3.f33939q)) {
                                        i13 = 0;
                                    }
                                }
                            }
                            c6034k3.mo31036g();
                            c6034k3.m31504h();
                            AbstractC4205o.m19722k(c6089p);
                            AbstractC4205o.m19718g(c6089p.f34311a);
                            C6077n9 c6077n9322 = c6034k3.f34628b.f34176g;
                            m31060R(c6077n9322);
                            byte[] m29188f222 = c6077n9322.m31168B(c6089p).m29188f();
                            contentValues = new ContentValues();
                            contentValues.put(str1422, c6089p.f34311a);
                            contentValues.put("name", c6089p.f34312b);
                            contentValues.put("timestamp", Long.valueOf(c6089p.f34314d));
                            contentValues.put(str1522, Long.valueOf(m31178x22));
                            contentValues.put("data", m29188f222);
                            contentValues.put("realtime", Integer.valueOf(i13));
                            if (c6034k3.m30988P().insert(str5, null, contentValues) != -1) {
                                c6034k3.f34158a.mo31033c().m31197q().m31109b("Failed to insert raw event (got -1). appId", C6082o3.m31193z(c6089p.f34311a));
                            } else {
                                this.f34184o = 0L;
                            }
                            C6034k c6034k1922 = this.f34172c;
                            m31060R(c6034k1922);
                            c6034k1922.m31008n();
                            C6034k c6034k2022 = this.f34172c;
                            m31060R(c6034k2022);
                            c6034k2022.m31003f0();
                            m31055M();
                            mo31033c().m31201u().m31109b("Background event processing time, ms", Long.valueOf(((System.nanoTime() - j15) + 500000) / 1000000));
                            return;
                        }
                        c6034k2.m30988P().insertWithOnConflict("raw_events_metadata", null, contentValues222, 4);
                        c6034k3 = this.f34172c;
                        m31060R(c6034k3);
                        c6111r = new C6111r(c6089p.f34316f);
                        while (true) {
                            if (!c6111r.hasNext()) {
                            }
                            str6 = str7;
                        }
                        c6034k3.mo31036g();
                        c6034k3.m31504h();
                        AbstractC4205o.m19722k(c6089p);
                        AbstractC4205o.m19718g(c6089p.f34311a);
                        C6077n9 c6077n93222 = c6034k3.f34628b.f34176g;
                        m31060R(c6077n93222);
                        byte[] m29188f2222 = c6077n93222.m31168B(c6089p).m29188f();
                        contentValues = new ContentValues();
                        contentValues.put(str1422, c6089p.f34311a);
                        contentValues.put("name", c6089p.f34312b);
                        contentValues.put("timestamp", Long.valueOf(c6089p.f34314d));
                        contentValues.put(str1522, Long.valueOf(m31178x22));
                        contentValues.put("data", m29188f2222);
                        contentValues.put("realtime", Integer.valueOf(i13));
                        if (c6034k3.m30988P().insert(str5, null, contentValues) != -1) {
                        }
                        C6034k c6034k19222 = this.f34172c;
                        m31060R(c6034k19222);
                        c6034k19222.m31008n();
                        C6034k c6034k20222 = this.f34172c;
                        m31060R(c6034k20222);
                        c6034k20222.m31003f0();
                        m31055M();
                        mo31033c().m31201u().m31109b("Background event processing time, ms", Long.valueOf(((System.nanoTime() - j15) + 500000) / 1000000));
                        return;
                    } catch (SQLiteException e15) {
                        c6034k2.f34158a.mo31033c().m31197q().m31110c("Error storing raw event metadata. appId", C6082o3.m31193z(c5658w4.m29956V1()), e15);
                        throw e15;
                    }
                    arrayList = null;
                    if (arrayList != null) {
                    }
                    m106009c = m31073V((String) AbstractC4205o.m19722k(zzqVar.f34702p)).m106009c(C20307b.m106004b(zzqVar.f34697K));
                    enumC20305a = EnumC20305a.AD_STORAGE;
                    if (m106009c.m106014i(enumC20305a)) {
                        m30948m = this.f34178i.m30948m(zzqVar.f34702p, m106009c);
                        if (!TextUtils.isEmpty((CharSequence) m30948m.first)) {
                            m29872R1.m29737a0((String) m30948m.first);
                            obj = m30948m.second;
                            if (obj != null) {
                            }
                        }
                    }
                    this.f34181l.m31369A().m31140j();
                    m29872R1.m29703C(Build.MODEL);
                    this.f34181l.m31369A().m31140j();
                    m29872R1.m29730S(Build.VERSION.RELEASE);
                    m29872R1.m29743g0((int) this.f34181l.m31369A().m31182o());
                    m29872R1.m29747l0(this.f34181l.m31369A().m31183p());
                    C5684xd.m30030b();
                    if (m31072U().m30913B(null, AbstractC5972e3.f33885G0)) {
                    }
                    if (this.f34181l.m31394n()) {
                    }
                    C6034k c6034k17222 = this.f34172c;
                    m31060R(c6034k17222);
                    m30990R = c6034k17222.m30990R(zzqVar.f34702p);
                    if (m30990R == null) {
                    }
                    if (m106009c.m106014i(EnumC20305a.ANALYTICS_STORAGE)) {
                        m29872R1.m29757s((String) AbstractC4205o.m19722k(m30990R.m31250j0()));
                    }
                    if (!TextUtils.isEmpty(m30990R.m31256m0())) {
                    }
                    C6034k c6034k18222 = this.f34172c;
                    m31060R(c6034k18222);
                    m31000c0 = c6034k18222.m31000c0(zzqVar.f34702p);
                    while (i12 < m31000c0.size()) {
                    }
                    c6034k2 = this.f34172c;
                    m31060R(c6034k2);
                    c5658w4 = (C5658w4) m29872R1.m29557k();
                    c6034k2.mo31036g();
                    c6034k2.m31504h();
                    AbstractC4205o.m19722k(c5658w4);
                    AbstractC4205o.m19718g(c5658w4.m29956V1());
                    byte[] m29188f322 = c5658w4.m29188f();
                    C6077n9 c6077n92222 = c6034k2.f34628b.f34176g;
                    m31060R(c6077n92222);
                    long m31178x222 = c6077n92222.m31178x(m29188f322);
                    ContentValues contentValues2222 = new ContentValues();
                    String str14222 = str2;
                    contentValues2222.put(str14222, c5658w4.m29956V1());
                    String str15222 = str;
                    contentValues2222.put(str15222, Long.valueOf(m31178x222));
                    contentValues2222.put("metadata", m29188f322);
                }
                String m31513Q = m31274a.f34677q.m31513Q("currency");
                if (z11) {
                    double doubleValue = m31274a.f34677q.m31510J("value").doubleValue() * 1000000.0d;
                    if (doubleValue == 0.0d) {
                        doubleValue = m31274a.f34677q.m31511K("value").longValue() * 1000000.0d;
                    }
                    if (doubleValue <= 9.223372036854776E18d && doubleValue >= -9.223372036854776E18d) {
                        longValue = Math.round(doubleValue);
                        if ("refund".equals(m31274a.f34676p)) {
                            longValue = -longValue;
                        }
                    } else {
                        mo31033c().m31202w().m31110c("Data lost. Currency value is too big. appId", C6082o3.m31193z(str8), Double.valueOf(doubleValue));
                        C6034k c6034k25 = this.f34172c;
                        m31060R(c6034k25);
                        c6034k25.m31008n();
                        C6034k c6034k26 = this.f34172c;
                        m31060R(c6034k26);
                        c6034k26.m31003f0();
                        return;
                    }
                } else {
                    longValue = m31274a.f34677q.m31511K("value").longValue();
                }
                if (!TextUtils.isEmpty(m31513Q)) {
                    String upperCase = m31513Q.toUpperCase(Locale.US);
                    if (upperCase.matches("[A-Z]{3}")) {
                        String concat = "_ltv_".concat(upperCase);
                        C6034k c6034k27 = this.f34172c;
                        m31060R(c6034k27);
                        C6099p9 m30995X2 = c6034k27.m30995X(str8, concat);
                        if (m30995X2 != null) {
                            Object obj2 = m30995X2.f34342e;
                            if (obj2 instanceof Long) {
                                c6099p9 = new C6099p9(str8, m31274a.f34678r, concat, mo31031a().mo105913a(), Long.valueOf(((Long) obj2).longValue() + longValue));
                                str = "metadata_fingerprint";
                                str2 = "app_id";
                                str3 = str11;
                                c6034k = this.f34172c;
                                m31060R(c6034k);
                                if (!c6034k.m31017x(c6099p9)) {
                                    mo31033c().m31197q().m31111d("Too many unique user properties are set. Ignoring user property. appId", C6082o3.m31193z(str8), this.f34181l.m31372D().m30966f(c6099p9.f34340c), c6099p9.f34342e);
                                    m31087h0().m31317C(this.f34169E, str8, 9, null, null, 0);
                                }
                                boolean m31301Z2 = C6121r9.m31301Z(m31274a.f34676p);
                                boolean equals2 = str3.equals(m31274a.f34676p);
                                m31087h0();
                                zzauVar = m31274a.f34677q;
                                if (zzauVar != null) {
                                }
                                C6034k c6034k62 = this.f34172c;
                                m31060R(c6034k62);
                                C6012i m30993U2 = c6034k62.m30993U(m31069F(), str8, j11 + 1, true, m31301Z2, false, equals2, false);
                                long j162 = m30993U2.f34073b;
                                m31072U();
                                intValue = j162 - ((Integer) AbstractC5972e3.f33931m.m30827a(null)).intValue();
                                if (intValue <= 0) {
                                }
                            }
                        }
                        C6034k c6034k28 = this.f34172c;
                        m31060R(c6034k28);
                        int m30924n = m31072U().m30924n(str8, AbstractC5972e3.f33884G) - 1;
                        AbstractC4205o.m19718g(str8);
                        c6034k28.mo31036g();
                        c6034k28.m31504h();
                        SQLiteDatabase m30988P = c6034k28.m30988P();
                        String str16 = str11;
                        str = "metadata_fingerprint";
                        String[] strArr = new String[3];
                        strArr[0] = str8;
                        str2 = "app_id";
                        strArr[1] = str8;
                        strArr[2] = String.valueOf(m30924n);
                        m30988P.execSQL("delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '_ltv_%' order by set_timestamp desc limit ?,10);", strArr);
                        str3 = str16;
                        c6099p9 = new C6099p9(str8, m31274a.f34678r, concat, mo31031a().mo105913a(), Long.valueOf(longValue));
                        c6034k = this.f34172c;
                        m31060R(c6034k);
                        if (!c6034k.m31017x(c6099p9)) {
                        }
                        boolean m31301Z22 = C6121r9.m31301Z(m31274a.f34676p);
                        boolean equals22 = str3.equals(m31274a.f34676p);
                        m31087h0();
                        zzauVar = m31274a.f34677q;
                        if (zzauVar != null) {
                        }
                        C6034k c6034k622 = this.f34172c;
                        m31060R(c6034k622);
                        C6012i m30993U22 = c6034k622.m30993U(m31069F(), str8, j11 + 1, true, m31301Z22, false, equals22, false);
                        long j1622 = m30993U22.f34073b;
                        m31072U();
                        intValue = j1622 - ((Integer) AbstractC5972e3.f33931m.m30827a(null)).intValue();
                        if (intValue <= 0) {
                        }
                    }
                }
                str = "metadata_fingerprint";
                str2 = "app_id";
                str3 = str11;
                boolean m31301Z222 = C6121r9.m31301Z(m31274a.f34676p);
                boolean equals222 = str3.equals(m31274a.f34676p);
                m31087h0();
                zzauVar = m31274a.f34677q;
                if (zzauVar != null) {
                }
                C6034k c6034k6222 = this.f34172c;
                m31060R(c6034k6222);
                C6012i m30993U222 = c6034k6222.m30993U(m31069F(), str8, j11 + 1, true, m31301Z222, false, equals222, false);
                long j16222 = m30993U222.f34073b;
                m31072U();
                intValue = j16222 - ((Integer) AbstractC5972e3.f33931m.m30827a(null)).intValue();
                if (intValue <= 0) {
                }
            } catch (Throwable th2) {
                C6034k c6034k29 = this.f34172c;
                m31060R(c6034k29);
                c6034k29.m31003f0();
                throw th2;
            }
        } else {
            m31070S(zzqVar);
        }
    }

    /* renamed from: E */
    final boolean m31068E() {
        mo31037v().mo31036g();
        FileLock fileLock = this.f34191v;
        if (fileLock != null && fileLock.isValid()) {
            mo31033c().m31201u().m31108a("Storage concurrent access okay");
            return true;
        }
        this.f34172c.f34158a.m31401z();
        try {
            FileChannel channel = new RandomAccessFile(new File(this.f34181l.mo31032b().getFilesDir(), "google_app_measurement.db"), "rw").getChannel();
            this.f34192w = channel;
            FileLock tryLock = channel.tryLock();
            this.f34191v = tryLock;
            if (tryLock != null) {
                mo31033c().m31201u().m31108a("Storage concurrent access okay");
                return true;
            }
            mo31033c().m31197q().m31108a("Storage concurrent data access panic");
            return false;
        } catch (FileNotFoundException e11) {
            mo31033c().m31197q().m31109b("Failed to acquire storage lock", e11);
            return false;
        } catch (IOException e12) {
            mo31033c().m31197q().m31109b("Failed to access storage lock file", e12);
            return false;
        } catch (OverlappingFileLockException e13) {
            mo31033c().m31202w().m31109b("Storage lock already acquired", e13);
            return false;
        }
    }

    /* renamed from: F */
    final long m31069F() {
        long mo105913a = mo31031a().mo105913a();
        C5999g8 c5999g8 = this.f34178i;
        c5999g8.m31504h();
        c5999g8.mo31036g();
        long m31502a = c5999g8.f34043i.m31502a();
        if (m31502a == 0) {
            m31502a = c5999g8.f34158a.m31381N().m31353t().nextInt(86400000) + 1;
            c5999g8.f34043i.m31503b(m31502a);
        }
        return ((((mo105913a + m31502a) / 1000) / 60) / 60) / 24;
    }

    /* renamed from: S */
    public final C6084o5 m31070S(zzq zzqVar) {
        String str;
        mo31037v().mo31036g();
        m31082e();
        AbstractC4205o.m19722k(zzqVar);
        AbstractC4205o.m19718g(zzqVar.f34702p);
        if (!zzqVar.f34698L.isEmpty()) {
            this.f34166B.put(zzqVar.f34702p, new C6044k9(this, zzqVar.f34698L));
        }
        C6034k c6034k = this.f34172c;
        m31060R(c6034k);
        C6084o5 m30990R = c6034k.m30990R(zzqVar.f34702p);
        C20307b m106009c = m31073V(zzqVar.f34702p).m106009c(C20307b.m106004b(zzqVar.f34697K));
        EnumC20305a enumC20305a = EnumC20305a.AD_STORAGE;
        if (m106009c.m106014i(enumC20305a)) {
            str = this.f34178i.m30949n(zzqVar.f34702p, zzqVar.f34690D);
        } else {
            str = "";
        }
        if (m30990R == null) {
            m30990R = new C6084o5(this.f34181l, zzqVar.f34702p);
            if (m106009c.m106014i(EnumC20305a.ANALYTICS_STORAGE)) {
                m30990R.m31247i(m31089i0(m106009c));
            }
            if (m106009c.m106014i(enumC20305a)) {
                m30990R.m31211G(str);
            }
        } else if (m106009c.m106014i(enumC20305a) && str != null && !str.equals(m30990R.m31233b())) {
            m30990R.m31211G(str);
            if (zzqVar.f34690D && !"00000000-0000-0000-0000-000000000000".equals(this.f34178i.m30948m(zzqVar.f34702p, m106009c).first)) {
                m30990R.m31247i(m31089i0(m106009c));
                C6034k c6034k2 = this.f34172c;
                m31060R(c6034k2);
                if (c6034k2.m30995X(zzqVar.f34702p, "_id") != null) {
                    C6034k c6034k3 = this.f34172c;
                    m31060R(c6034k3);
                    if (c6034k3.m30995X(zzqVar.f34702p, "_lair") == null) {
                        C6099p9 c6099p9 = new C6099p9(zzqVar.f34702p, "auto", "_lair", mo31031a().mo105913a(), 1L);
                        C6034k c6034k4 = this.f34172c;
                        m31060R(c6034k4);
                        c6034k4.m31017x(c6099p9);
                    }
                }
            }
        } else if (TextUtils.isEmpty(m30990R.m31250j0()) && m106009c.m106014i(EnumC20305a.ANALYTICS_STORAGE)) {
            m30990R.m31247i(m31089i0(m106009c));
        }
        m30990R.m31268x(zzqVar.f34703q);
        m30990R.m31243g(zzqVar.f34692F);
        if (!TextUtils.isEmpty(zzqVar.f34712z)) {
            m30990R.m31267w(zzqVar.f34712z);
        }
        long j11 = zzqVar.f34706t;
        if (j11 != 0) {
            m30990R.m31269y(j11);
        }
        if (!TextUtils.isEmpty(zzqVar.f34704r)) {
            m30990R.m31251k(zzqVar.f34704r);
        }
        m30990R.m31253l(zzqVar.f34711y);
        String str2 = zzqVar.f34705s;
        if (str2 != null) {
            m30990R.m31249j(str2);
        }
        m30990R.m31264t(zzqVar.f34707u);
        m30990R.m31209E(zzqVar.f34709w);
        if (!TextUtils.isEmpty(zzqVar.f34708v)) {
            m30990R.m31270z(zzqVar.f34708v);
        }
        m30990R.m31245h(zzqVar.f34690D);
        m30990R.m31210F(zzqVar.f34693G);
        m30990R.m31265u(zzqVar.f34694H);
        C5617te.m29656b();
        if (m31072U().m30913B(null, AbstractC5972e3.f33936o0) || m31072U().m30913B(zzqVar.f34702p, AbstractC5972e3.f33940q0)) {
            m30990R.m31213I(zzqVar.f34699M);
        }
        C5547pc.m29536b();
        if (m31072U().m30913B(null, AbstractC5972e3.f33934n0)) {
            m30990R.m31212H(zzqVar.f34695I);
        } else {
            C5547pc.m29536b();
            if (m31072U().m30913B(null, AbstractC5972e3.f33932m0)) {
                m30990R.m31212H(null);
            }
        }
        C5346df.m29069b();
        if (m31072U().m30913B(null, AbstractC5972e3.f33944s0)) {
            m30990R.m31214J(zzqVar.f34700N);
        }
        C5684xd.m30030b();
        if (m31072U().m30913B(null, AbstractC5972e3.f33885G0)) {
            m30990R.m31215K(zzqVar.f34701O);
        }
        if (m30990R.m31218N()) {
            C6034k c6034k5 = this.f34172c;
            m31060R(c6034k5);
            c6034k5.m31009o(m30990R);
        }
        return m30990R;
    }

    /* renamed from: T */
    public final C5933b m31071T() {
        C5933b c5933b = this.f34175f;
        m31060R(c5933b);
        return c5933b;
    }

    /* renamed from: U */
    public final C5990g m31072U() {
        return ((C6127s4) AbstractC4205o.m19722k(this.f34181l)).m31401z();
    }

    /* renamed from: V */
    public final C20307b m31073V(String str) {
        String str2;
        C20307b c20307b = C20307b.f100288b;
        mo31037v().mo31036g();
        m31082e();
        C20307b c20307b2 = (C20307b) this.f34165A.get(str);
        if (c20307b2 == null) {
            C6034k c6034k = this.f34172c;
            m31060R(c6034k);
            AbstractC4205o.m19722k(str);
            c6034k.mo31036g();
            c6034k.m31504h();
            Cursor cursor = null;
            try {
                try {
                    cursor = c6034k.m30988P().rawQuery("select consent_state from consent_settings where app_id=? limit 1;", new String[]{str});
                    if (cursor.moveToFirst()) {
                        str2 = cursor.getString(0);
                        cursor.close();
                    } else {
                        cursor.close();
                        str2 = "G1";
                    }
                    C20307b m106004b = C20307b.m106004b(str2);
                    m31064A(str, m106004b);
                    return m106004b;
                } catch (SQLiteException e11) {
                    c6034k.f34158a.mo31033c().m31197q().m31110c("Database error", "select consent_state from consent_settings where app_id=? limit 1;", e11);
                    throw e11;
                }
            } catch (Throwable th2) {
                if (cursor != null) {
                    cursor.close();
                }
                throw th2;
            }
        }
        return c20307b2;
    }

    /* renamed from: W */
    public final C6034k m31074W() {
        C6034k c6034k = this.f34172c;
        m31060R(c6034k);
        return c6034k;
    }

    /* renamed from: X */
    public final C6027j3 m31075X() {
        return this.f34181l.m31372D();
    }

    /* renamed from: Y */
    public final C6137t3 m31076Y() {
        C6137t3 c6137t3 = this.f34171b;
        m31060R(c6137t3);
        return c6137t3;
    }

    /* renamed from: Z */
    public final C6170w3 m31077Z() {
        C6170w3 c6170w3 = this.f34173d;
        if (c6170w3 != null) {
            return c6170w3;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC6073n5
    /* renamed from: a */
    public final InterfaceC20285f mo31031a() {
        return ((C6127s4) AbstractC4205o.m19722k(this.f34181l)).mo31031a();
    }

    /* renamed from: a0 */
    public final C6061m4 m31078a0() {
        C6061m4 c6061m4 = this.f34170a;
        m31060R(c6061m4);
        return c6061m4;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC6073n5
    /* renamed from: b */
    public final Context mo31032b() {
        return this.f34181l.mo31032b();
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC6073n5
    /* renamed from: c */
    public final C6082o3 mo31033c() {
        return ((C6127s4) AbstractC4205o.m19722k(this.f34181l)).mo31033c();
    }

    /* renamed from: c0 */
    public final C6127s4 m31079c0() {
        return this.f34181l;
    }

    /* renamed from: d */
    public final void m31080d() {
        mo31037v().mo31036g();
        m31082e();
        if (!this.f34183n) {
            this.f34183n = true;
            if (m31068E()) {
                FileChannel fileChannel = this.f34192w;
                mo31037v().mo31036g();
                int i11 = 0;
                if (fileChannel != null && fileChannel.isOpen()) {
                    ByteBuffer allocate = ByteBuffer.allocate(4);
                    try {
                        fileChannel.position(0L);
                        int read = fileChannel.read(allocate);
                        if (read != 4) {
                            if (read != -1) {
                                mo31033c().m31202w().m31109b("Unexpected data length. Bytes read", Integer.valueOf(read));
                            }
                        } else {
                            allocate.flip();
                            i11 = allocate.getInt();
                        }
                    } catch (IOException e11) {
                        mo31033c().m31197q().m31109b("Failed to read from channel", e11);
                    }
                } else {
                    mo31033c().m31197q().m31108a("Bad channel to read from");
                }
                int m30938o = this.f34181l.m31370B().m30938o();
                mo31037v().mo31036g();
                if (i11 > m30938o) {
                    mo31033c().m31197q().m31110c("Panic: can't downgrade version. Previous, current version", Integer.valueOf(i11), Integer.valueOf(m30938o));
                    return;
                }
                if (i11 < m30938o) {
                    FileChannel fileChannel2 = this.f34192w;
                    mo31037v().mo31036g();
                    if (fileChannel2 != null && fileChannel2.isOpen()) {
                        ByteBuffer allocate2 = ByteBuffer.allocate(4);
                        allocate2.putInt(m30938o);
                        allocate2.flip();
                        try {
                            fileChannel2.truncate(0L);
                            fileChannel2.write(allocate2);
                            fileChannel2.force(true);
                            if (fileChannel2.size() != 4) {
                                mo31033c().m31197q().m31109b("Error writing to channel. Bytes written", Long.valueOf(fileChannel2.size()));
                            }
                            mo31033c().m31201u().m31110c("Storage version upgraded. Previous, current version", Integer.valueOf(i11), Integer.valueOf(m30938o));
                            return;
                        } catch (IOException e12) {
                            mo31033c().m31197q().m31109b("Failed to write to channel", e12);
                        }
                    } else {
                        mo31033c().m31197q().m31108a("Bad channel to read from");
                    }
                    mo31033c().m31197q().m31110c("Storage version upgrade failed. Previous, current version", Integer.valueOf(i11), Integer.valueOf(m30938o));
                }
            }
        }
    }

    /* renamed from: d0 */
    public final C6173w6 m31081d0() {
        C6173w6 c6173w6 = this.f34177h;
        m31060R(c6173w6);
        return c6173w6;
    }

    /* renamed from: e */
    public final void m31082e() {
        if (this.f34182m) {
        } else {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    /* renamed from: e0 */
    public final C5999g8 m31083e0() {
        return this.f34178i;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC6073n5
    /* renamed from: f */
    public final C5945c mo31035f() {
        throw null;
    }

    /* renamed from: g */
    public final void m31084g(String str, C5641v4 c5641v4) {
        int m31166w;
        int indexOf;
        C6061m4 c6061m4 = this.f34170a;
        m31060R(c6061m4);
        Set m31138y = c6061m4.m31138y(str);
        if (m31138y != null) {
            c5641v4.m29700A0(m31138y);
        }
        C6061m4 c6061m42 = this.f34170a;
        m31060R(c6061m42);
        if (c6061m42.m31128J(str)) {
            c5641v4.m29713H0();
        }
        C6061m4 c6061m43 = this.f34170a;
        m31060R(c6061m43);
        if (c6061m43.m31131M(str)) {
            if (m31072U().m30913B(str, AbstractC5972e3.f33946t0)) {
                String m29754q0 = c5641v4.m29754q0();
                if (!TextUtils.isEmpty(m29754q0) && (indexOf = m29754q0.indexOf(".")) != -1) {
                    c5641v4.m29730S(m29754q0.substring(0, indexOf));
                }
            } else {
                c5641v4.m29720M0();
            }
        }
        C6061m4 c6061m44 = this.f34170a;
        m31060R(c6061m44);
        if (c6061m44.m31132N(str) && (m31166w = C6077n9.m31166w(c5641v4, "_id")) != -1) {
            c5641v4.m29751p(m31166w);
        }
        C6061m4 c6061m45 = this.f34170a;
        m31060R(c6061m45);
        if (c6061m45.m31130L(str)) {
            c5641v4.m29715I0();
        }
        C6061m4 c6061m46 = this.f34170a;
        m31060R(c6061m46);
        if (c6061m46.m31127I(str)) {
            c5641v4.m29709F0();
            C6044k9 c6044k9 = (C6044k9) this.f34166B.get(str);
            if (c6044k9 == null || c6044k9.f34146b + m31072U().m30927q(str, AbstractC5972e3.f33902V) < mo31031a().mo105914b()) {
                c6044k9 = new C6044k9(this);
                this.f34166B.put(str, c6044k9);
            }
            c5641v4.m29712H(c6044k9.f34145a);
        }
        C6061m4 c6061m47 = this.f34170a;
        m31060R(c6061m47);
        if (c6061m47.m31129K(str)) {
            c5641v4.m29727Q0();
        }
    }

    /* renamed from: g0 */
    public final C6077n9 m31085g0() {
        C6077n9 c6077n9 = this.f34176g;
        m31060R(c6077n9);
        return c6077n9;
    }

    /* renamed from: h */
    final void m31086h(C6084o5 c6084o5) {
        mo31037v().mo31036g();
        if (TextUtils.isEmpty(c6084o5.m31258n0()) && TextUtils.isEmpty(c6084o5.m31244g0())) {
            m31095m((String) AbstractC4205o.m19722k(c6084o5.m31248i0()), 204, null, null, null);
            return;
        }
        C5943b9 c5943b9 = this.f34179j;
        Uri.Builder builder = new Uri.Builder();
        String m31258n0 = c6084o5.m31258n0();
        if (TextUtils.isEmpty(m31258n0)) {
            m31258n0 = c6084o5.m31244g0();
        }
        C30239a c30239a = null;
        Uri.Builder appendQueryParameter = builder.scheme((String) AbstractC5972e3.f33919g.m30827a(null)).encodedAuthority((String) AbstractC5972e3.f33921h.m30827a(null)).path("config/app/".concat(String.valueOf(m31258n0))).appendQueryParameter("platform", "android");
        c5943b9.f34158a.m31401z().m30926p();
        appendQueryParameter.appendQueryParameter("gmp_version", String.valueOf(76003L)).appendQueryParameter("runtime_version", "0");
        String uri = builder.build().toString();
        try {
            String str = (String) AbstractC4205o.m19722k(c6084o5.m31248i0());
            URL url = new URL(uri);
            mo31033c().m31201u().m31109b("Fetching remote configuration", str);
            C6061m4 c6061m4 = this.f34170a;
            m31060R(c6061m4);
            C5674x3 m31134s = c6061m4.m31134s(str);
            C6061m4 c6061m42 = this.f34170a;
            m31060R(c6061m42);
            String m31136u = c6061m42.m31136u(str);
            if (m31134s != null) {
                if (!TextUtils.isEmpty(m31136u)) {
                    c30239a = new C30239a();
                    c30239a.put("If-Modified-Since", m31136u);
                }
                C6061m4 c6061m43 = this.f34170a;
                m31060R(c6061m43);
                String m31135t = c6061m43.m31135t(str);
                if (!TextUtils.isEmpty(m31135t)) {
                    if (c30239a == null) {
                        c30239a = new C30239a();
                    }
                    c30239a.put("If-None-Match", m31135t);
                }
            }
            this.f34188s = true;
            C6137t3 c6137t3 = this.f34171b;
            m31060R(c6137t3);
            C5978e9 c5978e9 = new C5978e9(this);
            c6137t3.mo31036g();
            c6137t3.m31504h();
            AbstractC4205o.m19722k(url);
            AbstractC4205o.m19722k(c5978e9);
            c6137t3.f34158a.mo31037v().m31295y(new RunnableC6126s3(c6137t3, str, url, null, c30239a, c5978e9));
        } catch (MalformedURLException unused) {
            mo31033c().m31197q().m31110c("Failed to parse config URL. Not fetching. appId", C6082o3.m31193z(c6084o5.m31248i0()), uri);
        }
    }

    /* renamed from: h0 */
    public final C6121r9 m31087h0() {
        return ((C6127s4) AbstractC4205o.m19722k(this.f34181l)).m31381N();
    }

    /* renamed from: i */
    public final void m31088i(zzaw zzawVar, zzq zzqVar) {
        zzaw zzawVar2;
        List<zzac> m30999b0;
        List<zzac> m30999b02;
        List<zzac> m30999b03;
        String str;
        AbstractC4205o.m19722k(zzqVar);
        AbstractC4205o.m19718g(zzqVar.f34702p);
        mo31037v().mo31036g();
        m31082e();
        String str2 = zzqVar.f34702p;
        long j11 = zzawVar.f34679s;
        C6093p3 m31273b = C6093p3.m31273b(zzawVar);
        mo31037v().mo31036g();
        C6184x6 c6184x6 = null;
        if (this.f34167C != null && (str = this.f34168D) != null && str.equals(str2)) {
            c6184x6 = this.f34167C;
        }
        C6121r9.m31314y(c6184x6, m31273b.f34323d, false);
        zzaw m31274a = m31273b.m31274a();
        m31060R(this.f34176g);
        if (!C6077n9.m31156l(m31274a, zzqVar)) {
            return;
        }
        if (!zzqVar.f34709w) {
            m31070S(zzqVar);
            return;
        }
        List list = zzqVar.f34695I;
        if (list != null) {
            if (list.contains(m31274a.f34676p)) {
                Bundle m31509F = m31274a.f34677q.m31509F();
                m31509F.putLong("ga_safelisted", 1L);
                zzawVar2 = new zzaw(m31274a.f34676p, new zzau(m31509F), m31274a.f34678r, m31274a.f34679s);
            } else {
                mo31033c().m31196p().m31111d("Dropping non-safelisted event. appId, event name, origin", str2, m31274a.f34676p, m31274a.f34678r);
                return;
            }
        } else {
            zzawVar2 = m31274a;
        }
        C6034k c6034k = this.f34172c;
        m31060R(c6034k);
        c6034k.m31002e0();
        try {
            C6034k c6034k2 = this.f34172c;
            m31060R(c6034k2);
            AbstractC4205o.m19718g(str2);
            c6034k2.mo31036g();
            c6034k2.m31504h();
            if (j11 < 0) {
                c6034k2.f34158a.mo31033c().m31202w().m31110c("Invalid time querying timed out conditional properties", C6082o3.m31193z(str2), Long.valueOf(j11));
                m30999b0 = Collections.emptyList();
            } else {
                m30999b0 = c6034k2.m30999b0("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str2, String.valueOf(j11)});
            }
            for (zzac zzacVar : m30999b0) {
                if (zzacVar != null) {
                    mo31033c().m31201u().m31111d("User property timed out", zzacVar.f34664p, this.f34181l.m31372D().m30966f(zzacVar.f34666r.f34681q), zzacVar.f34666r.m31514t());
                    zzaw zzawVar3 = zzacVar.f34670v;
                    if (zzawVar3 != null) {
                        m31067D(new zzaw(zzawVar3, j11), zzqVar);
                    }
                    C6034k c6034k3 = this.f34172c;
                    m31060R(c6034k3);
                    c6034k3.m30983J(str2, zzacVar.f34666r.f34681q);
                }
            }
            C6034k c6034k4 = this.f34172c;
            m31060R(c6034k4);
            AbstractC4205o.m19718g(str2);
            c6034k4.mo31036g();
            c6034k4.m31504h();
            if (j11 < 0) {
                c6034k4.f34158a.mo31033c().m31202w().m31110c("Invalid time querying expired conditional properties", C6082o3.m31193z(str2), Long.valueOf(j11));
                m30999b02 = Collections.emptyList();
            } else {
                m30999b02 = c6034k4.m30999b0("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str2, String.valueOf(j11)});
            }
            ArrayList arrayList = new ArrayList(m30999b02.size());
            for (zzac zzacVar2 : m30999b02) {
                if (zzacVar2 != null) {
                    mo31033c().m31201u().m31111d("User property expired", zzacVar2.f34664p, this.f34181l.m31372D().m30966f(zzacVar2.f34666r.f34681q), zzacVar2.f34666r.m31514t());
                    C6034k c6034k5 = this.f34172c;
                    m31060R(c6034k5);
                    c6034k5.m31006l(str2, zzacVar2.f34666r.f34681q);
                    zzaw zzawVar4 = zzacVar2.f34674z;
                    if (zzawVar4 != null) {
                        arrayList.add(zzawVar4);
                    }
                    C6034k c6034k6 = this.f34172c;
                    m31060R(c6034k6);
                    c6034k6.m30983J(str2, zzacVar2.f34666r.f34681q);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                m31067D(new zzaw((zzaw) it.next(), j11), zzqVar);
            }
            C6034k c6034k7 = this.f34172c;
            m31060R(c6034k7);
            String str3 = zzawVar2.f34676p;
            AbstractC4205o.m19718g(str2);
            AbstractC4205o.m19718g(str3);
            c6034k7.mo31036g();
            c6034k7.m31504h();
            if (j11 < 0) {
                c6034k7.f34158a.mo31033c().m31202w().m31111d("Invalid time querying triggered conditional properties", C6082o3.m31193z(str2), c6034k7.f34158a.m31372D().m30964d(str3), Long.valueOf(j11));
                m30999b03 = Collections.emptyList();
            } else {
                m30999b03 = c6034k7.m30999b0("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str2, str3, String.valueOf(j11)});
            }
            ArrayList arrayList2 = new ArrayList(m30999b03.size());
            for (zzac zzacVar3 : m30999b03) {
                if (zzacVar3 != null) {
                    zzli zzliVar = zzacVar3.f34666r;
                    C6099p9 c6099p9 = new C6099p9((String) AbstractC4205o.m19722k(zzacVar3.f34664p), zzacVar3.f34665q, zzliVar.f34681q, j11, AbstractC4205o.m19722k(zzliVar.m31514t()));
                    C6034k c6034k8 = this.f34172c;
                    m31060R(c6034k8);
                    if (c6034k8.m31017x(c6099p9)) {
                        mo31033c().m31201u().m31111d("User property triggered", zzacVar3.f34664p, this.f34181l.m31372D().m30966f(c6099p9.f34340c), c6099p9.f34342e);
                    } else {
                        mo31033c().m31197q().m31111d("Too many active user properties, ignoring", C6082o3.m31193z(zzacVar3.f34664p), this.f34181l.m31372D().m30966f(c6099p9.f34340c), c6099p9.f34342e);
                    }
                    zzaw zzawVar5 = zzacVar3.f34672x;
                    if (zzawVar5 != null) {
                        arrayList2.add(zzawVar5);
                    }
                    zzacVar3.f34666r = new zzli(c6099p9);
                    zzacVar3.f34668t = true;
                    C6034k c6034k9 = this.f34172c;
                    m31060R(c6034k9);
                    c6034k9.m31016w(zzacVar3);
                }
            }
            m31067D(zzawVar2, zzqVar);
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                m31067D(new zzaw((zzaw) it2.next(), j11), zzqVar);
            }
            C6034k c6034k10 = this.f34172c;
            m31060R(c6034k10);
            c6034k10.m31008n();
            C6034k c6034k11 = this.f34172c;
            m31060R(c6034k11);
            c6034k11.m31003f0();
        } catch (Throwable th2) {
            C6034k c6034k12 = this.f34172c;
            m31060R(c6034k12);
            c6034k12.m31003f0();
            throw th2;
        }
    }

    /* renamed from: i0 */
    final String m31089i0(C20307b c20307b) {
        if (c20307b.m106014i(EnumC20305a.ANALYTICS_STORAGE)) {
            byte[] bArr = new byte[16];
            m31087h0().m31353t().nextBytes(bArr);
            return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        }
        return null;
    }

    /* renamed from: j */
    public final void m31090j(zzaw zzawVar, String str) {
        C6034k c6034k = this.f34172c;
        m31060R(c6034k);
        C6084o5 m30990R = c6034k.m30990R(str);
        if (m30990R != null && !TextUtils.isEmpty(m30990R.m31254l0())) {
            Boolean m31052J = m31052J(m30990R);
            if (m31052J == null) {
                if (!"_ui".equals(zzawVar.f34676p)) {
                    mo31033c().m31202w().m31109b("Could not find package. appId", C6082o3.m31193z(str));
                }
            } else if (!m31052J.booleanValue()) {
                mo31033c().m31197q().m31109b("App version does not match; dropping event. appId", C6082o3.m31193z(str));
                return;
            }
            String m31258n0 = m30990R.m31258n0();
            String m31254l0 = m30990R.m31254l0();
            long m31220P = m30990R.m31220P();
            String m31252k0 = m30990R.m31252k0();
            long m31232a0 = m30990R.m31232a0();
            long m31228X = m30990R.m31228X();
            boolean m31217M = m30990R.m31217M();
            String m31256m0 = m30990R.m31256m0();
            m30990R.m31205A();
            m31092k(zzawVar, new zzq(str, m31258n0, m31254l0, m31220P, m31252k0, m31232a0, m31228X, (String) null, m31217M, false, m31256m0, 0L, 0L, 0, m30990R.m31216L(), false, m30990R.m31244g0(), m30990R.m31242f0(), m30990R.m31229Y(), m30990R.m31237d(), (String) null, m31073V(str).m106013h(), "", (String) null, m30990R.m31219O(), m30990R.m31240e0()));
            return;
        }
        mo31033c().m31196p().m31109b("No app data available; dropping event", str);
    }

    /* renamed from: j0 */
    public final String m31091j0(zzq zzqVar) {
        try {
            return (String) mo31037v().m31293r(new CallableC5989f9(this, zzqVar)).get(30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e11) {
            mo31033c().m31197q().m31110c("Failed to get app instance id. appId", C6082o3.m31193z(zzqVar.f34702p), e11);
            return null;
        }
    }

    /* renamed from: k */
    final void m31092k(zzaw zzawVar, zzq zzqVar) {
        AbstractC4205o.m19718g(zzqVar.f34702p);
        C6093p3 m31273b = C6093p3.m31273b(zzawVar);
        C6121r9 m31087h0 = m31087h0();
        Bundle bundle = m31273b.f34323d;
        C6034k c6034k = this.f34172c;
        m31060R(c6034k);
        m31087h0.m31362z(bundle, c6034k.m30989Q(zzqVar.f34702p));
        m31087h0().m31316B(m31273b, m31072U().m30923m(zzqVar.f34702p));
        zzaw m31274a = m31273b.m31274a();
        if ("_cmp".equals(m31274a.f34676p) && "referrer API v2".equals(m31274a.f34677q.m31513Q("_cis"))) {
            String m31513Q = m31274a.f34677q.m31513Q("gclid");
            if (!TextUtils.isEmpty(m31513Q)) {
                m31065B(new zzli("_lgclid", m31274a.f34679s, m31513Q, "auto"), zzqVar);
            }
        }
        m31088i(m31274a, zzqVar);
    }

    /* renamed from: l */
    public final void m31093l() {
        this.f34187r++;
    }

    /* renamed from: l0 */
    public final void m31094l0(Runnable runnable) {
        mo31037v().mo31036g();
        if (this.f34185p == null) {
            this.f34185p = new ArrayList();
        }
        this.f34185p.add(runnable);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004f A[Catch: all -> 0x0062, TryCatch #0 {all -> 0x0062, blocks: (B:5:0x0030, B:13:0x004f, B:14:0x0169, B:24:0x006c, B:28:0x00be, B:29:0x00af, B:32:0x00c6, B:34:0x00d2, B:36:0x00d8, B:38:0x00e2, B:40:0x00ee, B:42:0x00f4, B:46:0x0101, B:47:0x011d, B:49:0x0132, B:50:0x0151, B:52:0x015c, B:54:0x0162, B:55:0x0166, B:56:0x0140, B:57:0x010a, B:59:0x0115), top: B:4:0x0030, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0132 A[Catch: all -> 0x0062, TryCatch #0 {all -> 0x0062, blocks: (B:5:0x0030, B:13:0x004f, B:14:0x0169, B:24:0x006c, B:28:0x00be, B:29:0x00af, B:32:0x00c6, B:34:0x00d2, B:36:0x00d8, B:38:0x00e2, B:40:0x00ee, B:42:0x00f4, B:46:0x0101, B:47:0x011d, B:49:0x0132, B:50:0x0151, B:52:0x015c, B:54:0x0162, B:55:0x0166, B:56:0x0140, B:57:0x010a, B:59:0x0115), top: B:4:0x0030, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0140 A[Catch: all -> 0x0062, TryCatch #0 {all -> 0x0062, blocks: (B:5:0x0030, B:13:0x004f, B:14:0x0169, B:24:0x006c, B:28:0x00be, B:29:0x00af, B:32:0x00c6, B:34:0x00d2, B:36:0x00d8, B:38:0x00e2, B:40:0x00ee, B:42:0x00f4, B:46:0x0101, B:47:0x011d, B:49:0x0132, B:50:0x0151, B:52:0x015c, B:54:0x0162, B:55:0x0166, B:56:0x0140, B:57:0x010a, B:59:0x0115), top: B:4:0x0030, outer: #1 }] */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m31095m(String str, int i11, Throwable th2, byte[] bArr, Map map) {
        boolean z11;
        List list;
        String str2;
        List list2;
        String str3;
        C6137t3 c6137t3;
        mo31037v().mo31036g();
        m31082e();
        AbstractC4205o.m19718g(str);
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } catch (Throwable th3) {
                this.f34188s = false;
                m31053K();
                throw th3;
            }
        }
        C6060m3 m31201u = mo31033c().m31201u();
        Integer valueOf = Integer.valueOf(bArr.length);
        m31201u.m31109b("onConfigFetched. Response size", valueOf);
        C6034k c6034k = this.f34172c;
        m31060R(c6034k);
        c6034k.m31002e0();
        try {
            C6034k c6034k2 = this.f34172c;
            m31060R(c6034k2);
            C6084o5 m30990R = c6034k2.m30990R(str);
            if (i11 != 200 && i11 != 204) {
                if (i11 == 304) {
                    i11 = 304;
                }
                z11 = false;
                if (m30990R == null) {
                    mo31033c().m31202w().m31109b("App does not exist in onConfigFetched. appId", C6082o3.m31193z(str));
                } else {
                    if (!z11 && i11 != 404) {
                        m30990R.m31266v(mo31031a().mo105913a());
                        C6034k c6034k3 = this.f34172c;
                        m31060R(c6034k3);
                        c6034k3.m31009o(m30990R);
                        mo31033c().m31201u().m31110c("Fetching config failed. code, error", Integer.valueOf(i11), th2);
                        C6061m4 c6061m4 = this.f34170a;
                        m31060R(c6061m4);
                        c6061m4.m31139z(str);
                        this.f34178i.f34042h.m31503b(mo31031a().mo105913a());
                        if (i11 == 503 || i11 == 429) {
                            this.f34178i.f34040f.m31503b(mo31031a().mo105913a());
                        }
                        m31055M();
                    }
                    if (map != null) {
                        list = (List) map.get("Last-Modified");
                    } else {
                        list = null;
                    }
                    if (list != null && !list.isEmpty()) {
                        str2 = (String) list.get(0);
                    } else {
                        str2 = null;
                    }
                    if (map != null) {
                        list2 = (List) map.get("ETag");
                    } else {
                        list2 = null;
                    }
                    if (list2 != null && !list2.isEmpty()) {
                        str3 = (String) list2.get(0);
                    } else {
                        str3 = null;
                    }
                    if (i11 != 404 && i11 != 304) {
                        C6061m4 c6061m42 = this.f34170a;
                        m31060R(c6061m42);
                        c6061m42.m31126H(str, bArr, str2, str3);
                        m30990R.m31255m(mo31031a().mo105913a());
                        C6034k c6034k4 = this.f34172c;
                        m31060R(c6034k4);
                        c6034k4.m31009o(m30990R);
                        if (i11 != 404) {
                            mo31033c().m31203x().m31109b("Config not found. Using empty config. appId", str);
                        } else {
                            mo31033c().m31201u().m31110c("Successfully fetched config. Got network response. code, size", Integer.valueOf(i11), valueOf);
                        }
                        c6137t3 = this.f34171b;
                        m31060R(c6137t3);
                        if (!c6137t3.m31451l() && m31057O()) {
                            m31066C();
                        } else {
                            m31055M();
                        }
                    }
                    C6061m4 c6061m43 = this.f34170a;
                    m31060R(c6061m43);
                    if (c6061m43.m31134s(str) == null) {
                        C6061m4 c6061m44 = this.f34170a;
                        m31060R(c6061m44);
                        c6061m44.m31126H(str, null, null, null);
                    }
                    m30990R.m31255m(mo31031a().mo105913a());
                    C6034k c6034k42 = this.f34172c;
                    m31060R(c6034k42);
                    c6034k42.m31009o(m30990R);
                    if (i11 != 404) {
                    }
                    c6137t3 = this.f34171b;
                    m31060R(c6137t3);
                    if (!c6137t3.m31451l()) {
                    }
                    m31055M();
                }
                C6034k c6034k5 = this.f34172c;
                m31060R(c6034k5);
                c6034k5.m31008n();
                C6034k c6034k6 = this.f34172c;
                m31060R(c6034k6);
                c6034k6.m31003f0();
                this.f34188s = false;
                m31053K();
            }
            if (th2 == null) {
                z11 = true;
                if (m30990R == null) {
                }
                C6034k c6034k52 = this.f34172c;
                m31060R(c6034k52);
                c6034k52.m31008n();
                C6034k c6034k62 = this.f34172c;
                m31060R(c6034k62);
                c6034k62.m31003f0();
                this.f34188s = false;
                m31053K();
            }
            z11 = false;
            if (m30990R == null) {
            }
            C6034k c6034k522 = this.f34172c;
            m31060R(c6034k522);
            c6034k522.m31008n();
            C6034k c6034k622 = this.f34172c;
            m31060R(c6034k622);
            c6034k622.m31003f0();
            this.f34188s = false;
            m31053K();
        } catch (Throwable th4) {
            C6034k c6034k7 = this.f34172c;
            m31060R(c6034k7);
            c6034k7.m31003f0();
            throw th4;
        }
    }

    /* renamed from: n */
    public final void m31096n(boolean z11) {
        m31055M();
    }

    /* renamed from: o */
    public final void m31097o(int i11, Throwable th2, byte[] bArr, String str) {
        C6034k c6034k;
        long longValue;
        mo31037v().mo31036g();
        m31082e();
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } catch (Throwable th3) {
                this.f34189t = false;
                m31053K();
                throw th3;
            }
        }
        List<Long> list = (List) AbstractC4205o.m19722k(this.f34193x);
        this.f34193x = null;
        if (i11 != 200) {
            if (i11 == 204) {
                i11 = 204;
            }
            mo31033c().m31201u().m31110c("Network upload failed. Will retry later. code, error", Integer.valueOf(i11), th2);
            this.f34178i.f34042h.m31503b(mo31031a().mo105913a());
            if (i11 != 503 || i11 == 429) {
                this.f34178i.f34040f.m31503b(mo31031a().mo105913a());
            }
            C6034k c6034k2 = this.f34172c;
            m31060R(c6034k2);
            c6034k2.m31004g0(list);
            m31055M();
            this.f34189t = false;
            m31053K();
        }
        if (th2 == null) {
            try {
                this.f34178i.f34041g.m31503b(mo31031a().mo105913a());
                this.f34178i.f34042h.m31503b(0L);
                m31055M();
                mo31033c().m31201u().m31110c("Successful upload. Got network response. code, size", Integer.valueOf(i11), Integer.valueOf(bArr.length));
                C6034k c6034k3 = this.f34172c;
                m31060R(c6034k3);
                c6034k3.m31002e0();
            } catch (SQLiteException e11) {
                mo31033c().m31197q().m31109b("Database error while trying to delete uploaded bundles", e11);
                this.f34184o = mo31031a().mo105914b();
                mo31033c().m31201u().m31109b("Disable upload, time", Long.valueOf(this.f34184o));
            }
            try {
                for (Long l11 : list) {
                    try {
                        c6034k = this.f34172c;
                        m31060R(c6034k);
                        longValue = l11.longValue();
                        c6034k.mo31036g();
                        c6034k.m31504h();
                    } catch (SQLiteException e12) {
                        List list2 = this.f34194y;
                        if (list2 == null || !list2.contains(l11)) {
                            throw e12;
                        }
                    }
                    try {
                        if (c6034k.m30988P().delete("queue", "rowid=?", new String[]{String.valueOf(longValue)}) != 1) {
                            throw new SQLiteException("Deleted fewer rows from queue than expected");
                            break;
                        }
                    } catch (SQLiteException e13) {
                        c6034k.f34158a.mo31033c().m31197q().m31109b("Failed to delete a bundle in a queue table", e13);
                        throw e13;
                        break;
                    }
                }
                C6034k c6034k4 = this.f34172c;
                m31060R(c6034k4);
                c6034k4.m31008n();
                C6034k c6034k5 = this.f34172c;
                m31060R(c6034k5);
                c6034k5.m31003f0();
                this.f34194y = null;
                C6137t3 c6137t3 = this.f34171b;
                m31060R(c6137t3);
                if (c6137t3.m31451l() && m31057O()) {
                    m31066C();
                } else {
                    this.f34195z = -1L;
                    m31055M();
                }
                this.f34184o = 0L;
                this.f34189t = false;
                m31053K();
            } catch (Throwable th4) {
                C6034k c6034k6 = this.f34172c;
                m31060R(c6034k6);
                c6034k6.m31003f0();
                throw th4;
            }
        }
        mo31033c().m31201u().m31110c("Network upload failed. Will retry later. code, error", Integer.valueOf(i11), th2);
        this.f34178i.f34042h.m31503b(mo31031a().mo105913a());
        if (i11 != 503) {
        }
        this.f34178i.f34040f.m31503b(mo31031a().mo105913a());
        C6034k c6034k22 = this.f34172c;
        m31060R(c6034k22);
        c6034k22.m31004g0(list);
        m31055M();
        this.f34189t = false;
        m31053K();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:96|97|(2:99|(8:101|(3:103|(2:105|(1:107))(1:127)|108)(1:128)|109|(1:111)(1:126)|112|113|114|(4:116|(1:118)(1:122)|119|(1:121))))|129|113|114|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x04b1, code lost:            r0 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x04b2, code lost:            mo31033c().m31197q().m31110c("Application info is null, first open report might be inaccurate. appId", com.google.android.gms.measurement.internal.C6082o3.m31193z(r3), r0);        r3 = r8;     */
    /* JADX WARN: Removed duplicated region for block: B:116:0x04c6 A[Catch: all -> 0x00c3, TryCatch #2 {all -> 0x00c3, blocks: (B:24:0x00a6, B:26:0x00b6, B:30:0x00ff, B:32:0x0112, B:34:0x0128, B:36:0x014f, B:39:0x01a7, B:42:0x01ac, B:44:0x01b2, B:46:0x01be, B:50:0x01f6, B:52:0x0201, B:55:0x020e, B:58:0x021c, B:61:0x0227, B:63:0x022a, B:66:0x024a, B:68:0x024f, B:70:0x026e, B:73:0x0282, B:75:0x02a9, B:77:0x02b2, B:79:0x02c1, B:81:0x03ab, B:83:0x03dd, B:84:0x03e0, B:86:0x0409, B:90:0x04e3, B:91:0x04e6, B:92:0x0567, B:97:0x041e, B:99:0x0443, B:101:0x044b, B:103:0x0455, B:107:0x0468, B:109:0x0479, B:112:0x0485, B:114:0x04a1, B:125:0x04b2, B:116:0x04c6, B:118:0x04cc, B:119:0x04d4, B:121:0x04da, B:127:0x0471, B:132:0x042f, B:133:0x02d3, B:135:0x02fe, B:136:0x030e, B:138:0x0315, B:140:0x031b, B:142:0x0325, B:144:0x032b, B:146:0x0331, B:148:0x0337, B:150:0x033c, B:153:0x0347, B:156:0x0360, B:161:0x0366, B:165:0x037a, B:166:0x038b, B:168:0x039c, B:169:0x04fd, B:171:0x052e, B:172:0x0531, B:173:0x0548, B:175:0x054c, B:176:0x025e, B:179:0x01dc, B:187:0x00c6, B:189:0x00ca, B:192:0x00db, B:194:0x00eb, B:196:0x00f5, B:200:0x00fc), top: B:23:0x00a6, inners: #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0548 A[Catch: all -> 0x00c3, TryCatch #2 {all -> 0x00c3, blocks: (B:24:0x00a6, B:26:0x00b6, B:30:0x00ff, B:32:0x0112, B:34:0x0128, B:36:0x014f, B:39:0x01a7, B:42:0x01ac, B:44:0x01b2, B:46:0x01be, B:50:0x01f6, B:52:0x0201, B:55:0x020e, B:58:0x021c, B:61:0x0227, B:63:0x022a, B:66:0x024a, B:68:0x024f, B:70:0x026e, B:73:0x0282, B:75:0x02a9, B:77:0x02b2, B:79:0x02c1, B:81:0x03ab, B:83:0x03dd, B:84:0x03e0, B:86:0x0409, B:90:0x04e3, B:91:0x04e6, B:92:0x0567, B:97:0x041e, B:99:0x0443, B:101:0x044b, B:103:0x0455, B:107:0x0468, B:109:0x0479, B:112:0x0485, B:114:0x04a1, B:125:0x04b2, B:116:0x04c6, B:118:0x04cc, B:119:0x04d4, B:121:0x04da, B:127:0x0471, B:132:0x042f, B:133:0x02d3, B:135:0x02fe, B:136:0x030e, B:138:0x0315, B:140:0x031b, B:142:0x0325, B:144:0x032b, B:146:0x0331, B:148:0x0337, B:150:0x033c, B:153:0x0347, B:156:0x0360, B:161:0x0366, B:165:0x037a, B:166:0x038b, B:168:0x039c, B:169:0x04fd, B:171:0x052e, B:172:0x0531, B:173:0x0548, B:175:0x054c, B:176:0x025e, B:179:0x01dc, B:187:0x00c6, B:189:0x00ca, B:192:0x00db, B:194:0x00eb, B:196:0x00f5, B:200:0x00fc), top: B:23:0x00a6, inners: #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x025e A[Catch: all -> 0x00c3, TryCatch #2 {all -> 0x00c3, blocks: (B:24:0x00a6, B:26:0x00b6, B:30:0x00ff, B:32:0x0112, B:34:0x0128, B:36:0x014f, B:39:0x01a7, B:42:0x01ac, B:44:0x01b2, B:46:0x01be, B:50:0x01f6, B:52:0x0201, B:55:0x020e, B:58:0x021c, B:61:0x0227, B:63:0x022a, B:66:0x024a, B:68:0x024f, B:70:0x026e, B:73:0x0282, B:75:0x02a9, B:77:0x02b2, B:79:0x02c1, B:81:0x03ab, B:83:0x03dd, B:84:0x03e0, B:86:0x0409, B:90:0x04e3, B:91:0x04e6, B:92:0x0567, B:97:0x041e, B:99:0x0443, B:101:0x044b, B:103:0x0455, B:107:0x0468, B:109:0x0479, B:112:0x0485, B:114:0x04a1, B:125:0x04b2, B:116:0x04c6, B:118:0x04cc, B:119:0x04d4, B:121:0x04da, B:127:0x0471, B:132:0x042f, B:133:0x02d3, B:135:0x02fe, B:136:0x030e, B:138:0x0315, B:140:0x031b, B:142:0x0325, B:144:0x032b, B:146:0x0331, B:148:0x0337, B:150:0x033c, B:153:0x0347, B:156:0x0360, B:161:0x0366, B:165:0x037a, B:166:0x038b, B:168:0x039c, B:169:0x04fd, B:171:0x052e, B:172:0x0531, B:173:0x0548, B:175:0x054c, B:176:0x025e, B:179:0x01dc, B:187:0x00c6, B:189:0x00ca, B:192:0x00db, B:194:0x00eb, B:196:0x00f5, B:200:0x00fc), top: B:23:0x00a6, inners: #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01f6 A[Catch: all -> 0x00c3, TryCatch #2 {all -> 0x00c3, blocks: (B:24:0x00a6, B:26:0x00b6, B:30:0x00ff, B:32:0x0112, B:34:0x0128, B:36:0x014f, B:39:0x01a7, B:42:0x01ac, B:44:0x01b2, B:46:0x01be, B:50:0x01f6, B:52:0x0201, B:55:0x020e, B:58:0x021c, B:61:0x0227, B:63:0x022a, B:66:0x024a, B:68:0x024f, B:70:0x026e, B:73:0x0282, B:75:0x02a9, B:77:0x02b2, B:79:0x02c1, B:81:0x03ab, B:83:0x03dd, B:84:0x03e0, B:86:0x0409, B:90:0x04e3, B:91:0x04e6, B:92:0x0567, B:97:0x041e, B:99:0x0443, B:101:0x044b, B:103:0x0455, B:107:0x0468, B:109:0x0479, B:112:0x0485, B:114:0x04a1, B:125:0x04b2, B:116:0x04c6, B:118:0x04cc, B:119:0x04d4, B:121:0x04da, B:127:0x0471, B:132:0x042f, B:133:0x02d3, B:135:0x02fe, B:136:0x030e, B:138:0x0315, B:140:0x031b, B:142:0x0325, B:144:0x032b, B:146:0x0331, B:148:0x0337, B:150:0x033c, B:153:0x0347, B:156:0x0360, B:161:0x0366, B:165:0x037a, B:166:0x038b, B:168:0x039c, B:169:0x04fd, B:171:0x052e, B:172:0x0531, B:173:0x0548, B:175:0x054c, B:176:0x025e, B:179:0x01dc, B:187:0x00c6, B:189:0x00ca, B:192:0x00db, B:194:0x00eb, B:196:0x00f5, B:200:0x00fc), top: B:23:0x00a6, inners: #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x024f A[Catch: all -> 0x00c3, TryCatch #2 {all -> 0x00c3, blocks: (B:24:0x00a6, B:26:0x00b6, B:30:0x00ff, B:32:0x0112, B:34:0x0128, B:36:0x014f, B:39:0x01a7, B:42:0x01ac, B:44:0x01b2, B:46:0x01be, B:50:0x01f6, B:52:0x0201, B:55:0x020e, B:58:0x021c, B:61:0x0227, B:63:0x022a, B:66:0x024a, B:68:0x024f, B:70:0x026e, B:73:0x0282, B:75:0x02a9, B:77:0x02b2, B:79:0x02c1, B:81:0x03ab, B:83:0x03dd, B:84:0x03e0, B:86:0x0409, B:90:0x04e3, B:91:0x04e6, B:92:0x0567, B:97:0x041e, B:99:0x0443, B:101:0x044b, B:103:0x0455, B:107:0x0468, B:109:0x0479, B:112:0x0485, B:114:0x04a1, B:125:0x04b2, B:116:0x04c6, B:118:0x04cc, B:119:0x04d4, B:121:0x04da, B:127:0x0471, B:132:0x042f, B:133:0x02d3, B:135:0x02fe, B:136:0x030e, B:138:0x0315, B:140:0x031b, B:142:0x0325, B:144:0x032b, B:146:0x0331, B:148:0x0337, B:150:0x033c, B:153:0x0347, B:156:0x0360, B:161:0x0366, B:165:0x037a, B:166:0x038b, B:168:0x039c, B:169:0x04fd, B:171:0x052e, B:172:0x0531, B:173:0x0548, B:175:0x054c, B:176:0x025e, B:179:0x01dc, B:187:0x00c6, B:189:0x00ca, B:192:0x00db, B:194:0x00eb, B:196:0x00f5, B:200:0x00fc), top: B:23:0x00a6, inners: #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x026e A[Catch: all -> 0x00c3, TRY_LEAVE, TryCatch #2 {all -> 0x00c3, blocks: (B:24:0x00a6, B:26:0x00b6, B:30:0x00ff, B:32:0x0112, B:34:0x0128, B:36:0x014f, B:39:0x01a7, B:42:0x01ac, B:44:0x01b2, B:46:0x01be, B:50:0x01f6, B:52:0x0201, B:55:0x020e, B:58:0x021c, B:61:0x0227, B:63:0x022a, B:66:0x024a, B:68:0x024f, B:70:0x026e, B:73:0x0282, B:75:0x02a9, B:77:0x02b2, B:79:0x02c1, B:81:0x03ab, B:83:0x03dd, B:84:0x03e0, B:86:0x0409, B:90:0x04e3, B:91:0x04e6, B:92:0x0567, B:97:0x041e, B:99:0x0443, B:101:0x044b, B:103:0x0455, B:107:0x0468, B:109:0x0479, B:112:0x0485, B:114:0x04a1, B:125:0x04b2, B:116:0x04c6, B:118:0x04cc, B:119:0x04d4, B:121:0x04da, B:127:0x0471, B:132:0x042f, B:133:0x02d3, B:135:0x02fe, B:136:0x030e, B:138:0x0315, B:140:0x031b, B:142:0x0325, B:144:0x032b, B:146:0x0331, B:148:0x0337, B:150:0x033c, B:153:0x0347, B:156:0x0360, B:161:0x0366, B:165:0x037a, B:166:0x038b, B:168:0x039c, B:169:0x04fd, B:171:0x052e, B:172:0x0531, B:173:0x0548, B:175:0x054c, B:176:0x025e, B:179:0x01dc, B:187:0x00c6, B:189:0x00ca, B:192:0x00db, B:194:0x00eb, B:196:0x00f5, B:200:0x00fc), top: B:23:0x00a6, inners: #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x03dd A[Catch: all -> 0x00c3, TryCatch #2 {all -> 0x00c3, blocks: (B:24:0x00a6, B:26:0x00b6, B:30:0x00ff, B:32:0x0112, B:34:0x0128, B:36:0x014f, B:39:0x01a7, B:42:0x01ac, B:44:0x01b2, B:46:0x01be, B:50:0x01f6, B:52:0x0201, B:55:0x020e, B:58:0x021c, B:61:0x0227, B:63:0x022a, B:66:0x024a, B:68:0x024f, B:70:0x026e, B:73:0x0282, B:75:0x02a9, B:77:0x02b2, B:79:0x02c1, B:81:0x03ab, B:83:0x03dd, B:84:0x03e0, B:86:0x0409, B:90:0x04e3, B:91:0x04e6, B:92:0x0567, B:97:0x041e, B:99:0x0443, B:101:0x044b, B:103:0x0455, B:107:0x0468, B:109:0x0479, B:112:0x0485, B:114:0x04a1, B:125:0x04b2, B:116:0x04c6, B:118:0x04cc, B:119:0x04d4, B:121:0x04da, B:127:0x0471, B:132:0x042f, B:133:0x02d3, B:135:0x02fe, B:136:0x030e, B:138:0x0315, B:140:0x031b, B:142:0x0325, B:144:0x032b, B:146:0x0331, B:148:0x0337, B:150:0x033c, B:153:0x0347, B:156:0x0360, B:161:0x0366, B:165:0x037a, B:166:0x038b, B:168:0x039c, B:169:0x04fd, B:171:0x052e, B:172:0x0531, B:173:0x0548, B:175:0x054c, B:176:0x025e, B:179:0x01dc, B:187:0x00c6, B:189:0x00ca, B:192:0x00db, B:194:0x00eb, B:196:0x00f5, B:200:0x00fc), top: B:23:0x00a6, inners: #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0409 A[Catch: all -> 0x00c3, TRY_LEAVE, TryCatch #2 {all -> 0x00c3, blocks: (B:24:0x00a6, B:26:0x00b6, B:30:0x00ff, B:32:0x0112, B:34:0x0128, B:36:0x014f, B:39:0x01a7, B:42:0x01ac, B:44:0x01b2, B:46:0x01be, B:50:0x01f6, B:52:0x0201, B:55:0x020e, B:58:0x021c, B:61:0x0227, B:63:0x022a, B:66:0x024a, B:68:0x024f, B:70:0x026e, B:73:0x0282, B:75:0x02a9, B:77:0x02b2, B:79:0x02c1, B:81:0x03ab, B:83:0x03dd, B:84:0x03e0, B:86:0x0409, B:90:0x04e3, B:91:0x04e6, B:92:0x0567, B:97:0x041e, B:99:0x0443, B:101:0x044b, B:103:0x0455, B:107:0x0468, B:109:0x0479, B:112:0x0485, B:114:0x04a1, B:125:0x04b2, B:116:0x04c6, B:118:0x04cc, B:119:0x04d4, B:121:0x04da, B:127:0x0471, B:132:0x042f, B:133:0x02d3, B:135:0x02fe, B:136:0x030e, B:138:0x0315, B:140:0x031b, B:142:0x0325, B:144:0x032b, B:146:0x0331, B:148:0x0337, B:150:0x033c, B:153:0x0347, B:156:0x0360, B:161:0x0366, B:165:0x037a, B:166:0x038b, B:168:0x039c, B:169:0x04fd, B:171:0x052e, B:172:0x0531, B:173:0x0548, B:175:0x054c, B:176:0x025e, B:179:0x01dc, B:187:0x00c6, B:189:0x00ca, B:192:0x00db, B:194:0x00eb, B:196:0x00f5, B:200:0x00fc), top: B:23:0x00a6, inners: #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x04e3 A[Catch: all -> 0x00c3, TryCatch #2 {all -> 0x00c3, blocks: (B:24:0x00a6, B:26:0x00b6, B:30:0x00ff, B:32:0x0112, B:34:0x0128, B:36:0x014f, B:39:0x01a7, B:42:0x01ac, B:44:0x01b2, B:46:0x01be, B:50:0x01f6, B:52:0x0201, B:55:0x020e, B:58:0x021c, B:61:0x0227, B:63:0x022a, B:66:0x024a, B:68:0x024f, B:70:0x026e, B:73:0x0282, B:75:0x02a9, B:77:0x02b2, B:79:0x02c1, B:81:0x03ab, B:83:0x03dd, B:84:0x03e0, B:86:0x0409, B:90:0x04e3, B:91:0x04e6, B:92:0x0567, B:97:0x041e, B:99:0x0443, B:101:0x044b, B:103:0x0455, B:107:0x0468, B:109:0x0479, B:112:0x0485, B:114:0x04a1, B:125:0x04b2, B:116:0x04c6, B:118:0x04cc, B:119:0x04d4, B:121:0x04da, B:127:0x0471, B:132:0x042f, B:133:0x02d3, B:135:0x02fe, B:136:0x030e, B:138:0x0315, B:140:0x031b, B:142:0x0325, B:144:0x032b, B:146:0x0331, B:148:0x0337, B:150:0x033c, B:153:0x0347, B:156:0x0360, B:161:0x0366, B:165:0x037a, B:166:0x038b, B:168:0x039c, B:169:0x04fd, B:171:0x052e, B:172:0x0531, B:173:0x0548, B:175:0x054c, B:176:0x025e, B:179:0x01dc, B:187:0x00c6, B:189:0x00ca, B:192:0x00db, B:194:0x00eb, B:196:0x00f5, B:200:0x00fc), top: B:23:0x00a6, inners: #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x041e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m31098p(zzq zzqVar) {
        long j11;
        C6084o5 m30990R;
        String str;
        String str2;
        C6100q m30994V;
        boolean z11;
        long m30984L;
        PackageInfo packageInfo;
        String str3;
        String str4;
        ApplicationInfo applicationInfo;
        ApplicationInfo applicationInfo2;
        long j12;
        boolean z12;
        long j13;
        String str5;
        boolean z13;
        boolean z14;
        mo31037v().mo31036g();
        m31082e();
        AbstractC4205o.m19722k(zzqVar);
        AbstractC4205o.m19718g(zzqVar.f34702p);
        if (m31059Q(zzqVar)) {
            C6034k c6034k = this.f34172c;
            m31060R(c6034k);
            C6084o5 m30990R2 = c6034k.m30990R(zzqVar.f34702p);
            if (m30990R2 != null && TextUtils.isEmpty(m30990R2.m31258n0()) && !TextUtils.isEmpty(zzqVar.f34703q)) {
                m30990R2.m31255m(0L);
                C6034k c6034k2 = this.f34172c;
                m31060R(c6034k2);
                c6034k2.m31009o(m30990R2);
                C6061m4 c6061m4 = this.f34170a;
                m31060R(c6061m4);
                c6061m4.m31119A(zzqVar.f34702p);
            }
            if (!zzqVar.f34709w) {
                m31070S(zzqVar);
                return;
            }
            long j14 = zzqVar.f34688B;
            if (j14 == 0) {
                j14 = mo31031a().mo105913a();
            }
            this.f34181l.m31369A().m31184q();
            int i11 = zzqVar.f34689C;
            if (i11 != 0 && i11 != 1) {
                mo31033c().m31202w().m31110c("Incorrect app type, assuming installed app. appId, appType", C6082o3.m31193z(zzqVar.f34702p), Integer.valueOf(i11));
                i11 = 0;
            }
            C6034k c6034k3 = this.f34172c;
            m31060R(c6034k3);
            c6034k3.m31002e0();
            try {
                C6034k c6034k4 = this.f34172c;
                m31060R(c6034k4);
                C6099p9 m30995X = c6034k4.m30995X(zzqVar.f34702p, "_npa");
                if (m30995X != null && !"auto".equals(m30995X.f34339b)) {
                    C6034k c6034k5 = this.f34172c;
                    m31060R(c6034k5);
                    m30990R = c6034k5.m30990R((String) AbstractC4205o.m19722k(zzqVar.f34702p));
                    if (m30990R != null || !m31087h0().m31339d0(zzqVar.f34703q, m30990R.m31258n0(), zzqVar.f34692F, m30990R.m31244g0())) {
                        str = "_pfo";
                        str2 = "_sysu";
                    } else {
                        mo31033c().m31202w().m31109b("New GMP App Id passed in. Removing cached database data. appId", C6082o3.m31193z(m30990R.m31248i0()));
                        C6034k c6034k6 = this.f34172c;
                        m31060R(c6034k6);
                        String m31248i0 = m30990R.m31248i0();
                        c6034k6.m31504h();
                        c6034k6.mo31036g();
                        AbstractC4205o.m19718g(m31248i0);
                        try {
                            SQLiteDatabase m30988P = c6034k6.m30988P();
                            String[] strArr = {m31248i0};
                            int delete = m30988P.delete("events", "app_id=?", strArr) + m30988P.delete("user_attributes", "app_id=?", strArr) + m30988P.delete("conditional_properties", "app_id=?", strArr) + m30988P.delete("apps", "app_id=?", strArr) + m30988P.delete("raw_events", "app_id=?", strArr) + m30988P.delete("raw_events_metadata", "app_id=?", strArr) + m30988P.delete("event_filters", "app_id=?", strArr) + m30988P.delete("property_filters", "app_id=?", strArr) + m30988P.delete("audience_filter_values", "app_id=?", strArr) + m30988P.delete("consent_settings", "app_id=?", strArr);
                            C5429id.m29264b();
                            str2 = "_sysu";
                            try {
                                str = "_pfo";
                            } catch (SQLiteException e11) {
                                e = e11;
                                str = "_pfo";
                            }
                            try {
                                if (c6034k6.f34158a.m31401z().m30913B(null, AbstractC5972e3.f33950v0)) {
                                    delete += m30988P.delete("default_event_params", "app_id=?", strArr);
                                }
                                if (delete > 0) {
                                    c6034k6.f34158a.mo31033c().m31201u().m31110c("Deleted application data. app, records", m31248i0, Integer.valueOf(delete));
                                }
                            } catch (SQLiteException e12) {
                                e = e12;
                                c6034k6.f34158a.mo31033c().m31197q().m31110c("Error deleting application data. appId, error", C6082o3.m31193z(m31248i0), e);
                                m30990R = null;
                                if (m30990R != null) {
                                }
                                m31070S(zzqVar);
                                if (i11 == 0) {
                                }
                                if (m30994V == null) {
                                }
                                C6034k c6034k7 = this.f34172c;
                                m31060R(c6034k7);
                                c6034k7.m31008n();
                                C6034k c6034k8 = this.f34172c;
                                m31060R(c6034k8);
                                c6034k8.m31003f0();
                            }
                        } catch (SQLiteException e13) {
                            e = e13;
                            str = "_pfo";
                            str2 = "_sysu";
                        }
                        m30990R = null;
                    }
                    if (m30990R != null) {
                        if (m30990R.m31220P() != -2147483648L && m30990R.m31220P() != zzqVar.f34711y) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        String m31254l0 = m30990R.m31254l0();
                        if (m30990R.m31220P() == -2147483648L && m31254l0 != null && !m31254l0.equals(zzqVar.f34704r)) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (z14 | z13) {
                            Bundle bundle = new Bundle();
                            bundle.putString("_pv", m31254l0);
                            m31088i(new zzaw("_au", new zzau(bundle), "auto", j14), zzqVar);
                        }
                    }
                    m31070S(zzqVar);
                    if (i11 == 0) {
                        C6034k c6034k9 = this.f34172c;
                        m31060R(c6034k9);
                        m30994V = c6034k9.m30994V(zzqVar.f34702p, "_f");
                        z11 = false;
                    } else {
                        C6034k c6034k10 = this.f34172c;
                        m31060R(c6034k10);
                        m30994V = c6034k10.m30994V(zzqVar.f34702p, "_v");
                        z11 = true;
                    }
                    if (m30994V == null) {
                        long j15 = ((j14 / 3600000) + 1) * 3600000;
                        if (!z11) {
                            m31065B(new zzli("_fot", j14, Long.valueOf(j15), "auto"), zzqVar);
                            mo31037v().mo31036g();
                            C5984f4 c5984f4 = (C5984f4) AbstractC4205o.m19722k(this.f34180k);
                            String str6 = zzqVar.f34702p;
                            if (str6 != null && !str6.isEmpty()) {
                                c5984f4.f33990a.mo31037v().mo31036g();
                                if (!c5984f4.m30908a()) {
                                    c5984f4.f33990a.mo31033c().m31200t().m31108a("Install Referrer Reporter is not available");
                                } else {
                                    ServiceConnectionC5973e4 serviceConnectionC5973e4 = new ServiceConnectionC5973e4(c5984f4, str6);
                                    c5984f4.f33990a.mo31037v().mo31036g();
                                    Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
                                    intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
                                    PackageManager packageManager = c5984f4.f33990a.mo31032b().getPackageManager();
                                    if (packageManager == null) {
                                        c5984f4.f33990a.mo31033c().m31204y().m31108a("Failed to obtain Package Manager to verify binding conditions for Install Referrer");
                                    } else {
                                        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
                                        if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                                            ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
                                            if (serviceInfo != null) {
                                                String str7 = serviceInfo.packageName;
                                                if (serviceInfo.name != null && "com.android.vending".equals(str7) && c5984f4.m30908a()) {
                                                    try {
                                                        try {
                                                            boolean m103563a = C19879b.m103558b().m103563a(c5984f4.f33990a.mo31032b(), new Intent(intent), serviceConnectionC5973e4, 1);
                                                            C6060m3 m31201u = c5984f4.f33990a.mo31033c().m31201u();
                                                            if (m103563a) {
                                                                str5 = "available";
                                                            } else {
                                                                str5 = "not available";
                                                            }
                                                            m31201u.m31109b("Install Referrer Service is", str5);
                                                        } catch (RuntimeException e14) {
                                                            e = e14;
                                                            c5984f4.f33990a.mo31033c().m31197q().m31109b("Exception occurred while binding to Install Referrer Service", e.getMessage());
                                                            mo31037v().mo31036g();
                                                            m31082e();
                                                            Bundle bundle2 = new Bundle();
                                                            bundle2.putLong("_c", 1L);
                                                            bundle2.putLong("_r", 1L);
                                                            bundle2.putLong("_uwa", 0L);
                                                            String str8 = str;
                                                            bundle2.putLong(str8, 0L);
                                                            bundle2.putLong("_sys", 0L);
                                                            String str9 = str2;
                                                            bundle2.putLong(str9, 0L);
                                                            bundle2.putLong("_et", 1L);
                                                            if (zzqVar.f34691E) {
                                                            }
                                                            String str10 = (String) AbstractC4205o.m19722k(zzqVar.f34702p);
                                                            C6034k c6034k11 = this.f34172c;
                                                            m31060R(c6034k11);
                                                            AbstractC4205o.m19718g(str10);
                                                            c6034k11.mo31036g();
                                                            c6034k11.m31504h();
                                                            m30984L = c6034k11.m30984L(str10, "first_open_count");
                                                            if (this.f34181l.mo31032b().getPackageManager() != null) {
                                                            }
                                                            if (m30984L >= 0) {
                                                            }
                                                            m31092k(new zzaw("_f", new zzau(bundle2), "auto", j14), zzqVar);
                                                            C6034k c6034k72 = this.f34172c;
                                                            m31060R(c6034k72);
                                                            c6034k72.m31008n();
                                                            C6034k c6034k82 = this.f34172c;
                                                            m31060R(c6034k82);
                                                            c6034k82.m31003f0();
                                                        }
                                                    } catch (RuntimeException e15) {
                                                        e = e15;
                                                    }
                                                } else {
                                                    c5984f4.f33990a.mo31033c().m31202w().m31108a("Play Store version 8.3.73 or higher required for Install Referrer");
                                                }
                                            }
                                        } else {
                                            c5984f4.f33990a.mo31033c().m31200t().m31108a("Play Service for fetching Install Referrer is unavailable on device");
                                        }
                                    }
                                }
                            } else {
                                c5984f4.f33990a.mo31033c().m31204y().m31108a("Install Referrer Reporter was called with invalid app package name");
                            }
                            mo31037v().mo31036g();
                            m31082e();
                            Bundle bundle22 = new Bundle();
                            bundle22.putLong("_c", 1L);
                            bundle22.putLong("_r", 1L);
                            bundle22.putLong("_uwa", 0L);
                            String str82 = str;
                            bundle22.putLong(str82, 0L);
                            bundle22.putLong("_sys", 0L);
                            String str92 = str2;
                            bundle22.putLong(str92, 0L);
                            bundle22.putLong("_et", 1L);
                            if (zzqVar.f34691E) {
                                bundle22.putLong("_dac", 1L);
                            }
                            String str102 = (String) AbstractC4205o.m19722k(zzqVar.f34702p);
                            C6034k c6034k112 = this.f34172c;
                            m31060R(c6034k112);
                            AbstractC4205o.m19718g(str102);
                            c6034k112.mo31036g();
                            c6034k112.m31504h();
                            m30984L = c6034k112.m30984L(str102, "first_open_count");
                            if (this.f34181l.mo31032b().getPackageManager() != null) {
                                mo31033c().m31197q().m31109b("PackageManager is null, first open report might be inaccurate. appId", C6082o3.m31193z(str102));
                            } else {
                                try {
                                    packageInfo = C21472e.m111067a(this.f34181l.mo31032b()).m111064f(str102, 0);
                                } catch (PackageManager.NameNotFoundException e16) {
                                    mo31033c().m31197q().m31110c("Package info is null, first open report might be inaccurate. appId", C6082o3.m31193z(str102), e16);
                                    packageInfo = null;
                                }
                                if (packageInfo != null) {
                                    long j16 = packageInfo.firstInstallTime;
                                    if (j16 != 0) {
                                        if (j16 != packageInfo.lastUpdateTime) {
                                            applicationInfo = null;
                                            if (m31072U().m30913B(null, AbstractC5972e3.f33918f0)) {
                                                if (m30984L == 0) {
                                                    bundle22.putLong("_uwa", 1L);
                                                    m30984L = 0;
                                                }
                                            } else {
                                                bundle22.putLong("_uwa", 1L);
                                            }
                                            z12 = false;
                                        } else {
                                            applicationInfo = null;
                                            z12 = true;
                                        }
                                        if (true != z12) {
                                            j13 = 0;
                                        } else {
                                            j13 = 1;
                                        }
                                        str3 = "_sys";
                                        str4 = str92;
                                        m31065B(new zzli("_fi", j14, Long.valueOf(j13), "auto"), zzqVar);
                                        applicationInfo2 = C21472e.m111067a(this.f34181l.mo31032b()).m111061c(str102, 0);
                                        if (applicationInfo2 != null) {
                                            if ((applicationInfo2.flags & 1) != 0) {
                                                j12 = 1;
                                                bundle22.putLong(str3, 1L);
                                            } else {
                                                j12 = 1;
                                            }
                                            if ((applicationInfo2.flags & 128) != 0) {
                                                bundle22.putLong(str4, j12);
                                            }
                                        }
                                    }
                                }
                                str3 = "_sys";
                                str4 = str92;
                                applicationInfo = null;
                                applicationInfo2 = C21472e.m111067a(this.f34181l.mo31032b()).m111061c(str102, 0);
                                if (applicationInfo2 != null) {
                                }
                            }
                            if (m30984L >= 0) {
                                bundle22.putLong(str82, m30984L);
                            }
                            m31092k(new zzaw("_f", new zzau(bundle22), "auto", j14), zzqVar);
                        } else {
                            m31065B(new zzli("_fvt", j14, Long.valueOf(j15), "auto"), zzqVar);
                            mo31037v().mo31036g();
                            m31082e();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("_c", 1L);
                            bundle3.putLong("_r", 1L);
                            bundle3.putLong("_et", 1L);
                            if (zzqVar.f34691E) {
                                bundle3.putLong("_dac", 1L);
                            }
                            m31092k(new zzaw("_v", new zzau(bundle3), "auto", j14), zzqVar);
                        }
                    } else if (zzqVar.f34710x) {
                        m31092k(new zzaw("_cd", new zzau(new Bundle()), "auto", j14), zzqVar);
                    }
                    C6034k c6034k722 = this.f34172c;
                    m31060R(c6034k722);
                    c6034k722.m31008n();
                    C6034k c6034k822 = this.f34172c;
                    m31060R(c6034k822);
                    c6034k822.m31003f0();
                }
                if (zzqVar.f34693G != null) {
                    if (true != zzqVar.f34693G.booleanValue()) {
                        j11 = 0;
                    } else {
                        j11 = 1;
                    }
                    zzli zzliVar = new zzli("_npa", j14, Long.valueOf(j11), "auto");
                    if (m30995X == null || !m30995X.f34342e.equals(zzliVar.f34683s)) {
                        m31065B(zzliVar, zzqVar);
                    }
                } else if (m30995X != null) {
                    m31102t("_npa", zzqVar);
                }
                C6034k c6034k52 = this.f34172c;
                m31060R(c6034k52);
                m30990R = c6034k52.m30990R((String) AbstractC4205o.m19722k(zzqVar.f34702p));
                if (m30990R != null) {
                }
                str = "_pfo";
                str2 = "_sysu";
                if (m30990R != null) {
                }
                m31070S(zzqVar);
                if (i11 == 0) {
                }
                if (m30994V == null) {
                }
                C6034k c6034k7222 = this.f34172c;
                m31060R(c6034k7222);
                c6034k7222.m31008n();
                C6034k c6034k8222 = this.f34172c;
                m31060R(c6034k8222);
                c6034k8222.m31003f0();
            } catch (Throwable th2) {
                C6034k c6034k12 = this.f34172c;
                m31060R(c6034k12);
                c6034k12.m31003f0();
                throw th2;
            }
        }
    }

    /* renamed from: q */
    public final void m31099q() {
        this.f34186q++;
    }

    /* renamed from: r */
    public final void m31100r(zzac zzacVar) {
        zzq m31051I = m31051I((String) AbstractC4205o.m19722k(zzacVar.f34664p));
        if (m31051I != null) {
            m31101s(zzacVar, m31051I);
        }
    }

    /* renamed from: s */
    public final void m31101s(zzac zzacVar, zzq zzqVar) {
        Bundle bundle;
        AbstractC4205o.m19722k(zzacVar);
        AbstractC4205o.m19718g(zzacVar.f34664p);
        AbstractC4205o.m19722k(zzacVar.f34666r);
        AbstractC4205o.m19718g(zzacVar.f34666r.f34681q);
        mo31037v().mo31036g();
        m31082e();
        if (!m31059Q(zzqVar)) {
            return;
        }
        if (zzqVar.f34709w) {
            C6034k c6034k = this.f34172c;
            m31060R(c6034k);
            c6034k.m31002e0();
            try {
                m31070S(zzqVar);
                String str = (String) AbstractC4205o.m19722k(zzacVar.f34664p);
                C6034k c6034k2 = this.f34172c;
                m31060R(c6034k2);
                zzac m30991S = c6034k2.m30991S(str, zzacVar.f34666r.f34681q);
                if (m30991S != null) {
                    mo31033c().m31196p().m31110c("Removing conditional user property", zzacVar.f34664p, this.f34181l.m31372D().m30966f(zzacVar.f34666r.f34681q));
                    C6034k c6034k3 = this.f34172c;
                    m31060R(c6034k3);
                    c6034k3.m30983J(str, zzacVar.f34666r.f34681q);
                    if (m30991S.f34668t) {
                        C6034k c6034k4 = this.f34172c;
                        m31060R(c6034k4);
                        c6034k4.m31006l(str, zzacVar.f34666r.f34681q);
                    }
                    zzaw zzawVar = zzacVar.f34674z;
                    if (zzawVar != null) {
                        zzau zzauVar = zzawVar.f34677q;
                        if (zzauVar != null) {
                            bundle = zzauVar.m31509F();
                        } else {
                            bundle = null;
                        }
                        m31067D((zzaw) AbstractC4205o.m19722k(m31087h0().m31361y0(str, ((zzaw) AbstractC4205o.m19722k(zzacVar.f34674z)).f34676p, bundle, m30991S.f34665q, zzacVar.f34674z.f34679s, true, true)), zzqVar);
                    }
                } else {
                    mo31033c().m31202w().m31110c("Conditional user property doesn't exist", C6082o3.m31193z(zzacVar.f34664p), this.f34181l.m31372D().m30966f(zzacVar.f34666r.f34681q));
                }
                C6034k c6034k5 = this.f34172c;
                m31060R(c6034k5);
                c6034k5.m31008n();
                C6034k c6034k6 = this.f34172c;
                m31060R(c6034k6);
                c6034k6.m31003f0();
                return;
            } catch (Throwable th2) {
                C6034k c6034k7 = this.f34172c;
                m31060R(c6034k7);
                c6034k7.m31003f0();
                throw th2;
            }
        }
        m31070S(zzqVar);
    }

    /* renamed from: t */
    public final void m31102t(String str, zzq zzqVar) {
        long j11;
        mo31037v().mo31036g();
        m31082e();
        if (!m31059Q(zzqVar)) {
            return;
        }
        if (!zzqVar.f34709w) {
            m31070S(zzqVar);
            return;
        }
        if ("_npa".equals(str) && zzqVar.f34693G != null) {
            mo31033c().m31196p().m31108a("Falling back to manifest metadata value for ad personalization");
            long mo105913a = mo31031a().mo105913a();
            if (true != zzqVar.f34693G.booleanValue()) {
                j11 = 0;
            } else {
                j11 = 1;
            }
            m31065B(new zzli("_npa", mo105913a, Long.valueOf(j11), "auto"), zzqVar);
            return;
        }
        mo31033c().m31196p().m31109b("Removing user property", this.f34181l.m31372D().m30966f(str));
        C6034k c6034k = this.f34172c;
        m31060R(c6034k);
        c6034k.m31002e0();
        try {
            m31070S(zzqVar);
            if ("_id".equals(str)) {
                C6034k c6034k2 = this.f34172c;
                m31060R(c6034k2);
                c6034k2.m31006l((String) AbstractC4205o.m19722k(zzqVar.f34702p), "_lair");
            }
            C6034k c6034k3 = this.f34172c;
            m31060R(c6034k3);
            c6034k3.m31006l((String) AbstractC4205o.m19722k(zzqVar.f34702p), str);
            C6034k c6034k4 = this.f34172c;
            m31060R(c6034k4);
            c6034k4.m31008n();
            mo31033c().m31196p().m31109b("User property removed", this.f34181l.m31372D().m30966f(str));
            C6034k c6034k5 = this.f34172c;
            m31060R(c6034k5);
            c6034k5.m31003f0();
        } catch (Throwable th2) {
            C6034k c6034k6 = this.f34172c;
            m31060R(c6034k6);
            c6034k6.m31003f0();
            throw th2;
        }
    }

    /* renamed from: u */
    public final void m31103u(zzq zzqVar) {
        if (this.f34193x != null) {
            ArrayList arrayList = new ArrayList();
            this.f34194y = arrayList;
            arrayList.addAll(this.f34193x);
        }
        C6034k c6034k = this.f34172c;
        m31060R(c6034k);
        String str = (String) AbstractC4205o.m19722k(zzqVar.f34702p);
        AbstractC4205o.m19718g(str);
        c6034k.mo31036g();
        c6034k.m31504h();
        try {
            SQLiteDatabase m30988P = c6034k.m30988P();
            String[] strArr = {str};
            int delete = m30988P.delete("apps", "app_id=?", strArr) + m30988P.delete("events", "app_id=?", strArr) + m30988P.delete("user_attributes", "app_id=?", strArr) + m30988P.delete("conditional_properties", "app_id=?", strArr) + m30988P.delete("raw_events", "app_id=?", strArr) + m30988P.delete("raw_events_metadata", "app_id=?", strArr) + m30988P.delete("queue", "app_id=?", strArr) + m30988P.delete("audience_filter_values", "app_id=?", strArr) + m30988P.delete("main_event_params", "app_id=?", strArr) + m30988P.delete("default_event_params", "app_id=?", strArr);
            if (delete > 0) {
                c6034k.f34158a.mo31033c().m31201u().m31110c("Reset analytics data. app, records", str, Integer.valueOf(delete));
            }
        } catch (SQLiteException e11) {
            c6034k.f34158a.mo31033c().m31197q().m31110c("Error resetting analytics data. appId, error", C6082o3.m31193z(str), e11);
        }
        if (zzqVar.f34709w) {
            m31098p(zzqVar);
        }
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC6073n5
    /* renamed from: v */
    public final C6105q4 mo31037v() {
        return ((C6127s4) AbstractC4205o.m19722k(this.f34181l)).mo31037v();
    }

    /* renamed from: w */
    public final void m31104w(String str, C6184x6 c6184x6) {
        mo31037v().mo31036g();
        String str2 = this.f34168D;
        if (str2 != null && !str2.equals(str) && c6184x6 == null) {
            return;
        }
        this.f34168D = str;
        this.f34167C = c6184x6;
    }

    /* renamed from: x */
    public final void m31105x() {
        mo31037v().mo31036g();
        C6034k c6034k = this.f34172c;
        m31060R(c6034k);
        c6034k.m31005h0();
        if (this.f34178i.f34041g.m31502a() == 0) {
            this.f34178i.f34041g.m31503b(mo31031a().mo105913a());
        }
        m31055M();
    }

    /* renamed from: y */
    public final void m31106y(zzac zzacVar) {
        zzq m31051I = m31051I((String) AbstractC4205o.m19722k(zzacVar.f34664p));
        if (m31051I != null) {
            m31107z(zzacVar, m31051I);
        }
    }

    /* renamed from: z */
    public final void m31107z(zzac zzacVar, zzq zzqVar) {
        AbstractC4205o.m19722k(zzacVar);
        AbstractC4205o.m19718g(zzacVar.f34664p);
        AbstractC4205o.m19722k(zzacVar.f34665q);
        AbstractC4205o.m19722k(zzacVar.f34666r);
        AbstractC4205o.m19718g(zzacVar.f34666r.f34681q);
        mo31037v().mo31036g();
        m31082e();
        if (!m31059Q(zzqVar)) {
            return;
        }
        if (!zzqVar.f34709w) {
            m31070S(zzqVar);
            return;
        }
        zzac zzacVar2 = new zzac(zzacVar);
        boolean z11 = false;
        zzacVar2.f34668t = false;
        C6034k c6034k = this.f34172c;
        m31060R(c6034k);
        c6034k.m31002e0();
        try {
            C6034k c6034k2 = this.f34172c;
            m31060R(c6034k2);
            zzac m30991S = c6034k2.m30991S((String) AbstractC4205o.m19722k(zzacVar2.f34664p), zzacVar2.f34666r.f34681q);
            if (m30991S != null && !m30991S.f34665q.equals(zzacVar2.f34665q)) {
                mo31033c().m31202w().m31111d("Updating a conditional user property with different origin. name, origin, origin (from DB)", this.f34181l.m31372D().m30966f(zzacVar2.f34666r.f34681q), zzacVar2.f34665q, m30991S.f34665q);
            }
            if (m30991S != null && m30991S.f34668t) {
                zzacVar2.f34665q = m30991S.f34665q;
                zzacVar2.f34667s = m30991S.f34667s;
                zzacVar2.f34671w = m30991S.f34671w;
                zzacVar2.f34669u = m30991S.f34669u;
                zzacVar2.f34672x = m30991S.f34672x;
                zzacVar2.f34668t = true;
                zzli zzliVar = zzacVar2.f34666r;
                zzacVar2.f34666r = new zzli(zzliVar.f34681q, m30991S.f34666r.f34682r, zzliVar.m31514t(), m30991S.f34666r.f34685u);
            } else if (TextUtils.isEmpty(zzacVar2.f34669u)) {
                zzli zzliVar2 = zzacVar2.f34666r;
                zzacVar2.f34666r = new zzli(zzliVar2.f34681q, zzacVar2.f34667s, zzliVar2.m31514t(), zzacVar2.f34666r.f34685u);
                zzacVar2.f34668t = true;
                z11 = true;
            }
            if (zzacVar2.f34668t) {
                zzli zzliVar3 = zzacVar2.f34666r;
                C6099p9 c6099p9 = new C6099p9((String) AbstractC4205o.m19722k(zzacVar2.f34664p), zzacVar2.f34665q, zzliVar3.f34681q, zzliVar3.f34682r, AbstractC4205o.m19722k(zzliVar3.m31514t()));
                C6034k c6034k3 = this.f34172c;
                m31060R(c6034k3);
                if (c6034k3.m31017x(c6099p9)) {
                    mo31033c().m31196p().m31111d("User property updated immediately", zzacVar2.f34664p, this.f34181l.m31372D().m30966f(c6099p9.f34340c), c6099p9.f34342e);
                } else {
                    mo31033c().m31197q().m31111d("(2)Too many active user properties, ignoring", C6082o3.m31193z(zzacVar2.f34664p), this.f34181l.m31372D().m30966f(c6099p9.f34340c), c6099p9.f34342e);
                }
                if (z11 && zzacVar2.f34672x != null) {
                    m31067D(new zzaw(zzacVar2.f34672x, zzacVar2.f34667s), zzqVar);
                }
            }
            C6034k c6034k4 = this.f34172c;
            m31060R(c6034k4);
            if (c6034k4.m31016w(zzacVar2)) {
                mo31033c().m31196p().m31111d("Conditional property added", zzacVar2.f34664p, this.f34181l.m31372D().m30966f(zzacVar2.f34666r.f34681q), zzacVar2.f34666r.m31514t());
            } else {
                mo31033c().m31197q().m31111d("Too many conditional properties, ignoring", C6082o3.m31193z(zzacVar2.f34664p), this.f34181l.m31372D().m30966f(zzacVar2.f34666r.f34681q), zzacVar2.f34666r.m31514t());
            }
            C6034k c6034k5 = this.f34172c;
            m31060R(c6034k5);
            c6034k5.m31008n();
            C6034k c6034k6 = this.f34172c;
            m31060R(c6034k6);
            c6034k6.m31003f0();
        } catch (Throwable th2) {
            C6034k c6034k7 = this.f34172c;
            m31060R(c6034k7);
            c6034k7.m31003f0();
            throw th2;
        }
    }
}
