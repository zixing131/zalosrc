package com.zing.zalo.p077ui.mycloud.gridtab;

import a30.C0107f;
import ag0.C0824j;
import am.AbstractC0939u;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import bi0.AbstractC2807a;
import bi0.AbstractC2814h;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.common.C7853b;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.p062db.C7956b;
import com.zing.zalo.p077ui.chat.chatrow.AbstractC11531v0;
import com.zing.zalo.p077ui.mycloud.base.BaseMyCloudTabView;
import com.zing.zalo.p077ui.mycloud.model.MyCloudMessageItem;
import com.zing.zalo.uicontrol.PushToTalkControl;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zdesign.component.C17023o;
import dj.C17945a0;
import dj.C17964g1;
import dj.C17969i0;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import kd0.C21693c;
import l80.C22126c0;
import me0.AbstractC23041d2;
import me0.AbstractC23222t7;
import me0.C23212s8;
import mj0.AbstractC23322a;
import mm0.AbstractC23350e;
import mw.AbstractC23463h;
import p019aj.C0872f;
import p207he.C20024r;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p361nb.AbstractC23647d;
import p405ov.C24559a;
import p716zh.C31967j;
import pm0.C24848g0;
import ti0.C26705d;
import ti0.C26707f;
import ui0.C27280g;
import vg.AbstractC28054e7;

/* loaded from: classes6.dex */
public final class VoiceGridChatItemView extends GridChatItemViewBase {

    /* renamed from: A0 */
    private C16716d f65740A0;

    /* renamed from: B0 */
    private C17023o f65741B0;

    /* renamed from: C0 */
    private C22126c0 f65742C0;

    /* renamed from: D0 */
    private C16716d f65743D0;

    /* renamed from: E0 */
    private GradientDrawable f65744E0;

    /* renamed from: F0 */
    private String f65745F0;

    /* renamed from: G0 */
    private boolean f65746G0;

    /* renamed from: com.zing.zalo.ui.mycloud.gridtab.VoiceGridChatItemView$a */
    /* loaded from: classes6.dex */
    public static final class C12582a extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ C17945a0 f65747a;

