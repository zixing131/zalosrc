package com.zing.zalo.p077ui.zalocloud.home;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextPaint;
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
import bc0.InterfaceC2726a;
import bi0.AbstractC2807a;
import bi0.AbstractC2810d;
import bi0.AbstractC2811e;
import bi0.AbstractC2814h;
import com.zing.zalo.AbstractC7921d0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.data.zalocloud.model.ZCloudQuotaUsage;
import com.zing.zalo.p077ui.toolstorage.overview.ToolStorageChartView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zalocloud.home.AbstractC13919b;
import com.zing.zalo.p077ui.zalocloud.home.AbstractC13920c;
import com.zing.zalo.zalocloud.configs.C16805b;
import com.zing.zalo.zdesign.component.Button;
import com.zing.zalo.zdesign.component.EnumC16952b0;
import com.zing.zalo.zdesign.component.ListItem;
import com.zing.zalo.zdesign.component.ProgressBar;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import hn0.AbstractC20104d;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import k30.C21459a;
import ln0.AbstractC22543l;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import me0.C23212s8;
import p649xl.C30057tf;
import p649xl.C30108wf;
import p649xl.C30142yf;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import qm0.AbstractC25366r;
import ti0.C26703b;
import ti0.C26705d;
import ti0.C26708g;
import ui0.C27280g;
import wg0.AbstractC28981d;
import wg0.EnumC28993p;
import ya0.C30876a;
import ya0.C30877b;

/* renamed from: com.zing.zalo.ui.zalocloud.home.c */
/* loaded from: classes6.dex */
public abstract class AbstractC13920c extends RecyclerView.AbstractC1876c0 {

    /* renamed from: com.zing.zalo.ui.zalocloud.home.c$a */
    /* loaded from: classes6.dex */
    public static final class a extends AbstractC13920c {

        /* renamed from: I */
        private final C30057tf f71732I;

