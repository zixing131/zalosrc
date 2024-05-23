package p495rx;

import ae.C0766k;
import ag0.C0815e1;
import am.C0927o;
import am.C0943w;
import android.text.TextUtils;
import androidx.lifecycle.AbstractC1796t0;
import androidx.lifecycle.C1761c0;
import androidx.lifecycle.LiveData;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.C7904b;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalocore.CoreUtility;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import gw.AbstractC19646n0;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import me0.AbstractC23089h6;
import me0.AbstractC23136l9;
import p304ks.AbstractC21935u;
import p361nb.C23648e;
import p459qs.C25490c;
import p461qu.AbstractC25495a;
import p716zh.C31973j5;
import p716zh.C31988k5;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import qm0.AbstractC25358n;
import qm0.AbstractC25368s;
import vg.AbstractC28025b8;

/* renamed from: rx.q */
/* loaded from: classes4.dex */
public final class C26003q extends AbstractC1796t0 {

    /* renamed from: A */
    private final InterfaceC24854k f124040A;

    /* renamed from: B */
    private final C1761c0 f124041B;

    /* renamed from: C */
    private final C1761c0 f124042C;

    /* renamed from: D */
    private final C1761c0 f124043D;

    /* renamed from: E */
    private final C1761c0 f124044E;

    /* renamed from: F */
    private final C1761c0 f124045F;

    /* renamed from: G */
    private final C1761c0 f124046G;

    /* renamed from: H */
    private final C1761c0 f124047H;

    /* renamed from: I */
    private final C1761c0 f124048I;

    /* renamed from: J */
    private final C1761c0 f124049J;

    /* renamed from: K */
    private final C1761c0 f124050K;

    /* renamed from: L */
    private final C1761c0 f124051L;

    /* renamed from: M */
    private final C1761c0 f124052M;

    /* renamed from: N */
    private final C1761c0 f124053N;

    /* renamed from: O */
    private final C1761c0 f124054O;

    /* renamed from: P */
    private final C1761c0 f124055P;

    /* renamed from: Q */
    private final C1761c0 f124056Q;

    /* renamed from: R */
    private C7904b f124057R;

    /* renamed from: S */
    private C7904b f124058S;

    /* renamed from: T */
    private final InterfaceC24854k f124059T;

    /* renamed from: s */
    private String f124060s;

    /* renamed from: t */
    private LiveData f124061t;

    /* renamed from: u */
    private LiveData f124062u;

    /* renamed from: v */
    private C26000n f124063v;

    /* renamed from: w */
    private final InterfaceC24854k f124064w;

    /* renamed from: x */
    private C26011y f124065x;

    /* renamed from: y */
    private final InterfaceC24854k f124066y;

    /* renamed from: z */
    private final InterfaceC24854k f124067z;

    /* renamed from: rx.q$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a */
        private String f124068a;

        /* renamed from: b */
        private String f124069b;

        public a(String str, String str2) {
            AbstractC19074t.m100208f(str, "title");
            this.f124068a = str;
            this.f124069b = str2;
        }

        /* renamed from: a */
        public final String m134021a() {
            return this.f124069b;
        }

