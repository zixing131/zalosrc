package p495rx;

import ae.C0766k;
import ag0.C0815e1;
import am.AbstractC0924m0;
import am.C0927o;
import am.C0943w;
import android.text.TextUtils;
import androidx.lifecycle.AbstractC1796t0;
import androidx.lifecycle.AbstractC1804x0;
import androidx.lifecycle.C1761c0;
import androidx.lifecycle.C1802w0;
import androidx.lifecycle.InterfaceC1764d0;
import androidx.lifecycle.LiveData;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.C7904b;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalocore.CoreUtility;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.InterfaceC19066n;
import gw.AbstractC19646n0;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import me0.AbstractC23089h6;
import me0.AbstractC23136l9;
import mm0.AbstractC23350e;
import p304ks.AbstractC21935u;
import p361nb.C23648e;
import p461qu.AbstractC25495a;
import p534u1.AbstractC26941a;
import p716zh.C31973j5;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.InterfaceC24847g;
import pm0.InterfaceC24854k;
import qm0.AbstractC25368s;

/* renamed from: rx.x */
/* loaded from: classes4.dex */
public final class C26010x extends AbstractC1796t0 {

    /* renamed from: A */
    private final InterfaceC24854k f124106A;

    /* renamed from: B */
    private final C1761c0 f124107B;

    /* renamed from: C */
    private final C1761c0 f124108C;

    /* renamed from: D */
    private final C1761c0 f124109D;

    /* renamed from: E */
    private final C1761c0 f124110E;

    /* renamed from: F */
    private final C1761c0 f124111F;

    /* renamed from: G */
    private C25988b f124112G;

    /* renamed from: H */
    private final InterfaceC24854k f124113H;

    /* renamed from: s */
    private String f124114s;

    /* renamed from: t */
    private C1761c0 f124115t;

    /* renamed from: u */
    private LiveData f124116u;

    /* renamed from: v */
    private C26000n f124117v;

    /* renamed from: w */
    private String f124118w;

    /* renamed from: x */
    private final InterfaceC24854k f124119x;

    /* renamed from: y */
    private final InterfaceC24854k f124120y;

    /* renamed from: z */
    private final InterfaceC24854k f124121z;

    /* renamed from: rx.x$a */
    /* loaded from: classes4.dex */
    static final class a extends AbstractC19075u implements InterfaceC18505l {
        a() {
            super(1);
        }

        /* renamed from: a */
        public final void m134087a(ArrayList arrayList) {
            C26010x.this.m134065n0();
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m134087a((ArrayList) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: rx.x$b */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a */
        private String f124123a;

        /* renamed from: b */
        private String f124124b;

        public b(String str, String str2) {
            AbstractC19074t.m100208f(str, "title");
            this.f124123a = str;
            this.f124124b = str2;
        }

        /* renamed from: a */
        public final String m134088a() {
            return this.f124124b;
        }

        /* renamed from: b */
        public final String m134089b() {
            return this.f124123a;
        }
    }

    /* renamed from: rx.x$c */
    /* loaded from: classes4.dex */
    public static final class c {

        /* renamed from: a */
        private String f124125a;

        /* renamed from: b */
        private String f124126b;

        public c(String str, String str2) {
            AbstractC19074t.m100208f(str, "conversationId");
            AbstractC19074t.m100208f(str2, "sourceOpen");
            this.f124125a = str;
            this.f124126b = str2;
        }

        /* renamed from: a */
        public final String m134090a() {
            return this.f124125a;
        }

        /* renamed from: b */
        public final String m134091b() {
            return this.f124126b;
        }
    }

    /* renamed from: rx.x$d */
    /* loaded from: classes4.dex */
    public static final class d implements C1802w0.b {

        /* renamed from: a */
        private final String f124127a;

        public d(String str) {
            AbstractC19074t.m100208f(str, "groupId");
            this.f124127a = str;
        }

        @Override // androidx.lifecycle.C1802w0.b
        /* renamed from: a */
        public /* synthetic */ AbstractC1796t0 mo1195a(Class cls, AbstractC26941a abstractC26941a) {
            return AbstractC1804x0.m9390b(this, cls, abstractC26941a);
        }

        @Override // androidx.lifecycle.C1802w0.b
        /* renamed from: b */
        public AbstractC1796t0 mo1196b(Class cls) {
            AbstractC19074t.m100208f(cls, "modelClass");
            return new C26010x(this.f124127a);
        }
    }

    /* renamed from: rx.x$e */
    /* loaded from: classes4.dex */
    static final class e extends AbstractC19075u implements InterfaceC18494a {
        e() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo12V4() {
            if (AbstractC25495a.m132078c(C26010x.this.m134070b0())) {
                return "4";
            }
            if (AbstractC25495a.m132079d(C26010x.this.m134070b0())) {
                return "2";
            }
            return "1";
        }
    }

    /* renamed from: rx.x$f */
    /* loaded from: classes4.dex */
    public static final class f implements InterfaceC20094a {
        f() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "errorMessage");
            try {
                if (c20096c.m104491c() == 17064) {
                    C25994h.f124017a.m133919h(C26010x.this.m134070b0()).m133960l();
                }
                String m104492d = c20096c.m104492d();
                if (!TextUtils.isEmpty(m104492d)) {
                    ToastUtils.showMess(m104492d);
                }
                C26010x.this.f124109D.mo9221n(Boolean.FALSE);
                C26010x.this.m134059W();
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, "entity");
            AbstractC19646n0.m102996k2();
            C26010x.this.f124110E.mo9221n(Boolean.TRUE);
            C26010x.this.m134058V();
        }
    }

