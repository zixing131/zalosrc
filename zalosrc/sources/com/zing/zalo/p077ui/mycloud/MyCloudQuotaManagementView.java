package com.zing.zalo.p077ui.mycloud;

import ah0.C0860a;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.ZAppCompatImageView;
import b90.EnumC2667d;
import bi0.AbstractC2807a;
import bi0.AbstractC2808b;
import bi0.AbstractC2810d;
import bi0.AbstractC2814h;
import ch0.AbstractC3489d;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.data.zalocloud.model.CloudQuotaUsage;
import com.zing.zalo.data.zalocloud.model.ZCloudQuotaUsage;
import com.zing.zalo.data.zalocloud.model.api.CloudSubscriptionInfo;
import com.zing.zalo.p077ui.chat.rightmenu.C11709f;
import com.zing.zalo.p077ui.chat.rightmenu.ChatInfoView;
import com.zing.zalo.p077ui.chat.rightmenu.InterfaceC11706c;
import com.zing.zalo.p077ui.mycloud.MyCloudQuotaManagementView;
import com.zing.zalo.p077ui.toolstorage.overview.ToolStorageChartView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zalocloud.configs.C16805b;
import com.zing.zalo.zdesign.component.Button;
import com.zing.zalo.zdesign.component.C16972e0;
import com.zing.zalo.zdesign.component.EnumC16952b0;
import com.zing.zalo.zdesign.component.ListItem;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.Arrays;
import java.util.List;
import k30.C21459a;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import me0.C23212s8;
import me0.C23278z2;
import me0.C23283z7;
import mm0.AbstractC23350e;
import og0.C24252c;
import og0.EnumC24251b;
import p304ks.AbstractC21935u;
import p348mi.AbstractC23306f;
import p363nh.C23744a;
import p649xl.C30050t8;
import p649xl.C30101w8;
import qm0.AbstractC25366r;
import qm0.AbstractC25368s;
import ti0.C26705d;
import ti0.C26708g;
import ui0.C27280g;
import vl0.AbstractC28291a;
import ya0.C30876a;
import ya0.C30877b;

/* loaded from: classes6.dex */
public final class MyCloudQuotaManagementView extends ChatInfoView {
    public static final C12498a Companion = new C12498a(null);

    /* renamed from: g1 */
    private C30050t8 f65396g1;

    /* renamed from: h1 */
    private C30101w8 f65397h1;

    /* renamed from: i1 */
    private C16972e0 f65398i1;

    /* renamed from: j1 */
    private InterfaceC12499b f65399j1;

    /* renamed from: com.zing.zalo.ui.mycloud.MyCloudQuotaManagementView$a */
    /* loaded from: classes6.dex */
    public static final class C12498a {
        private C12498a() {
        }

        public /* synthetic */ C12498a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.mycloud.MyCloudQuotaManagementView$b */
    /* loaded from: classes6.dex */
    public interface InterfaceC12499b {
        /* renamed from: a */
        void mo60372a();

        /* renamed from: b */
        void mo60373b();

        /* renamed from: c */
        void mo60374c();
    }

