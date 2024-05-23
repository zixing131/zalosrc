package p019aj;

import bj.C2821e;
import bj.InterfaceC2820d;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.data.chat.model.tabmessage.Conversation;
import com.zing.zalo.data.entity.chat.message.MessageId;
import dh0.C17933b;
import dj.C17945a0;
import eg0.AbstractC18428c;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fj.C18959b0;
import fj.InterfaceC18981x;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import hm0.InterfaceC20094a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import mg.C23288a;
import mm0.AbstractC23350e;
import nl.C23870a;
import p056cj.C3533a;
import p056cj.C3535c;
import p241ij.C20568e;
import p348mi.AbstractC23306f;
import p363nh.C23744a;
import p392oh.C24261h;
import p392oh.C24265l;
import p405ov.C24559a;
import p461qu.AbstractC25495a;
import p511sw.C26398g;
import p511sw.InterfaceC26392a;
import p511sw.InterfaceC26395d;
import p511sw.InterfaceC26397f;
import p620wt.AbstractC29233h;
import p620wt.InterfaceC29232g;
import pm0.AbstractC24856m;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import qm0.AbstractC25368s;
import qm0.AbstractC25378x;
import tj.AbstractC26714f;
import tj.C26710b;
import tj.C26711c;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: aj.j */
/* loaded from: classes.dex */
public final class C0876j {
    public static final b Companion = new b(null);

    /* renamed from: j */
    private static final InterfaceC24854k f3225j;

    /* renamed from: a */
    private final InterfaceC2820d f3226a;

    /* renamed from: b */
    private final InterfaceC18981x f3227b;

    /* renamed from: c */
    private final InterfaceC29232g f3228c;

    /* renamed from: d */
    private final Map f3229d;

    /* renamed from: e */
    private final InterfaceC29232g f3230e;

    /* renamed from: f */
    private final Map f3231f;

    /* renamed from: g */
    private final Map f3232g;

    /* renamed from: h */
    private final Map f3233h;

    /* renamed from: i */
    private final InterfaceC26395d f3234i;

