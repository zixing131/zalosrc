package com.zing.zalo.shortvideo.p072ui.presenter;

import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.InterfaceC1801w;
import com.zing.zalo.shortvideo.data.model.Channel;
import com.zing.zalo.shortvideo.data.model.LoadMoreInfo;
import com.zing.zalo.shortvideo.data.model.PersonalizeChannel;
import com.zing.zalo.shortvideo.data.model.Section;
import com.zing.zalo.shortvideo.data.model.SimilarChannel;
import com.zing.zalo.shortvideo.data.model.config.ChannelConfig;
import com.zing.zalo.shortvideo.data.model.config.CoreConfig;
import com.zing.zalo.shortvideo.p072ui.model.Video;
import com.zing.zalo.shortvideo.p072ui.receiver.NetworkReceiver;
import e10.InterfaceC18170g;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19059j0;
import g20.C19205a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.TimeoutKt;
import l10.C21998a;
import m20.InterfaceC22745g;
import on0.AbstractC24341v;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import qm0.AbstractC25332a0;
import qm0.AbstractC25366r;
import v00.C27417l;
import vm0.AbstractC28298d;
import wm0.AbstractC29094b;
import wm0.AbstractC29096d;
import wm0.AbstractC29104l;

/* loaded from: classes5.dex */
public final class ChannelPresenterImpl extends BasePresenterImpl<InterfaceC22745g> implements InterfaceC10054b {

    /* renamed from: r */
    private final InterfaceC18170g f51533r;

    /* renamed from: s */
    private final C21998a f51534s;

    /* renamed from: t */
    private boolean f51535t;

    /* renamed from: u */
    private CoroutineScope f51536u;

    /* renamed from: v */
    private NetworkReceiver f51537v;

    /* renamed from: w */
    private String f51538w;

    /* renamed from: x */
    private Channel f51539x;

    /* renamed from: y */
    private String f51540y;

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.ChannelPresenterImpl$a */
    /* loaded from: classes5.dex */
    static final class C9823a extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        Object f51541t;

        /* renamed from: u */
        int f51542u;

        /* renamed from: w */
        final /* synthetic */ String f51544w;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.shortvideo.ui.presenter.ChannelPresenterImpl$a$a */
        /* loaded from: classes5.dex */
        public static final class a extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: A */
            final /* synthetic */ int f51545A;

            /* renamed from: t */
            Object f51546t;

            /* renamed from: u */
            int f51547u;

            /* renamed from: v */
            int f51548v;

            /* renamed from: w */
            int f51549w;

            /* renamed from: x */
            final /* synthetic */ C19059j0 f51550x;

            /* renamed from: y */
            final /* synthetic */ ChannelPresenterImpl f51551y;

            /* renamed from: z */
            final /* synthetic */ String f51552z;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.zing.zalo.shortvideo.ui.presenter.ChannelPresenterImpl$a$a$a, reason: collision with other inner class name */
            /* loaded from: classes5.dex */
            public static final class C32735a extends AbstractC19075u implements InterfaceC18505l {

                /* renamed from: q */
                public static final C32735a f51553q = new C32735a();

                C32735a() {
                    super(1);
                }

                @Override // en0.InterfaceC18505l
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final String mo205i9(Video video) {
                    AbstractC19074t.m100208f(video, "video");
                    return video.m52911t();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C19059j0 c19059j0, ChannelPresenterImpl channelPresenterImpl, String str, int i11, Continuation continuation) {
                super(2, continuation);
                this.f51550x = c19059j0;
                this.f51551y = channelPresenterImpl;
                this.f51552z = str;
                this.f51545A = i11;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new a(this.f51550x, this.f51551y, this.f51552z, this.f51545A, continuation);
            }

