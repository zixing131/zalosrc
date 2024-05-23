package com.zing.zalo.p077ui.zviews;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.widget.mini.program.MPContainerView;
import com.zing.zalo.p077ui.zviews.MiniAppQRView;
import com.zing.zalo.uicomponents.framelayout.DragToCloseLayout;
import com.zing.zalo.zdesign.component.TrackingFrameLayout;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.Random;
import me0.AbstractC23034c6;
import me0.AbstractC23136l9;
import org.json.JSONObject;
import p189gv.C19609h;
import p307kv.AbstractC21954k;
import p649xl.C29782e8;
import pm0.C24848g0;
import vg.AbstractC28207v1;

/* loaded from: classes6.dex */
public final class MiniAppQRNewView extends MiniAppPopupView implements MiniAppQRView.InterfaceC14608a {
    public static final C14605a Companion = new C14605a(null);

    /* renamed from: R0 */
    private C29782e8 f75122R0;

    /* renamed from: S0 */
    private C19609h f75123S0;

    /* renamed from: T0 */
    private C15976ob f75124T0;

    /* renamed from: com.zing.zalo.ui.zviews.MiniAppQRNewView$a */
    /* loaded from: classes6.dex */
    public static final class C14605a {
        private C14605a() {
        }

        public /* synthetic */ C14605a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.MiniAppQRNewView$b */
    /* loaded from: classes6.dex */
    static final class C14606b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: r */
        final /* synthetic */ String f75126r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C14606b(String str) {
            super(0);
            this.f75126r = str;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m81744a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m81744a() {
            MiniAppQRNewView.this.f75124T0 = new C15976ob(this.f75126r, null, "action.save.image.gallery", AbstractC23136l9.m118743r0(AbstractC8020f0.str_mini_app_qr_saved), 2, null);
            MiniAppQRNewView.this.m81740uM();
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.MiniAppQRNewView$c */
    /* loaded from: classes6.dex */
    static final class C14607c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: r */
        final /* synthetic */ String f75128r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C14607c(String str) {
            super(0);
            this.f75128r = str;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m81745a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m81745a() {
            MiniAppQRNewView.this.f75124T0 = new C15976ob(this.f75128r, Integer.valueOf(new Random().nextInt()), null, null, 12, null);
            MiniAppQRNewView.this.m81740uM();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: uM */
    public final void m81740uM() {
        if (AbstractC23034c6.m118121G()) {
            C15976ob c15976ob = this.f75124T0;
            if (c15976ob != null) {
                m81742wM(this, c15976ob.m87388d(), null, c15976ob.m87385a(), c15976ob.m87387c(), c15976ob.m87386b(), 2, null);
            }
            this.f75124T0 = null;
            return;
        }
        AbstractC23034c6.m118184v0(this, AbstractC23034c6.f112029f, 109);
    }

    /* renamed from: vM */
    private final void m81741vM(String str, String str2, String str3, String str4, Integer num) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(ZMediaPlayer.OnNativeInvokeListener.ARG_URL, str);
        if (str2 != null) {
            jSONObject.put("contentDisposition", str2);
        }
        if (str4 != null) {
            jSONObject.put("successMsg", str4);
        }
        if (num != null) {
            jSONObject.put("iDownloadForShareId", num.intValue());
        }
        m81743xM(str3, jSONObject.toString());
    }

    /* renamed from: wM */
    static /* synthetic */ void m81742wM(MiniAppQRNewView miniAppQRNewView, String str, String str2, String str3, String str4, Integer num, int i11, Object obj) {
        String str5;
        String str6;
        Integer num2;
        if ((i11 & 2) != 0) {
            str5 = null;
        } else {
            str5 = str2;
        }
        if ((i11 & 4) != 0) {
            str3 = "action.webview.save.file";
        }
        String str7 = str3;
        if ((i11 & 8) != 0) {
            str6 = null;
        } else {
            str6 = str4;
        }
        if ((i11 & 16) != 0) {
            num2 = null;
        } else {
            num2 = num;
        }
        miniAppQRNewView.m81741vM(str, str5, str7, str6, num2);
    }

    /* renamed from: xM */
    private final void m81743xM(String str, String str2) {
        AbstractC28207v1.m141989h3(str, 2, m92676n2(), this, str2, null, null, null, null);
    }

    @Override // com.zing.zalo.p077ui.zviews.MiniAppPopupView, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        C19609h c19609h;
        AbstractC19074t.m100208f(view, "view");
        super.mo37125ZJ(view, bundle);
        Bundle m92642L3 = m92642L3();
        C29782e8 c29782e8 = null;
        if (m92642L3 != null) {
            c19609h = (C19609h) AbstractC21954k.Companion.m114622q(m92642L3, "MINI_APP_INFO", C19609h.class);
        } else {
            c19609h = null;
        }
        this.f75123S0 = c19609h;
        if (c19609h != null) {
            C29782e8 c29782e82 = this.f75122R0;
            if (c29782e82 == null) {
                AbstractC19074t.m100223u("vb");
                c29782e82 = null;
            }
            c29782e82.f137670t.m81753f(c19609h);
        }
        C29782e8 c29782e83 = this.f75122R0;
        if (c29782e83 == null) {
            AbstractC19074t.m100223u("vb");
        } else {
            c29782e8 = c29782e83;
        }
        c29782e8.f137670t.setMiniAppQRListener(this);
    }

    @Override // com.zing.zalo.p077ui.zviews.MiniAppQRView.InterfaceC14608a
    /* renamed from: g0 */
    public void mo81683g0(String str) {
        AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        MiniAppPopupView.m81730mM(this, false, false, new C14607c(str), 3, null);
    }

    @Override // com.zing.zalo.p077ui.zviews.MiniAppPopupView
    /* renamed from: kM */
    public View mo81267kM(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C29782e8 m147898a = C29782e8.m147898a(layoutInflater.inflate(AbstractC7409c0.mini_app_qr_new_view, viewGroup, false));
        AbstractC19074t.m100207e(m147898a, "bind(...)");
        this.f75122R0 = m147898a;
        C29782e8 c29782e8 = null;
        if (m147898a == null) {
            AbstractC19074t.m100223u("vb");
            m147898a = null;
        }
        MPContainerView mPContainerView = m147898a.f137671u;
        AbstractC19074t.m100207e(mPContainerView, "viewGroup");
        MPContainerView.m76421c(mPContainerView, 0, 1, null);
        C29782e8 c29782e82 = this.f75122R0;
        if (c29782e82 == null) {
            AbstractC19074t.m100223u("vb");
            c29782e82 = null;
        }
        c29782e82.f137668r.setDisableTouch(false);
        C29782e8 c29782e83 = this.f75122R0;
        if (c29782e83 == null) {
            AbstractC19074t.m100223u("vb");
            c29782e83 = null;
        }
        c29782e83.f137668r.setDirection(1);
        C29782e8 c29782e84 = this.f75122R0;
        if (c29782e84 == null) {
            AbstractC19074t.m100223u("vb");
        } else {
            c29782e8 = c29782e84;
        }
        TrackingFrameLayout root = c29782e8.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    @Override // com.zing.zalo.p077ui.zviews.MiniAppPopupView
    /* renamed from: nM */
    public View mo81268nM() {
        C29782e8 c29782e8 = this.f75122R0;
        if (c29782e8 == null) {
            AbstractC19074t.m100223u("vb");
            c29782e8 = null;
        }
        View view = c29782e8.f137667q;
        AbstractC19074t.m100207e(view, "backgroundView");
        return view;
    }

    @Override // com.zing.zalo.p077ui.zviews.MiniAppPopupView
    /* renamed from: oM */
    public View mo81269oM() {
        C29782e8 c29782e8 = this.f75122R0;
        if (c29782e8 == null) {
            AbstractC19074t.m100223u("vb");
            c29782e8 = null;
        }
        DragToCloseLayout dragToCloseLayout = c29782e8.f137668r;
        AbstractC19074t.m100207e(dragToCloseLayout, "dragToCloseQrLayout");
        return dragToCloseLayout;
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onRequestPermissionsResult(int i11, String[] strArr, int[] iArr) {
        C15976ob c15976ob;
        AbstractC19074t.m100208f(strArr, "permissions");
        AbstractC19074t.m100208f(iArr, "grantResults");
        if (i11 == 109) {
            if (AbstractC23034c6.m118121G() && (c15976ob = this.f75124T0) != null && c15976ob != null) {
                m81742wM(this, c15976ob.m87388d(), null, c15976ob.m87385a(), c15976ob.m87387c(), c15976ob.m87386b(), 2, null);
            }
            this.f75124T0 = null;
            return;
        }
        super.onRequestPermissionsResult(i11, strArr, iArr);
    }

    @Override // com.zing.zalo.p077ui.zviews.MiniAppPopupView
    /* renamed from: qM */
    public void mo81270qM(boolean z11) {
    }

    @Override // com.zing.zalo.p077ui.zviews.MiniAppQRView.InterfaceC14608a
    /* renamed from: r3 */
    public void mo81684r3(String str) {
        AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        MiniAppPopupView.m81730mM(this, false, false, new C14606b(str), 3, null);
    }

    @Override // com.zing.zalo.p077ui.zviews.MiniAppQRView.InterfaceC14608a
    /* renamed from: zC */
    public void mo81685zC() {
        MiniAppPopupView.m81730mM(this, false, false, null, 7, null);
    }
}
