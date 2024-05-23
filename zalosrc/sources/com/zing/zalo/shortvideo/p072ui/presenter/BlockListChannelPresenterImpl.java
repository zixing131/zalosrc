package com.zing.zalo.shortvideo.p072ui.presenter;

import android.content.Context;
import androidx.lifecycle.InterfaceC1801w;
import com.zing.zalo.shortvideo.data.model.Channel;
import com.zing.zalo.shortvideo.data.model.LoadMoreInfo;
import com.zing.zalo.shortvideo.data.model.PersonalizeChannel;
import com.zing.zalo.shortvideo.data.model.Section;
import com.zing.zalo.shortvideo.p072ui.receiver.NetworkReceiver;
import e10.InterfaceC18170g;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import h20.InterfaceC19717a;
import kotlin.coroutines.Continuation;
import m20.InterfaceC22722b;
import p667y2.C30268e;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* loaded from: classes5.dex */
public final class BlockListChannelPresenterImpl extends BasePresenterImpl<InterfaceC22722b> implements InterfaceC19717a {

    /* renamed from: r */
    private final InterfaceC18170g f51460r;

    /* renamed from: s */
    private Section f51461s;

    /* renamed from: t */
    private boolean f51462t;

    /* renamed from: u */
    private NetworkReceiver f51463u;

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.BlockListChannelPresenterImpl$a */
    /* loaded from: classes5.dex */
    static final class C9787a extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f51464t;

