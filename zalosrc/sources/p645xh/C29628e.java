package p645xh;

import ae.C0766k;
import af0.AbstractC0777e;
import ag0.AbstractC0837p0;
import ag0.C0815e1;
import ag0.C0817f0;
import ag0.C0829l0;
import ag0.C0832n;
import am.AbstractC0924m0;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.zing.zalo.MainApplication;
import com.zing.zalo.connection.socket.workers.SocketConnectionHandlerWorker;
import com.zing.zalo.nativecommon.NetworkHelper;
import com.zing.zalo.p062db.C7962g;
import com.zing.zalo.receiver.KeepAliveSCReceiver;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import com.zing.zalocore.CoreUtility;
import com.zing.zalocore.connection.socket.AbstractC17522a;
import com.zing.zalocore.connection.socket.AbstractC17526e;
import com.zing.zalocore.connection.socket.NativeIPPort;
import com.zing.zalocore.connection.socket.RequestPacket;
import eg0.C18426a;
import gu.AbstractC19601a;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import im0.AbstractC20626a;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import me0.AbstractC23104j;
import me0.AbstractC23204s0;
import me0.C23055e5;
import mg.C23288a;
import mm0.AbstractC23350e;
import mm0.AbstractC23351f;
import nh0.InterfaceC23792b;
import org.json.JSONObject;
import p135em.C18489c;
import p173fz.C19172a;
import p248iy.AbstractC20886f;
import p248iy.AbstractC20887g;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p361nb.C23648e;
import p363nh.C23744a;
import p405ov.C24559a;
import p405ov.C24561c;
import p609wh.AbstractC28998a;
import p609wh.C29037t0;
import p681yh.C30981a;
import p716zh.C31832a;
import p716zh.C31986k3;
import p716zh.C32163w8;
import rw.AbstractHandlerC25981b;
import rw.C25982c;
import rw.C25983d;
import rw.C25984e;
import rw.C25985f;
import rw.InterfaceC25980a;
import s00.AbstractC26080o;
import vg.C28139n5;
import ws.C29210k;
import yd0.C30908a;

/* renamed from: xh.e */
/* loaded from: classes.dex */
public class C29628e extends AbstractC29624a {

    /* renamed from: P */
    private static int f136824P;

    /* renamed from: Q */
    private static volatile C29628e f136825Q;

    /* renamed from: A */
    public long f136826A;

    /* renamed from: B */
    boolean f136827B;

    /* renamed from: C */
    boolean f136828C;

    /* renamed from: D */
    private long f136829D;

    /* renamed from: E */
    private long f136830E;

    /* renamed from: F */
    private long f136831F;

    /* renamed from: G */
    private final AtomicLong f136832G;

    /* renamed from: H */
    private final AtomicBoolean f136833H;

    /* renamed from: I */
    private final AtomicBoolean f136834I;

    /* renamed from: J */
    private final AtomicBoolean f136835J;

    /* renamed from: K */
    private final InterfaceC23792b f136836K;

    /* renamed from: L */
    final InterfaceC25980a f136837L;

    /* renamed from: M */
    private String f136838M;

    /* renamed from: N */
    boolean f136839N;

    /* renamed from: O */
    public long f136840O;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: xh.e$a */
    /* loaded from: classes.dex */
    public class a extends C25982c {
        a(C25984e c25984e) {
            super(c25984e);
        }

