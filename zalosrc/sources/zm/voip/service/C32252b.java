package zm.voip.service;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import au.AbstractC2351i;
import bp0.AbstractC3096i0;
import bp0.AbstractC3103o;
import ho0.AbstractC20110a;
import org.webrtc.Constants;

/* renamed from: zm.voip.service.b */
/* loaded from: classes7.dex */
public class C32252b {

    /* renamed from: d */
    static boolean f148832d = false;

    /* renamed from: a */
    volatile boolean f148833a;

    /* renamed from: b */
    volatile int f148834b = 0;

    /* renamed from: c */
    BroadcastReceiver f148835c = new a();

    /* renamed from: zm.voip.service.b$a */
    /* loaded from: classes7.dex */
    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            C32252b.this.f148834b = AbstractC32273e3.m155748Q().m155884h0(context, intent, C32252b.this.f148834b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zm.voip.service.b$b */
    /* loaded from: classes7.dex */
    public static class b {

        /* renamed from: a */
        public static final C32252b f148837a = new C32252b();
    }

    /* renamed from: e */
    public static C32252b m155705e() {
        return b.f148837a;
    }

    /* renamed from: f */
    private void m155706f() {
        if (!this.f148833a) {
            this.f148833a = true;
            try {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction(Constants.ACTION_CAMERA_OPENING);
                intentFilter.addAction(Constants.ACTION_CAMERA_FREEZE);
                intentFilter.addAction(Constants.ACTION_CAMERA_CLOSE);
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
                intentFilter.addAction("android.intent.action.SCREEN_ON");
                intentFilter.addAction("android.intent.action.USER_PRESENT");
                AbstractC2351i.m12327a(AbstractC3096i0.m15574y(), this.f148835c, intentFilter, true);
            } catch (Exception unused) {
                this.f148833a = false;
            }
        }
    }

    /* renamed from: i */
    private void m155707i() {
        if (this.f148833a) {
            try {
                if (AbstractC3096i0.m15574y() != null) {
                    AbstractC3096i0.m15574y().unregisterReceiver(this.f148835c);
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
        this.f148833a = false;
    }

    /* renamed from: a */
    public boolean m155708a() {
        return this.f148834b == 5;
    }

    /* renamed from: b */
    public boolean m155709b() {
        return this.f148834b == 4;
    }

    /* renamed from: c */
    public void m155710c() {
        m155707i();
        this.f148834b = 5;
    }

    /* renamed from: d */
    public void m155711d() {
        m155707i();
        this.f148834b = 5;
    }

    /* renamed from: g */
    public void m155712g() {
        boolean z11;
        KeyguardManager keyguardManager = (KeyguardManager) AbstractC3096i0.m15574y().getSystemService("keyguard");
        if (keyguardManager != null && (!AbstractC3103o.m15619h(28) ? !keyguardManager.inKeyguardRestrictedInputMode() : !keyguardManager.isKeyguardLocked())) {
            z11 = true;
        } else {
            z11 = false;
        }
        f148832d = z11;
        m155706f();
    }

    /* renamed from: h */
    public void m155713h() {
        m155706f();
    }
}
