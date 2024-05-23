package com.zing.zalo.p077ui.zalocloud.home;

import ac.C0697c0;
import ac.C0732w;
import am.AbstractC0924m0;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.lifecycle.AbstractC1785o;
import androidx.lifecycle.AbstractC1803x;
import androidx.lifecycle.C1802w0;
import androidx.lifecycle.C1808z0;
import androidx.lifecycle.InterfaceC1756a1;
import androidx.lifecycle.InterfaceC1764d0;
import androidx.lifecycle.InterfaceC1801w;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.recyclerview.widget.AbstractC1933z;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import bc0.EnumC2746k;
import bi0.AbstractC2807a;
import bi0.AbstractC2810d;
import bi0.AbstractC2814h;
import ch0.AbstractC3489d;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.data.backuprestore.model.TargetBackupInfo;
import com.zing.zalo.data.zalocloud.model.ZCloudQuotaUsage;
import com.zing.zalo.p077ui.maintab.MainTabView;
import com.zing.zalo.p077ui.toolstorage.overview.ToolStorageView;
import com.zing.zalo.p077ui.widget.layoutmanager.LinearLayoutManagerFixed;
import com.zing.zalo.p077ui.zalocloud.bottomsheet.ChangeProtectCodeRecognitionSheetView;
import com.zing.zalo.p077ui.zalocloud.connect.ZCloudConnectSuccessView;
import com.zing.zalo.p077ui.zalocloud.connect.ZCloudMediaEmptyView;
import com.zing.zalo.p077ui.zalocloud.home.AbstractC13923f;
import com.zing.zalo.p077ui.zalocloud.home.ZCloudHomeView;
import com.zing.zalo.p077ui.zalocloud.settings.ZCloudSettingsView;
import com.zing.zalo.p077ui.zviews.SlidableZaloView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zalocloud.configs.C16805b;
import com.zing.zalo.zalocloud.migration.AbstractC16864d;
import com.zing.zalo.zalocloud.recover.ZaloCloudRecoverCloudMediaWorker;
import com.zing.zalo.zdesign.component.Button;
import com.zing.zalo.zdesign.component.C16972e0;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import com.zing.zalo.zview.AbstractC17501r0;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import en0.InterfaceC18511r;
import fn0.AbstractC19060k;
import fn0.AbstractC19061k0;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.InterfaceC19066n;
import gg0.AbstractC19444a;
import java.util.ArrayList;
import java.util.List;
import jc0.C21221b;
import k30.C21459a;
import kc0.C21672k;
import kc0.C21677p;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import me0.AbstractC23136l9;
import me0.AbstractC23152n3;
import me0.AbstractC23160o0;
import me0.AbstractC23211s7;
import me0.AbstractC23222t7;
import me0.C23055e5;
import me0.C23212s8;
import me0.C23283z7;
import mg0.AbstractC23291c;
import mm0.AbstractC23350e;
import og0.C24252c;
import og0.EnumC24251b;
import on0.C24329j;
import p269jj.C21275a;
import p320ld.C22438j;
import p348mi.AbstractC23306f;
import p363nh.C23744a;
import p479rc.C25727d;
import p542ub.InterfaceC27218a;
import p649xl.C29896ke;
import p649xl.C30159zf;
import pm0.AbstractC24856m;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.C24860q;
import pm0.C24865v;
import pm0.InterfaceC24847g;
import pm0.InterfaceC24854k;
import si.C26263i;
import tb0.C26626l;
import tg0.C26676b;
import ui0.C27280g;
import vm0.AbstractC28298d;
import wg0.AbstractC28981d;
import wg0.AbstractC28997t;
import wg0.C28989l;
import wg0.EnumC28993p;
import wg0.InterfaceC28990m;
import wm0.AbstractC29094b;
import wm0.AbstractC29104l;
import yg0.EnumC30980a;

/* loaded from: classes6.dex */
public final class ZCloudHomeView extends SlidableZaloView {
    public static final C13899a Companion = new C13899a(null);

    /* renamed from: P0 */
    private C30159zf f71646P0;

    /* renamed from: R0 */
    private int f71648R0;

    /* renamed from: T0 */
    private boolean f71650T0;

    /* renamed from: U0 */
    private final InterfaceC24854k f71651U0;

    /* renamed from: V0 */
    private final InterfaceC24854k f71652V0;

    /* renamed from: W0 */
    private boolean f71653W0;

    /* renamed from: X0 */
    private C16972e0 f71654X0;

    /* renamed from: Y0 */
    private final C13915q f71655Y0;

    /* renamed from: Z0 */
    private final boolean f71656Z0;

    /* renamed from: a1 */
    private boolean f71657a1;

    /* renamed from: Q0 */
    private final InterfaceC24854k f71647Q0 = AbstractC17501r0.m93124a(this, AbstractC19061k0.m100169b(C21672k.class), new C13912n(new C13911m(this)), C13913o.f71684q);

    /* renamed from: S0 */
    private final boolean f71649S0 = C16805b.Companion.m89811a().m89808w();

    /* renamed from: com.zing.zalo.ui.zalocloud.home.ZCloudHomeView$a */
    /* loaded from: classes6.dex */
    public static final class C13899a {
        private C13899a() {
        }

        public /* synthetic */ C13899a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zalocloud.home.ZCloudHomeView$b */
    /* loaded from: classes6.dex */
    public static final class C13900b extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f71658t;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.ui.zalocloud.home.ZCloudHomeView$b$a */
        /* loaded from: classes6.dex */
        public static final class a extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f71660t;

            /* renamed from: u */
            final /* synthetic */ ZCloudHomeView f71661u;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.zing.zalo.ui.zalocloud.home.ZCloudHomeView$b$a$a, reason: collision with other inner class name */
            /* loaded from: classes6.dex */
            public static final class C32783a implements FlowCollector {

                /* renamed from: p */
                final /* synthetic */ ZCloudHomeView f71662p;