    /* renamed from: mN */
    private final void m70243mN() {
        int i11;
        C30050t8 c30050t8 = this.f65396g1;
        if (c30050t8 == null) {
            AbstractC19074t.m100223u("binding");
            c30050t8 = null;
        }
        RobotoTextView robotoTextView = c30050t8.f139438G;
        if (C24252c.f117152a.m126600f(EnumC24251b.f117147r) && AbstractC3489d.m17511s()) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        robotoTextView.setVisibility(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nN */
    public static final void m70244nN(MyCloudQuotaManagementView myCloudQuotaManagementView) {
        AbstractC19074t.m100208f(myCloudQuotaManagementView, "this$0");
        myCloudQuotaManagementView.m70243mN();
    }

    /* renamed from: oN */
    private final void m70245oN() {
        C30050t8 c30050t8 = this.f65396g1;
        C30101w8 c30101w8 = null;
        if (c30050t8 == null) {
            AbstractC19074t.m100223u("binding");
            c30050t8 = null;
        }
        C30101w8 m148653a = C30101w8.m148653a(c30050t8.f139441J.inflate());
        AbstractC19074t.m100207e(m148653a, "bind(...)");
        this.f65397h1 = m148653a;
        if (m148653a == null) {
            AbstractC19074t.m100223u("myCloudUsageDetailViewBinding");
            m148653a = null;
        }
        m148653a.f139796r.setText(AbstractC23136l9.m118746s0(AbstractC8020f0.str_my_cloud_quota_clean_section_title, AbstractC21935u.m114547n()));
        C30101w8 c30101w82 = this.f65397h1;
        if (c30101w82 == null) {
            AbstractC19074t.m100223u("myCloudUsageDetailViewBinding");
            c30101w82 = null;
        }
        ListItem listItem = c30101w82.f139799u;
        ZAppCompatImageView zAppCompatImageView = new ZAppCompatImageView(listItem.getContext());
        zAppCompatImageView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        Context context = zAppCompatImageView.getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        zAppCompatImageView.setImageDrawable(C27280g.m139660c(context, AbstractC2810d.zds_ic_photo_line_24, AbstractC2807a.icon_tertiary));
        listItem.m90587c(zAppCompatImageView);
        Context m92689tK = m92689tK();
        AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
        RobotoTextView robotoTextView = new RobotoTextView(m92689tK);
        robotoTextView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        Context context2 = robotoTextView.getContext();
        AbstractC19074t.m100207e(context2, "getContext(...)");
        new C26708g(robotoTextView).m137319a(C26705d.m137293a(context2, AbstractC2814h.t_xsmall_m));
        robotoTextView.setTextColor(C23212s8.m119607o(robotoTextView.getContext(), AbstractC2807a.text_tertiary));
        listItem.m90589e(robotoTextView);
        EnumC16952b0 enumC16952b0 = EnumC16952b0.CENTER;
        listItem.setLeadingGravity(enumC16952b0);
        listItem.setTrailingGravity(enumC16952b0);
        listItem.setPadding(AbstractC23222t7.f112586t, AbstractC23222t7.f112566j, AbstractC23222t7.f112586t, AbstractC23222t7.f112566j);
        listItem.m90592m(false);
        listItem.setBackground(null);
        C30101w8 c30101w83 = this.f65397h1;
        if (c30101w83 == null) {
            AbstractC19074t.m100223u("myCloudUsageDetailViewBinding");
            c30101w83 = null;
        }
        ListItem listItem2 = c30101w83.f139800v;
        ZAppCompatImageView zAppCompatImageView2 = new ZAppCompatImageView(listItem2.getContext());
        zAppCompatImageView2.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        Context context3 = zAppCompatImageView2.getContext();
        AbstractC19074t.m100207e(context3, "getContext(...)");
        zAppCompatImageView2.setImageDrawable(C27280g.m139660c(context3, AbstractC2810d.zds_ic_video_2_line_24, AbstractC2807a.icon_tertiary));
        listItem2.m90587c(zAppCompatImageView2);
        Context m92689tK2 = m92689tK();
        AbstractC19074t.m100207e(m92689tK2, "requireContext(...)");
        RobotoTextView robotoTextView2 = new RobotoTextView(m92689tK2);
        robotoTextView2.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        Context context4 = robotoTextView2.getContext();
        AbstractC19074t.m100207e(context4, "getContext(...)");
        new C26708g(robotoTextView2).m137319a(C26705d.m137293a(context4, AbstractC2814h.t_xsmall_m));
        robotoTextView2.setTextColor(C23212s8.m119607o(robotoTextView2.getContext(), AbstractC2807a.text_tertiary));
        listItem2.m90589e(robotoTextView2);
        listItem2.setLeadingGravity(enumC16952b0);
        listItem2.setTrailingGravity(enumC16952b0);
        listItem2.setPadding(AbstractC23222t7.f112586t, AbstractC23222t7.f112566j, AbstractC23222t7.f112586t, AbstractC23222t7.f112566j);
        listItem2.m90592m(false);
        listItem2.setBackground(null);
        C30101w8 c30101w84 = this.f65397h1;
        if (c30101w84 == null) {
            AbstractC19074t.m100223u("myCloudUsageDetailViewBinding");
            c30101w84 = null;
        }
        ListItem listItem3 = c30101w84.f139797s;
        ZAppCompatImageView zAppCompatImageView3 = new ZAppCompatImageView(listItem3.getContext());
        zAppCompatImageView3.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        Context context5 = zAppCompatImageView3.getContext();
        AbstractC19074t.m100207e(context5, "getContext(...)");
        zAppCompatImageView3.setImageDrawable(C27280g.m139660c(context5, AbstractC2810d.zds_ic_file_line_24, AbstractC2807a.icon_tertiary));
        listItem3.m90587c(zAppCompatImageView3);
        Context m92689tK3 = m92689tK();
        AbstractC19074t.m100207e(m92689tK3, "requireContext(...)");
        RobotoTextView robotoTextView3 = new RobotoTextView(m92689tK3);
        robotoTextView3.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        Context context6 = robotoTextView3.getContext();
        AbstractC19074t.m100207e(context6, "getContext(...)");
        new C26708g(robotoTextView3).m137319a(C26705d.m137293a(context6, AbstractC2814h.t_xsmall_m));
        robotoTextView3.setTextColor(C23212s8.m119607o(robotoTextView3.getContext(), AbstractC2807a.text_tertiary));
        listItem3.m90589e(robotoTextView3);
        listItem3.setLeadingGravity(enumC16952b0);
        listItem3.setTrailingGravity(enumC16952b0);
        listItem3.setPadding(AbstractC23222t7.f112586t, AbstractC23222t7.f112566j, AbstractC23222t7.f112586t, AbstractC23222t7.f112566j);
        listItem3.m90592m(false);
        listItem3.setBackground(null);
        C30101w8 c30101w85 = this.f65397h1;
        if (c30101w85 == null) {
            AbstractC19074t.m100223u("myCloudUsageDetailViewBinding");
            c30101w85 = null;
        }
        ListItem listItem4 = c30101w85.f139798t;
        ZAppCompatImageView zAppCompatImageView4 = new ZAppCompatImageView(listItem4.getContext());
        zAppCompatImageView4.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        Context context7 = zAppCompatImageView4.getContext();
        AbstractC19074t.m100207e(context7, "getContext(...)");
        zAppCompatImageView4.setImageDrawable(C27280g.m139660c(context7, AbstractC2810d.zds_ic_more_grid_line_24, AbstractC2807a.icon_tertiary));
        listItem4.m90587c(zAppCompatImageView4);
        Context m92689tK4 = m92689tK();
        AbstractC19074t.m100207e(m92689tK4, "requireContext(...)");
        RobotoTextView robotoTextView4 = new RobotoTextView(m92689tK4);
        robotoTextView4.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        Context context8 = robotoTextView4.getContext();
        AbstractC19074t.m100207e(context8, "getContext(...)");
        new C26708g(robotoTextView4).m137319a(C26705d.m137293a(context8, AbstractC2814h.t_xsmall_m));
        robotoTextView4.setTextColor(C23212s8.m119607o(robotoTextView4.getContext(), AbstractC2807a.text_tertiary));
        listItem4.m90589e(robotoTextView4);
        listItem4.setLeadingGravity(enumC16952b0);
        listItem4.setTrailingGravity(enumC16952b0);
        listItem4.setPadding(AbstractC23222t7.f112586t, AbstractC23222t7.f112566j, AbstractC23222t7.f112586t, AbstractC23222t7.f112566j);
        listItem4.m90592m(false);
        listItem4.setBackground(null);
        C30101w8 c30101w86 = this.f65397h1;
        if (c30101w86 == null) {
            AbstractC19074t.m100223u("myCloudUsageDetailViewBinding");
        } else {
            c30101w8 = c30101w86;
        }
        c30101w8.f139795q.setOnClickListener(new View.OnClickListener() { // from class: u80.z1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyCloudQuotaManagementView.m70246pN(MyCloudQuotaManagementView.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: pN */
    public static final void m70246pN(MyCloudQuotaManagementView myCloudQuotaManagementView, View view) {
        AbstractC19074t.m100208f(myCloudQuotaManagementView, "this$0");
        InterfaceC12499b interfaceC12499b = myCloudQuotaManagementView.f65399j1;
        if (interfaceC12499b != null) {
            interfaceC12499b.mo60372a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: qN */
    public static final void m70247qN(MyCloudQuotaManagementView myCloudQuotaManagementView, View view) {
        AbstractC19074t.m100208f(myCloudQuotaManagementView, "this$0");
        C30050t8 c30050t8 = myCloudQuotaManagementView.f65396g1;
        C30050t8 c30050t82 = null;
        if (c30050t8 == null) {
            AbstractC19074t.m100223u("binding");
            c30050t8 = null;
        }
        c30050t8.f139437F.setVisibility(8);
        C30050t8 c30050t83 = myCloudQuotaManagementView.f65396g1;
        if (c30050t83 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c30050t82 = c30050t83;
        }
        c30050t82.f139453z.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: rN */
    public static final void m70248rN(final MyCloudQuotaManagementView myCloudQuotaManagementView, View view) {
        AbstractC19074t.m100208f(myCloudQuotaManagementView, "this$0");
        Context m92689tK = myCloudQuotaManagementView.m92689tK();
        AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
        C16972e0.a m90932i = new C16972e0.a(m92689tK).m90932i(C16972e0.b.DIALOG_INFORMATION);
        String m118746s0 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_zcloud_connect_to_zcloud, C16805b.Companion.m89811a().m89800f());
        AbstractC19074t.m100207e(m118746s0, "getString(...)");
        myCloudQuotaManagementView.f65398i1 = m90932i.m90918B(m118746s0).m90943t("Kết nối", new InterfaceC17463d.d() { // from class: u80.a2
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                MyCloudQuotaManagementView.m70249sN(MyCloudQuotaManagementView.this, interfaceC17463d, i11);
            }
        }).m90933j(AbstractC8020f0.str_cancel, new InterfaceC17463d.d() { // from class: u80.b2
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                MyCloudQuotaManagementView.m70250tN(interfaceC17463d, i11);
            }
        }).m90923G();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sN */
    public static final void m70249sN(MyCloudQuotaManagementView myCloudQuotaManagementView, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(myCloudQuotaManagementView, "this$0");
        try {
            InterfaceC11706c m65200wM = myCloudQuotaManagementView.m65200wM();
            AbstractC19074t.m100206d(m65200wM, "null cannot be cast to non-null type com.zing.zalo.ui.chat.rightmenu.ChatInfoFileTransferPresenter");
            ((C11709f) m65200wM).m65261pq();
        } catch (Exception e11) {
            AbstractC23350e.m122776f("CommonZaloview", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: tN */
    public static final void m70250tN(InterfaceC17463d interfaceC17463d, int i11) {
        interfaceC17463d.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: uN */
    public static final void m70251uN(MyCloudQuotaManagementView myCloudQuotaManagementView, View view) {
        AbstractC19074t.m100208f(myCloudQuotaManagementView, "this$0");
        InterfaceC12499b interfaceC12499b = myCloudQuotaManagementView.f65399j1;
        if (interfaceC12499b != null) {
            interfaceC12499b.mo60372a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: vN */
    public static final void m70252vN(MyCloudQuotaManagementView myCloudQuotaManagementView, View view) {
        AbstractC19074t.m100208f(myCloudQuotaManagementView, "this$0");
        InterfaceC12499b interfaceC12499b = myCloudQuotaManagementView.f65399j1;
        if (interfaceC12499b != null) {
            interfaceC12499b.mo60373b();
        }
    }

    @Override // com.zing.zalo.p077ui.chat.rightmenu.ChatInfoView
    /* renamed from: AM */
    public void mo65154AM() {
    }

    @Override // com.zing.zalo.p077ui.chat.rightmenu.ChatInfoView, com.zing.zalo.p077ui.chat.rightmenu.InterfaceC11707d
    /* renamed from: Ac */
    public void mo65155Ac(ZCloudQuotaUsage zCloudQuotaUsage) {
        int m119606n;
        List m131496e;
        AbstractC19074t.m100208f(zCloudQuotaUsage, "cloudQuotaUsage");
        C30050t8 c30050t8 = this.f65396g1;
        C30050t8 c30050t82 = null;
        if (c30050t8 == null) {
            AbstractC19074t.m100223u("binding");
            c30050t8 = null;
        }
        RobotoTextView robotoTextView = c30050t8.f139439H;
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_my_cloud_quota_usage);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        String format = String.format(m118743r0, Arrays.copyOf(new Object[]{C21459a.m111038f(zCloudQuotaUsage.m41253k(), 0, 2, null), C21459a.m111038f(zCloudQuotaUsage.m41252j(), 0, 2, null)}, 2));
        AbstractC19074t.m100207e(format, "format(...)");
        robotoTextView.setText(format);
        C30050t8 c30050t83 = this.f65396g1;
        if (c30050t83 == null) {
            AbstractC19074t.m100223u("binding");
            c30050t83 = null;
        }
        RobotoTextView robotoTextView2 = c30050t83.f139439H;
        if (zCloudQuotaUsage.m41256n()) {
            m119606n = C23212s8.m119606n(AbstractC2807a.error_text);
        } else {
            m119606n = C23212s8.m119606n(AbstractC2807a.TextColor2);
        }
        robotoTextView2.setTextColor(m119606n);
        if (zCloudQuotaUsage.m41255m()) {
            C30050t8 c30050t84 = this.f65396g1;
            if (c30050t84 == null) {
                AbstractC19074t.m100223u("binding");
                c30050t84 = null;
            }
            ToolStorageChartView toolStorageChartView = c30050t84.f139450w;
            String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_my_cloud_quota_error_state);
            AbstractC19074t.m100207e(m118743r02, "getString(...)");
            m131496e = AbstractC25366r.m131496e(new C30876a(m118743r02, C23212s8.m119611s(getContext(), AbstractC2807a.storage_legend_empty), 1L, C23212s8.m119611s(getContext(), AbstractC2807a.error_text), false, false, null, 80, null));
            toolStorageChartView.setStorageBreakdown(new C30877b(m131496e));
        } else {
            C30050t8 c30050t85 = this.f65396g1;
            if (c30050t85 == null) {
                AbstractC19074t.m100223u("binding");
                c30050t85 = null;
            }
            c30050t85.f139450w.m75330X(zCloudQuotaUsage, ToolStorageChartView.EnumC13436b.f68803p);
        }
        if (this.f65397h1 == null) {
            m70245oN();
        }
        if (AbstractC3489d.m17504l()) {
            C30101w8 c30101w8 = this.f65397h1;
            if (c30101w8 == null) {
                AbstractC19074t.m100223u("myCloudUsageDetailViewBinding");
                c30101w8 = null;
            }
            c30101w8.getRoot().setVisibility(8);
        } else {
            C30101w8 c30101w82 = this.f65397h1;
            if (c30101w82 == null) {
                AbstractC19074t.m100223u("myCloudUsageDetailViewBinding");
                c30101w82 = null;
            }
            c30101w82.getRoot().setVisibility(0);
            C30101w8 c30101w83 = this.f65397h1;
            if (c30101w83 == null) {
                AbstractC19074t.m100223u("myCloudUsageDetailViewBinding");
                c30101w83 = null;
            }
            View trailingItem = c30101w83.f139799u.getTrailingItem();
            if (trailingItem != null) {
                if (!(trailingItem instanceof RobotoTextView)) {
                    trailingItem = null;
                }
                if (trailingItem != null) {
                    ((RobotoTextView) trailingItem).setText(C21459a.m111038f(zCloudQuotaUsage.m41250h(), 0, 2, null));
                }
            }
            C30101w8 c30101w84 = this.f65397h1;
            if (c30101w84 == null) {
                AbstractC19074t.m100223u("myCloudUsageDetailViewBinding");
                c30101w84 = null;
            }
            View trailingItem2 = c30101w84.f139800v.getTrailingItem();
            if (trailingItem2 != null) {
                if (!(trailingItem2 instanceof RobotoTextView)) {
                    trailingItem2 = null;
                }
                if (trailingItem2 != null) {
                    ((RobotoTextView) trailingItem2).setText(C21459a.m111038f(zCloudQuotaUsage.m41254l(), 0, 2, null));
                }
            }
            C30101w8 c30101w85 = this.f65397h1;
            if (c30101w85 == null) {
                AbstractC19074t.m100223u("myCloudUsageDetailViewBinding");
                c30101w85 = null;
            }
            View trailingItem3 = c30101w85.f139797s.getTrailingItem();
            if (trailingItem3 != null) {
                if (!(trailingItem3 instanceof RobotoTextView)) {
                    trailingItem3 = null;
                }
                if (trailingItem3 != null) {
                    ((RobotoTextView) trailingItem3).setText(C21459a.m111038f(zCloudQuotaUsage.m41248f(), 0, 2, null));
                }
            }
            C30101w8 c30101w86 = this.f65397h1;
            if (c30101w86 == null) {
                AbstractC19074t.m100223u("myCloudUsageDetailViewBinding");
                c30101w86 = null;
            }
            View trailingItem4 = c30101w86.f139798t.getTrailingItem();
            if (trailingItem4 != null) {
                if (!(trailingItem4 instanceof RobotoTextView)) {
                    trailingItem4 = null;
                }
                if (trailingItem4 != null) {
                    ((RobotoTextView) trailingItem4).setText(C21459a.m111038f(zCloudQuotaUsage.m41249g(), 0, 2, null));
                }
            }
        }
        C30050t8 c30050t86 = this.f65396g1;
        if (c30050t86 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c30050t82 = c30050t86;
        }
        c30050t82.f139451x.setVisibility(8);
    }

    @Override // com.zing.zalo.p077ui.chat.rightmenu.ChatInfoView
    /* renamed from: EM */
    public void mo65158EM() {
        long j11;
        int i11;
        List m131496e;
        C30050t8 c30050t8 = this.f65396g1;
        C30050t8 c30050t82 = null;
        if (c30050t8 == null) {
            AbstractC19074t.m100223u("binding");
            c30050t8 = null;
        }
        RobotoTextView robotoTextView = c30050t8.f139444q;
        int i12 = AbstractC8020f0.str_stored_on_zcloud;
        C16805b.b bVar = C16805b.Companion;
        robotoTextView.setText(AbstractC23136l9.m118746s0(i12, bVar.m89811a().m89800f()));
        C30050t8 c30050t83 = this.f65396g1;
        if (c30050t83 == null) {
            AbstractC19074t.m100223u("binding");
            c30050t83 = null;
        }
        c30050t83.f139446s.setText(AbstractC23136l9.m118746s0(AbstractC8020f0.str_title_connect_zcloud_for_my_cloud, bVar.m89811a().m89800f()));
        C30050t8 c30050t84 = this.f65396g1;
        if (c30050t84 == null) {
            AbstractC19074t.m100223u("binding");
            c30050t84 = null;
        }
        RobotoTextView robotoTextView2 = c30050t84.f139445r;
        int i13 = AbstractC8020f0.str_desc_connect_zcloud_for_my_cloud;
        Object[] objArr = new Object[1];
        CloudSubscriptionInfo m2458h = AbstractC23306f.m120691m2().m2458h();
        if (m2458h != null) {
            j11 = m2458h.m41320d();
        } else {
            j11 = 0;
        }
        objArr[0] = C21459a.m111038f(j11, 0, 2, null);
        robotoTextView2.setText(AbstractC23136l9.m118746s0(i13, objArr));
        C30050t8 c30050t85 = this.f65396g1;
        if (c30050t85 == null) {
            AbstractC19074t.m100223u("binding");
            c30050t85 = null;
        }
        c30050t85.f139449v.setText(AbstractC23136l9.m118746s0(AbstractC8020f0.str_zcloud_connect_to_zcloud, bVar.m89811a().m89800f()));
        C30050t8 c30050t86 = this.f65396g1;
        if (c30050t86 == null) {
            AbstractC19074t.m100223u("binding");
            c30050t86 = null;
        }
        c30050t86.f139448u.setOnClickListener(new View.OnClickListener() { // from class: u80.u1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyCloudQuotaManagementView.m70247qN(MyCloudQuotaManagementView.this, view);
            }
        });
        C30050t8 c30050t87 = this.f65396g1;
        if (c30050t87 == null) {
            AbstractC19074t.m100223u("binding");
            c30050t87 = null;
        }
        c30050t87.f139449v.setOnClickListener(new View.OnClickListener() { // from class: u80.v1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyCloudQuotaManagementView.m70248rN(MyCloudQuotaManagementView.this, view);
            }
        });
        C30050t8 c30050t88 = this.f65396g1;
        if (c30050t88 == null) {
            AbstractC19074t.m100223u("binding");
            c30050t88 = null;
        }
        ToolStorageChartView toolStorageChartView = c30050t88.f139450w;
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_my_cloud_quota_calculting_state);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        if (C23212s8.m119603k()) {
            i11 = AbstractC2808b.ng20;
        } else {
            i11 = AbstractC2808b.ng80;
        }
        m131496e = AbstractC25366r.m131496e(new C30876a(m118743r0, i11, 1L, 0, false, false, null, 88, null));
        toolStorageChartView.setStorageBreakdown(new C30877b(m131496e));
        C30050t8 c30050t89 = this.f65396g1;
        if (c30050t89 == null) {
            AbstractC19074t.m100223u("binding");
            c30050t89 = null;
        }
        c30050t89.f139439H.setText("");
        C30050t8 c30050t810 = this.f65396g1;
        if (c30050t810 == null) {
            AbstractC19074t.m100223u("binding");
            c30050t810 = null;
        }
        c30050t810.f139447t.setOnClickListener(new View.OnClickListener() { // from class: u80.w1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyCloudQuotaManagementView.m70251uN(MyCloudQuotaManagementView.this, view);
            }
        });
        C30050t8 c30050t811 = this.f65396g1;
        if (c30050t811 == null) {
            AbstractC19074t.m100223u("binding");
            c30050t811 = null;
        }
        ZdsActionBar zdsActionBar = c30050t811.f139442K;
        String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_my_cloud_quota_action_bar);
        AbstractC19074t.m100207e(m118743r02, "getString(...)");
        String format = String.format(m118743r02, Arrays.copyOf(new Object[]{AbstractC21935u.m114547n()}, 1));
        AbstractC19074t.m100207e(format, "format(...)");
        zdsActionBar.setMiddleTitle(format);
        if (!TextUtils.isEmpty(AbstractC23306f.m120583H().m110204g().f110055I)) {
            C30050t8 c30050t812 = this.f65396g1;
            if (c30050t812 == null) {
                AbstractC19074t.m100223u("binding");
                c30050t812 = null;
            }
            c30050t812.f139442K.setOnClickListenerTrailingButton(new View.OnClickListener() { // from class: u80.x1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MyCloudQuotaManagementView.m70252vN(MyCloudQuotaManagementView.this, view);
                }
            });
        } else {
            C30050t8 c30050t813 = this.f65396g1;
            if (c30050t813 == null) {
                AbstractC19074t.m100223u("binding");
                c30050t813 = null;
            }
            Button trailingButton = c30050t813.f139442K.getTrailingButton();
            if (trailingButton != null) {
                trailingButton.setVisibility(8);
            }
        }
        C30050t8 c30050t814 = this.f65396g1;
        if (c30050t814 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c30050t82 = c30050t814;
        }
        RobotoTextView robotoTextView3 = c30050t82.f139452y;
        String m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_my_cloud_quota_clean_section_title);
        AbstractC19074t.m100207e(m118743r03, "getString(...)");
        String format2 = String.format(m118743r03, Arrays.copyOf(new Object[]{AbstractC21935u.m114547n()}, 1));
        AbstractC19074t.m100207e(format2, "format(...)");
        robotoTextView3.setText(format2);
        mo65163K6();
    }

    @Override // com.zing.zalo.p077ui.chat.rightmenu.ChatInfoView, com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C30050t8 m148531c = C30050t8.m148531c(layoutInflater, viewGroup, false);
        AbstractC19074t.m100207e(m148531c, "inflate(...)");
        this.f65396g1 = m148531c;
        if (m92692wK().mo35576n3()) {
            m65171UM();
            mo65158EM();
            mo65154AM();
            mo65183d0();
        }
        C30050t8 c30050t8 = this.f65396g1;
        if (c30050t8 == null) {
            AbstractC19074t.m100223u("binding");
            c30050t8 = null;
        }
        LinearLayout root = c30050t8.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: JJ */
    public void mo37484JJ() {
        super.mo37484JJ();
        C16972e0 c16972e0 = this.f65398i1;
        if (c16972e0 != null && c16972e0.m92868m()) {
            c16972e0.dismiss();
        }
    }

    @Override // com.zing.zalo.p077ui.chat.rightmenu.ChatInfoView, com.zing.zalo.p077ui.chat.rightmenu.InterfaceC11707d
    /* renamed from: K6 */
    public void mo65163K6() {
        C30050t8 c30050t8 = null;
        if (C24252c.f117152a.m126600f(EnumC24251b.f117147r)) {
            C30050t8 c30050t82 = this.f65396g1;
            if (c30050t82 == null) {
                AbstractC19074t.m100223u("binding");
                c30050t82 = null;
            }
            c30050t82.f139444q.setVisibility(0);
            C30050t8 c30050t83 = this.f65396g1;
            if (c30050t83 == null) {
                AbstractC19074t.m100223u("binding");
                c30050t83 = null;
            }
            c30050t83.f139437F.setVisibility(8);
            C30050t8 c30050t84 = this.f65396g1;
            if (c30050t84 == null) {
                AbstractC19074t.m100223u("binding");
                c30050t84 = null;
            }
            c30050t84.f139453z.setVisibility(8);
            C30050t8 c30050t85 = this.f65396g1;
            if (c30050t85 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c30050t8 = c30050t85;
            }
            c30050t8.f139440I.setText(AbstractC23136l9.m118746s0(AbstractC8020f0.str_zcloud_chart_title, C16805b.Companion.m89811a().m89800f()));
            return;
        }
        C30050t8 c30050t86 = this.f65396g1;
        if (c30050t86 == null) {
            AbstractC19074t.m100223u("binding");
            c30050t86 = null;
        }
        c30050t86.f139444q.setVisibility(8);
        C30050t8 c30050t87 = this.f65396g1;
        if (c30050t87 == null) {
            AbstractC19074t.m100223u("binding");
            c30050t87 = null;
        }
        c30050t87.f139440I.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_my_cloud_quota_chart_title));
        if (AbstractC3489d.m17501i() && C0860a.Companion.m2473a().m2459i() != 100) {
            C30050t8 c30050t88 = this.f65396g1;
            if (c30050t88 == null) {
                AbstractC19074t.m100223u("binding");
                c30050t88 = null;
            }
            c30050t88.f139437F.setVisibility(0);
            C30050t8 c30050t89 = this.f65396g1;
            if (c30050t89 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c30050t8 = c30050t89;
            }
            c30050t8.f139453z.setVisibility(0);
            return;
        }
        C30050t8 c30050t810 = this.f65396g1;
        if (c30050t810 == null) {
            AbstractC19074t.m100223u("binding");
            c30050t810 = null;
        }
        c30050t810.f139437F.setVisibility(8);
        C30050t8 c30050t811 = this.f65396g1;
        if (c30050t811 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c30050t8 = c30050t811;
        }
        c30050t8.f139453z.setVisibility(8);
    }

    @Override // com.zing.zalo.p077ui.chat.rightmenu.ChatInfoView, com.zing.zalo.zview.ZaloView
    /* renamed from: KJ */
    public void mo40200KJ() {
        super.mo40200KJ();
        C23744a.b bVar = C23744a.Companion;
        bVar.m124119a().m124117e(this, 150802);
        bVar.m124119a().m124117e(this, 150804);
        bVar.m124119a().m124117e(this, 150810);
    }

    @Override // com.zing.zalo.p077ui.chat.rightmenu.ChatInfoView, com.zing.zalo.p077ui.chat.rightmenu.InterfaceC11707d
    /* renamed from: Mv */
    public void mo65165Mv(EnumC2667d enumC2667d) {
        AbstractC19074t.m100208f(enumC2667d, "state");
        C30050t8 c30050t8 = null;
        if (enumC2667d.m13109h() <= 0) {
            C30050t8 c30050t82 = this.f65396g1;
            if (c30050t82 == null) {
                AbstractC19074t.m100223u("binding");
                c30050t82 = null;
            }
            c30050t82.f139439H.setText("");
            C30050t8 c30050t83 = this.f65396g1;
            if (c30050t83 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c30050t8 = c30050t83;
            }
            c30050t8.f139447t.setEnabled(false);
            return;
        }
        C30050t8 c30050t84 = this.f65396g1;
        if (c30050t84 == null) {
            AbstractC19074t.m100223u("binding");
            c30050t84 = null;
        }
        RobotoTextView robotoTextView = c30050t84.f139439H;
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_my_cloud_quota_usage);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        String format = String.format(m118743r0, Arrays.copyOf(new Object[]{C21459a.m111038f(enumC2667d.m13107e(), 0, 2, null), C21459a.m111038f(enumC2667d.m13109h(), 0, 2, null)}, 2));
        AbstractC19074t.m100207e(format, "format(...)");
        robotoTextView.setText(format);
        C30050t8 c30050t85 = this.f65396g1;
        if (c30050t85 == null) {
            AbstractC19074t.m100223u("binding");
            c30050t85 = null;
        }
        c30050t85.f139439H.setTextColor(enumC2667d.mo13111j());
        C30050t8 c30050t86 = this.f65396g1;
        if (c30050t86 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c30050t8 = c30050t86;
        }
        c30050t8.f139447t.setEnabled(true);
    }

