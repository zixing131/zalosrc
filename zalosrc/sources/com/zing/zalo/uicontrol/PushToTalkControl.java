package com.zing.zalo.uicontrol;

import ag0.C0815e1;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import bz.C3162g;
import bz.InterfaceC3163h;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.SensitiveDataException;
import com.zing.zalo.biometric.AbstractC7354t0;
import com.zing.zalo.common.C7853b;
import com.zing.zalo.p077ui.widget.GoogleSoundView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.widget.SoundView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zview.AbstractC17454d;
import fd0.C18888h;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import hm0.InterfaceC20098e;
import ln0.AbstractC22543l;
import me0.AbstractC23034c6;
import me0.AbstractC23136l9;
import me0.AbstractC23160o0;
import me0.AbstractC23201r8;
import me0.AbstractC23238v2;
import me0.C23046d7;
import me0.C23081g9;
import me0.C23212s8;
import mm0.AbstractC23350e;
import org.json.JSONException;
import org.json.JSONObject;
import p207he.C20024r;
import p227i3.C20218v;
import p262jb.AbstractC21196a;
import p348mi.AbstractC23309i;
import p361nb.C23648e;
import p363nh.C23744a;
import tg.C26664o;
import th.AbstractC26683d;

/* loaded from: classes4.dex */
public final class PushToTalkControl extends AbstractPushToTalkControl implements View.OnClickListener {
    public static final C16480a Companion = new C16480a(null);

    /* renamed from: l0 */
    private static final String f83323l0 = PushToTalkControl.class.getSimpleName();

    /* renamed from: m0 */
    private static final int f83324m0 = AbstractC23136l9.m118742r(40.0f);

    /* renamed from: A */
    private ImageButton f83325A;

    /* renamed from: B */
    private ImageButton f83326B;

    /* renamed from: C */
    private ImageButton f83327C;

    /* renamed from: D */
    private ImageButton f83328D;

    /* renamed from: E */
    private AnimatorSet f83329E;

    /* renamed from: F */
    private AnimatorSet f83330F;

    /* renamed from: G */
    private ImageView f83331G;

    /* renamed from: H */
    private TextView f83332H;

    /* renamed from: I */
    private TextView f83333I;

    /* renamed from: J */
    private TextView f83334J;

    /* renamed from: K */
    private ImageButton f83335K;

    /* renamed from: L */
    private TextView f83336L;

    /* renamed from: M */
    private View f83337M;

    /* renamed from: N */
    private String f83338N;

    /* renamed from: O */
    private boolean f83339O;

    /* renamed from: P */
    private boolean f83340P;

    /* renamed from: Q */
    private boolean f83341Q;

    /* renamed from: R */
    private boolean f83342R;

    /* renamed from: S */
    private long f83343S;

    /* renamed from: T */
    private int f83344T;

    /* renamed from: U */
    private int f83345U;

    /* renamed from: V */
    private int f83346V;

    /* renamed from: W */
    private final HandlerC16481b f83347W;

    /* renamed from: a0 */
    private Rect f83348a0;

    /* renamed from: b0 */
    private Rect f83349b0;

    /* renamed from: c0 */
    private SoundView.EnumC13533a f83350c0;

    /* renamed from: d0 */
    private int f83351d0;

    /* renamed from: e0 */
    private int f83352e0;

    /* renamed from: f0 */
    private EnumC16657t f83353f0;

    /* renamed from: g0 */
    private final Runnable f83354g0;

    /* renamed from: h0 */
    private final Runnable f83355h0;

    /* renamed from: i0 */
    private final Runnable f83356i0;

    /* renamed from: j0 */
    private final Runnable f83357j0;

    /* renamed from: k0 */
    private InterfaceC3163h f83358k0;

    /* renamed from: y */
    private SoundView f83359y;

    /* renamed from: z */
    private TextView f83360z;

    /* renamed from: com.zing.zalo.uicontrol.PushToTalkControl$a */
    /* loaded from: classes4.dex */
    public static final class C16480a {
        private C16480a() {
        }

