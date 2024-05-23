package p645xh;

import ag0.AbstractC0818g;
import ag0.AbstractC0837p0;
import ag0.C0821h0;
import ag0.C0832n;
import ag0.C0851w0;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.zing.zalo.MainApplication;
import com.zing.zalo.connection.socket.workers.SocketUploadVideoConnectionHandlerWorker;
import com.zing.zalo.p062db.C7962g;
import com.zing.zalo.receiver.KeepAliveSCUploadVideoReceiver;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import com.zing.zalocore.connection.socket.NativeIPPort;
import com.zing.zalocore.connection.socket.RequestPacket;
import gu.AbstractC19601a;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import me0.AbstractC23104j;
import me0.C23055e5;
import mm0.AbstractC23349d;
import mm0.AbstractC23350e;
import mm0.AbstractC23351f;
import p135em.C18489c;
import p348mi.AbstractC23309i;
import p363nh.C23744a;
import rw.AbstractHandlerC25981b;
import rw.C25982c;
import rw.C25983d;
import rw.C25984e;
import rw.C25985f;
import rw.InterfaceC25980a;

/* renamed from: xh.i */
/* loaded from: classes.dex */
public class C29632i extends AbstractC29624a {

    /* renamed from: F */
    static volatile C29632i f136865F = null;

    /* renamed from: G */
    public static int f136866G = 0;

    /* renamed from: H */
    static int f136867H = 10000;

    /* renamed from: A */
    long f136868A;

    /* renamed from: B */
    final InterfaceC25980a f136869B;

    /* renamed from: C */
    boolean f136870C;

    /* renamed from: D */
    boolean f136871D;

    /* renamed from: E */
    public long f136872E;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: xh.i$a */
    /* loaded from: classes.dex */
    public class a extends C25982c {
        a(C25984e c25984e) {
            super(c25984e);
        }

