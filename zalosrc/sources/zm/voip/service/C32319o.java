package zm.voip.service;

import ag0.C0815e1;
import am.AbstractC0924m0;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.RingtoneManager;
import android.media.ToneGenerator;
import android.net.Uri;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import android.provider.Settings;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import au.AbstractC2351i;
import bp0.AbstractC3082b0;
import bp0.AbstractC3096i0;
import bp0.C3114z;
import com.zing.zalo.p077ui.call.settingringtone.presenter.data.RingtoneData;
import com.zing.zalo.zinstant.zom.node.ZOM;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import gp0.C19577z;
import ho0.AbstractC20110a;
import java.util.concurrent.CountDownLatch;
import l50.C22083e;
import l50.C22086h;
import lo0.AbstractC22609k0;
import lo0.C22598f;
import lo0.C22621q0;
import me0.AbstractC23057e7;
import me0.AbstractC23148n;
import p097db.AbstractC17849h;
import p348mi.AbstractC23304d;
import p361nb.C23648e;
import p363nh.C23744a;
import ro0.AbstractRunnableC25943g;
import s00.AbstractC26080o;

/* renamed from: zm.voip.service.o */
/* loaded from: classes7.dex */
public class C32319o {

    /* renamed from: B */
    static volatile C32319o f149195B;

    /* renamed from: A */
    d f149196A;

    /* renamed from: a */
    TelephonyManager f149197a;

    /* renamed from: c */
    C3114z f149199c;

    /* renamed from: d */
    e f149200d;

    /* renamed from: e */
    WifiManager.WifiLock f149201e;

    /* renamed from: j */
    ComponentName f149206j;

    /* renamed from: k */
    MediaPlayer f149207k;

    /* renamed from: l */
    MediaPlayer f149208l;

    /* renamed from: m */
    MediaPlayer f149209m;

    /* renamed from: n */
    MediaPlayer f149210n;

    /* renamed from: o */
    MediaPlayer f149211o;

    /* renamed from: p */
    BroadcastReceiver f149212p;

    /* renamed from: f */
    boolean f149202f = false;

    /* renamed from: g */
    boolean f149203g = false;

    /* renamed from: h */
    boolean f149204h = false;

    /* renamed from: i */
    private float f149205i = 0.0f;

    /* renamed from: q */
    private String f149213q = "";

    /* renamed from: r */
    volatile int f149214r = 0;

    /* renamed from: s */
    volatile boolean f149215s = false;

    /* renamed from: t */
    volatile boolean f149216t = false;

    /* renamed from: u */
    volatile boolean f149217u = false;

    /* renamed from: v */
    volatile boolean f149218v = false;

    /* renamed from: w */
    volatile boolean f149219w = false;

    /* renamed from: x */
    volatile boolean f149220x = false;

    /* renamed from: y */
    volatile boolean f149221y = false;

    /* renamed from: z */
    volatile boolean f149222z = false;