        public /* synthetic */ C16480a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final String m87893a() {
            return PushToTalkControl.f83323l0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.zing.zalo.uicontrol.PushToTalkControl$b */
    /* loaded from: classes4.dex */
    public final class HandlerC16481b extends Handler {

        /* renamed from: a */
        final /* synthetic */ PushToTalkControl f83361a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HandlerC16481b(PushToTalkControl pushToTalkControl, Looper looper) {
            super(looper);
            AbstractC19074t.m100208f(looper, "looper");
            this.f83361a = pushToTalkControl;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int m116580c;
            AbstractC19074t.m100208f(message, "msg");
            try {
                int i11 = message.what;
                if (i11 == 1) {
                    this.f83361a.m87866W();
                    return;
                }
                SoundView soundView = null;
                if (i11 != 2) {
                    if (i11 == 3) {
                        SoundView soundView2 = this.f83361a.f83359y;
                        if (soundView2 == null) {
                            AbstractC19074t.m100223u("soundView");
                        } else {
                            soundView = soundView2;
                        }
                        soundView.mo75728b();
                        this.f83361a.m87877l0(SoundView.EnumC13533a.START, false);
                        return;
                    }
                    if (i11 == 4) {
                        this.f83361a.m87876k0();
                        return;
                    }
                    return;
                }
                Object obj = message.obj;
                AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type kotlin.Int");
                int intValue = ((Integer) obj).intValue();
                PushToTalkControl pushToTalkControl = this.f83361a;
                m116580c = AbstractC22543l.m116580c(intValue, pushToTalkControl.getMaxAmplitudeRecorder());
                pushToTalkControl.setMaxAmplitudeRecorder(m116580c);
                if (this.f83361a.m87657j()) {
                    SoundView soundView3 = this.f83361a.f83359y;
                    if (soundView3 == null) {
                        AbstractC19074t.m100223u("soundView");
                        soundView3 = null;
                    }
                    soundView3.mo75727a();
                    SoundView soundView4 = this.f83361a.f83359y;
                    if (soundView4 == null) {
                        AbstractC19074t.m100223u("soundView");
                    } else {
                        soundView = soundView4;
                    }
                    soundView.setVolume(intValue);
                    return;
                }
                this.f83361a.m87870c0();
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.uicontrol.PushToTalkControl$c */
    /* loaded from: classes4.dex */
    public static final class C16482c {

        /* renamed from: a */
        public static final C16482c f83362a = new C16482c();

        private C16482c() {
        }

        /* renamed from: a */
        public static final void m87894a() {
            ToastUtils.showMess(MainApplication.Companion.m35500c().getString(AbstractC8020f0.str_warning_play_voice_while_calling));
        }

        /* renamed from: b */
        public static final void m87895b() {
            ToastUtils.showMess(MainApplication.Companion.m35500c().getString(AbstractC8020f0.str_warning_make_record_while_calling));
        }
    }

    /* renamed from: com.zing.zalo.uicontrol.PushToTalkControl$d */
    /* loaded from: classes4.dex */
    public interface InterfaceC16483d {
        /* renamed from: X1 */
        boolean mo60414X1();

        /* renamed from: a */
        void mo60415a(byte[] bArr, boolean z11);

        /* renamed from: a3 */
        void mo60416a3(C18888h c18888h);

        /* renamed from: b */
        void mo60417b();

        /* renamed from: c */
        boolean mo60418c(View view, MotionEvent motionEvent);

        /* renamed from: d */
        void mo60419d();

        /* renamed from: e */
        void mo60420e(int i11);

        /* renamed from: f */
        void mo60421f();

        /* renamed from: g */
        void mo60422g();

        /* renamed from: h */
        int mo60423h();

        /* renamed from: i */
        void mo60424i();

        /* renamed from: j */
        void mo60425j();

        /* renamed from: k */
        int mo60426k();

        /* renamed from: l */
        boolean mo60427l();

        /* renamed from: m */
        void mo60428m();

        /* renamed from: n */
        void mo60429n(String str, int i11);

        /* renamed from: o */
        void mo60430o();

        /* renamed from: o2 */
        void mo60431o2(String str);

        /* renamed from: p */
        void mo60432p(String str, boolean z11, InterfaceC20098e interfaceC20098e);

        /* renamed from: p4 */
        void mo60433p4(int i11);

        /* renamed from: q */
        void mo60434q();

        /* renamed from: r */
        void mo60435r();

        /* renamed from: s */
        void mo60436s();
    }

    /* renamed from: com.zing.zalo.uicontrol.PushToTalkControl$e */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C16484e {

        /* renamed from: a */
        public static final /* synthetic */ int[] f83363a;

        static {
            int[] iArr = new int[SoundView.EnumC13533a.values().length];
            try {
                iArr[SoundView.EnumC13533a.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SoundView.EnumC13533a.RECORDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SoundView.EnumC13533a.PREVIEW_CANCEL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SoundView.EnumC13533a.PREVIEW_FREEHAND.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SoundView.EnumC13533a.FREEHAND.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f83363a = iArr;
        }
    }

    /* renamed from: com.zing.zalo.uicontrol.PushToTalkControl$f */
    /* loaded from: classes4.dex */
    public static final class C16485f extends AnimatorListenerAdapter {

        /* renamed from: p */
        private boolean f83364p;

        /* renamed from: q */
        final /* synthetic */ AnimatorSet f83365q;

        /* renamed from: r */
        final /* synthetic */ View f83366r;

        C16485f(AnimatorSet animatorSet, View view) {
            this.f83365q = animatorSet;
            this.f83366r = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            AbstractC19074t.m100208f(animator, "animation");
            this.f83364p = true;
            super.onAnimationCancel(animator);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC19074t.m100208f(animator, "animation");
            super.onAnimationEnd(animator);
            if (!this.f83364p) {
                this.f83365q.start();
                return;
            }
            this.f83364p = false;
            this.f83366r.setScaleX(1.0f);
            this.f83366r.setScaleY(1.0f);
        }
    }

    /* renamed from: com.zing.zalo.uicontrol.PushToTalkControl$g */
    /* loaded from: classes4.dex */
    public static final class RunnableC16486g implements Runnable {
        RunnableC16486g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z11;
            try {
                if (!PushToTalkControl.this.m87657j()) {
                    return;
                }
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j11 = elapsedRealtime - PushToTalkControl.this.f83343S;
                TextView textView = null;
                if (PushToTalkControl.this.f83351d0 == 0) {
                    TextView textView2 = PushToTalkControl.this.f83333I;
                    if (textView2 == null) {
                        AbstractC19074t.m100223u("timeText");
                        textView2 = null;
                    }
                    textView2.setText(AbstractC23160o0.m119184B0(300000 - j11));
                } else {
                    TextView textView3 = PushToTalkControl.this.f83333I;
                    if (textView3 == null) {
                        AbstractC19074t.m100223u("timeText");
                        textView3 = null;
                    }
                    textView3.setText(AbstractC23160o0.m119184B0(j11));
                }
                PushToTalkControl pushToTalkControl = PushToTalkControl.this;
                if (j11 > 2000 && pushToTalkControl.getMaxAmplitudeRecorder() <= 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                pushToTalkControl.f83339O = z11;
                if (PushToTalkControl.this.f83339O) {
                    TextView textView4 = PushToTalkControl.this.f83332H;
                    if (textView4 == null) {
                        AbstractC19074t.m100223u("hintText");
                        textView4 = null;
                    }
                    textView4.setVisibility(0);
                    PushToTalkControl.this.m87875j0(3);
                    TextView textView5 = PushToTalkControl.this.f83333I;
                    if (textView5 == null) {
                        AbstractC19074t.m100223u("timeText");
                        textView5 = null;
                    }
                    textView5.setVisibility(8);
                }
                if (j11 <= 300000) {
                    TextView textView6 = PushToTalkControl.this.f83333I;
                    if (textView6 == null) {
                        AbstractC19074t.m100223u("timeText");
                    } else {
                        textView = textView6;
                    }
                    textView.postDelayed(this, 100L);
                    return;
                }
                PushToTalkControl.this.setRecordCancelled(true);
                PushToTalkControl.this.setFreeHandMode(false);
                PushToTalkControl.Companion.m87893a();
                long j12 = PushToTalkControl.this.f83343S;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Reach time limit: \n   Current time:");
                sb2.append(elapsedRealtime);
                sb2.append("\n   Start time:");
                sb2.append(j12);
                sb2.append("\n   Total time:");
                sb2.append(j11);
                InterfaceC16483d pttListener = PushToTalkControl.this.getPttListener();
                if (pttListener != null) {
                    pttListener.mo60436s();
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f(PushToTalkControl.Companion.m87893a(), e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.uicontrol.PushToTalkControl$h */
    /* loaded from: classes4.dex */
    public static final class RunnableC16487h implements Runnable {
        public RunnableC16487h() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            PushToTalkControl.this.m87891f0();
            PushToTalkControl.this.f83340P = false;
        }
    }

    /* renamed from: com.zing.zalo.uicontrol.PushToTalkControl$i */
    /* loaded from: classes4.dex */
    public static final class RunnableC16488i implements Runnable {

        /* renamed from: q */
        final /* synthetic */ Context f83370q;

        public RunnableC16488i(Context context) {
            this.f83370q = context;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                if (PushToTalkControl.this.m87656i()) {
                    ImageView imageView = null;
                    PushToTalkControl.this.setCancelRecordRect(null);
                    PushToTalkControl.this.setFreeHandRect(null);
                    String unused = PushToTalkControl.f83323l0;
                    C23046d7.m118248k(new SensitiveData("micro_csc_voice_record", "comm_csc", null, 4, null), "micro");
                    InterfaceC16483d pttListener = PushToTalkControl.this.getPttListener();
                    if (pttListener != null) {
                        pttListener.mo60428m();
                    }
                    if (AbstractC23238v2.m119727l()) {
                        if (AbstractC23238v2.m119726k()) {
                            PushToTalkControl.this.setRecordCancelled(false);
                            PushToTalkControl.this.setFreeHandMode(false);
                            PushToTalkControl.this.m87877l0(SoundView.EnumC13533a.RECORDING, false);
                            SoundView soundView = PushToTalkControl.this.f83359y;
                            if (soundView == null) {
                                AbstractC19074t.m100223u("soundView");
                                soundView = null;
                            }
                            soundView.setVisibility(0);
                            TextView textView = PushToTalkControl.this.f83333I;
                            if (textView == null) {
                                AbstractC19074t.m100223u("timeText");
                                textView = null;
                            }
                            textView.clearAnimation();
                            TextView textView2 = PushToTalkControl.this.f83333I;
                            if (textView2 == null) {
                                AbstractC19074t.m100223u("timeText");
                                textView2 = null;
                            }
                            textView2.setVisibility(0);
                            PushToTalkControl.this.m87871d0(true);
                            PushToTalkControl.this.m87874i0(0);
                            if (PushToTalkControl.this.f83339O) {
                                TextView textView3 = PushToTalkControl.this.f83332H;
                                if (textView3 == null) {
                                    AbstractC19074t.m100223u("hintText");
                                    textView3 = null;
                                }
                                textView3.setVisibility(0);
                                PushToTalkControl.this.m87875j0(3);
                                TextView textView4 = PushToTalkControl.this.f83333I;
                                if (textView4 == null) {
                                    AbstractC19074t.m100223u("timeText");
                                    textView4 = null;
                                }
                                textView4.setVisibility(8);
                            }
                            ImageView imageView2 = PushToTalkControl.this.f83331G;
                            if (imageView2 == null) {
                                AbstractC19074t.m100223u("handPreviewImg");
                            } else {
                                imageView = imageView2;
                            }
                            imageView.setVisibility(0);
                            C23081g9.m118411i();
                            PushToTalkControl.this.m87863T();
                            PushToTalkControl.this.m87872e0();
                            PushToTalkControl.this.m87890b0();
                            PushToTalkControl.this.setTrackingLogEntryPoint("csc_voice_tap_icon");
                            return;
                        }
                        ToastUtils.showMess(MainApplication.Companion.m35500c().getString(AbstractC8020f0.str_alertmemtorecord));
                        return;
                    }
                    ToastUtils.m89266n(AbstractC8020f0.error_sdcard, new Object[0]);
                }
            } catch (SensitiveDataException unused2) {
                C23046d7.m118241d(this.f83370q).mo13822K();
            } catch (Exception e11) {
                AbstractC23350e.m122776f(PushToTalkControl.f83323l0, e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.uicontrol.PushToTalkControl$j */
    /* loaded from: classes4.dex */
    public static final class RunnableC16489j implements Runnable {
        public RunnableC16489j() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                String unused = PushToTalkControl.f83323l0;
                View view = null;
                PushToTalkControl.this.setCancelRecordRect(null);
                PushToTalkControl.this.setFreeHandRect(null);
                PushToTalkControl.this.setFreeHandMode(true);
                PushToTalkControl.this.setRecorderPressing(false);
                PushToTalkControl.this.m87866W();
                InterfaceC16483d pttListener = PushToTalkControl.this.getPttListener();
                if (pttListener != null) {
                    pttListener.mo60428m();
                }
                if (AbstractC23238v2.m119727l()) {
                    if (AbstractC23238v2.m119726k()) {
                        PushToTalkControl.this.setRecordCancelled(false);
                        PushToTalkControl.this.m87877l0(SoundView.EnumC13533a.FREEHAND, false);
                        SoundView soundView = PushToTalkControl.this.f83359y;
                        if (soundView == null) {
                            AbstractC19074t.m100223u("soundView");
                            soundView = null;
                        }
                        soundView.setVisibility(0);
                        TextView textView = PushToTalkControl.this.f83333I;
                        if (textView == null) {
                            AbstractC19074t.m100223u("timeText");
                            textView = null;
                        }
                        textView.clearAnimation();
                        TextView textView2 = PushToTalkControl.this.f83333I;
                        if (textView2 == null) {
                            AbstractC19074t.m100223u("timeText");
                            textView2 = null;
                        }
                        textView2.setVisibility(0);
                        View view2 = PushToTalkControl.this.f83337M;
                        if (view2 == null) {
                            AbstractC19074t.m100223u("backgroundView");
                        } else {
                            view = view2;
                        }
                        view.setVisibility(0);
                        PushToTalkControl.this.m87871d0(true);
                        PushToTalkControl.this.m87874i0(1);
                        PushToTalkControl.this.m87863T();
                        PushToTalkControl.this.m87872e0();
                        PushToTalkControl.this.m87890b0();
                        C23081g9.m118411i();
                        C7853b.Companion.m40150a().m40096K0();
                        PushToTalkControl.this.setTrackingLogEntryPoint("csc_voice_long_press");
                        return;
                    }
                    ToastUtils.showMess(MainApplication.Companion.m35500c().getString(AbstractC8020f0.str_alertmemtorecord));
                    return;
                }
                ToastUtils.m89266n(AbstractC8020f0.error_sdcard, new Object[0]);
            } catch (Exception e11) {
                AbstractC23350e.m122776f(PushToTalkControl.f83323l0, e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.uicontrol.PushToTalkControl$k */
    /* loaded from: classes4.dex */
    public static final class C16490k implements InterfaceC3163h {
        C16490k() {
        }

        @Override // bz.InterfaceC3163h
        /* renamed from: a */
        public void mo15928a(byte[] bArr, boolean z11) {
            AbstractC19074t.m100208f(bArr, "encodedData");
            InterfaceC16483d pttListener = PushToTalkControl.this.getPttListener();
            if (pttListener != null) {
                pttListener.mo60415a(bArr, z11);
            }
        }

        @Override // bz.InterfaceC3163h
        /* renamed from: b */
        public void mo15929b(int i11) {
            try {
                PushToTalkControl.this.f83347W.sendMessage(PushToTalkControl.this.f83347W.obtainMessage(2, Integer.valueOf(i11)));
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        @Override // bz.InterfaceC3163h
        /* renamed from: e */
        public void mo15930e(String str, int i11) {
            boolean z11;
            AbstractC19074t.m100208f(str, "outFile");
            try {
                boolean z12 = false;
                PushToTalkControl.this.setRecording(false);
                PushToTalkControl.this.m87870c0();
                InterfaceC16483d pttListener = PushToTalkControl.this.getPttListener();
                if (pttListener != null) {
                    pttListener.mo60421f();
                }
                if (PushToTalkControl.this.f83353f0 == EnumC16657t.f84434s) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (i11 < 1000) {
                    z12 = true;
                }
                if (z11) {
                    InterfaceC16483d pttListener2 = PushToTalkControl.this.getPttListener();
                    if (pttListener2 != null) {
                        pttListener2.mo60435r();
                        return;
                    }
                    return;
                }
                if (z12) {
                    InterfaceC16483d pttListener3 = PushToTalkControl.this.getPttListener();
                    if (pttListener3 != null) {
                        pttListener3.mo60435r();
                    }
                    InterfaceC16483d pttListener4 = PushToTalkControl.this.getPttListener();
                    if (pttListener4 != null) {
                        pttListener4.mo60430o();
                        return;
                    }
                    return;
                }
                InterfaceC16483d pttListener5 = PushToTalkControl.this.getPttListener();
                if (pttListener5 != null) {
                    pttListener5.mo60429n(PushToTalkControl.this.getFileRecordName(), i11);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f(PushToTalkControl.Companion.m87893a(), e11);
            }
        }

        @Override // bz.InterfaceC3163h
        /* renamed from: f */
        public void mo15931f(int i11, Exception exc) {
            try {
                PushToTalkControl.this.setRecording(false);
                PushToTalkControl.this.setFreeHandMode(false);
                C3162g.f13363a.m15933r();
                InterfaceC16483d pttListener = PushToTalkControl.this.getPttListener();
                if (pttListener != null) {
                    pttListener.mo60420e(i11);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f(PushToTalkControl.Companion.m87893a(), e11);
            }
        }

        @Override // bz.InterfaceC3163h
        /* renamed from: h */
        public void mo15932h() {
            PushToTalkControl.this.f83343S = SystemClock.elapsedRealtime();
            TextView textView = PushToTalkControl.this.f83333I;
            if (textView == null) {
                AbstractC19074t.m100223u("timeText");
                textView = null;
            }
            textView.post(PushToTalkControl.this.getMTimeUpdateThread());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PushToTalkControl(Context context) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        Looper mainLooper = Looper.getMainLooper();
        AbstractC19074t.m100207e(mainLooper, "getMainLooper(...)");
        this.f83347W = new HandlerC16481b(this, mainLooper);
        this.f83350c0 = SoundView.EnumC13533a.START;
        this.f83351d0 = 1;
        this.f83353f0 = EnumC16657t.f84432q;
        this.f83354g0 = new RunnableC16487h();
        this.f83355h0 = new RunnableC16488i(context);
        this.f83356i0 = new RunnableC16489j();
        this.f83357j0 = new RunnableC16486g();
        this.f83358k0 = new C16490k();
        m87867X();
    }

    /* renamed from: Q */
    private final void m87860Q(int i11, int i12) {
        try {
            if (AbstractC23034c6.m118167n(getContext(), AbstractC23034c6.m118175r()) != 0) {
                InterfaceC16483d pttListener = getPttListener();
                if (pttListener != null) {
                    pttListener.mo60425j();
                    return;
                }
                return;
            }
            this.f83347W.removeCallbacks(this.f83355h0);
            this.f83347W.postDelayed(this.f83355h0, 200L);
            m87878m0(i11, i12);
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f83323l0, e11);
        }
    }

    /* renamed from: R */
    private final void m87861R(int i11, int i12) {
        int i13;
        try {
            if (this.f83348a0 != null && this.f83349b0 != null && m87656i()) {
                m87878m0(i11, i12);
                Rect rect = this.f83348a0;
                AbstractC19074t.m100205c(rect);
                boolean contains = rect.contains(i11, i12);
                Rect rect2 = this.f83349b0;
                AbstractC19074t.m100205c(rect2);
                boolean contains2 = rect2.contains(i11, i12);
                TextView textView = null;
                if (contains) {
                    if (!m87654g()) {
                        m87877l0(SoundView.EnumC13533a.PREVIEW_CANCEL, false);
                        TextView textView2 = this.f83332H;
                        if (textView2 == null) {
                            AbstractC19074t.m100223u("hintText");
                            textView2 = null;
                        }
                        textView2.setVisibility(0);
                        if (this.f83339O) {
                            m87875j0(3);
                        } else {
                            m87875j0(1);
                        }
                        TextView textView3 = this.f83333I;
                        if (textView3 == null) {
                            AbstractC19074t.m100223u("timeText");
                            textView3 = null;
                        }
                        textView3.setVisibility(8);
                        m87871d0(false);
                        C23081g9.m118411i();
                    }
                    setRecordCancelled(true);
                } else {
                    if (m87654g()) {
                        if (this.f83339O) {
                            TextView textView4 = this.f83332H;
                            if (textView4 == null) {
                                AbstractC19074t.m100223u("hintText");
                                textView4 = null;
                            }
                            textView4.setVisibility(0);
                            m87875j0(3);
                        } else {
                            TextView textView5 = this.f83332H;
                            if (textView5 == null) {
                                AbstractC19074t.m100223u("hintText");
                                textView5 = null;
                            }
                            textView5.setVisibility(4);
                        }
                        TextView textView6 = this.f83333I;
                        if (textView6 == null) {
                            AbstractC19074t.m100223u("timeText");
                            textView6 = null;
                        }
                        if (this.f83339O) {
                            i13 = 8;
                        } else {
                            i13 = 0;
                        }
                        textView6.setVisibility(i13);
                        m87871d0(true);
                        m87874i0(0);
                        if (m87657j()) {
                            m87877l0(SoundView.EnumC13533a.RECORDING, false);
                        } else {
                            m87877l0(SoundView.EnumC13533a.START, false);
                        }
                    }
                    setRecordCancelled(false);
                }
                if (contains2) {
                    if (!m87652e()) {
                        TextView textView7 = this.f83332H;
                        if (textView7 == null) {
                            AbstractC19074t.m100223u("hintText");
                            textView7 = null;
                        }
                        textView7.setVisibility(0);
                        if (this.f83339O) {
                            m87875j0(3);
                        } else {
                            m87875j0(2);
                        }
                        TextView textView8 = this.f83333I;
                        if (textView8 == null) {
                            AbstractC19074t.m100223u("timeText");
                        } else {
                            textView = textView8;
                        }
                        textView.setVisibility(8);
                        m87871d0(false);
                        C7853b.Companion.m40150a().m40096K0();
                        m87877l0(SoundView.EnumC13533a.PREVIEW_FREEHAND, false);
                        C23081g9.m118411i();
                    }
                    setFreeHandMode(true);
                    if (AbstractC26683d.f126399r) {
                        C23744a.Companion.m124119a().m124116d(4002, new Object[0]);
                        return;
                    }
                    return;
                }
                if (m87652e()) {
                    ImageButton imageButton = this.f83327C;
                    if (imageButton == null) {
                        AbstractC19074t.m100223u("actionVoiceRight");
                        imageButton = null;
                    }
                    imageButton.setVisibility(0);
                    ImageButton imageButton2 = this.f83327C;
                    if (imageButton2 == null) {
                        AbstractC19074t.m100223u("actionVoiceRight");
                        imageButton2 = null;
                    }
                    imageButton2.setImageDrawable(AbstractC23136l9.m118663M(AbstractC16803z.ic_voice_fh_unlock));
                    if (this.f83339O) {
                        TextView textView9 = this.f83332H;
                        if (textView9 == null) {
                            AbstractC19074t.m100223u("hintText");
                            textView9 = null;
                        }
                        textView9.setVisibility(0);
                        m87875j0(3);
                        TextView textView10 = this.f83333I;
                        if (textView10 == null) {
                            AbstractC19074t.m100223u("timeText");
                        } else {
                            textView = textView10;
                        }
                        textView.setVisibility(8);
                    } else {
                        TextView textView11 = this.f83332H;
                        if (textView11 == null) {
                            AbstractC19074t.m100223u("hintText");
                            textView11 = null;
                        }
                        textView11.setVisibility(8);
                        TextView textView12 = this.f83333I;
                        if (textView12 == null) {
                            AbstractC19074t.m100223u("timeText");
                        } else {
                            textView = textView12;
                        }
                        textView.setVisibility(0);
                    }
                    if (m87657j()) {
                        m87877l0(SoundView.EnumC13533a.RECORDING, false);
                    } else {
                        m87877l0(SoundView.EnumC13533a.START, false);
                    }
                    m87871d0(true);
                    m87874i0(0);
                    C7853b.Companion.m40150a().m40099M0();
                }
                setFreeHandMode(false);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f83323l0, e11);
        }
    }

    /* renamed from: S */
    private final AnimatorSet m87862S(View view, int i11) {
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "scaleX", 1.15f);
        ofFloat.setInterpolator(new LinearInterpolator());
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "scaleY", 1.15f);
        ofFloat2.setInterpolator(new LinearInterpolator());
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, "translationX", i11);
        ofFloat3.setInterpolator(new LinearInterpolator());
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view, "alpha", 0.0f);
        ofFloat4.setInterpolator(new LinearInterpolator());
        animatorSet.setInterpolator(new LinearInterpolator());
        animatorSet.setDuration(700L);
        animatorSet.playTogether(ofFloat3, ofFloat, ofFloat2, ofFloat4);
        AnimatorSet animatorSet2 = new AnimatorSet();
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(view, "scaleX", 1.0f);
        ofFloat5.setInterpolator(new LinearInterpolator());
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(view, "scaleY", 1.0f);
        ofFloat6.setInterpolator(new LinearInterpolator());
        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(view, "translationX", 0.0f);
        ofFloat7.setInterpolator(new LinearInterpolator());
        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(view, "alpha", 1.0f);
        ofFloat8.setInterpolator(new LinearInterpolator());
        animatorSet2.setInterpolator(new LinearInterpolator());
        animatorSet2.setStartDelay(700 / 2);
        animatorSet2.setDuration(0L);
        animatorSet2.playTogether(ofFloat7, ofFloat5, ofFloat6, ofFloat8);
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.setInterpolator(new LinearInterpolator());
        animatorSet3.play(animatorSet).before(animatorSet2);
        animatorSet3.addListener(new C16485f(animatorSet3, view));
        return animatorSet3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: T */
    public final void m87863T() {
        TextView textView = this.f83333I;
        TextView textView2 = null;
        if (textView == null) {
            AbstractC19074t.m100223u("timeText");
            textView = null;
        }
        textView.removeCallbacks(this.f83357j0);
        if (this.f83351d0 == 0) {
            TextView textView3 = this.f83333I;
            if (textView3 == null) {
                AbstractC19074t.m100223u("timeText");
                textView3 = null;
            }
            textView3.setText(AbstractC23160o0.m119184B0(300000L));
        } else {
            TextView textView4 = this.f83333I;
            if (textView4 == null) {
                AbstractC19074t.m100223u("timeText");
                textView4 = null;
            }
            textView4.setText("00:00");
        }
        TextView textView5 = this.f83360z;
        if (textView5 == null) {
            AbstractC19074t.m100223u("tvZeroAmplitude");
            textView5 = null;
        }
        textView5.removeCallbacks(this.f83357j0);
        this.f83343S = 0L;
        TextView textView6 = this.f83333I;
        if (textView6 == null) {
            AbstractC19074t.m100223u("timeText");
        } else {
            textView2 = textView6;
        }
        textView2.removeCallbacks(this.f83357j0);
    }

    /* renamed from: U */
    private final void m87864U() {
        TextView textView = this.f83333I;
        TextView textView2 = null;
        if (textView == null) {
            AbstractC19074t.m100223u("timeText");
            textView = null;
        }
        textView.removeCallbacks(this.f83357j0);
        if (this.f83351d0 == 0) {
            TextView textView3 = this.f83333I;
            if (textView3 == null) {
                AbstractC19074t.m100223u("timeText");
            } else {
                textView2 = textView3;
            }
            textView2.setText(AbstractC23160o0.m119184B0(300000L));
            return;
        }
        TextView textView4 = this.f83333I;
        if (textView4 == null) {
            AbstractC19074t.m100223u("timeText");
        } else {
            textView2 = textView4;
        }
        textView2.setText("00:00");
    }

    /* renamed from: V */
    private final void m87865V(View view, MotionEvent motionEvent) {
        InterfaceC16483d pttListener;
        try {
            try {
                m87866W();
                int x11 = (int) (view.getX() + motionEvent.getX());
                int y11 = (int) (view.getY() + motionEvent.getY());
                int action = motionEvent.getAction();
                if (action != 0) {
                    if (action != 1) {
                        if (action != 2) {
                            if (action != 3) {
                                if (action != 6) {
                                }
                            } else {
                                setRecording(false);
                                setRecorderPressing(false);
                                setRecordCancelled(true);
                                setFreeHandMode(false);
                            }
                        } else {
                            m87861R(x11, y11);
                        }
                    }
                    setRecorderPressing(false);
                } else {
                    setRecorderPressing(true);
                    setFreeHandMode(false);
                    m87860Q(x11, y11);
                }
                pttListener = getPttListener();
                if (pttListener == null) {
                    return;
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
                pttListener = getPttListener();
                if (pttListener == null) {
                    return;
                }
            }
            pttListener.mo60418c(view, motionEvent);
        } catch (Throwable th2) {
            InterfaceC16483d pttListener2 = getPttListener();
            if (pttListener2 != null) {
                pttListener2.mo60418c(view, motionEvent);
            }
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: W */
    public final void m87866W() {
        try {
            this.f83347W.removeMessages(1);
            TextView textView = this.f83336L;
            if (textView == null) {
                AbstractC19074t.m100223u("tvStartTip");
                textView = null;
            }
            textView.setVisibility(8);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: X */
    private final void m87867X() {
        this.f83346V = C23212s8.m119606n(AbstractC16781w.AppPrimaryColor);
        this.f83344T = C23212s8.m119606n(AbstractC21196a.TextColor2);
        this.f83345U = C23212s8.m119606n(AbstractC7354t0.NotificationColor1);
        View view = new View(getContext());
        this.f83337M = view;
        view.setBackgroundColor(getResources().getColor(AbstractC16801x.black_80));
        View view2 = this.f83337M;
        TextView textView = null;
        if (view2 == null) {
            AbstractC19074t.m100223u("backgroundView");
            view2 = null;
        }
        view2.setVisibility(8);
        View view3 = this.f83337M;
        if (view3 == null) {
            AbstractC19074t.m100223u("backgroundView");
            view3 = null;
        }
        view3.setOnClickListener(null);
        View view4 = this.f83337M;
        if (view4 == null) {
            AbstractC19074t.m100223u("backgroundView");
            view4 = null;
        }
        addView(view4);
        GoogleSoundView googleSoundView = new GoogleSoundView(getContext());
        this.f83359y = googleSoundView;
        googleSoundView.setVisibility(8);
        View view5 = this.f83359y;
        if (view5 == null) {
            AbstractC19074t.m100223u("soundView");
            view5 = null;
        }
        addView(view5);
        ImageButton imageButton = new ImageButton(getContext());
        this.f83335K = imageButton;
        imageButton.setId(AbstractC6918a0.record_button_push_to_talk);
        ImageButton imageButton2 = this.f83335K;
        if (imageButton2 == null) {
            AbstractC19074t.m100223u("recordButton");
            imageButton2 = null;
        }
        imageButton2.setBackground(AbstractC23136l9.m118663M(AbstractC16803z.ic_voice_normal));
        ImageButton imageButton3 = this.f83335K;
        if (imageButton3 == null) {
            AbstractC19074t.m100223u("recordButton");
            imageButton3 = null;
        }
        imageButton3.setPadding(AbstractC23136l9.m118742r(30.0f), 0, AbstractC23136l9.m118742r(30.0f), 0);
        ImageButton imageButton4 = this.f83335K;
        if (imageButton4 == null) {
            AbstractC19074t.m100223u("recordButton");
            imageButton4 = null;
        }
        imageButton4.setOnTouchListener(new View.OnTouchListener() { // from class: com.zing.zalo.uicontrol.k0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view6, MotionEvent motionEvent) {
                boolean m87868Y;
                m87868Y = PushToTalkControl.m87868Y(PushToTalkControl.this, view6, motionEvent);
                return m87868Y;
            }
        });
        ImageButton imageButton5 = this.f83335K;
        if (imageButton5 == null) {
            AbstractC19074t.m100223u("recordButton");
            imageButton5 = null;
        }
        imageButton5.setOnClickListener(this);
        View view6 = this.f83335K;
        if (view6 == null) {
            AbstractC19074t.m100223u("recordButton");
            view6 = null;
        }
        addView(view6);
        ImageButton imageButton6 = this.f83335K;
        if (imageButton6 == null) {
            AbstractC19074t.m100223u("recordButton");
            imageButton6 = null;
        }
        AbstractC23201r8.m119531a(imageButton6, AbstractC8020f0.hold_to_record);
        Context context = getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        RobotoTextView robotoTextView = new RobotoTextView(context);
        this.f83333I = robotoTextView;
        robotoTextView.setIncludeFontPadding(false);
        TextView textView2 = this.f83333I;
        if (textView2 == null) {
            AbstractC19074t.m100223u("timeText");
            textView2 = null;
        }
        textView2.setTextSize(1, 20.0f);
        TextView textView3 = this.f83333I;
        if (textView3 == null) {
            AbstractC19074t.m100223u("timeText");
            textView3 = null;
        }
        textView3.setTextColor(this.f83346V);
        TextView textView4 = this.f83333I;
        if (textView4 == null) {
            AbstractC19074t.m100223u("timeText");
            textView4 = null;
        }
        textView4.setVisibility(4);
        View view7 = this.f83333I;
        if (view7 == null) {
            AbstractC19074t.m100223u("timeText");
            view7 = null;
        }
        addView(view7);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        float f11 = 25;
        layoutParams.setMargins(AbstractC23136l9.m118742r(f11), 0, 0, 0);
        ImageButton imageButton7 = new ImageButton(getContext());
        this.f83325A = imageButton7;
        imageButton7.setImageDrawable(AbstractC23136l9.m118663M(AbstractC16803z.ic_btn_close_voice_n));
        ImageButton imageButton8 = this.f83325A;
        if (imageButton8 == null) {
            AbstractC19074t.m100223u("actionVoiceLeft");
            imageButton8 = null;
        }
        imageButton8.setVisibility(8);
        ImageButton imageButton9 = this.f83325A;
        if (imageButton9 == null) {
            AbstractC19074t.m100223u("actionVoiceLeft");
            imageButton9 = null;
        }
        float f12 = 15;
        imageButton9.setPadding(AbstractC23136l9.m118742r(f12), AbstractC23136l9.m118742r(f12), AbstractC23136l9.m118742r(f12), AbstractC23136l9.m118742r(f12));
        ImageButton imageButton10 = this.f83325A;
        if (imageButton10 == null) {
            AbstractC19074t.m100223u("actionVoiceLeft");
            imageButton10 = null;
        }
        imageButton10.setBackgroundColor(0);
        ImageButton imageButton11 = this.f83325A;
        if (imageButton11 == null) {
            AbstractC19074t.m100223u("actionVoiceLeft");
            imageButton11 = null;
        }
        imageButton11.setOnClickListener(this);
        View view8 = this.f83325A;
        if (view8 == null) {
            AbstractC19074t.m100223u("actionVoiceLeft");
            view8 = null;
        }
        addView(view8, layoutParams);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        float f13 = 100;
        layoutParams2.setMargins(AbstractC23136l9.m118742r(f13), 0, 0, 0);
        ImageButton imageButton12 = new ImageButton(getContext());
        this.f83326B = imageButton12;
        imageButton12.setImageDrawable(AbstractC23136l9.m118663M(AbstractC16803z.icn_left));
        ImageButton imageButton13 = this.f83326B;
        if (imageButton13 == null) {
            AbstractC19074t.m100223u("arrowHintLeft");
            imageButton13 = null;
        }
        imageButton13.setVisibility(8);
        ImageButton imageButton14 = this.f83326B;
        if (imageButton14 == null) {
            AbstractC19074t.m100223u("arrowHintLeft");
            imageButton14 = null;
        }
        imageButton14.setBackgroundColor(0);
        View view9 = this.f83326B;
        if (view9 == null) {
            AbstractC19074t.m100223u("arrowHintLeft");
            view9 = null;
        }
        addView(view9, layoutParams2);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.setMargins(0, 0, AbstractC23136l9.m118742r(f11), 0);
        ImageButton imageButton15 = new ImageButton(getContext());
        this.f83327C = imageButton15;
        imageButton15.setImageDrawable(AbstractC23136l9.m118663M(AbstractC16803z.ic_btn_send_voice_o));
        ImageButton imageButton16 = this.f83327C;
        if (imageButton16 == null) {
            AbstractC19074t.m100223u("actionVoiceRight");
            imageButton16 = null;
        }
        imageButton16.setVisibility(8);
        ImageButton imageButton17 = this.f83327C;
        if (imageButton17 == null) {
            AbstractC19074t.m100223u("actionVoiceRight");
            imageButton17 = null;
        }
        imageButton17.setPadding(AbstractC23136l9.m118742r(f12), AbstractC23136l9.m118742r(f12), AbstractC23136l9.m118742r(f12), AbstractC23136l9.m118742r(f12));
        ImageButton imageButton18 = this.f83327C;
        if (imageButton18 == null) {
            AbstractC19074t.m100223u("actionVoiceRight");
            imageButton18 = null;
        }
        imageButton18.setBackgroundColor(0);
        ImageButton imageButton19 = this.f83327C;
        if (imageButton19 == null) {
            AbstractC19074t.m100223u("actionVoiceRight");
            imageButton19 = null;
        }
        imageButton19.setOnClickListener(this);
        View view10 = this.f83327C;
        if (view10 == null) {
            AbstractC19074t.m100223u("actionVoiceRight");
            view10 = null;
        }
        addView(view10, layoutParams3);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams4.setMargins(0, 0, AbstractC23136l9.m118742r(f13), 0);
        ImageButton imageButton20 = new ImageButton(getContext());
        this.f83328D = imageButton20;
        imageButton20.setImageDrawable(AbstractC23136l9.m118663M(AbstractC16803z.icn_right));
        ImageButton imageButton21 = this.f83328D;
        if (imageButton21 == null) {
            AbstractC19074t.m100223u("arrowHintRight");
            imageButton21 = null;
        }
        imageButton21.setVisibility(8);
        ImageButton imageButton22 = this.f83328D;
        if (imageButton22 == null) {
            AbstractC19074t.m100223u("arrowHintRight");
            imageButton22 = null;
        }
        imageButton22.setBackgroundColor(0);
        View view11 = this.f83328D;
        if (view11 == null) {
            AbstractC19074t.m100223u("arrowHintRight");
            view11 = null;
        }
        addView(view11, layoutParams4);
        Context context2 = getContext();
        AbstractC19074t.m100207e(context2, "getContext(...)");
        RobotoTextView robotoTextView2 = new RobotoTextView(context2);
        this.f83336L = robotoTextView2;
        robotoTextView2.setTextSize(1, 14.0f);
        TextView textView5 = this.f83336L;
        if (textView5 == null) {
            AbstractC19074t.m100223u("tvStartTip");
            textView5 = null;
        }
        textView5.setGravity(17);
        TextView textView6 = this.f83336L;
        if (textView6 == null) {
            AbstractC19074t.m100223u("tvStartTip");
            textView6 = null;
        }
        textView6.setText(AbstractC8020f0.hold_to_record);
        TextView textView7 = this.f83336L;
        if (textView7 == null) {
            AbstractC19074t.m100223u("tvStartTip");
            textView7 = null;
        }
        textView7.setTextColor(this.f83344T);
        TextView textView8 = this.f83336L;
        if (textView8 == null) {
            AbstractC19074t.m100223u("tvStartTip");
            textView8 = null;
        }
        int m118742r = AbstractC23136l9.m118742r(12.0f);
        TextView textView9 = this.f83336L;
        if (textView9 == null) {
            AbstractC19074t.m100223u("tvStartTip");
            textView9 = null;
        }
        int paddingTop = textView9.getPaddingTop();
        int m118742r2 = AbstractC23136l9.m118742r(12.0f);
        TextView textView10 = this.f83336L;
        if (textView10 == null) {
            AbstractC19074t.m100223u("tvStartTip");
            textView10 = null;
        }
        textView8.setPadding(m118742r, paddingTop, m118742r2, textView10.getPaddingBottom());
        TextView textView11 = this.f83336L;
        if (textView11 == null) {
            AbstractC19074t.m100223u("tvStartTip");
            textView11 = null;
        }
        textView11.setVisibility(0);
        View view12 = this.f83336L;
        if (view12 == null) {
            AbstractC19074t.m100223u("tvStartTip");
            view12 = null;
        }
        addView(view12);
        Context context3 = getContext();
        AbstractC19074t.m100207e(context3, "getContext(...)");
        RobotoTextView robotoTextView3 = new RobotoTextView(context3);
        this.f83360z = robotoTextView3;
        robotoTextView3.setTextSize(1, 16.0f);
        TextView textView12 = this.f83360z;
        if (textView12 == null) {
            AbstractC19074t.m100223u("tvZeroAmplitude");
            textView12 = null;
        }
        textView12.setBackgroundResource(AbstractC16801x.bg_record_layout_cancel);
        TextView textView13 = this.f83360z;
        if (textView13 == null) {
            AbstractC19074t.m100223u("tvZeroAmplitude");
            textView13 = null;
        }
        textView13.setGravity(17);
        TextView textView14 = this.f83360z;
        if (textView14 == null) {
            AbstractC19074t.m100223u("tvZeroAmplitude");
            textView14 = null;
        }
        textView14.setText(AbstractC8020f0.zero_amplitude_recorder);
        TextView textView15 = this.f83360z;
        if (textView15 == null) {
            AbstractC19074t.m100223u("tvZeroAmplitude");
            textView15 = null;
        }
        textView15.setTextColor(-1);
        TextView textView16 = this.f83360z;
        if (textView16 == null) {
            AbstractC19074t.m100223u("tvZeroAmplitude");
            textView16 = null;
        }
        textView16.setPadding(AbstractC23136l9.m118742r(4.0f), AbstractC23136l9.m118742r(4.0f), AbstractC23136l9.m118742r(4.0f), AbstractC23136l9.m118742r(4.0f));
        TextView textView17 = this.f83360z;
        if (textView17 == null) {
            AbstractC19074t.m100223u("tvZeroAmplitude");
            textView17 = null;
        }
        textView17.setMaxLines(1);
        TextView textView18 = this.f83360z;
        if (textView18 == null) {
            AbstractC19074t.m100223u("tvZeroAmplitude");
            textView18 = null;
        }
        textView18.setVisibility(8);
        View view13 = this.f83360z;
        if (view13 == null) {
            AbstractC19074t.m100223u("tvZeroAmplitude");
            view13 = null;
        }
        addView(view13);
        Context context4 = getContext();
        AbstractC19074t.m100207e(context4, "getContext(...)");
        RobotoTextView robotoTextView4 = new RobotoTextView(context4);
        this.f83332H = robotoTextView4;
        robotoTextView4.setTextSize(1, 14.0f);
        TextView textView19 = this.f83332H;
        if (textView19 == null) {
            AbstractC19074t.m100223u("hintText");
            textView19 = null;
        }
        textView19.setGravity(17);
        TextView textView20 = this.f83332H;
        if (textView20 == null) {
            AbstractC19074t.m100223u("hintText");
            textView20 = null;
        }
        textView20.setText(AbstractC8020f0.slidetocancel);
        TextView textView21 = this.f83332H;
        if (textView21 == null) {
            AbstractC19074t.m100223u("hintText");
            textView21 = null;
        }
        textView21.setTextColor(this.f83344T);
        TextView textView22 = this.f83332H;
        if (textView22 == null) {
            AbstractC19074t.m100223u("hintText");
            textView22 = null;
        }
        int m118742r3 = AbstractC23136l9.m118742r(0.0f);
        TextView textView23 = this.f83332H;
        if (textView23 == null) {
            AbstractC19074t.m100223u("hintText");
            textView23 = null;
        }
        int paddingTop2 = textView23.getPaddingTop();
        int m118742r4 = AbstractC23136l9.m118742r(0.0f);
        TextView textView24 = this.f83332H;
        if (textView24 == null) {
            AbstractC19074t.m100223u("hintText");
            textView24 = null;
        }
        textView22.setPadding(m118742r3, paddingTop2, m118742r4, textView24.getPaddingBottom());
        TextView textView25 = this.f83332H;
        if (textView25 == null) {
            AbstractC19074t.m100223u("hintText");
            textView25 = null;
        }
        textView25.setVisibility(8);
        View view14 = this.f83332H;
        if (view14 == null) {
            AbstractC19074t.m100223u("hintText");
            view14 = null;
        }
        addView(view14);
        Context context5 = getContext();
        AbstractC19074t.m100207e(context5, "getContext(...)");
        RobotoTextView robotoTextView5 = new RobotoTextView(context5);
        this.f83334J = robotoTextView5;
        robotoTextView5.setTextSize(1, 14.0f);
        TextView textView26 = this.f83334J;
        if (textView26 == null) {
            AbstractC19074t.m100223u("guideText");
            textView26 = null;
        }
        textView26.setGravity(17);
        TextView textView27 = this.f83334J;
        if (textView27 == null) {
            AbstractC19074t.m100223u("guideText");
            textView27 = null;
        }
        textView27.setText(AbstractC8020f0.str_voice_csc_guide_text);
        TextView textView28 = this.f83334J;
        if (textView28 == null) {
            AbstractC19074t.m100223u("guideText");
            textView28 = null;
        }
        textView28.setTextColor(this.f83344T);
        TextView textView29 = this.f83334J;
        if (textView29 == null) {
            AbstractC19074t.m100223u("guideText");
            textView29 = null;
        }
        int m118742r5 = AbstractC23136l9.m118742r(0.0f);
        TextView textView30 = this.f83334J;
        if (textView30 == null) {
            AbstractC19074t.m100223u("guideText");
            textView30 = null;
        }
        int paddingTop3 = textView30.getPaddingTop();
        int m118742r6 = AbstractC23136l9.m118742r(0.0f);
        TextView textView31 = this.f83334J;
        if (textView31 == null) {
            AbstractC19074t.m100223u("guideText");
            textView31 = null;
        }
        textView29.setPadding(m118742r5, paddingTop3, m118742r6, textView31.getPaddingBottom());
        TextView textView32 = this.f83334J;
        if (textView32 == null) {
            AbstractC19074t.m100223u("guideText");
            textView32 = null;
        }
        textView32.setVisibility(8);
        View view15 = this.f83334J;
        if (view15 == null) {
            AbstractC19074t.m100223u("guideText");
            view15 = null;
        }
        addView(view15);
        ImageView imageView = new ImageView(getContext());
        this.f83331G = imageView;
        imageView.setImageDrawable(AbstractC23136l9.m118663M(AbstractC16803z.hand));
        ImageView imageView2 = this.f83331G;
        if (imageView2 == null) {
            AbstractC19074t.m100223u("handPreviewImg");
            imageView2 = null;
        }
        imageView2.setVisibility(4);
        View view16 = this.f83331G;
        if (view16 == null) {
            AbstractC19074t.m100223u("handPreviewImg");
            view16 = null;
        }
        addView(view16);
        int m122645z9 = AbstractC23309i.m122645z9();
        if (m122645z9 < 3) {
            TextView textView33 = this.f83336L;
            if (textView33 == null) {
                AbstractC19074t.m100223u("tvStartTip");
            } else {
                textView = textView33;
            }
            textView.setVisibility(0);
            AbstractC23309i.m122222nu(m122645z9 + 1);
        }
        setPttFreeHandActionState(EnumC16657t.f84432q);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Y */
    public static final boolean m87868Y(PushToTalkControl pushToTalkControl, View view, MotionEvent motionEvent) {
        AbstractC19074t.m100208f(pushToTalkControl, "this$0");
        AbstractC19074t.m100208f(view, C20218v.f100059b);
        AbstractC19074t.m100208f(motionEvent, "event");
        if (!pushToTalkControl.m87869a0()) {
            return false;
        }
        if (pushToTalkControl.m87656i() || !pushToTalkControl.m87657j()) {
            pushToTalkControl.m87865V(view, motionEvent);
        }
        return false;
    }

    /* renamed from: a0 */
    private final boolean m87869a0() {
        if (!m87655h() || this.f83340P) {
            return false;
        }
        if (!m87657j()) {
            if (C3162g.f13363a.m15938y()) {
                AbstractC23350e.m122777g("PTTController: " + getContext().getString(AbstractC8020f0.str_warning_record_voice_while_mic_busy), new Object[0]);
                ToastUtils.m89266n(AbstractC8020f0.str_warning_record_voice_while_mic_busy, new Object[0]);
                return false;
            }
            if (C20024r.m103941j() || C7853b.Companion.m40150a().m40133i0()) {
                C16482c.m87895b();
                return false;
            }
        }
        if (C26664o.m136836a().m136838c()) {
            AbstractC23350e.m122774d(f83323l0, "Discard recording because sticker lua is playing");
            return false;
        }
        InterfaceC16483d pttListener = getPttListener();
        if (pttListener == null) {
            return false;
        }
        return pttListener.mo60427l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c0 */
    public final void m87870c0() {
        try {
            this.f83347W.sendEmptyMessage(3);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d0 */
    public final void m87871d0(boolean z11) {
        int i11;
        TextView textView = this.f83334J;
        if (textView == null) {
            AbstractC19074t.m100223u("guideText");
            textView = null;
        }
        if (z11) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        textView.setVisibility(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e0 */
    public final void m87872e0() {
        try {
            this.f83341Q = false;
            this.f83342R = false;
            this.f83353f0 = EnumC16657t.f84432q;
            setRecording(true);
            setMaxAmplitudeRecorder(0);
            C3162g c3162g = C3162g.f13363a;
            setFileRecordName(c3162g.m15934t(true));
            InterfaceC16483d pttListener = getPttListener();
            if (pttListener != null) {
                pttListener.mo60432p(getFileRecordName(), false, null);
            }
            c3162g.m15926E(getFileRecordName(), this.f83358k0);
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f83323l0, e11);
            m87891f0();
            setRecording(false);
        }
    }

    private final String getTrackingLogParams() throws JSONException {
        String jSONObject = new JSONObject().put("duration_session", (int) ((SystemClock.elapsedRealtime() - this.f83343S) / 1000)).toString();
        AbstractC19074t.m100207e(jSONObject, "toString(...)");
        return jSONObject;
    }

    /* renamed from: h0 */
    private final void m87873h0(String str) {
        try {
            C0815e1.m2075D().m2100V(new C23648e(16, this.f83338N, 1, str, getTrackingLogChatType(), getTrackingLogParams()), false);
        } catch (JSONException e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i0 */
    public final void m87874i0(int i11) {
        TextView textView = null;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    TextView textView2 = this.f83334J;
                    if (textView2 == null) {
                        AbstractC19074t.m100223u("guideText");
                        textView2 = null;
                    }
                    textView2.setText(AbstractC8020f0.hint_freehand_mode);
                    TextView textView3 = this.f83334J;
                    if (textView3 == null) {
                        AbstractC19074t.m100223u("guideText");
                    } else {
                        textView = textView3;
                    }
                    textView.setTextColor(this.f83344T);
                    return;
                }
                return;
            }
            TextView textView4 = this.f83334J;
            if (textView4 == null) {
                AbstractC19074t.m100223u("guideText");
                textView4 = null;
            }
            textView4.setText(AbstractC8020f0.str_voice_csc_guide_text);
            TextView textView5 = this.f83334J;
            if (textView5 == null) {
                AbstractC19074t.m100223u("guideText");
            } else {
                textView = textView5;
            }
            textView.setTextColor(this.f83344T);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j0 */
    public final void m87875j0(int i11) {
        TextView textView = null;
        try {
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 == 3) {
                            TextView textView2 = this.f83332H;
                            if (textView2 == null) {
                                AbstractC19074t.m100223u("hintText");
                                textView2 = null;
                            }
                            textView2.setText(AbstractC8020f0.zero_amplitude_recorder);
                            TextView textView3 = this.f83332H;
                            if (textView3 == null) {
                                AbstractC19074t.m100223u("hintText");
                            } else {
                                textView = textView3;
                            }
                            textView.setTextColor(this.f83345U);
                            return;
                        }
                        return;
                    }
                    TextView textView4 = this.f83332H;
                    if (textView4 == null) {
                        AbstractC19074t.m100223u("hintText");
                        textView4 = null;
                    }
                    textView4.setText(AbstractC8020f0.turn_on_freehand_mode);
                    TextView textView5 = this.f83332H;
                    if (textView5 == null) {
                        AbstractC19074t.m100223u("hintText");
                    } else {
                        textView = textView5;
                    }
                    textView.setTextColor(this.f83346V);
                    return;
                }
                TextView textView6 = this.f83332H;
                if (textView6 == null) {
                    AbstractC19074t.m100223u("hintText");
                    textView6 = null;
                }
                textView6.setText(AbstractC8020f0.releasetocancel);
                TextView textView7 = this.f83332H;
                if (textView7 == null) {
                    AbstractC19074t.m100223u("hintText");
                } else {
                    textView = textView7;
                }
                textView.setTextColor(this.f83345U);
                return;
            }
            TextView textView8 = this.f83332H;
            if (textView8 == null) {
                AbstractC19074t.m100223u("hintText");
                textView8 = null;
            }
            textView8.setText(AbstractC8020f0.slidetocancel);
            TextView textView9 = this.f83332H;
            if (textView9 == null) {
                AbstractC19074t.m100223u("hintText");
            } else {
                textView = textView9;
            }
            textView.setTextColor(this.f83344T);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k0 */
    public final void m87876k0() {
        try {
            ImageButton imageButton = this.f83325A;
            ImageButton imageButton2 = null;
            if (imageButton == null) {
                AbstractC19074t.m100223u("actionVoiceLeft");
                imageButton = null;
            }
            int x11 = (int) imageButton.getX();
            ImageButton imageButton3 = this.f83325A;
            if (imageButton3 == null) {
                AbstractC19074t.m100223u("actionVoiceLeft");
                imageButton3 = null;
            }
            int y11 = (int) imageButton3.getY();
            ImageButton imageButton4 = this.f83325A;
            if (imageButton4 == null) {
                AbstractC19074t.m100223u("actionVoiceLeft");
                imageButton4 = null;
            }
            int measuredWidth = imageButton4.getMeasuredWidth() + x11;
            ImageButton imageButton5 = this.f83325A;
            if (imageButton5 == null) {
                AbstractC19074t.m100223u("actionVoiceLeft");
                imageButton5 = null;
            }
            setCancelRecordRect(new Rect(x11 - 40, y11 - 40, measuredWidth + 40, imageButton5.getMeasuredHeight() + y11 + 40));
            ImageButton imageButton6 = this.f83327C;
            if (imageButton6 == null) {
                AbstractC19074t.m100223u("actionVoiceRight");
                imageButton6 = null;
            }
            int x12 = (int) imageButton6.getX();
            ImageButton imageButton7 = this.f83327C;
            if (imageButton7 == null) {
                AbstractC19074t.m100223u("actionVoiceRight");
                imageButton7 = null;
            }
            int y12 = (int) imageButton7.getY();
            ImageButton imageButton8 = this.f83327C;
            if (imageButton8 == null) {
                AbstractC19074t.m100223u("actionVoiceRight");
                imageButton8 = null;
            }
            int measuredWidth2 = imageButton8.getMeasuredWidth() + x12;
            ImageButton imageButton9 = this.f83327C;
            if (imageButton9 == null) {
                AbstractC19074t.m100223u("actionVoiceRight");
            } else {
                imageButton2 = imageButton9;
            }
            setFreeHandRect(new Rect(x12 - 40, y12 - 40, measuredWidth2 + 40, imageButton2.getMeasuredHeight() + y12 + 40));
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l0 */
    public final void m87877l0(SoundView.EnumC13533a enumC13533a, boolean z11) {
        if (this.f83350c0 != enumC13533a || z11) {
            try {
                int i11 = C16484e.f83363a[enumC13533a.ordinal()];
                ImageButton imageButton = null;
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 != 4) {
                                if (i11 == 5) {
                                    TextView textView = this.f83333I;
                                    if (textView == null) {
                                        AbstractC19074t.m100223u("timeText");
                                        textView = null;
                                    }
                                    textView.setTextColor(C23212s8.m119606n(AbstractC16781w.AppPrimaryColor));
                                    SoundView soundView = this.f83359y;
                                    if (soundView == null) {
                                        AbstractC19074t.m100223u("soundView");
                                        soundView = null;
                                    }
                                    soundView.setState(SoundView.EnumC13533a.FREEHAND);
                                    ImageButton imageButton2 = this.f83335K;
                                    if (imageButton2 == null) {
                                        AbstractC19074t.m100223u("recordButton");
                                        imageButton2 = null;
                                    }
                                    imageButton2.setBackground(AbstractC23136l9.m118663M(AbstractC16803z.ic_voice_recording_send_now));
                                    ImageButton imageButton3 = this.f83328D;
                                    if (imageButton3 == null) {
                                        AbstractC19074t.m100223u("arrowHintRight");
                                        imageButton3 = null;
                                    }
                                    imageButton3.setVisibility(8);
                                    ImageButton imageButton4 = this.f83326B;
                                    if (imageButton4 == null) {
                                        AbstractC19074t.m100223u("arrowHintLeft");
                                        imageButton4 = null;
                                    }
                                    imageButton4.setVisibility(8);
                                    ImageButton imageButton5 = this.f83327C;
                                    if (imageButton5 == null) {
                                        AbstractC19074t.m100223u("actionVoiceRight");
                                        imageButton5 = null;
                                    }
                                    imageButton5.setVisibility(8);
                                    ImageButton imageButton6 = this.f83325A;
                                    if (imageButton6 == null) {
                                        AbstractC19074t.m100223u("actionVoiceLeft");
                                        imageButton6 = null;
                                    }
                                    imageButton6.setVisibility(0);
                                    ImageButton imageButton7 = this.f83325A;
                                    if (imageButton7 == null) {
                                        AbstractC19074t.m100223u("actionVoiceLeft");
                                    } else {
                                        imageButton = imageButton7;
                                    }
                                    imageButton.setImageDrawable(AbstractC23136l9.m118663M(AbstractC16803z.ic_voice_del_active));
                                }
                            } else {
                                TextView textView2 = this.f83333I;
                                if (textView2 == null) {
                                    AbstractC19074t.m100223u("timeText");
                                    textView2 = null;
                                }
                                textView2.setTextColor(C23212s8.m119606n(AbstractC16781w.AppPrimaryColor));
                                SoundView soundView2 = this.f83359y;
                                if (soundView2 == null) {
                                    AbstractC19074t.m100223u("soundView");
                                    soundView2 = null;
                                }
                                soundView2.setState(SoundView.EnumC13533a.PREVIEW_FREEHAND);
                                ImageButton imageButton8 = this.f83335K;
                                if (imageButton8 == null) {
                                    AbstractC19074t.m100223u("recordButton");
                                    imageButton8 = null;
                                }
                                imageButton8.setBackground(AbstractC23136l9.m118663M(AbstractC16803z.ic_voice_recording_hand_free));
                                ImageButton imageButton9 = this.f83327C;
                                if (imageButton9 == null) {
                                    AbstractC19074t.m100223u("actionVoiceRight");
                                    imageButton9 = null;
                                }
                                imageButton9.setVisibility(0);
                                ImageButton imageButton10 = this.f83327C;
                                if (imageButton10 == null) {
                                    AbstractC19074t.m100223u("actionVoiceRight");
                                    imageButton10 = null;
                                }
                                imageButton10.setImageDrawable(AbstractC23136l9.m118663M(AbstractC16803z.ic_voice_fh_hold));
                                ImageButton imageButton11 = this.f83328D;
                                if (imageButton11 == null) {
                                    AbstractC19074t.m100223u("arrowHintRight");
                                    imageButton11 = null;
                                }
                                imageButton11.setVisibility(8);
                                ImageButton imageButton12 = this.f83326B;
                                if (imageButton12 == null) {
                                    AbstractC19074t.m100223u("arrowHintLeft");
                                } else {
                                    imageButton = imageButton12;
                                }
                                imageButton.setVisibility(0);
                            }
                        } else {
                            TextView textView3 = this.f83333I;
                            if (textView3 == null) {
                                AbstractC19074t.m100223u("timeText");
                                textView3 = null;
                            }
                            textView3.setTextColor(C23212s8.m119606n(AbstractC16781w.AppPrimaryColor));
                            SoundView soundView3 = this.f83359y;
                            if (soundView3 == null) {
                                AbstractC19074t.m100223u("soundView");
                                soundView3 = null;
                            }
                            soundView3.setState(SoundView.EnumC13533a.PREVIEW_CANCEL);
                            ImageButton imageButton13 = this.f83335K;
                            if (imageButton13 == null) {
                                AbstractC19074t.m100223u("recordButton");
                                imageButton13 = null;
                            }
                            imageButton13.setBackground(AbstractC23136l9.m118663M(AbstractC16803z.ic_voice_delete));
                            ImageButton imageButton14 = this.f83325A;
                            if (imageButton14 == null) {
                                AbstractC19074t.m100223u("actionVoiceLeft");
                                imageButton14 = null;
                            }
                            imageButton14.setVisibility(0);
                            ImageButton imageButton15 = this.f83325A;
                            if (imageButton15 == null) {
                                AbstractC19074t.m100223u("actionVoiceLeft");
                                imageButton15 = null;
                            }
                            imageButton15.setImageDrawable(AbstractC23136l9.m118663M(AbstractC16803z.ic_voice_delete_big));
                            ImageButton imageButton16 = this.f83328D;
                            if (imageButton16 == null) {
                                AbstractC19074t.m100223u("arrowHintRight");
                                imageButton16 = null;
                            }
                            imageButton16.setVisibility(0);
                            ImageButton imageButton17 = this.f83326B;
                            if (imageButton17 == null) {
                                AbstractC19074t.m100223u("arrowHintLeft");
                            } else {
                                imageButton = imageButton17;
                            }
                            imageButton.setVisibility(8);
                        }
                    } else {
                        TextView textView4 = this.f83333I;
                        if (textView4 == null) {
                            AbstractC19074t.m100223u("timeText");
                            textView4 = null;
                        }
                        textView4.setTextColor(C23212s8.m119606n(AbstractC16781w.AppPrimaryColor));
                        SoundView soundView4 = this.f83359y;
                        if (soundView4 == null) {
                            AbstractC19074t.m100223u("soundView");
                            soundView4 = null;
                        }
                        soundView4.setState(SoundView.EnumC13533a.RECORDING);
                        ImageButton imageButton18 = this.f83335K;
                        if (imageButton18 == null) {
                            AbstractC19074t.m100223u("recordButton");
                            imageButton18 = null;
                        }
                        imageButton18.setBackground(AbstractC23136l9.m118663M(AbstractC16803z.ic_voice_recording));
                        ImageButton imageButton19 = this.f83328D;
                        if (imageButton19 == null) {
                            AbstractC19074t.m100223u("arrowHintRight");
                            imageButton19 = null;
                        }
                        imageButton19.setVisibility(0);
                        if (this.f83330F == null) {
                            ImageButton imageButton20 = this.f83328D;
                            if (imageButton20 == null) {
                                AbstractC19074t.m100223u("arrowHintRight");
                                imageButton20 = null;
                            }
                            this.f83330F = m87862S(imageButton20, 50);
                        }
                        AnimatorSet animatorSet = this.f83330F;
                        if (animatorSet != null && !animatorSet.isRunning()) {
                            animatorSet.start();
                        }
                        ImageButton imageButton21 = this.f83326B;
                        if (imageButton21 == null) {
                            AbstractC19074t.m100223u("arrowHintLeft");
                            imageButton21 = null;
                        }
                        imageButton21.setVisibility(0);
                        if (this.f83329E == null) {
                            ImageButton imageButton22 = this.f83326B;
                            if (imageButton22 == null) {
                                AbstractC19074t.m100223u("arrowHintLeft");
                                imageButton22 = null;
                            }
                            this.f83329E = m87862S(imageButton22, -50);
                        }
                        AnimatorSet animatorSet2 = this.f83329E;
                        if (animatorSet2 != null && !animatorSet2.isRunning()) {
                            animatorSet2.start();
                        }
                        ImageButton imageButton23 = this.f83327C;
                        if (imageButton23 == null) {
                            AbstractC19074t.m100223u("actionVoiceRight");
                            imageButton23 = null;
                        }
                        imageButton23.setImageDrawable(AbstractC23136l9.m118663M(AbstractC16803z.ic_voice_fh_unlock));
                        ImageButton imageButton24 = this.f83327C;
                        if (imageButton24 == null) {
                            AbstractC19074t.m100223u("actionVoiceRight");
                            imageButton24 = null;
                        }
                        imageButton24.setVisibility(0);
                        ImageButton imageButton25 = this.f83325A;
                        if (imageButton25 == null) {
                            AbstractC19074t.m100223u("actionVoiceLeft");
                            imageButton25 = null;
                        }
                        imageButton25.setImageDrawable(AbstractC23136l9.m118663M(AbstractC16803z.ic_voice_del_normal));
                        ImageButton imageButton26 = this.f83325A;
                        if (imageButton26 == null) {
                            AbstractC19074t.m100223u("actionVoiceLeft");
                        } else {
                            imageButton = imageButton26;
                        }
                        imageButton.setVisibility(0);
                    }
                } else {
                    TextView textView5 = this.f83333I;
                    if (textView5 == null) {
                        AbstractC19074t.m100223u("timeText");
                        textView5 = null;
                    }
                    textView5.setTextColor(C23212s8.m119606n(AbstractC16781w.AppPrimaryColor));
                    SoundView soundView5 = this.f83359y;
                    if (soundView5 == null) {
                        AbstractC19074t.m100223u("soundView");
                        soundView5 = null;
                    }
                    soundView5.setState(SoundView.EnumC13533a.START);
                    ImageButton imageButton27 = this.f83335K;
                    if (imageButton27 == null) {
                        AbstractC19074t.m100223u("recordButton");
                        imageButton27 = null;
                    }
                    imageButton27.setBackground(AbstractC23136l9.m118663M(AbstractC16803z.ic_voice_normal));
                    ImageButton imageButton28 = this.f83328D;
                    if (imageButton28 == null) {
                        AbstractC19074t.m100223u("arrowHintRight");
                        imageButton28 = null;
                    }
                    imageButton28.setVisibility(8);
                    ImageButton imageButton29 = this.f83326B;
                    if (imageButton29 == null) {
                        AbstractC19074t.m100223u("arrowHintLeft");
                        imageButton29 = null;
                    }
                    imageButton29.setVisibility(8);
                    ImageButton imageButton30 = this.f83327C;
                    if (imageButton30 == null) {
                        AbstractC19074t.m100223u("actionVoiceRight");
                        imageButton30 = null;
                    }
                    imageButton30.setVisibility(8);
                    ImageButton imageButton31 = this.f83325A;
                    if (imageButton31 == null) {
                        AbstractC19074t.m100223u("actionVoiceLeft");
                    } else {
                        imageButton = imageButton31;
                    }
                    imageButton.setVisibility(8);
                }
                this.f83350c0 = enumC13533a;
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: m0 */
    private final void m87878m0(int i11, int i12) {
        try {
            ImageView imageView = this.f83331G;
            ImageView imageView2 = null;
            if (imageView == null) {
                AbstractC19074t.m100223u("handPreviewImg");
                imageView = null;
            }
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            AbstractC19074t.m100206d(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            ImageView imageView3 = this.f83331G;
            if (imageView3 == null) {
                AbstractC19074t.m100223u("handPreviewImg");
                imageView3 = null;
            }
            marginLayoutParams.leftMargin = i11 - (imageView3.getWidth() / 2);
            ImageView imageView4 = this.f83331G;
            if (imageView4 == null) {
                AbstractC19074t.m100223u("handPreviewImg");
                imageView4 = null;
            }
            marginLayoutParams.topMargin = i12 - (imageView4.getHeight() / 2);
            marginLayoutParams.rightMargin = -2500;
            marginLayoutParams.bottomMargin = -2500;
            ImageView imageView5 = this.f83331G;
            if (imageView5 == null) {
                AbstractC19074t.m100223u("handPreviewImg");
            } else {
                imageView2 = imageView5;
            }
            imageView2.requestLayout();
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCancelRecordRect(Rect rect) {
        this.f83348a0 = rect;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setFreeHandRect(Rect rect) {
        this.f83349b0 = rect;
    }

    private final void setPttFreeHandActionState(EnumC16657t enumC16657t) {
        this.f83353f0 = enumC16657t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setTrackingLogEntryPoint(String str) {
        this.f83338N = str;
    }

    @Override // com.zing.zalo.uicontrol.AbstractPushToTalkControl
    /* renamed from: a */
    public void mo87648a() {
        try {
            if (AbstractC23034c6.m118167n(getContext(), AbstractC23034c6.m118175r()) != 0) {
                InterfaceC16483d pttListener = getPttListener();
                if (pttListener != null) {
                    pttListener.mo60425j();
                    return;
                }
                return;
            }
            if (!m87869a0()) {
                return;
            }
            this.f83347W.removeCallbacks(this.f83356i0);
            this.f83347W.post(this.f83356i0);
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f83323l0, e11);
        }
    }

    @Override // com.zing.zalo.uicontrol.AbstractPushToTalkControl
    /* renamed from: b */
    public void mo87649b() {
        try {
            setRecorderPressing(false);
            TextView textView = null;
            setCancelRecordRect(null);
            setFreeHandRect(null);
            ImageView imageView = this.f83331G;
            if (imageView == null) {
                AbstractC19074t.m100223u("handPreviewImg");
                imageView = null;
            }
            imageView.setVisibility(8);
            if (m87652e()) {
                View view = this.f83337M;
                if (view == null) {
                    AbstractC19074t.m100223u("backgroundView");
                    view = null;
                }
                view.setVisibility(0);
                m87877l0(SoundView.EnumC13533a.FREEHAND, false);
                if (this.f83339O) {
                    TextView textView2 = this.f83332H;
                    if (textView2 == null) {
                        AbstractC19074t.m100223u("hintText");
                        textView2 = null;
                    }
                    textView2.setVisibility(0);
                    m87875j0(3);
                    TextView textView3 = this.f83333I;
                    if (textView3 == null) {
                        AbstractC19074t.m100223u("timeText");
                    } else {
                        textView = textView3;
                    }
                    textView.setVisibility(8);
                } else {
                    TextView textView4 = this.f83332H;
                    if (textView4 == null) {
                        AbstractC19074t.m100223u("hintText");
                        textView4 = null;
                    }
                    textView4.setVisibility(4);
                    TextView textView5 = this.f83333I;
                    if (textView5 == null) {
                        AbstractC19074t.m100223u("timeText");
                    } else {
                        textView = textView5;
                    }
                    textView.setVisibility(0);
                }
                m87871d0(true);
                m87874i0(1);
                C7853b.Companion.m40150a().m40096K0();
                m87873h0("csc_voice_swipe_to_hands_free");
                return;
            }
            this.f83339O = false;
            this.f83347W.removeCallbacks(this.f83355h0);
            TextView textView6 = this.f83333I;
            if (textView6 == null) {
                AbstractC19074t.m100223u("timeText");
                textView6 = null;
            }
            textView6.clearAnimation();
            TextView textView7 = this.f83333I;
            if (textView7 == null) {
                AbstractC19074t.m100223u("timeText");
                textView7 = null;
            }
            textView7.setVisibility(8);
            TextView textView8 = this.f83332H;
            if (textView8 == null) {
                AbstractC19074t.m100223u("hintText");
                textView8 = null;
            }
            textView8.setVisibility(8);
            m87875j0(0);
            m87864U();
            if (m87657j()) {
                m87892g0();
            } else {
                m87891f0();
            }
            SoundView soundView = this.f83359y;
            if (soundView == null) {
                AbstractC19074t.m100223u("soundView");
                soundView = null;
            }
            soundView.mo75728b();
            m87877l0(SoundView.EnumC13533a.START, false);
            SoundView soundView2 = this.f83359y;
            if (soundView2 == null) {
                AbstractC19074t.m100223u("soundView");
                soundView2 = null;
            }
            soundView2.setVisibility(8);
            View view2 = this.f83337M;
            if (view2 == null) {
                AbstractC19074t.m100223u("backgroundView");
                view2 = null;
            }
            view2.setVisibility(8);
            TextView textView9 = this.f83336L;
            if (textView9 == null) {
                AbstractC19074t.m100223u("tvStartTip");
            } else {
                textView = textView9;
            }
            textView.setVisibility(0);
            m87871d0(false);
            if (m87654g() && !this.f83341Q) {
                setPttFreeHandActionState(EnumC16657t.f84434s);
                m87873h0("csc_voice_swipe_to_cancel");
            } else if (!m87654g() && !this.f83342R && m87657j()) {
                setPttFreeHandActionState(EnumC16657t.f84433r);
                m87873h0("csc_voice_release_to_send");
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f83323l0, e11);
        }
    }

    /* renamed from: b0 */
    public final void m87890b0() {
        try {
            setCancelRecordRect(null);
            setFreeHandRect(null);
            this.f83347W.sendEmptyMessageDelayed(4, 60L);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // com.zing.zalo.uicontrol.AbstractPushToTalkControl
    /* renamed from: c */
    public void mo87650c() {
    }

    @Override // com.zing.zalo.uicontrol.AbstractPushToTalkControl
    /* renamed from: d */
    public void mo87651d() {
        try {
            m87866W();
            setVisibility(8);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.uicontrol.AbstractPushToTalkControl
    /* renamed from: f */
    public boolean mo87653f() {
        return false;
    }

    /* renamed from: f0 */
    public final void m87891f0() {
        try {
            C3162g.f13363a.m15927F();
            InterfaceC16483d pttListener = getPttListener();
            if (pttListener != null) {
                pttListener.mo60424i();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f83323l0, e11);
        }
    }

    /* renamed from: g0 */
    public final void m87892g0() {
        try {
            this.f83347W.removeCallbacks(this.f83354g0);
            this.f83340P = true;
            this.f83347W.postDelayed(this.f83354g0, 500L);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public final Runnable getMTimeUpdateThread() {
        return this.f83357j0;
    }

    @Override // com.zing.zalo.uicontrol.AbstractPushToTalkControl
    /* renamed from: k */
    public void mo87658k() {
        try {
            if (!m87657j()) {
                TextView textView = this.f83333I;
                if (textView == null) {
                    AbstractC19074t.m100223u("timeText");
                    textView = null;
                }
                textView.removeCallbacks(this.f83357j0);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // com.zing.zalo.uicontrol.AbstractPushToTalkControl
    /* renamed from: l */
    public void mo87659l(boolean z11) {
        try {
            if (m87657j()) {
                m87891f0();
            }
            m87863T();
            ImageButton imageButton = this.f83325A;
            SoundView soundView = null;
            if (imageButton == null) {
                AbstractC19074t.m100223u("actionVoiceLeft");
                imageButton = null;
            }
            imageButton.setVisibility(8);
            ImageButton imageButton2 = this.f83327C;
            if (imageButton2 == null) {
                AbstractC19074t.m100223u("actionVoiceRight");
                imageButton2 = null;
            }
            imageButton2.setVisibility(8);
            TextView textView = this.f83333I;
            if (textView == null) {
                AbstractC19074t.m100223u("timeText");
                textView = null;
            }
            textView.clearAnimation();
            TextView textView2 = this.f83333I;
            if (textView2 == null) {
                AbstractC19074t.m100223u("timeText");
                textView2 = null;
            }
            textView2.setVisibility(8);
            if (m87657j()) {
                C3162g.f13363a.m15933r();
            }
            if (this.f83358k0 != null) {
                this.f83358k0 = null;
            }
            AnimatorSet animatorSet = this.f83329E;
            if (animatorSet != null) {
                animatorSet.removeAllListeners();
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = this.f83330F;
            if (animatorSet2 != null) {
                animatorSet2.removeAllListeners();
                animatorSet2.cancel();
            }
            SoundView soundView2 = this.f83359y;
            if (soundView2 == null) {
                AbstractC19074t.m100223u("soundView");
            } else {
                soundView = soundView2;
            }
            soundView.setVisibility(8);
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f83323l0, e11);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        AbstractC19074t.m100208f(view, "view");
        try {
            ImageButton imageButton = this.f83325A;
            View view2 = null;
            if (imageButton == null) {
                AbstractC19074t.m100223u("actionVoiceLeft");
                imageButton = null;
            }
            if (AbstractC19074t.m100204b(view, imageButton) && !m87656i()) {
                if (m87652e()) {
                    this.f83341Q = true;
                    setRecordCancelled(true);
                    setFreeHandMode(false);
                    ImageButton imageButton2 = this.f83325A;
                    if (imageButton2 == null) {
                        AbstractC19074t.m100223u("actionVoiceLeft");
                        imageButton2 = null;
                    }
                    imageButton2.setVisibility(8);
                    ImageButton imageButton3 = this.f83327C;
                    if (imageButton3 == null) {
                        AbstractC19074t.m100223u("actionVoiceRight");
                        imageButton3 = null;
                    }
                    imageButton3.setVisibility(8);
                    setPttFreeHandActionState(EnumC16657t.f84434s);
                    InterfaceC16483d pttListener = getPttListener();
                    if (pttListener != null) {
                        pttListener.mo60417b();
                    }
                    SoundView soundView = this.f83359y;
                    if (soundView == null) {
                        AbstractC19074t.m100223u("soundView");
                    } else {
                        view2 = soundView;
                    }
                    view2.setVisibility(8);
                    m87873h0("csc_voice_tap_to_cancel");
                    return;
                }
                return;
            }
            ImageButton imageButton4 = this.f83335K;
            if (imageButton4 == null) {
                AbstractC19074t.m100223u("recordButton");
                imageButton4 = null;
            }
            if (AbstractC19074t.m100204b(view, imageButton4) && !m87656i() && m87652e()) {
                this.f83342R = true;
                setRecordCancelled(false);
                setFreeHandMode(false);
                ImageButton imageButton5 = this.f83325A;
                if (imageButton5 == null) {
                    AbstractC19074t.m100223u("actionVoiceLeft");
                    imageButton5 = null;
                }
                imageButton5.setVisibility(8);
                ImageButton imageButton6 = this.f83327C;
                if (imageButton6 == null) {
                    AbstractC19074t.m100223u("actionVoiceRight");
                } else {
                    view2 = imageButton6;
                }
                view2.setVisibility(8);
                setPttFreeHandActionState(EnumC16657t.f84433r);
                InterfaceC16483d pttListener2 = getPttListener();
                if (pttListener2 != null) {
                    pttListener2.mo60422g();
                }
                m87873h0("csc_voice_tap_to_send");
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:213:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x00ac A[Catch: Exception -> 0x0020, TryCatch #0 {Exception -> 0x0020, blocks: (B:3:0x0002, B:5:0x0018, B:6:0x0023, B:9:0x0029, B:10:0x002d, B:12:0x0034, B:14:0x0038, B:15:0x003c, B:18:0x0046, B:23:0x0054, B:26:0x006e, B:32:0x007b, B:39:0x009d, B:40:0x00b8, B:42:0x00c8, B:43:0x00d0, B:45:0x00ea, B:48:0x02fc, B:50:0x00f6, B:52:0x00fa, B:54:0x0100, B:56:0x0105, B:58:0x0109, B:60:0x0111, B:62:0x0115, B:63:0x0119, B:65:0x011f, B:67:0x0123, B:68:0x0127, B:69:0x0130, B:71:0x0137, B:73:0x013b, B:76:0x0145, B:78:0x0149, B:79:0x014d, B:81:0x0153, B:83:0x0157, B:84:0x015b, B:85:0x0161, B:86:0x0165, B:87:0x0168, B:89:0x016c, B:93:0x0176, B:95:0x017a, B:96:0x017e, B:98:0x0184, B:100:0x0188, B:101:0x018c, B:102:0x0192, B:104:0x0198, B:105:0x019c, B:107:0x01a2, B:108:0x01a9, B:110:0x01ad, B:112:0x01b3, B:114:0x01b7, B:115:0x01bb, B:117:0x01c1, B:119:0x01c5, B:120:0x01c9, B:122:0x01ce, B:125:0x01d4, B:127:0x01da, B:129:0x01de, B:130:0x01e2, B:132:0x01e8, B:134:0x01ec, B:135:0x01f0, B:137:0x01f8, B:138:0x01fc, B:139:0x0202, B:140:0x0204, B:141:0x0208, B:144:0x020e, B:146:0x0214, B:148:0x0218, B:149:0x021c, B:151:0x0222, B:153:0x0226, B:154:0x022a, B:156:0x0232, B:157:0x0236, B:158:0x023d, B:161:0x0243, B:163:0x0249, B:165:0x024d, B:166:0x0251, B:168:0x0257, B:170:0x025b, B:171:0x025f, B:173:0x0267, B:174:0x026b, B:175:0x0273, B:176:0x0279, B:177:0x027d, B:180:0x0283, B:182:0x0289, B:184:0x028d, B:185:0x0291, B:187:0x0297, B:189:0x029b, B:190:0x029f, B:192:0x02a7, B:193:0x02ab, B:194:0x02b3, B:195:0x02ba, B:197:0x02be, B:199:0x02c6, B:201:0x02ca, B:202:0x02ce, B:204:0x02d4, B:206:0x02d8, B:207:0x02dc, B:208:0x02e6, B:210:0x02ea, B:212:0x02f2, B:214:0x00a0, B:215:0x00a7, B:216:0x00a9, B:217:0x00ac, B:218:0x007e, B:219:0x0082, B:220:0x0084, B:221:0x0087), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c8 A[Catch: Exception -> 0x0020, TryCatch #0 {Exception -> 0x0020, blocks: (B:3:0x0002, B:5:0x0018, B:6:0x0023, B:9:0x0029, B:10:0x002d, B:12:0x0034, B:14:0x0038, B:15:0x003c, B:18:0x0046, B:23:0x0054, B:26:0x006e, B:32:0x007b, B:39:0x009d, B:40:0x00b8, B:42:0x00c8, B:43:0x00d0, B:45:0x00ea, B:48:0x02fc, B:50:0x00f6, B:52:0x00fa, B:54:0x0100, B:56:0x0105, B:58:0x0109, B:60:0x0111, B:62:0x0115, B:63:0x0119, B:65:0x011f, B:67:0x0123, B:68:0x0127, B:69:0x0130, B:71:0x0137, B:73:0x013b, B:76:0x0145, B:78:0x0149, B:79:0x014d, B:81:0x0153, B:83:0x0157, B:84:0x015b, B:85:0x0161, B:86:0x0165, B:87:0x0168, B:89:0x016c, B:93:0x0176, B:95:0x017a, B:96:0x017e, B:98:0x0184, B:100:0x0188, B:101:0x018c, B:102:0x0192, B:104:0x0198, B:105:0x019c, B:107:0x01a2, B:108:0x01a9, B:110:0x01ad, B:112:0x01b3, B:114:0x01b7, B:115:0x01bb, B:117:0x01c1, B:119:0x01c5, B:120:0x01c9, B:122:0x01ce, B:125:0x01d4, B:127:0x01da, B:129:0x01de, B:130:0x01e2, B:132:0x01e8, B:134:0x01ec, B:135:0x01f0, B:137:0x01f8, B:138:0x01fc, B:139:0x0202, B:140:0x0204, B:141:0x0208, B:144:0x020e, B:146:0x0214, B:148:0x0218, B:149:0x021c, B:151:0x0222, B:153:0x0226, B:154:0x022a, B:156:0x0232, B:157:0x0236, B:158:0x023d, B:161:0x0243, B:163:0x0249, B:165:0x024d, B:166:0x0251, B:168:0x0257, B:170:0x025b, B:171:0x025f, B:173:0x0267, B:174:0x026b, B:175:0x0273, B:176:0x0279, B:177:0x027d, B:180:0x0283, B:182:0x0289, B:184:0x028d, B:185:0x0291, B:187:0x0297, B:189:0x029b, B:190:0x029f, B:192:0x02a7, B:193:0x02ab, B:194:0x02b3, B:195:0x02ba, B:197:0x02be, B:199:0x02c6, B:201:0x02ca, B:202:0x02ce, B:204:0x02d4, B:206:0x02d8, B:207:0x02dc, B:208:0x02e6, B:210:0x02ea, B:212:0x02f2, B:214:0x00a0, B:215:0x00a7, B:216:0x00a9, B:217:0x00ac, B:218:0x007e, B:219:0x0082, B:220:0x0084, B:221:0x0087), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ea A[Catch: Exception -> 0x0020, TryCatch #0 {Exception -> 0x0020, blocks: (B:3:0x0002, B:5:0x0018, B:6:0x0023, B:9:0x0029, B:10:0x002d, B:12:0x0034, B:14:0x0038, B:15:0x003c, B:18:0x0046, B:23:0x0054, B:26:0x006e, B:32:0x007b, B:39:0x009d, B:40:0x00b8, B:42:0x00c8, B:43:0x00d0, B:45:0x00ea, B:48:0x02fc, B:50:0x00f6, B:52:0x00fa, B:54:0x0100, B:56:0x0105, B:58:0x0109, B:60:0x0111, B:62:0x0115, B:63:0x0119, B:65:0x011f, B:67:0x0123, B:68:0x0127, B:69:0x0130, B:71:0x0137, B:73:0x013b, B:76:0x0145, B:78:0x0149, B:79:0x014d, B:81:0x0153, B:83:0x0157, B:84:0x015b, B:85:0x0161, B:86:0x0165, B:87:0x0168, B:89:0x016c, B:93:0x0176, B:95:0x017a, B:96:0x017e, B:98:0x0184, B:100:0x0188, B:101:0x018c, B:102:0x0192, B:104:0x0198, B:105:0x019c, B:107:0x01a2, B:108:0x01a9, B:110:0x01ad, B:112:0x01b3, B:114:0x01b7, B:115:0x01bb, B:117:0x01c1, B:119:0x01c5, B:120:0x01c9, B:122:0x01ce, B:125:0x01d4, B:127:0x01da, B:129:0x01de, B:130:0x01e2, B:132:0x01e8, B:134:0x01ec, B:135:0x01f0, B:137:0x01f8, B:138:0x01fc, B:139:0x0202, B:140:0x0204, B:141:0x0208, B:144:0x020e, B:146:0x0214, B:148:0x0218, B:149:0x021c, B:151:0x0222, B:153:0x0226, B:154:0x022a, B:156:0x0232, B:157:0x0236, B:158:0x023d, B:161:0x0243, B:163:0x0249, B:165:0x024d, B:166:0x0251, B:168:0x0257, B:170:0x025b, B:171:0x025f, B:173:0x0267, B:174:0x026b, B:175:0x0273, B:176:0x0279, B:177:0x027d, B:180:0x0283, B:182:0x0289, B:184:0x028d, B:185:0x0291, B:187:0x0297, B:189:0x029b, B:190:0x029f, B:192:0x02a7, B:193:0x02ab, B:194:0x02b3, B:195:0x02ba, B:197:0x02be, B:199:0x02c6, B:201:0x02ca, B:202:0x02ce, B:204:0x02d4, B:206:0x02d8, B:207:0x02dc, B:208:0x02e6, B:210:0x02ea, B:212:0x02f2, B:214:0x00a0, B:215:0x00a7, B:216:0x00a9, B:217:0x00ac, B:218:0x007e, B:219:0x0082, B:220:0x0084, B:221:0x0087), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f6 A[Catch: Exception -> 0x0020, TryCatch #0 {Exception -> 0x0020, blocks: (B:3:0x0002, B:5:0x0018, B:6:0x0023, B:9:0x0029, B:10:0x002d, B:12:0x0034, B:14:0x0038, B:15:0x003c, B:18:0x0046, B:23:0x0054, B:26:0x006e, B:32:0x007b, B:39:0x009d, B:40:0x00b8, B:42:0x00c8, B:43:0x00d0, B:45:0x00ea, B:48:0x02fc, B:50:0x00f6, B:52:0x00fa, B:54:0x0100, B:56:0x0105, B:58:0x0109, B:60:0x0111, B:62:0x0115, B:63:0x0119, B:65:0x011f, B:67:0x0123, B:68:0x0127, B:69:0x0130, B:71:0x0137, B:73:0x013b, B:76:0x0145, B:78:0x0149, B:79:0x014d, B:81:0x0153, B:83:0x0157, B:84:0x015b, B:85:0x0161, B:86:0x0165, B:87:0x0168, B:89:0x016c, B:93:0x0176, B:95:0x017a, B:96:0x017e, B:98:0x0184, B:100:0x0188, B:101:0x018c, B:102:0x0192, B:104:0x0198, B:105:0x019c, B:107:0x01a2, B:108:0x01a9, B:110:0x01ad, B:112:0x01b3, B:114:0x01b7, B:115:0x01bb, B:117:0x01c1, B:119:0x01c5, B:120:0x01c9, B:122:0x01ce, B:125:0x01d4, B:127:0x01da, B:129:0x01de, B:130:0x01e2, B:132:0x01e8, B:134:0x01ec, B:135:0x01f0, B:137:0x01f8, B:138:0x01fc, B:139:0x0202, B:140:0x0204, B:141:0x0208, B:144:0x020e, B:146:0x0214, B:148:0x0218, B:149:0x021c, B:151:0x0222, B:153:0x0226, B:154:0x022a, B:156:0x0232, B:157:0x0236, B:158:0x023d, B:161:0x0243, B:163:0x0249, B:165:0x024d, B:166:0x0251, B:168:0x0257, B:170:0x025b, B:171:0x025f, B:173:0x0267, B:174:0x026b, B:175:0x0273, B:176:0x0279, B:177:0x027d, B:180:0x0283, B:182:0x0289, B:184:0x028d, B:185:0x0291, B:187:0x0297, B:189:0x029b, B:190:0x029f, B:192:0x02a7, B:193:0x02ab, B:194:0x02b3, B:195:0x02ba, B:197:0x02be, B:199:0x02c6, B:201:0x02ca, B:202:0x02ce, B:204:0x02d4, B:206:0x02d8, B:207:0x02dc, B:208:0x02e6, B:210:0x02ea, B:212:0x02f2, B:214:0x00a0, B:215:0x00a7, B:216:0x00a9, B:217:0x00ac, B:218:0x007e, B:219:0x0082, B:220:0x0084, B:221:0x0087), top: B:2:0x0002 }] */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i21;
        View view;
        int measuredHeight;
        int i22;
        int i23;
        int measuredHeight2;
        int i24;
        try {
            int childCount = getChildCount();
            int i25 = f83324m0;
            int m122007i5 = AbstractC23309i.m122007i5(getContext());
            if (getMeasuredHeight() > this.f83352e0) {
                m122007i5 = getMeasuredHeight() - this.f83352e0;
            }
            ImageButton imageButton = this.f83335K;
            if (imageButton == null) {
                AbstractC19074t.m100223u("recordButton");
                imageButton = null;
            }
            if (m122007i5 > imageButton.getMeasuredHeight()) {
                ImageButton imageButton2 = this.f83335K;
                if (imageButton2 == null) {
                    AbstractC19074t.m100223u("recordButton");
                    imageButton2 = null;
                }
                i25 = (m122007i5 - imageButton2.getMeasuredHeight()) / 2;
            }
            for (int i26 = 0; i26 < childCount; i26++) {
                View childAt = getChildAt(i26);
                if (childAt.getVisibility() != 8) {
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    AbstractC19074t.m100206d(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight3 = childAt.getMeasuredHeight();
                    int i27 = layoutParams2.gravity;
                    if (i27 == -1) {
                        i27 = 51;
                    }
                    int i28 = i27 & 112;
                    int i29 = i27 & 7;
                    if (i29 == 1) {
                        i15 = (((i13 - i11) - measuredWidth) / 2) + layoutParams2.leftMargin;
                        i16 = layoutParams2.rightMargin;
                    } else {
                        if (i29 == 3) {
                            i17 = layoutParams2.leftMargin;
                        } else if (i29 != 5) {
                            i17 = layoutParams2.leftMargin;
                        } else {
                            i15 = i13 - measuredWidth;
                            i16 = layoutParams2.rightMargin;
                        }
                        if (i28 != 16) {
                            i18 = ((((i14 - i25) - i12) - measuredHeight3) / 2) + layoutParams2.topMargin;
                            i19 = layoutParams2.bottomMargin;
                        } else {
                            if (i28 == 48) {
                                i21 = layoutParams2.topMargin;
                            } else if (i28 != 80) {
                                i21 = layoutParams2.topMargin;
                            } else {
                                i18 = ((i14 - i25) - i12) - measuredHeight3;
                                i19 = layoutParams2.bottomMargin;
                            }
                            int m118742r = AbstractC23136l9.m118742r(5.0f);
                            int m118742r2 = ((((i14 - i25) - i12) - measuredHeight3) - layoutParams2.bottomMargin) + (AbstractC23136l9.m118687Y(getContext()) == 2 ? AbstractC23136l9.m118742r(15.0f) : 0);
                            int i31 = ((((i13 - i11) - measuredWidth) / 2) + layoutParams2.leftMargin) - layoutParams2.rightMargin;
                            view = this.f83337M;
                            if (view == null) {
                                AbstractC19074t.m100223u("backgroundView");
                                view = null;
                            }
                            if (childAt == view) {
                                i17 = 0;
                                i21 = 0;
                            } else {
                                ImageButton imageButton3 = this.f83335K;
                                if (imageButton3 == null) {
                                    AbstractC19074t.m100223u("recordButton");
                                    imageButton3 = null;
                                }
                                if (childAt != imageButton3) {
                                    SoundView soundView = this.f83359y;
                                    if (soundView == null) {
                                        AbstractC19074t.m100223u("soundView");
                                        soundView = null;
                                    }
                                    if (childAt == soundView) {
                                        ImageButton imageButton4 = this.f83335K;
                                        if (imageButton4 == null) {
                                            AbstractC19074t.m100223u("recordButton");
                                            imageButton4 = null;
                                        }
                                        if (imageButton4.getVisibility() != 8) {
                                            ImageButton imageButton5 = this.f83335K;
                                            if (imageButton5 == null) {
                                                AbstractC19074t.m100223u("recordButton");
                                                imageButton5 = null;
                                            }
                                            i24 = (measuredHeight3 - imageButton5.getMeasuredHeight()) / 2;
                                        } else {
                                            i24 = 0;
                                        }
                                        m118742r2 = m118742r2 + i24 + layoutParams2.topMargin;
                                    } else {
                                        TextView textView = this.f83333I;
                                        if (textView == null) {
                                            AbstractC19074t.m100223u("timeText");
                                            textView = null;
                                        }
                                        if (childAt == textView) {
                                            ImageButton imageButton6 = this.f83335K;
                                            if (imageButton6 == null) {
                                                AbstractC19074t.m100223u("recordButton");
                                                imageButton6 = null;
                                            }
                                            if (imageButton6.getVisibility() != 8) {
                                                ImageButton imageButton7 = this.f83335K;
                                                if (imageButton7 == null) {
                                                    AbstractC19074t.m100223u("recordButton");
                                                    imageButton7 = null;
                                                }
                                                m118742r2 -= imageButton7.getMeasuredHeight();
                                            }
                                            measuredHeight = AbstractC23136l9.m118742r(24.0f);
                                        } else {
                                            TextView textView2 = this.f83332H;
                                            if (textView2 == null) {
                                                AbstractC19074t.m100223u("hintText");
                                                textView2 = null;
                                            }
                                            if (childAt == textView2) {
                                                ImageButton imageButton8 = this.f83335K;
                                                if (imageButton8 == null) {
                                                    AbstractC19074t.m100223u("recordButton");
                                                    imageButton8 = null;
                                                }
                                                if (imageButton8.getVisibility() != 8) {
                                                    ImageButton imageButton9 = this.f83335K;
                                                    if (imageButton9 == null) {
                                                        AbstractC19074t.m100223u("recordButton");
                                                        imageButton9 = null;
                                                    }
                                                    m118742r2 -= imageButton9.getMeasuredHeight();
                                                }
                                                i21 = m118742r2;
                                                TextView textView3 = this.f83334J;
                                                if (textView3 == null) {
                                                    AbstractC19074t.m100223u("guideText");
                                                    textView3 = null;
                                                }
                                                if (textView3.getVisibility() == 0) {
                                                    i21 -= AbstractC23136l9.m118742r(24.0f);
                                                }
                                                i17 = i31;
                                            } else {
                                                TextView textView4 = this.f83334J;
                                                if (textView4 == null) {
                                                    AbstractC19074t.m100223u("guideText");
                                                    textView4 = null;
                                                }
                                                if (childAt == textView4) {
                                                    ImageButton imageButton10 = this.f83335K;
                                                    if (imageButton10 == null) {
                                                        AbstractC19074t.m100223u("recordButton");
                                                        imageButton10 = null;
                                                    }
                                                    if (imageButton10.getVisibility() != 8) {
                                                        ImageButton imageButton11 = this.f83335K;
                                                        if (imageButton11 == null) {
                                                            AbstractC19074t.m100223u("recordButton");
                                                            imageButton11 = null;
                                                        }
                                                        measuredHeight = imageButton11.getMeasuredHeight();
                                                    }
                                                    i17 = i31;
                                                    i21 = m118742r2;
                                                } else {
                                                    ImageButton imageButton12 = this.f83325A;
                                                    if (imageButton12 == null) {
                                                        AbstractC19074t.m100223u("actionVoiceLeft");
                                                        imageButton12 = null;
                                                    }
                                                    if (childAt == imageButton12) {
                                                        ImageButton imageButton13 = this.f83335K;
                                                        if (imageButton13 == null) {
                                                            AbstractC19074t.m100223u("recordButton");
                                                            imageButton13 = null;
                                                        }
                                                        if (imageButton13.getVisibility() != 8) {
                                                            ImageButton imageButton14 = this.f83335K;
                                                            if (imageButton14 == null) {
                                                                AbstractC19074t.m100223u("recordButton");
                                                                imageButton14 = null;
                                                            }
                                                            int measuredHeight4 = imageButton14.getMeasuredHeight();
                                                            ImageButton imageButton15 = this.f83325A;
                                                            if (imageButton15 == null) {
                                                                AbstractC19074t.m100223u("actionVoiceLeft");
                                                                imageButton15 = null;
                                                            }
                                                            measuredHeight2 = (measuredHeight4 - imageButton15.getMeasuredHeight()) / 2;
                                                            m118742r2 -= measuredHeight2;
                                                        }
                                                        i21 = m118742r2 + m118742r;
                                                    } else {
                                                        ImageButton imageButton16 = this.f83326B;
                                                        if (imageButton16 == null) {
                                                            AbstractC19074t.m100223u("arrowHintLeft");
                                                            imageButton16 = null;
                                                        }
                                                        if (childAt == imageButton16) {
                                                            ImageButton imageButton17 = this.f83335K;
                                                            if (imageButton17 == null) {
                                                                AbstractC19074t.m100223u("recordButton");
                                                                imageButton17 = null;
                                                            }
                                                            if (imageButton17.getVisibility() != 8) {
                                                                ImageButton imageButton18 = this.f83335K;
                                                                if (imageButton18 == null) {
                                                                    AbstractC19074t.m100223u("recordButton");
                                                                    imageButton18 = null;
                                                                }
                                                                int measuredHeight5 = imageButton18.getMeasuredHeight();
                                                                ImageButton imageButton19 = this.f83326B;
                                                                if (imageButton19 == null) {
                                                                    AbstractC19074t.m100223u("arrowHintLeft");
                                                                    imageButton19 = null;
                                                                }
                                                                measuredHeight2 = (measuredHeight5 - imageButton19.getMeasuredHeight()) / 2;
                                                                m118742r2 -= measuredHeight2;
                                                            }
                                                            i21 = m118742r2 + m118742r;
                                                        } else {
                                                            ImageButton imageButton20 = this.f83327C;
                                                            if (imageButton20 == null) {
                                                                AbstractC19074t.m100223u("actionVoiceRight");
                                                                imageButton20 = null;
                                                            }
                                                            if (childAt == imageButton20) {
                                                                ImageButton imageButton21 = this.f83335K;
                                                                if (imageButton21 == null) {
                                                                    AbstractC19074t.m100223u("recordButton");
                                                                    imageButton21 = null;
                                                                }
                                                                if (imageButton21.getVisibility() != 8) {
                                                                    ImageButton imageButton22 = this.f83335K;
                                                                    if (imageButton22 == null) {
                                                                        AbstractC19074t.m100223u("recordButton");
                                                                        imageButton22 = null;
                                                                    }
                                                                    int measuredHeight6 = imageButton22.getMeasuredHeight();
                                                                    ImageButton imageButton23 = this.f83327C;
                                                                    if (imageButton23 == null) {
                                                                        AbstractC19074t.m100223u("actionVoiceRight");
                                                                        imageButton23 = null;
                                                                    }
                                                                    m118742r2 -= (measuredHeight6 - imageButton23.getMeasuredHeight()) / 2;
                                                                }
                                                                i21 = m118742r2 + m118742r;
                                                                i22 = i13 - measuredWidth;
                                                                i23 = layoutParams2.rightMargin;
                                                            } else {
                                                                ImageButton imageButton24 = this.f83328D;
                                                                if (imageButton24 == null) {
                                                                    AbstractC19074t.m100223u("arrowHintRight");
                                                                    imageButton24 = null;
                                                                }
                                                                if (childAt == imageButton24) {
                                                                    ImageButton imageButton25 = this.f83335K;
                                                                    if (imageButton25 == null) {
                                                                        AbstractC19074t.m100223u("recordButton");
                                                                        imageButton25 = null;
                                                                    }
                                                                    if (imageButton25.getVisibility() != 8) {
                                                                        ImageButton imageButton26 = this.f83335K;
                                                                        if (imageButton26 == null) {
                                                                            AbstractC19074t.m100223u("recordButton");
                                                                            imageButton26 = null;
                                                                        }
                                                                        int measuredHeight7 = imageButton26.getMeasuredHeight();
                                                                        ImageButton imageButton27 = this.f83328D;
                                                                        if (imageButton27 == null) {
                                                                            AbstractC19074t.m100223u("arrowHintRight");
                                                                            imageButton27 = null;
                                                                        }
                                                                        m118742r2 -= (measuredHeight7 - imageButton27.getMeasuredHeight()) / 2;
                                                                    }
                                                                    i21 = m118742r2 + m118742r;
                                                                    i22 = i13 - measuredWidth;
                                                                    i23 = layoutParams2.rightMargin;
                                                                } else {
                                                                    TextView textView5 = this.f83336L;
                                                                    if (textView5 == null) {
                                                                        AbstractC19074t.m100223u("tvStartTip");
                                                                        textView5 = null;
                                                                    }
                                                                    if (childAt == textView5) {
                                                                        ImageButton imageButton28 = this.f83335K;
                                                                        if (imageButton28 == null) {
                                                                            AbstractC19074t.m100223u("recordButton");
                                                                            imageButton28 = null;
                                                                        }
                                                                        if (imageButton28.getVisibility() != 8) {
                                                                            ImageButton imageButton29 = this.f83335K;
                                                                            if (imageButton29 == null) {
                                                                                AbstractC19074t.m100223u("recordButton");
                                                                                imageButton29 = null;
                                                                            }
                                                                            measuredHeight = imageButton29.getMeasuredHeight();
                                                                        }
                                                                        i17 = i31;
                                                                        i21 = m118742r2;
                                                                    } else {
                                                                        TextView textView6 = this.f83360z;
                                                                        if (textView6 == null) {
                                                                            AbstractC19074t.m100223u("tvZeroAmplitude");
                                                                            textView6 = null;
                                                                        }
                                                                        if (childAt == textView6) {
                                                                            i21 = getResources().getDimensionPixelSize(AbstractC17454d.action_bar_default_height);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            i17 = i22 - i23;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        i21 = m118742r2 - measuredHeight;
                                        i17 = i31;
                                    }
                                }
                                i21 = m118742r2 + m118742r;
                                i17 = i31;
                            }
                            childAt.layout(i17, i21, measuredWidth + i17, measuredHeight3 + i21);
                        }
                        i21 = i18 - i19;
                        int m118742r3 = AbstractC23136l9.m118742r(5.0f);
                        int m118742r22 = ((((i14 - i25) - i12) - measuredHeight3) - layoutParams2.bottomMargin) + (AbstractC23136l9.m118687Y(getContext()) == 2 ? AbstractC23136l9.m118742r(15.0f) : 0);
                        int i312 = ((((i13 - i11) - measuredWidth) / 2) + layoutParams2.leftMargin) - layoutParams2.rightMargin;
                        view = this.f83337M;
                        if (view == null) {
                        }
                        if (childAt == view) {
                        }
                        childAt.layout(i17, i21, measuredWidth + i17, measuredHeight3 + i21);
                    }
                    i17 = i15 - i16;
                    if (i28 != 16) {
                    }
                    i21 = i18 - i19;
                    int m118742r32 = AbstractC23136l9.m118742r(5.0f);
                    int m118742r222 = ((((i14 - i25) - i12) - measuredHeight3) - layoutParams2.bottomMargin) + (AbstractC23136l9.m118687Y(getContext()) == 2 ? AbstractC23136l9.m118742r(15.0f) : 0);
                    int i3122 = ((((i13 - i11) - measuredWidth) / 2) + layoutParams2.leftMargin) - layoutParams2.rightMargin;
                    view = this.f83337M;
                    if (view == null) {
                    }
                    if (childAt == view) {
                    }
                    childAt.layout(i17, i21, measuredWidth + i17, measuredHeight3 + i21);
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        int m116580c;
        try {
            int size = View.MeasureSpec.getSize(i11);
            int size2 = View.MeasureSpec.getSize(i12);
            int m122007i5 = AbstractC23309i.m122007i5(getContext());
            setMeasuredDimension(size, size2);
            this.f83352e0 = size2;
            int childCount = getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt = getChildAt(i13);
                if (childAt.getVisibility() != 8) {
                    View view = this.f83337M;
                    ImageButton imageButton = null;
                    if (view == null) {
                        AbstractC19074t.m100223u("backgroundView");
                        view = null;
                    }
                    if (childAt == view) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f83352e0 - m122007i5, 1073741824));
                    } else {
                        TextView textView = this.f83360z;
                        if (textView == null) {
                            AbstractC19074t.m100223u("tvZeroAmplitude");
                            textView = null;
                        }
                        if (childAt == textView) {
                            measureChildWithMargins(childAt, View.MeasureSpec.makeMeasureSpec(size, 1073741824), 0, View.MeasureSpec.makeMeasureSpec(size2, 0), 0);
                        } else {
                            ImageButton imageButton2 = this.f83335K;
                            if (imageButton2 == null) {
                                AbstractC19074t.m100223u("recordButton");
                                imageButton2 = null;
                            }
                            if (childAt == imageButton2) {
                                int m118742r = m122007i5 - AbstractC23136l9.m118742r(80.0f);
                                measureChildWithMargins(childAt, View.MeasureSpec.makeMeasureSpec(m118742r, Integer.MIN_VALUE), 0, View.MeasureSpec.makeMeasureSpec(m118742r, Integer.MIN_VALUE), 0);
                            } else {
                                SoundView soundView = this.f83359y;
                                if (soundView == null) {
                                    AbstractC19074t.m100223u("soundView");
                                    soundView = null;
                                }
                                if (childAt == soundView) {
                                    int m118742r2 = AbstractC23136l9.m118742r(200.0f);
                                    ImageButton imageButton3 = this.f83335K;
                                    if (imageButton3 == null) {
                                        AbstractC19074t.m100223u("recordButton");
                                    } else {
                                        imageButton = imageButton3;
                                    }
                                    int measuredHeight = imageButton.getMeasuredHeight();
                                    m116580c = AbstractC22543l.m116580c((((size2 - this.f83352e0) - measuredHeight) - AbstractC23136l9.m118742r(10.0f)) / 2, 0);
                                    int i14 = measuredHeight + (m116580c * 2);
                                    if (m118742r2 > i14) {
                                        m118742r2 = i14;
                                    }
                                    childAt.measure(View.MeasureSpec.makeMeasureSpec(m118742r2, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(m118742r2, Integer.MIN_VALUE));
                                } else {
                                    measureChildWithMargins(childAt, View.MeasureSpec.makeMeasureSpec(size, 0), 0, View.MeasureSpec.makeMeasureSpec(size2, 0), 0);
                                }
                            }
                        }
                    }
                }
            }
        } catch (Exception unused) {
            super.onMeasure(i11, i12);
        }
    }
}