    /* renamed from: rx.x$g */
    /* loaded from: classes4.dex */
    static final class g extends AbstractC19075u implements InterfaceC18494a {
        g() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo12V4() {
            return AbstractC25495a.m132088m(C26010x.this.m134070b0());
        }
    }

    /* renamed from: rx.x$h */
    /* loaded from: classes4.dex */
    static final class h extends AbstractC19075u implements InterfaceC18494a {
        h() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean mo12V4() {
            C31973j5 m4472f;
            boolean z11 = false;
            if (C26010x.this.m134064l0() && (m4472f = C0943w.f3447a.m4472f(C26010x.this.m134061Z())) != null && m4472f.m153747Y()) {
                z11 = true;
            }
            return Boolean.valueOf(z11);
        }
    }

    /* renamed from: rx.x$i */
    /* loaded from: classes4.dex */
    static final class i extends AbstractC19075u implements InterfaceC18494a {
        i() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean mo12V4() {
            return Boolean.valueOf(AbstractC25495a.m132079d(C26010x.this.m134070b0()));
        }
    }

    /* renamed from: rx.x$j */
    /* loaded from: classes4.dex */
    static final class j extends AbstractC19075u implements InterfaceC18505l {
        j() {
            super(1);
        }

        /* renamed from: a */
        public final void m134096a(ArrayList arrayList) {
            C26010x.this.m134065n0();
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m134096a((ArrayList) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: rx.x$k */
    /* loaded from: classes4.dex */
    public static final class k implements InterfaceC20094a {
        k() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "errorMessage");
            try {
                if (c20096c.m104491c() == 17064) {
                    C25994h.f124017a.m133919h(C26010x.this.m134070b0()).m133960l();
                }
                String m104492d = c20096c.m104492d();
                if (!TextUtils.isEmpty(m104492d)) {
                    ToastUtils.showMess(m104492d);
                }
                C26010x.this.f124109D.mo9221n(Boolean.FALSE);
                C26010x.this.m134059W();
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, "entity");
            AbstractC19646n0.m102996k2();
            C26010x.this.f124110E.mo9221n(Boolean.TRUE);
            C26010x.this.m134058V();
        }
    }

    /* renamed from: rx.x$l */
    /* loaded from: classes4.dex */
    static final class l implements InterfaceC1764d0, InterfaceC19066n {

        /* renamed from: p */
        private final /* synthetic */ InterfaceC18505l f124135p;

        l(InterfaceC18505l interfaceC18505l) {
            AbstractC19074t.m100208f(interfaceC18505l, "function");
            this.f124135p = interfaceC18505l;
        }

        @Override // fn0.InterfaceC19066n
        /* renamed from: c */
        public final InterfaceC24847g mo9368c() {
            return this.f124135p;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC1764d0) && (obj instanceof InterfaceC19066n)) {
                return AbstractC19074t.m100204b(mo9368c(), ((InterfaceC19066n) obj).mo9368c());
            }
            return false;
        }

