package com.zing.zalo.p077ui.toolstorage.overview;

import android.content.Context;
import android.util.AttributeSet;
import bi0.AbstractC2807a;
import bi0.AbstractC2808b;
import ch0.AbstractC3489d;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.data.zalocloud.model.ZCloudQuotaUsage;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.ModulesView;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kd0.C21692b;
import kotlin.NoWhenBranchMatchedException;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import me0.C23212s8;
import og0.C24252c;
import og0.EnumC24251b;
import p304ks.AbstractC21935u;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import qm0.AbstractC25368s;
import qm0.AbstractC25378x;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;
import ya0.C30876a;
import ya0.C30877b;
import ya0.C30878c;

/* loaded from: classes6.dex */
public final class ToolStorageChartView extends ModulesView {

    /* renamed from: K */
    private C30878c f68797K;

    /* renamed from: L */
    private C16716d f68798L;

    /* renamed from: M */
    private C21692b f68799M;

    /* renamed from: N */
    private final InterfaceC24854k f68800N;

    /* renamed from: com.zing.zalo.ui.toolstorage.overview.ToolStorageChartView$a */
    /* loaded from: classes6.dex */
    public /* synthetic */ class C13435a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f68801a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f68802b;

        static {
            int[] iArr = new int[EnumC13436b.values().length];
            try {
                iArr[EnumC13436b.f68804q.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC13436b.f68803p.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC13436b.f68805r.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f68801a = iArr;
            int[] iArr2 = new int[EnumC24251b.values().length];
            try {
                iArr2[EnumC24251b.f117147r.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[EnumC24251b.f117146q.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            f68802b = iArr2;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: com.zing.zalo.ui.toolstorage.overview.ToolStorageChartView$b */
    /* loaded from: classes6.dex */
    public static final class EnumC13436b {

        /* renamed from: p */
        public static final EnumC13436b f68803p = new EnumC13436b("MY_CLOUD", 0);

        /* renamed from: q */
        public static final EnumC13436b f68804q = new EnumC13436b("ZCLOUD_HOME", 1);

        /* renamed from: r */
        public static final EnumC13436b f68805r = new EnumC13436b("CLOUD_MEDIA", 2);

        /* renamed from: s */
        private static final /* synthetic */ EnumC13436b[] f68806s;

        /* renamed from: t */
        private static final /* synthetic */ InterfaceC30165a f68807t;

        static {
            EnumC13436b[] m75331b = m75331b();
            f68806s = m75331b;
            f68807t = AbstractC30166b.m148796a(m75331b);
        }

        private EnumC13436b(String str, int i11) {
        }

        /* renamed from: b */
        private static final /* synthetic */ EnumC13436b[] m75331b() {
            return new EnumC13436b[]{f68803p, f68804q, f68805r};
        }

        public static EnumC13436b valueOf(String str) {
            return (EnumC13436b) Enum.valueOf(EnumC13436b.class, str);
        }

        public static EnumC13436b[] values() {
            return (EnumC13436b[]) f68806s.clone();
        }
    }

    /* renamed from: com.zing.zalo.ui.toolstorage.overview.ToolStorageChartView$c */
    /* loaded from: classes6.dex */
    static final class C13437c extends AbstractC19075u implements InterfaceC18494a {
        C13437c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C30877b mo12V4() {
            int i11;
            List m131505m;
            C30876a[] c30876aArr = new C30876a[3];
            String string = ToolStorageChartView.this.getContext().getString(AbstractC8020f0.app_name);
            AbstractC19074t.m100207e(string, "getString(...)");
            c30876aArr[0] = new C30876a(string, AbstractC2808b.f150821b60, 0L, 0, false, false, null, 120, null);
            String string2 = ToolStorageChartView.this.getContext().getString(AbstractC8020f0.str_storage_usage_and_cache_other_app_storage);
            AbstractC19074t.m100207e(string2, "getString(...)");
            c30876aArr[1] = new C30876a(string2, AbstractC2808b.f150819b40, 0L, 0, false, false, null, 120, null);
            String string3 = ToolStorageChartView.this.getContext().getString(AbstractC8020f0.str_tool_storage_overview_free_storage);
            AbstractC19074t.m100207e(string3, "getString(...)");
            if (C23212s8.m119602i()) {
                i11 = AbstractC16801x.white_20;
            } else {
                i11 = AbstractC2808b.blk_a10;
            }
            c30876aArr[2] = new C30876a(string3, i11, 1L, 0, false, false, null, 120, null);
            m131505m = AbstractC25368s.m131505m(c30876aArr);
            return new C30877b(m131505m);
        }
    }

    /* renamed from: com.zing.zalo.ui.toolstorage.overview.ToolStorageChartView$d */
    /* loaded from: classes6.dex */
    static final class C13438d extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final C13438d f68809q = new C13438d();

        C13438d() {
            super(1);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean mo205i9(EnumC24251b enumC24251b) {
            AbstractC19074t.m100208f(enumC24251b, "it");
            return Boolean.valueOf(!C24252c.f117152a.m126600f(enumC24251b));
        }
    }

    public ToolStorageChartView(Context context) {
        super(context);
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(new C13437c());
        this.f68800N = m129210a;
        m75328W();
    }

    /* renamed from: W */
    private final void m75328W() {
        Context context = getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        C30878c c30878c = new C30878c(context);
        c30878c.mo44614b1(8);
        this.f68797K = c30878c;
        C16716d c16716d = new C16716d(getContext());
        c16716d.m89106L().m89028L(-1, -2).m89029M(3).m89025I(true);
        this.f68798L = c16716d;
        C21692b c21692b = new C21692b(getContext());
        C16718f m89106L = c21692b.m89106L();
        int i11 = AbstractC23222t7.f112582r;
        m89106L.m89028L(i11, i11).m89026J(true);
        this.f68799M = c21692b;
        setStorageBreakdown(getDefaultValue());
        C16716d c16716d2 = this.f68798L;
        C16716d c16716d3 = null;
        if (c16716d2 == null) {
            AbstractC19074t.m100223u("mContentModule");
            c16716d2 = null;
        }
        C21692b c21692b2 = this.f68799M;
        if (c21692b2 == null) {
            AbstractC19074t.m100223u("mCircleProgressModule");
            c21692b2 = null;
        }
        c16716d2.m89001g1(c21692b2);
        C16716d c16716d4 = this.f68798L;
        if (c16716d4 == null) {
            AbstractC19074t.m100223u("mContentModule");
            c16716d4 = null;
        }
        C30878c c30878c2 = this.f68797K;
        if (c30878c2 == null) {
            AbstractC19074t.m100223u("mChartModule");
            c30878c2 = null;
        }
        c16716d4.m89001g1(c30878c2);
        C16716d c16716d5 = this.f68798L;
        if (c16716d5 == null) {
            AbstractC19074t.m100223u("mContentModule");
        } else {
            c16716d3 = c16716d5;
        }
        mo69681L(c16716d3);
    }

    private final C30877b getDefaultValue() {
        return (C30877b) this.f68800N.getValue();
    }

    /* renamed from: V */
    public final void m75329V() {
        C21692b c21692b = this.f68799M;
        C30878c c30878c = null;
        if (c21692b == null) {
            AbstractC19074t.m100223u("mCircleProgressModule");
            c21692b = null;
        }
        c21692b.mo44614b1(8);
        C30878c c30878c2 = this.f68797K;
        if (c30878c2 == null) {
            AbstractC19074t.m100223u("mChartModule");
        } else {
            c30878c = c30878c2;
        }
        c30878c.mo44614b1(0);
    }

    /* renamed from: X */
    public final void m75330X(ZCloudQuotaUsage zCloudQuotaUsage, EnumC13436b enumC13436b) {
        ArrayList m131500h;
        long m41252j;
        C30876a c30876a;
        AbstractC19074t.m100208f(zCloudQuotaUsage, "cloudQuotaUsage");
        AbstractC19074t.m100208f(enumC13436b, "mode");
        int i11 = C13435a.f68801a[enumC13436b.ordinal()];
        if (i11 == 1) {
            m131500h = AbstractC25368s.m131500h(EnumC24251b.f117146q, EnumC24251b.f117148s, EnumC24251b.f117147r);
        } else if (i11 == 2) {
            m131500h = AbstractC25368s.m131500h(EnumC24251b.f117147r, EnumC24251b.f117146q, EnumC24251b.f117148s);
        } else if (i11 == 3) {
            m131500h = AbstractC25368s.m131500h(EnumC24251b.f117146q, EnumC24251b.f117148s, EnumC24251b.f117147r);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        if (AbstractC3489d.m17506n() || AbstractC3489d.m17512t()) {
            m131500h.remove(EnumC24251b.f117146q);
        }
        AbstractC25378x.m131542D(m131500h, C13438d.f68809q);
        ArrayList arrayList = new ArrayList();
        Iterator it = m131500h.iterator();
        while (it.hasNext()) {
            int i12 = C13435a.f68802b[((EnumC24251b) it.next()).ordinal()];
            if (i12 != 1) {
                if (i12 != 2) {
                    String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_connect_feature_backup);
                    AbstractC19074t.m100207e(m118743r0, "getString(...)");
                    c30876a = new C30876a(m118743r0, C23212s8.m119611s(getContext(), AbstractC2807a.storage_legend_green), zCloudQuotaUsage.m41251i().m41266b(), 0, false, false, null, 120, null);
                } else {
                    String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_connect_feature_cloud_media);
                    AbstractC19074t.m100207e(m118743r02, "getString(...)");
                    c30876a = new C30876a(m118743r02, C23212s8.m119611s(getContext(), AbstractC2807a.storage_legend_orange), zCloudQuotaUsage.m41251i().m41265a(), 0, false, false, null, 120, null);
                }
            } else {
                String m118746s0 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_connect_feature_my_cloud, AbstractC21935u.m114547n());
                AbstractC19074t.m100207e(m118746s0, "getString(...)");
                c30876a = new C30876a(m118746s0, C23212s8.m119611s(getContext(), AbstractC2807a.storage_legend_yellow), zCloudQuotaUsage.m41251i().m41267c(), 0, false, false, null, 120, null);
            }
            arrayList.add(c30876a);
        }
        int m119611s = C23212s8.m119611s(getContext(), AbstractC2807a.storage_legend_empty);
        if (zCloudQuotaUsage.m41258q() <= 0) {
            m41252j = 1;
        } else {
            m41252j = zCloudQuotaUsage.m41252j() - zCloudQuotaUsage.m41253k();
        }
        arrayList.add(new C30876a("", m119611s, m41252j, 0, false, false, null, 72, null));
        m75329V();
        C30878c c30878c = this.f68797K;
        if (c30878c == null) {
            AbstractC19074t.m100223u("mChartModule");
            c30878c = null;
        }
        c30878c.m150091i1(new C30877b(arrayList));
    }

    public final void setStorageBreakdown(C30877b c30877b) {
        AbstractC19074t.m100208f(c30877b, "storageBreakdown");
        m75329V();
        C30878c c30878c = this.f68797K;
        if (c30878c == null) {
            AbstractC19074t.m100223u("mChartModule");
            c30878c = null;
        }
        c30878c.m150091i1(c30877b);
    }

    public ToolStorageChartView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(new C13437c());
        this.f68800N = m129210a;
        m75328W();
    }

    public ToolStorageChartView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(new C13437c());
        this.f68800N = m129210a;
        m75328W();
    }
}
