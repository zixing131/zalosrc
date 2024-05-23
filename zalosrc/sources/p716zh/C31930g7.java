package p716zh;

import ae.C0766k;
import ag0.C0824j;
import am.AbstractC0906d0;
import am.AbstractC0939u;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.zing.zalo.MainApplication;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.utils.phonenumbers.C16741a;
import com.zing.zalocore.CoreUtility;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import me0.AbstractC23056e6;
import org.json.JSONObject;
import p142ey.C18644n;
import p304ks.AbstractC21935u;
import p348mi.AbstractC23309i;
import p361nb.AbstractC23647d;
import p364nj.C23800a;
import p716zh.C31930g7;
import vg.C28023b6;

/* renamed from: zh.g7 */
/* loaded from: classes3.dex */
public class C31930g7 {

    /* renamed from: g */
    static volatile C31930g7 f146687g;

    /* renamed from: d */
    d f146691d;

    /* renamed from: f */
    Map f146693f;

    /* renamed from: b */
    long f146689b = 1800000;

    /* renamed from: c */
    int f146690c = 1;

    /* renamed from: e */
    final Object f146692e = new Object();

    /* renamed from: a */
    Map f146688a = Collections.synchronizedMap(new ConcurrentHashMap());

    /* renamed from: zh.g7$a */
    /* loaded from: classes3.dex */
    public class a extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ String f146694a;

        /* renamed from: b */
        final /* synthetic */ long f146695b;

