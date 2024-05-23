package com.zing.zalo.p077ui.chat.chatrow;

import a30.C0107f;
import ag0.C0824j;
import am.AbstractC0939u;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import au.C2357l;
import b40.C2546u;
import bi0.AbstractC2807a;
import bi0.AbstractC2814h;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.common.C7853b;
import com.zing.zalo.p062db.C7956b;
import com.zing.zalo.p077ui.chat.chatrow.ChatRow;
import com.zing.zalo.p077ui.widget.C13694n1;
import com.zing.zalo.p077ui.widget.C13699o1;
import com.zing.zalo.p077ui.widget.C13704p1;
import com.zing.zalo.p077ui.widget.C13716q;
import com.zing.zalo.p077ui.widget.C13804v0;
import com.zing.zalo.uicontrol.PushToTalkControl;
import cp0.C17553b;
import dj.C17945a0;
import dj.C17964g1;
import dj.C17969i0;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import ho0.AbstractC20110a;
import if0.C20529b;
import if0.C20531d;
import me0.AbstractC23041d2;
import me0.AbstractC23136l9;
import me0.AbstractC23214t;
import me0.AbstractC23222t7;
import me0.C23212s8;
import mm0.AbstractC23350e;
import p207he.C20024r;
import p348mi.AbstractC23309i;
import p361nb.AbstractC23647d;
import p620wt.AbstractC29233h;
import p620wt.InterfaceC29232g;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import ti0.C26703b;
import ti0.C26705d;
import u80.C27104b0;
import vg.AbstractC28236y3;
import vg.C28227x3;
import w50.C28769a;
import zm.voip.service.VoipAudioHelper;

/* loaded from: classes5.dex */
public final class ChatRowVoice extends ChatRowHasCaption {
    public static final C11436c Companion = new C11436c(null);

    /* renamed from: X7 */
    private static final int f58975X7 = AbstractC23136l9.m118742r(20.0f);

    /* renamed from: Y7 */
    private static final InterfaceC29232g f58976Y7;

    /* renamed from: Z7 */
    private static final InterfaceC29232g f58977Z7;

    /* renamed from: B7 */
    private final C13716q f58978B7;

    /* renamed from: C7 */
    private C20531d f58979C7;

    /* renamed from: D7 */
    private int f58980D7;

    /* renamed from: E7 */
    private int f58981E7;

    /* renamed from: F7 */
    private C13804v0 f58982F7;

    /* renamed from: G7 */
    private int f58983G7;

    /* renamed from: H7 */
    private int f58984H7;

    /* renamed from: I7 */
    private boolean f58985I7;

    /* renamed from: J7 */
    private boolean f58986J7;

    /* renamed from: K7 */
    private int f58987K7;

    /* renamed from: L7 */
    private int f58988L7;

    /* renamed from: M7 */
    private boolean f58989M7;

    /* renamed from: N7 */
    private int f58990N7;

    /* renamed from: O7 */
    private int f58991O7;

    /* renamed from: P7 */
    private boolean f58992P7;

    /* renamed from: Q7 */
    private boolean f58993Q7;

    /* renamed from: R7 */
    private String f58994R7;

    /* renamed from: S7 */
    private int f58995S7;

    /* renamed from: T7 */
    private final InterfaceC24854k f58996T7;

    /* renamed from: U7 */
    private int f58997U7;

    /* renamed from: V7 */
    private int f58998V7;

    /* renamed from: W7 */
    private boolean f58999W7;

    /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRowVoice$a */
    /* loaded from: classes5.dex */
    static final class C11434a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C11434a f59000q = new C11434a();

