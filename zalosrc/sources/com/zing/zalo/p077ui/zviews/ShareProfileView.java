package com.zing.zalo.p077ui.zviews;

import ae.C0766k;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import au.AbstractC2364o0;
import au.AbstractC2379w;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.biometric.AbstractC7356u0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.p077ui.widget.CustomRelativeLayout;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zviews.ShareProfileView;
import com.zing.zalo.social.widget.CustomScrollView;
import com.zing.zalo.social.widget.StatusComposeEditText;
import com.zing.zalo.social.widget.StatusComposeInputView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zview.actionbar.ActionBar;
import com.zing.zalo.zview.actionbar.ActionBarMenu;
import ed0.AbstractC18391a;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import is.AbstractC20826v0;
import java.util.ArrayList;
import me0.AbstractC23052e2;
import me0.AbstractC23136l9;
import me0.C23055e5;
import me0.C23212s8;
import me0.C23278z2;
import p172fy.C19171b;
import p262jb.AbstractC21196a;
import p304ks.C21927m;
import p348mi.AbstractC23304d;
import p354n3.C23528a;
import p510sq.C26365a;
import p542ub.InterfaceC27218a;
import p588vw.C28652r;
import p716zh.C31965ic;
import p716zh.C32002l4;
import vg.AbstractC28127m2;
import vg.C28154p2;
import vg.C28203u6;

/* loaded from: classes6.dex */
public class ShareProfileView extends SlidableZaloView {

    /* renamed from: Q0 */
    FrameLayout f77736Q0;

    /* renamed from: R0 */
    StatusComposeEditText f77737R0;

    /* renamed from: S0 */
    StatusComposeInputView f77738S0;

    /* renamed from: T0 */
    CustomScrollView f77739T0;

    /* renamed from: U0 */
    CustomRelativeLayout f77740U0;

    /* renamed from: V0 */
    ViewStub f77741V0;

    /* renamed from: W0 */
    RecyclingImageView f77742W0;

    /* renamed from: X0 */
    RobotoTextView f77743X0;

    /* renamed from: Y0 */
    RobotoTextView f77744Y0;

    /* renamed from: Z0 */
    View f77745Z0;

    /* renamed from: a1 */
    ImageView f77746a1;

    /* renamed from: b1 */
    View f77747b1;

    /* renamed from: c1 */
    String f77748c1;

    /* renamed from: f1 */
    Handler f77751f1;

    /* renamed from: g1 */
    int f77752g1;

    /* renamed from: h1 */
    ArrayList f77753h1;

    /* renamed from: i1 */
    View f77754i1;

    /* renamed from: j1 */
    InterfaceC27218a f77755j1;

    /* renamed from: k1 */
    C23528a f77756k1;

    /* renamed from: l1 */
    ContactProfile f77757l1;

    /* renamed from: P0 */
    final String f77735P0 = ShareProfileView.class.getSimpleName();

    /* renamed from: d1 */
    String f77749d1 = "";

    /* renamed from: e1 */
    String f77750e1 = "";

    /* renamed from: m1 */
    boolean f77758m1 = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.ShareProfileView$a */
    /* loaded from: classes6.dex */
    public class C15074a implements CustomRelativeLayout.InterfaceC13484a {
        C15074a() {
        }

        @Override // com.zing.zalo.p077ui.widget.CustomRelativeLayout.InterfaceC13484a
        /* renamed from: Og */
        public void mo75644Og(int i11, int i12) {
        }