    /* renamed from: aj.j$a */
    /* loaded from: classes.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f3235q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C0876j mo12V4() {
            return c.f3236a.m2645a();
        }
    }

    /* renamed from: aj.j$b */
    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C0876j m2644a() {
            return (C0876j) C0876j.f3225j.getValue();
        }
    }

    /* renamed from: aj.j$c */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a */
        public static final c f3236a = new c();

        /* renamed from: b */
        private static final C0876j f3237b = new C0876j(new C2821e(), new C18959b0());

        private c() {
        }

        /* renamed from: a */
        public final C0876j m2645a() {
            return f3237b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: aj.j$d */
    /* loaded from: classes.dex */
    public static final class d extends AbstractC19075u implements InterfaceC18494a {
        d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final Map mo12V4() {
            return Collections.synchronizedMap(C0876j.this.f3226a.mo13628h(2200));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: aj.j$e */
    /* loaded from: classes3.dex */
    public static final class e extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ String f3239q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str) {
            super(1);
            this.f3239q = str;
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a */
        public final Boolean mo205i9(C26710b c26710b) {
            AbstractC19074t.m100208f(c26710b, "it");
            return Boolean.valueOf(AbstractC19074t.m100204b(c26710b.m137329d(), this.f3239q));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: aj.j$f */
    /* loaded from: classes3.dex */
    public static final class f extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final f f3240q = new f();

        f() {
            super(1);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a */
        public final Boolean mo205i9(C26710b c26710b) {
            AbstractC19074t.m100208f(c26710b, "it");
            return Boolean.valueOf(AbstractC25495a.m132079d(c26710b.m137329d()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: aj.j$g */
    /* loaded from: classes3.dex */
    public static final class g extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ ArrayList f3242r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(ArrayList arrayList) {
            super(1);
            this.f3242r = arrayList;
        }

        /* renamed from: a */
        public final void m2649a(C17945a0 c17945a0) {
            AbstractC19074t.m100208f(c17945a0, "it");
            if (C24265l.Companion.m126709b().m126699o().m128549g() || (c17945a0.m94877E3() && C0876j.this.m2594L().m126650x(c17945a0.m95029V3()) == null)) {
                this.f3242r.add(c17945a0);
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m2649a((C17945a0) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: aj.j$h */
    /* loaded from: classes3.dex */
    public static final class h extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ ArrayList f3244r;

        /* renamed from: s */
        final /* synthetic */ String f3245s;

        /* renamed from: t */
        final /* synthetic */ ArrayList f3246t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(ArrayList arrayList, String str, ArrayList arrayList2) {
            super(1);
            this.f3244r = arrayList;
            this.f3245s = str;
            this.f3246t = arrayList2;
        }

        /* renamed from: a */
        public final void m2650a(C17945a0 c17945a0) {
            AbstractC19074t.m100208f(c17945a0, "it");
            if (C24265l.Companion.m126709b().m126699o().m128549g() || (c17945a0.m94877E3() && C0876j.this.m2594L().m126650x(c17945a0.m95029V3()) == null)) {
                this.f3244r.add(c17945a0);
            }
            if (c17945a0.m95063Y5() && AbstractC23306f.m120655d2().m112074f(this.f3245s)) {
                this.f3246t.add(c17945a0.m95029V3());
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m2650a((C17945a0) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: aj.j$i */
    /* loaded from: classes3.dex */
    public static final class i extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f3247t;

        /* renamed from: u */
        final /* synthetic */ String f3248u;

        /* renamed from: v */
        final /* synthetic */ ArrayList f3249v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(String str, ArrayList arrayList, Continuation continuation) {
            super(2, continuation);
            this.f3248u = str;
            this.f3249v = arrayList;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new i(this.f3248u, this.f3249v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f3247t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C23870a m120679j2 = AbstractC23306f.m120679j2();
                String str = this.f3248u;
                ArrayList arrayList = this.f3249v;
                this.f3247t = 1;
                if (m120679j2.m124796X(str, arrayList, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((i) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: aj.j$j */
    /* loaded from: classes3.dex */
    public static final class j extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ ArrayList f3251r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(ArrayList arrayList) {
            super(1);
            this.f3251r = arrayList;
        }

        /* renamed from: a */
        public final void m2652a(C17945a0 c17945a0) {
            AbstractC19074t.m100208f(c17945a0, "it");
            if (C24265l.Companion.m126709b().m126699o().m128549g() || (c17945a0.m94877E3() && C0876j.this.m2594L().m126650x(c17945a0.m95029V3()) == null)) {
                this.f3251r.add(c17945a0);
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m2652a((C17945a0) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: aj.j$k */
    /* loaded from: classes3.dex */
    public static final class k extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ ArrayList f3253r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(ArrayList arrayList) {
            super(1);
            this.f3253r = arrayList;
        }

        /* renamed from: a */
        public final void m2653a(C17945a0 c17945a0) {
            AbstractC19074t.m100208f(c17945a0, "it");
            if (C24265l.Companion.m126709b().m126699o().m128549g() || (c17945a0.m94877E3() && C0876j.this.m2594L().m126650x(c17945a0.m95029V3()) == null)) {
                this.f3253r.add(c17945a0);
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m2653a((C17945a0) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: aj.j$l */
    /* loaded from: classes.dex */
    public static final class l implements InterfaceC26397f {
        l() {
        }

        @Override // p511sw.InterfaceC26397f
        /* renamed from: a */
        public int mo2654a(String str) {
            AbstractC19074t.m100208f(str, "id");
            return (int) C0876j.this.f3226a.mo13635o(str);
        }

        @Override // p511sw.InterfaceC26397f
        /* renamed from: b */
        public List mo2655b(String str, int i11, int i12) {
            AbstractC19074t.m100208f(str, "id");
            ArrayList arrayList = new ArrayList();
            Iterator it = C0876j.this.f3226a.mo13622b(str, i11, i12).iterator();
            while (it.hasNext()) {
                arrayList.add(C0877k.f3256a.m2660a((C17945a0) it.next()));
            }
            C24559a.m127933c("MessageRepository", "loadMessagesDescending(" + str + ", " + i11 + ", " + i12 + "): Loaded " + arrayList.size() + " msg(s)");
            return arrayList;
        }

        @Override // p511sw.InterfaceC26397f
        /* renamed from: c */
        public int mo2656c(InterfaceC26392a interfaceC26392a) {
            AbstractC19074t.m100208f(interfaceC26392a, "item");
            return (int) C0876j.this.f3226a.mo13625e(interfaceC26392a);
        }

        @Override // p511sw.InterfaceC26397f
        /* renamed from: d */
        public int mo2657d(InterfaceC26392a interfaceC26392a) {
            AbstractC19074t.m100208f(interfaceC26392a, "item");
            return (int) C0876j.this.f3226a.mo13636p(interfaceC26392a);
        }

        @Override // p511sw.InterfaceC26397f
        /* renamed from: e */
        public List mo2658e(String str, int i11, int i12) {
            AbstractC19074t.m100208f(str, "id");
            ArrayList arrayList = new ArrayList();
            Iterator it = C0876j.this.f3226a.mo13624d(str, i11, i12).iterator();
            while (it.hasNext()) {
                arrayList.add(C0877k.f3256a.m2660a((C17945a0) it.next()));
            }
            C24559a.m127933c("MessageRepository", "loadMessages(" + str + ", " + i11 + ", " + i12 + "): Loaded " + arrayList.size() + " msg(s)");
            return arrayList;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: aj.j$m */
    /* loaded from: classes.dex */
    public static final class m extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final m f3255q = new m();

        m() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C24261h mo12V4() {
            return AbstractC23306f.m120654d1();
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(a.f3235q);
        f3225j = m129210a;
    }

    public C0876j(InterfaceC2820d interfaceC2820d, InterfaceC18981x interfaceC18981x) {
        AbstractC19074t.m100208f(interfaceC2820d, "localDataSource");
        AbstractC19074t.m100208f(interfaceC18981x, "apiHelper");
        this.f3226a = interfaceC2820d;
        this.f3227b = interfaceC18981x;
        this.f3228c = AbstractC29233h.m145990a(m.f3255q);
        Map synchronizedMap = Collections.synchronizedMap(new HashMap());
        AbstractC19074t.m100207e(synchronizedMap, "synchronizedMap(...)");
        this.f3229d = synchronizedMap;
        this.f3230e = AbstractC29233h.m145990a(new d());
        Map synchronizedMap2 = Collections.synchronizedMap(new HashMap());
        AbstractC19074t.m100207e(synchronizedMap2, "synchronizedMap(...)");
        this.f3231f = synchronizedMap2;
        Map synchronizedMap3 = Collections.synchronizedMap(new HashMap());
        AbstractC19074t.m100207e(synchronizedMap3, "synchronizedMap(...)");
        this.f3232g = synchronizedMap3;
        Map synchronizedMap4 = Collections.synchronizedMap(new HashMap());
        AbstractC19074t.m100207e(synchronizedMap4, "synchronizedMap(...)");
        this.f3233h = synchronizedMap4;
        this.f3234i = new C26398g(new l());
    }

    /* renamed from: A */
    public static final C0876j m2591A() {
        return Companion.m2644a();
    }

    /* renamed from: D */
    private final List m2592D(String str, int i11) {
        List m131502j;
        C3535c m2634q = m2634q(str);
        if (m2634q == null) {
            m131502j = AbstractC25368s.m131502j();
            return m131502j;
        }
        return m2634q.m136041D(i11);
    }

    /* renamed from: F */
    private final C17945a0 m2593F(String str) {
        C3535c m2634q = m2634q(str);
        if (m2634q == null) {
            return null;
        }
        List m17941F0 = m2634q.m17941F0();
        int size = m17941F0.size() - 1;
        if (size >= 0) {
            while (true) {
                int i11 = size - 1;
                C17945a0 c17945a0 = (C17945a0) m17941F0.get(size);
                if (c17945a0.m95032V6()) {
                    return c17945a0;
                }
                if (i11 < 0) {
                    break;
                }
                size = i11;
            }
        }
        return null;
    }

    /* renamed from: L */
    public final C24261h m2594L() {
        return (C24261h) this.f3228c.getValue();
    }

    /* renamed from: N */
    public static /* synthetic */ boolean m2595N(C0876j c0876j, String str, long j11, String str2, String str3, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            str3 = null;
        }
        return c0876j.m2611M(str, j11, str2, str3);
    }

    /* renamed from: T */
    private final C3535c m2596T(Conversation conversation) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("newChat(");
        sb2.append(conversation);
        sb2.append(")");
        C3535c c3535c = new C3535c(conversation, false, 2, null);
        this.f3229d.put(conversation.f42893q, c3535c);
        return c3535c;
    }

    /* renamed from: Y */
    public static final void m2597Y(C0876j c0876j, String str, List list, int i11) {
        AbstractC19074t.m100208f(c0876j, "this$0");
        AbstractC19074t.m100208f(str, "$ownerId");
        AbstractC19074t.m100208f(list, "$messages");
        c0876j.f3226a.mo13623c(str, list, i11);
    }

    /* renamed from: x */
    private final Map m2602x() {
        Object value = this.f3230e.getValue();
        AbstractC19074t.m100207e(value, "getValue(...)");
        return (Map) value;
    }

    /* renamed from: B */
    public final C17945a0 m2603B(String str) {
        AbstractC19074t.m100208f(str, "ownerId");
        List m2604C = m2604C(str, 1);
        if (true ^ m2604C.isEmpty()) {
            return (C17945a0) m2604C.get(0);
        }
        return null;
    }

    /* renamed from: C */
    public final List m2604C(String str, int i11) {
        AbstractC19074t.m100208f(str, "ownerId");
        List m2592D = m2592D(str, i11);
        if (m2592D.size() == i11) {
            return m2592D;
        }
        return this.f3226a.mo13633m(str, i11);
    }

    /* renamed from: E */
    public final C17945a0 m2605E(String str) {
        AbstractC19074t.m100208f(str, "ownerId");
        C17945a0 m2593F = m2593F(str);
        if (m2593F == null) {
            return this.f3226a.mo13638r(str);
        }
        return m2593F;
    }

    /* renamed from: G */
    public final C3533a m2606G(String str) {
        AbstractC19074t.m100208f(str, "uid");
        return (C3533a) this.f3231f.get(str);
    }

    /* renamed from: H */
    public final void m2607H(List list, String str, InterfaceC20094a interfaceC20094a) {
        AbstractC19074t.m100208f(list, "uids");
        AbstractC19074t.m100208f(str, "trackingData");
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        loop0: while (true) {
            int i11 = 0;
            while (it.hasNext()) {
                String str2 = (String) it.next();
                if (AbstractC25495a.m132079d(str2)) {
                    if (hashMap.get(2) == null) {
                        hashMap.put(2, new ArrayList());
                    }
                    ArrayList arrayList = (ArrayList) hashMap.get(2);
                    if (arrayList != null) {
                        arrayList.add(AbstractC25495a.m132088m(str2));
                    }
                } else {
                    if (hashMap.get(1) == null) {
                        hashMap.put(1, new ArrayList());
                    }
                    ArrayList arrayList2 = (ArrayList) hashMap.get(1);
                    if (arrayList2 != null) {
                        arrayList2.add(str2);
                    }
                }
                i11++;
                if (i11 == 100) {
                    break;
                }
            }
            this.f3227b.mo99479b(new HashMap(hashMap), str, interfaceC20094a);
            hashMap.clear();
        }
        if (!hashMap.isEmpty()) {
            this.f3227b.mo99479b(hashMap, str, interfaceC20094a);
        }
    }

    /* renamed from: I */
    public final C17945a0 m2608I(String str, long j11) {
        AbstractC19074t.m100208f(str, "uid");
        return this.f3226a.mo13626f(str, j11);
    }

    /* renamed from: J */
    public final C17945a0 m2609J(String str) {
        AbstractC19074t.m100208f(str, "ownerID");
        List m2610K = m2610K(str, 1);
        if (true ^ m2610K.isEmpty()) {
            return (C17945a0) m2610K.get(0);
        }
        return null;
    }

    /* renamed from: K */
    public final List m2610K(String str, int i11) {
        AbstractC19074t.m100208f(str, "ownerID");
        ArrayList arrayList = new ArrayList();
        if (arrayList.size() < i11) {
            arrayList.addAll(this.f3226a.mo13621a(str, i11 - arrayList.size()));
        }
        return arrayList;
    }

    /* renamed from: M */
    public final boolean m2611M(String str, long j11, String str2, String str3) {
        AbstractC19074t.m100208f(str, "key");
        AbstractC19074t.m100208f(str2, "ownerId");
        boolean mo13632l = this.f3226a.mo13632l(str, j11, str2, str3);
        if (mo13632l) {
            m2602x().put(str, new C26710b(str, j11, str2, str3));
        }
        return mo13632l;
    }

    /* renamed from: O */
    public final boolean m2612O(String str) {
        AbstractC19074t.m100208f(str, "key");
        return m2602x().containsKey(str);
    }

    /* renamed from: P */
    public final void m2613P(C3535c c3535c, InterfaceC26395d.a aVar) {
        AbstractC19074t.m100208f(c3535c, "chat");
        AbstractC19074t.m100208f(aVar, "callback");
        ArrayList arrayList = new ArrayList();
        this.f3234i.mo136089a(c3535c, new InterfaceC26395d.b.C32974b(0, 1, null), aVar, new g(arrayList));
        if ((!arrayList.isEmpty()) && C24265l.Companion.m126709b().m126681C()) {
            m2594L().m126634C(arrayList, c3535c.m17944I0());
        }
    }

    /* renamed from: Q */
    public final void m2614Q(C3535c c3535c, InterfaceC26392a interfaceC26392a, InterfaceC26395d.a aVar) {
        AbstractC19074t.m100208f(c3535c, "chat");
        AbstractC19074t.m100208f(aVar, "callback");
        String m17944I0 = c3535c.m17944I0();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        this.f3234i.mo136091c(c3535c, new InterfaceC26395d.b.c(interfaceC26392a, 0, 2, null), aVar, new h(arrayList, m17944I0, arrayList2));
        if ((!arrayList.isEmpty()) && C24265l.Companion.m126709b().m126681C()) {
            m2594L().m126634C(arrayList, c3535c.m17944I0());
        }
        if (!arrayList2.isEmpty()) {
            BuildersKt__Builders_commonKt.m112540d(C17933b.f90533a.m94579d(), null, null, new i(m17944I0, arrayList2, null), 3, null);
        }
    }

    /* renamed from: R */
    public final void m2615R(C3535c c3535c, InterfaceC26392a interfaceC26392a, boolean z11, InterfaceC26395d.a aVar) {
        AbstractC19074t.m100208f(c3535c, "chat");
        AbstractC19074t.m100208f(interfaceC26392a, "targetMsg");
        AbstractC19074t.m100208f(aVar, "callback");
        C3535c m2639v = m2639v(c3535c.m17971y0());
        ArrayList arrayList = new ArrayList();
        this.f3234i.mo136090b(m2639v, new InterfaceC26395d.b.a(interfaceC26392a, 0, z11, 2, null), aVar, new j(arrayList));
        if ((!arrayList.isEmpty()) && C24265l.Companion.m126709b().m126681C()) {
            m2594L().m126634C(arrayList, c3535c.m17944I0());
        }
    }

    /* renamed from: S */
    public final void m2616S(C3535c c3535c, boolean z11, InterfaceC26395d.a aVar) {
        AbstractC19074t.m100208f(c3535c, "chat");
        AbstractC19074t.m100208f(aVar, "callback");
        C3535c m2639v = m2639v(c3535c.m17971y0());
        ArrayList arrayList = new ArrayList();
        this.f3234i.mo136092d(m2639v, new InterfaceC26395d.b.d(z11, 0, 2, null), aVar, new k(arrayList));
        if ((!arrayList.isEmpty()) && C24265l.Companion.m126709b().m126681C()) {
            m2594L().m126634C(arrayList, c3535c.m17944I0());
        }
    }

    /* renamed from: U */
    public final void m2617U(String str, C3533a c3533a) {
        AbstractC19074t.m100208f(str, "uid");
        AbstractC19074t.m100208f(c3533a, "msg");
        this.f3231f.put(str, c3533a);
    }

    /* renamed from: V */
    public final void m2618V(List list, boolean z11, boolean z12, boolean z13) {
        int i11;
        int i12;
        int i13;
        int i14;
        AbstractC19074t.m100208f(list, "ackMsgList");
        if (z12) {
            if (z11) {
                i14 = 10213;
            } else {
                i14 = 10113;
            }
            i12 = i14;
            i13 = 0;
        } else {
            if (z11) {
                i11 = 202;
            } else {
                i11 = 102;
            }
            i12 = i11;
            i13 = 3;
        }
        InterfaceC18981x.a.m99615a(this.f3227b, list, z13, i12, i13, null, 16, null);
    }

    /* renamed from: W */
    public final void m2619W(List list, boolean z11, InterfaceC20094a interfaceC20094a) {
        AbstractC19074t.m100208f(list, "ackSeenList");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("sendSeenStatus(");
        sb2.append(list);
        sb2.append(", ");
        sb2.append(z11);
        sb2.append(")");
        if (z11) {
            this.f3227b.mo99478a(list, true, 203, 4, interfaceC20094a);
        } else {
            this.f3227b.mo99478a(list, true, 107, 3, interfaceC20094a);
        }
    }

    /* renamed from: X */
    public final void m2620X(String str, List list, int i11) {
        AbstractC19074t.m100208f(str, "ownerId");
        AbstractC19074t.m100208f(list, "messages");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MessageId m95029V3 = ((C17945a0) it.next()).m95029V3();
            AbstractC19074t.m100207e(m95029V3, "getMessageId(...)");
            C17945a0 m2636s = m2636s(m95029V3);
            if (m2636s != null) {
                m2636s.m95264ta(i11);
            }
        }
        AbstractC18428c.m97659b(C23288a.f113033a, str, 0, new Runnable() { // from class: aj.i

            /* renamed from: q */
            public final /* synthetic */ String f3222q;

            /* renamed from: r */
            public final /* synthetic */ List f3223r;

            /* renamed from: s */
            public final /* synthetic */ int f3224s;

            public /* synthetic */ RunnableC0875i(String str2, List list2, int i112) {
                r2 = str2;
                r3 = list2;
                r4 = i112;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C0876j.m2597Y(C0876j.this, r2, r3, r4);
            }
        }, 2, null);
    }

    /* renamed from: Z */
    public final void m2621Z(String str, List list, String str2) {
        AbstractC19074t.m100208f(str, "ownerId");
        AbstractC19074t.m100208f(list, "messages");
        AbstractC19074t.m100208f(str2, "path");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MessageId m95029V3 = ((C17945a0) it.next()).m95029V3();
            AbstractC19074t.m100207e(m95029V3, "getMessageId(...)");
            C17945a0 m2636s = m2636s(m95029V3);
            if (m2636s != null) {
                m2636s.m94934Ka(str2);
            }
        }
        this.f3226a.mo13634n(str, list, str2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0037, code lost:            if (r2 < r6) goto L66;     */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2622e(String str, C26711c c26711c) {
        AbstractC19074t.m100208f(str, "uid");
        AbstractC19074t.m100208f(c26711c, "messageDelete");
        if (!AbstractC26714f.m137369f(c26711c.f126654b)) {
            return;
        }
        Map map = this.f3233h;
        Object obj = map.get(str);
        if (obj == null) {
            map.put(str, c26711c);
            obj = c26711c;
        }
        C26711c c26711c2 = (C26711c) obj;
        if (!AbstractC19074t.m100204b(c26711c2, c26711c)) {
            long j11 = c26711c2.f126658f;
            if (j11 > 0) {
                long j12 = c26711c.f126658f;
                if (j12 > 0) {
                }
            }
            MessageId messageId = c26711c2.f126654b;
            MessageId messageId2 = c26711c.f126654b;
            if ((!messageId.m41053q() || !messageId2.m41053q() || messageId.m41047k() >= messageId2.m41047k()) && (!messageId.m41052p() || !messageId2.m41052p() || messageId.m41045i() >= messageId2.m41045i())) {
                return;
            }
            this.f3233h.put(str, c26711c);
        }
    }

    /* renamed from: f */
    public final void m2623f(String str, C20568e c20568e) {
        AbstractC19074t.m100208f(str, "uid");
        AbstractC19074t.m100208f(c20568e, "undoExtras");
        Object obj = this.f3232g.get(str);
        if (obj == null) {
            obj = new ArrayList();
            this.f3232g.put(str, obj);
        }
        ((List) obj).add(c20568e);
    }

    /* renamed from: g */
    public final boolean m2624g(C17945a0 c17945a0) {
        AbstractC19074t.m100208f(c17945a0, "message");
        C26711c c26711c = (C26711c) this.f3233h.get(c17945a0.mo95039W2());
        if (c26711c == null) {
            return false;
        }
        if (c26711c.f126658f > 0 && c17945a0.m94974P4() > 0 && c26711c.f126658f >= c17945a0.m94974P4()) {
            return true;
        }
        MessageId messageId = c26711c.f126654b;
        MessageId m95029V3 = c17945a0.m95029V3();
        AbstractC19074t.m100207e(m95029V3, "getMessageId(...)");
        if (messageId.m41053q() && m95029V3.m41053q() && messageId.m41047k() >= m95029V3.m41047k()) {
            return true;
        }
        if (!messageId.m41052p() || !m95029V3.m41052p() || messageId.m41045i() < m95029V3.m41045i()) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public final C20568e m2625h(MessageId messageId) {
        AbstractC19074t.m100208f(messageId, "messageId");
        List list = (List) this.f3232g.get(messageId.m41048l());
        Object obj = null;
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (AbstractC19074t.m100204b(((C20568e) next).m107018b(), messageId)) {
                obj = next;
                break;
            }
        }
        return (C20568e) obj;
    }

    /* renamed from: i */
    public final void m2626i() {
        if (m2602x().size() >= 2200) {
            this.f3226a.mo13637q(1800);
        }
    }

    /* renamed from: j */
    public final void m2627j() {
        C24559a.m127933c("MessageRepository", "clearAllMemCache()");
        m2628k(true, false);
        this.f3231f.clear();
        this.f3233h.clear();
        this.f3232g.clear();
        this.f3228c.reset();
    }

    /* renamed from: k */
    public final void m2628k(boolean z11, boolean z12) {
        ArrayList arrayList;
        C24559a.m127933c("MessageRepository", "closeAllChats(" + z11 + ")");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("closeAllChats(");
        sb2.append(z11);
        sb2.append(")");
        try {
            synchronized (this.f3229d) {
                arrayList = new ArrayList(this.f3229d.values());
                this.f3229d.clear();
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C3535c) it.next()).m17968v0(z11);
            }
            if (z12) {
                C23744a.Companion.m124119a().m124116d(127, new Object[0]);
            }
        } catch (Throwable th2) {
            if (z12) {
                C23744a.Companion.m124119a().m124116d(127, new Object[0]);
            }
            throw th2;
        }
    }

    /* renamed from: l */
    public final void m2629l(String str) {
        AbstractC19074t.m100208f(str, "uid");
        C3535c c3535c = (C3535c) this.f3229d.remove(str);
        if (c3535c != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("closeChat(");
            sb2.append(c3535c);
            sb2.append(")");
            c3535c.m17969w0();
            c3535c.m17968v0(true);
        }
    }

    /* renamed from: m */
    public final void m2630m(String str) {
        AbstractC19074t.m100208f(str, "ownerId");
        synchronized (m2602x()) {
            AbstractC25378x.m131541C(m2602x().values(), new e(str));
        }
        this.f3226a.mo13629i(str);
    }

    /* renamed from: n */
    public final void m2631n() {
        synchronized (m2602x()) {
            AbstractC25378x.m131541C(m2602x().values(), f.f3240q);
        }
        this.f3226a.mo13627g();
    }

    /* renamed from: o */
    public final void m2632o(C3535c c3535c) {
        AbstractC19074t.m100208f(c3535c, "chat");
        InterfaceC26395d interfaceC26395d = this.f3234i;
        AbstractC19074t.m100206d(interfaceC26395d, "null cannot be cast to non-null type com.zing.zalo.paging.PositionalPager<com.zing.zalo.data.chat.model.message.ChatContent>");
        ((C26398g) interfaceC26395d).m136113f(c3535c);
    }

    /* renamed from: p */
    public final long m2633p(String str) {
        AbstractC19074t.m100208f(str, "ownerId");
        return this.f3226a.mo13635o(str);
    }

    /* renamed from: q */
    public final C3535c m2634q(String str) {
        AbstractC19074t.m100208f(str, "uid");
        return (C3535c) this.f3229d.get(str);
    }

    /* renamed from: r */
    public final C17945a0 m2635r(MessageId messageId) {
        if (messageId != null) {
            C17945a0 m2636s = m2636s(messageId);
            if (m2636s == null) {
                return this.f3226a.mo13630j(messageId);
            }
            return m2636s;
        }
        return null;
    }

    /* renamed from: s */
    public final C17945a0 m2636s(MessageId messageId) {
        AbstractC19074t.m100208f(messageId, "messageId");
        try {
            C3535c m2634q = m2634q(messageId.m41048l());
            if (m2634q == null) {
                return null;
            }
            return m2634q.m17970x0(messageId);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("MessageRepository", e11);
            return null;
        }
    }

    /* renamed from: t */
    public final void m2637t(InterfaceC18505l interfaceC18505l) {
        ArrayList arrayList;
        AbstractC19074t.m100208f(interfaceC18505l, "action");
        synchronized (this.f3229d) {
            arrayList = new ArrayList(this.f3229d.values());
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            interfaceC18505l.mo205i9(it.next());
        }
    }

    /* renamed from: u */
    public final C3535c m2638u(ContactProfile contactProfile) {
        C3535c m2639v;
        AbstractC19074t.m100208f(contactProfile, "profile");
        synchronized (this.f3229d) {
            m2639v = m2639v(new Conversation(contactProfile));
        }
        return m2639v;
    }

    /* renamed from: v */
    public final C3535c m2639v(Conversation conversation) {
        AbstractC19074t.m100208f(conversation, "conversation");
        C3535c c3535c = (C3535c) this.f3229d.get(conversation.f42893q);
        if (c3535c == null) {
            return m2596T(conversation);
        }
        return c3535c;
    }

    /* renamed from: w */
    public final C3535c m2640w(String str) {
        AbstractC19074t.m100208f(str, "uid");
        C3535c c3535c = (C3535c) this.f3229d.get(str);
        if (c3535c == null) {
            Conversation m103202S = AbstractC23306f.m120572D0().m103202S(str);
            if (m103202S == null) {
                m103202S = new Conversation(str, null, null, null, 14, null);
            }
            return m2596T(m103202S);
        }
        return c3535c;
    }

    /* renamed from: y */
    public final C26710b m2641y(String str) {
        AbstractC19074t.m100208f(str, "key");
        return (C26710b) m2602x().get(str);
    }

    /* renamed from: z */
    public final int m2642z(C17945a0 c17945a0) {
        AbstractC19074t.m100208f(c17945a0, "message");
        return (int) this.f3226a.mo13631k(c17945a0);
    }
}
