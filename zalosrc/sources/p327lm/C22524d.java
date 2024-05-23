package p327lm;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import hh0.AbstractC20066d;
import hh0.C20063a;
import ih0.C20557a;
import ih0.C20558b;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import jh0.AbstractC21254a;
import kh0.C21726b;
import mm.InterfaceC23345a;
import om.C24309b;
import org.json.JSONArray;
import org.json.JSONObject;
import p327lm.C22523c;
import p366nm.C23881a;

/* renamed from: lm.d */
/* loaded from: classes.dex */
public class C22524d implements InterfaceC23345a, Handler.Callback {

    /* renamed from: E */
    public static int f110247E = 1000;

    /* renamed from: F */
    public static long f110248F = 120000;

    /* renamed from: G */
    public static long f110249G = 60000;

    /* renamed from: A */
    private boolean f110250A;

    /* renamed from: C */
    Context f110252C;

    /* renamed from: D */
    String f110253D;

    /* renamed from: p */
    private C22523c f110254p;

    /* renamed from: q */
    private C22522b f110255q;

    /* renamed from: r */
    private C24309b f110256r;

    /* renamed from: w */
    private HandlerThread f110261w;

    /* renamed from: x */
    private Handler f110262x;

    /* renamed from: y */
    private Timer f110263y;

    /* renamed from: z */
    private Timer f110264z;

    /* renamed from: s */
    private int f110257s = 1000;

    /* renamed from: t */
    private long f110258t = 120000;

    /* renamed from: u */
    private long f110259u = 60000;

    /* renamed from: v */
    private long f110260v = 100;

    /* renamed from: B */
    private C20557a f110251B = new C20557a();

