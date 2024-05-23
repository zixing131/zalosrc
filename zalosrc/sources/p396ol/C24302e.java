package p396ol;

import ch0.AbstractC3489d;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.p062db.C7959d;
import com.zing.zalo.zalocloud.utils.AbstractC16893a;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import dh0.C17933b;
import dj.C17945a0;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import gw.AbstractC19646n0;
import java.io.File;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import mm0.AbstractC23352g;
import nl.C23870a;
import p128ed.C18390e;
import p206hd.C19999c;
import p206hd.InterfaceC20001e;
import p263jc.C21216s;
import p348mi.AbstractC23306f;
import p396ol.InterfaceC24301d;
import p487rl.C25821b;
import p613wl.C29086b;
import pm.C24832c;
import pm0.AbstractC24856m;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import qm0.AbstractC25368s;
import qm0.AbstractC25378x;
import tg0.C26676b;
import vi.C28255a;
import vi0.C28264b;
import vi0.EnumC28265c;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: ol.e */
/* loaded from: classes3.dex */
public final class C24302e {
    public static final b Companion = new b(null);

    /* renamed from: f */
    private static final InterfaceC24854k f117339f;

    /* renamed from: a */
    private final C23870a f117340a;

    /* renamed from: b */
    private final C24299b f117341b;

    /* renamed from: c */
    private final C19999c f117342c;

    /* renamed from: d */
    private final EnumMap f117343d;

    /* renamed from: e */
    private final HashMap f117344e;

    /* renamed from: ol.e$a */
    /* loaded from: classes3.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f117345q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C24302e mo12V4() {
            return c.f117346a.m126924a();
        }
    }

    /* renamed from: ol.e$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: h */
        public final C25821b m126912h(C17945a0 c17945a0) {
            if (!AbstractC3489d.m17509q()) {
                return null;
            }
            MessageId m95029V3 = c17945a0.m95029V3();
            AbstractC19074t.m100207e(m95029V3, "getMessageId(...)");
            return C29086b.m145321g(m95029V3);
        }

        /* renamed from: i */
        public final C28255a m126913i(C17945a0 c17945a0) {
            String m122788d = AbstractC23352g.m122788d(c17945a0.m95090b5());
            C7959d m41850e = C7959d.Companion.m41850e();
            AbstractC19074t.m100205c(m122788d);
            C28255a m41760X0 = m41850e.m41760X0(m122788d, c17945a0.mo95039W2(), c17945a0.m94862C4(), c17945a0.m95029V3().m41044h());
            if (AbstractC19646n0.m102999l1() && c17945a0.m94871D7()) {
                return m41760X0;
            }
            return null;
        }

        /* renamed from: c */
        public final boolean m126914c(C17945a0 c17945a0) {
            AbstractC19074t.m100208f(c17945a0, "message");
            if (m126913i(c17945a0) == null && m126912h(c17945a0) == null) {
                return false;
            }
            return true;
        }

        /* renamed from: d */
        public final boolean m126915d(int i11, long j11) {
            if (m126916e(i11) && m126922m() && !AbstractC19646n0.m103038v1(1, j11)) {
                return true;
            }
            return false;
        }

        /* renamed from: e */
        public final boolean m126916e(int i11) {
            return i11 == 1004;
        }

        /* renamed from: f */
        public final File m126917f(C17945a0 c17945a0) {
            EnumC28265c enumC28265c;
            AbstractC19074t.m100208f(c17945a0, "message");
            if (!c17945a0.m94871D7() && !c17945a0.m95120e6()) {
                if (c17945a0.m95306y8()) {
                    enumC28265c = EnumC28265c.f131806v;
                } else if (c17945a0.m95276v6()) {
                    enumC28265c = EnumC28265c.f131807w;
                } else if (c17945a0.m95316z8()) {
                    enumC28265c = EnumC28265c.f131808x;
                } else {
                    enumC28265c = EnumC28265c.f131805u;
                }
            } else {
                enumC28265c = EnumC28265c.f131805u;
            }
            return new File(C28264b.Companion.m142373a().m142367c(enumC28265c), AbstractC23352g.m122788d(c17945a0.m95029V3().toString()));
        }

