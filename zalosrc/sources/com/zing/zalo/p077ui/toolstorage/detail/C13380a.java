package com.zing.zalo.p077ui.toolstorage.detail;

import au.C2357l;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.common.C7853b;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.p077ui.toolstorage.detail.C13380a;
import com.zing.zalo.p077ui.toolstorage.detail.ToolStorageDetailPage;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zalocloud.utils.AbstractC16893a;
import com.zing.zalo.zalocloud.utils.MediaExtInfo;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import dh0.C17933b;
import dj.C17945a0;
import dj.C17961f1;
import dj.C17964g1;
import dj.C17969i0;
import dj.C17981m0;
import dj.C17990p0;
import dj.C18009w0;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import gg0.AbstractC19444a;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import me0.AbstractC23041d2;
import me0.AbstractC23136l9;
import me0.C23055e5;
import mm0.AbstractC23350e;
import p164fn.C19028b;
import p396ol.C24302e;
import p396ol.EnumC24298a;
import p396ol.InterfaceC24301d;
import p461qu.AbstractC25495a;
import p487rl.C25821b;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vc0.InterfaceC27965d;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: com.zing.zalo.ui.toolstorage.detail.a */
/* loaded from: classes6.dex */
public final class C13380a implements InterfaceC27965d {
    public static final a Companion = new a(null);

    /* renamed from: p */
    private int f68592p;

    /* renamed from: q */
    private CharSequence f68593q;

    /* renamed from: r */
    private boolean f68594r;

    /* renamed from: s */
    private boolean f68595s;

    /* renamed from: t */
    private final C17945a0 f68596t;

    /* renamed from: u */
    private C25821b f68597u;

    /* renamed from: v */
    private long f68598v;

    /* renamed from: w */
    private final AtomicBoolean f68599w;

    /* renamed from: com.zing.zalo.ui.toolstorage.detail.a$a */
    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.toolstorage.detail.a$b */
    /* loaded from: classes6.dex */
    public interface b {
        /* renamed from: a */
        void mo75003a();

        /* renamed from: b */
        void mo75004b(long j11);

        /* renamed from: c */
        void mo75005c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.toolstorage.detail.a$c */
    /* loaded from: classes6.dex */
    public static final class c extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f68600t;

        /* renamed from: v */
        final /* synthetic */ b f68602v;

        /* renamed from: com.zing.zalo.ui.toolstorage.detail.a$c$a */
        /* loaded from: classes6.dex */
        public static final class a implements InterfaceC24301d {

            /* renamed from: a */
            private final boolean f68603a = true;

            /* renamed from: b */
            final /* synthetic */ b f68604b;

            /* renamed from: c */
            final /* synthetic */ C13380a f68605c;

            a(b bVar, C13380a c13380a) {
                this.f68604b = bVar;
                this.f68605c = c13380a;
            }

            @Override // p396ol.InterfaceC24301d
            /* renamed from: a */
            public void mo66919a(String str, long j11) {
                AbstractC19074t.m100208f(str, "downloadId");
                this.f68605c.m75098t().set(false);
                this.f68604b.mo75004b(j11);
            }

            @Override // p396ol.InterfaceC24301d
            /* renamed from: b */
            public boolean mo66920b() {
                return this.f68603a;
            }

            @Override // p396ol.InterfaceC24301d
            /* renamed from: c */
            public EnumC24298a mo66921c() {
                return EnumC24298a.f117297p;
            }

            @Override // p396ol.InterfaceC24301d
            /* renamed from: d */
            public void mo66922d(String str, int i11, String str2) {
                AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
                AbstractC19074t.m100208f(str2, "errorMessage");
                this.f68605c.m75098t().set(false);
                this.f68604b.mo75003a();
            }

            @Override // p396ol.InterfaceC24301d
            /* renamed from: e */
            public void mo66923e(String str, String str2) {
                AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
                AbstractC19074t.m100208f(str2, "path");
                this.f68604b.mo75005c();
            }

            @Override // p396ol.InterfaceC24301d
            /* renamed from: h */
            public int mo66924h() {
                return InterfaceC24301d.a.m126884a(this);
            }
        }

        /* renamed from: com.zing.zalo.ui.toolstorage.detail.a$c$b */
        /* loaded from: classes6.dex */
        public static final class b implements C17945a0.x {

            /* renamed from: p */
            final /* synthetic */ b f68606p;

            /* renamed from: q */
            final /* synthetic */ C13380a f68607q;

            b(b bVar, C13380a c13380a) {
                this.f68606p = bVar;
                this.f68607q = c13380a;
            }