    /* renamed from: b */
    AudioManager f149198b = (AudioManager) AbstractC3096i0.m15574y().getSystemService("audio");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zm.voip.service.o$a */
    /* loaded from: classes7.dex */
    public class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            AbstractC32273e3.m155748Q().m155891k0(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zm.voip.service.o$b */
    /* loaded from: classes7.dex */
    public class b extends AbstractRunnableC25943g {

        /* renamed from: p */
        final /* synthetic */ boolean f149224p;

        b(boolean z11) {
            this.f149224p = z11;
        }

        @Override // ro0.AbstractRunnableC25943g
        /* renamed from: a */
        protected void mo66462a() {
            boolean z11 = this.f149224p;
            C32319o c32319o = C32319o.this;
            if (z11 != c32319o.f149202f) {
                c32319o.f149202f = z11;
                AbstractC17849h.m94295d(z11);
                C32319o.this.m156329r();
                if (AbstractC32273e3.f148886z) {
                    C19577z.m102341J().m102387P0(this.f149224p ? 1 : 0);
                    AbstractC32273e3.m155748Q().mo155927v();
                }
            }
        }
    }

    /* renamed from: zm.voip.service.o$c */
    /* loaded from: classes7.dex */
    public static class c extends Thread {

        /* renamed from: p */
        int f149226p;

        c(int i11) {
            super("Z:InCallTonePlayer");
            this.f149226p = i11;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            int i11;
            int i12;
            ToneGenerator toneGenerator;
            AbstractC3082b0.m15421c("MediaManager", "InCallTonePlayer.run(toneId = " + this.f149226p + ")...");
            int i13 = this.f149226p;
            int i14 = 100;
            if (i13 != 1) {
                i12 = 1500;
                if (i13 != 2) {
                    if (i13 != 3) {
                        if (i13 != 4) {
                            if (i13 == 5) {
                                i11 = 27;
                                i14 = 50;
                                i12 = ZAbstractBase.ZVU_PROCESS_FLUSH;
                            } else {
                                throw new IllegalArgumentException("Bad toneId: " + this.f149226p);
                            }
                        } else {
                            i11 = 25;
                            i12 = 1000;
                        }
                    } else {
                        i11 = 18;
                    }
                } else {
                    i11 = 17;
                }
            } else {
                i11 = 22;
                i12 = AbstractC26080o.a.f124275b;
            }
            try {
                toneGenerator = new ToneGenerator(0, i14);
            } catch (RuntimeException e11) {
                AbstractC3082b0.m15422d("MediaManager", "InCallTonePlayer: Exception caught while creating ToneGenerator: " + e11);
                toneGenerator = null;
            }
            if (toneGenerator != null) {
                toneGenerator.startTone(i11);
                SystemClock.sleep(i12);
                toneGenerator.stopTone();
                toneGenerator.release();
            }
        }
    }

    /* renamed from: zm.voip.service.o$d */
    /* loaded from: classes7.dex */
    public class d extends PhoneStateListener {

        /* renamed from: a */
        boolean f149227a = true;

        /* renamed from: zm.voip.service.o$d$a */
        /* loaded from: classes7.dex */
        class a extends AbstractRunnableC25943g {

            /* renamed from: p */
            final /* synthetic */ int f149229p;

            a(int i11) {
                this.f149229p = i11;
            }

            @Override // ro0.AbstractRunnableC25943g
            /* renamed from: a */
            protected void mo66462a() {
                C32319o.this.m156304S(this.f149229p);
            }
        }

        d() {
        }

        @Override // android.telephony.PhoneStateListener
        public void onCallStateChanged(int i11, String str) {
            if (!this.f149227a) {
                AbstractC3082b0.m15424f("MediaManager", "Call state has changed !" + i11 + " : " + str);
                HandlerC32324p.m156351d(new a(i11));
            } else {
                this.f149227a = false;
            }
            super.onCallStateChanged(i11, str);
        }
    }

    /* renamed from: zm.voip.service.o$e */
    /* loaded from: classes7.dex */
    public class e extends HandlerThread implements Handler.Callback {

        /* renamed from: p */
        private Handler f149231p;

        /* renamed from: q */
        private final CountDownLatch f149232q;

        public e(String str) {
            super("Z:" + str);
            this.f149232q = new CountDownLatch(1);
        }

        /* renamed from: b */
        public void m156336b(boolean z11) {
            try {
                this.f149232q.await();
                Handler handler = this.f149231p;
                if (handler != null) {
                    if (z11) {
                        handler.sendEmptyMessage(15);
                    } else {
                        handler.removeMessages(15);
                        this.f149231p.removeMessages(14);
                        this.f149231p.sendEmptyMessage(16);
                    }
                }
            } catch (InterruptedException e11) {
                e11.printStackTrace();
            }
        }

        /* renamed from: c */
        public void m156337c(boolean z11) {
            try {
                this.f149232q.await();
                Handler handler = this.f149231p;
                if (handler != null) {
                    int i11 = 6;
                    if (!z11) {
                        handler.removeMessages(6);
                    }
                    Handler handler2 = this.f149231p;
                    if (!z11) {
                        i11 = 7;
                    }
                    handler2.sendEmptyMessage(i11);
                }
            } catch (InterruptedException e11) {
                e11.printStackTrace();
            }
        }

        /* renamed from: d */
        public void m156338d() {
            try {
                this.f149232q.await();
                Handler handler = this.f149231p;
                if (handler != null) {
                    handler.sendEmptyMessage(10);
                }
            } catch (InterruptedException e11) {
                e11.printStackTrace();
            }
        }

        /* renamed from: e */
        public void m156339e() {
            try {
                this.f149232q.await();
                Handler handler = this.f149231p;
                if (handler != null) {
                    handler.sendEmptyMessage(1);
                }
            } catch (InterruptedException e11) {
                e11.printStackTrace();
            }
        }

        /* renamed from: f */
        public void m156340f(String str) {
            try {
                this.f149232q.await();
                Handler handler = this.f149231p;
                if (handler != null) {
                    this.f149231p.sendMessage(handler.obtainMessage(2, 0, 0, str));
                }
            } catch (InterruptedException e11) {
                e11.printStackTrace();
            }
        }

        /* renamed from: g */
        public void m156341g(boolean z11) {
            try {
                this.f149232q.await();
                Handler handler = this.f149231p;
                if (handler != null) {
                    int i11 = 3;
                    if (!z11) {
                        handler.removeMessages(3);
                    }
                    Handler handler2 = this.f149231p;
                    if (!z11) {
                        i11 = 4;
                    }
                    handler2.sendEmptyMessage(i11);
                }
            } catch (InterruptedException e11) {
                e11.printStackTrace();
            }
        }

        /* renamed from: h */
        public void m156342h(String str, String str2) {
            try {
                this.f149232q.await();
                Handler handler = this.f149231p;
                if (handler != null) {
                    handler.sendMessage(handler.obtainMessage(14, str2));
                    C32319o.this.f149213q = str;
                }
            } catch (InterruptedException e11) {
                e11.printStackTrace();
            }
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    C32319o.this.m156296x();
                    return false;
                case 2:
                    Object obj = message.obj;
                    if (obj instanceof String) {
                        C32319o.this.m156264B((String) obj);
                        return false;
                    }
                    return false;
                case 3:
                    C32319o.this.m156268G();
                    return false;
                case 4:
                    C32319o.this.m156272M();
                    return false;
                case 5:
                    C32319o.this.m156263A();
                    return false;
                case 6:
                    C32319o.this.m156267F();
                    return false;
                case 7:
                    C32319o.this.m156270K();
                    return false;
                case 8:
                    C32319o.this.m156300H();
                    return false;
                case 9:
                    C32319o.this.m156273N();
                    return false;
                case 10:
                    C32319o.this.m156298z();
                    return false;
                case 11:
                    C32319o.this.m156297y();
                    return false;
                case 12:
                    C32319o.this.m156271L();
                    return false;
                case 13:
                    C32319o.this.m156266D();
                    return false;
                case 14:
                    Object obj2 = message.obj;
                    if (obj2 instanceof String) {
                        C32319o.this.m156265C((String) obj2);
                        return false;
                    }
                    return false;
                case 15:
                    C32319o.this.m156299E();
                    return false;
                case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                    C32319o.this.m156301J();
                    return false;
                default:
                    return false;
            }
        }

        /* renamed from: i */
        public void m156343i() {
            try {
                this.f149232q.await();
                Handler handler = this.f149231p;
                if (handler != null) {
                    handler.sendEmptyMessage(5);
                }
            } catch (InterruptedException e11) {
                e11.printStackTrace();
            }
        }

        /* renamed from: j */
        public void m156344j(boolean z11) {
            try {
                this.f149232q.await();
                Handler handler = this.f149231p;
                if (handler != null) {
                    int i11 = 8;
                    if (!z11) {
                        handler.removeMessages(8);
                    }
                    Handler handler2 = this.f149231p;
                    if (!z11) {
                        i11 = 9;
                    }
                    handler2.sendEmptyMessage(i11);
                }
            } catch (InterruptedException e11) {
                e11.printStackTrace();
            }
        }

        /* renamed from: k */
        public void m156345k() {
            try {
                this.f149232q.await();
                Handler handler = this.f149231p;
                if (handler != null) {
                    handler.sendEmptyMessage(13);
                }
            } catch (InterruptedException e11) {
                e11.printStackTrace();
            }
        }

        /* renamed from: l */
        public void m156346l() {
            try {
                this.f149232q.await();
                Handler handler = this.f149231p;
                if (handler != null) {
                    handler.sendEmptyMessage(11);
                }
            } catch (InterruptedException e11) {
                e11.printStackTrace();
            }
        }

        /* renamed from: m */
        public void m156347m() {
            try {
                this.f149232q.await();
                Handler handler = this.f149231p;
                if (handler != null) {
                    handler.removeMessages(11);
                    this.f149231p.removeMessages(10);
                    this.f149231p.sendEmptyMessage(12);
                }
            } catch (InterruptedException e11) {
                e11.printStackTrace();
            }
        }

        @Override // android.os.HandlerThread
        protected void onLooperPrepared() {
            super.onLooperPrepared();
            if (getLooper() != null) {
                this.f149231p = new Handler(getLooper(), this);
            }
            this.f149232q.countDown();
        }
    }

