package vg;

import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Debug;
import android.os.Handler;
import android.os.HandlerThread;
import bp0.AbstractC3103o;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import ho0.AbstractC20110a;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CountDownLatch;
import kh.C21722b;
import kh.C21723c;
import kh.InterfaceC21724d;
import mx.C23476m;
import org.json.JSONObject;
import p006a0.C0015d;
import p247ix.AbstractC20879d;
import p348mi.AbstractC23309i;
import vg.AbstractC28248z6;

/* renamed from: vg.z6 */
/* loaded from: classes3.dex */
public abstract class AbstractC28248z6 {

    /* renamed from: a */
    Timer f131687a;

    /* renamed from: b */
    private LocationManager f131688b;

    /* renamed from: c */
    private C0015d f131689c;

    /* renamed from: d */
    private C0015d f131690d;

    /* renamed from: e */
    f f131691e;

    /* renamed from: o */
    protected Exception f131701o;

    /* renamed from: p */
    protected g f131702p;

    /* renamed from: q */
    protected int f131703q;

    /* renamed from: f */
    boolean f131692f = false;

    /* renamed from: g */
    boolean f131693g = false;

    /* renamed from: h */
    private InterfaceC21724d f131694h = null;

    /* renamed from: i */
    boolean f131695i = false;

    /* renamed from: j */
    protected long f131696j = 5000;

    /* renamed from: k */
    protected float f131697k = 0.0f;

    /* renamed from: l */
    protected long f131698l = 16;

    /* renamed from: m */
    protected long f131699m = 0;

    /* renamed from: n */
    protected boolean f131700n = false;

    /* renamed from: r */
    LocationListener f131704r = new a();

    /* renamed from: s */
    LocationListener f131705s = new b();

    /* renamed from: t */
    LocationListener f131706t = new c();

