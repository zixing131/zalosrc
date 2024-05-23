package com.zing.zalo.shortvideo.p072ui.presenter;

import android.content.Context;
import androidx.lifecycle.InterfaceC1801w;
import com.zing.zalo.shortvideo.data.model.LoadMoreInfo;
import com.zing.zalo.shortvideo.data.model.Section;
import com.zing.zalo.shortvideo.data.model.User;
import com.zing.zalo.shortvideo.p072ui.receiver.NetworkReceiver;
import e10.InterfaceC18170g;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import f10.EnumC18694f;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import h20.InterfaceC19718b;
import kotlin.coroutines.Continuation;
import m20.InterfaceC22727c;
import p667y2.C30268e;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* loaded from: classes5.dex */
public final class BlockListUserPresenterImpl extends BasePresenterImpl<InterfaceC22727c> implements InterfaceC19718b {

    /* renamed from: r */
    private final InterfaceC18170g f51489r;

    /* renamed from: s */
    private Section f51490s;

    /* renamed from: t */
    private boolean f51491t;

    /* renamed from: u */
    private NetworkReceiver f51492u;

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.BlockListUserPresenterImpl$a */
    /* loaded from: classes5.dex */
    static final class C9801a extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f51493t;

        /* renamed from: v */
        final /* synthetic */ User f51495v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9801a(User user, Continuation continuation) {
            super(1, continuation);
            this.f51495v = user;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f51493t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                InterfaceC18170g interfaceC18170g = BlockListUserPresenterImpl.this.f51489r;
                String m51234g = this.f51495v.m51234g();
                this.f51493t = 1;
                obj = interfaceC18170g.mo96547A(m51234g, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            return obj;
        }

        /* renamed from: r */
        public final Continuation m53015r(Continuation continuation) {
            return new C9801a(this.f51495v, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((C9801a) m53015r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.BlockListUserPresenterImpl$b */
    /* loaded from: classes5.dex */
    static final class C9802b extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ User f51497r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9802b(User user) {
            super(1);
            this.f51497r = user;
        }

        /* renamed from: a */
        public final void m53017a(Throwable th2) {
            AbstractC19074t.m100208f(th2, C30268e.f140632a);
            ((InterfaceC22727c) BlockListUserPresenterImpl.this.m52968s()).mo53925z4(true, th2, this.f51497r);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53017a((Throwable) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.BlockListUserPresenterImpl$c */
    /* loaded from: classes5.dex */
    static final class C9803c extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ User f51499r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9803c(User user) {
            super(1);
            this.f51499r = user;
        }

        /* renamed from: a */
        public final void m53018a(EnumC18694f enumC18694f) {
            AbstractC19074t.m100208f(enumC18694f, "it");
            ((InterfaceC22727c) BlockListUserPresenterImpl.this.m52968s()).mo53925z4(true, null, this.f51499r);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53018a((EnumC18694f) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.BlockListUserPresenterImpl$d */
    /* loaded from: classes5.dex */
    static final class C9804d extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f51500t;

        C9804d(Continuation continuation) {
            super(1, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f51500t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                InterfaceC18170g interfaceC18170g = BlockListUserPresenterImpl.this.f51489r;
                this.f51500t = 1;
                obj = InterfaceC18170g.a.m96633c(interfaceC18170g, null, this, 1, null);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            return obj;
        }

        /* renamed from: r */
        public final Continuation m53019r(Continuation continuation) {
            return new C9804d(continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((C9804d) m53019r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.BlockListUserPresenterImpl$e */
    /* loaded from: classes5.dex */
    static final class C9805e extends AbstractC19075u implements InterfaceC18505l {
        C9805e() {
            super(1);
        }

        /* renamed from: a */
        public final void m53021a(Throwable th2) {
            AbstractC19074t.m100208f(th2, C30268e.f140632a);
            ((InterfaceC22727c) BlockListUserPresenterImpl.this.m52968s()).mo53922d(th2);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53021a((Throwable) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.BlockListUserPresenterImpl$f */
    /* loaded from: classes5.dex */
    static final class C9806f extends AbstractC19075u implements InterfaceC18505l {
        C9806f() {
            super(1);
        }

        /* renamed from: a */
        public final void m53022a(Section section) {
            AbstractC19074t.m100208f(section, "result");
            BlockListUserPresenterImpl.this.f51490s = section;
            ((InterfaceC22727c) BlockListUserPresenterImpl.this.m52968s()).mo53924o(section);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53022a((Section) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.BlockListUserPresenterImpl$g */
    /* loaded from: classes5.dex */
    static final class C9807g extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f51504t;

        /* renamed from: v */
        final /* synthetic */ LoadMoreInfo f51506v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9807g(LoadMoreInfo loadMoreInfo, Continuation continuation) {
            super(1, continuation);
            this.f51506v = loadMoreInfo;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f51504t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                InterfaceC18170g interfaceC18170g = BlockListUserPresenterImpl.this.f51489r;
                LoadMoreInfo loadMoreInfo = this.f51506v;
                this.f51504t = 1;
                obj = interfaceC18170g.mo96590f(loadMoreInfo, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            return obj;
        }

        /* renamed from: r */
        public final Continuation m53023r(Continuation continuation) {
            return new C9807g(this.f51506v, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((C9807g) m53023r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.BlockListUserPresenterImpl$h */
    /* loaded from: classes5.dex */
    static final class C9808h extends AbstractC19075u implements InterfaceC18505l {
        C9808h() {
            super(1);
        }

        /* renamed from: a */
        public final void m53025a(Throwable th2) {
            AbstractC19074t.m100208f(th2, C30268e.f140632a);
            ((InterfaceC22727c) BlockListUserPresenterImpl.this.m52968s()).mo53922d(th2);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53025a((Throwable) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.BlockListUserPresenterImpl$i */
    /* loaded from: classes5.dex */
    static final class C9809i extends AbstractC19075u implements InterfaceC18505l {
        C9809i() {
            super(1);
        }

        /* renamed from: a */
        public final void m53026a(Section section) {
            AbstractC19074t.m100208f(section, "result");
            ((InterfaceC22727c) BlockListUserPresenterImpl.this.m52968s()).mo53923e(section);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53026a((Section) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.BlockListUserPresenterImpl$j */
    /* loaded from: classes5.dex */
    static final class C9810j extends AbstractC19075u implements InterfaceC18494a {
        C9810j() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m53027a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m53027a() {
            if (BlockListUserPresenterImpl.this.f51491t) {
                BlockListUserPresenterImpl.this.f51491t = false;
                ((InterfaceC22727c) BlockListUserPresenterImpl.this.m52968s()).mo53921b(BlockListUserPresenterImpl.this.f51491t);
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.BlockListUserPresenterImpl$k */
    /* loaded from: classes5.dex */
    static final class C9811k extends AbstractC19075u implements InterfaceC18494a {
        C9811k() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m53028a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m53028a() {
            if (!BlockListUserPresenterImpl.this.f51491t) {
                BlockListUserPresenterImpl.this.f51491t = true;
                ((InterfaceC22727c) BlockListUserPresenterImpl.this.m52968s()).mo53921b(BlockListUserPresenterImpl.this.f51491t);
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.BlockListUserPresenterImpl$l */
    /* loaded from: classes5.dex */
    static final class C9812l extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f51511t;

        /* renamed from: v */
        final /* synthetic */ User f51513v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9812l(User user, Continuation continuation) {
            super(1, continuation);
            this.f51513v = user;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f51511t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                InterfaceC18170g interfaceC18170g = BlockListUserPresenterImpl.this.f51489r;
                String m51234g = this.f51513v.m51234g();
                this.f51511t = 1;
                obj = interfaceC18170g.mo96626x0(m51234g, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            return obj;
        }

        /* renamed from: r */
        public final Continuation m53029r(Continuation continuation) {
            return new C9812l(this.f51513v, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((C9812l) m53029r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.BlockListUserPresenterImpl$m */
    /* loaded from: classes5.dex */
    static final class C9813m extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ User f51515r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9813m(User user) {
            super(1);
            this.f51515r = user;
        }

        /* renamed from: a */
        public final void m53031a(Throwable th2) {
            AbstractC19074t.m100208f(th2, C30268e.f140632a);
            ((InterfaceC22727c) BlockListUserPresenterImpl.this.m52968s()).mo53925z4(false, th2, this.f51515r);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53031a((Throwable) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.BlockListUserPresenterImpl$n */
    /* loaded from: classes5.dex */
    static final class C9814n extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ User f51517r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9814n(User user) {
            super(1);
            this.f51517r = user;
        }

        /* renamed from: a */
        public final void m53032a(EnumC18694f enumC18694f) {
            AbstractC19074t.m100208f(enumC18694f, "it");
            ((InterfaceC22727c) BlockListUserPresenterImpl.this.m52968s()).mo53925z4(false, null, this.f51517r);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53032a((EnumC18694f) obj);
            return C24848g0.f119245a;
        }
    }

    public BlockListUserPresenterImpl(InterfaceC18170g interfaceC18170g) {
        AbstractC19074t.m100208f(interfaceC18170g, "restRepo");
        this.f51489r = interfaceC18170g;
        this.f51491t = true;
        this.f51492u = new NetworkReceiver(new C9810j(), new C9811k());
    }

    @Override // h20.InterfaceC19718b
    /* renamed from: Oj */
    public Section mo53010Oj() {
        return this.f51490s;
    }

    @Override // h20.InterfaceC19718b
    /* renamed from: TG */
    public void mo53011TG(User user) {
        AbstractC19074t.m100208f(user, "user");
        m52966n(new C9801a(user, null), new C9802b(user), new C9803c(user));
    }

    @Override // com.zing.zalo.shortvideo.p072ui.presenter.BasePresenterImpl, androidx.lifecycle.InterfaceC1767f
    /* renamed from: Zv */
    public void mo8648Zv(InterfaceC1801w interfaceC1801w) {
        AbstractC19074t.m100208f(interfaceC1801w, "owner");
        super.mo8648Zv(interfaceC1801w);
        if (((InterfaceC22727c) m52968s()).getContext() != null) {
            this.f51492u.mo53687g();
        }
        BasePresenterImpl.m52964r(this, false, 1, null);
    }

    @Override // h20.InterfaceC19718b
    /* renamed from: a */
    public void mo53012a(LoadMoreInfo loadMoreInfo) {
        AbstractC19074t.m100208f(loadMoreInfo, "next");
        m52966n(new C9807g(loadMoreInfo, null), new C9808h(), new C9809i());
    }

    @Override // h20.InterfaceC19718b
    /* renamed from: i */
    public void mo53013i() {
        m52966n(new C9804d(null), new C9805e(), new C9806f());
    }

    @Override // h20.InterfaceC19718b
    /* renamed from: mb */
    public void mo53014mb(User user) {
        AbstractC19074t.m100208f(user, "user");
        m52966n(new C9812l(user, null), new C9813m(user), new C9814n(user));
    }

    @Override // com.zing.zalo.shortvideo.p072ui.presenter.BasePresenterImpl, androidx.lifecycle.InterfaceC1767f
    /* renamed from: wC */
    public void mo8650wC(InterfaceC1801w interfaceC1801w) {
        AbstractC19074t.m100208f(interfaceC1801w, "owner");
        super.mo8650wC(interfaceC1801w);
        Context context = ((InterfaceC22727c) m52968s()).getContext();
        if (context != null) {
            this.f51492u.mo53685d(context);
        }
    }
}
