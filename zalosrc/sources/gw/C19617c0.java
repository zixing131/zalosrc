package gw;

import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalocore.CoreUtility;
import dj.C17945a0;
import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import mm0.AbstractC23350e;
import org.json.JSONArray;
import org.json.JSONObject;
import p019aj.C0876j;
import p056cj.C3533a;
import p056cj.C3535c;
import p212hj.AbstractC20071b;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23306f;
import p716zh.C31909f1;
import qm0.AbstractC25376w;
import tj.C26710b;
import ws.C29210k;

/* renamed from: gw.c0 */
/* loaded from: classes4.dex */
public final class C19617c0 {

    /* renamed from: a */
    private final C0876j f97412a;

    /* renamed from: b */
    private List f97413b;

    /* renamed from: c */
    private final LinkedList f97414c;

    /* renamed from: d */
    private final LinkedList f97415d;

    /* renamed from: e */
    private final LinkedList f97416e;

    /* renamed from: f */
    private boolean f97417f;

    /* renamed from: g */
    private int f97418g;

    /* renamed from: h */
    private int f97419h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: gw.c0$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: q */
        public static final a f97420q = new a();

        a() {
            super(2);
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer mo240pC(C17945a0 c17945a0, C17945a0 c17945a02) {
            AbstractC19074t.m100208f(c17945a0, "o1");
            AbstractC19074t.m100208f(c17945a02, "o2");
            return Integer.valueOf(AbstractC19074t.m100210h(c17945a02.m94974P4(), c17945a0.m94974P4()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: gw.c0$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: q */
        public static final b f97421q = new b();

        b() {
            super(2);
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer mo240pC(C17945a0 c17945a0, C17945a0 c17945a02) {
            AbstractC19074t.m100208f(c17945a0, "o1");
            AbstractC19074t.m100208f(c17945a02, "o2");
            return Integer.valueOf(AbstractC19074t.m100210h(c17945a0.m95029V3().m41047k() - c17945a02.m95029V3().m41047k(), 0L));
        }
    }

    public C19617c0() {
        C0876j m120584H0 = AbstractC23306f.m120584H0();
        AbstractC19074t.m100207e(m120584H0, "provideMessageRepo(...)");
        this.f97412a = m120584H0;
        this.f97413b = new LinkedList();
        this.f97414c = new LinkedList();
        this.f97415d = new LinkedList();
        this.f97416e = new LinkedList();
        this.f97417f = true;
        this.f97418g = -1;
        this.f97419h = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x007c A[LOOP:0: B:10:0x0035->B:18:0x007c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007e A[EDGE_INSN: B:19:0x007e->B:28:0x007e BREAK  A[LOOP:0: B:10:0x0035->B:18:0x007c], SYNTHETIC] */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final List m102646e(C3535c c3535c, List list, boolean z11) {
        C31909f1 m145886u = C29210k.Companion.m145896a().m145886u(c3535c.m17944I0());
        if (m145886u != null && m145886u.f146610b.m41059z() && !list.isEmpty()) {
            try {
                LinkedList linkedList = new LinkedList();
                MessageId messageId = m145886u.f146610b;
                AbstractC19074t.m100207e(messageId, "mLastDelMsgId");
                int size = this.f97413b.size() - 1;
                if (size >= 0) {
                    while (true) {
                        int i11 = size - 1;
                        C17945a0 c17945a0 = (C17945a0) this.f97413b.get(size);
                        MessageId m95029V3 = c17945a0.m95029V3();
                        AbstractC19074t.m100207e(m95029V3, "getMessageId(...)");
                        if (m95029V3.m41053q() && messageId.m41053q()) {
                            if (m95029V3.m41047k() <= messageId.m41047k()) {
                                break;
                            }
                            linkedList.addFirst(c17945a0);
                            if (i11 >= 0) {
                            }
                        } else {
                            if (m95029V3.m41045i() <= messageId.m41045i()) {
                                break;
                            }
                            linkedList.addFirst(c17945a0);
                            if (i11 >= 0) {
                                break;
                            }
                            size = i11;
                        }
                    }
                    if (z11) {
                        c3535c.m17953R0(false);
                    }
                }
                return linkedList;
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
        return list;
    }

    /* renamed from: j */
    private final boolean m102647j(C17945a0 c17945a0) {
        if (!c17945a0.m95228p8() && !c17945a0.m95091b6() && !c17945a0.m95219o8() && !c17945a0.m95013T5()) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public static final int m102648m(InterfaceC18509p interfaceC18509p, Object obj, Object obj2) {
        AbstractC19074t.m100208f(interfaceC18509p, "$tmp0");
        return ((Number) interfaceC18509p.mo240pC(obj, obj2)).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public static final int m102649r(InterfaceC18509p interfaceC18509p, Object obj, Object obj2) {
        AbstractC19074t.m100208f(interfaceC18509p, "$tmp0");
        return ((Number) interfaceC18509p.mo240pC(obj, obj2)).intValue();
    }

    /* renamed from: c */
    public final void m102650c(C19617c0 c19617c0) {
        AbstractC19074t.m100208f(c19617c0, "messageParser");
        this.f97418g = c19617c0.f97418g;
        this.f97419h = c19617c0.f97419h;
        this.f97417f = c19617c0.f97417f;
    }

    /* renamed from: d */
    public final void m102651d(C3535c c3535c, boolean z11) {
        AbstractC19074t.m100208f(c3535c, "currentChat");
        ArrayList arrayList = new ArrayList();
        this.f97413b = m102646e(c3535c, this.f97413b, z11);
        this.f97414c.clear();
        for (C17945a0 c17945a0 : this.f97413b) {
            String m103022r0 = AbstractC19646n0.m103022r0(c17945a0);
            AbstractC19074t.m100207e(m103022r0, "generateCheckDupKey(...)");
            if (!this.f97412a.m2612O(m103022r0)) {
                LinkedList linkedList = this.f97414c;
                if (!(linkedList instanceof Collection) || !linkedList.isEmpty()) {
                    Iterator it = linkedList.iterator();
                    while (it.hasNext()) {
                        if (AbstractC19074t.m100204b(((C26710b) it.next()).m137328c(), m103022r0)) {
                            break;
                        }
                    }
                }
                if (!c17945a0.m95218o7()) {
                    C0876j c0876j = this.f97412a;
                    MessageId m95029V3 = c17945a0.m95029V3();
                    AbstractC19074t.m100207e(m95029V3, "getMessageId(...)");
                    if (c0876j.m2625h(m95029V3) == null && !this.f97412a.m2624g(c17945a0) && !m102647j(c17945a0)) {
                        arrayList.add(c17945a0);
                        LinkedList linkedList2 = this.f97414c;
                        long m41047k = c17945a0.m95029V3().m41047k();
                        String mo95039W2 = c17945a0.mo95039W2();
                        AbstractC19074t.m100207e(mo95039W2, "getOwnerId(...)");
                        linkedList2.add(new C26710b(m103022r0, m41047k, mo95039W2, null, 8, null));
                    }
                }
            }
        }
        this.f97413b = arrayList;
    }

    /* renamed from: f */
    public final LinkedList m102652f() {
        return this.f97414c;
    }

    /* renamed from: g */
    public final LinkedList m102653g() {
        return this.f97415d;
    }

    /* renamed from: h */
    public final LinkedList m102654h() {
        return this.f97416e;
    }

    /* renamed from: i */
    public final List m102655i() {
        return this.f97413b;
    }

    /* renamed from: k */
    public final void m102656k(C19617c0 c19617c0) {
        AbstractC19074t.m100208f(c19617c0, "messageParser");
        for (C17945a0 c17945a0 : c19617c0.f97413b) {
            String m103022r0 = AbstractC19646n0.m103022r0(c17945a0);
            AbstractC19074t.m100207e(m103022r0, "generateCheckDupKey(...)");
            LinkedList linkedList = this.f97414c;
            if (!(linkedList instanceof Collection) || !linkedList.isEmpty()) {
                Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    if (AbstractC19074t.m100204b(((C26710b) it.next()).m137328c(), m103022r0)) {
                        break;
                    }
                }
            }
            this.f97413b.add(c17945a0);
            LinkedList linkedList2 = this.f97414c;
            long m41047k = c17945a0.m95029V3().m41047k();
            String mo95039W2 = c17945a0.mo95039W2();
            AbstractC19074t.m100207e(mo95039W2, "getOwnerId(...)");
            linkedList2.add(new C26710b(m103022r0, m41047k, mo95039W2, null, 8, null));
        }
        this.f97416e.addAll(c19617c0.f97416e);
        this.f97415d.addAll(c19617c0.f97415d);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0073 A[Catch: Exception -> 0x006e, TryCatch #0 {Exception -> 0x006e, blocks: (B:13:0x0055, B:41:0x005d, B:19:0x00a6, B:21:0x00ac, B:15:0x0073, B:17:0x007b, B:37:0x008c, B:39:0x0094, B:47:0x0050), top: B:40:0x005d }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a6 A[Catch: Exception -> 0x006e, TryCatch #0 {Exception -> 0x006e, blocks: (B:13:0x0055, B:41:0x005d, B:19:0x00a6, B:21:0x00ac, B:15:0x0073, B:17:0x007b, B:37:0x008c, B:39:0x0094, B:47:0x0050), top: B:40:0x005d }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x005d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m102657l(int i11, int i12, boolean z11, JSONArray jSONArray) {
        int i13;
        AbstractC19074t.m100208f(jSONArray, "arrayMsg");
        int length = jSONArray.length();
        ArrayList arrayList = new ArrayList();
        for (int i14 = 0; i14 < length; i14++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i14).getJSONObject("text");
                String string = jSONObject.getString(ZinstantMetaConstant.IMPRESSION_META_TYPE);
                JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                String str = CoreUtility.f89233i;
                AbstractC19074t.m100207e(str, "currentUserUid");
                AbstractC19074t.m100205c(jSONObject2);
                AbstractC19074t.m100205c(string);
                C17945a0 c17945a0 = null;
                try {
                    try {
                        try {
                            arrayList.add(new C3533a(i11, string, jSONObject2, AbstractC19656s0.m103054C(str, jSONObject2, string, i12, null)));
                        } catch (Exception e11) {
                            e = e11;
                            AbstractC20110a.f98889a.mo104552e(e);
                            if (!AbstractC19074t.m100204b(string, "chat.delete")) {
                            }
                            if (c17945a0 != null) {
                            }
                        }
                    } catch (Exception e12) {
                        e = e12;
                    }
                    if (!AbstractC19074t.m100204b(string, "chat.delete")) {
                        try {
                            c17945a0 = new C17945a0(jSONObject2, -101, string, i12, false);
                            this.f97415d.add(c17945a0);
                        } catch (Exception e13) {
                            e = e13;
                            AbstractC23350e.m122778h(e);
                        }
                    } else if (AbstractC19074t.m100204b(string, "chat.undo")) {
                        this.f97416e.add(new C17945a0(jSONObject2, 36, string, i12, false));
                    } else {
                        AbstractC20071b.a aVar = AbstractC20071b.Companion;
                        if (aVar.m104323b(string)) {
                            AbstractC19656s0.m103063f(string, jSONObject2, false);
                            c17945a0 = new C17945a0(jSONObject2, aVar.m104324c(string, jSONObject2), string, i12, false);
                        }
                    }
                    if (c17945a0 != null) {
                        if (AbstractC23304d.m120544o()) {
                            C19639k.f97504a.m102874b(c17945a0, this.f97418g, this.f97419h);
                        }
                        try {
                            c17945a0.m95155ha(z11);
                            if (c17945a0.m95180k8()) {
                                i13 = 2;
                            } else {
                                i13 = 3;
                            }
                            c17945a0.m95016Ta(i13);
                            this.f97413b.add(c17945a0);
                        } catch (Exception e14) {
                            e = e14;
                            AbstractC23350e.m122778h(e);
                        }
                    }
                } catch (Exception e15) {
                    e = e15;
                }
            } catch (Exception e16) {
                e = e16;
            }
        }
        if (!this.f97415d.isEmpty()) {
            LinkedList linkedList = this.f97415d;
            final a aVar2 = a.f97420q;
            AbstractC25376w.m131534w(linkedList, new Comparator() { // from class: gw.a0
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int m102648m;
                    m102648m = C19617c0.m102648m(InterfaceC18509p.this, obj, obj2);
                    return m102648m;
                }
            });
        }
        if (this.f97417f) {
            this.f97412a.m2618V(arrayList, true, false, false);
        }
    }

    /* renamed from: n */
    public final void m102658n(int i11) {
        this.f97418g = i11;
    }

    /* renamed from: o */
    public final void m102659o(boolean z11) {
        this.f97417f = z11;
    }

    /* renamed from: p */
    public final void m102660p(int i11) {
        this.f97419h = i11;
    }

    /* renamed from: q */
    public final void m102661q() {
        List list = this.f97413b;
        final b bVar = b.f97421q;
        AbstractC25376w.m131534w(list, new Comparator() { // from class: gw.b0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m102649r;
                m102649r = C19617c0.m102649r(InterfaceC18509p.this, obj, obj2);
                return m102649r;
            }
        });
    }
}
