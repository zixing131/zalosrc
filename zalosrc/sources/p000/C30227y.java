package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import fn0.AbstractC19074t;
import java.util.LinkedHashMap;

/* renamed from: y */
/* loaded from: classes2.dex */
public final class C30227y extends BroadcastReceiver {

    /* renamed from: a */
    public final /* synthetic */ C24592p0 f140406a;

    public C30227y(C24592p0 c24592p0) {
        this.f140406a = c24592p0;
    }

    /* renamed from: a */
    public static final void m149043a(C24592p0 c24592p0, Intent intent, String str) {
        AbstractC19074t.m100208f(c24592p0, "$this_run");
        AbstractC19074t.m100208f(intent, "$intent");
        AbstractC19074t.m100208f(str, "$action");
        C24592p0.m128072h(c24592p0, intent, str);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(intent, "intent");
        intent.getAction();
        String action = intent.getAction();
        if (action == null) {
            return;
        }
        Runnable runnable = (Runnable) this.f140406a.f118358h.get(action);
        if (runnable != null) {
            this.f140406a.m128078i().removeCallbacks(runnable);
        }
        C24592p0 c24592p0 = this.f140406a;
        LinkedHashMap linkedHashMap = c24592p0.f118358h;
        RunnableC20895j0 runnableC20895j0 = new Runnable() { // from class: j0

            /* renamed from: q */
            public final /* synthetic */ Intent f102691q;

            /* renamed from: r */
            public final /* synthetic */ String f102692r;

            public /* synthetic */ RunnableC20895j0(Intent intent2, String action2) {
                r2 = intent2;
                r3 = action2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C30227y.m149043a(C24592p0.this, r2, r3);
            }
        };
        this.f140406a.m128078i().postDelayed(runnableC20895j0, 500L);
        linkedHashMap.put(action2, runnableC20895j0);
    }
}