    @Override // com.zing.zalo.p077ui.chat.rightmenu.ChatInfoView, com.zing.zalo.p077ui.chat.rightmenu.InterfaceC11707d
    /* renamed from: db */
    public void mo65184db(boolean z11, CharSequence charSequence) {
        AbstractC19074t.m100208f(charSequence, "desc");
        C30050t8 c30050t8 = this.f65396g1;
        if (c30050t8 == null) {
            AbstractC19074t.m100223u("binding");
            c30050t8 = null;
        }
        c30050t8.f139434C.setText(charSequence);
    }

    @Override // com.zing.zalo.p077ui.chat.rightmenu.ChatInfoView, com.zing.zalo.p077ui.chat.rightmenu.InterfaceC11707d
    /* renamed from: hf */
    public void mo65187hf(CharSequence charSequence, boolean z11) {
        AbstractC19074t.m100208f(charSequence, "name");
        C30050t8 c30050t8 = this.f65396g1;
        if (c30050t8 == null) {
            AbstractC19074t.m100223u("binding");
            c30050t8 = null;
        }
        c30050t8.f139436E.setText(charSequence);
    }

    @Override // com.zing.zalo.p077ui.chat.rightmenu.ChatInfoView, com.zing.zalo.p077ui.chat.rightmenu.InterfaceC11707d
    /* renamed from: iA */
    public void mo65188iA(boolean z11) {
        if (z11) {
            InterfaceC12499b interfaceC12499b = this.f65399j1;
            if (interfaceC12499b != null) {
                interfaceC12499b.mo60374c();
                return;
            }
            return;
        }
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_zcloud_setup_error);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        Context m92689tK = m92689tK();
        AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
        C23283z7.m120376i(this, m118743r0, C27280g.m139660c(m92689tK, AbstractC2810d.zds_ic_close_circle_solid_24, AbstractC2807a.snackbar_custom_color_red), Integer.valueOf(AbstractC23222t7.f112586t));
    }