        @Override // rw.C25982c
        /* renamed from: g */
        public void mo81139g(C25985f c25985f) {
            C29632i.this.m147335I0(c25985f.f123961a);
            super.mo81139g(c25985f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: xh.i$b */
    /* loaded from: classes3.dex */
    public class b extends AbstractHandlerC25981b {
        b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            C29632i.this.m147335I0(message.what);
            super.handleMessage(message);
        }
    }

    C29632i() {
        super(ZAbstractBase.ZVU_PROCESS_VIDEO_TO_WEBP);
        this.f136868A = 0L;
        this.f136870C = true;
        this.f136871D = false;
        this.f136872E = 0L;
        if (AbstractC23309i.m121717ah()) {
            C25983d c25983d = new C25983d("SocketUploadVideoConnection");
            c25983d.start();
            this.f136869B = new a(c25983d.m133836a());
        } else {
            HandlerThread handlerThread = new HandlerThread("Z:SocketUploadVideoConnection");
            handlerThread.start();
            this.f136869B = new b(handlerThread.getLooper());
        }
    }

    /* renamed from: E0 */
    public static synchronized C29632i m147326E0() {
        C29632i c29632i;
        synchronized (C29632i.class) {
            try {
                if (f136865F == null) {
                    synchronized (C29632i.class) {
                        try {
                            if (f136865F == null) {
                                f136865F = new C29632i();
                            }
                        } finally {
                        }
                    }
                }
                c29632i = f136865F;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c29632i;
    }

    /* renamed from: J0 */
    public static boolean m147327J0() {
        return f136865F != null;
    }

    /* renamed from: M0 */
    public /* synthetic */ void m147328M0() {
        if (!this.f136871D) {
            try {
                try {
                    this.f136871D = true;
                    mo93411k();
                    m147350Z0(MainApplication.getAppContext());
                    m147331D0();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("ConnectionUploadVideo- isConnected: ");
                    sb2.append(this.f89373e);
                    if (this.f89373e) {
                        m93414l0();
                    }
                } catch (Exception e11) {
                    AbstractC23350e.m122774d("SocketUploadVideoConnection", e11.toString());
                }
                this.f136871D = false;
                mo93416m0();
            } catch (Exception e12) {
                AbstractC23350e.m122774d("SocketUploadVideoConnection", e12.toString());
            }
        }
    }

    /* renamed from: B0 */
    void m147329B0(int i11) {
        try {
            if (AbstractC23309i.m121906fh()) {
                Context appContext = MainApplication.getAppContext();
                Intent intent = new Intent(appContext, (Class<?>) KeepAliveSCUploadVideoReceiver.class);
                intent.setAction("com.zing.zalo.socketuploadvideo.WAKEUPDEVICE");
                PendingIntent broadcast = PendingIntent.getBroadcast(appContext, 0, intent, AbstractC19601a.m102572b(134217728));
                AlarmManager alarmManager = (AlarmManager) appContext.getSystemService("alarm");
                Calendar calendar = Calendar.getInstance();
                calendar.add(14, i11);
                if (AbstractC23309i.m121601Xd()) {
                    if (Build.VERSION.SDK_INT >= 23 && i11 > 60000) {
                        if (!AbstractC23104j.m118480b(31)) {
                            alarmManager.setExactAndAllowWhileIdle(0, calendar.getTimeInMillis(), broadcast);
                        } else {
                            m147244z0(appContext, "com.zing.zalo.socketuploadvideo.WAKEUPDEVICE", i11, SocketUploadVideoConnectionHandlerWorker.class, "SocketUploadVideoConnection");
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
            AbstractC23350e.m122774d("SocketUploadVideoConnection", e11.toString());
        }
    }

    /* renamed from: C0 */
    void m147330C0(Context context) {
        if (AbstractC23309i.m121641Yg()) {
            this.f136869B.removeMessages(5);
            return;
        }
        Intent intent = new Intent(context, (Class<?>) KeepAliveSCUploadVideoReceiver.class);
        intent.setAction("com.zing.zalo.socketuploadvideo.WAKEUPDEVICE_UPLOAD");
        ((AlarmManager) context.getSystemService("alarm")).cancel(PendingIntent.getBroadcast(context, 0, intent, AbstractC19601a.m102572b(134217728)));
    }

    /* renamed from: D0 */
    boolean m147331D0() {
        m147336K0();
        super.m93409j(0);
        if (this.f89373e) {
            C23744a.m124114c().m124116d(4, new Object[0]);
            C0851w0.m2321a();
        }
        return this.f89373e;
    }

    /* renamed from: F0 */
    public long m147332F0() {
        return this.f136868A;
    }

    /* renamed from: G0 */
    public void m147333G0(Intent intent) {
        try {
            this.f136872E = System.currentTimeMillis();
            if (intent.getAction().equals("com.zing.zalo.socketuploadvideo.RECONNECT")) {
                m147340P0();
            } else if (intent.getAction().equals("com.zing.zalo.socketuploadvideo.WAKEUPDEVICE")) {
                AbstractC23351f.m122784a("Socket Upload Video ACTION_WAKEUPDEVICE AFTER PING", true);
            } else if (intent.getAction().equals("com.zing.zalo.socketuploadvideo.WAKEUPDEVICE_UPLOAD")) {
                m147351a1();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122774d("SocketUploadVideoConnection", e11.toString());
        }
    }

    /* renamed from: H0 */
    public void m147334H0() {
        if (!m93374B() && System.currentTimeMillis() - this.f136872E > 300000 && m147337L0()) {
            m147340P0();
        }
    }

    /* renamed from: I0 */
    public void m147335I0(int i11) {
        try {
            this.f136872E = System.currentTimeMillis();
            if (i11 == 0) {
                m147340P0();
            } else if (i11 == 4) {
                AbstractC23351f.m122784a("Socket Upload video ACTION_WAKEUPDEVICE AFTER PING", true);
            } else if (i11 == 5) {
                f136866G++;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("ACTION_WAKEUPDEVICE_TO_UPLOAD: #");
                sb2.append(f136866G);
                if (f136866G < 5 && m147338N0(MainApplication.getAppContext())) {
                    m147330C0(MainApplication.getAppContext());
                    m147345U0(MainApplication.getAppContext());
                } else {
                    m147349Y0(MainApplication.getAppContext());
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122774d("SocketUploadVideoConnection", e11.toString());
        }
    }

    /* renamed from: K0 */
    void m147336K0() {
        if (m93434z()) {
            List<C18489c> m97848j = C18489c.m97848j(C7962g.c.a.VIDEO_UPLOAD);
            this.f89388t = new ArrayList(m97848j.size());
            for (C18489c c18489c : m97848j) {
                this.f89388t.add(new NativeIPPort(c18489c.m97856c(), c18489c.m97860l()));
            }
            return;
        }
        AbstractC20110a.m104539h(new Exception("[Native] Cannot init new Com"));
    }

    /* renamed from: L0 */
    public boolean m147337L0() {
        if (300000 > System.currentTimeMillis() - m147332F0()) {
            return true;
        }
        return false;
    }

    /* renamed from: N0 */
    boolean m147338N0(Context context) {
        if (!AbstractC23349d.m122770h() && !AbstractC0818g.m2136a()) {
            return true;
        }
        return false;
    }

    /* renamed from: O0 */
    void m147339O0() {
        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: xh.h
            public /* synthetic */ RunnableC29631h() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C29632i.this.m147328M0();
            }
        });
    }

    /* renamed from: P0 */
    public void m147340P0() {
        try {
            if (m147337L0()) {
                boolean m147356e = AbstractC29633j.m147356e();
                boolean z11 = this.f89373e;
                if (!z11 && !this.f89374f && m147356e) {
                    if (!this.f136871D && !m93374B()) {
                        m147339O0();
                    }
                } else if (!z11 && m147356e) {
                    m147342R0(MainApplication.getAppContext());
                }
            } else {
                mo93411k();
                m147350Z0(MainApplication.getAppContext());
                AbstractC23351f.m122784a("Close socket upload video", true);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: Q0 */
    public void m147341Q0() {
        long j11;
        if (C0832n.f2924f) {
            j11 = System.currentTimeMillis();
        } else {
            j11 = 0;
        }
        this.f136868A = j11;
    }

    /* renamed from: R0 */
    public void m147342R0(Context context) {
        if (m93374B()) {
            return;
        }
        try {
            m147350Z0(context);
            int i11 = f136867H * 4;
            if (i11 > 300000) {
                i11 = 10000;
            }
            f136867H = i11;
            if (AbstractC23309i.m121641Yg()) {
                this.f136869B.sendEmptyMessageDelayed(0, i11);
                m147329B0(i11);
            } else {
                Intent intent = new Intent(context, (Class<?>) KeepAliveSCUploadVideoReceiver.class);
                intent.setAction("com.zing.zalo.socketuploadvideo.RECONNECT");
                PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, AbstractC19601a.m102572b(134217728));
                AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
                Calendar calendar = Calendar.getInstance();
                calendar.add(14, i11);
                if (AbstractC23309i.m121601Xd()) {
                    if (Build.VERSION.SDK_INT >= 23 && i11 > 60000) {
                        if (!AbstractC23104j.m118480b(31)) {
                            alarmManager.setExactAndAllowWhileIdle(0, calendar.getTimeInMillis(), broadcast);
                        } else {
                            m147244z0(context, "com.zing.zalo.socketuploadvideo.RECONNECT", i11, SocketUploadVideoConnectionHandlerWorker.class, "SocketUploadVideoConnection");
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
            AbstractC23350e.m122774d("SocketUploadVideoConnection", e11.toString());
        }
    }

    /* renamed from: S0 */
    public void m147343S0(Context context, int i11) {
        if (m93374B()) {
            return;
        }
        try {
            if (m147326E0().m147337L0()) {
                m147350Z0(context);
                if (AbstractC23309i.m121641Yg()) {
                    this.f136869B.sendEmptyMessageDelayed(0, i11);
                    m147329B0(i11);
                } else {
                    Intent intent = new Intent(context, (Class<?>) KeepAliveSCUploadVideoReceiver.class);
                    intent.setAction("com.zing.zalo.socketuploadvideo.RECONNECT");
                    PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, AbstractC19601a.m102572b(134217728));
                    AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
                    Calendar calendar = Calendar.getInstance();
                    calendar.add(14, i11);
                    if (AbstractC23309i.m121601Xd()) {
                        if (Build.VERSION.SDK_INT >= 23 && i11 > 60000) {
                            if (!AbstractC23104j.m118480b(31)) {
                                alarmManager.setExactAndAllowWhileIdle(0, calendar.getTimeInMillis(), broadcast);
                            } else {
                                m147244z0(context, "com.zing.zalo.socketuploadvideo.RECONNECT", i11, SocketUploadVideoConnectionHandlerWorker.class, "SocketUploadVideoConnection");
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
            }
        } catch (Exception e11) {
            AbstractC23350e.m122774d("SocketUploadVideoConnection", e11.toString());
        }
    }

    /* renamed from: T0 */
    public void m147344T0(Context context) {
        if (m93374B()) {
            return;
        }
        try {
            if (m147326E0().m147337L0()) {
                m147350Z0(context);
                if (AbstractC23309i.m121641Yg()) {
                    this.f136869B.sendEmptyMessage(0);
                } else {
                    Intent intent = new Intent(context, (Class<?>) KeepAliveSCUploadVideoReceiver.class);
                    intent.setAction("com.zing.zalo.socketuploadvideo.RECONNECT");
                    context.sendBroadcast(intent);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: U0 */
    void m147345U0(Context context) {
        try {
            if (AbstractC23309i.m121641Yg()) {
                this.f136869B.sendEmptyMessageDelayed(5, 15000L);
                m147329B0(15000);
            } else {
                Intent intent = new Intent(context, (Class<?>) KeepAliveSCUploadVideoReceiver.class);
                intent.setAction("com.zing.zalo.socketuploadvideo.WAKEUPDEVICE_UPLOAD");
                PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, AbstractC19601a.m102572b(134217728));
                AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
                Calendar calendar = Calendar.getInstance();
                calendar.add(14, 15000);
                alarmManager.set(0, calendar.getTimeInMillis(), broadcast);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122774d("SocketUploadVideoConnection", e11.toString());
        }
    }

    /* renamed from: V0 */
    public void m147346V0() {
        try {
            this.f136868A = System.currentTimeMillis();
            if (!m147326E0().m93432x() && !m147326E0().m93433y() && C23055e5.m118271f()) {
                m147343S0(MainApplication.getAppContext(), 1000);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122774d("SocketUploadVideoConnection", e11.toString());
        }
    }

    /* renamed from: W0 */
    public void m147347W0() {
        try {
            this.f136868A = System.currentTimeMillis();
            if (!m147326E0().m93432x() && !m147326E0().m93433y() && C23055e5.m118271f()) {
                m147344T0(MainApplication.getAppContext());
            }
        } catch (Exception e11) {
            AbstractC23350e.m122774d("SocketUploadVideoConnection", e11.toString());
        }
    }

    /* renamed from: X0 */
    public void m147348X0(Context context) {
        try {
            f136866G = 0;
            if (m147338N0(context)) {
                m147330C0(context);
                m147345U0(context);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: Y0 */
    public void m147349Y0(Context context) {
        try {
            m147330C0(context);
            f136866G = 0;
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: Z0 */
    public void m147350Z0(Context context) {
        if (AbstractC23309i.m121641Yg()) {
            this.f136869B.removeMessages(0);
            return;
        }
        Intent intent = new Intent(context, (Class<?>) KeepAliveSCUploadVideoReceiver.class);
        intent.setAction("com.zing.zalo.socketuploadvideo.RECONNECT");
        ((AlarmManager) context.getSystemService("alarm")).cancel(PendingIntent.getBroadcast(context, 0, intent, AbstractC19601a.m102572b(134217728)));
    }

    /* renamed from: a1 */
    public void m147351a1() {
        f136866G++;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ACTION_WAKEUPDEVICE_TO_UPLOAD: #");
        sb2.append(f136866G);
        if (f136866G < 5 && m147338N0(MainApplication.getAppContext())) {
            m147330C0(MainApplication.getAppContext());
            m147345U0(MainApplication.getAppContext());
        } else {
            m147349Y0(MainApplication.getAppContext());
        }
    }

    @Override // com.zing.zalocore.connection.socket.AbstractC17526e
    /* renamed from: i */
    public void mo93407i() {
        AbstractC29633j.m147362k();
        if (this.f136870C) {
            AbstractC29633j.m147364m();
            this.f136870C = false;
        }
    }

    @Override // com.zing.zalocore.connection.socket.AbstractC17526e
    /* renamed from: i0 */
    public void mo93408i0(RequestPacket requestPacket) {
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
            if ((requestPacket.m93284g() == 3 || requestPacket.m93284g() == 4) && requestPacket.m93278a() == 1) {
                if (requestPacket.m93289k() == 0) {
                    this.f89373e = true;
                    AbstractC23351f.m122784a("[UploadVideo] Authenticated", false);
                } else {
                    if (requestPacket.m93289k() == -1) {
                        C0832n.f2924f = true;
                        C0832n.m2179i().m2185c();
                        AbstractC23351f.m122784a("[UploadVideo] SESSION_EXPIRE", true);
                        mo93411k();
                        return;
                    }
                    AbstractC23351f.m122784a("[UploadVideo] Auth failed with code: " + requestPacket.m93289k(), true);
                }
            }
        } catch (Exception e12) {
            e12.printStackTrace();
        }
    }

    @Override // com.zing.zalocore.connection.socket.AbstractC17526e
    /* renamed from: j0 */
    public void mo93410j0(RequestPacket requestPacket) {
        C0821h0.m2145a(requestPacket);
    }

    @Override // com.zing.zalocore.connection.socket.AbstractC17526e
    /* renamed from: k */
    public void mo93411k() {
        super.mo93411k();
        m147341Q0();
    }

    @Override // com.zing.zalocore.connection.socket.AbstractC17526e
    /* renamed from: m0 */
    public void mo93416m0() {
        if (m93374B()) {
            return;
        }
        try {
            if (C23055e5.m118271f() && !m93432x()) {
                m147343S0(MainApplication.getAppContext(), m93427u());
            } else {
                m147350Z0(MainApplication.getAppContext());
            }
        } catch (Exception e11) {
            AbstractC23350e.m122774d("SocketUploadVideoConnection", e11.toString());
        }
    }
}
