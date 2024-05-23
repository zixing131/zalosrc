package com.zing.zalo.p077ui.toolstorage.detail;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.C1800v0;
import androidx.lifecycle.C1802w0;
import androidx.lifecycle.C1808z0;
import androidx.lifecycle.InterfaceC1764d0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.p077ui.toolstorage.detail.C13383d;
import com.zing.zalo.p077ui.toolstorage.detail.ToolStorageDetailPage;
import com.zing.zalo.p077ui.toolstorage.detail.moduleviews.ToolStorageItemBaseModuleView;
import com.zing.zalo.p077ui.zviews.BaseZaloView;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalo.zview.ZaloView;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19061k0;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19071q;
import fn0.InterfaceC19066n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kc0.C21680s;
import kotlin.NoWhenBranchMatchedException;
import me0.AbstractC23222t7;
import mm0.AbstractC23350e;
import p363nh.C23744a;
import p487rl.C25821b;
import p649xl.C30098w5;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.C24860q;
import pm0.InterfaceC24847g;
import pm0.InterfaceC24854k;
import qm0.AbstractC25332a0;
import qm0.AbstractC25366r;
import qm0.AbstractC25368s;
import ta0.AbstractC26611a;
import ta0.C26612b;
import u80.C27114d2;
import vc0.AbstractC27964c;
import vc0.C27962a;
import vc0.C27966e;
import vc0.C27969h;
import vc0.InterfaceC27965d;
import wa0.C28897w;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* loaded from: classes6.dex */
public final class ToolStorageDetailPage extends BaseZaloView {
    public static final C13334b Companion = new C13334b(null);

    /* renamed from: O0 */
    private C30098w5 f68473O0;

    /* renamed from: P0 */
    private C13383d f68474P0;

    /* renamed from: Q0 */
    private GridLayoutManager f68475Q0;

    /* renamed from: S0 */
    private C27962a f68477S0;

    /* renamed from: T0 */
    private AbstractC27964c f68478T0;

    /* renamed from: U0 */
    private final InterfaceC24854k f68479U0;

    /* renamed from: V0 */
    private InterfaceC13335c f68480V0;

    /* renamed from: W0 */
    private boolean f68481W0;

    /* renamed from: X0 */
    private String f68482X0;

    /* renamed from: M0 */
    private String f68471M0 = "All";

    /* renamed from: N0 */
    private EnumC13333a f68472N0 = EnumC13333a.f68483q;

    /* renamed from: R0 */
    private int f68476R0 = 1;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: com.zing.zalo.ui.toolstorage.detail.ToolStorageDetailPage$a */
    /* loaded from: classes6.dex */
    public static final class EnumC13333a {
        public static final a Companion;

        /* renamed from: q */
        public static final EnumC13333a f68483q = new EnumC13333a("NORMAL", 0, "normal");

        /* renamed from: r */
        public static final EnumC13333a f68484r = new EnumC13333a("MY_CLOUD", 1, "my_cloud");

        /* renamed from: s */
        public static final EnumC13333a f68485s = new EnumC13333a("Z_CLOUD", 2, "z_cloud");

        /* renamed from: t */
        private static final /* synthetic */ EnumC13333a[] f68486t;

        /* renamed from: u */
        private static final /* synthetic */ InterfaceC30165a f68487u;

        /* renamed from: p */
        private final String f68488p;

        /* renamed from: com.zing.zalo.ui.toolstorage.detail.ToolStorageDetailPage$a$a */
        /* loaded from: classes6.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC19060k abstractC19060k) {
                this();
            }

            /* renamed from: a */
            public final EnumC13333a m74886a(String str) {
                AbstractC19074t.m100208f(str, ZinstantMetaConstant.IMPRESSION_META_TYPE);
                String upperCase = str.toUpperCase(Locale.ROOT);
                AbstractC19074t.m100207e(upperCase, "toUpperCase(...)");
                return EnumC13333a.valueOf(upperCase);
            }
        }

        static {
            EnumC13333a[] m74884b = m74884b();
            f68486t = m74884b;
            f68487u = AbstractC30166b.m148796a(m74884b);
            Companion = new a(null);
        }

