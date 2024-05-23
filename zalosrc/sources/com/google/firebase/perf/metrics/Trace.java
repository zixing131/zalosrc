package com.google.firebase.perf.metrics;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.firebase.perf.application.AbstractC6659b;
import com.google.firebase.perf.application.C6658a;
import com.google.firebase.perf.config.C6662a;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import com.google.firebase.perf.util.Timer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p319l9.C22152a;
import p360n9.AbstractC23631e;
import p419p9.InterfaceC24679a;
import p441q9.C25197k;
import p476r9.C25693a;

/* loaded from: classes3.dex */
public class Trace extends AbstractC6659b implements Parcelable, InterfaceC24679a {

    /* renamed from: B */
    private static final C22152a f36848B = C22152a.m115524e();

    /* renamed from: C */
    private static final Map f36849C = new ConcurrentHashMap();

    @Keep
    public static final Parcelable.Creator<Trace> CREATOR = new C6692a();

    /* renamed from: D */
    static final Parcelable.Creator f36850D = new C6693b();

    /* renamed from: A */
    private Timer f36851A;

    /* renamed from: p */
    private final WeakReference f36852p;

    /* renamed from: q */
    private final Trace f36853q;

    /* renamed from: r */
    private final GaugeManager f36854r;

    /* renamed from: s */
    private final String f36855s;

    /* renamed from: t */
    private final Map f36856t;

    /* renamed from: u */
    private final Map f36857u;

    /* renamed from: v */
    private final List f36858v;

    /* renamed from: w */
    private final List f36859w;

    /* renamed from: x */
    private final C25197k f36860x;

    /* renamed from: y */
    private final C25693a f36861y;

