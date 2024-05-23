package p597w4;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.cloudmessaging.C4069m;
import com.google.android.gms.cloudmessaging.zzd;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p342m6.AbstractC22888j;
import p342m6.AbstractC22894m;
import p342m6.C22890k;
import p342m6.InterfaceC22874c;
import p342m6.InterfaceC22878e;
import p342m6.InterfaceC22886i;
import p518t5.AbstractC26483a;
import p665y0.C30245g;

/* renamed from: w4.a */
/* loaded from: classes.dex */
public class C28723a {

    /* renamed from: h */
    private static int f133242h;

    /* renamed from: i */
    private static PendingIntent f133243i;

    /* renamed from: j */
    private static final Executor f133244j = new Executor() { // from class: w4.m
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            runnable.run();
        }
    };

    /* renamed from: k */
    private static final Pattern f133245k = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");

    /* renamed from: b */
    private final Context f133247b;

    /* renamed from: c */
    private final C28729g f133248c;

    /* renamed from: d */
    private final ScheduledExecutorService f133249d;

    /* renamed from: f */
    private Messenger f133251f;

    /* renamed from: g */
    private zzd f133252g;

    /* renamed from: a */
    private final C30245g f133246a = new C30245g();

    /* renamed from: e */
    private Messenger f133250e = new Messenger(new HandlerC28725c(this, Looper.getMainLooper()));

    public C28723a(Context context) {
        this.f133247b = context;
        this.f133248c = new C28729g(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f133249d = scheduledThreadPoolExecutor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static /* synthetic */ AbstractC22888j m143855b(Bundle bundle) {
        if (m143861j(bundle)) {
            return AbstractC22894m.m117604f(null);
        }
        return AbstractC22894m.m117604f(bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static /* bridge */ /* synthetic */ void m143856d(C28723a c28723a, Message message) {
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new C28726d());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof zzd) {
                        c28723a.f133252g = (zzd) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        c28723a.f133251f = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if (!"com.google.android.c2dm.intent.REGISTRATION".equals(action)) {
                    if (Log.isLoggable("Rpc", 3)) {
                        String valueOf = String.valueOf(action);
                        if (valueOf.length() != 0) {
                            "Unexpected response action: ".concat(valueOf);
                            return;
                        }
                        return;
                    }
                    return;
                }
                String stringExtra = intent2.getStringExtra("registration_id");
                if (stringExtra == null) {
                    stringExtra = intent2.getStringExtra("unregistered");
                }
                if (stringExtra == null) {
                    String stringExtra2 = intent2.getStringExtra(ZMediaPlayer.OnNativeInvokeListener.ARG_ERROR);
                    if (stringExtra2 == null) {
                        String valueOf2 = String.valueOf(intent2.getExtras());
                        StringBuilder sb2 = new StringBuilder(valueOf2.length() + 49);
                        sb2.append("Unexpected response, no error or registration id ");
                        sb2.append(valueOf2);
                        return;
                    }
                    if (Log.isLoggable("Rpc", 3) && stringExtra2.length() != 0) {
                        "Received InstanceID error ".concat(stringExtra2);
                    }
                    if (stringExtra2.startsWith("|")) {
                        String[] split = stringExtra2.split("\\|");
                        if (split.length > 2 && "ID".equals(split[1])) {
                            String str = split[2];
                            String str2 = split[3];
                            if (str2.startsWith(":")) {
                                str2 = str2.substring(1);
                            }
                            c28723a.m143860i(str, intent2.putExtra(ZMediaPlayer.OnNativeInvokeListener.ARG_ERROR, str2).getExtras());
                            return;
                        }
                        if (stringExtra2.length() != 0) {
                            "Unexpected structured response ".concat(stringExtra2);
                            return;
                        }
                        return;
                    }
                    synchronized (c28723a.f133246a) {
                        for (int i11 = 0; i11 < c28723a.f133246a.size(); i11++) {
                            try {
                                c28723a.m143860i((String) c28723a.f133246a.m149163i(i11), intent2.getExtras());
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                    return;
                }
                Matcher matcher = f133245k.matcher(stringExtra);
                if (!matcher.matches()) {
                    if (Log.isLoggable("Rpc", 3) && stringExtra.length() != 0) {
                        "Unexpected response string: ".concat(stringExtra);
                        return;
                    }
                    return;
                }
                String group = matcher.group(1);
                String group2 = matcher.group(2);
                if (group != null) {
                    Bundle extras = intent2.getExtras();
                    extras.putString("registration_id", group2);
                    c28723a.m143860i(group, extras);
                }
            }
        }
    }

    /* renamed from: f */
    private final AbstractC22888j m143857f(Bundle bundle) {
        final String m143858g = m143858g();
        final C22890k c22890k = new C22890k();
        synchronized (this.f133246a) {
            this.f133246a.put(m143858g, c22890k);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.f133248c.m143866b() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        m143859h(this.f133247b, intent);
        StringBuilder sb2 = new StringBuilder(String.valueOf(m143858g).length() + 5);
        sb2.append("|ID|");
        sb2.append(m143858g);
        sb2.append("|");
        intent.putExtra("kid", sb2.toString());
        if (Log.isLoggable("Rpc", 3)) {
            String valueOf = String.valueOf(intent.getExtras());
            StringBuilder sb3 = new StringBuilder(valueOf.length() + 8);
            sb3.append("Sending ");
            sb3.append(valueOf);
        }
        intent.putExtra("google.messenger", this.f133250e);
        if (this.f133251f != null || this.f133252g != null) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                Messenger messenger = this.f133251f;
                if (messenger != null) {
                    messenger.send(obtain);
                } else {
                    this.f133252g.m19182b(obtain);
                }
            } catch (RemoteException unused) {
            }
            final ScheduledFuture<?> schedule = this.f133249d.schedule(new Runnable() { // from class: w4.l
                @Override // java.lang.Runnable
                public final void run() {
                    C22890k.this.m117597d(new IOException("TIMEOUT"));
                }
            }, 30L, TimeUnit.SECONDS);
            c22890k.m117594a().mo117573b(f133244j, new InterfaceC22878e() { // from class: w4.j
                @Override // p342m6.InterfaceC22878e
                /* renamed from: a */
                public final void mo16804a(AbstractC22888j abstractC22888j) {
                    C28723a.this.m143864e(m143858g, schedule, abstractC22888j);
                }
            });
            return c22890k.m117594a();
        }
        if (this.f133248c.m143866b() == 2) {
            this.f133247b.sendBroadcast(intent);
        } else {
            this.f133247b.startService(intent);
        }
        final ScheduledFuture schedule2 = this.f133249d.schedule(new Runnable() { // from class: w4.l
            @Override // java.lang.Runnable
            public final void run() {
                C22890k.this.m117597d(new IOException("TIMEOUT"));
            }
        }, 30L, TimeUnit.SECONDS);
        c22890k.m117594a().mo117573b(f133244j, new InterfaceC22878e() { // from class: w4.j
            @Override // p342m6.InterfaceC22878e
            /* renamed from: a */
            public final void mo16804a(AbstractC22888j abstractC22888j) {
                C28723a.this.m143864e(m143858g, schedule2, abstractC22888j);
            }
        });
        return c22890k.m117594a();
    }

    /* renamed from: g */
    private static synchronized String m143858g() {
        String num;
        synchronized (C28723a.class) {
            int i11 = f133242h;
            f133242h = i11 + 1;
            num = Integer.toString(i11);
        }
        return num;
    }

    /* renamed from: h */
    private static synchronized void m143859h(Context context, Intent intent) {
        synchronized (C28723a.class) {
            try {
                if (f133243i == null) {
                    Intent intent2 = new Intent();
                    intent2.setPackage("com.google.example.invalidpackage");
                    f133243i = AbstractC26483a.m136450a(context, 0, intent2, AbstractC26483a.f125720a);
                }
                intent.putExtra("app", f133243i);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: i */
    private final void m143860i(String str, Bundle bundle) {
        synchronized (this.f133246a) {
            try {
                C22890k c22890k = (C22890k) this.f133246a.remove(str);
                if (c22890k == null) {
                    String valueOf = String.valueOf(str);
                    if (valueOf.length() != 0) {
                        "Missing callback for ".concat(valueOf);
                    }
                    return;
                }
                c22890k.m117596c(bundle);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: j */
    private static boolean m143861j(Bundle bundle) {
        if (bundle != null && bundle.containsKey("google.messenger")) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public AbstractC22888j m143862a(final Bundle bundle) {
        if (this.f133248c.m143865a() < 12000000) {
            if (this.f133248c.m143866b() != 0) {
                return m143857f(bundle).mo117581j(f133244j, new InterfaceC22874c() { // from class: w4.h
                    @Override // p342m6.InterfaceC22874c
                    /* renamed from: a */
                    public final Object mo27439a(AbstractC22888j abstractC22888j) {
                        return C28723a.this.m143863c(bundle, abstractC22888j);
                    }
                });
            }
            return AbstractC22894m.m117603e(new IOException("MISSING_INSTANCEID_SERVICE"));
        }
        return C4069m.m19175b(this.f133247b).m19180d(1, bundle).mo117579h(f133244j, new InterfaceC22874c() { // from class: w4.i
            @Override // p342m6.InterfaceC22874c
            /* renamed from: a */
            public final Object mo27439a(AbstractC22888j abstractC22888j) {
                if (abstractC22888j.mo117588q()) {
                    return (Bundle) abstractC22888j.mo117584m();
                }
                if (Log.isLoggable("Rpc", 3)) {
                    String valueOf = String.valueOf(abstractC22888j.mo117583l());
                    StringBuilder sb2 = new StringBuilder(valueOf.length() + 22);
                    sb2.append("Error making request: ");
                    sb2.append(valueOf);
                }
                throw new IOException("SERVICE_NOT_AVAILABLE", abstractC22888j.mo117583l());
            }
        });
    }

    /* renamed from: c */
    public final /* synthetic */ AbstractC22888j m143863c(Bundle bundle, AbstractC22888j abstractC22888j) {
        if (!abstractC22888j.mo117588q()) {
            return abstractC22888j;
        }
        if (!m143861j((Bundle) abstractC22888j.mo117584m())) {
            return abstractC22888j;
        }
        return m143857f(bundle).mo117589r(f133244j, new InterfaceC22886i() { // from class: w4.k
            @Override // p342m6.InterfaceC22886i
            /* renamed from: a */
            public final AbstractC22888j mo33968a(Object obj) {
                return C28723a.m143855b((Bundle) obj);
            }
        });
    }

    /* renamed from: e */
    public final /* synthetic */ void m143864e(String str, ScheduledFuture scheduledFuture, AbstractC22888j abstractC22888j) {
        synchronized (this.f133246a) {
            this.f133246a.remove(str);
        }
        scheduledFuture.cancel(false);
    }
}
