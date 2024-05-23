package tg0;

import ah0.C0860a;
import am.AbstractC0924m0;
import android.content.Context;
import ch0.AbstractC3489d;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.data.zalocloud.model.ZCloudQuotaUsage;
import com.zing.zalo.data.zalocloud.model.api.CloudSubscriptionInfo;
import com.zing.zalo.p062db.C7956b;
import com.zing.zalo.zalocloud.configs.AuditorConfig;
import com.zing.zalo.zalocloud.configs.C16805b;
import com.zing.zalo.zalocloud.migration.AbstractC16864d;
import com.zing.zalo.zalocloud.migration.C16862b;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import dh0.C17933b;
import dj.C17945a0;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19055h0;
import gw.C19669z;
import ho0.AbstractC20110a;
import hu.C20128b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowCollector;
import me0.AbstractC23041d2;
import nh0.InterfaceC23792b;
import nl.C23870a;
import og0.C24252c;
import og0.EnumC24251b;
import on0.AbstractC24341v;
import org.json.JSONObject;
import p019aj.C0876j;
import p056cj.AbstractC3536d;
import p212hj.AbstractC20071b;
import p248iy.AbstractC20887g;
import p348mi.AbstractC23306f;
import p396ol.EnumC24298a;
import p396ol.InterfaceC24301d;
import p461qu.AbstractC25495a;
import p487rl.C25821b;
import p487rl.C25823d;
import pm0.AbstractC24856m;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import qg0.C25268c;
import qm0.AbstractC25332a0;
import qm0.AbstractC25368s;
import qm0.AbstractC25370t;
import tg0.C26676b;
import ug0.AbstractC27254i;
import vm0.AbstractC28298d;
import wg0.AbstractC28991n;
import wm0.AbstractC29094b;
import wm0.AbstractC29096d;
import wm0.AbstractC29104l;
import zg0.C31831a;

/* renamed from: tg0.a */
/* loaded from: classes7.dex */
public final class C26675a {

    /* renamed from: a */
    public static final C26675a f126213a = new C26675a();

    /* renamed from: b */
    private static final InterfaceC24854k f126214b;

    /* renamed from: c */
    private static final InterfaceC24854k f126215c;

    /* renamed from: d */
    private static final InterfaceC24854k f126216d;

    /* renamed from: e */
    private static final InterfaceC24854k f126217e;

    /* renamed from: f */
    private static final InterfaceC24854k f126218f;

    /* renamed from: g */
    private static final InterfaceC24854k f126219g;

    /* renamed from: h */
    private static final InterfaceC24854k f126220h;

    /* renamed from: i */
    private static final InterfaceC24854k f126221i;

    /* renamed from: j */
    private static final List f126222j;

    /* renamed from: tg0.a$a */
    /* loaded from: classes7.dex */
    public static final class a {

        /* renamed from: a */
        private final int f126223a;

        /* renamed from: b */
        private final int f126224b;

        /* renamed from: c */
        private final List f126225c;

        public a(int i11, int i12, List list) {
            AbstractC19074t.m100208f(list, "missingItems");
            this.f126223a = i11;
            this.f126224b = i12;
            this.f126225c = list;
        }

        /* renamed from: a */
        public final List m136926a() {
            return this.f126225c;
        }

        /* renamed from: b */
        public final int m136927b() {
            return this.f126224b;
        }

        /* renamed from: c */
        public final int m136928c() {
            return this.f126223a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f126223a == aVar.f126223a && this.f126224b == aVar.f126224b && AbstractC19074t.m100204b(this.f126225c, aVar.f126225c);
        }

        public int hashCode() {
            return (((this.f126223a * 31) + this.f126224b) * 31) + this.f126225c.hashCode();
        }

        public String toString() {
            return "AuditCloudQueueResult(totalValidThread=" + this.f126223a + ", totalPotentialMsgCount=" + this.f126224b + ", missingItems=" + this.f126225c + ")";
        }
    }

    /* renamed from: tg0.a$b */
    /* loaded from: classes7.dex */
    public static final class b extends AbstractC29096d {

        /* renamed from: B */
        int f126227B;

        /* renamed from: s */
        Object f126228s;

        /* renamed from: t */
        Object f126229t;

        /* renamed from: u */
        Object f126230u;

        /* renamed from: v */
        Object f126231v;

        /* renamed from: w */
        Object f126232w;

        /* renamed from: x */
        Object f126233x;

        /* renamed from: y */
        Object f126234y;

        /* renamed from: z */
        /* synthetic */ Object f126235z;

        b(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f126235z = obj;
            this.f126227B |= Integer.MIN_VALUE;
            return C26675a.this.m136902k(this);
        }
    }

    /* renamed from: tg0.a$c */
    /* loaded from: classes7.dex */
    static final class c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final c f126236q = new c();

