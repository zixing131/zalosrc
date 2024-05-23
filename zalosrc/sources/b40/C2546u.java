package b40;

import ag0.AbstractC0837p0;
import ag0.C0815e1;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.p062db.C7956b;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import dj.C17945a0;
import dj.C17964g1;
import dj.C17969i0;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import ho0.AbstractC20110a;
import java.util.LinkedHashSet;
import java.util.Set;
import ln0.AbstractC22543l;
import org.json.JSONObject;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p361nb.C23648e;
import pm0.C24848g0;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* renamed from: b40.u */
/* loaded from: classes5.dex */
public final class C2546u {

    /* renamed from: b */
    private static MessageId f10364b;

    /* renamed from: c */
    private static a f10365c;

    /* renamed from: d */
    private static int f10366d;

    /* renamed from: a */
    public static final C2546u f10363a = new C2546u();

    /* renamed from: e */
    private static final Set f10367e = new LinkedHashSet();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: b40.u$a */
    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: p */
        public static final a f10368p = new a("SPEAKER", 0);

        /* renamed from: q */
        public static final a f10369q = new a("HYBRID", 1);

        /* renamed from: r */
        public static final a f10370r = new a("IN_EAR", 2);

        /* renamed from: s */
        private static final /* synthetic */ a[] f10371s;

        /* renamed from: t */
        private static final /* synthetic */ InterfaceC30165a f10372t;

        static {
            a[] m12832b = m12832b();
            f10371s = m12832b;
            f10372t = AbstractC30166b.m148796a(m12832b);
        }

        private a(String str, int i11) {
        }

