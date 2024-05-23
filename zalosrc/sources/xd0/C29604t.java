package xd0;

import b40.C2535j;
import b40.C2549x;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.p062db.C7956b;
import dj.C17945a0;
import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import gw.AbstractC19646n0;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import p019aj.C0876j;
import p185gc.AbstractC19383g;
import p363nh.C23744a;
import p396ol.C24302e;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29094b;
import wm0.AbstractC29104l;

/* renamed from: xd0.t */
/* loaded from: classes4.dex */
public final class C29604t extends AbstractC19383g {

    /* renamed from: a */
    private final C0876j f136662a;

    /* renamed from: xd0.t$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a */
        private final String f136663a;

        /* renamed from: b */
        private final String f136664b;

        /* renamed from: c */
        private final MessageId f136665c;

        /* renamed from: d */
        private final String f136666d;

        /* renamed from: e */
        private final String f136667e;

        public a(String str, String str2, MessageId messageId, String str3, String str4) {
            AbstractC19074t.m100208f(str, "currentUserUid");
            AbstractC19074t.m100208f(str2, "conversationId");
            AbstractC19074t.m100208f(messageId, "messageId");
            AbstractC19074t.m100208f(str3, "senderUid");
            AbstractC19074t.m100208f(str4, "actionLogEntryPoint");
            this.f136663a = str;
            this.f136664b = str2;
            this.f136665c = messageId;
            this.f136666d = str3;
            this.f136667e = str4;
        }

        /* renamed from: a */
        public final String m147119a() {
            return this.f136667e;
        }

        /* renamed from: b */
        public final String m147120b() {
            return this.f136664b;
        }

        /* renamed from: c */
        public final String m147121c() {
            return this.f136663a;
        }

        /* renamed from: d */
        public final MessageId m147122d() {
            return this.f136665c;
        }
    }

    /* renamed from: xd0.t$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f136668t;

        /* renamed from: u */
        final /* synthetic */ C17945a0 f136669u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C17945a0 c17945a0, Continuation continuation) {
            super(2, continuation);
            this.f136669u = c17945a0;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new b(this.f136669u, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f136668t == 0) {
                AbstractC24862s.m129228b(obj);
                return AbstractC29094b.m145339a(C24302e.Companion.m126914c(this.f136669u));
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    public C29604t(C0876j c0876j) {
        AbstractC19074t.m100208f(c0876j, "messageRepo");
        this.f136662a = c0876j;
    }

    /* renamed from: e */
    public static final void m147117e(C29604t c29604t, MessageId messageId, String str, a aVar, String str2) {
        Object m112536b;
        boolean z11;
        AbstractC19074t.m100208f(c29604t, "this$0");
        AbstractC19074t.m100208f(messageId, "$messageId");
        AbstractC19074t.m100208f(str, "$currentUserUid");
        AbstractC19074t.m100208f(aVar, "$params");
        AbstractC19074t.m100208f(str2, "$conversationId");
        C17945a0 m2635r = c29604t.f136662a.m2635r(messageId);
        if (m2635r == null && (m2635r = C7956b.Companion.m41573b().m41553q(messageId)) == null) {
            return;
        }
        if (!m2635r.m95022U7()) {
            if (m2635r.m94959N6()) {
                C2535j c2535j = C2535j.f10308a;
                MessageId m95029V3 = m2635r.m95029V3();
                AbstractC19074t.m100207e(m95029V3, "getMessageId(...)");
                c2535j.m12771n(m95029V3);
            }
            m112536b = BuildersKt__BuildersKt.m112536b(null, new b(m2635r, null), 1, null);
            if (!((Boolean) m112536b).booleanValue() && C24302e.Companion.m126922m() && !AbstractC19646n0.m103038v1(m2635r.m95295x4(), m2635r.m94974P4())) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (m2635r.m94871D7()) {
                if (z11) {
                    m2635r.m95272uc();
                } else {
                    m2635r.m95138fc(false, false, false, str, false);
                }
            } else {
                m2635r.m95138fc(z11, false, false, str, true);
            }
            if (m2635r.m95022U7()) {
                C2549x.f10397a.m12853g(aVar.m147119a(), m2635r);
            }
        }
        C23744a.Companion.m124119a().m124116d(93, str2, m2635r);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: xd0.s.<init>(xd0.t, com.zing.zalo.data.entity.chat.message.MessageId, java.lang.String, xd0.t$a, java.lang.String):void, class status: GENERATED_AND_UNLOADED
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
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    @Override // p185gc.AbstractC19383g
    /* renamed from: d */
    public void mo12006b(xd0.C29604t.a r12) {
        /*
            r11 = this;
            java.lang.String r0 = "params"
            fn0.AbstractC19074t.m100208f(r12, r0)
            java.lang.String r4 = r12.m147121c()
            java.lang.String r0 = r12.m147120b()
            com.zing.zalo.data.entity.chat.message.MessageId r3 = r12.m147122d()
            mg.a r7 = mg.C23288a.f113033a
            r8 = 0
            xd0.s r9 = new xd0.s
            r1 = r9
            r2 = r11
            r5 = r12
            r6 = r0
            r1.<init>()
            r12 = 2
            r10 = 0
            r5 = r7
            r7 = r8
            r8 = r9
            r9 = r12
            eg0.AbstractC18428c.m97659b(r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xd0.C29604t.mo12006b(xd0.t$a):void");
    }
}