        C11434a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C13704p1 mo12V4() {
            C13704p1 c13704p1 = new C13704p1(1);
            Context m35500c = MainApplication.Companion.m35500c();
            C26703b m137293a = C26705d.m137293a(m35500c, AbstractC2814h.t_normal);
            Float m137292s = m137293a.m137292s();
            if (m137292s != null) {
                c13704p1.m76614d(m137292s.floatValue(), false);
            }
            C13694n1 m137282i = m137293a.m137282i();
            if (m137282i != null) {
                c13704p1.setTypeface(C13699o1.f70798a.m76486a(m35500c, m137282i.m76440b(), Integer.valueOf(m137282i.m76446h())));
            }
            c13704p1.setColor(C23212s8.m119607o(m35500c, AbstractC2807a.text_02));
            return c13704p1;
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRowVoice$b */
    /* loaded from: classes5.dex */
    static final class C11435b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C11435b f59001q = new C11435b();

        C11435b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C13704p1 mo12V4() {
            C13704p1 c13704p1 = new C13704p1(1);
            Context m35500c = MainApplication.Companion.m35500c();
            C26703b m137293a = C26705d.m137293a(m35500c, AbstractC2814h.t_small);
            Float m137292s = m137293a.m137292s();
            if (m137292s != null) {
                c13704p1.setTextSize(m137292s.floatValue());
            }
            C13694n1 m137282i = m137293a.m137282i();
            if (m137282i != null) {
                c13704p1.setTypeface(C13699o1.f70798a.m76486a(m35500c, m137282i.m76440b(), Integer.valueOf(m137282i.m76446h())));
            }
            c13704p1.setColor(C23212s8.m119607o(m35500c, AbstractC2807a.text_tertiary));
            ((TextPaint) c13704p1).linkColor = AbstractC11531v0.Companion.m62540U0();
            return c13704p1;
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRowVoice$c */
    /* loaded from: classes5.dex */
    public static final class C11436c {
        private C11436c() {
        }

        public /* synthetic */ C11436c(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: c */
        public final C13704p1 m61793c() {
            return (C13704p1) ChatRowVoice.f58976Y7.getValue();
        }

        /* renamed from: d */
        public final C13704p1 m61794d() {
            return (C13704p1) ChatRowVoice.f58977Z7.getValue();
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRowVoice$d */
    /* loaded from: classes5.dex */
    public static final class C11437d extends AbstractC0939u {
        C11437d() {
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7956b.Companion.m41573b().m41562v0(ChatRowVoice.this.f57263B);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRowVoice$e */
    /* loaded from: classes5.dex */
    public static final class C11438e extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C11438e f59003q = new C11438e();

        C11438e() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final CharSequence mo12V4() {
            Drawable m62493E1 = AbstractC11531v0.Companion.m62493E1();
            if (m62493E1 != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("*" + AbstractC23136l9.m118743r0(AbstractC8020f0.str_rolled_voice_cloud));
                spannableStringBuilder.setSpan(new C27104b0(m62493E1, 0, 0, AbstractC23222t7.f112566j), 0, 1, 17);
                return spannableStringBuilder;
            }
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_rolled_voice_cloud);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            return m118743r0;
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRowVoice$f */
    /* loaded from: classes5.dex */
    public static final class C11439f implements C7853b.d {
        C11439f() {
        }

        @Override // com.zing.zalo.common.C7853b.d
        /* renamed from: a */
        public void mo40156a(String str, int i11) {
            try {
                C17945a0 c17945a0 = ChatRowVoice.this.f57263B;
                if (c17945a0 != null && TextUtils.equals(c17945a0.m94983Q3(), str)) {
                    ChatRowVoice.this.f58995S7 = i11;
                    C2546u.f10363a.m12831t(i11);
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }

        @Override // com.zing.zalo.common.C7853b.d
        /* renamed from: b */
        public void mo40157b(String str, String str2) {
            try {
                C17945a0 c17945a0 = ChatRowVoice.this.f57263B;
                if (c17945a0 != null && TextUtils.equals(c17945a0.m94983Q3(), str) && str2 != null) {
                    ChatRowVoice.this.f58994R7 = str2;
                    ChatRowVoice.this.f58978B7.m76686f(str2);
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }

        @Override // com.zing.zalo.common.C7853b.d
        /* renamed from: c */
        public void mo40158c(String str, int i11) {
        }

        @Override // com.zing.zalo.common.C7853b.d
        public void onAudioFocusChange(int i11) {
        }
    }

    static {
        C11528u0 c11528u0 = C11528u0.f59384a;
        f58976Y7 = AbstractC29233h.m145991b(c11528u0.m62030a(), C11434a.f59000q);
        f58977Z7 = AbstractC29233h.m145991b(c11528u0.m62030a(), C11435b.f59001q);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatRowVoice(Context context) {
        super(context);
        InterfaceC24854k m129210a;
        AbstractC19074t.m100208f(context, "context");
        this.f58978B7 = new C13716q(this);
        this.f58994R7 = "";
        m129210a = AbstractC24856m.m129210a(C11438e.f59003q);
        this.f58996T7 = m129210a;
    }

    /* renamed from: E4 */
    private final boolean m61778E4(float f11, float f12) {
        try {
            if (AbstractC11531v0.Companion.m62619v0() != null) {
                if (f11 < this.f58987K7 || f11 > r2 + r1.getIntrinsicWidth()) {
                    return false;
                }
                if (f12 < this.f58988L7) {
                    return false;
                }
                if (f12 > r5 + r1.getIntrinsicHeight()) {
                    return false;
                }
                return true;
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
        return false;
    }

    /* renamed from: F4 */
    private final void m61779F4() {
        this.f57554y3.mo61152k();
        this.f57554y3.mo61148a(this.f57263B.m94983Q3(), this.f57263B.m95029V3());
        C2546u.f10363a.m12821h(this.f57263B, false);
        m61782I4();
        setPlaying(true);
        this.f58978B7.m76685e();
        C20529b c20529b = C20529b.f100835a;
        C17945a0 c17945a0 = this.f57263B;
        AbstractC19074t.m100207e(c17945a0, "message");
        c20529b.m106665t(c17945a0);
    }

    /* renamed from: G4 */
    private final void m61780G4() {
        try {
            if (this.f57263B.m95022U7()) {
                this.f57554y3.mo61149b(this);
                return;
            }
            if (!C20024r.m103941j() && !C7853b.Companion.m40150a().m40133i0()) {
                if (!AbstractC23309i.m121977hc() && C17553b.m93488c(getContext()).m93493f() && !VoipAudioHelper.m155581Y()) {
                    this.f57554y3.mo61150i0();
                    return;
                }
                AbstractC23647d.m123907q("9140", ChatRow.f57200K6);
                if (this.f57263B.m95032V6()) {
                    if (AbstractC23041d2.m118194A(this.f57263B.m94983Q3())) {
                        if (this.f57554y3.mo61145A(this.f57263B.m94983Q3(), this.f57263B.m95029V3())) {
                            m61781H4();
                        } else {
                            m61779F4();
                        }
                        this.f57554y3.mo61147Q0();
                    } else {
                        this.f57263B.m94891Fa(true);
                        this.f57263B.m95165ic(4, true);
                        getDelegate().mo62034C4(this);
                        this.f57554y3.mo61147Q0();
                    }
                } else {
                    if (AbstractC23041d2.m118194A(this.f57263B.m94983Q3())) {
                        if (this.f57554y3.mo61145A(this.f57263B.m94983Q3(), this.f57263B.m95029V3())) {
                            this.f57554y3.mo61146P0(this);
                            m61781H4();
                            this.f57554y3.mo61147Q0();
                        } else {
                            m61779F4();
                            if (this.f57263B.m94929K2() instanceof C17964g1) {
                                C17969i0 m94929K2 = this.f57263B.m94929K2();
                                AbstractC19074t.m100206d(m94929K2, "null cannot be cast to non-null type com.zing.zalo.data.chat.model.message.ChatRichContentVoice");
                                if (!((C17964g1) m94929K2).m95540r()) {
                                    C17969i0 m94929K22 = this.f57263B.m94929K2();
                                    AbstractC19074t.m100206d(m94929K22, "null cannot be cast to non-null type com.zing.zalo.data.chat.model.message.ChatRichContentVoice");
                                    ((C17964g1) m94929K22).m95522C(true);
                                    C0824j.m2153b(new C11437d());
                                    this.f57263B.m95111d9();
                                }
                            }
                        }
                    } else {
                        this.f57263B.m94891Fa(true);
                        this.f57263B.m95165ic(4, true);
                        getDelegate().mo62034C4(this);
                        this.f57554y3.mo61147Q0();
                    }
                    this.f57554y3.mo61147Q0();
                }
                AbstractC23647d.m123893c();
                return;
            }
            PushToTalkControl.C16482c.m87894a();
        } catch (Resources.NotFoundException e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: H4 */
    private final void m61781H4() {
        C2546u.f10363a.m12826m(this.f57263B, C2546u.b.f10374q);
        this.f57554y3.mo61152k();
        setPlaying(false);
        this.f58978B7.m76689i();
        C20529b.f100835a.m106666u(this.f57263B.m95029V3());
    }

    /* renamed from: I4 */
    private final void m61782I4() {
        try {
            ChatRow.InterfaceC11339n interfaceC11339n = this.f57554y3;
            if (interfaceC11339n != null) {
                interfaceC11339n.mo61153m(new C11439f());
            }
            ChatRow.InterfaceC11339n interfaceC11339n2 = this.f57554y3;
            if (interfaceC11339n2 != null) {
                interfaceC11339n2.mo61151j(new C7853b.b() { // from class: com.zing.zalo.ui.chat.chatrow.j1
                    public /* synthetic */ C11488j1() {
                    }

                    @Override // com.zing.zalo.common.C7853b.b
                    /* renamed from: a */
                    public final void mo40153a(String str) {
                        ChatRowVoice.m61783J4(ChatRowVoice.this, str);
                    }
                });
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: J4 */
    public static final void m61783J4(ChatRowVoice chatRowVoice, String str) {
        AbstractC19074t.m100208f(chatRowVoice, "this$0");
        C20529b.f100835a.m106666u(chatRowVoice.f57263B.m95029V3());
        C2546u.f10363a.m12826m(chatRowVoice.f57263B, C2546u.b.f10373p);
    }

    /* renamed from: K4 */
    private final void m61784K4() {
        try {
            byte m95107d3 = (byte) this.f57263B.m95107d3();
            if (m95107d3 == 2) {
                this.f58986J7 = true;
            } else if (m95107d3 == 4) {
                this.f58985I7 = true;
            } else if (m95107d3 == 3) {
                this.f57373T1 = true;
            } else if (m95107d3 == 5) {
                if (!this.f57268B4.m143918k()) {
                    if (!this.f57268B4.m143920m()) {
                        this.f57373T1 = true;
                    }
                } else if (this.f57263B.m94929K2() instanceof C17964g1) {
                    AbstractC19074t.m100206d(this.f57263B.m94929K2(), "null cannot be cast to non-null type com.zing.zalo.data.chat.model.message.ChatRichContentVoice");
                    this.f58986J7 = !((C17964g1) r0).m95540r();
                }
            } else if (m95107d3 == 8) {
                setRetryVisible(true);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatRow", e11);
        }
    }

    /* renamed from: L4 */
    private final void m61785L4() {
        try {
            if (this.f57554y3.mo61145A(this.f57263B.m94983Q3(), this.f57263B.m95029V3())) {
                setPlaying(true);
                m61786M4(true);
                Integer m477b = C0107f.m476a().m477b(this.f57263B.m95029V3());
                if (m477b != null && m477b.intValue() >= 0) {
                    this.f58995S7 = m477b.intValue();
                }
                m61782I4();
            } else {
                setPlaying(false);
                m61786M4(false);
                this.f58995S7 = 0;
            }
            this.f58978B7.m76686f(this.f58994R7);
            if (this.f58993Q7) {
                this.f58978B7.m76685e();
            } else {
                this.f58978B7.m76689i();
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: M4 */
    private final void m61786M4(boolean z11) {
        C17964g1 c17964g1;
        if (z11) {
            this.f58994R7 = C7853b.Companion.m40150a().m40107T();
            return;
        }
        C17969i0 m94929K2 = this.f57263B.m94929K2();
        String str = null;
        if (m94929K2 instanceof C17964g1) {
            c17964g1 = (C17964g1) m94929K2;
        } else {
            c17964g1 = null;
        }
        if (c17964g1 == null) {
            return;
        }
        String m94983Q3 = this.f57263B.m94983Q3();
        AbstractC19074t.m100205c(m94983Q3);
        if (m94983Q3.length() > 0) {
            str = m94983Q3;
        }
        if (str == null) {
            return;
        }
        int m95530g = c17964g1.m95530g();
        if (m95530g > 0) {
            this.f58994R7 = C2357l.f9883a.m12351a(m95530g);
            C7853b.Companion.m40150a().m40118Z0(str, m95530g);
            return;
        }
        int m40115Y = C7853b.Companion.m40150a().m40115Y(str);
        if (m40115Y > 0) {
            this.f58994R7 = C2357l.f9883a.m12351a(m40115Y);
            this.f57263B.m95301xc(m40115Y);
        } else {
            this.f57263B.m95309yc();
        }
    }

    private final CharSequence getRollText() {
        return (CharSequence) this.f58996T7.getValue();
    }

    private final void setPlaying(boolean z11) {
        this.f58993Q7 = z11;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: A3 */
    public void mo60947A3() {
        super.mo60947A3();
        this.f58992P7 = false;
        this.f58989M7 = false;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: B2 */
    public C28227x3 mo60949B2(boolean z11, int i11, C28227x3 c28227x3) {
        AbstractC19074t.m100208f(c28227x3, "result");
        C28227x3 mo60949B2 = super.mo60949B2(z11, i11, c28227x3);
        AbstractC19074t.m100207e(mo60949B2, "measureBubbleEnd(...)");
        C13804v0 c13804v0 = this.f58982F7;
        if (this.f58985I7 && c13804v0 != null) {
            int i12 = mo60949B2.f131648a;
            int m77064c = c13804v0.m77064c();
            int i13 = f58975X7;
            mo60949B2.f131648a = Math.max(i12, m77064c + (i13 * 2));
            mo60949B2.f131649b += c13804v0.m77063b() + (i13 * 2);
        }
        Drawable m62619v0 = AbstractC11531v0.Companion.m62619v0();
        if (this.f58986J7 && m62619v0 != null) {
            int i14 = mo60949B2.f131648a;
            int intrinsicWidth = m62619v0.getIntrinsicWidth();
            int i15 = ChatRow.f57203M5;
            mo60949B2.f131648a = Math.max(i14, intrinsicWidth + i15);
            mo60949B2.f131649b += m62619v0.getIntrinsicHeight() + i15;
        }
        c28227x3.f131648a = mo60949B2.f131648a;
        c28227x3.f131649b = mo60949B2.f131649b;
        return c28227x3;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: C2 */
    protected C28227x3 mo60952C2(int i11, int i12, C28227x3 c28227x3) {
        int i13;
        AbstractC19074t.m100208f(c28227x3, "result");
        if (this.f57263B.m95022U7()) {
            Drawable m62493E1 = AbstractC11531v0.Companion.m62493E1();
            if (m62493E1 != null) {
                i13 = m62493E1.getIntrinsicWidth();
            } else {
                i13 = 0;
            }
            c28227x3.f131648a = getBubblePaddingLeft() + i13 + AbstractC23222t7.f112566j + ((int) Companion.m61793c().measureText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_rolled_voice_cloud))) + getBubblePaddingRight();
        } else if (this.f57263B.m94849A8()) {
            c28227x3.f131648a = getBubblePaddingLeft() + C13716q.f70984l + C13716q.f70986n + getBubblePaddingRight();
        } else {
            c28227x3.f131648a = getBubblePaddingLeft() + C13716q.f70984l + getBubblePaddingRight();
        }
        c28227x3.f131649b = C13716q.f70985m;
        if (this.f57263B.m95022U7()) {
            c28227x3.f131648a = Math.max(c28227x3.f131648a, getTextWidth() + getBubblePaddingLeft() + getBubblePaddingRight());
            c28227x3.f131649b = getTextHeight();
        } else if (mo61163l4()) {
            c28227x3.f131648a = Math.max(c28227x3.f131648a, getTextWidth() + getBubblePaddingLeft() + getBubblePaddingRight());
            c28227x3.f131649b += ChatRow.f57201L5 + getTextHeight();
        }
        C20531d c20531d = this.f58979C7;
        if (c20531d != null) {
            C28227x3 m106679c = c20531d.m106679c();
            c28227x3.f131649b += ChatRow.f57201L5 + m106679c.f131649b;
            c28227x3.f131648a = Math.max(c28227x3.f131648a, m106679c.f131648a + getBubblePaddingLeft() + getBubblePaddingRight());
        }
        return c28227x3;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: C3 */
    public void mo60953C3(C17945a0 c17945a0, C28769a c28769a, boolean z11) {
        AbstractC19074t.m100208f(c17945a0, "message");
        AbstractC19074t.m100208f(c28769a, "chatBubbleData");
        super.mo60953C3(c17945a0, c28769a, z11);
        if (!c17945a0.m95032V6()) {
            m61784K4();
        }
        this.f58999W7 = this.f57554y3.mo61154z(c17945a0);
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: I3 */
    public void mo60975I3(C17945a0 c17945a0, C28769a c28769a, int i11) {
        AbstractC19074t.m100208f(c17945a0, "message");
        AbstractC19074t.m100208f(c28769a, "chatBubbleData");
        super.mo60975I3(c17945a0, c28769a, i11);
        if (this.f58985I7 && this.f58982F7 == null) {
            this.f58982F7 = new C13804v0(this);
        }
        if (this.f58999W7) {
            this.f58979C7 = new C20531d(this);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: N2 */
    protected void mo60995N2() {
        m61780G4();
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: Y2 */
    public void mo61036Y2(C17945a0 c17945a0, C28769a c28769a) {
        AbstractC19074t.m100208f(c17945a0, "message");
        AbstractC19074t.m100208f(c28769a, "chatBubbleData");
        super.mo61036Y2(c17945a0, c28769a);
        m61785L4();
        this.f58978B7.m76687g(c17945a0.m94849A8());
        C20529b.f100835a.m106667v(c17945a0, m60973I1());
        if (!m60973I1()) {
            C2546u.f10363a.m12823j(c17945a0);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: f2 */
    public int mo61058f2(int i11, int i12, int i13, int i14, boolean z11) {
        int intrinsicWidth;
        int m77064c;
        C13804v0 c13804v0 = this.f58982F7;
        if (this.f58985I7 && c13804v0 != null) {
            int i15 = f58975X7;
            if (z11) {
                m77064c = i15 + i11;
            } else {
                m77064c = (i13 - i15) - c13804v0.m77064c();
            }
            this.f58983G7 = m77064c;
            int i16 = f58975X7;
            int i17 = i12 + i16;
            this.f58984H7 = i17;
            C13804v0 c13804v02 = this.f58982F7;
            if (c13804v02 != null) {
                c13804v02.m77067f(m77064c, i17);
            }
            i12 += c13804v0.m77063b() + (i16 * 2);
        }
        Drawable m62619v0 = AbstractC11531v0.Companion.m62619v0();
        if (this.f58986J7 && m62619v0 != null) {
            int i18 = ChatRow.f57203M5 / 2;
            if (z11) {
                intrinsicWidth = i18 + i11;
            } else {
                intrinsicWidth = (i13 - i18) - m62619v0.getIntrinsicWidth();
            }
            this.f58987K7 = intrinsicWidth;
            int i19 = ChatRow.f57203M5;
            this.f58988L7 = (i19 / 2) + i12;
            i12 += m62619v0.getIntrinsicHeight() + i19;
        }
        return super.mo61058f2(i11, i12, i13, i14, z11);
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: g2 */
    protected void mo61063g2(int i11, int i12, int i13, int i14, boolean z11) {
        if (this.f57263B.m95022U7()) {
            Drawable m62493E1 = AbstractC11531v0.Companion.m62493E1();
            if (m62493E1 != null) {
                setTextPositionX(getBubblePaddingLeft() + i11);
                setTextPositionY((i12 - C13716q.f70985m) + m62493E1.getIntrinsicHeight());
                i12 += getTextHeight();
            }
        } else {
            this.f58990N7 = getBubblePaddingLeft() + i11;
            this.f58991O7 = i12;
            i12 += C13716q.f70985m;
            setTextPositionX(getBubblePaddingLeft() + i11);
            setTextPositionY(ChatRow.f57201L5 + i12);
        }
        this.f58980D7 = i11 + getBubblePaddingLeft();
        this.f58981E7 = i12 + ChatRow.f57201L5;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    public int getBubbleMaxWidth() {
        int bubbleMaxWidth;
        if (this.f57263B.m94849A8()) {
            bubbleMaxWidth = getBubblePaddingLeft() + C13716q.f70984l + C13716q.f70986n + getBubblePaddingRight();
        } else {
            bubbleMaxWidth = super.getBubbleMaxWidth();
        }
        return Math.max(super.getBubbleMaxWidth(), bubbleMaxWidth);
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    public int getBubblePaddingLeft() {
        return AbstractC23222t7.f112576o;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    public int getBubblePaddingRight() {
        return AbstractC23222t7.f112576o;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    public String getMsgContentTalkText() {
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_reply_msg_voice);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        return m118743r0 + " " + this.f58994R7;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption
    protected int getTextPositionX() {
        return this.f58997U7;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption
    protected int getTextPositionY() {
        return this.f58998V7;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption
    /* renamed from: h4 */
    protected AbstractC23214t.a mo61199h4(C17945a0 c17945a0, String str, int i11, boolean z11) {
        AbstractC19074t.m100208f(c17945a0, "message");
        if (i11 > 0 && str != null && str.length() != 0) {
            if (c17945a0.m95022U7()) {
                return AbstractC23214t.m119616c(getRollText(), Companion.m61793c(), i11, ChatRow.f57233h6, false, false, null, AbstractC11531v0.Companion.m62540U0(), null, null, null, 0, 1.0f, 0.0f);
            }
            return c17945a0.m94994R5(str, i11, z11, false, Companion.m61794d());
        }
        return null;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: k0 */
    public int mo61076k0(C17945a0 c17945a0) {
        AbstractC19074t.m100208f(c17945a0, "message");
        int mo61076k0 = super.mo61076k0(c17945a0);
        if (!c17945a0.m95032V6() && c17945a0.m95107d3() == 5) {
            return mo61076k0 | 9;
        }
        return mo61076k0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x002b, code lost:            if (r2 != false) goto L43;     */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: k3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean mo61079k3(MotionEvent motionEvent, int i11, float f11, float f12) {
        boolean z11;
        AbstractC19074t.m100208f(motionEvent, "event");
        if (i11 != 0) {
            if (i11 == 1 && this.f58989M7 && m61778E4(f11, f12)) {
                m61780G4();
            }
            if (!super.mo61079k3(motionEvent, i11, f11, f12)) {
                return false;
            }
        } else {
            if (this.f58986J7) {
                boolean m61778E4 = m61778E4(f11, f12);
                this.f58989M7 = m61778E4;
                C24848g0 c24848g0 = C24848g0.f119245a;
                if (m61778E4) {
                    z11 = true;
                }
            }
            z11 = false;
        }
        return true;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption
    /* renamed from: k4 */
    protected String mo61162k4(C17945a0 c17945a0) {
        C17964g1 c17964g1;
        String str;
        AbstractC19074t.m100208f(c17945a0, "message");
        if (c17945a0.m95022U7()) {
            return getRollText().toString();
        }
        C17969i0 m94929K2 = c17945a0.m94929K2();
        if (m94929K2 instanceof C17964g1) {
            c17964g1 = (C17964g1) m94929K2;
        } else {
            c17964g1 = null;
        }
        if (c17964g1 != null) {
            str = c17964g1.m95538p();
        } else {
            str = null;
        }
        if (str == null || getDelegate().mo62101s4() == 2 || c17945a0.m95022U7()) {
            return null;
        }
        return str;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: s0 */
    public void mo61109s0(Canvas canvas) {
        C13804v0 c13804v0;
        AbstractC19074t.m100208f(canvas, "canvas");
        super.mo61109s0(canvas);
        if (this.f58985I7 && (c13804v0 = this.f58982F7) != null) {
            c13804v0.m77062a(canvas);
        }
        Drawable m62619v0 = AbstractC11531v0.Companion.m62619v0();
        if (this.f58986J7 && m62619v0 != null) {
            AbstractC28236y3.m142204o(m62619v0, this.f58987K7, this.f58988L7).draw(canvas);
        }
    }

    public void setTextPositionX(int i11) {
        this.f58997U7 = i11;
    }

    public void setTextPositionY(int i11) {
        this.f58998V7 = i11;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: t0 */
    protected void mo61111t0(Canvas canvas) {
        int save;
        AbstractC19074t.m100208f(canvas, "canvas");
        if (!this.f57263B.m95022U7()) {
            float f11 = this.f58990N7;
            float f12 = this.f58991O7;
            save = canvas.save();
            canvas.translate(f11, f12);
            try {
                this.f58978B7.m76683b(canvas);
                canvas.restoreToCount(save);
            } finally {
            }
        }
        float f13 = this.f58980D7;
        float f14 = this.f58981E7;
        save = canvas.save();
        canvas.translate(f13, f14);
        try {
            C20531d c20531d = this.f58979C7;
            if (c20531d != null) {
                c20531d.m106678b(canvas);
            }
        } finally {
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: w3 */
    public void mo61122w3() {
        super.mo61122w3();
        this.f58985I7 = false;
        this.f58986J7 = false;
        this.f58994R7 = "";
        this.f58995S7 = 0;
        this.f58978B7.m76686f("--:--");
        this.f57373T1 = false;
        setPlaying(false);
        this.f58999W7 = false;
        this.f58979C7 = null;
        this.f58980D7 = 0;
        this.f58981E7 = 0;
    }
}
