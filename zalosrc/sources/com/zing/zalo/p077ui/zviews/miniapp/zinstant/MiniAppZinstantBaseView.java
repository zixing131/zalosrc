package com.zing.zalo.p077ui.zviews.miniapp.zinstant;

import ae.C0762g;
import am.C0923m;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.zing.zalo.p077ui.zviews.InterfaceC15921mv;
import com.zing.zalo.p077ui.zviews.MPWebView;
import com.zing.zalo.p077ui.zviews.MiniAppPopupView;
import com.zing.zalo.p077ui.zviews.MiniAppZinstantErrorView;
import com.zing.zalo.p077ui.zviews.MiniAppZinstantLayout;
import com.zing.zalo.p077ui.zviews.MiniAppZinstantSkeleton;
import com.zing.zalo.p077ui.zviews.WebBaseView;
import com.zing.zalo.p077ui.zviews.miniapp.zinstant.MiniAppZinstantBaseView;
import com.zing.zalo.webview.C16790h;
import com.zing.zalo.zview.C17487o0;
import en0.InterfaceC18494a;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19055h0;
import gg0.AbstractC19444a;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import me0.C23055e5;
import org.json.JSONObject;
import p189gv.C19609h;
import p307kv.AbstractC21954k;
import p667y2.C30268e;
import pm0.AbstractC24856m;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import qm0.AbstractC25368s;
import vg.AbstractC28207v1;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;
import zf0.C31825b;
import zf0.InterfaceC31826c;

/* loaded from: classes6.dex */
public abstract class MiniAppZinstantBaseView extends MiniAppPopupView implements View.OnClickListener, InterfaceC31826c {
    public static final C15891a Companion = new C15891a(null);

    /* renamed from: R0 */
    private C19609h f81137R0;

    /* renamed from: S0 */
    private int f81138S0;

    /* renamed from: T0 */
    private C31825b f81139T0;

    /* renamed from: U0 */
    private boolean f81140U0;

    /* renamed from: V0 */
    private List f81141V0;

    /* renamed from: W0 */
    private final InterfaceC24854k f81142W0;

    /* renamed from: X0 */
    private final InterfaceC24854k f81143X0;

    /* renamed from: com.zing.zalo.ui.zviews.miniapp.zinstant.MiniAppZinstantBaseView$a */
    /* loaded from: classes6.dex */
    public static final class C15891a {
        private C15891a() {
        }

        public /* synthetic */ C15891a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.miniapp.zinstant.MiniAppZinstantBaseView$b */
    /* loaded from: classes6.dex */
    public static final class C15892b implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ C19055h0 f81144a;

        /* renamed from: b */
        final /* synthetic */ C0762g f81145b;

        /* renamed from: c */
        final /* synthetic */ String f81146c;

        /* renamed from: d */
        final /* synthetic */ String f81147d;

        /* renamed from: e */
        final /* synthetic */ int f81148e;

