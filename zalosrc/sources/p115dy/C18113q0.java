package p115dy;

import ag0.AbstractC0837p0;
import androidx.lifecycle.AbstractC1796t0;
import androidx.lifecycle.C1761c0;
import androidx.lifecycle.LiveData;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.p077ui.chat.C11318b;
import com.zing.zalo.pojo.ShareLinkInfo;
import com.zing.zalo.productcatalog.model.Product;
import com.zing.zalo.productcatalog.utils.AbstractC9183a;
import com.zing.zalo.productcatalog.utils.DeleteProductSource;
import com.zing.zalo.productcatalog.utils.MoveProductSource;
import com.zing.zalo.productcatalog.utils.SendProductSource;
import com.zing.zalocore.CoreUtility;
import cy.C17584c;
import dj.C17945a0;
import dj.C18013y0;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import gg0.AbstractC19444a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import me0.AbstractC23112j7;
import mm0.AbstractC23350e;
import p115dy.AbstractC18081b1;
import p115dy.AbstractC18084c1;
import p115dy.AbstractC18087d1;
import p115dy.AbstractC18116s;
import p115dy.AbstractC18122v;
import p115dy.AbstractC18124w;
import p115dy.AbstractC18129y0;
import p115dy.C18113q0;
import p185gc.AbstractC19378b;
import p348mi.AbstractC23306f;
import p363nh.C23744a;
import p589vx.AbstractC28659d;
import p589vx.AbstractC28670o;
import p589vx.AbstractC28671p;
import p589vx.C28669n;
import p624wx.AbstractC29263f;
import p624wx.C29259b;
import p716zh.C32098s;
import pm0.C24848g0;
import qm0.AbstractC25332a0;
import qm0.AbstractC25366r;
import qm0.AbstractC25368s;
import qm0.AbstractC25370t;
import sx.C26405g;
import tj.C26713e;
import xd0.C29599o;

/* renamed from: dy.q0 */
/* loaded from: classes4.dex */
public class C18113q0 extends AbstractC1796t0 {
    public static final a Companion = new a(null);

    /* renamed from: A */
    private final boolean f91672A;

    /* renamed from: B */
    private final boolean f91673B;

    /* renamed from: C */
    private final LinkedHashMap f91674C;

    /* renamed from: D */
    private boolean f91675D;

    /* renamed from: E */
    private boolean f91676E;

    /* renamed from: F */
    private final AtomicBoolean f91677F;

    /* renamed from: G */
    private final AtomicBoolean f91678G;

    /* renamed from: H */
    private final AtomicBoolean f91679H;

    /* renamed from: I */
    private final AtomicBoolean f91680I;

    /* renamed from: J */
    private final AtomicBoolean f91681J;

    /* renamed from: K */
    private final AtomicBoolean f91682K;

    /* renamed from: t */
    private long f91684t;

    /* renamed from: u */
    private C29259b f91685u;

    /* renamed from: w */
    private final C1761c0 f91687w;

    /* renamed from: x */
    private final C1761c0 f91688x;

    /* renamed from: y */
    private final LiveData f91689y;

    /* renamed from: z */
    private final LiveData f91690z;

    /* renamed from: s */
    private final C28669n f91683s = C28669n.Companion.m143559a();

    /* renamed from: v */
    private AbstractC18122v f91686v = AbstractC18122v.c.f91742a;