        /* renamed from: b */
        public final String m134022b() {
            return this.f124068a;
        }
    }

    /* renamed from: rx.q$b */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a */
        private String f124070a;

        /* renamed from: b */
        private long f124071b;

        public b(String str, long j11) {
            AbstractC19074t.m100208f(str, "groupId");
            this.f124070a = str;
            this.f124071b = j11;
        }
    }

    /* renamed from: rx.q$c */
    /* loaded from: classes4.dex */
    public static final class c {

        /* renamed from: a */
        private final String f124072a;

        /* renamed from: b */
        private final String f124073b;

        public c(String str, String str2) {
            AbstractC19074t.m100208f(str, "conversationId");
            AbstractC19074t.m100208f(str2, "sourceStartView");
            this.f124072a = str;
            this.f124073b = str2;
        }

        /* renamed from: a */
        public final String m134023a() {
            return this.f124072a;
        }

        /* renamed from: b */
        public final String m134024b() {
            return this.f124073b;
        }
    }

    /* renamed from: rx.q$d */
    /* loaded from: classes4.dex */
    public static final class d {

        /* renamed from: a */
        private String f124074a;

        /* renamed from: b */
        private String f124075b;

        public d(String str, String str2) {
            AbstractC19074t.m100208f(str, "groupId");
            AbstractC19074t.m100208f(str2, "pollId");
            this.f124074a = str;
            this.f124075b = str2;
        }

        /* renamed from: a */
        public final String m134025a() {
            return this.f124074a;
        }

        /* renamed from: b */
        public final String m134026b() {
            return this.f124075b;
        }
    }

    /* renamed from: rx.q$e */
    /* loaded from: classes4.dex */
    public static final class e {

        /* renamed from: a */
        private String f124076a;

        /* renamed from: b */
        private String f124077b;

        public e(String str, String str2) {
            AbstractC19074t.m100208f(str, "groupId");
            AbstractC19074t.m100208f(str2, "topicId");
            this.f124076a = str;
            this.f124077b = str2;
        }

        /* renamed from: a */
        public final String m134027a() {
            return this.f124076a;
        }

        /* renamed from: b */
        public final String m134028b() {
            return this.f124077b;
        }
    }

    /* renamed from: rx.q$f */
    /* loaded from: classes4.dex */
    public static final class f {

        /* renamed from: a */
        private String f124078a;

        /* renamed from: b */
        private String f124079b;

        public f(String str, String str2) {
            AbstractC19074t.m100208f(str, "groupId");
            AbstractC19074t.m100208f(str2, "boardKey");
            this.f124078a = str;
            this.f124079b = str2;
        }

        /* renamed from: a */
        public final String m134029a() {
            return this.f124079b;
        }

        /* renamed from: b */
        public final String m134030b() {
            return this.f124078a;
        }
    }

    /* renamed from: rx.q$g */
    /* loaded from: classes4.dex */
    public static final class g {

        /* renamed from: a */
        private String f124080a;

        /* renamed from: b */
        private long f124081b;

        public g(String str, long j11) {
            AbstractC19074t.m100208f(str, "tipCat");
            this.f124080a = str;
            this.f124081b = j11;
        }

        /* renamed from: a */
        public final long m134031a() {
            return this.f124081b;
        }

        /* renamed from: b */
        public final String m134032b() {
            return this.f124080a;
        }
    }

    /* renamed from: rx.q$h */
    /* loaded from: classes4.dex */
    static final class h extends AbstractC19075u implements InterfaceC18494a {
        h() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo12V4() {
            if (AbstractC25495a.m132078c(C26003q.this.m133995V())) {
                return "4";
            }
            if (AbstractC25495a.m132079d(C26003q.this.m133995V())) {
                return "2";
            }
            return "1";
        }
    }

    /* renamed from: rx.q$i */
    /* loaded from: classes4.dex */
    static final class i extends AbstractC19075u implements InterfaceC18494a {
        i() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo12V4() {
            return AbstractC25495a.m132088m(C26003q.this.m133995V());
        }
    }

    /* renamed from: rx.q$j */
    /* loaded from: classes4.dex */
    static final class j extends AbstractC19075u implements InterfaceC18494a {
        j() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean mo12V4() {
            C31973j5 m4472f;
            boolean z11 = false;
            if (C26003q.this.m134007j0() && (m4472f = C0943w.f3447a.m4472f(C26003q.this.m133978T())) != null && m4472f.m153747Y()) {
                z11 = true;
            }
            return Boolean.valueOf(z11);
        }
    }

    /* renamed from: rx.q$k */
    /* loaded from: classes4.dex */
    static final class k extends AbstractC19075u implements InterfaceC18494a {
        k() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean mo12V4() {
            return Boolean.valueOf(AbstractC25495a.m132079d(C26003q.this.m133995V()));
        }
    }

    /* renamed from: rx.q$l */
    /* loaded from: classes4.dex */
    static final class l extends AbstractC19075u implements InterfaceC18494a {
        l() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo12V4() {
            String m118743r0;
            if (C26003q.this.m134007j0()) {
                m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_pinboard_empty);
            } else {
                m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_pinboard_empty_1_1);
            }
            AbstractC19074t.m100205c(m118743r0);
            return m118743r0;
        }
    }

    /* renamed from: rx.q$m */
    /* loaded from: classes4.dex */
    public static final class m implements InterfaceC20094a {
        m() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "errorMessage");
            C26003q.this.m134000a0().m133960l();
            ToastUtils.showMess(c20096c.m104492d());
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, C0927o.f3427r);
            AbstractC19646n0.m103000l2();
        }
    }

    public C26003q(String str) {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        InterfaceC24854k m129210a3;
        InterfaceC24854k m129210a4;
        InterfaceC24854k m129210a5;
        AbstractC19074t.m100208f(str, "mConversationId");
        this.f124060s = str;
        this.f124063v = C25994h.f124017a.m133919h(str);
        m129210a = AbstractC24856m.m129210a(new h());
        this.f124064w = m129210a;
        m129210a2 = AbstractC24856m.m129210a(new k());
        this.f124066y = m129210a2;
        m129210a3 = AbstractC24856m.m129210a(new j());
        this.f124067z = m129210a3;
        m129210a4 = AbstractC24856m.m129210a(new i());
        this.f124040A = m129210a4;
        this.f124041B = new C1761c0();
        this.f124042C = new C1761c0();
        this.f124043D = new C1761c0();
        this.f124044E = new C1761c0();
        this.f124045F = new C1761c0();
        this.f124046G = new C1761c0();
        this.f124047H = new C1761c0();
        this.f124048I = new C1761c0();
        this.f124049J = new C1761c0();
        this.f124050K = new C1761c0();
        this.f124051L = new C1761c0();
        this.f124052M = new C1761c0();
        this.f124053N = new C1761c0();
        this.f124054O = new C1761c0();
        this.f124055P = new C1761c0();
        this.f124056Q = new C1761c0();
        m129210a5 = AbstractC24856m.m129210a(new l());
        this.f124059T = m129210a5;
        this.f124062u = this.f124063v.m133965q();
        this.f124063v.m133958T();
        C26011y c26011y = new C26011y(this.f124060s);
        this.f124065x = c26011y;
        this.f124061t = c26011y.m134101c();
    }

    /* renamed from: I0 */
    private final void m133974I0(String str, int i11) {
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new m());
        if (m134007j0()) {
            c0766k.mo1551U9(m133978T(), str, i11);
        } else {
            c0766k.mo1694n6(this.f124060s, this.f124063v.m133961m(), str, i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: T */
    public final String m133978T() {
        return (String) this.f124040A.getValue();
    }

    /* renamed from: h0 */
    private final boolean m133979h0() {
        if (m134007j0()) {
            C31973j5 m4472f = C0943w.f3447a.m4472f(m133978T());
            if (m4472f == null) {
                return false;
            }
            if (!m4472f.m153742T() && m4472f.m153763h0()) {
                return false;
            }
        } else if (!AbstractC25495a.m132078c(this.f124060s) && !AbstractC21935u.m114554u(this.f124060s)) {
            return false;
        }
        return true;
    }

    /* renamed from: q0 */
    private final void m133980q0(final C7904b c7904b) {
        final MessageId messageId;
        if (c7904b != null && (messageId = c7904b.f42747s) != null) {
            AbstractC19646n0.m103042x(new Runnable() { // from class: rx.o
                @Override // java.lang.Runnable
                public final void run() {
                    C26003q.m133981r0(C26003q.this, messageId);
                }
            }, new Runnable() { // from class: rx.p
                @Override // java.lang.Runnable
                public final void run() {
                    C26003q.m133982s0(C26003q.this, c7904b);
                }
            }, messageId, this.f124060s);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r0 */
    public static final void m133981r0(C26003q c26003q, MessageId messageId) {
        AbstractC19074t.m100208f(c26003q, "this$0");
        AbstractC19074t.m100208f(messageId, "$messageId");
        c26003q.f124046G.mo9221n(messageId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s0 */
    public static final void m133982s0(C26003q c26003q, C7904b c7904b) {
        AbstractC19074t.m100208f(c26003q, "this$0");
        if (c26003q.m134007j0() && c7904b.m40779q()) {
            c26003q.f124058S = c7904b;
            c26003q.f124044E.mo9221n(Boolean.TRUE);
        } else {
            c26003q.f124045F.mo9221n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_reply_msg_not_found));
        }
    }

    /* renamed from: A0 */
    public final LiveData m133983A0() {
        return this.f124052M;
    }

    /* renamed from: B0 */
    public final LiveData m133984B0() {
        return this.f124051L;
    }

    /* renamed from: C0 */
    public final LiveData m133985C0() {
        return this.f124050K;
    }

    /* renamed from: D0 */
    public final LiveData m133986D0() {
        return this.f124053N;
    }

    /* renamed from: E0 */
    public final LiveData m133987E0() {
        return this.f124049J;
    }

    /* renamed from: F0 */
    public final LiveData m133988F0() {
        return this.f124054O;
    }

    /* renamed from: G0 */
    public final LiveData m133989G0() {
        return this.f124056Q;
    }

    /* renamed from: P */
    public final void m133990P() {
        this.f124053N.mo9221n(Boolean.valueOf(m133979h0()));
    }

    /* renamed from: Q */
    public final String m133991Q() {
        return (String) this.f124064w.getValue();
    }

    /* renamed from: R */
    public final LiveData m133992R() {
        return this.f124046G;
    }

    /* renamed from: S */
    public final LiveData m133993S() {
        return this.f124048I;
    }

    /* renamed from: U */
    public final LiveData m133994U() {
        return this.f124062u;
    }

    /* renamed from: V */
    public final String m133995V() {
        return this.f124060s;
    }

    /* renamed from: W */
    public final LiveData m133996W() {
        return this.f124043D;
    }

    /* renamed from: X */
    public final LiveData m133997X() {
        return this.f124042C;
    }

    /* renamed from: Y */
    public final LiveData m133998Y() {
        return this.f124041B;
    }

    /* renamed from: Z */
    public final LiveData m133999Z() {
        return this.f124047H;
    }

    /* renamed from: a0 */
    public final C26000n m134000a0() {
        return this.f124063v;
    }

    /* renamed from: b0 */
    public final LiveData m134001b0() {
        return this.f124044E;
    }

    /* renamed from: c0 */
    public final LiveData m134002c0() {
        return this.f124045F;
    }

    /* renamed from: e0 */
    public final String m134003e0() {
        return (String) this.f124059T.getValue();
    }

    /* renamed from: f0 */
    public final LiveData m134004f0() {
        return this.f124061t;
    }

    /* renamed from: g0 */
    public final void m134005g0(int i11, Object... objArr) {
        List m131505m;
        List m131505m2;
        boolean m131390w;
        AbstractC19074t.m100208f(objArr, "args");
        int i12 = 0;
        if (i11 != 27) {
            if (i11 != 44) {
                if (i11 == 3050) {
                    this.f124065x.m134102d();
                    return;
                }
                return;
            }
            Object obj = objArr[0];
            AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj;
            if (!TextUtils.isEmpty(str)) {
                str = AbstractC28025b8.m141455k(str);
                AbstractC19074t.m100207e(str, "getOriginTipCat(...)");
            }
            String[] strArr = AbstractC28025b8.f130834K;
            AbstractC19074t.m100207e(strArr, "ARR_PIN_BOARD_TIPS");
            m131390w = AbstractC25358n.m131390w(strArr, str);
            if (m131390w) {
                this.f124056Q.mo9221n(new g(str, 200L));
                return;
            }
            return;
        }
        if (objArr.length >= 2) {
            Object obj2 = objArr[0];
            AbstractC19074t.m100206d(obj2, "null cannot be cast to non-null type kotlin.String");
            if (!TextUtils.equals((String) obj2, m133978T())) {
                return;
            }
            Object obj3 = objArr[1];
            AbstractC19074t.m100206d(obj3, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) obj3).intValue();
            if (intValue != 1 && intValue != 2) {
                if (intValue != 4) {
                    if (intValue != 5) {
                        if (intValue != 9) {
                            if (intValue != 11) {
                                return;
                            }
                        } else {
                            m133990P();
                            return;
                        }
                    }
                } else {
                    if (objArr.length >= 3) {
                        Object obj4 = objArr[2];
                        AbstractC19074t.m100206d(obj4, "null cannot be cast to non-null type kotlin.String");
                        String[] split = TextUtils.split((String) obj4, ";");
                        AbstractC19074t.m100207e(split, "split(...)");
                        m131505m2 = AbstractC25368s.m131505m(Arrays.copyOf(split, split.length));
                        ArrayList arrayList = new ArrayList(m131505m2);
                        while (i12 < arrayList.size()) {
                            if (TextUtils.equals((CharSequence) arrayList.get(i12), CoreUtility.f89233i)) {
                                this.f124048I.mo9221n(Boolean.TRUE);
                                return;
                            }
                            i12++;
                        }
                        return;
                    }
                    return;
                }
            }
            if (objArr.length >= 3) {
                Object obj5 = objArr[2];
                AbstractC19074t.m100206d(obj5, "null cannot be cast to non-null type kotlin.String");
                String[] split2 = TextUtils.split((String) obj5, ";");
                AbstractC19074t.m100207e(split2, "split(...)");
                m131505m = AbstractC25368s.m131505m(Arrays.copyOf(split2, split2.length));
                ArrayList arrayList2 = new ArrayList(m131505m);
                while (i12 < arrayList2.size()) {
                    if (TextUtils.equals((CharSequence) arrayList2.get(i12), CoreUtility.f89233i)) {
                        m133990P();
                        return;
                    }
                    i12++;
                }
                return;
            }
            m133990P();
        }
    }

    /* renamed from: i0 */
    public final boolean m134006i0() {
        return ((Boolean) this.f124067z.getValue()).booleanValue();
    }

    /* renamed from: j0 */
    public final boolean m134007j0() {
        return ((Boolean) this.f124066y.getValue()).booleanValue();
    }

    /* renamed from: k0 */
    public final void m134008k0() {
        this.f124057R = null;
    }

    /* renamed from: l0 */
    public final void m134009l0() {
        if (m133979h0()) {
            this.f124043D.mo9224q(new c(this.f124060s, "csc_pinboard_item_menu"));
            this.f124057R = null;
        } else {
            this.f124045F.mo9221n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_not_perform_action));
        }
    }

    /* renamed from: m0 */
    public final void m134010m0() {
        if (m133979h0()) {
            C7904b c7904b = this.f124057R;
            if (c7904b == null || TextUtils.isEmpty(c7904b.f42715C)) {
                return;
            }
            String m118436d = AbstractC23089h6.m118436d(c7904b);
            String m118441i = AbstractC23089h6.m118441i(c7904b);
            String m118440h = AbstractC23089h6.m118440h(c7904b, this.f124060s);
            C1761c0 c1761c0 = this.f124049J;
            AbstractC19074t.m100205c(m118441i);
            c1761c0.mo9224q(new a(m118441i, m118440h));
            C0815e1.m2075D().m2100V(new C23648e(3, "csc_pinboard_item_menu", 1, m118436d, m133991Q(), C0815e1.m2075D().m2125z(m133991Q(), m133978T())), false);
            return;
        }
        this.f124045F.mo9221n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_not_perform_action));
    }

    /* renamed from: n0 */
    public final void m134011n0() {
        this.f124043D.mo9224q(new c(this.f124060s, "csc_pinboard_full"));
    }

    /* renamed from: o0 */
    public final void m134012o0() {
        if (m134007j0()) {
            this.f124041B.mo9224q(m133978T());
        }
    }

    /* renamed from: p0 */
    public final void m134013p0() {
        if (m134007j0()) {
            this.f124042C.mo9224q(m133978T());
        }
    }

    /* renamed from: t0 */
    public final void m134014t0(C7904b c7904b) {
        String str;
        if (c7904b == null) {
            return;
        }
        int i11 = c7904b.f42729a;
        if (i11 != 0 && i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 != 5) {
                            this.f124045F.mo9221n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_unsupported_pin_message));
                            return;
                        } else {
                            if (m134007j0()) {
                                this.f124055P.mo9224q(new b(m133978T(), c7904b.f42714B));
                                return;
                            }
                            return;
                        }
                    }
                    C7904b.a aVar = c7904b.f42724L;
                    if (aVar != null && (str = aVar.f42756b) != null) {
                        this.f124052M.mo9221n(str);
                        return;
                    }
                    return;
                }
                if (m134007j0()) {
                    C1761c0 c1761c0 = this.f124051L;
                    String m133978T = m133978T();
                    String str2 = c7904b.f42722J;
                    AbstractC19074t.m100207e(str2, "pollId");
                    c1761c0.mo9224q(new d(m133978T, str2));
                    return;
                }
                return;
            }
            m133980q0(c7904b);
            return;
        }
        if (m134007j0()) {
            C1761c0 c1761c02 = this.f124050K;
            String m133978T2 = m133978T();
            String str3 = c7904b.f42715C;
            AbstractC19074t.m100207e(str3, "id");
            c1761c02.mo9224q(new e(m133978T2, str3));
        }
    }

    /* renamed from: u0 */
    public final void m134015u0(String str) {
        AbstractC19074t.m100208f(str, "eventId");
        this.f124052M.mo9224q(str);
    }

    /* renamed from: v0 */
    public final void m134016v0() {
        C7904b c7904b = this.f124058S;
        if (c7904b == null || !c7904b.m40779q()) {
            return;
        }
        C31988k5 m132059e = C25490c.m132054j().m132059e(c7904b);
        C1761c0 c1761c0 = this.f124047H;
        String m133978T = m133978T();
        String m154218b = m132059e.m154218b();
        AbstractC19074t.m100207e(m154218b, "getKey(...)");
        c1761c0.mo9221n(new f(m133978T, m154218b));
    }

    /* renamed from: w0 */
    public final void m134017w0() {
        String str;
        C7904b c7904b = this.f124057R;
        if (c7904b != null) {
            String str2 = c7904b.f42715C;
            AbstractC19074t.m100207e(str2, "id");
            m133974I0(str2, c7904b.f42729a);
            int i11 = c7904b.f42729a;
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
                if (c7904b.f42732d <= 0) {
                    str = "pinboard_unpin_note_done";
                }
                str = "";
            }
            C0815e1.m2075D().m2100V(new C23648e(3, "csc_pinboard_item_menu", 0, str, m133991Q(), C0815e1.m2075D().m2125z(m133991Q(), m133978T())), false);
            this.f124057R = null;
        }
    }

    /* renamed from: x0 */
    public final void m134018x0(C7904b c7904b) {
        this.f124057R = c7904b;
        this.f124054O.mo9221n(Boolean.TRUE);
    }

    /* renamed from: y0 */
    public final void m134019y0(long j11) {
        this.f124063v.m133954N(j11, true);
    }

    /* renamed from: z0 */
    public final LiveData m134020z0() {
        return this.f124055P;
    }
}
