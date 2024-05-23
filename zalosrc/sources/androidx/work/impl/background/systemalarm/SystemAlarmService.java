package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import androidx.lifecycle.LifecycleService;
import androidx.work.AbstractC2253u;
import androidx.work.impl.background.systemalarm.C2165g;
import p565v2.AbstractC27441a0;

/* loaded from: classes2.dex */
public class SystemAlarmService extends LifecycleService implements C2165g.c {

    /* renamed from: s */
    private static final String f9166s = AbstractC2253u.m11897i("SystemAlarmService");

    /* renamed from: q */
    private C2165g f9167q;

    /* renamed from: r */
    private boolean f9168r;

    /* renamed from: e */
    private void m11591e() {
        C2165g c2165g = new C2165g(this);
        this.f9167q = c2165g;
        c2165g.m11638m(this);
    }

    @Override // androidx.work.impl.background.systemalarm.C2165g.c
    /* renamed from: b */
    public void mo11592b() {
        this.f9168r = true;
        AbstractC2253u.m11895e().mo11898a(f9166s, "All commands completed in dispatcher");
        AbstractC27441a0.m140464a();
        stopSelf();
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public void onCreate() {
        super.onCreate();
        m11591e();
        this.f9168r = false;
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f9168r = true;
        this.f9167q.m11637k();
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public int onStartCommand(Intent intent, int i11, int i12) {
        super.onStartCommand(intent, i11, i12);
        if (this.f9168r) {
            AbstractC2253u.m11895e().mo11902f(f9166s, "Re-initializing SystemAlarmDispatcher after a request to shut-down.");
            this.f9167q.m11637k();
            m11591e();
            this.f9168r = false;
        }
        if (intent != null) {
            this.f9167q.m11630a(intent, i12);
            return 3;
        }
        return 3;
    }
}
