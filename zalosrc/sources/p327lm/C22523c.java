package p327lm;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jh0.AbstractC21254a;
import org.json.JSONObject;
import p327lm.C22521a;

/* renamed from: lm.c */
/* loaded from: classes.dex */
public class C22523c implements Handler.Callback {

    /* renamed from: z */
    private static C22523c f110236z = new C22523c();

    /* renamed from: p */
    private C22522b f110237p;

    /* renamed from: q */
    private Context f110238q;

    /* renamed from: r */
    private HandlerThread f110239r;

    /* renamed from: s */
    private Handler f110240s;

    /* renamed from: t */
    public boolean f110241t;

    /* renamed from: u */
    private boolean f110242u;

    /* renamed from: v */
    private boolean f110243v;

    /* renamed from: x */
    private String f110245x;

    /* renamed from: w */
    private List f110244w = new ArrayList();

    /* renamed from: y */
    C22521a f110246y = new C22521a();

    /* renamed from: lm.c$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        void mo99243a(String str);
    }

    C22523c() {
    }

    /* renamed from: a */
    private void m116495a(String str) {
        synchronized (this) {
            List list = this.f110244w;
            if (list != null && list.size() != 0) {
                ArrayList arrayList = new ArrayList(this.f110244w);
                this.f110244w.clear();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((a) it.next()).mo99243a(str);
                }
            }
        }
    }

    /* renamed from: b */
    private void m116496b() {
        synchronized (this) {
            if (!this.f110242u && !m116500m()) {
                this.f110242u = true;
                this.f110246y.f110222b = this.f110237p.m116487j();
                this.f110246y.f110223c = this.f110237p.m116486i();
                try {
                    C22521a.a m116472a = this.f110246y.m116472a(this.f110238q, this.f110237p.m116483f());
                    this.f110237p.m116493s(m116472a.f110226a, m116472a.f110227b);
                    String str = m116472a.f110226a;
                    if (str == null) {
                        str = "";
                    }
                    m116495a(str);
                } catch (Exception unused) {
                }
                synchronized (this) {
                    this.f110242u = false;
                }
            }
        }
    }

    /* renamed from: c */
    private void m116497c() {
        String m116486i = this.f110237p.m116486i();
        String m116485h = this.f110237p.m116485h();
        if (!TextUtils.isEmpty(m116486i) && !TextUtils.isEmpty(m116485h)) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f110243v) {
                    return;
                }
                this.f110243v = true;
                try {
                    this.f110246y.f110222b = this.f110237p.m116487j();
                    C22521a.b m116474c = this.f110246y.m116474c(this.f110238q);
                    this.f110237p.m116494t(m116474c.f110228a, m116474c.f110229b);
                } catch (Exception e11) {
                    AbstractC21254a.m110061c(e11);
                }
                synchronized (this) {
                    this.f110243v = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: g */
    public static C22523c m116498g() {
        return f110236z;
    }

    /* renamed from: k */
    private boolean m116499k() {
        C22522b c22522b;
        String m116483f;
        if (!this.f110241t || (c22522b = this.f110237p) == null || (m116483f = c22522b.m116483f()) == null || m116483f.equals("")) {
            return false;
        }
        return true;
    }

    /* renamed from: m */
    private boolean m116500m() {
        C22522b c22522b;
        if (!this.f110241t || (c22522b = this.f110237p) == null) {
            return false;
        }
        String m116483f = c22522b.m116483f();
        if (this.f110237p.m116484g() <= System.currentTimeMillis() || m116483f == null || m116483f.equals("")) {
            return false;
        }
        return true;
    }

    /* renamed from: n */
    private void m116501n() {
        this.f110237p.m116491n();
        if (m116500m()) {
            m116495a(this.f110237p.m116483f());
        } else {
            m116496b();
        }
    }

    /* renamed from: q */
    private synchronized void m116502q(int i11) {
        try {
            if (this.f110240s == null) {
                HandlerThread handlerThread = new HandlerThread("zdt-device-tracker", 5);
                this.f110239r = handlerThread;
                handlerThread.start();
                this.f110240s = new Handler(this.f110239r.getLooper(), this);
            }
            Message obtainMessage = this.f110240s.obtainMessage(i11);
            if (obtainMessage != null) {
                this.f110240s.sendMessage(obtainMessage);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: d */
    public String m116503d() {
        if (!this.f110241t) {
            return null;
        }
        if (!m116500m()) {
            m116502q(16385);
        }
        return this.f110237p.m116483f();
    }

    /* renamed from: e */
    public void m116504e(a aVar) {
        if (m116499k()) {
            if (aVar != null) {
                aVar.mo99243a(this.f110237p.m116483f());
            }
            if (!m116500m()) {
                m116502q(16385);
                return;
            }
            return;
        }
        if (aVar != null) {
            synchronized (this) {
                this.f110244w.add(aVar);
            }
        }
        if (this.f110241t) {
            m116502q(16385);
        }
    }

    /* renamed from: f */
    public long m116505f() {
        if (!this.f110241t) {
            return 0L;
        }
        return this.f110237p.m116484g();
    }

    /* renamed from: h */
    public String m116506h() {
        if (!this.f110241t) {
            return null;
        }
        String m116485h = this.f110237p.m116485h();
        if (!TextUtils.isEmpty(m116485h)) {
            return m116485h;
        }
        m116502q(16386);
        return null;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        switch (message.what) {
            case 16384:
                m116501n();
                this.f110237p.m116492o();
                m116497c();
                return true;
            case 16385:
                m116496b();
                return true;
            case 16386:
                m116497c();
                return true;
            default:
                return false;
        }
    }

    /* renamed from: i */
    public String m116507i() {
        if (!this.f110241t) {
            return null;
        }
        return this.f110237p.m116486i();
    }

    /* renamed from: j */
    public String m116508j() {
        return "4.24.0301";
    }

    /* renamed from: l */
    public synchronized void m116509l(Context context, C22522b c22522b, String str) {
        if (this.f110241t) {
            return;
        }
        this.f110237p = c22522b;
        this.f110238q = context;
        this.f110245x = str;
        C22521a c22521a = this.f110246y;
        c22521a.f110221a = str;
        c22521a.f110224d = c22522b.m116490m();
        this.f110241t = true;
        m116502q(16384);
    }

    /* renamed from: o */
    public JSONObject m116510o() {
        return this.f110246y.m116475d(this.f110238q);
    }

    /* renamed from: p */
    public JSONObject m116511p() {
        return this.f110246y.m116477f(this.f110238q, this.f110237p.m116483f(), System.currentTimeMillis());
    }
}