    /* renamed from: lm.d$a */
    /* loaded from: classes.dex */
    public class a extends TimerTask {
        a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            C22524d.this.mo116524c();
        }
    }

    /* renamed from: lm.d$b */
    /* loaded from: classes.dex */
    public class b extends TimerTask {
        b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            C22524d.this.m116528q();
        }
    }

    /* renamed from: lm.d$c */
    /* loaded from: classes3.dex */
    class c implements C22523c.a {
        c() {
        }

        @Override // p327lm.C22523c.a
        /* renamed from: a */
        public void mo99243a(String str) {
            C22524d.this.m116527i(str);
        }
    }

    /* renamed from: lm.d$d */
    /* loaded from: classes3.dex */
    public class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C22524d.this.mo116524c();
        }
    }

    public C22524d(Context context, C22522b c22522b, C24309b c24309b, C22523c c22523c, String str) {
        HandlerThread handlerThread = new HandlerThread("zdt-event-tracker", 1);
        this.f110261w = handlerThread;
        handlerThread.start();
        this.f110262x = new Handler(this.f110261w.getLooper(), this);
        this.f110252C = context;
        this.f110255q = c22522b;
        this.f110256r = c24309b;
        this.f110254p = c22523c;
        this.f110253D = str;
        Message message = new Message();
        message.what = 20484;
        this.f110262x.sendMessage(message);
        if (this.f110258t > 0) {
            m116520o();
        }
        if (this.f110259u > 0) {
            m116521p();
        }
        AbstractC21254a.m110068j("start zdt-event-tracker thread");
    }

    /* renamed from: f */
    private void m116512f() {
        if (this.f110263y != null) {
            AbstractC21254a.m110068j("cancel dispatch timer");
            this.f110263y.cancel();
            this.f110263y = null;
        }
    }

    /* renamed from: g */
    private synchronized void m116513g() {
        if (this.f110264z != null) {
            AbstractC21254a.m110068j("cancel store events timer");
            this.f110264z.cancel();
            this.f110264z = null;
        }
    }

    /* renamed from: h */
    private C23881a m116514h(String str, String str2, long j11, Map map) {
        if (map == null) {
            map = new HashMap();
        }
        if (str2 != null && !map.containsKey("name")) {
            map.put("name", str2);
        }
        return new C23881a(str, j11, AbstractC20066d.m104300s(map));
    }

    /* renamed from: j */
    private void m116515j() {
        if (!this.f110250A) {
            return;
        }
        this.f110256r.m126952k();
    }

    /* renamed from: k */
    private void m116516k() {
        if (!this.f110250A) {
            return;
        }
        List m126949h = this.f110256r.m126949h();
        if (m126949h.size() > this.f110257s) {
            AbstractC21254a.m110070l("ZDK", "exceed max number of events %d > %d", Integer.valueOf(m126949h.size()), Integer.valueOf(this.f110257s));
            for (C23881a c23881a : (C23881a[]) m126949h.subList(0, m126949h.size() - this.f110257s).toArray(new C23881a[0])) {
                this.f110256r.m126951j(c23881a);
            }
        }
    }

    /* renamed from: l */
    private void m116517l() {
        this.f110256r.m126950i();
        this.f110250A = true;
    }

    /* renamed from: m */
    private JSONObject m116518m() {
        JSONObject jSONObject = new JSONObject();
        Object m116511p = this.f110254p.m116511p();
        JSONArray jSONArray = new JSONArray();
        try {
            for (C23881a c23881a : this.f110256r.m126949h()) {
                JSONObject jSONObject2 = new JSONObject();
                JSONObject m124942b = c23881a.m124942b();
                if (m124942b.has("name")) {
                    jSONObject2.put("name", m124942b.get("name"));
                }
                jSONObject2.put("extras", m124942b);
                jSONObject2.put("act", c23881a.m124941a());
                jSONObject2.put("ts", c23881a.m124943c());
                jSONArray.put(jSONObject2);
            }
            jSONObject.put("evt", jSONArray);
            jSONObject.put("dat", m116511p);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return jSONObject;
    }

    /* renamed from: n */
    private void m116519n(C23881a c23881a) {
        if (!this.f110250A) {
            return;
        }
        this.f110256r.m126947f(c23881a);
        m116516k();
        if (this.f110256r.m126949h() != null && r5.size() >= this.f110260v) {
            new Thread(new d()).start();
        }
    }

    /* renamed from: o */
    private void m116520o() {
        AbstractC21254a.m110068j("schedule dispatch timer");
        m116512f();
        try {
            Timer timer = new Timer();
            this.f110263y = timer;
            a aVar = new a();
            long j11 = this.f110258t;
            timer.scheduleAtFixedRate(aVar, j11, j11);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: p */
    private void m116521p() {
        AbstractC21254a.m110068j("schedule store events timer");
        m116513g();
        try {
            Timer timer = new Timer();
            this.f110264z = timer;
            b bVar = new b();
            long j11 = this.f110259u;
            timer.scheduleAtFixedRate(bVar, j11, j11);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // mm.InterfaceC23345a
    /* renamed from: a */
    public void mo116522a(long j11) {
        if (j11 == this.f110259u) {
            return;
        }
        synchronized (this) {
            try {
                if (j11 <= 0) {
                    m116513g();
                    return;
                }
                if (j11 < 10000) {
                    j11 = 10000;
                }
                this.f110259u = j11;
                m116521p();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // mm.InterfaceC23345a
    /* renamed from: b */
    public void mo116523b(int i11) {
        this.f110257s = i11;
    }

    @Override // mm.InterfaceC23345a
    /* renamed from: c */
    public void mo116524c() {
        try {
            Message message = new Message();
            message.what = 20480;
            this.f110262x.sendMessage(message);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // mm.InterfaceC23345a
    /* renamed from: d */
    public void mo116525d(long j11) {
        if (j11 == this.f110258t) {
            return;
        }
        if (j11 <= 0 && this.f110263y != null) {
            m116512f();
            return;
        }
        if (j11 < 10000) {
            j11 = 10000;
        }
        this.f110258t = j11;
        m116520o();
    }

    @Override // mm.InterfaceC23345a
    /* renamed from: e */
    public void mo116526e(String str, Map map) {
        C23881a m116514h = m116514h(str, null, System.currentTimeMillis(), map);
        Message message = new Message();
        message.what = 20481;
        message.obj = m116514h;
        this.f110262x.sendMessage(message);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        AbstractC21254a.m110060b("EventTracker - handleMessage()", "EventTracker");
        switch (message.what) {
            case 20480:
                this.f110254p.m116504e(new c());
                return true;
            case 20481:
                m116519n((C23881a) message.obj);
                return true;
            case 20482:
                m116515j();
                return true;
            case 20483:
            default:
                return false;
            case 20484:
                m116517l();
                return true;
        }
    }

    /* renamed from: i */
    public void m116527i(String str) {
        C22524d c22524d;
        String str2;
        C20558b m106847a;
        try {
            C24309b c24309b = this.f110256r;
            if (c24309b != null) {
                if (c24309b.m126949h().size() != 0) {
                }
                AbstractC21254a.m110059a("EVENT_TRACKER: No events to dispatch");
            }
            if (this.f110250A) {
                JSONArray jSONArray = new JSONArray();
                JSONObject m116518m = m116518m();
                this.f110254p.m116507i();
                this.f110254p.m116506h();
                if (str == null) {
                    str2 = "";
                } else {
                    str2 = str;
                }
                String m104234c = C20063a.m104234c(this.f110252C);
                String m104248q = C20063a.m104248q(this.f110252C);
                String str3 = this.f110253D;
                String m116487j = this.f110255q.m116487j();
                if (m116487j == null) {
                    m116487j = "";
                }
                String str4 = str2;
                String str5 = "" + new Date().getTime();
                String jSONObject = m116518m.toString();
                String jSONArray2 = jSONArray.toString();
                try {
                    String[] strArr = {"pl", "appId", "viewer", "data", "apps", "ts", "zdId", "an", "av", "et", "gzip", "socialAcc", "packageName"};
                    String[] strArr2 = {"android", str3, m116487j, jSONObject, jSONArray2, str5, str4, m104234c, m104248q, "0", "0", "[]", this.f110252C.getPackageName()};
                    String m112136h = C21726b.m112130b().m112136h("centralized_http_s", "/monitor/android");
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(m112136h);
                    sb2.append("?packageName=");
                    try {
                        sb2.append(this.f110252C.getPackageName());
                        m106847a = this.f110251B.m106847a(C20558b.a.POST, sb2.toString());
                        String m104295n = AbstractC20066d.m104295n(strArr, strArr2, "@#centralize#@");
                        m106847a.m106850b("pl", "android");
                        m106847a.m106850b("appId", str3);
                        m106847a.m106850b("viewer", m116487j);
                        m106847a.m106850b("zdId", str4);
                        m106847a.m106850b("data", jSONObject);
                        m106847a.m106850b("apps", jSONArray2);
                        m106847a.m106850b("ts", str5);
                        m106847a.m106850b("sig", m104295n);
                        m106847a.m106850b("an", m104234c);
                        m106847a.m106850b("av", m104248q);
                        m106847a.m106850b("gzip", "0");
                        m106847a.m106850b("et", "0");
                        m106847a.m106850b("socialAcc", "[]");
                        c22524d = this;
                    } catch (Exception e11) {
                        e = e11;
                        c22524d = this;
                    }
                    try {
                        m106847a.m106850b("packageName", c22524d.f110252C.getPackageName());
                        JSONObject m106851c = m106847a.m106851c();
                        int i11 = m106847a.f100930a;
                        if (i11 >= 400 && i11 <= 599) {
                            c22524d.f110256r.m126948g();
                        } else if (m106851c != null && m106851c.getInt(ZMediaPlayer.OnNativeInvokeListener.ARG_ERROR) == 0) {
                            c22524d.f110256r.m126948g();
                        }
                        return;
                    } catch (Exception e12) {
                        e = e12;
                        e.printStackTrace();
                        c22524d.f110256r.m126948g();
                        return;
                    }
                } catch (Exception e13) {
                    e = e13;
                    c22524d = this;
                }
            }
            AbstractC21254a.m110059a("EVENT_TRACKER: No events to dispatch");
        } catch (Exception e14) {
            e = e14;
            c22524d = this;
        }
    }

    /* renamed from: q */
    public void m116528q() {
        try {
            synchronized (this) {
                Message message = new Message();
                message.what = 20482;
                this.f110262x.sendMessage(message);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
