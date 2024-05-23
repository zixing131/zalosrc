package com.zing.zalo.uicontrol;

import am.AbstractC0924m0;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import bi0.AbstractC2807a;
import bz.C3162g;
import bz.InterfaceC3163h;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.AbstractC8915g0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.SensitiveDataException;
import com.zing.zalo.common.C7853b;
import com.zing.zalo.feed.mvp.profile.model.theme.Image;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.uicontrol.PushToTalkControl;
import com.zing.zalo.uicontrol.PushToTalkSpeechToText;
import com.zing.zalo.uicontrol.voice.BoardButtonLayout;
import com.zing.zalo.uicontrol.voice.BoardRecordButton;
import com.zing.zalo.uicontrol.voice.WaveformView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zdesign.component.Button;
import com.zing.zalo.zdesign.component.Switch;
import df0.C17911a;
import df0.C17915e;
import en0.InterfaceC18494a;
import fd0.AbstractC18884d;
import fd0.C18882b;
import fd0.C18888h;
import fd0.EnumC18885e;
import fd0.EnumC18886f;
import fd0.EnumC18887g;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import gg0.AbstractC19444a;
import hm0.C20096c;
import hm0.InterfaceC20098e;
import java.util.Iterator;
import java.util.List;
import ln0.AbstractC22543l;
import me0.AbstractC23034c6;
import me0.AbstractC23136l9;
import me0.AbstractC23160o0;
import me0.AbstractC23222t7;
import me0.AbstractC23238v2;
import me0.C23046d7;
import me0.C23055e5;
import me0.C23212s8;
import mj0.AbstractC23322a;
import mm0.AbstractC23350e;
import p019aj.C0872f;
import p207he.C20024r;
import p227i3.C20218v;
import p248iy.AbstractC20887g;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p405ov.C24559a;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import qm0.AbstractC25368s;
import sy.AbstractC26423o;
import tg.C26664o;
import ui0.C27280g;
import vg.AbstractC28054e7;
import vl0.AbstractC28292b;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

@SuppressLint({"ClickableViewAccessibility"})
/* loaded from: classes4.dex */
public final class PushToTalkSpeechToText extends AbstractPushToTalkControl implements View.OnClickListener {
    public static final C16491a Companion = new C16491a(null);

    /* renamed from: s0 */
    private static final String f83373s0;

    /* renamed from: A */
    private FrameLayout f83374A;

    /* renamed from: B */
    private long f83375B;

    /* renamed from: C */
    private long f83376C;

    /* renamed from: D */
    private int f83377D;

    /* renamed from: E */
    private EnumC16493c f83378E;

    /* renamed from: F */
    private EnumC16492b f83379F;

    /* renamed from: G */
    private final BoardButtonLayout f83380G;

    /* renamed from: H */
    private final LinearLayout f83381H;

    /* renamed from: I */
    private final int f83382I;

    /* renamed from: J */
    private final Switch f83383J;

    /* renamed from: K */
    private final ViewGroup f83384K;

    /* renamed from: L */
    private final View f83385L;

    /* renamed from: M */
    private final FrameLayout f83386M;

    /* renamed from: N */
    private final RobotoTextView f83387N;

    /* renamed from: O */
    private final RobotoTextView f83388O;

    /* renamed from: P */
    private boolean f83389P;

    /* renamed from: Q */
    private int f83390Q;

    /* renamed from: R */
    private boolean f83391R;

    /* renamed from: S */
    private final View f83392S;

    /* renamed from: T */
    private final WaveformView f83393T;

    /* renamed from: U */
    private int f83394U;

    /* renamed from: V */
    private int f83395V;

    /* renamed from: W */
    private boolean f83396W;

    /* renamed from: a0 */
    private boolean f83397a0;

    /* renamed from: b0 */
    private int f83398b0;

    /* renamed from: c0 */
    private String f83399c0;

    /* renamed from: d0 */
    private String f83400d0;

    /* renamed from: e0 */
    private long f83401e0;

    /* renamed from: f0 */
    private C18882b f83402f0;

    /* renamed from: g0 */
    private final InterfaceC24854k f83403g0;

    /* renamed from: h0 */
    private final C16496f f83404h0;

    /* renamed from: i0 */
    private int f83405i0;

    /* renamed from: j0 */
    private final InterfaceC18494a f83406j0;

    /* renamed from: k0 */
    private boolean f83407k0;

    /* renamed from: l0 */
    private long f83408l0;

    /* renamed from: m0 */
    private C7853b.d f83409m0;

    /* renamed from: n0 */
    private AbstractC28054e7 f83410n0;

    /* renamed from: o0 */
    private InterfaceC3163h f83411o0;

    /* renamed from: p0 */
    private final Runnable f83412p0;

    /* renamed from: q0 */
    private final Runnable f83413q0;

    /* renamed from: r0 */
    private long f83414r0;

    /* renamed from: y */
    private RobotoTextView f83415y;

    /* renamed from: z */
    private Button f83416z;

    /* renamed from: com.zing.zalo.uicontrol.PushToTalkSpeechToText$a */
    /* loaded from: classes4.dex */
    public static final class C16491a {
        private C16491a() {
        }

