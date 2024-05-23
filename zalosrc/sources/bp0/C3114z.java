package bp0;

import am.AbstractC0924m0;
import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.VibrationAttributes;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.provider.Settings;
import ho0.AbstractC20110a;
import lo0.AbstractC22609k0;

/* renamed from: bp0.z */
/* loaded from: classes7.dex */
public class C3114z {

    /* renamed from: b */
    Vibrator f13197b;

    /* renamed from: c */
    a f13198c;

    /* renamed from: d */
    Context f13199d;

    /* renamed from: a */
    private final long[] f13196a = {0, 1000, 0};

    /* renamed from: f */
    private VibrationAttributes f13201f = null;

    /* renamed from: g */
    private VibrationEffect f13202g = null;

    /* renamed from: e */
    private final MediaPlayer f13200e = new MediaPlayer();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bp0.z$a */
    /* loaded from: classes7.dex */
    public class a extends Thread {

        /* renamed from: p */
        private volatile boolean f13203p;

        public a() {
            super("Z:RingerVibrator");
            this.f13203p = true;
        }

        /* renamed from: a */
        public void m15733a() {
            this.f13203p = false;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (this.f13203p) {
                try {
                    try {
                        if (Build.VERSION.SDK_INT >= 33) {
                            VibrationEffect m15722e = C3114z.this.m15722e();
                            if (m15722e != null) {
                                C3114z c3114z = C3114z.this;
                                c3114z.f13197b.vibrate(m15722e, c3114z.m15721d());
                            }
                        } else {
                            C3114z.this.f13197b.vibrate(1000L);
                        }
                        Thread.sleep(2000L);
                    } catch (InterruptedException unused) {
                        AbstractC3082b0.m15421c("Ringer", "Vibrator thread interrupt");
                    }
                } catch (Throwable th2) {
                    C3114z.this.f13197b.cancel();
                    throw th2;
                }
            }
            C3114z.this.f13197b.cancel();
            AbstractC3082b0.m15421c("Ringer", "Vibrator thread exiting");
        }
    }

    public C3114z(Context context) {
        this.f13199d = context;
        this.f13197b = (Vibrator) context.getSystemService("vibrator");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public VibrationAttributes m15721d() {
        VibrationAttributes.Builder usage;
        VibrationAttributes build;
        if (this.f13201f == null) {
            usage = AbstractC3109u.m15714a().setUsage(33);
            build = usage.build();
            this.f13201f = build;
        }
        return this.f13201f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public VibrationEffect m15722e() {
        VibrationEffect createWaveform;
        if (this.f13202g == null) {
            createWaveform = VibrationEffect.createWaveform(this.f13196a, -1);
            this.f13202g = createWaveform;
        }
        return this.f13202g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m15723g(MediaPlayer mediaPlayer) {
        this.f13200e.start();
    }

    /* renamed from: h */
    private void m15724h() {
        AbstractC3082b0.m15424f("Ringer", "playVibration " + this.f13198c);
        if (this.f13198c == null) {
            a aVar = new a();
            this.f13198c = aVar;
            aVar.start();
        }
    }

    /* renamed from: j */
    private boolean m15725j(AudioManager audioManager, int i11) {
        boolean z11;
        boolean z12 = false;
        if (audioManager.getVibrateSetting(0) != 1 && i11 != 1) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (i11 == 2) {
            try {
                if (Settings.System.getInt(this.f13199d.getContentResolver(), "vibrate_when_ringing") == 1) {
                    z12 = true;
                }
                return z12;
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
                return z11;
            }
        }
        return z11;
    }

    /* renamed from: k */
    private void m15726k(String str) {
        this.f13200e.stop();
        try {
            Uri parse = Uri.parse(str);
            if (parse == null) {
                String str2 = AbstractC22609k0.f110725a;
                if (!str.equals(str2)) {
                    Uri parse2 = Uri.parse(str2);
                    AbstractC0924m0.m3323Op(0);
                    AbstractC0924m0.m3497Up(str2);
                    parse = parse2;
                } else {
                    return;
                }
            }
            this.f13200e.setDataSource(AbstractC3096i0.m15574y(), parse);
            this.f13200e.setAudioStreamType(2);
            this.f13200e.setLooping(true);
            this.f13200e.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: bp0.x
                @Override // android.media.MediaPlayer.OnPreparedListener
                public final void onPrepared(MediaPlayer mediaPlayer) {
                    C3114z.this.m15723g(mediaPlayer);
                }
            });
            this.f13200e.prepareAsync();
        } catch (Exception e11) {
            e11.printStackTrace();
            String str3 = AbstractC22609k0.f110725a;
            if (!str.equals(str3)) {
                AbstractC0924m0.m3323Op(0);
                AbstractC0924m0.m3497Up(str3);
                m15726k(str3);
            }
        }
    }

    /* renamed from: m */
    private void m15727m() {
        try {
            if (this.f13200e.isPlaying()) {
                this.f13200e.stop();
            }
            this.f13200e.reset();
            this.f13200e.setOnPreparedListener(null);
            this.f13200e.setOnCompletionListener(null);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            AbstractC3082b0.m15424f("Ringer", "stopRinger with ex " + e11);
        }
    }

    /* renamed from: n */
    private void m15728n() {
        a aVar = this.f13198c;
        if (aVar != null) {
            try {
                aVar.m15733a();
                this.f13198c.interrupt();
                this.f13198c.join(250L);
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
            this.f13198c = null;
        }
    }

    /* renamed from: f */
    public boolean m15729f() {
        boolean z11;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("isRinging mRingPlayer.isPlaying() ");
        sb2.append(this.f13200e.isPlaying());
        sb2.append(" vibratorThread != null ");
        if (this.f13198c != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        sb2.append(z11);
        AbstractC3082b0.m15424f("Ringer", sb2.toString());
        if (!this.f13200e.isPlaying() && this.f13198c == null) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public void m15730i(int i11, String str) {
        synchronized (this) {
            try {
                AudioManager audioManager = (AudioManager) this.f13199d.getSystemService("audio");
                int ringerMode = audioManager.getRingerMode();
                AbstractC3082b0.m15424f("Ringer", "==> ring() called with ringer mode " + ringerMode);
                if (ringerMode == 0) {
                    AbstractC3082b0.m15421c("Ringer", "skipping ring and vibrate because profile is Silent");
                    return;
                }
                if (m15725j(audioManager, ringerMode)) {
                    m15724h();
                }
                if (ringerMode == 1) {
                    AbstractC3082b0.m15421c("Ringer", "skipping ring because profile is Vibrate OR because volume is zero");
                } else {
                    m15726k(str);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: l */
    public void m15731l() {
        synchronized (this) {
            AbstractC3082b0.m15424f("Ringer", "==> stopRing() called...");
            m15728n();
            m15727m();
        }
    }

    /* renamed from: o */
    public void m15732o(int i11, int i12, int i13) {
        try {
            this.f13197b.vibrate(new long[]{0, i11, i12, i13}, -1);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }
}