        /* renamed from: J */
        private final InterfaceC2726a f71733J;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public a(C30057tf c30057tf, InterfaceC2726a interfaceC2726a) {
            super(r0, null);
            AbstractC19074t.m100208f(c30057tf, "binding");
            AbstractC19074t.m100208f(interfaceC2726a, "cloudMediaHomeListener");
            RelativeLayout root = c30057tf.getRoot();
            AbstractC19074t.m100207e(root, "getRoot(...)");
            this.f71732I = c30057tf;
            this.f71733J = interfaceC2726a;
            c30057tf.getRoot().setBackgroundColor(C23212s8.m119606n(AbstractC2807a.layer_background_selected));
            RelativeLayout root2 = c30057tf.getRoot();
            int i11 = AbstractC23222t7.f112586t;
            root2.setPadding(i11, 0, i11, 0);
            ZAppCompatImageView zAppCompatImageView = c30057tf.f139517u;
            Context context = this.f7784p.getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            zAppCompatImageView.setImageDrawable(C27280g.m139660c(context, AbstractC2810d.zds_ic_backup_warning_solid_24, AbstractC2807a.icon_tertiary));
            c30057tf.f139515s.setVisibility(8);
            c30057tf.f139514r.setVisibility(0);
            c30057tf.f139514r.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_zcloud_cloud_media_home_banner));
            c30057tf.f139514r.setTextColor(C23212s8.m119606n(AbstractC2807a.banner_description));
            c30057tf.f139513q.setVisibility(0);
            c30057tf.f139513q.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_zcloud_migration_resolve_error_cta));
            c30057tf.f139513q.setOnClickListener(new View.OnClickListener() { // from class: bc0.f
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AbstractC13920c.a.m77456k0(AbstractC13920c.a.this, view);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: k0 */
        public static final void m77456k0(a aVar, View view) {
            AbstractC19074t.m100208f(aVar, "this$0");
            aVar.f71733J.mo13299e();
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.home.c$b */
    /* loaded from: classes6.dex */
    public static final class b extends AbstractC13920c {

        /* renamed from: I */
        private final C30108wf f71734I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(View view) {
            super(view, null);
            AbstractC19074t.m100208f(view, "itemView");
            C30108wf m148669a = C30108wf.m148669a(view);
            AbstractC19074t.m100207e(m148669a, "bind(...)");
            this.f71734I = m148669a;
        }

        /* renamed from: j0 */
        public void m77457j0(AbstractC13919b.c cVar) {
            long m116581d;
            int m119606n;
            AbstractC19074t.m100208f(cVar, "data");
            if (cVar instanceof AbstractC13919b.c.a) {
                ZCloudQuotaUsage m77437b = ((AbstractC13919b.c.a) cVar).m77437b();
                this.f71734I.f139849r.setText(AbstractC23136l9.m118746s0(AbstractC8020f0.str_zcloud_chart_title, C16805b.Companion.m89811a().m89800f()));
                RobotoTextView robotoTextView = this.f71734I.f139848q;
                String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_my_cloud_quota_usage);
                AbstractC19074t.m100207e(m118743r0, "getString(...)");
                m116581d = AbstractC22543l.m116581d(m77437b.m41253k(), 0L);
                String format = String.format(m118743r0, Arrays.copyOf(new Object[]{C21459a.m111038f(m116581d, 0, 2, null), C21459a.m111038f(m77437b.m41252j(), 0, 2, null)}, 2));
                AbstractC19074t.m100207e(format, "format(...)");
                robotoTextView.setText(format);
                this.f71734I.f139848q.setVisibility(0);
                RobotoTextView robotoTextView2 = this.f71734I.f139848q;
                if (m77437b.m41252j() > 0 && m77437b.m41256n()) {
                    m119606n = C23212s8.m119606n(AbstractC2807a.accent_red_text);
                } else {
                    m119606n = C23212s8.m119606n(AbstractC2807a.text_tertiary);
                }
                robotoTextView2.setTextColor(m119606n);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.home.c$c */
    /* loaded from: classes6.dex */
    public static final class c extends AbstractC13920c {

        /* renamed from: I */
        private final ToolStorageChartView f71735I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ToolStorageChartView toolStorageChartView) {
            super(toolStorageChartView, null);
            AbstractC19074t.m100208f(toolStorageChartView, "itemView");
            this.f71735I = toolStorageChartView;
        }

        /* renamed from: k0 */
        private final void m77458k0(ZCloudQuotaUsage zCloudQuotaUsage) {
            List m131496e;
            List m131496e2;
            Context context = this.f7784p.getContext();
            if (zCloudQuotaUsage.m41255m()) {
                ToolStorageChartView toolStorageChartView = this.f71735I;
                String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_my_cloud_quota_error_state);
                AbstractC19074t.m100207e(m118743r0, "getString(...)");
                m131496e2 = AbstractC25366r.m131496e(new C30876a(m118743r0, C23212s8.m119611s(context, AbstractC2807a.storage_legend_empty), 1L, C23212s8.m119611s(context, AbstractC2807a.error_text), false, false, null, 80, null));
                toolStorageChartView.setStorageBreakdown(new C30877b(m131496e2));
                return;
            }
            if (!zCloudQuotaUsage.m41257o()) {
                ToolStorageChartView toolStorageChartView2 = this.f71735I;
                String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_my_cloud_quota_calculting_state);
                AbstractC19074t.m100207e(m118743r02, "getString(...)");
                m131496e = AbstractC25366r.m131496e(new C30876a(m118743r02, C23212s8.m119611s(context, AbstractC2807a.storage_legend_empty), 1L, 0, false, false, null, 88, null));
                toolStorageChartView2.setStorageBreakdown(new C30877b(m131496e));
                return;
            }
            this.f71735I.m75330X(zCloudQuotaUsage, ToolStorageChartView.EnumC13436b.f68805r);
        }

        /* renamed from: j0 */
        public void m77459j0(AbstractC13919b.b bVar) {
            AbstractC19074t.m100208f(bVar, "data");
            if (bVar instanceof AbstractC13919b.b.a) {
                m77458k0(((AbstractC13919b.b.a) bVar).m77435b());
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.home.c$d */
    /* loaded from: classes6.dex */
    public static final class d extends AbstractC13920c {

        /* renamed from: I */
        private final ListItem f71736I;

        /* renamed from: J */
        private final InterfaceC2726a f71737J;

        /* renamed from: K */
        private final InterfaceC24854k f71738K;

        /* renamed from: com.zing.zalo.ui.zalocloud.home.c$d$a */
        /* loaded from: classes6.dex */
        public /* synthetic */ class a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f71739a;

            static {
                int[] iArr = new int[AbstractC13919b.d.a.values().length];
                try {
                    iArr[AbstractC13919b.d.a.f71707p.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[AbstractC13919b.d.a.f71708q.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f71739a = iArr;
            }
        }

        /* renamed from: com.zing.zalo.ui.zalocloud.home.c$d$b */
        /* loaded from: classes6.dex */
        static final class b extends AbstractC19075u implements InterfaceC18494a {
            b() {
                super(0);
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Button mo12V4() {
                Context context = d.this.f71736I.getContext();
                AbstractC19074t.m100207e(context, "getContext(...)");
                Button button = new Button(context);
                button.m90539c(AbstractC2814h.ButtonMedium_SecondaryNeutral);
                button.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
                button.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_tool_storage_overview_view_and_clean_up));
                return button;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ListItem listItem, InterfaceC2726a interfaceC2726a) {
            super(listItem, null);
            InterfaceC24854k m129210a;
            AbstractC19074t.m100208f(listItem, "itemView");
            AbstractC19074t.m100208f(interfaceC2726a, "cloudMediaHomeListener");
            this.f71736I = listItem;
            this.f71737J = interfaceC2726a;
            m129210a = AbstractC24856m.m129210a(new b());
            this.f71738K = m129210a;
            listItem.setTitle("");
            int i11 = AbstractC23222t7.f112586t;
            int i12 = AbstractC23222t7.f112576o;
            int i13 = AbstractC23222t7.f112586t;
            listItem.setPadding(i11, i12, i13, i13);
            listItem.m90591l(AbstractC23222t7.f112586t, 0, 0, 0);
            listItem.m90588d(m77465p0());
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: n0 */
        public static final void m77463n0(d dVar, View view) {
            AbstractC19074t.m100208f(dVar, "this$0");
            dVar.f71737J.mo13298d();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: o0 */
        public static final void m77464o0(d dVar, View view) {
            AbstractC19074t.m100208f(dVar, "this$0");
            dVar.f71737J.mo13300f();
        }

        /* renamed from: p0 */
        private final Button m77465p0() {
            return (Button) this.f71738K.getValue();
        }

        /* renamed from: m0 */
        public void m77466m0(AbstractC13919b.d dVar) {
            AbstractC19074t.m100208f(dVar, "data");
            int i11 = a.f71739a[dVar.m77439b().ordinal()];
            if (i11 != 1) {
                if (i11 == 2) {
                    this.f71736I.getDivider().setVisibility(8);
                    m77465p0().setOnClickListener(new View.OnClickListener() { // from class: bc0.h
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            AbstractC13920c.d.m77464o0(AbstractC13920c.d.this, view);
                        }
                    });
                    return;
                }
                return;
            }
            this.f71736I.getDivider().setVisibility(0);
            m77465p0().setOnClickListener(new View.OnClickListener() { // from class: bc0.g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AbstractC13920c.d.m77463n0(AbstractC13920c.d.this, view);
                }
            });
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.home.c$e */
    /* loaded from: classes6.dex */
    public static final class e extends AbstractC13920c {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(View view) {
            super(view, null);
            AbstractC19074t.m100208f(view, "itemView");
            view.setLayoutParams(new ViewGroup.LayoutParams(-1, AbstractC23222t7.f112566j));
            view.setBackgroundColor(C23212s8.m119607o(view.getContext(), AbstractC2807a.surface_background));
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.home.c$f */
    /* loaded from: classes6.dex */
    public static final class f extends AbstractC13920c {

        /* renamed from: I */
        private final ListItem f71741I;

        /* renamed from: J */
        private final ZAppCompatImageView f71742J;

        /* renamed from: K */
        private final InterfaceC24854k f71743K;

        /* renamed from: com.zing.zalo.ui.zalocloud.home.c$f$a */
        /* loaded from: classes6.dex */
        public /* synthetic */ class a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f71744a;

            static {
                int[] iArr = new int[AbstractC13919b.f.b.values().length];
                try {
                    iArr[AbstractC13919b.f.b.f71717p.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[AbstractC13919b.f.b.f71718q.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[AbstractC13919b.f.b.f71719r.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[AbstractC13919b.f.b.f71720s.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f71744a = iArr;
            }
        }

        /* renamed from: com.zing.zalo.ui.zalocloud.home.c$f$b */
        /* loaded from: classes6.dex */
        static final class b extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ ListItem f71745q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(ListItem listItem) {
                super(0);
                this.f71745q = listItem;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final RobotoTextView mo12V4() {
                Context context = this.f71745q.getContext();
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
        public f(ListItem listItem) {
            super(listItem, null);
            InterfaceC24854k m129210a;
            AbstractC19074t.m100208f(listItem, "itemView");
            this.f71741I = listItem;
            ZAppCompatImageView zAppCompatImageView = new ZAppCompatImageView(listItem.getContext());
            zAppCompatImageView.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
            this.f71742J = zAppCompatImageView;
            m129210a = AbstractC24856m.m129210a(new b(listItem));
            this.f71743K = m129210a;
            listItem.m90587c(zAppCompatImageView);
            listItem.setTrailingGravity(EnumC16952b0.CENTER);
            listItem.getDivider().setVisibility(8);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x00f8  */
        /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
        /* renamed from: k0 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private final void m77468k0(AbstractC13919b.f.c cVar) {
            C24848g0 c24848g0;
            this.f71741I.setSubtitle("");
            this.f71741I.setLeadingGravity(EnumC16952b0.CENTER);
            this.f71741I.setTrailingItemVisibility(0);
            this.f71741I.setPadding(AbstractC23222t7.f112586t, AbstractC23222t7.f112566j, AbstractC23222t7.f112586t, AbstractC23222t7.f112566j);
            int i11 = a.f71744a[cVar.m77443b().ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 == 4) {
                            ZAppCompatImageView zAppCompatImageView = this.f71742J;
                            Context context = this.f7784p.getContext();
                            AbstractC19074t.m100207e(context, "getContext(...)");
                            zAppCompatImageView.setImageDrawable(C27280g.m139660c(context, AbstractC2810d.zds_ic_more_grid_line_24, AbstractC2807a.icon_tertiary));
                            ListItem listItem = this.f71741I;
                            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_cloud_media_type_other);
                            AbstractC19074t.m100207e(m118743r0, "getString(...)");
                            listItem.setTitle(m118743r0);
                        }
                    } else {
                        ZAppCompatImageView zAppCompatImageView2 = this.f71742J;
                        Context context2 = this.f7784p.getContext();
                        AbstractC19074t.m100207e(context2, "getContext(...)");
                        zAppCompatImageView2.setImageDrawable(C27280g.m139660c(context2, AbstractC2810d.zds_ic_file_line_24, AbstractC2807a.icon_tertiary));
                        ListItem listItem2 = this.f71741I;
                        String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_cloud_media_type_file);
                        AbstractC19074t.m100207e(m118743r02, "getString(...)");
                        listItem2.setTitle(m118743r02);
                    }
                } else {
                    ZAppCompatImageView zAppCompatImageView3 = this.f71742J;
                    Context context3 = this.f7784p.getContext();
                    AbstractC19074t.m100207e(context3, "getContext(...)");
                    zAppCompatImageView3.setImageDrawable(C27280g.m139660c(context3, AbstractC2810d.zds_ic_video_2_line_24, AbstractC2807a.icon_tertiary));
                    ListItem listItem3 = this.f71741I;
                    String m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_cloud_media_type_video);
                    AbstractC19074t.m100207e(m118743r03, "getString(...)");
                    listItem3.setTitle(m118743r03);
                }
            } else {
                ZAppCompatImageView zAppCompatImageView4 = this.f71742J;
                Context context4 = this.f7784p.getContext();
                AbstractC19074t.m100207e(context4, "getContext(...)");
                zAppCompatImageView4.setImageDrawable(C27280g.m139660c(context4, AbstractC2810d.zds_ic_photo_line_24, AbstractC2807a.icon_tertiary));
                ListItem listItem4 = this.f71741I;
                String m118743r04 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_cloud_media_type_photo);
                AbstractC19074t.m100207e(m118743r04, "getString(...)");
                listItem4.setTitle(m118743r04);
            }
            View trailingItem = this.f71741I.getTrailingItem();
            if (trailingItem != null) {
                if (!(trailingItem instanceof RobotoTextView)) {
                    trailingItem = null;
                }
                if (trailingItem != null) {
                    m77470m0().setText(C21459a.m111038f(cVar.m77444c(), 0, 2, null));
                    c24848g0 = C24848g0.f119245a;
                    if (c24848g0 != null) {
                        this.f71741I.m90589e(m77470m0());
                        m77470m0().setText(C21459a.m111038f(cVar.m77444c(), 0, 2, null));
                        return;
                    }
                    return;
                }
            }
            c24848g0 = null;
            if (c24848g0 != null) {
            }
        }

        /* renamed from: l0 */
        private final void m77469l0(AbstractC13919b.f.d dVar) {
            long m111040i = C21459a.m111040i(100);
            ListItem listItem = this.f71741I;
            String quantityString = this.f7784p.getContext().getResources().getQuantityString(AbstractC7921d0.str_conversation_count, dVar.m77446b(), Integer.valueOf(dVar.m77446b()));
            AbstractC19074t.m100207e(quantityString, "getQuantityString(...)");
            listItem.setTitle(quantityString);
            ListItem listItem2 = this.f71741I;
            String quantityString2 = this.f7784p.getContext().getResources().getQuantityString(AbstractC7921d0.str_conversation_by_size, dVar.m77447c(), Integer.valueOf(dVar.m77447c()), C21459a.m111038f(m111040i, 0, 2, null));
            AbstractC19074t.m100207e(quantityString2, "getQuantityString(...)");
            listItem2.setSubtitle(quantityString2);
            this.f71741I.setLeadingGravity(EnumC16952b0.TOP);
            this.f71741I.setPadding(AbstractC23222t7.f112586t, AbstractC23222t7.f112566j, AbstractC23222t7.f112586t, AbstractC23222t7.f112566j);
            this.f71741I.setTrailingItemVisibility(8);
            ZAppCompatImageView zAppCompatImageView = this.f71742J;
            Context context = this.f7784p.getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            zAppCompatImageView.setImageDrawable(C27280g.m139660c(context, AbstractC2810d.zds_ic_two_bubbles_line_24, AbstractC2807a.icon_tertiary));
        }

        /* renamed from: m0 */
        private final RobotoTextView m77470m0() {
            return (RobotoTextView) this.f71743K.getValue();
        }

        /* renamed from: j0 */
        public void m77471j0(AbstractC13919b.f fVar) {
            AbstractC19074t.m100208f(fVar, "data");
            if (fVar instanceof AbstractC13919b.f.c) {
                m77468k0((AbstractC13919b.f.c) fVar);
            } else if (fVar instanceof AbstractC13919b.f.d) {
                m77469l0((AbstractC13919b.f.d) fVar);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.home.c$g */
    /* loaded from: classes6.dex */
    public static final class g extends AbstractC13920c {

        /* renamed from: I */
        private final InterfaceC2726a f71746I;

        /* renamed from: J */
        private int f71747J;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(View view, InterfaceC2726a interfaceC2726a) {
            super(view, null);
            AbstractC19074t.m100208f(view, "itemView");
            AbstractC19074t.m100208f(interfaceC2726a, "cloudMediaHomeListener");
            this.f71746I = interfaceC2726a;
            this.f71747J = -1;
            view.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            view.setBackgroundColor(C23212s8.m119607o(view.getContext(), AbstractC2807a.surface_background));
        }

        /* renamed from: j0 */
        public void m77473j0(AbstractC13919b.g gVar) {
            int mo13297c;
            AbstractC19074t.m100208f(gVar, "data");
            if (this.f71747J != m9929A()) {
                mo13297c = -1;
            } else {
                mo13297c = this.f71746I.mo13297c() - this.f7784p.getTop();
            }
            this.f7784p.setLayoutParams(new ViewGroup.LayoutParams(-1, mo13297c));
            this.f71747J = m9929A();
            if (mo13297c == -1) {
                this.f71746I.mo13295a();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.home.c$h */
    /* loaded from: classes6.dex */
    public static final class h extends AbstractC13920c {

        /* renamed from: I */
        private final RobotoTextView f71748I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(RobotoTextView robotoTextView) {
            super(robotoTextView, null);
            AbstractC19074t.m100208f(robotoTextView, "itemView");
            this.f71748I = robotoTextView;
            robotoTextView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            Context context = robotoTextView.getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            new C26708g(robotoTextView).m137319a(C26705d.m137293a(context, AbstractC2814h.t_small_m));
            robotoTextView.setTextColor(C23212s8.m119607o(robotoTextView.getContext(), AbstractC2807a.information_text));
        }

        /* renamed from: j0 */
        public void m77474j0(AbstractC13919b.h hVar) {
            AbstractC19074t.m100208f(hVar, "data");
            this.f71748I.setText(hVar.m77450b());
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.home.c$i */
    /* loaded from: classes6.dex */
    public static final class i extends AbstractC13920c {

        /* renamed from: I */
        private final InterfaceC2726a f71749I;

        /* renamed from: J */
        private final C30142yf f71750J;

        /* renamed from: com.zing.zalo.ui.zalocloud.home.c$i$a */
        /* loaded from: classes6.dex */
        public /* synthetic */ class a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f71751a;

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
                f71751a = iArr;
            }
        }

        /* renamed from: com.zing.zalo.ui.zalocloud.home.c$i$b */
        /* loaded from: classes6.dex */
        public static final class b extends ClickableSpan {
            b() {
            }

            @Override // android.text.style.ClickableSpan
            public void onClick(View view) {
                AbstractC19074t.m100208f(view, "textView");
                i.this.m77477l0().mo13296b();
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public void updateDrawState(TextPaint textPaint) {
                AbstractC19074t.m100208f(textPaint, "ds");
                super.updateDrawState(textPaint);
                textPaint.setColor(C23212s8.m119607o(i.this.f7784p.getContext(), AbstractC2807a.cta_link));
                textPaint.setUnderlineText(false);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(View view, InterfaceC2726a interfaceC2726a) {
            super(view, null);
            AbstractC19074t.m100208f(view, "itemView");
            AbstractC19074t.m100208f(interfaceC2726a, "listener");
            this.f71749I = interfaceC2726a;
            C30142yf m148753a = C30142yf.m148753a(view);
            AbstractC19074t.m100207e(m148753a, "bind(...)");
            this.f71750J = m148753a;
            m148753a.f140059s.setMovementMethod(LinkMovementMethod.getInstance());
        }

        /* renamed from: j0 */
        private final SpannableString m77475j0(String str, String str2) {
            SpannableString spannableString = new SpannableString(str + " " + str2);
            b bVar = new b();
            int length = str.length() + 1;
            int length2 = spannableString.length();
            spannableString.setSpan(bVar, length, length2, 33);
            spannableString.setSpan(new StyleSpan(1), length, length2, 33);
            spannableString.setSpan(new AbsoluteSizeSpan(AbstractC23222t7.f112582r), length, length2, 33);
            return spannableString;
        }

        /* renamed from: k0 */
        public void m77476k0(AbstractC13919b.i iVar) {
            int m104529e;
            CharSequence m118746s0;
            AbstractC19074t.m100208f(iVar, "data");
            AbstractC28981d m77451b = iVar.m77451b();
            if (m77451b instanceof AbstractC28981d.a) {
                Context context = this.f71750J.getRoot().getContext();
                AbstractC19074t.m100207e(context, "getContext(...)");
                C26703b m137293a = C26705d.m137293a(context, AbstractC2814h.t_normal);
                RobotoTextView robotoTextView = this.f71750J.f140059s;
                AbstractC19074t.m100207e(robotoTextView, "tvTitle");
                new C26708g(robotoTextView).m137319a(m137293a);
                this.f71750J.f140059s.setTextColor(C23212s8.m119607o(this.f7784p.getContext(), AbstractC2807a.text_primary));
                RobotoTextView robotoTextView2 = this.f71750J.f140059s;
                int i11 = a.f71751a[((AbstractC28981d.a) iVar.m77451b()).m144699f().ordinal()];
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_zcloud_migration_unknown_error);
                            AbstractC19074t.m100207e(m118743r0, "getString(...)");
                            String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_zcloud_migration_resume_migrate_cta);
                            AbstractC19074t.m100207e(m118743r02, "getString(...)");
                            m118746s0 = m77475j0(m118743r0, m118743r02);
                        } else {
                            m118746s0 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_zcloud_migration_default_error_zcloud_home_title, C16805b.Companion.m89811a().m89800f());
                        }
                    } else {
                        m118746s0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_zcloud_migration_network_error_zcloud_home_title);
                    }
                } else {
                    m118746s0 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_zcloud_migration_battery_error_zcloud_home_title, "15%");
                }
                robotoTextView2.setText(m118746s0);
                this.f71750J.f140058r.setVisibility(8);
                C30142yf c30142yf = this.f71750J;
                c30142yf.f140057q.setProgressIndicatorColor(C23212s8.m119607o(c30142yf.getRoot().getContext(), AbstractC2807a.storage_legend_paused));
                C30142yf c30142yf2 = this.f71750J;
                c30142yf2.f140057q.setProgressBackgroundColor(C23212s8.m119607o(c30142yf2.getRoot().getContext(), AbstractC2807a.storage_legend_empty));
            } else if ((m77451b instanceof AbstractC28981d.f) || (m77451b instanceof AbstractC28981d.d) || (m77451b instanceof AbstractC28981d.b)) {
                Context context2 = this.f71750J.getRoot().getContext();
                AbstractC19074t.m100207e(context2, "getContext(...)");
                C26703b m137293a2 = C26705d.m137293a(context2, AbstractC2814h.t_small);
                RobotoTextView robotoTextView3 = this.f71750J.f140059s;
                AbstractC19074t.m100207e(robotoTextView3, "tvTitle");
                new C26708g(robotoTextView3).m137319a(m137293a2);
                this.f71750J.f140059s.setTextColor(C23212s8.m119607o(this.f7784p.getContext(), AbstractC2807a.text_primary));
                this.f71750J.f140059s.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_zcloud_home_migration_progressing));
                DecimalFormat decimalFormat = new DecimalFormat("#.##");
                decimalFormat.setRoundingMode(RoundingMode.FLOOR);
                String str = decimalFormat.format(Float.valueOf(iVar.m77451b().m144695b() * 100.0f)) + "%";
                this.f71750J.f140058r.setVisibility(0);
                this.f71750J.f140058r.setText(str);
                C30142yf c30142yf3 = this.f71750J;
                c30142yf3.f140057q.setProgressIndicatorColor(C23212s8.m119607o(c30142yf3.getRoot().getContext(), AbstractC2807a.progress_indicator_blue));
                C30142yf c30142yf4 = this.f71750J;
                c30142yf4.f140057q.setProgressBackgroundColor(C23212s8.m119607o(c30142yf4.getRoot().getContext(), AbstractC2807a.progress_track_background_black));
            } else if (m77451b instanceof AbstractC28981d.c) {
                Context context3 = this.f71750J.getRoot().getContext();
                AbstractC19074t.m100207e(context3, "getContext(...)");
                C26703b m137293a3 = C26705d.m137293a(context3, AbstractC2814h.t_normal);
                RobotoTextView robotoTextView4 = this.f71750J.f140059s;
                AbstractC19074t.m100207e(robotoTextView4, "tvTitle");
                new C26708g(robotoTextView4).m137319a(m137293a3);
                this.f71750J.f140059s.setTextColor(C23212s8.m119607o(this.f7784p.getContext(), AbstractC2807a.text_primary));
                RobotoTextView robotoTextView5 = this.f71750J.f140059s;
                String m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_zcloud_migration_unknown_error);
                AbstractC19074t.m100207e(m118743r03, "getString(...)");
                String m118743r04 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_zcloud_migration_resume_migrate_cta);
                AbstractC19074t.m100207e(m118743r04, "getString(...)");
                robotoTextView5.setText(m77475j0(m118743r03, m118743r04));
                this.f71750J.f140058r.setVisibility(8);
                C30142yf c30142yf5 = this.f71750J;
                c30142yf5.f140057q.setProgressIndicatorColor(C23212s8.m119607o(c30142yf5.getRoot().getContext(), AbstractC2807a.storage_legend_paused));
                C30142yf c30142yf6 = this.f71750J;
                c30142yf6.f140057q.setProgressBackgroundColor(C23212s8.m119607o(c30142yf6.getRoot().getContext(), AbstractC2807a.storage_legend_empty));
            } else {
                return;
            }
            ProgressBar progressBar = this.f71750J.f140057q;
            m104529e = AbstractC20104d.m104529e(iVar.m77451b().m144695b() * 100.0f);
            progressBar.setProgress(m104529e);
        }

        /* renamed from: l0 */
        public final InterfaceC2726a m77477l0() {
            return this.f71749I;
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.home.c$j */
    /* loaded from: classes6.dex */
    public static final class j extends AbstractC13920c {

        /* renamed from: I */
        private final ListItem f71753I;

        /* renamed from: J */
        private final InterfaceC2726a f71754J;

        /* renamed from: K */
        private final InterfaceC24854k f71755K;

        /* renamed from: L */
        private final InterfaceC24854k f71756L;

        /* renamed from: com.zing.zalo.ui.zalocloud.home.c$j$a */
        /* loaded from: classes6.dex */
        public /* synthetic */ class a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f71757a;

            static {
                int[] iArr = new int[EnumC2746k.values().length];
                try {
                    iArr[EnumC2746k.f10889q.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                f71757a = iArr;
            }
        }

        /* renamed from: com.zing.zalo.ui.zalocloud.home.c$j$b */
        /* loaded from: classes6.dex */
        public static final class b extends ClickableSpan {
            b() {
            }

            @Override // android.text.style.ClickableSpan
            public void onClick(View view) {
                AbstractC19074t.m100208f(view, "textView");
                j.this.m77482n0().mo13299e();
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public void updateDrawState(TextPaint textPaint) {
                AbstractC19074t.m100208f(textPaint, "ds");
                super.updateDrawState(textPaint);
                textPaint.setColor(C23212s8.m119607o(j.this.f7784p.getContext(), AbstractC2807a.cta_link));
                textPaint.setUnderlineText(false);
            }
        }

        /* renamed from: com.zing.zalo.ui.zalocloud.home.c$j$c */
        /* loaded from: classes6.dex */
        static final class c extends AbstractC19075u implements InterfaceC18494a {
            c() {
                super(0);
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final AppCompatImageView mo12V4() {
                return new AppCompatImageView(j.this.m77481m0().getContext());
            }
        }

        /* renamed from: com.zing.zalo.ui.zalocloud.home.c$j$d */
        /* loaded from: classes6.dex */
        static final class d extends AbstractC19075u implements InterfaceC18494a {
            d() {
                super(0);
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ProgressBar mo12V4() {
                Context context = j.this.m77481m0().getContext();
                AbstractC19074t.m100207e(context, "getContext(...)");
                ProgressBar progressBar = new ProgressBar(context, AbstractC2814h.ProgressBar_Size16_Blue);
                progressBar.setIndeterminate(true);
                progressBar.setProgressIndicatorColor(C23212s8.m119606n(AbstractC2807a.progress_indicator_blue));
                progressBar.setProgressBackgroundColor(C23212s8.m119606n(AbstractC2807a.progress_track_background_black));
                return progressBar;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(ListItem listItem, InterfaceC2726a interfaceC2726a) {
            super(listItem, null);
            InterfaceC24854k m129210a;
            InterfaceC24854k m129210a2;
            AbstractC19074t.m100208f(listItem, "listItem");
            AbstractC19074t.m100208f(interfaceC2726a, "listener");
            this.f71753I = listItem;
            this.f71754J = interfaceC2726a;
            m129210a = AbstractC24856m.m129210a(new c());
            this.f71755K = m129210a;
            m129210a2 = AbstractC24856m.m129210a(new d());
            this.f71756L = m129210a2;
            listItem.setTitleColor(C23212s8.m119606n(AbstractC2807a.text_secondary));
            listItem.setSubtitleColor(C23212s8.m119606n(AbstractC2807a.list_item_subtitle));
            listItem.m90592m(false);
            listItem.setPadding(AbstractC23222t7.f112586t, AbstractC23222t7.f112576o, AbstractC23222t7.f112586t, AbstractC23222t7.f112576o);
            listItem.setSubtitleMaxLine(2);
            listItem.m90587c(m77483o0());
            ViewParent parent = m77483o0().getParent();
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
        private final SpannableString m77478j0(String str, String str2) {
            SpannableString spannableString = new SpannableString(str + " " + str2);
            spannableString.setSpan(new b(), str.length() + 1, spannableString.length(), 33);
            spannableString.setSpan(new StyleSpan(1), str.length() + 1, spannableString.length(), 33);
            return spannableString;
        }

        /* renamed from: k0 */
        public void m77479k0(AbstractC13919b.j jVar) {
            int m104529e;
            int i11;
            AbstractC19074t.m100208f(jVar, "data");
            ListItem listItem = this.f71753I;
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_store_media_messages);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            listItem.setTitle(m118743r0);
            if (jVar.m77453c() == 100.0f) {
                if (!(this.f71753I.getLeadingItem() instanceof AppCompatImageView)) {
                    this.f71753I.m90587c(m77480l0());
                }
                AppCompatImageView m77480l0 = m77480l0();
                Context context = listItem.getContext();
                AbstractC19074t.m100207e(context, "getContext(...)");
                m77480l0.setImageDrawable(C27280g.m139660c(context, AbstractC2810d.zds_ic_check_solid_16, AbstractC2807a.success_icon));
                if (jVar.m77452b() == EnumC2746k.f10888p) {
                    this.f71753I.setLeadingGravity(EnumC16952b0.TOP);
                    ListItem listItem2 = this.f71753I;
                    String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_zcloud_home_complete_mograte_cloud_media_description);
                    AbstractC19074t.m100207e(m118743r02, "getString(...)");
                    listItem2.setSubtitle(m118743r02);
                } else {
                    this.f71753I.setLeadingGravity(EnumC16952b0.CENTER);
                    this.f71753I.setSubtitle("");
                }
            } else if (jVar.m77452b() == EnumC2746k.f10892t) {
                this.f71753I.setLeadingGravity(EnumC16952b0.CENTER);
                this.f71753I.setSubtitle("");
                if (!(this.f71753I.getLeadingItem() instanceof ProgressBar)) {
                    this.f71753I.m90587c(m77483o0());
                }
                ProgressBar m77483o0 = m77483o0();
                m104529e = AbstractC20104d.m104529e(jVar.m77453c());
                m77483o0.setProgress(m104529e);
            } else {
                if (!(this.f71753I.getLeadingItem() instanceof AppCompatImageView)) {
                    this.f71753I.m90587c(m77480l0());
                }
                AppCompatImageView m77480l02 = m77480l0();
                Context context2 = listItem.getContext();
                AbstractC19074t.m100207e(context2, "getContext(...)");
                m77480l02.setImageDrawable(C27280g.m139660c(context2, AbstractC2810d.zds_ic_warning_solid_16, AbstractC2807a.icon_tertiary));
                if (a.f71757a[jVar.m77452b().ordinal()] == 1) {
                    ListItem listItem3 = this.f71753I;
                    String m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_zcloud_transfer_backup_message_paused_by_login_drive);
                    AbstractC19074t.m100207e(m118743r03, "getString(...)");
                    String m118743r04 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_zcloud_migration_resolve_error_cta);
                    AbstractC19074t.m100207e(m118743r04, "getString(...)");
                    listItem3.setSubtitle(m77478j0(m118743r03, m118743r04));
                } else {
                    this.f71753I.setSubtitle("");
                }
                if (this.f71753I.getSubtitle().length() > 0) {
                    this.f71753I.setLeadingGravity(EnumC16952b0.TOP);
                } else {
                    this.f71753I.setLeadingGravity(EnumC16952b0.CENTER);
                }
            }
            View leadingItem = this.f71753I.getLeadingItem();
            if (leadingItem != null) {
                ViewGroup.LayoutParams layoutParams = leadingItem.getLayoutParams();
                AbstractC19074t.m100206d(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                if (this.f71753I.getSubtitle().length() > 0) {
                    i11 = AbstractC23222t7.f112554d;
                } else {
                    i11 = 0;
                }
                layoutParams2.topMargin = i11;
            }
        }

        /* renamed from: l0 */
        public final AppCompatImageView m77480l0() {
            return (AppCompatImageView) this.f71755K.getValue();
        }

        /* renamed from: m0 */
        public final ListItem m77481m0() {
            return this.f71753I;
        }

        /* renamed from: n0 */
        public final InterfaceC2726a m77482n0() {
            return this.f71754J;
        }

        /* renamed from: o0 */
        public final ProgressBar m77483o0() {
            return (ProgressBar) this.f71756L.getValue();
        }
    }

    public /* synthetic */ AbstractC13920c(View view, AbstractC19060k abstractC19060k) {
        this(view);
    }

    /* renamed from: i0 */
    public void m77454i0(AbstractC13919b abstractC13919b) {
        AbstractC19074t.m100208f(abstractC13919b, "data");
    }

    private AbstractC13920c(View view) {
        super(view);
    }
}
