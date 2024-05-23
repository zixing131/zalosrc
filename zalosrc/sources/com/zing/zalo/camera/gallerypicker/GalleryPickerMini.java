package com.zing.zalo.camera.gallerypicker;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.camera.gallerypicker.C7639a;
import com.zing.zalo.camera.gallerypicker.GalleryPickerMini;
import com.zing.zalo.data.mediapicker.model.FolderItem;
import com.zing.zalo.uicomponents.imagebutton.ActiveImageButton;
import com.zing.zalo.uicontrol.SmoothScrollLinearLayoutManager;
import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import hk.InterfaceC20079a;
import ho0.AbstractC20110a;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import p361nb.AbstractC23647d;
import p500s1.C26087b;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* loaded from: classes3.dex */
public final class GalleryPickerMini extends FrameLayout {

    /* renamed from: p */
    private final InterfaceC20079a f41272p;

    /* renamed from: q */
    private final ProgressBar f41273q;

    /* renamed from: r */
    private RecyclerView f41274r;

    /* renamed from: s */
    private C7639a f41275s;

    /* renamed from: t */
    private GalleryPickerContainer f41276t;

    /* renamed from: u */
    private int f41277u;

    /* renamed from: v */
    private final CompletableJob f41278v;

    /* renamed from: w */
    private final CoroutineScope f41279w;

