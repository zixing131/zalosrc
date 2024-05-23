package com.zing.zalo.zalocloud.recover;

import am.C0943w;
import androidx.work.AbstractC2147g0;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.zalocloud.utils.AbstractC16893a;
import com.zing.zalo.zalocloud.utils.MediaExtInfo;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalocore.CoreUtility;
import dj.C17945a0;
import dj.C17961f1;
import dj.C17964g1;
import dj.C17969i0;
import dj.C17981m0;
import dj.C17990p0;
import dj.C18009w0;
import eg0.AbstractC18428c;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19069o0;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19059j0;
import gw.AbstractC19646n0;
import ho0.AbstractC20110a;
import java.io.File;
import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Stack;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import k30.C21459a;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.YieldKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import ln0.AbstractC22543l;
import ln0.C22537f;
import me0.AbstractC23078g6;
import me0.AbstractC23238v2;
import mg.C23288a;
import mm0.AbstractC23350e;
import nl.C23870a;
import on0.AbstractC24341v;
import org.json.JSONObject;
import p019aj.C0876j;
import p164fn.C19028b;
import p185gc.AbstractC19378b;
import p185gc.AbstractC19379c;
import p348mi.AbstractC23306f;
import p396ol.C24302e;
import p396ol.EnumC24298a;
import p396ol.InterfaceC24301d;
import p461qu.AbstractC25495a;
import p487rl.C25821b;
import p559uv.C27373c;
import p613wl.C29086b;
import p716zh.C31897e4;
import pm0.AbstractC24856m;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.C24861r;
import pm0.InterfaceC24854k;
import qm0.AbstractC25351j0;
import qm0.AbstractC25370t;
import tg0.C26676b;
import um0.C27317h;
import vm0.AbstractC28297c;
import vm0.AbstractC28298d;
import wm0.AbstractC29094b;
import wm0.AbstractC29096d;
import wm0.AbstractC29100h;
import wm0.AbstractC29104l;
import xd0.C29593i;

/* renamed from: com.zing.zalo.zalocloud.recover.d */
/* loaded from: classes7.dex */
public final class C16891d extends AbstractC19379c {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final C23870a f85940a;

    /* renamed from: b */
    private final C0876j f85941b;

    /* renamed from: c */
    private final C16888a f85942c;

    /* renamed from: d */
    private final InterfaceC24854k f85943d;

    /* renamed from: e */
    private ArrayList f85944e;

    /* renamed from: f */
    private ConcurrentHashMap f85945f;

    /* renamed from: g */
    private final MutableStateFlow f85946g;

    /* renamed from: h */
    private final StateFlow f85947h;

    /* renamed from: i */
    private long f85948i;

    /* renamed from: j */
    private final AtomicInteger f85949j;

    /* renamed from: k */
    private final AtomicInteger f85950k;

    /* renamed from: l */
    private final AtomicInteger f85951l;

    /* renamed from: m */
    private final AtomicInteger f85952m;

    /* renamed from: n */
    private final AtomicInteger f85953n;

    /* renamed from: o */
    private final AtomicInteger f85954o;

    /* renamed from: p */
    private final AtomicInteger f85955p;

    /* renamed from: q */
    private int f85956q;

    /* renamed from: r */
    private AtomicBoolean f85957r;

    /* renamed from: s */
    private final Object f85958s;

    /* renamed from: com.zing.zalo.zalocloud.recover.d$a */
    /* loaded from: classes7.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.zalocloud.recover.d$b */
    /* loaded from: classes7.dex */
    public static final class b {

        /* renamed from: a */
        private final float f85959a;

        /* renamed from: b */
        private final int f85960b;

        /* renamed from: c */
        private final int f85961c;

        /* renamed from: d */
        private final long f85962d;

        public b(float f11, int i11, int i12, long j11) {
            this.f85959a = f11;
            this.f85960b = i11;
            this.f85961c = i12;
            this.f85962d = j11;
        }

        /* renamed from: a */
        public final float m90294a() {
            return this.f85959a;
        }

        /* renamed from: b */
        public final long m90295b() {
            return this.f85962d;
        }

        /* renamed from: c */
        public final int m90296c() {
            return this.f85961c;
        }

        /* renamed from: d */
        public final int m90297d() {
            return this.f85960b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Float.compare(this.f85959a, bVar.f85959a) == 0 && this.f85960b == bVar.f85960b && this.f85961c == bVar.f85961c && this.f85962d == bVar.f85962d;
        }

        public int hashCode() {
            return (((((Float.floatToIntBits(this.f85959a) * 31) + this.f85960b) * 31) + this.f85961c) * 31) + AbstractC2147g0.m11521a(this.f85962d);
        }

        public String toString() {
            return "ProgressData(currentProgress=" + this.f85959a + ", totalItems=" + this.f85960b + ", remainItems=" + this.f85961c + ", remainDownloadSize=" + this.f85962d + ")";
        }

