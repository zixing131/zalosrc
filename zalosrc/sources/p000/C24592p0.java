package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import com.zing.mp3.sdk.connection.model.MediaItemInternal;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* renamed from: p0 */
/* loaded from: classes2.dex */
public final class C24592p0 {

    /* renamed from: n */
    public static final long f118349n = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: o */
    public static C24592p0 f118350o;

    /* renamed from: a */
    public final InterfaceC24854k f118351a;

    /* renamed from: b */
    public final C0000a f118352b;

    /* renamed from: c */
    public C30227y f118353c;

    /* renamed from: d */
    public final C26910u f118354d;

    /* renamed from: e */
    public boolean f118355e;

    /* renamed from: f */
    public Runnable f118356f;

    /* renamed from: g */
    public final Runnable f118357g;

    /* renamed from: h */
    public final LinkedHashMap f118358h;

    /* renamed from: i */
    public boolean f118359i;

    /* renamed from: j */
    public boolean f118360j;

    /* renamed from: k */
    public Runnable f118361k;

    /* renamed from: l */
    public final LinkedHashMap f118362l;

    /* renamed from: m */
    public InterfaceC18494a f118363m;

    public C24592p0() {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(C19177g0.f95308q);
        this.f118351a = m129210a;
        this.f118352b = C0000a.f0a;
        this.f118354d = new C26910u(this);
        this.f118357g = new Runnable() { // from class: l0
            @Override // java.lang.Runnable
            public final void run() {
                C24592p0.m128070f(C24592p0.this);
            }
        };
        this.f118358h = new LinkedHashMap();
        this.f118360j = true;
        this.f118361k = new Runnable() { // from class: m0
            @Override // java.lang.Runnable
            public final void run() {
                C24592p0.m128074l();
            }
        };
        this.f118362l = new LinkedHashMap();
        this.f118363m = C18154e0.f91816q;
    }

    /* renamed from: a */
    public static final void m128068a() {
    }

    /* renamed from: e */
    public static void m128069e(Context context, Intent intent) {
        intent.setPackage("com.zing.mp3");
        intent.putExtra("packageName", context.getPackageName());
        AbstractC19074t.m100208f(context, "context");
        intent.putExtra("last_show_time_host_app", context.getSharedPreferences("mp3sdkdata", 0).getLong("lastShowTime", 0L));
        context.sendBroadcast(intent);
    }

    /* renamed from: f */
    public static final void m128070f(C24592p0 c24592p0) {
        AbstractC19074t.m100208f(c24592p0, "this$0");
        Iterator it = new HashMap(c24592p0.f118362l).entrySet().iterator();
        while (it.hasNext()) {
            InterfaceC3178c0 interfaceC3178c0 = (InterfaceC3178c0) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
            if (interfaceC3178c0 != null) {
                interfaceC3178c0.mo15972a();
            }
        }
    }

    /* renamed from: g */
    public static final void m128071g(C24592p0 c24592p0, Context context) {
        AbstractC19074t.m100208f(c24592p0, "this$0");
        AbstractC19074t.m100208f(context, "$context");
        Intent intent = new Intent("com.zing.mp3.sdk.protocol.HELLO");
        c24592p0.getClass();
        m128069e(context, intent);
        Runnable runnable = c24592p0.f118356f;
        if (runnable != null) {
            c24592p0.m128078i().postDelayed(runnable, 1000L);
        }
    }

    /* renamed from: h */
    public static final void m128072h(C24592p0 c24592p0, Intent intent, String str) {
        MediaItemInternal mediaItemInternal;
        String str2;
        c24592p0.getClass();
        if (AbstractC19074t.m100204b(str, "com.zing.mp3.action.STATE_CHANGED")) {
            boolean booleanExtra = intent.getBooleanExtra("playing", false);
            AbstractC17681d.f89682c = booleanExtra;
            Iterator it = c24592p0.f118362l.entrySet().iterator();
            while (it.hasNext()) {
                InterfaceC3178c0 interfaceC3178c0 = (InterfaceC3178c0) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
                if (interfaceC3178c0 != null) {
                    interfaceC3178c0.mo15974c(booleanExtra);
                }
            }
            return;
        }
        if (AbstractC19074t.m100204b(str, "com.zing.mp3.action.SONG_CHANGED")) {
            c24592p0.f118352b.getClass();
            AbstractC19074t.m100208f(intent, "intent");
            String stringExtra = intent.getStringExtra("id");
            String stringExtra2 = intent.getStringExtra("title");
            String stringExtra3 = intent.getStringExtra("artist");
            String stringExtra4 = intent.getStringExtra("artist_id");
            String stringExtra5 = intent.getStringExtra("album_id");
            String stringExtra6 = intent.getStringExtra("thumb");
            String stringExtra7 = intent.getStringExtra("link_share");
            String stringExtra8 = intent.getStringExtra("link_rbt");
            int intExtra = intent.getIntExtra(ZinstantMetaConstant.IMPRESSION_META_TYPE, 1);
            String str3 = null;
            if (stringExtra != null && stringExtra.length() != 0 && stringExtra2 != null && stringExtra2.length() != 0) {
                mediaItemInternal = new MediaItemInternal(stringExtra, stringExtra2, stringExtra3, stringExtra4, stringExtra5, stringExtra6, stringExtra7, stringExtra8, intExtra);
            } else {
                mediaItemInternal = null;
            }
            MediaItemInternal mediaItemInternal2 = AbstractC17681d.f89681b;
            if (mediaItemInternal2 != null) {
                str2 = mediaItemInternal2.f37579p;
            } else {
                str2 = null;
            }
            if (mediaItemInternal != null) {
                str3 = mediaItemInternal.f37579p;
            }
            if (!AbstractC19074t.m100204b(str2, str3)) {
                AbstractC17681d.f89681b = mediaItemInternal;
                Iterator it2 = new HashMap(c24592p0.f118362l).entrySet().iterator();
                while (it2.hasNext()) {
                    InterfaceC3178c0 interfaceC3178c02 = (InterfaceC3178c0) ((WeakReference) ((Map.Entry) it2.next()).getValue()).get();
                    if (interfaceC3178c02 != null) {
                        interfaceC3178c02.mo15975d(mediaItemInternal);
                    }
                    if (mediaItemInternal == null) {
                        c24592p0.f118359i = false;
                    }
                }
            }
        }
    }

