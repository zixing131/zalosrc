package com.zing.zalo.p077ui.toolstorage.overview;

import am.AbstractC0924m0;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import androidx.lifecycle.C1802w0;
import androidx.lifecycle.C1808z0;
import androidx.lifecycle.InterfaceC1756a1;
import androidx.lifecycle.InterfaceC1764d0;
import androidx.recyclerview.widget.RecyclerView;
import bi0.AbstractC2807a;
import bi0.AbstractC2808b;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.p077ui.showcase.C13306b;
import com.zing.zalo.p077ui.toolstorage.ThreadStorageInfo;
import com.zing.zalo.p077ui.toolstorage.detail.ToolStorageDetailView;
import com.zing.zalo.p077ui.toolstorage.list.ToolStorageListView;
import com.zing.zalo.p077ui.toolstorage.overview.ToolStorageView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zviews.SlidableZaloView;
import com.zing.zalo.uicontrol.ScrollControlGridLayoutManager;
import com.zing.zalo.zdesign.component.Button;
import com.zing.zalo.zdesign.component.C16972e0;
import com.zing.zalo.zdesign.component.Snackbar;
import com.zing.zalo.zdesign.component.TooltipView;
import com.zing.zalo.zview.AbstractC17501r0;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19061k0;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19067n0;
import fn0.C19071q;
import fn0.InterfaceC19066n;
import gg0.AbstractC19444a;
import gw.C19669z;
import j30.C20912a;
import java.util.Arrays;
import java.util.List;
import k30.C21459a;
import kotlin.NoWhenBranchMatchedException;
import me0.AbstractC23136l9;
import me0.AbstractC23244v8;
import me0.C23212s8;
import mj0.AbstractC23322a;
import on0.AbstractC24342w;
import p205hc.C19965d;
import p213hl.C20087c;
import p348mi.AbstractC23306f;
import p649xl.C30123xd;
import p716zh.C32034n6;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.C24860q;
import pm0.C24865v;
import pm0.InterfaceC24847g;
import pm0.InterfaceC24854k;
import qi0.C25297f;
import qi0.EnumC25293b;
import qi0.EnumC25294c;
import qm0.AbstractC25368s;
import ui0.C27280g;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;
import ya0.C30876a;
import ya0.C30877b;
import ya0.C30882g;
import ya0.C30889n;

/* loaded from: classes6.dex */
public final class ToolStorageView extends SlidableZaloView {
    public static final C13440b Companion = new C13440b(null);

    /* renamed from: Q0 */
    private C30123xd f68811Q0;

    /* renamed from: R0 */
    private C16972e0 f68812R0;

    /* renamed from: T0 */
    private TooltipView f68814T0;

    /* renamed from: U0 */
    private final InterfaceC24854k f68815U0;

    /* renamed from: P0 */
    private final InterfaceC24854k f68810P0 = AbstractC17501r0.m93124a(this, AbstractC19061k0.m100169b(C13461b.class), new C13458t(new C13457s(this)), new C13459u());

    /* renamed from: S0 */
    private int f68813S0 = -1;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: com.zing.zalo.ui.toolstorage.overview.ToolStorageView$a */
    /* loaded from: classes6.dex */
    public static final class EnumC13439a {

        /* renamed from: p */
        public static final EnumC13439a f68816p = new EnumC13439a("CACHE", 0);

        /* renamed from: q */
        public static final EnumC13439a f68817q = new EnumC13439a("CONVERSATION", 1);

        /* renamed from: r */
        public static final EnumC13439a f68818r = new EnumC13439a("OTHER", 2);

        /* renamed from: s */
        private static final /* synthetic */ EnumC13439a[] f68819s;

        /* renamed from: t */
        private static final /* synthetic */ InterfaceC30165a f68820t;

        static {
            EnumC13439a[] m75370b = m75370b();
            f68819s = m75370b;
            f68820t = AbstractC30166b.m148796a(m75370b);
        }

        private EnumC13439a(String str, int i11) {
        }

        /* renamed from: b */
        private static final /* synthetic */ EnumC13439a[] m75370b() {
            return new EnumC13439a[]{f68816p, f68817q, f68818r};
        }

        public static EnumC13439a valueOf(String str) {
            return (EnumC13439a) Enum.valueOf(EnumC13439a.class, str);
        }

        public static EnumC13439a[] values() {
            return (EnumC13439a[]) f68819s.clone();
        }
    }

    /* renamed from: com.zing.zalo.ui.toolstorage.overview.ToolStorageView$b */
    /* loaded from: classes6.dex */
    public static final class C13440b {
        private C13440b() {
        }