    C32319o() {
        int i11;
        if (AbstractC23057e7.m118298e()) {
            this.f149197a = (TelephonyManager) AbstractC3096i0.m15574y().getSystemService("phone");
        }
        this.f149196A = new d();
        e eVar = new e("VoIPMediaHandlerThread");
        this.f149200d = eVar;
        eVar.start();
        this.f149199c = new C3114z(AbstractC3096i0.m15574y());
        WifiManager wifiManager = (WifiManager) AbstractC3096i0.m15574y().getApplicationContext().getSystemService("wifi");
        if (Build.VERSION.SDK_INT >= 34) {
            i11 = 4;
        } else {
            i11 = 3;
        }
        WifiManager.WifiLock createWifiLock = wifiManager.createWifiLock(i11, "zm.voip.InCallLock");
        this.f149201e = createWifiLock;
        createWifiLock.setReferenceCounted(false);
        try {
            this.f149207k = new MediaPlayer();
            this.f149208l = new MediaPlayer();
            this.f149209m = new MediaPlayer();
            this.f149210n = new MediaPlayer();
            this.f149211o = new MediaPlayer();
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
        this.f149200d.m156339e();
        this.f149212p = new a();
        this.f149206j = new ComponentName(AbstractC3096i0.m15574y(), (Class<?>) HeadsetButtonReceiver.class);
    }

    /* renamed from: A */
    public void m156263A() {
        if (!this.f149221y) {
            this.f149221y = true;
            AbstractC3082b0.m15421c("MediaManager", "startPlayReconnectSound");
            try {
                m156327p0();
                this.f149209m.setDataSource(AbstractC3096i0.m15574y(), Uri.parse(AbstractC22609k0.f110727c));
                this.f149209m.setAudioStreamType(0);
                this.f149209m.setLooping(true);
                this.f149209m.prepare();
                this.f149209m.start();
            } catch (Exception e11) {
                AbstractC3082b0.m15423e("MediaManager", "startPlayReconnectSound : " + e11.getMessage(), e11);
            }
        }
    }

    /* renamed from: B */
    public void m156264B(String str) {
        try {
            this.f149207k.reset();
            this.f149207k.setDataSource(AbstractC3096i0.m15574y(), Uri.parse(str));
            this.f149207k.setAudioStreamType(0);
            this.f149207k.setLooping(false);
            this.f149207k.prepare();
            this.f149207k.start();
        } catch (Exception e11) {
            AbstractC3082b0.m15423e("MediaManager", "startPlaySound : " + e11.getMessage(), e11);
        }
    }

    /* renamed from: C */
    public void m156265C(String str) {
        try {
            if (this.f149211o.isPlaying()) {
                this.f149211o.stop();
            }
            this.f149211o.reset();
            this.f149211o.setDataSource(str);
            this.f149211o.setAudioStreamType(0);
            this.f149211o.setLooping(true);
            this.f149205i = 0.0f;
            this.f149211o.setVolume(0.0f, 0.0f);
            this.f149211o.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: zm.voip.service.m
                @Override // android.media.MediaPlayer.OnPreparedListener
                public final void onPrepared(MediaPlayer mediaPlayer) {
                    C32319o.m156274Q(mediaPlayer);
                }
            });
            this.f149211o.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: zm.voip.service.n

                /* renamed from: q */
                public final /* synthetic */ String f149162q;

                public /* synthetic */ C32314n(String str2) {
                    r2 = str2;
                }

                @Override // android.media.MediaPlayer.OnErrorListener
                public final boolean onError(MediaPlayer mediaPlayer, int i11, int i12) {
                    boolean m156275R;
                    m156275R = C32319o.this.m156275R(r2, mediaPlayer, i11, i12);
                    return m156275R;
                }
            });
            this.f149211o.prepareAsync();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: D */
    public void m156266D() {
        AbstractC3082b0.m15421c("MediaManager", "startBusySignal");
        try {
            m156328q0();
            m156319h0();
            m156316e0();
            m156269I();
            this.f149210n.setDataSource(AbstractC3096i0.m15574y(), Uri.parse(AbstractC22609k0.f110728d));
            this.f149210n.setAudioStreamType(0);
            this.f149210n.setLooping(false);
            this.f149210n.prepare();
            this.f149210n.start();
        } catch (Exception e11) {
            AbstractC3082b0.m15422d("MediaManager", "startBusySignal failed " + e11.toString());
        }
    }

    /* renamed from: F */
    public void m156267F() {
        if (!this.f149222z) {
            this.f149222z = true;
            AbstractC3082b0.m15421c("MediaManager", "startDialTone");
            try {
                m156327p0();
                this.f149209m.setDataSource(AbstractC3096i0.m15574y(), Uri.parse(AbstractC22609k0.f110734j));
                this.f149209m.setAudioStreamType(0);
                this.f149209m.setLooping(true);
                this.f149209m.prepare();
                this.f149209m.start();
            } catch (Exception e11) {
                AbstractC3082b0.m15422d("MediaManager", "startDialTone failed " + e11.toString());
            }
        }
    }

    /* renamed from: G */
    public void m156268G() {
        if (!this.f149220x && this.f149215s) {
            AbstractC3082b0.m15421c("MediaManager", "startPoorSignal");
            this.f149220x = true;
            try {
                this.f149208l.reset();
                this.f149208l.setDataSource(AbstractC3096i0.m15574y(), Uri.parse(AbstractC22609k0.f110727c));
                this.f149208l.setAudioStreamType(0);
                this.f149208l.setLooping(true);
                this.f149208l.prepare();
                this.f149208l.start();
            } catch (Exception e11) {
                AbstractC3082b0.m15423e("MediaManager", "startPoorSignal failed : " + e11.getMessage(), e11);
            }
        }
    }

    /* renamed from: I */
    private void m156269I() {
        AbstractC3082b0.m15421c("MediaManager", "StopBusySound");
        try {
            if (this.f149210n.isPlaying()) {
                this.f149210n.stop();
            }
            this.f149210n.reset();
            this.f149210n.setOnCompletionListener(null);
            this.f149210n.setOnPreparedListener(null);
        } catch (Exception e11) {
            AbstractC3082b0.m15422d("MediaManager", "StopBusySound failed " + e11.toString());
        }
    }

    /* renamed from: K */
    public void m156270K() {
        if (this.f149222z) {
            AbstractC3082b0.m15421c("MediaManager", "stopDialTone");
            m156327p0();
            this.f149222z = false;
        } else if (this.f149221y) {
            AbstractC3082b0.m15421c("MediaManager", "stopPreConnect");
            m156327p0();
            this.f149221y = false;
        }
    }

    /* renamed from: L */
    public void m156271L() {
        if (this.f149219w) {
            AbstractC3082b0.m15421c("MediaManager", "stopMp3VoiceMail");
            m156327p0();
            this.f149219w = false;
        }
    }

    /* renamed from: M */
    public void m156272M() {
        AbstractC3082b0.m15421c("MediaManager", "stopPoorSignal");
        try {
            if (this.f149208l.isPlaying()) {
                this.f149208l.stop();
            }
            this.f149208l.reset();
            this.f149208l.setOnCompletionListener(null);
            this.f149208l.setOnPreparedListener(null);
        } catch (Exception e11) {
            AbstractC3082b0.m15422d("MediaManager", "stopPoorSignal failed " + e11.toString());
        }
        this.f149220x = false;
    }

    /* renamed from: N */
    public void m156273N() {
        if (this.f149217u) {
            AbstractC3082b0.m15421c("MediaManager", "stopRingback");
            m156327p0();
            this.f149217u = false;
        } else if (this.f149221y) {
            AbstractC3082b0.m15421c("MediaManager", "stopPreConnect");
            m156327p0();
            this.f149221y = false;
        }
    }

    /* renamed from: Q */
    public static /* synthetic */ void m156274Q(MediaPlayer mediaPlayer) {
        AbstractC32273e3.m155748Q().mo155921t1();
    }

    /* renamed from: R */
    public /* synthetic */ boolean m156275R(String str, MediaPlayer mediaPlayer, int i11, int i12) {
        AbstractC32273e3.m155748Q().mo155944z1(str, i11, i12);
        C0815e1.m2075D().m2100V(new C23648e(45, "in_call", 1, "play_rbt_in_call_screen", this.f149213q, "1", String.valueOf(i11), String.valueOf(i12)), false);
        return true;
    }

    /* renamed from: t */
    public static C32319o m156293t() {
        if (f149195B == null) {
            synchronized (C32319o.class) {
                try {
                    if (f149195B == null) {
                        f149195B = new C32319o();
                    }
                } finally {
                }
            }
        }
        return f149195B;
    }

    /* renamed from: v */
    private Uri m156294v() {
        try {
            Uri actualDefaultRingtoneUri = RingtoneManager.getActualDefaultRingtoneUri(AbstractC3096i0.m15574y(), 1);
            if (actualDefaultRingtoneUri == null) {
                return Uri.EMPTY;
            }
            return actualDefaultRingtoneUri;
        } catch (Exception e11) {
            Uri uri = Uri.EMPTY;
            e11.printStackTrace();
            return uri;
        }
    }

    /* renamed from: w */
    public void m156295w() {
        MediaPlayer mediaPlayer = this.f149211o;
        if (mediaPlayer != null && mediaPlayer.isPlaying()) {
            float f11 = this.f149205i;
            if (f11 < 1.0f) {
                float f12 = f11 + 0.05f;
                this.f149205i = f12;
                this.f149211o.setVolume(f12, f12);
                this.f149200d.f149231p.postDelayed(new Runnable() { // from class: zm.voip.service.l
                    public /* synthetic */ RunnableC32304l() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C32319o.this.m156295w();
                    }
                }, 300L);
            }
        }
    }

    /* renamed from: x */
    public void m156296x() {
        try {
            this.f149207k = new MediaPlayer();
            this.f149208l = new MediaPlayer();
            this.f149209m = new MediaPlayer();
            this.f149210n = new MediaPlayer();
            this.f149211o = new MediaPlayer();
        } catch (Exception unused) {
        }
    }

    /* renamed from: y */
    public void m156297y() {
        Uri parse;
        if (!this.f149219w) {
            AbstractC3082b0.m15421c("MediaManager", "playMp3NotRingRing");
            this.f149219w = true;
            try {
                m156327p0();
                if (AbstractC23148n.m118830d() == 0) {
                    parse = Uri.parse(AbstractC22609k0.f110730f);
                } else {
                    parse = Uri.parse(AbstractC22609k0.f110729e);
                }
                this.f149209m.setDataSource(AbstractC3096i0.m15574y(), parse);
                this.f149209m.setAudioStreamType(0);
                this.f149209m.setLooping(false);
                this.f149209m.prepare();
                this.f149209m.start();
            } catch (Exception e11) {
                AbstractC3082b0.m15422d("MediaManager", "playMp3VoiceMail failed " + e11.toString());
            }
        }
    }

    /* renamed from: z */
    public void m156298z() {
        if (!this.f149219w) {
            AbstractC3082b0.m15421c("MediaManager", "playEndVoiceForRungCall");
            this.f149219w = true;
            try {
                m156327p0();
                this.f149209m.setDataSource(AbstractC3096i0.m15574y(), Uri.parse(AbstractC22609k0.f110731g));
                this.f149209m.setAudioStreamType(0);
                this.f149209m.setLooping(false);
                this.f149209m.prepare();
                this.f149209m.start();
            } catch (Exception e11) {
                AbstractC3082b0.m15422d("MediaManager", "playEndVoiceForRungCall failed " + e11.toString());
            }
        }
    }

    /* renamed from: E */
    public void m156299E() {
        try {
            if (this.f149218v) {
                return;
            }
            this.f149218v = true;
            this.f149211o.start();
            m156295w();
            C0815e1.m2075D().m2100V(new C23648e(45, "in_call", 1, "play_rbt_in_call_screen", this.f149213q, "0"), false);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: H */
    void m156300H() {
        if (!this.f149217u) {
            this.f149217u = true;
            AbstractC3082b0.m15421c("MediaManager", "startRingback");
            try {
                m156327p0();
                this.f149209m.setDataSource(AbstractC3096i0.m15574y(), Uri.parse(AbstractC22609k0.f110733i));
                this.f149209m.setAudioStreamType(0);
                this.f149209m.setLooping(true);
                this.f149209m.prepare();
                this.f149209m.start();
            } catch (Exception e11) {
                AbstractC3082b0.m15422d("MediaManager", "startRingback failed " + e11.toString());
            }
        }
    }

    /* renamed from: J */
    public void m156301J() {
        try {
            if (this.f149211o.isPlaying()) {
                this.f149211o.stop();
            }
            this.f149211o.reset();
            this.f149211o.setOnCompletionListener(null);
            this.f149211o.setOnPreparedListener(null);
            this.f149218v = false;
            this.f149213q = "";
        } catch (Exception e11) {
            AbstractC3082b0.m15422d("MediaManager", "internalStopCustomizedRingBackTone failed " + e11.toString());
        }
    }

    /* renamed from: O */
    public boolean m156302O() {
        return this.f149217u;
    }

    /* renamed from: P */
    public boolean m156303P() {
        return this.f149204h;
    }

    /* renamed from: S */
    public void m156304S(int i11) {
        AbstractC3082b0.m15421c("MediaManager", "onGSMStateChanged: state " + i11);
        C22621q0 c22621q0 = new C22621q0();
        if (!c22621q0.m117003z()) {
            return;
        }
        if (c22621q0.m116995r() && c22621q0.m116994q() && i11 == 1) {
            m156319h0();
            m156316e0();
            return;
        }
        if (!c22621q0.m116999v() && !c22621q0.m117000w()) {
            return;
        }
        if (i11 != 0) {
            AbstractC3082b0.m15421c("MediaManager", "onGSMStateChanged: stop Ring and unfocus");
            m156328q0();
        }
        if (i11 != 0) {
            if (i11 == 2 && !this.f149203g) {
                this.f149203g = true;
                AbstractC3082b0.m15421c("MediaManager", "onGSMStateChanged: immediateHangUp");
                c22621q0.m116976B(5);
                AbstractC32273e3.m155748Q().mo116929a(-17, 2);
                return;
            }
            return;
        }
        if (this.f149203g) {
            AbstractC3082b0.m15421c("MediaManager", "onGSMStateChanged: reset hasBeenHoldByGSM");
            this.f149203g = false;
        }
    }

    /* renamed from: T */
    public void m156305T(int i11) {
        new c(i11).start();
    }

    /* renamed from: U */
    public void m156306U() {
        this.f149200d.m156346l();
    }

    /* renamed from: V */
    public void m156307V() {
        this.f149200d.m156338d();
    }

    /* renamed from: W */
    public void m156308W() {
        this.f149200d.m156343i();
    }

    /* renamed from: X */
    public void m156309X(String str) {
        this.f149200d.m156340f(str);
    }

    /* renamed from: Y */
    public void m156310Y(String str, String str2) {
        this.f149200d.m156342h(str, str2);
    }

    /* renamed from: Z */
    public void m156311Z() {
        this.f149200d.m156345k();
    }

    /* renamed from: a0 */
    public void m156312a0() {
        this.f149200d.m156337c(false);
        this.f149200d.m156344j(false);
        this.f149200d.m156336b(true);
    }

    /* renamed from: b0 */
    public void m156313b0() {
        if (!this.f149204h) {
            this.f149200d.m156337c(true);
        }
    }

    /* renamed from: c0 */
    public void m156314c0() {
        this.f149200d.m156341g(true);
    }

    /* renamed from: d0 */
    public void m156315d0() {
        if (!this.f149204h) {
            this.f149200d.m156344j(true);
        }
    }

    /* renamed from: e0 */
    public void m156316e0() {
        this.f149200d.m156337c(false);
    }

    /* renamed from: f0 */
    public void m156317f0() {
        this.f149200d.m156347m();
    }

    /* renamed from: g0 */
    public void m156318g0() {
        this.f149200d.m156341g(false);
    }

    /* renamed from: h0 */
    public void m156319h0() {
        this.f149200d.m156344j(false);
        this.f149200d.m156336b(false);
    }

    /* renamed from: i0 */
    void m156320i0(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, boolean z11) {
        try {
            AbstractC2351i.m12327a(AbstractC3096i0.m15574y(), broadcastReceiver, intentFilter, z11);
        } catch (Exception unused) {
        }
    }

    /* renamed from: j0 */
    public void m156321j0(boolean z11) {
        HandlerC32324p.m156351d(new b(z11));
    }

    /* renamed from: k0 */
    public void m156322k0(boolean z11) {
        TelephonyManager telephonyManager;
        AbstractC3082b0.m15421c("MediaManager", "Media startCall");
        AbstractC3096i0.m15512R0(true);
        this.f149204h = false;
        this.f149202f = false;
        this.f149217u = false;
        this.f149219w = false;
        this.f149216t = false;
        this.f149215s = false;
        m156327p0();
        if (!this.f149201e.isHeld()) {
            this.f149201e.acquire();
        }
        this.f149203g = false;
        AbstractC3082b0.m15421c("MediaManager", "Listen for phone state ");
        if (AbstractC23057e7.m118298e() && (telephonyManager = this.f149197a) != null) {
            telephonyManager.listen(this.f149196A, 32);
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("m.voip.api.action.ACTION_NOTI_END_CALL");
        m156320i0(this.f149212p, intentFilter, true);
        try {
            this.f149198b.registerMediaButtonEventReceiver(this.f149206j);
        } catch (Exception e11) {
            AbstractC3082b0.m15423e("MediaManager", "registerMediaButtonEventReceiver failed", e11);
        }
    }

    /* renamed from: l0 */
    public void m156323l0() {
        m156309X(AbstractC22609k0.f110732h);
    }

    /* renamed from: m0 */
    public void m156324m0() {
        m156309X(AbstractC22609k0.f110726b);
    }

    /* renamed from: n0 */
    public synchronized void m156325n0(int i11) {
        String str;
        try {
            try {
                if (!this.f149199c.m15729f()) {
                    if (AbstractC23304d.f113267D1 != 0) {
                        int intValue = ((Integer) new C22083e().m101509a(Boolean.TRUE)).intValue();
                        if (intValue != 0) {
                            if (intValue != 1) {
                                if (intValue != 2) {
                                    if (intValue != 3) {
                                        str = AbstractC22609k0.f110725a;
                                        AbstractC0924m0.m3323Op(0);
                                        AbstractC0924m0.m3497Up(str);
                                    } else {
                                        str = AbstractC0924m0.m3683b7();
                                        RingtoneData ringtoneData = (RingtoneData) new C22086h().m101506a();
                                        if (ringtoneData == null || !str.contains(ringtoneData.m58732d())) {
                                            str = AbstractC22609k0.f110725a;
                                        }
                                    }
                                } else {
                                    str = AbstractC0924m0.m3713c7();
                                }
                            } else {
                                str = m156294v().toString();
                            }
                        } else {
                            str = AbstractC22609k0.f110725a;
                        }
                    } else {
                        str = AbstractC22609k0.f110725a;
                        AbstractC0924m0.m3323Op(0);
                        AbstractC0924m0.m3497Up(str);
                    }
                    this.f149199c.m15730i(i11, str);
                } else {
                    AbstractC3082b0.m15421c("MediaManager", "Already ringing ....");
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: o0 */
    public void m156326o0() {
        try {
            if (this.f149204h) {
                return;
            }
            this.f149204h = true;
            if (this.f149215s) {
                ContentResolver contentResolver = AbstractC3096i0.m15574y().getContentResolver();
                try {
                    if (this.f149214r != 0) {
                        Settings.System.putInt(contentResolver, "wifi_sleep_policy", this.f149214r);
                        this.f149214r = 0;
                    }
                } catch (Exception unused) {
                    AbstractC3082b0.m15422d("MediaManager", "Cannot change wifi policy!");
                }
                this.f149215s = false;
            }
            AbstractC3082b0.m15424f("MediaManager", "Media stopCall");
            m156328q0();
            m156319h0();
            m156318g0();
            m156316e0();
            m156330r0();
            m156332s0(this.f149212p);
            try {
                this.f149198b.unregisterMediaButtonEventReceiver(this.f149206j);
            } catch (Exception e11) {
                AbstractC3082b0.m15423e("MediaManager", "stopCall : " + e11.getMessage(), e11);
            }
            VoipAudioHelper.f148751a.m155638q0(AbstractC3096i0.m15574y());
            WifiManager.WifiLock wifiLock = this.f149201e;
            if (wifiLock != null && wifiLock.isHeld()) {
                AbstractC3082b0.m15421c("MediaManager", "release Wifi Lock!");
                this.f149201e.release();
            }
            AbstractC3096i0.m15512R0(false);
        } catch (Exception e12) {
            AbstractC20110a.m104539h(e12);
            AbstractC3082b0.m15424f("MediaManager", "stopCall with ex " + e12);
        }
    }

    /* renamed from: p0 */
    synchronized void m156327p0() {
        try {
            try {
                if (this.f149209m.isPlaying()) {
                    this.f149209m.stop();
                }
                this.f149209m.reset();
                this.f149209m.setOnCompletionListener(null);
                this.f149209m.setOnPreparedListener(null);
            } catch (Exception e11) {
                AbstractC3082b0.m15422d("MediaManager", "stopMediaPlayer failed " + e11.toString());
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: q0 */
    public synchronized void m156328q0() {
        C3114z c3114z = this.f149199c;
        if (c3114z != null && c3114z.m15729f()) {
            this.f149199c.m15731l();
        }
    }

    /* renamed from: r */
    public void m156329r() {
        C23744a.m124114c().m124116d(ZAbstractBase.ZVU_BLEND_PERCENTAGE, new Object[0]);
    }

    /* renamed from: r0 */
    public void m156330r0() {
        TelephonyManager telephonyManager;
        try {
            if (AbstractC23057e7.m118298e() && (telephonyManager = this.f149197a) != null) {
                telephonyManager.listen(this.f149196A, 0);
            }
        } catch (Exception e11) {
            AbstractC3082b0.m15423e("MediaManager", "unregisTelephonyListener : " + e11.getMessage(), e11);
        }
    }

    /* renamed from: s */
    public void m156331s() {
        if (!this.f149215s) {
            this.f149215s = true;
            m156328q0();
            m156319h0();
            m156316e0();
            AbstractC3082b0.m15421c("MediaManager", "Media changeTo confirm = " + this.f149198b.getMode());
            try {
                ContentResolver contentResolver = AbstractC3096i0.m15574y().getContentResolver();
                this.f149214r = Settings.System.getInt(contentResolver, "wifi_sleep_policy", 0);
                Settings.System.putInt(contentResolver, "wifi_sleep_policy", 2);
            } catch (Exception unused) {
                AbstractC3082b0.m15422d("MediaManager", "Cannot change wifi policy!");
            }
        }
    }

    /* renamed from: s0 */
    void m156332s0(BroadcastReceiver broadcastReceiver) {
        try {
            AbstractC3096i0.m15574y().unregisterReceiver(broadcastReceiver);
        } catch (Exception unused) {
        }
    }

    /* renamed from: t0 */
    public void m156333t0() {
        C3114z c3114z = this.f149199c;
        if (c3114z != null) {
            c3114z.m15732o(100, 0, 0);
        }
    }

    /* renamed from: u */
    public C22598f m156334u() {
        C22598f c22598f = new C22598f();
        c22598f.f110659a = this.f149202f;
        c22598f.f110661c = VoipAudioHelper.m155575V();
        c22598f.f110660b = VoipAudioHelper.m155579X();
        c22598f.f110662d = !c22598f.f110661c;
        return c22598f;
    }
}
