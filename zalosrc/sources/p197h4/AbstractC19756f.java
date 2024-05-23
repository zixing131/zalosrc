package p197h4;

import android.app.job.JobInfo;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p197h4.C19753c;
import p288k4.InterfaceC21460a;
import p668y3.EnumC30278d;

/* renamed from: h4.f */
/* loaded from: classes.dex */
public abstract class AbstractC19756f {

    /* renamed from: h4.f$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        private InterfaceC21460a f97865a;

        /* renamed from: b */
        private Map f97866b = new HashMap();

        /* renamed from: a */
        public a m103488a(EnumC30278d enumC30278d, b bVar) {
            this.f97866b.put(enumC30278d, bVar);
            return this;
        }

        /* renamed from: b */
        public AbstractC19756f m103489b() {
            if (this.f97865a != null) {
                if (this.f97866b.keySet().size() >= EnumC30278d.values().length) {
                    Map map = this.f97866b;
                    this.f97866b = new HashMap();
                    return AbstractC19756f.m103482d(this.f97865a, map);
                }
                throw new IllegalStateException("Not all priorities have been configured");
            }
            throw new NullPointerException("missing required property: clock");
        }

        /* renamed from: c */
        public a m103490c(InterfaceC21460a interfaceC21460a) {
            this.f97865a = interfaceC21460a;
            return this;
        }
    }

    /* renamed from: h4.f$b */
    /* loaded from: classes.dex */
    public static abstract class b {

        /* renamed from: h4.f$b$a */
        /* loaded from: classes.dex */
        public static abstract class a {
            /* renamed from: a */
            public abstract b mo103472a();

            /* renamed from: b */
            public abstract a mo103473b(long j11);

            /* renamed from: c */
            public abstract a mo103474c(Set set);

            /* renamed from: d */
            public abstract a mo103475d(long j11);
        }

        /* renamed from: a */
        public static a m103491a() {
            return new C19753c.b().mo103474c(Collections.emptySet());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract long mo103469b();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: c */
        public abstract Set mo103470c();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: d */
        public abstract long mo103471d();
    }

    /* renamed from: h4.f$c */
    /* loaded from: classes.dex */
    public enum c {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    /* renamed from: a */
    private long m103480a(int i11, long j11) {
        long j12;
        int i12 = i11 - 1;
        if (j11 > 1) {
            j12 = j11;
        } else {
            j12 = 2;
        }
        return (long) (Math.pow(3.0d, i12) * j11 * Math.max(1.0d, Math.log(10000.0d) / Math.log(j12 * i12)));
    }

    /* renamed from: b */
    public static a m103481b() {
        return new a();
    }

    /* renamed from: d */
    static AbstractC19756f m103482d(InterfaceC21460a interfaceC21460a, Map map) {
        return new C19752b(interfaceC21460a, map);
    }

    /* renamed from: f */
    public static AbstractC19756f m103483f(InterfaceC21460a interfaceC21460a) {
        return m103481b().m103488a(EnumC30278d.DEFAULT, b.m103491a().mo103473b(30000L).mo103475d(86400000L).mo103472a()).m103488a(EnumC30278d.HIGHEST, b.m103491a().mo103473b(1000L).mo103475d(86400000L).mo103472a()).m103488a(EnumC30278d.VERY_LOW, b.m103491a().mo103473b(86400000L).mo103475d(86400000L).mo103474c(m103484i(c.DEVICE_IDLE)).mo103472a()).m103490c(interfaceC21460a).m103489b();
    }

    /* renamed from: i */
    private static Set m103484i(Object... objArr) {
        return Collections.unmodifiableSet(new HashSet(Arrays.asList(objArr)));
    }

    /* renamed from: j */
    private void m103485j(JobInfo.Builder builder, Set set) {
        if (set.contains(c.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (set.contains(c.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (set.contains(c.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
    }

    /* renamed from: c */
    public JobInfo.Builder m103486c(JobInfo.Builder builder, EnumC30278d enumC30278d, long j11, int i11) {
        builder.setMinimumLatency(m103487g(enumC30278d, j11, i11));
        m103485j(builder, ((b) mo103468h().get(enumC30278d)).mo103470c());
        return builder;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract InterfaceC21460a mo103467e();

    /* renamed from: g */
    public long m103487g(EnumC30278d enumC30278d, long j11, int i11) {
        long mo111045a = j11 - mo103467e().mo111045a();
        b bVar = (b) mo103468h().get(enumC30278d);
        return Math.min(Math.max(m103480a(i11, bVar.mo103469b()), mo111045a), bVar.mo103471d());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public abstract Map mo103468h();
}
