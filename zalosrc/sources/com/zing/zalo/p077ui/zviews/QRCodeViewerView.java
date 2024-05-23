package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import ae.C0766k;
import ag0.AbstractC0837p0;
import am.C0943w;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.provider.MediaStore;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import au.AbstractC2364o0;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.biometric.AbstractC7356u0;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p077ui.settings.subsettings.SettingManageSourceFriendView;
import com.zing.zalo.p077ui.zviews.QRCodeViewerView;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import com.zing.zalo.p077ui.zviews.share.ShareView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zview.actionbar.ActionBarMenu;
import com.zing.zalo.zview.actionbar.ActionBarMenuItem;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import hu.AbstractC20130d;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import me0.AbstractC23034c6;
import me0.AbstractC23136l9;
import me0.AbstractC23152n3;
import me0.AbstractC23238v2;
import me0.AbstractC23280z4;
import me0.C23278z2;
import mm0.AbstractC23350e;
import mm0.AbstractC23352g;
import org.json.JSONObject;
import p306ku.AbstractC21943a;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;
import p354n3.C23528a;
import p379o3.C23994e;
import p379o3.C23995f;
import p379o3.C23999j;
import p471r3.EnumC25629a;
import p542ub.InterfaceC27218a;
import sy.AbstractC26412d;

/* loaded from: classes6.dex */
public class QRCodeViewerView extends SlidableZaloView implements View.OnClickListener, InterfaceC0733x {

    /* renamed from: q1 */
    static final String f76508q1 = "QRCodeViewerView";

    /* renamed from: P0 */
    C23528a f76509P0;

    /* renamed from: Q0 */
    String f76510Q0;

    /* renamed from: R0 */
    String f76511R0;

    /* renamed from: S0 */
    RecyclingImageView f76512S0;

    /* renamed from: T0 */
    View f76513T0;

    /* renamed from: U0 */
    View f76514U0;

    /* renamed from: V0 */
    View f76515V0;

    /* renamed from: W0 */
    View f76516W0;

    /* renamed from: X0 */
    View f76517X0;

    /* renamed from: Y0 */
    MultiStateView f76518Y0;

    /* renamed from: b1 */
    View f76521b1;

    /* renamed from: c1 */
    C8009j f76522c1;

    /* renamed from: d1 */
    TextView f76523d1;

    /* renamed from: e1 */
    TextView f76524e1;

    /* renamed from: g1 */
    String f76526g1;

    /* renamed from: h1 */
    ActionBarMenuItem f76527h1;

    /* renamed from: i1 */
    boolean f76528i1;

    /* renamed from: Z0 */
    volatile boolean f76519Z0 = false;

    /* renamed from: a1 */
    boolean f76520a1 = false;

    /* renamed from: f1 */
    String f76525f1 = "";

    /* renamed from: j1 */
    boolean f76529j1 = true;

    /* renamed from: k1 */
    String f76530k1 = "";

    /* renamed from: l1 */
    EnumC14816e f76531l1 = EnumC14816e.VIP_CODE;

    /* renamed from: m1 */
    int f76532m1 = 0;

    /* renamed from: n1 */
    protected LayoutInflater f76533n1 = null;

    /* renamed from: o1 */
    boolean f76534o1 = false;

    /* renamed from: p1 */
    File f76535p1 = null;

    /* renamed from: com.zing.zalo.ui.zviews.QRCodeViewerView$a */
    /* loaded from: classes6.dex */
    public class C14812a extends C23994e {

        /* renamed from: v0 */
        final /* synthetic */ int f76536v0;

        C14812a(int i11) {
            this.f76536v0 = i11;
        }

