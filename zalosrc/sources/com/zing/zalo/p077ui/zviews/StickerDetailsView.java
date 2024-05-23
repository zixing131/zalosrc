package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import ae.C0766k;
import ae.InterfaceC0765j;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import android.widget.TextView;
import c30.C3245i;
import c30.C3249k;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.p077ui.widget.RobotoButton;
import com.zing.zalo.p077ui.zviews.StickerDetailsView;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import com.zing.zalo.p077ui.zviews.share.ShareView;
import com.zing.zalo.social.controls.C10866e;
import com.zing.zalo.social.controls.CustomMovementMethod;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.webview.ZWebView;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.actionbar.ActionBar;
import com.zing.zalo.zview.actionbar.ActionBarMenu;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import com.zing.zalocore.CoreUtility;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import java.util.ArrayList;
import me0.AbstractC23080g8;
import me0.AbstractC23136l9;
import me0.AbstractC23238v2;
import me0.C23055e5;
import me0.C23278z2;
import org.json.JSONObject;
import p348mi.AbstractC23309i;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import p693yu.InterfaceC31084b;

/* loaded from: classes6.dex */
public class StickerDetailsView extends SlidableZaloView implements ZaloView.InterfaceC17418c, InterfaceC0733x {

    /* renamed from: P0 */
    C3245i f77845P0;

    /* renamed from: Q0 */
    String f77846Q0;

    /* renamed from: R0 */
    RecyclingImageView f77847R0;

    /* renamed from: S0 */
    LinearLayout f77848S0;

    /* renamed from: T0 */
    TextView f77849T0;

    /* renamed from: U0 */
    TextView f77850U0;

    /* renamed from: V0 */
    TextView f77851V0;

    /* renamed from: W0 */
    TextView f77852W0;

    /* renamed from: X0 */
    RobotoButton f77853X0;

    /* renamed from: Y0 */
    ZWebView f77854Y0;

    /* renamed from: Z0 */
    TextView f77855Z0;

    /* renamed from: a1 */
    MultiStateView f77856a1;

    /* renamed from: b1 */
    C23528a f77857b1;

    /* renamed from: d1 */
    InterfaceC31084b.a f77859d1;

    /* renamed from: e1 */
    View f77860e1;

    /* renamed from: c1 */
    boolean f77858c1 = false;

    /* renamed from: f1 */
    private int f77861f1 = 0;

    /* renamed from: g1 */
    InterfaceC0765j f77862g1 = new C0766k();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.StickerDetailsView$a */
    /* loaded from: classes6.dex */
    public class C15087a implements InterfaceC31084b.a {
        C15087a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ void m84480e(boolean z11, String str) {
            StickerDetailsView.this.f77853X0.setEnabled(z11);
            StickerDetailsView.this.f77853X0.setText(str);
        }

        @Override // p693yu.InterfaceC31084b.a
        /* renamed from: a */
        public void mo62987a() {
            m84481f(false, AbstractC23136l9.m118743r0(AbstractC8020f0.browser_download_notification_download_in_progress).toUpperCase());
        }

        @Override // p693yu.InterfaceC31084b.a
        /* renamed from: b */
        public void mo62988b() {
            m84481f(false, AbstractC23136l9.m118743r0(AbstractC8020f0.str_stickercategory_exist).toUpperCase());
        }

        @Override // p693yu.InterfaceC31084b.a
        /* renamed from: c */
        public void mo62989c(C20096c c20096c) {
            m84481f(true, AbstractC23136l9.m118743r0(AbstractC8020f0.str_stickercategory_free).toUpperCase());
        }