        @Override // com.zing.zalo.p077ui.widget.CustomRelativeLayout.InterfaceC13484a
        /* renamed from: n8 */
        public void mo75645n8(int i11, int i12) {
            if (i11 > 0) {
                try {
                    ShareProfileView.this.f77752g1 = i11;
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.ShareProfileView$b */
    /* loaded from: classes6.dex */
    public class C15075b extends AbstractC18391a {
        C15075b() {
        }

        @Override // ed0.AbstractC18391a, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            try {
                int length = editable.length();
                int i11 = UpdateStatusView.f78642D4;
                if (length > i11) {
                    ToastUtils.showMess(AbstractC23136l9.m118746s0(AbstractC8020f0.str_status_content_limit, Integer.valueOf(i11)));
                    StatusComposeEditText statusComposeEditText = ShareProfileView.this.f77737R0;
                    statusComposeEditText.setText(statusComposeEditText.getText().toString().substring(0, i11));
                    StatusComposeEditText statusComposeEditText2 = ShareProfileView.this.f77737R0;
                    statusComposeEditText2.setSelection(statusComposeEditText2.length());
                }
                C28652r.m143349v().m143361W(editable);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.ShareProfileView$c */
    /* loaded from: classes6.dex */
    public class C15076c implements InterfaceC20094a {
        C15076c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m84386d() {
            try {
                AbstractC2379w.m12430d(ShareProfileView.this.f77737R0);
                ToastUtils.m89272t(AbstractC23136l9.m118743r0(AbstractC8020f0.profile_share_vip_success));
                ShareProfileView.this.f72421L0.mo49315c4();
                AbstractC20826v0.m108770L0(true);
                ShareProfileView.this.f72421L0.finish();
                ShareProfileView.this.m84380lM();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            ShareProfileView.this.f77758m1 = false;
            try {
                ToastUtils.m89264l(c20096c);
                ShareProfileView.this.f72421L0.mo49315c4();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            ShareProfileView shareProfileView = ShareProfileView.this;
            shareProfileView.f77758m1 = false;
            shareProfileView.f77755j1.runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.nk0
                @Override // java.lang.Runnable
                public final void run() {
                    ShareProfileView.C15076c.this.m84386d();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: kM */
    public /* synthetic */ void m84379kM(View view) {
        C21927m.m114302u().m114330e0(this.f77748c1, new TrackingSource(10));
        new C19171b().m101508a(new C19171b.a(this.f77755j1, new C26365a.b(this.f77748c1, C32002l4.m154264g(26)).m135743b(), 0, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lM */
    public void m84380lM() {
        try {
            Bundle m92642L3 = this.f72421L0.m92642L3();
            if (m92642L3 != null && m92642L3.containsKey("extra_action_list_task_id")) {
                AbstractC28127m2 m141613e = AbstractC28127m2.a.m141609d().m141613e(m92642L3.getString("extra_action_list_task_id"));
                if (m141613e instanceof C28154p2) {
                    C28154p2 c28154p2 = (C28154p2) m141613e;
                    c28154p2.f131226e = 1;
                    c28154p2.f131227f = 0;
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        m92637BK(true);
        InterfaceC27218a m92676n2 = this.f72421L0.m92676n2();
        this.f77755j1 = m92676n2;
        this.f77756k1 = new C23528a(m92676n2.getContext());
        this.f77751f1 = new Handler();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: FJ */
    public void mo37482FJ(ActionBarMenu actionBarMenu) {
        try {
            if (actionBarMenu.m92752u(AbstractC6918a0.menu_update_status_send) == null) {
                ((Button) actionBarMenu.m92744k(AbstractC6918a0.menu_update_status_send, AbstractC7409c0.action_bar_menu_item_blue_text_only)).setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_menu_item_finished));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f77754i1 = LayoutInflater.from(this.f72421L0.m92648SI()).inflate(AbstractC7409c0.share_feed_view, (ViewGroup) null);
        m84382jM();
        return this.f77754i1;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: QJ */
    public boolean mo37491QJ(int i11) {
        if (super.mo37491QJ(i11)) {
            return true;
        }
        if (i11 != AbstractC6918a0.menu_update_status_send) {
            return false;
        }
        try {
            m84383mM(this.f77748c1, this.f77737R0.getText().toString());
        } catch (Exception e11) {
            e11.printStackTrace();
            this.f77758m1 = false;
        }
        return true;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        super.mo13886RJ();
        AbstractC2379w.m12430d(this.f77737R0);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: SJ */
    public void mo37118SJ(Bundle bundle) {
        super.mo37118SJ(bundle);
        try {
            if (!TextUtils.isEmpty(this.f77748c1)) {
                bundle.putString("extra_profile_id", this.f77748c1);
            }
            if (!TextUtils.isEmpty(this.f77749d1)) {
                bundle.putString("extra_vip_dpn", this.f77749d1);
            }
            if (!TextUtils.isEmpty(this.f77750e1)) {
                bundle.putString("extra_vip_avt", this.f77750e1);
            }
            String obj = this.f77737R0.getText().toString();
            if (!TextUtils.isEmpty(obj)) {
                bundle.putString("extra_share_message", obj);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: TJ */
    public void mo37493TJ() {
        super.mo37493TJ();
        ActionBar actionBar = this.f88760a0;
        if (actionBar != null) {
            actionBar.setTitle(AbstractC23136l9.m118743r0(AbstractC8020f0.str_optionM_shareVipAccOnTimeLine));
            ActionBar actionBar2 = this.f88760a0;
            actionBar2.setTitleColor(C23212s8.m119607o(actionBar2.getContext(), AbstractC21196a.TextColor1));
            this.f88760a0.setBackgroundResource(AbstractC16803z.bg_postfeed_actionbar);
            this.f88760a0.setBackButtonImage(AbstractC16803z.stencils_ic_head_back);
            this.f88760a0.setItemsBackground(AbstractC7356u0.item_actionbar_background_ripple);
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "ShareProfileView";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: iM */
    public void m84381iM() {
        String str;
        try {
            this.f77753h1 = new ArrayList();
            if (!TextUtils.isEmpty(this.f77748c1)) {
                ContactProfile m141809c = C28203u6.f131407a.m141809c(this.f77748c1);
                this.f77757l1 = m141809c;
                if (m141809c == null) {
                    if (!TextUtils.isEmpty(this.f77748c1) && !TextUtils.isEmpty(this.f77750e1) && !TextUtils.isEmpty(this.f77749d1)) {
                        ContactProfile contactProfile = new ContactProfile();
                        this.f77757l1 = contactProfile;
                        contactProfile.f42434r = this.f77748c1;
                        contactProfile.f42437s = this.f77749d1;
                        contactProfile.f42446v = this.f77750e1;
                        contactProfile.f42352K0 = 1;
                    } else {
                        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.error_general));
                        this.f72421L0.finish();
                        return;
                    }
                }
                int i11 = 0;
                this.f77741V0.setVisibility(0);
                View findViewById = this.f77754i1.findViewById(AbstractC6918a0.layoutPageInfo);
                this.f77745Z0 = findViewById;
                findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.mk0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ShareProfileView.this.m84379kM(view);
                    }
                });
                RecyclingImageView recyclingImageView = (RecyclingImageView) this.f77754i1.findViewById(AbstractC6918a0.imvProfileAvatar);
                this.f77742W0 = recyclingImageView;
                recyclingImageView.setImageDrawable(C23212s8.m119609q(recyclingImageView.getContext(), AbstractC16781w.default_avatar));
                m84384nM();
                RobotoTextView robotoTextView = (RobotoTextView) this.f77754i1.findViewById(AbstractC6918a0.tvProfileUserName);
                this.f77743X0 = robotoTextView;
                robotoTextView.setText(this.f77757l1.m40383Q(true, false));
                Context appContext = MainApplication.getAppContext();
                ContactProfile contactProfile2 = this.f77757l1;
                AbstractC23136l9.m118705e1(appContext, contactProfile2.f42352K0, contactProfile2.f42434r, this.f77743X0);
                RobotoTextView robotoTextView2 = (RobotoTextView) this.f77754i1.findViewById(AbstractC6918a0.tvNumFollow);
                this.f77744Y0 = robotoTextView2;
                if (AbstractC23304d.f113405l.get(this.f77757l1.f42434r) != null) {
                    str = AbstractC23052e2.m118266b(((C31965ic) r1.get(this.f77757l1.f42434r)).m153681a()) + " " + AbstractC23136l9.m118743r0(AbstractC8020f0.profile_num_of_following).toLowerCase();
                } else {
                    str = "";
                }
                robotoTextView2.setText(str);
                ImageView imageView = (ImageView) this.f77754i1.findViewById(AbstractC6918a0.imv_certificate);
                this.f77746a1 = imageView;
                ContactProfile contactProfile3 = this.f77757l1;
                if (contactProfile3 == null || !contactProfile3.m40359B0()) {
                    i11 = 8;
                }
                imageView.setVisibility(i11);
                int dimensionPixelSize = this.f72421L0.m92651WI().getDimensionPixelSize(AbstractC16802y.feed_post_ui_margin);
                this.f77736Q0.setBackgroundResource(AbstractC16803z.rectangle_white);
                this.f77736Q0.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.error_general));
            this.f72421L0.finish();
        }
    }

    /* renamed from: jM */
    void m84382jM() {
        this.f77738S0 = (StatusComposeInputView) this.f77754i1.findViewById(AbstractC6918a0.status_text_container);
        CustomRelativeLayout customRelativeLayout = (CustomRelativeLayout) this.f77754i1.findViewById(AbstractC6918a0.share_vip_root_view);
        this.f77740U0 = customRelativeLayout;
        customRelativeLayout.setLayoutChangeListener(new C15074a());
        this.f77739T0 = (CustomScrollView) this.f77754i1.findViewById(AbstractC6918a0.status_scroll_view);
        this.f77736Q0 = (FrameLayout) this.f77754i1.findViewById(AbstractC6918a0.attachment_containter);
        this.f77741V0 = (ViewStub) this.f77754i1.findViewById(AbstractC6918a0.stub_share_profile);
        StatusComposeEditText statusComposeEditText = (StatusComposeEditText) this.f77754i1.findViewById(AbstractC6918a0.etDesc);
        this.f77737R0 = statusComposeEditText;
        statusComposeEditText.addTextChangedListener(new C15075b());
        View findViewById = this.f77754i1.findViewById(AbstractC6918a0.feed_btn_open_emoji_tab2);
        this.f77747b1 = findViewById;
        findViewById.setVisibility(8);
        StatusComposeEditText statusComposeEditText2 = this.f77737R0;
        if (statusComposeEditText2 != null && statusComposeEditText2.getLayoutParams() != null) {
            ViewGroup.LayoutParams layoutParams = this.f77737R0.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = AbstractC23136l9.m118742r(12.0f);
                this.f77737R0.setLayoutParams(layoutParams);
            }
        }
    }

    /* renamed from: mM */
    void m84383mM(String str, String str2) {
        try {
            if (!C23055e5.m118272g(true) || this.f77758m1) {
                return;
            }
            this.f77758m1 = true;
            this.f72421L0.mo46829Y();
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new C15076c());
            c0766k.mo1591Z9(str, str2, null, null, null);
        } catch (Exception e11) {
            e11.printStackTrace();
            this.f77758m1 = false;
        }
    }

    /* renamed from: nM */
    void m84384nM() {
        try {
            ContactProfile contactProfile = this.f77757l1;
            if (contactProfile != null) {
                String str = contactProfile.f42446v;
                if (!TextUtils.isEmpty(str)) {
                    ((C23528a) this.f77756k1.m123612r(this.f77742W0)).m123618x(str, C23278z2.m120143n());
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 == 4) {
            this.f72421L0.finish();
            return true;
        }
        return super.onKeyUp(i11, keyEvent);
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        m84384nM();
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        try {
            if (bundle != null) {
                this.f77748c1 = bundle.getString("extra_profile_id");
                this.f77749d1 = bundle.getString("extra_vip_dpn");
                this.f77750e1 = bundle.getString("extra_vip_avt");
                String string = bundle.getString("extra_share_message");
                StatusComposeEditText statusComposeEditText = this.f77737R0;
                if (statusComposeEditText != null && string != null) {
                    statusComposeEditText.setText(string);
                    this.f77737R0.setSelection(string.length());
                }
            } else if (this.f72421L0.m92642L3() != null) {
                this.f77748c1 = this.f72421L0.m92642L3().getString("extra_profile_id");
                this.f77749d1 = this.f72421L0.m92642L3().getString("extra_vip_dpn");
                this.f77750e1 = this.f72421L0.m92642L3().getString("extra_vip_avt");
            }
            new Handler().post(new Runnable() { // from class: com.zing.zalo.ui.zviews.lk0
                @Override // java.lang.Runnable
                public final void run() {
                    ShareProfileView.this.m84381iM();
                }
            });
            AbstractC2364o0.m12370m(this.f77737R0, 300L);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