        public /* synthetic */ C13440b(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.toolstorage.overview.ToolStorageView$c */
    /* loaded from: classes6.dex */
    public /* synthetic */ class C13441c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f68821a;

        static {
            int[] iArr = new int[EnumC13439a.values().length];
            try {
                iArr[EnumC13439a.f68816p.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC13439a.f68817q.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC13439a.f68818r.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f68821a = iArr;
        }
    }

    /* renamed from: com.zing.zalo.ui.toolstorage.overview.ToolStorageView$d */
    /* loaded from: classes6.dex */
    static final class C13442d extends AbstractC19075u implements InterfaceC18494a {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.ui.toolstorage.overview.ToolStorageView$d$a */
        /* loaded from: classes6.dex */
        public /* synthetic */ class a extends C19071q implements InterfaceC18494a {
            a(Object obj) {
                super(0, obj, ToolStorageView.class, "showBigFileDataView", "showBigFileDataView()V", 0);
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: V4 */
            public /* bridge */ /* synthetic */ Object mo12V4() {
                m75372h();
                return C24848g0.f119245a;
            }

            /* renamed from: h */
            public final void m75372h() {
                ((ToolStorageView) this.f94922q).m75342IM();
            }
        }

        C13442d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C30882g mo12V4() {
            return new C30882g(new a(ToolStorageView.this));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.toolstorage.overview.ToolStorageView$e */
    /* loaded from: classes6.dex */
    public static final class C13443e extends AbstractC19075u implements InterfaceC18505l {
        C13443e() {
            super(1);
        }

        /* renamed from: a */
        public final void m75373a(Integer num) {
            C30123xd c30123xd = ToolStorageView.this.f68811Q0;
            if (c30123xd == null) {
                AbstractC19074t.m100223u("mBinding");
                c30123xd = null;
            }
            c30123xd.f139958D.setText(num + "%");
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m75373a((Integer) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.toolstorage.overview.ToolStorageView$f */
    /* loaded from: classes6.dex */
    public static final class C13444f extends AbstractC19075u implements InterfaceC18505l {
        C13444f() {
            super(1);
        }

        /* renamed from: a */
        public final void m75374a(EnumC13439a enumC13439a) {
            AbstractC19074t.m100208f(enumC13439a, "it");
            ToolStorageView.this.m75337DM(enumC13439a);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m75374a((EnumC13439a) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.toolstorage.overview.ToolStorageView$g */
    /* loaded from: classes6.dex */
    public static final class C13445g extends AbstractC19075u implements InterfaceC18505l {
        C13445g() {
            super(1);
        }

        /* renamed from: a */
        public final void m75375a(Long l11) {
            boolean z11;
            if (l11 == null || l11.longValue() != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            String m92652XI = ToolStorageView.this.m92652XI(AbstractC8020f0.str_storage_usage_and_cache_type_cache);
            AbstractC19074t.m100205c(l11);
            C30123xd c30123xd = null;
            String str = m92652XI + " " + C21459a.m111038f(l11.longValue(), 0, 2, null);
            C30123xd c30123xd2 = ToolStorageView.this.f68811Q0;
            if (c30123xd2 == null) {
                AbstractC19074t.m100223u("mBinding");
                c30123xd2 = null;
            }
            c30123xd2.f139973z.setText(ToolStorageView.this.m75366wM(str, C21459a.m111038f(l11.longValue(), 0, 2, null)));
            C30123xd c30123xd3 = ToolStorageView.this.f68811Q0;
            if (c30123xd3 == null) {
                AbstractC19074t.m100223u("mBinding");
            } else {
                c30123xd = c30123xd3;
            }
            c30123xd.f139965r.setEnabled(z11);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m75375a((Long) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.toolstorage.overview.ToolStorageView$h */
    /* loaded from: classes6.dex */
    public static final class C13446h extends AbstractC19075u implements InterfaceC18505l {
        C13446h() {
            super(1);
        }

        /* renamed from: a */
        public final void m75376a(Long l11) {
            String m92652XI = ToolStorageView.this.m92652XI(AbstractC8020f0.str_storage_usage_and_cache_type_user_data);
            AbstractC19074t.m100205c(l11);
            C30123xd c30123xd = null;
            String str = m92652XI + " " + C21459a.m111038f(l11.longValue(), 0, 2, null);
            C30123xd c30123xd2 = ToolStorageView.this.f68811Q0;
            if (c30123xd2 == null) {
                AbstractC19074t.m100223u("mBinding");
                c30123xd2 = null;
            }
            c30123xd2.f139955A.setText(ToolStorageView.this.m75366wM(str, C21459a.m111038f(l11.longValue(), 0, 2, null)));
            C30123xd c30123xd3 = ToolStorageView.this.f68811Q0;
            if (c30123xd3 == null) {
                AbstractC19074t.m100223u("mBinding");
            } else {
                c30123xd = c30123xd3;
            }
            Button button = c30123xd.f139966s;
            button.setEnabled(true);
            button.setAlpha(1.0f);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m75376a((Long) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.toolstorage.overview.ToolStorageView$i */
    /* loaded from: classes6.dex */
    public static final class C13447i extends AbstractC19075u implements InterfaceC18505l {
        C13447i() {
            super(1);
        }

        /* renamed from: a */
        public final void m75377a(Long l11) {
            String m92652XI = ToolStorageView.this.m92652XI(AbstractC8020f0.str_tool_storage_overview_other_data);
            AbstractC19074t.m100205c(l11);
            String str = m92652XI + " " + C21459a.m111038f(l11.longValue(), 0, 2, null);
            C30123xd c30123xd = ToolStorageView.this.f68811Q0;
            if (c30123xd == null) {
                AbstractC19074t.m100223u("mBinding");
                c30123xd = null;
            }
            c30123xd.f139957C.setText(ToolStorageView.this.m75366wM(str, C21459a.m111038f(l11.longValue(), 0, 2, null)));
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m75377a((Long) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.toolstorage.overview.ToolStorageView$j */
    /* loaded from: classes6.dex */
    public static final class C13448j extends AbstractC19075u implements InterfaceC18505l {
        C13448j() {
            super(1);
        }

        /* renamed from: a */
        public final void m75378a(C24860q c24860q) {
            long longValue = ((Number) c24860q.m129213a()).longValue();
            List list = (List) c24860q.m129214b();
            ToolStorageView toolStorageView = ToolStorageView.this;
            int i11 = AbstractC8020f0.str_tool_storage_overview_media_larger_than;
            C20912a.b bVar = C20912a.Companion;
            C30123xd c30123xd = null;
            String str = toolStorageView.m92653YI(i11, C21459a.m111038f(bVar.m109411a().m109401f(), 0, 2, null)) + " " + C21459a.m111038f(longValue, 0, 2, null);
            C30123xd c30123xd2 = ToolStorageView.this.f68811Q0;
            if (c30123xd2 == null) {
                AbstractC19074t.m100223u("mBinding");
                c30123xd2 = null;
            }
            c30123xd2.f139956B.setText(ToolStorageView.this.m75366wM(str, C21459a.m111038f(longValue, 0, 2, null)));
            if (list.isEmpty() || !bVar.m109411a().m109404k()) {
                C30123xd c30123xd3 = ToolStorageView.this.f68811Q0;
                if (c30123xd3 == null) {
                    AbstractC19074t.m100223u("mBinding");
                    c30123xd3 = null;
                }
                c30123xd3.f139968u.setVisibility(8);
            } else {
                C30123xd c30123xd4 = ToolStorageView.this.f68811Q0;
                if (c30123xd4 == null) {
                    AbstractC19074t.m100223u("mBinding");
                    c30123xd4 = null;
                }
                c30123xd4.f139968u.setVisibility(0);
                ToolStorageView.this.m75367xM().m150102V(list);
            }
            C30123xd c30123xd5 = ToolStorageView.this.f68811Q0;
            if (c30123xd5 == null) {
                AbstractC19074t.m100223u("mBinding");
            } else {
                c30123xd = c30123xd5;
            }
            Button button = c30123xd.f139964q;
            button.setEnabled(true);
            button.setAlpha(1.0f);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m75378a((C24860q) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.toolstorage.overview.ToolStorageView$k */
    /* loaded from: classes6.dex */
    public static final class C13449k extends AbstractC19075u implements InterfaceC18505l {
        C13449k() {
            super(1);
        }

        /* renamed from: a */
        public final void m75379a(C24865v c24865v) {
            ToolStorageView.this.m75349PM(((Number) c24865v.m129229a()).longValue(), ((Number) c24865v.m129230b()).floatValue(), ((Number) c24865v.m129231c()).longValue());
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m75379a((C24865v) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.toolstorage.overview.ToolStorageView$l */
    /* loaded from: classes6.dex */
    public static final class C13450l extends AbstractC19075u implements InterfaceC18505l {
        C13450l() {
            super(1);
        }

        /* renamed from: a */
        public final void m75380a(C24865v c24865v) {
            int i11;
            List m131505m;
            long longValue = ((Number) c24865v.m129229a()).longValue();
            long longValue2 = ((Number) c24865v.m129230b()).longValue();
            long longValue3 = ((Number) c24865v.m129231c()).longValue();
            C30123xd c30123xd = ToolStorageView.this.f68811Q0;
            if (c30123xd == null) {
                AbstractC19074t.m100223u("mBinding");
                c30123xd = null;
            }
            ToolStorageChartView toolStorageChartView = c30123xd.f139967t;
            C30876a[] c30876aArr = new C30876a[3];
            String m92652XI = ToolStorageView.this.m92652XI(AbstractC8020f0.app_name);
            AbstractC19074t.m100207e(m92652XI, "getString(...)");
            c30876aArr[0] = new C30876a(m92652XI, AbstractC2808b.f150821b60, longValue, 0, false, false, null, 120, null);
            String m92652XI2 = ToolStorageView.this.m92652XI(AbstractC8020f0.str_storage_usage_and_cache_other_app_storage);
            AbstractC19074t.m100207e(m92652XI2, "getString(...)");
            c30876aArr[1] = new C30876a(m92652XI2, AbstractC2808b.f150819b40, longValue2, 0, false, false, null, 120, null);
            String m92652XI3 = ToolStorageView.this.m92652XI(AbstractC8020f0.str_tool_storage_overview_free_storage);
            AbstractC19074t.m100207e(m92652XI3, "getString(...)");
            if (C23212s8.m119602i()) {
                i11 = AbstractC16801x.white_20;
            } else {
                i11 = AbstractC2808b.blk_a10;
            }
            c30876aArr[2] = new C30876a(m92652XI3, i11, longValue3, 0, false, false, null, 120, null);
            m131505m = AbstractC25368s.m131505m(c30876aArr);
            toolStorageChartView.setStorageBreakdown(new C30877b(m131505m));
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m75380a((C24865v) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.toolstorage.overview.ToolStorageView$m */
    /* loaded from: classes6.dex */
    public static final class C13451m extends AbstractC19075u implements InterfaceC18505l {
        C13451m() {
            super(1);
        }

        /* renamed from: a */
        public final void m75381a(C24848g0 c24848g0) {
            AbstractC19074t.m100208f(c24848g0, "it");
            ToolStorageView.this.m75342IM();
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m75381a((C24848g0) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.toolstorage.overview.ToolStorageView$n */
    /* loaded from: classes6.dex */
    public static final class C13452n extends AbstractC19075u implements InterfaceC18505l {
        C13452n() {
            super(1);
        }

        /* renamed from: a */
        public final void m75382a(C24848g0 c24848g0) {
            AbstractC19074t.m100208f(c24848g0, "it");
            ToolStorageView.this.m75347NM();
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m75382a((C24848g0) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.toolstorage.overview.ToolStorageView$o */
    /* loaded from: classes6.dex */
    public static final class C13453o extends AbstractC19075u implements InterfaceC18505l {
        C13453o() {
            super(1);
        }

        /* renamed from: a */
        public final void m75383a(int i11) {
            if (i11 == 0) {
                ToolStorageView.this.m75343JM();
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m75383a(((Number) obj).intValue());
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.toolstorage.overview.ToolStorageView$p */
    /* loaded from: classes6.dex */
    public static final class C13454p extends AbstractC19075u implements InterfaceC18505l {
        C13454p() {
            super(1);
        }

        /* renamed from: a */
        public final void m75384a(Boolean bool) {
            AbstractC19074t.m100205c(bool);
            if (bool.booleanValue()) {
                ToolStorageView.this.mo46829Y();
            } else {
                ToolStorageView.this.mo49315c4();
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m75384a((Boolean) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.toolstorage.overview.ToolStorageView$q */
    /* loaded from: classes6.dex */
    public static final class C13455q implements InterfaceC1764d0, InterfaceC19066n {

        /* renamed from: p */
        private final /* synthetic */ InterfaceC18505l f68835p;

        C13455q(InterfaceC18505l interfaceC18505l) {
            AbstractC19074t.m100208f(interfaceC18505l, "function");
            this.f68835p = interfaceC18505l;
        }

        @Override // fn0.InterfaceC19066n
        /* renamed from: c */
        public final InterfaceC24847g mo9368c() {
            return this.f68835p;
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
            this.f68835p.mo205i9(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.toolstorage.overview.ToolStorageView$r */
    /* loaded from: classes6.dex */
    public static final class C13456r extends AbstractC19075u implements InterfaceC18505l {
        C13456r() {
            super(1);
        }

        /* renamed from: a */
        public final void m75385a(long j11) {
            ToolStorageView.this.mo49315c4();
            ToolStorageView.this.m75346MM(j11);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m75385a(((Number) obj).longValue());
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.toolstorage.overview.ToolStorageView$s */
    /* loaded from: classes6.dex */
    public static final class C13457s extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ ZaloView f68837q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13457s(ZaloView zaloView) {
            super(0);
            this.f68837q = zaloView;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ZaloView mo12V4() {
            return this.f68837q;
        }
    }

    /* renamed from: com.zing.zalo.ui.toolstorage.overview.ToolStorageView$t */
    /* loaded from: classes6.dex */
    public static final class C13458t extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ InterfaceC18494a f68838q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13458t(InterfaceC18494a interfaceC18494a) {
            super(0);
            this.f68838q = interfaceC18494a;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1808z0 mo12V4() {
            C1808z0 mo4644Oc = ((InterfaceC1756a1) this.f68838q.mo12V4()).mo4644Oc();
            AbstractC19074t.m100207e(mo4644Oc, "ownerProducer().viewModelStore");
            return mo4644Oc;
        }
    }

    /* renamed from: com.zing.zalo.ui.toolstorage.overview.ToolStorageView$u */
    /* loaded from: classes6.dex */
    static final class C13459u extends AbstractC19075u implements InterfaceC18494a {
        C13459u() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1802w0.b mo12V4() {
            return ToolStorageView.this.m75369zM();
        }
    }

    public ToolStorageView() {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(new C13442d());
        this.f68815U0 = m129210a;
    }

    /* renamed from: AM */
    private final void m75334AM() {
        m75368yM().m75428m0().m9219j(this, new C13455q(new C13445g()));
        m75368yM().m75430o0().m9219j(this, new C13455q(new C13446h()));
        m75368yM().m75434s0().m9219j(this, new C13455q(new C13447i()));
        m75368yM().m75432q0().m9219j(this, new C13455q(new C13448j()));
        m75368yM().m75439x0().m9219j(this, new C13455q(new C13449k()));
        m75368yM().m75431p0().m9219j(this, new C13455q(new C13450l()));
        m75368yM().m75435t0().m9219j(this, new C19965d(new C13451m()));
        m75368yM().m75436u0().m9219j(this, new C19965d(new C13452n()));
        m75368yM().m75437v0().m9219j(this, new C19965d(new C13453o()));
        m75368yM().m75433r0().m9219j(this, new C13455q(new C13443e()));
        m75368yM().m75429n0().m9219j(this, new C19965d(new C13444f()));
    }

    /* renamed from: BM */
    private final void m75335BM() {
        m75368yM().m75438w0().m9219j(this, new C13455q(new C13454p()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CM */
    public static final void m75336CM(ToolStorageView toolStorageView) {
        AbstractC19074t.m100208f(toolStorageView, "this$0");
        toolStorageView.m75348OM();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: DM */
    public final void m75337DM(EnumC13439a enumC13439a) {
        String m92652XI;
        C30123xd c30123xd = this.f68811Q0;
        if (c30123xd == null) {
            AbstractC19074t.m100223u("mBinding");
            c30123xd = null;
        }
        RobotoTextView robotoTextView = c30123xd.f139960F;
        int i11 = C13441c.f68821a[enumC13439a.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    m92652XI = m92652XI(AbstractC8020f0.str_tool_storage_calculating_other_data);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                m92652XI = m92652XI(AbstractC8020f0.str_tool_storage_calculating_conversation_data);
            }
        } else {
            m92652XI = m92652XI(AbstractC8020f0.str_tool_storage_calculating_cache_data);
        }
        robotoTextView.setText(m92652XI);
    }

    /* renamed from: EM */
    private final void m75338EM() {
        C30123xd c30123xd = null;
        String str = m92653YI(AbstractC8020f0.str_tool_storage_overview_media_larger_than, C21459a.m111038f(C20912a.Companion.m109411a().m109401f(), 0, 2, null)) + " ...";
        C30123xd c30123xd2 = this.f68811Q0;
        if (c30123xd2 == null) {
            AbstractC19074t.m100223u("mBinding");
            c30123xd2 = null;
        }
        c30123xd2.f139956B.setText(m75366wM(str, " ..."));
        String str2 = m92652XI(AbstractC8020f0.str_storage_usage_and_cache_type_cache) + " ...";
        C30123xd c30123xd3 = this.f68811Q0;
        if (c30123xd3 == null) {
            AbstractC19074t.m100223u("mBinding");
            c30123xd3 = null;
        }
        c30123xd3.f139973z.setText(m75366wM(str2, " ..."));
        String str3 = m92652XI(AbstractC8020f0.str_storage_usage_and_cache_type_user_data) + " ...";
        C30123xd c30123xd4 = this.f68811Q0;
        if (c30123xd4 == null) {
            AbstractC19074t.m100223u("mBinding");
            c30123xd4 = null;
        }
        c30123xd4.f139955A.setText(m75366wM(str3, " ..."));
        String str4 = m92652XI(AbstractC8020f0.str_tool_storage_overview_other_data) + " ...";
        C30123xd c30123xd5 = this.f68811Q0;
        if (c30123xd5 == null) {
            AbstractC19074t.m100223u("mBinding");
            c30123xd5 = null;
        }
        c30123xd5.f139957C.setText(m75366wM(str4, " ..."));
        C30123xd c30123xd6 = this.f68811Q0;
        if (c30123xd6 == null) {
            AbstractC19074t.m100223u("mBinding");
            c30123xd6 = null;
        }
        RecyclerView recyclerView = c30123xd6.f139972y;
        ScrollControlGridLayoutManager scrollControlGridLayoutManager = new ScrollControlGridLayoutManager(getContext(), 5);
        scrollControlGridLayoutManager.m87991h3(false);
        recyclerView.setLayoutManager(scrollControlGridLayoutManager);
        C30123xd c30123xd7 = this.f68811Q0;
        if (c30123xd7 == null) {
            AbstractC19074t.m100223u("mBinding");
            c30123xd7 = null;
        }
        c30123xd7.f139972y.setAdapter(m75367xM());
        C30123xd c30123xd8 = this.f68811Q0;
        if (c30123xd8 == null) {
            AbstractC19074t.m100223u("mBinding");
            c30123xd8 = null;
        }
        c30123xd8.f139965r.setOnClickListener(new View.OnClickListener() { // from class: ya0.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ToolStorageView.m75339FM(ToolStorageView.this, view);
            }
        });
        C30123xd c30123xd9 = this.f68811Q0;
        if (c30123xd9 == null) {
            AbstractC19074t.m100223u("mBinding");
            c30123xd9 = null;
        }
        c30123xd9.f139966s.setOnClickListener(new View.OnClickListener() { // from class: ya0.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ToolStorageView.m75340GM(ToolStorageView.this, view);
            }
        });
        C30123xd c30123xd10 = this.f68811Q0;
        if (c30123xd10 == null) {
            AbstractC19074t.m100223u("mBinding");
        } else {
            c30123xd = c30123xd10;
        }
        c30123xd.f139964q.setOnClickListener(new View.OnClickListener() { // from class: ya0.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ToolStorageView.m75341HM(ToolStorageView.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: FM */
    public static final void m75339FM(ToolStorageView toolStorageView, View view) {
        AbstractC19074t.m100208f(toolStorageView, "this$0");
        toolStorageView.m75368yM().m75422E0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: GM */
    public static final void m75340GM(ToolStorageView toolStorageView, View view) {
        AbstractC19074t.m100208f(toolStorageView, "this$0");
        toolStorageView.m75368yM().m75424G0();
        TooltipView tooltipView = toolStorageView.f68814T0;
        if (tooltipView != null) {
            tooltipView.m90727Q();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: HM */
    public static final void m75341HM(ToolStorageView toolStorageView, View view) {
        AbstractC19074t.m100208f(toolStorageView, "this$0");
        toolStorageView.m75368yM().m75421D0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: IM */
    public final void m75342IM() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("details", new ThreadStorageInfo(null, null, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 262143, null));
        bundle.putString("STR_SOURCE_START_VIEW", "storage_usage");
        bundle.putBoolean("is_big_file_flow", true);
        C17487o0 m92662fJ = this.f72421L0.m92662fJ();
        if (m92662fJ != null) {
            m92662fJ.m93066i2(ToolStorageDetailView.class, bundle, 1000, 1, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: JM */
    public final void m75343JM() {
        Context m92689tK = m92689tK();
        AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
        C16972e0.a m90932i = new C16972e0.a(m92689tK).m90932i(C16972e0.b.DIALOG_INFORMATION);
        String m92652XI = m92652XI(AbstractC8020f0.str_tool_storage_overview_clean_cache_question);
        AbstractC19074t.m100207e(m92652XI, "getString(...)");
        C16972e0.a m90918B = m90932i.m90918B(m92652XI);
        Spanned m119746j = AbstractC23244v8.m119746j(m92653YI(AbstractC8020f0.str_tool_storage_overview_free_up_storage, C21459a.m111038f(m75368yM().m75427l0(), 0, 2, null)));
        AbstractC19074t.m100207e(m119746j, "getSpannedFromStrHtml(...)");
        C16972e0.a m90942s = m90918B.m90949z(m119746j).m90942s(AbstractC8020f0.str_tool_storage_overview_clear, new InterfaceC17463d.d() { // from class: ya0.k
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                ToolStorageView.m75344KM(ToolStorageView.this, interfaceC17463d, i11);
            }
        });
        String m92652XI2 = m92652XI(AbstractC8020f0.cancel);
        AbstractC19074t.m100207e(m92652XI2, "getString(...)");
        this.f68812R0 = m90942s.m90934k(m92652XI2, new InterfaceC17463d.d() { // from class: ya0.l
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                ToolStorageView.m75345LM(interfaceC17463d, i11);
            }
        }).m90931h("clean_cache_dialog").m90947x("clean_cache_button").m90937n("close_dialog_button").m90923G();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: KM */
    public static final void m75344KM(ToolStorageView toolStorageView, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(toolStorageView, "this$0");
        toolStorageView.mo49282B8(null, false);
        toolStorageView.m75368yM().m75423F0(new C13456r());
        interfaceC17463d.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: LM */
    public static final void m75345LM(InterfaceC17463d interfaceC17463d, int i11) {
        interfaceC17463d.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: MM */
    public final void m75346MM(long j11) {
        View m92656bJ = m92656bJ();
        if (m92656bJ != null) {
            Snackbar.C16925c c16925c = Snackbar.Companion;
            Spanned m119746j = AbstractC23244v8.m119746j(m92653YI(AbstractC8020f0.str_tool_storage_overview_clear_cache_snackbar, C21459a.m111038f(j11, 0, 2, null)));
            AbstractC19074t.m100207e(m119746j, "getSpannedFromStrHtml(...)");
            Snackbar m90669d = c16925c.m90669d(m92656bJ, m119746j, -1);
            Context context = m92656bJ.getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            m90669d.m90644J(C27280g.m139659b(context, AbstractC23322a.zds_ic_check_circle_solid_24, AbstractC2808b.gr60));
            m90669d.m90648N();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: NM */
    public final void m75347NM() {
        Bundle bundle = new Bundle();
        C17487o0 m92662fJ = this.f72421L0.m92662fJ();
        AbstractC19074t.m100205c(m92662fJ);
        m92662fJ.m93066i2(ToolStorageListView.class, bundle, 1001, 1, true);
    }

    /* renamed from: OM */
    private final void m75348OM() {
        String m92652XI;
        C25297f.a aVar = C25297f.Companion;
        MainApplication.C6895a c6895a = MainApplication.Companion;
        C25297f m130959a = aVar.m130959a(c6895a.m35500c());
        if (this.f68813S0 == 5) {
            m92652XI = m92652XI(AbstractC8020f0.str_grace_period_tool_storage_tip_body_empty_media);
            AbstractC19074t.m100207e(m92652XI, "getString(...)");
        } else {
            m92652XI = m92652XI(AbstractC8020f0.str_grace_period_tool_storage_tip_body);
            AbstractC19074t.m100207e(m92652XI, "getString(...)");
        }
        m130959a.m130927d0(m92652XI);
        m130959a.m130920Z(true);
        m130959a.m130918X(EnumC25294c.TOP);
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_tip_banner_got_it);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        m130959a.m130911Q(m118743r0);
        m130959a.m130912R(EnumC25293b.RECTANGLE);
        C30123xd c30123xd = this.f68811Q0;
        C30123xd c30123xd2 = null;
        if (c30123xd == null) {
            AbstractC19074t.m100223u("mBinding");
            c30123xd = null;
        }
        m130959a.m130925c0(c30123xd.f139969v);
        m130959a.m130937i0(false);
        m130959a.m130939j0(false);
        TooltipView tooltipView = new TooltipView(c6895a.m35500c());
        tooltipView.setTooltipId("grace_period_tip_id");
        tooltipView.setConfigs(m130959a);
        C13306b c13306b = new C13306b(c6895a.m35500c());
        C30123xd c30123xd3 = this.f68811Q0;
        if (c30123xd3 == null) {
            AbstractC19074t.m100223u("mBinding");
        } else {
            c30123xd2 = c30123xd3;
        }
        ViewParent parent = c30123xd2.getRoot().getParent();
        AbstractC19074t.m100206d(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        c13306b.m74687C((ViewGroup) parent);
        tooltipView.setTooltipManager(c13306b);
        AbstractC23306f.m120627V1().m90230M(true);
        tooltipView.m90733c0();
        this.f68814T0 = tooltipView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: PM */
    public final void m75349PM(long j11, float f11, long j12) {
        boolean z11;
        int i11;
        int i12;
        AbstractC19074t.m100207e(AbstractC23306f.m120732z1(), "provideStorageConfigs(...)");
        if (C21459a.m111034b(j12) < r0.m109402g()) {
            z11 = true;
        } else {
            z11 = false;
        }
        C30123xd c30123xd = this.f68811Q0;
        C30123xd c30123xd2 = null;
        if (c30123xd == null) {
            AbstractC19074t.m100223u("mBinding");
            c30123xd = null;
        }
        LinearLayout linearLayout = c30123xd.f139961G;
        AbstractC19074t.m100207e(linearLayout, "warningFullStorageContainer");
        if (!z11) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        linearLayout.setVisibility(i11);
        C30123xd c30123xd3 = this.f68811Q0;
        if (c30123xd3 == null) {
            AbstractC19074t.m100223u("mBinding");
            c30123xd3 = null;
        }
        RobotoTextView robotoTextView = c30123xd3.f139960F;
        AbstractC19074t.m100207e(robotoTextView, "tvZaloSizePercentage");
        if (z11) {
            i12 = 8;
        } else {
            i12 = 0;
        }
        robotoTextView.setVisibility(i12);
        C19067n0 c19067n0 = C19067n0.f94947a;
        String format = String.format("%.02f", Arrays.copyOf(new Object[]{Float.valueOf(f11)}, 1));
        AbstractC19074t.m100207e(format, "format(...)");
        C30123xd c30123xd4 = this.f68811Q0;
        if (c30123xd4 == null) {
            AbstractC19074t.m100223u("mBinding");
            c30123xd4 = null;
        }
        c30123xd4.f139970w.setVisibility(8);
        C30123xd c30123xd5 = this.f68811Q0;
        if (c30123xd5 == null) {
            AbstractC19074t.m100223u("mBinding");
            c30123xd5 = null;
        }
        c30123xd5.f139959E.setVisibility(0);
        C30123xd c30123xd6 = this.f68811Q0;
        if (c30123xd6 == null) {
            AbstractC19074t.m100223u("mBinding");
            c30123xd6 = null;
        }
        c30123xd6.f139959E.setText(C21459a.m111038f(j11, 0, 2, null));
        C30123xd c30123xd7 = this.f68811Q0;
        if (c30123xd7 == null) {
            AbstractC19074t.m100223u("mBinding");
        } else {
            c30123xd2 = c30123xd7;
        }
        c30123xd2.f139960F.setText(AbstractC23244v8.m119746j(m92653YI(AbstractC8020f0.str_tool_storage_overview_using_size_of_phone_storage, format)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: wM */
    public final SpannableStringBuilder m75366wM(String str, String str2) {
        int m127173b0;
        m127173b0 = AbstractC24342w.m127173b0(str, str2, 0, false, 6, null);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(C23212s8.m119606n(AbstractC2807a.TextColor1)), 0, m127173b0 - 1, 17);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(C23212s8.m119606n(AbstractC2807a.text_02)), m127173b0, str.length(), 17);
        return spannableStringBuilder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: xM */
    public final C30882g m75367xM() {
        return (C30882g) this.f68815U0.getValue();
    }

    /* renamed from: yM */
    private final C13461b m75368yM() {
        return (C13461b) this.f68810P0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zM */
    public final C30889n m75369zM() {
        C20087c m120582G1 = AbstractC23306f.m120582G1();
        AbstractC19074t.m100207e(m120582G1, "provideToolStorageRepository(...)");
        C19669z m120572D0 = AbstractC23306f.m120572D0();
        AbstractC19074t.m100207e(m120572D0, "provideMessageManager(...)");
        C32034n6 m120716u0 = AbstractC23306f.m120716u0();
        AbstractC19074t.m100207e(m120716u0, "provideLocalFileCleaner(...)");
        return new C30889n(m120582G1, m120572D0, m120716u0, this, null, 16, null);
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        Bundle m92642L3 = m92642L3();
        int i11 = -1;
        if (m92642L3 != null) {
            i11 = m92642L3.getInt("zcloud_gp_success_mode", -1);
        }
        this.f68813S0 = i11;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C30123xd m148707c = C30123xd.m148707c(layoutInflater, viewGroup, false);
        AbstractC19074t.m100207e(m148707c, "inflate(...)");
        this.f68811Q0 = m148707c;
        if (m148707c == null) {
            AbstractC19074t.m100223u("mBinding");
            m148707c = null;
        }
        LinearLayout root = m148707c.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: IJ */
    public void mo39024IJ() {
        TooltipView tooltipView = this.f68814T0;
        if (tooltipView != null) {
            tooltipView.m90727Q();
        }
        super.mo39024IJ();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: JJ */
    public void mo37484JJ() {
        super.mo37484JJ();
        m75367xM().m150101U();
        C16972e0 c16972e0 = this.f68812R0;
        if (c16972e0 != null && c16972e0.m92868m()) {
            c16972e0.dismiss();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: UJ */
    public void mo37584UJ() {
        super.mo37584UJ();
        m75335BM();
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        AbstractC19074t.m100208f(view, "view");
        super.mo37125ZJ(view, bundle);
        m75338EM();
        m75334AM();
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "ToolStorageSummary";
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        super.onActivityResult(i11, i12, intent);
        if ((i11 == 1000 || i11 == 1001) && i12 == -1 && intent != null && intent.getBooleanExtra("need_reload", false)) {
            m75368yM().m75426M0();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        if (this.f68813S0 != -1 && !AbstractC0924m0.m3779ed()) {
            AbstractC19444a.m101694b(new Runnable() { // from class: ya0.m
                @Override // java.lang.Runnable
                public final void run() {
                    ToolStorageView.m75336CM(ToolStorageView.this);
                }
            }, 500L);
            this.f68813S0 = -1;
            Bundle m92642L3 = m92642L3();
            if (m92642L3 != null) {
                m92642L3.remove("zcloud_gp_success_mode");
            }
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        m75368yM().m75425K0(C13460a.Companion.m75389a(m92642L3()));
    }
}