        /* renamed from: f */
        void m84481f(final boolean z11, final String str) {
            if (StickerDetailsView.this.f72421L0.m92676n2() != null && StickerDetailsView.this.f72421L0.m92672lJ()) {
                StickerDetailsView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.wl0
                    @Override // java.lang.Runnable
                    public final void run() {
                        StickerDetailsView.C15087a.this.m84480e(z11, str);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.StickerDetailsView$b */
    /* loaded from: classes6.dex */
    public class C15088b extends WebViewClient {
        C15088b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m84483b() {
            try {
                StickerDetailsView stickerDetailsView = StickerDetailsView.this;
                if (!stickerDetailsView.f77858c1) {
                    stickerDetailsView.m84478qM();
                } else if (C23055e5.m118272g(true)) {
                    StickerDetailsView stickerDetailsView2 = StickerDetailsView.this;
                    stickerDetailsView2.m84472iM(stickerDetailsView2.f77845P0.f13854b);
                } else {
                    StickerDetailsView.this.m84477pM(AbstractC23136l9.m118743r0(AbstractC8020f0.NETWORK_ERROR_MSG), true);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            try {
                StickerDetailsView.this.f77856a1.setVisibility(8);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i11, String str, String str2) {
            int i12;
            boolean z11;
            if (webView != null) {
                try {
                    webView.setVisibility(8);
                } catch (Exception e11) {
                    e11.printStackTrace();
                    return;
                }
            }
            if (i11 == -2) {
                i12 = AbstractC8020f0.NETWORK_ERROR_MSG;
            } else {
                i12 = AbstractC8020f0.error_message;
            }
            String m118743r0 = AbstractC23136l9.m118743r0(i12);
            if (i11 == -2) {
                z11 = true;
            } else {
                z11 = false;
            }
            StickerDetailsView.this.m84477pM(m118743r0, z11);
            C3245i c3245i = StickerDetailsView.this.f77845P0;
            int i13 = c3245i.f13869q;
            if ((i13 == 2 || i13 == 4) && c3245i.f13860h.length() > 0) {
                StickerDetailsView.this.f77856a1.setOnTapToRetryListener(new MultiStateView.InterfaceC15916g() { // from class: com.zing.zalo.ui.zviews.xl0
                    @Override // com.zing.zalo.p077ui.zviews.multistate.MultiStateView.InterfaceC15916g
                    /* renamed from: a */
                    public final void mo12138a() {
                        StickerDetailsView.C15088b.this.m84483b();
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.StickerDetailsView$c */
    /* loaded from: classes6.dex */
    public class C15089c implements InterfaceC20094a {
        C15089c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m84487f() {
            int i11;
            try {
                StickerDetailsView stickerDetailsView = StickerDetailsView.this;
                stickerDetailsView.f77849T0.setText(stickerDetailsView.f77845P0.m16464f());
                if (StickerDetailsView.this.f77845P0.f13856d.length() > 0) {
                    StickerDetailsView.this.f77850U0.setVisibility(0);
                    StickerDetailsView stickerDetailsView2 = StickerDetailsView.this;
                    stickerDetailsView2.f77850U0.setText(stickerDetailsView2.f77845P0.f13856d);
                } else {
                    StickerDetailsView.this.f77850U0.setVisibility(8);
                }
                StickerDetailsView stickerDetailsView3 = StickerDetailsView.this;
                stickerDetailsView3.m84476oM(stickerDetailsView3.f77845P0, stickerDetailsView3.f77852W0);
                StickerDetailsView stickerDetailsView4 = StickerDetailsView.this;
                TextView textView = stickerDetailsView4.f77851V0;
                int i12 = AbstractC8020f0.str_StickerDetails_quantity;
                Object[] objArr = new Object[2];
                objArr[0] = Integer.valueOf(stickerDetailsView4.f77845P0.f13868p);
                if (StickerDetailsView.this.f77845P0.f13868p > 1) {
                    i11 = AbstractC8020f0.str_more_s;
                } else {
                    i11 = AbstractC8020f0.str_single_form;
                }
                objArr[1] = AbstractC23136l9.m118743r0(i11);
                textView.setText(AbstractC23136l9.m118746s0(i12, objArr));
                StickerDetailsView stickerDetailsView5 = StickerDetailsView.this;
                ((C23528a) stickerDetailsView5.f77857b1.m123612r(stickerDetailsView5.f77847R0)).m123618x(StickerDetailsView.this.f77845P0.f13859g, C23278z2.m120089P0());
                StickerDetailsView.this.m84478qM();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g */
        public /* synthetic */ void m84488g() {
            try {
                StickerDetailsView.this.f77848S0.setVisibility(4);
                StickerDetailsView.this.m84477pM(AbstractC23136l9.m118743r0(AbstractC8020f0.nearby_setting_empty_text), false);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: h */
        public /* synthetic */ void m84489h(C20096c c20096c) {
            int m104491c;
            int i11;
            boolean z11;
            if (c20096c == null) {
                m104491c = -1;
            } else {
                try {
                    m104491c = c20096c.m104491c();
                } catch (Exception e11) {
                    e11.printStackTrace();
                    return;
                }
            }
            StickerDetailsView.this.f77848S0.setVisibility(4);
            if (m104491c == 50001) {
                i11 = AbstractC8020f0.NETWORK_ERROR_MSG;
            } else {
                i11 = AbstractC8020f0.nearby_setting_empty_text;
            }
            String m118743r0 = AbstractC23136l9.m118743r0(i11);
            if (m104491c == 50001) {
                z11 = true;
            } else {
                z11 = false;
            }
            StickerDetailsView.this.m84477pM(m118743r0, z11);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(final C20096c c20096c) {
            if (StickerDetailsView.this.f72421L0.m92676n2() != null && StickerDetailsView.this.f72421L0.m92672lJ()) {
                StickerDetailsView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.yl0
                    @Override // java.lang.Runnable
                    public final void run() {
                        StickerDetailsView.C15089c.this.m84489h(c20096c);
                    }
                });
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            if (obj != null) {
                try {
                    JSONObject jSONObject = ((JSONObject) obj).getJSONObject("data").getJSONObject("cate");
                    if (jSONObject != null) {
                        StickerDetailsView.this.f77845P0 = new C3245i(jSONObject);
                    }
                    if (StickerDetailsView.this.f72421L0.m92676n2() != null && StickerDetailsView.this.f72421L0.m92672lJ()) {
                        StickerDetailsView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.zl0
                            @Override // java.lang.Runnable
                            public final void run() {
                                StickerDetailsView.C15089c.this.m84487f();
                            }
                        });
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                    if (StickerDetailsView.this.f72421L0.m92676n2() != null && StickerDetailsView.this.f72421L0.m92672lJ()) {
                        StickerDetailsView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.am0
                            @Override // java.lang.Runnable
                            public final void run() {
                                StickerDetailsView.C15089c.this.m84488g();
                            }
                        });
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: mM */
    public /* synthetic */ void m84470mM(View view) {
        try {
            if (C23055e5.m118272g(true)) {
                AbstractC23647d.m123907q("1340", "");
                int i11 = this.f77845P0.f13869q;
                if (i11 == 4 || i11 == 2) {
                    if (!AbstractC23238v2.m119727l()) {
                        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.error_sdcard));
                    } else if (!AbstractC23238v2.m119726k()) {
                        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.error_full_sdcard));
                    } else {
                        this.f72421L0.removeDialog(0);
                        this.f72421L0.showDialog(0);
                    }
                }
                AbstractC23647d.m123893c();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nM */
    public /* synthetic */ void m84471nM() {
        try {
            if (!this.f77858c1) {
                m84478qM();
            } else if (C23055e5.m118271f()) {
                m84472iM(this.f77845P0.f13854b);
            } else {
                m84477pM(AbstractC23136l9.m118743r0(AbstractC8020f0.NETWORK_ERROR_MSG), true);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        if (i11 != 0) {
            return null;
        }
        C3249k.a aVar = new C3249k.a(this.f72421L0.m92648SI(), this.f77861f1);
        aVar.m16503d(this.f77845P0);
        aVar.m16502c(this.f77859d1);
        if (this.f77846Q0.length() > 0) {
            aVar.m16501b(this.f77846Q0);
        }
        C3249k m16500a = aVar.m16500a();
        m16500a.m92873y(true);
        m16500a.m92874z(false);
        return m16500a;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: FJ */
    public void mo37482FJ(ActionBarMenu actionBarMenu) {
        C3245i c3245i = this.f77845P0;
        if (c3245i != null && !TextUtils.isEmpty(c3245i.m16464f()) && !TextUtils.isEmpty(this.f77845P0.f13859g)) {
            C3245i c3245i2 = this.f77845P0;
            if (c3245i2 != null && !c3245i2.m16460b()) {
                return;
            }
            actionBarMenu.m92750r();
            ((TextView) actionBarMenu.m92744k(0, AbstractC7409c0.action_bar_menu_item_white_text_only)).setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_menu_item_share));
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        m92637BK(true);
        this.f77860e1 = layoutInflater.inflate(AbstractC7409c0.sticker_details_view, (ViewGroup) null);
        m84475lM();
        m92637BK(true);
        m84474kM();
        return this.f77860e1;
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: IJ */
    public void mo39024IJ() {
        super.mo39024IJ();
        try {
            C23528a c23528a = this.f77857b1;
            if (c23528a != null) {
                c23528a.m123599d();
                this.f77857b1 = null;
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: QJ */
    public boolean mo37491QJ(int i11) {
        if (super.mo37491QJ(i11)) {
            return true;
        }
        if (i11 != 0) {
            if (i11 != 16908332) {
                return false;
            }
            this.f72421L0.finish();
            return true;
        }
        C3245i c3245i = this.f77845P0;
        if (c3245i != null && !TextUtils.isEmpty(c3245i.m16464f()) && !TextUtils.isEmpty(this.f77845P0.f13859g)) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("bol_share_in_app", true);
            bundle.putString("contentNeedToShare", this.f77845P0.m16461c());
            this.f72421L0.m92662fJ().m93069k2(ShareView.class, bundle, 0, true);
        }
        return true;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        ZWebView zWebView = this.f77854Y0;
        if (zWebView != null) {
            zWebView.onPause();
        }
        super.mo13886RJ();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: TJ */
    public void mo37493TJ() {
        super.mo37493TJ();
        try {
            ActionBar actionBar = this.f88760a0;
            if (actionBar != null) {
                actionBar.setTitle(AbstractC23136l9.m118743r0(AbstractC8020f0.str_title_bar_StickerDetails_act));
                this.f88760a0.setBackButtonImage(AbstractC16803z.stencils_ic_head_back_white);
                this.f88760a0.setBackgroundResource(AbstractC16803z.stencil_bg_action_bar);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: XJ */
    public void mo37122XJ(boolean z11, boolean z12) {
        super.mo37122XJ(z11, z12);
        if (z11 && !z12) {
            if (C23055e5.m118271f()) {
                m84472iM(this.f77845P0.f13854b);
            } else {
                m84477pM(AbstractC23136l9.m118743r0(AbstractC8020f0.NETWORK_ERROR_MSG), true);
            }
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "StickerDetailsView";
    }

    /* renamed from: iM */
    void m84472iM(int i11) {
        this.f77856a1.setVisibility(0);
        this.f77856a1.setState(MultiStateView.EnumC15914e.LOADING);
        this.f77862g1.mo1704o8(new C15089c());
        if (this.f77845P0 != null) {
            this.f77862g1.mo1407Ca(i11);
        }
    }

    /* renamed from: jM */
    void m84473jM() {
        ZWebView zWebView = this.f77854Y0;
        if (zWebView != null) {
            zWebView.stopLoading();
        }
        this.f72421L0.finish();
    }

    /* renamed from: kM */
    void m84474kM() {
        int i11;
        int i12;
        int i13;
        int i14;
        String str;
        String str2;
        String str3;
        String str4;
        int i15;
        int i16;
        int i17;
        int i18;
        long j11;
        int i19;
        try {
            int m118401f = AbstractC23080g8.m118401f(this.f72421L0.m92648SI());
            Bundle m92642L3 = this.f72421L0.m92642L3();
            if (m92642L3 != null) {
                if (m92642L3.containsKey("sid")) {
                    this.f77858c1 = true;
                    C3245i c3245i = new C3245i();
                    this.f77845P0 = c3245i;
                    c3245i.f13854b = m92642L3.getInt("sid");
                    C3245i c3245i2 = this.f77845P0;
                    if (m92642L3.containsKey("permission")) {
                        i19 = m92642L3.getInt("permission");
                    } else {
                        i19 = 1;
                    }
                    c3245i2.f13873u = i19;
                    this.f77846Q0 = C3245i.m16458h(this.f77845P0.f13854b, m118401f);
                } else {
                    this.f77858c1 = false;
                    C3245i c3245i3 = new C3245i();
                    this.f77845P0 = c3245i3;
                    if (m92642L3.containsKey("id")) {
                        i11 = m92642L3.getInt("id");
                    } else {
                        i11 = 0;
                    }
                    c3245i3.f13854b = i11;
                    C3245i c3245i4 = this.f77845P0;
                    if (m92642L3.containsKey("permission")) {
                        i12 = m92642L3.getInt("permission");
                    } else {
                        i12 = 1;
                    }
                    c3245i4.f13873u = i12;
                    C3245i c3245i5 = this.f77845P0;
                    if (m92642L3.containsKey("is_hidden")) {
                        i13 = m92642L3.getInt("is_hidden");
                    } else {
                        i13 = 0;
                    }
                    c3245i5.f13866n = i13;
                    if (m92642L3.containsKey("name")) {
                        this.f77845P0.m16468k(m92642L3.getString("name"));
                        this.f77849T0.setText(this.f77845P0.m16464f());
                    }
                    if (m92642L3.containsKey("desc")) {
                        this.f77845P0.f13856d = m92642L3.getString("desc");
                        if (!TextUtils.isEmpty(this.f77845P0.f13856d)) {
                            this.f77850U0.setVisibility(0);
                            this.f77850U0.setText(this.f77845P0.f13856d);
                        } else {
                            this.f77850U0.setVisibility(8);
                        }
                    }
                    C3245i c3245i6 = this.f77845P0;
                    if (m92642L3.containsKey("isFree")) {
                        i14 = m92642L3.getInt("isFree");
                    } else {
                        i14 = 0;
                    }
                    c3245i6.f13857e = i14;
                    C3245i c3245i7 = this.f77845P0;
                    if (!m92642L3.containsKey("iconUrl")) {
                        str = "";
                    } else {
                        str = m92642L3.getString("iconUrl");
                    }
                    c3245i7.f13858f = str;
                    if (m92642L3.containsKey("iconPreview")) {
                        this.f77845P0.f13859g = m92642L3.getString("iconPreview");
                        ((C23528a) this.f77857b1.m123612r(this.f77847R0)).m123618x(this.f77845P0.f13859g, C23278z2.m120089P0());
                    }
                    C3245i c3245i8 = this.f77845P0;
                    if (!m92642L3.containsKey("thumbUrl")) {
                        str2 = "";
                    } else {
                        str2 = m92642L3.getString("thumbUrl");
                    }
                    c3245i8.f13860h = str2;
                    C3245i c3245i9 = this.f77845P0;
                    if (!m92642L3.containsKey("sourceUrl")) {
                        str3 = "";
                    } else {
                        str3 = m92642L3.getString("sourceUrl");
                    }
                    c3245i9.f13867o = str3;
                    C3245i c3245i10 = this.f77845P0;
                    if (!m92642L3.containsKey("source")) {
                        str4 = "";
                    } else {
                        str4 = m92642L3.getString("source");
                    }
                    c3245i10.f13861i = str4;
                    m84476oM(this.f77845P0, this.f77852W0);
                    C3245i c3245i11 = this.f77845P0;
                    if (m92642L3.containsKey("totalImage")) {
                        i15 = m92642L3.getInt("totalImage");
                    } else {
                        i15 = 0;
                    }
                    c3245i11.f13868p = i15;
                    TextView textView = this.f77851V0;
                    int i21 = AbstractC8020f0.str_StickerDetails_quantity;
                    Object[] objArr = new Object[2];
                    objArr[0] = Integer.valueOf(this.f77845P0.f13868p);
                    if (this.f77845P0.f13868p > 1) {
                        i16 = AbstractC8020f0.str_more_s;
                    } else {
                        i16 = AbstractC8020f0.str_single_form;
                    }
                    objArr[1] = AbstractC23136l9.m118743r0(i16);
                    textView.setText(AbstractC23136l9.m118746s0(i21, objArr));
                    C3245i c3245i12 = this.f77845P0;
                    if (m92642L3.containsKey("group")) {
                        i17 = m92642L3.getInt("group");
                    } else {
                        i17 = 0;
                    }
                    c3245i12.f13869q = i17;
                    C3245i c3245i13 = this.f77845P0;
                    if (m92642L3.containsKey("version")) {
                        i18 = m92642L3.getInt("version");
                    } else {
                        i18 = 0;
                    }
                    c3245i13.f13871s = i18;
                    C3245i c3245i14 = this.f77845P0;
                    if (m92642L3.containsKey("expireTime")) {
                        j11 = m92642L3.getLong("expireTime");
                    } else {
                        j11 = 0;
                    }
                    c3245i14.f13862j = j11;
                    this.f77846Q0 = C3245i.m16458h(this.f77845P0.f13854b, m118401f);
                    m84478qM();
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - AbstractC23309i.m122046j7() > 21600000) {
                    this.f77854Y0.clearCache(true);
                    AbstractC23309i.m121023Hr(currentTimeMillis);
                }
                String string = m92642L3.getString("extra_param_info", "");
                if (!string.isEmpty()) {
                    this.f77861f1 = new JSONObject(string).optInt("open_source", 0);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: lM */
    void m84475lM() {
        this.f77857b1 = new C23528a(this.f72421L0.m92648SI());
        this.f77847R0 = (RecyclingImageView) this.f77860e1.findViewById(AbstractC6918a0.imvAvatar);
        RobotoButton robotoButton = (RobotoButton) this.f77860e1.findViewById(AbstractC6918a0.btn_Download);
        this.f77853X0 = robotoButton;
        robotoButton.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.ul0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StickerDetailsView.this.m84470mM(view);
            }
        });
        this.f77859d1 = new C15087a();
        LinearLayout linearLayout = (LinearLayout) this.f77860e1.findViewById(AbstractC6918a0.layoutDownload);
        this.f77848S0 = linearLayout;
        linearLayout.setVisibility(4);
        this.f77849T0 = (TextView) this.f77860e1.findViewById(AbstractC6918a0.tvCateName);
        this.f77851V0 = (TextView) this.f77860e1.findViewById(AbstractC6918a0.tvCateQuantity);
        this.f77850U0 = (TextView) this.f77860e1.findViewById(AbstractC6918a0.tvCateDesc);
        this.f77852W0 = (TextView) this.f77860e1.findViewById(AbstractC6918a0.tvCateSource);
        this.f77855Z0 = (TextView) this.f77860e1.findViewById(AbstractC6918a0.tv_sticker_hidden);
        MultiStateView multiStateView = (MultiStateView) this.f77860e1.findViewById(AbstractC6918a0.multi_state);
        this.f77856a1 = multiStateView;
        multiStateView.setOnTapToRetryListener(new MultiStateView.InterfaceC15916g() { // from class: com.zing.zalo.ui.zviews.vl0
            @Override // com.zing.zalo.p077ui.zviews.multistate.MultiStateView.InterfaceC15916g
            /* renamed from: a */
            public final void mo12138a() {
                StickerDetailsView.this.m84471nM();
            }
        });
        ZWebView zWebView = (ZWebView) this.f77860e1.findViewById(AbstractC6918a0.webview);
        this.f77854Y0 = zWebView;
        zWebView.setScrollBarStyle(0);
        this.f77854Y0.setBackgroundColor(0);
        this.f77854Y0.getSettings().setJavaScriptEnabled(true);
        this.f77854Y0.setWebViewClient(new C15088b());
    }

    /* renamed from: oM */
    void m84476oM(C3245i c3245i, TextView textView) {
        if (c3245i != null && textView != null) {
            try {
                String str = c3245i.f13861i;
                if (str != null && str.length() > 0) {
                    textView.setVisibility(0);
                    String str2 = c3245i.f13867o;
                    if (str2 != null && str2.length() > 0) {
                        Spanned fromHtml = Html.fromHtml(AbstractC23136l9.m118743r0(AbstractC8020f0.str_StickerDetails_source) + " <a href=\"" + c3245i.f13867o + "\">" + c3245i.f13861i + "</a>");
                        SpannableString spannableString = new SpannableString(fromHtml.toString());
                        Object[] spans = fromHtml.getSpans(0, fromHtml.length(), Object.class);
                        if (spans.length > 0) {
                            for (Object obj : spans) {
                                int spanStart = fromHtml.getSpanStart(obj);
                                int spanEnd = fromHtml.getSpanEnd(obj);
                                int spanFlags = fromHtml.getSpanFlags(obj);
                                if (obj instanceof URLSpan) {
                                    C10866e c10866e = new C10866e(((URLSpan) obj).getURL(), spanStart, spanEnd);
                                    c10866e.f54832J = 257;
                                    c10866e.m56365I(this.f72421L0.m92676n2());
                                    spannableString.setSpan(c10866e, spanStart, spanEnd, spanFlags);
                                }
                            }
                            textView.setMovementMethod(CustomMovementMethod.m56305e());
                            textView.setText(spannableString);
                            return;
                        }
                        textView.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_StickerDetails_source) + " " + c3245i.f13861i);
                        return;
                    }
                    textView.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_StickerDetails_source) + " " + c3245i.f13861i);
                    return;
                }
                textView.setVisibility(8);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (super.onKeyUp(i11, keyEvent)) {
            return true;
        }
        if (i11 == 4) {
            m84473jM();
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        ZWebView zWebView = this.f77854Y0;
        if (zWebView != null) {
            zWebView.onResume();
        }
    }

    /* renamed from: pM */
    void m84477pM(String str, boolean z11) {
        MultiStateView.EnumC15915f enumC15915f;
        try {
            this.f77856a1.setVisibility(0);
            this.f77856a1.setErrorTitleString(str);
            this.f77856a1.setState(MultiStateView.EnumC15914e.ERROR);
            MultiStateView multiStateView = this.f77856a1;
            if (z11) {
                enumC15915f = MultiStateView.EnumC15915f.NETWORK_ERROR;
            } else {
                enumC15915f = MultiStateView.EnumC15915f.UNKNOWN_ERROR;
            }
            multiStateView.setErrorType(enumC15915f);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: qM */
    void m84478qM() {
        try {
            this.f77856a1.setVisibility(8);
            this.f77848S0.setVisibility(0);
            C3245i c3245i = this.f77845P0;
            int i11 = c3245i.f13869q;
            if ((i11 == 2 || i11 == 4) && c3245i.f13860h.length() > 0) {
                this.f77854Y0.setVisibility(0);
                this.f77854Y0.loadUrl(this.f77845P0.f13860h);
            }
            C3245i c3245i2 = this.f77845P0;
            if (c3245i2 != null && c3245i2.m16459a()) {
                ArrayList m42242Q6 = C7960e.m41971c6().m42242Q6(CoreUtility.f89233i, this.f77845P0.f13854b + "");
                if (m42242Q6.size() > 0) {
                    C3245i c3245i3 = (C3245i) m42242Q6.get(0);
                    int i12 = this.f77845P0.f13871s;
                    int i13 = c3245i3.f13871s;
                    if (i12 > i13) {
                        this.f77853X0.setEnabled(true);
                        this.f77853X0.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.update).toUpperCase());
                    } else if (i12 == i13) {
                        this.f77853X0.setEnabled(false);
                        this.f77853X0.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_stickercategory_exist).toUpperCase());
                    }
                } else {
                    this.f77853X0.setEnabled(true);
                    this.f77853X0.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_stickercategory_free).toUpperCase());
                }
            } else {
                this.f77853X0.setVisibility(8);
            }
            C3245i c3245i4 = this.f77845P0;
            if (c3245i4 != null) {
                if (!c3245i4.m16460b()) {
                    this.f77855Z0.setVisibility(0);
                } else {
                    this.f77855Z0.setVisibility(8);
                }
            }
            this.f72421L0.invalidateOptionsMenu();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
