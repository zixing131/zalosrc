package p645xh;

import af0.AbstractC0777e;
import ag0.AbstractC0837p0;
import ag0.C0816f;
import ag0.C0819g0;
import ag0.C0832n;
import ag0.C0849v0;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.zing.zalo.MainApplication;
import com.zing.zalo.connection.socket.workers.SocketUploadConnectionHandlerWorker;
import com.zing.zalo.p062db.C7962g;
import com.zing.zalo.receiver.KeepAliveSCUploadReceiver;
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

/* renamed from: xh.g */
/* loaded from: classes.dex */
public class C29630g extends AbstractC29624a {

    /* renamed from: F */
    static volatile C29630g f136854F = null;

    /* renamed from: G */
    public static int f136855G = 0;

    /* renamed from: H */
    static int f136856H = 10000;

    /* renamed from: A */
    long f136857A;

    /* renamed from: B */
    final InterfaceC25980a f136858B;

    /* renamed from: C */
    boolean f136859C;

    /* renamed from: D */
    boolean f136860D;

    /* renamed from: E */
    public long f136861E;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: xh.g$a */
    /* loaded from: classes.dex */
    public class a extends C25982c {
        a(C25984e c25984e) {
            super(c25984e);
        }

        @Override // rw.C25982c
        /* renamed from: g */
        public void mo81139g(C25985f c25985f) {
            C29630g.this.m147308I0(c25985f.f123961a);
            super.mo81139g(c25985f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: xh.g$b */
    /* loaded from: classes3.dex */
    public class b extends AbstractHandlerC25981b {
        b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            C29630g.this.m147308I0(message.what);
            super.handleMessage(message);
        }
    }

    C29630g() {
        super(ZAbstractBase.ZVU_PROCESS_GIF_TO_MP4);
        this.f136857A = 0L;
        this.f136859C = true;
        this.f136860D = false;
        this.f136861E = 0L;
        if (AbstractC23309i.m121717ah()) {
            C25983d c25983d = new C25983d("SocketUploadConnection");
            c25983d.start();
            this.f136858B = new a(c25983d.m133836a());
        } else {
            HandlerThread handlerThread = new HandlerThread("Z:SocketUploadConnection");
            handlerThread.start();
            this.f136858B = new b(handlerThread.getLooper());
        }
        AbstractC0777e.m1935a("socket-upload");
    }

    /* renamed from: E0 */
    public static synchronized C29630g m147299E0() {
        C29630g c29630g;
        synchronized (C29630g.class) {
            try {
                if (f136854F == null) {
                    synchronized (C29630g.class) {
                        try {
                            if (f136854F == null) {
                                f136854F = new C29630g();
                            }
                        } finally {
                        }
                    }
                }
                c29630g = f136854F;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c29630g;
    }

    /* renamed from: J0 */
    public static boolean m147300J0() {
        return f136854F != null;
    }

    /* renamed from: M0 */
    public /* synthetic */ void m147301M0() {
        if (!this.f136860D) {
            try {
                try {
                    this.f136860D = true;
                    mo93411k();
                    m147323Z0(MainApplication.getAppContext());
                    m147304D0();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("ConnectionUploadDownloadListener- isConnected: ");
                    sb2.append(this.f89373e);
                    if (this.f89373e) {
                        m93414l0();
                    }
                } catch (Exception e11) {
                    AbstractC23350e.m122774d("SocketUploadConnection", e11.toString());
                }
                this.f136860D = false;
                mo93416m0();
            } catch (Exception e12) {
                AbstractC23350e.m122774d("SocketUploadConnection", e12.toString());
            }
        }
    }

    /* renamed from: B0 */
    void m147302B0(int i11) {
        try {
            if (AbstractC23309i.m121906fh()) {
                Context appContext = MainApplication.getAppContext();
                Intent intent = new Intent(appContext, (Class<?>) KeepAliveSCUploadReceiver.class);
                intent.setAction("com.zing.zalo.socketuploaddownload.WAKEUPDEVICE");
                PendingIntent broadcast = PendingIntent.getBroadcast(appContext, 0, intent, AbstractC19601a.m102572b(134217728));
                AlarmManager alarmManager = (AlarmManager) appContext.getSystemService("alarm");
                Calendar calendar = Calendar.getInstance();
                calendar.add(14, i11);
                if (AbstractC23309i.m121601Xd()) {
                    if (Build.VERSION.SDK_INT >= 23 && i11 > 60000) {
                        if (!AbstractC23104j.m118480b(31)) {
                            alarmManager.setExactAndAllowWhileIdle(0, calendar.getTimeInMillis(), broadcast);
                        } else {
                            m147244z0(appContext, "com.zing.zalo.socketuploaddownload.WAKEUPDEVICE", i11, SocketUploadConnectionHandlerWorker.class, "SocketUploadConnection");
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
            AbstractC23350e.m122774d("SocketUploadConnection", e11.toString());
        }
    }

    /* renamed from: C0 */
    void m147303C0(Context context) {
        if (AbstractC23309i.m121641Yg()) {
            this.f136858B.removeMessages(5);
            return;
        }
        Intent intent = new Intent(context, (Class<?>) KeepAliveSCUploadReceiver.class);
        intent.setAction("com.zing.zalo.socketuploaddownload.WAKEUPDEVICE_UPLOAD");
        ((AlarmManager) context.getSystemService("alarm")).cancel(PendingIntent.getBroadcast(context, 0, intent, AbstractC19601a.m102572b(134217728)));
    }

    /* renamed from: D0 */
    boolean m147304D0() {
        m147309K0();
        super.m93409j(0);
        if (this.f89373e) {
            C23744a.m124114c().m124116d(4, new Object[0]);
            C0849v0.m2318a();
        }
        return this.f89373e;
    }

    /* renamed from: F0 */
    public long m147305F0() {
        return this.f136857A;
    }

    /* renamed from: G0 */
    public void m147306G0(Intent intent) {
        try {
            this.f136861E = System.currentTimeMillis();
            if (intent.getAction().equals("com.zing.zalo.socketuploaddownload.RECONNECT")) {
                m147313P0();
            } else if (intent.getAction().equals("com.zing.zalo.socketuploaddownload.WAKEUPDEVICE")) {
                AbstractC23351f.m122784a("Socket Upload ACTION_WAKEUPDEVICE AFTER PING", true);
            } else if (intent.getAction().equals("com.zing.zalo.socketuploaddownload.WAKEUPDEVICE_UPLOAD")) {
                m147324a1();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122774d("SocketUploadConnection", e11.toString());
        }
    }

    /* renamed from: H0 */
    public void m147307H0() {
        if (!m93374B() && System.currentTimeMillis() - this.f136861E > 300000 && m147310L0()) {
            m147313P0();
        }
    }

    /* renamed from: I0 */
    public void m147308I0(int i11) {
        try {
            this.f136861E = System.currentTimeMillis();
            if (i11 == 0) {
                m147313P0();
            } else if (i11 == 4) {
                AbstractC23351f.m122784a("Socket Upload ACTION_WAKEUPDEVICE AFTER PING", true);
            } else if (i11 == 5) {
                f136855G++;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("ACTION_WAKEUPDEVICE_TO_UPLOAD: #");
                sb2.append(f136855G);
                if (f136855G < 5 && m147311N0(MainApplication.getAppContext())) {
                    m147303C0(MainApplication.getAppContext());
                    m147318U0(MainApplication.getAppContext());
                } else {
                    m147322Y0(MainApplication.getAppContext());
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122774d("SocketUploadConnection", e11.toString());
            e11.printStackTrace();
        }
    }

    /* renamed from: K0 */
    void m147309K0() {
        if (m93434z()) {
            List<C18489c> m97848j = C18489c.m97848j(C7962g.c.a.UPLOAD);
            this.f89388t = new ArrayList(m97848j.size());
            for (C18489c c18489c : m97848j) {
                this.f89388t.add(new NativeIPPort(c18489c.m97856c(), c18489c.m97860l()));
            }
            return;
        }
        AbstractC20110a.m104539h(new Exception("Native Upload Socket init fail"));
    }

    /* renamed from: L0 */
    public boolean m147310L0() {
        if (300000 > System.currentTimeMillis() - m147305F0()) {
            return true;
        }
        return false;
    }

    /* renamed from: N0 */
    boolean m147311N0(Context context) {
        if (!AbstractC23349d.m122770h() && !C0816f.m2131a()) {
            return true;
        }
        return false;
    }

    /* renamed from: O0 */
    void m147312O0() {
        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: xh.f
            public /* synthetic */ RunnableC29629f() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C29630g.this.m147301M0();
            }
        });
    }

    /* renamed from: P0 */
    public void m147313P0() {
        try {
            if (m147310L0()) {
                boolean m147356e = AbstractC29633j.m147356e();
                boolean z11 = this.f89373e;
                if (!z11 && !this.f89374f && m147356e) {
                    if (!this.f136860D && !m93374B()) {
                        m147312O0();
                    }
                } else if (!z11 && m147356e) {
                    m147315R0(MainApplication.getAppContext());
                }
            } else {
                mo93411k();
                m147323Z0(MainApplication.getAppContext());
                AbstractC23351f.m122784a("Close socket upload", true);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: Q0 */
    public void m147314Q0() {
        long j11;
        if (C0832n.f2924f) {
            j11 = System.currentTimeMillis();
        } else {
            j11 = 0;
        }
        this.f136857A = j11;
    }

    /* renamed from: R0 */
    public void m147315R0(Context context) {
        if (m93374B()) {
            return;
        }
        try {
            m147323Z0(context);
            int i11 = f136856H * 4;
            if (i11 > 300000) {
                i11 = 10000;
            }
            f136856H = i11;
            if (AbstractC23309i.m121641Yg()) {
                this.f136858B.sendEmptyMessageDelayed(0, i11);
                m147302B0(i11);
            } else {
                Intent intent = new Intent(context, (Class<?>) KeepAliveSCUploadReceiver.class);
                intent.setAction("com.zing.zalo.socketuploaddownload.RECONNECT");
                PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, AbstractC19601a.m102572b(134217728));
                AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
                Calendar calendar = Calendar.getInstance();
                calendar.add(14, i11);
                if (AbstractC23309i.m121601Xd()) {
                    if (Build.VERSION.SDK_INT >= 23 && i11 > 60000) {
                        if (!AbstractC23104j.m118480b(31)) {
                            alarmManager.setExactAndAllowWhileIdle(0, calendar.getTimeInMillis(), broadcast);
                        } else {
                            m147244z0(context, "com.zing.zalo.socketuploaddownload.RECONNECT", i11, SocketUploadConnectionHandlerWorker.class, "SocketUploadConnection");
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
            AbstractC23350e.m122774d("SocketUploadConnection", e11.toString());
        }
    }

    /* renamed from: S0 */
    public void m147316S0(Context context, int i11) {
        if (m93374B()) {
            return;
        }
        try {
            if (m147299E0().m147310L0()) {
                m147323Z0(context);
                if (AbstractC23309i.m121641Yg()) {
                    this.f136858B.sendEmptyMessageDelayed(0, i11);
                    m147302B0(i11);
                } else {
                    Intent intent = new Intent(context, (Class<?>) KeepAliveSCUploadReceiver.class);
                    intent.setAction("com.zing.zalo.socketuploaddownload.RECONNECT");
                    PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, AbstractC19601a.m102572b(134217728));
                    AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
                    Calendar calendar = Calendar.getInstance();
                    calendar.add(14, i11);
                    if (AbstractC23309i.m121601Xd()) {
                        if (Build.VERSION.SDK_INT >= 23 && i11 > 60000) {
                            if (!AbstractC23104j.m118480b(31)) {
                                alarmManager.setExactAndAllowWhileIdle(0, calendar.getTimeInMillis(), broadcast);
                            } else {
                                m147244z0(context, "com.zing.zalo.socketuploaddownload.RECONNECT", i11, SocketUploadConnectionHandlerWorker.class, "SocketUploadConnection");
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
            AbstractC23350e.m122774d("SocketUploadConnection", e11.toString());
        }
    }

    /* renamed from: T0 */
    public void m147317T0(Context context) {
        if (m93374B()) {
            return;
        }
        try {
            if (m147299E0().m147310L0()) {
                m147323Z0(context);
                if (AbstractC23309i.m121641Yg()) {
                    this.f136858B.sendEmptyMessage(0);
                } else {
                    Intent intent = new Intent(context, (Class<?>) KeepAliveSCUploadReceiver.class);
                    intent.setAction("com.zing.zalo.socketuploaddownload.RECONNECT");
                    context.sendBroadcast(intent);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: U0 */
    void m147318U0(Context context) {
        try {
            if (AbstractC23309i.m121641Yg()) {
                this.f136858B.sendEmptyMessageDelayed(5, 15000L);
                m147302B0(15000);
            } else {
                Intent intent = new Intent(context, (Class<?>) KeepAliveSCUploadReceiver.class);
                intent.setAction("com.zing.zalo.socketuploaddownload.WAKEUPDEVICE_UPLOAD");
                PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, AbstractC19601a.m102572b(134217728));
                AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
                Calendar calendar = Calendar.getInstance();
                calendar.add(14, 15000);
                alarmManager.set(0, calendar.getTimeInMillis(), broadcast);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122774d("SocketUploadConnection", e11.toString());
        }
    }

    /* renamed from: V0 */
    public void m147319V0() {
        try {
            this.f136857A = System.currentTimeMillis();
            if (!m147299E0().m93432x() && !m147299E0().m93433y() && C23055e5.m118271f()) {
                m147316S0(MainApplication.getAppContext(), 1000);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122774d("SocketUploadConnection", e11.toString());
        }
    }

    /* renamed from: W0 */
    public void m147320W0() {
        try {
            this.f136857A = System.currentTimeMillis();
            if (!m147299E0().m93432x() && !m147299E0().m93433y() && C23055e5.m118271f()) {
                m147317T0(MainApplication.getAppContext());
            }
        } catch (Exception e11) {
            AbstractC23350e.m122774d("SocketUploadConnection", e11.toString());
        }
    }

    /* renamed from: X0 */
    public void m147321X0(Context context) {
        try {
            f136855G = 0;
            if (m147311N0(context)) {
                m147303C0(context);
                m147318U0(context);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: Y0 */
    public void m147322Y0(Context context) {
        try {
            m147303C0(context);
            f136855G = 0;
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: Z0 */
    public void m147323Z0(Context context) {
        if (AbstractC23309i.m121641Yg()) {
            this.f136858B.removeMessages(0);
            return;
        }
        Intent intent = new Intent(context, (Class<?>) KeepAliveSCUploadReceiver.class);
        intent.setAction("com.zing.zalo.socketuploaddownload.RECONNECT");
        ((AlarmManager) context.getSystemService("alarm")).cancel(PendingIntent.getBroadcast(context, 0, intent, AbstractC19601a.m102572b(134217728)));
    }

    /* renamed from: a1 */
    public void m147324a1() {
        f136855G++;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ACTION_WAKEUPDEVICE_TO_UPLOAD: #");
        sb2.append(f136855G);
        if (f136855G < 5 && m147311N0(MainApplication.getAppContext())) {
            m147303C0(MainApplication.getAppContext());
            m147318U0(MainApplication.getAppContext());
        } else {
            m147322Y0(MainApplication.getAppContext());
        }
    }

    @Override // com.zing.zalocore.connection.socket.AbstractC17526e
    /* renamed from: i */
    public void mo93407i() {
        AbstractC29633j.m147362k();
        if (this.f136859C) {
            AbstractC29633j.m147364m();
            this.f136859C = false;
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
                    AbstractC23351f.m122784a("[Upload] Authenticated", false);
                } else {
                    if (requestPacket.m93289k() == -1) {
                        C0832n.f2924f = true;
                        C0832n.m2179i().m2185c();
                        AbstractC23351f.m122784a("[Upload] SESSION_EXPIRE", true);
                        mo93411k();
                        return;
                    }
                    AbstractC23351f.m122784a("[Upload] Auth failed with code: " + requestPacket.m93289k(), true);
                }
            }
        } catch (Exception e12) {
            e12.printStackTrace();
        }
    }

    @Override // com.zing.zalocore.connection.socket.AbstractC17526e
    /* renamed from: j0 */
    public void mo93410j0(RequestPacket requestPacket) {
        C0819g0.m2137a(requestPacket);
    }

    @Override // com.zing.zalocore.connection.socket.AbstractC17526e
    /* renamed from: k */
    public void mo93411k() {
        super.mo93411k();
        m147314Q0();
    }

    @Override // com.zing.zalocore.connection.socket.AbstractC17526e
    /* renamed from: m0 */
    public void mo93416m0() {
        if (m93374B()) {
            return;
        }
        try {
            if (C23055e5.m118271f() && !m93432x()) {
                m147316S0(MainApplication.getAppContext(), m93427u());
            } else {
                m147323Z0(MainApplication.getAppContext());
            }
        } catch (Exception e11) {
            AbstractC23350e.m122774d("SocketUploadConnection", e11.toString());
        }
    }
}
