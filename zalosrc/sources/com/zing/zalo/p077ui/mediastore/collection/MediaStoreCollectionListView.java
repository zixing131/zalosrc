package com.zing.zalo.p077ui.mediastore.collection;

import ac.InterfaceC0733x;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import androidx.recyclerview.widget.C1923p;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import au.EnumC2344e0;
import au.EnumC2363o;
import au.EnumC2382z;
import ci.AbstractC3512l;
import ci.C3499e0;
import ci.C3508j;
import ci.C3509j0;
import ci.C3510k;
import ci.C3521p0;
import com.zing.p058v4.widget.SwipeRefreshLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.adapters.C7182q3;
import com.zing.zalo.control.mediastore.CreateMediaStoreParam;
import com.zing.zalo.control.mediastore.MSFilterData;
import com.zing.zalo.p077ui.mediastore.MediaStoreView;
import com.zing.zalo.p077ui.mediastore.collection.MediaStoreCollectionListView;
import com.zing.zalo.p077ui.zviews.CommonZaloview;
import com.zing.zalo.p077ui.zviews.SlidableZaloView;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import com.zing.zalo.uicontrol.SwipeRefreshListView;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import com.zing.zalo.zview.AbstractC17450b;
import com.zing.zalo.zview.C17487o0;
import fe0.C18894c;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import hm0.C20096c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import me0.AbstractC23136l9;
import me0.AbstractC23184q2;
import p348mi.AbstractC23306f;
import p361nb.AbstractC23647d;
import p363nh.C23744a;
import p461qu.AbstractC25495a;
import p542ub.InterfaceC27218a;
import zl0.AbstractC32232i;

/* loaded from: classes6.dex */
public final class MediaStoreCollectionListView extends SlidableZaloView implements C23744a.c, InterfaceC0733x {
    public static final C12346a Companion = new C12346a(null);

    /* renamed from: P0 */
    private View f64225P0;

    /* renamed from: Q0 */
    private SwipeRefreshListView f64226Q0;

    /* renamed from: R0 */
    private RecyclerView f64227R0;

    /* renamed from: S0 */
    public C7182q3 f64228S0;

    /* renamed from: T0 */
    public GridLayoutManager f64229T0;

    /* renamed from: U0 */
    private MultiStateView f64230U0;

    /* renamed from: V0 */
    private String f64231V0;

    /* renamed from: X0 */
    private C3499e0 f64233X0;

    /* renamed from: Y0 */
    private C3508j.b f64234Y0;

    /* renamed from: Z0 */
    private C3510k f64235Z0;

    /* renamed from: b1 */
    private final C3521p0 f64237b1;

    /* renamed from: c1 */
    private final C18894c f64238c1;

    /* renamed from: d1 */
    private Runnable f64239d1;

    /* renamed from: e1 */
    private C7182q3.b f64240e1;

    /* renamed from: f1 */
    private AbstractC3512l f64241f1;

    /* renamed from: W0 */
    private String f64232W0 = "";

    /* renamed from: a1 */
    private final List f64236a1 = new ArrayList();

    /* renamed from: com.zing.zalo.ui.mediastore.collection.MediaStoreCollectionListView$a */
    /* loaded from: classes6.dex */
    public static final class C12346a {
        private C12346a() {
        }

        public /* synthetic */ C12346a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.mediastore.collection.MediaStoreCollectionListView$b */
    /* loaded from: classes6.dex */
    public /* synthetic */ class C12347b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f64242a;