    /* renamed from: com.zing.zalo.camera.gallerypicker.GalleryPickerMini$a */
    /* loaded from: classes3.dex */
    public static final class C7636a extends RecyclerView.AbstractC1892s {
        C7636a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: b */
        public void mo952b(RecyclerView recyclerView, int i11) {
            AbstractC19074t.m100208f(recyclerView, "recyclerView");
            super.mo952b(recyclerView, i11);
            try {
                if (i11 == 0) {
                    GalleryPickerMini.this.getAdapter().m39361W(false);
                    GalleryPickerMini.this.getAdapter().m10008p();
                } else {
                    GalleryPickerMini.this.getAdapter().m39361W(true);
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.camera.gallerypicker.GalleryPickerMini$b */
    /* loaded from: classes3.dex */
    public static final class C7637b extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f41281t;

        C7637b(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new C7637b(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f41281t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                GalleryPickerMini.this.f41273q.setVisibility(0);
                InterfaceC20079a interfaceC20079a = GalleryPickerMini.this.f41272p;
                SensitiveData sensitiveData = new SensitiveData("gallery_post_story", "social_timeline", null, 4, null);
                this.f41281t = 1;
                if (interfaceC20079a.mo104365p(false, sensitiveData, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C7637b) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.camera.gallerypicker.GalleryPickerMini$c */
    /* loaded from: classes3.dex */
    public static final class C7638c extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f41283t;

        /* renamed from: com.zing.zalo.camera.gallerypicker.GalleryPickerMini$c$a */
        /* loaded from: classes3.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ GalleryPickerMini f41285p;

            a(GalleryPickerMini galleryPickerMini) {
                this.f41285p = galleryPickerMini;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a */
            public final Object mo12109b(List list, Continuation continuation) {
                this.f41285p.m39342f(list);
                return C24848g0.f119245a;
            }
        }

        C7638c(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new C7638c(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f41283t;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                SharedFlow mo104360k = GalleryPickerMini.this.f41272p.mo104360k();
                a aVar = new a(GalleryPickerMini.this);
                this.f41283t = 1;
                if (mo104360k.mo97893a(aVar, this) == m142578e) {
                    return m142578e;
                }
            }
            throw new KotlinNothingValueException();
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C7638c) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GalleryPickerMini(Context context, GalleryPickerContainer galleryPickerContainer, C7639a.a aVar, int i11, int i12, InterfaceC20079a interfaceC20079a) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(galleryPickerContainer, "container");
        AbstractC19074t.m100208f(interfaceC20079a, "mediaPickerRepository");
        this.f41272p = interfaceC20079a;
        CompletableJob m112864b = SupervisorKt.m112864b(null, 1, null);
        this.f41278v = m112864b;
        this.f41279w = CoroutineScopeKt.m112637a(Dispatchers.m112681c().mo112823d0(m112864b));
        setMotionEventSplittingEnabled(false);
        int i13 = AbstractC23222t7.f112573m0;
        setBackgroundColor(0);
        this.f41276t = galleryPickerContainer;
        this.f41277u = i12;
        this.f41275s = new C7639a(aVar, i11);
        SmoothScrollLinearLayoutManager smoothScrollLinearLayoutManager = new SmoothScrollLinearLayoutManager(context, 0, false);
        smoothScrollLinearLayoutManager.m88005N2(200.0f);
        RecyclerView recyclerView = new RecyclerView(context);
        this.f41274r = recyclerView;
        recyclerView.setLayoutManager(smoothScrollLinearLayoutManager);
        this.f41274r.setAdapter(this.f41275s);
        this.f41274r.setClipToPadding(true);
        this.f41274r.setVisibility(4);
        this.f41274r.m9826E(new C7636a());
        int i14 = AbstractC23222t7.f112539R;
        ActiveImageButton activeImageButton = new ActiveImageButton(context);
        activeImageButton.setBackgroundColor(0);
        activeImageButton.setScaleType(ImageView.ScaleType.CENTER);
        activeImageButton.setImageResource(AbstractC16803z.btn_slideup);
        activeImageButton.setOnClickListener(new View.OnClickListener() { // from class: ye.d

            /* renamed from: p */
            public final /* synthetic */ int f142586p;

            /* renamed from: q */
            public final /* synthetic */ GalleryPickerMini f142587q;

            public /* synthetic */ ViewOnClickListenerC30918d(int i122, GalleryPickerMini this) {
                r1 = i122;
                r2 = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GalleryPickerMini.m39341e(r1, r2, view);
            }
        });
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2, 80);
        layoutParams.bottomMargin = AbstractC23222t7.f112562h;
        addView(this.f41274r, layoutParams);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i14, i14);
        layoutParams2.gravity = 49;
        layoutParams2.bottomMargin = i13 + AbstractC23222t7.f112552c;
        addView(activeImageButton, layoutParams2);
        ProgressBar progressBar = new ProgressBar(context);
        progressBar.setIndeterminate(true);
        progressBar.setIndeterminateDrawable(AbstractC23136l9.m118665N(context, AbstractC16803z.ic_story_loading_anim));
        this.f41273q = progressBar;
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(i14, i14, 49);
        layoutParams3.topMargin = i14;
        addView(progressBar, layoutParams3);
        m39343i();
    }

    /* renamed from: e */
    public static final void m39341e(int i11, GalleryPickerMini galleryPickerMini, View view) {
        AbstractC19074t.m100208f(galleryPickerMini, "this$0");
        if (i11 == 7) {
            try {
                AbstractC23647d.m123897g("49150073");
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
        galleryPickerMini.f41276t.m39332h(true);
    }

    /* renamed from: f */
    public final void m39342f(List list) {
        this.f41273q.setVisibility(8);
        if (!list.isEmpty()) {
            this.f41275s.m39360V(((FolderItem) list.get(0)).m41086t1());
            m39345h();
        }
    }

    public static /* synthetic */ void getCameraMode$annotations() {
    }

    /* renamed from: i */
    private final void m39343i() {
        BuildersKt__Builders_commonKt.m112540d(this.f41279w, null, null, new C7638c(null), 3, null);
    }

    /* renamed from: g */
    public final void m39344g() {
        BuildersKt__Builders_commonKt.m112540d(this.f41279w, null, null, new C7637b(null), 3, null);
    }

    public final C7639a getAdapter() {
        return this.f41275s;
    }

    public final int getCameraMode() {
        return this.f41277u;
    }

    public final GalleryPickerContainer getGalleryPickerContainer() {
        return this.f41276t;
    }

    public final RecyclerView getRecyclerView() {
        return this.f41274r;
    }

    /* renamed from: h */
    public final void m39345h() {
        RecyclerView recyclerView = this.f41274r;
        recyclerView.setVisibility(0);
        recyclerView.setAlpha(0.0f);
        recyclerView.animate().alpha(1.0f).setDuration(50L).setInterpolator(new C26087b()).start();
    }

    /* renamed from: j */
    public final void m39346j() {
        CoroutineScopeKt.m112639c(this.f41279w, null, 1, null);
    }

    public final void setAdapter(C7639a c7639a) {
        AbstractC19074t.m100208f(c7639a, "<set-?>");
        this.f41275s = c7639a;
    }

    public final void setCameraMode(int i11) {
        this.f41277u = i11;
    }

    public final void setGalleryPickerContainer(GalleryPickerContainer galleryPickerContainer) {
        AbstractC19074t.m100208f(galleryPickerContainer, "<set-?>");
        this.f41276t = galleryPickerContainer;
    }

    public final void setRecyclerView(RecyclerView recyclerView) {
        AbstractC19074t.m100208f(recyclerView, "<set-?>");
        this.f41274r = recyclerView;
    }
}
