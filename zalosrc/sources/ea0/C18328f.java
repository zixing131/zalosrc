package ea0;

import ag0.AbstractC0837p0;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.ScaleAnimation;
import androidx.recyclerview.widget.RecyclerView;
import ci.C3521p0;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.control.MediaStoreItem;
import com.zing.zalo.p077ui.searchglobal.viewholder.result.ZinstantMiniProgramViewHolder;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zinstant.zom.node.ZOM;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import dj.C17945a0;
import ea0.C18328f;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import gg0.AbstractC19444a;
import ja0.AbstractC21163i;
import ja0.AbstractC21170l0;
import ja0.C21147a;
import ja0.C21148a0;
import ja0.C21150b0;
import ja0.C21152c0;
import ja0.C21165j;
import ja0.C21167k;
import ja0.C21169l;
import ja0.C21171m;
import ja0.C21172m0;
import ja0.C21173n;
import ja0.C21175o;
import ja0.C21176o0;
import ja0.C21178p0;
import ja0.C21179q;
import ja0.C21182r0;
import ja0.C21184s0;
import ja0.C21185t;
import ja0.C21186t0;
import ja0.C21189v;
import ja0.C21191w;
import ja0.C21193x;
import ja0.C21195z;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import me0.C23212s8;
import p239ih.C20556f;
import p354n3.C23528a;
import p500s1.C26087b;
import p612wk.AbstractC29069a;
import p612wk.AbstractC29080l;

/* renamed from: ea0.f */
/* loaded from: classes6.dex */
public class C18328f extends AbstractC18313a implements InterfaceC18319c {
    public static final a Companion = new a(null);

    /* renamed from: A */
    private int f92649A;

    /* renamed from: B */
    private boolean f92650B;

    /* renamed from: C */
    private final C3521p0.c f92651C;

    /* renamed from: s */
    private InterfaceC18319c f92652s;

    /* renamed from: u */
    private AbstractC29080l f92654u;

    /* renamed from: w */
    private int f92656w;

    /* renamed from: x */
    private boolean f92657x;

    /* renamed from: y */
    private final int[] f92658y;

    /* renamed from: z */
    private final boolean[] f92659z;

    /* renamed from: t */
    private String f92653t = "";

    /* renamed from: v */
    private final C23528a f92655v = new C23528a(MainApplication.Companion.m35500c());

    /* renamed from: ea0.f$a */
    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: ea0.f$b */
    /* loaded from: classes6.dex */
    public static class b extends RecyclerView.AbstractC1876c0 {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public b(ViewGroup viewGroup) {
            super(r0);
            AbstractC19074t.m100208f(viewGroup, "parent");
            View view = new View(viewGroup.getContext());
            view.setLayoutParams(new ViewGroup.LayoutParams(-1, 1));
            view.setBackgroundColor(C23212s8.m119607o(view.getContext(), AbstractC16781w.ItemSeparatorColor));
        }
    }

