package z10;

import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.AbstractC2144f;
import com.zing.zalo.shortvideo.data.model.BreakSlot;
import com.zing.zalo.shortvideo.data.model.Channel;
import com.zing.zalo.shortvideo.data.model.LivestreamData;
import com.zing.zalo.shortvideo.data.model.LoadMoreInfo;
import com.zing.zalo.shortvideo.data.model.Section;
import com.zing.zalo.shortvideo.data.model.SectionBoxData;
import com.zing.zalo.shortvideo.data.model.VideoAdsData;
import com.zing.zalo.shortvideo.p072ui.component.p073rv.item.AdvertisingVideoItem;
import com.zing.zalo.shortvideo.p072ui.component.p073rv.item.FollowSuggestionItem;
import com.zing.zalo.shortvideo.p072ui.component.p073rv.item.NormalVideoItem;
import com.zing.zalo.shortvideo.p072ui.component.p073rv.item.OnboardingVideoItem;
import com.zing.zalo.shortvideo.p072ui.component.p073rv.item.ShimmerVideoItem;
import com.zing.zalo.shortvideo.p072ui.component.p073rv.item.SimpleLivestreamItem;
import com.zing.zalo.shortvideo.p072ui.component.p073rv.item.SurveyVideoItem;
import com.zing.zalo.shortvideo.p072ui.component.p073rv.item.VideoItem;
import com.zing.zalo.shortvideo.p072ui.model.Video;
import com.zing.zalo.shortvideo.p072ui.model.VideoAdsInfo;
import com.zing.zalo.shortvideo.p072ui.model.VideoLabel;
import com.zing.zalocore.CoreUtility;
import e10.C18168e;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import g20.C19205a;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ln0.C22537f;
import pm0.AbstractC24866w;
import qm0.AbstractC25332a0;
import qm0.AbstractC25361o0;
import qm0.AbstractC25363p0;
import qm0.AbstractC25366r;
import qm0.AbstractC25368s;
import qm0.AbstractC25370t;
import qm0.AbstractC25378x;
import s20.AbstractC26112n;
import v00.AbstractC27410e;
import v00.AbstractC27413h;

/* renamed from: z10.n0 */
/* loaded from: classes5.dex */
public final class C31179n0 extends AbstractC31153a0 {
    public static final c Companion = new c(null);

    /* renamed from: A */
    private ArrayList f143911A;

    /* renamed from: B */
    private ArrayList f143912B;

    /* renamed from: C */
    private HashMap f143913C;

    /* renamed from: D */
    private HashMap f143914D;

    /* renamed from: E */
    private HashMap f143915E;

    /* renamed from: F */
    private int f143916F;

    /* renamed from: G */
    private final ArrayList f143917G;

    /* renamed from: u */
    private final String f143918u;

    /* renamed from: v */
    private Section f143919v;

    /* renamed from: w */
    private b f143920w;

    /* renamed from: x */
    private List f143921x;

    /* renamed from: y */
    private LoadMoreInfo f143922y;

    /* renamed from: z */
    private List f143923z;

    /* renamed from: z10.n0$a */
    /* loaded from: classes5.dex */
    public class a extends RecyclerView.AbstractC1876c0 {

        /* renamed from: I */
        final /* synthetic */ C31179n0 f143924I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C31179n0 c31179n0, View view) {
            super(view);
            AbstractC19074t.m100208f(view, "view");
            this.f143924I = c31179n0;
        }

        /* renamed from: i0 */
        public void mo151882i0(Object obj) {
            AbstractC19074t.m100208f(obj, "data");
        }

