package com.zing.zalo.shortvideo.p072ui.presenter;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import androidx.lifecycle.InterfaceC1801w;
import com.zing.zalo.shortvideo.data.model.C9440a;
import com.zing.zalo.shortvideo.data.model.Channel;
import com.zing.zalo.shortvideo.data.model.Comment;
import com.zing.zalo.shortvideo.data.model.LivestreamData;
import com.zing.zalo.shortvideo.data.model.LoadMoreInfo;
import com.zing.zalo.shortvideo.data.model.PersonalizeChannel;
import com.zing.zalo.shortvideo.data.model.PersonalizeStream;
import com.zing.zalo.shortvideo.data.model.Section;
import com.zing.zalo.shortvideo.data.remote.common.NetworkException;
import com.zing.zalo.shortvideo.data.remote.ws.call.LiveChanelStats;
import com.zing.zalo.shortvideo.data.remote.ws.response.GetCommentLiveRes;
import com.zing.zalo.shortvideo.data.remote.ws.response.InteractEventResponse;
import com.zing.zalo.shortvideo.p072ui.receiver.HeadsetReceiver;
import com.zing.zalo.shortvideo.p072ui.receiver.NetworkReceiver;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import e10.InterfaceC18170g;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19059j0;
import g20.C19205a;
import h10.C19700a;
import h10.C19707h;
import h10.InterfaceC19708i;
import h10.InterfaceC19713n;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import m20.InterfaceC22758j0;
import on0.AbstractC24340u;
import on0.AbstractC24341v;
import p10.EnumC24601e;
import pm0.AbstractC24862s;
import pm0.AbstractC24866w;
import pm0.C24848g0;
import pm0.C24860q;
import q20.C25090m;
import qm0.AbstractC25363p0;
import qm0.AbstractC25366r;
import qm0.AbstractC25368s;
import qm0.AbstractC25370t;
import v00.AbstractC27413h;
import v00.C27417l;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;
import x00.InterfaceC29280a;

/* loaded from: classes5.dex */
public final class LivestreamPresenterImpl extends BasePresenterImpl<InterfaceC22758j0> implements InterfaceC10056d, InterfaceC19713n, InterfaceC19708i {
    public static final C9902a Companion = new C9902a(null);

    /* renamed from: A */
    private int f51788A;

    /* renamed from: B */
    private Job f51789B;

    /* renamed from: C */
    private final MutableSharedFlow f51790C;

    /* renamed from: D */
    private NetworkReceiver f51791D;

    /* renamed from: E */
    private HeadsetReceiver f51792E;

    /* renamed from: r */
    private final InterfaceC18170g f51793r;

    /* renamed from: s */
    private final C19707h f51794s;

    /* renamed from: t */
    private final InterfaceC29280a f51795t;

    /* renamed from: u */
    private boolean f51796u;

    /* renamed from: v */
    private boolean f51797v;

    /* renamed from: w */
    private String f51798w;

    /* renamed from: x */
    private String f51799x;

    /* renamed from: y */
    private String f51800y;

    /* renamed from: z */
    private LivestreamData f51801z;

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.LivestreamPresenterImpl$a */
    /* loaded from: classes5.dex */
    public static final class C9902a {
        private C9902a() {
        }

        public /* synthetic */ C9902a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.LivestreamPresenterImpl$b */
    /* loaded from: classes5.dex */
    public static final class C9903b {

        /* renamed from: a */
        private final int f51802a;

        /* renamed from: b */
        private final String f51803b;

        /* renamed from: c */
        private final String f51804c;

        /* renamed from: d */
        private final String f51805d;

        public C9903b(int i11, String str, String str2, String str3) {
            AbstractC19074t.m100208f(str, "liveId");
            AbstractC19074t.m100208f(str2, "channelId");
            AbstractC19074t.m100208f(str3, "source");
            this.f51802a = i11;
            this.f51803b = str;
            this.f51804c = str2;
            this.f51805d = str3;
        }

        /* renamed from: a */
        public final String m53280a() {
            return this.f51804c;
        }

        /* renamed from: b */
        public final int m53281b() {
            return this.f51802a;
        }

        /* renamed from: c */
        public final String m53282c() {
            return this.f51803b;
        }

