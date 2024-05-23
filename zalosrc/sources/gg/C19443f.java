package gg;

import android.graphics.RectF;
import com.zing.zalo.chathead.ChatHeadUI.ChatHead;
import d60.C17799h;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kg.AbstractC21707d;
import kg.C21709f;
import kg.C21710g;
import kg.InterfaceC21713j;
import me0.AbstractC23136l9;
import p209hg.C20052c;
import p266jg.AbstractC21244b;
import p266jg.AbstractC21245c;
import p266jg.C21243a;
import p348mi.AbstractC23309i;
import p361nb.AbstractC23647d;
import vg.C28222w7;

/* renamed from: gg.f */
/* loaded from: classes3.dex */
public class C19443f extends AbstractC19438a {

    /* renamed from: t */
    static int f96496t;

    /* renamed from: u */
    static int f96497u;

    /* renamed from: a */
    float f96498a;

    /* renamed from: e */
    int f96502e;

    /* renamed from: f */
    int f96503f;

    /* renamed from: h */
    C20052c f96505h;

    /* renamed from: i */
    C21710g f96506i;

    /* renamed from: j */
    C21710g f96507j;

    /* renamed from: k */
    List f96508k;

    /* renamed from: l */
    ChatHead f96509l;

    /* renamed from: q */
    int f96514q;

    /* renamed from: b */
    float f96499b = 0.0f;

    /* renamed from: c */
    int f96500c = -1;

    /* renamed from: d */
    int f96501d = -1;

    /* renamed from: g */
    boolean f96504g = false;

    /* renamed from: m */
    ChatHead f96510m = null;

    /* renamed from: n */
    boolean f96511n = false;

    /* renamed from: o */
    double f96512o = -1.0d;

    /* renamed from: p */
    double f96513p = -1.0d;

    /* renamed from: r */
    InterfaceC21713j f96515r = new a();

    /* renamed from: s */
    InterfaceC21713j f96516s = new b();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: gg.f$a */
    /* loaded from: classes3.dex */
    public class a extends AbstractC21707d {
        a() {
        }