        public /* synthetic */ C16491a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final String m87984a() {
            return PushToTalkSpeechToText.f83373s0;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: com.zing.zalo.uicontrol.PushToTalkSpeechToText$b */
    /* loaded from: classes4.dex */
    public static final class EnumC16492b {

        /* renamed from: p */
        public static final EnumC16492b f83417p = new EnumC16492b(Image.SCALE_TYPE_NONE, 0);

        /* renamed from: q */
        public static final EnumC16492b f83418q = new EnumC16492b("CANCEL", 1);

        /* renamed from: r */
        public static final EnumC16492b f83419r = new EnumC16492b("FREE_HAND", 2);

        /* renamed from: s */
        private static final /* synthetic */ EnumC16492b[] f83420s;

        /* renamed from: t */
        private static final /* synthetic */ InterfaceC30165a f83421t;

        static {
            EnumC16492b[] m87985b = m87985b();
            f83420s = m87985b;
            f83421t = AbstractC30166b.m148796a(m87985b);
        }

        private EnumC16492b(String str, int i11) {
        }

        /* renamed from: b */
        private static final /* synthetic */ EnumC16492b[] m87985b() {
            return new EnumC16492b[]{f83417p, f83418q, f83419r};
        }

        public static EnumC16492b valueOf(String str) {
            return (EnumC16492b) Enum.valueOf(EnumC16492b.class, str);
        }

        public static EnumC16492b[] values() {
            return (EnumC16492b[]) f83420s.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: com.zing.zalo.uicontrol.PushToTalkSpeechToText$c */
    /* loaded from: classes4.dex */
    public static final class EnumC16493c {

        /* renamed from: p */
        public static final EnumC16493c f83422p = new EnumC16493c("START", 0);

        /* renamed from: q */
        public static final EnumC16493c f83423q = new EnumC16493c("RECORDING", 1);

        /* renamed from: r */
        public static final EnumC16493c f83424r = new EnumC16493c("PREVIEW", 2);

        /* renamed from: s */
        private static final /* synthetic */ EnumC16493c[] f83425s;

        /* renamed from: t */
        private static final /* synthetic */ InterfaceC30165a f83426t;

        static {
            EnumC16493c[] m87986b = m87986b();
            f83425s = m87986b;
            f83426t = AbstractC30166b.m148796a(m87986b);
        }

        private EnumC16493c(String str, int i11) {
        }

        /* renamed from: b */
        private static final /* synthetic */ EnumC16493c[] m87986b() {
            return new EnumC16493c[]{f83422p, f83423q, f83424r};
        }

        public static EnumC16493c valueOf(String str) {
            return (EnumC16493c) Enum.valueOf(EnumC16493c.class, str);
        }

        public static EnumC16493c[] values() {
            return (EnumC16493c[]) f83425s.clone();
        }
    }

    /* renamed from: com.zing.zalo.uicontrol.PushToTalkSpeechToText$d */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C16494d {

        /* renamed from: a */
        public static final /* synthetic */ int[] f83427a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f83428b;

        /* renamed from: c */
        public static final /* synthetic */ int[] f83429c;

        static {
            int[] iArr = new int[EnumC18887g.values().length];
            try {
                iArr[EnumC18887g.f94283t.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC18887g.f94281r.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC18887g.f94282s.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC18887g.f94280q.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC18887g.f94284u.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC18887g.f94279p.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f83427a = iArr;
            int[] iArr2 = new int[EnumC16493c.values().length];
            try {
                iArr2[EnumC16493c.f83422p.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[EnumC16493c.f83423q.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[EnumC16493c.f83424r.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            f83428b = iArr2;
            int[] iArr3 = new int[EnumC16492b.values().length];
            try {
                iArr3[EnumC16492b.f83417p.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[EnumC16492b.f83418q.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[EnumC16492b.f83419r.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            f83429c = iArr3;
        }
    }

    /* renamed from: com.zing.zalo.uicontrol.PushToTalkSpeechToText$e */
    /* loaded from: classes4.dex */
    static final class C16495e extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C16495e f83430q = new C16495e();

        C16495e() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0872f mo12V4() {
            return AbstractC23306f.m120562A();
        }
    }

    /* renamed from: com.zing.zalo.uicontrol.PushToTalkSpeechToText$f */
    /* loaded from: classes4.dex */
    public static final class C16496f implements InterfaceC20098e {
        C16496f() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public static final void m87989e(PushToTalkSpeechToText pushToTalkSpeechToText) {
            AbstractC19074t.m100208f(pushToTalkSpeechToText, "this$0");
            try {
                if (pushToTalkSpeechToText.m87983c0()) {
                    pushToTalkSpeechToText.m87961q0();
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f(PushToTalkSpeechToText.Companion.m87984a(), e11);
            }
        }

        @Override // hm0.InterfaceC20098e
        /* renamed from: a */
        public void mo2128a(C20096c c20096c) {
            final PushToTalkSpeechToText pushToTalkSpeechToText = PushToTalkSpeechToText.this;
            AbstractC19444a.m101697e(new Runnable() { // from class: com.zing.zalo.uicontrol.r0
                @Override // java.lang.Runnable
                public final void run() {
                    PushToTalkSpeechToText.C16496f.m87989e(PushToTalkSpeechToText.this);
                }
            });
        }

        @Override // hm0.InterfaceC20098e
        /* renamed from: b */
        public void mo2129b(Object obj) {
        }

        @Override // hm0.InterfaceC20098e
        /* renamed from: c */
        public void mo2130c(long j11, String str) {
        }
    }

    /* renamed from: com.zing.zalo.uicontrol.PushToTalkSpeechToText$g */
    /* loaded from: classes4.dex */
    static final class C16497g extends AbstractC19075u implements InterfaceC18494a {
        C16497g() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m87990a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m87990a() {
            PushToTalkSpeechToText.this.f83405i0 = 2;
            PushToTalkSpeechToText.this.m87931T();
        }
    }

    /* renamed from: com.zing.zalo.uicontrol.PushToTalkSpeechToText$h */
    /* loaded from: classes4.dex */
    public static final class RunnableC16498h implements Runnable {
        RunnableC16498h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (!PushToTalkSpeechToText.this.m87657j()) {
                    return;
                }
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j11 = elapsedRealtime - PushToTalkSpeechToText.this.f83375B;
                PushToTalkSpeechToText.this.f83376C = j11;
                String m119184B0 = AbstractC23160o0.m119184B0(j11);
                if (PushToTalkSpeechToText.this.m87983c0()) {
                    if (j11 > 1200 && !PushToTalkSpeechToText.this.getRightButton().isEnabled()) {
                        PushToTalkSpeechToText.this.m87933U();
                    }
                } else {
                    PushToTalkSpeechToText.this.f83387N.setText(m119184B0);
                    if (j11 > 1200 && !PushToTalkSpeechToText.this.getRightButton().isEnabled()) {
                        PushToTalkSpeechToText.this.m87933U();
                    }
                }
                if (j11 <= 300000 && (!PushToTalkSpeechToText.this.m87983c0() || j11 <= 60000)) {
                    PushToTalkSpeechToText.this.f83374A.postDelayed(this, 100L);
                    return;
                }
                PushToTalkSpeechToText.this.f83391R = true;
                PushToTalkControl.InterfaceC16483d pttListener = PushToTalkSpeechToText.this.getPttListener();
                if (pttListener != null) {
                    pttListener.mo60436s();
                }
                PushToTalkSpeechToText.Companion.m87984a();
                long j12 = PushToTalkSpeechToText.this.f83375B;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Reach time limit: Current time:");
                sb2.append(elapsedRealtime);
                sb2.append(" Start time:");
                sb2.append(j12);
                sb2.append(" Total time:");
                sb2.append(j11);
            } catch (Exception e11) {
                AbstractC23350e.m122776f(PushToTalkSpeechToText.Companion.m87984a(), e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.uicontrol.PushToTalkSpeechToText$i */
    /* loaded from: classes4.dex */
    public static final class C16499i implements C7853b.d {
        C16499i() {
        }

        @Override // com.zing.zalo.common.C7853b.d
        /* renamed from: a */
        public void mo40156a(String str, int i11) {
            if (TextUtils.equals(str, PushToTalkSpeechToText.this.getFileRecordName())) {
                PushToTalkSpeechToText.this.f83393T.setProgressPreview(i11);
                PushToTalkSpeechToText pushToTalkSpeechToText = PushToTalkSpeechToText.this;
                pushToTalkSpeechToText.setPreviewedProgressLog$app_release(Math.max(pushToTalkSpeechToText.getPreviewedProgressLog$app_release(), i11));
            }
        }

        @Override // com.zing.zalo.common.C7853b.d
        /* renamed from: b */
        public void mo40157b(String str, String str2) {
            PushToTalkSpeechToText.this.f83387N.setText(str2);
        }

        @Override // com.zing.zalo.common.C7853b.d
        /* renamed from: c */
        public void mo40158c(String str, int i11) {
        }

        @Override // com.zing.zalo.common.C7853b.d
        public void onAudioFocusChange(int i11) {
        }
    }

    /* renamed from: com.zing.zalo.uicontrol.PushToTalkSpeechToText$j */
    /* loaded from: classes4.dex */
    public static final class C16500j implements InterfaceC3163h {
        C16500j() {
        }

        @Override // bz.InterfaceC3163h
        /* renamed from: a */
        public void mo15928a(byte[] bArr, boolean z11) {
            AbstractC19074t.m100208f(bArr, "encodedData");
            PushToTalkControl.InterfaceC16483d pttListener = PushToTalkSpeechToText.this.getPttListener();
            if (pttListener != null) {
                pttListener.mo60415a(bArr, z11);
            }
        }

        @Override // bz.InterfaceC3163h
        /* renamed from: b */
        public void mo15929b(int i11) {
            int m116580c;
            try {
                if (!PushToTalkSpeechToText.this.m87983c0()) {
                    PushToTalkSpeechToText.this.f83393T.m88845s(i11);
                }
                PushToTalkSpeechToText.this.getRecordVoiceButton().m88826f(i11);
                PushToTalkSpeechToText pushToTalkSpeechToText = PushToTalkSpeechToText.this;
                m116580c = AbstractC22543l.m116580c(i11, 1);
                pushToTalkSpeechToText.setMaxAmplitudeRecorder(m116580c);
            } catch (Exception e11) {
                AbstractC23350e.m122776f(PushToTalkSpeechToText.Companion.m87984a(), e11);
            }
        }

        @Override // bz.InterfaceC3163h
        /* renamed from: e */
        public void mo15930e(String str, int i11) {
            AbstractC19074t.m100208f(str, "outFile");
            PushToTalkSpeechToText.this.m87937W(0, i11);
        }

        @Override // bz.InterfaceC3163h
        /* renamed from: f */
        public void mo15931f(int i11, Exception exc) {
            PushToTalkSpeechToText.this.m87937W(i11, 0);
        }

        @Override // bz.InterfaceC3163h
        /* renamed from: h */
        public void mo15932h() {
            PushToTalkSpeechToText.this.m87899B0();
        }
    }

    /* renamed from: com.zing.zalo.uicontrol.PushToTalkSpeechToText$k */
    /* loaded from: classes4.dex */
    public static final class C16501k extends AbstractC28054e7 {
        C16501k() {
        }

        @Override // vg.AbstractC28054e7
        /* renamed from: a */
        public void mo16496a(int i11) {
            PushToTalkSpeechToText.this.m87924P0(true);
            C7853b.Companion.m40150a().m40136j1();
            PushToTalkSpeechToText.this.f83394U = 0;
        }

        @Override // vg.AbstractC28054e7
        /* renamed from: e */
        public void mo16498e() {
            boolean z11 = true;
            PushToTalkSpeechToText.this.m87924P0(true);
            C7853b.a aVar = C7853b.Companion;
            int i11 = 0;
            if (aVar.m40150a().m40117Z() != -1) {
                z11 = false;
            }
            if (z11) {
                PushToTalkSpeechToText.this.f83393T.m88842k(C23212s8.m119606n(AbstractC2807a.icon_02), C23212s8.m119606n(AbstractC2807a.icon_03));
                PushToTalkSpeechToText.this.f83387N.setText(aVar.m40150a().m40109U(PushToTalkSpeechToText.this.getFileRecordName()));
            }
            PushToTalkSpeechToText pushToTalkSpeechToText = PushToTalkSpeechToText.this;
            if (!z11) {
                i11 = aVar.m40150a().m40117Z();
            }
            pushToTalkSpeechToText.f83394U = i11;
            aVar.m40150a().m40136j1();
        }
    }

    static {
        String simpleName = PushToTalkSpeechToText.class.getSimpleName();
        AbstractC19074t.m100207e(simpleName, "getSimpleName(...)");
        f83373s0 = simpleName;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PushToTalkSpeechToText(final Context context) {
        super(context);
        int i11;
        InterfaceC24854k m129210a;
        AbstractC19074t.m100208f(context, "context");
        EnumC16493c enumC16493c = EnumC16493c.f83422p;
        this.f83378E = enumC16493c;
        this.f83379F = EnumC16492b.f83417p;
        if (C17911a.f90436a.m94495e()) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        this.f83382I = i11;
        this.f83389P = true;
        this.f83399c0 = "tap_to_open_voice_board";
        this.f83402f0 = new C18882b();
        m129210a = AbstractC24856m.m129210a(C16495e.f83430q);
        this.f83403g0 = m129210a;
        this.f83404h0 = new C16496f();
        this.f83406j0 = new C16497g();
        View.inflate(context, AbstractC7409c0.push_to_talk_voice_to_text, this);
        View findViewById = findViewById(AbstractC6918a0.background_view);
        AbstractC19074t.m100207e(findViewById, "findViewById(...)");
        FrameLayout frameLayout = (FrameLayout) findViewById;
        this.f83374A = frameLayout;
        frameLayout.setOnClickListener(this);
        this.f83374A.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.zing.zalo.uicontrol.m0
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                boolean m87969v;
                m87969v = PushToTalkSpeechToText.m87969v(view);
                return m87969v;
            }
        });
        View findViewById2 = findViewById(AbstractC6918a0.background_container);
        AbstractC19074t.m100207e(findViewById2, "findViewById(...)");
        this.f83385L = findViewById2;
        View findViewById3 = findViewById(AbstractC6918a0.button_layout_parent);
        AbstractC19074t.m100207e(findViewById3, "findViewById(...)");
        this.f83380G = (BoardButtonLayout) findViewById3;
        getLeftButton().setOnClickListener(this);
        getRightButton().setOnClickListener(this);
        View findViewById4 = findViewById(AbstractC6918a0.text_hint);
        AbstractC19074t.m100207e(findViewById4, "findViewById(...)");
        this.f83415y = (RobotoTextView) findViewById4;
        View findViewById5 = findViewById(AbstractC6918a0.switch_voice_to_text_layout);
        AbstractC19074t.m100207e(findViewById5, "findViewById(...)");
        LinearLayout linearLayout = (LinearLayout) findViewById5;
        this.f83381H = linearLayout;
        linearLayout.setOnClickListener(this);
        linearLayout.setVisibility(i11);
        View findViewById6 = findViewById(AbstractC6918a0.preview_voice_only_layout);
        AbstractC19074t.m100207e(findViewById6, "findViewById(...)");
        FrameLayout frameLayout2 = (FrameLayout) findViewById6;
        this.f83386M = frameLayout2;
        frameLayout2.setClickable(true);
        View findViewById7 = findViewById(AbstractC6918a0.record_play_panel);
        AbstractC19074t.m100207e(findViewById7, "findViewById(...)");
        this.f83392S = findViewById7;
        int i12 = AbstractC23222t7.f112514B;
        findViewById7.setPadding(i12, 0, i12, 0);
        View findViewById8 = findViewById(AbstractC6918a0.wave_form_view);
        AbstractC19074t.m100207e(findViewById8, "findViewById(...)");
        this.f83393T = (WaveformView) findViewById8;
        View findViewById9 = findViewById(AbstractC6918a0.time_duration);
        AbstractC19074t.m100207e(findViewById9, "findViewById(...)");
        this.f83387N = (RobotoTextView) findViewById9;
        View findViewById10 = findViewById(AbstractC6918a0.ic_play_pause);
        AbstractC19074t.m100207e(findViewById10, "findViewById(...)");
        Button button = (Button) findViewById10;
        this.f83416z = button;
        button.setOnClickListener(this);
        View findViewById11 = findViewById(AbstractC6918a0.switch_voice_enable);
        AbstractC19074t.m100207e(findViewById11, "findViewById(...)");
        Switch r42 = (Switch) findViewById11;
        this.f83383J = r42;
        r42.m90686i(AbstractC0924m0.m3836ga(), false);
        View findViewById12 = findViewById(AbstractC6918a0.switch_voice_wrapper);
        AbstractC19074t.m100207e(findViewById12, "findViewById(...)");
        ViewGroup viewGroup = (ViewGroup) findViewById12;
        this.f83384K = viewGroup;
        viewGroup.setOnClickListener(this);
        View findViewById13 = findViewById(AbstractC6918a0.switch_voice_to_text);
        AbstractC19074t.m100207e(findViewById13, "findViewById(...)");
        this.f83388O = (RobotoTextView) findViewById13;
        if (i11 == 8 || m87940Y()) {
            r42.setChecked(false);
            m87929S();
        }
        Button innerButton = getRecordVoiceButton().getInnerButton();
        innerButton.setOnClickListener(this);
        innerButton.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.zing.zalo.uicontrol.n0
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                boolean m87946e0;
                m87946e0 = PushToTalkSpeechToText.m87946e0(PushToTalkSpeechToText.this, context, view);
                return m87946e0;
            }
        });
        innerButton.setOnTouchListener(new View.OnTouchListener() { // from class: com.zing.zalo.uicontrol.o0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean m87947f0;
                m87947f0 = PushToTalkSpeechToText.m87947f0(PushToTalkSpeechToText.this, view, motionEvent);
                return m87947f0;
            }
        });
        m87926Q0(enumC16493c);
        this.f83409m0 = new C16499i();
        this.f83410n0 = new C16501k();
        this.f83411o0 = new C16500j();
        this.f83412p0 = new Runnable() { // from class: com.zing.zalo.uicontrol.p0
            @Override // java.lang.Runnable
            public final void run() {
                PushToTalkSpeechToText.m87915K0(PushToTalkSpeechToText.this);
            }
        };
        this.f83413q0 = new RunnableC16498h();
    }

    /* renamed from: A0 */
    private final void m87897A0() {
        PushToTalkControl.InterfaceC16483d pttListener;
        if (getFileRecordName().length() > 0 && (pttListener = getPttListener()) != null) {
            pttListener.mo60429n(getFileRecordName(), this.f83395V);
        }
        AbstractC18884d.m99015l(this, "csc_voice_send", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B0 */
    public final void m87899B0() {
        this.f83375B = SystemClock.elapsedRealtime();
        this.f83374A.post(this.f83413q0);
        this.f83393T.m88843p();
        getRecordVoiceButton().m88825e();
    }

    /* renamed from: C0 */
    private final void m87901C0() {
        m87924P0(false);
        this.f83393T.m88842k(C23212s8.m119606n(AbstractC2807a.icon_03), C23212s8.m119606n(AbstractC2807a.icon_02));
        C7853b.a aVar = C7853b.Companion;
        aVar.m40150a().m40127f1(this.f83409m0);
        aVar.m40150a().m40092C0(getFileRecordName(), this.f83394U, this.f83410n0, AbstractC23309i.m121977hc());
        AbstractC18884d.m99015l(this, "csc_voice_play_preview", null, 2, null);
        this.f83397a0 = true;
    }

    /* renamed from: D0 */
    private final void m87903D0() {
        setRecording(true);
        setMaxAmplitudeRecorder(0);
        this.f83394U = 0;
        this.f83400d0 = null;
        C3162g c3162g = C3162g.f13363a;
        setFileRecordName(c3162g.m15934t(true));
        PushToTalkControl.InterfaceC16483d pttListener = getPttListener();
        if (pttListener != null) {
            pttListener.mo60432p(getFileRecordName(), this.f83389P, this.f83404h0);
        }
        this.f83401e0 = System.currentTimeMillis();
        c3162g.m15926E(getFileRecordName(), this.f83411o0);
        AbstractC18884d.m99007d(getTrackingLogChatType(), this.f83399c0);
    }

    /* renamed from: E0 */
    private final void m87905E0() {
        this.f83375B = 0L;
        this.f83374A.removeCallbacks(this.f83413q0);
        this.f83393T.m88844q();
        getRecordVoiceButton().m88824d();
    }

    /* renamed from: F0 */
    private final void m87907F0() {
        m87924P0(true);
        this.f83393T.m88842k(C23212s8.m119606n(AbstractC2807a.icon_03), C23212s8.m119606n(AbstractC2807a.icon_02));
        C7853b.Companion.m40150a().m40136j1();
        AbstractC18884d.m99015l(this, "csc_voice_pause_preview", null, 2, null);
    }

    /* renamed from: H0 */
    private final void m87910H0(C18882b c18882b, boolean z11) {
        try {
            this.f83402f0 = c18882b;
            if (m87657j()) {
                if (z11) {
                    m87919M0();
                } else {
                    m87917L0();
                }
            } else {
                this.f83405i0 = 4;
                m87931T();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f83373s0, e11);
            this.f83402f0 = new C18882b();
        }
    }

    /* renamed from: I0 */
    static /* synthetic */ void m87912I0(PushToTalkSpeechToText pushToTalkSpeechToText, C18882b c18882b, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        pushToTalkSpeechToText.m87910H0(c18882b, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K0 */
    public static final void m87915K0(PushToTalkSpeechToText pushToTalkSpeechToText) {
        AbstractC19074t.m100208f(pushToTalkSpeechToText, "this$0");
        pushToTalkSpeechToText.m87917L0();
    }

    /* renamed from: L0 */
    private final void m87917L0() {
        try {
            C3162g.f13363a.m15927F();
            PushToTalkControl.InterfaceC16483d pttListener = getPttListener();
            if (pttListener != null) {
                pttListener.mo60424i();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f83373s0, e11);
        }
    }

    /* renamed from: M0 */
    private final void m87919M0() {
        try {
            removeCallbacks(this.f83412p0);
            postDelayed(this.f83412p0, 200L);
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f83373s0, e11);
        }
    }

    /* renamed from: N */
    private final void m87920N(String str) {
        try {
            if (AbstractC23034c6.m118167n(getContext(), AbstractC23034c6.m118175r()) != 0) {
                PushToTalkControl.InterfaceC16483d pttListener = getPttListener();
                if (pttListener != null) {
                    pttListener.mo60425j();
                    return;
                }
                return;
            }
            if (!m87966t0()) {
                return;
            }
            setRecorderPressing(false);
            setFreeHandMode(true);
            this.f83389P = this.f83383J.isChecked();
            m87926Q0(EnumC16493c.f83423q);
            m87978z0();
            AbstractC18884d.m99015l(this, str, null, 2, null);
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f83373s0, e11);
        }
    }

    /* renamed from: N0 */
    private final void m87921N0() {
        C18888h m99005b = AbstractC18884d.m99005b(this);
        PushToTalkControl.InterfaceC16483d pttListener = getPttListener();
        if (pttListener != null) {
            pttListener.mo60416a3(m99005b);
        }
        if (!C23055e5.m118272g(false)) {
            performHapticFeedback(0);
            PushToTalkControl.InterfaceC16483d pttListener2 = getPttListener();
            if (pttListener2 != null) {
                pttListener2.mo60433p4(-101);
            }
        }
    }

    /* renamed from: O */
    private final int m87922O(View view, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        AbstractC19074t.m100206d(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        Integer valueOf = Integer.valueOf(layoutParams2.gravity);
        if (valueOf.intValue() == -1) {
            valueOf = null;
        }
        if (valueOf != null) {
            i13 = valueOf.intValue();
        } else {
            i13 = 51;
        }
        int measuredWidth = view.getMeasuredWidth();
        int i16 = i13 & 7;
        if (i16 != 1) {
            if (i16 != 3) {
                if (i16 != 5) {
                    return layoutParams2.leftMargin;
                }
                i14 = i12 - measuredWidth;
                i15 = layoutParams2.rightMargin;
            } else {
                return layoutParams2.leftMargin;
            }
        } else {
            i14 = (((i12 - i11) - measuredWidth) / 2) + layoutParams2.leftMargin;
            i15 = layoutParams2.rightMargin;
        }
        return i14 - i15;
    }

    /* renamed from: P */
    private final boolean m87923P() {
        if (!this.f83383J.isEnabled()) {
            PushToTalkControl.InterfaceC16483d pttListener = getPttListener();
            if (pttListener != null) {
                pttListener.mo60433p4(getChatRepo().m2559s());
                return true;
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P0 */
    public final void m87924P0(boolean z11) {
        int i11;
        if (z11) {
            i11 = AbstractC23322a.zds_ic_play_solid_24;
        } else {
            i11 = AbstractC23322a.zds_ic_pause_solid_24;
        }
        Button button = this.f83416z;
        Context context = getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        button.setSupportiveIcon(C27280g.m139658a(context, i11));
    }

    /* renamed from: Q */
    private final boolean m87925Q() {
        if (this.f83402f0.m99003b() == EnumC18887g.f94280q && this.f83402f0.m99002a() == EnumC18886f.f94270p) {
            return true;
        }
        return false;
    }

    /* renamed from: Q0 */
    private final void m87926Q0(EnumC16493c enumC16493c) {
        if (this.f83378E == enumC16493c) {
            return;
        }
        this.f83378E = enumC16493c;
        int i11 = C16494d.f83428b[enumC16493c.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    m87938W0();
                    return;
                }
                return;
            } else {
                m87939X0();
                m87928R0(EnumC16492b.f83417p, true);
                return;
            }
        }
        m87974x0();
        m87972w0();
        PushToTalkControl.InterfaceC16483d pttListener = getPttListener();
        if (pttListener != null) {
            pttListener.mo60421f();
        }
        m87941Y0();
    }

    /* renamed from: R */
    private final void m87927R() {
        getRightButton().setEnabled(false);
        getRightTextView().setTextColor(C23212s8.m119606n(AbstractC2807a.text_03));
    }

    /* renamed from: R0 */
    private final void m87928R0(EnumC16492b enumC16492b, boolean z11) {
        if (this.f83378E == EnumC16493c.f83423q && m87656i()) {
            if (this.f83379F == enumC16492b && !z11) {
                return;
            }
            this.f83379F = enumC16492b;
            int i11 = C16494d.f83429c[enumC16492b.ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        performHapticFeedback(3);
                        m87934U0();
                        return;
                    }
                    return;
                }
                performHapticFeedback(3);
                m87932T0();
                return;
            }
            m87936V0();
        }
    }

    /* renamed from: S */
    private final void m87929S() {
        this.f83383J.setEnabled(false);
        this.f83388O.setTextColor(C23212s8.m119606n(AbstractC2807a.text_03));
    }

    /* renamed from: S0 */
    static /* synthetic */ void m87930S0(PushToTalkSpeechToText pushToTalkSpeechToText, EnumC16492b enumC16492b, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        pushToTalkSpeechToText.m87928R0(enumC16492b, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* renamed from: T */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m87931T() {
        m87942Z0();
        m87968u0();
        boolean z11 = false;
        setRecording(false);
        setFreeHandMode(false);
        setRecorderPressing(false);
        int i11 = C16494d.f83427a[this.f83402f0.m99003b().ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 == 5) {
                            m87926Q0(EnumC16493c.f83424r);
                            m87901C0();
                        }
                    } else {
                        m87921N0();
                    }
                } else {
                    performHapticFeedback(3);
                    m87897A0();
                }
            } else {
                AbstractC18884d.m99015l(this, "csc_voice_cancel", null, 2, null);
                PushToTalkControl.InterfaceC16483d pttListener = getPttListener();
                if (pttListener != null) {
                    pttListener.mo60435r();
                }
            }
            this.f83402f0 = new C18882b();
            if (z11) {
                m87926Q0(EnumC16493c.f83422p);
                return;
            }
            return;
        }
        m87926Q0(EnumC16493c.f83424r);
        z11 = true;
        this.f83402f0 = new C18882b();
        if (z11) {
        }
    }

    /* renamed from: T0 */
    private final void m87932T0() {
        this.f83393T.m88842k(C23212s8.m119606n(AbstractC2807a.danger), -1);
        View view = this.f83392S;
        Context context = getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        view.setBackground(C27280g.m139660c(context, AbstractC16803z.background_wave_form_quick_recording, AbstractC2807a.support_error_page));
        AbstractC26423o.m136269c(this.f83415y);
        this.f83415y.setTextColor(C23212s8.m119607o(getContext(), AbstractC2807a.danger));
        this.f83415y.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_text_hint_release_to_cancel_voice_new_ui));
        BoardRecordButton recordVoiceButton = getRecordVoiceButton();
        Context context2 = getContext();
        AbstractC19074t.m100207e(context2, "getContext(...)");
        recordVoiceButton.setSupportiveIcon(C27280g.m139660c(context2, AbstractC23322a.zds_ic_delete_solid_32, AbstractC2807a.icon_04));
        getRecordVoiceButton().m88823b(AbstractC8915g0.ButtonLargeVoice_Primary_Red);
        getLeftButton().m90539c(AbstractC8915g0.ButtonLargeVoice_Secondary_Red);
        getLeftButton().setSupportiveIcon(AbstractC23322a.zds_ic_delete_solid_32);
        getRightButton().m90539c(AbstractC8915g0.ButtonLargeVoice_Secondary_Grey);
        getRightButton().setSupportiveIcon(AbstractC23322a.zds_ic_lock_solid_24);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: U */
    public final void m87933U() {
        getRightButton().setEnabled(true);
        getRightTextView().setTextColor(C23212s8.m119606n(AbstractC2807a.text_01));
    }

    /* renamed from: U0 */
    private final void m87934U0() {
        this.f83393T.m88842k(C23212s8.m119606n(AbstractC2807a.selected), -1);
        View view = this.f83392S;
        Context context = getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        view.setBackground(C27280g.m139660c(context, AbstractC16803z.background_wave_form_quick_recording, AbstractC2807a.support_informative_page));
        AbstractC26423o.m136269c(this.f83415y);
        this.f83415y.setTextColor(C23212s8.m119607o(getContext(), AbstractC2807a.link_01));
        this.f83415y.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_release_to_record_hands_free));
        BoardRecordButton recordVoiceButton = getRecordVoiceButton();
        Context context2 = getContext();
        AbstractC19074t.m100207e(context2, "getContext(...)");
        recordVoiceButton.setSupportiveIcon(C27280g.m139660c(context2, AbstractC23322a.zds_ic_lock_solid_24, AbstractC2807a.icon_04));
        getRecordVoiceButton().m88823b(AbstractC8915g0.ButtonLargeVoice_Primary_Blue);
        getLeftButton().m90539c(AbstractC8915g0.ButtonLargeVoice_Secondary_Grey);
        getLeftButton().setSupportiveIcon(AbstractC23322a.zds_ic_delete_solid_32);
        getRightButton().m90539c(AbstractC8915g0.ButtonLargeVoice_Secondary_Blue);
        getRightButton().setSupportiveIcon(AbstractC23322a.zds_ic_lock_solid_24);
    }

    /* renamed from: V */
    private final void m87935V(boolean z11) {
        C18882b c18882b;
        if (z11) {
            c18882b = new C18882b(EnumC18887g.f94284u);
        } else {
            c18882b = new C18882b(EnumC18887g.f94283t);
        }
        m87912I0(this, c18882b, false, 2, null);
    }

    /* renamed from: V0 */
    private final void m87936V0() {
        int i11;
        this.f83393T.m88842k(C23212s8.m119606n(AbstractC2807a.selected), -1);
        View view = this.f83392S;
        Context context = getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        view.setBackground(C27280g.m139660c(context, AbstractC16803z.background_wave_form_quick_recording, AbstractC2807a.support_informative_page));
        AbstractC26423o.m136269c(this.f83415y);
        this.f83415y.setTextColor(C23212s8.m119607o(getContext(), AbstractC2807a.text_02));
        RobotoTextView robotoTextView = this.f83415y;
        if (this.f83389P) {
            i11 = AbstractC8020f0.str_text_hint_release_to_edit_text;
        } else {
            i11 = AbstractC8020f0.str_text_hint_release_to_send_quick_voice;
        }
        robotoTextView.setText(AbstractC23136l9.m118743r0(i11));
        BoardRecordButton recordVoiceButton = getRecordVoiceButton();
        Context context2 = getContext();
        AbstractC19074t.m100207e(context2, "getContext(...)");
        recordVoiceButton.setSupportiveIcon(C27280g.m139660c(context2, AbstractC16803z.ic_mic_voice_32, AbstractC2807a.icon_04));
        getRecordVoiceButton().m88823b(AbstractC8915g0.ButtonLargeVoice_Primary_Default);
        getLeftButton().m90539c(AbstractC8915g0.ButtonLargeVoice_Secondary_Grey);
        getLeftButton().setSupportiveIcon(AbstractC23322a.zds_ic_delete_solid_32);
        getRightButton().m90539c(AbstractC8915g0.ButtonLargeVoice_Secondary_Grey);
        getRightButton().setSupportiveIcon(AbstractC23322a.zds_ic_lock_solid_24);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: W */
    public final void m87937W(int i11, int i12) {
        try {
            m87905E0();
            m87957o0(i12, i11);
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f83373s0, e11);
        }
    }

    /* renamed from: W0 */
    private final void m87938W0() {
        if (this.f83389P) {
            return;
        }
        m87976y0(false, true);
        AbstractC26423o.m136269c(getLeftButton());
        AbstractC26423o.m136269c(getLeftTextView());
        getTextSend().setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_send));
        AbstractC26423o.m136269c(getTextSend());
        AbstractC26423o.m136267a(this.f83415y);
        BoardRecordButton recordVoiceButton = getRecordVoiceButton();
        Context context = getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        recordVoiceButton.setSupportiveIcon(C27280g.m139660c(context, AbstractC23322a.zds_ic_send_solid_32, AbstractC2807a.icon_04));
        setBackgroundVisibility(true);
        AbstractC18884d.m99015l(this, "csc_voice_preview", null, 2, null);
        AbstractC26423o.m136267a(this.f83381H);
        AbstractC26423o.m136269c(this.f83386M);
        this.f83393T.setMode(EnumC18885e.f94267q);
        this.f83393T.m88840a();
        this.f83393T.m88842k(C23212s8.m119606n(AbstractC2807a.icon_02), C23212s8.m119606n(AbstractC2807a.icon_03));
        AbstractC26423o.m136269c(this.f83416z);
        AbstractC26423o.m136267a(getRightButton());
        AbstractC26423o.m136267a(getRightTextView());
        this.f83380G.setTwoButtonMode(true);
    }

    /* renamed from: X0 */
    private final void m87939X0() {
        int i11;
        int i12;
        int i13;
        int i14 = 0;
        m87976y0(false, false);
        AbstractC26423o.m136269c(getLeftButton());
        if (m87656i()) {
            AbstractC26423o.m136267a(getLeftTextView());
            AbstractC26423o.m136269c(getRightButton());
            AbstractC26423o.m136267a(getRightTextView());
            AbstractC26423o.m136267a(this.f83415y);
        } else {
            AbstractC26423o.m136269c(getLeftTextView());
            Button rightButton = getRightButton();
            if (this.f83389P) {
                i11 = 8;
            } else {
                i11 = 0;
            }
            rightButton.setVisibility(i11);
            getRightTextView().setVisibility(getRightButton().getVisibility());
            AbstractC26423o.m136269c(this.f83415y);
            this.f83415y.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_record_free_hand_hint));
        }
        if (this.f83389P) {
            BoardRecordButton recordVoiceButton = getRecordVoiceButton();
            Context context = getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            if (m87656i()) {
                i13 = AbstractC16803z.ic_mic_voice_32;
            } else {
                i13 = AbstractC23322a.zds_ic_stop_solid_32;
            }
            recordVoiceButton.setSupportiveIcon(C27280g.m139660c(context, i13, AbstractC2807a.icon_04));
            getTextSend().setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_stop_record_voice));
            RobotoTextView textSend = getTextSend();
            if (m87656i()) {
                i14 = 4;
            }
            textSend.setVisibility(i14);
        } else {
            Button rightButton2 = getRightButton();
            Context context2 = getContext();
            AbstractC19074t.m100207e(context2, "getContext(...)");
            rightButton2.setSupportiveIcon(C27280g.m139660c(context2, AbstractC16803z.ic_preview_voice_32, AbstractC2807a.icon_04));
            getRightTextView().setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_preview_listen_voice_record));
            AbstractC26423o.m136269c(this.f83386M);
            this.f83393T.setMode(EnumC18885e.f94266p);
            this.f83393T.m88842k(C23212s8.m119606n(AbstractC2807a.selected), -1);
            View view = this.f83392S;
            Context context3 = getContext();
            AbstractC19074t.m100207e(context3, "getContext(...)");
            view.setBackground(C27280g.m139660c(context3, AbstractC16803z.background_wave_form_quick_recording, AbstractC2807a.support_informative_page));
            AbstractC26423o.m136267a(this.f83416z);
            BoardRecordButton recordVoiceButton2 = getRecordVoiceButton();
            Context context4 = getContext();
            AbstractC19074t.m100207e(context4, "getContext(...)");
            if (m87656i()) {
                i12 = AbstractC16803z.ic_mic_voice_32;
            } else {
                i12 = AbstractC23322a.zds_ic_send_solid_32;
            }
            recordVoiceButton2.setSupportiveIcon(C27280g.m139660c(context4, i12, AbstractC2807a.icon_04));
            RobotoTextView textSend2 = getTextSend();
            if (m87656i()) {
                i14 = 4;
            }
            textSend2.setVisibility(i14);
            getTextSend().setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_send));
        }
        setBackgroundVisibility(true);
        AbstractC26423o.m136267a(this.f83381H);
        this.f83396W = m87656i();
    }

    /* renamed from: Y */
    private final boolean m87940Y() {
        if (getChatRepo().m2559s() != 102 && getChatRepo().m2559s() != 103 && getChatRepo().m2559s() != 104 && C3162g.f13363a.m15937x()) {
            return false;
        }
        return true;
    }

    /* renamed from: Y0 */
    private final void m87941Y0() {
        m87976y0(true, true);
        BoardRecordButton recordVoiceButton = getRecordVoiceButton();
        Context context = getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        recordVoiceButton.setSupportiveIcon(C27280g.m139660c(context, AbstractC16803z.ic_mic_voice_32, AbstractC2807a.icon_04));
        setBackgroundVisibility(false);
        AbstractC26423o.m136269c(this.f83415y);
        this.f83381H.setVisibility(this.f83382I);
        AbstractC26423o.m136267a(getLeftButton());
        AbstractC26423o.m136267a(getLeftTextView());
        getTextSend().setVisibility(4);
        AbstractC26423o.m136267a(getRightButton());
        AbstractC26423o.m136267a(getRightTextView());
        m87927R();
        if (m87940Y()) {
            this.f83383J.setChecked(false);
            m87929S();
        }
        AbstractC26423o.m136267a(this.f83386M);
        this.f83393T.m88841c();
        this.f83380G.setTwoButtonMode(false);
    }

    /* renamed from: Z0 */
    private final void m87942Z0() {
        int i11;
        if (this.f83405i0 != 0 && this.f83402f0.m99003b() != EnumC18887g.f94279p) {
            long j11 = this.f83401e0;
            int i12 = this.f83405i0;
            int i13 = this.f83395V;
            boolean m87652e = m87652e();
            boolean z11 = this.f83389P;
            EnumC18886f stopS2TEntryPoint$app_release = getStopS2TEntryPoint$app_release();
            String str = this.f83400d0;
            if (str != null) {
                i11 = str.length();
            } else {
                i11 = 0;
            }
            C24559a.m127933c("Voice Record", "Complete. startTime: " + j11 + ", reason: " + i12 + ", dur: " + i13 + ", freehand: " + m87652e + ", stt: " + z11 + ", sttEp: " + stopS2TEntryPoint$app_release + ", sttLen: " + i11);
            if (this.f83389P) {
                int i14 = this.f83405i0;
                if (i14 != 2) {
                    if (i14 != 3) {
                        AbstractC20887g.m109247y(240319005, 0L, 0L, 0L);
                    } else if (this.f83408l0 > 0) {
                        AbstractC20887g.m109247y(240319005, 0L, 0L, SystemClock.elapsedRealtime() - this.f83408l0);
                    }
                } else {
                    AbstractC20887g.m109239q(240319005, 0L, 0L, 800L);
                }
            }
        }
        this.f83405i0 = 0;
    }

    /* renamed from: a0 */
    private final boolean m87943a0(float f11, float f12) {
        if (getLeftButton().getVisibility() != 0) {
            return false;
        }
        float top = (((f12 + getRecordVoiceButton().getInnerButton().getTop()) + getRecordVoiceButton().getTop()) + this.f83380G.getTop()) - getVisibleLayoutContainer().getTop();
        if (f11 >= 0.0f || top <= 0.0f) {
            return false;
        }
        return true;
    }

    /* renamed from: b0 */
    private final boolean m87944b0(float f11, float f12) {
        if (getRightButton().getVisibility() != 0) {
            return false;
        }
        float top = (((f12 + getRecordVoiceButton().getInnerButton().getTop()) + getRecordVoiceButton().getTop()) + this.f83380G.getTop()) - getVisibleLayoutContainer().getTop();
        if (f11 <= getRecordVoiceButton().getInnerButton().getWidth() || top <= 0.0f) {
            return false;
        }
        return true;
    }

    /* renamed from: d0 */
    private final boolean m87945d0() {
        if (this.f83402f0.m99003b() != EnumC18887g.f94279p) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e0 */
    public static final boolean m87946e0(PushToTalkSpeechToText pushToTalkSpeechToText, Context context, View view) {
        AbstractC19074t.m100208f(pushToTalkSpeechToText, "this$0");
        AbstractC19074t.m100208f(context, "$context");
        if (pushToTalkSpeechToText.f83378E != EnumC16493c.f83422p) {
            return false;
        }
        if (AbstractC23034c6.m118167n(context, AbstractC23034c6.m118175r()) != 0) {
            PushToTalkControl.InterfaceC16483d pttListener = pushToTalkSpeechToText.getPttListener();
            if (pttListener != null) {
                pttListener.mo60425j();
            }
            return false;
        }
        if (!pushToTalkSpeechToText.m87966t0()) {
            long uptimeMillis = SystemClock.uptimeMillis();
            view.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            return false;
        }
        pushToTalkSpeechToText.setRecorderPressing(true);
        pushToTalkSpeechToText.setFreeHandMode(false);
        pushToTalkSpeechToText.f83389P = pushToTalkSpeechToText.f83383J.isChecked();
        pushToTalkSpeechToText.f83399c0 = "tap_to_open_voice_board";
        pushToTalkSpeechToText.m87926Q0(EnumC16493c.f83423q);
        pushToTalkSpeechToText.m87978z0();
        AbstractC18884d.m99015l(pushToTalkSpeechToText, "csc_voice_board_long_hold", null, 2, null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f0 */
    public static final boolean m87947f0(PushToTalkSpeechToText pushToTalkSpeechToText, View view, MotionEvent motionEvent) {
        AbstractC19074t.m100208f(pushToTalkSpeechToText, "this$0");
        AbstractC19074t.m100205c(motionEvent);
        return pushToTalkSpeechToText.m87950i0(motionEvent);
    }

    /* renamed from: g0 */
    private final void m87948g0(View view, int i11, int i12, int i13, int i14) {
        int max;
        int bottom;
        if (view.getVisibility() == 8) {
            return;
        }
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i15 = 0;
        if (!AbstractC19074t.m100204b(view, this.f83374A)) {
            if (AbstractC19074t.m100204b(view, this.f83385L)) {
                max = i13 - i14;
            } else {
                if (AbstractC19074t.m100204b(view, this.f83380G)) {
                    i15 = m87922O(view, i11, i12);
                    bottom = i13 - (((i14 - measuredHeight) * 76) / 134);
                } else if (AbstractC19074t.m100204b(view, this.f83415y)) {
                    int top = this.f83380G.getTop() + getRecordVoiceButton().getMaxPadding();
                    i15 = m87922O(view, i11, i12);
                    max = (top - ((((i14 - measuredHeight) - (i13 - top)) * 16) / 40)) - measuredHeight;
                } else if (AbstractC19074t.m100204b(view, this.f83381H)) {
                    i15 = m87922O(view, i11, i12);
                    bottom = i13 - ((((i13 - measuredHeight) - this.f83380G.getBottom()) * 10) / 34);
                } else if (AbstractC19074t.m100204b(view, this.f83386M)) {
                    i15 = m87922O(view, i11, i12);
                    max = Math.max(this.f83380G.getTop() - (((i13 - this.f83380G.getBottom()) * 48) / 76), this.f83374A.getBottom()) - measuredHeight;
                }
                max = bottom - measuredHeight;
            }
            view.layout(i15, max, measuredWidth + i15, measuredHeight + max);
        }
        max = 0;
        view.layout(i15, max, measuredWidth + i15, measuredHeight + max);
    }

    private final C0872f getChatRepo() {
        return (C0872f) this.f83403g0.getValue();
    }

    private final Button getLeftButton() {
        return this.f83380G.getLeftButton();
    }

    private final RobotoTextView getLeftTextView() {
        return this.f83380G.getLeftTextView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BoardRecordButton getRecordVoiceButton() {
        return this.f83380G.getRecordButton();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Button getRightButton() {
        return this.f83380G.getRightButton();
    }

    private final RobotoTextView getRightTextView() {
        return this.f83380G.getRightTextView();
    }

    private final RobotoTextView getTextSend() {
        return this.f83380G.getRecordText();
    }

    private final View getVisibleLayoutContainer() {
        return this.f83389P ? this.f83385L : this.f83386M;
    }

    /* renamed from: h0 */
    private final void m87949h0() {
        if (this.f83389P) {
            setRecordCancelled(true);
            m87912I0(this, new C18882b(EnumC18887g.f94280q, EnumC18886f.f94276v), false, 2, null);
        } else {
            PushToTalkControl.InterfaceC16483d pttListener = getPttListener();
            if (pttListener != null) {
                pttListener.mo60419d();
            }
        }
    }

    /* renamed from: i0 */
    private final boolean m87950i0(MotionEvent motionEvent) {
        int action;
        boolean z11 = false;
        try {
            action = motionEvent.getAction();
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f83373s0, e11);
        }
        if (action != 1) {
            if (action != 2) {
                if (action != 3) {
                    if (action != 6) {
                    }
                } else {
                    z11 = m87951j0();
                }
            } else {
                z11 = m87952k0(motionEvent);
            }
            return z11;
        }
        z11 = m87953l0();
        return z11;
    }

    /* renamed from: j0 */
    private final boolean m87951j0() {
        if (m87656i()) {
            m87961q0();
            return true;
        }
        return false;
    }

    /* renamed from: k0 */
    private final boolean m87952k0(MotionEvent motionEvent) {
        float x11 = motionEvent.getX();
        float y11 = motionEvent.getY();
        if (!m87656i()) {
            return false;
        }
        boolean m87943a0 = m87943a0(x11, y11);
        boolean m87944b0 = m87944b0(x11, y11);
        if (m87943a0) {
            m87930S0(this, EnumC16492b.f83418q, false, 2, null);
            return true;
        }
        if (m87944b0) {
            m87930S0(this, EnumC16492b.f83419r, false, 2, null);
            return true;
        }
        m87930S0(this, EnumC16492b.f83417p, false, 2, null);
        return true;
    }

    /* renamed from: l0 */
    private final boolean m87953l0() {
        C18882b c18882b;
        if (m87656i()) {
            int i11 = C16494d.f83429c[this.f83379F.ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        setRecorderPressing(false);
                        setFreeHandMode(true);
                        m87939X0();
                        AbstractC18884d.m99015l(this, "csc_voice_board_long_hold_hands_free", null, 2, null);
                    }
                } else {
                    mo87650c();
                }
            } else {
                if (this.f83389P) {
                    c18882b = new C18882b(EnumC18887g.f94280q, EnumC18886f.f94270p);
                } else {
                    c18882b = new C18882b(EnumC18887g.f94282s);
                }
                m87912I0(this, c18882b, false, 2, null);
            }
        }
        return false;
    }

    /* renamed from: m0 */
    private final void m87954m0() {
        if (C7853b.Companion.m40150a().m40137k0()) {
            m87907F0();
        } else {
            m87901C0();
        }
    }

    /* renamed from: n0 */
    private final void m87956n0() {
        C18882b c18882b;
        int i11 = C16494d.f83428b[this.f83378E.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    C7853b.Companion.m40150a().m40136j1();
                    m87912I0(this, new C18882b(EnumC18887g.f94282s), false, 2, null);
                    return;
                }
                return;
            }
            if (m87652e()) {
                if (this.f83389P) {
                    c18882b = new C18882b(EnumC18887g.f94280q, EnumC18886f.f94270p);
                } else {
                    c18882b = new C18882b(EnumC18887g.f94282s);
                }
                m87912I0(this, c18882b, false, 2, null);
                return;
            }
            return;
        }
        this.f83399c0 = "tap_to_open_voice_board";
        m87920N("csc_voice_board_tap_to_record");
    }

    /* renamed from: o0 */
    private final void m87957o0(int i11, int i12) {
        boolean z11;
        this.f83395V = i11;
        if (i12 == -2 && (C3162g.f13363a.m15936v() < 1000 || this.f83402f0.m99003b() == EnumC18887g.f94281r || this.f83402f0.m99003b() == EnumC18887g.f94280q)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (i12 != 0 && !z11) {
            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_record_error));
            this.f83402f0 = new C18882b(EnumC18887g.f94281r);
        } else if (!this.f83389P && i11 < 1000) {
            if (!m87654g()) {
                performHapticFeedback(0);
                PushToTalkControl.InterfaceC16483d pttListener = getPttListener();
                if (pttListener != null) {
                    pttListener.mo60434q();
                }
            }
            this.f83402f0 = new C18882b(EnumC18887g.f94281r);
        }
        if (m87925Q()) {
            m87968u0();
            this.f83408l0 = SystemClock.elapsedRealtime();
            this.f83407k0 = true;
            final InterfaceC18494a interfaceC18494a = this.f83406j0;
            postDelayed(new Runnable() { // from class: com.zing.zalo.uicontrol.q0
                @Override // java.lang.Runnable
                public final void run() {
                    PushToTalkSpeechToText.m87959p0(InterfaceC18494a.this);
                }
            }, 800L);
            return;
        }
        this.f83405i0 = 1;
        m87931T();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p0 */
    public static final void m87959p0(InterfaceC18494a interfaceC18494a) {
        AbstractC19074t.m100208f(interfaceC18494a, "$tmp0");
        interfaceC18494a.mo12V4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q0 */
    public final void m87961q0() {
        C18882b c18882b;
        EnumC18886f enumC18886f;
        try {
            if (!m87657j()) {
                return;
            }
            setRecordCancelled(true);
            if (m87945d0()) {
                return;
            }
            if (this.f83389P) {
                if (this.f83391R) {
                    enumC18886f = EnumC18886f.f94273s;
                } else {
                    enumC18886f = EnumC18886f.f94272r;
                }
                c18882b = new C18882b(EnumC18887g.f94280q, enumC18886f);
            } else {
                c18882b = new C18882b(EnumC18887g.f94283t);
            }
            m87912I0(this, c18882b, false, 2, null);
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f83373s0, e11);
        }
    }

    /* renamed from: r0 */
    private final void m87963r0() {
        if (this.f83378E == EnumC16493c.f83423q && !this.f83389P) {
            m87935V(C17911a.f90436a.m94494d());
        }
    }

    /* renamed from: s0 */
    private final void m87965s0() {
        boolean z11;
        if (m87923P()) {
            return;
        }
        boolean z12 = !this.f83383J.isChecked();
        PushToTalkControl.InterfaceC16483d pttListener = getPttListener();
        if (pttListener != null) {
            z11 = pttListener.mo60414X1();
        } else {
            z11 = false;
        }
        this.f83383J.setChecked(z12);
        AbstractC0924m0.m3663ah(z12);
        C17915e.f90453a.m94517e(getTrackingLogChatType(), z12, z11);
    }

    private final void setBackgroundVisibility(boolean z11) {
        int i11;
        int i12;
        FrameLayout frameLayout = this.f83374A;
        if (z11) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        frameLayout.setVisibility(i11);
        if (!z11) {
            return;
        }
        if (this.f83389P) {
            i12 = AbstractC16801x.transparent;
        } else {
            i12 = AbstractC28292b.blk_a40;
        }
        this.f83374A.setBackgroundColor(AbstractC23136l9.m118639A(i12));
    }

    /* renamed from: t0 */
    private final boolean m87966t0() {
        if (!m87655h() || m87945d0()) {
            return false;
        }
        if (!m87657j()) {
            if (C3162g.f13363a.m15938y()) {
                AbstractC23350e.m122777g("PTTController: " + getContext().getString(AbstractC8020f0.str_warning_record_voice_while_mic_busy), new Object[0]);
                ToastUtils.m89266n(AbstractC8020f0.str_warning_record_voice_while_mic_busy, new Object[0]);
                return false;
            }
            if (C20024r.m103941j() || C7853b.Companion.m40150a().m40133i0()) {
                PushToTalkControl.C16482c.m87895b();
                return false;
            }
        }
        if (C26664o.m136836a().m136838c()) {
            AbstractC23350e.m122774d(f83373s0, "Discard recording because sticker lua is playing");
            return false;
        }
        if (this.f83383J.isChecked() && !C23055e5.m118272g(false)) {
            PushToTalkControl.InterfaceC16483d pttListener = getPttListener();
            if (pttListener != null) {
                pttListener.mo60433p4(-101);
            }
            return false;
        }
        PushToTalkControl.InterfaceC16483d pttListener2 = getPttListener();
        if (pttListener2 == null) {
            return false;
        }
        return pttListener2.mo60427l();
    }

    /* renamed from: u0 */
    private final void m87968u0() {
        final InterfaceC18494a interfaceC18494a = this.f83406j0;
        removeCallbacks(new Runnable() { // from class: com.zing.zalo.uicontrol.l0
            @Override // java.lang.Runnable
            public final void run() {
                PushToTalkSpeechToText.m87970v0(InterfaceC18494a.this);
            }
        });
        this.f83407k0 = false;
        this.f83408l0 = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public static final boolean m87969v(View view) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v0 */
    public static final void m87970v0(InterfaceC18494a interfaceC18494a) {
        AbstractC19074t.m100208f(interfaceC18494a, "$tmp0");
        interfaceC18494a.mo12V4();
    }

    /* renamed from: w0 */
    private final void m87972w0() {
        this.f83391R = false;
        setRecordCancelled(false);
    }

    /* renamed from: x0 */
    private final void m87974x0() {
        this.f83395V = 0;
        this.f83396W = false;
        this.f83397a0 = false;
        this.f83398b0 = 0;
    }

    /* renamed from: y0 */
    private final void m87976y0(boolean z11, boolean z12) {
        this.f83379F = EnumC16492b.f83417p;
        this.f83393T.m88842k(C23212s8.m119606n(AbstractC2807a.icon_02), C23212s8.m119606n(AbstractC2807a.icon_03));
        View view = this.f83392S;
        Context context = getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        view.setBackground(C27280g.m139658a(context, AbstractC16803z.background_wave_form_preview));
        AbstractC26423o.m136267a(this.f83415y);
        this.f83415y.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_hold_to_record));
        this.f83415y.setTextColor(C23212s8.m119607o(getContext(), AbstractC2807a.text_02));
        getRecordVoiceButton().m88823b(AbstractC8915g0.ButtonLargeVoice_Primary_Default);
        if (!z11) {
            getLeftButton().m90539c(AbstractC8915g0.ButtonLargeVoice_Secondary_Default);
            getLeftButton().setSupportiveIcon(AbstractC23322a.zds_ic_delete_solid_32);
        }
        if (!z12) {
            getRightButton().m90539c(AbstractC8915g0.ButtonLargeVoice_Secondary_Default);
            getRightButton().setSupportiveIcon(AbstractC16803z.ic_preview_voice_32);
        }
    }

    /* renamed from: z0 */
    private final void m87978z0() {
        try {
            C23046d7.m118248k(new SensitiveData("micro_csc_voice_record", "comm_csc", null, 4, null), "micro");
            PushToTalkControl.InterfaceC16483d pttListener = getPttListener();
            if (pttListener != null) {
                pttListener.mo60428m();
            }
            if (AbstractC23238v2.m119727l()) {
                if (AbstractC23238v2.m119726k()) {
                    m87903D0();
                    if (!m87656i()) {
                        performHapticFeedback(3);
                    }
                    C7853b.Companion.m40150a().m40096K0();
                } else {
                    ToastUtils.showMess(MainApplication.Companion.m35500c().getString(AbstractC8020f0.str_alertmemtorecord));
                }
            } else {
                ToastUtils.m89266n(AbstractC8020f0.error_sdcard, new Object[0]);
            }
        } catch (SensitiveDataException unused) {
            Context context = getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            C23046d7.m118241d(context).mo13822K();
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f83373s0, e11);
        }
        if (!m87657j()) {
            m87912I0(this, new C18882b(EnumC18887g.f94281r), false, 2, null);
        }
    }

    /* renamed from: G0 */
    public final void m87979G0() {
        if (this.f83378E == EnumC16493c.f83424r) {
            C7853b.Companion.m40150a().m40136j1();
        }
    }

    /* renamed from: J0 */
    public final void m87980J0() {
        m87910H0(new C18882b(EnumC18887g.f94280q, EnumC18886f.f94275u), false);
    }

    /* renamed from: O0 */
    public final void m87981O0(String str, boolean z11) {
        int i11;
        AbstractC19074t.m100208f(str, "text");
        if (this.f83389P && m87657j() && !AbstractC19074t.m100204b(str, this.f83400d0) && this.f83402f0.m99002a() != EnumC18886f.f94275u) {
            this.f83400d0 = str;
            PushToTalkControl.InterfaceC16483d pttListener = getPttListener();
            if (pttListener != null) {
                pttListener.mo60431o2(str);
            }
            PushToTalkControl.InterfaceC16483d pttListener2 = getPttListener();
            if (pttListener2 != null) {
                i11 = pttListener2.mo60426k();
            } else {
                i11 = 0;
            }
            if (i11 != this.f83390Q) {
                this.f83390Q = i11;
                requestLayout();
            }
        }
        if (this.f83407k0 && z11) {
            this.f83405i0 = 3;
            m87931T();
        }
    }

    /* renamed from: X */
    public final boolean m87982X() {
        if (this.f83374A.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.uicontrol.AbstractPushToTalkControl
    /* renamed from: a */
    public void mo87648a() {
        this.f83399c0 = "csc_chatbar";
        m87920N("csc_chat_bar_long_press_to_hands_free");
    }

    @Override // com.zing.zalo.uicontrol.AbstractPushToTalkControl
    /* renamed from: b */
    public void mo87649b() {
        m87961q0();
    }

    @Override // com.zing.zalo.uicontrol.AbstractPushToTalkControl
    /* renamed from: c */
    public void mo87650c() {
        C18882b c18882b;
        C7853b.Companion.m40150a().m40136j1();
        setRecordCancelled(true);
        if (this.f83389P) {
            c18882b = new C18882b(EnumC18887g.f94280q, EnumC18886f.f94271q);
        } else {
            c18882b = new C18882b(EnumC18887g.f94281r);
        }
        m87912I0(this, c18882b, false, 2, null);
    }

    /* renamed from: c0 */
    public final boolean m87983c0() {
        return this.f83389P;
    }

    @Override // com.zing.zalo.uicontrol.AbstractPushToTalkControl
    /* renamed from: d */
    public void mo87651d() {
        try {
            setVisibility(8);
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f83373s0, e11);
        }
    }

    @Override // com.zing.zalo.uicontrol.AbstractPushToTalkControl
    /* renamed from: f */
    public boolean mo87653f() {
        if (this.f83378E == EnumC16493c.f83424r) {
            return true;
        }
        return false;
    }

    public final int getDuration$app_release() {
        return this.f83395V;
    }

    public final String getEntrypoint$app_release() {
        return this.f83399c0;
    }

    public final int getPreviewedProgressLog$app_release() {
        return this.f83398b0;
    }

    public final boolean getSessionLongHoldLog$app_release() {
        return this.f83396W;
    }

    public final boolean getSessionPreviewLog$app_release() {
        return this.f83397a0;
    }

    public final String getSpeechToText$app_release() {
        return this.f83400d0;
    }

    public final EnumC18886f getStopS2TEntryPoint$app_release() {
        return this.f83402f0.m99002a();
    }

    @Override // com.zing.zalo.uicontrol.AbstractPushToTalkControl
    /* renamed from: k */
    public void mo87658k() {
        try {
            if (!m87657j()) {
                m87905E0();
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
                setRecordCancelled(true);
                if (z11 && this.f83389P) {
                    m87912I0(this, new C18882b(EnumC18887g.f94280q, EnumC18886f.f94274t), false, 2, null);
                } else {
                    m87961q0();
                }
            }
            m87905E0();
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f83373s0, e11);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        AbstractC19074t.m100208f(view, C20218v.f100059b);
        try {
            if (!m87656i() && view.getVisibility() == 0 && System.currentTimeMillis() - this.f83414r0 >= 200) {
                this.f83414r0 = System.currentTimeMillis();
                if (AbstractC19074t.m100204b(view, getRecordVoiceButton().getInnerButton())) {
                    m87956n0();
                } else if (AbstractC19074t.m100204b(view, getLeftButton())) {
                    mo87650c();
                } else if (AbstractC19074t.m100204b(view, getRightButton())) {
                    m87963r0();
                } else if (AbstractC19074t.m100204b(view, this.f83374A)) {
                    m87949h0();
                } else if (AbstractC19074t.m100204b(view, this.f83416z)) {
                    m87954m0();
                } else if (AbstractC19074t.m100204b(view, this.f83384K)) {
                    m87965s0();
                } else if (AbstractC19074t.m100204b(view, this.f83381H)) {
                    m87923P();
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f83373s0, e11);
        }
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        EnumC16493c enumC16493c;
        if (i11 == 4 && ((enumC16493c = this.f83378E) == EnumC16493c.f83424r || enumC16493c == EnumC16493c.f83423q)) {
            if (this.f83389P) {
                m87961q0();
                return true;
            }
            PushToTalkControl.InterfaceC16483d pttListener = getPttListener();
            if (pttListener != null) {
                pttListener.mo60419d();
                return true;
            }
            return true;
        }
        return super.onKeyUp(i11, keyEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        List m131505m;
        try {
            int m122007i5 = AbstractC23309i.m122007i5(getContext());
            if (getMeasuredHeight() > this.f83377D) {
                m122007i5 = getMeasuredHeight() - this.f83377D;
            }
            m131505m = AbstractC25368s.m131505m(this.f83374A, this.f83385L, this.f83380G, this.f83415y, this.f83381H, this.f83386M);
            Iterator it = m131505m.iterator();
            while (it.hasNext()) {
                m87948g0((View) it.next(), i11, i13, i14, m122007i5);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        int i13;
        try {
            int size = View.MeasureSpec.getSize(i11);
            int size2 = View.MeasureSpec.getSize(i12);
            int m122007i5 = AbstractC23309i.m122007i5(getContext());
            setMeasuredDimension(size, size2);
            this.f83377D = size2;
            int childCount = getChildCount();
            int i14 = 0;
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt = getChildAt(i15);
                if (childAt.getVisibility() != 8) {
                    if (AbstractC19074t.m100204b(childAt, this.f83374A)) {
                        int i16 = this.f83377D - m122007i5;
                        if (this.f83389P) {
                            PushToTalkControl.InterfaceC16483d pttListener = getPttListener();
                            if (pttListener != null) {
                                i13 = pttListener.mo60423h();
                            } else {
                                i13 = 0;
                            }
                            i16 -= i13;
                        }
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(i16, 1073741824));
                    } else if (AbstractC19074t.m100204b(childAt, this.f83385L)) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(m122007i5, 1073741824));
                    } else if (AbstractC19074t.m100204b(childAt, this.f83386M)) {
                        measureChildWithMargins(childAt, View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), 0, View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE), 0);
                    } else {
                        measureChildWithMargins(childAt, View.MeasureSpec.makeMeasureSpec(size, 0), 0, View.MeasureSpec.makeMeasureSpec(size2, 0), 0);
                    }
                }
            }
            PushToTalkControl.InterfaceC16483d pttListener2 = getPttListener();
            if (pttListener2 != null) {
                i14 = pttListener2.mo60426k();
            }
            this.f83390Q = i14;
        } catch (Exception unused) {
            super.onMeasure(i11, i12);
        }
    }

    public final void setDuration$app_release(int i11) {
        this.f83395V = i11;
    }

    public final void setEntrypoint$app_release(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f83399c0 = str;
    }

    public final void setPreviewedProgressLog$app_release(int i11) {
        this.f83398b0 = i11;
    }

    public final void setRecordingSpeechToText(boolean z11) {
        this.f83389P = z11;
    }

    public final void setSessionLongHoldLog$app_release(boolean z11) {
        this.f83396W = z11;
    }

    public final void setSessionPreviewLog$app_release(boolean z11) {
        this.f83397a0 = z11;
    }

    public final void setSpeechToText$app_release(String str) {
        this.f83400d0 = str;
    }
}
