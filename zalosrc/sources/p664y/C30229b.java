package p664y;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import p532u.C26912b;
import p532u.InterfaceC26911a;
import p562v.AbstractC27389b;
import p562v.AbstractC27391d;
import p562v.AbstractC27393f;
import p664y.C30230c;

/* renamed from: y.b */
/* loaded from: classes2.dex */
public class C30229b implements InterfaceC26911a.a {

    /* renamed from: g */
    private static C30229b f140407g = new C30229b();

    /* renamed from: h */
    private static Handler f140408h = new Handler(Looper.getMainLooper());

    /* renamed from: i */
    private static Handler f140409i = null;

    /* renamed from: j */
    private static final Runnable f140410j = new b();

    /* renamed from: k */
    private static final Runnable f140411k = new c();

    /* renamed from: b */
    private int f140413b;

    /* renamed from: f */
    private long f140417f;

    /* renamed from: a */
    private List f140412a = new ArrayList();

    /* renamed from: d */
    private C30230c f140415d = new C30230c();

    /* renamed from: c */
    private C26912b f140414c = new C26912b();

    /* renamed from: e */
    private C30237j f140416e = new C30237j(new C30233f());

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y.b$a */
    /* loaded from: classes2.dex */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C30229b.this.f140416e.m149095d();
        }
    }

    /* renamed from: y.b$b */
    /* loaded from: classes2.dex */
    static class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C30229b.m149055p().m149056q();
        }
    }

    /* renamed from: y.b$c */
    /* loaded from: classes2.dex */
    static class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C30229b.f140409i != null) {
                C30229b.f140409i.post(C30229b.f140410j);
                C30229b.f140409i.postDelayed(C30229b.f140411k, 200L);
            }
        }
    }

    C30229b() {
    }

    /* renamed from: d */
    private void m149046d(long j11) {
        if (this.f140412a.size() > 0) {
            Iterator it = this.f140412a.iterator();
            if (it.hasNext()) {
                AbstractC30228a.m149044a(it.next());
                TimeUnit.NANOSECONDS.toMillis(j11);
                throw null;
            }
        }
    }

    /* renamed from: e */
    private void m149047e(View view, InterfaceC26911a interfaceC26911a, JSONObject jSONObject, EnumC30238k enumC30238k) {
        interfaceC26911a.mo138717a(view, jSONObject, this, enumC30238k == EnumC30238k.PARENT_VIEW);
    }

    /* renamed from: f */
    private void m149048f(String str, View view, JSONObject jSONObject) {
        InterfaceC26911a m138721b = this.f140414c.m138721b();
        String m149069b = this.f140415d.m149069b(str);
        if (m149069b != null) {
            JSONObject mo138718b = m138721b.mo138718b(view);
            AbstractC27389b.m140320e(mo138718b, str);
            AbstractC27389b.m140326k(mo138718b, m149069b);
            AbstractC27389b.m140322g(jSONObject, mo138718b);
        }
    }

    /* renamed from: g */
    private boolean m149049g(View view, JSONObject jSONObject) {
        String m149068a = this.f140415d.m149068a(view);
        if (m149068a == null) {
            return false;
        }
        AbstractC27389b.m140320e(jSONObject, m149068a);
        this.f140415d.m149077m();
        return true;
    }

    /* renamed from: i */
    private void m149050i(View view, JSONObject jSONObject) {
        C30230c.a m149073h = this.f140415d.m149073h(view);
        if (m149073h != null) {
            AbstractC27389b.m140323h(jSONObject, m149073h);
        }
    }

    /* renamed from: p */
    public static C30229b m149055p() {
        return f140407g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public void m149056q() {
        m149057r();
        m149064l();
        m149058s();
    }

    /* renamed from: r */
    private void m149057r() {
        this.f140413b = 0;
        this.f140417f = AbstractC27391d.m140334a();
    }

    /* renamed from: s */
    private void m149058s() {
        m149046d(AbstractC27391d.m140334a() - this.f140417f);
    }

    /* renamed from: t */
    private void m149059t() {
        if (f140409i == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f140409i = handler;
            handler.post(f140410j);
            f140409i.postDelayed(f140411k, 200L);
        }
    }

    /* renamed from: u */
    private void m149060u() {
        Handler handler = f140409i;
        if (handler != null) {
            handler.removeCallbacks(f140411k);
            f140409i = null;
        }
    }

    @Override // p532u.InterfaceC26911a.a
    /* renamed from: a */
    public void mo138719a(View view, InterfaceC26911a interfaceC26911a, JSONObject jSONObject) {
        EnumC30238k m149074i;
        if (AbstractC27393f.m140351d(view) && (m149074i = this.f140415d.m149074i(view)) != EnumC30238k.UNDERLYING_VIEW) {
            JSONObject mo138718b = interfaceC26911a.mo138718b(view);
            AbstractC27389b.m140322g(jSONObject, mo138718b);
            if (!m149049g(view, mo138718b)) {
                m149050i(view, mo138718b);
                m149047e(view, interfaceC26911a, mo138718b, m149074i);
            }
            this.f140413b++;
        }
    }

    /* renamed from: c */
    public void m149061c() {
        m149059t();
    }

    /* renamed from: h */
    public void m149062h() {
        m149063k();
        this.f140412a.clear();
        f140408h.post(new a());
    }

    /* renamed from: k */
    public void m149063k() {
        m149060u();
    }

    /* renamed from: l */
    void m149064l() {
        this.f140415d.m149075j();
        long m140334a = AbstractC27391d.m140334a();
        InterfaceC26911a m138720a = this.f140414c.m138720a();
        if (this.f140415d.m149072g().size() > 0) {
            Iterator it = this.f140415d.m149072g().iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                JSONObject mo138718b = m138720a.mo138718b(null);
                m149048f(str, this.f140415d.m149071f(str), mo138718b);
                AbstractC27389b.m140319d(mo138718b);
                HashSet hashSet = new HashSet();
                hashSet.add(str);
                this.f140416e.m149096e(mo138718b, hashSet, m140334a);
            }
        }
        if (this.f140415d.m149070c().size() > 0) {
            JSONObject mo138718b2 = m138720a.mo138718b(null);
            m149047e(null, m138720a, mo138718b2, EnumC30238k.PARENT_VIEW);
            AbstractC27389b.m140319d(mo138718b2);
            this.f140416e.m149094c(mo138718b2, this.f140415d.m149070c(), m140334a);
        } else {
            this.f140416e.m149095d();
        }
        this.f140415d.m149076l();
    }
}