            /* JADX WARN: Removed duplicated region for block: B:8:0x0073  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x00e1 -> B:6:0x00e4). Please report as a decompilation issue!!! */
            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object mo239o(Object obj) {
                Object m142578e;
                C19059j0 c19059j0;
                LoadMoreInfo loadMoreInfo;
                Object mo96561H;
                Section m50732J;
                int i11;
                int i12;
                a aVar;
                m142578e = AbstractC28298d.m142578e();
                int i13 = this.f51549w;
                if (i13 != 0) {
                    if (i13 != 1) {
                        if (i13 == 2) {
                            i11 = this.f51548v;
                            i12 = this.f51547u;
                            AbstractC24862s.m129228b(obj);
                            Object m96642l = obj;
                            aVar = this;
                            ((Section) aVar.f51550x.f94941p).m51163e((Section) m96642l, C32735a.f51553q);
                            i12++;
                            if (i12 < i11) {
                                List m51168m = ((Section) aVar.f51550x.f94941p).m51168m();
                                String str = aVar.f51552z;
                                if (!(m51168m instanceof Collection) || !m51168m.isEmpty()) {
                                    Iterator it = m51168m.iterator();
                                    while (it.hasNext()) {
                                        if (AbstractC19074t.m100204b(((Video) it.next()).m52911t(), str)) {
                                            break;
                                        }
                                    }
                                }
                                if (((Section) aVar.f51550x.f94941p).m51171p() != null) {
                                    InterfaceC18170g interfaceC18170g = aVar.f51551y.f51533r;
                                    String str2 = aVar.f51551y.f51538w;
                                    LoadMoreInfo m51171p = ((Section) aVar.f51550x.f94941p).m51171p();
                                    aVar.f51546t = null;
                                    aVar.f51547u = i12;
                                    aVar.f51548v = i11;
                                    aVar.f51549w = 2;
                                    m96642l = InterfaceC18170g.a.m96642l(interfaceC18170g, str2, m51171p, null, null, aVar, 12, null);
                                    if (m96642l == m142578e) {
                                        return m142578e;
                                    }
                                    ((Section) aVar.f51550x.f94941p).m51163e((Section) m96642l, C32735a.f51553q);
                                    i12++;
                                    if (i12 < i11) {
                                    }
                                }
                            }
                            return C24848g0.f119245a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C19059j0 c19059j02 = (C19059j0) this.f51546t;
                    AbstractC24862s.m129228b(obj);
                    c19059j0 = c19059j02;
                    mo96561H = obj;
                } else {
                    AbstractC24862s.m129228b(obj);
                    c19059j0 = this.f51550x;
                    InterfaceC18170g interfaceC18170g2 = this.f51551y.f51533r;
                    String str3 = this.f51551y.f51538w;
                    Channel channel = this.f51551y.f51539x;
                    if (channel != null && (m50732J = channel.m50732J()) != null) {
                        loadMoreInfo = m50732J.m51171p();
                    } else {
                        loadMoreInfo = null;
                    }
                    String str4 = this.f51552z;
                    Integer m145341c = AbstractC29094b.m145341c(this.f51545A);
                    this.f51546t = c19059j0;
                    this.f51549w = 1;
                    mo96561H = interfaceC18170g2.mo96561H(str3, loadMoreInfo, str4, m145341c, this);
                    if (mo96561H == m142578e) {
                        return m142578e;
                    }
                }
                c19059j0.f94941p = mo96561H;
                i11 = this.f51545A - 1;
                i12 = 0;
                aVar = this;
                if (i12 < i11) {
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
        /* renamed from: com.zing.zalo.shortvideo.ui.presenter.ChannelPresenterImpl$a$b */
        /* loaded from: classes5.dex */
        public static final class b extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ ChannelPresenterImpl f51554q;

            /* renamed from: r */
            final /* synthetic */ C19059j0 f51555r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(ChannelPresenterImpl channelPresenterImpl, C19059j0 c19059j0) {
                super(0);
                this.f51554q = channelPresenterImpl;
                this.f51555r = c19059j0;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: V4 */
            public /* bridge */ /* synthetic */ Object mo12V4() {
                m53075a();
                return C24848g0.f119245a;
            }

            /* renamed from: a */
            public final void m53075a() {
                InterfaceC22745g.a.m117527a((InterfaceC22745g) this.f51554q.m52968s(), (Section) this.f51555r.f94941p, null, 2, null);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.shortvideo.ui.presenter.ChannelPresenterImpl$a$c */
        /* loaded from: classes5.dex */
        public static final class c extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ ChannelPresenterImpl f51556q;

            /* renamed from: r */
            final /* synthetic */ C19059j0 f51557r;

            /* renamed from: s */
            final /* synthetic */ Exception f51558s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(ChannelPresenterImpl channelPresenterImpl, C19059j0 c19059j0, Exception exc) {
                super(0);
                this.f51556q = channelPresenterImpl;
                this.f51557r = c19059j0;
                this.f51558s = exc;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: V4 */
            public /* bridge */ /* synthetic */ Object mo12V4() {
                m53076a();
                return C24848g0.f119245a;
            }

            /* renamed from: a */
            public final void m53076a() {
                ((InterfaceC22745g) this.f51556q.m52968s()).mo54063Fg((Section) this.f51557r.f94941p, this.f51558s);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9823a(String str, Continuation continuation) {
            super(2, continuation);
            this.f51544w = str;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new C9823a(this.f51544w, continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x00c3 A[RETURN] */
        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo239o(Object obj) {
            Object m142578e;
            CoreConfig coreConfig;
            int i11;
            long j11;
            C19059j0 c19059j0;
            C19059j0 c19059j02;
            Long m51457t;
            Integer m51455r;
            ChannelPresenterImpl channelPresenterImpl;
            c cVar;
            m142578e = AbstractC28298d.m142578e();
            int i12 = this.f51542u;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 == 3) {
                            AbstractC24862s.m129228b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        c19059j0 = (C19059j0) this.f51541t;
                        try {
                            AbstractC24862s.m129228b(obj);
                        } catch (Exception e11) {
                            e = e11;
                            channelPresenterImpl = ChannelPresenterImpl.this;
                            cVar = new c(channelPresenterImpl, c19059j0, e);
                            this.f51541t = null;
                            this.f51542u = 3;
                            if (channelPresenterImpl.m52971w(cVar, this) == m142578e) {
                            }
                            return C24848g0.f119245a;
                        }
                    }
                    return C24848g0.f119245a;
                }
                c19059j02 = (C19059j0) this.f51541t;
                try {
                    AbstractC24862s.m129228b(obj);
                } catch (Exception e12) {
                    e = e12;
                    c19059j0 = c19059j02;
                    channelPresenterImpl = ChannelPresenterImpl.this;
                    cVar = new c(channelPresenterImpl, c19059j0, e);
                    this.f51541t = null;
                    this.f51542u = 3;
                    if (channelPresenterImpl.m52971w(cVar, this) == m142578e) {
                    }
                    return C24848g0.f119245a;
                }
            } else {
                AbstractC24862s.m129228b(obj);
                ChannelConfig m140381e = C27417l.f129055a.m140381e();
                if (m140381e != null) {
                    coreConfig = m140381e.m51425b();
                } else {
                    coreConfig = null;
                }
                if (coreConfig != null && (m51455r = coreConfig.m51455r()) != null) {
                    i11 = m51455r.intValue();
                } else {
                    i11 = 0;
                }
                if (coreConfig != null && (m51457t = coreConfig.m51457t()) != null) {
                    j11 = m51457t.longValue();
                } else {
                    j11 = 30000;
                }
                long j12 = j11;
                C19059j0 c19059j03 = new C19059j0();
                c19059j03.f94941p = new Section((List) null, 0L, (LoadMoreInfo) null, 7, (AbstractC19060k) null);
                try {
                    a aVar = new a(c19059j03, ChannelPresenterImpl.this, this.f51544w, i11, null);
                    this.f51541t = c19059j03;
                    this.f51542u = 1;
                    if (TimeoutKt.m112878c(j12, aVar, this) == m142578e) {
                        return m142578e;
                    }
                    c19059j02 = c19059j03;
                } catch (Exception e13) {
                    e = e13;
                    c19059j0 = c19059j03;
                    channelPresenterImpl = ChannelPresenterImpl.this;
                    cVar = new c(channelPresenterImpl, c19059j0, e);
                    this.f51541t = null;
                    this.f51542u = 3;
                    if (channelPresenterImpl.m52971w(cVar, this) == m142578e) {
                        return m142578e;
                    }
                    return C24848g0.f119245a;
                }
            }
            ChannelPresenterImpl channelPresenterImpl2 = ChannelPresenterImpl.this;
            b bVar = new b(channelPresenterImpl2, c19059j02);
            this.f51541t = c19059j02;
            this.f51542u = 2;
            if (channelPresenterImpl2.m52971w(bVar, this) == m142578e) {
                return m142578e;
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C9823a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.ChannelPresenterImpl$b */
    /* loaded from: classes5.dex */
    public static final class C9824b extends AbstractC29096d {

        /* renamed from: s */
        Object f51559s;

        /* renamed from: t */
        /* synthetic */ Object f51560t;

        /* renamed from: v */
        int f51562v;

        C9824b(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f51560t = obj;
            this.f51562v |= Integer.MIN_VALUE;
            return ChannelPresenterImpl.this.m53057J(null, this);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.ChannelPresenterImpl$c */
    /* loaded from: classes5.dex */
    static final class C9825c extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f51563t;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.shortvideo.ui.presenter.ChannelPresenterImpl$c$a */
        /* loaded from: classes5.dex */
        public static final class a extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            Object f51565t;

            /* renamed from: u */
            Object f51566u;

            /* renamed from: v */
            int f51567v;

            /* renamed from: w */
            private /* synthetic */ Object f51568w;

            /* renamed from: x */
            final /* synthetic */ ChannelPresenterImpl f51569x;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.zing.zalo.shortvideo.ui.presenter.ChannelPresenterImpl$c$a$a, reason: collision with other inner class name */
            /* loaded from: classes5.dex */
            public static final class C32736a extends AbstractC19075u implements InterfaceC18494a {

                /* renamed from: q */
                final /* synthetic */ ChannelPresenterImpl f51570q;

                /* renamed from: r */
                final /* synthetic */ Channel f51571r;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C32736a(ChannelPresenterImpl channelPresenterImpl, Channel channel) {
                    super(0);
                    this.f51570q = channelPresenterImpl;
                    this.f51571r = channel;
                }

                @Override // en0.InterfaceC18494a
                /* renamed from: V4 */
                public /* bridge */ /* synthetic */ Object mo12V4() {
                    m53079a();
                    return C24848g0.f119245a;
                }

                /* renamed from: a */
                public final void m53079a() {
                    ((InterfaceC22745g) this.f51570q.m52968s()).mo54064Ft(this.f51571r);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.zing.zalo.shortvideo.ui.presenter.ChannelPresenterImpl$c$a$b */
            /* loaded from: classes5.dex */
            public static final class b extends AbstractC19075u implements InterfaceC18494a {

                /* renamed from: q */
                final /* synthetic */ ChannelPresenterImpl f51572q;

                /* renamed from: r */
                final /* synthetic */ Exception f51573r;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(ChannelPresenterImpl channelPresenterImpl, Exception exc) {
                    super(0);
                    this.f51572q = channelPresenterImpl;
                    this.f51573r = exc;
                }

                @Override // en0.InterfaceC18494a
                /* renamed from: V4 */
                public /* bridge */ /* synthetic */ Object mo12V4() {
                    m53080a();
                    return C24848g0.f119245a;
                }

                /* renamed from: a */
                public final void m53080a() {
                    ((InterfaceC22745g) this.f51572q.m52968s()).mo54075d(this.f51573r);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.zing.zalo.shortvideo.ui.presenter.ChannelPresenterImpl$c$a$c */
            /* loaded from: classes5.dex */
            public static final class c extends AbstractC29104l implements InterfaceC18509p {

                /* renamed from: t */
                int f51574t;

                /* renamed from: u */
                final /* synthetic */ ChannelPresenterImpl f51575u;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                c(ChannelPresenterImpl channelPresenterImpl, Continuation continuation) {
                    super(2, continuation);
                    this.f51575u = channelPresenterImpl;
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: a */
                public final Continuation mo238a(Object obj, Continuation continuation) {
                    return new c(this.f51575u, continuation);
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: o */
                public final Object mo239o(Object obj) {
                    Object m142578e;
                    m142578e = AbstractC28298d.m142578e();
                    int i11 = this.f51574t;
                    if (i11 != 0) {
                        if (i11 != 1) {
                            if (i11 == 2) {
                                AbstractC24862s.m129228b(obj);
                                return (Channel) obj;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC24862s.m129228b(obj);
                        return (Channel) obj;
                    }
                    AbstractC24862s.m129228b(obj);
                    if (AbstractC19074t.m100204b(this.f51575u.f51540y, "myChannel")) {
                        InterfaceC18170g interfaceC18170g = this.f51575u.f51533r;
                        this.f51574t = 1;
                        obj = interfaceC18170g.mo96624w0(this);
                        if (obj == m142578e) {
                            return m142578e;
                        }
                        return (Channel) obj;
                    }
                    InterfaceC18170g interfaceC18170g2 = this.f51575u.f51533r;
                    String str = this.f51575u.f51538w;
                    this.f51574t = 2;
                    obj = interfaceC18170g2.mo96550B0(str, this);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                    return (Channel) obj;
                }

                @Override // en0.InterfaceC18509p
                /* renamed from: r, reason: merged with bridge method [inline-methods] */
                public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                    return ((c) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.zing.zalo.shortvideo.ui.presenter.ChannelPresenterImpl$c$a$d */
            /* loaded from: classes5.dex */
            public static final class d extends AbstractC29104l implements InterfaceC18509p {

                /* renamed from: t */
                int f51576t;

                /* renamed from: u */
                final /* synthetic */ ChannelPresenterImpl f51577u;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                d(ChannelPresenterImpl channelPresenterImpl, Continuation continuation) {
                    super(2, continuation);
                    this.f51577u = channelPresenterImpl;
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: a */
                public final Continuation mo238a(Object obj, Continuation continuation) {
                    return new d(this.f51577u, continuation);
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: o */
                public final Object mo239o(Object obj) {
                    Object m142578e;
                    List m131496e;
                    Object m131205e0;
                    m142578e = AbstractC28298d.m142578e();
                    int i11 = this.f51576t;
                    if (i11 != 0) {
                        if (i11 == 1) {
                            AbstractC24862s.m129228b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        AbstractC24862s.m129228b(obj);
                        InterfaceC18170g interfaceC18170g = this.f51577u.f51533r;
                        m131496e = AbstractC25366r.m131496e(this.f51577u.f51538w);
                        this.f51576t = 1;
                        obj = interfaceC18170g.mo96560G0(m131496e, this);
                        if (obj == m142578e) {
                            return m142578e;
                        }
                    }
                    m131205e0 = AbstractC25332a0.m131205e0((List) obj);
                    return m131205e0;
                }

                @Override // en0.InterfaceC18509p
                /* renamed from: r, reason: merged with bridge method [inline-methods] */
                public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                    return ((d) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(ChannelPresenterImpl channelPresenterImpl, Continuation continuation) {
                super(2, continuation);
                this.f51569x = channelPresenterImpl;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                a aVar = new a(this.f51569x, continuation);
                aVar.f51568w = obj;
                return aVar;
            }

            /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0007. Please report as an issue. */
            /* JADX WARN: Removed duplicated region for block: B:15:0x0119 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:22:0x00eb A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:23:0x00ec  */
            /* JADX WARN: Removed duplicated region for block: B:27:0x00cc A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:35:0x009e A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:36:0x009f  */
            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object mo239o(Object obj) {
                Object m142578e;
                Deferred m112538b;
                boolean m127128x;
                Deferred m112538b2;
                Deferred deferred;
                Object mo112598E;
                Channel channel;
                PersonalizeChannel personalizeChannel;
                List m131496e;
                PersonalizeChannel personalizeChannel2;
                Channel channel2;
                Object m131205e0;
                ChannelPresenterImpl channelPresenterImpl;
                C32736a c32736a;
                m142578e = AbstractC28298d.m142578e();
                try {
                } catch (Exception e11) {
                    ChannelPresenterImpl channelPresenterImpl2 = this.f51569x;
                    b bVar = new b(channelPresenterImpl2, e11);
                    this.f51568w = null;
                    this.f51565t = null;
                    this.f51566u = null;
                    this.f51567v = 7;
                    if (channelPresenterImpl2.m52971w(bVar, this) == m142578e) {
                        return m142578e;
                    }
                }
                switch (this.f51567v) {
                    case 0:
                        AbstractC24862s.m129228b(obj);
                        CoroutineScope coroutineScope = (CoroutineScope) this.f51568w;
                        m112538b = BuildersKt__Builders_commonKt.m112538b(coroutineScope, null, null, new c(this.f51569x, null), 3, null);
                        m127128x = AbstractC24341v.m127128x(this.f51569x.f51538w);
                        if (!m127128x) {
                            m112538b2 = BuildersKt__Builders_commonKt.m112538b(coroutineScope, null, null, new d(this.f51569x, null), 3, null);
                            this.f51568w = m112538b2;
                            this.f51567v = 1;
                            Object mo112598E2 = m112538b.mo112598E(this);
                            if (mo112598E2 == m142578e) {
                                return m142578e;
                            }
                            deferred = m112538b2;
                            obj = mo112598E2;
                            Channel channel3 = (Channel) obj;
                            this.f51568w = channel3;
                            this.f51567v = 2;
                            mo112598E = deferred.mo112598E(this);
                            if (mo112598E != m142578e) {
                                return m142578e;
                            }
                            channel = channel3;
                            obj = mo112598E;
                            personalizeChannel = (PersonalizeChannel) obj;
                            personalizeChannel2 = personalizeChannel;
                            ChannelPresenterImpl channelPresenterImpl3 = this.f51569x;
                            List m50788x = channel.m50788x();
                            this.f51568w = channel;
                            this.f51565t = personalizeChannel2;
                            this.f51566u = channel;
                            this.f51567v = 5;
                            obj = channelPresenterImpl3.m53057J(m50788x, this);
                            if (obj == m142578e) {
                                return m142578e;
                            }
                            channel2 = channel;
                            channel.m50721C0((List) obj);
                            this.f51569x.f51539x = channel2;
                            this.f51569x.f51538w = channel2.m50769l();
                            channel2.m50744T(personalizeChannel2);
                            channelPresenterImpl = this.f51569x;
                            c32736a = new C32736a(channelPresenterImpl, channel2);
                            this.f51568w = null;
                            this.f51565t = null;
                            this.f51566u = null;
                            this.f51567v = 6;
                            if (channelPresenterImpl.m52971w(c32736a, this) == m142578e) {
                                return m142578e;
                            }
                            return C24848g0.f119245a;
                        }
                        this.f51567v = 3;
                        obj = m112538b.mo112598E(this);
                        if (obj == m142578e) {
                            return m142578e;
                        }
                        channel = (Channel) obj;
                        InterfaceC18170g interfaceC18170g = this.f51569x.f51533r;
                        m131496e = AbstractC25366r.m131496e(channel.m50769l());
                        this.f51568w = channel;
                        this.f51567v = 4;
                        obj = interfaceC18170g.mo96560G0(m131496e, this);
                        if (obj == m142578e) {
                            return m142578e;
                        }
                        m131205e0 = AbstractC25332a0.m131205e0((List) obj);
                        personalizeChannel = (PersonalizeChannel) m131205e0;
                        personalizeChannel2 = personalizeChannel;
                        ChannelPresenterImpl channelPresenterImpl32 = this.f51569x;
                        List m50788x2 = channel.m50788x();
                        this.f51568w = channel;
                        this.f51565t = personalizeChannel2;
                        this.f51566u = channel;
                        this.f51567v = 5;
                        obj = channelPresenterImpl32.m53057J(m50788x2, this);
                        if (obj == m142578e) {
                        }
                    case 1:
                        deferred = (Deferred) this.f51568w;
                        AbstractC24862s.m129228b(obj);
                        Channel channel32 = (Channel) obj;
                        this.f51568w = channel32;
                        this.f51567v = 2;
                        mo112598E = deferred.mo112598E(this);
                        if (mo112598E != m142578e) {
                        }
                        break;
                    case 2:
                        channel = (Channel) this.f51568w;
                        AbstractC24862s.m129228b(obj);
                        personalizeChannel = (PersonalizeChannel) obj;
                        personalizeChannel2 = personalizeChannel;
                        ChannelPresenterImpl channelPresenterImpl322 = this.f51569x;
                        List m50788x22 = channel.m50788x();
                        this.f51568w = channel;
                        this.f51565t = personalizeChannel2;
                        this.f51566u = channel;
                        this.f51567v = 5;
                        obj = channelPresenterImpl322.m53057J(m50788x22, this);
                        if (obj == m142578e) {
                        }
                        break;
                    case 3:
                        AbstractC24862s.m129228b(obj);
                        channel = (Channel) obj;
                        InterfaceC18170g interfaceC18170g2 = this.f51569x.f51533r;
                        m131496e = AbstractC25366r.m131496e(channel.m50769l());
                        this.f51568w = channel;
                        this.f51567v = 4;
                        obj = interfaceC18170g2.mo96560G0(m131496e, this);
                        if (obj == m142578e) {
                        }
                        m131205e0 = AbstractC25332a0.m131205e0((List) obj);
                        personalizeChannel = (PersonalizeChannel) m131205e0;
                        personalizeChannel2 = personalizeChannel;
                        ChannelPresenterImpl channelPresenterImpl3222 = this.f51569x;
                        List m50788x222 = channel.m50788x();
                        this.f51568w = channel;
                        this.f51565t = personalizeChannel2;
                        this.f51566u = channel;
                        this.f51567v = 5;
                        obj = channelPresenterImpl3222.m53057J(m50788x222, this);
                        if (obj == m142578e) {
                        }
                        break;
                    case 4:
                        channel = (Channel) this.f51568w;
                        AbstractC24862s.m129228b(obj);
                        m131205e0 = AbstractC25332a0.m131205e0((List) obj);
                        personalizeChannel = (PersonalizeChannel) m131205e0;
                        personalizeChannel2 = personalizeChannel;
                        ChannelPresenterImpl channelPresenterImpl32222 = this.f51569x;
                        List m50788x2222 = channel.m50788x();
                        this.f51568w = channel;
                        this.f51565t = personalizeChannel2;
                        this.f51566u = channel;
                        this.f51567v = 5;
                        obj = channelPresenterImpl32222.m53057J(m50788x2222, this);
                        if (obj == m142578e) {
                        }
                        break;
                    case 5:
                        channel = (Channel) this.f51566u;
                        personalizeChannel2 = (PersonalizeChannel) this.f51565t;
                        channel2 = (Channel) this.f51568w;
                        AbstractC24862s.m129228b(obj);
                        channel.m50721C0((List) obj);
                        this.f51569x.f51539x = channel2;
                        this.f51569x.f51538w = channel2.m50769l();
                        channel2.m50744T(personalizeChannel2);
                        channelPresenterImpl = this.f51569x;
                        c32736a = new C32736a(channelPresenterImpl, channel2);
                        this.f51568w = null;
                        this.f51565t = null;
                        this.f51566u = null;
                        this.f51567v = 6;
                        if (channelPresenterImpl.m52971w(c32736a, this) == m142578e) {
                        }
                        return C24848g0.f119245a;
                    case 6:
                        AbstractC24862s.m129228b(obj);
                        return C24848g0.f119245a;
                    case 7:
                        AbstractC24862s.m129228b(obj);
                        return C24848g0.f119245a;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        C9825c(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new C9825c(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f51563t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                a aVar = new a(ChannelPresenterImpl.this, null);
                this.f51563t = 1;
                if (SupervisorKt.m112865c(aVar, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C9825c) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.ChannelPresenterImpl$d */
    /* loaded from: classes5.dex */
    static final class C9826d extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f51578t;

        /* renamed from: v */
        final /* synthetic */ String f51580v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9826d(String str, Continuation continuation) {
            super(1, continuation);
            this.f51580v = str;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f51578t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                InterfaceC18170g interfaceC18170g = ChannelPresenterImpl.this.f51533r;
                String str = this.f51580v;
                this.f51578t = 1;
                obj = interfaceC18170g.mo96597i0(str, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            return obj;
        }

        /* renamed from: r */
        public final Continuation m53083r(Continuation continuation) {
            return new C9826d(this.f51580v, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((C9826d) m53083r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.ChannelPresenterImpl$e */
    /* loaded from: classes5.dex */
    static final class C9827e extends AbstractC19075u implements InterfaceC18505l {
        C9827e() {
            super(1);
        }

        /* renamed from: a */
        public final void m53085a(Video video) {
            AbstractC19074t.m100208f(video, "video");
            ((InterfaceC22745g) ChannelPresenterImpl.this.m52968s()).mo54076nl(video);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53085a((Video) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.ChannelPresenterImpl$f */
    /* loaded from: classes5.dex */
    static final class C9828f extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f51582t;

        /* renamed from: v */
        final /* synthetic */ LoadMoreInfo f51584v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9828f(LoadMoreInfo loadMoreInfo, Continuation continuation) {
            super(1, continuation);
            this.f51584v = loadMoreInfo;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f51582t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                InterfaceC18170g interfaceC18170g = ChannelPresenterImpl.this.f51533r;
                String str = ChannelPresenterImpl.this.f51538w;
                LoadMoreInfo loadMoreInfo = this.f51584v;
                this.f51582t = 1;
                obj = interfaceC18170g.mo96579Z(str, loadMoreInfo, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            return obj;
        }

        /* renamed from: r */
        public final Continuation m53086r(Continuation continuation) {
            return new C9828f(this.f51584v, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((C9828f) m53086r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.ChannelPresenterImpl$g */
    /* loaded from: classes5.dex */
    static final class C9829g extends AbstractC19075u implements InterfaceC18505l {
        C9829g() {
            super(1);
        }

        /* renamed from: a */
        public final void m53088a(Throwable th2) {
            AbstractC19074t.m100208f(th2, "throwable");
            ((InterfaceC22745g) ChannelPresenterImpl.this.m52968s()).mo54075d(th2);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53088a((Throwable) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.ChannelPresenterImpl$h */
    /* loaded from: classes5.dex */
    static final class C9830h extends AbstractC19075u implements InterfaceC18505l {
        C9830h() {
            super(1);
        }

        /* renamed from: a */
        public final void m53089a(Section section) {
            AbstractC19074t.m100208f(section, "section");
            ((InterfaceC22745g) ChannelPresenterImpl.this.m52968s()).mo54074bF(section);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53089a((Section) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.ChannelPresenterImpl$i */
    /* loaded from: classes5.dex */
    static final class C9831i extends AbstractC19075u implements InterfaceC18494a {
        C9831i() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m53090a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m53090a() {
            if (ChannelPresenterImpl.this.f51535t) {
                ChannelPresenterImpl.this.f51535t = false;
                ((InterfaceC22745g) ChannelPresenterImpl.this.m52968s()).mo54073b(ChannelPresenterImpl.this.f51535t);
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.ChannelPresenterImpl$j */
    /* loaded from: classes5.dex */
    static final class C9832j extends AbstractC19075u implements InterfaceC18494a {
        C9832j() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m53091a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m53091a() {
            if (!ChannelPresenterImpl.this.f51535t) {
                ChannelPresenterImpl.this.f51535t = true;
                ((InterfaceC22745g) ChannelPresenterImpl.this.m52968s()).mo54073b(ChannelPresenterImpl.this.f51535t);
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.ChannelPresenterImpl$k */
    /* loaded from: classes5.dex */
    static final class C9833k extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f51589t;

        /* renamed from: u */
        private /* synthetic */ Object f51590u;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.shortvideo.ui.presenter.ChannelPresenterImpl$k$a */
        /* loaded from: classes5.dex */
        public static final class a extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ ChannelPresenterImpl f51592q;

            /* renamed from: r */
            final /* synthetic */ Channel f51593r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(ChannelPresenterImpl channelPresenterImpl, Channel channel) {
                super(0);
                this.f51592q = channelPresenterImpl;
                this.f51593r = channel;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: V4 */
            public /* bridge */ /* synthetic */ Object mo12V4() {
                m53093a();
                return C24848g0.f119245a;
            }

            /* renamed from: a */
            public final void m53093a() {
                ((InterfaceC22745g) this.f51592q.m52968s()).mo54077om(this.f51593r.m50791z());
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.shortvideo.ui.presenter.ChannelPresenterImpl$k$b */
        /* loaded from: classes5.dex */
        public static final class b extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ ChannelPresenterImpl f51594q;

            /* renamed from: r */
            final /* synthetic */ Exception f51595r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(ChannelPresenterImpl channelPresenterImpl, Exception exc) {
                super(0);
                this.f51594q = channelPresenterImpl;
                this.f51595r = exc;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: V4 */
            public /* bridge */ /* synthetic */ Object mo12V4() {
                m53094a();
                return C24848g0.f119245a;
            }

            /* renamed from: a */
            public final void m53094a() {
                ((InterfaceC22745g) this.f51594q.m52968s()).mo54075d(this.f51595r);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.shortvideo.ui.presenter.ChannelPresenterImpl$k$c */
        /* loaded from: classes5.dex */
        public static final class c extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f51596t;

            /* renamed from: u */
            final /* synthetic */ ChannelPresenterImpl f51597u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(ChannelPresenterImpl channelPresenterImpl, Continuation continuation) {
                super(2, continuation);
                this.f51597u = channelPresenterImpl;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new c(this.f51597u, continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                Object m142578e;
                m142578e = AbstractC28298d.m142578e();
                int i11 = this.f51596t;
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            AbstractC24862s.m129228b(obj);
                            return (Channel) obj;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC24862s.m129228b(obj);
                    return (Channel) obj;
                }
                AbstractC24862s.m129228b(obj);
                if (AbstractC19074t.m100204b(this.f51597u.f51540y, "myChannel")) {
                    InterfaceC18170g interfaceC18170g = this.f51597u.f51533r;
                    this.f51596t = 1;
                    obj = interfaceC18170g.mo96624w0(this);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                    return (Channel) obj;
                }
                InterfaceC18170g interfaceC18170g2 = this.f51597u.f51533r;
                String str = this.f51597u.f51538w;
                this.f51596t = 2;
                obj = interfaceC18170g2.mo96550B0(str, this);
                if (obj == m142578e) {
                    return m142578e;
                }
                return (Channel) obj;
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((c) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        C9833k(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            C9833k c9833k = new C9833k(continuation);
            c9833k.f51590u = obj;
            return c9833k;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            Deferred m112538b;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f51589t;
            try {
            } catch (Exception e11) {
                ChannelPresenterImpl channelPresenterImpl = ChannelPresenterImpl.this;
                b bVar = new b(channelPresenterImpl, e11);
                this.f51589t = 3;
                if (channelPresenterImpl.m52971w(bVar, this) == m142578e) {
                    return m142578e;
                }
            }
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 == 3) {
                            AbstractC24862s.m129228b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        AbstractC24862s.m129228b(obj);
                    }
                    return C24848g0.f119245a;
                }
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                m112538b = BuildersKt__Builders_commonKt.m112538b((CoroutineScope) this.f51590u, null, null, new c(ChannelPresenterImpl.this, null), 3, null);
                this.f51589t = 1;
                obj = m112538b.mo112598E(this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            ChannelPresenterImpl channelPresenterImpl2 = ChannelPresenterImpl.this;
            a aVar = new a(channelPresenterImpl2, (Channel) obj);
            this.f51589t = 2;
            if (channelPresenterImpl2.m52971w(aVar, this) == m142578e) {
                return m142578e;
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C9833k) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.ChannelPresenterImpl$l */
    /* loaded from: classes5.dex */
    static final class C9834l extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f51598t;

        /* renamed from: u */
        final /* synthetic */ boolean f51599u;

        /* renamed from: v */
        final /* synthetic */ ChannelPresenterImpl f51600v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9834l(boolean z11, ChannelPresenterImpl channelPresenterImpl, Continuation continuation) {
            super(1, continuation);
            this.f51599u = z11;
            this.f51600v = channelPresenterImpl;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f51598t;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        AbstractC24862s.m129228b(obj);
                        return (PersonalizeChannel) obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
                return (PersonalizeChannel) obj;
            }
            AbstractC24862s.m129228b(obj);
            if (this.f51599u) {
                InterfaceC18170g interfaceC18170g = this.f51600v.f51533r;
                String str = this.f51600v.f51538w;
                this.f51598t = 1;
                obj = interfaceC18170g.mo96551C(str, this);
                if (obj == m142578e) {
                    return m142578e;
                }
                return (PersonalizeChannel) obj;
            }
            InterfaceC18170g interfaceC18170g2 = this.f51600v.f51533r;
            String str2 = this.f51600v.f51538w;
            this.f51598t = 2;
            obj = interfaceC18170g2.mo96589e0(str2, this);
            if (obj == m142578e) {
                return m142578e;
            }
            return (PersonalizeChannel) obj;
        }

        /* renamed from: r */
        public final Continuation m53096r(Continuation continuation) {
            return new C9834l(this.f51599u, this.f51600v, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((C9834l) m53096r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.ChannelPresenterImpl$m */
    /* loaded from: classes5.dex */
    static final class C9835m extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ boolean f51602r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9835m(boolean z11) {
            super(1);
            this.f51602r = z11;
        }

        /* renamed from: a */
        public final void m53098a(Throwable th2) {
            AbstractC19074t.m100208f(th2, "throwable");
            InterfaceC22745g.a.m117528b((InterfaceC22745g) ChannelPresenterImpl.this.m52968s(), this.f51602r, th2, false, 4, null);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53098a((Throwable) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.ChannelPresenterImpl$n */
    /* loaded from: classes5.dex */
    static final class C9836n extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ boolean f51604r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9836n(boolean z11) {
            super(1);
            this.f51604r = z11;
        }

        /* renamed from: a */
        public final void m53099a(PersonalizeChannel personalizeChannel) {
            AbstractC19074t.m100208f(personalizeChannel, "personalize");
            ((InterfaceC22745g) ChannelPresenterImpl.this.m52968s()).mo54065Jc(this.f51604r, personalizeChannel, false);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53099a((PersonalizeChannel) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.ChannelPresenterImpl$o */
    /* loaded from: classes5.dex */
    static final class C9837o extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f51605t;

        /* renamed from: u */
        final /* synthetic */ boolean f51606u;

        /* renamed from: v */
        final /* synthetic */ ChannelPresenterImpl f51607v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9837o(boolean z11, ChannelPresenterImpl channelPresenterImpl, Continuation continuation) {
            super(1, continuation);
            this.f51606u = z11;
            this.f51607v = channelPresenterImpl;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f51605t;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        AbstractC24862s.m129228b(obj);
                        return (PersonalizeChannel) obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
                return (PersonalizeChannel) obj;
            }
            AbstractC24862s.m129228b(obj);
            if (this.f51606u) {
                InterfaceC18170g interfaceC18170g = this.f51607v.f51533r;
                String str = this.f51607v.f51538w;
                this.f51605t = 1;
                obj = InterfaceC18170g.a.m96631a(interfaceC18170g, str, null, null, null, null, null, this, 62, null);
                if (obj == m142578e) {
                    return m142578e;
                }
                return (PersonalizeChannel) obj;
            }
            InterfaceC18170g interfaceC18170g2 = this.f51607v.f51533r;
            String str2 = this.f51607v.f51538w;
            this.f51605t = 2;
            obj = InterfaceC18170g.a.m96645o(interfaceC18170g2, str2, null, null, null, this, 14, null);
            if (obj == m142578e) {
                return m142578e;
            }
            return (PersonalizeChannel) obj;
        }

        /* renamed from: r */
        public final Continuation m53100r(Continuation continuation) {
            return new C9837o(this.f51606u, this.f51607v, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((C9837o) m53100r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.ChannelPresenterImpl$p */
    /* loaded from: classes5.dex */
    static final class C9838p extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ boolean f51609r;

        /* renamed from: s */
        final /* synthetic */ boolean f51610s;

        /* renamed from: t */
        final /* synthetic */ boolean f51611t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9838p(boolean z11, boolean z12, boolean z13) {
            super(1);
            this.f51609r = z11;
            this.f51610s = z12;
            this.f51611t = z13;
        }

        /* renamed from: a */
        public final void m53102a(Throwable th2) {
            AbstractC19074t.m100208f(th2, "throwable");
            ((InterfaceC22745g) ChannelPresenterImpl.this.m52968s()).mo54078oy(this.f51609r, th2, this.f51610s, this.f51611t);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53102a((Throwable) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.ChannelPresenterImpl$q */
    /* loaded from: classes5.dex */
    static final class C9839q extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ boolean f51613r;

        /* renamed from: s */
        final /* synthetic */ boolean f51614s;

        /* renamed from: t */
        final /* synthetic */ boolean f51615t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9839q(boolean z11, boolean z12, boolean z13) {
            super(1);
            this.f51613r = z11;
            this.f51614s = z12;
            this.f51615t = z13;
        }

        /* renamed from: a */
        public final void m53103a(PersonalizeChannel personalizeChannel) {
            AbstractC19074t.m100208f(personalizeChannel, "personalize");
            ((InterfaceC22745g) ChannelPresenterImpl.this.m52968s()).mo54078oy(this.f51613r, personalizeChannel, this.f51614s, this.f51615t);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53103a((PersonalizeChannel) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.ChannelPresenterImpl$r */
    /* loaded from: classes5.dex */
    static final class C9840r extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f51616t;

        /* renamed from: u */
        final /* synthetic */ boolean f51617u;

        /* renamed from: v */
        final /* synthetic */ ChannelPresenterImpl f51618v;

        /* renamed from: w */
        final /* synthetic */ String f51619w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9840r(boolean z11, ChannelPresenterImpl channelPresenterImpl, String str, Continuation continuation) {
            super(1, continuation);
            this.f51617u = z11;
            this.f51618v = channelPresenterImpl;
            this.f51619w = str;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f51616t;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        AbstractC24862s.m129228b(obj);
                        return (PersonalizeChannel) obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
                return (PersonalizeChannel) obj;
            }
            AbstractC24862s.m129228b(obj);
            if (this.f51617u) {
                InterfaceC18170g interfaceC18170g = this.f51618v.f51533r;
                String str = this.f51619w;
                this.f51616t = 1;
                obj = InterfaceC18170g.a.m96631a(interfaceC18170g, str, null, null, null, null, null, this, 62, null);
                if (obj == m142578e) {
                    return m142578e;
                }
                return (PersonalizeChannel) obj;
            }
            InterfaceC18170g interfaceC18170g2 = this.f51618v.f51533r;
            String str2 = this.f51619w;
            this.f51616t = 2;
            obj = InterfaceC18170g.a.m96645o(interfaceC18170g2, str2, null, null, null, this, 14, null);
            if (obj == m142578e) {
                return m142578e;
            }
            return (PersonalizeChannel) obj;
        }

        /* renamed from: r */
        public final Continuation m53104r(Continuation continuation) {
            return new C9840r(this.f51617u, this.f51618v, this.f51619w, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((C9840r) m53104r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.ChannelPresenterImpl$s */
    /* loaded from: classes5.dex */
    static final class C9841s extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ String f51621r;

        /* renamed from: s */
        final /* synthetic */ boolean f51622s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9841s(String str, boolean z11) {
            super(1);
            this.f51621r = str;
            this.f51622s = z11;
        }

        /* renamed from: a */
        public final void m53106a(Throwable th2) {
            AbstractC19074t.m100208f(th2, "throwable");
            ((InterfaceC22745g) ChannelPresenterImpl.this.m52968s()).mo54066O4(th2, this.f51621r, this.f51622s);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53106a((Throwable) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.ChannelPresenterImpl$t */
    /* loaded from: classes5.dex */
    static final class C9842t extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ String f51624r;

        /* renamed from: s */
        final /* synthetic */ boolean f51625s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9842t(String str, boolean z11) {
            super(1);
            this.f51624r = str;
            this.f51625s = z11;
        }

        /* renamed from: a */
        public final void m53107a(PersonalizeChannel personalizeChannel) {
            AbstractC19074t.m100208f(personalizeChannel, "personalize");
            ((InterfaceC22745g) ChannelPresenterImpl.this.m52968s()).mo54066O4(personalizeChannel, this.f51624r, this.f51625s);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53107a((PersonalizeChannel) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.ChannelPresenterImpl$u */
    /* loaded from: classes5.dex */
    static final class C9843u extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f51626t;

        /* renamed from: u */
        final /* synthetic */ SimilarChannel f51627u;

        /* renamed from: v */
        final /* synthetic */ int f51628v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9843u(SimilarChannel similarChannel, int i11, Continuation continuation) {
            super(2, continuation);
            this.f51627u = similarChannel;
            this.f51628v = i11;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new C9843u(this.f51627u, this.f51628v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f51626t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                this.f51626t = 1;
                if (DelayKt.m112666b(1000L, this) == m142578e) {
                    return m142578e;
                }
            }
            C19205a.m100678X(C19205a.f95429a, this.f51627u.m51200a(), null, AbstractC29094b.m145341c(this.f51628v), "otherChannel", 2, null);
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C9843u) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    public ChannelPresenterImpl(InterfaceC18170g interfaceC18170g, C21998a c21998a) {
        AbstractC19074t.m100208f(interfaceC18170g, "restRepository");
        AbstractC19074t.m100208f(c21998a, "authWs");
        this.f51533r = interfaceC18170g;
        this.f51534s = c21998a;
        this.f51535t = true;
        this.f51537v = new NetworkReceiver(new C9831i(), new C9832j());
        this.f51538w = "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: J */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m53057J(List list, Continuation continuation) {
        C9824b c9824b;
        Object m142578e;
        int i11;
        Object obj;
        if (continuation instanceof C9824b) {
            c9824b = (C9824b) continuation;
            int i12 = c9824b.f51562v;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                c9824b.f51562v = i12 - Integer.MIN_VALUE;
                Object obj2 = c9824b.f51560t;
                m142578e = AbstractC28298d.m142578e();
                i11 = c9824b.f51562v;
                if (i11 == 0) {
                    if (i11 == 1) {
                        list = (List) c9824b.f51559s;
                        AbstractC24862s.m129228b(obj2);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj2);
                    List list2 = list;
                    if (list2 != null && !list2.isEmpty()) {
                        ArrayList arrayList = new ArrayList();
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            String m51202c = ((SimilarChannel) it.next()).m51202c();
                            if (m51202c != null) {
                                arrayList.add(m51202c);
                            }
                        }
                        InterfaceC18170g interfaceC18170g = this.f51533r;
                        c9824b.f51559s = list;
                        c9824b.f51562v = 1;
                        obj2 = interfaceC18170g.mo96560G0(arrayList, c9824b);
                        if (obj2 == m142578e) {
                            return m142578e;
                        }
                    } else {
                        return new ArrayList();
                    }
                }
                List list3 = (List) obj2;
                ArrayList arrayList2 = new ArrayList();
                for (SimilarChannel similarChannel : list) {
                    Iterator it2 = list3.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            obj = it2.next();
                            if (AbstractC19074t.m100204b(((PersonalizeChannel) obj).m51102a(), similarChannel.m51202c())) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    PersonalizeChannel personalizeChannel = (PersonalizeChannel) obj;
                    if (personalizeChannel != null && !personalizeChannel.m51103b() && !personalizeChannel.m51104c()) {
                        similarChannel.m51208i(AbstractC29094b.m145339a(false));
                        arrayList2.add(similarChannel);
                    }
                }
                return arrayList2;
            }
        }
        c9824b = new C9824b(continuation);
        Object obj22 = c9824b.f51560t;
        m142578e = AbstractC28298d.m142578e();
        i11 = c9824b.f51562v;
        if (i11 == 0) {
        }
        List list32 = (List) obj22;
        ArrayList arrayList22 = new ArrayList();
        while (r7.hasNext()) {
        }
        return arrayList22;
    }

    @Override // com.zing.zalo.shortvideo.p072ui.presenter.InterfaceC10054b
    /* renamed from: Nr */
    public void mo53060Nr() {
        BuildersKt__Builders_commonKt.m112540d(m52969u(), null, null, new C9825c(null), 3, null);
    }

    @Override // com.zing.zalo.shortvideo.p072ui.presenter.InterfaceC10054b
    /* renamed from: Q9 */
    public void mo53061Q9(String str) {
        AbstractC19074t.m100208f(str, "justWatchedId");
        BuildersKt__Builders_commonKt.m112540d(m52969u(), null, null, new C9823a(str, null), 3, null);
    }

    @Override // com.zing.zalo.shortvideo.p072ui.presenter.InterfaceC10054b
    /* renamed from: Qk */
    public void mo53062Qk(String str, String str2, boolean z11) {
        AbstractC19074t.m100208f(str, "similarChannelId");
        m52966n(new C9840r(z11, this, str, null), new C9841s(str2, z11), new C9842t(str2, z11));
    }

    @Override // com.zing.zalo.shortvideo.p072ui.presenter.BasePresenterImpl, androidx.lifecycle.InterfaceC1767f
    /* renamed from: Zv */
    public void mo8648Zv(InterfaceC1801w interfaceC1801w) {
        AbstractC19074t.m100208f(interfaceC1801w, "owner");
        super.mo8648Zv(interfaceC1801w);
        if (((InterfaceC22745g) m52968s()).getContext() != null) {
            this.f51537v.mo53687g();
        }
        BasePresenterImpl.m52964r(this, false, 1, null);
    }

    @Override // com.zing.zalo.shortvideo.p072ui.presenter.InterfaceC10054b
    /* renamed from: dp */
    public String mo53063dp() {
        return this.f51538w;
    }

    @Override // com.zing.zalo.shortvideo.p072ui.presenter.InterfaceC10054b
    /* renamed from: fD */
    public void mo53064fD(boolean z11, boolean z12, boolean z13) {
        m52966n(new C9837o(z11, this, null), new C9838p(z11, z12, z13), new C9839q(z11, z12, z13));
    }

    @Override // com.zing.zalo.shortvideo.p072ui.presenter.InterfaceC10054b
    /* renamed from: fa */
    public void mo53065fa(SimilarChannel similarChannel, int i11) {
        AbstractC19074t.m100208f(similarChannel, "similarChannel");
        if (similarChannel.m51206g()) {
            return;
        }
        similarChannel.m51209j(true);
        if (this.f51536u == null) {
            this.f51536u = CoroutineScopeKt.m112637a(Dispatchers.m112680b().mo112823d0(SupervisorKt.m112864b(null, 1, null)));
        }
        CoroutineScope coroutineScope = this.f51536u;
        if (coroutineScope != null) {
            BuildersKt__Builders_commonKt.m112540d(coroutineScope, null, null, new C9843u(similarChannel, i11, null), 3, null);
        }
    }

    @Override // com.zing.zalo.shortvideo.p072ui.presenter.InterfaceC10054b
    /* renamed from: jH */
    public void mo53066jH() {
        if (this.f51538w.length() != 0) {
            BuildersKt__Builders_commonKt.m112540d(m52969u(), null, null, new C9833k(null), 3, null);
        }
    }

    @Override // com.zing.zalo.shortvideo.p072ui.presenter.InterfaceC10054b
    /* renamed from: q */
    public Channel mo53067q() {
        return this.f51539x;
    }

    @Override // com.zing.zalo.shortvideo.p072ui.presenter.InterfaceC10054b
    /* renamed from: q1 */
    public void mo53068q1(LoadMoreInfo loadMoreInfo) {
        AbstractC19074t.m100208f(loadMoreInfo, "loadMore");
        m52966n(new C9828f(loadMoreInfo, null), new C9829g(), new C9830h());
    }

    @Override // com.zing.zalo.shortvideo.p072ui.presenter.InterfaceC10054b
    /* renamed from: qs */
    public void mo53069qs(boolean z11) {
        m52966n(new C9834l(z11, this, null), new C9835m(z11), new C9836n(z11));
    }

    @Override // com.zing.zalo.shortvideo.p072ui.presenter.InterfaceC10054b
    /* renamed from: re */
    public void mo53070re(String str) {
        AbstractC19074t.m100208f(str, "id");
        BasePresenterImpl.m52963o(this, new C9826d(str, null), null, new C9827e(), 2, null);
    }

    @Override // com.zing.zalo.shortvideo.p072ui.presenter.InterfaceC10054b
    public void release() {
        CoroutineScope coroutineScope = this.f51536u;
        if (coroutineScope != null) {
            CoroutineScopeKt.m112639c(coroutineScope, null, 1, null);
        }
        this.f51536u = null;
    }

    @Override // com.zing.zalo.shortvideo.p072ui.presenter.BasePresenterImpl, com.zing.zalo.shortvideo.p072ui.presenter.InterfaceC10053a
    /* renamed from: uo */
    public void mo52970uo(Bundle bundle) {
        String str;
        Channel channel;
        String str2 = null;
        BasePresenterImpl.m52964r(this, false, 1, null);
        this.f51539x = null;
        if (bundle == null || (str = bundle.getString("CHANNEL_ID")) == null) {
            if (bundle != null && (channel = (Channel) bundle.getParcelable("CHANNEL")) != null) {
                str = channel.m50769l();
            } else {
                str = null;
            }
        }
        if (str == null) {
            str = "";
        }
        this.f51538w = str;
        if (bundle != null) {
            str2 = bundle.getString("xSource");
        }
        this.f51540y = str2;
    }

    @Override // com.zing.zalo.shortvideo.p072ui.presenter.BasePresenterImpl, androidx.lifecycle.InterfaceC1767f
    /* renamed from: wC */
    public void mo8650wC(InterfaceC1801w interfaceC1801w) {
        AbstractC19074t.m100208f(interfaceC1801w, "owner");
        super.mo8650wC(interfaceC1801w);
        Context context = ((InterfaceC22745g) m52968s()).getContext();
        if (context != null) {
            this.f51537v.mo53685d(context);
        }
    }

    @Override // com.zing.zalo.shortvideo.p072ui.presenter.InterfaceC10054b
    /* renamed from: yd */
    public boolean mo53071yd() {
        return this.f51534s.isValid();
    }
}
