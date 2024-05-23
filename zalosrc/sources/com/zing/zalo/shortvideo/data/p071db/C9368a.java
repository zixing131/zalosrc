package com.zing.zalo.shortvideo.data.p071db;

import a10.C0036a;
import a10.C0037b;
import a10.C0038c;
import a10.C0039d;
import a10.C0041f;
import a10.C0042g;
import a10.C0044i;
import a10.C0045j;
import a10.C0046k;
import a10.C0047l;
import a10.C0048m;
import a10.C0050o;
import a10.C0051p;
import a10.C0052q;
import a10.C0053r;
import a10.C0054s;
import com.zing.zalo.shortvideo.data.model.Channel;
import com.zing.zalo.shortvideo.data.model.User;
import com.zing.zalo.shortvideo.data.model.config.ChannelConfig;
import com.zing.zalocore.CoreUtility;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.List;
import kotlin.coroutines.Continuation;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import qm0.AbstractC25368s;
import v00.C27417l;
import y00.InterfaceC30248b;
import z00.InterfaceC31140a;
import z00.InterfaceC31142c;
import z00.InterfaceC31144e;
import z00.InterfaceC31146g;

/* renamed from: com.zing.zalo.shortvideo.data.db.a */
/* loaded from: classes5.dex */
public final class C9368a implements InterfaceC30248b {

    /* renamed from: a */
    private final ZchDataBase f49612a = ZchDataBase.Companion.m50521a();

    /* renamed from: b */
    private final InterfaceC24854k f49613b;

    /* renamed from: c */
    private final InterfaceC24854k f49614c;

    /* renamed from: d */
    private final InterfaceC24854k f49615d;

    /* renamed from: e */
    private final InterfaceC24854k f49616e;