        /* renamed from: d */
        public final String m53283d() {
            return this.f51805d;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.LivestreamPresenterImpl$c */
    /* loaded from: classes5.dex */
    static final class C9904c extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f51806t;

        /* renamed from: u */
        final /* synthetic */ boolean f51807u;

        /* renamed from: v */
        final /* synthetic */ LivestreamPresenterImpl f51808v;

        /* renamed from: w */
        final /* synthetic */ Channel f51809w;

        /* renamed from: x */
        final /* synthetic */ String f51810x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9904c(boolean z11, LivestreamPresenterImpl livestreamPresenterImpl, Channel channel, String str, Continuation continuation) {
            super(1, continuation);
            this.f51807u = z11;
            this.f51808v = livestreamPresenterImpl;
            this.f51809w = channel;
            this.f51810x = str;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f51806t;
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
            if (this.f51807u) {
                InterfaceC18170g interfaceC18170g = this.f51808v.f51793r;
                String m50769l = this.f51809w.m50769l();
                String str = this.f51810x;
                this.f51806t = 1;
                obj = InterfaceC18170g.a.m96631a(interfaceC18170g, m50769l, null, null, str, null, null, this, 54, null);
                if (obj == m142578e) {
                    return m142578e;
                }
                return (PersonalizeChannel) obj;
            }
            InterfaceC18170g interfaceC18170g2 = this.f51808v.f51793r;
            String m50769l2 = this.f51809w.m50769l();
            String str2 = this.f51810x;
            this.f51806t = 2;
            obj = InterfaceC18170g.a.m96645o(interfaceC18170g2, m50769l2, null, null, str2, this, 6, null);
            if (obj == m142578e) {
                return m142578e;
            }
            return (PersonalizeChannel) obj;
        }

        /* renamed from: r */
        public final Continuation m53284r(Continuation continuation) {
            return new C9904c(this.f51807u, this.f51808v, this.f51809w, this.f51810x, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((C9904c) m53284r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.LivestreamPresenterImpl$d */
    /* loaded from: classes5.dex */
    static final class C9905d extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ boolean f51812r;

        /* renamed from: s */
        final /* synthetic */ Channel f51813s;

        /* renamed from: t */
        final /* synthetic */ boolean f51814t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9905d(boolean z11, Channel channel, boolean z12) {
            super(1);
            this.f51812r = z11;
            this.f51813s = channel;
            this.f51814t = z12;
        }

        /* renamed from: a */
        public final void m53286a(Throwable th2) {
            AbstractC19074t.m100208f(th2, "throwable");
            ((InterfaceC22758j0) LivestreamPresenterImpl.this.m52968s()).mo54461Eg(this.f51812r, this.f51813s, th2);
            LivestreamPresenterImpl.this.m53250T(this.f51814t, this.f51812r, this.f51813s.m50769l(), LivestreamPresenterImpl.this.f51794s.m103430x(), false);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53286a((Throwable) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.LivestreamPresenterImpl$e */
    /* loaded from: classes5.dex */
    static final class C9906e extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ String f51816r;

        /* renamed from: s */
        final /* synthetic */ boolean f51817s;

        /* renamed from: t */
        final /* synthetic */ Channel f51818t;

        /* renamed from: u */
        final /* synthetic */ boolean f51819u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9906e(String str, boolean z11, Channel channel, boolean z12) {
            super(1);
            this.f51816r = str;
            this.f51817s = z11;
            this.f51818t = channel;
            this.f51819u = z12;
        }

        /* renamed from: a */
        public final void m53287a(PersonalizeChannel personalizeChannel) {
            AbstractC19074t.m100208f(personalizeChannel, "personalize");
            LivestreamPresenterImpl.this.f51794s.m103430x().m51607i(this.f51816r, this.f51817s);
            ((InterfaceC22758j0) LivestreamPresenterImpl.this.m52968s()).mo54461Eg(this.f51817s, this.f51818t, personalizeChannel);
            LivestreamPresenterImpl.this.m53250T(this.f51819u, this.f51817s, this.f51818t.m50769l(), LivestreamPresenterImpl.this.f51794s.m103430x(), true);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53287a((PersonalizeChannel) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.LivestreamPresenterImpl$f */
    /* loaded from: classes5.dex */
    public static final class C9907f extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f51820t;

        /* renamed from: v */
        final /* synthetic */ List f51822v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9907f(List list, Continuation continuation) {
            super(1, continuation);
            this.f51822v = list;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f51820t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                InterfaceC18170g interfaceC18170g = LivestreamPresenterImpl.this.f51793r;
                List list = this.f51822v;
                this.f51820t = 1;
                obj = interfaceC18170g.mo96555E(list, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            return obj;
        }

        /* renamed from: r */
        public final Continuation m53288r(Continuation continuation) {
            return new C9907f(this.f51822v, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((C9907f) m53288r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.LivestreamPresenterImpl$g */
    /* loaded from: classes5.dex */
    public static final class C9908g implements HeadsetReceiver.InterfaceC10075a {
        C9908g() {
        }

        @Override // com.zing.zalo.shortvideo.p072ui.receiver.HeadsetReceiver.InterfaceC10075a
        /* renamed from: a */
        public void mo53290a(boolean z11) {
            if (z11) {
                if (!LivestreamPresenterImpl.this.f51797v) {
                    LivestreamPresenterImpl.this.f51797v = true;
                    ((InterfaceC22758j0) LivestreamPresenterImpl.this.m52968s()).mo54466W0(LivestreamPresenterImpl.this.f51797v);
                    return;
                }
                return;
            }
            if (LivestreamPresenterImpl.this.f51797v) {
                LivestreamPresenterImpl.this.f51797v = false;
                ((InterfaceC22758j0) LivestreamPresenterImpl.this.m52968s()).mo54466W0(LivestreamPresenterImpl.this.f51797v);
            }
        }

        @Override // com.zing.zalo.shortvideo.p072ui.receiver.HeadsetReceiver.InterfaceC10075a
        /* renamed from: b */
        public void mo53291b(int[] iArr) {
            HeadsetReceiver.InterfaceC10075a.a.m53725a(this, iArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.LivestreamPresenterImpl$h */
    /* loaded from: classes5.dex */
    public static final class C9909h extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f51824t;

        /* renamed from: v */
        final /* synthetic */ String f51826v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9909h(String str, Continuation continuation) {
            super(1, continuation);
            this.f51826v = str;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f51824t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                InterfaceC18170g interfaceC18170g = LivestreamPresenterImpl.this.f51793r;
                String str = this.f51826v;
                this.f51824t = 1;
                obj = interfaceC18170g.mo96600k(str, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            return obj;
        }

        /* renamed from: r */
        public final Continuation m53292r(Continuation continuation) {
            return new C9909h(this.f51826v, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((C9909h) m53292r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.LivestreamPresenterImpl$i */
    /* loaded from: classes5.dex */
    static final class C9910i extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ C19059j0 f51827q;

        /* renamed from: r */
        final /* synthetic */ C19059j0 f51828r;

        /* renamed from: s */
        final /* synthetic */ C19059j0 f51829s;

        /* renamed from: t */
        final /* synthetic */ C19059j0 f51830t;

        /* renamed from: u */
        final /* synthetic */ LivestreamPresenterImpl f51831u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9910i(C19059j0 c19059j0, C19059j0 c19059j02, C19059j0 c19059j03, C19059j0 c19059j04, LivestreamPresenterImpl livestreamPresenterImpl) {
            super(1);
            this.f51827q = c19059j0;
            this.f51828r = c19059j02;
            this.f51829s = c19059j03;
            this.f51830t = c19059j04;
            this.f51831u = livestreamPresenterImpl;
        }

        /* renamed from: a */
        public final void m53294a(Throwable th2) {
            AbstractC19074t.m100208f(th2, "throwable");
            this.f51827q.f94941p = th2;
            LivestreamPresenterImpl.m53249S(this.f51831u, (LivestreamData) this.f51828r.f94941p, th2, (Section) this.f51829s.f94941p, (Throwable) this.f51830t.f94941p);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53294a((Throwable) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.LivestreamPresenterImpl$j */
    /* loaded from: classes5.dex */
    static final class C9911j extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ C19059j0 f51833r;

        /* renamed from: s */
        final /* synthetic */ C19059j0 f51834s;

        /* renamed from: t */
        final /* synthetic */ C19059j0 f51835t;

        /* renamed from: u */
        final /* synthetic */ C19059j0 f51836u;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.shortvideo.ui.presenter.LivestreamPresenterImpl$j$a */
        /* loaded from: classes5.dex */
        public static final class a extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            final /* synthetic */ C19059j0 f51837q;

            /* renamed from: r */
            final /* synthetic */ LivestreamData f51838r;

            /* renamed from: s */
            final /* synthetic */ C19059j0 f51839s;

            /* renamed from: t */
            final /* synthetic */ C19059j0 f51840t;

            /* renamed from: u */
            final /* synthetic */ C19059j0 f51841u;

            /* renamed from: v */
            final /* synthetic */ LivestreamPresenterImpl f51842v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C19059j0 c19059j0, LivestreamData livestreamData, C19059j0 c19059j02, C19059j0 c19059j03, C19059j0 c19059j04, LivestreamPresenterImpl livestreamPresenterImpl) {
                super(1);
                this.f51837q = c19059j0;
                this.f51838r = livestreamData;
                this.f51839s = c19059j02;
                this.f51840t = c19059j03;
                this.f51841u = c19059j04;
                this.f51842v = livestreamPresenterImpl;
            }

            /* renamed from: a */
            public final void m53296a(Throwable th2) {
                AbstractC19074t.m100208f(th2, "it");
                C19059j0 c19059j0 = this.f51837q;
                LivestreamData livestreamData = this.f51838r;
                c19059j0.f94941p = livestreamData;
                LivestreamPresenterImpl.m53249S(this.f51842v, livestreamData, (Throwable) this.f51839s.f94941p, (Section) this.f51840t.f94941p, (Throwable) this.f51841u.f94941p);
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: i9 */
            public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                m53296a((Throwable) obj);
                return C24848g0.f119245a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.shortvideo.ui.presenter.LivestreamPresenterImpl$j$b */
        /* loaded from: classes5.dex */
        public static final class b extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            final /* synthetic */ C19059j0 f51843q;

            /* renamed from: r */
            final /* synthetic */ LivestreamData f51844r;

            /* renamed from: s */
            final /* synthetic */ C19059j0 f51845s;

            /* renamed from: t */
            final /* synthetic */ C19059j0 f51846t;

            /* renamed from: u */
            final /* synthetic */ C19059j0 f51847u;

            /* renamed from: v */
            final /* synthetic */ LivestreamPresenterImpl f51848v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(C19059j0 c19059j0, LivestreamData livestreamData, C19059j0 c19059j02, C19059j0 c19059j03, C19059j0 c19059j04, LivestreamPresenterImpl livestreamPresenterImpl) {
                super(1);
                this.f51843q = c19059j0;
                this.f51844r = livestreamData;
                this.f51845s = c19059j02;
                this.f51846t = c19059j03;
                this.f51847u = c19059j04;
                this.f51848v = livestreamPresenterImpl;
            }

            /* renamed from: a */
            public final void m53297a(List list) {
                Object obj;
                AbstractC19074t.m100208f(list, "personalizes");
                LivestreamData livestreamData = this.f51844r;
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (AbstractC19074t.m100204b(((PersonalizeStream) obj).m51115b(), livestreamData.m51016f())) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                PersonalizeStream personalizeStream = (PersonalizeStream) obj;
                if (personalizeStream != null) {
                    this.f51844r.m50989D(personalizeStream);
                }
                C19059j0 c19059j0 = this.f51843q;
                LivestreamData livestreamData2 = this.f51844r;
                c19059j0.f94941p = livestreamData2;
                LivestreamPresenterImpl.m53249S(this.f51848v, livestreamData2, (Throwable) this.f51845s.f94941p, (Section) this.f51846t.f94941p, (Throwable) this.f51847u.f94941p);
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: i9 */
            public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                m53297a((List) obj);
                return C24848g0.f119245a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9911j(C19059j0 c19059j0, C19059j0 c19059j02, C19059j0 c19059j03, C19059j0 c19059j04) {
            super(1);
            this.f51833r = c19059j0;
            this.f51834s = c19059j02;
            this.f51835t = c19059j03;
            this.f51836u = c19059j04;
        }

        /* renamed from: a */
        public final void m53295a(LivestreamData livestreamData) {
            List m131496e;
            AbstractC19074t.m100208f(livestreamData, "stream");
            LivestreamPresenterImpl livestreamPresenterImpl = LivestreamPresenterImpl.this;
            String m51012c = livestreamData.m51012c();
            if (m51012c == null) {
                m51012c = "";
            }
            if (livestreamPresenterImpl.m53254X(m51012c)) {
                LivestreamPresenterImpl.this.f51794s.m103416E();
            }
            m131496e = AbstractC25366r.m131496e(livestreamData.m51016f());
            LivestreamPresenterImpl livestreamPresenterImpl2 = LivestreamPresenterImpl.this;
            livestreamPresenterImpl2.m53248R(m131496e, new a(this.f51833r, livestreamData, this.f51834s, this.f51835t, this.f51836u, livestreamPresenterImpl2), new b(this.f51833r, livestreamData, this.f51834s, this.f51835t, this.f51836u, LivestreamPresenterImpl.this));
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53295a((LivestreamData) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.LivestreamPresenterImpl$k */
    /* loaded from: classes5.dex */
    static final class C9912k extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f51849t;

        /* renamed from: v */
        final /* synthetic */ LoadMoreInfo f51851v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9912k(LoadMoreInfo loadMoreInfo, Continuation continuation) {
            super(1, continuation);
            this.f51851v = loadMoreInfo;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f51849t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                InterfaceC18170g interfaceC18170g = LivestreamPresenterImpl.this.f51793r;
                LoadMoreInfo loadMoreInfo = this.f51851v;
                this.f51849t = 1;
                obj = interfaceC18170g.mo96593g0(loadMoreInfo, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            return obj;
        }

        /* renamed from: r */
        public final Continuation m53298r(Continuation continuation) {
            return new C9912k(this.f51851v, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((C9912k) m53298r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.LivestreamPresenterImpl$l */
    /* loaded from: classes5.dex */
    static final class C9913l extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ C19059j0 f51853r;

        /* renamed from: s */
        final /* synthetic */ C19059j0 f51854s;

        /* renamed from: t */
        final /* synthetic */ C19059j0 f51855t;

        /* renamed from: u */
        final /* synthetic */ C19059j0 f51856u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9913l(C19059j0 c19059j0, C19059j0 c19059j02, C19059j0 c19059j03, C19059j0 c19059j04) {
            super(1);
            this.f51853r = c19059j0;
            this.f51854s = c19059j02;
            this.f51855t = c19059j03;
            this.f51856u = c19059j04;
        }

        /* renamed from: a */
        public final void m53300a(Throwable th2) {
            AbstractC19074t.m100208f(th2, "it");
            if (LivestreamPresenterImpl.this.f51801z == null) {
                ((InterfaceC22758j0) LivestreamPresenterImpl.this.m52968s()).mo54474d(th2);
            } else {
                this.f51853r.f94941p = th2;
                LivestreamPresenterImpl.m53249S(LivestreamPresenterImpl.this, (LivestreamData) this.f51854s.f94941p, (Throwable) this.f51855t.f94941p, (Section) this.f51856u.f94941p, th2);
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53300a((Throwable) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.LivestreamPresenterImpl$m */
    /* loaded from: classes5.dex */
    static final class C9914m extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ C19059j0 f51858r;

        /* renamed from: s */
        final /* synthetic */ C19059j0 f51859s;

        /* renamed from: t */
        final /* synthetic */ C19059j0 f51860t;

        /* renamed from: u */
        final /* synthetic */ C19059j0 f51861u;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.shortvideo.ui.presenter.LivestreamPresenterImpl$m$a */
        /* loaded from: classes5.dex */
        public static final class a extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            final /* synthetic */ LivestreamPresenterImpl f51862q;

            /* renamed from: r */
            final /* synthetic */ Section f51863r;

            /* renamed from: s */
            final /* synthetic */ C19059j0 f51864s;

            /* renamed from: t */
            final /* synthetic */ C19059j0 f51865t;

            /* renamed from: u */
            final /* synthetic */ C19059j0 f51866u;

            /* renamed from: v */
            final /* synthetic */ C19059j0 f51867v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(LivestreamPresenterImpl livestreamPresenterImpl, Section section, C19059j0 c19059j0, C19059j0 c19059j02, C19059j0 c19059j03, C19059j0 c19059j04) {
                super(1);
                this.f51862q = livestreamPresenterImpl;
                this.f51863r = section;
                this.f51864s = c19059j0;
                this.f51865t = c19059j02;
                this.f51866u = c19059j03;
                this.f51867v = c19059j04;
            }

            /* renamed from: a */
            public final void m53302a(Throwable th2) {
                AbstractC19074t.m100208f(th2, "it");
                if (this.f51862q.f51801z == null) {
                    ((InterfaceC22758j0) this.f51862q.m52968s()).mo54476e5(this.f51863r);
                    return;
                }
                C19059j0 c19059j0 = this.f51864s;
                Section section = this.f51863r;
                c19059j0.f94941p = section;
                LivestreamPresenterImpl.m53249S(this.f51862q, (LivestreamData) this.f51865t.f94941p, (Throwable) this.f51866u.f94941p, section, (Throwable) this.f51867v.f94941p);
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: i9 */
            public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                m53302a((Throwable) obj);
                return C24848g0.f119245a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.shortvideo.ui.presenter.LivestreamPresenterImpl$m$b */
        /* loaded from: classes5.dex */
        public static final class b extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            final /* synthetic */ Section f51868q;

            /* renamed from: r */
            final /* synthetic */ LivestreamPresenterImpl f51869r;

            /* renamed from: s */
            final /* synthetic */ C19059j0 f51870s;

            /* renamed from: t */
            final /* synthetic */ C19059j0 f51871t;

            /* renamed from: u */
            final /* synthetic */ C19059j0 f51872u;

            /* renamed from: v */
            final /* synthetic */ C19059j0 f51873v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(Section section, LivestreamPresenterImpl livestreamPresenterImpl, C19059j0 c19059j0, C19059j0 c19059j02, C19059j0 c19059j03, C19059j0 c19059j04) {
                super(1);
                this.f51868q = section;
                this.f51869r = livestreamPresenterImpl;
                this.f51870s = c19059j0;
                this.f51871t = c19059j02;
                this.f51872u = c19059j03;
                this.f51873v = c19059j04;
            }

            /* renamed from: a */
            public final void m53303a(List list) {
                AbstractC19074t.m100208f(list, "personalizes");
                int i11 = 0;
                for (Object obj : this.f51868q.m51168m()) {
                    int i12 = i11 + 1;
                    if (i11 < 0) {
                        AbstractC25368s.m131509q();
                    }
                    ((LivestreamData) obj).m50989D((PersonalizeStream) list.get(i11));
                    i11 = i12;
                }
                if (this.f51869r.f51801z == null) {
                    ((InterfaceC22758j0) this.f51869r.m52968s()).mo54476e5(this.f51868q);
                    return;
                }
                C19059j0 c19059j0 = this.f51870s;
                Section section = this.f51868q;
                c19059j0.f94941p = section;
                LivestreamPresenterImpl.m53249S(this.f51869r, (LivestreamData) this.f51871t.f94941p, (Throwable) this.f51872u.f94941p, section, (Throwable) this.f51873v.f94941p);
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: i9 */
            public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                m53303a((List) obj);
                return C24848g0.f119245a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9914m(C19059j0 c19059j0, C19059j0 c19059j02, C19059j0 c19059j03, C19059j0 c19059j04) {
            super(1);
            this.f51858r = c19059j0;
            this.f51859s = c19059j02;
            this.f51860t = c19059j03;
            this.f51861u = c19059j04;
        }

        /* renamed from: a */
        public final void m53301a(Section section) {
            int m131511r;
            AbstractC19074t.m100208f(section, "section");
            List m51168m = section.m51168m();
            m131511r = AbstractC25370t.m131511r(m51168m, 10);
            ArrayList arrayList = new ArrayList(m131511r);
            Iterator it = m51168m.iterator();
            while (it.hasNext()) {
                arrayList.add(((LivestreamData) it.next()).m51016f());
            }
            LivestreamPresenterImpl livestreamPresenterImpl = LivestreamPresenterImpl.this;
            livestreamPresenterImpl.m53248R(arrayList, new a(livestreamPresenterImpl, section, this.f51858r, this.f51859s, this.f51860t, this.f51861u), new b(section, LivestreamPresenterImpl.this, this.f51858r, this.f51859s, this.f51860t, this.f51861u));
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53301a((Section) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.LivestreamPresenterImpl$n */
    /* loaded from: classes5.dex */
    static final class C9915n extends AbstractC19075u implements InterfaceC18494a {
        C9915n() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m53304a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m53304a() {
            if (LivestreamPresenterImpl.this.f51796u) {
                LivestreamPresenterImpl.this.f51796u = false;
                ((InterfaceC22758j0) LivestreamPresenterImpl.this.m52968s()).mo54472b(LivestreamPresenterImpl.this.f51796u);
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.LivestreamPresenterImpl$o */
    /* loaded from: classes5.dex */
    static final class C9916o extends AbstractC19075u implements InterfaceC18494a {
        C9916o() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m53305a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m53305a() {
            if (!LivestreamPresenterImpl.this.f51796u) {
                LivestreamPresenterImpl.this.f51796u = true;
                ((InterfaceC22758j0) LivestreamPresenterImpl.this.m52968s()).mo54472b(LivestreamPresenterImpl.this.f51796u);
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.LivestreamPresenterImpl$p */
    /* loaded from: classes5.dex */
    static final class C9917p extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f51876t;

        /* renamed from: v */
        final /* synthetic */ String f51878v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9917p(String str, Continuation continuation) {
            super(2, continuation);
            this.f51878v = str;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new C9917p(this.f51878v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f51876t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                MutableSharedFlow mutableSharedFlow = LivestreamPresenterImpl.this.f51790C;
                C9903b c9903b = new C9903b(3, this.f51878v, "", "");
                this.f51876t = 1;
                if (mutableSharedFlow.mo12109b(c9903b, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C9917p) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.LivestreamPresenterImpl$q */
    /* loaded from: classes5.dex */
    static final class C9918q extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f51879t;

        /* renamed from: v */
        final /* synthetic */ String f51881v;

        /* renamed from: w */
        final /* synthetic */ InterfaceC18505l f51882w;

        /* renamed from: x */
        final /* synthetic */ String f51883x;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.shortvideo.ui.presenter.LivestreamPresenterImpl$q$a */
        /* loaded from: classes5.dex */
        public static final class a extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f51884t;

            /* renamed from: u */
            final /* synthetic */ LivestreamPresenterImpl f51885u;

            /* renamed from: v */
            final /* synthetic */ String f51886v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(LivestreamPresenterImpl livestreamPresenterImpl, String str, Continuation continuation) {
                super(2, continuation);
                this.f51885u = livestreamPresenterImpl;
                this.f51886v = str;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new a(this.f51885u, this.f51886v, continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                Object m142578e;
                m142578e = AbstractC28298d.m142578e();
                int i11 = this.f51884t;
                if (i11 != 0) {
                    if (i11 == 1) {
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    InterfaceC18170g interfaceC18170g = this.f51885u.f51793r;
                    String str = this.f51886v;
                    this.f51884t = 1;
                    obj = interfaceC18170g.mo96615s(str, this);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                }
                return obj;
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.shortvideo.ui.presenter.LivestreamPresenterImpl$q$b */
        /* loaded from: classes5.dex */
        public static final class b extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ InterfaceC18505l f51887q;

            /* renamed from: r */
            final /* synthetic */ String f51888r;

            /* renamed from: s */
            final /* synthetic */ String f51889s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(InterfaceC18505l interfaceC18505l, String str, String str2) {
                super(0);
                this.f51887q = interfaceC18505l;
                this.f51888r = str;
                this.f51889s = str2;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: V4 */
            public /* bridge */ /* synthetic */ Object mo12V4() {
                m53309a();
                return C24848g0.f119245a;
            }

            /* renamed from: a */
            public final void m53309a() {
                InterfaceC18505l interfaceC18505l = this.f51887q;
                String str = this.f51888r;
                if (str == null) {
                    str = this.f51889s;
                }
                interfaceC18505l.mo205i9(str);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.shortvideo.ui.presenter.LivestreamPresenterImpl$q$c */
        /* loaded from: classes5.dex */
        public static final class c extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ InterfaceC18505l f51890q;

            /* renamed from: r */
            final /* synthetic */ String f51891r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(InterfaceC18505l interfaceC18505l, String str) {
                super(0);
                this.f51890q = interfaceC18505l;
                this.f51891r = str;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: V4 */
            public /* bridge */ /* synthetic */ Object mo12V4() {
                m53310a();
                return C24848g0.f119245a;
            }

            /* renamed from: a */
            public final void m53310a() {
                this.f51890q.mo205i9(this.f51891r);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9918q(String str, InterfaceC18505l interfaceC18505l, String str2, Continuation continuation) {
            super(2, continuation);
            this.f51881v = str;
            this.f51882w = interfaceC18505l;
            this.f51883x = str2;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new C9918q(this.f51881v, this.f51882w, this.f51883x, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f51879t;
            try {
            } catch (Exception unused) {
                LivestreamPresenterImpl livestreamPresenterImpl = LivestreamPresenterImpl.this;
                c cVar = new c(this.f51882w, this.f51883x);
                this.f51879t = 3;
                if (livestreamPresenterImpl.m52971w(cVar, this) == m142578e) {
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
                a aVar = new a(LivestreamPresenterImpl.this, this.f51881v, null);
                this.f51879t = 1;
                obj = TimeoutKt.m112879d(1000L, aVar, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            LivestreamPresenterImpl livestreamPresenterImpl2 = LivestreamPresenterImpl.this;
            b bVar = new b(this.f51882w, (String) obj, this.f51883x);
            this.f51879t = 2;
            if (livestreamPresenterImpl2.m52971w(bVar, this) == m142578e) {
                return m142578e;
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C9918q) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.LivestreamPresenterImpl$r */
    /* loaded from: classes5.dex */
    static final class C9919r extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: r */
        final /* synthetic */ String f51893r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9919r(String str) {
            super(2);
            this.f51893r = str;
        }

        /* renamed from: a */
        public final void m53311a(GetCommentLiveRes.CommentData commentData, C9440a c9440a) {
            Long l11;
            List m131506n;
            AbstractC19074t.m100208f(c9440a, "comment");
            String str = null;
            if (commentData != null) {
                l11 = commentData.m51643a();
            } else {
                l11 = null;
            }
            if (l11 == null) {
                InterfaceC22758j0 interfaceC22758j0 = (InterfaceC22758j0) LivestreamPresenterImpl.this.m52968s();
                String str2 = this.f51893r;
                m131506n = AbstractC25368s.m131506n(String.valueOf(c9440a.m51401d()));
                interfaceC22758j0.mo54479ho(str2, m131506n);
                InterfaceC22758j0 interfaceC22758j02 = (InterfaceC22758j0) LivestreamPresenterImpl.this.m52968s();
                Context context = ((InterfaceC22758j0) LivestreamPresenterImpl.this.m52968s()).getContext();
                if (context != null) {
                    str = context.getString(AbstractC27413h.zch_error_send_comment_fail);
                }
                interfaceC22758j02.mo54478gs(str);
                return;
            }
            c9440a.m51405h(commentData.m51643a().toString());
            String m51645c = commentData.m51645c();
            if (m51645c != null && m51645c.length() != 0) {
                InterfaceC22758j0 interfaceC22758j03 = (InterfaceC22758j0) LivestreamPresenterImpl.this.m52968s();
                Long m51644b = commentData.m51644b();
                if (m51644b != null) {
                    str = m51644b.toString();
                }
                interfaceC22758j03.mo54465Sz(str, commentData.m51645c());
                return;
            }
            c9440a.m51406i(false);
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m53311a((GetCommentLiveRes.CommentData) obj, (C9440a) obj2);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.LivestreamPresenterImpl$s */
    /* loaded from: classes5.dex */
    public static final class C9920s extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f51894t;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.shortvideo.ui.presenter.LivestreamPresenterImpl$s$a */
        /* loaded from: classes5.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ LivestreamPresenterImpl f51896p;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.zing.zalo.shortvideo.ui.presenter.LivestreamPresenterImpl$s$a$a, reason: collision with other inner class name */
            /* loaded from: classes5.dex */
            public static final class C32737a extends AbstractC19075u implements InterfaceC18505l {

                /* renamed from: q */
                final /* synthetic */ String f51897q;

                /* renamed from: r */
                final /* synthetic */ LivestreamPresenterImpl f51898r;

                /* renamed from: s */
                final /* synthetic */ String f51899s;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C32737a(String str, LivestreamPresenterImpl livestreamPresenterImpl, String str2) {
                    super(1);
                    this.f51897q = str;
                    this.f51898r = livestreamPresenterImpl;
                    this.f51899s = str2;
                }

                /* renamed from: a */
                public final void m53314a(String str) {
                    AbstractC19074t.m100208f(str, "it");
                    if (AbstractC19074t.m100204b(this.f51897q, this.f51898r.f51798w)) {
                        ((InterfaceC22758j0) this.f51898r.m52968s()).mo54470a8(this.f51897q, this.f51899s, this.f51898r.f51788A);
                        this.f51898r.f51788A = 0;
                    }
                }

                @Override // en0.InterfaceC18505l
                /* renamed from: i9 */
                public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                    m53314a((String) obj);
                    return C24848g0.f119245a;
                }
            }

            a(LivestreamPresenterImpl livestreamPresenterImpl) {
                this.f51896p = livestreamPresenterImpl;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo12109b(C9903b c9903b, Continuation continuation) {
                int m53281b = c9903b.m53281b();
                String m53282c = c9903b.m53282c();
                String m53283d = c9903b.m53283d();
                String m53280a = c9903b.m53280a();
                if (2 == m53281b) {
                    this.f51896p.m53253W(m53282c, false, m53283d + "(debounce)");
                } else if (3 == m53281b) {
                    this.f51896p.f51794s.m103415D(m53282c, 1, this.f51896p.f51788A, new C32737a(m53282c, this.f51896p, m53280a));
                }
                return C24848g0.f119245a;
            }
        }

        C9920s(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new C9920s(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f51894t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                Flow m113297o = FlowKt.m113297o(LivestreamPresenterImpl.this.f51790C, 500L);
                a aVar = new a(LivestreamPresenterImpl.this);
                this.f51894t = 1;
                if (m113297o.mo97893a(aVar, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C9920s) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.LivestreamPresenterImpl$t */
    /* loaded from: classes5.dex */
    static final class C9921t extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f51900t;

        /* renamed from: v */
        final /* synthetic */ String f51902v;

        /* renamed from: w */
        final /* synthetic */ String f51903w;

        /* renamed from: x */
        final /* synthetic */ String f51904x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9921t(String str, String str2, String str3, Continuation continuation) {
            super(2, continuation);
            this.f51902v = str;
            this.f51903w = str2;
            this.f51904x = str3;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new C9921t(this.f51902v, this.f51903w, this.f51904x, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f51900t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                MutableSharedFlow mutableSharedFlow = LivestreamPresenterImpl.this.f51790C;
                C9903b c9903b = new C9903b(2, this.f51902v, this.f51903w, this.f51904x);
                this.f51900t = 1;
                if (mutableSharedFlow.mo12109b(c9903b, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C9921t) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    public LivestreamPresenterImpl(InterfaceC18170g interfaceC18170g, C19707h c19707h, InterfaceC29280a interfaceC29280a) {
        AbstractC19074t.m100208f(interfaceC18170g, "restRepository");
        AbstractC19074t.m100208f(c19707h, "fetchStream");
        AbstractC19074t.m100208f(interfaceC29280a, ZinstantMetaConstant.MEMORY_CACHING_CONTENT_CACHE);
        this.f51793r = interfaceC18170g;
        this.f51794s = c19707h;
        this.f51795t = interfaceC29280a;
        this.f51796u = true;
        this.f51798w = "";
        this.f51799x = "";
        this.f51800y = "";
        this.f51790C = SharedFlowKt.m113478b(0, 0, null, 7, null);
        this.f51791D = new NetworkReceiver(new C9915n(), new C9916o());
        this.f51792E = new HeadsetReceiver(new C9908g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: R */
    public final void m53248R(List list, InterfaceC18505l interfaceC18505l, InterfaceC18505l interfaceC18505l2) {
        m52966n(new C9907f(list, null), interfaceC18505l, interfaceC18505l2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: S */
    public static final void m53249S(LivestreamPresenterImpl livestreamPresenterImpl, LivestreamData livestreamData, Throwable th2, Section section, Throwable th3) {
        if (th2 != null || livestreamData != null) {
            if (th3 == null && section == null) {
                return;
            }
            if (th2 != null && th3 != null) {
                if (!C25090m.f120499a.m130050b(((InterfaceC22758j0) livestreamPresenterImpl.m52968s()).getContext())) {
                    ((InterfaceC22758j0) livestreamPresenterImpl.m52968s()).mo54474d(new NetworkException(null, 1, null));
                    return;
                }
                LivestreamData livestreamData2 = livestreamPresenterImpl.f51801z;
                AbstractC19074t.m100205c(livestreamData2);
                if (livestreamData2.m50988C()) {
                    livestreamPresenterImpl.f51801z = null;
                    ((InterfaceC22758j0) livestreamPresenterImpl.m52968s()).mo54476e5(new Section((List) null, 0L, (LoadMoreInfo) null, 7, (AbstractC19060k) null));
                    return;
                } else {
                    ((InterfaceC22758j0) livestreamPresenterImpl.m52968s()).mo54474d(th2);
                    return;
                }
            }
            if (livestreamData == null) {
                livestreamPresenterImpl.f51801z = null;
                InterfaceC22758j0 interfaceC22758j0 = (InterfaceC22758j0) livestreamPresenterImpl.m52968s();
                if (section == null) {
                    section = new Section((List) null, 0L, (LoadMoreInfo) null, 7, (AbstractC19060k) null);
                }
                interfaceC22758j0.mo54476e5(section);
                return;
            }
            livestreamPresenterImpl.f51801z = null;
            ((InterfaceC22758j0) livestreamPresenterImpl.m52968s()).mo54473cp(livestreamData);
            InterfaceC22758j0 interfaceC22758j02 = (InterfaceC22758j0) livestreamPresenterImpl.m52968s();
            if (section == null) {
                section = new Section((List) null, 0L, (LoadMoreInfo) null, 7, (AbstractC19060k) null);
            }
            interfaceC22758j02.mo54476e5(section);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: T */
    public final void m53250T(boolean z11, boolean z12, String str, LiveChanelStats liveChanelStats, boolean z13) {
        String str2;
        Map m131407l;
        String str3 = null;
        if (z11) {
            if (z12) {
                Context context = ((InterfaceC22758j0) m52968s()).getContext();
                if (context != null) {
                    str3 = context.getString(AbstractC27413h.zch_action_key_follow_channel_bts);
                }
            } else {
                Context context2 = ((InterfaceC22758j0) m52968s()).getContext();
                if (context2 != null) {
                    str3 = context2.getString(AbstractC27413h.zch_action_key_livestream_unfollow_channel_bts);
                }
            }
        } else if (z12) {
            Context context3 = ((InterfaceC22758j0) m52968s()).getContext();
            if (context3 != null) {
                str3 = context3.getString(AbstractC27413h.zch_action_key_follow_channel_header);
            }
        } else {
            str3 = "";
        }
        if (str3 != null && str3.length() != 0) {
            C19205a c19205a = C19205a.f95429a;
            C24860q[] c24860qArr = new C24860q[4];
            c24860qArr[0] = AbstractC24866w.m129235a("total_video_count", String.valueOf(liveChanelStats.m51603e()));
            c24860qArr[1] = AbstractC24866w.m129235a("follow_count", String.valueOf(liveChanelStats.m51600b()));
            c24860qArr[2] = AbstractC24866w.m129235a("channel_uid", str);
            if (z13) {
                str2 = "1";
            } else {
                str2 = "0";
            }
            c24860qArr[3] = AbstractC24866w.m129235a("msg_status", str2);
            m131407l = AbstractC25363p0.m131407l(c24860qArr);
            c19205a.m100716Q(str3, m131407l);
        }
    }

    /* renamed from: U */
    private final void m53251U() {
        this.f51794s.m103416E();
        if (this.f51798w.length() == 0) {
            this.f51798w = this.f51799x;
        }
        if (this.f51798w.length() > 0) {
            m53253W(this.f51798w, true, "register");
        }
    }

    /* renamed from: V */
    private final void m53252V() {
        Job m112540d;
        Job job = this.f51789B;
        if (job != null) {
            Job.DefaultImpls.m112740a(job, null, 1, null);
        }
        m112540d = BuildersKt__Builders_commonKt.m112540d(m52969u(), null, null, new C9920s(null), 3, null);
        this.f51789B = m112540d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: W */
    public final void m53253W(String str, boolean z11, String str2) {
        C19707h.m103410u(this.f51794s, AbstractC19074t.m100204b(this.f51798w, ""), str2, z11, false, null, 24, null);
        this.f51794s.m103419H(this);
        this.f51794s.m103418G(this);
        this.f51798w = str;
        this.f51794s.m103420J(str, z11, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: X */
    public final boolean m53254X(String str) {
        if (this.f51795t.mo146343r().length() == 0) {
            this.f51795t.mo146339n(str);
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.shortvideo.p072ui.presenter.InterfaceC10056d
    /* renamed from: A9 */
    public void mo53257A9(String str, Channel channel, boolean z11, boolean z12) {
        AbstractC19074t.m100208f(channel, "channel");
        m52966n(new C9904c(z11, this, channel, str, null), new C9905d(z11, channel, z12), new C9906e(str, z11, channel, z12));
    }

    @Override // com.zing.zalo.shortvideo.p072ui.presenter.InterfaceC10056d
    /* renamed from: BG */
    public void mo53258BG() {
        ((InterfaceC22758j0) m52968s()).mo54481sg(this.f51794s.m103430x());
    }

    @Override // com.zing.zalo.shortvideo.p072ui.presenter.InterfaceC10056d
    /* renamed from: G2 */
    public void mo53259G2(String str, String str2, String str3, InterfaceC18505l interfaceC18505l) {
        String str4;
        boolean m127128x;
        AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        AbstractC19074t.m100208f(str2, "src");
        AbstractC19074t.m100208f(interfaceC18505l, "action");
        try {
            Uri.Builder buildUpon = Uri.parse(str).buildUpon();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyMMddHH", Locale.getDefault());
            C27417l c27417l = C27417l.f129055a;
            C24860q[] c24860qArr = {AbstractC24866w.m129235a("source", str2), AbstractC24866w.m129235a("share_time", simpleDateFormat.format(Long.valueOf(c27417l.m140382f().m130131a()))), AbstractC24866w.m129235a("share_uid", c27417l.m140378b().m51234g()), AbstractC24866w.m129235a("ctx", str3)};
            for (int i11 = 0; i11 < 4; i11++) {
                C24860q c24860q = c24860qArr[i11];
                String str5 = (String) c24860q.m129213a();
                String str6 = (String) c24860q.m129214b();
                if (str6 != null) {
                    m127128x = AbstractC24341v.m127128x(str6);
                    if (!m127128x) {
                        buildUpon.appendQueryParameter(str5, str6);
                    }
                }
            }
            str4 = buildUpon.toString();
        } catch (Exception unused) {
            str4 = str;
        }
        AbstractC19074t.m100205c(str4);
        BuildersKt__Builders_commonKt.m112540d(m52969u(), null, null, new C9918q(str4, interfaceC18505l, str, null), 3, null);
    }

    @Override // com.zing.zalo.shortvideo.p072ui.presenter.InterfaceC10056d
    /* renamed from: Ho */
    public void mo53260Ho(String str) {
        AbstractC19074t.m100208f(str, "liveId");
        if (!this.f51794s.m103431z(str)) {
            return;
        }
        this.f51788A++;
        BuildersKt__Builders_commonKt.m112540d(m52969u(), null, null, new C9917p(str, null), 3, null);
    }

    @Override // com.zing.zalo.shortvideo.p072ui.presenter.InterfaceC10056d
    /* renamed from: Lu */
    public void mo53261Lu(String str, String str2) {
        String string;
        Map m131407l;
        AbstractC19074t.m100208f(str, "liveId");
        AbstractC19074t.m100208f(str2, "channelId");
        Context context = ((InterfaceC22758j0) m52968s()).getContext();
        if (context != null && (string = context.getString(AbstractC27413h.zch_action_key_livestream_bts_report)) != null) {
            C19205a c19205a = C19205a.f95429a;
            m131407l = AbstractC25363p0.m131407l(AbstractC24866w.m129235a("live_id", str), AbstractC24866w.m129235a("channel_uid", str2));
            c19205a.m100716Q(string, m131407l);
        }
    }

    @Override // com.zing.zalo.shortvideo.p072ui.presenter.InterfaceC10056d
    /* renamed from: Ma */
    public void mo53262Ma(String str, String str2, String str3) {
        String string;
        Map m131407l;
        AbstractC19074t.m100208f(str, "liveId");
        AbstractC19074t.m100208f(str2, "channelId");
        AbstractC19074t.m100208f(str3, "switchTo");
        Context context = ((InterfaceC22758j0) m52968s()).getContext();
        if (context != null && (string = context.getString(AbstractC27413h.zch_action_key_view_mode_switch)) != null) {
            C19205a c19205a = C19205a.f95429a;
            m131407l = AbstractC25363p0.m131407l(AbstractC24866w.m129235a("live_id", str), AbstractC24866w.m129235a("channel_uid", str2), AbstractC24866w.m129235a("switch_to", str3));
            c19205a.m100716Q(string, m131407l);
        }
    }

    @Override // com.zing.zalo.shortvideo.p072ui.presenter.InterfaceC10056d
    /* renamed from: Oy */
    public void mo53263Oy(String str, InterfaceC18505l interfaceC18505l, InterfaceC18505l interfaceC18505l2) {
        AbstractC19074t.m100208f(str, "id");
        AbstractC19074t.m100208f(interfaceC18505l, "fallback");
        AbstractC19074t.m100208f(interfaceC18505l2, "consumer");
        m52966n(new C9909h(str, null), interfaceC18505l, interfaceC18505l2);
    }

    @Override // com.zing.zalo.shortvideo.p072ui.presenter.BasePresenterImpl, androidx.lifecycle.InterfaceC1767f
    /* renamed from: Ro */
    public void mo8646Ro(InterfaceC1801w interfaceC1801w) {
        AbstractC19074t.m100208f(interfaceC1801w, "owner");
        this.f51794s.m103419H(this);
        this.f51794s.m103418G(this);
        m53252V();
        m53251U();
    }

    @Override // com.zing.zalo.shortvideo.p072ui.presenter.InterfaceC10056d
    /* renamed from: VA */
    public void mo53264VA(String str, String str2) {
        String string;
        Map m131407l;
        AbstractC19074t.m100208f(str, "liveId");
        AbstractC19074t.m100208f(str2, "channelId");
        Context context = ((InterfaceC22758j0) m52968s()).getContext();
        if (context != null && (string = context.getString(AbstractC27413h.zch_action_key_livestream_icon_share)) != null) {
            C19205a c19205a = C19205a.f95429a;
            m131407l = AbstractC25363p0.m131407l(AbstractC24866w.m129235a("live_id", str), AbstractC24866w.m129235a("channel_uid", str2));
            c19205a.m100716Q(string, m131407l);
        }
    }

    @Override // com.zing.zalo.shortvideo.p072ui.presenter.BasePresenterImpl, androidx.lifecycle.InterfaceC1767f
    /* renamed from: Xy */
    public void mo8647Xy(InterfaceC1801w interfaceC1801w) {
        AbstractC19074t.m100208f(interfaceC1801w, "owner");
        super.mo8647Xy(interfaceC1801w);
        this.f51794s.m103421K("onDestroy");
        BasePresenterImpl.m52964r(this, false, 1, null);
    }

    @Override // com.zing.zalo.shortvideo.p072ui.presenter.BasePresenterImpl, androidx.lifecycle.InterfaceC1767f
    /* renamed from: Zv */
    public void mo8648Zv(InterfaceC1801w interfaceC1801w) {
        AbstractC19074t.m100208f(interfaceC1801w, "owner");
        super.mo8648Zv(interfaceC1801w);
        if (((InterfaceC22758j0) m52968s()).getContext() != null) {
            this.f51791D.mo53687g();
            this.f51792E.mo53687g();
        }
        this.f51794s.m103419H(null);
        this.f51794s.m103418G(null);
    }

    @Override // com.zing.zalo.shortvideo.p072ui.presenter.InterfaceC10056d
    /* renamed from: aa */
    public void mo53265aa(String str, String str2, String str3, Comment.Identity identity, boolean z11) {
        Long m127109o;
        Long m127109o2;
        Long m127109o3;
        long j11;
        String string;
        String str4;
        Map m131407l;
        AbstractC19074t.m100208f(str, "liveId");
        AbstractC19074t.m100208f(str2, "channelIdOfLive");
        AbstractC19074t.m100208f(str3, "content");
        AbstractC19074t.m100208f(identity, "owner");
        if (!AbstractC19074t.m100204b(str, this.f51798w)) {
            return;
        }
        GetCommentLiveRes.Companion companion = GetCommentLiveRes.Companion;
        long currentTimeMillis = System.currentTimeMillis() + Thread.currentThread().getId();
        m127109o = AbstractC24340u.m127109o(str);
        m127109o2 = AbstractC24340u.m127109o(identity.m50854d());
        C9440a mo54482xD = ((InterfaceC22758j0) m52968s()).mo54482xD(companion.m51649a(currentTimeMillis, m127109o, str3, new GetCommentLiveRes.Owner(m127109o2, Integer.valueOf(identity.m50856f()), (Integer) null, identity.m50855e(), identity.m50853c(), 4, (AbstractC19060k) null)));
        if (mo54482xD == null) {
            return;
        }
        C19707h c19707h = this.f51794s;
        int m50856f = identity.m50856f();
        m127109o3 = AbstractC24340u.m127109o(identity.m50854d());
        if (m127109o3 != null) {
            j11 = m127109o3.longValue();
        } else {
            j11 = 0;
        }
        c19707h.m103417F(str, str3, m50856f, j11, mo54482xD, new C9919r(str));
        Context context = ((InterfaceC22758j0) m52968s()).getContext();
        if (context != null && (string = context.getString(AbstractC27413h.zch_action_key_livestream_comment)) != null) {
            C19205a c19205a = C19205a.f95429a;
            C24860q[] c24860qArr = new C24860q[5];
            if (z11) {
                str4 = "1";
            } else {
                str4 = "0";
            }
            c24860qArr[0] = AbstractC24866w.m129235a("has_emoji", str4);
            c24860qArr[1] = AbstractC24866w.m129235a("identity", Integer.valueOf(identity.m50856f()));
            c24860qArr[2] = AbstractC24866w.m129235a("content", str3);
            c24860qArr[3] = AbstractC24866w.m129235a("channel_uid", str2);
            c24860qArr[4] = AbstractC24866w.m129235a("live_id", str);
            m131407l = AbstractC25363p0.m131407l(c24860qArr);
            c19205a.m100716Q(string, m131407l);
        }
    }

    @Override // h10.InterfaceC19713n
    /* renamed from: b */
    public void mo53266b(String str, String str2, Boolean bool, Boolean bool2) {
        if (AbstractC19074t.m100204b(this.f51798w, str2) && AbstractC19074t.m100204b(str, C27417l.f129055a.m140378b().m51234g())) {
            ((InterfaceC22758j0) m52968s()).mo54468YB(str2, bool, bool2);
        }
    }

    @Override // h10.InterfaceC19713n
    /* renamed from: c */
    public void mo53267c(String str) {
        if (!AbstractC19074t.m100204b(this.f51798w, str)) {
            return;
        }
        ((InterfaceC22758j0) m52968s()).mo54463Mk(str);
    }

    @Override // h10.InterfaceC19713n
    /* renamed from: d */
    public void mo53268d(String str, List list) {
        AbstractC19074t.m100208f(list, "cmtIds");
        if (!AbstractC19074t.m100204b(this.f51798w, str)) {
            return;
        }
        ((InterfaceC22758j0) m52968s()).mo54479ho(str, list);
    }

    @Override // h10.InterfaceC19708i
    /* renamed from: e */
    public void mo53269e(String str, InteractEventResponse.InteractItem interactItem) {
        if (interactItem == null) {
            return;
        }
        ((InterfaceC22758j0) m52968s()).mo54464Pg(str, interactItem);
    }

    @Override // com.zing.zalo.shortvideo.p072ui.presenter.InterfaceC10056d
    /* renamed from: ej */
    public void mo53270ej(LoadMoreInfo loadMoreInfo) {
        C19059j0 c19059j0 = new C19059j0();
        C19059j0 c19059j02 = new C19059j0();
        C19059j0 c19059j03 = new C19059j0();
        C19059j0 c19059j04 = new C19059j0();
        LivestreamData livestreamData = this.f51801z;
        if (livestreamData != null) {
            mo53263Oy(livestreamData.m51016f(), new C9910i(c19059j03, c19059j0, c19059j02, c19059j04, this), new C9911j(c19059j0, c19059j03, c19059j02, c19059j04));
        }
        m52966n(new C9912k(loadMoreInfo, null), new C9913l(c19059j04, c19059j0, c19059j03, c19059j02), new C9914m(c19059j02, c19059j0, c19059j03, c19059j04));
    }

    @Override // h10.InterfaceC19713n
    /* renamed from: g */
    public void mo53271g(String str, long j11, long j12) {
        AbstractC19074t.m100208f(str, "liveId");
        ((InterfaceC22758j0) m52968s()).mo54475dy(str, j11, j12);
    }

    @Override // h10.InterfaceC19713n
    /* renamed from: j */
    public void mo53272j(C19700a c19700a) {
        String str;
        LivestreamData livestreamData;
        AbstractC19074t.m100208f(c19700a, "changeStream");
        EnumC24601e m103378e = c19700a.m103378e();
        String m103376c = c19700a.m103376c();
        String m103379f = c19700a.m103379f();
        Long m103374a = c19700a.m103374a();
        Long m103377d = c19700a.m103377d();
        Long m103375b = c19700a.m103375b();
        if (m103378e == EnumC24601e.f118374s && AbstractC19074t.m100204b(m103376c, this.f51798w)) {
            C19707h.m103396C(this.f51794s, m103376c, null, null, 6, null);
        }
        if (AbstractC19074t.m100204b(m103376c, this.f51798w)) {
            if (m103379f != null && m103379f.length() != 0) {
                ((InterfaceC22758j0) m52968s()).mo54462Le(m103376c, m103379f);
            }
            LivestreamData livestreamData2 = this.f51801z;
            if (livestreamData2 != null) {
                str = livestreamData2.m51016f();
            } else {
                str = null;
            }
            if (AbstractC19074t.m100204b(str, m103376c) && m103379f != null && m103379f.length() != 0 && (livestreamData = this.f51801z) != null) {
                livestreamData.m51015e0(m103379f);
            }
            ((InterfaceC22758j0) m52968s()).mo54484y7(m103376c, m103378e, m103377d, m103375b);
            ((InterfaceC22758j0) m52968s()).mo54467Xo(m103376c, m103374a);
        }
    }

    @Override // h10.InterfaceC19708i
    /* renamed from: k */
    public void mo53273k(List list) {
        AbstractC19074t.m100208f(list, "cmt");
        ((InterfaceC22758j0) m52968s()).mo54469ZD(list);
    }

    @Override // com.zing.zalo.shortvideo.p072ui.presenter.InterfaceC10056d
    /* renamed from: kk */
    public void mo53274kk(String str, String str2, String str3, String str4, String str5) {
        String string;
        Map m131407l;
        AbstractC19074t.m100208f(str, "liveId");
        AbstractC19074t.m100208f(str2, "channelId");
        AbstractC19074t.m100208f(str3, "shareUrl");
        AbstractC19074t.m100208f(str4, "likeCount");
        AbstractC19074t.m100208f(str5, "shareTo");
        Context context = ((InterfaceC22758j0) m52968s()).getContext();
        if (context != null && (string = context.getString(AbstractC27413h.zch_action_key_livestream_share)) != null) {
            C19205a c19205a = C19205a.f95429a;
            m131407l = AbstractC25363p0.m131407l(AbstractC24866w.m129235a("live_id", str), AbstractC24866w.m129235a("channel_uid", str2), AbstractC24866w.m129235a("share_url", str3), AbstractC24866w.m129235a("like_count", str4), AbstractC24866w.m129235a("share_to", str5));
            c19205a.m100716Q(string, m131407l);
        }
    }

    @Override // h10.InterfaceC19713n
    /* renamed from: l */
    public void mo53275l(String str, List list) {
        AbstractC19074t.m100208f(str, "streamId");
        AbstractC19074t.m100208f(list, "comment");
        ((InterfaceC22758j0) m52968s()).mo54477ec(str, list);
    }

    @Override // h10.InterfaceC19708i
    /* renamed from: m */
    public void mo53276m(String str, InteractEventResponse.InteractItem interactItem) {
        if (interactItem == null) {
            return;
        }
        ((InterfaceC22758j0) m52968s()).mo54471aB(str, interactItem);
    }

    @Override // com.zing.zalo.shortvideo.p072ui.presenter.BasePresenterImpl, com.zing.zalo.shortvideo.p072ui.presenter.InterfaceC10053a
    /* renamed from: uo */
    public void mo52970uo(Bundle bundle) {
        LivestreamData livestreamData;
        Context context;
        String string;
        Map m131407l;
        if (bundle != null && (livestreamData = (LivestreamData) bundle.getParcelable("RESERVED_VIDEO")) != null) {
            this.f51801z = livestreamData;
            String str = "";
            String string2 = bundle.getString("SOURCE", "");
            if (string2 == null) {
                string2 = "";
            } else {
                AbstractC19074t.m100205c(string2);
            }
            if (string2.length() > 0 && (context = ((InterfaceC22758j0) m52968s()).getContext()) != null && (string = context.getString(AbstractC27413h.zch_action_key_open_stream_detail)) != null) {
                C19205a c19205a = C19205a.f95429a;
                C24860q[] c24860qArr = new C24860q[3];
                c24860qArr[0] = AbstractC24866w.m129235a("live_id", livestreamData.m51016f());
                c24860qArr[1] = AbstractC24866w.m129235a("channel_uid", livestreamData.m51010b().m50769l());
                if (!AbstractC19074t.m100204b(string2, "5")) {
                    str = string2;
                } else {
                    String string3 = bundle.getString("SOURCE_ID_FROM_SHARE", "");
                    if (string3 != null) {
                        str = string3;
                    }
                }
                c24860qArr[2] = AbstractC24866w.m129235a("from_action", str);
                m131407l = AbstractC25363p0.m131407l(c24860qArr);
                c19205a.m100716Q(string, m131407l);
            }
        }
    }

    @Override // com.zing.zalo.shortvideo.p072ui.presenter.BasePresenterImpl, androidx.lifecycle.InterfaceC1767f
    /* renamed from: wC */
    public void mo8650wC(InterfaceC1801w interfaceC1801w) {
        AbstractC19074t.m100208f(interfaceC1801w, "owner");
        super.mo8650wC(interfaceC1801w);
        Context context = ((InterfaceC22758j0) m52968s()).getContext();
        if (context != null) {
            this.f51791D.mo53685d(context);
            this.f51792E.mo53685d(context);
        }
    }

    @Override // com.zing.zalo.shortvideo.p072ui.presenter.InterfaceC10056d
    /* renamed from: xv */
    public LivestreamData mo53277xv() {
        return this.f51801z;
    }

    @Override // com.zing.zalo.shortvideo.p072ui.presenter.InterfaceC10056d
    /* renamed from: zs */
    public void mo53278zs(String str, String str2, String str3) {
        AbstractC19074t.m100208f(str, "liveId");
        AbstractC19074t.m100208f(str2, "currentChannelId");
        AbstractC19074t.m100208f(str3, "callFrom");
        this.f51800y = str2;
        this.f51799x = str;
        BuildersKt__Builders_commonKt.m112540d(m52969u(), null, null, new C9921t(str, str2, str3, null), 3, null);
    }

    @Override // com.zing.zalo.shortvideo.p072ui.presenter.InterfaceC10056d
    /* renamed from: zx */
    public void mo53279zx(String str, String str2, int i11) {
        String string;
        Map m131407l;
        AbstractC19074t.m100208f(str, "liveId");
        AbstractC19074t.m100208f(str2, "channelId");
        Context context = ((InterfaceC22758j0) m52968s()).getContext();
        if (context != null && (string = context.getString(AbstractC27413h.zch_action_key_livestream_like)) != null) {
            C19205a c19205a = C19205a.f95429a;
            m131407l = AbstractC25363p0.m131407l(AbstractC24866w.m129235a("live_id", str), AbstractC24866w.m129235a("channel_uid", str2), AbstractC24866w.m129235a("count", Integer.valueOf(i11)));
            c19205a.m100716Q(string, m131407l);
        }
    }
}
