package com.zing.zalo.p077ui.zalocloud.home;

import ac.C0697c0;
import am.AbstractC0924m0;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
import bc0.InterfaceC2726a;
import bi0.AbstractC2807a;
import bi0.AbstractC2810d;
import bi0.AbstractC2814h;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.data.backuprestore.model.TargetBackupInfo;
import com.zing.zalo.data.zalocloud.model.ZCloudQuotaUsage;
import com.zing.zalo.p077ui.toolstorage.ThreadStorageInfo;
import com.zing.zalo.p077ui.toolstorage.detail.ToolStorageDetailPage;
import com.zing.zalo.p077ui.toolstorage.detail.ToolStorageDetailView;
import com.zing.zalo.p077ui.widget.layoutmanager.LinearLayoutManagerFixed;
import com.zing.zalo.p077ui.zalocloud.connect.ZCloudConnectSuccessView;
import com.zing.zalo.p077ui.zalocloud.home.AbstractC13919b;
import com.zing.zalo.p077ui.zalocloud.home.CloudMediaHomeView;
import com.zing.zalo.p077ui.zviews.SlidableZaloView;
import com.zing.zalo.zalocloud.configs.C16805b;
import com.zing.zalo.zalocloud.migration.AbstractC16864d;
import com.zing.zalo.zdesign.component.C16972e0;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import com.zing.zalo.zview.AbstractC17501r0;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19061k0;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.InterfaceC19066n;
import java.util.ArrayList;
import java.util.List;
import kc0.C21672k;
import kc0.C21677p;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import me0.AbstractC23136l9;
import me0.AbstractC23211s7;
import me0.AbstractC23222t7;
import me0.C23055e5;
import nl.C23870a;
import p348mi.AbstractC23306f;
import p363nh.C23744a;
import p649xl.C29740c2;
import p649xl.C29896ke;
import pm0.AbstractC24856m;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.InterfaceC24847g;
import pm0.InterfaceC24854k;
import si.C26263i;
import tg0.C26676b;
import ui0.C27280g;
import vm0.AbstractC28298d;
import wg0.AbstractC28981d;
import wg0.C28989l;
import wg0.EnumC28993p;
import wg0.InterfaceC28990m;
import wm0.AbstractC29096d;
import wm0.AbstractC29104l;

/* loaded from: classes6.dex */
public final class CloudMediaHomeView extends SlidableZaloView {
    public static final C13866a Companion = new C13866a(null);

    /* renamed from: P0 */
    private C29740c2 f71588P0;

    /* renamed from: Q0 */
    private boolean f71589Q0;

    /* renamed from: R0 */
    private final InterfaceC24854k f71590R0;

    /* renamed from: S0 */
    private final InterfaceC24854k f71591S0;

    /* renamed from: T0 */
    private final InterfaceC24854k f71592T0;

    /* renamed from: U0 */
    private final InterfaceC24854k f71593U0;

    /* renamed from: com.zing.zalo.ui.zalocloud.home.CloudMediaHomeView$a */
    /* loaded from: classes6.dex */
    public static final class C13866a {
        private C13866a() {
        }