        /* renamed from: g */
        public final File m126918g(C25821b c25821b) {
            EnumC28265c enumC28265c;
            AbstractC19074t.m100208f(c25821b, "cloudItem");
            if (!AbstractC16893a.m90330g(c25821b) && !AbstractC16893a.m90327d(c25821b)) {
                if (AbstractC16893a.m90331h(c25821b)) {
                    enumC28265c = EnumC28265c.f131806v;
                } else if (AbstractC16893a.m90328e(c25821b)) {
                    enumC28265c = EnumC28265c.f131807w;
                } else if (AbstractC16893a.m90332i(c25821b)) {
                    enumC28265c = EnumC28265c.f131808x;
                } else {
                    enumC28265c = EnumC28265c.f131805u;
                }
            } else {
                enumC28265c = EnumC28265c.f131805u;
            }
            return new File(C28264b.Companion.m142373a().m142367c(enumC28265c), AbstractC23352g.m122788d(c25821b.m133146i().toString()));
        }

        /* renamed from: j */
        public final C24302e m126919j() {
            return (C24302e) C24302e.f117339f.getValue();
        }

        /* renamed from: k */
        public final File m126920k(String str) {
            AbstractC19074t.m100208f(str, "msgId");
            return new File(C28264b.Companion.m142373a().m142367c(EnumC28265c.f131805u), AbstractC23352g.m122788d(str));
        }

        /* renamed from: l */
        public final File m126921l(C25821b c25821b) {
            AbstractC19074t.m100208f(c25821b, "cloudItem");
            return new File(C28264b.Companion.m142373a().m142367c(EnumC28265c.f131810z), AbstractC23352g.m122788d(c25821b.m133146i().toString()));
        }

        /* renamed from: m */
        public final boolean m126922m() {
            if (!AbstractC3489d.m17509q() || !AbstractC23306f.m120633X1().m89806u()) {
                return true;
            }
            return AbstractC23306f.m120679j2().m124786P0();
        }

