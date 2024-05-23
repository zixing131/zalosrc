package p216hq;

import android.os.Bundle;
import androidx.lifecycle.AbstractC1754a;
import androidx.lifecycle.AbstractC1796t0;
import androidx.lifecycle.AbstractC1798u0;
import androidx.lifecycle.C1761c0;
import androidx.lifecycle.C1780l0;
import bo.C2949b;
import bo.C3000l0;
import bo.C3003l3;
import bo.C3023p3;
import bo.C3063z0;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.common.C7853b;
import com.zing.zalo.control.LinkAttachment;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.data.mediapicker.model.MediaItem;
import com.zing.zalo.feed.models.PrivacyInfo;
import com.zing.zalo.feed.models.SongData;
import com.zing.zalo.feed.models.SongInfo;
import com.zing.zalo.feed.mvp.music.data.ExceptionFetchMusicUnknown;
import com.zing.zalo.feed.mvp.music.data.ExceptionMusicLoadInfo;
import com.zing.zalo.feed.mvp.music.data.ExceptionMusicLocationNotSupported;
import com.zing.zalo.feed.mvp.music.data.ExceptionMusicStreaming;
import com.zing.zalo.feed.mvp.music.data.ExceptionNoNetwork;
import com.zing.zalo.feed.mvp.music.domain.entity.LyricRender;
import com.zing.zalo.feed.mvp.music.domain.entity.Sentence;
import com.zing.zalo.feed.mvp.postfeed.viewmodel.ComposLyricStatus;
import com.zing.zalo.feed.mvp.postfeed.viewmodel.ComposeSongStatus;
import com.zing.zalo.feed.mvp.profile.model.ProfilePreviewAlbumItem;
import com.zing.zalo.zinstant.C17244x0;
import com.zing.zalocore.CoreUtility;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fo.C19086f;
import fo.C19087g;
import is.C20791e;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import me0.AbstractC23136l9;
import me0.C23055e5;
import p089d2.InterfaceC17712d;
import p107dq.C18049e;
import p107dq.InterfaceC18053i;
import p137eo.C18524h;
import p205hc.C19964c;
import p368nq.C23926a;
import p426pp.AbstractC24900c;
import p426pp.C24898a;
import p426pp.C24902e;
import p426pp.C24903f;
import p455qo.C25413i;
import p456qp.C25455g;
import p456qp.C25457i;
import p456qp.C25458j;
import p456qp.C25459k;
import p456qp.C25464p;
import p471r3.C25630b;
import p509sp.C26356e;
import p559uv.C27373c;
import p581vo.AbstractC28358a;
import p581vo.C28364g;
import p581vo.C28365h;
import p581vo.C28366i;
import p581vo.C28367j;
import p581vo.C28368k;
import p581vo.C28369l;
import p581vo.EnumC28361d;
import p716zh.C31890dc;
import pm0.AbstractC24856m;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import qm0.AbstractC25332a0;
import so.C26343a;
import so.C26344b;
import so.C26345c;
import so.C26346d;
import so.C26347e;
import so.C26348f;
import so.C26349g;
import tn.C26761p;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: hq.a */
/* loaded from: classes4.dex */
public final class C20112a extends AbstractC1796t0 {
    public static final b Companion = new b(null);

    /* renamed from: A */
    private final C1761c0 f98914A;

    /* renamed from: B */
    private final C1761c0 f98915B;

    /* renamed from: C */
    private final C1761c0 f98916C;

    /* renamed from: D */
    private final InterfaceC24854k f98917D;

    /* renamed from: E */
    private boolean f98918E;

    /* renamed from: F */
    private boolean f98919F;

    /* renamed from: G */
    private Job f98920G;

    /* renamed from: s */
    private final C1780l0 f98921s;

    /* renamed from: t */
    private boolean f98922t;

    /* renamed from: u */
    private ComposLyricStatus f98923u;

    /* renamed from: v */
    private final int f98924v;

    /* renamed from: w */
    private final C1761c0 f98925w;

    /* renamed from: x */
    private final C1761c0 f98926x;

    /* renamed from: y */
    private final C1761c0 f98927y;

    /* renamed from: z */
    private final C1761c0 f98928z;

    /* renamed from: hq.a$a */
    /* loaded from: classes4.dex */
    static final class a extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f98929t;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: hq.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C32833a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ C20112a f98931p;