        /* renamed from: b */
        private static final /* synthetic */ a[] m12832b() {
            return new a[]{f10368p, f10369q, f10370r};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f10371s.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: b40.u$b */
    /* loaded from: classes5.dex */
    public static final class b {

        /* renamed from: p */
        public static final b f10373p = new b("COMPLETE", 0);

        /* renamed from: q */
        public static final b f10374q = new b("MANUAL", 1);

        /* renamed from: r */
        public static final b f10375r = new b("INTERRUPT", 2);

        /* renamed from: s */
        private static final /* synthetic */ b[] f10376s;

        /* renamed from: t */
        private static final /* synthetic */ InterfaceC30165a f10377t;

        static {
            b[] m12833b = m12833b();
            f10376s = m12833b;
            f10377t = AbstractC30166b.m148796a(m12833b);
        }

        private b(String str, int i11) {
        }

        /* renamed from: b */
        private static final /* synthetic */ b[] m12833b() {
            return new b[]{f10373p, f10374q, f10375r};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f10376s.clone();
        }
    }

    /* renamed from: b40.u$c */
    /* loaded from: classes5.dex */
    public /* synthetic */ class c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f10378a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.f10368p.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f10378a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b40.u$d */
    /* loaded from: classes5.dex */
    public static final class d extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ C17945a0 f10379q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(C17945a0 c17945a0) {
            super(0);
            this.f10379q = c17945a0;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m12834a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m12834a() {
            C0815e1.m2075D().m2100V(new C23648e(16, "csc", 0, "voice_bubble_forward", C2546u.f10363a.m12814d(this.f10379q)), false);
        }
    }

    /* renamed from: b40.u$e */
    /* loaded from: classes5.dex */
    static final class e extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ C17945a0 f10380q;

        /* renamed from: r */
        final /* synthetic */ int f10381r;

        /* renamed from: s */
        final /* synthetic */ boolean f10382s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(C17945a0 c17945a0, int i11, boolean z11) {
            super(0);
            this.f10380q = c17945a0;
            this.f10381r = i11;
            this.f10382s = z11;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m12835a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m12835a() {
            JSONObject jSONObject = new JSONObject();
            int i11 = this.f10381r;
            boolean z11 = this.f10382s;
            jSONObject.put("count", i11);
            jSONObject.put("autoplay", z11);
            C0815e1.m2075D().m2100V(new C23648e(16, "csc", 0, "voice_bubble_play", C2546u.f10363a.m12814d(this.f10380q), jSONObject.toString()), false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b40.u$f */
    /* loaded from: classes5.dex */
    public static final class f extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ C17945a0 f10383q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(C17945a0 c17945a0) {
            super(0);
            this.f10383q = c17945a0;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m12836a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m12836a() {
            C0815e1.m2075D().m2100V(new C23648e(16, "csc", 0, "voice_bubble_react", C2546u.f10363a.m12814d(this.f10383q)), false);
        }
    }

    /* renamed from: b40.u$g */
    /* loaded from: classes5.dex */
    static final class g extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ C17945a0 f10384q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(C17945a0 c17945a0) {
            super(0);
            this.f10384q = c17945a0;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m12837a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m12837a() {
            C0815e1.m2075D().m2100V(new C23648e(16, "csc", 1, "voice_bubble_seen", C2546u.f10363a.m12814d(this.f10384q)), false);
        }
    }

    /* renamed from: b40.u$h */
    /* loaded from: classes5.dex */
    static final class h extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ C17945a0 f10385q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(C17945a0 c17945a0) {
            super(0);
            this.f10385q = c17945a0;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m12838a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m12838a() {
            C0815e1.m2075D().m2100V(new C23648e(16, "csc", 1, "voice_bubble_reply", C2546u.f10363a.m12814d(this.f10385q)), false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b40.u$i */
    /* loaded from: classes5.dex */
    public static final class i extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ C17945a0 f10386q;

        /* renamed from: r */
        final /* synthetic */ b f10387r;

        /* renamed from: s */
        final /* synthetic */ int f10388s;

        /* renamed from: t */
        final /* synthetic */ int f10389t;

        /* renamed from: u */
        final /* synthetic */ a f10390u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(C17945a0 c17945a0, b bVar, int i11, int i12, a aVar) {
            super(0);
            this.f10386q = c17945a0;
            this.f10387r = bVar;
            this.f10388s = i11;
            this.f10389t = i12;
            this.f10390u = aVar;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m12839a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m12839a() {
            JSONObject jSONObject = new JSONObject();
            b bVar = this.f10387r;
            int i11 = this.f10388s;
            int i12 = this.f10389t;
            a aVar = this.f10390u;
            jSONObject.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, bVar.ordinal());
            jSONObject.put("duration", i11);
            if (bVar != b.f10373p) {
                i11 = AbstractC22543l.m116588k((i12 * i11) / 100, 0, i11);
            }
            jSONObject.put("playedamount", i11);
            jSONObject.put("in-ear", aVar.ordinal());
            C0815e1.m2075D().m2100V(new C23648e(16, "csc", 0, "voice_bubble_stop", C2546u.f10363a.m12814d(this.f10386q), jSONObject.toString()), false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b40.u$j */
    /* loaded from: classes5.dex */
    public static final class j extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ String f10391q;

        /* renamed from: r */
        final /* synthetic */ int f10392r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(String str, int i11) {
            super(0);
            this.f10391q = str;
            this.f10392r = i11;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m12840a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m12840a() {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("count", this.f10392r);
            C0815e1.m2075D().m2100V(new C23648e(16, "csc", 1, "voice_multi_listen", C2546u.f10363a.m12815e(this.f10391q), jSONObject.toString()), false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b40.u$k */
    /* loaded from: classes5.dex */
    public static final class k extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ C17945a0 f10393q;

        /* renamed from: r */
        final /* synthetic */ boolean f10394r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(C17945a0 c17945a0, boolean z11) {
            super(0);
            this.f10393q = c17945a0;
            this.f10394r = z11;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m12841a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m12841a() {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, this.f10394r ? 1 : 0);
            C0815e1.m2075D().m2100V(new C23648e(16, "csc", 0, "voice_in_ear_select", C2546u.f10363a.m12814d(this.f10393q), jSONObject.toString()), false);
        }
    }

    private C2546u() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public final String m12814d(C17945a0 c17945a0) {
        String mo95039W2 = c17945a0.mo95039W2();
        AbstractC19074t.m100207e(mo95039W2, "getOwnerId(...)");
        return m12815e(mo95039W2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public final String m12815e(String str) {
        return C2526d.f10270a.m12735z(str);
    }

    /* renamed from: f */
    private final C17945a0 m12816f(MessageId messageId) {
        return AbstractC23306f.m120584H0().m2635r(messageId);
    }

    /* renamed from: r */
    private final void m12817r(final InterfaceC18494a interfaceC18494a) {
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: b40.t
            @Override // java.lang.Runnable
            public final void run() {
                C2546u.m12818s(InterfaceC18494a.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public static final void m12818s(InterfaceC18494a interfaceC18494a) {
        AbstractC19074t.m100208f(interfaceC18494a, "$block");
        try {
            interfaceC18494a.mo12V4();
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: u */
    private final void m12819u(C17945a0 c17945a0) {
        C7956b.Companion.m41573b().m41564w0(c17945a0);
    }

    /* renamed from: g */
    public final void m12820g(C17945a0 c17945a0) {
        C17964g1 c17964g1;
        if (c17945a0 != null && !c17945a0.m95032V6()) {
            C17969i0 m94929K2 = c17945a0.m94929K2();
            Boolean bool = null;
            if (m94929K2 instanceof C17964g1) {
                c17964g1 = (C17964g1) m94929K2;
            } else {
                c17964g1 = null;
            }
            if (c17964g1 == null) {
                return;
            }
            Boolean valueOf = Boolean.valueOf(c17964g1.m95539q());
            if (!valueOf.booleanValue()) {
                bool = valueOf;
            }
            if (bool != null) {
                bool.booleanValue();
                c17964g1.m95546z(true);
                m12819u(c17945a0);
                m12817r(new d(c17945a0));
            }
        }
    }

    /* renamed from: h */
    public final void m12821h(C17945a0 c17945a0, boolean z11) {
        a aVar;
        C17964g1 c17964g1;
        if (c17945a0 != null && !AbstractC19074t.m100204b(c17945a0.m95029V3(), f10364b)) {
            Set set = f10367e;
            MessageId m95029V3 = c17945a0.m95029V3();
            AbstractC19074t.m100207e(m95029V3, "getMessageId(...)");
            set.add(m95029V3);
            f10364b = c17945a0.m95029V3();
            if (c17945a0.m95032V6()) {
                return;
            }
            if (AbstractC23309i.m121977hc()) {
                aVar = a.f10368p;
            } else {
                aVar = a.f10370r;
            }
            f10365c = aVar;
            f10366d = 0;
            C17969i0 m94929K2 = c17945a0.m94929K2();
            if (m94929K2 instanceof C17964g1) {
                c17964g1 = (C17964g1) m94929K2;
            } else {
                c17964g1 = null;
            }
            if (c17964g1 == null) {
                return;
            }
            c17964g1.m95523D(c17964g1.m95535m() + 1);
            m12819u(c17945a0);
            m12817r(new e(c17945a0, c17964g1.m95535m(), z11));
        }
    }

    /* renamed from: i */
    public final void m12822i(C17945a0 c17945a0) {
        C17964g1 c17964g1;
        if (c17945a0 != null && !c17945a0.m95032V6()) {
            C17969i0 m94929K2 = c17945a0.m94929K2();
            Boolean bool = null;
            if (m94929K2 instanceof C17964g1) {
                c17964g1 = (C17964g1) m94929K2;
            } else {
                c17964g1 = null;
            }
            if (c17964g1 == null) {
                return;
            }
            Boolean valueOf = Boolean.valueOf(c17964g1.m95541s());
            if (!valueOf.booleanValue()) {
                bool = valueOf;
            }
            if (bool != null) {
                bool.booleanValue();
                c17964g1.m95525F(true);
                m12819u(c17945a0);
                m12817r(new f(c17945a0));
            }
        }
    }

    /* renamed from: j */
    public final void m12823j(C17945a0 c17945a0) {
        C17964g1 c17964g1;
        if (c17945a0 != null && !c17945a0.m95032V6()) {
            C17969i0 m94929K2 = c17945a0.m94929K2();
            Boolean bool = null;
            if (m94929K2 instanceof C17964g1) {
                c17964g1 = (C17964g1) m94929K2;
            } else {
                c17964g1 = null;
            }
            if (c17964g1 == null) {
                return;
            }
            Boolean valueOf = Boolean.valueOf(c17964g1.m95543u());
            if (!valueOf.booleanValue()) {
                bool = valueOf;
            }
            if (bool != null) {
                bool.booleanValue();
                c17964g1.m95527H(true);
                m12819u(c17945a0);
                m12817r(new g(c17945a0));
            }
        }
    }

    /* renamed from: k */
    public final void m12824k(MessageId messageId) {
        C17964g1 c17964g1;
        AbstractC19074t.m100208f(messageId, "msgId");
        C17945a0 m12816f = m12816f(messageId);
        if (m12816f != null && !m12816f.m95032V6()) {
            C17969i0 m94929K2 = m12816f.m94929K2();
            Boolean bool = null;
            if (m94929K2 instanceof C17964g1) {
                c17964g1 = (C17964g1) m94929K2;
            } else {
                c17964g1 = null;
            }
            if (c17964g1 == null) {
                return;
            }
            Boolean valueOf = Boolean.valueOf(c17964g1.m95542t());
            if (!valueOf.booleanValue()) {
                bool = valueOf;
            }
            if (bool != null) {
                bool.booleanValue();
                c17964g1.m95526G(true);
                m12819u(m12816f);
                m12817r(new h(m12816f));
            }
        }
    }

    /* renamed from: l */
    public final void m12825l(MessageId messageId, b bVar) {
        AbstractC19074t.m100208f(bVar, ZinstantMetaConstant.IMPRESSION_META_TYPE);
        if (messageId == null) {
            return;
        }
        m12826m(m12816f(messageId), bVar);
    }

    /* renamed from: m */
    public final void m12826m(C17945a0 c17945a0, b bVar) {
        C17964g1 c17964g1;
        AbstractC19074t.m100208f(bVar, ZinstantMetaConstant.IMPRESSION_META_TYPE);
        if (f10364b == null) {
            return;
        }
        Integer num = null;
        f10364b = null;
        if (c17945a0 != null && !c17945a0.m95032V6()) {
            int i11 = f10366d;
            a aVar = f10365c;
            f10366d = 0;
            f10365c = null;
            if (aVar == null) {
                return;
            }
            C17969i0 m94929K2 = c17945a0.m94929K2();
            if (m94929K2 instanceof C17964g1) {
                c17964g1 = (C17964g1) m94929K2;
            } else {
                c17964g1 = null;
            }
            if (c17964g1 != null) {
                Integer valueOf = Integer.valueOf(c17964g1.m95530g());
                if (valueOf.intValue() > 0) {
                    num = valueOf;
                }
                if (num != null) {
                    m12817r(new i(c17945a0, bVar, num.intValue(), i11, aVar));
                }
            }
        }
    }

    /* renamed from: n */
    public final void m12827n(String str) {
        AbstractC19074t.m100208f(str, "ownerId");
        Set set = f10367e;
        int size = set.size();
        if (size <= 1) {
            return;
        }
        m12817r(new j(str, size));
        set.clear();
    }

    /* renamed from: o */
    public final void m12828o(C17945a0 c17945a0, boolean z11) {
        if (c17945a0 == null) {
            return;
        }
        m12817r(new k(c17945a0, z11));
    }

    /* renamed from: p */
    public final void m12829p() {
        a aVar = f10365c;
        if (aVar != null && c.f10378a[aVar.ordinal()] == 1) {
            aVar = a.f10369q;
        }
        f10365c = aVar;
    }

    /* renamed from: q */
    public final void m12830q() {
        f10367e.clear();
    }

    /* renamed from: t */
    public final void m12831t(int i11) {
        f10366d = Math.max(i11, f10366d);
    }
}
