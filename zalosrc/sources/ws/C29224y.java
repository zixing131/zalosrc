package ws;

import ae.C0766k;
import ag0.AbstractC0837p0;
import android.os.Handler;
import android.text.TextUtils;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.data.entity.chat.conversation.FirstUnreadMsg;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.p062db.C7959d;
import com.zing.zalocore.utils.cryptology.CoreUtils;
import dj.C17945a0;
import eg0.AbstractC18429d;
import eg0.C18426a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import gw.AbstractC19646n0;
import gw.C19617c0;
import gw.C19636i1;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import me0.AbstractC23160o0;
import me0.C23055e5;
import mg.C23288a;
import mm0.AbstractC23350e;
import org.json.JSONObject;
import p019aj.C0876j;
import p056cj.InterfaceC3534b;
import p186gj.C19461e;
import p212hj.C20072c;
import p348mi.AbstractC23306f;
import p363nh.C23744a;
import p585vs.C28609a;
import p585vs.C28610b;
import p585vs.C28611c;
import p585vs.C28612d;
import p585vs.C28614f;
import p645xh.C29628e;
import p667y2.C30268e;
import p716zh.C31973j5;
import su.AbstractC26389c;
import th.C26688i;
import vg.C28203u6;
import ws.C29210k;
import ws.C29224y;
import xd0.C29594j;

/* renamed from: ws.y */
/* loaded from: classes4.dex */
public final class C29224y {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private b f135401a;

    /* renamed from: b */
    private List f135402b;

    /* renamed from: c */
    private final Handler f135403c;

    /* renamed from: d */
    private boolean f135404d;

    /* renamed from: e */
    private volatile boolean f135405e;

    /* renamed from: f */
    private final Runnable f135406f;

    /* renamed from: g */
    private boolean f135407g;

    /* renamed from: h */
    private int f135408h;

    /* renamed from: ws.y$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: ws.y$b */
    /* loaded from: classes4.dex */
    public interface b {
        /* renamed from: a */
        void mo145908a();
    }

    /* renamed from: ws.y$c */
    /* loaded from: classes4.dex */
    public static final class c implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ boolean f135409a;

        /* renamed from: b */
        final /* synthetic */ C29224y f135410b;

        /* renamed from: c */
        final /* synthetic */ List f135411c;

        /* renamed from: d */
        final /* synthetic */ boolean f135412d;

        c(boolean z11, C29224y c29224y, List list, boolean z12) {
            this.f135409a = z11;
            this.f135410b = c29224y;
            this.f135411c = list;
            this.f135412d = z12;
        }

        /* renamed from: d */
        public static final void m145975d(C29224y c29224y, List list, boolean z11, C28614f c28614f) {
            AbstractC19074t.m100208f(c29224y, "this$0");
            AbstractC19074t.m100208f(list, "$jobs");
            AbstractC19074t.m100208f(c28614f, "$responseInfo");
            c29224y.m145965s(list, z11 ? 1 : 0, c28614f);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            if (c20096c != null) {
                try {
                    this.f135410b.m145970x(c20096c.m104491c());
                } catch (Exception e11) {
                    AbstractC23350e.m122776f("PullPreviewMsgTask", e11);
                }
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            JSONObject jSONObject;
            C28614f m143099a;
            try {
                if (obj instanceof JSONObject) {
                    jSONObject = (JSONObject) obj;
                } else {
                    jSONObject = null;
                }
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                int optInt = jSONObject.optInt(C30268e.f140632a, 0);
                if (optInt != 0) {
                    this.f135410b.m145970x(optInt);
                    return;
                }
                if (this.f135409a) {
                    m143099a = C28614f.Companion.m143099a(jSONObject, true);
                } else {
                    String m135986b = AbstractC26389c.m135986b(this.f135410b.m145962p(), jSONObject.optString("data"));
                    AbstractC19074t.m100207e(m135986b, "decryptionAES(...)");
                    m143099a = C28614f.Companion.m143099a(new JSONObject(m135986b), false);
                }
                C23288a.f113033a.mo13474a(new C18426a(new Runnable() { // from class: ws.z

                    /* renamed from: q */
                    public final /* synthetic */ List f135414q;

                    /* renamed from: r */
                    public final /* synthetic */ boolean f135415r;

                    /* renamed from: s */
                    public final /* synthetic */ C28614f f135416s;

                    public /* synthetic */ RunnableC29225z(List list, boolean z11, C28614f m143099a2) {
                        r2 = list;
                        r3 = z11;
                        r4 = m143099a2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C29224y.c.m145975d(C29224y.this, r2, r3, r4);
                    }
                }));
            } catch (Exception e11) {
                AbstractC23350e.m122776f("PullPreviewMsgTask", e11);
            }
        }
    }

