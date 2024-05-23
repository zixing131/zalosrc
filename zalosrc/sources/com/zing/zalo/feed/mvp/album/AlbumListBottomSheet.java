package com.zing.zalo.feed.mvp.album;

import ac.C0732w;
import ac.InterfaceC0733x;
import am.AbstractC0924m0;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import androidx.lifecycle.AbstractC1803x;
import androidx.lifecycle.C1761c0;
import androidx.lifecycle.InterfaceC1764d0;
import androidx.recyclerview.widget.RecyclerView;
import bo.C2974g;
import bo.C2989j;
import bo.C2999l;
import bo.C3004m;
import bo.C3009n;
import bo.C3054x;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.ItemAlbumMobile;
import com.zing.zalo.feed.mvp.album.AlbumListBottomSheet;
import com.zing.zalo.feed.mvp.profile.model.C8676a;
import com.zing.zalo.feed.mvp.profile.model.ProfilePreviewAlbumItem;
import com.zing.zalo.p077ui.widget.BottomSheetLayout;
import com.zing.zalo.p077ui.zviews.BottomSheetZaloViewWithAnim;
import com.zing.zalo.p077ui.zviews.CommonZaloview;
import com.zing.zalo.uicontrol.NoPredictiveItemAnimLinearLayoutMngr;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.animation.AnimationTarget;
import com.zing.zalocore.CoreUtility;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.InterfaceC19066n;
import fo.C19086f;
import fo.C19087g;
import is.AbstractC20783a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import me0.C23055e5;
import me0.C23212s8;
import p137eo.C18524h;
import p354n3.C23528a;
import p489rn.C25845a;
import p649xl.C29809g;
import p716zh.C32002l4;
import pm0.AbstractC24856m;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.InterfaceC24847g;
import pm0.InterfaceC24854k;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* loaded from: classes4.dex */
public final class AlbumListBottomSheet extends BottomSheetZaloViewWithAnim implements InterfaceC0733x {
    public static final C8473a Companion = new C8473a(null);

    /* renamed from: X0 */
    private C23528a f45994X0;

    /* renamed from: Y0 */
    private C25845a f45995Y0;

    /* renamed from: Z0 */
    private C29809g f45996Z0;

    /* renamed from: d1 */
    private final InterfaceC24854k f46000d1;

    /* renamed from: e1 */
    private final InterfaceC24854k f46001e1;

    /* renamed from: f1 */
    private long f46002f1;

    /* renamed from: g1 */
    private C8676a f46003g1;

    /* renamed from: h1 */
    private boolean f46004h1;

    /* renamed from: i1 */
    private C32002l4 f46005i1;

    /* renamed from: j1 */
    private final String f46006j1;

    /* renamed from: W0 */
    private final int f45993W0 = AbstractC23136l9.m118742r(350.0f);

    /* renamed from: a1 */
    private final List f45997a1 = new ArrayList();

    /* renamed from: b1 */
    private final C1761c0 f45998b1 = new C1761c0();

    /* renamed from: c1 */
    private final C1761c0 f45999c1 = new C1761c0();

    /* renamed from: com.zing.zalo.feed.mvp.album.AlbumListBottomSheet$a */
    /* loaded from: classes4.dex */
    public static final class C8473a {
        private C8473a() {
        }

        public /* synthetic */ C8473a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: com.zing.zalo.feed.mvp.album.AlbumListBottomSheet$b */
    /* loaded from: classes4.dex */
    public static final class EnumC8474b {

        /* renamed from: p */
        public static final EnumC8474b f46007p = new EnumC8474b("CREATE_ALBUM", 0);

        /* renamed from: q */
        public static final EnumC8474b f46008q = new EnumC8474b("SELECT_ALBUM", 1);

        /* renamed from: r */
        public static final EnumC8474b f46009r = new EnumC8474b("UNSELECT_ALBUM", 2);

        /* renamed from: s */
        private static final /* synthetic */ EnumC8474b[] f46010s;

        /* renamed from: t */
        private static final /* synthetic */ InterfaceC30165a f46011t;

        static {
            EnumC8474b[] m45213b = m45213b();
            f46010s = m45213b;
            f46011t = AbstractC30166b.m148796a(m45213b);
        }

        private EnumC8474b(String str, int i11) {
        }

