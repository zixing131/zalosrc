package p495rx;

import ae.C0766k;
import ag0.C0815e1;
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
import java.util.concurrent.atomic.AtomicBoolean;
import me0.AbstractC23089h6;
import me0.AbstractC23136l9;
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

/* renamed from: rx.a */
/* loaded from: classes4.dex */
public final class C25987a extends AbstractC1796t0 {

    /* renamed from: A */
    private final InterfaceC24854k f123978A;

    /* renamed from: B */
    private final InterfaceC24854k f123979B;

    /* renamed from: C */
    private final InterfaceC24854k f123980C;

    /* renamed from: D */
    private String f123981D;

    /* renamed from: E */
    private int f123982E;

    /* renamed from: F */
    private final C1761c0 f123983F;

    /* renamed from: G */
    private final C1761c0 f123984G;

    /* renamed from: H */
    private final C1761c0 f123985H;

    /* renamed from: I */
    private boolean f123986I;

    /* renamed from: J */
    private final C1761c0 f123987J;

    /* renamed from: K */
    private final InterfaceC24854k f123988K;

    /* renamed from: L */
    private final InterfaceC24854k f123989L;

    /* renamed from: s */
    private String f123990s;

    /* renamed from: t */
    private long f123991t;

    /* renamed from: u */
    private ArrayList f123992u;

    /* renamed from: v */
    private C1761c0 f123993v;

    /* renamed from: w */
    private AtomicBoolean f123994w;

    /* renamed from: x */
    private C26000n f123995x;

    /* renamed from: y */
    private String f123996y;

    /* renamed from: z */
    private final InterfaceC24854k f123997z;

    /* renamed from: rx.a$a */
    /* loaded from: classes4.dex */
    static final class a extends AbstractC19075u implements InterfaceC18505l {
        a() {
            super(1);
        }

