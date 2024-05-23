package com.zing.zalo.common;

import ag0.AbstractC0837p0;
import am.AbstractC0924m0;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.PowerManager;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import androidx.work.AbstractC2147g0;
import au.AbstractC2361n;
import au.C2357l;
import b40.C2546u;
import bn0.AbstractC2933b;
import bp0.AbstractC3096i0;
import bz.C3162g;
import com.zing.zalo.AbstractC8012e0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.common.C7853b;
import com.zing.zalo.common.InterfaceC7854c;
import com.zing.zalo.data.entity.chat.message.MessageId;
import cp0.C17553b;
import dj.C17945a0;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import gw.AbstractC19646n0;
import ho0.AbstractC20110a;
import java.io.FileInputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.HashMap;
import li.AbstractC22490a;
import me0.AbstractC23041d2;
import me0.AbstractC23057e7;
import me0.AbstractC23104j;
import mm0.AbstractC23349d;
import mm0.AbstractC23350e;
import on0.AbstractC24341v;
import on0.AbstractC24342w;
import on0.C24321d;
import p207he.C20024r;
import p239ih.C20556f;
import p308kx.C21965i;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;
import p363nh.AbstractC23775p0;
import p405ov.C24559a;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import th.AbstractC26681b;
import vg.AbstractC28054e7;
import vg.C28023b6;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* renamed from: com.zing.zalo.common.b */
/* loaded from: classes.dex */
public final class C7853b {
    public static final a Companion = new a(null);

    /* renamed from: N */
    private static volatile C7853b f42187N;

    /* renamed from: A */
    private long f42188A;

    /* renamed from: B */
    private c f42189B;

    /* renamed from: C */
    private C21965i f42190C;

    /* renamed from: D */
    private final Object f42191D;

    /* renamed from: E */
    private boolean f42192E;

    /* renamed from: F */
    private SensorManager f42193F;

    /* renamed from: G */
    private Sensor f42194G;

    /* renamed from: H */
    private boolean f42195H;

    /* renamed from: I */
    private MessageId f42196I;

    /* renamed from: J */
    private long f42197J;

    /* renamed from: K */
    private final g f42198K;

    /* renamed from: L */
    private final SensorEventListener f42199L;

    /* renamed from: M */
    private final AudioManager.OnAudioFocusChangeListener f42200M;

    /* renamed from: a */
    private final InterfaceC7854c f42201a;

    /* renamed from: b */
    private final InterfaceC24854k f42202b;

    /* renamed from: c */
    private MediaPlayer f42203c;

    /* renamed from: d */
    private C17553b f42204d;

    /* renamed from: e */
    private String f42205e;

    /* renamed from: f */
    private MessageId f42206f;

    /* renamed from: g */
    private int f42207g;

    /* renamed from: h */
    private int f42208h;

    /* renamed from: i */
    private boolean f42209i;

    /* renamed from: j */
    private boolean f42210j;

    /* renamed from: k */
    private boolean f42211k;

    /* renamed from: l */
    private boolean f42212l;

    /* renamed from: m */
    private boolean f42213m;

    /* renamed from: n */
    private int f42214n;

    /* renamed from: o */
    private int f42215o;

    /* renamed from: p */
    private int f42216p;

    /* renamed from: q */
    private int f42217q;

    /* renamed from: r */
    private AbstractC28054e7 f42218r;

    /* renamed from: s */
    private d f42219s;

    /* renamed from: t */
    private b f42220t;

    /* renamed from: u */
    private int f42221u;

    /* renamed from: v */
    private int f42222v;

    /* renamed from: w */
    private boolean f42223w;

    /* renamed from: x */
    private boolean f42224x;

    /* renamed from: y */
    private boolean f42225y;

    /* renamed from: z */
    private boolean f42226z;

    /* renamed from: com.zing.zalo.common.b$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C7853b m40150a() {
            InterfaceC7854c c7861d;
            C7853b c7853b = C7853b.f42187N;
            if (c7853b == null) {
                synchronized (this) {
                    try {
                        if (AbstractC0924m0.m3303O5() == e.f42230r.m40160c()) {
                            c7861d = new C7862e();
                        } else {
                            c7861d = new C7861d();
                        }
                        c7853b = new C7853b(c7861d, null);
                        C17553b m93488c = C17553b.m93488c(MainApplication.Companion.m35500c());
                        AbstractC19074t.m100207e(m93488c, "getInstance(...)");
                        c7853b.f42204d = m93488c;
                        C7853b.f42187N = c7853b;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            return c7853b;
        }

        /* renamed from: b */
        public final String m40151b(Throwable th2) {
            AbstractC19074t.m100208f(th2, "throwable");
            StringWriter stringWriter = new StringWriter();
            th2.printStackTrace(new PrintWriter(stringWriter));
            String stringWriter2 = stringWriter.toString();
            AbstractC19074t.m100207e(stringWriter2, "toString(...)");
            return stringWriter2;
        }