    /* renamed from: k */
    public static final void m128073k(C24592p0 c24592p0, Context context) {
        AbstractC19074t.m100208f(c24592p0, "this$0");
        AbstractC19074t.m100208f(context, "$context");
        Intent intent = new Intent("com.zing.mp3.action.CONNECT");
        c24592p0.getClass();
        m128069e(context, intent);
        c24592p0.m128079j(context);
    }

    /* renamed from: l */
    public static final void m128074l() {
    }

    /* renamed from: b */
    public final void m128075b(int i11, Context context) {
        AbstractC19074t.m100208f(context, "context");
        this.f118362l.remove(Integer.valueOf(i11));
        if (!this.f118362l.isEmpty()) {
            return;
        }
        this.f118360j = true;
        m128078i().removeCallbacksAndMessages(null);
        try {
            C30227y c30227y = this.f118353c;
            if (c30227y != null) {
                context.unregisterReceiver(c30227y);
            }
        } catch (Exception unused) {
        }
        try {
            context.unregisterReceiver(this.f118354d);
        } catch (Exception unused2) {
        }
        m128069e(context, new Intent("com.zing.mp3.action.DISCONNECT"));
        m128078i().removeCallbacksAndMessages(null);
        this.f118358h.clear();
    }

    /* renamed from: c */
    public final void m128076c(int i11, final Context context, InterfaceC3178c0 interfaceC3178c0) {
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(interfaceC3178c0, "callback");
        boolean z11 = !this.f118359i;
        boolean isEmpty = this.f118362l.isEmpty();
        this.f118362l.put(Integer.valueOf(i11), new WeakReference(interfaceC3178c0));
        if (!this.f118360j) {
            return;
        }
        this.f118360j = false;
        try {
            context.unregisterReceiver(this.f118354d);
        } catch (Exception unused) {
        }
        try {
            BroadcastReceiver broadcastReceiver = this.f118353c;
            if (broadcastReceiver != null) {
                context.unregisterReceiver(broadcastReceiver);
            }
        } catch (Exception unused2) {
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.zing.mp3.action.CONNECTED");
        intentFilter.addAction("com.zing.mp3.sdk.protocol.HI");
        intentFilter.addAction("com.zing.mp3.action.DISCONNECTED");
        intentFilter.addAction("com.zing.mp3.action.HANDSHAKE");
        intentFilter.addAction("com.zing.mp3.action.DENIED");
        BroadcastReceiver broadcastReceiver2 = this.f118354d;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 33) {
            context.registerReceiver(broadcastReceiver2, intentFilter, 2);
        } else {
            context.registerReceiver(broadcastReceiver2, intentFilter);
        }
        C30227y c30227y = this.f118353c;
        if (c30227y == null) {
            c30227y = new C30227y(this);
            this.f118353c = c30227y;
        }
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addAction("com.zing.mp3.action.STATE_CHANGED");
        intentFilter2.addAction("com.zing.mp3.action.SONG_CHANGED");
        if (i12 >= 33) {
            context.registerReceiver(c30227y, intentFilter2, 2);
        } else {
            context.registerReceiver(c30227y, intentFilter2);
        }
        C20171i0 c20171i0 = new C20171i0(this, context, z11);
        this.f118363m = c20171i0;
        if (!this.f118355e) {
            m128069e(context, new Intent("com.zing.mp3.sdk.protocol.HELLO"));
            Runnable runnable = new Runnable() { // from class: o0
                @Override // java.lang.Runnable
                public final void run() {
                    C24592p0.m128071g(C24592p0.this, context);
                }
            };
            this.f118356f = runnable;
            m128078i().postDelayed(runnable, 1000L);
            m128078i().postDelayed(this.f118357g, 10000L);
            return;
        }
        if (isEmpty) {
            c20171i0.mo12V4();
        }
    }

    /* renamed from: d */
    public final void m128077d(Context context) {
        AbstractC19074t.m100208f(context, "context");
        Iterator it = new HashMap(this.f118362l).entrySet().iterator();
        while (it.hasNext()) {
            m128075b(((Number) ((Map.Entry) it.next()).getKey()).intValue(), context);
        }
        this.f118358h.clear();
        this.f118361k = new Runnable() { // from class: k0
            @Override // java.lang.Runnable
            public final void run() {
                C24592p0.m128068a();
            }
        };
        f118350o = null;
        AbstractC17681d.f89681b = null;
    }

    /* renamed from: i */
    public final Handler m128078i() {
        return (Handler) this.f118351a.getValue();
    }

    /* renamed from: j */
    public final void m128079j(final Context context) {
        m128078i().removeCallbacks(this.f118361k);
        this.f118361k = new Runnable() { // from class: n0
            @Override // java.lang.Runnable
            public final void run() {
                C24592p0.m128073k(C24592p0.this, context);
            }
        };
        m128078i().postDelayed(this.f118361k, f118349n);
    }
}
