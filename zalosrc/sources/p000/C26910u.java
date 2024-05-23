package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import fn0.AbstractC19074t;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: u */
/* loaded from: classes2.dex */
public final class C26910u extends BroadcastReceiver {

    /* renamed from: a */
    public final /* synthetic */ C24592p0 f127353a;

    public C26910u(C24592p0 c24592p0) {
        this.f127353a = c24592p0;
    }

    /* renamed from: a */
    public static final void m138716a(C24592p0 c24592p0, Intent intent, String str) {
        AbstractC19074t.m100208f(c24592p0, "this$0");
        AbstractC19074t.m100208f(intent, "$intent");
        AbstractC19074t.m100207e(str, "subAction");
        C24592p0.m128072h(c24592p0, intent, str);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action;
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(intent, "intent");
        if (this.f127353a.f118360j || (action = intent.getAction()) == null) {
            return;
        }
        switch (action.hashCode()) {
            case -1474016900:
                if (action.equals("com.zing.mp3.action.DISCONNECTED")) {
                    this.f127353a.m128078i().removeCallbacks(this.f127353a.f118361k);
                    return;
                }
                return;
            case -152442980:
                if (action.equals("com.zing.mp3.action.DENIED")) {
                    C24592p0 c24592p0 = this.f127353a;
                    Iterator it = new HashMap(c24592p0.f118362l).entrySet().iterator();
                    while (it.hasNext()) {
                        InterfaceC3178c0 interfaceC3178c0 = (InterfaceC3178c0) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
                        if (interfaceC3178c0 != null) {
                            interfaceC3178c0.mo15975d(null);
                        }
                        c24592p0.f118359i = false;
                    }
                    return;
                }
                return;
            case 550502216:
                if (action.equals("com.zing.mp3.action.CONNECTED")) {
                    C24592p0 c24592p02 = this.f127353a;
                    if (!c24592p02.f118359i) {
                        c24592p02.f118359i = true;
                        AbstractC19074t.m100208f(context, "context");
                        context.getSharedPreferences("mp3sdkdata", 0).edit().putLong("lastShowTime", System.currentTimeMillis()).apply();
                        Iterator it2 = this.f127353a.f118362l.entrySet().iterator();
                        while (it2.hasNext()) {
                            InterfaceC3178c0 interfaceC3178c02 = (InterfaceC3178c0) ((WeakReference) ((Map.Entry) it2.next()).getValue()).get();
                            if (interfaceC3178c02 != null) {
                                interfaceC3178c02.mo15973b();
                            }
                        }
                    }
                    this.f127353a.m128079j(context);
                    ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("actions");
                    if (stringArrayListExtra != null) {
                        C24592p0 c24592p03 = this.f127353a;
                        for (String str : stringArrayListExtra) {
                            Runnable runnable = (Runnable) c24592p03.f118358h.get(str);
                            if (runnable != null) {
                                c24592p03.m128078i().removeCallbacks(runnable);
                            }
                            LinkedHashMap linkedHashMap = c24592p03.f118358h;
                            AbstractC19074t.m100207e(str, "subAction");
                            RunnableC18682f0 runnableC18682f0 = new Runnable() { // from class: f0

                                /* renamed from: q */
                                public final /* synthetic */ Intent f93905q;

                                /* renamed from: r */
                                public final /* synthetic */ String f93906r;

                                public /* synthetic */ RunnableC18682f0(Intent intent2, String str2) {
                                    r2 = intent2;
                                    r3 = str2;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    C26910u.m138716a(C24592p0.this, r2, r3);
                                }
                            };
                            c24592p03.m128078i().postDelayed(runnableC18682f0, 500L);
                            linkedHashMap.put(str2, runnableC18682f0);
                        }
                        return;
                    }
                    return;
                }
                return;
            case 1200392246:
                if (action.equals("com.zing.mp3.action.HANDSHAKE")) {
                    C24592p0 c24592p04 = this.f127353a;
                    Intent intent2 = new Intent("com.zing.mp3.action.CONNECT");
                    c24592p04.getClass();
                    C24592p0.m128069e(context, intent2);
                    return;
                }
                return;
            case 1211422572:
                if (action.equals("com.zing.mp3.sdk.protocol.HI")) {
                    C24592p0 c24592p05 = this.f127353a;
                    if (c24592p05.f118355e) {
                        return;
                    }
                    c24592p05.f118355e = true;
                    Runnable runnable2 = c24592p05.f118356f;
                    if (runnable2 != null) {
                        c24592p05.m128078i().removeCallbacks(runnable2);
                    }
                    this.f127353a.m128078i().removeCallbacks(this.f127353a.f118357g);
                    this.f127353a.f118363m.mo12V4();
                    return;
                }
                return;
            default:
                return;
        }
    }
}
