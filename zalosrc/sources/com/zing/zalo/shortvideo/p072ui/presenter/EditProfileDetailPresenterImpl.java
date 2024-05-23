package com.zing.zalo.shortvideo.p072ui.presenter;

import com.zing.zalo.shortvideo.data.model.UserProfileResult;
import e10.InterfaceC18170g;
import en0.InterfaceC18505l;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import h20.InterfaceC19722f;
import kotlin.coroutines.Continuation;
import m20.InterfaceC22728c0;
import p667y2.C30268e;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* loaded from: classes5.dex */
public final class EditProfileDetailPresenterImpl extends BasePresenterImpl<InterfaceC22728c0> implements InterfaceC19722f {

    /* renamed from: r */
    private final InterfaceC18170g f51727r;

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.EditProfileDetailPresenterImpl$a */
    /* loaded from: classes5.dex */
    static final class C9871a extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f51728t;

        /* renamed from: v */
        final /* synthetic */ String f51730v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9871a(String str, Continuation continuation) {
            super(1, continuation);
            this.f51730v = str;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f51728t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                InterfaceC18170g interfaceC18170g = EditProfileDetailPresenterImpl.this.f51727r;
                String str = this.f51730v;
                this.f51728t = 1;
                obj = interfaceC18170g.mo96564K(str, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            return obj;
        }

        /* renamed from: r */
        public final Continuation m53175r(Continuation continuation) {
            return new C9871a(this.f51730v, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((C9871a) m53175r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.EditProfileDetailPresenterImpl$b */
    /* loaded from: classes5.dex */
    static final class C9872b extends AbstractC19075u implements InterfaceC18505l {
        C9872b() {
            super(1);
        }

        /* renamed from: a */
        public final void m53177a(Throwable th2) {
            AbstractC19074t.m100208f(th2, C30268e.f140632a);
            ((InterfaceC22728c0) EditProfileDetailPresenterImpl.this.m52968s()).mo54270o9(th2);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53177a((Throwable) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.EditProfileDetailPresenterImpl$c */
    /* loaded from: classes5.dex */
    static final class C9873c extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ String f51733r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9873c(String str) {
            super(1);
            this.f51733r = str;
        }

        /* renamed from: a */
        public final void m53178a(UserProfileResult userProfileResult) {
            AbstractC19074t.m100208f(userProfileResult, "it");
            ((InterfaceC22728c0) EditProfileDetailPresenterImpl.this.m52968s()).mo54268eo(this.f51733r);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53178a((UserProfileResult) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.EditProfileDetailPresenterImpl$d */
    /* loaded from: classes5.dex */
    static final class C9874d extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f51734t;

        /* renamed from: v */
        final /* synthetic */ String f51736v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9874d(String str, Continuation continuation) {
            super(1, continuation);
            this.f51736v = str;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f51734t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                InterfaceC18170g interfaceC18170g = EditProfileDetailPresenterImpl.this.f51727r;
                String str = this.f51736v;
                this.f51734t = 1;
                obj = interfaceC18170g.mo96603l0(str, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            return obj;
        }

        /* renamed from: r */
        public final Continuation m53179r(Continuation continuation) {
            return new C9874d(this.f51736v, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((C9874d) m53179r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.EditProfileDetailPresenterImpl$e */
    /* loaded from: classes5.dex */
    static final class C9875e extends AbstractC19075u implements InterfaceC18505l {
        C9875e() {
            super(1);
        }

        /* renamed from: a */
        public final void m53181a(Throwable th2) {
            AbstractC19074t.m100208f(th2, C30268e.f140632a);
            ((InterfaceC22728c0) EditProfileDetailPresenterImpl.this.m52968s()).mo54271pc(th2);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53181a((Throwable) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.EditProfileDetailPresenterImpl$f */
    /* loaded from: classes5.dex */
    static final class C9876f extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ String f51739r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9876f(String str) {
            super(1);
            this.f51739r = str;
        }

        /* renamed from: a */
        public final void m53182a(UserProfileResult userProfileResult) {
            AbstractC19074t.m100208f(userProfileResult, "it");
            ((InterfaceC22728c0) EditProfileDetailPresenterImpl.this.m52968s()).mo54267EB(this.f51739r);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53182a((UserProfileResult) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.EditProfileDetailPresenterImpl$g */
    /* loaded from: classes5.dex */
    static final class C9877g extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f51740t;

        /* renamed from: v */
        final /* synthetic */ String f51742v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9877g(String str, Continuation continuation) {
            super(1, continuation);
            this.f51742v = str;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f51740t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                InterfaceC18170g interfaceC18170g = EditProfileDetailPresenterImpl.this.f51727r;
                String str = this.f51742v;
                this.f51740t = 1;
                obj = interfaceC18170g.mo96602l(str, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            return obj;
        }

        /* renamed from: r */
        public final Continuation m53183r(Continuation continuation) {
            return new C9877g(this.f51742v, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((C9877g) m53183r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.EditProfileDetailPresenterImpl$h */
    /* loaded from: classes5.dex */
    static final class C9878h extends AbstractC19075u implements InterfaceC18505l {
        C9878h() {
            super(1);
        }

        /* renamed from: a */
        public final void m53185a(Throwable th2) {
            AbstractC19074t.m100208f(th2, C30268e.f140632a);
            ((InterfaceC22728c0) EditProfileDetailPresenterImpl.this.m52968s()).mo54269jb(th2);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53185a((Throwable) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.EditProfileDetailPresenterImpl$i */
    /* loaded from: classes5.dex */
    static final class C9879i extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ String f51745r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9879i(String str) {
            super(1);
            this.f51745r = str;
        }

        /* renamed from: a */
        public final void m53186a(UserProfileResult userProfileResult) {
            AbstractC19074t.m100208f(userProfileResult, "it");
            ((InterfaceC22728c0) EditProfileDetailPresenterImpl.this.m52968s()).mo54266AH(this.f51745r);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53186a((UserProfileResult) obj);
            return C24848g0.f119245a;
        }
    }

    public EditProfileDetailPresenterImpl(InterfaceC18170g interfaceC18170g) {
        AbstractC19074t.m100208f(interfaceC18170g, "restRepo");
        this.f51727r = interfaceC18170g;
    }

    @Override // h20.InterfaceC19722f
    /* renamed from: Fa */
    public void mo53172Fa(String str) {
        AbstractC19074t.m100208f(str, "bio");
        m52966n(new C9871a(str, null), new C9872b(), new C9873c(str));
    }

    @Override // h20.InterfaceC19722f
    /* renamed from: GD */
    public void mo53173GD(String str) {
        AbstractC19074t.m100208f(str, "id");
        m52966n(new C9874d(str, null), new C9875e(), new C9876f(str));
    }

    @Override // h20.InterfaceC19722f
    /* renamed from: j8 */
    public void mo53174j8(String str) {
        AbstractC19074t.m100208f(str, "name");
        m52966n(new C9877g(str, null), new C9878h(), new C9879i(str));
    }
}
