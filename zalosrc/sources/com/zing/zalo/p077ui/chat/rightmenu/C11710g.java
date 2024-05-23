package com.zing.zalo.p077ui.chat.rightmenu;

import ae.C0766k;
import ag0.C0804b;
import am.AbstractC0924m0;
import am.C0943w;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.Pair;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.common.chat.label.C7860a;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p062db.C7959d;
import com.zing.zalo.p077ui.chat.rightmenu.C11710g;
import com.zing.zalo.p077ui.chat.rightmenu.ChatInfoAdapter;
import com.zing.zalo.p077ui.chat.rightmenu.ChatInfoView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalocore.CoreUtility;
import ee.C18418z;
import fn0.AbstractC19074t;
import fn0.C19067n0;
import gw.AbstractC19646n0;
import gw.C19637j;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import i70.C20379a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import me0.AbstractC23028c0;
import me0.AbstractC23089h6;
import me0.AbstractC23136l9;
import me0.AbstractC23161o1;
import me0.AbstractC23184q2;
import mm0.AbstractC23350e;
import od0.InterfaceC24223a;
import on0.AbstractC24342w;
import org.json.JSONObject;
import p056cj.C3535c;
import p130eh.C18430a;
import p161fg.C18922m;
import p162fh.C18932a;
import p162fh.C18935d;
import p210hh.C20060c;
import p304ks.AbstractC21935u;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p361nb.AbstractC23647d;
import p363nh.C23744a;
import p459qs.C25489b;
import p461qu.AbstractC25495a;
import p656xs.AbstractC30201b;
import p664y.AbstractC30228a;
import p716zh.C31862c;
import p716zh.C31973j5;
import p716zh.C31986k3;
import p716zh.C32037n9;
import p716zh.C32076q5;
import pd0.C24730d;
import pd0.C24732f;
import pd0.EnumC24733g;
import pd0.EnumC24734h;
import th.C26691l;
import vg.AbstractC28025b8;
import vg.C28203u6;
import vg.C28212v6;

/* renamed from: com.zing.zalo.ui.chat.rightmenu.g */
/* loaded from: classes5.dex */
public final class C11710g extends AbstractC11704a {

    /* renamed from: G */
    private String f60895G;

    /* renamed from: H */
    private boolean f60896H;

    /* renamed from: I */
    private String f60897I;

    /* renamed from: J */
    private boolean f60898J;

    /* renamed from: K */
    private String f60899K;

    /* renamed from: L */
    private C31973j5 f60900L;

    /* renamed from: M */
    private boolean f60901M;

    /* renamed from: N */
    private final InterfaceC24223a f60902N;

    /* renamed from: com.zing.zalo.ui.chat.rightmenu.g$a */
    /* loaded from: classes5.dex */
    public static final class a implements InterfaceC20094a {

        /* renamed from: b */
        final /* synthetic */ C31973j5 f60904b;

        /* renamed from: c */
        final /* synthetic */ String f60905c;

