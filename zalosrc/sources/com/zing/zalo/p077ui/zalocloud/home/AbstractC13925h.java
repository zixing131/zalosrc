package com.zing.zalo.p077ui.zalocloud.home;

import ah0.C0860a;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ClickableSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.ZAppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import bc0.EnumC2746k;
import bi0.AbstractC2807a;
import bi0.AbstractC2810d;
import bi0.AbstractC2811e;
import bi0.AbstractC2814h;
import ch0.AbstractC3489d;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7921d0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.data.zalocloud.model.ZCloudQuotaUsage;
import com.zing.zalo.p077ui.toolstorage.overview.ToolStorageChartView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zalocloud.home.AbstractC13923f;
import com.zing.zalo.p077ui.zalocloud.home.AbstractC13925h;
import com.zing.zalo.p077ui.zalocloud.home.InterfaceC13924g;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zalocloud.configs.C16805b;
import com.zing.zalo.zalocloud.recover.AbstractC16889b;
import com.zing.zalo.zalocloud.recover.ZaloCloudRecoverCloudMediaWorker;
import com.zing.zalo.zdesign.component.Badge;
import com.zing.zalo.zdesign.component.Button;
import com.zing.zalo.zdesign.component.C16974f;
import com.zing.zalo.zdesign.component.EnumC16952b0;
import com.zing.zalo.zdesign.component.EnumC16991i;
import com.zing.zalo.zdesign.component.ListItem;
import com.zing.zalo.zdesign.component.ProgressBar;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import hn0.AbstractC20104d;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import k30.C21459a;
import kotlin.NoWhenBranchMatchedException;
import ln0.AbstractC22543l;
import me0.AbstractC23136l9;
import me0.AbstractC23152n3;
import me0.AbstractC23222t7;
import me0.C23212s8;
import mg0.AbstractC23291c;
import og0.C24252c;
import og0.EnumC24251b;
import on0.AbstractC24342w;
import p304ks.AbstractC21935u;
import p348mi.AbstractC23306f;
import p649xl.C30074uf;
import p649xl.C30091vf;
import p649xl.C30108wf;
import p649xl.C30142yf;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import qm0.AbstractC25366r;
import qm0.AbstractC25368s;
import ti0.C26703b;
import ti0.C26705d;
import ti0.C26708g;
import ui0.C27280g;
import wg0.AbstractC28981d;
import wg0.EnumC28993p;
import wg0.InterfaceC28990m;
import y60.C30803e;
import ya0.C30876a;
import ya0.C30877b;

/* renamed from: com.zing.zalo.ui.zalocloud.home.h */
/* loaded from: classes6.dex */
public abstract class AbstractC13925h extends RecyclerView.AbstractC1876c0 {

    /* renamed from: com.zing.zalo.ui.zalocloud.home.h$a */
    /* loaded from: classes6.dex */
    public static final class a extends AbstractC13925h {

        /* renamed from: I */
        private final C30074uf f71791I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(view, null);
            AbstractC19074t.m100208f(view, "itemView");
            C30074uf m148591a = C30074uf.m148591a(view);
            AbstractC19074t.m100207e(m148591a, "bind(...)");
            this.f71791I = m148591a;
        }