    @Override // com.zing.zalo.p077ui.chat.rightmenu.ChatInfoView, com.zing.zalo.p077ui.chat.rightmenu.InterfaceC11707d
    /* renamed from: jp */
    public void mo65190jp(String str) {
        AbstractC19074t.m100208f(str, "avt");
        C30050t8 c30050t8 = this.f65396g1;
        C30050t8 c30050t82 = null;
        if (c30050t8 == null) {
            AbstractC19074t.m100223u("binding");
            c30050t8 = null;
        }
        c30050t8.f139432A.setImageOption(C23278z2.m120143n());
        C30050t8 c30050t83 = this.f65396g1;
        if (c30050t83 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c30050t82 = c30050t83;
        }
        c30050t82.f139432A.m75732d(str);
    }

    @Override // com.zing.zalo.p077ui.chat.rightmenu.ChatInfoView, com.zing.zalo.p077ui.chat.rightmenu.InterfaceC11707d
    /* renamed from: v9 */
    public void mo65197v9(CloudQuotaUsage cloudQuotaUsage) {
        List m131505m;
        List m131496e;
        List m131496e2;
        AbstractC19074t.m100208f(cloudQuotaUsage, "cloudQuotaUsage");
        C30050t8 c30050t8 = null;
        if (cloudQuotaUsage.m41234j()) {
            C30050t8 c30050t82 = this.f65396g1;
            if (c30050t82 == null) {
                AbstractC19074t.m100223u("binding");
                c30050t82 = null;
            }
            ToolStorageChartView toolStorageChartView = c30050t82.f139450w;
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_my_cloud_quota_error_state);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            m131496e2 = AbstractC25366r.m131496e(new C30876a(m118743r0, C23212s8.m119610r(AbstractC28291a.storage_legend_empty), 1L, C23212s8.m119610r(AbstractC2807a.error_text), false, false, null, 80, null));
            toolStorageChartView.setStorageBreakdown(new C30877b(m131496e2));
        } else if (!cloudQuotaUsage.m41236l()) {
            C30050t8 c30050t83 = this.f65396g1;
            if (c30050t83 == null) {
                AbstractC19074t.m100223u("binding");
                c30050t83 = null;
            }
            ToolStorageChartView toolStorageChartView2 = c30050t83.f139450w;
            String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_my_cloud_quota_calculting_state);
            AbstractC19074t.m100207e(m118743r02, "getString(...)");
            m131496e = AbstractC25366r.m131496e(new C30876a(m118743r02, C23212s8.m119610r(AbstractC28291a.storage_legend_empty), 1L, 0, false, false, null, 88, null));
            toolStorageChartView2.setStorageBreakdown(new C30877b(m131496e));
        } else {
            long m41231g = (((cloudQuotaUsage.m41231g() - cloudQuotaUsage.m41230f()) - cloudQuotaUsage.m41233i()) - cloudQuotaUsage.m41228d()) - cloudQuotaUsage.m41229e();
            C30050t8 c30050t84 = this.f65396g1;
            if (c30050t84 == null) {
                AbstractC19074t.m100223u("binding");
                c30050t84 = null;
            }
            ToolStorageChartView toolStorageChartView3 = c30050t84.f139450w;
            String m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_my_cloud_quota_photo_size);
            AbstractC19074t.m100207e(m118743r03, "getString(...)");
            String m118743r04 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_my_cloud_quota_video_size);
            AbstractC19074t.m100207e(m118743r04, "getString(...)");
            String m118743r05 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_my_cloud_quota_file_size);
            AbstractC19074t.m100207e(m118743r05, "getString(...)");
            String m118743r06 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_my_cloud_quota_other_size);
            AbstractC19074t.m100207e(m118743r06, "getString(...)");
            m131505m = AbstractC25368s.m131505m(new C30876a(m118743r03, C23212s8.m119610r(AbstractC28291a.storage_legend_orange), cloudQuotaUsage.m41230f(), 0, false, false, null, 120, null), new C30876a(m118743r04, C23212s8.m119610r(AbstractC28291a.storage_legend_green), cloudQuotaUsage.m41233i(), 0, false, false, null, 120, null), new C30876a(m118743r05, C23212s8.m119610r(AbstractC28291a.storage_legend_yellow), cloudQuotaUsage.m41228d(), 0, false, false, null, 120, null), new C30876a(m118743r06, C23212s8.m119610r(AbstractC28291a.storage_legend_gray), cloudQuotaUsage.m41229e(), 0, false, false, null, 120, null), new C30876a("", C23212s8.m119610r(AbstractC28291a.storage_legend_empty), m41231g, 0, false, false, null, 72, null));
            toolStorageChartView3.setStorageBreakdown(new C30877b(m131505m));
        }
        C30101w8 c30101w8 = this.f65397h1;
        if (c30101w8 != null) {
            if (c30101w8 == null) {
                AbstractC19074t.m100223u("myCloudUsageDetailViewBinding");
                c30101w8 = null;
            }
            c30101w8.getRoot().setVisibility(8);
        }
        C30050t8 c30050t85 = this.f65396g1;
        if (c30050t85 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c30050t8 = c30050t85;
        }
        c30050t8.f139451x.setVisibility(0);
    }

    /* renamed from: wN */
    public final void m70253wN(InterfaceC12499b interfaceC12499b) {
        AbstractC19074t.m100208f(interfaceC12499b, "myCloudQuotaManagementListener");
        this.f65399j1 = interfaceC12499b;
    }

    @Override // com.zing.zalo.p077ui.chat.rightmenu.ChatInfoView, com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        AbstractC19074t.m100208f(objArr, "args");
        if (i11 != 150802) {
            if (i11 != 150804) {
                if (i11 == 150810) {
                    mo65183d0();
                    return;
                }
                return;
            } else {
                InterfaceC11706c m65200wM = m65200wM();
                AbstractC19074t.m100206d(m65200wM, "null cannot be cast to non-null type com.zing.zalo.ui.chat.rightmenu.ChatInfoFileTransferPresenter");
                ((C11709f) m65200wM).m65262qq();
                return;
            }
        }
        mo70710wy(new Runnable() { // from class: u80.y1
            @Override // java.lang.Runnable
            public final void run() {
                MyCloudQuotaManagementView.m70244nN(MyCloudQuotaManagementView.this);
            }
        });
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: zJ */
    public void mo40210zJ(ZaloActivity zaloActivity) {
        super.mo40210zJ(zaloActivity);
        C23744a.b bVar = C23744a.Companion;
        bVar.m124119a().m124115b(this, 150802);
        bVar.m124119a().m124115b(this, 150804);
        bVar.m124119a().m124115b(this, 150810);
    }
}