    /* renamed from: ea0.f$c */
    /* loaded from: classes6.dex */
    public static class c extends RecyclerView.AbstractC1876c0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ViewGroup viewGroup) {
            super(LayoutInflater.from(viewGroup.getContext()).inflate(AbstractC7409c0.search_global_result_item_separator, viewGroup, false));
            AbstractC19074t.m100208f(viewGroup, "parent");
        }
    }

    /* renamed from: ea0.f$d */
    /* loaded from: classes6.dex */
    public static final class d implements C3521p0.c {
        d() {
        }

        /* renamed from: g */
        public static final void m97261g(C18328f c18328f, MediaStoreItem mediaStoreItem, boolean z11) {
            boolean z12;
            C17945a0 m40599m;
            AbstractC19074t.m100208f(c18328f, "this$0");
            AbstractC19074t.m100208f(mediaStoreItem, "$mediaStoreItem");
            try {
                int mo10003k = c18328f.mo10003k();
                String str = null;
                MediaStoreItem mediaStoreItem2 = null;
                int i11 = 0;
                while (true) {
                    if (i11 < mo10003k) {
                        AbstractC29069a abstractC29069a = (AbstractC29069a) c18328f.m97243M(i11);
                        if (abstractC29069a instanceof AbstractC29069a.e) {
                            mediaStoreItem2 = ((AbstractC29069a.e) abstractC29069a).m145174b();
                            if (AbstractC19074t.m100204b(mediaStoreItem2.m40571M(), mediaStoreItem.m40571M())) {
                                z12 = true;
                                break;
                            }
                        } else {
                            mediaStoreItem2 = null;
                        }
                        i11++;
                    } else {
                        z12 = false;
                        break;
                    }
                }
                if (z12) {
                    c18328f.m10014v(0, c18328f.mo10003k(), "PAYLOAD_FILE_DOWNLOAD_PROGRESS_CHANGED");
                    if (z11) {
                        if (mediaStoreItem2 != null && (m40599m = mediaStoreItem2.m40599m()) != null) {
                            str = m40599m.m94983Q3();
                        }
                        if (!TextUtils.isEmpty(str)) {
                            ToastUtils.showMess(MainApplication.Companion.m35500c().getString(AbstractC8020f0.browser_download_notification_download_complete));
                        }
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* renamed from: h */
        public static final void m97262h(C18328f c18328f, MediaStoreItem mediaStoreItem, C20556f c20556f) {
            AbstractC19074t.m100208f(c18328f, "this$0");
            AbstractC19074t.m100208f(mediaStoreItem, "$mediaStoreItem");
            AbstractC19074t.m100208f(c20556f, "$file");
            int mo10003k = c18328f.mo10003k();
            for (int i11 = 0; i11 < mo10003k; i11++) {
                AbstractC29069a abstractC29069a = (AbstractC29069a) c18328f.m97243M(i11);
                if ((abstractC29069a instanceof AbstractC29069a.e) && AbstractC19074t.m100204b(mediaStoreItem.m40571M(), ((AbstractC29069a.e) abstractC29069a).m145174b().m40571M())) {
                    AbstractC19444a.m101695c(new Runnable() { // from class: ea0.i

                        /* renamed from: q */
                        public final /* synthetic */ AbstractC29069a f92675q;

                        /* renamed from: r */
                        public final /* synthetic */ C20556f f92676r;

                        public /* synthetic */ RunnableC18336i(AbstractC29069a abstractC29069a2, C20556f c20556f2) {
                            r2 = abstractC29069a2;
                            r3 = c20556f2;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            C18328f.d.m97263i(C18328f.this, r2, r3);
                        }
                    });
                    return;
                }
            }
        }

        /* renamed from: i */
        public static final void m97263i(C18328f c18328f, AbstractC29069a abstractC29069a, C20556f c20556f) {
            AbstractC19074t.m100208f(c18328f, "this$0");
            AbstractC19074t.m100208f(abstractC29069a, "$dataItem");
            AbstractC19074t.m100208f(c20556f, "$file");
            c18328f.mo205i9(new C18316b("ACTION_OPEN_FILE", abstractC29069a, c20556f, ((AbstractC29069a.e) abstractC29069a).m145174b()));
        }

        @Override // ci.C3521p0.c
        /* renamed from: a */
        public void mo17800a(MediaStoreItem mediaStoreItem, C20556f c20556f) {
            AbstractC19074t.m100208f(mediaStoreItem, "mediaStoreItem");
            AbstractC19074t.m100208f(c20556f, "file");
            AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: ea0.h

                /* renamed from: q */
                public final /* synthetic */ MediaStoreItem f92670q;

                /* renamed from: r */
                public final /* synthetic */ C20556f f92671r;

                public /* synthetic */ RunnableC18334h(MediaStoreItem mediaStoreItem2, C20556f c20556f2) {
                    r2 = mediaStoreItem2;
                    r3 = c20556f2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C18328f.d.m97262h(C18328f.this, r2, r3);
                }
            });
        }

        @Override // ci.C3521p0.c
        /* renamed from: b */
        public void mo17801b(MediaStoreItem mediaStoreItem, boolean z11) {
            AbstractC19074t.m100208f(mediaStoreItem, "mediaStoreItem");
            AbstractC19444a.m101695c(new Runnable() { // from class: ea0.g

                /* renamed from: q */
                public final /* synthetic */ MediaStoreItem f92664q;

                /* renamed from: r */
                public final /* synthetic */ boolean f92665r;

                public /* synthetic */ RunnableC18331g(MediaStoreItem mediaStoreItem2, boolean z112) {
                    r2 = mediaStoreItem2;
                    r3 = z112;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C18328f.d.m97261g(C18328f.this, r2, r3);
                }
            });
        }

        @Override // ci.C3521p0.c
        /* renamed from: c */
        public String mo17802c() {
            return "global_search";
        }
    }

    public C18328f() {
        int i11 = this.f92656w;
        this.f92658y = new int[]{i11, i11, i11};
        boolean z11 = this.f92657x;
        this.f92659z = new boolean[]{z11, z11, z11};
        this.f92649A = -1;
        this.f92651C = new d();
    }

    /* renamed from: R */
    public static /* synthetic */ void m97253R(C18328f c18328f, List list, AbstractC29080l abstractC29080l, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 2) != 0) {
                abstractC29080l = null;
            }
            c18328f.m97256Q(list, abstractC29080l);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setData");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: A */
    public void mo9990A(RecyclerView.AbstractC1876c0 abstractC1876c0, int i11) {
        AbstractC19074t.m100208f(abstractC1876c0, "holder");
        if (abstractC1876c0 instanceof C21175o) {
            Object m97243M = m97243M(i11);
            AbstractC19074t.m100206d(m97243M, "null cannot be cast to non-null type com.zing.zalo.data.searchglobal.model.result.DataItem.Empty.NoResultBase");
            ((C21175o) abstractC1876c0).m109718i0((AbstractC29069a.d.AbstractC33038d) m97243M);
            return;
        }
        if (abstractC1876c0 instanceof C21173n) {
            ((C21173n) abstractC1876c0).m109717i0();
            return;
        }
        if (abstractC1876c0 instanceof C21150b0) {
            Object m97243M2 = m97243M(i11);
            AbstractC19074t.m100206d(m97243M2, "null cannot be cast to non-null type com.zing.zalo.data.searchglobal.model.result.DataItem.Empty");
            ((C21150b0) abstractC1876c0).m109642i0((AbstractC29069a.d) m97243M2);
            return;
        }
        if (abstractC1876c0 instanceof C21191w) {
            Object m97243M3 = m97243M(i11);
            AbstractC19074t.m100206d(m97243M3, "null cannot be cast to non-null type com.zing.zalo.data.searchglobal.model.result.DataItem.Label");
            ((C21191w) abstractC1876c0).m109748i0((AbstractC29069a.i) m97243M3);
            return;
        }
        if (abstractC1876c0 instanceof C21152c0) {
            AbstractC21170l0 abstractC21170l0 = (AbstractC21170l0) abstractC1876c0;
            Object m97243M4 = m97243M(i11);
            AbstractC19074t.m100206d(m97243M4, "null cannot be cast to non-null type com.zing.zalo.data.searchglobal.model.result.DataItem.People");
            AbstractC21170l0.m109705t0(abstractC21170l0, (AbstractC29069a.o) m97243M4, this.f92654u, this.f92658y, null, 8, null);
            return;
        }
        if (abstractC1876c0 instanceof AbstractC21163i) {
            AbstractC21163i abstractC21163i = (AbstractC21163i) abstractC1876c0;
            Object m97243M5 = m97243M(i11);
            AbstractC19074t.m100206d(m97243M5, "null cannot be cast to non-null type com.zing.zalo.data.searchglobal.model.result.DataItem.CompactMessage");
            AbstractC21163i.m109676y0(abstractC21163i, (AbstractC29069a.a) m97243M5, this.f92654u, this.f92657x, null, 8, null);
            return;
        }
        if (abstractC1876c0 instanceof C21185t) {
            Object m97243M6 = m97243M(i11);
            AbstractC19074t.m100206d(m97243M6, "null cannot be cast to non-null type com.zing.zalo.data.searchglobal.model.result.DataItem.Filter");
            ((C21185t) abstractC1876c0).m109741l0((AbstractC29069a.f) m97243M6);
            return;
        }
        if (abstractC1876c0 instanceof C21195z) {
            C21195z c21195z = (C21195z) abstractC1876c0;
            Object m97243M7 = m97243M(i11);
            AbstractC19074t.m100206d(m97243M7, "null cannot be cast to non-null type com.zing.zalo.data.searchglobal.model.result.DataItem.Message");
            C21195z.m109753m0(c21195z, (AbstractC29069a.k) m97243M7, this.f92654u, this.f92657x, null, 8, null);
            return;
        }
        if (abstractC1876c0 instanceof C21179q) {
            C21179q c21179q = (C21179q) abstractC1876c0;
            Object m97243M8 = m97243M(i11);
            AbstractC19074t.m100206d(m97243M8, "null cannot be cast to non-null type com.zing.zalo.data.searchglobal.model.result.DataItem.File");
            C21179q.m109725m0(c21179q, (AbstractC29069a.e) m97243M8, this.f92654u, this.f92657x, null, 8, null);
            return;
        }
        if (abstractC1876c0 instanceof C21193x) {
            Object m97243M9 = m97243M(i11);
            AbstractC19074t.m100206d(m97243M9, "null cannot be cast to non-null type com.zing.zalo.data.searchglobal.model.result.DataItem.Link");
            ((C21193x) abstractC1876c0).m109749i0((AbstractC29069a.j) m97243M9, this.f92654u, this.f92657x);
            return;
        }
        if (abstractC1876c0 instanceof C21182r0) {
            Object m97243M10 = m97243M(i11);
            AbstractC19074t.m100206d(m97243M10, "null cannot be cast to non-null type com.zing.zalo.data.searchglobal.model.result.DataItem.SeeMore");
            ((C21182r0) abstractC1876c0).m109733l0((AbstractC29069a.s) m97243M10);
            return;
        }
        if (abstractC1876c0 instanceof C21186t0) {
            ((C21186t0) abstractC1876c0).m109744j0((AbstractC29069a) m97243M(i11));
            return;
        }
        if (abstractC1876c0 instanceof C21171m) {
            C21171m c21171m = (C21171m) abstractC1876c0;
            Object m97243M11 = m97243M(i11);
            AbstractC19074t.m100206d(m97243M11, "null cannot be cast to non-null type com.zing.zalo.data.searchglobal.model.result.DataItem.ContactTopResults");
            C21171m.m109713k0(c21171m, (AbstractC29069a.c) m97243M11, this.f92657x, null, 4, null);
            return;
        }
        if (abstractC1876c0 instanceof C21176o0) {
            Object m97243M12 = m97243M(i11);
            AbstractC19074t.m100206d(m97243M12, "null cannot be cast to non-null type com.zing.zalo.data.searchglobal.model.result.DataItem.SearchHint");
            ((C21176o0) abstractC1876c0).m109721l0((AbstractC29069a.q) m97243M12);
            return;
        }
        if (abstractC1876c0 instanceof C21172m0) {
            ((C21172m0) abstractC1876c0).m109716i0();
            return;
        }
        if (abstractC1876c0 instanceof C21189v) {
            Object m97243M13 = m97243M(i11);
            AbstractC19074t.m100206d(m97243M13, "null cannot be cast to non-null type com.zing.zalo.data.searchglobal.model.result.DataItem.Footer");
            ((C21189v) abstractC1876c0).m109747k0((AbstractC29069a.g) m97243M13);
            return;
        }
        if (abstractC1876c0 instanceof C21184s0) {
            Object m97243M14 = m97243M(i11);
            AbstractC19074t.m100206d(m97243M14, "null cannot be cast to non-null type com.zing.zalo.data.searchglobal.model.result.DataItem.Setting");
            ((C21184s0) abstractC1876c0).m109736j0((AbstractC29069a.v) m97243M14, this.f92654u);
        } else if (abstractC1876c0 instanceof C21148a0) {
            Object m97243M15 = m97243M(i11);
            AbstractC19074t.m100206d(m97243M15, "null cannot be cast to non-null type com.zing.zalo.data.searchglobal.model.result.DataItem.MiniProgram");
            ((C21148a0) abstractC1876c0).m109641j0((AbstractC29069a.m) m97243M15, this.f92654u);
        } else if (abstractC1876c0 instanceof ZinstantMiniProgramViewHolder) {
            Object m97243M16 = m97243M(i11);
            AbstractC19074t.m100206d(m97243M16, "null cannot be cast to non-null type com.zing.zalo.data.searchglobal.model.result.DataItem.ZinstantMiniProgram");
            ((ZinstantMiniProgramViewHolder) abstractC1876c0).m73382u0((AbstractC29069a.z) m97243M16);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: B */
    public void mo9991B(RecyclerView.AbstractC1876c0 abstractC1876c0, int i11, List list) {
        AbstractC19074t.m100208f(abstractC1876c0, "holder");
        AbstractC19074t.m100208f(list, "payloads");
        if (list.isEmpty()) {
            super.mo9991B(abstractC1876c0, i11, list);
            return;
        }
        for (Object obj : list) {
            if (AbstractC19074t.m100204b(obj, "PAYLOAD_SCROLL_STATE_CHANGED")) {
                if (abstractC1876c0 instanceof C21152c0) {
                    Object m97243M = m97243M(i11);
                    AbstractC19074t.m100206d(m97243M, "null cannot be cast to non-null type com.zing.zalo.data.searchglobal.model.result.DataItem.People");
                    ((C21152c0) abstractC1876c0).m109712s0((AbstractC29069a.o) m97243M, this.f92654u, this.f92658y, "PAYLOAD_SCROLL_STATE_CHANGED");
                } else if (abstractC1876c0 instanceof AbstractC21163i) {
                    Object m97243M2 = m97243M(i11);
                    AbstractC19074t.m100206d(m97243M2, "null cannot be cast to non-null type com.zing.zalo.data.searchglobal.model.result.DataItem.CompactMessage");
                    ((AbstractC21163i) abstractC1876c0).m109679x0((AbstractC29069a.a) m97243M2, this.f92654u, this.f92657x, "PAYLOAD_SCROLL_STATE_CHANGED");
                } else if (abstractC1876c0 instanceof C21195z) {
                    Object m97243M3 = m97243M(i11);
                    AbstractC19074t.m100206d(m97243M3, "null cannot be cast to non-null type com.zing.zalo.data.searchglobal.model.result.DataItem.Message");
                    ((C21195z) abstractC1876c0).m109757l0((AbstractC29069a.k) m97243M3, this.f92654u, this.f92657x, "PAYLOAD_SCROLL_STATE_CHANGED");
                } else if (abstractC1876c0 instanceof C21171m) {
                    Object m97243M4 = m97243M(i11);
                    AbstractC19074t.m100206d(m97243M4, "null cannot be cast to non-null type com.zing.zalo.data.searchglobal.model.result.DataItem.ContactTopResults");
                    ((C21171m) abstractC1876c0).m109714j0((AbstractC29069a.c) m97243M4, this.f92657x, "PAYLOAD_SCROLL_STATE_CHANGED");
                } else if (abstractC1876c0 instanceof C21179q) {
                    Object m97243M5 = m97243M(i11);
                    AbstractC19074t.m100206d(m97243M5, "null cannot be cast to non-null type com.zing.zalo.data.searchglobal.model.result.DataItem.File");
                    ((C21179q) abstractC1876c0).m109728k0((AbstractC29069a.e) m97243M5, this.f92654u, this.f92657x, "PAYLOAD_SCROLL_STATE_CHANGED");
                }
            } else if (AbstractC19074t.m100204b(obj, "PAYLOAD_FILE_DOWNLOAD_PROGRESS_CHANGED")) {
                if (abstractC1876c0 instanceof C21179q) {
                    Object m97243M6 = m97243M(i11);
                    AbstractC19074t.m100206d(m97243M6, "null cannot be cast to non-null type com.zing.zalo.data.searchglobal.model.result.DataItem.File");
                    C21179q.m109725m0((C21179q) abstractC1876c0, (AbstractC29069a.e) m97243M6, this.f92654u, this.f92657x, null, 8, null);
                }
            } else if (AbstractC19074t.m100204b(obj, "PAYLOAD_SCROLL_PLAY_VISUAL_EFFECT")) {
                ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.85f, 1.0f, 0.85f, 1, 0.5f, 1, 0.5f);
                scaleAnimation.setRepeatMode(2);
                scaleAnimation.setRepeatCount(1);
                scaleAnimation.setDuration(300L);
                scaleAnimation.setInterpolator(new C26087b());
                abstractC1876c0.f7784p.startAnimation(scaleAnimation);
            } else if (AbstractC19074t.m100204b(obj, "UserStoryChanged") && (abstractC1876c0 instanceof C21152c0)) {
                Object m97243M7 = m97243M(i11);
                AbstractC19074t.m100206d(m97243M7, "null cannot be cast to non-null type com.zing.zalo.data.searchglobal.model.result.DataItem.People");
                ((C21152c0) abstractC1876c0).m109712s0((AbstractC29069a.o) m97243M7, this.f92654u, this.f92658y, obj);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: C */
    public RecyclerView.AbstractC1876c0 mo9992C(ViewGroup viewGroup, int i11) {
        AbstractC19074t.m100208f(viewGroup, "parent");
        if (i11 != 20) {
            if (i11 != 22) {
                switch (i11) {
                    case 0:
                        return new C21172m0(viewGroup);
                    case 1:
                        return new C21191w(viewGroup, this);
                    case 2:
                        return new C21175o(viewGroup, this);
                    case 3:
                        return new C21173n(viewGroup, this);
                    case 4:
                        return new c(viewGroup);
                    case 5:
                        return new C21182r0(viewGroup, this);
                    case 6:
                        return new b(viewGroup);
                    case 7:
                        return new C21176o0(viewGroup, this);
                    case 8:
                        return new C21150b0(viewGroup, this);
                    case 9:
                        return new C21189v(viewGroup, this);
                    case 10:
                        return new C21152c0(viewGroup, this.f92655v, this);
                    default:
                        switch (i11) {
                            case 24:
                                return new C21193x(viewGroup, false, this);
                            case 25:
                                return new C21186t0(viewGroup);
                            case 26:
                                return new C21171m(viewGroup, this.f92655v, this);
                            case 27:
                                return new C21184s0(viewGroup, this);
                            case 28:
                                return new C21148a0(viewGroup, this);
                            case 29:
                                return new C21185t(viewGroup, this);
                            case ZVideoUtilMetadata.FF_PROFILE_H264_LEVEL_30 /* 30 */:
                                return new C21147a(viewGroup, this.f92655v, this);
                            case 31:
                                return new C21165j(viewGroup, this.f92655v, this);
                            case ZOM.FLAG_RELATIVE_VISIBILITY_CHANGED /* 32 */:
                                return new C21169l(viewGroup, this.f92655v, this);
                            case 33:
                                return new C21167k(viewGroup, this.f92655v, this);
                            case 34:
                                return new C21178p0(viewGroup);
                            case 35:
                                return new ZinstantMiniProgramViewHolder(viewGroup, this);
                            default:
                                throw new IllegalArgumentException("Could not create ViewHolder that represents viewType " + i11);
                        }
                }
            }
            return new C21179q(viewGroup, this);
        }
        return new C21195z(viewGroup, this.f92655v, this);
    }

    @Override // en0.InterfaceC18505l
    /* renamed from: O */
    public C18316b mo205i9(C18316b c18316b) {
        AbstractC19074t.m100208f(c18316b, "action");
        String m97246b = c18316b.m97246b();
        switch (m97246b.hashCode()) {
            case -960520838:
                if (m97246b.equals("Search.Result.GetUidShowChat")) {
                    return new C18316b("Search.Result.GetUidShowChat", this.f92653t, null, null, 12, null);
                }
                break;
            case 338356488:
                if (m97246b.equals("ACTION_CLICK_ITEM_FILE")) {
                    if (!(c18316b.m97245a() instanceof AbstractC29069a.e) || !(c18316b.m97247c() instanceof Boolean) || !(c18316b.m97248d() instanceof Integer)) {
                        return null;
                    }
                    ((AbstractC29069a.e) c18316b.m97245a()).m145174b().m40595j(true, false, this.f92651C);
                    InterfaceC18319c interfaceC18319c = this.f92652s;
                    if (interfaceC18319c == null) {
                        return null;
                    }
                    return null;
                }
                break;
            case 582004170:
                if (m97246b.equals("ACTION_GET_IS_HANDLING_CLICK_FILE")) {
                    return new C18316b("ACTION_GET_IS_HANDLING_CLICK_FILE", Boolean.valueOf(this.f92650B), null, null, 12, null);
                }
                break;
            case 954241854:
                if (m97246b.equals("ACTION_SET_IS_HANDLING_CLICK_FILE")) {
                    if (!(c18316b.m97245a() instanceof Boolean)) {
                        return null;
                    }
                    this.f92650B = ((Boolean) c18316b.m97245a()).booleanValue();
                    return null;
                }
                break;
        }
        InterfaceC18319c interfaceC18319c2 = this.f92652s;
        if (interfaceC18319c2 == null) {
            return null;
        }
        return (C18316b) interfaceC18319c2.mo205i9(c18316b);
    }

    /* renamed from: P */
    public final void m97255P(InterfaceC18319c interfaceC18319c) {
        this.f92652s = interfaceC18319c;
    }

    /* renamed from: Q */
    public final void m97256Q(List list, AbstractC29080l abstractC29080l) {
        AbstractC19074t.m100208f(list, "data");
        this.f92654u = abstractC29080l;
        m97244N(list);
    }

    /* renamed from: S */
    public final void m97257S(int i11) {
        boolean z11;
        boolean z12;
        boolean z13;
        if (this.f92656w != i11) {
            this.f92656w = i11;
            boolean z14 = true;
            if (i11 != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f92657x = z11;
            int[] iArr = this.f92658y;
            int i12 = iArr[1];
            iArr[2] = i12;
            int i13 = iArr[0];
            iArr[1] = i13;
            iArr[0] = i11;
            boolean[] zArr = this.f92659z;
            if (i11 != 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            zArr[0] = z12;
            if (i13 != 0) {
                z13 = true;
            } else {
                z13 = false;
            }
            zArr[1] = z13;
            if (i12 == 0) {
                z14 = false;
            }
            zArr[2] = z14;
            m10014v(0, mo10003k(), "PAYLOAD_SCROLL_STATE_CHANGED");
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: m */
    public int mo10005m(int i11) {
        AbstractC29069a abstractC29069a = (AbstractC29069a) m97243M(i11);
        if (abstractC29069a instanceof AbstractC29069a.d.AbstractC33038d) {
            return 2;
        }
        if (abstractC29069a instanceof AbstractC29069a.d.b) {
            return 3;
        }
        if (abstractC29069a instanceof AbstractC29069a.i) {
            return 1;
        }
        if (abstractC29069a instanceof AbstractC29069a.o) {
            return 10;
        }
        if (abstractC29069a instanceof AbstractC29069a.f) {
            return 29;
        }
        if (abstractC29069a instanceof AbstractC29069a.a) {
            AbstractC29069a.a aVar = (AbstractC29069a.a) abstractC29069a;
            if (aVar.m145142f().m18034a() != null && aVar.m145142f().m18035b() != null) {
                return 30;
            }
            if (aVar.m145142f().m18034a() != null) {
                return 33;
            }
            if (aVar.m145142f().m18035b() != null) {
                return 32;
            }
            return 31;
        }
        if (abstractC29069a instanceof AbstractC29069a.k) {
            return 20;
        }
        if (abstractC29069a instanceof AbstractC29069a.e) {
            return 22;
        }
        if (abstractC29069a instanceof AbstractC29069a.j) {
            return 24;
        }
        if ((abstractC29069a instanceof AbstractC29069a.t) || (abstractC29069a instanceof AbstractC29069a.u)) {
            return 4;
        }
        if (abstractC29069a instanceof AbstractC29069a.s) {
            return 5;
        }
        if (abstractC29069a instanceof AbstractC29069a.x) {
            return 25;
        }
        if (abstractC29069a instanceof AbstractC29069a.c) {
            return 26;
        }
        if (abstractC29069a instanceof AbstractC29069a.q) {
            return 7;
        }
        if (abstractC29069a instanceof AbstractC29069a.g) {
            return 9;
        }
        if (abstractC29069a instanceof AbstractC29069a.v) {
            return 27;
        }
        if (abstractC29069a instanceof AbstractC29069a.n) {
            return 28;
        }
        if (abstractC29069a instanceof AbstractC29069a.z) {
            return 35;
        }
        if (abstractC29069a instanceof AbstractC29069a.r) {
            return 34;
        }
        throw new NoWhenBranchMatchedException();
    }
}