    public C29224y(b bVar, List list, Handler handler, boolean z11) {
        AbstractC19074t.m100208f(bVar, "pullPreviewMsgListener");
        AbstractC19074t.m100208f(list, "jobs");
        AbstractC19074t.m100208f(handler, "handler");
        this.f135401a = bVar;
        this.f135402b = list;
        this.f135403c = handler;
        this.f135404d = z11;
        this.f135406f = new Runnable() { // from class: ws.t
            public /* synthetic */ RunnableC29219t() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C29224y.m145960m(C29224y.this);
            }
        };
    }

    /* renamed from: A */
    private final void m145946A(List list, boolean z11, boolean z12) {
        String str;
        String str2;
        int i11;
        long j11;
        long j12;
        long j13;
        String str3;
        List list2 = list;
        if (this.f135407g) {
            return;
        }
        int i12 = 1;
        this.f135407g = true;
        String m145963q = m145963q(z12);
        C29199a.m145771a(m145963q + " START jobs size: " + list.size() + ", isGroup= " + z11);
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new c(z12, this, list2, z11));
        String str4 = " job: ";
        if (z12) {
            ArrayList arrayList = new ArrayList();
            int size = list.size();
            for (int i13 = 0; i13 < size; i13++) {
                C28611c c28611c = (C28611c) list2.get(i13);
                if (z11) {
                    str3 = c28611c.m143072b();
                } else {
                    str3 = c28611c.f132658a;
                }
                arrayList.add(str3);
                C29199a.m145771a(m145963q + " job: " + c28611c.m143076h());
            }
            c0766k.mo1459J5(arrayList, z11);
            C29199a.m145771a(m145963q + " threadIds: " + TextUtils.join(",", arrayList) + ", Retry count: " + this.f135408h);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        if (!z11 || !AbstractC23306f.m120562A().m2525T()) {
            i12 = 0;
        }
        int size2 = list.size();
        int i14 = 0;
        while (i14 < size2) {
            C28611c c28611c2 = (C28611c) list2.get(i14);
            C29199a.m145771a(m145963q + str4 + c28611c2.m143076h());
            if (z11) {
                str = c28611c2.m143072b();
            } else {
                str = c28611c2.f132658a;
            }
            String str5 = str;
            if (z11) {
                C31973j5 m4472f = AbstractC23306f.m120665g0().m4472f(c28611c2.f132658a);
                if (m4472f != null && !TextUtils.isEmpty(m4472f.m153736Q())) {
                    j13 = Long.parseLong(m4472f.m153736Q());
                } else {
                    j13 = 0;
                }
                str2 = str4;
                i11 = size2;
                j12 = j13;
                ContactProfile m141801m = C28203u6.m141801m(C28203u6.f131407a, c28611c2.f132658a, false, 2, null);
                if (m141801m != null) {
                    C29210k.b bVar = C29210k.Companion;
                    long j14 = bVar.m145896a().m145892x(c28611c2.f132658a).f132637d;
                    C28611c m143056q = new C28610b(AbstractC23306f.m120584H0().m2638u(m141801m), 1, 0L, 0L).m143056q(bVar.m145896a().m145867f0(c28611c2.f132658a));
                    if (m143056q != null) {
                        long j15 = m143056q.f132661d;
                        if (j15 > j14) {
                            j14 = j15;
                        }
                    }
                    j11 = j14;
                } else {
                    j11 = 0;
                }
            } else {
                str2 = str4;
                i11 = size2;
                j11 = 0;
                j12 = 0;
            }
            arrayList2.add(new C28612d(str5, j11, j12));
            i14++;
            list2 = list;
            size2 = i11;
            str4 = str2;
        }
        c0766k.mo1671k4(arrayList2, z11, i12, 0);
        C29199a.m145771a(m145963q + " param data: " + TextUtils.join(",", arrayList2) + ", isGroup= " + z11 + ", loadType= " + i12 + ", retry count: " + this.f135408h);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v5, types: [gw.c0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v3, types: [gw.c0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v7, types: [gw.c0, java.lang.Object] */
    /* renamed from: B */
    private final Map m145947B(C19617c0 c19617c0) {
        HashMap hashMap = new HashMap();
        for (C17945a0 c17945a0 : c19617c0.m102655i()) {
            String mo95039W2 = c17945a0.mo95039W2();
            AbstractC19074t.m100207e(mo95039W2, "getOwnerId(...)");
            ?? r32 = hashMap.get(mo95039W2);
            if (r32 == 0) {
                r32 = new C19617c0();
                r32.m102650c(c19617c0);
                hashMap.put(mo95039W2, r32);
            }
            ((C19617c0) r32).m102655i().add(c17945a0);
        }
        Iterator it = c19617c0.m102654h().iterator();
        while (it.hasNext()) {
            C17945a0 c17945a02 = (C17945a0) it.next();
            String mo95039W22 = c17945a02.mo95039W2();
            AbstractC19074t.m100207e(mo95039W22, "getOwnerId(...)");
            ?? r52 = hashMap.get(mo95039W22);
            if (r52 == 0) {
                r52 = new C19617c0();
                r52.m102650c(c19617c0);
                hashMap.put(mo95039W22, r52);
            }
            ((C19617c0) r52).m102654h().add(c17945a02);
        }
        Iterator it2 = c19617c0.m102653g().iterator();
        while (it2.hasNext()) {
            C17945a0 c17945a03 = (C17945a0) it2.next();
            String mo95039W23 = c17945a03.mo95039W2();
            AbstractC19074t.m100207e(mo95039W23, "getOwnerId(...)");
            ?? r53 = hashMap.get(mo95039W23);
            if (r53 == 0) {
                r53 = new C19617c0();
                r53.m102650c(c19617c0);
                hashMap.put(mo95039W23, r53);
            }
            ((C19617c0) r53).m102653g().add(c17945a03);
        }
        return hashMap;
    }

    /* renamed from: i */
    private final boolean m145956i(String str) {
        FirstUnreadMsg m102791v = C19636i1.Companion.m102800a().m102791v(str);
        C28609a m145892x = C29210k.Companion.m145896a().m145892x(str);
        if (m102791v != null && m145892x.f132637d <= m102791v.m41022a()) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    private final boolean m145957j(Long l11, Long l12, Long l13) {
        if (l11 != null && l12 != null && l13 != null && l11.longValue() > l12.longValue()) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    private final void m145958k() {
        C29199a.m145771a("PullPreviewMsgTask completeTask");
        this.f135405e = false;
        this.f135401a.mo145908a();
    }

    /* renamed from: l */
    private final void m145959l(List list, List list2) {
        if (list.isEmpty() && list2.isEmpty()) {
            return;
        }
        C19461e m120600M1 = AbstractC23306f.m120600M1();
        AbstractC19074t.m100207e(m120600M1, "provideUndoDeleteMessageProcessor(...)");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C19461e.m101777i(m120600M1, (C17945a0) it.next(), false, 2, null);
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            C19461e.m101774e(m120600M1, (C17945a0) it2.next(), false, 2, null);
        }
    }

    /* renamed from: m */
    public static final void m145960m(C29224y c29224y) {
        AbstractC19074t.m100208f(c29224y, "this$0");
        try {
            if (c29224y.f135405e && !c29224y.f135407g) {
                boolean z11 = true;
                if (C23055e5.m118273h(false, 1, null) && C29628e.m147249E0().m93432x()) {
                    if (c29224y.f135404d && C26688i.f126427a.m137070d().m137119b()) {
                        z11 = false;
                    }
                    c29224y.m145946A(c29224y.f135402b, c29224y.f135404d, z11);
                    return;
                }
                c29224y.m145961o(3000L);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: o */
    private final void m145961o(long j11) {
        this.f135403c.removeCallbacks(this.f135406f);
        this.f135403c.postDelayed(this.f135406f, j11);
    }

    /* renamed from: p */
    public final String m145962p() {
        String m93451f = CoreUtils.m93451f();
        StringBuilder sb2 = new StringBuilder();
        int i11 = 0;
        while (sb2.length() < 16) {
            sb2.append(m93451f.charAt(i11));
            i11 += 2;
        }
        int length = m93451f.length() - 1;
        while (sb2.length() < 32) {
            sb2.append(m93451f.charAt(length));
            length -= 2;
        }
        String sb3 = sb2.toString();
        AbstractC19074t.m100207e(sb3, "toString(...)");
        return sb3;
    }

    /* renamed from: q */
    private final String m145963q(boolean z11) {
        return z11 ? "PullPreviewMsgTask pullMsgMultiFromCloud" : "PullPreviewMsgTask pullMsgMultiFromCloudHttp";
    }

    /* renamed from: r */
    private final void m145964r(String str) {
        try {
            C29210k.Companion.m145896a().m145843N0(str, false);
            C23744a.Companion.m124119a().m124116d(133, str);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: ws.v.<init>(ws.y, java.lang.String, java.lang.String, gw.c0, gw.c0, boolean, java.util.List, java.util.Map, java.util.Map, java.util.Map, java.util.concurrent.atomic.AtomicInteger):void, class status: GENERATED_AND_UNLOADED
        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:289)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isArgUnused(ProcessVariables.java:146)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.lambda$isVarUnused$0(ProcessVariables.java:131)
        	at jadx.core.utils.ListUtils.allMatch(ListUtils.java:172)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isVarUnused(ProcessVariables.java:131)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:64)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    /* renamed from: s */
    public final void m145965s(java.util.List r28, int r29, p585vs.C28614f r30) {
        /*
            Method dump skipped, instructions count: 898
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ws.C29224y.m145965s(java.util.List, int, vs.f):void");
    }

    /* renamed from: t */
    public static final void m145966t(C29224y c29224y, String str, String str2, C19617c0 c19617c0, C19617c0 c19617c02, boolean z11, List list, Map map, Map map2, Map map3, AtomicInteger atomicInteger) {
        C23288a c23288a;
        RunnableC29223x runnableC29223x;
        Object obj;
        MessageId messageId;
        AbstractC19074t.m100208f(c29224y, "this$0");
        AbstractC19074t.m100208f(str2, "$threadId");
        AbstractC19074t.m100208f(c19617c0, "$threadMsgParser");
        AbstractC19074t.m100208f(c19617c02, "$messageParserSeen");
        AbstractC19074t.m100208f(list, "$jobs");
        AbstractC19074t.m100208f(map, "$minMsgIdInPageSeenMap");
        AbstractC19074t.m100208f(map2, "$minMsgIdInPageLastMap");
        AbstractC19074t.m100208f(map3, "$maxMsgIdInPageSeenMap");
        AbstractC19074t.m100208f(atomicInteger, "$numThreadRemain");
        try {
            try {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(c19617c0.m102655i());
                AbstractC19074t.m100205c(str);
                List m145971y = c29224y.m145971y(str, str2, c19617c0, c19617c02, z11);
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (AbstractC19074t.m100204b(((C28611c) obj).f132658a, str2)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                C28611c c28611c = (C28611c) obj;
                if (c28611c != null && (!arrayList.isEmpty())) {
                    MessageId messageId2 = (MessageId) map.get(str2);
                    MessageId messageId3 = (MessageId) map2.get(str2);
                    MessageId messageId4 = (MessageId) map3.get(str2);
                    if (z11) {
                        messageId = ((C17945a0) arrayList.get(0)).m95029V3();
                    } else {
                        messageId = messageId3;
                    }
                    c29224y.m145972z(str2, arrayList, m145971y, c28611c, z11, messageId, messageId2, messageId4, messageId3);
                }
                c29224y.m145964r(str2);
                c23288a = C23288a.f113033a;
                runnableC29223x = new Runnable() { // from class: ws.x

                    /* renamed from: p */
                    public final /* synthetic */ AtomicInteger f135399p;

                    /* renamed from: q */
                    public final /* synthetic */ C29224y f135400q;

                    public /* synthetic */ RunnableC29223x(AtomicInteger atomicInteger2, C29224y c29224y2) {
                        r1 = atomicInteger2;
                        r2 = c29224y2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C29224y.m145967u(r1, r2);
                    }
                };
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
                c23288a = C23288a.f113033a;
                runnableC29223x = new Runnable() { // from class: ws.x

                    /* renamed from: p */
                    public final /* synthetic */ AtomicInteger f135399p;

                    /* renamed from: q */
                    public final /* synthetic */ C29224y f135400q;

                    public /* synthetic */ RunnableC29223x(AtomicInteger atomicInteger2, C29224y c29224y2) {
                        r1 = atomicInteger2;
                        r2 = c29224y2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C29224y.m145967u(r1, r2);
                    }
                };
            }
            AbstractC18429d.m97660a(c23288a, runnableC29223x);
        } catch (Throwable th2) {
            AbstractC18429d.m97660a(C23288a.f113033a, new Runnable() { // from class: ws.x

                /* renamed from: p */
                public final /* synthetic */ AtomicInteger f135399p;

                /* renamed from: q */
                public final /* synthetic */ C29224y f135400q;

                public /* synthetic */ RunnableC29223x(AtomicInteger atomicInteger2, C29224y c29224y2) {
                    r1 = atomicInteger2;
                    r2 = c29224y2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C29224y.m145967u(r1, r2);
                }
            });
            throw th2;
        }
    }

    /* renamed from: u */
    public static final void m145967u(AtomicInteger atomicInteger, C29224y c29224y) {
        AbstractC19074t.m100208f(atomicInteger, "$numThreadRemain");
        AbstractC19074t.m100208f(c29224y, "this$0");
        if (atomicInteger.decrementAndGet() <= 0) {
            c29224y.m145958k();
        }
    }

    /* renamed from: v */
    public static final void m145968v(C29224y c29224y) {
        AbstractC19074t.m100208f(c29224y, "this$0");
        c29224y.m145958k();
    }

    /* renamed from: w */
    public static final void m145969w(C28611c c28611c) {
        AbstractC19074t.m100208f(c28611c, "$job");
        C7959d.Companion.m41850e().m41839y0(c28611c.f132658a, c28611c.f132659b, c28611c.f132661d, c28611c.f132662e);
    }

    /* renamed from: x */
    public final void m145970x(int i11) {
        boolean z11;
        int i12;
        try {
            int i13 = this.f135408h + 1;
            this.f135408h = i13;
            C29199a.m145771a("PullPreviewMsgTask processErrorPullPreview errorCode: " + i11 + ", retryCount: " + i13);
            if (i11 != -69 && (i12 = this.f135408h) < 3) {
                this.f135407g = false;
                m145961o(AbstractC23160o0.m119261j0(i12, 500L));
                return;
            }
            for (C28611c c28611c : this.f135402b) {
                C29210k m145896a = C29210k.Companion.m145896a();
                String str = c28611c.f132658a;
                if (i11 != -69 && this.f135408h < 3) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                m145896a.m145843N0(str, z11);
            }
            m145958k();
        } catch (Exception e11) {
            AbstractC23350e.m122776f("PullPreviewMsgTask", e11);
        }
    }

    /* renamed from: y */
    private final List m145971y(String str, String str2, C19617c0 c19617c0, C19617c0 c19617c02, boolean z11) {
        List m147070b;
        LinkedList linkedList = new LinkedList();
        try {
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
        if (c19617c0.m102655i().isEmpty()) {
            return linkedList;
        }
        String m145963q = m145963q(z11);
        m145959l(c19617c0.m102654h(), c19617c0.m102653g());
        c19617c0.m102651d(C0876j.Companion.m2644a().m2640w(str2), true);
        List m102655i = c19617c0.m102655i();
        if (m102655i.isEmpty()) {
            return linkedList;
        }
        C29199a.m145771a(m145963q + " size(parsed->filter): " + m102655i.size());
        C29594j m120677j0 = AbstractC23306f.m120677j0();
        AbstractC19074t.m100207e(m120677j0, "provideInsertMessageMultiUseCase(...)");
        C20072c m120575E0 = AbstractC23306f.m120575E0();
        AbstractC19074t.m100207e(m120575E0, "provideMessagePostProcessor(...)");
        List m103018q0 = AbstractC19646n0.m103018q0(m102655i);
        AbstractC19074t.m100207e(m103018q0, "generateCheckDupInfos(...)");
        C20072c c20072c = m120575E0;
        C29594j.b bVar = (C29594j.b) m120677j0.m101509a(new C29594j.a(str, str2, m102655i, InterfaceC3534b.g.f14899a, m103018q0, false, false, null, 224, null));
        if (bVar != null && (m147070b = bVar.m147070b()) != null) {
            linkedList.addAll(m147070b);
        }
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            C20072c c20072c2 = c20072c;
            c20072c2.m104338d(str, (C17945a0) it.next(), InterfaceC3534b.g.f14899a);
            c20072c = c20072c2;
        }
        C29210k.Companion.m145896a().m145889v0(str2, System.currentTimeMillis());
        if (!z11 && m145956i(str2) && (!linkedList.isEmpty()) && m145956i(str2)) {
            Object obj = linkedList.get(0);
            AbstractC19074t.m100207e(obj, "get(...)");
            C17945a0 c17945a0 = (C17945a0) obj;
            if (c19617c02.m102655i().contains(c17945a0)) {
                C19636i1.Companion.m102800a().m102744C0(str2, c17945a0);
            }
        }
        C29199a.m145771a(m145963q + " threadId=" + str2 + ", loaded msg size=" + m102655i.size() + ", inserted msg size=" + linkedList.size());
        return linkedList;
    }

    /* renamed from: z */
    private final void m145972z(String str, List list, List list2, C28611c c28611c, boolean z11, MessageId messageId, MessageId messageId2, MessageId messageId3, MessageId messageId4) {
        try {
            String m145963q = m145963q(z11);
            if ((!list.isEmpty()) && messageId != null) {
                C29199a.m145771a(m145963q + " job=" + c28611c.m143076h());
                if (!list2.isEmpty()) {
                    if (z11) {
                        if (c28611c.f132661d == 0) {
                            if (c28611c.f132662e != 0) {
                            }
                            C7959d.Companion.m41850e().m41839y0(c28611c.f132658a, c28611c.f132659b, c28611c.f132661d, c28611c.f132662e);
                        }
                        if (messageId.m41047k() > c28611c.f132661d) {
                            C7959d.Companion.m41850e().m41692C3(c28611c.f132658a, messageId.m41047k(), c28611c.f132661d, c28611c.f132662e);
                        }
                        C7959d.Companion.m41850e().m41839y0(c28611c.f132658a, c28611c.f132659b, c28611c.f132661d, c28611c.f132662e);
                    } else {
                        long m41047k = messageId.m41047k();
                        long j11 = c28611c.f132661d;
                        if (m41047k <= j11) {
                            C7959d.Companion.m41850e().m41839y0(c28611c.f132658a, c28611c.f132659b, c28611c.f132661d, c28611c.f132662e);
                        } else if (j11 == 0 && c28611c.f132662e == 0) {
                            C7959d.a aVar = C7959d.Companion;
                            aVar.m41850e().m41839y0(c28611c.f132658a, c28611c.f132659b, c28611c.f132661d, c28611c.f132662e);
                            if (messageId3 != null && messageId3.m41047k() < messageId.m41047k()) {
                                c28611c.f132659b = messageId.m41047k();
                                c28611c.f132661d = messageId3.m41047k();
                                ArrayList arrayList = new ArrayList();
                                arrayList.add(c28611c);
                                aVar.m41850e().m41735P1(arrayList);
                            }
                        } else {
                            C7959d.Companion.m41850e().m41692C3(c28611c.f132658a, messageId.m41047k(), c28611c.f132661d, c28611c.f132662e);
                        }
                    }
                } else {
                    C7959d.Companion.m41850e().m41839y0(c28611c.f132658a, c28611c.f132659b, c28611c.f132661d, c28611c.f132662e);
                }
                if (!z11 && messageId2 != null && messageId3 != null && messageId4 != null && m145957j(Long.valueOf(messageId4.m41047k()), Long.valueOf(messageId3.m41047k()), Long.valueOf(messageId2.m41047k()))) {
                    C29210k.b bVar = C29210k.Companion;
                    bVar.m145896a().m145842M0(str);
                    bVar.m145896a().m145851U0(str, messageId3.m41047k(), messageId3.m41045i(), messageId3.m41047k(), messageId2.m41047k(), messageId2.m41045i());
                    return;
                }
                return;
            }
            C29199a.m145771a(m145963q + " Msg list empty. All jobs duplicated!!!");
            if (!z11 && messageId2 != null) {
                if (messageId2.m41047k() <= c28611c.f132661d) {
                    C7959d.Companion.m41850e().m41839y0(c28611c.f132658a, c28611c.f132659b, c28611c.f132661d, c28611c.f132662e);
                    return;
                } else {
                    C7959d.Companion.m41850e().m41692C3(c28611c.f132658a, messageId2.m41047k(), c28611c.f132661d, c28611c.f132662e);
                    return;
                }
            }
            C7959d.Companion.m41850e().m41839y0(c28611c.f132658a, c28611c.f132659b, c28611c.f132661d, c28611c.f132662e);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: n */
    public final void m145973n() {
        this.f135405e = true;
        AbstractC0837p0.Companion.m2237f().mo2040a(this.f135406f);
    }
}