        public final int hashCode() {
            return mo9368c().hashCode();
        }

        @Override // androidx.lifecycle.InterfaceC1764d0
        /* renamed from: qp */
        public final /* synthetic */ void mo8524qp(Object obj) {
            this.f124135p.mo205i9(obj);
        }
    }

    /* renamed from: rx.x$m */
    /* loaded from: classes4.dex */
    static final class m extends AbstractC19075u implements InterfaceC18494a {
        m() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo12V4() {
            String m118743r0;
            if (C26010x.this.m134064l0()) {
                m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_pinboard_empty);
            } else {
                m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_pinboard_empty_1_1);
            }
            AbstractC19074t.m100205c(m118743r0);
            return m118743r0;
        }
    }

    /* renamed from: rx.x$n */
    /* loaded from: classes4.dex */
    public static final class n implements InterfaceC20094a {
        n() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "errorMessage");
            ToastUtils.showMess(c20096c.m104492d());
            C26010x.this.m134073f0().m133960l();
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, C0927o.f3427r);
            C26010x.this.f124112G = null;
            C26010x.this.m134059W();
            AbstractC19646n0.m103000l2();
        }
    }

    public C26010x(String str) {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        InterfaceC24854k m129210a3;
        InterfaceC24854k m129210a4;
        InterfaceC24854k m129210a5;
        AbstractC19074t.m100208f(str, "mConversationId");
        this.f124114s = str;
        this.f124117v = C25994h.f124017a.m133919h(str);
        this.f124118w = "";
        m129210a = AbstractC24856m.m129210a(new e());
        this.f124119x = m129210a;
        m129210a2 = AbstractC24856m.m129210a(new i());
        this.f124120y = m129210a2;
        m129210a3 = AbstractC24856m.m129210a(new h());
        this.f124121z = m129210a3;
        m129210a4 = AbstractC24856m.m129210a(new g());
        this.f124106A = m129210a4;
        this.f124107B = new C1761c0();
        this.f124108C = new C1761c0();
        this.f124109D = new C1761c0();
        this.f124110E = new C1761c0();
        this.f124111F = new C1761c0();
        m129210a5 = AbstractC24856m.m129210a(new m());
        this.f124113H = m129210a5;
        LiveData m133965q = this.f124117v.m133965q();
        this.f124116u = m133965q;
        m133965q.m9220k(new l(new a()));
        this.f124115t = new C1761c0();
    }

    /* renamed from: U */
    private final void m134057U() {
        C7904b c7904b;
        if (!m134062j0()) {
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_no_permission_to_change_pin_board);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            if (m134063k0() && (c7904b = (C7904b) this.f124115t.mo9215f()) != null) {
                int i11 = c7904b.f42729a;
                if (i11 != 0) {
                    if (i11 != 3) {
                        if (i11 == 5) {
                            m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_no_permission_to_change_pin_board_after_create_collection);
                            AbstractC19074t.m100207e(m118743r0, "getString(...)");
                        }
                    } else {
                        m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_no_permission_to_change_pin_board_after_create_poll);
                        AbstractC19074t.m100207e(m118743r0, "getString(...)");
                    }
                } else {
                    m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_no_permission_to_change_pin_board_after_create_note);
                    AbstractC19074t.m100207e(m118743r0, "getString(...)");
                }
            }
            ToastUtils.showMess(m118743r0);
            this.f124110E.mo9221n(Boolean.FALSE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: V */
    public final void m134058V() {
        if (AbstractC0924m0.m2901A9() && this.f124117v.m133963o()) {
            this.f124111F.mo9221n(new c(this.f124114s, "csc_msgmenu"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: W */
    public final void m134059W() {
        this.f124108C.mo9221n(Boolean.valueOf(!this.f124117v.m133973z()));
    }

    /* renamed from: X */
    private final void m134060X(C7904b c7904b) {
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new f());
        if (m134064l0()) {
            c0766k.mo1717q5(m134061Z(), c7904b, true, "");
        } else {
            c0766k.mo1406C9(this.f124114s, this.f124117v.m133961m(), c7904b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Z */
    public final String m134061Z() {
        return (String) this.f124106A.getValue();
    }

    /* renamed from: j0 */
    private final boolean m134062j0() {
        if (m134064l0()) {
            C31973j5 m4472f = C0943w.f3447a.m4472f(m134061Z());
            if (m4472f == null) {
                return false;
            }
            if (!m4472f.m153742T() && m4472f.m153763h0()) {
                return false;
            }
        } else if (!AbstractC25495a.m132078c(this.f124114s) && !AbstractC21935u.m114554u(this.f124114s)) {
            return false;
        }
        return true;
    }

    /* renamed from: k0 */
    private final boolean m134063k0() {
        if (!AbstractC19074t.m100204b(this.f124118w, "gr_collection_create") && !AbstractC19074t.m100204b(this.f124118w, "gr_note_create") && !AbstractC19074t.m100204b(this.f124118w, "gr_poll_create")) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l0 */
    public final boolean m134064l0() {
        return ((Boolean) this.f124120y.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n0 */
    public final void m134065n0() {
        m134059W();
    }

    /* renamed from: s0 */
    private final void m134066s0(C7904b c7904b) {
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new k());
        if (m134064l0()) {
            c0766k.mo1476L6(m134061Z(), c7904b.f42729a, c7904b.f42715C);
        }
    }

    /* renamed from: y0 */
    private final void m134067y0(C25988b c25988b) {
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new n());
        if (m134064l0()) {
            c0766k.mo1551U9(m134061Z(), c25988b.m133906a(), c25988b.m133907b());
        } else {
            c0766k.mo1694n6(this.f124114s, this.f124117v.m133961m(), c25988b.m133906a(), c25988b.m133907b());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.AbstractC1796t0
    /* renamed from: J */
    public void mo9130J() {
        super.mo9130J();
        this.f124116u.mo9222o(new l(new j()));
    }

    /* renamed from: Y */
    public final String m134068Y() {
        return (String) this.f124119x.getValue();
    }

    /* renamed from: a0 */
    public final LiveData m134069a0() {
        return this.f124116u;
    }

    /* renamed from: b0 */
    public final String m134070b0() {
        return this.f124114s;
    }

    /* renamed from: c0 */
    public final int m134071c0() {
        return this.f124117v.m133966r();
    }

    /* renamed from: e0 */
    public final LiveData m134072e0() {
        return this.f124115t;
    }

    /* renamed from: f0 */
    public final C26000n m134073f0() {
        return this.f124117v;
    }

    /* renamed from: g0 */
    public final LiveData m134074g0() {
        return this.f124108C;
    }

    /* renamed from: h0 */
    public final String m134075h0() {
        return (String) this.f124113H.getValue();
    }

    /* renamed from: i0 */
    public final void m134076i0(int i11, Object... objArr) {
        List m131505m;
        List m131505m2;
        AbstractC19074t.m100208f(objArr, "args");
        if (i11 == 27 && m134064l0() && objArr.length >= 2) {
            int i12 = 0;
            Object obj = objArr[0];
            AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type kotlin.String");
            if (!TextUtils.equals((String) obj, m134061Z())) {
                return;
            }
            Object obj2 = objArr[1];
            AbstractC19074t.m100206d(obj2, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) obj2).intValue();
            if (intValue != 2) {
                if (intValue != 9) {
                    if (intValue != 11) {
                        if (intValue != 4) {
                            if (intValue != 5) {
                                return;
                            }
                        } else {
                            if (objArr.length >= 3) {
                                Object obj3 = objArr[2];
                                AbstractC19074t.m100206d(obj3, "null cannot be cast to non-null type kotlin.String");
                                String[] split = TextUtils.split((String) obj3, ";");
                                AbstractC19074t.m100207e(split, "split(...)");
                                m131505m2 = AbstractC25368s.m131505m(Arrays.copyOf(split, split.length));
                                ArrayList arrayList = new ArrayList(m131505m2);
                                while (i12 < arrayList.size()) {
                                    if (TextUtils.equals((CharSequence) arrayList.get(i12), CoreUtility.f89233i)) {
                                        this.f124110E.mo9221n(Boolean.FALSE);
                                        return;
                                    }
                                    i12++;
                                }
                                return;
                            }
                            return;
                        }
                    }
                } else {
                    m134057U();
                    return;
                }
            }
            if (objArr.length >= 3) {
                Object obj4 = objArr[2];
                AbstractC19074t.m100206d(obj4, "null cannot be cast to non-null type kotlin.String");
                String[] split2 = TextUtils.split((String) obj4, ";");
                AbstractC19074t.m100207e(split2, "split(...)");
                m131505m = AbstractC25368s.m131505m(Arrays.copyOf(split2, split2.length));
                ArrayList arrayList2 = new ArrayList(m131505m);
                while (i12 < arrayList2.size()) {
                    if (TextUtils.equals((CharSequence) arrayList2.get(i12), CoreUtility.f89233i)) {
                        m134057U();
                        return;
                    }
                    i12++;
                }
                return;
            }
            m134057U();
        }
    }

    /* renamed from: m0 */
    public final LiveData m134077m0() {
        return this.f124109D;
    }

    /* renamed from: o0 */
    public final void m134078o0() {
        C0815e1.m2075D().m2100V(new C23648e(3, "csc_pinboard_max", 0, "pinboard_done", m134068Y()), false);
        C7904b c7904b = (C7904b) this.f124115t.mo9215f();
        if (c7904b != null) {
            this.f124108C.mo9224q(Boolean.FALSE);
            this.f124109D.mo9224q(Boolean.TRUE);
            if (c7904b.f42729a == 2) {
                m134060X(c7904b);
                return;
            } else {
                m134066s0(c7904b);
                return;
            }
        }
        this.f124110E.mo9224q(Boolean.FALSE);
    }

    /* renamed from: p0 */
    public final void m134079p0() {
        this.f124110E.mo9224q(Boolean.FALSE);
    }

    /* renamed from: q0 */
    public final void m134080q0(C25988b c25988b) {
        AbstractC19074t.m100208f(c25988b, "topicMask");
        this.f124112G = c25988b;
        C7904b m133968u = this.f124117v.m133968u(c25988b);
        if (m133968u != null) {
            String m118436d = AbstractC23089h6.m118436d(m133968u);
            String m118441i = AbstractC23089h6.m118441i(m133968u);
            String m118440h = AbstractC23089h6.m118440h(m133968u, this.f124114s);
            C1761c0 c1761c0 = this.f124107B;
            AbstractC19074t.m100205c(m118441i);
            c1761c0.mo9224q(new b(m118441i, m118440h));
            C0815e1.m2075D().m2100V(new C23648e(3, "csc_pinboard_max", 1, m118436d, m134068Y(), C0815e1.m2075D().m2125z(m134068Y(), m134061Z())), false);
        }
    }

    /* renamed from: r0 */
    public final void m134081r0() {
        String str;
        C25988b c25988b = this.f124112G;
        if (c25988b != null) {
            m134067y0(c25988b);
            C7904b m133968u = this.f124117v.m133968u(c25988b);
            if (m133968u != null) {
                int i11 = m133968u.f42729a;
                if (i11 != 0 && i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 == 5) {
                                str = "pinboard_unpin_album_done";
                            }
                            str = "";
                        } else {
                            str = "pinboard_unpin_poll_done";
                        }
                    } else {
                        str = "pinboard_unpin_msg_done";
                    }
                } else {
                    if (m133968u.f42732d <= 0) {
                        str = "pinboard_unpin_note_done";
                    }
                    str = "";
                }
                C0815e1.m2075D().m2100V(new C23648e(3, "csc_pinboard_max", 0, str, m134068Y(), C0815e1.m2075D().m2125z(m134068Y(), m134061Z())), false);
            }
        }
    }

    /* renamed from: t0 */
    public final void m134082t0(C7904b c7904b) {
        AbstractC19074t.m100208f(c7904b, "pendingPinTopic");
        this.f124115t.mo9221n(c7904b);
    }

    /* renamed from: u0 */
    public final void m134083u0(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f124118w = str;
    }

    /* renamed from: v0 */
    public final LiveData m134084v0() {
        return this.f124107B;
    }

    /* renamed from: w0 */
    public final LiveData m134085w0() {
        return this.f124110E;
    }

    /* renamed from: x0 */
    public final LiveData m134086x0() {
        return this.f124111F;
    }
}