        static {
            int[] iArr = new int[C3508j.b.values().length];
            try {
                iArr[C3508j.b.f14700q.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C3508j.b.f14701r.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f64242a = iArr;
        }
    }

    /* renamed from: com.zing.zalo.ui.mediastore.collection.MediaStoreCollectionListView$c */
    /* loaded from: classes6.dex */
    public static final class C12348c extends RecyclerView.AbstractC1892s {
        C12348c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: b */
        public void mo952b(RecyclerView recyclerView, int i11) {
            AbstractC19074t.m100208f(recyclerView, "recyclerView");
            super.mo952b(recyclerView, i11);
            try {
                if (i11 == 0) {
                    MediaStoreCollectionListView.this.m69452nM().m36490X(false);
                    MediaStoreCollectionListView.this.m69452nM().m10008p();
                } else {
                    MediaStoreCollectionListView.this.m69452nM().m36490X(true);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.mediastore.collection.MediaStoreCollectionListView$d */
    /* loaded from: classes6.dex */
    public static final class C12349d extends RecyclerView.AbstractC1887n {
        C12349d() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1887n
        /* renamed from: g */
        public void mo10066g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1899z c1899z) {
            AbstractC19074t.m100208f(rect, "outRect");
            AbstractC19074t.m100208f(view, "view");
            AbstractC19074t.m100208f(recyclerView, "parent");
            AbstractC19074t.m100208f(c1899z, "state");
            int m9817A0 = recyclerView.m9817A0(view);
            if (m9817A0 < MediaStoreCollectionListView.this.m69454pM().m9668X2()) {
                if (recyclerView.m9823C0(view).m9931C() == 4) {
                    rect.top = AbstractC32232i.m155453a(8.0f);
                }
            } else if (m9817A0 == c1899z.m10253b() - 1) {
                rect.bottom = AbstractC32232i.m155453a(36.0f);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.mediastore.collection.MediaStoreCollectionListView$e */
    /* loaded from: classes6.dex */
    public static final class C12350e extends AbstractC3512l {
        C12350e() {
        }

        /* renamed from: g */
        public static final void m69462g(MediaStoreCollectionListView mediaStoreCollectionListView, C20096c c20096c) {
            int i11;
            AbstractC19074t.m100208f(mediaStoreCollectionListView, "this$0");
            mediaStoreCollectionListView.m69452nM().m36492Z(false);
            if (c20096c != null) {
                i11 = c20096c.m104491c();
            } else {
                i11 = 0;
            }
            if (i11 == 0) {
                mediaStoreCollectionListView.m69452nM().m36491Y(false);
            }
            mediaStoreCollectionListView.m69450lM();
            if (i11 == 0) {
                mediaStoreCollectionListView.m69449AM(MultiStateView.EnumC15915f.NON_ERROR);
            } else {
                MultiStateView.EnumC15915f enumC15915f = MultiStateView.EnumC15915f.UNKNOWN_ERROR;
                if (i11 == 50001) {
                    enumC15915f = MultiStateView.EnumC15915f.NETWORK_ERROR;
                }
                mediaStoreCollectionListView.m69449AM(enumC15915f);
            }
            SwipeRefreshListView m69456rM = mediaStoreCollectionListView.m69456rM();
            if (m69456rM != null) {
                m69456rM.setRefreshing(false);
            }
        }

        /* renamed from: h */
        public static final void m69463h(MediaStoreCollectionListView mediaStoreCollectionListView) {
            AbstractC19074t.m100208f(mediaStoreCollectionListView, "this$0");
            mediaStoreCollectionListView.m69450lM();
        }

        @Override // ci.AbstractC3512l
        /* renamed from: a */
        public void mo17751a(String str, EnumC2382z enumC2382z, long j11) {
            AbstractC19074t.m100208f(str, "conversationId");
            AbstractC19074t.m100208f(enumC2382z, "mediaStoreType");
            if (!TextUtils.equals(MediaStoreCollectionListView.this.m69453oM(), str)) {
                return;
            }
            ((CommonZaloview) MediaStoreCollectionListView.this).f72827B0.post(MediaStoreCollectionListView.this.m69455qM());
        }

        @Override // ci.AbstractC3512l
        /* renamed from: b */
        public void mo17752b(String str, EnumC2382z enumC2382z) {
            AbstractC19074t.m100208f(str, "conversationId");
            AbstractC19074t.m100208f(enumC2382z, "mediaStoreType");
            if (!TextUtils.equals(MediaStoreCollectionListView.this.m69453oM(), str)) {
                return;
            }
            ((CommonZaloview) MediaStoreCollectionListView.this).f72827B0.post(MediaStoreCollectionListView.this.m69455qM());
        }

        @Override // ci.AbstractC3512l
        /* renamed from: c */
        public void mo17753c(String str, EnumC2382z enumC2382z, C3510k c3510k, C20096c c20096c) {
            AbstractC19074t.m100208f(str, "conversationId");
            AbstractC19074t.m100208f(enumC2382z, "mediaStoreType");
            if (!TextUtils.equals(MediaStoreCollectionListView.this.m69453oM(), str)) {
                return;
            }
            ((CommonZaloview) MediaStoreCollectionListView.this).f72827B0.post(new Runnable() { // from class: y70.f

                /* renamed from: q */
                public final /* synthetic */ C20096c f142274q;

                public /* synthetic */ RunnableC30811f(C20096c c20096c2) {
                    r2 = c20096c2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    MediaStoreCollectionListView.C12350e.m69462g(MediaStoreCollectionListView.this, r2);
                }
            });
        }

        @Override // ci.AbstractC3512l
        /* renamed from: d */
        public void mo17754d(String str, EnumC2382z enumC2382z, C3510k c3510k) {
            AbstractC19074t.m100208f(str, "conversationId");
            AbstractC19074t.m100208f(enumC2382z, "mediaStoreType");
            if (!TextUtils.equals(MediaStoreCollectionListView.this.m69453oM(), str)) {
                return;
            }
            ((CommonZaloview) MediaStoreCollectionListView.this).f72827B0.post(new Runnable() { // from class: y70.g
                public /* synthetic */ RunnableC30812g() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    MediaStoreCollectionListView.C12350e.m69463h(MediaStoreCollectionListView.this);
                }
            });
        }
    }

    /* renamed from: com.zing.zalo.ui.mediastore.collection.MediaStoreCollectionListView$f */
    /* loaded from: classes6.dex */
    public static final class C12351f implements C7182q3.b {
        C12351f() {
        }

        @Override // com.zing.zalo.adapters.C7182q3.b
        /* renamed from: a */
        public void mo36504a(C3508j c3508j) {
            C17487o0 mo35579p;
            C17487o0 mo35579p2;
            AbstractC19074t.m100208f(c3508j, "albumItem");
            try {
                if (c3508j instanceof C3510k) {
                    Bundle bundle = new Bundle();
                    bundle.putString("EXTRA_CONVERSATION_ID", MediaStoreCollectionListView.this.m69453oM());
                    bundle.putInt("EXTRA_INT_COLLECTION_SUBTYPE", c3508j.m17713y0().ordinal());
                    bundle.putInt("SHOW_WITH_FLAGS", 134217728);
                    InterfaceC27218a m92676n2 = MediaStoreCollectionListView.this.f72421L0.m92676n2();
                    if (m92676n2 != null && (mo35579p2 = m92676n2.mo35579p()) != null) {
                        mo35579p2.m93069k2(MediaStoreCollectionListView.class, bundle, 1, true);
                    }
                    if (c3508j.m17713y0() == C3508j.b.f14701r) {
                        AbstractC23647d.m123897g("10015433");
                        return;
                    }
                    return;
                }
                Bundle bundle2 = new Bundle();
                CreateMediaStoreParam createMediaStoreParam = new CreateMediaStoreParam(MediaStoreCollectionListView.this.m69453oM(), null, null, 6, null);
                if (c3508j.m17713y0() == C3508j.b.f14700q) {
                    createMediaStoreParam.m40912e(EnumC2363o.f9891r);
                } else if (c3508j.m17713y0() == C3508j.b.f14701r) {
                    createMediaStoreParam.m40912e(EnumC2363o.f9890q);
                    if (c3508j.m17696I0(EnumC2382z.f9945r) <= 0) {
                        if (c3508j.m17696I0(EnumC2382z.f9947t) > 0) {
                            bundle2.putInt("extra_type_id", EnumC2344e0.f9854s.ordinal());
                        } else if (c3508j.m17696I0(EnumC2382z.f9946s) > 0) {
                            bundle2.putInt("extra_type_id", EnumC2344e0.f9853r.ordinal());
                        }
                    }
                }
                createMediaStoreParam.m40911d(new MSFilterData(String.valueOf(c3508j.m17711w0()), String.valueOf(c3508j.m17694G0())));
                createMediaStoreParam.m40913f(bundle2);
                bundle2.putInt("SHOW_WITH_FLAGS", 134217728);
                InterfaceC27218a m92676n22 = MediaStoreCollectionListView.this.f72421L0.m92676n2();
                if (m92676n22 != null && (mo35579p = m92676n22.mo35579p()) != null) {
                    mo35579p.mo89694j2(MediaStoreView.class, bundle2, 1000, null, 1, true);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // com.zing.zalo.adapters.C7182q3.b
        /* renamed from: b */
        public void mo36505b() {
            MediaStoreCollectionListView.this.m69451mM();
        }
    }

    /* renamed from: com.zing.zalo.ui.mediastore.collection.MediaStoreCollectionListView$g */
    /* loaded from: classes6.dex */
    public static final class C12352g extends C1923p {
        C12352g(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.C1923p
        /* renamed from: B */
        protected int mo10618B() {
            return -1;
        }
    }

    public MediaStoreCollectionListView() {
        C3521p0 m120569C0 = AbstractC23306f.m120569C0();
        AbstractC19074t.m100207e(m120569C0, "provideMediaStoresManager(...)");
        this.f64237b1 = m120569C0;
        C18894c m120707r0 = AbstractC23306f.m120707r0();
        AbstractC19074t.m100207e(m120707r0, "provideLoadMSCollectionUseCase(...)");
        this.f64238c1 = m120707r0;
        this.f64239d1 = new Runnable() { // from class: y70.e
            public /* synthetic */ RunnableC30810e() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                MediaStoreCollectionListView.m69446vM(MediaStoreCollectionListView.this);
            }
        };
        this.f64240e1 = new C12351f();
        this.f64241f1 = new C12350e();
    }

    /* renamed from: r4 */
    private final void m69443r4() {
        RecyclerView recyclerView = this.f64227R0;
        if (recyclerView != null) {
            recyclerView.m9866X1();
        }
        if (m69454pM().m9740Y1() <= 50) {
            C12352g c12352g = new C12352g(getContext());
            c12352g.m10244p(0);
            m69454pM().m10090H1(c12352g);
            return;
        }
        m69454pM().m9721B2(0, 0);
    }

    /* renamed from: tM */
    public static final void m69444tM(SwipeRefreshListView swipeRefreshListView, MediaStoreCollectionListView mediaStoreCollectionListView) {
        AbstractC19074t.m100208f(swipeRefreshListView, "$this_apply");
        AbstractC19074t.m100208f(mediaStoreCollectionListView, "this$0");
        swipeRefreshListView.m88202K();
        mediaStoreCollectionListView.m69451mM();
    }

    /* renamed from: uM */
    public static final void m69445uM(MediaStoreCollectionListView mediaStoreCollectionListView) {
        AbstractC19074t.m100208f(mediaStoreCollectionListView, "this$0");
        mediaStoreCollectionListView.m69451mM();
    }

    /* renamed from: vM */
    public static final void m69446vM(MediaStoreCollectionListView mediaStoreCollectionListView) {
        AbstractC19074t.m100208f(mediaStoreCollectionListView, "this$0");
        mediaStoreCollectionListView.m69450lM();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* renamed from: yM */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m69447yM() {
        String str;
        ZdsActionBar m87077NK;
        int i11;
        C3508j.b bVar = this.f64234Y0;
        if (bVar != null) {
            if (bVar == null) {
                i11 = -1;
            } else {
                i11 = C12347b.f64242a[bVar.ordinal()];
            }
            if (i11 != 1) {
                if (i11 == 2) {
                    str = AbstractC23136l9.m118743r0(AbstractC8020f0.str_media_store_collection_sender_title);
                    AbstractC19074t.m100207e(str, "getString(...)");
                }
            } else {
                str = AbstractC23136l9.m118743r0(AbstractC8020f0.str_media_store_collection_video_title);
                AbstractC19074t.m100207e(str, "getString(...)");
            }
            m87077NK = m87077NK();
            if (m87077NK == null) {
                m87077NK.setMiddleTitle(str);
                View findViewById = m87077NK.findViewById(AbstractC6918a0.txtTitle);
                if (findViewById != null) {
                    findViewById.setOnClickListener(new View.OnClickListener() { // from class: y70.d
                        public /* synthetic */ ViewOnClickListenerC30809d() {
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            MediaStoreCollectionListView.m69448zM(MediaStoreCollectionListView.this, view);
                        }
                    });
                    return;
                }
                return;
            }
            return;
        }
        str = "";
        m87077NK = m87077NK();
        if (m87077NK == null) {
        }
    }

    /* renamed from: zM */
    public static final void m69448zM(MediaStoreCollectionListView mediaStoreCollectionListView, View view) {
        AbstractC19074t.m100208f(mediaStoreCollectionListView, "this$0");
        mediaStoreCollectionListView.m69443r4();
    }

    /* renamed from: AM */
    public final void m69449AM(MultiStateView.EnumC15915f enumC15915f) {
        AbstractC19074t.m100208f(enumC15915f, "errorType");
        try {
            MultiStateView multiStateView = this.f64230U0;
            if (multiStateView != null) {
                if (!this.f64236a1.isEmpty()) {
                    multiStateView.setVisibility(8);
                } else if (MultiStateView.EnumC15915f.NON_ERROR == enumC15915f) {
                    multiStateView.setVisibility(8);
                } else {
                    multiStateView.setVisibility(0);
                    multiStateView.setState(MultiStateView.EnumC15914e.ERROR);
                    multiStateView.setErrorType(enumC15915f);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        C3510k c3510k;
        super.mo37111CJ(bundle);
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null) {
            String string = m92642L3.getString("EXTRA_CONVERSATION_ID");
            if (string == null) {
                string = "";
            } else {
                AbstractC19074t.m100205c(string);
            }
            this.f64232W0 = string;
            if (AbstractC25495a.m132079d(string)) {
                this.f64231V0 = AbstractC25495a.m132088m(this.f64232W0);
            }
            C3499e0 m17791p = this.f64237b1.m17791p(new CreateMediaStoreParam(this.f64232W0, null, null, 6, null));
            this.f64233X0 = m17791p;
            if (m17791p != null) {
                m17791p.m17625k0(this.f64241f1);
            }
            if (m92642L3.containsKey("EXTRA_INT_COLLECTION_SUBTYPE")) {
                for (C3508j.b bVar : C3508j.b.values()) {
                    if (bVar.ordinal() == m92642L3.getInt("EXTRA_INT_COLLECTION_SUBTYPE")) {
                        this.f64234Y0 = bVar;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
            C3508j.b bVar2 = this.f64234Y0;
            if (bVar2 == null) {
                finish();
                return;
            }
            if (bVar2 != null) {
                C3499e0 c3499e0 = this.f64233X0;
                if (c3499e0 != null) {
                    c3510k = c3499e0.m17606K(bVar2);
                } else {
                    c3510k = null;
                }
                this.f64235Z0 = c3510k;
            }
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        this.f64225P0 = layoutInflater.inflate(AbstractC7409c0.layout_media_store_album_page, viewGroup, false);
        m69457sM();
        return this.f64225P0;
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: IJ */
    public void mo39024IJ() {
        super.mo39024IJ();
        C3499e0 c3499e0 = this.f64233X0;
        if (c3499e0 != null) {
            c3499e0.m17634q0(this.f64241f1);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: KJ */
    public void mo40200KJ() {
        super.mo40200KJ();
        C23744a.Companion.m124119a().m124117e(this, 52);
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar
    /* renamed from: OK */
    public void mo39896OK() {
        super.mo39896OK();
        m69447yM();
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: UJ */
    public void mo37584UJ() {
        super.mo37584UJ();
        C3509j0.m17726l(this.f64232W0);
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
        C3509j0.m17730p(this.f64232W0);
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "MediaStoreAlbumListView";
    }

    /* renamed from: lM */
    public final void m69450lM() {
        String str;
        try {
            this.f64236a1.clear();
            C3510k c3510k = this.f64235Z0;
            if (c3510k != null) {
                this.f64236a1.addAll(c3510k.m17742Y0());
            }
            C3508j.b bVar = this.f64234Y0;
            String str2 = null;
            if (bVar != null && bVar == C3508j.b.f14701r) {
                String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_media_store_collection_sender_desc);
                C3510k c3510k2 = this.f64235Z0;
                if (c3510k2 != null) {
                    str2 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_media_store_collection_sender_footer, String.valueOf(c3510k2.m17692E0()));
                }
                String str3 = str2;
                str2 = m118743r0;
                str = str3;
            } else {
                str = null;
            }
            m69452nM().m36489W(str2);
            m69452nM().m36488V(str);
            m69452nM().m36486T(this.f64233X0, this.f64236a1);
            m69452nM().m10008p();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: mM */
    public final void m69451mM() {
        C3499e0 c3499e0;
        C3510k c3510k = this.f64235Z0;
        if (c3510k != null && (c3499e0 = this.f64233X0) != null) {
            this.f64238c1.m101508a(new C18894c.a(c3499e0, c3510k));
        }
    }

    /* renamed from: nM */
    public final C7182q3 m69452nM() {
        C7182q3 c7182q3 = this.f64228S0;
        if (c7182q3 != null) {
            return c7182q3;
        }
        AbstractC19074t.m100223u("mCollectionAdapter");
        return null;
    }

    /* renamed from: oM */
    public final String m69453oM() {
        return this.f64232W0;
    }

    /* renamed from: pM */
    public final GridLayoutManager m69454pM() {
        GridLayoutManager gridLayoutManager = this.f64229T0;
        if (gridLayoutManager != null) {
            return gridLayoutManager;
        }
        AbstractC19074t.m100223u("mGridLayoutManager");
        return null;
    }

    /* renamed from: qM */
    public final Runnable m69455qM() {
        return this.f64239d1;
    }

    /* renamed from: rM */
    public final SwipeRefreshListView m69456rM() {
        return this.f64226Q0;
    }

    /* renamed from: sM */
    public final void m69457sM() {
        RecyclerView recyclerView;
        View view = this.f64225P0;
        if (view == null) {
            return;
        }
        SwipeRefreshListView swipeRefreshListView = (SwipeRefreshListView) view.findViewById(AbstractC6918a0.swipe_refresh_layout);
        this.f64226Q0 = swipeRefreshListView;
        if (swipeRefreshListView != null && (recyclerView = swipeRefreshListView.f83582p0) != null) {
            recyclerView.setBackgroundColor(AbstractC32232i.m155465m(recyclerView.getContext(), AbstractC17450b.PrimaryBackgroundColor));
            recyclerView.setVisibility(0);
            recyclerView.setMotionEventSplittingEnabled(false);
        } else {
            recyclerView = null;
        }
        this.f64227R0 = recyclerView;
        SwipeRefreshListView swipeRefreshListView2 = this.f64226Q0;
        if (swipeRefreshListView2 != null) {
            ListView listView = swipeRefreshListView2.f83579m0;
            if (listView != null) {
                listView.setVisibility(8);
            }
            swipeRefreshListView2.setOnRefreshListener(new SwipeRefreshLayout.InterfaceC6891i() { // from class: y70.b

                /* renamed from: b */
                public final /* synthetic */ MediaStoreCollectionListView f142269b;

                public /* synthetic */ C30807b(MediaStoreCollectionListView this) {
                    r2 = this;
                }

                @Override // com.zing.p058v4.widget.SwipeRefreshLayout.InterfaceC6891i
                /* renamed from: a */
                public final void mo12137a() {
                    MediaStoreCollectionListView.m69444tM(SwipeRefreshListView.this, r2);
                }
            });
        }
        MultiStateView multiStateView = (MultiStateView) view.findViewById(AbstractC6918a0.multi_state);
        this.f64230U0 = multiStateView;
        if (multiStateView != null) {
            multiStateView.setEnableSwapStateAnim(false);
            multiStateView.setOnTapToRetryListener(new MultiStateView.InterfaceC15916g() { // from class: y70.c
                public /* synthetic */ C30808c() {
                }

                @Override // com.zing.zalo.p077ui.zviews.multistate.MultiStateView.InterfaceC15916g
                /* renamed from: a */
                public final void mo12138a() {
                    MediaStoreCollectionListView.m69445uM(MediaStoreCollectionListView.this);
                }
            });
        }
        m69459xM(new GridLayoutManager(this.f72421L0.m92648SI(), 2));
        C7182q3 c7182q3 = new C7182q3(getContext());
        c7182q3.m36485S(this.f64240e1);
        c7182q3.m36493a0(m69454pM());
        c7182q3.m9999J(true);
        c7182q3.m36487U(this.f64234Y0);
        m69458wM(c7182q3);
        RecyclerView recyclerView2 = this.f64227R0;
        if (recyclerView2 != null) {
            recyclerView2.setLayoutManager(m69454pM());
            recyclerView2.setOverScrollMode(2);
            recyclerView2.m9826E(new C12348c());
            recyclerView2.m9816A(new C12349d());
            recyclerView2.setAdapter(m69452nM());
        }
    }

    /* renamed from: wM */
    public final void m69458wM(C7182q3 c7182q3) {
        AbstractC19074t.m100208f(c7182q3, "<set-?>");
        this.f64228S0 = c7182q3;
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        AbstractC19074t.m100208f(objArr, "args");
        if (i11 == 52) {
            try {
                if (AbstractC23184q2.m119459q(this.f64231V0, i11, Arrays.copyOf(objArr, objArr.length))) {
                    finish();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        m69451mM();
    }

    /* renamed from: xM */
    public final void m69459xM(GridLayoutManager gridLayoutManager) {
        AbstractC19074t.m100208f(gridLayoutManager, "<set-?>");
        this.f64229T0 = gridLayoutManager;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: zJ */
    public void mo40210zJ(ZaloActivity zaloActivity) {
        super.mo40210zJ(zaloActivity);
        C23744a.Companion.m124119a().m124115b(this, 52);
    }
}