        /* renamed from: b */
        private static final /* synthetic */ EnumC8474b[] m45213b() {
            return new EnumC8474b[]{f46007p, f46008q, f46009r};
        }

        public static EnumC8474b valueOf(String str) {
            return (EnumC8474b) Enum.valueOf(EnumC8474b.class, str);
        }

        public static EnumC8474b[] values() {
            return (EnumC8474b[]) f46010s.clone();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.mvp.album.AlbumListBottomSheet$c */
    /* loaded from: classes4.dex */
    public static final class C8475c extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f46012t;

        C8475c(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new C8475c(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f46012t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C19086f m45204CM = AlbumListBottomSheet.this.m45204CM();
                C19086f.a aVar = new C19086f.a(AlbumListBottomSheet.this.m45208GM(), 0, 1, null, 8, null);
                this.f46012t = 1;
                if (m45204CM.m101507a(aVar, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C8475c) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.mvp.album.AlbumListBottomSheet$d */
    /* loaded from: classes4.dex */
    public static final class C8476d extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f46014t;

        C8476d(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new C8476d(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f46014t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C19086f m45204CM = AlbumListBottomSheet.this.m45204CM();
                C19086f.a aVar = new C19086f.a(AlbumListBottomSheet.this.m45208GM(), 0, AlbumListBottomSheet.this.m45206EM().m46337h() + 1, AlbumListBottomSheet.this.m45206EM());
                this.f46014t = 1;
                if (m45204CM.m101507a(aVar, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C8476d) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.album.AlbumListBottomSheet$e */
    /* loaded from: classes4.dex */
    public static final class C8477e extends RecyclerView.AbstractC1887n {
        C8477e() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1887n
        /* renamed from: g */
        public void mo10066g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1899z c1899z) {
            AbstractC19074t.m100208f(rect, "outRect");
            AbstractC19074t.m100208f(view, "view");
            AbstractC19074t.m100208f(recyclerView, "parent");
            AbstractC19074t.m100208f(c1899z, "state");
            super.mo10066g(rect, view, recyclerView, c1899z);
            if (recyclerView.m9817A0(view) == 0 && !AlbumListBottomSheet.this.m45209IM()) {
                rect.top = AbstractC23222t7.f112586t;
            }
            rect.bottom = AbstractC23222t7.f112576o;
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.album.AlbumListBottomSheet$f */
    /* loaded from: classes4.dex */
    public static final class C8478f extends RecyclerView.AbstractC1892s {

        /* renamed from: a */
        final /* synthetic */ NoPredictiveItemAnimLinearLayoutMngr f46017a;

        /* renamed from: b */
        final /* synthetic */ AlbumListBottomSheet f46018b;

        C8478f(NoPredictiveItemAnimLinearLayoutMngr noPredictiveItemAnimLinearLayoutMngr, AlbumListBottomSheet albumListBottomSheet) {
            this.f46017a = noPredictiveItemAnimLinearLayoutMngr;
            this.f46018b = albumListBottomSheet;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g */
        public static final void m45217g(AlbumListBottomSheet albumListBottomSheet) {
            AbstractC19074t.m100208f(albumListBottomSheet, "this$0");
            albumListBottomSheet.m45205DM();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: b */
        public void mo952b(RecyclerView recyclerView, int i11) {
            AbstractC19074t.m100208f(recyclerView, "view");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: d */
        public void mo10176d(RecyclerView recyclerView, int i11, int i12) {
            AbstractC19074t.m100208f(recyclerView, "recyclerView");
            try {
                if (this.f46017a.m9745c2() >= this.f46017a.m10127i() - 5) {
                    Handler handler = ((CommonZaloview) this.f46018b).f72827B0;
                    final AlbumListBottomSheet albumListBottomSheet = this.f46018b;
                    handler.post(new Runnable() { // from class: co.a
                        @Override // java.lang.Runnable
                        public final void run() {
                            AlbumListBottomSheet.C8478f.m45217g(AlbumListBottomSheet.this);
                        }
                    });
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.album.AlbumListBottomSheet$g */
    /* loaded from: classes4.dex */
    public static final class C8479g implements C25845a.a {
        C8479g() {
        }

        @Override // com.zing.zalo.feed.components.AlbumRowInputDescView.InterfaceC8062a
        /* renamed from: V3 */
        public void mo43421V3(String str) {
            C25845a.a.C32968a.m133307i(this, str);
        }

        @Override // com.zing.zalo.feed.components.ProfileAlbumItemCreateSquareView.InterfaceC8214a
        /* renamed from: X0 */
        public void mo43422X0() {
            C25845a.a.C32968a.m133303e(this);
        }

        @Override // com.zing.zalo.feed.components.AlbumRowPreviewThemeView.InterfaceC8069a
        /* renamed from: a */
        public void mo43423a(C2999l c2999l) {
            C25845a.a.C32968a.m133300b(this, c2999l);
        }

        @Override // com.zing.zalo.feed.components.AlbumRowPreviewAlbumView.InterfaceC8066a
        /* renamed from: b */
        public void mo43424b(C2989j c2989j) {
            AbstractC19074t.m100208f(c2989j, "albumRowPreviewAlbumData");
            C25845a.a.C32968a.m133299a(this, c2989j);
            C0732w.m1177r(C0732w.Companion.m1189a(), "click_select_album", null, null, null, 14, null);
            AlbumListBottomSheet.this.m45198uM(c2989j);
        }

        @Override // com.zing.zalo.feed.components.AlbumRowPreviewGridView.InterfaceC8067a
        /* renamed from: c */
        public void mo43425c(AnimationTarget animationTarget, ItemAlbumMobile itemAlbumMobile, int i11) {
            C25845a.a.C32968a.m133309k(this, animationTarget, itemAlbumMobile, i11);
        }

        @Override // com.zing.zalo.feed.components.AlbumRowSelectInfoView.InterfaceC8070a
        /* renamed from: d */
        public void mo43426d(C3004m c3004m) {
            C25845a.a.C32968a.m133301c(this, c3004m);
        }

        @Override // com.zing.zalo.feed.components.AlbumItemSquareView.InterfaceC8052a
        /* renamed from: f */
        public void mo43406f(ProfilePreviewAlbumItem profilePreviewAlbumItem) {
            C25845a.a.C32968a.m133311m(this, profilePreviewAlbumItem);
        }

        @Override // com.zing.zalo.feed.components.AlbumItemSquareView.InterfaceC8052a
        /* renamed from: g */
        public void mo43407g(ProfilePreviewAlbumItem profilePreviewAlbumItem) {
            C25845a.a.C32968a.m133306h(this, profilePreviewAlbumItem);
        }

        @Override // com.zing.zalo.feed.components.AlbumRowCreateAlbumView.InterfaceC8061a
        /* renamed from: h */
        public void mo43427h() {
            C25845a.a.C32968a.m133302d(this);
            C0732w.m1177r(C0732w.Companion.m1189a(), "click_create_album", null, null, null, 14, null);
            AlbumListBottomSheet.this.m45197tM();
        }

        @Override // com.zing.zalo.feed.components.AlbumRowPreviewGridView.InterfaceC8067a
        /* renamed from: i */
        public void mo43428i(int i11) {
            C25845a.a.C32968a.m133312n(this, i11);
        }

        @Override // com.zing.zalo.feed.components.ProfileAlbumItemSeeMoreView.InterfaceC8215a
        /* renamed from: l0 */
        public void mo43429l0() {
            C25845a.a.C32968a.m133305g(this);
        }

        @Override // com.zing.zalo.feed.components.AlbumRowPreviewGridView.InterfaceC8067a
        /* renamed from: n1 */
        public void mo43430n1() {
            C25845a.a.C32968a.m133304f(this);
        }

        @Override // com.zing.zalo.feed.components.AlbumRowPreviewGridView.InterfaceC8067a
        /* renamed from: r2 */
        public void mo43431r2() {
            C25845a.a.C32968a.m133310l(this);
        }

        @Override // com.zing.zalo.feed.components.EmptyContentView.InterfaceC8078a
        /* renamed from: s */
        public void mo43432s(C3054x c3054x) {
            AbstractC19074t.m100208f(c3054x, "emptyContentData");
            if (c3054x.m14693y() == 1) {
                if (C23055e5.m118273h(false, 1, null)) {
                    AlbumListBottomSheet.this.m45200yM();
                    AlbumListBottomSheet.this.m45202AM();
                } else {
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.network_error));
                }
            }
        }

        @Override // com.zing.zalo.feed.components.AlbumRowPreviewGridView.InterfaceC8067a
        /* renamed from: x1 */
        public void mo43433x1() {
            C25845a.a.C32968a.m133313o(this);
        }

        @Override // com.zing.zalo.feed.components.AlbumRowInputTitleView.InterfaceC8064a
        /* renamed from: z2 */
        public void mo43434z2(String str) {
            C25845a.a.C32968a.m133308j(this, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.mvp.album.AlbumListBottomSheet$h */
    /* loaded from: classes4.dex */
    public static final class C8480h extends AbstractC19075u implements InterfaceC18505l {
        C8480h() {
            super(1);
        }

        /* renamed from: a */
        public final void m45218a(String str) {
            AbstractC19074t.m100208f(str, "text");
            C29809g c29809g = AlbumListBottomSheet.this.f45996Z0;
            if (c29809g == null) {
                AbstractC19074t.m100223u("binding");
                c29809g = null;
            }
            c29809g.f137823t.setText(str);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m45218a((String) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.mvp.album.AlbumListBottomSheet$i */
    /* loaded from: classes4.dex */
    public static final class C8481i extends AbstractC19075u implements InterfaceC18505l {
        C8481i() {
            super(1);
        }

        /* renamed from: a */
        public final void m45219a(List list) {
            AbstractC19074t.m100208f(list, "list");
            C25845a c25845a = AlbumListBottomSheet.this.f45995Y0;
            C25845a c25845a2 = null;
            if (c25845a == null) {
                AbstractC19074t.m100223u("adapter");
                c25845a = null;
            }
            c25845a.m133297O(list);
            C25845a c25845a3 = AlbumListBottomSheet.this.f45995Y0;
            if (c25845a3 == null) {
                AbstractC19074t.m100223u("adapter");
            } else {
                c25845a2 = c25845a3;
            }
            c25845a2.m10008p();
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m45219a((List) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.mvp.album.AlbumListBottomSheet$j */
    /* loaded from: classes4.dex */
    public static final class C8482j extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f46022t;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.feed.mvp.album.AlbumListBottomSheet$j$a */
        /* loaded from: classes4.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ AlbumListBottomSheet f46024p;

            a(AlbumListBottomSheet albumListBottomSheet) {
                this.f46024p = albumListBottomSheet;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: g */
            public static final void m45224g(AlbumListBottomSheet albumListBottomSheet) {
                AbstractC19074t.m100208f(albumListBottomSheet, "this$0");
                albumListBottomSheet.m45199xM();
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: j */
            public static final void m45225j(final AlbumListBottomSheet albumListBottomSheet) {
                AbstractC19074t.m100208f(albumListBottomSheet, "this$0");
                if (!albumListBottomSheet.m45206EM().m46342m().isEmpty()) {
                    albumListBottomSheet.m45200yM();
                } else {
                    albumListBottomSheet.mo70710wy(new Runnable() { // from class: com.zing.zalo.feed.mvp.album.c
                        @Override // java.lang.Runnable
                        public final void run() {
                            AlbumListBottomSheet.C8482j.a.m45226k(AlbumListBottomSheet.this);
                        }
                    });
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: k */
            public static final void m45226k(AlbumListBottomSheet albumListBottomSheet) {
                AbstractC19074t.m100208f(albumListBottomSheet, "this$0");
                albumListBottomSheet.m45197tM();
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public final Object mo12109b(C18524h.b bVar, Continuation continuation) {
                boolean m97913d = bVar.m97913d();
                if (!m97913d) {
                    final AlbumListBottomSheet albumListBottomSheet = this.f46024p;
                    albumListBottomSheet.mo70710wy(new Runnable() { // from class: com.zing.zalo.feed.mvp.album.a
                        @Override // java.lang.Runnable
                        public final void run() {
                            AlbumListBottomSheet.C8482j.a.m45224g(AlbumListBottomSheet.this);
                        }
                    });
                } else if (m97913d) {
                    this.f46024p.m45210JM(bVar.m97910a());
                    if (!this.f46024p.m45206EM().m46343n(this.f46024p.m45203BM())) {
                        this.f46024p.m45205DM();
                    } else {
                        this.f46024p.m45206EM().m46345p(this.f46024p.m45203BM());
                    }
                    final AlbumListBottomSheet albumListBottomSheet2 = this.f46024p;
                    albumListBottomSheet2.mo70710wy(new Runnable() { // from class: com.zing.zalo.feed.mvp.album.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            AlbumListBottomSheet.C8482j.a.m45225j(AlbumListBottomSheet.this);
                        }
                    });
                }
                return C24848g0.f119245a;
            }
        }

        C8482j(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new C8482j(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f46022t;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        AbstractC24862s.m129228b(obj);
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                C19087g m45207FM = AlbumListBottomSheet.this.m45207FM();
                C19087g.a aVar = new C19087g.a(AlbumListBottomSheet.this.m45208GM(), 0);
                this.f46022t = 1;
                obj = m45207FM.m101498a(aVar, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            Flow flow = (Flow) obj;
            if (flow != null) {
                a aVar2 = new a(AlbumListBottomSheet.this);
                this.f46022t = 2;
                if (flow.mo97893a(aVar2, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C8482j) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.album.AlbumListBottomSheet$k */
    /* loaded from: classes4.dex */
    static final class C8483k extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C8483k f46025q = new C8483k();

        C8483k() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C19086f mo12V4() {
            return new C19086f(null, 1, null);
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.album.AlbumListBottomSheet$l */
    /* loaded from: classes4.dex */
    static final class C8484l extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C8484l f46026q = new C8484l();

        C8484l() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C19087g mo12V4() {
            return new C19087g(null, 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.mvp.album.AlbumListBottomSheet$m */
    /* loaded from: classes4.dex */
    public static final class C8485m implements InterfaceC1764d0, InterfaceC19066n {

        /* renamed from: p */
        private final /* synthetic */ InterfaceC18505l f46027p;

        C8485m(InterfaceC18505l interfaceC18505l) {
            AbstractC19074t.m100208f(interfaceC18505l, "function");
            this.f46027p = interfaceC18505l;
        }

        @Override // fn0.InterfaceC19066n
        /* renamed from: c */
        public final InterfaceC24847g mo9368c() {
            return this.f46027p;
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
            this.f46027p.mo205i9(obj);
        }
    }

    public AlbumListBottomSheet() {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        m129210a = AbstractC24856m.m129210a(C8483k.f46025q);
        this.f46000d1 = m129210a;
        m129210a2 = AbstractC24856m.m129210a(C8484l.f46026q);
        this.f46001e1 = m129210a2;
        this.f46002f1 = -1L;
        this.f46003g1 = new C8676a();
        this.f46005i1 = C32002l4.Companion.m154287a(10019);
        String str = CoreUtility.f89233i;
        AbstractC19074t.m100207e(str, "currentUserUid");
        this.f46006j1 = str;
    }

    /* renamed from: HM */
    private final void m45189HM() {
        Context m92689tK = m92689tK();
        AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
        C29809g c29809g = this.f45996Z0;
        if (c29809g == null) {
            AbstractC19074t.m100223u("binding");
            c29809g = null;
        }
        NoPredictiveItemAnimLinearLayoutMngr noPredictiveItemAnimLinearLayoutMngr = new NoPredictiveItemAnimLinearLayoutMngr(this.f72421L0.m92648SI());
        noPredictiveItemAnimLinearLayoutMngr.m9723C2(1);
        c29809g.f137826w.setLayoutManager(noPredictiveItemAnimLinearLayoutMngr);
        c29809g.f137826w.setVisibility(0);
        c29809g.f137826w.m9816A(new C8477e());
        c29809g.f137826w.m9826E(new C8478f(noPredictiveItemAnimLinearLayoutMngr, this));
        C25845a c25845a = new C25845a(m92689tK);
        this.f45995Y0 = c25845a;
        c25845a.m133298P(new C8479g());
        RecyclerView recyclerView = c29809g.f137826w;
        C25845a c25845a2 = this.f45995Y0;
        if (c25845a2 == null) {
            AbstractC19074t.m100223u("adapter");
            c25845a2 = null;
        }
        recyclerView.setAdapter(c25845a2);
        BottomSheetLayout bottomSheetLayout = this.f72454M0;
        bottomSheetLayout.setEnableScrollY(true);
        bottomSheetLayout.setEnableToggleWHenClickNoConsume(false);
        bottomSheetLayout.setCanOverTranslateMaxY(true);
        m78539iM(true);
        this.f45999c1.m9219j(this, new C8485m(new C8480h()));
        this.f45998b1.m9219j(this, new C8485m(new C8481i()));
        m45200yM();
        BuildersKt__Builders_commonKt.m112540d(AbstractC1803x.m9388a(this), null, null, new C8482j(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: tM */
    public final void m45197tM() {
        if (this.f46003g1.m46339j() > 0) {
            ZaloView m92650VI = m92650VI();
            if (m92650VI != null) {
                Intent intent = new Intent();
                intent.putExtra("mode_select", EnumC8474b.f46007p);
                C24848g0 c24848g0 = C24848g0.f119245a;
                m92650VI.mo50035CK(-1, intent);
            }
            m45211vM(true);
            return;
        }
        AbstractC20783a.a aVar = AbstractC20783a.Companion;
        Context m92689tK = m92689tK();
        AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
        aVar.m108435d(m92689tK);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: uM */
    public final void m45198uM(C2989j c2989j) {
        boolean z11;
        EnumC8474b enumC8474b;
        if (this.f46002f1 != c2989j.m14172b().getId()) {
            z11 = true;
        } else {
            z11 = false;
        }
        ZaloView m92650VI = m92650VI();
        if (m92650VI != null) {
            Intent intent = new Intent();
            if (z11) {
                enumC8474b = EnumC8474b.f46008q;
            } else {
                enumC8474b = EnumC8474b.f46009r;
            }
            intent.putExtra("mode_select", enumC8474b);
            intent.putExtra("selected_album_item", c2989j.m14172b());
            C24848g0 c24848g0 = C24848g0.f119245a;
            m92650VI.mo50035CK(-1, intent);
        }
        m45211vM(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: xM */
    public final void m45199xM() {
        this.f45997a1.clear();
        List list = this.f45997a1;
        C2974g.a.C32652a c32652a = C2974g.a.Companion;
        C29809g c29809g = null;
        C3054x c3054x = new C3054x(false, 1, 0 == true ? 1 : 0);
        c3054x.m14664V(1);
        c3054x.m14663U(true);
        c3054x.m14648F(C23212s8.m119607o(getContext(), AbstractC16781w.ProfileSecondaryBackgroundColor));
        c3054x.m14666X(AbstractC23136l9.m118743r0(AbstractC8020f0.str_connection_error));
        c3054x.m14650H(AbstractC23136l9.m118743r0(AbstractC8020f0.str_network_error_detail));
        c3054x.m14657O(AbstractC16803z.im_connect);
        c3054x.m14667Y(AbstractC23136l9.m118743r0(AbstractC8020f0.tap_to_retry));
        c3054x.m14661S(0);
        c3054x.m14660R(AbstractC23136l9.m118742r(0.0f));
        c3054x.m14662T(AbstractC23136l9.m118742r(0.0f));
        c3054x.m14665W(1);
        C24848g0 c24848g0 = C24848g0.f119245a;
        list.add(c32652a.m14102c(c3054x));
        this.f46004h1 = true;
        C29809g c29809g2 = this.f45996Z0;
        if (c29809g2 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29809g = c29809g2;
        }
        c29809g.f137827x.setVisibility(8);
        this.f45998b1.mo9221n(this.f45997a1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: yM */
    public final void m45200yM() {
        this.f45997a1.clear();
        if (this.f46003g1.m46344o()) {
            if (AbstractC0924m0.m4195s9()) {
                this.f45997a1.add(C2974g.a.Companion.m14100a());
            }
            C8676a c8676a = this.f46003g1;
            Iterator it = c8676a.m46342m().iterator();
            while (it.hasNext()) {
                this.f45997a1.add(C2974g.a.Companion.m14105f(m45212wM((ProfilePreviewAlbumItem) it.next())));
            }
            this.f45999c1.mo9221n("(" + c8676a.m46341l() + ")");
        } else {
            this.f45997a1.add(C2974g.a.Companion.m14111l(new C3009n(6)));
        }
        this.f46004h1 = false;
        C29809g c29809g = this.f45996Z0;
        if (c29809g == null) {
            AbstractC19074t.m100223u("binding");
            c29809g = null;
        }
        c29809g.f137827x.setVisibility(0);
        this.f45998b1.mo9221n(this.f45997a1);
    }

    /* renamed from: zM */
    private final BottomSheetLayout m45201zM() {
        BottomSheetLayout bottomSheetLayout = this.f72454M0;
        AbstractC19074t.m100207e(bottomSheetLayout, "rootView");
        return bottomSheetLayout;
    }

    /* renamed from: AM */
    public final void m45202AM() {
        BuildersKt__Builders_commonKt.m112540d(AbstractC1803x.m9388a(this), null, null, new C8475c(null), 3, null);
    }

    /* renamed from: BM */
    public final long m45203BM() {
        return this.f46002f1;
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        this.f45994X0 = new C23528a(this.f72421L0.m92648SI());
        Bundle m92642L3 = this.f72421L0.m92642L3();
        if (m92642L3 == null) {
            return;
        }
        this.f46002f1 = m92642L3.getLong("selected_album_id", -1L);
        this.f46005i1.m154273c(C32002l4.Companion.m154292f(m92642L3.getString("extra_entry_point_flow")));
    }

    /* renamed from: CM */
    public final C19086f m45204CM() {
        return (C19086f) this.f46000d1.getValue();
    }

    /* renamed from: DM */
    public final void m45205DM() {
        if (this.f46003g1.m46334e()) {
            BuildersKt__Builders_commonKt.m112540d(AbstractC1803x.m9388a(this), null, null, new C8476d(null), 3, null);
        }
    }

    /* renamed from: EM */
    public final C8676a m45206EM() {
        return this.f46003g1;
    }

    /* renamed from: FM */
    public final C19087g m45207FM() {
        return (C19087g) this.f46001e1.getValue();
    }

    /* renamed from: GM */
    public final String m45208GM() {
        return this.f46006j1;
    }

    /* renamed from: IM */
    public final boolean m45209IM() {
        return this.f46004h1;
    }

    /* renamed from: JM */
    public final void m45210JM(C8676a c8676a) {
        AbstractC19074t.m100208f(c8676a, "<set-?>");
        this.f46003g1 = c8676a;
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView, com.zing.zalo.p077ui.widget.BottomSheetLayout.InterfaceC13470b
    /* renamed from: P2 */
    public View mo37117P2() {
        C29809g c29809g = null;
        if (m45201zM().m75553g()) {
            return null;
        }
        C29809g c29809g2 = this.f45996Z0;
        if (c29809g2 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29809g = c29809g2;
        }
        return c29809g.f137826w;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView
    /* renamed from: eM */
    public int mo37128eM() {
        return AbstractC23136l9.m118713h0() - this.f45993W0;
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView
    /* renamed from: fM */
    protected void mo37129fM(LinearLayout linearLayout) {
        C29809g m147967c = C29809g.m147967c(LayoutInflater.from(getContext()), this.f72454M0, true);
        AbstractC19074t.m100207e(m147967c, "inflate(...)");
        this.f45996Z0 = m147967c;
        C29809g c29809g = null;
        if (m147967c == null) {
            AbstractC19074t.m100223u("binding");
            m147967c = null;
        }
        this.f72455N0 = m147967c.f137820q;
        C29809g c29809g2 = this.f45996Z0;
        if (c29809g2 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29809g = c29809g2;
        }
        this.f72456O0 = c29809g.f137824u;
        m45189HM();
        m45202AM();
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "AlbumListBottomSheet";
    }

    /* renamed from: vM */
    public final void m45211vM(boolean z11) {
        int i11;
        if (z11) {
            i11 = 100;
        } else {
            i11 = this.f72461S0;
        }
        this.f72461S0 = i11;
        super.close();
    }

    /* renamed from: wM */
    public final C2989j m45212wM(ProfilePreviewAlbumItem profilePreviewAlbumItem) {
        boolean z11;
        boolean z12;
        AbstractC19074t.m100208f(profilePreviewAlbumItem, "profilePreviewAlbumItem");
        if (profilePreviewAlbumItem.getSize() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        String thumb = profilePreviewAlbumItem.getThumb();
        String title = profilePreviewAlbumItem.getTitle();
        String str = "· " + profilePreviewAlbumItem.getDesc();
        if (profilePreviewAlbumItem.getId() == this.f46002f1) {
            z12 = true;
        } else {
            z12 = false;
        }
        C2989j c2989j = new C2989j(profilePreviewAlbumItem, z11, thumb, title, str, z12);
        c2989j.m14178h(c2989j.m14172b().getPrivacyType());
        return c2989j;
    }
}