        C12582a(C17945a0 c17945a0) {
            this.f65747a = c17945a0;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7956b.Companion.m41573b().m41562v0(this.f65747a);
        }
    }

    /* renamed from: com.zing.zalo.ui.mycloud.gridtab.VoiceGridChatItemView$b */
    /* loaded from: classes6.dex */
    static final class C12583b extends AbstractC19075u implements InterfaceC18494a {
        C12583b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m70954a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m70954a() {
            VoiceGridChatItemView.this.mo70815w0();
        }
    }

    /* renamed from: com.zing.zalo.ui.mycloud.gridtab.VoiceGridChatItemView$c */
    /* loaded from: classes6.dex */
    public static final class C12584c extends AbstractC28054e7 {

        /* renamed from: b */
        final /* synthetic */ MessageId f65750b;

        /* renamed from: c */
        final /* synthetic */ int f65751c;

        /* renamed from: d */
        final /* synthetic */ String f65752d;

        C12584c(MessageId messageId, int i11, String str) {
            this.f65750b = messageId;
            this.f65751c = i11;
            this.f65752d = str;
        }

        @Override // vg.AbstractC28054e7
        /* renamed from: a */
        public void mo16496a(int i11) {
            VoiceGridChatItemView.this.m70949i1();
            C0107f.m476a().m478c(this.f65750b, 0);
            if (this.f65751c == 1) {
                C24559a.m127935e(String.valueOf(i11), this.f65752d, null);
            }
        }

        @Override // vg.AbstractC28054e7
        /* renamed from: e */
        public void mo16498e() {
            VoiceGridChatItemView.this.m70949i1();
            VoiceGridChatItemView.this.mo70815w0();
            C0107f.m476a().m478c(this.f65750b, 0);
        }
    }

    /* renamed from: com.zing.zalo.ui.mycloud.gridtab.VoiceGridChatItemView$d */
    /* loaded from: classes6.dex */
    public static final class C12585d implements C7853b.d {

        /* renamed from: a */
        final /* synthetic */ C17945a0 f65753a;

        /* renamed from: b */
        final /* synthetic */ VoiceGridChatItemView f65754b;

        C12585d(C17945a0 c17945a0, VoiceGridChatItemView voiceGridChatItemView) {
            this.f65753a = c17945a0;
            this.f65754b = voiceGridChatItemView;
        }

        @Override // com.zing.zalo.common.C7853b.d
        /* renamed from: a */
        public void mo40156a(String str, int i11) {
        }

        @Override // com.zing.zalo.common.C7853b.d
        /* renamed from: b */
        public void mo40157b(String str, String str2) {
            CharSequence charSequence;
            C17945a0 m71033m;
            if (str2 != null) {
                try {
                    if (TextUtils.equals(this.f65753a.m94983Q3(), str)) {
                        this.f65754b.f65745F0 = str2;
                        C22126c0 c22126c0 = this.f65754b.f65742C0;
                        if (c22126c0 == null) {
                            AbstractC19074t.m100223u("timeModule");
                            c22126c0 = null;
                        }
                        MyCloudMessageItem data = this.f65754b.getData();
                        if (data == null || (m71033m = data.m71033m()) == null || !m71033m.m94849A8()) {
                            charSequence = this.f65754b.f65745F0;
                        } else {
                            Context context = this.f65754b.getContext();
                            AbstractC19074t.m100207e(context, "getContext(...)");
                            charSequence = AbstractC23463h.m123175c(context, this.f65754b.f65745F0, false, 4, null);
                        }
                        c22126c0.m111959G1(charSequence);
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
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

    public VoiceGridChatItemView(Context context) {
        super(context);
        this.f65745F0 = "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b1 */
    public static final void m70944b1(VoiceGridChatItemView voiceGridChatItemView, C16719g c16719g) {
        C17945a0 m71033m;
        AbstractC19074t.m100208f(voiceGridChatItemView, "this$0");
        MyCloudMessageItem data = voiceGridChatItemView.getData();
        if (data != null && (m71033m = data.m71033m()) != null) {
            voiceGridChatItemView.m70947e1(m71033m);
        }
    }

    /* renamed from: c1 */
    private final void m70945c1() {
        float f11;
        float f12;
        int i11 = AbstractC23222t7.f112566j;
        float f13 = i11;
        float f14 = i11;
        if (!getViewOriginalMsgVisible() && !getHasReply()) {
            int i12 = AbstractC23222t7.f112566j;
            f11 = i12;
            f12 = i12;
        } else {
            f11 = 0.0f;
            f12 = 0.0f;
        }
        if (this.f65744E0 == null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(C23212s8.m119607o(getContext(), AbstractC2807a.layer_background_subtle));
            gradientDrawable.setStroke(AbstractC23222t7.f112550b, C23212s8.m119607o(getContext(), AbstractC2807a.border_subtle));
            this.f65744E0 = gradientDrawable;
        }
        GradientDrawable gradientDrawable2 = this.f65744E0;
        if (gradientDrawable2 != null) {
            gradientDrawable2.setCornerRadii(new float[]{f11, f11, f12, f12, f13, f13, f14, f14});
        }
    }

    /* renamed from: d1 */
    private final boolean m70946d1(C17945a0 c17945a0) {
        return C31967j.m153687a().m153691e(c17945a0.m94983Q3(), c17945a0.m95029V3());
    }

    /* renamed from: e1 */
    private final void m70947e1(C17945a0 c17945a0) {
        C17964g1 c17964g1;
        try {
            if (!C20024r.m103941j() && !C7853b.Companion.m40150a().m40133i0()) {
                boolean z11 = false;
                if (c17945a0.m95032V6()) {
                    if (AbstractC23041d2.m118194A(c17945a0.m94983Q3())) {
                        if (m70946d1(c17945a0)) {
                            m70949i1();
                        } else {
                            m70949i1();
                            m70953g1(1, c17945a0.m94983Q3(), c17945a0.m95029V3());
                            m70948h1(c17945a0);
                            z11 = true;
                        }
                        this.f65746G0 = z11;
                        m70950j1();
                    } else {
                        ToastUtils.showMess(getContext().getResources().getString(AbstractC8020f0.error_openfile));
                    }
                } else if (AbstractC23041d2.m118194A(c17945a0.m94983Q3())) {
                    if (m70946d1(c17945a0)) {
                        m70952f1(c17945a0);
                        m70949i1();
                        this.f65746G0 = false;
                    } else {
                        m70949i1();
                        m70953g1(1, c17945a0.m94983Q3(), c17945a0.m95029V3());
                        m70948h1(c17945a0);
                        C17969i0 m94929K2 = c17945a0.m94929K2();
                        if (m94929K2 instanceof C17964g1) {
                            c17964g1 = (C17964g1) m94929K2;
                        } else {
                            c17964g1 = null;
                        }
                        if (c17964g1 != null && !c17964g1.m95540r()) {
                            c17964g1.m95522C(true);
                            C0824j.m2153b(new C12582a(c17945a0));
                        }
                        this.f65746G0 = true;
                    }
                    m70950j1();
                } else {
                    c17945a0.m94891Fa(true);
                    c17945a0.m95165ic(4, true);
                    c17945a0.m95023U9();
                }
                AbstractC23647d.m123893c();
                return;
            }
            PushToTalkControl.C16482c.m87894a();
        } catch (Resources.NotFoundException e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: h1 */
    private final void m70948h1(C17945a0 c17945a0) {
        try {
            C7853b.Companion.m40150a().m40127f1(new C12585d(c17945a0, this));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i1 */
    public final void m70949i1() {
        C31967j.m153687a().m153695i();
        BaseMyCloudTabView.AbstractC12510b delegate = getDelegate();
        if (delegate != null) {
            delegate.mo70379A(false);
        }
        mo70815w0();
    }

    /* renamed from: j1 */
    private final void m70950j1() {
        C17023o c17023o = null;
        if (this.f65746G0) {
            C17023o c17023o2 = this.f65741B0;
            if (c17023o2 == null) {
                AbstractC19074t.m100223u("buttonModule");
            } else {
                c17023o = c17023o2;
            }
            Context context = getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            c17023o.m91112r1(C27280g.m139660c(context, AbstractC23322a.zds_ic_stop_solid_24, AbstractC2807a.button_secondary_icon));
            return;
        }
        C17023o c17023o3 = this.f65741B0;
        if (c17023o3 == null) {
            AbstractC19074t.m100223u("buttonModule");
        } else {
            c17023o = c17023o3;
        }
        Context context2 = getContext();
        AbstractC19074t.m100207e(context2, "getContext(...)");
        c17023o.m91112r1(C27280g.m139660c(context2, AbstractC23322a.zds_ic_play_solid_24, AbstractC2807a.button_secondary_icon));
    }

    /* renamed from: k1 */
    private final void m70951k1() {
        CharSequence charSequence;
        try {
            MyCloudMessageItem data = getData();
            if (data != null) {
                if (m70946d1(data.m71033m())) {
                    this.f65746G0 = true;
                    this.f65745F0 = C7853b.Companion.m40150a().m40107T();
                } else {
                    this.f65746G0 = false;
                    BaseMyCloudTabView.AbstractC12510b delegate = getDelegate();
                    if (delegate != null && delegate.m70390i()) {
                        C7853b m40150a = C7853b.Companion.m40150a();
                        String m94983Q3 = data.m71033m().m94983Q3();
                        AbstractC19074t.m100207e(m94983Q3, "getLocalpath(...)");
                        this.f65745F0 = m40150a.m40110V(m94983Q3);
                    } else {
                        if (!(data.m71033m().m94929K2() instanceof C17964g1)) {
                            data.m71033m().m95191la(new C17964g1("", 0, "", "", "", "", ""));
                        }
                        C17969i0 m94929K2 = data.m71033m().m94929K2();
                        AbstractC19074t.m100206d(m94929K2, "null cannot be cast to non-null type com.zing.zalo.data.chat.model.message.ChatRichContentVoice");
                        C17964g1 c17964g1 = (C17964g1) m94929K2;
                        if (c17964g1.m95530g() <= 0) {
                            data.m71033m().m95309yc();
                        } else {
                            C7853b.a aVar = C7853b.Companion;
                            C7853b m40150a2 = aVar.m40150a();
                            String m94983Q32 = data.m71033m().m94983Q3();
                            AbstractC19074t.m100207e(m94983Q32, "getLocalpath(...)");
                            m40150a2.m40118Z0(m94983Q32, c17964g1.m95530g());
                            C7853b m40150a3 = aVar.m40150a();
                            String m94983Q33 = data.m71033m().m94983Q3();
                            AbstractC19074t.m100207e(m94983Q33, "getLocalpath(...)");
                            this.f65745F0 = m40150a3.m40109U(m94983Q33);
                        }
                    }
                }
                if (this.f65745F0.length() > 0) {
                    C22126c0 c22126c0 = this.f65742C0;
                    if (c22126c0 == null) {
                        AbstractC19074t.m100223u("timeModule");
                        c22126c0 = null;
                    }
                    if (data.m71033m().m94849A8()) {
                        Context context = getContext();
                        AbstractC19074t.m100207e(context, "getContext(...)");
                        charSequence = AbstractC23463h.m123175c(context, this.f65745F0, false, 4, null);
                    } else {
                        charSequence = this.f65745F0;
                    }
                    c22126c0.m111959G1(charSequence);
                }
                m70950j1();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.mycloud.gridtab.GridChatItemViewBase
    /* renamed from: C0 */
    public C16719g mo70813C0() {
        C16716d c16716d = new C16716d(getContext());
        c16716d.m89106L().m89028L(-2, -1).m89041Y(AbstractC23222t7.f112576o);
        this.f65740A0 = c16716d;
        Context context = getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        C17023o c17023o = new C17023o(context, AbstractC2814h.ButtonLarge_Secondary);
        Context context2 = c17023o.getContext();
        AbstractC19074t.m100207e(context2, "getContext(...)");
        c17023o.m91112r1(C27280g.m139660c(context2, AbstractC23322a.zds_ic_play_solid_24, AbstractC2807a.button_secondary_icon));
        c17023o.setIdTracking("play_my_cloud_grid_voice_item");
        c17023o.mo89109M0(new C16719g.c() { // from class: com.zing.zalo.ui.mycloud.gridtab.k0
            @Override // com.zing.zalo.uidrawing.C16719g.c
            /* renamed from: y */
            public final void mo929y(C16719g c16719g) {
                VoiceGridChatItemView.m70944b1(VoiceGridChatItemView.this, c16719g);
            }
        });
        this.f65741B0 = c17023o;
        C16716d c16716d2 = this.f65740A0;
        if (c16716d2 == null) {
            AbstractC19074t.m100223u("containerModule");
            c16716d2 = null;
        }
        C17023o c17023o2 = this.f65741B0;
        if (c17023o2 == null) {
            AbstractC19074t.m100223u("buttonModule");
            c17023o2 = null;
        }
        c16716d2.m89001g1(c17023o2);
        C22126c0 c22126c0 = new C22126c0(getContext());
        c22126c0.m89106L().m89072y(Boolean.TRUE);
        Context context3 = c22126c0.getContext();
        AbstractC19074t.m100207e(context3, "getContext(...)");
        new C26707f(c22126c0).m137318a(C26705d.m137293a(context3, AbstractC2814h.t_normal_m));
        c22126c0.m111962J1(C23212s8.m119607o(c22126c0.getContext(), AbstractC2807a.text_01));
        c22126c0.m111980v1(TextUtils.TruncateAt.END);
        this.f65742C0 = c22126c0;
        C16716d c16716d3 = this.f65740A0;
        if (c16716d3 == null) {
            AbstractC19074t.m100223u("containerModule");
            c16716d3 = null;
        }
        C22126c0 c22126c02 = this.f65742C0;
        if (c22126c02 == null) {
            AbstractC19074t.m100223u("timeModule");
            c22126c02 = null;
        }
        c16716d3.m89001g1(c22126c02);
        C16716d c16716d4 = this.f65740A0;
        if (c16716d4 == null) {
            AbstractC19074t.m100223u("containerModule");
            return null;
        }
        return c16716d4;
    }

    @Override // com.zing.zalo.p077ui.mycloud.gridtab.GridChatItemViewBase
    /* renamed from: O0 */
    public InterfaceC18494a mo70844O0() {
        return new C12583b();
    }

    @Override // com.zing.zalo.p077ui.mycloud.gridtab.GridChatItemViewBase
    /* renamed from: Q0 */
    public void mo70814Q0() {
        super.mo70814Q0();
        this.f65745F0 = "";
    }

    /* renamed from: f1 */
    public final void m70952f1(C17945a0 c17945a0) {
        AbstractC19074t.m100208f(c17945a0, "chatContent");
        try {
            if (!c17945a0.m95032V6()) {
                C0872f m120562A = AbstractC23306f.m120562A();
                String mo95039W2 = c17945a0.mo95039W2();
                AbstractC19074t.m100207e(mo95039W2, "getOwnerId(...)");
                m120562A.m2546l(mo95039W2);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatView", e11);
        }
    }

    /* renamed from: g1 */
    public final void m70953g1(int i11, String str, MessageId messageId) {
        try {
            C31967j.m153687a().m153692f(i11, str, messageId, 0, new C12584c(messageId, i11, str), AbstractC23309i.m121977hc());
            BaseMyCloudTabView.AbstractC12510b delegate = getDelegate();
            if (delegate != null) {
                delegate.mo70379A(true);
            }
        } catch (Exception e11) {
            ToastUtils.m89266n(AbstractC8020f0.str_alertcantOpenfile, new Object[0]);
            AbstractC23350e.m122778h(e11);
            if (i11 == 1) {
                C24559a.m127935e("NaN", str, null);
            }
        }
    }

    @Override // com.zing.zalo.p077ui.mycloud.gridtab.GridChatItemViewBase
    /* renamed from: w0 */
    public void mo70815w0() {
        CharSequence charSequence;
        C17945a0 m71033m;
        C17945a0 m71033m2;
        C24848g0 c24848g0;
        MyCloudMessageItem data = getData();
        C16716d c16716d = null;
        if (data != null && (m71033m2 = data.m71033m()) != null && m71033m2.m95022U7()) {
            m70945c1();
            C16716d c16716d2 = this.f65740A0;
            if (c16716d2 == null) {
                AbstractC19074t.m100223u("containerModule");
                c16716d2 = null;
            }
            c16716d2.m89085A0(this.f65744E0);
            C16716d c16716d3 = this.f65743D0;
            if (c16716d3 != null) {
                c16716d3.mo44614b1(0);
                c24848g0 = C24848g0.f119245a;
            } else {
                c24848g0 = null;
            }
            if (c24848g0 == null) {
                C16716d c16716d4 = new C16716d(getContext());
                c16716d4.m89106L().m89060k0(-1).m89030N(-1).m89041Y(AbstractC23222t7.f112566j).m89029M(15);
                c16716d4.mo89161z0(C23212s8.m119607o(c16716d4.getContext(), AbstractC2807a.page_background_03));
                C21693c c21693c = new C21693c(c16716d4.getContext());
                c21693c.m89106L().m89060k0(-2).m89030N(-2).m89026J(true);
                c21693c.m111929z1(4);
                Drawable m62493E1 = AbstractC11531v0.Companion.m62493E1();
                if (m62493E1 != null) {
                    c21693c.mo111925v1(m62493E1);
                }
                c16716d4.m89001g1(c21693c);
                C16716d c16716d5 = this.f65740A0;
                if (c16716d5 == null) {
                    AbstractC19074t.m100223u("containerModule");
                } else {
                    c16716d = c16716d5;
                }
                c16716d.m89001g1(c16716d4);
                this.f65743D0 = c16716d4;
                return;
            }
            return;
        }
        C16716d c16716d6 = this.f65743D0;
        if (c16716d6 != null) {
            c16716d6.mo44614b1(8);
        }
        C16716d c16716d7 = this.f65740A0;
        if (c16716d7 == null) {
            AbstractC19074t.m100223u("containerModule");
            c16716d7 = null;
        }
        c16716d7.m89085A0(null);
        m70951k1();
        C22126c0 c22126c0 = this.f65742C0;
        if (c22126c0 == null) {
            AbstractC19074t.m100223u("timeModule");
            c22126c0 = null;
        }
        MyCloudMessageItem data2 = getData();
        if (data2 != null && (m71033m = data2.m71033m()) != null && m71033m.m94849A8()) {
            Context context = getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            charSequence = AbstractC23463h.m123175c(context, this.f65745F0, false, 4, null);
        } else {
            charSequence = this.f65745F0;
        }
        c22126c0.m111959G1(charSequence);
    }
}
