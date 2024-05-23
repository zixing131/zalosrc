package com.zing.zalo.p077ui.chat.chatrow;

import ag0.AbstractC0837p0;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import ck0.C3568b;
import com.androidquery.util.C3979l;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p062db.C7956b;
import com.zing.zalo.p077ui.chat.chatrow.ChatRowWebContent;
import com.zing.zalo.p077ui.widget.C13704p1;
import com.zing.zalo.p077ui.widget.reaction.ReactionPickerView;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.uidrawing.ModulesView;
import com.zing.zalo.zinstant.AbstractC17148f0;
import com.zing.zalo.zinstant.AbstractC17153h;
import com.zing.zalo.zinstant.AbstractC17155h1;
import com.zing.zalo.zinstant.AbstractC17158i1;
import com.zing.zalo.zinstant.C17170o;
import com.zing.zalo.zinstant.C17177r0;
import com.zing.zalo.zinstant.C17210v;
import com.zing.zalo.zinstant.ZaloZinstantRootLayout;
import com.zing.zalo.zinstant.exception.ZinstantException;
import com.zing.zalo.zinstant.utils.AbstractC17201m;
import com.zing.zalo.zinstant.view.ZinstantLayout;
import com.zing.zalo.zinstant.zom.node.ZOM;
import com.zing.zalo.zinstant.zom.node.ZOMDocument;
import com.zing.zalo.zinstant.zom.properties.ZOMAnchor;
import com.zing.zalo.zinstant.zom.properties.ZOMInsight;
import com.zing.zalo.zview.ZaloView;
import dj.C17945a0;
import dj.C17967h1;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fj.C18957a0;
import gg0.AbstractC19444a;
import gw.C19639k;
import ik0.AbstractC20597t;
import ik0.AbstractC20601x;
import ik0.C20588k;
import ik0.C20592o;
import ik0.C20599v;
import ik0.InterfaceC20578a0;
import java.util.concurrent.atomic.AtomicBoolean;
import l80.C22126c0;
import lb0.C22405g;
import lk0.C22504b;
import me0.AbstractC23136l9;
import me0.C23212s8;
import nj0.AbstractC23803b;
import nk0.C23855s0;
import org.json.JSONObject;
import p133ek.AbstractC18458a;
import p161fg.C18922m;
import p209hg.C20052c;
import p348mi.AbstractC23304d;
import p392oh.C24261h;
import p716zh.C32012m;
import pj0.AbstractC24788n;
import pj0.InterfaceC24785k;
import pj0.InterfaceC24787m;
import pm0.C24848g0;
import vg.AbstractC28207v1;

/* loaded from: classes5.dex */
public class ChatRowWebContent extends ChatMessageBase implements InterfaceC11475g0 {

    /* renamed from: I */
    protected int f59005I;

    /* renamed from: J */
    protected int f59006J;

    /* renamed from: K */
    protected ZaloZinstantRootLayout f59007K;

    /* renamed from: L */
    private View f59008L;

    /* renamed from: M */
    private View f59009M;

    /* renamed from: N */
    private C11448i f59010N;

    /* renamed from: O */
    protected C17945a0 f59011O;

    /* renamed from: P */
    private int f59012P;

    /* renamed from: Q */
    protected C17967h1 f59013Q;

    /* renamed from: R */
    private InterfaceC11446g f59014R;

    /* renamed from: S */
    private HandlerThread f59015S;

    /* renamed from: T */
    private Handler f59016T;

    /* renamed from: U */
    protected C22405g f59017U;

    /* renamed from: V */
    protected boolean f59018V;

    /* renamed from: W */
    private final AtomicBoolean f59019W;

    /* renamed from: a0 */
    Runnable f59020a0;

    /* renamed from: b0 */
    private boolean f59021b0;

    /* renamed from: c0 */
    private boolean f59022c0;

    /* renamed from: d0 */
    private float f59023d0;

    /* renamed from: e0 */
    private float f59024e0;

    /* renamed from: f0 */
    private final float f59025f0;

    /* renamed from: g0 */
    private final Handler f59026g0;

    /* renamed from: h0 */
    private final Runnable f59027h0;

    /* renamed from: i0 */
    AbstractC23803b f59028i0;

    /* renamed from: j0 */
    InterfaceC24787m f59029j0;

    /* renamed from: k0 */
    C20592o f59030k0;

    /* renamed from: l0 */
    C11447h.b f59031l0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRowWebContent$a */
    /* loaded from: classes5.dex */
    public class C11440a extends C17170o {
        C11440a() {
        }

        @Override // com.zing.zalo.zinstant.C17170o, com.zing.zalo.zinstant.view.InterfaceC17224a
        /* renamed from: c */
        public int mo35797c() {
            return ChatRowWebContent.this.getContainerWidth() - (((int) AbstractC17201m.m91828t(10.0f)) * 2);
        }

