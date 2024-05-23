package com.zing.zalo.p077ui.zalocloud.setup;

import ah0.C0860a;
import aj0.C0880c;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import bj0.C2826e;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.zalocloud.setup.ZCloudPaymentSetupView;
import com.zing.zalo.p077ui.zviews.BaseZaloView;
import com.zing.zalo.p077ui.zviews.t81;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zdesign.component.C16972e0;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalocore.CoreUtility;
import dh0.C17933b;
import ej0.AbstractC18457a;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19071q;
import jj0.EnumC21277b;
import jj0.EnumC21279d;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import me0.AbstractC23136l9;
import nl.C23870a;
import on0.AbstractC24341v;
import org.json.JSONObject;
import p348mi.AbstractC23306f;
import p542ub.InterfaceC27218a;
import p716zh.C31877d;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import tb0.C26626l;
import tg0.C26676b;
import vg.AbstractC28207v1;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;
import xi0.C29673d;
import zi0.C32216b;
import zi0.C32217c;
import zi0.InterfaceC32215a;

/* loaded from: classes6.dex */
public final class ZCloudPaymentSetupView extends BaseZaloView implements ZaloView.InterfaceC17421f {
    public static final C13991a Companion = new C13991a(null);

    /* renamed from: N0 */
    private Job f71986N0;

    /* renamed from: O0 */
    private Job f71987O0;

    /* renamed from: P0 */
    private JSONObject f71988P0;

    /* renamed from: M0 */
    private C29673d f71985M0 = C29673d.f136989d;

    /* renamed from: Q0 */
    private final AbstractC28207v1.j0 f71989Q0 = new AbstractC28207v1.j0() { // from class: hc0.s
        @Override // vg.AbstractC28207v1.j0
        /* renamed from: a */
        public final void mo87297a(ZaloView zaloView, String str, int i11, String str2, AbstractC28207v1.h0 h0Var, String str3, AbstractC28207v1.f0 f0Var, C31877d c31877d) {
            ZCloudPaymentSetupView.m77838IM(ZCloudPaymentSetupView.this, zaloView, str, i11, str2, h0Var, str3, f0Var, c31877d);
        }
    };

    /* renamed from: com.zing.zalo.ui.zalocloud.setup.ZCloudPaymentSetupView$a */
    /* loaded from: classes6.dex */
    public static final class C13991a {
        private C13991a() {
        }

        public /* synthetic */ C13991a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.setup.ZCloudPaymentSetupView$b */
    /* loaded from: classes6.dex */
    public /* synthetic */ class C13992b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f71990a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f71991b;

