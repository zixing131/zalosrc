package com.zing.zalo.p077ui.zviews;

import ae.C0766k;
import am.C0927o;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import bo.C2998k3;
import bo.C3000l0;
import bo.C3020p0;
import bo.C3025q0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.feed.mvp.bottomsheetmenu.model.BottomSheetMenuBundleData;
import com.zing.zalo.feed.mvp.bottomsheetmenu.model.BottomSheetMenuResult;
import com.zing.zalo.feed.utils.FeedActionZUtils;
import com.zing.zalo.p077ui.zviews.FeedAdsZinstantDetailsView;
import com.zing.zalo.p077ui.zviews.ZinstantZaloView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zinstant.C17172p;
import com.zing.zalo.zinstant.ZaloZinstantLayout;
import com.zing.zalo.zinstant.zom.properties.ZOMInsight;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalo.zview.ZaloView;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import io.C20637a;
import is.AbstractC20826v0;
import is.C20834z0;
import java.util.Iterator;
import java.util.List;
import mm0.AbstractC23350e;
import on0.AbstractC24341v;
import org.json.JSONObject;
import p688yo.EnumC31036b;
import p716zh.C31877d;
import pm0.C24848g0;
import tr.C26883g;
import vg.AbstractC28207v1;

/* loaded from: classes6.dex */
public class FeedAdsZinstantDetailsView extends ZinstantZaloView {
    public static final C14252a Companion = new C14252a(null);

    /* renamed from: s1 */
    private final AbstractC28207v1.j0 f73255s1;

    /* renamed from: t1 */
    private AbstractC28207v1.j0 f73256t1;

    /* renamed from: com.zing.zalo.ui.zviews.FeedAdsZinstantDetailsView$a */
    /* loaded from: classes6.dex */
    public static final class C14252a {
        private C14252a() {
        }

        public /* synthetic */ C14252a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.FeedAdsZinstantDetailsView$b */
    /* loaded from: classes6.dex */
    public static final class C14253b implements InterfaceC20094a {

        /* renamed from: b */
        final /* synthetic */ C3020p0 f73258b;

