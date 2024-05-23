package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import bn.C2928y1;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.biometric.AbstractC7356u0;
import com.zing.zalo.camera.common.models.CameraInputParams;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.data.mediapicker.model.MediaItem;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p077ui.maintab.MainTabView;
import com.zing.zalo.p077ui.picker.gallerypicker.GalleryPickerView;
import com.zing.zalo.p077ui.widget.AvatarImageView;
import com.zing.zalo.p077ui.zviews.UpdateAvatarView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zdesign.component.Snackbar;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import com.zing.zalo.zview.actionbar.ActionBar;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import com.zing.zalocore.CoreUtility;
import hm0.C20096c;
import ho0.AbstractC20110a;
import i40.AbstractC20276f;
import is.AbstractC20826v0;
import is.C20834z0;
import java.io.File;
import java.util.List;
import lb.AbstractC22393f;
import lb.C22392e;
import me0.AbstractC23006a0;
import me0.AbstractC23034c6;
import me0.AbstractC23041d2;
import me0.AbstractC23136l9;
import me0.AbstractC23211s7;
import me0.AbstractC23238v2;
import me0.C23055e5;
import me0.C23278z2;
import mm0.AbstractC23350e;
import od0.InterfaceC24223a;
import org.json.JSONObject;
import p140ev.C18613b;
import p322lf.AbstractC22470k;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import p379o3.C23995f;
import p379o3.C23999j;
import p458qr.C25487t;
import pd0.C24730d;
import pd0.C24732f;
import pd0.EnumC24733g;
import pd0.EnumC24734h;
import wh0.C29046a;

/* loaded from: classes6.dex */
public class UpdateAvatarView extends BaseZaloView implements View.OnClickListener, InterfaceC17463d.d, InterfaceC0733x {

    /* renamed from: N0 */
    AvatarImageView f78539N0;

    /* renamed from: O0 */
    RecyclingImageView f78540O0;

    /* renamed from: P0 */
    View f78541P0;

    /* renamed from: Q0 */
    View f78542Q0;

    /* renamed from: R0 */
    ImageButton f78543R0;

    /* renamed from: T0 */
    Drawable f78545T0;

    /* renamed from: U0 */
    C23528a f78546U0;

    /* renamed from: V0 */
    View f78547V0;

    /* renamed from: W0 */
    C2928y1.a f78548W0;

    /* renamed from: Z0 */
    InterfaceC24223a f78551Z0;

    /* renamed from: e1 */
    File f78556e1;

    /* renamed from: M0 */
    private final String f78538M0 = UpdateAvatarView.class.getSimpleName();

    /* renamed from: S0 */
    private Snackbar f78544S0 = null;

    /* renamed from: X0 */
    String f78549X0 = "";

    /* renamed from: Y0 */
    String f78550Y0 = "";

    /* renamed from: a1 */
    boolean f78552a1 = false;

    /* renamed from: b1 */
    public boolean f78553b1 = false;

    /* renamed from: c1 */
    boolean f78554c1 = false;

    /* renamed from: d1 */
    int f78555d1 = 0;

    /* renamed from: com.zing.zalo.ui.zviews.UpdateAvatarView$a */
    /* loaded from: classes6.dex */
    public class C15230a implements InterfaceC24223a {
        C15230a() {
        }

