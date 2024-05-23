package com.zing.zalo.p077ui.zalocloud.home;

import ac.C0697c0;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.ZAppCompatImageView;
import androidx.lifecycle.C1802w0;
import androidx.lifecycle.C1808z0;
import androidx.lifecycle.InterfaceC1756a1;
import androidx.lifecycle.InterfaceC1764d0;
import bi0.AbstractC2807a;
import bi0.AbstractC2808b;
import bi0.AbstractC2810d;
import bi0.AbstractC2814h;
import ch0.AbstractC3489d;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.data.zalocloud.model.ZCloudQuotaUsage;
import com.zing.zalo.p077ui.toolstorage.detail.ToolStorageDetailPage;
import com.zing.zalo.p077ui.toolstorage.detail.ToolStorageDetailView;
import com.zing.zalo.p077ui.toolstorage.overview.ToolStorageChartView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zalocloud.home.MyCloudManagementView;
import com.zing.zalo.p077ui.zviews.SlidableZaloView;
import com.zing.zalo.zalocloud.configs.C16805b;
import com.zing.zalo.zdesign.component.Button;
import com.zing.zalo.zdesign.component.C16972e0;
import com.zing.zalo.zdesign.component.EnumC16952b0;
import com.zing.zalo.zdesign.component.ListItem;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import com.zing.zalo.zview.AbstractC17501r0;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19061k0;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.InterfaceC19066n;
import java.util.Arrays;
import java.util.List;
import k30.C21459a;
import kc0.C21666e;
import kc0.C21667f;
import me0.AbstractC23136l9;
import me0.AbstractC23152n3;
import me0.AbstractC23222t7;
import me0.C23212s8;
import me0.C23278z2;
import og0.C24252c;
import og0.EnumC24251b;
import p304ks.AbstractC21935u;
import p348mi.AbstractC23306f;
import p363nh.C23744a;
import p649xl.C30050t8;
import p649xl.C30101w8;
import pm0.C24848g0;
import pm0.InterfaceC24847g;
import pm0.InterfaceC24854k;
import qm0.AbstractC25366r;
import tg0.C26676b;
import ti0.C26705d;
import ti0.C26708g;
import ui0.C27280g;
import ya0.C30876a;
import ya0.C30877b;

/* loaded from: classes6.dex */
public final class MyCloudManagementView extends SlidableZaloView {
    public static final C13892a Companion = new C13892a(null);

    /* renamed from: P0 */
    private C30050t8 f71636P0;

    /* renamed from: Q0 */
    private C30101w8 f71637Q0;

    /* renamed from: R0 */
    private C16972e0 f71638R0;

    /* renamed from: S0 */
    private final InterfaceC24854k f71639S0 = AbstractC17501r0.m93124a(this, AbstractC19061k0.m100169b(C21666e.class), new C13897f(new C13896e(this)), C13898g.f71645q);

    /* renamed from: com.zing.zalo.ui.zalocloud.home.MyCloudManagementView$a */
    /* loaded from: classes6.dex */
    public static final class C13892a {
        private C13892a() {
        }

        public /* synthetic */ C13892a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.home.MyCloudManagementView$b */
    /* loaded from: classes6.dex */
    public static final class C13893b extends AbstractC19075u implements InterfaceC18505l {
        C13893b() {
            super(1);
        }