        c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final AuditorConfig mo12V4() {
            return C26675a.f126213a.m136906q().m89799e();
        }
    }

    /* renamed from: tg0.a$d */
    /* loaded from: classes7.dex */
    public static final class d extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f126237t;

        /* renamed from: u */
        final /* synthetic */ C25821b f126238u;

        /* renamed from: v */
        final /* synthetic */ Stack f126239v;

        /* renamed from: w */
        final /* synthetic */ InterfaceC18505l f126240w;

        /* renamed from: tg0.a$d$a */
        /* loaded from: classes7.dex */
        public static final class a implements InterfaceC24301d {

            /* renamed from: a */
            final /* synthetic */ C25821b f126241a;

            /* renamed from: b */
            final /* synthetic */ Stack f126242b;

            /* renamed from: c */
            final /* synthetic */ InterfaceC18505l f126243c;

            /* renamed from: tg0.a$d$a$a */
            /* loaded from: classes7.dex */
            static final class C32979a extends AbstractC29104l implements InterfaceC18509p {

                /* renamed from: t */
                int f126244t;

                /* renamed from: u */
                final /* synthetic */ Stack f126245u;

                /* renamed from: v */
                final /* synthetic */ InterfaceC18505l f126246v;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C32979a(Stack stack, InterfaceC18505l interfaceC18505l, Continuation continuation) {
                    super(2, continuation);
                    this.f126245u = stack;
                    this.f126246v = interfaceC18505l;
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: a */
                public final Continuation mo238a(Object obj, Continuation continuation) {
                    return new C32979a(this.f126245u, this.f126246v, continuation);
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: o */
                public final Object mo239o(Object obj) {
                    Object m142578e;
                    m142578e = AbstractC28298d.m142578e();
                    int i11 = this.f126244t;
                    if (i11 != 0) {
                        if (i11 == 1) {
                            AbstractC24862s.m129228b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        AbstractC24862s.m129228b(obj);
                        C26675a c26675a = C26675a.f126213a;
                        Stack stack = this.f126245u;
                        InterfaceC18505l interfaceC18505l = this.f126246v;
                        this.f126244t = 1;
                        if (c26675a.m136904m(stack, interfaceC18505l, this) == m142578e) {
                            return m142578e;
                        }
                    }
                    return C24848g0.f119245a;
                }

                @Override // en0.InterfaceC18509p
                /* renamed from: r */
                public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                    return ((C32979a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
                }
            }

            /* renamed from: tg0.a$d$a$b */
            /* loaded from: classes7.dex */
            static final class b extends AbstractC29104l implements InterfaceC18509p {

                /* renamed from: t */
                int f126247t;

                /* renamed from: u */
                final /* synthetic */ Stack f126248u;

                /* renamed from: v */
                final /* synthetic */ InterfaceC18505l f126249v;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(Stack stack, InterfaceC18505l interfaceC18505l, Continuation continuation) {
                    super(2, continuation);
                    this.f126248u = stack;
                    this.f126249v = interfaceC18505l;
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: a */
                public final Continuation mo238a(Object obj, Continuation continuation) {
                    return new b(this.f126248u, this.f126249v, continuation);
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: o */
                public final Object mo239o(Object obj) {
                    Object m142578e;
                    m142578e = AbstractC28298d.m142578e();
                    int i11 = this.f126247t;
                    if (i11 != 0) {
                        if (i11 == 1) {
                            AbstractC24862s.m129228b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        AbstractC24862s.m129228b(obj);
                        C26675a c26675a = C26675a.f126213a;
                        Stack stack = this.f126248u;
                        InterfaceC18505l interfaceC18505l = this.f126249v;
                        this.f126247t = 1;
                        if (c26675a.m136904m(stack, interfaceC18505l, this) == m142578e) {
                            return m142578e;
                        }
                    }
                    return C24848g0.f119245a;
                }

                @Override // en0.InterfaceC18509p
                /* renamed from: r */
                public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                    return ((b) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
                }
            }

            a(C25821b c25821b, Stack stack, InterfaceC18505l interfaceC18505l) {
                this.f126241a = c25821b;
                this.f126242b = stack;
                this.f126243c = interfaceC18505l;
            }

            @Override // p396ol.InterfaceC24301d
            /* renamed from: a */
            public void mo66919a(String str, long j11) {
                AbstractC19074t.m100208f(str, "downloadId");
            }

            @Override // p396ol.InterfaceC24301d
            /* renamed from: b */
            public boolean mo66920b() {
                return true;
            }

            @Override // p396ol.InterfaceC24301d
            /* renamed from: c */
            public EnumC24298a mo66921c() {
                return EnumC24298a.f117301t;
            }

            @Override // p396ol.InterfaceC24301d
            /* renamed from: d */
            public void mo66922d(String str, int i11, String str2) {
                AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
                AbstractC19074t.m100208f(str2, "errorMessage");
                C26675a.f126213a.m136885C("Audit Media Downloader: Download Failed (cloudId=" + this.f126241a + ", errorCode=" + i11 + ", errorMessage=" + str2 + ")");
                BuildersKt__BuildersKt.m112536b(null, new b(this.f126242b, this.f126243c, null), 1, null);
            }

            @Override // p396ol.InterfaceC24301d
            /* renamed from: e */
            public void mo66923e(String str, String str2) {
                AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
                AbstractC19074t.m100208f(str2, "path");
                C26675a.f126213a.m136885C("Audit Media Downloader: Download Success (cloudId=" + this.f126241a.m133141d() + ")");
                BuildersKt__BuildersKt.m112536b(null, new C32979a(this.f126242b, this.f126243c, null), 1, null);
            }

            @Override // p396ol.InterfaceC24301d
            /* renamed from: h */
            public int mo66924h() {
                return 2;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(C25821b c25821b, Stack stack, InterfaceC18505l interfaceC18505l, Continuation continuation) {
            super(2, continuation);
            this.f126238u = c25821b;
            this.f126239v = stack;
            this.f126240w = interfaceC18505l;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new d(this.f126238u, this.f126239v, this.f126240w, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f126237t == 0) {
                AbstractC24862s.m129228b(obj);
                C25821b c25821b = this.f126238u;
                c25821b.m133160w(new a(c25821b, this.f126239v, this.f126240w));
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: tg0.a$e */
    /* loaded from: classes7.dex */
    public static final class e extends AbstractC29096d {

        /* renamed from: s */
        Object f126250s;

        /* renamed from: t */
        Object f126251t;

        /* renamed from: u */
        /* synthetic */ Object f126252u;

        /* renamed from: w */
        int f126254w;

        e(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f126252u = obj;
            this.f126254w |= Integer.MIN_VALUE;
            return C26675a.this.m136924n(null, this);
        }
    }

    /* renamed from: tg0.a$f */
    /* loaded from: classes7.dex */
    static final class f extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final f f126255q = new f();

        f() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C16805b mo12V4() {
            return AbstractC23306f.m120633X1();
        }
    }

    /* renamed from: tg0.a$g */
    /* loaded from: classes7.dex */
    static final class g extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final g f126256q = new g();

        g() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C25268c mo12V4() {
            return AbstractC23306f.m120647b2();
        }
    }

    /* renamed from: tg0.a$h */
    /* loaded from: classes7.dex */
    static final class h extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final h f126257q = new h();

        h() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C23870a mo12V4() {
            return AbstractC23306f.m120679j2();
        }
    }

    /* renamed from: tg0.a$i */
    /* loaded from: classes7.dex */
    static final class i extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final i f126258q = new i();

        i() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C31831a mo12V4() {
            return AbstractC23306f.m120687l2();
        }
    }

    /* renamed from: tg0.a$j */
    /* loaded from: classes7.dex */
    public static final class j extends AbstractC29096d {

        /* renamed from: s */
        Object f126259s;

        /* renamed from: t */
        Object f126260t;

        /* renamed from: u */
        long f126261u;

        /* renamed from: v */
        /* synthetic */ Object f126262v;

        /* renamed from: x */
        int f126264x;

        j(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f126262v = obj;
            this.f126264x |= Integer.MIN_VALUE;
            return C26675a.this.m136884B(null, this);
        }
    }

    /* renamed from: tg0.a$k */
    /* loaded from: classes7.dex */
    static final class k extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final k f126265q = new k();

        k() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C0876j mo12V4() {
            return AbstractC23306f.m120584H0();
        }
    }

    /* renamed from: tg0.a$l */
    /* loaded from: classes7.dex */
    public static final class l extends AbstractC29096d {

        /* renamed from: s */
        Object f126266s;

        /* renamed from: t */
        Object f126267t;

        /* renamed from: u */
        Object f126268u;

        /* renamed from: v */
        Object f126269v;

        /* renamed from: w */
        /* synthetic */ Object f126270w;

        /* renamed from: y */
        int f126272y;

        l(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f126270w = obj;
            this.f126272y |= Integer.MIN_VALUE;
            return C26675a.this.m136886D(null, null, null, this);
        }
    }

    /* renamed from: tg0.a$m */
    /* loaded from: classes7.dex */
    public static final class m implements FlowCollector {

        /* renamed from: p */
        public static final m f126273p = new m();

        m() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object mo12109b(AbstractC16864d abstractC16864d, Continuation continuation) {
            if (abstractC16864d.mo90082c()) {
                C26675a.f126213a.m136885C("Re-Migrate Cloud Queue: START");
            } else if (abstractC16864d.mo90087h()) {
                C26675a.f126213a.m136885C("Re-Migrate Cloud Queue: COMPLETED");
            } else if (abstractC16864d.mo90083d()) {
                C26675a.f126213a.m136885C("Re-Migrate Cloud Queue: PAUSED");
            }
            return C24848g0.f119245a;
        }
    }

    /* renamed from: tg0.a$n */
    /* loaded from: classes7.dex */
    public static final class n extends AbstractC29096d {

        /* renamed from: s */
        Object f126274s;

        /* renamed from: t */
        /* synthetic */ Object f126275t;

        /* renamed from: v */
        int f126277v;

        n(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f126275t = obj;
            this.f126277v |= Integer.MIN_VALUE;
            return C26675a.this.m136916F(null, this);
        }
    }

    /* renamed from: tg0.a$o */
    /* loaded from: classes7.dex */
    public static final class o extends AbstractC29096d {

        /* renamed from: s */
        /* synthetic */ Object f126278s;

        /* renamed from: u */
        int f126280u;

        o(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f126278s = obj;
            this.f126280u |= Integer.MIN_VALUE;
            return C26675a.this.m136917G(this);
        }
    }

    /* renamed from: tg0.a$p */
    /* loaded from: classes7.dex */
    public static final class p extends AbstractC29096d {

        /* renamed from: s */
        Object f126281s;

        /* renamed from: t */
        Object f126282t;

        /* renamed from: u */
        Object f126283u;

        /* renamed from: v */
        /* synthetic */ Object f126284v;

        /* renamed from: x */
        int f126286x;

        p(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f126284v = obj;
            this.f126286x |= Integer.MIN_VALUE;
            return C26675a.this.m136888H(null, null, null, this);
        }
    }

    /* renamed from: tg0.a$q */
    /* loaded from: classes7.dex */
    public static final class q extends AbstractC29096d {

        /* renamed from: s */
        Object f126287s;

        /* renamed from: t */
        Object f126288t;

        /* renamed from: u */
        Object f126289u;

        /* renamed from: v */
        Object f126290v;

        /* renamed from: w */
        /* synthetic */ Object f126291w;

        /* renamed from: y */
        int f126293y;

        q(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f126291w = obj;
            this.f126293y |= Integer.MIN_VALUE;
            return C26675a.this.m136889I(null, null, null, this);
        }
    }

    /* renamed from: tg0.a$r */
    /* loaded from: classes7.dex */
    static final class r extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final r f126294q = new r();

        r() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C0860a mo12V4() {
            return AbstractC23306f.m120691m2();
        }
    }

    /* renamed from: tg0.a$s */
    /* loaded from: classes7.dex */
    static final class s extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final s f126295q = new s();

        s() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final InterfaceC23792b mo12V4() {
            return AbstractC23306f.m120579F1();
        }
    }

    /* renamed from: tg0.a$t */
    /* loaded from: classes7.dex */
    public static final class t extends AbstractC29096d {

        /* renamed from: s */
        Object f126296s;

        /* renamed from: t */
        Object f126297t;

        /* renamed from: u */
        Object f126298u;

        /* renamed from: v */
        Object f126299v;

        /* renamed from: w */
        /* synthetic */ Object f126300w;

        /* renamed from: y */
        int f126302y;

        t(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f126300w = obj;
            this.f126302y |= Integer.MIN_VALUE;
            return C26675a.this.m136922P(this);
        }
    }

    /* renamed from: tg0.a$u */
    /* loaded from: classes7.dex */
    public static final class u extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        Object f126303t;

        /* renamed from: u */
        Object f126304u;

        /* renamed from: v */
        Object f126305v;

        /* renamed from: w */
        long f126306w;

        /* renamed from: x */
        int f126307x;

        /* renamed from: tg0.a$u$a */
        /* loaded from: classes7.dex */
        public static final class a extends AbstractC29104l implements InterfaceC18505l {

            /* renamed from: t */
            Object f126308t;

            /* renamed from: u */
            Object f126309u;

            /* renamed from: v */
            int f126310v;

            /* renamed from: w */
            final /* synthetic */ AuditorConfig.MediaDownload f126311w;

            /* renamed from: x */
            final /* synthetic */ long f126312x;

            /* renamed from: tg0.a$u$a$a */
            /* loaded from: classes7.dex */
            public static final class C32980a extends AbstractC29104l implements InterfaceC18505l {

                /* renamed from: t */
                Object f126313t;

                /* renamed from: u */
                Object f126314u;

                /* renamed from: v */
                int f126315v;

                /* renamed from: w */
                final /* synthetic */ AuditorConfig.MediaDownload f126316w;

                /* renamed from: x */
                final /* synthetic */ long f126317x;

                /* renamed from: tg0.a$u$a$a$a */
                /* loaded from: classes7.dex */
                public static final class C32981a extends AbstractC29104l implements InterfaceC18505l {

                    /* renamed from: t */
                    Object f126318t;

                    /* renamed from: u */
                    Object f126319u;

                    /* renamed from: v */
                    int f126320v;

                    /* renamed from: w */
                    final /* synthetic */ AuditorConfig.MediaDownload f126321w;

                    /* renamed from: x */
                    final /* synthetic */ long f126322x;

                    /* renamed from: tg0.a$u$a$a$a$a */
                    /* loaded from: classes7.dex */
                    public static final class C32982a extends AbstractC29104l implements InterfaceC18505l {

                        /* renamed from: t */
                        int f126323t;

                        C32982a(Continuation continuation) {
                            super(1, continuation);
                        }

                        @Override // wm0.AbstractC29093a
                        /* renamed from: o */
                        public final Object mo239o(Object obj) {
                            AbstractC28298d.m142578e();
                            if (this.f126323t == 0) {
                                AbstractC24862s.m129228b(obj);
                                C26675a.f126213a.m136885C("Audit Media Downloader (VOICE): Complete");
                                return C24848g0.f119245a;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }

                        /* renamed from: r */
                        public final Continuation m136948r(Continuation continuation) {
                            return new C32982a(continuation);
                        }

                        @Override // en0.InterfaceC18505l
                        /* renamed from: s */
                        public final Object mo205i9(Continuation continuation) {
                            return ((C32982a) m136948r(continuation)).mo239o(C24848g0.f119245a);
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C32981a(AuditorConfig.MediaDownload mediaDownload, long j11, Continuation continuation) {
                        super(1, continuation);
                        this.f126321w = mediaDownload;
                        this.f126322x = j11;
                    }

                    @Override // wm0.AbstractC29093a
                    /* renamed from: o */
                    public final Object mo239o(Object obj) {
                        Object m142578e;
                        Stack stack;
                        Stack stack2;
                        m142578e = AbstractC28298d.m142578e();
                        int i11 = this.f126320v;
                        if (i11 != 0) {
                            if (i11 != 1) {
                                if (i11 == 2) {
                                    AbstractC24862s.m129228b(obj);
                                    return C24848g0.f119245a;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            stack = (Stack) this.f126319u;
                            stack2 = (Stack) this.f126318t;
                            AbstractC24862s.m129228b(obj);
                        } else {
                            AbstractC24862s.m129228b(obj);
                            C26675a c26675a = C26675a.f126213a;
                            c26675a.m136885C("Audit Media Downloader (FILE): Complete");
                            stack = new Stack();
                            AuditorConfig.MediaDownload mediaDownload = this.f126321w;
                            long j11 = this.f126322x;
                            C23870a m136908s = c26675a.m136908s();
                            int m89763d = mediaDownload.m89757b().m89763d();
                            this.f126318t = stack;
                            this.f126319u = stack;
                            this.f126320v = 1;
                            obj = m136908s.m124798Z(m89763d, j11, 6, this);
                            if (obj == m142578e) {
                                return m142578e;
                            }
                            stack2 = stack;
                        }
                        stack.addAll((Collection) obj);
                        C26675a c26675a2 = C26675a.f126213a;
                        C32982a c32982a = new C32982a(null);
                        this.f126318t = null;
                        this.f126319u = null;
                        this.f126320v = 2;
                        if (c26675a2.m136904m(stack2, c32982a, this) == m142578e) {
                            return m142578e;
                        }
                        return C24848g0.f119245a;
                    }

                    /* renamed from: r */
                    public final Continuation m136946r(Continuation continuation) {
                        return new C32981a(this.f126321w, this.f126322x, continuation);
                    }

                    @Override // en0.InterfaceC18505l
                    /* renamed from: s */
                    public final Object mo205i9(Continuation continuation) {
                        return ((C32981a) m136946r(continuation)).mo239o(C24848g0.f119245a);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C32980a(AuditorConfig.MediaDownload mediaDownload, long j11, Continuation continuation) {
                    super(1, continuation);
                    this.f126316w = mediaDownload;
                    this.f126317x = j11;
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: o */
                public final Object mo239o(Object obj) {
                    Object m142578e;
                    Stack stack;
                    Stack stack2;
                    m142578e = AbstractC28298d.m142578e();
                    int i11 = this.f126315v;
                    if (i11 != 0) {
                        if (i11 != 1) {
                            if (i11 == 2) {
                                AbstractC24862s.m129228b(obj);
                                return C24848g0.f119245a;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        stack = (Stack) this.f126314u;
                        stack2 = (Stack) this.f126313t;
                        AbstractC24862s.m129228b(obj);
                    } else {
                        AbstractC24862s.m129228b(obj);
                        C26675a c26675a = C26675a.f126213a;
                        c26675a.m136885C("Audit Media Downloader (VIDEO): Complete");
                        stack = new Stack();
                        AuditorConfig.MediaDownload mediaDownload = this.f126316w;
                        long j11 = this.f126317x;
                        C23870a m136908s = c26675a.m136908s();
                        int m89760a = mediaDownload.m89757b().m89760a();
                        this.f126313t = stack;
                        this.f126314u = stack;
                        this.f126315v = 1;
                        obj = m136908s.m124798Z(m89760a, j11, 22, this);
                        if (obj == m142578e) {
                            return m142578e;
                        }
                        stack2 = stack;
                    }
                    stack.addAll((Collection) obj);
                    C26675a c26675a2 = C26675a.f126213a;
                    C32981a c32981a = new C32981a(this.f126316w, this.f126317x, null);
                    this.f126313t = null;
                    this.f126314u = null;
                    this.f126315v = 2;
                    if (c26675a2.m136904m(stack2, c32981a, this) == m142578e) {
                        return m142578e;
                    }
                    return C24848g0.f119245a;
                }

                /* renamed from: r */
                public final Continuation m136944r(Continuation continuation) {
                    return new C32980a(this.f126316w, this.f126317x, continuation);
                }

                @Override // en0.InterfaceC18505l
                /* renamed from: s */
                public final Object mo205i9(Continuation continuation) {
                    return ((C32980a) m136944r(continuation)).mo239o(C24848g0.f119245a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(AuditorConfig.MediaDownload mediaDownload, long j11, Continuation continuation) {
                super(1, continuation);
                this.f126311w = mediaDownload;
                this.f126312x = j11;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                Object m142578e;
                Stack stack;
                Stack stack2;
                m142578e = AbstractC28298d.m142578e();
                int i11 = this.f126310v;
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            AbstractC24862s.m129228b(obj);
                            return C24848g0.f119245a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    stack = (Stack) this.f126309u;
                    stack2 = (Stack) this.f126308t;
                    AbstractC24862s.m129228b(obj);
                } else {
                    AbstractC24862s.m129228b(obj);
                    C26675a c26675a = C26675a.f126213a;
                    c26675a.m136885C("Audit Media Downloader (PHOTO): Complete");
                    stack = new Stack();
                    AuditorConfig.MediaDownload mediaDownload = this.f126311w;
                    long j11 = this.f126312x;
                    C23870a m136908s = c26675a.m136908s();
                    int m89762c = mediaDownload.m89757b().m89762c();
                    this.f126308t = stack;
                    this.f126309u = stack;
                    this.f126310v = 1;
                    obj = m136908s.m124798Z(m89762c, j11, 19, this);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                    stack2 = stack;
                }
                stack.addAll((Collection) obj);
                C26675a c26675a2 = C26675a.f126213a;
                C32980a c32980a = new C32980a(this.f126311w, this.f126312x, null);
                this.f126308t = null;
                this.f126309u = null;
                this.f126310v = 2;
                if (c26675a2.m136904m(stack2, c32980a, this) == m142578e) {
                    return m142578e;
                }
                return C24848g0.f119245a;
            }

            /* renamed from: r */
            public final Continuation m136942r(Continuation continuation) {
                return new a(this.f126311w, this.f126312x, continuation);
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: s */
            public final Object mo205i9(Continuation continuation) {
                return ((a) m136942r(continuation)).mo239o(C24848g0.f119245a);
            }
        }

        u(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new u(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            AuditorConfig.MediaDownload m89746d;
            Stack stack;
            long j11;
            Stack stack2;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f126307x;
            try {
            } catch (Exception e11) {
                C26676b.m136954d("SMLZCloudAuditor", e11);
            }
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        AbstractC24862s.m129228b(obj);
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j11 = this.f126306w;
                stack = (Stack) this.f126305v;
                stack2 = (Stack) this.f126304u;
                m89746d = (AuditorConfig.MediaDownload) this.f126303t;
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                C26675a c26675a = C26675a.f126213a;
                m89746d = c26675a.m136905p().m89746d();
                if (m89746d.m89758c()) {
                    c26675a.m136885C("Audit Media Downloader: START");
                    c26675a.m136885C("Audit Media Downloader: Config=" + m89746d);
                    long m89756a = m89746d.m89756a();
                    stack = new Stack();
                    C23870a m136908s = c26675a.m136908s();
                    int m89761b = m89746d.m89757b().m89761b();
                    this.f126303t = m89746d;
                    this.f126304u = stack;
                    this.f126305v = stack;
                    this.f126306w = m89756a;
                    this.f126307x = 1;
                    obj = m136908s.m124798Z(m89761b, m89756a, 3, this);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                    j11 = m89756a;
                    stack2 = stack;
                } else {
                    return C24848g0.f119245a;
                }
            }
            stack.addAll((Collection) obj);
            C26675a c26675a2 = C26675a.f126213a;
            a aVar = new a(m89746d, j11, null);
            this.f126303t = null;
            this.f126304u = null;
            this.f126305v = null;
            this.f126307x = 2;
            if (c26675a2.m136904m(stack2, aVar, this) == m142578e) {
                return m142578e;
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((u) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    static {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        InterfaceC24854k m129210a3;
        InterfaceC24854k m129210a4;
        InterfaceC24854k m129210a5;
        InterfaceC24854k m129210a6;
        InterfaceC24854k m129210a7;
        InterfaceC24854k m129210a8;
        List m131505m;
        m129210a = AbstractC24856m.m129210a(s.f126295q);
        f126214b = m129210a;
        m129210a2 = AbstractC24856m.m129210a(r.f126294q);
        f126215c = m129210a2;
        m129210a3 = AbstractC24856m.m129210a(g.f126256q);
        f126216d = m129210a3;
        m129210a4 = AbstractC24856m.m129210a(h.f126257q);
        f126217e = m129210a4;
        m129210a5 = AbstractC24856m.m129210a(f.f126255q);
        f126218f = m129210a5;
        m129210a6 = AbstractC24856m.m129210a(i.f126258q);
        f126219g = m129210a6;
        m129210a7 = AbstractC24856m.m129210a(k.f126265q);
        f126220h = m129210a7;
        m129210a8 = AbstractC24856m.m129210a(c.f126236q);
        f126221i = m129210a8;
        m131505m = AbstractC25368s.m131505m(1504100, 1504110, 1504120, 1504130, 1504214, 1504210, 1504211, 1504212, 1504213, 26035, 26036, 26038, 26037, 1504400, 1504410, 1504501, 1504600, 1504610);
        f126222j = m131505m;
    }

    private C26675a() {
    }

    /* renamed from: A */
    private final boolean m136883A(C17945a0 c17945a0) {
        if ((m136913x().mo124314i() - c17945a0.m94974P4()) / 1000 >= m136905p().m89743a().m89753a()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00e8 A[Catch: Exception -> 0x0037, TryCatch #0 {Exception -> 0x0037, blocks: (B:11:0x0032, B:12:0x00cc, B:17:0x00de, B:19:0x00e8, B:22:0x00f2, B:24:0x00f8, B:26:0x0102, B:28:0x011a, B:31:0x0138, B:32:0x013e, B:34:0x0148, B:36:0x0164, B:39:0x016c, B:44:0x0045, B:46:0x004b, B:48:0x0050, B:50:0x005a, B:52:0x005f, B:54:0x007e, B:56:0x0083, B:58:0x008d, B:61:0x009b, B:63:0x00b7), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00f2 A[Catch: Exception -> 0x0037, TryCatch #0 {Exception -> 0x0037, blocks: (B:11:0x0032, B:12:0x00cc, B:17:0x00de, B:19:0x00e8, B:22:0x00f2, B:24:0x00f8, B:26:0x0102, B:28:0x011a, B:31:0x0138, B:32:0x013e, B:34:0x0148, B:36:0x0164, B:39:0x016c, B:44:0x0045, B:46:0x004b, B:48:0x0050, B:50:0x005a, B:52:0x005f, B:54:0x007e, B:56:0x0083, B:58:0x008d, B:61:0x009b, B:63:0x00b7), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* renamed from: B */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m136884B(Context context, Continuation continuation) {
        j jVar;
        Object m142578e;
        int i11;
        long j11;
        C26675a c26675a;
        long j12;
        long longValue;
        int i12;
        try {
            if (continuation instanceof j) {
                jVar = (j) continuation;
                int i13 = jVar.f126264x;
                if ((i13 & Integer.MIN_VALUE) != 0) {
                    jVar.f126264x = i13 - Integer.MIN_VALUE;
                    Object obj = jVar.f126262v;
                    m142578e = AbstractC28298d.m142578e();
                    i11 = jVar.f126264x;
                    if (i11 == 0) {
                        if (i11 == 1) {
                            j12 = jVar.f126261u;
                            context = (Context) jVar.f126260t;
                            c26675a = (C26675a) jVar.f126259s;
                            AbstractC24862s.m129228b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        AbstractC24862s.m129228b(obj);
                        if (!AbstractC3489d.m17501i()) {
                            return AbstractC29094b.m145339a(false);
                        }
                        if (!m136905p().m89749g()) {
                            return AbstractC29094b.m145339a(false);
                        }
                        long mo124314i = m136913x().mo124314i();
                        if ((mo124314i - m136910u()) / 1000 <= m136905p().m89744b()) {
                            return AbstractC29094b.m145339a(false);
                        }
                        CloudSubscriptionInfo m2458h = m136912w().m2458h();
                        if (m2458h != null) {
                            j11 = m2458h.m41319c();
                        } else {
                            j11 = Long.MAX_VALUE;
                        }
                        if (j11 >= mo124314i) {
                            m136885C("isValidToAudit(): Invalid subscription time (" + j11 + ")");
                            return AbstractC29094b.m145339a(false);
                        }
                        C25268c m136907r = m136907r();
                        jVar.f126259s = this;
                        jVar.f126260t = context;
                        jVar.f126261u = mo124314i;
                        jVar.f126264x = 1;
                        obj = m136907r.m130769w(jVar);
                        if (obj == m142578e) {
                            return m142578e;
                        }
                        c26675a = this;
                        j12 = mo124314i;
                    }
                    longValue = ((Number) obj).longValue();
                    if (longValue > 0 && longValue < j12) {
                        if (C24252c.f117152a.m126600f(EnumC24251b.f117146q)) {
                            c26675a.m136885C("isValidToAudit(): Not opt-in Cloud Media");
                            return AbstractC29094b.m145339a(false);
                        }
                        if (!AbstractC28991n.m144790B()) {
                            c26675a.m136885C("isValidToAudit(): Onboarding Setup not completed");
                            return AbstractC29094b.m145339a(false);
                        }
                        C23870a m136908s = c26675a.m136908s();
                        AbstractC19074t.m100207e(m136908s, "<get-cloudRepo>(...)");
                        ZCloudQuotaUsage m124718I0 = C23870a.m124718I0(m136908s, false, null, null, 7, null);
                        if (m124718I0.m41256n()) {
                            c26675a.m136885C("isValidToAudit(): Full quota usage (" + m124718I0 + ")");
                            return AbstractC29094b.m145339a(false);
                        }
                        if (context != null) {
                            i12 = C20128b.m104756c(context);
                        } else {
                            i12 = 0;
                        }
                        if (i12 < c26675a.m136905p().m89747e()) {
                            c26675a.m136885C("isValidToAudit(): Low battery (" + i12 + ")");
                            return AbstractC29094b.m145339a(false);
                        }
                        c26675a.m136887E(j12);
                        return AbstractC29094b.m145339a(true);
                    }
                    c26675a.m136885C("isValidToAudit(): Invalid submit Cloud Key time (" + longValue + ")");
                    return AbstractC29094b.m145339a(false);
                }
            }
            if (i11 == 0) {
            }
            longValue = ((Number) obj).longValue();
            if (longValue > 0) {
                if (C24252c.f117152a.m126600f(EnumC24251b.f117146q)) {
                }
            }
            c26675a.m136885C("isValidToAudit(): Invalid submit Cloud Key time (" + longValue + ")");
            return AbstractC29094b.m145339a(false);
        } catch (Exception e11) {
            C26676b.m136954d("SMLZCloudAuditor", e11);
            return AbstractC29094b.m145339a(false);
        }
        jVar = new j(continuation);
        Object obj2 = jVar.f126262v;
        m142578e = AbstractC28298d.m142578e();
        i11 = jVar.f126264x;
    }

    /* renamed from: C */
    public final void m136885C(String str) {
        C26676b.m136955e("SMLZCloudAuditor", str, C26676b.b.f126337v);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00be -> B:17:0x00c1). Please report as a decompilation issue!!! */
    /* renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m136886D(List list, List list2, List list3, Continuation continuation) {
        l lVar;
        C26675a c26675a;
        Object m142578e;
        int i11;
        List m131222v0;
        List m131222v02;
        C26675a c26675a2;
        Collection collection;
        Iterator it;
        if (continuation instanceof l) {
            lVar = (l) continuation;
            int i12 = lVar.f126272y;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                lVar.f126272y = i12 - Integer.MIN_VALUE;
                c26675a = this;
                Object obj = lVar.f126270w;
                m142578e = AbstractC28298d.m142578e();
                i11 = lVar.f126272y;
                if (i11 == 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            AbstractC24862s.m129228b(obj);
                            return C24848g0.f119245a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (Iterator) lVar.f126269v;
                    collection = (Collection) lVar.f126268u;
                    List list4 = (List) lVar.f126267t;
                    C26675a c26675a3 = (C26675a) lVar.f126266s;
                    AbstractC24862s.m129228b(obj);
                    c26675a2 = c26675a3;
                    C25823d c25823d = (C25823d) obj;
                    if (c25823d != null) {
                        collection.add(c25823d);
                    }
                    m131222v02 = list4;
                    if (it.hasNext()) {
                        C17945a0 c17945a0 = (C17945a0) it.next();
                        lVar.f126266s = c26675a2;
                        lVar.f126267t = m131222v02;
                        lVar.f126268u = collection;
                        lVar.f126269v = it;
                        lVar.f126272y = 1;
                        Object m139452d = AbstractC27254i.m139452d(c17945a0, false, false, lVar, 3, null);
                        if (m139452d == m142578e) {
                            return m142578e;
                        }
                        list4 = m131222v02;
                        obj = m139452d;
                        C25823d c25823d2 = (C25823d) obj;
                        if (c25823d2 != null) {
                        }
                        m131222v02 = list4;
                        if (it.hasNext()) {
                            List list5 = (List) collection;
                            c26675a2.m136885C("Re-Migrate Cloud Queue: Total " + m131222v02.size() + " error item(s), valid to re-migrate " + list5.size() + " item(s)");
                            C16862b c16862b = new C16862b("auditor", new C26679e(list5), null, 4, null);
                            m mVar = m.f126273p;
                            lVar.f126266s = null;
                            lVar.f126267t = null;
                            lVar.f126268u = null;
                            lVar.f126269v = null;
                            lVar.f126272y = 2;
                            if (c16862b.m90056T(true, mVar, lVar) == m142578e) {
                                return m142578e;
                            }
                            return C24848g0.f119245a;
                        }
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    m131222v0 = AbstractC25332a0.m131222v0(list, list2);
                    m131222v02 = AbstractC25332a0.m131222v0(m131222v0, list3);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : m131222v02) {
                        if (f126213a.m136883A((C17945a0) obj2)) {
                            arrayList.add(obj2);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = arrayList.iterator();
                    c26675a2 = c26675a;
                    collection = arrayList2;
                    it = it2;
                    if (it.hasNext()) {
                    }
                }
            }
        }
        c26675a = this;
        lVar = new l(continuation);
        Object obj3 = lVar.f126270w;
        m142578e = AbstractC28298d.m142578e();
        i11 = lVar.f126272y;
        if (i11 == 0) {
        }
    }

    /* renamed from: E */
    private final void m136887E(long j11) {
        m136885C("setLastTimeAuditZCloud(): " + j11);
        AbstractC0924m0.m3785ej(j11);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:1|(2:3|(15:5|6|7|(1:(2:10|11)(2:31|32))(3:33|34|(1:36))|12|(2:15|13)|16|17|(2:20|18)|21|22|(2:25|23)|26|27|28))|39|6|7|(0)(0)|12|(1:13)|16|17|(1:18)|21|22|(1:23)|26|27|28) */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0037, code lost:            r12 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00cc, code lost:            tg0.C26676b.m136954d("SMLZCloudAuditor", r12);     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0060 A[Catch: Exception -> 0x0037, LOOP:0: B:13:0x005a->B:15:0x0060, LOOP_END, TryCatch #0 {Exception -> 0x0037, blocks: (B:11:0x0033, B:12:0x0054, B:13:0x005a, B:15:0x0060, B:17:0x007c, B:18:0x0082, B:20:0x0088, B:22:0x00a4, B:23:0x00aa, B:25:0x00b0, B:34:0x0045), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0088 A[Catch: Exception -> 0x0037, LOOP:1: B:18:0x0082->B:20:0x0088, LOOP_END, TryCatch #0 {Exception -> 0x0037, blocks: (B:11:0x0033, B:12:0x0054, B:13:0x005a, B:15:0x0060, B:17:0x007c, B:18:0x0082, B:20:0x0088, B:22:0x00a4, B:23:0x00aa, B:25:0x00b0, B:34:0x0045), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b0 A[Catch: Exception -> 0x0037, LOOP:2: B:23:0x00aa->B:25:0x00b0, LOOP_END, TRY_LEAVE, TryCatch #0 {Exception -> 0x0037, blocks: (B:11:0x0033, B:12:0x0054, B:13:0x005a, B:15:0x0060, B:17:0x007c, B:18:0x0082, B:20:0x0088, B:22:0x00a4, B:23:0x00aa, B:25:0x00b0, B:34:0x0045), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* renamed from: H */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m136888H(List list, List list2, List list3, Continuation continuation) {
        p pVar;
        Object m142578e;
        int i11;
        if (continuation instanceof p) {
            pVar = (p) continuation;
            int i12 = pVar.f126286x;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                pVar.f126286x = i12 - Integer.MIN_VALUE;
                Object obj = pVar.f126284v;
                m142578e = AbstractC28298d.m142578e();
                i11 = pVar.f126286x;
                if (i11 == 0) {
                    if (i11 == 1) {
                        list3 = (List) pVar.f126283u;
                        list2 = (List) pVar.f126282t;
                        list = (List) pVar.f126281s;
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    pVar.f126281s = list;
                    pVar.f126282t = list2;
                    pVar.f126283u = list3;
                    pVar.f126286x = 1;
                    if (m136889I(list, list2, list3, pVar) == m142578e) {
                        return m142578e;
                    }
                }
                for (C17945a0 c17945a0 : list) {
                    C26675a c26675a = f126213a;
                    m136890L(c26675a, 1504211, -1, null, c26675a.m136903l(c17945a0), 0L, 0L, 52, null);
                }
                for (C17945a0 c17945a02 : list2) {
                    C26675a c26675a2 = f126213a;
                    m136890L(c26675a2, 1504212, -1, null, c26675a2.m136903l(c17945a02), 0L, 0L, 52, null);
                }
                for (C17945a0 c17945a03 : list3) {
                    C26675a c26675a3 = f126213a;
                    m136890L(c26675a3, 1504213, -1, null, c26675a3.m136903l(c17945a03), 0L, 0L, 52, null);
                }
                return C24848g0.f119245a;
            }
        }
        pVar = new p(continuation);
        Object obj2 = pVar.f126284v;
        m142578e = AbstractC28298d.m142578e();
        i11 = pVar.f126286x;
        if (i11 == 0) {
        }
        while (r12.hasNext()) {
        }
        while (r12.hasNext()) {
        }
        while (r12.hasNext()) {
        }
        return C24848g0.f119245a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: I */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m136889I(List list, List list2, List list3, Continuation continuation) {
        q qVar;
        Object m142578e;
        int i11;
        C26675a c26675a;
        if (continuation instanceof q) {
            qVar = (q) continuation;
            int i12 = qVar.f126293y;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                qVar.f126293y = i12 - Integer.MIN_VALUE;
                Object obj = qVar.f126291w;
                m142578e = AbstractC28298d.m142578e();
                i11 = qVar.f126293y;
                if (i11 == 0) {
                    if (i11 == 1) {
                        list3 = (List) qVar.f126290v;
                        list2 = (List) qVar.f126289u;
                        list = (List) qVar.f126288t;
                        c26675a = (C26675a) qVar.f126287s;
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    C23870a m136908s = m136908s();
                    qVar.f126287s = this;
                    qVar.f126288t = list;
                    qVar.f126289u = list2;
                    qVar.f126290v = list3;
                    qVar.f126293y = 1;
                    obj = m136908s.m124775K(qVar);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                    c26675a = this;
                }
                int intValue = ((Number) obj).intValue();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("total_item", intValue);
                jSONObject.put("error_migration_local_item", list.size());
                jSONObject.put("error_migration_server_item", list2.size());
                jSONObject.put("error_new_item", list3.size());
                m136891O(c26675a, 1504210, jSONObject.toString(), 0L, 0L, 12, null);
                return C24848g0.f119245a;
            }
        }
        qVar = new q(continuation);
        Object obj2 = qVar.f126291w;
        m142578e = AbstractC28298d.m142578e();
        i11 = qVar.f126293y;
        if (i11 == 0) {
        }
        int intValue2 = ((Number) obj2).intValue();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("total_item", intValue2);
        jSONObject2.put("error_migration_local_item", list.size());
        jSONObject2.put("error_migration_server_item", list2.size());
        jSONObject2.put("error_new_item", list3.size());
        m136891O(c26675a, 1504210, jSONObject2.toString(), 0L, 0L, 12, null);
        return C24848g0.f119245a;
    }

    /* renamed from: L */
    public static /* synthetic */ void m136890L(C26675a c26675a, int i11, int i12, String str, JSONObject jSONObject, long j11, long j12, int i13, Object obj) {
        String str2;
        JSONObject jSONObject2;
        long j13;
        long j14;
        if ((i13 & 4) != 0) {
            str2 = null;
        } else {
            str2 = str;
        }
        if ((i13 & 8) != 0) {
            jSONObject2 = null;
        } else {
            jSONObject2 = jSONObject;
        }
        if ((i13 & 16) != 0) {
            j13 = System.currentTimeMillis();
        } else {
            j13 = j11;
        }
        if ((i13 & 32) != 0) {
            j14 = System.currentTimeMillis();
        } else {
            j14 = j12;
        }
        c26675a.m136918J(i11, i12, str2, jSONObject2, j13, j14);
    }

    /* renamed from: O */
    public static /* synthetic */ void m136891O(C26675a c26675a, int i11, String str, long j11, long j12, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            str = null;
        }
        String str2 = str;
        if ((i12 & 4) != 0) {
            j11 = System.currentTimeMillis();
        }
        long j13 = j11;
        if ((i12 & 8) != 0) {
            j12 = System.currentTimeMillis();
        }
        c26675a.m136920M(i11, str2, j13, j12);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0180 A[Catch: Exception -> 0x0056, TryCatch #0 {Exception -> 0x0056, blocks: (B:13:0x0050, B:15:0x016d, B:16:0x017a, B:18:0x0180, B:19:0x018f, B:21:0x0195, B:27:0x01bc, B:34:0x01c0, B:35:0x0106, B:37:0x010c, B:38:0x0131, B:40:0x0137, B:42:0x014e, B:48:0x00a3, B:50:0x00a9, B:53:0x00d0, B:54:0x01d4, B:60:0x0075, B:62:0x0079, B:63:0x0089, B:65:0x0080), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x010c A[Catch: Exception -> 0x0056, TryCatch #0 {Exception -> 0x0056, blocks: (B:13:0x0050, B:15:0x016d, B:16:0x017a, B:18:0x0180, B:19:0x018f, B:21:0x0195, B:27:0x01bc, B:34:0x01c0, B:35:0x0106, B:37:0x010c, B:38:0x0131, B:40:0x0137, B:42:0x014e, B:48:0x00a3, B:50:0x00a9, B:53:0x00d0, B:54:0x01d4, B:60:0x0075, B:62:0x0079, B:63:0x0089, B:65:0x0080), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a9 A[Catch: Exception -> 0x0056, TryCatch #0 {Exception -> 0x0056, blocks: (B:13:0x0050, B:15:0x016d, B:16:0x017a, B:18:0x0180, B:19:0x018f, B:21:0x0195, B:27:0x01bc, B:34:0x01c0, B:35:0x0106, B:37:0x010c, B:38:0x0131, B:40:0x0137, B:42:0x014e, B:48:0x00a3, B:50:0x00a9, B:53:0x00d0, B:54:0x01d4, B:60:0x0075, B:62:0x0079, B:63:0x0089, B:65:0x0080), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01d4 A[Catch: Exception -> 0x0056, TRY_LEAVE, TryCatch #0 {Exception -> 0x0056, blocks: (B:13:0x0050, B:15:0x016d, B:16:0x017a, B:18:0x0180, B:19:0x018f, B:21:0x0195, B:27:0x01bc, B:34:0x01c0, B:35:0x0106, B:37:0x010c, B:38:0x0131, B:40:0x0137, B:42:0x014e, B:48:0x00a3, B:50:0x00a9, B:53:0x00d0, B:54:0x01d4, B:60:0x0075, B:62:0x0079, B:63:0x0089, B:65:0x0080), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0166 -> B:15:0x016d). Please report as a decompilation issue!!! */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m136902k(Continuation continuation) {
        b bVar;
        Object m142578e;
        int i11;
        List list;
        C19055h0 c19055h0;
        ArrayList arrayList;
        Iterator it;
        ContactProfile contactProfile;
        List m131195U;
        Iterator it2;
        Iterator it3;
        int m131511r;
        List list2;
        Object obj;
        List m131195U2;
        try {
            if (continuation instanceof b) {
                bVar = (b) continuation;
                int i12 = bVar.f126227B;
                if ((i12 & Integer.MIN_VALUE) != 0) {
                    bVar.f126227B = i12 - Integer.MIN_VALUE;
                    Object obj2 = bVar.f126235z;
                    m142578e = AbstractC28298d.m142578e();
                    i11 = bVar.f126227B;
                    int i13 = 2;
                    Object obj3 = null;
                    if (i11 == 0) {
                        if (i11 != 1) {
                            if (i11 != 2) {
                                if (i11 == 3) {
                                    List list3 = (List) bVar.f126234y;
                                    it2 = (Iterator) bVar.f126233x;
                                    ContactProfile contactProfile2 = (ContactProfile) bVar.f126232w;
                                    Iterator it4 = (Iterator) bVar.f126231v;
                                    ArrayList arrayList2 = (ArrayList) bVar.f126230u;
                                    C19055h0 c19055h02 = (C19055h0) bVar.f126229t;
                                    List list4 = (List) bVar.f126228s;
                                    AbstractC24862s.m129228b(obj2);
                                    List list5 = (List) obj2;
                                    ArrayList arrayList3 = new ArrayList();
                                    for (Object obj4 : list3) {
                                        C17945a0 c17945a0 = (C17945a0) obj4;
                                        Iterator it5 = list5.iterator();
                                        while (true) {
                                            if (it5.hasNext()) {
                                                obj = it5.next();
                                                list2 = list5;
                                                if (AbstractC19074t.m100204b(((C25821b) obj).m133146i(), c17945a0.m95029V3())) {
                                                    break;
                                                }
                                                list5 = list2;
                                            } else {
                                                list2 = list5;
                                                obj = null;
                                                break;
                                            }
                                        }
                                        if (obj == null) {
                                            arrayList3.add(obj4);
                                        }
                                        list5 = list2;
                                    }
                                    arrayList2.addAll(arrayList3);
                                    contactProfile = contactProfile2;
                                    it3 = it4;
                                    arrayList = arrayList2;
                                    c19055h0 = c19055h02;
                                    list = list4;
                                    obj3 = null;
                                    if (!it2.hasNext()) {
                                        List list6 = (List) it2.next();
                                        C23870a m136908s = f126213a.m136908s();
                                        String mo2478b = contactProfile.mo2478b();
                                        AbstractC19074t.m100207e(mo2478b, "getUid(...)");
                                        List list7 = list6;
                                        m131511r = AbstractC25370t.m131511r(list7, 10);
                                        ArrayList arrayList4 = new ArrayList(m131511r);
                                        for (Iterator it6 = list7.iterator(); it6.hasNext(); it6 = it6) {
                                            MessageId m95029V3 = ((C17945a0) it6.next()).m95029V3();
                                            AbstractC19074t.m100207e(m95029V3, "getMessageId(...)");
                                            arrayList4.add(m95029V3);
                                        }
                                        bVar.f126228s = list;
                                        bVar.f126229t = c19055h0;
                                        bVar.f126230u = arrayList;
                                        bVar.f126231v = it3;
                                        bVar.f126232w = contactProfile;
                                        bVar.f126233x = it2;
                                        bVar.f126234y = list6;
                                        bVar.f126227B = 3;
                                        Object m124796X = m136908s.m124796X(mo2478b, arrayList4, bVar);
                                        if (m124796X == m142578e) {
                                            return m142578e;
                                        }
                                        c19055h02 = c19055h0;
                                        list4 = list;
                                        it4 = it3;
                                        obj2 = m124796X;
                                        arrayList2 = arrayList;
                                        contactProfile2 = contactProfile;
                                        list3 = list6;
                                        List list52 = (List) obj2;
                                        ArrayList arrayList32 = new ArrayList();
                                        while (r4.hasNext()) {
                                        }
                                        arrayList2.addAll(arrayList32);
                                        contactProfile = contactProfile2;
                                        it3 = it4;
                                        arrayList = arrayList2;
                                        c19055h0 = c19055h02;
                                        list = list4;
                                        obj3 = null;
                                        if (!it2.hasNext()) {
                                            it = it3;
                                            i13 = 2;
                                            if (it.hasNext()) {
                                                contactProfile = (ContactProfile) it.next();
                                                C26675a c26675a = f126213a;
                                                String mo2478b2 = contactProfile.mo2478b();
                                                AbstractC19074t.m100207e(mo2478b2, "getUid(...)");
                                                bVar.f126228s = list;
                                                bVar.f126229t = c19055h0;
                                                bVar.f126230u = arrayList;
                                                bVar.f126231v = it;
                                                bVar.f126232w = contactProfile;
                                                bVar.f126233x = obj3;
                                                bVar.f126234y = obj3;
                                                bVar.f126227B = i13;
                                                Object m136915z = c26675a.m136915z(mo2478b2, bVar);
                                                if (m136915z == m142578e) {
                                                    return m142578e;
                                                }
                                                List list8 = (List) m136915z;
                                                C26676b.m136960j("SMLZCloudAuditor", "auditCloudQueue(): listValidMsg.size=" + list8.size());
                                                c19055h0.f94931p = c19055h0.f94931p + list8.size();
                                                m131195U = AbstractC25332a0.m131195U(list8, 50);
                                                Iterator it7 = it;
                                                it2 = m131195U.iterator();
                                                it3 = it7;
                                                if (!it2.hasNext()) {
                                                }
                                            } else {
                                                return new a(list.size(), c19055h0.f94931p, arrayList);
                                            }
                                        }
                                    }
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                contactProfile = (ContactProfile) bVar.f126232w;
                                Iterator it8 = (Iterator) bVar.f126231v;
                                arrayList = (ArrayList) bVar.f126230u;
                                c19055h0 = (C19055h0) bVar.f126229t;
                                list = (List) bVar.f126228s;
                                AbstractC24862s.m129228b(obj2);
                                List list9 = (List) obj2;
                                C26676b.m136960j("SMLZCloudAuditor", "auditCloudQueue(): listValidMsg.size=" + list9.size());
                                c19055h0.f94931p = c19055h0.f94931p + list9.size();
                                m131195U2 = AbstractC25332a0.m131195U(list9, 50);
                                it2 = m131195U2.iterator();
                                it3 = it8;
                                if (!it2.hasNext()) {
                                }
                            }
                        } else {
                            AbstractC24862s.m129228b(obj2);
                        }
                    } else {
                        AbstractC24862s.m129228b(obj2);
                        bVar.f126227B = 1;
                        obj2 = m136914y(bVar);
                        if (obj2 == m142578e) {
                            return m142578e;
                        }
                    }
                    List list10 = (List) obj2;
                    C19055h0 c19055h03 = new C19055h0();
                    list = list10;
                    c19055h0 = c19055h03;
                    arrayList = new ArrayList();
                    it = list10.iterator();
                    if (it.hasNext()) {
                    }
                }
            }
            if (i11 == 0) {
            }
            List list102 = (List) obj2;
            C19055h0 c19055h032 = new C19055h0();
            list = list102;
            c19055h0 = c19055h032;
            arrayList = new ArrayList();
            it = list102.iterator();
            if (it.hasNext()) {
            }
        } catch (Exception e11) {
            C26676b.m136954d("SMLZCloudAuditor", e11);
            return null;
        }
        bVar = new b(continuation);
        Object obj22 = bVar.f126235z;
        m142578e = AbstractC28298d.m142578e();
        i11 = bVar.f126227B;
        int i132 = 2;
        Object obj32 = null;
    }

    /* renamed from: l */
    private final JSONObject m136903l(C17945a0 c17945a0) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("threadId", AbstractC25495a.m132089n(c17945a0.mo95039W2()));
        jSONObject.put("destType", AbstractC3536d.m17980b(c17945a0));
        jSONObject.put("msgId", c17945a0.m95029V3().m41044h());
        jSONObject.put("senderId", c17945a0.m95029V3().m41050n());
        jSONObject.put("msgType", AbstractC20071b.Companion.m104325e(c17945a0.m95041W4()));
        return jSONObject;
    }

    /* renamed from: m */
    public final Object m136904m(Stack stack, InterfaceC18505l interfaceC18505l, Continuation continuation) {
        Object m142578e;
        if (stack.isEmpty()) {
            Object mo205i9 = interfaceC18505l.mo205i9(continuation);
            m142578e = AbstractC28298d.m142578e();
            if (mo205i9 == m142578e) {
                return mo205i9;
            }
            return C24848g0.f119245a;
        }
        try {
            BuildersKt__Builders_commonKt.m112540d(C17933b.f90533a.m94579d(), null, null, new d((C25821b) stack.pop(), stack, interfaceC18505l, null), 3, null);
        } catch (Exception e11) {
            C26676b.m136954d("SMLZCloudAuditor", e11);
        }
        return C24848g0.f119245a;
    }

    /* renamed from: p */
    public final AuditorConfig m136905p() {
        return (AuditorConfig) f126221i.getValue();
    }

    /* renamed from: q */
    public final C16805b m136906q() {
        return (C16805b) f126218f.getValue();
    }

    /* renamed from: r */
    private final C25268c m136907r() {
        return (C25268c) f126216d.getValue();
    }

    /* renamed from: s */
    public final C23870a m136908s() {
        return (C23870a) f126217e.getValue();
    }

    /* renamed from: t */
    private final C31831a m136909t() {
        return (C31831a) f126219g.getValue();
    }

    /* renamed from: u */
    private final long m136910u() {
        return AbstractC0924m0.m3798f2();
    }

    /* renamed from: v */
    private final C0876j m136911v() {
        return (C0876j) f126220h.getValue();
    }

    /* renamed from: w */
    private final C0860a m136912w() {
        return (C0860a) f126215c.getValue();
    }

    /* renamed from: x */
    private final InterfaceC23792b m136913x() {
        return (InterfaceC23792b) f126214b.getValue();
    }

    /* renamed from: y */
    private final Object m136914y(Continuation continuation) {
        C19669z.b bVar = C19669z.Companion;
        bVar.m103232a().m103229t0();
        List m103199P = bVar.m103232a().m103199P();
        ArrayList arrayList = new ArrayList();
        for (Object obj : m103199P) {
            C31831a m136909t = f126213a.m136909t();
            String mo2478b = ((ContactProfile) obj).mo2478b();
            AbstractC19074t.m100207e(mo2478b, "getUid(...)");
            if (m136909t.m152935p(mo2478b)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* renamed from: z */
    private final Object m136915z(String str, Continuation continuation) {
        List m131502j;
        try {
            ArrayList arrayList = new ArrayList();
            int ceil = (int) Math.ceil(((float) m136911v().m2633p(str)) / ZMediaPlayerSettings.VideoConfig.MIN_PACKET_SIZE);
            boolean z11 = true;
            int i11 = 0;
            for (int i12 = 0; z11 && i12 < ceil; i12++) {
                List m41524Q = C7956b.Companion.m41573b().m41524Q(str, i11, ZMediaPlayerSettings.VideoConfig.MIN_PACKET_SIZE, m136909t().m152932j());
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : m41524Q) {
                    if (f126213a.m136909t().m152936s((C17945a0) obj)) {
                        arrayList2.add(obj);
                    }
                }
                arrayList.addAll(arrayList2);
                int size = m41524Q.size();
                if (size == 0) {
                    break;
                }
                i11 += size;
                if (size >= 500) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            }
            return arrayList;
        } catch (Exception e11) {
            C26676b.m136954d("SMLZCloudAuditor", e11);
            m131502j = AbstractC25368s.m131502j();
            return m131502j;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:1|(2:3|(8:5|6|7|(1:(1:(3:11|12|13)(2:15|16))(2:17|18))(3:22|23|(1:25)(1:26))|19|(1:21)|12|13))|29|6|7|(0)(0)|19|(0)|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x002c, code lost:            r5 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005e, code lost:            tg0.C26676b.m136954d("SMLZCloudAuditor", r5);     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* renamed from: F */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m136916F(Context context, Continuation continuation) {
        n nVar;
        Object m142578e;
        int i11;
        C26675a c26675a;
        if (continuation instanceof n) {
            nVar = (n) continuation;
            int i12 = nVar.f126277v;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                nVar.f126277v = i12 - Integer.MIN_VALUE;
                Object obj = nVar.f126275t;
                m142578e = AbstractC28298d.m142578e();
                i11 = nVar.f126277v;
                if (i11 == 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            AbstractC24862s.m129228b(obj);
                            return C24848g0.f119245a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c26675a = (C26675a) nVar.f126274s;
                    AbstractC24862s.m129228b(obj);
                } else {
                    AbstractC24862s.m129228b(obj);
                    m136885C("Start zCloud Quality Auditor");
                    nVar.f126274s = this;
                    nVar.f126277v = 1;
                    if (m136922P(nVar) == m142578e) {
                        return m142578e;
                    }
                    c26675a = this;
                }
                nVar.f126274s = null;
                nVar.f126277v = 2;
                if (c26675a.m136923Q(nVar) == m142578e) {
                    return m142578e;
                }
                return C24848g0.f119245a;
            }
        }
        nVar = new n(continuation);
        Object obj2 = nVar.f126275t;
        m142578e = AbstractC28298d.m142578e();
        i11 = nVar.f126277v;
        if (i11 == 0) {
        }
        nVar.f126274s = null;
        nVar.f126277v = 2;
        if (c26675a.m136923Q(nVar) == m142578e) {
        }
        return C24848g0.f119245a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|24|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0029, code lost:            r5 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004a, code lost:            tg0.C26676b.m136954d("SMLZCloudAuditor", r5);        r5 = false;     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* renamed from: G */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m136917G(Continuation continuation) {
        o oVar;
        Object m142578e;
        int i11;
        if (continuation instanceof o) {
            oVar = (o) continuation;
            int i12 = oVar.f126280u;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                oVar.f126280u = i12 - Integer.MIN_VALUE;
                Object obj = oVar.f126278s;
                m142578e = AbstractC28298d.m142578e();
                i11 = oVar.f126280u;
                if (i11 == 0) {
                    if (i11 == 1) {
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    C23870a m136908s = m136908s();
                    oVar.f126280u = 1;
                    obj = m136908s.m124835u1(oVar);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                }
                boolean z11 = ((Boolean) obj).booleanValue();
                return AbstractC29094b.m145339a(z11);
            }
        }
        oVar = new o(continuation);
        Object obj2 = oVar.f126278s;
        m142578e = AbstractC28298d.m142578e();
        i11 = oVar.f126280u;
        if (i11 == 0) {
        }
        boolean z112 = ((Boolean) obj2).booleanValue();
        return AbstractC29094b.m145339a(z112);
    }

    /* renamed from: J */
    public final void m136918J(int i11, int i12, String str, JSONObject jSONObject, long j11, long j12) {
        try {
            m136919K(i11, i12, str, jSONObject, j11, j12, j12 - j11);
        } catch (Exception e11) {
            C26676b.m136954d("SMLZCloudAuditor", e11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001b A[Catch: Exception -> 0x000a, TryCatch #0 {Exception -> 0x000a, blocks: (B:19:0x0003, B:4:0x000e, B:6:0x001b, B:7:0x0020, B:9:0x003a), top: B:18:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003a A[Catch: Exception -> 0x000a, TRY_LEAVE, TryCatch #0 {Exception -> 0x000a, blocks: (B:19:0x0003, B:4:0x000e, B:6:0x001b, B:7:0x0020, B:9:0x003a), top: B:18:0x0003 }] */
    /* renamed from: K */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m136919K(int i11, int i12, String str, JSONObject jSONObject, long j11, long j12, long j13) {
        String jSONObject2;
        if (jSONObject != null) {
            try {
                jSONObject2 = jSONObject.toString();
                if (jSONObject2 == null) {
                }
                JSONObject jSONObject3 = new JSONObject(jSONObject2);
                jSONObject3.put("error_code", i12);
                if (str != null) {
                    jSONObject3.put("error_msg", str);
                }
                AbstractC20887g.m109243u(i11, jSONObject3.toString(), j11, j12, j13);
                if (!f126222j.contains(Integer.valueOf(i11))) {
                    m136908s().m124838v1(i11, jSONObject3);
                    return;
                }
                return;
            } catch (Exception e11) {
                C26676b.m136954d("SMLZCloudAuditor", e11);
                return;
            }
        }
        jSONObject2 = "{}";
        JSONObject jSONObject32 = new JSONObject(jSONObject2);
        jSONObject32.put("error_code", i12);
        if (str != null) {
        }
        AbstractC20887g.m109243u(i11, jSONObject32.toString(), j11, j12, j13);
        if (!f126222j.contains(Integer.valueOf(i11))) {
        }
    }

    /* renamed from: M */
    public final void m136920M(int i11, String str, long j11, long j12) {
        try {
            m136921N(i11, str, j11, j12, j12 - j11);
        } catch (Exception e11) {
            C26676b.m136954d("SMLZCloudAuditor", e11);
        }
    }

    /* renamed from: N */
    public final void m136921N(int i11, String str, long j11, long j12, long j13) {
        try {
            AbstractC20887g.m109216C(i11, str, j11, j12, j13);
        } catch (Exception e11) {
            C26676b.m136954d("SMLZCloudAuditor", e11);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(6:5|6|7|(1:(1:(1:(1:(5:13|14|15|16|17)(2:19|20))(8:21|22|23|24|(2:26|(1:28))|15|16|17))(16:29|30|31|(4:34|(3:54|55|(3:57|58|59)(1:60))(3:36|37|(5:43|44|(1:46)(1:53)|47|(3:49|50|51)(1:52))(3:39|40|41))|42|32)|61|62|(2:65|63)|66|67|(2:70|68)|71|72|(2:75|73)|76|77|(2:79|(1:81)(7:82|23|24|(0)|15|16|17))(6:83|24|(0)|15|16|17)))(2:84|85))(3:94|95|(1:97)(1:98))|86|(2:88|89)(2:90|(1:92)(15:93|31|(1:32)|61|62|(1:63)|66|67|(1:68)|71|72|(1:73)|76|77|(0)(0)))))|101|6|7|(0)(0)|86|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x026c, code lost:            tg0.C26676b.m136954d("SMLZCloudAuditor", r0);     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x003f, code lost:            r0 = move-exception;     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0254 A[Catch: Exception -> 0x003f, TryCatch #0 {Exception -> 0x003f, blocks: (B:14:0x003a, B:15:0x0266, B:22:0x005a, B:24:0x0246, B:26:0x0254, B:30:0x0067, B:31:0x00fb, B:32:0x0116, B:34:0x011c, B:58:0x0133, B:37:0x0137, B:44:0x0140, B:46:0x0146, B:47:0x014f, B:50:0x0155, B:53:0x014b, B:40:0x0159, B:62:0x015d, B:63:0x0175, B:65:0x017b, B:67:0x0189, B:68:0x01b4, B:70:0x01ba, B:72:0x01c8, B:73:0x01f3, B:75:0x01f9, B:77:0x0207, B:79:0x022b, B:85:0x0070, B:86:0x0088, B:88:0x008c, B:90:0x0094, B:95:0x007c), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x011c A[Catch: Exception -> 0x003f, TryCatch #0 {Exception -> 0x003f, blocks: (B:14:0x003a, B:15:0x0266, B:22:0x005a, B:24:0x0246, B:26:0x0254, B:30:0x0067, B:31:0x00fb, B:32:0x0116, B:34:0x011c, B:58:0x0133, B:37:0x0137, B:44:0x0140, B:46:0x0146, B:47:0x014f, B:50:0x0155, B:53:0x014b, B:40:0x0159, B:62:0x015d, B:63:0x0175, B:65:0x017b, B:67:0x0189, B:68:0x01b4, B:70:0x01ba, B:72:0x01c8, B:73:0x01f3, B:75:0x01f9, B:77:0x0207, B:79:0x022b, B:85:0x0070, B:86:0x0088, B:88:0x008c, B:90:0x0094, B:95:0x007c), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x017b A[Catch: Exception -> 0x003f, LOOP:1: B:63:0x0175->B:65:0x017b, LOOP_END, TryCatch #0 {Exception -> 0x003f, blocks: (B:14:0x003a, B:15:0x0266, B:22:0x005a, B:24:0x0246, B:26:0x0254, B:30:0x0067, B:31:0x00fb, B:32:0x0116, B:34:0x011c, B:58:0x0133, B:37:0x0137, B:44:0x0140, B:46:0x0146, B:47:0x014f, B:50:0x0155, B:53:0x014b, B:40:0x0159, B:62:0x015d, B:63:0x0175, B:65:0x017b, B:67:0x0189, B:68:0x01b4, B:70:0x01ba, B:72:0x01c8, B:73:0x01f3, B:75:0x01f9, B:77:0x0207, B:79:0x022b, B:85:0x0070, B:86:0x0088, B:88:0x008c, B:90:0x0094, B:95:0x007c), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01ba A[Catch: Exception -> 0x003f, LOOP:2: B:68:0x01b4->B:70:0x01ba, LOOP_END, TryCatch #0 {Exception -> 0x003f, blocks: (B:14:0x003a, B:15:0x0266, B:22:0x005a, B:24:0x0246, B:26:0x0254, B:30:0x0067, B:31:0x00fb, B:32:0x0116, B:34:0x011c, B:58:0x0133, B:37:0x0137, B:44:0x0140, B:46:0x0146, B:47:0x014f, B:50:0x0155, B:53:0x014b, B:40:0x0159, B:62:0x015d, B:63:0x0175, B:65:0x017b, B:67:0x0189, B:68:0x01b4, B:70:0x01ba, B:72:0x01c8, B:73:0x01f3, B:75:0x01f9, B:77:0x0207, B:79:0x022b, B:85:0x0070, B:86:0x0088, B:88:0x008c, B:90:0x0094, B:95:0x007c), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01f9 A[Catch: Exception -> 0x003f, LOOP:3: B:73:0x01f3->B:75:0x01f9, LOOP_END, TryCatch #0 {Exception -> 0x003f, blocks: (B:14:0x003a, B:15:0x0266, B:22:0x005a, B:24:0x0246, B:26:0x0254, B:30:0x0067, B:31:0x00fb, B:32:0x0116, B:34:0x011c, B:58:0x0133, B:37:0x0137, B:44:0x0140, B:46:0x0146, B:47:0x014f, B:50:0x0155, B:53:0x014b, B:40:0x0159, B:62:0x015d, B:63:0x0175, B:65:0x017b, B:67:0x0189, B:68:0x01b4, B:70:0x01ba, B:72:0x01c8, B:73:0x01f3, B:75:0x01f9, B:77:0x0207, B:79:0x022b, B:85:0x0070, B:86:0x0088, B:88:0x008c, B:90:0x0094, B:95:0x007c), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x022b A[Catch: Exception -> 0x003f, TryCatch #0 {Exception -> 0x003f, blocks: (B:14:0x003a, B:15:0x0266, B:22:0x005a, B:24:0x0246, B:26:0x0254, B:30:0x0067, B:31:0x00fb, B:32:0x0116, B:34:0x011c, B:58:0x0133, B:37:0x0137, B:44:0x0140, B:46:0x0146, B:47:0x014f, B:50:0x0155, B:53:0x014b, B:40:0x0159, B:62:0x015d, B:63:0x0175, B:65:0x017b, B:67:0x0189, B:68:0x01b4, B:70:0x01ba, B:72:0x01c8, B:73:0x01f3, B:75:0x01f9, B:77:0x0207, B:79:0x022b, B:85:0x0070, B:86:0x0088, B:88:0x008c, B:90:0x0094, B:95:0x007c), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x008c A[Catch: Exception -> 0x003f, TryCatch #0 {Exception -> 0x003f, blocks: (B:14:0x003a, B:15:0x0266, B:22:0x005a, B:24:0x0246, B:26:0x0254, B:30:0x0067, B:31:0x00fb, B:32:0x0116, B:34:0x011c, B:58:0x0133, B:37:0x0137, B:44:0x0140, B:46:0x0146, B:47:0x014f, B:50:0x0155, B:53:0x014b, B:40:0x0159, B:62:0x015d, B:63:0x0175, B:65:0x017b, B:67:0x0189, B:68:0x01b4, B:70:0x01ba, B:72:0x01c8, B:73:0x01f3, B:75:0x01f9, B:77:0x0207, B:79:0x022b, B:85:0x0070, B:86:0x0088, B:88:0x008c, B:90:0x0094, B:95:0x007c), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0094 A[Catch: Exception -> 0x003f, TryCatch #0 {Exception -> 0x003f, blocks: (B:14:0x003a, B:15:0x0266, B:22:0x005a, B:24:0x0246, B:26:0x0254, B:30:0x0067, B:31:0x00fb, B:32:0x0116, B:34:0x011c, B:58:0x0133, B:37:0x0137, B:44:0x0140, B:46:0x0146, B:47:0x014f, B:50:0x0155, B:53:0x014b, B:40:0x0159, B:62:0x015d, B:63:0x0175, B:65:0x017b, B:67:0x0189, B:68:0x01b4, B:70:0x01ba, B:72:0x01c8, B:73:0x01f3, B:75:0x01f9, B:77:0x0207, B:79:0x022b, B:85:0x0070, B:86:0x0088, B:88:0x008c, B:90:0x0094, B:95:0x007c), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /* renamed from: P */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m136922P(Continuation continuation) {
        t tVar;
        Object m142578e;
        int i11;
        C26675a c26675a;
        a aVar;
        List<C17945a0> list;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int m131511r;
        Iterator it;
        int m131511r2;
        Iterator it2;
        int m131511r3;
        Iterator it3;
        C26675a c26675a2;
        C26675a c26675a3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        String m94983Q3;
        if (continuation instanceof t) {
            tVar = (t) continuation;
            int i12 = tVar.f126302y;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                tVar.f126302y = i12 - Integer.MIN_VALUE;
                Object obj = tVar.f126300w;
                m142578e = AbstractC28298d.m142578e();
                i11 = tVar.f126302y;
                if (i11 == 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 != 3) {
                                if (i11 == 4) {
                                    c26675a2 = (C26675a) tVar.f126296s;
                                    AbstractC24862s.m129228b(obj);
                                    c26675a2.m136885C("Audit Cloud Queue: COMPLETED");
                                    return C24848g0.f119245a;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            arrayList5 = (ArrayList) tVar.f126299v;
                            arrayList4 = (ArrayList) tVar.f126298u;
                            arrayList6 = (ArrayList) tVar.f126297t;
                            c26675a3 = (C26675a) tVar.f126296s;
                            AbstractC24862s.m129228b(obj);
                            arrayList3 = arrayList5;
                            arrayList2 = arrayList4;
                            arrayList = arrayList6;
                            c26675a2 = c26675a3;
                            if (c26675a2.m136905p().m89743a().m89754b()) {
                                tVar.f126296s = c26675a2;
                                tVar.f126297t = null;
                                tVar.f126298u = null;
                                tVar.f126299v = null;
                                tVar.f126302y = 4;
                                if (c26675a2.m136886D(arrayList, arrayList2, arrayList3, tVar) == m142578e) {
                                    return m142578e;
                                }
                            }
                            c26675a2.m136885C("Audit Cloud Queue: COMPLETED");
                            return C24848g0.f119245a;
                        }
                        list = (List) tVar.f126297t;
                        c26675a = (C26675a) tVar.f126296s;
                        AbstractC24862s.m129228b(obj);
                        long longValue = ((Number) obj).longValue();
                        arrayList = new ArrayList();
                        arrayList2 = new ArrayList();
                        arrayList3 = new ArrayList();
                        for (C17945a0 c17945a0 : list) {
                            long m94974P4 = c17945a0.m94974P4();
                            if (m94974P4 >= longValue) {
                                if (m94974P4 >= 1701190800000L) {
                                    arrayList3.add(c17945a0);
                                }
                            } else if (longValue - m94974P4 >= 1209600000) {
                                if (c17945a0.m95306y8()) {
                                    m94983Q3 = c17945a0.m95177k5();
                                } else {
                                    m94983Q3 = c17945a0.m94983Q3();
                                }
                                if (AbstractC23041d2.m118194A(m94983Q3)) {
                                    arrayList.add(c17945a0);
                                }
                            } else {
                                arrayList2.add(c17945a0);
                            }
                        }
                        c26675a.m136885C("Audit Cloud Queue: Filter missing item(s) into error category");
                        int size = arrayList.size();
                        m131511r = AbstractC25370t.m131511r(arrayList, 10);
                        ArrayList arrayList7 = new ArrayList(m131511r);
                        it = arrayList.iterator();
                        while (it.hasNext()) {
                            arrayList7.add(((C17945a0) it.next()).m95029V3());
                        }
                        c26675a.m136885C("> ERROR_MIGRATION_LOCAL_ITEM: " + size + " item(s). List=" + arrayList7);
                        int size2 = arrayList2.size();
                        m131511r2 = AbstractC25370t.m131511r(arrayList2, 10);
                        ArrayList arrayList8 = new ArrayList(m131511r2);
                        it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            arrayList8.add(((C17945a0) it2.next()).m95029V3());
                        }
                        c26675a.m136885C("> ERROR_MIGRATION_SERVER_ITEM: " + size2 + " item(s). List=" + arrayList8);
                        int size3 = arrayList3.size();
                        m131511r3 = AbstractC25370t.m131511r(arrayList3, 10);
                        ArrayList arrayList9 = new ArrayList(m131511r3);
                        it3 = arrayList3.iterator();
                        while (it3.hasNext()) {
                            arrayList9.add(((C17945a0) it3.next()).m95029V3());
                        }
                        c26675a.m136885C("> ERROR_NEW_ITEM: " + size3 + " item(s). List=" + arrayList9);
                        if (!c26675a.m136905p().m89750h()) {
                            tVar.f126296s = c26675a;
                            tVar.f126297t = arrayList;
                            tVar.f126298u = arrayList2;
                            tVar.f126299v = arrayList3;
                            tVar.f126302y = 3;
                            if (c26675a.m136888H(arrayList, arrayList2, arrayList3, tVar) == m142578e) {
                                return m142578e;
                            }
                            c26675a3 = c26675a;
                            arrayList4 = arrayList2;
                            arrayList5 = arrayList3;
                            arrayList6 = arrayList;
                            arrayList3 = arrayList5;
                            arrayList2 = arrayList4;
                            arrayList = arrayList6;
                            c26675a2 = c26675a3;
                            if (c26675a2.m136905p().m89743a().m89754b()) {
                            }
                            c26675a2.m136885C("Audit Cloud Queue: COMPLETED");
                            return C24848g0.f119245a;
                        }
                        c26675a2 = c26675a;
                        if (c26675a2.m136905p().m89743a().m89754b()) {
                        }
                        c26675a2.m136885C("Audit Cloud Queue: COMPLETED");
                        return C24848g0.f119245a;
                    }
                    c26675a = (C26675a) tVar.f126296s;
                    AbstractC24862s.m129228b(obj);
                } else {
                    AbstractC24862s.m129228b(obj);
                    m136885C("Audit Cloud Queue: START");
                    tVar.f126296s = this;
                    tVar.f126302y = 1;
                    obj = m136902k(tVar);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                    c26675a = this;
                }
                aVar = (a) obj;
                if (aVar != null) {
                    c26675a.m136885C("Audit Cloud Queue: ERROR!");
                    return C24848g0.f119245a;
                }
                List m136926a = aVar.m136926a();
                c26675a.m136885C("Audit Cloud Queue: " + aVar.m136928c() + " valid cloud conversation(s)");
                c26675a.m136885C("Audit Cloud Queue: " + aVar.m136927b() + " potential cloud msg(s)");
                c26675a.m136885C("Audit Cloud Queue: " + m136926a.size() + " missing item(s)");
                C25268c m136907r = c26675a.m136907r();
                tVar.f126296s = c26675a;
                tVar.f126297t = m136926a;
                tVar.f126302y = 2;
                obj = m136907r.m130769w(tVar);
                if (obj == m142578e) {
                    return m142578e;
                }
                list = m136926a;
                long longValue2 = ((Number) obj).longValue();
                arrayList = new ArrayList();
                arrayList2 = new ArrayList();
                arrayList3 = new ArrayList();
                while (r3.hasNext()) {
                }
                c26675a.m136885C("Audit Cloud Queue: Filter missing item(s) into error category");
                int size4 = arrayList.size();
                m131511r = AbstractC25370t.m131511r(arrayList, 10);
                ArrayList arrayList72 = new ArrayList(m131511r);
                it = arrayList.iterator();
                while (it.hasNext()) {
                }
                c26675a.m136885C("> ERROR_MIGRATION_LOCAL_ITEM: " + size4 + " item(s). List=" + arrayList72);
                int size22 = arrayList2.size();
                m131511r2 = AbstractC25370t.m131511r(arrayList2, 10);
                ArrayList arrayList82 = new ArrayList(m131511r2);
                it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                }
                c26675a.m136885C("> ERROR_MIGRATION_SERVER_ITEM: " + size22 + " item(s). List=" + arrayList82);
                int size32 = arrayList3.size();
                m131511r3 = AbstractC25370t.m131511r(arrayList3, 10);
                ArrayList arrayList92 = new ArrayList(m131511r3);
                it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                }
                c26675a.m136885C("> ERROR_NEW_ITEM: " + size32 + " item(s). List=" + arrayList92);
                if (!c26675a.m136905p().m89750h()) {
                }
            }
        }
        tVar = new t(continuation);
        Object obj2 = tVar.f126300w;
        m142578e = AbstractC28298d.m142578e();
        i11 = tVar.f126302y;
        if (i11 == 0) {
        }
        aVar = (a) obj2;
        if (aVar != null) {
        }
    }

    /* renamed from: Q */
    public final Object m136923Q(Continuation continuation) {
        Object m142578e;
        Object m112534g = BuildersKt.m112534g(Dispatchers.m112680b(), new u(null), continuation);
        m142578e = AbstractC28298d.m142578e();
        if (m112534g == m142578e) {
            return m112534g;
        }
        return C24848g0.f119245a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(6:5|6|7|(1:(1:(3:11|12|13)(2:15|16))(2:17|18))(3:26|27|(1:29)(1:30))|19|(2:21|22)(4:23|(1:25)|12|13)))|33|6|7|(0)(0)|19|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x002c, code lost:            r6 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006c, code lost:            tg0.C26676b.m136954d("SMLZCloudAuditor", r6);     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005b A[Catch: Exception -> 0x002c, TryCatch #0 {Exception -> 0x002c, blocks: (B:11:0x0028, B:18:0x003e, B:19:0x0053, B:21:0x005b, B:23:0x005e, B:27:0x0045), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005e A[Catch: Exception -> 0x002c, TRY_LEAVE, TryCatch #0 {Exception -> 0x002c, blocks: (B:11:0x0028, B:18:0x003e, B:19:0x0053, B:21:0x005b, B:23:0x005e, B:27:0x0045), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m136924n(Context context, Continuation continuation) {
        e eVar;
        Object obj;
        Object m142578e;
        int i11;
        C26675a c26675a;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i12 = eVar.f126254w;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                eVar.f126254w = i12 - Integer.MIN_VALUE;
                obj = eVar.f126252u;
                m142578e = AbstractC28298d.m142578e();
                i11 = eVar.f126254w;
                if (i11 == 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            AbstractC24862s.m129228b(obj);
                            return C24848g0.f119245a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    context = (Context) eVar.f126251t;
                    c26675a = (C26675a) eVar.f126250s;
                    AbstractC24862s.m129228b(obj);
                } else {
                    AbstractC24862s.m129228b(obj);
                    eVar.f126250s = this;
                    eVar.f126251t = context;
                    eVar.f126254w = 1;
                    obj = m136884B(context, eVar);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                    c26675a = this;
                }
                if (((Boolean) obj).booleanValue()) {
                    return C24848g0.f119245a;
                }
                eVar.f126250s = null;
                eVar.f126251t = null;
                eVar.f126254w = 2;
                if (c26675a.m136916F(context, eVar) == m142578e) {
                    return m142578e;
                }
                return C24848g0.f119245a;
            }
        }
        eVar = new e(continuation);
        obj = eVar.f126252u;
        m142578e = AbstractC28298d.m142578e();
        i11 = eVar.f126254w;
        if (i11 == 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    /* renamed from: o */
    public final void m136925o() {
        String m127130z;
        String m127130z2;
        m127130z = AbstractC24341v.m127130z("─", 33);
        long m136910u = m136910u();
        m127130z2 = AbstractC24341v.m127130z("─", 50);
        AbstractC20110a.f98889a.m104564x("SMLZCloudAuditor").mo104556o(8, m127130z + "\nLast Time: " + m136910u + "\n" + m127130z2, new Object[0]);
    }
}
