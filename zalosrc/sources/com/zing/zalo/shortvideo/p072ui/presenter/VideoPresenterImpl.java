package com.zing.zalo.shortvideo.p072ui.presenter;

import a10.C0054s;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import androidx.lifecycle.InterfaceC1801w;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.shortvideo.data.model.BreakSlot;
import com.zing.zalo.shortvideo.data.model.Channel;
import com.zing.zalo.shortvideo.data.model.CollectionVideo;
import com.zing.zalo.shortvideo.data.model.FollowingData;
import com.zing.zalo.shortvideo.data.model.ForUData;
import com.zing.zalo.shortvideo.data.model.FriendData;
import com.zing.zalo.shortvideo.data.model.LoadMoreInfo;
import com.zing.zalo.shortvideo.data.model.PersonalizeChannel;
import com.zing.zalo.shortvideo.data.model.PersonalizeStream;
import com.zing.zalo.shortvideo.data.model.Section;
import com.zing.zalo.shortvideo.data.model.SectionBoxData;
import com.zing.zalo.shortvideo.data.model.VideoAdsData;
import com.zing.zalo.shortvideo.data.remote.common.NetworkException;
import com.zing.zalo.shortvideo.p072ui.model.PersonalizeVideo;
import com.zing.zalo.shortvideo.p072ui.model.Video;
import com.zing.zalo.shortvideo.p072ui.model.VideoAdsInfo;
import com.zing.zalo.shortvideo.p072ui.presenter.VideoPresenterImpl;
import com.zing.zalo.shortvideo.p072ui.receiver.HeadsetReceiver;
import com.zing.zalo.shortvideo.p072ui.receiver.LoadMoreVideoReceiver;
import com.zing.zalo.shortvideo.p072ui.receiver.NetworkReceiver;
import com.zing.zalo.shortvideo.p072ui.view.InterfaceC10628f;
import com.zing.zalo.zinstant.zom.node.ZOM;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import e10.InterfaceC18170g;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import f10.EnumC18694f;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19059j0;
import g20.C19205a;
import ho0.AbstractC20110a;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.TimeoutKt;
import on0.AbstractC24341v;
import org.json.JSONArray;
import org.json.JSONObject;
import pm0.AbstractC24862s;
import pm0.AbstractC24866w;
import pm0.C24848g0;
import pm0.C24860q;
import q20.C25090m;
import q20.C25093p;
import q20.C25097t;
import qm0.AbstractC25332a0;
import qm0.AbstractC25361o0;
import qm0.AbstractC25370t;
import u10.C26947a;
import u10.C26948b;
import um0.InterfaceC27315f;
import v00.AbstractC27413h;
import v00.C27417l;
import vm0.AbstractC28298d;
import w00.AbstractC28684a;
import wm0.AbstractC29094b;
import wm0.AbstractC29104l;
import x00.InterfaceC29283d;
import y00.InterfaceC30248b;
import z10.C31179n0;

/* loaded from: classes5.dex */
public final class VideoPresenterImpl extends BasePresenterImpl<InterfaceC10628f> implements InterfaceC10058f {

    /* renamed from: A */
    private HashSet f52143A;

    /* renamed from: B */
    private String f52144B;

    /* renamed from: C */
    private String f52145C;

    /* renamed from: D */
    private String f52146D;

    /* renamed from: E */
    private String f52147E;

    /* renamed from: F */
    private String f52148F;

    /* renamed from: G */
    private String f52149G;

    /* renamed from: H */
    private String f52150H;

    /* renamed from: I */
    private Video f52151I;

    /* renamed from: J */
    private String f52152J;

    /* renamed from: K */
    private String f52153K;

    /* renamed from: L */
    private int f52154L;

    /* renamed from: M */
    private final HashMap f52155M;

    /* renamed from: N */
    private final HashMap f52156N;

    /* renamed from: O */
    private boolean f52157O;

    /* renamed from: P */
    private boolean f52158P;

    /* renamed from: Q */
    private boolean f52159Q;

    /* renamed from: R */
    private Handler f52160R;

    /* renamed from: S */
    private long f52161S;

    /* renamed from: T */
    private List f52162T;

    /* renamed from: U */
    private C24860q f52163U;

    /* renamed from: V */
    private C26947a f52164V;

    /* renamed from: W */
    private C25093p f52165W;

    /* renamed from: X */
    private final CoroutineScope f52166X;

    /* renamed from: Y */
    private boolean f52167Y;

    /* renamed from: Z */
    private boolean f52168Z;

    /* renamed from: r */
    private final InterfaceC18170g f52169r;

    /* renamed from: s */
    private final InterfaceC30248b f52170s;

    /* renamed from: t */
    private boolean f52171t;

    /* renamed from: u */
    private boolean f52172u;

    /* renamed from: v */
    private NetworkReceiver f52173v;

    /* renamed from: w */
    private HeadsetReceiver f52174w;

    /* renamed from: x */
    private final HashMap f52175x;

    /* renamed from: y */
    private final HashMap f52176y;

    /* renamed from: z */
    private final HashMap f52177z;

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.VideoPresenterImpl$a */
    /* loaded from: classes5.dex */
    public static final class C10008a implements Serializable {

        /* renamed from: p */
        private final Object f52178p;

        /* renamed from: q */
        private final Object f52179q;

        /* renamed from: r */
        private final Object f52180r;

        /* renamed from: s */
        private final Object f52181s;

        public C10008a(Object obj, Object obj2, Object obj3, Object obj4) {
            this.f52178p = obj;
            this.f52179q = obj2;
            this.f52180r = obj3;
            this.f52181s = obj4;
        }

        /* renamed from: a */
        public final Object m53595a() {
            return this.f52178p;
        }

        /* renamed from: b */
        public final Object m53596b() {
            return this.f52179q;
        }

        /* renamed from: c */
        public final Object m53597c() {
            return this.f52180r;
        }