                C32783a(ZCloudHomeView zCloudHomeView) {
                    this.f71662p = zCloudHomeView;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object mo12109b(Boolean bool, Continuation continuation) {
                    if (AbstractC19074t.m100204b(bool, AbstractC29094b.m145339a(true))) {
                        this.f71662p.m77321RM().m111734R0(bool.booleanValue());
                        if (!this.f71662p.m77321RM().m111727G0()) {
                            return C24848g0.f119245a;
                        }
                        if (this.f71662p.f71653W0) {
                            this.f71662p.m77351nN(AbstractC23291c.d.f113055b);
                        } else {
                            this.f71662p.m77351nN((AbstractC23291c) C25727d.Companion.m132783f().getValue());
                        }
                    }
                    return C24848g0.f119245a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(ZCloudHomeView zCloudHomeView, Continuation continuation) {
                super(2, continuation);
                this.f71661u = zCloudHomeView;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new a(this.f71661u, continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                Object m142578e;
                m142578e = AbstractC28298d.m142578e();
                int i11 = this.f71660t;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC24862s.m129228b(obj);
                } else {
                    AbstractC24862s.m129228b(obj);
                    StateFlow m77100e = ChangeProtectCodeRecognitionSheetView.Companion.m77100e();
                    C32783a c32783a = new C32783a(this.f71661u);
                    this.f71660t = 1;
                    if (m77100e.mo97893a(c32783a, this) == m142578e) {
                        return m142578e;
                    }
                }
                throw new KotlinNothingValueException();
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        C13900b(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new C13900b(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f71658t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                InterfaceC1801w m92657cJ = ZCloudHomeView.this.m92657cJ();
                AbstractC19074t.m100207e(m92657cJ, "getViewLifecycleOwner(...)");
                AbstractC1785o.b bVar = AbstractC1785o.b.STARTED;
                a aVar = new a(ZCloudHomeView.this, null);
                this.f71658t = 1;
                if (RepeatOnLifecycleKt.m9234b(m92657cJ, bVar, aVar, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C13900b) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zalocloud.home.ZCloudHomeView$c */
    /* loaded from: classes6.dex */
    public static final class C13901c extends AbstractC19075u implements InterfaceC18505l {
        C13901c() {
            super(1);
        }

        /* renamed from: a */
        public final void m77379a(ZCloudQuotaUsage zCloudQuotaUsage) {
            C26676b.m136957g("SMLZCloudHome", "Event: " + zCloudQuotaUsage, null, 4, null);
            C13922e m77322SM = ZCloudHomeView.this.m77322SM();
            AbstractC19074t.m100205c(zCloudQuotaUsage);
            m77322SM.m77492R(zCloudQuotaUsage);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m77379a((ZCloudQuotaUsage) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zalocloud.home.ZCloudHomeView$d */
    /* loaded from: classes6.dex */
    public static final class C13902d extends AbstractC19075u implements InterfaceC18505l {
        C13902d() {
            super(1);
        }

        /* renamed from: a */
        public final void m77380a(Boolean bool) {
            C13922e m77322SM = ZCloudHomeView.this.m77322SM();
            AbstractC19074t.m100205c(bool);
            m77322SM.m77490P(bool.booleanValue());
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m77380a((Boolean) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zalocloud.home.ZCloudHomeView$e */
    /* loaded from: classes6.dex */
    public static final class C13903e extends AbstractC19075u implements InterfaceC18505l {
        C13903e() {
            super(1);
        }

        /* renamed from: a */
        public final void m77381a(Boolean bool) {
            C30159zf c30159zf = ZCloudHomeView.this.f71646P0;
            if (c30159zf == null) {
                AbstractC19074t.m100223u("binding");
                c30159zf = null;
            }
            SwipeRefreshLayout swipeRefreshLayout = c30159zf.f140172r;
            AbstractC19074t.m100205c(bool);
            swipeRefreshLayout.setRefreshing(bool.booleanValue());
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m77381a((Boolean) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zalocloud.home.ZCloudHomeView$f */
    /* loaded from: classes6.dex */
    public static final class C13904f extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: com.zing.zalo.ui.zalocloud.home.ZCloudHomeView$f$a */
        /* loaded from: classes6.dex */
        public /* synthetic */ class a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f71667a;

            static {
                int[] iArr = new int[EnumC24251b.values().length];
                try {
                    iArr[EnumC24251b.f117147r.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                f71667a = iArr;
            }
        }

        C13904f() {
            super(1);
        }

        /* renamed from: a */
        public final void m77382a(C24860q c24860q) {
            if (a.f71667a[((EnumC24251b) c24860q.m129215c()).ordinal()] == 1) {
                ZCloudHomeView.this.m77325VM(((Boolean) c24860q.m129216d()).booleanValue());
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m77382a((C24860q) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zalocloud.home.ZCloudHomeView$g */
    /* loaded from: classes6.dex */
    public static final class C13905g extends AbstractC19075u implements InterfaceC18505l {
        C13905g() {
            super(1);
        }

        /* renamed from: a */
        public final void m77383a(Integer num) {
            if (AbstractC3489d.m17506n() || AbstractC3489d.m17512t() || num == null || num.intValue() != -1) {
                return;
            }
            if (AbstractC0924m0.m3455Tc() && !AbstractC0924m0.m3484Uc()) {
                ZCloudHomeView.this.m77375zN();
                ZCloudHomeView.this.m77345kN(true);
            } else {
                Bundle bundle = new Bundle();
                bundle.putSerializable("EXTRA_FLOW", ZCloudConnectSuccessView.EnumC13827b.f71512q);
                bundle.putInt("SHOW_WITH_FLAGS", 33554432);
                ZCloudHomeView.this.m92693xK().m93066i2(ZCloudConnectSuccessView.class, bundle, 0, 1, true);
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m77383a((Integer) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zalocloud.home.ZCloudHomeView$h */
    /* loaded from: classes6.dex */
    public static final class C13906h extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f71669t;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.ui.zalocloud.home.ZCloudHomeView$h$a */
        /* loaded from: classes6.dex */
        public static final class a extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f71671t;

            /* renamed from: u */
            final /* synthetic */ ZCloudHomeView f71672u;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.zing.zalo.ui.zalocloud.home.ZCloudHomeView$h$a$a, reason: collision with other inner class name */
            /* loaded from: classes6.dex */
            public static final class C32784a extends AbstractC29104l implements InterfaceC18511r {

                /* renamed from: t */
                int f71673t;

                /* renamed from: u */
                /* synthetic */ Object f71674u;

                /* renamed from: v */
                /* synthetic */ Object f71675v;

                /* renamed from: w */
                /* synthetic */ Object f71676w;

                C32784a(Continuation continuation) {
                    super(4, continuation);
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: o */
                public final Object mo239o(Object obj) {
                    AbstractC28298d.m142578e();
                    if (this.f71673t == 0) {
                        AbstractC24862s.m129228b(obj);
                        return new C24865v((AbstractC28981d) this.f71674u, (AbstractC23291c) this.f71675v, (ZaloCloudRecoverCloudMediaWorker.AbstractC16884f) this.f71676w);
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }

                @Override // en0.InterfaceC18511r
                /* renamed from: r, reason: merged with bridge method [inline-methods] */
                public final Object mo49340Uc(AbstractC28981d abstractC28981d, AbstractC23291c abstractC23291c, ZaloCloudRecoverCloudMediaWorker.AbstractC16884f abstractC16884f, Continuation continuation) {
                    C32784a c32784a = new C32784a(continuation);
                    c32784a.f71674u = abstractC28981d;
                    c32784a.f71675v = abstractC23291c;
                    c32784a.f71676w = abstractC16884f;
                    return c32784a.mo239o(C24848g0.f119245a);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.zing.zalo.ui.zalocloud.home.ZCloudHomeView$h$a$b */
            /* loaded from: classes6.dex */
            public static final class b implements FlowCollector {

                /* renamed from: p */
                final /* synthetic */ ZCloudHomeView f71677p;

                b(ZCloudHomeView zCloudHomeView) {
                    this.f71677p = zCloudHomeView;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object mo12109b(C24865v c24865v, Continuation continuation) {
                    AbstractC23291c abstractC23291c = (AbstractC23291c) c24865v.m129233e();
                    AbstractC28981d abstractC28981d = (AbstractC28981d) c24865v.m129232d();
                    ZaloCloudRecoverCloudMediaWorker.AbstractC16884f abstractC16884f = (ZaloCloudRecoverCloudMediaWorker.AbstractC16884f) c24865v.m129234f();
                    C26676b.m136957g("SMLZCloudHome", "ZHomeState: Onboarding State: " + abstractC28981d + ". Change key State: " + abstractC23291c + ". Recover State: " + abstractC16884f, null, 4, null);
                    this.f71677p.m77321RM().m111731O0(abstractC16884f);
                    if (!(abstractC23291c instanceof AbstractC23291c.b)) {
                        this.f71677p.m77351nN((AbstractC23291c) c24865v.m129233e());
                    } else if (!(abstractC16884f instanceof ZaloCloudRecoverCloudMediaWorker.AbstractC16884f.c)) {
                        this.f71677p.m77343jN((ZaloCloudRecoverCloudMediaWorker.AbstractC16884f) c24865v.m129234f());
                    } else {
                        this.f71677p.m77324UM(abstractC28981d);
                    }
                    return C24848g0.f119245a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(ZCloudHomeView zCloudHomeView, Continuation continuation) {
                super(2, continuation);
                this.f71672u = zCloudHomeView;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new a(this.f71672u, continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                Object m142578e;
                m142578e = AbstractC28298d.m142578e();
                int i11 = this.f71671t;
                if (i11 != 0) {
                    if (i11 == 1) {
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    Flow m113293k = FlowKt.m113293k(C28989l.Companion.m144769a().m144765r(), C25727d.Companion.m132783f(), ZaloCloudRecoverCloudMediaWorker.Companion.m90201h(), new C32784a(null));
                    b bVar = new b(this.f71672u);
                    this.f71671t = 1;
                    if (m113293k.mo97893a(bVar, this) == m142578e) {
                        return m142578e;
                    }
                }
                return C24848g0.f119245a;
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        C13906h(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new C13906h(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f71669t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                InterfaceC1801w m92657cJ = ZCloudHomeView.this.m92657cJ();
                AbstractC19074t.m100207e(m92657cJ, "getViewLifecycleOwner(...)");
                AbstractC1785o.b bVar = AbstractC1785o.b.STARTED;
                a aVar = new a(ZCloudHomeView.this, null);
                this.f71669t = 1;
                if (RepeatOnLifecycleKt.m9234b(m92657cJ, bVar, aVar, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C13906h) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.home.ZCloudHomeView$i */
    /* loaded from: classes6.dex */
    static final class C13907i extends AbstractC19075u implements InterfaceC18494a {
        C13907i() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LinearLayoutManagerFixed mo12V4() {
            return new LinearLayoutManagerFixed(ZCloudHomeView.this.getContext(), 1, false, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zalocloud.home.ZCloudHomeView$j */
    /* loaded from: classes6.dex */
    public static final class C13908j implements InterfaceC1764d0, InterfaceC19066n {

        /* renamed from: p */
        private final /* synthetic */ InterfaceC18505l f71679p;

        C13908j(InterfaceC18505l interfaceC18505l) {
            AbstractC19074t.m100208f(interfaceC18505l, "function");
            this.f71679p = interfaceC18505l;
        }

        @Override // fn0.InterfaceC19066n
        /* renamed from: c */
        public final InterfaceC24847g mo9368c() {
            return this.f71679p;
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
            this.f71679p.mo205i9(obj);
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.home.ZCloudHomeView$k */
    /* loaded from: classes6.dex */
    public static final class C13909k extends RecyclerView.AbstractC1887n {
        C13909k() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1887n
        /* renamed from: g */
        public void mo10066g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1899z c1899z) {
            Rect rect2;
            int i11;
            AbstractC19074t.m100208f(rect, "outRect");
            AbstractC19074t.m100208f(view, "view");
            AbstractC19074t.m100208f(recyclerView, "parent");
            AbstractC19074t.m100208f(c1899z, "tate");
            int m9817A0 = recyclerView.m9817A0(view);
            if (m9817A0 < 0) {
                return;
            }
            int mo10005m = ZCloudHomeView.this.m77322SM().mo10005m(m9817A0);
            int i12 = 0;
            if (mo10005m != 1) {
                if (mo10005m != 2 && mo10005m != 3) {
                    if (mo10005m != 13) {
                        if (mo10005m != 15) {
                            if (mo10005m != 17) {
                                if (mo10005m != 18) {
                                    rect2 = new Rect(0, 0, 0, 0);
                                } else {
                                    int i13 = AbstractC23222t7.f112586t;
                                    rect2 = new Rect(i13, 0, i13, i13);
                                }
                            } else {
                                int i14 = AbstractC23222t7.f112586t;
                                int i15 = AbstractC23222t7.f112566j;
                                int i16 = AbstractC23222t7.f112586t;
                                rect2 = new Rect(i14, i15, i16, i16);
                            }
                        } else {
                            int i17 = AbstractC23222t7.f112586t;
                            rect2 = new Rect(i17, i17, i17, AbstractC23222t7.f112566j);
                        }
                    } else {
                        rect2 = new Rect(AbstractC23222t7.f112586t, AbstractC23222t7.f112576o, AbstractC23222t7.f112586t, AbstractC23222t7.f112566j);
                    }
                } else {
                    int i18 = m9817A0 + 1;
                    if (i18 < ZCloudHomeView.this.m77322SM().mo10003k() && ZCloudHomeView.this.m77322SM().mo10005m(i18) == 9) {
                        i12 = AbstractC23222t7.f112576o;
                    }
                    rect2 = new Rect(AbstractC23222t7.f112586t, AbstractC23222t7.f112576o, AbstractC23222t7.f112586t, i12);
                }
            } else {
                int i19 = AbstractC23222t7.f112586t;
                if (m9817A0 > 0) {
                    i11 = i19;
                } else {
                    i11 = 0;
                }
                rect2 = new Rect(i19, i11, i19, 0);
            }
            if (m9817A0 == 0 && mo10005m != 11) {
                rect2.top = AbstractC23222t7.f112586t;
            }
            rect.set(rect2);
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.home.ZCloudHomeView$l */
    /* loaded from: classes6.dex */
    public static final class C13910l extends RecyclerView.AbstractC1892s {
        C13910l() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: d */
        public void mo10176d(RecyclerView recyclerView, int i11, int i12) {
            boolean z11;
            AbstractC19074t.m100208f(recyclerView, "recyclerView");
            super.mo10176d(recyclerView, i11, i12);
            if (recyclerView.computeVerticalScrollOffset() == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (i12 < 0) {
                C30159zf c30159zf = ZCloudHomeView.this.f71646P0;
                if (c30159zf == null) {
                    AbstractC19074t.m100223u("binding");
                    c30159zf = null;
                }
                c30159zf.f140172r.setEnabled(z11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.home.ZCloudHomeView$m */
    /* loaded from: classes6.dex */
    public static final class C13911m extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ ZaloView f71682q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13911m(ZaloView zaloView) {
            super(0);
            this.f71682q = zaloView;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ZaloView mo12V4() {
            return this.f71682q;
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.home.ZCloudHomeView$n */
    /* loaded from: classes6.dex */
    public static final class C13912n extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ InterfaceC18494a f71683q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13912n(InterfaceC18494a interfaceC18494a) {
            super(0);
            this.f71683q = interfaceC18494a;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1808z0 mo12V4() {
            C1808z0 mo4644Oc = ((InterfaceC1756a1) this.f71683q.mo12V4()).mo4644Oc();
            AbstractC19074t.m100207e(mo4644Oc, "ownerProducer().viewModelStore");
            return mo4644Oc;
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.home.ZCloudHomeView$o */
    /* loaded from: classes6.dex */
    static final class C13913o extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C13913o f71684q = new C13913o();

        C13913o() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1802w0.b mo12V4() {
            return C21677p.Companion.m111768a();
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.home.ZCloudHomeView$p */
    /* loaded from: classes6.dex */
    static final class C13914p extends AbstractC19075u implements InterfaceC18494a {
        C13914p() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C13922e mo12V4() {
            return new C13922e(ZCloudHomeView.this.f71655Y0);
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.home.ZCloudHomeView$q */
    /* loaded from: classes6.dex */
    public static final class C13915q implements InterfaceC13924g {

        /* renamed from: com.zing.zalo.ui.zalocloud.home.ZCloudHomeView$q$a */
        /* loaded from: classes6.dex */
        public /* synthetic */ class a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f71687a;

            /* renamed from: b */
            public static final /* synthetic */ int[] f71688b;

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
                f71687a = iArr;
                int[] iArr2 = new int[EnumC2746k.values().length];
                try {
                    iArr2[EnumC2746k.f10889q.ordinal()] = 1;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr2[EnumC2746k.f10890r.ordinal()] = 2;
                } catch (NoSuchFieldError unused5) {
                }
                f71688b = iArr2;
            }
        }

        C13915q() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: p */
        public static final void m77394p(ZCloudHomeView zCloudHomeView) {
            AbstractC19074t.m100208f(zCloudHomeView, "this$0");
            zCloudHomeView.m77322SM().m77491Q();
        }

        @Override // com.zing.zalo.p077ui.zalocloud.home.InterfaceC13924g
        /* renamed from: a */
        public void mo77395a() {
            C30159zf c30159zf = ZCloudHomeView.this.f71646P0;
            if (c30159zf == null) {
                AbstractC19074t.m100223u("binding");
                c30159zf = null;
            }
            RecyclerView recyclerView = c30159zf.f140171q;
            final ZCloudHomeView zCloudHomeView = ZCloudHomeView.this;
            recyclerView.post(new Runnable() { // from class: bc0.a0
                @Override // java.lang.Runnable
                public final void run() {
                    ZCloudHomeView.C13915q.m77394p(ZCloudHomeView.this);
                }
            });
        }

        @Override // com.zing.zalo.p077ui.zalocloud.home.InterfaceC13924g
        /* renamed from: b */
        public void mo77396b() {
            C28989l.m144728I(C28989l.Companion.m144769a(), false, 1, null);
            C26676b.f126324a.m136974M();
        }

        @Override // com.zing.zalo.p077ui.zalocloud.home.InterfaceC13924g
        /* renamed from: c */
        public int mo77397c() {
            C30159zf c30159zf = ZCloudHomeView.this.f71646P0;
            if (c30159zf == null) {
                AbstractC19074t.m100223u("binding");
                c30159zf = null;
            }
            return c30159zf.f140171q.getBottom();
        }

        @Override // com.zing.zalo.p077ui.zalocloud.home.InterfaceC13924g
        /* renamed from: d */
        public void mo77398d(Object obj) {
            AbstractC19074t.m100208f(obj, "tag");
            if (AbstractC19074t.m100204b(obj, Integer.valueOf(AbstractC6918a0.zhome_bottom_banner_view_detail_cta))) {
                C0732w.m1177r(C0732w.Companion.m1189a(), "zcloud_grace_home_check_detail", null, null, null, 14, null);
                C26626l m120695n2 = AbstractC23306f.m120695n2();
                AbstractC19074t.m100207e(m120695n2, "provideZaloCloudUIHandler(...)");
                C26626l.m136673g0(m120695n2, false, 1, null);
                return;
            }
            if (AbstractC19074t.m100204b(obj, Integer.valueOf(AbstractC6918a0.zhome_bottom_banner_resume_download_cta))) {
                C0732w.m1177r(C0732w.Companion.m1189a(), "zcloud_grace_home_manual_resume", null, null, null, 14, null);
                ZaloCloudRecoverCloudMediaWorker.Companion.m90205q(ZCloudHomeView.this.getContext());
            } else if (AbstractC19074t.m100204b(obj, Integer.valueOf(AbstractC6918a0.zhome_bottom_banner_clean_storage_cta))) {
                C0732w.m1177r(C0732w.Companion.m1189a(), "zcloud_grace_home_free_storage", null, null, null, 14, null);
                AbstractC23152n3.m119078x0(ZCloudHomeView.this.getContext());
            } else if (AbstractC19074t.m100204b(obj, Integer.valueOf(AbstractC6918a0.zhome_bottom_banner_view_instruction_cta))) {
                C0732w.m1177r(C0732w.Companion.m1189a(), "zcloud_grace_home_full_storage_help", null, null, null, 14, null);
                AbstractC23152n3.m119050j0(ZCloudHomeView.this.m92689tK(), C21275a.Companion.m110211a().m110204g().m116313e());
            }
        }

        @Override // com.zing.zalo.p077ui.zalocloud.home.InterfaceC13924g
        /* renamed from: e */
        public void mo77399e() {
            C25727d.Companion.m132789m();
        }

        @Override // com.zing.zalo.p077ui.zalocloud.home.InterfaceC13924g
        /* renamed from: f */
        public int mo77400f() {
            C30159zf c30159zf = ZCloudHomeView.this.f71646P0;
            if (c30159zf == null) {
                AbstractC19074t.m100223u("binding");
                c30159zf = null;
            }
            RecyclerView.AbstractC1876c0 m9900t0 = c30159zf.f140171q.m9900t0(ZCloudHomeView.this.m77322SM().mo10003k() - 2);
            if (m9900t0 != null) {
                return m9900t0.f7784p.getBottom() + AbstractC23222t7.f112586t;
            }
            return 0;
        }

        @Override // com.zing.zalo.p077ui.zalocloud.home.InterfaceC13924g
        /* renamed from: g */
        public void mo77401g() {
            Bundle bundle = new Bundle();
            bundle.putInt("SHOW_WITH_FLAGS", 67108864);
            bundle.putBoolean("EXTRA_FROM_ACTIVE_LOGIN_FLOW", true);
            C17487o0 m92662fJ = ZCloudHomeView.this.m92662fJ();
            if (m92662fJ != null) {
                m92662fJ.m93069k2(MainTabView.class, bundle, 1, true);
            }
            C26676b.f126324a.m136999m();
        }

        @Override // com.zing.zalo.p077ui.zalocloud.home.InterfaceC13924g
        /* renamed from: h */
        public void mo77402h() {
            if (AbstractC3489d.m17506n()) {
                C0732w.m1177r(C0732w.Companion.m1189a(), "zcloud_home_grace_download_data", null, null, null, 14, null);
            }
            C26626l m120695n2 = AbstractC23306f.m120695n2();
            AbstractC19074t.m100207e(m120695n2, "provideZaloCloudUIHandler(...)");
            C26626l.m136673g0(m120695n2, false, 1, null);
        }

        @Override // com.zing.zalo.p077ui.zalocloud.home.InterfaceC13924g
        /* renamed from: i */
        public void mo77403i(EnumC24251b enumC24251b) {
            AbstractC19074t.m100208f(enumC24251b, "feature");
            int i11 = a.f71687a[enumC24251b.ordinal()];
            if (i11 == 1) {
                ZCloudHomeView.this.m77335fN();
            } else if (i11 != 2) {
                if (i11 == 3) {
                    ZCloudHomeView.this.m77337gN();
                }
            } else {
                ZCloudHomeView.m77334eN(ZCloudHomeView.this, false, false, 3, null);
            }
            C26676b.f126324a.m137004r(enumC24251b);
        }

        @Override // com.zing.zalo.p077ui.zalocloud.home.InterfaceC13924g
        /* renamed from: j */
        public void mo77404j() {
            C26626l m136712a = C26626l.Companion.m136712a();
            InterfaceC27218a m92692wK = ZCloudHomeView.this.m92692wK();
            AbstractC19074t.m100207e(m92692wK, "requireZaloActivity(...)");
            C26626l.m136660Y(m136712a, m92692wK, 0, 2, null);
            C26676b.f126324a.m136965D(new C24329j("\\p{Zs}+").m127019g(C21459a.m111038f(ZCloudHomeView.this.m77321RM().m111743t0(), 0, 2, null), ""));
        }

        @Override // com.zing.zalo.p077ui.zalocloud.home.InterfaceC13924g
        /* renamed from: k */
        public void mo77405k(EnumC24251b enumC24251b) {
            AbstractC19074t.m100208f(enumC24251b, "feature");
            int i11 = a.f71687a[enumC24251b.ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        ZCloudHomeView.this.m77363tN(enumC24251b);
                    }
                } else if (C26263i.m135055u().m135071M()) {
                    ToastUtils.showMess(ZCloudHomeView.this.m92652XI(AbstractC8020f0.str_try_again_wait_optimizing));
                } else {
                    ZCloudHomeView.m77334eN(ZCloudHomeView.this, false, false, 3, null);
                }
            } else {
                C17487o0 m92662fJ = ZCloudHomeView.this.m92662fJ();
                if (m92662fJ != null) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("arg_feature", enumC24251b.m126592c());
                    C24848g0 c24848g0 = C24848g0.f119245a;
                    m92662fJ.mo89694j2(ZCloudMediaEmptyView.class, bundle, 0, "SMLZCloudMediaEmptyView", 1, true);
                }
            }
            C26676b.f126324a.m136976O(enumC24251b);
        }

        @Override // com.zing.zalo.p077ui.zalocloud.home.InterfaceC13924g
        /* renamed from: l */
        public void mo77406l() {
            C26676b c26676b = C26676b.f126324a;
            C28989l.a aVar = C28989l.Companion;
            c26676b.m136975N(((AbstractC28981d) aVar.m144769a().m144765r().getValue()).m144696c(), "fullscreen");
            C28989l.m144728I(aVar.m144769a(), false, 1, null);
        }

        @Override // com.zing.zalo.p077ui.zalocloud.home.InterfaceC13924g
        /* renamed from: m */
        public void mo77407m() {
            C26626l m136712a = C26626l.Companion.m136712a();
            Context m92689tK = ZCloudHomeView.this.m92689tK();
            AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
            m136712a.m136696M(m92689tK, "cloud_home");
        }

        @Override // com.zing.zalo.p077ui.zalocloud.home.InterfaceC13924g
        /* renamed from: n */
        public void mo77408n(AbstractC13923f.n nVar) {
            AbstractC19074t.m100208f(nVar, "data");
            int i11 = a.f71688b[nVar.m77518b().ordinal()];
            if (i11 == 1) {
                ZCloudHomeView.this.m77361sN();
            } else {
                if (i11 != 2) {
                    return;
                }
                C28989l m120667g2 = AbstractC23306f.m120667g2();
                AbstractC19074t.m100207e(m120667g2, "provideZaloCloudOnboardingJobManager(...)");
                C28989l.m144728I(m120667g2, false, 1, null);
            }
        }
    }

    public ZCloudHomeView() {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        m129210a = AbstractC24856m.m129210a(new C13907i());
        this.f71651U0 = m129210a;
        m129210a2 = AbstractC24856m.m129210a(new C13914p());
        this.f71652V0 = m129210a2;
        this.f71655Y0 = new C13915q();
        this.f71656Z0 = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: AN */
    public static final void m77303AN(InterfaceC17463d interfaceC17463d, int i11) {
        C26676b.f126324a.m136969H(-1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: BN */
    public static final void m77305BN(InterfaceC17463d interfaceC17463d) {
        C0697c0.Companion.m1048b().m1035h("ZCloudMigrationOutQuota");
    }

    /* renamed from: HM */
    private final void m77311HM() {
        if (!m77321RM().m111726F0() && m77322SM().mo10003k() > 0) {
            return;
        }
        m77345kN(true);
    }

    /* renamed from: IM */
    private final void m77312IM() {
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null && m92642L3.getBoolean("KEY_SHOW_RECOGNITION_CHANGE_PROTECT_CODE", false) && !ChangeProtectCodeRecognitionSheetView.Companion.m77101f()) {
            Bundle m92642L32 = m92642L3();
            if (m92642L32 != null) {
                m92642L32.putBoolean("KEY_SHOW_RECOGNITION_CHANGE_PROTECT_CODE", false);
            }
            AbstractC19444a.m101694b(new Runnable() { // from class: bc0.u
                @Override // java.lang.Runnable
                public final void run() {
                    ZCloudHomeView.m77313JM(ZCloudHomeView.this);
                }
            }, 500L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: JM */
    public static final void m77313JM(ZCloudHomeView zCloudHomeView) {
        AbstractC19074t.m100208f(zCloudHomeView, "this$0");
        ChangeProtectCodeRecognitionSheetView.C13825a c13825a = ChangeProtectCodeRecognitionSheetView.Companion;
        C17487o0 m92693xK = zCloudHomeView.m92693xK();
        AbstractC19074t.m100207e(m92693xK, "requireZaloViewManager(...)");
        c13825a.m77103h(m92693xK);
        zCloudHomeView.m77326WM();
        zCloudHomeView.f71653W0 = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: KM */
    public static final void m77314KM(ZCloudHomeView zCloudHomeView, Object[] objArr) {
        AbstractC19074t.m100208f(zCloudHomeView, "this$0");
        AbstractC19074t.m100208f(objArr, "$args");
        zCloudHomeView.m77323TM(objArr);
    }

    /* renamed from: LM */
    private final List m77315LM() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new AbstractC13923f.c.b(null, 1, null));
        arrayList.add(new AbstractC13923f.b.C32786b(null, 1, null));
        AbstractC13923f.e eVar = AbstractC13923f.e.f71776b;
        arrayList.add(eVar);
        String m92652XI = m92652XI(AbstractC8020f0.str_connect_feature_section_header);
        AbstractC19074t.m100207e(m92652XI, "getString(...)");
        arrayList.add(new AbstractC13923f.h(m92652XI));
        EnumC24251b enumC24251b = EnumC24251b.f117146q;
        int i11 = AbstractC8020f0.str_connect_feature_cloud_media;
        arrayList.add(new AbstractC13923f.j(new C21221b(enumC24251b, i11, i11), 0L, false, false, false, 30, null));
        EnumC24251b enumC24251b2 = EnumC24251b.f117148s;
        int i12 = AbstractC8020f0.str_connect_feature_backup;
        arrayList.add(new AbstractC13923f.j(new C21221b(enumC24251b2, i12, i12), 0L, false, false, false, 30, null));
        EnumC24251b enumC24251b3 = EnumC24251b.f117147r;
        int i13 = AbstractC8020f0.str_connect_feature_my_cloud;
        arrayList.add(new AbstractC13923f.j(new C21221b(enumC24251b3, i13, i13), 0L, false, false, false, 14, null));
        arrayList.add(eVar);
        if (this.f71656Z0) {
            arrayList.add(new AbstractC13923f.d(0L, 1, null));
        }
        arrayList.add(new AbstractC13923f.g(false, 1, null));
        return arrayList;
    }

    /* renamed from: MM */
    private final List m77316MM(ZaloCloudRecoverCloudMediaWorker.AbstractC16884f abstractC16884f) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new AbstractC13923f.c.b(m77321RM().m111744u0()));
        arrayList.add(new AbstractC13923f.b.C32786b(m77321RM().m111744u0()));
        AbstractC13923f.e eVar = AbstractC13923f.e.f71776b;
        arrayList.add(eVar);
        String m92652XI = m92652XI(AbstractC8020f0.str_connect_feature_section_header);
        AbstractC19074t.m100207e(m92652XI, "getString(...)");
        arrayList.add(new AbstractC13923f.h(m92652XI));
        EnumC24251b enumC24251b = EnumC24251b.f117148s;
        int i11 = AbstractC8020f0.str_connect_feature_backup;
        arrayList.add(new AbstractC13923f.j(new C21221b(enumC24251b, i11, i11), m77321RM().m111744u0().m41251i().m41266b(), false, false, false, 28, null));
        EnumC24251b enumC24251b2 = EnumC24251b.f117147r;
        int i12 = AbstractC8020f0.str_connect_feature_my_cloud;
        arrayList.add(new AbstractC13923f.j(new C21221b(enumC24251b2, i12, i12), m77321RM().m111744u0().m41251i().m41267c(), false, false, false, 12, null));
        arrayList.add(eVar);
        String m92652XI2 = m92652XI(AbstractC8020f0.str_grace_period_section_header);
        AbstractC19074t.m100207e(m92652XI2, "getString(...)");
        arrayList.add(new AbstractC13923f.h(m92652XI2));
        EnumC24251b enumC24251b3 = EnumC24251b.f117146q;
        int i13 = AbstractC8020f0.str_connect_feature_cloud_media;
        arrayList.add(new AbstractC13923f.j(new C21221b(enumC24251b3, i13, i13), 0L, false, !AbstractC19074t.m100204b(abstractC16884f, ZaloCloudRecoverCloudMediaWorker.AbstractC16884f.c.f85905b), false, 6, null));
        arrayList.add(new AbstractC13923f.k(abstractC16884f));
        arrayList.add(new AbstractC13923f.g(m77321RM().m111726F0()));
        return arrayList;
    }

    /* renamed from: NM */
    static /* synthetic */ List m77317NM(ZCloudHomeView zCloudHomeView, ZaloCloudRecoverCloudMediaWorker.AbstractC16884f abstractC16884f, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            abstractC16884f = ZaloCloudRecoverCloudMediaWorker.AbstractC16884f.c.f85905b;
        }
        return zCloudHomeView.m77316MM(abstractC16884f);
    }

    /* renamed from: OM */
    private final List m77318OM() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new AbstractC13923f.c.b(m77321RM().m111744u0()));
        arrayList.add(new AbstractC13923f.b.C32786b(m77321RM().m111744u0()));
        arrayList.add(AbstractC13923f.e.f71776b);
        String m92652XI = m92652XI(AbstractC8020f0.str_connect_feature_section_header);
        AbstractC19074t.m100207e(m92652XI, "getString(...)");
        arrayList.add(new AbstractC13923f.h(m92652XI));
        EnumC24251b enumC24251b = EnumC24251b.f117148s;
        int i11 = AbstractC8020f0.str_connect_feature_backup;
        arrayList.add(new AbstractC13923f.j(new C21221b(enumC24251b, i11, i11), m77321RM().m111744u0().m41251i().m41266b(), false, false, false, 28, null));
        EnumC24251b enumC24251b2 = EnumC24251b.f117147r;
        int i12 = AbstractC8020f0.str_connect_feature_my_cloud;
        arrayList.add(new AbstractC13923f.j(new C21221b(enumC24251b2, i12, i12), m77321RM().m111744u0().m41251i().m41267c(), false, false, false, 12, null));
        arrayList.add(new AbstractC13923f.g(false, 1, null));
        return arrayList;
    }

    /* renamed from: PM */
    private final LinearLayoutManagerFixed m77319PM() {
        return (LinearLayoutManagerFixed) this.f71651U0.getValue();
    }

    /* renamed from: QM */
    private final AbstractC28981d m77320QM(AbstractC28981d abstractC28981d) {
        if (this.f71650T0) {
            Bundle m92642L3 = m92642L3();
            if (m92642L3 != null) {
                m92642L3.remove("IS_IN_MIGRATE_FLOW");
            }
            this.f71650T0 = false;
            ArrayList arrayList = new ArrayList();
            C24252c c24252c = C24252c.f117152a;
            if (c24252c.m126600f(EnumC24251b.f117147r)) {
                arrayList.add(new AbstractC16864d.h("my_cloud_migration"));
            }
            if (c24252c.m126600f(EnumC24251b.f117148s)) {
                arrayList.add(new AbstractC28997t.d(16));
            }
            if (c24252c.m126600f(EnumC24251b.f117146q)) {
                arrayList.add(new AbstractC16864d.h("cloud_media_migration"));
            }
            return new AbstractC28981d.d(abstractC28981d.m144696c(), (InterfaceC28990m[]) arrayList.toArray(new InterfaceC28990m[0]));
        }
        if (abstractC28981d.m144697d() && !(abstractC28981d instanceof AbstractC28981d.e)) {
            m77322SM().m77489O(EnumC24251b.f117148s, true);
            m77322SM().m77489O(EnumC24251b.f117146q, true);
            return new AbstractC28981d.e(-2, new InterfaceC28990m[0]);
        }
        m77322SM().m77489O(EnumC24251b.f117148s, false);
        m77322SM().m77489O(EnumC24251b.f117146q, false);
        return abstractC28981d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: RM */
    public final C21672k m77321RM() {
        return (C21672k) this.f71647Q0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: SM */
    public final C13922e m77322SM() {
        return (C13922e) this.f71652V0.getValue();
    }

    /* renamed from: TM */
    private final void m77323TM(Object[] objArr) {
        Object obj = objArr[0];
        if (obj != null) {
            int intValue = ((Integer) obj).intValue();
            Object obj2 = objArr[1];
            if (obj2 != null) {
                int intValue2 = ((Integer) obj2).intValue();
                if (intValue2 == 100 || intValue2 == 69 || (intValue == 100 && intValue2 != -1)) {
                    m77345kN(true);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: UM */
    public final void m77324UM(AbstractC28981d abstractC28981d) {
        AbstractC28981d m77320QM = m77320QM(abstractC28981d);
        m77321RM().m111733Q0(m77320QM);
        if (AbstractC19074t.m100204b(m77320QM, AbstractC28981d.f.f134110d) || (m77320QM instanceof AbstractC28981d.e)) {
            if (m77321RM().m111738j0()) {
                AbstractC23306f.m120695n2().m136692D(true);
                return;
            } else {
                m77311HM();
                return;
            }
        }
        this.f71648R0 = (int) (abstractC28981d.m144695b() * 1000);
        m77349mN(abstractC28981d);
        m77321RM().m111739l0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: VM */
    public final void m77325VM(boolean z11) {
        if (z11) {
            Bundle bundle = new Bundle();
            bundle.putSerializable("EXTRA_FLOW", ZCloudConnectSuccessView.EnumC13827b.f71511p);
            m92693xK().m93069k2(ZCloudConnectSuccessView.class, bundle, 1, true);
        } else {
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_zcloud_setup_error);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            Context m92689tK = m92689tK();
            AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
            C23283z7.m120376i(this, m118743r0, C27280g.m139660c(m92689tK, AbstractC2810d.zds_ic_close_circle_solid_24, AbstractC2807a.snackbar_custom_color_red), Integer.valueOf(AbstractC23222t7.f112586t));
        }
    }

    /* renamed from: WM */
    private final void m77326WM() {
        InterfaceC1801w m92657cJ = m92657cJ();
        AbstractC19074t.m100207e(m92657cJ, "getViewLifecycleOwner(...)");
        BuildersKt__Builders_commonKt.m112540d(AbstractC1803x.m9388a(m92657cJ), null, null, new C13900b(null), 3, null);
    }

    /* renamed from: XM */
    private final void m77327XM() {
        m77321RM().m111725E0();
        m77321RM().m111742s0().m9219j(m92657cJ(), new C13908j(new C13901c()));
        m77321RM().m111722A0().m9219j(m92657cJ(), new C13908j(new C13902d()));
        m77321RM().m111723B0().m9219j(m92657cJ(), new C13908j(new C13903e()));
        m77321RM().m111748z0().m9219j(m92657cJ(), new C13908j(new C13904f()));
        m77321RM().m111747y0().m9219j(m92657cJ(), new C13908j(new C13905g()));
        InterfaceC1801w m92657cJ = m92657cJ();
        AbstractC19074t.m100207e(m92657cJ, "getViewLifecycleOwner(...)");
        BuildersKt__Builders_commonKt.m112540d(AbstractC1803x.m9388a(m92657cJ), null, null, new C13906h(null), 3, null);
    }

    /* renamed from: YM */
    private final void m77328YM() {
        String str;
        C30159zf c30159zf = this.f71646P0;
        C30159zf c30159zf2 = null;
        if (c30159zf == null) {
            AbstractC19074t.m100223u("binding");
            c30159zf = null;
        }
        final ZdsActionBar zdsActionBar = c30159zf.f140173s;
        zdsActionBar.setOnClickListenerTrailingButton(new View.OnClickListener() { // from class: bc0.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ZCloudHomeView.m77329ZM(ZdsActionBar.this, view);
            }
        });
        zdsActionBar.setOnClickListenerTrailingButton2(new View.OnClickListener() { // from class: bc0.s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ZCloudHomeView.m77330aN(ZCloudHomeView.this, view);
            }
        });
        Button trailingButton = zdsActionBar.getTrailingButton();
        if (trailingButton != null) {
            trailingButton.setVisibility(8);
        }
        Button trailingButton2 = zdsActionBar.getTrailingButton2();
        if (trailingButton2 != null) {
            trailingButton2.setVisibility(8);
        }
        zdsActionBar.setMiddleTitle(C16805b.Companion.m89811a().m89800f());
        if (this.f71649S0) {
            str = m92652XI(AbstractC8020f0.str_beta_version);
        } else {
            str = "";
        }
        AbstractC19074t.m100205c(str);
        zdsActionBar.setMiddleSubtitle(str);
        m77357qN();
        C30159zf c30159zf3 = this.f71646P0;
        if (c30159zf3 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c30159zf2 = c30159zf3;
        }
        c30159zf2.f140172r.setOnRefreshListener(new SwipeRefreshLayout.InterfaceC1955j() { // from class: bc0.t
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.InterfaceC1955j
            /* renamed from: a */
            public final void mo10764a() {
                ZCloudHomeView.m77331bN(ZCloudHomeView.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ZM */
    public static final void m77329ZM(ZdsActionBar zdsActionBar, View view) {
        AbstractC19074t.m100208f(zdsActionBar, "$this_apply");
        String str = AbstractC23306f.m120583H().m110204g().f110062P;
        if (str.length() <= 0) {
            str = null;
        }
        if (str != null) {
            AbstractC23152n3.m119050j0(zdsActionBar.getContext(), str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: aN */
    public static final void m77330aN(ZCloudHomeView zCloudHomeView, View view) {
        AbstractC19074t.m100208f(zCloudHomeView, "this$0");
        zCloudHomeView.m92693xK().m93069k2(ZCloudSettingsView.class, null, 1, true);
        C26676b.f126324a.m137011y();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bN */
    public static final void m77331bN(ZCloudHomeView zCloudHomeView) {
        AbstractC19074t.m100208f(zCloudHomeView, "this$0");
        C30159zf c30159zf = null;
        if (!C23055e5.m118273h(false, 1, null)) {
            C30159zf c30159zf2 = zCloudHomeView.f71646P0;
            if (c30159zf2 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c30159zf = c30159zf2;
            }
            c30159zf.f140172r.setRefreshing(false);
            return;
        }
        m77341iN(zCloudHomeView, false, false, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: cN */
    public static final void m77332cN(ZCloudHomeView zCloudHomeView) {
        AbstractC19074t.m100208f(zCloudHomeView, "this$0");
        zCloudHomeView.m77361sN();
        zCloudHomeView.f71657a1 = false;
        Bundle m92642L3 = zCloudHomeView.m92642L3();
        if (m92642L3 != null) {
            m92642L3.putBoolean("SHOW_BTS_DRIVE", false);
        }
    }

    /* renamed from: dN */
    private final void m77333dN(boolean z11, boolean z12) {
        Bundle bundle = new Bundle();
        if (z11) {
            bundle.putInt("EXTRA_OPT_IN_WITH_NEXT_ACTION", 1);
        }
        if (z12) {
            bundle.putInt("EXTRA_OPT_IN_WITH_NEXT_ACTION", 2);
        }
        C22438j.m115953v(m92662fJ(), bundle);
    }

    /* renamed from: eN */
    static /* synthetic */ void m77334eN(ZCloudHomeView zCloudHomeView, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        if ((i11 & 2) != 0) {
            z12 = false;
        }
        zCloudHomeView.m77333dN(z11, z12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: fN */
    public final void m77335fN() {
        if (AbstractC3489d.m17506n()) {
            C0732w.m1177r(C0732w.Companion.m1189a(), "zcloud_home_grace_manage_media", null, null, null, 14, null);
        }
        m92693xK().m93066i2(CloudMediaHomeView.class, null, 101, 1, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: gN */
    public final void m77337gN() {
        try {
            C17487o0 m92662fJ = m92662fJ();
            if (m92662fJ != null) {
                m92662fJ.m93069k2(MyCloudManagementView.class, new Bundle(), 1, true);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: hN */
    private final void m77339hN(boolean z11, boolean z12) {
        m77321RM().m111732P0(z12);
        m77321RM().m111739l0();
        C21672k.m111691L0(m77321RM(), z11, false, 2, null);
    }

    /* renamed from: iN */
    static /* synthetic */ void m77341iN(ZCloudHomeView zCloudHomeView, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z12 = true;
        }
        zCloudHomeView.m77339hN(z11, z12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: jN */
    public final void m77343jN(ZaloCloudRecoverCloudMediaWorker.AbstractC16884f abstractC16884f) {
        m77353oN(true);
        if (!(abstractC16884f instanceof ZaloCloudRecoverCloudMediaWorker.AbstractC16884f.d)) {
            m77322SM().m77488N(m77316MM(abstractC16884f));
            if (AbstractC19074t.m100204b(m77321RM().m111744u0(), ZCloudQuotaUsage.Companion.m41262b())) {
                m77339hN(false, true);
                return;
            }
            return;
        }
        m77311HM();
        if (m77321RM().m111726F0() && AbstractC0924m0.m3954k8() == EnumC30980a.f142925q.m150597c()) {
            m77369wN(((ZaloCloudRecoverCloudMediaWorker.AbstractC16884f.d) abstractC16884f).m90211b());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: kN */
    public final void m77345kN(boolean z11) {
        List m77315LM;
        m77353oN(true);
        if (AbstractC3489d.m17506n()) {
            if (AbstractC23306f.m120627V1().m90244o() && (ZaloCloudRecoverCloudMediaWorker.Companion.m90201h().getValue() instanceof ZaloCloudRecoverCloudMediaWorker.AbstractC16884f.c)) {
                m77315LM = m77317NM(this, null, 1, null);
            } else {
                m77315LM = m77318OM();
            }
        } else if (AbstractC3489d.m17512t()) {
            m77315LM = m77318OM();
        } else {
            m77315LM = m77315LM();
        }
        m77322SM().m77488N(m77315LM);
        m77339hN(true, z11);
    }

    /* renamed from: lN */
    static /* synthetic */ void m77347lN(ZCloudHomeView zCloudHomeView, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        zCloudHomeView.m77345kN(z11);
    }

    /* renamed from: mN */
    private final void m77349mN(AbstractC28981d abstractC28981d) {
        EnumC2746k enumC2746k;
        EnumC2746k enumC2746k2;
        EnumC2746k enumC2746k3;
        m77353oN(false);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new AbstractC13923f.m(abstractC28981d));
        InterfaceC28990m m144694a = abstractC28981d.m144694a(2);
        if (m144694a != null) {
            if (m144694a.mo90083d()) {
                enumC2746k3 = EnumC2746k.f10891s;
            } else {
                enumC2746k3 = EnumC2746k.f10892t;
            }
            arrayList.add(new AbstractC13923f.n(EnumC24251b.f117147r, m144694a.mo90080a() * 100.0f, enumC2746k3));
        }
        InterfaceC28990m m144694a2 = abstractC28981d.m144694a(1);
        if (m144694a2 != null) {
            if ((abstractC28981d instanceof AbstractC28981d.a) && ((AbstractC28981d.a) abstractC28981d).m144699f() == EnumC28993p.f134269s) {
                enumC2746k2 = EnumC2746k.f10890r;
            } else if (!m144694a2.mo90081b() && !m144694a2.mo90083d()) {
                enumC2746k2 = EnumC2746k.f10892t;
            } else {
                enumC2746k2 = EnumC2746k.f10891s;
            }
            arrayList.add(new AbstractC13923f.n(EnumC24251b.f117148s, m144694a2.mo90080a() * 100.0f, enumC2746k2));
        }
        InterfaceC28990m m144694a3 = abstractC28981d.m144694a(3);
        if (m144694a3 != null) {
            if (m144694a3.mo90084e() == EnumC28993p.f134268r) {
                enumC2746k = EnumC2746k.f10889q;
            } else if (!m144694a3.mo90081b() && !m144694a3.mo90083d()) {
                enumC2746k = EnumC2746k.f10892t;
            } else {
                enumC2746k = EnumC2746k.f10891s;
            }
            arrayList.add(new AbstractC13923f.n(EnumC24251b.f117146q, m144694a3.mo90080a() * 100.0f, enumC2746k));
        }
        arrayList.add(new AbstractC13923f.g(false, 1, null));
        m77322SM().m77488N(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nN */
    public final void m77351nN(AbstractC23291c abstractC23291c) {
        if (AbstractC19074t.m100204b(abstractC23291c, AbstractC23291c.b.f113053b)) {
            m77347lN(this, false, 1, null);
            return;
        }
        if (AbstractC19074t.m100204b(abstractC23291c, AbstractC23291c.d.f113055b)) {
            this.f71653W0 = true;
            if (!ChangeProtectCodeRecognitionSheetView.Companion.m77101f() && !C25727d.Companion.m132785h()) {
                return;
            }
            m77347lN(this, false, 1, null);
            InterfaceC27218a m92692wK = m92692wK();
            String m92652XI = m92652XI(AbstractC8020f0.str_zcloud_change_pass_success);
            AbstractC19074t.m100207e(m92652XI, "getString(...)");
            Context m92689tK = m92689tK();
            AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
            C23283z7.m120379l(m92692wK, m92652XI, C27280g.m139660c(m92689tK, AbstractC2810d.zds_ic_check_circle_solid_24, AbstractC2807a.snackbar_custom_color_green), Integer.valueOf(AbstractC23222t7.f112576o));
            this.f71653W0 = false;
            return;
        }
        m77353oN(false);
        ArrayList arrayList = new ArrayList();
        boolean z11 = abstractC23291c instanceof AbstractC23291c.a;
        if (!z11) {
            arrayList.add(AbstractC13923f.a.C32785a.f71769b);
        }
        arrayList.add(new AbstractC13923f.c.a(abstractC23291c));
        arrayList.add(new AbstractC13923f.b.a(abstractC23291c));
        if (z11 && AbstractC19074t.m100204b(((AbstractC23291c.a) abstractC23291c).m120405b(), "unknown")) {
            arrayList.add(AbstractC13923f.i.a.f71780b);
        }
        arrayList.add(AbstractC13923f.e.f71776b);
        arrayList.add(new AbstractC13923f.g(false, 1, null));
        m77322SM().m77488N(arrayList);
        m77321RM().m111734R0(false);
    }

    /* renamed from: oN */
    private final void m77353oN(boolean z11) {
        int i11;
        C30159zf c30159zf = this.f71646P0;
        C30159zf c30159zf2 = null;
        if (c30159zf == null) {
            AbstractC19074t.m100223u("binding");
            c30159zf = null;
        }
        c30159zf.f140172r.setEnabled(z11);
        m77319PM().m76390N2(z11);
        String str = AbstractC23306f.m120583H().m110204g().f110062P;
        C30159zf c30159zf3 = this.f71646P0;
        if (c30159zf3 == null) {
            AbstractC19074t.m100223u("binding");
            c30159zf3 = null;
        }
        Button trailingButton = c30159zf3.f140173s.getTrailingButton();
        int i12 = 8;
        if (trailingButton != null) {
            if (str.length() > 0) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            trailingButton.setVisibility(i11);
        }
        boolean z12 = true;
        if (!AbstractC3489d.m17512t() ? !AbstractC3489d.m17513u() : C26263i.m135058w() == null || !AbstractC3489d.m17508p()) {
            z12 = false;
        }
        C30159zf c30159zf4 = this.f71646P0;
        if (c30159zf4 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c30159zf2 = c30159zf4;
        }
        Button trailingButton2 = c30159zf2.f140173s.getTrailingButton2();
        if (trailingButton2 != null) {
            if (z11 && z12) {
                i12 = 0;
            }
            trailingButton2.setVisibility(i12);
        }
    }

    /* renamed from: pN */
    private final void m77355pN(RecyclerView recyclerView) {
        recyclerView.m9816A(new C13909k());
    }

    /* renamed from: qN */
    private final void m77357qN() {
        C30159zf c30159zf = this.f71646P0;
        if (c30159zf == null) {
            AbstractC19074t.m100223u("binding");
            c30159zf = null;
        }
        RecyclerView recyclerView = c30159zf.f140171q;
        recyclerView.setLayoutManager(m77319PM());
        recyclerView.setAdapter(m77322SM());
        AbstractC19074t.m100205c(recyclerView);
        m77355pN(recyclerView);
        recyclerView.m9826E(new C13910l());
        RecyclerView.AbstractC1885l itemAnimator = recyclerView.getItemAnimator();
        if (itemAnimator != null) {
            AbstractC19074t.m100206d(itemAnimator, "null cannot be cast to non-null type androidx.recyclerview.widget.SimpleItemAnimator");
            AbstractC1933z abstractC1933z = (AbstractC1933z) itemAnimator;
            abstractC1933z.m10694V(false);
            abstractC1933z.m10058x(0L);
        }
    }

    /* renamed from: rN */
    private final void m77359rN() {
        String m4186s0;
        if (TextUtils.isEmpty(AbstractC0924m0.m4186s0())) {
            m4186s0 = AbstractC23160o0.m119264k0();
            AbstractC0924m0.m3811ff(m4186s0);
            AbstractC19074t.m100205c(m4186s0);
        } else {
            m4186s0 = AbstractC0924m0.m4186s0();
            AbstractC19074t.m100205c(m4186s0);
        }
        C0697c0.Companion.m1052f(this, "first_time", m4186s0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sN */
    public final void m77361sN() {
        TargetBackupInfo m135059x = C26263i.m135059x(C26263i.m135055u().m135087t());
        if (m135059x != null) {
            AbstractC23211s7.m119566F(m92692wK(), m135059x, -1);
            C24848g0 c24848g0 = C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: tN */
    public final void m77363tN(final EnumC24251b enumC24251b) {
        Context m92689tK = m92689tK();
        AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
        C16972e0.a m90932i = new C16972e0.a(m92689tK).m90932i(C16972e0.b.DIALOG_INFORMATION);
        String m118746s0 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_zcloud_connect_to_zcloud, C16805b.Companion.m89811a().m89800f());
        AbstractC19074t.m100207e(m118746s0, "getString(...)");
        this.f71654X0 = m90932i.m90918B(m118746s0).m90943t("Kết nối", new InterfaceC17463d.d() { // from class: bc0.p
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                ZCloudHomeView.m77365uN(ZCloudHomeView.this, enumC24251b, interfaceC17463d, i11);
            }
        }).m90933j(AbstractC8020f0.str_cancel, new InterfaceC17463d.d() { // from class: bc0.q
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                ZCloudHomeView.m77367vN(interfaceC17463d, i11);
            }
        }).m90923G();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: uN */
    public static final void m77365uN(ZCloudHomeView zCloudHomeView, EnumC24251b enumC24251b, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(zCloudHomeView, "this$0");
        AbstractC19074t.m100208f(enumC24251b, "$feature");
        try {
            zCloudHomeView.m77321RM().m111729M0(enumC24251b);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("CommonZaloview", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: vN */
    public static final void m77367vN(InterfaceC17463d interfaceC17463d, int i11) {
        interfaceC17463d.dismiss();
    }

    /* renamed from: wN */
    private final void m77369wN(final int i11) {
        String m92652XI;
        String m92652XI2;
        String m92652XI3;
        RecyclingImageView recyclingImageView = new RecyclingImageView(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(14);
        recyclingImageView.setLayoutParams(layoutParams);
        recyclingImageView.setImageDrawable(C23212s8.m119609q(recyclingImageView.getContext(), AbstractC16781w.illus_download_grace_success));
        recyclingImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams.setMargins(0, AbstractC23136l9.m118745s(relativeLayout.getContext(), 42.0f), 0, AbstractC23136l9.m118745s(relativeLayout.getContext(), 24.0f));
        relativeLayout.setLayoutParams(marginLayoutParams);
        relativeLayout.addView(recyclingImageView);
        Context m92689tK = m92689tK();
        AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
        C16972e0.a m90922F = new C16972e0.a(m92689tK).m90932i(C16972e0.b.DIALOG_INFORMATION).m90920D(relativeLayout).m90922F(true);
        if (i11 != 4) {
            if (i11 != 5) {
                m92652XI = m92652XI(AbstractC8020f0.str_media_messages_downloaded_successfully);
            } else {
                m92652XI = m92652XI(AbstractC8020f0.str_all_media_available);
            }
        } else {
            m92652XI = m92652XI(AbstractC8020f0.str_msg_download_has_ended);
        }
        AbstractC19074t.m100205c(m92652XI);
        C16972e0.a m90918B = m90922F.m90918B(m92652XI);
        if (i11 != 4) {
            if (i11 != 5) {
                m92652XI2 = m92652XI(AbstractC8020f0.f43852x35a32c56);
            } else {
                m92652XI2 = m92652XI(AbstractC8020f0.str_from_now_on_new_media_messages_will_also_be_stored);
            }
        } else {
            m92652XI2 = m92652XI(AbstractC8020f0.str_msg_download_has_ended_description);
        }
        AbstractC19074t.m100205c(m92652XI2);
        C16972e0.a m90947x = m90918B.m90949z(m92652XI2).m90947x("zcloud_grace_home_done_check_media");
        if (i11 == 5) {
            m92652XI3 = m92652XI(AbstractC8020f0.str_view_stored_media);
        } else {
            m92652XI3 = m92652XI(AbstractC8020f0.str_view_downloaded_media);
        }
        AbstractC19074t.m100205c(m92652XI3);
        C16972e0.a m90937n = m90947x.m90943t(m92652XI3, new InterfaceC17463d.d() { // from class: bc0.y
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                ZCloudHomeView.m77371xN(ZCloudHomeView.this, i11, interfaceC17463d, i12);
            }
        }).m90937n("zcloud_grace_home_done_close");
        String m92652XI4 = m92652XI(AbstractC8020f0.str_close);
        AbstractC19074t.m100207e(m92652XI4, "getString(...)");
        m90937n.m90934k(m92652XI4, new InterfaceC17463d.d() { // from class: bc0.z
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                ZCloudHomeView.m77373yN(interfaceC17463d, i12);
            }
        }).m90923G();
        AbstractC0924m0.m4330wr(EnumC30980a.f142928t.m150597c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: xN */
    public static final void m77371xN(ZCloudHomeView zCloudHomeView, int i11, InterfaceC17463d interfaceC17463d, int i12) {
        AbstractC19074t.m100208f(zCloudHomeView, "this$0");
        Bundle bundle = new Bundle();
        bundle.putInt("zcloud_gp_success_mode", i11);
        C17487o0 m92662fJ = zCloudHomeView.m92662fJ();
        if (m92662fJ != null) {
            m92662fJ.m93069k2(ToolStorageView.class, bundle, 1, true);
        }
        interfaceC17463d.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: yN */
    public static final void m77373yN(InterfaceC17463d interfaceC17463d, int i11) {
        C0732w.m1177r(C0732w.Companion.m1189a(), "zcloud_grace_home_done_check_media", null, null, null, 14, null);
        interfaceC17463d.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zN */
    public final void m77375zN() {
        C29896ke m148176a = C29896ke.m148176a(LayoutInflater.from(getContext()).inflate(AbstractC7409c0.warning_popup_top_view, (ViewGroup) null));
        AbstractC19074t.m100207e(m148176a, "bind(...)");
        AppCompatImageView appCompatImageView = m148176a.f138506q;
        Context m92689tK = m92689tK();
        AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
        appCompatImageView.setImageDrawable(C27280g.m139660c(m92689tK, AbstractC2810d.zds_ic_backup_warning_solid_24, AbstractC2807a.warning_icon));
        Context m92689tK2 = m92689tK();
        AbstractC19074t.m100207e(m92689tK2, "requireContext(...)");
        C16972e0.a m90932i = new C16972e0.a(m92689tK2).m90932i(C16972e0.b.DIALOG_INFORMATION);
        int i11 = AbstractC8020f0.str_zcloud_migration_full_quota_error;
        C16805b.b bVar = C16805b.Companion;
        String m118746s0 = AbstractC23136l9.m118746s0(i11, bVar.m89811a().m89800f());
        AbstractC19074t.m100207e(m118746s0, "getString(...)");
        C16972e0.a m90918B = m90932i.m90918B(m118746s0);
        String m118746s02 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_zcloud_migration_full_quota_error_detail, bVar.m89811a().m89800f());
        AbstractC19074t.m100207e(m118746s02, "getString(...)");
        C16972e0.a m90949z = m90918B.m90949z(m118746s02);
        Context m92689tK3 = m92689tK();
        AbstractC19074t.m100207e(m92689tK3, "requireContext(...)");
        C16972e0.a m90935l = m90949z.m90919C(C27280g.m139660c(m92689tK3, AbstractC2810d.zds_ic_backup_warning_solid_24, AbstractC2807a.warning_icon)).m90920D(m148176a.getRoot()).m90928e(true).m90922F(true).m90935l(AbstractC2814h.ButtonMedium_Tertiary);
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_title_zcloud_got_it);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        m90935l.m90934k(m118743r0, new InterfaceC17463d.d() { // from class: bc0.v
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                ZCloudHomeView.m77303AN(interfaceC17463d, i12);
            }
        }).m90923G().m92855F(new InterfaceC17463d.e() { // from class: bc0.w
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.e
            /* renamed from: Tv */
            public final void mo12457Tv(InterfaceC17463d interfaceC17463d) {
                ZCloudHomeView.m77305BN(interfaceC17463d);
            }
        });
        C0697c0.Companion.m1048b().m1044v("ZCloudMigrationOutQuota", true);
        AbstractC0924m0.m3179Jq(true);
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        boolean z11;
        super.mo37111CJ(bundle);
        Bundle m92642L3 = m92642L3();
        boolean z12 = false;
        if (m92642L3 != null) {
            z11 = m92642L3.getBoolean("SHOW_BTS_DRIVE");
        } else {
            z11 = false;
        }
        this.f71657a1 = z11;
        Bundle m92642L32 = m92642L3();
        if (m92642L32 != null) {
            z12 = m92642L32.getBoolean("IS_IN_MIGRATE_FLOW", false);
        }
        this.f71650T0 = z12;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(AbstractC7409c0.zcloud_home_view, viewGroup, false);
        C30159zf m148792a = C30159zf.m148792a(inflate);
        AbstractC19074t.m100207e(m148792a, "bind(...)");
        this.f71646P0 = m148792a;
        m77328YM();
        m77327XM();
        m77359rN();
        return inflate;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: JJ */
    public void mo37484JJ() {
        super.mo37484JJ();
        C16972e0 c16972e0 = this.f71654X0;
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
        bVar.m124119a().m124117e(this, 150801);
        bVar.m124119a().m124117e(this, 150809);
        bVar.m124119a().m124117e(this, 150803);
        ChangeProtectCodeRecognitionSheetView.C13825a c13825a = ChangeProtectCodeRecognitionSheetView.Companion;
        c13825a.m77097b();
        C17487o0 m92693xK = m92693xK();
        AbstractC19074t.m100207e(m92693xK, "requireZaloViewManager(...)");
        c13825a.m77098c(m92693xK);
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: PJ */
    public void mo39032PJ() {
        super.mo39032PJ();
        m77312IM();
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        if (AbstractC3489d.m17506n()) {
            return "ZCloudHomeGraceStatus";
        }
        return "ZCloudHome";
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        if (i11 == 100 && i12 == -1) {
            try {
                AbstractC23306f.m120695n2().m136692D(true);
                C21672k.m111702U0(m77321RM(), false, 1, null);
            } catch (Exception e11) {
                C26676b.m136954d("SMLZCloudHome", e11);
            }
        }
        if (i11 == 101 && i12 == -1 && intent != null && intent.getLongExtra("KEY_USED_USAGE", -1L) != m77321RM().m111745v0()) {
            AbstractC23306f.m120695n2().m136692D(true);
            C21672k.m111702U0(m77321RM(), false, 1, null);
        }
        super.onActivityResult(i11, i12, intent);
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        if (this.f71657a1) {
            C30159zf c30159zf = this.f71646P0;
            if (c30159zf == null) {
                AbstractC19074t.m100223u("binding");
                c30159zf = null;
            }
            c30159zf.getRoot().postDelayed(new Runnable() { // from class: bc0.x
                @Override // java.lang.Runnable
                public final void run() {
                    ZCloudHomeView.m77332cN(ZCloudHomeView.this);
                }
            }, 500L);
        }
        C21672k.m111702U0(m77321RM(), false, 1, null);
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, final Object... objArr) {
        AbstractC19074t.m100208f(objArr, "args");
        switch (i11) {
            case 150801:
                if (m92672lJ()) {
                    C21672k.m111702U0(m77321RM(), false, 1, null);
                    return;
                }
                return;
            case 150803:
                AbstractC19444a.m101695c(new Runnable() { // from class: bc0.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        ZCloudHomeView.m77314KM(ZCloudHomeView.this, objArr);
                    }
                });
                return;
            case 150804:
                C21672k m77321RM = m77321RM();
                Object obj = objArr[0];
                AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type com.zing.zalo.data.zalocloud.model.ZCloudQuotaUsage");
                m77321RM.m111736V0((ZCloudQuotaUsage) obj);
                return;
            case 150809:
                m77341iN(this, false, false, 2, null);
                return;
            default:
                return;
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: zJ */
    public void mo40210zJ(ZaloActivity zaloActivity) {
        super.mo40210zJ(zaloActivity);
        C23744a.b bVar = C23744a.Companion;
        bVar.m124119a().m124115b(this, 150804);
        bVar.m124119a().m124115b(this, 150801);
        bVar.m124119a().m124115b(this, 150809);
        bVar.m124119a().m124115b(this, 150803);
    }
}