        /* renamed from: a */
        public final void m133896a(String str) {
            AbstractC19074t.m100208f(str, "actorUid");
            C25987a.this.m133874r0(str);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m133896a((String) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: rx.a$b */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a */
        private String f123999a;

        /* renamed from: b */
        private String f124000b;

        public b(String str, String str2) {
            AbstractC19074t.m100208f(str, "title");
            this.f123999a = str;
            this.f124000b = str2;
        }

        /* renamed from: a */
        public final String m133897a() {
            return this.f124000b;
        }

        /* renamed from: b */
        public final String m133898b() {
            return this.f123999a;
        }
    }

    /* renamed from: rx.a$c */
    /* loaded from: classes4.dex */
    public static final class c implements C1802w0.b {

        /* renamed from: a */
        private final String f124001a;

        public c(String str) {
            AbstractC19074t.m100208f(str, "conversationId");
            this.f124001a = str;
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
            return new C25987a(this.f124001a);
        }
    }

    /* renamed from: rx.a$d */
    /* loaded from: classes4.dex */
    static final class d extends AbstractC19075u implements InterfaceC18494a {
        d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo12V4() {
            if (AbstractC25495a.m132078c(C25987a.this.m133881Z())) {
                return "4";
            }
            if (AbstractC25495a.m132079d(C25987a.this.m133881Z())) {
                return "2";
            }
            return "1";
        }
    }

    /* renamed from: rx.a$e */
    /* loaded from: classes4.dex */
    static final class e extends AbstractC19075u implements InterfaceC18494a {
        e() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo12V4() {
            return AbstractC25495a.m132088m(C25987a.this.m133881Z());
        }
    }

    /* renamed from: rx.a$f */
    /* loaded from: classes4.dex */
    static final class f extends AbstractC19075u implements InterfaceC18494a {
        f() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean mo12V4() {
            C31973j5 m4472f;
            boolean z11 = false;
            if (C25987a.this.m133873j0() && (m4472f = C0943w.f3447a.m4472f(C25987a.this.m133868W())) != null && m4472f.m153747Y()) {
                z11 = true;
            }
            return Boolean.valueOf(z11);
        }
    }

    /* renamed from: rx.a$g */
    /* loaded from: classes4.dex */
    static final class g extends AbstractC19075u implements InterfaceC18494a {
        g() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean mo12V4() {
            return Boolean.valueOf(AbstractC25495a.m132079d(C25987a.this.m133881Z()));
        }
    }

    /* renamed from: rx.a$h */
    /* loaded from: classes4.dex */
    static final class h extends AbstractC19075u implements InterfaceC18505l {
        h() {
            super(1);
        }

        /* renamed from: a */
        public final void m133903a(String str) {
            AbstractC19074t.m100208f(str, "actorUid");
            C25987a.this.m133874r0(str);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m133903a((String) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: rx.a$i */
    /* loaded from: classes4.dex */
    static final class i implements InterfaceC1764d0, InterfaceC19066n {

        /* renamed from: p */
        private final /* synthetic */ InterfaceC18505l f124007p;

        i(InterfaceC18505l interfaceC18505l) {
            AbstractC19074t.m100208f(interfaceC18505l, "function");
            this.f124007p = interfaceC18505l;
        }

        @Override // fn0.InterfaceC19066n
        /* renamed from: c */
        public final InterfaceC24847g mo9368c() {
            return this.f124007p;
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
            this.f124007p.mo205i9(obj);
        }
    }

    /* renamed from: rx.a$j */
    /* loaded from: classes4.dex */
    public static final class j implements InterfaceC20094a {
        j() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "errorMessage");
            C25987a.this.m133882c0().m133960l();
            String m104492d = c20096c.m104492d();
            if (!TextUtils.isEmpty(m104492d)) {
                ToastUtils.showMess(m104492d);
            }
            C25987a.this.f123986I = true;
            C25987a.this.f123983F.mo9221n(Boolean.FALSE);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, C0927o.f3427r);
            C25987a.this.f123984G.mo9221n(Boolean.TRUE);
        }
    }

    /* renamed from: rx.a$k */
    /* loaded from: classes4.dex */
    static final class k extends AbstractC19075u implements InterfaceC18494a {
        k() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo12V4() {
            String m118743r0;
            if (C25987a.this.m133873j0()) {
                if (C25987a.this.m133872i0()) {
                    m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_edit_pin_community_board_subtitle);
                } else {
                    m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_edit_pin_board_subtitle);
                }
            } else {
                m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_edit_pin_board_subtitle_1_1);
            }
            AbstractC19074t.m100205c(m118743r0);
            return m118743r0;
        }
    }

    /* renamed from: rx.a$l */
    /* loaded from: classes4.dex */
    static final class l extends AbstractC19075u implements InterfaceC18494a {
        l() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo12V4() {
            String m118743r0;
            if (C25987a.this.m133873j0()) {
                m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_pinboard_empty);
            } else {
                m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_pinboard_empty_1_1);
            }
            AbstractC19074t.m100205c(m118743r0);
            return m118743r0;
        }
    }

    /* renamed from: rx.a$m */
    /* loaded from: classes4.dex */
    public static final class m implements InterfaceC20094a {

        /* renamed from: b */
        final /* synthetic */ String f124012b;

        /* renamed from: c */
        final /* synthetic */ int f124013c;

        m(String str, int i11) {
            this.f124012b = str;
            this.f124013c = i11;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "errorMessage");
            C25987a.this.m133882c0().m133960l();
            ToastUtils.showMess(c20096c.m104492d());
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, C0927o.f3427r);
            int m133870b0 = C25987a.this.m133870b0(this.f124012b, this.f124013c);
            if (m133870b0 >= 0 && m133870b0 < C25987a.this.m133879X().size()) {
                C25987a.this.m133879X().remove(m133870b0);
                C25987a.this.m133880Y().mo9221n(C25987a.this.m133879X());
            }
            AbstractC19646n0.m103000l2();
        }
    }

    public C25987a(String str) {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        InterfaceC24854k m129210a3;
        InterfaceC24854k m129210a4;
        InterfaceC24854k m129210a5;
        InterfaceC24854k m129210a6;
        AbstractC19074t.m100208f(str, "mConversationId");
        this.f123990s = str;
        this.f123994w = new AtomicBoolean(false);
        this.f123995x = C25994h.f124017a.m133919h(this.f123990s);
        this.f123996y = "0";
        m129210a = AbstractC24856m.m129210a(new d());
        this.f123997z = m129210a;
        m129210a2 = AbstractC24856m.m129210a(new g());
        this.f123978A = m129210a2;
        m129210a3 = AbstractC24856m.m129210a(new e());
        this.f123979B = m129210a3;
        m129210a4 = AbstractC24856m.m129210a(new f());
        this.f123980C = m129210a4;
        this.f123981D = "";
        this.f123982E = -1;
        this.f123983F = new C1761c0();
        this.f123984G = new C1761c0();
        this.f123985H = new C1761c0();
        this.f123987J = new C1761c0();
        m129210a5 = AbstractC24856m.m129210a(new k());
        this.f123988K = m129210a5;
        m129210a6 = AbstractC24856m.m129210a(new l());
        this.f123989L = m129210a6;
        this.f123991t = this.f123995x.m133961m();
        this.f123992u = new ArrayList(this.f123995x.m133964p());
        this.f123993v = new C1761c0(this.f123992u);
        this.f123995x.m133950C().m9220k(new i(new a()));
    }

    /* renamed from: U */
    private final void m133867U() {
        if (!m133871h0()) {
            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_no_permission_to_change_pin_board));
            this.f123984G.mo9221n(Boolean.TRUE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: W */
    public final String m133868W() {
        return (String) this.f123979B.getValue();
    }

    /* renamed from: a0 */
    private final C7904b m133869a0(String str, int i11) {
        int m133870b0 = m133870b0(str, i11);
        if (m133870b0 >= 0 && m133870b0 < this.f123992u.size()) {
            return (C7904b) this.f123992u.get(m133870b0);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b0 */
    public final int m133870b0(String str, int i11) {
        int size = this.f123992u.size();
        for (int i12 = 0; i12 < size; i12++) {
            Object obj = this.f123992u.get(i12);
            AbstractC19074t.m100207e(obj, "get(...)");
            C7904b c7904b = (C7904b) obj;
            if (TextUtils.equals(c7904b.f42715C, str) && c7904b.f42729a == i11) {
                return i12;
            }
        }
        return -1;
    }

    /* renamed from: h0 */
    private final boolean m133871h0() {
        if (m133873j0()) {
            C31973j5 m4472f = C0943w.f3447a.m4472f(m133868W());
            if (m4472f == null) {
                return false;
            }
            if (!m4472f.m153742T() && m4472f.m153763h0()) {
                return false;
            }
        } else if (!AbstractC25495a.m132078c(this.f123990s) && !AbstractC21935u.m114554u(this.f123990s)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i0 */
    public final boolean m133872i0() {
        return ((Boolean) this.f123980C.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j0 */
    public final boolean m133873j0() {
        return ((Boolean) this.f123978A.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r0 */
    public final void m133874r0(String str) {
        if (this.f123994w.get()) {
            this.f123996y = str;
            if (TextUtils.equals(CoreUtility.f89233i, str)) {
                this.f123991t = this.f123995x.m133961m();
                return;
            }
            return;
        }
        m133877x0();
    }

    /* renamed from: t0 */
    private final void m133875t0() {
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new j());
        ArrayList arrayList = new ArrayList();
        int size = this.f123992u.size();
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = this.f123992u.get(i11);
            AbstractC19074t.m100207e(obj, "get(...)");
            C7904b c7904b = (C7904b) obj;
            String str = c7904b.f42715C;
            AbstractC19074t.m100207e(str, "id");
            arrayList.add(new C25988b(str, c7904b.f42729a));
        }
        String str2 = this.f123990s;
        if (AbstractC25495a.m132079d(str2)) {
            c0766k.mo1729r9(m133868W(), this.f123991t, arrayList);
        } else {
            c0766k.mo1663ia(str2, this.f123991t, arrayList);
        }
    }

    /* renamed from: w0 */
    private final void m133876w0(String str, int i11) {
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new m(str, i11));
        String str2 = this.f123990s;
        if (AbstractC25495a.m132079d(str2)) {
            c0766k.mo1551U9(AbstractC25495a.m132088m(str2), str, i11);
        } else {
            c0766k.mo1694n6(str2, this.f123991t, str, i11);
        }
    }

    /* renamed from: x0 */
    private final void m133877x0() {
        this.f123994w.set(false);
        this.f123991t = this.f123995x.m133961m();
        this.f123992u.clear();
        this.f123992u.addAll(this.f123995x.m133964p());
        this.f123993v.mo9221n(this.f123992u);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.AbstractC1796t0
    /* renamed from: J */
    public void mo9130J() {
        super.mo9130J();
        this.f123995x.m133950C().mo9222o(new i(new h()));
    }

    /* renamed from: V */
    public final String m133878V() {
        return (String) this.f123997z.getValue();
    }

    /* renamed from: X */
    public final ArrayList m133879X() {
        return this.f123992u;
    }

    /* renamed from: Y */
    public final C1761c0 m133880Y() {
        return this.f123993v;
    }

    /* renamed from: Z */
    public final String m133881Z() {
        return this.f123990s;
    }

    /* renamed from: c0 */
    public final C26000n m133882c0() {
        return this.f123995x;
    }

    /* renamed from: e0 */
    public final String m133883e0() {
        return (String) this.f123988K.getValue();
    }

    /* renamed from: f0 */
    public final String m133884f0() {
        return (String) this.f123989L.getValue();
    }

    /* renamed from: g0 */
    public final void m133885g0(int i11, Object... objArr) {
        List m131505m;
        List m131505m2;
        AbstractC19074t.m100208f(objArr, "args");
        if (i11 == 27 && m133873j0() && objArr.length >= 2) {
            int i12 = 0;
            Object obj = objArr[0];
            AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type kotlin.String");
            if (!TextUtils.equals((String) obj, m133868W())) {
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
                                        this.f123984G.mo9221n(Boolean.TRUE);
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
                    m133867U();
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
                        m133867U();
                        return;
                    }
                    i12++;
                }
                return;
            }
            m133867U();
        }
    }

    /* renamed from: k0 */
    public final LiveData m133886k0() {
        return this.f123983F;
    }

    /* renamed from: l0 */
    public final void m133887l0(boolean z11) {
        String str;
        if (!this.f123986I) {
            this.f123984G.mo9224q(Boolean.TRUE);
            return;
        }
        if (!AbstractC19074t.m100204b(this.f123996y, "0") && !TextUtils.equals(CoreUtility.f89233i, this.f123996y)) {
            this.f123987J.mo9221n(C24848g0.f119245a);
            return;
        }
        if (z11) {
            str = "csc_pinboard_afterpin";
        } else {
            str = "csc_pinboard_edit";
        }
        C0815e1.m2075D().m2100V(new C23648e(3, str, 0, "pinboard_done", m133878V()), false);
        if (this.f123994w.get()) {
            this.f123986I = false;
            this.f123983F.mo9224q(Boolean.TRUE);
            m133875t0();
        }
    }

    /* renamed from: m0 */
    public final void m133888m0() {
    }

    /* renamed from: n0 */
    public final void m133889n0() {
        m133877x0();
        this.f123986I = false;
        this.f123996y = "0";
    }

    /* renamed from: o0 */
    public final void m133890o0(String str, int i11, boolean z11) {
        String str2;
        AbstractC19074t.m100208f(str, "topicId");
        this.f123981D = str;
        this.f123982E = i11;
        C7904b m133869a0 = m133869a0(str, i11);
        if (m133869a0 != null) {
            String m118436d = AbstractC23089h6.m118436d(m133869a0);
            String m118441i = AbstractC23089h6.m118441i(m133869a0);
            String m118440h = AbstractC23089h6.m118440h(m133869a0, this.f123990s);
            if (z11) {
                str2 = "csc_pinboard_afterpin";
            } else {
                str2 = "csc_pinboard_edit";
            }
            String str3 = str2;
            C1761c0 c1761c0 = this.f123985H;
            AbstractC19074t.m100205c(m118441i);
            c1761c0.mo9224q(new b(m118441i, m118440h));
            C0815e1.m2075D().m2100V(new C23648e(3, str3, 1, m118436d, m133878V(), C0815e1.m2075D().m2125z(m133878V(), m133868W())), false);
        }
    }

    /* renamed from: p0 */
    public final void m133891p0(boolean z11) {
        String str;
        String str2;
        if (!TextUtils.isEmpty(this.f123981D)) {
            m133876w0(this.f123981D, this.f123982E);
            C7904b m133869a0 = m133869a0(this.f123981D, this.f123982E);
            if (m133869a0 != null) {
                int i11 = this.f123982E;
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
                    if (m133869a0.f42732d <= 0) {
                        str = "pinboard_unpin_note_done";
                    }
                    str = "";
                }
                String str3 = str;
                if (z11) {
                    str2 = "csc_pinboard_afterpin";
                } else {
                    str2 = "csc_pinboard_edit";
                }
                C0815e1.m2075D().m2100V(new C23648e(3, str2, 0, str3, m133878V(), C0815e1.m2075D().m2125z(m133878V(), AbstractC25495a.m132088m(this.f123990s))), false);
            }
        }
    }

    /* renamed from: q0 */
    public final void m133892q0(int i11, int i12) {
        this.f123994w.set(true);
        this.f123986I = true;
        Object obj = this.f123992u.get(i11);
        AbstractC19074t.m100207e(obj, "get(...)");
        this.f123992u.remove(i11);
        this.f123992u.add(i12, (C7904b) obj);
    }

    /* renamed from: s0 */
    public final LiveData m133893s0() {
        return this.f123985H;
    }

    /* renamed from: u0 */
    public final LiveData m133894u0() {
        return this.f123984G;
    }

    /* renamed from: v0 */
    public final LiveData m133895v0() {
        return this.f123987J;
    }
}