        private EnumC13333a(String str, int i11, String str2) {
            this.f68488p = str2;
        }

        /* renamed from: b */
        private static final /* synthetic */ EnumC13333a[] m74884b() {
            return new EnumC13333a[]{f68483q, f68484r, f68485s};
        }

        public static EnumC13333a valueOf(String str) {
            return (EnumC13333a) Enum.valueOf(EnumC13333a.class, str);
        }

        public static EnumC13333a[] values() {
            return (EnumC13333a[]) f68486t.clone();
        }

        /* renamed from: c */
        public final String m74885c() {
            return this.f68488p;
        }
    }

    /* renamed from: com.zing.zalo.ui.toolstorage.detail.ToolStorageDetailPage$b */
    /* loaded from: classes6.dex */
    public static final class C13334b {
        private C13334b() {
        }

        public /* synthetic */ C13334b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final ToolStorageDetailPage m74887a(String str, EnumC13333a enumC13333a) {
            AbstractC19074t.m100208f(str, "tabType");
            AbstractC19074t.m100208f(enumC13333a, "accessFlow");
            ToolStorageDetailPage toolStorageDetailPage = new ToolStorageDetailPage();
            Bundle bundle = new Bundle();
            bundle.putString("ARG_TAB_TYPE", str);
            bundle.putString("ARG_TAB_ACCESS_FLOW", enumC13333a.m74885c());
            toolStorageDetailPage.mo60305zK(bundle);
            return toolStorageDetailPage;
        }
    }

    /* renamed from: com.zing.zalo.ui.toolstorage.detail.ToolStorageDetailPage$c */
    /* loaded from: classes6.dex */
    public interface InterfaceC13335c {
        /* renamed from: a */
        void mo74888a(int i11, String str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.toolstorage.detail.ToolStorageDetailPage$d */
    /* loaded from: classes6.dex */
    public static final class C13336d extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: com.zing.zalo.ui.toolstorage.detail.ToolStorageDetailPage$d$a */
        /* loaded from: classes6.dex */
        public static final class a extends GridLayoutManager.AbstractC1865b {

            /* renamed from: e */
            final /* synthetic */ ToolStorageDetailPage f68490e;

            /* renamed from: f */
            final /* synthetic */ String f68491f;

            a(ToolStorageDetailPage toolStorageDetailPage, String str) {
                this.f68490e = toolStorageDetailPage;
                this.f68491f = str;
            }

            @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC1865b
            /* renamed from: f */
            public int mo9682f(int i11) {
                Integer num;
                C13383d c13383d = this.f68490e.f68474P0;
                if (c13383d != null) {
                    num = Integer.valueOf(c13383d.mo10005m(i11));
                } else {
                    num = null;
                }
                if (!AbstractC19074t.m100204b(this.f68491f, "Largest") && num != null && num.intValue() == 0) {
                    return this.f68490e.f68476R0;
                }
                if (num != null && num.intValue() == 100) {
                    return this.f68490e.f68476R0;
                }
                return 1;
            }
        }

        C13336d() {
            super(1);
        }

        /* renamed from: a */
        public final void m74889a(C24860q c24860q) {
            boolean z11;
            List m75130X;
            List m75130X2;
            String str = (String) c24860q.m129213a();
            List list = (List) c24860q.m129214b();
            GridLayoutManager gridLayoutManager = ToolStorageDetailPage.this.f68475Q0;
            if (gridLayoutManager != null) {
                gridLayoutManager.m9671f3(new a(ToolStorageDetailPage.this, str));
            }
            int i11 = 0;
            if (!AbstractC19074t.m100204b(ToolStorageDetailPage.this.f68482X0, str) && ToolStorageDetailPage.this.f68472N0 == EnumC13333a.f68485s) {
                ToolStorageDetailPage.this.f68482X0 = str;
                C30098w5 c30098w5 = ToolStorageDetailPage.this.f68473O0;
                if (c30098w5 == null) {
                    AbstractC19074t.m100223u("mBinding");
                    c30098w5 = null;
                }
                c30098w5.f139786s.m9837K1(0);
            }
            C13383d c13383d = ToolStorageDetailPage.this.f68474P0;
            if (c13383d != null) {
                if (list == null) {
                    list = AbstractC25368s.m131502j();
                }
                C13383d.m75129p0(c13383d, list, str, false, 4, null);
            }
            ToolStorageDetailPage toolStorageDetailPage = ToolStorageDetailPage.this;
            C13383d c13383d2 = toolStorageDetailPage.f68474P0;
            if (c13383d2 != null && (m75130X2 = c13383d2.m75130X()) != null && m75130X2.size() == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            toolStorageDetailPage.m74854MM(z11);
            InterfaceC13335c interfaceC13335c = ToolStorageDetailPage.this.f68480V0;
            if (interfaceC13335c != null) {
                C13383d c13383d3 = ToolStorageDetailPage.this.f68474P0;
                if (c13383d3 != null && (m75130X = c13383d3.m75130X()) != null) {
                    i11 = m75130X.size();
                }
                interfaceC13335c.mo74888a(i11, ToolStorageDetailPage.this.f68471M0);
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m74889a((C24860q) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.toolstorage.detail.ToolStorageDetailPage$e */
    /* loaded from: classes6.dex */
    public static final class C13337e extends AbstractC19075u implements InterfaceC18505l {
        C13337e() {
            super(1);
        }

        /* renamed from: a */
        public final void m74890a(Boolean bool) {
            List m75130X;
            List m131502j;
            ToolStorageDetailPage toolStorageDetailPage = ToolStorageDetailPage.this;
            AbstractC19074t.m100205c(bool);
            toolStorageDetailPage.f68481W0 = bool.booleanValue();
            boolean z11 = false;
            if (bool.booleanValue()) {
                C13383d c13383d = ToolStorageDetailPage.this.f68474P0;
                if (c13383d != null) {
                    m131502j = AbstractC25368s.m131502j();
                    C13383d.m75129p0(c13383d, m131502j, null, true, 2, null);
                }
                ToolStorageDetailPage.this.m74854MM(false);
                return;
            }
            ToolStorageDetailPage toolStorageDetailPage2 = ToolStorageDetailPage.this;
            C13383d c13383d2 = toolStorageDetailPage2.f68474P0;
            if (c13383d2 != null && (m75130X = c13383d2.m75130X()) != null && m75130X.size() == 0) {
                z11 = true;
            }
            toolStorageDetailPage2.m74854MM(z11);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m74890a((Boolean) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.toolstorage.detail.ToolStorageDetailPage$f */
    /* loaded from: classes6.dex */
    public /* synthetic */ class C13338f extends C19071q implements InterfaceC18505l {
        C13338f(Object obj) {
            super(1, obj, ToolStorageDetailPage.class, "onItemCheckedChange", "onItemCheckedChange(Lcom/zing/zalo/ui/toolstorage/detail/StorageUsageDetailItem;)V", 0);
        }

        /* renamed from: h */
        public final void m74891h(C13380a c13380a) {
            AbstractC19074t.m100208f(c13380a, "p0");
            ((ToolStorageDetailPage) this.f94922q).m74851EM(c13380a);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m74891h((C13380a) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.toolstorage.detail.ToolStorageDetailPage$g */
    /* loaded from: classes6.dex */
    public /* synthetic */ class C13339g extends C19071q implements InterfaceC18505l {
        C13339g(Object obj) {
            super(1, obj, ToolStorageDetailPage.class, "onItemLongClick", "onItemLongClick(I)V", 0);
        }

        /* renamed from: h */
        public final void m74892h(int i11) {
            ((ToolStorageDetailPage) this.f94922q).m74852FM(i11);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m74892h(((Number) obj).intValue());
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.toolstorage.detail.ToolStorageDetailPage$h */
    /* loaded from: classes6.dex */
    public /* synthetic */ class C13340h extends C19071q implements InterfaceC18505l {
        C13340h(Object obj) {
            super(1, obj, ToolStorageDetailPage.class, "onVoiceDeleted", "onVoiceDeleted(Lcom/zing/zalo/ui/toolstorage/detail/StorageUsageDetailItem;)V", 0);
        }

        /* renamed from: h */
        public final void m74893h(C13380a c13380a) {
            AbstractC19074t.m100208f(c13380a, "p0");
            ((ToolStorageDetailPage) this.f94922q).m74853HM(c13380a);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m74893h((C13380a) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.toolstorage.detail.ToolStorageDetailPage$i */
    /* loaded from: classes6.dex */
    public static final class C13341i extends RecyclerView.AbstractC1887n {
        C13341i() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1887n
        /* renamed from: g */
        public void mo10066g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1899z c1899z) {
            AbstractC19074t.m100208f(rect, "outRect");
            AbstractC19074t.m100208f(view, "view");
            AbstractC19074t.m100208f(recyclerView, "parent");
            AbstractC19074t.m100208f(c1899z, "tate");
            int i11 = AbstractC23222t7.f112550b;
            rect.set(0, i11, 0, i11);
        }
    }

    /* renamed from: com.zing.zalo.ui.toolstorage.detail.ToolStorageDetailPage$j */
    /* loaded from: classes6.dex */
    public static final class C13342j extends RecyclerView.AbstractC1892s {
        C13342j() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: d */
        public void mo10176d(RecyclerView recyclerView, int i11, int i12) {
            int m10127i;
            AbstractC19074t.m100208f(recyclerView, "recyclerView");
            super.mo10176d(recyclerView, i11, i12);
            if (!ToolStorageDetailPage.this.f68481W0 && ToolStorageDetailPage.this.f68472N0 == EnumC13333a.f68485s) {
                RecyclerView.AbstractC1888o layoutManager = recyclerView.getLayoutManager();
                AbstractC19074t.m100206d(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
                GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
                int m10110a = gridLayoutManager.m10110a();
                if (AbstractC19074t.m100204b(ToolStorageDetailPage.this.f68471M0, "All")) {
                    int m10127i2 = gridLayoutManager.m10127i();
                    AbstractC26611a m74874xM = ToolStorageDetailPage.this.m74874xM();
                    AbstractC19074t.m100206d(m74874xM, "null cannot be cast to non-null type com.zing.zalo.ui.zalocloud.viewmodels.ZCloudManagementViewModel");
                    m10127i = m10127i2 - ((C21680s) m74874xM).m111801c1();
                } else {
                    m10127i = gridLayoutManager.m10127i();
                }
                int m9740Y1 = gridLayoutManager.m9740Y1();
                if (m9740Y1 >= 0 && m9740Y1 + m10110a >= (m10127i - m10110a) - 6) {
                    AbstractC26611a m74874xM2 = ToolStorageDetailPage.this.m74874xM();
                    AbstractC19074t.m100206d(m74874xM2, "null cannot be cast to non-null type com.zing.zalo.ui.zalocloud.viewmodels.ZCloudManagementViewModel");
                    C21680s.m111794f1((C21680s) m74874xM2, false, 1, null);
                }
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.toolstorage.detail.ToolStorageDetailPage$k */
    /* loaded from: classes6.dex */
    public static final class C13343k implements C27966e.b {
        C13343k() {
        }

        @Override // vc0.C27966e.b
        /* renamed from: a */
        public void mo68951a(int i11) {
            AbstractC27964c abstractC27964c = ToolStorageDetailPage.this.f68478T0;
            if (abstractC27964c != null) {
                abstractC27964c.m140957h();
            }
            ToolStorageDetailPage.this.m74874xM().m136601p0(false);
        }

        @Override // vc0.C27966e.b
        /* renamed from: b */
        public void mo68952b(int i11) {
            List m131185M0;
            AbstractC27964c abstractC27964c = ToolStorageDetailPage.this.f68478T0;
            if (abstractC27964c != null) {
                m131185M0 = AbstractC25332a0.m131185M0(ToolStorageDetailPage.this.m74874xM().m136590b0());
                abstractC27964c.m140958i(m131185M0);
            }
            ToolStorageDetailPage.this.m74874xM().m136601p0(true);
        }
    }

    /* renamed from: com.zing.zalo.ui.toolstorage.detail.ToolStorageDetailPage$l */
    /* loaded from: classes6.dex */
    static final class C13344l extends AbstractC19075u implements InterfaceC18494a {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.ui.toolstorage.detail.ToolStorageDetailPage$l$a */
        /* loaded from: classes6.dex */
        public static final class a extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ ToolStorageDetailPage f68496q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(ToolStorageDetailPage toolStorageDetailPage) {
                super(0);
                this.f68496q = toolStorageDetailPage;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C1808z0 mo12V4() {
                ZaloView m92650VI = this.f68496q.m92650VI();
                AbstractC19074t.m100206d(m92650VI, "null cannot be cast to non-null type com.zing.zalo.zview.ZaloView");
                C1808z0 mo4644Oc = m92650VI.mo4644Oc();
                AbstractC19074t.m100207e(mo4644Oc, "<get-viewModelStore>(...)");
                return mo4644Oc;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.ui.toolstorage.detail.ToolStorageDetailPage$l$b */
        /* loaded from: classes6.dex */
        public static final class b extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            public static final b f68497q = new b();

            b() {
                super(0);
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C1802w0.b mo12V4() {
                return C26612b.Companion.m136634a();
            }
        }

        /* renamed from: com.zing.zalo.ui.toolstorage.detail.ToolStorageDetailPage$l$c */
        /* loaded from: classes6.dex */
        public /* synthetic */ class c {

            /* renamed from: a */
            public static final /* synthetic */ int[] f68498a;

            static {
                int[] iArr = new int[EnumC13333a.values().length];
                try {
                    iArr[EnumC13333a.f68483q.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC13333a.f68484r.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC13333a.f68485s.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f68498a = iArr;
            }
        }

        C13344l() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AbstractC26611a mo12V4() {
            Class cls;
            int i11 = c.f68498a[ToolStorageDetailPage.this.f68472N0.ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        cls = C21680s.class;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    cls = C27114d2.class;
                }
            } else {
                cls = C28897w.class;
            }
            return (AbstractC26611a) new C1800v0(AbstractC19061k0.m100169b(cls), new a(ToolStorageDetailPage.this), b.f68497q, null, 8, null).getValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.toolstorage.detail.ToolStorageDetailPage$m */
    /* loaded from: classes6.dex */
    public static final class C13345m implements InterfaceC1764d0, InterfaceC19066n {

        /* renamed from: p */
        private final /* synthetic */ InterfaceC18505l f68499p;

        C13345m(InterfaceC18505l interfaceC18505l) {
            AbstractC19074t.m100208f(interfaceC18505l, "function");
            this.f68499p = interfaceC18505l;
        }

        @Override // fn0.InterfaceC19066n
        /* renamed from: c */
        public final InterfaceC24847g mo9368c() {
            return this.f68499p;
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
            this.f68499p.mo205i9(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.toolstorage.detail.ToolStorageDetailPage$n */
    /* loaded from: classes6.dex */
    public static final class C13346n extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ boolean f68501r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C13346n(boolean z11) {
            super(1);
            this.f68501r = z11;
        }

        /* renamed from: a */
        public final void m74897a(List list) {
            AbstractC19074t.m100208f(list, "it");
            ToolStorageDetailPage.this.m74874xM().m136603s0(list, this.f68501r);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m74897a((List) obj);
            return C24848g0.f119245a;
        }
    }

    public ToolStorageDetailPage() {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(new C13344l());
        this.f68479U0 = m129210a;
        this.f68482X0 = "Largest";
    }

    /* renamed from: AM */
    private final void m74848AM() {
        this.f68475Q0 = new GridLayoutManager(m92689tK(), this.f68476R0);
        this.f68474P0 = new C13383d(this.f68472N0, this.f68471M0, new C13338f(this), new C13339g(this), new C13340h(this));
        C30098w5 c30098w5 = this.f68473O0;
        C30098w5 c30098w52 = null;
        if (c30098w5 == null) {
            AbstractC19074t.m100223u("mBinding");
            c30098w5 = null;
        }
        RecyclerView recyclerView = c30098w5.f139786s;
        recyclerView.setItemAnimator(null);
        recyclerView.setLayoutManager(this.f68475Q0);
        recyclerView.setAdapter(this.f68474P0);
        recyclerView.m9816A(new C13341i());
        recyclerView.m9826E(new C13342j());
        this.f68477S0 = new C27962a().m140946z(new C27966e(new C27966e.a() { // from class: wa0.b
            @Override // vc0.C27966e.a
            /* renamed from: a */
            public final void mo115544a(int i11, int i12, float f11, float f12, boolean z11, int i13) {
                ToolStorageDetailPage.m74849BM(ToolStorageDetailPage.this, i11, i12, f11, f12, z11, i13);
            }
        }, new C13343k())).m140944x(true);
        C30098w5 c30098w53 = this.f68473O0;
        if (c30098w53 == null) {
            AbstractC19074t.m100223u("mBinding");
            c30098w53 = null;
        }
        this.f68478T0 = new C27969h(c30098w53.f139786s, new AbstractC27964c.a() { // from class: wa0.c
            @Override // vc0.AbstractC27964c.a
            /* renamed from: a */
            public final void mo69546a(InterfaceC27965d interfaceC27965d, int i11, boolean z11) {
                ToolStorageDetailPage.m74850CM(ToolStorageDetailPage.this, interfaceC27965d, i11, z11);
            }
        });
        C30098w5 c30098w54 = this.f68473O0;
        if (c30098w54 == null) {
            AbstractC19074t.m100223u("mBinding");
            c30098w54 = null;
        }
        RecyclerView recyclerView2 = c30098w54.f139786s;
        C27962a c27962a = this.f68477S0;
        AbstractC19074t.m100205c(c27962a);
        recyclerView2.m9825D(c27962a);
        C30098w5 c30098w55 = this.f68473O0;
        if (c30098w55 == null) {
            AbstractC19074t.m100223u("mBinding");
        } else {
            c30098w52 = c30098w55;
        }
        c30098w52.f139786s.setMotionEventSplittingEnabled(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: BM */
    public static final void m74849BM(ToolStorageDetailPage toolStorageDetailPage, int i11, int i12, float f11, float f12, boolean z11, int i13) {
        ToolStorageItemBaseModuleView m75141j0;
        AbstractC19074t.m100208f(toolStorageDetailPage, "this$0");
        int i14 = i12 + 1;
        while (i11 < i14) {
            C30098w5 c30098w5 = toolStorageDetailPage.f68473O0;
            if (c30098w5 == null) {
                AbstractC19074t.m100223u("mBinding");
                c30098w5 = null;
            }
            RecyclerView.AbstractC1876c0 m9900t0 = c30098w5.f139786s.m9900t0(i11);
            if ((m9900t0 instanceof C13383d.b) && (m75141j0 = ((C13383d.b) m9900t0).m75141j0()) != null) {
                m75141j0.mo75159n0(z11, true);
            }
            i11++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CM */
    public static final void m74850CM(ToolStorageDetailPage toolStorageDetailPage, InterfaceC27965d interfaceC27965d, int i11, boolean z11) {
        AbstractC19074t.m100208f(toolStorageDetailPage, "this$0");
        if (interfaceC27965d instanceof C13380a) {
            toolStorageDetailPage.m74875yM(z11, i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: EM */
    public final void m74851EM(C13380a c13380a) {
        boolean z11;
        List m75130X;
        m74874xM().m136604t0(c13380a);
        C13383d c13383d = this.f68474P0;
        if (c13383d != null && (m75130X = c13383d.m75130X()) != null) {
            z11 = m74874xM().m136590b0().containsAll(m75130X);
        } else {
            z11 = false;
        }
        m74874xM().m136607y0(z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: FM */
    public final void m74852FM(int i11) {
        C27962a c27962a = this.f68477S0;
        if (c27962a != null) {
            c27962a.m140940r(i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: HM */
    public final void m74853HM(C13380a c13380a) {
        String m75081a;
        List m131496e;
        if (this.f68472N0 == EnumC13333a.f68485s) {
            C25821b m75082d = c13380a.m75082d();
            if (m75082d != null) {
                m75081a = m75082d.m133141d();
            } else {
                m75081a = null;
            }
        } else {
            m75081a = c13380a.m75081a();
        }
        if (m75081a == null) {
            return;
        }
        ZaloView m92650VI = m92650VI();
        AbstractC19074t.m100206d(m92650VI, "null cannot be cast to non-null type com.zing.zalo.ui.toolstorage.detail.ToolStorageDetailView");
        m131496e = AbstractC25366r.m131496e(m75081a);
        ((ToolStorageDetailView) m92650VI).m74997UM(m131496e, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: MM */
    public final void m74854MM(boolean z11) {
        C30098w5 c30098w5 = null;
        if (z11) {
            C30098w5 c30098w52 = this.f68473O0;
            if (c30098w52 == null) {
                AbstractC19074t.m100223u("mBinding");
                c30098w52 = null;
            }
            c30098w52.f139786s.setVisibility(8);
            C30098w5 c30098w53 = this.f68473O0;
            if (c30098w53 == null) {
                AbstractC19074t.m100223u("mBinding");
            } else {
                c30098w5 = c30098w53;
            }
            c30098w5.f139784q.setVisibility(0);
            return;
        }
        C30098w5 c30098w54 = this.f68473O0;
        if (c30098w54 == null) {
            AbstractC19074t.m100223u("mBinding");
            c30098w54 = null;
        }
        c30098w54.f139786s.setVisibility(0);
        C30098w5 c30098w55 = this.f68473O0;
        if (c30098w55 == null) {
            AbstractC19074t.m100223u("mBinding");
        } else {
            c30098w5 = c30098w55;
        }
        c30098w5.f139784q.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: xM */
    public final AbstractC26611a m74874xM() {
        return (AbstractC26611a) this.f68479U0.getValue();
    }

    /* renamed from: yM */
    private final void m74875yM(boolean z11, int i11) {
        ToolStorageItemBaseModuleView m75141j0;
        try {
            C30098w5 c30098w5 = this.f68473O0;
            if (c30098w5 == null) {
                AbstractC19074t.m100223u("mBinding");
                c30098w5 = null;
            }
            RecyclerView.AbstractC1876c0 m9900t0 = c30098w5.f139786s.m9900t0(i11);
            if (m9900t0 != null && (m9900t0 instanceof C13383d.b) && (m75141j0 = ((C13383d.b) m9900t0).m75141j0()) != null) {
                m75141j0.mo75159n0(z11, false);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: zM */
    private final void m74876zM() {
        m74874xM().m136595h0().m9219j(m92657cJ(), new C13345m(new C13336d()));
        m74874xM().m136593f0().m9219j(m92657cJ(), new C13345m(new C13337e()));
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        int i11;
        super.mo37111CJ(bundle);
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null) {
            String string = m92642L3.getString("ARG_TAB_TYPE", "");
            AbstractC19074t.m100207e(string, "getString(...)");
            this.f68471M0 = string;
            EnumC13333a.a aVar = EnumC13333a.Companion;
            String string2 = m92642L3.getString("ARG_TAB_ACCESS_FLOW", EnumC13333a.f68483q.m74885c());
            AbstractC19074t.m100207e(string2, "getString(...)");
            this.f68472N0 = aVar.m74886a(string2);
        }
        if (!AbstractC19074t.m100204b(this.f68471M0, "All") && !AbstractC19074t.m100204b(this.f68471M0, "Photos") && !AbstractC19074t.m100204b(this.f68471M0, "Videos")) {
            i11 = 1;
        } else {
            i11 = 3;
        }
        this.f68476R0 = i11;
    }

    /* renamed from: DM */
    public final boolean m74877DM() {
        List m75130X;
        C13383d c13383d = this.f68474P0;
        if (c13383d != null && (m75130X = c13383d.m75130X()) != null) {
            if (!(!m75130X.isEmpty())) {
                m75130X = null;
            }
            if (m75130X != null) {
                return m74874xM().m136590b0().containsAll(m75130X);
            }
        }
        return false;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C30098w5 m148646a = C30098w5.m148646a(layoutInflater.inflate(AbstractC7409c0.layout_media_store_tool_storage_page, viewGroup, false));
        AbstractC19074t.m100207e(m148646a, "bind(...)");
        this.f68473O0 = m148646a;
        if (m148646a == null) {
            AbstractC19074t.m100223u("mBinding");
            m148646a = null;
        }
        FrameLayout root = m148646a.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    /* renamed from: GM */
    public final void m74878GM() {
        int i11;
        InterfaceC13335c interfaceC13335c = this.f68480V0;
        if (interfaceC13335c != null) {
            C13383d c13383d = this.f68474P0;
            if (c13383d != null) {
                i11 = c13383d.mo10003k();
            } else {
                i11 = 0;
            }
            interfaceC13335c.mo74888a(i11, this.f68471M0);
        }
        C13383d c13383d2 = this.f68474P0;
        if (c13383d2 != null) {
            c13383d2.m10008p();
        }
    }

    /* renamed from: IM */
    public final void m74879IM(MessageId messageId) {
        AbstractC19074t.m100208f(messageId, "messageId");
        C13383d c13383d = this.f68474P0;
        if (c13383d != null) {
            c13383d.m75136i0(messageId);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: JJ */
    public void mo37484JJ() {
        super.mo37484JJ();
        C13383d c13383d = this.f68474P0;
        if (c13383d != null) {
            c13383d.m75134f0();
        }
    }

    /* renamed from: JM */
    public final void m74880JM(C25821b c25821b) {
        AbstractC19074t.m100208f(c25821b, "messageId");
        C13383d c13383d = this.f68474P0;
        if (c13383d != null) {
            c13383d.m75137j0(c25821b);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: KJ */
    public void mo40200KJ() {
        super.mo40200KJ();
        C23744a.b bVar = C23744a.Companion;
        bVar.m124119a().m124117e(this, 210);
        bVar.m124119a().m124117e(this, 150806);
    }

    /* renamed from: KM */
    public final void m74881KM(boolean z11) {
        C13383d c13383d = this.f68474P0;
        if (c13383d != null) {
            c13383d.m75138m0(z11, new C13346n(z11));
        }
    }

    /* renamed from: LM */
    public final void m74882LM(InterfaceC13335c interfaceC13335c) {
        AbstractC19074t.m100208f(interfaceC13335c, "listener");
        this.f68480V0 = interfaceC13335c;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        super.mo13886RJ();
        C13383d c13383d = this.f68474P0;
        if (c13383d != null) {
            c13383d.m75135g0();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: UJ */
    public void mo37584UJ() {
        super.mo37584UJ();
        C13383d c13383d = this.f68474P0;
        if (c13383d != null) {
            c13383d.m10008p();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        AbstractC19074t.m100208f(view, "view");
        super.mo37125ZJ(view, bundle);
        m74848AM();
        m74876zM();
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "";
    }

    /* renamed from: wM */
    public final List m74883wM() {
        List m131502j;
        ArrayList m75131Z;
        C13383d c13383d = this.f68474P0;
        if (c13383d == null || (m75131Z = c13383d.m75131Z()) == null) {
            m131502j = AbstractC25368s.m131502j();
            return m131502j;
        }
        return m75131Z;
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        String str;
        C13383d c13383d;
        AbstractC19074t.m100208f(objArr, "args");
        super.mo17795x(i11, Arrays.copyOf(objArr, objArr.length));
        if (i11 != 210) {
            if (i11 == 150806 && (c13383d = this.f68474P0) != null) {
                c13383d.m10008p();
                return;
            }
            return;
        }
        boolean z11 = false;
        MessageId messageId = (MessageId) objArr[0];
        if (messageId == null || (str = (String) objArr[1]) == null) {
            return;
        }
        Boolean bool = (Boolean) objArr[2];
        if (bool != null) {
            z11 = bool.booleanValue();
        }
        m74874xM().m136606x0(messageId, str, z11);
        C13383d c13383d2 = this.f68474P0;
        if (c13383d2 != null) {
            c13383d2.m10008p();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: zJ */
    public void mo40210zJ(ZaloActivity zaloActivity) {
        super.mo40210zJ(zaloActivity);
        C23744a.b bVar = C23744a.Companion;
        bVar.m124119a().m124115b(this, 210);
        bVar.m124119a().m124115b(this, 150806);
    }
}
