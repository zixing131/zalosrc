package p604wb;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.SystemClock;
import android.text.TextUtils;
import au.AbstractC2351i;
import com.zing.zalo.ads.manager.AdsTrackingReceiver;
import fg0.ThreadFactoryC18928a;
import gu.AbstractC19601a;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONException;
import org.json.JSONObject;
import p573vb.C27958a;
import p639xb.AbstractC29570c;
import p639xb.C29568a;
import p639xb.C29571d;
import p639xb.InterfaceC29569b;
import p676yb.AbstractC30890a;

/* renamed from: wb.e */
/* loaded from: classes.dex */
public class C28905e {

    /* renamed from: g */
    public static long f133807g = 5000;

    /* renamed from: h */
    public static long f133808h = 15000;

    /* renamed from: i */
    public static long f133809i = 300000;

    /* renamed from: j */
    public static long f133810j = 3600000;

    /* renamed from: k */
    public static long f133811k = 1471228928;

    /* renamed from: l */
    public static long f133812l;

    /* renamed from: m */
    static ArrayList f133813m = new ArrayList();

    /* renamed from: n */
    static HashMap f133814n = new HashMap();

    /* renamed from: o */
    static HashMap f133815o = new HashMap();

    /* renamed from: p */
    static ArrayList f133816p = new ArrayList();

    /* renamed from: q */
    private static final ExecutorService f133817q = Executors.newSingleThreadExecutor(new ThreadFactoryC18928a("AdsTracking"));

    /* renamed from: r */
    static C28905e f133818r;

    /* renamed from: a */
    Context f133819a;

    /* renamed from: b */
    AlarmManager f133820b;

    /* renamed from: c */
    AbstractC29570c f133821c;

    /* renamed from: d */
    InterfaceC29569b f133822d;

    /* renamed from: e */
    boolean f133823e = false;

    /* renamed from: f */
    BroadcastReceiver f133824f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: wb.e$a */
    /* loaded from: classes3.dex */
    public class a implements AbstractC29570c.a {
        a() {
        }