        /* renamed from: d */
        public final Object m53598d() {
            return this.f52181s;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C10008a)) {
                return false;
            }
            C10008a c10008a = (C10008a) obj;
            return AbstractC19074t.m100204b(this.f52178p, c10008a.f52178p) && AbstractC19074t.m100204b(this.f52179q, c10008a.f52179q) && AbstractC19074t.m100204b(this.f52180r, c10008a.f52180r) && AbstractC19074t.m100204b(this.f52181s, c10008a.f52181s);
        }

        public int hashCode() {
            Object obj = this.f52178p;
            int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
            Object obj2 = this.f52179q;
            int hashCode2 = (hashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
            Object obj3 = this.f52180r;
            int hashCode3 = (hashCode2 + (obj3 == null ? 0 : obj3.hashCode())) * 31;
            Object obj4 = this.f52181s;
            return hashCode3 + (obj4 != null ? obj4.hashCode() : 0);
        }

        public String toString() {
            return "(" + this.f52178p + ", " + this.f52179q + ", " + this.f52180r + ", " + this.f52181s + ")";
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.VideoPresenterImpl$a0 */
    /* loaded from: classes5.dex */
    static final class C10009a0 extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ Channel f52183r;

        /* renamed from: s */
        final /* synthetic */ boolean f52184s;

        /* renamed from: t */
        final /* synthetic */ boolean f52185t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10009a0(Channel channel, boolean z11, boolean z12) {
            super(1);
            this.f52183r = channel;
            this.f52184s = z11;
            this.f52185t = z12;
        }

        /* renamed from: a */
        public final void m53599a(PersonalizeChannel personalizeChannel) {
            AbstractC19074t.m100208f(personalizeChannel, "personalize");
            ((InterfaceC10628f) VideoPresenterImpl.this.m52968s()).mo55382SH(this.f52183r, this.f52184s, this.f52185t, personalizeChannel);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53599a((PersonalizeChannel) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.VideoPresenterImpl$b */
    /* loaded from: classes5.dex */
    static final class C10010b extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f52186t;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.shortvideo.ui.presenter.VideoPresenterImpl$b$a */
        /* loaded from: classes5.dex */
        public static final class a extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ VideoPresenterImpl f52188q;

            /* renamed from: r */
            final /* synthetic */ List f52189r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(VideoPresenterImpl videoPresenterImpl, List list) {
                super(0);
                this.f52188q = videoPresenterImpl;
                this.f52189r = list;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: V4 */
            public /* bridge */ /* synthetic */ Object mo12V4() {
                m53601a();
                return C24848g0.f119245a;
            }

            /* renamed from: a */
            public final void m53601a() {
                this.f52188q.f52162T = this.f52189r;
                this.f52188q.f52160R.removeCallbacksAndMessages(null);
                if (this.f52188q.f52159Q) {
                    ((InterfaceC10628f) this.f52188q.m52968s()).mo55389fi(this.f52189r);
                    C24860q c24860q = this.f52188q.f52163U;
                    if (c24860q != null) {
                        ((InterfaceC10628f) this.f52188q.m52968s()).mo55393ir((List) c24860q.m129215c(), (LoadMoreInfo) c24860q.m129216d());
                    }
                    this.f52188q.f52162T = null;
                    this.f52188q.f52163U = null;
                } else {
                    ((InterfaceC10628f) this.f52188q.m52968s()).mo55389fi(this.f52189r);
                }
                this.f52188q.f52158P = true;
                this.f52188q.f52167Y = false;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.shortvideo.ui.presenter.VideoPresenterImpl$b$b */
        /* loaded from: classes5.dex */
        public static final class b extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ VideoPresenterImpl f52190q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(VideoPresenterImpl videoPresenterImpl) {
                super(0);
                this.f52190q = videoPresenterImpl;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: V4 */
            public /* bridge */ /* synthetic */ Object mo12V4() {
                m53602a();
                return C24848g0.f119245a;
            }

            /* renamed from: a */
            public final void m53602a() {
                this.f52190q.f52158P = true;
                this.f52190q.f52167Y = false;
            }
        }

        C10010b(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new C10010b(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            List list;
            int m131511r;
            Integer num;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f52186t;
            try {
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104548a("tannd3 getSectionBox ex: " + e11, new Object[0]);
                VideoPresenterImpl videoPresenterImpl = VideoPresenterImpl.this;
                b bVar = new b(videoPresenterImpl);
                this.f52186t = 5;
                if (videoPresenterImpl.m52971w(bVar, this) == m142578e) {
                    return m142578e;
                }
            }
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 != 4) {
                                if (i11 == 5) {
                                    AbstractC24862s.m129228b(obj);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                AbstractC24862s.m129228b(obj);
                            }
                            return C24848g0.f119245a;
                        }
                        AbstractC24862s.m129228b(obj);
                        list = (List) obj;
                    } else {
                        AbstractC24862s.m129228b(obj);
                        list = (List) obj;
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    list = (List) obj;
                }
            } else {
                AbstractC24862s.m129228b(obj);
                String str = VideoPresenterImpl.this.f52144B;
                int hashCode = str.hashCode();
                if (hashCode != -507563187) {
                    if (hashCode != 596808987) {
                        if (hashCode == 1323686722 && str.equals("SOURCE_FRIEND")) {
                            InterfaceC18170g interfaceC18170g = VideoPresenterImpl.this.f52169r;
                            this.f52186t = 3;
                            obj = interfaceC18170g.mo96606n(this);
                            if (obj == m142578e) {
                                return m142578e;
                            }
                            list = (List) obj;
                        }
                    } else if (str.equals("SOURCE_FOR_U")) {
                        InterfaceC18170g interfaceC18170g2 = VideoPresenterImpl.this.f52169r;
                        this.f52186t = 1;
                        obj = interfaceC18170g2.mo96549B(this);
                        if (obj == m142578e) {
                            return m142578e;
                        }
                        list = (List) obj;
                    }
                } else if (str.equals("SOURCE_FOLLOWING")) {
                    InterfaceC18170g interfaceC18170g3 = VideoPresenterImpl.this.f52169r;
                    this.f52186t = 2;
                    obj = interfaceC18170g3.mo96629z(this);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                    list = (List) obj;
                }
                list = null;
            }
            if (list != null) {
                VideoPresenterImpl videoPresenterImpl2 = VideoPresenterImpl.this;
                AbstractC20110a.a aVar = AbstractC20110a.f98889a;
                List<SectionBoxData> list2 = list;
                m131511r = AbstractC25370t.m131511r(list2, 10);
                ArrayList arrayList = new ArrayList(m131511r);
                for (SectionBoxData sectionBoxData : list2) {
                    List m51187d = sectionBoxData.m51187d();
                    List m51185b = sectionBoxData.m51185b();
                    if (m51185b != null) {
                        num = AbstractC29094b.m145341c(m51185b.size());
                    } else {
                        num = null;
                    }
                    arrayList.add("pos:" + m51187d + "  " + num);
                }
                aVar.mo104548a("tannd3 getSectionBox >> " + arrayList, new Object[0]);
                a aVar2 = new a(videoPresenterImpl2, list);
                this.f52186t = 4;
                if (videoPresenterImpl2.m52971w(aVar2, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C10010b) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.VideoPresenterImpl$b0 */
    /* loaded from: classes5.dex */
    public static final class C10011b0 extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f52191t;

        /* renamed from: u */
        final /* synthetic */ boolean f52192u;

        /* renamed from: v */
        final /* synthetic */ VideoPresenterImpl f52193v;

        /* renamed from: w */
        final /* synthetic */ Video f52194w;

        /* renamed from: x */
        final /* synthetic */ VideoAdsInfo f52195x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10011b0(boolean z11, VideoPresenterImpl videoPresenterImpl, Video video, VideoAdsInfo videoAdsInfo, Continuation continuation) {
            super(1, continuation);
            this.f52192u = z11;
            this.f52193v = videoPresenterImpl;
            this.f52194w = video;
            this.f52195x = videoAdsInfo;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            String str;
            String str2;
            String str3;
            String str4;
            Integer num;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f52191t;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        AbstractC24862s.m129228b(obj);
                        return (EnumC18694f) obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
                return (EnumC18694f) obj;
            }
            AbstractC24862s.m129228b(obj);
            String str5 = null;
            if (this.f52192u) {
                InterfaceC18170g interfaceC18170g = this.f52193v.f52169r;
                String m52911t = this.f52194w.m52911t();
                VideoAdsInfo videoAdsInfo = this.f52195x;
                if (videoAdsInfo != null) {
                    str2 = videoAdsInfo.m52928d();
                } else {
                    str2 = null;
                }
                VideoAdsInfo videoAdsInfo2 = this.f52195x;
                if (videoAdsInfo2 != null) {
                    str3 = videoAdsInfo2.m52929e();
                } else {
                    str3 = null;
                }
                C26947a.b bVar = C26947a.Companion;
                C26947a c26947a = this.f52193v.f52164V;
                if (c26947a != null) {
                    str4 = c26947a.m138825F();
                } else {
                    str4 = null;
                }
                C26948b.a m138839b = bVar.m138839b(str4, this.f52194w);
                if (m138839b != null) {
                    num = AbstractC29094b.m145341c(m138839b.m138882c());
                } else {
                    num = null;
                }
                C26947a c26947a2 = this.f52193v.f52164V;
                if (c26947a2 != null) {
                    str5 = c26947a2.m138825F();
                }
                Integer m145341c = AbstractC29094b.m145341c(bVar.m138841f(str5));
                this.f52191t = 1;
                obj = interfaceC18170g.mo96630z0(m52911t, str2, str3, num, m145341c, this);
                if (obj == m142578e) {
                    return m142578e;
                }
                return (EnumC18694f) obj;
            }
            InterfaceC18170g interfaceC18170g2 = this.f52193v.f52169r;
            String m52911t2 = this.f52194w.m52911t();
            VideoAdsInfo videoAdsInfo3 = this.f52195x;
            if (videoAdsInfo3 != null) {
                str = videoAdsInfo3.m52928d();
            } else {
                str = null;
            }
            VideoAdsInfo videoAdsInfo4 = this.f52195x;
            if (videoAdsInfo4 != null) {
                str5 = videoAdsInfo4.m52929e();
            }
            this.f52191t = 2;
            obj = interfaceC18170g2.mo96563J(m52911t2, str, str5, this);
            if (obj == m142578e) {
                return m142578e;
            }
            return (EnumC18694f) obj;
        }

        /* renamed from: r */
        public final Continuation m53603r(Continuation continuation) {
            return new C10011b0(this.f52192u, this.f52193v, this.f52194w, this.f52195x, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((C10011b0) m53603r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.VideoPresenterImpl$c */
    /* loaded from: classes5.dex */
    public static final class C10012c implements HeadsetReceiver.InterfaceC10075a {
        C10012c() {
        }

        @Override // com.zing.zalo.shortvideo.p072ui.receiver.HeadsetReceiver.InterfaceC10075a
        /* renamed from: a */
        public void mo53290a(boolean z11) {
            if (z11) {
                if (!VideoPresenterImpl.this.f52172u) {
                    VideoPresenterImpl.this.f52172u = true;
                    ((InterfaceC10628f) VideoPresenterImpl.this.m52968s()).mo55383W0(VideoPresenterImpl.this.f52172u);
                    return;
                }
                return;
            }
            if (VideoPresenterImpl.this.f52172u) {
                VideoPresenterImpl.this.f52172u = false;
                ((InterfaceC10628f) VideoPresenterImpl.this.m52968s()).mo55383W0(VideoPresenterImpl.this.f52172u);
            }
        }

        @Override // com.zing.zalo.shortvideo.p072ui.receiver.HeadsetReceiver.InterfaceC10075a
        /* renamed from: b */
        public void mo53291b(int[] iArr) {
            HeadsetReceiver.InterfaceC10075a.a.m53725a(this, iArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.VideoPresenterImpl$c0 */
    /* loaded from: classes5.dex */
    public static final class C10013c0 extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ Video f52198r;

        /* renamed from: s */
        final /* synthetic */ boolean f52199s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10013c0(Video video, boolean z11) {
            super(1);
            this.f52198r = video;
            this.f52199s = z11;
        }

        /* renamed from: a */
        public final void m53605a(Throwable th2) {
            Video video;
            long m52839D;
            long j11;
            AbstractC19074t.m100208f(th2, "throwable");
            if (AbstractC19074t.m100204b(VideoPresenterImpl.this.f52175x.remove(this.f52198r.m52911t()), Boolean.valueOf(this.f52199s))) {
                InterfaceC29283d m143692z = AbstractC28684a.Companion.m143692z();
                String m52911t = this.f52198r.m52911t();
                Boolean valueOf = Boolean.valueOf(!this.f52199s);
                if (this.f52199s) {
                    video = this.f52198r;
                    m52839D = video.m52839D();
                    j11 = -1;
                } else {
                    video = this.f52198r;
                    m52839D = video.m52839D();
                    j11 = 1;
                }
                video.m52860P0(m52839D + j11);
                m143692z.mo146382u(m52911t, valueOf, Long.valueOf(video.m52839D()));
                ((InterfaceC10628f) VideoPresenterImpl.this.m52968s()).mo55385X2(this.f52198r.m52911t(), !this.f52199s, th2);
            }
            VideoPresenterImpl.m53559t0(VideoPresenterImpl.this, this.f52199s, false);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53605a((Throwable) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.VideoPresenterImpl$d */
    /* loaded from: classes5.dex */
    static final class C10014d extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f52200t;

        /* renamed from: v */
        final /* synthetic */ LoadMoreInfo f52202v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10014d(LoadMoreInfo loadMoreInfo, Continuation continuation) {
            super(1, continuation);
            this.f52202v = loadMoreInfo;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f52200t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                InterfaceC18170g interfaceC18170g = VideoPresenterImpl.this.f52169r;
                LoadMoreInfo loadMoreInfo = this.f52202v;
                this.f52200t = 1;
                obj = interfaceC18170g.mo96608o(loadMoreInfo, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            return obj;
        }

        /* renamed from: r */
        public final Continuation m53606r(Continuation continuation) {
            return new C10014d(this.f52202v, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((C10014d) m53606r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.VideoPresenterImpl$d0 */
    /* loaded from: classes5.dex */
    public static final class C10015d0 extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ Video f52204r;

        /* renamed from: s */
        final /* synthetic */ boolean f52205s;

        /* renamed from: t */
        final /* synthetic */ VideoAdsInfo f52206t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10015d0(Video video, boolean z11, VideoAdsInfo videoAdsInfo) {
            super(1);
            this.f52204r = video;
            this.f52205s = z11;
            this.f52206t = videoAdsInfo;
        }

        /* renamed from: a */
        public final void m53608a(EnumC18694f enumC18694f) {
            AbstractC19074t.m100208f(enumC18694f, "it");
            if (!AbstractC19074t.m100204b(VideoPresenterImpl.this.f52175x.remove(this.f52204r.m52911t()), Boolean.valueOf(this.f52205s))) {
                VideoPresenterImpl.this.mo53567Jk(this.f52204r, !this.f52205s, this.f52206t);
            }
            if (this.f52205s) {
                AbstractC28684a.Companion.m143692z().mo146364c(this.f52204r);
            } else {
                AbstractC28684a.Companion.m143692z().mo146366e(this.f52204r);
            }
            VideoPresenterImpl.m53559t0(VideoPresenterImpl.this, this.f52205s, true);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53608a((EnumC18694f) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.VideoPresenterImpl$e */
    /* loaded from: classes5.dex */
    static final class C10016e extends AbstractC19075u implements InterfaceC18505l {
        C10016e() {
            super(1);
        }

        /* renamed from: a */
        public final void m53609a(Throwable th2) {
            AbstractC19074t.m100208f(th2, "it");
            VideoPresenterImpl.this.f52159Q = true;
            VideoPresenterImpl.this.f52168Z = false;
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53609a((Throwable) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.VideoPresenterImpl$e0 */
    /* loaded from: classes5.dex */
    public static final class C10017e0 extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f52208t;

        /* renamed from: v */
        final /* synthetic */ Video f52210v;

        /* renamed from: w */
        final /* synthetic */ boolean f52211w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10017e0(Video video, boolean z11, Continuation continuation) {
            super(1, continuation);
            this.f52210v = video;
            this.f52211w = z11;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f52208t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                InterfaceC18170g interfaceC18170g = VideoPresenterImpl.this.f52169r;
                String m52911t = this.f52210v.m52911t();
                boolean z11 = this.f52211w;
                this.f52208t = 1;
                obj = interfaceC18170g.mo96553D(m52911t, z11, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            return obj;
        }

        /* renamed from: r */
        public final Continuation m53610r(Continuation continuation) {
            return new C10017e0(this.f52210v, this.f52211w, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((C10017e0) m53610r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.VideoPresenterImpl$f */
    /* loaded from: classes5.dex */
    static final class C10018f extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ boolean f52212q;

        /* renamed from: r */
        final /* synthetic */ VideoPresenterImpl f52213r;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.shortvideo.ui.presenter.VideoPresenterImpl$f$a */
        /* loaded from: classes5.dex */
        public static final class a extends AbstractC19075u implements InterfaceC18509p {

            /* renamed from: q */
            public static final a f52214q = new a();

            a() {
                super(2);
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Integer mo240pC(VideoAdsData videoAdsData, VideoAdsData videoAdsData2) {
                int i11;
                int m51270i = videoAdsData.m51270i();
                int m51270i2 = videoAdsData2.m51270i();
                if (m51270i < m51270i2) {
                    i11 = -1;
                } else if (m51270i > m51270i2) {
                    i11 = 1;
                } else {
                    i11 = 0;
                }
                return Integer.valueOf(i11);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10018f(boolean z11, VideoPresenterImpl videoPresenterImpl) {
            super(1);
            this.f52212q = z11;
            this.f52213r = videoPresenterImpl;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public static final int m53614d(InterfaceC18509p interfaceC18509p, Object obj, Object obj2) {
            AbstractC19074t.m100208f(interfaceC18509p, "$tmp0");
            return ((Number) interfaceC18509p.mo240pC(obj, obj2)).intValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public static final void m53615e(VideoPresenterImpl videoPresenterImpl, List list, Section section) {
            AbstractC19074t.m100208f(videoPresenterImpl, "this$0");
            AbstractC19074t.m100208f(list, "$listAds");
            AbstractC19074t.m100208f(section, "$it");
            List list2 = videoPresenterImpl.f52162T;
            if (list2 != null) {
                ((InterfaceC10628f) videoPresenterImpl.m52968s()).mo55389fi(list2);
            }
            ((InterfaceC10628f) videoPresenterImpl.m52968s()).mo55393ir(list, section.m51169n());
            videoPresenterImpl.f52163U = null;
            videoPresenterImpl.f52162T = null;
        }

        /* renamed from: c */
        public final void m53616c(final Section section) {
            int m131511r;
            Boolean bool;
            List m131177E0;
            int m131511r2;
            AbstractC19074t.m100208f(section, "it");
            AbstractC20110a.a aVar = AbstractC20110a.f98889a;
            boolean z11 = this.f52212q;
            List m51168m = section.m51168m();
            m131511r = AbstractC25370t.m131511r(m51168m, 10);
            ArrayList arrayList = new ArrayList(m131511r);
            Iterator it = m51168m.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((VideoAdsData) it.next()).m51270i()));
            }
            LoadMoreInfo m51169n = section.m51169n();
            if (m51169n != null) {
                bool = Boolean.valueOf(m51169n.isValid());
            } else {
                bool = null;
            }
            aVar.mo104548a("tannd3 ads loadAds response refresh:" + z11 + " ads:" + arrayList + " loadMore valid:" + bool, new Object[0]);
            if (!section.m51168m().isEmpty()) {
                List m51168m2 = section.m51168m();
                final a aVar2 = a.f52214q;
                m131177E0 = AbstractC25332a0.m131177E0(m51168m2, new Comparator() { // from class: com.zing.zalo.shortvideo.ui.presenter.g
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        int m53614d;
                        m53614d = VideoPresenterImpl.C10018f.m53614d(InterfaceC18509p.this, obj, obj2);
                        return m53614d;
                    }
                });
                List<VideoAdsData> list = m131177E0;
                m131511r2 = AbstractC25370t.m131511r(list, 10);
                ArrayList arrayList2 = new ArrayList(m131511r2);
                for (VideoAdsData videoAdsData : list) {
                    Video video = new Video(videoAdsData.m51275n());
                    video.m52840D0(new VideoAdsInfo(videoAdsData));
                    arrayList2.add(video);
                }
                final ArrayList arrayList3 = new ArrayList();
                for (Object obj : arrayList2) {
                    Video video2 = (Video) obj;
                    VideoAdsInfo m52881b = video2.m52881b();
                    if (m52881b != null && m52881b.isValid() && video2.m52905o0()) {
                        arrayList3.add(obj);
                    }
                }
                if (!this.f52213r.f52158P && this.f52212q) {
                    this.f52213r.f52163U = new C24860q(arrayList3, section.m51169n());
                    this.f52213r.f52160R.removeCallbacksAndMessages(null);
                    Handler handler = this.f52213r.f52160R;
                    final VideoPresenterImpl videoPresenterImpl = this.f52213r;
                    handler.postDelayed(new Runnable() { // from class: com.zing.zalo.shortvideo.ui.presenter.h
                        @Override // java.lang.Runnable
                        public final void run() {
                            VideoPresenterImpl.C10018f.m53615e(VideoPresenterImpl.this, arrayList3, section);
                        }
                    }, this.f52213r.f52161S);
                } else {
                    ((InterfaceC10628f) this.f52213r.m52968s()).mo55393ir(arrayList3, section.m51169n());
                    this.f52213r.f52163U = null;
                    this.f52213r.f52162T = null;
                }
                this.f52213r.f52159Q = true;
            }
            this.f52213r.f52168Z = false;
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53616c((Section) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.VideoPresenterImpl$f0 */
    /* loaded from: classes5.dex */
    public static final class C10019f0 extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ Video f52216r;

        /* renamed from: s */
        final /* synthetic */ boolean f52217s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10019f0(Video video, boolean z11) {
            super(1);
            this.f52216r = video;
            this.f52217s = z11;
        }

        /* renamed from: a */
        public final void m53618a(Throwable th2) {
            AbstractC19074t.m100208f(th2, "it");
            if (AbstractC19074t.m100204b(VideoPresenterImpl.this.f52156N.remove(this.f52216r.m52911t()), Boolean.valueOf(this.f52217s))) {
                ((InterfaceC10628f) VideoPresenterImpl.this.m52968s()).mo55377J8(this.f52216r.m52911t(), this.f52217s, th2);
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53618a((Throwable) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.VideoPresenterImpl$g */
    /* loaded from: classes5.dex */
    static final class C10020g extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f52218t;

        /* renamed from: v */
        final /* synthetic */ List f52220v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10020g(List list, Continuation continuation) {
            super(1, continuation);
            this.f52220v = list;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f52218t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                InterfaceC18170g interfaceC18170g = VideoPresenterImpl.this.f52169r;
                List list = this.f52220v;
                this.f52218t = 1;
                obj = interfaceC18170g.mo96555E(list, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            return obj;
        }

        /* renamed from: r */
        public final Continuation m53619r(Continuation continuation) {
            return new C10020g(this.f52220v, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((C10020g) m53619r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.VideoPresenterImpl$g0 */
    /* loaded from: classes5.dex */
    public static final class C10021g0 extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ Video f52222r;

        /* renamed from: s */
        final /* synthetic */ boolean f52223s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10021g0(Video video, boolean z11) {
            super(1);
            this.f52222r = video;
            this.f52223s = z11;
        }

        /* renamed from: a */
        public final void m53621a(EnumC18694f enumC18694f) {
            AbstractC19074t.m100208f(enumC18694f, "it");
            if (!AbstractC19074t.m100204b(VideoPresenterImpl.this.f52156N.remove(this.f52222r.m52911t()), Boolean.valueOf(this.f52223s))) {
                VideoPresenterImpl.this.mo53591ss(this.f52222r, !this.f52223s);
            }
            ((InterfaceC10628f) VideoPresenterImpl.this.m52968s()).mo55377J8(this.f52222r.m52911t(), this.f52223s, null);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53621a((EnumC18694f) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.VideoPresenterImpl$h */
    /* loaded from: classes5.dex */
    static final class C10022h extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ Map f52224q;

        /* renamed from: r */
        final /* synthetic */ VideoPresenterImpl f52225r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10022h(Map map, VideoPresenterImpl videoPresenterImpl) {
            super(1);
            this.f52224q = map;
            this.f52225r = videoPresenterImpl;
        }

        /* renamed from: a */
        public final void m53622a(List list) {
            AbstractC19074t.m100208f(list, "streams");
            HashMap hashMap = new HashMap();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                PersonalizeStream personalizeStream = (PersonalizeStream) it.next();
                Integer num = (Integer) this.f52224q.get(personalizeStream.m51115b());
                if (num != null) {
                    int intValue = num.intValue();
                    this.f52225r.f52177z.put(personalizeStream.m51115b(), Integer.valueOf(intValue));
                    hashMap.put(Integer.valueOf(intValue), personalizeStream);
                }
            }
            ((InterfaceC10628f) this.f52225r.m52968s()).mo55378Ja(hashMap);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53622a((List) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.VideoPresenterImpl$h0 */
    /* loaded from: classes5.dex */
    static final class C10023h0 extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f52226t;

        /* renamed from: u */
        final /* synthetic */ boolean f52227u;

        /* renamed from: v */
        final /* synthetic */ VideoPresenterImpl f52228v;

        /* renamed from: w */
        final /* synthetic */ Video f52229w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10023h0(boolean z11, VideoPresenterImpl videoPresenterImpl, Video video, Continuation continuation) {
            super(1, continuation);
            this.f52227u = z11;
            this.f52228v = videoPresenterImpl;
            this.f52229w = video;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f52226t;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        AbstractC24862s.m129228b(obj);
                        return (EnumC18694f) obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
                return (EnumC18694f) obj;
            }
            AbstractC24862s.m129228b(obj);
            if (this.f52227u) {
                InterfaceC18170g interfaceC18170g = this.f52228v.f52169r;
                String m52911t = this.f52229w.m52911t();
                this.f52226t = 1;
                obj = interfaceC18170g.mo96567N(m52911t, this);
                if (obj == m142578e) {
                    return m142578e;
                }
                return (EnumC18694f) obj;
            }
            InterfaceC18170g interfaceC18170g2 = this.f52228v.f52169r;
            String m52911t2 = this.f52229w.m52911t();
            this.f52226t = 2;
            obj = interfaceC18170g2.mo96611p0(m52911t2, this);
            if (obj == m142578e) {
                return m142578e;
            }
            return (EnumC18694f) obj;
        }

        /* renamed from: r */
        public final Continuation m53623r(Continuation continuation) {
            return new C10023h0(this.f52227u, this.f52228v, this.f52229w, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((C10023h0) m53623r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.VideoPresenterImpl$i */
    /* loaded from: classes5.dex */
    public static final class C10024i extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f52230t;

        /* renamed from: v */
        final /* synthetic */ String f52232v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10024i(String str, Continuation continuation) {
            super(1, continuation);
            this.f52232v = str;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f52230t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                InterfaceC18170g interfaceC18170g = VideoPresenterImpl.this.f52169r;
                String str = this.f52232v;
                this.f52230t = 1;
                obj = interfaceC18170g.mo96597i0(str, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            return obj;
        }

        /* renamed from: r */
        public final Continuation m53625r(Continuation continuation) {
            return new C10024i(this.f52232v, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((C10024i) m53625r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.VideoPresenterImpl$i0 */
    /* loaded from: classes5.dex */
    static final class C10025i0 extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ Video f52234r;

        /* renamed from: s */
        final /* synthetic */ boolean f52235s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10025i0(Video video, boolean z11) {
            super(1);
            this.f52234r = video;
            this.f52235s = z11;
        }

        /* renamed from: a */
        public final void m53627a(Throwable th2) {
            AbstractC19074t.m100208f(th2, "throwable");
            ((InterfaceC10628f) VideoPresenterImpl.this.m52968s()).mo55376Fd(this.f52234r, this.f52235s, th2);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53627a((Throwable) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.VideoPresenterImpl$j */
    /* loaded from: classes5.dex */
    public static final class C10026j extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ C19059j0 f52236q;

        /* renamed from: r */
        final /* synthetic */ C19059j0 f52237r;

        /* renamed from: s */
        final /* synthetic */ C19059j0 f52238s;

        /* renamed from: t */
        final /* synthetic */ C19059j0 f52239t;

        /* renamed from: u */
        final /* synthetic */ C19059j0 f52240u;

        /* renamed from: v */
        final /* synthetic */ C19059j0 f52241v;

        /* renamed from: w */
        final /* synthetic */ C19059j0 f52242w;

        /* renamed from: x */
        final /* synthetic */ VideoPresenterImpl f52243x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10026j(C19059j0 c19059j0, C19059j0 c19059j02, C19059j0 c19059j03, C19059j0 c19059j04, C19059j0 c19059j05, C19059j0 c19059j06, C19059j0 c19059j07, VideoPresenterImpl videoPresenterImpl) {
            super(1);
            this.f52236q = c19059j0;
            this.f52237r = c19059j02;
            this.f52238s = c19059j03;
            this.f52239t = c19059j04;
            this.f52240u = c19059j05;
            this.f52241v = c19059j06;
            this.f52242w = c19059j07;
            this.f52243x = videoPresenterImpl;
        }

        /* renamed from: a */
        public final void m53628a(Throwable th2) {
            AbstractC19074t.m100208f(th2, "throwable");
            this.f52236q.f94941p = th2;
            VideoPresenterImpl.m53558s0(this.f52243x, (Video) this.f52237r.f94941p, th2, (Section) this.f52238s.f94941p, (Throwable) this.f52239t.f94941p, (List) this.f52240u.f94941p, (Boolean) this.f52241v.f94941p, (List) this.f52242w.f94941p);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53628a((Throwable) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.VideoPresenterImpl$j0 */
    /* loaded from: classes5.dex */
    static final class C10027j0 extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ Video f52244q;

        /* renamed from: r */
        final /* synthetic */ boolean f52245r;

        /* renamed from: s */
        final /* synthetic */ VideoPresenterImpl f52246s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10027j0(Video video, boolean z11, VideoPresenterImpl videoPresenterImpl) {
            super(1);
            this.f52244q = video;
            this.f52245r = z11;
            this.f52246s = videoPresenterImpl;
        }

        /* renamed from: a */
        public final void m53629a(EnumC18694f enumC18694f) {
            AbstractC19074t.m100208f(enumC18694f, "it");
            this.f52244q.m52862Q0(this.f52245r);
            InterfaceC10628f.a.m55558b((InterfaceC10628f) this.f52246s.m52968s(), this.f52244q, this.f52245r, null, 4, null);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53629a((EnumC18694f) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.VideoPresenterImpl$k */
    /* loaded from: classes5.dex */
    public static final class C10028k extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ Video f52247q;

        /* renamed from: r */
        final /* synthetic */ C19059j0 f52248r;

        /* renamed from: s */
        final /* synthetic */ C19059j0 f52249s;

        /* renamed from: t */
        final /* synthetic */ C19059j0 f52250t;

        /* renamed from: u */
        final /* synthetic */ C19059j0 f52251u;

        /* renamed from: v */
        final /* synthetic */ C19059j0 f52252v;

        /* renamed from: w */
        final /* synthetic */ C19059j0 f52253w;

        /* renamed from: x */
        final /* synthetic */ C19059j0 f52254x;

        /* renamed from: y */
        final /* synthetic */ VideoPresenterImpl f52255y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10028k(Video video, C19059j0 c19059j0, C19059j0 c19059j02, C19059j0 c19059j03, C19059j0 c19059j04, C19059j0 c19059j05, C19059j0 c19059j06, C19059j0 c19059j07, VideoPresenterImpl videoPresenterImpl) {
            super(1);
            this.f52247q = video;
            this.f52248r = c19059j0;
            this.f52249s = c19059j02;
            this.f52250t = c19059j03;
            this.f52251u = c19059j04;
            this.f52252v = c19059j05;
            this.f52253w = c19059j06;
            this.f52254x = c19059j07;
            this.f52255y = videoPresenterImpl;
        }

        /* renamed from: a */
        public final void m53630a(Video video) {
            AbstractC19074t.m100208f(video, "video");
            video.m52852K0(this.f52247q.m52909q0());
            video.m52844G0(this.f52247q.m52893i0());
            video.m52843F0(this.f52247q.m52891h0());
            video.m52887f().m50770l0(this.f52247q.m52887f().m50741Q());
            video.m52846H0(this.f52247q.m52895j0());
            video.m52874W0(this.f52247q.m52921z0());
            video.m52872V0(this.f52247q.m52918x0());
            video.m52868T0(this.f52247q.m52858O());
            video.m52870U0(this.f52247q.m52861Q());
            video.m52853L0(0);
            this.f52248r.f94941p = video;
            VideoPresenterImpl.m53558s0(this.f52255y, video, (Throwable) this.f52249s.f94941p, (Section) this.f52250t.f94941p, (Throwable) this.f52251u.f94941p, (List) this.f52252v.f94941p, (Boolean) this.f52253w.f94941p, (List) this.f52254x.f94941p);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53630a((Video) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.VideoPresenterImpl$k0 */
    /* loaded from: classes5.dex */
    static final class C10029k0 extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f52256t;

        /* renamed from: v */
        final /* synthetic */ boolean f52258v;

        /* renamed from: w */
        final /* synthetic */ BreakSlot f52259w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10029k0(boolean z11, BreakSlot breakSlot, Continuation continuation) {
            super(1, continuation);
            this.f52258v = z11;
            this.f52259w = breakSlot;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            BreakSlot breakSlot;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f52256t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                InterfaceC18170g interfaceC18170g = VideoPresenterImpl.this.f52169r;
                if (this.f52258v) {
                    breakSlot = null;
                } else {
                    breakSlot = this.f52259w;
                }
                this.f52256t = 1;
                obj = interfaceC18170g.mo96559G(breakSlot, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            return obj;
        }

        /* renamed from: r */
        public final Continuation m53631r(Continuation continuation) {
            return new C10029k0(this.f52258v, this.f52259w, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((C10029k0) m53631r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.VideoPresenterImpl$l */
    /* loaded from: classes5.dex */
    public static final class C10030l extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: A */
        Object f52260A;

        /* renamed from: B */
        Object f52261B;

        /* renamed from: C */
        Object f52262C;

        /* renamed from: D */
        Object f52263D;

        /* renamed from: E */
        boolean f52264E;

        /* renamed from: F */
        int f52265F;

        /* renamed from: G */
        private /* synthetic */ Object f52266G;

        /* renamed from: I */
        final /* synthetic */ LoadMoreInfo f52268I;

        /* renamed from: J */
        final /* synthetic */ C19059j0 f52269J;

        /* renamed from: K */
        final /* synthetic */ C19059j0 f52270K;

        /* renamed from: L */
        final /* synthetic */ C19059j0 f52271L;

        /* renamed from: M */
        final /* synthetic */ C19059j0 f52272M;

        /* renamed from: N */
        final /* synthetic */ C19059j0 f52273N;

        /* renamed from: O */
        final /* synthetic */ C19059j0 f52274O;

        /* renamed from: P */
        final /* synthetic */ C19059j0 f52275P;

        /* renamed from: t */
        Object f52276t;

        /* renamed from: u */
        Object f52277u;

        /* renamed from: v */
        Object f52278v;

        /* renamed from: w */
        Object f52279w;

        /* renamed from: x */
        Object f52280x;

        /* renamed from: y */
        Object f52281y;

        /* renamed from: z */
        Object f52282z;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.shortvideo.ui.presenter.VideoPresenterImpl$l$a */
        /* loaded from: classes5.dex */
        public static final class a extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ VideoPresenterImpl f52283q;

            /* renamed from: r */
            final /* synthetic */ Section f52284r;

            /* renamed from: s */
            final /* synthetic */ List f52285s;

            /* renamed from: t */
            final /* synthetic */ boolean f52286t;

            /* renamed from: u */
            final /* synthetic */ List f52287u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(VideoPresenterImpl videoPresenterImpl, Section section, List list, boolean z11, List list2) {
                super(0);
                this.f52283q = videoPresenterImpl;
                this.f52284r = section;
                this.f52285s = list;
                this.f52286t = z11;
                this.f52287u = list2;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: V4 */
            public /* bridge */ /* synthetic */ Object mo12V4() {
                m53634a();
                return C24848g0.f119245a;
            }

            /* renamed from: a */
            public final void m53634a() {
                ((InterfaceC10628f) this.f52283q.m52968s()).mo55403xw(this.f52284r, this.f52285s, this.f52286t, this.f52287u);
                this.f52283q.f52157O = false;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.shortvideo.ui.presenter.VideoPresenterImpl$l$b */
        /* loaded from: classes5.dex */
        public static final class b extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: A */
            final /* synthetic */ C19059j0 f52288A;

            /* renamed from: B */
            final /* synthetic */ C19059j0 f52289B;

            /* renamed from: q */
            final /* synthetic */ VideoPresenterImpl f52290q;

            /* renamed from: r */
            final /* synthetic */ Section f52291r;

            /* renamed from: s */
            final /* synthetic */ List f52292s;

            /* renamed from: t */
            final /* synthetic */ List f52293t;

            /* renamed from: u */
            final /* synthetic */ C19059j0 f52294u;

            /* renamed from: v */
            final /* synthetic */ C19059j0 f52295v;

            /* renamed from: w */
            final /* synthetic */ C19059j0 f52296w;

            /* renamed from: x */
            final /* synthetic */ boolean f52297x;

            /* renamed from: y */
            final /* synthetic */ C19059j0 f52298y;

            /* renamed from: z */
            final /* synthetic */ C19059j0 f52299z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(VideoPresenterImpl videoPresenterImpl, Section section, List list, List list2, C19059j0 c19059j0, C19059j0 c19059j02, C19059j0 c19059j03, boolean z11, C19059j0 c19059j04, C19059j0 c19059j05, C19059j0 c19059j06, C19059j0 c19059j07) {
                super(0);
                this.f52290q = videoPresenterImpl;
                this.f52291r = section;
                this.f52292s = list;
                this.f52293t = list2;
                this.f52294u = c19059j0;
                this.f52295v = c19059j02;
                this.f52296w = c19059j03;
                this.f52297x = z11;
                this.f52298y = c19059j04;
                this.f52299z = c19059j05;
                this.f52288A = c19059j06;
                this.f52289B = c19059j07;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: V4 */
            public /* bridge */ /* synthetic */ Object mo12V4() {
                m53635a();
                return C24848g0.f119245a;
            }

            /* renamed from: a */
            public final void m53635a() {
                if (this.f52290q.f52151I == null) {
                    ((InterfaceC10628f) this.f52290q.m52968s()).mo55380MD(this.f52291r, this.f52292s, this.f52293t);
                    this.f52290q.f52157O = false;
                    return;
                }
                this.f52294u.f94941p = this.f52291r;
                this.f52295v.f94941p = this.f52292s;
                this.f52296w.f94941p = Boolean.valueOf(this.f52297x);
                C19059j0 c19059j0 = this.f52298y;
                List list = this.f52293t;
                c19059j0.f94941p = list;
                VideoPresenterImpl.m53558s0(this.f52290q, (Video) this.f52299z.f94941p, (Throwable) this.f52288A.f94941p, (Section) this.f52294u.f94941p, (Throwable) this.f52289B.f94941p, (List) this.f52295v.f94941p, (Boolean) this.f52296w.f94941p, list);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.shortvideo.ui.presenter.VideoPresenterImpl$l$c */
        /* loaded from: classes5.dex */
        public static final class c extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ VideoPresenterImpl f52300q;

            /* renamed from: r */
            final /* synthetic */ Exception f52301r;

            /* renamed from: s */
            final /* synthetic */ C19059j0 f52302s;

            /* renamed from: t */
            final /* synthetic */ C19059j0 f52303t;

            /* renamed from: u */
            final /* synthetic */ C19059j0 f52304u;

            /* renamed from: v */
            final /* synthetic */ C19059j0 f52305v;

            /* renamed from: w */
            final /* synthetic */ C19059j0 f52306w;

            /* renamed from: x */
            final /* synthetic */ C19059j0 f52307x;

            /* renamed from: y */
            final /* synthetic */ C19059j0 f52308y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(VideoPresenterImpl videoPresenterImpl, Exception exc, C19059j0 c19059j0, C19059j0 c19059j02, C19059j0 c19059j03, C19059j0 c19059j04, C19059j0 c19059j05, C19059j0 c19059j06, C19059j0 c19059j07) {
                super(0);
                this.f52300q = videoPresenterImpl;
                this.f52301r = exc;
                this.f52302s = c19059j0;
                this.f52303t = c19059j02;
                this.f52304u = c19059j03;
                this.f52305v = c19059j04;
                this.f52306w = c19059j05;
                this.f52307x = c19059j06;
                this.f52308y = c19059j07;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: V4 */
            public /* bridge */ /* synthetic */ Object mo12V4() {
                m53636a();
                return C24848g0.f119245a;
            }

            /* renamed from: a */
            public final void m53636a() {
                if (this.f52300q.f52151I == null) {
                    ((InterfaceC10628f) this.f52300q.m52968s()).mo55388d(this.f52301r);
                    this.f52300q.f52157O = false;
                } else {
                    C19059j0 c19059j0 = this.f52302s;
                    Exception exc = this.f52301r;
                    c19059j0.f94941p = exc;
                    VideoPresenterImpl.m53558s0(this.f52300q, (Video) this.f52303t.f94941p, (Throwable) this.f52304u.f94941p, (Section) this.f52305v.f94941p, exc, (List) this.f52306w.f94941p, (Boolean) this.f52307x.f94941p, (List) this.f52308y.f94941p);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10030l(LoadMoreInfo loadMoreInfo, C19059j0 c19059j0, C19059j0 c19059j02, C19059j0 c19059j03, C19059j0 c19059j04, C19059j0 c19059j05, C19059j0 c19059j06, C19059j0 c19059j07, Continuation continuation) {
            super(2, continuation);
            this.f52268I = loadMoreInfo;
            this.f52269J = c19059j0;
            this.f52270K = c19059j02;
            this.f52271L = c19059j03;
            this.f52272M = c19059j04;
            this.f52273N = c19059j05;
            this.f52274O = c19059j06;
            this.f52275P = c19059j07;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            C10030l c10030l = new C10030l(this.f52268I, this.f52269J, this.f52270K, this.f52271L, this.f52272M, this.f52273N, this.f52274O, this.f52275P, continuation);
            c10030l.f52266G = obj;
            return c10030l;
        }

        /* JADX WARN: Failed to find 'out' block for switch in B:196:0x0199. Please report as an issue. */
        /* JADX WARN: Failed to find 'out' block for switch in B:3:0x001a. Please report as an issue. */
        /* JADX WARN: Removed duplicated region for block: B:102:0x0532 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:110:0x0565 A[Catch: Exception -> 0x002f, TryCatch #0 {Exception -> 0x002f, blocks: (B:10:0x002a, B:12:0x0071, B:14:0x05ba, B:15:0x05cd, B:17:0x05d3, B:19:0x05ed, B:24:0x05f5, B:26:0x05ff, B:28:0x0605, B:30:0x060c, B:32:0x0613, B:33:0x0624, B:34:0x0639, B:36:0x0664, B:37:0x066c, B:39:0x0733, B:53:0x0671, B:56:0x067b, B:57:0x0691, B:60:0x069b, B:61:0x06b1, B:64:0x06c5, B:65:0x06bb, B:68:0x06da, B:71:0x06e3, B:72:0x06f8, B:75:0x0701, B:76:0x0716, B:79:0x071f, B:81:0x00a2, B:83:0x035d, B:85:0x040e, B:87:0x0430, B:89:0x0437, B:90:0x04dc, B:91:0x0507, B:93:0x050d, B:95:0x051d, B:100:0x0523, B:103:0x0534, B:105:0x053a, B:108:0x055b, B:110:0x0565, B:112:0x056f, B:113:0x0582, B:118:0x0468, B:120:0x0472, B:122:0x0479, B:123:0x049a, B:125:0x04a0, B:127:0x04a7, B:128:0x04c6, B:130:0x04ca, B:132:0x04d1, B:133:0x076a, B:134:0x076f, B:140:0x00b4, B:142:0x0334, B:144:0x00c6, B:146:0x0270, B:148:0x00d8, B:150:0x040a, B:152:0x00ea, B:154:0x0293, B:156:0x00fc, B:158:0x01c7, B:160:0x010e, B:162:0x01f4, B:164:0x0120, B:166:0x0244, B:168:0x0132, B:170:0x03db, B:172:0x0142, B:174:0x03b5, B:176:0x0154, B:178:0x02c9, B:180:0x02d3, B:181:0x02ec, B:183:0x02f2, B:185:0x0300, B:187:0x0166, B:189:0x021b, B:191:0x0178, B:193:0x038d, B:195:0x0189, B:196:0x0199, B:198:0x0770, B:199:0x0775, B:200:0x019e, B:202:0x01a6, B:205:0x01d0, B:207:0x01d8, B:210:0x01fb, B:212:0x0205, B:215:0x021e, B:217:0x0226, B:220:0x0247, B:222:0x0251, B:225:0x0274, B:227:0x027c, B:230:0x0297, B:232:0x029f, B:234:0x02b5, B:235:0x02bb, B:239:0x0307, B:242:0x0315, B:244:0x031d, B:247:0x0338, B:249:0x0340, B:252:0x0361, B:254:0x0369, B:256:0x0377, B:257:0x037d, B:261:0x0391, B:263:0x0399, B:266:0x03b9, B:268:0x03bf, B:271:0x03e1, B:273:0x03e9), top: B:2:0x001a }] */
        /* JADX WARN: Removed duplicated region for block: B:117:0x064b  */
        /* JADX WARN: Removed duplicated region for block: B:118:0x0468 A[Catch: Exception -> 0x002f, TryCatch #0 {Exception -> 0x002f, blocks: (B:10:0x002a, B:12:0x0071, B:14:0x05ba, B:15:0x05cd, B:17:0x05d3, B:19:0x05ed, B:24:0x05f5, B:26:0x05ff, B:28:0x0605, B:30:0x060c, B:32:0x0613, B:33:0x0624, B:34:0x0639, B:36:0x0664, B:37:0x066c, B:39:0x0733, B:53:0x0671, B:56:0x067b, B:57:0x0691, B:60:0x069b, B:61:0x06b1, B:64:0x06c5, B:65:0x06bb, B:68:0x06da, B:71:0x06e3, B:72:0x06f8, B:75:0x0701, B:76:0x0716, B:79:0x071f, B:81:0x00a2, B:83:0x035d, B:85:0x040e, B:87:0x0430, B:89:0x0437, B:90:0x04dc, B:91:0x0507, B:93:0x050d, B:95:0x051d, B:100:0x0523, B:103:0x0534, B:105:0x053a, B:108:0x055b, B:110:0x0565, B:112:0x056f, B:113:0x0582, B:118:0x0468, B:120:0x0472, B:122:0x0479, B:123:0x049a, B:125:0x04a0, B:127:0x04a7, B:128:0x04c6, B:130:0x04ca, B:132:0x04d1, B:133:0x076a, B:134:0x076f, B:140:0x00b4, B:142:0x0334, B:144:0x00c6, B:146:0x0270, B:148:0x00d8, B:150:0x040a, B:152:0x00ea, B:154:0x0293, B:156:0x00fc, B:158:0x01c7, B:160:0x010e, B:162:0x01f4, B:164:0x0120, B:166:0x0244, B:168:0x0132, B:170:0x03db, B:172:0x0142, B:174:0x03b5, B:176:0x0154, B:178:0x02c9, B:180:0x02d3, B:181:0x02ec, B:183:0x02f2, B:185:0x0300, B:187:0x0166, B:189:0x021b, B:191:0x0178, B:193:0x038d, B:195:0x0189, B:196:0x0199, B:198:0x0770, B:199:0x0775, B:200:0x019e, B:202:0x01a6, B:205:0x01d0, B:207:0x01d8, B:210:0x01fb, B:212:0x0205, B:215:0x021e, B:217:0x0226, B:220:0x0247, B:222:0x0251, B:225:0x0274, B:227:0x027c, B:230:0x0297, B:232:0x029f, B:234:0x02b5, B:235:0x02bb, B:239:0x0307, B:242:0x0315, B:244:0x031d, B:247:0x0338, B:249:0x0340, B:252:0x0361, B:254:0x0369, B:256:0x0377, B:257:0x037d, B:261:0x0391, B:263:0x0399, B:266:0x03b9, B:268:0x03bf, B:271:0x03e1, B:273:0x03e9), top: B:2:0x001a }] */
        /* JADX WARN: Removed duplicated region for block: B:138:0x0434  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x05d3 A[Catch: Exception -> 0x002f, TryCatch #0 {Exception -> 0x002f, blocks: (B:10:0x002a, B:12:0x0071, B:14:0x05ba, B:15:0x05cd, B:17:0x05d3, B:19:0x05ed, B:24:0x05f5, B:26:0x05ff, B:28:0x0605, B:30:0x060c, B:32:0x0613, B:33:0x0624, B:34:0x0639, B:36:0x0664, B:37:0x066c, B:39:0x0733, B:53:0x0671, B:56:0x067b, B:57:0x0691, B:60:0x069b, B:61:0x06b1, B:64:0x06c5, B:65:0x06bb, B:68:0x06da, B:71:0x06e3, B:72:0x06f8, B:75:0x0701, B:76:0x0716, B:79:0x071f, B:81:0x00a2, B:83:0x035d, B:85:0x040e, B:87:0x0430, B:89:0x0437, B:90:0x04dc, B:91:0x0507, B:93:0x050d, B:95:0x051d, B:100:0x0523, B:103:0x0534, B:105:0x053a, B:108:0x055b, B:110:0x0565, B:112:0x056f, B:113:0x0582, B:118:0x0468, B:120:0x0472, B:122:0x0479, B:123:0x049a, B:125:0x04a0, B:127:0x04a7, B:128:0x04c6, B:130:0x04ca, B:132:0x04d1, B:133:0x076a, B:134:0x076f, B:140:0x00b4, B:142:0x0334, B:144:0x00c6, B:146:0x0270, B:148:0x00d8, B:150:0x040a, B:152:0x00ea, B:154:0x0293, B:156:0x00fc, B:158:0x01c7, B:160:0x010e, B:162:0x01f4, B:164:0x0120, B:166:0x0244, B:168:0x0132, B:170:0x03db, B:172:0x0142, B:174:0x03b5, B:176:0x0154, B:178:0x02c9, B:180:0x02d3, B:181:0x02ec, B:183:0x02f2, B:185:0x0300, B:187:0x0166, B:189:0x021b, B:191:0x0178, B:193:0x038d, B:195:0x0189, B:196:0x0199, B:198:0x0770, B:199:0x0775, B:200:0x019e, B:202:0x01a6, B:205:0x01d0, B:207:0x01d8, B:210:0x01fb, B:212:0x0205, B:215:0x021e, B:217:0x0226, B:220:0x0247, B:222:0x0251, B:225:0x0274, B:227:0x027c, B:230:0x0297, B:232:0x029f, B:234:0x02b5, B:235:0x02bb, B:239:0x0307, B:242:0x0315, B:244:0x031d, B:247:0x0338, B:249:0x0340, B:252:0x0361, B:254:0x0369, B:256:0x0377, B:257:0x037d, B:261:0x0391, B:263:0x0399, B:266:0x03b9, B:268:0x03bf, B:271:0x03e1, B:273:0x03e9), top: B:2:0x001a }] */
        /* JADX WARN: Removed duplicated region for block: B:180:0x02d3 A[Catch: Exception -> 0x002f, TryCatch #0 {Exception -> 0x002f, blocks: (B:10:0x002a, B:12:0x0071, B:14:0x05ba, B:15:0x05cd, B:17:0x05d3, B:19:0x05ed, B:24:0x05f5, B:26:0x05ff, B:28:0x0605, B:30:0x060c, B:32:0x0613, B:33:0x0624, B:34:0x0639, B:36:0x0664, B:37:0x066c, B:39:0x0733, B:53:0x0671, B:56:0x067b, B:57:0x0691, B:60:0x069b, B:61:0x06b1, B:64:0x06c5, B:65:0x06bb, B:68:0x06da, B:71:0x06e3, B:72:0x06f8, B:75:0x0701, B:76:0x0716, B:79:0x071f, B:81:0x00a2, B:83:0x035d, B:85:0x040e, B:87:0x0430, B:89:0x0437, B:90:0x04dc, B:91:0x0507, B:93:0x050d, B:95:0x051d, B:100:0x0523, B:103:0x0534, B:105:0x053a, B:108:0x055b, B:110:0x0565, B:112:0x056f, B:113:0x0582, B:118:0x0468, B:120:0x0472, B:122:0x0479, B:123:0x049a, B:125:0x04a0, B:127:0x04a7, B:128:0x04c6, B:130:0x04ca, B:132:0x04d1, B:133:0x076a, B:134:0x076f, B:140:0x00b4, B:142:0x0334, B:144:0x00c6, B:146:0x0270, B:148:0x00d8, B:150:0x040a, B:152:0x00ea, B:154:0x0293, B:156:0x00fc, B:158:0x01c7, B:160:0x010e, B:162:0x01f4, B:164:0x0120, B:166:0x0244, B:168:0x0132, B:170:0x03db, B:172:0x0142, B:174:0x03b5, B:176:0x0154, B:178:0x02c9, B:180:0x02d3, B:181:0x02ec, B:183:0x02f2, B:185:0x0300, B:187:0x0166, B:189:0x021b, B:191:0x0178, B:193:0x038d, B:195:0x0189, B:196:0x0199, B:198:0x0770, B:199:0x0775, B:200:0x019e, B:202:0x01a6, B:205:0x01d0, B:207:0x01d8, B:210:0x01fb, B:212:0x0205, B:215:0x021e, B:217:0x0226, B:220:0x0247, B:222:0x0251, B:225:0x0274, B:227:0x027c, B:230:0x0297, B:232:0x029f, B:234:0x02b5, B:235:0x02bb, B:239:0x0307, B:242:0x0315, B:244:0x031d, B:247:0x0338, B:249:0x0340, B:252:0x0361, B:254:0x0369, B:256:0x0377, B:257:0x037d, B:261:0x0391, B:263:0x0399, B:266:0x03b9, B:268:0x03bf, B:271:0x03e1, B:273:0x03e9), top: B:2:0x001a }] */
        /* JADX WARN: Removed duplicated region for block: B:38:0x066f  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x0764 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:53:0x0671 A[Catch: Exception -> 0x002f, TryCatch #0 {Exception -> 0x002f, blocks: (B:10:0x002a, B:12:0x0071, B:14:0x05ba, B:15:0x05cd, B:17:0x05d3, B:19:0x05ed, B:24:0x05f5, B:26:0x05ff, B:28:0x0605, B:30:0x060c, B:32:0x0613, B:33:0x0624, B:34:0x0639, B:36:0x0664, B:37:0x066c, B:39:0x0733, B:53:0x0671, B:56:0x067b, B:57:0x0691, B:60:0x069b, B:61:0x06b1, B:64:0x06c5, B:65:0x06bb, B:68:0x06da, B:71:0x06e3, B:72:0x06f8, B:75:0x0701, B:76:0x0716, B:79:0x071f, B:81:0x00a2, B:83:0x035d, B:85:0x040e, B:87:0x0430, B:89:0x0437, B:90:0x04dc, B:91:0x0507, B:93:0x050d, B:95:0x051d, B:100:0x0523, B:103:0x0534, B:105:0x053a, B:108:0x055b, B:110:0x0565, B:112:0x056f, B:113:0x0582, B:118:0x0468, B:120:0x0472, B:122:0x0479, B:123:0x049a, B:125:0x04a0, B:127:0x04a7, B:128:0x04c6, B:130:0x04ca, B:132:0x04d1, B:133:0x076a, B:134:0x076f, B:140:0x00b4, B:142:0x0334, B:144:0x00c6, B:146:0x0270, B:148:0x00d8, B:150:0x040a, B:152:0x00ea, B:154:0x0293, B:156:0x00fc, B:158:0x01c7, B:160:0x010e, B:162:0x01f4, B:164:0x0120, B:166:0x0244, B:168:0x0132, B:170:0x03db, B:172:0x0142, B:174:0x03b5, B:176:0x0154, B:178:0x02c9, B:180:0x02d3, B:181:0x02ec, B:183:0x02f2, B:185:0x0300, B:187:0x0166, B:189:0x021b, B:191:0x0178, B:193:0x038d, B:195:0x0189, B:196:0x0199, B:198:0x0770, B:199:0x0775, B:200:0x019e, B:202:0x01a6, B:205:0x01d0, B:207:0x01d8, B:210:0x01fb, B:212:0x0205, B:215:0x021e, B:217:0x0226, B:220:0x0247, B:222:0x0251, B:225:0x0274, B:227:0x027c, B:230:0x0297, B:232:0x029f, B:234:0x02b5, B:235:0x02bb, B:239:0x0307, B:242:0x0315, B:244:0x031d, B:247:0x0338, B:249:0x0340, B:252:0x0361, B:254:0x0369, B:256:0x0377, B:257:0x037d, B:261:0x0391, B:263:0x0399, B:266:0x03b9, B:268:0x03bf, B:271:0x03e1, B:273:0x03e9), top: B:2:0x001a }] */
        /* JADX WARN: Removed duplicated region for block: B:57:0x0691 A[Catch: Exception -> 0x002f, TryCatch #0 {Exception -> 0x002f, blocks: (B:10:0x002a, B:12:0x0071, B:14:0x05ba, B:15:0x05cd, B:17:0x05d3, B:19:0x05ed, B:24:0x05f5, B:26:0x05ff, B:28:0x0605, B:30:0x060c, B:32:0x0613, B:33:0x0624, B:34:0x0639, B:36:0x0664, B:37:0x066c, B:39:0x0733, B:53:0x0671, B:56:0x067b, B:57:0x0691, B:60:0x069b, B:61:0x06b1, B:64:0x06c5, B:65:0x06bb, B:68:0x06da, B:71:0x06e3, B:72:0x06f8, B:75:0x0701, B:76:0x0716, B:79:0x071f, B:81:0x00a2, B:83:0x035d, B:85:0x040e, B:87:0x0430, B:89:0x0437, B:90:0x04dc, B:91:0x0507, B:93:0x050d, B:95:0x051d, B:100:0x0523, B:103:0x0534, B:105:0x053a, B:108:0x055b, B:110:0x0565, B:112:0x056f, B:113:0x0582, B:118:0x0468, B:120:0x0472, B:122:0x0479, B:123:0x049a, B:125:0x04a0, B:127:0x04a7, B:128:0x04c6, B:130:0x04ca, B:132:0x04d1, B:133:0x076a, B:134:0x076f, B:140:0x00b4, B:142:0x0334, B:144:0x00c6, B:146:0x0270, B:148:0x00d8, B:150:0x040a, B:152:0x00ea, B:154:0x0293, B:156:0x00fc, B:158:0x01c7, B:160:0x010e, B:162:0x01f4, B:164:0x0120, B:166:0x0244, B:168:0x0132, B:170:0x03db, B:172:0x0142, B:174:0x03b5, B:176:0x0154, B:178:0x02c9, B:180:0x02d3, B:181:0x02ec, B:183:0x02f2, B:185:0x0300, B:187:0x0166, B:189:0x021b, B:191:0x0178, B:193:0x038d, B:195:0x0189, B:196:0x0199, B:198:0x0770, B:199:0x0775, B:200:0x019e, B:202:0x01a6, B:205:0x01d0, B:207:0x01d8, B:210:0x01fb, B:212:0x0205, B:215:0x021e, B:217:0x0226, B:220:0x0247, B:222:0x0251, B:225:0x0274, B:227:0x027c, B:230:0x0297, B:232:0x029f, B:234:0x02b5, B:235:0x02bb, B:239:0x0307, B:242:0x0315, B:244:0x031d, B:247:0x0338, B:249:0x0340, B:252:0x0361, B:254:0x0369, B:256:0x0377, B:257:0x037d, B:261:0x0391, B:263:0x0399, B:266:0x03b9, B:268:0x03bf, B:271:0x03e1, B:273:0x03e9), top: B:2:0x001a }] */
        /* JADX WARN: Removed duplicated region for block: B:61:0x06b1 A[Catch: Exception -> 0x002f, TryCatch #0 {Exception -> 0x002f, blocks: (B:10:0x002a, B:12:0x0071, B:14:0x05ba, B:15:0x05cd, B:17:0x05d3, B:19:0x05ed, B:24:0x05f5, B:26:0x05ff, B:28:0x0605, B:30:0x060c, B:32:0x0613, B:33:0x0624, B:34:0x0639, B:36:0x0664, B:37:0x066c, B:39:0x0733, B:53:0x0671, B:56:0x067b, B:57:0x0691, B:60:0x069b, B:61:0x06b1, B:64:0x06c5, B:65:0x06bb, B:68:0x06da, B:71:0x06e3, B:72:0x06f8, B:75:0x0701, B:76:0x0716, B:79:0x071f, B:81:0x00a2, B:83:0x035d, B:85:0x040e, B:87:0x0430, B:89:0x0437, B:90:0x04dc, B:91:0x0507, B:93:0x050d, B:95:0x051d, B:100:0x0523, B:103:0x0534, B:105:0x053a, B:108:0x055b, B:110:0x0565, B:112:0x056f, B:113:0x0582, B:118:0x0468, B:120:0x0472, B:122:0x0479, B:123:0x049a, B:125:0x04a0, B:127:0x04a7, B:128:0x04c6, B:130:0x04ca, B:132:0x04d1, B:133:0x076a, B:134:0x076f, B:140:0x00b4, B:142:0x0334, B:144:0x00c6, B:146:0x0270, B:148:0x00d8, B:150:0x040a, B:152:0x00ea, B:154:0x0293, B:156:0x00fc, B:158:0x01c7, B:160:0x010e, B:162:0x01f4, B:164:0x0120, B:166:0x0244, B:168:0x0132, B:170:0x03db, B:172:0x0142, B:174:0x03b5, B:176:0x0154, B:178:0x02c9, B:180:0x02d3, B:181:0x02ec, B:183:0x02f2, B:185:0x0300, B:187:0x0166, B:189:0x021b, B:191:0x0178, B:193:0x038d, B:195:0x0189, B:196:0x0199, B:198:0x0770, B:199:0x0775, B:200:0x019e, B:202:0x01a6, B:205:0x01d0, B:207:0x01d8, B:210:0x01fb, B:212:0x0205, B:215:0x021e, B:217:0x0226, B:220:0x0247, B:222:0x0251, B:225:0x0274, B:227:0x027c, B:230:0x0297, B:232:0x029f, B:234:0x02b5, B:235:0x02bb, B:239:0x0307, B:242:0x0315, B:244:0x031d, B:247:0x0338, B:249:0x0340, B:252:0x0361, B:254:0x0369, B:256:0x0377, B:257:0x037d, B:261:0x0391, B:263:0x0399, B:266:0x03b9, B:268:0x03bf, B:271:0x03e1, B:273:0x03e9), top: B:2:0x001a }] */
        /* JADX WARN: Removed duplicated region for block: B:65:0x06bb A[Catch: Exception -> 0x002f, TryCatch #0 {Exception -> 0x002f, blocks: (B:10:0x002a, B:12:0x0071, B:14:0x05ba, B:15:0x05cd, B:17:0x05d3, B:19:0x05ed, B:24:0x05f5, B:26:0x05ff, B:28:0x0605, B:30:0x060c, B:32:0x0613, B:33:0x0624, B:34:0x0639, B:36:0x0664, B:37:0x066c, B:39:0x0733, B:53:0x0671, B:56:0x067b, B:57:0x0691, B:60:0x069b, B:61:0x06b1, B:64:0x06c5, B:65:0x06bb, B:68:0x06da, B:71:0x06e3, B:72:0x06f8, B:75:0x0701, B:76:0x0716, B:79:0x071f, B:81:0x00a2, B:83:0x035d, B:85:0x040e, B:87:0x0430, B:89:0x0437, B:90:0x04dc, B:91:0x0507, B:93:0x050d, B:95:0x051d, B:100:0x0523, B:103:0x0534, B:105:0x053a, B:108:0x055b, B:110:0x0565, B:112:0x056f, B:113:0x0582, B:118:0x0468, B:120:0x0472, B:122:0x0479, B:123:0x049a, B:125:0x04a0, B:127:0x04a7, B:128:0x04c6, B:130:0x04ca, B:132:0x04d1, B:133:0x076a, B:134:0x076f, B:140:0x00b4, B:142:0x0334, B:144:0x00c6, B:146:0x0270, B:148:0x00d8, B:150:0x040a, B:152:0x00ea, B:154:0x0293, B:156:0x00fc, B:158:0x01c7, B:160:0x010e, B:162:0x01f4, B:164:0x0120, B:166:0x0244, B:168:0x0132, B:170:0x03db, B:172:0x0142, B:174:0x03b5, B:176:0x0154, B:178:0x02c9, B:180:0x02d3, B:181:0x02ec, B:183:0x02f2, B:185:0x0300, B:187:0x0166, B:189:0x021b, B:191:0x0178, B:193:0x038d, B:195:0x0189, B:196:0x0199, B:198:0x0770, B:199:0x0775, B:200:0x019e, B:202:0x01a6, B:205:0x01d0, B:207:0x01d8, B:210:0x01fb, B:212:0x0205, B:215:0x021e, B:217:0x0226, B:220:0x0247, B:222:0x0251, B:225:0x0274, B:227:0x027c, B:230:0x0297, B:232:0x029f, B:234:0x02b5, B:235:0x02bb, B:239:0x0307, B:242:0x0315, B:244:0x031d, B:247:0x0338, B:249:0x0340, B:252:0x0361, B:254:0x0369, B:256:0x0377, B:257:0x037d, B:261:0x0391, B:263:0x0399, B:266:0x03b9, B:268:0x03bf, B:271:0x03e1, B:273:0x03e9), top: B:2:0x001a }] */
        /* JADX WARN: Removed duplicated region for block: B:68:0x06da A[Catch: Exception -> 0x002f, TryCatch #0 {Exception -> 0x002f, blocks: (B:10:0x002a, B:12:0x0071, B:14:0x05ba, B:15:0x05cd, B:17:0x05d3, B:19:0x05ed, B:24:0x05f5, B:26:0x05ff, B:28:0x0605, B:30:0x060c, B:32:0x0613, B:33:0x0624, B:34:0x0639, B:36:0x0664, B:37:0x066c, B:39:0x0733, B:53:0x0671, B:56:0x067b, B:57:0x0691, B:60:0x069b, B:61:0x06b1, B:64:0x06c5, B:65:0x06bb, B:68:0x06da, B:71:0x06e3, B:72:0x06f8, B:75:0x0701, B:76:0x0716, B:79:0x071f, B:81:0x00a2, B:83:0x035d, B:85:0x040e, B:87:0x0430, B:89:0x0437, B:90:0x04dc, B:91:0x0507, B:93:0x050d, B:95:0x051d, B:100:0x0523, B:103:0x0534, B:105:0x053a, B:108:0x055b, B:110:0x0565, B:112:0x056f, B:113:0x0582, B:118:0x0468, B:120:0x0472, B:122:0x0479, B:123:0x049a, B:125:0x04a0, B:127:0x04a7, B:128:0x04c6, B:130:0x04ca, B:132:0x04d1, B:133:0x076a, B:134:0x076f, B:140:0x00b4, B:142:0x0334, B:144:0x00c6, B:146:0x0270, B:148:0x00d8, B:150:0x040a, B:152:0x00ea, B:154:0x0293, B:156:0x00fc, B:158:0x01c7, B:160:0x010e, B:162:0x01f4, B:164:0x0120, B:166:0x0244, B:168:0x0132, B:170:0x03db, B:172:0x0142, B:174:0x03b5, B:176:0x0154, B:178:0x02c9, B:180:0x02d3, B:181:0x02ec, B:183:0x02f2, B:185:0x0300, B:187:0x0166, B:189:0x021b, B:191:0x0178, B:193:0x038d, B:195:0x0189, B:196:0x0199, B:198:0x0770, B:199:0x0775, B:200:0x019e, B:202:0x01a6, B:205:0x01d0, B:207:0x01d8, B:210:0x01fb, B:212:0x0205, B:215:0x021e, B:217:0x0226, B:220:0x0247, B:222:0x0251, B:225:0x0274, B:227:0x027c, B:230:0x0297, B:232:0x029f, B:234:0x02b5, B:235:0x02bb, B:239:0x0307, B:242:0x0315, B:244:0x031d, B:247:0x0338, B:249:0x0340, B:252:0x0361, B:254:0x0369, B:256:0x0377, B:257:0x037d, B:261:0x0391, B:263:0x0399, B:266:0x03b9, B:268:0x03bf, B:271:0x03e1, B:273:0x03e9), top: B:2:0x001a }] */
        /* JADX WARN: Removed duplicated region for block: B:72:0x06f8 A[Catch: Exception -> 0x002f, TryCatch #0 {Exception -> 0x002f, blocks: (B:10:0x002a, B:12:0x0071, B:14:0x05ba, B:15:0x05cd, B:17:0x05d3, B:19:0x05ed, B:24:0x05f5, B:26:0x05ff, B:28:0x0605, B:30:0x060c, B:32:0x0613, B:33:0x0624, B:34:0x0639, B:36:0x0664, B:37:0x066c, B:39:0x0733, B:53:0x0671, B:56:0x067b, B:57:0x0691, B:60:0x069b, B:61:0x06b1, B:64:0x06c5, B:65:0x06bb, B:68:0x06da, B:71:0x06e3, B:72:0x06f8, B:75:0x0701, B:76:0x0716, B:79:0x071f, B:81:0x00a2, B:83:0x035d, B:85:0x040e, B:87:0x0430, B:89:0x0437, B:90:0x04dc, B:91:0x0507, B:93:0x050d, B:95:0x051d, B:100:0x0523, B:103:0x0534, B:105:0x053a, B:108:0x055b, B:110:0x0565, B:112:0x056f, B:113:0x0582, B:118:0x0468, B:120:0x0472, B:122:0x0479, B:123:0x049a, B:125:0x04a0, B:127:0x04a7, B:128:0x04c6, B:130:0x04ca, B:132:0x04d1, B:133:0x076a, B:134:0x076f, B:140:0x00b4, B:142:0x0334, B:144:0x00c6, B:146:0x0270, B:148:0x00d8, B:150:0x040a, B:152:0x00ea, B:154:0x0293, B:156:0x00fc, B:158:0x01c7, B:160:0x010e, B:162:0x01f4, B:164:0x0120, B:166:0x0244, B:168:0x0132, B:170:0x03db, B:172:0x0142, B:174:0x03b5, B:176:0x0154, B:178:0x02c9, B:180:0x02d3, B:181:0x02ec, B:183:0x02f2, B:185:0x0300, B:187:0x0166, B:189:0x021b, B:191:0x0178, B:193:0x038d, B:195:0x0189, B:196:0x0199, B:198:0x0770, B:199:0x0775, B:200:0x019e, B:202:0x01a6, B:205:0x01d0, B:207:0x01d8, B:210:0x01fb, B:212:0x0205, B:215:0x021e, B:217:0x0226, B:220:0x0247, B:222:0x0251, B:225:0x0274, B:227:0x027c, B:230:0x0297, B:232:0x029f, B:234:0x02b5, B:235:0x02bb, B:239:0x0307, B:242:0x0315, B:244:0x031d, B:247:0x0338, B:249:0x0340, B:252:0x0361, B:254:0x0369, B:256:0x0377, B:257:0x037d, B:261:0x0391, B:263:0x0399, B:266:0x03b9, B:268:0x03bf, B:271:0x03e1, B:273:0x03e9), top: B:2:0x001a }] */
        /* JADX WARN: Removed duplicated region for block: B:76:0x0716 A[Catch: Exception -> 0x002f, TryCatch #0 {Exception -> 0x002f, blocks: (B:10:0x002a, B:12:0x0071, B:14:0x05ba, B:15:0x05cd, B:17:0x05d3, B:19:0x05ed, B:24:0x05f5, B:26:0x05ff, B:28:0x0605, B:30:0x060c, B:32:0x0613, B:33:0x0624, B:34:0x0639, B:36:0x0664, B:37:0x066c, B:39:0x0733, B:53:0x0671, B:56:0x067b, B:57:0x0691, B:60:0x069b, B:61:0x06b1, B:64:0x06c5, B:65:0x06bb, B:68:0x06da, B:71:0x06e3, B:72:0x06f8, B:75:0x0701, B:76:0x0716, B:79:0x071f, B:81:0x00a2, B:83:0x035d, B:85:0x040e, B:87:0x0430, B:89:0x0437, B:90:0x04dc, B:91:0x0507, B:93:0x050d, B:95:0x051d, B:100:0x0523, B:103:0x0534, B:105:0x053a, B:108:0x055b, B:110:0x0565, B:112:0x056f, B:113:0x0582, B:118:0x0468, B:120:0x0472, B:122:0x0479, B:123:0x049a, B:125:0x04a0, B:127:0x04a7, B:128:0x04c6, B:130:0x04ca, B:132:0x04d1, B:133:0x076a, B:134:0x076f, B:140:0x00b4, B:142:0x0334, B:144:0x00c6, B:146:0x0270, B:148:0x00d8, B:150:0x040a, B:152:0x00ea, B:154:0x0293, B:156:0x00fc, B:158:0x01c7, B:160:0x010e, B:162:0x01f4, B:164:0x0120, B:166:0x0244, B:168:0x0132, B:170:0x03db, B:172:0x0142, B:174:0x03b5, B:176:0x0154, B:178:0x02c9, B:180:0x02d3, B:181:0x02ec, B:183:0x02f2, B:185:0x0300, B:187:0x0166, B:189:0x021b, B:191:0x0178, B:193:0x038d, B:195:0x0189, B:196:0x0199, B:198:0x0770, B:199:0x0775, B:200:0x019e, B:202:0x01a6, B:205:0x01d0, B:207:0x01d8, B:210:0x01fb, B:212:0x0205, B:215:0x021e, B:217:0x0226, B:220:0x0247, B:222:0x0251, B:225:0x0274, B:227:0x027c, B:230:0x0297, B:232:0x029f, B:234:0x02b5, B:235:0x02bb, B:239:0x0307, B:242:0x0315, B:244:0x031d, B:247:0x0338, B:249:0x0340, B:252:0x0361, B:254:0x0369, B:256:0x0377, B:257:0x037d, B:261:0x0391, B:263:0x0399, B:266:0x03b9, B:268:0x03bf, B:271:0x03e1, B:273:0x03e9), top: B:2:0x001a }] */
        /* JADX WARN: Removed duplicated region for block: B:87:0x0430 A[Catch: Exception -> 0x002f, TryCatch #0 {Exception -> 0x002f, blocks: (B:10:0x002a, B:12:0x0071, B:14:0x05ba, B:15:0x05cd, B:17:0x05d3, B:19:0x05ed, B:24:0x05f5, B:26:0x05ff, B:28:0x0605, B:30:0x060c, B:32:0x0613, B:33:0x0624, B:34:0x0639, B:36:0x0664, B:37:0x066c, B:39:0x0733, B:53:0x0671, B:56:0x067b, B:57:0x0691, B:60:0x069b, B:61:0x06b1, B:64:0x06c5, B:65:0x06bb, B:68:0x06da, B:71:0x06e3, B:72:0x06f8, B:75:0x0701, B:76:0x0716, B:79:0x071f, B:81:0x00a2, B:83:0x035d, B:85:0x040e, B:87:0x0430, B:89:0x0437, B:90:0x04dc, B:91:0x0507, B:93:0x050d, B:95:0x051d, B:100:0x0523, B:103:0x0534, B:105:0x053a, B:108:0x055b, B:110:0x0565, B:112:0x056f, B:113:0x0582, B:118:0x0468, B:120:0x0472, B:122:0x0479, B:123:0x049a, B:125:0x04a0, B:127:0x04a7, B:128:0x04c6, B:130:0x04ca, B:132:0x04d1, B:133:0x076a, B:134:0x076f, B:140:0x00b4, B:142:0x0334, B:144:0x00c6, B:146:0x0270, B:148:0x00d8, B:150:0x040a, B:152:0x00ea, B:154:0x0293, B:156:0x00fc, B:158:0x01c7, B:160:0x010e, B:162:0x01f4, B:164:0x0120, B:166:0x0244, B:168:0x0132, B:170:0x03db, B:172:0x0142, B:174:0x03b5, B:176:0x0154, B:178:0x02c9, B:180:0x02d3, B:181:0x02ec, B:183:0x02f2, B:185:0x0300, B:187:0x0166, B:189:0x021b, B:191:0x0178, B:193:0x038d, B:195:0x0189, B:196:0x0199, B:198:0x0770, B:199:0x0775, B:200:0x019e, B:202:0x01a6, B:205:0x01d0, B:207:0x01d8, B:210:0x01fb, B:212:0x0205, B:215:0x021e, B:217:0x0226, B:220:0x0247, B:222:0x0251, B:225:0x0274, B:227:0x027c, B:230:0x0297, B:232:0x029f, B:234:0x02b5, B:235:0x02bb, B:239:0x0307, B:242:0x0315, B:244:0x031d, B:247:0x0338, B:249:0x0340, B:252:0x0361, B:254:0x0369, B:256:0x0377, B:257:0x037d, B:261:0x0391, B:263:0x0399, B:266:0x03b9, B:268:0x03bf, B:271:0x03e1, B:273:0x03e9), top: B:2:0x001a }] */
        /* JADX WARN: Removed duplicated region for block: B:89:0x0437 A[Catch: Exception -> 0x002f, TryCatch #0 {Exception -> 0x002f, blocks: (B:10:0x002a, B:12:0x0071, B:14:0x05ba, B:15:0x05cd, B:17:0x05d3, B:19:0x05ed, B:24:0x05f5, B:26:0x05ff, B:28:0x0605, B:30:0x060c, B:32:0x0613, B:33:0x0624, B:34:0x0639, B:36:0x0664, B:37:0x066c, B:39:0x0733, B:53:0x0671, B:56:0x067b, B:57:0x0691, B:60:0x069b, B:61:0x06b1, B:64:0x06c5, B:65:0x06bb, B:68:0x06da, B:71:0x06e3, B:72:0x06f8, B:75:0x0701, B:76:0x0716, B:79:0x071f, B:81:0x00a2, B:83:0x035d, B:85:0x040e, B:87:0x0430, B:89:0x0437, B:90:0x04dc, B:91:0x0507, B:93:0x050d, B:95:0x051d, B:100:0x0523, B:103:0x0534, B:105:0x053a, B:108:0x055b, B:110:0x0565, B:112:0x056f, B:113:0x0582, B:118:0x0468, B:120:0x0472, B:122:0x0479, B:123:0x049a, B:125:0x04a0, B:127:0x04a7, B:128:0x04c6, B:130:0x04ca, B:132:0x04d1, B:133:0x076a, B:134:0x076f, B:140:0x00b4, B:142:0x0334, B:144:0x00c6, B:146:0x0270, B:148:0x00d8, B:150:0x040a, B:152:0x00ea, B:154:0x0293, B:156:0x00fc, B:158:0x01c7, B:160:0x010e, B:162:0x01f4, B:164:0x0120, B:166:0x0244, B:168:0x0132, B:170:0x03db, B:172:0x0142, B:174:0x03b5, B:176:0x0154, B:178:0x02c9, B:180:0x02d3, B:181:0x02ec, B:183:0x02f2, B:185:0x0300, B:187:0x0166, B:189:0x021b, B:191:0x0178, B:193:0x038d, B:195:0x0189, B:196:0x0199, B:198:0x0770, B:199:0x0775, B:200:0x019e, B:202:0x01a6, B:205:0x01d0, B:207:0x01d8, B:210:0x01fb, B:212:0x0205, B:215:0x021e, B:217:0x0226, B:220:0x0247, B:222:0x0251, B:225:0x0274, B:227:0x027c, B:230:0x0297, B:232:0x029f, B:234:0x02b5, B:235:0x02bb, B:239:0x0307, B:242:0x0315, B:244:0x031d, B:247:0x0338, B:249:0x0340, B:252:0x0361, B:254:0x0369, B:256:0x0377, B:257:0x037d, B:261:0x0391, B:263:0x0399, B:266:0x03b9, B:268:0x03bf, B:271:0x03e1, B:273:0x03e9), top: B:2:0x001a }] */
        /* JADX WARN: Removed duplicated region for block: B:93:0x050d A[Catch: Exception -> 0x002f, TryCatch #0 {Exception -> 0x002f, blocks: (B:10:0x002a, B:12:0x0071, B:14:0x05ba, B:15:0x05cd, B:17:0x05d3, B:19:0x05ed, B:24:0x05f5, B:26:0x05ff, B:28:0x0605, B:30:0x060c, B:32:0x0613, B:33:0x0624, B:34:0x0639, B:36:0x0664, B:37:0x066c, B:39:0x0733, B:53:0x0671, B:56:0x067b, B:57:0x0691, B:60:0x069b, B:61:0x06b1, B:64:0x06c5, B:65:0x06bb, B:68:0x06da, B:71:0x06e3, B:72:0x06f8, B:75:0x0701, B:76:0x0716, B:79:0x071f, B:81:0x00a2, B:83:0x035d, B:85:0x040e, B:87:0x0430, B:89:0x0437, B:90:0x04dc, B:91:0x0507, B:93:0x050d, B:95:0x051d, B:100:0x0523, B:103:0x0534, B:105:0x053a, B:108:0x055b, B:110:0x0565, B:112:0x056f, B:113:0x0582, B:118:0x0468, B:120:0x0472, B:122:0x0479, B:123:0x049a, B:125:0x04a0, B:127:0x04a7, B:128:0x04c6, B:130:0x04ca, B:132:0x04d1, B:133:0x076a, B:134:0x076f, B:140:0x00b4, B:142:0x0334, B:144:0x00c6, B:146:0x0270, B:148:0x00d8, B:150:0x040a, B:152:0x00ea, B:154:0x0293, B:156:0x00fc, B:158:0x01c7, B:160:0x010e, B:162:0x01f4, B:164:0x0120, B:166:0x0244, B:168:0x0132, B:170:0x03db, B:172:0x0142, B:174:0x03b5, B:176:0x0154, B:178:0x02c9, B:180:0x02d3, B:181:0x02ec, B:183:0x02f2, B:185:0x0300, B:187:0x0166, B:189:0x021b, B:191:0x0178, B:193:0x038d, B:195:0x0189, B:196:0x0199, B:198:0x0770, B:199:0x0775, B:200:0x019e, B:202:0x01a6, B:205:0x01d0, B:207:0x01d8, B:210:0x01fb, B:212:0x0205, B:215:0x021e, B:217:0x0226, B:220:0x0247, B:222:0x0251, B:225:0x0274, B:227:0x027c, B:230:0x0297, B:232:0x029f, B:234:0x02b5, B:235:0x02bb, B:239:0x0307, B:242:0x0315, B:244:0x031d, B:247:0x0338, B:249:0x0340, B:252:0x0361, B:254:0x0369, B:256:0x0377, B:257:0x037d, B:261:0x0391, B:263:0x0399, B:266:0x03b9, B:268:0x03bf, B:271:0x03e1, B:273:0x03e9), top: B:2:0x001a }] */
        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo239o(Object obj) {
            Object m142578e;
            InterfaceC29283d m143692z;
            Object obj2;
            Object mo96609o0;
            Object mo96628y0;
            Object mo96579Z;
            String str;
            Object mo96610p;
            Object mo96565L;
            Object mo96618t0;
            InterfaceC29283d interfaceC29283d;
            Object obj3;
            String str2;
            Object mo96582b;
            Object mo96583b0;
            Object mo96609o02;
            Object mo96592g;
            Object mo96591f0;
            Object mo96619u;
            Object mo96592g2;
            C25093p c25093p;
            int m131511r;
            VideoPresenterImpl videoPresenterImpl;
            C19059j0 c19059j0;
            C19059j0 c19059j02;
            Object obj4;
            Object obj5;
            Object obj6;
            Object obj7;
            Object obj8;
            Object obj9;
            FollowingData followingData;
            C19059j0 c19059j03;
            C19059j0 c19059j04;
            C19059j0 c19059j05;
            FriendData friendData;
            C19059j0 c19059j06;
            ForUData forUData;
            Section section;
            C10008a c10008a;
            Section section2;
            List list;
            boolean booleanValue;
            List list2;
            Section section3;
            C19059j0 c19059j07;
            C19059j0 c19059j08;
            C19059j0 c19059j09;
            List list3;
            List list4;
            boolean z11;
            C19059j0 c19059j010;
            C19059j0 c19059j011;
            C19059j0 c19059j012;
            C19059j0 c19059j013;
            C19059j0 c19059j014;
            C19059j0 c19059j015;
            C19059j0 c19059j016;
            InterfaceC29283d interfaceC29283d2;
            Object mo50569t;
            C19059j0 c19059j017;
            Section section4;
            C19059j0 c19059j018;
            C19059j0 c19059j019;
            boolean z12;
            List list5;
            C19059j0 c19059j020;
            C19059j0 c19059j021;
            C19059j0 c19059j022;
            C19059j0 c19059j023;
            Parcelable parcelable;
            VideoPresenterImpl videoPresenterImpl2;
            String str3;
            b bVar;
            ArrayList arrayList;
            LoadMoreInfo m51169n;
            m142578e = AbstractC28298d.m142578e();
            try {
            } catch (Exception e11) {
                e = e11;
            }
            switch (this.f52265F) {
                case 0:
                    AbstractC24862s.m129228b(obj);
                    CoroutineScope coroutineScope = (CoroutineScope) this.f52266G;
                    m143692z = AbstractC28684a.Companion.m143692z();
                    String str4 = VideoPresenterImpl.this.f52144B;
                    switch (str4.hashCode()) {
                        case -1532338930:
                            if (str4.equals("SOURCE_SEARCH_ALL")) {
                                InterfaceC18170g interfaceC18170g = VideoPresenterImpl.this.f52169r;
                                String str5 = VideoPresenterImpl.this.f52152J;
                                obj2 = "SOURCE_HASHTAG";
                                LoadMoreInfo loadMoreInfo = this.f52268I;
                                this.f52266G = coroutineScope;
                                this.f52276t = m143692z;
                                this.f52265F = 10;
                                mo96609o0 = interfaceC18170g.mo96609o0("search_all", str5, loadMoreInfo, this);
                                if (mo96609o0 == m142578e) {
                                    return m142578e;
                                }
                                parcelable = (Parcelable) mo96609o0;
                                InterfaceC29283d interfaceC29283d3 = m143692z;
                                obj3 = parcelable;
                                interfaceC29283d = interfaceC29283d3;
                                videoPresenterImpl = VideoPresenterImpl.this;
                                LoadMoreInfo loadMoreInfo2 = this.f52268I;
                                c19059j0 = this.f52269J;
                                c19059j02 = this.f52270K;
                                obj4 = "SOURCE_CHANNEL";
                                C19059j0 c19059j024 = this.f52271L;
                                obj5 = "SOURCE_LOCATION";
                                C19059j0 c19059j025 = this.f52272M;
                                obj6 = "SOURCE_BOOKMARK";
                                C19059j0 c19059j026 = this.f52273N;
                                obj7 = "SOURCE_LIKED";
                                C19059j0 c19059j027 = this.f52274O;
                                obj8 = "SOURCE_SIMILAR";
                                C19059j0 c19059j028 = this.f52275P;
                                obj9 = "SOURCE_COLLECTION";
                                if (obj3 instanceof FollowingData) {
                                    followingData = (FollowingData) obj3;
                                } else {
                                    followingData = null;
                                }
                                if (followingData != null) {
                                    c19059j05 = c19059j028;
                                    c19059j04 = c19059j027;
                                    c19059j03 = c19059j026;
                                    c10008a = new C10008a(((FollowingData) obj3).m50926d(), ((FollowingData) obj3).m50925c(), AbstractC29094b.m145339a(((FollowingData) obj3).m50927e()), ((FollowingData) obj3).m50924b());
                                    c19059j06 = c19059j025;
                                } else {
                                    c19059j03 = c19059j026;
                                    c19059j04 = c19059j027;
                                    c19059j05 = c19059j028;
                                    if (obj3 instanceof FriendData) {
                                        friendData = (FriendData) obj3;
                                    } else {
                                        friendData = null;
                                    }
                                    if (friendData != null) {
                                        c19059j06 = c19059j025;
                                        c10008a = new C10008a(((FriendData) obj3).m50957c(), ((FriendData) obj3).m50956b(), AbstractC29094b.m145339a(false), ((FriendData) obj3).m50955a());
                                    } else {
                                        c19059j06 = c19059j025;
                                        if (obj3 instanceof ForUData) {
                                            forUData = (ForUData) obj3;
                                        } else {
                                            forUData = null;
                                        }
                                        if (forUData != null) {
                                            c10008a = new C10008a(((ForUData) obj3).m50946d(), ((ForUData) obj3).m50945c(), AbstractC29094b.m145339a(false), ((ForUData) obj3).m50944b());
                                        } else {
                                            if (obj3 instanceof Section) {
                                                section = (Section) obj3;
                                            } else {
                                                section = null;
                                            }
                                            if (section != null) {
                                                c10008a = new C10008a(obj3, null, AbstractC29094b.m145339a(false), null);
                                            } else {
                                                throw new IllegalStateException();
                                            }
                                        }
                                    }
                                }
                                section2 = (Section) c10008a.m53595a();
                                list = (List) c10008a.m53596b();
                                booleanValue = ((Boolean) c10008a.m53597c()).booleanValue();
                                list2 = (List) c10008a.m53598d();
                                List m51168m = section2.m51168m();
                                ArrayList arrayList2 = new ArrayList();
                                for (Object obj10 : m51168m) {
                                    C19059j0 c19059j029 = c19059j024;
                                    if (((Video) obj10).m52903n0()) {
                                        arrayList2.add(obj10);
                                    }
                                    c19059j024 = c19059j029;
                                }
                                C19059j0 c19059j030 = c19059j024;
                                section2.m51172q(arrayList2);
                                if (!AbstractC19074t.m100204b(videoPresenterImpl.f52144B, "SOURCE_FOLLOWING") && loadMoreInfo2 == null && videoPresenterImpl.f52151I == null) {
                                    a aVar = new a(videoPresenterImpl, section2, list, booleanValue, list2);
                                    this.f52266G = null;
                                    this.f52276t = null;
                                    this.f52265F = 14;
                                    if (videoPresenterImpl.m52971w(aVar, this) == m142578e) {
                                        return m142578e;
                                    }
                                    return C24848g0.f119245a;
                                }
                                if (AbstractC19074t.m100204b(videoPresenterImpl.f52144B, "SOURCE_FOR_U")) {
                                    if (section2.m51168m().isEmpty()) {
                                        videoPresenterImpl.f52154L = 0;
                                        c19059j019 = c19059j05;
                                        list3 = list;
                                        z12 = booleanValue;
                                        list5 = list2;
                                        c19059j020 = c19059j06;
                                        c19059j021 = c19059j04;
                                        c19059j022 = c19059j03;
                                        c19059j023 = c19059j030;
                                        C19205a.f95429a.m100705A();
                                        c19059j08 = c19059j022;
                                        c19059j07 = c19059j019;
                                        c19059j010 = c19059j0;
                                        c19059j012 = c19059j020;
                                        list4 = list5;
                                        c19059j011 = c19059j021;
                                        c19059j09 = c19059j023;
                                        z11 = z12;
                                        c19059j013 = c19059j02;
                                        section3 = section2;
                                        videoPresenterImpl2 = videoPresenterImpl;
                                        str3 = videoPresenterImpl2.f52144B;
                                        switch (str3.hashCode()) {
                                            case -617742456:
                                                if (str3.equals(obj2)) {
                                                    interfaceC29283d.mo146371j(videoPresenterImpl2.f52146D, section3);
                                                    LoadMoreVideoReceiver.Companion.m53733a(videoPresenterImpl2.f52146D, videoPresenterImpl2.f52145C);
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            case -576339777:
                                                if (str3.equals(obj4)) {
                                                    interfaceC29283d.mo146371j(videoPresenterImpl2.f52149G, section3);
                                                    LoadMoreVideoReceiver.Companion.m53733a(videoPresenterImpl2.f52149G, videoPresenterImpl2.f52145C);
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            case -218246311:
                                                if (str3.equals(obj5)) {
                                                    interfaceC29283d.mo146371j(videoPresenterImpl2.f52153K, section3);
                                                    LoadMoreVideoReceiver.Companion.m53733a(videoPresenterImpl2.f52153K, videoPresenterImpl2.f52145C);
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            case -113911590:
                                                if (!str3.equals(obj6)) {
                                                    break;
                                                }
                                                interfaceC29283d.mo146371j(videoPresenterImpl2.f52145C, section3);
                                                LoadMoreVideoReceiver.Companion.m53733a(videoPresenterImpl2.f52145C, videoPresenterImpl2.f52145C);
                                                break;
                                            case 602163817:
                                                if (!str3.equals(obj7)) {
                                                    break;
                                                }
                                                interfaceC29283d.mo146371j(videoPresenterImpl2.f52145C, section3);
                                                LoadMoreVideoReceiver.Companion.m53733a(videoPresenterImpl2.f52145C, videoPresenterImpl2.f52145C);
                                                break;
                                            case 778377639:
                                                if (str3.equals(obj8)) {
                                                    interfaceC29283d.mo146371j(videoPresenterImpl2.f52147E, section3);
                                                    LoadMoreVideoReceiver.Companion.m53733a(videoPresenterImpl2.f52147E, videoPresenterImpl2.f52145C);
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            case 1730512194:
                                                if (str3.equals(obj9)) {
                                                    interfaceC29283d.mo146371j(videoPresenterImpl2.f52148F, section3);
                                                    LoadMoreVideoReceiver.Companion.m53733a(videoPresenterImpl2.f52148F, videoPresenterImpl2.f52145C);
                                                    break;
                                                } else {
                                                    break;
                                                }
                                        }
                                        try {
                                            bVar = new b(videoPresenterImpl2, section3, list3, list4, c19059j010, c19059j013, c19059j09, z11, c19059j012, c19059j08, c19059j011, c19059j07);
                                            this.f52266G = null;
                                            this.f52276t = null;
                                            this.f52277u = null;
                                            this.f52278v = null;
                                            this.f52279w = null;
                                            this.f52280x = null;
                                            this.f52281y = null;
                                            this.f52282z = null;
                                            this.f52260A = null;
                                            this.f52261B = null;
                                            this.f52262C = null;
                                            this.f52263D = null;
                                            this.f52265F = 16;
                                            if (videoPresenterImpl2.m52971w(bVar, this) == m142578e) {
                                                return m142578e;
                                            }
                                        } catch (Exception e12) {
                                            e = e12;
                                            m142578e = m142578e;
                                            Exception exc = e;
                                            VideoPresenterImpl videoPresenterImpl3 = VideoPresenterImpl.this;
                                            c cVar = new c(videoPresenterImpl3, exc, this.f52275P, this.f52273N, this.f52274O, this.f52269J, this.f52270K, this.f52271L, this.f52272M);
                                            this.f52266G = null;
                                            this.f52276t = null;
                                            this.f52277u = null;
                                            this.f52278v = null;
                                            this.f52279w = null;
                                            this.f52280x = null;
                                            this.f52281y = null;
                                            this.f52282z = null;
                                            this.f52260A = null;
                                            this.f52261B = null;
                                            this.f52262C = null;
                                            this.f52263D = null;
                                            this.f52265F = 17;
                                            if (videoPresenterImpl3.m52971w(cVar, this) == m142578e) {
                                                return m142578e;
                                            }
                                            return C24848g0.f119245a;
                                        }
                                        return C24848g0.f119245a;
                                    }
                                    InterfaceC30248b interfaceC30248b = videoPresenterImpl.f52170s;
                                    this.f52266G = interfaceC29283d;
                                    this.f52276t = videoPresenterImpl;
                                    this.f52277u = c19059j0;
                                    this.f52278v = c19059j02;
                                    c19059j014 = c19059j030;
                                    this.f52279w = c19059j014;
                                    c19059j015 = c19059j06;
                                    this.f52280x = c19059j015;
                                    C19059j0 c19059j031 = c19059j03;
                                    this.f52281y = c19059j031;
                                    C19059j0 c19059j032 = c19059j04;
                                    this.f52282z = c19059j032;
                                    c19059j016 = c19059j05;
                                    this.f52260A = c19059j016;
                                    this.f52261B = section2;
                                    this.f52262C = list;
                                    this.f52263D = list2;
                                    this.f52264E = booleanValue;
                                    interfaceC29283d2 = interfaceC29283d;
                                    this.f52265F = 15;
                                    mo50569t = interfaceC30248b.mo50569t(this);
                                    if (mo50569t == m142578e) {
                                        return m142578e;
                                    }
                                    c19059j017 = c19059j031;
                                    section4 = section2;
                                    c19059j018 = c19059j032;
                                    List list6 = (List) mo50569t;
                                    List m51168m2 = section4.m51168m();
                                    C19059j0 c19059j033 = c19059j018;
                                    arrayList = new ArrayList();
                                    for (Object obj11 : m51168m2) {
                                        C19059j0 c19059j034 = c19059j017;
                                        C19059j0 c19059j035 = c19059j014;
                                        if (!list6.contains(((Video) obj11).m52911t())) {
                                            arrayList.add(obj11);
                                        }
                                        c19059j017 = c19059j034;
                                        c19059j014 = c19059j035;
                                    }
                                    C19059j0 c19059j036 = c19059j017;
                                    C19059j0 c19059j037 = c19059j014;
                                    if (arrayList.isEmpty() || (m51169n = section4.m51169n()) == null || !m51169n.isValid() || videoPresenterImpl.f52154L >= 5) {
                                        videoPresenterImpl.f52154L = 0;
                                        section4.m51172q(arrayList);
                                        list3 = list;
                                        c19059j020 = c19059j015;
                                        section2 = section4;
                                        list5 = list2;
                                        c19059j019 = c19059j016;
                                        interfaceC29283d = interfaceC29283d2;
                                        c19059j023 = c19059j037;
                                        c19059j021 = c19059j033;
                                        z12 = booleanValue;
                                        c19059j022 = c19059j036;
                                        C19205a.f95429a.m100705A();
                                        c19059j08 = c19059j022;
                                        c19059j07 = c19059j019;
                                        c19059j010 = c19059j0;
                                        c19059j012 = c19059j020;
                                        list4 = list5;
                                        c19059j011 = c19059j021;
                                        c19059j09 = c19059j023;
                                        z11 = z12;
                                        c19059j013 = c19059j02;
                                        section3 = section2;
                                        videoPresenterImpl2 = videoPresenterImpl;
                                        str3 = videoPresenterImpl2.f52144B;
                                        switch (str3.hashCode()) {
                                            case -617742456:
                                                break;
                                            case -576339777:
                                                break;
                                            case -218246311:
                                                break;
                                            case -113911590:
                                                break;
                                            case 602163817:
                                                break;
                                            case 778377639:
                                                break;
                                            case 1730512194:
                                                break;
                                        }
                                        bVar = new b(videoPresenterImpl2, section3, list3, list4, c19059j010, c19059j013, c19059j09, z11, c19059j012, c19059j08, c19059j011, c19059j07);
                                        this.f52266G = null;
                                        this.f52276t = null;
                                        this.f52277u = null;
                                        this.f52278v = null;
                                        this.f52279w = null;
                                        this.f52280x = null;
                                        this.f52281y = null;
                                        this.f52282z = null;
                                        this.f52260A = null;
                                        this.f52261B = null;
                                        this.f52262C = null;
                                        this.f52263D = null;
                                        this.f52265F = 16;
                                        if (videoPresenterImpl2.m52971w(bVar, this) == m142578e) {
                                        }
                                        return C24848g0.f119245a;
                                    }
                                    videoPresenterImpl.f52154L++;
                                    videoPresenterImpl.mo53588q1(section4.m51169n());
                                    return C24848g0.f119245a;
                                }
                                section3 = section2;
                                c19059j07 = c19059j05;
                                c19059j08 = c19059j03;
                                c19059j09 = c19059j030;
                                list3 = list;
                                list4 = list2;
                                z11 = booleanValue;
                                c19059j010 = c19059j0;
                                c19059j011 = c19059j04;
                                c19059j012 = c19059j06;
                                c19059j013 = c19059j02;
                                videoPresenterImpl2 = videoPresenterImpl;
                                str3 = videoPresenterImpl2.f52144B;
                                switch (str3.hashCode()) {
                                    case -617742456:
                                        break;
                                    case -576339777:
                                        break;
                                    case -218246311:
                                        break;
                                    case -113911590:
                                        break;
                                    case 602163817:
                                        break;
                                    case 778377639:
                                        break;
                                    case 1730512194:
                                        break;
                                }
                                bVar = new b(videoPresenterImpl2, section3, list3, list4, c19059j010, c19059j013, c19059j09, z11, c19059j012, c19059j08, c19059j011, c19059j07);
                                this.f52266G = null;
                                this.f52276t = null;
                                this.f52277u = null;
                                this.f52278v = null;
                                this.f52279w = null;
                                this.f52280x = null;
                                this.f52281y = null;
                                this.f52282z = null;
                                this.f52260A = null;
                                this.f52261B = null;
                                this.f52262C = null;
                                this.f52263D = null;
                                this.f52265F = 16;
                                if (videoPresenterImpl2.m52971w(bVar, this) == m142578e) {
                                }
                                return C24848g0.f119245a;
                            }
                            throw new IllegalArgumentException();
                        case -617742456:
                            if (str4.equals("SOURCE_HASHTAG")) {
                                InterfaceC18170g interfaceC18170g2 = VideoPresenterImpl.this.f52169r;
                                String str6 = VideoPresenterImpl.this.f52146D;
                                LoadMoreInfo loadMoreInfo3 = this.f52268I;
                                this.f52266G = coroutineScope;
                                this.f52276t = m143692z;
                                this.f52265F = 5;
                                mo96628y0 = interfaceC18170g2.mo96628y0(str6, loadMoreInfo3, this);
                                if (mo96628y0 == m142578e) {
                                    return m142578e;
                                }
                                obj2 = "SOURCE_HASHTAG";
                                parcelable = (Parcelable) mo96628y0;
                                InterfaceC29283d interfaceC29283d32 = m143692z;
                                obj3 = parcelable;
                                interfaceC29283d = interfaceC29283d32;
                                videoPresenterImpl = VideoPresenterImpl.this;
                                LoadMoreInfo loadMoreInfo22 = this.f52268I;
                                c19059j0 = this.f52269J;
                                c19059j02 = this.f52270K;
                                obj4 = "SOURCE_CHANNEL";
                                C19059j0 c19059j0242 = this.f52271L;
                                obj5 = "SOURCE_LOCATION";
                                C19059j0 c19059j0252 = this.f52272M;
                                obj6 = "SOURCE_BOOKMARK";
                                C19059j0 c19059j0262 = this.f52273N;
                                obj7 = "SOURCE_LIKED";
                                C19059j0 c19059j0272 = this.f52274O;
                                obj8 = "SOURCE_SIMILAR";
                                C19059j0 c19059j0282 = this.f52275P;
                                obj9 = "SOURCE_COLLECTION";
                                if (obj3 instanceof FollowingData) {
                                }
                                if (followingData != null) {
                                }
                                section2 = (Section) c10008a.m53595a();
                                list = (List) c10008a.m53596b();
                                booleanValue = ((Boolean) c10008a.m53597c()).booleanValue();
                                list2 = (List) c10008a.m53598d();
                                List m51168m3 = section2.m51168m();
                                ArrayList arrayList22 = new ArrayList();
                                while (r12.hasNext()) {
                                }
                                C19059j0 c19059j0302 = c19059j0242;
                                section2.m51172q(arrayList22);
                                if (!AbstractC19074t.m100204b(videoPresenterImpl.f52144B, "SOURCE_FOLLOWING")) {
                                }
                                if (AbstractC19074t.m100204b(videoPresenterImpl.f52144B, "SOURCE_FOR_U")) {
                                }
                            }
                            throw new IllegalArgumentException();
                        case -576339777:
                            obj2 = "SOURCE_HASHTAG";
                            if (str4.equals("SOURCE_CHANNEL")) {
                                InterfaceC18170g interfaceC18170g3 = VideoPresenterImpl.this.f52169r;
                                String str7 = VideoPresenterImpl.this.f52149G;
                                LoadMoreInfo loadMoreInfo4 = this.f52268I;
                                this.f52266G = coroutineScope;
                                this.f52276t = m143692z;
                                this.f52265F = 4;
                                mo96579Z = interfaceC18170g3.mo96579Z(str7, loadMoreInfo4, this);
                                if (mo96579Z == m142578e) {
                                    return m142578e;
                                }
                                parcelable = (Parcelable) mo96579Z;
                                InterfaceC29283d interfaceC29283d322 = m143692z;
                                obj3 = parcelable;
                                interfaceC29283d = interfaceC29283d322;
                                videoPresenterImpl = VideoPresenterImpl.this;
                                LoadMoreInfo loadMoreInfo222 = this.f52268I;
                                c19059j0 = this.f52269J;
                                c19059j02 = this.f52270K;
                                obj4 = "SOURCE_CHANNEL";
                                C19059j0 c19059j02422 = this.f52271L;
                                obj5 = "SOURCE_LOCATION";
                                C19059j0 c19059j02522 = this.f52272M;
                                obj6 = "SOURCE_BOOKMARK";
                                C19059j0 c19059j02622 = this.f52273N;
                                obj7 = "SOURCE_LIKED";
                                C19059j0 c19059j02722 = this.f52274O;
                                obj8 = "SOURCE_SIMILAR";
                                C19059j0 c19059j02822 = this.f52275P;
                                obj9 = "SOURCE_COLLECTION";
                                if (obj3 instanceof FollowingData) {
                                }
                                if (followingData != null) {
                                }
                                section2 = (Section) c10008a.m53595a();
                                list = (List) c10008a.m53596b();
                                booleanValue = ((Boolean) c10008a.m53597c()).booleanValue();
                                list2 = (List) c10008a.m53598d();
                                List m51168m32 = section2.m51168m();
                                ArrayList arrayList222 = new ArrayList();
                                while (r12.hasNext()) {
                                }
                                C19059j0 c19059j03022 = c19059j02422;
                                section2.m51172q(arrayList222);
                                if (!AbstractC19074t.m100204b(videoPresenterImpl.f52144B, "SOURCE_FOLLOWING")) {
                                }
                                if (AbstractC19074t.m100204b(videoPresenterImpl.f52144B, "SOURCE_FOR_U")) {
                                }
                            }
                            throw new IllegalArgumentException();
                        case -507563187:
                            obj2 = "SOURCE_HASHTAG";
                            if (str4.equals("SOURCE_FOLLOWING")) {
                                InterfaceC18170g interfaceC18170g4 = VideoPresenterImpl.this.f52169r;
                                Video video = VideoPresenterImpl.this.f52151I;
                                if (video != null) {
                                    str = video.m52911t();
                                } else {
                                    str = null;
                                }
                                LoadMoreInfo loadMoreInfo5 = this.f52268I;
                                this.f52266G = coroutineScope;
                                this.f52276t = m143692z;
                                this.f52265F = 1;
                                mo96610p = interfaceC18170g4.mo96610p(str, loadMoreInfo5, this);
                                if (mo96610p == m142578e) {
                                    return m142578e;
                                }
                                parcelable = (Parcelable) mo96610p;
                                InterfaceC29283d interfaceC29283d3222 = m143692z;
                                obj3 = parcelable;
                                interfaceC29283d = interfaceC29283d3222;
                                videoPresenterImpl = VideoPresenterImpl.this;
                                LoadMoreInfo loadMoreInfo2222 = this.f52268I;
                                c19059j0 = this.f52269J;
                                c19059j02 = this.f52270K;
                                obj4 = "SOURCE_CHANNEL";
                                C19059j0 c19059j024222 = this.f52271L;
                                obj5 = "SOURCE_LOCATION";
                                C19059j0 c19059j025222 = this.f52272M;
                                obj6 = "SOURCE_BOOKMARK";
                                C19059j0 c19059j026222 = this.f52273N;
                                obj7 = "SOURCE_LIKED";
                                C19059j0 c19059j027222 = this.f52274O;
                                obj8 = "SOURCE_SIMILAR";
                                C19059j0 c19059j028222 = this.f52275P;
                                obj9 = "SOURCE_COLLECTION";
                                if (obj3 instanceof FollowingData) {
                                }
                                if (followingData != null) {
                                }
                                section2 = (Section) c10008a.m53595a();
                                list = (List) c10008a.m53596b();
                                booleanValue = ((Boolean) c10008a.m53597c()).booleanValue();
                                list2 = (List) c10008a.m53598d();
                                List m51168m322 = section2.m51168m();
                                ArrayList arrayList2222 = new ArrayList();
                                while (r12.hasNext()) {
                                }
                                C19059j0 c19059j030222 = c19059j024222;
                                section2.m51172q(arrayList2222);
                                if (!AbstractC19074t.m100204b(videoPresenterImpl.f52144B, "SOURCE_FOLLOWING")) {
                                }
                                if (AbstractC19074t.m100204b(videoPresenterImpl.f52144B, "SOURCE_FOR_U")) {
                                }
                            }
                            throw new IllegalArgumentException();
                        case -218246311:
                            obj2 = "SOURCE_HASHTAG";
                            if (str4.equals("SOURCE_LOCATION")) {
                                InterfaceC18170g interfaceC18170g5 = VideoPresenterImpl.this.f52169r;
                                String str8 = VideoPresenterImpl.this.f52153K;
                                LoadMoreInfo loadMoreInfo6 = this.f52268I;
                                this.f52266G = coroutineScope;
                                this.f52276t = m143692z;
                                this.f52265F = 13;
                                mo96565L = interfaceC18170g5.mo96565L(str8, loadMoreInfo6, this);
                                if (mo96565L == m142578e) {
                                    return m142578e;
                                }
                                parcelable = (Parcelable) mo96565L;
                                InterfaceC29283d interfaceC29283d32222 = m143692z;
                                obj3 = parcelable;
                                interfaceC29283d = interfaceC29283d32222;
                                videoPresenterImpl = VideoPresenterImpl.this;
                                LoadMoreInfo loadMoreInfo22222 = this.f52268I;
                                c19059j0 = this.f52269J;
                                c19059j02 = this.f52270K;
                                obj4 = "SOURCE_CHANNEL";
                                C19059j0 c19059j0242222 = this.f52271L;
                                obj5 = "SOURCE_LOCATION";
                                C19059j0 c19059j0252222 = this.f52272M;
                                obj6 = "SOURCE_BOOKMARK";
                                C19059j0 c19059j0262222 = this.f52273N;
                                obj7 = "SOURCE_LIKED";
                                C19059j0 c19059j0272222 = this.f52274O;
                                obj8 = "SOURCE_SIMILAR";
                                C19059j0 c19059j0282222 = this.f52275P;
                                obj9 = "SOURCE_COLLECTION";
                                if (obj3 instanceof FollowingData) {
                                }
                                if (followingData != null) {
                                }
                                section2 = (Section) c10008a.m53595a();
                                list = (List) c10008a.m53596b();
                                booleanValue = ((Boolean) c10008a.m53597c()).booleanValue();
                                list2 = (List) c10008a.m53598d();
                                List m51168m3222 = section2.m51168m();
                                ArrayList arrayList22222 = new ArrayList();
                                while (r12.hasNext()) {
                                }
                                C19059j0 c19059j0302222 = c19059j0242222;
                                section2.m51172q(arrayList22222);
                                if (!AbstractC19074t.m100204b(videoPresenterImpl.f52144B, "SOURCE_FOLLOWING")) {
                                }
                                if (AbstractC19074t.m100204b(videoPresenterImpl.f52144B, "SOURCE_FOR_U")) {
                                }
                            }
                            throw new IllegalArgumentException();
                        case -113911590:
                            obj2 = "SOURCE_HASHTAG";
                            if (str4.equals("SOURCE_BOOKMARK")) {
                                InterfaceC18170g interfaceC18170g6 = VideoPresenterImpl.this.f52169r;
                                LoadMoreInfo loadMoreInfo7 = this.f52268I;
                                this.f52266G = coroutineScope;
                                this.f52276t = m143692z;
                                this.f52265F = 12;
                                mo96618t0 = interfaceC18170g6.mo96618t0(loadMoreInfo7, this);
                                if (mo96618t0 == m142578e) {
                                    return m142578e;
                                }
                                parcelable = (Parcelable) mo96618t0;
                                InterfaceC29283d interfaceC29283d322222 = m143692z;
                                obj3 = parcelable;
                                interfaceC29283d = interfaceC29283d322222;
                                videoPresenterImpl = VideoPresenterImpl.this;
                                LoadMoreInfo loadMoreInfo222222 = this.f52268I;
                                c19059j0 = this.f52269J;
                                c19059j02 = this.f52270K;
                                obj4 = "SOURCE_CHANNEL";
                                C19059j0 c19059j02422222 = this.f52271L;
                                obj5 = "SOURCE_LOCATION";
                                C19059j0 c19059j02522222 = this.f52272M;
                                obj6 = "SOURCE_BOOKMARK";
                                C19059j0 c19059j02622222 = this.f52273N;
                                obj7 = "SOURCE_LIKED";
                                C19059j0 c19059j02722222 = this.f52274O;
                                obj8 = "SOURCE_SIMILAR";
                                C19059j0 c19059j02822222 = this.f52275P;
                                obj9 = "SOURCE_COLLECTION";
                                if (obj3 instanceof FollowingData) {
                                }
                                if (followingData != null) {
                                }
                                section2 = (Section) c10008a.m53595a();
                                list = (List) c10008a.m53596b();
                                booleanValue = ((Boolean) c10008a.m53597c()).booleanValue();
                                list2 = (List) c10008a.m53598d();
                                List m51168m32222 = section2.m51168m();
                                ArrayList arrayList222222 = new ArrayList();
                                while (r12.hasNext()) {
                                }
                                C19059j0 c19059j03022222 = c19059j02422222;
                                section2.m51172q(arrayList222222);
                                if (!AbstractC19074t.m100204b(videoPresenterImpl.f52144B, "SOURCE_FOLLOWING")) {
                                }
                                if (AbstractC19074t.m100204b(videoPresenterImpl.f52144B, "SOURCE_FOR_U")) {
                                }
                            }
                            throw new IllegalArgumentException();
                        case 469220381:
                            obj2 = "SOURCE_HASHTAG";
                            if (str4.equals("SOURCE_BTS_COMMENT")) {
                                interfaceC29283d = m143692z;
                                obj3 = null;
                                videoPresenterImpl = VideoPresenterImpl.this;
                                LoadMoreInfo loadMoreInfo2222222 = this.f52268I;
                                c19059j0 = this.f52269J;
                                c19059j02 = this.f52270K;
                                obj4 = "SOURCE_CHANNEL";
                                C19059j0 c19059j024222222 = this.f52271L;
                                obj5 = "SOURCE_LOCATION";
                                C19059j0 c19059j025222222 = this.f52272M;
                                obj6 = "SOURCE_BOOKMARK";
                                C19059j0 c19059j026222222 = this.f52273N;
                                obj7 = "SOURCE_LIKED";
                                C19059j0 c19059j027222222 = this.f52274O;
                                obj8 = "SOURCE_SIMILAR";
                                C19059j0 c19059j028222222 = this.f52275P;
                                obj9 = "SOURCE_COLLECTION";
                                if (obj3 instanceof FollowingData) {
                                }
                                if (followingData != null) {
                                }
                                section2 = (Section) c10008a.m53595a();
                                list = (List) c10008a.m53596b();
                                booleanValue = ((Boolean) c10008a.m53597c()).booleanValue();
                                list2 = (List) c10008a.m53598d();
                                List m51168m322222 = section2.m51168m();
                                ArrayList arrayList2222222 = new ArrayList();
                                while (r12.hasNext()) {
                                }
                                C19059j0 c19059j030222222 = c19059j024222222;
                                section2.m51172q(arrayList2222222);
                                if (!AbstractC19074t.m100204b(videoPresenterImpl.f52144B, "SOURCE_FOLLOWING")) {
                                }
                                if (AbstractC19074t.m100204b(videoPresenterImpl.f52144B, "SOURCE_FOR_U")) {
                                }
                            }
                            throw new IllegalArgumentException();
                        case 596808987:
                            obj2 = "SOURCE_HASHTAG";
                            if (str4.equals("SOURCE_FOR_U")) {
                                InterfaceC18170g interfaceC18170g7 = VideoPresenterImpl.this.f52169r;
                                LoadMoreInfo loadMoreInfo8 = this.f52268I;
                                String m53557r0 = VideoPresenterImpl.this.m53557r0();
                                C25093p c25093p2 = VideoPresenterImpl.this.f52165W;
                                if (c25093p2 != null) {
                                    str2 = c25093p2.m130103w();
                                } else {
                                    str2 = null;
                                }
                                this.f52266G = coroutineScope;
                                this.f52276t = m143692z;
                                this.f52265F = 3;
                                mo96582b = interfaceC18170g7.mo96582b(loadMoreInfo8, m53557r0, str2, this);
                                if (mo96582b == m142578e) {
                                    return m142578e;
                                }
                                ForUData forUData2 = (ForUData) mo96582b;
                                c25093p = VideoPresenterImpl.this.f52165W;
                                parcelable = forUData2;
                                if (c25093p != null) {
                                    List m51168m4 = forUData2.m50946d().m51168m();
                                    m131511r = AbstractC25370t.m131511r(m51168m4, 10);
                                    ArrayList arrayList3 = new ArrayList(m131511r);
                                    Iterator it = m51168m4.iterator();
                                    while (it.hasNext()) {
                                        arrayList3.add(((Video) it.next()).m52911t());
                                    }
                                    c25093p.m130098G(arrayList3);
                                    C24848g0 c24848g0 = C24848g0.f119245a;
                                    parcelable = forUData2;
                                }
                                InterfaceC29283d interfaceC29283d3222222 = m143692z;
                                obj3 = parcelable;
                                interfaceC29283d = interfaceC29283d3222222;
                                videoPresenterImpl = VideoPresenterImpl.this;
                                LoadMoreInfo loadMoreInfo22222222 = this.f52268I;
                                c19059j0 = this.f52269J;
                                c19059j02 = this.f52270K;
                                obj4 = "SOURCE_CHANNEL";
                                C19059j0 c19059j0242222222 = this.f52271L;
                                obj5 = "SOURCE_LOCATION";
                                C19059j0 c19059j0252222222 = this.f52272M;
                                obj6 = "SOURCE_BOOKMARK";
                                C19059j0 c19059j0262222222 = this.f52273N;
                                obj7 = "SOURCE_LIKED";
                                C19059j0 c19059j0272222222 = this.f52274O;
                                obj8 = "SOURCE_SIMILAR";
                                C19059j0 c19059j0282222222 = this.f52275P;
                                obj9 = "SOURCE_COLLECTION";
                                if (obj3 instanceof FollowingData) {
                                }
                                if (followingData != null) {
                                }
                                section2 = (Section) c10008a.m53595a();
                                list = (List) c10008a.m53596b();
                                booleanValue = ((Boolean) c10008a.m53597c()).booleanValue();
                                list2 = (List) c10008a.m53598d();
                                List m51168m3222222 = section2.m51168m();
                                ArrayList arrayList22222222 = new ArrayList();
                                while (r12.hasNext()) {
                                }
                                C19059j0 c19059j0302222222 = c19059j0242222222;
                                section2.m51172q(arrayList22222222);
                                if (!AbstractC19074t.m100204b(videoPresenterImpl.f52144B, "SOURCE_FOLLOWING")) {
                                }
                                if (AbstractC19074t.m100204b(videoPresenterImpl.f52144B, "SOURCE_FOR_U")) {
                                }
                            }
                            throw new IllegalArgumentException();
                        case 602163817:
                            obj2 = "SOURCE_HASHTAG";
                            if (str4.equals("SOURCE_LIKED")) {
                                InterfaceC18170g interfaceC18170g8 = VideoPresenterImpl.this.f52169r;
                                LoadMoreInfo loadMoreInfo9 = this.f52268I;
                                this.f52266G = coroutineScope;
                                this.f52276t = m143692z;
                                this.f52265F = 9;
                                mo96583b0 = interfaceC18170g8.mo96583b0(loadMoreInfo9, this);
                                if (mo96583b0 == m142578e) {
                                    return m142578e;
                                }
                                parcelable = (Parcelable) mo96583b0;
                                InterfaceC29283d interfaceC29283d32222222 = m143692z;
                                obj3 = parcelable;
                                interfaceC29283d = interfaceC29283d32222222;
                                videoPresenterImpl = VideoPresenterImpl.this;
                                LoadMoreInfo loadMoreInfo222222222 = this.f52268I;
                                c19059j0 = this.f52269J;
                                c19059j02 = this.f52270K;
                                obj4 = "SOURCE_CHANNEL";
                                C19059j0 c19059j02422222222 = this.f52271L;
                                obj5 = "SOURCE_LOCATION";
                                C19059j0 c19059j02522222222 = this.f52272M;
                                obj6 = "SOURCE_BOOKMARK";
                                C19059j0 c19059j02622222222 = this.f52273N;
                                obj7 = "SOURCE_LIKED";
                                C19059j0 c19059j02722222222 = this.f52274O;
                                obj8 = "SOURCE_SIMILAR";
                                C19059j0 c19059j02822222222 = this.f52275P;
                                obj9 = "SOURCE_COLLECTION";
                                if (obj3 instanceof FollowingData) {
                                }
                                if (followingData != null) {
                                }
                                section2 = (Section) c10008a.m53595a();
                                list = (List) c10008a.m53596b();
                                booleanValue = ((Boolean) c10008a.m53597c()).booleanValue();
                                list2 = (List) c10008a.m53598d();
                                List m51168m32222222 = section2.m51168m();
                                ArrayList arrayList222222222 = new ArrayList();
                                while (r12.hasNext()) {
                                }
                                C19059j0 c19059j03022222222 = c19059j02422222222;
                                section2.m51172q(arrayList222222222);
                                if (!AbstractC19074t.m100204b(videoPresenterImpl.f52144B, "SOURCE_FOLLOWING")) {
                                }
                                if (AbstractC19074t.m100204b(videoPresenterImpl.f52144B, "SOURCE_FOR_U")) {
                                }
                            }
                            throw new IllegalArgumentException();
                        case 615369896:
                            obj2 = "SOURCE_HASHTAG";
                            if (str4.equals("SOURCE_SEARCH_VIDEO")) {
                                InterfaceC18170g interfaceC18170g9 = VideoPresenterImpl.this.f52169r;
                                String str9 = VideoPresenterImpl.this.f52152J;
                                LoadMoreInfo loadMoreInfo10 = this.f52268I;
                                this.f52266G = coroutineScope;
                                this.f52276t = m143692z;
                                this.f52265F = 11;
                                mo96609o02 = interfaceC18170g9.mo96609o0("search_video", str9, loadMoreInfo10, this);
                                if (mo96609o02 == m142578e) {
                                    return m142578e;
                                }
                                parcelable = (Parcelable) mo96609o02;
                                InterfaceC29283d interfaceC29283d322222222 = m143692z;
                                obj3 = parcelable;
                                interfaceC29283d = interfaceC29283d322222222;
                                videoPresenterImpl = VideoPresenterImpl.this;
                                LoadMoreInfo loadMoreInfo2222222222 = this.f52268I;
                                c19059j0 = this.f52269J;
                                c19059j02 = this.f52270K;
                                obj4 = "SOURCE_CHANNEL";
                                C19059j0 c19059j024222222222 = this.f52271L;
                                obj5 = "SOURCE_LOCATION";
                                C19059j0 c19059j025222222222 = this.f52272M;
                                obj6 = "SOURCE_BOOKMARK";
                                C19059j0 c19059j026222222222 = this.f52273N;
                                obj7 = "SOURCE_LIKED";
                                C19059j0 c19059j027222222222 = this.f52274O;
                                obj8 = "SOURCE_SIMILAR";
                                C19059j0 c19059j028222222222 = this.f52275P;
                                obj9 = "SOURCE_COLLECTION";
                                if (obj3 instanceof FollowingData) {
                                }
                                if (followingData != null) {
                                }
                                section2 = (Section) c10008a.m53595a();
                                list = (List) c10008a.m53596b();
                                booleanValue = ((Boolean) c10008a.m53597c()).booleanValue();
                                list2 = (List) c10008a.m53598d();
                                List m51168m322222222 = section2.m51168m();
                                ArrayList arrayList2222222222 = new ArrayList();
                                while (r12.hasNext()) {
                                }
                                C19059j0 c19059j030222222222 = c19059j024222222222;
                                section2.m51172q(arrayList2222222222);
                                if (!AbstractC19074t.m100204b(videoPresenterImpl.f52144B, "SOURCE_FOLLOWING")) {
                                }
                                if (AbstractC19074t.m100204b(videoPresenterImpl.f52144B, "SOURCE_FOR_U")) {
                                }
                            }
                            throw new IllegalArgumentException();
                        case 778377639:
                            obj2 = "SOURCE_HASHTAG";
                            if (str4.equals("SOURCE_SIMILAR")) {
                                InterfaceC18170g interfaceC18170g10 = VideoPresenterImpl.this.f52169r;
                                String str10 = VideoPresenterImpl.this.f52147E;
                                LoadMoreInfo loadMoreInfo11 = this.f52268I;
                                this.f52266G = coroutineScope;
                                this.f52276t = m143692z;
                                this.f52265F = 6;
                                mo96592g = interfaceC18170g10.mo96592g(str10, "similar_video", loadMoreInfo11, this);
                                if (mo96592g == m142578e) {
                                    return m142578e;
                                }
                                parcelable = (Parcelable) mo96592g;
                                InterfaceC29283d interfaceC29283d3222222222 = m143692z;
                                obj3 = parcelable;
                                interfaceC29283d = interfaceC29283d3222222222;
                                videoPresenterImpl = VideoPresenterImpl.this;
                                LoadMoreInfo loadMoreInfo22222222222 = this.f52268I;
                                c19059j0 = this.f52269J;
                                c19059j02 = this.f52270K;
                                obj4 = "SOURCE_CHANNEL";
                                C19059j0 c19059j0242222222222 = this.f52271L;
                                obj5 = "SOURCE_LOCATION";
                                C19059j0 c19059j0252222222222 = this.f52272M;
                                obj6 = "SOURCE_BOOKMARK";
                                C19059j0 c19059j0262222222222 = this.f52273N;
                                obj7 = "SOURCE_LIKED";
                                C19059j0 c19059j0272222222222 = this.f52274O;
                                obj8 = "SOURCE_SIMILAR";
                                C19059j0 c19059j0282222222222 = this.f52275P;
                                obj9 = "SOURCE_COLLECTION";
                                if (obj3 instanceof FollowingData) {
                                }
                                if (followingData != null) {
                                }
                                section2 = (Section) c10008a.m53595a();
                                list = (List) c10008a.m53596b();
                                booleanValue = ((Boolean) c10008a.m53597c()).booleanValue();
                                list2 = (List) c10008a.m53598d();
                                List m51168m3222222222 = section2.m51168m();
                                ArrayList arrayList22222222222 = new ArrayList();
                                while (r12.hasNext()) {
                                }
                                C19059j0 c19059j0302222222222 = c19059j0242222222222;
                                section2.m51172q(arrayList22222222222);
                                if (!AbstractC19074t.m100204b(videoPresenterImpl.f52144B, "SOURCE_FOLLOWING")) {
                                }
                                if (AbstractC19074t.m100204b(videoPresenterImpl.f52144B, "SOURCE_FOR_U")) {
                                }
                            }
                            throw new IllegalArgumentException();
                        case 1323686722:
                            obj2 = "SOURCE_HASHTAG";
                            if (str4.equals("SOURCE_FRIEND")) {
                                InterfaceC18170g interfaceC18170g11 = VideoPresenterImpl.this.f52169r;
                                LoadMoreInfo loadMoreInfo12 = this.f52268I;
                                this.f52266G = coroutineScope;
                                this.f52276t = m143692z;
                                this.f52265F = 2;
                                mo96591f0 = interfaceC18170g11.mo96591f0(loadMoreInfo12, this);
                                if (mo96591f0 == m142578e) {
                                    return m142578e;
                                }
                                parcelable = (Parcelable) mo96591f0;
                                InterfaceC29283d interfaceC29283d32222222222 = m143692z;
                                obj3 = parcelable;
                                interfaceC29283d = interfaceC29283d32222222222;
                                videoPresenterImpl = VideoPresenterImpl.this;
                                LoadMoreInfo loadMoreInfo222222222222 = this.f52268I;
                                c19059j0 = this.f52269J;
                                c19059j02 = this.f52270K;
                                obj4 = "SOURCE_CHANNEL";
                                C19059j0 c19059j02422222222222 = this.f52271L;
                                obj5 = "SOURCE_LOCATION";
                                C19059j0 c19059j02522222222222 = this.f52272M;
                                obj6 = "SOURCE_BOOKMARK";
                                C19059j0 c19059j02622222222222 = this.f52273N;
                                obj7 = "SOURCE_LIKED";
                                C19059j0 c19059j02722222222222 = this.f52274O;
                                obj8 = "SOURCE_SIMILAR";
                                C19059j0 c19059j02822222222222 = this.f52275P;
                                obj9 = "SOURCE_COLLECTION";
                                if (obj3 instanceof FollowingData) {
                                }
                                if (followingData != null) {
                                }
                                section2 = (Section) c10008a.m53595a();
                                list = (List) c10008a.m53596b();
                                booleanValue = ((Boolean) c10008a.m53597c()).booleanValue();
                                list2 = (List) c10008a.m53598d();
                                List m51168m32222222222 = section2.m51168m();
                                ArrayList arrayList222222222222 = new ArrayList();
                                while (r12.hasNext()) {
                                }
                                C19059j0 c19059j03022222222222 = c19059j02422222222222;
                                section2.m51172q(arrayList222222222222);
                                if (!AbstractC19074t.m100204b(videoPresenterImpl.f52144B, "SOURCE_FOLLOWING")) {
                                }
                                if (AbstractC19074t.m100204b(videoPresenterImpl.f52144B, "SOURCE_FOR_U")) {
                                }
                            }
                            throw new IllegalArgumentException();
                        case 1730512194:
                            obj2 = "SOURCE_HASHTAG";
                            if (str4.equals("SOURCE_COLLECTION")) {
                                InterfaceC18170g interfaceC18170g12 = VideoPresenterImpl.this.f52169r;
                                String str11 = VideoPresenterImpl.this.f52148F;
                                LoadMoreInfo loadMoreInfo13 = this.f52268I;
                                this.f52266G = coroutineScope;
                                this.f52276t = m143692z;
                                this.f52265F = 7;
                                mo96619u = interfaceC18170g12.mo96619u(str11, loadMoreInfo13, this);
                                if (mo96619u == m142578e) {
                                    return m142578e;
                                }
                                parcelable = ((CollectionVideo) mo96619u).m50803b();
                                InterfaceC29283d interfaceC29283d322222222222 = m143692z;
                                obj3 = parcelable;
                                interfaceC29283d = interfaceC29283d322222222222;
                                videoPresenterImpl = VideoPresenterImpl.this;
                                LoadMoreInfo loadMoreInfo2222222222222 = this.f52268I;
                                c19059j0 = this.f52269J;
                                c19059j02 = this.f52270K;
                                obj4 = "SOURCE_CHANNEL";
                                C19059j0 c19059j024222222222222 = this.f52271L;
                                obj5 = "SOURCE_LOCATION";
                                C19059j0 c19059j025222222222222 = this.f52272M;
                                obj6 = "SOURCE_BOOKMARK";
                                C19059j0 c19059j026222222222222 = this.f52273N;
                                obj7 = "SOURCE_LIKED";
                                C19059j0 c19059j027222222222222 = this.f52274O;
                                obj8 = "SOURCE_SIMILAR";
                                C19059j0 c19059j028222222222222 = this.f52275P;
                                obj9 = "SOURCE_COLLECTION";
                                if (obj3 instanceof FollowingData) {
                                }
                                if (followingData != null) {
                                }
                                section2 = (Section) c10008a.m53595a();
                                list = (List) c10008a.m53596b();
                                booleanValue = ((Boolean) c10008a.m53597c()).booleanValue();
                                list2 = (List) c10008a.m53598d();
                                List m51168m322222222222 = section2.m51168m();
                                ArrayList arrayList2222222222222 = new ArrayList();
                                while (r12.hasNext()) {
                                }
                                C19059j0 c19059j030222222222222 = c19059j024222222222222;
                                section2.m51172q(arrayList2222222222222);
                                if (!AbstractC19074t.m100204b(videoPresenterImpl.f52144B, "SOURCE_FOLLOWING")) {
                                }
                                if (AbstractC19074t.m100204b(videoPresenterImpl.f52144B, "SOURCE_FOR_U")) {
                                }
                            }
                            throw new IllegalArgumentException();
                        case 2097700250:
                            if (str4.equals("SOURCE_NOTI")) {
                                InterfaceC18170g interfaceC18170g13 = VideoPresenterImpl.this.f52169r;
                                String str12 = VideoPresenterImpl.this.f52150H;
                                obj2 = "SOURCE_HASHTAG";
                                LoadMoreInfo loadMoreInfo14 = this.f52268I;
                                this.f52266G = coroutineScope;
                                this.f52276t = m143692z;
                                this.f52265F = 8;
                                mo96592g2 = interfaceC18170g13.mo96592g(str12, "get_related", loadMoreInfo14, this);
                                if (mo96592g2 == m142578e) {
                                    return m142578e;
                                }
                                parcelable = (Parcelable) mo96592g2;
                                InterfaceC29283d interfaceC29283d3222222222222 = m143692z;
                                obj3 = parcelable;
                                interfaceC29283d = interfaceC29283d3222222222222;
                                videoPresenterImpl = VideoPresenterImpl.this;
                                LoadMoreInfo loadMoreInfo22222222222222 = this.f52268I;
                                c19059j0 = this.f52269J;
                                c19059j02 = this.f52270K;
                                obj4 = "SOURCE_CHANNEL";
                                C19059j0 c19059j0242222222222222 = this.f52271L;
                                obj5 = "SOURCE_LOCATION";
                                C19059j0 c19059j0252222222222222 = this.f52272M;
                                obj6 = "SOURCE_BOOKMARK";
                                C19059j0 c19059j0262222222222222 = this.f52273N;
                                obj7 = "SOURCE_LIKED";
                                C19059j0 c19059j0272222222222222 = this.f52274O;
                                obj8 = "SOURCE_SIMILAR";
                                C19059j0 c19059j0282222222222222 = this.f52275P;
                                obj9 = "SOURCE_COLLECTION";
                                if (obj3 instanceof FollowingData) {
                                }
                                if (followingData != null) {
                                }
                                section2 = (Section) c10008a.m53595a();
                                list = (List) c10008a.m53596b();
                                booleanValue = ((Boolean) c10008a.m53597c()).booleanValue();
                                list2 = (List) c10008a.m53598d();
                                List m51168m3222222222222 = section2.m51168m();
                                ArrayList arrayList22222222222222 = new ArrayList();
                                while (r12.hasNext()) {
                                }
                                C19059j0 c19059j0302222222222222 = c19059j0242222222222222;
                                section2.m51172q(arrayList22222222222222);
                                if (!AbstractC19074t.m100204b(videoPresenterImpl.f52144B, "SOURCE_FOLLOWING")) {
                                }
                                if (AbstractC19074t.m100204b(videoPresenterImpl.f52144B, "SOURCE_FOR_U")) {
                                }
                            }
                            throw new IllegalArgumentException();
                        default:
                            throw new IllegalArgumentException();
                    }
                case 1:
                    InterfaceC29283d interfaceC29283d4 = (InterfaceC29283d) this.f52276t;
                    AbstractC24862s.m129228b(obj);
                    m143692z = interfaceC29283d4;
                    obj2 = "SOURCE_HASHTAG";
                    mo96610p = obj;
                    parcelable = (Parcelable) mo96610p;
                    InterfaceC29283d interfaceC29283d32222222222222 = m143692z;
                    obj3 = parcelable;
                    interfaceC29283d = interfaceC29283d32222222222222;
                    videoPresenterImpl = VideoPresenterImpl.this;
                    LoadMoreInfo loadMoreInfo222222222222222 = this.f52268I;
                    c19059j0 = this.f52269J;
                    c19059j02 = this.f52270K;
                    obj4 = "SOURCE_CHANNEL";
                    C19059j0 c19059j02422222222222222 = this.f52271L;
                    obj5 = "SOURCE_LOCATION";
                    C19059j0 c19059j02522222222222222 = this.f52272M;
                    obj6 = "SOURCE_BOOKMARK";
                    C19059j0 c19059j02622222222222222 = this.f52273N;
                    obj7 = "SOURCE_LIKED";
                    C19059j0 c19059j02722222222222222 = this.f52274O;
                    obj8 = "SOURCE_SIMILAR";
                    C19059j0 c19059j02822222222222222 = this.f52275P;
                    obj9 = "SOURCE_COLLECTION";
                    if (obj3 instanceof FollowingData) {
                    }
                    if (followingData != null) {
                    }
                    section2 = (Section) c10008a.m53595a();
                    list = (List) c10008a.m53596b();
                    booleanValue = ((Boolean) c10008a.m53597c()).booleanValue();
                    list2 = (List) c10008a.m53598d();
                    List m51168m32222222222222 = section2.m51168m();
                    ArrayList arrayList222222222222222 = new ArrayList();
                    while (r12.hasNext()) {
                    }
                    C19059j0 c19059j03022222222222222 = c19059j02422222222222222;
                    section2.m51172q(arrayList222222222222222);
                    if (!AbstractC19074t.m100204b(videoPresenterImpl.f52144B, "SOURCE_FOLLOWING")) {
                    }
                    if (AbstractC19074t.m100204b(videoPresenterImpl.f52144B, "SOURCE_FOR_U")) {
                    }
                    break;
                case 2:
                    InterfaceC29283d interfaceC29283d5 = (InterfaceC29283d) this.f52276t;
                    AbstractC24862s.m129228b(obj);
                    m143692z = interfaceC29283d5;
                    obj2 = "SOURCE_HASHTAG";
                    mo96591f0 = obj;
                    parcelable = (Parcelable) mo96591f0;
                    InterfaceC29283d interfaceC29283d322222222222222 = m143692z;
                    obj3 = parcelable;
                    interfaceC29283d = interfaceC29283d322222222222222;
                    videoPresenterImpl = VideoPresenterImpl.this;
                    LoadMoreInfo loadMoreInfo2222222222222222 = this.f52268I;
                    c19059j0 = this.f52269J;
                    c19059j02 = this.f52270K;
                    obj4 = "SOURCE_CHANNEL";
                    C19059j0 c19059j024222222222222222 = this.f52271L;
                    obj5 = "SOURCE_LOCATION";
                    C19059j0 c19059j025222222222222222 = this.f52272M;
                    obj6 = "SOURCE_BOOKMARK";
                    C19059j0 c19059j026222222222222222 = this.f52273N;
                    obj7 = "SOURCE_LIKED";
                    C19059j0 c19059j027222222222222222 = this.f52274O;
                    obj8 = "SOURCE_SIMILAR";
                    C19059j0 c19059j028222222222222222 = this.f52275P;
                    obj9 = "SOURCE_COLLECTION";
                    if (obj3 instanceof FollowingData) {
                    }
                    if (followingData != null) {
                    }
                    section2 = (Section) c10008a.m53595a();
                    list = (List) c10008a.m53596b();
                    booleanValue = ((Boolean) c10008a.m53597c()).booleanValue();
                    list2 = (List) c10008a.m53598d();
                    List m51168m322222222222222 = section2.m51168m();
                    ArrayList arrayList2222222222222222 = new ArrayList();
                    while (r12.hasNext()) {
                    }
                    C19059j0 c19059j030222222222222222 = c19059j024222222222222222;
                    section2.m51172q(arrayList2222222222222222);
                    if (!AbstractC19074t.m100204b(videoPresenterImpl.f52144B, "SOURCE_FOLLOWING")) {
                    }
                    if (AbstractC19074t.m100204b(videoPresenterImpl.f52144B, "SOURCE_FOR_U")) {
                    }
                    break;
                case 3:
                    InterfaceC29283d interfaceC29283d6 = (InterfaceC29283d) this.f52276t;
                    AbstractC24862s.m129228b(obj);
                    m143692z = interfaceC29283d6;
                    obj2 = "SOURCE_HASHTAG";
                    mo96582b = obj;
                    ForUData forUData22 = (ForUData) mo96582b;
                    c25093p = VideoPresenterImpl.this.f52165W;
                    parcelable = forUData22;
                    if (c25093p != null) {
                    }
                    InterfaceC29283d interfaceC29283d3222222222222222 = m143692z;
                    obj3 = parcelable;
                    interfaceC29283d = interfaceC29283d3222222222222222;
                    videoPresenterImpl = VideoPresenterImpl.this;
                    LoadMoreInfo loadMoreInfo22222222222222222 = this.f52268I;
                    c19059j0 = this.f52269J;
                    c19059j02 = this.f52270K;
                    obj4 = "SOURCE_CHANNEL";
                    C19059j0 c19059j0242222222222222222 = this.f52271L;
                    obj5 = "SOURCE_LOCATION";
                    C19059j0 c19059j0252222222222222222 = this.f52272M;
                    obj6 = "SOURCE_BOOKMARK";
                    C19059j0 c19059j0262222222222222222 = this.f52273N;
                    obj7 = "SOURCE_LIKED";
                    C19059j0 c19059j0272222222222222222 = this.f52274O;
                    obj8 = "SOURCE_SIMILAR";
                    C19059j0 c19059j0282222222222222222 = this.f52275P;
                    obj9 = "SOURCE_COLLECTION";
                    if (obj3 instanceof FollowingData) {
                    }
                    if (followingData != null) {
                    }
                    section2 = (Section) c10008a.m53595a();
                    list = (List) c10008a.m53596b();
                    booleanValue = ((Boolean) c10008a.m53597c()).booleanValue();
                    list2 = (List) c10008a.m53598d();
                    List m51168m3222222222222222 = section2.m51168m();
                    ArrayList arrayList22222222222222222 = new ArrayList();
                    while (r12.hasNext()) {
                    }
                    C19059j0 c19059j0302222222222222222 = c19059j0242222222222222222;
                    section2.m51172q(arrayList22222222222222222);
                    if (!AbstractC19074t.m100204b(videoPresenterImpl.f52144B, "SOURCE_FOLLOWING")) {
                    }
                    if (AbstractC19074t.m100204b(videoPresenterImpl.f52144B, "SOURCE_FOR_U")) {
                    }
                    break;
                case 4:
                    InterfaceC29283d interfaceC29283d7 = (InterfaceC29283d) this.f52276t;
                    AbstractC24862s.m129228b(obj);
                    m143692z = interfaceC29283d7;
                    obj2 = "SOURCE_HASHTAG";
                    mo96579Z = obj;
                    parcelable = (Parcelable) mo96579Z;
                    InterfaceC29283d interfaceC29283d32222222222222222 = m143692z;
                    obj3 = parcelable;
                    interfaceC29283d = interfaceC29283d32222222222222222;
                    videoPresenterImpl = VideoPresenterImpl.this;
                    LoadMoreInfo loadMoreInfo222222222222222222 = this.f52268I;
                    c19059j0 = this.f52269J;
                    c19059j02 = this.f52270K;
                    obj4 = "SOURCE_CHANNEL";
                    C19059j0 c19059j02422222222222222222 = this.f52271L;
                    obj5 = "SOURCE_LOCATION";
                    C19059j0 c19059j02522222222222222222 = this.f52272M;
                    obj6 = "SOURCE_BOOKMARK";
                    C19059j0 c19059j02622222222222222222 = this.f52273N;
                    obj7 = "SOURCE_LIKED";
                    C19059j0 c19059j02722222222222222222 = this.f52274O;
                    obj8 = "SOURCE_SIMILAR";
                    C19059j0 c19059j02822222222222222222 = this.f52275P;
                    obj9 = "SOURCE_COLLECTION";
                    if (obj3 instanceof FollowingData) {
                    }
                    if (followingData != null) {
                    }
                    section2 = (Section) c10008a.m53595a();
                    list = (List) c10008a.m53596b();
                    booleanValue = ((Boolean) c10008a.m53597c()).booleanValue();
                    list2 = (List) c10008a.m53598d();
                    List m51168m32222222222222222 = section2.m51168m();
                    ArrayList arrayList222222222222222222 = new ArrayList();
                    while (r12.hasNext()) {
                    }
                    C19059j0 c19059j03022222222222222222 = c19059j02422222222222222222;
                    section2.m51172q(arrayList222222222222222222);
                    if (!AbstractC19074t.m100204b(videoPresenterImpl.f52144B, "SOURCE_FOLLOWING")) {
                    }
                    if (AbstractC19074t.m100204b(videoPresenterImpl.f52144B, "SOURCE_FOR_U")) {
                    }
                    break;
                case 5:
                    InterfaceC29283d interfaceC29283d8 = (InterfaceC29283d) this.f52276t;
                    AbstractC24862s.m129228b(obj);
                    m143692z = interfaceC29283d8;
                    mo96628y0 = obj;
                    obj2 = "SOURCE_HASHTAG";
                    parcelable = (Parcelable) mo96628y0;
                    InterfaceC29283d interfaceC29283d322222222222222222 = m143692z;
                    obj3 = parcelable;
                    interfaceC29283d = interfaceC29283d322222222222222222;
                    videoPresenterImpl = VideoPresenterImpl.this;
                    LoadMoreInfo loadMoreInfo2222222222222222222 = this.f52268I;
                    c19059j0 = this.f52269J;
                    c19059j02 = this.f52270K;
                    obj4 = "SOURCE_CHANNEL";
                    C19059j0 c19059j024222222222222222222 = this.f52271L;
                    obj5 = "SOURCE_LOCATION";
                    C19059j0 c19059j025222222222222222222 = this.f52272M;
                    obj6 = "SOURCE_BOOKMARK";
                    C19059j0 c19059j026222222222222222222 = this.f52273N;
                    obj7 = "SOURCE_LIKED";
                    C19059j0 c19059j027222222222222222222 = this.f52274O;
                    obj8 = "SOURCE_SIMILAR";
                    C19059j0 c19059j028222222222222222222 = this.f52275P;
                    obj9 = "SOURCE_COLLECTION";
                    if (obj3 instanceof FollowingData) {
                    }
                    if (followingData != null) {
                    }
                    section2 = (Section) c10008a.m53595a();
                    list = (List) c10008a.m53596b();
                    booleanValue = ((Boolean) c10008a.m53597c()).booleanValue();
                    list2 = (List) c10008a.m53598d();
                    List m51168m322222222222222222 = section2.m51168m();
                    ArrayList arrayList2222222222222222222 = new ArrayList();
                    while (r12.hasNext()) {
                    }
                    C19059j0 c19059j030222222222222222222 = c19059j024222222222222222222;
                    section2.m51172q(arrayList2222222222222222222);
                    if (!AbstractC19074t.m100204b(videoPresenterImpl.f52144B, "SOURCE_FOLLOWING")) {
                    }
                    if (AbstractC19074t.m100204b(videoPresenterImpl.f52144B, "SOURCE_FOR_U")) {
                    }
                    break;
                case 6:
                    InterfaceC29283d interfaceC29283d9 = (InterfaceC29283d) this.f52276t;
                    AbstractC24862s.m129228b(obj);
                    m143692z = interfaceC29283d9;
                    obj2 = "SOURCE_HASHTAG";
                    mo96592g = obj;
                    parcelable = (Parcelable) mo96592g;
                    InterfaceC29283d interfaceC29283d3222222222222222222 = m143692z;
                    obj3 = parcelable;
                    interfaceC29283d = interfaceC29283d3222222222222222222;
                    videoPresenterImpl = VideoPresenterImpl.this;
                    LoadMoreInfo loadMoreInfo22222222222222222222 = this.f52268I;
                    c19059j0 = this.f52269J;
                    c19059j02 = this.f52270K;
                    obj4 = "SOURCE_CHANNEL";
                    C19059j0 c19059j0242222222222222222222 = this.f52271L;
                    obj5 = "SOURCE_LOCATION";
                    C19059j0 c19059j0252222222222222222222 = this.f52272M;
                    obj6 = "SOURCE_BOOKMARK";
                    C19059j0 c19059j0262222222222222222222 = this.f52273N;
                    obj7 = "SOURCE_LIKED";
                    C19059j0 c19059j0272222222222222222222 = this.f52274O;
                    obj8 = "SOURCE_SIMILAR";
                    C19059j0 c19059j0282222222222222222222 = this.f52275P;
                    obj9 = "SOURCE_COLLECTION";
                    if (obj3 instanceof FollowingData) {
                    }
                    if (followingData != null) {
                    }
                    section2 = (Section) c10008a.m53595a();
                    list = (List) c10008a.m53596b();
                    booleanValue = ((Boolean) c10008a.m53597c()).booleanValue();
                    list2 = (List) c10008a.m53598d();
                    List m51168m3222222222222222222 = section2.m51168m();
                    ArrayList arrayList22222222222222222222 = new ArrayList();
                    while (r12.hasNext()) {
                    }
                    C19059j0 c19059j0302222222222222222222 = c19059j0242222222222222222222;
                    section2.m51172q(arrayList22222222222222222222);
                    if (!AbstractC19074t.m100204b(videoPresenterImpl.f52144B, "SOURCE_FOLLOWING")) {
                    }
                    if (AbstractC19074t.m100204b(videoPresenterImpl.f52144B, "SOURCE_FOR_U")) {
                    }
                    break;
                case 7:
                    InterfaceC29283d interfaceC29283d10 = (InterfaceC29283d) this.f52276t;
                    AbstractC24862s.m129228b(obj);
                    m143692z = interfaceC29283d10;
                    obj2 = "SOURCE_HASHTAG";
                    mo96619u = obj;
                    parcelable = ((CollectionVideo) mo96619u).m50803b();
                    InterfaceC29283d interfaceC29283d32222222222222222222 = m143692z;
                    obj3 = parcelable;
                    interfaceC29283d = interfaceC29283d32222222222222222222;
                    videoPresenterImpl = VideoPresenterImpl.this;
                    LoadMoreInfo loadMoreInfo222222222222222222222 = this.f52268I;
                    c19059j0 = this.f52269J;
                    c19059j02 = this.f52270K;
                    obj4 = "SOURCE_CHANNEL";
                    C19059j0 c19059j02422222222222222222222 = this.f52271L;
                    obj5 = "SOURCE_LOCATION";
                    C19059j0 c19059j02522222222222222222222 = this.f52272M;
                    obj6 = "SOURCE_BOOKMARK";
                    C19059j0 c19059j02622222222222222222222 = this.f52273N;
                    obj7 = "SOURCE_LIKED";
                    C19059j0 c19059j02722222222222222222222 = this.f52274O;
                    obj8 = "SOURCE_SIMILAR";
                    C19059j0 c19059j02822222222222222222222 = this.f52275P;
                    obj9 = "SOURCE_COLLECTION";
                    if (obj3 instanceof FollowingData) {
                    }
                    if (followingData != null) {
                    }
                    section2 = (Section) c10008a.m53595a();
                    list = (List) c10008a.m53596b();
                    booleanValue = ((Boolean) c10008a.m53597c()).booleanValue();
                    list2 = (List) c10008a.m53598d();
                    List m51168m32222222222222222222 = section2.m51168m();
                    ArrayList arrayList222222222222222222222 = new ArrayList();
                    while (r12.hasNext()) {
                    }
                    C19059j0 c19059j03022222222222222222222 = c19059j02422222222222222222222;
                    section2.m51172q(arrayList222222222222222222222);
                    if (!AbstractC19074t.m100204b(videoPresenterImpl.f52144B, "SOURCE_FOLLOWING")) {
                    }
                    if (AbstractC19074t.m100204b(videoPresenterImpl.f52144B, "SOURCE_FOR_U")) {
                    }
                    break;
                case 8:
                    InterfaceC29283d interfaceC29283d11 = (InterfaceC29283d) this.f52276t;
                    AbstractC24862s.m129228b(obj);
                    m143692z = interfaceC29283d11;
                    obj2 = "SOURCE_HASHTAG";
                    mo96592g2 = obj;
                    parcelable = (Parcelable) mo96592g2;
                    InterfaceC29283d interfaceC29283d322222222222222222222 = m143692z;
                    obj3 = parcelable;
                    interfaceC29283d = interfaceC29283d322222222222222222222;
                    videoPresenterImpl = VideoPresenterImpl.this;
                    LoadMoreInfo loadMoreInfo2222222222222222222222 = this.f52268I;
                    c19059j0 = this.f52269J;
                    c19059j02 = this.f52270K;
                    obj4 = "SOURCE_CHANNEL";
                    C19059j0 c19059j024222222222222222222222 = this.f52271L;
                    obj5 = "SOURCE_LOCATION";
                    C19059j0 c19059j025222222222222222222222 = this.f52272M;
                    obj6 = "SOURCE_BOOKMARK";
                    C19059j0 c19059j026222222222222222222222 = this.f52273N;
                    obj7 = "SOURCE_LIKED";
                    C19059j0 c19059j027222222222222222222222 = this.f52274O;
                    obj8 = "SOURCE_SIMILAR";
                    C19059j0 c19059j028222222222222222222222 = this.f52275P;
                    obj9 = "SOURCE_COLLECTION";
                    if (obj3 instanceof FollowingData) {
                    }
                    if (followingData != null) {
                    }
                    section2 = (Section) c10008a.m53595a();
                    list = (List) c10008a.m53596b();
                    booleanValue = ((Boolean) c10008a.m53597c()).booleanValue();
                    list2 = (List) c10008a.m53598d();
                    List m51168m322222222222222222222 = section2.m51168m();
                    ArrayList arrayList2222222222222222222222 = new ArrayList();
                    while (r12.hasNext()) {
                    }
                    C19059j0 c19059j030222222222222222222222 = c19059j024222222222222222222222;
                    section2.m51172q(arrayList2222222222222222222222);
                    if (!AbstractC19074t.m100204b(videoPresenterImpl.f52144B, "SOURCE_FOLLOWING")) {
                    }
                    if (AbstractC19074t.m100204b(videoPresenterImpl.f52144B, "SOURCE_FOR_U")) {
                    }
                    break;
                case 9:
                    InterfaceC29283d interfaceC29283d12 = (InterfaceC29283d) this.f52276t;
                    AbstractC24862s.m129228b(obj);
                    m143692z = interfaceC29283d12;
                    obj2 = "SOURCE_HASHTAG";
                    mo96583b0 = obj;
                    parcelable = (Parcelable) mo96583b0;
                    InterfaceC29283d interfaceC29283d3222222222222222222222 = m143692z;
                    obj3 = parcelable;
                    interfaceC29283d = interfaceC29283d3222222222222222222222;
                    videoPresenterImpl = VideoPresenterImpl.this;
                    LoadMoreInfo loadMoreInfo22222222222222222222222 = this.f52268I;
                    c19059j0 = this.f52269J;
                    c19059j02 = this.f52270K;
                    obj4 = "SOURCE_CHANNEL";
                    C19059j0 c19059j0242222222222222222222222 = this.f52271L;
                    obj5 = "SOURCE_LOCATION";
                    C19059j0 c19059j0252222222222222222222222 = this.f52272M;
                    obj6 = "SOURCE_BOOKMARK";
                    C19059j0 c19059j0262222222222222222222222 = this.f52273N;
                    obj7 = "SOURCE_LIKED";
                    C19059j0 c19059j0272222222222222222222222 = this.f52274O;
                    obj8 = "SOURCE_SIMILAR";
                    C19059j0 c19059j0282222222222222222222222 = this.f52275P;
                    obj9 = "SOURCE_COLLECTION";
                    if (obj3 instanceof FollowingData) {
                    }
                    if (followingData != null) {
                    }
                    section2 = (Section) c10008a.m53595a();
                    list = (List) c10008a.m53596b();
                    booleanValue = ((Boolean) c10008a.m53597c()).booleanValue();
                    list2 = (List) c10008a.m53598d();
                    List m51168m3222222222222222222222 = section2.m51168m();
                    ArrayList arrayList22222222222222222222222 = new ArrayList();
                    while (r12.hasNext()) {
                    }
                    C19059j0 c19059j0302222222222222222222222 = c19059j0242222222222222222222222;
                    section2.m51172q(arrayList22222222222222222222222);
                    if (!AbstractC19074t.m100204b(videoPresenterImpl.f52144B, "SOURCE_FOLLOWING")) {
                    }
                    if (AbstractC19074t.m100204b(videoPresenterImpl.f52144B, "SOURCE_FOR_U")) {
                    }
                    break;
                case 10:
                    InterfaceC29283d interfaceC29283d13 = (InterfaceC29283d) this.f52276t;
                    AbstractC24862s.m129228b(obj);
                    m143692z = interfaceC29283d13;
                    obj2 = "SOURCE_HASHTAG";
                    mo96609o0 = obj;
                    parcelable = (Parcelable) mo96609o0;
                    InterfaceC29283d interfaceC29283d32222222222222222222222 = m143692z;
                    obj3 = parcelable;
                    interfaceC29283d = interfaceC29283d32222222222222222222222;
                    videoPresenterImpl = VideoPresenterImpl.this;
                    LoadMoreInfo loadMoreInfo222222222222222222222222 = this.f52268I;
                    c19059j0 = this.f52269J;
                    c19059j02 = this.f52270K;
                    obj4 = "SOURCE_CHANNEL";
                    C19059j0 c19059j02422222222222222222222222 = this.f52271L;
                    obj5 = "SOURCE_LOCATION";
                    C19059j0 c19059j02522222222222222222222222 = this.f52272M;
                    obj6 = "SOURCE_BOOKMARK";
                    C19059j0 c19059j02622222222222222222222222 = this.f52273N;
                    obj7 = "SOURCE_LIKED";
                    C19059j0 c19059j02722222222222222222222222 = this.f52274O;
                    obj8 = "SOURCE_SIMILAR";
                    C19059j0 c19059j02822222222222222222222222 = this.f52275P;
                    obj9 = "SOURCE_COLLECTION";
                    if (obj3 instanceof FollowingData) {
                    }
                    if (followingData != null) {
                    }
                    section2 = (Section) c10008a.m53595a();
                    list = (List) c10008a.m53596b();
                    booleanValue = ((Boolean) c10008a.m53597c()).booleanValue();
                    list2 = (List) c10008a.m53598d();
                    List m51168m32222222222222222222222 = section2.m51168m();
                    ArrayList arrayList222222222222222222222222 = new ArrayList();
                    while (r12.hasNext()) {
                    }
                    C19059j0 c19059j03022222222222222222222222 = c19059j02422222222222222222222222;
                    section2.m51172q(arrayList222222222222222222222222);
                    if (!AbstractC19074t.m100204b(videoPresenterImpl.f52144B, "SOURCE_FOLLOWING")) {
                    }
                    if (AbstractC19074t.m100204b(videoPresenterImpl.f52144B, "SOURCE_FOR_U")) {
                    }
                    break;
                case 11:
                    InterfaceC29283d interfaceC29283d14 = (InterfaceC29283d) this.f52276t;
                    AbstractC24862s.m129228b(obj);
                    m143692z = interfaceC29283d14;
                    obj2 = "SOURCE_HASHTAG";
                    mo96609o02 = obj;
                    parcelable = (Parcelable) mo96609o02;
                    InterfaceC29283d interfaceC29283d322222222222222222222222 = m143692z;
                    obj3 = parcelable;
                    interfaceC29283d = interfaceC29283d322222222222222222222222;
                    videoPresenterImpl = VideoPresenterImpl.this;
                    LoadMoreInfo loadMoreInfo2222222222222222222222222 = this.f52268I;
                    c19059j0 = this.f52269J;
                    c19059j02 = this.f52270K;
                    obj4 = "SOURCE_CHANNEL";
                    C19059j0 c19059j024222222222222222222222222 = this.f52271L;
                    obj5 = "SOURCE_LOCATION";
                    C19059j0 c19059j025222222222222222222222222 = this.f52272M;
                    obj6 = "SOURCE_BOOKMARK";
                    C19059j0 c19059j026222222222222222222222222 = this.f52273N;
                    obj7 = "SOURCE_LIKED";
                    C19059j0 c19059j027222222222222222222222222 = this.f52274O;
                    obj8 = "SOURCE_SIMILAR";
                    C19059j0 c19059j028222222222222222222222222 = this.f52275P;
                    obj9 = "SOURCE_COLLECTION";
                    if (obj3 instanceof FollowingData) {
                    }
                    if (followingData != null) {
                    }
                    section2 = (Section) c10008a.m53595a();
                    list = (List) c10008a.m53596b();
                    booleanValue = ((Boolean) c10008a.m53597c()).booleanValue();
                    list2 = (List) c10008a.m53598d();
                    List m51168m322222222222222222222222 = section2.m51168m();
                    ArrayList arrayList2222222222222222222222222 = new ArrayList();
                    while (r12.hasNext()) {
                    }
                    C19059j0 c19059j030222222222222222222222222 = c19059j024222222222222222222222222;
                    section2.m51172q(arrayList2222222222222222222222222);
                    if (!AbstractC19074t.m100204b(videoPresenterImpl.f52144B, "SOURCE_FOLLOWING")) {
                    }
                    if (AbstractC19074t.m100204b(videoPresenterImpl.f52144B, "SOURCE_FOR_U")) {
                    }
                    break;
                case 12:
                    InterfaceC29283d interfaceC29283d15 = (InterfaceC29283d) this.f52276t;
                    AbstractC24862s.m129228b(obj);
                    m143692z = interfaceC29283d15;
                    obj2 = "SOURCE_HASHTAG";
                    mo96618t0 = obj;
                    parcelable = (Parcelable) mo96618t0;
                    InterfaceC29283d interfaceC29283d3222222222222222222222222 = m143692z;
                    obj3 = parcelable;
                    interfaceC29283d = interfaceC29283d3222222222222222222222222;
                    videoPresenterImpl = VideoPresenterImpl.this;
                    LoadMoreInfo loadMoreInfo22222222222222222222222222 = this.f52268I;
                    c19059j0 = this.f52269J;
                    c19059j02 = this.f52270K;
                    obj4 = "SOURCE_CHANNEL";
                    C19059j0 c19059j0242222222222222222222222222 = this.f52271L;
                    obj5 = "SOURCE_LOCATION";
                    C19059j0 c19059j0252222222222222222222222222 = this.f52272M;
                    obj6 = "SOURCE_BOOKMARK";
                    C19059j0 c19059j0262222222222222222222222222 = this.f52273N;
                    obj7 = "SOURCE_LIKED";
                    C19059j0 c19059j0272222222222222222222222222 = this.f52274O;
                    obj8 = "SOURCE_SIMILAR";
                    C19059j0 c19059j0282222222222222222222222222 = this.f52275P;
                    obj9 = "SOURCE_COLLECTION";
                    if (obj3 instanceof FollowingData) {
                    }
                    if (followingData != null) {
                    }
                    section2 = (Section) c10008a.m53595a();
                    list = (List) c10008a.m53596b();
                    booleanValue = ((Boolean) c10008a.m53597c()).booleanValue();
                    list2 = (List) c10008a.m53598d();
                    List m51168m3222222222222222222222222 = section2.m51168m();
                    ArrayList arrayList22222222222222222222222222 = new ArrayList();
                    while (r12.hasNext()) {
                    }
                    C19059j0 c19059j0302222222222222222222222222 = c19059j0242222222222222222222222222;
                    section2.m51172q(arrayList22222222222222222222222222);
                    if (!AbstractC19074t.m100204b(videoPresenterImpl.f52144B, "SOURCE_FOLLOWING")) {
                    }
                    if (AbstractC19074t.m100204b(videoPresenterImpl.f52144B, "SOURCE_FOR_U")) {
                    }
                    break;
                case 13:
                    InterfaceC29283d interfaceC29283d16 = (InterfaceC29283d) this.f52276t;
                    AbstractC24862s.m129228b(obj);
                    m143692z = interfaceC29283d16;
                    obj2 = "SOURCE_HASHTAG";
                    mo96565L = obj;
                    parcelable = (Parcelable) mo96565L;
                    InterfaceC29283d interfaceC29283d32222222222222222222222222 = m143692z;
                    obj3 = parcelable;
                    interfaceC29283d = interfaceC29283d32222222222222222222222222;
                    videoPresenterImpl = VideoPresenterImpl.this;
                    LoadMoreInfo loadMoreInfo222222222222222222222222222 = this.f52268I;
                    c19059j0 = this.f52269J;
                    c19059j02 = this.f52270K;
                    obj4 = "SOURCE_CHANNEL";
                    C19059j0 c19059j02422222222222222222222222222 = this.f52271L;
                    obj5 = "SOURCE_LOCATION";
                    C19059j0 c19059j02522222222222222222222222222 = this.f52272M;
                    obj6 = "SOURCE_BOOKMARK";
                    C19059j0 c19059j02622222222222222222222222222 = this.f52273N;
                    obj7 = "SOURCE_LIKED";
                    C19059j0 c19059j02722222222222222222222222222 = this.f52274O;
                    obj8 = "SOURCE_SIMILAR";
                    C19059j0 c19059j02822222222222222222222222222 = this.f52275P;
                    obj9 = "SOURCE_COLLECTION";
                    if (obj3 instanceof FollowingData) {
                    }
                    if (followingData != null) {
                    }
                    section2 = (Section) c10008a.m53595a();
                    list = (List) c10008a.m53596b();
                    booleanValue = ((Boolean) c10008a.m53597c()).booleanValue();
                    list2 = (List) c10008a.m53598d();
                    List m51168m32222222222222222222222222 = section2.m51168m();
                    ArrayList arrayList222222222222222222222222222 = new ArrayList();
                    while (r12.hasNext()) {
                    }
                    C19059j0 c19059j03022222222222222222222222222 = c19059j02422222222222222222222222222;
                    section2.m51172q(arrayList222222222222222222222222222);
                    if (!AbstractC19074t.m100204b(videoPresenterImpl.f52144B, "SOURCE_FOLLOWING")) {
                    }
                    if (AbstractC19074t.m100204b(videoPresenterImpl.f52144B, "SOURCE_FOR_U")) {
                    }
                    break;
                case 14:
                case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                    AbstractC24862s.m129228b(obj);
                    return C24848g0.f119245a;
                case 15:
                    boolean z13 = this.f52264E;
                    List list7 = (List) this.f52263D;
                    List list8 = (List) this.f52262C;
                    section4 = (Section) this.f52261B;
                    C19059j0 c19059j038 = (C19059j0) this.f52260A;
                    c19059j018 = (C19059j0) this.f52282z;
                    C19059j0 c19059j039 = (C19059j0) this.f52281y;
                    C19059j0 c19059j040 = (C19059j0) this.f52280x;
                    C19059j0 c19059j041 = (C19059j0) this.f52279w;
                    C19059j0 c19059j042 = (C19059j0) this.f52278v;
                    C19059j0 c19059j043 = (C19059j0) this.f52277u;
                    VideoPresenterImpl videoPresenterImpl4 = (VideoPresenterImpl) this.f52276t;
                    InterfaceC29283d interfaceC29283d17 = (InterfaceC29283d) this.f52266G;
                    AbstractC24862s.m129228b(obj);
                    interfaceC29283d2 = interfaceC29283d17;
                    obj9 = "SOURCE_COLLECTION";
                    c19059j016 = c19059j038;
                    c19059j02 = c19059j042;
                    mo50569t = obj;
                    obj6 = "SOURCE_BOOKMARK";
                    booleanValue = z13;
                    obj2 = "SOURCE_HASHTAG";
                    videoPresenterImpl = videoPresenterImpl4;
                    obj8 = "SOURCE_SIMILAR";
                    obj4 = "SOURCE_CHANNEL";
                    c19059j017 = c19059j039;
                    c19059j0 = c19059j043;
                    obj7 = "SOURCE_LIKED";
                    list2 = list7;
                    c19059j014 = c19059j041;
                    obj5 = "SOURCE_LOCATION";
                    list = list8;
                    c19059j015 = c19059j040;
                    List list62 = (List) mo50569t;
                    List m51168m22 = section4.m51168m();
                    C19059j0 c19059j0332 = c19059j018;
                    arrayList = new ArrayList();
                    while (r12.hasNext()) {
                    }
                    C19059j0 c19059j0362 = c19059j017;
                    C19059j0 c19059j0372 = c19059j014;
                    if (arrayList.isEmpty()) {
                        break;
                    }
                    videoPresenterImpl.f52154L = 0;
                    section4.m51172q(arrayList);
                    list3 = list;
                    c19059j020 = c19059j015;
                    section2 = section4;
                    list5 = list2;
                    c19059j019 = c19059j016;
                    interfaceC29283d = interfaceC29283d2;
                    c19059j023 = c19059j0372;
                    c19059j021 = c19059j0332;
                    z12 = booleanValue;
                    c19059j022 = c19059j0362;
                    C19205a.f95429a.m100705A();
                    c19059j08 = c19059j022;
                    c19059j07 = c19059j019;
                    c19059j010 = c19059j0;
                    c19059j012 = c19059j020;
                    list4 = list5;
                    c19059j011 = c19059j021;
                    c19059j09 = c19059j023;
                    z11 = z12;
                    c19059j013 = c19059j02;
                    section3 = section2;
                    videoPresenterImpl2 = videoPresenterImpl;
                    str3 = videoPresenterImpl2.f52144B;
                    switch (str3.hashCode()) {
                        case -617742456:
                            break;
                        case -576339777:
                            break;
                        case -218246311:
                            break;
                        case -113911590:
                            break;
                        case 602163817:
                            break;
                        case 778377639:
                            break;
                        case 1730512194:
                            break;
                    }
                    bVar = new b(videoPresenterImpl2, section3, list3, list4, c19059j010, c19059j013, c19059j09, z11, c19059j012, c19059j08, c19059j011, c19059j07);
                    this.f52266G = null;
                    this.f52276t = null;
                    this.f52277u = null;
                    this.f52278v = null;
                    this.f52279w = null;
                    this.f52280x = null;
                    this.f52281y = null;
                    this.f52282z = null;
                    this.f52260A = null;
                    this.f52261B = null;
                    this.f52262C = null;
                    this.f52263D = null;
                    this.f52265F = 16;
                    if (videoPresenterImpl2.m52971w(bVar, this) == m142578e) {
                    }
                    return C24848g0.f119245a;
                case 17:
                    AbstractC24862s.m129228b(obj);
                    return C24848g0.f119245a;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C10030l) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.VideoPresenterImpl$l0 */
    /* loaded from: classes5.dex */
    static final class C10031l0 extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ boolean f52309q;

        /* renamed from: r */
        final /* synthetic */ boolean f52310r;

        /* renamed from: s */
        final /* synthetic */ VideoPresenterImpl f52311s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10031l0(boolean z11, boolean z12, VideoPresenterImpl videoPresenterImpl) {
            super(1);
            this.f52309q = z11;
            this.f52310r = z12;
            this.f52311s = videoPresenterImpl;
        }

        /* renamed from: a */
        public final void m53637a(EnumC18694f enumC18694f) {
            AbstractC19074t.m100208f(enumC18694f, "it");
            if (this.f52309q && !this.f52310r) {
                C25097t.f120556a.m130153n(((InterfaceC10628f) this.f52311s.m52968s()).getContext(), AbstractC27413h.zch_item_video_survey_confirm);
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53637a((EnumC18694f) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.VideoPresenterImpl$m */
    /* loaded from: classes5.dex */
    static final class C10032m extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f52312t;

        /* renamed from: v */
        final /* synthetic */ List f52314v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10032m(List list, Continuation continuation) {
            super(1, continuation);
            this.f52314v = list;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f52312t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                InterfaceC18170g interfaceC18170g = VideoPresenterImpl.this.f52169r;
                List list = this.f52314v;
                this.f52312t = 1;
                obj = interfaceC18170g.mo96588e(list, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            return obj;
        }

        /* renamed from: r */
        public final Continuation m53638r(Continuation continuation) {
            return new C10032m(this.f52314v, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((C10032m) m53638r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.VideoPresenterImpl$m0 */
    /* loaded from: classes5.dex */
    static final class C10033m0 extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f52315t;

        /* renamed from: v */
        final /* synthetic */ BreakSlot f52317v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10033m0(BreakSlot breakSlot, Continuation continuation) {
            super(1, continuation);
            this.f52317v = breakSlot;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f52315t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                InterfaceC18170g interfaceC18170g = VideoPresenterImpl.this.f52169r;
                BreakSlot breakSlot = this.f52317v;
                this.f52315t = 1;
                obj = interfaceC18170g.mo96616s0(breakSlot, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            return obj;
        }

        /* renamed from: r */
        public final Continuation m53640r(Continuation continuation) {
            return new C10033m0(this.f52317v, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((C10033m0) m53640r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.VideoPresenterImpl$n */
    /* loaded from: classes5.dex */
    static final class C10034n extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ Map f52318q;

        /* renamed from: r */
        final /* synthetic */ VideoPresenterImpl f52319r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10034n(Map map, VideoPresenterImpl videoPresenterImpl) {
            super(1);
            this.f52318q = map;
            this.f52319r = videoPresenterImpl;
        }

        /* renamed from: a */
        public final void m53642a(List list) {
            AbstractC19074t.m100208f(list, "videos");
            HashMap hashMap = new HashMap();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                PersonalizeVideo personalizeVideo = (PersonalizeVideo) it.next();
                Integer num = (Integer) this.f52318q.get(personalizeVideo.m52813b());
                if (num != null) {
                    int intValue = num.intValue();
                    this.f52319r.f52176y.put(personalizeVideo.m52813b(), Integer.valueOf(intValue));
                    hashMap.put(Integer.valueOf(intValue), personalizeVideo);
                }
            }
            ((InterfaceC10628f) this.f52319r.m52968s()).mo55386Zd(hashMap);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53642a((List) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.VideoPresenterImpl$n0 */
    /* loaded from: classes5.dex */
    static final class C10035n0 extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ boolean f52320q;

        /* renamed from: r */
        final /* synthetic */ BreakSlot f52321r;

        /* renamed from: s */
        final /* synthetic */ VideoPresenterImpl f52322s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10035n0(boolean z11, BreakSlot breakSlot, VideoPresenterImpl videoPresenterImpl) {
            super(1);
            this.f52320q = z11;
            this.f52321r = breakSlot;
            this.f52322s = videoPresenterImpl;
        }

        /* renamed from: a */
        public final void m53643a(EnumC18694f enumC18694f) {
            ArrayList m50685f;
            AbstractC19074t.m100208f(enumC18694f, "it");
            if (this.f52320q && (m50685f = this.f52321r.m50685f()) != null && !m50685f.isEmpty()) {
                Iterator it = m50685f.iterator();
                while (it.hasNext()) {
                    if (((BreakSlot.Option) it.next()).m50702c()) {
                        C25097t.f120556a.m130153n(((InterfaceC10628f) this.f52322s.m52968s()).getContext(), AbstractC27413h.zch_item_video_survey_confirm);
                        return;
                    }
                }
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53643a((EnumC18694f) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.VideoPresenterImpl$o */
    /* loaded from: classes5.dex */
    static final class C10036o extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f52323t;

        /* renamed from: v */
        final /* synthetic */ String f52325v;

        /* renamed from: w */
        final /* synthetic */ LoadMoreInfo f52326w;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.shortvideo.ui.presenter.VideoPresenterImpl$o$a */
        /* loaded from: classes5.dex */
        public static final class a extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ VideoPresenterImpl f52327q;

            /* renamed from: r */
            final /* synthetic */ Section f52328r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(VideoPresenterImpl videoPresenterImpl, Section section) {
                super(0);
                this.f52327q = videoPresenterImpl;
                this.f52328r = section;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: V4 */
            public /* bridge */ /* synthetic */ Object mo12V4() {
                m53645a();
                return C24848g0.f119245a;
            }

            /* renamed from: a */
            public final void m53645a() {
                InterfaceC10628f.a.m55560d((InterfaceC10628f) this.f52327q.m52968s(), this.f52328r, null, 2, null);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.shortvideo.ui.presenter.VideoPresenterImpl$o$b */
        /* loaded from: classes5.dex */
        public static final class b extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ VideoPresenterImpl f52329q;

            /* renamed from: r */
            final /* synthetic */ Exception f52330r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(VideoPresenterImpl videoPresenterImpl, Exception exc) {
                super(0);
                this.f52329q = videoPresenterImpl;
                this.f52330r = exc;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: V4 */
            public /* bridge */ /* synthetic */ Object mo12V4() {
                m53646a();
                return C24848g0.f119245a;
            }

            /* renamed from: a */
            public final void m53646a() {
                InterfaceC10628f.a.m55560d((InterfaceC10628f) this.f52329q.m52968s(), null, this.f52330r, 1, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10036o(String str, LoadMoreInfo loadMoreInfo, Continuation continuation) {
            super(2, continuation);
            this.f52325v = str;
            this.f52326w = loadMoreInfo;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new C10036o(this.f52325v, this.f52326w, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f52323t;
            try {
            } catch (Exception e11) {
                VideoPresenterImpl videoPresenterImpl = VideoPresenterImpl.this;
                b bVar = new b(videoPresenterImpl, e11);
                this.f52323t = 3;
                if (videoPresenterImpl.m52971w(bVar, this) == m142578e) {
                    return m142578e;
                }
            }
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 == 3) {
                            AbstractC24862s.m129228b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        AbstractC24862s.m129228b(obj);
                    }
                    return C24848g0.f119245a;
                }
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                InterfaceC18170g interfaceC18170g = VideoPresenterImpl.this.f52169r;
                String str = this.f52325v;
                LoadMoreInfo loadMoreInfo = this.f52326w;
                this.f52323t = 1;
                obj = interfaceC18170g.mo96592g(str, "similar_video", loadMoreInfo, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            VideoPresenterImpl videoPresenterImpl2 = VideoPresenterImpl.this;
            a aVar = new a(videoPresenterImpl2, (Section) obj);
            this.f52323t = 2;
            if (videoPresenterImpl2.m52971w(aVar, this) == m142578e) {
                return m142578e;
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C10036o) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.VideoPresenterImpl$o0 */
    /* loaded from: classes5.dex */
    static final class C10037o0 extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f52331t;

        /* renamed from: v */
        final /* synthetic */ String f52333v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10037o0(String str, Continuation continuation) {
            super(1, continuation);
            this.f52333v = str;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f52331t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                InterfaceC18170g interfaceC18170g = VideoPresenterImpl.this.f52169r;
                String str = this.f52333v;
                this.f52331t = 1;
                obj = interfaceC18170g.mo96587d0(str, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            return obj;
        }

        /* renamed from: r */
        public final Continuation m53647r(Continuation continuation) {
            return new C10037o0(this.f52333v, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((C10037o0) m53647r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.VideoPresenterImpl$p */
    /* loaded from: classes5.dex */
    static final class C10038p extends AbstractC19075u implements InterfaceC18494a {
        C10038p() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m53649a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m53649a() {
            if (VideoPresenterImpl.this.f52171t) {
                VideoPresenterImpl.this.f52171t = false;
                ((InterfaceC10628f) VideoPresenterImpl.this.m52968s()).mo55387b(VideoPresenterImpl.this.f52171t);
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.VideoPresenterImpl$p0 */
    /* loaded from: classes5.dex */
    static final class C10039p0 extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f52335t;

        /* renamed from: v */
        final /* synthetic */ String f52337v;

        /* renamed from: w */
        final /* synthetic */ String f52338w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10039p0(String str, String str2, Continuation continuation) {
            super(1, continuation);
            this.f52337v = str;
            this.f52338w = str2;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f52335t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                InterfaceC18170g interfaceC18170g = VideoPresenterImpl.this.f52169r;
                String str = this.f52337v;
                String str2 = this.f52338w;
                this.f52335t = 1;
                obj = InterfaceC18170g.a.m96646p(interfaceC18170g, str, str2, null, this, 4, null);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            return obj;
        }

        /* renamed from: r */
        public final Continuation m53650r(Continuation continuation) {
            return new C10039p0(this.f52337v, this.f52338w, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((C10039p0) m53650r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.VideoPresenterImpl$q */
    /* loaded from: classes5.dex */
    static final class C10040q extends AbstractC19075u implements InterfaceC18494a {
        C10040q() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m53652a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m53652a() {
            if (!VideoPresenterImpl.this.f52171t) {
                VideoPresenterImpl.this.f52171t = true;
                ((InterfaceC10628f) VideoPresenterImpl.this.m52968s()).mo55387b(VideoPresenterImpl.this.f52171t);
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.VideoPresenterImpl$q0 */
    /* loaded from: classes5.dex */
    static final class C10041q0 extends AbstractC19075u implements InterfaceC18509p {
        C10041q0() {
            super(2);
        }

        /* renamed from: a */
        public final Integer m53653a(int i11, VideoAdsData videoAdsData) {
            AbstractC19074t.m100208f(videoAdsData, "adsData");
            return Integer.valueOf(((InterfaceC10628f) VideoPresenterImpl.this.m52968s()).mo55384Wh(i11, videoAdsData));
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            return m53653a(((Number) obj).intValue(), (VideoAdsData) obj2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.VideoPresenterImpl$r */
    /* loaded from: classes5.dex */
    public static final class C10042r extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f52341t;

        /* renamed from: v */
        final /* synthetic */ Video f52343v;

        /* renamed from: w */
        final /* synthetic */ boolean f52344w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10042r(Video video, boolean z11, Continuation continuation) {
            super(1, continuation);
            this.f52343v = video;
            this.f52344w = z11;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f52341t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                InterfaceC18170g interfaceC18170g = VideoPresenterImpl.this.f52169r;
                String m52911t = this.f52343v.m52911t();
                boolean z11 = this.f52344w;
                this.f52341t = 1;
                obj = interfaceC18170g.mo96612q(m52911t, z11, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            return obj;
        }

        /* renamed from: r */
        public final Continuation m53654r(Continuation continuation) {
            return new C10042r(this.f52343v, this.f52344w, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((C10042r) m53654r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.VideoPresenterImpl$r0 */
    /* loaded from: classes5.dex */
    static final class C10043r0 extends AbstractC19075u implements InterfaceC18494a {
        C10043r0() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer mo12V4() {
            return Integer.valueOf(((InterfaceC10628f) VideoPresenterImpl.this.m52968s()).mo55374Ao());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.VideoPresenterImpl$s */
    /* loaded from: classes5.dex */
    public static final class C10044s extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ Video f52347r;

        /* renamed from: s */
        final /* synthetic */ boolean f52348s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10044s(Video video, boolean z11) {
            super(1);
            this.f52347r = video;
            this.f52348s = z11;
        }

        /* renamed from: a */
        public final void m53657a(Throwable th2) {
            AbstractC19074t.m100208f(th2, "throwable");
            if (AbstractC19074t.m100204b(VideoPresenterImpl.this.f52155M.remove(this.f52347r.m52911t()), Boolean.valueOf(this.f52348s))) {
                InterfaceC29283d m143692z = AbstractC28684a.Companion.m143692z();
                String m52911t = this.f52347r.m52911t();
                Boolean valueOf = Boolean.valueOf(!this.f52348s);
                long j11 = -1;
                if (this.f52347r.m52835B() != -1) {
                    if (this.f52348s) {
                        Video video = this.f52347r;
                        video.m52857N0(video.m52835B() - 1);
                        j11 = video.m52835B();
                    } else {
                        Video video2 = this.f52347r;
                        video2.m52857N0(video2.m52835B() + 1);
                        j11 = video2.m52835B();
                    }
                }
                m143692z.mo146383v(m52911t, valueOf, Long.valueOf(j11));
                ((InterfaceC10628f) VideoPresenterImpl.this.m52968s()).mo55375Ea(this.f52347r.m52911t(), this.f52348s, th2);
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53657a((Throwable) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.VideoPresenterImpl$s0 */
    /* loaded from: classes5.dex */
    public static final class C10045s0 extends RecyclerView.AbstractC1882i {
        C10045s0() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1882i
        /* renamed from: a */
        public void mo10026a() {
            C26947a c26947a = VideoPresenterImpl.this.f52164V;
            if (c26947a != null) {
                C26947a.m138797H(c26947a, false, 1, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.VideoPresenterImpl$t */
    /* loaded from: classes5.dex */
    public static final class C10046t extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ Video f52351r;

        /* renamed from: s */
        final /* synthetic */ boolean f52352s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10046t(Video video, boolean z11) {
            super(1);
            this.f52351r = video;
            this.f52352s = z11;
        }

        /* renamed from: a */
        public final void m53658a(EnumC18694f enumC18694f) {
            AbstractC19074t.m100208f(enumC18694f, "it");
            if (!AbstractC19074t.m100204b(VideoPresenterImpl.this.f52155M.remove(this.f52351r.m52911t()), Boolean.valueOf(this.f52352s))) {
                VideoPresenterImpl.this.mo53564DA(this.f52351r, !this.f52352s);
            }
            if (this.f52352s) {
                AbstractC28684a.Companion.m143692z().mo146373l(this.f52351r);
            } else {
                AbstractC28684a.Companion.m143692z().mo146368g(this.f52351r);
            }
            ((InterfaceC10628f) VideoPresenterImpl.this.m52968s()).mo55375Ea(this.f52351r.m52911t(), this.f52352s, null);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53658a((EnumC18694f) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.VideoPresenterImpl$u */
    /* loaded from: classes5.dex */
    static final class C10047u extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f52353t;

        /* renamed from: v */
        final /* synthetic */ Video f52355v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10047u(Video video, Continuation continuation) {
            super(1, continuation);
            this.f52355v = video;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f52353t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                InterfaceC18170g interfaceC18170g = VideoPresenterImpl.this.f52169r;
                String m52911t = this.f52355v.m52911t();
                this.f52353t = 1;
                obj = interfaceC18170g.mo96573T(m52911t, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            return obj;
        }

        /* renamed from: r */
        public final Continuation m53659r(Continuation continuation) {
            return new C10047u(this.f52355v, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((C10047u) m53659r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.VideoPresenterImpl$v */
    /* loaded from: classes5.dex */
    static final class C10048v extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ Video f52357r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10048v(Video video) {
            super(1);
            this.f52357r = video;
        }

        /* renamed from: a */
        public final void m53661a(Throwable th2) {
            AbstractC19074t.m100208f(th2, "throwable");
            ((InterfaceC10628f) VideoPresenterImpl.this.m52968s()).mo55379Jf(this.f52357r, th2);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53661a((Throwable) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.VideoPresenterImpl$w */
    /* loaded from: classes5.dex */
    static final class C10049w extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ Video f52359r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10049w(Video video) {
            super(1);
            this.f52359r = video;
        }

        /* renamed from: a */
        public final void m53662a(EnumC18694f enumC18694f) {
            AbstractC19074t.m100208f(enumC18694f, "it");
            InterfaceC10628f.a.m55557a((InterfaceC10628f) VideoPresenterImpl.this.m52968s(), this.f52359r, null, 2, null);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53662a((EnumC18694f) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.VideoPresenterImpl$x */
    /* loaded from: classes5.dex */
    static final class C10050x extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f52360t;

        /* renamed from: v */
        final /* synthetic */ String f52362v;

        /* renamed from: w */
        final /* synthetic */ InterfaceC18505l f52363w;

        /* renamed from: x */
        final /* synthetic */ String f52364x;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.shortvideo.ui.presenter.VideoPresenterImpl$x$a */
        /* loaded from: classes5.dex */
        public static final class a extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f52365t;

            /* renamed from: u */
            final /* synthetic */ VideoPresenterImpl f52366u;

            /* renamed from: v */
            final /* synthetic */ String f52367v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(VideoPresenterImpl videoPresenterImpl, String str, Continuation continuation) {
                super(2, continuation);
                this.f52366u = videoPresenterImpl;
                this.f52367v = str;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new a(this.f52366u, this.f52367v, continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                Object m142578e;
                m142578e = AbstractC28298d.m142578e();
                int i11 = this.f52365t;
                if (i11 != 0) {
                    if (i11 == 1) {
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    InterfaceC18170g interfaceC18170g = this.f52366u.f52169r;
                    String str = this.f52367v;
                    this.f52365t = 1;
                    obj = interfaceC18170g.mo96615s(str, this);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                }
                return obj;
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.shortvideo.ui.presenter.VideoPresenterImpl$x$b */
        /* loaded from: classes5.dex */
        public static final class b extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ InterfaceC18505l f52368q;

            /* renamed from: r */
            final /* synthetic */ String f52369r;

            /* renamed from: s */
            final /* synthetic */ String f52370s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(InterfaceC18505l interfaceC18505l, String str, String str2) {
                super(0);
                this.f52368q = interfaceC18505l;
                this.f52369r = str;
                this.f52370s = str2;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: V4 */
            public /* bridge */ /* synthetic */ Object mo12V4() {
                m53665a();
                return C24848g0.f119245a;
            }

            /* renamed from: a */
            public final void m53665a() {
                InterfaceC18505l interfaceC18505l = this.f52368q;
                String str = this.f52369r;
                if (str == null) {
                    str = this.f52370s;
                }
                interfaceC18505l.mo205i9(str);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.shortvideo.ui.presenter.VideoPresenterImpl$x$c */
        /* loaded from: classes5.dex */
        public static final class c extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ InterfaceC18505l f52371q;

            /* renamed from: r */
            final /* synthetic */ String f52372r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(InterfaceC18505l interfaceC18505l, String str) {
                super(0);
                this.f52371q = interfaceC18505l;
                this.f52372r = str;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: V4 */
            public /* bridge */ /* synthetic */ Object mo12V4() {
                m53666a();
                return C24848g0.f119245a;
            }

            /* renamed from: a */
            public final void m53666a() {
                this.f52371q.mo205i9(this.f52372r);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10050x(String str, InterfaceC18505l interfaceC18505l, String str2, Continuation continuation) {
            super(2, continuation);
            this.f52362v = str;
            this.f52363w = interfaceC18505l;
            this.f52364x = str2;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new C10050x(this.f52362v, this.f52363w, this.f52364x, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f52360t;
            try {
            } catch (Exception unused) {
                VideoPresenterImpl videoPresenterImpl = VideoPresenterImpl.this;
                c cVar = new c(this.f52363w, this.f52364x);
                this.f52360t = 3;
                if (videoPresenterImpl.m52971w(cVar, this) == m142578e) {
                    return m142578e;
                }
            }
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 == 3) {
                            AbstractC24862s.m129228b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        AbstractC24862s.m129228b(obj);
                    }
                    return C24848g0.f119245a;
                }
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                a aVar = new a(VideoPresenterImpl.this, this.f52362v, null);
                this.f52360t = 1;
                obj = TimeoutKt.m112879d(1000L, aVar, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            VideoPresenterImpl videoPresenterImpl2 = VideoPresenterImpl.this;
            b bVar = new b(this.f52363w, (String) obj, this.f52364x);
            this.f52360t = 2;
            if (videoPresenterImpl2.m52971w(bVar, this) == m142578e) {
                return m142578e;
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C10050x) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.VideoPresenterImpl$y */
    /* loaded from: classes5.dex */
    static final class C10051y extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f52373t;

        /* renamed from: u */
        final /* synthetic */ boolean f52374u;

        /* renamed from: v */
        final /* synthetic */ VideoPresenterImpl f52375v;

        /* renamed from: w */
        final /* synthetic */ Channel f52376w;

        /* renamed from: x */
        final /* synthetic */ Video f52377x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10051y(boolean z11, VideoPresenterImpl videoPresenterImpl, Channel channel, Video video, Continuation continuation) {
            super(1, continuation);
            this.f52374u = z11;
            this.f52375v = videoPresenterImpl;
            this.f52376w = channel;
            this.f52377x = video;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            String str;
            VideoAdsInfo m52881b;
            VideoAdsInfo m52881b2;
            String str2;
            String str3;
            String str4;
            Integer num;
            VideoAdsInfo m52881b3;
            VideoAdsInfo m52881b4;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f52373t;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        AbstractC24862s.m129228b(obj);
                        return (PersonalizeChannel) obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
                return (PersonalizeChannel) obj;
            }
            AbstractC24862s.m129228b(obj);
            String str5 = null;
            if (this.f52374u) {
                InterfaceC18170g interfaceC18170g = this.f52375v.f52169r;
                String m50769l = this.f52376w.m50769l();
                Video video = this.f52377x;
                if (video != null && (m52881b4 = video.m52881b()) != null) {
                    str2 = m52881b4.m52928d();
                } else {
                    str2 = null;
                }
                Video video2 = this.f52377x;
                if (video2 != null && (m52881b3 = video2.m52881b()) != null) {
                    str3 = m52881b3.m52929e();
                } else {
                    str3 = null;
                }
                C26947a.b bVar = C26947a.Companion;
                C26947a c26947a = this.f52375v.f52164V;
                if (c26947a != null) {
                    str4 = c26947a.m138825F();
                } else {
                    str4 = null;
                }
                C26948b.a m138839b = bVar.m138839b(str4, this.f52377x);
                if (m138839b != null) {
                    num = AbstractC29094b.m145341c(m138839b.m138882c());
                } else {
                    num = null;
                }
                C26947a c26947a2 = this.f52375v.f52164V;
                if (c26947a2 != null) {
                    str5 = c26947a2.m138825F();
                }
                Integer m145341c = AbstractC29094b.m145341c(bVar.m138841f(str5));
                this.f52373t = 1;
                obj = InterfaceC18170g.a.m96631a(interfaceC18170g, m50769l, str2, str3, null, num, m145341c, this, 8, null);
                if (obj == m142578e) {
                    return m142578e;
                }
                return (PersonalizeChannel) obj;
            }
            InterfaceC18170g interfaceC18170g2 = this.f52375v.f52169r;
            String m50769l2 = this.f52376w.m50769l();
            Video video3 = this.f52377x;
            if (video3 != null && (m52881b2 = video3.m52881b()) != null) {
                str = m52881b2.m52928d();
            } else {
                str = null;
            }
            Video video4 = this.f52377x;
            if (video4 != null && (m52881b = video4.m52881b()) != null) {
                str5 = m52881b.m52929e();
            }
            this.f52373t = 2;
            obj = InterfaceC18170g.a.m96645o(interfaceC18170g2, m50769l2, str, str5, null, this, 8, null);
            if (obj == m142578e) {
                return m142578e;
            }
            return (PersonalizeChannel) obj;
        }

        /* renamed from: r */
        public final Continuation m53667r(Continuation continuation) {
            return new C10051y(this.f52374u, this.f52375v, this.f52376w, this.f52377x, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((C10051y) m53667r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.VideoPresenterImpl$z */
    /* loaded from: classes5.dex */
    static final class C10052z extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ Channel f52379r;

        /* renamed from: s */
        final /* synthetic */ boolean f52380s;

        /* renamed from: t */
        final /* synthetic */ boolean f52381t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10052z(Channel channel, boolean z11, boolean z12) {
            super(1);
            this.f52379r = channel;
            this.f52380s = z11;
            this.f52381t = z12;
        }

        /* renamed from: a */
        public final void m53669a(Throwable th2) {
            AbstractC19074t.m100208f(th2, "throwable");
            ((InterfaceC10628f) VideoPresenterImpl.this.m52968s()).mo55382SH(this.f52379r, this.f52380s, this.f52381t, th2);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53669a((Throwable) obj);
            return C24848g0.f119245a;
        }
    }

    public VideoPresenterImpl(InterfaceC18170g interfaceC18170g, InterfaceC30248b interfaceC30248b) {
        AbstractC19074t.m100208f(interfaceC18170g, "restRepository");
        AbstractC19074t.m100208f(interfaceC30248b, "dbRepository");
        this.f52169r = interfaceC18170g;
        this.f52170s = interfaceC30248b;
        this.f52171t = true;
        this.f52173v = new NetworkReceiver(new C10038p(), new C10040q());
        this.f52174w = new HeadsetReceiver(new C10012c());
        this.f52175x = new HashMap();
        this.f52176y = new HashMap();
        this.f52177z = new HashMap();
        this.f52143A = new HashSet();
        this.f52144B = "";
        this.f52145C = "";
        this.f52146D = "";
        this.f52147E = "";
        this.f52148F = "";
        this.f52149G = "";
        this.f52150H = "";
        this.f52152J = "";
        this.f52153K = "";
        this.f52155M = new HashMap();
        this.f52156N = new HashMap();
        this.f52160R = new Handler(Looper.getMainLooper());
        this.f52161S = 2000L;
        this.f52166X = CoroutineScopeKt.m112637a(Dispatchers.m112680b().mo112823d0(SupervisorKt.m112864b(null, 1, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r0 */
    public final String m53557r0() {
        int m131511r;
        Object obj;
        Object obj2;
        try {
            C19205a c19205a = C19205a.f95429a;
            String m100712K = c19205a.m100712K();
            Video video = this.f52151I;
            List<C19205a.a> m100711I = c19205a.m100711I();
            if (m100711I.isEmpty()) {
                if (video == null) {
                    return null;
                }
                JSONArray jSONArray = new JSONArray();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("video_id", video.m52911t());
                jSONObject.put("play_time", 0);
                jSONObject.put("open_source", m100712K);
                jSONArray.put(jSONObject);
                AbstractC20110a.f98889a.mo104548a("tannd3 getViewData:" + jSONArray, new Object[0]);
                return jSONArray.toString();
            }
            C25093p.a aVar = C25093p.Companion;
            List list = m100711I;
            m131511r = AbstractC25370t.m131511r(list, 10);
            ArrayList arrayList = new ArrayList(m131511r);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((C19205a.a) it.next()).m100737g());
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            aVar.m130110f((String[]) Arrays.copyOf(strArr, strArr.length));
            JSONArray jSONArray2 = new JSONArray();
            for (C19205a.a aVar2 : m100711I) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("video_id", aVar2.m100737g());
                jSONObject2.put("play_time", aVar2.m100736f());
                Integer m100731a = aVar2.m100731a();
                if (m100731a != null) {
                    jSONObject2.put("do_cmt", m100731a.intValue());
                }
                Boolean m100733c = aVar2.m100733c();
                String str = "0";
                if (m100733c != null) {
                    if (!m100733c.booleanValue()) {
                        obj2 = "0";
                    } else {
                        obj2 = "1";
                    }
                    jSONObject2.put("do_like", obj2);
                }
                Integer m100734d = aVar2.m100734d();
                if (m100734d != null) {
                    jSONObject2.put("do_share", m100734d.intValue());
                }
                Boolean m100732b = aVar2.m100732b();
                if (m100732b != null) {
                    if (!m100732b.booleanValue()) {
                        obj = "0";
                    } else {
                        obj = "1";
                    }
                    jSONObject2.put("do_follow_channel", obj);
                }
                Boolean m100735e = aVar2.m100735e();
                if (m100735e != null) {
                    if (m100735e.booleanValue()) {
                        str = "1";
                    }
                    jSONObject2.put("do_uninterested", str);
                }
                jSONArray2.put(jSONObject2);
            }
            AbstractC20110a.f98889a.mo104548a("tannd3 getViewData:" + jSONArray2, new Object[0]);
            return jSONArray2.toString();
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s0 */
    public static final void m53558s0(VideoPresenterImpl videoPresenterImpl, Video video, Throwable th2, Section section, Throwable th3, List list, Boolean bool, List list2) {
        if (th2 != null || video != null) {
            if (th3 == null && section == null) {
                return;
            }
            videoPresenterImpl.f52157O = false;
            if (th2 != null && th3 != null) {
                if (!C25090m.f120499a.m130050b(((InterfaceC10628f) videoPresenterImpl.m52968s()).getContext())) {
                    ((InterfaceC10628f) videoPresenterImpl.m52968s()).mo55388d(new NetworkException(null, 1, null));
                    return;
                }
                Video video2 = videoPresenterImpl.f52151I;
                AbstractC19074t.m100205c(video2);
                if (video2.m52903n0()) {
                    videoPresenterImpl.f52151I = null;
                    InterfaceC10628f.a.m55559c((InterfaceC10628f) videoPresenterImpl.m52968s(), new Section((List) null, 0L, (LoadMoreInfo) null, 7, (AbstractC19060k) null), null, list2, 2, null);
                    return;
                } else {
                    ((InterfaceC10628f) videoPresenterImpl.m52968s()).mo55388d(th2);
                    return;
                }
            }
            if (video != null && video.m52863R() == 0) {
                videoPresenterImpl.f52151I = null;
                ((InterfaceC10628f) videoPresenterImpl.m52968s()).mo55392hp(video);
                InterfaceC10628f interfaceC10628f = (InterfaceC10628f) videoPresenterImpl.m52968s();
                if (section == null) {
                    section = new Section((List) null, 0L, (LoadMoreInfo) null, 7, (AbstractC19060k) null);
                }
                interfaceC10628f.mo55380MD(section, list, list2);
                return;
            }
            Video video3 = videoPresenterImpl.f52151I;
            AbstractC19074t.m100205c(video3);
            if (video3.m52903n0()) {
                videoPresenterImpl.f52151I = null;
                InterfaceC10628f interfaceC10628f2 = (InterfaceC10628f) videoPresenterImpl.m52968s();
                if (section == null) {
                    section = new Section((List) null, 0L, (LoadMoreInfo) null, 7, (AbstractC19060k) null);
                }
                interfaceC10628f2.mo55380MD(section, list, list2);
                return;
            }
            String str = videoPresenterImpl.f52144B;
            switch (str.hashCode()) {
                case -507563187:
                    if (!str.equals("SOURCE_FOLLOWING")) {
                        return;
                    }
                    break;
                case 596808987:
                    if (str.equals("SOURCE_FOR_U")) {
                        if (section != null) {
                            videoPresenterImpl.f52151I = null;
                            ((InterfaceC10628f) videoPresenterImpl.m52968s()).mo55380MD(section, list, list2);
                            C25097t.f120556a.m130153n(((InterfaceC10628f) videoPresenterImpl.m52968s()).getContext(), AbstractC27413h.zch_popup_unavailable_video_title);
                            return;
                        } else {
                            InterfaceC10628f interfaceC10628f3 = (InterfaceC10628f) videoPresenterImpl.m52968s();
                            AbstractC19074t.m100205c(th3);
                            interfaceC10628f3.mo55388d(th3);
                            return;
                        }
                    }
                    return;
                case 1323686722:
                    if (!str.equals("SOURCE_FRIEND")) {
                        return;
                    }
                    break;
                case 2097700250:
                    if (str.equals("SOURCE_NOTI")) {
                        videoPresenterImpl.f52151I = null;
                        ((InterfaceC10628f) videoPresenterImpl.m52968s()).mo55381Rg(section, th3);
                        return;
                    }
                    return;
                default:
                    return;
            }
            if (section != null) {
                videoPresenterImpl.f52151I = null;
                ((InterfaceC10628f) videoPresenterImpl.m52968s()).mo55403xw(section, list, AbstractC19074t.m100204b(bool, Boolean.TRUE), list2);
                C25097t.f120556a.m130153n(((InterfaceC10628f) videoPresenterImpl.m52968s()).getContext(), AbstractC27413h.zch_popup_unavailable_video_title);
            } else {
                InterfaceC10628f interfaceC10628f4 = (InterfaceC10628f) videoPresenterImpl.m52968s();
                AbstractC19074t.m100205c(th3);
                interfaceC10628f4.mo55388d(th3);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t0 */
    public static final void m53559t0(VideoPresenterImpl videoPresenterImpl, boolean z11, boolean z12) {
        int i11;
        String string;
        Map m131401f;
        int i12;
        Context context = ((InterfaceC10628f) videoPresenterImpl.m52968s()).getContext();
        if (context != null) {
            C19205a c19205a = C19205a.f95429a;
            if (z11) {
                String str = videoPresenterImpl.f52144B;
                int hashCode = str.hashCode();
                if (hashCode != -507563187) {
                    if (hashCode != 596808987) {
                        if (hashCode == 1323686722 && str.equals("SOURCE_FRIEND")) {
                            i12 = AbstractC27413h.zch_action_key_friend_like_video_result;
                            string = context.getString(i12);
                        }
                        i12 = AbstractC27413h.zch_action_key_player_like_video_result;
                        string = context.getString(i12);
                    } else {
                        if (str.equals("SOURCE_FOR_U")) {
                            i12 = AbstractC27413h.zch_action_key_foru_like_video_result;
                            string = context.getString(i12);
                        }
                        i12 = AbstractC27413h.zch_action_key_player_like_video_result;
                        string = context.getString(i12);
                    }
                } else {
                    if (str.equals("SOURCE_FOLLOWING")) {
                        i12 = AbstractC27413h.zch_action_key_following_like_video_result;
                        string = context.getString(i12);
                    }
                    i12 = AbstractC27413h.zch_action_key_player_like_video_result;
                    string = context.getString(i12);
                }
            } else {
                String str2 = videoPresenterImpl.f52144B;
                int hashCode2 = str2.hashCode();
                if (hashCode2 != -507563187) {
                    if (hashCode2 != 596808987) {
                        if (hashCode2 == 1323686722 && str2.equals("SOURCE_FRIEND")) {
                            i11 = AbstractC27413h.zch_action_key_friend_unlike_video_result;
                            string = context.getString(i11);
                        }
                        i11 = AbstractC27413h.zch_action_key_player_unlike_video_result;
                        string = context.getString(i11);
                    } else {
                        if (str2.equals("SOURCE_FOR_U")) {
                            i11 = AbstractC27413h.zch_action_key_foru_unlike_video_result;
                            string = context.getString(i11);
                        }
                        i11 = AbstractC27413h.zch_action_key_player_unlike_video_result;
                        string = context.getString(i11);
                    }
                } else {
                    if (str2.equals("SOURCE_FOLLOWING")) {
                        i11 = AbstractC27413h.zch_action_key_following_unlike_video_result;
                        string = context.getString(i11);
                    }
                    i11 = AbstractC27413h.zch_action_key_player_unlike_video_result;
                    string = context.getString(i11);
                }
            }
            AbstractC19074t.m100205c(string);
            m131401f = AbstractC25361o0.m131401f(AbstractC24866w.m129235a("status", Integer.valueOf(z12 ? 1 : 0)));
            c19205a.m100713L(string, m131401f);
        }
    }

    @Override // com.zing.zalo.shortvideo.p072ui.presenter.InterfaceC10058f
    /* renamed from: Ab */
    public void mo53562Ab(String str) {
        C25093p c25093p = this.f52165W;
        if (c25093p != null) {
            c25093p.m130099H(str);
        }
        C25093p c25093p2 = this.f52165W;
        if (c25093p2 != null) {
            c25093p2.m130101t(((InterfaceC10628f) m52968s()).mo55400sC());
        }
        C26947a c26947a = this.f52164V;
        if (c26947a != null) {
            c26947a.m138831M(str);
        }
        C26947a c26947a2 = this.f52164V;
        if (c26947a2 != null) {
            c26947a2.m138830L(new C10041q0());
        }
        C26947a c26947a3 = this.f52164V;
        if (c26947a3 != null) {
            c26947a3.m138829K(new C10043r0());
        }
        C31179n0 mo55400sC = ((InterfaceC10628f) m52968s()).mo55400sC();
        if (mo55400sC != null) {
            C26947a c26947a4 = this.f52164V;
            if (c26947a4 != null) {
                c26947a4.m138833z(mo55400sC);
            }
            mo55400sC.m9998I(new C10045s0());
        }
    }

    @Override // com.zing.zalo.shortvideo.p072ui.presenter.InterfaceC10058f
    /* renamed from: Bu */
    public void mo53563Bu(Map map) {
        AbstractC19074t.m100208f(map, "map");
        Set keySet = map.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : keySet) {
            String str = (String) obj;
            if (!AbstractC19074t.m100204b(this.f52177z.get(str), map.get(str))) {
                arrayList.add(obj);
            }
        }
        if (!(!arrayList.isEmpty())) {
            arrayList = null;
        }
        if (arrayList != null) {
            BasePresenterImpl.m52963o(this, new C10020g(arrayList, null), null, new C10022h(map, this), 2, null);
        }
    }

    @Override // com.zing.zalo.shortvideo.p072ui.presenter.InterfaceC10058f
    /* renamed from: DA */
    public void mo53564DA(Video video, boolean z11) {
        AbstractC19074t.m100208f(video, "video");
        InterfaceC29283d m143692z = AbstractC28684a.Companion.m143692z();
        String m52911t = video.m52911t();
        Boolean valueOf = Boolean.valueOf(z11);
        long j11 = -1;
        if (video.m52835B() != -1) {
            if (z11) {
                video.m52857N0(video.m52835B() + 1);
                j11 = video.m52835B();
            } else {
                video.m52857N0(video.m52835B() - 1);
                j11 = video.m52835B();
            }
        }
        m143692z.mo146383v(m52911t, valueOf, Long.valueOf(j11));
        if (this.f52155M.put(video.m52911t(), Boolean.valueOf(z11)) != null) {
            return;
        }
        m52966n(new C10042r(video, z11, null), new C10044s(video, z11), new C10046t(video, z11));
    }

    @Override // com.zing.zalo.shortvideo.p072ui.presenter.InterfaceC10058f
    /* renamed from: G2 */
    public void mo53565G2(String str, String str2, String str3, InterfaceC18505l interfaceC18505l) {
        String str4;
        boolean m127128x;
        AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        AbstractC19074t.m100208f(str2, "src");
        AbstractC19074t.m100208f(interfaceC18505l, "action");
        try {
            Uri.Builder buildUpon = Uri.parse(str).buildUpon();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyMMddHH", Locale.getDefault());
            C27417l c27417l = C27417l.f129055a;
            C24860q[] c24860qArr = {AbstractC24866w.m129235a("source", str2), AbstractC24866w.m129235a("share_time", simpleDateFormat.format(Long.valueOf(c27417l.m140382f().m130131a()))), AbstractC24866w.m129235a("share_uid", c27417l.m140378b().m51234g()), AbstractC24866w.m129235a("ctx", str3)};
            for (int i11 = 0; i11 < 4; i11++) {
                C24860q c24860q = c24860qArr[i11];
                String str5 = (String) c24860q.m129213a();
                String str6 = (String) c24860q.m129214b();
                if (str6 != null) {
                    m127128x = AbstractC24341v.m127128x(str6);
                    if (!m127128x) {
                        buildUpon.appendQueryParameter(str5, str6);
                    }
                }
            }
            str4 = buildUpon.toString();
        } catch (Exception unused) {
            str4 = str;
        }
        AbstractC19074t.m100205c(str4);
        BuildersKt__Builders_commonKt.m112540d(m52969u(), null, null, new C10050x(str4, interfaceC18505l, str, null), 3, null);
    }

    @Override // com.zing.zalo.shortvideo.p072ui.presenter.InterfaceC10058f
    /* renamed from: J3 */
    public Object mo53566J3(int i11, Continuation continuation) {
        Object m142578e;
        Object mo50546J3 = this.f52170s.mo50546J3(i11, continuation);
        m142578e = AbstractC28298d.m142578e();
        if (mo50546J3 == m142578e) {
            return mo50546J3;
        }
        return C24848g0.f119245a;
    }

    @Override // com.zing.zalo.shortvideo.p072ui.presenter.InterfaceC10058f
    /* renamed from: Jk */
    public void mo53567Jk(Video video, boolean z11, VideoAdsInfo videoAdsInfo) {
        long j11;
        AbstractC19074t.m100208f(video, "video");
        InterfaceC29283d m143692z = AbstractC28684a.Companion.m143692z();
        String m52911t = video.m52911t();
        Boolean valueOf = Boolean.valueOf(z11);
        long m52839D = video.m52839D();
        if (z11) {
            j11 = 1;
        } else {
            j11 = -1;
        }
        video.m52860P0(m52839D + j11);
        m143692z.mo146382u(m52911t, valueOf, Long.valueOf(video.m52839D()));
        if (this.f52175x.put(video.m52911t(), Boolean.valueOf(z11)) != null) {
            return;
        }
        m52966n(new C10011b0(z11, this, video, videoAdsInfo, null), new C10013c0(video, z11), new C10015d0(video, z11, videoAdsInfo));
    }

    @Override // com.zing.zalo.shortvideo.p072ui.presenter.InterfaceC10058f
    /* renamed from: La */
    public void mo53568La(boolean z11, LoadMoreInfo loadMoreInfo) {
        if (C27417l.f129055a.m140391o()) {
            return;
        }
        if ((!z11 && (loadMoreInfo == null || !loadMoreInfo.isValid())) || this.f52168Z) {
            return;
        }
        this.f52168Z = true;
        m52966n(new C10014d(loadMoreInfo, null), new C10016e(), new C10018f(z11, this));
    }

    @Override // com.zing.zalo.shortvideo.p072ui.presenter.InterfaceC10058f
    /* renamed from: O2 */
    public Object mo53569O2(String str, Continuation continuation) {
        Object m142578e;
        Object mo50547O2 = this.f52170s.mo50547O2(str, continuation);
        m142578e = AbstractC28298d.m142578e();
        if (mo50547O2 == m142578e) {
            return mo50547O2;
        }
        return C24848g0.f119245a;
    }

    @Override // com.zing.zalo.shortvideo.p072ui.presenter.InterfaceC10058f
    /* renamed from: Sn */
    public String mo53570Sn() {
        return this.f52145C;
    }

    @Override // com.zing.zalo.shortvideo.p072ui.presenter.InterfaceC10058f
    /* renamed from: UD */
    public C26947a mo53571UD() {
        return this.f52164V;
    }

    @Override // com.zing.zalo.shortvideo.p072ui.presenter.InterfaceC10058f
    /* renamed from: Up */
    public void mo53572Up(Map map, boolean z11) {
        AbstractC19074t.m100208f(map, "map");
        Set keySet = map.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : keySet) {
            String str = (String) obj;
            if (!AbstractC19074t.m100204b(this.f52176y.get(str), map.get(str))) {
                arrayList.add(obj);
            }
        }
        if (arrayList.size() < 5 && (!z11 || !(!arrayList.isEmpty()))) {
            arrayList = null;
        }
        if (arrayList != null) {
            BasePresenterImpl.m52963o(this, new C10032m(arrayList, null), null, new C10034n(map, this), 2, null);
        }
    }

    @Override // com.zing.zalo.shortvideo.p072ui.presenter.InterfaceC10058f
    /* renamed from: Wf */
    public void mo53573Wf(Channel channel, boolean z11, boolean z12, Video video) {
        AbstractC19074t.m100208f(channel, "channel");
        m52966n(new C10051y(z11, this, channel, video, null), new C10052z(channel, z11, z12), new C10009a0(channel, z11, z12));
    }

    @Override // com.zing.zalo.shortvideo.p072ui.presenter.InterfaceC10058f
    /* renamed from: Zn */
    public C25093p mo53574Zn() {
        return this.f52165W;
    }

    @Override // com.zing.zalo.shortvideo.p072ui.presenter.BasePresenterImpl, androidx.lifecycle.InterfaceC1767f
    /* renamed from: Zv */
    public void mo8648Zv(InterfaceC1801w interfaceC1801w) {
        AbstractC19074t.m100208f(interfaceC1801w, "owner");
        super.mo8648Zv(interfaceC1801w);
        if (((InterfaceC10628f) m52968s()).getContext() != null) {
            this.f52173v.mo53687g();
            this.f52174w.mo53687g();
        }
        this.f52175x.clear();
        this.f52155M.clear();
        this.f52157O = false;
        this.f52158P = false;
        this.f52159Q = false;
        this.f52167Y = false;
        this.f52168Z = false;
        this.f52162T = null;
        this.f52163U = null;
        BasePresenterImpl.m52964r(this, false, 1, null);
    }

    @Override // com.zing.zalo.shortvideo.p072ui.presenter.InterfaceC10058f
    /* renamed from: aE */
    public void mo53575aE() {
        JobKt__JobKt.m112768g(this.f52166X.mo9207O(), null, 1, null);
    }

    @Override // com.zing.zalo.shortvideo.p072ui.presenter.InterfaceC10058f
    /* renamed from: aw */
    public void mo53576aw() {
        if (this.f52167Y) {
            return;
        }
        this.f52167Y = true;
        BuildersKt__Builders_commonKt.m112540d(m52969u(), null, null, new C10010b(null), 3, null);
    }

    @Override // com.zing.zalo.shortvideo.p072ui.presenter.InterfaceC10058f
    /* renamed from: d0 */
    public void mo53577d0() {
        BasePresenterImpl.m52964r(this, false, 1, null);
        this.f52160R.removeCallbacksAndMessages(null);
        this.f52158P = false;
        this.f52159Q = false;
        this.f52167Y = false;
        this.f52168Z = false;
        this.f52162T = null;
        this.f52163U = null;
    }

    @Override // com.zing.zalo.shortvideo.p072ui.presenter.InterfaceC10058f
    /* renamed from: dv */
    public Video mo53578dv() {
        return this.f52151I;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0067  */
    @Override // com.zing.zalo.shortvideo.p072ui.presenter.InterfaceC10058f
    /* renamed from: eE */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo53579eE(Map map) {
        Context context;
        AbstractC19074t.m100208f(map, "params");
        String str = this.f52144B;
        int hashCode = str.hashCode();
        String str2 = null;
        if (hashCode != -507563187) {
            if (hashCode != 596808987) {
                if (hashCode == 1323686722 && str.equals("SOURCE_FRIEND")) {
                    Context context2 = ((InterfaceC10628f) m52968s()).getContext();
                    if (context2 != null) {
                        str2 = context2.getString(AbstractC27413h.zch_action_key_friend_promo_footer_tap);
                    }
                }
                context = ((InterfaceC10628f) m52968s()).getContext();
                if (context != null) {
                    str2 = context.getString(AbstractC27413h.zch_action_key_player_promo_footer_tap);
                }
            } else {
                if (str.equals("SOURCE_FOR_U")) {
                    Context context3 = ((InterfaceC10628f) m52968s()).getContext();
                    if (context3 != null) {
                        str2 = context3.getString(AbstractC27413h.zch_action_key_foru_promo_footer_tap);
                    }
                }
                context = ((InterfaceC10628f) m52968s()).getContext();
                if (context != null) {
                }
            }
        } else {
            if (str.equals("SOURCE_FOLLOWING")) {
                Context context4 = ((InterfaceC10628f) m52968s()).getContext();
                if (context4 != null) {
                    str2 = context4.getString(AbstractC27413h.zch_action_key_following_promo_footer_tap);
                }
            }
            context = ((InterfaceC10628f) m52968s()).getContext();
            if (context != null) {
            }
        }
        if (str2 != null) {
            C19205a.f95429a.m100713L(str2, map);
        }
    }

    @Override // com.zing.zalo.shortvideo.p072ui.presenter.InterfaceC10058f
    /* renamed from: f3 */
    public Object mo53580f3(C0054s c0054s, Continuation continuation) {
        Object m142578e;
        Object mo50554f3 = this.f52170s.mo50554f3(c0054s, continuation);
        m142578e = AbstractC28298d.m142578e();
        if (mo50554f3 == m142578e) {
            return mo50554f3;
        }
        return C24848g0.f119245a;
    }

    @Override // com.zing.zalo.shortvideo.p072ui.presenter.InterfaceC10058f
    /* renamed from: gl */
    public void mo53581gl(String str, LoadMoreInfo loadMoreInfo) {
        AbstractC19074t.m100208f(str, "videoId");
        BuildersKt__Builders_commonKt.m112540d(this.f52166X, null, null, new C10036o(str, loadMoreInfo, null), 3, null);
    }

    @Override // com.zing.zalo.shortvideo.p072ui.presenter.InterfaceC10058f
    /* renamed from: h */
    public String mo53582h() {
        return this.f52144B;
    }

    @Override // com.zing.zalo.shortvideo.p072ui.presenter.InterfaceC10058f
    /* renamed from: in */
    public void mo53583in(String str, String str2, String str3) {
        String str4;
        AbstractC19074t.m100208f(str, "videoId");
        Video video = this.f52151I;
        if (video != null) {
            str4 = video.m52911t();
        } else {
            str4 = null;
        }
        if (AbstractC19074t.m100204b(str, str4)) {
            this.f52151I = null;
        }
        BasePresenterImpl.m52963o(this, new C10039p0(str, str2, null), null, null, 6, null);
    }

    @Override // com.zing.zalo.shortvideo.p072ui.presenter.InterfaceC10058f
    /* renamed from: lB */
    public void mo53584lB(Video video) {
        AbstractC19074t.m100208f(video, "video");
        m52966n(new C10047u(video, null), new C10048v(video), new C10049w(video));
    }

    @Override // com.zing.zalo.shortvideo.p072ui.presenter.InterfaceC10058f
    /* renamed from: nb */
    public void mo53585nb(BreakSlot breakSlot, boolean z11, boolean z12) {
        AbstractC19074t.m100208f(breakSlot, "onboarding");
        if (z11) {
            this.f52143A.remove(breakSlot);
        } else if (!this.f52143A.add(breakSlot)) {
            return;
        }
        BasePresenterImpl.m52963o(this, new C10029k0(z12, breakSlot, null), null, new C10031l0(z11, z12, this), 2, null);
    }

    @Override // com.zing.zalo.shortvideo.p072ui.presenter.InterfaceC10058f
    /* renamed from: oC */
    public void mo53586oC(String str, InterfaceC18505l interfaceC18505l, InterfaceC18505l interfaceC18505l2) {
        AbstractC19074t.m100208f(str, "videoId");
        AbstractC19074t.m100208f(interfaceC18505l, "fallback");
        AbstractC19074t.m100208f(interfaceC18505l2, "consumer");
        m52966n(new C10024i(str, null), interfaceC18505l, interfaceC18505l2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.shortvideo.p072ui.presenter.BasePresenterImpl
    /* renamed from: p */
    public void mo52967p(boolean z11) {
        if (z11) {
            C26947a c26947a = this.f52164V;
            if (c26947a != null) {
                c26947a.m138827I();
            }
            this.f52164V = null;
            C25093p c25093p = this.f52165W;
            if (c25093p != null) {
                c25093p.m130097E();
            }
            this.f52165W = null;
        }
        super.mo52967p(z11);
        InterfaceC27315f mo9207O = this.f52166X.mo9207O();
        if (z11) {
            JobKt__JobKt.m112765d(mo9207O, null, 1, null);
        } else {
            JobKt__JobKt.m112768g(mo9207O, null, 1, null);
        }
    }

    @Override // com.zing.zalo.shortvideo.p072ui.presenter.InterfaceC10058f
    /* renamed from: p1 */
    public Object mo53587p1(String str, Continuation continuation) {
        return this.f52170s.mo50565p1(str, continuation);
    }

    @Override // com.zing.zalo.shortvideo.p072ui.presenter.InterfaceC10058f
    /* renamed from: q1 */
    public void mo53588q1(LoadMoreInfo loadMoreInfo) {
        C19059j0 c19059j0;
        if (this.f52157O) {
            if (loadMoreInfo == null) {
                BasePresenterImpl.m52964r(this, false, 1, null);
            } else {
                return;
            }
        } else {
            this.f52157O = true;
        }
        C19059j0 c19059j02 = new C19059j0();
        C19059j0 c19059j03 = new C19059j0();
        C19059j0 c19059j04 = new C19059j0();
        C19059j0 c19059j05 = new C19059j0();
        C19059j0 c19059j06 = new C19059j0();
        C19059j0 c19059j07 = new C19059j0();
        C19059j0 c19059j08 = new C19059j0();
        Video video = this.f52151I;
        if (video != null) {
            c19059j0 = c19059j06;
            mo53586oC(video.m52911t(), new C10026j(c19059j06, c19059j02, c19059j03, c19059j07, c19059j04, c19059j05, c19059j08, this), new C10028k(video, c19059j02, c19059j06, c19059j03, c19059j07, c19059j04, c19059j05, c19059j08, this));
        } else {
            c19059j0 = c19059j06;
        }
        BuildersKt__Builders_commonKt.m112540d(m52969u(), null, null, new C10030l(loadMoreInfo, c19059j03, c19059j04, c19059j05, c19059j08, c19059j02, c19059j0, c19059j07, null), 3, null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:            if (r0.equals("SOURCE_FRIEND") != false) goto L34;     */
    /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:            return v00.C27417l.f129055a.m140378b().m51234g() + "_" + r3.f52144B;     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003e, code lost:            if (r0.equals("SOURCE_SEARCH_VIDEO") != false) goto L43;     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b5, code lost:            return r3.f52152J;     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0053, code lost:            if (r0.equals("SOURCE_FOR_U") != false) goto L34;     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0072, code lost:            if (r0.equals("SOURCE_FOLLOWING") != false) goto L34;     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b1, code lost:            if (r0.equals("SOURCE_SEARCH_ALL") != false) goto L43;     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    @Override // com.zing.zalo.shortvideo.p072ui.presenter.InterfaceC10058f
    /* renamed from: qn */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String mo53589qn() {
        String str = this.f52144B;
        switch (str.hashCode()) {
            case -1532338930:
                break;
            case -617742456:
                if (str.equals("SOURCE_HASHTAG")) {
                    return this.f52146D;
                }
                throw new IllegalArgumentException();
            case -576339777:
                if (str.equals("SOURCE_CHANNEL")) {
                    return this.f52149G;
                }
                throw new IllegalArgumentException();
            case -507563187:
                break;
            case -218246311:
                if (str.equals("SOURCE_LOCATION")) {
                    return this.f52153K;
                }
                throw new IllegalArgumentException();
            case -113911590:
                if (str.equals("SOURCE_BOOKMARK")) {
                    return this.f52145C;
                }
                throw new IllegalArgumentException();
            case 596808987:
                break;
            case 602163817:
                if (str.equals("SOURCE_LIKED")) {
                    return this.f52145C;
                }
                throw new IllegalArgumentException();
            case 615369896:
                break;
            case 778377639:
                if (str.equals("SOURCE_SIMILAR")) {
                    return this.f52147E;
                }
                throw new IllegalArgumentException();
            case 1323686722:
                break;
            case 1730512194:
                if (str.equals("SOURCE_COLLECTION")) {
                    return this.f52148F;
                }
                throw new IllegalArgumentException();
            case 2097700250:
                if (str.equals("SOURCE_NOTI")) {
                    return this.f52150H;
                }
                throw new IllegalArgumentException();
            default:
                throw new IllegalArgumentException();
        }
    }

    @Override // com.zing.zalo.shortvideo.p072ui.presenter.InterfaceC10058f
    /* renamed from: sA */
    public void mo53590sA(BreakSlot breakSlot, boolean z11) {
        AbstractC19074t.m100208f(breakSlot, "survey");
        if (z11) {
            this.f52143A.remove(breakSlot);
        } else if (!this.f52143A.add(breakSlot)) {
            return;
        }
        BasePresenterImpl.m52963o(this, new C10033m0(breakSlot, null), null, new C10035n0(z11, breakSlot, this), 2, null);
    }

    @Override // com.zing.zalo.shortvideo.p072ui.presenter.InterfaceC10058f
    /* renamed from: ss */
    public void mo53591ss(Video video, boolean z11) {
        AbstractC19074t.m100208f(video, "video");
        if (this.f52156N.put(video.m52911t(), Boolean.valueOf(z11)) != null) {
            return;
        }
        m52966n(new C10017e0(video, z11, null), new C10019f0(video, z11), new C10021g0(video, z11));
    }

    @Override // com.zing.zalo.shortvideo.p072ui.presenter.InterfaceC10058f
    /* renamed from: tH */
    public void mo53592tH(Video video, boolean z11) {
        AbstractC19074t.m100208f(video, "video");
        m52966n(new C10023h0(z11, this, video, null), new C10025i0(video, z11), new C10027j0(video, z11, this));
    }

    @Override // com.zing.zalo.shortvideo.p072ui.presenter.BasePresenterImpl, com.zing.zalo.shortvideo.p072ui.presenter.InterfaceC10053a
    /* renamed from: uo */
    public void mo52970uo(Bundle bundle) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        Video video;
        String str8 = null;
        if (bundle != null) {
            str = bundle.getString("SOURCE");
        } else {
            str = null;
        }
        String str9 = "";
        if (str == null) {
            str = "";
        }
        this.f52144B = str;
        if (bundle != null) {
            str2 = bundle.getString("HASHTAG");
        } else {
            str2 = null;
        }
        if (str2 == null) {
            str2 = "";
        }
        this.f52146D = str2;
        if (bundle != null) {
            str3 = bundle.getString("SIMILAR_ID");
        } else {
            str3 = null;
        }
        if (str3 == null) {
            str3 = "";
        }
        this.f52147E = str3;
        if (bundle != null) {
            str4 = bundle.getString("COLLECTION");
        } else {
            str4 = null;
        }
        if (str4 == null) {
            str4 = "";
        }
        this.f52148F = str4;
        if (bundle != null) {
            str5 = bundle.getString("CHANNEL_ID");
        } else {
            str5 = null;
        }
        if (str5 == null) {
            str5 = "";
        }
        this.f52149G = str5;
        if (bundle != null) {
            str6 = bundle.getString("SOURCE_UUID");
        } else {
            str6 = null;
        }
        if (str6 == null) {
            str6 = "";
        }
        this.f52145C = str6;
        if (bundle != null) {
            str7 = bundle.getString("SEARCH_KW");
        } else {
            str7 = null;
        }
        if (str7 == null) {
            str7 = "";
        }
        this.f52152J = str7;
        if (bundle != null) {
            str8 = bundle.getString("VIDEO_LOCATION_VALUE");
        }
        if (str8 != null) {
            str9 = str8;
        }
        this.f52153K = str9;
        if (bundle != null && (video = (Video) bundle.getParcelable("RESERVED_VIDEO")) != null) {
            this.f52151I = video;
            this.f52150H = video.m52911t();
        }
        if (AbstractC19074t.m100204b(this.f52144B, "SOURCE_FOR_U")) {
            this.f52165W = new C25093p(m52969u(), ((InterfaceC10628f) m52968s()).mo55394jd());
            C27417l c27417l = C27417l.f129055a;
            c27417l.m140386j();
            if (c27417l.m140391o() && this.f52164V == null) {
                this.f52164V = new C26947a(m52969u(), ((InterfaceC10628f) m52968s()).mo55391gD());
            }
        }
    }

    @Override // com.zing.zalo.shortvideo.p072ui.presenter.BasePresenterImpl, androidx.lifecycle.InterfaceC1767f
    /* renamed from: wC */
    public void mo8650wC(InterfaceC1801w interfaceC1801w) {
        AbstractC19074t.m100208f(interfaceC1801w, "owner");
        super.mo8650wC(interfaceC1801w);
        Context context = ((InterfaceC10628f) m52968s()).getContext();
        if (context != null) {
            this.f52173v.mo53685d(context);
            this.f52174w.mo53685d(context);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0067  */
    @Override // com.zing.zalo.shortvideo.p072ui.presenter.InterfaceC10058f
    /* renamed from: ws */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo53593ws(Map map) {
        Context context;
        AbstractC19074t.m100208f(map, "params");
        String str = this.f52144B;
        int hashCode = str.hashCode();
        String str2 = null;
        if (hashCode != -507563187) {
            if (hashCode != 596808987) {
                if (hashCode == 1323686722 && str.equals("SOURCE_FRIEND")) {
                    Context context2 = ((InterfaceC10628f) m52968s()).getContext();
                    if (context2 != null) {
                        str2 = context2.getString(AbstractC27413h.zch_action_key_show_friend_promo_footer);
                    }
                }
                context = ((InterfaceC10628f) m52968s()).getContext();
                if (context != null) {
                    str2 = context.getString(AbstractC27413h.zch_action_key_show_player_promo_footer);
                }
            } else {
                if (str.equals("SOURCE_FOR_U")) {
                    Context context3 = ((InterfaceC10628f) m52968s()).getContext();
                    if (context3 != null) {
                        str2 = context3.getString(AbstractC27413h.zch_action_key_show_foru_promo_footer);
                    }
                }
                context = ((InterfaceC10628f) m52968s()).getContext();
                if (context != null) {
                }
            }
        } else {
            if (str.equals("SOURCE_FOLLOWING")) {
                Context context4 = ((InterfaceC10628f) m52968s()).getContext();
                if (context4 != null) {
                    str2 = context4.getString(AbstractC27413h.zch_action_key_show_following_promo_footer);
                }
            }
            context = ((InterfaceC10628f) m52968s()).getContext();
            if (context != null) {
            }
        }
        if (str2 != null) {
            C19205a.f95429a.m100713L(str2, map);
        }
    }

    @Override // com.zing.zalo.shortvideo.p072ui.presenter.InterfaceC10058f
    /* renamed from: yk */
    public void mo53594yk(String str, String str2) {
        String str3;
        AbstractC19074t.m100208f(str, "videoId");
        AbstractC19074t.m100208f(str2, "channelId");
        Video video = this.f52151I;
        if (video != null) {
            str3 = video.m52911t();
        } else {
            str3 = null;
        }
        if (AbstractC19074t.m100204b(str, str3)) {
            this.f52151I = null;
        }
        BasePresenterImpl.m52963o(this, new C10037o0(str2, null), null, null, 6, null);
    }
}
