package me0;

import android.text.TextUtils;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalocore.CoreUtility;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import jf0.C21238a;
import jf0.C21242e;
import org.json.JSONException;
import org.json.JSONObject;
import p140ev.C18613b;
import p348mi.AbstractC23309i;

/* renamed from: me0.p6 */
/* loaded from: classes4.dex */
public class C23177p6 {

    /* renamed from: b */
    public static C23177p6 f112366b;

    /* renamed from: a */
    HashMap f112367a = new HashMap();

    /* renamed from: me0.p6$a */
    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a */
        public String f112368a;

        /* renamed from: d */
        public String f112371d;

        /* renamed from: e */
        public String f112372e;

        /* renamed from: f */
        public String f112373f;

        /* renamed from: g */
        public int f112374g;

        /* renamed from: h */
        public int f112375h;

        /* renamed from: m */
        boolean f112380m;

        /* renamed from: n */
        C18613b f112381n;

        /* renamed from: b */
        public long f112369b = 0;

        /* renamed from: c */
        public int f112370c = 0;

        /* renamed from: i */
        public long f112376i = 0;

        /* renamed from: j */
        public long f112377j = 0;

        /* renamed from: k */
        public long f112378k = 0;

        /* renamed from: l */
        public long f112379l = 0;

        public a(C18613b c18613b) {
            this.f112380m = false;
            C18613b.a aVar = C18613b.Companion;
            this.f112381n = c18613b;
            this.f112380m = m119400d(c18613b);
        }

        /* renamed from: a */
        void m119397a() {
            AbstractC23309i.m121876ep(CoreUtility.f89233i, this.f112381n.m98348a(), "");
            this.f112374g = 0;
            this.f112375h = 0;
            this.f112373f = "";
            this.f112371d = "";
            this.f112372e = "";
            this.f112368a = "";
            this.f112369b = 0L;
            this.f112370c = 0;
            this.f112380m = false;
        }

        /* renamed from: b */
        public boolean m119398b() {
            if (this.f112378k > 0 && this.f112379l > 0) {
                long currentTimeMillis = System.currentTimeMillis();
                long j11 = this.f112378k;
                long j12 = this.f112379l;
                if (j11 <= j12 && currentTimeMillis <= j12) {
                    if (j11 > currentTimeMillis) {
                        return false;
                    }
                } else {
                    m119397a();
                    return false;
                }
            }
            return this.f112380m;
        }

        /* renamed from: c */
        public boolean m119399c() {
            if (this.f112378k > 0 && this.f112379l > 0) {
                long currentTimeMillis = System.currentTimeMillis();
                long j11 = this.f112378k;
                long j12 = this.f112379l;
                if (j11 > j12 || currentTimeMillis > j12 || j11 > currentTimeMillis) {
                    return false;
                }
            }
            if (this.f112375h <= 0) {
                return false;
            }
            return true;
        }

        /* renamed from: d */
        boolean m119400d(C18613b c18613b) {
            String m121185M4 = AbstractC23309i.m121185M4(CoreUtility.f89233i, c18613b.m98348a());
            try {
                if (!TextUtils.isEmpty(m121185M4)) {
                    JSONObject jSONObject = new JSONObject(m121185M4);
                    C18613b c18613b2 = new C18613b(jSONObject.optInt("featureId"));
                    int optInt = jSONObject.optInt("reddotCounter", 0);
                    if (c18613b2.equals(c18613b)) {
                        long currentTimeMillis = System.currentTimeMillis();
                        int optInt2 = jSONObject.optInt("expiredTime");
                        long optLong = jSONObject.optLong("seenTime", 0L);
                        long j11 = (currentTimeMillis - optLong) / 3600000;
                        if (optInt2 != 0 && optLong != 0 && j11 >= optInt2) {
                            AbstractC23309i.m121876ep(CoreUtility.f89233i, c18613b.m98348a(), "");
                            return false;
                        }
                        this.f112376i = optInt2;
                        this.f112377j = optLong;
                        this.f112374g = optInt;
                        this.f112372e = jSONObject.optString("description", "");
                        this.f112373f = jSONObject.optString("icon", "");
                        if (jSONObject.has("actionnative")) {
                            JSONObject jSONObject2 = jSONObject.getJSONObject("actionnative");
                            if (jSONObject2.has("isNews")) {
                                this.f112370c = jSONObject2.optInt("isNews", 0);
                            }
                            if (jSONObject2.has("zappId")) {
                                this.f112369b = jSONObject2.optLong("zappId", 0L);
                            }
                            if (jSONObject2.has("item_id")) {
                                this.f112368a = jSONObject2.optString("item_id", "");
                            }
                        }
                        if (jSONObject.has("actionhtml")) {
                            this.f112371d = jSONObject.getJSONObject("actionhtml").optString(ZMediaPlayer.OnNativeInvokeListener.ARG_URL, "");
                        }
                        if (jSONObject.has("reddotActionBarCounter")) {
                            this.f112375h = jSONObject.optInt("reddotActionBarCounter", 0);
                        }
                        if (jSONObject.has("startedTime")) {
                            this.f112378k = jSONObject.optLong("startedTime", 0L);
                        }
                        if (jSONObject.has("endTime")) {
                            this.f112379l = jSONObject.optLong("endTime", 0L);
                            return true;
                        }
                        return true;
                    }
                    return false;
                }
                return false;
            } catch (Exception e11) {
                e11.printStackTrace();
                return false;
            }
        }

