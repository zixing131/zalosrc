package com.adtima.control;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.adtima.AbstractC3873d;
import com.adtima.AbstractC3874e;
import com.adtima.AbstractC3875f;
import com.adtima.Adtima;
import com.adtima.ads.partner.ZAdsAudioPartnerListener;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import p227i3.AbstractC20202f;
import p227i3.C20199c;
import p309l.AbstractC21974b;
import p309l.C21976d;
import p309l.EnumC21975c;
import p313l3.AbstractC22011d;

/* loaded from: classes2.dex */
public class ZAudioControl extends RelativeLayout implements MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnInfoListener {

    /* renamed from: b0 */
    private static final String f15345b0 = "ZAudioControl";

    /* renamed from: A */
    private ImageButton f15346A;

    /* renamed from: B */
    private int f15347B;

    /* renamed from: C */
    private int f15348C;

    /* renamed from: D */
    private TextView f15349D;

    /* renamed from: E */
    private TextView f15350E;

    /* renamed from: F */
    private boolean f15351F;

    /* renamed from: G */
    private long f15352G;

    /* renamed from: H */
    private long f15353H;

    /* renamed from: I */
    private long f15354I;

    /* renamed from: J */
    private int f15355J;

    /* renamed from: K */
    private int f15356K;

    /* renamed from: L */
    private boolean f15357L;

    /* renamed from: M */
    private boolean f15358M;

    /* renamed from: N */
    private boolean f15359N;

    /* renamed from: O */
    private boolean f15360O;

    /* renamed from: P */
    private boolean f15361P;

    /* renamed from: Q */
    private boolean f15362Q;

    /* renamed from: R */
    private HashMap f15363R;

    /* renamed from: S */
    private HashMap f15364S;

    /* renamed from: T */
    private HashMap f15365T;

    /* renamed from: U */
    private HashMap f15366U;

    /* renamed from: V */
    private HashMap f15367V;

    /* renamed from: W */
    private AudioManager f15368W;

    /* renamed from: a0 */
    private AudioManager.OnAudioFocusChangeListener f15369a0;

    /* renamed from: p */
    private Timer f15370p;

    /* renamed from: q */
    private Timer f15371q;

    /* renamed from: r */
    private Context f15372r;

    /* renamed from: s */
    private Handler f15373s;

    /* renamed from: t */
    private C21976d f15374t;

    /* renamed from: u */
    private ZAdsAudioPartnerListener f15375u;

    /* renamed from: v */
    private C3861j f15376v;

    /* renamed from: w */
    private View f15377w;

    /* renamed from: x */
    private MediaPlayer f15378x;

    /* renamed from: y */
    private ProgressBar f15379y;

    /* renamed from: z */
    private ProgressBar f15380z;

    /* renamed from: com.adtima.control.ZAudioControl$a */
    /* loaded from: classes2.dex */
    class C3852a implements AudioManager.OnAudioFocusChangeListener {
        C3852a() {
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(int i11) {
            if (i11 != -2) {
                if (i11 != -1) {
                    return;
                } else {
                    ZAudioControl.this.f15368W.abandonAudioFocus(ZAudioControl.this.f15369a0);
                }
            }
            ZAudioControl.this.m18436S();
        }
    }

    /* renamed from: com.adtima.control.ZAudioControl$b */
    /* loaded from: classes2.dex */
    class RunnableC3853b implements Runnable {
        RunnableC3853b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ZAudioControl.this.m18385H();
        }
    }

