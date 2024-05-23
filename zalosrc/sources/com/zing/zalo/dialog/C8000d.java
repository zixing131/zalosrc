package com.zing.zalo.dialog;

import ag0.AbstractC0837p0;
import androidx.lifecycle.AbstractC1796t0;
import androidx.lifecycle.AbstractC1798u0;
import androidx.lifecycle.C1761c0;
import androidx.lifecycle.C1780l0;
import androidx.lifecycle.LiveData;
import bn.EnumC2882j0;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.dialog.AbstractC7999c;
import com.zing.zalo.dialog.C8000d;
import dj.C17945a0;
import en0.InterfaceC18494a;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import hn0.AbstractC20104d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import p164fn.EnumC19029c;
import p164fn.InterfaceC19030d;
import p248iy.AbstractC20887g;
import p348mi.AbstractC23306f;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import qm0.AbstractC25370t;
import qm0.AbstractC25378x;
import vm0.AbstractC28298d;
import wm0.AbstractC29096d;
import wm0.AbstractC29104l;

/* renamed from: com.zing.zalo.dialog.d */
/* loaded from: classes3.dex */
public final class C8000d extends AbstractC1796t0 implements InterfaceC19030d {
    public static final a Companion = new a(null);

    /* renamed from: A */
    private int f43726A;

    /* renamed from: B */
    private int f43727B;

    /* renamed from: C */
    private int f43728C;

    /* renamed from: s */
    private final C1780l0 f43729s;

    /* renamed from: t */
    private final C1761c0 f43730t;

    /* renamed from: u */
    private final LiveData f43731u;

    /* renamed from: v */
    private EnumC2882j0 f43732v;

    /* renamed from: w */
    private C17945a0 f43733w;

    /* renamed from: x */
    private final List f43734x;

    /* renamed from: y */
    private final List f43735y;

    /* renamed from: z */
    private final List f43736z;

    /* renamed from: com.zing.zalo.dialog.d$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.dialog.d$b */
    /* loaded from: classes3.dex */
    static final class b extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f43737t;

