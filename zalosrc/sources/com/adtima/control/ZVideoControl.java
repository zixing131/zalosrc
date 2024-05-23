package com.adtima.control;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.adtima.AbstractC3873d;
import com.adtima.AbstractC3874e;
import com.adtima.AbstractC3875f;
import com.adtima.Adtima;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import p001a.p005d.AbstractRunnableC0008c;
import p001a.p005d.C0009d;
import p178g3.AbstractC19211f;
import p196h3.InterfaceC19747i;
import p227i3.C20199c;
import p227i3.C20208l;
import p313l3.AbstractC22011d;
import p350n.AbstractC23495a;
import p350n.C23498d;
import p350n.EnumC23496b;

/* loaded from: classes2.dex */
public class ZVideoControl extends RelativeLayout implements MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnInfoListener {

    /* renamed from: k0 */
    private static final String f15392k0 = "ZVideoControl";

    /* renamed from: A */
    private ImageView f15393A;

    /* renamed from: B */
    private MediaPlayer f15394B;

    /* renamed from: C */
    private View f15395C;

    /* renamed from: D */
    private RelativeLayout f15396D;

    /* renamed from: E */
    private EnumC3872k f15397E;

    /* renamed from: F */
    private ProgressBar f15398F;

    /* renamed from: G */
    private ProgressBar f15399G;

    /* renamed from: H */
    private TextView f15400H;

    /* renamed from: I */
    private ImageView f15401I;

    /* renamed from: J */
    private ProgressBar f15402J;

    /* renamed from: K */
    private ImageView f15403K;

    /* renamed from: L */
    private Bitmap f15404L;

    /* renamed from: M */
    private int f15405M;

    /* renamed from: N */
    private int f15406N;

    /* renamed from: O */
    private boolean f15407O;

    /* renamed from: P */
    private boolean f15408P;

    /* renamed from: Q */
    private boolean f15409Q;

    /* renamed from: R */
    private boolean f15410R;

    /* renamed from: S */
    private boolean f15411S;

    /* renamed from: T */
    private boolean f15412T;

    /* renamed from: U */
    private boolean f15413U;

    /* renamed from: V */
    private boolean f15414V;

    /* renamed from: W */
    private int f15415W;

    /* renamed from: a0 */
    private int f15416a0;

    /* renamed from: b0 */
    private int f15417b0;

    /* renamed from: c0 */
    private AbstractRunnableC0008c f15418c0;

    /* renamed from: d0 */
    private HashMap f15419d0;

    /* renamed from: e0 */
    private HashMap f15420e0;

    /* renamed from: f0 */
    private HashMap f15421f0;

    /* renamed from: g0 */
    private HashMap f15422g0;

    /* renamed from: h0 */
    private HashMap f15423h0;

    /* renamed from: i0 */
    private AudioManager f15424i0;

    /* renamed from: j0 */
    private AudioManager.OnAudioFocusChangeListener f15425j0;

    /* renamed from: p */
    private Timer f15426p;

    /* renamed from: q */
    private TimerTask f15427q;

    /* renamed from: r */
    private Timer f15428r;

    /* renamed from: s */
    private TimerTask f15429s;

    /* renamed from: t */
    private Context f15430t;

    /* renamed from: u */
    private Handler f15431u;

    /* renamed from: v */
    private C23498d f15432v;

    /* renamed from: w */
    private InterfaceC19747i f15433w;

    /* renamed from: x */
    private C3871j f15434x;

    /* renamed from: y */
    private RelativeLayout f15435y;

    /* renamed from: z */
    private CustomVideoView f15436z;

    /* renamed from: com.adtima.control.ZVideoControl$a */
    /* loaded from: classes2.dex */
    class C3862a implements AudioManager.OnAudioFocusChangeListener {
        C3862a() {
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(int i11) {
            if (i11 != -2) {
                if (i11 != -1) {
                    return;
                } else {
                    ZVideoControl.this.f15424i0.abandonAudioFocus(ZVideoControl.this.f15425j0);
                }
            }
            ZVideoControl.this.m18513j0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.adtima.control.ZVideoControl$b */
    /* loaded from: classes2.dex */
    public class ViewOnClickListenerC3863b implements View.OnClickListener {
        ViewOnClickListenerC3863b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                ZVideoControl.this.m18467b();
            } catch (Exception e11) {
                Adtima.m18329e(ZVideoControl.f15392k0, "onClick", e11);
            }
        }
    }

