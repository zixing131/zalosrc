package androidx.work.impl.foreground;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.AbstractC2253u;
import androidx.work.C2244l;
import androidx.work.impl.C2221r0;
import androidx.work.impl.InterfaceC2189f;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import kotlinx.coroutines.Job;
import p470r2.AbstractC25616b;
import p470r2.AbstractC25620f;
import p470r2.C25619e;
import p470r2.InterfaceC25618d;
import p535u2.AbstractC26979z;
import p535u2.C26967n;
import p535u2.C26976w;
import p595w2.InterfaceC28696c;

/* renamed from: androidx.work.impl.foreground.b */
/* loaded from: classes2.dex */
public class C2197b implements InterfaceC25618d, InterfaceC2189f {

    /* renamed from: z */
    static final String f9266z = AbstractC2253u.m11897i("SystemFgDispatcher");

    /* renamed from: p */
    private Context f9267p;

    /* renamed from: q */
    private C2221r0 f9268q;

    /* renamed from: r */
    private final InterfaceC28696c f9269r;

    /* renamed from: s */
    final Object f9270s = new Object();

    /* renamed from: t */
    C26967n f9271t;

    /* renamed from: u */
    final Map f9272u;

    /* renamed from: v */
    final Map f9273v;

    /* renamed from: w */
    final Map f9274w;

    /* renamed from: x */
    final C25619e f9275x;

    /* renamed from: y */
    private b f9276y;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.work.impl.foreground.b$a */
    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: p */
        final /* synthetic */ String f9277p;