        public /* synthetic */ b(float f11, int i11, int i12, long j11, int i13, AbstractC19060k abstractC19060k) {
            this((i13 & 1) != 0 ? 0.0f : f11, (i13 & 2) != 0 ? 0 : i11, (i13 & 4) == 0 ? i12 : 0, (i13 & 8) != 0 ? 0L : j11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zalocloud.recover.d$c */
    /* loaded from: classes7.dex */
    public static final class c extends AbstractC29096d {

        /* renamed from: s */
        Object f85963s;

        /* renamed from: t */
        Object f85964t;

        /* renamed from: u */
        Object f85965u;

        /* renamed from: v */
        Object f85966v;

        /* renamed from: w */
        /* synthetic */ Object f85967w;

        /* renamed from: y */
        int f85969y;

        c(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f85967w = obj;
            this.f85969y |= Integer.MIN_VALUE;
            return C16891d.this.m90284s(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zalocloud.recover.d$d */
    /* loaded from: classes7.dex */
    public static final class d extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f85970t;

        /* renamed from: v */
        final /* synthetic */ C19059j0 f85972v;

        /* renamed from: w */
        final /* synthetic */ C25821b f85973w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(C19059j0 c19059j0, C25821b c25821b, Continuation continuation) {
            super(2, continuation);
            this.f85972v = c19059j0;
            this.f85973w = c25821b;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new d(this.f85972v, this.f85973w, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f85970t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C16891d c16891d = C16891d.this;
                C17945a0 c17945a0 = (C17945a0) this.f85972v.f94941p;
                C25821b c25821b = this.f85973w;
                this.f85970t = 1;
                obj = c16891d.m90267D(c17945a0, c25821b, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            return obj;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zalocloud.recover.d$e */
    /* loaded from: classes7.dex */
    public static final class e extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        Object f85974t;

        /* renamed from: u */
        Object f85975u;

        /* renamed from: v */
        int f85976v;

        /* renamed from: w */
        final /* synthetic */ C17945a0 f85977w;

        /* renamed from: x */
        final /* synthetic */ C16891d f85978x;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.zalocloud.recover.d$e$a */
        /* loaded from: classes7.dex */
        public static final class a implements Runnable {

            /* renamed from: p */
            final /* synthetic */ C17945a0 f85979p;

            /* renamed from: q */
            final /* synthetic */ C16891d f85980q;

            /* renamed from: r */
            final /* synthetic */ Continuation f85981r;

            a(C17945a0 c17945a0, C16891d c16891d, Continuation continuation) {
                this.f85979p = c17945a0;
                this.f85980q = c16891d;
                this.f85981r = continuation;
            }

            @Override // java.lang.Runnable
            public final void run() {
                try {
                    C26676b.m136957g("SMLZCloudRecoverCloudMedia", "insertMsgToDb(): Rebuild msg " + this.f85979p.m95029V3() + " of type " + this.f85979p.m95041W4(), null, 4, null);
                    C29593i m90288w = this.f85980q.m90288w();
                    AbstractC19074t.m100207e(m90288w, "access$getInsertMsgUseCase(...)");
                    AbstractC19378b.m101499c(m90288w, new C29593i.a(this.f85979p.m95029V3().m41048l(), this.f85979p, null, null, false, 28, null), null, 2, null);
                    Continuation continuation = this.f85981r;
                    C24861r.a aVar = C24861r.f119264q;
                    continuation.mo112492g(C24861r.m129218b(Boolean.TRUE));
                } catch (Exception e11) {
                    C26676b.m136954d("SMLZCloudRecoverCloudMedia", e11);
                    Continuation continuation2 = this.f85981r;
                    C24861r.a aVar2 = C24861r.f119264q;
                    continuation2.mo112492g(C24861r.m129218b(Boolean.FALSE));
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(C17945a0 c17945a0, C16891d c16891d, Continuation continuation) {
            super(2, continuation);
            this.f85977w = c17945a0;
            this.f85978x = c16891d;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new e(this.f85977w, this.f85978x, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            Continuation m142576c;
            Object m142578e2;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f85976v;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C17945a0 c17945a0 = this.f85977w;
                C16891d c16891d = this.f85978x;
                this.f85974t = c17945a0;
                this.f85975u = c16891d;
                this.f85976v = 1;
                m142576c = AbstractC28297c.m142576c(this);
                C27317h c27317h = new C27317h(m142576c);
                AbstractC18428c.m97658a(C23288a.f113033a, c17945a0.m95029V3().m41048l(), 5, new a(c17945a0, c16891d, c27317h));
                obj = c27317h.m139856a();
                m142578e2 = AbstractC28298d.m142578e();
                if (obj == m142578e2) {
                    AbstractC29100h.m145355c(this);
                }
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            return obj;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((e) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.zalocloud.recover.d$f */
    /* loaded from: classes7.dex */
    static final class f extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final f f85982q = new f();

        f() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C29593i mo12V4() {
            return AbstractC23306f.m120681k0();
        }
    }

    /* renamed from: com.zing.zalo.zalocloud.recover.d$g */
    /* loaded from: classes7.dex */
    static final class g extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f85983t;

        g(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new g(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f85983t;
            try {
                if (i11 != 0) {
                    if (i11 == 1) {
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    C16891d c16891d = C16891d.this;
                    this.f85983t = 1;
                    if (c16891d.m90268E(this) == m142578e) {
                        return m142578e;
                    }
                }
                C16891d.this.m90265B();
                C16891d.this.f85940a.m124772I();
                C16891d.this.m90285t();
                return AbstractC29094b.m145339a(true);
            } catch (Exception e11) {
                AbstractC23350e.m122776f("SMLZCloudRecoverCloudMedia", e11);
                return AbstractC29094b.m145339a(false);
            }
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((g) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zalocloud.recover.d$h */
    /* loaded from: classes7.dex */
    public static final class h extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        Object f85985t;

        /* renamed from: u */
        Object f85986u;

        /* renamed from: v */
        Object f85987v;

        /* renamed from: w */
        int f85988w;

        /* renamed from: x */
        final /* synthetic */ C17945a0 f85989x;

        /* renamed from: y */
        final /* synthetic */ C25821b f85990y;

        /* renamed from: z */
        final /* synthetic */ C16891d f85991z;

        /* renamed from: com.zing.zalo.zalocloud.recover.d$h$a */
        /* loaded from: classes7.dex */
        public static final class a implements C17945a0.x {

            /* renamed from: p */
            final /* synthetic */ C17945a0 f85992p;

            /* renamed from: q */
            final /* synthetic */ CancellableContinuation f85993q;

            /* renamed from: r */
            final /* synthetic */ C16891d f85994r;

            a(C17945a0 c17945a0, CancellableContinuation cancellableContinuation, C16891d c16891d) {
                this.f85992p = c17945a0;
                this.f85993q = cancellableContinuation;
                this.f85994r = c16891d;
            }

            @Override // dj.C17945a0.x
            /* renamed from: G */
            public void mo61268G(int i11, MessageId messageId) {
            }

            @Override // dj.C17945a0.x
            /* renamed from: H */
            public void mo61269H(MessageId messageId, boolean z11) {
                C26676b.m136960j("SMLZCloudRecoverCloudMedia", "onDownloadFailed(): " + this.f85992p);
                CancellableContinuation cancellableContinuation = this.f85993q;
                C24861r.a aVar = C24861r.f119264q;
                cancellableContinuation.mo112492g(C24861r.m129218b(Boolean.FALSE));
                AbstractC19069o0.m100187d(this.f85994r.f85945f).remove(messageId);
            }

            @Override // dj.C17945a0.x
            /* renamed from: m */
            public void mo61273m(int i11, MessageId messageId) {
            }

            @Override // dj.C17945a0.x
            /* renamed from: s */
            public void mo61274s(MessageId messageId, String str, boolean z11) {
                C26676b.m136960j("SMLZCloudRecoverCloudMedia", "onDownloadSuccess(): " + this.f85992p);
                if (str != null && str.length() != 0) {
                    this.f85992p.m94934Ka(str);
                    CancellableContinuation cancellableContinuation = this.f85993q;
                    C24861r.a aVar = C24861r.f119264q;
                    cancellableContinuation.mo112492g(C24861r.m129218b(Boolean.TRUE));
                } else {
                    CancellableContinuation cancellableContinuation2 = this.f85993q;
                    C24861r.a aVar2 = C24861r.f119264q;
                    cancellableContinuation2.mo112492g(C24861r.m129218b(Boolean.FALSE));
                }
                AbstractC19069o0.m100187d(this.f85994r.f85945f).remove(messageId);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.zalocloud.recover.d$h$b */
        /* loaded from: classes7.dex */
        public static final class b extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            final /* synthetic */ C17945a0 f85995q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(C17945a0 c17945a0) {
                super(1);
                this.f85995q = c17945a0;
            }

            /* renamed from: a */
            public final void m90303a(Throwable th2) {
                this.f85995q.m95068Z0();
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: i9 */
            public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                m90303a((Throwable) obj);
                return C24848g0.f119245a;
            }
        }

        /* renamed from: com.zing.zalo.zalocloud.recover.d$h$c */
        /* loaded from: classes7.dex */
        public static final class c implements InterfaceC24301d {

            /* renamed from: a */
            final /* synthetic */ C17945a0 f85996a;

            /* renamed from: b */
            final /* synthetic */ C25821b f85997b;

            /* renamed from: c */
            final /* synthetic */ C16891d f85998c;

            /* renamed from: d */
            final /* synthetic */ CancellableContinuation f85999d;

            c(C17945a0 c17945a0, C25821b c25821b, C16891d c16891d, CancellableContinuation cancellableContinuation) {
                this.f85996a = c17945a0;
                this.f85997b = c25821b;
                this.f85998c = c16891d;
                this.f85999d = cancellableContinuation;
            }

            @Override // p396ol.InterfaceC24301d
            /* renamed from: a */
            public void mo66919a(String str, long j11) {
                AbstractC19074t.m100208f(str, "downloadId");
            }

            @Override // p396ol.InterfaceC24301d
            /* renamed from: b */
            public boolean mo66920b() {
                return false;
            }

            @Override // p396ol.InterfaceC24301d
            /* renamed from: c */
            public EnumC24298a mo66921c() {
                return EnumC24298a.f117300s;
            }

            @Override // p396ol.InterfaceC24301d
            /* renamed from: d */
            public void mo66922d(String str, int i11, String str2) {
                AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
                AbstractC19074t.m100208f(str2, "errorMessage");
                C26676b.m136960j("SMLZCloudRecoverCloudMedia", "onDownloadFailed(): " + this.f85996a);
                CancellableContinuation cancellableContinuation = this.f85999d;
                C24861r.a aVar = C24861r.f119264q;
                cancellableContinuation.mo112492g(C24861r.m129218b(Boolean.FALSE));
            }

            @Override // p396ol.InterfaceC24301d
            /* renamed from: e */
            public void mo66923e(String str, String str2) {
                AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
                AbstractC19074t.m100208f(str2, "path");
                C26676b.m136960j("SMLZCloudRecoverCloudMedia", "onDownloadSuccess(): " + this.f85996a);
                try {
                    if (AbstractC16893a.m90330g(this.f85997b)) {
                        this.f85998c.m90264A(this.f85996a, str2);
                    }
                    CancellableContinuation cancellableContinuation = this.f85999d;
                    C24861r.a aVar = C24861r.f119264q;
                    cancellableContinuation.mo112492g(C24861r.m129218b(Boolean.TRUE));
                } catch (Exception e11) {
                    C26676b.m136954d("SMLZCloudRecoverCloudMedia", e11);
                    CancellableContinuation cancellableContinuation2 = this.f85999d;
                    C24861r.a aVar2 = C24861r.f119264q;
                    cancellableContinuation2.mo112492g(C24861r.m129218b(Boolean.FALSE));
                }
            }

            @Override // p396ol.InterfaceC24301d
            /* renamed from: h */
            public int mo66924h() {
                return InterfaceC24301d.a.m126884a(this);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(C17945a0 c17945a0, C25821b c25821b, C16891d c16891d, Continuation continuation) {
            super(2, continuation);
            this.f85989x = c17945a0;
            this.f85990y = c25821b;
            this.f85991z = c16891d;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new h(this.f85989x, this.f85990y, this.f85991z, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            Continuation m142576c;
            Object m142578e2;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f85988w;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC24862s.m129228b(obj);
            C17945a0 c17945a0 = this.f85989x;
            C25821b c25821b = this.f85990y;
            C16891d c16891d = this.f85991z;
            this.f85985t = c17945a0;
            this.f85986u = c25821b;
            this.f85987v = c16891d;
            this.f85988w = 1;
            m142576c = AbstractC28297c.m142576c(this);
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(m142576c, 1);
            cancellableContinuationImpl.m112574F();
            Boolean m94925J7 = c17945a0.m94925J7();
            AbstractC19074t.m100207e(m94925J7, "isRebuildMsg(...)");
            if (!m94925J7.booleanValue() || c17945a0.m95306y8()) {
                ConcurrentHashMap concurrentHashMap = c16891d.f85945f;
                MessageId m95029V3 = c17945a0.m95029V3();
                AbstractC19074t.m100207e(m95029V3, "getMessageId(...)");
                concurrentHashMap.put(m95029V3, new a(c17945a0, cancellableContinuationImpl, c16891d));
                try {
                    if (!c17945a0.m94871D7() && !c17945a0.m95120e6() && !c17945a0.m95276v6() && !c17945a0.m95316z8()) {
                        if (c17945a0.m95306y8()) {
                            MessageId m95029V32 = c17945a0.m95029V3();
                            AbstractC19074t.m100207e(m95029V32, "getMessageId(...)");
                            String m145319d = C29086b.m145319d(m95029V32);
                            if (m145319d != null && m145319d.length() != 0) {
                                C26676b.m136957g("SMLZCloudRecoverCloudMedia", "startDownload(): " + c17945a0 + " of type " + c17945a0.m95041W4() + " ", null, 4, null);
                                c17945a0.m94962Nb(C19028b.a.m100098b(C19028b.Companion, C19028b.b.f94847t, false, false, 6, null), m145319d, false, false);
                            }
                            C24861r.a aVar = C24861r.f119264q;
                            cancellableContinuationImpl.mo112492g(C24861r.m129218b(AbstractC29094b.m145339a(false)));
                        } else {
                            C26676b.m136957g("SMLZCloudRecoverCloudMedia", "startDownload(): un-support msg = " + c17945a0, null, 4, null);
                            c16891d.f85945f.remove(c17945a0.m95029V3());
                            C24861r.a aVar2 = C24861r.f119264q;
                            cancellableContinuationImpl.mo112492g(C24861r.m129218b(AbstractC29094b.m145339a(true)));
                        }
                    }
                    C26676b.m136957g("SMLZCloudRecoverCloudMedia", "startDownload(): " + c17945a0 + " of type " + c17945a0.m95041W4(), null, 4, null);
                    c17945a0.m94859Bb((C17945a0.x) c16891d.f85945f.get(c17945a0.m95029V3()));
                    c17945a0.m94980Pb(C19028b.a.m100098b(C19028b.Companion, C19028b.b.f94847t, true, false, 4, null), false);
                } catch (Exception e11) {
                    AbstractC23350e.m122776f("SMLZCloudRecoverCloudMedia", e11);
                    C26676b.m136957g("SMLZCloudRecoverCloudMedia", "startDownload - exception: " + c17945a0 + " of type " + c17945a0.m95041W4() + " ", null, 4, null);
                    C24861r.a aVar3 = C24861r.f119264q;
                    cancellableContinuationImpl.mo112492g(C24861r.m129218b(AbstractC29094b.m145339a(false)));
                }
            } else {
                C26676b.m136957g("SMLZCloudRecoverCloudMedia", "startDownload() - isRebuildMsg: " + c17945a0 + " of type " + c17945a0.m95041W4(), null, 4, null);
                c cVar = new c(c17945a0, c25821b, c16891d, cancellableContinuationImpl);
                try {
                    C24302e.b bVar = C24302e.Companion;
                    File m126920k = bVar.m126920k(c17945a0.m95029V3().toString());
                    C24302e m126919j = bVar.m126919j();
                    String path = m126920k.getPath();
                    AbstractC19074t.m100207e(path, "getPath(...)");
                    m126919j.m126907p(c25821b, path, cVar);
                } catch (Exception e12) {
                    AbstractC23350e.m122776f("SMLZCloudRecoverCloudMedia", e12);
                    C26676b.m136957g("SMLZCloudRecoverCloudMedia", "startDownload - isRebuildMsg - exception: " + c17945a0 + " of type " + c17945a0.m95041W4() + " ", null, 4, null);
                    C24861r.a aVar4 = C24861r.f119264q;
                    cancellableContinuationImpl.mo112492g(C24861r.m129218b(AbstractC29094b.m145339a(false)));
                }
            }
            cancellableContinuationImpl.mo112543I(new b(c17945a0));
            Object m112571A = cancellableContinuationImpl.m112571A();
            m142578e2 = AbstractC28298d.m142578e();
            if (m112571A == m142578e2) {
                AbstractC29100h.m145355c(this);
            }
            if (m112571A == m142578e) {
                return m142578e;
            }
            return m112571A;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((h) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zalocloud.recover.d$i */
    /* loaded from: classes7.dex */
    public static final class i extends AbstractC29096d {

        /* renamed from: s */
        Object f86000s;

        /* renamed from: t */
        /* synthetic */ Object f86001t;

        /* renamed from: v */
        int f86003v;

        i(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f86001t = obj;
            this.f86003v |= Integer.MIN_VALUE;
            return C16891d.this.m90268E(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zalocloud.recover.d$j */
    /* loaded from: classes7.dex */
    public static final class j extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f86004t;

        /* renamed from: u */
        private /* synthetic */ Object f86005u;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.zalocloud.recover.d$j$a */
        /* loaded from: classes7.dex */
        public static final class a extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f86007t;

            /* renamed from: u */
            final /* synthetic */ C16891d f86008u;

            /* renamed from: v */
            final /* synthetic */ Stack f86009v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C16891d c16891d, Stack stack, Continuation continuation) {
                super(2, continuation);
                this.f86008u = c16891d;
                this.f86009v = stack;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new a(this.f86008u, this.f86009v, continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                Object m142578e;
                m142578e = AbstractC28298d.m142578e();
                int i11 = this.f86007t;
                if (i11 != 0) {
                    if (i11 == 1) {
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    C16891d c16891d = this.f86008u;
                    Stack stack = this.f86009v;
                    this.f86007t = 1;
                    if (c16891d.m90284s(stack, this) == m142578e) {
                        return m142578e;
                    }
                }
                return C24848g0.f119245a;
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        j(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            j jVar = new j(continuation);
            jVar.f86005u = obj;
            return jVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            int m116580c;
            int m131511r;
            Deferred m112538b;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f86004t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC24862s.m129228b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.f86005u;
            List m124808f0 = C16891d.this.f85940a.m124808f0();
            Stack stack = new Stack();
            stack.addAll(C16891d.this.f85940a.m124804c0());
            C16891d.this.f85951l.set(0);
            C16891d.this.f85949j.set(m124808f0.size());
            int size = stack.size();
            C16891d c16891d = C16891d.this;
            Iterator it = stack.iterator();
            long j11 = 0;
            while (it.hasNext()) {
                j11 += ((C25821b) it.next()).m133145h().m133166c();
            }
            c16891d.f85948i = j11;
            MutableStateFlow mutableStateFlow = C16891d.this.f85946g;
            m116580c = AbstractC22543l.m116580c(C16891d.this.f85949j.get(), 1);
            mutableStateFlow.mo113433d(new b(100.0f - ((size / m116580c) * 100), C16891d.this.f85949j.get(), size, C16891d.this.f85948i));
            C26676b.m136957g("SMLZCloudRecoverCloudMedia", "Total Cloud Item: " + stack.size() + " item(s)", null, 4, null);
            C22537f c22537f = new C22537f(1, 2);
            C16891d c16891d2 = C16891d.this;
            m131511r = AbstractC25370t.m131511r(c22537f, 10);
            ArrayList arrayList = new ArrayList(m131511r);
            Iterator it2 = c22537f.iterator();
            while (it2.hasNext()) {
                ((AbstractC25351j0) it2).mo116552a();
                m112538b = BuildersKt__Builders_commonKt.m112538b(coroutineScope, null, null, new a(c16891d2, stack, null), 3, null);
                ArrayList arrayList2 = c16891d2.f85944e;
                if (arrayList2 != null) {
                    AbstractC29094b.m145339a(arrayList2.add(m112538b));
                }
                arrayList.add(m112538b);
            }
            this.f86004t = 1;
            Object m112521a = AwaitKt.m112521a(arrayList, this);
            if (m112521a == m142578e) {
                return m142578e;
            }
            return m112521a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((j) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    public C16891d(C23870a c23870a, C0876j c0876j, C16888a c16888a) {
        InterfaceC24854k m129210a;
        AbstractC19074t.m100208f(c23870a, "zCloudRepo");
        AbstractC19074t.m100208f(c0876j, "messageRepo");
        AbstractC19074t.m100208f(c16888a, "zCloudGracePeriodManager");
        this.f85940a = c23870a;
        this.f85941b = c0876j;
        this.f85942c = c16888a;
        m129210a = AbstractC24856m.m129210a(f.f85982q);
        this.f85943d = m129210a;
        this.f85944e = new ArrayList();
        this.f85945f = new ConcurrentHashMap();
        MutableStateFlow m113503a = StateFlowKt.m113503a(new b(0.0f, 0, 0, 0L, 15, null));
        this.f85946g = m113503a;
        this.f85947h = FlowKt.m113284b(m113503a);
        this.f85949j = new AtomicInteger();
        this.f85950k = new AtomicInteger();
        this.f85951l = new AtomicInteger();
        this.f85952m = new AtomicInteger();
        this.f85953n = new AtomicInteger();
        this.f85954o = new AtomicInteger();
        this.f85955p = new AtomicInteger();
        this.f85957r = new AtomicBoolean(false);
        this.f85958s = new Object();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A */
    public final void m90264A(C17945a0 c17945a0, String str) {
        String str2;
        C17969i0 m94929K2 = c17945a0.m94929K2();
        AbstractC19074t.m100206d(m94929K2, "null cannot be cast to non-null type com.zing.zalo.data.chat.model.message.ChatRichContentPhoto");
        C18009w0 c18009w0 = (C18009w0) m94929K2;
        if (AbstractC23078g6.Companion.m118392g(str)) {
            str2 = "https://zcld.chat.zalo.me/cloudmedia/download/NDA0aGVoZWJvaXo.jxl";
        } else {
            str2 = "https://zcld.chat.zalo.me/cloudmedia/download/NDA0aGVoZWJvaXo.jpg";
        }
        c18009w0.f91014s = str2;
        String m95088b3 = c17945a0.m95088b3(Boolean.TRUE);
        AbstractC19074t.m100207e(m95088b3, "getDownloadPathOut(...)");
        if (AbstractC23238v2.m119718c(new File(str), new File(m95088b3))) {
            c17945a0.m94934Ka(m95088b3);
            return;
        }
        throw new Exception("Can not move image to main folder");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B */
    public final void m90265B() {
        String m127130z;
        String m127130z2;
        m127130z = AbstractC24341v.m127130z("─", 23);
        int i11 = this.f85949j.get();
        int i12 = this.f85953n.get();
        int i13 = this.f85952m.get();
        int i14 = this.f85951l.get();
        int i15 = this.f85954o.get();
        int i16 = this.f85955p.get();
        int i17 = this.f85950k.get();
        m127130z2 = AbstractC24341v.m127130z("─", 50);
        AbstractC20110a.f98889a.m104564x("SMLZCloudRecoverCloudMedia").mo104556o(8, m127130z + "\nRECOVER CLOUD ITEMS COMPLETED\nTotal item: " + i11 + "\nAlready exists: " + i12 + "\nSuccess: " + i13 + "\nFailed: " + i14 + "\nMsg not found: " + i15 + "\nInvalid: " + i16 + "\nUnknown: " + i17 + "\n" + m127130z2, new Object[0]);
    }

    /* renamed from: C */
    private final C17945a0 m90266C(C25821b c25821b) {
        int i11;
        MediaExtInfo.Voice voice;
        MediaExtInfo.File file;
        MediaExtInfo.Doodle doodle;
        MediaExtInfo.Photo photo;
        try {
            C26676b.m136952b("SMLZCloudRecoverCloudMedia", "recoverMsgFromCloudItem: " + c25821b.m133146i());
        } catch (Exception e11) {
            C26676b.m136954d("SMLZCloudRecoverCloudMedia", e11);
        }
        if (AbstractC25495a.m132079d(c25821b.m133146i().m41048l()) && C0943w.f3447a.m4472f(c25821b.m133146i().m41048l()) == null) {
            return null;
        }
        if (AbstractC19074t.m100204b(CoreUtility.f89233i, c25821b.m133146i().m41050n())) {
            i11 = 2;
        } else {
            i11 = 3;
        }
        if (AbstractC16893a.m90330g(c25821b)) {
            MediaExtInfo m90326c = AbstractC16893a.m90326c(c25821b);
            if (m90326c instanceof MediaExtInfo.Photo) {
                photo = (MediaExtInfo.Photo) m90326c;
            } else {
                photo = null;
            }
            if (photo == null) {
                return null;
            }
            C18009w0 c18009w0 = new C18009w0("", "", "https://zcld.chat.zalo.me/cloudmedia/download/NDA0aGVoZWJvaXo", "", photo.m90315c(), photo.m90314b());
            c18009w0.m95778m0();
            C17945a0.w m95386v = new C17945a0.w(c25821b.m133146i(), c25821b.m133147j()).m95359K(c25821b.m133150m()).m95368d(c18009w0).m95386v(i11);
            if (c25821b.m133155r()) {
                m95386v.m95372h(new C31897e4());
            }
            return m95386v.m95365a();
        }
        if (AbstractC16893a.m90327d(c25821b)) {
            String str = "https://zcld.chat.zalo.me/cloudmedia/download/NDA0aGVoZWJvaXo.jpg";
            MediaExtInfo m90326c2 = AbstractC16893a.m90326c(c25821b);
            if (m90326c2 instanceof MediaExtInfo.Doodle) {
                doodle = (MediaExtInfo.Doodle) m90326c2;
            } else {
                doodle = null;
            }
            if (doodle == null) {
                return null;
            }
            C17981m0 c17981m0 = new C17981m0("", "", str, doodle.m90309c(), doodle.m90308b());
            c17981m0.m95628i();
            C17945a0.w m95386v2 = new C17945a0.w(c25821b.m133146i(), c25821b.m133147j()).m95359K(c25821b.m133150m()).m95368d(c17981m0).m95386v(i11);
            if (c25821b.m133155r()) {
                m95386v2.m95372h(new C31897e4());
            }
            return m95386v2.m95365a();
        }
        if (AbstractC16893a.m90331h(c25821b)) {
            C27373c m102939V0 = AbstractC19646n0.m102939V0(c25821b);
            if (m102939V0 == null) {
                return null;
            }
            C17945a0.w m95386v3 = new C17945a0.w(c25821b.m133146i(), c25821b.m133147j()).m95359K(c25821b.m133150m()).m95368d(new C17961f1("", 0, "https://zcld.chat.zalo.me/cloudmedia/download/NDA0aGVoZWJvaXo", "https://zcld.chat.zalo.me/cloudmedia/download/NDA0aGVoZWJvaXo", "", "", C17961f1.m95438A(m102939V0, false, 0L, 0, 0, -1L, -1), m102939V0)).m95386v(i11);
            if (c25821b.m133155r()) {
                m95386v3.m95372h(new C31897e4());
            }
            return m95386v3.m95365a();
        }
        if (AbstractC16893a.m90328e(c25821b)) {
            MediaExtInfo m90326c3 = AbstractC16893a.m90326c(c25821b);
            if (m90326c3 instanceof MediaExtInfo.File) {
                file = (MediaExtInfo.File) m90326c3;
            } else {
                file = null;
            }
            if (file == null) {
                return null;
            }
            C17990p0 c17990p0 = new C17990p0(file.m90312c(), 0, "", "https://zcld.chat.zalo.me/cloudmedia/download/NDA0aGVoZWJvaXo", "", "", "");
            c17990p0.f91113B = c25821b.m133145h().m133166c();
            c17990p0.f91115D = file.m90311b();
            c17990p0.f91114C = c25821b.m133145h().m133164a();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fileSize", c17990p0.f91113B);
            jSONObject.put("fileExt", c17990p0.f91115D);
            String jSONObject2 = jSONObject.toString();
            AbstractC19074t.m100207e(jSONObject2, "toString(...)");
            c17990p0.f91017v = jSONObject2;
            c17990p0.m95671m();
            C17945a0.w m95386v4 = new C17945a0.w(c25821b.m133146i(), c25821b.m133147j()).m95359K(c25821b.m133150m()).m95368d(c17990p0).m95386v(i11);
            if (c25821b.m133155r()) {
                m95386v4.m95372h(new C31897e4());
            }
            return m95386v4.m95365a();
        }
        if (AbstractC16893a.m90332i(c25821b)) {
            MediaExtInfo m90326c4 = AbstractC16893a.m90326c(c25821b);
            if (m90326c4 instanceof MediaExtInfo.Voice) {
                voice = (MediaExtInfo.Voice) m90326c4;
            } else {
                voice = null;
            }
            if (voice == null) {
                return null;
            }
            String lowerCase = voice.m90322c().toLowerCase(Locale.ROOT);
            AbstractC19074t.m100207e(lowerCase, "toLowerCase(...)");
            C17964g1 c17964g1 = new C17964g1("", 0, "", "https://zcld.chat.zalo.me/cloudmedia/download/NDA0aGVoZWJvaXo." + lowerCase, "", "", "");
            c17964g1.m95544w((int) voice.m90321b());
            c17964g1.m95529J();
            C17945a0.w m95386v5 = new C17945a0.w(c25821b.m133146i(), c25821b.m133147j()).m95359K(c25821b.m133150m()).m95368d(c17964g1).m95386v(i11);
            if (c25821b.m133155r()) {
                m95386v5.m95372h(new C31897e4());
            }
            return m95386v5.m95365a();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D */
    public final Object m90267D(C17945a0 c17945a0, C25821b c25821b, Continuation continuation) {
        return BuildersKt.m112534g(Dispatchers.m112680b(), new h(c17945a0, c25821b, this, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m90268E(Continuation continuation) {
        i iVar;
        Object m142578e;
        int i11;
        C16891d c16891d;
        int i12;
        if (continuation instanceof i) {
            iVar = (i) continuation;
            int i13 = iVar.f86003v;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iVar.f86003v = i13 - Integer.MIN_VALUE;
                Object obj = iVar.f86001t;
                m142578e = AbstractC28298d.m142578e();
                i11 = iVar.f86003v;
                if (i11 == 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            AbstractC24862s.m129228b(obj);
                            return C24848g0.f119245a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c16891d = (C16891d) iVar.f86000s;
                    AbstractC24862s.m129228b(obj);
                } else {
                    AbstractC24862s.m129228b(obj);
                    C26676b.m136957g("SMLZCloudRecoverCloudMedia", "> START RECOVER CLOUD ITEMS", null, 4, null);
                    CoroutineDispatcher m112680b = Dispatchers.m112680b();
                    j jVar = new j(null);
                    iVar.f86000s = this;
                    iVar.f86003v = 1;
                    if (BuildersKt.m112534g(m112680b, jVar, iVar) == m142578e) {
                        return m142578e;
                    }
                    c16891d = this;
                }
                if (!c16891d.f85957r.getAndSet(false) && (i12 = c16891d.f85956q) < 3) {
                    c16891d.f85956q = i12 + 1;
                    c16891d.f85951l.set(0);
                    C26676b.m136957g("SMLZCloudRecoverCloudMedia", "Retry - " + c16891d.f85956q, null, 4, null);
                    iVar.f86000s = null;
                    iVar.f86003v = 2;
                    if (c16891d.m90268E(iVar) == m142578e) {
                        return m142578e;
                    }
                    return C24848g0.f119245a;
                }
                return C24848g0.f119245a;
            }
        }
        iVar = new i(continuation);
        Object obj2 = iVar.f86001t;
        m142578e = AbstractC28298d.m142578e();
        i11 = iVar.f86003v;
        if (i11 == 0) {
        }
        if (!c16891d.f85957r.getAndSet(false)) {
        }
        return C24848g0.f119245a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0022. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01ee A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0085  */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m90284s(Stack stack, Continuation continuation) {
        c cVar;
        Object m142578e;
        C16891d c16891d;
        C25821b m90289x;
        Object m112879d;
        C16891d c16891d2;
        Stack stack2;
        C19059j0 c19059j0;
        Boolean bool;
        C16891d c16891d3;
        C25821b c25821b;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i11 = cVar.f85969y;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                cVar.f85969y = i11 - Integer.MIN_VALUE;
                Object obj = cVar.f85967w;
                m142578e = AbstractC28298d.m142578e();
                switch (cVar.f85969y) {
                    case 0:
                        AbstractC24862s.m129228b(obj);
                        cVar.f85963s = this;
                        cVar.f85964t = stack;
                        cVar.f85969y = 1;
                        if (YieldKt.m112882a(cVar) == m142578e) {
                            return m142578e;
                        }
                        c16891d = this;
                        m90289x = c16891d.m90289x(stack);
                        if (m90289x != null) {
                            C26676b.m136957g("SMLZCloudRecoverCloudMedia", "checkDownloadQueue(): NULL Cloud Item", null, 4, null);
                            return C24848g0.f119245a;
                        }
                        C19059j0 c19059j02 = new C19059j0();
                        C17945a0 m2635r = c16891d.f85941b.m2635r(m90289x.m133146i());
                        c19059j02.f94941p = m2635r;
                        if (m2635r == null && c16891d.f85942c.m90249t()) {
                            c19059j02.f94941p = c16891d.m90266C(m90289x);
                        }
                        Object obj2 = c19059j02.f94941p;
                        if (obj2 == null) {
                            C26676b.m136957g("SMLZCloudRecoverCloudMedia", "checkDownloadQueue(): Msg not found!", null, 4, null);
                            c16891d.f85954o.incrementAndGet();
                            cVar.f85963s = null;
                            cVar.f85964t = null;
                            cVar.f85969y = 2;
                            if (c16891d.m90286u(m90289x, stack, cVar) == m142578e) {
                                return m142578e;
                            }
                            return C24848g0.f119245a;
                        }
                        if (((C17945a0) obj2).m95240r6()) {
                            C26676b.m136960j("SMLZCloudRecoverCloudMedia", "checkDownloadQueue(): Already exists in local storage");
                            c16891d.f85953n.incrementAndGet();
                            cVar.f85963s = null;
                            cVar.f85964t = null;
                            cVar.f85969y = 3;
                            if (c16891d.m90286u(m90289x, stack, cVar) == m142578e) {
                                return m142578e;
                            }
                            return C24848g0.f119245a;
                        }
                        if (((C17945a0) c19059j02.f94941p).m95142g6()) {
                            c16891d.f85950k.incrementAndGet();
                            cVar.f85963s = null;
                            cVar.f85964t = null;
                            cVar.f85969y = 4;
                            if (c16891d.m90286u(m90289x, stack, cVar) == m142578e) {
                                return m142578e;
                            }
                            return C24848g0.f119245a;
                        }
                        if (((C17945a0) c19059j02.f94941p).m95063Y5()) {
                            long m90287v = c16891d.m90287v(m90289x.m133145h().m133166c());
                            d dVar = new d(c19059j02, m90289x, null);
                            cVar.f85963s = c16891d;
                            cVar.f85964t = stack;
                            cVar.f85965u = m90289x;
                            cVar.f85966v = c19059j02;
                            cVar.f85969y = 5;
                            m112879d = TimeoutKt.m112879d(m90287v, dVar, cVar);
                            if (m112879d == m142578e) {
                                return m142578e;
                            }
                            c16891d2 = c16891d;
                            stack2 = stack;
                            c19059j0 = c19059j02;
                            bool = (Boolean) m112879d;
                            if (bool == null && bool.booleanValue()) {
                                Boolean m94925J7 = ((C17945a0) c19059j0.f94941p).m94925J7();
                                AbstractC19074t.m100207e(m94925J7, "isRebuildMsg(...)");
                                if (m94925J7.booleanValue()) {
                                    C17945a0 c17945a0 = (C17945a0) c19059j0.f94941p;
                                    cVar.f85963s = c16891d2;
                                    cVar.f85964t = stack2;
                                    cVar.f85965u = m90289x;
                                    cVar.f85966v = null;
                                    cVar.f85969y = 6;
                                    Object m90290z = c16891d2.m90290z(c17945a0, cVar);
                                    if (m90290z == m142578e) {
                                        return m142578e;
                                    }
                                    c16891d3 = c16891d2;
                                    C25821b c25821b2 = m90289x;
                                    obj = m90290z;
                                    c25821b = c25821b2;
                                    if (((Boolean) obj).booleanValue()) {
                                        c16891d3.f85957r.set(true);
                                        c16891d3.f85951l.incrementAndGet();
                                        cVar.f85963s = null;
                                        cVar.f85964t = null;
                                        cVar.f85965u = null;
                                        cVar.f85969y = 7;
                                        if (c16891d3.m90284s(stack2, cVar) == m142578e) {
                                            return m142578e;
                                        }
                                        return C24848g0.f119245a;
                                    }
                                    m90289x = c25821b;
                                    c16891d2 = c16891d3;
                                }
                                c16891d2.f85952m.incrementAndGet();
                                cVar.f85963s = null;
                                cVar.f85964t = null;
                                cVar.f85965u = null;
                                cVar.f85966v = null;
                                cVar.f85969y = 8;
                                if (c16891d2.m90286u(m90289x, stack2, cVar) == m142578e) {
                                    return m142578e;
                                }
                                return C24848g0.f119245a;
                            }
                            c16891d2.f85957r.set(true);
                            c16891d2.f85951l.incrementAndGet();
                            cVar.f85963s = null;
                            cVar.f85964t = null;
                            cVar.f85965u = null;
                            cVar.f85966v = null;
                            cVar.f85969y = 9;
                            if (c16891d2.m90284s(stack2, cVar) == m142578e) {
                                return m142578e;
                            }
                            return C24848g0.f119245a;
                        }
                        c16891d.f85955p.incrementAndGet();
                        cVar.f85963s = null;
                        cVar.f85964t = null;
                        cVar.f85969y = 10;
                        if (c16891d.m90286u(m90289x, stack, cVar) == m142578e) {
                            return m142578e;
                        }
                        return C24848g0.f119245a;
                    case 1:
                        stack = (Stack) cVar.f85964t;
                        c16891d = (C16891d) cVar.f85963s;
                        AbstractC24862s.m129228b(obj);
                        m90289x = c16891d.m90289x(stack);
                        if (m90289x != null) {
                        }
                        break;
                    case 2:
                        AbstractC24862s.m129228b(obj);
                        return C24848g0.f119245a;
                    case 3:
                        AbstractC24862s.m129228b(obj);
                        return C24848g0.f119245a;
                    case 4:
                        AbstractC24862s.m129228b(obj);
                        return C24848g0.f119245a;
                    case 5:
                        c19059j0 = (C19059j0) cVar.f85966v;
                        C25821b c25821b3 = (C25821b) cVar.f85965u;
                        Stack stack3 = (Stack) cVar.f85964t;
                        c16891d2 = (C16891d) cVar.f85963s;
                        AbstractC24862s.m129228b(obj);
                        m112879d = obj;
                        m90289x = c25821b3;
                        stack2 = stack3;
                        bool = (Boolean) m112879d;
                        if (bool == null) {
                            break;
                        }
                        c16891d2.f85957r.set(true);
                        c16891d2.f85951l.incrementAndGet();
                        cVar.f85963s = null;
                        cVar.f85964t = null;
                        cVar.f85965u = null;
                        cVar.f85966v = null;
                        cVar.f85969y = 9;
                        if (c16891d2.m90284s(stack2, cVar) == m142578e) {
                        }
                        return C24848g0.f119245a;
                    case 6:
                        c25821b = (C25821b) cVar.f85965u;
                        stack2 = (Stack) cVar.f85964t;
                        c16891d3 = (C16891d) cVar.f85963s;
                        AbstractC24862s.m129228b(obj);
                        if (((Boolean) obj).booleanValue()) {
                        }
                        break;
                    case 7:
                        AbstractC24862s.m129228b(obj);
                        return C24848g0.f119245a;
                    case 8:
                        AbstractC24862s.m129228b(obj);
                        return C24848g0.f119245a;
                    case 9:
                        AbstractC24862s.m129228b(obj);
                        return C24848g0.f119245a;
                    case 10:
                        AbstractC24862s.m129228b(obj);
                        return C24848g0.f119245a;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        cVar = new c(continuation);
        Object obj3 = cVar.f85967w;
        m142578e = AbstractC28298d.m142578e();
        switch (cVar.f85969y) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public final void m90285t() {
        this.f85949j.set(0);
        this.f85953n.set(0);
        this.f85952m.set(0);
        this.f85951l.set(0);
        this.f85954o.set(0);
        this.f85950k.set(0);
        this.f85955p.set(0);
        this.f85946g.mo113433d(new b(0.0f, 0, 0, 0L, 15, null));
    }

    /* renamed from: u */
    private final Object m90286u(C25821b c25821b, Stack stack, Continuation continuation) {
        Object m142578e;
        synchronized (this.f85958s) {
            this.f85948i -= c25821b.m133145h().m133166c();
            this.f85940a.m124762D(c25821b.m133146i());
            C24848g0 c24848g0 = C24848g0.f119245a;
        }
        Object m90284s = m90284s(stack, continuation);
        m142578e = AbstractC28298d.m142578e();
        if (m90284s == m142578e) {
            return m90284s;
        }
        return C24848g0.f119245a;
    }

    /* renamed from: v */
    private final long m90287v(long j11) {
        if (1 <= j11 && j11 < C21459a.m111040i(1)) {
            return 10000L;
        }
        if (1 <= j11 && j11 < C21459a.m111040i(10)) {
            return 60000L;
        }
        if (1 <= j11 && j11 < C21459a.m111040i(50)) {
            return 180000L;
        }
        if (1 <= j11 && j11 < C21459a.m111040i(100)) {
            return 300000L;
        }
        return (C21459a.m111034b(j11) * 2000) + 300000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public final C29593i m90288w() {
        return (C29593i) this.f85943d.getValue();
    }

    /* renamed from: x */
    private final synchronized C25821b m90289x(Stack stack) {
        if (stack.isEmpty()) {
            C26676b.m136960j("SMLZCloudRecoverCloudMedia", "COMPLETE");
            return null;
        }
        C26676b.m136952b("SMLZCloudRecoverCloudMedia", "Remain total items: " + stack.size());
        float f11 = 100;
        try {
            this.f85946g.mo113433d(new b(f11 - (((stack.size() + this.f85951l.get()) * f11) / this.f85949j.get()), this.f85949j.get(), stack.size(), this.f85948i));
            return (C25821b) stack.pop();
        } catch (EmptyStackException unused) {
            return null;
        }
    }

    /* renamed from: z */
    private final Object m90290z(C17945a0 c17945a0, Continuation continuation) {
        return BuildersKt.m112534g(Dispatchers.m112680b(), new e(c17945a0, this, null), continuation);
    }

    @Override // p185gc.AbstractC19379c
    /* renamed from: b */
    protected Object mo90291b(Continuation continuation) {
        return BuildersKt.m112534g(Dispatchers.m112680b(), new g(null), continuation);
    }

    /* renamed from: r */
    public final void m90292r() {
        this.f85945f.clear();
        ArrayList arrayList = this.f85944e;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Job.DefaultImpls.m112740a((Job) it.next(), null, 1, null);
            }
        }
    }

    /* renamed from: y */
    public final StateFlow m90293y() {
        return this.f85947h;
    }
}