        C15892b(C19055h0 c19055h0, C0762g c0762g, String str, String str2, int i11) {
            this.f81144a = c19055h0;
            this.f81145b = c0762g;
            this.f81146c = str;
            this.f81147d = str2;
            this.f81148e = i11;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            Integer num;
            AbstractC20110a.f98889a.mo104551d(String.valueOf(c20096c), new Object[0]);
            if (c20096c != null) {
                num = Integer.valueOf(c20096c.m104491c());
            } else {
                num = null;
            }
            if (this.f81144a.f94931p > 0 && num != null && num.intValue() != 0 && num.intValue() != -69) {
                C19055h0 c19055h0 = this.f81144a;
                c19055h0.f94931p--;
                this.f81145b.m1378q(Long.parseLong(this.f81146c), this.f81147d, this.f81148e);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type org.json.JSONObject");
                JSONObject jSONObject = (JSONObject) obj;
                int i11 = jSONObject.getInt("error_code");
                AbstractC20110a.f98889a.mo104551d("errorCode = " + i11 + " msg = " + jSONObject.getString("error_message"), new Object[0]);
                C19055h0 c19055h0 = this.f81144a;
                int i12 = c19055h0.f94931p;
                if (i12 > 0 && i11 != 0 && i11 != -69) {
                    c19055h0.f94931p = i12 - 1;
                    this.f81145b.m1378q(Long.parseLong(this.f81146c), this.f81147d, this.f81148e);
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104551d(e11.toString(), new Object[0]);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.miniapp.zinstant.MiniAppZinstantBaseView$c */
    /* loaded from: classes6.dex */
    public static final class C15893c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: com.zing.zalo.ui.zviews.miniapp.zinstant.MiniAppZinstantBaseView$c$a */
        /* loaded from: classes6.dex */
        public static final class a implements InterfaceC15921mv {

            /* renamed from: a */
            final /* synthetic */ MiniAppZinstantBaseView f81150a;

            a(MiniAppZinstantBaseView miniAppZinstantBaseView) {
                this.f81150a = miniAppZinstantBaseView;
            }

            @Override // com.zing.zalo.p077ui.zviews.InterfaceC15921mv
            /* renamed from: a */
            public void mo87355a() {
                if (C23055e5.m118273h(false, 1, null)) {
                    ViewGroup mo81263CM = this.f81150a.mo81263CM();
                    if (mo81263CM != null) {
                        mo81263CM.removeView(this.f81150a.m87339GM());
                    }
                    C31825b c31825b = this.f81150a.f81139T0;
                    if (c31825b != null) {
                        c31825b.m152901i();
                    }
                }
            }
        }

        C15893c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final a mo12V4() {
            return new a(MiniAppZinstantBaseView.this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.miniapp.zinstant.MiniAppZinstantBaseView$d */
    /* loaded from: classes6.dex */
    public static final class C15894d extends AbstractC19075u implements InterfaceC18494a {
        C15894d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final MiniAppZinstantErrorView mo12V4() {
            Context context = MiniAppZinstantBaseView.this.getContext();
            AbstractC19074t.m100205c(context);
            MiniAppZinstantErrorView miniAppZinstantErrorView = new MiniAppZinstantErrorView(context);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams.addRule(13);
            miniAppZinstantErrorView.setLayoutParams(layoutParams);
            miniAppZinstantErrorView.setMaZinstantErrorListener(MiniAppZinstantBaseView.this.m87338DM());
            return miniAppZinstantErrorView;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.miniapp.zinstant.MiniAppZinstantBaseView$e */
    /* loaded from: classes6.dex */
    public static final class C15895e extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f81152t;

        C15895e(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new C15895e(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            ViewGroup mo81263CM;
            AbstractC28298d.m142578e();
            if (this.f81152t == 0) {
                AbstractC24862s.m129228b(obj);
                View mo81264HM = MiniAppZinstantBaseView.this.mo81264HM();
                if (mo81264HM != null && (mo81263CM = MiniAppZinstantBaseView.this.mo81263CM()) != null) {
                    mo81263CM.removeView(mo81264HM);
                }
                ViewGroup mo81263CM2 = MiniAppZinstantBaseView.this.mo81263CM();
                if (mo81263CM2 != null) {
                    mo81263CM2.removeView(MiniAppZinstantBaseView.this.m87339GM());
                }
                MiniAppZinstantLayout mo81265IM = MiniAppZinstantBaseView.this.mo81265IM();
                if (mo81265IM != null) {
                    mo81265IM.setVisibility(0);
                }
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C15895e) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    public MiniAppZinstantBaseView() {
        List m131505m;
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        m131505m = AbstractC25368s.m131505m(5, 4, 3);
        this.f81141V0 = m131505m;
        m129210a = AbstractC24856m.m129210a(new C15894d());
        this.f81142W0 = m129210a;
        m129210a2 = AbstractC24856m.m129210a(new C15893c());
        this.f81143X0 = m129210a2;
    }

    /* renamed from: AM */
    private final void m87336AM() {
        try {
            AbstractC19444a.m101697e(new Runnable() { // from class: mc0.c
                public /* synthetic */ RunnableC22984c() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    MiniAppZinstantBaseView.m87337BM(MiniAppZinstantBaseView.this);
                }
            });
        } catch (Exception unused) {
        }
    }

    /* renamed from: BM */
    public static final void m87337BM(MiniAppZinstantBaseView miniAppZinstantBaseView) {
        C19609h c19609h;
        String m102616j;
        AbstractC19074t.m100208f(miniAppZinstantBaseView, "this$0");
        if ((miniAppZinstantBaseView.m92662fJ() instanceof C16790h) && (c19609h = miniAppZinstantBaseView.f81137R0) != null && (m102616j = c19609h.m102616j()) != null) {
            C17487o0 m92662fJ = miniAppZinstantBaseView.m92662fJ();
            AbstractC19074t.m100206d(m92662fJ, "null cannot be cast to non-null type com.zing.zalo.webview.MiniProgramViewManager");
            ((C16790h) m92662fJ).m89695s2(m102616j, true);
        }
    }

    /* renamed from: DM */
    public final C15893c.a m87338DM() {
        return (C15893c.a) this.f81143X0.getValue();
    }

    /* renamed from: GM */
    public final MiniAppZinstantErrorView m87339GM() {
        return (MiniAppZinstantErrorView) this.f81142W0.getValue();
    }

    /* renamed from: LM */
    public static final void m87340LM(MiniAppZinstantBaseView miniAppZinstantBaseView) {
        AbstractC19074t.m100208f(miniAppZinstantBaseView, "this$0");
        miniAppZinstantBaseView.m87343j0();
    }

    /* renamed from: MM */
    public static final void m87341MM(MiniAppZinstantBaseView miniAppZinstantBaseView) {
        AbstractC19074t.m100208f(miniAppZinstantBaseView, "this$0");
        View mo81264HM = miniAppZinstantBaseView.mo81264HM();
        if (mo81264HM != null) {
            mo81264HM.setVisibility(4);
        }
        MiniAppZinstantLayout mo81265IM = miniAppZinstantBaseView.mo81265IM();
        if (mo81265IM != null) {
            mo81265IM.setVisibility(4);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(13, -1);
        ViewGroup mo81263CM = miniAppZinstantBaseView.mo81263CM();
        if (mo81263CM != null) {
            mo81263CM.addView(miniAppZinstantBaseView.m87339GM(), layoutParams);
        }
    }

    /* renamed from: NM */
    private final void m87342NM() {
        ViewGroup mo81263CM = mo81263CM();
        if (mo81263CM != null) {
            mo81263CM.removeView(m87339GM());
        }
        View mo81264HM = mo81264HM();
        if (mo81264HM != null) {
            mo81264HM.setVisibility(0);
        }
        MiniAppZinstantLayout mo81265IM = mo81265IM();
        if (mo81265IM != null) {
            mo81265IM.setVisibility(4);
        }
    }

    /* renamed from: j0 */
    private final void m87343j0() {
        mo70710wy(new Runnable() { // from class: mc0.a
            public /* synthetic */ RunnableC22982a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                MiniAppZinstantBaseView.m87341MM(MiniAppZinstantBaseView.this);
            }
        });
    }

    /* renamed from: CM */
    public abstract ViewGroup mo81263CM();

    /* renamed from: EM */
    public final C19609h m87350EM() {
        return this.f81137R0;
    }

    /* renamed from: FM */
    public MPWebView mo81421FM() {
        return null;
    }

    /* renamed from: HM */
    public View mo81264HM() {
        if (getContext() == null) {
            return null;
        }
        Context context = getContext();
        AbstractC19074t.m100205c(context);
        return new MiniAppZinstantSkeleton(context);
    }

    /* renamed from: IM */
    public abstract MiniAppZinstantLayout mo81265IM();

    /* renamed from: JM */
    public void mo81426JM(String str, String str2) {
        JSONObject jSONObject;
        String string;
        AbstractC19074t.m100208f(str, "action");
        String str3 = null;
        C24848g0 c24848g0 = null;
        String str4 = null;
        if (str2 != null && str2.length() != 0) {
            jSONObject = new JSONObject(str2);
        } else {
            jSONObject = null;
        }
        if (str2 != null) {
            int hashCode = str.hashCode();
            int i11 = 1;
            if (hashCode != -559976282) {
                if (hashCode != 1425230731) {
                    mo81423zM(true);
                    return;
                } else {
                    mo81423zM(true);
                    return;
                }
            }
            if (str.equals("action.ma.permission.update")) {
                try {
                    C19055h0 c19055h0 = new C19055h0();
                    c19055h0.f94931p = 3;
                    if (jSONObject != null) {
                        C19609h c19609h = this.f81137R0;
                        if (c19609h != null) {
                            str4 = c19609h.m102616j();
                        }
                        str3 = jSONObject.optString("miniAppId", String.valueOf(str4));
                    }
                    if (str3 == null || (string = jSONObject.getString("permissionId")) == null) {
                        return;
                    }
                    boolean z11 = jSONObject.getBoolean("isGranted");
                    boolean optBoolean = jSONObject.optBoolean("isAskAgain", true);
                    if (z11) {
                        i11 = 2;
                    } else if (!optBoolean) {
                        i11 = 0;
                    }
                    C0923m m2889a = C0923m.Companion.m2889a();
                    if (m2889a != null) {
                        m2889a.m2887f(str3, string, i11);
                    }
                    C0762g c0762g = new C0762g();
                    c0762g.m1341j(new C15892b(c19055h0, c0762g, str3, string, i11));
                    c0762g.m1378q(Long.parseLong(str3), string, i11);
                    mo81424KM(str3, z11, optBoolean, str2);
                    return;
                } catch (Exception e11) {
                    AbstractC20110a.f98889a.mo104552e(e11);
                    return;
                }
            }
            if (AbstractC19074t.m100204b("action.ma.menu.reload", str)) {
                m87336AM();
            }
            MPWebView mo81421FM = mo81421FM();
            if (mo81421FM != null) {
                WebBaseView.m86665cQ(mo81421FM, str, str2, null, 4, null);
                c24848g0 = C24848g0.f119245a;
            }
            if (c24848g0 == null) {
                AbstractC28207v1.m141989h3(str, 2, m92676n2(), this, str2, null, null, null, null);
            }
        }
    }

    /* renamed from: KM */
    public void mo81424KM(String str, boolean z11, boolean z12, String str2) {
        AbstractC19074t.m100208f(str, "appId");
    }

    @Override // zf0.InterfaceC31826c
    /* renamed from: L0 */
    public void mo87351L0(String str, String str2) {
        AbstractC19074t.m100208f(str, "action");
        mo81426JM(str, str2);
    }

    /* renamed from: OM */
    public final void m87352OM() {
        BuildersKt__Builders_commonKt.m112540d(CoroutineScopeKt.m112637a(Dispatchers.m112681c()), null, null, new C15895e(null), 3, null);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        super.mo13886RJ();
        MiniAppZinstantLayout mo81265IM = mo81265IM();
        if (mo81265IM != null) {
            mo81265IM.onPause();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: UJ */
    public void mo37584UJ() {
        super.mo37584UJ();
        MiniAppZinstantLayout mo81265IM = mo81265IM();
        if (mo81265IM != null) {
            mo81265IM.onStart();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
        MiniAppZinstantLayout mo81265IM = mo81265IM();
        if (mo81265IM != null) {
            mo81265IM.onStop();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.MiniAppPopupView, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        C19609h c19609h;
        Long l11;
        MiniAppZinstantLayout mo81265IM;
        String str;
        String str2;
        JSONObject jSONObject;
        Bundle m92642L3;
        Bundle m92642L32;
        String m102616j;
        int i11;
        AbstractC19074t.m100208f(view, "view");
        super.mo37125ZJ(view, bundle);
        Bundle m92642L33 = m92642L3();
        String str3 = null;
        if (m92642L33 != null) {
            c19609h = (C19609h) AbstractC21954k.Companion.m114622q(m92642L33, "MINI_APP_INFO_EXTRA", C19609h.class);
        } else {
            c19609h = null;
        }
        this.f81137R0 = c19609h;
        Bundle m92642L34 = m92642L3();
        if (m92642L34 != null && m92642L34.containsKey("MINI_APP_VIEW_TYPE_TAG")) {
            Bundle m92642L35 = m92642L3();
            if (m92642L35 != null) {
                i11 = m92642L35.getInt("MINI_APP_VIEW_TYPE_TAG");
            } else {
                i11 = 0;
            }
            this.f81138S0 = i11;
            this.f81140U0 = this.f81141V0.contains(Integer.valueOf(i11));
        }
        if (C23055e5.m118273h(false, 1, null)) {
            m87342NM();
        } else {
            m87343j0();
        }
        C19609h c19609h2 = this.f81137R0;
        if (c19609h2 != null && (m102616j = c19609h2.m102616j()) != null) {
            l11 = Long.valueOf(Long.parseLong(m102616j));
        } else {
            l11 = null;
        }
        if (l11 != null && (mo81265IM = mo81265IM()) != null) {
            Bundle m92642L36 = m92642L3();
            if (m92642L36 != null) {
                str = m92642L36.getString("EXTRA_ACTION", "");
            } else {
                str = null;
            }
            Bundle m92642L37 = m92642L3();
            if (m92642L37 != null) {
                str2 = m92642L37.getString("EXTRA_H5_ACTION");
            } else {
                str2 = null;
            }
            if (str2 != null) {
                if (str2.length() != 0) {
                    jSONObject = new JSONObject(str2);
                    JSONObject mo81271yM = mo81271yM(str, jSONObject);
                    m92642L3 = m92642L3();
                    if (m92642L3 != null && m92642L3.containsKey("EXTRA_MA_ZINSTANT_CACHE") && (m92642L32 = m92642L3()) != null) {
                        str3 = m92642L32.getString("EXTRA_MA_ZINSTANT_CACHE");
                    }
                    C31825b c31825b = new C31825b(mo81265IM, l11.longValue(), this.f81138S0, mo81271yM, str3);
                    this.f81139T0 = c31825b;
                    c31825b.m152902k(this);
                }
            }
            jSONObject = null;
            JSONObject mo81271yM2 = mo81271yM(str, jSONObject);
            m92642L3 = m92642L3();
            if (m92642L3 != null) {
                str3 = m92642L32.getString("EXTRA_MA_ZINSTANT_CACHE");
            }
            C31825b c31825b2 = new C31825b(mo81265IM, l11.longValue(), this.f81138S0, mo81271yM2, str3);
            this.f81139T0 = c31825b2;
            c31825b2.m152902k(this);
        }
    }

    @Override // zf0.InterfaceC31826c
    /* renamed from: c */
    public void mo87353c(Exception exc) {
        AbstractC19074t.m100208f(exc, C30268e.f140632a);
        mo70710wy(new Runnable() { // from class: mc0.b
            public /* synthetic */ RunnableC22983b() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                MiniAppZinstantBaseView.m87340LM(MiniAppZinstantBaseView.this);
            }
        });
    }

    @Override // com.zing.zalo.p077ui.zviews.MiniAppBaseView, ac.InterfaceC0733x
    public String getTrackingKey() {
        int i11 = this.f81138S0;
        return i11 != 1 ? i11 != 2 ? "" : "MAPermissionManagement" : "MAInfoView";
    }

    public void onClick(View view) {
    }

    @Override // com.zing.zalo.p077ui.zviews.MiniAppBaseView, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        MiniAppZinstantLayout mo81265IM = mo81265IM();
        if (mo81265IM != null) {
            mo81265IM.onResume();
        }
    }

    /* renamed from: yM */
    public JSONObject mo81271yM(String str, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("action", str);
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            AbstractC19074t.m100207e(keys, "keys(...)");
            while (keys.hasNext()) {
                String next = keys.next();
                jSONObject2.put(next, jSONObject.opt(next));
            }
        }
        return jSONObject2;
    }

    /* renamed from: yo */
    public void mo81422yo(String str) {
        m87352OM();
    }

    /* renamed from: zM */
    public void mo81423zM(boolean z11) {
        if (mo81263CM() != null) {
            MiniAppPopupView.m81730mM(this, false, z11, null, 5, null);
        } else {
            finish();
        }
    }
}
