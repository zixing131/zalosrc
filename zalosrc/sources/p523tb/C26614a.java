package p523tb;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.SystemClock;
import au.AbstractC2351i;
import com.zing.zalo.actionlog.receiver.ActionLogReceiver;
import gu.AbstractC19601a;
import ho0.AbstractC20110a;
import p361nb.AbstractC23647d;
import p442qb.AbstractC25211a;

/* renamed from: tb.a */
/* loaded from: classes.dex */
public class C26614a {

    /* renamed from: e */
    private static volatile C26614a f126023e;

    /* renamed from: a */
    private AlarmManager f126024a;

    /* renamed from: b */
    private PendingIntent f126025b;

    /* renamed from: c */
    private Context f126026c;

    /* renamed from: d */
    private ActionLogReceiver f126027d;

    public C26614a(Context context) {
        this.f126026c = context;
        this.f126024a = (AlarmManager) context.getSystemService("alarm");
        ActionLogReceiver actionLogReceiver = new ActionLogReceiver();
        this.f126027d = actionLogReceiver;
        AbstractC2351i.m12327a(context, actionLogReceiver, new IntentFilter("com.zing.zalo.actionlog"), true);
        this.f126025b = PendingIntent.getBroadcast(context, 0, new Intent("com.zing.zalo.actionlog"), AbstractC19601a.m102571a(0));
    }

    /* renamed from: c */
    public static C26614a m136643c(Context context) {
        if (f126023e == null) {
            synchronized (C26614a.class) {
                try {
                    if (f126023e == null) {
                        f126023e = new C26614a(context);
                    }
                } finally {
                }
            }
        }
        return f126023e;
    }

    /* renamed from: a */
    public void m136644a() {
        try {
            ActionLogReceiver actionLogReceiver = this.f126027d;
            if (actionLogReceiver != null) {
                this.f126026c.unregisterReceiver(actionLogReceiver);
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: b */
    public void m136645b() {
        this.f126026c.sendBroadcast(new Intent("com.zing.zalo.actionlog"));
    }

    /* renamed from: d */
    public void m136646d(long j11) {
        try {
            if (AbstractC23647d.f114547a == 0) {
                this.f126024a.cancel(this.f126025b);
            } else {
                this.f126024a.set(3, SystemClock.elapsedRealtime() + j11, this.f126025b);
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: e */
    public void m136647e() {
        try {
            if (AbstractC23647d.f114547a == 0) {
                this.f126024a.cancel(this.f126025b);
                return;
            }
            long m130466a = AbstractC25211a.m130466a(this.f126026c);
            if (m130466a == 0) {
                m130466a = System.currentTimeMillis();
                AbstractC25211a.m130475j(m130466a);
            }
            long currentTimeMillis = (AbstractC23647d.f114553g + m130466a) - System.currentTimeMillis();
            if (currentTimeMillis <= 0) {
                m136645b();
            } else {
                this.f126024a.set(3, SystemClock.elapsedRealtime() + currentTimeMillis, this.f126025b);
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }
}