        /* renamed from: j0 */
        public void m77522j0(AbstractC13923f.a aVar, int i11) {
            String m118743r0;
            AbstractC19074t.m100208f(aVar, "data");
            RobotoTextView robotoTextView = this.f71791I.f139610q;
            if (AbstractC19074t.m100204b(aVar, AbstractC13923f.a.b.f71770b)) {
                m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_zcloud_home_migration_banner);
            } else if (AbstractC19074t.m100204b(aVar, AbstractC13923f.a.C32785a.f71769b)) {
                m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_zcloud_home_change_pass_banner);
            } else {
                throw new NoWhenBranchMatchedException();
            }
            robotoTextView.setText(m118743r0);
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.home.h$b */
    /* loaded from: classes6.dex */
    public static final class b extends AbstractC13925h {

        /* renamed from: I */
        private final C30108wf f71792I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(View view) {
            super(view, null);
            AbstractC19074t.m100208f(view, "itemView");
            C30108wf m148669a = C30108wf.m148669a(view);
            AbstractC19074t.m100207e(m148669a, "bind(...)");
            this.f71792I = m148669a;
        }

        /* renamed from: j0 */
        public void m77523j0(AbstractC13923f.c cVar, int i11) {
            String str;
            long m116581d;
            int m119606n;
            AbstractC19074t.m100208f(cVar, "data");
            if (cVar instanceof AbstractC13923f.c.b) {
                ZCloudQuotaUsage m77502b = ((AbstractC13923f.c.b) cVar).m77502b();
                this.f71792I.f139849r.setText(AbstractC23136l9.m118746s0(AbstractC8020f0.str_zcloud_chart_title, C16805b.Companion.m89811a().m89800f()));
                RobotoTextView robotoTextView = this.f71792I.f139848q;
                String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_my_cloud_quota_usage);
                AbstractC19074t.m100207e(m118743r0, "getString(...)");
                m116581d = AbstractC22543l.m116581d(m77502b.m41253k(), 0L);
                String format = String.format(m118743r0, Arrays.copyOf(new Object[]{C21459a.m111038f(m116581d, 0, 2, null), C21459a.m111038f(m77502b.m41252j(), 0, 2, null)}, 2));
                AbstractC19074t.m100207e(format, "format(...)");
                robotoTextView.setText(format);
                this.f71792I.f139848q.setVisibility(0);
                RobotoTextView robotoTextView2 = this.f71792I.f139848q;
                if (m77502b.m41252j() > 0 && m77502b.m41256n()) {
                    m119606n = C23212s8.m119606n(AbstractC2807a.accent_red_text);
                } else {
                    m119606n = C23212s8.m119606n(AbstractC2807a.text_tertiary);
                }
                robotoTextView2.setTextColor(m119606n);
                return;
            }
            if (cVar instanceof AbstractC13923f.c.a) {
                AbstractC23291c m77501b = ((AbstractC13923f.c.a) cVar).m77501b();
                RobotoTextView robotoTextView3 = this.f71792I.f139849r;
                if (m77501b instanceof AbstractC23291c.c) {
                    str = AbstractC23136l9.m118746s0(AbstractC8020f0.str_zcloud_change_pass_progressing, m77501b.mo120404a() + "%");
                } else if (m77501b instanceof AbstractC23291c.a) {
                    str = AbstractC23136l9.m118743r0(AbstractC8020f0.str_zcloud_change_pass_pause);
                } else {
                    str = "";
                }
                robotoTextView3.setText(str);
                this.f71792I.f139848q.setVisibility(8);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.home.h$c */
    /* loaded from: classes6.dex */
    public static final class c extends AbstractC13925h {

        /* renamed from: I */
        private final ToolStorageChartView f71793I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ToolStorageChartView toolStorageChartView) {
            super(toolStorageChartView, null);
            AbstractC19074t.m100208f(toolStorageChartView, "itemView");
            this.f71793I = toolStorageChartView;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x005a  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0071  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x007e  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x005d  */
        /* renamed from: j0 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private final void m77524j0(AbstractC23291c abstractC23291c) {
            String str;
            long j11;
            int mo120404a;
            long j12;
            int i11;
            Drawable drawable;
            List m131505m;
            Context context = this.f7784p.getContext();
            boolean z11 = abstractC23291c instanceof AbstractC23291c.a;
            if (z11 && AbstractC19074t.m100204b(((AbstractC23291c.a) abstractC23291c).m120405b(), "network")) {
                str = AbstractC23136l9.m118743r0(AbstractC8020f0.str_zcloud_migration_network_error);
            } else {
                str = "";
            }
            String str2 = str;
            AbstractC19074t.m100205c(str2);
            if (abstractC23291c instanceof AbstractC23291c.b) {
                j12 = 0;
            } else {
                if (z11) {
                    mo120404a = abstractC23291c.mo120404a();
                } else if (abstractC23291c instanceof AbstractC23291c.c) {
                    mo120404a = abstractC23291c.mo120404a();
                } else {
                    if (AbstractC19074t.m100204b(abstractC23291c, AbstractC23291c.d.f113055b)) {
                        j11 = 100;
                        ToolStorageChartView toolStorageChartView = this.f71793I;
                        C30876a[] c30876aArr = new C30876a[2];
                        if (!z11) {
                            i11 = AbstractC2807a.storage_legend_paused;
                        } else {
                            i11 = AbstractC2807a.progress_indicator_blue;
                        }
                        int m119611s = C23212s8.m119611s(context, i11);
                        boolean z12 = !TextUtils.isEmpty(str2);
                        if (TextUtils.isEmpty(str2)) {
                            AbstractC19074t.m100205c(context);
                            drawable = C27280g.m139660c(context, AbstractC2810d.zds_ic_warning_solid_16, AbstractC2807a.icon_tertiary);
                        } else {
                            drawable = null;
                        }
                        c30876aArr[0] = new C30876a(str2, m119611s, j11, 0, z12, false, drawable, 8, null);
                        c30876aArr[1] = new C30876a(null, C23212s8.m119611s(context, AbstractC2807a.storage_legend_empty), 100 - j11, 0, false, false, null, 73, null);
                        m131505m = AbstractC25368s.m131505m(c30876aArr);
                        toolStorageChartView.setStorageBreakdown(new C30877b(m131505m));
                    }
                    throw new NoWhenBranchMatchedException();
                }
                j12 = mo120404a;
            }
            j11 = j12;
            ToolStorageChartView toolStorageChartView2 = this.f71793I;
            C30876a[] c30876aArr2 = new C30876a[2];
            if (!z11) {
            }
            int m119611s2 = C23212s8.m119611s(context, i11);
            boolean z122 = !TextUtils.isEmpty(str2);
            if (TextUtils.isEmpty(str2)) {
            }
            c30876aArr2[0] = new C30876a(str2, m119611s2, j11, 0, z122, false, drawable, 8, null);
            c30876aArr2[1] = new C30876a(null, C23212s8.m119611s(context, AbstractC2807a.storage_legend_empty), 100 - j11, 0, false, false, null, 73, null);
            m131505m = AbstractC25368s.m131505m(c30876aArr2);
            toolStorageChartView2.setStorageBreakdown(new C30877b(m131505m));
        }

        /* renamed from: l0 */
        private final void m77525l0(ZCloudQuotaUsage zCloudQuotaUsage, ToolStorageChartView.EnumC13436b enumC13436b) {
            List m131496e;
            List m131496e2;
            Context context = this.f7784p.getContext();
            if (zCloudQuotaUsage.m41255m()) {
                ToolStorageChartView toolStorageChartView = this.f71793I;
                String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_my_cloud_quota_error_state);
                AbstractC19074t.m100207e(m118743r0, "getString(...)");
                m131496e2 = AbstractC25366r.m131496e(new C30876a(m118743r0, C23212s8.m119611s(context, AbstractC2807a.storage_legend_empty), 1L, C23212s8.m119611s(context, AbstractC2807a.error_text), false, false, null, 80, null));
                toolStorageChartView.setStorageBreakdown(new C30877b(m131496e2));
                return;
            }
            if (!zCloudQuotaUsage.m41257o()) {
                ToolStorageChartView toolStorageChartView2 = this.f71793I;
                String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_my_cloud_quota_calculting_state);
                AbstractC19074t.m100207e(m118743r02, "getString(...)");
                m131496e = AbstractC25366r.m131496e(new C30876a(m118743r02, C23212s8.m119611s(context, AbstractC2807a.storage_legend_empty), 1L, 0, false, false, null, 88, null));
                toolStorageChartView2.setStorageBreakdown(new C30877b(m131496e));
                return;
            }
            this.f71793I.m75330X(zCloudQuotaUsage, enumC13436b);
        }

        /* renamed from: k0 */
        public void m77526k0(AbstractC13923f.b bVar, int i11) {
            AbstractC19074t.m100208f(bVar, "data");
            if (bVar instanceof AbstractC13923f.b.C32786b) {
                m77525l0(((AbstractC13923f.b.C32786b) bVar).m77499b(), ToolStorageChartView.EnumC13436b.f68804q);
            } else if (bVar instanceof AbstractC13923f.b.a) {
                m77524j0(((AbstractC13923f.b.a) bVar).m77498b());
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.home.h$d */
    /* loaded from: classes6.dex */
    public static final class d extends AbstractC13925h {

        /* renamed from: I */
        private final ListItem f71794I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ListItem listItem, final InterfaceC13924g interfaceC13924g) {
            super(listItem, null);
            AbstractC19074t.m100208f(listItem, "itemView");
            AbstractC19074t.m100208f(interfaceC13924g, "zCloudHomeListener");
            this.f71794I = listItem;
            listItem.getIconChevronRight().setVisibility(0);
            listItem.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_zcloud_manage_plan_title);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            listItem.setTitle(m118743r0);
            listItem.setOnClickListener(new View.OnClickListener() { // from class: bc0.b0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AbstractC13925h.d.m77528l0(InterfaceC13924g.this, view);
                }
            });
            Badge badgeTitle = listItem.getBadgeTitle();
            Context context = listItem.getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            C16974f c16974f = new C16974f(context);
            c16974f.m90974x(EnumC16991i.CUSTOM);
            c16974f.m90965o(C23212s8.m119607o(c16974f.m90953c(), AbstractC2807a.accent_sky_blue_background_subtle));
            c16974f.m90973w(C23212s8.m119607o(c16974f.m90953c(), AbstractC2807a.accent_sky_blue_text_bold));
            badgeTitle.m90493g(c16974f);
            listItem.getBadgeTitle().setVisibility(8);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: l0 */
        public static final void m77528l0(InterfaceC13924g interfaceC13924g, View view) {
            AbstractC19074t.m100208f(interfaceC13924g, "$zCloudHomeListener");
            interfaceC13924g.mo77404j();
        }

        /* renamed from: k0 */
        public void m77529k0(AbstractC13923f.d dVar, int i11) {
            AbstractC19074t.m100208f(dVar, "data");
            this.f71794I.getBadgeTitle().setVisibility(0);
            this.f71794I.getBadgeTitle().setBadgeText(C21459a.m111038f(dVar.m77504b(), 0, 2, null));
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.home.h$e */
    /* loaded from: classes6.dex */
    public static final class e extends AbstractC13925h {

        /* renamed from: I */
        private final ListItem f71795I;

        /* renamed from: J */
        private final InterfaceC13924g f71796J;

        /* renamed from: K */
        private final ZAppCompatImageView f71797K;

        /* renamed from: L */
        private final InterfaceC24854k f71798L;

        /* renamed from: M */
        private final InterfaceC24854k f71799M;

        /* renamed from: com.zing.zalo.ui.zalocloud.home.h$e$a */
        /* loaded from: classes6.dex */
        public /* synthetic */ class a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f71800a;

            static {
                int[] iArr = new int[EnumC24251b.values().length];
                try {
                    iArr[EnumC24251b.f117146q.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC24251b.f117148s.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC24251b.f117147r.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f71800a = iArr;
            }
        }

        /* renamed from: com.zing.zalo.ui.zalocloud.home.h$e$b */
        /* loaded from: classes6.dex */
        static final class b extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ ListItem f71801q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(ListItem listItem) {
                super(0);
                this.f71801q = listItem;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Button mo12V4() {
                Context context = this.f71801q.getContext();
                AbstractC19074t.m100207e(context, "getContext(...)");
                Button button = new Button(context);
                button.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
                button.m90539c(AbstractC2814h.ButtonSmall_Primary);
                button.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_zcloud_connect_feature));
                return button;
            }
        }

        /* renamed from: com.zing.zalo.ui.zalocloud.home.h$e$c */
        /* loaded from: classes6.dex */
        static final class c extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ ListItem f71802q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(ListItem listItem) {
                super(0);
                this.f71802q = listItem;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final RobotoTextView mo12V4() {
                Context context = this.f71802q.getContext();
                AbstractC19074t.m100207e(context, "getContext(...)");
                RobotoTextView robotoTextView = new RobotoTextView(context);
                robotoTextView.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
                Context context2 = robotoTextView.getContext();
                AbstractC19074t.m100207e(context2, "getContext(...)");
                new C26708g(robotoTextView).m137319a(C26705d.m137293a(context2, AbstractC2814h.t_xsmall_m));
                robotoTextView.setTextColor(C23212s8.m119607o(robotoTextView.getContext(), AbstractC2807a.text_tertiary));
                return robotoTextView;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ListItem listItem, InterfaceC13924g interfaceC13924g) {
            super(listItem, null);
            InterfaceC24854k m129210a;
            InterfaceC24854k m129210a2;
            AbstractC19074t.m100208f(listItem, "itemView");
            AbstractC19074t.m100208f(interfaceC13924g, "zCloudHomeListener");
            this.f71795I = listItem;
            this.f71796J = interfaceC13924g;
            ZAppCompatImageView zAppCompatImageView = new ZAppCompatImageView(listItem.getContext());
            zAppCompatImageView.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
            Context context = zAppCompatImageView.getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            zAppCompatImageView.setBackground(C27280g.m139658a(context, AbstractC16803z.bg_layer_selected_round));
            int i11 = AbstractC23222t7.f112566j;
            zAppCompatImageView.setPadding(i11, i11, i11, i11);
            this.f71797K = zAppCompatImageView;
            m129210a = AbstractC24856m.m129210a(new b(listItem));
            this.f71798L = m129210a;
            m129210a2 = AbstractC24856m.m129210a(new c(listItem));
            this.f71799M = m129210a2;
            listItem.m90587c(zAppCompatImageView);
            EnumC16952b0 enumC16952b0 = EnumC16952b0.CENTER;
            listItem.setLeadingGravity(enumC16952b0);
            listItem.setTrailingGravity(enumC16952b0);
            listItem.m90591l(AbstractC23222t7.f112561g0, 0, 0, 0);
            listItem.setTitleMaxLine(2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: p0 */
        public static final void m77535p0(e eVar, AbstractC13923f.j jVar, View view) {
            AbstractC19074t.m100208f(eVar, "this$0");
            AbstractC19074t.m100208f(jVar, "$data");
            eVar.f71796J.mo77403i(jVar.m77509b().m109965b());
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: q0 */
        public static final void m77536q0(e eVar, AbstractC13923f.j jVar, View view) {
            AbstractC19074t.m100208f(eVar, "this$0");
            AbstractC19074t.m100208f(jVar, "$data");
            eVar.f71796J.mo77403i(jVar.m77509b().m109965b());
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: r0 */
        public static final void m77537r0(e eVar, AbstractC13923f.j jVar, View view) {
            AbstractC19074t.m100208f(eVar, "this$0");
            AbstractC19074t.m100208f(jVar, "$data");
            eVar.f71796J.mo77405k(jVar.m77509b().m109965b());
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: s0 */
        public static final void m77538s0(View view) {
            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_zcloud_feature_unable_connect));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: t0 */
        public static final void m77539t0(View view) {
            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_zcloud_feature_unable_connect));
        }

        /* renamed from: u0 */
        private final Button m77540u0() {
            return (Button) this.f71798L.getValue();
        }

        /* renamed from: v0 */
        private final RobotoTextView m77541v0() {
            return (RobotoTextView) this.f71799M.getValue();
        }

        /* renamed from: o0 */
        public void m77542o0(final AbstractC13923f.j jVar, int i11) {
            AbstractC19074t.m100208f(jVar, "data");
            boolean m126600f = C24252c.f117152a.m126600f(jVar.m77509b().m109965b());
            int i12 = a.f71800a[jVar.m77509b().m109965b().ordinal()];
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 == 3) {
                        ZAppCompatImageView zAppCompatImageView = this.f71797K;
                        Context context = this.f7784p.getContext();
                        AbstractC19074t.m100207e(context, "getContext(...)");
                        zAppCompatImageView.setImageDrawable(C27280g.m139660c(context, AbstractC2810d.zds_ic_my_cloud_line_24, AbstractC2807a.icon_primary));
                        ListItem listItem = this.f71795I;
                        String m118746s0 = AbstractC23136l9.m118746s0(jVar.m77509b().m109966c(), AbstractC21935u.m114547n());
                        AbstractC19074t.m100207e(m118746s0, "getString(...)");
                        listItem.setTitle(m118746s0);
                    }
                } else {
                    ZAppCompatImageView zAppCompatImageView2 = this.f71797K;
                    Context context2 = this.f7784p.getContext();
                    AbstractC19074t.m100207e(context2, "getContext(...)");
                    zAppCompatImageView2.setImageDrawable(C27280g.m139660c(context2, AbstractC2810d.zds_ic_auto_counter_clockwise_line_24, AbstractC2807a.icon_primary));
                    ListItem listItem2 = this.f71795I;
                    String m118743r0 = AbstractC23136l9.m118743r0(jVar.m77509b().m109966c());
                    AbstractC19074t.m100207e(m118743r0, "getString(...)");
                    listItem2.setTitle(m118743r0);
                }
            } else {
                ZAppCompatImageView zAppCompatImageView3 = this.f71797K;
                Context context3 = this.f7784p.getContext();
                AbstractC19074t.m100207e(context3, "getContext(...)");
                zAppCompatImageView3.setImageDrawable(C27280g.m139660c(context3, AbstractC2810d.zds_ic_gallery_line_24, AbstractC2807a.icon_primary));
                ListItem listItem3 = this.f71795I;
                String m118743r02 = AbstractC23136l9.m118743r0(jVar.m77509b().m109966c());
                AbstractC19074t.m100207e(m118743r02, "getString(...)");
                listItem3.setTitle(m118743r02);
            }
            this.f71795I.m90592m(jVar.m77511d());
            if (AbstractC3489d.m17506n()) {
                if (jVar.m77513f()) {
                    this.f71795I.setBackground(null);
                    this.f71795I.setOnClickListener(null);
                    this.f71795I.setTrailingItemVisibility(8);
                    this.f71795I.getIconChevronRight().setVisibility(8);
                    return;
                }
                ListItem listItem4 = this.f71795I;
                Context context4 = this.f7784p.getContext();
                AbstractC19074t.m100207e(context4, "getContext(...)");
                listItem4.setBackground(C27280g.m139658a(context4, AbstractC2810d.bg_list_item));
                this.f71795I.getIconChevronRight().setVisibility(0);
                m77541v0().setText(C21459a.m111038f(jVar.m77512e(), 0, 2, null));
                this.f71795I.m90589e(m77541v0());
                this.f71795I.setTrailingItemVisibility(0);
                this.f71795I.setOnClickListener(new View.OnClickListener() { // from class: bc0.c0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        AbstractC13925h.e.m77535p0(AbstractC13925h.e.this, jVar, view);
                    }
                });
                return;
            }
            if (m126600f) {
                ListItem listItem5 = this.f71795I;
                Context context5 = this.f7784p.getContext();
                AbstractC19074t.m100207e(context5, "getContext(...)");
                listItem5.setBackground(C27280g.m139658a(context5, AbstractC2810d.bg_list_item));
                this.f71795I.getIconChevronRight().setVisibility(0);
                m77541v0().setText(C21459a.m111038f(jVar.m77512e(), 0, 2, null));
                this.f71795I.m90589e(m77541v0());
                this.f71795I.setTrailingItemVisibility(0);
                this.f71795I.setOnClickListener(new View.OnClickListener() { // from class: bc0.d0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        AbstractC13925h.e.m77536q0(AbstractC13925h.e.this, jVar, view);
                    }
                });
                return;
            }
            this.f71795I.setBackground(null);
            this.f71795I.getIconChevronRight().setVisibility(8);
            this.f71795I.m90589e(m77540u0());
            this.f71795I.setTrailingItemVisibility(0);
            if (!AbstractC3489d.m17505m()) {
                this.f71795I.setAlpha(1.0f);
                this.f71795I.setOnClickListener(null);
                this.f71797K.setAlpha(1.0f);
                m77540u0().setAlpha(1.0f);
                Button m77540u0 = m77540u0();
                Context context6 = this.f7784p.getContext();
                AbstractC19074t.m100207e(context6, "getContext(...)");
                m77540u0.setBackground(C27280g.m139658a(context6, AbstractC2810d.bg_btn_small_primary));
                m77540u0().setOnClickListener(new View.OnClickListener() { // from class: bc0.e0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        AbstractC13925h.e.m77537r0(AbstractC13925h.e.this, jVar, view);
                    }
                });
                m77540u0().setEnabled(!jVar.m77510c());
                return;
            }
            this.f71795I.setAlpha(0.5f);
            this.f71795I.setOnClickListener(new View.OnClickListener() { // from class: bc0.f0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AbstractC13925h.e.m77538s0(view);
                }
            });
            this.f71797K.setAlpha(0.5f);
            m77540u0().setAlpha(0.5f);
            Button m77540u02 = m77540u0();
            Context context7 = this.f7784p.getContext();
            AbstractC19074t.m100207e(context7, "getContext(...)");
            m77540u02.setBackground(C27280g.m139658a(context7, AbstractC2810d.bg_btn_small_primary_n));
            m77540u0().setOnClickListener(new View.OnClickListener() { // from class: bc0.g0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AbstractC13925h.e.m77539t0(view);
                }
            });
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.home.h$f */
    /* loaded from: classes6.dex */
    public static final class f extends AbstractC13925h {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(View view) {
            super(view, null);
            AbstractC19074t.m100208f(view, "itemView");
            view.setLayoutParams(new ViewGroup.LayoutParams(-1, AbstractC23222t7.f112566j));
            view.setBackgroundColor(C23212s8.m119607o(view.getContext(), AbstractC2807a.surface_background));
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.home.h$g */
    /* loaded from: classes6.dex */
    public static final class g extends AbstractC13925h {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(View view) {
            super(view, null);
            AbstractC19074t.m100208f(view, "itemView");
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.home.h$h */
    /* loaded from: classes6.dex */
    public static final class h extends AbstractC13925h {

        /* renamed from: I */
        private final InterfaceC13924g f71803I;

        /* renamed from: J */
        private int f71804J;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(View view, InterfaceC13924g interfaceC13924g) {
            super(view, null);
            AbstractC19074t.m100208f(view, "itemView");
            AbstractC19074t.m100208f(interfaceC13924g, "homeListener");
            this.f71803I = interfaceC13924g;
            this.f71804J = -1;
            view.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            view.setBackgroundColor(C23212s8.m119607o(view.getContext(), AbstractC2807a.surface_background));
        }

        /* renamed from: j0 */
        public void m77545j0(AbstractC13923f.g gVar, int i11) {
            int i12;
            AbstractC19074t.m100208f(gVar, "data");
            if (this.f71803I.mo77400f() > this.f71803I.mo77397c()) {
                i12 = 0;
            } else if (this.f71804J == i11 && !gVar.m77506b()) {
                i12 = this.f71803I.mo77397c() - this.f7784p.getTop();
            } else {
                i12 = -1;
            }
            this.f7784p.setLayoutParams(new ViewGroup.LayoutParams(-1, i12));
            this.f71804J = i11;
            if (i12 == -1) {
                this.f71803I.mo77395a();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.home.h$i */
    /* loaded from: classes6.dex */
    public static final class i extends AbstractC13925h {

        /* renamed from: I */
        private final RobotoTextView f71805I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(RobotoTextView robotoTextView) {
            super(robotoTextView, null);
            AbstractC19074t.m100208f(robotoTextView, "itemView");
            this.f71805I = robotoTextView;
            robotoTextView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            Context context = robotoTextView.getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            new C26708g(robotoTextView).m137319a(C26705d.m137293a(context, AbstractC2814h.t_small_m));
            robotoTextView.setTextColor(C23212s8.m119607o(robotoTextView.getContext(), AbstractC2807a.information_text));
        }

        /* renamed from: j0 */
        public void m77546j0(AbstractC13923f.h hVar, int i11) {
            AbstractC19074t.m100208f(hVar, "data");
            this.f71805I.setText(hVar.m77508b());
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.home.h$j */
    /* loaded from: classes6.dex */
    public static final class j extends AbstractC13925h {

        /* renamed from: I */
        private final RobotoTextView f71806I;

        /* renamed from: J */
        private final InterfaceC13924g f71807J;

        /* renamed from: com.zing.zalo.ui.zalocloud.home.h$j$a */
        /* loaded from: classes6.dex */
        public static final class a extends ClickableSpan {

            /* renamed from: p */
            final /* synthetic */ AbstractC13923f.i f71808p;

            /* renamed from: q */
            final /* synthetic */ j f71809q;

            a(AbstractC13923f.i iVar, j jVar) {
                this.f71808p = iVar;
                this.f71809q = jVar;
            }

            @Override // android.text.style.ClickableSpan
            public void onClick(View view) {
                AbstractC19074t.m100208f(view, "textView");
                if (AbstractC19074t.m100204b(this.f71808p, AbstractC13923f.i.a.f71780b)) {
                    this.f71809q.f71807J.mo77399e();
                }
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public void updateDrawState(TextPaint textPaint) {
                AbstractC19074t.m100208f(textPaint, "ds");
                super.updateDrawState(textPaint);
                textPaint.setColor(C23212s8.m119607o(this.f71809q.f7784p.getContext(), AbstractC2807a.cta_link));
                textPaint.setUnderlineText(false);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(RobotoTextView robotoTextView, InterfaceC13924g interfaceC13924g) {
            super(robotoTextView, null);
            AbstractC19074t.m100208f(robotoTextView, "itemView");
            AbstractC19074t.m100208f(interfaceC13924g, "zCloudHomeListener");
            this.f71806I = robotoTextView;
            this.f71807J = interfaceC13924g;
            robotoTextView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            Context context = robotoTextView.getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            new C26708g(robotoTextView).m137319a(C26705d.m137293a(context, AbstractC2814h.t_xxsmall));
            robotoTextView.setTextColor(C23212s8.m119607o(robotoTextView.getContext(), AbstractC2807a.text_tertiary));
            robotoTextView.setClickable(true);
            robotoTextView.setFocusable(true);
        }

        /* renamed from: k0 */
        private final SpannableString m77548k0(String str, String str2, AbstractC13923f.i iVar) {
            SpannableString spannableString = new SpannableString(str + " " + str2);
            spannableString.setSpan(new a(iVar, this), str.length() + 1, spannableString.length(), 33);
            spannableString.setSpan(new StyleSpan(1), str.length() + 1, spannableString.length(), 33);
            return spannableString;
        }

        /* renamed from: l0 */
        public void m77549l0(AbstractC13923f.i iVar, int i11) {
            String str;
            String str2;
            boolean z11;
            Drawable c30803e;
            int intrinsicWidth;
            AbstractC19074t.m100208f(iVar, "data");
            if (AbstractC19074t.m100204b(iVar, AbstractC13923f.i.a.f71780b)) {
                str = AbstractC23136l9.m118743r0(AbstractC8020f0.str_zcloud_migration_unknown_error);
                AbstractC19074t.m100207e(str, "getString(...)");
                str2 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_zcloud_change_pass_unknown_error_cta);
                AbstractC19074t.m100207e(str2, "getString(...)");
                z11 = true;
            } else {
                str = "";
                str2 = "";
                z11 = false;
            }
            Context context = this.f7784p.getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            Drawable m139660c = C27280g.m139660c(context, AbstractC2810d.zds_ic_warning_solid_16, AbstractC2807a.icon_tertiary);
            if (m139660c != null) {
                m139660c.setBounds(0, 0, m139660c.getIntrinsicWidth(), m139660c.getIntrinsicHeight());
                RobotoTextView robotoTextView = this.f71806I;
                if (z11) {
                    c30803e = m139660c;
                } else {
                    c30803e = new C30803e(m139660c);
                }
                robotoTextView.setCompoundDrawablesRelative(c30803e, null, null, null);
                if (z11) {
                    intrinsicWidth = AbstractC23222t7.f112566j;
                } else {
                    intrinsicWidth = AbstractC23222t7.f112566j + m139660c.getIntrinsicWidth();
                }
                robotoTextView.setCompoundDrawablePadding(intrinsicWidth);
                robotoTextView.setText(m77548k0(str, str2, iVar));
                robotoTextView.setMovementMethod(LinkMovementMethod.getInstance());
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.home.h$k */
    /* loaded from: classes6.dex */
    public static final class k extends AbstractC13925h {

        /* renamed from: I */
        private final View f71810I;

        /* renamed from: J */
        private final InterfaceC13924g f71811J;

        /* renamed from: K */
        private final C30091vf f71812K;

        /* renamed from: L */
        private final GradientDrawable f71813L;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(View view, InterfaceC13924g interfaceC13924g) {
            super(view, null);
            AbstractC19074t.m100208f(view, "view");
            AbstractC19074t.m100208f(interfaceC13924g, "listener");
            this.f71810I = view;
            this.f71811J = interfaceC13924g;
            C30091vf m148631a = C30091vf.m148631a(this.f7784p);
            AbstractC19074t.m100207e(m148631a, "bind(...)");
            this.f71812K = m148631a;
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(C23212s8.m119607o(view.getContext(), AbstractC2807a.layer_background_selected));
            gradientDrawable.setCornerRadius(AbstractC23222t7.f112576o);
            this.f71813L = gradientDrawable;
            m148631a.f139734q.setOnClickListener(new View.OnClickListener() { // from class: bc0.h0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    AbstractC13925h.k.m77552l0(AbstractC13925h.k.this, view2);
                }
            });
            m148631a.f139739v.setOnClickListener(new View.OnClickListener() { // from class: bc0.i0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    AbstractC13925h.k.m77553m0(AbstractC13925h.k.this, view2);
                }
            });
            m148631a.getRoot().setBackground(gradientDrawable);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: l0 */
        public static final void m77552l0(k kVar, View view) {
            AbstractC19074t.m100208f(kVar, "this$0");
            kVar.f71811J.mo77402h();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: m0 */
        public static final void m77553m0(k kVar, View view) {
            AbstractC19074t.m100208f(kVar, "this$0");
            InterfaceC13924g interfaceC13924g = kVar.f71811J;
            Object tag = view.getTag();
            AbstractC19074t.m100207e(tag, "getTag(...)");
            interfaceC13924g.mo77398d(tag);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: o0 */
        private final void m77554o0(AbstractC16889b abstractC16889b) {
            int i11;
            String m118743r0;
            int i12;
            String m118743r02;
            int m127173b0;
            int m127173b02;
            GradientDrawable gradientDrawable = this.f71813L;
            if ((abstractC16889b instanceof AbstractC16889b.a) || (abstractC16889b instanceof AbstractC16889b.b)) {
                i11 = AbstractC2807a.layer_background_selected;
            } else {
                i11 = AbstractC2807a.banner_container_warning;
            }
            gradientDrawable.setColor(C23212s8.m119606n(i11));
            ProgressBar progressBar = this.f71812K.f139738u;
            ViewGroup.LayoutParams layoutParams = progressBar.getLayoutParams();
            AbstractC19074t.m100206d(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = AbstractC23222t7.f112566j;
            progressBar.setVisibility(0);
            progressBar.setProgressIndicatorColor(C23212s8.m119607o(this.f71810I.getContext(), AbstractC2807a.storage_legend_paused));
            progressBar.setProgressBackgroundColor(C23212s8.m119607o(this.f71810I.getContext(), AbstractC2807a.storage_legend_empty));
            progressBar.setProgress((int) abstractC16889b.m90259b());
            RobotoTextView robotoTextView = this.f71812K.f139739v;
            boolean z11 = abstractC16889b instanceof AbstractC16889b.d;
            if (z11) {
                if (AbstractC23152n3.m119051k(robotoTextView.getContext())) {
                    robotoTextView.setTag(Integer.valueOf(AbstractC6918a0.zhome_bottom_banner_clean_storage_cta));
                    m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_clean_up_storage);
                } else {
                    robotoTextView.setTag(Integer.valueOf(AbstractC6918a0.zhome_bottom_banner_view_instruction_cta));
                    m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_view_instructions);
                }
            } else {
                robotoTextView.setTag(Integer.valueOf(AbstractC6918a0.zhome_bottom_banner_resume_download_cta));
                m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_continue_download);
            }
            robotoTextView.setText(m118743r0);
            boolean z12 = abstractC16889b instanceof AbstractC16889b.a;
            if (z12 || (abstractC16889b instanceof AbstractC16889b.b)) {
                i12 = 8;
            } else {
                i12 = 0;
            }
            robotoTextView.setVisibility(i12);
            RobotoTextView robotoTextView2 = this.f71812K.f139737t;
            robotoTextView2.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_media_download_paused));
            robotoTextView2.setVisibility(0);
            RobotoTextView robotoTextView3 = this.f71812K.f139735r;
            if (z12) {
                m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_err_battery);
            } else if (abstractC16889b instanceof AbstractC16889b.b) {
                m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_err_wifi);
            } else if (z11) {
                String m111038f = C21459a.m111038f(((AbstractC16889b.d) abstractC16889b).m90260c(), 0, 2, null);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(AbstractC23136l9.m118746s0(AbstractC8020f0.str_your_device_needs_more_free_space, m111038f));
                StyleSpan styleSpan = new StyleSpan(1);
                m127173b0 = AbstractC24342w.m127173b0(spannableStringBuilder, m111038f, 0, false, 6, null);
                m127173b02 = AbstractC24342w.m127173b0(spannableStringBuilder, m111038f, 0, false, 6, null);
                spannableStringBuilder.setSpan(styleSpan, m127173b0, m127173b02 + m111038f.length(), 18);
                m118743r02 = spannableStringBuilder;
            } else {
                m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_err_unknown);
            }
            robotoTextView3.setText(m118743r02);
            robotoTextView3.setVisibility(0);
            this.f71812K.f139741x.setVisibility(8);
            this.f71812K.f139740w.setVisibility(8);
            this.f71812K.f139734q.setVisibility(8);
        }

        /* renamed from: n0 */
        public void m77555n0(AbstractC13923f.k kVar, int i11) {
            float f11;
            AbstractC19074t.m100208f(kVar, "data");
            ZaloCloudRecoverCloudMediaWorker.AbstractC16884f m77516b = kVar.m77516b();
            if ((m77516b instanceof ZaloCloudRecoverCloudMediaWorker.AbstractC16884f.d) || (m77516b instanceof ZaloCloudRecoverCloudMediaWorker.AbstractC16884f.a)) {
                if (m77516b instanceof ZaloCloudRecoverCloudMediaWorker.AbstractC16884f.a) {
                    f11 = ((ZaloCloudRecoverCloudMediaWorker.AbstractC16884f.a) m77516b).m90209b();
                } else {
                    f11 = 1.0f;
                }
                this.f71813L.setColor(C23212s8.m119606n(AbstractC2807a.banner_container_informative));
                ProgressBar progressBar = this.f71812K.f139738u;
                ViewGroup.LayoutParams layoutParams = progressBar.getLayoutParams();
                AbstractC19074t.m100206d(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = AbstractC23222t7.f112556e;
                progressBar.setVisibility(0);
                progressBar.setProgressIndicatorColor(C23212s8.m119607o(this.f71810I.getContext(), AbstractC2807a.progress_indicator_blue));
                progressBar.setProgressBackgroundColor(C23212s8.m119607o(this.f71810I.getContext(), AbstractC2807a.progress_track_background_black));
                progressBar.setProgress((int) f11);
                RobotoTextView robotoTextView = this.f71812K.f139741x;
                DecimalFormat decimalFormat = new DecimalFormat("0.00");
                decimalFormat.setRoundingMode(RoundingMode.FLOOR);
                robotoTextView.setText(decimalFormat.format(Float.valueOf(f11)) + "%");
                robotoTextView.setVisibility(0);
                RobotoTextView robotoTextView2 = this.f71812K.f139739v;
                robotoTextView2.setTag(Integer.valueOf(AbstractC6918a0.zhome_bottom_banner_view_detail_cta));
                robotoTextView2.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_view_details));
                robotoTextView2.setVisibility(0);
                this.f71812K.f139740w.setVisibility(0);
                this.f71812K.f139737t.setVisibility(8);
                this.f71812K.f139735r.setVisibility(8);
                this.f71812K.f139734q.setVisibility(8);
                return;
            }
            if (m77516b instanceof ZaloCloudRecoverCloudMediaWorker.AbstractC16884f.b) {
                m77554o0(((ZaloCloudRecoverCloudMediaWorker.AbstractC16884f.b) m77516b).m90210b());
                return;
            }
            if (m77516b instanceof ZaloCloudRecoverCloudMediaWorker.AbstractC16884f.c) {
                this.f71813L.setColor(C23212s8.m119606n(AbstractC2807a.banner_container_warning));
                long m2457f = AbstractC23306f.m120691m2().m2457f(true);
                C0860a m120691m2 = AbstractC23306f.m120691m2();
                AbstractC19074t.m100207e(m120691m2, "provideZaloCloudSubscriptionManager(...)");
                long m2453g = C0860a.m2453g(m120691m2, false, 1, null);
                RobotoTextView robotoTextView3 = this.f71812K.f139737t;
                robotoTextView3.setText(this.f71810I.getResources().getQuantityString(AbstractC7921d0.str_zhome_grace_period_banner_title, (int) m2453g, Long.valueOf(m2453g)));
                robotoTextView3.setVisibility(0);
                RobotoTextView robotoTextView4 = this.f71812K.f139735r;
                robotoTextView4.setText(AbstractC23136l9.m118746s0(AbstractC8020f0.str_zhome_grace_period_banner_desc, new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault()).format(Long.valueOf(m2457f))));
                robotoTextView4.setVisibility(0);
                this.f71812K.f139741x.setVisibility(8);
                this.f71812K.f139738u.setVisibility(8);
                this.f71812K.f139740w.setVisibility(8);
                this.f71812K.f139739v.setVisibility(8);
                this.f71812K.f139734q.setVisibility(0);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.home.h$l */
    /* loaded from: classes6.dex */
    public static final class l extends AbstractC13925h {

        /* renamed from: I */
        private final View f71814I;

        /* renamed from: J */
        private final InterfaceC13924g f71815J;

        /* renamed from: K */
        private final C30091vf f71816K;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(View view, InterfaceC13924g interfaceC13924g) {
            super(view, null);
            AbstractC19074t.m100208f(view, "view");
            AbstractC19074t.m100208f(interfaceC13924g, "listener");
            this.f71814I = view;
            this.f71815J = interfaceC13924g;
            C30091vf m148631a = C30091vf.m148631a(this.f7784p);
            AbstractC19074t.m100207e(m148631a, "bind(...)");
            this.f71816K = m148631a;
            RelativeLayout root = m148631a.getRoot();
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(C23212s8.m119607o(view.getContext(), AbstractC2807a.banner_container_informative));
            gradientDrawable.setCornerRadius(AbstractC23222t7.f112576o);
            root.setBackground(gradientDrawable);
            RobotoTextView robotoTextView = m148631a.f139739v;
            robotoTextView.setTag(Integer.valueOf(AbstractC6918a0.zhome_bottom_banner_migrate_cta));
            robotoTextView.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_back_to_tab_chat_banner_btn));
            robotoTextView.setOnClickListener(new View.OnClickListener() { // from class: bc0.j0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    AbstractC13925h.l.m77557l0(AbstractC13925h.l.this, view2);
                }
            });
            robotoTextView.setVisibility(0);
            ViewGroup.LayoutParams layoutParams = robotoTextView.getLayoutParams();
            AbstractC19074t.m100206d(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = AbstractC23222t7.f112576o;
            AppCompatImageView appCompatImageView = m148631a.f139736s;
            Context context = view.getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            appCompatImageView.setImageDrawable(C27280g.m139660c(context, AbstractC2810d.zds_ic_info_circle_solid_24, AbstractC2807a.information_icon));
            RobotoTextView robotoTextView2 = m148631a.f139735r;
            robotoTextView2.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_migrate_bottom_banner_desc));
            ViewGroup.LayoutParams layoutParams2 = robotoTextView2.getLayoutParams();
            AbstractC19074t.m100206d(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = 0;
            ViewGroup.LayoutParams layoutParams3 = robotoTextView2.getLayoutParams();
            AbstractC19074t.m100206d(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams3).leftMargin = AbstractC23222t7.f112576o;
            m148631a.f139737t.setVisibility(8);
            m148631a.f139734q.setVisibility(8);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: l0 */
        public static final void m77557l0(l lVar, View view) {
            AbstractC19074t.m100208f(lVar, "this$0");
            if (AbstractC19074t.m100204b(view.getTag(), Integer.valueOf(AbstractC6918a0.zhome_bottom_banner_migrate_cta))) {
                lVar.f71815J.mo77401g();
            }
        }

        /* renamed from: k0 */
        public void m77558k0(AbstractC13923f.l lVar, int i11) {
            AbstractC19074t.m100208f(lVar, "data");
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.home.h$m */
    /* loaded from: classes6.dex */
    public static final class m extends AbstractC13925h {

        /* renamed from: I */
        private final InterfaceC13924g f71817I;

        /* renamed from: J */
        private final C30142yf f71818J;

        /* renamed from: com.zing.zalo.ui.zalocloud.home.h$m$a */
        /* loaded from: classes6.dex */
        public /* synthetic */ class a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f71819a;

            static {
                int[] iArr = new int[EnumC28993p.values().length];
                try {
                    iArr[EnumC28993p.f134266p.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC28993p.f134267q.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC28993p.f134268r.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[EnumC28993p.f134269s.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[EnumC28993p.f134270t.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[EnumC28993p.f134271u.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                f71819a = iArr;
            }
        }

        /* renamed from: com.zing.zalo.ui.zalocloud.home.h$m$b */
        /* loaded from: classes6.dex */
        public static final class b extends ClickableSpan {

            /* renamed from: p */
            final /* synthetic */ String f71820p;

            /* renamed from: q */
            final /* synthetic */ m f71821q;

            b(String str, m mVar) {
                this.f71820p = str;
                this.f71821q = mVar;
            }

            @Override // android.text.style.ClickableSpan
            public void onClick(View view) {
                AbstractC19074t.m100208f(view, "textView");
                String str = this.f71820p;
                if (AbstractC19074t.m100204b(str, AbstractC23136l9.m118743r0(AbstractC8020f0.str_zcloud_migration_delete_backup_and_resume_cta))) {
                    this.f71821q.m77561l0().mo77407m();
                } else if (AbstractC19074t.m100204b(str, AbstractC23136l9.m118743r0(AbstractC8020f0.str_zcloud_migration_try_again_cta))) {
                    this.f71821q.m77561l0().mo77406l();
                } else {
                    this.f71821q.m77561l0().mo77396b();
                }
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public void updateDrawState(TextPaint textPaint) {
                AbstractC19074t.m100208f(textPaint, "ds");
                super.updateDrawState(textPaint);
                textPaint.setColor(C23212s8.m119607o(this.f71821q.f7784p.getContext(), AbstractC2807a.cta_link));
                textPaint.setUnderlineText(false);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(View view, InterfaceC13924g interfaceC13924g) {
            super(view, null);
            AbstractC19074t.m100208f(view, "itemView");
            AbstractC19074t.m100208f(interfaceC13924g, "listener");
            this.f71817I = interfaceC13924g;
            C30142yf m148753a = C30142yf.m148753a(view);
            AbstractC19074t.m100207e(m148753a, "bind(...)");
            this.f71818J = m148753a;
            m148753a.f140059s.setMovementMethod(LinkMovementMethod.getInstance());
        }

        /* renamed from: j0 */
        private final SpannableString m77559j0(String str, String str2) {
            SpannableString spannableString = new SpannableString(str + " " + str2);
            b bVar = new b(str2, this);
            int length = str.length() + 1;
            int length2 = spannableString.length();
            spannableString.setSpan(bVar, length, length2, 33);
            spannableString.setSpan(new StyleSpan(1), length, length2, 33);
            spannableString.setSpan(new AbsoluteSizeSpan(AbstractC23222t7.f112582r), length, length2, 33);
            return spannableString;
        }

        /* renamed from: k0 */
        public void m77560k0(AbstractC13923f.m mVar, int i11) {
            boolean z11;
            CharSequence m77559j0;
            int m104529e;
            int m127173b0;
            int m127173b02;
            CharSequence charSequence;
            AbstractC19074t.m100208f(mVar, "data");
            AbstractC28981d m77517b = mVar.m77517b();
            if (m77517b instanceof AbstractC28981d.a) {
                Context context = this.f71818J.getRoot().getContext();
                AbstractC19074t.m100207e(context, "getContext(...)");
                C26703b m137293a = C26705d.m137293a(context, AbstractC2814h.t_normal);
                RobotoTextView robotoTextView = this.f71818J.f140059s;
                AbstractC19074t.m100207e(robotoTextView, "tvTitle");
                new C26708g(robotoTextView).m137319a(m137293a);
                this.f71818J.f140059s.setTextColor(C23212s8.m119607o(this.f7784p.getContext(), AbstractC2807a.text_primary));
                RobotoTextView robotoTextView2 = this.f71818J.f140059s;
                switch (a.f71819a[((AbstractC28981d.a) mVar.m77517b()).m144699f().ordinal()]) {
                    case 1:
                        SpannableString spannableString = new SpannableString(AbstractC23136l9.m118746s0(AbstractC8020f0.str_zcloud_migration_battery_error_zcloud_home_title, "15%"));
                        StyleSpan styleSpan = new StyleSpan(1);
                        m127173b0 = AbstractC24342w.m127173b0(spannableString, "15%", 0, false, 6, null);
                        m127173b02 = AbstractC24342w.m127173b0(spannableString, "15%", 0, false, 6, null);
                        spannableString.setSpan(styleSpan, m127173b0, m127173b02 + 3, 18);
                        charSequence = spannableString;
                        break;
                    case 2:
                        charSequence = AbstractC23136l9.m118743r0(AbstractC8020f0.str_zcloud_migration_network_error_zcloud_home_title);
                        break;
                    case 3:
                        charSequence = AbstractC23136l9.m118746s0(AbstractC8020f0.str_zcloud_migration_default_error_zcloud_home_title, C16805b.Companion.m89811a().m89800f());
                        break;
                    case 4:
                        charSequence = AbstractC23136l9.m118746s0(AbstractC8020f0.str_zcloud_migration_default_error_zcloud_home_title, C16805b.Companion.m89811a().m89800f());
                        break;
                    case 5:
                        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_zcloud_migration_restore_message_error_zcloud_home_title);
                        AbstractC19074t.m100207e(m118743r0, "getString(...)");
                        String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_zcloud_migration_delete_backup_and_resume_cta);
                        AbstractC19074t.m100207e(m118743r02, "getString(...)");
                        charSequence = m77559j0(m118743r0, m118743r02);
                        break;
                    case 6:
                        String m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.f43879x802c4731);
                        AbstractC19074t.m100207e(m118743r03, "getString(...)");
                        String m118743r04 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_zcloud_migration_try_again_cta);
                        AbstractC19074t.m100207e(m118743r04, "getString(...)");
                        charSequence = m77559j0(m118743r03, m118743r04);
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                robotoTextView2.setText(charSequence);
                this.f71818J.f140058r.setVisibility(8);
                C30142yf c30142yf = this.f71818J;
                c30142yf.f140057q.setProgressIndicatorColor(C23212s8.m119607o(c30142yf.getRoot().getContext(), AbstractC2807a.storage_legend_paused));
                C30142yf c30142yf2 = this.f71818J;
                c30142yf2.f140057q.setProgressBackgroundColor(C23212s8.m119607o(c30142yf2.getRoot().getContext(), AbstractC2807a.storage_legend_empty));
            } else if ((m77517b instanceof AbstractC28981d.f) || (m77517b instanceof AbstractC28981d.d) || (m77517b instanceof AbstractC28981d.b)) {
                Context context2 = this.f71818J.getRoot().getContext();
                AbstractC19074t.m100207e(context2, "getContext(...)");
                C26703b m137293a2 = C26705d.m137293a(context2, AbstractC2814h.t_small);
                RobotoTextView robotoTextView3 = this.f71818J.f140059s;
                AbstractC19074t.m100207e(robotoTextView3, "tvTitle");
                new C26708g(robotoTextView3).m137319a(m137293a2);
                this.f71818J.f140059s.setTextColor(C23212s8.m119607o(this.f7784p.getContext(), AbstractC2807a.text_primary));
                this.f71818J.f140059s.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_zcloud_home_migration_progressing));
                DecimalFormat decimalFormat = new DecimalFormat("0.00");
                decimalFormat.setRoundingMode(RoundingMode.FLOOR);
                String str = decimalFormat.format(Float.valueOf(mVar.m77517b().m144695b() * 100.0f)) + "%";
                this.f71818J.f140058r.setVisibility(0);
                this.f71818J.f140058r.setText(str);
                C30142yf c30142yf3 = this.f71818J;
                c30142yf3.f140057q.setProgressIndicatorColor(C23212s8.m119607o(c30142yf3.getRoot().getContext(), AbstractC2807a.progress_indicator_blue));
                C30142yf c30142yf4 = this.f71818J;
                c30142yf4.f140057q.setProgressBackgroundColor(C23212s8.m119607o(c30142yf4.getRoot().getContext(), AbstractC2807a.progress_track_background_black));
            } else if (m77517b instanceof AbstractC28981d.c) {
                InterfaceC28990m m144694a = mVar.m77517b().m144694a(0);
                if (m144694a != null) {
                    z11 = m144694a.mo90081b();
                } else {
                    z11 = false;
                }
                Context context3 = this.f71818J.getRoot().getContext();
                AbstractC19074t.m100207e(context3, "getContext(...)");
                C26703b m137293a3 = C26705d.m137293a(context3, AbstractC2814h.t_normal);
                RobotoTextView robotoTextView4 = this.f71818J.f140059s;
                AbstractC19074t.m100207e(robotoTextView4, "tvTitle");
                new C26708g(robotoTextView4).m137319a(m137293a3);
                this.f71818J.f140059s.setTextColor(C23212s8.m119607o(this.f7784p.getContext(), AbstractC2807a.text_primary));
                RobotoTextView robotoTextView5 = this.f71818J.f140059s;
                if (z11) {
                    m77559j0 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_zcloud_migration_default_error_zcloud_home_title, C16805b.Companion.m89811a().m89800f());
                } else {
                    String m118743r05 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_zcloud_migration_unknown_error);
                    AbstractC19074t.m100207e(m118743r05, "getString(...)");
                    String m118743r06 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_zcloud_migration_resume_migrate_cta);
                    AbstractC19074t.m100207e(m118743r06, "getString(...)");
                    m77559j0 = m77559j0(m118743r05, m118743r06);
                }
                robotoTextView5.setText(m77559j0);
                this.f71818J.f140058r.setVisibility(8);
                C30142yf c30142yf5 = this.f71818J;
                c30142yf5.f140057q.setProgressIndicatorColor(C23212s8.m119607o(c30142yf5.getRoot().getContext(), AbstractC2807a.storage_legend_paused));
                C30142yf c30142yf6 = this.f71818J;
                c30142yf6.f140057q.setProgressBackgroundColor(C23212s8.m119607o(c30142yf6.getRoot().getContext(), AbstractC2807a.storage_legend_empty));
            } else {
                return;
            }
            ProgressBar progressBar = this.f71818J.f140057q;
            m104529e = AbstractC20104d.m104529e(mVar.m77517b().m144695b() * 100.0f);
            progressBar.setProgress(m104529e);
        }

        /* renamed from: l0 */
        public final InterfaceC13924g m77561l0() {
            return this.f71817I;
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.home.h$n */
    /* loaded from: classes6.dex */
    public static final class n extends AbstractC13925h {

        /* renamed from: I */
        private final ListItem f71822I;

        /* renamed from: J */
        private final InterfaceC13924g f71823J;

        /* renamed from: K */
        private final InterfaceC24854k f71824K;

        /* renamed from: L */
        private final InterfaceC24854k f71825L;

        /* renamed from: com.zing.zalo.ui.zalocloud.home.h$n$a */
        /* loaded from: classes6.dex */
        public /* synthetic */ class a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f71826a;

            /* renamed from: b */
            public static final /* synthetic */ int[] f71827b;

            static {
                int[] iArr = new int[EnumC24251b.values().length];
                try {
                    iArr[EnumC24251b.f117147r.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC24251b.f117148s.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC24251b.f117146q.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f71826a = iArr;
                int[] iArr2 = new int[EnumC2746k.values().length];
                try {
                    iArr2[EnumC2746k.f10889q.ordinal()] = 1;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr2[EnumC2746k.f10890r.ordinal()] = 2;
                } catch (NoSuchFieldError unused5) {
                }
                f71827b = iArr2;
            }
        }

        /* renamed from: com.zing.zalo.ui.zalocloud.home.h$n$b */
        /* loaded from: classes6.dex */
        public static final class b extends ClickableSpan {

            /* renamed from: q */
            final /* synthetic */ AbstractC13923f.n f71829q;

            b(AbstractC13923f.n nVar) {
                this.f71829q = nVar;
            }

            @Override // android.text.style.ClickableSpan
            public void onClick(View view) {
                AbstractC19074t.m100208f(view, "textView");
                n.this.m77566n0().mo77408n(this.f71829q);
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public void updateDrawState(TextPaint textPaint) {
                AbstractC19074t.m100208f(textPaint, "ds");
                super.updateDrawState(textPaint);
                textPaint.setColor(C23212s8.m119607o(n.this.f7784p.getContext(), AbstractC2807a.cta_link));
                textPaint.setUnderlineText(false);
            }
        }

        /* renamed from: com.zing.zalo.ui.zalocloud.home.h$n$c */
        /* loaded from: classes6.dex */
        static final class c extends AbstractC19075u implements InterfaceC18494a {
            c() {
                super(0);
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final AppCompatImageView mo12V4() {
                return new AppCompatImageView(n.this.m77565m0().getContext());
            }
        }

        /* renamed from: com.zing.zalo.ui.zalocloud.home.h$n$d */
        /* loaded from: classes6.dex */
        static final class d extends AbstractC19075u implements InterfaceC18494a {
            d() {
                super(0);
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ProgressBar mo12V4() {
                Context context = n.this.m77565m0().getContext();
                AbstractC19074t.m100207e(context, "getContext(...)");
                ProgressBar progressBar = new ProgressBar(context, AbstractC2814h.ProgressBar_Size16_Blue);
                progressBar.setIndeterminate(true);
                progressBar.setProgressIndicatorColor(C23212s8.m119606n(AbstractC2807a.progress_indicator_blue));
                progressBar.setProgressBackgroundColor(C23212s8.m119606n(AbstractC2807a.progress_track_background_black));
                return progressBar;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(ListItem listItem, InterfaceC13924g interfaceC13924g) {
            super(listItem, null);
            InterfaceC24854k m129210a;
            InterfaceC24854k m129210a2;
            AbstractC19074t.m100208f(listItem, "listItem");
            AbstractC19074t.m100208f(interfaceC13924g, "listener");
            this.f71822I = listItem;
            this.f71823J = interfaceC13924g;
            m129210a = AbstractC24856m.m129210a(new c());
            this.f71824K = m129210a;
            m129210a2 = AbstractC24856m.m129210a(new d());
            this.f71825L = m129210a2;
            listItem.setTitleColor(C23212s8.m119606n(AbstractC2807a.text_secondary));
            listItem.setSubtitleColor(C23212s8.m119606n(AbstractC2807a.list_item_subtitle));
            listItem.m90592m(false);
            listItem.setPadding(AbstractC23222t7.f112586t, AbstractC23222t7.f112576o, AbstractC23222t7.f112586t, AbstractC23222t7.f112576o);
            listItem.setSubtitleMaxLine(2);
            listItem.m90587c(m77567o0());
            ViewParent parent = m77567o0().getParent();
            AbstractC19074t.m100206d(parent, "null cannot be cast to non-null type android.widget.FrameLayout");
            ViewGroup.LayoutParams layoutParams = ((FrameLayout) parent).getLayoutParams();
            AbstractC19074t.m100206d(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            ((LinearLayout.LayoutParams) layoutParams).rightMargin = AbstractC23222t7.f112576o;
            Context context = listItem.getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            C26703b m137293a = C26705d.m137293a(context, AbstractC2814h.t_xxsmall);
            RobotoTextView robotoTextView = (RobotoTextView) listItem.findViewById(AbstractC2811e.subtitle_list_item);
            AbstractC19074t.m100205c(robotoTextView);
            new C26708g(robotoTextView).m137319a(m137293a);
            robotoTextView.setMovementMethod(LinkMovementMethod.getInstance());
            listItem.setSubtitleColor(C23212s8.m119607o(listItem.getContext(), AbstractC2807a.list_item_subtitle));
        }

        /* renamed from: j0 */
        private final SpannableString m77562j0(String str, String str2, AbstractC13923f.n nVar) {
            SpannableString spannableString = new SpannableString(str + " " + str2);
            spannableString.setSpan(new b(nVar), str.length() + 1, spannableString.length(), 33);
            spannableString.setSpan(new StyleSpan(1), str.length() + 1, spannableString.length(), 33);
            return spannableString;
        }

        /* renamed from: k0 */
        public void m77563k0(AbstractC13923f.n nVar, int i11) {
            int m104529e;
            int i12;
            AbstractC19074t.m100208f(nVar, "data");
            super.m77521i0(nVar, i11);
            ListItem listItem = this.f71822I;
            EnumC24251b m77519c = nVar.m77519c();
            int[] iArr = a.f71826a;
            int i13 = iArr[m77519c.ordinal()];
            if (i13 != 1) {
                if (i13 != 2) {
                    if (i13 == 3) {
                        ListItem listItem2 = this.f71822I;
                        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_store_media_messages);
                        AbstractC19074t.m100207e(m118743r0, "getString(...)");
                        listItem2.setTitle(m118743r0);
                    }
                } else {
                    ListItem listItem3 = this.f71822I;
                    String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_connect_feature_backup);
                    AbstractC19074t.m100207e(m118743r02, "getString(...)");
                    listItem3.setTitle(m118743r02);
                }
            } else {
                ListItem listItem4 = this.f71822I;
                String m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_zcloud_features_connect_my_cloud_title);
                AbstractC19074t.m100207e(m118743r03, "getString(...)");
                listItem4.setTitle(m118743r03);
            }
            if (nVar.m77520d() == 100.0f) {
                if (!(this.f71822I.getLeadingItem() instanceof AppCompatImageView)) {
                    this.f71822I.m90587c(m77564l0());
                }
                AppCompatImageView m77564l0 = m77564l0();
                Context context = listItem.getContext();
                AbstractC19074t.m100207e(context, "getContext(...)");
                m77564l0.setImageDrawable(C27280g.m139660c(context, AbstractC2810d.zds_ic_check_solid_16, AbstractC2807a.success_icon));
                if (iArr[nVar.m77519c().ordinal()] == 3) {
                    if (nVar.m77518b() == EnumC2746k.f10888p) {
                        this.f71822I.setLeadingGravity(EnumC16952b0.TOP);
                        ListItem listItem5 = this.f71822I;
                        String m118743r04 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_zcloud_home_complete_mograte_cloud_media_description);
                        AbstractC19074t.m100207e(m118743r04, "getString(...)");
                        listItem5.setSubtitle(m118743r04);
                    } else {
                        this.f71822I.setLeadingGravity(EnumC16952b0.CENTER);
                        this.f71822I.setSubtitle("");
                    }
                } else {
                    this.f71822I.setLeadingGravity(EnumC16952b0.CENTER);
                    this.f71822I.setSubtitle("");
                }
            } else if (nVar.m77518b() == EnumC2746k.f10892t) {
                this.f71822I.setLeadingGravity(EnumC16952b0.CENTER);
                this.f71822I.setSubtitle("");
                if (!(this.f71822I.getLeadingItem() instanceof ProgressBar)) {
                    this.f71822I.m90587c(m77567o0());
                }
                ProgressBar m77567o0 = m77567o0();
                m104529e = AbstractC20104d.m104529e(nVar.m77520d());
                m77567o0.setProgress(m104529e);
            } else {
                if (!(this.f71822I.getLeadingItem() instanceof AppCompatImageView)) {
                    this.f71822I.m90587c(m77564l0());
                }
                AppCompatImageView m77564l02 = m77564l0();
                Context context2 = listItem.getContext();
                AbstractC19074t.m100207e(context2, "getContext(...)");
                m77564l02.setImageDrawable(C27280g.m139660c(context2, AbstractC2810d.zds_ic_warning_solid_16, AbstractC2807a.icon_tertiary));
                int i14 = a.f71827b[nVar.m77518b().ordinal()];
                if (i14 != 1) {
                    if (i14 != 2) {
                        this.f71822I.setSubtitle("");
                    } else {
                        ListItem listItem6 = this.f71822I;
                        String m118743r05 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_zcloud_transfer_backup_message_paused_by_password_old_backup);
                        AbstractC19074t.m100207e(m118743r05, "getString(...)");
                        String m118743r06 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_zcloud_migration_resolve_error_cta);
                        AbstractC19074t.m100207e(m118743r06, "getString(...)");
                        listItem6.setSubtitle(m77562j0(m118743r05, m118743r06, nVar));
                    }
                } else {
                    ListItem listItem7 = this.f71822I;
                    String m118743r07 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_zcloud_transfer_backup_message_paused_by_login_drive);
                    AbstractC19074t.m100207e(m118743r07, "getString(...)");
                    String m118743r08 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_zcloud_migration_resolve_error_cta);
                    AbstractC19074t.m100207e(m118743r08, "getString(...)");
                    listItem7.setSubtitle(m77562j0(m118743r07, m118743r08, nVar));
                }
                if (this.f71822I.getSubtitle().length() > 0) {
                    this.f71822I.setLeadingGravity(EnumC16952b0.TOP);
                } else {
                    this.f71822I.setLeadingGravity(EnumC16952b0.CENTER);
                }
            }
            View leadingItem = this.f71822I.getLeadingItem();
            if (leadingItem != null) {
                ViewGroup.LayoutParams layoutParams = leadingItem.getLayoutParams();
                AbstractC19074t.m100206d(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                if (this.f71822I.getSubtitle().length() > 0) {
                    i12 = AbstractC23222t7.f112554d;
                } else {
                    i12 = 0;
                }
                layoutParams2.topMargin = i12;
            }
        }

        /* renamed from: l0 */
        public final AppCompatImageView m77564l0() {
            return (AppCompatImageView) this.f71824K.getValue();
        }

        /* renamed from: m0 */
        public final ListItem m77565m0() {
            return this.f71822I;
        }

        /* renamed from: n0 */
        public final InterfaceC13924g m77566n0() {
            return this.f71823J;
        }

        /* renamed from: o0 */
        public final ProgressBar m77567o0() {
            return (ProgressBar) this.f71825L.getValue();
        }
    }

    public /* synthetic */ AbstractC13925h(View view, AbstractC19060k abstractC19060k) {
        this(view);
    }

    /* renamed from: i0 */
    public void m77521i0(AbstractC13923f abstractC13923f, int i11) {
        AbstractC19074t.m100208f(abstractC13923f, "data");
    }

    private AbstractC13925h(View view) {
        super(view);
    }
}