        @Override // com.zing.zalo.zinstant.C17170o, com.zing.zalo.zinstant.view.InterfaceC17224a
        /* renamed from: l */
        public String mo44290l() {
            return ChatRowWebContent.this.getIdentifyKeyForZinstant();
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRowWebContent$b */
    /* loaded from: classes5.dex */
    public class C11441b implements C3568b.b {

        /* renamed from: a */
        final /* synthetic */ C17945a0 f59033a;

        /* renamed from: b */
        final /* synthetic */ C17945a0 f59034b;

        /* renamed from: c */
        final /* synthetic */ C17177r0 f59035c;

        /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRowWebContent$b$a */
        /* loaded from: classes5.dex */
        class a extends C20588k {
            a() {
            }

            @Override // ik0.AbstractC20602y, ik0.InterfaceC20587j
            /* renamed from: a */
            public void mo61857a(AbstractC20601x abstractC20601x, Exception exc) {
            }

            @Override // ik0.AbstractC20602y, ik0.InterfaceC20587j
            /* renamed from: b */
            public void mo61858b(AbstractC20601x abstractC20601x, Exception exc) {
                C11441b c11441b = C11441b.this;
                ChatRowWebContent.this.m61800G(c11441b.f59033a, exc);
            }

            @Override // ik0.AbstractC20602y, ik0.InterfaceC20587j
            /* renamed from: c */
            public void mo61859c(AbstractC20601x abstractC20601x, InterfaceC20578a0 interfaceC20578a0) {
                C11441b c11441b = C11441b.this;
                ChatRowWebContent.this.m61801H(c11441b.f59033a, interfaceC20578a0);
            }

            @Override // ik0.AbstractC20602y, ik0.InterfaceC20587j
            /* renamed from: d */
            public void mo61860d(AbstractC20601x abstractC20601x, InterfaceC20578a0 interfaceC20578a0) {
                C11441b c11441b = C11441b.this;
                ChatRowWebContent.this.m61802I(c11441b.f59033a, interfaceC20578a0);
            }
        }

        C11441b(C17945a0 c17945a0, C17945a0 c17945a02, C17177r0 c17177r0) {
            this.f59033a = c17945a0;
            this.f59034b = c17945a02;
            this.f59035c = c17177r0;
        }

        @Override // ck0.C3568b.b
        /* renamed from: c */
        public void mo18129c(Exception exc) {
            int i11;
            C17945a0 c17945a0 = this.f59033a;
            ChatRowWebContent chatRowWebContent = ChatRowWebContent.this;
            if (c17945a0 != chatRowWebContent.f59011O) {
                return;
            }
            chatRowWebContent.f59013Q.m95592x(-1);
            AbstractC17153h.m91709a(exc);
            ChatRowWebContent.this.m61854n0();
            if (exc instanceof ZinstantException) {
                i11 = ((ZinstantException) exc).m91676a();
            } else {
                i11 = -999;
            }
            ChatRowWebContent.this.m61797B(this.f59033a, false, i11);
        }

        @Override // ck0.C3568b.b
        /* renamed from: d */
        public void mo18130d(C3568b c3568b) {
            C22504b m95583n = ChatRowWebContent.this.f59013Q.m95583n();
            if (m95583n == null) {
                ChatRowWebContent.this.m61854n0();
                ChatRowWebContent.this.m61797B(this.f59033a, false, -998);
                return;
            }
            String m95225p5 = this.f59034b.m95225p5(m95583n);
            AbstractC20597t mo107081a = AbstractC20597t.m107199b(m95583n, this.f59034b.m95225p5(m95583n), ChatRowWebContent.this.getIdentifyKeyForZinstant()).mo107081a();
            C20599v.m107204a().m107219m(AbstractC20601x.m107226d(mo107081a).mo107112l(AbstractC20601x.b.m107228a(ChatRowWebContent.this.f59007K.getPreferredWidth(), AbstractC17148f0.m91684c()).mo107129d(AbstractC18458a.f93019a).mo107128c(this.f59035c).mo107126a()).mo107107g(2).mo107105e(m95225p5).mo107108h(ChatRowWebContent.this.getIdentifyKeyForZinstant()).mo107103c(), new a());
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRowWebContent$c */
    /* loaded from: classes5.dex */
    public class C11442c implements C22405g.c {
        C11442c() {
        }

        @Override // lb0.C22405g.c
        /* renamed from: a */
        public void mo61132a() {
            ChatRowWebContent.this.invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRowWebContent$d */
    /* loaded from: classes5.dex */
    public class C11443d extends AbstractC23803b {
        C11443d() {
        }

        @Override // nj0.AbstractC23803b, ok0.InterfaceC24284a
        /* renamed from: a */
        public void mo61861a() {
            ChatRowWebContent chatRowWebContent = ChatRowWebContent.this;
            InterfaceC11530v interfaceC11530v = chatRowWebContent.f57166E;
            if (interfaceC11530v != null) {
                interfaceC11530v.mo62090j4(chatRowWebContent, null);
            }
        }

        @Override // nj0.AbstractC23803b, ok0.InterfaceC24284a
        /* renamed from: i */
        public void mo43842i(ZinstantLayout zinstantLayout, String str, String str2, String str3, String str4, ZOMInsight zOMInsight, String str5) {
            if (!TextUtils.isEmpty(str3)) {
                try {
                    if (ChatRowWebContent.this.f59014R != null) {
                        ChatRowWebContent.this.f59014R.mo61864a(str3, str4, ChatRowWebContent.this.f59007K.m91448V0(str3, str4, null), ChatRowWebContent.this.f59011O);
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRowWebContent$e */
    /* loaded from: classes5.dex */
    public class C11444e extends AbstractC24788n {
        C11444e() {
        }

        @Override // pj0.AbstractC24788n, pj0.InterfaceC24787m
        /* renamed from: a */
        public void mo61862a(String str, String str2, boolean z11, InterfaceC24785k interfaceC24785k) {
            if (ChatRowWebContent.this.f59014R != null) {
                ChatRowWebContent.this.f59014R.mo61864a(str, str2, ChatRowWebContent.this.f59007K.m91448V0(str, str2, interfaceC24785k), ChatRowWebContent.this.f59011O);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRowWebContent$f */
    /* loaded from: classes5.dex */
    public class C11445f extends C11447h.b {
        C11445f() {
        }

        @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowWebContent.C11447h.b, com.zing.zalo.p077ui.chat.chatrow.ChatRowWebContent.C11447h.a
        /* renamed from: a */
        public void mo61863a() {
            super.mo61863a();
            ChatRowWebContent.this.f59007K.getLayoutParams().width = ChatRowWebContent.this.f59010N.getWidth();
            ChatRowWebContent.this.f59007K.getLayoutParams().height = AbstractC23136l9.m118742r(85.0f);
            ChatRowWebContent.this.m61855o0();
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRowWebContent$g */
    /* loaded from: classes5.dex */
    public interface InterfaceC11446g {
        /* renamed from: a */
        void mo61864a(String str, String str2, AbstractC28207v1.h0 h0Var, C17945a0 c17945a0);
    }

    /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRowWebContent$h */
    /* loaded from: classes5.dex */
    public static class C11447h extends C16716d {

        /* renamed from: M0 */
        C22126c0 f59042M0;

        /* renamed from: N0 */
        C22126c0 f59043N0;

        /* renamed from: O0 */
        C16719g f59044O0;

        /* renamed from: P0 */
        Context f59045P0;

        /* renamed from: Q0 */
        a f59046Q0;

        /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRowWebContent$h$a */
        /* loaded from: classes5.dex */
        public interface a {
            /* renamed from: a */
            void mo61863a();
        }

        /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRowWebContent$h$b */
        /* loaded from: classes5.dex */
        public static class b implements a {

            /* renamed from: a */
            a f59047a = null;

            b() {
            }

            @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowWebContent.C11447h.a
            /* renamed from: a */
            public void mo61863a() {
                a aVar = this.f59047a;
                if (aVar != null) {
                    aVar.mo61863a();
                }
            }

            /* renamed from: b */
            void m61867b(a aVar) {
                this.f59047a = aVar;
            }
        }

        public C11447h(Context context, a aVar) {
            super(context);
            this.f59045P0 = context;
            this.f59046Q0 = aVar;
            C22126c0 c22126c0 = new C22126c0(context);
            this.f59042M0 = c22126c0;
            c22126c0.m111953A1(1);
            this.f59042M0.mo111964L1(AbstractC23136l9.m118742r(16.0f));
            this.f59042M0.m111962J1(C23212s8.m119607o(context, AbstractC16781w.msg_notify_404));
            this.f59042M0.m89106L().m89028L(-1, -2).m89029M(15).m89042Z(0, AbstractC23136l9.m118742r(8.0f), 0, AbstractC23136l9.m118742r(8.0f));
            this.f59042M0.m111959G1(this.f59045P0.getString(AbstractC8020f0.str_zinstant_layout_404_title));
            m89001g1(this.f59042M0);
            C16719g c16719g = new C16719g(context);
            this.f59044O0 = c16719g;
            c16719g.mo89161z0(C23212s8.m119607o(context, AbstractC16781w.ItemSeparatorColor));
            this.f59044O0.m89106L().m89028L(-1, 1).m89036T(AbstractC23136l9.m118742r(2.0f)).m89023G(this.f59042M0);
            m89001g1(this.f59044O0);
            C22126c0 c22126c02 = new C22126c0(context);
            this.f59043N0 = c22126c02;
            c22126c02.mo111965M1(1);
            this.f59043N0.mo111964L1(AbstractC23136l9.m118742r(13.0f));
            this.f59043N0.m111963K1(AbstractC23136l9.m118645D(this.f59042M0.getContext(), AbstractC16801x.color_press_blue_text));
            this.f59043N0.m111953A1(1);
            this.f59043N0.m89106L().m89028L(-1, AbstractC23136l9.m118742r(42.0f)).m89029M(15).m89042Z(0, AbstractC23136l9.m118742r(8.0f), 0, AbstractC23136l9.m118742r(8.0f)).m89023G(this.f59044O0);
            this.f59043N0.mo89099H0(true);
            this.f59043N0.m111959G1(this.f59045P0.getString(AbstractC8020f0.str_zinstant_layout_404_retry));
            this.f59043N0.mo89109M0(new C16719g.c() { // from class: com.zing.zalo.ui.chat.chatrow.x1
                public /* synthetic */ C11538x1() {
                }

                @Override // com.zing.zalo.uidrawing.C16719g.c
                /* renamed from: y */
                public final void mo929y(C16719g c16719g2) {
                    ChatRowWebContent.C11447h.this.m61866p1(c16719g2);
                }
            });
            m89001g1(this.f59043N0);
            m89106L().m89028L(-1, -2);
            m89085A0(AbstractC23136l9.m118665N(context, AbstractC16803z.bubble_left_background));
        }

        /* renamed from: p1 */
        public /* synthetic */ void m61866p1(C16719g c16719g) {
            a aVar = this.f59046Q0;
            if (aVar != null) {
                aVar.mo61863a();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRowWebContent$i */
    /* loaded from: classes5.dex */
    public static class C11448i extends ModulesView {

        /* renamed from: K */
        C11447h f59048K;

        public C11448i(Context context, C11447h.a aVar) {
            super(context);
            C11447h c11447h = new C11447h(context, aVar);
            this.f59048K = c11447h;
            mo69681L(c11447h);
        }
    }

    public ChatRowWebContent(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f59005I = 0;
        this.f59006J = 0;
        this.f59018V = false;
        this.f59019W = new AtomicBoolean(false);
        this.f59020a0 = new Runnable() { // from class: com.zing.zalo.ui.chat.chatrow.p1
            public /* synthetic */ RunnableC11512p1() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                ChatRowWebContent.this.m61816a0();
            }
        };
        this.f59021b0 = false;
        this.f59022c0 = false;
        this.f59025f0 = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.f59026g0 = new Handler();
        this.f59027h0 = new Runnable() { // from class: com.zing.zalo.ui.chat.chatrow.q1
            public /* synthetic */ RunnableC11516q1() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                ChatRowWebContent.this.m61826j0();
            }
        };
        this.f59028i0 = new C11443d();
        this.f59029j0 = new C11444e();
        this.f59030k0 = new C20592o(getContext(), C17210v.f87767a);
        this.f59031l0 = new C11445f();
    }

    /* renamed from: B */
    public void m61797B(C17945a0 c17945a0, boolean z11, int i11) {
        String str;
        C17967h1 c17967h1 = (C17967h1) c17945a0.m94929K2();
        if (c17967h1 == null) {
            return;
        }
        JSONObject m95580k = c17967h1.m95580k();
        if (m95580k == null) {
            str = "";
        } else {
            str = m95580k.optString("zinstantdata_id", "");
        }
        if (c17967h1.m95578i() && !this.f59019W.getAndSet(true)) {
            AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: com.zing.zalo.ui.chat.chatrow.v1

                /* renamed from: q */
                public final /* synthetic */ C17945a0 f59648q;

                /* renamed from: r */
                public final /* synthetic */ String f59649r;

                /* renamed from: s */
                public final /* synthetic */ boolean f59650s;

                /* renamed from: t */
                public final /* synthetic */ int f59651t;

                /* renamed from: u */
                public final /* synthetic */ C17967h1 f59652u;

                public /* synthetic */ RunnableC11532v1(C17945a0 c17945a02, String str2, boolean z112, int i112, C17967h1 c17967h12) {
                    r2 = c17945a02;
                    r3 = str2;
                    r4 = z112;
                    r5 = i112;
                    r6 = c17967h12;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ChatRowWebContent.this.m61810U(r2, r3, r4, r5, r6);
                }
            });
        }
    }

    /* renamed from: E */
    private int[] m61798E(ZOM zom, int i11, int i12, int i13, int i14) {
        int i15;
        int i16;
        ZOMAnchor zOMAnchor = zom.mAnchor;
        if (zOMAnchor == null) {
            zOMAnchor = new ZOMAnchor();
        }
        int i17 = zOMAnchor.mHorizontalAlign;
        if (i17 != 0) {
            if (i17 != 1) {
                if (i17 != 2) {
                    i15 = 0;
                } else {
                    i15 = (zom.f87947mX + zom.mWidth) - i13;
                }
            } else {
                i15 = (zom.f87947mX + (zom.mWidth / 2)) - (i13 / 2);
            }
        } else {
            i15 = zom.f87947mX;
        }
        int max = Math.max(Math.min(i15, i11 - i13), 0);
        int i18 = zOMAnchor.mVerticalAlign;
        if (i18 != 0) {
            if (i18 != 1) {
                if (i18 != 2) {
                    i16 = 0;
                } else {
                    i16 = (zom.f87948mY + zom.mHeight) - i14;
                }
            } else {
                i16 = (zom.f87948mY + (zom.mHeight / 2)) - (i14 / 2);
            }
        } else {
            i16 = zom.f87948mY;
        }
        return new int[]{max, Math.max(Math.min(i16, i12 - i14), 0)};
    }

    /* renamed from: F */
    private C23855s0 m61799F(C22504b c22504b, int i11) {
        int preferredWidth = this.f59007K.getPreferredWidth();
        int preferredHeight = this.f59007K.getPreferredHeight();
        int m91746e = AbstractC17158i1.m91746e();
        String str = AbstractC17158i1.f87698h;
        C20599v m107204a = C20599v.m107204a();
        ZOMDocument m107221q = C20599v.m107204a().m107221q(m107204a.m107214f(c22504b).mo107093l().mo107112l(AbstractC20601x.b.m107228a(preferredWidth, m91746e).mo107127b(preferredHeight).mo107129d(str).mo107126a()).mo107108h(getIdentifyKeyForZinstant()).mo107103c(), i11);
        if (m107221q != null) {
            return C23855s0.m124606T(m107221q);
        }
        return null;
    }

    /* renamed from: G */
    public void m61800G(C17945a0 c17945a0, Exception exc) {
        int i11;
        if (c17945a0 != this.f59011O) {
            return;
        }
        this.f59013Q.m95592x(-1);
        m61854n0();
        if (exc instanceof ZinstantException) {
            i11 = ((ZinstantException) exc).m91676a();
        } else {
            i11 = -999;
        }
        m61797B(c17945a0, false, i11);
    }

    /* renamed from: H */
    public void m61801H(C17945a0 c17945a0, InterfaceC20578a0 interfaceC20578a0) {
        C17967h1 c17967h1 = this.f59013Q;
        if (c17945a0 == this.f59011O && c17967h1 != null) {
            m61853m0();
            C23855s0 m124606T = C23855s0.m124606T(interfaceC20578a0);
            if (!m61809R()) {
                c17967h1.m95593y(m124606T);
            }
            m61797B(c17945a0, true, 0);
            post(new Runnable() { // from class: com.zing.zalo.ui.chat.chatrow.m1

                /* renamed from: q */
                public final /* synthetic */ C17945a0 f59307q;

                /* renamed from: r */
                public final /* synthetic */ C23855s0 f59308r;

                public /* synthetic */ RunnableC11500m1(C17945a0 c17945a02, C23855s0 m124606T2) {
                    r2 = c17945a02;
                    r3 = m124606T2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ChatRowWebContent.this.m61813X(r2, r3);
                }
            });
        }
    }

    /* renamed from: I */
    public void m61802I(C17945a0 c17945a0, InterfaceC20578a0 interfaceC20578a0) {
        if (c17945a0 != this.f59011O) {
            return;
        }
        C23855s0 m124606T = C23855s0.m124606T(interfaceC20578a0);
        if (!m61809R()) {
            this.f59013Q.m95594z(m124606T);
        }
        post(new Runnable() { // from class: com.zing.zalo.ui.chat.chatrow.n1

            /* renamed from: q */
            public final /* synthetic */ C17945a0 f59346q;

            /* renamed from: r */
            public final /* synthetic */ C23855s0 f59347r;

            public /* synthetic */ RunnableC11504n1(C17945a0 c17945a02, C23855s0 m124606T2) {
                r2 = c17945a02;
                r3 = m124606T2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ChatRowWebContent.this.m61814Y(r2, r3);
            }
        });
    }

    /* renamed from: K */
    private boolean m61803K(float f11, float f12) {
        if (this.f59017U == null || this.f59007K == null) {
            return false;
        }
        int reactionLeft = getReactionLeft();
        int reactionTop = getReactionTop();
        C22405g c22405g = this.f59017U;
        if (c22405g == null || !c22405g.m115846u() || f11 < reactionLeft || f11 > reactionLeft + this.f59017U.m115841p() || f12 < reactionTop || f12 > reactionTop + this.f59017U.m115831f()) {
            return false;
        }
        return true;
    }

    /* renamed from: L */
    private boolean m61804L(float f11, float f12) {
        if (this.f59017U == null || this.f59007K == null) {
            return false;
        }
        int reactionHeartLeft = getReactionHeartLeft();
        int reactionHeartTop = getReactionHeartTop();
        C22405g c22405g = this.f59017U;
        if (c22405g == null || !c22405g.m115836k() || f11 < reactionHeartLeft || f11 > reactionHeartLeft + this.f59017U.m115841p() || f12 < reactionHeartTop || f12 > reactionHeartTop + this.f59017U.m115831f()) {
            return false;
        }
        return true;
    }

    /* renamed from: N */
    private boolean m61805N() {
        return this.f59012P == 3;
    }

    /* renamed from: O */
    private boolean m61806O() {
        InterfaceC11530v interfaceC11530v = this.f57166E;
        if (interfaceC11530v != null && interfaceC11530v.mo62042H4()) {
            return true;
        }
        return false;
    }

    /* renamed from: P */
    private boolean m61807P() {
        try {
            if (this.f59017U == null) {
                return false;
            }
            if (this.f57167F.getTop() + this.f59017U.m115839n() > ((View) this.f57167F.getParent()).getHeight()) {
                return false;
            }
            return true;
        } catch (Exception e11) {
            e11.printStackTrace();
            return true;
        }
    }

    /* renamed from: Q */
    private boolean m61808Q() {
        if (this.f59012P == 1 && this.f59011O.m95144g8()) {
            return true;
        }
        return false;
    }

    /* renamed from: R */
    private boolean m61809R() {
        if (this.f59012P != 1 || m61806O()) {
            return true;
        }
        return false;
    }

    /* renamed from: U */
    public /* synthetic */ void m61810U(C17945a0 c17945a0, String str, boolean z11, int i11, C17967h1 c17967h1) {
        new C18957a0().m99471d(c17945a0, str, z11, i11, new InterfaceC18505l() { // from class: com.zing.zalo.ui.chat.chatrow.w1

            /* renamed from: q */
            public final /* synthetic */ C17967h1 f59656q;

            /* renamed from: r */
            public final /* synthetic */ C17945a0 f59657r;

            public /* synthetic */ C11535w1(C17967h1 c17967h12, C17945a0 c17945a02) {
                r2 = c17967h12;
                r3 = c17945a02;
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: i9 */
            public final Object mo205i9(Object obj) {
                C24848g0 m61811V;
                m61811V = ChatRowWebContent.this.m61811V(r2, r3, (JSONObject) obj);
                return m61811V;
            }
        }, new InterfaceC18509p() { // from class: com.zing.zalo.ui.chat.chatrow.l1
            public /* synthetic */ C11496l1() {
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: pC */
            public final Object mo240pC(Object obj, Object obj2) {
                C24848g0 m61812W;
                m61812W = ChatRowWebContent.this.m61812W((Integer) obj, (String) obj2);
                return m61812W;
            }
        });
    }

    /* renamed from: V */
    public /* synthetic */ C24848g0 m61811V(C17967h1 c17967h1, C17945a0 c17945a0, JSONObject jSONObject) {
        c17967h1.m95590v();
        C7956b.m41474B().m41513J0(c17945a0, c17967h1);
        this.f59019W.set(false);
        return null;
    }

    /* renamed from: W */
    public /* synthetic */ C24848g0 m61812W(Integer num, String str) {
        this.f59019W.set(false);
        return null;
    }

    /* renamed from: X */
    public /* synthetic */ void m61813X(C17945a0 c17945a0, C23855s0 c23855s0) {
        if (c17945a0 != this.f59011O) {
            return;
        }
        try {
            this.f59007K.setBackgroundResource(0);
            this.f59007K.m91942Z(c23855s0);
            this.f59007K.onStart();
            mo61849g0(c23855s0);
            m61844J();
        } catch (Exception e11) {
            e11.printStackTrace();
            m61856q0();
        }
    }

    /* renamed from: Y */
    public /* synthetic */ void m61814Y(C17945a0 c17945a0, C23855s0 c23855s0) {
        if (c17945a0 != this.f59011O) {
            return;
        }
        try {
            if (!m61847T() && this.f59013Q.m95582m() != -1) {
                this.f59007K.m91942Z(c23855s0);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: Z */
    public /* synthetic */ void m61815Z() {
        if (this.f59007K.getZinstantRootTree() != null) {
            return;
        }
        m61856q0();
    }

    /* renamed from: a0 */
    public /* synthetic */ void m61816a0() {
        AbstractC19444a.m101697e(new Runnable() { // from class: com.zing.zalo.ui.chat.chatrow.u1
            public /* synthetic */ RunnableC11529u1() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                ChatRowWebContent.this.m61815Z();
            }
        });
    }

    /* renamed from: b0 */
    public /* synthetic */ void m61817b0(View view) {
        InterfaceC11530v interfaceC11530v = this.f57166E;
        if (interfaceC11530v != null) {
            interfaceC11530v.mo62104v4(this);
        }
    }

    /* renamed from: c0 */
    public /* synthetic */ void m61818c0(C17945a0 c17945a0, C23855s0 c23855s0) {
        if (c17945a0 != this.f59011O) {
            return;
        }
        this.f59007K.m91942Z(c23855s0);
        this.f59007K.onStart();
        mo61849g0(c23855s0);
        m61844J();
    }

    /* renamed from: d0 */
    public /* synthetic */ void m61819d0(C17945a0 c17945a0, C17945a0 c17945a02, C17177r0 c17177r0) {
        if (c17945a0 != this.f59011O) {
            return;
        }
        C23855s0 zinstantRootCached = getZinstantRootCached();
        if (zinstantRootCached != null) {
            post(new Runnable() { // from class: com.zing.zalo.ui.chat.chatrow.t1

                /* renamed from: q */
                public final /* synthetic */ C17945a0 f59382q;

                /* renamed from: r */
                public final /* synthetic */ C23855s0 f59383r;

                public /* synthetic */ RunnableC11526t1(C17945a0 c17945a03, C23855s0 zinstantRootCached2) {
                    r2 = c17945a03;
                    r3 = zinstantRootCached2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ChatRowWebContent.this.m61818c0(r2, r3);
                }
            });
        } else {
            C3568b.m18124b().m18127d(new C11441b(c17945a03, c17945a02, c17177r0));
        }
    }

    /* renamed from: e0 */
    public /* synthetic */ boolean m61820e0(View view) {
        InterfaceC11530v interfaceC11530v = this.f57166E;
        if (interfaceC11530v != null) {
            interfaceC11530v.mo62090j4(this, null);
            return true;
        }
        return true;
    }

    public String getIdentifyKeyForZinstant() {
        StringBuilder sb2 = new StringBuilder();
        C17945a0 c17945a0 = this.f59011O;
        if (c17945a0 != null) {
            sb2.append(c17945a0.m95029V3());
        }
        if (m61806O()) {
            sb2.append("multi");
        } else {
            sb2.append("default");
        }
        ZaloZinstantRootLayout zaloZinstantRootLayout = this.f59007K;
        if (zaloZinstantRootLayout != null) {
            sb2.append(zaloZinstantRootLayout.getPreferredWidth());
        }
        if (m61805N()) {
            sb2.append("menu");
        }
        sb2.append("_");
        sb2.append(this.f59012P);
        return sb2.toString();
    }

    private Point getReactionCoords() {
        int m115835j;
        int i11;
        int i12;
        if (!m61808Q() || this.f59011O == null || this.f59017U == null) {
            return null;
        }
        int[] iArr = new int[2];
        this.f57167F.getLocationOnScreen(iArr);
        if (m61807P()) {
            try {
                m115835j = this.f59017U.m115835j();
                int m115839n = iArr[1] + this.f59017U.m115839n();
                if (getReactionPickerDirection()) {
                    i11 = this.f59017U.m115831f();
                } else {
                    i11 = 0;
                }
                i12 = m115839n + i11;
            } catch (Exception e11) {
                e11.printStackTrace();
                return null;
            }
        } else {
            m115835j = getLeft() + (getWidth() / 2);
            i12 = getTop() + iArr[1];
        }
        return new Point(m115835j, i12);
    }

    private boolean getReactionPickerDirection() {
        try {
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        if (this.f59017U == null) {
            return false;
        }
        if (m61807P()) {
            if ((this.f57167F.getBottom() - this.f59017U.m115831f()) - ReactionPickerView.f71134f0 < 0) {
                return true;
            }
            return false;
        }
        return true;
    }

    private C23855s0 getSkeletonCached() {
        C23855s0 m95585p;
        C17177r0 m95581l = this.f59013Q.m95581l(this.f59011O);
        if (m61809R()) {
            m95585p = m61799F(this.f59013Q.m95583n(), 1);
        } else {
            m95585p = this.f59013Q.m95585p();
        }
        if (m95585p != null && !m61847T() && this.f59013Q.m95582m() != -1) {
            if (m95585p.checkIntegrity(this.f59007K.getPreferredWidth(), this.f59007K.getPreferredHeight(), AbstractC18458a.f93019a, AbstractC17148f0.m91684c(), m95581l, null)) {
                return m95585p;
            }
            return null;
        }
        return null;
    }

    private C23855s0 getZinstantRootCached() {
        C23855s0 m95584o;
        String str;
        C17177r0 m95581l = this.f59013Q.m95581l(this.f59011O);
        if (m61809R()) {
            m95584o = m61799F(this.f59013Q.m95583n(), 0);
        } else {
            m95584o = this.f59013Q.m95584o();
        }
        C22504b m95583n = this.f59013Q.m95583n();
        if (m95583n != null) {
            str = m95583n.mo116353c();
        } else {
            str = null;
        }
        if (m95584o != null && m95584o.m124621B()) {
            if (m95584o.checkIntegrity(this.f59007K.getPreferredWidth(), this.f59007K.getPreferredHeight(), AbstractC18458a.f93019a, AbstractC17148f0.m91684c(), m95581l, str)) {
                return m95584o;
            }
        }
        return null;
    }

    /* renamed from: i0 */
    private void m61824i0(float f11, float f12) {
        InterfaceC11530v interfaceC11530v;
        InterfaceC11530v interfaceC11530v2;
        if (!m61808Q()) {
            return;
        }
        if (this.f59021b0) {
            if (m61804L(f11, f12) && (interfaceC11530v2 = this.f57166E) != null) {
                interfaceC11530v2.mo62040G4(this);
            }
        } else if (this.f59022c0 && m61803K(f11, f12) && (interfaceC11530v = this.f57166E) != null) {
            interfaceC11530v.mo62047J4(this.f59011O, this.f59017U.m115837l());
        }
        this.f59022c0 = false;
        this.f59021b0 = false;
    }

    /* renamed from: j0 */
    public void m61826j0() {
        InterfaceC11530v interfaceC11530v;
        if (m61808Q() && (interfaceC11530v = this.f57166E) != null) {
            if (this.f59021b0) {
                interfaceC11530v.mo62097p4(this.f59011O, getReactionCoords(), getReactionPickerDirection());
            } else {
                interfaceC11530v.mo62090j4(this, null);
            }
            this.f59022c0 = false;
            this.f59021b0 = false;
        }
        MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
        onTouchEvent(obtain);
        obtain.recycle();
    }

    /* renamed from: p0 */
    private void m61832p0(C23855s0 c23855s0) {
        ZOM m124648v;
        if (!m61808Q() || (m124648v = c23855s0.m124648v("reactions")) == null) {
            return;
        }
        if (this.f59017U == null) {
            this.f59017U = new C22405g(getContext(), new C11442c());
        }
        this.f59017U.m115822G(C24261h.m126630v().m126650x(this.f59011O.m95029V3()));
        this.f59017U.m115816A();
        int[] m61798E = m61798E(m124648v, c23855s0.m124651z(), c23855s0.getHeight(), this.f59017U.m115841p(), this.f59017U.m115831f());
        this.f59017U.m115824I(m61798E[0], m61798E[1]);
    }

    /* renamed from: C */
    void m61842C(Canvas canvas) {
        int i11;
        int i12;
        if (this.f59011O != null && AbstractC23304d.m120544o()) {
            C32012m m94912I2 = this.f59011O.m94912I2();
            if (m94912I2 != null) {
                i11 = m94912I2.f147328v;
            } else {
                i11 = -1;
            }
            if (m94912I2 != null) {
                i12 = m94912I2.f147327u;
            } else {
                i12 = -1;
            }
            String str = "";
            if (AbstractC23304d.m120544o() && (i11 != -1 || i12 != -1)) {
                if (!TextUtils.isEmpty("")) {
                    str = "|";
                }
                str = str + C19639k.f97504a.m102873a(i12, i11);
            }
            if (!TextUtils.isEmpty(str)) {
                if (ChatRow.f57212Q6 == null) {
                    C13704p1 c13704p1 = new C13704p1(1);
                    ChatRow.f57212Q6 = c13704p1;
                    c13704p1.setColor(-1);
                    ChatRow.f57212Q6.setTextSize(AbstractC23136l9.m118759w1(10));
                    ChatRow.f57212Q6.setTypeface(Typeface.DEFAULT_BOLD);
                    Paint paint = new Paint(1);
                    ChatRow.f57210P6 = paint;
                    paint.setStyle(Paint.Style.FILL);
                    ChatRow.f57210P6.setColor(-14960915);
                }
                int m118742r = AbstractC23136l9.m118742r(4.0f);
                int m118764y0 = AbstractC23136l9.m118764y0(ChatRow.f57212Q6, str);
                int m118761x0 = AbstractC23136l9.m118761x0(ChatRow.f57212Q6, str);
                int top = this.f59007K.getTop() + this.f59007K.getPaddingTop() + m118742r;
                int left = this.f59007K.getLeft() + this.f59007K.getPaddingLeft() + m118742r;
                float f11 = m118742r;
                canvas.drawRoundRect(left, top, m118764y0 + left + r6, m118761x0 + top + (m118742r * 2), f11, f11, ChatRow.f57210P6);
                canvas.drawText(str, left + m118742r, r3 - m118742r, ChatRow.f57212Q6);
            }
        }
    }

    /* renamed from: D */
    protected void mo61843D(Canvas canvas) {
        if (m61808Q() && this.f59017U != null) {
            canvas.save();
            canvas.translate(this.f59007K.getLeft(), this.f59007K.getTop());
            this.f59017U.m115829d(canvas);
            canvas.restore();
        }
    }

    /* renamed from: J */
    void m61844J() {
        C11448i c11448i = this.f59010N;
        if (c11448i != null && c11448i.getVisibility() == 0) {
            this.f59010N.setVisibility(4);
        }
    }

    /* renamed from: M */
    public boolean m61845M() {
        InterfaceC11530v interfaceC11530v = this.f57166E;
        if (interfaceC11530v != null && interfaceC11530v.mo62071Y3()) {
            return true;
        }
        return false;
    }

    /* renamed from: S */
    public boolean m61846S() {
        InterfaceC11530v interfaceC11530v = this.f57166E;
        if (interfaceC11530v != null && (!interfaceC11530v.mo62045J0() || (getMessage() != null && getMessage().m95000S0()))) {
            return true;
        }
        return false;
    }

    /* renamed from: T */
    boolean m61847T() {
        C11448i c11448i = this.f59010N;
        if (c11448i != null && c11448i.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (m61808Q() && this.f59017U != null) {
            mo61843D(canvas);
        }
        m61842C(canvas);
    }

    /* renamed from: f0 */
    public void m61848f0() {
        try {
            this.f59007K.m91973J0();
            this.f59016T.removeCallbacksAndMessages(null);
            this.f59015S.quitSafely();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: g0 */
    public void mo61849g0(C23855s0 c23855s0) {
        m61832p0(c23855s0);
    }

    @Override // com.zing.zalo.zview.animation.AnimationTarget
    public Rect getAnimTargetLocationOnScreen() {
        return null;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.InterfaceC11475g0
    public Rect getBubbleRect() {
        return new Rect(0, 0, getWidth(), getHeight());
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.InterfaceC11475g0
    public View getChatRowView() {
        return this;
    }

    protected int getContainerHeight() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup != null) {
            this.f59006J = viewGroup.getMeasuredHeight();
        }
        return this.f59006J;
    }

    protected int getContainerWidth() {
        C20052c m99159s;
        ZaloView m93012K0;
        try {
            InterfaceC11530v interfaceC11530v = this.f57166E;
            if (interfaceC11530v != null && interfaceC11530v.mo62071Y3() && (m99159s = C18922m.m99141t().m99159s()) != null && m99159s.m104132G() && (m93012K0 = m99159s.mo35579p().m93012K0()) != null && m93012K0.m92656bJ() != null) {
                this.f59005I = m93012K0.m92656bJ().getMeasuredWidth();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return this.f59005I;
    }

    public int getContentTop() {
        ZaloZinstantRootLayout zaloZinstantRootLayout = this.f59007K;
        if (zaloZinstantRootLayout != null) {
            return zaloZinstantRootLayout.getTop();
        }
        return 0;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.InterfaceC11475g0
    public int getJumpTargetY() {
        return 0;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.InterfaceC11475g0
    public C17945a0 getMessage() {
        return this.f59011O;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.InterfaceC11475g0
    public C17945a0 getMessageForReply() {
        if (getMessage().m94981Q0()) {
            return getMessage();
        }
        return null;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.InterfaceC11475g0
    public int getMyReactionCount() {
        C22405g c22405g;
        if (m61808Q() && (c22405g = this.f59017U) != null) {
            return c22405g.m115833h();
        }
        return 0;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.InterfaceC11475g0
    public Rect getPhotoCoords() {
        return null;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.InterfaceC11475g0
    public int getPosition() {
        return this.f57165D;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.InterfaceC11475g0
    public C22405g getReactionBar() {
        return this.f59017U;
    }

    public int getReactionHeartLeft() {
        return this.f59017U.m115835j() + this.f59007K.getLeft();
    }

    public int getReactionHeartTop() {
        return this.f59017U.m115839n() + this.f59007K.getTop();
    }

    public int getReactionLeft() {
        return this.f59017U.m115832g() + this.f59007K.getLeft();
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.InterfaceC11475g0
    public Rect getReactionRect() {
        C22405g c22405g;
        if (this.f59011O != null && m61808Q() && (c22405g = this.f59017U) != null && c22405g.m115836k() && this.f59007K != null) {
            int m115835j = this.f59017U.m115835j();
            int m115839n = this.f59017U.m115839n();
            int m115832g = this.f59017U.m115832g() + this.f59017U.m115841p();
            int m115839n2 = this.f59017U.m115839n() + this.f59017U.m115831f();
            int left = this.f59007K.getLeft();
            int top = this.f59007K.getTop();
            return new Rect(m115835j + left, m115839n + top, m115832g + left, m115839n2 + top);
        }
        return null;
    }

    public int getReactionTop() {
        return this.f59017U.m115839n() + this.f59007K.getTop();
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.InterfaceC11475g0
    public Rect getReferenceThumbPosition() {
        return null;
    }

    @Override // android.view.View
    public Object getTag() {
        try {
            ZaloZinstantRootLayout zaloZinstantRootLayout = this.f59007K;
            if (zaloZinstantRootLayout != null) {
                return zaloZinstantRootLayout.getTag();
            }
            return null;
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.InterfaceC11475g0
    public C3979l getThumbImageInfo() {
        return null;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.InterfaceC11475g0
    public int getTopAbs() {
        return getTop();
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.InterfaceC11475g0
    public int getTotalReaction() {
        C22405g c22405g;
        if (m61808Q() && (c22405g = this.f59017U) != null) {
            return c22405g.m115840o();
        }
        return 0;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.InterfaceC11475g0
    public float getTranslationXAbs() {
        return getTranslationX();
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.InterfaceC11475g0
    /* renamed from: h */
    public void mo61065h(MotionEvent motionEvent) {
        dispatchTouchEvent(motionEvent);
    }

    /* renamed from: h0 */
    public void m61850h0() {
        this.f59007K.onPause();
    }

    /* renamed from: k0 */
    public void m61851k0() {
        this.f59007K.onResume();
    }

    /* renamed from: l0 */
    public boolean m61852l0() {
        C22405g c22405g;
        if (m61808Q() && (c22405g = this.f59017U) != null) {
            c22405g.m115817B();
            return true;
        }
        return false;
    }

    /* renamed from: m0 */
    void m61853m0() {
        boolean hasCallbacks;
        if (Build.VERSION.SDK_INT >= 29) {
            hasCallbacks = this.f59016T.hasCallbacks(this.f59020a0);
            if (hasCallbacks) {
                this.f59016T.removeCallbacks(this.f59020a0);
                return;
            }
            return;
        }
        this.f59016T.removeCallbacks(this.f59020a0);
    }

    /* renamed from: n0 */
    void m61854n0() {
        boolean hasCallbacks;
        if (Build.VERSION.SDK_INT >= 29) {
            hasCallbacks = this.f59016T.hasCallbacks(this.f59020a0);
            if (!hasCallbacks) {
                this.f59016T.postDelayed(this.f59020a0, 10000L);
                return;
            }
            return;
        }
        this.f59016T.postDelayed(this.f59020a0, 10000L);
    }

    /* renamed from: o0 */
    void m61855o0() {
        C17945a0 c17945a0 = this.f59011O;
        if (c17945a0 != null) {
            if (c17945a0.m94929K2() instanceof C17967h1) {
                C17967h1 c17967h1 = (C17967h1) this.f59011O.m94929K2();
                c17967h1.m95592x(2);
                C22504b m95583n = c17967h1.m95583n();
                if (m95583n != null) {
                    try {
                        ZOMInsight zOMInsight = new ZOMInsight();
                        zOMInsight.mCategory = this.f59011O.m95029V3().m41046j();
                        AbstractC17155h1.m91735b(m95583n.f110131e, m95583n.f110128b, "retry_button_mobile", zOMInsight);
                    } catch (Exception unused) {
                    }
                }
            }
            setChatContent(this.f59011O);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m60896a(getContext());
        setOrientation(1);
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup != null) {
            this.f59005I = viewGroup.getMeasuredWidth();
            this.f59006J = viewGroup.getMeasuredHeight();
        }
        this.f59007K = (ZaloZinstantRootLayout) findViewById(AbstractC6918a0.zinstant_layout);
        this.f59008L = findViewById(AbstractC6918a0.chat_row_webcontent_margin_bottom);
        this.f59009M = findViewById(AbstractC6918a0.btn_seemore);
        HandlerThread handlerThread = new HandlerThread("Z:ZinstantTask");
        this.f59015S = handlerThread;
        handlerThread.start();
        this.f59016T = new Handler(this.f59015S.getLooper());
        this.f59007K.setImageLoader(this.f59030k0);
        this.f59007K.setOnZinstantClickListener(this.f59028i0);
        this.f59007K.setExternalScriptListener(this.f59029j0);
        this.f59007K.setContextProvider(new C11440a());
        View view = this.f59009M;
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.chat.chatrow.r1
                public /* synthetic */ ViewOnClickListenerC11520r1() {
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    ChatRowWebContent.this.m61817b0(view2);
                }
            });
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f59012P == 3) {
            return true;
        }
        if (!m61808Q()) {
            return false;
        }
        float x11 = motionEvent.getX();
        float y11 = motionEvent.getY();
        boolean m61804L = m61804L(x11, y11);
        this.f59021b0 = m61804L;
        if (m61804L || m61803K(x11, y11)) {
            return true;
        }
        return false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup != null) {
            this.f59005I = viewGroup.getMeasuredWidth();
            this.f59006J = viewGroup.getMeasuredHeight();
        }
        super.onMeasure(i11, i12);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ZaloZinstantRootLayout zaloZinstantRootLayout;
        float x11 = motionEvent.getX();
        float y11 = motionEvent.getY();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        return super.onTouchEvent(motionEvent);
                    }
                    this.f59026g0.removeCallbacks(this.f59027h0);
                    this.f59022c0 = false;
                    this.f59021b0 = false;
                    return false;
                }
                if (Math.abs(x11 - this.f59023d0) <= this.f59025f0 && Math.abs(y11 - this.f59024e0) <= this.f59025f0) {
                    return true;
                }
                this.f59026g0.removeCallbacks(this.f59027h0);
                this.f59022c0 = false;
                this.f59021b0 = false;
                return false;
            }
            this.f59026g0.removeCallbacks(this.f59027h0);
            m61824i0(x11, y11);
            return false;
        }
        if (this.f59012P == 3 && (zaloZinstantRootLayout = this.f59007K) != null) {
            C23855s0 zinstantRootTree = zaloZinstantRootLayout.getZinstantRootTree();
            int top = this.f59007K.getTop() - getTop();
            int left = this.f59007K.getLeft() - getLeft();
            if (zinstantRootTree != null && zinstantRootTree.m124650y() != null && !zinstantRootTree.m124650y().m128795a(((int) x11) - left, ((int) y11) - top)) {
                return false;
            }
        }
        this.f59023d0 = x11;
        this.f59024e0 = y11;
        this.f59021b0 = m61804L(x11, y11);
        this.f59022c0 = m61803K(x11, y11);
        this.f59026g0.postDelayed(this.f59027h0, ViewConfiguration.getLongPressTimeout());
        return true;
    }

    /* renamed from: q0 */
    void m61856q0() {
        try {
            C11448i c11448i = this.f59010N;
            if (c11448i != null && c11448i.getParent() == this.f59007K) {
                if (this.f59010N.getVisibility() != 0) {
                    this.f59007K.setUseProgressLoading(false);
                    this.f59010N.setVisibility(0);
                }
                this.f59010N.bringToFront();
                return;
            }
            if (this.f59010N == null) {
                C11448i c11448i2 = new C11448i(getContext(), this.f59031l0);
                this.f59010N = c11448i2;
                c11448i2.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.zing.zalo.ui.chat.chatrow.s1
                    public /* synthetic */ ViewOnLongClickListenerC11523s1() {
                    }

                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view) {
                        boolean m61820e0;
                        m61820e0 = ChatRowWebContent.this.m61820e0(view);
                        return m61820e0;
                    }
                });
            }
            this.f59007K.setBackgroundResource(0);
            this.f59007K.m91973J0();
            this.f59007K.getLayoutParams().width = AbstractC23136l9.m118742r(300.0f);
            this.f59007K.getLayoutParams().height = AbstractC23136l9.m118742r(85.0f);
            this.f59010N.setVisibility(0);
            this.f59007K.addView(this.f59010N, new LinearLayout.LayoutParams(-1, -2));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.animation.AnimationTarget
    public void setAnimTargetVisibility(int i11) {
    }

    public void setChatContent(C17945a0 c17945a0) {
        try {
            C23855s0 c23855s0 = null;
            boolean z11 = false;
            if (this.f59011O != c17945a0) {
                this.f59016T.removeCallbacksAndMessages(null);
                this.f59007K.onStop();
                this.f59007K.m91973J0();
                this.f59017U = null;
                this.f59019W.set(false);
            }
            this.f59011O = c17945a0;
            this.f59012P = this.f57166E.mo62101s4();
            if (this.f57166E.mo62079c4(c17945a0.m95029V3()).f133312h) {
                this.f59008L.getLayoutParams().height = AbstractC23136l9.m118742r(25.0f);
            } else {
                this.f59008L.getLayoutParams().height = AbstractC23136l9.m118742r(4.0f);
            }
            if (c17945a0.m94929K2() != null && (c17945a0.m94929K2() instanceof C17967h1)) {
                C17967h1 c17967h1 = (C17967h1) c17945a0.m94929K2();
                this.f59013Q = c17967h1;
                C17177r0 m95581l = c17967h1.m95581l(c17945a0);
                if (this.f59007K.f87805T.mo92023b() != m95581l) {
                    this.f59007K.setLayoutGateway(m95581l);
                }
                if (this.f59013Q.m95582m() == -1) {
                    m61856q0();
                    m61797B(c17945a0, false, -999);
                    return;
                }
                this.f59007K.setZinstantDataModel(this.f59013Q.m95583n());
                C23855s0 zinstantRootCached = getZinstantRootCached();
                if (zinstantRootCached == null) {
                    c23855s0 = getSkeletonCached();
                }
                if (c23855s0 != null) {
                    this.f59007K.m91942Z(c23855s0);
                }
                if (zinstantRootCached != null) {
                    this.f59007K.m91942Z(zinstantRootCached);
                    this.f59007K.onStart();
                    mo61849g0(zinstantRootCached);
                    m61844J();
                    m61797B(c17945a0, true, 0);
                } else {
                    if (!this.f59007K.m91991V()) {
                        if (this.f59007K.getLayoutParams() != null) {
                            this.f59007K.getLayoutParams().width = AbstractC23136l9.m118742r(300.0f);
                            this.f59007K.getLayoutParams().height = AbstractC23136l9.m118742r(85.0f);
                        }
                        m61844J();
                        this.f59007K.setUseProgressLoading(true);
                    }
                    RunnableC11508o1 runnableC11508o1 = new Runnable() { // from class: com.zing.zalo.ui.chat.chatrow.o1

                        /* renamed from: q */
                        public final /* synthetic */ C17945a0 f59351q;

                        /* renamed from: r */
                        public final /* synthetic */ C17945a0 f59352r;

                        /* renamed from: s */
                        public final /* synthetic */ C17177r0 f59353s;

                        public /* synthetic */ RunnableC11508o1(C17945a0 c17945a02, C17945a0 c17945a03, C17177r0 m95581l2) {
                            r2 = c17945a02;
                            r3 = c17945a03;
                            r4 = m95581l2;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            ChatRowWebContent.this.m61819d0(r2, r3, r4);
                        }
                    };
                    if (getMeasuredWidth() > 0) {
                        runnableC11508o1.run();
                    } else {
                        post(runnableC11508o1);
                    }
                }
            }
            if (this.f59009M != null) {
                if (this.f57166E.mo62101s4() == 1 && this.f57166E.mo62079c4(c17945a03.m95029V3()).m143907a()) {
                    this.f59009M.setVisibility(0);
                    if (this.f59009M.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                        ((ViewGroup.MarginLayoutParams) this.f59009M.getLayoutParams()).bottomMargin = ChatRowMsgInfo.f58153i8;
                    }
                } else {
                    this.f59009M.setVisibility(8);
                }
            }
            if (this.f59011O.m95030V4() > 0 && this.f59011O.m95262t7()) {
                z11 = true;
            }
            this.f59018V = z11;
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public void setDelegate(InterfaceC11446g interfaceC11446g) {
        this.f59014R = interfaceC11446g;
    }

    public void setRetryClickListener(C11447h.a aVar) {
        this.f59031l0.m61867b(aVar);
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.InterfaceC11475g0
    public void setTranslationXAbs(float f11) {
        setTranslationX(f11);
    }

    public void setViewTag(Object obj) {
        try {
            ZaloZinstantRootLayout zaloZinstantRootLayout = this.f59007K;
            if (zaloZinstantRootLayout != null) {
                zaloZinstantRootLayout.setTag(obj);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
