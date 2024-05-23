package fj;

import ae.C0757b;
import ae.C0766k;
import ag0.AbstractC0837p0;
import ag0.C0804b;
import ag0.C0815e1;
import be0.C2776a;
import be0.C2778c;
import be0.C2785j;
import be0.C2786k;
import bh.C2799a;
import com.zing.zalo.common.chat.label.C7860a;
import com.zing.zalo.data.chat.model.tabmessage.Conversation;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.p062db.C7956b;
import com.zing.zalo.p062db.C7958c;
import com.zing.zalo.p062db.C7959d;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.p077ui.chat.C11318b;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalocore.CoreUtility;
import d60.C17797f;
import dj.C17945a0;
import eg.C18425b;
import eg0.AbstractC18428c;
import eg0.AbstractC18429d;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19051f0;
import gg0.AbstractC19444a;
import gm.C19497h;
import gm.C19498i;
import gw.AbstractC19656s0;
import gw.C19636i1;
import gw.C19639k;
import gw.C19666x0;
import gw.C19669z;
import hm.C20092b;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import i60.C20350p;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import mg.C23288a;
import mm0.AbstractC23350e;
import on0.AbstractC24342w;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p019aj.C0872f;
import p019aj.C0876j;
import p056cj.C3533a;
import p056cj.C3535c;
import p056cj.C3543k;
import p056cj.C3546n;
import p056cj.InterfaceC3534b;
import p111du.AbstractC18069a;
import p130eh.C18431b;
import p132ej.C18451m;
import p173fz.C19172a;
import p186gj.C19458b;
import p186gj.C19460d;
import p186gj.C19461e;
import p212hj.AbstractC20070a;
import p212hj.AbstractC20071b;
import p221hy.C20166b;
import p221hy.InterfaceC20165a;
import p248iy.AbstractC20887g;
import p296kc.C21654a;
import p304ks.C21927m;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p361nb.C23648e;
import p363nh.C23744a;
import p392oh.C24261h;
import p392oh.C24265l;
import p405ov.C24559a;
import p424pj.C24774a;
import p454qn.AbstractC25384a;
import p577vj.C28266a;
import p645xh.C29628e;
import p716zh.C31832a;
import p716zh.C31837a4;
import p716zh.C31986k3;
import ph.C24749b;
import ph.C24751d;
import ph.C24752e;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.C24860q;
import pm0.InterfaceC24854k;
import qm0.AbstractC25368s;
import vg.C28023b6;
import wd0.C28930j;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* renamed from: fj.w */
/* loaded from: classes3.dex */
public final class C18980w {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final C0876j f94741a;

    /* renamed from: b */
    private final C19458b f94742b;

    /* renamed from: c */
    private final C19461e f94743c;

    /* renamed from: d */
    private final C19460d f94744d;

    /* renamed from: e */
    private final C18983z f94745e;

    /* renamed from: f */
    private final InterfaceC24854k f94746f;

    /* renamed from: g */
    private int f94747g;

    /* renamed from: h */
    private int f94748h;

    /* renamed from: fj.w$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: fj.w$b */
    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: p */
        public static final b f94749p = new b("SOCKET", 0);

        /* renamed from: q */
        public static final b f94750q = new b("FIREBASE", 1);

        /* renamed from: r */
        public static final b f94751r = new b("HTTP", 2);

        /* renamed from: s */
        private static final /* synthetic */ b[] f94752s;

        /* renamed from: t */
        private static final /* synthetic */ InterfaceC30165a f94753t;

        static {
            b[] m99613b = m99613b();
            f94752s = m99613b;
            f94753t = AbstractC30166b.m148796a(m99613b);
        }

        private b(String str, int i11) {
        }