            C32833a(C20112a c20112a) {
                this.f98931p = c20112a;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo12109b(C18524h.b bVar, Continuation continuation) {
                boolean z11;
                if (bVar.m97913d()) {
                    if (bVar.m97910a().m46342m().size() > 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    C23926a c23926a = C23926a.f115594a;
                    c23926a.m125058g(z11);
                    c23926a.m125057f(true);
                }
                this.f98931p.m104623b0().mo9224q(bVar);
                return C24848g0.f119245a;
            }
        }

        a(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new a(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f98929t;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        AbstractC24862s.m129228b(obj);
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                C19087g c19087g = new C19087g(null, 1, null);
                C19087g.a aVar = new C19087g.a(C20112a.this.m104632l0(), C20112a.this.m104631k0());
                this.f98929t = 1;
                obj = c19087g.m101498a(aVar, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            Flow flow = (Flow) obj;
            if (flow != null) {
                C32833a c32833a = new C32833a(C20112a.this);
                this.f98929t = 2;
                if (flow.mo97893a(c32833a, this) == m142578e) {
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: hq.a$a0 */
    /* loaded from: classes4.dex */
    public static final class a0 extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: A */
        final /* synthetic */ boolean f98932A;

        /* renamed from: B */
        final /* synthetic */ boolean f98933B;

        /* renamed from: C */
        final /* synthetic */ String f98934C;

        /* renamed from: D */
        final /* synthetic */ C20112a f98935D;

        /* renamed from: t */
        int f98936t;

        /* renamed from: u */
        final /* synthetic */ String f98937u;

        /* renamed from: v */
        final /* synthetic */ C3003l3 f98938v;

        /* renamed from: w */
        final /* synthetic */ C3063z0 f98939w;

        /* renamed from: x */
        final /* synthetic */ PrivacyInfo f98940x;

        /* renamed from: y */
        final /* synthetic */ C31890dc f98941y;

        /* renamed from: z */
        final /* synthetic */ TrackingSource f98942z;

        /* renamed from: hq.a$a0$a */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC18505l {

            /* renamed from: p */
            final /* synthetic */ C20112a f98943p;

            a(C20112a c20112a) {
                this.f98943p = c20112a;
            }

            /* renamed from: a */
            public void m104650a(C3000l0 c3000l0) {
                AbstractC19074t.m100208f(c3000l0, "feedContent");
                this.f98943p.m104588O0(c3000l0);
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: i9 */
            public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                m104650a((C3000l0) obj);
                return C24848g0.f119245a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: hq.a$a0$b */
        /* loaded from: classes4.dex */
        public static final class b implements FlowCollector {

            /* renamed from: p */
            public static final b f98944p = new b();

            /* renamed from: hq.a$a0$b$a */
            /* loaded from: classes4.dex */
            public /* synthetic */ class a {

                /* renamed from: a */
                public static final /* synthetic */ int[] f98945a;

                static {
                    int[] iArr = new int[EnumC28361d.values().length];
                    try {
                        iArr[EnumC28361d.f132142q.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    f98945a = iArr;
                }
            }

            b() {
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo12109b(AbstractC28358a abstractC28358a, Continuation continuation) {
                EnumC28361d enumC28361d;
                if (abstractC28358a != null) {
                    enumC28361d = abstractC28358a.m142806a();
                } else {
                    enumC28361d = null;
                }
                if (enumC28361d != null && a.f98945a[enumC28361d.ordinal()] == 1) {
                    AbstractC19074t.m100206d(abstractC28358a, "null cannot be cast to non-null type com.zing.zalo.feed.mvp.feed.domain.usecase.uploadfeed.BaseFlowProcessFeedResponse.Error");
                    Exception m142807b = ((AbstractC28358a.b) abstractC28358a).m142807b();
                    if (m142807b != null) {
                        m142807b.printStackTrace();
                    }
                }
                return C24848g0.f119245a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a0(String str, C3003l3 c3003l3, C3063z0 c3063z0, PrivacyInfo privacyInfo, C31890dc c31890dc, TrackingSource trackingSource, boolean z11, boolean z12, String str2, C20112a c20112a, Continuation continuation) {
            super(2, continuation);
            this.f98937u = str;
            this.f98938v = c3003l3;
            this.f98939w = c3063z0;
            this.f98940x = privacyInfo;
            this.f98941y = c31890dc;
            this.f98942z = trackingSource;
            this.f98932A = z11;
            this.f98933B = z12;
            this.f98934C = str2;
            this.f98935D = c20112a;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new a0(this.f98937u, this.f98938v, this.f98939w, this.f98940x, this.f98941y, this.f98942z, this.f98932A, this.f98933B, this.f98934C, this.f98935D, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            Object m101498a;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f98936t;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        AbstractC24862s.m129228b(obj);
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
                m101498a = obj;
            } else {
                AbstractC24862s.m129228b(obj);
                C28368k c28368k = new C28368k();
                C28368k.a aVar = new C28368k.a(this.f98937u, this.f98938v, this.f98939w, this.f98940x, this.f98941y, this.f98942z, this.f98932A, this.f98933B, new a(this.f98935D), this.f98934C);
                this.f98936t = 1;
                m101498a = c28368k.m101498a(aVar, this);
                if (m101498a == m142578e) {
                    return m142578e;
                }
            }
            Flow flow = (Flow) m101498a;
            if (flow != null) {
                b bVar = b.f98944p;
                this.f98936t = 2;
                if (flow.mo97893a(bVar, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a0) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: hq.a$b */
    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: hq.a$b0 */
    /* loaded from: classes4.dex */
    public static final class b0 extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: A */
        final /* synthetic */ C31890dc f98946A;

        /* renamed from: B */
        final /* synthetic */ TrackingSource f98947B;

        /* renamed from: C */
        final /* synthetic */ ProfilePreviewAlbumItem f98948C;

        /* renamed from: D */
        final /* synthetic */ boolean f98949D;

        /* renamed from: E */
        final /* synthetic */ String f98950E;

        /* renamed from: F */
        final /* synthetic */ C20112a f98951F;

        /* renamed from: t */
        int f98952t;

        /* renamed from: u */
        final /* synthetic */ String f98953u;

        /* renamed from: v */
        final /* synthetic */ C27373c f98954v;

        /* renamed from: w */
        final /* synthetic */ C3003l3 f98955w;

        /* renamed from: x */
        final /* synthetic */ C3063z0 f98956x;

        /* renamed from: y */
        final /* synthetic */ PrivacyInfo f98957y;

        /* renamed from: z */
        final /* synthetic */ String f98958z;

        /* renamed from: hq.a$b0$a */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC18505l {

            /* renamed from: p */
            final /* synthetic */ C20112a f98959p;

            a(C20112a c20112a) {
                this.f98959p = c20112a;
            }

            /* renamed from: a */
            public void m104653a(C3000l0 c3000l0) {
                AbstractC19074t.m100208f(c3000l0, "feedContent");
                this.f98959p.m104588O0(c3000l0);
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: i9 */
            public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                m104653a((C3000l0) obj);
                return C24848g0.f119245a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: hq.a$b0$b */
        /* loaded from: classes4.dex */
        public static final class b implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ C20112a f98960p;

            /* renamed from: hq.a$b0$b$a */
            /* loaded from: classes4.dex */
            public /* synthetic */ class a {

                /* renamed from: a */
                public static final /* synthetic */ int[] f98961a;

                static {
                    int[] iArr = new int[EnumC28361d.values().length];
                    try {
                        iArr[EnumC28361d.f132142q.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[EnumC28361d.f132144s.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    f98961a = iArr;
                }
            }

            b(C20112a c20112a) {
                this.f98960p = c20112a;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo12109b(AbstractC28358a abstractC28358a, Continuation continuation) {
                EnumC28361d enumC28361d;
                int i11;
                if (abstractC28358a != null) {
                    enumC28361d = abstractC28358a.m142806a();
                } else {
                    enumC28361d = null;
                }
                if (enumC28361d == null) {
                    i11 = -1;
                } else {
                    i11 = a.f98961a[enumC28361d.ordinal()];
                }
                if (i11 != 1) {
                    if (i11 == 2) {
                        this.f98960p.m104630j0().mo9224q(new C19964c(new i()));
                    }
                } else {
                    AbstractC19074t.m100206d(abstractC28358a, "null cannot be cast to non-null type com.zing.zalo.feed.mvp.feed.domain.usecase.uploadfeed.BaseFlowProcessFeedResponse.Error");
                    Exception m142807b = ((AbstractC28358a.b) abstractC28358a).m142807b();
                    if (m142807b != null) {
                        m142807b.printStackTrace();
                    }
                }
                return C24848g0.f119245a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b0(String str, C27373c c27373c, C3003l3 c3003l3, C3063z0 c3063z0, PrivacyInfo privacyInfo, String str2, C31890dc c31890dc, TrackingSource trackingSource, ProfilePreviewAlbumItem profilePreviewAlbumItem, boolean z11, String str3, C20112a c20112a, Continuation continuation) {
            super(2, continuation);
            this.f98953u = str;
            this.f98954v = c27373c;
            this.f98955w = c3003l3;
            this.f98956x = c3063z0;
            this.f98957y = privacyInfo;
            this.f98958z = str2;
            this.f98946A = c31890dc;
            this.f98947B = trackingSource;
            this.f98948C = profilePreviewAlbumItem;
            this.f98949D = z11;
            this.f98950E = str3;
            this.f98951F = c20112a;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new b0(this.f98953u, this.f98954v, this.f98955w, this.f98956x, this.f98957y, this.f98958z, this.f98946A, this.f98947B, this.f98948C, this.f98949D, this.f98950E, this.f98951F, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            Object m101498a;
            Object obj2;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f98952t;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        AbstractC24862s.m129228b(obj);
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
                obj2 = m142578e;
                m101498a = obj;
            } else {
                AbstractC24862s.m129228b(obj);
                C28369l c28369l = new C28369l();
                C28369l.a aVar = new C28369l.a(this.f98953u, this.f98954v, this.f98955w, this.f98956x, this.f98957y, this.f98958z, this.f98946A, this.f98947B, this.f98948C, this.f98949D, new a(this.f98951F), this.f98950E);
                this.f98952t = 1;
                m101498a = c28369l.m101498a(aVar, this);
                obj2 = m142578e;
                if (m101498a == obj2) {
                    return obj2;
                }
            }
            Flow flow = (Flow) m101498a;
            if (flow != null) {
                b bVar = new b(this.f98951F);
                this.f98952t = 2;
                if (flow.mo97893a(bVar, this) == obj2) {
                    return obj2;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b0) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: hq.a$c */
    /* loaded from: classes4.dex */
    public interface c {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: hq.a$c0 */
    /* loaded from: classes4.dex */
    public static final class c0 extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f98962t;

        /* renamed from: v */
        final /* synthetic */ int f98964v;

        /* renamed from: w */
        final /* synthetic */ String f98965w;

        /* renamed from: hq.a$c0$a */
        /* loaded from: classes4.dex */
        public static final class a implements C25458j.a {

            /* renamed from: a */
            final /* synthetic */ C20112a f98966a;

            /* renamed from: b */
            final /* synthetic */ String f98967b;

            /* renamed from: hq.a$c0$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            static final class C32834a extends AbstractC29104l implements InterfaceC18509p {

                /* renamed from: t */
                int f98968t;

                /* renamed from: u */
                final /* synthetic */ C20112a f98969u;

                /* renamed from: v */
                final /* synthetic */ LyricRender f98970v;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C32834a(C20112a c20112a, LyricRender lyricRender, Continuation continuation) {
                    super(2, continuation);
                    this.f98969u = c20112a;
                    this.f98970v = lyricRender;
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: a */
                public final Continuation mo238a(Object obj, Continuation continuation) {
                    return new C32834a(this.f98969u, this.f98970v, continuation);
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: o */
                public final Object mo239o(Object obj) {
                    AbstractC28298d.m142578e();
                    if (this.f98968t == 0) {
                        AbstractC24862s.m129228b(obj);
                        this.f98969u.m104616T0(this.f98970v);
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }

                @Override // en0.InterfaceC18509p
                /* renamed from: r, reason: merged with bridge method [inline-methods] */
                public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                    return ((C32834a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
                }
            }

            /* renamed from: hq.a$c0$a$b */
            /* loaded from: classes4.dex */
            static final class b extends AbstractC29104l implements InterfaceC18509p {

                /* renamed from: t */
                int f98971t;

                /* renamed from: u */
                final /* synthetic */ Exception f98972u;

                /* renamed from: v */
                final /* synthetic */ C20112a f98973v;

                /* renamed from: w */
                final /* synthetic */ String f98974w;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(Exception exc, C20112a c20112a, String str, Continuation continuation) {
                    super(2, continuation);
                    this.f98972u = exc;
                    this.f98973v = c20112a;
                    this.f98974w = str;
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: a */
                public final Continuation mo238a(Object obj, Continuation continuation) {
                    return new b(this.f98972u, this.f98973v, this.f98974w, continuation);
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: o */
                public final Object mo239o(Object obj) {
                    AbstractC28298d.m142578e();
                    if (this.f98971t == 0) {
                        AbstractC24862s.m129228b(obj);
                        if (AbstractC19074t.m100204b(this.f98972u, ExceptionMusicStreaming.f46312p)) {
                            C1761c0 m104630j0 = this.f98973v.m104630j0();
                            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_music_download_song_error);
                            AbstractC19074t.m100207e(m118743r0, "getString(...)");
                            m104630j0.mo9224q(new C19964c(new g(m118743r0)));
                            this.f98973v.m104594U();
                        }
                        C20112a.m104601a1(this.f98973v, this.f98974w, false, 0, false, 4, null);
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }

                @Override // en0.InterfaceC18509p
                /* renamed from: r, reason: merged with bridge method [inline-methods] */
                public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                    return ((b) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
                }
            }

            /* renamed from: hq.a$c0$a$c */
            /* loaded from: classes4.dex */
            static final class c extends AbstractC29104l implements InterfaceC18509p {

                /* renamed from: t */
                int f98975t;

                /* renamed from: u */
                final /* synthetic */ C20112a f98976u;

                /* renamed from: v */
                final /* synthetic */ String f98977v;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                c(C20112a c20112a, String str, Continuation continuation) {
                    super(2, continuation);
                    this.f98976u = c20112a;
                    this.f98977v = str;
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: a */
                public final Continuation mo238a(Object obj, Continuation continuation) {
                    return new c(this.f98976u, this.f98977v, continuation);
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: o */
                public final Object mo239o(Object obj) {
                    AbstractC28298d.m142578e();
                    if (this.f98975t == 0) {
                        AbstractC24862s.m129228b(obj);
                        C20112a.m104601a1(this.f98976u, this.f98977v, false, 0, true, 4, null);
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }

                @Override // en0.InterfaceC18509p
                /* renamed from: r, reason: merged with bridge method [inline-methods] */
                public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                    return ((c) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
                }
            }

            /* renamed from: hq.a$c0$a$d */
            /* loaded from: classes4.dex */
            static final class d extends AbstractC29104l implements InterfaceC18509p {

                /* renamed from: t */
                int f98978t;

                /* renamed from: u */
                final /* synthetic */ C20112a f98979u;

                /* renamed from: v */
                final /* synthetic */ C24903f f98980v;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                d(C20112a c20112a, C24903f c24903f, Continuation continuation) {
                    super(2, continuation);
                    this.f98979u = c20112a;
                    this.f98980v = c24903f;
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: a */
                public final Continuation mo238a(Object obj, Continuation continuation) {
                    return new d(this.f98979u, this.f98980v, continuation);
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: o */
                public final Object mo239o(Object obj) {
                    AbstractC28298d.m142578e();
                    if (this.f98978t == 0) {
                        AbstractC24862s.m129228b(obj);
                        this.f98979u.m104600Z0(this.f98980v.m129502e(), true, 0, false);
                        this.f98979u.m104596W();
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }

                @Override // en0.InterfaceC18509p
                /* renamed from: r, reason: merged with bridge method [inline-methods] */
                public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                    return ((d) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
                }
            }

            /* renamed from: hq.a$c0$a$e */
            /* loaded from: classes4.dex */
            static final class e extends AbstractC29104l implements InterfaceC18509p {

                /* renamed from: t */
                int f98981t;

                /* renamed from: u */
                final /* synthetic */ C20112a f98982u;

                /* renamed from: v */
                final /* synthetic */ C24903f f98983v;

                /* renamed from: w */
                final /* synthetic */ int f98984w;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                e(C20112a c20112a, C24903f c24903f, int i11, Continuation continuation) {
                    super(2, continuation);
                    this.f98982u = c20112a;
                    this.f98983v = c24903f;
                    this.f98984w = i11;
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: a */
                public final Continuation mo238a(Object obj, Continuation continuation) {
                    return new e(this.f98982u, this.f98983v, this.f98984w, continuation);
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: o */
                public final Object mo239o(Object obj) {
                    AbstractC28298d.m142578e();
                    if (this.f98981t == 0) {
                        AbstractC24862s.m129228b(obj);
                        this.f98982u.m104600Z0(this.f98983v.m129502e(), true, this.f98984w, false);
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }

                @Override // en0.InterfaceC18509p
                /* renamed from: r, reason: merged with bridge method [inline-methods] */
                public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                    return ((e) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
                }
            }

            /* renamed from: hq.a$c0$a$f */
            /* loaded from: classes4.dex */
            static final class f extends AbstractC29104l implements InterfaceC18509p {

                /* renamed from: t */
                int f98985t;

                /* renamed from: u */
                final /* synthetic */ C20112a f98986u;

                /* renamed from: v */
                final /* synthetic */ C24903f f98987v;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                f(C20112a c20112a, C24903f c24903f, Continuation continuation) {
                    super(2, continuation);
                    this.f98986u = c20112a;
                    this.f98987v = c24903f;
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: a */
                public final Continuation mo238a(Object obj, Continuation continuation) {
                    return new f(this.f98986u, this.f98987v, continuation);
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: o */
                public final Object mo239o(Object obj) {
                    AbstractC28298d.m142578e();
                    if (this.f98985t == 0) {
                        AbstractC24862s.m129228b(obj);
                        C20112a.m104601a1(this.f98986u, this.f98987v.m129502e(), false, 0, false, 4, null);
                        this.f98986u.m104599Y0(this.f98987v.m129502e());
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }

                @Override // en0.InterfaceC18509p
                /* renamed from: r, reason: merged with bridge method [inline-methods] */
                public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                    return ((f) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
                }
            }

            a(C20112a c20112a, String str) {
                this.f98966a = c20112a;
                this.f98967b = str;
            }

            @Override // p456qp.C25458j.a
            /* renamed from: a */
            public void mo104656a(Exception exc) {
                AbstractC19074t.m100208f(exc, "exception");
                BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this.f98966a), null, null, new b(exc, this.f98966a, this.f98967b, null), 3, null);
            }

            @Override // p456qp.C25458j.a
            /* renamed from: b */
            public void mo104657b(String str) {
                AbstractC19074t.m100208f(str, "idSong");
                BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this.f98966a), null, null, new c(this.f98966a, str, null), 3, null);
            }

            @Override // p456qp.C25458j.a
            /* renamed from: c */
            public void mo104658c(C24903f c24903f, int i11, int i12) {
                C25458j.a.C32958a.m131877e(this, c24903f, i11, i12);
            }

            @Override // p456qp.C25458j.a
            /* renamed from: d */
            public void mo104659d(C24903f c24903f) {
                AbstractC19074t.m100208f(c24903f, "songStreaming");
                BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this.f98966a), null, null, new d(this.f98966a, c24903f, null), 3, null);
            }

            @Override // p456qp.C25458j.a
            /* renamed from: e */
            public void mo104660e(C24903f c24903f, int i11) {
                AbstractC19074t.m100208f(c24903f, "songStreaming");
                BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this.f98966a), null, null, new e(this.f98966a, c24903f, i11, null), 3, null);
            }

            @Override // p456qp.C25458j.a
            /* renamed from: f */
            public void mo104661f(C24903f c24903f) {
                C25458j.a.C32958a.m131874b(this, c24903f);
            }

            @Override // p456qp.C25458j.a
            /* renamed from: g */
            public void mo104662g(C24903f c24903f) {
                AbstractC19074t.m100208f(c24903f, "songStreaming");
                BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this.f98966a), null, null, new f(this.f98966a, c24903f, null), 3, null);
            }

            @Override // p456qp.C25458j.a
            /* renamed from: h */
            public void mo104663h(C24902e c24902e) {
                C25458j.a.C32958a.m131878f(this, c24902e);
            }

            @Override // p456qp.C25458j.a
            /* renamed from: i */
            public void mo104664i(C24903f c24903f, LyricRender lyricRender) {
                AbstractC19074t.m100208f(c24903f, "songStreaming");
                AbstractC19074t.m100208f(lyricRender, "lyricRender");
                BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this.f98966a), null, null, new C32834a(this.f98966a, lyricRender, null), 3, null);
            }

            @Override // p456qp.C25458j.a
            public void onAudioFocusChange(int i11) {
                if (i11 == -2 || i11 == -1) {
                    this.f98966a.m104594U();
                } else if (i11 == 1) {
                    this.f98966a.m104596W();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c0(int i11, String str, Continuation continuation) {
            super(2, continuation);
            this.f98964v = i11;
            this.f98965w = str;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new c0(this.f98964v, this.f98965w, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            boolean z11;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f98962t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C20112a.this.m104594U();
                if (this.f98964v == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                C25458j c25458j = new C25458j(null, 1, null);
                C25458j.b bVar = new C25458j.b(this.f98965w, z11, false, null, true, this.f98964v, new a(C20112a.this, this.f98965w), 8, null);
                this.f98962t = 1;
                if (c25458j.m101507a(bVar, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c0) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: hq.a$d */
    /* loaded from: classes4.dex */
    public static final class d implements c {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: hq.a$d0 */
    /* loaded from: classes4.dex */
    public static final class d0 extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f98988t;

        /* renamed from: u */
        final /* synthetic */ String f98989u;

        /* renamed from: v */
        final /* synthetic */ C20112a f98990v;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: hq.a$d0$a */
        /* loaded from: classes4.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ C20112a f98991p;

            /* renamed from: q */
            final /* synthetic */ String f98992q;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: hq.a$d0$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C32835a extends AbstractC29104l implements InterfaceC18509p {

                /* renamed from: t */
                int f98993t;

                /* renamed from: u */
                final /* synthetic */ AbstractC24900c f98994u;

                /* renamed from: v */
                final /* synthetic */ C20112a f98995v;

                /* renamed from: w */
                final /* synthetic */ String f98996w;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C32835a(AbstractC24900c abstractC24900c, C20112a c20112a, String str, Continuation continuation) {
                    super(2, continuation);
                    this.f98994u = abstractC24900c;
                    this.f98995v = c20112a;
                    this.f98996w = str;
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: a */
                public final Continuation mo238a(Object obj, Continuation continuation) {
                    return new C32835a(this.f98994u, this.f98995v, this.f98996w, continuation);
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: o */
                public final Object mo239o(Object obj) {
                    AbstractC28298d.m142578e();
                    if (this.f98993t == 0) {
                        AbstractC24862s.m129228b(obj);
                        AbstractC24900c abstractC24900c = this.f98994u;
                        if (abstractC24900c instanceof AbstractC24900c.b) {
                            C20112a c20112a = this.f98995v;
                            c20112a.m104600Z0(c20112a.m104627g0().m45160e(), false, this.f98995v.m104627g0().m45161f(), true);
                        } else if (abstractC24900c instanceof AbstractC24900c.c) {
                            C7853b.f.a m40162b = ((C25459k.b) ((AbstractC24900c.c) abstractC24900c).m129474a()).m131906a().m40162b();
                            long m40161a = ((C25459k.b) ((AbstractC24900c.c) this.f98994u).m129474a()).m131906a().m40161a();
                            if (m40162b == C7853b.f.a.f42237r) {
                                this.f98995v.m104584M0(this.f98996w, (int) m40161a);
                            } else {
                                this.f98995v.m104596W();
                                C20112a c20112a2 = this.f98995v;
                                c20112a2.m104600Z0(c20112a2.m104627g0().m45160e(), true, this.f98995v.m104627g0().m45161f(), false);
                            }
                        } else if (abstractC24900c instanceof AbstractC24900c.a) {
                            C20112a c20112a3 = this.f98995v;
                            c20112a3.m104600Z0(c20112a3.m104627g0().m45160e(), false, 0, false);
                        }
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }

                @Override // en0.InterfaceC18509p
                /* renamed from: r, reason: merged with bridge method [inline-methods] */
                public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                    return ((C32835a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
                }
            }

            a(C20112a c20112a, String str) {
                this.f98991p = c20112a;
                this.f98992q = str;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo12109b(AbstractC24900c abstractC24900c, Continuation continuation) {
                Object m142578e;
                Object m112534g = BuildersKt.m112534g(Dispatchers.m112681c(), new C32835a(abstractC24900c, this.f98991p, this.f98992q, null), continuation);
                m142578e = AbstractC28298d.m142578e();
                if (m112534g == m142578e) {
                    return m112534g;
                }
                return C24848g0.f119245a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d0(String str, C20112a c20112a, Continuation continuation) {
            super(2, continuation);
            this.f98989u = str;
            this.f98990v = c20112a;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new d0(this.f98989u, this.f98990v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f98988t;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        AbstractC24862s.m129228b(obj);
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                C25459k c25459k = new C25459k(null, 1, null);
                C25459k.a aVar = new C25459k.a(this.f98989u);
                this.f98988t = 1;
                obj = c25459k.m101498a(aVar, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            Flow flow = (Flow) obj;
            if (flow != null) {
                a aVar2 = new a(this.f98990v, this.f98989u);
                this.f98988t = 2;
                if (flow.mo97893a(aVar2, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d0) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: hq.a$e */
    /* loaded from: classes4.dex */
    public static final class e implements c {

        /* renamed from: a */
        private final String f98997a;

        /* renamed from: b */
        private final int f98998b;

        public e(String str, int i11) {
            AbstractC19074t.m100208f(str, "msg");
            this.f98997a = str;
            this.f98998b = i11;
        }

        /* renamed from: a */
        public final int m104674a() {
            return this.f98998b;
        }

        /* renamed from: b */
        public final String m104675b() {
            return this.f98997a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: hq.a$e0 */
    /* loaded from: classes4.dex */
    public static final class e0 extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f98999t;

        /* renamed from: v */
        final /* synthetic */ String f99001v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e0(String str, Continuation continuation) {
            super(2, continuation);
            this.f99001v = str;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new e0(this.f99001v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f98999t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                this.f98999t = 1;
                if (DelayKt.m112666b(1000L, this) == m142578e) {
                    return m142578e;
                }
            }
            C20112a.this.m104582L0(this.f99001v);
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((e0) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: hq.a$f */
    /* loaded from: classes4.dex */
    public static final class f implements c {

        /* renamed from: a */
        private final String f99002a;

        public f(String str) {
            AbstractC19074t.m100208f(str, "configString");
            this.f99002a = str;
        }

        /* renamed from: a */
        public final String m104677a() {
            return this.f99002a;
        }
    }

    /* renamed from: hq.a$g */
    /* loaded from: classes4.dex */
    public static final class g implements c {

        /* renamed from: a */
        private final String f99003a;

        public g(String str) {
            AbstractC19074t.m100208f(str, "msg");
            this.f99003a = str;
        }

        /* renamed from: a */
        public final String m104678a() {
            return this.f99003a;
        }
    }

    /* renamed from: hq.a$h */
    /* loaded from: classes4.dex */
    public static final class h implements c {

        /* renamed from: a */
        private final String f99004a;

        /* renamed from: b */
        private final int f99005b;

        public h(String str, int i11) {
            AbstractC19074t.m100208f(str, "msg");
            this.f99004a = str;
            this.f99005b = i11;
        }
    }

    /* renamed from: hq.a$i */
    /* loaded from: classes4.dex */
    public static final class i implements c {
    }

    /* renamed from: hq.a$j */
    /* loaded from: classes4.dex */
    public static final class j implements c {

        /* renamed from: a */
        private final C3000l0 f99006a;

        public j(C3000l0 c3000l0) {
            this.f99006a = c3000l0;
        }

        /* renamed from: a */
        public final C3000l0 m104679a() {
            return this.f99006a;
        }
    }

    /* renamed from: hq.a$k */
    /* loaded from: classes4.dex */
    public static final class k extends AbstractC1754a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(InterfaceC17712d interfaceC17712d, Bundle bundle) {
            super(interfaceC17712d, bundle);
            AbstractC19074t.m100208f(interfaceC17712d, "owner");
        }

        @Override // androidx.lifecycle.AbstractC1754a
        /* renamed from: e */
        protected AbstractC1796t0 mo9255e(String str, Class cls, C1780l0 c1780l0) {
            AbstractC19074t.m100208f(str, "key");
            AbstractC19074t.m100208f(cls, "modelClass");
            AbstractC19074t.m100208f(c1780l0, "handle");
            if (cls.isAssignableFrom(C20112a.class)) {
                return new C20112a(c1780l0);
            }
            throw new IllegalArgumentException("Unknown ViewModel class: " + cls.getName());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: hq.a$l */
    /* loaded from: classes4.dex */
    public static final class l extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f99007t;

        l(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new l(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f99007t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C19086f c19086f = new C19086f(null, 1, null);
                C19086f.a aVar = new C19086f.a(C20112a.this.m104632l0(), C20112a.this.m104631k0(), 1, null);
                this.f99007t = 1;
                if (c19086f.m101507a(aVar, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((l) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: hq.a$m */
    /* loaded from: classes4.dex */
    static final class m extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final m f99009q = new m();

        m() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C25455g mo12V4() {
            return new C25455g(null, null, 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: hq.a$n */
    /* loaded from: classes4.dex */
    public static final class n extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: A */
        final /* synthetic */ C31890dc f99010A;

        /* renamed from: B */
        final /* synthetic */ TrackingSource f99011B;

        /* renamed from: C */
        final /* synthetic */ boolean f99012C;

        /* renamed from: D */
        final /* synthetic */ C3000l0 f99013D;

        /* renamed from: E */
        final /* synthetic */ boolean f99014E;

        /* renamed from: F */
        final /* synthetic */ String f99015F;

        /* renamed from: G */
        final /* synthetic */ C20112a f99016G;

        /* renamed from: t */
        int f99017t;

        /* renamed from: u */
        final /* synthetic */ String f99018u;

        /* renamed from: v */
        final /* synthetic */ LinkAttachment f99019v;

        /* renamed from: w */
        final /* synthetic */ C3023p3 f99020w;

        /* renamed from: x */
        final /* synthetic */ C3003l3 f99021x;

        /* renamed from: y */
        final /* synthetic */ C3063z0 f99022y;

        /* renamed from: z */
        final /* synthetic */ PrivacyInfo f99023z;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: hq.a$n$a */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            final /* synthetic */ C20112a f99024q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C20112a c20112a) {
                super(1);
                this.f99024q = c20112a;
            }

            /* renamed from: a */
            public final void m104683a(C3000l0 c3000l0) {
                AbstractC19074t.m100208f(c3000l0, "newFeedContent");
                this.f99024q.m104586N0(c3000l0);
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: i9 */
            public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                m104683a((C3000l0) obj);
                return C24848g0.f119245a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: hq.a$n$b */
        /* loaded from: classes4.dex */
        public static final class b implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ C20112a f99025p;

            /* renamed from: hq.a$n$b$a */
            /* loaded from: classes4.dex */
            public /* synthetic */ class a {

                /* renamed from: a */
                public static final /* synthetic */ int[] f99026a;

                static {
                    int[] iArr = new int[EnumC28361d.values().length];
                    try {
                        iArr[EnumC28361d.f132142q.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    f99026a = iArr;
                }
            }

            b(C20112a c20112a) {
                this.f99025p = c20112a;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo12109b(AbstractC28358a abstractC28358a, Continuation continuation) {
                EnumC28361d enumC28361d;
                if (abstractC28358a != null) {
                    enumC28361d = abstractC28358a.m142806a();
                } else {
                    enumC28361d = null;
                }
                if (enumC28361d != null && a.f99026a[enumC28361d.ordinal()] == 1) {
                    this.f99025p.m104630j0().mo9224q(new C19964c(new i()));
                    AbstractC19074t.m100206d(abstractC28358a, "null cannot be cast to non-null type com.zing.zalo.feed.mvp.feed.domain.usecase.uploadfeed.BaseFlowProcessFeedResponse.Error");
                    Exception m142807b = ((AbstractC28358a.b) abstractC28358a).m142807b();
                    if (m142807b != null) {
                        m142807b.printStackTrace();
                    }
                }
                return C24848g0.f119245a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(String str, LinkAttachment linkAttachment, C3023p3 c3023p3, C3003l3 c3003l3, C3063z0 c3063z0, PrivacyInfo privacyInfo, C31890dc c31890dc, TrackingSource trackingSource, boolean z11, C3000l0 c3000l0, boolean z12, String str2, C20112a c20112a, Continuation continuation) {
            super(2, continuation);
            this.f99018u = str;
            this.f99019v = linkAttachment;
            this.f99020w = c3023p3;
            this.f99021x = c3003l3;
            this.f99022y = c3063z0;
            this.f99023z = privacyInfo;
            this.f99010A = c31890dc;
            this.f99011B = trackingSource;
            this.f99012C = z11;
            this.f99013D = c3000l0;
            this.f99014E = z12;
            this.f99015F = str2;
            this.f99016G = c20112a;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new n(this.f99018u, this.f99019v, this.f99020w, this.f99021x, this.f99022y, this.f99023z, this.f99010A, this.f99011B, this.f99012C, this.f99013D, this.f99014E, this.f99015F, this.f99016G, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            Object m101498a;
            Object obj2;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f99017t;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        AbstractC24862s.m129228b(obj);
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
                obj2 = m142578e;
                m101498a = obj;
            } else {
                AbstractC24862s.m129228b(obj);
                C26343a c26343a = new C26343a();
                C26343a.a aVar = new C26343a.a(this.f99018u, this.f99019v, this.f99020w, this.f99021x, this.f99022y, this.f99023z, this.f99010A, this.f99011B, this.f99012C, this.f99013D, this.f99014E, this.f99015F, new a(this.f99016G));
                this.f99017t = 1;
                m101498a = c26343a.m101498a(aVar, this);
                obj2 = m142578e;
                if (m101498a == obj2) {
                    return obj2;
                }
            }
            Flow flow = (Flow) m101498a;
            if (flow != null) {
                b bVar = new b(this.f99016G);
                this.f99017t = 2;
                if (flow.mo97893a(bVar, this) == obj2) {
                    return obj2;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((n) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: hq.a$o */
    /* loaded from: classes4.dex */
    public static final class o extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: A */
        final /* synthetic */ PrivacyInfo f99027A;

        /* renamed from: B */
        final /* synthetic */ int f99028B;

        /* renamed from: C */
        final /* synthetic */ double f99029C;

        /* renamed from: D */
        final /* synthetic */ TrackingSource f99030D;

        /* renamed from: E */
        final /* synthetic */ boolean f99031E;

        /* renamed from: F */
        final /* synthetic */ C3000l0 f99032F;

        /* renamed from: G */
        final /* synthetic */ boolean f99033G;

        /* renamed from: H */
        final /* synthetic */ String f99034H;

        /* renamed from: I */
        final /* synthetic */ C20112a f99035I;

        /* renamed from: t */
        int f99036t;

        /* renamed from: u */
        final /* synthetic */ String f99037u;

        /* renamed from: v */
        final /* synthetic */ String f99038v;

        /* renamed from: w */
        final /* synthetic */ int f99039w;

        /* renamed from: x */
        final /* synthetic */ C17244x0 f99040x;

        /* renamed from: y */
        final /* synthetic */ C3003l3 f99041y;

        /* renamed from: z */
        final /* synthetic */ C3063z0 f99042z;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: hq.a$o$a */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            final /* synthetic */ C20112a f99043q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C20112a c20112a) {
                super(1);
                this.f99043q = c20112a;
            }

            /* renamed from: a */
            public final void m104686a(C3000l0 c3000l0) {
                AbstractC19074t.m100208f(c3000l0, "newFeedContent");
                this.f99043q.m104586N0(c3000l0);
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: i9 */
            public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                m104686a((C3000l0) obj);
                return C24848g0.f119245a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: hq.a$o$b */
        /* loaded from: classes4.dex */
        public static final class b implements FlowCollector {

            /* renamed from: p */
            public static final b f99044p = new b();

            /* renamed from: hq.a$o$b$a */
            /* loaded from: classes4.dex */
            public /* synthetic */ class a {

                /* renamed from: a */
                public static final /* synthetic */ int[] f99045a;

                static {
                    int[] iArr = new int[EnumC28361d.values().length];
                    try {
                        iArr[EnumC28361d.f132142q.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    f99045a = iArr;
                }
            }

            b() {
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo12109b(AbstractC28358a abstractC28358a, Continuation continuation) {
                EnumC28361d enumC28361d;
                if (abstractC28358a != null) {
                    enumC28361d = abstractC28358a.m142806a();
                } else {
                    enumC28361d = null;
                }
                if (enumC28361d != null && a.f99045a[enumC28361d.ordinal()] == 1) {
                    AbstractC19074t.m100206d(abstractC28358a, "null cannot be cast to non-null type com.zing.zalo.feed.mvp.feed.domain.usecase.uploadfeed.BaseFlowProcessFeedResponse.Error");
                    Exception m142807b = ((AbstractC28358a.b) abstractC28358a).m142807b();
                    if (m142807b != null) {
                        m142807b.printStackTrace();
                    }
                }
                return C24848g0.f119245a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(String str, String str2, int i11, C17244x0 c17244x0, C3003l3 c3003l3, C3063z0 c3063z0, PrivacyInfo privacyInfo, int i12, double d11, TrackingSource trackingSource, boolean z11, C3000l0 c3000l0, boolean z12, String str3, C20112a c20112a, Continuation continuation) {
            super(2, continuation);
            this.f99037u = str;
            this.f99038v = str2;
            this.f99039w = i11;
            this.f99040x = c17244x0;
            this.f99041y = c3003l3;
            this.f99042z = c3063z0;
            this.f99027A = privacyInfo;
            this.f99028B = i12;
            this.f99029C = d11;
            this.f99030D = trackingSource;
            this.f99031E = z11;
            this.f99032F = c3000l0;
            this.f99033G = z12;
            this.f99034H = str3;
            this.f99035I = c20112a;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new o(this.f99037u, this.f99038v, this.f99039w, this.f99040x, this.f99041y, this.f99042z, this.f99027A, this.f99028B, this.f99029C, this.f99030D, this.f99031E, this.f99032F, this.f99033G, this.f99034H, this.f99035I, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            Object m101498a;
            Object obj2;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f99036t;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        AbstractC24862s.m129228b(obj);
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
                obj2 = m142578e;
                m101498a = obj;
            } else {
                AbstractC24862s.m129228b(obj);
                C26344b c26344b = new C26344b();
                C26344b.a aVar = new C26344b.a(this.f99037u, this.f99038v, this.f99039w, this.f99040x, this.f99041y, this.f99042z, this.f99027A, this.f99028B, this.f99029C, this.f99030D, this.f99031E, this.f99032F, this.f99033G, this.f99034H, new a(this.f99035I));
                this.f99036t = 1;
                m101498a = c26344b.m101498a(aVar, this);
                obj2 = m142578e;
                if (m101498a == obj2) {
                    return obj2;
                }
            }
            Flow flow = (Flow) m101498a;
            if (flow != null) {
                b bVar = b.f99044p;
                this.f99036t = 2;
                if (flow.mo97893a(bVar, this) == obj2) {
                    return obj2;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((o) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: hq.a$p */
    /* loaded from: classes4.dex */
    public static final class p extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: A */
        final /* synthetic */ C31890dc f99046A;

        /* renamed from: B */
        final /* synthetic */ TrackingSource f99047B;

        /* renamed from: C */
        final /* synthetic */ long f99048C;

        /* renamed from: D */
        final /* synthetic */ C2949b f99049D;

        /* renamed from: E */
        final /* synthetic */ SongInfo f99050E;

        /* renamed from: F */
        final /* synthetic */ boolean f99051F;

        /* renamed from: G */
        final /* synthetic */ C3000l0 f99052G;

        /* renamed from: H */
        final /* synthetic */ boolean f99053H;

        /* renamed from: I */
        final /* synthetic */ String f99054I;

        /* renamed from: J */
        final /* synthetic */ C18049e f99055J;

        /* renamed from: K */
        final /* synthetic */ C20112a f99056K;

        /* renamed from: t */
        int f99057t;

        /* renamed from: u */
        final /* synthetic */ String f99058u;

        /* renamed from: v */
        final /* synthetic */ ArrayList f99059v;

        /* renamed from: w */
        final /* synthetic */ boolean f99060w;

        /* renamed from: x */
        final /* synthetic */ C3003l3 f99061x;

        /* renamed from: y */
        final /* synthetic */ C3063z0 f99062y;

        /* renamed from: z */
        final /* synthetic */ PrivacyInfo f99063z;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: hq.a$p$a */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            final /* synthetic */ C20112a f99064q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C20112a c20112a) {
                super(1);
                this.f99064q = c20112a;
            }

            /* renamed from: a */
            public final void m104689a(C3000l0 c3000l0) {
                AbstractC19074t.m100208f(c3000l0, "newFeedContent");
                this.f99064q.m104586N0(c3000l0);
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: i9 */
            public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                m104689a((C3000l0) obj);
                return C24848g0.f119245a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: hq.a$p$b */
        /* loaded from: classes4.dex */
        public static final class b implements FlowCollector {

            /* renamed from: p */
            public static final b f99065p = new b();

            /* renamed from: hq.a$p$b$a */
            /* loaded from: classes4.dex */
            public /* synthetic */ class a {

                /* renamed from: a */
                public static final /* synthetic */ int[] f99066a;

                static {
                    int[] iArr = new int[EnumC28361d.values().length];
                    try {
                        iArr[EnumC28361d.f132142q.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    f99066a = iArr;
                }
            }

            b() {
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo12109b(AbstractC28358a abstractC28358a, Continuation continuation) {
                if (a.f99066a[abstractC28358a.m142806a().ordinal()] == 1) {
                    AbstractC19074t.m100206d(abstractC28358a, "null cannot be cast to non-null type com.zing.zalo.feed.mvp.feed.domain.usecase.uploadfeed.BaseFlowProcessFeedResponse.Error");
                    Exception m142807b = ((AbstractC28358a.b) abstractC28358a).m142807b();
                    if (m142807b != null) {
                        m142807b.printStackTrace();
                    }
                }
                return C24848g0.f119245a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(String str, ArrayList arrayList, boolean z11, C3003l3 c3003l3, C3063z0 c3063z0, PrivacyInfo privacyInfo, C31890dc c31890dc, TrackingSource trackingSource, long j11, C2949b c2949b, SongInfo songInfo, boolean z12, C3000l0 c3000l0, boolean z13, String str2, C18049e c18049e, C20112a c20112a, Continuation continuation) {
            super(2, continuation);
            this.f99058u = str;
            this.f99059v = arrayList;
            this.f99060w = z11;
            this.f99061x = c3003l3;
            this.f99062y = c3063z0;
            this.f99063z = privacyInfo;
            this.f99046A = c31890dc;
            this.f99047B = trackingSource;
            this.f99048C = j11;
            this.f99049D = c2949b;
            this.f99050E = songInfo;
            this.f99051F = z12;
            this.f99052G = c3000l0;
            this.f99053H = z13;
            this.f99054I = str2;
            this.f99055J = c18049e;
            this.f99056K = c20112a;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new p(this.f99058u, this.f99059v, this.f99060w, this.f99061x, this.f99062y, this.f99063z, this.f99046A, this.f99047B, this.f99048C, this.f99049D, this.f99050E, this.f99051F, this.f99052G, this.f99053H, this.f99054I, this.f99055J, this.f99056K, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            Object m101498a;
            Object obj2;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f99057t;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        AbstractC24862s.m129228b(obj);
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
                obj2 = m142578e;
                m101498a = obj;
            } else {
                AbstractC24862s.m129228b(obj);
                C26345c c26345c = new C26345c();
                C26345c.a aVar = new C26345c.a(this.f99058u, this.f99059v, this.f99060w, this.f99061x, this.f99062y, this.f99063z, this.f99046A, this.f99047B, this.f99048C, this.f99049D, this.f99050E, this.f99051F, this.f99052G, this.f99053H, this.f99054I, this.f99055J, new a(this.f99056K));
                this.f99057t = 1;
                m101498a = c26345c.m101498a(aVar, this);
                obj2 = m142578e;
                if (m101498a == obj2) {
                    return obj2;
                }
            }
            Flow flow = (Flow) m101498a;
            if (flow != null) {
                b bVar = b.f99065p;
                this.f99057t = 2;
                if (flow.mo97893a(bVar, this) == obj2) {
                    return obj2;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((p) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: hq.a$q */
    /* loaded from: classes4.dex */
    public static final class q extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: A */
        final /* synthetic */ TrackingSource f99067A;

        /* renamed from: B */
        final /* synthetic */ long f99068B;

        /* renamed from: C */
        final /* synthetic */ C2949b f99069C;

        /* renamed from: D */
        final /* synthetic */ SongInfo f99070D;

        /* renamed from: E */
        final /* synthetic */ boolean f99071E;

        /* renamed from: F */
        final /* synthetic */ C3000l0 f99072F;

        /* renamed from: G */
        final /* synthetic */ boolean f99073G;

        /* renamed from: H */
        final /* synthetic */ String f99074H;

        /* renamed from: I */
        final /* synthetic */ C20112a f99075I;

        /* renamed from: t */
        int f99076t;

        /* renamed from: u */
        final /* synthetic */ String f99077u;

        /* renamed from: v */
        final /* synthetic */ MediaItem f99078v;

        /* renamed from: w */
        final /* synthetic */ C3003l3 f99079w;

        /* renamed from: x */
        final /* synthetic */ C3063z0 f99080x;

        /* renamed from: y */
        final /* synthetic */ PrivacyInfo f99081y;

        /* renamed from: z */
        final /* synthetic */ C31890dc f99082z;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: hq.a$q$a */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            final /* synthetic */ C20112a f99083q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C20112a c20112a) {
                super(1);
                this.f99083q = c20112a;
            }

            /* renamed from: a */
            public final void m104692a(C3000l0 c3000l0) {
                AbstractC19074t.m100208f(c3000l0, "newFeedContent");
                this.f99083q.m104586N0(c3000l0);
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: i9 */
            public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                m104692a((C3000l0) obj);
                return C24848g0.f119245a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: hq.a$q$b */
        /* loaded from: classes4.dex */
        public static final class b implements FlowCollector {

            /* renamed from: p */
            public static final b f99084p = new b();

            /* renamed from: hq.a$q$b$a */
            /* loaded from: classes4.dex */
            public /* synthetic */ class a {

                /* renamed from: a */
                public static final /* synthetic */ int[] f99085a;

                static {
                    int[] iArr = new int[EnumC28361d.values().length];
                    try {
                        iArr[EnumC28361d.f132142q.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    f99085a = iArr;
                }
            }

            b() {
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo12109b(AbstractC28358a abstractC28358a, Continuation continuation) {
                if (a.f99085a[abstractC28358a.m142806a().ordinal()] == 1) {
                    AbstractC19074t.m100206d(abstractC28358a, "null cannot be cast to non-null type com.zing.zalo.feed.mvp.feed.domain.usecase.uploadfeed.BaseFlowProcessFeedResponse.Error");
                    Exception m142807b = ((AbstractC28358a.b) abstractC28358a).m142807b();
                    if (m142807b != null) {
                        m142807b.printStackTrace();
                    }
                }
                return C24848g0.f119245a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(String str, MediaItem mediaItem, C3003l3 c3003l3, C3063z0 c3063z0, PrivacyInfo privacyInfo, C31890dc c31890dc, TrackingSource trackingSource, long j11, C2949b c2949b, SongInfo songInfo, boolean z11, C3000l0 c3000l0, boolean z12, String str2, C20112a c20112a, Continuation continuation) {
            super(2, continuation);
            this.f99077u = str;
            this.f99078v = mediaItem;
            this.f99079w = c3003l3;
            this.f99080x = c3063z0;
            this.f99081y = privacyInfo;
            this.f99082z = c31890dc;
            this.f99067A = trackingSource;
            this.f99068B = j11;
            this.f99069C = c2949b;
            this.f99070D = songInfo;
            this.f99071E = z11;
            this.f99072F = c3000l0;
            this.f99073G = z12;
            this.f99074H = str2;
            this.f99075I = c20112a;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new q(this.f99077u, this.f99078v, this.f99079w, this.f99080x, this.f99081y, this.f99082z, this.f99067A, this.f99068B, this.f99069C, this.f99070D, this.f99071E, this.f99072F, this.f99073G, this.f99074H, this.f99075I, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            Object m101498a;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f99076t;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        AbstractC24862s.m129228b(obj);
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
                m101498a = obj;
            } else {
                AbstractC24862s.m129228b(obj);
                C26346d c26346d = new C26346d();
                C26346d.a aVar = new C26346d.a(this.f99077u, this.f99078v, this.f99079w, this.f99080x, this.f99081y, this.f99082z, this.f99067A, this.f99068B, this.f99069C, this.f99070D, this.f99071E, this.f99072F, this.f99073G, this.f99074H, new a(this.f99075I));
                this.f99076t = 1;
                m101498a = c26346d.m101498a(aVar, this);
                if (m101498a == m142578e) {
                    return m142578e;
                }
            }
            Flow flow = (Flow) m101498a;
            if (flow != null) {
                b bVar = b.f99084p;
                this.f99076t = 2;
                if (flow.mo97893a(bVar, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((q) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: hq.a$r */
    /* loaded from: classes4.dex */
    public static final class r extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: A */
        final /* synthetic */ TrackingSource f99086A;

        /* renamed from: B */
        final /* synthetic */ boolean f99087B;

        /* renamed from: C */
        final /* synthetic */ C3000l0 f99088C;

        /* renamed from: D */
        final /* synthetic */ boolean f99089D;

        /* renamed from: E */
        final /* synthetic */ String f99090E;

        /* renamed from: F */
        final /* synthetic */ C20112a f99091F;

        /* renamed from: t */
        int f99092t;

        /* renamed from: u */
        final /* synthetic */ String f99093u;

        /* renamed from: v */
        final /* synthetic */ C25630b f99094v;

        /* renamed from: w */
        final /* synthetic */ C3003l3 f99095w;

        /* renamed from: x */
        final /* synthetic */ C3063z0 f99096x;

        /* renamed from: y */
        final /* synthetic */ PrivacyInfo f99097y;

        /* renamed from: z */
        final /* synthetic */ C31890dc f99098z;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: hq.a$r$a */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            final /* synthetic */ C20112a f99099q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C20112a c20112a) {
                super(1);
                this.f99099q = c20112a;
            }

            /* renamed from: a */
            public final void m104695a(C3000l0 c3000l0) {
                AbstractC19074t.m100208f(c3000l0, "newFeedContent");
                this.f99099q.m104586N0(c3000l0);
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: i9 */
            public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                m104695a((C3000l0) obj);
                return C24848g0.f119245a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: hq.a$r$b */
        /* loaded from: classes4.dex */
        public static final class b implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ C20112a f99100p;

            /* renamed from: hq.a$r$b$a */
            /* loaded from: classes4.dex */
            public /* synthetic */ class a {

                /* renamed from: a */
                public static final /* synthetic */ int[] f99101a;

                static {
                    int[] iArr = new int[EnumC28361d.values().length];
                    try {
                        iArr[EnumC28361d.f132142q.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[EnumC28361d.f132144s.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    f99101a = iArr;
                }
            }

            b(C20112a c20112a) {
                this.f99100p = c20112a;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo12109b(AbstractC28358a abstractC28358a, Continuation continuation) {
                EnumC28361d enumC28361d;
                int i11;
                if (abstractC28358a != null) {
                    enumC28361d = abstractC28358a.m142806a();
                } else {
                    enumC28361d = null;
                }
                if (enumC28361d == null) {
                    i11 = -1;
                } else {
                    i11 = a.f99101a[enumC28361d.ordinal()];
                }
                if (i11 != 1) {
                    if (i11 == 2) {
                        this.f99100p.m104630j0().mo9224q(new C19964c(new d()));
                    }
                } else {
                    this.f99100p.m104630j0().mo9224q(new C19964c(new i()));
                    AbstractC19074t.m100206d(abstractC28358a, "null cannot be cast to non-null type com.zing.zalo.feed.mvp.feed.domain.usecase.uploadfeed.BaseFlowProcessFeedResponse.Error");
                    Exception m142807b = ((AbstractC28358a.b) abstractC28358a).m142807b();
                    if (m142807b != null) {
                        m142807b.printStackTrace();
                    }
                }
                return C24848g0.f119245a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(String str, C25630b c25630b, C3003l3 c3003l3, C3063z0 c3063z0, PrivacyInfo privacyInfo, C31890dc c31890dc, TrackingSource trackingSource, boolean z11, C3000l0 c3000l0, boolean z12, String str2, C20112a c20112a, Continuation continuation) {
            super(2, continuation);
            this.f99093u = str;
            this.f99094v = c25630b;
            this.f99095w = c3003l3;
            this.f99096x = c3063z0;
            this.f99097y = privacyInfo;
            this.f99098z = c31890dc;
            this.f99086A = trackingSource;
            this.f99087B = z11;
            this.f99088C = c3000l0;
            this.f99089D = z12;
            this.f99090E = str2;
            this.f99091F = c20112a;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new r(this.f99093u, this.f99094v, this.f99095w, this.f99096x, this.f99097y, this.f99098z, this.f99086A, this.f99087B, this.f99088C, this.f99089D, this.f99090E, this.f99091F, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            Object m101498a;
            Object obj2;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f99092t;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        AbstractC24862s.m129228b(obj);
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
                obj2 = m142578e;
                m101498a = obj;
            } else {
                AbstractC24862s.m129228b(obj);
                C26347e c26347e = new C26347e();
                C26347e.a aVar = new C26347e.a(this.f99093u, this.f99094v, this.f99095w, this.f99096x, this.f99097y, this.f99098z, this.f99086A, this.f99087B, this.f99088C, this.f99089D, this.f99090E, new a(this.f99091F));
                this.f99092t = 1;
                m101498a = c26347e.m101498a(aVar, this);
                obj2 = m142578e;
                if (m101498a == obj2) {
                    return obj2;
                }
            }
            Flow flow = (Flow) m101498a;
            if (flow != null) {
                b bVar = new b(this.f99091F);
                this.f99092t = 2;
                if (flow.mo97893a(bVar, this) == obj2) {
                    return obj2;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((r) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: hq.a$s */
    /* loaded from: classes4.dex */
    public static final class s extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: A */
        final /* synthetic */ boolean f99102A;

        /* renamed from: B */
        final /* synthetic */ C3000l0 f99103B;

        /* renamed from: C */
        final /* synthetic */ boolean f99104C;

        /* renamed from: D */
        final /* synthetic */ String f99105D;

        /* renamed from: E */
        final /* synthetic */ C20112a f99106E;

        /* renamed from: t */
        int f99107t;

        /* renamed from: u */
        final /* synthetic */ String f99108u;

        /* renamed from: v */
        final /* synthetic */ C3003l3 f99109v;

        /* renamed from: w */
        final /* synthetic */ C3063z0 f99110w;

        /* renamed from: x */
        final /* synthetic */ PrivacyInfo f99111x;

        /* renamed from: y */
        final /* synthetic */ C31890dc f99112y;

        /* renamed from: z */
        final /* synthetic */ TrackingSource f99113z;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: hq.a$s$a */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            final /* synthetic */ C20112a f99114q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C20112a c20112a) {
                super(1);
                this.f99114q = c20112a;
            }

            /* renamed from: a */
            public final void m104698a(C3000l0 c3000l0) {
                AbstractC19074t.m100208f(c3000l0, "newFeedContent");
                this.f99114q.m104586N0(c3000l0);
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: i9 */
            public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                m104698a((C3000l0) obj);
                return C24848g0.f119245a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: hq.a$s$b */
        /* loaded from: classes4.dex */
        public static final class b implements FlowCollector {

            /* renamed from: p */
            public static final b f99115p = new b();

            /* renamed from: hq.a$s$b$a */
            /* loaded from: classes4.dex */
            public /* synthetic */ class a {

                /* renamed from: a */
                public static final /* synthetic */ int[] f99116a;

                static {
                    int[] iArr = new int[EnumC28361d.values().length];
                    try {
                        iArr[EnumC28361d.f132142q.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    f99116a = iArr;
                }
            }

            b() {
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo12109b(AbstractC28358a abstractC28358a, Continuation continuation) {
                EnumC28361d enumC28361d;
                if (abstractC28358a != null) {
                    enumC28361d = abstractC28358a.m142806a();
                } else {
                    enumC28361d = null;
                }
                if (enumC28361d != null && a.f99116a[enumC28361d.ordinal()] == 1) {
                    AbstractC19074t.m100206d(abstractC28358a, "null cannot be cast to non-null type com.zing.zalo.feed.mvp.feed.domain.usecase.uploadfeed.BaseFlowProcessFeedResponse.Error");
                    Exception m142807b = ((AbstractC28358a.b) abstractC28358a).m142807b();
                    if (m142807b != null) {
                        m142807b.printStackTrace();
                    }
                }
                return C24848g0.f119245a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(String str, C3003l3 c3003l3, C3063z0 c3063z0, PrivacyInfo privacyInfo, C31890dc c31890dc, TrackingSource trackingSource, boolean z11, C3000l0 c3000l0, boolean z12, String str2, C20112a c20112a, Continuation continuation) {
            super(2, continuation);
            this.f99108u = str;
            this.f99109v = c3003l3;
            this.f99110w = c3063z0;
            this.f99111x = privacyInfo;
            this.f99112y = c31890dc;
            this.f99113z = trackingSource;
            this.f99102A = z11;
            this.f99103B = c3000l0;
            this.f99104C = z12;
            this.f99105D = str2;
            this.f99106E = c20112a;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new s(this.f99108u, this.f99109v, this.f99110w, this.f99111x, this.f99112y, this.f99113z, this.f99102A, this.f99103B, this.f99104C, this.f99105D, this.f99106E, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            Object m101498a;
            Object obj2;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f99107t;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        AbstractC24862s.m129228b(obj);
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
                obj2 = m142578e;
                m101498a = obj;
            } else {
                AbstractC24862s.m129228b(obj);
                C26348f c26348f = new C26348f();
                C26348f.a aVar = new C26348f.a(this.f99108u, this.f99109v, this.f99110w, this.f99111x, this.f99112y, this.f99113z, this.f99102A, this.f99103B, this.f99104C, this.f99105D, new a(this.f99106E));
                this.f99107t = 1;
                m101498a = c26348f.m101498a(aVar, this);
                obj2 = m142578e;
                if (m101498a == obj2) {
                    return obj2;
                }
            }
            Flow flow = (Flow) m101498a;
            if (flow != null) {
                b bVar = b.f99115p;
                this.f99107t = 2;
                if (flow.mo97893a(bVar, this) == obj2) {
                    return obj2;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((s) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: hq.a$t */
    /* loaded from: classes4.dex */
    public static final class t extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: A */
        final /* synthetic */ C31890dc f99117A;

        /* renamed from: B */
        final /* synthetic */ TrackingSource f99118B;

        /* renamed from: C */
        final /* synthetic */ ProfilePreviewAlbumItem f99119C;

        /* renamed from: D */
        final /* synthetic */ boolean f99120D;

        /* renamed from: E */
        final /* synthetic */ C3000l0 f99121E;

        /* renamed from: F */
        final /* synthetic */ boolean f99122F;

        /* renamed from: G */
        final /* synthetic */ String f99123G;

        /* renamed from: H */
        final /* synthetic */ C20112a f99124H;

        /* renamed from: t */
        int f99125t;

        /* renamed from: u */
        final /* synthetic */ String f99126u;

        /* renamed from: v */
        final /* synthetic */ C27373c f99127v;

        /* renamed from: w */
        final /* synthetic */ C3003l3 f99128w;

        /* renamed from: x */
        final /* synthetic */ C3063z0 f99129x;

        /* renamed from: y */
        final /* synthetic */ PrivacyInfo f99130y;

        /* renamed from: z */
        final /* synthetic */ String f99131z;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: hq.a$t$a */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            final /* synthetic */ C20112a f99132q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C20112a c20112a) {
                super(1);
                this.f99132q = c20112a;
            }

            /* renamed from: a */
            public final void m104701a(C3000l0 c3000l0) {
                AbstractC19074t.m100208f(c3000l0, "newFeedContent");
                this.f99132q.m104586N0(c3000l0);
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: i9 */
            public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                m104701a((C3000l0) obj);
                return C24848g0.f119245a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: hq.a$t$b */
        /* loaded from: classes4.dex */
        public static final class b implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ C20112a f99133p;

            /* renamed from: hq.a$t$b$a */
            /* loaded from: classes4.dex */
            public /* synthetic */ class a {

                /* renamed from: a */
                public static final /* synthetic */ int[] f99134a;

                static {
                    int[] iArr = new int[EnumC28361d.values().length];
                    try {
                        iArr[EnumC28361d.f132142q.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[EnumC28361d.f132144s.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    f99134a = iArr;
                }
            }

            b(C20112a c20112a) {
                this.f99133p = c20112a;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo12109b(AbstractC28358a abstractC28358a, Continuation continuation) {
                EnumC28361d enumC28361d;
                int i11;
                if (abstractC28358a != null) {
                    enumC28361d = abstractC28358a.m142806a();
                } else {
                    enumC28361d = null;
                }
                if (enumC28361d == null) {
                    i11 = -1;
                } else {
                    i11 = a.f99134a[enumC28361d.ordinal()];
                }
                if (i11 != 1) {
                    if (i11 == 2) {
                        this.f99133p.m104630j0().mo9224q(new C19964c(new i()));
                    }
                } else {
                    AbstractC19074t.m100206d(abstractC28358a, "null cannot be cast to non-null type com.zing.zalo.feed.mvp.feed.domain.usecase.uploadfeed.BaseFlowProcessFeedResponse.Error");
                    Exception m142807b = ((AbstractC28358a.b) abstractC28358a).m142807b();
                    if (m142807b != null) {
                        m142807b.printStackTrace();
                    }
                }
                return C24848g0.f119245a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        t(String str, C27373c c27373c, C3003l3 c3003l3, C3063z0 c3063z0, PrivacyInfo privacyInfo, String str2, C31890dc c31890dc, TrackingSource trackingSource, ProfilePreviewAlbumItem profilePreviewAlbumItem, boolean z11, C3000l0 c3000l0, boolean z12, String str3, C20112a c20112a, Continuation continuation) {
            super(2, continuation);
            this.f99126u = str;
            this.f99127v = c27373c;
            this.f99128w = c3003l3;
            this.f99129x = c3063z0;
            this.f99130y = privacyInfo;
            this.f99131z = str2;
            this.f99117A = c31890dc;
            this.f99118B = trackingSource;
            this.f99119C = profilePreviewAlbumItem;
            this.f99120D = z11;
            this.f99121E = c3000l0;
            this.f99122F = z12;
            this.f99123G = str3;
            this.f99124H = c20112a;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new t(this.f99126u, this.f99127v, this.f99128w, this.f99129x, this.f99130y, this.f99131z, this.f99117A, this.f99118B, this.f99119C, this.f99120D, this.f99121E, this.f99122F, this.f99123G, this.f99124H, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            Object m101498a;
            Object obj2;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f99125t;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        AbstractC24862s.m129228b(obj);
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
                obj2 = m142578e;
                m101498a = obj;
            } else {
                AbstractC24862s.m129228b(obj);
                C26349g c26349g = new C26349g();
                C26349g.a aVar = new C26349g.a(this.f99126u, this.f99127v, this.f99128w, this.f99129x, this.f99130y, this.f99131z, this.f99117A, this.f99118B, this.f99119C, this.f99120D, this.f99121E, this.f99122F, this.f99123G, new a(this.f99124H));
                this.f99125t = 1;
                m101498a = c26349g.m101498a(aVar, this);
                obj2 = m142578e;
                if (m101498a == obj2) {
                    return obj2;
                }
            }
            Flow flow = (Flow) m101498a;
            if (flow != null) {
                b bVar = new b(this.f99124H);
                this.f99125t = 2;
                if (flow.mo97893a(bVar, this) == obj2) {
                    return obj2;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((t) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: hq.a$u */
    /* loaded from: classes4.dex */
    public static final class u extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f99135t;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: hq.a$u$a */
        /* loaded from: classes4.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ C20112a f99137p;

            a(C20112a c20112a) {
                this.f99137p = c20112a;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo12109b(C25413i.a aVar, Continuation continuation) {
                String m131655a;
                if (aVar != null && aVar.m131656b() && (m131655a = aVar.m131655a()) != null && m131655a.length() != 0) {
                    this.f99137p.m104630j0().mo9224q(new C19964c(new f(aVar.m131655a())));
                }
                return C24848g0.f119245a;
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
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f99135t;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        AbstractC24862s.m129228b(obj);
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                C25413i c25413i = new C25413i();
                this.f99135t = 1;
                obj = c25413i.m101503a(this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            Flow flow = (Flow) obj;
            if (flow != null) {
                a aVar = new a(C20112a.this);
                this.f99135t = 2;
                if (flow.mo97893a(aVar, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((u) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: hq.a$v */
    /* loaded from: classes4.dex */
    public static final class v implements C25455g.a {
        v() {
        }

        @Override // p456qp.C25455g.a
        /* renamed from: a */
        public void mo104705a(C24903f c24903f) {
            AbstractC19074t.m100208f(c24903f, "streaming");
            C20112a.this.m104582L0(c24903f.m129502e());
        }

        @Override // p456qp.C25455g.a
        /* renamed from: b */
        public void mo104706b(C24898a c24898a) {
            Object m131207g0;
            Object m131207g02;
            AbstractC19074t.m100208f(c24898a, "lyric");
            C20112a.this.m104615S0(true);
            if (!C20112a.this.m104627g0().m45166k()) {
                C20112a c20112a = C20112a.this;
                m131207g0 = AbstractC25332a0.m131207g0(c24898a.m129468d(), 0);
                m131207g02 = AbstractC25332a0.m131207g0(c24898a.m129468d(), 1);
                c20112a.m104616T0(new LyricRender(null, (Sentence) m131207g0, (Sentence) m131207g02, false, false, 25, null));
            }
        }

        @Override // p456qp.C25455g.a
        /* renamed from: c */
        public void mo104707c(Exception exc) {
            AbstractC19074t.m100208f(exc, "exception");
            if (AbstractC19074t.m100204b(exc, ExceptionMusicLoadInfo.f46310p)) {
                C1761c0 m104630j0 = C20112a.this.m104630j0();
                String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_profile_music_no_longer_exist);
                AbstractC19074t.m100207e(m118743r0, "getString(...)");
                m104630j0.mo9224q(new C19964c(new g(m118743r0)));
                C1761c0 m104630j02 = C20112a.this.m104630j0();
                String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_story_music_error_song_not_found);
                AbstractC19074t.m100207e(m118743r02, "getString(...)");
                m104630j02.mo9224q(new C19964c(new h(m118743r02, AbstractC16803z.ic_story_music_error_general)));
                return;
            }
            if (AbstractC19074t.m100204b(exc, ExceptionNoNetwork.f46313p)) {
                C1761c0 m104630j03 = C20112a.this.m104630j0();
                String m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.NETWORK_ERROR_MSG);
                AbstractC19074t.m100207e(m118743r03, "getString(...)");
                m104630j03.mo9224q(new C19964c(new g(m118743r03)));
                C1761c0 m104630j04 = C20112a.this.m104630j0();
                String m118743r04 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_story_music_error_no_network);
                AbstractC19074t.m100207e(m118743r04, "getString(...)");
                m104630j04.mo9224q(new C19964c(new h(m118743r04, AbstractC16803z.ic_story_music_error_network)));
                return;
            }
            if (AbstractC19074t.m100204b(exc, ExceptionFetchMusicUnknown.f46307p)) {
                C1761c0 m104630j05 = C20112a.this.m104630j0();
                String m118743r05 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_profile_music_error_msg);
                AbstractC19074t.m100207e(m118743r05, "getString(...)");
                m104630j05.mo9224q(new C19964c(new g(m118743r05)));
                C1761c0 m104630j06 = C20112a.this.m104630j0();
                String m118743r06 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_story_music_error_song_load_failed);
                AbstractC19074t.m100207e(m118743r06, "getString(...)");
                m104630j06.mo9224q(new C19964c(new h(m118743r06, AbstractC16803z.ic_story_music_error_general)));
                return;
            }
            if (AbstractC19074t.m100204b(exc, ExceptionMusicLocationNotSupported.f46311p)) {
                C1761c0 m104630j07 = C20112a.this.m104630j0();
                String m118743r07 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_social_music_location_not_supported_description);
                AbstractC19074t.m100207e(m118743r07, "getString(...)");
                m104630j07.mo9224q(new C19964c(new e(m118743r07, AbstractC16803z.ic_story_music_error_general)));
            }
        }

        @Override // p456qp.C25455g.a
        /* renamed from: d */
        public void mo104708d(C24902e c24902e) {
            AbstractC19074t.m100208f(c24902e, "song");
            C20112a.this.m104617U0(new SongData(c24902e.m129490f(), c24902e.m129494j(), c24902e.m129492h() + " - " + c24902e.m129487c(), null, null, null, false, 0, false, 376, null));
            C20112a.this.m104613Q0(new ComposeSongStatus(true, new SongInfo(c24902e.m129490f(), c24902e.m129492h(), false, 4, null), new SongData(c24902e.m129490f(), c24902e.m129494j(), c24902e.m129492h() + " - " + c24902e.m129487c(), null, c24902e.m129492h(), c24902e.m129487c(), false, 0, false, 328, null)));
            C20112a.this.m104615S0(c24902e.m129485a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: hq.a$w */
    /* loaded from: classes4.dex */
    public static final class w extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: A */
        final /* synthetic */ C31890dc f99139A;

        /* renamed from: B */
        final /* synthetic */ TrackingSource f99140B;

        /* renamed from: C */
        final /* synthetic */ boolean f99141C;

        /* renamed from: D */
        final /* synthetic */ String f99142D;

        /* renamed from: E */
        final /* synthetic */ C20112a f99143E;

        /* renamed from: t */
        int f99144t;

        /* renamed from: u */
        final /* synthetic */ String f99145u;

        /* renamed from: v */
        final /* synthetic */ LinkAttachment f99146v;

        /* renamed from: w */
        final /* synthetic */ C3023p3 f99147w;

        /* renamed from: x */
        final /* synthetic */ C3003l3 f99148x;

        /* renamed from: y */
        final /* synthetic */ C3063z0 f99149y;

        /* renamed from: z */
        final /* synthetic */ PrivacyInfo f99150z;

        /* renamed from: hq.a$w$a */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC18505l {

            /* renamed from: p */
            final /* synthetic */ C20112a f99151p;

            a(C20112a c20112a) {
                this.f99151p = c20112a;
            }

            /* renamed from: a */
            public void m104710a(C3000l0 c3000l0) {
                AbstractC19074t.m100208f(c3000l0, "feedContent");
                this.f99151p.m104588O0(c3000l0);
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: i9 */
            public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                m104710a((C3000l0) obj);
                return C24848g0.f119245a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: hq.a$w$b */
        /* loaded from: classes4.dex */
        public static final class b implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ C20112a f99152p;

            /* renamed from: hq.a$w$b$a */
            /* loaded from: classes4.dex */
            public /* synthetic */ class a {

                /* renamed from: a */
                public static final /* synthetic */ int[] f99153a;

                static {
                    int[] iArr = new int[EnumC28361d.values().length];
                    try {
                        iArr[EnumC28361d.f132142q.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    f99153a = iArr;
                }
            }

            b(C20112a c20112a) {
                this.f99152p = c20112a;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo12109b(AbstractC28358a abstractC28358a, Continuation continuation) {
                EnumC28361d enumC28361d;
                if (abstractC28358a != null) {
                    enumC28361d = abstractC28358a.m142806a();
                } else {
                    enumC28361d = null;
                }
                if (enumC28361d != null && a.f99153a[enumC28361d.ordinal()] == 1) {
                    this.f99152p.m104630j0().mo9224q(new C19964c(new i()));
                    AbstractC19074t.m100206d(abstractC28358a, "null cannot be cast to non-null type com.zing.zalo.feed.mvp.feed.domain.usecase.uploadfeed.BaseFlowProcessFeedResponse.Error");
                    Exception m142807b = ((AbstractC28358a.b) abstractC28358a).m142807b();
                    if (m142807b != null) {
                        m142807b.printStackTrace();
                    }
                }
                return C24848g0.f119245a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w(String str, LinkAttachment linkAttachment, C3023p3 c3023p3, C3003l3 c3003l3, C3063z0 c3063z0, PrivacyInfo privacyInfo, C31890dc c31890dc, TrackingSource trackingSource, boolean z11, String str2, C20112a c20112a, Continuation continuation) {
            super(2, continuation);
            this.f99145u = str;
            this.f99146v = linkAttachment;
            this.f99147w = c3023p3;
            this.f99148x = c3003l3;
            this.f99149y = c3063z0;
            this.f99150z = privacyInfo;
            this.f99139A = c31890dc;
            this.f99140B = trackingSource;
            this.f99141C = z11;
            this.f99142D = str2;
            this.f99143E = c20112a;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new w(this.f99145u, this.f99146v, this.f99147w, this.f99148x, this.f99149y, this.f99150z, this.f99139A, this.f99140B, this.f99141C, this.f99142D, this.f99143E, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            Object m101498a;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f99144t;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        AbstractC24862s.m129228b(obj);
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
                m101498a = obj;
            } else {
                AbstractC24862s.m129228b(obj);
                C28364g c28364g = new C28364g();
                C28364g.a aVar = new C28364g.a(this.f99145u, this.f99146v, this.f99147w, this.f99148x, this.f99149y, this.f99150z, this.f99139A, this.f99140B, this.f99141C, new a(this.f99143E), this.f99142D);
                this.f99144t = 1;
                m101498a = c28364g.m101498a(aVar, this);
                if (m101498a == m142578e) {
                    return m142578e;
                }
            }
            Flow flow = (Flow) m101498a;
            if (flow != null) {
                b bVar = new b(this.f99143E);
                this.f99144t = 2;
                if (flow.mo97893a(bVar, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((w) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: hq.a$x */
    /* loaded from: classes4.dex */
    public static final class x extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: A */
        final /* synthetic */ C31890dc f99154A;

        /* renamed from: B */
        final /* synthetic */ TrackingSource f99155B;

        /* renamed from: C */
        final /* synthetic */ SongInfo f99156C;

        /* renamed from: D */
        final /* synthetic */ ProfilePreviewAlbumItem f99157D;

        /* renamed from: E */
        final /* synthetic */ List f99158E;

        /* renamed from: F */
        final /* synthetic */ boolean f99159F;

        /* renamed from: G */
        final /* synthetic */ C18049e f99160G;

        /* renamed from: H */
        final /* synthetic */ String f99161H;

        /* renamed from: I */
        final /* synthetic */ C20112a f99162I;

        /* renamed from: t */
        int f99163t;

        /* renamed from: u */
        final /* synthetic */ String f99164u;

        /* renamed from: v */
        final /* synthetic */ ArrayList f99165v;

        /* renamed from: w */
        final /* synthetic */ boolean f99166w;

        /* renamed from: x */
        final /* synthetic */ C3003l3 f99167x;

        /* renamed from: y */
        final /* synthetic */ C3063z0 f99168y;

        /* renamed from: z */
        final /* synthetic */ PrivacyInfo f99169z;

        /* renamed from: hq.a$x$a */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC18505l {

            /* renamed from: p */
            final /* synthetic */ C20112a f99170p;

            a(C20112a c20112a) {
                this.f99170p = c20112a;
            }

            /* renamed from: a */
            public void m104713a(C3000l0 c3000l0) {
                AbstractC19074t.m100208f(c3000l0, "feedContent");
                this.f99170p.m104588O0(c3000l0);
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: i9 */
            public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                m104713a((C3000l0) obj);
                return C24848g0.f119245a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: hq.a$x$b */
        /* loaded from: classes4.dex */
        public static final class b implements FlowCollector {

            /* renamed from: p */
            public static final b f99171p = new b();

            /* renamed from: hq.a$x$b$a */
            /* loaded from: classes4.dex */
            public /* synthetic */ class a {

                /* renamed from: a */
                public static final /* synthetic */ int[] f99172a;

                static {
                    int[] iArr = new int[EnumC28361d.values().length];
                    try {
                        iArr[EnumC28361d.f132142q.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    f99172a = iArr;
                }
            }

            b() {
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo12109b(AbstractC28358a abstractC28358a, Continuation continuation) {
                EnumC28361d enumC28361d;
                if (abstractC28358a != null) {
                    enumC28361d = abstractC28358a.m142806a();
                } else {
                    enumC28361d = null;
                }
                if (enumC28361d != null && a.f99172a[enumC28361d.ordinal()] == 1) {
                    AbstractC19074t.m100206d(abstractC28358a, "null cannot be cast to non-null type com.zing.zalo.feed.mvp.feed.domain.usecase.uploadfeed.BaseFlowProcessFeedResponse.Error");
                    Exception m142807b = ((AbstractC28358a.b) abstractC28358a).m142807b();
                    if (m142807b != null) {
                        m142807b.printStackTrace();
                    }
                }
                return C24848g0.f119245a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        x(String str, ArrayList arrayList, boolean z11, C3003l3 c3003l3, C3063z0 c3063z0, PrivacyInfo privacyInfo, C31890dc c31890dc, TrackingSource trackingSource, SongInfo songInfo, ProfilePreviewAlbumItem profilePreviewAlbumItem, List list, boolean z12, C18049e c18049e, String str2, C20112a c20112a, Continuation continuation) {
            super(2, continuation);
            this.f99164u = str;
            this.f99165v = arrayList;
            this.f99166w = z11;
            this.f99167x = c3003l3;
            this.f99168y = c3063z0;
            this.f99169z = privacyInfo;
            this.f99154A = c31890dc;
            this.f99155B = trackingSource;
            this.f99156C = songInfo;
            this.f99157D = profilePreviewAlbumItem;
            this.f99158E = list;
            this.f99159F = z12;
            this.f99160G = c18049e;
            this.f99161H = str2;
            this.f99162I = c20112a;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new x(this.f99164u, this.f99165v, this.f99166w, this.f99167x, this.f99168y, this.f99169z, this.f99154A, this.f99155B, this.f99156C, this.f99157D, this.f99158E, this.f99159F, this.f99160G, this.f99161H, this.f99162I, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            Object m101498a;
            Object obj2;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f99163t;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        AbstractC24862s.m129228b(obj);
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
                obj2 = m142578e;
                m101498a = obj;
            } else {
                AbstractC24862s.m129228b(obj);
                C28365h c28365h = new C28365h();
                C28365h.a aVar = new C28365h.a(this.f99164u, this.f99165v, this.f99166w, this.f99167x, this.f99168y, this.f99169z, this.f99154A, this.f99155B, this.f99156C, this.f99157D, this.f99158E, this.f99159F, this.f99160G, new a(this.f99162I), this.f99161H);
                this.f99163t = 1;
                m101498a = c28365h.m101498a(aVar, this);
                obj2 = m142578e;
                if (m101498a == obj2) {
                    return obj2;
                }
            }
            Flow flow = (Flow) m101498a;
            if (flow != null) {
                b bVar = b.f99171p;
                this.f99163t = 2;
                if (flow.mo97893a(bVar, this) == obj2) {
                    return obj2;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((x) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: hq.a$y */
    /* loaded from: classes4.dex */
    public static final class y extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: A */
        final /* synthetic */ SongInfo f99173A;

        /* renamed from: B */
        final /* synthetic */ List f99174B;

        /* renamed from: C */
        final /* synthetic */ ProfilePreviewAlbumItem f99175C;

        /* renamed from: D */
        final /* synthetic */ ArrayList f99176D;

        /* renamed from: E */
        final /* synthetic */ boolean f99177E;

        /* renamed from: F */
        final /* synthetic */ String f99178F;

        /* renamed from: G */
        final /* synthetic */ C20112a f99179G;

        /* renamed from: t */
        int f99180t;

        /* renamed from: u */
        final /* synthetic */ String f99181u;

        /* renamed from: v */
        final /* synthetic */ C3003l3 f99182v;

        /* renamed from: w */
        final /* synthetic */ C3063z0 f99183w;

        /* renamed from: x */
        final /* synthetic */ PrivacyInfo f99184x;

        /* renamed from: y */
        final /* synthetic */ C31890dc f99185y;

        /* renamed from: z */
        final /* synthetic */ TrackingSource f99186z;

        /* renamed from: hq.a$y$a */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC18505l {

            /* renamed from: p */
            final /* synthetic */ C20112a f99187p;

            a(C20112a c20112a) {
                this.f99187p = c20112a;
            }

            /* renamed from: a */
            public void m104716a(C3000l0 c3000l0) {
                AbstractC19074t.m100208f(c3000l0, "feedContent");
                this.f99187p.m104588O0(c3000l0);
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: i9 */
            public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                m104716a((C3000l0) obj);
                return C24848g0.f119245a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: hq.a$y$b */
        /* loaded from: classes4.dex */
        public static final class b implements FlowCollector {

            /* renamed from: p */
            public static final b f99188p = new b();

            /* renamed from: hq.a$y$b$a */
            /* loaded from: classes4.dex */
            public /* synthetic */ class a {

                /* renamed from: a */
                public static final /* synthetic */ int[] f99189a;

                static {
                    int[] iArr = new int[EnumC28361d.values().length];
                    try {
                        iArr[EnumC28361d.f132142q.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    f99189a = iArr;
                }
            }

            b() {
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo12109b(AbstractC28358a abstractC28358a, Continuation continuation) {
                EnumC28361d enumC28361d;
                if (abstractC28358a != null) {
                    enumC28361d = abstractC28358a.m142806a();
                } else {
                    enumC28361d = null;
                }
                if (enumC28361d != null && a.f99189a[enumC28361d.ordinal()] == 1) {
                    AbstractC19074t.m100206d(abstractC28358a, "null cannot be cast to non-null type com.zing.zalo.feed.mvp.feed.domain.usecase.uploadfeed.BaseFlowProcessFeedResponse.Error");
                    Exception m142807b = ((AbstractC28358a.b) abstractC28358a).m142807b();
                    if (m142807b != null) {
                        m142807b.printStackTrace();
                    }
                }
                return C24848g0.f119245a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        y(String str, C3003l3 c3003l3, C3063z0 c3063z0, PrivacyInfo privacyInfo, C31890dc c31890dc, TrackingSource trackingSource, SongInfo songInfo, List list, ProfilePreviewAlbumItem profilePreviewAlbumItem, ArrayList arrayList, boolean z11, String str2, C20112a c20112a, Continuation continuation) {
            super(2, continuation);
            this.f99181u = str;
            this.f99182v = c3003l3;
            this.f99183w = c3063z0;
            this.f99184x = privacyInfo;
            this.f99185y = c31890dc;
            this.f99186z = trackingSource;
            this.f99173A = songInfo;
            this.f99174B = list;
            this.f99175C = profilePreviewAlbumItem;
            this.f99176D = arrayList;
            this.f99177E = z11;
            this.f99178F = str2;
            this.f99179G = c20112a;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new y(this.f99181u, this.f99182v, this.f99183w, this.f99184x, this.f99185y, this.f99186z, this.f99173A, this.f99174B, this.f99175C, this.f99176D, this.f99177E, this.f99178F, this.f99179G, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            Object m101498a;
            Object obj2;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f99180t;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        AbstractC24862s.m129228b(obj);
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
                obj2 = m142578e;
                m101498a = obj;
            } else {
                AbstractC24862s.m129228b(obj);
                C28366i c28366i = new C28366i();
                C28366i.a aVar = new C28366i.a(this.f99181u, this.f99182v, this.f99183w, this.f99184x, this.f99185y, this.f99186z, this.f99173A, this.f99174B, this.f99175C, this.f99176D, this.f99177E, new a(this.f99179G), this.f99178F);
                this.f99180t = 1;
                m101498a = c28366i.m101498a(aVar, this);
                obj2 = m142578e;
                if (m101498a == obj2) {
                    return obj2;
                }
            }
            Flow flow = (Flow) m101498a;
            if (flow != null) {
                b bVar = b.f99188p;
                this.f99180t = 2;
                if (flow.mo97893a(bVar, this) == obj2) {
                    return obj2;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((y) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: hq.a$z */
    /* loaded from: classes4.dex */
    public static final class z extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: A */
        final /* synthetic */ C25630b f99190A;

        /* renamed from: B */
        final /* synthetic */ boolean f99191B;

        /* renamed from: C */
        final /* synthetic */ String f99192C;

        /* renamed from: D */
        final /* synthetic */ C20112a f99193D;

        /* renamed from: t */
        int f99194t;

        /* renamed from: u */
        final /* synthetic */ String f99195u;

        /* renamed from: v */
        final /* synthetic */ C3003l3 f99196v;

        /* renamed from: w */
        final /* synthetic */ C3063z0 f99197w;

        /* renamed from: x */
        final /* synthetic */ PrivacyInfo f99198x;

        /* renamed from: y */
        final /* synthetic */ C31890dc f99199y;

        /* renamed from: z */
        final /* synthetic */ TrackingSource f99200z;

        /* renamed from: hq.a$z$a */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC18505l {

            /* renamed from: p */
            final /* synthetic */ C20112a f99201p;

            a(C20112a c20112a) {
                this.f99201p = c20112a;
            }

            /* renamed from: a */
            public void m104719a(C3000l0 c3000l0) {
                AbstractC19074t.m100208f(c3000l0, "feedContent");
                this.f99201p.m104588O0(c3000l0);
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: i9 */
            public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                m104719a((C3000l0) obj);
                return C24848g0.f119245a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: hq.a$z$b */
        /* loaded from: classes4.dex */
        public static final class b implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ C20112a f99202p;

            /* renamed from: hq.a$z$b$a */
            /* loaded from: classes4.dex */
            public /* synthetic */ class a {

                /* renamed from: a */
                public static final /* synthetic */ int[] f99203a;

                static {
                    int[] iArr = new int[EnumC28361d.values().length];
                    try {
                        iArr[EnumC28361d.f132142q.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[EnumC28361d.f132144s.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    f99203a = iArr;
                }
            }

            b(C20112a c20112a) {
                this.f99202p = c20112a;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo12109b(AbstractC28358a abstractC28358a, Continuation continuation) {
                int i11 = a.f99203a[abstractC28358a.m142806a().ordinal()];
                if (i11 != 1) {
                    if (i11 == 2) {
                        this.f99202p.m104630j0().mo9224q(new C19964c(new d()));
                    }
                } else {
                    this.f99202p.m104630j0().mo9224q(new C19964c(new i()));
                    AbstractC19074t.m100206d(abstractC28358a, "null cannot be cast to non-null type com.zing.zalo.feed.mvp.feed.domain.usecase.uploadfeed.BaseFlowProcessFeedResponse.Error");
                    Exception m142807b = ((AbstractC28358a.b) abstractC28358a).m142807b();
                    if (m142807b != null) {
                        m142807b.printStackTrace();
                    }
                }
                return C24848g0.f119245a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        z(String str, C3003l3 c3003l3, C3063z0 c3063z0, PrivacyInfo privacyInfo, C31890dc c31890dc, TrackingSource trackingSource, C25630b c25630b, boolean z11, String str2, C20112a c20112a, Continuation continuation) {
            super(2, continuation);
            this.f99195u = str;
            this.f99196v = c3003l3;
            this.f99197w = c3063z0;
            this.f99198x = privacyInfo;
            this.f99199y = c31890dc;
            this.f99200z = trackingSource;
            this.f99190A = c25630b;
            this.f99191B = z11;
            this.f99192C = str2;
            this.f99193D = c20112a;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new z(this.f99195u, this.f99196v, this.f99197w, this.f99198x, this.f99199y, this.f99200z, this.f99190A, this.f99191B, this.f99192C, this.f99193D, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            Object m101498a;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f99194t;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        AbstractC24862s.m129228b(obj);
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
                m101498a = obj;
            } else {
                AbstractC24862s.m129228b(obj);
                C28367j c28367j = new C28367j();
                C28367j.a aVar = new C28367j.a(this.f99195u, this.f99196v, this.f99197w, this.f99198x, this.f99199y, this.f99200z, this.f99190A, this.f99191B, new a(this.f99193D), this.f99192C);
                this.f99194t = 1;
                m101498a = c28367j.m101498a(aVar, this);
                if (m101498a == m142578e) {
                    return m142578e;
                }
            }
            Flow flow = (Flow) m101498a;
            if (flow != null) {
                b bVar = new b(this.f99193D);
                this.f99194t = 2;
                if (flow.mo97893a(bVar, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((z) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    public C20112a(C1780l0 c1780l0) {
        InterfaceC24854k m129210a;
        AbstractC19074t.m100208f(c1780l0, "savedStateHandle");
        this.f98921s = c1780l0;
        SongData songData = (SongData) c1780l0.m9318c("SONG_DATA_SAVED_KEY");
        if (songData != null) {
            songData.m45169n(false);
        }
        BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new a(null), 3, null);
        this.f98922t = C26356e.f125201a.m135679d();
        this.f98923u = new ComposLyricStatus(m104622a0(), this.f98922t);
        this.f98925w = new C1761c0(m104627g0());
        this.f98926x = new C1761c0(this.f98923u);
        this.f98927y = new C1761c0(m104625e0());
        this.f98928z = new C1761c0(m104619X());
        this.f98914A = new C1761c0(Boolean.valueOf(C20791e.f102159a.m108487c()));
        this.f98915B = new C1761c0();
        this.f98916C = new C1761c0();
        m129210a = AbstractC24856m.m129210a(m.f99009q);
        this.f98917D = m129210a;
        this.f98918E = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L0 */
    public final void m104582L0(String str) {
        m104584M0(str, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M0 */
    public final void m104584M0(String str, int i11) {
        BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new c0(i11, str, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N0 */
    public final void m104586N0(C3000l0 c3000l0) {
        this.f98915B.mo9221n(new C19964c(new j(c3000l0)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O0 */
    public final void m104588O0(C3000l0 c3000l0) {
        this.f98915B.mo9221n(new C19964c(new j(c3000l0)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: U */
    public final void m104594U() {
        Job job = this.f98920G;
        if (job != null) {
            Job.DefaultImpls.m112740a(job, null, 1, null);
        }
        this.f98918E = false;
    }

    /* renamed from: V */
    private final void m104595V() {
        if (C23055e5.m118273h(false, 1, null)) {
            BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new l(null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: W */
    public final void m104596W() {
        this.f98918E = true;
    }

    /* renamed from: W0 */
    private final void m104597W0() {
        m104594U();
        new C25464p().m101508a(new C25464p.b(false, null, 3, null));
    }

    /* renamed from: X0 */
    private final void m104598X0(String str) {
        InterfaceC18053i m137767r;
        if (str.length() > 0 && (m137767r = C26761p.m137741q().m137767r(str)) != null) {
            m137767r.mo95944a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Y0 */
    public final void m104599Y0(String str) {
        Job m112540d;
        Job job = this.f98920G;
        if (job != null) {
            Job.DefaultImpls.m112740a(job, null, 1, null);
        }
        if (this.f98918E) {
            m112540d = BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new e0(str, null), 3, null);
            this.f98920G = m112540d;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Z0 */
    public final void m104600Z0(String str, boolean z11, int i11, boolean z12) {
        SongData m45157a;
        m45157a = r0.m45157a((r20 & 1) != 0 ? r0.f45978p : str, (r20 & 2) != 0 ? r0.f45979q : null, (r20 & 4) != 0 ? r0.f45980r : null, (r20 & 8) != 0 ? r0.f45981s : null, (r20 & 16) != 0 ? r0.f45982t : null, (r20 & 32) != 0 ? r0.f45983u : null, (r20 & 64) != 0 ? r0.f45984v : z11, (r20 & 128) != 0 ? r0.f45985w : i11, (r20 & 256) != 0 ? m104627g0().f45986x : z12);
        m104617U0(m45157a);
    }

    /* renamed from: a1 */
    static /* synthetic */ void m104601a1(C20112a c20112a, String str, boolean z11, int i11, boolean z12, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            z11 = false;
        }
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        if ((i12 & 8) != 0) {
            z12 = false;
        }
        c20112a.m104600Z0(str, z11, i11, z12);
    }

    /* renamed from: A0 */
    public final void m104602A0() {
        if (C23926a.f115594a.m125059h()) {
            m104595V();
        }
    }

    /* renamed from: B0 */
    public final void m104603B0() {
        m104613Q0(new ComposeSongStatus(false, null, null));
        m104597W0();
    }

    /* renamed from: C0 */
    public final void m104604C0(String str) {
        AbstractC19074t.m100208f(str, "idSong");
        m104616T0(LyricRender.Companion.m45718c());
        m104621Z().m101508a(new C25455g.b(str, AbstractC1798u0.m9374a(this), new v()));
    }

    /* renamed from: D0 */
    public final void m104605D0(String str, LinkAttachment linkAttachment, C3023p3 c3023p3, C3003l3 c3003l3, C3063z0 c3063z0, PrivacyInfo privacyInfo, C31890dc c31890dc, TrackingSource trackingSource, boolean z11, String str2) {
        AbstractC19074t.m100208f(str, "desc");
        AbstractC19074t.m100208f(trackingSource, "trackingSource");
        AbstractC19074t.m100208f(str2, "postFeedCallbackId");
        BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new w(str, linkAttachment, c3023p3, c3003l3, c3063z0, privacyInfo, c31890dc, trackingSource, z11, str2, this, null), 3, null);
    }

    /* renamed from: E0 */
    public final void m104606E0(String str, ArrayList arrayList, boolean z11, C3003l3 c3003l3, C3063z0 c3063z0, PrivacyInfo privacyInfo, C31890dc c31890dc, TrackingSource trackingSource, SongInfo songInfo, ProfilePreviewAlbumItem profilePreviewAlbumItem, List list, boolean z12, C18049e c18049e, String str2) {
        AbstractC19074t.m100208f(str, "desc");
        AbstractC19074t.m100208f(arrayList, "mUploadPhoto");
        AbstractC19074t.m100208f(trackingSource, "trackingSource");
        AbstractC19074t.m100208f(list, "allPhotoList");
        AbstractC19074t.m100208f(str2, "postFeedCallbackId");
        BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new x(str, arrayList, z11, c3003l3, c3063z0, privacyInfo, c31890dc, trackingSource, songInfo, profilePreviewAlbumItem, list, z12, c18049e, str2, this, null), 3, null);
    }

    /* renamed from: F0 */
    public final void m104607F0(String str, C3003l3 c3003l3, C3063z0 c3063z0, PrivacyInfo privacyInfo, C31890dc c31890dc, TrackingSource trackingSource, SongInfo songInfo, List list, ProfilePreviewAlbumItem profilePreviewAlbumItem, ArrayList arrayList, boolean z11, String str2) {
        AbstractC19074t.m100208f(str, "desc");
        AbstractC19074t.m100208f(trackingSource, "trackingSource");
        AbstractC19074t.m100208f(list, "allPhotoList");
        AbstractC19074t.m100208f(arrayList, "uploadPhotos");
        AbstractC19074t.m100208f(str2, "postFeedCallbackId");
        BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new y(str, c3003l3, c3063z0, privacyInfo, c31890dc, trackingSource, songInfo, list, profilePreviewAlbumItem, arrayList, z11, str2, this, null), 3, null);
    }

    /* renamed from: G0 */
    public final void m104608G0(String str, C3003l3 c3003l3, C3063z0 c3063z0, PrivacyInfo privacyInfo, C31890dc c31890dc, TrackingSource trackingSource, C25630b c25630b, boolean z11, String str2) {
        AbstractC19074t.m100208f(str, "desc");
        AbstractC19074t.m100208f(c3003l3, "tag");
        AbstractC19074t.m100208f(trackingSource, "trackingSource");
        AbstractC19074t.m100208f(str2, "postFeedCallbackId");
        BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new z(str, c3003l3, c3063z0, privacyInfo, c31890dc, trackingSource, c25630b, z11, str2, this, null), 3, null);
    }

    /* renamed from: I0 */
    public final void m104609I0(String str, C3003l3 c3003l3, C3063z0 c3063z0, PrivacyInfo privacyInfo, C31890dc c31890dc, TrackingSource trackingSource, boolean z11, boolean z12, String str2) {
        AbstractC19074t.m100208f(str, "desc");
        AbstractC19074t.m100208f(trackingSource, "trackingSource");
        AbstractC19074t.m100208f(str2, "postFeedCallbackId");
        BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new a0(str, c3003l3, c3063z0, privacyInfo, c31890dc, trackingSource, z11, z12, str2, this, null), 3, null);
    }

    /* renamed from: J0 */
    public final void m104610J0(String str, C27373c c27373c, C3003l3 c3003l3, C3063z0 c3063z0, PrivacyInfo privacyInfo, String str2, C31890dc c31890dc, TrackingSource trackingSource, ProfilePreviewAlbumItem profilePreviewAlbumItem, boolean z11, String str3) {
        AbstractC19074t.m100208f(str, "desc");
        AbstractC19074t.m100208f(str2, "cameraLog");
        AbstractC19074t.m100208f(str3, "postFeedCallbackId");
        BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new b0(str, c27373c, c3003l3, c3063z0, privacyInfo, str2, c31890dc, trackingSource, profilePreviewAlbumItem, z11, str3, this, null), 3, null);
    }

    /* renamed from: K0 */
    public final void m104611K0() {
        m104594U();
        new C25457i().m101508a(new Object());
    }

    /* renamed from: P0 */
    public final void m104612P0(String str) {
        AbstractC19074t.m100208f(str, "idSong");
        BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new d0(str, this, null), 3, null);
    }

    /* renamed from: Q0 */
    public final void m104613Q0(ComposeSongStatus composeSongStatus) {
        AbstractC19074t.m100208f(composeSongStatus, "value");
        this.f98921s.m9321g("COMPOSE_SONG_STATUS_SAVED_KEY", composeSongStatus);
        this.f98928z.mo9224q(composeSongStatus);
    }

    /* renamed from: R0 */
    public final void m104614R0(boolean z11) {
        this.f98922t = z11;
        C26356e.f125201a.m135682i(z11);
        m104618V0(new ComposLyricStatus(m104622a0(), this.f98922t));
    }

    /* renamed from: S0 */
    public final void m104615S0(boolean z11) {
        this.f98921s.m9321g("HAS_LYRIC_SAVED_KEY", Boolean.valueOf(z11));
        m104618V0(new ComposLyricStatus(m104622a0(), this.f98922t));
    }

    /* renamed from: T0 */
    public final void m104616T0(LyricRender lyricRender) {
        AbstractC19074t.m100208f(lyricRender, "value");
        this.f98921s.m9321g("LYRIC_RENDER_SAVED_KEY", lyricRender);
        this.f98927y.mo9224q(lyricRender);
    }

    /* renamed from: U0 */
    public final void m104617U0(SongData songData) {
        AbstractC19074t.m100208f(songData, "value");
        this.f98921s.m9321g("SONG_DATA_SAVED_KEY", songData);
        this.f98925w.mo9224q(songData);
    }

    /* renamed from: V0 */
    public final void m104618V0(ComposLyricStatus composLyricStatus) {
        SongInfo songInfo;
        boolean z11;
        AbstractC19074t.m100208f(composLyricStatus, "value");
        this.f98923u = composLyricStatus;
        this.f98926x.mo9224q(composLyricStatus);
        ComposeSongStatus m104619X = m104619X();
        SongInfo m45965e = m104619X().m45965e();
        if (m45965e != null) {
            if (this.f98922t && m104622a0()) {
                z11 = true;
            } else {
                z11 = false;
            }
            songInfo = SongInfo.m45179b(m45965e, null, null, z11, 3, null);
        } else {
            songInfo = null;
        }
        m104613Q0(ComposeSongStatus.m45961b(m104619X, false, songInfo, null, 5, null));
    }

    /* renamed from: X */
    public final ComposeSongStatus m104619X() {
        ComposeSongStatus composeSongStatus = (ComposeSongStatus) this.f98921s.m9318c("COMPOSE_SONG_STATUS_SAVED_KEY");
        if (composeSongStatus == null) {
            return new ComposeSongStatus(false, null, null, 7, null);
        }
        return composeSongStatus;
    }

    /* renamed from: Y */
    public final C1761c0 m104620Y() {
        return this.f98914A;
    }

    /* renamed from: Z */
    public final C25455g m104621Z() {
        return (C25455g) this.f98917D.getValue();
    }

    /* renamed from: a0 */
    public final boolean m104622a0() {
        Boolean bool = (Boolean) this.f98921s.m9318c("HAS_LYRIC_SAVED_KEY");
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* renamed from: b0 */
    public final C1761c0 m104623b0() {
        return this.f98916C;
    }

    /* renamed from: c0 */
    public final C1761c0 m104624c0() {
        return this.f98927y;
    }

    /* renamed from: e0 */
    public final LyricRender m104625e0() {
        LyricRender lyricRender = (LyricRender) this.f98921s.m9318c("LYRIC_RENDER_SAVED_KEY");
        if (lyricRender == null) {
            return new LyricRender(null, null, null, false, false, 31, null);
        }
        return lyricRender;
    }

    /* renamed from: f0 */
    public final C1761c0 m104626f0() {
        return this.f98926x;
    }

    /* renamed from: g0 */
    public final SongData m104627g0() {
        SongData songData = (SongData) this.f98921s.m9318c("SONG_DATA_SAVED_KEY");
        if (songData == null) {
            return new SongData("", null, null, null, null, null, false, 0, false, 510, null);
        }
        return songData;
    }

    /* renamed from: h0 */
    public final C1761c0 m104628h0() {
        return this.f98925w;
    }

    /* renamed from: i0 */
    public final C1761c0 m104629i0() {
        return this.f98928z;
    }

    /* renamed from: j0 */
    public final C1761c0 m104630j0() {
        return this.f98915B;
    }

    /* renamed from: k0 */
    public final int m104631k0() {
        return this.f98924v;
    }

    /* renamed from: l0 */
    public final String m104632l0() {
        String str = CoreUtility.f89233i;
        AbstractC19074t.m100207e(str, "currentUserUid");
        return str;
    }

    /* renamed from: m0 */
    public final void m104633m0() {
        if (this.f98919F) {
            this.f98919F = false;
            SongInfo m45965e = m104619X().m45965e();
            if (m45965e != null) {
                m104582L0(m45965e.m45182d());
            }
        }
    }

    /* renamed from: n0 */
    public final void m104634n0(boolean z11) {
        m104614R0(z11);
    }

    /* renamed from: o0 */
    public final void m104635o0(SongData songData) {
        AbstractC19074t.m100208f(songData, "songData");
        if (!songData.m45166k()) {
            m104612P0(songData.m45160e());
        } else {
            m104600Z0(m104627g0().m45160e(), false, m104627g0().m45161f(), false);
            m104611K0();
        }
    }

    /* renamed from: p0 */
    public final void m104636p0() {
        boolean z11 = true;
        if (!m104627g0().m45166k()) {
            z11 = false;
        }
        this.f98919F = z11;
        m104597W0();
    }

    /* renamed from: q0 */
    public final void m104637q0(String str) {
        AbstractC19074t.m100208f(str, "postFeedCallbackId");
        m104598X0(str);
    }

    /* renamed from: r0 */
    public final void m104638r0(String str, LinkAttachment linkAttachment, C3023p3 c3023p3, C3003l3 c3003l3, C3063z0 c3063z0, PrivacyInfo privacyInfo, C31890dc c31890dc, TrackingSource trackingSource, boolean z11, C3000l0 c3000l0, boolean z12, String str2) {
        AbstractC19074t.m100208f(str, "desc");
        AbstractC19074t.m100208f(str2, "feedId");
        BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new n(str, linkAttachment, c3023p3, c3003l3, c3063z0, privacyInfo, c31890dc, trackingSource, z11, c3000l0, z12, str2, this, null), 3, null);
    }

    /* renamed from: s0 */
    public final void m104639s0(String str, String str2, int i11, C17244x0 c17244x0, C3003l3 c3003l3, C3063z0 c3063z0, PrivacyInfo privacyInfo, int i12, double d11, TrackingSource trackingSource, boolean z11, C3000l0 c3000l0, boolean z12, String str3) {
        AbstractC19074t.m100208f(str, "desc");
        AbstractC19074t.m100208f(str2, "feedMemoryId");
        AbstractC19074t.m100208f(str3, "feedId");
        BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new o(str, str2, i11, c17244x0, c3003l3, c3063z0, privacyInfo, i12, d11, trackingSource, z11, c3000l0, z12, str3, this, null), 3, null);
    }

    /* renamed from: t0 */
    public final void m104640t0(String str, ArrayList arrayList, boolean z11, C3003l3 c3003l3, C3063z0 c3063z0, PrivacyInfo privacyInfo, C31890dc c31890dc, TrackingSource trackingSource, long j11, C2949b c2949b, SongInfo songInfo, boolean z12, C3000l0 c3000l0, boolean z13, String str2, C18049e c18049e) {
        AbstractC19074t.m100208f(str, "desc");
        AbstractC19074t.m100208f(arrayList, "listMediaItem");
        AbstractC19074t.m100208f(str2, "feedId");
        BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new p(str, arrayList, z11, c3003l3, c3063z0, privacyInfo, c31890dc, trackingSource, j11, c2949b, songInfo, z12, c3000l0, z13, str2, c18049e, this, null), 3, null);
    }

    /* renamed from: u0 */
    public final void m104641u0(String str, MediaItem mediaItem, C3003l3 c3003l3, C3063z0 c3063z0, PrivacyInfo privacyInfo, C31890dc c31890dc, TrackingSource trackingSource, long j11, C2949b c2949b, SongInfo songInfo, boolean z11, C3000l0 c3000l0, boolean z12, String str2) {
        AbstractC19074t.m100208f(str, "desc");
        AbstractC19074t.m100208f(mediaItem, "photo");
        AbstractC19074t.m100208f(c3003l3, "tag");
        AbstractC19074t.m100208f(trackingSource, "trackingSource");
        AbstractC19074t.m100208f(str2, "feedId");
        BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new q(str, mediaItem, c3003l3, c3063z0, privacyInfo, c31890dc, trackingSource, j11, c2949b, songInfo, z11, c3000l0, z12, str2, this, null), 3, null);
    }

    /* renamed from: v0 */
    public final void m104642v0(String str, C25630b c25630b, C3003l3 c3003l3, C3063z0 c3063z0, PrivacyInfo privacyInfo, C31890dc c31890dc, TrackingSource trackingSource, boolean z11, C3000l0 c3000l0, boolean z12, String str2) {
        AbstractC19074t.m100208f(str, "desc");
        AbstractC19074t.m100208f(privacyInfo, "privacyInfo");
        AbstractC19074t.m100208f(str2, "feedId");
        BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new r(str, c25630b, c3003l3, c3063z0, privacyInfo, c31890dc, trackingSource, z11, c3000l0, z12, str2, this, null), 3, null);
    }

    /* renamed from: w0 */
    public final void m104643w0(String str, C3003l3 c3003l3, C3063z0 c3063z0, PrivacyInfo privacyInfo, C31890dc c31890dc, TrackingSource trackingSource, boolean z11, C3000l0 c3000l0, boolean z12, String str2) {
        AbstractC19074t.m100208f(str, "desc");
        AbstractC19074t.m100208f(str2, "feedId");
        BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new s(str, c3003l3, c3063z0, privacyInfo, c31890dc, trackingSource, z11, c3000l0, z12, str2, this, null), 3, null);
    }

    /* renamed from: x0 */
    public final void m104644x0(String str, C27373c c27373c, C3003l3 c3003l3, C3063z0 c3063z0, PrivacyInfo privacyInfo, String str2, C31890dc c31890dc, TrackingSource trackingSource, ProfilePreviewAlbumItem profilePreviewAlbumItem, boolean z11, C3000l0 c3000l0, boolean z12, String str3) {
        AbstractC19074t.m100208f(str, "desc");
        AbstractC19074t.m100208f(str3, "feedId");
        BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new t(str, c27373c, c3003l3, c3063z0, privacyInfo, str2, c31890dc, trackingSource, profilePreviewAlbumItem, z11, c3000l0, z12, str3, this, null), 3, null);
    }

    /* renamed from: y0 */
    public final void m104645y0() {
        m104594U();
    }

    /* renamed from: z0 */
    public final void m104646z0() {
        BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new u(null), 3, null);
    }
}
