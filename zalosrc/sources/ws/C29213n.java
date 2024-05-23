package ws;

import ae.C0766k;
import ag0.AbstractC0837p0;
import ag0.C0815e1;
import am.AbstractC0924m0;
import com.zing.zalo.data.chat.model.tabmessage.Conversation;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.p062db.C7956b;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalocore.CoreUtility;
import dj.C17945a0;
import eg0.AbstractC18428c;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import gw.AbstractC19646n0;
import gw.C19617c0;
import gw.C19669z;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kw.C21956b;
import mg.C23288a;
import mm0.AbstractC23350e;
import on0.AbstractC24342w;
import org.json.JSONObject;
import p056cj.C3535c;
import p056cj.InterfaceC3534b;
import p185gc.AbstractC19378b;
import p186gj.C19461e;
import p212hj.AbstractC20070a;
import p248iy.AbstractC20887g;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23306f;
import p363nh.C23744a;
import p392oh.C24261h;
import p461qu.AbstractC25495a;
import p528ts.C26893h;
import p585vs.C28610b;
import p585vs.C28611c;
import p585vs.C28613e;
import p667y2.C30268e;
import p716zh.C31909f1;
import pm0.C24848g0;
import su.AbstractC26389c;
import th.AbstractC26681b;
import wd0.C28931k;
import ws.C29210k;
import ws.C29213n;

/* renamed from: ws.n */
/* loaded from: classes4.dex */
public final class C29213n {
    public static final a Companion = new a(null);

    /* renamed from: i */
    private static int f135330i = -69;

    /* renamed from: a */
    private volatile boolean f135331a;

    /* renamed from: b */
    public volatile boolean f135332b;

    /* renamed from: c */
    private volatile boolean f135333c;

    /* renamed from: d */
    private final C28610b f135334d;

    /* renamed from: e */
    private final WeakReference f135335e;

    /* renamed from: f */
    private final String f135336f;

    /* renamed from: g */
    private final C3535c f135337g;

    /* renamed from: h */
    public long f135338h;

    /* renamed from: ws.n$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: ws.n$b */
    /* loaded from: classes4.dex */
    public interface b {
        /* renamed from: a */
        void mo64332a(C28610b c28610b);

        /* renamed from: b */
        void mo64333b(C28610b c28610b);

        /* renamed from: c */
        void mo64334c(C28610b c28610b);

        /* renamed from: d */
        void mo64335d(C28610b c28610b, List list, boolean z11, MessageId messageId);

        /* renamed from: e */
        void mo64336e(C28610b c28610b);
    }

    /* renamed from: ws.n$c */
    /* loaded from: classes4.dex */
    public static final class c implements InterfaceC20094a {

        /* renamed from: b */
        final /* synthetic */ C28610b f135340b;

        /* renamed from: c */
        final /* synthetic */ MessageId f135341c;

        /* renamed from: d */
        final /* synthetic */ long f135342d;

        c(C28610b c28610b, MessageId messageId, long j11) {
            this.f135340b = c28610b;
            this.f135341c = messageId;
            this.f135342d = j11;
        }

        /* renamed from: d */
        public static final void m145937d(C29213n c29213n, C28610b c28610b, MessageId messageId, C28613e c28613e) {
            AbstractC19074t.m100208f(c29213n, "this$0");
            AbstractC19074t.m100208f(c28610b, "$pullMsgCommand");
            AbstractC19074t.m100208f(messageId, "$messageId");
            AbstractC19074t.m100208f(c28613e, "$responseInfo");
            c29213n.m145932z(c28610b, 0, c29213n.m145928v(), messageId, c28613e);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "errorMessage");
            C29199a.m145772b("[MyCloud] checkCreateGapPullMsgMyCloudHttp#onErrorData errorMessage=" + c20096c);
            AbstractC23350e.m122780j("CHAT_PULL_OFFLINE_TAG time request: " + (System.currentTimeMillis() - this.f135342d), new Object[0]);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            JSONObject jSONObject;
            JSONObject jSONObject2;
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
                if (optInt == 0) {
                    String m135986b = AbstractC26389c.m135986b(AbstractC19646n0.m102893G(), jSONObject.optString("data"));
                    AbstractC19074t.m100207e(m135986b, "decryptionAES(...)");
                    if (m135986b.length() > 0) {
                        jSONObject2 = new JSONObject(m135986b);
                    } else {
                        jSONObject2 = new JSONObject();
                    }
                    AbstractC18428c.m97659b(C23288a.f113033a, C29213n.this.f135336f, 0, new Runnable() { // from class: ws.o

                        /* renamed from: q */
                        public final /* synthetic */ C28610b f135363q;

                        /* renamed from: r */
                        public final /* synthetic */ MessageId f135364r;

                        /* renamed from: s */
                        public final /* synthetic */ C28613e f135365s;

                        public /* synthetic */ RunnableC29214o(C28610b c28610b, MessageId messageId, C28613e c28613e) {
                            r2 = c28610b;
                            r3 = messageId;
                            r4 = c28613e;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            C29213n.c.m145937d(C29213n.this, r2, r3, r4);
                        }
                    }, 2, null);
                    return;
                }
                String optString = jSONObject.optString("errMessage");
                AbstractC20887g.m109230h(124601, "checkCreateGapPullMsgMyCloudHttp errorCode=" + optInt + ", errorMessage=" + optString);
                C29199a.m145772b("[MyCloud] checkCreateGapPullMsgMyCloudHttp#onDataProcessed errorCode=" + optInt + ", errorMessage=" + optString);
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: ws.n$d */
    /* loaded from: classes4.dex */
    public static final class d implements InterfaceC20094a {

        /* renamed from: b */
        final /* synthetic */ long f135344b;

        /* renamed from: c */
        final /* synthetic */ int f135345c;

        /* renamed from: d */
        final /* synthetic */ C28610b f135346d;

        /* renamed from: e */
        final /* synthetic */ MessageId f135347e;

        d(long j11, int i11, C28610b c28610b, MessageId messageId) {
            this.f135344b = j11;
            this.f135345c = i11;
            this.f135346d = c28610b;
            this.f135347e = messageId;
        }