        static {
            int[] iArr = new int[EnumC21279d.values().length];
            try {
                iArr[EnumC21279d.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC21279d.ITEM_ALREADY_OWNED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f71990a = iArr;
            int[] iArr2 = new int[EnumC21277b.values().length];
            try {
                iArr2[EnumC21277b.ITEM_ALREADY_OWNED.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[EnumC21277b.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[EnumC21277b.USER_CANCELED.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            f71991b = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zalocloud.setup.ZCloudPaymentSetupView$c */
    /* loaded from: classes6.dex */
    public static final class C13993c extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f71992t;

        /* renamed from: u */
        final /* synthetic */ JSONObject f71993u;

        /* renamed from: v */
        final /* synthetic */ ZCloudPaymentSetupView f71994v;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.ui.zalocloud.setup.ZCloudPaymentSetupView$c$a */
        /* loaded from: classes6.dex */
        public /* synthetic */ class a extends C19071q implements InterfaceC18505l {
            a(Object obj) {
                super(1, obj, ZCloudPaymentSetupView.class, "onCreateTransactionSuccess", "onCreateTransactionSuccess(Lorg/json/JSONObject;)V", 0);
            }

            /* renamed from: h */
            public final void m77864h(JSONObject jSONObject) {
                AbstractC19074t.m100208f(jSONObject, "p0");
                ((ZCloudPaymentSetupView) this.f94922q).m77835FM(jSONObject);
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: i9 */
            public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                m77864h((JSONObject) obj);
                return C24848g0.f119245a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.ui.zalocloud.setup.ZCloudPaymentSetupView$c$b */
        /* loaded from: classes6.dex */
        public /* synthetic */ class b extends C19071q implements InterfaceC18509p {
            b(Object obj) {
                super(2, obj, ZCloudPaymentSetupView.class, "onCreateTransactionFail", "onCreateTransactionFail(ILjava/lang/String;)V", 0);
            }

            /* renamed from: h */
            public final void m77865h(int i11, String str) {
                AbstractC19074t.m100208f(str, "p1");
                ((ZCloudPaymentSetupView) this.f94922q).m77834EM(i11, str);
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: pC */
            public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
                m77865h(((Number) obj).intValue(), (String) obj2);
                return C24848g0.f119245a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C13993c(JSONObject jSONObject, ZCloudPaymentSetupView zCloudPaymentSetupView, Continuation continuation) {
            super(2, continuation);
            this.f71993u = jSONObject;
            this.f71994v = zCloudPaymentSetupView;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new C13993c(this.f71993u, this.f71994v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f71992t == 0) {
                AbstractC24862s.m129228b(obj);
                C23870a m120679j2 = AbstractC23306f.m120679j2();
                JSONObject jSONObject = this.f71993u;
                ZCloudPaymentSetupView zCloudPaymentSetupView = this.f71994v;
                m120679j2.m124774J0(jSONObject, new a(zCloudPaymentSetupView), new b(zCloudPaymentSetupView));
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C13993c) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zalocloud.setup.ZCloudPaymentSetupView$d */
    /* loaded from: classes6.dex */
    public static final class C13994d extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f71995t;

        /* renamed from: v */
        final /* synthetic */ C0880c f71997v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C13994d(C0880c c0880c, Continuation continuation) {
            super(2, continuation);
            this.f71997v = c0880c;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new C13994d(this.f71997v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f71995t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C29673d c29673d = ZCloudPaymentSetupView.this.f71985M0;
                C0880c c0880c = this.f71997v;
                this.f71995t = 1;
                if (c29673d.m147575t0(c0880c, true, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C13994d) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zalocloud.setup.ZCloudPaymentSetupView$e */
    /* loaded from: classes6.dex */
    public static final class C13995e extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C13995e f71998q = new C13995e();

        C13995e() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC32215a mo12V4() {
            C32217c c32217c = C32217c.f148612a;
            c32217c.m155342c();
            return c32217c;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zalocloud.setup.ZCloudPaymentSetupView$f */
    /* loaded from: classes6.dex */
    public static final class C13996f extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f71999t;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.ui.zalocloud.setup.ZCloudPaymentSetupView$f$a */
        /* loaded from: classes6.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ ZCloudPaymentSetupView f72001p;

            a(ZCloudPaymentSetupView zCloudPaymentSetupView) {
                this.f72001p = zCloudPaymentSetupView;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo12109b(AbstractC18457a abstractC18457a, Continuation continuation) {
                this.f72001p.m77830AM(abstractC18457a);
                this.f72001p.m77856tM(abstractC18457a.m97774a());
                if (abstractC18457a instanceof AbstractC18457a.a) {
                    this.f72001p.m77837HM();
                } else if (abstractC18457a instanceof AbstractC18457a.c) {
                    this.f72001p.m77858vM((AbstractC18457a.c) abstractC18457a);
                } else if (abstractC18457a instanceof AbstractC18457a.d) {
                    this.f72001p.m77859wM((AbstractC18457a.d) abstractC18457a);
                } else if (abstractC18457a instanceof AbstractC18457a.e) {
                    this.f72001p.m77831BM((AbstractC18457a.e) abstractC18457a);
                } else {
                    boolean z11 = abstractC18457a instanceof AbstractC18457a.b;
                }
                return C24848g0.f119245a;
            }
        }

        C13996f(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new C13996f(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f71999t;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                StateFlow m147559T = ZCloudPaymentSetupView.this.f71985M0.m147559T();
                a aVar = new a(ZCloudPaymentSetupView.this);
                this.f71999t = 1;
                if (m147559T.mo97893a(aVar, this) == m142578e) {
                    return m142578e;
                }
            }
            throw new KotlinNothingValueException();
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C13996f) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: AM */
    public final void m77830AM(AbstractC18457a abstractC18457a) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Cloud IAP Current State: ");
        if (abstractC18457a instanceof AbstractC18457a.a) {
            sb2.append("[Complete] -> { isLoading: " + abstractC18457a.m97774a() + " }");
            return;
        }
        if (abstractC18457a instanceof AbstractC18457a.b) {
            sb2.append("[Loading] -> { isLoading: " + abstractC18457a.m97774a() + " }");
            return;
        }
        if (abstractC18457a instanceof AbstractC18457a.c) {
            sb2.append("[Response Request] -> { " + abstractC18457a + " }");
            return;
        }
        if (abstractC18457a instanceof AbstractC18457a.d) {
            sb2.append("[Response Result] -> { " + abstractC18457a + " }");
            return;
        }
        if (abstractC18457a instanceof AbstractC18457a.e) {
            sb2.append("[Verify Retry] -> { " + abstractC18457a + " }");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: BM */
    public final void m77831BM(final AbstractC18457a.e eVar) {
        Context m92648SI = m92648SI();
        if (m92648SI == null) {
            m92648SI = CoreUtility.getAppContext();
        }
        AbstractC19074t.m100205c(m92648SI);
        C16972e0.a m90917A = new C16972e0.a(m92648SI).m90932i(C16972e0.b.DIALOG_INFORMATION).m90917A(AbstractC8020f0.browser_javascript_alert_title);
        String m92652XI = m92652XI(AbstractC8020f0.str_iap_verify_error_title);
        AbstractC19074t.m100207e(m92652XI, "getString(...)");
        C16972e0.a m90949z = m90917A.m90949z(m92652XI);
        if (eVar.m97785c()) {
            String m92652XI2 = m92652XI(AbstractC8020f0.str_iap_verify_retry_negative_button);
            AbstractC19074t.m100207e(m92652XI2, "getString(...)");
            m90949z.m90934k(m92652XI2, new InterfaceC17463d.d() { // from class: hc0.t
                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                    ZCloudPaymentSetupView.m77832CM(interfaceC17463d, i11);
                }
            });
        } else {
            String m92652XI3 = m92652XI(AbstractC8020f0.str_iap_verify_retry_positive_button);
            AbstractC19074t.m100207e(m92652XI3, "getString(...)");
            m90949z.m90943t(m92652XI3, new InterfaceC17463d.d() { // from class: hc0.u
                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                    ZCloudPaymentSetupView.m77833DM(ZCloudPaymentSetupView.this, eVar, interfaceC17463d, i11);
                }
            });
        }
        m90949z.m90923G();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CM */
    public static final void m77832CM(InterfaceC17463d interfaceC17463d, int i11) {
        interfaceC17463d.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: DM */
    public static final void m77833DM(ZCloudPaymentSetupView zCloudPaymentSetupView, AbstractC18457a.e eVar, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(zCloudPaymentSetupView, "this$0");
        AbstractC19074t.m100208f(eVar, "$data");
        zCloudPaymentSetupView.m77860xM(eVar.m97784b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: EM */
    public final void m77834EM(int i11, String str) {
        ToastUtils.showMess("Đã có lỗi xảy ra, vui lòng thử lại! ( Mã lỗi: S[" + i11 + "] )");
        C26676b.m136957g("SMLZCloudPaymentSetupView", "onCreateTransactionFail(): {errorCode=" + i11 + ", errorMsg=" + str + "}", null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: FM */
    public final void m77835FM(JSONObject jSONObject) {
        try {
            if (this.f71985M0.m147557L() == 2) {
                C29673d c29673d = this.f71985M0;
                Context m92686rK = m92686rK();
                AbstractC19074t.m100206d(m92686rK, "null cannot be cast to non-null type android.app.Activity");
                c29673d.m147565a0((Activity) m92686rK, "CALLBACK_CLOUD_REQUEST_GOOGLE_BILLING", C2826e.Companion.m13663a(jSONObject));
            }
        } catch (Exception e11) {
            C26676b.m136953c(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: GM */
    public static final void m77836GM(ZCloudPaymentSetupView zCloudPaymentSetupView, View view) {
        AbstractC19074t.m100208f(zCloudPaymentSetupView, "this$0");
        zCloudPaymentSetupView.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: HM */
    public final void m77837HM() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: IM */
    public static final void m77838IM(ZCloudPaymentSetupView zCloudPaymentSetupView, ZaloView zaloView, String str, int i11, String str2, AbstractC28207v1.h0 h0Var, String str3, AbstractC28207v1.f0 f0Var, C31877d c31877d) {
        AbstractC19074t.m100208f(zCloudPaymentSetupView, "this$0");
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != -1578458440) {
                if (hashCode != 549483912) {
                    if (hashCode == 1507266761 && str.equals("action.zcloud.iappayment")) {
                        AbstractC19074t.m100205c(str2);
                        zCloudPaymentSetupView.m77855sM(str2);
                        return;
                    }
                    return;
                }
                if (str.equals("action.zcloud.register.close")) {
                    zCloudPaymentSetupView.finish();
                    return;
                }
                return;
            }
            if (str.equals("action.open.zinstantview")) {
                AbstractC19074t.m100205c(str2);
                zCloudPaymentSetupView.m77839JM(str2);
            }
        }
    }

    /* renamed from: JM */
    private final void m77839JM(String str) {
        boolean m127128x;
        m127128x = AbstractC24341v.m127128x(str);
        if (!m127128x) {
            try {
                AbstractC28207v1.m141875H0(new JSONObject(str), m92692wK(), null, null, this.f71989Q0, 102, new t81());
            } catch (Exception e11) {
                C26676b.m136953c(e11);
            }
        }
    }

    /* renamed from: qM */
    private final void m77853qM() {
        Job job = this.f71986N0;
        if (job != null) {
            if (job == null) {
                AbstractC19074t.m100223u("jobCreateTransaction");
                job = null;
            }
            if (job.mo112496c()) {
                Job job2 = this.f71986N0;
                if (job2 == null) {
                    AbstractC19074t.m100223u("jobCreateTransaction");
                    job2 = null;
                }
                Job.DefaultImpls.m112740a(job2, null, 1, null);
            }
        }
    }

    /* renamed from: rM */
    private final void m77854rM() {
        Job job = this.f71987O0;
        if (job != null) {
            if (job == null) {
                AbstractC19074t.m100223u("jobListenStateBilling");
                job = null;
            }
            if (job.mo112496c()) {
                Job job2 = this.f71987O0;
                if (job2 == null) {
                    AbstractC19074t.m100223u("jobListenStateBilling");
                    job2 = null;
                }
                Job.DefaultImpls.m112740a(job2, null, 1, null);
            }
        }
    }

    /* renamed from: sM */
    private final void m77855sM(String str) {
        boolean m127128x;
        Job m112540d;
        m127128x = AbstractC24341v.m127128x(str);
        if (!m127128x) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                this.f71988P0 = jSONObject;
                m112540d = BuildersKt__Builders_commonKt.m112540d(C17933b.f90533a.m94579d(), null, null, new C13993c(jSONObject, this, null), 3, null);
                this.f71986N0 = m112540d;
            } catch (Exception e11) {
                C26676b.m136953c(e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: tM */
    public final void m77856tM(boolean z11) {
        if (z11) {
            mo46829Y();
        } else {
            mo49315c4();
        }
    }

    /* renamed from: uM */
    private final void m77857uM() {
        JSONObject jSONObject = this.f71988P0;
        if (jSONObject != null) {
            C0860a.Companion.m2473a().m2471v(jSONObject);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: vM */
    public final void m77858vM(AbstractC18457a.c cVar) {
        int i11 = C13992b.f71990a[cVar.m97779f().ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                ToastUtils.showMess("Đã có lỗi xảy ra, vui lòng thử lại! ( Mã lỗi: I.[" + cVar.m97779f().m110221c() + "] )");
            } else {
                ToastUtils.showMess("Bạn đã mua sản phẩm này rồi!");
            }
        }
        this.f71985M0.m147553D();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: wM */
    public final void m77859wM(AbstractC18457a.d dVar) {
        int i11 = C13992b.f71991b[dVar.m97783e().ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    ToastUtils.showMess("Giao dịch thất bại, vui lòng thử lại! ( Mã lỗi: B[" + dVar.m97783e().m110218c() + "] )");
                }
            } else {
                m77857uM();
            }
        } else {
            ToastUtils.showMess("Bạn đã mua sản phẩm này rồi!");
        }
        this.f71985M0.m147553D();
    }

    /* renamed from: xM */
    private final void m77860xM(C0880c c0880c) {
        BuildersKt__Builders_commonKt.m112540d(C17933b.f90533a.m94579d(), null, null, new C13994d(c0880c, null), 3, null);
    }

    /* renamed from: yM */
    private final void m77861yM() {
        C32216b.f148610a.m155341b(C13995e.f71998q);
        this.f71985M0.m147560V();
        m77862zM();
    }

    /* renamed from: zM */
    private final void m77862zM() {
        Job m112540d;
        m112540d = BuildersKt__Builders_commonKt.m112540d(C17933b.f90533a.m94579d(), null, null, new C13996f(null), 3, null);
        this.f71987O0 = m112540d;
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        if (AbstractC23306f.m120691m2().m2466q()) {
            C26676b.m136955e("SMLZCloudPaymentSetupView", "Already zCloud PAID user ---> Finish view", C26676b.b.f126335t);
            finish();
        }
        m77861yM();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.setClickable(true);
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: hc0.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ZCloudPaymentSetupView.m77836GM(ZCloudPaymentSetupView.this, view);
            }
        });
        linearLayout.setBackgroundColor(AbstractC23136l9.m118641B(linearLayout.getContext(), AbstractC16801x.transparent));
        return linearLayout;
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: IJ */
    public void mo39024IJ() {
        this.f71985M0.m147553D();
        this.f71985M0.m147554F();
        m77853qM();
        m77854rM();
        super.mo39024IJ();
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "SMLZCloudPaymentSetupView";
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        super.onActivityResult(i11, i12, intent);
        if (i11 == 101) {
            finish();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        C26626l m136712a = C26626l.Companion.m136712a();
        InterfaceC27218a m92692wK = m92692wK();
        AbstractC19074t.m100207e(m92692wK, "requireZaloActivity(...)");
        m136712a.m136697Q(m92692wK, 101, this.f71989Q0);
    }
}
