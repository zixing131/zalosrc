package p512t;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.Iterator;
import p467r.C25589l;

/* renamed from: t.b */
/* loaded from: classes2.dex */
public class C26436b {

    /* renamed from: f */
    private static C26436b f125607f = new C26436b();

    /* renamed from: a */
    private Context f125608a;

    /* renamed from: b */
    private BroadcastReceiver f125609b;

    /* renamed from: c */
    private boolean f125610c;

    /* renamed from: d */
    private boolean f125611d;

    /* renamed from: e */
    private b f125612e;

    /* renamed from: t.b$a */
    /* loaded from: classes2.dex */
    public class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            C26436b c26436b;
            boolean z11;
            KeyguardManager keyguardManager;
            if (intent == null) {
                return;
            }
            if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                c26436b = C26436b.this;
                z11 = true;
            } else {
                if (!"android.intent.action.USER_PRESENT".equals(intent.getAction()) && (!"android.intent.action.SCREEN_ON".equals(intent.getAction()) || (keyguardManager = (KeyguardManager) context.getSystemService("keyguard")) == null || keyguardManager.inKeyguardRestrictedInputMode())) {
                    return;
                }
                c26436b = C26436b.this;
                z11 = false;
            }
            c26436b.m136280e(z11);
        }
    }

    /* renamed from: t.b$b */
    /* loaded from: classes2.dex */
    public interface b {
        /* renamed from: c */
        void mo136289c(boolean z11);
    }

    private C26436b() {
    }

    /* renamed from: a */
    public static C26436b m136278a() {
        return f125607f;
    }

    /* renamed from: e */
    public void m136280e(boolean z11) {
        if (this.f125611d != z11) {
            this.f125611d = z11;
            if (this.f125610c) {
                m136283k();
                b bVar = this.f125612e;
                if (bVar != null) {
                    bVar.mo136289c(m136288h());
                }
            }
        }
    }

    /* renamed from: i */
    private void m136281i() {
        this.f125609b = new a();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        this.f125608a.registerReceiver(this.f125609b, intentFilter);
    }

    /* renamed from: j */
    private void m136282j() {
        BroadcastReceiver broadcastReceiver;
        Context context = this.f125608a;
        if (context == null || (broadcastReceiver = this.f125609b) == null) {
            return;
        }
        context.unregisterReceiver(broadcastReceiver);
        this.f125609b = null;
    }

    /* renamed from: k */
    private void m136283k() {
        boolean z11 = !this.f125611d;
        Iterator it = C26435a.m136271a().m136273c().iterator();
        while (it.hasNext()) {
            ((C25589l) it.next()).m132176u().m146286m(z11);
        }
    }

    /* renamed from: b */
    public void m136284b(Context context) {
        this.f125608a = context.getApplicationContext();
    }

    /* renamed from: c */
    public void m136285c(b bVar) {
        this.f125612e = bVar;
    }

    /* renamed from: f */
    public void m136286f() {
        m136281i();
        this.f125610c = true;
        m136283k();
    }

    /* renamed from: g */
    public void m136287g() {
        m136282j();
        this.f125610c = false;
        this.f125611d = false;
        this.f125612e = null;
    }

    /* renamed from: h */
    public boolean m136288h() {
        return !this.f125611d;
    }
}