    /* renamed from: dy.q0$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: dy.q0$b */
    /* loaded from: classes4.dex */
    static final class b extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ InterfaceC18505l f91692r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC18505l interfaceC18505l) {
            super(1);
            this.f91692r = interfaceC18505l;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public static final void m96388d(InterfaceC18505l interfaceC18505l, C18113q0 c18113q0) {
            AbstractC19074t.m100208f(interfaceC18505l, "$listener");
            AbstractC19074t.m100208f(c18113q0, "this$0");
            interfaceC18505l.mo205i9(AbstractC18116s.c.f91724a);
            c18113q0.m96361R0();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public static final void m96389e(InterfaceC18505l interfaceC18505l, AbstractC28671p abstractC28671p) {
            AbstractC19074t.m100208f(interfaceC18505l, "$listener");
            AbstractC19074t.m100208f(abstractC28671p, "$result");
            interfaceC18505l.mo205i9(new AbstractC18116s.a(((AbstractC28671p.a) abstractC28671p).m143579a()));
        }

        /* renamed from: c */
        public final void m96390c(final AbstractC28671p abstractC28671p) {
            AbstractC19074t.m100208f(abstractC28671p, "result");
            C18113q0.this.f91679H.compareAndSet(true, false);
            if (abstractC28671p instanceof AbstractC28671p.b) {
                final InterfaceC18505l interfaceC18505l = this.f91692r;
                final C18113q0 c18113q0 = C18113q0.this;
                AbstractC19444a.m101695c(new Runnable() { // from class: dy.r0
                    @Override // java.lang.Runnable
                    public final void run() {
                        C18113q0.b.m96388d(InterfaceC18505l.this, c18113q0);
                    }
                });
            } else if (abstractC28671p instanceof AbstractC28671p.a) {
                final InterfaceC18505l interfaceC18505l2 = this.f91692r;
                AbstractC19444a.m101695c(new Runnable() { // from class: dy.s0
                    @Override // java.lang.Runnable
                    public final void run() {
                        C18113q0.b.m96389e(InterfaceC18505l.this, abstractC28671p);
                    }
                });
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m96390c((AbstractC28671p) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: dy.q0$c */
    /* loaded from: classes4.dex */
    static final class c extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ InterfaceC18505l f91694r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(InterfaceC18505l interfaceC18505l) {
            super(1);
            this.f91694r = interfaceC18505l;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public static final void m96393d(InterfaceC18505l interfaceC18505l) {
            AbstractC19074t.m100208f(interfaceC18505l, "$listener");
            interfaceC18505l.mo205i9(AbstractC18124w.c.f91752a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public static final void m96394e(InterfaceC18505l interfaceC18505l, AbstractC28671p abstractC28671p) {
            AbstractC19074t.m100208f(interfaceC18505l, "$listener");
            AbstractC19074t.m100208f(abstractC28671p, "$result");
            interfaceC18505l.mo205i9(new AbstractC18124w.a(((AbstractC28671p.a) abstractC28671p).m143579a()));
        }

        /* renamed from: c */
        public final void m96395c(final AbstractC28671p abstractC28671p) {
            AbstractC19074t.m100208f(abstractC28671p, "result");
            C18113q0.this.f91682K.compareAndSet(true, false);
            if (abstractC28671p instanceof AbstractC28671p.b) {
                C18113q0.this.m96361R0();
                final InterfaceC18505l interfaceC18505l = this.f91694r;
                AbstractC19444a.m101695c(new Runnable() { // from class: dy.t0
                    @Override // java.lang.Runnable
                    public final void run() {
                        C18113q0.c.m96393d(InterfaceC18505l.this);
                    }
                });
            } else if (abstractC28671p instanceof AbstractC28671p.a) {
                final InterfaceC18505l interfaceC18505l2 = this.f91694r;
                AbstractC19444a.m101695c(new Runnable() { // from class: dy.u0
                    @Override // java.lang.Runnable
                    public final void run() {
                        C18113q0.c.m96394e(InterfaceC18505l.this, abstractC28671p);
                    }
                });
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m96395c((AbstractC28671p) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: dy.q0$d */
    /* loaded from: classes4.dex */
    static final class d extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ ArrayList f91695q;

        /* renamed from: r */
        final /* synthetic */ SendProductSource f91696r;

        /* renamed from: s */
        final /* synthetic */ AtomicInteger f91697s;

        /* renamed from: t */
        final /* synthetic */ InterfaceC18505l f91698t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(ArrayList arrayList, SendProductSource sendProductSource, AtomicInteger atomicInteger, InterfaceC18505l interfaceC18505l) {
            super(1);
            this.f91695q = arrayList;
            this.f91696r = sendProductSource;
            this.f91697s = atomicInteger;
            this.f91698t = interfaceC18505l;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public static final void m96397c(InterfaceC18505l interfaceC18505l, ArrayList arrayList) {
            AbstractC19074t.m100208f(interfaceC18505l, "$listener");
            AbstractC19074t.m100208f(arrayList, "$shareLinkInfoList");
            interfaceC18505l.mo205i9(new AbstractC18084c1.b(arrayList));
        }

        /* renamed from: b */
        public final void m96398b(AbstractC28671p abstractC28671p) {
            AbstractC19074t.m100208f(abstractC28671p, "result");
            try {
                if (abstractC28671p instanceof AbstractC28671p.b) {
                    AbstractC28659d abstractC28659d = (AbstractC28659d) ((AbstractC28671p.b) abstractC28671p).m143582a();
                    if (abstractC28659d instanceof AbstractC28659d.a) {
                        String jSONObject = ((AbstractC28659d.a) abstractC28659d).m143404b().toString();
                        AbstractC19074t.m100207e(jSONObject, "toString(...)");
                        ShareLinkInfo shareLinkInfo = new ShareLinkInfo(1, jSONObject);
                        this.f91695q.add(shareLinkInfo);
                        C26405g m48436c = shareLinkInfo.m48436c();
                        if (m48436c != null) {
                            String str = m48436c.f125484g;
                            AbstractC19074t.m100207e(str, "mediaTitle");
                            if (str.length() > 0) {
                                m48436c.f125478a = "";
                            }
                            AbstractC9183a.m49006n(abstractC28659d.m143403a(), new C17584c(this.f91696r, m48436c.f125497t, m48436c.f125471A));
                        }
                    } else {
                        this.f91695q.add(new ShareLinkInfo(0, abstractC28659d.m143403a()));
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("ProductCatalogViewModel", e11);
            }
            if (this.f91697s.decrementAndGet() == 0) {
                final InterfaceC18505l interfaceC18505l = this.f91698t;
                final ArrayList arrayList = this.f91695q;
                AbstractC19444a.m101697e(new Runnable() { // from class: dy.v0
                    @Override // java.lang.Runnable
                    public final void run() {
                        C18113q0.d.m96397c(InterfaceC18505l.this, arrayList);
                    }
                });
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m96398b((AbstractC28671p) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: dy.q0$e */
    /* loaded from: classes4.dex */
    static final class e extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ SendProductSource f91699q;

        /* renamed from: r */
        final /* synthetic */ ArrayList f91700r;

        /* renamed from: s */
        final /* synthetic */ AtomicInteger f91701s;

        /* renamed from: t */
        final /* synthetic */ C18113q0 f91702t;

        /* renamed from: u */
        final /* synthetic */ InterfaceC18505l f91703u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(SendProductSource sendProductSource, ArrayList arrayList, AtomicInteger atomicInteger, C18113q0 c18113q0, InterfaceC18505l interfaceC18505l) {
            super(1);
            this.f91699q = sendProductSource;
            this.f91700r = arrayList;
            this.f91701s = atomicInteger;
            this.f91702t = c18113q0;
            this.f91703u = interfaceC18505l;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public static final void m96400c(InterfaceC18505l interfaceC18505l, ArrayList arrayList) {
            AbstractC19074t.m100208f(interfaceC18505l, "$listener");
            AbstractC19074t.m100208f(arrayList, "$shareLinkInfoList");
            interfaceC18505l.mo205i9(new AbstractC18087d1.b(arrayList));
        }

        /* renamed from: b */
        public final void m96401b(AbstractC28671p abstractC28671p) {
            AbstractC19074t.m100208f(abstractC28671p, "result");
            try {
                if (abstractC28671p instanceof AbstractC28671p.b) {
                    AbstractC28670o abstractC28670o = (AbstractC28670o) ((AbstractC28671p.b) abstractC28671p).m143582a();
                    if (abstractC28670o instanceof AbstractC28670o.a) {
                        String jSONObject = ((AbstractC28670o.a) abstractC28670o).m143578b().toString();
                        AbstractC19074t.m100207e(jSONObject, "toString(...)");
                        ShareLinkInfo shareLinkInfo = new ShareLinkInfo(1, jSONObject);
                        C26405g m48436c = shareLinkInfo.m48436c();
                        if (m48436c != null) {
                            String str = m48436c.f125484g;
                            AbstractC19074t.m100207e(str, "mediaTitle");
                            if (str.length() > 0) {
                                m48436c.f125478a = "";
                            }
                            AbstractC9183a.m49006n(abstractC28670o.m143577a(), new C17584c(this.f91699q, m48436c.f125497t, m48436c.f125471A));
                        }
                        this.f91700r.add(shareLinkInfo);
                    } else {
                        this.f91700r.add(new ShareLinkInfo(0, abstractC28670o.m143577a()));
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("ProductCatalogViewModel", e11);
            }
            if (this.f91701s.decrementAndGet() == 0) {
                final InterfaceC18505l interfaceC18505l = this.f91703u;
                final ArrayList arrayList = this.f91700r;
                AbstractC19444a.m101697e(new Runnable() { // from class: dy.w0
                    @Override // java.lang.Runnable
                    public final void run() {
                        C18113q0.e.m96400c(InterfaceC18505l.this, arrayList);
                    }
                });
                this.f91702t.f91681J.compareAndSet(true, false);
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m96401b((AbstractC28671p) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: dy.q0$f */
    /* loaded from: classes4.dex */
    public static final class f extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ String f91704q;

        /* renamed from: r */
        final /* synthetic */ List f91705r;

        /* renamed from: s */
        final /* synthetic */ C29259b f91706s;

        /* renamed from: t */
        final /* synthetic */ C18113q0 f91707t;

        /* renamed from: u */
        final /* synthetic */ SendProductSource f91708u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, List list, C29259b c29259b, C18113q0 c18113q0, SendProductSource sendProductSource) {
            super(1);
            this.f91704q = str;
            this.f91705r = list;
            this.f91706s = c29259b;
            this.f91707t = c18113q0;
            this.f91708u = sendProductSource;
        }

        /* renamed from: a */
        public final void m96402a(AbstractC28671p abstractC28671p) {
            C26713e c26713e;
            int i11;
            C32098s.a aVar;
            AbstractC19074t.m100208f(abstractC28671p, "result");
            try {
                if (abstractC28671p instanceof AbstractC28671p.b) {
                    AbstractC28659d abstractC28659d = (AbstractC28659d) ((AbstractC28671p.b) abstractC28671p).m143582a();
                    if (abstractC28659d instanceof AbstractC28659d.a) {
                        C18013y0 m154930o = C32098s.m154930o(((AbstractC28659d.a) abstractC28659d).m143404b());
                        String str = m154930o.f91251B.f147953c;
                        AbstractC19074t.m100207e(str, "mMediaTitle");
                        if (str.length() > 0) {
                            m154930o.f91011p = "";
                        }
                        MessageId.C7932a c7932a = MessageId.Companion;
                        String m103086b = AbstractC23306f.m120599M0().m103086b();
                        String str2 = this.f91704q;
                        String str3 = CoreUtility.f89233i;
                        AbstractC19074t.m100207e(str3, "currentUserUid");
                        C17945a0.w m95368d = new C17945a0.w(c7932a.m41064b(m103086b, "", str2, str3), 12).m95368d(m154930o);
                        C32098s c32098s = m154930o.f91251B;
                        if (c32098s != null) {
                            c26713e = c32098s.f147968r;
                        } else {
                            c26713e = null;
                        }
                        C17945a0 m95365a = m95368d.m95383s(c26713e).m95365a();
                        AbstractC19074t.m100207e(m95365a, "build(...)");
                        m95365a.m94951M9();
                        SendProductSource sendProductSource = this.f91708u;
                        C32098s c32098s2 = m154930o.f91251B;
                        if (c32098s2 != null) {
                            i11 = c32098s2.f147956f;
                        } else {
                            i11 = 0;
                        }
                        if (c32098s2 != null) {
                            aVar = c32098s2.f147975y;
                        } else {
                            aVar = null;
                        }
                        AbstractC9183a.m49006n(abstractC28659d.m143403a(), new C17584c(sendProductSource, i11, aVar));
                        AbstractC9183a.m49010r(m95365a);
                        C29599o m120694n1 = AbstractC23306f.m120694n1();
                        AbstractC19074t.m100207e(m120694n1, "provideSendMessageUseCase(...)");
                        AbstractC19378b.m101499c(m120694n1, new C29599o.a(this.f91704q, m95365a, false, null, 12, null), null, 2, null);
                    } else {
                        AbstractC23112j7.m118532h0(this.f91704q, abstractC28659d.m143403a());
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("ProductCatalogViewModel", e11);
            }
            this.f91705r.remove(this.f91706s);
            if (!this.f91705r.isEmpty()) {
                this.f91707t.m96347p0(this.f91704q, this.f91708u, this.f91705r);
                return;
            }
            this.f91707t.f91680I.compareAndSet(true, false);
            if (C11318b.Companion.m60525a().m60515j(this.f91704q)) {
                C23744a.Companion.m124119a().m124116d(5, this.f91704q);
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m96402a((AbstractC28671p) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: dy.q0$g */
    /* loaded from: classes4.dex */
    public static final class g extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ String f91709q;

        /* renamed from: r */
        final /* synthetic */ List f91710r;

        /* renamed from: s */
        final /* synthetic */ Product f91711s;

        /* renamed from: t */
        final /* synthetic */ C18113q0 f91712t;

        /* renamed from: u */
        final /* synthetic */ SendProductSource f91713u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(String str, List list, Product product, C18113q0 c18113q0, SendProductSource sendProductSource) {
            super(1);
            this.f91709q = str;
            this.f91710r = list;
            this.f91711s = product;
            this.f91712t = c18113q0;
            this.f91713u = sendProductSource;
        }

        /* renamed from: a */
        public final void m96403a(AbstractC28671p abstractC28671p) {
            C26713e c26713e;
            int i11;
            C32098s.a aVar;
            AbstractC19074t.m100208f(abstractC28671p, "result");
            try {
                if (abstractC28671p instanceof AbstractC28671p.b) {
                    AbstractC28670o abstractC28670o = (AbstractC28670o) ((AbstractC28671p.b) abstractC28671p).m143582a();
                    if (abstractC28670o instanceof AbstractC28670o.a) {
                        C18013y0 m154930o = C32098s.m154930o(((AbstractC28670o.a) abstractC28670o).m143578b());
                        String str = m154930o.f91251B.f147953c;
                        AbstractC19074t.m100207e(str, "mMediaTitle");
                        if (str.length() > 0) {
                            m154930o.f91011p = "";
                        }
                        MessageId.C7932a c7932a = MessageId.Companion;
                        String m103086b = AbstractC23306f.m120599M0().m103086b();
                        String str2 = this.f91709q;
                        String str3 = CoreUtility.f89233i;
                        AbstractC19074t.m100207e(str3, "currentUserUid");
                        C17945a0.w m95368d = new C17945a0.w(c7932a.m41064b(m103086b, "", str2, str3), 12).m95368d(m154930o);
                        C32098s c32098s = m154930o.f91251B;
                        if (c32098s != null) {
                            c26713e = c32098s.f147968r;
                        } else {
                            c26713e = null;
                        }
                        C17945a0 m95365a = m95368d.m95383s(c26713e).m95365a();
                        AbstractC19074t.m100207e(m95365a, "build(...)");
                        m95365a.m94951M9();
                        SendProductSource sendProductSource = this.f91713u;
                        C32098s c32098s2 = m154930o.f91251B;
                        if (c32098s2 != null) {
                            i11 = c32098s2.f147956f;
                        } else {
                            i11 = 0;
                        }
                        if (c32098s2 != null) {
                            aVar = c32098s2.f147975y;
                        } else {
                            aVar = null;
                        }
                        AbstractC9183a.m49006n(abstractC28670o.m143577a(), new C17584c(sendProductSource, i11, aVar));
                        AbstractC9183a.m49010r(m95365a);
                        C29599o m120694n1 = AbstractC23306f.m120694n1();
                        AbstractC19074t.m100207e(m120694n1, "provideSendMessageUseCase(...)");
                        AbstractC19378b.m101499c(m120694n1, new C29599o.a(this.f91709q, m95365a, false, null, 12, null), null, 2, null);
                    } else {
                        AbstractC23112j7.m118532h0(this.f91709q, abstractC28670o.m143577a());
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("ProductCatalogViewModel", e11);
            }
            this.f91710r.remove(this.f91711s);
            if (!this.f91710r.isEmpty()) {
                this.f91712t.m96348q0(this.f91709q, this.f91713u, this.f91710r);
                return;
            }
            this.f91712t.f91680I.compareAndSet(true, false);
            if (C11318b.Companion.m60525a().m60515j(this.f91709q)) {
                C23744a.Companion.m124119a().m124116d(5, this.f91709q);
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m96403a((AbstractC28671p) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: dy.q0$h */
    /* loaded from: classes4.dex */
    public static final class h extends AbstractC19075u implements InterfaceC18505l {
        h() {
            super(1);
        }

        /* renamed from: a */
        public final void m96404a(AbstractC28671p abstractC28671p) {
            AbstractC19074t.m100208f(abstractC28671p, "result");
            if (abstractC28671p instanceof AbstractC28671p.b) {
                AbstractC28671p.b bVar = (AbstractC28671p.b) abstractC28671p;
                C29259b m143545U = C18113q0.this.m96349A0().m143545U(String.valueOf(((C29259b) bVar.m143582a()).m146161p()), ((C29259b) bVar.m143582a()).m146158m());
                C18113q0 c18113q0 = C18113q0.this;
                if (m143545U == null) {
                    m143545U = (C29259b) bVar.m143582a();
                }
                c18113q0.m96358N0(m143545U);
                C18113q0.this.m96360P0(AbstractC18122v.a.f91740a);
                C18113q0.m96333M0(C18113q0.this, false, 1, null);
            } else if ((abstractC28671p instanceof AbstractC28671p.a) && ((AbstractC28671p.a) abstractC28671p).m143581c()) {
                C18113q0.this.m96360P0(AbstractC18122v.h.f91747a);
            } else {
                C18113q0.this.m96360P0(AbstractC18122v.b.f91741a);
            }
            C18113q0.this.m96361R0();
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m96404a((AbstractC28671p) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: dy.q0$i */
    /* loaded from: classes4.dex */
    public static final class i extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ C29259b f91715q;

        /* renamed from: r */
        final /* synthetic */ C18113q0 f91716r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(C29259b c29259b, C18113q0 c18113q0) {
            super(1);
            this.f91715q = c29259b;
            this.f91716r = c18113q0;
        }

        /* renamed from: a */
        public final void m96405a(AbstractC28671p abstractC28671p) {
            AbstractC19074t.m100208f(abstractC28671p, "result");
            if (abstractC28671p instanceof AbstractC28671p.b) {
                if (AbstractC9183a.m48999g()) {
                    String m146159n = this.f91715q.m146159n();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("loadCatalogProducts [RESULT:SUCCESS] catalog: ");
                    sb2.append(m146159n);
                }
                this.f91716r.m96360P0(AbstractC18122v.e.f91744a);
            } else {
                if (AbstractC9183a.m48999g()) {
                    String m146159n2 = this.f91715q.m146159n();
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("loadCatalogProducts [RESULT:OTHER] catalog: ");
                    sb3.append(m146159n2);
                    sb3.append(", result: ");
                    sb3.append(abstractC28671p);
                }
                if (abstractC28671p instanceof AbstractC28671p.a) {
                    AbstractC28671p.a aVar = (AbstractC28671p.a) abstractC28671p;
                    if (aVar.m143581c()) {
                        this.f91716r.m96360P0(AbstractC18122v.h.f91747a);
                    } else if (aVar.m143580b()) {
                        this.f91716r.m96360P0(AbstractC18122v.e.f91744a);
                    } else {
                        this.f91716r.m96360P0(AbstractC18122v.d.f91743a);
                    }
                }
            }
            this.f91716r.m96361R0();
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m96405a((AbstractC28671p) obj);
            return C24848g0.f119245a;
        }
    }

    public C18113q0() {
        C1761c0 c1761c0 = new C1761c0();
        this.f91687w = c1761c0;
        C1761c0 c1761c02 = new C1761c0();
        this.f91688x = c1761c02;
        this.f91689y = c1761c0;
        this.f91690z = c1761c02;
        this.f91674C = new LinkedHashMap();
        this.f91677F = new AtomicBoolean(false);
        this.f91678G = new AtomicBoolean(false);
        this.f91679H = new AtomicBoolean(false);
        this.f91680I = new AtomicBoolean(false);
        this.f91681J = new AtomicBoolean(false);
        this.f91682K = new AtomicBoolean(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F0 */
    public static final void m96330F0(C18113q0 c18113q0, long j11) {
        AbstractC19074t.m100208f(c18113q0, "this$0");
        if (c18113q0.f91684t != j11) {
            c18113q0.mo96376o0();
            c18113q0.f91684t = j11;
        }
        synchronized (c18113q0) {
            try {
                c18113q0.m96360P0(AbstractC18122v.c.f91742a);
                if (c18113q0.f91685u == null) {
                    c18113q0.m96381v0();
                } else {
                    m96333M0(c18113q0, false, 1, null);
                }
                c18113q0.m96361R0();
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: K0 */
    public static /* synthetic */ void m96331K0(C18113q0 c18113q0, boolean z11, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 1) != 0) {
                z11 = false;
            }
            c18113q0.m96356J0(z11);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadCatalogProducts");
    }

    /* renamed from: M0 */
    public static /* synthetic */ void m96333M0(C18113q0 c18113q0, boolean z11, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 1) != 0) {
                z11 = false;
            }
            c18113q0.m96357L0(z11);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: refreshCatalogProducts");
    }

    /* renamed from: Q0 */
    private final void m96338Q0() {
        boolean z11;
        List<AbstractC18129y0> list = (List) this.f91688x.mo9215f();
        if (list != null) {
            for (AbstractC18129y0 abstractC18129y0 : list) {
                abstractC18129y0.m96418g(this.f91676E);
                boolean z12 = true;
                if (abstractC18129y0 instanceof AbstractC18129y0.i) {
                    AbstractC18129y0.i iVar = (AbstractC18129y0.i) abstractC18129y0;
                    if (!this.f91674C.containsKey(Long.valueOf(iVar.m96421h().m48485i())) && !this.f91675D) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    iVar.m96423j(z11);
                    if (this.f91675D || (!iVar.m96422i() && m96350B0() >= mo96383x0())) {
                        z12 = false;
                    }
                    abstractC18129y0.m96416e(z12);
                } else if (abstractC18129y0 instanceof AbstractC18129y0.a) {
                    ((AbstractC18129y0.a) abstractC18129y0).m96420i(!this.f91676E);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b0 */
    public static final void m96344b0(C18113q0 c18113q0) {
        AbstractC19074t.m100208f(c18113q0, "this$0");
        synchronized (c18113q0) {
            try {
                c18113q0.m96360P0(AbstractC18122v.c.f91742a);
                if (c18113q0.f91685u == null) {
                    c18113q0.m96381v0();
                } else {
                    c18113q0.m96357L0(true);
                }
                c18113q0.m96361R0();
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e0 */
    public static final void m96345e0(C18113q0 c18113q0) {
        AbstractC19074t.m100208f(c18113q0, "this$0");
        c18113q0.m96361R0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n0 */
    public static final void m96346n0(C18113q0 c18113q0) {
        AbstractC19074t.m100208f(c18113q0, "this$0");
        c18113q0.mo96376o0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p0 */
    public final void m96347p0(String str, SendProductSource sendProductSource, List list) {
        Object m131207g0;
        m131207g0 = AbstractC25332a0.m131207g0(list, 0);
        C29259b c29259b = (C29259b) m131207g0;
        if (c29259b == null) {
            this.f91680I.compareAndSet(true, false);
        } else {
            this.f91683s.m143556q0(c29259b, new f(str, list, c29259b, this, sendProductSource));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q0 */
    public final void m96348q0(String str, SendProductSource sendProductSource, List list) {
        Object m131207g0;
        m131207g0 = AbstractC25332a0.m131207g0(list, 0);
        Product product = (Product) m131207g0;
        if (product == null) {
            this.f91680I.compareAndSet(true, false);
        } else {
            this.f91683s.m143558s0(product, new g(str, list, product, this, sendProductSource));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: A0 */
    public final C28669n m96349A0() {
        return this.f91683s;
    }

    /* renamed from: B0 */
    public final int m96350B0() {
        int size;
        synchronized (this.f91674C) {
            size = this.f91674C.size();
        }
        return size;
    }

    /* renamed from: C0 */
    public final List m96351C0() {
        ArrayList arrayList;
        synchronized (this.f91674C) {
            arrayList = new ArrayList(this.f91674C.values());
        }
        return arrayList;
    }

    /* renamed from: D0 */
    public void m96352D0(AbstractC29263f abstractC29263f) {
        C29259b c29259b;
        AbstractC19074t.m100208f(abstractC29263f, "localEvent");
        if (AbstractC19074t.m100204b(abstractC29263f, AbstractC29263f.f.f135592b)) {
            m96366a0();
            return;
        }
        long j11 = 0;
        if (abstractC29263f instanceof AbstractC29263f.d) {
            C29259b c29259b2 = this.f91685u;
            if (c29259b2 != null) {
                j11 = c29259b2.m146158m();
            }
            if (j11 == ((AbstractC29263f.d) abstractC29263f).m146187c()) {
                m96366a0();
                return;
            }
            return;
        }
        if (abstractC29263f instanceof AbstractC29263f.h) {
            C29259b c29259b3 = this.f91685u;
            if (c29259b3 != null) {
                j11 = c29259b3.m146158m();
            }
            if (j11 == ((AbstractC29263f.h) abstractC29263f).m146190c().m48480d()) {
                m96367c0();
                return;
            }
            return;
        }
        if (abstractC29263f instanceof AbstractC29263f.j) {
            C29259b c29259b4 = this.f91685u;
            if (c29259b4 != null) {
                j11 = c29259b4.m146158m();
            }
            if (j11 == ((AbstractC29263f.j) abstractC29263f).m146193c().m48480d()) {
                m96367c0();
                return;
            }
            return;
        }
        if (abstractC29263f instanceof AbstractC29263f.i) {
            C29259b c29259b5 = this.f91685u;
            if (c29259b5 != null) {
                j11 = c29259b5.m146158m();
            }
            AbstractC29263f.i iVar = (AbstractC29263f.i) abstractC29263f;
            if (j11 == iVar.m146191c()) {
                mo96363X(iVar.m146192d());
                m96367c0();
                return;
            }
            return;
        }
        if (abstractC29263f instanceof AbstractC29263f.k) {
            C29259b c29259b6 = this.f91685u;
            if (c29259b6 != null) {
                j11 = c29259b6.m146158m();
            }
            AbstractC29263f.k kVar = (AbstractC29263f.k) abstractC29263f;
            if (j11 == kVar.m146196e()) {
                mo96363X(kVar.m146195d());
                m96367c0();
                return;
            } else {
                if (j11 == kVar.m146194c()) {
                    m96366a0();
                    return;
                }
                return;
            }
        }
        if (!(abstractC29263f instanceof AbstractC29263f.b) || (c29259b = this.f91685u) == null) {
            return;
        }
        AbstractC29263f.b bVar = (AbstractC29263f.b) abstractC29263f;
        if (c29259b.m146158m() == bVar.m146186c().m146158m() && c29259b.m146167v() != bVar.m146186c().m146167v()) {
            m96366a0();
        }
    }

    /* renamed from: E0 */
    public final void m96353E0(final long j11) {
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: dy.n0
            @Override // java.lang.Runnable
            public final void run() {
                C18113q0.m96330F0(C18113q0.this, j11);
            }
        });
    }

    /* renamed from: G0 */
    public final boolean m96354G0() {
        return this.f91676E;
    }

    /* renamed from: I0 */
    public final boolean m96355I0() {
        return this.f91675D;
    }

    /* renamed from: J0 */
    public final void m96356J0(boolean z11) {
        C29259b c29259b;
        if (!(this.f91686v instanceof AbstractC18122v.g) && (c29259b = this.f91685u) != null) {
            if (AbstractC9183a.m48999g()) {
                long m146158m = c29259b.m146158m();
                String m146160o = c29259b.m146160o();
                boolean z12 = !c29259b.m146164s().isEmpty();
                boolean m146157l = c29259b.m146157l();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("loadCatalogProducts [START] catalog id: ");
                sb2.append(m146158m);
                sb2.append(", name: ");
                sb2.append(m146160o);
                sb2.append(",\nforceRefreshFromServer: ");
                sb2.append(z11);
                sb2.append(", hasProducts: ");
                sb2.append(z12);
                sb2.append(", hasMoreProducts: ");
                sb2.append(m146157l);
            }
            if (z11 || c29259b.m146157l() || !(!c29259b.m146164s().isEmpty())) {
                m96360P0(new AbstractC18122v.g(z11));
                this.f91683s.m143549a0(c29259b, z11, new i(c29259b, this));
            }
        }
    }

    /* renamed from: L0 */
    protected final void m96357L0(boolean z11) {
        m96356J0(z11);
    }

    /* renamed from: N0 */
    protected final void m96358N0(C29259b c29259b) {
        this.f91685u = c29259b;
    }

    /* renamed from: O0 */
    public final void m96359O0(boolean z11) {
        boolean z12;
        if (this.f91676E != z11) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f91676E = z11;
        if (z12) {
            if (!z11) {
                mo96362W();
            }
            m96338Q0();
        }
    }

    /* renamed from: P0 */
    protected final void m96360P0(AbstractC18122v abstractC18122v) {
        AbstractC19074t.m100208f(abstractC18122v, "state");
        this.f91686v = abstractC18122v;
        this.f91687w.mo9221n(abstractC18122v);
    }

    /* renamed from: R0 */
    protected final void m96361R0() {
        boolean z11;
        boolean z12;
        EnumC18118t enumC18118t;
        AbstractC9183a.m48999g();
        ArrayList arrayList = new ArrayList();
        C29259b c29259b = this.f91685u;
        if (c29259b == null) {
            AbstractC18122v abstractC18122v = this.f91686v;
            if (AbstractC19074t.m100204b(abstractC18122v, AbstractC18122v.f.f91745a)) {
                arrayList.add(AbstractC18129y0.g.f91765d);
            } else if (AbstractC19074t.m100204b(abstractC18122v, AbstractC18122v.h.f91747a)) {
                arrayList.add(AbstractC18129y0.f.f91764d);
            } else if (AbstractC19074t.m100204b(abstractC18122v, AbstractC18122v.b.f91741a)) {
                arrayList.add(AbstractC18129y0.e.f91763d);
            }
            this.f91688x.mo9221n(arrayList);
            if (AbstractC9183a.m48999g()) {
                AbstractC18122v abstractC18122v2 = this.f91686v;
                int size = arrayList.size();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("updateProductListItems: END [CATALOG NULL], loadCatalogState: ");
                sb2.append(abstractC18122v2);
                sb2.append(", item size: ");
                sb2.append(size);
                return;
            }
            return;
        }
        C29259b m143545U = this.f91683s.m143545U(String.valueOf(c29259b.m146161p()), c29259b.m146158m());
        if (m143545U != null && m143545U != c29259b) {
            this.f91685u = m143545U;
            c29259b = m143545U;
        }
        List m146163r = c29259b.m146163r();
        if (AbstractC9183a.m48999g()) {
            AbstractC18122v abstractC18122v3 = this.f91686v;
            int size2 = m146163r.size();
            StringBuilder sb3 = new StringBuilder();
            sb3.append("updateProductListItems: CATALOG NOT NULL, loadCatalogState: ");
            sb3.append(abstractC18122v3);
            sb3.append(", product count: ");
            sb3.append(size2);
        }
        if (!m146163r.isEmpty()) {
            if (mo96377r0()) {
                AbstractC18129y0.a aVar = new AbstractC18129y0.a(!this.f91676E);
                aVar.m96417f(EnumC18118t.f91729r);
                arrayList.add(aVar);
            }
            if (mo96378s0()) {
                AbstractC18129y0.j jVar = new AbstractC18129y0.j();
                jVar.m96425i(this.f91675D);
                jVar.m96417f(EnumC18118t.f91727p);
                arrayList.add(jVar);
            }
        }
        int i11 = 0;
        for (Object obj : m146163r) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                AbstractC25368s.m131509q();
            }
            Product product = (Product) obj;
            AbstractC18129y0.i iVar = new AbstractC18129y0.i(product);
            iVar.m96418g(this.f91676E);
            if (!this.f91674C.containsKey(Long.valueOf(product.m48485i())) && !this.f91675D) {
                z11 = false;
            } else {
                z11 = true;
            }
            iVar.m96423j(z11);
            if (this.f91675D || (!iVar.m96422i() && m96350B0() >= mo96383x0())) {
                z12 = false;
            } else {
                z12 = true;
            }
            iVar.m96416e(z12);
            if (i11 < m146163r.size() - 1) {
                enumC18118t = EnumC18118t.f91729r;
            } else {
                enumC18118t = EnumC18118t.f91727p;
            }
            iVar.m96417f(enumC18118t);
            arrayList.add(iVar);
            i11 = i12;
        }
        AbstractC18122v abstractC18122v4 = this.f91686v;
        if (abstractC18122v4 instanceof AbstractC18122v.g) {
            if (m146163r.isEmpty()) {
                arrayList.add(AbstractC18129y0.g.f91765d);
            } else {
                arrayList.add(AbstractC18129y0.h.f91766d);
            }
        } else if (AbstractC19074t.m100204b(abstractC18122v4, AbstractC18122v.d.f91743a)) {
            if (m146163r.isEmpty()) {
                arrayList.add(AbstractC18129y0.e.f91763d);
            } else {
                arrayList.add(AbstractC18129y0.d.f91762d);
            }
        } else if (AbstractC19074t.m100204b(abstractC18122v4, AbstractC18122v.h.f91747a)) {
            if (m146163r.isEmpty()) {
                arrayList.add(AbstractC18129y0.f.f91764d);
            }
        } else if (AbstractC19074t.m100204b(abstractC18122v4, AbstractC18122v.e.f91744a) && m146163r.isEmpty()) {
            arrayList.add(AbstractC18129y0.c.f91761d);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbstractC18129y0) it.next()).m96418g(this.f91676E);
        }
        if (AbstractC9183a.m48999g()) {
            int size3 = arrayList.size();
            StringBuilder sb4 = new StringBuilder();
            sb4.append("updateProductListItems: END [CATALOG NOT NULL], item size: ");
            sb4.append(size3);
        }
        this.f91688x.mo9221n(arrayList);
    }

    /* renamed from: W */
    public void mo96362W() {
        synchronized (this.f91674C) {
            this.f91674C.clear();
            C24848g0 c24848g0 = C24848g0.f119245a;
        }
        List<AbstractC18129y0> list = (List) this.f91688x.mo9215f();
        if (list != null) {
            for (AbstractC18129y0 abstractC18129y0 : list) {
                if (abstractC18129y0 instanceof AbstractC18129y0.i) {
                    ((AbstractC18129y0.i) abstractC18129y0).m96423j(false);
                }
            }
        }
    }

    /* renamed from: X */
    public void mo96363X(List list) {
        AbstractC19074t.m100208f(list, "productIds");
        synchronized (this.f91674C) {
            try {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    this.f91674C.remove(Long.valueOf(((Number) it.next()).longValue()));
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: Y */
    public final void m96364Y(List list, DeleteProductSource deleteProductSource, InterfaceC18505l interfaceC18505l) {
        AbstractC19074t.m100208f(list, "products");
        AbstractC19074t.m100208f(deleteProductSource, "source");
        AbstractC19074t.m100208f(interfaceC18505l, "listener");
        C29259b c29259b = this.f91685u;
        if (c29259b == null || !this.f91679H.compareAndSet(false, true)) {
            return;
        }
        interfaceC18505l.mo205i9(AbstractC18116s.b.f91723a);
        this.f91683s.m143538L(c29259b.m146158m(), c29259b.m146167v(), this.f91683s.m143551e0(((Product) list.get(0)).m48489m()).m146253h(), list, deleteProductSource, new b(interfaceC18505l));
    }

    /* renamed from: Z */
    public final void m96365Z(long j11, List list, MoveProductSource moveProductSource, InterfaceC18505l interfaceC18505l) {
        AbstractC19074t.m100208f(list, "productIds");
        AbstractC19074t.m100208f(moveProductSource, "moveProductSource");
        AbstractC19074t.m100208f(interfaceC18505l, "listener");
        if (!this.f91682K.compareAndSet(false, true)) {
            return;
        }
        interfaceC18505l.mo205i9(AbstractC18124w.b.f91751a);
        this.f91683s.m143555p0(this.f91684t, j11, list, moveProductSource, new c(interfaceC18505l));
    }

    /* renamed from: a0 */
    public final void m96366a0() {
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: dy.o0
            @Override // java.lang.Runnable
            public final void run() {
                C18113q0.m96344b0(C18113q0.this);
            }
        });
    }

    /* renamed from: c0 */
    public final void m96367c0() {
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: dy.p0
            @Override // java.lang.Runnable
            public final void run() {
                C18113q0.m96345e0(C18113q0.this);
            }
        });
    }

    /* renamed from: f0 */
    public final boolean m96368f0(AbstractC18129y0.i iVar) {
        boolean z11;
        boolean z12;
        AbstractC19074t.m100208f(iVar, "productItem");
        synchronized (this.f91674C) {
            try {
                if (this.f91674C.size() < mo96383x0()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (iVar.m96422i()) {
                    this.f91674C.put(Long.valueOf(iVar.m96421h().m48485i()), iVar);
                } else {
                    this.f91674C.remove(Long.valueOf(iVar.m96421h().m48485i()));
                }
                if (this.f91674C.size() < mo96383x0()) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z11 != z12) {
                    m96338Q0();
                    return true;
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: g0 */
    public final boolean m96369g0(AbstractC18129y0.j jVar) {
        AbstractC19074t.m100208f(jVar, "item");
        this.f91675D = jVar.m96424h();
        synchronized (this.f91674C) {
            try {
                if (!this.f91675D) {
                    this.f91674C.clear();
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        m96338Q0();
        return true;
    }

    /* renamed from: h0 */
    public final void m96370h0(String str, SendProductSource sendProductSource, InterfaceC18505l interfaceC18505l) {
        AbstractC19074t.m100208f(str, "conversationId");
        AbstractC19074t.m100208f(sendProductSource, "sendProductSource");
        AbstractC19074t.m100208f(interfaceC18505l, "listener");
        C29259b c29259b = this.f91685u;
        if (c29259b == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(c29259b);
        if (!this.f91680I.compareAndSet(false, true)) {
            return;
        }
        interfaceC18505l.mo205i9(AbstractC18081b1.a.f91534a);
        m96347p0(str, sendProductSource, arrayList);
        interfaceC18505l.mo205i9(AbstractC18081b1.b.f91535a);
    }

    /* renamed from: i0 */
    public final void m96371i0(String str, SendProductSource sendProductSource, InterfaceC18505l interfaceC18505l) {
        int m131511r;
        List m131187O0;
        AbstractC19074t.m100208f(str, "conversationId");
        AbstractC19074t.m100208f(sendProductSource, "sendProductSource");
        AbstractC19074t.m100208f(interfaceC18505l, "listener");
        List m96351C0 = m96351C0();
        m131511r = AbstractC25370t.m131511r(m96351C0, 10);
        ArrayList arrayList = new ArrayList(m131511r);
        Iterator it = m96351C0.iterator();
        while (it.hasNext()) {
            arrayList.add(((AbstractC18129y0.i) it.next()).m96421h());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (AbstractC9183a.m49001i((Product) obj).length() > 0) {
                arrayList2.add(obj);
            }
        }
        m131187O0 = AbstractC25332a0.m131187O0(arrayList2);
        if (m131187O0.isEmpty() || !this.f91680I.compareAndSet(false, true)) {
            return;
        }
        interfaceC18505l.mo205i9(AbstractC18081b1.a.f91534a);
        m96348q0(str, sendProductSource, m131187O0);
        interfaceC18505l.mo205i9(AbstractC18081b1.b.f91535a);
    }

    /* renamed from: j0 */
    public final void m96372j0(SendProductSource sendProductSource, InterfaceC18505l interfaceC18505l) {
        List m131496e;
        List m131502j;
        AbstractC19074t.m100208f(sendProductSource, "sendProductSource");
        AbstractC19074t.m100208f(interfaceC18505l, "listener");
        C29259b c29259b = this.f91685u;
        if (c29259b == null) {
            m131502j = AbstractC25368s.m131502j();
            interfaceC18505l.mo205i9(new AbstractC18084c1.b(m131502j));
            return;
        }
        m131496e = AbstractC25366r.m131496e(c29259b);
        AtomicInteger atomicInteger = new AtomicInteger(m131496e.size());
        ArrayList arrayList = new ArrayList();
        Iterator it = m131496e.iterator();
        while (it.hasNext()) {
            this.f91683s.m143556q0((C29259b) it.next(), new d(arrayList, sendProductSource, atomicInteger, interfaceC18505l));
        }
    }

    /* renamed from: k0 */
    public final void m96373k0(List list, SendProductSource sendProductSource, InterfaceC18505l interfaceC18505l) {
        List m131502j;
        AbstractC19074t.m100208f(list, "products");
        AbstractC19074t.m100208f(sendProductSource, "sendProductSource");
        AbstractC19074t.m100208f(interfaceC18505l, "listener");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (AbstractC9183a.m49001i((Product) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            m131502j = AbstractC25368s.m131502j();
            interfaceC18505l.mo205i9(new AbstractC18087d1.b(m131502j));
        } else {
            if (!this.f91681J.compareAndSet(false, true)) {
                return;
            }
            AtomicInteger atomicInteger = new AtomicInteger(arrayList.size());
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.f91683s.m143558s0((Product) it.next(), new e(sendProductSource, arrayList2, atomicInteger, this, interfaceC18505l));
            }
        }
    }

    /* renamed from: l0 */
    public final boolean m96374l0() {
        if (this.f91685u != null) {
            return !r0.m146164s().isEmpty();
        }
        return false;
    }

    /* renamed from: m0 */
    public final void m96375m0() {
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: dy.m0
            @Override // java.lang.Runnable
            public final void run() {
                C18113q0.m96346n0(C18113q0.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: o0 */
    public void mo96376o0() {
        List m131502j;
        synchronized (this) {
            m96360P0(AbstractC18122v.c.f91742a);
            this.f91684t = 0L;
            this.f91685u = null;
            C1761c0 c1761c0 = this.f91688x;
            m131502j = AbstractC25368s.m131502j();
            c1761c0.mo9221n(m131502j);
            synchronized (this.f91674C) {
                this.f91674C.clear();
                C24848g0 c24848g0 = C24848g0.f119245a;
            }
            this.f91675D = false;
        }
    }

    /* renamed from: r0 */
    protected boolean mo96377r0() {
        return this.f91672A;
    }

    /* renamed from: s0 */
    protected boolean mo96378s0() {
        return this.f91673B;
    }

    /* renamed from: t0 */
    public boolean m96379t0() {
        if (m96350B0() < mo96383x0()) {
            return true;
        }
        return false;
    }

    /* renamed from: u0 */
    public final C29259b m96380u0() {
        return this.f91685u;
    }

    /* renamed from: v0 */
    protected void m96381v0() {
        m96360P0(AbstractC18122v.f.f91745a);
        this.f91683s.m143542R(this.f91684t, new h());
    }

    /* renamed from: w0 */
    public final LiveData m96382w0() {
        return this.f91689y;
    }

    /* renamed from: x0 */
    public int mo96383x0() {
        return Integer.MAX_VALUE;
    }

    /* renamed from: y0 */
    public int m96384y0() {
        return this.f91683s.m143541Q().m146134i();
    }

    /* renamed from: z0 */
    public final LiveData m96385z0() {
        return this.f91690z;
    }
}