    /* renamed from: com.zing.zalo.shortvideo.data.db.a$a */
    /* loaded from: classes5.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {
        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC31140a mo12V4() {
            return C9368a.this.f49612a.mo50517J();
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.data.db.a$b */
    /* loaded from: classes5.dex */
    static final class b extends AbstractC19075u implements InterfaceC18494a {
        b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC31142c mo12V4() {
            return C9368a.this.f49612a.mo50518K();
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.data.db.a$c */
    /* loaded from: classes5.dex */
    static final class c extends AbstractC19075u implements InterfaceC18494a {
        c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC31144e mo12V4() {
            return C9368a.this.f49612a.mo50519L();
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.data.db.a$d */
    /* loaded from: classes5.dex */
    static final class d extends AbstractC19075u implements InterfaceC18494a {
        d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC31146g mo12V4() {
            return C9368a.this.f49612a.mo50520M();
        }
    }

    public C9368a() {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        InterfaceC24854k m129210a3;
        InterfaceC24854k m129210a4;
        m129210a = AbstractC24856m.m129210a(new a());
        this.f49613b = m129210a;
        m129210a2 = AbstractC24856m.m129210a(new b());
        this.f49614c = m129210a2;
        m129210a3 = AbstractC24856m.m129210a(new d());
        this.f49615d = m129210a3;
        m129210a4 = AbstractC24856m.m129210a(new c());
        this.f49616e = m129210a4;
    }

    /* renamed from: J */
    private final InterfaceC31140a m50534J() {
        return (InterfaceC31140a) this.f49613b.getValue();
    }

    /* renamed from: K */
    private final InterfaceC31142c m50535K() {
        return (InterfaceC31142c) this.f49614c.getValue();
    }

    /* renamed from: L */
    private final InterfaceC31144e m50536L() {
        return (InterfaceC31144e) this.f49616e.getValue();
    }

    /* renamed from: M */
    private final InterfaceC31146g m50537M() {
        return (InterfaceC31146g) this.f49615d.getValue();
    }

    @Override // y00.InterfaceC30248b
    /* renamed from: A */
    public Object mo50538A(Continuation continuation) {
        C0037b mo151406q = m50535K().mo151406q();
        if (mo151406q != null) {
            return mo151406q.m122a();
        }
        return null;
    }

    @Override // y00.InterfaceC30248b
    /* renamed from: B */
    public Object mo50539B(List list, Continuation continuation) {
        m50534J().mo151323N(new C0050o(C27417l.f129055a.m140378b().m51234g(), list));
        return C24848g0.f119245a;
    }

    @Override // y00.InterfaceC30248b
    /* renamed from: C */
    public Object mo50540C(Continuation continuation) {
        C0036a mo151395a = m50535K().mo151395a();
        if (mo151395a != null) {
            return mo151395a.m120a();
        }
        return null;
    }

    @Override // y00.InterfaceC30248b
    /* renamed from: D */
    public Object mo50541D(int i11, Continuation continuation) {
        return m50536L().mo151414a(i11);
    }

    @Override // y00.InterfaceC30248b
    /* renamed from: E */
    public Object mo50542E(List list, Continuation continuation) {
        m50534J().mo151321L(new C0047l(C27417l.f129055a.m140378b().m51234g(), list));
        return C24848g0.f119245a;
    }

    @Override // y00.InterfaceC30248b
    /* renamed from: F */
    public Object mo50543F(Continuation continuation) {
        C0052q mo151396b = m50535K().mo151396b();
        if (mo151396b != null) {
            return mo151396b.m152a();
        }
        return null;
    }

    @Override // y00.InterfaceC30248b
    /* renamed from: G */
    public Object mo50544G(List list, Continuation continuation) {
        m50534J().mo151365z(new C0051p(C27417l.f129055a.m140378b().m51234g(), list));
        return C24848g0.f119245a;
    }

    @Override // y00.InterfaceC30248b
    /* renamed from: H */
    public Object mo50545H(List list, Continuation continuation) {
        m50534J().mo151362w(new C0039d(C27417l.f129055a.m140378b().m51234g(), list));
        return C24848g0.f119245a;
    }

    @Override // y00.InterfaceC30248b
    /* renamed from: J3 */
    public Object mo50546J3(int i11, Continuation continuation) {
        m50537M().mo151424c(i11);
        return C24848g0.f119245a;
    }

    @Override // y00.InterfaceC30248b
    /* renamed from: O2 */
    public Object mo50547O2(String str, Continuation continuation) {
        m50537M().mo151422a(str);
        return C24848g0.f119245a;
    }

    @Override // y00.InterfaceC30248b
    /* renamed from: a */
    public Object mo50548a(Continuation continuation) {
        m50534J().mo151337a0();
        return C24848g0.f119245a;
    }

    @Override // y00.InterfaceC30248b
    /* renamed from: b */
    public Object mo50549b(Continuation continuation) {
        List list;
        List m131502j;
        C0046k mo151312C = m50534J().mo151312C(C27417l.f129055a.m140378b().m51234g());
        if (mo151312C != null) {
            list = mo151312C.m140a();
        } else {
            list = null;
        }
        if (list == null) {
            m131502j = AbstractC25368s.m131502j();
            return m131502j;
        }
        return list;
    }

    @Override // y00.InterfaceC30248b
    /* renamed from: c */
    public Object mo50550c(User user, Continuation continuation) {
        m50535K().mo151399e(new C0052q(C27417l.f129055a.m140378b().m51234g(), user));
        return C24848g0.f119245a;
    }

    @Override // y00.InterfaceC30248b
    /* renamed from: d */
    public Object mo50551d(Continuation continuation) {
        this.f49612a.mo343f();
        return C24848g0.f119245a;
    }

    @Override // y00.InterfaceC30248b
    /* renamed from: e */
    public Object mo50552e(List list, Continuation continuation) {
        InterfaceC31144e m50536L = m50536L();
        String str = CoreUtility.f89233i;
        AbstractC19074t.m100207e(str, "currentUserUid");
        return m50536L.mo151418e(str, list);
    }

    @Override // y00.InterfaceC30248b
    /* renamed from: f */
    public Object mo50553f(List list, Continuation continuation) {
        m50534J().mo151341c0(new C0044i(C27417l.f129055a.m140378b().m51234g(), list));
        return C24848g0.f119245a;
    }

    @Override // y00.InterfaceC30248b
    /* renamed from: f3 */
    public Object mo50554f3(C0054s c0054s, Continuation continuation) {
        InterfaceC31146g m50537M = m50537M();
        c0054s.m161d(C27417l.f129055a.m140382f().m130131a());
        m50537M.mo151425d(c0054s);
        return C24848g0.f119245a;
    }

    @Override // y00.InterfaceC30248b
    /* renamed from: g */
    public Object mo50555g(Continuation continuation) {
        List list;
        List m131502j;
        C0047l mo151326Q = m50534J().mo151326Q(C27417l.f129055a.m140378b().m51234g());
        if (mo151326Q != null) {
            list = mo151326Q.m142a();
        } else {
            list = null;
        }
        if (list == null) {
            m131502j = AbstractC25368s.m131502j();
            return m131502j;
        }
        return list;
    }

    @Override // y00.InterfaceC30248b
    /* renamed from: h */
    public Object mo50556h(ChannelConfig channelConfig, Continuation continuation) {
        m50535K().mo151403i(new C0036a(0, channelConfig));
        return C24848g0.f119245a;
    }

    @Override // y00.InterfaceC30248b
    /* renamed from: i */
    public Object mo50557i(Continuation continuation) {
        List list;
        List m131502j;
        C0038c mo151328S = m50534J().mo151328S(C27417l.f129055a.m140378b().m51234g());
        if (mo151328S != null) {
            list = mo151328S.m124a();
        } else {
            list = null;
        }
        if (list == null) {
            m131502j = AbstractC25368s.m131502j();
            return m131502j;
        }
        return list;
    }

    @Override // y00.InterfaceC30248b
    /* renamed from: j */
    public Object mo50558j(Continuation continuation) {
        List list;
        List m131502j;
        C0041f mo151322M = m50534J().mo151322M(C27417l.f129055a.m140378b().m51234g());
        if (mo151322M != null) {
            list = mo151322M.m130a();
        } else {
            list = null;
        }
        if (list == null) {
            m131502j = AbstractC25368s.m131502j();
            return m131502j;
        }
        return list;
    }

    @Override // y00.InterfaceC30248b
    /* renamed from: k */
    public Object mo50559k(Continuation continuation) {
        List list;
        List m131502j;
        C0039d mo151363x = m50534J().mo151363x(C27417l.f129055a.m140378b().m51234g());
        if (mo151363x != null) {
            list = mo151363x.m126a();
        } else {
            list = null;
        }
        if (list == null) {
            m131502j = AbstractC25368s.m131502j();
            return m131502j;
        }
        return list;
    }

    @Override // y00.InterfaceC30248b
    /* renamed from: l */
    public Object mo50560l(Continuation continuation) {
        List list;
        List m131502j;
        C0048m mo151351l = m50534J().mo151351l(C27417l.f129055a.m140378b().m51234g());
        if (mo151351l != null) {
            list = mo151351l.m144a();
        } else {
            list = null;
        }
        if (list == null) {
            m131502j = AbstractC25368s.m131502j();
            return m131502j;
        }
        return list;
    }

    @Override // y00.InterfaceC30248b
    /* renamed from: m */
    public Object mo50561m(List list, Continuation continuation) {
        m50534J().mo151343d0(new C0041f(C27417l.f129055a.m140378b().m51234g(), list));
        return C24848g0.f119245a;
    }

    @Override // y00.InterfaceC30248b
    /* renamed from: n */
    public Object mo50562n(List list, Continuation continuation) {
        m50534J().mo151354o(new C0048m(C27417l.f129055a.m140378b().m51234g(), list));
        return C24848g0.f119245a;
    }

    @Override // y00.InterfaceC30248b
    /* renamed from: o */
    public Object mo50563o(Continuation continuation) {
        List list;
        List m131502j;
        C0051p mo151361v = m50534J().mo151361v(C27417l.f129055a.m140378b().m51234g());
        if (mo151361v != null) {
            list = mo151361v.m150a();
        } else {
            list = null;
        }
        if (list == null) {
            m131502j = AbstractC25368s.m131502j();
            return m131502j;
        }
        return list;
    }

    @Override // y00.InterfaceC30248b
    /* renamed from: p */
    public Object mo50564p(List list, Continuation continuation) {
        m50534J().mo151310A(new C0038c(C27417l.f129055a.m140378b().m51234g(), list));
        return C24848g0.f119245a;
    }

    @Override // y00.InterfaceC30248b
    /* renamed from: p1 */
    public Object mo50565p1(String str, Continuation continuation) {
        C0054s mo151423b = m50537M().mo151423b(str);
        if (mo151423b == null) {
            return new C0054s(str, 0, 0L, 6, null);
        }
        return mo151423b;
    }

    @Override // y00.InterfaceC30248b
    /* renamed from: q */
    public Object mo50566q(Continuation continuation) {
        List list;
        List m131502j;
        C0050o mo151317H = m50534J().mo151317H(C27417l.f129055a.m140378b().m51234g());
        if (mo151317H != null) {
            list = mo151317H.m148a();
        } else {
            list = null;
        }
        if (list == null) {
            m131502j = AbstractC25368s.m131502j();
            return m131502j;
        }
        return list;
    }

    @Override // y00.InterfaceC30248b
    /* renamed from: r */
    public Object mo50567r(String str, Continuation continuation) {
        InterfaceC31144e m50536L = m50536L();
        String str2 = CoreUtility.f89233i;
        AbstractC19074t.m100207e(str2, "currentUserUid");
        m50536L.mo151416c(new C0053r(0, str2, str, C27417l.f129055a.m140382f().m130131a(), 1, null));
        return C24848g0.f119245a;
    }

    @Override // y00.InterfaceC30248b
    /* renamed from: s */
    public Object mo50568s(Continuation continuation) {
        List list;
        List m131502j;
        C0042g mo151346g = m50534J().mo151346g(C27417l.f129055a.m140378b().m51234g());
        if (mo151346g != null) {
            list = mo151346g.m132a();
        } else {
            list = null;
        }
        if (list == null) {
            m131502j = AbstractC25368s.m131502j();
            return m131502j;
        }
        return list;
    }

    @Override // y00.InterfaceC30248b
    /* renamed from: t */
    public Object mo50569t(Continuation continuation) {
        List list;
        List m131502j;
        C0044i mo151340c = m50534J().mo151340c(C27417l.f129055a.m140378b().m51234g());
        if (mo151340c != null) {
            list = mo151340c.m136a();
        } else {
            list = null;
        }
        if (list == null) {
            m131502j = AbstractC25368s.m131502j();
            return m131502j;
        }
        return list;
    }

    @Override // y00.InterfaceC30248b
    /* renamed from: u */
    public Object mo50570u(List list, Continuation continuation) {
        m50534J().mo151355p(new C0045j(C27417l.f129055a.m140378b().m51234g(), list));
        return C24848g0.f119245a;
    }

    @Override // y00.InterfaceC30248b
    /* renamed from: v */
    public Object mo50571v(Channel channel, Continuation continuation) {
        if (channel == null) {
            return C24848g0.f119245a;
        }
        m50535K().mo151397c(new C0037b(C27417l.f129055a.m140378b().m51234g(), channel));
        return C24848g0.f119245a;
    }

    @Override // y00.InterfaceC30248b
    /* renamed from: w */
    public Object mo50572w(List list, Continuation continuation) {
        m50534J().mo151348i(new C0042g(C27417l.f129055a.m140378b().m51234g(), list));
        return C24848g0.f119245a;
    }

    @Override // y00.InterfaceC30248b
    /* renamed from: x */
    public Object mo50573x(List list, Continuation continuation) {
        m50534J().mo151339b0(new C0046k(C27417l.f129055a.m140378b().m51234g(), list));
        return C24848g0.f119245a;
    }

    @Override // y00.InterfaceC30248b
    /* renamed from: y */
    public Object mo50574y(Continuation continuation) {
        List list;
        List m131502j;
        C0045j mo151353n = m50534J().mo151353n(C27417l.f129055a.m140378b().m51234g());
        if (mo151353n != null) {
            list = mo151353n.m138a();
        } else {
            list = null;
        }
        if (list == null) {
            m131502j = AbstractC25368s.m131502j();
            return m131502j;
        }
        return list;
    }

    @Override // y00.InterfaceC30248b
    /* renamed from: z */
    public Object mo50575z(Continuation continuation) {
        m50534J().mo151336a();
        return C24848g0.f119245a;
    }
}