    /* renamed from: com.adtima.control.ZVideoControl$c */
    /* loaded from: classes2.dex */
    class RunnableC3864c implements Runnable {
        RunnableC3864c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ZVideoControl.this.m18460T();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.adtima.control.ZVideoControl$d */
    /* loaded from: classes2.dex */
    public class ViewOnClickListenerC3865d implements View.OnClickListener {
        ViewOnClickListenerC3865d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                if (ZVideoControl.this.f15435y != null) {
                    ZVideoControl.this.f15435y.setVisibility(8);
                }
                ZVideoControl.this.m18474f0();
            } catch (Exception e11) {
                Adtima.m18329e(ZVideoControl.f15392k0, "onClick", e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.adtima.control.ZVideoControl$e */
    /* loaded from: classes2.dex */
    public class ViewOnClickListenerC3866e implements View.OnClickListener {
        ViewOnClickListenerC3866e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                if (ZVideoControl.this.f15411S) {
                    ZVideoControl.this.m18512h0();
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.adtima.control.ZVideoControl$f */
    /* loaded from: classes2.dex */
    public class ViewOnClickListenerC3867f implements View.OnClickListener {
        ViewOnClickListenerC3867f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ImageView imageView;
            int i11;
            try {
                if (ZVideoControl.this.f15407O) {
                    ZVideoControl.this.f15407O = false;
                    if (!ZVideoControl.this.f15409Q) {
                        ZVideoControl.this.m18486n0();
                        ZVideoControl.this.m18489p0();
                    }
                    imageView = ZVideoControl.this.f15403K;
                    i11 = AbstractC3873d.zad__ic_video_sound_off;
                } else {
                    ZVideoControl.this.f15407O = true;
                    if (!ZVideoControl.this.f15409Q) {
                        ZVideoControl.this.m18486n0();
                        ZVideoControl.this.m18489p0();
                    }
                    imageView = ZVideoControl.this.f15403K;
                    i11 = AbstractC3873d.zad__ic_video_sound_on;
                }
                imageView.setImageResource(i11);
                if (ZVideoControl.this.f15434x != null) {
                    ZVideoControl.this.f15434x.onInteracted();
                }
            } catch (Exception e11) {
                Adtima.m18329e(ZVideoControl.f15392k0, "onClick", e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.adtima.control.ZVideoControl$g */
    /* loaded from: classes2.dex */
    public class C3868g extends TimerTask {

        /* renamed from: com.adtima.control.ZVideoControl$g$a */
        /* loaded from: classes2.dex */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                int i11;
                try {
                    if (ZVideoControl.this.f15436z == null || !ZVideoControl.this.f15436z.m18376u()) {
                        return;
                    }
                    if (ZVideoControl.this.f15435y != null && ZVideoControl.this.f15401I != null && ZVideoControl.this.f15402J != null) {
                        ZVideoControl.this.f15435y.setVisibility(8);
                        ZVideoControl.this.f15401I.setVisibility(8);
                        ZVideoControl.this.f15402J.setVisibility(8);
                    }
                    ZVideoControl zVideoControl = ZVideoControl.this;
                    zVideoControl.f15406N = zVideoControl.f15436z.getCurrentPosition();
                    try {
                        i11 = AbstractC22011d.m114901b(ZVideoControl.this.f15432v.m123349i());
                    } catch (Exception unused) {
                        i11 = 0;
                    }
                    ZVideoControl.this.f15400H.setText(String.valueOf(i11 == 0 ? ZVideoControl.this.f15406N / 1000 : i11 - (ZVideoControl.this.f15406N / 1000)));
                    try {
                        ZVideoControl zVideoControl2 = ZVideoControl.this;
                        zVideoControl2.m18477h(zVideoControl2.f15406N / 1000, i11);
                        if (ZVideoControl.this.f15434x != null) {
                            ZVideoControl.this.f15434x.onCurrentDuration(ZVideoControl.this.f15406N / 1000, i11);
                        }
                    } catch (Exception unused2) {
                    }
                    ZVideoControl.this.m18498u0();
                } catch (Exception e11) {
                    Adtima.m18329e(ZVideoControl.f15392k0, "startToolBarTimer", e11);
                }
            }
        }

        C3868g() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            try {
                if (ZVideoControl.this.f15431u != null) {
                    ZVideoControl.this.f15431u.post(new a());
                }
            } catch (Exception e11) {
                Adtima.m18329e(ZVideoControl.f15392k0, "startToolBarTimer", e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.adtima.control.ZVideoControl$h */
    /* loaded from: classes2.dex */
    public class C3869h extends TimerTask {

        /* renamed from: p */
        final /* synthetic */ int f15445p;

        C3869h(int i11) {
            this.f15445p = i11;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            ZVideoControl zVideoControl;
            EnumC23496b enumC23496b;
            if (ZVideoControl.this.m18510b0()) {
                try {
                    int currentPosition = ZVideoControl.this.f15436z.getCurrentPosition();
                    if (currentPosition == 0) {
                        return;
                    }
                    int i11 = (currentPosition * 100) / this.f15445p;
                    if (ZVideoControl.this.f15420e0 != null) {
                        int i12 = currentPosition / 1000;
                        if (ZVideoControl.this.f15420e0.containsKey(Integer.valueOf(i12))) {
                            ZVideoControl.this.m18492r(i12);
                        }
                    }
                    if (i11 >= ZVideoControl.this.f15405M * 25) {
                        if (ZVideoControl.this.f15405M == 0) {
                            zVideoControl = ZVideoControl.this;
                            enumC23496b = EnumC23496b.start;
                        } else if (ZVideoControl.this.f15405M == 1) {
                            zVideoControl = ZVideoControl.this;
                            enumC23496b = EnumC23496b.firstQuartile;
                        } else {
                            if (ZVideoControl.this.f15405M != 2) {
                                if (ZVideoControl.this.f15405M == 3) {
                                    zVideoControl = ZVideoControl.this;
                                    enumC23496b = EnumC23496b.thirdQuartile;
                                }
                                ZVideoControl.m18479i0(ZVideoControl.this);
                            }
                            zVideoControl = ZVideoControl.this;
                            enumC23496b = EnumC23496b.midpoint;
                        }
                        zVideoControl.m18499v(enumC23496b);
                        ZVideoControl.m18479i0(ZVideoControl.this);
                    }
                } catch (Exception unused) {
                    cancel();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.adtima.control.ZVideoControl$i */
    /* loaded from: classes2.dex */
    public class C3870i extends AbstractRunnableC0008c {

        /* renamed from: p */
        final /* synthetic */ String f15447p;

        C3870i(String str) {
            this.f15447p = str;
        }

        @Override // p001a.p005d.AbstractRunnableC0008c
        public Void doInBackground() {
            try {
                String str = this.f15447p;
                if (str == null || str.length() == 0) {
                    return null;
                }
                ZVideoControl.this.f15404L = C20208l.m105404b().m105406a(this.f15447p);
                return null;
            } catch (Exception e11) {
                Adtima.m18329e(ZVideoControl.f15392k0, "doInBackground", e11);
                return null;
            }
        }

        @Override // p001a.p005d.AbstractRunnableC0008c
        public void onPostExecute(Void r32) {
            try {
                if (ZVideoControl.this.f15404L != null) {
                    ZVideoControl.this.f15393A.setImageBitmap(ZVideoControl.this.f15404L);
                }
            } catch (Exception e11) {
                Adtima.m18329e(ZVideoControl.f15392k0, "onPostExecute", e11);
            }
        }
    }

    /* renamed from: com.adtima.control.ZVideoControl$j */
    /* loaded from: classes2.dex */
    public static class C3871j {
        public void onCompleted() {
        }

        public void onCurrentDuration(int i11, int i12) {
        }

        public void onInteracted() {
        }
    }

    /* renamed from: com.adtima.control.ZVideoControl$k */
    /* loaded from: classes2.dex */
    public enum EnumC3872k {
        CIRCLE,
        BAR
    }

    public ZVideoControl(Context context) {
        super(context);
        this.f15426p = null;
        this.f15427q = null;
        this.f15428r = null;
        this.f15429s = null;
        this.f15431u = null;
        this.f15432v = null;
        this.f15433w = null;
        this.f15434x = null;
        this.f15435y = null;
        this.f15436z = null;
        this.f15393A = null;
        this.f15394B = null;
        this.f15395C = null;
        this.f15396D = null;
        this.f15397E = EnumC3872k.CIRCLE;
        this.f15398F = null;
        this.f15399G = null;
        this.f15400H = null;
        this.f15401I = null;
        this.f15402J = null;
        this.f15403K = null;
        this.f15404L = null;
        this.f15405M = 0;
        this.f15406N = 0;
        this.f15407O = false;
        this.f15408P = false;
        this.f15409Q = true;
        this.f15410R = false;
        this.f15411S = true;
        this.f15412T = true;
        this.f15413U = true;
        this.f15414V = false;
        this.f15415W = -1;
        this.f15416a0 = -1;
        this.f15417b0 = -1;
        this.f15418c0 = null;
        this.f15419d0 = null;
        this.f15420e0 = null;
        this.f15421f0 = null;
        this.f15422g0 = null;
        this.f15423h0 = null;
        this.f15424i0 = null;
        this.f15425j0 = new C3862a();
        try {
            this.f15430t = context;
            m18464X();
        } catch (Exception e11) {
            Adtima.m18329e(f15392k0, "VASTControl", e11);
        }
    }

    /* renamed from: B */
    private void m18442B(EnumC23496b enumC23496b) {
        try {
            HashMap hashMap = this.f15419d0;
            if (hashMap == null || this.f15433w == null) {
                return;
            }
            this.f15433w.onVastEvent(enumC23496b, (List) hashMap.get(enumC23496b));
        } catch (Exception unused) {
        }
    }

    /* renamed from: C */
    private void m18443C(boolean z11) {
        try {
            ImageView imageView = this.f15393A;
            if (imageView == null) {
                Adtima.m18326d(f15392k0, "Thumbnail null");
            } else {
                imageView.setVisibility(z11 ? 0 : 8);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: D */
    private void m18444D() {
        ImageView imageView;
        int i11;
        try {
            ProgressBar progressBar = (ProgressBar) findViewById(AbstractC3874e.zad__video_bar_progress);
            this.f15399G = progressBar;
            progressBar.setVisibility(4);
            ImageView imageView2 = (ImageView) findViewById(AbstractC3874e.zad__video_sound);
            this.f15403K = imageView2;
            imageView2.setVisibility(4);
            if (this.f15407O) {
                imageView = this.f15403K;
                i11 = AbstractC3873d.zad__ic_video_sound_on;
            } else {
                imageView = this.f15403K;
                i11 = AbstractC3873d.zad__ic_video_sound_off;
            }
            imageView.setImageResource(i11);
            this.f15403K.setOnClickListener(new ViewOnClickListenerC3867f());
        } catch (Exception unused) {
        }
    }

    /* renamed from: E */
    private void m18445E(EnumC23496b enumC23496b) {
        try {
            HashMap hashMap = this.f15421f0;
            if (hashMap != null) {
                hashMap.put(enumC23496b, Boolean.TRUE);
            }
        } catch (Exception e11) {
            Adtima.m18329e(f15392k0, "markEventAfterCalled", e11);
        }
    }

    /* renamed from: F */
    private boolean m18446F(int i11) {
        try {
            Boolean bool = (Boolean) this.f15422g0.get(Integer.valueOf(i11));
            if (bool != null) {
                if (bool.booleanValue()) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* renamed from: I */
    private void m18449I() {
        ProgressBar progressBar;
        Drawable indeterminateDrawable;
        PorterDuff.Mode mode;
        try {
            this.f15435y = (RelativeLayout) findViewById(AbstractC3874e.zad__video_central_bar);
            ImageView imageView = (ImageView) findViewById(AbstractC3874e.zad__video_play_replay);
            this.f15401I = imageView;
            imageView.setVisibility(8);
            this.f15401I.setImageResource(AbstractC3873d.zad__ic_video_play);
            this.f15401I.setOnClickListener(new ViewOnClickListenerC3865d());
            m18443C(true);
            ProgressBar progressBar2 = (ProgressBar) findViewById(AbstractC3874e.zad__video_loading);
            this.f15402J = progressBar2;
            progressBar2.setVisibility(0);
            if (this.f15416a0 > 0 && this.f15417b0 > 0) {
                this.f15402J.setLayoutParams(new RelativeLayout.LayoutParams(this.f15416a0, this.f15417b0));
            }
            int i11 = -1;
            if (this.f15415W > 0) {
                Drawable drawable = getContext().getResources().getDrawable(this.f15415W);
                if (drawable != null) {
                    this.f15402J.setIndeterminateDrawable(drawable);
                    return;
                } else if (this.f15413U) {
                    indeterminateDrawable = this.f15402J.getIndeterminateDrawable();
                    mode = PorterDuff.Mode.MULTIPLY;
                    i11 = -16740379;
                } else {
                    progressBar = this.f15402J;
                    indeterminateDrawable = progressBar.getIndeterminateDrawable();
                    mode = PorterDuff.Mode.MULTIPLY;
                }
            } else if (this.f15413U) {
                indeterminateDrawable = this.f15402J.getIndeterminateDrawable();
                mode = PorterDuff.Mode.MULTIPLY;
                i11 = -16740379;
            } else {
                progressBar = this.f15402J;
                indeterminateDrawable = progressBar.getIndeterminateDrawable();
                mode = PorterDuff.Mode.MULTIPLY;
            }
            indeterminateDrawable.setColorFilter(i11, mode);
        } catch (Exception unused) {
        }
    }

    /* renamed from: J */
    private void m18450J(int i11) {
        try {
            HashMap hashMap = this.f15422g0;
            if (hashMap != null) {
                hashMap.put(Integer.valueOf(i11), Boolean.TRUE);
            }
        } catch (Exception e11) {
            Adtima.m18329e(f15392k0, "markEventProgressAfterCalled", e11);
        }
    }

    /* renamed from: L */
    private void m18452L() {
        try {
            View findViewById = findViewById(AbstractC3874e.zad__video_top_bar);
            this.f15395C = findViewById;
            findViewById.setVisibility(4);
            ProgressBar progressBar = (ProgressBar) findViewById(AbstractC3874e.zad__video_progress);
            this.f15398F = progressBar;
            progressBar.setVisibility(4);
            TextView textView = (TextView) findViewById(AbstractC3874e.zad__video_count_down);
            this.f15400H = textView;
            textView.setVisibility(4);
            RelativeLayout relativeLayout = (RelativeLayout) findViewById(AbstractC3874e.zad__video_view_more);
            this.f15396D = relativeLayout;
            relativeLayout.setOnClickListener(new ViewOnClickListenerC3866e());
        } catch (Exception unused) {
        }
    }

    /* renamed from: N */
    private void m18454N() {
        try {
            this.f15400H.setText(String.valueOf(AbstractC22011d.m114901b(this.f15432v.m123349i())));
        } catch (Exception unused) {
        }
    }

    /* renamed from: P */
    private void m18456P() {
        try {
            C23498d c23498d = this.f15432v;
            if (c23498d == null || this.f15433w == null) {
                return;
            }
            this.f15433w.onVastClick(c23498d.m123359s().m125453a(), this.f15432v.m123359s().m125455d());
        } catch (Exception unused) {
        }
    }

    /* renamed from: R */
    private void m18458R() {
        try {
            this.f15414V = true;
            C23498d c23498d = this.f15432v;
            if (c23498d != null && this.f15433w != null) {
                this.f15433w.onVastImpression(c23498d.m123356p());
            }
            m18499v(EnumC23496b.creativeView);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: T */
    public void m18460T() {
        InterfaceC19747i interfaceC19747i;
        try {
            C23498d c23498d = this.f15432v;
            if (c23498d == null || (interfaceC19747i = this.f15433w) == null) {
                return;
            }
            interfaceC19747i.onVastLoadFinished(c23498d);
        } catch (Exception unused) {
        }
    }

    /* renamed from: V */
    private void m18462V() {
        try {
            HashMap hashMap = this.f15421f0;
            if (hashMap == null) {
                this.f15421f0 = new HashMap();
                this.f15422g0 = new HashMap();
            } else {
                hashMap.clear();
                this.f15422g0.clear();
            }
            if (this.f15423h0 == null) {
                HashMap hashMap2 = new HashMap();
                this.f15423h0 = hashMap2;
                EnumC23496b enumC23496b = EnumC23496b.creativeView;
                EnumC23496b enumC23496b2 = EnumC23496b.start;
                EnumC23496b enumC23496b3 = EnumC23496b.firstQuartile;
                hashMap2.put(enumC23496b3, Arrays.asList(enumC23496b, enumC23496b2));
                HashMap hashMap3 = this.f15423h0;
                EnumC23496b enumC23496b4 = EnumC23496b.midpoint;
                hashMap3.put(enumC23496b4, Arrays.asList(enumC23496b, enumC23496b2, enumC23496b3));
                HashMap hashMap4 = this.f15423h0;
                EnumC23496b enumC23496b5 = EnumC23496b.thirdQuartile;
                hashMap4.put(enumC23496b5, Arrays.asList(enumC23496b, enumC23496b2, enumC23496b3, enumC23496b4));
                this.f15423h0.put(EnumC23496b.complete, Arrays.asList(enumC23496b, enumC23496b2, enumC23496b3, enumC23496b4, enumC23496b5));
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: X */
    private void m18464X() {
        try {
            LayoutInflater.from(this.f15430t).inflate(AbstractC3875f.zad__widget_video_control, this);
            CustomVideoView customVideoView = (CustomVideoView) findViewById(AbstractC3874e.zad__video_render_view);
            this.f15436z = customVideoView;
            customVideoView.setZOrderOnTop(false);
            this.f15436z.setZOrderMediaOverlay(true);
            this.f15436z.setOnCompletionListener(this);
            this.f15436z.setOnErrorListener(this);
            this.f15436z.setOnPreparedListener(this);
            this.f15436z.setOnInfoListener(this);
            this.f15436z.setOnClickListener(new ViewOnClickListenerC3863b());
            this.f15393A = (ImageView) findViewById(AbstractC3874e.zad__video_thumb);
            m18452L();
            m18449I();
            m18444D();
            m18462V();
        } catch (Exception e11) {
            Adtima.m18329e(f15392k0, "initViews", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m18467b() {
        try {
            if (!this.f15408P && !this.f15409Q) {
                this.f15403K.performClick();
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f0 */
    public void m18474f0() {
        try {
            CustomVideoView customVideoView = this.f15436z;
            if (customVideoView == null) {
                return;
            }
            boolean m18376u = customVideoView.m18376u();
            C3871j c3871j = this.f15434x;
            if (c3871j != null) {
                c3871j.onInteracted();
            }
            m18443C(m18376u);
            if (m18376u) {
                m18513j0();
                return;
            }
            if (this.f15409Q) {
                m18514l0();
                return;
            }
            this.f15405M = 0;
            m18462V();
            Adtima.m18328e(f15392k0, "#3. Process Play Steps");
            m18514l0();
            if (!this.f15408P || this.f15414V) {
                return;
            }
            m18458R();
        } catch (Exception unused) {
        }
    }

    /* renamed from: g */
    private void m18475g(int i11) {
        try {
            if (this.f15433w != null) {
                C23498d c23498d = this.f15432v;
                this.f15433w.onVastError(AbstractC23495a.m123332a(i11), c23498d != null ? c23498d.m123352l() : null);
            }
            Adtima.m18328e(f15392k0, "VASTError: " + AbstractC23495a.m123333b(i11));
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public void m18477h(int i11, int i12) {
        ProgressBar progressBar;
        if (i11 > 0) {
            try {
                if (this.f15396D.getVisibility() == 4 && this.f15411S) {
                    this.f15396D.setVisibility(0);
                }
                EnumC3872k enumC3872k = this.f15397E;
                if (enumC3872k != EnumC3872k.CIRCLE) {
                    if (enumC3872k == EnumC3872k.BAR) {
                        if (this.f15399G.getVisibility() != 0) {
                            this.f15399G.setVisibility(0);
                        }
                        this.f15399G.setMax(100);
                        int i13 = (i11 * 100) / i12;
                        progressBar = this.f15399G;
                        i11 = Math.min(i13, 100);
                    }
                    if (this.f15398F.getVisibility() != 0 || this.f15396D.getVisibility() == 0) {
                        this.f15395C.setVisibility(0);
                    } else {
                        this.f15395C.setVisibility(4);
                        return;
                    }
                }
                if (this.f15398F.getVisibility() != 0) {
                    this.f15398F.setVisibility(0);
                }
                if (this.f15400H.getVisibility() != 0) {
                    this.f15400H.setVisibility(0);
                }
                this.f15398F.setMax(i12);
                progressBar = this.f15398F;
                progressBar.setProgress(i11);
                if (this.f15398F.getVisibility() != 0) {
                }
                this.f15395C.setVisibility(0);
            } catch (Exception e11) {
                Adtima.m18329e(f15392k0, "onCurrentDuration", e11);
            }
        }
    }

    /* renamed from: i0 */
    static /* synthetic */ int m18479i0(ZVideoControl zVideoControl) {
        int i11 = zVideoControl.f15405M;
        zVideoControl.f15405M = i11 + 1;
        return i11;
    }

    /* renamed from: k */
    private void m18481k(String str) {
        try {
            C3870i c3870i = new C3870i(str);
            this.f15418c0 = c3870i;
            C0009d.m11g(c3870i);
        } catch (Exception e11) {
            Adtima.m18329e(f15392k0, "doDownloadImageTask", e11);
        }
    }

    /* renamed from: l */
    private void m18483l(EnumC23496b enumC23496b) {
        C23498d c23498d;
        List<EnumC23496b> list;
        try {
            HashMap hashMap = this.f15423h0;
            if (hashMap != null && hashMap.containsKey(enumC23496b) && (list = (List) this.f15423h0.get(enumC23496b)) != null && list.size() != 0) {
                for (EnumC23496b enumC23496b2 : list) {
                    Boolean bool = (Boolean) this.f15421f0.get(enumC23496b2);
                    if (bool != null && bool.booleanValue()) {
                    }
                    m18442B(enumC23496b2);
                    m18445E(enumC23496b2);
                }
            }
            EnumC23496b enumC23496b3 = EnumC23496b.complete;
            if (enumC23496b == enumC23496b3 || enumC23496b == EnumC23496b.close) {
                int i11 = this.f15406N / 1000;
                if (enumC23496b == enumC23496b3 && (c23498d = this.f15432v) != null) {
                    i11 = AbstractC22011d.m114901b(c23498d.m123349i());
                }
                for (int i12 = 0; i12 <= i11; i12++) {
                    if (!m18446F(i12)) {
                        m18503y(i12);
                        m18450J(i12);
                    }
                }
            }
        } catch (Exception e11) {
            Adtima.m18329e(f15392k0, "checkBackwardEventAfterCalled", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n0 */
    public void m18486n0() {
        EnumC23496b enumC23496b;
        try {
            MediaPlayer mediaPlayer = this.f15394B;
            if (mediaPlayer != null) {
                if (this.f15407O) {
                    mediaPlayer.setVolume(0.8f, 0.8f);
                    enumC23496b = EnumC23496b.unmute;
                } else {
                    mediaPlayer.setVolume(0.0f, 0.0f);
                    enumC23496b = EnumC23496b.mute;
                }
                m18442B(enumC23496b);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p0 */
    public boolean m18489p0() {
        try {
            if (!this.f15407O) {
                this.f15424i0.abandonAudioFocus(this.f15425j0);
            } else if (this.f15424i0.requestAudioFocus(this.f15425j0, 3, 1) == 1) {
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* renamed from: q */
    private void m18490q() {
        try {
            CustomVideoView customVideoView = this.f15436z;
            if (customVideoView != null) {
                if (customVideoView.m18376u()) {
                    this.f15436z.m18373F();
                }
                this.f15436z.setOnCompletionListener(null);
                this.f15436z.setOnErrorListener(null);
                this.f15436z.setOnPreparedListener(null);
                this.f15436z = null;
            }
            if (this.f15393A != null) {
                this.f15393A = null;
            }
            AbstractRunnableC0008c abstractRunnableC0008c = this.f15418c0;
            if (abstractRunnableC0008c != null) {
                if (abstractRunnableC0008c.getStatus() == AbstractRunnableC0008c.d.RUNNING) {
                    C0009d.m7c(this.f15418c0);
                }
                this.f15418c0 = null;
            }
            this.f15394B = null;
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public void m18492r(int i11) {
        try {
            m18503y(i11);
            m18450J(i11);
        } catch (Exception unused) {
        }
    }

    /* renamed from: r0 */
    private boolean m18493r0() {
        try {
            this.f15424i0.abandonAudioFocus(this.f15425j0);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: s0 */
    private void m18495s0() {
        try {
            m18501w0();
            int duration = this.f15436z.getDuration();
            this.f15428r = new Timer();
            C3869h c3869h = new C3869h(duration);
            this.f15429s = c3869h;
            this.f15428r.scheduleAtFixedRate(c3869h, 0L, 250L);
        } catch (Exception unused) {
        }
    }

    /* renamed from: u */
    private void m18497u(String str) {
        String str2;
        String str3;
        try {
            if (this.f15393A == null) {
                str2 = f15392k0;
                str3 = "Thumbnail null";
            } else {
                if (str != null && str.trim().length() != 0) {
                    AbstractRunnableC0008c abstractRunnableC0008c = this.f15418c0;
                    if (abstractRunnableC0008c == null) {
                        m18481k(str);
                        return;
                    } else {
                        if (abstractRunnableC0008c.getStatus() != AbstractRunnableC0008c.d.PENDING) {
                            C0009d.m7c(this.f15418c0);
                            this.f15418c0 = null;
                            return;
                        }
                        return;
                    }
                }
                str2 = f15392k0;
                str3 = "Url invalid";
            }
            Adtima.m18326d(str2, str3);
        } catch (Exception e11) {
            Adtima.m18329e(f15392k0, "loadThumbnailData", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u0 */
    public void m18498u0() {
        try {
            CustomVideoView customVideoView = this.f15436z;
            if (customVideoView == null || !customVideoView.m18376u()) {
                return;
            }
            this.f15426p = new Timer();
            C3868g c3868g = new C3868g();
            this.f15427q = c3868g;
            this.f15426p.schedule(c3868g, 250L);
        } catch (Exception e11) {
            Adtima.m18329e(f15392k0, "startToolBarTimer", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public void m18499v(EnumC23496b enumC23496b) {
        try {
            m18442B(enumC23496b);
            m18445E(enumC23496b);
            m18483l(enumC23496b);
        } catch (Exception unused) {
        }
    }

    /* renamed from: w0 */
    private void m18501w0() {
        try {
            TimerTask timerTask = this.f15429s;
            if (timerTask != null) {
                timerTask.cancel();
                this.f15429s = null;
            }
            Timer timer = this.f15428r;
            if (timer != null) {
                timer.cancel();
                this.f15428r = null;
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: y */
    private void m18503y(int i11) {
        List list;
        try {
            if (this.f15420e0 == null || this.f15433w == null || m18446F(i11) || (list = (List) this.f15420e0.get(Integer.valueOf(i11))) == null || list.size() == 0) {
                return;
            }
            this.f15433w.onVastEvent(EnumC23496b.progress, list);
        } catch (Exception unused) {
        }
    }

    /* renamed from: y0 */
    private void m18504y0() {
        try {
            TimerTask timerTask = this.f15427q;
            if (timerTask != null) {
                timerTask.cancel();
                this.f15427q = null;
            }
            Timer timer = this.f15426p;
            if (timer != null) {
                timer.cancel();
                this.f15426p = null;
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: A */
    public void m18507A(String str) {
        try {
            m18497u(str);
            m18443C(true);
        } catch (Exception e11) {
            Adtima.m18329e(f15392k0, "loadVideoThumbnail", e11);
        }
    }

    /* renamed from: Z */
    public boolean m18508Z() {
        return this.f15408P;
    }

    /* renamed from: a */
    public void m18509a() {
        try {
            ImageView imageView = this.f15403K;
            if (imageView != null) {
                imageView.performClick();
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: b0 */
    public boolean m18510b0() {
        try {
            CustomVideoView customVideoView = this.f15436z;
            if (customVideoView != null) {
                if (customVideoView.m18376u()) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* renamed from: d0 */
    public boolean m18511d0() {
        return this.f15407O;
    }

    public int getCurrentTimeInSecond() {
        int i11 = this.f15406N;
        if (i11 > 0) {
            return i11 / 1000;
        }
        return 0;
    }

    public int getVideoDuration() {
        try {
            return AbstractC22011d.m114901b(this.f15432v.m123349i());
        } catch (Exception unused) {
            return 0;
        }
    }

    public float getVideoVolume() {
        return this.f15407O ? 0.8f : 0.0f;
    }

    /* renamed from: h0 */
    public void m18512h0() {
        try {
            CustomVideoView customVideoView = this.f15436z;
            if (customVideoView != null && customVideoView.m18376u()) {
                m18513j0();
            }
            m18456P();
        } catch (Exception unused) {
        }
    }

    /* renamed from: j0 */
    public void m18513j0() {
        try {
            if (this.f15409Q) {
                return;
            }
            this.f15409Q = true;
            this.f15436z.m18371A();
            this.f15406N = this.f15436z.getCurrentPosition();
            this.f15401I.setImageResource(AbstractC3873d.zad__ic_video_play);
            this.f15401I.setVisibility(0);
            this.f15435y.setVisibility(0);
            m18493r0();
            if (this.f15408P) {
                return;
            }
            m18499v(EnumC23496b.pause);
        } catch (Exception unused) {
        }
    }

    /* renamed from: l0 */
    public void m18514l0() {
        try {
            m18489p0();
            m18486n0();
            this.f15409Q = false;
            this.f15436z.m18374e(this.f15406N);
            this.f15436z.m18372D();
            if (!this.f15408P && this.f15436z.getCurrentPosition() > 500) {
                m18499v(EnumC23496b.resume);
            }
            m18504y0();
            m18498u0();
            m18495s0();
        } catch (Exception unused) {
        }
    }

    /* renamed from: m */
    public void m18515m(boolean z11) {
        try {
            if (this.f15409Q) {
                return;
            }
            this.f15409Q = true;
            this.f15436z.m18371A();
            this.f15406N = this.f15436z.getCurrentPosition();
            this.f15401I.setImageResource(AbstractC3873d.zad__ic_video_play);
            this.f15401I.setVisibility(0);
            this.f15435y.setVisibility(0);
            if (!z11) {
                this.f15407O = false;
                ImageView imageView = this.f15403K;
                if (imageView != null) {
                    imageView.setImageResource(AbstractC3873d.zad__ic_video_sound_off);
                }
            }
            m18493r0();
            if (this.f15408P) {
                return;
            }
            m18499v(EnumC23496b.pause);
        } catch (Exception unused) {
        }
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(MediaPlayer mediaPlayer) {
        try {
            this.f15406N = 0;
            C3871j c3871j = this.f15434x;
            if (c3871j != null) {
                c3871j.onCompleted();
            }
            if (this.f15435y != null && this.f15401I != null && this.f15402J != null) {
                m18443C(true);
                this.f15401I.setImageResource(AbstractC3873d.zad__ic_video_replay);
                this.f15435y.setVisibility(0);
                this.f15401I.setVisibility(0);
            }
            if (this.f15410R || this.f15408P) {
                return;
            }
            this.f15408P = true;
            this.f15405M = 0;
            m18504y0();
            m18501w0();
            m18454N();
            m18499v(EnumC23496b.complete);
            ProgressBar progressBar = this.f15398F;
            if (progressBar != null) {
                progressBar.setProgress(progressBar.getMax());
            }
            ProgressBar progressBar2 = this.f15399G;
            if (progressBar2 != null) {
                progressBar2.setProgress(100);
            }
            this.f15414V = false;
        } catch (Exception e11) {
            Adtima.m18329e(f15392k0, "onCompletion", e11);
        }
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public boolean onError(MediaPlayer mediaPlayer, int i11, int i12) {
        try {
            this.f15410R = true;
            m18475g(4);
        } catch (Exception e11) {
            Adtima.m18329e(f15392k0, "onError", e11);
        }
        return true;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public boolean onInfo(MediaPlayer mediaPlayer, int i11, int i12) {
        RelativeLayout relativeLayout;
        try {
            if (i11 != 3) {
                if (i11 == 701) {
                    RelativeLayout relativeLayout2 = this.f15435y;
                    if (relativeLayout2 != null && this.f15401I != null && this.f15402J != null) {
                        relativeLayout2.setVisibility(0);
                        this.f15402J.setVisibility(0);
                    }
                } else if (i11 == 702 && (relativeLayout = this.f15435y) != null && this.f15401I != null && this.f15402J != null) {
                    if (this.f15409Q) {
                        relativeLayout.setVisibility(0);
                        this.f15402J.setVisibility(8);
                        this.f15401I.setVisibility(0);
                    } else {
                        relativeLayout.setVisibility(8);
                        this.f15402J.setVisibility(8);
                    }
                }
                this.f15401I.setVisibility(8);
            } else {
                CustomVideoView customVideoView = this.f15436z;
                if (customVideoView != null && customVideoView.getCurrentPosition() < 500) {
                    m18499v(EnumC23496b.creativeView);
                }
                m18443C(false);
            }
        } catch (Exception unused) {
        }
        return false;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public void onPrepared(MediaPlayer mediaPlayer) {
        try {
            this.f15394B = mediaPlayer;
            mediaPlayer.setAudioStreamType(3);
            this.f15410R = false;
            this.f15408P = false;
            setBackgroundColor(-16777216);
            this.f15436z.setBackgroundColor(0);
            this.f15436z.getHolder().setType(3);
            if (this.f15409Q) {
                int i11 = this.f15406N;
                if (i11 <= 0) {
                    i11 = 100;
                }
                if (AbstractC19211f.m100806a(22)) {
                    this.f15436z.m18372D();
                }
                this.f15436z.m18374e(i11);
                this.f15436z.m18371A();
                RelativeLayout relativeLayout = this.f15435y;
                if (relativeLayout != null && this.f15401I != null && this.f15402J != null) {
                    relativeLayout.setVisibility(0);
                    this.f15401I.setVisibility(0);
                    this.f15402J.setVisibility(8);
                }
            } else {
                RelativeLayout relativeLayout2 = this.f15435y;
                if (relativeLayout2 != null && this.f15401I != null && this.f15402J != null) {
                    relativeLayout2.setVisibility(8);
                    this.f15401I.setVisibility(8);
                    this.f15402J.setVisibility(8);
                }
                m18514l0();
            }
            if (this.f15412T) {
                this.f15403K.setVisibility(0);
            } else {
                this.f15403K.setVisibility(4);
            }
            this.f15436z.setVisibility(0);
        } catch (Exception unused) {
        }
    }

    public void setClickPanelEnable(boolean z11) {
        RelativeLayout relativeLayout;
        int i11;
        try {
            this.f15411S = z11;
            if (z11) {
                relativeLayout = this.f15396D;
                i11 = 0;
            } else {
                relativeLayout = this.f15396D;
                i11 = 4;
            }
            relativeLayout.setVisibility(i11);
        } catch (Exception unused) {
        }
    }

    public void setIsAdtimaVideo(boolean z11) {
        try {
            this.f15413U = z11;
        } catch (Exception e11) {
            Adtima.m18329e(f15392k0, "setProgressBarColor", e11);
        }
    }

    public void setListener(C3871j c3871j) {
        this.f15434x = c3871j;
    }

    public void setProgressBarIndeterminateDrawableId(int i11) {
        this.f15415W = i11;
    }

    public void setProgressModel(EnumC3872k enumC3872k) {
        this.f15397E = enumC3872k;
    }

    public void setSoundIconVisible(boolean z11) {
        this.f15412T = z11;
    }

    public void setSoundOn(boolean z11) {
        ImageView imageView;
        int i11;
        try {
            this.f15407O = z11;
            if (z11) {
                imageView = this.f15403K;
                i11 = AbstractC3873d.zad__ic_video_sound_on;
            } else {
                imageView = this.f15403K;
                i11 = AbstractC3873d.zad__ic_video_sound_off;
            }
            imageView.setImageResource(i11);
        } catch (Exception unused) {
        }
    }

    public void setVastListener(InterfaceC19747i interfaceC19747i) {
        this.f15433w = interfaceC19747i;
    }

    public void setVastModel(C23498d c23498d) {
        try {
            this.f15432v = c23498d;
            if (c23498d == null) {
                m18475g(2);
            } else {
                this.f15419d0 = c23498d.m123354n();
                this.f15420e0 = this.f15432v.m123358r();
                m18454N();
                String m125446i = this.f15432v.m123357q().m125446i();
                C20199c.m105336g().m105345j(m125446i);
                this.f15436z.setVideoURI(Uri.parse(m125446i));
                this.f15436z.requestFocus();
                new Handler().postDelayed(new RunnableC3864c(), 0L);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: w */
    public void m18516w(boolean z11) {
        Adtima.m18328e(f15392k0, "processPlayStepsWithSoundRequest");
        try {
            if (z11) {
                m18489p0();
            } else {
                this.f15407O = false;
                m18493r0();
                ImageView imageView = this.f15403K;
                if (imageView != null) {
                    imageView.setImageResource(AbstractC3873d.zad__ic_video_sound_off);
                }
            }
            m18486n0();
            this.f15409Q = false;
            this.f15436z.m18374e(this.f15406N);
            this.f15436z.m18372D();
            if (!this.f15408P && this.f15436z.getCurrentPosition() > 500) {
                m18499v(EnumC23496b.resume);
            }
            m18504y0();
            m18498u0();
            m18495s0();
        } catch (Exception unused) {
        }
    }

    /* renamed from: x */
    public void m18517x() {
        AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener;
        try {
            if (!this.f15410R) {
                m18499v(EnumC23496b.close);
            }
        } catch (Exception unused) {
        }
        try {
            m18490q();
            m18501w0();
            m18504y0();
            this.f15430t = null;
            this.f15431u = null;
            this.f15432v = null;
            this.f15433w = null;
            this.f15434x = null;
            this.f15435y = null;
            this.f15401I = null;
            this.f15402J = null;
            this.f15400H = null;
            this.f15403K = null;
            this.f15419d0 = null;
            this.f15420e0 = null;
            this.f15421f0 = null;
            this.f15422g0 = null;
            this.f15423h0 = null;
            removeAllViews();
        } catch (Exception unused2) {
        }
        try {
            AudioManager audioManager = this.f15424i0;
            if (audioManager == null || (onAudioFocusChangeListener = this.f15425j0) == null) {
                return;
            }
            audioManager.abandonAudioFocus(onAudioFocusChangeListener);
            this.f15424i0 = null;
            this.f15425j0 = null;
        } catch (Exception unused3) {
        }
    }

    public ZVideoControl(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f15426p = null;
        this.f15427q = null;
        this.f15428r = null;
        this.f15429s = null;
        this.f15431u = null;
        this.f15432v = null;
        this.f15433w = null;
        this.f15434x = null;
        this.f15435y = null;
        this.f15436z = null;
        this.f15393A = null;
        this.f15394B = null;
        this.f15395C = null;
        this.f15396D = null;
        this.f15397E = EnumC3872k.CIRCLE;
        this.f15398F = null;
        this.f15399G = null;
        this.f15400H = null;
        this.f15401I = null;
        this.f15402J = null;
        this.f15403K = null;
        this.f15404L = null;
        this.f15405M = 0;
        this.f15406N = 0;
        this.f15407O = false;
        this.f15408P = false;
        this.f15409Q = true;
        this.f15410R = false;
        this.f15411S = true;
        this.f15412T = true;
        this.f15413U = true;
        this.f15414V = false;
        this.f15415W = -1;
        this.f15416a0 = -1;
        this.f15417b0 = -1;
        this.f15418c0 = null;
        this.f15419d0 = null;
        this.f15420e0 = null;
        this.f15421f0 = null;
        this.f15422g0 = null;
        this.f15423h0 = null;
        this.f15424i0 = null;
        this.f15425j0 = new C3862a();
        try {
            this.f15430t = context;
            this.f15431u = new Handler();
            this.f15424i0 = (AudioManager) this.f15430t.getSystemService("audio");
            m18464X();
        } catch (Exception unused) {
        }
    }

    public ZVideoControl(Context context, InterfaceC19747i interfaceC19747i) {
        super(context);
        this.f15426p = null;
        this.f15427q = null;
        this.f15428r = null;
        this.f15429s = null;
        this.f15431u = null;
        this.f15432v = null;
        this.f15433w = null;
        this.f15434x = null;
        this.f15435y = null;
        this.f15436z = null;
        this.f15393A = null;
        this.f15394B = null;
        this.f15395C = null;
        this.f15396D = null;
        this.f15397E = EnumC3872k.CIRCLE;
        this.f15398F = null;
        this.f15399G = null;
        this.f15400H = null;
        this.f15401I = null;
        this.f15402J = null;
        this.f15403K = null;
        this.f15404L = null;
        this.f15405M = 0;
        this.f15406N = 0;
        this.f15407O = false;
        this.f15408P = false;
        this.f15409Q = true;
        this.f15410R = false;
        this.f15411S = true;
        this.f15412T = true;
        this.f15413U = true;
        this.f15414V = false;
        this.f15415W = -1;
        this.f15416a0 = -1;
        this.f15417b0 = -1;
        this.f15418c0 = null;
        this.f15419d0 = null;
        this.f15420e0 = null;
        this.f15421f0 = null;
        this.f15422g0 = null;
        this.f15423h0 = null;
        this.f15424i0 = null;
        this.f15425j0 = new C3862a();
        try {
            this.f15430t = context;
            this.f15433w = interfaceC19747i;
            this.f15431u = new Handler();
            this.f15424i0 = (AudioManager) this.f15430t.getSystemService("audio");
            m18464X();
        } catch (Exception unused) {
        }
    }
}