        @Override // kg.AbstractC21707d, kg.InterfaceC21713j
        /* renamed from: a */
        public void mo39827a(C21709f c21709f) {
            C19443f c19443f = C19443f.this;
            double m112033d = c19443f.f96498a * ((c19443f.f96502e / 2) - c21709f.m112033d());
            C19443f c19443f2 = C19443f.this;
            c19443f.f96499b = (float) (m112033d / (c19443f2.f96502e / 2));
            C21710g c21710g = c19443f2.f96506i;
            if (c21710g != null) {
                c21710g.m112056h().m112044q(c21709f.m112033d());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: gg.f$b */
    /* loaded from: classes3.dex */
    public class b extends AbstractC21707d {
        b() {
        }

        @Override // kg.AbstractC21707d, kg.InterfaceC21713j
        /* renamed from: a */
        public void mo39827a(C21709f c21709f) {
            C21710g c21710g = C19443f.this.f96507j;
            if (c21710g != null) {
                c21710g.m112056h().m112044q(c21709f.m112033d());
            }
        }
    }

    /* renamed from: gg.f$c */
    /* loaded from: classes3.dex */
    public class c extends AbstractC21707d {

        /* renamed from: p */
        final /* synthetic */ ChatHead f96519p;

        c(ChatHead chatHead) {
            this.f96519p = chatHead;
        }

        @Override // kg.AbstractC21707d, kg.InterfaceC21713j
        /* renamed from: a */
        public void mo39827a(C21709f c21709f) {
            try {
                this.f96519p.getHorizontalSpring().m112044q(c21709f.m112033d() + (((C19443f.this.f96506i.m112055g().indexOf(c21709f) - C19443f.this.f96506i.m112055g().size()) + 1) * C19443f.this.f96499b));
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
    }

    /* renamed from: gg.f$d */
    /* loaded from: classes3.dex */
    public class d extends AbstractC21707d {

        /* renamed from: p */
        final /* synthetic */ ChatHead f96521p;

        d(ChatHead chatHead) {
            this.f96521p = chatHead;
        }

        @Override // kg.AbstractC21707d, kg.InterfaceC21713j
        /* renamed from: a */
        public void mo39827a(C21709f c21709f) {
            try {
                this.f96521p.getVerticalSpring().m112044q(c21709f.m112033d());
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
    }

    /* renamed from: gg.f$e */
    /* loaded from: classes3.dex */
    public class e extends AbstractC21707d {
        e() {
        }
    }

    /* renamed from: gg.f$f */
    /* loaded from: classes3.dex */
    public class f extends AbstractC21707d {
        f() {
        }
    }

    public C19443f(C20052c c20052c) {
        this.f96498a = 0.0f;
        this.f96505h = c20052c;
        this.f96498a = AbstractC21244b.m110052b(c20052c.getContext(), 5);
        f96497u = AbstractC21244b.m110053c(c20052c.m104168t(), 600);
        f96496t = AbstractC21244b.m110053c(c20052c.m104168t(), 15);
    }

    @Override // gg.AbstractC19438a
    /* renamed from: a */
    public boolean mo101659a(ChatHead chatHead) {
        return true;
    }

    @Override // gg.AbstractC19438a
    /* renamed from: b */
    public boolean mo101660b(ChatHead chatHead, int i11, int i12, C21709f c21709f, C21709f c21709f2, boolean z11) {
        ChatHead.EnumC7836g state = chatHead.getState();
        ChatHead.EnumC7836g enumC7836g = ChatHead.EnumC7836g.FREE;
        if (state == enumC7836g && !this.f96505h.m104166r().m39841l()) {
            this.f96505h.m104166r().m39836g();
        }
        if (!z11 && chatHead.getState() == enumC7836g) {
            m101689k();
            return false;
        }
        m101691m(chatHead, i11, i12);
        return true;
    }

    @Override // gg.AbstractC19438a
    /* renamed from: c */
    public void mo101661c() {
        try {
            List m104165n = this.f96505h.m104165n();
            ChatHead chatHead = this.f96509l;
            chatHead.m39825N(chatHead.m39831v(), true, true);
            boolean m39831v = this.f96509l.m39831v();
            for (int size = m104165n.size() - 1; size >= 0; size--) {
                ChatHead chatHead2 = (ChatHead) m104165n.get(size);
                if (!chatHead2.getUser().f94425p.equals(this.f96509l.getUser().f94425p)) {
                    if (chatHead2.m39831v() && !m39831v) {
                        chatHead2.m39825N(true, false, false);
                        m39831v = true;
                    } else {
                        chatHead2.m39825N(false, false, false);
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // gg.AbstractC19438a
    /* renamed from: d */
    public void mo101662d(int i11, int i12, boolean z11, ChatHead chatHead) {
        C17799h.m94029a().f90035j = 2;
        this.f96499b = 0.0f;
        this.f96514q = m101690l();
        if (this.f96506i != null || this.f96507j != null) {
            mo101666h(i11, i12);
        }
        if (!this.f96505h.m104166r().m39841l()) {
            this.f96505h.m104166r().m39836g();
        }
        List m104165n = this.f96505h.m104165n();
        int m104170w = this.f96505h.m104170w();
        if (m104170w < 0 || m104170w > m104165n.size() - 1) {
            m104170w = m104165n.size() - 1;
        }
        if (m104170w < m104165n.size() && m104170w >= 0) {
            ChatHead chatHead2 = (ChatHead) m104165n.get(m104170w);
            this.f96509l = chatHead2;
            if (chatHead2.getState() != ChatHead.EnumC7836g.FREE && this.f96505h.m104165n().size() > this.f96505h.m104167s().f103553k) {
                Iterator it = this.f96505h.m104165n().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ChatHead chatHead3 = (ChatHead) it.next();
                    if (!chatHead3.getUser().f94432w && chatHead3 != this.f96509l) {
                        this.f96509l = chatHead3;
                        break;
                    }
                }
                C20052c c20052c = this.f96505h;
                c20052c.m104147Z(c20052c.m104165n().indexOf(this.f96509l));
                this.f96505h.m104144U();
            }
            this.f96509l.setHero(true);
            this.f96506i = C21710g.m112053f(40, 6, 220, 15);
            this.f96507j = C21710g.m112053f(40, 6, 200, 15);
            this.f96508k = new ArrayList();
            if (this.f96502e != i11 || this.f96503f != i12) {
                this.f96500c = -1;
                this.f96501d = -1;
                this.f96502e = i11;
                this.f96503f = i12;
            }
            if (this.f96500c == -1 && this.f96501d == -1) {
                double d11 = this.f96505h.m104167s().f103545c.x;
                double d12 = this.f96505h.m104167s().f103545c.y;
                this.f96512o = Double.parseDouble(AbstractC23309i.m122013ia("preference_relative_x", String.valueOf(d11), true));
                this.f96513p = Double.parseDouble(AbstractC23309i.m122013ia("preference_relative_y", String.valueOf(d12), true));
                double d13 = i11;
                this.f96500c = (int) (AbstractC21244b.m110055e(this.f96512o, (i11 - C21243a.f103541p) / d13) * d13);
                int m110055e = (int) (AbstractC21244b.m110055e(this.f96513p, 1.0d) * (i12 - C21243a.f103539n));
                this.f96501d = m110055e;
                int i13 = this.f96514q;
                if (m110055e < i13) {
                    this.f96501d = i13;
                }
            }
            this.f96500c = m101692n(this.f96500c, i11);
            for (int i14 = 0; i14 < m104165n.size(); i14++) {
                ChatHead chatHead4 = (ChatHead) m104165n.get(i14);
                this.f96508k.add(chatHead4);
                if (chatHead4.getState() == ChatHead.EnumC7836g.FREE) {
                    if (chatHead4 != this.f96509l) {
                        chatHead4.setHero(false);
                        this.f96506i.m112054d(new c(chatHead4));
                        C21709f c21709f = (C21709f) this.f96506i.m112055g().get(this.f96506i.m112055g().size() - 1);
                        if (this.f96505h.m104127A() != null) {
                            c21709f.m112044q(chatHead4.getHorizontalSpring().m112033d());
                        } else {
                            int i15 = this.f96500c;
                            c21709f.m112044q(i15 <= 0 ? i15 - 100 : i15 + 100);
                        }
                        this.f96507j.m112054d(new d(chatHead4));
                        C21709f c21709f2 = (C21709f) this.f96507j.m112055g().get(this.f96507j.m112055g().size() - 1);
                        if (this.f96505h.m104127A() != null) {
                            c21709f2.m112044q(chatHead4.getVerticalSpring().m112033d());
                        } else {
                            c21709f2.m112044q(this.f96501d - 100);
                        }
                        this.f96505h.m104164m().m106782e(chatHead4);
                    }
                    if (chatHead4.getUser().f94432w && (this.f96505h.m104127A() == null || (this.f96505h.m104127A() instanceof C19442e))) {
                        chatHead4.setAlphaSpring(0.0d);
                    }
                }
            }
            ChatHead chatHead5 = this.f96509l;
            if (chatHead5 != null && chatHead5.getHorizontalSpring() != null && this.f96509l.getVerticalSpring() != null && this.f96509l.getState() == ChatHead.EnumC7836g.FREE) {
                this.f96505h.m104164m().m106782e(this.f96509l);
                this.f96506i.m112054d(new e());
                this.f96507j.m112054d(new f());
                C21710g c21710g = this.f96506i;
                c21710g.m112057i(c21710g.m112055g().size() - 1);
                C21710g c21710g2 = this.f96507j;
                c21710g2.m112057i(c21710g2.m112055g().size() - 1);
                this.f96509l.getHorizontalSpring().m112030a(this.f96515r);
                this.f96509l.getVerticalSpring().m112030a(this.f96516s);
                this.f96509l.getHorizontalSpring().m112048u(AbstractC21245c.f103554a);
                this.f96509l.getVerticalSpring().m112048u(AbstractC21245c.f103554a);
                if ((this.f96505h.m104127A() instanceof C19443f) || this.f96505h.m104127A() == null) {
                    C21709f horizontalSpring = this.f96509l.getHorizontalSpring();
                    int i16 = this.f96500c;
                    horizontalSpring.m112044q(i16 <= 0 ? i16 - 100 : i16 + 100);
                    this.f96509l.getVerticalSpring().m112044q(this.f96501d - 100);
                }
                C17799h.m94029a().f90036k = this.f96500c;
                C17799h.m94029a().f90037l = this.f96501d;
                this.f96509l.getHorizontalSpring().m112046s(this.f96500c);
                this.f96509l.getVerticalSpring().m112046s(this.f96501d);
            }
        }
        mo101661c();
        this.f96504g = true;
        C28222w7.m142183a().m142184b(2);
    }

    @Override // gg.AbstractC19438a
    /* renamed from: e */
    public void mo101663e(ChatHead chatHead, boolean z11) {
        int i11;
        ChatHead chatHead2 = this.f96509l;
        if (chatHead == chatHead2) {
            mo101661c();
            return;
        }
        if (chatHead2 != null && (chatHead2.m39833z() || (!this.f96509l.m39833z() && this.f96509l.getState() != ChatHead.EnumC7836g.FREE))) {
            if (!this.f96508k.contains(chatHead)) {
                double d11 = this.f96505h.m104167s().f103545c.x;
                double d12 = this.f96505h.m104167s().f103545c.y;
                this.f96512o = Double.parseDouble(AbstractC23309i.m122013ia("preference_relative_x", String.valueOf(d11), true));
                this.f96513p = Double.parseDouble(AbstractC23309i.m122013ia("preference_relative_y", String.valueOf(d12), true));
                int m110055e = (int) (AbstractC21244b.m110055e(this.f96512o, (r8 - C21243a.f103541p) / this.f96502e) * this.f96502e);
                int m110055e2 = (int) (AbstractC21244b.m110055e(this.f96513p, 1.0d) * (this.f96503f - C21243a.f103539n));
                if (m110055e <= 0) {
                    i11 = m110055e - 100;
                } else {
                    i11 = m110055e + 100;
                }
                chatHead.getHorizontalSpring().m112044q(i11);
                chatHead.getHorizontalSpring().m112046s(m110055e);
                chatHead.getVerticalSpring().m112044q(m110055e2 - 200);
                chatHead.getVerticalSpring().m112046s(m110055e2);
                this.f96505h.m104164m().m106782e(chatHead);
            }
            this.f96510m = chatHead;
            return;
        }
        ChatHead chatHead3 = this.f96509l;
        if (chatHead3 != null && chatHead3.getHorizontalSpring() != null && this.f96509l.getVerticalSpring() != null) {
            chatHead.getHorizontalSpring().m112044q(this.f96509l.getHorizontalSpring().m112033d() - this.f96499b);
            chatHead.getVerticalSpring().m112044q(this.f96509l.getVerticalSpring().m112033d());
        }
        C20052c c20052c = this.f96505h;
        c20052c.m104147Z(c20052c.m104165n().indexOf(chatHead));
        mo101662d(this.f96502e, this.f96503f, z11, chatHead);
    }

    @Override // gg.AbstractC19438a
    /* renamed from: f */
    public void mo101664f(ChatHead chatHead) {
        ChatHead chatHead2 = this.f96509l;
        if (chatHead == chatHead2 && chatHead2.getState() != ChatHead.EnumC7836g.REMOVED) {
            if (this.f96505h.m104165n().size() == this.f96505h.m104167s().f103546d) {
                this.f96511n = true;
                this.f96509l = null;
                return;
            }
            this.f96511n = false;
            ChatHead chatHead3 = (ChatHead) this.f96505h.m104165n().get(this.f96505h.m104165n().size() - 1);
            this.f96510m = chatHead3;
            if (this.f96500c == -1) {
                this.f96500c = (int) chatHead3.getHorizontalSpring().m112033d();
            }
            if (this.f96501d == -1) {
                this.f96501d = (int) this.f96510m.getVerticalSpring().m112033d();
            }
            C20052c c20052c = this.f96505h;
            c20052c.m104147Z(c20052c.m104165n().indexOf(this.f96510m));
            mo101662d(this.f96502e, this.f96503f, true, this.f96510m);
            return;
        }
        this.f96511n = false;
    }

    @Override // gg.AbstractC19438a
    /* renamed from: g */
    public void mo101665g(C21243a c21243a) {
    }

    @Override // gg.AbstractC19438a
    /* renamed from: h */
    public void mo101666h(int i11, int i12) {
        this.f96504g = false;
        ChatHead chatHead = this.f96509l;
        if (chatHead != null && chatHead.getHorizontalSpring() != null && this.f96509l.getVerticalSpring() != null) {
            this.f96509l.getHorizontalSpring().m112042o(this.f96515r);
            this.f96509l.getVerticalSpring().m112042o(this.f96516s);
        }
        C21710g c21710g = this.f96506i;
        if (c21710g != null) {
            Iterator it = c21710g.m112055g().iterator();
            while (it.hasNext()) {
                ((C21709f) it.next()).m112032c();
            }
        }
        C21710g c21710g2 = this.f96507j;
        if (c21710g2 != null) {
            Iterator it2 = c21710g2.m112055g().iterator();
            while (it2.hasNext()) {
                ((C21709f) it2.next()).m112032c();
            }
        }
        this.f96506i = null;
        this.f96507j = null;
    }

    @Override // gg.AbstractC19438a
    /* renamed from: i */
    public void mo101667i(ChatHead chatHead, boolean z11, int i11, int i12, C21709f c21709f, C21709f c21709f2, C21709f c21709f3, int i13) {
        if (chatHead != null) {
            ChatHead.EnumC7836g state = chatHead.getState();
            ChatHead.EnumC7836g enumC7836g = ChatHead.EnumC7836g.CAPTURED;
            if (state == enumC7836g && chatHead != this.f96509l && chatHead.getState() == enumC7836g && c21709f3.m112036h() == AbstractC21245c.f103555b && c21709f2.m112036h() == AbstractC21245c.f103555b) {
                if (!chatHead.getUser().m99172a()) {
                    chatHead.setState(ChatHead.EnumC7836g.REMOVED);
                    this.f96505h.m104143T(chatHead.getUser());
                }
                this.f96505h.m104166r().m39836g();
            }
        }
        if ((chatHead != null && chatHead != this.f96509l) || !this.f96504g) {
            return;
        }
        if (!z11 && Math.abs(i13) < f96497u) {
            ChatHead.EnumC7836g state2 = this.f96509l.getState();
            ChatHead.EnumC7836g enumC7836g2 = ChatHead.EnumC7836g.FREE;
            if (state2 == enumC7836g2) {
                if (c21709f2.m112039l() && c21709f3.m112039l()) {
                    double d11 = i11;
                    AbstractC23309i.m121806cv("preference_relative_x", String.valueOf(AbstractC21244b.m110055e(c21709f2.m112033d() / d11, (i11 - C21243a.f103541p) / d11)), true);
                    AbstractC23309i.m121806cv("preference_relative_y", String.valueOf(AbstractC21244b.m110055e(c21709f3.m112033d() / (i12 - C21243a.f103539n), 1.0d)), true);
                    this.f96500c = -1;
                    this.f96501d = -1;
                }
                ChatHead chatHead2 = this.f96510m;
                if (chatHead2 != null && chatHead2.getState() == enumC7836g2 && Math.abs(i13) < f96496t) {
                    if (!this.f96511n) {
                        this.f96500c = (int) c21709f2.m112033d();
                        this.f96501d = (int) c21709f3.m112033d();
                    } else {
                        this.f96500c = (int) this.f96510m.getHorizontalSpring().m112033d();
                        this.f96501d = (int) this.f96510m.getVerticalSpring().m112033d();
                        this.f96505h.m104164m().m106801x(this.f96505h.m104164m().m106789l(), this.f96500c);
                        this.f96505h.m104164m().m106802y(this.f96505h.m104164m().m106789l(), this.f96501d);
                    }
                    this.f96505h.m104130D();
                    C20052c c20052c = this.f96505h;
                    c20052c.m104147Z(c20052c.m104165n().indexOf(this.f96510m));
                    this.f96510m = null;
                    mo101662d(i11, i12, true, null);
                }
                if (c21709f == c21709f2 && c21709f.m112036h() == AbstractC21245c.f103557d) {
                    double m112033d = c21709f2.m112033d();
                    this.f96505h.m104167s();
                    if (C21243a.f103541p + m112033d > AbstractC23136l9.m118742r(29.0f) + i11) {
                        this.f96505h.m104167s();
                        int m118742r = (i11 - C21243a.f103541p) + AbstractC23136l9.m118742r(10.0f);
                        c21709f2.m112048u(AbstractC21245c.f103554a);
                        c21709f2.m112046s(m118742r);
                    } else if (m112033d < (-AbstractC23136l9.m118742r(29.0f))) {
                        c21709f2.m112048u(AbstractC21245c.f103554a);
                        c21709f2.m112046s(-AbstractC23136l9.m118742r(10.0f));
                    }
                } else if (c21709f == c21709f3 && c21709f.m112036h() == AbstractC21245c.f103557d) {
                    double m112033d2 = c21709f3.m112033d();
                    this.f96505h.m104167s();
                    if (C21243a.f103541p + m112033d2 >= i12) {
                        c21709f3.m112048u(AbstractC21245c.f103554a);
                        this.f96505h.m104167s();
                        c21709f3.m112046s(i12 - C21243a.f103540o);
                    } else if (m112033d2 <= this.f96514q) {
                        c21709f3.m112048u(AbstractC21245c.f103554a);
                        c21709f3.m112046s(this.f96514q);
                    }
                }
            }
        }
        if (!z11) {
            if (this.f96505h.f98600L.contains((float) c21709f2.m112033d(), (float) c21709f3.m112033d()) && c21709f2.m112036h() != AbstractC21245c.f103555b && c21709f3.m112036h() != AbstractC21245c.f103555b && c21709f2.m112036h() != AbstractC21245c.f103556c && c21709f3.m112036h() != AbstractC21245c.f103556c) {
                if (this.f96505h.m104166r().m39841l()) {
                    this.f96505h.m104166r().m39835f();
                    this.f96505h.m104166r().m39845q(this.f96505h.m104166r().f42049w, this.f96505h.m104166r().f42050x);
                }
                c21709f2.m112043p();
                c21709f3.m112043p();
                c21709f2.m112048u(AbstractC21245c.f103555b);
                c21709f3.m112048u(AbstractC21245c.f103555b);
                c21709f2.m112046s((this.f96505h.m104166r().f42049w + this.f96505h.m104166r().getxSpring().m112034f()) - (this.f96505h.m104166r().getMeasuredWidth() / 2));
                c21709f3.m112046s((this.f96505h.m104166r().f42050x + this.f96505h.m104166r().getySpring().m112034f()) - (this.f96505h.m104166r().getMeasuredHeight() / 2));
                this.f96505h.m104166r().m39842m();
                this.f96509l.setState(ChatHead.EnumC7836g.CAPTURED);
            }
            if (this.f96509l.getState() == ChatHead.EnumC7836g.CAPTURED && c21709f3.m112036h() == AbstractC21245c.f103555b && c21709f2.m112036h() == AbstractC21245c.f103555b && Math.abs(i13) < f96496t) {
                mo101666h(i11, i12);
                for (ChatHead chatHead3 : this.f96508k) {
                    if (chatHead3.getUser().m99172a()) {
                        chatHead3.setState(ChatHead.EnumC7836g.CAPTURED);
                        if (chatHead3.getHorizontalSpring() != null) {
                            chatHead3.getHorizontalSpring().m112043p();
                            chatHead3.getHorizontalSpring().m112048u(AbstractC21245c.f103556c);
                            chatHead3.getHorizontalSpring().m112046s(c21709f2.m112033d());
                        }
                        if (chatHead3.getVerticalSpring() != null) {
                            chatHead3.getVerticalSpring().m112043p();
                            chatHead3.getVerticalSpring().m112048u(AbstractC21245c.f103556c);
                            chatHead3.getVerticalSpring().m112046s(i12);
                        }
                        if (chatHead3.getScaleSpring() != null) {
                            chatHead3.getScaleSpring().m112046s(0.0d);
                        }
                    }
                }
                this.f96505h.m104166r().m39836g();
            }
            if (this.f96509l.getState() == ChatHead.EnumC7836g.CAPTURED && c21709f3.m112036h() == AbstractC21245c.f103556c && c21709f2.m112036h() == AbstractC21245c.f103556c && Math.abs(i13) < f96496t) {
                this.f96509l.setState(ChatHead.EnumC7836g.REMOVED);
                this.f96505h.m104142S();
                AbstractC23647d.m123897g("22001402");
            }
        }
    }

    @Override // gg.AbstractC19438a
    /* renamed from: j */
    public void mo101668j() {
        ChatHead chatHead = null;
        for (int i11 = 0; i11 < this.f96508k.size(); i11++) {
            chatHead = (ChatHead) this.f96508k.get(i11);
            if (!chatHead.getUser().f94432w) {
                break;
            }
        }
        if (chatHead != null) {
            this.f96508k.remove(chatHead);
            this.f96505h.m104143T(chatHead.getUser());
        }
    }

    /* renamed from: k */
    void m101689k() {
        try {
            ChatHead chatHead = this.f96509l;
            if (chatHead != null) {
                double m112033d = chatHead.getHorizontalSpring().m112033d();
                int i11 = this.f96502e;
                AbstractC23309i.m121806cv("preference_relative_x", String.valueOf(AbstractC21244b.m110055e(m112033d / i11, (i11 - C21243a.f103541p) / i11)), true);
                AbstractC23309i.m121806cv("preference_relative_y", String.valueOf(AbstractC21244b.m110055e(this.f96509l.getVerticalSpring().m112033d() / (this.f96503f - C21243a.f103539n), 1.0d)), true);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        this.f96505h.m104144U();
        this.f96505h.m104145W(C19442e.class);
    }

    /* renamed from: l */
    int m101690l() {
        return this.f96505h.m104129C();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00d6, code lost:            if (p266jg.AbstractC21244b.m110051a(r4, r12, r6, r14, r8.top, r8.right + me0.AbstractC23136l9.m118742r(20.0f), r22.f96505h.f98600L.bottom) != false) goto L90;     */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void m101691m(ChatHead chatHead, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int i16 = i12;
        C21709f horizontalSpring = chatHead.getHorizontalSpring();
        C21709f verticalSpring = chatHead.getVerticalSpring();
        if (chatHead.getState() == ChatHead.EnumC7836g.FREE) {
            double d11 = i16;
            double d12 = -i11;
            double m112033d = horizontalSpring.m112033d();
            this.f96505h.m104167s();
            double m112033d2 = verticalSpring.m112033d();
            this.f96505h.m104167s();
            double d13 = ((-d11) * (m112033d + (C21243a.f103541p / 2))) - ((m112033d2 + (C21243a.f103540o / 2)) * d12);
            RectF rectF = this.f96505h.f98600L;
            if (rectF != null && i16 > 3500) {
                float m118742r = rectF.left - AbstractC23136l9.m118742r(20.0f);
                RectF rectF2 = this.f96505h.f98600L;
                if (!AbstractC21244b.m110051a(d11, d12, d13, m118742r, rectF2.top, rectF2.right + AbstractC23136l9.m118742r(20.0f), this.f96505h.f98600L.top)) {
                    float m118742r2 = this.f96505h.f98600L.left - AbstractC23136l9.m118742r(20.0f);
                    RectF rectF3 = this.f96505h.f98600L;
                    if (!AbstractC21244b.m110051a(d11, d12, d13, m118742r2, rectF3.top, rectF3.right - AbstractC23136l9.m118742r(20.0f), this.f96505h.f98600L.bottom)) {
                        float m118742r3 = this.f96505h.f98600L.right + AbstractC23136l9.m118742r(20.0f);
                        RectF rectF4 = this.f96505h.f98600L;
                    }
                }
                if (this.f96505h.m104166r().m39841l()) {
                    this.f96505h.m104166r().m39835f();
                    this.f96505h.m104166r().m39845q(this.f96505h.m104166r().f42049w, this.f96505h.m104166r().f42050x);
                }
                horizontalSpring.m112043p();
                verticalSpring.m112043p();
                horizontalSpring.m112048u(AbstractC21245c.f103555b);
                verticalSpring.m112048u(AbstractC21245c.f103555b);
                horizontalSpring.m112046s((this.f96505h.m104166r().f42049w + this.f96505h.m104166r().getxSpring().m112034f()) - (this.f96505h.m104166r().getMeasuredWidth() / 2));
                verticalSpring.m112046s((this.f96505h.m104166r().f42050x + this.f96505h.m104166r().getySpring().m112034f()) - (this.f96505h.m104166r().getMeasuredHeight() / 2));
                this.f96505h.m104166r().m39842m();
                chatHead.setState(ChatHead.EnumC7836g.CAPTURED);
                return;
            }
            if (Math.abs(i11) < AbstractC21244b.m110053c(this.f96505h.m104168t(), 50)) {
                if (horizontalSpring.m112033d() < this.f96502e - horizontalSpring.m112033d()) {
                    i15 = -1;
                } else {
                    i15 = 1;
                }
            } else {
                i15 = i11;
            }
            i14 = (int) ((-(horizontalSpring.m112033d() + AbstractC23136l9.m118742r(30.0f))) * AbstractC21245c.f103557d.f105451a);
            double m112033d3 = this.f96502e - horizontalSpring.m112033d();
            this.f96505h.m104167s();
            int m118742r4 = (int) (((m112033d3 - C21243a.f103541p) + AbstractC23136l9.m118742r(30.0f)) * AbstractC21245c.f103557d.f105451a);
            if (i15 < 0) {
                if (horizontalSpring.m112033d() + i15 > this.f96502e / 2) {
                    i14 = m118742r4;
                } else if (i15 <= i14) {
                    i14 = 0;
                }
                if (i14 != 0) {
                    int i17 = (i16 * i14) / i15;
                    if (Math.abs(i17) > Math.abs(i12)) {
                        double d14 = i17;
                        if (verticalSpring.m112033d() + (d14 / AbstractC21245c.f103557d.f105451a) >= 0.0d && verticalSpring.m112033d() + (d14 / AbstractC21245c.f103557d.f105451a) <= this.f96503f && i15 != -1) {
                            i16 = i17;
                        }
                    }
                    i13 = -1;
                }
                i13 = -1;
                i14 = i15;
            } else {
                if (i15 > 0) {
                    if (horizontalSpring.m112033d() + i15 > this.f96502e / 2) {
                        if (i15 < m118742r4) {
                            i14 = m118742r4;
                        } else {
                            i14 = 0;
                        }
                    }
                    if (i14 != 0) {
                        int i18 = (i16 * i14) / i15;
                        if (Math.abs(i18) > Math.abs(i12)) {
                            double d15 = i18;
                            if (verticalSpring.m112033d() + (d15 / AbstractC21245c.f103557d.f105451a) >= 0.0d && verticalSpring.m112033d() + (d15 / AbstractC21245c.f103557d.f105451a) <= this.f96503f) {
                                i13 = -1;
                                if (i15 != -1) {
                                    i16 = i18;
                                }
                            }
                        }
                        i13 = -1;
                    }
                }
                i13 = -1;
                i14 = i15;
            }
        } else {
            i13 = -1;
            i14 = i11;
        }
        int i19 = 1;
        if (Math.abs(i14) <= 1) {
            if (i14 >= 0) {
                i13 = 1;
            }
        } else {
            i13 = i14;
        }
        if (i16 != 0) {
            i19 = i16;
        }
        horizontalSpring.m112049v(i13);
        verticalSpring.m112049v(i19);
    }

    /* renamed from: n */
    int m101692n(int i11, int i12) {
        if (i12 - i11 < i11) {
            return (i12 - C21243a.f103541p) + AbstractC23136l9.m118742r(10.0f);
        }
        return -AbstractC23136l9.m118742r(10.0f);
    }
}