        /* renamed from: n */
        public final boolean m126923n() {
            if (AbstractC23306f.m120633X1().m89807v() && AbstractC23306f.m120691m2().m2461l()) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: ol.e$c */
    /* loaded from: classes3.dex */
    public static final class c {

        /* renamed from: a */
        public static final c f117346a = new c();

        /* renamed from: b */
        private static final C24302e f117347b;

        static {
            C23870a m120679j2 = AbstractC23306f.m120679j2();
            AbstractC19074t.m100207e(m120679j2, "provideZaloCloudRepo(...)");
            f117347b = new C24302e(m120679j2, C24299b.Companion.m126870a(), C19999c.Companion.m103786a());
        }

        private c() {
        }

        /* renamed from: a */
        public final C24302e m126924a() {
            return f117347b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ol.e$d */
    /* loaded from: classes3.dex */
    public static final class d extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f117348t;

        /* renamed from: v */
        final /* synthetic */ EnumC24298a f117350v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(EnumC24298a enumC24298a, Continuation continuation) {
            super(2, continuation);
            this.f117350v = enumC24298a;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new d(this.f117350v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            List m131502j;
            AbstractC28298d.m142578e();
            if (this.f117348t == 0) {
                AbstractC24862s.m129228b(obj);
                EnumMap enumMap = C24302e.this.f117343d;
                C24302e c24302e = C24302e.this;
                EnumC24298a enumC24298a = this.f117350v;
                synchronized (enumMap) {
                    try {
                        List<C25821b> list = (List) c24302e.f117343d.get(enumC24298a);
                        if (list != null) {
                            AbstractC19074t.m100205c(list);
                            for (C25821b c25821b : list) {
                                List list2 = (List) c24302e.f117343d.get(EnumC24298a.f117300s);
                                Object obj2 = null;
                                if (list2 != null) {
                                    AbstractC19074t.m100205c(list2);
                                    Iterator it = list2.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            break;
                                        }
                                        Object next = it.next();
                                        if (AbstractC19074t.m100204b(((C25821b) next).m133141d(), c25821b.m133141d())) {
                                            obj2 = next;
                                            break;
                                        }
                                    }
                                    obj2 = (C25821b) obj2;
                                }
                                if (obj2 == null) {
                                    c24302e.f117341b.m126867l(c25821b.m133141d());
                                    c24302e.f117344e.remove(c25821b.m133146i().m41044h());
                                }
                            }
                        }
                        EnumMap enumMap2 = c24302e.f117343d;
                        m131502j = AbstractC25368s.m131502j();
                        enumMap2.put((EnumMap) enumC24298a, (EnumC24298a) m131502j);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
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

    /* renamed from: ol.e$e */
    /* loaded from: classes3.dex */
    public static final class e extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f117351t;

        /* renamed from: v */
        final /* synthetic */ MessageId f117353v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(MessageId messageId, Continuation continuation) {
            super(2, continuation);
            this.f117353v = messageId;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new e(this.f117353v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f117351t == 0) {
                AbstractC24862s.m129228b(obj);
                String str = (String) C24302e.this.f117344e.get(this.f117353v.m41044h());
                if (str == null) {
                    return C24848g0.f119245a;
                }
                C24302e.this.f117341b.m126867l(str);
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((e) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: ol.e$f */
    /* loaded from: classes3.dex */
    public static final class f implements InterfaceC20001e {

        /* renamed from: a */
        final /* synthetic */ InterfaceC24301d f117354a;

        /* renamed from: b */
        final /* synthetic */ C17945a0 f117355b;

        /* renamed from: c */
        final /* synthetic */ C24302e f117356c;

        f(InterfaceC24301d interfaceC24301d, C17945a0 c17945a0, C24302e c24302e) {
            this.f117354a = interfaceC24301d;
            this.f117355b = c17945a0;
            this.f117356c = c24302e;
        }

        @Override // p206hd.InterfaceC20001e
        /* renamed from: a */
        public void mo98994a(String str, long j11) {
            AbstractC19074t.m100208f(str, "downloadId");
            this.f117354a.mo66919a(str, j11);
        }

        @Override // p206hd.InterfaceC20001e
        /* renamed from: b */
        public boolean mo98995b() {
            return this.f117354a.mo66920b();
        }

        @Override // p206hd.InterfaceC20001e
        /* renamed from: c */
        public void mo98996c(int i11, String str) {
            AbstractC19074t.m100208f(str, "errorMsg");
            C26676b.m136952b("SMLZCloudDownloader", "downloadSingleMediaByDrive: message = " + this.f117355b + ", errorCode = " + i11 + ", errorMsg = " + str);
            this.f117354a.mo66922d("", this.f117356c.m126892k(i11), str);
        }

        @Override // p206hd.InterfaceC20001e
        /* renamed from: d */
        public void mo98997d(String str) {
            AbstractC19074t.m100208f(str, "path");
            C26676b.m136952b("SMLZCloudDownloader", "downloadSingleMediaByDrive: message = " + this.f117355b + ", path = " + str);
            this.f117354a.mo66923e("", str);
        }
    }

    /* renamed from: ol.e$g */
    /* loaded from: classes3.dex */
    public static final class g implements InterfaceC24301d {

        /* renamed from: a */
        final /* synthetic */ j f117357a;

        /* renamed from: b */
        final /* synthetic */ C24302e f117358b;

        /* renamed from: c */
        final /* synthetic */ C17945a0 f117359c;

        /* renamed from: ol.e$g$a */
        /* loaded from: classes3.dex */
        public static final class a implements InterfaceC24301d {

            /* renamed from: a */
            final /* synthetic */ j f117360a;

            /* renamed from: b */
            final /* synthetic */ int f117361b;

            /* renamed from: c */
            final /* synthetic */ String f117362c;

            a(j jVar, int i11, String str) {
                this.f117360a = jVar;
                this.f117361b = i11;
                this.f117362c = str;
            }

            @Override // p396ol.InterfaceC24301d
            /* renamed from: a */
            public void mo66919a(String str, long j11) {
                AbstractC19074t.m100208f(str, "downloadId");
                this.f117360a.mo66919a(str, j11);
            }

            @Override // p396ol.InterfaceC24301d
            /* renamed from: b */
            public boolean mo66920b() {
                return this.f117360a.mo66920b();
            }

            @Override // p396ol.InterfaceC24301d
            /* renamed from: c */
            public EnumC24298a mo66921c() {
                return this.f117360a.mo66921c();
            }

            @Override // p396ol.InterfaceC24301d
            /* renamed from: d */
            public void mo66922d(String str, int i11, String str2) {
                AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
                AbstractC19074t.m100208f(str2, "errorMessage");
                this.f117360a.mo66922d(str, this.f117361b, this.f117362c);
            }

            @Override // p396ol.InterfaceC24301d
            /* renamed from: e */
            public void mo66923e(String str, String str2) {
                AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
                AbstractC19074t.m100208f(str2, "path");
                this.f117360a.mo66923e(str, str2);
            }

            @Override // p396ol.InterfaceC24301d
            /* renamed from: h */
            public int mo66924h() {
                return this.f117360a.mo66924h();
            }
        }

        g(j jVar, C24302e c24302e, C17945a0 c17945a0) {
            this.f117357a = jVar;
            this.f117358b = c24302e;
            this.f117359c = c17945a0;
        }

        @Override // p396ol.InterfaceC24301d
        /* renamed from: a */
        public void mo66919a(String str, long j11) {
            AbstractC19074t.m100208f(str, "downloadId");
            this.f117357a.mo66919a(str, j11);
        }

        @Override // p396ol.InterfaceC24301d
        /* renamed from: b */
        public boolean mo66920b() {
            return this.f117357a.mo66920b();
        }

        @Override // p396ol.InterfaceC24301d
        /* renamed from: c */
        public EnumC24298a mo66921c() {
            return this.f117357a.mo66921c();
        }

        @Override // p396ol.InterfaceC24301d
        /* renamed from: d */
        public void mo66922d(String str, int i11, String str2) {
            AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
            AbstractC19074t.m100208f(str2, "zCloudErrorMessage");
            if (C24832c.m129123c()) {
                this.f117357a.mo66922d(str, i11, str2);
            } else {
                this.f117358b.m126904m(this.f117359c, new a(this.f117357a, i11, str2));
            }
        }

        @Override // p396ol.InterfaceC24301d
        /* renamed from: e */
        public void mo66923e(String str, String str2) {
            AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
            AbstractC19074t.m100208f(str2, "path");
            this.f117357a.mo66923e(str, str2);
        }

        @Override // p396ol.InterfaceC24301d
        /* renamed from: h */
        public int mo66924h() {
            return this.f117357a.mo66924h();
        }
    }

    /* renamed from: ol.e$h */
    /* loaded from: classes3.dex */
    public static final class h implements InterfaceC24301d {

        /* renamed from: a */
        final /* synthetic */ InterfaceC24301d f117363a;

        h(InterfaceC24301d interfaceC24301d) {
            this.f117363a = interfaceC24301d;
        }

        @Override // p396ol.InterfaceC24301d
        /* renamed from: a */
        public void mo66919a(String str, long j11) {
            AbstractC19074t.m100208f(str, "downloadId");
            this.f117363a.mo66919a(str, j11);
        }

        @Override // p396ol.InterfaceC24301d
        /* renamed from: b */
        public boolean mo66920b() {
            return this.f117363a.mo66920b();
        }

        @Override // p396ol.InterfaceC24301d
        /* renamed from: c */
        public EnumC24298a mo66921c() {
            return this.f117363a.mo66921c();
        }

        @Override // p396ol.InterfaceC24301d
        /* renamed from: d */
        public void mo66922d(String str, int i11, String str2) {
            AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
            AbstractC19074t.m100208f(str2, "errorMessage");
            this.f117363a.mo66922d(str, 1005, str2);
        }

        @Override // p396ol.InterfaceC24301d
        /* renamed from: e */
        public void mo66923e(String str, String str2) {
            AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
            AbstractC19074t.m100208f(str2, "path");
            this.f117363a.mo66923e(str, str2);
        }

        @Override // p396ol.InterfaceC24301d
        /* renamed from: h */
        public int mo66924h() {
            return this.f117363a.mo66924h();
        }
    }

    /* renamed from: ol.e$i */
    /* loaded from: classes3.dex */
    public static final class i extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f117364t;

        /* renamed from: v */
        final /* synthetic */ C25821b f117366v;

        /* renamed from: w */
        final /* synthetic */ String f117367w;

        /* renamed from: x */
        final /* synthetic */ k f117368x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(C25821b c25821b, String str, k kVar, Continuation continuation) {
            super(2, continuation);
            this.f117366v = c25821b;
            this.f117367w = str;
            this.f117368x = kVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new i(this.f117366v, this.f117367w, this.f117368x, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f117364t == 0) {
                AbstractC24862s.m129228b(obj);
                C24302e.this.f117341b.m126868y(this.f117366v, this.f117367w, this.f117368x);
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((i) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: ol.e$j */
    /* loaded from: classes3.dex */
    public static final class j implements InterfaceC24301d {

        /* renamed from: a */
        final /* synthetic */ InterfaceC24301d f117369a;

        /* renamed from: b */
        final /* synthetic */ C17945a0 f117370b;

        j(InterfaceC24301d interfaceC24301d, C17945a0 c17945a0) {
            this.f117369a = interfaceC24301d;
            this.f117370b = c17945a0;
        }

        @Override // p396ol.InterfaceC24301d
        /* renamed from: a */
        public void mo66919a(String str, long j11) {
            AbstractC19074t.m100208f(str, "downloadId");
            this.f117369a.mo66919a(str, j11);
        }

        @Override // p396ol.InterfaceC24301d
        /* renamed from: b */
        public boolean mo66920b() {
            return this.f117369a.mo66920b();
        }

        @Override // p396ol.InterfaceC24301d
        /* renamed from: c */
        public EnumC24298a mo66921c() {
            return this.f117369a.mo66921c();
        }

        @Override // p396ol.InterfaceC24301d
        /* renamed from: d */
        public void mo66922d(String str, int i11, String str2) {
            AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
            AbstractC19074t.m100208f(str2, "errorMessage");
            if (i11 == 1004) {
                if (C24302e.Companion.m126915d(i11, this.f117370b.m94974P4())) {
                    this.f117369a.mo66922d(str, 1004, str2);
                    return;
                } else {
                    this.f117369a.mo66922d(str, 1005, str2);
                    return;
                }
            }
            this.f117369a.mo66922d(str, 1005, str2);
        }

        @Override // p396ol.InterfaceC24301d
        /* renamed from: e */
        public void mo66923e(String str, String str2) {
            AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
            AbstractC19074t.m100208f(str2, "path");
            this.f117369a.mo66923e(str, str2);
        }

        @Override // p396ol.InterfaceC24301d
        /* renamed from: h */
        public int mo66924h() {
            return this.f117369a.mo66924h();
        }
    }

    /* renamed from: ol.e$k */
    /* loaded from: classes3.dex */
    public static final class k implements InterfaceC24301d {

        /* renamed from: a */
        final /* synthetic */ InterfaceC24301d f117371a;

        /* renamed from: b */
        final /* synthetic */ C24302e f117372b;

        /* renamed from: c */
        final /* synthetic */ C25821b f117373c;

        k(InterfaceC24301d interfaceC24301d, C24302e c24302e, C25821b c25821b) {
            this.f117371a = interfaceC24301d;
            this.f117372b = c24302e;
            this.f117373c = c25821b;
        }

        @Override // p396ol.InterfaceC24301d
        /* renamed from: a */
        public void mo66919a(String str, long j11) {
            AbstractC19074t.m100208f(str, "downloadId");
            this.f117371a.mo66919a(str, j11);
        }

        @Override // p396ol.InterfaceC24301d
        /* renamed from: b */
        public boolean mo66920b() {
            return this.f117371a.mo66920b();
        }

        @Override // p396ol.InterfaceC24301d
        /* renamed from: c */
        public EnumC24298a mo66921c() {
            return this.f117371a.mo66921c();
        }

        @Override // p396ol.InterfaceC24301d
        /* renamed from: d */
        public void mo66922d(String str, int i11, String str2) {
            AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
            AbstractC19074t.m100208f(str2, "errorMessage");
            this.f117372b.m126900x(mo66921c(), this.f117373c.m133141d(), this.f117373c.m133146i().m41044h());
            this.f117371a.mo66922d(str, i11, str2);
        }

        @Override // p396ol.InterfaceC24301d
        /* renamed from: e */
        public void mo66923e(String str, String str2) {
            AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
            AbstractC19074t.m100208f(str2, "path");
            this.f117372b.m126900x(mo66921c(), this.f117373c.m133141d(), this.f117373c.m133146i().m41044h());
            this.f117371a.mo66923e(str, str2);
        }

        @Override // p396ol.InterfaceC24301d
        /* renamed from: h */
        public int mo66924h() {
            return InterfaceC24301d.a.m126884a(this);
        }
    }

    /* renamed from: ol.e$l */
    /* loaded from: classes3.dex */
    public static final class l extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ String f117374q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(String str) {
            super(1);
            this.f117374q = str;
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a */
        public final Boolean mo205i9(C25821b c25821b) {
            return Boolean.valueOf(AbstractC19074t.m100204b(c25821b.m133141d(), this.f117374q));
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(a.f117345q);
        f117339f = m129210a;
    }

    public C24302e(C23870a c23870a, C24299b c24299b, C19999c c19999c) {
        AbstractC19074t.m100208f(c23870a, "zaloCloudRepo");
        AbstractC19074t.m100208f(c24299b, "cloudDownloadAsyncController");
        AbstractC19074t.m100208f(c19999c, "driveDownloadAsyncController");
        this.f117340a = c23870a;
        this.f117341b = c24299b;
        this.f117342c = c19999c;
        this.f117343d = new EnumMap(EnumC24298a.class);
        this.f117344e = new HashMap();
    }

    /* renamed from: j */
    public static final boolean m126891j(int i11) {
        return Companion.m126916e(i11);
    }

    /* renamed from: k */
    public final int m126892k(int i11) {
        if (i11 != 104) {
            if (i11 == 105) {
                return 101;
            }
            if (i11 != 107) {
                return 1005;
            }
        }
        return 1004;
    }

    /* renamed from: l */
    private final void m126893l(C17945a0 c17945a0, C28255a c28255a, InterfaceC24301d interfaceC24301d) {
        String m97406j;
        f fVar = new f(interfaceC24301d, c17945a0, this);
        if (interfaceC24301d.mo66920b()) {
            m97406j = Companion.m126917f(c17945a0).getPath();
        } else {
            m97406j = C18390e.m97406j(c17945a0);
        }
        String str = m97406j;
        C26676b.m136952b("SMLZCloudDownloader", "downloadSingleMediaByDrive: message = " + c17945a0 + " - pathOut = " + str);
        C19999c c19999c = this.f117342c;
        C21216s m120652d = AbstractC23306f.m120652d();
        AbstractC19074t.m100207e(m120652d, "provideAutoDownloadMsgResourcesController(...)");
        AbstractC19074t.m100205c(str);
        c19999c.m103783t(c17945a0, c28255a, fVar, m120652d, str);
    }

    /* renamed from: r */
    public static final File m126894r(C25821b c25821b) {
        return Companion.m126918g(c25821b);
    }

    /* renamed from: s */
    public static final C24302e m126895s() {
        return Companion.m126919j();
    }

    /* renamed from: t */
    public static final File m126896t(String str) {
        return Companion.m126920k(str);
    }

    /* renamed from: u */
    public static final boolean m126897u() {
        return Companion.m126922m();
    }

    /* renamed from: v */
    public static final boolean m126898v() {
        return Companion.m126923n();
    }

    /* renamed from: w */
    private final void m126899w(EnumC24298a enumC24298a, C25821b c25821b) {
        synchronized (this.f117343d) {
            try {
                EnumMap enumMap = this.f117343d;
                List list = (List) this.f117343d.get(enumC24298a);
                if (list == null) {
                    list = AbstractC25368s.m131502j();
                }
                ArrayList arrayList = new ArrayList(list);
                arrayList.add(c25821b);
                enumMap.put((EnumMap) enumC24298a, (EnumC24298a) arrayList);
                this.f117344e.put(c25821b.m133146i().m41044h(), c25821b.m133141d());
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: x */
    public final void m126900x(EnumC24298a enumC24298a, String str, String str2) {
        synchronized (this.f117343d) {
            try {
                EnumMap enumMap = this.f117343d;
                List list = (List) this.f117343d.get(enumC24298a);
                if (list == null) {
                    list = AbstractC25368s.m131502j();
                }
                ArrayList arrayList = new ArrayList(list);
                AbstractC25378x.m131542D(arrayList, new l(str));
                enumMap.put((EnumMap) enumC24298a, (EnumC24298a) arrayList);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: g */
    public final void m126901g(String str, String str2, MessageId messageId, String str3) {
        AbstractC19074t.m100208f(str, "ownerId");
        AbstractC19074t.m100208f(str2, "senderId");
        AbstractC19074t.m100208f(messageId, "messageId");
        this.f117342c.m103782f(str, str2, messageId);
        if (str3 != null) {
            this.f117341b.m126867l(str3);
        }
    }

    /* renamed from: h */
    public final void m126902h(EnumC24298a enumC24298a) {
        AbstractC19074t.m100208f(enumC24298a, "feature");
        BuildersKt__Builders_commonKt.m112540d(C17933b.f90533a.m94579d(), null, null, new d(enumC24298a, null), 3, null);
    }

    /* renamed from: i */
    public final void m126903i(String str, String str2, MessageId messageId) {
        AbstractC19074t.m100208f(str, "ownerId");
        AbstractC19074t.m100208f(str2, "senderId");
        AbstractC19074t.m100208f(messageId, "messageId");
        this.f117342c.m103782f(str, str2, messageId);
        if (Companion.m126923n()) {
            BuildersKt__Builders_commonKt.m112540d(C17933b.f90533a.m94579d(), null, null, new e(messageId, null), 3, null);
        }
    }

    /* renamed from: m */
    public final void m126904m(C17945a0 c17945a0, InterfaceC24301d interfaceC24301d) {
        AbstractC19074t.m100208f(c17945a0, "message");
        AbstractC19074t.m100208f(interfaceC24301d, "listener");
        C28255a m126913i = Companion.m126913i(c17945a0);
        if (m126913i == null) {
            interfaceC24301d.mo66922d("", 1004, "File not found on cloud");
            return;
        }
        C26676b.m136952b("SMLZCloudDownloader", "downloadSingleMediaOnCloud: drive - message = " + c17945a0);
        m126893l(c17945a0, m126913i, interfaceC24301d);
    }

    /* renamed from: n */
    public final void m126905n(C17945a0 c17945a0, String str, InterfaceC24301d interfaceC24301d) {
        AbstractC19074t.m100208f(c17945a0, "message");
        AbstractC19074t.m100208f(str, "pathOut");
        AbstractC19074t.m100208f(interfaceC24301d, "listener");
        C26676b.m136952b("SMLZCloudDownloader", "downloadSingleMediaOnCloud: message = " + c17945a0);
        b bVar = Companion;
        C25821b m126912h = bVar.m126912h(c17945a0);
        j jVar = new j(interfaceC24301d, c17945a0);
        if (m126912h == null) {
            C28255a m126913i = bVar.m126913i(c17945a0);
            if (m126913i == null) {
                m126913i = null;
            }
            C28255a c28255a = m126913i;
            if (m126913i != null) {
                C26676b.m136952b("SMLZCloudDownloader", "downloadSingleMediaOnCloud: drive - message = " + c17945a0);
                AbstractC19074t.m100205c(c28255a);
                m126893l(c17945a0, c28255a, jVar);
                return;
            }
            C26676b.m136952b("SMLZCloudDownloader", "downloadSingleMediaOnCloud: fileNotFound - message = " + c17945a0);
            if (bVar.m126915d(1004, c17945a0.m94974P4())) {
                interfaceC24301d.mo66922d("", 1004, "File not found on cloud");
                return;
            } else {
                interfaceC24301d.mo66922d("", 1005, "File not found but can retry later");
                return;
            }
        }
        C26676b.m136952b("SMLZCloudDownloader", "downloadSingleMediaOnCloud: zCloud - message = " + c17945a0);
        m126907p(m126912h, str, new g(jVar, this, c17945a0));
    }

    /* renamed from: o */
    public final void m126906o(C17945a0 c17945a0, InterfaceC24301d interfaceC24301d) {
        String m95088b3;
        AbstractC19074t.m100208f(c17945a0, "message");
        AbstractC19074t.m100208f(interfaceC24301d, "listener");
        if (interfaceC24301d.mo66920b()) {
            m95088b3 = Companion.m126917f(c17945a0).getPath();
        } else {
            m95088b3 = c17945a0.m95088b3(Boolean.TRUE);
        }
        AbstractC19074t.m100205c(m95088b3);
        m126905n(c17945a0, m95088b3, interfaceC24301d);
    }

    /* renamed from: p */
    public final void m126907p(C25821b c25821b, String str, InterfaceC24301d interfaceC24301d) {
        AbstractC19074t.m100208f(c25821b, "cloudItem");
        AbstractC19074t.m100208f(str, "pathOut");
        AbstractC19074t.m100208f(interfaceC24301d, "listener");
        C26676b.m136952b("SMLZCloudDownloader", "downloadSingleMediaOnCloud: zCloud - cloudItem = " + c25821b + " - pathOut = " + str);
        k kVar = new k(interfaceC24301d, this, c25821b);
        m126899w(interfaceC24301d.mo66921c(), c25821b);
        BuildersKt__Builders_commonKt.m112540d(C17933b.f90533a.m94579d(), null, null, new i(c25821b, str, kVar, null), 3, null);
    }

    /* renamed from: q */
    public final void m126908q(C25821b c25821b, InterfaceC24301d interfaceC24301d) {
        AbstractC19074t.m100208f(c25821b, "cloudItem");
        AbstractC19074t.m100208f(interfaceC24301d, "listener");
        String path = Companion.m126918g(c25821b).getPath();
        AbstractC19074t.m100205c(path);
        m126907p(c25821b, path, new h(interfaceC24301d));
    }
}