        /* renamed from: c */
        public final void m40152c() {
            if (AbstractC23309i.m121867eg()) {
                int m12355b = AbstractC2361n.m12355b(MainApplication.Companion.m35500c());
                if (m12355b != 0 && !m40150a().m40137k0() && AbstractC23309i.m121825dc() && m12355b > 1 && !C3162g.f13363a.m15938y()) {
                    m40150a().m40100N();
                    return;
                }
                return;
            }
            try {
                if (C28023b6.m141250h0().f130687e == 2) {
                    if (Settings.Global.getInt(MainApplication.Companion.m35500c().getContentResolver(), "zen_mode") != 0) {
                        return;
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("SoundManager", e11);
            }
            if (!m40150a().m40137k0() && AbstractC23309i.m121825dc() && !C3162g.f13363a.m15938y()) {
                m40150a().m40100N();
            }
        }
    }

    /* renamed from: com.zing.zalo.common.b$b */
    /* loaded from: classes3.dex */
    public interface b {
        /* renamed from: a */
        void mo40153a(String str);
    }

    /* renamed from: com.zing.zalo.common.b$c */
    /* loaded from: classes3.dex */
    public static final class c {

        /* renamed from: a */
        private final String f42227a;

        /* renamed from: b */
        private final long f42228b;

        public c(String str, long j11) {
            AbstractC19074t.m100208f(str, "path");
            this.f42227a = str;
            this.f42228b = j11;
        }

        /* renamed from: a */
        public final long m40154a() {
            return this.f42228b;
        }

        /* renamed from: b */
        public final String m40155b() {
            return this.f42227a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return AbstractC19074t.m100204b(this.f42227a, cVar.f42227a) && this.f42228b == cVar.f42228b;
        }

        public int hashCode() {
            return (this.f42227a.hashCode() * 31) + AbstractC2147g0.m11521a(this.f42228b);
        }

        public String toString() {
            return "PauseSavedData(path=" + this.f42227a + ", currentPosition=" + this.f42228b + ")";
        }
    }

    /* renamed from: com.zing.zalo.common.b$d */
    /* loaded from: classes3.dex */
    public interface d {
        /* renamed from: a */
        void mo40156a(String str, int i11);

        /* renamed from: b */
        void mo40157b(String str, String str2);

        /* renamed from: c */
        void mo40158c(String str, int i11);

        void onAudioFocusChange(int i11);
    }

    /* renamed from: com.zing.zalo.common.b$e */
    /* loaded from: classes.dex */
    public static final class e extends Enum {

        /* renamed from: q */
        public static final e f42229q = new e("ANDROID", 0, 0);

        /* renamed from: r */
        public static final e f42230r = new e("ZALO", 1, 1);

        /* renamed from: s */
        private static final /* synthetic */ e[] f42231s;

        /* renamed from: t */
        private static final /* synthetic */ InterfaceC30165a f42232t;

        /* renamed from: p */
        private final int f42233p;

        static {
            e[] m40159b = m40159b();
            f42231s = m40159b;
            f42232t = AbstractC30166b.m148796a(m40159b);
        }

        private e(String str, int i11, int i12) {
            super(str, i11);
            this.f42233p = i12;
        }

        /* renamed from: b */
        private static final /* synthetic */ e[] m40159b() {
            return new e[]{f42229q, f42230r};
        }

        public static e valueOf(String str) {
            return (e) Enum.valueOf(e.class, str);
        }

        public static e[] values() {
            return (e[]) f42231s.clone();
        }

        /* renamed from: c */
        public final int m40160c() {
            return this.f42233p;
        }
    }

    /* renamed from: com.zing.zalo.common.b$f */
    /* loaded from: classes3.dex */
    public static final class f {

        /* renamed from: a */
        private final a f42234a;

        /* renamed from: b */
        private long f42235b;

        /* renamed from: com.zing.zalo.common.b$f$a */
        /* loaded from: classes3.dex */
        public static final class a extends Enum {

            /* renamed from: q */
            public static final a f42236q = new a("SUCCESS", 0, 0);

            /* renamed from: r */
            public static final a f42237r = new a("FAILED", 1, -1);

            /* renamed from: s */
            private static final /* synthetic */ a[] f42238s;

            /* renamed from: t */
            private static final /* synthetic */ InterfaceC30165a f42239t;

            /* renamed from: p */
            private final int f42240p;

            static {
                a[] m40163b = m40163b();
                f42238s = m40163b;
                f42239t = AbstractC30166b.m148796a(m40163b);
            }

            private a(String str, int i11, int i12) {
                super(str, i11);
                this.f42240p = i12;
            }

            /* renamed from: b */
            private static final /* synthetic */ a[] m40163b() {
                return new a[]{f42236q, f42237r};
            }

            public static a valueOf(String str) {
                return (a) Enum.valueOf(a.class, str);
            }

            public static a[] values() {
                return (a[]) f42238s.clone();
            }
        }

        public f(a aVar, long j11) {
            AbstractC19074t.m100208f(aVar, "result");
            this.f42234a = aVar;
            this.f42235b = j11;
        }

        /* renamed from: a */
        public final long m40161a() {
            return this.f42235b;
        }

        /* renamed from: b */
        public final a m40162b() {
            return this.f42234a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.f42234a == fVar.f42234a && this.f42235b == fVar.f42235b;
        }

        public int hashCode() {
            return (this.f42234a.hashCode() * 31) + AbstractC2147g0.m11521a(this.f42235b);
        }

        public String toString() {
            return "ResumeResult(result=" + this.f42234a + ", pausedPosition=" + this.f42235b + ")";
        }
    }

    /* renamed from: com.zing.zalo.common.b$g */
    /* loaded from: classes.dex */
    public static final class g extends Handler {
        g(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            AbstractC19074t.m100208f(message, "msg");
            int i11 = message.what;
            if (i11 == 2) {
                C7853b.this.m40072p1();
            } else if (i11 == 3) {
                C7853b.this.m40076r1();
            } else if (i11 == 4) {
                C7853b.this.m40074q1();
            } else if (i11 != 5) {
                if (i11 == 6) {
                    C7853b.this.f42221u += 100;
                    C7853b.this.m40071p0();
                }
            } else {
                C7853b.this.f42222v += 100;
                C7853b.this.m40069o0();
            }
            super.handleMessage(message);
        }
    }

    /* renamed from: com.zing.zalo.common.b$h */
    /* loaded from: classes3.dex */
    public static final class h implements InterfaceC7854c.b {
        h() {
        }

        @Override // com.zing.zalo.common.InterfaceC7854c.b
        /* renamed from: a */
        public void mo40164a(InterfaceC7854c interfaceC7854c) {
            AbstractC19074t.m100208f(interfaceC7854c, "player");
            b bVar = C7853b.this.f42220t;
            if (bVar != null) {
                bVar.mo40153a(C7853b.this.m40103Q());
            }
            d dVar = C7853b.this.f42219s;
            if (dVar != null) {
                dVar.mo40156a(C7853b.this.m40103Q(), 0);
            }
            C7853b.this.f42215o++;
            if (C7853b.this.f42215o < C7853b.this.f42214n) {
                C7853b.this.f42201a.seekTo(0L);
                C7853b.this.f42201a.start();
                return;
            }
            if (C7853b.this.m40135j0()) {
                long currentTimeMillis = System.currentTimeMillis();
                C7853b c7853b = C7853b.this;
                C7853b.m40080u0(c7853b, c7853b.m40103Q(), currentTimeMillis - C7853b.this.f42197J, null, 4, null);
            }
            C7853b.this.m40136j1();
            C7853b.this.f42189B = null;
        }
    }

    /* renamed from: com.zing.zalo.common.b$i */
    /* loaded from: classes3.dex */
    public static final class i implements InterfaceC7854c.d {
        i() {
        }

        @Override // com.zing.zalo.common.InterfaceC7854c.d
        /* renamed from: a */
        public void mo40165a(InterfaceC7854c interfaceC7854c) {
            AbstractC19074t.m100208f(interfaceC7854c, "player");
            String m40103Q = C7853b.this.m40103Q();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Prepare OK: ");
            sb2.append(m40103Q);
            C7853b.this.m40089z0();
            if (!C7853b.this.f42226z) {
                C7853b c7853b = C7853b.this;
                c7853b.m40104Q0(c7853b.f42207g);
            }
            if (C7853b.this.m40135j0()) {
                C7853b.this.f42197J = System.currentTimeMillis();
            }
        }
    }

    /* renamed from: com.zing.zalo.common.b$j */
    /* loaded from: classes3.dex */
    public static final class j implements InterfaceC7854c.c {
        j() {
        }

        @Override // com.zing.zalo.common.InterfaceC7854c.c
        /* renamed from: a */
        public boolean mo40166a(InterfaceC7854c interfaceC7854c, int i11, int i12) {
            AbstractC19074t.m100208f(interfaceC7854c, "player");
            try {
                C7853b.this.f42210j = false;
                AbstractC23350e.m122774d("SoundManager", "Prepare failed: " + i11 + "; " + i12);
                AbstractC28054e7 m40120b0 = C7853b.this.m40120b0();
                if (m40120b0 != null) {
                    m40120b0.mo16496a(i11);
                }
                C7853b.this.m40144o1();
                C7853b.this.m40043M();
            } catch (Exception e11) {
                AbstractC23350e.m122776f("SoundManager", e11);
            }
            return false;
        }
    }

    /* renamed from: com.zing.zalo.common.b$k */
    /* loaded from: classes.dex */
    public static final class k implements SensorEventListener {
        k() {
        }

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i11) {
            AbstractC19074t.m100208f(sensor, "sensor");
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            boolean z11;
            AbstractC19074t.m100208f(sensorEvent, "event");
            try {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("event:");
                sb2.append(sensorEvent);
                if (sensorEvent.sensor.getType() == 8) {
                    float f11 = sensorEvent.values[0];
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Proximity Sensor Reading:");
                    sb3.append(f11);
                    float f12 = sensorEvent.values[0];
                    if (f12 >= 0.0d && f12 < 5.0f && f12 < sensorEvent.sensor.getMaximumRange()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (C7853b.this.f42217q == 1) {
                        C7853b.this.f42208h = 3;
                    } else if (!z11) {
                        C7853b.this.f42208h = 3;
                    } else {
                        AbstractC23304d.f113286I0 = true;
                        C7853b.this.f42208h = 0;
                    }
                    if (C7853b.this.m40137k0()) {
                        if (AbstractC23309i.m121977hc()) {
                            C7853b.this.f42198K.removeMessages(2);
                            C7853b.this.f42198K.sendEmptyMessageDelayed(2, 500L);
                            if (z11) {
                                C2546u.f10363a.m12829p();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    C7853b.this.m40101O0();
                    C7853b.this.m40144o1();
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("SoundManager", e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.common.b$l */
    /* loaded from: classes.dex */
    public static final class l extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final l f42246q = new l();

        l() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final HashMap mo12V4() {
            return new HashMap();
        }
    }

    public /* synthetic */ C7853b(InterfaceC7854c interfaceC7854c, AbstractC19060k abstractC19060k) {
        this(interfaceC7854c);
    }

    /* renamed from: F0 */
    private final void m40034F0(String str, int i11, boolean z11, boolean z12) {
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("playSound(): path=");
            sb2.append(str);
            sb2.append(", currentPos=");
            sb2.append(i11);
            sb2.append(", speakerOn=");
            sb2.append(z11);
            C7862e c7862e = null;
            if (z11) {
                int i12 = this.f42208h;
                if (i12 != -1) {
                    this.f42207g = i12;
                } else {
                    this.f42207g = 3;
                }
            } else {
                this.f42207g = 0;
                C17553b c17553b = this.f42204d;
                if (c17553b == null) {
                    AbstractC19074t.m100223u("bluetoothUtil");
                    c17553b = null;
                }
                if (c17553b.m93491b()) {
                    C17553b c17553b2 = this.f42204d;
                    if (c17553b2 == null) {
                        AbstractC19074t.m100223u("bluetoothUtil");
                        c17553b2 = null;
                    }
                    c17553b2.m93494h(true);
                }
            }
            m40046P0();
            m40060g0();
            this.f42201a.reset();
            if (z12) {
                m40050X0();
            }
            Object systemService = MainApplication.Companion.m35500c().getSystemService("audio");
            AbstractC19074t.m100206d(systemService, "null cannot be cast to non-null type android.media.AudioManager");
            AudioManager audioManager = (AudioManager) systemService;
            if (this.f42207g == 3) {
                m40149w0("SoundManger#playSound().STREAM_MUSIC", true);
                this.f42201a.setAudioStreamType(0);
            } else {
                m40149w0("SoundManger#playSound().STREAM_VOICE_CALL", false);
                audioManager.setSpeakerphoneOn(false);
                this.f42201a.setAudioStreamType(1);
            }
            this.f42216p = i11;
            this.f42205e = str;
            this.f42210j = true;
            this.f42217q = this.f42201a.mo40174g(str);
            InterfaceC7854c interfaceC7854c = this.f42201a;
            if (interfaceC7854c instanceof C7862e) {
                c7862e = (C7862e) interfaceC7854c;
            }
            if (c7862e != null) {
                c7862e.seekTo(this.f42216p);
            }
            if (this.f42217q == 0) {
                m40097L();
            }
        } catch (Exception e11) {
            C24559a.m127935e("NaN", str, e11);
            this.f42210j = false;
            AbstractC28054e7 abstractC28054e7 = this.f42218r;
            if (abstractC28054e7 != null) {
                abstractC28054e7.mo16498e();
            }
            AbstractC23350e.m122776f("SoundManager", e11);
            m40144o1();
        }
    }

    /* renamed from: G0 */
    private final void m40036G0(int i11) {
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: vg.g7

            /* renamed from: p */
            public final /* synthetic */ int f130986p;

            public /* synthetic */ RunnableC28074g7(int i112) {
                r1 = i112;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C7853b.m40038H0(r1);
            }
        });
    }

    /* renamed from: H0 */
    public static final void m40038H0(int i11) {
        try {
            MediaPlayer create = MediaPlayer.create(MainApplication.Companion.m35500c(), i11);
            create.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: vg.i7
                @Override // android.media.MediaPlayer.OnCompletionListener
                public final void onCompletion(MediaPlayer mediaPlayer) {
                    C7853b.m40040I0(mediaPlayer);
                }
            });
            create.start();
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SoundManager", e11);
        }
    }

    /* renamed from: I0 */
    public static final void m40040I0(MediaPlayer mediaPlayer) {
        if (mediaPlayer != null) {
            try {
                mediaPlayer.release();
            } catch (Exception e11) {
                AbstractC23350e.m122776f("SoundManager", e11);
            }
        }
    }

    /* renamed from: M */
    public final void m40043M() {
        this.f42195H = false;
        this.f42196I = null;
        this.f42197J = 0L;
    }

    /* renamed from: N0 */
    private final void m40044N0() {
        Sensor sensor;
        try {
            if (this.f42193F == null) {
                Object systemService = MainApplication.Companion.m35500c().getSystemService("sensor");
                AbstractC19074t.m100206d(systemService, "null cannot be cast to non-null type android.hardware.SensorManager");
                this.f42193F = (SensorManager) systemService;
            }
            if (this.f42194G == null) {
                SensorManager sensorManager = this.f42193F;
                if (sensorManager != null) {
                    sensor = sensorManager.getDefaultSensor(8);
                } else {
                    sensor = null;
                }
                this.f42194G = sensor;
            }
            SensorManager sensorManager2 = this.f42193F;
            if (sensorManager2 != null) {
                sensorManager2.registerListener(this.f42199L, this.f42194G, 3);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SoundManager", e11);
        }
    }

    /* renamed from: O */
    public static final void m40045O(C7853b c7853b) {
        MediaPlayer mediaPlayer;
        AbstractC19074t.m100208f(c7853b, "this$0");
        try {
            long currentTimeMillis = System.currentTimeMillis();
            if (Math.abs(currentTimeMillis - c7853b.f42188A) >= 5000) {
                c7853b.f42188A = currentTimeMillis;
                try {
                    MediaPlayer mediaPlayer2 = c7853b.f42203c;
                    if (mediaPlayer2 != null && mediaPlayer2.isPlaying() && (mediaPlayer = c7853b.f42203c) != null) {
                        mediaPlayer.stop();
                    }
                    MediaPlayer mediaPlayer3 = c7853b.f42203c;
                    if (mediaPlayer3 != null) {
                        mediaPlayer3.release();
                    }
                } catch (Exception e11) {
                    AbstractC23350e.m122776f("SoundManager", e11);
                }
                MediaPlayer mediaPlayer4 = new MediaPlayer();
                c7853b.f42203c = mediaPlayer4;
                mediaPlayer4.setAudioStreamType(5);
                Uri defaultUri = RingtoneManager.getDefaultUri(2);
                MediaPlayer mediaPlayer5 = c7853b.f42203c;
                if (mediaPlayer5 != null) {
                    mediaPlayer5.setDataSource(MainApplication.Companion.m35500c(), defaultUri);
                }
                MediaPlayer mediaPlayer6 = c7853b.f42203c;
                if (mediaPlayer6 != null) {
                    mediaPlayer6.prepare();
                }
                MediaPlayer mediaPlayer7 = c7853b.f42203c;
                if (mediaPlayer7 != null) {
                    mediaPlayer7.start();
                }
            }
        } catch (Exception e12) {
            AbstractC23350e.m122778h(e12);
            try {
                MediaPlayer mediaPlayer8 = c7853b.f42203c;
                if (mediaPlayer8 != null) {
                    mediaPlayer8.release();
                }
            } catch (Exception e13) {
                AbstractC23350e.m122776f("SoundManager", e13);
            }
            c7853b.f42203c = null;
        }
    }

    /* renamed from: P0 */
    private final synchronized void m40046P0() {
        try {
            try {
                if (m40137k0()) {
                    this.f42201a.stop();
                }
                this.f42201a.release();
            } catch (Exception e11) {
                AbstractC23350e.m122776f("SoundManager", e11);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: R */
    private final int m40047R() {
        try {
            return (int) this.f42201a.getCurrentPosition();
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SoundManager", e11);
            return 0;
        }
    }

    /* renamed from: S */
    private final int m40048S() {
        try {
            if (m40137k0()) {
                int currentPosition = (int) this.f42201a.getCurrentPosition();
                int duration = (int) this.f42201a.getDuration();
                if (currentPosition < 0 || duration <= 0) {
                    return 0;
                }
                int i11 = duration - currentPosition;
                if (1 <= i11 && i11 < 100) {
                    currentPosition = duration;
                }
                return (currentPosition * 100) / duration;
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SoundManager", e11);
        }
        return 0;
    }

    /* renamed from: U0 */
    private final void m40049U0() {
        try {
            if (C20024r.m103941j() || m40133i0() || AbstractC3096i0.m15515T() || !this.f42212l) {
                return;
            }
            this.f42212l = false;
            this.f42208h = -1;
            Object systemService = MainApplication.Companion.m35500c().getSystemService("audio");
            AbstractC19074t.m100206d(systemService, "null cannot be cast to non-null type android.media.AudioManager");
            m40149w0("SoundManger#resetSpeakerPhone()", this.f42213m);
            ((AudioManager) systemService).setSpeakerphoneOn(this.f42213m);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SoundManager", e11);
        }
    }

    /* renamed from: X0 */
    private final void m40050X0() {
        try {
            this.f42212l = true;
            Object systemService = MainApplication.Companion.m35500c().getSystemService("audio");
            AbstractC19074t.m100206d(systemService, "null cannot be cast to non-null type android.media.AudioManager");
            this.f42213m = ((AudioManager) systemService).isSpeakerphoneOn();
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SoundManager", e11);
        }
    }

    /* renamed from: a0 */
    public static final C7853b m40052a0() {
        return Companion.m40150a();
    }

    /* renamed from: d0 */
    private final HashMap m40056d0() {
        return (HashMap) this.f42202b.getValue();
    }

    /* renamed from: f0 */
    private final boolean m40059f0(String str) {
        return m40056d0().containsKey(str);
    }

    /* renamed from: g0 */
    private final synchronized void m40060g0() {
        try {
            this.f42201a.mo40168a(MainApplication.Companion.m35500c());
            this.f42201a.mo40170c(new h());
            this.f42201a.mo40171d(new i());
            this.f42201a.mo40169b(new j());
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SoundManager", e11);
        }
    }

    /* renamed from: l1 */
    public static final void m40065l1(C7853b c7853b) {
        AbstractC19074t.m100208f(c7853b, "this$0");
        c7853b.m40136j1();
    }

    /* renamed from: o0 */
    public final void m40069o0() {
        try {
            if (!this.f42224x) {
                return;
            }
            int i11 = this.f42222v;
            if (i11 > 2000) {
                this.f42198K.removeMessages(5);
                this.f42224x = false;
                this.f42222v = 0;
                m40136j1();
                return;
            }
            if (!this.f42223w) {
                float f11 = 1.0f - ((i11 * 1.0f) / ((float) 2000));
                m40134i1(f11, f11);
            }
            this.f42198K.sendEmptyMessageDelayed(5, 100L);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SoundManager", e11);
        }
    }

    /* renamed from: p0 */
    public final void m40071p0() {
        try {
            if (this.f42225y) {
                int i11 = this.f42221u;
                if (i11 > 2000) {
                    m40106S0();
                    m40134i1(1.0f, 1.0f);
                } else {
                    float f11 = (i11 * 1.0f) / ((float) 2000);
                    m40134i1(f11, f11);
                    this.f42198K.sendEmptyMessageDelayed(6, 100L);
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SoundManager", e11);
        }
    }

    /* renamed from: p1 */
    public final void m40072p1() {
        boolean z11;
        try {
            if (m40137k0() && this.f42208h != this.f42207g) {
                int currentPosition = (int) this.f42201a.getCurrentPosition();
                if (this.f42208h == 3) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                m40034F0(this.f42205e, currentPosition, z11, false);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SoundManager", e11);
        }
    }

    /* renamed from: q1 */
    public final void m40074q1() {
        d dVar = this.f42219s;
        if (dVar != null) {
            dVar.mo40156a(this.f42205e, m40048S());
        }
        this.f42198K.sendEmptyMessageDelayed(4, 25L);
    }

    /* renamed from: r1 */
    public final void m40076r1() {
        d dVar = this.f42219s;
        if (dVar != null) {
            dVar.mo40157b(this.f42205e, m40107T());
        }
        d dVar2 = this.f42219s;
        if (dVar2 != null) {
            dVar2.mo40158c(this.f42205e, m40047R());
        }
        this.f42198K.sendEmptyMessageDelayed(3, 1000L);
    }

    /* renamed from: u0 */
    public static /* synthetic */ void m40080u0(C7853b c7853b, String str, long j11, Throwable th2, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            th2 = null;
        }
        c7853b.m40148t0(str, j11, th2);
    }

    /* renamed from: v0 */
    public static final void m40082v0(String str, MessageId messageId, C7853b c7853b, Throwable th2, long j11) {
        long j12;
        String m127154Q0;
        String str2;
        byte[] m127123s;
        int m40114X;
        AbstractC19074t.m100208f(str, "$file");
        AbstractC19074t.m100208f(messageId, "$msgId");
        AbstractC19074t.m100208f(c7853b, "this$0");
        try {
            j12 = new C20556f(str).m106845r();
        } catch (Exception unused) {
            j12 = 0;
        }
        try {
            m127154Q0 = AbstractC24342w.m127154Q0(str, ".", null, 2, null);
            C17945a0 m102950Z = AbstractC19646n0.m102950Z(messageId.m41048l(), messageId);
            if (m102950Z != null) {
                str2 = m102950Z.m95090b5();
                if (str2 == null) {
                }
                m127123s = AbstractC24341v.m127123s(str2);
                byte[] encode = Base64.encode(m127123s, 0);
                AbstractC19074t.m100207e(encode, "encode(...)");
                String str3 = new String(encode, C24321d.f117408b);
                m40114X = c7853b.m40114X(str);
                if (th2 == null || (m40114X >= 3000 && 2 * j11 < m40114X)) {
                    AbstractC22490a.m116282e(new Exception("Ext " + m127154Q0 + ", size " + j12 + ", duration: " + m40114X + ", elapsed: " + j11 + ", zalo player : " + (c7853b.f42201a instanceof C7862e) + ", " + str3, th2));
                }
                return;
            }
            str2 = "";
            m127123s = AbstractC24341v.m127123s(str2);
            byte[] encode2 = Base64.encode(m127123s, 0);
            AbstractC19074t.m100207e(encode2, "encode(...)");
            String str32 = new String(encode2, C24321d.f117408b);
            m40114X = c7853b.m40114X(str);
            if (th2 == null) {
            }
            AbstractC22490a.m116282e(new Exception("Ext " + m127154Q0 + ", size " + j12 + ", duration: " + m40114X + ", elapsed: " + j11 + ", zalo player : " + (c7853b.f42201a instanceof C7862e) + ", " + str32, th2));
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: x0 */
    public static final void m40085x0() {
        Companion.m40152c();
    }

    /* renamed from: y0 */
    public static final void m40087y0(C7853b c7853b, int i11) {
        AbstractC19074t.m100208f(c7853b, "this$0");
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("onAudioFocusChange(");
            sb2.append(i11);
            sb2.append(")");
            if (i11 != -3) {
                if (i11 != -2 && i11 != -1) {
                    if (i11 == 1 && c7853b.m40137k0()) {
                        c7853b.m40134i1(1.0f, 1.0f);
                    }
                } else if (c7853b.f42209i || c7853b.f42210j) {
                    c7853b.m40091B0();
                }
            } else if (c7853b.m40137k0()) {
                c7853b.m40134i1(0.3f, 0.3f);
            }
            d dVar = c7853b.f42219s;
            if (dVar != null) {
                dVar.onAudioFocusChange(i11);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SoundManager", e11);
        }
    }

    /* renamed from: z0 */
    public final void m40089z0() {
        try {
            this.f42210j = false;
            this.f42209i = true;
            this.f42201a.setScreenOnWhilePlaying(true);
            this.f42201a.seekTo(this.f42216p);
            this.f42201a.setLooping(this.f42211k);
            this.f42201a.start();
            AbstractC28054e7 abstractC28054e7 = this.f42218r;
            if (abstractC28054e7 != null) {
                abstractC28054e7.mo16497c();
            }
            if (!this.f42192E) {
                m40044N0();
            }
            this.f42198K.sendEmptyMessage(3);
            this.f42198K.sendEmptyMessage(4);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SoundManager", e11);
        }
    }

    /* renamed from: A0 */
    public final void m40090A0() {
        AbstractC28054e7 abstractC28054e7 = this.f42218r;
        if (abstractC28054e7 != null) {
            abstractC28054e7.mo64468b();
        }
        this.f42201a.pause();
    }

    /* renamed from: B0 */
    public final void m40091B0() {
        PowerManager powerManager;
        this.f42189B = new c(this.f42201a.mo40173f(), this.f42201a.getCurrentPosition());
        InterfaceC7854c interfaceC7854c = this.f42201a;
        if (interfaceC7854c instanceof C7862e) {
            interfaceC7854c.pause();
            if (this.f42209i || this.f42210j) {
                this.f42209i = false;
                this.f42210j = false;
                AbstractC28054e7 abstractC28054e7 = this.f42218r;
                if (abstractC28054e7 != null) {
                    abstractC28054e7.mo64468b();
                }
            }
            this.f42198K.removeMessages(3);
            this.f42198K.removeMessages(4);
            try {
                Object systemService = MainApplication.Companion.m35500c().getSystemService("power");
                C17553b c17553b = null;
                if (systemService instanceof PowerManager) {
                    powerManager = (PowerManager) systemService;
                } else {
                    powerManager = null;
                }
                if (AbstractC23104j.m118480b(17) || (powerManager != null && powerManager.isInteractive())) {
                    m40144o1();
                }
                C17553b c17553b2 = this.f42204d;
                if (c17553b2 == null) {
                    AbstractC19074t.m100223u("bluetoothUtil");
                    c17553b2 = null;
                }
                if (c17553b2.m93492e() && !C20024r.m103944m()) {
                    C17553b c17553b3 = this.f42204d;
                    if (c17553b3 == null) {
                        AbstractC19074t.m100223u("bluetoothUtil");
                    } else {
                        c17553b = c17553b3;
                    }
                    c17553b.m93494h(false);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("SoundManager", e11);
            }
            m40128g();
            return;
        }
        m40136j1();
    }

    /* renamed from: C0 */
    public final void m40092C0(String str, int i11, AbstractC28054e7 abstractC28054e7, boolean z11) {
        AbstractC19074t.m100208f(str, "path");
        m40124d1(false);
        m40093D0(str, i11, abstractC28054e7, z11, 1, false);
    }

    /* renamed from: D0 */
    public final void m40093D0(String str, int i11, AbstractC28054e7 abstractC28054e7, boolean z11, int i12, boolean z12) {
        AbstractC19074t.m100208f(str, "path");
        this.f42218r = abstractC28054e7;
        this.f42192E = z12;
        this.f42214n = i12;
        this.f42215o = 0;
        m40034F0(str, i11, z11, true);
    }

    /* renamed from: E0 */
    public final void m40094E0(String str, int i11, AbstractC28054e7 abstractC28054e7, boolean z11, boolean z12) {
        AbstractC19074t.m100208f(str, "path");
        m40124d1(false);
        m40093D0(str, i11, abstractC28054e7, z11, 1, z12);
    }

    /* renamed from: J0 */
    public final void m40095J0() {
    }

    /* renamed from: K0 */
    public final void m40096K0() {
        try {
            if (AbstractC23309i.m121825dc() && AbstractC26681b.f126372q) {
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - this.f42188A >= 1000) {
                    this.f42188A = currentTimeMillis;
                    m40036G0(AbstractC8012e0.lock);
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SoundManager", e11);
        }
    }

    /* renamed from: L */
    public final void m40097L() {
        C21965i c21965i;
        try {
            synchronized (this.f42191D) {
                if (this.f42190C == null) {
                    try {
                        Object systemService = MainApplication.Companion.m35500c().getSystemService("power");
                        AbstractC19074t.m100206d(systemService, "null cannot be cast to non-null type android.os.PowerManager");
                        PowerManager powerManager = (PowerManager) systemService;
                        if (!this.f42192E && powerManager.isWakeLockLevelSupported(32)) {
                            C21965i c21965i2 = new C21965i(32, "screenWakeLock");
                            this.f42190C = c21965i2;
                            c21965i2.m114699Q(false);
                        }
                    } catch (Exception e11) {
                        AbstractC23350e.m122776f("SoundManager", e11);
                    }
                }
                C21965i c21965i3 = this.f42190C;
                if ((c21965i3 == null || !c21965i3.m114696B()) && (c21965i = this.f42190C) != null) {
                    c21965i.m114700x();
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            }
        } catch (Exception e12) {
            AbstractC23350e.m122776f("SoundManager", e12);
        }
    }

    /* renamed from: L0 */
    public final void m40098L0() {
        try {
            if (!AbstractC23775p0.m124213r() && AbstractC23309i.m121825dc()) {
                m40100N();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SoundManager", e11);
        }
    }

    /* renamed from: M0 */
    public final void m40099M0() {
        try {
            if (AbstractC23309i.m121825dc() && AbstractC26681b.f126372q) {
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - this.f42188A >= 1000) {
                    this.f42188A = currentTimeMillis;
                    m40036G0(AbstractC8012e0.unlock);
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SoundManager", e11);
        }
    }

    /* renamed from: N */
    public final void m40100N() {
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: vg.f7
            public /* synthetic */ RunnableC28064f7() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C7853b.m40045O(C7853b.this);
            }
        });
    }

    /* renamed from: O0 */
    public final void m40101O0() {
        C21965i c21965i;
        try {
            synchronized (this.f42191D) {
                try {
                    C21965i c21965i2 = this.f42190C;
                    if (c21965i2 != null && c21965i2.m114696B() && (c21965i = this.f42190C) != null) {
                        c21965i.m114697N();
                    }
                    this.f42190C = null;
                    C24848g0 c24848g0 = C24848g0.f119245a;
                } finally {
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SoundManager", e11);
        }
    }

    /* renamed from: P */
    public final void m40102P(float f11, float f12) {
        boolean z11;
        this.f42201a.setVolume(f11, f12);
        if (f11 == 0.0f && f12 == 0.0f) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f42226z = z11;
    }

    /* renamed from: Q */
    public final String m40103Q() {
        return this.f42205e;
    }

    /* renamed from: Q0 */
    public final void m40104Q0(int i11) {
        m40105R0(i11, this.f42200M);
    }

    /* renamed from: R0 */
    public final void m40105R0(int i11, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener) {
        AbstractC19074t.m100208f(onAudioFocusChangeListener, "listener");
        try {
            Object systemService = MainApplication.Companion.m35500c().getSystemService("audio");
            AbstractC19074t.m100206d(systemService, "null cannot be cast to non-null type android.media.AudioManager");
            ((AudioManager) systemService).requestAudioFocus(onAudioFocusChangeListener, i11, 2);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SoundManager", e11);
        }
    }

    /* renamed from: S0 */
    public final void m40106S0() {
        this.f42221u = 0;
        this.f42225y = false;
        this.f42198K.removeMessages(6);
    }

    /* renamed from: T */
    public final String m40107T() {
        try {
            if (m40137k0()) {
                return C2357l.f9883a.m12352b((int) (this.f42201a.getDuration() - this.f42201a.getCurrentPosition()), false);
            }
            return "";
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SoundManager", e11);
            return "";
        }
    }

    /* renamed from: T0 */
    public final void m40108T0() {
        this.f42222v = 0;
        this.f42224x = false;
        m40134i1(0.0f, 0.0f);
        this.f42198K.removeMessages(5);
    }

    /* renamed from: U */
    public final String m40109U(String str) {
        AbstractC19074t.m100208f(str, "path");
        if (!m40059f0(str)) {
            m40114X(str);
        }
        return m40110V(str);
    }

    /* renamed from: V */
    public final String m40110V(String str) {
        Integer num;
        AbstractC19074t.m100208f(str, "path");
        if (str.length() == 0 || (num = (Integer) m40056d0().get(str)) == null) {
            return "";
        }
        return C2357l.f9883a.m12352b(num.intValue(), false);
    }

    /* renamed from: V0 */
    public final void m40111V0() {
        AbstractC28054e7 abstractC28054e7 = this.f42218r;
        if (abstractC28054e7 != null) {
            abstractC28054e7.mo141529d();
        }
        this.f42201a.start();
    }

    /* renamed from: W */
    public final int m40112W() {
        try {
            return (int) this.f42201a.getDuration();
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SoundManager", e11);
            return 0;
        }
    }

    /* renamed from: W0 */
    public final f m40113W0(String str) {
        long j11;
        c cVar;
        String str2;
        AbstractC19074t.m100208f(str, "path");
        c cVar2 = this.f42189B;
        if (cVar2 != null) {
            j11 = cVar2.m40154a();
        } else {
            j11 = 0;
        }
        if (j11 < 0) {
            j11 = 0;
        }
        if ((this.f42201a instanceof C7862e) && (cVar = this.f42189B) != null) {
            C17553b c17553b = null;
            if (cVar != null) {
                str2 = cVar.m40155b();
            } else {
                str2 = null;
            }
            if (AbstractC19074t.m100204b(str, str2)) {
                m40104Q0(this.f42207g);
                this.f42198K.sendEmptyMessage(3);
                this.f42198K.sendEmptyMessage(4);
                f.a mo40172e = this.f42201a.mo40172e();
                if (mo40172e == f.a.f42236q) {
                    this.f42209i = true;
                    this.f42210j = false;
                    C17553b c17553b2 = this.f42204d;
                    if (c17553b2 == null) {
                        AbstractC19074t.m100223u("bluetoothUtil");
                        c17553b2 = null;
                    }
                    if (c17553b2.m93491b()) {
                        C17553b c17553b3 = this.f42204d;
                        if (c17553b3 == null) {
                            AbstractC19074t.m100223u("bluetoothUtil");
                        } else {
                            c17553b = c17553b3;
                        }
                        c17553b.m93494h(true);
                    }
                    if (!this.f42192E) {
                        m40044N0();
                    }
                }
                return new f(mo40172e, j11);
            }
        }
        return new f(f.a.f42237r, 0L);
    }

    /* renamed from: X */
    public final int m40114X(String str) {
        AbstractC19074t.m100208f(str, "path");
        int i11 = 0;
        if (AbstractC23041d2.m118194A(str)) {
            try {
                FileInputStream fileInputStream = new FileInputStream(str);
                try {
                    MediaPlayer mediaPlayer = new MediaPlayer();
                    mediaPlayer.setDataSource(fileInputStream.getFD());
                    mediaPlayer.prepare();
                    i11 = mediaPlayer.getDuration();
                    if (!m40056d0().containsKey(str)) {
                        m40056d0().put(str, Integer.valueOf(i11));
                    }
                    C24848g0 c24848g0 = C24848g0.f119245a;
                    AbstractC2933b.m13890a(fileInputStream, null);
                } finally {
                }
            } catch (Exception e11) {
                AbstractC23041d2.m118208g(str);
                AbstractC23350e.m122776f("SoundManager", e11);
            }
        }
        return i11;
    }

    /* renamed from: Y */
    public final int m40115Y(String str) {
        AbstractC19074t.m100208f(str, "path");
        Integer num = (Integer) m40056d0().get(str);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    /* renamed from: Y0 */
    public final void m40116Y0(int i11) {
        try {
            this.f42201a.seekTo(i11);
            this.f42189B = new c(this.f42201a.mo40173f(), this.f42201a.getCurrentPosition());
            m40043M();
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SoundManager", e11);
        }
    }

    /* renamed from: Z */
    public final int m40117Z() {
        try {
            if (!m40137k0()) {
                return -1;
            }
            return (int) this.f42201a.getCurrentPosition();
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SoundManager", e11);
            return -1;
        }
    }

    /* renamed from: Z0 */
    public final void m40118Z0(String str, int i11) {
        AbstractC19074t.m100208f(str, "path");
        Integer num = (Integer) m40056d0().get(str);
        if (num == null || num.intValue() != i11) {
            m40056d0().put(str, Integer.valueOf(i11));
        }
    }

    /* renamed from: a1 */
    public final void m40119a1(AbstractC28054e7 abstractC28054e7) {
        this.f42218r = abstractC28054e7;
    }

    /* renamed from: b0 */
    public final AbstractC28054e7 m40120b0() {
        return this.f42218r;
    }

    /* renamed from: b1 */
    public final void m40121b1(boolean z11) {
        this.f42195H = z11;
    }

    /* renamed from: c0 */
    public final MessageId m40122c0() {
        return this.f42206f;
    }

    /* renamed from: c1 */
    public final void m40123c1(MessageId messageId) {
        this.f42196I = messageId;
    }

    /* renamed from: d1 */
    public final void m40124d1(boolean z11) {
        this.f42211k = z11;
    }

    /* renamed from: e0 */
    public final int m40125e0(String str) {
        int i11 = 0;
        if (str != null && str.length() != 0 && AbstractC23041d2.m118194A(str)) {
            try {
                FileInputStream fileInputStream = new FileInputStream(str);
                try {
                    MediaPlayer mediaPlayer = new MediaPlayer();
                    mediaPlayer.setDataSource(fileInputStream.getFD());
                    mediaPlayer.prepare();
                    i11 = mediaPlayer.getDuration();
                    if (!m40056d0().containsKey(str)) {
                        m40056d0().put(str, Integer.valueOf(i11));
                    }
                    C24848g0 c24848g0 = C24848g0.f119245a;
                    AbstractC2933b.m13890a(fileInputStream, null);
                } finally {
                }
            } catch (Exception e11) {
                AbstractC23041d2.m118208g(str);
                C3162g.m15911A(C3162g.f13363a, e11, 0L, 2, null);
            }
        }
        return i11;
    }

    /* renamed from: e1 */
    public final void m40126e1(b bVar) {
        this.f42220t = bVar;
    }

    /* renamed from: f1 */
    public final void m40127f1(d dVar) {
        this.f42219s = dVar;
    }

    /* renamed from: g */
    public final void m40128g() {
        m40130h(this.f42200M);
    }

    /* renamed from: g1 */
    public final void m40129g1(MessageId messageId) {
        this.f42206f = messageId;
    }

    /* renamed from: h */
    public final void m40130h(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener) {
        AbstractC19074t.m100208f(onAudioFocusChangeListener, "listener");
        try {
            Object systemService = MainApplication.Companion.m35500c().getSystemService("audio");
            AbstractC19074t.m100206d(systemService, "null cannot be cast to non-null type android.media.AudioManager");
            ((AudioManager) systemService).abandonAudioFocus(onAudioFocusChangeListener);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SoundManager", e11);
        }
    }

    /* renamed from: h0 */
    public final boolean m40131h0() {
        try {
            Object systemService = MainApplication.Companion.m35500c().getSystemService("power");
            AbstractC19074t.m100206d(systemService, "null cannot be cast to non-null type android.os.PowerManager");
            if (!((PowerManager) systemService).isInteractive()) {
                return false;
            }
            if (AbstractC23349d.m122768f() != 1) {
                return false;
            }
            return true;
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SoundManager", e11);
            return false;
        }
    }

    /* renamed from: h1 */
    public final void m40132h1(boolean z11) {
        this.f42213m = z11;
    }

    /* renamed from: i0 */
    public final boolean m40133i0() {
        boolean z11 = false;
        try {
            if (AbstractC23057e7.m118298e()) {
                Object systemService = MainApplication.Companion.m35500c().getSystemService("phone");
                AbstractC19074t.m100206d(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
                int callState = ((TelephonyManager) systemService).getCallState();
                if (callState == 2 || callState == 1) {
                    z11 = true;
                }
            } else {
                z11 = AbstractC23057e7.m118303j(MainApplication.Companion.m35500c());
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SoundManager", e11);
        }
        return z11;
    }

    /* renamed from: i1 */
    public final void m40134i1(float f11, float f12) {
        boolean z11;
        if (m40137k0()) {
            this.f42201a.setVolume(f11, f12);
        }
        if (f11 == 0.0f && f12 == 0.0f) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f42226z = z11;
    }

    /* renamed from: j0 */
    public final boolean m40135j0() {
        return this.f42195H;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00cc A[Catch: Exception -> 0x00a0, TryCatch #0 {Exception -> 0x00a0, blocks: (B:3:0x0002, B:27:0x0095, B:29:0x009b, B:32:0x00af, B:34:0x00cc, B:35:0x00d1, B:39:0x00a2, B:41:0x00aa, B:42:0x00ad, B:47:0x0092, B:6:0x0047, B:8:0x0057, B:9:0x005d, B:12:0x0067, B:14:0x0070, B:17:0x0076, B:18:0x007a, B:20:0x0080, B:22:0x0086, B:24:0x008a, B:25:0x008e, B:43:0x006d), top: B:2:0x0002, inners: #1 }] */
    /* renamed from: j1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m40136j1() {
        d dVar;
        PowerManager powerManager;
        try {
            String str = this.f42205e;
            boolean z11 = this.f42209i;
            boolean z12 = this.f42210j;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("stopSound(): path=");
            sb2.append(str);
            sb2.append(", isPlaying=");
            sb2.append(z11);
            sb2.append(", isPreparing=");
            sb2.append(z12);
            this.f42198K.removeMessages(5);
            this.f42224x = false;
            this.f42222v = 0;
            this.f42189B = new c(this.f42201a.mo40173f(), this.f42201a.getCurrentPosition());
            m40106S0();
            try {
                Object systemService = MainApplication.Companion.m35500c().getSystemService("power");
                if (systemService instanceof PowerManager) {
                    powerManager = (PowerManager) systemService;
                } else {
                    powerManager = null;
                }
                if (AbstractC23104j.m118480b(17) || (powerManager != null && powerManager.isInteractive())) {
                    m40144o1();
                }
                C17553b c17553b = this.f42204d;
                if (c17553b == null) {
                    AbstractC19074t.m100223u("bluetoothUtil");
                    c17553b = null;
                }
                if (c17553b.m93492e() && !C20024r.m103944m()) {
                    C17553b c17553b2 = this.f42204d;
                    if (c17553b2 == null) {
                        AbstractC19074t.m100223u("bluetoothUtil");
                        c17553b2 = null;
                    }
                    c17553b2.m93494h(false);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("SoundManager", e11);
            }
            this.f42216p = 0;
            if (!this.f42209i) {
                if (this.f42210j) {
                }
                this.f42205e = "";
                this.f42198K.removeMessages(3);
                this.f42198K.removeMessages(4);
                this.f42198K.removeMessages(2);
                m40046P0();
                dVar = this.f42219s;
                if (dVar != null) {
                    dVar.mo40156a(this.f42205e, 0);
                }
                this.f42219s = null;
                this.f42220t = null;
                m40128g();
                m40043M();
            }
            this.f42209i = false;
            this.f42210j = false;
            AbstractC28054e7 abstractC28054e7 = this.f42218r;
            if (abstractC28054e7 != null) {
                abstractC28054e7.mo16498e();
            }
            this.f42218r = null;
            this.f42205e = "";
            this.f42198K.removeMessages(3);
            this.f42198K.removeMessages(4);
            this.f42198K.removeMessages(2);
            m40046P0();
            dVar = this.f42219s;
            if (dVar != null) {
            }
            this.f42219s = null;
            this.f42220t = null;
            m40128g();
            m40043M();
        } catch (Exception e12) {
            AbstractC23350e.m122776f("SoundManager", e12);
        }
    }

    /* renamed from: k0 */
    public final synchronized boolean m40137k0() {
        return this.f42201a.isPlaying();
    }

    /* renamed from: k1 */
    public final void m40138k1() {
        try {
            this.f42198K.post(new Runnable() { // from class: vg.j7
                public /* synthetic */ RunnableC28104j7() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C7853b.m40065l1(C7853b.this);
                }
            });
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SoundManager", e11);
        }
    }

    /* renamed from: l0 */
    public final boolean m40139l0(String str) {
        if (m40137k0() && TextUtils.equals(str, this.f42205e)) {
            return true;
        }
        return false;
    }

    /* renamed from: m0 */
    public final boolean m40140m0() {
        return this.f42210j;
    }

    /* renamed from: m1 */
    public final void m40141m1(boolean z11) {
        try {
            Object systemService = MainApplication.Companion.m35500c().getSystemService("audio");
            AbstractC19074t.m100206d(systemService, "null cannot be cast to non-null type android.media.AudioManager");
            m40149w0("SoundManger#turnOnOffSpeaker", z11);
            ((AudioManager) systemService).setSpeakerphoneOn(z11);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SoundManager", e11);
        }
    }

    /* renamed from: n0 */
    public final boolean m40142n0(String str) {
        if (this.f42210j && TextUtils.equals(str, this.f42205e)) {
            return true;
        }
        return false;
    }

    /* renamed from: n1 */
    public final void m40143n1() {
        try {
            m40104Q0(3);
            Object systemService = MainApplication.Companion.m35500c().getSystemService("audio");
            AbstractC19074t.m100206d(systemService, "null cannot be cast to non-null type android.media.AudioManager");
            m40149w0("SoundManger#turnOnSpeaker", true);
            ((AudioManager) systemService).setSpeakerphoneOn(true);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SoundManager", e11);
        }
    }

    /* renamed from: o1 */
    public final void m40144o1() {
        try {
            SensorManager sensorManager = this.f42193F;
            if (sensorManager != null && this.f42194G != null && sensorManager != null) {
                sensorManager.unregisterListener(this.f42199L);
            }
            m40049U0();
            m40101O0();
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SoundManager", e11);
        }
    }

    /* renamed from: q0 */
    public final void m40145q0(String str, int i11, AbstractC28054e7 abstractC28054e7, boolean z11) {
        AbstractC19074t.m100208f(str, "path");
        this.f42222v = 0;
        this.f42198K.removeMessages(5);
        m40134i1(1.0f, 1.0f);
        m40093D0(str, i11, abstractC28054e7, z11, 1, true);
    }

    /* renamed from: r0 */
    public final void m40146r0() {
        try {
            this.f42225y = true;
            this.f42221u = 0;
            m40102P(0.0f, 0.0f);
            m40071p0();
            m40104Q0(this.f42207g);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SoundManager", e11);
        }
    }

    /* renamed from: s0 */
    public final void m40147s0(boolean z11) {
        try {
            this.f42223w = z11;
            this.f42224x = true;
            m40069o0();
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SoundManager", e11);
        }
    }

    /* renamed from: t0 */
    public final void m40148t0(String str, long j11, Throwable th2) {
        AbstractC19074t.m100208f(str, "file");
        MessageId messageId = this.f42196I;
        if (messageId == null) {
            return;
        }
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: vg.k7

            /* renamed from: p */
            public final /* synthetic */ String f131092p;

            /* renamed from: q */
            public final /* synthetic */ MessageId f131093q;

            /* renamed from: r */
            public final /* synthetic */ C7853b f131094r;

            /* renamed from: s */
            public final /* synthetic */ Throwable f131095s;

            /* renamed from: t */
            public final /* synthetic */ long f131096t;

            public /* synthetic */ RunnableC28114k7(String str2, MessageId messageId2, C7853b this, Throwable th22, long j112) {
                r1 = str2;
                r2 = messageId2;
                r3 = this;
                r4 = th22;
                r5 = j112;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C7853b.m40082v0(r1, r2, r3, r4, r5);
            }
        });
    }

    /* renamed from: w0 */
    public final void m40149w0(String str, boolean z11) {
        AbstractC19074t.m100208f(str, "classMethod");
        if (C20024r.m103941j()) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("THROWABLE_LOG_SPEAKER_PHONE_ON");
            AbstractC20110a.f98889a.mo104556o(8, "SOUND_MANAGER_LOG_SPEAKER_PHONE_ON: " + z11 + " FROM " + str + " stack trace" + Companion.m40151b(illegalArgumentException), new Object[0]);
        }
    }

    private C7853b(InterfaceC7854c interfaceC7854c) {
        InterfaceC24854k m129210a;
        this.f42201a = interfaceC7854c;
        m129210a = AbstractC24856m.m129210a(l.f42246q);
        this.f42202b = m129210a;
        this.f42205e = "";
        this.f42207g = -1;
        this.f42208h = -1;
        this.f42213m = true;
        this.f42217q = -1;
        this.f42191D = new Object();
        this.f42198K = new g(MainApplication.Companion.m35500c().getMainLooper());
        this.f42199L = new k();
        this.f42200M = new AudioManager.OnAudioFocusChangeListener() { // from class: vg.h7
            public /* synthetic */ C28084h7() {
            }

            @Override // android.media.AudioManager.OnAudioFocusChangeListener
            public final void onAudioFocusChange(int i11) {
                C7853b.m40087y0(C7853b.this, i11);
            }
        };
    }
}