    /* renamed from: u */
    protected f f131707u = new d();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: vg.z6$a */
    /* loaded from: classes3.dex */
    public class a extends AbstractC28044d7 {
        a() {
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(Location location) {
            if (location != null && location.getAccuracy() <= 10000.0f) {
                C28157p5.m141667d().m141676k("GPS---RETURN---NEW---LOCATION:---LONGITUDE---" + location.getLongitude() + "---LATITUDE---" + location.getLatitude() + "---TIME---" + location.getTime());
                AbstractC28248z6.this.f131702p.m142235e(location, 1);
                AbstractC28248z6 abstractC28248z6 = AbstractC28248z6.this;
                if (abstractC28248z6.f131700n) {
                    AbstractC20879d.m109125w(abstractC28248z6.f131703q, 1, abstractC28248z6.f131701o);
                } else {
                    AbstractC20879d.m109126x(1, abstractC28248z6.f131701o);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: vg.z6$b */
    /* loaded from: classes3.dex */
    public class b extends AbstractC28044d7 {
        b() {
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(Location location) {
            if (location != null && location.getAccuracy() <= 10000.0f) {
                C28157p5.m141667d().m141676k("NETWORK---RETURN---NEW---LOCATION:---LONGITUDE---" + location.getLongitude() + "---LATITUDE---" + location.getLatitude() + "---TIME---" + location.getTime());
                AbstractC28248z6.this.f131702p.m142235e(location, 2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: vg.z6$c */
    /* loaded from: classes3.dex */
    public class c extends AbstractC28044d7 {
        c() {
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(Location location) {
            if (location != null && location.getAccuracy() <= 10000.0f) {
                C28157p5.m141667d().m141676k("PASSIVE---RETURN---NEW---LOCATION:---LONGITUDE---" + location.getLongitude() + "---LATITUDE---" + location.getLatitude() + "---TIME---" + location.getTime());
                AbstractC28248z6.this.f131702p.m142235e(location, 6);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: vg.z6$d */
    /* loaded from: classes3.dex */
    public class d extends f {
        d() {
        }

        @Override // vg.AbstractC28248z6.f
        /* renamed from: a */
        public void mo40758a(Location location, int i11) {
            if (location != null) {
                try {
                    if (location.getAccuracy() <= 10000.0f) {
                        C28157p5.m141667d().m141676k("GOOGLESERVICE---RETURN---NEW---LOCATION:---LONGITUDE---" + location.getLongitude() + "---LATITUDE---" + location.getLatitude() + "---TIME---" + location.getTime());
                        AbstractC28248z6.this.f131702p.m142235e(location, 3);
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        }
    }

    /* renamed from: vg.z6$e */
    /* loaded from: classes3.dex */
    public class e extends TimerTask {

        /* renamed from: p */
        private C0015d f131712p;

        public e(C0015d c0015d) {
            this.f131712p = c0015d;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            Location location;
            Location location2;
            try {
                C28139n5.m141620j().m141636h();
                AbstractC28248z6.this.m142230l();
                if (AbstractC28248z6.this.f131692f) {
                    location = this.f131712p.m23b("gps");
                } else {
                    location = null;
                }
                if (AbstractC28248z6.this.f131693g) {
                    location2 = this.f131712p.m23b("network");
                } else {
                    location2 = null;
                }
                if (location != null && location2 != null) {
                    if (location.getTime() > location2.getTime()) {
                        AbstractC28248z6.this.f131702p.m142236f(location, 4);
                        return;
                    } else {
                        AbstractC28248z6.this.f131702p.m142236f(location2, 4);
                        return;
                    }
                }
                if (location != null) {
                    AbstractC28248z6.this.f131702p.m142236f(location, 4);
                } else if (location2 != null) {
                    AbstractC28248z6.this.f131702p.m142236f(location2, 4);
                } else {
                    AbstractC28248z6.this.f131691e.mo40758a(null, 0);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
                f fVar = AbstractC28248z6.this.f131691e;
                if (fVar != null) {
                    fVar.mo40758a(null, 0);
                }
            }
        }
    }

    /* renamed from: vg.z6$f */
    /* loaded from: classes3.dex */
    public static abstract class f {
        /* renamed from: a */
        public abstract void mo40758a(Location location, int i11);
    }

    /* renamed from: vg.z6$g */
    /* loaded from: classes3.dex */
    public class g extends HandlerThread {

        /* renamed from: p */
        CountDownLatch f131714p;

        /* renamed from: q */
        Handler f131715q;

        public g(String str) {
            super("Z:" + str);
            this.f131714p = new CountDownLatch(1);
        }

        /* renamed from: c */
        public /* synthetic */ void m142233c(Location location, int i11) {
            AbstractC28248z6.this.m142230l();
            m142234d(location, i11);
            C28157p5.m141667d().m141677l(location);
        }

        /* renamed from: e */
        public void m142235e(Location location, int i11) {
            try {
                this.f131714p.await();
                Handler handler = this.f131715q;
                if (handler != null) {
                    handler.post(new Runnable() { // from class: vg.b7

                        /* renamed from: q */
                        public final /* synthetic */ Location f130822q;

                        /* renamed from: r */
                        public final /* synthetic */ int f130823r;

                        public /* synthetic */ RunnableC28024b7(Location location2, int i112) {
                            r2 = location2;
                            r3 = i112;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            AbstractC28248z6.g.this.m142233c(r2, r3);
                        }
                    });
                }
            } catch (InterruptedException e11) {
                e11.printStackTrace();
            }
        }

        /* renamed from: f */
        public void m142236f(Location location, int i11) {
            try {
                this.f131714p.await();
                Handler handler = this.f131715q;
                if (handler != null) {
                    handler.post(new Runnable() { // from class: vg.a7

                        /* renamed from: q */
                        public final /* synthetic */ Location f130637q;

                        /* renamed from: r */
                        public final /* synthetic */ int f130638r;

                        public /* synthetic */ RunnableC28014a7(Location location2, int i112) {
                            r2 = location2;
                            r3 = i112;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            AbstractC28248z6.g.this.m142234d(r2, r3);
                        }
                    });
                }
            } catch (InterruptedException e11) {
                e11.printStackTrace();
            }
        }

        /* renamed from: g */
        public void m142234d(Location location, int i11) {
            if (location != null) {
                C28139n5 m141620j = C28139n5.m141620j();
                System.currentTimeMillis();
                AbstractC28248z6.this.m142228j(m141620j, location);
                System.currentTimeMillis();
                if (i11 != 4 && i11 != 5) {
                    m141620j.m141628F(location.getLongitude(), location.getLatitude(), i11, System.currentTimeMillis(), location.getAccuracy());
                    C28157p5.m141667d().m141676k("LOCMANAGER---UPDATE---NEW---DATA:---LONGITUDE---" + location.getLongitude() + "---LATITUDE---" + location.getLatitude() + "---TIME---" + System.currentTimeMillis() + "---SOURCE---" + i11);
                } else {
                    m141620j.m141628F(location.getLongitude(), location.getLatitude(), i11, location.getTime(), location.getAccuracy());
                    C28157p5.m141667d().m141676k("LOCMANAGER---UPDATE---NEW---DATA:---LONGITUDE---" + location.getLongitude() + "---LATITUDE---" + location.getLatitude() + "---TIME---" + location.getTime() + "---SOURCE---" + i11);
                }
                f fVar = AbstractC28248z6.this.f131691e;
                if (fVar != null) {
                    fVar.mo40758a(location, i11);
                }
            }
        }

        @Override // android.os.HandlerThread
        protected void onLooperPrepared() {
            super.onLooperPrepared();
            if (getLooper() != null) {
                this.f131715q = new Handler(getLooper());
            }
            this.f131714p.countDown();
        }
    }

    public AbstractC28248z6() {
        g gVar = new g("RequestLocationHandlerThread");
        this.f131702p = gVar;
        gVar.start();
        this.f131703q = hashCode();
    }

    /* renamed from: g */
    public static String m142221g(Location location) {
        if (location == null) {
            return "NULL";
        }
        return "latitude=" + location.getLatitude() + "; longitude=" + location.getLongitude() + "; time elapsed=" + (System.currentTimeMillis() - location.getTime());
    }

    /* renamed from: a */
    public boolean m142222a(Context context) {
        if (this.f131688b == null) {
            this.f131688b = (LocationManager) context.getSystemService(ZVideoUtilMetadata.ZMETADATA_KEY_LOCATION);
        }
        try {
            this.f131692f = this.f131688b.isProviderEnabled("gps");
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        try {
            this.f131693g = this.f131688b.isProviderEnabled("network");
        } catch (Exception e12) {
            e12.printStackTrace();
        }
        if (!this.f131692f && !this.f131693g) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public int m142223b(Context context) {
        if (this.f131688b == null) {
            this.f131688b = (LocationManager) context.getSystemService(ZVideoUtilMetadata.ZMETADATA_KEY_LOCATION);
        }
        try {
            this.f131692f = this.f131688b.isProviderEnabled("gps");
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        try {
            this.f131693g = this.f131688b.isProviderEnabled("network");
        } catch (Exception e12) {
            e12.printStackTrace();
        }
        boolean z11 = this.f131692f;
        if (!z11 && !this.f131693g) {
            return 0;
        }
        if (z11 && this.f131693g) {
            return 3;
        }
        if (z11) {
            return 1;
        }
        return 2;
    }

    /* renamed from: c */
    protected abstract void mo142208c();

    /* renamed from: d */
    protected abstract void mo142209d();

    /* renamed from: e */
    public void m142224e() {
        try {
            this.f131702p.quit();
            this.f131688b.removeUpdates(this.f131704r);
            this.f131688b.removeUpdates(this.f131705s);
            this.f131688b.removeUpdates(this.f131706t);
            mo142209d();
            Timer timer = this.f131687a;
            if (timer != null) {
                timer.cancel();
            }
            AbstractC20879d.m109121s(this.f131703q);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: f */
    public boolean m142225f(Context context, f fVar, SensitiveData sensitiveData) {
        Location m141673c;
        this.f131691e = fVar;
        try {
            if (this.f131695i && AbstractC23309i.m121158Le() && (m141673c = C28157p5.m141667d().m141673c()) != null && System.currentTimeMillis() - m141673c.getTime() < 60000) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Return cached location:");
                sb2.append(m141673c);
                C28157p5.m141667d().m141676k("GET---LOCATION---FROM---CACHED:---LONGITUDE---" + m141673c.getLongitude() + "---LATITUDE---" + m141673c.getLatitude() + "---TIME---" + m141673c.getTime());
                this.f131702p.m142236f(m141673c, 5);
                return true;
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        try {
            if (this.f131688b == null) {
                this.f131688b = (LocationManager) context.getSystemService(ZVideoUtilMetadata.ZMETADATA_KEY_LOCATION);
            }
            if (this.f131689c == null) {
                this.f131689c = new C0015d(this.f131688b, sensitiveData);
            }
            C28139n5.m141620j().m141623A();
            if (AbstractC3103o.m15619h(24)) {
                this.f131694h = new C21722b(this.f131689c);
            } else {
                this.f131694h = new C21723c(this.f131689c);
            }
            this.f131694h.mo112124a();
            try {
                this.f131692f = this.f131689c.m24c("gps");
                C28139n5.m141620j().m141625C(this.f131692f ? 1 : 0);
            } catch (Exception e12) {
                e12.printStackTrace();
            }
            try {
                this.f131693g = this.f131689c.m24c("network");
            } catch (Exception e13) {
                e13.printStackTrace();
            }
            if (!this.f131692f && !this.f131693g) {
                C28157p5.m141667d().m141676k("GET---LOCATION---FAIL---NOT---GPS---NOT---NETWORK");
                return false;
            }
            C28157p5.m141667d().m141676k("START---GET---NEW---LOCATION--FROM---SERVICE");
            mo142208c();
            if (this.f131692f) {
                this.f131689c.m28g("gps", this.f131696j, this.f131697k, this.f131704r);
                if (C23476m.m123248f() && !Debug.isDebuggerConnected()) {
                    this.f131701o = new Exception();
                }
            }
            if (this.f131693g) {
                this.f131689c.m28g("network", this.f131696j, this.f131697k, this.f131705s);
            }
            Timer timer = new Timer();
            this.f131687a = timer;
            timer.schedule(new e(this.f131689c), 5000L);
            return true;
        } catch (Exception e14) {
            AbstractC20110a.m104539h(e14);
            return false;
        }
    }

    /* renamed from: h */
    public boolean m142226h(Context context, f fVar, SensitiveData sensitiveData) {
        Location m141673c;
        this.f131691e = fVar;
        this.f131700n = true;
        try {
            if (this.f131695i && AbstractC23309i.m121158Le() && (m141673c = C28157p5.m141667d().m141673c()) != null && System.currentTimeMillis() - m141673c.getTime() < 60000) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Return cached location:");
                sb2.append(m141673c);
                C28157p5.m141667d().m141676k("GET---LOCATION---FROM---CACHED:---LONGITUDE---" + m141673c.getLongitude() + "---LATITUDE---" + m141673c.getLatitude() + "---TIME---" + m141673c.getTime());
                this.f131702p.m142236f(m141673c, 5);
                return true;
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        try {
            if (this.f131688b == null) {
                this.f131688b = (LocationManager) context.getSystemService(ZVideoUtilMetadata.ZMETADATA_KEY_LOCATION);
            }
            if (this.f131690d == null) {
                this.f131690d = new C0015d(this.f131688b, sensitiveData);
            }
            C28139n5.m141620j().m141623A();
            if (AbstractC3103o.m15619h(24)) {
                this.f131694h = new C21722b(this.f131690d);
            } else {
                this.f131694h = new C21723c(this.f131690d);
            }
            this.f131694h.mo112124a();
            try {
                this.f131692f = this.f131690d.m24c("gps");
                C28139n5.m141620j().m141625C(this.f131692f ? 1 : 0);
            } catch (Exception e12) {
                e12.printStackTrace();
            }
            try {
                this.f131693g = this.f131690d.m24c("network");
            } catch (Exception e13) {
                e13.printStackTrace();
            }
            boolean m24c = this.f131690d.m24c("passive");
            if (!this.f131692f && !this.f131693g && !m24c) {
                C28157p5.m141667d().m141676k("GET---LOCATION---FAIL---NOT---GPS---NOT---NETWORK");
                return false;
            }
            C28157p5.m141667d().m141676k("START---GET---NEW---LOCATION--FROM---SERVICE");
            mo142208c();
            if (this.f131692f) {
                this.f131690d.m28g("gps", 1L, 0.0f, this.f131704r);
                if (C23476m.m123248f() && !Debug.isDebuggerConnected()) {
                    this.f131701o = new Exception();
                }
            }
            if (this.f131693g) {
                this.f131690d.m28g("network", 1L, 0.0f, this.f131705s);
            }
            if (m24c) {
                this.f131690d.m28g("passive", 1L, 0.0f, this.f131706t);
            }
            return true;
        } catch (Exception e14) {
            AbstractC20110a.m104539h(e14);
            return false;
        }
    }

    /* renamed from: i */
    public void m142227i(long j11) {
        this.f131696j = j11;
    }

    /* renamed from: j */
    void m142228j(C28139n5 c28139n5, Location location) {
        String str;
        try {
            if (c28139n5.f131179j == null) {
                c28139n5.m141624B(location.isFromMockProvider() ? 1 : 0);
                JSONObject m141638k = c28139n5.m141638k();
                if (m141638k != null) {
                    str = m141638k.toString();
                } else {
                    str = "";
                }
                c28139n5.m141627E(str);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: k */
    public void m142229k(boolean z11) {
        this.f131695i = z11;
    }

    /* renamed from: l */
    public void m142230l() {
        try {
            C0015d c0015d = this.f131689c;
            if (c0015d != null) {
                c0015d.m27f(this.f131704r);
                if (!this.f131700n) {
                    this.f131689c.m27f(this.f131705s);
                    this.f131689c.m27f(this.f131706t);
                }
            }
            C0015d c0015d2 = this.f131690d;
            if (c0015d2 != null) {
                c0015d2.m27f(this.f131704r);
                if (!this.f131700n) {
                    this.f131690d.m27f(this.f131705s);
                    this.f131690d.m27f(this.f131706t);
                }
            }
            mo142209d();
            Timer timer = this.f131687a;
            if (timer != null) {
                timer.cancel();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