        a(String str) {
            this.f9277p = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C26976w m11765g = C2197b.this.f9268q.m11737t().m11765g(this.f9277p);
            if (m11765g != null && m11765g.m138980k()) {
                synchronized (C2197b.this.f9270s) {
                    C2197b.this.f9273v.put(AbstractC26979z.m139035a(m11765g), m11765g);
                    C2197b c2197b = C2197b.this;
                    C2197b.this.f9274w.put(AbstractC26979z.m139035a(m11765g), AbstractC25620f.m132310b(c2197b.f9275x, m11765g, c2197b.f9269r.mo143750b(), C2197b.this));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.work.impl.foreground.b$b */
    /* loaded from: classes2.dex */
    public interface b {
        /* renamed from: a */
        void mo11696a(int i11, Notification notification);

        /* renamed from: c */
        void mo11697c(int i11, int i12, Notification notification);

        /* renamed from: d */
        void mo11698d(int i11);

        void stop();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2197b(Context context) {
        this.f9267p = context;
        C2221r0 m11729r = C2221r0.m11729r(context);
        this.f9268q = m11729r;
        this.f9269r = m11729r.m11741x();
        this.f9271t = null;
        this.f9272u = new LinkedHashMap();
        this.f9274w = new HashMap();
        this.f9273v = new HashMap();
        this.f9275x = new C25619e(this.f9268q.m11739v());
        this.f9268q.m11737t().m11764e(this);
    }

    /* renamed from: d */
    public static Intent m11704d(Context context, C26967n c26967n, C2244l c2244l) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", c2244l.m11880c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", c2244l.m11878a());
        intent.putExtra("KEY_NOTIFICATION", c2244l.m11879b());
        intent.putExtra("KEY_WORKSPEC_ID", c26967n.m138955b());
        intent.putExtra("KEY_GENERATION", c26967n.m138954a());
        return intent;
    }

    /* renamed from: f */
    public static Intent m11705f(Context context, C26967n c26967n, C2244l c2244l) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", c26967n.m138955b());
        intent.putExtra("KEY_GENERATION", c26967n.m138954a());
        intent.putExtra("KEY_NOTIFICATION_ID", c2244l.m11880c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", c2244l.m11878a());
        intent.putExtra("KEY_NOTIFICATION", c2244l.m11879b());
        return intent;
    }

    /* renamed from: g */
    public static Intent m11706g(Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_STOP_FOREGROUND");
        return intent;
    }

    /* renamed from: h */
    private void m11707h(Intent intent) {
        AbstractC2253u.m11895e().mo11902f(f9266z, "Stopping foreground work for " + intent);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra != null && !TextUtils.isEmpty(stringExtra)) {
            this.f9268q.m11732m(UUID.fromString(stringExtra));
        }
    }

    /* renamed from: i */
    private void m11708i(Intent intent) {
        int i11 = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        C26967n c26967n = new C26967n(stringExtra, intent.getIntExtra("KEY_GENERATION", 0));
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        AbstractC2253u.m11895e().mo11898a(f9266z, "Notifying with (id:" + intExtra + ", workSpecId: " + stringExtra + ", notificationType :" + intExtra2 + ")");
        if (notification != null && this.f9276y != null) {
            this.f9272u.put(c26967n, new C2244l(intExtra, notification, intExtra2));
            if (this.f9271t == null) {
                this.f9271t = c26967n;
                this.f9276y.mo11697c(intExtra, intExtra2, notification);
                return;
            }
            this.f9276y.mo11696a(intExtra, notification);
            if (intExtra2 != 0 && Build.VERSION.SDK_INT >= 29) {
                Iterator it = this.f9272u.entrySet().iterator();
                while (it.hasNext()) {
                    i11 |= ((C2244l) ((Map.Entry) it.next()).getValue()).m11878a();
                }
                C2244l c2244l = (C2244l) this.f9272u.get(this.f9271t);
                if (c2244l != null) {
                    this.f9276y.mo11697c(c2244l.m11880c(), i11, c2244l.m11879b());
                }
            }
        }
    }

    /* renamed from: j */
    private void m11709j(Intent intent) {
        AbstractC2253u.m11895e().mo11902f(f9266z, "Started foreground service " + intent);
        this.f9269r.mo143752d(new a(intent.getStringExtra("KEY_WORKSPEC_ID")));
    }

    @Override // p470r2.InterfaceC25618d
    /* renamed from: b */
    public void mo11624b(C26976w c26976w, AbstractC25616b abstractC25616b) {
        if (abstractC25616b instanceof AbstractC25616b.b) {
            String str = c26976w.f127497a;
            AbstractC2253u.m11895e().mo11898a(f9266z, "Constraints unmet for WorkSpec " + str);
            this.f9268q.m11731B(AbstractC26979z.m139035a(c26976w));
        }
    }

    @Override // androidx.work.impl.InterfaceC2189f
    /* renamed from: e */
    public void mo11614e(C26967n c26967n, boolean z11) {
        Job job;
        Map.Entry entry;
        synchronized (this.f9270s) {
            try {
                if (((C26976w) this.f9273v.remove(c26967n)) != null) {
                    job = (Job) this.f9274w.remove(c26967n);
                } else {
                    job = null;
                }
                if (job != null) {
                    job.mo112734a(null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        C2244l c2244l = (C2244l) this.f9272u.remove(c26967n);
        if (c26967n.equals(this.f9271t)) {
            if (this.f9272u.size() > 0) {
                Iterator it = this.f9272u.entrySet().iterator();
                Object next = it.next();
                while (true) {
                    entry = (Map.Entry) next;
                    if (!it.hasNext()) {
                        break;
                    } else {
                        next = it.next();
                    }
                }
                this.f9271t = (C26967n) entry.getKey();
                if (this.f9276y != null) {
                    C2244l c2244l2 = (C2244l) entry.getValue();
                    this.f9276y.mo11697c(c2244l2.m11880c(), c2244l2.m11878a(), c2244l2.m11879b());
                    this.f9276y.mo11698d(c2244l2.m11880c());
                }
            } else {
                this.f9271t = null;
            }
        }
        b bVar = this.f9276y;
        if (c2244l != null && bVar != null) {
            AbstractC2253u.m11895e().mo11898a(f9266z, "Removing Notification (id: " + c2244l.m11880c() + ", workSpecId: " + c26967n + ", notificationType: " + c2244l.m11878a());
            bVar.mo11698d(c2244l.m11880c());
        }
    }

    /* renamed from: k */
    void m11710k(Intent intent) {
        AbstractC2253u.m11895e().mo11902f(f9266z, "Stopping foreground service");
        b bVar = this.f9276y;
        if (bVar != null) {
            bVar.stop();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public void m11711l() {
        this.f9276y = null;
        synchronized (this.f9270s) {
            try {
                Iterator it = this.f9274w.values().iterator();
                while (it.hasNext()) {
                    ((Job) it.next()).mo112734a(null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f9268q.m11737t().m11768p(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public void m11712m(Intent intent) {
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            m11709j(intent);
            m11708i(intent);
        } else if ("ACTION_NOTIFY".equals(action)) {
            m11708i(intent);
        } else if ("ACTION_CANCEL_WORK".equals(action)) {
            m11707h(intent);
        } else if ("ACTION_STOP_FOREGROUND".equals(action)) {
            m11710k(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public void m11713n(b bVar) {
        if (this.f9276y != null) {
            AbstractC2253u.m11895e().mo11900c(f9266z, "A callback already exists.");
        } else {
            this.f9276y = bVar;
        }
    }
}