        a(String str, long j11) {
            this.f146694a = str;
            this.f146695b = j11;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            try {
                C7960e.m41971c6().m42142H7(new C23800a(this.f146694a, 0, this.f146695b));
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: zh.g7$b */
    /* loaded from: classes3.dex */
    public class b extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ String f146697a;

        b(String str) {
            this.f146697a = str;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            try {
                C7960e.m41971c6().m42103E3(this.f146697a);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: zh.g7$c */
    /* loaded from: classes3.dex */
    public class c implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ String f146699a;

        c(String str) {
            this.f146699a = str;
        }

        /* renamed from: d */
        public /* synthetic */ void m153428d(String str, ContactProfile contactProfile) {
            try {
                C31930g7.this.m153417k(1, "Get contact profile successfully from server: " + str);
                C31930g7.this.m153415h(contactProfile, str);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                C31930g7.this.m153417k(2, "Search phone number: " + this.f146699a + " get error");
                C31930g7.this.m153417k(2, "Error message: " + c20096c.m104492d());
                C31930g7.this.m153417k(2, "Error code: " + c20096c.m104491c());
                C31930g7.this.f146693f.remove(this.f146699a);
                if (c20096c.m104491c() != 50001 && c20096c.m104491c() != 1001) {
                    C31930g7.this.m153420n(this.f146699a);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            JSONObject jSONObject;
            try {
                C31930g7.this.f146693f.remove(this.f146699a);
                if (obj != null) {
                    JSONObject jSONObject2 = (JSONObject) obj;
                    if (jSONObject2.isNull("data")) {
                        jSONObject = null;
                    } else {
                        jSONObject = new JSONObject(jSONObject2.getString("data"));
                    }
                    if (jSONObject != null) {
                        ContactProfile contactProfile = new ContactProfile(jSONObject);
                        if (C31930g7.this.m153416i(contactProfile)) {
                            C31930g7.this.f146691d.f146701p.post(new Runnable() { // from class: zh.h7

                                /* renamed from: q */
                                public final /* synthetic */ String f146801q;

                                /* renamed from: r */
                                public final /* synthetic */ ContactProfile f146802r;

                                public /* synthetic */ RunnableC31945h7(String str, ContactProfile contactProfile2) {
                                    r2 = str;
                                    r3 = contactProfile2;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    C31930g7.c.this.m153428d(r2, r3);
                                }
                            });
                        } else {
                            C31930g7.this.m153420n(this.f146699a);
                        }
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: zh.g7$d */
    /* loaded from: classes3.dex */
    public static class d extends HandlerThread {

        /* renamed from: p */
        Handler f146701p;

        /* renamed from: zh.g7$d$a */
        /* loaded from: classes3.dex */
        class a extends Handler {
            a(Looper looper) {
                super(looper);
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
            }
        }

        public d(String str) {
            super(str);
        }

        @Override // android.os.HandlerThread
        protected void onLooperPrepared() {
            this.f146701p = new a(getLooper());
        }
    }

    private C31930g7() {
        d dVar = new d("RetryMissCall");
        this.f146691d = dVar;
        dVar.start();
        this.f146693f = Collections.synchronizedMap(new ConcurrentHashMap());
    }

    /* renamed from: g */
    public static synchronized C31930g7 m153408g() {
        C31930g7 c31930g7;
        synchronized (C31930g7.class) {
            try {
                if (f146687g == null) {
                    synchronized (C31930g7.class) {
                        try {
                            if (f146687g == null) {
                                f146687g = new C31930g7();
                            }
                        } finally {
                        }
                    }
                }
                c31930g7 = f146687g;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c31930g7;
    }

    /* renamed from: j */
    public /* synthetic */ void m153409j(Map.Entry entry) {
        try {
            m153417k(1, "Main queue check contact profile: " + ((String) entry.getKey()));
            if (this.f146688a.containsKey(entry.getKey())) {
                m153411c((String) entry.getKey());
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: b */
    public void m153410b(String str, long j11) {
        try {
            if (!AbstractC23309i.m120863Df()) {
                return;
            }
            if (!C16741a.m89329r().m89337H(C16741a.m89329r().m89345W(str, AbstractC23309i.m121704a5()))) {
                return;
            }
            m153417k(1, "Add miss call info to queue");
            synchronized (this.f146692e) {
                try {
                    m153426t(str, j11);
                    while (this.f146688a.size() > this.f146690c && this.f146688a.size() != 0) {
                        String m153413e = m153413e();
                        if (TextUtils.isEmpty(m153413e)) {
                            break;
                        }
                        this.f146688a.remove(m153413e);
                        m153421o(m153413e);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: c */
    public void m153411c(String str) {
        try {
            if (!AbstractC23309i.m120863Df() || TextUtils.isEmpty(str)) {
                return;
            }
            ContactProfile m153414f = m153414f(str);
            if (m153414f != null && m153416i(m153414f)) {
                m153417k(1, "Get contact profile successfully from local: " + str);
                m153415h(m153414f, str);
            } else {
                m153422p(str);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: d */
    public void m153412d() {
        try {
            if (!AbstractC23309i.m120863Df()) {
                return;
            }
            m153417k(1, "Check queue show notification");
            Map map = this.f146688a;
            if (map != null && map.size() > 0) {
                m153419m();
                synchronized (this.f146692e) {
                    try {
                        if (this.f146688a.size() <= 0) {
                            return;
                        }
                        Iterator it = this.f146688a.entrySet().iterator();
                        long j11 = 3000;
                        while (it.hasNext()) {
                            this.f146691d.f146701p.postDelayed(new Runnable() { // from class: zh.f7

                                /* renamed from: q */
                                public final /* synthetic */ Map.Entry f146627q;

                                public /* synthetic */ RunnableC31915f7(Map.Entry entry) {
                                    r2 = entry;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    C31930g7.this.m153409j(r2);
                                }
                            }, j11);
                            j11 += 12000;
                        }
                    } finally {
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: e */
    public String m153413e() {
        try {
            Map map = this.f146688a;
            if (map == null || map.size() <= 0) {
                return "";
            }
            String str = "";
            long j11 = 0;
            for (Map.Entry entry : this.f146688a.entrySet()) {
                if (j11 == 0) {
                    j11 = ((Long) entry.getValue()).longValue();
                    str = (String) entry.getKey();
                } else if (((Long) entry.getValue()).longValue() < j11) {
                    j11 = ((Long) entry.getValue()).longValue();
                    str = (String) entry.getKey();
                }
            }
            return str;
        } catch (Exception e11) {
            e11.printStackTrace();
            return "";
        }
    }

    /* renamed from: f */
    public ContactProfile m153414f(String str) {
        try {
            m153417k(1, "Get contact profile local: " + str);
            C31901e8 m2800f = AbstractC0906d0.m2800f(MainApplication.getAppContext(), AbstractC23056e6.m118285k(str));
            if (m2800f == null) {
                return null;
            }
            return C18644n.m98531l().m98552o("" + m2800f.m153300r());
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    /* renamed from: h */
    public void m153415h(ContactProfile contactProfile, String str) {
        try {
            synchronized (this.f146692e) {
                try {
                    if (this.f146688a.containsKey(str)) {
                        m153423q(contactProfile, str, ((Long) this.f146688a.get(str)).longValue());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            m153420n(str);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: i */
    boolean m153416i(ContactProfile contactProfile) {
        if (contactProfile == null) {
            return false;
        }
        try {
            if (CoreUtility.f89233i.equals(contactProfile.f42434r)) {
                return false;
            }
            if (AbstractC21935u.m114550q(contactProfile.f42434r)) {
                return false;
            }
            return true;
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    /* renamed from: k */
    void m153417k(int i11, String str) {
    }

    /* renamed from: l */
    public void m153418l() {
        try {
            m153417k(1, "Reload data");
            List<C23800a> m42272T4 = C7960e.m41971c6().m42272T4();
            if (m42272T4 != null && m42272T4.size() > 0) {
                m153417k(1, "Miss call info list db size: " + m42272T4.size());
                synchronized (this.f146692e) {
                    try {
                        this.f146688a.clear();
                        this.f146693f.clear();
                        for (C23800a c23800a : m42272T4) {
                            if (c23800a != null && c23800a.f115032b == 0) {
                                this.f146688a.put(c23800a.f115031a, Long.valueOf(c23800a.f115033c));
                            }
                        }
                    } finally {
                    }
                }
                m153425s(AbstractC23309i.m120848D0());
                m153412d();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: m */
    public void m153419m() {
        try {
            synchronized (this.f146692e) {
                try {
                    Iterator it = this.f146688a.entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        if (System.currentTimeMillis() - ((Long) entry.getValue()).longValue() > this.f146689b) {
                            m153421o((String) entry.getKey());
                            it.remove();
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: n */
    public void m153420n(String str) {
        try {
            synchronized (this.f146692e) {
                this.f146688a.remove(str);
                m153421o(str);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: o */
    public void m153421o(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            C0824j.m2153b(new b(str));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: p */
    public void m153422p(String str) {
        try {
            if (!AbstractC23309i.m120863Df() || TextUtils.isEmpty(str) || this.f146693f.containsKey(str)) {
                return;
            }
            this.f146693f.put(str, str);
            String m121779c5 = AbstractC23309i.m121779c5();
            if (m121779c5 == null) {
                m121779c5 = AbstractC23309i.m121704a5();
            }
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new c(str));
            c0766k.mo1583Y9(str, m121779c5, 5);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: q */
    public void m153423q(ContactProfile contactProfile, String str, long j11) {
        try {
            if (!AbstractC23309i.m120863Df()) {
                return;
            }
            m153417k(1, "Show miss call notification");
            AbstractC23647d.m123906p("158000");
            C28023b6.m141250h0().m141366n2(contactProfile, j11, str);
            AbstractC23647d.m123893c();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: r */
    public void m153424r(String str) {
        try {
            if (AbstractC23309i.m120863Df() && !TextUtils.isEmpty(str)) {
                m153420n(str);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: s */
    public void m153425s(String str) {
        long j11;
        int i11;
        try {
            if (!TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject(str);
                if (!jSONObject.isNull("expire")) {
                    j11 = jSONObject.getLong("expire") * 1000;
                } else {
                    j11 = 1800000;
                }
                this.f146689b = j11;
                if (!jSONObject.isNull("max_item")) {
                    i11 = jSONObject.getInt("max_item");
                } else {
                    i11 = 1;
                }
                this.f146690c = i11;
                return;
            }
            this.f146689b = 1800000L;
            this.f146690c = 1;
        } catch (Exception e11) {
            e11.printStackTrace();
            this.f146689b = 1800000L;
            this.f146690c = 1;
        }
    }

    /* renamed from: t */
    public void m153426t(String str, long j11) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            this.f146688a.put(str, Long.valueOf(j11));
            C0824j.m2153b(new a(str, j11));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
