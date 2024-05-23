package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.AbstractC2253u;
import androidx.work.InterfaceC2136b;
import androidx.work.impl.C2155a0;
import androidx.work.impl.C2157b0;
import androidx.work.impl.InterfaceC2189f;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.C2165g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p535u2.C26967n;
import p535u2.C26976w;

/* renamed from: androidx.work.impl.background.systemalarm.b */
/* loaded from: classes2.dex */
public class C2160b implements InterfaceC2189f {

    /* renamed from: u */
    private static final String f9170u = AbstractC2253u.m11897i("CommandHandler");

    /* renamed from: p */
    private final Context f9171p;

    /* renamed from: q */
    private final Map f9172q = new HashMap();

    /* renamed from: r */
    private final Object f9173r = new Object();

    /* renamed from: s */
    private final InterfaceC2136b f9174s;

    /* renamed from: t */
    private final C2157b0 f9175t;

    public C2160b(Context context, InterfaceC2136b interfaceC2136b, C2157b0 c2157b0) {
        this.f9171p = context;
        this.f9174s = interfaceC2136b;
        this.f9175t = c2157b0;
    }

    /* renamed from: a */
    public static Intent m11598a(Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_CONSTRAINTS_CHANGED");
        return intent;
    }

    /* renamed from: b */
    public static Intent m11599b(Context context, C26967n c26967n) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        return m11613s(intent, c26967n);
    }

    /* renamed from: c */
    public static Intent m11600c(Context context, C26967n c26967n, boolean z11) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z11);
        return m11613s(intent, c26967n);
    }

    /* renamed from: d */
    public static Intent m11601d(Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_RESCHEDULE");
        return intent;
    }

    /* renamed from: f */
    public static Intent m11602f(Context context, C26967n c26967n) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        return m11613s(intent, c26967n);
    }

    /* renamed from: g */
    public static Intent m11603g(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    /* renamed from: h */
    public static Intent m11604h(Context context, C26967n c26967n) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        return m11613s(intent, c26967n);
    }

    /* renamed from: i */
    private void m11605i(Intent intent, int i11, C2165g c2165g) {
        AbstractC2253u.m11895e().mo11898a(f9170u, "Handling constraints changed " + intent);
        new C2161c(this.f9171p, this.f9174s, i11, c2165g).m11617a();
    }

    /* renamed from: j */
    private void m11606j(Intent intent, int i11, C2165g c2165g) {
        synchronized (this.f9173r) {
            try {
                C26967n m11612r = m11612r(intent);
                AbstractC2253u m11895e = AbstractC2253u.m11895e();
                String str = f9170u;
                m11895e.mo11898a(str, "Handing delay met for " + m11612r);
                if (!this.f9172q.containsKey(m11612r)) {
                    C2164f c2164f = new C2164f(this.f9171p, i11, c2165g, this.f9175t.m11587d(m11612r));
                    this.f9172q.put(m11612r, c2164f);
                    c2164f.m11625f();
                } else {
                    AbstractC2253u.m11895e().mo11898a(str, "WorkSpec " + m11612r + " is is already being handled for ACTION_DELAY_MET");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: k */
    private void m11607k(Intent intent, int i11) {
        C26967n m11612r = m11612r(intent);
        boolean z11 = intent.getExtras().getBoolean("KEY_NEEDS_RESCHEDULE");
        AbstractC2253u.m11895e().mo11898a(f9170u, "Handling onExecutionCompleted " + intent + ", " + i11);
        mo11614e(m11612r, z11);
    }

    /* renamed from: l */
    private void m11608l(Intent intent, int i11, C2165g c2165g) {
        AbstractC2253u.m11895e().mo11898a(f9170u, "Handling reschedule " + intent + ", " + i11);
        c2165g.m11634g().m11743z();
    }

    /* renamed from: m */
    private void m11609m(Intent intent, int i11, C2165g c2165g) {
        C26967n m11612r = m11612r(intent);
        AbstractC2253u m11895e = AbstractC2253u.m11895e();
        String str = f9170u;
        m11895e.mo11898a(str, "Handling schedule work for " + m11612r);
        WorkDatabase m11740w = c2165g.m11634g().m11740w();
        m11740w.m342e();
        try {
            C26976w mo139008j = m11740w.mo11565L().mo139008j(m11612r.m138955b());
            if (mo139008j == null) {
                AbstractC2253u.m11895e().mo11905k(str, "Skipping scheduling " + m11612r + " because it's no longer in the DB");
                return;
            }
            if (mo139008j.f127498b.m11545c()) {
                AbstractC2253u.m11895e().mo11905k(str, "Skipping scheduling " + m11612r + "because it is finished.");
                return;
            }
            long m138973c = mo139008j.m138973c();
            if (!mo139008j.m138980k()) {
                AbstractC2253u.m11895e().mo11898a(str, "Setting up Alarms for " + m11612r + "at " + m138973c);
                AbstractC2159a.m11595c(this.f9171p, m11740w, m11612r, m138973c);
            } else {
                AbstractC2253u.m11895e().mo11898a(str, "Opportunistically setting an alarm for " + m11612r + "at " + m138973c);
                AbstractC2159a.m11595c(this.f9171p, m11740w, m11612r, m138973c);
                c2165g.m11633f().mo143749a().execute(new C2165g.b(c2165g, m11598a(this.f9171p), i11));
            }
            m11740w.m339E();
        } finally {
            m11740w.m347j();
        }
    }

    /* renamed from: n */
    private void m11610n(Intent intent, C2165g c2165g) {
        List<C2155a0> m11586c;
        Bundle extras = intent.getExtras();
        String string = extras.getString("KEY_WORKSPEC_ID");
        if (extras.containsKey("KEY_WORKSPEC_GENERATION")) {
            int i11 = extras.getInt("KEY_WORKSPEC_GENERATION");
            m11586c = new ArrayList(1);
            C2155a0 m11585b = this.f9175t.m11585b(new C26967n(string, i11));
            if (m11585b != null) {
                m11586c.add(m11585b);
            }
        } else {
            m11586c = this.f9175t.m11586c(string);
        }
        for (C2155a0 c2155a0 : m11586c) {
            AbstractC2253u.m11895e().mo11898a(f9170u, "Handing stopWork work for " + string);
            c2165g.m11636i().mo11724e(c2155a0);
            AbstractC2159a.m11593a(this.f9171p, c2165g.m11634g().m11740w(), c2155a0.m11582a());
            c2165g.mo11614e(c2155a0.m11582a(), false);
        }
    }

    /* renamed from: o */
    private static boolean m11611o(Bundle bundle, String... strArr) {
        if (bundle == null || bundle.isEmpty()) {
            return false;
        }
        for (String str : strArr) {
            if (bundle.get(str) == null) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: r */
    static C26967n m11612r(Intent intent) {
        return new C26967n(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_WORKSPEC_GENERATION", 0));
    }

    /* renamed from: s */
    private static Intent m11613s(Intent intent, C26967n c26967n) {
        intent.putExtra("KEY_WORKSPEC_ID", c26967n.m138955b());
        intent.putExtra("KEY_WORKSPEC_GENERATION", c26967n.m138954a());
        return intent;
    }

    @Override // androidx.work.impl.InterfaceC2189f
    /* renamed from: e */
    public void mo11614e(C26967n c26967n, boolean z11) {
        synchronized (this.f9173r) {
            try {
                C2164f c2164f = (C2164f) this.f9172q.remove(c26967n);
                this.f9175t.m11585b(c26967n);
                if (c2164f != null) {
                    c2164f.m11626g(z11);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: p */
    public boolean m11615p() {
        boolean z11;
        synchronized (this.f9173r) {
            z11 = !this.f9172q.isEmpty();
        }
        return z11;
    }

    /* renamed from: q */
    public void m11616q(Intent intent, int i11, C2165g c2165g) {
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            m11605i(intent, i11, c2165g);
            return;
        }
        if ("ACTION_RESCHEDULE".equals(action)) {
            m11608l(intent, i11, c2165g);
            return;
        }
        if (!m11611o(intent.getExtras(), "KEY_WORKSPEC_ID")) {
            AbstractC2253u.m11895e().mo11900c(f9170u, "Invalid request for " + action + " , requires KEY_WORKSPEC_ID .");
            return;
        }
        if ("ACTION_SCHEDULE_WORK".equals(action)) {
            m11609m(intent, i11, c2165g);
            return;
        }
        if ("ACTION_DELAY_MET".equals(action)) {
            m11606j(intent, i11, c2165g);
            return;
        }
        if ("ACTION_STOP_WORK".equals(action)) {
            m11610n(intent, c2165g);
            return;
        }
        if ("ACTION_EXECUTION_COMPLETED".equals(action)) {
            m11607k(intent, i11);
            return;
        }
        AbstractC2253u.m11895e().mo11905k(f9170u, "Ignoring intent " + intent);
    }
}