        @Override // p379o3.AbstractRunnableC23992c
        /* renamed from: B1 */
        public void mo1932C(String str, File file, C23995f c23995f) {
            if (file != null) {
                try {
                    if (file.exists() && c23995f.m125657h() == 200) {
                        String absolutePath = file.getAbsolutePath();
                        int i11 = this.f76536v0;
                        if (i11 == 0) {
                            Bundle bundle = new Bundle();
                            bundle.putString("imagePathUri", absolutePath);
                            bundle.putBoolean("bol_share_in_app", true);
                            bundle.putBoolean("btn_extra_show_hide_post_feed", true);
                            QRCodeViewerView.this.f72421L0.m92662fJ().m93069k2(ShareView.class, bundle, 1, true);
                        } else if (i11 == 1) {
                            Bundle bundle2 = new Bundle();
                            ArrayList<String> arrayList = new ArrayList<>();
                            arrayList.add(absolutePath);
                            bundle2.putStringArrayList("path", arrayList);
                            bundle2.putBoolean("fromShareVia", true);
                            QRCodeViewerView.this.f72421L0.m92662fJ().m93069k2(UpdateStatusView.class, bundle2, 1, true);
                        } else {
                            AbstractC23152n3.m119011N0(QRCodeViewerView.this.f72421L0.m92676n2(), absolutePath, true, false, -1);
                        }
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                    return;
                }
            }
            ToastUtils.m89266n(AbstractC8020f0.unknown_error, new Object[0]);
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.QRCodeViewerView$b */
    /* loaded from: classes6.dex */
    public class C14813b implements InterfaceC20094a {
        C14813b() {
        }

        /* renamed from: d */
        public /* synthetic */ void m83131d(C20096c c20096c) {
            String m104492d;
            MultiStateView.EnumC15915f enumC15915f;
            QRCodeViewerView qRCodeViewerView = QRCodeViewerView.this;
            if (c20096c.m104491c() == 50001) {
                m104492d = AbstractC23136l9.m118743r0(AbstractC8020f0.NETWORK_ERROR_MSG);
            } else {
                m104492d = c20096c.m104492d();
            }
            qRCodeViewerView.m83111xM(m104492d);
            MultiStateView multiStateView = QRCodeViewerView.this.f76518Y0;
            if (multiStateView != null) {
                multiStateView.setState(MultiStateView.EnumC15914e.ERROR);
                MultiStateView multiStateView2 = QRCodeViewerView.this.f76518Y0;
                if (c20096c.m104491c() == 50001) {
                    enumC15915f = MultiStateView.EnumC15915f.NETWORK_ERROR;
                } else {
                    enumC15915f = MultiStateView.EnumC15915f.UNKNOWN_ERROR;
                }
                multiStateView2.setErrorType(enumC15915f);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            String str = QRCodeViewerView.f76508q1;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("refeshBarcode error:");
            sb2.append(c20096c);
            QRCodeViewerView.this.m83118FM(false);
            QRCodeViewerView.this.f76511R0 = AbstractC23309i.m120969Ga();
            QRCodeViewerView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.n80

                /* renamed from: q */
                public final /* synthetic */ C20096c f81329q;

                public /* synthetic */ n80(C20096c c20096c2) {
                    r2 = c20096c2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    QRCodeViewerView.C14813b.this.m83131d(r2);
                }
            });
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            String str = QRCodeViewerView.f76508q1;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("refeshBarcode Success:");
            sb2.append(obj);
            try {
                JSONObject jSONObject = (JSONObject) obj;
                if (jSONObject.has("data")) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                    if (jSONObject2.has("qrImgLink")) {
                        QRCodeViewerView.this.f76510Q0 = jSONObject2.getString("qrImgLink");
                    }
                    if (jSONObject2.has("avt")) {
                        QRCodeViewerView.this.f76511R0 = jSONObject2.getString("avt");
                    }
                }
                QRCodeViewerView qRCodeViewerView = QRCodeViewerView.this;
                AbstractC23309i.m120768Av(qRCodeViewerView.f76510Q0, qRCodeViewerView.f76511R0);
                QRCodeViewerView qRCodeViewerView2 = QRCodeViewerView.this;
                qRCodeViewerView2.f76509P0.m123589M(qRCodeViewerView2.f76510Q0);
                String str2 = QRCodeViewerView.this.f76510Q0;
                EnumC25629a enumC25629a = EnumC25629a.DEFAULT;
                if (C23999j.m125694K2(str2, 400, 0, enumC25629a)) {
                    C23999j.m125710U1(QRCodeViewerView.this.f76510Q0, 400, enumC25629a);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
                QRCodeViewerView.this.f76511R0 = AbstractC23309i.m120969Ga();
            }
            QRCodeViewerView.this.m83116DM("");
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.QRCodeViewerView$c */
    /* loaded from: classes6.dex */
    public class C14814c implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ boolean f76539a;

        C14814c(boolean z11) {
            this.f76539a = z11;
        }

        /* renamed from: e */
        public /* synthetic */ void m83134e() {
            QRCodeViewerView.this.m83115CM();
        }

        /* renamed from: f */
        public /* synthetic */ void m83135f(C20096c c20096c, boolean z11) {
            MultiStateView.EnumC15915f enumC15915f;
            if (c20096c.m104491c() == 1001) {
                QRCodeViewerView qRCodeViewerView = QRCodeViewerView.this;
                if (qRCodeViewerView.f76531l1 == EnumC14816e.MY_QRCODE && !z11) {
                    qRCodeViewerView.f76510Q0 = null;
                    AbstractC23309i.m122667zv(null);
                    MultiStateView multiStateView = QRCodeViewerView.this.f76518Y0;
                    if (multiStateView != null) {
                        multiStateView.setVisibility(0);
                        QRCodeViewerView.this.f76518Y0.setState(MultiStateView.EnumC15914e.LOADING);
                    }
                    QRCodeViewerView.this.m83128sM(true);
                    return;
                }
            }
            MultiStateView multiStateView2 = QRCodeViewerView.this.f76518Y0;
            if (multiStateView2 != null) {
                multiStateView2.setState(MultiStateView.EnumC15914e.ERROR);
                MultiStateView multiStateView3 = QRCodeViewerView.this.f76518Y0;
                if (c20096c.m104491c() == 50001) {
                    enumC15915f = MultiStateView.EnumC15915f.NETWORK_ERROR;
                } else {
                    enumC15915f = MultiStateView.EnumC15915f.UNKNOWN_ERROR;
                }
                multiStateView3.setErrorType(enumC15915f);
            }
            QRCodeViewerView qRCodeViewerView2 = QRCodeViewerView.this;
            if (qRCodeViewerView2.f76531l1 == EnumC14816e.MY_QRCODE) {
                AbstractC23309i.m122667zv(qRCodeViewerView2.f76510Q0);
            }
            String m104492d = c20096c.m104492d();
            int m104491c = c20096c.m104491c();
            if (m104491c != 17031) {
                if (m104491c == 50001) {
                    m104492d = AbstractC23136l9.m118743r0(AbstractC8020f0.NETWORK_ERROR_MSG);
                }
            } else {
                m104492d = AbstractC23136l9.m118743r0(AbstractC8020f0.ERROR_GROUP_QR_IMAGE_NOT_EXIST);
                AbstractC23304d.f113452w2 = true;
            }
            QRCodeViewerView.this.m83111xM(m104492d);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            String str = QRCodeViewerView.f76508q1;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("genBarcode error:");
            sb2.append(c20096c);
            QRCodeViewerView qRCodeViewerView = QRCodeViewerView.this;
            qRCodeViewerView.f76510Q0 = null;
            qRCodeViewerView.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.o80

                /* renamed from: q */
                public final /* synthetic */ C20096c f81444q;

                /* renamed from: r */
                public final /* synthetic */ boolean f81445r;

                public /* synthetic */ o80(C20096c c20096c2, boolean z11) {
                    r2 = c20096c2;
                    r3 = z11;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    QRCodeViewerView.C14814c.this.m83135f(r2, r3);
                }
            });
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            String str;
            String str2 = QRCodeViewerView.f76508q1;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("genBarcode Success:");
            sb2.append(obj);
            QRCodeViewerView.this.m83118FM(false);
            try {
                JSONObject jSONObject = ((JSONObject) obj).getJSONObject("data");
                QRCodeViewerView.this.f76510Q0 = jSONObject.getString("qrImgLink");
                QRCodeViewerView qRCodeViewerView = QRCodeViewerView.this;
                EnumC14816e enumC14816e = qRCodeViewerView.f76531l1;
                if (enumC14816e == EnumC14816e.GROUP_LINK) {
                    if (jSONObject.has("desc")) {
                        QRCodeViewerView.this.f76526g1 = jSONObject.getString("desc");
                    }
                    if (this.f76539a && !TextUtils.isEmpty(QRCodeViewerView.this.f76526g1)) {
                        ToastUtils.m89266n(AbstractC8020f0.str_reset_group_link_qr_code_success, new Object[0]);
                        AbstractC23304d.f113452w2 = true;
                    }
                    QRCodeViewerView.this.m83116DM("");
                    return;
                }
                if (enumC14816e == EnumC14816e.MY_QRCODE) {
                    if (!jSONObject.has("avt")) {
                        str = "";
                    } else {
                        str = jSONObject.getString("avt");
                    }
                    String str3 = QRCodeViewerView.this.f76511R0;
                    if (str3 != null && str3.equals(str)) {
                        QRCodeViewerView.this.m83116DM("");
                        AbstractC23309i.m122667zv(QRCodeViewerView.this.f76510Q0);
                        return;
                    }
                    QRCodeViewerView qRCodeViewerView2 = QRCodeViewerView.this;
                    qRCodeViewerView2.f76511R0 = str;
                    qRCodeViewerView2.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.p80
                        public /* synthetic */ p80() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            QRCodeViewerView.C14814c.this.m83134e();
                        }
                    });
                    AbstractC23309i.m122667zv(QRCodeViewerView.this.f76510Q0);
                    return;
                }
                qRCodeViewerView.m83116DM("");
            } catch (Exception e11) {
                e11.printStackTrace();
                QRCodeViewerView.this.f76510Q0 = null;
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.QRCodeViewerView$d */
    /* loaded from: classes6.dex */
    public class C14815d extends C23999j {
        C14815d() {
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            if (c3979l != null) {
                try {
                    if (c3979l.m18839c() != null) {
                        MultiStateView multiStateView = QRCodeViewerView.this.f76518Y0;
                        if (multiStateView != null) {
                            multiStateView.setVisibility(8);
                        }
                        QRCodeViewerView.this.f76513T0.setVisibility(0);
                        QRCodeViewerView.this.f76512S0.setImageInfo(c3979l);
                        return;
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                    MultiStateView multiStateView2 = QRCodeViewerView.this.f76518Y0;
                    if (multiStateView2 != null) {
                        multiStateView2.setVisibility(0);
                        QRCodeViewerView.this.f76518Y0.setState(MultiStateView.EnumC15914e.ERROR);
                        return;
                    }
                    return;
                }
            }
            MultiStateView multiStateView3 = QRCodeViewerView.this.f76518Y0;
            if (multiStateView3 != null) {
                multiStateView3.setVisibility(0);
                QRCodeViewerView.this.f76518Y0.setState(MultiStateView.EnumC15914e.ERROR);
            }
            QRCodeViewerView.this.f76513T0.setVisibility(8);
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.QRCodeViewerView$e */
    /* loaded from: classes6.dex */
    public enum EnumC14816e {
        MY_QRCODE,
        VIP_CODE,
        GROUP_LINK
    }

    /* renamed from: AM */
    public /* synthetic */ void m83098AM(SimpleAdapter simpleAdapter, InterfaceC17463d interfaceC17463d, int i11) {
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
        int intValue = ((Integer) ((HashMap) simpleAdapter.getItem(i11)).get("id")).intValue();
        if (intValue == AbstractC8020f0.forward_to_friend) {
            m83121IM(0);
        } else if (intValue == AbstractC8020f0.str_optionM_shareVipAccOnTimeLine) {
            m83121IM(1);
        }
    }

    /* renamed from: tM */
    public /* synthetic */ void m83107tM(InterfaceC17463d interfaceC17463d, int i11) {
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
        MultiStateView multiStateView = this.f76518Y0;
        if (multiStateView != null) {
            multiStateView.setVisibility(0);
            this.f76518Y0.setState(MultiStateView.EnumC15914e.LOADING);
        }
        m83128sM(true);
    }

    /* renamed from: uM */
    public /* synthetic */ void m83108uM(ValueAnimator valueAnimator) {
        try {
            if (this.f72421L0.m92648SI() == null) {
                return;
            }
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            WindowManager.LayoutParams attributes = this.f72421L0.m92676n2().getWindow().getAttributes();
            attributes.screenBrightness = intValue / 255.0f;
            this.f72421L0.m92676n2().getWindow().setAttributes(attributes);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: vM */
    public /* synthetic */ void m83109vM(ValueAnimator valueAnimator) {
        try {
            if (this.f72421L0.m92648SI() == null) {
                return;
            }
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            WindowManager.LayoutParams attributes = this.f72421L0.m92676n2().getWindow().getAttributes();
            if (intValue <= this.f76532m1) {
                attributes.screenBrightness = -1.0f;
            } else {
                attributes.screenBrightness = intValue / 255.0f;
            }
            this.f72421L0.m92676n2().getWindow().setAttributes(attributes);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: wM */
    public /* synthetic */ void m83110wM() {
        m83128sM(false);
    }

    /* renamed from: yM */
    public /* synthetic */ void m83112yM() {
        try {
            this.f76519Z0 = true;
            File m123603i = this.f76509P0.m123603i(this.f76510Q0);
            if (m123603i != null && m123603i.exists()) {
                m83117EM(m123603i.getAbsolutePath());
                this.f76519Z0 = false;
            }
            m83127rM(this.f76510Q0);
            this.f76519Z0 = false;
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: zM */
    public /* synthetic */ void m83113zM() {
        try {
            C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
            aVar.m43172u(AbstractC23136l9.m118743r0(AbstractC8020f0.str_title_popup_save_qrcode)).m43159h(3).m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_description_popup_save_qrcode)).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_close), new InterfaceC17463d.b());
            C8009j m43152a = aVar.m43152a();
            this.f76522c1 = m43152a;
            m43152a.mo13822K();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: BM */
    public void m83111xM(String str) {
        TextView textView;
        if (this.f72421L0.m92672lJ() && !this.f72421L0.m92676n2().isFinishing()) {
            if (AbstractC23309i.m122498va()) {
                this.f76514U0.setVisibility(8);
                this.f72421L0.invalidateOptionsMenu();
                if (TextUtils.isEmpty(this.f76510Q0)) {
                    MultiStateView multiStateView = this.f76518Y0;
                    if (TextUtils.isEmpty(str)) {
                        str = AbstractC23136l9.m118743r0(AbstractC8020f0.qrcode_load_not_found);
                    }
                    multiStateView.setErrorTitleString(str);
                    this.f76518Y0.setState(MultiStateView.EnumC15914e.ERROR);
                    this.f76518Y0.setVisibility(0);
                    this.f76513T0.setVisibility(8);
                    return;
                }
                this.f76518Y0.setVisibility(0);
                this.f76518Y0.setState(MultiStateView.EnumC15914e.LOADING);
                ((C23528a) this.f76509P0.m123612r(this.f76512S0)).m123585I(this.f76510Q0, true, true, 400, 0, new C14815d(), C23278z2.m120110a());
                if (this.f76529j1 && !TextUtils.isEmpty(this.f76526g1) && (textView = this.f76524e1) != null) {
                    textView.setText(this.f76526g1);
                }
                View view = this.f76517X0;
                if (view != null) {
                    view.setVisibility(0);
                    return;
                }
                return;
            }
            this.f76513T0.setVisibility(8);
            this.f76514U0.setVisibility(0);
            this.f76518Y0.setVisibility(8);
            this.f72421L0.invalidateOptionsMenu();
        }
    }

    /* renamed from: CM */
    void m83115CM() {
        if (this.f72421L0.m92672lJ() && !this.f72421L0.m92676n2().isFinishing()) {
            m83118FM(true);
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new C14813b());
            c0766k.mo1524R6();
        }
    }

    /* renamed from: DM */
    void m83116DM(String str) {
        this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.l80

            /* renamed from: q */
            public final /* synthetic */ String f80992q;

            public /* synthetic */ l80(String str2) {
                r2 = str2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                QRCodeViewerView.this.m83111xM(r2);
            }
        });
    }

    /* renamed from: EM */
    void m83117EM(String str) {
        if (!AbstractC23034c6.m118118E()) {
            AbstractC23034c6.m118186w0(m92692wK(), AbstractC23034c6.f112029f, 109);
        } else {
            m83120HM(str);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: FJ */
    public void mo37482FJ(ActionBarMenu actionBarMenu) {
        super.mo37482FJ(actionBarMenu);
        actionBarMenu.m92750r();
        EnumC14816e enumC14816e = this.f76531l1;
        if (enumC14816e == EnumC14816e.GROUP_LINK) {
            ActionBarMenuItem m92738e = actionBarMenu.m92738e(AbstractC6918a0.action_bar_menu_more, AbstractC16803z.icn_header_menu_more_white);
            this.f76527h1 = m92738e;
            m92738e.m92774j(AbstractC23136l9.m118724l(getContext(), AbstractC6918a0.menu_qrcode_reset, AbstractC8020f0.str_reset_group_link_qr_code));
            if (this.f76528i1) {
                this.f76527h1.setVisibility(0);
            } else {
                this.f76527h1.setVisibility(8);
            }
            this.f76527h1.setVisibility(8);
            return;
        }
        if (enumC14816e == EnumC14816e.MY_QRCODE) {
            this.f76527h1 = actionBarMenu.m92738e(AbstractC6918a0.action_bar_menu_more, AbstractC16803z.icn_header_menu_more_white);
            if (AbstractC23309i.m122498va()) {
                this.f76527h1.m92774j(AbstractC23136l9.m118724l(getContext(), AbstractC6918a0.menu_qrcode_scan, AbstractC8020f0.scan_qrcode));
                this.f76527h1.m92774j(AbstractC23136l9.m118724l(getContext(), AbstractC6918a0.menu_qrcode_change, AbstractC8020f0.qrcode_change));
                this.f76527h1.m92774j(AbstractC23136l9.m118724l(getContext(), AbstractC6918a0.menu_qrcode_disable, AbstractC8020f0.str_setting_off_add_friend_qrcode));
            } else {
                this.f76527h1.m92774j(AbstractC23136l9.m118724l(getContext(), AbstractC6918a0.menu_qrcode_scan, AbstractC8020f0.scan_qrcode));
                this.f76527h1.m92774j(AbstractC23136l9.m118724l(getContext(), AbstractC6918a0.menu_qrcode_enable, AbstractC8020f0.str_setting_on_add_friend_qrcode));
            }
            this.f76527h1.setVisibility(0);
        }
    }

    /* renamed from: FM */
    public void m83118FM(boolean z11) {
        int i11;
        try {
            InterfaceC27218a m92676n2 = this.f72421L0.m92676n2();
            MultiStateView multiStateView = this.f76518Y0;
            if (z11) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            AbstractC2364o0.m12372o(m92676n2, multiStateView, i11);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle m92642L3 = this.f72421L0.m92642L3();
        if (m92642L3 != null && m92642L3.containsKey("qrcode_type_view")) {
            this.f76531l1 = (EnumC14816e) m92642L3.getSerializable("qrcode_type_view");
        }
        this.f76521b1 = LayoutInflater.from(this.f72421L0.m92648SI()).inflate(AbstractC7409c0.qrcode_viewer_view, (ViewGroup) null);
        this.f76509P0 = new C23528a(this.f72421L0.m92648SI());
        RecyclingImageView recyclingImageView = (RecyclingImageView) this.f76521b1.findViewById(AbstractC6918a0.qrcode_viewer_activity_image);
        this.f76512S0 = recyclingImageView;
        recyclingImageView.setOnClickListener(this);
        this.f76513T0 = this.f76521b1.findViewById(AbstractC6918a0.qrcode_viewer_activity_data);
        this.f76514U0 = this.f76521b1.findViewById(AbstractC6918a0.layout_disable_qrcode);
        this.f76515V0 = this.f76521b1.findViewById(AbstractC6918a0.btn_enable);
        this.f76516W0 = this.f76521b1.findViewById(AbstractC6918a0.tv_scan_qrcode);
        View findViewById = this.f76521b1.findViewById(AbstractC6918a0.layoutFooterFunction);
        this.f76517X0 = findViewById;
        findViewById.setVisibility(8);
        MultiStateView multiStateView = (MultiStateView) this.f76521b1.findViewById(AbstractC6918a0.multi_state);
        this.f76518Y0 = multiStateView;
        multiStateView.setOnTapToRetryListener(new MultiStateView.InterfaceC15916g() { // from class: com.zing.zalo.ui.zviews.i80
            public /* synthetic */ i80() {
            }

            @Override // com.zing.zalo.p077ui.zviews.multistate.MultiStateView.InterfaceC15916g
            /* renamed from: a */
            public final void mo12138a() {
                QRCodeViewerView.this.m83110wM();
            }
        });
        this.f76518Y0.setVisibility(0);
        this.f76518Y0.setState(MultiStateView.EnumC15914e.LOADING);
        TextView textView = (TextView) this.f76521b1.findViewById(AbstractC6918a0.qrcode_viewer_activity_btn_change);
        textView.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.qrcode_share).toUpperCase());
        textView.setOnClickListener(this);
        TextView textView2 = (TextView) this.f76521b1.findViewById(AbstractC6918a0.qrcode_viewer_activity_btn_download);
        textView2.setOnClickListener(this);
        this.f76523d1 = (TextView) this.f76521b1.findViewById(AbstractC6918a0.qrcode_viewer_description_text);
        TextView textView3 = (TextView) this.f76521b1.findViewById(AbstractC6918a0.qrcode_viewer_activity_text);
        this.f76524e1 = textView3;
        EnumC14816e enumC14816e = this.f76531l1;
        if (enumC14816e == EnumC14816e.MY_QRCODE) {
            textView3.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.qrcode_share_self));
            this.f76510Q0 = AbstractC23309i.m121006Ha();
            this.f76511R0 = AbstractC23309i.m120969Ga();
        } else if (enumC14816e == EnumC14816e.GROUP_LINK) {
            textView2.setVisibility(8);
        }
        this.f76515V0.setOnClickListener(this);
        this.f76516W0.setOnClickListener(this);
        m92637BK(true);
        this.f76533n1 = layoutInflater;
        return this.f76521b1;
    }

    /* renamed from: GM */
    void m83119GM() {
        if (this.f76513T0.getVisibility() != 0) {
            ToastUtils.m89266n(AbstractC8020f0.qrcode_not_loaded, new Object[0]);
            return;
        }
        String str = this.f76510Q0;
        if (str != null && str.length() >= 5) {
            if (this.f76519Z0) {
                ToastUtils.m89266n(AbstractC8020f0.qrcode_saving_to_gallery, new Object[0]);
                return;
            } else {
                AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: com.zing.zalo.ui.zviews.f80
                    public /* synthetic */ f80() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        QRCodeViewerView.this.m83112yM();
                    }
                });
                return;
            }
        }
        ToastUtils.m89266n(AbstractC8020f0.unknown_error, new Object[0]);
    }

    /* renamed from: HM */
    void m83120HM(String str) {
        try {
            if (TextUtils.isEmpty(AbstractC23280z4.m120304P(str, AbstractC21943a.m114578b().getName(), false, false, false, new SensitiveData("gallery_save_qr", "scan_qr")))) {
                ToastUtils.m89266n(AbstractC8020f0.unknown_error, new Object[0]);
            } else if (this.f72421L0.m92672lJ()) {
                m83122JM();
            }
        } catch (Exception e11) {
            if (this.f72421L0.m92672lJ()) {
                ToastUtils.m89266n(AbstractC8020f0.error_message, new Object[0]);
            }
            e11.printStackTrace();
        } catch (OutOfMemoryError e12) {
            MainApplication.m35468b0();
            e12.printStackTrace();
        }
    }

    /* renamed from: IM */
    void m83121IM(int i11) {
        try {
            String str = AbstractC23352g.m122788d(this.f76510Q0) + ".jpg";
            File file = new File(AbstractC20130d.m104905y(), str);
            if (file.exists() && file.length() > 0) {
                String absolutePath = file.getAbsolutePath();
                if (i11 == 0) {
                    Bundle bundle = new Bundle();
                    bundle.putString("imagePathUri", absolutePath);
                    bundle.putBoolean("bol_share_in_app", true);
                    bundle.putBoolean("btn_extra_show_hide_post_feed", true);
                    this.f72421L0.m92662fJ().m93069k2(ShareView.class, bundle, 1, true);
                    return;
                }
                if (i11 == 1) {
                    Bundle bundle2 = new Bundle();
                    ArrayList<String> arrayList = new ArrayList<>();
                    arrayList.add(absolutePath);
                    bundle2.putStringArrayList("path", arrayList);
                    bundle2.putBoolean("fromShareVia", true);
                    this.f72421L0.m92662fJ().m93069k2(UpdateStatusView.class, bundle2, 1, true);
                    return;
                }
                AbstractC23152n3.m119011N0(this.f72421L0.m92676n2(), absolutePath, true, false, -1);
                return;
            }
            try {
                if (!file.delete()) {
                    AbstractC23350e.m122782l("Delete file " + str + " failed", new Object[0]);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122783m(e11);
            }
            this.f76509P0.m123600e(this.f76510Q0, file, new C14812a(i11));
        } catch (Exception e12) {
            e12.printStackTrace();
        }
    }

    /* renamed from: JM */
    void m83122JM() {
        if (this.f72421L0.m92676n2() == null) {
            return;
        }
        this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.h80
            public /* synthetic */ h80() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                QRCodeViewerView.this.m83113zM();
            }
        });
    }

    /* renamed from: KM */
    void m83123KM() {
        try {
            ArrayList arrayList = new ArrayList();
            HashMap hashMap = new HashMap();
            hashMap.put("name", AbstractC23136l9.m118743r0(AbstractC8020f0.forward_to_friend));
            hashMap.put("id", Integer.valueOf(AbstractC8020f0.forward_to_friend));
            arrayList.add(hashMap);
            HashMap hashMap2 = new HashMap();
            hashMap2.put("name", AbstractC23136l9.m118743r0(AbstractC8020f0.str_optionM_shareVipAccOnTimeLine));
            hashMap2.put("id", Integer.valueOf(AbstractC8020f0.str_optionM_shareVipAccOnTimeLine));
            arrayList.add(hashMap2);
            if (!arrayList.isEmpty()) {
                SimpleAdapter simpleAdapter = new SimpleAdapter(this.f72421L0.m92648SI(), arrayList, AbstractC7409c0.active_passcode_time_menu_item, new String[]{"name"}, new int[]{AbstractC6918a0.tv_active_time_passcode});
                C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
                aVar.m43172u(AbstractC23136l9.m118743r0(AbstractC8020f0.qrcode_share));
                aVar.m43173v(100);
                aVar.m43155d(true);
                aVar.m43153b(simpleAdapter, new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.g80

                    /* renamed from: q */
                    public final /* synthetic */ SimpleAdapter f80447q;

                    public /* synthetic */ g80(SimpleAdapter simpleAdapter2) {
                        r2 = simpleAdapter2;
                    }

                    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                    /* renamed from: K8 */
                    public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                        QRCodeViewerView.this.m83098AM(r2, interfaceC17463d, i11);
                    }
                });
                C8009j m43152a = aVar.m43152a();
                this.f76522c1 = m43152a;
                if (m43152a != null && !m43152a.m92868m()) {
                    this.f76522c1.mo13822K();
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: QJ */
    public boolean mo37491QJ(int i11) {
        if (i11 == AbstractC6918a0.menu_qrcode_reset) {
            m83124oM();
            return true;
        }
        if (i11 == AbstractC6918a0.menu_qrcode_change) {
            m83124oM();
            return true;
        }
        if (i11 == AbstractC6918a0.menu_qrcode_scan) {
            Bundle bundle = new Bundle();
            bundle.putInt("extra_src", 6);
            AbstractC26412d.m136219h(m92676n2(), bundle, 0);
            return true;
        }
        if (i11 != AbstractC6918a0.menu_qrcode_disable && i11 != AbstractC6918a0.menu_qrcode_enable) {
            return super.mo37491QJ(i11);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putInt("EXTRA_HIGHTLIGHT_SETTING_ID", 2);
        this.f72421L0.m92662fJ().m93069k2(SettingManageSourceFriendView.class, bundle2, 1, true);
        return true;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        super.mo13886RJ();
        m83126qM();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: TJ */
    public void mo37493TJ() {
        super.mo37493TJ();
        try {
            if (this.f88760a0 != null) {
                String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_title_QRCodeVipAct);
                EnumC14816e enumC14816e = this.f76531l1;
                if (enumC14816e == EnumC14816e.MY_QRCODE) {
                    m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.qrcode_my_code);
                } else if (enumC14816e == EnumC14816e.GROUP_LINK) {
                    m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_group_link_qr_code);
                } else if (enumC14816e == EnumC14816e.VIP_CODE) {
                    m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_title_QRCodeVipAct);
                }
                this.f88760a0.setTitle(m118743r0);
                this.f88760a0.setBackButtonImage(AbstractC16803z.stencils_ic_head_back_white);
                this.f88760a0.setBackgroundResource(AbstractC16803z.stencil_bg_action_bar);
                this.f88760a0.setItemsBackground(AbstractC7356u0.item_actionbar_background_ripple);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: UJ */
    public void mo37584UJ() {
        super.mo37584UJ();
        this.f76520a1 = true;
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
        C8009j c8009j = this.f76522c1;
        if (c8009j != null && c8009j.m92868m()) {
            this.f76522c1.dismiss();
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return f76508q1;
    }

    /* renamed from: oM */
    void m83124oM() {
        if (this.f76513T0.getVisibility() != 0) {
            ToastUtils.m89266n(AbstractC8020f0.qrcode_not_loaded, new Object[0]);
            return;
        }
        String str = this.f76510Q0;
        if (str != null && str.length() >= 5) {
            try {
                C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
                aVar.m43172u(AbstractC23136l9.m118743r0(AbstractC8020f0.str_popup_change_qrcode)).m43159h(3).m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.qrcode_change_code_warning)).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_button_confirm_no), new InterfaceC17463d.b()).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.change), new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.m80
                    public /* synthetic */ m80() {
                    }

                    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                    /* renamed from: K8 */
                    public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                        QRCodeViewerView.this.m83107tM(interfaceC17463d, i11);
                    }
                });
                C8009j m43152a = aVar.m43152a();
                this.f76522c1 = m43152a;
                m43152a.mo13822K();
                return;
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
        ToastUtils.m89266n(AbstractC8020f0.unknown_error, new Object[0]);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == AbstractC6918a0.qrcode_viewer_activity_image) {
            m83123KM();
            return;
        }
        if (id2 == AbstractC6918a0.qrcode_viewer_activity_btn_change) {
            if (this.f76531l1 == EnumC14816e.MY_QRCODE) {
                m83123KM();
                return;
            } else {
                m83121IM(2);
                return;
            }
        }
        if (id2 == AbstractC6918a0.qrcode_viewer_activity_btn_download) {
            m83119GM();
            return;
        }
        if (id2 == AbstractC6918a0.btn_enable) {
            this.f72421L0.m92662fJ().m93069k2(SettingManageSourceFriendView.class, null, 1, true);
        } else if (id2 == AbstractC6918a0.tv_scan_qrcode) {
            Bundle bundle = new Bundle();
            bundle.putInt("extra_src", 6);
            AbstractC26412d.m136219h(m92676n2(), bundle, 0);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 == 4) {
            return super.onKeyUp(i11, keyEvent);
        }
        if (i11 == 82) {
            return true;
        }
        return super.onKeyUp(i11, keyEvent);
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onRequestPermissionsResult(int i11, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i11, strArr, iArr);
        if (i11 == 109) {
            try {
                m92689tK().getContentResolver().notifyChange(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, null);
                if (iArr.length > 0 && AbstractC23034c6.m118121G()) {
                    m83120HM(this.f76509P0.m123603i(this.f76510Q0).getAbsolutePath());
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        try {
            if (this.f76520a1) {
                if (!TextUtils.isEmpty(this.f76510Q0)) {
                    m83111xM("");
                }
                m83128sM(false);
                this.f76520a1 = false;
            } else {
                m83111xM("");
            }
            m83125pM();
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f76508q1, e11);
        }
    }

    /* renamed from: pM */
    void m83125pM() {
        try {
            if (this.f72421L0.m92648SI() == null) {
                return;
            }
            int i11 = Settings.System.getInt(this.f72421L0.m92648SI().getContentResolver(), "screen_brightness");
            this.f76532m1 = i11;
            if (i11 < 200) {
                ValueAnimator ofInt = ValueAnimator.ofInt(i11, 200);
                ofInt.setDuration(500L);
                ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.zing.zalo.ui.zviews.j80
                    public /* synthetic */ j80() {
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        QRCodeViewerView.this.m83108uM(valueAnimator);
                    }
                });
                ofInt.start();
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: qM */
    void m83126qM() {
        try {
            if (this.f72421L0.m92648SI() == null) {
                return;
            }
            int i11 = Settings.System.getInt(this.f72421L0.m92648SI().getContentResolver(), "screen_brightness");
            if (i11 <= 0) {
                i11 = this.f76532m1;
            }
            if (200 > i11) {
                ValueAnimator ofInt = ValueAnimator.ofInt(200, i11);
                ofInt.setDuration(250L);
                ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.zing.zalo.ui.zviews.k80
                    public /* synthetic */ k80() {
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        QRCodeViewerView.this.m83109vM(valueAnimator);
                    }
                });
                ofInt.start();
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: rM */
    void m83127rM(String str) {
        try {
            C23994e c23994e = new C23994e();
            ((C23994e) c23994e.m125635v1(str)).m125628s1(File.class);
            this.f76509P0.m123595U(c23994e);
            File file = (File) c23994e.m125622p0();
            if (c23994e.m125624q0().m125657h() == 200) {
                m83117EM(file.getAbsolutePath());
            } else if (this.f72421L0.m92672lJ()) {
                if (AbstractC23238v2.m119727l()) {
                    ToastUtils.m89266n(AbstractC8020f0.qrcode_download_qrcode_error, new Object[0]);
                } else {
                    ToastUtils.m89266n(AbstractC8020f0.error_sdcard, new Object[0]);
                }
            }
        } catch (Exception e11) {
            if (this.f72421L0.m92672lJ()) {
                ToastUtils.m89266n(AbstractC8020f0.error_message, new Object[0]);
            }
            e11.printStackTrace();
        } catch (OutOfMemoryError e12) {
            MainApplication.m35468b0();
            e12.printStackTrace();
        }
    }

    /* renamed from: sM */
    void m83128sM(boolean z11) {
        if (this.f72421L0.m92672lJ() && !this.f72421L0.m92676n2().isFinishing()) {
            this.f76518Y0.setVisibility(0);
            this.f76518Y0.setState(MultiStateView.EnumC15914e.LOADING);
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new C14814c(z11));
            if (!z11) {
                EnumC14816e enumC14816e = this.f76531l1;
                if (enumC14816e == EnumC14816e.MY_QRCODE) {
                    c0766k.mo1667j7();
                    return;
                } else if (enumC14816e == EnumC14816e.GROUP_LINK) {
                    c0766k.mo1516Q6(this.f76525f1, z11);
                    return;
                } else {
                    if (enumC14816e == EnumC14816e.VIP_CODE) {
                        c0766k.mo1768w8(this.f76525f1);
                        return;
                    }
                    return;
                }
            }
            if (z11) {
                EnumC14816e enumC14816e2 = this.f76531l1;
                if (enumC14816e2 == EnumC14816e.MY_QRCODE) {
                    c0766k.mo1679l5();
                } else if (enumC14816e2 == EnumC14816e.GROUP_LINK) {
                    c0766k.mo1516Q6(this.f76525f1, z11);
                }
            }
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        String str;
        super.mo37135xJ(bundle);
        Bundle m92642L3 = this.f72421L0.m92642L3();
        if (m92642L3 != null) {
            if (this.f76531l1 == EnumC14816e.GROUP_LINK) {
                if (m92642L3.containsKey("BOL_EXTRA_IS_GROUP_OWNER")) {
                    this.f76528i1 = m92642L3.getBoolean("BOL_EXTRA_IS_GROUP_OWNER");
                }
                if (m92642L3.containsKey("extra_group_id")) {
                    this.f76525f1 = m92642L3.getString("extra_group_id");
                    if (C0943w.m4462l().m4473g(this.f76525f1) != null) {
                        this.f76529j1 = true;
                    }
                }
            }
            if (this.f76531l1 == EnumC14816e.VIP_CODE) {
                String str2 = "";
                if (!m92642L3.containsKey("vipUid")) {
                    str = "";
                } else {
                    str = m92642L3.getString("vipUid");
                }
                this.f76525f1 = str;
                if (m92642L3.containsKey("vipDPN")) {
                    str2 = m92642L3.getString("vipDPN");
                }
                this.f76530k1 = str2;
                int i11 = m92642L3.getInt("vipContactType", -1);
                if (!TextUtils.isEmpty(this.f76530k1)) {
                    this.f76523d1.setText(this.f76530k1);
                    this.f76523d1.setVisibility(0);
                    if (i11 != -1) {
                        AbstractC23136l9.m118705e1(this.f72421L0.m92648SI(), i11, this.f76525f1, this.f76523d1);
                        return;
                    }
                    return;
                }
                this.f76523d1.setVisibility(8);
            }
        }
    }
}