    /* renamed from: com.adtima.control.ZAudioControl$c */
    /* loaded from: classes2.dex */
    class RunnableC3854c implements Runnable {
        RunnableC3854c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (ZAudioControl.this.f15379y != null) {
                    ZAudioControl.this.f15379y.setVisibility(4);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.adtima.control.ZAudioControl$d */
    /* loaded from: classes2.dex */
    public class ViewOnClickListenerC3855d implements View.OnClickListener {
        ViewOnClickListenerC3855d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ZAudioControl.this.m18391P();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.adtima.control.ZAudioControl$e */
    /* loaded from: classes2.dex */
    public class ViewOnClickListenerC3856e implements View.OnClickListener {
        ViewOnClickListenerC3856e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                ZAudioControl.this.m18436S();
                if (ZAudioControl.this.f15376v != null) {
                    ZAudioControl.this.f15376v.onSkipped();
                }
                ZAudioControl.this.m18425r(EnumC21975c.skip);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.adtima.control.ZAudioControl$f */
    /* loaded from: classes2.dex */
    public class RunnableC3857f implements Runnable {
        RunnableC3857f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                ZAudioControl.m18419l(ZAudioControl.this, 1000L);
                if (ZAudioControl.this.f15352G > ZAudioControl.this.f15354I / 1000 || ZAudioControl.this.f15350E.getVisibility() == 0) {
                    ZAudioControl.this.f15349D.setVisibility(0);
                    ZAudioControl.this.f15350E.setVisibility(4);
                    ZAudioControl.this.f15349D.setText(AbstractC20202f.f99784L.replace("#time#", String.valueOf(ZAudioControl.this.f15352G - (ZAudioControl.this.f15354I / 1000))));
                    ZAudioControl.this.m18413h0();
                } else {
                    ZAudioControl.this.f15349D.setVisibility(4);
                    ZAudioControl.this.f15350E.setVisibility(0);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.adtima.control.ZAudioControl$g */
    /* loaded from: classes2.dex */
    public class RunnableC3858g implements Runnable {
        RunnableC3858g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                ZAudioControl.m18400b(ZAudioControl.this, 300L);
                if (ZAudioControl.this.f15353H <= 3000 && !ZAudioControl.this.f15358M) {
                    ZAudioControl.this.m18435Q();
                }
                ZAudioControl.this.m18413h0();
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.adtima.control.ZAudioControl$h */
    /* loaded from: classes2.dex */
    public class C3859h extends TimerTask {

        /* renamed from: com.adtima.control.ZAudioControl$h$a */
        /* loaded from: classes2.dex */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                int i11;
                try {
                    if (ZAudioControl.this.m18434N()) {
                        if (ZAudioControl.this.f15346A != null) {
                            ZAudioControl.this.f15346A.setImageResource(ZAudioControl.this.f15348C);
                        }
                        int i12 = 0;
                        try {
                            i11 = AbstractC22011d.m114901b(ZAudioControl.this.f15374t.m114765o());
                            try {
                                ZAudioControl zAudioControl = ZAudioControl.this;
                                zAudioControl.f15356K = zAudioControl.getCurrentPosition();
                                i12 = ZAudioControl.this.f15356K / 1000;
                            } catch (Exception unused) {
                            }
                        } catch (Exception unused2) {
                            i11 = 0;
                        }
                        ZAudioControl.this.m18410g(i12, i11);
                        ZAudioControl.this.m18417j0();
                    }
                } catch (Exception unused3) {
                }
            }
        }

        C3859h() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            try {
                if (ZAudioControl.this.f15373s == null) {
                    ZAudioControl.this.f15373s = new Handler();
                }
                ZAudioControl.this.f15373s.post(new a());
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.adtima.control.ZAudioControl$i */
    /* loaded from: classes2.dex */
    public class C3860i extends TimerTask {

        /* renamed from: p */
        final /* synthetic */ int f15390p;

        C3860i(int i11) {
            this.f15390p = i11;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            ZAudioControl zAudioControl;
            EnumC21975c enumC21975c;
            int currentPosition = ZAudioControl.this.getCurrentPosition();
            if (currentPosition == 0) {
                return;
            }
            try {
                int i11 = (currentPosition * 100) / this.f15390p;
                if (ZAudioControl.this.f15364S != null) {
                    int i12 = currentPosition / 1000;
                    if (ZAudioControl.this.f15364S.containsKey(Integer.valueOf(i12))) {
                        ZAudioControl.this.m18423p(i12);
                    }
                }
                if (i11 >= ZAudioControl.this.f15355J * 25) {
                    if (ZAudioControl.this.f15355J == 0) {
                        zAudioControl = ZAudioControl.this;
                        enumC21975c = EnumC21975c.start;
                    } else if (ZAudioControl.this.f15355J == 1) {
                        zAudioControl = ZAudioControl.this;
                        enumC21975c = EnumC21975c.firstQuartile;
                    } else {
                        if (ZAudioControl.this.f15355J != 2) {
                            if (ZAudioControl.this.f15355J == 3) {
                                zAudioControl = ZAudioControl.this;
                                enumC21975c = EnumC21975c.thirdQuartile;
                            }
                            ZAudioControl.m18396Y(ZAudioControl.this);
                        }
                        zAudioControl = ZAudioControl.this;
                        enumC21975c = EnumC21975c.midpoint;
                    }
                    zAudioControl.m18425r(enumC21975c);
                    ZAudioControl.m18396Y(ZAudioControl.this);
                }
            } catch (Exception unused) {
                cancel();
            }
        }
    }

    /* renamed from: com.adtima.control.ZAudioControl$j */
    /* loaded from: classes2.dex */
    public static class C3861j {
        public void onCompleted() {
        }

        public void onInteracted() {
        }

        public void onSkipped() {
        }
    }

    public ZAudioControl(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f15370p = null;
        this.f15371q = null;
        this.f15373s = null;
        this.f15374t = null;
        this.f15375u = null;
        this.f15376v = null;
        this.f15377w = null;
        this.f15378x = null;
        this.f15379y = null;
        this.f15380z = null;
        this.f15346A = null;
        this.f15347B = -1;
        this.f15348C = -1;
        this.f15349D = null;
        this.f15350E = null;
        this.f15351F = false;
        this.f15352G = 0L;
        this.f15353H = 0L;
        this.f15354I = 0L;
        this.f15355J = 0;
        this.f15356K = 0;
        this.f15357L = true;
        this.f15358M = false;
        this.f15359N = false;
        this.f15360O = true;
        this.f15361P = false;
        this.f15362Q = false;
        this.f15363R = null;
        this.f15364S = null;
        this.f15365T = null;
        this.f15366U = null;
        this.f15367V = null;
        this.f15368W = null;
        this.f15369a0 = new C3852a();
        try {
            this.f15372r = context;
            this.f15373s = new Handler();
            this.f15368W = (AudioManager) this.f15372r.getSystemService("audio");
            m18380C();
            m18427u();
            m18430x();
            m18387J();
        } catch (Exception unused) {
        }
    }

    /* renamed from: A */
    private boolean m18378A(int i11) {
        try {
            Boolean bool = (Boolean) this.f15366U.get(Integer.valueOf(i11));
            if (bool != null) {
                if (bool.booleanValue()) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* renamed from: C */
    private void m18380C() {
        try {
            View inflate = LayoutInflater.from(this.f15372r).inflate(AbstractC3875f.zad__widget_audio_control, (ViewGroup) null);
            this.f15377w = inflate;
            addView(inflate);
            this.f15377w.setBackgroundColor(Color.parseColor(AbstractC20202f.f99783K));
        } catch (Exception unused) {
        }
    }

    /* renamed from: D */
    private void m18381D(int i11) {
        try {
            HashMap hashMap = this.f15366U;
            if (hashMap != null) {
                hashMap.put(Integer.valueOf(i11), Boolean.TRUE);
            }
        } catch (Exception e11) {
            Adtima.m18329e(f15345b0, "markEventProgressAfterCalled", e11);
        }
    }

    /* renamed from: E */
    private void m18382E() {
        try {
            this.f15362Q = true;
            C21976d c21976d = this.f15374t;
            if (c21976d != null && this.f15375u != null) {
                this.f15375u.onAudioImpression(c21976d.m114771u());
            }
            m18425r(EnumC21975c.creativeView);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: H */
    public void m18385H() {
        ZAdsAudioPartnerListener zAdsAudioPartnerListener;
        try {
            C21976d c21976d = this.f15374t;
            if (c21976d == null || (zAdsAudioPartnerListener = this.f15375u) == null) {
                return;
            }
            zAdsAudioPartnerListener.onAudioReady(c21976d);
        } catch (Exception unused) {
        }
    }

    /* renamed from: J */
    private void m18387J() {
        try {
            HashMap hashMap = this.f15365T;
            if (hashMap == null) {
                this.f15365T = new HashMap();
                this.f15366U = new HashMap();
            } else {
                hashMap.clear();
                this.f15366U.clear();
            }
            if (this.f15367V == null) {
                HashMap hashMap2 = new HashMap();
                this.f15367V = hashMap2;
                EnumC21975c enumC21975c = EnumC21975c.creativeView;
                EnumC21975c enumC21975c2 = EnumC21975c.start;
                EnumC21975c enumC21975c3 = EnumC21975c.firstQuartile;
                hashMap2.put(enumC21975c3, Arrays.asList(enumC21975c, enumC21975c2));
                HashMap hashMap3 = this.f15367V;
                EnumC21975c enumC21975c4 = EnumC21975c.midpoint;
                hashMap3.put(enumC21975c4, Arrays.asList(enumC21975c, enumC21975c2, enumC21975c3));
                HashMap hashMap4 = this.f15367V;
                EnumC21975c enumC21975c5 = EnumC21975c.thirdQuartile;
                hashMap4.put(enumC21975c5, Arrays.asList(enumC21975c, enumC21975c2, enumC21975c3, enumC21975c4));
                this.f15367V.put(EnumC21975c.complete, Arrays.asList(enumC21975c, enumC21975c2, enumC21975c3, enumC21975c4, enumC21975c5));
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P */
    public void m18391P() {
        try {
            C3861j c3861j = this.f15376v;
            if (c3861j != null) {
                c3861j.onInteracted();
            }
            if (m18434N()) {
                m18436S();
                return;
            }
            if (this.f15360O) {
                m18437V();
                if (this.f15359N || getCurrentPosition() <= 500) {
                    return;
                }
                m18425r(EnumC21975c.resume);
                return;
            }
            this.f15355J = 0;
            m18387J();
            m18437V();
            if (this.f15359N) {
                this.f15359N = false;
                if (this.f15362Q) {
                    return;
                }
                m18382E();
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: Y */
    static /* synthetic */ int m18396Y(ZAudioControl zAudioControl) {
        int i11 = zAudioControl.f15355J;
        zAudioControl.f15355J = i11 + 1;
        return i11;
    }

    /* renamed from: Z */
    private void m18397Z() {
        try {
            MediaPlayer mediaPlayer = this.f15378x;
            if (mediaPlayer != null) {
                float f11 = this.f15357L ? 1.0f : 0.0f;
                mediaPlayer.setVolume(f11, f11);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    static /* synthetic */ long m18400b(ZAudioControl zAudioControl, long j11) {
        long j12 = zAudioControl.f15353H + j11;
        zAudioControl.f15353H = j12;
        return j12;
    }

    /* renamed from: b0 */
    private boolean m18401b0() {
        try {
            if (!this.f15357L) {
                this.f15368W.abandonAudioFocus(this.f15369a0);
            } else if (this.f15368W.requestAudioFocus(this.f15369a0, 3, 1) == 1) {
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* renamed from: d0 */
    private boolean m18405d0() {
        try {
            this.f15368W.abandonAudioFocus(this.f15369a0);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: e */
    private void m18406e() {
        try {
            MediaPlayer mediaPlayer = this.f15378x;
            if (mediaPlayer != null) {
                if (mediaPlayer.isPlaying()) {
                    this.f15378x.stop();
                }
                this.f15378x.setOnCompletionListener(null);
                this.f15378x.setOnErrorListener(null);
                this.f15378x.setOnPreparedListener(null);
                this.f15378x = null;
            }
            this.f15378x = null;
        } catch (Exception unused) {
        }
    }

    /* renamed from: f */
    private void m18408f(int i11) {
        try {
            if (this.f15375u != null) {
                C21976d c21976d = this.f15374t;
                this.f15375u.onAudioError(AbstractC21974b.m114749a(i11), c21976d != null ? c21976d.m114768r() : null);
            }
            Adtima.m18328e(f15345b0, "DAASTError: " + AbstractC21974b.m114750b(i11));
        } catch (Exception unused) {
        }
    }

    /* renamed from: f0 */
    private void m18409f0() {
        try {
            m18420l0();
            int duration = getDuration();
            Timer timer = new Timer();
            this.f15371q = timer;
            timer.scheduleAtFixedRate(new C3860i(duration), 0L, 250L);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public void m18410g(int i11, int i12) {
        try {
            ProgressBar progressBar = this.f15379y;
            if (progressBar != null) {
                progressBar.setMax(i12);
                this.f15379y.setProgress(i11);
                this.f15379y.setVisibility(0);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h0 */
    public void m18413h0() {
        try {
            if (this.f15373s == null) {
                this.f15373s = new Handler();
            }
            this.f15373s.postDelayed(new RunnableC3857f(), 1000L);
        } catch (Exception unused) {
        }
    }

    /* renamed from: j */
    private void m18416j(EnumC21975c enumC21975c) {
        C21976d c21976d;
        List<EnumC21975c> list;
        try {
            HashMap hashMap = this.f15367V;
            if (hashMap != null && hashMap.containsKey(enumC21975c) && (list = (List) this.f15367V.get(enumC21975c)) != null && list.size() != 0) {
                for (EnumC21975c enumC21975c2 : list) {
                    Boolean bool = (Boolean) this.f15365T.get(enumC21975c2);
                    if (bool != null && bool.booleanValue()) {
                    }
                    m18429w(enumC21975c2);
                    m18432z(enumC21975c2);
                }
            }
            EnumC21975c enumC21975c3 = EnumC21975c.complete;
            if (enumC21975c == enumC21975c3 || enumC21975c == EnumC21975c.close) {
                int i11 = this.f15356K / 1000;
                if (enumC21975c == enumC21975c3 && (c21976d = this.f15374t) != null) {
                    i11 = AbstractC22011d.m114901b(c21976d.m114765o());
                }
                for (int i12 = 0; i12 <= i11; i12++) {
                    if (!m18378A(i12)) {
                        m18428v(i12);
                        m18381D(i12);
                    }
                }
            }
        } catch (Exception e11) {
            Adtima.m18329e(f15345b0, "checkBackwardEventAfterCalled", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j0 */
    public void m18417j0() {
        try {
            if (m18434N()) {
                Timer timer = new Timer();
                this.f15370p = timer;
                timer.schedule(new C3859h(), 250L);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: l */
    static /* synthetic */ long m18419l(ZAudioControl zAudioControl, long j11) {
        long j12 = zAudioControl.f15354I + j11;
        zAudioControl.f15354I = j12;
        return j12;
    }

    /* renamed from: l0 */
    private void m18420l0() {
        try {
            Timer timer = this.f15371q;
            if (timer != null) {
                timer.cancel();
                this.f15371q = null;
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: m0 */
    private void m18422m0() {
        try {
            Timer timer = this.f15370p;
            if (timer != null) {
                timer.cancel();
                this.f15370p = null;
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public void m18423p(int i11) {
        try {
            m18428v(i11);
            m18381D(i11);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public void m18425r(EnumC21975c enumC21975c) {
        try {
            m18429w(enumC21975c);
            m18432z(enumC21975c);
            m18416j(enumC21975c);
        } catch (Exception unused) {
        }
    }

    /* renamed from: u */
    private void m18427u() {
        this.f15347B = AbstractC3873d.zad__ic_audio_play;
        this.f15348C = AbstractC3873d.zad__ic_audio_pause;
        ImageButton imageButton = (ImageButton) this.f15377w.findViewById(AbstractC3874e.zad__play_pause);
        this.f15346A = imageButton;
        imageButton.setVisibility(4);
        this.f15346A.setImageResource(this.f15347B);
        this.f15346A.setEnabled(true);
        this.f15346A.setOnClickListener(new ViewOnClickListenerC3855d());
        ProgressBar progressBar = (ProgressBar) this.f15377w.findViewById(AbstractC3874e.zad__loading_progress);
        this.f15380z = progressBar;
        progressBar.getIndeterminateDrawable().setColorFilter(-16740379, PorterDuff.Mode.MULTIPLY);
        this.f15380z.setVisibility(0);
        ProgressBar progressBar2 = (ProgressBar) this.f15377w.findViewById(AbstractC3874e.zad__circle_progress);
        this.f15379y = progressBar2;
        progressBar2.setVisibility(4);
    }

    /* renamed from: v */
    private void m18428v(int i11) {
        List<String> list;
        try {
            if (this.f15364S == null || this.f15375u == null || m18378A(i11) || (list = (List) this.f15364S.get(Integer.valueOf(i11))) == null || list.size() == 0) {
                return;
            }
            this.f15375u.onAudioEvent(EnumC21975c.progress, list);
        } catch (Exception unused) {
        }
    }

    /* renamed from: w */
    private void m18429w(EnumC21975c enumC21975c) {
        try {
            HashMap hashMap = this.f15363R;
            if (hashMap == null || this.f15375u == null) {
                return;
            }
            this.f15375u.onAudioEvent(enumC21975c, (List) hashMap.get(enumC21975c));
        } catch (Exception unused) {
        }
    }

    /* renamed from: x */
    private void m18430x() {
        try {
            String str = AbstractC20202f.f99785M;
            if (this.f15351F) {
                long j11 = this.f15352G;
                if (j11 > 0) {
                    str = AbstractC20202f.f99784L.replace("#time#", String.valueOf(j11));
                }
            }
            TextView textView = (TextView) this.f15377w.findViewById(AbstractC3874e.zad__skip_after);
            this.f15349D = textView;
            textView.setText(str);
            TextView textView2 = (TextView) this.f15377w.findViewById(AbstractC3874e.zad__skip_now);
            this.f15350E = textView2;
            textView2.setVisibility(4);
            this.f15350E.setOnClickListener(new ViewOnClickListenerC3856e());
        } catch (Exception unused) {
        }
    }

    /* renamed from: z */
    private void m18432z(EnumC21975c enumC21975c) {
        try {
            HashMap hashMap = this.f15365T;
            if (hashMap != null) {
                hashMap.put(enumC21975c, Boolean.TRUE);
            }
        } catch (Exception e11) {
            Adtima.m18329e(f15345b0, "markEventAfterCalled", e11);
        }
    }

    /* renamed from: L */
    public boolean m18433L() {
        return this.f15359N;
    }

    /* renamed from: N */
    public boolean m18434N() {
        try {
            MediaPlayer mediaPlayer = this.f15378x;
            if (mediaPlayer != null) {
                return mediaPlayer.isPlaying();
            }
        } catch (Exception e11) {
            Adtima.m18329e(f15345b0, "isPlaying", e11);
        }
        return false;
    }

    /* renamed from: Q */
    public void m18435Q() {
        try {
            if (this.f15351F) {
                if (this.f15373s == null) {
                    this.f15373s = new Handler();
                }
                this.f15373s.postDelayed(new RunnableC3858g(), 300L);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: S */
    public void m18436S() {
        try {
            this.f15360O = true;
            MediaPlayer mediaPlayer = this.f15378x;
            if (mediaPlayer != null) {
                mediaPlayer.pause();
            }
            this.f15356K = getCurrentPosition();
            ImageButton imageButton = this.f15346A;
            if (imageButton != null) {
                imageButton.setImageResource(this.f15347B);
            }
            m18405d0();
            if (this.f15359N) {
                return;
            }
            m18425r(EnumC21975c.pause);
        } catch (Exception unused) {
        }
    }

    /* renamed from: V */
    public void m18437V() {
        try {
            this.f15360O = false;
            if (this.f15358M) {
                ImageButton imageButton = this.f15346A;
                if (imageButton != null) {
                    imageButton.setImageResource(this.f15348C);
                }
                m18401b0();
                m18397Z();
                MediaPlayer mediaPlayer = this.f15378x;
                if (mediaPlayer != null) {
                    int i11 = this.f15356K;
                    if (i11 != 0) {
                        mediaPlayer.seekTo(i11);
                    }
                    this.f15378x.start();
                    m18425r(EnumC21975c.resume);
                }
                m18422m0();
                m18417j0();
                m18409f0();
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: X */
    public void m18438X() {
        this.f15375u = null;
    }

    public float getAudioVolume() {
        return this.f15357L ? 1.0f : 0.0f;
    }

    public int getCurrentPosition() {
        try {
            MediaPlayer mediaPlayer = this.f15378x;
            if (mediaPlayer != null) {
                return mediaPlayer.getCurrentPosition();
            }
        } catch (Exception e11) {
            Adtima.m18329e(f15345b0, "getCurrentPosition", e11);
        }
        return 0;
    }

    public int getDuration() {
        try {
            MediaPlayer mediaPlayer = this.f15378x;
            if (mediaPlayer != null) {
                return mediaPlayer.getDuration();
            }
        } catch (Exception e11) {
            Adtima.m18329e(f15345b0, "getDuration", e11);
        }
        return 0;
    }

    /* renamed from: k */
    public void m18439k(boolean z11, long j11) {
        this.f15351F = z11;
        this.f15352G = j11;
    }

    /* renamed from: n */
    public void m18440n() {
        AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener;
        try {
            if (!this.f15361P) {
                m18425r(EnumC21975c.close);
            }
        } catch (Exception unused) {
        }
        try {
            m18406e();
            m18420l0();
            Timer timer = this.f15370p;
            if (timer != null) {
                timer.cancel();
            }
            this.f15370p = null;
            Timer timer2 = this.f15371q;
            if (timer2 != null) {
                timer2.cancel();
            }
            this.f15371q = null;
            this.f15372r = null;
            this.f15373s = null;
            this.f15374t = null;
            this.f15375u = null;
            this.f15376v = null;
            this.f15346A = null;
            this.f15350E = null;
            this.f15349D = null;
            this.f15363R = null;
            this.f15364S = null;
            this.f15365T = null;
            this.f15366U = null;
            this.f15367V = null;
            removeAllViews();
        } catch (Exception unused2) {
        }
        try {
            AudioManager audioManager = this.f15368W;
            if (audioManager == null || (onAudioFocusChangeListener = this.f15369a0) == null) {
                return;
            }
            audioManager.abandonAudioFocus(onAudioFocusChangeListener);
            this.f15368W = null;
            this.f15369a0 = null;
        } catch (Exception unused3) {
        }
    }

    /* renamed from: n0 */
    public void m18441n0() {
        String str = AbstractC20202f.f99785M;
        if (this.f15351F) {
            long j11 = this.f15352G;
            if (j11 > 0) {
                str = AbstractC20202f.f99784L.replace("#time#", String.valueOf(j11));
            }
        }
        this.f15349D.setText(str);
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(MediaPlayer mediaPlayer) {
        try {
            this.f15356K = 0;
            try {
                ImageButton imageButton = this.f15346A;
                if (imageButton != null) {
                    imageButton.setImageResource(this.f15347B);
                }
                this.f15373s.postDelayed(new RunnableC3854c(), 500L);
            } catch (Exception unused) {
            }
            try {
                if (!this.f15361P && !this.f15359N) {
                    this.f15359N = true;
                    this.f15355J = 0;
                    m18422m0();
                    m18420l0();
                    if (this.f15358M) {
                        m18425r(EnumC21975c.complete);
                    }
                    ProgressBar progressBar = this.f15379y;
                    if (progressBar != null) {
                        progressBar.setProgress(progressBar.getMax());
                    }
                    this.f15362Q = false;
                }
            } catch (Exception unused2) {
            }
            C3861j c3861j = this.f15376v;
            if (c3861j != null) {
                c3861j.onCompleted();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public boolean onError(MediaPlayer mediaPlayer, int i11, int i12) {
        try {
            this.f15361P = true;
            m18408f(7);
        } catch (Exception unused) {
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0024, code lost:            if (r2 != null) goto L16;     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0033, code lost:            if (r2 != null) goto L16;     */
    @Override // android.media.MediaPlayer.OnInfoListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onInfo(MediaPlayer mediaPlayer, int i11, int i12) {
        View view;
        ImageButton imageButton;
        int i13;
        if (i11 != 701) {
            if (i11 == 702) {
                ImageButton imageButton2 = this.f15346A;
                if (imageButton2 != null) {
                    imageButton2.setVisibility(0);
                    if (this.f15360O) {
                        imageButton = this.f15346A;
                        i13 = this.f15347B;
                    } else {
                        imageButton = this.f15346A;
                        i13 = this.f15348C;
                    }
                    imageButton.setImageResource(i13);
                }
                view = this.f15380z;
            }
            return false;
        }
        ProgressBar progressBar = this.f15380z;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
        view = this.f15346A;
        view.setVisibility(4);
        return false;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public void onPrepared(MediaPlayer mediaPlayer) {
        try {
            this.f15358M = true;
            this.f15361P = false;
            this.f15359N = false;
            ProgressBar progressBar = this.f15380z;
            if (progressBar != null) {
                progressBar.setVisibility(4);
            }
            ImageButton imageButton = this.f15346A;
            if (imageButton != null) {
                imageButton.setVisibility(0);
            }
            if (this.f15360O) {
                this.f15378x.start();
                this.f15378x.pause();
                ImageButton imageButton2 = this.f15346A;
                if (imageButton2 != null) {
                    imageButton2.setImageResource(this.f15347B);
                }
            } else {
                ImageButton imageButton3 = this.f15346A;
                if (imageButton3 != null) {
                    imageButton3.setImageResource(this.f15348C);
                }
                m18437V();
            }
            m18425r(EnumC21975c.creativeView);
        } catch (Exception unused) {
        }
    }

    public void setAudioListener(ZAdsAudioPartnerListener zAdsAudioPartnerListener) {
        this.f15375u = zAdsAudioPartnerListener;
    }

    public void setDaastModel(C21976d c21976d) {
        try {
            this.f15374t = c21976d;
            if (c21976d == null) {
                m18408f(3);
            } else {
                this.f15363R = c21976d.m114770t();
                this.f15364S = this.f15374t.m114774x();
                String m117382g = this.f15374t.m114772v().m117382g();
                C20199c.m105336g().m105345j(m117382g);
                MediaPlayer mediaPlayer = new MediaPlayer();
                this.f15378x = mediaPlayer;
                mediaPlayer.setAudioStreamType(3);
                this.f15378x.setDataSource(m117382g);
                this.f15378x.setOnPreparedListener(this);
                this.f15378x.setOnCompletionListener(this);
                this.f15378x.setOnInfoListener(this);
                this.f15378x.prepareAsync();
                new Handler().postDelayed(new RunnableC3853b(), 0L);
            }
        } catch (Exception e11) {
            Adtima.m18329e(f15345b0, "setDaastModel", e11);
        }
    }

    public void setListener(C3861j c3861j) {
        this.f15376v = c3861j;
    }
}