        C14253b(C3020p0 c3020p0) {
            this.f73258b = c3020p0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public static final void m79517d(FeedAdsZinstantDetailsView feedAdsZinstantDetailsView) {
            AbstractC19074t.m100208f(feedAdsZinstantDetailsView, "this$0");
            try {
                feedAdsZinstantDetailsView.finish();
                feedAdsZinstantDetailsView.mo49315c4();
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            String m104492d;
            try {
                FeedAdsZinstantDetailsView.this.mo49315c4();
                if (c20096c != null && (m104492d = c20096c.m104492d()) != null && m104492d.length() != 0) {
                    ToastUtils.showMess(c20096c.m104492d());
                }
                ToastUtils.showMess(FeedAdsZinstantDetailsView.this.f72421L0.m92652XI(AbstractC8020f0.error_message));
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0062, code lost:            if (r5.m138524b(r2) != false) goto L24;     */
        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void mo927b(Object obj) {
            JSONObject jSONObject;
            String optString;
            AbstractC19074t.m100208f(obj, C0927o.f3427r);
            try {
                JSONObject jSONObject2 = null;
                if (obj instanceof JSONObject) {
                    jSONObject = (JSONObject) obj;
                } else {
                    jSONObject = null;
                }
                if (jSONObject != null) {
                    jSONObject2 = jSONObject.optJSONObject("data");
                }
                if (jSONObject2 != null) {
                    if (jSONObject2.optInt("flag") == 1 && (optString = jSONObject2.optString(ZMediaPlayer.OnNativeInvokeListener.ARG_URL)) != null && optString.length() != 0) {
                        ZaloWebView.Companion.m87168C(FeedAdsZinstantDetailsView.this.m92692wK(), optString);
                    }
                    C26883g.a aVar = C26883g.Companion;
                    C26883g m138535a = aVar.m138535a(0);
                    String str = this.f73258b.f12057p;
                    AbstractC19074t.m100207e(str, "fid");
                    if (!m138535a.m138524b(str)) {
                        C26883g m138535a2 = aVar.m138535a(1);
                        String str2 = this.f73258b.f12057p;
                        AbstractC19074t.m100207e(str2, "fid");
                    }
                    C20834z0.f102412a.m108927f(true);
                    final FeedAdsZinstantDetailsView feedAdsZinstantDetailsView = FeedAdsZinstantDetailsView.this;
                    feedAdsZinstantDetailsView.f72827B0.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.fd
                        @Override // java.lang.Runnable
                        public final void run() {
                            FeedAdsZinstantDetailsView.C14253b.m79517d(FeedAdsZinstantDetailsView.this);
                        }
                    }, 500L);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.FeedAdsZinstantDetailsView$c */
    /* loaded from: classes6.dex */
    public static final class C14254c extends C17172p {
        C14254c() {
        }

        @Override // com.zing.zalo.zinstant.C17172p, uk0.InterfaceC27292f
        /* renamed from: b */
        public void mo44291b(int i11, String str, String str2, ZOMInsight zOMInsight) {
            AbstractC19074t.m100208f(str, "zinstantDataId");
            AbstractC19074t.m100208f(str2, "zoneId");
            AbstractC19074t.m100208f(zOMInsight, "insight");
            super.mo44291b(i11, str, str2, zOMInsight);
            String str3 = zOMInsight.mValue;
        }

        @Override // com.zing.zalo.zinstant.C17172p, uk0.InterfaceC27292f
        /* renamed from: d */
        public void mo44292d(int i11, String str, String str2, ZOMInsight zOMInsight) {
            AbstractC19074t.m100208f(str, "zinstantDataId");
            AbstractC19074t.m100208f(str2, "zoneId");
            super.mo44292d(i11, str, str2, zOMInsight);
            if (zOMInsight != null && AbstractC19074t.m100204b(zOMInsight.mLabel, "social_feed_ads_message")) {
                try {
                    String optString = new JSONObject(zOMInsight.mValue).optString("fid");
                    FeedAdsZinstantDetailsView feedAdsZinstantDetailsView = FeedAdsZinstantDetailsView.this;
                    if (optString == null) {
                        optString = "";
                    }
                    feedAdsZinstantDetailsView.m79512oN(optString);
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                }
            }
        }
    }

    public FeedAdsZinstantDetailsView() {
        AbstractC28207v1.j0 j0Var = new AbstractC28207v1.j0() { // from class: com.zing.zalo.ui.zviews.ed
            @Override // vg.AbstractC28207v1.j0
            /* renamed from: a */
            public final void mo87297a(ZaloView zaloView, String str, int i11, String str2, AbstractC28207v1.h0 h0Var, String str3, AbstractC28207v1.f0 f0Var, C31877d c31877d) {
                FeedAdsZinstantDetailsView.m79507iN(FeedAdsZinstantDetailsView.this, zaloView, str, i11, str2, h0Var, str3, f0Var, c31877d);
            }
        };
        this.f73255s1 = j0Var;
        mo79514dN(j0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: iN */
    public static final void m79507iN(FeedAdsZinstantDetailsView feedAdsZinstantDetailsView, ZaloView zaloView, String str, int i11, String str2, AbstractC28207v1.h0 h0Var, String str3, AbstractC28207v1.f0 f0Var, C31877d c31877d) {
        C24848g0 c24848g0;
        AbstractC19074t.m100208f(feedAdsZinstantDetailsView, "this$0");
        if (str != null) {
            try {
                if (str.length() != 0) {
                    if (AbstractC19074t.m100204b(str, "action.social.open.feed_option")) {
                        feedAdsZinstantDetailsView.m79511nN(str2);
                        return;
                    }
                    AbstractC28207v1.j0 j0Var = feedAdsZinstantDetailsView.f73256t1;
                    if (j0Var != null) {
                        j0Var.mo87297a(zaloView, str, i11, str2, h0Var, str3, f0Var, c31877d);
                        c24848g0 = C24848g0.f119245a;
                    } else {
                        c24848g0 = null;
                    }
                    if (c24848g0 == null) {
                        AbstractC28207v1.m141989h3(str, 2, feedAdsZinstantDetailsView.m92676n2(), feedAdsZinstantDetailsView, str2, h0Var, null, new ZinstantZaloView.C15418g(feedAdsZinstantDetailsView, str, str2, 2), null);
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: jN */
    private final void m79508jN(C3020p0 c3020p0, int i11) {
        m79515kN(c3020p0, false, i11);
    }

    /* renamed from: lN */
    private final void m79509lN(C3020p0 c3020p0, int i11) {
        m79515kN(c3020p0, true, i11);
    }

    /* renamed from: mN */
    private final void m79510mN(Intent intent) {
        C20637a c20637a;
        if (intent != null) {
            try {
                if (intent.hasExtra("EXTRA_BUNDLE_DATA_RESULT")) {
                    BottomSheetMenuResult bottomSheetMenuResult = (BottomSheetMenuResult) intent.getParcelableExtra("EXTRA_BUNDLE_DATA_RESULT");
                    C3020p0 c3020p0 = null;
                    if (bottomSheetMenuResult != null) {
                        c20637a = bottomSheetMenuResult.m45565a();
                    } else {
                        c20637a = null;
                    }
                    if (c20637a != null && bottomSheetMenuResult.m45569e() == 1 && bottomSheetMenuResult.m45571g() != 0) {
                        int m45571g = bottomSheetMenuResult.m45571g();
                        C20637a m45565a = bottomSheetMenuResult.m45565a();
                        if (m45565a != null) {
                            C3000l0 m107540b = m45565a.m107540b();
                            if (m107540b != null) {
                                c3020p0 = m107540b.m14325c0(m45565a.m107542d());
                            }
                            int i11 = 0;
                            if (m45571g != 6) {
                                if (m45571g == 7) {
                                    if (m107540b != null) {
                                        i11 = m107540b.f11897r;
                                    }
                                    m79509lN(c3020p0, i11);
                                    return;
                                }
                                return;
                            }
                            if (m107540b != null) {
                                i11 = m107540b.f11897r;
                            }
                            m79508jN(c3020p0, i11);
                        }
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: nN */
    private final void m79511nN(String str) {
        String optString;
        if (str != null) {
            try {
                if (str.length() != 0 && (optString = new JSONObject(str).optString("feed_item")) != null && optString.length() != 0) {
                    C3020p0 m108752C0 = AbstractC20826v0.m108752C0(new JSONObject(optString), 16);
                    AbstractC19074t.m100207e(m108752C0, "parseFeedItem(...)");
                    C3000l0 c3000l0 = new C3000l0(m108752C0, 16);
                    Bundle bundle = new Bundle();
                    C20637a c20637a = new C20637a();
                    String str2 = m108752C0.f12057p;
                    AbstractC19074t.m100207e(str2, "fid");
                    c20637a.m107550n(str2);
                    c20637a.m107548l(c3000l0);
                    c20637a.m107552p(false);
                    BottomSheetMenuBundleData bottomSheetMenuBundleData = new BottomSheetMenuBundleData();
                    bottomSheetMenuBundleData.m45511l(1);
                    bottomSheetMenuBundleData.m45507h(c20637a);
                    bundle.putInt("EXTRA_BOTTOM_SHEET_TYPE", 6);
                    bundle.putParcelable("EXTRA_BUNDLE_DATA", bottomSheetMenuBundleData);
                    m92693xK().m93066i2(FrameLayoutKeepBtmSheetZaloView.class, bundle, 1001, 1, true);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: oN */
    public final void m79512oN(String str) {
        m79513pN(str, EnumC31036b.f143137p);
        m79513pN(str, EnumC31036b.f143138q);
    }

    /* renamed from: pN */
    private final void m79513pN(String str, EnumC31036b enumC31036b) {
        boolean m127128x;
        int i11;
        C3020p0 c3020p0;
        m127128x = AbstractC24341v.m127128x(str);
        if (m127128x) {
            return;
        }
        if (enumC31036b == EnumC31036b.f143138q) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        List m138527g = C26883g.Companion.m138535a(i11).m138527g(3);
        if (!m138527g.isEmpty()) {
            Iterator it = m138527g.iterator();
            while (it.hasNext()) {
                List<C3000l0> list = ((C2998k3) it.next()).f11845a;
                if (list != null) {
                    AbstractC19074t.m100205c(list);
                    for (C3000l0 c3000l0 : list) {
                        if (c3000l0 != null) {
                            c3020p0 = c3000l0.m14322a0();
                        } else {
                            c3020p0 = null;
                        }
                        if (c3020p0 != null && AbstractC19074t.m100204b(c3020p0.f12057p, str)) {
                            C3025q0.d dVar = new C3025q0.d();
                            dVar.f12174e = c3020p0.f12039S;
                            FeedActionZUtils.m47521I(c3020p0, dVar, 20);
                        }
                    }
                }
            }
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZinstantZaloView, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        AbstractC19074t.m100208f(view, "view");
        super.mo37125ZJ(view, bundle);
        ZaloZinstantLayout zaloZinstantLayout = this.f79722S0;
        if (zaloZinstantLayout != null) {
            zaloZinstantLayout.setInteractionTracker(new C14254c());
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZinstantZaloView
    /* renamed from: dN */
    public final void mo79514dN(AbstractC28207v1.j0 j0Var) {
        if (AbstractC19074t.m100204b(j0Var, this.f73255s1)) {
            super.mo79514dN(j0Var);
        } else {
            this.f73256t1 = j0Var;
        }
    }

    /* renamed from: kN */
    public final void m79515kN(C3020p0 c3020p0, boolean z11, int i11) {
        if (c3020p0 == null) {
            return;
        }
        mo46829Y();
        int m14515l = c3020p0.m14515l();
        long m14517m = c3020p0.m14517m();
        int m14513k = c3020p0.m14513k();
        C14253b c14253b = new C14253b(c3020p0);
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(c14253b);
        c0766k.mo1464Ja(m14515l, m14517m, z11 ? 1 : 0, m14517m, 0, m14513k);
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        if (i11 == 1001 && i12 == -1) {
            m79510mN(intent);
        } else {
            super.onActivityResult(i11, i12, intent);
        }
    }
}