        /* renamed from: g */
        public /* synthetic */ void m85560g(Intent intent) {
            try {
                UpdateAvatarView.this.f72421L0.mo49315c4();
                ImageButton imageButton = UpdateAvatarView.this.f78543R0;
                if (imageButton != null) {
                    imageButton.setVisibility(8);
                }
                UpdateAvatarView.this.f78549X0 = intent.getStringExtra("urlUploaded");
                UpdateAvatarView updateAvatarView = UpdateAvatarView.this;
                updateAvatarView.m85547CM(updateAvatarView.f78549X0);
                View view = UpdateAvatarView.this.f78542Q0;
                if (view != null && view.getVisibility() != 0) {
                    if (MainTabView.m67645lM() != null) {
                        MainTabView.m67645lM().m67701oN();
                    }
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("EXTRA_FROM_ACTIVE_LOGIN_FLOW", true);
                    bundle.putInt("SHOW_WITH_FLAGS", 50331648);
                    UpdateAvatarView.this.f72421L0.m92662fJ().m93069k2(MainTabView.class, bundle, 1, true);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* renamed from: h */
        public /* synthetic */ void m85561h() {
            UpdateAvatarView.this.m85529BM();
            UpdateAvatarView.this.mo49315c4();
        }

        /* renamed from: i */
        public /* synthetic */ void m85562i(String str) {
            UpdateAvatarView.this.m85529BM();
            UpdateAvatarView.this.mo49315c4();
            UpdateAvatarView.this.m85531dj(str, 3000);
        }

        @Override // od0.InterfaceC24223a
        /* renamed from: a */
        public void mo50006a(Intent intent) {
            String m121120Kd = AbstractC23309i.m121120Kd();
            if (!TextUtils.isEmpty(m121120Kd)) {
                try {
                    JSONObject jSONObject = new JSONObject(m121120Kd);
                    jSONObject.put("is_set_avatar", true);
                    AbstractC23309i.m122037iz(jSONObject.toString());
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
            String m121046Id = AbstractC23309i.m121046Id();
            if (!TextUtils.isEmpty(m121046Id)) {
                try {
                    JSONObject jSONObject2 = new JSONObject(m121046Id);
                    jSONObject2.put("needUpdateInfo", 0);
                    AbstractC23309i.m121962gz(jSONObject2.toString());
                } catch (Exception e12) {
                    e12.printStackTrace();
                }
            }
            UpdateAvatarView updateAvatarView = UpdateAvatarView.this;
            updateAvatarView.f78553b1 = true;
            if (updateAvatarView.f72421L0.m92676n2() != null) {
                UpdateAvatarView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.sv0

                    /* renamed from: q */
                    public final /* synthetic */ Intent f82134q;

                    public /* synthetic */ sv0(Intent intent2) {
                        r2 = intent2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        UpdateAvatarView.C15230a.this.m85560g(r2);
                    }
                });
            }
        }

        @Override // od0.InterfaceC24223a
        /* renamed from: b */
        public void mo50007b(String str) {
            try {
                UpdateAvatarView.this.m92692wK().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.rv0

                    /* renamed from: q */
                    public final /* synthetic */ String f81860q;

                    public /* synthetic */ rv0(String str2) {
                        r2 = str2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        UpdateAvatarView.C15230a.this.m85562i(r2);
                    }
                });
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        @Override // od0.InterfaceC24223a
        /* renamed from: c */
        public void mo50008c(C20096c c20096c) {
            try {
                UpdateAvatarView.this.m92692wK().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.qv0
                    public /* synthetic */ qv0() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        UpdateAvatarView.C15230a.this.m85561h();
                    }
                });
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.UpdateAvatarView$b */
    /* loaded from: classes6.dex */
    public class C15231b extends C23999j {

        /* renamed from: l1 */
        final /* synthetic */ boolean f78558l1;

        C15231b(boolean z11) {
            this.f78558l1 = z11;
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            String str2;
            if (c3979l != null) {
                try {
                    if (c3979l.m18839c() != null) {
                        UpdateAvatarView.this.f78539N0.setImageInfo(c3979l);
                        try {
                            if (this.f78558l1 && (str2 = UpdateAvatarView.this.f78549X0) != null && AbstractC23041d2.m118194A(str2)) {
                                UpdateAvatarView updateAvatarView = UpdateAvatarView.this;
                                updateAvatarView.f78553b1 = false;
                                updateAvatarView.m85546AM(updateAvatarView.f78549X0);
                            } else {
                                UpdateAvatarView.this.f72421L0.mo49315c4();
                            }
                        } catch (Resources.NotFoundException e11) {
                            e11.printStackTrace();
                        }
                    }
                } catch (Exception e12) {
                    e12.printStackTrace();
                }
            }
        }
    }

    /* renamed from: BM */
    public void m85529BM() {
        try {
            if (C24730d.m128465h().m128473g(CoreUtility.f89233i) != null) {
                ImageButton imageButton = this.f78543R0;
                if (imageButton != null) {
                    imageButton.setVisibility(0);
                }
            } else {
                ImageButton imageButton2 = this.f78543R0;
                if (imageButton2 != null) {
                    imageButton2.setVisibility(8);
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: dj */
    public void m85531dj(String str, int i11) {
        try {
            m92692wK().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.mv0

                /* renamed from: q */
                public final /* synthetic */ String f81270q;

                /* renamed from: r */
                public final /* synthetic */ int f81271r;

                public /* synthetic */ mv0(String str2, int i112) {
                    r2 = str2;
                    r3 = i112;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    UpdateAvatarView.this.m85544uM(r2, r3);
                }
            });
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: pM */
    private void m85539pM() {
        Snackbar snackbar = this.f78544S0;
        if (snackbar != null && snackbar.m90661t()) {
            this.f78544S0.m90655n();
            this.f78544S0 = null;
        }
    }

    /* renamed from: qM */
    public /* synthetic */ void m85540qM() {
        try {
            String[] m118177s = AbstractC23034c6.m118177s();
            if (AbstractC23034c6.m118167n(this.f72421L0.m92648SI(), m118177s) != 0) {
                AbstractC23034c6.m118184v0(this.f72421L0, m118177s, 0);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: rM */
    public /* synthetic */ void m85541rM(InterfaceC17463d interfaceC17463d, int i11) {
        String str;
        AbstractC23647d.m123907q("19502", "");
        m85549mD();
        AbstractC23647d.m123893c();
        if (this.f78552a1) {
            str = "38553";
        } else {
            str = "38549";
        }
        AbstractC23647d.m123897g(str);
    }

    /* renamed from: sM */
    public /* synthetic */ void m85542sM(InterfaceC17463d interfaceC17463d, int i11) {
        String str;
        m85550mM();
        if (this.f78552a1) {
            str = "38554";
        } else {
            str = "38550";
        }
        AbstractC23647d.m123897g(str);
    }

    /* renamed from: tM */
    public /* synthetic */ void m85543tM(InterfaceC17463d interfaceC17463d) {
        String str;
        if (this.f78552a1) {
            str = "38555";
        } else {
            str = "38551";
        }
        AbstractC23647d.m123897g(str);
    }

    /* renamed from: uM */
    public /* synthetic */ void m85544uM(String str, int i11) {
        m85539pM();
        this.f78544S0 = AbstractC20826v0.m108786T0(this.f78547V0, str, i11);
    }

    /* renamed from: vM */
    public /* synthetic */ void m85545vM() {
        ImageButton imageButton = this.f78543R0;
        if (imageButton != null) {
            imageButton.setVisibility(0);
        }
        this.f72421L0.mo49315c4();
    }

    /* renamed from: AM */
    public void m85546AM(String str) {
        if (C23055e5.m118272g(true)) {
            C24730d.m128465h().m128477p(str, EnumC24734h.AVATAR, 0, false, "", null, this.f78551Z0);
        } else {
            this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.lv0
                public /* synthetic */ lv0() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    UpdateAvatarView.this.m85545vM();
                }
            });
        }
    }

    /* renamed from: CM */
    public void m85547CM(String str) {
        ContactProfile contactProfile = AbstractC23304d.f113368c0;
        contactProfile.f42446v = str;
        contactProfile.f42323A1 = str;
        ((C23528a) this.f78546U0.m123612r(this.f78539N0)).m123618x(AbstractC23304d.f113368c0.f42446v, C23278z2.m120149q());
        this.f78549X0 = "";
        C20834z0.f102412a.m108925d(true);
        C25487t.f122084a.m132028c(C25487t.a.f122086A);
        try {
            AbstractC23309i.m121068Iz(AbstractC23304d.f113368c0.m40373K());
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        if (this.f72421L0.m92672lJ()) {
            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_toast_updateAvtSuccess));
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        if (i11 != 0) {
            if (i11 != 1) {
                return null;
            }
            C2928y1.a aVar = new C2928y1.a(this.f72421L0.m92676n2());
            this.f78548W0 = aVar;
            aVar.m13883l(AbstractC23136l9.m118743r0(AbstractC8020f0.str_titleDlg7));
            this.f78548W0.m13882k(new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.nv0
                public /* synthetic */ nv0() {
                }

                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                    UpdateAvatarView.this.m85541rM(interfaceC17463d, i12);
                }
            });
            this.f78548W0.m13881j(new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.ov0
                public /* synthetic */ ov0() {
                }

                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                    UpdateAvatarView.this.m85542sM(interfaceC17463d, i12);
                }
            });
            C2928y1 m13880e = this.f78548W0.m13880e();
            m13880e.m92854E(new InterfaceC17463d.c() { // from class: com.zing.zalo.ui.zviews.pv0
                public /* synthetic */ pv0() {
                }

                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.c
                /* renamed from: p7 */
                public final void mo13013p7(InterfaceC17463d interfaceC17463d) {
                    UpdateAvatarView.this.m85543tM(interfaceC17463d);
                }
            });
            return m13880e;
        }
        C8009j.a aVar2 = new C8009j.a(this.f72421L0.m92648SI());
        aVar2.m43172u(AbstractC23136l9.m118743r0(AbstractC8020f0.str_titleDlg2)).m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_warning_skip_update_avt_content)).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_button_confirm_no).toUpperCase(), this).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.btn_update_avatar).toUpperCase(), this);
        return aVar2.m43152a();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f78547V0 = layoutInflater.inflate(AbstractC7409c0.update_avatar_view, viewGroup, false);
        AbstractC23647d.m123897g("38547");
        return this.f78547V0;
    }

    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
    /* renamed from: K8 */
    public void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
        try {
            if (interfaceC17463d.mo92862f() == 0) {
                if (i11 == -1) {
                    interfaceC17463d.dismiss();
                    this.f72421L0.showDialog(1);
                } else if (i11 == -2) {
                    interfaceC17463d.dismiss();
                    m85551nM();
                    AbstractC23647d.m123897g("38557");
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: SJ */
    public void mo37118SJ(Bundle bundle) {
        super.mo37118SJ(bundle);
        try {
            File file = this.f78556e1;
            if (file != null) {
                bundle.putString("cameraImageUri", file.getPath());
            }
            bundle.putString("avata_path", this.f78549X0);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: TJ */
    public void mo37493TJ() {
        super.mo37493TJ();
        try {
            ActionBar actionBar = this.f88760a0;
            if (actionBar != null) {
                actionBar.setBackButtonImage(AbstractC16803z.stencils_ic_head_back_white);
                this.f88760a0.setBackgroundResource(AbstractC16803z.stencil_bg_action_bar);
                this.f88760a0.setItemsBackground(AbstractC7356u0.item_actionbar_background_ripple);
                this.f88760a0.setTitle(AbstractC23136l9.m118743r0(AbstractC8020f0.str_tv_titleBar2));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "UpdateAvatarView";
    }

    /* renamed from: lM */
    public void m85548lM(int i11) {
        if (this.f72421L0.m92648SI() != null && !this.f72421L0.mo60294yp()) {
            this.f72421L0.removeDialog(i11);
            this.f72421L0.showDialog(i11);
        }
    }

    /* renamed from: mD */
    public void m85549mD() {
        try {
            String[] m118177s = AbstractC23034c6.m118177s();
            if (AbstractC23034c6.m118167n(this.f72421L0.m92648SI(), m118177s) != 0) {
                AbstractC23034c6.m118184v0(this, m118177s, 111);
            } else {
                m85556zM();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: mM */
    void m85550mM() {
        try {
            if (AbstractC23238v2.m119727l()) {
                Bundle bundle = new Bundle();
                bundle.putParcelable("EXTRA_SENSITIVE_DATA", new SensitiveData("gallery_avatar_new_account", "profile_avatar"));
                AbstractC23211s7.m119589v(this.f72421L0.m92676n2(), ZAbstractBase.ZVU_BLEND_PERCENTAGE, 1, true, bundle);
            } else {
                ToastUtils.m89266n(AbstractC8020f0.error_sdcard, new Object[0]);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: nM */
    public void m85551nM() {
        boolean z11 = true;
        try {
            C22392e m115809a = AbstractC22393f.m115809a();
            if (m115809a != null && m115809a.m115808c()) {
                String m115807b = m115809a.m115807b();
                if (TextUtils.isEmpty(m115807b)) {
                    m115807b = "https://jp.zaloapp.com/zverify-lp-newuser";
                }
                Bundle bundle = new Bundle();
                bundle.putSerializable("EXTRA_FEATURE_ID", C18613b.f93599r);
                bundle.putString("EXTRA_WEB_URL", m115807b);
                this.f72421L0.m92662fJ().m93066i2(ZaloWebView.class, bundle, ZAbstractBase.ZVU_BLEND_GEN_THUMB, 1, true);
                z11 = false;
                mo78955kl(new Runnable() { // from class: com.zing.zalo.ui.zviews.kv0
                    public /* synthetic */ kv0() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        UpdateAvatarView.this.m85540qM();
                    }
                }, 200L);
                return;
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            if (!z11) {
                return;
            }
        }
        m85554xM();
    }

    /* renamed from: oM */
    void m85552oM(int i11, Intent intent) {
        MediaItem mediaItem;
        if (i11 == -1 && intent != null) {
            try {
                if (intent.getBooleanExtra("EXTRA_IS_ERROR", false)) {
                    String stringExtra = intent.getStringExtra("EXTRA_ERROR_MSG");
                    if (TextUtils.isEmpty(stringExtra)) {
                        m85531dj(AbstractC23136l9.m118743r0(AbstractC8020f0.error_general), 3000);
                        return;
                    } else {
                        m85531dj(stringExtra, 3000);
                        return;
                    }
                }
                List m71440ZM = GalleryPickerView.m71440ZM(intent);
                if (m71440ZM != null && m71440ZM.size() > 0 && (mediaItem = (MediaItem) m71440ZM.get(0)) != null) {
                    String str = "";
                    if (!TextUtils.isEmpty(mediaItem.m41113N())) {
                        str = mediaItem.m41113N();
                    } else if (!TextUtils.isEmpty(mediaItem.mo41081Q())) {
                        str = mediaItem.mo41081Q();
                    }
                    if (!TextUtils.isEmpty(str)) {
                        m85555yM(str, true);
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0048 -> B:5:0x0057). Please report as a decompilation issue!!! */
    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        try {
            if (i11 == 1002) {
                m85552oM(i12, intent);
            } else if (i11 == 5) {
                if (i12 == -1) {
                    try {
                        String stringExtra = intent.getStringExtra("extra_result_output_path");
                        if (intent.getBooleanExtra("EXTRA_IS_ERROR", false)) {
                            String stringExtra2 = intent.getStringExtra("EXTRA_ERROR_MSG");
                            if (TextUtils.isEmpty(stringExtra2)) {
                                m85531dj(AbstractC23136l9.m118743r0(AbstractC8020f0.error_general), 3000);
                            } else {
                                m85531dj(stringExtra2, 3000);
                            }
                        } else if (!TextUtils.isEmpty(stringExtra)) {
                            m85555yM(stringExtra, true);
                        }
                    } catch (Exception e11) {
                        e11.printStackTrace();
                    }
                }
            } else if (i11 == 1003) {
                m85554xM();
            }
        } catch (Exception e12) {
            e12.printStackTrace();
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0068 -> B:26:0x006b). Please report as a decompilation issue!!! */
    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == AbstractC6918a0.tv_str_skip) {
            if (this.f78553b1) {
                m85551nM();
                AbstractC23647d.m123897g("38556");
                return;
            } else {
                this.f72421L0.showDialog(0);
                return;
            }
        }
        if (id2 == AbstractC6918a0.btnRetryUploadAvatar) {
            ImageButton imageButton = this.f78543R0;
            if (imageButton != null) {
                imageButton.setVisibility(8);
            }
            m85546AM(this.f78549X0);
            return;
        }
        if (id2 == AbstractC6918a0.tvChooseImage || id2 == AbstractC6918a0.imvAvatar) {
            try {
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
            if (this.f78543R0.getVisibility() == 0) {
                return;
            }
            AbstractC23647d.m123907q("19501", "");
            m85548lM(1);
            AbstractC23647d.m123893c();
            if (view.getId() == AbstractC6918a0.imvAvatar) {
                AbstractC23647d.m123897g("38548");
                this.f78552a1 = false;
            } else {
                AbstractC23647d.m123897g("38552");
                this.f78552a1 = true;
            }
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onRequestPermissionsResult(int i11, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i11, strArr, iArr);
        if (i11 == 111) {
            try {
                if (AbstractC23034c6.m118167n(this.f72421L0.m92648SI(), AbstractC23034c6.m118177s()) == 0) {
                    m85556zM();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: wM */
    void m85553wM() {
        try {
            String m121120Kd = AbstractC23309i.m121120Kd();
            if (!TextUtils.isEmpty(m121120Kd)) {
                try {
                    this.f78554c1 = new JSONObject(m121120Kd).getBoolean("is_set_dob");
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
            String m121046Id = AbstractC23309i.m121046Id();
            if (!TextUtils.isEmpty(m121046Id)) {
                try {
                    this.f78555d1 = new JSONObject(m121046Id).optInt("needUpdateInfo");
                } catch (Exception e12) {
                    e12.printStackTrace();
                }
            }
            if (this.f78554c1 && this.f78555d1 == 0) {
                if (AbstractC23304d.f113368c0 != null) {
                    ((C23528a) this.f78546U0.m123612r(this.f78539N0)).m123618x(AbstractC23304d.f113368c0.f42446v, C23278z2.m120149q());
                    this.f78553b1 = true;
                }
                C24732f m128473g = C24730d.m128465h().m128473g(CoreUtility.f89233i);
                if (m128473g != null) {
                    if (m128473g.f118782d == EnumC24733g.UPLOADING) {
                        this.f72421L0.mo46829Y();
                        this.f78543R0.setVisibility(8);
                    } else {
                        this.f72421L0.mo49315c4();
                        this.f78543R0.setVisibility(0);
                    }
                    this.f78549X0 = m128473g.f118779a;
                    m128473g.m128493m(this.f78551Z0);
                    return;
                }
                this.f78543R0.setVisibility(8);
            }
        } catch (Exception e13) {
            e13.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        this.f78546U0 = new C23528a(this.f72421L0.m92648SI());
        try {
            this.f78542Q0 = this.f72421L0.m92656bJ().findViewById(AbstractC6918a0.tv_str_skip);
            if (this.f72421L0.m92642L3() != null && this.f72421L0.m92642L3().getBoolean("EXTRA_SHOW_FROM_DOCK", false)) {
                this.f78542Q0.setVisibility(8);
            } else {
                this.f78542Q0.setOnClickListener(this);
                this.f78542Q0.setVisibility(0);
            }
            View findViewById = this.f72421L0.m92656bJ().findViewById(AbstractC6918a0.pbUploadAvatar);
            this.f78541P0 = findViewById;
            findViewById.setVisibility(8);
            ImageButton imageButton = (ImageButton) this.f72421L0.m92656bJ().findViewById(AbstractC6918a0.btnRetryUploadAvatar);
            this.f78543R0 = imageButton;
            imageButton.setVisibility(8);
            this.f78543R0.setOnClickListener(this);
            AvatarImageView avatarImageView = (AvatarImageView) this.f72421L0.m92656bJ().findViewById(AbstractC6918a0.imvAvatar);
            this.f78539N0 = avatarImageView;
            avatarImageView.setOnClickListener(this);
            this.f72421L0.m92656bJ().findViewById(AbstractC6918a0.tvChooseImage).setOnClickListener(this);
            RecyclingImageView recyclingImageView = (RecyclingImageView) this.f72421L0.m92656bJ().findViewById(AbstractC6918a0.ic_hint_update_avt);
            this.f78540O0 = recyclingImageView;
            AbstractC20276f.m105889b(recyclingImageView, 1000L);
            this.f78551Z0 = new C15230a();
            if (this.f78545T0 == null) {
                this.f78545T0 = AbstractC23136l9.m118665N(getContext(), AbstractC16803z.default_avatar2);
            }
            m85553wM();
            if (bundle != null) {
                if (bundle.containsKey("cameraImageUri")) {
                    this.f78556e1 = new File(bundle.getString("cameraImageUri"));
                }
                m85555yM(bundle.getString("avata_path"), false);
            }
            AbstractC23647d.m123906p("19500");
            AbstractC23647d.m123893c();
        } catch (Exception e11) {
            AbstractC23350e.m122776f(this.f78538M0, e11);
        }
    }

    /* renamed from: xM */
    public void m85554xM() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("EXTRA_FROM_ACTIVE_LOGIN_FLOW", true);
        bundle.putInt("SHOW_WITH_FLAGS", 67108864);
        this.f72421L0.m92662fJ().m93069k2(MainTabView.class, bundle, 1, true);
    }

    /* renamed from: yM */
    void m85555yM(String str, boolean z11) {
        try {
            if (!TextUtils.isEmpty(str)) {
                this.f78549X0 = str;
                C15231b c15231b = new C15231b(z11);
                this.f72421L0.mo46829Y();
                this.f78543R0.setVisibility(8);
                c15231b.m125774f3(1000);
                ((C23528a) this.f78546U0.m123612r(this.f78539N0)).m123583G(this.f78549X0, false, true, AbstractC23006a0.m117905e(), AbstractC16803z.default_avatar2, this.f78545T0, c15231b, C23278z2.m120110a());
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: zM */
    void m85556zM() {
        if (AbstractC23238v2.m119727l()) {
            CameraInputParams m39210w = CameraInputParams.m39210w();
            C29046a.f134547b = "UpdateAvatarView";
            m39210w.f41138w0 = new SensitiveData("camera_avatar_new_account", "profile_avatar");
            AbstractC22470k.m116167s(this.f72421L0.m92676n2(), 5, 1, m39210w);
            return;
        }
        ToastUtils.m89266n(AbstractC8020f0.error_sdcard, new Object[0]);
    }
}