        public /* synthetic */ C13866a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.home.CloudMediaHomeView$b */
    /* loaded from: classes6.dex */
    static final class C13867b extends AbstractC19075u implements InterfaceC18494a {
        C13867b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C13918a mo12V4() {
            return new C13918a(CloudMediaHomeView.this.m77231vM());
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.home.CloudMediaHomeView$c */
    /* loaded from: classes6.dex */
    static final class C13868c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: com.zing.zalo.ui.zalocloud.home.CloudMediaHomeView$c$a */
        /* loaded from: classes6.dex */
        public static final class a implements InterfaceC2726a {

            /* renamed from: a */
            final /* synthetic */ CloudMediaHomeView f71596a;

            a(CloudMediaHomeView cloudMediaHomeView) {
                this.f71596a = cloudMediaHomeView;
            }

            /* renamed from: h */
            public static final void m77239h(CloudMediaHomeView cloudMediaHomeView) {
                AbstractC19074t.m100208f(cloudMediaHomeView, "this$0");
                cloudMediaHomeView.m77230uM().m77429O();
            }

            @Override // bc0.InterfaceC2726a
            /* renamed from: a */
            public void mo13295a() {
                C29740c2 c29740c2 = this.f71596a.f71588P0;
                if (c29740c2 == null) {
                    AbstractC19074t.m100223u("binding");
                    c29740c2 = null;
                }
                c29740c2.f137385q.post(new Runnable() { // from class: bc0.e
                    public /* synthetic */ RunnableC2734e() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        CloudMediaHomeView.C13868c.a.m77239h(CloudMediaHomeView.this);
                    }
                });
            }

            @Override // bc0.InterfaceC2726a
            /* renamed from: b */
            public void mo13296b() {
                C28989l.m144729K(C28989l.Companion.m144769a(), 3, false, false, 6, null);
            }

            @Override // bc0.InterfaceC2726a
            /* renamed from: c */
            public int mo13297c() {
                C29740c2 c29740c2 = this.f71596a.f71588P0;
                if (c29740c2 == null) {
                    AbstractC19074t.m100223u("binding");
                    c29740c2 = null;
                }
                return c29740c2.f137385q.getBottom();
            }

            @Override // bc0.InterfaceC2726a
            /* renamed from: d */
            public void mo13298d() {
                CloudMediaHomeView cloudMediaHomeView = this.f71596a;
                C17487o0 m92693xK = cloudMediaHomeView.m92693xK();
                AbstractC19074t.m100207e(m92693xK, "requireZaloViewManager(...)");
                cloudMediaHomeView.m77203BM(m92693xK, new ThreadStorageInfo("", null, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 262142, null));
                C26676b.f126324a.m137001o();
            }

            @Override // bc0.InterfaceC2726a
            /* renamed from: e */
            public void mo13299e() {
                this.f71596a.m77212KM();
            }

            @Override // bc0.InterfaceC2726a
            /* renamed from: f */
            public void mo13300f() {
                this.f71596a.m77204CM();
                C26676b.f126324a.m137002p();
            }
        }

