package gg;

import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import com.zing.zalo.chathead.ChatHeadUI.ChatHead;
import com.zing.zalo.chathead.ChatHeadUI.PopupFragment.UpArrowLayout;
import com.zing.zalo.startup.StartupApplication;
import d60.C17799h;
import gg0.AbstractC19444a;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kg.AbstractC21707d;
import kg.C21709f;
import kg.C21711h;
import me0.AbstractC23136l9;
import p209hg.C20052c;
import p266jg.AbstractC21244b;
import p266jg.AbstractC21245c;
import p266jg.C21243a;
import p304ks.C21927m;
import p348mi.AbstractC23309i;
import p361nb.AbstractC23647d;
import vg.C28222w7;
import zl0.AbstractC32232i;

/* renamed from: gg.e */
/* loaded from: classes3.dex */
public class C19442e extends AbstractC19438a {

    /* renamed from: s */
    static int f96467s;

    /* renamed from: b */
    C20052c f96470b;

    /* renamed from: c */
    UpArrowLayout f96471c;

    /* renamed from: d */
    int f96472d;

    /* renamed from: e */
    int f96473e;

    /* renamed from: j */
    int f96478j;

    /* renamed from: k */
    int f96479k;

    /* renamed from: l */
    int f96480l;

    /* renamed from: m */
    int f96481m;

    /* renamed from: n */
    C21709f f96482n;

    /* renamed from: o */
    C21709f f96483o;

    /* renamed from: r */
    static int f96466r = AbstractC23136l9.m118742r(50.0f);

    /* renamed from: t */
    static boolean f96468t = false;

    /* renamed from: a */
    final Map f96469a = new HashMap();

    /* renamed from: f */
    ChatHead f96474f = null;

    /* renamed from: g */
    boolean f96475g = false;

    /* renamed from: h */
    boolean f96476h = true;

    /* renamed from: i */
    boolean f96477i = false;

    /* renamed from: p */
    int f96484p = C21243a.f103542q;

    /* renamed from: q */
    Rect f96485q = new Rect();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: gg.e$a */
    /* loaded from: classes3.dex */
    public class a extends AbstractC21707d {

        /* renamed from: p */
        final /* synthetic */ C20052c f96486p;

        a(C20052c c20052c) {
            this.f96486p = c20052c;
        }

        @Override // kg.AbstractC21707d, kg.InterfaceC21713j
        /* renamed from: a */
        public void mo39827a(C21709f c21709f) {
            super.mo39827a(c21709f);
            if (C19442e.this.m101679o() != null) {
                C19442e.this.m101679o().setScaleX((float) c21709f.m112033d());
                C19442e.this.m101679o().setScaleY((float) c21709f.m112033d());
            }
            if (!C19442e.this.f96477i && c21709f.m112040m()) {
                C19442e c19442e = C19442e.this;
                c19442e.f96477i = true;
                this.f96486p.m104154f(c19442e.f96474f, c19442e.m101679o());
                C19442e.this.m101679o().m39858d(false);
            }
        }

