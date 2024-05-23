package com.google.firebase.remoteconfig.internal;

import android.content.SharedPreferences;
import java.util.Date;
import p541u9.C27201i;
import p541u9.InterfaceC27200h;

/* renamed from: com.google.firebase.remoteconfig.internal.p */
/* loaded from: classes3.dex */
public class C6732p {

    /* renamed from: e */
    static final Date f37040e = new Date(-1);

    /* renamed from: f */
    static final Date f37041f = new Date(-1);

    /* renamed from: a */
    private final SharedPreferences f37042a;

    /* renamed from: b */
    private final Object f37043b = new Object();

    /* renamed from: c */
    private final Object f37044c = new Object();

    /* renamed from: d */
    private final Object f37045d = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.remoteconfig.internal.p$a */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a */
        private int f37046a;

        /* renamed from: b */
        private Date f37047b;

        a(int i11, Date date) {
            this.f37046a = i11;
            this.f37047b = date;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public Date m34457a() {
            return this.f37047b;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: b */
        public int m34458b() {
            return this.f37046a;
        }
    }

    /* renamed from: com.google.firebase.remoteconfig.internal.p$b */
    /* loaded from: classes3.dex */
    static class b {

        /* renamed from: a */
        private int f37048a;

        /* renamed from: b */
        private Date f37049b;

        b(int i11, Date date) {
            this.f37048a = i11;
            this.f37049b = date;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public Date m34459a() {
            return this.f37049b;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: b */
        public int m34460b() {
            return this.f37048a;
        }
    }

    public C6732p(SharedPreferences sharedPreferences) {
        this.f37042a = sharedPreferences;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public a m34440a() {
        a aVar;
        synchronized (this.f37044c) {
            aVar = new a(this.f37042a.getInt("num_failed_fetches", 0), new Date(this.f37042a.getLong("backoff_end_time_in_millis", -1L)));
        }
        return aVar;
    }

    /* renamed from: b */
    public long m34441b() {
        return this.f37042a.getLong("fetch_timeout_in_seconds", 60L);
    }

    /* renamed from: c */
    public InterfaceC27200h m34442c() {
        C6737u m34501a;
        synchronized (this.f37043b) {
            long j11 = this.f37042a.getLong("last_fetch_time_in_millis", -1L);
            int i11 = this.f37042a.getInt("last_fetch_status", 0);
            m34501a = C6737u.m34499b().m34503c(i11).m34504d(j11).m34502b(new C27201i.b().m139269d(this.f37042a.getLong("fetch_timeout_in_seconds", 60L)).m139270e(this.f37042a.getLong("minimum_fetch_interval_in_seconds", C6729m.f37011j)).m139268c()).m34501a();
        }
        return m34501a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public String m34443d() {
        return this.f37042a.getString("last_fetch_etag", null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public Date m34444e() {
        return new Date(this.f37042a.getLong("last_fetch_time_in_millis", -1L));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public long m34445f() {
        return this.f37042a.getLong("last_template_version", 0L);
    }

    /* renamed from: g */
    public long m34446g() {
        return this.f37042a.getLong("minimum_fetch_interval_in_seconds", C6729m.f37011j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public b m34447h() {
        b bVar;
        synchronized (this.f37045d) {
            bVar = new b(this.f37042a.getInt("num_failed_realtime_streams", 0), new Date(this.f37042a.getLong("realtime_backoff_end_time_in_millis", -1L)));
        }
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public void m34448i() {
        m34450k(0, f37041f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m34449j() {
        m34453n(0, f37041f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public void m34450k(int i11, Date date) {
        synchronized (this.f37044c) {
            this.f37042a.edit().putInt("num_failed_fetches", i11).putLong("backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public void m34451l(String str) {
        synchronized (this.f37043b) {
            this.f37042a.edit().putString("last_fetch_etag", str).apply();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public void m34452m(long j11) {
        synchronized (this.f37043b) {
            this.f37042a.edit().putLong("last_template_version", j11).apply();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public void m34453n(int i11, Date date) {
        synchronized (this.f37045d) {
            this.f37042a.edit().putInt("num_failed_realtime_streams", i11).putLong("realtime_backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public void m34454o() {
        synchronized (this.f37043b) {
            this.f37042a.edit().putInt("last_fetch_status", 1).apply();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public void m34455p(Date date) {
        synchronized (this.f37043b) {
            this.f37042a.edit().putInt("last_fetch_status", -1).putLong("last_fetch_time_in_millis", date.getTime()).apply();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public void m34456q() {
        synchronized (this.f37043b) {
            this.f37042a.edit().putInt("last_fetch_status", 2).apply();
        }
    }
}