    /* renamed from: z */
    private Timer f36862z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.perf.metrics.Trace$a */
    /* loaded from: classes3.dex */
    public class C6692a implements Parcelable.Creator {
        C6692a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Trace createFromParcel(Parcel parcel) {
            return new Trace(parcel, false, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Trace[] newArray(int i11) {
            return new Trace[i11];
        }
    }

    /* renamed from: com.google.firebase.perf.metrics.Trace$b */
    /* loaded from: classes3.dex */
    class C6693b implements Parcelable.Creator {
        C6693b() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Trace createFromParcel(Parcel parcel) {
            return new Trace(parcel, true, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Trace[] newArray(int i11) {
            return new Trace[i11];
        }
    }

    /* synthetic */ Trace(Parcel parcel, boolean z11, C6692a c6692a) {
        this(parcel, z11);
    }

    /* renamed from: b */
    private void m34159b(String str, String str2) {
        if (!m34171k()) {
            if (!this.f36857u.containsKey(str) && this.f36857u.size() >= 5) {
                throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Exceeds max limit of number of attributes - %d", 5));
            }
            AbstractC23631e.m123877d(str, str2);
            return;
        }
        throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Trace '%s' has been stopped", this.f36855s));
    }

    /* renamed from: l */
    private Counter m34160l(String str) {
        Counter counter = (Counter) this.f36856t.get(str);
        if (counter == null) {
            Counter counter2 = new Counter(str);
            this.f36856t.put(str, counter2);
            return counter2;
        }
        return counter;
    }

    /* renamed from: m */
    private void m34161m(Timer timer) {
        if (this.f36859w.isEmpty()) {
            return;
        }
        Trace trace = (Trace) this.f36859w.get(this.f36859w.size() - 1);
        if (trace.f36851A == null) {
            trace.f36851A = timer;
        }
    }

    @Override // p419p9.InterfaceC24679a
    /* renamed from: a */
    public void mo34162a(PerfSession perfSession) {
        if (perfSession == null) {
            f36848B.m115533j("Unable to add new SessionId to the Trace. Continuing without it.");
        } else if (m34169i() && !m34171k()) {
            this.f36858v.add(perfSession);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public Map m34163c() {
        return this.f36856t;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public Timer m34164d() {
        return this.f36851A;
    }

    @Override // android.os.Parcelable
    @Keep
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public String m34165e() {
        return this.f36855s;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public List m34166f() {
        List unmodifiableList;
        synchronized (this.f36858v) {
            try {
                ArrayList arrayList = new ArrayList();
                for (PerfSession perfSession : this.f36858v) {
                    if (perfSession != null) {
                        arrayList.add(perfSession);
                    }
                }
                unmodifiableList = Collections.unmodifiableList(arrayList);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return unmodifiableList;
    }

    protected void finalize() {
        try {
            if (m34170j()) {
                f36848B.m115534k("Trace '%s' is started but not stopped when it is destructed!", this.f36855s);
                incrementTsnsCount(1);
            }
        } finally {
            super.finalize();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public Timer m34167g() {
        return this.f36862z;
    }

    @Keep
    public String getAttribute(String str) {
        return (String) this.f36857u.get(str);
    }

    @Keep
    public Map<String, String> getAttributes() {
        return new HashMap(this.f36857u);
    }

    @Keep
    public long getLongMetric(String str) {
        Counter counter;
        if (str != null) {
            counter = (Counter) this.f36856t.get(str.trim());
        } else {
            counter = null;
        }
        if (counter == null) {
            return 0L;
        }
        return counter.m34153a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public List m34168h() {
        return this.f36859w;
    }

    /* renamed from: i */
    boolean m34169i() {
        return this.f36862z != null;
    }

    @Keep
    public void incrementMetric(String str, long j11) {
        String m123878e = AbstractC23631e.m123878e(str);
        if (m123878e != null) {
            f36848B.m115528d("Cannot increment metric '%s'. Metric name is invalid.(%s)", str, m123878e);
            return;
        }
        if (!m34169i()) {
            f36848B.m115534k("Cannot increment metric '%s' for trace '%s' because it's not started", str, this.f36855s);
        } else {
            if (m34171k()) {
                f36848B.m115534k("Cannot increment metric '%s' for trace '%s' because it's been stopped", str, this.f36855s);
                return;
            }
            Counter m34160l = m34160l(str.trim());
            m34160l.m34155c(j11);
            f36848B.m115526b("Incrementing metric '%s' to %d on trace '%s'", str, Long.valueOf(m34160l.m34153a()), this.f36855s);
        }
    }

    /* renamed from: j */
    boolean m34170j() {
        if (m34169i() && !m34171k()) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    boolean m34171k() {
        return this.f36851A != null;
    }

    @Keep
    public void putAttribute(String str, String str2) {
        boolean z11 = false;
        try {
            str = str.trim();
            str2 = str2.trim();
            m34159b(str, str2);
            f36848B.m115526b("Setting attribute '%s' to '%s' on trace '%s'", str, str2, this.f36855s);
            z11 = true;
        } catch (Exception e11) {
            f36848B.m115528d("Can not set attribute '%s' with value '%s' (%s)", str, str2, e11.getMessage());
        }
        if (z11) {
            this.f36857u.put(str, str2);
        }
    }

    @Keep
    public void putMetric(String str, long j11) {
        String m123878e = AbstractC23631e.m123878e(str);
        if (m123878e != null) {
            f36848B.m115528d("Cannot set value for metric '%s'. Metric name is invalid.(%s)", str, m123878e);
            return;
        }
        if (!m34169i()) {
            f36848B.m115534k("Cannot set value for metric '%s' for trace '%s' because it's not started", str, this.f36855s);
        } else if (m34171k()) {
            f36848B.m115534k("Cannot set value for metric '%s' for trace '%s' because it's been stopped", str, this.f36855s);
        } else {
            m34160l(str.trim()).m34156d(j11);
            f36848B.m115526b("Setting metric '%s' to '%s' on trace '%s'", str, Long.valueOf(j11), this.f36855s);
        }
    }

    @Keep
    public void removeAttribute(String str) {
        if (m34171k()) {
            f36848B.m115527c("Can't remove a attribute from a Trace that's stopped.");
        } else {
            this.f36857u.remove(str);
        }
    }

    @Keep
    public void start() {
        if (!C6662a.m34042g().m34059K()) {
            f36848B.m115525a("Trace feature is disabled.");
            return;
        }
        String m123879f = AbstractC23631e.m123879f(this.f36855s);
        if (m123879f != null) {
            f36848B.m115528d("Cannot start trace '%s'. Trace name is invalid.(%s)", this.f36855s, m123879f);
            return;
        }
        if (this.f36862z != null) {
            f36848B.m115528d("Trace '%s' has already started, should not start again!", this.f36855s);
            return;
        }
        this.f36862z = this.f36861y.m132598a();
        registerForAppState();
        PerfSession perfSession = SessionManager.getInstance().perfSession();
        SessionManager.getInstance().registerForSessionUpdates(this.f36852p);
        mo34162a(perfSession);
        if (perfSession.m34249f()) {
            this.f36854r.collectGaugeMetricOnce(perfSession.m34247d());
        }
    }

    @Keep
    public void stop() {
        if (!m34169i()) {
            f36848B.m115528d("Trace '%s' has not been started so unable to stop!", this.f36855s);
            return;
        }
        if (m34171k()) {
            f36848B.m115528d("Trace '%s' has already stopped, should not stop again!", this.f36855s);
            return;
        }
        SessionManager.getInstance().unregisterForSessionUpdates(this.f36852p);
        unregisterForAppState();
        Timer m132598a = this.f36861y.m132598a();
        this.f36851A = m132598a;
        if (this.f36853q == null) {
            m34161m(m132598a);
            if (!this.f36855s.isEmpty()) {
                this.f36860x.m130431C(new C6694a(this).m34176a(), getAppState());
                if (SessionManager.getInstance().perfSession().m34249f()) {
                    this.f36854r.collectGaugeMetricOnce(SessionManager.getInstance().perfSession().m34247d());
                    return;
                }
                return;
            }
            f36848B.m115527c("Trace name is empty, no log is sent to server");
        }
    }

    @Override // android.os.Parcelable
    @Keep
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeParcelable(this.f36853q, 0);
        parcel.writeString(this.f36855s);
        parcel.writeList(this.f36859w);
        parcel.writeMap(this.f36856t);
        parcel.writeParcelable(this.f36862z, 0);
        parcel.writeParcelable(this.f36851A, 0);
        synchronized (this.f36858v) {
            parcel.writeList(this.f36858v);
        }
    }

    public Trace(String str, C25197k c25197k, C25693a c25693a, C6658a c6658a) {
        this(str, c25197k, c25693a, c6658a, GaugeManager.getInstance());
    }

    public Trace(String str, C25197k c25197k, C25693a c25693a, C6658a c6658a, GaugeManager gaugeManager) {
        super(c6658a);
        this.f36852p = new WeakReference(this);
        this.f36853q = null;
        this.f36855s = str.trim();
        this.f36859w = new ArrayList();
        this.f36856t = new ConcurrentHashMap();
        this.f36857u = new ConcurrentHashMap();
        this.f36861y = c25693a;
        this.f36860x = c25197k;
        this.f36858v = Collections.synchronizedList(new ArrayList());
        this.f36854r = gaugeManager;
    }

    private Trace(Parcel parcel, boolean z11) {
        super(z11 ? null : C6658a.m34003b());
        this.f36852p = new WeakReference(this);
        this.f36853q = (Trace) parcel.readParcelable(Trace.class.getClassLoader());
        this.f36855s = parcel.readString();
        ArrayList arrayList = new ArrayList();
        this.f36859w = arrayList;
        parcel.readList(arrayList, Trace.class.getClassLoader());
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f36856t = concurrentHashMap;
        this.f36857u = new ConcurrentHashMap();
        parcel.readMap(concurrentHashMap, Counter.class.getClassLoader());
        this.f36862z = (Timer) parcel.readParcelable(Timer.class.getClassLoader());
        this.f36851A = (Timer) parcel.readParcelable(Timer.class.getClassLoader());
        List synchronizedList = Collections.synchronizedList(new ArrayList());
        this.f36858v = synchronizedList;
        parcel.readList(synchronizedList, PerfSession.class.getClassLoader());
        if (z11) {
            this.f36860x = null;
            this.f36861y = null;
            this.f36854r = null;
        } else {
            this.f36860x = C25197k.m130415k();
            this.f36861y = new C25693a();
            this.f36854r = GaugeManager.getInstance();
        }
    }
}