        a(C31973j5 c31973j5, String str) {
            this.f60904b = c31973j5;
            this.f60905c = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public static final void m65284f(int i11, C11710g c11710g, String str) {
            AbstractC19074t.m100208f(c11710g, "this$0");
            AbstractC19074t.m100208f(str, "$name");
            if (i11 == 0) {
                try {
                    ((InterfaceC11707d) c11710g.m103742Dp()).mo65187hf(str, false);
                    ((InterfaceC11707d) c11710g.m103742Dp()).mo65189iv();
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g */
        public static final void m65285g(C11710g c11710g) {
            AbstractC19074t.m100208f(c11710g, "this$0");
            ((InterfaceC11707d) c11710g.m103742Dp()).mo65189iv();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: h */
        public static final void m65286h(C11710g c11710g, C20096c c20096c, C31973j5 c31973j5) {
            AbstractC19074t.m100208f(c11710g, "this$0");
            AbstractC19074t.m100208f(c20096c, "$error_message");
            ((InterfaceC11707d) c11710g.m103742Dp()).mo65189iv();
            AbstractC23161o1.m119321f(c20096c, c31973j5.m153747Y());
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(final C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "error_message");
            try {
                new StringBuilder().append(c20096c.m104491c());
                InterfaceC11707d interfaceC11707d = (InterfaceC11707d) C11710g.this.m103742Dp();
                final C11710g c11710g = C11710g.this;
                final C31973j5 c31973j5 = this.f60904b;
                interfaceC11707d.mo70710wy(new Runnable() { // from class: h60.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        C11710g.a.m65286h(C11710g.this, c20096c, c31973j5);
                    }
                });
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
            C11710g.this.m65279tq(false);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            InterfaceC11707d interfaceC11707d;
            Runnable runnable;
            int i11;
            AbstractC19074t.m100208f(obj, "entity");
            try {
                try {
                    final int i12 = new JSONObject(obj.toString()).getInt("error_code");
                    if (i12 == 0) {
                        String m153793y = this.f60904b.m153793y();
                        boolean m153772m0 = this.f60904b.m153772m0();
                        this.f60904b.m153721I0(this.f60905c);
                        this.f60904b.m153727L0(1);
                        C0943w c0943w = C0943w.f3447a;
                        c0943w.m4484x(this.f60904b);
                        if (m153772m0) {
                            c0943w.m4467a(this.f60904b, m153793y);
                        }
                        C7959d.Companion.m41850e().m41787g3("group_" + this.f60904b.m153781r(), this.f60905c);
                        AbstractC23184q2.m119438C(this.f60904b.m153781r());
                        AbstractC19646n0.m103006n0(m153793y, this.f60905c, this.f60904b);
                        if (this.f60904b.m153747Y()) {
                            i11 = AbstractC8020f0.str_community_info_updated_successfully;
                        } else {
                            i11 = AbstractC8020f0.str_group_info_updated_successfully;
                        }
                        ToastUtils.m89268p(AbstractC23136l9.m118743r0(i11));
                    } else {
                        ToastUtils.m89260h(i12, this.f60904b.m153747Y());
                    }
                    InterfaceC11707d interfaceC11707d2 = (InterfaceC11707d) C11710g.this.m103742Dp();
                    final C11710g c11710g = C11710g.this;
                    final String str = this.f60905c;
                    interfaceC11707d2.mo70710wy(new Runnable() { // from class: h60.j
                        @Override // java.lang.Runnable
                        public final void run() {
                            C11710g.a.m65284f(i12, c11710g, str);
                        }
                    });
                    interfaceC11707d = (InterfaceC11707d) C11710g.this.m103742Dp();
                    final C11710g c11710g2 = C11710g.this;
                    runnable = new Runnable() { // from class: h60.k
                        @Override // java.lang.Runnable
                        public final void run() {
                            C11710g.a.m65285g(C11710g.this);
                        }
                    };
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_rename_group_error));
                    interfaceC11707d = (InterfaceC11707d) C11710g.this.m103742Dp();
                    final C11710g c11710g3 = C11710g.this;
                    runnable = new Runnable() { // from class: h60.k
                        @Override // java.lang.Runnable
                        public final void run() {
                            C11710g.a.m65285g(C11710g.this);
                        }
                    };
                }
                interfaceC11707d.mo70710wy(runnable);
                C11710g.this.m65279tq(false);
            } catch (Throwable th2) {
                InterfaceC11707d interfaceC11707d3 = (InterfaceC11707d) C11710g.this.m103742Dp();
                final C11710g c11710g4 = C11710g.this;
                interfaceC11707d3.mo70710wy(new Runnable() { // from class: h60.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        C11710g.a.m65285g(C11710g.this);
                    }
                });
                C11710g.this.m65279tq(false);
                throw th2;
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.rightmenu.g$b */
    /* loaded from: classes5.dex */
    public static final class b implements InterfaceC20094a {
        b() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            boolean z11;
            AbstractC19074t.m100208f(c20096c, "error_message");
            try {
                int m104491c = c20096c.m104491c();
                if (m104491c != 17002 && m104491c != 17005 && m104491c != 17006) {
                    InterfaceC11707d interfaceC11707d = (InterfaceC11707d) C11710g.this.m103742Dp();
                    C31973j5 m65272lq = C11710g.this.m65272lq();
                    if (m65272lq != null) {
                        z11 = m65272lq.m153747Y();
                    } else {
                        z11 = false;
                    }
                    interfaceC11707d.mo65186fg(c20096c, z11);
                } else {
                    String str = "group_" + C11710g.this.m65273mq();
                    C25489b.m132040r(C25489b.f122105a, str, "1", false, 4, null);
                    AbstractC23184q2.m119446d(C11710g.this.m65273mq(), str);
                    C23744a.Companion.m124119a().m124116d(52, str);
                }
                C11710g.this.m65276qq(false);
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x003f A[Catch: Exception -> 0x0031, TryCatch #0 {Exception -> 0x0031, blocks: (B:3:0x0007, B:5:0x001c, B:7:0x0022, B:9:0x002a, B:12:0x0036, B:14:0x003f, B:15:0x0045, B:17:0x0061, B:19:0x006e, B:21:0x0074, B:22:0x0079, B:24:0x007f, B:25:0x0096, B:27:0x00d1), top: B:2:0x0007 }] */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0061 A[Catch: Exception -> 0x0031, TryCatch #0 {Exception -> 0x0031, blocks: (B:3:0x0007, B:5:0x001c, B:7:0x0022, B:9:0x002a, B:12:0x0036, B:14:0x003f, B:15:0x0045, B:17:0x0061, B:19:0x006e, B:21:0x0074, B:22:0x0079, B:24:0x007f, B:25:0x0096, B:27:0x00d1), top: B:2:0x0007 }] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x007f A[Catch: Exception -> 0x0031, TryCatch #0 {Exception -> 0x0031, blocks: (B:3:0x0007, B:5:0x001c, B:7:0x0022, B:9:0x002a, B:12:0x0036, B:14:0x003f, B:15:0x0045, B:17:0x0061, B:19:0x006e, B:21:0x0074, B:22:0x0079, B:24:0x007f, B:25:0x0096, B:27:0x00d1), top: B:2:0x0007 }] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00d1 A[Catch: Exception -> 0x0031, TRY_LEAVE, TryCatch #0 {Exception -> 0x0031, blocks: (B:3:0x0007, B:5:0x001c, B:7:0x0022, B:9:0x002a, B:12:0x0036, B:14:0x003f, B:15:0x0045, B:17:0x0061, B:19:0x006e, B:21:0x0074, B:22:0x0079, B:24:0x007f, B:25:0x0096, B:27:0x00d1), top: B:2:0x0007 }] */
        /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0044  */
        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void mo927b(Object obj) {
            String str;
            C31973j5 m65272lq;
            boolean z11;
            C31973j5 c31973j5;
            C32076q5 c32076q5;
            ChatInfoView.InterfaceC11697a m65219Op;
            AbstractC19074t.m100208f(obj, "entity");
            try {
                JSONObject jSONObject = new JSONObject(obj.toString());
                JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                if (!jSONObject.isNull("error_code") && jSONObject.getInt("error_code") == 0) {
                    C31973j5 m65272lq2 = C11710g.this.m65272lq();
                    if (m65272lq2 != null) {
                        str = m65272lq2.m153793y();
                        if (str == null) {
                        }
                        m65272lq = C11710g.this.m65272lq();
                        if (m65272lq == null) {
                            z11 = m65272lq.m153772m0();
                        } else {
                            z11 = false;
                        }
                        C19637j c19637j = C19637j.f97466a;
                        AbstractC19074t.m100205c(jSONObject2);
                        Pair m102835R = c19637j.m102835R(jSONObject2);
                        c31973j5 = (C31973j5) m102835R.first;
                        C11710g.this.m65277rq(c31973j5);
                        c32076q5 = (C32076q5) m102835R.second;
                        if (c32076q5.m154717f() > 0) {
                            C0943w c0943w = C0943w.f3447a;
                            AbstractC19074t.m100205c(c31973j5);
                            AbstractC19074t.m100205c(c32076q5);
                            c0943w.m4477n(c31973j5, c32076q5);
                        }
                        if (z11 && c31973j5.m153772m0()) {
                            C0943w.f3447a.m4467a(c31973j5, str);
                        }
                        if (c31973j5.m153716G() == 0) {
                            C7959d.Companion.m41850e().m41787g3(C11710g.this.m65221Qp().m17944I0(), c31973j5.m153793y());
                        }
                        ((InterfaceC11707d) C11710g.this.m103742Dp()).mo65183d0();
                        C11710g.this.m65276qq(false);
                        C18922m.m99141t().m99151U("group_" + c31973j5.m153781r(), c31973j5.m153756e());
                        c19637j.m102838U(jSONObject2);
                        m65219Op = C11710g.this.m65219Op();
                        if (m65219Op == null) {
                            AbstractC19074t.m100205c(c31973j5);
                            m65219Op.mo64140Wk(c31973j5);
                            return;
                        }
                        return;
                    }
                    str = "";
                    m65272lq = C11710g.this.m65272lq();
                    if (m65272lq == null) {
                    }
                    C19637j c19637j2 = C19637j.f97466a;
                    AbstractC19074t.m100205c(jSONObject2);
                    Pair m102835R2 = c19637j2.m102835R(jSONObject2);
                    c31973j5 = (C31973j5) m102835R2.first;
                    C11710g.this.m65277rq(c31973j5);
                    c32076q5 = (C32076q5) m102835R2.second;
                    if (c32076q5.m154717f() > 0) {
                    }
                    if (z11) {
                        C0943w.f3447a.m4467a(c31973j5, str);
                    }
                    if (c31973j5.m153716G() == 0) {
                    }
                    ((InterfaceC11707d) C11710g.this.m103742Dp()).mo65183d0();
                    C11710g.this.m65276qq(false);
                    C18922m.m99141t().m99151U("group_" + c31973j5.m153781r(), c31973j5.m153756e());
                    c19637j2.m102838U(jSONObject2);
                    m65219Op = C11710g.this.m65219Op();
                    if (m65219Op == null) {
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.rightmenu.g$c */
    /* loaded from: classes5.dex */
    public static final class c implements InterfaceC24223a {

        /* renamed from: b */
        final /* synthetic */ InterfaceC11707d f60908b;

        c(InterfaceC11707d interfaceC11707d) {
            this.f60908b = interfaceC11707d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public static final void m65288e(C11710g c11710g, InterfaceC11707d interfaceC11707d) {
            AbstractC19074t.m100208f(c11710g, "this$0");
            AbstractC19074t.m100208f(interfaceC11707d, "$mvpView");
            C31973j5 m65272lq = c11710g.m65272lq();
            if (m65272lq != null && !TextUtils.isEmpty(m65272lq.m153756e())) {
                interfaceC11707d.mo65176Xt(m65272lq, c11710g.m65274nq());
            }
        }

        @Override // od0.InterfaceC24223a
        /* renamed from: a */
        public void mo50006a(Intent intent) {
            AbstractC19074t.m100208f(intent, "intent");
            try {
                this.f60908b.mo65162Ht(false, false);
                C31973j5 m65272lq = C11710g.this.m65272lq();
                if (m65272lq != null) {
                    String stringExtra = intent.getStringExtra("urlUploadedServer");
                    if (stringExtra != null) {
                        if (stringExtra.length() == 0) {
                        }
                        C0943w.f3447a.m4481u(m65272lq.m153781r(), stringExtra);
                        AbstractC23184q2.m119438C(m65272lq.m153781r());
                    }
                    stringExtra = C11710g.this.m65274nq();
                    C0943w.f3447a.m4481u(m65272lq.m153781r(), stringExtra);
                    AbstractC23184q2.m119438C(m65272lq.m153781r());
                }
                C11710g.this.m65278sq("");
                C11710g.this.m65275pq("");
                C11710g.this.m65280uq(false);
                if (m65272lq != null) {
                    C18922m.m99141t().m99151U("group_" + m65272lq.m153781r(), m65272lq.m153756e());
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        @Override // od0.InterfaceC24223a
        /* renamed from: b */
        public void mo50007b(String str) {
            AbstractC19074t.m100208f(str, "errorText");
        }

        @Override // od0.InterfaceC24223a
        /* renamed from: c */
        public void mo50008c(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "error_message");
            try {
                if (c20096c.m104491c() == 17007) {
                    C11710g.this.m65278sq("");
                    C11710g.this.m65275pq("");
                    this.f60908b.mo65162Ht(false, false);
                    final InterfaceC11707d interfaceC11707d = this.f60908b;
                    final C11710g c11710g = C11710g.this;
                    interfaceC11707d.mo70710wy(new Runnable() { // from class: h60.l
                        @Override // java.lang.Runnable
                        public final void run() {
                            C11710g.c.m65288e(C11710g.this, interfaceC11707d);
                        }
                    });
                } else {
                    this.f60908b.mo65162Ht(false, true);
                }
                C11710g.this.m65280uq(false);
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11710g(InterfaceC11707d interfaceC11707d) {
        super(interfaceC11707d);
        AbstractC19074t.m100208f(interfaceC11707d, "mvpView");
        this.f60895G = "";
        this.f60897I = "";
        this.f60899K = "";
        this.f60902N = new c(interfaceC11707d);
    }

    /* renamed from: oq */
    private final boolean m65270oq(String str) {
        C28212v6 m141460p;
        C28212v6 m141460p2 = AbstractC28025b8.m141460p(str + "." + this.f60899K);
        if (m141460p2 != null && !m141460p2.m142165d() && m141460p2.f131580f) {
            return true;
        }
        if (m141460p2 == null && (m141460p = AbstractC28025b8.m141460p(str)) != null && !m141460p.m142165d() && m141460p.f131580f) {
            return true;
        }
        return false;
    }

    /* renamed from: vq */
    private final void m65271vq() {
        int i11;
        C31973j5 c31973j5 = this.f60900L;
        if (c31973j5 == null) {
            return;
        }
        if (c31973j5.m153761g0() && !c31973j5.m153742T()) {
            if (c31973j5.m153747Y()) {
                i11 = AbstractC8020f0.str_error_lock_community_avatar;
            } else {
                i11 = AbstractC8020f0.str_error_lock_group_avatar;
            }
            ToastUtils.showMess(AbstractC23136l9.m118743r0(i11));
            return;
        }
        ChatInfoView.InterfaceC11697a m65219Op = m65219Op();
        AbstractC19074t.m100205c(m65219Op);
        m65219Op.mo64178p8();
    }

    @Override // com.zing.zalo.p077ui.chat.rightmenu.AbstractC11704a, com.zing.zalo.p077ui.chat.rightmenu.InterfaceC11706c
    /* renamed from: B7 */
    public String mo65211B7() {
        return this.f60899K;
    }

    @Override // com.zing.zalo.p077ui.chat.rightmenu.AbstractC11704a, com.zing.zalo.p077ui.chat.rightmenu.InterfaceC11706c
    /* renamed from: F0 */
    public void mo65212F0(String str, String str2) {
        AbstractC19074t.m100208f(str, "path");
        AbstractC19074t.m100208f(str2, "cameraLog");
        try {
            C31973j5 c31973j5 = this.f60900L;
            if (c31973j5 == null || this.f60896H) {
                return;
            }
            this.f60896H = true;
            if (!TextUtils.isEmpty(str)) {
                this.f60897I = str;
                this.f60895G = str2;
                ((InterfaceC11707d) m103742Dp()).mo65176Xt(c31973j5, this.f60897I);
                ((InterfaceC11707d) m103742Dp()).mo65162Ht(true, false);
                C24730d.m128465h().m128477p(str, EnumC24734h.GROUP_AVATAR, Integer.parseInt(c31973j5.m153781r()), true, str2, null, this.f60902N);
            }
        } catch (NumberFormatException e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.rightmenu.AbstractC11704a, com.zing.zalo.p077ui.chat.rightmenu.InterfaceC11706c
    /* renamed from: Fg */
    public void mo65213Fg() {
        try {
            if (!TextUtils.isEmpty(this.f60897I)) {
                mo65212F0(this.f60897I, this.f60895G);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.rightmenu.AbstractC11704a
    /* renamed from: Pp */
    protected List mo65220Pp() {
        String m153765j;
        boolean z11;
        boolean z12;
        int i11;
        int i12;
        int m127178g0;
        boolean z13;
        int i13;
        int i14;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        int i15;
        int i16;
        int i17;
        int i18;
        String m118743r0;
        this.f60900L = C0943w.f3447a.m4472f(this.f60899K);
        ArrayList arrayList = new ArrayList();
        C31973j5 c31973j5 = this.f60900L;
        if (c31973j5 != null) {
            ArrayList arrayList2 = new ArrayList();
            if (m65227Xp()) {
                arrayList2.add(new ChatInfoAdapter.C11692g(26, AbstractC8020f0.chat_menu_popup_search_message_v2, false, true));
            }
            ChatInfoAdapter.C11692g c11692g = new ChatInfoAdapter.C11692g(60, AbstractC8020f0.str_invite_member_v2, false, true);
            c11692g.f60822m = m65270oq("tip.csc.rightmenu.addmember");
            arrayList2.add(c11692g);
            arrayList2.add(new ChatInfoAdapter.C11692g(14, AbstractC8020f0.str_optionM_bg_v2, false, true));
            boolean m2033i = C0804b.m2025g().m2033i(m65221Qp().m17944I0());
            ChatInfoAdapter.C11692g c11692g2 = new ChatInfoAdapter.C11692g(22, AbstractC8020f0.str_setting_on_notif_newmsg_v2);
            c11692g2.m65120f(true, !m2033i);
            arrayList2.add(c11692g2);
            arrayList.add(new ChatInfoAdapter.C11693h(arrayList2, false));
            ChatInfoView.InterfaceC11697a m65219Op = m65219Op();
            if (m65219Op != null && m65219Op.mo64103Fb(70, false)) {
                String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_e2ee_title_right_menu);
                AbstractC19074t.m100207e(m118743r02, "getString(...)");
                SpannableString spannableString = new SpannableString(m118743r02);
                if (AbstractC0924m0.m3775e9()) {
                    spannableString = new SpannableString(m118743r02 + "  ");
                    Drawable m118665N = AbstractC23136l9.m118665N(((InterfaceC11707d) m103742Dp()).mo65180a3(), AbstractC16803z.ic_beta);
                    if (m118665N != null) {
                        m118665N.setBounds(0, 0, 100, 38);
                    }
                    AbstractC19074t.m100205c(m118665N);
                    spannableString.setSpan(new ImageSpan(m118665N, 1), m118743r02.length() + 1, spannableString.length(), 17);
                }
                ChatInfoAdapter.C11692g c11692g3 = new ChatInfoAdapter.C11692g(70, AbstractC16803z.ic_e2ee_right_menu_setting, (Spannable) spannableString, false);
                int m154140q1 = C31986k3.f147083a.m154140q1(m65221Qp().m17944I0());
                if (m154140q1 != 3 && m154140q1 != 4) {
                    if (m154140q1 != 5 && m154140q1 != 6) {
                        m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_e2ee_state_not_upgraded);
                    } else {
                        c11692g3.f60827r = true;
                        m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_e2ee_state_upgraded);
                    }
                } else {
                    m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_e2ee_state_upgrade_in_progress);
                }
                c11692g3.f60814e = m118743r0;
                arrayList.add(c11692g3);
            }
            if (m65223Rp() != null) {
                C31862c m65223Rp = m65223Rp();
                AbstractC19074t.m100205c(m65223Rp);
                if (m65223Rp.m153155h()) {
                    C31862c m65223Rp2 = m65223Rp();
                    AbstractC19074t.m100205c(m65223Rp2);
                    if (m65223Rp2.m153149a()) {
                        C31862c m65223Rp3 = m65223Rp();
                        AbstractC19074t.m100205c(m65223Rp3);
                        if (m65223Rp3.f146308a == 8) {
                            arrayList.add(new ChatInfoAdapter.C11687b());
                            arrayList.add(new ChatInfoAdapter.C11691f(m65223Rp()));
                        }
                    }
                }
            }
            if (!c31973j5.m153742T() && TextUtils.isEmpty(c31973j5.m153765j()) && c31973j5.m153761g0()) {
                z12 = false;
            } else {
                if (TextUtils.isEmpty(c31973j5.m153765j())) {
                    if (c31973j5.m153747Y()) {
                        i11 = AbstractC8020f0.str_add_community_description;
                    } else {
                        i11 = AbstractC8020f0.str_add_group_desc;
                    }
                    m153765j = AbstractC23136l9.m118743r0(i11);
                    z11 = false;
                } else {
                    m153765j = c31973j5.m153765j();
                    z11 = true;
                }
                ChatInfoAdapter.C11692g c11692g4 = new ChatInfoAdapter.C11692g(13, 38, AbstractC16803z.ic_info_1, m153765j, false);
                c11692g4.f60817h = z11;
                arrayList.add(c11692g4);
                z12 = true;
            }
            if (!TextUtils.isEmpty(c31973j5.m153728M())) {
                ChatInfoAdapter.C11692g c11692g5 = new ChatInfoAdapter.C11692g(67, AbstractC16803z.ic_trophy, AbstractC8020f0.str_group_summary, z12, !z12);
                c11692g5.f60818i = m65270oq("tip.group.summary");
                arrayList.add(c11692g5);
            }
            if (c31973j5.m153770l0()) {
                m65216Mp(arrayList, true);
            }
            if (c31973j5.m153747Y()) {
                i12 = AbstractC8020f0.str_community_calendar;
            } else {
                i12 = AbstractC8020f0.str_optionM_group_calendar;
            }
            arrayList.add(new ChatInfoAdapter.C11692g(55, AbstractC16803z.ic_calendar, i12, true, false));
            m65240kq(arrayList.size());
            arrayList.add(new ChatInfoAdapter.C11692g(56, AbstractC16803z.ic_pin, AbstractC8020f0.str_pinned_message, true, false));
            arrayList.add(new ChatInfoAdapter.C11692g(63, AbstractC16803z.ic_poll, AbstractC8020f0.str_option_right_menu_poll, true, false));
            m65236hq(arrayList.size());
            if (c31973j5.m153742T()) {
                if (c31973j5.m153747Y()) {
                    i18 = AbstractC8020f0.str_community_settings;
                } else {
                    i18 = AbstractC8020f0.str_other_setting_group_v2;
                }
                arrayList.add(new ChatInfoAdapter.C11692g(53, AbstractC16803z.ic_settings, i18, false, true));
            }
            String m118746s0 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_view_full_member, Integer.valueOf(c31973j5.m153732O()));
            AbstractC19074t.m100207e(m118746s0, "getString(...)");
            m127178g0 = AbstractC24342w.m127178g0(m118746s0, "(" + c31973j5.m153732O() + ")", 0, false, 6, null);
            int length = m118746s0.length();
            ChatInfoAdapter.C11692g c11692g6 = new ChatInfoAdapter.C11692g(62, AbstractC16803z.ic_group, (Spannable) new SpannableString(m118746s0), false);
            c11692g6.m65119e(((InterfaceC11707d) m103742Dp()).mo65180a3(), m127178g0, length);
            arrayList.add(c11692g6);
            if (c31973j5.m153742T()) {
                ChatInfoAdapter.C11692g c11692g7 = new ChatInfoAdapter.C11692g(61, AbstractC16803z.ic_group_approve, AbstractC8020f0.str_membership_approval, true, false);
                c11692g7.f60823n = c31973j5.m153713E();
                arrayList.add(c11692g7);
            }
            if (C26691l.m137131d() == 1) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c31973j5.m153747Y()) {
                i13 = AbstractC8020f0.str_community_invite_link;
            } else {
                i13 = AbstractC8020f0.str_group_invite_link;
            }
            if (z13) {
                i14 = AbstractC16803z.ic_qr_line_24;
            } else {
                i14 = AbstractC16803z.ic_link;
            }
            int i19 = i14;
            if (z13) {
                i13 = AbstractC8020f0.str_qr_share_group_menu_label;
            }
            ChatInfoAdapter.C11692g c11692g8 = new ChatInfoAdapter.C11692g(48, i19, i13, true, false);
            if (TextUtils.isEmpty(c31973j5.m153773n())) {
                c11692g8.f60814e = AbstractC23136l9.m118743r0(AbstractC8020f0.str_subtitle_group_invite_link);
            } else {
                c11692g8.f60814e = c31973j5.m153773n();
            }
            arrayList.add(c11692g8);
            if (C20379a.f100400a.m106160c(c31973j5) || ((InterfaceC11707d) m103742Dp()).mo65185dh() == 75) {
                arrayList.add(new ChatInfoAdapter.C11692g(75, AbstractC16803z.ic_right_menu_chevron_double_up_line_24, AbstractC8020f0.str_right_menu_upgrade_to_community, true, false));
            }
            C18932a c18932a = C18932a.f94442a;
            if (c18932a.m99182f()) {
                C7860a.b bVar = C7860a.Companion;
                ArrayList m40274R = bVar.m40303b().m40274R(m65221Qp().m17944I0());
                ChatInfoAdapter.C11692g c11692g9 = new ChatInfoAdapter.C11692g(69, AbstractC16803z.ic_setting_chat_label, AbstractC8020f0.str_right_menu_setting_chat_labbel, false, true);
                if (!m40274R.isEmpty()) {
                    c11692g9.f60814e = bVar.m40303b().m40272P(((C18430a) m40274R.get(0)).m97661a());
                    z14 = false;
                } else {
                    c11692g9.f60814e = bVar.m40303b().m40272P(-1);
                    z14 = true;
                }
                arrayList.add(c11692g9);
                z15 = true;
            } else {
                z14 = true;
                z15 = false;
            }
            if (c18932a.m99184h()) {
                List m99228p = C18935d.Companion.m99234a().m99228p(m65221Qp().m17944I0());
                ChatInfoAdapter.C11692g c11692g10 = new ChatInfoAdapter.C11692g(73, AbstractC16803z.ic_setting_chat_tag, AbstractC8020f0.str_right_menu_setting_chat_tag, z15, !z15);
                if (!m99228p.isEmpty()) {
                    c11692g10.f60814e = ((C20060c) m99228p.get(0)).m104216e();
                } else {
                    c11692g10.f60814e = AbstractC23136l9.m118743r0(AbstractC8020f0.str_right_menu_setting_chat_tag_desc_empty);
                }
                arrayList.add(c11692g10);
                z15 = true;
            }
            if (!AbstractC21935u.m114550q(m65221Qp().m17944I0()) && z14) {
                ChatInfoAdapter.C11692g c11692g11 = new ChatInfoAdapter.C11692g(46, AbstractC16803z.ic_pin, AbstractC8020f0.str_pin_message_title, z15, !z15);
                c11692g11.m65120f(true, AbstractC23089h6.m118442j(m65221Qp().m17944I0()));
                arrayList.add(c11692g11);
                m65235gq(true);
                z16 = true;
            } else {
                z16 = z15;
            }
            m65239jq(arrayList.size());
            if (!m65226Wp() && z14) {
                z17 = false;
            } else {
                z17 = true;
            }
            m65235gq(z17);
            if (m65228Yp()) {
                ChatInfoAdapter.C11692g c11692g12 = new ChatInfoAdapter.C11692g(29, AbstractC16803z.ic_hide, AbstractC8020f0.str_hide_message, z16, !z16);
                c11692g12.m65120f(true, true);
                arrayList.add(c11692g12);
            } else {
                ChatInfoAdapter.C11692g c11692g13 = new ChatInfoAdapter.C11692g(50, AbstractC16803z.ic_hide, AbstractC8020f0.str_hide_message, z16, !z16);
                c11692g13.m65120f(true, false);
                arrayList.add(c11692g13);
            }
            ChatInfoView.InterfaceC11697a m65219Op2 = m65219Op();
            if (m65219Op2 != null && m65219Op2.mo64103Fb(68, false)) {
                ChatInfoAdapter.C11692g c11692g14 = new ChatInfoAdapter.C11692g(68, AbstractC16803z.ic_countdown, AbstractC8020f0.str_disappear_messages, z16, !z16);
                C32037n9 c32037n9 = C32037n9.f147516a;
                c11692g14.f60814e = c32037n9.m154555m(c32037n9.m154558r(m65221Qp().m17944I0()), true);
                arrayList.add(c11692g14);
            }
            ChatInfoAdapter.C11692g c11692g15 = new ChatInfoAdapter.C11692g(52, AbstractC16803z.ic_settings_personal, AbstractC8020f0.str_other_setting_personal, true, false);
            if (c31973j5.m153742T()) {
                c11692g15.f60818i = false;
            }
            arrayList.add(c11692g15);
            boolean m153747Y = c31973j5.m153747Y();
            if (m153747Y) {
                arrayList.add(new ChatInfoAdapter.C11692g(74, AbstractC16803z.ic_question_line_24, AbstractC8020f0.str_about_communities, false, true));
            }
            arrayList.add(new ChatInfoAdapter.C11692g(39, AbstractC16803z.ic_warning, AbstractC8020f0.str_reportabuse, m153747Y, !m153747Y));
            if (c31973j5.m153778p0() && c31973j5.m153732O() > 1) {
                if (c31973j5.m153747Y()) {
                    i17 = AbstractC8020f0.str_change_community_owner;
                } else {
                    i17 = AbstractC8020f0.str_group_change_owner;
                }
                arrayList.add(new ChatInfoAdapter.C11692g(58, AbstractC16803z.ic_admin, i17));
            }
            if (AbstractC23306f.m120732z1().m109408o()) {
                arrayList.add(new ChatInfoAdapter.C11692g(72, AbstractC16803z.ic_storage_line_24, AbstractC8020f0.str_conversation_storage));
            }
            arrayList.add(new ChatInfoAdapter.C11692g(2, AbstractC16803z.ic_trash, AbstractC8020f0.str_optionM_clearallMsg_v3));
            if (c31973j5.m153747Y()) {
                i15 = AbstractC8020f0.str_leave_community;
            } else {
                i15 = AbstractC8020f0.str_group_leave;
            }
            arrayList.add(new ChatInfoAdapter.C11692g(8, AbstractC16803z.ic_sign_out, i15));
            if (c31973j5.m153778p0() && c31973j5.m153716G() == 0) {
                int i21 = AbstractC16803z.ic_disband;
                if (c31973j5.m153747Y()) {
                    i16 = AbstractC8020f0.str_community_settings_delete_community;
                } else {
                    i16 = AbstractC8020f0.str_group_disband;
                }
                arrayList.add(new ChatInfoAdapter.C11692g(40, i21, i16));
            }
        } else {
            if (m65228Yp()) {
                ChatInfoAdapter.C11692g c11692g16 = new ChatInfoAdapter.C11692g(29, AbstractC16803z.ic_hide, AbstractC8020f0.str_hide_message);
                c11692g16.m65120f(true, true);
                arrayList.add(c11692g16);
            } else {
                ChatInfoAdapter.C11692g c11692g17 = new ChatInfoAdapter.C11692g(50, AbstractC16803z.ic_hide, AbstractC8020f0.str_hide_message);
                c11692g17.m65120f(true, false);
                arrayList.add(c11692g17);
            }
            arrayList.add(new ChatInfoAdapter.C11692g(2, AbstractC16803z.ic_trash, AbstractC8020f0.str_optionM_clearallMsg_v3));
        }
        return arrayList;
    }

    @Override // com.zing.zalo.p077ui.chat.rightmenu.InterfaceC11706c
    /* renamed from: Ql */
    public void mo65253Ql(boolean z11) {
        try {
            C31973j5 c31973j5 = this.f60900L;
            if (c31973j5 == null) {
                return;
            }
            if (c31973j5.m153761g0()) {
                if (c31973j5.m153742T()) {
                }
            }
            m65271vq();
            if (z11) {
                if (c31973j5.m153716G() == 0) {
                    if (m65219Op() != null) {
                        ChatInfoView.InterfaceC11697a m65219Op = m65219Op();
                        AbstractC19074t.m100205c(m65219Op);
                        m65219Op.mo64096Bb(2, "rmenu", 0, "rmenu_name_empty", false, 2, new String[0]);
                    }
                } else {
                    ChatInfoView.InterfaceC11697a m65219Op2 = m65219Op();
                    AbstractC19074t.m100205c(m65219Op2);
                    m65219Op2.mo64096Bb(2, "rmenu", 0, "rmenu_name_edit", false, 2, new String[0]);
                }
            } else if (m65219Op() != null) {
                ChatInfoView.InterfaceC11697a m65219Op3 = m65219Op();
                AbstractC19074t.m100205c(m65219Op3);
                m65219Op3.mo64096Bb(2, "rmenu", 0, "rmenu_name_edit", false, 2, new String[0]);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.rightmenu.AbstractC11704a
    /* renamed from: Tp */
    protected boolean mo65224Tp() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(AbstractC28025b8.m141456l(AbstractC28025b8.f130867x));
        arrayList.addAll(AbstractC28025b8.m141459o("tip.csc.sharedmedia.album." + this.f60899K));
        arrayList.addAll(AbstractC28025b8.m141459o("tip.csc.sharedmedia.media." + this.f60899K));
        arrayList.addAll(AbstractC28025b8.m141459o("tip.csc.sharedmedia.link." + this.f60899K));
        arrayList.addAll(AbstractC28025b8.m141459o("tip.csc.sharedmedia.document." + this.f60899K));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C28212v6 c28212v6 = (C28212v6) it.next();
            if (c28212v6 != null && c28212v6.m142167f() && c28212v6.f131580f) {
                return true;
            }
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.chat.rightmenu.AbstractC11704a, com.zing.zalo.p077ui.chat.rightmenu.InterfaceC11706c
    /* renamed from: Vb */
    public void mo65225Vb(String str) {
        boolean m127149O;
        int i11;
        AbstractC19074t.m100208f(str, "name");
        try {
            C31973j5 c31973j5 = this.f60900L;
            if (c31973j5 != null) {
                if (!TextUtils.isEmpty(c31973j5.m153781r())) {
                    if (AbstractC25495a.m132079d(m65221Qp().m17944I0())) {
                        if (!TextUtils.isEmpty(str)) {
                            m127149O = AbstractC24342w.m127149O(str, "%", false, 2, null);
                            if (m127149O) {
                                ToastUtils.m89260h(17001, c31973j5.m153747Y());
                                return;
                            }
                            if (AbstractC19074t.m100204b(str, c31973j5.m153793y()) || this.f60898J) {
                                return;
                            }
                            this.f60898J = true;
                            ((InterfaceC11707d) m103742Dp()).mo65160G0();
                            C0766k c0766k = new C0766k();
                            c0766k.mo1704o8(new a(c31973j5, str));
                            c0766k.mo1582Y8(c31973j5.m153781r(), str, null, -1, null);
                            return;
                        }
                        if (c31973j5.m153747Y()) {
                            i11 = AbstractC8020f0.str_community_emptyname;
                        } else {
                            i11 = AbstractC8020f0.str_group_emptyname;
                        }
                        ToastUtils.showMess(AbstractC23136l9.m118743r0(i11));
                        return;
                    }
                    throw new IllegalAccessException("Current chat profile must be group");
                }
                throw new IllegalArgumentException("Invalid Input".toString());
            }
            throw new IllegalArgumentException("Invalid Input".toString());
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.rightmenu.AbstractC11704a
    /* renamed from: Zp */
    public void mo65229Zp() {
        try {
            C31973j5 c31973j5 = this.f60900L;
            if (c31973j5 == null) {
                return;
            }
            C24730d m128465h = C24730d.m128465h();
            C19067n0 c19067n0 = C19067n0.f94947a;
            String format = String.format("%s_%d", Arrays.copyOf(new Object[]{CoreUtility.f89233i, Integer.valueOf(Integer.parseInt(c31973j5.m153781r()))}, 2));
            AbstractC19074t.m100207e(format, "format(...)");
            C24732f m128473g = m128465h.m128473g(format);
            if (m128473g != null) {
                if (m128473g.f118782d == EnumC24733g.UPLOADING) {
                    this.f60896H = true;
                    ((InterfaceC11707d) m103742Dp()).mo65162Ht(true, false);
                } else {
                    ((InterfaceC11707d) m103742Dp()).mo65162Ht(false, true);
                }
                String str = m128473g.f118779a;
                AbstractC19074t.m100207e(str, "localPath");
                this.f60897I = str;
                String str2 = m128473g.f118785g;
                AbstractC19074t.m100207e(str2, "cameraLog");
                this.f60895G = str2;
                ((InterfaceC11707d) m103742Dp()).mo65176Xt(c31973j5, this.f60897I);
                m128473g.m128493m(this.f60902N);
                return;
            }
            ((InterfaceC11707d) m103742Dp()).mo65162Ht(false, false);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.rightmenu.AbstractC11704a
    /* renamed from: aq */
    protected void mo65230aq() {
        boolean z11;
        C31973j5 c31973j5 = this.f60900L;
        if (c31973j5 == null) {
            return;
        }
        if (c31973j5.m153761g0() && !c31973j5.m153742T()) {
            z11 = false;
        } else {
            z11 = true;
        }
        ((InterfaceC11707d) m103742Dp()).mo65176Xt(c31973j5, "");
        if (c31973j5.m153716G() == 0 && z11) {
            ((InterfaceC11707d) m103742Dp()).mo65187hf("", c31973j5.m153747Y());
        } else {
            ((InterfaceC11707d) m103742Dp()).mo65187hf(c31973j5.m153793y(), c31973j5.m153747Y());
        }
        if (z11) {
            ((InterfaceC11707d) m103742Dp()).mo65156Bk(!TextUtils.isEmpty(c31973j5.m153793y()));
            ((InterfaceC11707d) m103742Dp()).mo65199vb(true);
        } else {
            ((InterfaceC11707d) m103742Dp()).mo65156Bk(false);
            ((InterfaceC11707d) m103742Dp()).mo65199vb(false);
        }
        C28203u6 c28203u6 = C28203u6.f131407a;
        if (AbstractC30201b.m148949b(c31973j5, C28203u6.m141800i(c28203u6, c31973j5.m153758f(), false, 2, null))) {
            ContactProfile m141800i = C28203u6.m141800i(c28203u6, c31973j5.m153758f(), false, 2, null);
            if (m141800i != null) {
                InterfaceC11707d interfaceC11707d = (InterfaceC11707d) m103742Dp();
                boolean m153747Y = c31973j5.m153747Y();
                String str = m141800i.f42434r;
                AbstractC19074t.m100207e(str, "uid");
                String m118085e = AbstractC23028c0.m118085e(m141800i, true, AbstractC8020f0.str_me);
                AbstractC19074t.m100207e(m118085e, "getDisplayName(...)");
                interfaceC11707d.mo65179Zk(m153747Y, str, m118085e);
                return;
            }
            return;
        }
        if (c31973j5.m153747Y()) {
            ((InterfaceC11707d) m103742Dp()).mo65193rz(true);
        } else {
            ((InterfaceC11707d) m103742Dp()).mo65184db(false, "");
        }
    }

    @Override // com.zing.zalo.p077ui.chat.rightmenu.InterfaceC11706c
    /* renamed from: lk */
    public void mo65254lk() {
        try {
            C31973j5 c31973j5 = this.f60900L;
            if (c31973j5 == null) {
                return;
            }
            if (!c31973j5.m153786t0()) {
                mo65246rl();
                if (m65219Op() != null) {
                    ChatInfoView.InterfaceC11697a m65219Op = m65219Op();
                    AbstractC19074t.m100205c(m65219Op);
                    m65219Op.mo64096Bb(2, "rmenu", 0, "rmenu_ava_default", false, 2, new String[0]);
                    return;
                }
                return;
            }
            if (m65219Op() != null) {
                String m153771m = c31973j5.m153771m();
                if (m153771m != null) {
                    ChatInfoView.InterfaceC11697a m65219Op2 = m65219Op();
                    AbstractC19074t.m100205c(m65219Op2);
                    m65219Op2.mo64195xk(m153771m);
                }
                ChatInfoView.InterfaceC11697a m65219Op3 = m65219Op();
                AbstractC19074t.m100205c(m65219Op3);
                m65219Op3.mo64096Bb(2, "rmenu", 0, "rmenu_ava", false, 2, new String[0]);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: lq */
    public final C31973j5 m65272lq() {
        return this.f60900L;
    }

    /* renamed from: mq */
    public final String m65273mq() {
        return this.f60899K;
    }

    @Override // com.zing.zalo.p077ui.chat.rightmenu.AbstractC11704a, com.zing.zalo.p077ui.chat.rightmenu.InterfaceC11706c
    /* renamed from: nj */
    public void mo65242nj() {
        mo65243nm();
        C18418z.m97607b().m97608a(this.f60899K);
    }

    @Override // com.zing.zalo.p077ui.chat.rightmenu.AbstractC11704a, com.zing.zalo.p077ui.chat.rightmenu.InterfaceC11706c
    /* renamed from: nm */
    public void mo65243nm() {
        if (this.f60901M) {
            return;
        }
        this.f60901M = true;
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new b());
        c0766k.mo1680l6(this.f60899K, 0);
    }

    /* renamed from: nq */
    public final String m65274nq() {
        return this.f60897I;
    }

    @Override // com.zing.zalo.p077ui.chat.rightmenu.AbstractC11704a, com.zing.zalo.p077ui.chat.rightmenu.InterfaceC11706c
    /* renamed from: o4 */
    public void mo65244o4(C3535c c3535c) {
        AbstractC19074t.m100208f(c3535c, "chat");
        super.mo65244o4(c3535c);
        String m132088m = AbstractC25495a.m132088m(c3535c.m17944I0());
        this.f60899K = m132088m;
        this.f60901M = false;
        if (!TextUtils.isEmpty(m132088m)) {
            C31973j5 m4472f = C0943w.f3447a.m4472f(this.f60899K);
            this.f60900L = m4472f;
            if (m4472f != null) {
                if ((m4472f.m153732O() >= 4 && m4472f.m153767k().size() < 4) || m4472f.m153767k().isEmpty() || m4472f.m153783s() == 0 || System.currentTimeMillis() - m4472f.m153783s() > AbstractC23309i.m121450Ta() * 1000) {
                    mo65243nm();
                }
            } else {
                mo65243nm();
            }
        }
        this.f60897I = "";
        this.f60895G = "";
        this.f60896H = false;
        this.f60898J = false;
    }

    /* renamed from: pq */
    public final void m65275pq(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f60895G = str;
    }

    /* renamed from: qq */
    public final void m65276qq(boolean z11) {
        this.f60901M = z11;
    }

    @Override // com.zing.zalo.p077ui.chat.rightmenu.AbstractC11704a, com.zing.zalo.p077ui.chat.rightmenu.InterfaceC11706c
    /* renamed from: rl */
    public void mo65246rl() {
        if (m65219Op() != null) {
            ChatInfoView.InterfaceC11697a m65219Op = m65219Op();
            AbstractC19074t.m100205c(m65219Op);
            m65219Op.mo64192vi(false);
        }
    }

    /* renamed from: rq */
    public final void m65277rq(C31973j5 c31973j5) {
        this.f60900L = c31973j5;
    }

    /* renamed from: sq */
    public final void m65278sq(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f60897I = str;
    }

    /* renamed from: tq */
    public final void m65279tq(boolean z11) {
        this.f60898J = z11;
    }

    @Override // com.zing.zalo.p077ui.chat.rightmenu.AbstractC11704a, com.zing.zalo.p077ui.chat.rightmenu.InterfaceC11706c
    /* renamed from: um */
    public void mo65247um(ChatInfoAdapter.C11690e c11690e) {
        if (c11690e != null) {
            int m65115b = c11690e.m65115b();
            if (m65115b != 11) {
                if (m65115b != 13) {
                    super.mo65247um(c11690e);
                } else if (m65219Op() != null) {
                    ChatInfoView.InterfaceC11697a m65219Op = m65219Op();
                    AbstractC19074t.m100205c(m65219Op);
                    m65219Op.mo64137V(38);
                    C31973j5 m4472f = C0943w.f3447a.m4472f(this.f60899K);
                    if (m4472f != null) {
                        if (TextUtils.isEmpty(m4472f.m153765j())) {
                            ChatInfoView.InterfaceC11697a m65219Op2 = m65219Op();
                            AbstractC19074t.m100205c(m65219Op2);
                            m65219Op2.mo64096Bb(2, "rmenu", 0, "gr_desc_empty", false, 2, new String[0]);
                        } else {
                            ChatInfoView.InterfaceC11697a m65219Op3 = m65219Op();
                            AbstractC19074t.m100205c(m65219Op3);
                            m65219Op3.mo64096Bb(2, "rmenu", 0, "gr_desc", false, 2, new String[0]);
                        }
                    }
                }
            } else {
                AbstractC23647d.m123897g("777050010");
                AbstractC30228a.m149044a(c11690e);
                throw null;
            }
        }
    }

    /* renamed from: uq */
    public final void m65280uq(boolean z11) {
        this.f60896H = z11;
    }
}