        @Override // kg.AbstractC21707d, kg.InterfaceC21713j
        /* renamed from: c */
        public void mo39829c(C21709f c21709f) {
            super.mo39829c(c21709f);
            C19442e.this.f96477i = false;
            if (!AbstractC32232i.m155457e("x86")) {
                AbstractC32232i.m155462j(C19442e.this.m101679o(), 0, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: gg.e$b */
    /* loaded from: classes3.dex */
    public class b extends AbstractC21707d {
        b() {
        }

        @Override // kg.AbstractC21707d, kg.InterfaceC21713j
        /* renamed from: a */
        public void mo39827a(C21709f c21709f) {
            super.mo39827a(c21709f);
            if (C19442e.this.m101679o() != null) {
                C19442e.this.m101679o().setAlpha((float) c21709f.m112033d());
            }
        }
    }

    /* renamed from: gg.e$c */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class c {

        /* renamed from: a */
        static final /* synthetic */ int[] f96489a;

        static {
            int[] iArr = new int[d.values().length];
            f96489a = iArr;
            try {
                iArr[d.OPEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f96489a[d.CANCEL_REMOVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f96489a[d.REMOVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f96489a[d.SWITCH_TAB.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f96489a[d.POINT_TO.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* renamed from: gg.e$d */
    /* loaded from: classes3.dex */
    public enum d {
        REMOVE,
        CANCEL_REMOVE,
        OPEN,
        SWITCH_TAB,
        POINT_TO
    }

    public C19442e(C20052c c20052c) {
        this.f96470b = c20052c;
        this.f96478j = c20052c.m104167s().f103543a;
        this.f96479k = c20052c.m104167s().f103544b;
        c20052c.m104167s();
        this.f96480l = C21243a.f103541p;
        c20052c.m104167s();
        this.f96481m = C21243a.f103540o;
        C21709f m112019d = c20052c.m104128B().m112019d();
        this.f96482n = m112019d;
        m112019d.m112048u(C21711h.m112058a(40.0d, 8.0d));
        this.f96482n.m112030a(new a(c20052c));
        this.f96482n.m112044q(0.20000000298023224d);
        C21709f m112019d2 = c20052c.m104128B().m112019d();
        this.f96483o = m112019d2;
        m112019d2.m112048u(C21711h.m112058a(40.0d, 9.0d));
        this.f96483o.m112030a(new b());
        this.f96483o.m112044q(0.0d);
        f96467s = AbstractC21244b.m110053c(c20052c.m104168t(), 15);
    }

    /* renamed from: r */
    public /* synthetic */ void m101672r() {
        m101687z();
        StartupApplication.Companion.m56558a().m56553l(null);
    }

    /* renamed from: s */
    public /* synthetic */ void m101673s() {
        AbstractC19444a.m101695c(new Runnable() { // from class: gg.d
            public /* synthetic */ RunnableC19441d() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C19442e.this.m101672r();
            }
        });
    }

    /* renamed from: t */
    public /* synthetic */ void m101674t(View view) {
        m101678n();
    }

    /* renamed from: A */
    int m101675A(int i11, int i12) {
        if (i12 - i11 < i11) {
            return (i12 - C21243a.f103541p) + AbstractC23136l9.m118742r(10.0f);
        }
        return -AbstractC23136l9.m118742r(10.0f);
    }

    /* renamed from: B */
    public void m101676B(int i11, int i12) {
        int i13;
        int i14;
        try {
            this.f96472d = i11;
            this.f96473e = i12;
            List m104165n = this.f96470b.m104165n();
            int size = this.f96472d - (m104165n.size() * (this.f96480l + this.f96478j));
            int m101680p = m101680p();
            int size2 = ((m104165n.size() - 1) * (this.f96481m + this.f96479k)) + m101680p;
            for (int i15 = 0; i15 < m104165n.size(); i15++) {
                ChatHead chatHead = (ChatHead) m104165n.get(i15);
                if (chatHead.getUser().f94432w) {
                    if (this.f96470b.m104127A() != null) {
                        if (this.f96470b.m104127A() instanceof C19443f) {
                        }
                    }
                    chatHead.setAlphaSpring(1.0d);
                }
                int i16 = this.f96473e;
                int i17 = this.f96472d;
                if (i16 > i17) {
                    i13 = ((this.f96480l + this.f96478j) * i15) + size;
                    i14 = m101680p;
                } else {
                    i13 = i17 - (this.f96480l + this.f96484p);
                    i14 = size2 - ((this.f96481m + this.f96479k) * i15);
                }
                this.f96469a.put(chatHead, new Point(i13, i14));
                if (!chatHead.m39833z() && chatHead.getState() == ChatHead.EnumC7836g.FREE) {
                    C21709f horizontalSpring = chatHead.getHorizontalSpring();
                    C21709f verticalSpring = chatHead.getVerticalSpring();
                    horizontalSpring.m112043p();
                    verticalSpring.m112043p();
                    horizontalSpring.m112045r(i13, true);
                    verticalSpring.m112045r(i14, true);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: C */
    public void m101677C(d dVar, ChatHead chatHead) {
        int i11 = c.f96489a[dVar.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 == 5) {
                            m101683v(chatHead);
                            return;
                        }
                        return;
                    } else {
                        m101685x(1.0f, 1.0f);
                        m101686y(chatHead);
                        return;
                    }
                }
                m101681q();
                return;
            }
            m101687z();
            return;
        }
        m101682u(chatHead);
        this.f96475g = true;
    }

    @Override // gg.AbstractC19438a
    /* renamed from: a */
    public boolean mo101659a(ChatHead chatHead) {
        return true;
    }

    @Override // gg.AbstractC19438a
    /* renamed from: b */
    public boolean mo101660b(ChatHead chatHead, int i11, int i12, C21709f c21709f, C21709f c21709f2, boolean z11) {
        int i13;
        int i14;
        double d11;
        if (chatHead.getState() == ChatHead.EnumC7836g.FREE && !this.f96470b.m104166r().m39841l()) {
            this.f96470b.m104166r().m39836g();
        }
        if (z11) {
            if (i11 == 0 && i12 == 0) {
                i13 = 1;
                i14 = 1;
            } else {
                i13 = i11;
                i14 = i12;
            }
            double d12 = i14;
            double d13 = -i13;
            double m112033d = c21709f.m112033d();
            this.f96470b.m104167s();
            int i15 = i13;
            double m112033d2 = c21709f2.m112033d();
            this.f96470b.m104167s();
            double d14 = ((-d12) * (m112033d + (C21243a.f103541p / 2))) - ((m112033d2 + (C21243a.f103540o / 2)) * d13);
            RectF rectF = this.f96470b.f98600L;
            if (rectF != null && i14 > 3500) {
                float m118742r = rectF.left - AbstractC23136l9.m118742r(20.0f);
                RectF rectF2 = this.f96470b.f98600L;
                d11 = d12;
                if (AbstractC21244b.m110051a(d12, d13, d14, m118742r, rectF2.top, rectF2.right + AbstractC23136l9.m118742r(20.0f), this.f96470b.f98600L.top)) {
                    if (this.f96470b.m104166r().m39841l()) {
                        this.f96470b.m104166r().m39835f();
                        this.f96470b.m104166r().m39845q(this.f96470b.m104166r().f42049w, this.f96470b.m104166r().f42050x);
                    }
                    c21709f.m112043p();
                    c21709f2.m112043p();
                    c21709f.m112048u(AbstractC21245c.f103555b);
                    c21709f2.m112048u(AbstractC21245c.f103555b);
                    c21709f.m112046s((this.f96470b.m104166r().f42049w + this.f96470b.m104166r().getxSpring().m112034f()) - (this.f96470b.m104166r().getMeasuredWidth() / 2));
                    c21709f2.m112046s((this.f96470b.m104166r().f42050x + this.f96470b.m104166r().getySpring().m112034f()) - (this.f96470b.m104166r().getMeasuredHeight() / 2));
                    this.f96470b.m104166r().m39842m();
                    chatHead.setState(ChatHead.EnumC7836g.CAPTURED);
                    return true;
                }
            } else {
                d11 = d12;
            }
            c21709f.m112049v(i15);
            c21709f2.m112049v(d11);
            return true;
        }
        if (chatHead != this.f96474f) {
            m101684w(chatHead, c21709f, c21709f2);
            m101677C(d.SWITCH_TAB, chatHead);
            mo101661c();
            return true;
        }
        m101678n();
        return false;
    }

    @Override // gg.AbstractC19438a
    /* renamed from: c */
    public void mo101661c() {
        try {
            ChatHead chatHead = this.f96474f;
            chatHead.m39825N(chatHead.m39831v(), true, true);
            List m104165n = this.f96470b.m104165n();
            for (int i11 = 0; i11 < m104165n.size(); i11++) {
                ChatHead chatHead2 = (ChatHead) m104165n.get(i11);
                if (!chatHead2.getUser().f94425p.equals(this.f96474f.getUser().f94425p)) {
                    chatHead2.m39825N(chatHead2.m39831v(), false, false);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // gg.AbstractC19438a
    /* renamed from: d */
    public void mo101662d(int i11, int i12, boolean z11, ChatHead chatHead) {
        int i13;
        int i14;
        List list;
        int i15;
        int i16;
        int i17;
        int i18;
        this.f96472d = i11;
        this.f96473e = i12;
        C17799h.m94029a().f90035j = 1;
        this.f96470b.m104151d0();
        List m104165n = this.f96470b.m104165n();
        int m104170w = this.f96470b.m104170w();
        if (m104170w < 0 || m104170w > m104165n.size() - 1) {
            m104170w = m104165n.size() - 1;
        }
        if (m104165n.size() > 0 && m104170w < m104165n.size() && m104170w >= 0) {
            this.f96474f = (ChatHead) m104165n.get(m104170w);
            int size = i11 - (m104165n.size() * (this.f96480l + this.f96478j));
            int m101680p = m101680p();
            int size2 = ((m104165n.size() - 1) * (this.f96481m + this.f96479k)) + m101680p;
            int i19 = 0;
            while (i19 < m104165n.size()) {
                ChatHead chatHead2 = (ChatHead) m104165n.get(i19);
                if (chatHead2.getUser().f94432w && (this.f96470b.m104127A() == null || (this.f96470b.m104127A() instanceof C19443f))) {
                    chatHead2.setAlphaSpring(1.0d);
                }
                if (i12 > i11) {
                    i13 = ((this.f96480l + this.f96478j) * i19) + size;
                    i14 = m101680p;
                } else {
                    i13 = i11 - (this.f96480l + this.f96484p);
                    i14 = size2 - ((this.f96481m + this.f96479k) * i19);
                }
                this.f96469a.put(chatHead2, new Point(i13, i14));
                if (chatHead2.m39833z() || chatHead2.getState() != ChatHead.EnumC7836g.FREE) {
                    list = m104165n;
                    i15 = size;
                    i16 = m101680p;
                } else {
                    C21709f horizontalSpring = chatHead2.getHorizontalSpring();
                    C21709f verticalSpring = chatHead2.getVerticalSpring();
                    verticalSpring.m112043p();
                    horizontalSpring.m112043p();
                    horizontalSpring.m112048u(AbstractC21245c.f103554a);
                    verticalSpring.m112048u(AbstractC21245c.f103554a);
                    horizontalSpring.m112049v(1.0d);
                    verticalSpring.m112049v(1.0d);
                    if (this.f96470b.m104127A() == null && this.f96476h) {
                        double d11 = this.f96470b.m104167s().f103545c.x;
                        list = m104165n;
                        double d12 = this.f96470b.m104167s().f103545c.y;
                        i15 = size;
                        double parseDouble = Double.parseDouble(AbstractC23309i.m122013ia("preference_relative_x", String.valueOf(d11), true));
                        double parseDouble2 = Double.parseDouble(AbstractC23309i.m122013ia("preference_relative_y", String.valueOf(d12), true));
                        i16 = m101680p;
                        int i21 = i13;
                        i17 = i14;
                        double d13 = i11;
                        int m110055e = (int) (AbstractC21244b.m110055e(parseDouble, (i11 - C21243a.f103541p) / d13) * d13);
                        double d14 = i12;
                        int m110055e2 = (int) (AbstractC21244b.m110055e(parseDouble2, (i12 - C21243a.f103539n) / d14) * d14);
                        int m101675A = m101675A(m110055e, i11);
                        if (m101675A <= 0) {
                            i18 = m101675A - 100;
                        } else {
                            i18 = m101675A + 100;
                        }
                        horizontalSpring.m112044q(i18);
                        verticalSpring.m112044q(m110055e2 - 100);
                        chatHead2.setAlphaSpring(1.0d);
                        if (i19 == 0) {
                            C17799h.m94029a().f90036k = m101675A;
                            C17799h.m94029a().f90037l = m110055e2;
                        }
                        i13 = i21;
                    } else {
                        list = m104165n;
                        i15 = size;
                        i16 = m101680p;
                        i17 = i14;
                    }
                    horizontalSpring.m112046s(i13);
                    verticalSpring.m112046s(i17);
                }
                i19++;
                m104165n = list;
                size = i15;
                m101680p = i16;
            }
            if (z11) {
                if (this.f96476h) {
                    m101677C(d.OPEN, this.f96474f);
                } else {
                    m101677C(d.SWITCH_TAB, chatHead);
                }
                if (!AbstractC32232i.m155457e("x86")) {
                    AbstractC32232i.m155462j(m101679o(), 2, null);
                }
            } else {
                m101677C(d.POINT_TO, this.f96474f);
            }
            mo101661c();
            ChatHead chatHead3 = this.f96474f;
            if (chatHead3 != null && chatHead3.getUser() != null && this.f96474f.getUser().f94428s != null && this.f96474f.getUser().f94428s.getBoolean("ACTION_SHOW_ZALOVIEW_FROM_SHORTCUT", false)) {
                C28222w7.m142183a().m142184b(4);
                this.f96474f.getUser().f94428s.remove("ACTION_SHOW_ZALOVIEW_FROM_SHORTCUT");
            } else {
                C28222w7.m142183a().m142184b(1);
            }
        }
    }

    @Override // gg.AbstractC19438a
    /* renamed from: e */
    public void mo101663e(ChatHead chatHead, boolean z11) {
        chatHead.getHorizontalSpring().m112044q(this.f96472d).m112043p();
        chatHead.getVerticalSpring().m112044q(m101680p()).m112043p();
        mo101662d(this.f96472d, this.f96473e, z11, chatHead);
    }

    @Override // gg.AbstractC19438a
    /* renamed from: f */
    public void mo101664f(ChatHead chatHead) {
        this.f96470b.m104156g(chatHead, m101679o());
        this.f96469a.remove(chatHead);
        boolean z11 = false;
        ChatHead chatHead2 = null;
        if (this.f96474f == chatHead) {
            if (this.f96470b.m104165n().size() > 0) {
                ChatHead chatHead3 = (ChatHead) this.f96470b.m104165n().get(0);
                if (chatHead3.getUser().f94432w && this.f96470b.m104165n().size() > this.f96470b.m104167s().f103553k) {
                    chatHead2 = (ChatHead) this.f96470b.m104165n().get(this.f96470b.m104165n().size() - 1);
                } else if (!chatHead3.getUser().f94432w || this.f96470b.m104165n().size() != this.f96470b.m104167s().f103553k) {
                    chatHead2 = chatHead3;
                }
            }
            if (chatHead2 != null) {
                C20052c c20052c = this.f96470b;
                c20052c.m104147Z(c20052c.m104165n().indexOf(chatHead2));
                z11 = true;
            }
        } else {
            C20052c c20052c2 = this.f96470b;
            c20052c2.m104147Z(c20052c2.m104165n().indexOf(this.f96474f));
        }
        if (this.f96470b.m104165n().size() > this.f96470b.m104167s().f103553k) {
            mo101662d(this.f96472d, this.f96473e, z11, chatHead2);
        }
    }

    @Override // gg.AbstractC19438a
    /* renamed from: g */
    public void mo101665g(C21243a c21243a) {
    }

    @Override // gg.AbstractC19438a
    /* renamed from: h */
    public void mo101666h(int i11, int i12) {
        ChatHead chatHead = this.f96474f;
        if (chatHead != null) {
            this.f96470b.m104156g(chatHead, m101679o());
        }
        m101679o().m39858d(false);
        m101685x(0.2f, 0.0f);
        this.f96476h = true;
        this.f96475g = false;
        this.f96477i = false;
        this.f96470b.m104131E();
        this.f96469a.clear();
    }

    @Override // gg.AbstractC19438a
    /* renamed from: i */
    public void mo101667i(ChatHead chatHead, boolean z11, int i11, int i12, C21709f c21709f, C21709f c21709f2, C21709f c21709f3, int i13) {
        ChatHead.EnumC7836g state = chatHead.getState();
        ChatHead.EnumC7836g enumC7836g = ChatHead.EnumC7836g.CAPTURED;
        if (state != enumC7836g) {
            if (!z11 && i13 < f96466r && c21709f.m112036h() == AbstractC21245c.f103557d) {
                m101684w(chatHead, c21709f2, c21709f3);
                return;
            }
            if (chatHead == this.f96474f) {
                if (z11 && m101679o().getVisibility() != 8) {
                    m101677C(d.REMOVE, this.f96474f);
                }
                if (this.f96475g && (Math.abs(c21709f3.m112034f() - c21709f3.m112033d()) <= Math.abs(c21709f3.m112034f() - c21709f3.m112037i()) / 16.0d || c21709f2.m112037i() == c21709f2.m112034f() || c21709f3.m112037i() == c21709f3.m112034f())) {
                    m101679o().m39858d(true);
                    this.f96475g = false;
                    StartupApplication.Companion.m56558a().m56554m(new StartupApplication.InterfaceC10902b() { // from class: gg.c
                        public /* synthetic */ C19440c() {
                        }

                        @Override // com.zing.zalo.startup.StartupApplication.InterfaceC10902b
                        /* renamed from: a */
                        public final void mo12585a() {
                            C19442e.this.m101673s();
                        }
                    });
                }
                if (this.f96476h && c21709f2.m112039l() && c21709f3.m112039l()) {
                    this.f96476h = false;
                }
            }
        }
        if (!z11 && !this.f96476h) {
            if (this.f96470b.f98600L.contains((float) c21709f2.m112033d(), (float) c21709f3.m112033d()) && c21709f2.m112036h() != AbstractC21245c.f103555b && c21709f3.m112036h() != AbstractC21245c.f103555b && c21709f3.m112036h() != AbstractC21245c.f103556c && c21709f2.m112036h() != AbstractC21245c.f103556c) {
                if (this.f96470b.m104166r().m39841l()) {
                    this.f96470b.m104166r().m39835f();
                    this.f96470b.m104166r().m39845q(this.f96470b.m104166r().f42049w, this.f96470b.m104166r().f42050x);
                }
                c21709f2.m112043p();
                c21709f3.m112043p();
                c21709f2.m112048u(AbstractC21245c.f103555b);
                c21709f3.m112048u(AbstractC21245c.f103555b);
                c21709f2.m112046s((this.f96470b.m104166r().f42049w + this.f96470b.m104166r().getxSpring().m112034f()) - (this.f96470b.m104166r().getMeasuredWidth() / 2));
                c21709f3.m112046s((this.f96470b.m104166r().f42050x + this.f96470b.m104166r().getySpring().m112034f()) - (this.f96470b.m104166r().getMeasuredHeight() / 2));
                this.f96470b.m104166r().m39842m();
                chatHead.setState(enumC7836g);
            }
            if (chatHead.getState() == enumC7836g && c21709f3.m112036h() == AbstractC21245c.f103555b) {
                c21709f2.m112036h();
            }
            if (chatHead.getState() == enumC7836g && c21709f3.m112036h() == AbstractC21245c.f103555b && c21709f2.m112036h() == AbstractC21245c.f103555b && Math.abs(i13) < f96467s) {
                c21709f2.m112043p();
                c21709f3.m112043p();
                c21709f3.m112048u(AbstractC21245c.f103556c);
                c21709f3.m112046s(i12);
                chatHead.getScaleSpring().m112046s(0.0d);
                this.f96470b.m104166r().m39836g();
            }
            if (chatHead.getState() == enumC7836g) {
                c21709f3.m112036h();
                C21711h c21711h = AbstractC21245c.f103554a;
            }
            if (chatHead.getState() == enumC7836g && c21709f3.m112036h() == AbstractC21245c.f103556c && Math.abs(i13) < f96467s) {
                chatHead.setState(ChatHead.EnumC7836g.REMOVED);
                this.f96470b.m104143T(chatHead.getUser());
                if (this.f96470b.m104165n().size() <= this.f96470b.m104167s().f103553k) {
                    AbstractC23647d.m123897g("22001402");
                }
            }
        }
        if (c21709f2 != null && c21709f2.m112039l() && c21709f3 != null && c21709f3.m112039l() && !AbstractC32232i.m155457e("x86")) {
            AbstractC32232i.m155462j(m101679o(), 0, null);
        }
    }

    @Override // gg.AbstractC19438a
    /* renamed from: j */
    public void mo101668j() {
        ChatHead chatHead = null;
        for (int i11 = 0; i11 < this.f96470b.m104165n().size(); i11++) {
            chatHead = (ChatHead) this.f96470b.m104165n().get(i11);
            if (!chatHead.getUser().f94432w && chatHead != this.f96474f) {
                break;
            }
        }
        if (chatHead != null) {
            this.f96470b.m104143T(chatHead.getUser());
        }
    }

    /* renamed from: n */
    public void m101678n() {
        this.f96470b.m104164m().m106788k().m39849c();
    }

    /* renamed from: o */
    UpArrowLayout m101679o() {
        if (this.f96471c == null) {
            this.f96471c = this.f96470b.m104163l();
        }
        return this.f96471c;
    }

    /* renamed from: p */
    int m101680p() {
        return this.f96470b.m104129C();
    }

    /* renamed from: q */
    void m101681q() {
        this.f96482n.m112046s(0.20000000298023224d);
        this.f96483o.m112046s(0.0d);
    }

    /* renamed from: u */
    void m101682u(ChatHead chatHead) {
        this.f96470b.m104156g(this.f96474f, m101679o());
        this.f96474f = chatHead;
        C20052c c20052c = this.f96470b;
        c20052c.m104147Z(c20052c.m104165n().indexOf(chatHead));
        m101683v(chatHead);
    }

    /* renamed from: v */
    void m101683v(ChatHead chatHead) {
        UpArrowLayout m101679o = m101679o();
        m101679o.setOnClickListener(new View.OnClickListener() { // from class: gg.b
            public /* synthetic */ ViewOnClickListenerC19439b() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C19442e.this.m101674t(view);
            }
        });
        Point point = (Point) this.f96469a.get(chatHead);
        if (point != null) {
            int m101680p = m101680p();
            int i11 = this.f96473e;
            int i12 = this.f96472d;
            if (i11 > i12) {
                int i13 = point.y;
                this.f96470b.m104167s();
                m101679o.m39855a(i12, i13 + C21243a.f103540o + this.f96484p, m101680p);
            } else {
                this.f96470b.m104167s();
                m101679o.m39855a(C21243a.f103541p + (this.f96484p * 2), this.f96473e, m101680p);
            }
            if (this.f96473e > this.f96472d) {
                int i14 = point.x;
                this.f96470b.m104167s();
                m101679o.setPivotX(i14 + (C21243a.f103541p / 2));
                int i15 = point.y;
                this.f96470b.m104167s();
                m101679o.setPivotY(i15 + C21243a.f103540o);
                return;
            }
            this.f96470b.m104167s();
            m101679o.setPivotX((r2 - C21243a.f103541p) - (this.f96484p * 2));
            int i16 = point.y;
            this.f96470b.m104167s();
            m101679o.setPivotY(i16 + (C21243a.f103540o / 2));
        }
    }

    /* renamed from: w */
    void m101684w(ChatHead chatHead, C21709f c21709f, C21709f c21709f2) {
        Point point;
        if (chatHead == this.f96474f) {
            m101677C(d.CANCEL_REMOVE, chatHead);
        }
        if (chatHead.getState() == ChatHead.EnumC7836g.FREE && (point = (Point) this.f96469a.get(chatHead)) != null) {
            c21709f.m112048u(AbstractC21245c.f103554a);
            c21709f.m112049v(0.0d);
            c21709f.m112046s(point.x);
            c21709f2.m112048u(AbstractC21245c.f103554a);
            c21709f2.m112049v(0.0d);
            c21709f2.m112046s(point.y);
        }
    }

    /* renamed from: x */
    void m101685x(float f11, float f12) {
        this.f96482n.m112044q(f11);
        this.f96483o.m112044q(f12);
    }

    /* renamed from: y */
    void m101686y(ChatHead chatHead) {
        this.f96470b.m104156g(this.f96474f, m101679o());
        this.f96474f = chatHead;
        C20052c c20052c = this.f96470b;
        c20052c.m104147Z(c20052c.m104165n().indexOf(chatHead));
        this.f96470b.m104154f(chatHead, m101679o());
        m101683v(chatHead);
        if (chatHead != null && chatHead.getUser() != null && C21927m.m114302u().m114345m(chatHead.getUser().f94425p)) {
            AbstractC23647d.m123897g("5801131");
        }
    }

    /* renamed from: z */
    void m101687z() {
        this.f96482n.m112046s(1.0d);
        this.f96483o.m112046s(1.0d);
    }
}