        /* renamed from: v */
        final /* synthetic */ Channel f51466v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9787a(Channel channel, Continuation continuation) {
            super(1, continuation);
            this.f51466v = channel;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f51464t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                InterfaceC18170g interfaceC18170g = BlockListChannelPresenterImpl.this.f51460r;
                String m50769l = this.f51466v.m50769l();
                this.f51464t = 1;
                obj = interfaceC18170g.mo96551C(m50769l, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            return obj;
        }

        /* renamed from: r */
        public final Continuation m52988r(Continuation continuation) {
            return new C9787a(this.f51466v, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((C9787a) m52988r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.BlockListChannelPresenterImpl$b */
    /* loaded from: classes5.dex */
    static final class C9788b extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ Channel f51468r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9788b(Channel channel) {
            super(1);
            this.f51468r = channel;
        }

        /* renamed from: a */
        public final void m52990a(Throwable th2) {
            AbstractC19074t.m100208f(th2, "throwable");
            ((InterfaceC22722b) BlockListChannelPresenterImpl.this.m52968s()).mo53905Fz(this.f51468r, true, th2);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m52990a((Throwable) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.BlockListChannelPresenterImpl$c */
    /* loaded from: classes5.dex */
    static final class C9789c extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ Channel f51470r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9789c(Channel channel) {
            super(1);
            this.f51470r = channel;
        }

        /* renamed from: a */
        public final void m52991a(PersonalizeChannel personalizeChannel) {
            AbstractC19074t.m100208f(personalizeChannel, "personalize");
            ((InterfaceC22722b) BlockListChannelPresenterImpl.this.m52968s()).mo53905Fz(this.f51470r, true, null);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m52991a((PersonalizeChannel) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.BlockListChannelPresenterImpl$d */
    /* loaded from: classes5.dex */
    static final class C9790d extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f51471t;

        C9790d(Continuation continuation) {
            super(1, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f51471t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                InterfaceC18170g interfaceC18170g = BlockListChannelPresenterImpl.this.f51460r;
                this.f51471t = 1;
                obj = InterfaceC18170g.a.m96632b(interfaceC18170g, null, this, 1, null);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            return obj;
        }

        /* renamed from: r */
        public final Continuation m52992r(Continuation continuation) {
            return new C9790d(continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((C9790d) m52992r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.BlockListChannelPresenterImpl$e */
    /* loaded from: classes5.dex */
    static final class C9791e extends AbstractC19075u implements InterfaceC18505l {
        C9791e() {
            super(1);
        }

        /* renamed from: a */
        public final void m52994a(Throwable th2) {
            AbstractC19074t.m100208f(th2, C30268e.f140632a);
            ((InterfaceC22722b) BlockListChannelPresenterImpl.this.m52968s()).mo53907d(th2);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m52994a((Throwable) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.BlockListChannelPresenterImpl$f */
    /* loaded from: classes5.dex */
    static final class C9792f extends AbstractC19075u implements InterfaceC18505l {
        C9792f() {
            super(1);
        }

        /* renamed from: a */
        public final void m52995a(Section section) {
            AbstractC19074t.m100208f(section, "result");
            BlockListChannelPresenterImpl.this.f51461s = section;
            ((InterfaceC22722b) BlockListChannelPresenterImpl.this.m52968s()).mo53909o(section);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m52995a((Section) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.BlockListChannelPresenterImpl$g */
    /* loaded from: classes5.dex */
    static final class C9793g extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f51475t;

        /* renamed from: v */
        final /* synthetic */ LoadMoreInfo f51477v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9793g(LoadMoreInfo loadMoreInfo, Continuation continuation) {
            super(1, continuation);
            this.f51477v = loadMoreInfo;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f51475t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                InterfaceC18170g interfaceC18170g = BlockListChannelPresenterImpl.this.f51460r;
                LoadMoreInfo loadMoreInfo = this.f51477v;
                this.f51475t = 1;
                obj = interfaceC18170g.mo96607n0(loadMoreInfo, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            return obj;
        }

        /* renamed from: r */
        public final Continuation m52996r(Continuation continuation) {
            return new C9793g(this.f51477v, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((C9793g) m52996r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.BlockListChannelPresenterImpl$h */
    /* loaded from: classes5.dex */
    static final class C9794h extends AbstractC19075u implements InterfaceC18505l {
        C9794h() {
            super(1);
        }

        /* renamed from: a */
        public final void m52998a(Throwable th2) {
            AbstractC19074t.m100208f(th2, C30268e.f140632a);
            ((InterfaceC22722b) BlockListChannelPresenterImpl.this.m52968s()).mo53907d(th2);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m52998a((Throwable) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.BlockListChannelPresenterImpl$i */
    /* loaded from: classes5.dex */
    static final class C9795i extends AbstractC19075u implements InterfaceC18505l {
        C9795i() {
            super(1);
        }

        /* renamed from: a */
        public final void m52999a(Section section) {
            AbstractC19074t.m100208f(section, "result");
            ((InterfaceC22722b) BlockListChannelPresenterImpl.this.m52968s()).mo53908e(section);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m52999a((Section) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.BlockListChannelPresenterImpl$j */
    /* loaded from: classes5.dex */
    static final class C9796j extends AbstractC19075u implements InterfaceC18494a {
        C9796j() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m53000a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m53000a() {
            if (BlockListChannelPresenterImpl.this.f51462t) {
                BlockListChannelPresenterImpl.this.f51462t = false;
                ((InterfaceC22722b) BlockListChannelPresenterImpl.this.m52968s()).mo53906b(BlockListChannelPresenterImpl.this.f51462t);
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.BlockListChannelPresenterImpl$k */
    /* loaded from: classes5.dex */
    static final class C9797k extends AbstractC19075u implements InterfaceC18494a {
        C9797k() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m53001a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m53001a() {
            if (!BlockListChannelPresenterImpl.this.f51462t) {
                BlockListChannelPresenterImpl.this.f51462t = true;
                ((InterfaceC22722b) BlockListChannelPresenterImpl.this.m52968s()).mo53906b(BlockListChannelPresenterImpl.this.f51462t);
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.BlockListChannelPresenterImpl$l */
    /* loaded from: classes5.dex */
    static final class C9798l extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f51482t;

        /* renamed from: v */
        final /* synthetic */ Channel f51484v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9798l(Channel channel, Continuation continuation) {
            super(1, continuation);
            this.f51484v = channel;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f51482t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                InterfaceC18170g interfaceC18170g = BlockListChannelPresenterImpl.this.f51460r;
                String m50769l = this.f51484v.m50769l();
                this.f51482t = 1;
                obj = interfaceC18170g.mo96589e0(m50769l, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            return obj;
        }

        /* renamed from: r */
        public final Continuation m53002r(Continuation continuation) {
            return new C9798l(this.f51484v, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((C9798l) m53002r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.BlockListChannelPresenterImpl$m */
    /* loaded from: classes5.dex */
    static final class C9799m extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ Channel f51486r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9799m(Channel channel) {
            super(1);
            this.f51486r = channel;
        }

        /* renamed from: a */
        public final void m53004a(Throwable th2) {
            AbstractC19074t.m100208f(th2, "throwable");
            ((InterfaceC22722b) BlockListChannelPresenterImpl.this.m52968s()).mo53905Fz(this.f51486r, false, th2);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53004a((Throwable) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.BlockListChannelPresenterImpl$n */
    /* loaded from: classes5.dex */
    static final class C9800n extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ Channel f51488r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9800n(Channel channel) {
            super(1);
            this.f51488r = channel;
        }

        /* renamed from: a */
        public final void m53005a(PersonalizeChannel personalizeChannel) {
            AbstractC19074t.m100208f(personalizeChannel, "personalize");
            ((InterfaceC22722b) BlockListChannelPresenterImpl.this.m52968s()).mo53905Fz(this.f51488r, false, null);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53005a((PersonalizeChannel) obj);
            return C24848g0.f119245a;
        }
    }

    public BlockListChannelPresenterImpl(InterfaceC18170g interfaceC18170g) {
        AbstractC19074t.m100208f(interfaceC18170g, "restRepo");
        this.f51460r = interfaceC18170g;
        this.f51462t = true;
        this.f51463u = new NetworkReceiver(new C9796j(), new C9797k());
    }

    @Override // h20.InterfaceC19717a
    /* renamed from: Ns */
    public Section mo52983Ns() {
        return this.f51461s;
    }

    @Override // h20.InterfaceC19717a
    /* renamed from: Qf */
    public void mo52984Qf(Channel channel) {
        AbstractC19074t.m100208f(channel, "channel");
        m52966n(new C9798l(channel, null), new C9799m(channel), new C9800n(channel));
    }

    @Override // com.zing.zalo.shortvideo.p072ui.presenter.BasePresenterImpl, androidx.lifecycle.InterfaceC1767f
    /* renamed from: Zv */
    public void mo8648Zv(InterfaceC1801w interfaceC1801w) {
        AbstractC19074t.m100208f(interfaceC1801w, "owner");
        super.mo8648Zv(interfaceC1801w);
        if (((InterfaceC22722b) m52968s()).getContext() != null) {
            this.f51463u.mo53687g();
        }
        BasePresenterImpl.m52964r(this, false, 1, null);
    }

    @Override // h20.InterfaceC19717a
    /* renamed from: a */
    public void mo52985a(LoadMoreInfo loadMoreInfo) {
        AbstractC19074t.m100208f(loadMoreInfo, "next");
        m52966n(new C9793g(loadMoreInfo, null), new C9794h(), new C9795i());
    }

    @Override // h20.InterfaceC19717a
    /* renamed from: i */
    public void mo52986i() {
        m52966n(new C9790d(null), new C9791e(), new C9792f());
    }

    @Override // h20.InterfaceC19717a
    /* renamed from: s7 */
    public void mo52987s7(Channel channel) {
        AbstractC19074t.m100208f(channel, "channel");
        m52966n(new C9787a(channel, null), new C9788b(channel), new C9789c(channel));
    }

    @Override // com.zing.zalo.shortvideo.p072ui.presenter.BasePresenterImpl, androidx.lifecycle.InterfaceC1767f
    /* renamed from: wC */
    public void mo8650wC(InterfaceC1801w interfaceC1801w) {
        AbstractC19074t.m100208f(interfaceC1801w, "owner");
        super.mo8650wC(interfaceC1801w);
        Context context = ((InterfaceC22722b) m52968s()).getContext();
        if (context != null) {
            this.f51463u.mo53685d(context);
        }
    }
}