        @Override // p639xb.AbstractC29570c.a
        /* renamed from: a */
        public void mo144403a(List list) {
            try {
                C28905e.this.m144379H("Upload ads tracking success");
                if (list != null && list.size() > 0) {
                    C27958a.m140909q(C28905e.this.f133819a).m140912d(C28905e.m144361D(list, true));
                    C28905e.this.f133819a.sendBroadcast(new Intent("com.zing.zalo.ads.receiver.AdsTrackingManager.SubmitBatch"));
                }
                C28905e.this.m144389h();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            C28905e.this.f133823e = false;
        }

        @Override // p639xb.AbstractC29570c.a
        /* renamed from: b */
        public void mo144404b(int i11) {
            try {
                C28905e.this.m144378G("Upload ads tracking failed: errorCode=" + i11);
                C28905e.this.m144384M();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            C28905e.this.f133823e = false;
        }
    }

    C28905e() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A */
    public /* synthetic */ void m144358A(Context context) {
        try {
            f133813m = C27958a.m140909q(context).m140917r();
            Iterator it = C27958a.m140909q(context).m140919t().iterator();
            while (it.hasNext()) {
                C29571d c29571d = (C29571d) it.next();
                f133814n.put(c29571d.m146956j(), c29571d);
            }
            m144387f();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B */
    public /* synthetic */ void m144359B(C29568a c29568a) {
        try {
            m144379H("Insert Ads to db " + c29568a.toString());
            C27958a.m140909q(this.f133819a).m140920v(c29568a);
            if (c29568a.m146944a() == 20) {
                m144379H("Submit click ads now: " + c29568a.toString());
                this.f133819a.sendBroadcast(new Intent("com.zing.zalo.ads.receiver.AdsTrackingManager.SubmitBatch"));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C */
    public /* synthetic */ void m144360C() {
        try {
            AbstractC29570c abstractC29570c = this.f133821c;
            if (abstractC29570c != null) {
                abstractC29570c.m146955b(new a());
                ArrayList m140918s = C27958a.m140909q(this.f133819a).m140918s();
                if (m140918s.size() > 0) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = m140918s.iterator();
                    while (it.hasNext()) {
                        C29568a c29568a = (C29568a) it.next();
                        if (c29568a.m146952i()) {
                            it.remove();
                            arrayList.add(c29568a);
                        }
                    }
                    if (arrayList.size() > 0) {
                        C27958a.m140909q(this.f133819a).m140912d(m144361D(arrayList, true));
                    }
                    m144381J(m140918s);
                    if (m140918s.size() > 0) {
                        this.f133821c.mo146954a(m140918s);
                        return;
                    } else {
                        this.f133823e = false;
                        m144384M();
                        return;
                    }
                }
                this.f133823e = false;
                m144384M();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
            this.f133823e = false;
            m144384M();
        }
    }

    /* renamed from: D */
    public static String m144361D(List list, boolean z11) {
        StringBuffer stringBuffer = new StringBuffer(64);
        Iterator it = list.iterator();
        boolean z12 = true;
        while (it.hasNext()) {
            String m146946c = ((C29568a) it.next()).m146946c();
            if (!z12) {
                stringBuffer.append(",");
            } else {
                z12 = false;
            }
            if (z11) {
                stringBuffer.append("'");
                stringBuffer.append(m146946c);
                stringBuffer.append("'");
            } else {
                stringBuffer.append(m146946c);
            }
        }
        return stringBuffer.toString();
    }

    /* renamed from: E */
    public static String m144362E(List list, boolean z11) {
        StringBuffer stringBuffer = new StringBuffer(64);
        Iterator it = list.iterator();
        boolean z12 = true;
        while (it.hasNext()) {
            String m146956j = ((C29571d) it.next()).m146956j();
            if (!z12) {
                stringBuffer.append(",");
            } else {
                z12 = false;
            }
            if (z11) {
                stringBuffer.append("'");
                stringBuffer.append(m146956j);
                stringBuffer.append("'");
            } else {
                stringBuffer.append(m146956j);
            }
        }
        return stringBuffer.toString();
    }

    /* renamed from: N */
    public static void m144363N(Context context, long j11) {
        AbstractC30890a.m150113j(context, j11);
    }

    /* renamed from: O */
    public static void m144364O(Context context, long j11) {
        AbstractC30890a.m150114k(context, j11);
    }

    /* renamed from: P */
    public static void m144365P(Context context, long j11) {
        AbstractC30890a.m150115l(context, j11);
    }

    /* renamed from: Q */
    public static void m144366Q(Context context, long j11) {
        AbstractC30890a.m150118o(context, j11);
    }

    /* renamed from: R */
    public static void m144367R(Context context, int i11) {
        AbstractC30890a.m150112i(context, i11);
    }

    /* renamed from: l */
    static long m144372l(int i11) {
        return i11 != 10 ? i11 != 20 ? f133807g : f133807g : f133808h;
    }

    /* renamed from: n */
    public static synchronized C28905e m144373n() {
        C28905e c28905e;
        synchronized (C28905e.class) {
            try {
                if (f133818r == null) {
                    f133818r = new C28905e();
                }
                c28905e = f133818r;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c28905e;
    }

    /* renamed from: o */
    static String m144374o(int i11, int i12, String str) {
        return i11 + "_" + str + "_" + i12;
    }

    /* renamed from: y */
    static boolean m144375y(int i11, String str, int i12, long j11) {
        boolean z11;
        try {
            Iterator it = f133813m.iterator();
            while (it.hasNext()) {
                C29568a c29568a = (C29568a) it.next();
                if (i11 == 40) {
                    return f133815o.containsKey(m144374o(i11, i12, str));
                }
                if (i11 == 50) {
                    Iterator it2 = f133816p.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            C29568a c29568a2 = (C29568a) it2.next();
                            if (c29568a2.m146944a() == i11 && c29568a2.m146947d().equals(str) && c29568a2.m146948e() == i12) {
                                z11 = true;
                                break;
                            }
                        } else {
                            z11 = false;
                            break;
                        }
                    }
                    String m144374o = m144374o(i11, i12, str);
                    if (!z11 && !f133815o.containsKey(m144374o)) {
                        return false;
                    }
                    return true;
                }
                if (c29568a.m146944a() == i11 && c29568a.m146947d().equals(str) && c29568a.m146948e() == i12 && j11 - c29568a.m146949f() < m144372l(i11)) {
                    return true;
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z */
    public /* synthetic */ void m144376z(String str, long j11, String str2, int i11, int i12, String str3, int i13) {
        try {
            if (f133814n.containsKey(str) && j11 - ((C29571d) f133814n.get(str)).m146949f() < f133807g) {
                return;
            }
            C29571d c29571d = new C29571d(j11 + "", str2, i11, i12, str3, i13, j11, str, "");
            f133814n.put(str, c29571d);
            try {
                C27958a.m140909q(this.f133819a).m140921y(c29571d);
            } catch (Exception e11) {
                e = e11;
                e.printStackTrace();
            }
        } catch (Exception e12) {
            e = e12;
        }
    }

    /* renamed from: F */
    void m144377F(final Context context) {
        try {
            f133813m.clear();
            f133814n.clear();
            f133817q.execute(new Runnable() { // from class: wb.c
                @Override // java.lang.Runnable
                public final void run() {
                    C28905e.this.m144358A(context);
                }
            });
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: G */
    void m144378G(String str) {
    }

    /* renamed from: H */
    void m144379H(String str) {
    }

    /* renamed from: I */
    void m144380I() {
    }

    /* renamed from: J */
    void m144381J(List list) {
    }

    /* renamed from: K */
    void m144382K(final C29568a c29568a) {
        if (c29568a != null) {
            f133817q.execute(new Runnable() { // from class: wb.b
                @Override // java.lang.Runnable
                public final void run() {
                    C28905e.this.m144359B(c29568a);
                }
            });
        }
    }

    /* renamed from: L */
    public void m144383L(int i11, int i12, String str) {
        try {
            String m144374o = m144374o(i11, i12, str);
            m144379H("resetSubmittedItem: " + m144374o);
            f133815o.remove(m144374o);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: M */
    public void m144384M() {
        try {
            this.f133820b.set(3, SystemClock.elapsedRealtime() + f133809i, PendingIntent.getBroadcast(this.f133819a, 0, new Intent("com.zing.zalo.ads.receiver.AdsTrackingManager.SubmitBatch"), AbstractC19601a.m102571a(268435456)));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: S */
    public synchronized void m144385S() {
        try {
        } catch (Exception e11) {
            e11.printStackTrace();
            this.f133823e = false;
        }
        if (this.f133823e) {
            return;
        }
        this.f133823e = true;
        f133817q.execute(new Runnable() { // from class: wb.a
            @Override // java.lang.Runnable
            public final void run() {
                C28905e.this.m144360C();
            }
        });
    }

    /* renamed from: e */
    void m144386e() {
        try {
            this.f133820b.cancel(PendingIntent.getBroadcast(this.f133819a, 0, new Intent("com.zing.zalo.ads.receiver.AdsTrackingManager.SubmitBatch"), AbstractC19601a.m102571a(268435456)));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: f */
    public synchronized void m144387f() {
        try {
            try {
                if (f133814n.size() > 0 && this.f133822d != null) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = f133814n.values().iterator();
                    while (it.hasNext()) {
                        C29571d c29571d = (C29571d) it.next();
                        if (c29571d.m146957k()) {
                            if (this.f133822d.mo146953a(c29571d.m146956j())) {
                                m144379H("Installed app: " + c29571d.m146956j());
                                m144373n().m144398t(c29571d.m146945b(), c29571d.m146944a(), c29571d.m146948e(), c29571d.m146947d(), c29571d.m146951h(), c29571d.m146949f(), "");
                                arrayList.add(c29571d);
                                it.remove();
                            }
                        } else {
                            arrayList.add(c29571d);
                            it.remove();
                        }
                    }
                    m144380I();
                    if (arrayList.size() > 0) {
                        C27958a.m140909q(this.f133819a).m140916o(m144362E(arrayList, true));
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: g */
    public void m144388g() {
        try {
            f133813m.clear();
            f133814n.clear();
            C27958a.m140909q(this.f133819a).m140913f();
            C27958a.m140909q(this.f133819a).m140914h();
            m144386e();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: h */
    void m144389h() {
        try {
            Iterator it = f133813m.iterator();
            while (it.hasNext()) {
                C29568a c29568a = (C29568a) it.next();
                if (m144393m() - c29568a.m146949f() >= m144372l(c29568a.m146944a())) {
                    m144379H("Remove in mem: " + c29568a.m146946c());
                    it.remove();
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: i */
    public void m144390i(int i11, int i12, String str, long j11) {
        try {
            Iterator it = f133816p.iterator();
            while (it.hasNext()) {
                C29568a c29568a = (C29568a) it.next();
                m144379H("endImpressionActiveView: viewTime=" + (j11 - c29568a.m146949f()));
                if (c29568a.m146944a() == i11 && c29568a.m146947d().equals(str) && c29568a.m146948e() == i12) {
                    if (j11 - c29568a.m146949f() > 1000) {
                        synchronized (f133813m) {
                            f133813m.add(0, c29568a);
                        }
                        if (f133813m.size() > 50) {
                            m144389h();
                        }
                        String m144374o = m144374o(i11, i12, str);
                        f133815o.put(m144374o, m144374o);
                        m144382K(c29568a);
                    }
                    it.remove();
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: j */
    public void m144391j(long j11) {
        try {
            Iterator it = f133816p.iterator();
            while (it.hasNext()) {
                C29568a c29568a = (C29568a) it.next();
                m144379H("endImpressionActiveView: viewTime=" + (j11 - c29568a.m146949f()));
                if (j11 - c29568a.m146949f() > 1000) {
                    synchronized (f133813m) {
                        f133813m.add(0, c29568a);
                    }
                    if (f133813m.size() > 50) {
                        m144389h();
                    }
                    String m144374o = m144374o(c29568a.m146944a(), c29568a.m146948e(), c29568a.m146947d());
                    f133815o.put(m144374o, m144374o);
                    m144382K(c29568a);
                }
                it.remove();
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: k */
    public void m144392k(String str, int i11, int i12, String str2, int i13, long j11, String str3) {
        try {
            String m144374o = m144374o(i11, i12, str2);
            Iterator it = f133816p.iterator();
            while (it.hasNext()) {
                C29568a c29568a = (C29568a) it.next();
                if (c29568a.m146944a() == i11 && c29568a.m146947d().equals(str2) && c29568a.m146948e() == i12) {
                    it.remove();
                }
            }
            if (!f133815o.containsKey(m144374o)) {
                f133815o.put(m144374o, m144374o);
                C29568a c29568a2 = new C29568a(j11 + "", str, i11, i12, str2, i13, j11, str3);
                synchronized (f133813m) {
                    try {
                        try {
                            f133813m.add(0, c29568a2);
                        } catch (Throwable th2) {
                            th = th2;
                            while (true) {
                                try {
                                    break;
                                } catch (Throwable th3) {
                                    th = th3;
                                }
                            }
                            throw th;
                        }
                    } catch (Exception e11) {
                        e = e11;
                        AbstractC20110a.m104539h(e);
                        return;
                    }
                }
                if (f133813m.size() > 50) {
                    m144389h();
                }
                m144382K(c29568a2);
            }
        } catch (Exception e12) {
            e = e12;
        }
    }

    /* renamed from: m */
    public long m144393m() {
        InterfaceC29569b interfaceC29569b = this.f133822d;
        if (interfaceC29569b != null) {
            return interfaceC29569b.getCurrentTime();
        }
        return System.currentTimeMillis();
    }

    /* renamed from: p */
    public synchronized void m144394p(Context context, AbstractC29570c abstractC29570c, InterfaceC29569b interfaceC29569b) {
        this.f133819a = context;
        this.f133820b = (AlarmManager) context.getSystemService("alarm");
        try {
            BroadcastReceiver broadcastReceiver = this.f133824f;
            if (broadcastReceiver != null) {
                context.unregisterReceiver(broadcastReceiver);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        AdsTrackingReceiver adsTrackingReceiver = new AdsTrackingReceiver();
        this.f133824f = adsTrackingReceiver;
        AbstractC2351i.m12327a(context, adsTrackingReceiver, new IntentFilter("com.zing.zalo.ads.receiver.AdsTrackingManager.SubmitBatch"), true);
        f133809i = AbstractC30890a.m150111h(context);
        f133807g = AbstractC30890a.m150106c(context);
        f133808h = AbstractC30890a.m150107d(context);
        f133810j = AbstractC30890a.m150108e(context);
        f133811k = AbstractC30890a.m150104a(context);
        f133812l = AbstractC30890a.m150105b(context);
        this.f133821c = abstractC29570c;
        this.f133822d = interfaceC29569b;
        m144395q();
    }

    /* renamed from: q */
    public void m144395q() {
        try {
            m144377F(this.f133819a);
            m144384M();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: r */
    public void m144396r(int i11, int i12, String str, String str2, String str3) {
        String str4 = "";
        try {
            if (i12 != 81) {
                if (i12 == 80) {
                }
                m144398t(str, i11, i12, str2, -1, m144393m(), str4);
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ownerId", str3);
            if (i12 == 81) {
                jSONObject.put("msgId", str2);
            } else {
                jSONObject.put("feedId", str2);
            }
            str4 = jSONObject.toString();
            m144398t(str, i11, i12, str2, -1, m144393m(), str4);
        } catch (JSONException e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: s */
    public void m144397s(final String str, final int i11, final int i12, final String str2, final int i13, final long j11, final String str3) {
        try {
            f133817q.execute(new Runnable() { // from class: wb.d
                @Override // java.lang.Runnable
                public final void run() {
                    C28905e.this.m144376z(str3, j11, str, i11, i12, str2, i13);
                }
            });
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: t */
    public void m144398t(String str, int i11, int i12, String str2, int i13, long j11, String str3) {
        try {
            if (!m144375y(i11, str2, i12, j11)) {
                C29568a c29568a = new C29568a(j11 + "", str, i11, i12, str2, i13, j11, str3);
                if (i11 == 40) {
                    String m144374o = m144374o(i11, i12, str2);
                    f133815o.put(m144374o, m144374o);
                }
                if (i11 == 50) {
                    f133816p.add(c29568a);
                } else {
                    synchronized (f133813m) {
                        try {
                            try {
                                f133813m.add(0, c29568a);
                            } catch (Throwable th2) {
                                th = th2;
                                while (true) {
                                    try {
                                        break;
                                    } catch (Throwable th3) {
                                        th = th3;
                                    }
                                }
                                throw th;
                            }
                        } catch (Exception e11) {
                            e = e11;
                            e.printStackTrace();
                            return;
                        }
                    }
                    if (f133813m.size() > 50) {
                        m144389h();
                    }
                    m144382K(c29568a);
                }
            }
        } catch (Exception e12) {
            e = e12;
        }
    }

    /* renamed from: u */
    public void m144399u(String str, int i11, int i12, int i13, long j11, String str2) {
        try {
            String str3 = "";
            if (!TextUtils.isEmpty(str2)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("distid", str2);
                str3 = jSONObject.toString();
            }
            m144398t(str, i11, i12, str, i13, j11, str3);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: v */
    public void m144400v(String str, int i11, int i12, int i13, String str2) {
        m144398t(str, i11, i12, str, i13, System.currentTimeMillis(), str2);
    }

    /* renamed from: w */
    public void m144401w(String str, int i11, long j11) {
        m144398t(str, i11, 70, str, -1, j11, "");
    }

    /* renamed from: x */
    public void m144402x(String str, int i11, int i12, long j11, String str2) {
        try {
            String str3 = "";
            if (!TextUtils.isEmpty(str2)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("distid", str2);
                str3 = jSONObject.toString();
            }
            m144398t(str, i11, i12, str, -1, j11, str3);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