            @Override // dj.C17945a0.x
            /* renamed from: G */
            public void mo61268G(int i11, MessageId messageId) {
                this.f68606p.mo75004b(i11);
            }

            @Override // dj.C17945a0.x
            /* renamed from: H */
            public void mo61269H(MessageId messageId, boolean z11) {
                this.f68607q.m75098t().set(false);
                this.f68606p.mo75003a();
            }

            @Override // dj.C17945a0.x
            /* renamed from: m */
            public void mo61273m(int i11, MessageId messageId) {
            }

            @Override // dj.C17945a0.x
            /* renamed from: s */
            public void mo61274s(MessageId messageId, String str, boolean z11) {
                this.f68607q.m75098t().set(false);
                this.f68606p.mo75005c();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(b bVar, Continuation continuation) {
            super(2, continuation);
            this.f68602v = bVar;
        }

        /* renamed from: u */
        public static final void m75107u() {
            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_zcloud_unable_to_access_this_item));
        }

        /* renamed from: v */
        public static final void m75108v() {
            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_zcloud_unable_to_access_this_item));
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new c(this.f68602v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f68600t == 0) {
                AbstractC24862s.m129228b(obj);
                if (C13380a.this.m75096r()) {
                    C25821b m75082d = C13380a.this.m75082d();
                    if (m75082d == null) {
                        AbstractC19444a.m101697e(new Runnable() { // from class: com.zing.zalo.ui.toolstorage.detail.b
                            @Override // java.lang.Runnable
                            public final void run() {
                                C13380a.c.m75107u();
                            }
                        });
                        return C24848g0.f119245a;
                    }
                    C13380a.this.m75098t().set(true);
                    C24302e.Companion.m126919j().m126908q(m75082d, new a(this.f68602v, C13380a.this));
                } else if (C13380a.this.m75104z()) {
                    C17945a0 m75089k = C13380a.this.m75089k();
                    if (m75089k == null) {
                        AbstractC19444a.m101697e(new Runnable() { // from class: com.zing.zalo.ui.toolstorage.detail.c
                            @Override // java.lang.Runnable
                            public final void run() {
                                C13380a.c.m75108v();
                            }
                        });
                        return C24848g0.f119245a;
                    }
                    C13380a.this.m75098t().set(true);
                    m75089k.m94859Bb(new b(this.f68602v, C13380a.this));
                    m75089k.m94891Fa(true);
                    m75089k.m94980Pb(C19028b.a.m100098b(C19028b.Companion, C19028b.b.f94843p, true, false, 4, null), true);
                } else {
                    return C24848g0.f119245a;
                }
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: t */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    public C13380a(int i11, CharSequence charSequence, boolean z11, boolean z12, C17945a0 c17945a0, C25821b c25821b, long j11) {
        long j12;
        C17969i0 m94929K2;
        C25821b.b m133145h;
        this.f68592p = i11;
        this.f68593q = charSequence;
        this.f68594r = z11;
        this.f68595s = z12;
        this.f68596t = c17945a0;
        this.f68597u = c25821b;
        this.f68598v = j11;
        this.f68599w = new AtomicBoolean(false);
        C25821b c25821b2 = this.f68597u;
        if (c25821b2 == null || (m133145h = c25821b2.m133145h()) == null) {
            j12 = 0;
            if (c17945a0 != null && (m94929K2 = c17945a0.m94929K2()) != null) {
                if (m75071A() && (m94929K2 instanceof C18009w0)) {
                    j12 = ((C18009w0) m94929K2).m95776l();
                } else if (m75075E() && (m94929K2 instanceof C17961f1)) {
                    j12 = ((C17961f1) m94929K2).m95453G();
                } else if (m75100v() && (m94929K2 instanceof C17990p0)) {
                    j12 = ((C17990p0) m94929K2).f91113B;
                } else if (m75076F() && (m94929K2 instanceof C17964g1)) {
                    j12 = ((C17964g1) m94929K2).m95531h();
                } else if (m75097s() && (m94929K2 instanceof C17981m0)) {
                    j12 = ((C17981m0) m94929K2).f91076D;
                }
            }
        } else {
            j12 = m133145h.m133166c();
        }
        this.f68598v = j12;
    }

    /* renamed from: A */
    public final boolean m75071A() {
        C17945a0 c17945a0 = this.f68596t;
        if (c17945a0 != null && c17945a0.m94871D7()) {
            return true;
        }
        C25821b c25821b = this.f68597u;
        if (c25821b != null && AbstractC16893a.m90330g(c25821b)) {
            return true;
        }
        return false;
    }

    /* renamed from: B */
    public final boolean m75072B() {
        return this.f68595s;
    }

    /* renamed from: C */
    public final boolean m75073C() {
        return this.f68594r;
    }

    /* renamed from: D */
    public final boolean m75074D() {
        if (!m75103y() && !m75100v() && !m75076F() && !m75097s()) {
            return false;
        }
        return true;
    }

    /* renamed from: E */
    public final boolean m75075E() {
        C17945a0 c17945a0 = this.f68596t;
        if (c17945a0 != null && c17945a0.m95306y8()) {
            return true;
        }
        C25821b c25821b = this.f68597u;
        if (c25821b != null && AbstractC16893a.m90331h(c25821b)) {
            return true;
        }
        return false;
    }

    /* renamed from: F */
    public final boolean m75076F() {
        C17945a0 c17945a0 = this.f68596t;
        if (c17945a0 != null && c17945a0.m95316z8()) {
            return true;
        }
        C25821b c25821b = this.f68597u;
        if (c25821b != null && AbstractC16893a.m90332i(c25821b)) {
            return true;
        }
        return false;
    }

    /* renamed from: G */
    public final void m75077G(long j11) {
        this.f68598v = j11;
    }

    /* renamed from: H */
    public final void m75078H(boolean z11) {
        this.f68595s = z11;
    }

    /* renamed from: I */
    public final void m75079I(boolean z11) {
        this.f68594r = z11;
    }

    /* renamed from: J */
    public final void m75080J(b bVar) {
        AbstractC19074t.m100208f(bVar, "listener");
        if (this.f68599w.get()) {
            return;
        }
        if (m75099u()) {
            bVar.mo75005c();
        } else if (C23055e5.m118272g(true)) {
            BuildersKt__Builders_commonKt.m112540d(C17933b.f90533a.m94579d(), null, null, new c(bVar, null), 3, null);
        }
    }

    /* renamed from: a */
    public final String m75081a() {
        MessageId m133146i;
        MessageId m95029V3;
        String m41044h;
        C17945a0 c17945a0 = this.f68596t;
        if (c17945a0 == null || (m95029V3 = c17945a0.m95029V3()) == null || (m41044h = m95029V3.m41044h()) == null) {
            C25821b c25821b = this.f68597u;
            if (c25821b != null && (m133146i = c25821b.m133146i()) != null) {
                return m133146i.m41044h();
            }
            return "";
        }
        return m41044h;
    }

    @Override // vc0.InterfaceC27965d
    /* renamed from: b */
    public boolean mo40584b() {
        return this.f68594r;
    }

    @Override // vc0.InterfaceC27965d
    /* renamed from: c */
    public String mo40586c() {
        MessageId m133146i;
        MessageId m95029V3;
        String m41044h;
        C17945a0 c17945a0 = this.f68596t;
        if (c17945a0 == null || (m95029V3 = c17945a0.m95029V3()) == null || (m41044h = m95029V3.m41044h()) == null) {
            C25821b c25821b = this.f68597u;
            if (c25821b != null && (m133146i = c25821b.m133146i()) != null) {
                return m133146i.m41044h();
            }
            return "";
        }
        return m41044h;
    }

    /* renamed from: d */
    public final C25821b m75082d() {
        return this.f68597u;
    }

    /* renamed from: e */
    public final CharSequence m75083e() {
        return this.f68593q;
    }

    public boolean equals(Object obj) {
        Class<?> cls;
        String str;
        if (this == obj) {
            return true;
        }
        String str2 = null;
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!AbstractC19074t.m100204b(C13380a.class, cls)) {
            return false;
        }
        AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type com.zing.zalo.ui.toolstorage.detail.StorageUsageDetailItem");
        C13380a c13380a = (C13380a) obj;
        if (this.f68592p != c13380a.f68592p || !AbstractC19074t.m100204b(this.f68593q, c13380a.f68593q) || this.f68594r != c13380a.f68594r || this.f68595s != c13380a.f68595s || !AbstractC19074t.m100204b(this.f68596t, c13380a.f68596t) || this.f68598v != c13380a.f68598v) {
            return false;
        }
        C25821b c25821b = this.f68597u;
        if (c25821b != null) {
            str = c25821b.m133141d();
        } else {
            str = null;
        }
        C25821b c25821b2 = c13380a.f68597u;
        if (c25821b2 != null) {
            str2 = c25821b2.m133141d();
        }
        if (AbstractC19074t.m100204b(str, str2)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final String m75084f(ToolStorageDetailPage.EnumC13333a enumC13333a) {
        String m133141d;
        AbstractC19074t.m100208f(enumC13333a, "accessFlow");
        if (enumC13333a == ToolStorageDetailPage.EnumC13333a.f68485s) {
            C25821b c25821b = this.f68597u;
            if (c25821b == null || (m133141d = c25821b.m133141d()) == null) {
                return "";
            }
            return m133141d;
        }
        return m75081a();
    }

    /* renamed from: g */
    public final String m75085g() {
        MediaExtInfo m90326c;
        String m95223p3;
        if (!m75100v()) {
            return "";
        }
        C17945a0 c17945a0 = this.f68596t;
        if (c17945a0 != null && (m95223p3 = c17945a0.m95223p3()) != null) {
            return m95223p3;
        }
        C25821b c25821b = this.f68597u;
        if (c25821b == null || (m90326c = AbstractC16893a.m90326c(c25821b)) == null) {
            return "";
        }
        return ((MediaExtInfo.File) m90326c).m90311b();
    }

    /* renamed from: h */
    public final String m75086h() {
        MediaExtInfo m90326c;
        String m95232q3;
        if (!m75100v()) {
            return "";
        }
        C17945a0 c17945a0 = this.f68596t;
        if (c17945a0 != null && (m95232q3 = c17945a0.m95232q3()) != null) {
            return m95232q3;
        }
        C25821b c25821b = this.f68597u;
        if (c25821b == null || (m90326c = AbstractC16893a.m90326c(c25821b)) == null) {
            return "";
        }
        return ((MediaExtInfo.File) m90326c).m90312c();
    }

    public int hashCode() {
        return super.hashCode();
    }

    /* renamed from: i */
    public final long m75087i() {
        return this.f68598v;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String m75088j() {
        String m94983Q3;
        try {
            C17945a0 c17945a0 = this.f68596t;
            String str = null;
            if (c17945a0 != null) {
                if (!AbstractC23041d2.m118194A(c17945a0.m94983Q3())) {
                    c17945a0 = null;
                }
                if (c17945a0 != null && (m94983Q3 = c17945a0.m94983Q3()) != null) {
                    str = m94983Q3;
                    if (str != null) {
                        return "";
                    }
                    return str;
                }
            }
            C25821b c25821b = this.f68597u;
            if (c25821b != null) {
                if (!c25821b.m133153p()) {
                    c25821b = null;
                }
                if (c25821b != null) {
                    str = c25821b.m133143f();
                }
            }
            if (str != null) {
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            return "";
        }
    }

    /* renamed from: k */
    public final C17945a0 m75089k() {
        return this.f68596t;
    }

    /* renamed from: l */
    public final MessageId m75090l() {
        MessageId m95029V3;
        C17945a0 c17945a0 = this.f68596t;
        if (c17945a0 == null || (m95029V3 = c17945a0.m95029V3()) == null) {
            C25821b c25821b = this.f68597u;
            if (c25821b != null) {
                return c25821b.m133146i();
            }
            return null;
        }
        return m95029V3;
    }

    /* renamed from: m */
    public final String m75091m() {
        String str;
        MessageId m133146i;
        C17945a0 c17945a0 = this.f68596t;
        if (c17945a0 == null || (str = c17945a0.mo95039W2()) == null) {
            C25821b c25821b = this.f68597u;
            if (c25821b != null && (m133146i = c25821b.m133146i()) != null) {
                str = m133146i.m41048l();
            } else {
                str = "";
            }
        }
        AbstractC19074t.m100205c(str);
        return str;
    }

    /* renamed from: n */
    public final String m75092n() {
        MediaExtInfo mediaExtInfo;
        if (!m75076F()) {
            return C2357l.f9883a.m12352b(0, false);
        }
        String m75088j = m75088j();
        if (m75088j.length() > 0) {
            return C7853b.Companion.m40150a().m40109U(m75088j);
        }
        C25821b c25821b = this.f68597u;
        if (c25821b != null) {
            if (c25821b != null) {
                mediaExtInfo = AbstractC16893a.m90326c(c25821b);
            } else {
                mediaExtInfo = null;
            }
            if (mediaExtInfo != null) {
                try {
                    C25821b c25821b2 = this.f68597u;
                    AbstractC19074t.m100205c(c25821b2);
                    MediaExtInfo m90326c = AbstractC16893a.m90326c(c25821b2);
                    AbstractC19074t.m100206d(m90326c, "null cannot be cast to non-null type com.zing.zalo.zalocloud.utils.MediaExtInfo.Voice");
                    return C2357l.f9883a.m12352b((int) ((MediaExtInfo.Voice) m90326c).m90321b(), false);
                } catch (Exception unused) {
                    return C2357l.f9883a.m12352b(0, false);
                }
            }
        }
        return C2357l.f9883a.m12352b(0, false);
    }

    /* renamed from: o */
    public final long m75093o() {
        C17945a0 c17945a0 = this.f68596t;
        if (c17945a0 != null) {
            return c17945a0.m94974P4();
        }
        C25821b c25821b = this.f68597u;
        if (c25821b != null) {
            return c25821b.m133150m();
        }
        return 0L;
    }

    /* renamed from: p */
    public final int m75094p() {
        return this.f68592p;
    }

    /* renamed from: q */
    public final boolean m75095q() {
        String m94947M4;
        String m94947M42;
        String str = "";
        if (m75102x()) {
            C17945a0 c17945a0 = this.f68596t;
            if (c17945a0 != null && (m94947M42 = c17945a0.m94947M4()) != null) {
                str = m94947M42;
            }
            return AbstractC23041d2.m118194A(str);
        }
        C25821b c25821b = this.f68597u;
        if (c25821b != null) {
            if (!c25821b.m133151n()) {
                c25821b = null;
            }
            if (c25821b != null) {
                return true;
            }
        }
        C17945a0 c17945a02 = this.f68596t;
        if (c17945a02 != null && (m94947M4 = c17945a02.m94947M4()) != null) {
            str = m94947M4;
        }
        return AbstractC23041d2.m118194A(str);
    }

    /* renamed from: r */
    public final boolean m75096r() {
        if (this.f68597u != null && !m75102x()) {
            return true;
        }
        return false;
    }

    /* renamed from: s */
    public final boolean m75097s() {
        C17945a0 c17945a0 = this.f68596t;
        if (c17945a0 != null && c17945a0.m95120e6()) {
            return true;
        }
        C25821b c25821b = this.f68597u;
        if (c25821b != null && AbstractC16893a.m90327d(c25821b)) {
            return true;
        }
        return false;
    }

    /* renamed from: t */
    public final AtomicBoolean m75098t() {
        return this.f68599w;
    }

    public String toString() {
        int i11 = this.f68592p;
        CharSequence charSequence = this.f68593q;
        return "StorageUsageDetailItem(type=" + i11 + ", customMessage=" + ((Object) charSequence) + ", isSelected=" + this.f68594r + ", isPlayingVoice=" + this.f68595s + ", mChatContent=" + this.f68596t + ", cloudItem=" + this.f68597u + ", fileSize=" + this.f68598v + ")";
    }

    /* renamed from: u */
    public final boolean m75099u() {
        return AbstractC23041d2.m118194A(m75088j());
    }

    /* renamed from: v */
    public final boolean m75100v() {
        C17945a0 c17945a0 = this.f68596t;
        if (c17945a0 != null && c17945a0.m95276v6()) {
            return true;
        }
        C25821b c25821b = this.f68597u;
        if (c25821b != null && AbstractC16893a.m90328e(c25821b)) {
            return true;
        }
        return false;
    }

    /* renamed from: w */
    public final boolean m75101w() {
        C17945a0 c17945a0 = this.f68596t;
        if (c17945a0 != null) {
            return c17945a0.m94847A6();
        }
        C25821b c25821b = this.f68597u;
        if (c25821b != null) {
            return AbstractC16893a.m90329f(c25821b);
        }
        return false;
    }

    /* renamed from: x */
    public final boolean m75102x() {
        String str;
        MessageId m133146i;
        C17945a0 c17945a0 = this.f68596t;
        if (c17945a0 != null && c17945a0.m94889F6()) {
            return true;
        }
        C25821b c25821b = this.f68597u;
        if (c25821b != null && (m133146i = c25821b.m133146i()) != null) {
            str = m133146i.m41048l();
        } else {
            str = null;
        }
        if (AbstractC25495a.m132078c(str)) {
            return true;
        }
        return false;
    }

    /* renamed from: y */
    public final boolean m75103y() {
        if (!m75071A() && !m75075E() && !m75097s()) {
            return false;
        }
        return true;
    }

    /* renamed from: z */
    public final boolean m75104z() {
        if (!m75096r() && this.f68596t != null) {
            return true;
        }
        return false;
    }

    public /* synthetic */ C13380a(int i11, CharSequence charSequence, boolean z11, boolean z12, C17945a0 c17945a0, C25821b c25821b, long j11, int i12, AbstractC19060k abstractC19060k) {
        this((i12 & 1) != 0 ? 1 : i11, (i12 & 2) != 0 ? null : charSequence, (i12 & 4) != 0 ? false : z11, (i12 & 8) == 0 ? z12 : false, (i12 & 16) != 0 ? null : c17945a0, (i12 & 32) == 0 ? c25821b : null, (i12 & 64) != 0 ? 0L : j11);
    }
}