        C13868c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final a mo12V4() {
            return new a(CloudMediaHomeView.this);
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.home.CloudMediaHomeView$d */
    /* loaded from: classes6.dex */
    public static final class C13869d extends AbstractC19075u implements InterfaceC18505l {
        C13869d() {
            super(1);
        }

        /* renamed from: a */
        public final void m77240a(ZCloudQuotaUsage zCloudQuotaUsage) {
            C26676b.m136957g("Cloudmedia_Home", "Event: " + zCloudQuotaUsage, null, 4, null);
            C13918a m77230uM = CloudMediaHomeView.this.m77230uM();
            AbstractC19074t.m100205c(zCloudQuotaUsage);
            m77230uM.m77431Q(zCloudQuotaUsage);
            CloudMediaHomeView cloudMediaHomeView = CloudMediaHomeView.this;
            Intent intent = new Intent();
            intent.putExtra("KEY_USED_USAGE", zCloudQuotaUsage.m41253k());
            C24848g0 c24848g0 = C24848g0.f119245a;
            cloudMediaHomeView.mo50035CK(-1, intent);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m77240a((ZCloudQuotaUsage) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.home.CloudMediaHomeView$e */
    /* loaded from: classes6.dex */
    public static final class C13870e extends AbstractC19075u implements InterfaceC18505l {
        C13870e() {
            super(1);
        }

        /* renamed from: a */
        public final void m77241a(List list) {
            C13918a m77230uM = CloudMediaHomeView.this.m77230uM();
            AbstractC19074t.m100205c(list);
            m77230uM.m77430P(list);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m77241a((List) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.home.CloudMediaHomeView$f */
    /* loaded from: classes6.dex */
    public static final class C13871f extends AbstractC19075u implements InterfaceC18505l {
        C13871f() {
            super(1);
        }

        /* renamed from: a */
        public final void m77242a(Boolean bool) {
            C29740c2 c29740c2 = CloudMediaHomeView.this.f71588P0;
            if (c29740c2 == null) {
                AbstractC19074t.m100223u("binding");
                c29740c2 = null;
            }
            SwipeRefreshLayout swipeRefreshLayout = c29740c2.f137386r;
            AbstractC19074t.m100205c(bool);
            swipeRefreshLayout.setRefreshing(bool.booleanValue());
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m77242a((Boolean) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.home.CloudMediaHomeView$g */
    /* loaded from: classes6.dex */
    public static final class C13872g extends AbstractC19075u implements InterfaceC18505l {
        C13872g() {
            super(1);
        }

        /* renamed from: a */
        public final void m77243a(Integer num) {
            if (num == null || num.intValue() != 3) {
                return;
            }
            if (AbstractC0924m0.m3455Tc() && !AbstractC0924m0.m3484Uc()) {
                CloudMediaHomeView.this.m77213LM();
                CloudMediaHomeView.m77209HM(CloudMediaHomeView.this, false, 1, null);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putSerializable("EXTRA_FLOW", ZCloudConnectSuccessView.EnumC13827b.f71511p);
            bundle.putInt("SHOW_WITH_FLAGS", 33554432);
            CloudMediaHomeView.this.m92693xK().m93066i2(ZCloudConnectSuccessView.class, bundle, 0, 1, true);
            CloudMediaHomeView.this.m77233xM().m111730N0();
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m77243a((Integer) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.home.CloudMediaHomeView$h */
    /* loaded from: classes6.dex */
    public static final class C13873h extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f71601t;

        /* renamed from: com.zing.zalo.ui.zalocloud.home.CloudMediaHomeView$h$a */
        /* loaded from: classes6.dex */
        public static final class a extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f71603t;

            /* renamed from: u */
            final /* synthetic */ CloudMediaHomeView f71604u;

            /* renamed from: com.zing.zalo.ui.zalocloud.home.CloudMediaHomeView$h$a$a */
            /* loaded from: classes6.dex */
            public static final class C32781a implements FlowCollector {

                /* renamed from: p */
                final /* synthetic */ CloudMediaHomeView f71605p;

                /* renamed from: com.zing.zalo.ui.zalocloud.home.CloudMediaHomeView$h$a$a$a */
                /* loaded from: classes6.dex */
                public static final class C32782a extends AbstractC29096d {

                    /* renamed from: s */
                    Object f71606s;

                    /* renamed from: t */
                    boolean f71607t;

                    /* renamed from: u */
                    /* synthetic */ Object f71608u;

                    /* renamed from: w */
                    int f71610w;

                    C32782a(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // wm0.AbstractC29093a
                    /* renamed from: o */
                    public final Object mo239o(Object obj) {
                        this.f71608u = obj;
                        this.f71610w |= Integer.MIN_VALUE;
                        return C32781a.this.mo12109b(null, this);
                    }
                }

                C32781a(CloudMediaHomeView cloudMediaHomeView) {
                    this.f71605p = cloudMediaHomeView;
                }

                /* JADX WARN: Removed duplicated region for block: B:12:0x00d7  */
                /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* renamed from: a */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object mo12109b(AbstractC28981d abstractC28981d, Continuation continuation) {
                    C32782a c32782a;
                    Object m142578e;
                    int i11;
                    AbstractC28981d abstractC28981d2;
                    boolean m111738j0;
                    C32781a c32781a;
                    if (continuation instanceof C32782a) {
                        c32782a = (C32782a) continuation;
                        int i12 = c32782a.f71610w;
                        if ((i12 & Integer.MIN_VALUE) != 0) {
                            c32782a.f71610w = i12 - Integer.MIN_VALUE;
                            Object obj = c32782a.f71608u;
                            m142578e = AbstractC28298d.m142578e();
                            i11 = c32782a.f71610w;
                            if (i11 == 0) {
                                if (i11 == 1) {
                                    m111738j0 = c32782a.f71607t;
                                    c32781a = (C32781a) c32782a.f71606s;
                                    AbstractC24862s.m129228b(obj);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                AbstractC24862s.m129228b(obj);
                                C26676b.m136957g("Cloudmedia_Home", "Onboarding State: " + abstractC28981d, null, 4, null);
                                if (this.f71605p.f71589Q0) {
                                    Bundle m92642L3 = this.f71605p.m92642L3();
                                    if (m92642L3 != null) {
                                        m92642L3.remove("IS_IN_MIGRATE_FLOW");
                                    }
                                    this.f71605p.f71589Q0 = false;
                                    abstractC28981d2 = new AbstractC28981d.d(3, new AbstractC16864d.h[]{new AbstractC16864d.h("cloud_media_migration")});
                                } else {
                                    abstractC28981d2 = abstractC28981d;
                                }
                                this.f71605p.m77233xM().m111733Q0(abstractC28981d2);
                                if (!(abstractC28981d instanceof AbstractC28981d.e) && !AbstractC19074t.m100204b(abstractC28981d, AbstractC28981d.f.f134110d)) {
                                    this.f71605p.m77207FM(abstractC28981d);
                                    return C24848g0.f119245a;
                                }
                                if (!this.f71605p.m77233xM().m111726F0() && this.f71605p.m77230uM().mo10003k() > 0) {
                                    return C24848g0.f119245a;
                                }
                                m111738j0 = this.f71605p.m77233xM().m111738j0();
                                if (m111738j0) {
                                    c32782a.f71606s = this;
                                    c32782a.f71607t = m111738j0;
                                    c32782a.f71610w = 1;
                                    if (DelayKt.m112666b(500L, c32782a) == m142578e) {
                                        return m142578e;
                                    }
                                }
                                c32781a = this;
                            }
                            CloudMediaHomeView.m77209HM(c32781a.f71605p, false, 1, null);
                            if (m111738j0) {
                                AbstractC23306f.m120695n2().m136692D(true);
                                c32781a.f71605p.m77233xM().m111735T0(true);
                            }
                            return C24848g0.f119245a;
                        }
                    }
                    c32782a = new C32782a(continuation);
                    Object obj2 = c32782a.f71608u;
                    m142578e = AbstractC28298d.m142578e();
                    i11 = c32782a.f71610w;
                    if (i11 == 0) {
                    }
                    CloudMediaHomeView.m77209HM(c32781a.f71605p, false, 1, null);
                    if (m111738j0) {
                    }
                    return C24848g0.f119245a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(CloudMediaHomeView cloudMediaHomeView, Continuation continuation) {
                super(2, continuation);
                this.f71604u = cloudMediaHomeView;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new a(this.f71604u, continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                Object m142578e;
                m142578e = AbstractC28298d.m142578e();
                int i11 = this.f71603t;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC24862s.m129228b(obj);
                } else {
                    AbstractC24862s.m129228b(obj);
                    StateFlow m144765r = C28989l.Companion.m144769a().m144765r();
                    C32781a c32781a = new C32781a(this.f71604u);
                    this.f71603t = 1;
                    if (m144765r.mo97893a(c32781a, this) == m142578e) {
                        return m142578e;
                    }
                }
                throw new KotlinNothingValueException();
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        C13873h(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new C13873h(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f71601t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                InterfaceC1801w m92657cJ = CloudMediaHomeView.this.m92657cJ();
                AbstractC19074t.m100207e(m92657cJ, "getViewLifecycleOwner(...)");
                AbstractC1785o.b bVar = AbstractC1785o.b.STARTED;
                a aVar = new a(CloudMediaHomeView.this, null);
                this.f71601t = 1;
                if (RepeatOnLifecycleKt.m9234b(m92657cJ, bVar, aVar, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C13873h) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.home.CloudMediaHomeView$i */
    /* loaded from: classes6.dex */
    static final class C13874i extends AbstractC19075u implements InterfaceC18494a {
        C13874i() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final LinearLayoutManagerFixed mo12V4() {
            return new LinearLayoutManagerFixed(CloudMediaHomeView.this.getContext(), 1, false, true);
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.home.CloudMediaHomeView$j */
    /* loaded from: classes6.dex */
    public static final class C13875j implements InterfaceC1764d0, InterfaceC19066n {

        /* renamed from: p */
        private final /* synthetic */ InterfaceC18505l f71612p;

        C13875j(InterfaceC18505l interfaceC18505l) {
            AbstractC19074t.m100208f(interfaceC18505l, "function");
            this.f71612p = interfaceC18505l;
        }

        @Override // fn0.InterfaceC19066n
        /* renamed from: c */
        public final InterfaceC24847g mo9368c() {
            return this.f71612p;
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
            this.f71612p.mo205i9(obj);
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.home.CloudMediaHomeView$k */
    /* loaded from: classes6.dex */
    public static final class C13876k extends RecyclerView.AbstractC1887n {
        C13876k() {
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
            int mo10005m = CloudMediaHomeView.this.m77230uM().mo10005m(m9817A0);
            int i12 = 0;
            if (mo10005m != 1) {
                if (mo10005m != 2) {
                    if (mo10005m != 6) {
                        if (mo10005m != 10) {
                            rect2 = new Rect(0, 0, 0, 0);
                        } else {
                            int i13 = AbstractC23222t7.f112586t;
                            rect2 = new Rect(i13, i13, i13, AbstractC23222t7.f112566j);
                        }
                    } else {
                        rect2 = new Rect(AbstractC23222t7.f112586t, AbstractC23222t7.f112576o, AbstractC23222t7.f112586t, AbstractC23222t7.f112566j);
                    }
                } else {
                    int i14 = m9817A0 + 1;
                    if (i14 < CloudMediaHomeView.this.m77230uM().mo10003k() && CloudMediaHomeView.this.m77230uM().mo10005m(i14) == 4) {
                        i12 = AbstractC23222t7.f112576o;
                    }
                    rect2 = new Rect(AbstractC23222t7.f112586t, AbstractC23222t7.f112576o, AbstractC23222t7.f112586t, i12);
                }
            } else {
                int i15 = AbstractC23222t7.f112586t;
                if (m9817A0 > 0) {
                    i11 = i15;
                } else {
                    i11 = 0;
                }
                rect2 = new Rect(i15, i11, i15, 0);
            }
            if (m9817A0 == 0 && CloudMediaHomeView.this.m77230uM().mo10005m(m9817A0) != 9 && CloudMediaHomeView.this.m77230uM().mo10005m(m9817A0) != 6) {
                rect2.top = AbstractC23222t7.f112586t;
            }
            rect.set(rect2);
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.home.CloudMediaHomeView$l */
    /* loaded from: classes6.dex */
    public static final class C13877l extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ ZaloView f71614q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13877l(ZaloView zaloView) {
            super(0);
            this.f71614q = zaloView;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final ZaloView mo12V4() {
            return this.f71614q;
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.home.CloudMediaHomeView$m */
    /* loaded from: classes6.dex */
    public static final class C13878m extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ InterfaceC18494a f71615q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13878m(InterfaceC18494a interfaceC18494a) {
            super(0);
            this.f71615q = interfaceC18494a;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C1808z0 mo12V4() {
            C1808z0 mo4644Oc = ((InterfaceC1756a1) this.f71615q.mo12V4()).mo4644Oc();
            AbstractC19074t.m100207e(mo4644Oc, "ownerProducer().viewModelStore");
            return mo4644Oc;
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.home.CloudMediaHomeView$n */
    /* loaded from: classes6.dex */
    static final class C13879n extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C13879n f71616q = new C13879n();

        C13879n() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C1802w0.b mo12V4() {
            return C21677p.Companion.m111768a();
        }
    }

    public CloudMediaHomeView() {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        InterfaceC24854k m129210a3;
        m129210a = AbstractC24856m.m129210a(new C13867b());
        this.f71590R0 = m129210a;
        m129210a2 = AbstractC24856m.m129210a(new C13868c());
        this.f71591S0 = m129210a2;
        m129210a3 = AbstractC24856m.m129210a(new C13874i());
        this.f71592T0 = m129210a3;
        this.f71593U0 = AbstractC17501r0.m93124a(this, AbstractC19061k0.m100169b(C21672k.class), new C13878m(new C13877l(this)), C13879n.f71616q);
    }

    /* renamed from: AM */
    public static final void m77202AM(CloudMediaHomeView cloudMediaHomeView) {
        AbstractC19074t.m100208f(cloudMediaHomeView, "this$0");
        C29740c2 c29740c2 = null;
        if (!C23055e5.m118273h(false, 1, null)) {
            C29740c2 c29740c22 = cloudMediaHomeView.f71588P0;
            if (c29740c22 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c29740c2 = c29740c22;
            }
            c29740c2.f137386r.setRefreshing(false);
            return;
        }
        cloudMediaHomeView.m77205DM(false, true);
    }

    /* renamed from: BM */
    public final void m77203BM(C17487o0 c17487o0, ThreadStorageInfo threadStorageInfo) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("details", threadStorageInfo);
        bundle.putString("access_flow", ToolStorageDetailPage.EnumC13333a.f68485s.m74885c());
        bundle.putCharSequenceArrayList("thread_ids_list", new ArrayList<>(m77233xM().m111741q0()));
        c17487o0.m93066i2(ToolStorageDetailView.class, bundle, 131, 1, true);
    }

    /* renamed from: CM */
    public final void m77204CM() {
        m92693xK().m93066i2(CloudMediaThreadsListView.class, null, 101, 1, true);
    }

    /* renamed from: DM */
    private final void m77205DM(boolean z11, boolean z12) {
        m77233xM().m111732P0(z12);
        m77233xM().m111739l0();
        m77233xM().m111728K0(z11, true);
    }

    /* renamed from: EM */
    static /* synthetic */ void m77206EM(CloudMediaHomeView cloudMediaHomeView, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z12 = true;
        }
        cloudMediaHomeView.m77205DM(z11, z12);
    }

    /* renamed from: FM */
    public final void m77207FM(AbstractC28981d abstractC28981d) {
        EnumC2746k enumC2746k;
        m77210IM(false);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new AbstractC13919b.i(abstractC28981d));
        InterfaceC28990m m144694a = abstractC28981d.m144694a(3);
        if (m144694a != null) {
            if (m144694a.mo90084e() == EnumC28993p.f134268r) {
                enumC2746k = EnumC2746k.f10889q;
            } else if (!m144694a.mo90081b() && !m144694a.mo90083d()) {
                enumC2746k = EnumC2746k.f10892t;
            } else {
                enumC2746k = EnumC2746k.f10891s;
            }
            arrayList.add(new AbstractC13919b.j(m144694a.mo90080a() * 100.0f, enumC2746k));
        }
        arrayList.add(AbstractC13919b.g.f71727b);
        m77230uM().m77428N(arrayList);
    }

    /* renamed from: GM */
    private final void m77208GM(boolean z11) {
        m77210IM(true);
        ArrayList arrayList = new ArrayList();
        if (AbstractC0924m0.m3426Sc()) {
            arrayList.add(AbstractC13919b.a.f71703b);
        }
        if (!AbstractC23306f.m120627V1().m90244o()) {
            arrayList.add(new AbstractC13919b.c.a(null, 1, null));
            arrayList.add(new AbstractC13919b.b.a(null, 1, null));
            arrayList.add(AbstractC13919b.e.f71711b);
        }
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_cloud_media_clean_by_media_type);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        arrayList.add(new AbstractC13919b.h(m118743r0));
        arrayList.add(new AbstractC13919b.f.c(AbstractC13919b.f.b.f71717p, 0L, 2, null));
        arrayList.add(new AbstractC13919b.f.c(AbstractC13919b.f.b.f71718q, 0L, 2, null));
        arrayList.add(new AbstractC13919b.f.c(AbstractC13919b.f.b.f71719r, 0L, 2, null));
        arrayList.add(new AbstractC13919b.f.c(AbstractC13919b.f.b.f71720s, 0L, 2, null));
        arrayList.add(new AbstractC13919b.d(AbstractC13919b.d.a.f71707p));
        String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_cloud_media_clean_by_conversation);
        AbstractC19074t.m100207e(m118743r02, "getString(...)");
        arrayList.add(new AbstractC13919b.h(m118743r02));
        arrayList.add(new AbstractC13919b.f.d(0, 0, 3, null));
        arrayList.add(new AbstractC13919b.d(AbstractC13919b.d.a.f71708q));
        arrayList.add(AbstractC13919b.g.f71727b);
        m77230uM().m77428N(arrayList);
        m77205DM(true, z11);
    }

    /* renamed from: HM */
    static /* synthetic */ void m77209HM(CloudMediaHomeView cloudMediaHomeView, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        cloudMediaHomeView.m77208GM(z11);
    }

    /* renamed from: IM */
    private final void m77210IM(boolean z11) {
        C29740c2 c29740c2 = this.f71588P0;
        if (c29740c2 == null) {
            AbstractC19074t.m100223u("binding");
            c29740c2 = null;
        }
        c29740c2.f137386r.setEnabled(z11);
        m77232wM().m76390N2(z11);
    }

    /* renamed from: JM */
    private final void m77211JM() {
        C29740c2 c29740c2 = this.f71588P0;
        if (c29740c2 == null) {
            AbstractC19074t.m100223u("binding");
            c29740c2 = null;
        }
        RecyclerView recyclerView = c29740c2.f137385q;
        recyclerView.setLayoutManager(m77232wM());
        recyclerView.setAdapter(m77230uM());
        recyclerView.m9816A(new C13876k());
        RecyclerView.AbstractC1885l itemAnimator = recyclerView.getItemAnimator();
        if (itemAnimator != null) {
            AbstractC19074t.m100206d(itemAnimator, "null cannot be cast to non-null type androidx.recyclerview.widget.SimpleItemAnimator");
            AbstractC1933z abstractC1933z = (AbstractC1933z) itemAnimator;
            abstractC1933z.m10694V(false);
            abstractC1933z.m10058x(0L);
        }
    }

    /* renamed from: KM */
    public final void m77212KM() {
        TargetBackupInfo m135059x = C26263i.m135059x(C26263i.m135055u().m135087t());
        if (m135059x != null) {
            if (m135059x.m40959o().length() != 0) {
                AbstractC23211s7.m119567G(m92692wK(), m135059x, 3, true);
            }
            C24848g0 c24848g0 = C24848g0.f119245a;
        }
    }

    /* renamed from: LM */
    public final void m77213LM() {
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
        m90935l.m90934k(m118743r0, new InterfaceC17463d.d() { // from class: bc0.c
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                CloudMediaHomeView.m77214MM(interfaceC17463d, i12);
            }
        }).m90923G().m92855F(new InterfaceC17463d.e() { // from class: bc0.d
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.e
            /* renamed from: Tv */
            public final void mo12457Tv(InterfaceC17463d interfaceC17463d) {
                CloudMediaHomeView.m77215NM(interfaceC17463d);
            }
        });
        C0697c0.Companion.m1048b().m1044v("ZCloudMigrationOutQuota", true);
        AbstractC0924m0.m3179Jq(true);
    }

    /* renamed from: MM */
    public static final void m77214MM(InterfaceC17463d interfaceC17463d, int i11) {
        C26676b.f126324a.m136969H(3);
    }

    /* renamed from: NM */
    public static final void m77215NM(InterfaceC17463d interfaceC17463d) {
        C0697c0.Companion.m1048b().m1035h("ZCloudMigrationOutQuota");
    }

    /* renamed from: uM */
    public final C13918a m77230uM() {
        return (C13918a) this.f71590R0.getValue();
    }

    /* renamed from: vM */
    public final C13868c.a m77231vM() {
        return (C13868c.a) this.f71591S0.getValue();
    }

    /* renamed from: wM */
    private final LinearLayoutManagerFixed m77232wM() {
        return (LinearLayoutManagerFixed) this.f71592T0.getValue();
    }

    /* renamed from: xM */
    public final C21672k m77233xM() {
        return (C21672k) this.f71593U0.getValue();
    }

    /* renamed from: yM */
    private final void m77234yM() {
        m77233xM().m111742s0().m9219j(m92657cJ(), new C13875j(new C13869d()));
        m77233xM().m111724D0().m9219j(m92657cJ(), new C13875j(new C13870e()));
        m77233xM().m111723B0().m9219j(m92657cJ(), new C13875j(new C13871f()));
        m77233xM().m111747y0().m9219j(m92657cJ(), new C13875j(new C13872g()));
        InterfaceC1801w m92657cJ = m92657cJ();
        AbstractC19074t.m100207e(m92657cJ, "getViewLifecycleOwner(...)");
        BuildersKt__Builders_commonKt.m112540d(AbstractC1803x.m9388a(m92657cJ), null, null, new C13873h(null), 3, null);
    }

    /* renamed from: zM */
    private final void m77235zM() {
        C29740c2 c29740c2 = this.f71588P0;
        C29740c2 c29740c22 = null;
        if (c29740c2 == null) {
            AbstractC19074t.m100223u("binding");
            c29740c2 = null;
        }
        ZdsActionBar zdsActionBar = c29740c2.f137387s;
        String m92652XI = m92652XI(AbstractC8020f0.str_connect_feature_cloud_media);
        AbstractC19074t.m100207e(m92652XI, "getString(...)");
        zdsActionBar.setMiddleTitle(m92652XI);
        C29740c2 c29740c23 = this.f71588P0;
        if (c29740c23 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29740c22 = c29740c23;
        }
        c29740c22.f137386r.setOnRefreshListener(new SwipeRefreshLayout.InterfaceC1955j() { // from class: bc0.b
            public /* synthetic */ C2728b() {
            }

            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.InterfaceC1955j
            /* renamed from: a */
            public final void mo10764a() {
                CloudMediaHomeView.m77202AM(CloudMediaHomeView.this);
            }
        });
        m77211JM();
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        Bundle m92642L3 = m92642L3();
        boolean z11 = false;
        if (m92642L3 != null) {
            z11 = m92642L3.getBoolean("IS_IN_MIGRATE_FLOW", false);
        }
        this.f71589Q0 = z11;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(AbstractC7409c0.cloud_media_home_view, viewGroup, false);
        C29740c2 m147797a = C29740c2.m147797a(inflate);
        AbstractC19074t.m100207e(m147797a, "bind(...)");
        this.f71588P0 = m147797a;
        m77235zM();
        m77234yM();
        return inflate;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: KJ */
    public void mo40200KJ() {
        super.mo40200KJ();
        C23744a.b bVar = C23744a.Companion;
        bVar.m124119a().m124117e(this, 150804);
        bVar.m124119a().m124117e(this, 150801);
        bVar.m124119a().m124117e(this, 150809);
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "Cloudmedia_Home";
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        boolean z11 = false;
        if (i11 == 131 && i12 == -1 && intent != null) {
            try {
                if (intent.getBooleanExtra("need_reload", false)) {
                    m77205DM(false, false);
                }
            } catch (Exception e11) {
                C26676b.m136954d("Cloudmedia_Home", e11);
            }
        }
        if (i11 == 101 && i12 == -1) {
            if (intent != null) {
                z11 = intent.getBooleanExtra("APPLY_MAX_RETRY", false);
            }
            AbstractC23306f.m120695n2().m136692D(true);
            m77233xM().m111735T0(z11);
        }
        super.onActivityResult(i11, i12, intent);
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        AbstractC19074t.m100208f(objArr, "args");
        if (i11 != 150801) {
            if (i11 != 150804) {
                if (i11 == 150809) {
                    m77206EM(this, false, false, 2, null);
                    return;
                }
                return;
            } else {
                C21672k m77233xM = m77233xM();
                C23870a m120679j2 = AbstractC23306f.m120679j2();
                AbstractC19074t.m100207e(m120679j2, "provideZaloCloudRepo(...)");
                m77233xM.m111736V0(C23870a.m124718I0(m120679j2, false, null, null, 7, null));
                return;
            }
        }
        if (m92672lJ()) {
            C21672k.m111702U0(m77233xM(), false, 1, null);
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
    }
}