        @Override // rw.C25982c
        /* renamed from: g */
        public void mo81139g(C25985f c25985f) {
            C29628e.this.m147259J0(c25985f.f123961a);
            super.mo81139g(c25985f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: xh.e$b */
    /* loaded from: classes3.dex */
    public class b extends AbstractHandlerC25981b {
        b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            C29628e.this.m147259J0(message.what);
            super.handleMessage(message);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: xh.e$c */
    /* loaded from: classes3.dex */
    public class c implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ C31832a f136843a;

        /* renamed from: b */
        final /* synthetic */ boolean f136844b;

        c(C31832a c31832a, boolean z11) {
            this.f136843a = c31832a;
            this.f136844b = z11;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            int i11;
            try {
                if (this.f136843a.m152946c()) {
                    if (this.f136844b) {
                        i11 = 10116;
                    } else {
                        i11 = 104;
                    }
                    C29628e.this.m147277f1(i11);
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: xh.e$d */
    /* loaded from: classes3.dex */
    public class d implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ C31832a f136846a;

        d(C31832a c31832a) {
            this.f136846a = c31832a;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                if (this.f136846a.m152946c()) {
                    C29628e.this.m147277f1(1996);
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: xh.e$e */
    /* loaded from: classes3.dex */
    public class e implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ C31832a f136848a;

        /* renamed from: b */
        final /* synthetic */ boolean f136849b;

        e(C31832a c31832a, boolean z11) {
            this.f136848a = c31832a;
            this.f136849b = z11;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            int i11;
            try {
                if (this.f136848a.m152946c()) {
                    C29628e c29628e = C29628e.this;
                    if (this.f136849b) {
                        i11 = 10216;
                    } else {
                        i11 = 212;
                    }
                    c29628e.m147277f1(i11);
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: xh.e$f */
    /* loaded from: classes3.dex */
    public class f implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ C31832a f136851a;

        f(C31832a c31832a) {
            this.f136851a = c31832a;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                if (this.f136851a.m152946c()) {
                    C29628e.this.m147277f1(213);
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
    }

    C29628e(InterfaceC23792b interfaceC23792b) {
        super(ZAbstractBase.ZVU_PROCESS_FLUSH);
        this.f136826A = 0L;
        this.f136827B = true;
        this.f136828C = false;
        this.f136829D = 0L;
        this.f136830E = 0L;
        this.f136831F = 0L;
        this.f136832G = new AtomicLong(0L);
        this.f136833H = new AtomicBoolean();
        this.f136834I = new AtomicBoolean();
        this.f136835J = new AtomicBoolean();
        this.f136838M = null;
        this.f136839N = false;
        this.f136840O = 0L;
        this.f136836K = interfaceC23792b;
        if (AbstractC23309i.m121717ah()) {
            C25983d c25983d = new C25983d("SocketConnection");
            c25983d.start();
            this.f136837L = new a(c25983d.m133836a());
        } else {
            HandlerThread handlerThread = new HandlerThread("Z:SocketConnection");
            handlerThread.start();
            this.f136837L = new b(handlerThread.getLooper());
        }
        AbstractC0777e.m1935a("socket");
        m147287p1(MainApplication.getAppContext(), 1000);
        AbstractC29633j.m147362k();
        AbstractC23351f.m122784a("Create SocketConnection", true);
    }

    /* renamed from: D0 */
    private boolean m147248D0() {
        if (m147261M0()) {
            return false;
        }
        if (m93434z()) {
            AbstractC29633j.m147363l();
            AbstractC17526e.m93369r0(C32163w8.m155135a().f148289b, C32163w8.m155135a().f148290c, 0L);
            AbstractC17526e.m93368q0(AbstractC23309i.m120937Ff(), AbstractC23309i.m121938gb(), AbstractC23309i.m120974Gf(), AbstractC23309i.m121976hb(), AbstractC23309i.m120900Ef(), AbstractC23309i.m121900fb());
            AbstractC17526e.m93370s0(AbstractC23309i.m121292P0(), AbstractC23309i.m121255O0());
            C28139n5.m141620j().m141635g();
            m93398Z(C28139n5.m141620j().m141637i(), C28139n5.m141620j().m141639l());
            C31986k3.f147083a.m154100M2();
        }
        m93428u0(C19172a.m100600k("network@is_send_connect_handshake_msg", 0));
        m147260L0();
        this.f136838M = null;
        AbstractC23351f.m122784a("Open Socket connection:  ---" + m93415m().m93159a() + ":" + m93415m().m93160b(), true);
        C30981a.m150598f().m150609l();
        super.m93409j(0);
        if (this.f89373e) {
            f136824P = 0;
            this.f136828C = false;
            this.f89377i = 0;
            this.f136830E = 0L;
            this.f136829D = System.currentTimeMillis();
            this.f136831F = this.f136836K.mo124319c();
            try {
                C23744a.m124114c().m124116d(4, new Object[0]);
                m147296y1();
                if (AbstractC23309i.m121668Z6() > 0) {
                    AbstractC23309i.m122589xr(0L);
                }
                C0829l0.m2173b();
            } catch (Exception e11) {
                AbstractC23350e.m122774d("SocketConnection", e11.toString());
            }
        } else if (!CoreUtility.f89235k.get()) {
            f136824P++;
            long m121371R5 = AbstractC23309i.m121371R5();
            long currentTimeMillis = System.currentTimeMillis();
            boolean m121330Q1 = AbstractC23309i.m121330Q1();
            long m121633Y8 = AbstractC23309i.m121633Y8();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("minDuration: ");
            sb2.append(m121633Y8);
            sb2.append(" isAutoCheck: ");
            sb2.append(m121330Q1);
            if (f136824P >= 3 && AbstractC28998a.m144875d() && m121330Q1 && currentTimeMillis - m121371R5 > m121633Y8) {
                ArrayList m147353b = AbstractC29633j.m147353b();
                ArrayList m147354c = AbstractC29633j.m147354c();
                String m147352a = AbstractC29633j.m147352a();
                NetworkHelper.m48302k().m48309f(AbstractC23204s0.m119555f(), Integer.parseInt(CoreUtility.f89233i), AbstractC20887g.m109224b(), String.valueOf(CoreUtility.f89236l));
                NetworkHelper.m48302k().m48313j();
                NetworkHelper.m48302k().m48308e(AbstractC20626a.m107390f());
                NetworkHelper.m48302k().m48307d(m147352a);
                NetworkHelper.m48302k().m48306c(m147354c);
                NetworkHelper.m48302k().m48305b(m147353b);
                f136824P = 0;
                AbstractC23309i.m122255oq(currentTimeMillis);
            }
        }
        return this.f89373e;
    }

    /* renamed from: E0 */
    public static synchronized C29628e m147249E0() {
        C29628e c29628e;
        synchronized (C29628e.class) {
            try {
                if (f136825Q == null) {
                    synchronized (C29628e.class) {
                        try {
                            if (f136825Q == null) {
                                f136825Q = new C29628e(AbstractC23306f.m120579F1());
                            }
                        } finally {
                        }
                    }
                }
                c29628e = f136825Q;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c29628e;
    }

    /* renamed from: K0 */
    public static boolean m147250K0() {
        return f136825Q != null;
    }

    /* renamed from: T0 */
    public static /* synthetic */ void m147251T0(long j11) {
        AbstractC23306f.m120587I0().m101509a(new C30908a.b(j11));
    }

    /* renamed from: U0 */
    public /* synthetic */ void m147252U0() {
        if (!this.f136839N) {
            try {
                try {
                    this.f136839N = true;
                    mo93411k();
                    m147290s1(MainApplication.getAppContext());
                    if (AbstractC23309i.m121601Xd()) {
                        m147288q1(MainApplication.getAppContext());
                    }
                    m147248D0();
                    if (this.f89373e) {
                        m93414l0();
                        m147296y1();
                        AbstractC23309i.m121215My(System.currentTimeMillis());
                    } else if (!m93374B()) {
                        boolean z11 = this.f89373e;
                        if (!z11 && this.f89377i >= 2) {
                            this.f136828C = true;
                            m147296y1();
                        } else if (!z11) {
                            this.f136828C = false;
                            this.f89377i++;
                        }
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("ConnectionListener- isConnected: ");
                    sb2.append(this.f89373e);
                } catch (Exception e11) {
                    AbstractC23350e.m122774d("SocketConnection", e11.toString());
                }
                this.f136839N = false;
                mo93416m0();
            } catch (Exception e12) {
                AbstractC23350e.m122774d("SocketConnection", e12.toString());
            }
        }
    }

    /* renamed from: a1 */
    private void m147253a1(long j11) {
        if (!AbstractC23306f.m120562A().m2528W()) {
            C23288a.f113033a.mo13474a(new C18426a(new Runnable() { // from class: xh.c

                /* renamed from: p */
                public final /* synthetic */ long f136822p;

                public /* synthetic */ RunnableC29626c(long j112) {
                    r1 = j112;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C29628e.m147251T0(r1);
                }
            }));
        } else if (!AbstractC0924m0.m3627Za()) {
            C0815e1.m2075D().m2100V(new C23648e(1, "", 1, "order_msg_migrated_before", new String[0]), false);
            AbstractC0924m0.m4026mk(true);
        }
    }

    /* renamed from: C0 */
    void m147254C0(int i11) {
        try {
            if (AbstractC23309i.m121906fh()) {
                Context appContext = MainApplication.getAppContext();
                Intent intent = new Intent(appContext, (Class<?>) KeepAliveSCReceiver.class);
                intent.setAction("com.zing.zalo.socketconnection.WAKEUPDEVICE");
                PendingIntent broadcast = PendingIntent.getBroadcast(appContext, 0, intent, AbstractC19601a.m102571a(134217728));
                AlarmManager alarmManager = (AlarmManager) appContext.getSystemService("alarm");
                Calendar calendar = Calendar.getInstance();
                calendar.add(14, i11);
                if (AbstractC23309i.m121601Xd()) {
                    if (Build.VERSION.SDK_INT >= 23 && i11 > 60000) {
                        if (!AbstractC23104j.m118480b(31)) {
                            alarmManager.setExactAndAllowWhileIdle(0, calendar.getTimeInMillis(), broadcast);
                        } else {
                            m147244z0(appContext, "com.zing.zalo.socketconnection.WAKEUPDEVICE", i11, SocketConnectionHandlerWorker.class, "SocketConnection");
                        }
                    } else if (i11 > 60000) {
                        alarmManager.setExact(0, calendar.getTimeInMillis(), broadcast);
                    } else {
                        alarmManager.set(0, calendar.getTimeInMillis(), broadcast);
                    }
                } else {
                    alarmManager.set(1, calendar.getTimeInMillis(), broadcast);
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122774d("SocketConnection", e11.toString());
        }
    }

    /* renamed from: F0 */
    public long m147255F0() {
        return this.f136831F;
    }

    /* renamed from: G0 */
    public String m147256G0() {
        return this.f136838M;
    }

    /* renamed from: H0 */
    public void m147257H0(Intent intent) {
        try {
            AbstractC20110a.m104535d("handleAction: %s", intent.getAction());
            this.f136840O = System.currentTimeMillis();
            if (intent.getAction().equals("com.zing.zalo.socketconnection.RECONNECT")) {
                ToastUtils.m89269q("Socket Connection ACTION_RECONNECT");
                AbstractC23351f.m122784a("Socket Connection ACTION_RECONNECT", true);
                m147274c1();
            } else if (intent.getAction().equals("com.zing.zalo.socketconnection.WAKEUPDEVICE")) {
                AbstractC23351f.m122784a("Socket Connection ACTION_WAKEUPDEVICE AFTER PING", true);
            } else if (intent.getAction().equals("com.zing.zalo.socketconnection.WAKEUPDEVICEOPENCONNECTION")) {
                m147297z1();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122774d("SocketConnection", e11.toString());
        }
    }

    /* renamed from: I0 */
    public void m147258I0() {
        if (!m93374B() && System.currentTimeMillis() - this.f136840O > 300000) {
            m147274c1();
        }
    }

    /* renamed from: J0 */
    public void m147259J0(int i11) {
        try {
            this.f136840O = System.currentTimeMillis();
            if (i11 == 0) {
                ToastUtils.m89269q("Socket Connection ACTION_RECONNECT");
                AbstractC23351f.m122784a("Socket Connection ACTION_RECONNECT", true);
                m147274c1();
            } else if (i11 == 4) {
                AbstractC23351f.m122784a("Socket Connection ACTION_WAKEUPDEVICE AFTER PING", true);
            } else if (i11 == 5 && AbstractC23309i.m121601Xd()) {
                if (m93433y()) {
                    m147288q1(MainApplication.getAppContext());
                }
                ToastUtils.m89269q("Socket Connection ACTION_WAKEUPDEVICE_OPEN_CONNECTION");
            }
        } catch (Exception e11) {
            AbstractC23350e.m122774d("SocketConnection", e11.toString());
        }
    }

    /* renamed from: L0 */
    void m147260L0() {
        if (m93434z()) {
            List<C18489c> m97848j = C18489c.m97848j(C7962g.c.a.COM);
            this.f89388t = new ArrayList(m97848j.size());
            for (C18489c c18489c : m97848j) {
                this.f89388t.add(new NativeIPPort(c18489c.m97856c(), c18489c.m97860l(), c18489c.m97858e(), c18489c.m97857d()));
            }
            return;
        }
        AbstractC20110a.m104539h(new Exception("Native Socket init fail"));
    }

    /* renamed from: M0 */
    public boolean m147261M0() {
        if (!m147262N0() && !m147263O0() && !m147264P0() && !m147265Q0()) {
            return false;
        }
        return true;
    }

    /* renamed from: N0 */
    public boolean m147262N0() {
        boolean z11;
        synchronized (this.f136832G) {
            z11 = this.f136833H.get();
        }
        return z11;
    }

    /* renamed from: O0 */
    public boolean m147263O0() {
        if (AbstractC23306f.m120676j().m128396M() && AbstractC23309i.m122085k8()) {
            return true;
        }
        return false;
    }

    /* renamed from: P0 */
    public boolean m147264P0() {
        boolean z11;
        synchronized (this.f136832G) {
            z11 = this.f136834I.get();
        }
        return z11;
    }

    /* renamed from: Q0 */
    public boolean m147265Q0() {
        boolean z11;
        synchronized (this.f136832G) {
            z11 = this.f136835J.get();
        }
        return z11;
    }

    /* renamed from: R0 */
    public boolean m147266R0() {
        return this.f136828C;
    }

    /* renamed from: S0 */
    public boolean m147267S0(int i11) {
        if (!m93374B() || (!this.f89373e && !this.f136828C)) {
            return false;
        }
        if (i11 == 113 || i11 == 201 || i11 == 207 || i11 == 10104 || i11 == 10207 || i11 == 10113 || i11 == 10114) {
            return true;
        }
        switch (i11) {
            case 101:
            case 102:
            case 103:
                return true;
            default:
                return false;
        }
    }

    /* renamed from: V0 */
    public void m147268V0() {
        synchronized (this.f136832G) {
            this.f136833H.set(true);
        }
        C29210k.m145804c0().m145827C0();
    }

    /* renamed from: W0 */
    public void m147269W0() {
        synchronized (this.f136832G) {
            try {
                if (AbstractC23306f.m120676j().m128396M()) {
                    AbstractC23309i.m121172Ls(true);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        C29210k.m145804c0().m145827C0();
    }

    /* renamed from: X0 */
    public void m147270X0() {
        synchronized (this.f136832G) {
            this.f136834I.set(true);
        }
        C29210k.m145804c0().m145827C0();
    }

    /* renamed from: Y0 */
    public void m147271Y0() {
        C24561c.m127942b("SocketConnection", "lockSocketFullStorage()");
        synchronized (this.f136832G) {
            this.f136835J.set(true);
        }
        mo93411k();
        C29210k.m145804c0().m145827C0();
    }

    /* renamed from: Z0 */
    public void m147272Z0() {
        if (!m93434z()) {
            return;
        }
        try {
            m147260L0();
            m93400b0();
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: b1 */
    void m147273b1() {
        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: xh.d
            public /* synthetic */ RunnableC29627d() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C29628e.this.m147252U0();
            }
        });
    }

    /* renamed from: c1 */
    public void m147274c1() {
        try {
            boolean m147355d = AbstractC29633j.m147355d();
            boolean z11 = this.f89373e;
            if (!z11 && !this.f89374f && m147355d) {
                if (C0832n.f2924f) {
                    C0832n.m2179i().m2185c();
                } else if (!this.f136839N && !m93374B()) {
                    m147273b1();
                }
            } else if (m147355d && z11) {
                m147296y1();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: d1 */
    public void m147275d1(C31832a c31832a, boolean z11) {
        int i11;
        int i12;
        try {
            if (!TextUtils.isEmpty(c31832a.m152945b())) {
                C0766k c0766k = new C0766k();
                c0766k.mo1704o8(new c(c31832a, z11));
                if (z11) {
                    i11 = 10114;
                } else {
                    i11 = 103;
                }
                if (z11) {
                    i12 = 0;
                } else {
                    i12 = 3;
                }
                c0766k.mo1584Ya(c31832a, i11, i12);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122774d("SocketConnection", e11.toString());
        }
    }

    @Override // p645xh.AbstractC29624a, com.zing.zalocore.connection.socket.AbstractC17526e
    /* renamed from: e0 */
    public void mo93403e0() {
        try {
            if (!C0832n.f2924f) {
                C0832n.f2924f = true;
                C0832n.m2179i().m2185c();
                mo93411k();
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: e1 */
    public void m147276e1(C31832a c31832a) {
        try {
            if (!TextUtils.isEmpty(c31832a.m152945b())) {
                C0766k c0766k = new C0766k();
                c0766k.mo1704o8(new d(c31832a));
                c0766k.mo1584Ya(c31832a, 108, 1);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122774d("SocketConnection", e11.toString());
        }
    }

    @Override // p645xh.AbstractC29624a, com.zing.zalocore.connection.socket.AbstractC17526e
    /* renamed from: f0 */
    public void mo93404f0() {
        try {
            C0832n.m2179i().m2190j();
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: f1 */
    public void m147277f1(int i11) {
        try {
            C29037t0 c29037t0 = new C29037t0(null);
            c29037t0.m110304b0(true);
            c29037t0.f103775r = 2;
            RequestPacket requestPacket = new RequestPacket();
            requestPacket.m93301w((byte) 1);
            requestPacket.m93302x((byte) 0);
            requestPacket.m93273D(Integer.parseInt(CoreUtility.f89233i));
            requestPacket.m93274E((byte) 3);
            requestPacket.m93295q((short) i11);
            requestPacket.m93275F((byte) 0);
            c29037t0.m110313i0(requestPacket);
            if (C23055e5.m118271f()) {
                C0829l0.m2174c(c29037t0);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122774d("SocketConnection", e11.toString());
        }
    }

    @Override // p645xh.AbstractC29624a, com.zing.zalocore.connection.socket.AbstractC17526e
    /* renamed from: g0 */
    public void mo93405g0() {
        try {
            C0832n.m2179i().m2196u();
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: g1 */
    public void m147278g1(C31832a c31832a, boolean z11) {
        int i11;
        int i12;
        try {
            if (!TextUtils.isEmpty(c31832a.m152945b())) {
                C0766k c0766k = new C0766k();
                c0766k.mo1704o8(new e(c31832a, z11));
                if (z11) {
                    i11 = 10214;
                } else {
                    i11 = 210;
                }
                if (z11) {
                    i12 = 0;
                } else {
                    i12 = 3;
                }
                c0766k.mo1584Ya(c31832a, i11, i12);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122774d("SocketConnection", e11.toString());
        }
    }

    @Override // p645xh.AbstractC29624a, com.zing.zalocore.connection.socket.AbstractC17526e
    /* renamed from: h0 */
    public void mo93406h0(int i11, String str) {
        super.mo93406h0(i11, str);
        if (this.f89373e) {
            this.f136828C = false;
        } else if (i11 == 4) {
            this.f136828C = true;
        }
    }

    /* renamed from: h1 */
    public void m147279h1(C31832a c31832a) {
        try {
            if (!TextUtils.isEmpty(c31832a.m152945b())) {
                C0766k c0766k = new C0766k();
                c0766k.mo1704o8(new f(c31832a));
                c0766k.mo1584Ya(c31832a, 211, 1);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122774d("SocketConnection", e11.toString());
        }
    }

    @Override // com.zing.zalocore.connection.socket.AbstractC17526e
    /* renamed from: i */
    public void mo93407i() {
        AbstractC29633j.m147362k();
        if (this.f136827B) {
            AbstractC29633j.m147364m();
            this.f136827B = false;
        }
    }

    @Override // com.zing.zalocore.connection.socket.AbstractC17526e
    /* renamed from: i0 */
    public void mo93408i0(RequestPacket requestPacket) {
        boolean z11;
        boolean z12;
        String str;
        long j11;
        byte[] bArr;
        if (requestPacket == null) {
            return;
        }
        try {
            if (requestPacket.m93286h() != null && requestPacket.m93286h().length > 0) {
                try {
                    bArr = AbstractC29633j.m147358g(requestPacket.m93286h());
                } catch (Exception e11) {
                    AbstractC20110a.m104539h(e11);
                    bArr = null;
                }
                if (bArr != null) {
                    requestPacket.m93303y(bArr);
                }
            }
            int i11 = 3;
            if ((requestPacket.m93284g() == 3 || requestPacket.m93284g() == 4) && requestPacket.m93278a() == 1) {
                if (requestPacket.m93289k() == 0) {
                    this.f89373e = true;
                    AbstractC23351f.m122784a("Authenticated", false);
                    C31986k3.f147083a.m154150y2();
                    try {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Json Config: ");
                        sb2.append(requestPacket.mo93287i());
                        JSONObject jSONObject = new JSONObject(requestPacket.mo93287i()).getJSONObject("data");
                        if (jSONObject.has("http_fail_over") && jSONObject.getBoolean("http_fail_over")) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (jSONObject.has("voip_alter_quality") && jSONObject.getBoolean("voip_alter_quality")) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (jSONObject.has("ip")) {
                            str = jSONObject.getString("ip");
                        } else {
                            str = "";
                        }
                        if (jSONObject.has("ts")) {
                            j11 = jSONObject.getLong("ts");
                        } else {
                            j11 = 0;
                        }
                        if (jSONObject.has("voip")) {
                            i11 = jSONObject.getInt("voip");
                        }
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("http_fail_over: ");
                        sb3.append(z11);
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("voip_alter_quality: ");
                        sb4.append(z12);
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append("configSupportCall: ");
                        sb5.append(i11);
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append("ipClient: ");
                        sb6.append(str);
                        this.f136838M = str;
                        C30981a.m150598f().m150608k();
                        C29210k.m145804c0().m145825B0();
                        AbstractC23351f.m122784a(String.format("Auth OK state(%d<-%d)", Integer.valueOf(this.f89379k), Integer.valueOf(this.f89378j)), true);
                        this.f89379k = this.f89378j;
                        if (this.f136836K.mo124313h(j11, f136825Q.f89385q)) {
                            m147253a1(j11);
                            C24559a.m127933c("[RenewTime]", "SocketConnection");
                        }
                        AbstractC23306f.m120655d2().m112080o();
                        AbstractC23309i.m121612Xo(z11);
                        AbstractC23309i.m121421Si(i11);
                        AbstractC23309i.m120993Gy(j11);
                        AbstractC23309i.m121763bp(str);
                        String str2 = "0.0.0.0";
                        if (!str.isEmpty()) {
                            try {
                                InetAddress byName = InetAddress.getByName(str);
                                if (byName instanceof Inet4Address) {
                                    str2 = "127.0.0.1";
                                } else if (byName instanceof Inet6Address) {
                                    str2 = "64:FF9B::127.0.0.1";
                                }
                            } catch (UnknownHostException unused) {
                            }
                        }
                        AbstractC20886f.m109208h(str2);
                        return;
                    } catch (Exception e12) {
                        AbstractC23350e.m122774d("SocketConnection", e12.toString());
                        return;
                    }
                }
                if (requestPacket.m93289k() == -1) {
                    C0832n.f2924f = true;
                    C0832n.m2179i().m2185c();
                    AbstractC23351f.m122784a("SESSION_EXPIRE", true);
                    mo93411k();
                    m93375C(requestPacket.m93289k());
                    return;
                }
                AbstractC23351f.m122784a("Auth failed with code: " + requestPacket.m93289k(), true);
                m93375C(requestPacket.m93289k());
            }
        } catch (Exception e13) {
            e13.printStackTrace();
        }
    }

    /* renamed from: i1 */
    public void m147280i1() {
        try {
            C29037t0 c29037t0 = new C29037t0(null);
            c29037t0.m110304b0(true);
            c29037t0.f103775r = 2;
            RequestPacket requestPacket = new RequestPacket();
            requestPacket.m93301w((byte) 1);
            requestPacket.m93302x((byte) 0);
            requestPacket.m93273D(Integer.parseInt(CoreUtility.f89233i));
            requestPacket.m93274E((byte) 3);
            requestPacket.m93295q((short) 602);
            requestPacket.m93275F((byte) 0);
            c29037t0.m110313i0(requestPacket);
            if (C23055e5.m118271f()) {
                C0829l0.m2174c(c29037t0);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122774d("SocketConnection", e11.toString());
        }
    }

    @Override // com.zing.zalocore.connection.socket.AbstractC17526e
    /* renamed from: j0 */
    public void mo93410j0(RequestPacket requestPacket) {
        C0817f0.m2134a(requestPacket);
    }

    /* renamed from: j1 */
    public void m147281j1(String str, int i11) {
        try {
            C29037t0 c29037t0 = new C29037t0(null);
            c29037t0.m110304b0(true);
            c29037t0.f103775r = 2;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(AbstractC17522a.m93344g(Integer.parseInt(str)));
            byteArrayOutputStream.write(i11);
            RequestPacket requestPacket = new RequestPacket();
            requestPacket.m93301w((byte) 1);
            requestPacket.m93302x((byte) 0);
            requestPacket.m93273D(Integer.parseInt(CoreUtility.f89233i));
            requestPacket.m93274E((byte) 3);
            requestPacket.m93295q((short) 245);
            requestPacket.m93275F((byte) 0);
            requestPacket.m93303y(byteArrayOutputStream.toByteArray());
            c29037t0.m110313i0(requestPacket);
            if (C23055e5.m118271f()) {
                C0829l0.m2174c(c29037t0);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122774d("SocketConnection", e11.toString());
        }
    }

    @Override // com.zing.zalocore.connection.socket.AbstractC17526e
    /* renamed from: k */
    public void mo93411k() {
        if (!this.f89373e && this.f89374f) {
            C30981a.m150598f().m150602a();
        }
        this.f136838M = null;
        super.mo93411k();
        this.f136830E = 0L;
        this.f136829D = 0L;
        this.f136831F = 0L;
        C30981a.m150598f().m150604c();
    }

    /* renamed from: k1 */
    public void m147282k1(int i11, int i12, long j11) {
        try {
            C29037t0 c29037t0 = new C29037t0(null);
            c29037t0.m110304b0(true);
            c29037t0.f103775r = 2;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(AbstractC17522a.m93346i(j11));
            byteArrayOutputStream.write(50);
            RequestPacket requestPacket = new RequestPacket();
            requestPacket.m93301w((byte) 1);
            requestPacket.m93302x((byte) 1);
            requestPacket.m93273D(Integer.parseInt(CoreUtility.f89233i));
            requestPacket.m93274E((byte) 3);
            requestPacket.m93295q((short) i11);
            requestPacket.m93275F((byte) i12);
            requestPacket.m93303y(byteArrayOutputStream.toByteArray());
            c29037t0.m110313i0(requestPacket);
            if (C23055e5.m118271f()) {
                C0829l0.m2174c(c29037t0);
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("requestMessageOffline cmd ");
            sb2.append(i11);
            sb2.append(" - sub ");
            sb2.append(i12);
        } catch (Exception e11) {
            AbstractC23350e.m122774d("SocketConnection", e11.toString());
        }
    }

    /* renamed from: l1 */
    public void m147283l1(ArrayList arrayList) {
        try {
            if (arrayList.size() > 0) {
                C29037t0 c29037t0 = new C29037t0(null);
                c29037t0.m110304b0(true);
                c29037t0.f103775r = 2;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    try {
                        byteArrayOutputStream.write(AbstractC17522a.m93346i(((Long) arrayList.get(i11)).longValue()));
                    } catch (IOException e11) {
                        AbstractC23350e.m122774d("SocketConnection", e11.toString());
                    } catch (NumberFormatException e12) {
                        AbstractC23350e.m122774d("SocketConnection", e12.toString());
                    }
                }
                RequestPacket requestPacket = new RequestPacket();
                requestPacket.m93301w((byte) 1);
                requestPacket.m93302x((byte) 0);
                requestPacket.m93273D(Integer.parseInt(CoreUtility.f89233i));
                requestPacket.m93274E((byte) 3);
                requestPacket.m93295q((short) 601);
                requestPacket.m93275F((byte) 0);
                requestPacket.m93303y(byteArrayOutputStream.toByteArray());
                c29037t0.m110313i0(requestPacket);
                if (C23055e5.m118271f()) {
                    C0829l0.m2174c(c29037t0);
                }
            }
        } catch (Exception e13) {
            AbstractC23350e.m122774d("SocketConnection", e13.toString());
        }
    }

    @Override // com.zing.zalocore.connection.socket.AbstractC17526e
    /* renamed from: m0 */
    public void mo93416m0() {
        try {
            if (C23055e5.m118271f() && !m93432x()) {
                m147287p1(MainApplication.getAppContext(), m93427u());
            } else {
                m147290s1(MainApplication.getAppContext());
            }
        } catch (Exception e11) {
            AbstractC23350e.m122774d("SocketConnection", e11.toString());
        }
    }

    /* renamed from: m1 */
    public void m147284m1(boolean z11, long j11, byte b11) {
        int i11;
        try {
            C29037t0 c29037t0 = new C29037t0(null);
            c29037t0.m110304b0(true);
            c29037t0.f103775r = 2;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(AbstractC17522a.m93346i(j11));
            RequestPacket requestPacket = new RequestPacket();
            requestPacket.m93301w((byte) 1);
            requestPacket.m93302x((byte) 0);
            requestPacket.m93273D(Integer.parseInt(CoreUtility.f89233i));
            requestPacket.m93274E((byte) 3);
            if (z11) {
                i11 = 10202;
            } else {
                i11 = 10117;
            }
            requestPacket.m93295q((short) i11);
            requestPacket.m93275F(b11);
            requestPacket.m93303y(byteArrayOutputStream.toByteArray());
            c29037t0.m110313i0(requestPacket);
            if (C23055e5.m118271f()) {
                C0829l0.m2174c(c29037t0);
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("requestOfflineE2eeInitSession CMD ");
            sb2.append(i11);
        } catch (Exception e11) {
            AbstractC23350e.m122774d("SocketConnection", e11.toString());
        }
    }

    /* renamed from: n1 */
    public void m147285n1(ArrayList arrayList) {
        try {
            if (arrayList.size() > 0) {
                this.f89383o = System.currentTimeMillis();
                C29037t0 c29037t0 = new C29037t0(null);
                c29037t0.m110304b0(true);
                c29037t0.f103775r = 2;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    try {
                        try {
                            byteArrayOutputStream.write(AbstractC17522a.m93346i(((Long) arrayList.get(i11)).longValue()));
                        } catch (IOException e11) {
                            AbstractC23350e.m122774d("SocketConnection", e11.toString());
                        }
                    } catch (NumberFormatException e12) {
                        AbstractC23350e.m122774d("SocketConnection", e12.toString());
                    }
                }
                RequestPacket requestPacket = new RequestPacket();
                requestPacket.m93301w((byte) 1);
                requestPacket.m93302x((byte) 1);
                requestPacket.m93273D(Integer.parseInt(CoreUtility.f89233i));
                requestPacket.m93274E((byte) 3);
                requestPacket.m93295q((short) 123);
                requestPacket.m93275F((byte) 0);
                requestPacket.m93303y(byteArrayOutputStream.toByteArray());
                c29037t0.m110313i0(requestPacket);
                if (C23055e5.m118271f()) {
                    C0829l0.m2174c(c29037t0);
                }
            }
        } catch (Exception e13) {
            AbstractC23350e.m122774d("SocketConnection", e13.toString());
        }
    }

    /* renamed from: o1 */
    public void m147286o1() {
        this.f89378j = -1;
        this.f89379k = -1;
    }

    /* renamed from: p1 */
    public void m147287p1(Context context, int i11) {
        if (m93374B()) {
            return;
        }
        try {
            AbstractC20110a.m104535d("scheduleReconnect: %d", Integer.valueOf(i11));
            m147290s1(context);
            if (AbstractC23309i.m121641Yg()) {
                this.f136837L.sendEmptyMessageDelayed(0, i11);
                m147254C0(i11);
            } else {
                Intent intent = new Intent(context, (Class<?>) KeepAliveSCReceiver.class);
                intent.setAction("com.zing.zalo.socketconnection.RECONNECT");
                PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, AbstractC19601a.m102572b(134217728));
                AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
                Calendar calendar = Calendar.getInstance();
                calendar.add(14, i11);
                if (AbstractC23309i.m121601Xd()) {
                    if (Build.VERSION.SDK_INT >= 23 && i11 > 60000) {
                        if (!AbstractC23104j.m118480b(31)) {
                            alarmManager.setExactAndAllowWhileIdle(0, calendar.getTimeInMillis(), broadcast);
                        } else {
                            m147244z0(context, "com.zing.zalo.socketconnection.RECONNECT", i11, SocketConnectionHandlerWorker.class, "SocketConnection");
                        }
                    } else if (i11 > 60000) {
                        alarmManager.setExact(0, calendar.getTimeInMillis(), broadcast);
                    } else {
                        alarmManager.set(0, calendar.getTimeInMillis(), broadcast);
                    }
                } else {
                    alarmManager.set(1, calendar.getTimeInMillis(), broadcast);
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122774d("SocketConnection", e11.toString());
        }
    }

    /* renamed from: q1 */
    public void m147288q1(Context context) {
        try {
            if (AbstractC23309i.m121641Yg()) {
                this.f136837L.sendEmptyMessageDelayed(5, 5000L);
                m147254C0(AbstractC26080o.a.f124275b);
            } else {
                Intent intent = new Intent(context, (Class<?>) KeepAliveSCReceiver.class);
                intent.setAction("com.zing.zalo.socketconnection.WAKEUPDEVICEOPENCONNECTION");
                PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, AbstractC19601a.m102572b(134217728));
                AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
                Calendar calendar = Calendar.getInstance();
                calendar.add(14, AbstractC26080o.a.f124275b);
                if (AbstractC23309i.m121601Xd()) {
                    alarmManager.set(0, calendar.getTimeInMillis(), broadcast);
                } else {
                    alarmManager.set(1, calendar.getTimeInMillis(), broadcast);
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122774d("SocketConnection", e11.toString());
        }
    }

    /* renamed from: r1 */
    public void m147289r1(List list) {
        try {
            C29037t0 c29037t0 = new C29037t0(null);
            c29037t0.m110304b0(true);
            c29037t0.f103775r = 2;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(AbstractC17522a.m93346i(AbstractC23306f.m120579F1().mo124314i()));
            byteArrayOutputStream.write(AbstractC17522a.m93345h(list.size()));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                byteArrayOutputStream.write(AbstractC17522a.m93344g(((Integer) it.next()).intValue()));
            }
            RequestPacket requestPacket = new RequestPacket();
            requestPacket.m93301w((byte) 2);
            requestPacket.m93302x((byte) 0);
            requestPacket.m93273D(Integer.parseInt(CoreUtility.f89233i));
            requestPacket.m93274E((byte) 3);
            requestPacket.m93297s(Integer.parseInt(CoreUtility.f89233i));
            requestPacket.m93298t((byte) 6);
            requestPacket.m93295q((short) 10218);
            requestPacket.m93275F((byte) 0);
            requestPacket.m93303y(byteArrayOutputStream.toByteArray());
            c29037t0.m110313i0(requestPacket);
            if (C23055e5.m118271f()) {
                C0829l0.m2174c(c29037t0);
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("E2EE sendEvictGroupSession CMD 10218 | groups:");
            sb2.append(list);
        } catch (Exception e11) {
            AbstractC23350e.m122774d("SocketConnection", e11.toString());
        }
    }

    /* renamed from: s1 */
    public void m147290s1(Context context) {
        if (AbstractC23309i.m121641Yg()) {
            this.f136837L.removeMessages(0);
            return;
        }
        Intent intent = new Intent(context, (Class<?>) KeepAliveSCReceiver.class);
        intent.setAction("com.zing.zalo.socketconnection.RECONNECT");
        ((AlarmManager) context.getSystemService("alarm")).cancel(PendingIntent.getBroadcast(context, 0, intent, AbstractC19601a.m102572b(134217728)));
    }

    /* renamed from: t1 */
    public void m147291t1() {
        m147292u1();
        m147293v1();
        m147295x1();
    }

    /* renamed from: u1 */
    public void m147292u1() {
        synchronized (this.f136832G) {
            this.f136833H.set(false);
        }
        if (!m147261M0()) {
            this.f136840O = 0L;
            C29210k.m145804c0().m145829D0();
        }
    }

    /* renamed from: v1 */
    public void m147293v1() {
        synchronized (this.f136832G) {
            AbstractC23309i.m121172Ls(false);
        }
        if (!m147261M0()) {
            this.f136840O = 0L;
            C29210k.m145804c0().m145829D0();
        }
    }

    /* renamed from: w1 */
    public void m147294w1() {
        synchronized (this.f136832G) {
            this.f136834I.set(false);
        }
        if (!m147261M0()) {
            this.f136840O = 0L;
            C29210k.m145804c0().m145829D0();
        }
    }

    /* renamed from: x1 */
    public void m147295x1() {
        synchronized (this.f136832G) {
            this.f136835J.set(false);
        }
        m147274c1();
        if (!m147261M0()) {
            this.f136840O = 0L;
            C29210k.m145804c0().m145829D0();
        }
    }

    @Override // p645xh.AbstractC29624a
    /* renamed from: y0 */
    public void mo147243y0(long j11, long j12) {
        AbstractC20110a.m104535d("lastNativePingTime startTime:%d, exeTime:%d", Long.valueOf(j11), Long.valueOf(j12));
        this.f136829D = j11;
        this.f136830E = j12;
        this.f136831F = this.f136836K.mo124319c();
    }

    /* renamed from: y1 */
    void m147296y1() {
        Intent intent = new Intent();
        intent.setAction("com.zing.zalo.ui.MAUpdateLayoutConnection");
        MainApplication.getAppContext().sendBroadcast(intent);
        C23744a.m124114c().m124116d(6071, new Object[0]);
    }

    /* renamed from: z1 */
    public void m147297z1() {
        if (AbstractC23309i.m121601Xd()) {
            if (m93433y()) {
                m147288q1(MainApplication.getAppContext());
            }
            ToastUtils.m89269q("Socket Connection ACTION_WAKEUPDEVICE_OPEN_CONNECTION");
        }
    }
}