        /* renamed from: e */
        public void m119401e() {
            try {
                if (this.f112374g <= 0 && m119399c()) {
                    String m121185M4 = AbstractC23309i.m121185M4(CoreUtility.f89233i, this.f112381n.m98348a());
                    if (!TextUtils.isEmpty(m121185M4)) {
                        JSONObject jSONObject = new JSONObject(m121185M4);
                        if (jSONObject.has("reddotActionBarCounter")) {
                            jSONObject.put("reddotActionBarCounter", 0);
                            this.f112375h = 0;
                            AbstractC23309i.m121876ep(CoreUtility.f89233i, this.f112381n.m98348a(), jSONObject.toString());
                        }
                    }
                }
            } catch (JSONException e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: c */
    public static synchronized C23177p6 m119386c() {
        C23177p6 c23177p6;
        synchronized (C23177p6.class) {
            try {
                if (f112366b == null) {
                    f112366b = new C23177p6();
                }
                C21242e.m110039d();
                c23177p6 = f112366b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c23177p6;
    }

    /* renamed from: h */
    private void m119387h() {
        try {
            Iterator it = new HashMap(this.f112367a).keySet().iterator();
            while (it.hasNext()) {
                a aVar = (a) this.f112367a.get((Integer) it.next());
                if (aVar != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    long j11 = aVar.f112377j;
                    long j12 = (currentTimeMillis - j11) / 3600000;
                    if (j11 != 0) {
                        long j13 = aVar.f112376i;
                        if (j13 != 0 && j12 >= j13) {
                        }
                    }
                    aVar.m119401e();
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: k */
    public static void m119388k() {
        try {
            Iterator it = C21242e.m110039d().m110044e().iterator();
            while (it.hasNext()) {
                C18613b c18613b = new C18613b(((C21238a) it.next()).f103521b);
                String m121185M4 = AbstractC23309i.m121185M4(CoreUtility.f89233i, c18613b.m98348a());
                if (!TextUtils.isEmpty(m121185M4) && m119386c().m119391d(c18613b).m119398b()) {
                    JSONObject jSONObject = new JSONObject(m121185M4);
                    if (!jSONObject.has("seenTime")) {
                        jSONObject.put("seenTime", System.currentTimeMillis());
                        AbstractC23309i.m121876ep(CoreUtility.f89233i, c18613b.m98348a(), jSONObject.toString());
                        m119386c().m119394g(c18613b);
                    }
                }
            }
            m119386c().m119387h();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: a */
    void m119389a() {
        try {
            for (Integer num : new HashMap(this.f112367a).keySet()) {
                a aVar = (a) this.f112367a.get(num);
                if (aVar != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    long j11 = aVar.f112377j;
                    long j12 = (currentTimeMillis - j11) / 3600000;
                    if (j11 != 0) {
                        long j13 = aVar.f112376i;
                        if (j13 != 0 && j12 >= j13) {
                            this.f112367a.remove(num);
                            AbstractC23309i.m121876ep(CoreUtility.f89233i, num.intValue(), "");
                            AbstractC23181q.m119433f();
                        }
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: b */
    public void m119390b() {
        try {
            Iterator it = C21242e.m110039d().m110044e().iterator();
            while (it.hasNext()) {
                AbstractC23309i.m121876ep(CoreUtility.f89233i, ((C21238a) it.next()).f103521b, "");
            }
            this.f112367a.clear();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: d */
    public a m119391d(C18613b c18613b) {
        try {
            a aVar = (a) this.f112367a.get(Integer.valueOf(c18613b.m98348a()));
            if (!C21242e.m110039d().m110048i(c18613b)) {
                if (!TextUtils.isEmpty(AbstractC23309i.m121185M4(CoreUtility.f89233i, c18613b.m98348a()))) {
                    AbstractC23309i.m121876ep(CoreUtility.f89233i, c18613b.m98348a(), "");
                }
                if (aVar != null) {
                    m119396j(c18613b);
                }
                return null;
            }
            if (aVar == null) {
                aVar = new a(c18613b);
                if (aVar.m119398b() || aVar.m119399c()) {
                    this.f112367a.put(Integer.valueOf(c18613b.m98348a()), aVar);
                }
            }
            return aVar;
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    /* renamed from: e */
    public void m119392e(C18613b c18613b) {
        try {
            a m119391d = m119391d(c18613b);
            if (m119391d == null) {
                return;
            }
            m119391d.m119397a();
            m119396j(c18613b);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: f */
    public boolean m119393f() {
        try {
            m119389a();
            Iterator it = C21242e.m110039d().m110044e().iterator();
            while (it.hasNext()) {
                m119391d(new C18613b(((C21238a) it.next()).f103521b));
            }
            Iterator it2 = this.f112367a.keySet().iterator();
            while (it2.hasNext()) {
                if (((a) this.f112367a.get((Integer) it2.next())).m119398b()) {
                    return true;
                }
            }
            return false;
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    /* renamed from: g */
    public void m119394g(C18613b c18613b) {
        try {
            if (C21242e.m110039d().m110048i(c18613b)) {
                this.f112367a.remove(Integer.valueOf(c18613b.m98348a()));
                this.f112367a.put(Integer.valueOf(c18613b.m98348a()), new a(c18613b));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: i */
    public void m119395i(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m119391d(new C18613b(((C21238a) it.next()).f103521b));
        }
    }

    /* renamed from: j */
    void m119396j(C18613b c18613b) {
        this.f112367a.remove(Integer.valueOf(c18613b.m98348a()));
    }
}