        /* renamed from: b */
        private static final /* synthetic */ b[] m99613b() {
            return new b[]{f94749p, f94750q, f94751r};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f94752s.clone();
        }
    }

    /* renamed from: fj.w$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC20094a {
        c() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "error_message");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("ackSeenOfflinePC(). ");
            sb2.append(c20096c);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, "entity");
        }
    }

    /* renamed from: fj.w$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC20094a {
        d() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "error_message");
            AbstractC20110a.f98889a.mo104548a("ChatPacketHandler getLastSeenMessageError: " + c20096c, new Object[0]);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            boolean m127149O;
            AbstractC19074t.m100208f(obj, "entity");
            AbstractC20110a.f98889a.mo104548a("ChatPacketHandler getLastSeenMessageSuccess: " + obj, new Object[0]);
            try {
                JSONObject jSONObject = new JSONObject(obj.toString());
                JSONArray optJSONArray = jSONObject.optJSONArray("data");
                if (optJSONArray == null) {
                    return;
                }
                int length = optJSONArray.length();
                for (int i11 = 0; i11 < length; i11++) {
                    String obj2 = optJSONArray.get(i11).toString();
                    m127149O = AbstractC24342w.m127149O(obj2, "evict", false, 2, null);
                    if (!m127149O) {
                        C18980w.this.m99603I(obj2, false);
                    }
                }
                C18980w.this.m99551Q(jSONObject);
            } catch (Exception e11) {
                AbstractC23350e.m122776f("ChatPacketHandler", e11);
            }
        }
    }

    /* renamed from: fj.w$e */
    /* loaded from: classes3.dex */
    static final class e extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final e f94755q = new e();

        e() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C28930j mo12V4() {
            return AbstractC23306f.m120670h1();
        }
    }

    public C18980w(C0876j c0876j, C19458b c19458b, C19461e c19461e, C19460d c19460d, C18983z c18983z) {
        InterfaceC24854k m129210a;
        AbstractC19074t.m100208f(c0876j, "messageRepo");
        AbstractC19074t.m100208f(c19458b, "messageProcessor");
        AbstractC19074t.m100208f(c19461e, "undoDeleteMsgProcessor");
        AbstractC19074t.m100208f(c19460d, "specialMsgProcessor");
        AbstractC19074t.m100208f(c18983z, "sendAckManager");
        this.f94741a = c0876j;
        this.f94742b = c19458b;
        this.f94743c = c19461e;
        this.f94744d = c19460d;
        this.f94745e = c18983z;
        m129210a = AbstractC24856m.m129210a(e.f94755q);
        this.f94746f = m129210a;
        this.f94747g = -1;
        this.f94748h = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A */
    public static final void m99542A(String str, C18980w c18980w, boolean z11) {
        AbstractC19074t.m100208f(str, "$data");
        AbstractC19074t.m100208f(c18980w, "this$0");
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optInt("evict") >= 1) {
                AbstractC23306f.m120628W().m101508a(new C2776a.a(true));
            }
            C31832a c31832a = new C31832a(jSONObject, true);
            c18980w.m99588p0(c31832a);
            C29628e.m147249E0().m147278g1(c31832a, z11);
        } catch (JSONException e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C */
    public static final void m99543C(String str, C18980w c18980w) {
        AbstractC19074t.m100208f(str, "$data");
        AbstractC19074t.m100208f(c18980w, "this$0");
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optInt("evict") >= 1) {
                AbstractC23306f.m120628W().m101508a(new C2776a.a(true));
            }
            C31832a c31832a = new C31832a(jSONObject, true);
            c18980w.m99590q0(c31832a);
            C29628e.m147249E0().m147279h1(c31832a);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatPacketHandler", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E */
    public static final void m99544E(String str, C18980w c18980w) {
        AbstractC19074t.m100208f(str, "$data");
        AbstractC19074t.m100208f(c18980w, "this$0");
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optInt("evict") >= 1) {
                AbstractC23306f.m120628W().m101508a(new C2776a.a(false));
            }
            C31832a c31832a = new C31832a(jSONObject, false);
            c18980w.m99592r0(c31832a);
            C29628e.m147249E0().m147276e1(c31832a);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatPacketHandler", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: H */
    public static final void m99545H(String str, C18980w c18980w) {
        AbstractC19074t.m100208f(str, "$data");
        AbstractC19074t.m100208f(c18980w, "this$0");
        TreeSet treeSet = new TreeSet();
        ArrayList m96097p = AbstractC18069a.m96097p(str, "userIds");
        if (m96097p != null) {
            Iterator it = m96097p.iterator();
            while (it.hasNext()) {
                treeSet.add((String) it.next());
            }
        }
        ArrayList m96097p2 = AbstractC18069a.m96097p(str, "groupIds");
        if (m96097p2 != null) {
            Iterator it2 = m96097p2.iterator();
            while (it2.hasNext()) {
                treeSet.add("group_" + ((String) it2.next()));
            }
        }
        c18980w.m99596v().m101509a(new C28930j.b(treeSet, true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J */
    public static final void m99546J(int i11, C18980w c18980w, JSONArray jSONArray, boolean z11, JSONObject jSONObject) {
        String str;
        String valueOf;
        AbstractC19074t.m100208f(c18980w, "this$0");
        AbstractC19074t.m100208f(jSONObject, "$jsonObject");
        try {
            try {
            } catch (Exception e11) {
                AbstractC23350e.m122776f("ChatPacketHandler", e11);
                if (!z11) {
                    return;
                }
            }
            if (i11 == 3) {
                AbstractC19074t.m100205c(jSONArray);
                c18980w.m99597w(jSONArray, z11);
                if (z11) {
                    c18980w.m99595t(i11, jSONArray);
                    return;
                }
                return;
            }
            HashSet hashSet = new HashSet();
            int length = jSONArray.length();
            boolean z12 = false;
            for (int i12 = 0; i12 < length; i12++) {
                try {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i12);
                    long optLong = jSONObject2.optLong("id");
                    long optLong2 = jSONObject2.optLong("msgId");
                    if (optLong != 0 && optLong2 != 0) {
                        if (i11 != 1) {
                            if (i11 != 2) {
                                valueOf = "";
                            } else {
                                valueOf = "group_" + optLong;
                            }
                        } else {
                            valueOf = String.valueOf(optLong);
                        }
                        if (valueOf.length() != 0) {
                            C3533a m2606G = c18980w.f94741a.m2606G(valueOf);
                            if (m2606G != null && m2606G.m17912g() <= optLong2) {
                                C28023b6.m141250h0().m141310R(valueOf, !C11318b.Companion.m60525a().m60516k(valueOf), false, false);
                                hashSet.add(valueOf);
                                C23744a.Companion.m124119a().m124116d(150, valueOf);
                                C19666x0.Companion.m103117a().m103111h(valueOf, optLong2);
                            } else {
                                c18980w.m99605L(valueOf, optLong2);
                            }
                            C19636i1.Companion.m102800a().m102773l(valueOf, optLong2);
                        }
                    }
                } catch (Exception e12) {
                    AbstractC23350e.m122776f("ChatPacketHandler", e12);
                }
            }
            if (!hashSet.isEmpty()) {
                C7860a m40303b = C7860a.Companion.m40303b();
                String[] strArr = (String[]) hashSet.toArray(new String[0]);
                m40303b.m40289k0((String[]) Arrays.copyOf(strArr, strArr.length));
                c18980w.m99596v().m101509a(new C28930j.b(hashSet, true));
            }
            int optInt = jSONObject.optInt("evict");
            if (C19172a.m100600k("unread_msg@enable_pull_last_seen", 0) == 1) {
                z12 = true;
            }
            if (optInt == 1 && z12) {
                C19669z.Companion.m103232a().m103189A(i11);
                List m102743C = AbstractC23306f.m120606O1().m102743C(i11);
                JSONObject jSONObject3 = new JSONObject();
                if (i11 == 1) {
                    str = "11";
                } else {
                    str = "group";
                }
                jSONObject3.put("entry_point_" + str, 1);
                String jSONObject4 = jSONObject3.toString();
                AbstractC19074t.m100207e(jSONObject4, "toString(...)");
                c18980w.m99610u(m102743C, jSONObject4);
            }
            if (!z11) {
                return;
            }
            c18980w.m99595t(i11, jSONArray);
        } catch (Throwable th2) {
            if (z11) {
                c18980w.m99595t(i11, jSONArray);
            }
            throw th2;
        }
    }

    /* renamed from: M */
    private final void m99547M(b bVar, int i11) {
        int i12 = 0;
        this.f94747g = 0;
        if (bVar == b.f94750q) {
            C20166b.a aVar = C20166b.Companion;
            if (aVar.m105162b().m105152d() == InterfaceC20165a.a.f99531p || aVar.m105162b().m105152d() != InterfaceC20165a.a.f99532q) {
                i12 = 1;
            } else {
                i12 = 2;
            }
        } else if (bVar == b.f94751r) {
            i12 = 4;
        } else if (!AbstractC20070a.m104316f(i11)) {
            if (AbstractC20070a.m104315e(i11)) {
                i12 = 3;
            } else {
                i12 = -1;
            }
        }
        this.f94748h = i12;
    }

    /* renamed from: N */
    private final boolean m99548N(String str) {
        if (!AbstractC19074t.m100204b(str, "chat.undo") && !AbstractC19074t.m100204b(str, "chat.delete")) {
            return false;
        }
        return true;
    }

    /* renamed from: O */
    private final boolean m99549O(String str) {
        try {
            return C11318b.Companion.m60525a().m60517l(str);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
            return false;
        }
    }

    /* renamed from: P */
    private final void m99550P(Exception exc, String str, long j11) {
        AbstractC20887g.m109232j(str, 15001, exc.toString(), System.currentTimeMillis() - j11, 15000, CoreUtility.f89236l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Q */
    public final void m99551Q(JSONObject jSONObject) {
        JSONArray optJSONArray = jSONObject.optJSONArray("data");
        if (optJSONArray == null) {
            return;
        }
        int length = optJSONArray.length();
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < length; i15++) {
            Object obj = optJSONArray.get(i15);
            AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type org.json.JSONObject");
            JSONObject jSONObject2 = (JSONObject) obj;
            int optInt = jSONObject2.optInt(ZinstantMetaConstant.IMPRESSION_META_TYPE);
            JSONArray optJSONArray2 = jSONObject2.optJSONArray("seens");
            if (optJSONArray2 == null) {
                break;
            }
            if (optInt == 1) {
                i12 += optJSONArray2.length();
            } else {
                i14 += optJSONArray2.length();
            }
            int length2 = optJSONArray2.length();
            for (int i16 = 0; i16 < length2; i16++) {
                Object obj2 = optJSONArray2.get(i16);
                AbstractC19074t.m100206d(obj2, "null cannot be cast to non-null type org.json.JSONObject");
                JSONObject jSONObject3 = (JSONObject) obj2;
                String obj3 = jSONObject3.get("id").toString();
                if (optInt == 2) {
                    obj3 = "group_" + obj3;
                }
                Object obj4 = jSONObject3.get("msgId");
                AbstractC19074t.m100206d(obj4, "null cannot be cast to non-null type kotlin.Long");
                long longValue = ((Long) obj4).longValue();
                C3533a m2606G = this.f94741a.m2606G(obj3);
                if (m2606G != null && m2606G.m17912g() <= longValue) {
                    if (optInt == 1) {
                        i11++;
                    } else {
                        i13++;
                    }
                }
            }
        }
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put("nThread11ClearUnread", i11);
        jSONObject4.put("nThread11Total", i12);
        jSONObject4.put("nThreadGroupClearUnread", i13);
        jSONObject4.put("nThreadGroupTotal", i14);
        C0815e1.m2075D().m2100V(new C23648e(60, "", 1, "pull_last_seen_message_response", "", jSONObject4.toString()), false);
    }

    /* renamed from: R */
    private final void m99552R(ArrayList arrayList, int i11, int i12, boolean z11, long j11) {
        Long l11;
        if (i11 != 1780) {
            if (i11 != 1782) {
                if (i11 != 1785) {
                    if (i11 != 1787) {
                        return;
                    }
                } else {
                    C24261h.Companion.m126656b().m126636J(arrayList);
                    return;
                }
            }
            if (i11 == 1787) {
                C24261h.Companion.m126656b().m126636J(arrayList);
            } else {
                C24261h.Companion.m126656b().m126637K(arrayList);
            }
            if (z11) {
                if (j11 <= 0 && arrayList.size() > 0 && (l11 = (Long) arrayList.get(arrayList.size() - 1)) != null) {
                    j11 = l11.longValue();
                }
                C29628e.m147249E0().m147282k1(i11, i12, j11);
                return;
            }
            return;
        }
        C24261h.Companion.m126656b().m126637K(arrayList);
    }

    /* renamed from: U */
    private final void m99553U(final String str, final long j11, Map map, final InterfaceC3534b interfaceC3534b, final boolean z11, final boolean z12, final boolean z13, final boolean z14, final int i11, final long j12, final boolean z15) {
        m99594s0();
        for (Map.Entry entry : map.entrySet()) {
            final String str2 = (String) entry.getKey();
            final List list = (List) entry.getValue();
            AbstractC18428c.m97659b(C23288a.f113033a, str2, 0, new Runnable() { // from class: fj.p
                @Override // java.lang.Runnable
                public final void run() {
                    C18980w.m99555W(z13, this, str2, list, str, interfaceC3534b, z11, j11, i11, j12, z12, z15, z14);
                }
            }, 2, null);
        }
    }

    /* renamed from: V */
    static /* synthetic */ void m99554V(C18980w c18980w, String str, long j11, Map map, InterfaceC3534b interfaceC3534b, boolean z11, boolean z12, boolean z13, boolean z14, int i11, long j12, boolean z15, int i12, Object obj) {
        long j13;
        boolean z16;
        if ((i12 & 512) != 0) {
            j13 = 0;
        } else {
            j13 = j12;
        }
        if ((i12 & 1024) != 0) {
            z16 = false;
        } else {
            z16 = z15;
        }
        c18980w.m99553U(str, j11, map, interfaceC3534b, z11, z12, z13, z14, i11, j13, z16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: W */
    public static final void m99555W(boolean z11, final C18980w c18980w, String str, List list, String str2, InterfaceC3534b interfaceC3534b, boolean z12, long j11, int i11, long j12, boolean z13, boolean z14, final boolean z15) {
        boolean z16;
        final int i12;
        int i13 = i11;
        AbstractC19074t.m100208f(c18980w, "this$0");
        AbstractC19074t.m100208f(str, "$threadId");
        AbstractC19074t.m100208f(list, "$listMsgPacket");
        AbstractC19074t.m100208f(str2, "$currentUserUid");
        AbstractC19074t.m100208f(interfaceC3534b, "$entry");
        if (z11 && c18980w.m99549O(str)) {
            z16 = true;
        } else {
            z16 = false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            final C3543k c3543k = (C3543k) it.next();
            AbstractC20071b.a aVar = AbstractC20071b.Companion;
            if (aVar.m104323b(c3543k.m18010c())) {
                arrayList.add(c3543k);
            } else {
                ArrayList arrayList2 = arrayList;
                m99583m0(c18980w, arrayList, str2, str, interfaceC3534b, z12, z16, j11, i11, j12, false, 512, null);
                if (AbstractC19074t.m100204b(c3543k.m18010c(), "chat.msg.update")) {
                    i12 = i11;
                    c18980w.m99577j0(j11, j12, z16, new Runnable() { // from class: fj.t
                        @Override // java.lang.Runnable
                        public final void run() {
                            C18980w.m99556X(C18980w.this, c3543k, i12);
                        }
                    });
                } else {
                    i12 = i11;
                    if (aVar.m104322a(c3543k.m18010c())) {
                        c18980w.m99577j0(j11, j12, z16, new Runnable() { // from class: fj.u
                            @Override // java.lang.Runnable
                            public final void run() {
                                C18980w.m99557Y(C3543k.this);
                            }
                        });
                    } else if (c18980w.m99548N(c3543k.m18010c())) {
                        c18980w.m99573h0(c3543k.m18008a(), str, z13, z12, z16, new Runnable() { // from class: fj.v
                            @Override // java.lang.Runnable
                            public final void run() {
                                C18980w.m99558Z(C3543k.this, i12, c18980w, z15);
                            }
                        });
                    } else if (j11 > 0) {
                        C18983z.m99624l(c18980w.f94745e, j11, 0, z16, j12, 2, null);
                    }
                }
                i13 = i12;
                arrayList = arrayList2;
            }
        }
        c18980w.m99581l0(arrayList, str2, str, interfaceC3534b, z12, z16, j11, i11, j12, z14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: X */
    public static final void m99556X(C18980w c18980w, C3543k c3543k, int i11) {
        AbstractC19074t.m100208f(c18980w, "this$0");
        AbstractC19074t.m100208f(c3543k, "$packet");
        c18980w.f94744d.m101769c(c3543k.m18009b(), c3543k.m18010c(), i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Y */
    public static final void m99557Y(C3543k c3543k) {
        AbstractC19074t.m100208f(c3543k, "$packet");
        new C2799a().m13512t(c3543k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Z */
    public static final void m99558Z(C3543k c3543k, int i11, C18980w c18980w, boolean z11) {
        AbstractC19074t.m100208f(c3543k, "$packet");
        AbstractC19074t.m100208f(c18980w, "this$0");
        String m18010c = c3543k.m18010c();
        if (AbstractC19074t.m100204b(m18010c, "chat.undo")) {
            C17945a0 c17945a0 = new C17945a0(c3543k.m18009b(), 36, c3543k.m18010c(), i11, false);
            if (AbstractC23304d.m120544o()) {
                C19639k.f97504a.m102874b(c17945a0, c18980w.f94747g, c18980w.f94748h);
            }
            c18980w.f94743c.m101779h(c17945a0, z11);
            return;
        }
        if (AbstractC19074t.m100204b(m18010c, "chat.delete")) {
            C17945a0 c17945a02 = new C17945a0(c3543k.m18009b(), -101, c3543k.m18010c(), i11, false);
            if (AbstractC23304d.m120544o()) {
                C19639k.f97504a.m102874b(c17945a02, c18980w.f94747g, c18980w.f94748h);
            }
            c18980w.f94743c.m101778d(c17945a02, z11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00c3 A[Catch: all -> 0x00af, Exception -> 0x00b5, TryCatch #4 {Exception -> 0x00b5, all -> 0x00af, blocks: (B:7:0x0031, B:10:0x0043, B:13:0x0080, B:15:0x008a, B:17:0x009a, B:19:0x00c3, B:23:0x00d6, B:25:0x00f7, B:26:0x0109, B:28:0x010f, B:30:0x0117, B:31:0x011a, B:34:0x012b, B:36:0x0139, B:37:0x0148, B:39:0x0158, B:41:0x016c, B:42:0x0176, B:43:0x0180, B:45:0x0186, B:46:0x01a0, B:48:0x01ab, B:50:0x01bd, B:52:0x01cd, B:53:0x01e5, B:55:0x01ea, B:58:0x01f2, B:60:0x01fe, B:62:0x0204, B:63:0x020a, B:65:0x0214, B:67:0x0220, B:69:0x0226, B:70:0x022c, B:73:0x0238, B:74:0x023f, B:77:0x0250, B:79:0x028e, B:81:0x029e, B:83:0x02a4, B:85:0x02aa, B:87:0x02bc, B:89:0x02ce, B:91:0x02e0, B:95:0x02f9, B:96:0x0305, B:97:0x0308, B:99:0x031a, B:101:0x0326, B:103:0x0332, B:104:0x0340, B:106:0x0363, B:107:0x036b, B:109:0x0377, B:110:0x037f, B:111:0x03ea, B:114:0x038d, B:119:0x039c, B:121:0x03c1, B:122:0x03c9, B:124:0x03d5, B:125:0x03dd, B:129:0x0190, B:134:0x0401, B:135:0x0414, B:137:0x0424, B:139:0x0432, B:140:0x043a, B:167:0x0455, B:168:0x0463, B:170:0x0469, B:173:0x0481, B:175:0x0495, B:178:0x049d, B:180:0x04ad, B:182:0x04b7, B:183:0x04c5, B:188:0x04c8, B:189:0x04d7, B:191:0x04dd, B:192:0x04f0, B:194:0x04f6, B:195:0x0509, B:197:0x050f, B:201:0x051e, B:202:0x052b, B:204:0x0531, B:205:0x0544, B:207:0x054a, B:208:0x055d, B:210:0x0563, B:214:0x0572), top: B:6:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d6 A[Catch: all -> 0x00af, Exception -> 0x00b5, TryCatch #4 {Exception -> 0x00b5, all -> 0x00af, blocks: (B:7:0x0031, B:10:0x0043, B:13:0x0080, B:15:0x008a, B:17:0x009a, B:19:0x00c3, B:23:0x00d6, B:25:0x00f7, B:26:0x0109, B:28:0x010f, B:30:0x0117, B:31:0x011a, B:34:0x012b, B:36:0x0139, B:37:0x0148, B:39:0x0158, B:41:0x016c, B:42:0x0176, B:43:0x0180, B:45:0x0186, B:46:0x01a0, B:48:0x01ab, B:50:0x01bd, B:52:0x01cd, B:53:0x01e5, B:55:0x01ea, B:58:0x01f2, B:60:0x01fe, B:62:0x0204, B:63:0x020a, B:65:0x0214, B:67:0x0220, B:69:0x0226, B:70:0x022c, B:73:0x0238, B:74:0x023f, B:77:0x0250, B:79:0x028e, B:81:0x029e, B:83:0x02a4, B:85:0x02aa, B:87:0x02bc, B:89:0x02ce, B:91:0x02e0, B:95:0x02f9, B:96:0x0305, B:97:0x0308, B:99:0x031a, B:101:0x0326, B:103:0x0332, B:104:0x0340, B:106:0x0363, B:107:0x036b, B:109:0x0377, B:110:0x037f, B:111:0x03ea, B:114:0x038d, B:119:0x039c, B:121:0x03c1, B:122:0x03c9, B:124:0x03d5, B:125:0x03dd, B:129:0x0190, B:134:0x0401, B:135:0x0414, B:137:0x0424, B:139:0x0432, B:140:0x043a, B:167:0x0455, B:168:0x0463, B:170:0x0469, B:173:0x0481, B:175:0x0495, B:178:0x049d, B:180:0x04ad, B:182:0x04b7, B:183:0x04c5, B:188:0x04c8, B:189:0x04d7, B:191:0x04dd, B:192:0x04f0, B:194:0x04f6, B:195:0x0509, B:197:0x050f, B:201:0x051e, B:202:0x052b, B:204:0x0531, B:205:0x0544, B:207:0x054a, B:208:0x055d, B:210:0x0563, B:214:0x0572), top: B:6:0x0031 }] */
    /* renamed from: b0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m99561b0(ArrayList arrayList, boolean z11, int i11, int i12, boolean z12, long j11) {
        Exception exc;
        boolean z13;
        String str;
        Iterator it;
        ArrayList arrayList2;
        HashMap hashMap;
        ArrayList arrayList3;
        HashMap hashMap2;
        int m131504l;
        ArrayList arrayList4;
        HashMap hashMap3;
        boolean z14;
        ArrayList arrayList5;
        HashMap hashMap4;
        HashMap hashMap5;
        C28266a m128554b;
        C28266a m128554b2;
        C28266a m102752J;
        C18980w c18980w = this;
        String str2 = "<get-values>(...)";
        ArrayList arrayList6 = new ArrayList();
        HashMap hashMap6 = new HashMap();
        try {
            ArrayList arrayList7 = new ArrayList();
            HashMap hashMap7 = new HashMap();
            HashMap hashMap8 = new HashMap();
            HashMap hashMap9 = new HashMap();
            HashMap hashMap10 = new HashMap();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                try {
                    Object next = it2.next();
                    AbstractC19074t.m100207e(next, "next(...)");
                    final C3546n c3546n = (C3546n) next;
                    if (c3546n.m18032i()) {
                        String str3 = CoreUtility.f89233i + c3546n.m18024a() + c3546n.m18030g();
                        AbstractC19074t.m100207e(str3, "toString(...)");
                        if (!c18980w.f94741a.m2612O(str3)) {
                            try {
                                if (!hashMap6.containsKey(str3)) {
                                    z13 = false;
                                    if (!hashMap8.containsKey(c3546n.m18027d()) || (m102752J = C19636i1.Companion.m102800a().m102752J(c3546n.m18027d())) == null) {
                                        str = str2;
                                        it = it2;
                                    } else {
                                        it = it2;
                                        str = str2;
                                        hashMap8.put(c3546n.m18027d(), new C24749b(m102752J, null, false));
                                        C24848g0 c24848g0 = C24848g0.f119245a;
                                    }
                                    if (!z13) {
                                        arrayList6.add(Long.valueOf(c3546n.m18025b()));
                                        hashMap = hashMap6;
                                        arrayList3 = arrayList7;
                                        hashMap2 = hashMap7;
                                    } else {
                                        hashMap6.put(str3, new C24860q(Long.valueOf(c3546n.m18025b()), c3546n.m18027d()));
                                        arrayList7.add(c3546n.m18030g());
                                        C24752e m18028e = c3546n.m18028e();
                                        if (m18028e != null) {
                                            boolean m128605s = m18028e.m128586b().m128605s();
                                            Iterator it3 = m18028e.m128585a().iterator();
                                            int i13 = 0;
                                            boolean z15 = false;
                                            while (it3.hasNext()) {
                                                Object next2 = it3.next();
                                                int i14 = i13 + 1;
                                                if (i13 < 0) {
                                                    AbstractC25368s.m131509q();
                                                }
                                                MessageId messageId = (MessageId) next2;
                                                m131504l = AbstractC25368s.m131504l(m18028e.m128585a());
                                                boolean z16 = i13 == m131504l;
                                                C17945a0 m2635r = AbstractC23306f.m120584H0().m2635r(messageId);
                                                Object obj = hashMap7.get(messageId);
                                                if (obj == null) {
                                                    arrayList4 = arrayList7;
                                                    HashMap hashMap11 = new HashMap();
                                                    hashMap7.put(messageId, hashMap11);
                                                    obj = hashMap11;
                                                } else {
                                                    arrayList4 = arrayList7;
                                                }
                                                HashMap hashMap12 = (HashMap) obj;
                                                Iterator it4 = it3;
                                                String m18030g = c3546n.m18030g();
                                                Object obj2 = hashMap12.get(m18030g);
                                                if (obj2 == null) {
                                                    z14 = z15;
                                                    hashMap3 = hashMap6;
                                                    C24751d m126632A = C24261h.Companion.m126656b().m126632A(c3546n.m18027d(), messageId);
                                                    if (m126632A == null) {
                                                        m126632A = new C24751d(messageId, new ArrayList());
                                                    }
                                                    hashMap12.put(m18030g, m126632A);
                                                    obj2 = m126632A;
                                                } else {
                                                    hashMap3 = hashMap6;
                                                    z14 = z15;
                                                }
                                                C24751d c24751d = (C24751d) obj2;
                                                if (m128605s) {
                                                    c24751d.m128577u(m18028e.m128586b());
                                                    z15 = z14;
                                                } else {
                                                    z15 = c24751d.m128576t(Integer.parseInt(c3546n.m18030g()), m18028e.m128586b());
                                                }
                                                C24261h.b bVar = C24261h.Companion;
                                                bVar.m126656b().m126644j(c24751d);
                                                if (m2635r != null) {
                                                    boolean m95032V6 = m2635r.m95032V6();
                                                    hashMap4 = hashMap7;
                                                    arrayList5 = arrayList6;
                                                    if (m2635r.m94877E3() != c24751d.m128575s() && C24265l.Companion.m126709b().m126699o().m128551i()) {
                                                        m2635r.m94873Da(c24751d.m128575s());
                                                        C7956b.Companion.m41573b().m41558s0(c3546n.m18027d(), messageId, m2635r.m94877E3());
                                                    }
                                                    m2635r.m95111d9();
                                                    if (m95032V6 && !c3546n.m18033j()) {
                                                        if (m128605s) {
                                                            C24749b c24749b = (C24749b) hashMap8.get(c3546n.m18027d());
                                                            if (AbstractC19074t.m100204b((c24749b == null || (m128554b2 = c24749b.m128554b()) == null) ? null : m128554b2.m142388g(), c3546n.m18030g())) {
                                                                C24749b c24749b2 = (C24749b) hashMap8.get(c3546n.m18027d());
                                                                if (AbstractC19074t.m100204b((c24749b2 == null || (m128554b = c24749b2.m128554b()) == null) ? null : m128554b.m142383b(), m2635r.m95029V3())) {
                                                                    if (z16) {
                                                                        hashMap8.remove(c3546n.m18027d());
                                                                    }
                                                                    bVar.m126656b().m126646l(c3546n.m18027d(), c3546n.m18025b());
                                                                }
                                                            }
                                                        } else {
                                                            String m18030g2 = c3546n.m18030g();
                                                            String m18029f = c3546n.m18029f();
                                                            MessageId m95029V3 = m2635r.m95029V3();
                                                            AbstractC19074t.m100207e(m95029V3, "getMessageId(...)");
                                                            C28266a c28266a = new C28266a(m18030g2, m18029f, m95029V3, m2635r.mo95213o(), c3546n.m18025b(), m18028e.m128586b().m128595h(), m18028e.m128586b().m128599l());
                                                            C24749b c24749b3 = (C24749b) hashMap8.get(c3546n.m18027d());
                                                            if (c24749b3 != null) {
                                                                if (c24749b3.m128554b().m142385d() <= c3546n.m18025b()) {
                                                                    boolean m128553a = c24749b3.m128553a();
                                                                    if (!m128553a) {
                                                                        m128553a = c3546n.m18026c() && !(AbstractC19074t.m100204b(c24749b3.m128554b().m142388g(), c3546n.m18030g()) && m18028e.m128585a().contains(c24749b3.m128554b().m142383b()) && c24749b3.m128554b().m142386e() == m18028e.m128586b().m128599l() && AbstractC19074t.m100204b(c24749b3.m128554b().m142384c(), m18028e.m128586b().m128595h()));
                                                                    }
                                                                    hashMap8.put(c3546n.m18027d(), new C24749b(c28266a, m2635r, m128553a));
                                                                }
                                                                C24848g0 c24848g02 = C24848g0.f119245a;
                                                            } else {
                                                                hashMap8.put(c3546n.m18027d(), new C24749b(c28266a, m2635r, c3546n.m18026c()));
                                                            }
                                                        }
                                                    }
                                                    if (m128605s) {
                                                        HashMap hashMap13 = (HashMap) hashMap9.get(c3546n.m18027d());
                                                        if (hashMap13 != null && (hashMap5 = (HashMap) hashMap13.get(c3546n.m18030g())) != null) {
                                                        }
                                                        C20350p c20350p = new C20350p(c3546n.m18027d(), m18028e.m128585a(), null, false, false, 28, null);
                                                        String m18027d = c3546n.m18027d();
                                                        Object obj3 = hashMap10.get(m18027d);
                                                        if (obj3 == null) {
                                                            obj3 = new HashMap();
                                                            hashMap10.put(m18027d, obj3);
                                                        }
                                                        Map map = (Map) obj3;
                                                        String m18030g3 = c3546n.m18030g();
                                                        Object obj4 = map.get(m18030g3);
                                                        if (obj4 == null) {
                                                            obj4 = new HashMap();
                                                            map.put(m18030g3, obj4);
                                                        }
                                                        ((Map) obj4).put(m2635r.m95029V3().toString(), c20350p);
                                                    } else {
                                                        C20350p c20350p2 = new C20350p(c3546n.m18027d(), m18028e.m128585a(), m18028e.m128586b().m128595h(), !c3546n.m18033j() && (z15 || !z11), c3546n.m18033j());
                                                        String m18027d2 = c3546n.m18027d();
                                                        Object obj5 = hashMap9.get(m18027d2);
                                                        if (obj5 == null) {
                                                            obj5 = new HashMap();
                                                            hashMap9.put(m18027d2, obj5);
                                                        }
                                                        Map map2 = (Map) obj5;
                                                        String m18030g4 = c3546n.m18030g();
                                                        Object obj6 = map2.get(m18030g4);
                                                        if (obj6 == null) {
                                                            obj6 = new HashMap();
                                                            map2.put(m18030g4, obj6);
                                                        }
                                                        ((Map) obj6).put(m2635r.m95029V3().toString(), c20350p2);
                                                    }
                                                    C24848g0 c24848g03 = C24848g0.f119245a;
                                                } else {
                                                    arrayList5 = arrayList6;
                                                    hashMap4 = hashMap7;
                                                }
                                                it3 = it4;
                                                i13 = i14;
                                                arrayList7 = arrayList4;
                                                hashMap7 = hashMap4;
                                                arrayList6 = arrayList5;
                                                hashMap6 = hashMap3;
                                            }
                                            arrayList2 = arrayList6;
                                            hashMap = hashMap6;
                                            arrayList3 = arrayList7;
                                            hashMap2 = hashMap7;
                                            C24848g0 c24848g04 = C24848g0.f119245a;
                                        } else {
                                            arrayList2 = arrayList6;
                                            hashMap = hashMap6;
                                            arrayList3 = arrayList7;
                                            hashMap2 = hashMap7;
                                        }
                                        C11318b.b bVar2 = C11318b.Companion;
                                        if (!bVar2.m60525a().m60515j(c3546n.m18027d()) && bVar2.m60525a().m60515j(c3546n.m18030g())) {
                                            AbstractC19444a.m101697e(new Runnable() { // from class: fj.f
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    C18980w.m99563c0(C3546n.this);
                                                }
                                            });
                                        }
                                        arrayList6 = arrayList2;
                                        arrayList6.add(Long.valueOf(c3546n.m18025b()));
                                    }
                                    c18980w = this;
                                    str2 = str;
                                    it2 = it;
                                    arrayList7 = arrayList3;
                                    hashMap7 = hashMap2;
                                    hashMap6 = hashMap;
                                }
                            } catch (Exception e11) {
                                exc = e11;
                                AbstractC23350e.m122778h(exc);
                                return;
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        z13 = true;
                        if (hashMap8.containsKey(c3546n.m18027d())) {
                        }
                        str = str2;
                        it = it2;
                        if (!z13) {
                        }
                        c18980w = this;
                        str2 = str;
                        it2 = it;
                        arrayList7 = arrayList3;
                        hashMap7 = hashMap2;
                        hashMap6 = hashMap;
                    }
                } catch (Exception e12) {
                    e = e12;
                    exc = e;
                    AbstractC23350e.m122778h(exc);
                    return;
                } catch (Throwable th3) {
                    th = th3;
                    throw th;
                }
            }
            String str4 = str2;
            HashMap hashMap14 = hashMap6;
            final HashMap hashMap15 = hashMap7;
            for (Map.Entry entry : hashMap8.entrySet()) {
                final String str5 = (String) entry.getKey();
                final C24749b c24749b4 = (C24749b) entry.getValue();
                final C17945a0 m128555c = c24749b4.m128555c();
                if (m128555c != null) {
                    C24261h.b bVar3 = C24261h.Companion;
                    Long m126640N = bVar3.m126656b().m126640N(str5, c24749b4.m128554b());
                    if (AbstractC23309i.m122651zf() && c24749b4.m128553a() && ((m126640N == null || m126640N.longValue() < c24749b4.m128554b().m142385d()) && bVar3.m126656b().m126645k(str5))) {
                        AbstractC0837p0.Companion.m2236a().mo2040a(new Runnable() { // from class: fj.g
                            @Override // java.lang.Runnable
                            public final void run() {
                                C18980w.m99565d0(str5, c24749b4, m128555c);
                            }
                        });
                    }
                    C24848g0 c24848g05 = C24848g0.f119245a;
                }
            }
            Collection values = hashMap10.values();
            AbstractC19074t.m100207e(values, str4);
            Iterator it5 = values.iterator();
            while (it5.hasNext()) {
                Collection values2 = ((HashMap) it5.next()).values();
                AbstractC19074t.m100207e(values2, str4);
                Iterator it6 = values2.iterator();
                while (it6.hasNext()) {
                    Collection<C20350p> values3 = ((HashMap) it6.next()).values();
                    AbstractC19074t.m100207e(values3, str4);
                    for (final C20350p c20350p3 : values3) {
                        AbstractC19444a.m101697e(new Runnable() { // from class: fj.h
                            @Override // java.lang.Runnable
                            public final void run() {
                                C18980w.m99567e0(C20350p.this);
                            }
                        });
                    }
                }
            }
            Collection values4 = hashMap9.values();
            AbstractC19074t.m100207e(values4, str4);
            Iterator it7 = values4.iterator();
            while (it7.hasNext()) {
                Collection values5 = ((HashMap) it7.next()).values();
                AbstractC19074t.m100207e(values5, str4);
                Iterator it8 = values5.iterator();
                while (it8.hasNext()) {
                    Collection<C20350p> values6 = ((HashMap) it8.next()).values();
                    AbstractC19074t.m100207e(values6, str4);
                    for (final C20350p c20350p4 : values6) {
                        AbstractC19444a.m101697e(new Runnable() { // from class: fj.i
                            @Override // java.lang.Runnable
                            public final void run() {
                                C18980w.m99569f0(C20350p.this);
                            }
                        });
                    }
                }
            }
            C24261h.Companion.m126656b().m126651y().mo13474a(new Runnable() { // from class: fj.j
                @Override // java.lang.Runnable
                public final void run() {
                    C18980w.m99571g0(hashMap15);
                }
            });
            if (!arrayList6.isEmpty()) {
                for (Map.Entry entry2 : hashMap14.entrySet()) {
                    AbstractC19074t.m100205c(entry2);
                    String str6 = (String) entry2.getKey();
                    C24860q c24860q = (C24860q) entry2.getValue();
                    C0876j c0876j = this.f94741a;
                    AbstractC19074t.m100205c(str6);
                    C0876j.m2595N(c0876j, str6, ((Number) c24860q.m129215c()).longValue(), (String) c24860q.m129216d(), null, 8, null);
                }
                m99552R(arrayList6, i11, i12, z12, j11);
            }
        } catch (Exception e13) {
            e = e13;
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c0 */
    public static final void m99563c0(C3546n c3546n) {
        AbstractC19074t.m100208f(c3546n, "$this_apply");
        C23744a.Companion.m124119a().m124116d(4, c3546n.m18030g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d0 */
    public static final void m99565d0(String str, C24749b c24749b, C17945a0 c17945a0) {
        AbstractC19074t.m100208f(str, "$ownerId");
        AbstractC19074t.m100208f(c24749b, "$this_apply");
        AbstractC19074t.m100208f(c17945a0, "$chatContent");
        C24261h.Companion.m126656b().m126635G(str, Long.parseLong(c24749b.m128554b().m142388g()), c24749b.m128554b().m142387f(), c24749b.m128554b().m142386e(), c24749b.m128554b().m142384c(), c17945a0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e0 */
    public static final void m99567e0(C20350p c20350p) {
        AbstractC19074t.m100208f(c20350p, "$reactionEvent");
        C23744a.Companion.m124119a().m124116d(47, c20350p);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f0 */
    public static final void m99569f0(C20350p c20350p) {
        AbstractC19074t.m100208f(c20350p, "$reactionEvent");
        C23744a.Companion.m124119a().m124116d(47, c20350p);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g0 */
    public static final void m99571g0(HashMap hashMap) {
        AbstractC19074t.m100208f(hashMap, "$mapClassifyDataByMsgReacted");
        for (Map.Entry entry : hashMap.entrySet()) {
            MessageId messageId = (MessageId) entry.getKey();
            HashMap hashMap2 = (HashMap) entry.getValue();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Collection<C24751d> values = hashMap2.values();
            AbstractC19074t.m100207e(values, "<get-values>(...)");
            for (C24751d c24751d : values) {
                c24751d.m128578w();
                C24751d m128579x = c24751d.m128579x();
                if (m128579x.m128571o() > 0) {
                    arrayList.add(m128579x);
                }
                C24751d m128580y = c24751d.m128580y();
                if (m128580y.m128571o() > 0) {
                    arrayList2.add(m128580y);
                }
            }
            if (!arrayList.isEmpty()) {
                C24261h.Companion.m126656b().m126652z(C7958c.Companion.m41593b().m41588n(arrayList), true);
            }
            if (!arrayList2.isEmpty()) {
                C24261h.Companion.m126656b().m126652z(C7958c.Companion.m41593b().m41590q(messageId.m41048l(), arrayList2), false);
            }
        }
    }

    /* renamed from: h0 */
    private final void m99573h0(final C3533a c3533a, String str, final boolean z11, final boolean z12, final boolean z13, final Runnable runnable) {
        AbstractC18428c.m97659b(C23288a.f113033a, str, 0, new Runnable() { // from class: fj.l
            @Override // java.lang.Runnable
            public final void run() {
                C18980w.m99575i0(runnable, c3533a, this, z11, z12, z13);
            }
        }, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i0 */
    public static final void m99575i0(Runnable runnable, C3533a c3533a, C18980w c18980w, boolean z11, boolean z12, boolean z13) {
        AbstractC19074t.m100208f(runnable, "$task");
        AbstractC19074t.m100208f(c18980w, "this$0");
        try {
            try {
                runnable.run();
                if (c3533a == null) {
                    return;
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
                if (c3533a == null) {
                    return;
                }
            }
            c18980w.f94745e.m99625f(c3533a, z11, z12, z13);
        } catch (Throwable th2) {
            if (c3533a != null) {
                c18980w.f94745e.m99625f(c3533a, z11, z12, z13);
            }
            throw th2;
        }
    }

    /* renamed from: j0 */
    private final void m99577j0(final long j11, final long j12, final boolean z11, final Runnable runnable) {
        new Runnable() { // from class: fj.k
            @Override // java.lang.Runnable
            public final void run() {
                C18980w.m99579k0(runnable, j11, this, z11, j12);
            }
        }.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k0 */
    public static final void m99579k0(Runnable runnable, long j11, C18980w c18980w, boolean z11, long j12) {
        AbstractC19074t.m100208f(runnable, "$task");
        AbstractC19074t.m100208f(c18980w, "this$0");
        try {
            try {
                runnable.run();
                if (j11 <= 0) {
                    return;
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
                if (j11 <= 0) {
                    return;
                }
            }
            C18983z.m99624l(c18980w.f94745e, j11, 0, z11, j12, 2, null);
        } catch (Throwable th2) {
            if (j11 > 0) {
                C18983z.m99624l(c18980w.f94745e, j11, 0, z11, j12, 2, null);
            }
            throw th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0055, code lost:            if (r22 > 0) goto L18;     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0057, code lost:            r5 = r16.size();     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005e, code lost:            r15.f94745e.m99627k(r22, r5, r11.f94928p, r25);     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005d, code lost:            r5 = 0;     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007b, code lost:            if (r22 > 0) goto L18;     */
    /* renamed from: l0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m99581l0(final ArrayList arrayList, String str, String str2, InterfaceC3534b interfaceC3534b, boolean z11, boolean z12, long j11, int i11, long j12, boolean z13) {
        int i12;
        C23288a c23288a;
        Runnable runnable;
        if (!arrayList.isEmpty()) {
            final C19051f0 c19051f0 = new C19051f0();
            try {
                try {
                    if (AbstractC23304d.m120544o()) {
                        this.f94742b.m101763e(this.f94747g);
                        this.f94742b.m101764f(this.f94748h);
                    }
                    c19051f0.f94928p = this.f94742b.m101762d(str, str2, arrayList, interfaceC3534b, z11, z12, i11).m101757e();
                } catch (Exception e11) {
                    AbstractC20110a.f98889a.mo104552e(e11);
                    if (z13) {
                        c23288a = C23288a.f113033a;
                        runnable = new Runnable() { // from class: fj.m
                            @Override // java.lang.Runnable
                            public final void run() {
                                C18980w.m99585n0(C18980w.this, arrayList, c19051f0);
                            }
                        };
                    }
                }
                if (z13) {
                    c23288a = C23288a.f113033a;
                    runnable = new Runnable() { // from class: fj.m
                        @Override // java.lang.Runnable
                        public final void run() {
                            C18980w.m99585n0(C18980w.this, arrayList, c19051f0);
                        }
                    };
                    AbstractC18429d.m97660a(c23288a, runnable);
                    arrayList.clear();
                }
            } catch (Throwable th2) {
                if (!z13) {
                    if (j11 > 0) {
                        i12 = arrayList.size();
                    } else {
                        i12 = 0;
                    }
                    this.f94745e.m99627k(j11, i12, c19051f0.f94928p, j12);
                } else {
                    AbstractC18429d.m97660a(C23288a.f113033a, new Runnable() { // from class: fj.m
                        @Override // java.lang.Runnable
                        public final void run() {
                            C18980w.m99585n0(C18980w.this, arrayList, c19051f0);
                        }
                    });
                }
                throw th2;
            }
        }
    }

    /* renamed from: m0 */
    static /* synthetic */ void m99583m0(C18980w c18980w, ArrayList arrayList, String str, String str2, InterfaceC3534b interfaceC3534b, boolean z11, boolean z12, long j11, int i11, long j12, boolean z13, int i12, Object obj) {
        long j13;
        boolean z14;
        if ((i12 & 256) != 0) {
            j13 = 0;
        } else {
            j13 = j12;
        }
        if ((i12 & 512) != 0) {
            z14 = false;
        } else {
            z14 = z13;
        }
        c18980w.m99581l0(arrayList, str, str2, interfaceC3534b, z11, z12, j11, i11, j13, z14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n0 */
    public static final void m99585n0(C18980w c18980w, ArrayList arrayList, C19051f0 c19051f0) {
        AbstractC19074t.m100208f(c18980w, "this$0");
        AbstractC19074t.m100208f(arrayList, "$normalMsgBatching");
        AbstractC19074t.m100208f(c19051f0, "$finalIsSeen");
        C18983z c18983z = c18980w.f94745e;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C3533a m18008a = ((C3543k) it.next()).m18008a();
            if (m18008a != null) {
                arrayList2.add(m18008a);
            }
        }
        c18983z.m99626g(arrayList2, true, true, c19051f0.f94928p);
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x0214 A[LOOP:2: B:43:0x017c->B:68:0x0214, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0213 A[EDGE_INSN: B:69:0x0213->B:70:0x0213 BREAK  A[LOOP:2: B:43:0x017c->B:68:0x0214], SYNTHETIC] */
    /* renamed from: p0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m99588p0(C31832a c31832a) {
        long j11;
        int i11;
        C31832a.a aVar;
        HashMap hashMap;
        int i12;
        int i13;
        int i14;
        long m41045i;
        String str;
        int i15;
        int i16;
        List list;
        String str2;
        C18980w c18980w = this;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            Iterator it = c31832a.m152944a().iterator();
            while (it.hasNext()) {
                C31832a.a aVar2 = (C31832a.a) it.next();
                boolean m152950d = aVar2.m152950d();
                String m152949c = aVar2.m152949c();
                int m152947a = aVar2.m152947a();
                C0876j c0876j = c18980w.f94741a;
                AbstractC19074t.m100205c(m152949c);
                C3535c m2634q = c0876j.m2634q(m152949c);
                LinkedList linkedList = new LinkedList();
                int size = aVar2.m152948b().size();
                Iterator it2 = it;
                int i17 = 0;
                while (i17 < size) {
                    C31832a.b bVar = (C31832a.b) aVar2.m152948b().get(i17);
                    if (bVar.m152959i()) {
                        AbstractC19074t.m100205c(bVar);
                        linkedList.add(bVar);
                        j11 = currentTimeMillis;
                        hashMap = hashMap3;
                        i11 = size;
                        i12 = i17;
                        aVar = aVar2;
                    } else {
                        MessageId m152954d = bVar.m152954d();
                        i11 = size;
                        int m152956f = bVar.m152956f();
                        aVar = aVar2;
                        if (!AbstractC19074t.m100204b(CoreUtility.f89233i, String.valueOf(m152956f))) {
                            if (m152950d) {
                                i13 = 4;
                            } else {
                                i13 = 3;
                            }
                            if (m152954d != null) {
                                Map map = AbstractC23304d.f113401k;
                                j11 = currentTimeMillis;
                                try {
                                    Integer num = (Integer) map.get(Long.valueOf(m152954d.m41045i()));
                                    if ((num != null && i13 == num.intValue()) || !m152954d.m41052p()) {
                                        hashMap = hashMap3;
                                        i14 = m152956f;
                                        i12 = i17;
                                    } else {
                                        AbstractC19074t.m100207e(map, "messageStatesMap");
                                        map.put(Long.valueOf(m152954d.m41045i()), Integer.valueOf(i13));
                                        if (i13 == 4) {
                                            C19498i c19498i = (C19498i) hashMap3.get(Integer.valueOf(m152947a));
                                            if (c19498i == null) {
                                                c19498i = new C19498i();
                                                hashMap3.put(Integer.valueOf(m152947a), c19498i);
                                            }
                                            C19497h c19497h = new C19497h();
                                            hashMap = hashMap3;
                                            String str3 = CoreUtility.f89233i;
                                            AbstractC19074t.m100207e(str3, "currentUserUid");
                                            c19497h.f96814c = Integer.parseInt(str3);
                                            i14 = m152956f;
                                            i12 = i17;
                                            c19497h.f96813b = m152954d.m41045i();
                                            c19498i.m101942a(c19497h);
                                        } else {
                                            hashMap = hashMap3;
                                            i14 = m152956f;
                                            i12 = i17;
                                            C19498i c19498i2 = (C19498i) hashMap2.get(Integer.valueOf(m152947a));
                                            if (c19498i2 == null) {
                                                c19498i2 = new C19498i();
                                                hashMap2.put(Integer.valueOf(m152947a), c19498i2);
                                            }
                                            C19497h c19497h2 = new C19497h();
                                            String str4 = CoreUtility.f89233i;
                                            AbstractC19074t.m100207e(str4, "currentUserUid");
                                            c19497h2.f96814c = Integer.parseInt(str4);
                                            c19497h2.f96813b = m152954d.m41045i();
                                            c19498i2.m101942a(c19497h2);
                                        }
                                        C17945a0 m2635r = c18980w.f94741a.m2635r(m152954d);
                                        if (m2635r != null) {
                                            m41045i = m2635r.m94974P4();
                                        } else {
                                            m41045i = m152954d.m41045i();
                                        }
                                        if (m152950d) {
                                            C19636i1.Companion.m102800a().m102779o(m152949c, m41045i);
                                        } else {
                                            C19636i1.Companion.m102800a().m102777n(m152949c, m41045i);
                                        }
                                    }
                                    if (m2634q != null) {
                                        try {
                                            List m17941F0 = m2634q.m17941F0();
                                            int size2 = m17941F0.size() - 1;
                                            if (size2 >= 0) {
                                                while (true) {
                                                    int i18 = size2 - 1;
                                                    try {
                                                        C17945a0 c17945a0 = (C17945a0) m17941F0.get(size2);
                                                        if (c17945a0.m95135f9(m152954d)) {
                                                            if (i13 != c17945a0.m95089b4() && c17945a0.m95089b4() != 4) {
                                                                c17945a0.m95016Ta(i13);
                                                            }
                                                            if (m152950d) {
                                                                str2 = m152949c;
                                                                i16 = i14;
                                                                i15 = m152947a;
                                                                try {
                                                                    c17945a0.m94883F0(i16);
                                                                } catch (Exception e11) {
                                                                    e = e11;
                                                                    list = m17941F0;
                                                                    str = str2;
                                                                    AbstractC23350e.m122776f("ChatPacketHandler", e);
                                                                    if (i18 >= 0) {
                                                                    }
                                                                }
                                                            } else {
                                                                str2 = m152949c;
                                                                i16 = i14;
                                                                i15 = m152947a;
                                                            }
                                                            C21927m m114302u = C21927m.m114302u();
                                                            StringBuilder sb2 = new StringBuilder();
                                                            sb2.append(i16);
                                                            str = str2;
                                                            try {
                                                                m114302u.m114364w0(sb2.toString(), c17945a0.m94974P4());
                                                                if (m152950d && AbstractC23309i.m121146L2() == 1) {
                                                                    list = m17941F0;
                                                                    try {
                                                                        C21927m.m114302u().m114332f0(String.valueOf(i16), ((C17945a0) m17941F0.get(size2)).m94974P4(), false);
                                                                    } catch (Exception e12) {
                                                                        e = e12;
                                                                        AbstractC23350e.m122776f("ChatPacketHandler", e);
                                                                        if (i18 >= 0) {
                                                                        }
                                                                    }
                                                                } else {
                                                                    list = m17941F0;
                                                                }
                                                            } catch (Exception e13) {
                                                                e = e13;
                                                                list = m17941F0;
                                                                AbstractC23350e.m122776f("ChatPacketHandler", e);
                                                                if (i18 >= 0) {
                                                                }
                                                            }
                                                        } else {
                                                            list = m17941F0;
                                                            str = m152949c;
                                                            i16 = i14;
                                                            i15 = m152947a;
                                                        }
                                                    } catch (Exception e14) {
                                                        e = e14;
                                                        list = m17941F0;
                                                        str = m152949c;
                                                        i16 = i14;
                                                        i15 = m152947a;
                                                    }
                                                    if (i18 >= 0) {
                                                        break;
                                                    }
                                                    size2 = i18;
                                                    m152947a = i15;
                                                    m152949c = str;
                                                    m17941F0 = list;
                                                    i14 = i16;
                                                }
                                            } else {
                                                str = m152949c;
                                                i16 = i14;
                                                i15 = m152947a;
                                            }
                                            if (m152950d && i16 > 0) {
                                                try {
                                                    AbstractC23306f.m120631X().m101508a(new C2778c.b(m2634q.m17944I0()));
                                                    AbstractC23306f.m120631X().m101508a(new C2778c.b(String.valueOf(i16)));
                                                } catch (Exception e15) {
                                                    e = e15;
                                                    AbstractC23350e.m122776f("ChatPacketHandler", e);
                                                    i17 = i12 + 1;
                                                    c18980w = this;
                                                    size = i11;
                                                    aVar2 = aVar;
                                                    hashMap3 = hashMap;
                                                    m152947a = i15;
                                                    currentTimeMillis = j11;
                                                    m152949c = str;
                                                }
                                            } else {
                                                AbstractC23306f.m120631X().m101508a(new C2778c.b(m2634q.m17944I0()));
                                            }
                                        } catch (Exception e16) {
                                            e = e16;
                                            str = m152949c;
                                            i15 = m152947a;
                                            AbstractC23350e.m122776f("ChatPacketHandler", e);
                                            i17 = i12 + 1;
                                            c18980w = this;
                                            size = i11;
                                            aVar2 = aVar;
                                            hashMap3 = hashMap;
                                            m152947a = i15;
                                            currentTimeMillis = j11;
                                            m152949c = str;
                                        }
                                    } else {
                                        str = m152949c;
                                        i15 = m152947a;
                                    }
                                    Conversation m103204T = C19669z.Companion.m103232a().m103204T(m152954d);
                                    if (m103204T != null) {
                                        m103204T.m40993D(i13);
                                    }
                                    i17 = i12 + 1;
                                    c18980w = this;
                                    size = i11;
                                    aVar2 = aVar;
                                    hashMap3 = hashMap;
                                    m152947a = i15;
                                    currentTimeMillis = j11;
                                    m152949c = str;
                                } catch (Exception e17) {
                                    e = e17;
                                    AbstractC23350e.m122776f("ChatPacketHandler", e);
                                    AbstractC20887g.m109246x(17001, j11);
                                    return;
                                }
                            }
                        }
                        j11 = currentTimeMillis;
                        hashMap = hashMap3;
                        i12 = i17;
                    }
                    str = m152949c;
                    i15 = m152947a;
                    i17 = i12 + 1;
                    c18980w = this;
                    size = i11;
                    aVar2 = aVar;
                    hashMap3 = hashMap;
                    m152947a = i15;
                    currentTimeMillis = j11;
                    m152949c = str;
                }
                long j12 = currentTimeMillis;
                HashMap hashMap4 = hashMap3;
                String str5 = m152949c;
                if (!linkedList.isEmpty()) {
                    C31986k3.f147083a.m154146w1(str5, linkedList);
                }
                c18980w = this;
                it = it2;
                hashMap3 = hashMap4;
                currentTimeMillis = j12;
            }
            j11 = currentTimeMillis;
            HashMap hashMap5 = hashMap3;
            if (hashMap5.size() > 0) {
                Set keySet = hashMap5.keySet();
                AbstractC19074t.m100207e(keySet, "<get-keys>(...)");
                Iterator it3 = keySet.iterator();
                while (it3.hasNext()) {
                    int intValue = ((Number) it3.next()).intValue();
                    HashMap hashMap6 = hashMap5;
                    C19498i c19498i3 = (C19498i) hashMap6.get(Integer.valueOf(intValue));
                    if (c19498i3 != null && c19498i3.m101944c() > 0) {
                        C7956b.Companion.m41573b().m41520N0(intValue, true, c19498i3, 4, -1);
                        C7959d.Companion.m41850e().m41716J3(C20092b.f98828a.m104484l(c19498i3), 4);
                    }
                    hashMap5 = hashMap6;
                }
            }
            if (hashMap2.size() > 0) {
                Set keySet2 = hashMap2.keySet();
                AbstractC19074t.m100207e(keySet2, "<get-keys>(...)");
                Iterator it4 = keySet2.iterator();
                while (it4.hasNext()) {
                    int intValue2 = ((Number) it4.next()).intValue();
                    C19498i c19498i4 = (C19498i) hashMap2.get(Integer.valueOf(intValue2));
                    if (c19498i4 != null && c19498i4.m101944c() > 0) {
                        C7956b.Companion.m41573b().m41520N0(intValue2, true, c19498i4, 3, -1);
                        C7959d.Companion.m41850e().m41716J3(C20092b.f98828a.m104484l(c19498i4), 3);
                    }
                }
            }
            AbstractC23306f.m120702p1().m101508a(new C2785j.a(c31832a));
        } catch (Exception e18) {
            e = e18;
            j11 = currentTimeMillis;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01b2 A[Catch: Exception -> 0x015c, TRY_LEAVE, TryCatch #0 {Exception -> 0x015c, blocks: (B:54:0x0166, B:19:0x01a6, B:21:0x01b2, B:52:0x0187, B:57:0x014e), top: B:53:0x0166 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01c1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0154 A[LOOP:2: B:34:0x00f5->B:48:0x0154, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0153 A[EDGE_INSN: B:49:0x0153->B:50:0x0153 BREAK  A[LOOP:2: B:34:0x00f5->B:48:0x0154], SYNTHETIC] */
    /* renamed from: q0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m99590q0(C31832a c31832a) {
        Iterator it;
        int i11;
        Iterator it2;
        Iterator it3;
        long m41045i;
        Conversation m103204T;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            HashMap hashMap = new HashMap();
            List m152944a = c31832a.m152944a();
            AbstractC19074t.m100207e(m152944a, "getAckConversationInfoList(...)");
            Iterator it4 = m152944a.iterator();
            while (true) {
                int i12 = 4;
                if (!it4.hasNext()) {
                    break;
                }
                C31832a.a aVar = (C31832a.a) it4.next();
                String m152949c = aVar.m152949c();
                C0876j c0876j = this.f94741a;
                AbstractC19074t.m100205c(m152949c);
                C3535c m2634q = c0876j.m2634q(m152949c);
                int m152947a = aVar.m152947a();
                List m152948b = aVar.m152948b();
                AbstractC19074t.m100207e(m152948b, "getMsgInfoList(...)");
                Iterator it5 = m152948b.iterator();
                while (it5.hasNext()) {
                    C31832a.b bVar = (C31832a.b) it5.next();
                    MessageId m152954d = bVar.m152954d();
                    int m152956f = bVar.m152956f();
                    if (m152954d != null) {
                        Map map = AbstractC23304d.f113401k;
                        Integer num = (Integer) map.get(Long.valueOf(m152954d.m41045i()));
                        if (num != null && num.intValue() == i12) {
                            it3 = it4;
                            if (m2634q == null) {
                                try {
                                    List m17941F0 = m2634q.m17941F0();
                                    int size = m17941F0.size() - 1;
                                    if (size >= 0) {
                                        while (true) {
                                            int i13 = size - 1;
                                            try {
                                                C17945a0 c17945a0 = (C17945a0) m17941F0.get(size);
                                                if (c17945a0.m95135f9(m152954d)) {
                                                    c17945a0.m95016Ta(4);
                                                    int i14 = m152947a;
                                                    it2 = it5;
                                                    try {
                                                        c17945a0.m94883F0(m152956f);
                                                        i11 = i14;
                                                        it = it3;
                                                        try {
                                                            C21927m.m114302u().m114364w0(String.valueOf(m152956f), c17945a0.m94974P4());
                                                            if (AbstractC23309i.m121146L2() == 1) {
                                                                C21927m.m114302u().m114332f0(String.valueOf(m152956f), c17945a0.m94974P4(), false);
                                                            }
                                                        } catch (Exception e11) {
                                                            e = e11;
                                                            AbstractC23350e.m122776f("ChatPacketHandler", e);
                                                            if (i13 < 0) {
                                                            }
                                                        }
                                                    } catch (Exception e12) {
                                                        e = e12;
                                                        i11 = i14;
                                                        it = it3;
                                                        AbstractC23350e.m122776f("ChatPacketHandler", e);
                                                        if (i13 < 0) {
                                                        }
                                                    }
                                                } else {
                                                    i11 = m152947a;
                                                    it2 = it5;
                                                    it = it3;
                                                }
                                            } catch (Exception e13) {
                                                e = e13;
                                                i11 = m152947a;
                                                it2 = it5;
                                            }
                                            if (i13 < 0) {
                                                break;
                                            }
                                            size = i13;
                                            it5 = it2;
                                            it3 = it;
                                            m152947a = i11;
                                        }
                                    } else {
                                        i11 = m152947a;
                                        it2 = it5;
                                        it = it3;
                                    }
                                    if (m152956f > 0) {
                                        try {
                                            AbstractC23306f.m120631X().m101508a(new C2778c.b(m2634q.m17944I0()));
                                            AbstractC23306f.m120631X().m101508a(new C2778c.b(String.valueOf(m152956f)));
                                        } catch (Exception e14) {
                                            e = e14;
                                            AbstractC23350e.m122776f("ChatPacketHandler", e);
                                            it5 = it2;
                                            it4 = it;
                                            m152947a = i11;
                                            i12 = 4;
                                        }
                                    } else {
                                        AbstractC23306f.m120631X().m101508a(new C2778c.b(m2634q.m17944I0()));
                                    }
                                } catch (Exception e15) {
                                    e = e15;
                                    i11 = m152947a;
                                    it2 = it5;
                                    it = it3;
                                    AbstractC23350e.m122776f("ChatPacketHandler", e);
                                    it5 = it2;
                                    it4 = it;
                                    m152947a = i11;
                                    i12 = 4;
                                }
                            } else {
                                i11 = m152947a;
                                it2 = it5;
                                it = it3;
                            }
                            m103204T = C19669z.Companion.m103232a().m103204T(m152954d);
                            if (m103204T == null) {
                                m103204T.m40993D(4);
                            }
                        }
                        AbstractC19074t.m100207e(map, "messageStatesMap");
                        map.put(Long.valueOf(m152954d.m41045i()), Integer.valueOf(i12));
                        if (m152954d.m41052p()) {
                            C19498i c19498i = (C19498i) hashMap.get(Integer.valueOf(m152947a));
                            if (c19498i == null) {
                                c19498i = new C19498i();
                                hashMap.put(Integer.valueOf(m152947a), c19498i);
                            }
                            C19497h c19497h = new C19497h();
                            String str = CoreUtility.f89233i;
                            AbstractC19074t.m100207e(str, "currentUserUid");
                            c19497h.f96814c = Integer.parseInt(str);
                            it3 = it4;
                            c19497h.f96813b = m152954d.m41045i();
                            c19498i.m101942a(c19497h);
                        } else {
                            it3 = it4;
                        }
                        C17945a0 m2635r = this.f94741a.m2635r(m152954d);
                        if (m2635r != null) {
                            m41045i = m2635r.m94974P4();
                        } else {
                            m41045i = m152954d.m41045i();
                        }
                        C19636i1.Companion.m102800a().m102779o(m152949c, m41045i);
                        if (m2634q == null) {
                        }
                        m103204T = C19669z.Companion.m103232a().m103204T(m152954d);
                        if (m103204T == null) {
                        }
                    } else {
                        it = it4;
                        i11 = m152947a;
                        it2 = it5;
                    }
                    it5 = it2;
                    it4 = it;
                    m152947a = i11;
                    i12 = 4;
                }
            }
            if (hashMap.size() > 0) {
                Set keySet = hashMap.keySet();
                AbstractC19074t.m100207e(keySet, "<get-keys>(...)");
                Iterator it6 = keySet.iterator();
                while (it6.hasNext()) {
                    int intValue = ((Number) it6.next()).intValue();
                    C19498i c19498i2 = (C19498i) hashMap.get(Integer.valueOf(intValue));
                    if (c19498i2 != null && c19498i2.m101944c() > 0) {
                        C7956b.Companion.m41573b().m41520N0(intValue, true, c19498i2, 4, -1);
                        C7959d.Companion.m41850e().m41716J3(C20092b.f98828a.m104484l(c19498i2), 4);
                    }
                }
            }
            AbstractC23306f.m120705q1().m101508a(new C2786k.a(c31832a));
        } catch (Exception e16) {
            AbstractC23350e.m122776f("ChatPacketHandler", e16);
            AbstractC20887g.m109246x(17002, currentTimeMillis);
        }
    }

    /* renamed from: r0 */
    private final void m99592r0(C31832a c31832a) {
        long m41045i;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            for (C31832a.a aVar : c31832a.m152944a()) {
                try {
                    String m152949c = aVar.m152949c();
                    Iterator it = aVar.m152948b().iterator();
                    while (it.hasNext()) {
                        MessageId m152954d = ((C31832a.b) it.next()).m152954d();
                        if (m152954d != null) {
                            C17945a0 m2635r = this.f94741a.m2635r(m152954d);
                            if (m2635r != null) {
                                m41045i = m2635r.m94974P4();
                            } else {
                                m41045i = m152954d.m41045i();
                            }
                            C19636i1 m102800a = C19636i1.Companion.m102800a();
                            AbstractC19074t.m100205c(m152949c);
                            m102800a.m102779o(m152949c, m41045i);
                        }
                    }
                    C0876j c0876j = this.f94741a;
                    AbstractC19074t.m100205c(m152949c);
                    C17945a0 m2605E = c0876j.m2605E(m152949c);
                    if (m2605E != null && m2605E.m95089b4() == 3) {
                        C21927m.m114302u().m114364w0(m152949c, m2605E.m94974P4());
                        if (AbstractC23309i.m121146L2() == 1) {
                            C21927m.m114302u().m114332f0(m152949c, m2605E.m94974P4(), false);
                        }
                    }
                } catch (Exception e11) {
                    AbstractC23350e.m122776f("ChatPacketHandler", e11);
                    AbstractC20887g.m109246x(17003, currentTimeMillis);
                }
            }
            AbstractC23306f.m120631X().m101508a(new C2778c.b(null, 1, null));
        } catch (Exception e12) {
            AbstractC23350e.m122776f("ChatPacketHandler", e12);
            AbstractC20887g.m109246x(17004, currentTimeMillis);
        }
    }

    /* renamed from: s0 */
    private final void m99594s0() {
        try {
            C0804b.m2025g();
            String m122303q0 = AbstractC23309i.m122303q0();
            AbstractC19074t.m100207e(m122303q0, "getCodeHiddenChat(...)");
            if (m122303q0.length() > 0 && !C19669z.f97568P.get()) {
                C7960e.m41971c6().m42400g7();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatPacketHandler", e11);
        }
    }

    /* renamed from: t */
    private final void m99595t(int i11, JSONArray jSONArray) {
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new c());
        c0766k.m1833a(i11, jSONArray);
    }

    /* renamed from: v */
    private final C28930j m99596v() {
        return (C28930j) this.f94746f.getValue();
    }

    /* renamed from: w */
    private final void m99597w(JSONArray jSONArray, boolean z11) {
        C18451m m40269M;
        int length = jSONArray.length();
        for (int i11 = 0; i11 < length; i11++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i11);
            int optInt = jSONObject.optInt("sct");
            int optInt2 = jSONObject.optInt("id");
            long optLong = jSONObject.optLong("msgId");
            if (optInt == 1 && optLong != 0) {
                C7860a.b bVar = C7860a.Companion;
                C18431b m40270N = bVar.m40303b().m40270N(optInt2);
                if (m40270N == null || (m40269M = bVar.m40303b().m40269M(m40270N.m97666d())) == null) {
                    return;
                }
                C3533a m2606G = AbstractC23306f.m120584H0().m2606G(m40269M.mo97719a());
                if (m2606G != null && m2606G.m17912g() <= optLong) {
                    C23744a.Companion.m124119a().m124116d(8150, Integer.valueOf(m40270N.m97666d()));
                    bVar.m40303b().m40300z(m40270N.m97666d());
                }
            }
        }
        if (z11) {
            new C0757b().m1345l(3, jSONArray);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public static final void m99598y(String str, C18980w c18980w, boolean z11) {
        AbstractC19074t.m100208f(str, "$data");
        AbstractC19074t.m100208f(c18980w, "this$0");
        try {
            C31832a c31832a = new C31832a(new JSONObject(str), false);
            c18980w.m99609o0(c31832a);
            C29628e.m147249E0().m147275d1(c31832a, z11);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: B */
    public final void m99599B(final String str) {
        AbstractC19074t.m100208f(str, "data");
        if (str.length() == 0) {
            return;
        }
        AbstractC18429d.m97660a(C23288a.f113033a, new Runnable() { // from class: fj.s
            @Override // java.lang.Runnable
            public final void run() {
                C18980w.m99543C(str, this);
            }
        });
    }

    /* renamed from: D */
    public final void m99600D(final String str) {
        AbstractC19074t.m100208f(str, "data");
        if (str.length() == 0) {
            return;
        }
        AbstractC18429d.m97660a(C23288a.f113033a, new Runnable() { // from class: fj.n
            @Override // java.lang.Runnable
            public final void run() {
                C18980w.m99544E(str, this);
            }
        });
    }

    /* renamed from: F */
    public final void m99601F(JSONObject jSONObject) {
        String jSONObject2;
        if (jSONObject != null && (jSONObject2 = jSONObject.toString()) != null) {
            C21654a.m111581h("ChatPacketHandler", "Handle CMD force update Auto Download configs", C21654a.a.f105047p, false, 8, null);
            AbstractC23306f.m120652d().m109859M0(jSONObject2, true);
        }
    }

    /* renamed from: G */
    public final void m99602G(final String str) {
        AbstractC19074t.m100208f(str, "data");
        if (str.length() == 0) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("handleCmdResetUnreadCount(");
        sb2.append(str);
        sb2.append(")");
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: fj.o
            @Override // java.lang.Runnable
            public final void run() {
                C18980w.m99545H(str, this);
            }
        });
    }

    /* renamed from: I */
    public final void m99603I(String str, final boolean z11) {
        AbstractC19074t.m100208f(str, "data");
        C24559a.m127933c("[Message]", "handleCmdSeenOfflineFromPC(" + str + ", " + z11 + ")");
        if (!AbstractC23309i.m120789Bf() || str.length() == 0) {
            return;
        }
        try {
            final JSONObject jSONObject = new JSONObject(str);
            final int optInt = jSONObject.optInt(ZinstantMetaConstant.IMPRESSION_META_TYPE);
            final JSONArray optJSONArray = jSONObject.optJSONArray("seens");
            if (optJSONArray != null && optJSONArray.length() != 0) {
                C19669z.Companion.m103232a().m103229t0();
                AbstractC18429d.m97660a(C23288a.f113033a, new Runnable() { // from class: fj.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        C18980w.m99546J(optInt, this, optJSONArray, z11, jSONObject);
                    }
                });
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatPacketHandler", e11);
        }
    }

    /* renamed from: K */
    public final void m99604K(String str) {
        JSONArray optJSONArray;
        AbstractC19074t.m100208f(str, "paramString");
        C24559a.m127933c("[UnreadMessage]", "handleCmdUpdateMarkUnreadFromPC param: " + str);
        JSONObject m131571b = AbstractC25384a.m131571b(str);
        if (m131571b == null || (optJSONArray = m131571b.optJSONArray("markData")) == null) {
            return;
        }
        int length = optJSONArray.length();
        for (int i11 = 0; i11 < length; i11++) {
            JSONObject jSONObject = optJSONArray.getJSONObject(i11);
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (optJSONObject != null) {
                int optInt = jSONObject.optInt("action");
                ArrayList m128766a = C24774a.Companion.m128766a(optJSONObject, optInt);
                if (optInt == 1) {
                    C18425b.Companion.m97655a().m97651k(m128766a);
                } else {
                    C18425b.Companion.m97655a().m97648d(m128766a);
                }
                C23744a.b bVar = C23744a.Companion;
                bVar.m124119a().m124116d(36, new Object[0]);
                bVar.m124119a().m124116d(6064, new Object[0]);
            }
        }
        if (m131571b.optInt("evict") == 1) {
            C0872f.Companion.m2569a().m2563u0();
        }
        C0872f.Companion.m2569a().m2538h(str);
    }

    /* renamed from: L */
    public final void m99605L(String str, long j11) {
        Long l11;
        MessageId m95029V3;
        AbstractC19074t.m100208f(str, "uid");
        int m2517H = AbstractC23306f.m120562A().m2517H(str, j11);
        C19636i1.b bVar = C19636i1.Companion;
        int m102746E = bVar.m102800a().m102746E(str);
        if (m2517H >= m102746E) {
            return;
        }
        bVar.m102800a().m102751I0(str, m2517H);
        C28023b6.m141250h0().m141346g2(j11, str);
        C17945a0 m2608I = AbstractC23306f.m120584H0().m2608I(str, j11);
        if (m2608I != null) {
            bVar.m102800a().m102744C0(str, m2608I);
        }
        C17945a0 m102748G = bVar.m102800a().m102748G(str);
        if (m102748G != null && m102748G.m95029V3().m41047k() <= j11) {
            bVar.m102800a().m102778n0(str);
        }
        C17945a0 m102749H = bVar.m102800a().m102749H(str);
        if (m102749H != null && m102749H.m95029V3().m41047k() <= j11) {
            bVar.m102800a().m102780o0(str);
        }
        if (m2608I != null && (m95029V3 = m2608I.m95029V3()) != null) {
            l11 = Long.valueOf(m95029V3.m41047k());
        } else {
            l11 = null;
        }
        C24559a.m127933c("[UnreadMessage]", "uid = " + str + ", currentCount = " + m102746E + ", newCount: " + m2517H + ", 1stUnreadId: " + l11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v7, types: [java.util.Map] */
    /* renamed from: S */
    public final void m99606S(String str, int i11, int i12, JSONObject jSONObject, int i13, boolean z11, b bVar) {
        String str2;
        String str3;
        long j11;
        boolean z12;
        HashMap hashMap;
        int i14;
        JSONArray jSONArray;
        long j12;
        ArrayList arrayList;
        b bVar2;
        boolean z13;
        InterfaceC3534b interfaceC3534b;
        JSONObject optJSONObject;
        int i15;
        long j13;
        AbstractC19074t.m100208f(str, "currentUserUid");
        AbstractC19074t.m100208f(jSONObject, "jsonData");
        AbstractC19074t.m100208f(bVar, "source");
        try {
            if (str.length() != 0 && AbstractC19074t.m100204b(CoreUtility.f89233i, str) && !jSONObject.isNull("msg") && jSONObject.optJSONArray("msg") != null) {
                long nanoTime = System.nanoTime();
                ArrayList arrayList2 = new ArrayList();
                HashMap hashMap2 = new HashMap();
                JSONArray jSONArray2 = jSONObject.getJSONArray("msg");
                int length = jSONArray2.length();
                boolean m104311a = AbstractC20070a.m104311a(i11);
                boolean m104313c = AbstractC20070a.m104313c(i11);
                boolean m104312b = AbstractC20070a.m104312b(i11);
                if (!z11) {
                    j11 = nanoTime;
                } else {
                    j11 = -1;
                }
                long j14 = 0;
                if (j11 > 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    try {
                        hashMap = hashMap2;
                        i14 = length;
                        jSONArray = jSONArray2;
                        this.f94745e.m99629n(j11, i11, i12, jSONObject);
                        j12 = j11;
                        C17797f.f90007a.m94001b(j12, i11, i14);
                    } catch (Exception e11) {
                        e = e11;
                        str3 = "ChatPacketHandler";
                        AbstractC23350e.m122776f(str3, e);
                        return;
                    }
                } else {
                    jSONArray = jSONArray2;
                    hashMap = hashMap2;
                    i14 = length;
                    j12 = j11;
                }
                int i16 = 0;
                while (i16 < i14) {
                    JSONObject optJSONObject2 = jSONArray.getJSONObject(i16).optJSONObject("text");
                    if (optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject("data")) == null) {
                        return;
                    }
                    String optString = optJSONObject2.optString(ZinstantMetaConstant.IMPRESSION_META_TYPE, "");
                    AbstractC19074t.m100205c(optString);
                    int i17 = i16;
                    long j15 = j12;
                    int i18 = i14;
                    JSONArray jSONArray3 = jSONArray;
                    ?? r14 = hashMap;
                    String m103055D = AbstractC19656s0.m103055D(str, optJSONObject, optString, i13, null, 16, null);
                    C3533a c3533a = null;
                    try {
                        if (!AbstractC19656s0.m103064g(optString, optJSONObject, false, 4, null)) {
                            arrayList2.add(Long.valueOf(optJSONObject.getLong("id")));
                            i15 = i17;
                            j13 = j15;
                        } else {
                            if (z12) {
                                c3533a = new C3533a(i11, optString, optJSONObject, m103055D);
                                if (!m99548N(optString)) {
                                    try {
                                        j13 = j15;
                                        try {
                                            this.f94745e.m99628m(j13, c3533a);
                                        } catch (Exception e12) {
                                            e = e12;
                                            i15 = i17;
                                            AbstractC23350e.m122776f("ChatPacketHandler", e);
                                            m99550P(e, str, nanoTime);
                                            i16 = i15 + 1;
                                            j12 = j13;
                                            hashMap = r14;
                                            jSONArray = jSONArray3;
                                            i14 = i18;
                                        }
                                    } catch (Exception e13) {
                                        e = e13;
                                        j13 = j15;
                                    }
                                } else {
                                    j13 = j15;
                                    C17797f.f90007a.m94005h(j13, 1);
                                }
                                i15 = i17;
                                if (i15 == i18 - 1) {
                                    try {
                                        j14 = c3533a.m17912g();
                                    } catch (Exception e14) {
                                        e = e14;
                                        AbstractC23350e.m122776f("ChatPacketHandler", e);
                                        m99550P(e, str, nanoTime);
                                        i16 = i15 + 1;
                                        j12 = j13;
                                        hashMap = r14;
                                        jSONArray = jSONArray3;
                                        i14 = i18;
                                    }
                                }
                            } else {
                                i15 = i17;
                                j13 = j15;
                            }
                            Object obj = r14.get(m103055D);
                            if (obj == null) {
                                obj = new LinkedList();
                                r14.put(m103055D, obj);
                            }
                            ((List) obj).add(new C3543k(optJSONObject, optString, c3533a));
                        }
                    } catch (Exception e15) {
                        e = e15;
                        i15 = i17;
                        j13 = j15;
                    }
                    i16 = i15 + 1;
                    j12 = j13;
                    hashMap = r14;
                    jSONArray = jSONArray3;
                    i14 = i18;
                }
                long j16 = j12;
                HashMap hashMap3 = hashMap;
                C17797f.f90007a.m94003e(j16);
                if (!(!hashMap3.isEmpty())) {
                    str2 = "ChatPacketHandler";
                    arrayList = arrayList2;
                } else {
                    if (AbstractC23304d.m120544o()) {
                        bVar2 = bVar;
                        m99547M(bVar2, i11);
                    } else {
                        bVar2 = bVar;
                    }
                    if (bVar2 == b.f94749p && AbstractC20070a.m104316f(i11)) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (m104313c) {
                        interfaceC3534b = InterfaceC3534b.c.f14896a;
                    } else if (AbstractC20070a.m104315e(i11)) {
                        interfaceC3534b = InterfaceC3534b.e.f14897a;
                    } else {
                        interfaceC3534b = InterfaceC3534b.f.f14898a;
                    }
                    arrayList = arrayList2;
                    str2 = "ChatPacketHandler";
                    try {
                        m99554V(this, str, j16, hashMap3, interfaceC3534b, m104311a, m104312b, z13, m104313c, i13, j14, false, 1024, null);
                    } catch (Exception e16) {
                        e = e16;
                        str3 = str2;
                        AbstractC23350e.m122776f(str3, e);
                        return;
                    }
                }
                if (!m104313c && arrayList.size() > 0 && bVar != b.f94750q) {
                    C29628e.m147249E0().m147285n1(arrayList);
                }
            }
        } catch (Exception e17) {
            e = e17;
            str2 = "ChatPacketHandler";
        }
    }

    /* renamed from: T */
    public final void m99607T(String str, ArrayList arrayList) {
        AbstractC19074t.m100208f(str, "currentUserUid");
        AbstractC19074t.m100208f(arrayList, "dataList");
        if (str.length() != 0 && AbstractC19074t.m100204b(CoreUtility.f89233i, str) && !arrayList.isEmpty()) {
            HashMap hashMap = new HashMap();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C31837a4 c31837a4 = (C31837a4) it.next();
                C24559a.m127933c("[E2EE]", "processGroupMessageDecryptLater | " + c31837a4.m152963c());
                String m103055D = AbstractC19656s0.m103055D(str, c31837a4.m152962b(), c31837a4.m152964d(), 1, null, 16, null);
                Object obj = hashMap.get(m103055D);
                if (obj == null) {
                    obj = new LinkedList();
                    hashMap.put(m103055D, obj);
                }
                ((List) obj).add(new C3543k(c31837a4.m152962b(), c31837a4.m152964d(), c31837a4.m152961a()));
            }
            m99553U(str, -1L, hashMap, InterfaceC3534b.f.f14898a, true, true, true, false, 1, 0L, true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0054 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00dc  */
    /* renamed from: a0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m99608a0(int i11, int i12, JSONObject jSONObject, int i13) {
        long j11;
        C24261h.b bVar;
        boolean z11;
        int i14;
        boolean z12;
        boolean z13;
        AbstractC19074t.m100208f(jSONObject, "jsonObject");
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("msg");
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                try {
                    try {
                        try {
                            if (length < 50) {
                                if (jSONObject.optInt("hasMore") != 1) {
                                    z11 = false;
                                    j11 = currentTimeMillis;
                                    long optLong = jSONObject.optLong("lastMsgId", 0L);
                                    i14 = 0;
                                    while (i14 < length) {
                                        try {
                                            JSONObject jSONObject2 = new JSONObject();
                                            JSONObject jSONObject3 = optJSONArray.getJSONObject(i14);
                                            String str = "";
                                            if (jSONObject3 != null) {
                                                AbstractC19074t.m100205c(jSONObject3);
                                                JSONObject jSONObject4 = jSONObject3.getJSONObject("text");
                                                str = jSONObject4.optString(ZinstantMetaConstant.IMPRESSION_META_TYPE, "");
                                                AbstractC19074t.m100207e(str, "optString(...)");
                                                JSONObject optJSONObject = jSONObject4.optJSONObject("data");
                                                if (optJSONObject != null) {
                                                    AbstractC19074t.m100205c(optJSONObject);
                                                    jSONObject2 = optJSONObject;
                                                }
                                            }
                                            try {
                                                C3546n c3546n = new C3546n(jSONObject2, str, i13);
                                                arrayList2.add(c3546n);
                                                arrayList.add(Long.valueOf(c3546n.m18025b()));
                                                if (c3546n.m18030g().length() > 0) {
                                                    z13 = z11;
                                                    try {
                                                        C21927m.m114302u().m114368y0(c3546n.m18030g(), c3546n.m18031h());
                                                    } catch (Exception e11) {
                                                        e = e11;
                                                        AbstractC23350e.m122776f("ChatPacketHandler", e);
                                                        i14++;
                                                        z11 = z13;
                                                    }
                                                } else {
                                                    z13 = z11;
                                                }
                                            } catch (Exception e12) {
                                                e = e12;
                                                z13 = z11;
                                                AbstractC23350e.m122776f("ChatPacketHandler", e);
                                                i14++;
                                                z11 = z13;
                                            }
                                        } catch (Exception e13) {
                                            e = e13;
                                        }
                                        i14++;
                                        z11 = z13;
                                    }
                                    boolean z14 = z11;
                                    if (!arrayList2.isEmpty()) {
                                        if (i11 != 1782 && i11 != 1787) {
                                            z12 = false;
                                            m99561b0(arrayList2, z12, i11, i12, z14, optLong);
                                        }
                                        z12 = true;
                                        m99561b0(arrayList2, z12, i11, i12, z14, optLong);
                                    }
                                }
                            }
                            long optLong2 = jSONObject.optLong("lastMsgId", 0L);
                            i14 = 0;
                            while (i14 < length) {
                            }
                            boolean z142 = z11;
                            if (!arrayList2.isEmpty()) {
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            C24261h.b bVar2 = C24261h.Companion;
                            if (bVar2.m126655a() && (i11 == 1782 || i11 == 1787)) {
                                C24261h.b.m126654d(bVar2, 230406007, j11, System.currentTimeMillis(), arrayList2.size(), false, 16, null);
                            }
                            throw th;
                        }
                    } catch (OutOfMemoryError e14) {
                        e = e14;
                        AbstractC23350e.m122776f("ChatPacketHandler", e);
                        bVar = C24261h.Companion;
                        if (bVar.m126655a()) {
                            if (i11 != 1782 && i11 != 1787) {
                                return;
                            }
                            C24261h.b.m126654d(bVar, 230406007, j11, System.currentTimeMillis(), arrayList2.size(), false, 16, null);
                        }
                        return;
                    }
                } catch (Exception e15) {
                    e = e15;
                    AbstractC23350e.m122776f("ChatPacketHandler", e);
                    bVar = C24261h.Companion;
                    if (bVar.m126655a()) {
                        if (i11 != 1782 && i11 != 1787) {
                            return;
                        }
                        C24261h.b.m126654d(bVar, 230406007, j11, System.currentTimeMillis(), arrayList2.size(), false, 16, null);
                    }
                    return;
                }
                z11 = true;
                j11 = currentTimeMillis;
            } else {
                j11 = currentTimeMillis;
            }
            bVar = C24261h.Companion;
        } catch (Exception e16) {
            e = e16;
            j11 = currentTimeMillis;
        } catch (OutOfMemoryError e17) {
            e = e17;
            j11 = currentTimeMillis;
        } catch (Throwable th3) {
            th = th3;
            j11 = currentTimeMillis;
        }
        if (bVar.m126655a()) {
            if (i11 != 1782 && i11 != 1787) {
                return;
            }
            C24261h.b.m126654d(bVar, 230406007, j11, System.currentTimeMillis(), arrayList2.size(), false, 16, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0141 A[LOOP:2: B:37:0x00ca->B:56:0x0141, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0140 A[EDGE_INSN: B:57:0x0140->B:58:0x0140 BREAK  A[LOOP:2: B:37:0x00ca->B:56:0x0141], SYNTHETIC] */
    /* renamed from: o0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m99609o0(C31832a c31832a) {
        long j11;
        HashMap hashMap;
        HashMap hashMap2;
        LinkedList linkedList;
        Iterator it;
        Iterator it2;
        Iterator it3;
        MessageId m152954d;
        long m41045i;
        List list;
        C17945a0 c17945a0;
        C18980w c18980w = this;
        AbstractC19074t.m100208f(c31832a, "ackPacketInfo");
        long currentTimeMillis = System.currentTimeMillis();
        try {
            hashMap = new HashMap();
            hashMap2 = new HashMap();
            linkedList = new LinkedList();
            it = c31832a.m152944a().iterator();
        } catch (Exception e11) {
            e = e11;
            j11 = currentTimeMillis;
        }
        while (true) {
            int i11 = 3;
            if (!it.hasNext()) {
                break;
            }
            C31832a.a aVar = (C31832a.a) it.next();
            String m152949c = aVar.m152949c();
            C0876j c0876j = c18980w.f94741a;
            AbstractC19074t.m100205c(m152949c);
            C3535c m2634q = c0876j.m2634q(m152949c);
            boolean m152950d = aVar.m152950d();
            List m152948b = aVar.m152948b();
            if (m152950d) {
                i11 = 4;
            }
            Iterator it4 = m152948b.iterator();
            while (it4.hasNext()) {
                C31832a.b bVar = (C31832a.b) it4.next();
                if (bVar.m152959i()) {
                    AbstractC19074t.m100205c(bVar);
                    linkedList.add(bVar);
                } else {
                    try {
                    } catch (Exception e12) {
                        e = e12;
                        it2 = it;
                    }
                    if (!AbstractC19074t.m100204b(CoreUtility.f89233i, String.valueOf(bVar.m152956f())) && (m152954d = bVar.m152954d()) != null) {
                        C17945a0 m2635r = c18980w.f94741a.m2635r(m152954d);
                        if (m2635r != null) {
                            m41045i = m2635r.m94974P4();
                        } else {
                            m41045i = m152954d.m41045i();
                        }
                        long j12 = m41045i;
                        if (m152950d) {
                            it2 = it;
                            try {
                                C19636i1.Companion.m102800a().m102779o(m152949c, j12);
                            } catch (Exception e13) {
                                e = e13;
                                j11 = currentTimeMillis;
                                it3 = it4;
                                try {
                                    AbstractC23350e.m122776f("ChatPacketHandler", e);
                                    c18980w = this;
                                    it = it2;
                                    it4 = it3;
                                    currentTimeMillis = j11;
                                } catch (Exception e14) {
                                    e = e14;
                                }
                            }
                        } else {
                            it2 = it;
                            C19636i1.Companion.m102800a().m102777n(m152949c, j12);
                        }
                        if (m2634q != null) {
                            List m17941F0 = m2634q.m17941F0();
                            int size = m17941F0.size() - 1;
                            if (size >= 0) {
                                while (true) {
                                    int i12 = size - 1;
                                    try {
                                        c17945a0 = (C17945a0) m17941F0.get(size);
                                        list = m17941F0;
                                    } catch (Exception e15) {
                                        e = e15;
                                        list = m17941F0;
                                    }
                                    try {
                                        if (c17945a0.m95135f9(bVar.m152954d())) {
                                            if (i11 != c17945a0.m95089b4()) {
                                                try {
                                                    it3 = it4;
                                                    if (c17945a0.m95089b4() != 4) {
                                                        try {
                                                            c17945a0.m95016Ta(i11);
                                                        } catch (Exception e16) {
                                                            e = e16;
                                                            j11 = currentTimeMillis;
                                                            AbstractC23350e.m122776f("ChatPacketHandler", e);
                                                            if (i12 < 0) {
                                                            }
                                                        }
                                                    }
                                                } catch (Exception e17) {
                                                    e = e17;
                                                    it3 = it4;
                                                    j11 = currentTimeMillis;
                                                    AbstractC23350e.m122776f("ChatPacketHandler", e);
                                                    if (i12 < 0) {
                                                    }
                                                }
                                            } else {
                                                it3 = it4;
                                            }
                                            j11 = currentTimeMillis;
                                            try {
                                                C21927m.m114302u().m114364w0(m152949c, c17945a0.m94974P4());
                                                if (m152950d && AbstractC23309i.m121146L2() == 1) {
                                                    C21927m.m114302u().m114332f0(m152949c, c17945a0.m94974P4(), false);
                                                }
                                            } catch (Exception e18) {
                                                e = e18;
                                                AbstractC23350e.m122776f("ChatPacketHandler", e);
                                                if (i12 < 0) {
                                                }
                                            }
                                        } else {
                                            j11 = currentTimeMillis;
                                            it3 = it4;
                                        }
                                    } catch (Exception e19) {
                                        e = e19;
                                        j11 = currentTimeMillis;
                                        it3 = it4;
                                        AbstractC23350e.m122776f("ChatPacketHandler", e);
                                        if (i12 < 0) {
                                        }
                                    }
                                    if (i12 < 0) {
                                        break;
                                    }
                                    size = i12;
                                    m17941F0 = list;
                                    it4 = it3;
                                    currentTimeMillis = j11;
                                }
                            } else {
                                j11 = currentTimeMillis;
                                it3 = it4;
                            }
                            try {
                                AbstractC23306f.m120631X().m101508a(new C2778c.b(m2634q.m17944I0()));
                            } catch (Exception e21) {
                                e = e21;
                                AbstractC23350e.m122776f("ChatPacketHandler", e);
                                c18980w = this;
                                it = it2;
                                it4 = it3;
                                currentTimeMillis = j11;
                            }
                        } else {
                            j11 = currentTimeMillis;
                            it3 = it4;
                        }
                        if (m152954d.m41052p()) {
                            if (i11 == 4) {
                                C19498i c19498i = (C19498i) hashMap2.get(Integer.valueOf(Integer.parseInt(m152949c)));
                                if (c19498i == null) {
                                    c19498i = new C19498i();
                                    hashMap2.put(Integer.valueOf(Integer.parseInt(m152949c)), c19498i);
                                }
                                C19497h c19497h = new C19497h();
                                c19497h.f96813b = m152954d.m41045i();
                                String str = CoreUtility.f89233i;
                                AbstractC19074t.m100207e(str, "currentUserUid");
                                c19497h.f96814c = Integer.parseInt(str);
                                c19498i.m101942a(c19497h);
                            } else {
                                C19498i c19498i2 = (C19498i) hashMap.get(Integer.valueOf(Integer.parseInt(m152949c)));
                                if (c19498i2 == null) {
                                    c19498i2 = new C19498i();
                                    hashMap.put(Integer.valueOf(Integer.parseInt(m152949c)), c19498i2);
                                }
                                C19497h c19497h2 = new C19497h();
                                String str2 = CoreUtility.f89233i;
                                AbstractC19074t.m100207e(str2, "currentUserUid");
                                c19497h2.f96814c = Integer.parseInt(str2);
                                c19497h2.f96813b = m152954d.m41045i();
                                c19498i2.m101942a(c19497h2);
                            }
                        }
                        Conversation m103204T = C19669z.Companion.m103232a().m103204T(m152954d);
                        if (m103204T != null) {
                            m103204T.m40993D(i11);
                        }
                        if (bVar.m152958h()) {
                            C31986k3.f147083a.m154145v1(m152954d, String.valueOf(bVar.m152956f()), bVar.m152951a());
                        }
                        c18980w = this;
                        it = it2;
                        it4 = it3;
                        currentTimeMillis = j11;
                    } else {
                        c18980w = this;
                    }
                }
            }
            Iterator it5 = it;
            long j13 = currentTimeMillis;
            if (!linkedList.isEmpty()) {
                C31986k3.f147083a.m154146w1(m152949c, linkedList);
            }
            c18980w = this;
            it = it5;
            currentTimeMillis = j13;
            e = e14;
            AbstractC23350e.m122776f("ChatPacketHandler", e);
            AbstractC20887g.m109246x(17000, j11);
            return;
        }
        j11 = currentTimeMillis;
        if (hashMap2.size() > 0) {
            Set keySet = hashMap2.keySet();
            AbstractC19074t.m100207e(keySet, "<get-keys>(...)");
            Iterator it6 = keySet.iterator();
            while (it6.hasNext()) {
                int intValue = ((Number) it6.next()).intValue();
                C19498i c19498i3 = (C19498i) hashMap2.get(Integer.valueOf(intValue));
                if (c19498i3 != null && c19498i3.m101944c() > 0) {
                    C7956b.Companion.m41573b().m41520N0(intValue, false, c19498i3, 4, -1);
                    C7959d.Companion.m41850e().m41716J3(C20092b.f98828a.m104484l(c19498i3), 4);
                }
            }
        }
        if (hashMap.size() > 0) {
            Set keySet2 = hashMap.keySet();
            AbstractC19074t.m100207e(keySet2, "<get-keys>(...)");
            Iterator it7 = keySet2.iterator();
            while (it7.hasNext()) {
                int intValue2 = ((Number) it7.next()).intValue();
                C19498i c19498i4 = (C19498i) hashMap.get(Integer.valueOf(intValue2));
                if (c19498i4 != null && c19498i4.m101944c() > 0) {
                    C7956b.Companion.m41573b().m41520N0(intValue2, false, c19498i4, 3, -1);
                    C7959d.Companion.m41850e().m41716J3(C20092b.f98828a.m104484l(c19498i4), 3);
                }
            }
        }
    }

    /* renamed from: u */
    public final void m99610u(List list, String str) {
        AbstractC19074t.m100208f(list, "unreadThreadList");
        AbstractC19074t.m100208f(str, "trackingData");
        this.f94741a.m2607H(list, str, new d());
    }

    /* renamed from: x */
    public final void m99611x(final String str, final boolean z11) {
        AbstractC19074t.m100208f(str, "data");
        if (str.length() == 0) {
            return;
        }
        AbstractC18429d.m97660a(C23288a.f113033a, new Runnable() { // from class: fj.q
            @Override // java.lang.Runnable
            public final void run() {
                C18980w.m99598y(str, this, z11);
            }
        });
    }

    /* renamed from: z */
    public final void m99612z(final String str, final boolean z11) {
        AbstractC19074t.m100208f(str, "data");
        if (str.length() == 0) {
            return;
        }
        AbstractC18429d.m97660a(C23288a.f113033a, new Runnable() { // from class: fj.r
            @Override // java.lang.Runnable
            public final void run() {
                C18980w.m99542A(str, this, z11);
            }
        });
    }
}
