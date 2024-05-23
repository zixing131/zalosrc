package com.zing.zalo.shortvideo.p072ui.presenter;

import androidx.lifecycle.InterfaceC1801w;
import com.zing.zalo.shortvideo.data.model.Channel;
import com.zing.zalo.shortvideo.data.model.UserProfileResult;
import e10.InterfaceC18170g;
import en0.InterfaceC18505l;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import h20.InterfaceC19721e;
import kotlin.coroutines.Continuation;
import m20.InterfaceC22723b0;
import p667y2.C30268e;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* loaded from: classes5.dex */
public final class EditChannelAvatarPresenterImpl extends BasePresenterImpl<InterfaceC22723b0> implements InterfaceC19721e {

    /* renamed from: r */
    private final InterfaceC18170g f51721r;

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.EditChannelAvatarPresenterImpl$a */
    /* loaded from: classes5.dex */
    static final class C9868a extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f51722t;

        /* renamed from: v */
        final /* synthetic */ String f51724v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9868a(String str, Continuation continuation) {
            super(1, continuation);
            this.f51724v = str;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f51722t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                InterfaceC18170g interfaceC18170g = EditChannelAvatarPresenterImpl.this.f51721r;
                String str = this.f51724v;
                this.f51722t = 1;
                obj = interfaceC18170g.mo96548A0(str, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            return obj;
        }

        /* renamed from: r */
        public final Continuation m53167r(Continuation continuation) {
            return new C9868a(this.f51724v, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((C9868a) m53167r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.EditChannelAvatarPresenterImpl$b */
    /* loaded from: classes5.dex */
    static final class C9869b extends AbstractC19075u implements InterfaceC18505l {
        C9869b() {
            super(1);
        }

        /* renamed from: a */
        public final void m53169a(Throwable th2) {
            AbstractC19074t.m100208f(th2, C30268e.f140632a);
            ((InterfaceC22723b0) EditChannelAvatarPresenterImpl.this.m52968s()).mo54242d5(th2);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53169a((Throwable) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.EditChannelAvatarPresenterImpl$c */
    /* loaded from: classes5.dex */
    static final class C9870c extends AbstractC19075u implements InterfaceC18505l {
        C9870c() {
            super(1);
        }

        /* renamed from: a */
        public final void m53170a(UserProfileResult userProfileResult) {
            String str;
            AbstractC19074t.m100208f(userProfileResult, "result");
            InterfaceC22723b0 interfaceC22723b0 = (InterfaceC22723b0) EditChannelAvatarPresenterImpl.this.m52968s();
            Channel m51257a = userProfileResult.m51257a();
            if (m51257a != null) {
                str = m51257a.m50754c();
            } else {
                str = null;
            }
            if (str == null) {
                str = "";
            }
            interfaceC22723b0.mo54241Cg(str);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53170a((UserProfileResult) obj);
            return C24848g0.f119245a;
        }
    }

    public EditChannelAvatarPresenterImpl(InterfaceC18170g interfaceC18170g) {
        AbstractC19074t.m100208f(interfaceC18170g, "restRepo");
        this.f51721r = interfaceC18170g;
    }

    @Override // com.zing.zalo.shortvideo.p072ui.presenter.BasePresenterImpl, androidx.lifecycle.InterfaceC1767f
    /* renamed from: Zv */
    public void mo8648Zv(InterfaceC1801w interfaceC1801w) {
        AbstractC19074t.m100208f(interfaceC1801w, "owner");
        super.mo8648Zv(interfaceC1801w);
        BasePresenterImpl.m52964r(this, false, 1, null);
    }

    @Override // h20.InterfaceC19721e
    /* renamed from: ua */
    public void mo53166ua(String str) {
        AbstractC19074t.m100208f(str, "id");
        m52966n(new C9868a(str, null), new C9869b(), new C9870c());
    }
}