        /* renamed from: a */
        public final void m77297a(ContactProfile contactProfile) {
            MyCloudManagementView myCloudManagementView = MyCloudManagementView.this;
            String str = contactProfile.f42446v;
            AbstractC19074t.m100207e(str, "avt");
            myCloudManagementView.m77285jp(str);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m77297a((ContactProfile) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.home.MyCloudManagementView$c */
    /* loaded from: classes6.dex */
    public static final class C13894c extends AbstractC19075u implements InterfaceC18505l {
        C13894c() {
            super(1);
        }

        /* renamed from: a */
        public final void m77298a(ZCloudQuotaUsage zCloudQuotaUsage) {
            MyCloudManagementView myCloudManagementView = MyCloudManagementView.this;
            AbstractC19074t.m100205c(zCloudQuotaUsage);
            myCloudManagementView.m77280Ac(zCloudQuotaUsage);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m77298a((ZCloudQuotaUsage) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.home.MyCloudManagementView$d */
    /* loaded from: classes6.dex */
    public static final class C13895d implements InterfaceC1764d0, InterfaceC19066n {

        /* renamed from: p */
        private final /* synthetic */ InterfaceC18505l f71642p;

        C13895d(InterfaceC18505l interfaceC18505l) {
            AbstractC19074t.m100208f(interfaceC18505l, "function");
            this.f71642p = interfaceC18505l;
        }

        @Override // fn0.InterfaceC19066n
        /* renamed from: c */
        public final InterfaceC24847g mo9368c() {
            return this.f71642p;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC1764d0) && (obj instanceof InterfaceC19066n)) {
                return AbstractC19074t.m100204b(mo9368c(), ((InterfaceC19066n) obj).mo9368c());
            }
            return false;
        }

        public final int hashCode() {
            return mo9368c().hashCode();
        }

        @Override // androidx.lifecycle.InterfaceC1764d0
        /* renamed from: qp */
        public final /* synthetic */ void mo8524qp(Object obj) {
            this.f71642p.mo205i9(obj);
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.home.MyCloudManagementView$e */
    /* loaded from: classes6.dex */
    public static final class C13896e extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ ZaloView f71643q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13896e(ZaloView zaloView) {
            super(0);
            this.f71643q = zaloView;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final ZaloView mo12V4() {
            return this.f71643q;
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.home.MyCloudManagementView$f */
    /* loaded from: classes6.dex */
    public static final class C13897f extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ InterfaceC18494a f71644q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13897f(InterfaceC18494a interfaceC18494a) {
            super(0);
            this.f71644q = interfaceC18494a;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C1808z0 mo12V4() {
            C1808z0 mo4644Oc = ((InterfaceC1756a1) this.f71644q.mo12V4()).mo4644Oc();
            AbstractC19074t.m100207e(mo4644Oc, "ownerProducer().viewModelStore");
            return mo4644Oc;
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.home.MyCloudManagementView$g */
    /* loaded from: classes6.dex */
    static final class C13898g extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C13898g f71645q = new C13898g();

        C13898g() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C1802w0.b mo12V4() {
            return C21667f.Companion.m111682a();
        }
    }

    /* renamed from: Ac */
    public final void m77280Ac(ZCloudQuotaUsage zCloudQuotaUsage) {
        int m119606n;
        List m131496e;
        C30050t8 c30050t8 = this.f71636P0;
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
        C30050t8 c30050t83 = this.f71636P0;
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
            C30050t8 c30050t84 = this.f71636P0;
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
            C30050t8 c30050t85 = this.f71636P0;
            if (c30050t85 == null) {
                AbstractC19074t.m100223u("binding");
                c30050t85 = null;
            }
            c30050t85.f139450w.m75330X(zCloudQuotaUsage, ToolStorageChartView.EnumC13436b.f68803p);
        }
        C30050t8 c30050t86 = this.f71636P0;
        if (c30050t86 == null) {
            AbstractC19074t.m100223u("binding");
            c30050t86 = null;
        }
        c30050t86.f139450w.requestLayout();
        if (this.f71637Q0 == null) {
            m77290pM();
        }
        if (AbstractC3489d.m17504l()) {
            C30101w8 c30101w8 = this.f71637Q0;
            if (c30101w8 == null) {
                AbstractC19074t.m100223u("myCloudUsageDetailViewBinding");
                c30101w8 = null;
            }
            c30101w8.getRoot().setVisibility(8);
        } else {
            C30101w8 c30101w82 = this.f71637Q0;
            if (c30101w82 == null) {
                AbstractC19074t.m100223u("myCloudUsageDetailViewBinding");
                c30101w82 = null;
            }
            c30101w82.getRoot().setVisibility(0);
            C30101w8 c30101w83 = this.f71637Q0;
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
            C30101w8 c30101w84 = this.f71637Q0;
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
            C30101w8 c30101w85 = this.f71637Q0;
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
            C30101w8 c30101w86 = this.f71637Q0;
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
        C30050t8 c30050t87 = this.f71636P0;
        if (c30050t87 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c30050t82 = c30050t87;
        }
        c30050t82.f139451x.setVisibility(8);
    }

    /* renamed from: jp */
    public final void m77285jp(String str) {
        C30050t8 c30050t8 = this.f71636P0;
        C30050t8 c30050t82 = null;
        if (c30050t8 == null) {
            AbstractC19074t.m100223u("binding");
            c30050t8 = null;
        }
        c30050t8.f139432A.setImageOption(C23278z2.m120143n());
        C30050t8 c30050t83 = this.f71636P0;
        if (c30050t83 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c30050t82 = c30050t83;
        }
        c30050t82.f139432A.m75732d(str);
    }

    /* renamed from: lM */
    private final void m77287lM() {
        int i11;
        C30050t8 c30050t8 = this.f71636P0;
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

    /* renamed from: mM */
    public static final void m77288mM(MyCloudManagementView myCloudManagementView) {
        AbstractC19074t.m100208f(myCloudManagementView, "this$0");
        myCloudManagementView.m77287lM();
    }

    /* renamed from: nM */
    private final C21666e m77289nM() {
        return (C21666e) this.f71639S0.getValue();
    }

    /* renamed from: pM */
    private final void m77290pM() {
        C30050t8 c30050t8 = this.f71636P0;
        C30101w8 c30101w8 = null;
        if (c30050t8 == null) {
            AbstractC19074t.m100223u("binding");
            c30050t8 = null;
        }
        C30101w8 m148653a = C30101w8.m148653a(c30050t8.f139441J.inflate());
        AbstractC19074t.m100207e(m148653a, "bind(...)");
        this.f71637Q0 = m148653a;
        if (m148653a == null) {
            AbstractC19074t.m100223u("myCloudUsageDetailViewBinding");
            m148653a = null;
        }
        m148653a.f139796r.setText(AbstractC23136l9.m118746s0(AbstractC8020f0.str_my_cloud_quota_clean_section_title, AbstractC21935u.m114547n()));
        C30101w8 c30101w82 = this.f71637Q0;
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
        C30101w8 c30101w83 = this.f71637Q0;
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
        C30101w8 c30101w84 = this.f71637Q0;
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
        C30101w8 c30101w85 = this.f71637Q0;
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
        C30101w8 c30101w86 = this.f71637Q0;
        if (c30101w86 == null) {
            AbstractC19074t.m100223u("myCloudUsageDetailViewBinding");
        } else {
            c30101w8 = c30101w86;
        }
        c30101w8.f139795q.setOnClickListener(new View.OnClickListener() { // from class: bc0.m
            public /* synthetic */ ViewOnClickListenerC2750m() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyCloudManagementView.m77291qM(MyCloudManagementView.this, view);
            }
        });
    }

    /* renamed from: qM */
    public static final void m77291qM(MyCloudManagementView myCloudManagementView, View view) {
        AbstractC19074t.m100208f(myCloudManagementView, "this$0");
        Bundle bundle = new Bundle();
        bundle.putString("access_flow", ToolStorageDetailPage.EnumC13333a.f68484r.m74885c());
        C17487o0 m92662fJ = myCloudManagementView.m92662fJ();
        if (m92662fJ != null) {
            m92662fJ.m93066i2(ToolStorageDetailView.class, bundle, 131, 1, true);
        }
    }

    /* renamed from: sM */
    public static final void m77292sM(MyCloudManagementView myCloudManagementView, View view) {
        AbstractC19074t.m100208f(myCloudManagementView, "this$0");
        AbstractC23152n3.m119050j0(myCloudManagementView.m92689tK(), AbstractC23306f.m120583H().m110204g().f110055I);
    }

    /* renamed from: tM */
    private final void m77293tM(CharSequence charSequence) {
        C30050t8 c30050t8 = this.f71636P0;
        if (c30050t8 == null) {
            AbstractC19074t.m100223u("binding");
            c30050t8 = null;
        }
        c30050t8.f139434C.setText(charSequence);
    }

    /* renamed from: uM */
    private final void m77294uM(CharSequence charSequence) {
        C30050t8 c30050t8 = this.f71636P0;
        if (c30050t8 == null) {
            AbstractC19074t.m100223u("binding");
            c30050t8 = null;
        }
        c30050t8.f139436E.setText(charSequence);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C30050t8 m148531c = C30050t8.m148531c(layoutInflater, viewGroup, false);
        AbstractC19074t.m100207e(m148531c, "inflate(...)");
        this.f71636P0 = m148531c;
        m77296rM();
        m77295oM();
        C0697c0.Companion.m1052f(this, "mycloud_storage_visit", "connected");
        C30050t8 c30050t8 = this.f71636P0;
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
        C16972e0 c16972e0 = this.f71638R0;
        if (c16972e0 != null && c16972e0.m92868m()) {
            c16972e0.dismiss();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: KJ */
    public void mo40200KJ() {
        super.mo40200KJ();
        C23744a.b bVar = C23744a.Companion;
        bVar.m124119a().m124117e(this, 150804);
        bVar.m124119a().m124117e(this, 150810);
        bVar.m124119a().m124117e(this, 150810);
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "mycloud_storage_visit";
    }

    /* renamed from: oM */
    public final void m77295oM() {
        m77289nM().m111675P().m9219j(m92657cJ(), new C13895d(new C13893b()));
        m77289nM().m111676Q().m9219j(m92657cJ(), new C13895d(new C13894c()));
        m77289nM().m111677d0();
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        if (i11 == 131 && i12 == -1 && intent != null) {
            try {
                if (intent.getBooleanExtra("need_reload", false)) {
                    m77289nM().m111674O();
                }
            } catch (Exception e11) {
                C26676b.m136954d("mycloud_storage_visit", e11);
            }
        }
        super.onActivityResult(i11, i12, intent);
    }

    /* renamed from: rM */
    public final void m77296rM() {
        int i11;
        List m131496e;
        String m114547n = AbstractC21935u.m114547n();
        AbstractC19074t.m100207e(m114547n, "getSendToMeDPN(...)");
        m77294uM(m114547n);
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_my_cloud_quota_subtitle);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        m77293tM(m118743r0);
        C30050t8 c30050t8 = this.f71636P0;
        C30050t8 c30050t82 = null;
        if (c30050t8 == null) {
            AbstractC19074t.m100223u("binding");
            c30050t8 = null;
        }
        RobotoTextView robotoTextView = c30050t8.f139444q;
        int i12 = AbstractC8020f0.str_stored_on_zcloud;
        C16805b.b bVar = C16805b.Companion;
        robotoTextView.setText(AbstractC23136l9.m118746s0(i12, bVar.m89811a().m89800f()));
        C30050t8 c30050t83 = this.f71636P0;
        if (c30050t83 == null) {
            AbstractC19074t.m100223u("binding");
            c30050t83 = null;
        }
        ToolStorageChartView toolStorageChartView = c30050t83.f139450w;
        String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_my_cloud_quota_calculting_state);
        AbstractC19074t.m100207e(m118743r02, "getString(...)");
        if (C23212s8.m119603k()) {
            i11 = AbstractC2808b.ng20;
        } else {
            i11 = AbstractC2808b.ng80;
        }
        m131496e = AbstractC25366r.m131496e(new C30876a(m118743r02, i11, 1L, 0, false, false, null, 88, null));
        toolStorageChartView.setStorageBreakdown(new C30877b(m131496e));
        C30050t8 c30050t84 = this.f71636P0;
        if (c30050t84 == null) {
            AbstractC19074t.m100223u("binding");
            c30050t84 = null;
        }
        c30050t84.f139439H.setText("");
        C30050t8 c30050t85 = this.f71636P0;
        if (c30050t85 == null) {
            AbstractC19074t.m100223u("binding");
            c30050t85 = null;
        }
        ZdsActionBar zdsActionBar = c30050t85.f139442K;
        String m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_my_cloud_quota_action_bar);
        AbstractC19074t.m100207e(m118743r03, "getString(...)");
        String format = String.format(m118743r03, Arrays.copyOf(new Object[]{AbstractC21935u.m114547n()}, 1));
        AbstractC19074t.m100207e(format, "format(...)");
        zdsActionBar.setMiddleTitle(format);
        if (!TextUtils.isEmpty(AbstractC23306f.m120583H().m110204g().f110055I)) {
            C30050t8 c30050t86 = this.f71636P0;
            if (c30050t86 == null) {
                AbstractC19074t.m100223u("binding");
                c30050t86 = null;
            }
            c30050t86.f139442K.setOnClickListenerTrailingButton(new View.OnClickListener() { // from class: bc0.n
                public /* synthetic */ ViewOnClickListenerC2752n() {
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MyCloudManagementView.m77292sM(MyCloudManagementView.this, view);
                }
            });
        } else {
            C30050t8 c30050t87 = this.f71636P0;
            if (c30050t87 == null) {
                AbstractC19074t.m100223u("binding");
                c30050t87 = null;
            }
            Button trailingButton = c30050t87.f139442K.getTrailingButton();
            if (trailingButton != null) {
                trailingButton.setVisibility(8);
            }
        }
        C30050t8 c30050t88 = this.f71636P0;
        if (c30050t88 == null) {
            AbstractC19074t.m100223u("binding");
            c30050t88 = null;
        }
        RobotoTextView robotoTextView2 = c30050t88.f139452y;
        String m118743r04 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_my_cloud_quota_clean_section_title);
        AbstractC19074t.m100207e(m118743r04, "getString(...)");
        String format2 = String.format(m118743r04, Arrays.copyOf(new Object[]{AbstractC21935u.m114547n()}, 1));
        AbstractC19074t.m100207e(format2, "format(...)");
        robotoTextView2.setText(format2);
        if (C24252c.f117152a.m126600f(EnumC24251b.f117147r)) {
            C30050t8 c30050t89 = this.f71636P0;
            if (c30050t89 == null) {
                AbstractC19074t.m100223u("binding");
                c30050t89 = null;
            }
            c30050t89.f139444q.setVisibility(0);
            C30050t8 c30050t810 = this.f71636P0;
            if (c30050t810 == null) {
                AbstractC19074t.m100223u("binding");
                c30050t810 = null;
            }
            c30050t810.f139437F.setVisibility(8);
            C30050t8 c30050t811 = this.f71636P0;
            if (c30050t811 == null) {
                AbstractC19074t.m100223u("binding");
                c30050t811 = null;
            }
            c30050t811.f139453z.setVisibility(8);
            C30050t8 c30050t812 = this.f71636P0;
            if (c30050t812 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c30050t82 = c30050t812;
            }
            c30050t82.f139440I.setText(AbstractC23136l9.m118746s0(AbstractC8020f0.str_zcloud_chart_title, bVar.m89811a().m89800f()));
            return;
        }
        C30050t8 c30050t813 = this.f71636P0;
        if (c30050t813 == null) {
            AbstractC19074t.m100223u("binding");
            c30050t813 = null;
        }
        c30050t813.f139444q.setVisibility(8);
        C30050t8 c30050t814 = this.f71636P0;
        if (c30050t814 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c30050t82 = c30050t814;
        }
        c30050t82.f139440I.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_my_cloud_quota_chart_title));
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        AbstractC19074t.m100208f(objArr, "args");
        if (i11 != 150802) {
            if (i11 == 150804 || i11 == 150810) {
                m77289nM().m111677d0();
                return;
            }
            return;
        }
        mo70710wy(new Runnable() { // from class: bc0.l
            public /* synthetic */ RunnableC2748l() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                MyCloudManagementView.m77288mM(MyCloudManagementView.this);
            }
        });
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: zJ */
    public void mo40210zJ(ZaloActivity zaloActivity) {
        super.mo40210zJ(zaloActivity);
        C23744a.b bVar = C23744a.Companion;
        bVar.m124119a().m124115b(this, 150804);
        bVar.m124119a().m124115b(this, 150810);
        bVar.m124119a().m124115b(this, 150810);
    }
}