        /* renamed from: j0 */
        public void mo151883j0(Object obj, List list) {
            AbstractC19074t.m100208f(obj, "data");
            AbstractC19074t.m100208f(list, "payloads");
        }
    }

    /* renamed from: z10.n0$b */
    /* loaded from: classes5.dex */
    public interface b {

        /* renamed from: z10.n0$b$a */
        /* loaded from: classes5.dex */
        public static final class a {
            /* renamed from: a */
            public static /* synthetic */ void m151884a(b bVar, Channel channel, LivestreamData livestreamData, String str, int i11, Object obj) {
                if (obj == null) {
                    if ((i11 & 4) != 0) {
                        str = null;
                    }
                    bVar.mo55491i(channel, livestreamData, str);
                    return;
                }
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onRequestChannel");
            }

            /* renamed from: b */
            public static /* synthetic */ void m151885b(b bVar, Channel channel, Video video, String str, int i11, Object obj) {
                if (obj == null) {
                    if ((i11 & 4) != 0) {
                        str = null;
                    }
                    bVar.mo55501s(channel, video, str);
                    return;
                }
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onRequestChannel");
            }

            /* renamed from: c */
            public static /* synthetic */ void m151886c(b bVar, Video video, int i11, int i12, Object obj) {
                if (obj == null) {
                    if ((i12 & 2) != 0) {
                        i11 = 0;
                    }
                    bVar.mo55500r(video, i11);
                    return;
                }
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onRequestComment");
            }
        }

        /* renamed from: A */
        void mo55477A(SimpleLivestreamItem simpleLivestreamItem, LivestreamData livestreamData);

        /* renamed from: B */
        void mo55478B(Video video);

        /* renamed from: C */
        void mo55479C(Video video);

        /* renamed from: D */
        boolean mo55480D(Video video, boolean z11, boolean z12);

        /* renamed from: E */
        void mo55481E(Video video);

        /* renamed from: F */
        void mo55482F();

        /* renamed from: a */
        void mo55483a(LoadMoreInfo loadMoreInfo);

        /* renamed from: b */
        void mo55484b(String str, Video video);

        /* renamed from: c */
        void mo55485c(Video video);

        /* renamed from: d */
        void mo55486d(Video video);

        /* renamed from: e */
        void mo55487e(LoadMoreInfo loadMoreInfo);

        /* renamed from: f */
        void mo55488f(String str);

        /* renamed from: g */
        void mo55489g(Video video, boolean z11);

        /* renamed from: h */
        void mo55490h(Video video);

        /* renamed from: i */
        void mo55491i(Channel channel, LivestreamData livestreamData, String str);

        /* renamed from: j */
        void mo55492j(BreakSlot breakSlot);

        /* renamed from: k */
        void mo55493k(Video video, boolean z11);

        /* renamed from: l */
        void mo55494l(Channel channel, String str);

        /* renamed from: m */
        void mo55495m(int i11, Channel channel, boolean z11, boolean z12, Video video);

        /* renamed from: n */
        void mo55496n(String str, Video video);

        /* renamed from: o */
        void mo55497o(BreakSlot breakSlot);

        /* renamed from: p */
        void mo55498p(Video video, String str);

        /* renamed from: q */
        void mo55499q(int i11, Channel channel, boolean z11, LivestreamData livestreamData);

        /* renamed from: r */
        void mo55500r(Video video, int i11);

        /* renamed from: s */
        void mo55501s(Channel channel, Video video, String str);

        /* renamed from: t */
        void mo55502t(Video video);

        /* renamed from: u */
        void mo55503u(Channel channel, boolean z11);

        /* renamed from: v */
        void mo55504v();

        /* renamed from: w */
        void mo55505w(Video video, boolean z11);

        /* renamed from: x */
        void mo55506x(Video video);

        /* renamed from: y */
        void mo55507y(Video video, boolean z11, boolean z12);

        /* renamed from: z */
        void mo55508z(Video video, VideoLabel videoLabel);
    }

    /* renamed from: z10.n0$c */
    /* loaded from: classes5.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final int m151887a(int i11) {
            int i12 = 1;
            if (i11 != 1) {
                i12 = 2;
                if (i11 != 2) {
                    i12 = 3;
                    if (i11 != 3) {
                        throw new IllegalArgumentException();
                    }
                }
            }
            return i12;
        }
    }

    /* renamed from: z10.n0$d */
    /* loaded from: classes5.dex */
    public static final class d {

        /* renamed from: a */
        private boolean f143925a;

        /* renamed from: b */
        private boolean f143926b;

        public d(boolean z11, boolean z12) {
            this.f143925a = z11;
            this.f143926b = z12;
        }

        /* renamed from: a */
        public final boolean m151888a() {
            return this.f143926b;
        }

        /* renamed from: b */
        public final boolean m151889b() {
            return this.f143925a;
        }

        /* renamed from: c */
        public final void m151890c(boolean z11) {
            this.f143926b = z11;
        }

        /* renamed from: d */
        public final void m151891d(boolean z11) {
            this.f143925a = z11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f143925a == dVar.f143925a && this.f143926b == dVar.f143926b;
        }

        public int hashCode() {
            return (AbstractC2144f.m11520a(this.f143925a) * 31) + AbstractC2144f.m11520a(this.f143926b);
        }

        public String toString() {
            return "ExtraVideoInfo(isFollowSuggested=" + this.f143925a + ", isFollowStrongSuggested=" + this.f143926b + ")";
        }

        public /* synthetic */ d(boolean z11, boolean z12, int i11, AbstractC19060k abstractC19060k) {
            this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? false : z12);
        }
    }

    /* renamed from: z10.n0$e */
    /* loaded from: classes5.dex */
    public final class e extends a {

        /* renamed from: J */
        private final FollowSuggestionItem f143927J;

        /* renamed from: K */
        final /* synthetic */ C31179n0 f143928K;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C31179n0 c31179n0, FollowSuggestionItem followSuggestionItem) {
            super(c31179n0, followSuggestionItem);
            AbstractC19074t.m100208f(followSuggestionItem, "view");
            this.f143928K = c31179n0;
            this.f143927J = followSuggestionItem;
        }

        @Override // z10.C31179n0.a
        /* renamed from: i0 */
        public void mo151882i0(Object obj) {
            AbstractC19074t.m100208f(obj, "data");
            this.f143927J.m52127h((BreakSlot) obj);
        }

        @Override // z10.C31179n0.a
        /* renamed from: j0 */
        public void mo151883j0(Object obj, List list) {
            AbstractC19074t.m100208f(obj, "data");
            AbstractC19074t.m100208f(list, "payloads");
            this.f143927J.m52128l((BreakSlot) obj, list);
        }

        /* renamed from: k0 */
        public final FollowSuggestionItem m151892k0() {
            return this.f143927J;
        }
    }

    /* renamed from: z10.n0$f */
    /* loaded from: classes5.dex */
    public final class f extends a {

        /* renamed from: J */
        private final OnboardingVideoItem f143929J;

        /* renamed from: K */
        final /* synthetic */ C31179n0 f143930K;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(C31179n0 c31179n0, OnboardingVideoItem onboardingVideoItem) {
            super(c31179n0, onboardingVideoItem);
            AbstractC19074t.m100208f(onboardingVideoItem, "view");
            this.f143930K = c31179n0;
            this.f143929J = onboardingVideoItem;
        }

        @Override // z10.C31179n0.a
        /* renamed from: i0 */
        public void mo151882i0(Object obj) {
            AbstractC19074t.m100208f(obj, "data");
            this.f143929J.m52332a((BreakSlot) obj);
        }

        /* renamed from: k0 */
        public final OnboardingVideoItem m151893k0() {
            return this.f143929J;
        }
    }

    /* renamed from: z10.n0$g */
    /* loaded from: classes5.dex */
    public final class g extends a {

        /* renamed from: J */
        private final ShimmerVideoItem f143931J;

        /* renamed from: K */
        final /* synthetic */ C31179n0 f143932K;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(C31179n0 c31179n0, ShimmerVideoItem shimmerVideoItem) {
            super(c31179n0, shimmerVideoItem);
            AbstractC19074t.m100208f(shimmerVideoItem, "view");
            this.f143932K = c31179n0;
            this.f143931J = shimmerVideoItem;
        }
    }

    /* renamed from: z10.n0$h */
    /* loaded from: classes5.dex */
    public final class h extends a {

        /* renamed from: J */
        private final SimpleLivestreamItem f143933J;

        /* renamed from: K */
        final /* synthetic */ C31179n0 f143934K;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(C31179n0 c31179n0, SimpleLivestreamItem simpleLivestreamItem) {
            super(c31179n0, simpleLivestreamItem);
            AbstractC19074t.m100208f(simpleLivestreamItem, "view");
            this.f143934K = c31179n0;
            this.f143933J = simpleLivestreamItem;
        }

        @Override // z10.C31179n0.a
        /* renamed from: i0 */
        public void mo151882i0(Object obj) {
            AbstractC19074t.m100208f(obj, "data");
            this.f143933J.m52360b((LivestreamData) obj);
        }

        @Override // z10.C31179n0.a
        /* renamed from: j0 */
        public void mo151883j0(Object obj, List list) {
            AbstractC19074t.m100208f(obj, "data");
            AbstractC19074t.m100208f(list, "payloads");
            this.f143933J.m52361c((LivestreamData) obj, list);
        }

        /* renamed from: k0 */
        public final SimpleLivestreamItem m151894k0() {
            return this.f143933J;
        }
    }

    /* renamed from: z10.n0$i */
    /* loaded from: classes5.dex */
    public final class i extends a {

        /* renamed from: J */
        private final SurveyVideoItem f143935J;

        /* renamed from: K */
        final /* synthetic */ C31179n0 f143936K;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(C31179n0 c31179n0, SurveyVideoItem surveyVideoItem) {
            super(c31179n0, surveyVideoItem);
            AbstractC19074t.m100208f(surveyVideoItem, "view");
            this.f143936K = c31179n0;
            this.f143935J = surveyVideoItem;
        }

        @Override // z10.C31179n0.a
        /* renamed from: i0 */
        public void mo151882i0(Object obj) {
            AbstractC19074t.m100208f(obj, "data");
            this.f143935J.m52383b((BreakSlot) obj);
        }

        /* renamed from: k0 */
        public final SurveyVideoItem m151895k0() {
            return this.f143935J;
        }
    }

    /* renamed from: z10.n0$j */
    /* loaded from: classes5.dex */
    public final class j extends a {

        /* renamed from: J */
        private final AdvertisingVideoItem f143937J;

        /* renamed from: K */
        final /* synthetic */ C31179n0 f143938K;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(C31179n0 c31179n0, AdvertisingVideoItem advertisingVideoItem) {
            super(c31179n0, advertisingVideoItem);
            AbstractC19074t.m100208f(advertisingVideoItem, "view");
            this.f143938K = c31179n0;
            this.f143937J = advertisingVideoItem;
        }

        @Override // z10.C31179n0.a
        /* renamed from: i0 */
        public void mo151882i0(Object obj) {
            AbstractC19074t.m100208f(obj, "data");
            VideoItem.m52415n(this.f143937J, (Video) obj, this.f143938K.m151863d0(), null, false, 8, null);
        }

        @Override // z10.C31179n0.a
        /* renamed from: j0 */
        public void mo151883j0(Object obj, List list) {
            AbstractC19074t.m100208f(obj, "data");
            AbstractC19074t.m100208f(list, "payloads");
            this.f143937J.mo52026q((Video) obj, list, this.f143938K.m151863d0(), null);
        }

        /* renamed from: k0 */
        public final AdvertisingVideoItem m151896k0() {
            return this.f143937J;
        }
    }

    /* renamed from: z10.n0$k */
    /* loaded from: classes5.dex */
    public final class k extends a {

        /* renamed from: J */
        private final NormalVideoItem f143939J;

        /* renamed from: K */
        final /* synthetic */ C31179n0 f143940K;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(C31179n0 c31179n0, NormalVideoItem normalVideoItem) {
            super(c31179n0, normalVideoItem);
            AbstractC19074t.m100208f(normalVideoItem, "view");
            this.f143940K = c31179n0;
            this.f143939J = normalVideoItem;
        }

        @Override // z10.C31179n0.a
        /* renamed from: i0 */
        public void mo151882i0(Object obj) {
            AbstractC19074t.m100208f(obj, "data");
            Video video = (Video) obj;
            VideoItem.m52415n(this.f143939J, video, this.f143940K.m151863d0(), (d) this.f143940K.f143913C.get(video.m52911t()), false, 8, null);
        }

        @Override // z10.C31179n0.a
        /* renamed from: j0 */
        public void mo151883j0(Object obj, List list) {
            AbstractC19074t.m100208f(obj, "data");
            AbstractC19074t.m100208f(list, "payloads");
            Video video = (Video) obj;
            this.f143939J.mo52026q(video, list, this.f143940K.m151863d0(), (d) this.f143940K.f143913C.get(video.m52911t()));
        }

        /* renamed from: k0 */
        public final NormalVideoItem m151897k0() {
            return this.f143939J;
        }
    }

    /* renamed from: z10.n0$l */
    /* loaded from: classes5.dex */
    public static final class l extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final l f143941q = new l();

        l() {
            super(1);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a */
        public final String mo205i9(Video video) {
            AbstractC19074t.m100208f(video, "video");
            return video.m52911t();
        }
    }

    /* renamed from: z10.n0$m */
    /* loaded from: classes5.dex */
    public static final class m implements FollowSuggestionItem.InterfaceC9589a {
        m() {
        }

        @Override // com.zing.zalo.shortvideo.p072ui.component.p073rv.item.FollowSuggestionItem.InterfaceC9589a
        /* renamed from: a */
        public void mo52130a(Channel channel, boolean z11) {
            AbstractC19074t.m100208f(channel, "channel");
            b m151861b0 = C31179n0.this.m151861b0();
            if (m151861b0 != null) {
                m151861b0.mo55503u(channel, z11);
            }
        }

        @Override // com.zing.zalo.shortvideo.p072ui.component.p073rv.item.FollowSuggestionItem.InterfaceC9589a
        /* renamed from: b */
        public void mo52131b(Channel channel, String str) {
            AbstractC19074t.m100208f(channel, "channel");
            b m151861b0 = C31179n0.this.m151861b0();
            if (m151861b0 != null) {
                m151861b0.mo55494l(channel, str);
            }
        }
    }

    /* renamed from: z10.n0$n */
    /* loaded from: classes5.dex */
    public static final class n implements OnboardingVideoItem.InterfaceC9649a {

        /* renamed from: a */
        final /* synthetic */ f f143943a;

        /* renamed from: b */
        final /* synthetic */ C31179n0 f143944b;

        n(f fVar, C31179n0 c31179n0) {
            this.f143943a = fVar;
            this.f143944b = c31179n0;
        }

        @Override // com.zing.zalo.shortvideo.p072ui.component.p073rv.item.OnboardingVideoItem.InterfaceC9649a
        /* renamed from: a */
        public void mo52333a() {
            b m151861b0;
            Integer valueOf = Integer.valueOf(this.f143943a.m9929A());
            Object obj = null;
            if (valueOf.intValue() < 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                Object obj2 = this.f143944b.f143912B.get(valueOf.intValue());
                if (obj2 instanceof BreakSlot) {
                    obj = obj2;
                }
                BreakSlot breakSlot = (BreakSlot) obj;
                if (breakSlot != null && (m151861b0 = this.f143944b.m151861b0()) != null) {
                    m151861b0.mo55492j(breakSlot);
                }
            }
        }
    }

    /* renamed from: z10.n0$o */
    /* loaded from: classes5.dex */
    public static final class o implements SurveyVideoItem.InterfaceC9667a {

        /* renamed from: a */
        final /* synthetic */ i f143945a;

        /* renamed from: b */
        final /* synthetic */ C31179n0 f143946b;

        o(i iVar, C31179n0 c31179n0) {
            this.f143945a = iVar;
            this.f143946b = c31179n0;
        }

        @Override // com.zing.zalo.shortvideo.p072ui.component.p073rv.item.SurveyVideoItem.InterfaceC9667a
        /* renamed from: a */
        public void mo52384a() {
            b m151861b0;
            Integer valueOf = Integer.valueOf(this.f143945a.m9929A());
            Object obj = null;
            if (valueOf.intValue() < 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                Object obj2 = this.f143946b.f143912B.get(valueOf.intValue());
                if (obj2 instanceof BreakSlot) {
                    obj = obj2;
                }
                BreakSlot breakSlot = (BreakSlot) obj;
                if (breakSlot != null && (m151861b0 = this.f143946b.m151861b0()) != null) {
                    m151861b0.mo55497o(breakSlot);
                }
            }
        }
    }

    /* renamed from: z10.n0$p */
    /* loaded from: classes5.dex */
    public static final class p implements AdvertisingVideoItem.InterfaceC9547a {

        /* renamed from: a */
        final /* synthetic */ j f143947a;

        /* renamed from: b */
        final /* synthetic */ C31179n0 f143948b;

        p(j jVar, C31179n0 c31179n0) {
            this.f143947a = jVar;
            this.f143948b = c31179n0;
        }

        @Override // com.zing.zalo.shortvideo.p072ui.component.p073rv.item.AdvertisingVideoItem.InterfaceC9547a
        /* renamed from: a */
        public void mo52029a() {
            b m151861b0;
            Integer valueOf = Integer.valueOf(this.f143947a.m9929A());
            Object obj = null;
            if (valueOf.intValue() < 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                Object obj2 = this.f143948b.f143912B.get(valueOf.intValue());
                if (obj2 instanceof Video) {
                    obj = obj2;
                }
                Video video = (Video) obj;
                if (video != null && (m151861b0 = this.f143948b.m151861b0()) != null) {
                    m151861b0.mo55490h(video);
                }
            }
        }

        @Override // com.zing.zalo.shortvideo.p072ui.component.p073rv.item.VideoItem.InterfaceC9673a
        /* renamed from: b */
        public void mo52437b(boolean z11) {
            b m151861b0;
            Integer valueOf = Integer.valueOf(this.f143947a.m9929A());
            Object obj = null;
            if (valueOf.intValue() < 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                Object obj2 = this.f143948b.f143912B.get(valueOf.intValue());
                if (obj2 instanceof Video) {
                    obj = obj2;
                }
                Video video = (Video) obj;
                if (video != null && (m151861b0 = this.f143948b.m151861b0()) != null) {
                    m151861b0.mo55493k(video, z11);
                }
            }
        }

        @Override // com.zing.zalo.shortvideo.p072ui.component.p073rv.item.AdvertisingVideoItem.InterfaceC9547a
        /* renamed from: c */
        public void mo52030c(boolean z11) {
            b m151861b0;
            Integer valueOf = Integer.valueOf(this.f143947a.m9929A());
            Object obj = null;
            if (valueOf.intValue() < 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                Object obj2 = this.f143948b.f143912B.get(valueOf.intValue());
                if (obj2 instanceof Video) {
                    obj = obj2;
                }
                Video video = (Video) obj;
                if (video != null && (m151861b0 = this.f143948b.m151861b0()) != null) {
                    m151861b0.mo55489g(video, z11);
                }
            }
        }

        @Override // com.zing.zalo.shortvideo.p072ui.component.p073rv.item.VideoItem.InterfaceC9673a
        /* renamed from: d */
        public void mo52438d() {
            String advertisingLink;
            b m151861b0;
            Integer valueOf = Integer.valueOf(this.f143947a.m9929A());
            Object obj = null;
            if (valueOf.intValue() < 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                Object obj2 = this.f143948b.f143912B.get(valueOf.intValue());
                if (obj2 instanceof Video) {
                    obj = obj2;
                }
                Video video = (Video) obj;
                if (video != null && (advertisingLink = this.f143947a.m151896k0().getAdvertisingLink()) != null && (m151861b0 = this.f143948b.m151861b0()) != null) {
                    m151861b0.mo55501s(video.m52887f(), video, advertisingLink);
                }
            }
        }

        @Override // com.zing.zalo.shortvideo.p072ui.component.p073rv.item.VideoItem.InterfaceC9673a
        /* renamed from: e */
        public void mo52439e() {
            b m151861b0;
            Integer valueOf = Integer.valueOf(this.f143947a.m9929A());
            if (valueOf.intValue() < 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                Object obj = this.f143948b.f143912B.get(valueOf.intValue());
                if (!(obj instanceof Video)) {
                    obj = null;
                }
                Video video = (Video) obj;
                if (video != null && (m151861b0 = this.f143948b.m151861b0()) != null) {
                    b.a.m151886c(m151861b0, video, 0, 2, null);
                }
            }
        }

        @Override // com.zing.zalo.shortvideo.p072ui.component.p073rv.item.VideoItem.InterfaceC9673a
        /* renamed from: f */
        public void mo52440f() {
            b m151861b0;
            Integer valueOf = Integer.valueOf(this.f143947a.m9929A());
            Object obj = null;
            if (valueOf.intValue() < 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                Object obj2 = this.f143948b.f143912B.get(valueOf.intValue());
                if (obj2 instanceof Video) {
                    obj = obj2;
                }
                Video video = (Video) obj;
                if (video != null && (m151861b0 = this.f143948b.m151861b0()) != null) {
                    m151861b0.mo55485c(video);
                }
            }
        }

        @Override // com.zing.zalo.shortvideo.p072ui.component.p073rv.item.VideoItem.InterfaceC9673a
        /* renamed from: g */
        public void mo52441g(String str) {
            b m151861b0;
            AbstractC19074t.m100208f(str, "hashtag");
            Integer valueOf = Integer.valueOf(this.f143947a.m9929A());
            Object obj = null;
            if (valueOf.intValue() < 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                Object obj2 = this.f143948b.f143912B.get(valueOf.intValue());
                if (obj2 instanceof Video) {
                    obj = obj2;
                }
                Video video = (Video) obj;
                if (video != null && (m151861b0 = this.f143948b.m151861b0()) != null) {
                    m151861b0.mo55484b(str, video);
                }
            }
        }

        @Override // com.zing.zalo.shortvideo.p072ui.component.p073rv.item.VideoItem.InterfaceC9673a
        /* renamed from: i */
        public void mo52442i() {
        }

        @Override // com.zing.zalo.shortvideo.p072ui.component.p073rv.item.AdvertisingVideoItem.InterfaceC9547a
        /* renamed from: j */
        public void mo52031j() {
            b m151861b0;
            Integer valueOf = Integer.valueOf(this.f143947a.m9929A());
            Object obj = null;
            if (valueOf.intValue() < 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                Object obj2 = this.f143948b.f143912B.get(valueOf.intValue());
                if (obj2 instanceof Video) {
                    obj = obj2;
                }
                Video video = (Video) obj;
                if (video != null && (m151861b0 = this.f143948b.m151861b0()) != null) {
                    m151861b0.mo55502t(video);
                }
            }
        }

        @Override // com.zing.zalo.shortvideo.p072ui.component.p073rv.item.AdvertisingVideoItem.InterfaceC9547a
        /* renamed from: k */
        public void mo52032k() {
            String advertisingLink;
            b m151861b0;
            Integer valueOf = Integer.valueOf(this.f143947a.m9929A());
            Object obj = null;
            if (valueOf.intValue() < 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                Object obj2 = this.f143948b.f143912B.get(valueOf.intValue());
                if (obj2 instanceof Video) {
                    obj = obj2;
                }
                Video video = (Video) obj;
                if (video != null && (advertisingLink = this.f143947a.m151896k0().getAdvertisingLink()) != null && (m151861b0 = this.f143948b.m151861b0()) != null) {
                    m151861b0.mo55496n(advertisingLink, video);
                }
            }
        }

        @Override // com.zing.zalo.shortvideo.p072ui.component.p073rv.item.VideoItem.InterfaceC9673a
        /* renamed from: m */
        public void mo52443m() {
            Integer valueOf = Integer.valueOf(this.f143947a.m9929A());
            Object obj = null;
            if (valueOf.intValue() < 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                Object obj2 = this.f143948b.f143912B.get(valueOf.intValue());
                if (obj2 instanceof Video) {
                    obj = obj2;
                }
                Video video = (Video) obj;
                if (video == null) {
                    return;
                }
                b m151861b0 = this.f143948b.m151861b0();
                if (m151861b0 != null) {
                    m151861b0.mo55505w(video, !video.m52895j0());
                }
                this.f143947a.m151896k0().mo52025p(video);
            }
        }

        @Override // com.zing.zalo.shortvideo.p072ui.component.p073rv.item.AdvertisingVideoItem.InterfaceC9547a
        /* renamed from: n */
        public void mo52033n(String str) {
            b m151861b0;
            Integer valueOf = Integer.valueOf(this.f143947a.m9929A());
            Object obj = null;
            if (valueOf.intValue() < 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                Object obj2 = this.f143948b.f143912B.get(valueOf.intValue());
                if (obj2 instanceof Video) {
                    obj = obj2;
                }
                Video video = (Video) obj;
                if (video != null && (m151861b0 = this.f143948b.m151861b0()) != null) {
                    m151861b0.mo55498p(video, str);
                }
            }
        }

        @Override // com.zing.zalo.shortvideo.p072ui.component.p073rv.item.VideoItem.InterfaceC9673a
        /* renamed from: o */
        public void mo52444o() {
        }

        @Override // com.zing.zalo.shortvideo.p072ui.component.p073rv.item.VideoItem.InterfaceC9673a
        /* renamed from: p */
        public boolean mo52445p(boolean z11, boolean z12) {
            Integer valueOf = Integer.valueOf(this.f143947a.m9929A());
            Object obj = null;
            if (valueOf.intValue() < 0) {
                valueOf = null;
            }
            if (valueOf == null) {
                return true;
            }
            Object obj2 = this.f143948b.f143912B.get(valueOf.intValue());
            if (obj2 instanceof Video) {
                obj = obj2;
            }
            Video video = (Video) obj;
            if (video == null) {
                return true;
            }
            b m151861b0 = this.f143948b.m151861b0();
            if (m151861b0 != null && m151861b0.mo55480D(video, z11, z12)) {
                return true;
            }
            return false;
        }

        @Override // com.zing.zalo.shortvideo.p072ui.component.p073rv.item.VideoItem.InterfaceC9673a
        /* renamed from: q */
        public void mo52446q(boolean z11) {
            Integer valueOf = Integer.valueOf(this.f143947a.m9929A());
            Object obj = null;
            if (valueOf.intValue() < 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                int intValue = valueOf.intValue();
                Object obj2 = this.f143948b.f143912B.get(intValue);
                if (obj2 instanceof Video) {
                    obj = obj2;
                }
                Video video = (Video) obj;
                if (video == null) {
                    return;
                }
                Channel m52887f = video.m52887f();
                b m151861b0 = this.f143948b.m151861b0();
                if (m151861b0 != null) {
                    m151861b0.mo55495m(intValue, m52887f, !m52887f.m50741Q(), z11, video);
                }
            }
        }

        @Override // com.zing.zalo.shortvideo.p072ui.component.p073rv.item.VideoItem.InterfaceC9673a
        /* renamed from: r */
        public void mo52447r(boolean z11) {
            Integer valueOf = Integer.valueOf(this.f143947a.m9929A());
            Object obj = null;
            if (valueOf.intValue() < 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                Object obj2 = this.f143948b.f143912B.get(valueOf.intValue());
                if (obj2 instanceof Video) {
                    obj = obj2;
                }
                Video video = (Video) obj;
                if (video == null) {
                    return;
                }
                b m151861b0 = this.f143948b.m151861b0();
                if (m151861b0 != null) {
                    m151861b0.mo55507y(video, !video.m52909q0(), z11);
                }
                this.f143947a.m151896k0().m52434x(video);
            }
        }

        @Override // com.zing.zalo.shortvideo.p072ui.component.p073rv.item.AdvertisingVideoItem.InterfaceC9547a
        /* renamed from: s */
        public void mo52034s() {
            b m151861b0;
            Integer valueOf = Integer.valueOf(this.f143947a.m9929A());
            Object obj = null;
            if (valueOf.intValue() < 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                Object obj2 = this.f143948b.f143912B.get(valueOf.intValue());
                if (obj2 instanceof Video) {
                    obj = obj2;
                }
                Video video = (Video) obj;
                if (video != null && (m151861b0 = this.f143948b.m151861b0()) != null) {
                    m151861b0.mo55479C(video);
                }
            }
        }
    }

    /* renamed from: z10.n0$q */
    /* loaded from: classes5.dex */
    public static final class q implements SimpleLivestreamItem.InterfaceC9661a {

        /* renamed from: a */
        final /* synthetic */ h f143949a;

        /* renamed from: b */
        final /* synthetic */ C31179n0 f143950b;

        q(h hVar, C31179n0 c31179n0) {
            this.f143949a = hVar;
            this.f143950b = c31179n0;
        }

        @Override // com.zing.zalo.shortvideo.p072ui.component.p073rv.item.SimpleLivestreamItem.InterfaceC9661a
        /* renamed from: a */
        public void mo52375a(SimpleLivestreamItem simpleLivestreamItem) {
            b m151861b0;
            AbstractC19074t.m100208f(simpleLivestreamItem, "view");
            Integer valueOf = Integer.valueOf(this.f143949a.m9929A());
            Object obj = null;
            if (valueOf.intValue() < 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                Object obj2 = this.f143950b.f143912B.get(valueOf.intValue());
                if (obj2 instanceof LivestreamData) {
                    obj = obj2;
                }
                LivestreamData livestreamData = (LivestreamData) obj;
                if (livestreamData != null && (m151861b0 = this.f143950b.m151861b0()) != null) {
                    m151861b0.mo55477A(simpleLivestreamItem, livestreamData);
                }
            }
        }

        @Override // com.zing.zalo.shortvideo.p072ui.component.p073rv.item.SimpleLivestreamItem.InterfaceC9661a
        /* renamed from: c */
        public void mo52376c() {
            Integer valueOf = Integer.valueOf(this.f143949a.m9929A());
            Object obj = null;
            if (valueOf.intValue() < 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                int intValue = valueOf.intValue();
                Object obj2 = this.f143950b.f143912B.get(intValue);
                if (obj2 instanceof LivestreamData) {
                    obj = obj2;
                }
                LivestreamData livestreamData = (LivestreamData) obj;
                if (livestreamData == null) {
                    return;
                }
                Channel m51010b = livestreamData.m51010b();
                b m151861b0 = this.f143950b.m151861b0();
                if (m151861b0 != null) {
                    m151861b0.mo55499q(intValue, m51010b, !m51010b.m50741Q(), livestreamData);
                }
            }
        }

        @Override // com.zing.zalo.shortvideo.p072ui.component.p073rv.item.SimpleLivestreamItem.InterfaceC9661a
        /* renamed from: d */
        public void mo52377d() {
            b m151861b0;
            Integer valueOf = Integer.valueOf(this.f143949a.m9929A());
            Object obj = null;
            if (valueOf.intValue() < 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                Object obj2 = this.f143950b.f143912B.get(valueOf.intValue());
                if (obj2 instanceof LivestreamData) {
                    obj = obj2;
                }
                LivestreamData livestreamData = (LivestreamData) obj;
                if (livestreamData != null && (m151861b0 = this.f143950b.m151861b0()) != null) {
                    b.a.m151884a(m151861b0, livestreamData.m51010b(), livestreamData, null, 4, null);
                }
            }
        }
    }

    /* renamed from: z10.n0$r */
    /* loaded from: classes5.dex */
    public static final class r implements NormalVideoItem.InterfaceC9634a {

        /* renamed from: a */
        final /* synthetic */ k f143951a;

        /* renamed from: b */
        final /* synthetic */ C31179n0 f143952b;

        r(k kVar, C31179n0 c31179n0) {
            this.f143951a = kVar;
            this.f143952b = c31179n0;
        }

        @Override // com.zing.zalo.shortvideo.p072ui.component.p073rv.item.VideoItem.InterfaceC9673a
        /* renamed from: b */
        public void mo52437b(boolean z11) {
            b m151861b0;
            Integer valueOf = Integer.valueOf(this.f143951a.m9929A());
            Object obj = null;
            if (valueOf.intValue() < 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                Object obj2 = this.f143952b.f143912B.get(valueOf.intValue());
                if (obj2 instanceof Video) {
                    obj = obj2;
                }
                Video video = (Video) obj;
                if (video != null && (m151861b0 = this.f143952b.m151861b0()) != null) {
                    m151861b0.mo55493k(video, z11);
                }
            }
        }

        @Override // com.zing.zalo.shortvideo.p072ui.component.p073rv.item.VideoItem.InterfaceC9673a
        /* renamed from: d */
        public void mo52438d() {
            b m151861b0;
            Integer valueOf = Integer.valueOf(this.f143951a.m9929A());
            Object obj = null;
            if (valueOf.intValue() < 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                Object obj2 = this.f143952b.f143912B.get(valueOf.intValue());
                if (obj2 instanceof Video) {
                    obj = obj2;
                }
                Video video = (Video) obj;
                if (video != null && (m151861b0 = this.f143952b.m151861b0()) != null) {
                    b.a.m151885b(m151861b0, video.m52887f(), video, null, 4, null);
                }
            }
        }

        @Override // com.zing.zalo.shortvideo.p072ui.component.p073rv.item.VideoItem.InterfaceC9673a
        /* renamed from: e */
        public void mo52439e() {
            b m151861b0;
            Integer valueOf = Integer.valueOf(this.f143951a.m9929A());
            if (valueOf.intValue() < 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                Object obj = this.f143952b.f143912B.get(valueOf.intValue());
                if (!(obj instanceof Video)) {
                    obj = null;
                }
                Video video = (Video) obj;
                if (video != null && (m151861b0 = this.f143952b.m151861b0()) != null) {
                    b.a.m151886c(m151861b0, video, 0, 2, null);
                }
            }
        }

        @Override // com.zing.zalo.shortvideo.p072ui.component.p073rv.item.VideoItem.InterfaceC9673a
        /* renamed from: f */
        public void mo52440f() {
            b m151861b0;
            Integer valueOf = Integer.valueOf(this.f143951a.m9929A());
            Object obj = null;
            if (valueOf.intValue() < 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                Object obj2 = this.f143952b.f143912B.get(valueOf.intValue());
                if (obj2 instanceof Video) {
                    obj = obj2;
                }
                Video video = (Video) obj;
                if (video != null && (m151861b0 = this.f143952b.m151861b0()) != null) {
                    m151861b0.mo55485c(video);
                }
            }
        }

        @Override // com.zing.zalo.shortvideo.p072ui.component.p073rv.item.VideoItem.InterfaceC9673a
        /* renamed from: g */
        public void mo52441g(String str) {
            b m151861b0;
            AbstractC19074t.m100208f(str, "hashtag");
            Integer valueOf = Integer.valueOf(this.f143951a.m9929A());
            Object obj = null;
            if (valueOf.intValue() < 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                Object obj2 = this.f143952b.f143912B.get(valueOf.intValue());
                if (obj2 instanceof Video) {
                    obj = obj2;
                }
                Video video = (Video) obj;
                if (video != null && (m151861b0 = this.f143952b.m151861b0()) != null) {
                    m151861b0.mo55484b(str, video);
                }
            }
        }

        @Override // com.zing.zalo.shortvideo.p072ui.component.p073rv.item.NormalVideoItem.InterfaceC9634a
        /* renamed from: h */
        public void mo52311h() {
            b m151861b0;
            Integer valueOf = Integer.valueOf(this.f143951a.m9929A());
            Object obj = null;
            if (valueOf.intValue() < 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                Object obj2 = this.f143952b.f143912B.get(valueOf.intValue());
                if (obj2 instanceof Video) {
                    obj = obj2;
                }
                Video video = (Video) obj;
                if (video != null && (m151861b0 = this.f143952b.m151861b0()) != null) {
                    m151861b0.mo55506x(video);
                }
            }
        }

        @Override // com.zing.zalo.shortvideo.p072ui.component.p073rv.item.VideoItem.InterfaceC9673a
        /* renamed from: i */
        public void mo52442i() {
            b m151861b0;
            Integer valueOf = Integer.valueOf(this.f143951a.m9929A());
            Object obj = null;
            if (valueOf.intValue() < 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                Object obj2 = this.f143952b.f143912B.get(valueOf.intValue());
                if (obj2 instanceof Video) {
                    obj = obj2;
                }
                Video video = (Video) obj;
                if (video != null && (m151861b0 = this.f143952b.m151861b0()) != null) {
                    m151861b0.mo55486d(video);
                }
            }
        }

        @Override // com.zing.zalo.shortvideo.p072ui.component.p073rv.item.NormalVideoItem.InterfaceC9634a
        /* renamed from: l */
        public void mo52312l() {
            b m151861b0;
            Integer valueOf = Integer.valueOf(this.f143951a.m9929A());
            Object obj = null;
            if (valueOf.intValue() < 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                Object obj2 = this.f143952b.f143912B.get(valueOf.intValue());
                if (obj2 instanceof Video) {
                    obj = obj2;
                }
                Video video = (Video) obj;
                if (video != null && (m151861b0 = this.f143952b.m151861b0()) != null) {
                    m151861b0.mo55481E(video);
                }
            }
        }

        @Override // com.zing.zalo.shortvideo.p072ui.component.p073rv.item.VideoItem.InterfaceC9673a
        /* renamed from: m */
        public void mo52443m() {
            Integer valueOf = Integer.valueOf(this.f143951a.m9929A());
            Object obj = null;
            if (valueOf.intValue() < 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                Object obj2 = this.f143952b.f143912B.get(valueOf.intValue());
                if (obj2 instanceof Video) {
                    obj = obj2;
                }
                Video video = (Video) obj;
                if (video == null) {
                    return;
                }
                b m151861b0 = this.f143952b.m151861b0();
                if (m151861b0 != null) {
                    m151861b0.mo55505w(video, !video.m52895j0());
                }
                this.f143951a.m151897k0().mo52025p(video);
            }
        }

        @Override // com.zing.zalo.shortvideo.p072ui.component.p073rv.item.VideoItem.InterfaceC9673a
        /* renamed from: o */
        public void mo52444o() {
            b m151861b0;
            Integer valueOf = Integer.valueOf(this.f143951a.m9929A());
            Object obj = null;
            if (valueOf.intValue() < 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                Object obj2 = this.f143952b.f143912B.get(valueOf.intValue());
                if (obj2 instanceof Video) {
                    obj = obj2;
                }
                Video video = (Video) obj;
                if (video != null && (m151861b0 = this.f143952b.m151861b0()) != null) {
                    m151861b0.mo55478B(video);
                }
            }
        }

        @Override // com.zing.zalo.shortvideo.p072ui.component.p073rv.item.VideoItem.InterfaceC9673a
        /* renamed from: p */
        public boolean mo52445p(boolean z11, boolean z12) {
            b m151861b0;
            Integer valueOf = Integer.valueOf(this.f143951a.m9929A());
            Object obj = null;
            if (valueOf.intValue() < 0) {
                valueOf = null;
            }
            if (valueOf == null) {
                return false;
            }
            Object obj2 = this.f143952b.f143912B.get(valueOf.intValue());
            if (obj2 instanceof Video) {
                obj = obj2;
            }
            Video video = (Video) obj;
            if (video == null || (m151861b0 = this.f143952b.m151861b0()) == null || !m151861b0.mo55480D(video, z11, z12)) {
                return false;
            }
            return true;
        }

        @Override // com.zing.zalo.shortvideo.p072ui.component.p073rv.item.VideoItem.InterfaceC9673a
        /* renamed from: q */
        public void mo52446q(boolean z11) {
            Integer valueOf = Integer.valueOf(this.f143951a.m9929A());
            Object obj = null;
            if (valueOf.intValue() < 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                int intValue = valueOf.intValue();
                Object obj2 = this.f143952b.f143912B.get(intValue);
                if (obj2 instanceof Video) {
                    obj = obj2;
                }
                Video video = (Video) obj;
                if (video == null) {
                    return;
                }
                Channel m52887f = video.m52887f();
                b m151861b0 = this.f143952b.m151861b0();
                if (m151861b0 != null) {
                    m151861b0.mo55495m(intValue, m52887f, !m52887f.m50741Q(), z11, video);
                }
            }
        }

        @Override // com.zing.zalo.shortvideo.p072ui.component.p073rv.item.VideoItem.InterfaceC9673a
        /* renamed from: r */
        public void mo52447r(boolean z11) {
            Integer valueOf = Integer.valueOf(this.f143951a.m9929A());
            Object obj = null;
            if (valueOf.intValue() < 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                Object obj2 = this.f143952b.f143912B.get(valueOf.intValue());
                if (obj2 instanceof Video) {
                    obj = obj2;
                }
                Video video = (Video) obj;
                if (video == null) {
                    return;
                }
                b m151861b0 = this.f143952b.m151861b0();
                if (m151861b0 != null) {
                    m151861b0.mo55507y(video, !video.m52909q0(), z11);
                }
                this.f143951a.m151897k0().m52434x(video);
            }
        }

        @Override // com.zing.zalo.shortvideo.p072ui.component.p073rv.item.NormalVideoItem.InterfaceC9634a
        /* renamed from: t */
        public void mo52313t(VideoLabel videoLabel) {
            b m151861b0;
            AbstractC19074t.m100208f(videoLabel, "label");
            Integer valueOf = Integer.valueOf(this.f143951a.m9929A());
            Object obj = null;
            if (valueOf.intValue() < 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                Object obj2 = this.f143952b.f143912B.get(valueOf.intValue());
                if (obj2 instanceof Video) {
                    obj = obj2;
                }
                Video video = (Video) obj;
                if (video != null && (m151861b0 = this.f143952b.m151861b0()) != null) {
                    m151861b0.mo55508z(video, videoLabel);
                }
            }
        }
    }

    public /* synthetic */ C31179n0(String str, Section section, int i11, AbstractC19060k abstractC19060k) {
        this(str, (i11 & 2) != 0 ? new Section((List) null, 0L, (LoadMoreInfo) null, 7, (AbstractC19060k) null) : section);
    }

    /* renamed from: R */
    public static final /* synthetic */ ArrayList m151843R(C31179n0 c31179n0) {
        return c31179n0.f143912B;
    }

    /* renamed from: X */
    public static /* synthetic */ void m151845X(C31179n0 c31179n0, Section section, List list, List list2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            section = null;
        }
        if ((i11 & 2) != 0) {
            list = null;
        }
        if ((i11 & 4) != 0) {
            list2 = null;
        }
        c31179n0.m151858W(section, list, list2);
    }

    /* JADX WARN: Removed duplicated region for block: B:287:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0473 A[SYNTHETIC] */
    /* renamed from: Y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m151846Y(int i11, ArrayList arrayList, ArrayList arrayList2, boolean z11, boolean z12) {
        String str;
        Iterator it;
        String str2;
        List m51185b;
        String str3;
        Iterator it2;
        String str4;
        int size;
        int i12;
        int i13;
        Iterator it3;
        List m51185b2;
        Iterator it4;
        int i14;
        if (this.f143923z.isEmpty()) {
            return;
        }
        List list = this.f143923z;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : list) {
            if (((SectionBoxData) obj).m51186c() == 3) {
                arrayList3.add(obj);
            }
        }
        Iterator it5 = arrayList3.iterator();
        while (true) {
            str = "get(...)";
            if (!it5.hasNext()) {
                break;
            }
            SectionBoxData sectionBoxData = (SectionBoxData) it5.next();
            ArrayList arrayList4 = new ArrayList();
            List<Parcelable> m51185b3 = sectionBoxData.m51185b();
            if (m51185b3 != null) {
                ArrayList arrayList5 = new ArrayList();
                for (Parcelable parcelable : m51185b3) {
                    Video video = parcelable instanceof Video ? (Video) parcelable : null;
                    if (video != null) {
                        arrayList5.add(video);
                    }
                }
                arrayList4.addAll(arrayList5);
            }
            ArrayList arrayList6 = new ArrayList();
            List m51187d = sectionBoxData.m51187d();
            if (m51187d != null) {
                arrayList6.addAll(m51187d);
            }
            if (!arrayList6.isEmpty() && !arrayList4.isEmpty()) {
                int size2 = arrayList2.size();
                int i15 = -1;
                int i16 = -1;
                for (int i17 = i11; i17 < size2; i17++) {
                    Object obj2 = arrayList2.get(i17);
                    Video video2 = obj2 instanceof Video ? (Video) obj2 : null;
                    if ((video2 != null ? video2.m52920z() : null) != null && i15 < 0 && !video2.m52834A0() && !video2.m52836B0()) {
                        Integer m52920z = video2.m52920z();
                        i15 = m52920z != null ? m52920z.intValue() : i17;
                    }
                    if ((video2 != null ? video2.m52920z() : null) != null) {
                        Integer m52920z2 = video2.m52920z();
                        i16 = m52920z2 != null ? m52920z2.intValue() : i17;
                    }
                }
                if (i15 >= 0 && i16 >= 0) {
                    ArrayList arrayList7 = new ArrayList();
                    ArrayList arrayList8 = new ArrayList();
                    for (Object obj3 : arrayList6) {
                        Iterator it6 = it5;
                        int intValue = ((Number) obj3).intValue();
                        if (i15 <= intValue) {
                            i14 = i15;
                            if (intValue <= i16 + 1) {
                                arrayList8.add(obj3);
                            }
                        } else {
                            i14 = i15;
                        }
                        i15 = i14;
                        it5 = it6;
                    }
                    it3 = it5;
                    Iterator it7 = arrayList8.iterator();
                    while (it7.hasNext()) {
                        int intValue2 = ((Number) it7.next()).intValue();
                        int indexOf = arrayList6.indexOf(Integer.valueOf(intValue2));
                        if (indexOf >= 0 && indexOf < arrayList4.size()) {
                            Video video3 = (Video) arrayList4.get(indexOf);
                            int size3 = arrayList2.size();
                            int i18 = i11;
                            while (i18 < size3) {
                                Object obj4 = arrayList2.get(i18);
                                AbstractC19074t.m100207e(obj4, "get(...)");
                                it4 = it7;
                                boolean z13 = obj4 instanceof Video;
                                Integer m52920z3 = z13 ? ((Video) obj4).m52920z() : null;
                                if (z13 && m52920z3 != null && ((m52920z3.intValue() == intValue2 && (intValue2 != i11 || z12)) || m52920z3.intValue() + 1 == intValue2)) {
                                    Video video4 = (Video) obj4;
                                    if (!video4.m52834A0() && !video4.m52836B0()) {
                                        if (intValue2 != m52920z3.intValue()) {
                                            i18++;
                                        }
                                        arrayList.add(i18, 0);
                                        arrayList2.add(i18, video3);
                                        arrayList7.add(Integer.valueOf(i18));
                                        List m51185b4 = sectionBoxData.m51185b();
                                        if (m51185b4 != null) {
                                            m51185b4.remove(video3);
                                        }
                                        List m51187d2 = sectionBoxData.m51187d();
                                        if (m51187d2 != null) {
                                            m51187d2.remove(Integer.valueOf(intValue2));
                                        }
                                        it7 = it4;
                                    }
                                }
                                i18++;
                                it7 = it4;
                            }
                        }
                        it4 = it7;
                        it7 = it4;
                    }
                    List m51187d3 = sectionBoxData.m51187d();
                    if (m51187d3 == null || m51187d3.isEmpty() || (m51185b2 = sectionBoxData.m51185b()) == null || m51185b2.isEmpty()) {
                        this.f143923z.remove(sectionBoxData);
                    }
                    AbstractC20110a.f98889a.mo104548a("tannd3 buildSectionBoxMap add index:" + arrayList7 + " arrayData size:" + arrayList2.size(), new Object[0]);
                    if ((!arrayList7.isEmpty()) && z11) {
                        this.f143911A = arrayList;
                        this.f143912B = arrayList2;
                        Iterator it8 = arrayList7.iterator();
                        while (it8.hasNext()) {
                            m10011s(((Number) it8.next()).intValue());
                        }
                    }
                    it5 = it3;
                }
            }
            it3 = it5;
            it5 = it3;
        }
        List list2 = this.f143923z;
        ArrayList arrayList9 = new ArrayList();
        for (Object obj5 : list2) {
            if (((SectionBoxData) obj5).m51186c() == 70) {
                arrayList9.add(obj5);
            }
        }
        if (!arrayList9.isEmpty()) {
            int i19 = 0;
            for (Object obj6 : arrayList2) {
                if (obj6 instanceof Video) {
                    Video video5 = (Video) obj6;
                    if (!video5.m52834A0()) {
                        video5.m52853L0(Integer.valueOf(i19));
                        i19++;
                    }
                }
            }
        }
        Iterator it9 = arrayList9.iterator();
        while (it9.hasNext()) {
            SectionBoxData sectionBoxData2 = (SectionBoxData) it9.next();
            ArrayList arrayList10 = new ArrayList();
            List<Parcelable> m51185b5 = sectionBoxData2.m51185b();
            if (m51185b5 != null) {
                ArrayList arrayList11 = new ArrayList();
                for (Parcelable parcelable2 : m51185b5) {
                    LivestreamData livestreamData = parcelable2 instanceof LivestreamData ? (LivestreamData) parcelable2 : null;
                    if (livestreamData != null) {
                        arrayList11.add(livestreamData);
                    }
                }
                arrayList10.addAll(arrayList11);
            }
            ArrayList arrayList12 = new ArrayList();
            List m51187d4 = sectionBoxData2.m51187d();
            if (m51187d4 != null) {
                arrayList12.addAll(m51187d4);
            }
            if (arrayList12.isEmpty() || arrayList10.isEmpty()) {
                it = it9;
            } else {
                int size4 = arrayList2.size();
                int i21 = i11;
                int i22 = -1;
                int i23 = -1;
                while (i21 < size4) {
                    Object obj7 = arrayList2.get(i21);
                    Iterator it10 = it9;
                    Video video6 = obj7 instanceof Video ? (Video) obj7 : null;
                    if ((video6 != null ? video6.m52919y() : null) != null && i22 < 0 && !video6.m52834A0()) {
                        Integer m52919y = video6.m52919y();
                        i22 = m52919y != null ? m52919y.intValue() : i21;
                    }
                    if ((video6 != null ? video6.m52919y() : null) != null) {
                        Integer m52919y2 = video6.m52919y();
                        i23 = m52919y2 != null ? m52919y2.intValue() : i21;
                    }
                    i21++;
                    it9 = it10;
                }
                it = it9;
                if (i22 >= 0 && i23 >= 0) {
                    ArrayList arrayList13 = new ArrayList();
                    ArrayList arrayList14 = new ArrayList();
                    Iterator it11 = arrayList12.iterator();
                    while (it11.hasNext()) {
                        Object next = it11.next();
                        Iterator it12 = it11;
                        int intValue3 = ((Number) next).intValue();
                        if (i22 <= intValue3) {
                            i13 = i22;
                            if (intValue3 <= i23 + 1) {
                                arrayList14.add(next);
                            }
                        } else {
                            i13 = i22;
                        }
                        i22 = i13;
                        it11 = it12;
                    }
                    Iterator it13 = arrayList14.iterator();
                    while (it13.hasNext()) {
                        int intValue4 = ((Number) it13.next()).intValue();
                        int indexOf2 = arrayList12.indexOf(Integer.valueOf(intValue4));
                        if (indexOf2 < 0 || indexOf2 >= arrayList10.size()) {
                            str3 = str;
                            it2 = it13;
                        } else {
                            LivestreamData livestreamData2 = (LivestreamData) arrayList10.get(indexOf2);
                            String str5 = this.f143918u;
                            int hashCode = str5.hashCode();
                            it2 = it13;
                            if (hashCode == -507563187) {
                                if (str5.equals("SOURCE_FOLLOWING")) {
                                    str4 = "following";
                                    livestreamData2.m51007Z(str4);
                                    size = arrayList2.size();
                                    i12 = i11;
                                    while (true) {
                                        if (i12 < size) {
                                        }
                                        i12++;
                                        str = str3;
                                    }
                                }
                                str4 = "player";
                                livestreamData2.m51007Z(str4);
                                size = arrayList2.size();
                                i12 = i11;
                                while (true) {
                                    if (i12 < size) {
                                    }
                                    i12++;
                                    str = str3;
                                }
                            } else if (hashCode != 596808987) {
                                if (hashCode == 1323686722 && str5.equals("SOURCE_FRIEND")) {
                                    str4 = "friend";
                                    livestreamData2.m51007Z(str4);
                                    size = arrayList2.size();
                                    i12 = i11;
                                    while (true) {
                                        if (i12 < size) {
                                            str3 = str;
                                            break;
                                        }
                                        Object obj8 = arrayList2.get(i12);
                                        AbstractC19074t.m100207e(obj8, str);
                                        str3 = str;
                                        boolean z14 = obj8 instanceof Video;
                                        Integer m52919y3 = z14 ? ((Video) obj8).m52919y() : null;
                                        if (!z14 || m52919y3 == null || (((m52919y3.intValue() != intValue4 || (intValue4 == i11 && !z12)) && m52919y3.intValue() + 1 != intValue4) || ((Video) obj8).m52834A0())) {
                                            i12++;
                                            str = str3;
                                        } else {
                                            if (intValue4 != m52919y3.intValue()) {
                                                i12++;
                                            }
                                            arrayList.add(i12, 5);
                                            arrayList2.add(i12, livestreamData2);
                                            arrayList13.add(Integer.valueOf(i12));
                                            List m51185b6 = sectionBoxData2.m51185b();
                                            if (m51185b6 != null) {
                                                m51185b6.remove(livestreamData2);
                                            }
                                            List m51187d5 = sectionBoxData2.m51187d();
                                            if (m51187d5 != null) {
                                                m51187d5.remove(Integer.valueOf(intValue4));
                                            }
                                        }
                                    }
                                }
                                str4 = "player";
                                livestreamData2.m51007Z(str4);
                                size = arrayList2.size();
                                i12 = i11;
                                while (true) {
                                    if (i12 < size) {
                                    }
                                    i12++;
                                    str = str3;
                                }
                            } else {
                                if (str5.equals("SOURCE_FOR_U")) {
                                    str4 = "for_you";
                                    livestreamData2.m51007Z(str4);
                                    size = arrayList2.size();
                                    i12 = i11;
                                    while (true) {
                                        if (i12 < size) {
                                        }
                                        i12++;
                                        str = str3;
                                    }
                                }
                                str4 = "player";
                                livestreamData2.m51007Z(str4);
                                size = arrayList2.size();
                                i12 = i11;
                                while (true) {
                                    if (i12 < size) {
                                    }
                                    i12++;
                                    str = str3;
                                }
                            }
                        }
                        it13 = it2;
                        str = str3;
                    }
                    str2 = str;
                    List m51187d6 = sectionBoxData2.m51187d();
                    if (m51187d6 == null || m51187d6.isEmpty() || (m51185b = sectionBoxData2.m51185b()) == null || m51185b.isEmpty()) {
                        this.f143923z.remove(sectionBoxData2);
                    }
                    AbstractC20110a.f98889a.mo104548a("tannd3 buildSectionBoxMap add livestream index:" + arrayList13 + " arrayData size:" + arrayList2.size(), new Object[0]);
                    if ((!arrayList13.isEmpty()) && z11) {
                        this.f143911A = arrayList;
                        this.f143912B = arrayList2;
                        Iterator it14 = arrayList13.iterator();
                        while (it14.hasNext()) {
                            m10011s(((Number) it14.next()).intValue());
                        }
                    }
                    it9 = it;
                    str = str2;
                }
            }
            str2 = str;
            it9 = it;
            str = str2;
        }
        if (!arrayList9.isEmpty()) {
            m151847m0(arrayList2);
        }
    }

    /* renamed from: m0 */
    private final void m151847m0(ArrayList arrayList) {
        int i11 = 0;
        int i12 = 0;
        for (Object obj : arrayList) {
            int i13 = i11 + 1;
            if (i11 < 0) {
                AbstractC25368s.m131509q();
            }
            if (obj instanceof LivestreamData) {
                ((LivestreamData) obj).m50995M(Integer.valueOf(i11));
            }
            if (obj instanceof Video) {
                Video video = (Video) obj;
                if (!video.m52834A0()) {
                    video.m52853L0(Integer.valueOf(i12));
                    i12++;
                }
            }
            i11 = i13;
        }
    }

    /* renamed from: r0 */
    public static /* synthetic */ void m151848r0(C31179n0 c31179n0, int i11, boolean z11, boolean z12, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            z11 = false;
        }
        if ((i12 & 4) != 0) {
            z12 = false;
        }
        c31179n0.m151874q0(i11, z11, z12);
    }

    /* renamed from: y0 */
    public static /* synthetic */ void m151849y0(C31179n0 c31179n0, int i11, Video video, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            video = null;
        }
        c31179n0.m151880x0(i11, video);
    }

    /* renamed from: A0 */
    public final void m151850A0(int i11, Video video) {
        AbstractC19074t.m100208f(video, "video");
        m151849y0(this, i11, null, 2, null);
        m151868i0(i11, 0, video);
        m10009q(i11);
    }

    /* renamed from: B0 */
    public final void m151851B0(C31179n0 c31179n0) {
        AbstractC19074t.m100208f(c31179n0, "adapter");
        this.f143919v = c31179n0.f143919v;
        this.f143911A = c31179n0.f143911A;
        this.f143912B = c31179n0.f143912B;
        this.f143913C = c31179n0.f143913C;
        this.f143914D = c31179n0.f143914D;
        this.f143915E = c31179n0.f143915E;
        this.f143916F = c31179n0.f143916F;
        this.f143921x = c31179n0.f143921x;
        this.f143922y = c31179n0.f143922y;
        this.f143923z = c31179n0.f143923z;
    }

    /* renamed from: C0 */
    public final void m151852C0(b bVar) {
        this.f143920w = bVar;
    }

    /* renamed from: D0 */
    public final void m151853D0(Section section) {
        AbstractC19074t.m100208f(section, "<set-?>");
        this.f143919v = section;
    }

    /* renamed from: E0 */
    public final void m151854E0(Video video) {
        List m131496e;
        AbstractC19074t.m100208f(video, "video");
        List m51168m = this.f143919v.m51168m();
        AbstractC19074t.m100206d(m51168m, "null cannot be cast to non-null type java.util.ArrayList<com.zing.zalo.shortvideo.ui.model.Video>");
        ((ArrayList) m51168m).set(0, video);
        this.f143912B.set(0, video);
        m131496e = AbstractC25366r.m131496e("UPDATE");
        m10010r(0, m131496e);
        b bVar = this.f143920w;
        if (bVar != null) {
            bVar.mo55482F();
        }
    }

    @Override // z10.AbstractC31153a0
    /* renamed from: P */
    public void mo151429P() {
        LoadMoreInfo m51171p = this.f143919v.m51171p();
        if (m51171p != null) {
            m151447Q(2);
            b bVar = this.f143920w;
            if (bVar != null) {
                bVar.mo55483a(m51171p);
            }
        }
    }

    /* renamed from: T */
    public final void m151855T(List list, LoadMoreInfo loadMoreInfo) {
        int m131511r;
        Integer num;
        AbstractC19074t.m100208f(list, "ads");
        AbstractC20110a.a aVar = AbstractC20110a.f98889a;
        List list2 = list;
        m131511r = AbstractC25370t.m131511r(list2, 10);
        ArrayList arrayList = new ArrayList(m131511r);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            VideoAdsInfo m52881b = ((Video) it.next()).m52881b();
            if (m52881b != null) {
                num = Integer.valueOf(m52881b.m52933i());
            } else {
                num = null;
            }
            arrayList.add(num);
        }
        aVar.mo104548a("tannd3 ads appendAds index:" + arrayList, new Object[0]);
        this.f143921x.addAll(list);
        this.f143922y = loadMoreInfo;
    }

    /* renamed from: U */
    public final void m151856U(List list) {
        AbstractC19074t.m100208f(list, "boxes");
        this.f143923z.addAll(list);
    }

    /* renamed from: V */
    public final void m151857V(int i11, boolean z11) {
        b bVar;
        int i12;
        Integer num;
        Integer num2;
        Video video;
        Integer num3;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f143921x);
        if (!arrayList.isEmpty() && AbstractC19074t.m100204b(this.f143918u, "SOURCE_FOR_U")) {
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            arrayList2.addAll(this.f143911A);
            arrayList3.addAll(this.f143912B);
            m151847m0(arrayList3);
            int size = arrayList3.size();
            int i13 = i11;
            int i14 = -1;
            int i15 = -1;
            while (true) {
                Integer num4 = null;
                if (i13 >= size) {
                    break;
                }
                Object obj = arrayList3.get(i13);
                if (obj instanceof Video) {
                    video = (Video) obj;
                } else {
                    video = null;
                }
                if (video != null) {
                    num3 = video.m52919y();
                } else {
                    num3 = null;
                }
                if (num3 != null && i14 < 0 && !video.m52834A0()) {
                    Integer m52919y = video.m52919y();
                    if (m52919y != null) {
                        i14 = m52919y.intValue();
                    } else {
                        i14 = i13;
                    }
                }
                if (video != null) {
                    num4 = video.m52919y();
                }
                if (num4 != null) {
                    Integer m52919y2 = video.m52919y();
                    if (m52919y2 != null) {
                        i15 = m52919y2.intValue();
                    } else {
                        i15 = i13;
                    }
                }
                i13++;
            }
            if (i14 >= 0 && i15 >= 0) {
                ArrayList<Video> arrayList4 = new ArrayList();
                for (Object obj2 : arrayList) {
                    C22537f c22537f = new C22537f(i14, i15 + 1);
                    VideoAdsInfo m52881b = ((Video) obj2).m52881b();
                    if (m52881b != null) {
                        num2 = Integer.valueOf(m52881b.m52933i());
                    } else {
                        num2 = null;
                    }
                    if (num2 != null && c22537f.m116554l(num2.intValue())) {
                        arrayList4.add(obj2);
                    }
                }
                ArrayList arrayList5 = new ArrayList();
                for (Video video2 : arrayList4) {
                    VideoAdsInfo m52881b2 = video2.m52881b();
                    if (m52881b2 != null) {
                        int m52933i = m52881b2.m52933i();
                        int size2 = arrayList3.size();
                        int i16 = i11;
                        while (true) {
                            if (i16 < size2) {
                                Object obj3 = arrayList3.get(i16);
                                AbstractC19074t.m100207e(obj3, "get(...)");
                                boolean z12 = obj3 instanceof Video;
                                if (z12) {
                                    num = ((Video) obj3).m52919y();
                                } else {
                                    num = null;
                                }
                                if (z12 && num != null && ((num.intValue() == m52933i || num.intValue() + 1 == m52933i) && !((Video) obj3).m52834A0())) {
                                    if (num.intValue() != m52933i) {
                                        i16++;
                                    }
                                    arrayList2.add(i16, 4);
                                    arrayList3.add(i16, video2);
                                    arrayList5.add(Integer.valueOf(i16));
                                    this.f143921x.remove(video2);
                                } else {
                                    i16++;
                                }
                            }
                        }
                    }
                }
                this.f143911A = arrayList2;
                this.f143912B = arrayList3;
                AbstractC20110a.f98889a.mo104548a("tannd3 ads build map ads index:" + arrayList5 + " arrayData size:" + arrayList3.size(), new Object[0]);
                if ((!arrayList5.isEmpty()) && z11) {
                    Iterator it = arrayList5.iterator();
                    while (it.hasNext()) {
                        m10011s(((Number) it.next()).intValue());
                    }
                }
                List list = this.f143921x;
                ArrayList arrayList6 = new ArrayList();
                for (Object obj4 : list) {
                    VideoAdsInfo m52881b3 = ((Video) obj4).m52881b();
                    if (m52881b3 != null) {
                        i12 = m52881b3.m52933i();
                    } else {
                        i12 = -1;
                    }
                    if (i12 > i15) {
                        arrayList6.add(obj4);
                    }
                }
                if (arrayList6.isEmpty()) {
                    this.f143921x.clear();
                    LoadMoreInfo loadMoreInfo = this.f143922y;
                    if (loadMoreInfo != null && (bVar = this.f143920w) != null) {
                        bVar.mo55487e(loadMoreInfo);
                    }
                }
            }
        }
    }

    /* renamed from: W */
    public final void m151858W(Section section, List list, List list2) {
        int i11;
        boolean z11;
        int i12;
        int i13;
        int i14;
        Object obj;
        if (list2 != null) {
            this.f143923z.addAll(list2);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size = this.f143919v.m51168m().size();
        int i15 = 0;
        if (section != null) {
            arrayList.addAll(this.f143911A);
            arrayList2.addAll(this.f143912B);
            this.f143919v.m51163e(section, l.f143941q);
            i11 = this.f143919v.m51168m().size();
        } else {
            this.f143914D.clear();
            this.f143915E.clear();
            this.f143916F = 0;
            i11 = size;
            size = 0;
        }
        int size2 = arrayList2.size();
        int i16 = this.f143916F;
        int i17 = size;
        while (true) {
            z11 = true;
            if (i17 >= i11) {
                break;
            }
            Video video = (Video) this.f143919v.m51168m().get(i17);
            arrayList.add(0);
            arrayList2.add(video);
            if (video.m52920z() == null) {
                video.m52855M0(Integer.valueOf((i17 - size) + i16));
            }
            if (video.m52919y() == null) {
                video.m52853L0(Integer.valueOf((i17 - size) + i16));
            }
            this.f143916F++;
            i17++;
        }
        int i18 = size2 == 0 ? 0 : size2 - 1;
        if (size2 != 0) {
            z11 = false;
        }
        m151864e0(i18, arrayList, arrayList2, z11);
        List list3 = list;
        if (list3 != null && !list3.isEmpty()) {
            int i19 = i16 - 1;
            int i21 = -1;
            if (list != null) {
                ArrayList<BreakSlot> arrayList3 = new ArrayList();
                for (Object obj2 : list) {
                    if (((BreakSlot) obj2).m50683d() >= 0) {
                        arrayList3.add(obj2);
                    }
                }
                i12 = 0;
                for (BreakSlot breakSlot : arrayList3) {
                    int m50683d = breakSlot.m50683d() + i16;
                    Object obj3 = this.f143914D.get(Integer.valueOf(breakSlot.m50690k()));
                    if (obj3 == null) {
                        obj3 = Integer.valueOf(i21);
                    }
                    int intValue = ((Number) obj3).intValue();
                    Object obj4 = this.f143915E.get(Integer.valueOf(breakSlot.m50690k()));
                    if (obj4 == null) {
                        obj4 = Integer.valueOf(i15);
                    }
                    int intValue2 = ((Number) obj4).intValue();
                    int i22 = i19 + 1;
                    if (m50683d <= this.f143916F && i22 <= m50683d && m50683d >= intValue + intValue2) {
                        this.f143914D.put(Integer.valueOf(breakSlot.m50690k()), Integer.valueOf(m50683d));
                        this.f143915E.put(Integer.valueOf(breakSlot.m50690k()), Integer.valueOf(breakSlot.m50686g()));
                        int i23 = m50683d - ((i16 - size2) - i12);
                        i12++;
                        arrayList.add(i23, Integer.valueOf(Companion.m151887a(breakSlot.m50690k())));
                        arrayList2.add(i23, breakSlot);
                        i19 = m50683d;
                    }
                    i15 = 0;
                    i21 = -1;
                }
            } else {
                i12 = 0;
            }
            if (list != null) {
                ArrayList<BreakSlot> arrayList4 = new ArrayList();
                for (Object obj5 : list) {
                    if (((BreakSlot) obj5).m50691l() != null) {
                        arrayList4.add(obj5);
                    }
                }
                for (BreakSlot breakSlot2 : arrayList4) {
                    Object obj6 = this.f143914D.get(Integer.valueOf(breakSlot2.m50690k()));
                    if (obj6 == null) {
                        obj6 = -1;
                    }
                    int intValue3 = ((Number) obj6).intValue();
                    Object obj7 = this.f143915E.get(Integer.valueOf(breakSlot2.m50690k()));
                    if (obj7 == null) {
                        obj7 = 0;
                    }
                    int intValue4 = ((Number) obj7).intValue();
                    int i24 = i19 + 1;
                    int i25 = this.f143916F;
                    while (true) {
                        if (i24 < i25) {
                            i13 = size;
                            Object obj8 = this.f143919v.m51168m().get((size + i24) - i16);
                            if (AbstractC19074t.m100204b(((Video) obj8).m52911t(), breakSlot2.m50691l())) {
                                obj = obj8;
                            } else {
                                obj = null;
                            }
                            if (((Video) obj) == null) {
                                i24++;
                                size = i13;
                            } else {
                                i14 = i24 + 1;
                                break;
                            }
                        } else {
                            i13 = size;
                            i14 = -1;
                            break;
                        }
                    }
                    if (i14 != -1 && i14 >= intValue3 + intValue4) {
                        this.f143914D.put(Integer.valueOf(breakSlot2.m50690k()), Integer.valueOf(i14));
                        this.f143915E.put(Integer.valueOf(breakSlot2.m50690k()), Integer.valueOf(breakSlot2.m50686g()));
                        int i26 = i14 - ((i16 - size2) - i12);
                        i12++;
                        arrayList.add(i26, Integer.valueOf(Companion.m151887a(breakSlot2.m50690k())));
                        arrayList2.add(i26, breakSlot2);
                        i19 = i14;
                    }
                    size = i13;
                }
            }
        }
        this.f143911A = arrayList;
        this.f143912B = arrayList2;
        m151857V(i18, false);
    }

    /* renamed from: Z */
    public final void m151859Z() {
        this.f143921x.clear();
        this.f143922y = null;
    }

    /* renamed from: a0 */
    public final void m151860a0() {
        this.f143923z.clear();
    }

    /* renamed from: b0 */
    public final b m151861b0() {
        return this.f143920w;
    }

    /* renamed from: c0 */
    public final Section m151862c0() {
        return this.f143919v;
    }

    /* renamed from: d0 */
    public final String m151863d0() {
        return this.f143918u;
    }

    /* renamed from: e0 */
    public final void m151864e0(int i11, ArrayList arrayList, ArrayList arrayList2, boolean z11) {
        if (arrayList != null && arrayList2 != null) {
            m151846Y(i11, arrayList, arrayList2, false, z11);
            return;
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        arrayList3.addAll(this.f143911A);
        arrayList4.addAll(this.f143912B);
        m151846Y(i11, arrayList3, arrayList4, true, z11);
    }

    /* renamed from: f0 */
    public final boolean m151865f0() {
        return !this.f143923z.isEmpty();
    }

    /* renamed from: g0 */
    public final int m151866g0() {
        return this.f143911A.indexOf(999);
    }

    /* renamed from: h0 */
    public final void m151867h0(int i11, VideoAdsData videoAdsData) {
        AbstractC19074t.m100208f(videoAdsData, "adsData");
        Video video = new Video(videoAdsData.m51275n());
        video.m52840D0(new VideoAdsInfo(videoAdsData));
        List m51168m = this.f143919v.m51168m();
        AbstractC19074t.m100206d(m51168m, "null cannot be cast to non-null type java.util.ArrayList<com.zing.zalo.shortvideo.ui.model.Video>");
        ((ArrayList) m51168m).add(video);
        this.f143911A.add(i11, 4);
        this.f143912B.add(i11, video);
        m10011s(i11);
    }

    /* renamed from: i0 */
    public final void m151868i0(int i11, int i12, Video video) {
        AbstractC19074t.m100208f(video, "video");
        this.f143911A.add(i11, Integer.valueOf(i12));
        this.f143912B.add(i11, video);
        List m51168m = this.f143919v.m51168m();
        AbstractC19074t.m100206d(m51168m, "null cannot be cast to non-null type java.util.ArrayList<com.zing.zalo.shortvideo.ui.model.Video>");
        ((ArrayList) m51168m).add(video);
    }

    /* renamed from: j0 */
    public final void m151869j0(int i11, Video video) {
        AbstractC19074t.m100208f(video, "video");
        if (mo10003k() != i11) {
            Object obj = this.f143912B.get(i11);
            String str = null;
            if (!(obj instanceof Video)) {
                obj = null;
            }
            if (((Video) obj) == null) {
                Object obj2 = this.f143912B.get(i11);
                if (!(obj2 instanceof BreakSlot)) {
                    obj2 = null;
                }
                BreakSlot breakSlot = (BreakSlot) obj2;
                if (breakSlot != null) {
                    str = breakSlot.m50691l();
                }
                if (str != null) {
                    List m51168m = this.f143919v.m51168m();
                    AbstractC19074t.m100206d(m51168m, "null cannot be cast to non-null type java.util.ArrayList<com.zing.zalo.shortvideo.ui.model.Video>");
                    ((ArrayList) m51168m).add(video);
                    this.f143911A.set(i11, 0);
                    this.f143912B.set(i11, video);
                    m10009q(i11);
                    return;
                }
            }
        }
        List m51168m2 = this.f143919v.m51168m();
        AbstractC19074t.m100206d(m51168m2, "null cannot be cast to non-null type java.util.ArrayList<com.zing.zalo.shortvideo.ui.model.Video>");
        ((ArrayList) m51168m2).add(video);
        this.f143911A.add(i11, 0);
        this.f143912B.add(i11, video);
        m10011s(i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        return this.f143912B.size();
    }

    /* renamed from: k0 */
    public final boolean m151870k0(int i11) {
        HashMap hashMap = this.f143913C;
        Object obj = this.f143912B.get(i11);
        if (obj != null) {
            d dVar = (d) hashMap.get(((Video) obj).m52911t());
            if (dVar == null || !dVar.m151889b()) {
                return false;
            }
            return true;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.zing.zalo.shortvideo.ui.model.Video");
    }

    /* renamed from: l0 */
    public final boolean m151871l0(int i11) {
        HashMap hashMap = this.f143913C;
        if (this.f143912B.get(i11) != null) {
            return !hashMap.containsKey(((Video) r3).m52911t());
        }
        throw new NullPointerException("null cannot be cast to non-null type com.zing.zalo.shortvideo.ui.model.Video");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: m */
    public int mo10005m(int i11) {
        Object obj = this.f143911A.get(i11);
        AbstractC19074t.m100207e(obj, "get(...)");
        return ((Number) obj).intValue();
    }

    /* renamed from: o0 */
    public final void m151872o0(BreakSlot breakSlot) {
        b bVar;
        AbstractC19074t.m100208f(breakSlot, "slot");
        int mo10003k = mo10003k();
        int i11 = 0;
        while (true) {
            if (i11 >= mo10003k) {
                break;
            }
            Object obj = this.f143912B.get(i11);
            if (!(obj instanceof BreakSlot)) {
                obj = null;
            }
            BreakSlot breakSlot2 = (BreakSlot) obj;
            if (breakSlot2 != null && breakSlot2 == breakSlot) {
                this.f143911A.remove(i11);
                this.f143912B.remove(i11);
                m10017y(i11);
                break;
            }
            i11++;
        }
        if (mo10003k() == 0 && (bVar = this.f143920w) != null) {
            bVar.mo55504v();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0128, code lost:            if (r5 != false) goto L127;     */
    /* renamed from: p0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m151873p0(int i11, List list, List list2, InterfaceC18505l interfaceC18505l) {
        String str;
        String str2;
        boolean m131196V;
        boolean m131196V2;
        AbstractC19074t.m100208f(list, "channelIds");
        AbstractC19074t.m100208f(list2, "topicIds");
        AbstractC19074t.m100208f(interfaceC18505l, "removeCallback");
        ArrayList arrayList = this.f143912B;
        List subList = arrayList.subList(i11, arrayList.size());
        AbstractC19074t.m100207e(subList, "subList(...)");
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : subList) {
            if (obj instanceof Video) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList2.iterator();
        while (true) {
            String str3 = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            Video video = (Video) next;
            if (!list.contains(video.m52887f().m50769l())) {
                List list3 = list2;
                Integer m52885e = video.m52885e();
                if (m52885e != null) {
                    str3 = m52885e.toString();
                }
                m131196V2 = AbstractC25332a0.m131196V(list3, str3);
                if (!m131196V2) {
                    arrayList3.add(next);
                }
            }
        }
        boolean isEmpty = arrayList3.isEmpty();
        ArrayList arrayList4 = new ArrayList();
        if (isEmpty) {
            int mo10003k = mo10003k();
            this.f143911A.add(999);
            this.f143912B.add(new Object());
            m10011s(mo10003k);
            int i12 = mo10003k - 1;
            if (i11 <= i12) {
                while (true) {
                    Object obj2 = this.f143912B.get(i12);
                    if (!(obj2 instanceof Video)) {
                        obj2 = null;
                    }
                    Video video2 = (Video) obj2;
                    this.f143911A.remove(i12);
                    this.f143912B.remove(i12);
                    if (video2 != null) {
                        C18168e.Companion.m96538b().m96513F(video2.m52871V());
                        List m51168m = this.f143919v.m51168m();
                        AbstractC19074t.m100206d(m51168m, "null cannot be cast to non-null type java.util.ArrayList<com.zing.zalo.shortvideo.ui.model.Video>");
                        ((ArrayList) m51168m).remove(video2);
                        arrayList4.add(video2.m52911t());
                    }
                    if (i12 == i11) {
                        break;
                    } else {
                        i12--;
                    }
                }
            }
            m10016x(i11, mo10003k - i11);
        } else {
            int mo10003k2 = mo10003k() - 1;
            if (i11 <= mo10003k2) {
                while (true) {
                    Object obj3 = this.f143912B.get(mo10003k2);
                    if (!(obj3 instanceof Video)) {
                        obj3 = null;
                    }
                    Video video3 = (Video) obj3;
                    if (video3 != null) {
                        if (!list.contains(video3.m52887f().m50769l())) {
                            List list4 = list2;
                            Integer m52885e2 = video3.m52885e();
                            if (m52885e2 != null) {
                                str2 = m52885e2.toString();
                            } else {
                                str2 = null;
                            }
                            m131196V = AbstractC25332a0.m131196V(list4, str2);
                        }
                        C18168e.Companion.m96538b().m96513F(video3.m52871V());
                        List m51168m2 = this.f143919v.m51168m();
                        AbstractC19074t.m100206d(m51168m2, "null cannot be cast to non-null type java.util.ArrayList<com.zing.zalo.shortvideo.ui.model.Video>");
                        ((ArrayList) m51168m2).remove(video3);
                        arrayList4.add(video3.m52911t());
                        this.f143911A.remove(mo10003k2);
                        this.f143912B.remove(mo10003k2);
                        if (mo10003k() > mo10003k2) {
                            Object obj4 = this.f143912B.get(mo10003k2);
                            if (!(obj4 instanceof BreakSlot)) {
                                obj4 = null;
                            }
                            BreakSlot breakSlot = (BreakSlot) obj4;
                            if (breakSlot != null) {
                                str = breakSlot.m50691l();
                            } else {
                                str = null;
                            }
                            if (AbstractC19074t.m100204b(str, video3.m52911t())) {
                                this.f143911A.remove(mo10003k2);
                                this.f143912B.remove(mo10003k2);
                                m10016x(mo10003k2, 2);
                            }
                        }
                        m10017y(mo10003k2);
                    }
                    if (mo10003k2 == i11) {
                        break;
                    } else {
                        mo10003k2--;
                    }
                }
            }
        }
        interfaceC18505l.mo205i9(arrayList4);
    }

    /* renamed from: q0 */
    public final void m151874q0(int i11, boolean z11, boolean z12) {
        List m131505m;
        int i12;
        Map m131407l;
        int i13;
        Map m131401f;
        Object obj = this.f143912B.get(i11);
        if (!(obj instanceof Video)) {
            obj = null;
        }
        Video video = (Video) obj;
        if (video != null && !video.m52887f().m50741Q() && !this.f143913C.containsKey(video.m52911t())) {
            HashMap hashMap = this.f143913C;
            String m52911t = video.m52911t();
            d dVar = new d(false, false, 3, null);
            if (z11) {
                dVar.m151890c(true);
            } else {
                dVar.m151891d(true);
            }
            hashMap.put(m52911t, dVar);
            m131505m = AbstractC25368s.m131505m("FOLLOW", Boolean.TRUE);
            m10010r(i11, m131505m);
            if (z11) {
                C19205a c19205a = C19205a.f95429a;
                Context appContext = CoreUtility.getAppContext();
                String str = this.f143918u;
                int hashCode = str.hashCode();
                if (hashCode != -507563187) {
                    if (hashCode != 596808987) {
                        if (hashCode == 1323686722 && str.equals("SOURCE_FRIEND")) {
                            i13 = AbstractC27413h.zch_action_key_friend_follow_strong_suggested;
                        }
                        i13 = AbstractC27413h.zch_action_key_player_follow_strong_suggested;
                    } else {
                        if (str.equals("SOURCE_FOR_U")) {
                            i13 = AbstractC27413h.zch_action_key_foru_follow_strong_suggested;
                        }
                        i13 = AbstractC27413h.zch_action_key_player_follow_strong_suggested;
                    }
                } else {
                    if (str.equals("SOURCE_FOLLOWING")) {
                        i13 = AbstractC27413h.zch_action_key_following_follow_strong_suggested;
                    }
                    i13 = AbstractC27413h.zch_action_key_player_follow_strong_suggested;
                }
                String string = appContext.getString(i13);
                AbstractC19074t.m100207e(string, "getString(...)");
                m131401f = AbstractC25361o0.m131401f(AbstractC24866w.m129235a("video_id", video.m52911t()));
                c19205a.m100713L(string, m131401f);
                return;
            }
            C19205a c19205a2 = C19205a.f95429a;
            Context appContext2 = CoreUtility.getAppContext();
            String str2 = this.f143918u;
            int hashCode2 = str2.hashCode();
            if (hashCode2 != -507563187) {
                if (hashCode2 != 596808987) {
                    if (hashCode2 == 1323686722 && str2.equals("SOURCE_FRIEND")) {
                        i12 = AbstractC27413h.zch_action_key_friend_follow_suggested;
                    }
                    i12 = AbstractC27413h.zch_action_key_player_follow_suggested;
                } else {
                    if (str2.equals("SOURCE_FOR_U")) {
                        i12 = AbstractC27413h.zch_action_key_foru_follow_suggested;
                    }
                    i12 = AbstractC27413h.zch_action_key_player_follow_suggested;
                }
            } else {
                if (str2.equals("SOURCE_FOLLOWING")) {
                    i12 = AbstractC27413h.zch_action_key_following_follow_suggested;
                }
                i12 = AbstractC27413h.zch_action_key_player_follow_suggested;
            }
            String string2 = appContext2.getString(i12);
            AbstractC19074t.m100207e(string2, "getString(...)");
            m131407l = AbstractC25363p0.m131407l(AbstractC24866w.m129235a("video_id", video.m52911t()), AbstractC24866w.m129235a("from_action", Integer.valueOf(z12 ? 1 : 0)));
            c19205a2.m100713L(string2, m131407l);
        }
    }

    /* renamed from: s0 */
    public final void m151875s0(String str) {
        b bVar;
        AbstractC19074t.m100208f(str, "videoId");
        int mo10003k = mo10003k();
        int i11 = 0;
        while (true) {
            if (i11 >= mo10003k) {
                break;
            }
            Object obj = this.f143912B.get(i11);
            String str2 = null;
            if (!(obj instanceof Video)) {
                obj = null;
            }
            Video video = (Video) obj;
            if (video != null && AbstractC19074t.m100204b(video.m52871V(), str)) {
                C18168e.Companion.m96538b().m96513F(str);
                List m51168m = this.f143919v.m51168m();
                AbstractC19074t.m100206d(m51168m, "null cannot be cast to non-null type java.util.ArrayList<com.zing.zalo.shortvideo.ui.model.Video>");
                ((ArrayList) m51168m).remove(video);
                this.f143911A.remove(i11);
                this.f143912B.remove(i11);
                if (mo10003k() > i11) {
                    Object obj2 = this.f143912B.get(i11);
                    if (!(obj2 instanceof BreakSlot)) {
                        obj2 = null;
                    }
                    BreakSlot breakSlot = (BreakSlot) obj2;
                    if (breakSlot != null) {
                        str2 = breakSlot.m50691l();
                    }
                    if (AbstractC19074t.m100204b(str2, video.m52911t())) {
                        this.f143911A.remove(i11);
                        this.f143912B.remove(i11);
                        m10016x(i11, 2);
                    }
                }
                m10017y(i11);
            } else {
                i11++;
            }
        }
        if (mo10003k() == 0 && (bVar = this.f143920w) != null) {
            bVar.mo55504v();
        }
    }

    @Override // z10.AbstractC31153a0, androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: t0 */
    public void mo9990A(a aVar, int i11) {
        AbstractC19074t.m100208f(aVar, "holder");
        Object obj = this.f143912B.get(i11);
        if (obj != null) {
            aVar.mo151882i0(obj);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: u0 */
    public void mo9991B(a aVar, int i11, List list) {
        AbstractC19074t.m100208f(aVar, "holder");
        AbstractC19074t.m100208f(list, "payloads");
        if (list.isEmpty()) {
            mo9990A(aVar, i11);
            return;
        }
        for (Object obj : list) {
            Object obj2 = this.f143912B.get(i11);
            if (obj2 != null) {
                AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                aVar.mo151883j0(obj2, (List) obj);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: v0 */
    public a mo9992C(ViewGroup viewGroup, int i11) {
        a aVar;
        Object m131545G;
        AbstractC19074t.m100208f(viewGroup, "parent");
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 != 5) {
                            if (i11 != 999) {
                                if (this.f143917G.isEmpty()) {
                                    m151879w0(viewGroup);
                                }
                                m131545G = AbstractC25378x.m131545G(this.f143917G);
                                AbstractC19074t.m100206d(m131545G, "null cannot be cast to non-null type com.zing.zalo.shortvideo.ui.component.rv.item.NormalVideoItem");
                                k kVar = new k(this, (NormalVideoItem) m131545G);
                                kVar.m151897k0().setCallback(new r(kVar, this));
                                return kVar;
                            }
                            View m134372M = AbstractC26112n.m134372M(viewGroup, AbstractC27410e.zch_item_video_shimmer, false, 2, null);
                            AbstractC19074t.m100206d(m134372M, "null cannot be cast to non-null type com.zing.zalo.shortvideo.ui.component.rv.item.ShimmerVideoItem");
                            aVar = new g(this, (ShimmerVideoItem) m134372M);
                        } else {
                            View m134372M2 = AbstractC26112n.m134372M(viewGroup, AbstractC27410e.zch_item_simple_livestream, false, 2, null);
                            AbstractC19074t.m100206d(m134372M2, "null cannot be cast to non-null type com.zing.zalo.shortvideo.ui.component.rv.item.SimpleLivestreamItem");
                            h hVar = new h(this, (SimpleLivestreamItem) m134372M2);
                            hVar.m151894k0().setCallback(new q(hVar, this));
                            aVar = hVar;
                        }
                    } else {
                        View m134372M3 = AbstractC26112n.m134372M(viewGroup, AbstractC27410e.zch_item_video_advertising, false, 2, null);
                        AbstractC19074t.m100206d(m134372M3, "null cannot be cast to non-null type com.zing.zalo.shortvideo.ui.component.rv.item.AdvertisingVideoItem");
                        j jVar = new j(this, (AdvertisingVideoItem) m134372M3);
                        jVar.m151896k0().setCallback(new p(jVar, this));
                        aVar = jVar;
                    }
                } else {
                    View m134372M4 = AbstractC26112n.m134372M(viewGroup, AbstractC27410e.zch_item_follow_suggestion, false, 2, null);
                    AbstractC19074t.m100206d(m134372M4, "null cannot be cast to non-null type com.zing.zalo.shortvideo.ui.component.rv.item.FollowSuggestionItem");
                    e eVar = new e(this, (FollowSuggestionItem) m134372M4);
                    eVar.m151892k0().setCallback(new m());
                    eVar.m151892k0().setPageSource(this.f143918u);
                    aVar = eVar;
                }
            } else {
                View m134372M5 = AbstractC26112n.m134372M(viewGroup, AbstractC27410e.zch_item_video_onboarding, false, 2, null);
                AbstractC19074t.m100206d(m134372M5, "null cannot be cast to non-null type com.zing.zalo.shortvideo.ui.component.rv.item.OnboardingVideoItem");
                f fVar = new f(this, (OnboardingVideoItem) m134372M5);
                fVar.m151893k0().setCallback(new n(fVar, this));
                aVar = fVar;
            }
        } else {
            View m134372M6 = AbstractC26112n.m134372M(viewGroup, AbstractC27410e.zch_item_video_survey, false, 2, null);
            AbstractC19074t.m100206d(m134372M6, "null cannot be cast to non-null type com.zing.zalo.shortvideo.ui.component.rv.item.SurveyVideoItem");
            i iVar = new i(this, (SurveyVideoItem) m134372M6);
            iVar.m151895k0().setCallback(new o(iVar, this));
            aVar = iVar;
        }
        return aVar;
    }

    /* renamed from: w0 */
    public final void m151879w0(ViewGroup viewGroup) {
        AbstractC19074t.m100208f(viewGroup, "parent");
        while (this.f143917G.size() < 5) {
            this.f143917G.add(AbstractC26112n.m134372M(viewGroup, AbstractC27410e.zch_item_video_normal, false, 2, null));
        }
    }

    /* renamed from: x0 */
    public final void m151880x0(int i11, Video video) {
        this.f143911A.remove(i11);
        this.f143912B.remove(i11);
        if (video != null) {
            List m51168m = this.f143919v.m51168m();
            AbstractC19074t.m100206d(m51168m, "null cannot be cast to non-null type java.util.ArrayList<com.zing.zalo.shortvideo.ui.model.Video>");
            ((ArrayList) m51168m).remove(video);
        }
    }

    /* renamed from: z0 */
    public final void m151881z0(int i11, Video video) {
        AbstractC19074t.m100208f(video, "video");
        Integer num = (Integer) this.f143911A.get(i11);
        if (num == null || num.intValue() != 0) {
            return;
        }
        this.f143912B.set(i11, video);
        List m51168m = this.f143919v.m51168m();
        AbstractC19074t.m100206d(m51168m, "null cannot be cast to non-null type java.util.ArrayList<com.zing.zalo.shortvideo.ui.model.Video>");
        ((ArrayList) m51168m).add(video);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31179n0(String str, Section section) {
        super(AbstractC19074t.m100204b(str, "SOURCE_FOR_U") ? 0 : 2);
        AbstractC19074t.m100208f(str, "source");
        AbstractC19074t.m100208f(section, "section");
        this.f143918u = str;
        this.f143919v = section;
        this.f143921x = new ArrayList();
        this.f143923z = new ArrayList();
        this.f143911A = new ArrayList();
        this.f143912B = new ArrayList();
        this.f143913C = new HashMap();
        this.f143914D = new HashMap();
        this.f143915E = new HashMap();
        this.f143917G = new ArrayList();
    }
}