        b(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new b(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f43737t == 0) {
                AbstractC24862s.m129228b(obj);
                AbstractC7999c abstractC7999c = (AbstractC7999c) C8000d.this.f43730t.mo9215f();
                if (abstractC7999c != null) {
                    C8000d c8000d = C8000d.this;
                    if (abstractC7999c instanceof AbstractC7999c.d) {
                        c8000d.m43084a0();
                    } else if (abstractC7999c instanceof AbstractC7999c.e) {
                        C8000d.m43093o0(c8000d, 0, true, 1, null);
                    }
                }
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.dialog.d$c */
    /* loaded from: classes3.dex */
    static final class c extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f43739t;

        /* renamed from: v */
        final /* synthetic */ MessageId f43741v;

        /* renamed from: w */
        final /* synthetic */ EnumC19029c f43742w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(MessageId messageId, EnumC19029c enumC19029c, Continuation continuation) {
            super(2, continuation);
            this.f43741v = messageId;
            this.f43742w = enumC19029c;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new c(this.f43741v, this.f43742w, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            int i11;
            boolean z11;
            boolean z12;
            AbstractC28298d.m142578e();
            if (this.f43739t == 0) {
                AbstractC24862s.m129228b(obj);
                C17945a0 c17945a0 = C8000d.this.f43733w;
                if (c17945a0 != null) {
                    MessageId messageId = this.f43741v;
                    EnumC19029c enumC19029c = this.f43742w;
                    C8000d c8000d = C8000d.this;
                    if (c17945a0.m95306y8()) {
                        i11 = 500101;
                    } else {
                        i11 = 500102;
                    }
                    if (c17945a0.m95135f9(messageId)) {
                        if (enumC19029c == EnumC19029c.f94854t) {
                            c8000d.f43736z.add(c17945a0);
                            c8000d.m43089h0(i11);
                        } else {
                            c8000d.f43735y.add(c17945a0);
                            if (enumC19029c == EnumC19029c.f94856v) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (enumC19029c == EnumC19029c.f94857w) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            EnumC2882j0 enumC2882j0 = c8000d.f43732v;
                            EnumC2882j0 enumC2882j02 = EnumC2882j0.f11486y;
                            if (enumC2882j0 != enumC2882j02 && enumC19029c != EnumC19029c.f94858x) {
                                enumC2882j02 = c8000d.f43726A > 1 ? EnumC2882j0.f11485x : (z11 && c17945a0.m95306y8()) ? EnumC2882j0.f11484w : z11 ? EnumC2882j0.f11483v : (z12 && c17945a0.m95306y8() && c17945a0.m94889F6()) ? EnumC2882j0.f11481t : (z12 && c17945a0.m95306y8()) ? EnumC2882j0.f11482u : c17945a0.m95306y8() ? EnumC2882j0.f11480s : (z12 && c17945a0.m95276v6() && c17945a0.m94889F6()) ? EnumC2882j0.f11478q : (z12 && c17945a0.m95276v6()) ? EnumC2882j0.f11479r : EnumC2882j0.f11477p;
                            }
                            c8000d.f43732v = enumC2882j02;
                            c8000d.m43088g0(i11, enumC19029c.m100102c());
                        }
                    }
                }
                C8000d.this.m43087e0();
                C8000d.m43093o0(C8000d.this, 0, false, 3, null);
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.dialog.d$d */
    /* loaded from: classes3.dex */
    static final class d extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f43743t;

        /* renamed from: v */
        final /* synthetic */ MessageId f43745v;

        /* renamed from: w */
        final /* synthetic */ int f43746w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(MessageId messageId, int i11, Continuation continuation) {
            super(2, continuation);
            this.f43745v = messageId;
            this.f43746w = i11;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new d(this.f43745v, this.f43746w, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f43743t == 0) {
                AbstractC24862s.m129228b(obj);
                C17945a0 c17945a0 = C8000d.this.f43733w;
                if (c17945a0 != null) {
                    MessageId messageId = this.f43745v;
                    C8000d c8000d = C8000d.this;
                    int i11 = this.f43746w;
                    if (c17945a0.m95135f9(messageId)) {
                        C8000d.m43093o0(c8000d, i11, false, 2, null);
                    }
                }
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.dialog.d$e */
    /* loaded from: classes3.dex */
    public static final class e extends AbstractC29096d {

        /* renamed from: s */
        Object f43747s;

        /* renamed from: t */
        /* synthetic */ Object f43748t;

        /* renamed from: v */
        int f43750v;

        e(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f43748t = obj;
            this.f43750v |= Integer.MIN_VALUE;
            return C8000d.this.m43090k0(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.dialog.d$f */
    /* loaded from: classes3.dex */
    public static final class f extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f43751t;

        /* renamed from: u */
        final /* synthetic */ InterfaceC18494a f43752u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(InterfaceC18494a interfaceC18494a, Continuation continuation) {
            super(2, continuation);
            this.f43752u = interfaceC18494a;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new f(this.f43752u, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f43751t == 0) {
                AbstractC24862s.m129228b(obj);
                return this.f43752u.mo12V4();
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((f) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.dialog.d$g */
    /* loaded from: classes3.dex */
    public static final class g extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f43753t;

        /* renamed from: v */
        final /* synthetic */ List f43755v;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.dialog.d$g$a */
        /* loaded from: classes3.dex */
        public static final class a extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ List f43756q;

            /* renamed from: r */
            final /* synthetic */ C8000d f43757r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(List list, C8000d c8000d) {
                super(0);
                this.f43756q = list;
                this.f43757r = c8000d;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List mo12V4() {
                List list = this.f43756q;
                C8000d c8000d = this.f43757r;
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C17945a0 m2635r = AbstractC23306f.m120584H0().m2635r((MessageId) it.next());
                    C17945a0 c17945a0 = null;
                    if (m2635r != null) {
                        if (!m2635r.m95154h9()) {
                            c8000d.f43736z.add(m2635r);
                            m2635r = null;
                        }
                        c17945a0 = m2635r;
                    }
                    if (c17945a0 != null) {
                        arrayList.add(c17945a0);
                    }
                }
                return arrayList;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(List list, Continuation continuation) {
            super(2, continuation);
            this.f43755v = list;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new g(this.f43755v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f43753t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C8000d c8000d = C8000d.this;
                a aVar = new a(this.f43755v, c8000d);
                this.f43753t = 1;
                if (c8000d.m43090k0(aVar, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((g) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.dialog.d$h */
    /* loaded from: classes3.dex */
    static final class h extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f43758t;

        /* renamed from: v */
        final /* synthetic */ List f43760v;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.dialog.d$h$a */
        /* loaded from: classes3.dex */
        public static final class a extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ List f43761q;

            /* renamed from: r */
            final /* synthetic */ C8000d f43762r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(List list, C8000d c8000d) {
                super(0);
                this.f43761q = list;
                this.f43762r = c8000d;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List mo12V4() {
                List list = this.f43761q;
                C8000d c8000d = this.f43762r;
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    C17945a0 c17945a0 = (C17945a0) obj;
                    boolean m95154h9 = c17945a0.m95154h9();
                    if (!m95154h9) {
                        c8000d.f43736z.add(c17945a0);
                    }
                    if (m95154h9) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(List list, Continuation continuation) {
            super(2, continuation);
            this.f43760v = list;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new h(this.f43760v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            int m131511r;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f43758t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C1780l0 c1780l0 = C8000d.this.f43729s;
                List list = this.f43760v;
                m131511r = AbstractC25370t.m131511r(list, 10);
                ArrayList arrayList = new ArrayList(m131511r);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C17945a0) it.next()).m95029V3());
                }
                c1780l0.m9321g("message_id_list", arrayList);
                C8000d c8000d = C8000d.this;
                a aVar = new a(this.f43760v, c8000d);
                this.f43758t = 1;
                if (c8000d.m43090k0(aVar, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((h) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    public C8000d(C1780l0 c1780l0) {
        AbstractC19074t.m100208f(c1780l0, "saveState");
        this.f43729s = c1780l0;
        C1761c0 c1761c0 = new C1761c0();
        c1761c0.mo9224q(new AbstractC7999c.d(0));
        this.f43730t = c1761c0;
        this.f43731u = c1761c0;
        EnumC2882j0 enumC2882j0 = EnumC2882j0.f11477p;
        this.f43732v = enumC2882j0;
        this.f43734x = new ArrayList();
        this.f43735y = new ArrayList();
        this.f43736z = new ArrayList();
        List list = (List) c1780l0.m9318c("message_id_list");
        if (list != null) {
            Integer num = (Integer) c1780l0.m9318c("failed_messages_size");
            if (num != null) {
                num.intValue();
                EnumC2882j0 enumC2882j02 = (EnumC2882j0) c1780l0.m9318c("error_type");
                this.f43732v = enumC2882j02 != null ? enumC2882j02 : enumC2882j0;
                this.f43726A = list.size();
                m43093o0(this, 0, false, 3, null);
                return;
            }
            m43091l0(list);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a0 */
    public final void m43084a0() {
        final C17945a0 c17945a0 = this.f43733w;
        if (c17945a0 != null) {
            AbstractC0837p0.Companion.m2236a().mo2040a(new Runnable() { // from class: bn.z
                @Override // java.lang.Runnable
                public final void run() {
                    C8000d.m43085b0(C17945a0.this);
                }
            });
            this.f43734x.add(c17945a0);
        }
        this.f43733w = null;
        m43093o0(this, 0, false, 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b0 */
    public static final void m43085b0(C17945a0 c17945a0) {
        AbstractC19074t.m100208f(c17945a0, "$it");
        c17945a0.m95068Z0();
    }

    /* renamed from: c0 */
    private final void m43086c0() {
        this.f43734x.clear();
        this.f43735y.clear();
        this.f43736z.clear();
        this.f43726A = 0;
        this.f43728C = 0;
        this.f43727B = 0;
        this.f43733w = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e0 */
    public final void m43087e0() {
        Object m131544F;
        m131544F = AbstractC25378x.m131544F(this.f43734x);
        C17945a0 c17945a0 = (C17945a0) m131544F;
        this.f43733w = c17945a0;
        if (c17945a0 != null) {
            if (c17945a0.m95154h9()) {
                c17945a0.m94999Rb(this);
            } else {
                this.f43736z.add(c17945a0);
                m43087e0();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g0 */
    public final void m43088g0(int i11, int i12) {
        AbstractC20887g.m109221H(false, false, i12, i11, 0, 0L, "", 0L, 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h0 */
    public final void m43089h0(int i11) {
        AbstractC20887g.m109221H(false, true, 0, i11, 0, 0L, "", 0L, 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: k0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m43090k0(InterfaceC18494a interfaceC18494a, Continuation continuation) {
        e eVar;
        Object m142578e;
        int i11;
        C8000d c8000d;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i12 = eVar.f43750v;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                eVar.f43750v = i12 - Integer.MIN_VALUE;
                Object obj = eVar.f43748t;
                m142578e = AbstractC28298d.m142578e();
                i11 = eVar.f43750v;
                if (i11 == 0) {
                    if (i11 == 1) {
                        c8000d = (C8000d) eVar.f43747s;
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    m43086c0();
                    CoroutineDispatcher m112679a = Dispatchers.m112679a();
                    f fVar = new f(interfaceC18494a, null);
                    eVar.f43747s = this;
                    eVar.f43750v = 1;
                    obj = BuildersKt.m112534g(m112679a, fVar, eVar);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                    c8000d = this;
                }
                c8000d.f43734x.addAll((List) obj);
                c8000d.f43727B = c8000d.f43736z.size();
                c8000d.f43726A = c8000d.f43734x.size() + c8000d.f43736z.size();
                c8000d.f43728C = c8000d.f43734x.size();
                c8000d.m43087e0();
                m43093o0(c8000d, 0, false, 3, null);
                return C24848g0.f119245a;
            }
        }
        eVar = new e(continuation);
        Object obj2 = eVar.f43748t;
        m142578e = AbstractC28298d.m142578e();
        i11 = eVar.f43750v;
        if (i11 == 0) {
        }
        c8000d.f43734x.addAll((List) obj2);
        c8000d.f43727B = c8000d.f43736z.size();
        c8000d.f43726A = c8000d.f43734x.size() + c8000d.f43736z.size();
        c8000d.f43728C = c8000d.f43734x.size();
        c8000d.m43087e0();
        m43093o0(c8000d, 0, false, 3, null);
        return C24848g0.f119245a;
    }

    /* renamed from: l0 */
    private final Job m43091l0(List list) {
        Job m112540d;
        m112540d = BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new g(list, null), 3, null);
        return m112540d;
    }

    /* renamed from: n0 */
    private final void m43092n0(int i11, boolean z11) {
        int size;
        boolean z12;
        Object eVar;
        int m104529e;
        if (this.f43733w != null) {
            m104529e = AbstractC20104d.m104529e((((this.f43736z.size() - this.f43727B) * 100.0f) + i11) / this.f43728C);
            eVar = new AbstractC7999c.d(m104529e);
        } else if (!this.f43734x.isEmpty()) {
            eVar = AbstractC7999c.a.f43718a;
        } else if (z11) {
            eVar = AbstractC7999c.b.f43719a;
        } else if (!(!this.f43735y.isEmpty()) && this.f43729s.m9318c("failed_messages_size") == null) {
            eVar = new AbstractC7999c.c(this.f43726A);
        } else {
            Integer num = (Integer) this.f43729s.m9318c("failed_messages_size");
            if (num != null) {
                size = num.intValue();
            } else {
                size = this.f43735y.size();
                this.f43729s.m9321g("failed_messages_size", Integer.valueOf(this.f43735y.size()));
            }
            this.f43729s.m9321g("error_type", this.f43732v);
            Boolean bool = (Boolean) this.f43729s.m9318c("sent_messages_on_failed");
            if (bool != null) {
                z12 = bool.booleanValue();
            } else {
                z12 = false;
            }
            eVar = new AbstractC7999c.e(this.f43732v, size, this.f43726A, !z12);
        }
        this.f43730t.mo9224q(eVar);
    }

    /* renamed from: o0 */
    static /* synthetic */ void m43093o0(C8000d c8000d, int i11, boolean z11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = 0;
        }
        if ((i12 & 2) != 0) {
            z11 = false;
        }
        c8000d.m43092n0(i11, z11);
    }

    /* renamed from: f0 */
    public final LiveData m43094f0() {
        return this.f43731u;
    }

    /* renamed from: i0 */
    public final Job m43095i0() {
        Job m112540d;
        m112540d = BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new b(null), 3, null);
        return m112540d;
    }

    /* renamed from: j0 */
    public final void m43096j0() {
        this.f43729s.m9321g("sent_messages_on_failed", Boolean.TRUE);
    }

    /* renamed from: m0 */
    public final Job m43097m0(List list) {
        Job m112540d;
        AbstractC19074t.m100208f(list, "messages");
        m112540d = BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new h(list, null), 3, null);
        return m112540d;
    }

    @Override // p164fn.InterfaceC19030d
    /* renamed from: u */
    public void mo43098u(MessageId messageId, int i11) {
        AbstractC19074t.m100208f(messageId, "messageId");
        BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new d(messageId, i11, null), 3, null);
    }

    @Override // p164fn.InterfaceC19030d
    /* renamed from: y */
    public void mo43099y(MessageId messageId, EnumC19029c enumC19029c) {
        AbstractC19074t.m100208f(messageId, "messageId");
        AbstractC19074t.m100208f(enumC19029c, "resultType");
        BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new c(messageId, enumC19029c, null), 3, null);
    }
}