        /* renamed from: d */
        public static final void m145939d(C29213n c29213n, C28610b c28610b, int i11, MessageId messageId, C28613e c28613e) {
            AbstractC19074t.m100208f(c29213n, "this$0");
            AbstractC19074t.m100208f(c28610b, "$pullMsgCommand");
            AbstractC19074t.m100208f(messageId, "$messageId");
            AbstractC19074t.m100208f(c28613e, "$responseInfo");
            c29213n.m145932z(c28610b, i11, c29213n.m145928v(), messageId, c28613e);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            b bVar;
            AbstractC19074t.m100208f(c20096c, "errorMessage");
            C29199a.m145772b("PullMsgTask getCloudMsg ERROR errorMessage=" + c20096c);
            C29213n.this.m145931y(this.f135344b, System.currentTimeMillis(), C29213n.this.f135336f, 1853, false);
            C29213n.this.f135337g.m17957V0(false);
            WeakReference weakReference = C29213n.this.f135335e;
            if (weakReference != null && (bVar = (b) weakReference.get()) != null) {
                C28610b c28610b = this.f135346d;
                C29213n c29213n = C29213n.this;
                bVar.mo64335d(c28610b, new ArrayList(), c29213n.f135337g.m17937B0(), this.f135347e);
                bVar.mo64336e(c28610b);
                c29213n.f135337g.m17950O0(0);
            }
            C29213n.this.m145920l();
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            b bVar;
            b bVar2;
            AbstractC19074t.m100208f(obj, "response");
            try {
                JSONObject jSONObject = (JSONObject) obj;
                int optInt = jSONObject.optInt(C30268e.f140632a, 0);
                C28613e m143091a = C28613e.Companion.m143091a(jSONObject);
                MessageId m143084e = m143091a.m143084e(C29213n.this.f135336f);
                C29213n.this.f135337g.m17952Q0(m143091a.m143085f());
                C29213n.this.f135337g.m17956U0(m143084e);
                C29213n.this.f135337g.m17953R0(m143091a.m143082c());
                C29199a.m145771a("PullMsgTask getCloudMsg RESPONSE errorCode=" + optInt + ", isOld=" + C29213n.this.f135337g.m17945J0() + ", hasMore=" + C29213n.this.f135337g.m17937B0() + ", lastCloudMsgId=" + C29213n.this.f135337g.m17939D0());
                if (m143091a.m143083d().length() <= 0) {
                    C29213n.this.m145931y(this.f135344b, System.currentTimeMillis(), C29213n.this.f135336f, this.f135345c, true);
                    C29213n.this.f135337g.m17957V0(false);
                    if (!C29213n.this.f135337g.m17937B0() || C29213n.this.m145930x(optInt)) {
                        WeakReference weakReference = C29213n.this.f135335e;
                        if (weakReference != null && (bVar2 = (b) weakReference.get()) != null) {
                            C28610b c28610b = this.f135346d;
                            C29213n c29213n = C29213n.this;
                            bVar2.mo64335d(c28610b, new ArrayList(), c29213n.f135337g.m17937B0(), m143084e);
                            bVar2.mo64336e(c28610b);
                            c29213n.f135337g.m17950O0(0);
                            c29213n.f135337g.m17957V0(false);
                        }
                        C29213n.this.m145920l();
                        return;
                    }
                    C29213n.this.m145920l();
                    WeakReference weakReference2 = C29213n.this.f135335e;
                    if (weakReference2 != null) {
                        C28610b c28610b2 = this.f135346d;
                        C29213n c29213n2 = C29213n.this;
                        if (c28610b2.m143065z()) {
                            C29210k.Companion.m145896a().m145881r(c29213n2.f135336f, (b) weakReference2.get());
                            return;
                        } else {
                            if (c28610b2.m143034A()) {
                                C29210k.Companion.m145896a().m145883s(c29213n2.f135336f, m143084e, (b) weakReference2.get());
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                C29213n.this.f135337g.m17958W0(C29213n.this.f135337g.m17942G0() + 1);
                C29213n.this.m145931y(this.f135344b, System.currentTimeMillis(), C29213n.this.f135336f, this.f135345c, true);
                AbstractC18428c.m97658a(C23288a.f113033a, C29213n.this.f135336f, 5, new Runnable() { // from class: ws.p

                    /* renamed from: q */
                    public final /* synthetic */ C28610b f135367q;

                    /* renamed from: r */
                    public final /* synthetic */ int f135368r;

                    /* renamed from: s */
                    public final /* synthetic */ MessageId f135369s;

                    /* renamed from: t */
                    public final /* synthetic */ C28613e f135370t;

                    public /* synthetic */ RunnableC29215p(C28610b c28610b3, int i11, MessageId messageId, C28613e m143091a2) {
                        r2 = c28610b3;
                        r3 = i11;
                        r4 = messageId;
                        r5 = m143091a2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C29213n.d.m145939d(C29213n.this, r2, r3, r4, r5);
                    }
                });
            } catch (Exception e11) {
                WeakReference weakReference3 = C29213n.this.f135335e;
                if (weakReference3 != null && (bVar = (b) weakReference3.get()) != null) {
                    C28610b c28610b3 = this.f135346d;
                    C29213n c29213n3 = C29213n.this;
                    bVar.mo64335d(c28610b3, new ArrayList(), c29213n3.f135337g.m17937B0(), this.f135347e);
                    bVar.mo64336e(c28610b3);
                    c29213n3.f135337g.m17957V0(false);
                    c29213n3.f135337g.m17950O0(0);
                }
                C29213n.this.m145920l();
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: ws.n$e */
    /* loaded from: classes4.dex */
    public static final class e implements InterfaceC20094a {

        /* renamed from: b */
        final /* synthetic */ C28610b f135349b;

        /* renamed from: c */
        final /* synthetic */ int f135350c;

        /* renamed from: d */
        final /* synthetic */ MessageId f135351d;

        /* renamed from: e */
        final /* synthetic */ long f135352e;

        e(C28610b c28610b, int i11, MessageId messageId, long j11) {
            this.f135349b = c28610b;
            this.f135350c = i11;
            this.f135351d = messageId;
            this.f135352e = j11;
        }

        /* renamed from: d */
        public static final void m145941d(C29213n c29213n, C28610b c28610b, int i11, MessageId messageId, C28613e c28613e) {
            AbstractC19074t.m100208f(c29213n, "this$0");
            AbstractC19074t.m100208f(c28610b, "$pullMsgCommand");
            AbstractC19074t.m100208f(messageId, "$messageId");
            AbstractC19074t.m100208f(c28613e, "$responseInfo");
            c29213n.m145932z(c28610b, i11, c29213n.m145928v(), messageId, c28613e);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            b bVar;
            AbstractC19074t.m100208f(c20096c, "errorMessage");
            C29199a.m145772b("PullMsgTask getCloudMsgAndJumpToMsg ERROR errorMessage=" + c20096c);
            C29213n.this.m145931y(this.f135352e, System.currentTimeMillis(), C29213n.this.f135336f, 1853, false);
            C29213n.this.f135337g.m17957V0(false);
            WeakReference weakReference = C29213n.this.f135335e;
            if (weakReference != null && (bVar = (b) weakReference.get()) != null) {
                C28610b c28610b = this.f135349b;
                bVar.mo64335d(c28610b, new ArrayList(), C29213n.this.f135337g.m17937B0(), this.f135351d);
                bVar.mo64334c(c28610b);
                bVar.mo64336e(c28610b);
            }
            C29213n.this.m145920l();
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
            jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: ws.q.<init>(ws.n, vs.b, int, com.zing.zalo.data.entity.chat.message.MessageId, vs.e):void, class status: GENERATED_AND_UNLOADED
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
        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.String r0 = "response"
                fn0.AbstractC19074t.m100208f(r10, r0)
                r0 = 0
                org.json.JSONObject r10 = (org.json.JSONObject) r10     // Catch: java.lang.Exception -> L32
                java.lang.String r1 = "e"
                int r1 = r10.optInt(r1, r0)     // Catch: java.lang.Exception -> L32
                vs.e$a r2 = p585vs.C28613e.Companion     // Catch: java.lang.Exception -> L32
                vs.e r8 = r2.m143091a(r10)     // Catch: java.lang.Exception -> L32
                if (r1 != 0) goto L34
                mg.a r10 = mg.C23288a.f113033a     // Catch: java.lang.Exception -> L32
                ws.n r1 = ws.C29213n.this     // Catch: java.lang.Exception -> L32
                java.lang.String r1 = ws.C29213n.m145914e(r1)     // Catch: java.lang.Exception -> L32
                ws.n r4 = ws.C29213n.this     // Catch: java.lang.Exception -> L32
                vs.b r5 = r9.f135349b     // Catch: java.lang.Exception -> L32
                int r6 = r9.f135350c     // Catch: java.lang.Exception -> L32
                com.zing.zalo.data.entity.chat.message.MessageId r7 = r9.f135351d     // Catch: java.lang.Exception -> L32
                ws.q r2 = new ws.q     // Catch: java.lang.Exception -> L32
                r3 = r2
                r3.<init>()     // Catch: java.lang.Exception -> L32
                r3 = 5
                eg0.AbstractC18428c.m97658a(r10, r1, r3, r2)     // Catch: java.lang.Exception -> L32
                goto La7
            L32:
                r10 = move-exception
                goto L6a
            L34:
                ws.n r10 = ws.C29213n.this     // Catch: java.lang.Exception -> L32
                cj.c r10 = ws.C29213n.m145912c(r10)     // Catch: java.lang.Exception -> L32
                r10.m17957V0(r0)     // Catch: java.lang.Exception -> L32
                ws.n r10 = ws.C29213n.this     // Catch: java.lang.Exception -> L32
                java.lang.ref.WeakReference r10 = ws.C29213n.m145913d(r10)     // Catch: java.lang.Exception -> L32
                if (r10 == 0) goto La7
                java.lang.Object r10 = r10.get()     // Catch: java.lang.Exception -> L32
                ws.n$b r10 = (ws.C29213n.b) r10     // Catch: java.lang.Exception -> L32
                if (r10 == 0) goto La7
                vs.b r1 = r9.f135349b     // Catch: java.lang.Exception -> L32
                ws.n r2 = ws.C29213n.this     // Catch: java.lang.Exception -> L32
                com.zing.zalo.data.entity.chat.message.MessageId r3 = r9.f135351d     // Catch: java.lang.Exception -> L32
                java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Exception -> L32
                r4.<init>()     // Catch: java.lang.Exception -> L32
                cj.c r2 = ws.C29213n.m145912c(r2)     // Catch: java.lang.Exception -> L32
                boolean r2 = r2.m17937B0()     // Catch: java.lang.Exception -> L32
                r10.mo64335d(r1, r4, r2, r3)     // Catch: java.lang.Exception -> L32
                r10.mo64334c(r1)     // Catch: java.lang.Exception -> L32
                r10.mo64336e(r1)     // Catch: java.lang.Exception -> L32
                goto La7
            L6a:
                ws.n r1 = ws.C29213n.this
                cj.c r1 = ws.C29213n.m145912c(r1)
                r1.m17957V0(r0)
                ws.n r0 = ws.C29213n.this
                java.lang.ref.WeakReference r0 = ws.C29213n.m145913d(r0)
                if (r0 == 0) goto L9f
                java.lang.Object r0 = r0.get()
                ws.n$b r0 = (ws.C29213n.b) r0
                if (r0 == 0) goto L9f
                vs.b r1 = r9.f135349b
                ws.n r2 = ws.C29213n.this
                com.zing.zalo.data.entity.chat.message.MessageId r3 = r9.f135351d
                java.util.ArrayList r4 = new java.util.ArrayList
                r4.<init>()
                cj.c r2 = ws.C29213n.m145912c(r2)
                boolean r2 = r2.m17937B0()
                r0.mo64335d(r1, r4, r2, r3)
                r0.mo64334c(r1)
                r0.mo64336e(r1)
            L9f:
                ws.n r0 = ws.C29213n.this
                ws.C29213n.m145911b(r0)
                mm0.AbstractC23350e.m122778h(r10)
            La7:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ws.C29213n.e.mo927b(java.lang.Object):void");
        }
    }

    /* renamed from: ws.n$f */
    /* loaded from: classes4.dex */
    public static final class f implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ long f135353a;

        /* renamed from: b */
        final /* synthetic */ C29213n f135354b;

        /* renamed from: c */
        final /* synthetic */ C28610b f135355c;

        /* renamed from: d */
        final /* synthetic */ int f135356d;

        /* renamed from: e */
        final /* synthetic */ MessageId f135357e;

        f(long j11, C29213n c29213n, C28610b c28610b, int i11, MessageId messageId) {
            this.f135353a = j11;
            this.f135354b = c29213n;
            this.f135355c = c28610b;
            this.f135356d = i11;
            this.f135357e = messageId;
        }

        /* renamed from: d */
        public static final void m145943d(C29213n c29213n, C28610b c28610b, int i11, MessageId messageId, C28613e c28613e) {
            AbstractC19074t.m100208f(c29213n, "this$0");
            AbstractC19074t.m100208f(c28610b, "$pullMsgCommand");
            AbstractC19074t.m100208f(messageId, "$messageId");
            AbstractC19074t.m100208f(c28613e, "$responseInfo");
            c29213n.m145932z(c28610b, i11, c29213n.m145928v(), messageId, c28613e);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            b bVar;
            AbstractC19074t.m100208f(c20096c, "errorMessage");
            AbstractC23350e.m122780j("CHAT_PULL_OFFLINE_TAG time request: " + (System.currentTimeMillis() - this.f135353a), new Object[0]);
            WeakReference weakReference = this.f135354b.f135335e;
            if (weakReference != null && (bVar = (b) weakReference.get()) != null) {
                C28610b c28610b = this.f135355c;
                bVar.mo64335d(c28610b, new ArrayList(), this.f135354b.f135337g.m17937B0(), this.f135357e);
                bVar.mo64336e(c28610b);
            }
            this.f135354b.m145920l();
            C29199a.m145772b("PullMsgTask getMsgOffline ERROR errorMessage=" + c20096c);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            b bVar;
            JSONObject jSONObject;
            b bVar2;
            try {
                AbstractC23350e.m122780j("CHAT_PULL_OFFLINE_TAG time request: " + (System.currentTimeMillis() - this.f135353a), new Object[0]);
                if (obj instanceof JSONObject) {
                    jSONObject = (JSONObject) obj;
                } else {
                    jSONObject = null;
                }
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                int optInt = jSONObject.optInt(C30268e.f140632a, 0);
                C28613e m143091a = C28613e.Companion.m143091a(jSONObject);
                this.f135354b.f135337g.m17952Q0(m143091a.m143085f());
                this.f135354b.f135337g.m17953R0(m143091a.m143082c());
                C29199a.m145771a("PullMsgTask getMsgOffline RESPONSE errorCode=" + optInt + ", isOld=" + this.f135354b.f135337g.m17945J0() + ", hasMore=" + this.f135354b.f135337g.m17937B0() + ", globalMsgIdForNextRequest=" + m143091a.m143081b() + ", clientMsgIdForNextRequest=" + m143091a.m143080a());
                if (optInt != 0) {
                    WeakReference weakReference = this.f135354b.f135335e;
                    if (weakReference != null && (bVar2 = (b) weakReference.get()) != null) {
                        C28610b c28610b = this.f135355c;
                        C29213n c29213n = this.f135354b;
                        bVar2.mo64335d(c28610b, new ArrayList(), c29213n.f135337g.m17937B0(), m143091a.m143084e(c29213n.f135336f));
                        bVar2.mo64336e(c28610b);
                    }
                    this.f135354b.m145920l();
                    return;
                }
                AbstractC18428c.m97658a(C23288a.f113033a, this.f135354b.f135336f, 5, new Runnable() { // from class: ws.r

                    /* renamed from: q */
                    public final /* synthetic */ C28610b f135377q;

                    /* renamed from: r */
                    public final /* synthetic */ int f135378r;

                    /* renamed from: s */
                    public final /* synthetic */ MessageId f135379s;

                    /* renamed from: t */
                    public final /* synthetic */ C28613e f135380t;

                    public /* synthetic */ RunnableC29217r(C28610b c28610b2, int i11, MessageId messageId, C28613e m143091a2) {
                        r2 = c28610b2;
                        r3 = i11;
                        r4 = messageId;
                        r5 = m143091a2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C29213n.f.m145943d(C29213n.this, r2, r3, r4, r5);
                    }
                });
            } catch (Exception e11) {
                WeakReference weakReference2 = this.f135354b.f135335e;
                if (weakReference2 != null && (bVar = (b) weakReference2.get()) != null) {
                    C28610b c28610b2 = this.f135355c;
                    bVar.mo64335d(c28610b2, new ArrayList(), this.f135354b.f135337g.m17937B0(), this.f135357e);
                    bVar.mo64336e(c28610b2);
                }
                this.f135354b.m145920l();
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: ws.n$g */
    /* loaded from: classes4.dex */
    public static final class g implements InterfaceC20094a {

        /* renamed from: b */
        final /* synthetic */ C28610b f135359b;

        /* renamed from: c */
        final /* synthetic */ MessageId f135360c;

        /* renamed from: d */
        final /* synthetic */ long f135361d;

        g(C28610b c28610b, MessageId messageId, long j11) {
            this.f135359b = c28610b;
            this.f135360c = messageId;
            this.f135361d = j11;
        }

        /* renamed from: d */
        public static final void m145945d(C29213n c29213n, C28610b c28610b, MessageId messageId, C28613e c28613e) {
            AbstractC19074t.m100208f(c29213n, "this$0");
            AbstractC19074t.m100208f(c28610b, "$pullMsgCommand");
            AbstractC19074t.m100208f(messageId, "$messageId");
            AbstractC19074t.m100208f(c28613e, "$responseInfo");
            c29213n.m145932z(c28610b, 0, c29213n.m145928v(), messageId, c28613e);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            b bVar;
            AbstractC19074t.m100208f(c20096c, "errorMessage");
            C29199a.m145772b("PullMsgTask [MyCloud] getMyCloudMsgHttp ERROR errorMessage= " + c20096c);
            AbstractC23350e.m122780j("CHAT_PULL_OFFLINE_TAG time request: " + (System.currentTimeMillis() - this.f135361d), new Object[0]);
            WeakReference weakReference = C29213n.this.f135335e;
            if (weakReference != null && (bVar = (b) weakReference.get()) != null) {
                C28610b c28610b = this.f135359b;
                bVar.mo64335d(c28610b, new ArrayList(), C29213n.this.f135337g.m17937B0(), this.f135360c);
                bVar.mo64336e(c28610b);
            }
            C29213n.this.m145920l();
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            b bVar;
            b bVar2;
            AbstractC19074t.m100208f(obj, "response");
            try {
                JSONObject jSONObject = (JSONObject) obj;
                int optInt = jSONObject.optInt(C30268e.f140632a, 0);
                if (optInt == 0) {
                    String m135986b = AbstractC26389c.m135986b(AbstractC19646n0.m102893G(), jSONObject.optString("data"));
                    AbstractC19074t.m100207e(m135986b, "decryptionAES(...)");
                    if (m135986b.length() == 0) {
                        C29213n.this.m145920l();
                        return;
                    }
                    C28613e m143091a = C28613e.Companion.m143091a(new JSONObject(m135986b));
                    C29213n.this.f135337g.m17953R0(m143091a.m143082c());
                    MessageId m143084e = m143091a.m143084e(C29213n.this.f135336f);
                    MessageId m17939D0 = C29213n.this.f135337g.m17939D0();
                    if (m17939D0 != null) {
                        C29213n c29213n = C29213n.this;
                        if (C29210k.Companion.m145896a().m145836I(m143084e, m17939D0) < 0) {
                            c29213n.f135337g.m17956U0(m143084e);
                        }
                    }
                    C29199a.m145771a("PullMsgTask getMyCloudMsgHttp#onDataProcessed hasMore= " + m143091a.m143082c() + ", msgIdNextRequest=" + m143084e + ", msg size=" + m143091a.m143083d().length());
                    AbstractC18428c.m97658a(C23288a.f113033a, C29213n.this.f135336f, 5, new Runnable() { // from class: ws.s

                        /* renamed from: q */
                        public final /* synthetic */ C28610b f135382q;

                        /* renamed from: r */
                        public final /* synthetic */ MessageId f135383r;

                        /* renamed from: s */
                        public final /* synthetic */ C28613e f135384s;

                        public /* synthetic */ RunnableC29218s(C28610b c28610b, MessageId messageId, C28613e m143091a2) {
                            r2 = c28610b;
                            r3 = messageId;
                            r4 = m143091a2;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            C29213n.g.m145945d(C29213n.this, r2, r3, r4);
                        }
                    });
                    return;
                }
                String optString = jSONObject.optString("errMessage");
                C29199a.m145771a("PullMsgTask [MyCloud] getMyCloudMsgHttp RESPONSE errorMessage= " + optString);
                WeakReference weakReference = C29213n.this.f135335e;
                if (weakReference != null && (bVar2 = (b) weakReference.get()) != null) {
                    C28610b c28610b = this.f135359b;
                    bVar2.mo64335d(c28610b, new ArrayList(), C29213n.this.f135337g.m17937B0(), this.f135360c);
                    bVar2.mo64336e(c28610b);
                }
                C29213n.this.m145920l();
                AbstractC20887g.m109230h(124601, "getGroupCloudMsgHttp errorCode=" + optInt + ", errorMessage=" + optString);
            } catch (Exception e11) {
                WeakReference weakReference2 = C29213n.this.f135335e;
                if (weakReference2 != null && (bVar = (b) weakReference2.get()) != null) {
                    C28610b c28610b2 = this.f135359b;
                    bVar.mo64335d(c28610b2, new ArrayList(), C29213n.this.f135337g.m17937B0(), this.f135360c);
                    bVar.mo64336e(c28610b2);
                }
                C29213n.this.m145920l();
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    public C29213n(b bVar, C28610b c28610b) {
        AbstractC19074t.m100208f(c28610b, "pullMsgCommand");
        this.f135335e = new WeakReference(bVar);
        this.f135334d = c28610b;
        C3535c m143048e = c28610b.m143048e();
        this.f135337g = m143048e;
        this.f135336f = m143048e.m17944I0();
        this.f135338h = C29210k.Companion.m145896a().m145856Y();
    }

    /* renamed from: A */
    private final void m145909A(List list, List list2) {
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

    /* renamed from: k */
    private final void m145919k(List list) {
        Conversation m17971y0 = this.f135337g.m17971y0();
        Conversation m103202S = C19669z.Companion.m103232a().m103202S(m17971y0.f42893q);
        C17945a0 m145852V = C29210k.Companion.m145896a().m145852V(list);
        if (m145852V != null) {
            if (m103202S == null || m103202S.m41008l() < m145852V.m94974P4()) {
                C28931k m120612Q1 = AbstractC23306f.m120612Q1();
                AbstractC19074t.m100207e(m120612Q1, "provideUpdateLastMsgUseCase(...)");
                AbstractC19378b.m101499c(m120612Q1, new C28931k.b(m17971y0, m145852V, C28931k.d.Companion.m144587c()), null, 2, null);
            }
        }
    }

    /* renamed from: l */
    public final void m145920l() {
        C29199a.m145771a("PullMsgTask completeTask id=" + this.f135338h + " commandType=" + this.f135334d.m143057r());
        C29210k.b bVar = C29210k.Companion;
        C29213n m145845P0 = bVar.m145896a().m145845P0(this.f135338h);
        if (m145845P0 != null) {
            if (m145845P0.f135334d.m143055p() != null) {
                if (AbstractC26681b.f126373r) {
                    ToastUtils.m89268p(m145845P0.f135334d.m143051l());
                }
                if (bVar.m145896a().m145880q0(this.f135336f) && !bVar.m145896a().m145882r0() && m145845P0.f135334d.m143038E()) {
                    bVar.m145896a().m145830E();
                    if (AbstractC26681b.f126373r) {
                        ToastUtils.showMess(true, "clear all tasks remain");
                    }
                    C29199a.m145771a("PullMsgTask clear all tasks remain");
                }
                if (m145845P0.f135334d.m143039F()) {
                    bVar.m145896a().m145832F0(this.f135336f, this.f135333c);
                }
            } else if (m145845P0.f135334d.m143062w()) {
                bVar.m145896a().m145826C();
                if (AbstractC26681b.f126373r) {
                    ToastUtils.showMess(true, "clear all tasks auto preload");
                }
                C29199a.m145771a("PullMsgTask clear all tasks auto preload");
            }
            if (!m145845P0.f135334d.m143048e().m17937B0()) {
                if (m145845P0.f135334d.m143059t()) {
                    C28611c m143055p = m145845P0.f135334d.m143055p();
                    if (m143055p != null) {
                        bVar.m145896a().m145833G(m143055p, m145845P0.f135334d.m143059t());
                    }
                } else {
                    m145845P0.f135334d.m143048e().m17953R0(true);
                }
            }
        }
        this.f135331a = false;
        bVar.m145896a().m145847R0(false);
        bVar.m145896a().m145849T();
    }

    /* renamed from: n */
    public static final void m145921n(C29213n c29213n) {
        AbstractC19074t.m100208f(c29213n, "this$0");
        while (c29213n.f135331a) {
            try {
                if (!c29213n.f135332b) {
                    C29199a.m145771a("PullMsgTask executeTask id=" + c29213n.f135338h + " commandType=" + c29213n.f135334d.m143057r() + " threadName = " + c29213n.f135337g.m17971y0().f42894r);
                    c29213n.f135332b = true;
                    C29210k.Companion.m145896a().m145847R0(true);
                    if (c29213n.f135334d.m143039F()) {
                        AbstractC23306f.m120584H0().m2632o(c29213n.f135337g);
                        if (c29213n.f135334d.m143039F()) {
                            c29213n.m145925r(c29213n.f135334d);
                        }
                    } else if (c29213n.f135334d.m143063x()) {
                        c29213n.m145933j(c29213n.f135334d);
                    } else {
                        if (!c29213n.f135334d.m143065z() && !c29213n.f135334d.m143034A()) {
                            if (c29213n.f135334d.m143064y()) {
                                c29213n.m145923p(c29213n.f135334d);
                            } else {
                                c29213n.m145924q(c29213n.f135334d);
                            }
                        }
                        c29213n.m145922o(c29213n.f135334d);
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("PullMsgTask", e11);
                return;
            }
        }
    }

    /* renamed from: o */
    private final void m145922o(C28610b c28610b) {
        int i11;
        byte b11;
        String str;
        byte b12;
        b bVar;
        if (this.f135337g.m17947L0()) {
            return;
        }
        C28611c m143056q = c28610b.m143056q(C29210k.Companion.m145896a().m145867f0(this.f135336f));
        if (m143056q == null) {
            C29199a.m145771a("PullMsgTask getCloudMsg job NULL -> completeTask:" + this);
            m145920l();
            return;
        }
        if (this.f135337g.m17945J0()) {
            i11 = 1854;
        } else {
            i11 = 1853;
        }
        MessageId.C7932a c7932a = MessageId.Companion;
        MessageId m41065d = c7932a.m41065d(m143056q.m143071a(), m143056q.f132659b, this.f135336f, "");
        if (m41065d == null) {
            m41065d = c7932a.m41067h();
        }
        MessageId messageId = m41065d;
        long currentTimeMillis = System.currentTimeMillis();
        C3535c c3535c = this.f135337g;
        c3535c.m17950O0(c3535c.m17972z0() + 1);
        WeakReference weakReference = this.f135335e;
        if (weakReference != null && (bVar = (b) weakReference.get()) != null) {
            bVar.mo64332a(c28610b);
        }
        this.f135337g.m17957V0(true);
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new d(currentTimeMillis, i11, c28610b, messageId));
        if (AbstractC25495a.m132079d(this.f135336f)) {
            b11 = 6;
        } else {
            b11 = 5;
        }
        if (AbstractC25495a.m132079d(this.f135336f)) {
            str = AbstractC25495a.m132088m(this.f135336f);
        } else {
            str = this.f135336f;
        }
        String str2 = str;
        if (c28610b.m143065z()) {
            b12 = 1;
        } else if (c28610b.m143034A()) {
            b12 = 3;
        } else {
            b12 = 0;
        }
        C29199a.m145771a("PullMsgTask getCloudMsg PARAM userType=" + ((int) b11) + ", groupId=" + str2 + ", messageId=" + messageId + ", loadType=0, source=" + ((int) b12) + ", isGroupCloudMsgOld=" + this.f135337g.m17945J0());
        if (this.f135337g.m17945J0()) {
            c0766k.mo1753u9(str2, messageId, b11, (byte) 0, b12);
        } else {
            c0766k.mo1647ga(str2, messageId, b11, (byte) 0, b12);
        }
    }

    /* renamed from: p */
    private final void m145923p(C28610b c28610b) {
        int i11;
        byte b11;
        String str;
        b bVar;
        if (this.f135337g.m17947L0()) {
            return;
        }
        if (c28610b.m143050i() == null) {
            C29199a.m145771a("PullMsgTask getCloudMsgAndJumpToMsg jumpMsgId NULL -> completeTask :" + this);
            m145920l();
            return;
        }
        MessageId m143050i = c28610b.m143050i();
        AbstractC19074t.m100205c(m143050i);
        if (this.f135337g.m17945J0()) {
            i11 = 1854;
        } else {
            i11 = 1853;
        }
        long currentTimeMillis = System.currentTimeMillis();
        WeakReference weakReference = this.f135335e;
        if (weakReference != null && (bVar = (b) weakReference.get()) != null) {
            bVar.mo64332a(c28610b);
        }
        this.f135337g.m17957V0(true);
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new e(c28610b, i11, m143050i, currentTimeMillis));
        if (AbstractC25495a.m132079d(this.f135336f)) {
            b11 = 6;
        } else {
            b11 = 5;
        }
        if (AbstractC25495a.m132079d(this.f135336f)) {
            str = AbstractC25495a.m132088m(this.f135336f);
        } else {
            str = this.f135336f;
        }
        String str2 = str;
        C29199a.m145771a("PullMsgTask getCloudMsgAndJumpToMsg PARAM userType=" + ((int) b11) + ", groupId=" + str2 + ", messageId=" + m143050i + ", loadType=2, source=4, isGroupCloudMsgOld=" + this.f135337g.m17945J0());
        if (this.f135337g.m17945J0()) {
            c0766k.mo1753u9(str2, m143050i, b11, (byte) 2, (byte) 4);
        } else {
            c0766k.mo1647ga(str2, m143050i, b11, (byte) 2, (byte) 4);
        }
    }

    /* renamed from: q */
    private final void m145924q(C28610b c28610b) {
        MessageId m41065d;
        int i11;
        boolean m127149O;
        byte b11;
        byte b12;
        b bVar;
        C28611c m143056q = c28610b.m143056q(C29210k.Companion.m145896a().m145867f0(this.f135336f));
        if (m143056q == null) {
            C29199a.m145771a("PullMsgTask getMsgOffline job NULL -> completeTask :" + this);
            m145920l();
            return;
        }
        boolean m143059t = c28610b.m143059t();
        if (m143059t) {
            m41065d = MessageId.Companion.m41065d(m143056q.m143071a(), m143056q.f132659b, this.f135336f, "");
        } else {
            m41065d = MessageId.Companion.m41065d(m143056q.f132662e, m143056q.f132661d, this.f135336f, "");
        }
        if (m41065d == null) {
            m41065d = MessageId.Companion.m41067h();
        }
        WeakReference weakReference = this.f135335e;
        if (weakReference != null && (bVar = (b) weakReference.get()) != null) {
            bVar.mo64332a(c28610b);
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (this.f135337g.m17945J0()) {
            i11 = 1854;
        } else {
            i11 = 1853;
        }
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new f(currentTimeMillis, this, c28610b, i11, m41065d));
        m127149O = AbstractC24342w.m127149O(this.f135336f, "group_", false, 2, null);
        if (m127149O) {
            b11 = 6;
        } else {
            b11 = 5;
        }
        boolean z11 = !m143059t;
        String m132088m = AbstractC25495a.m132088m(this.f135336f);
        if (c28610b.m143038E()) {
            b12 = 2;
        } else {
            b12 = 0;
        }
        C29199a.m145771a("PullMsgTask getMsgOffline PARAM userType=" + ((int) b11) + ", groupId=" + m132088m + ", messageId=" + m41065d + ", loadType=" + (z11 ? 1 : 0) + ", source=" + ((int) b12) + ", isGroupCloudMsgOld=" + this.f135337g.m17945J0());
        if (this.f135337g.m17945J0()) {
            c0766k.mo1753u9(m132088m, m41065d, b11, z11 ? (byte) 1 : (byte) 0, b12);
        } else {
            c0766k.mo1647ga(m132088m, m41065d, b11, z11 ? (byte) 1 : (byte) 0, b12);
        }
    }

    /* renamed from: r */
    private final void m145925r(C28610b c28610b) {
        int i11;
        b bVar;
        C28611c m143056q = c28610b.m143056q(C29210k.Companion.m145896a().m145867f0(this.f135336f));
        if (m143056q == null) {
            C29199a.m145771a("PullMsgTask[MyCloud] getMyCloudMsgHttp job NULL -> completeTask :" + this);
            m145920l();
            if (c28610b.m143039F()) {
                AbstractC0924m0.m3579Xk(true);
                C23744a.Companion.m124119a().m124116d(5207, 4);
                C21956b.m114657g("PullMsgTask", "Post event [NOTIFY_STATE_SYNC_MSG_DATA_MY_CLOUD]: state=4");
                return;
            }
            return;
        }
        WeakReference weakReference = this.f135335e;
        if (weakReference != null && (bVar = (b) weakReference.get()) != null) {
            bVar.mo64332a(c28610b);
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (c28610b.m143039F()) {
            i11 = 1;
        } else if (c28610b.m143034A()) {
            i11 = 2;
        } else {
            i11 = 0;
        }
        MessageId.C7932a c7932a = MessageId.Companion;
        MessageId m41065d = c7932a.m41065d(m143056q.m143071a(), m143056q.f132659b, this.f135336f, "");
        if (m41065d == null) {
            m41065d = c7932a.m41067h();
        }
        MessageId messageId = m41065d;
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new g(c28610b, messageId, currentTimeMillis));
        C29199a.m145771a("PullMsgTask [MyCloud] getMyCloudMsgHttp PARAM messageId= " + messageId + ", source= " + i11);
        c0766k.mo1701o5(messageId, i11);
    }

    /* renamed from: s */
    private final String m145926s(C28610b c28610b) {
        String str;
        if (c28610b.m143039F()) {
            str = " [MyCloud] handlePullMyCloudMsgHttp";
        } else if (c28610b.m143063x()) {
            str = " [MyCloud] handleCheckCreateGAPSyncAllOrAfterLoginHttp";
        } else if (c28610b.m143038E()) {
            str = " handlePullOfflineMsg";
        } else if (c28610b.m143064y()) {
            str = " handlePullCloudMsgAndJumpToMsg";
        } else {
            str = " handlePullCloudMsg";
        }
        return "PullMsgTask" + str;
    }

    /* renamed from: u */
    private final long m145927u(C3535c c3535c) {
        List m17941F0 = c3535c.m17941F0();
        int size = m17941F0.size() - 1;
        if (size < 0) {
            return 0L;
        }
        while (true) {
            int i11 = size - 1;
            C17945a0 c17945a0 = (C17945a0) m17941F0.get(size);
            if (!c17945a0.m95161i7() && !c17945a0.m95226p6() && !c17945a0.m94872D8()) {
                return ((C17945a0) m17941F0.get(size)).m94974P4();
            }
            if (i11 >= 0) {
                size = i11;
            } else {
                return 0L;
            }
        }
    }

    /* renamed from: v */
    public final int m145928v() {
        return AbstractC25495a.m132079d(this.f135337g.m17944I0()) ? 1 : 0;
    }

    /* renamed from: w */
    private final boolean m145929w(MessageId messageId, List list) {
        long m41047k = messageId.m41047k();
        long m41045i = messageId.m41045i();
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            C17945a0 c17945a0 = (C17945a0) list.get(i11);
            if (c17945a0.m95029V3().m41047k() == m41047k || c17945a0.m95029V3().m41045i() == m41045i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: x */
    public final boolean m145930x(int i11) {
        return i11 == f135330i;
    }

    /* renamed from: y */
    public final void m145931y(long j11, long j12, String str, int i11, boolean z11) {
        String str2;
        if (this.f135337g.m17946K0()) {
            this.f135337g.m17954S0(C19669z.Companion.m103232a().m103210X(this.f135337g.m17971y0().f42893q));
            C3535c c3535c = this.f135337g;
            c3535c.m17959X0(m145927u(c3535c));
            this.f135337g.m17955T0(false);
        }
        C0815e1 m2075D = C0815e1.m2075D();
        String[] strArr = new String[8];
        strArr[0] = str;
        strArr[1] = CoreUtility.f89233i;
        int m17938C0 = this.f135337g.m17938C0();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m17938C0);
        strArr[2] = sb2.toString();
        long m17943H0 = this.f135337g.m17943H0();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(m17943H0);
        strArr[3] = sb3.toString();
        int m17942G0 = this.f135337g.m17942G0();
        StringBuilder sb4 = new StringBuilder();
        sb4.append(m17942G0);
        strArr[4] = sb4.toString();
        if (z11) {
            str2 = "0";
        } else {
            str2 = "1";
        }
        strArr[5] = str2;
        long j13 = j12 - j11;
        StringBuilder sb5 = new StringBuilder();
        sb5.append(j13);
        strArr[6] = sb5.toString();
        StringBuilder sb6 = new StringBuilder();
        sb6.append(i11);
        strArr[7] = sb6.toString();
        m2075D.m2099U(3, 1, 18, strArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:189:0x072d, code lost:            if (r7 < r18) goto L450;     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x006c, code lost:            if (r35.m143063x() != false) goto L308;     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:206:0x091a A[Catch: all -> 0x03d5, Exception -> 0x03d8, TRY_LEAVE, TryCatch #13 {Exception -> 0x03d8, all -> 0x03d5, blocks: (B:104:0x032f, B:106:0x0335, B:108:0x037d, B:109:0x03f0, B:111:0x044e, B:128:0x03db, B:130:0x0510, B:132:0x0516, B:134:0x051e, B:136:0x0533, B:138:0x0570, B:139:0x054f, B:140:0x057d, B:142:0x05b9, B:144:0x05c5, B:158:0x0640, B:160:0x0646, B:162:0x0662, B:164:0x06d0, B:165:0x075e, B:167:0x078d, B:177:0x06f5, B:182:0x072f, B:184:0x0744, B:185:0x074b, B:191:0x080b, B:193:0x0813, B:195:0x0823, B:197:0x087b, B:199:0x0887, B:201:0x0891, B:203:0x089b, B:204:0x08e0, B:206:0x091a, B:216:0x08b7, B:217:0x08cb), top: B:103:0x032f }] */
    /* JADX WARN: Removed duplicated region for block: B:260:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0051 A[Catch: all -> 0x003b, Exception -> 0x0040, TryCatch #11 {Exception -> 0x0040, all -> 0x003b, blocks: (B:252:0x002c, B:254:0x0032, B:258:0x0046, B:261:0x005a, B:262:0x0051, B:8:0x0068), top: B:251:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x09f8  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0a13  */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r3v23, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v55 */
    /* JADX WARN: Type inference failed for: r3v56 */
    /* JADX WARN: Type inference failed for: r3v57 */
    /* JADX WARN: Type inference failed for: r3v58 */
    /* JADX WARN: Type inference failed for: r3v59 */
    /* JADX WARN: Type inference failed for: r3v60 */
    /* JADX WARN: Type inference failed for: r3v61 */
    /* JADX WARN: Type inference failed for: r3v62 */
    /* JADX WARN: Type inference failed for: r3v63 */
    /* JADX WARN: Type inference failed for: r3v64 */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v37 */
    /* JADX WARN: Type inference failed for: r9v49 */
    /* JADX WARN: Type inference failed for: r9v59 */
    /* JADX WARN: Type inference failed for: r9v60 */
    /* JADX WARN: Type inference failed for: r9v61 */
    /* JADX WARN: Type inference failed for: r9v62 */
    /* JADX WARN: Type inference failed for: r9v63 */
    /* JADX WARN: Type inference failed for: r9v64 */
    /* JADX WARN: Type inference failed for: r9v65 */
    /* JADX WARN: Type inference failed for: r9v66 */
    /* JADX WARN: Type inference failed for: r9v67 */
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m145932z(C28610b c28610b, int i11, int i12, MessageId messageId, C28613e c28613e) {
        C28610b c28610b2;
        C28610b c28610b3;
        List list;
        C28610b c28610b4;
        Throwable th2;
        WeakReference weakReference;
        b bVar;
        Exception exc;
        WeakReference weakReference2;
        b bVar2;
        List list2;
        boolean m17937B0;
        String str;
        List list3;
        C28610b c28610b5;
        b bVar3;
        int i13;
        int i14;
        C28610b c28610b6;
        C28610b c28610b7;
        ?? m143080a;
        C28610b c28610b8;
        C28610b c28610b9;
        ?? r32;
        List list4;
        C28610b c28610b10;
        List list5;
        List list6;
        long m41047k;
        long m41047k2;
        MessageId messageId2;
        List list7;
        WeakReference weakReference3;
        b bVar4;
        String str2;
        String str3;
        ArrayList arrayList;
        C28610b c28610b11;
        List list8;
        long m41047k3;
        long m41047k4;
        long j11;
        C28613e c28613e2 = c28613e;
        List arrayList2 = new ArrayList();
        C19617c0 c19617c0 = new C19617c0();
        try {
            String m145926s = m145926s(c28610b);
            boolean m143082c = c28613e.m143082c();
            boolean m143059t = c28610b.m143059t();
            if (AbstractC23304d.m120544o()) {
                try {
                    if (!c28610b.m143039F() && !c28610b.m143063x()) {
                        i13 = 1;
                        c19617c0.m102658n(i13);
                        if (AbstractC20070a.m104314d(i11)) {
                            i14 = AbstractC20070a.m104315e(i11) ? 3 : -1;
                        } else {
                            i14 = 4;
                        }
                        c19617c0.m102660p(i14);
                    }
                    i13 = 2;
                    c19617c0.m102658n(i13);
                    if (AbstractC20070a.m104314d(i11)) {
                    }
                    c19617c0.m102660p(i14);
                } catch (Exception e11) {
                    e = e11;
                    c28610b3 = c28610b;
                    list3 = arrayList2;
                    exc = e;
                    c28610b2 = c28610b3;
                    arrayList2 = list3;
                    try {
                        AbstractC23350e.m122778h(exc);
                        weakReference2 = this.f135335e;
                        if (weakReference2 != null) {
                        }
                        m145920l();
                    } catch (Throwable th3) {
                        th = th3;
                        th2 = th;
                        c28610b4 = c28610b2;
                        list = arrayList2;
                        weakReference = this.f135335e;
                        if (weakReference != null && (bVar = (b) weakReference.get()) != null) {
                            bVar.mo64335d(c28610b4, list, this.f135337g.m17937B0(), c28613e2.m143084e(this.f135336f));
                            bVar.mo64334c(c28610b4);
                            bVar.mo64336e(c28610b4);
                        }
                        m145920l();
                        throw th2;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    c28610b2 = c28610b;
                    th2 = th;
                    c28610b4 = c28610b2;
                    list = arrayList2;
                    weakReference = this.f135335e;
                    if (weakReference != null) {
                    }
                    m145920l();
                    throw th2;
                }
            }
            boolean m143038E = c28610b.m143038E();
            if (!c28610b.m143039F()) {
            }
            c19617c0.m102659o(false);
            c19617c0.m102657l(i11, i12, m143038E, c28613e.m143083d());
            ArrayList arrayList3 = new ArrayList(c19617c0.m102655i());
            String m143081b = c28613e.m143081b();
            try {
                m143080a = c28613e.m143080a();
                try {
                    try {
                        C29199a.m145771a(m145926s + " cmd=" + i11 + ", typeChatContent=" + i12 + ", messageId=" + messageId + ", globalMsgIdForNextRequest=" + m143081b + ", clientMsgIdForNextRequest=" + m143080a + ", msg size(response)=" + c28613e.m143083d().length());
                        int size = arrayList3.size();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(m145926s);
                        sb2.append(" msg size(parse)=");
                        sb2.append(size);
                        C29199a.m145771a(sb2.toString());
                        r32 = " msg size(inserted)=";
                        try {
                            if (c28610b.m143039F()) {
                                if (!arrayList3.isEmpty()) {
                                    long m41045i = ((C17945a0) c19617c0.m102655i().get(0)).m95029V3().m41045i();
                                    if (m143059t) {
                                        m41047k3 = messageId.m41047k();
                                        m41047k4 = ((C17945a0) c19617c0.m102655i().get(0)).m95029V3().m41047k();
                                    } else {
                                        m41047k3 = ((C17945a0) c19617c0.m102655i().get(c19617c0.m102655i().size() - 1)).m95029V3().m41047k();
                                        m41047k4 = messageId.m41047k();
                                    }
                                    long j12 = m41047k3;
                                    long j13 = m41047k4;
                                    C29210k.b bVar5 = C29210k.Companion;
                                    bVar5.m145896a().m145858Z0(this.f135336f, j12, j13, m41045i);
                                    StringBuilder sb3 = new StringBuilder();
                                    sb3.append(m145926s);
                                    sb3.append(" topClientId=");
                                    sb3.append(m41045i);
                                    sb3.append(", topGlobalId=");
                                    sb3.append(j13);
                                    sb3.append(", bottomGlobalId=");
                                    str3 = " msg size(filtered)=";
                                    sb3.append(j12);
                                    C29199a.m145771a(sb3.toString());
                                    C31909f1 m145886u = bVar5.m145896a().m145886u(this.f135336f);
                                    if (m145886u != null) {
                                        String str4 = m145886u.f146609a;
                                        MessageId messageId3 = m145886u.f146610b;
                                        str2 = " msg size(inserted)=";
                                        StringBuilder sb4 = new StringBuilder();
                                        sb4.append(m145926s);
                                        arrayList = arrayList3;
                                        sb4.append(" conversationInfoExtra chatId=");
                                        sb4.append(str4);
                                        sb4.append(", lastDelMsgId=");
                                        sb4.append(messageId3);
                                        C29199a.m145771a(sb4.toString());
                                        MessageId m41065d = MessageId.Companion.m41065d(m41045i, j13, this.f135336f, "");
                                        if (m41065d != null) {
                                            C29210k m145896a = bVar5.m145896a();
                                            MessageId messageId4 = m145886u.f146610b;
                                            AbstractC19074t.m100207e(messageId4, "mLastDelMsgId");
                                            j11 = m145896a.m145836I(m41065d, messageId4);
                                        } else {
                                            j11 = -1;
                                        }
                                        m143082c &= j11 > 0;
                                        C29199a.m145771a(m145926s + " compareMessageIdResult=" + j11 + ", hasMore(After)=" + m143082c);
                                    } else {
                                        arrayList = arrayList3;
                                        str2 = " msg size(inserted)=";
                                    }
                                } else {
                                    str2 = " msg size(inserted)=";
                                    str3 = " msg size(filtered)=";
                                    arrayList = arrayList3;
                                }
                                boolean z11 = m143082c;
                                m145909A(c19617c0.m102654h(), c19617c0.m102653g());
                                c19617c0.m102651d(this.f135337g, true);
                                C29199a.m145771a(m145926s + str3 + c19617c0.m102655i().size());
                                List m102655i = c19617c0.m102655i();
                                LinkedList m102652f = c19617c0.m102652f();
                                C3535c m2634q = AbstractC23306f.m120584H0().m2634q(this.f135336f);
                                if (m102655i.size() <= 0 || m2634q == null) {
                                    c28610b11 = c28610b;
                                    list8 = arrayList2;
                                } else {
                                    List m41541h0 = C7956b.Companion.m41573b().m41541h0(m102655i, InterfaceC3534b.b.f14895a, m102652f);
                                    try {
                                        C29199a.m145771a(m145926s + str2 + m41541h0.size());
                                        if (!m41541h0.isEmpty()) {
                                            Iterator it = m41541h0.iterator();
                                            while (it.hasNext()) {
                                                this.f135337g.m136063h0((C17945a0) it.next());
                                            }
                                            C29210k m145896a2 = C29210k.Companion.m145896a();
                                            C3535c c3535c = this.f135337g;
                                            MessageId m95029V3 = ((C17945a0) m102655i.get(0)).m95029V3();
                                            AbstractC19074t.m100207e(m95029V3, "getMessageId(...)");
                                            m145896a2.m145869g1(c3535c, m95029V3);
                                            WeakReference weakReference4 = this.f135335e;
                                            if (weakReference4 != null) {
                                                b bVar6 = (b) weakReference4.get();
                                                if (bVar6 != null) {
                                                    C28610b c28610b12 = c28610b;
                                                    bVar6.mo64333b(c28610b12);
                                                    C24848g0 c24848g0 = C24848g0.f119245a;
                                                    c28610b11 = c28610b12;
                                                    list8 = m41541h0;
                                                }
                                            }
                                        }
                                        c28610b11 = c28610b;
                                        list8 = m41541h0;
                                    } catch (Exception e12) {
                                        e = e12;
                                        c28610b10 = c28610b;
                                        list4 = m41541h0;
                                        c28613e2 = c28613e;
                                        c28610b3 = c28610b10;
                                        list3 = list4;
                                        exc = e;
                                        c28610b2 = c28610b3;
                                        arrayList2 = list3;
                                        AbstractC23350e.m122778h(exc);
                                        weakReference2 = this.f135335e;
                                        if (weakReference2 != null && (bVar2 = (b) weakReference2.get()) != null) {
                                            list2 = arrayList2;
                                            m17937B0 = this.f135337g.m17937B0();
                                            str = this.f135336f;
                                            bVar3 = bVar2;
                                            c28610b5 = c28610b2;
                                            bVar3.mo64335d(c28610b5, list2, m17937B0, c28613e2.m143084e(str));
                                            bVar3.mo64334c(c28610b5);
                                            bVar3.mo64336e(c28610b5);
                                        }
                                        m145920l();
                                    } catch (Throwable th5) {
                                        th = th5;
                                        c28610b2 = c28610b;
                                        arrayList2 = m41541h0;
                                        c28613e2 = c28613e;
                                        th2 = th;
                                        c28610b4 = c28610b2;
                                        list = arrayList2;
                                        weakReference = this.f135335e;
                                        if (weakReference != null) {
                                            bVar.mo64335d(c28610b4, list, this.f135337g.m17937B0(), c28613e2.m143084e(this.f135336f));
                                            bVar.mo64334c(c28610b4);
                                            bVar.mo64336e(c28610b4);
                                        }
                                        m145920l();
                                        throw th2;
                                    }
                                }
                                C29210k.Companion.m145896a().m145834G0(this.f135336f, arrayList, list8, this.f135337g.m136078x(), z11);
                                r32 = c28610b11;
                                m143080a = list8;
                            } else {
                                C28610b c28610b13 = c28610b;
                                try {
                                    if (c28610b.m143063x()) {
                                        C29199a.m145771a(m145926s + " needCreateGAPSyncAll=" + c28610b.m143053n() + ", needCreateGAPAfterLogin=" + c28610b.m143052m() + ", msg size(response)=" + c28613e.m143083d().length());
                                        C29210k.b bVar7 = C29210k.Companion;
                                        MessageId m145865e0 = bVar7.m145896a().m145865e0();
                                        if (!arrayList3.isEmpty()) {
                                            MessageId m95029V32 = ((C17945a0) arrayList3.get(arrayList3.size() - 1)).m95029V3();
                                            AbstractC19074t.m100207e(m95029V32, "getMessageId(...)");
                                            messageId2 = ((C17945a0) arrayList3.get(0)).m95029V3();
                                            bVar7.m145896a().m145858Z0(this.f135337g.m17944I0(), m95029V32.m41047k(), messageId2.m41047k(), messageId2.m41045i());
                                            C29199a.m145771a(m145926s + " bottomMsgId=" + m95029V32 + ", topMsgId=" + messageId2);
                                        } else {
                                            C29199a.m145771a(m145926s + " msg size(parse) EMPTY!");
                                            messageId2 = null;
                                        }
                                        m145909A(c19617c0.m102654h(), c19617c0.m102653g());
                                        c19617c0.m102651d(this.f135337g, true);
                                        List m102655i2 = c19617c0.m102655i();
                                        LinkedList m102652f2 = c19617c0.m102652f();
                                        C29199a.m145771a(m145926s + " msg size(filtered)=" + m102655i2.size());
                                        C29199a.m145771a(m145926s + " messageIdUsingCreateGap=" + messageId2 + ", chat=" + this.f135337g);
                                        if (!m102655i2.isEmpty()) {
                                            List m41541h02 = C7956b.Companion.m41573b().m41541h0(m102655i2, InterfaceC3534b.b.f14895a, m102652f2);
                                            C29199a.m145771a(m145926s + " msg size(after insert)=" + m41541h02.size());
                                            boolean isEmpty = m41541h02.isEmpty() ^ true;
                                            list7 = m41541h02;
                                            if (isEmpty) {
                                                Iterator it2 = m41541h02.iterator();
                                                while (it2.hasNext()) {
                                                    C3535c.m17935u0(this.f135337g, (C17945a0) it2.next(), false, false, 6, null);
                                                }
                                                C29210k m145896a3 = C29210k.Companion.m145896a();
                                                C3535c c3535c2 = this.f135337g;
                                                MessageId m95029V33 = ((C17945a0) c19617c0.m102655i().get(0)).m95029V3();
                                                AbstractC19074t.m100207e(m95029V33, "getMessageId(...)");
                                                m145896a3.m145869g1(c3535c2, m95029V33);
                                                m145919k(m41541h02);
                                                list7 = m41541h02;
                                            }
                                        } else {
                                            list7 = arrayList2;
                                        }
                                        C29210k.b bVar8 = C29210k.Companion;
                                        C31909f1 m145886u2 = bVar8.m145896a().m145886u(this.f135336f);
                                        bVar8.m145896a().m145839K(messageId2, m145865e0, m145886u2 != null ? m145886u2.f146610b : null, c28610b.m143053n(), c28610b.m143052m(), c28613e.m143082c());
                                        boolean z12 = !list7.isEmpty();
                                        r32 = c28610b13;
                                        m143080a = list7;
                                        if (z12) {
                                            String str5 = CoreUtility.f89233i;
                                            AbstractC19074t.m100207e(str5, "currentUserUid");
                                            new C26893h(str5).m138593L(list7);
                                            r32 = c28610b13;
                                            m143080a = list7;
                                        }
                                    } else if (c28610b.m143038E()) {
                                        if (!arrayList3.isEmpty()) {
                                            long m41045i2 = ((C17945a0) c19617c0.m102655i().get(0)).m95029V3().m41045i();
                                            if (m143059t) {
                                                m41047k = messageId.m41047k();
                                                m41047k2 = ((C17945a0) c19617c0.m102655i().get(0)).m95029V3().m41047k();
                                            } else {
                                                m41047k = ((C17945a0) c19617c0.m102655i().get(c19617c0.m102655i().size() - 1)).m95029V3().m41047k();
                                                m41047k2 = messageId.m41047k();
                                            }
                                            C29210k.Companion.m145896a().m145858Z0(this.f135336f, m41047k, m41047k2, m41045i2);
                                        }
                                        m145909A(c19617c0.m102654h(), c19617c0.m102653g());
                                        c19617c0.m102651d(this.f135337g, true);
                                        C29199a.m145771a(m145926s + " msg size(filtered)=" + c19617c0.m102655i().size());
                                        List m102655i3 = c19617c0.m102655i();
                                        LinkedList m102652f3 = c19617c0.m102652f();
                                        if (m102655i3.size() <= 0 || AbstractC23306f.m120584H0().m2634q(this.f135336f) == null) {
                                            m143080a = arrayList2;
                                            r32 = c28610b13;
                                        } else {
                                            List m41541h03 = C7956b.Companion.m41573b().m41541h0(m102655i3, InterfaceC3534b.b.f14895a, m102652f3);
                                            C29199a.m145771a(m145926s + " msg size(inserted)=" + m41541h03.size());
                                            boolean isEmpty2 = m41541h03.isEmpty() ^ true;
                                            r32 = c28610b13;
                                            m143080a = m41541h03;
                                            if (isEmpty2) {
                                                Iterator it3 = m41541h03.iterator();
                                                while (it3.hasNext()) {
                                                    C3535c.m17935u0(this.f135337g, (C17945a0) it3.next(), false, false, 6, null);
                                                }
                                                C29210k m145896a4 = C29210k.Companion.m145896a();
                                                C3535c c3535c3 = this.f135337g;
                                                MessageId m95029V34 = ((C17945a0) m41541h03.get(0)).m95029V3();
                                                AbstractC19074t.m100207e(m95029V34, "getMessageId(...)");
                                                m145896a4.m145869g1(c3535c3, m95029V34);
                                                WeakReference weakReference5 = this.f135335e;
                                                r32 = c28610b13;
                                                m143080a = m41541h03;
                                                if (weakReference5 != null) {
                                                    b bVar9 = (b) weakReference5.get();
                                                    r32 = c28610b13;
                                                    m143080a = m41541h03;
                                                    if (bVar9 != null) {
                                                        bVar9.mo64333b(c28610b13);
                                                        C24848g0 c24848g02 = C24848g0.f119245a;
                                                        r32 = c28610b13;
                                                        m143080a = m41541h03;
                                                    }
                                                }
                                            }
                                        }
                                    } else if (c28610b.m143064y()) {
                                        long m41047k5 = messageId.m41047k();
                                        long m41045i3 = messageId.m41045i();
                                        C29210k.b bVar10 = C29210k.Companion;
                                        boolean m145884s0 = bVar10.m145896a().m145884s0(this.f135336f, messageId);
                                        if (!arrayList3.isEmpty()) {
                                            C29199a.m145771a(m145926s + " cmd=" + i11 + ", jumpMsgId=" + c28610b.m143050i() + ", isInListJob=" + m145884s0 + ", msg size(response)= " + c28613e.m143083d().length());
                                            MessageId m95029V35 = ((C17945a0) arrayList3.get(0)).m95029V3();
                                            AbstractC19074t.m100207e(m95029V35, "getMessageId(...)");
                                            MessageId m95029V36 = ((C17945a0) arrayList3.get(arrayList3.size() - 1)).m95029V3();
                                            AbstractC19074t.m100207e(m95029V36, "getMessageId(...)");
                                            long m41047k6 = m95029V36.m41047k();
                                            long m41045i4 = m95029V36.m41045i();
                                            long m41047k7 = m95029V35.m41047k();
                                            long m41045i5 = m95029V35.m41045i();
                                            if (m145884s0) {
                                                bVar10.m145896a().m145851U0(this.f135337g.m17944I0(), m41047k5, m41045i3, m41047k6, m41047k7, m41045i5);
                                                m145909A(c19617c0.m102654h(), c19617c0.m102653g());
                                                c19617c0.m102651d(this.f135337g, false);
                                            } else {
                                                m145909A(c19617c0.m102654h(), c19617c0.m102653g());
                                                c19617c0.m102651d(this.f135337g, false);
                                                MessageId m145870i0 = bVar10.m145896a().m145870i0(this.f135337g.m17944I0());
                                                long m41047k8 = m145870i0.m41047k();
                                                long m41045i6 = m145870i0.m41045i();
                                                if (1 <= m41047k7) {
                                                    if (m41047k7 < m41047k8) {
                                                        C28611c c28611c = new C28611c(this.f135337g.m17944I0(), m41047k8, m41047k6, m41045i4);
                                                        if (c28611c.m143074f()) {
                                                            bVar10.m145896a().m145873l0(c28611c);
                                                        }
                                                        bVar10.m145896a().m145858Z0(this.f135337g.m17944I0(), m41047k6, m41047k7, m41045i5);
                                                    }
                                                }
                                                if (1 <= m41045i5) {
                                                }
                                                bVar10.m145896a().m145858Z0(this.f135337g.m17944I0(), m41047k6, m41047k7, m41045i5);
                                            }
                                            C29199a.m145771a(m145926s + " msg size(parsed)=" + c19617c0.m102655i().size());
                                            if (AbstractC23306f.m120584H0().m2634q(this.f135337g.m17944I0()) != null) {
                                                List m41541h04 = C7956b.Companion.m41573b().m41541h0(c19617c0.m102655i(), InterfaceC3534b.b.f14895a, c19617c0.m102652f());
                                                c28610b13.m143042I(m145929w(messageId, m41541h04));
                                                C29199a.m145771a(m145926s + " msg size(inserted)=" + m41541h04.size());
                                                boolean isEmpty3 = m41541h04.isEmpty() ^ true;
                                                list6 = m41541h04;
                                                if (isEmpty3) {
                                                    Iterator it4 = m41541h04.iterator();
                                                    while (it4.hasNext()) {
                                                        C3535c.m17935u0(this.f135337g, (C17945a0) it4.next(), false, false, 6, null);
                                                    }
                                                    C29210k m145896a5 = C29210k.Companion.m145896a();
                                                    C3535c c3535c4 = this.f135337g;
                                                    MessageId m95029V37 = ((C17945a0) m41541h04.get(0)).m95029V3();
                                                    AbstractC19074t.m100207e(m95029V37, "getMessageId(...)");
                                                    m145896a5.m145869g1(c3535c4, m95029V37);
                                                    list6 = m41541h04;
                                                }
                                                this.f135337g.m17957V0(false);
                                                r32 = c28610b13;
                                                m143080a = list6;
                                            }
                                        }
                                        list6 = arrayList2;
                                        this.f135337g.m17957V0(false);
                                        r32 = c28610b13;
                                        m143080a = list6;
                                    } else {
                                        if ((!arrayList3.isEmpty()) && AbstractC23306f.m120584H0().m2634q(this.f135337g.m17944I0()) != null) {
                                            MessageId m95029V38 = ((C17945a0) arrayList3.get(0)).m95029V3();
                                            AbstractC19074t.m100207e(m95029V38, "getMessageId(...)");
                                            MessageId m95029V39 = ((C17945a0) arrayList3.get(arrayList3.size() - 1)).m95029V3();
                                            AbstractC19074t.m100207e(m95029V39, "getMessageId(...)");
                                            C29199a.m145771a(m145926s + " messageIdTop= " + m95029V38 + ", messageIdBottom= " + m95029V39);
                                            long m41047k9 = m95029V39.m41047k();
                                            long m41047k10 = m95029V38.m41047k();
                                            long m41045i7 = m95029V38.m41045i();
                                            if (AbstractC25495a.m132078c(this.f135337g.m17944I0())) {
                                                C29210k.b bVar11 = C29210k.Companion;
                                                if (bVar11.m145896a().m145857Z()) {
                                                    C28611c m145864d0 = bVar11.m145896a().m145864d0();
                                                    if (m145864d0 != null && m145864d0.f132659b > messageId.m41047k()) {
                                                        bVar11.m145896a().m145851U0(this.f135337g.m17944I0(), messageId.m41047k(), messageId.m41045i(), m41047k9, m41047k10, m41045i7);
                                                    } else {
                                                        bVar11.m145896a().m145858Z0(this.f135337g.m17944I0(), m41047k9, m41047k10, m41045i7);
                                                    }
                                                    m145909A(c19617c0.m102654h(), c19617c0.m102653g());
                                                    c19617c0.m102651d(this.f135337g, true);
                                                    C29199a.m145771a(m145926s + " msg size(filtered)= " + c19617c0.m102655i().size());
                                                    if (c19617c0.m102655i().size() > 0) {
                                                        List m41541h05 = C7956b.Companion.m41573b().m41541h0(c19617c0.m102655i(), InterfaceC3534b.b.f14895a, c19617c0.m102652f());
                                                        C29199a.m145771a(m145926s + " msg size(inserted)= " + m41541h05.size());
                                                        boolean isEmpty4 = m41541h05.isEmpty() ^ true;
                                                        list5 = m41541h05;
                                                        if (isEmpty4) {
                                                            C24261h.Companion.m126656b().m126633B(m41541h05, this.f135337g.m17944I0());
                                                            Iterator it5 = m41541h05.iterator();
                                                            while (it5.hasNext()) {
                                                                C3535c.m17935u0(this.f135337g, (C17945a0) it5.next(), false, false, 6, null);
                                                            }
                                                            C29210k m145896a6 = C29210k.Companion.m145896a();
                                                            C3535c c3535c5 = this.f135337g;
                                                            MessageId m95029V310 = ((C17945a0) m41541h05.get(0)).m95029V3();
                                                            AbstractC19074t.m100207e(m95029V310, "getMessageId(...)");
                                                            m145896a6.m145869g1(c3535c5, m95029V310);
                                                            m145919k(m41541h05);
                                                            list5 = m41541h05;
                                                        }
                                                        this.f135337g.m17950O0(0);
                                                        this.f135337g.m17957V0(false);
                                                        r32 = c28610b13;
                                                        m143080a = list5;
                                                    }
                                                }
                                            }
                                            C29210k.Companion.m145896a().m145858Z0(this.f135337g.m17944I0(), m41047k9, m41047k10, m41045i7);
                                            m145909A(c19617c0.m102654h(), c19617c0.m102653g());
                                            c19617c0.m102651d(this.f135337g, true);
                                            C29199a.m145771a(m145926s + " msg size(filtered)= " + c19617c0.m102655i().size());
                                            if (c19617c0.m102655i().size() > 0) {
                                            }
                                        }
                                        list5 = arrayList2;
                                        this.f135337g.m17950O0(0);
                                        this.f135337g.m17957V0(false);
                                        r32 = c28610b13;
                                        m143080a = list5;
                                    }
                                } catch (Exception e13) {
                                    e = e13;
                                    c28610b9 = c28610b13;
                                    c28613e2 = c28613e;
                                    c28610b7 = c28610b9;
                                    exc = e;
                                    arrayList2 = arrayList2;
                                    c28610b2 = c28610b7;
                                    AbstractC23350e.m122778h(exc);
                                    weakReference2 = this.f135335e;
                                    if (weakReference2 != null) {
                                        list2 = arrayList2;
                                        m17937B0 = this.f135337g.m17937B0();
                                        str = this.f135336f;
                                        bVar3 = bVar2;
                                        c28610b5 = c28610b2;
                                        bVar3.mo64335d(c28610b5, list2, m17937B0, c28613e2.m143084e(str));
                                        bVar3.mo64334c(c28610b5);
                                        bVar3.mo64336e(c28610b5);
                                    }
                                    m145920l();
                                } catch (Throwable th6) {
                                    th = th6;
                                    c28610b8 = c28610b13;
                                    c28613e2 = c28613e;
                                    c28610b6 = c28610b8;
                                    th2 = th;
                                    list = arrayList2;
                                    c28610b4 = c28610b6;
                                    weakReference = this.f135335e;
                                    if (weakReference != null) {
                                    }
                                    m145920l();
                                    throw th2;
                                }
                            }
                            this.f135333c = true;
                            weakReference3 = this.f135335e;
                        } catch (Exception e14) {
                            e = e14;
                            c28610b10 = r32;
                            list4 = m143080a;
                        } catch (Throwable th7) {
                            th = th7;
                            c28610b2 = r32;
                            arrayList2 = m143080a;
                        }
                    } catch (Exception e15) {
                        e = e15;
                        c28610b9 = c28610b;
                    } catch (Throwable th8) {
                        th = th8;
                        c28610b8 = c28610b;
                    }
                } catch (Exception e16) {
                    e = e16;
                    c28613e2 = c28613e;
                    c28610b7 = c28610b;
                    exc = e;
                    arrayList2 = arrayList2;
                    c28610b2 = c28610b7;
                    AbstractC23350e.m122778h(exc);
                    weakReference2 = this.f135335e;
                    if (weakReference2 != null) {
                    }
                    m145920l();
                } catch (Throwable th9) {
                    th = th9;
                    c28613e2 = c28613e;
                    c28610b6 = c28610b;
                    th2 = th;
                    list = arrayList2;
                    c28610b4 = c28610b6;
                    weakReference = this.f135335e;
                    if (weakReference != null) {
                    }
                    m145920l();
                    throw th2;
                }
            } catch (Exception e17) {
                e = e17;
            } catch (Throwable th10) {
                th = th10;
            }
        } catch (Exception e18) {
            e = e18;
            c28610b3 = c28610b;
            list3 = arrayList2;
        } catch (Throwable th11) {
            th = th11;
            c28610b2 = c28610b;
        }
        if (weakReference3 != null && (bVar4 = (b) weakReference3.get()) != null) {
            list2 = (List) m143080a;
            m17937B0 = this.f135337g.m17937B0();
            str = this.f135336f;
            c28613e2 = c28613e;
            bVar3 = bVar4;
            c28610b5 = r32;
            bVar3.mo64335d(c28610b5, list2, m17937B0, c28613e2.m143084e(str));
            bVar3.mo64334c(c28610b5);
            bVar3.mo64336e(c28610b5);
        }
        m145920l();
    }

    /* renamed from: j */
    public final void m145933j(C28610b c28610b) {
        AbstractC19074t.m100208f(c28610b, "pullMsgCommand");
        C29199a.m145771a("[MyCloud] checkCreateGapPullMsgMyCloudHttp(needCreateGAPSyncAll=" + c28610b.m143053n() + ", needCreateGAPAfterLogin=" + c28610b.m143052m() + ")");
        if (!c28610b.m143052m() && !c28610b.m143053n()) {
            return;
        }
        if (c28610b.m143053n()) {
            c28610b.m143045L(false);
        }
        long currentTimeMillis = System.currentTimeMillis();
        MessageId m41067h = MessageId.Companion.m41067h();
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new c(c28610b, m41067h, currentTimeMillis));
        C29199a.m145771a("[MyCloud] checkCreateGapPullMsgMyCloudHttp START messageId=" + m41067h);
        c0766k.mo1701o5(m41067h, 3);
    }

    /* renamed from: m */
    public final void m145934m() {
        this.f135331a = true;
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: ws.m
            public /* synthetic */ RunnableC29212m() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C29213n.m145921n(C29213n.this);
            }
        });
    }

    /* renamed from: t */
    public final C28610b m145935t() {
        return this.f135334d;
    }

    public String toString() {
        return this.f135334d + ", threadId=" + this.f135336f + ", taskId=" + this.f135338h;
    }
}
