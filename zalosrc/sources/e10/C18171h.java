package e10;

import a10.C0053r;
import android.os.Build;
import bn0.AbstractC2942k;
import com.zing.zalo.shortvideo.data.model.BreakSlot;
import com.zing.zalo.shortvideo.data.model.Channel;
import com.zing.zalo.shortvideo.data.model.CollectionVideo;
import com.zing.zalo.shortvideo.data.model.Comment;
import com.zing.zalo.shortvideo.data.model.ComplexAds;
import com.zing.zalo.shortvideo.data.model.FollowingData;
import com.zing.zalo.shortvideo.data.model.ForUData;
import com.zing.zalo.shortvideo.data.model.FriendData;
import com.zing.zalo.shortvideo.data.model.InAppNotification;
import com.zing.zalo.shortvideo.data.model.InteractNotificationLatestValue;
import com.zing.zalo.shortvideo.data.model.LivestreamData;
import com.zing.zalo.shortvideo.data.model.LoadMoreInfo;
import com.zing.zalo.shortvideo.data.model.LogResultInfo;
import com.zing.zalo.shortvideo.data.model.LongPollingResult;
import com.zing.zalo.shortvideo.data.model.Notification;
import com.zing.zalo.shortvideo.data.model.PagingLoadMoreInfo;
import com.zing.zalo.shortvideo.data.model.PersonalizeChannel;
import com.zing.zalo.shortvideo.data.model.PersonalizeComment;
import com.zing.zalo.shortvideo.data.model.PersonalizeStream;
import com.zing.zalo.shortvideo.data.model.ReplaceResult;
import com.zing.zalo.shortvideo.data.model.SearchAllResult;
import com.zing.zalo.shortvideo.data.model.SearchHashTag;
import com.zing.zalo.shortvideo.data.model.SearchSuggest;
import com.zing.zalo.shortvideo.data.model.Section;
import com.zing.zalo.shortvideo.data.model.SectionBoxData;
import com.zing.zalo.shortvideo.data.model.ShortLink;
import com.zing.zalo.shortvideo.data.model.User;
import com.zing.zalo.shortvideo.data.model.UserProfileResult;
import com.zing.zalo.shortvideo.data.model.VideoAdsData;
import com.zing.zalo.shortvideo.data.model.VideoData;
import com.zing.zalo.shortvideo.data.model.VideoLocationData;
import com.zing.zalo.shortvideo.data.model.config.ChannelConfig;
import com.zing.zalo.shortvideo.data.model.config.CoreConfig;
import com.zing.zalo.shortvideo.data.remote.common.AuthInfo;
import com.zing.zalo.shortvideo.data.remote.common.C9447a;
import com.zing.zalo.shortvideo.data.remote.common.InvalidTimeException;
import com.zing.zalo.shortvideo.data.remote.common.NotExistsException;
import com.zing.zalo.shortvideo.data.remote.common.OauthResponse;
import com.zing.zalo.shortvideo.data.remote.common.OauthToken;
import com.zing.zalo.shortvideo.data.remote.common.RestException;
import com.zing.zalo.shortvideo.data.remote.common.SerializeException;
import com.zing.zalo.shortvideo.data.remote.common.UnauthorizedException;
import com.zing.zalo.shortvideo.data.remote.common.UnsupportedFormatException;
import com.zing.zalo.shortvideo.p072ui.model.PersonalizeVideo;
import com.zing.zalo.shortvideo.p072ui.model.Video;
import com.zing.zalo.shortvideo.p072ui.receiver.ChannelReceiver;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import com.zing.zalocore.CoreUtility;
import e10.AbstractC18166c;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import f10.InterfaceC18689a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import g20.C19205a;
import im0.AbstractC20626a;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import jm0.C21296f;
import km0.AbstractC21767b;
import km0.EnumC21773h;
import km0.InterfaceC21766a;
import km0.InterfaceC21769d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.serialization.KSerializer;
import on0.AbstractC24341v;
import on0.AbstractC24342w;
import org.json.JSONArray;
import p133ek.AbstractC18458a;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.C24861r;
import q20.C25093p;
import qm0.AbstractC25332a0;
import qm0.AbstractC25363p0;
import qm0.AbstractC25370t;
import rn0.AbstractC25935a;
import s20.AbstractC26105g;
import v00.C27417l;
import vm0.AbstractC28297c;
import vm0.AbstractC28298d;
import w00.AbstractC28684a;
import wm0.AbstractC29094b;
import wm0.AbstractC29096d;
import wm0.AbstractC29100h;
import wm0.AbstractC29104l;
import x00.InterfaceC29280a;
import x00.InterfaceC29283d;
import y00.InterfaceC30248b;

/* renamed from: e10.h */
/* loaded from: classes5.dex */
public final class C18171h implements InterfaceC18170g, InterfaceC18689a {

    /* renamed from: a */
    private final InterfaceC29280a f91891a;

    /* renamed from: b */
    private final InterfaceC30248b f91892b;

    /* renamed from: c */
    private final MutableStateFlow f91893c;

    /* renamed from: d */
    private final ReentrantLock f91894d;

    /* renamed from: e10.h$a */
    /* loaded from: classes5.dex */
    static final class a extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f91895t;

        /* renamed from: v */
        final /* synthetic */ String f91897v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, Continuation continuation) {
            super(1, continuation);
            this.f91897v = str;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            Object m51581t;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f91895t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                    m51581t = obj;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C9447a.a m51566g = C9447a.a.m51566g(C9447a.a.m51566g(C9447a.Companion.m51596d(C18171h.this, "v1/user/my/do/block").m51583v(880039), "id", this.f91897v, false, 4, null), "objectType", "2", false, 4, null);
                KSerializer serializer = PersonalizeChannel.Companion.serializer();
                this.f91895t = 1;
                m51581t = m51566g.m51581t(serializer, this);
                if (m51581t == m142578e) {
                    return m142578e;
                }
            }
            ChannelReceiver.Companion.m53694a(this.f91897v, (PersonalizeChannel) m51581t);
            return m51581t;
        }

        /* renamed from: r */
        public final Continuation m96669r(Continuation continuation) {
            return new a(this.f91897v, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((a) m96669r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: e10.h$a0 */
    /* loaded from: classes5.dex */
    static final class a0 extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: B */
        final /* synthetic */ LoadMoreInfo f91899B;

        /* renamed from: C */
        final /* synthetic */ String f91900C;

        /* renamed from: D */
        final /* synthetic */ String f91901D;

        /* renamed from: t */
        Object f91902t;

        /* renamed from: u */
        Object f91903u;

        /* renamed from: v */
        Object f91904v;

        /* renamed from: w */
        Object f91905w;

        /* renamed from: x */
        Object f91906x;

        /* renamed from: y */
        Object f91907y;

        /* renamed from: z */
        int f91908z;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: e10.h$a0$a */
        /* loaded from: classes5.dex */
        public static final class a extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            public static final a f91909q = new a();

            a() {
                super(1);
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CharSequence mo205i9(C0053r c0053r) {
                AbstractC19074t.m100208f(c0053r, "it");
                return c0053r.m157d();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a0(LoadMoreInfo loadMoreInfo, String str, String str2, Continuation continuation) {
            super(1, continuation);
            this.f91899B = loadMoreInfo;
            this.f91900C = str;
            this.f91901D = str2;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x01b9 A[LOOP:1: B:18:0x01b3->B:20:0x01b9, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0191  */
        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo239o(Object obj) {
            Object m142578e;
            int i11;
            C9447a.a m51583v;
            LoadMoreInfo loadMoreInfo;
            String str;
            String str2;
            Object mo50541D;
            C9447a.a aVar;
            C9447a.a aVar2;
            String m131214n0;
            String m131214n02;
            String m131214n03;
            Object m51581t;
            String m131214n04;
            String m131214n05;
            Iterator it;
            m142578e = AbstractC28298d.m142578e();
            int i12 = this.f91908z;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 == 2) {
                        AbstractC24862s.m129228b(obj);
                        m51581t = obj;
                        ForUData forUData = (ForUData) m51581t;
                        Section m50946d = forUData.m50946d();
                        List m51168m = forUData.m50946d().m51168m();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : m51168m) {
                            if (((Video) obj2).m52905o0()) {
                                arrayList.add(obj2);
                            }
                        }
                        m50946d.m51172q(arrayList);
                        it = forUData.m50946d().m51168m().iterator();
                        while (it.hasNext()) {
                            ((Video) it.next()).m52868T0("for_you");
                        }
                        C19205a.m100677S(C19205a.f95429a, forUData.m50946d().m51168m(), "for_you", null, 4, null);
                        return m51581t;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C9447a.a aVar3 = (C9447a.a) this.f91907y;
                String str3 = (String) this.f91906x;
                C9447a.a aVar4 = (C9447a.a) this.f91905w;
                String str4 = (String) this.f91904v;
                LoadMoreInfo loadMoreInfo2 = (LoadMoreInfo) this.f91903u;
                C9447a.a aVar5 = (C9447a.a) this.f91902t;
                AbstractC24862s.m129228b(obj);
                str = str4;
                loadMoreInfo = loadMoreInfo2;
                aVar2 = aVar5;
                str2 = str3;
                mo50541D = obj;
                aVar = aVar3;
                m51583v = aVar4;
            } else {
                AbstractC24862s.m129228b(obj);
                C9447a.a m51579p = C9447a.Companion.m51596d(C18171h.this, "v1/home/trending/get/list_video_suggestion").m51579p(this.f91899B);
                if (this.f91899B != null) {
                    i11 = 880002;
                } else {
                    i11 = 880001;
                }
                m51583v = m51579p.m51583v(i11);
                String str5 = this.f91900C;
                C18171h c18171h = C18171h.this;
                loadMoreInfo = this.f91899B;
                str = this.f91901D;
                if (str5 != null) {
                    C9447a.a.m51566g(m51583v, "view_data", str5, false, 4, null);
                }
                C19205a c19205a = C19205a.f95429a;
                if (!c19205a.m100710H().isEmpty()) {
                    m131214n02 = AbstractC25332a0.m131214n0(c19205a.m100710H(), ",", null, null, 0, null, null, 62, null);
                    C9447a.a.m51566g(m51583v, "filterCateIds", m131214n02, false, 4, null);
                }
                if (!c19205a.m100709G().isEmpty()) {
                    m131214n0 = AbstractC25332a0.m131214n0(c19205a.m100709G(), ",", null, null, 0, null, null, 62, null);
                    C9447a.a.m51566g(m51583v, "filterChannelIds", m131214n0, false, 4, null);
                }
                InterfaceC30248b interfaceC30248b = c18171h.f91892b;
                this.f91902t = m51583v;
                this.f91903u = loadMoreInfo;
                this.f91904v = str;
                this.f91905w = m51583v;
                str2 = "recentWatchedItems";
                this.f91906x = "recentWatchedItems";
                this.f91907y = m51583v;
                this.f91908z = 1;
                mo50541D = interfaceC30248b.mo50541D(20, this);
                if (mo50541D == m142578e) {
                    return m142578e;
                }
                aVar = m51583v;
                aVar2 = aVar;
            }
            m131214n03 = AbstractC25332a0.m131214n0((Iterable) mo50541D, ",", null, null, 0, null, a.f91909q, 30, null);
            C9447a.a.m51566g(aVar, str2, m131214n03, false, 4, null);
            if (loadMoreInfo != null) {
                C25093p.a aVar6 = C25093p.Companion;
                m131214n04 = AbstractC25332a0.m131214n0(aVar6.m130106b(str), ",", null, null, 0, null, null, 62, null);
                C9447a.a aVar7 = m51583v;
                C9447a.a.m51566g(aVar7, "remainingItems", m131214n04, false, 4, null);
                m131214n05 = AbstractC25332a0.m131214n0(aVar6.m130105a(str), ",", null, null, 0, null, null, 62, null);
                C9447a.a.m51566g(aVar7, "filteredItems", m131214n05, false, 4, null);
            }
            ForUData.C9400b c9400b = new ForUData.C9400b();
            this.f91902t = null;
            this.f91903u = null;
            this.f91904v = null;
            this.f91905w = null;
            this.f91906x = null;
            this.f91907y = null;
            this.f91908z = 2;
            m51581t = aVar2.m51581t(c9400b, this);
            if (m51581t == m142578e) {
                return m142578e;
            }
            ForUData forUData2 = (ForUData) m51581t;
            Section m50946d2 = forUData2.m50946d();
            List m51168m2 = forUData2.m50946d().m51168m();
            ArrayList arrayList2 = new ArrayList();
            while (r4.hasNext()) {
            }
            m50946d2.m51172q(arrayList2);
            it = forUData2.m50946d().m51168m().iterator();
            while (it.hasNext()) {
            }
            C19205a.m100677S(C19205a.f95429a, forUData2.m50946d().m51168m(), "for_you", null, 4, null);
            return m51581t;
        }

        /* renamed from: r */
        public final Continuation m96671r(Continuation continuation) {
            return new a0(this.f91899B, this.f91900C, this.f91901D, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((a0) m96671r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: e10.h$a1 */
    /* loaded from: classes5.dex */
    static final class a1 extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f91910t;

        /* renamed from: v */
        final /* synthetic */ LoadMoreInfo f91912v;

        /* renamed from: w */
        final /* synthetic */ String f91913w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a1(LoadMoreInfo loadMoreInfo, String str, Continuation continuation) {
            super(1, continuation);
            this.f91912v = loadMoreInfo;
            this.f91913w = str;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            int i11;
            m142578e = AbstractC28298d.m142578e();
            int i12 = this.f91910t;
            if (i12 != 0) {
                if (i12 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C9447a.a m51593a = C9447a.Companion.m51593a(C18171h.this, "v1/channel/core/get/collection");
                if (this.f91912v != null) {
                    i11 = 880078;
                } else {
                    i11 = 880079;
                }
                C9447a.a m51579p = C9447a.a.m51566g(m51593a.m51583v(i11), "id", this.f91913w, false, 4, null).m51579p(this.f91912v);
                LoadMoreInfo loadMoreInfo = this.f91912v;
                boolean z11 = false;
                if (loadMoreInfo != null && loadMoreInfo.isValid()) {
                    z11 = true;
                }
                CollectionVideo.C9384b c9384b = new CollectionVideo.C9384b(z11);
                this.f91910t = 1;
                obj = m51579p.m51581t(c9384b, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            return obj;
        }

        /* renamed from: r */
        public final Continuation m96674r(Continuation continuation) {
            return new a1(this.f91912v, this.f91913w, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((a1) m96674r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e10.h$a2 */
    /* loaded from: classes5.dex */
    public static final class a2 extends AbstractC29096d {

        /* renamed from: s */
        Object f91914s;

        /* renamed from: t */
        Object f91915t;

        /* renamed from: u */
        Object f91916u;

        /* renamed from: v */
        /* synthetic */ Object f91917v;

        /* renamed from: x */
        int f91919x;

        a2(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f91917v = obj;
            this.f91919x |= Integer.MIN_VALUE;
            return C18171h.this.m96667b1(null, null, this);
        }
    }

    /* renamed from: e10.h$b */
    /* loaded from: classes5.dex */
    static final class b extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f91920t;

        /* renamed from: v */
        final /* synthetic */ String f91922v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, Continuation continuation) {
            super(1, continuation);
            this.f91922v = str;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f91920t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC24862s.m129228b(obj);
            C9447a.a m51566g = C9447a.a.m51566g(C9447a.a.m51566g(C9447a.Companion.m51596d(C18171h.this, "v1/user/my/do/block").m51583v(880039), "id", this.f91922v, false, 4, null), "objectType", "1", false, 4, null);
            this.f91920t = 1;
            Object m51580s = m51566g.m51580s(this);
            if (m51580s == m142578e) {
                return m142578e;
            }
            return m51580s;
        }

        /* renamed from: r */
        public final Continuation m96676r(Continuation continuation) {
            return new b(this.f91922v, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((b) m96676r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: e10.h$b0 */
    /* loaded from: classes5.dex */
    static final class b0 extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f91923t;

        /* renamed from: v */
        final /* synthetic */ LoadMoreInfo f91925v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b0(LoadMoreInfo loadMoreInfo, Continuation continuation) {
            super(1, continuation);
            this.f91925v = loadMoreInfo;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f91923t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C9447a.a m51579p = C9447a.Companion.m51593a(C18171h.this, "v1/home/friend/get/list").m51579p(this.f91925v);
                KSerializer serializer = FriendData.Companion.serializer();
                this.f91923t = 1;
                obj = m51579p.m51581t(serializer, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            return obj;
        }

        /* renamed from: r */
        public final Continuation m96678r(Continuation continuation) {
            return new b0(this.f91925v, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((b0) m96678r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: e10.h$b1 */
    /* loaded from: classes5.dex */
    static final class b1 extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f91926t;

        /* renamed from: v */
        final /* synthetic */ LoadMoreInfo f91928v;

        /* renamed from: w */
        final /* synthetic */ String f91929w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b1(LoadMoreInfo loadMoreInfo, String str, Continuation continuation) {
            super(1, continuation);
            this.f91928v = loadMoreInfo;
            this.f91929w = str;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            int i11;
            String m127189r0;
            int m131511r;
            m142578e = AbstractC28298d.m142578e();
            int i12 = this.f91926t;
            if (i12 != 0) {
                if (i12 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C9447a.a m51593a = C9447a.Companion.m51593a(C18171h.this, "v1/video/core/get/list_by_hashtag");
                if (this.f91928v != null) {
                    i11 = 880055;
                } else {
                    i11 = 880054;
                }
                C9447a.a m51583v = m51593a.m51583v(i11);
                m127189r0 = AbstractC24342w.m127189r0(this.f91929w, "#");
                C9447a.a m51579p = C9447a.a.m51566g(m51583v, "hashtag", m127189r0, false, 4, null).m51579p(this.f91928v);
                Section.C9424a c9424a = new Section.C9424a(new VideoData.C9437b());
                this.f91926t = 1;
                obj = m51579p.m51581t(c9424a, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            Section section = (Section) obj;
            List m51168m = section.m51168m();
            m131511r = AbstractC25370t.m131511r(m51168m, 10);
            ArrayList arrayList = new ArrayList(m131511r);
            Iterator it = m51168m.iterator();
            while (it.hasNext()) {
                arrayList.add(new Video((VideoData) it.next()));
            }
            Section section2 = new Section(arrayList, section.m51170o(), section.m51169n());
            List m51168m2 = section2.m51168m();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : m51168m2) {
                if (((Video) obj2).m52905o0()) {
                    arrayList2.add(obj2);
                }
            }
            section2.m51172q(arrayList2);
            Iterator it2 = section2.m51168m().iterator();
            while (it2.hasNext()) {
                ((Video) it2.next()).m52868T0("hashtag");
            }
            C19205a.m100677S(C19205a.f95429a, section2.m51168m(), "hashtag", null, 4, null);
            return section2;
        }

        /* renamed from: r */
        public final Continuation m96680r(Continuation continuation) {
            return new b1(this.f91928v, this.f91929w, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((b1) m96680r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: e10.h$b2 */
    /* loaded from: classes5.dex */
    static final class b2 extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f91930t;

        /* renamed from: v */
        final /* synthetic */ String f91932v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b2(String str, Continuation continuation) {
            super(1, continuation);
            this.f91932v = str;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            Object m51581t;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f91930t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                    m51581t = obj;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C9447a.a m51566g = C9447a.a.m51566g(C9447a.a.m51566g(C9447a.Companion.m51596d(C18171h.this, "v1/user/my/do/unblock").m51583v(880040), "id", this.f91932v, false, 4, null), "objectType", "2", false, 4, null);
                KSerializer serializer = PersonalizeChannel.Companion.serializer();
                this.f91930t = 1;
                m51581t = m51566g.m51581t(serializer, this);
                if (m51581t == m142578e) {
                    return m142578e;
                }
            }
            ChannelReceiver.Companion.m53694a(this.f91932v, (PersonalizeChannel) m51581t);
            return m51581t;
        }

        /* renamed from: r */
        public final Continuation m96682r(Continuation continuation) {
            return new b2(this.f91932v, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((b2) m96682r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: e10.h$c */
    /* loaded from: classes5.dex */
    static final class c extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f91933t;

        /* renamed from: v */
        final /* synthetic */ boolean f91935v;

        /* renamed from: w */
        final /* synthetic */ String f91936w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(boolean z11, String str, Continuation continuation) {
            super(1, continuation);
            this.f91935v = z11;
            this.f91936w = str;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            String str;
            int i11;
            m142578e = AbstractC28298d.m142578e();
            int i12 = this.f91933t;
            if (i12 != 0) {
                if (i12 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C9447a.b bVar = C9447a.Companion;
                C18171h c18171h = C18171h.this;
                if (this.f91935v) {
                    str = "v1/video/user/add/to_bookmark";
                } else {
                    str = "v1/video/user/remove/from_bookmark";
                }
                C9447a.a m51596d = bVar.m51596d(c18171h, str);
                if (this.f91935v) {
                    i11 = 880020;
                } else {
                    i11 = 880021;
                }
                C9447a.a m51566g = C9447a.a.m51566g(m51596d.m51583v(i11), "id", this.f91936w, false, 4, null);
                this.f91933t = 1;
                obj = m51566g.m51580s(this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            InterfaceC29283d.a.m146384a(AbstractC28684a.Companion.m143692z(), this.f91936w, AbstractC29094b.m145339a(this.f91935v), null, 4, null);
            return obj;
        }

        /* renamed from: r */
        public final Continuation m96684r(Continuation continuation) {
            return new c(this.f91935v, this.f91936w, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((c) m96684r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: e10.h$c0 */
    /* loaded from: classes5.dex */
    static final class c0 extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f91937t;

        c0(Continuation continuation) {
            super(1, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f91937t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C9447a.a m51593a = C9447a.Companion.m51593a(C18171h.this, "v1/setting/core/get/popup_noti");
                KSerializer serializer = InAppNotification.Companion.serializer();
                this.f91937t = 1;
                obj = m51593a.m51581t(serializer, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            return obj;
        }

        /* renamed from: r */
        public final Continuation m96686r(Continuation continuation) {
            return new c0(continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((c0) m96686r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: e10.h$c1 */
    /* loaded from: classes5.dex */
    static final class c1 extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f91939t;

        /* renamed from: v */
        final /* synthetic */ String f91941v;

        /* renamed from: w */
        final /* synthetic */ LoadMoreInfo f91942w;

        /* renamed from: x */
        final /* synthetic */ String f91943x;

        /* renamed from: y */
        final /* synthetic */ Integer f91944y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c1(String str, LoadMoreInfo loadMoreInfo, String str2, Integer num, Continuation continuation) {
            super(1, continuation);
            this.f91941v = str;
            this.f91942w = loadMoreInfo;
            this.f91943x = str2;
            this.f91944y = num;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            int m131511r;
            String str;
            PagingLoadMoreInfo pagingLoadMoreInfo;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f91939t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C9447a.a m51579p = C9447a.a.m51566g(C9447a.Companion.m51593a(C18171h.this, ""), "channelId", this.f91941v, false, 4, null).m51579p(this.f91942w);
                String str2 = this.f91943x;
                Integer num = this.f91944y;
                m51579p.m51584w("v1/video/core/get/list_previous_video");
                if (str2 != null) {
                    C9447a.a.m51566g(m51579p, "videoId", str2, false, 4, null);
                }
                if (num != null) {
                    C9447a.a.m51566g(m51579p, "maxPage", String.valueOf(num.intValue()), false, 4, null);
                }
                Section.C9424a c9424a = new Section.C9424a(new VideoData.C9437b());
                this.f91939t = 1;
                obj = m51579p.m51581t(c9424a, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            Section section = (Section) obj;
            List m51168m = section.m51168m();
            m131511r = AbstractC25370t.m131511r(m51168m, 10);
            ArrayList arrayList = new ArrayList(m131511r);
            Iterator it = m51168m.iterator();
            while (it.hasNext()) {
                arrayList.add(new Video((VideoData) it.next()));
            }
            Section section2 = new Section(arrayList, section.m51170o(), section.m51169n());
            String str3 = this.f91941v;
            LoadMoreInfo loadMoreInfo = this.f91942w;
            Channel m140377a = C27417l.f129055a.m140377a();
            PagingLoadMoreInfo pagingLoadMoreInfo2 = null;
            if (m140377a != null) {
                str = m140377a.m50769l();
            } else {
                str = null;
            }
            if (!AbstractC19074t.m100204b(str, str3)) {
                List m51168m2 = section2.m51168m();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : m51168m2) {
                    if (((Video) obj2).m52905o0()) {
                        arrayList2.add(obj2);
                    }
                }
                section2.m51172q(arrayList2);
                Iterator it2 = section2.m51168m().iterator();
                while (it2.hasNext()) {
                    ((Video) it2.next()).m52868T0("channel_profile_full");
                }
                C19205a.m100677S(C19205a.f95429a, section2.m51168m(), "channel_profile_full", null, 4, null);
            } else {
                Iterator it3 = section2.m51168m().iterator();
                while (it3.hasNext()) {
                    ((Video) it3.next()).m52868T0("my_profile");
                }
                C19205a.m100677S(C19205a.f95429a, section2.m51168m(), "my_profile", null, 4, null);
            }
            LoadMoreInfo m51171p = section2.m51171p();
            if (m51171p instanceof PagingLoadMoreInfo) {
                pagingLoadMoreInfo = (PagingLoadMoreInfo) m51171p;
            } else {
                pagingLoadMoreInfo = null;
            }
            if (pagingLoadMoreInfo != null) {
                if (loadMoreInfo instanceof PagingLoadMoreInfo) {
                    pagingLoadMoreInfo2 = (PagingLoadMoreInfo) loadMoreInfo;
                }
                if (pagingLoadMoreInfo2 != null) {
                    section2.m51173t(PagingLoadMoreInfo.m51091b(pagingLoadMoreInfo, false, null, null, pagingLoadMoreInfo2.m51098g(), null, 23, null));
                }
            }
            return section2;
        }

        /* renamed from: r */
        public final Continuation m96688r(Continuation continuation) {
            return new c1(this.f91941v, this.f91942w, this.f91943x, this.f91944y, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((c1) m96688r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: e10.h$c2 */
    /* loaded from: classes5.dex */
    static final class c2 extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f91945t;

        /* renamed from: v */
        final /* synthetic */ String f91947v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c2(String str, Continuation continuation) {
            super(1, continuation);
            this.f91947v = str;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f91945t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC24862s.m129228b(obj);
            C9447a.a m51566g = C9447a.a.m51566g(C9447a.a.m51566g(C9447a.Companion.m51596d(C18171h.this, "v1/user/my/do/unblock").m51583v(880040), "id", this.f91947v, false, 4, null), "objectType", "1", false, 4, null);
            this.f91945t = 1;
            Object m51580s = m51566g.m51580s(this);
            if (m51580s == m142578e) {
                return m142578e;
            }
            return m51580s;
        }

        /* renamed from: r */
        public final Continuation m96690r(Continuation continuation) {
            return new c2(this.f91947v, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((c2) m96690r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: e10.h$d */
    /* loaded from: classes5.dex */
    static final class d extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        Object f91948t;

        /* renamed from: u */
        int f91949u;

        /* renamed from: w */
        final /* synthetic */ String f91951w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, Continuation continuation) {
            super(1, continuation);
            this.f91951w = str;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f91949u;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        UserProfileResult userProfileResult = (UserProfileResult) this.f91948t;
                        AbstractC24862s.m129228b(obj);
                        return userProfileResult;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                C9447a.a m51566g = C9447a.a.m51566g(C9447a.Companion.m51596d(C18171h.this, "v1/channel/my/update/avatar").m51583v(880037), "avatar", this.f91951w, false, 4, null);
                UserProfileResult.C9433a c9433a = new UserProfileResult.C9433a();
                this.f91949u = 1;
                obj = m51566g.m51581t(c9433a, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            UserProfileResult userProfileResult2 = (UserProfileResult) obj;
            C18171h c18171h = C18171h.this;
            User m51258b = userProfileResult2.m51258b();
            Channel m51257a = userProfileResult2.m51257a();
            this.f91948t = userProfileResult2;
            this.f91949u = 2;
            if (c18171h.m96667b1(m51258b, m51257a, this) == m142578e) {
                return m142578e;
            }
            return userProfileResult2;
        }

        /* renamed from: r */
        public final Continuation m96692r(Continuation continuation) {
            return new d(this.f91951w, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((d) m96692r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: e10.h$d0 */
    /* loaded from: classes5.dex */
    static final class d0 extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f91952t;

        /* renamed from: v */
        final /* synthetic */ String f91954v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d0(String str, Continuation continuation) {
            super(1, continuation);
            this.f91954v = str;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f91952t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C9447a.a m51593a = C9447a.Companion.m51593a(C18171h.this, "v1/setting/core/get/latest_value");
                String str = this.f91954v;
                if (str != null) {
                    C9447a.a.m51566g(m51593a, "objectType", str, false, 4, null);
                }
                C9447a.a m51583v = m51593a.m51583v(880077);
                KSerializer serializer = InteractNotificationLatestValue.Companion.serializer();
                this.f91952t = 1;
                obj = m51583v.m51581t(serializer, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            return obj;
        }

        /* renamed from: r */
        public final Continuation m96694r(Continuation continuation) {
            return new d0(this.f91954v, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((d0) m96694r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: e10.h$d1 */
    /* loaded from: classes5.dex */
    static final class d1 extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f91955t;

        /* renamed from: v */
        final /* synthetic */ LoadMoreInfo f91957v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d1(LoadMoreInfo loadMoreInfo, Continuation continuation) {
            super(1, continuation);
            this.f91957v = loadMoreInfo;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            int i11;
            int m131511r;
            m142578e = AbstractC28298d.m142578e();
            int i12 = this.f91955t;
            if (i12 != 0) {
                if (i12 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C9447a.a m51593a = C9447a.Companion.m51593a(C18171h.this, "v1/user/my/get/list_liked_video");
                if (this.f91957v != null) {
                    i11 = 880057;
                } else {
                    i11 = 880056;
                }
                C9447a.a m51579p = m51593a.m51583v(i11).m51579p(this.f91957v);
                Section.C9424a c9424a = new Section.C9424a(new VideoData.C9437b());
                this.f91955t = 1;
                obj = m51579p.m51581t(c9424a, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            Section section = (Section) obj;
            List m51168m = section.m51168m();
            m131511r = AbstractC25370t.m131511r(m51168m, 10);
            ArrayList arrayList = new ArrayList(m131511r);
            Iterator it = m51168m.iterator();
            while (it.hasNext()) {
                arrayList.add(new Video((VideoData) it.next()));
            }
            Section section2 = new Section(arrayList, section.m51170o(), section.m51169n());
            List m51168m2 = section2.m51168m();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : m51168m2) {
                if (((Video) obj2).m52905o0()) {
                    arrayList2.add(obj2);
                }
            }
            section2.m51172q(arrayList2);
            InterfaceC29283d m143692z = AbstractC28684a.Companion.m143692z();
            for (Video video : section2.m51168m()) {
                video.m52868T0("liked_video");
                m143692z.mo146382u(video.m52911t(), AbstractC29094b.m145339a(true), AbstractC29094b.m145342d(video.m52839D()));
            }
            return section2;
        }

        /* renamed from: r */
        public final Continuation m96696r(Continuation continuation) {
            return new d1(this.f91957v, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((d1) m96696r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: e10.h$d2 */
    /* loaded from: classes5.dex */
    static final class d2 extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f91958t;

        /* renamed from: v */
        final /* synthetic */ String f91960v;

        /* renamed from: w */
        final /* synthetic */ String f91961w;

        /* renamed from: x */
        final /* synthetic */ String f91962x;

        /* renamed from: y */
        final /* synthetic */ String f91963y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d2(String str, String str2, String str3, String str4, Continuation continuation) {
            super(1, continuation);
            this.f91960v = str;
            this.f91961w = str2;
            this.f91962x = str3;
            this.f91963y = str4;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f91958t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C9447a.a m51596d = C9447a.Companion.m51596d(C18171h.this, "v1/channel/user/do/unfollow");
                String str = this.f91960v;
                String str2 = this.f91961w;
                String str3 = this.f91962x;
                String str4 = this.f91963y;
                C9447a.a.m51566g(m51596d, "id", str, false, 4, null);
                if (str2 != null) {
                    C9447a.a.m51566g(m51596d, "adId", str2, false, 4, null);
                }
                if (str3 != null) {
                    C9447a.a.m51566g(m51596d, "adSrc", str3, false, 4, null);
                }
                if (str4 != null) {
                    C9447a.a.m51566g(m51596d, "liveId", str4, false, 4, null);
                }
                C9447a.a m51583v = m51596d.m51583v(880024);
                KSerializer serializer = PersonalizeChannel.Companion.serializer();
                this.f91958t = 1;
                obj = m51583v.m51581t(serializer, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            ChannelReceiver.Companion.m53696c(this.f91960v, (PersonalizeChannel) obj);
            return obj;
        }

        /* renamed from: r */
        public final Continuation m96698r(Continuation continuation) {
            return new d2(this.f91960v, this.f91961w, this.f91962x, this.f91963y, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((d2) m96698r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: e10.h$e */
    /* loaded from: classes5.dex */
    static final class e extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        Object f91964t;

        /* renamed from: u */
        int f91965u;

        /* renamed from: w */
        final /* synthetic */ String f91967w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, Continuation continuation) {
            super(1, continuation);
            this.f91967w = str;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f91965u;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        UserProfileResult userProfileResult = (UserProfileResult) this.f91964t;
                        AbstractC24862s.m129228b(obj);
                        return userProfileResult;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                C9447a.a m51566g = C9447a.a.m51566g(C9447a.Companion.m51596d(C18171h.this, "v1/channel/my/update/bio").m51583v(880036), "bio", this.f91967w, false, 4, null);
                UserProfileResult.C9433a c9433a = new UserProfileResult.C9433a();
                this.f91965u = 1;
                obj = m51566g.m51581t(c9433a, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            UserProfileResult userProfileResult2 = (UserProfileResult) obj;
            C18171h c18171h = C18171h.this;
            User m51258b = userProfileResult2.m51258b();
            Channel m51257a = userProfileResult2.m51257a();
            this.f91964t = userProfileResult2;
            this.f91965u = 2;
            if (c18171h.m96667b1(m51258b, m51257a, this) == m142578e) {
                return m142578e;
            }
            return userProfileResult2;
        }

        /* renamed from: r */
        public final Continuation m96700r(Continuation continuation) {
            return new e(this.f91967w, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((e) m96700r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: e10.h$e0 */
    /* loaded from: classes5.dex */
    static final class e0 extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f91968t;

        /* renamed from: v */
        final /* synthetic */ LoadMoreInfo f91970v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e0(LoadMoreInfo loadMoreInfo, Continuation continuation) {
            super(1, continuation);
            this.f91970v = loadMoreInfo;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            int i11;
            m142578e = AbstractC28298d.m142578e();
            int i12 = this.f91968t;
            if (i12 != 0) {
                if (i12 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C9447a.a m51593a = C9447a.Companion.m51593a(C18171h.this, "v1/live/core/get/list");
                if (this.f91970v != null) {
                    i11 = 880097;
                } else {
                    i11 = 880096;
                }
                C9447a.a m51579p = m51593a.m51583v(i11).m51579p(this.f91970v);
                Section.C9424a c9424a = new Section.C9424a(new LivestreamData.C9405b());
                this.f91968t = 1;
                obj = m51579p.m51581t(c9424a, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            Iterator it = ((Section) obj).m51168m().iterator();
            while (it.hasNext()) {
                ((LivestreamData) it.next()).m51007Z("list_livestream");
            }
            return obj;
        }

        /* renamed from: r */
        public final Continuation m96702r(Continuation continuation) {
            return new e0(this.f91970v, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((e0) m96702r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: e10.h$e1 */
    /* loaded from: classes5.dex */
    static final class e1 extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f91971t;

        /* renamed from: v */
        final /* synthetic */ List f91973v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e1(List list, Continuation continuation) {
            super(1, continuation);
            this.f91973v = list;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            String m131214n0;
            Object m51581t;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f91971t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                    m51581t = obj;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C9447a.a m51593a = C9447a.Companion.m51593a(C18171h.this, "v1/video/user/get/list_video_personal");
                m131214n0 = AbstractC25332a0.m131214n0(this.f91973v, ",", null, null, 0, null, null, 62, null);
                C9447a.a m51583v = C9447a.a.m51566g(m51593a, "video_ids", m131214n0, false, 4, null).m51583v(880009);
                KSerializer m133617h = AbstractC25935a.m133617h(PersonalizeVideo.Companion.serializer());
                this.f91971t = 1;
                m51581t = m51583v.m51581t(m133617h, this);
                if (m51581t == m142578e) {
                    return m142578e;
                }
            }
            InterfaceC29283d m143692z = AbstractC28684a.Companion.m143692z();
            for (PersonalizeVideo personalizeVideo : (List) m51581t) {
                if (personalizeVideo.m52819h()) {
                    InterfaceC29283d.a.m146385b(m143692z, personalizeVideo.m52813b(), AbstractC29094b.m145339a(true), null, 4, null);
                }
                if (personalizeVideo.m52817f()) {
                    m143692z.mo146375n(personalizeVideo.m52812a(), true);
                }
            }
            return m51581t;
        }

        /* renamed from: r */
        public final Continuation m96704r(Continuation continuation) {
            return new e1(this.f91973v, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((e1) m96704r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: e10.h$e2 */
    /* loaded from: classes5.dex */
    static final class e2 extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f91974t;

        /* renamed from: v */
        final /* synthetic */ String f91976v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e2(String str, Continuation continuation) {
            super(1, continuation);
            this.f91976v = str;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f91974t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C9447a.a m51566g = C9447a.a.m51566g(C9447a.Companion.m51596d(C18171h.this, "v1/channel/user/do/uninterested").m51583v(880019), "id", this.f91976v, false, 4, null);
                this.f91974t = 1;
                obj = m51566g.m51580s(this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            return obj;
        }

        /* renamed from: r */
        public final Continuation m96706r(Continuation continuation) {
            return new e2(this.f91976v, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((e2) m96706r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: e10.h$f */
    /* loaded from: classes5.dex */
    static final class f extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        Object f91977t;

        /* renamed from: u */
        int f91978u;

        /* renamed from: w */
        final /* synthetic */ String f91980w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, Continuation continuation) {
            super(1, continuation);
            this.f91980w = str;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f91978u;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        UserProfileResult userProfileResult = (UserProfileResult) this.f91977t;
                        AbstractC24862s.m129228b(obj);
                        return userProfileResult;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                C9447a.a m51566g = C9447a.a.m51566g(C9447a.Companion.m51596d(C18171h.this, "v1/channel/my/update/alias").m51583v(880035), "alias", this.f91980w, false, 4, null);
                UserProfileResult.C9433a c9433a = new UserProfileResult.C9433a();
                this.f91978u = 1;
                obj = m51566g.m51581t(c9433a, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            UserProfileResult userProfileResult2 = (UserProfileResult) obj;
            C18171h c18171h = C18171h.this;
            User m51258b = userProfileResult2.m51258b();
            Channel m51257a = userProfileResult2.m51257a();
            this.f91977t = userProfileResult2;
            this.f91978u = 2;
            if (c18171h.m96667b1(m51258b, m51257a, this) == m142578e) {
                return m142578e;
            }
            return userProfileResult2;
        }

        /* renamed from: r */
        public final Continuation m96708r(Continuation continuation) {
            return new f(this.f91980w, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((f) m96708r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: e10.h$f0 */
    /* loaded from: classes5.dex */
    static final class f0 extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f91981t;

        /* renamed from: v */
        final /* synthetic */ String f91983v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f0(String str, Continuation continuation) {
            super(1, continuation);
            this.f91983v = str;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f91981t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C9447a.a m51566g = C9447a.a.m51566g(C9447a.Companion.m51593a(C18171h.this, "v1/live/core/get/detail").m51583v(880098), "id", this.f91983v, false, 4, null);
                LivestreamData.C9405b c9405b = new LivestreamData.C9405b();
                this.f91981t = 1;
                obj = m51566g.m51581t(c9405b, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            return obj;
        }

        /* renamed from: r */
        public final Continuation m96710r(Continuation continuation) {
            return new f0(this.f91983v, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((f0) m96710r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: e10.h$f1 */
    /* loaded from: classes5.dex */
    static final class f1 extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f91984t;

        /* renamed from: v */
        final /* synthetic */ String f91986v;

        /* renamed from: w */
        final /* synthetic */ LoadMoreInfo f91987w;

        /* renamed from: x */
        final /* synthetic */ String f91988x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f1(String str, LoadMoreInfo loadMoreInfo, String str2, Continuation continuation) {
            super(1, continuation);
            this.f91986v = str;
            this.f91987w = loadMoreInfo;
            this.f91988x = str2;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            int i11;
            int m131511r;
            m142578e = AbstractC28298d.m142578e();
            int i12 = this.f91984t;
            if (i12 != 0) {
                if (i12 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C9447a.a m51579p = C9447a.a.m51566g(C9447a.Companion.m51593a(C18171h.this, "v1/video/core/get/list_similar"), "id", this.f91986v, false, 4, null).m51579p(this.f91987w);
                if (this.f91987w != null) {
                    i11 = 880006;
                } else {
                    i11 = 880005;
                }
                C9447a.a m51583v = m51579p.m51583v(i11);
                Section.C9424a c9424a = new Section.C9424a(new VideoData.C9437b());
                this.f91984t = 1;
                obj = m51583v.m51581t(c9424a, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            Section section = (Section) obj;
            List m51168m = section.m51168m();
            m131511r = AbstractC25370t.m131511r(m51168m, 10);
            ArrayList arrayList = new ArrayList(m131511r);
            Iterator it = m51168m.iterator();
            while (it.hasNext()) {
                arrayList.add(new Video((VideoData) it.next()));
            }
            Section section2 = new Section(arrayList, section.m51170o(), section.m51169n());
            String str = this.f91988x;
            String str2 = this.f91986v;
            List m51168m2 = section2.m51168m();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : m51168m2) {
                if (((Video) obj2).m52905o0()) {
                    arrayList2.add(obj2);
                }
            }
            section2.m51172q(arrayList2);
            for (Video video : section2.m51168m()) {
                video.m52868T0(str);
                video.m52848I0(str2);
            }
            C19205a.m100677S(C19205a.f95429a, section2.m51168m(), str, null, 4, null);
            return section2;
        }

        /* renamed from: r */
        public final Continuation m96712r(Continuation continuation) {
            return new f1(this.f91986v, this.f91987w, this.f91988x, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((f1) m96712r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: e10.h$f2 */
    /* loaded from: classes5.dex */
    static final class f2 extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f91989t;

        /* renamed from: v */
        final /* synthetic */ String f91991v;

        /* renamed from: w */
        final /* synthetic */ String f91992w;

        /* renamed from: x */
        final /* synthetic */ String f91993x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f2(String str, String str2, String str3, Continuation continuation) {
            super(1, continuation);
            this.f91991v = str;
            this.f91992w = str2;
            this.f91993x = str3;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f91989t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C9447a.a m51583v = C9447a.Companion.m51596d(C18171h.this, "v1/video/user/do/uninterested").m51583v(880014);
                String str = this.f91991v;
                String str2 = this.f91992w;
                String str3 = this.f91993x;
                C9447a.a.m51566g(m51583v, "id", str, false, 4, null);
                if (str2 != null) {
                    C9447a.a.m51566g(m51583v, "hashtags", str2, false, 4, null);
                }
                if (str3 != null) {
                    C9447a.a.m51566g(m51583v, "feedbackIds", str3, false, 4, null);
                }
                this.f91989t = 1;
                obj = m51583v.m51580s(this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            return obj;
        }

        /* renamed from: r */
        public final Continuation m96714r(Continuation continuation) {
            return new f2(this.f91991v, this.f91992w, this.f91993x, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((f2) m96714r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: e10.h$g */
    /* loaded from: classes5.dex */
    static final class g extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        Object f91994t;

        /* renamed from: u */
        int f91995u;

        /* renamed from: w */
        final /* synthetic */ String f91997w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(String str, Continuation continuation) {
            super(1, continuation);
            this.f91997w = str;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f91995u;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        UserProfileResult userProfileResult = (UserProfileResult) this.f91994t;
                        AbstractC24862s.m129228b(obj);
                        return userProfileResult;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                C9447a.a m51566g = C9447a.a.m51566g(C9447a.Companion.m51596d(C18171h.this, "v1/channel/my/update/name").m51583v(880034), "name", this.f91997w, false, 4, null);
                UserProfileResult.C9433a c9433a = new UserProfileResult.C9433a();
                this.f91995u = 1;
                obj = m51566g.m51581t(c9433a, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            UserProfileResult userProfileResult2 = (UserProfileResult) obj;
            C18171h c18171h = C18171h.this;
            User m51258b = userProfileResult2.m51258b();
            Channel m51257a = userProfileResult2.m51257a();
            this.f91994t = userProfileResult2;
            this.f91995u = 2;
            if (c18171h.m96667b1(m51258b, m51257a, this) == m142578e) {
                return m142578e;
            }
            return userProfileResult2;
        }

        /* renamed from: r */
        public final Continuation m96716r(Continuation continuation) {
            return new g(this.f91997w, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((g) m96716r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: e10.h$g0 */
    /* loaded from: classes5.dex */
    static final class g0 extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f91998t;

        /* renamed from: v */
        final /* synthetic */ List f92000v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g0(List list, Continuation continuation) {
            super(1, continuation);
            this.f92000v = list;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            String m131214n0;
            Object m51581t;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f91998t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                    m51581t = obj;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C9447a.a m51593a = C9447a.Companion.m51593a(C18171h.this, "v1/live/user/get/list_personal");
                m131214n0 = AbstractC25332a0.m131214n0(this.f92000v, ",", null, null, 0, null, null, 62, null);
                C9447a.a m51583v = C9447a.a.m51566g(m51593a, "live_ids", m131214n0, false, 4, null).m51583v(880099);
                KSerializer m133617h = AbstractC25935a.m133617h(PersonalizeStream.Companion.serializer());
                this.f91998t = 1;
                m51581t = m51583v.m51581t(m133617h, this);
                if (m51581t == m142578e) {
                    return m142578e;
                }
            }
            InterfaceC29283d m143692z = AbstractC28684a.Companion.m143692z();
            for (PersonalizeStream personalizeStream : (List) m51581t) {
                if (personalizeStream.m51119f()) {
                    m143692z.mo146375n(personalizeStream.m51114a(), true);
                }
            }
            return m51581t;
        }

        /* renamed from: r */
        public final Continuation m96718r(Continuation continuation) {
            return new g0(this.f92000v, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((g0) m96718r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: e10.h$g1 */
    /* loaded from: classes5.dex */
    static final class g1 extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f92001t;

        /* renamed from: v */
        final /* synthetic */ String f92003v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g1(String str, Continuation continuation) {
            super(1, continuation);
            this.f92003v = str;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f92001t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C9447a.a m51566g = C9447a.a.m51566g(C9447a.Companion.m51596d(C18171h.this, "v1/comment/user/do/like").m51583v(880047), "id", this.f92003v, false, 4, null);
                this.f92001t = 1;
                obj = m51566g.m51580s(this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            return obj;
        }

        /* renamed from: r */
        public final Continuation m96720r(Continuation continuation) {
            return new g1(this.f92003v, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((g1) m96720r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: e10.h$g2 */
    /* loaded from: classes5.dex */
    static final class g2 extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f92004t;

        /* renamed from: v */
        final /* synthetic */ String f92006v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g2(String str, Continuation continuation) {
            super(1, continuation);
            this.f92006v = str;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f92004t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C9447a.a m51566g = C9447a.a.m51566g(C9447a.Companion.m51596d(C18171h.this, "v1/comment/user/do/unlike").m51583v(880048), "id", this.f92006v, false, 4, null);
                this.f92004t = 1;
                obj = m51566g.m51580s(this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            return obj;
        }

        /* renamed from: r */
        public final Continuation m96722r(Continuation continuation) {
            return new g2(this.f92006v, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((g2) m96722r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: e10.h$h */
    /* loaded from: classes5.dex */
    static final class h extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f92007t;

        /* renamed from: v */
        final /* synthetic */ String f92009v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(String str, Continuation continuation) {
            super(1, continuation);
            this.f92009v = str;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f92007t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C9447a.a m51566g = C9447a.a.m51566g(C9447a.Companion.m51596d(C18171h.this, "v1/feedback/app/put/detail").m51583v(880038), "message", this.f92009v, false, 4, null);
                this.f92007t = 1;
                obj = m51566g.m51580s(this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            return obj;
        }

        /* renamed from: r */
        public final Continuation m96724r(Continuation continuation) {
            return new h(this.f92009v, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((h) m96724r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: e10.h$h0 */
    /* loaded from: classes5.dex */
    static final class h0 extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f92010t;

        /* renamed from: v */
        final /* synthetic */ String f92012v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h0(String str, Continuation continuation) {
            super(1, continuation);
            this.f92012v = str;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f92010t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C9447a.a m51583v = C9447a.a.m51566g(C9447a.Companion.m51593a(C18171h.this, "v1/video/core/get/location"), "data", this.f92012v, false, 4, null).m51583v(880091);
                VideoLocationData.C9439b c9439b = new VideoLocationData.C9439b();
                this.f92010t = 1;
                obj = m51583v.m51581t(c9439b, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            VideoLocationData videoLocationData = (VideoLocationData) obj;
            Section m51390c = videoLocationData.m51390c();
            List m51168m = videoLocationData.m51390c().m51168m();
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : m51168m) {
                if (((Video) obj2).m52905o0()) {
                    arrayList.add(obj2);
                }
            }
            m51390c.m51172q(arrayList);
            Iterator it = videoLocationData.m51390c().m51168m().iterator();
            while (it.hasNext()) {
                ((Video) it.next()).m52868T0(ZVideoUtilMetadata.ZMETADATA_KEY_LOCATION);
            }
            C19205a.m100677S(C19205a.f95429a, videoLocationData.m51390c().m51168m(), ZVideoUtilMetadata.ZMETADATA_KEY_LOCATION, null, 4, null);
            return obj;
        }

        /* renamed from: r */
        public final Continuation m96726r(Continuation continuation) {
            return new h0(this.f92012v, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((h0) m96726r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: e10.h$h1 */
    /* loaded from: classes5.dex */
    static final class h1 extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f92013t;

        /* renamed from: v */
        final /* synthetic */ String f92015v;

        /* renamed from: w */
        final /* synthetic */ String f92016w;

        /* renamed from: x */
        final /* synthetic */ String f92017x;

        /* renamed from: y */
        final /* synthetic */ Integer f92018y;

        /* renamed from: z */
        final /* synthetic */ Integer f92019z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h1(String str, String str2, String str3, Integer num, Integer num2, Continuation continuation) {
            super(1, continuation);
            this.f92015v = str;
            this.f92016w = str2;
            this.f92017x = str3;
            this.f92018y = num;
            this.f92019z = num2;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f92013t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C9447a.a m51596d = C9447a.Companion.m51596d(C18171h.this, "v1/video/user/do/like");
                String str = this.f92015v;
                String str2 = this.f92016w;
                String str3 = this.f92017x;
                Integer num = this.f92018y;
                Integer num2 = this.f92019z;
                C9447a.a.m51566g(m51596d, "id", str, false, 4, null);
                if (str2 != null) {
                    C9447a.a.m51566g(m51596d, "adId", str2, false, 4, null);
                }
                if (str3 != null) {
                    C9447a.a.m51566g(m51596d, "adSrc", str3, false, 4, null);
                }
                if (num != null) {
                    C9447a.a.m51566g(m51596d, "adIndex", String.valueOf(num.intValue()), false, 4, null);
                }
                if (num2 != null) {
                    C9447a.a.m51566g(m51596d, "numShowedAd", String.valueOf(num2.intValue()), false, 4, null);
                }
                C9447a.a m51583v = m51596d.m51583v(880007);
                this.f92013t = 1;
                obj = m51583v.m51580s(this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            InterfaceC29283d.a.m146385b(AbstractC28684a.Companion.m143692z(), this.f92015v, AbstractC29094b.m145339a(true), null, 4, null);
            return obj;
        }

        /* renamed from: r */
        public final Continuation m96728r(Continuation continuation) {
            return new h1(this.f92015v, this.f92016w, this.f92017x, this.f92018y, this.f92019z, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((h1) m96728r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: e10.h$h2 */
    /* loaded from: classes5.dex */
    static final class h2 extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f92020t;

        /* renamed from: v */
        final /* synthetic */ String f92022v;

        /* renamed from: w */
        final /* synthetic */ String f92023w;

        /* renamed from: x */
        final /* synthetic */ String f92024x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h2(String str, String str2, String str3, Continuation continuation) {
            super(1, continuation);
            this.f92022v = str;
            this.f92023w = str2;
            this.f92024x = str3;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f92020t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C9447a.a m51596d = C9447a.Companion.m51596d(C18171h.this, "v1/video/user/do/unlike");
                String str = this.f92022v;
                String str2 = this.f92023w;
                String str3 = this.f92024x;
                C9447a.a.m51566g(m51596d, "id", str, false, 4, null);
                if (str2 != null) {
                    C9447a.a.m51566g(m51596d, "adId", str2, false, 4, null);
                }
                if (str3 != null) {
                    C9447a.a.m51566g(m51596d, "adSrc", str3, false, 4, null);
                }
                C9447a.a m51583v = m51596d.m51583v(880008);
                this.f92020t = 1;
                obj = m51583v.m51580s(this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            InterfaceC29283d.a.m146385b(AbstractC28684a.Companion.m143692z(), this.f92022v, AbstractC29094b.m145339a(false), null, 4, null);
            return obj;
        }

        /* renamed from: r */
        public final Continuation m96730r(Continuation continuation) {
            return new h2(this.f92022v, this.f92023w, this.f92024x, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((h2) m96730r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: e10.h$i */
    /* loaded from: classes5.dex */
    static final class i extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: A */
        final /* synthetic */ Integer f92025A;

        /* renamed from: t */
        int f92026t;

        /* renamed from: v */
        final /* synthetic */ String f92028v;

        /* renamed from: w */
        final /* synthetic */ String f92029w;

        /* renamed from: x */
        final /* synthetic */ String f92030x;

        /* renamed from: y */
        final /* synthetic */ String f92031y;

        /* renamed from: z */
        final /* synthetic */ Integer f92032z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(String str, String str2, String str3, String str4, Integer num, Integer num2, Continuation continuation) {
            super(1, continuation);
            this.f92028v = str;
            this.f92029w = str2;
            this.f92030x = str3;
            this.f92031y = str4;
            this.f92032z = num;
            this.f92025A = num2;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f92026t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C9447a.a m51596d = C9447a.Companion.m51596d(C18171h.this, "v1/channel/user/do/follow");
                String str = this.f92028v;
                String str2 = this.f92029w;
                String str3 = this.f92030x;
                String str4 = this.f92031y;
                Integer num = this.f92032z;
                Integer num2 = this.f92025A;
                C9447a.a.m51566g(m51596d, "id", str, false, 4, null);
                if (str2 != null) {
                    C9447a.a.m51566g(m51596d, "adId", str2, false, 4, null);
                }
                if (str3 != null) {
                    C9447a.a.m51566g(m51596d, "adSrc", str3, false, 4, null);
                }
                if (str4 != null) {
                    C9447a.a.m51566g(m51596d, "liveId", str4, false, 4, null);
                }
                if (str3 != null) {
                    C9447a.a.m51566g(m51596d, "adSrc", str3, false, 4, null);
                }
                if (num != null) {
                    C9447a.a.m51566g(m51596d, "adIndex", String.valueOf(num.intValue()), false, 4, null);
                }
                if (num2 != null) {
                    C9447a.a.m51566g(m51596d, "numShowedAd", String.valueOf(num2.intValue()), false, 4, null);
                }
                C9447a.a m51583v = m51596d.m51583v(880023);
                KSerializer serializer = PersonalizeChannel.Companion.serializer();
                this.f92026t = 1;
                obj = m51583v.m51581t(serializer, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            ChannelReceiver.Companion.m53696c(this.f92028v, (PersonalizeChannel) obj);
            return obj;
        }

        /* renamed from: r */
        public final Continuation m96732r(Continuation continuation) {
            return new i(this.f92028v, this.f92029w, this.f92030x, this.f92031y, this.f92032z, this.f92025A, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((i) m96732r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: e10.h$i0 */
    /* loaded from: classes5.dex */
    static final class i0 extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f92033t;

        i0(Continuation continuation) {
            super(1, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f92033t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                Channel mo146342q = C18171h.this.f91891a.mo146342q();
                if (mo146342q != null) {
                    C18171h c18171h = C18171h.this;
                    String m50769l = mo146342q.m50769l();
                    this.f92033t = 1;
                    obj = c18171h.mo96550B0(m50769l, this);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                } else {
                    throw new NotExistsException(0, null, 3, null);
                }
            }
            return (Channel) obj;
        }

        /* renamed from: r */
        public final Continuation m96734r(Continuation continuation) {
            return new i0(continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((i0) m96734r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: e10.h$i1 */
    /* loaded from: classes5.dex */
    static final class i1 extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f92035t;

        /* renamed from: v */
        final /* synthetic */ boolean f92037v;

        /* renamed from: w */
        final /* synthetic */ String f92038w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i1(boolean z11, String str, Continuation continuation) {
            super(1, continuation);
            this.f92037v = z11;
            this.f92038w = str;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            String str;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f92035t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C9447a.b bVar = C9447a.Companion;
                C18171h c18171h = C18171h.this;
                if (this.f92037v) {
                    str = "v1/video/my/lock/comment";
                } else {
                    str = "v1/video/my/unlock/comment";
                }
                C9447a.a m51566g = C9447a.a.m51566g(bVar.m51596d(c18171h, str), "id", this.f92038w, false, 4, null);
                this.f92035t = 1;
                obj = m51566g.m51580s(this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            return obj;
        }

        /* renamed from: r */
        public final Continuation m96736r(Continuation continuation) {
            return new i1(this.f92037v, this.f92038w, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((i1) m96736r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: e10.h$i2 */
    /* loaded from: classes5.dex */
    static final class i2 extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f92039t;

        /* renamed from: v */
        final /* synthetic */ String f92041v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i2(String str, Continuation continuation) {
            super(1, continuation);
            this.f92041v = str;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f92039t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C9447a.a m51566g = C9447a.a.m51566g(C9447a.Companion.m51596d(C18171h.this, "v1/comment/user/do/unpin").m51583v(880086), "id", this.f92041v, false, 4, null);
                this.f92039t = 1;
                obj = m51566g.m51580s(this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            return obj;
        }

        /* renamed from: r */
        public final Continuation m96738r(Continuation continuation) {
            return new i2(this.f92041v, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((i2) m96738r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: e10.h$j */
    /* loaded from: classes5.dex */
    static final class j extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f92042t;

        /* renamed from: v */
        final /* synthetic */ LoadMoreInfo f92044v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(LoadMoreInfo loadMoreInfo, Continuation continuation) {
            super(1, continuation);
            this.f92044v = loadMoreInfo;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            int i11;
            m142578e = AbstractC28298d.m142578e();
            int i12 = this.f92042t;
            if (i12 != 0) {
                if (i12 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C9447a.a m51579p = C9447a.Companion.m51593a(C18171h.this, "v1/user/core/get/ads").m51579p(this.f92044v);
                String m107389e = AbstractC20626a.m107389e();
                String m107386b = AbstractC20626a.m107386b();
                C9447a.a.m51566g(m51579p, "deviceModel", C27417l.f129055a.m140385i(), false, 4, null);
                AbstractC19074t.m100205c(m107389e);
                C9447a.a.m51566g(m51579p, "networkType", m107389e, false, 4, null);
                AbstractC19074t.m100205c(m107386b);
                C9447a.a.m51566g(m51579p, "networkCarrier", m107386b, false, 4, null);
                if (this.f92044v != null) {
                    i11 = 880088;
                } else {
                    i11 = 880087;
                }
                C9447a.a m51583v = m51579p.m51583v(i11);
                Section.C9424a c9424a = new Section.C9424a(new VideoAdsData.C9435b());
                this.f92042t = 1;
                obj = m51583v.m51581t(c9424a, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            return obj;
        }

        /* renamed from: r */
        public final Continuation m96740r(Continuation continuation) {
            return new j(this.f92044v, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((j) m96740r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: e10.h$j0 */
    /* loaded from: classes5.dex */
    public static final class j0 implements InterfaceC21769d {

        /* renamed from: a */
        final /* synthetic */ CancellableContinuation f92045a;

        j0(CancellableContinuation cancellableContinuation) {
            this.f92045a = cancellableContinuation;
        }

        @Override // km0.InterfaceC21769d
        /* renamed from: a */
        public void mo13651a(int i11, String str) {
            AbstractC19074t.m100208f(str, "errorMessage");
            CancellableContinuation cancellableContinuation = this.f92045a;
            C24861r.a aVar = C24861r.f119264q;
            cancellableContinuation.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(new RestException(i11, str))));
        }

        @Override // km0.InterfaceC21769d
        /* renamed from: b */
        public void mo13652b(EnumC21773h enumC21773h, Object obj) {
            AbstractC19074t.m100208f(enumC21773h, ZinstantMetaConstant.IMPRESSION_META_TYPE);
            AbstractC19074t.m100208f(obj, "result");
            if (enumC21773h == EnumC21773h.JSON) {
                try {
                    OauthResponse oauthResponse = (OauthResponse) C27417l.f129055a.m140384h().m139867d(OauthResponse.Companion.serializer(), obj.toString());
                    CancellableContinuation cancellableContinuation = this.f92045a;
                    C24861r.a aVar = C24861r.f119264q;
                    cancellableContinuation.mo112492g(C24861r.m129218b(oauthResponse.m51525a()));
                } catch (Throwable th2) {
                    CancellableContinuation cancellableContinuation2 = this.f92045a;
                    C24861r.a aVar2 = C24861r.f119264q;
                    cancellableContinuation2.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(new SerializeException(th2.getMessage()))));
                }
            }
        }
    }

    /* renamed from: e10.h$j1 */
    /* loaded from: classes5.dex */
    static final class j1 extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f92046t;

        j1(Continuation continuation) {
            super(1, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f92046t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C9447a.a m51594b = C9447a.Companion.m51594b(C18171h.this, "notification");
                KSerializer serializer = LongPollingResult.Companion.serializer();
                this.f92046t = 1;
                obj = m51594b.m51582u(serializer, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            return obj;
        }

        /* renamed from: r */
        public final Continuation m96742r(Continuation continuation) {
            return new j1(continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((j1) m96742r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: e10.h$j2 */
    /* loaded from: classes5.dex */
    static final class j2 extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f92048t;

        /* renamed from: v */
        final /* synthetic */ String f92050v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j2(String str, Continuation continuation) {
            super(1, continuation);
            this.f92050v = str;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f92048t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C9447a.a m51583v = C9447a.a.m51566g(C9447a.Companion.m51596d(C18171h.this, "v1/video/my/do/unpin"), "id", this.f92050v, false, 4, null).m51583v(880011);
                this.f92048t = 1;
                obj = m51583v.m51580s(this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            return obj;
        }

        /* renamed from: r */
        public final Continuation m96744r(Continuation continuation) {
            return new j2(this.f92050v, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((j2) m96744r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: e10.h$k */
    /* loaded from: classes5.dex */
    static final class k extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f92051t;

        /* renamed from: v */
        final /* synthetic */ LoadMoreInfo f92053v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(LoadMoreInfo loadMoreInfo, Continuation continuation) {
            super(1, continuation);
            this.f92053v = loadMoreInfo;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            int i11;
            m142578e = AbstractC28298d.m142578e();
            int i12 = this.f92051t;
            if (i12 != 0) {
                if (i12 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C9447a.a m51593a = C9447a.Companion.m51593a(C18171h.this, "v1/user/my/get/list_channel_blocked");
                if (this.f92053v != null) {
                    i11 = 880033;
                } else {
                    i11 = 880032;
                }
                C9447a.a m51579p = m51593a.m51583v(i11).m51579p(this.f92053v);
                Section.C9424a c9424a = new Section.C9424a(new Channel.C9382b());
                this.f92051t = 1;
                obj = m51579p.m51581t(c9424a, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            return obj;
        }

        /* renamed from: r */
        public final Continuation m96746r(Continuation continuation) {
            return new k(this.f92053v, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((k) m96746r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: e10.h$k0 */
    /* loaded from: classes5.dex */
    static final class k0 extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f92054t;

        /* renamed from: v */
        final /* synthetic */ String f92056v;

        /* renamed from: w */
        final /* synthetic */ LoadMoreInfo f92057w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k0(String str, LoadMoreInfo loadMoreInfo, Continuation continuation) {
            super(1, continuation);
            this.f92056v = str;
            this.f92057w = loadMoreInfo;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f92054t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C9447a.a m51579p = C9447a.a.m51566g(C9447a.Companion.m51593a(C18171h.this, "v1/search/core/get/by_keyword").m51583v(880061), "keyword", this.f92056v, false, 4, null).m51579p(this.f92057w);
                SearchAllResult.C9420a c9420a = new SearchAllResult.C9420a();
                this.f92054t = 1;
                obj = m51579p.m51581t(c9420a, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            Section m51139c = ((SearchAllResult) obj).m51139c();
            if (m51139c != null) {
                List m51168m = m51139c.m51168m();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : m51168m) {
                    if (((Video) obj2).m52905o0()) {
                        arrayList.add(obj2);
                    }
                }
                m51139c.m51172q(arrayList);
                Iterator it = m51139c.m51168m().iterator();
                while (it.hasNext()) {
                    ((Video) it.next()).m52868T0("search_all");
                }
            }
            return obj;
        }

        /* renamed from: r */
        public final Continuation m96748r(Continuation continuation) {
            return new k0(this.f92056v, this.f92057w, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((k0) m96748r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: e10.h$k1 */
    /* loaded from: classes5.dex */
    static final class k1 extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f92058t;

        /* renamed from: v */
        final /* synthetic */ String f92060v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k1(String str, Continuation continuation) {
            super(1, continuation);
            this.f92060v = str;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f92058t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C9447a.a m51566g = C9447a.a.m51566g(C9447a.Companion.m51596d(C18171h.this, "v1/comment/user/do/pin").m51583v(880085), "id", this.f92060v, false, 4, null);
                this.f92058t = 1;
                obj = m51566g.m51580s(this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            return obj;
        }

        /* renamed from: r */
        public final Continuation m96750r(Continuation continuation) {
            return new k1(this.f92060v, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((k1) m96750r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: e10.h$k2 */
    /* loaded from: classes5.dex */
    static final class k2 extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ String f92061q;

        /* renamed from: r */
        final /* synthetic */ C18171h f92062r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k2(String str, C18171h c18171h) {
            super(0);
            this.f92061q = str;
            this.f92062r = c18171h;
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0038, code lost:            if (r1.equals("jpg") != false) goto L16;     */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0024, code lost:            if (r1.equals("jpeg") != false) goto L16;     */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x003a, code lost:            r1 = "image/jpeg";     */
        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Flow mo12V4() {
            String m13926m;
            String str;
            File file = new File(this.f92061q);
            m13926m = AbstractC2942k.m13926m(file);
            int hashCode = m13926m.hashCode();
            if (hashCode != 105441) {
                if (hashCode != 111145) {
                    if (hashCode == 3268712) {
                    }
                } else if (m13926m.equals("png")) {
                    str = "image/png";
                }
                throw new UnsupportedFormatException();
            }
            return C9447a.Companion.m51595c(this.f92062r, "v1/upload/channel/put/photo").m51583v(887002).m51585x(new C21296f("image", file.getName(), str, file));
        }
    }

    /* renamed from: e10.h$l */
    /* loaded from: classes5.dex */
    static final class l extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f92063t;

        /* renamed from: v */
        final /* synthetic */ LoadMoreInfo f92065v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(LoadMoreInfo loadMoreInfo, Continuation continuation) {
            super(1, continuation);
            this.f92065v = loadMoreInfo;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f92063t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C9447a.a m51579p = C9447a.Companion.m51593a(C18171h.this, "v1/user/my/get/list_user_blocked").m51579p(this.f92065v);
                Section.C9424a c9424a = new Section.C9424a(new User.C9432b());
                this.f92063t = 1;
                obj = m51579p.m51581t(c9424a, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            return obj;
        }

        /* renamed from: r */
        public final Continuation m96753r(Continuation continuation) {
            return new l(this.f92065v, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((l) m96753r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: e10.h$l0 */
    /* loaded from: classes5.dex */
    static final class l0 extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f92066t;

        /* renamed from: v */
        final /* synthetic */ String f92068v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l0(String str, Continuation continuation) {
            super(1, continuation);
            this.f92068v = str;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            int m131511r;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f92066t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C9447a.a m51566g = C9447a.a.m51566g(C9447a.Companion.m51593a(C18171h.this, "v1/search/core/get/auto_complete").m51583v(880066), "keyword", this.f92068v, false, 4, null);
                Section.C9424a c9424a = new Section.C9424a(SearchSuggest.Companion.serializer());
                this.f92066t = 1;
                obj = m51566g.m51581t(c9424a, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            List m51168m = ((Section) obj).m51168m();
            m131511r = AbstractC25370t.m131511r(m51168m, 10);
            ArrayList arrayList = new ArrayList(m131511r);
            Iterator it = m51168m.iterator();
            while (it.hasNext()) {
                arrayList.add(((SearchSuggest) it.next()).m51152a());
            }
            return arrayList;
        }

        /* renamed from: r */
        public final Continuation m96755r(Continuation continuation) {
            return new l0(this.f92068v, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((l0) m96755r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: e10.h$l1 */
    /* loaded from: classes5.dex */
    static final class l1 extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f92069t;

        /* renamed from: v */
        final /* synthetic */ String f92071v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l1(String str, Continuation continuation) {
            super(1, continuation);
            this.f92071v = str;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f92069t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C9447a.a m51583v = C9447a.a.m51566g(C9447a.Companion.m51596d(C18171h.this, "v1/video/my/do/pin"), "id", this.f92071v, false, 4, null).m51583v(880010);
                this.f92069t = 1;
                obj = m51583v.m51580s(this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            return obj;
        }

        /* renamed from: r */
        public final Continuation m96757r(Continuation continuation) {
            return new l1(this.f92071v, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((l1) m96757r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: e10.h$l2 */
    /* loaded from: classes5.dex */
    static final class l2 extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ String f92072q;

        /* renamed from: r */
        final /* synthetic */ C18171h f92073r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l2(String str, C18171h c18171h) {
            super(0);
            this.f92072q = str;
            this.f92073r = c18171h;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Flow mo12V4() {
            boolean m127128x;
            String str;
            boolean m127120J;
            File file = new File(this.f92072q);
            m127128x = AbstractC24341v.m127128x(this.f92072q);
            if (!m127128x) {
                m127120J = AbstractC24341v.m127120J(this.f92072q, "content://", false, 2, null);
                if (m127120J) {
                    str = "";
                    return C9447a.Companion.m51595c(this.f92073r, "v1/upload/channel/put/video").m51583v(887001).m51585x(new C21296f("video", file.getName(), str, this.f92072q));
                }
            }
            str = "video/mp4";
            return C9447a.Companion.m51595c(this.f92073r, "v1/upload/channel/put/video").m51583v(887001).m51585x(new C21296f("video", file.getName(), str, this.f92072q));
        }
    }

    /* renamed from: e10.h$m */
    /* loaded from: classes5.dex */
    static final class m extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        Object f92074t;

        /* renamed from: u */
        int f92075u;

        /* renamed from: w */
        final /* synthetic */ String f92077w;

        /* renamed from: x */
        final /* synthetic */ String f92078x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(String str, String str2, Continuation continuation) {
            super(1, continuation);
            this.f92077w = str;
            this.f92078x = str2;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            Object m51581t;
            int i11;
            Integer m51439b;
            m142578e = AbstractC28298d.m142578e();
            int i12 = this.f92075u;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 == 2) {
                        ChannelConfig channelConfig = (ChannelConfig) this.f92074t;
                        AbstractC24862s.m129228b(obj);
                        return channelConfig;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
                m51581t = obj;
            } else {
                AbstractC24862s.m129228b(obj);
                C9447a.a m51566g = C9447a.a.m51566g(C9447a.a.m51566g(C9447a.Companion.m51593a(C18171h.this, "v1/setting/core/get/config").m51583v(880051), "segment", this.f92077w, false, 4, null), "channelVersion", this.f92078x, false, 4, null);
                ChannelConfig.C9442a c9442a = new ChannelConfig.C9442a();
                this.f92075u = 1;
                m51581t = m51566g.m51581t(c9442a, this);
                if (m51581t == m142578e) {
                    return m142578e;
                }
            }
            ChannelConfig channelConfig2 = (ChannelConfig) m51581t;
            InterfaceC29280a interfaceC29280a = C18171h.this.f91891a;
            CoreConfig m51425b = channelConfig2.m51425b();
            if (m51425b != null && (m51439b = m51425b.m51439b()) != null) {
                i11 = m51439b.intValue();
            } else {
                i11 = 0;
            }
            interfaceC29280a.mo146334i(i11);
            InterfaceC30248b interfaceC30248b = C18171h.this.f91892b;
            this.f92074t = channelConfig2;
            this.f92075u = 2;
            if (interfaceC30248b.mo50556h(channelConfig2, this) == m142578e) {
                return m142578e;
            }
            return channelConfig2;
        }

        /* renamed from: r */
        public final Continuation m96760r(Continuation continuation) {
            return new m(this.f92077w, this.f92078x, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((m) m96760r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: e10.h$m0 */
    /* loaded from: classes5.dex */
    static final class m0 extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f92079t;

        /* renamed from: v */
        final /* synthetic */ String f92081v;

        /* renamed from: w */
        final /* synthetic */ LoadMoreInfo f92082w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m0(String str, LoadMoreInfo loadMoreInfo, Continuation continuation) {
            super(1, continuation);
            this.f92081v = str;
            this.f92082w = loadMoreInfo;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f92079t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C9447a.a m51593a = C9447a.Companion.m51593a(C18171h.this, "v1/search/channel/get/list_by_keyword");
                if (this.f92082w != null) {
                    m51593a.m51583v(880063);
                }
                C9447a.a m51579p = C9447a.a.m51566g(m51593a, "keyword", this.f92081v, false, 4, null).m51579p(this.f92082w);
                Section.C9424a c9424a = new Section.C9424a(new Channel.C9382b());
                this.f92079t = 1;
                obj = m51579p.m51581t(c9424a, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            return obj;
        }

        /* renamed from: r */
        public final Continuation m96762r(Continuation continuation) {
            return new m0(this.f92081v, this.f92082w, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((m0) m96762r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: e10.h$m1 */
    /* loaded from: classes5.dex */
    static final class m1 extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f92083t;

        /* renamed from: v */
        final /* synthetic */ boolean f92085v;

        /* renamed from: w */
        final /* synthetic */ String f92086w;

        /* renamed from: x */
        final /* synthetic */ String f92087x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m1(boolean z11, String str, String str2, Continuation continuation) {
            super(1, continuation);
            this.f92085v = z11;
            this.f92086w = str;
            this.f92087x = str2;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            String str;
            Object m51581t;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f92083t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                    m51581t = obj;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C9447a.a m51596d = C9447a.Companion.m51596d(C18171h.this, "v1/video/my/put/detail");
                if (this.f92085v) {
                    str = "1";
                } else {
                    str = "0";
                }
                C9447a.a m51566g = C9447a.a.m51566g(C9447a.a.m51566g(C9447a.a.m51566g(m51596d, "lockComment", str, false, 4, null).m51583v(880053), "zmcId", this.f92086w, false, 4, null), "description", this.f92087x, false, 4, null);
                VideoData.C9437b c9437b = new VideoData.C9437b();
                this.f92083t = 1;
                m51581t = m51566g.m51581t(c9437b, this);
                if (m51581t == m142578e) {
                    return m142578e;
                }
            }
            return new Video((VideoData) m51581t);
        }

        /* renamed from: r */
        public final Continuation m96764r(Continuation continuation) {
            return new m1(this.f92085v, this.f92086w, this.f92087x, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((m1) m96764r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e10.h$n */
    /* loaded from: classes5.dex */
    public static final class n extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f92088t;

        /* renamed from: v */
        final /* synthetic */ String f92090v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(String str, Continuation continuation) {
            super(1, continuation);
            this.f92090v = str;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            String str;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f92088t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C9447a.a m51566g = C9447a.a.m51566g(C9447a.Companion.m51593a(C18171h.this, "v1/channel/core/get/channel").m51583v(880025), "id", this.f92090v, false, 4, null);
                Channel.C9382b c9382b = new Channel.C9382b();
                this.f92088t = 1;
                obj = m51566g.m51581t(c9382b, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            String str2 = this.f92090v;
            Section m50732J = ((Channel) obj).m50732J();
            if (m50732J != null) {
                Channel m140377a = C27417l.f129055a.m140377a();
                if (m140377a != null) {
                    str = m140377a.m50769l();
                } else {
                    str = null;
                }
                if (!AbstractC19074t.m100204b(str, str2)) {
                    List m51168m = m50732J.m51168m();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : m51168m) {
                        if (((Video) obj2).m52905o0()) {
                            arrayList.add(obj2);
                        }
                    }
                    m50732J.m51172q(arrayList);
                    Iterator it = m50732J.m51168m().iterator();
                    while (it.hasNext()) {
                        ((Video) it.next()).m52868T0("channel_profile_full");
                    }
                } else {
                    Iterator it2 = m50732J.m51168m().iterator();
                    while (it2.hasNext()) {
                        ((Video) it2.next()).m52868T0("my_profile");
                    }
                }
            }
            return obj;
        }

        /* renamed from: r */
        public final Continuation m96766r(Continuation continuation) {
            return new n(this.f92090v, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((n) m96766r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: e10.h$n0 */
    /* loaded from: classes5.dex */
    static final class n0 extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f92091t;

        /* renamed from: v */
        final /* synthetic */ String f92093v;

        /* renamed from: w */
        final /* synthetic */ LoadMoreInfo f92094w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n0(String str, LoadMoreInfo loadMoreInfo, Continuation continuation) {
            super(1, continuation);
            this.f92093v = str;
            this.f92094w = loadMoreInfo;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f92091t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C9447a.a m51593a = C9447a.Companion.m51593a(C18171h.this, "v1/search/hashtag/get/list_by_keyword");
                if (this.f92094w != null) {
                    m51593a.m51583v(880064);
                }
                C9447a.a m51579p = C9447a.a.m51566g(m51593a, "keyword", this.f92093v, false, 4, null).m51579p(this.f92094w);
                Section.C9424a c9424a = new Section.C9424a(new SearchHashTag.C9422b());
                this.f92091t = 1;
                obj = m51579p.m51581t(c9424a, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            return obj;
        }

        /* renamed from: r */
        public final Continuation m96768r(Continuation continuation) {
            return new n0(this.f92093v, this.f92094w, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((n0) m96768r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: e10.h$n1 */
    /* loaded from: classes5.dex */
    static final class n1 extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f92095t;

        /* renamed from: v */
        final /* synthetic */ JSONArray f92097v;

        /* renamed from: w */
        final /* synthetic */ JSONArray f92098w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n1(JSONArray jSONArray, JSONArray jSONArray2, Continuation continuation) {
            super(1, continuation);
            this.f92097v = jSONArray;
            this.f92098w = jSONArray2;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f92095t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC24862s.m129228b(obj);
            C9447a.a m51596d = C9447a.Companion.m51596d(C18171h.this, "v1/home/trending/get/list_video_replace_suggestion");
            String jSONArray = this.f92097v.toString();
            AbstractC19074t.m100207e(jSONArray, "toString(...)");
            C9447a.a m51566g = C9447a.a.m51566g(m51596d, "pre", jSONArray, false, 4, null);
            String jSONArray2 = this.f92098w.toString();
            AbstractC19074t.m100207e(jSONArray2, "toString(...)");
            C9447a.a m51566g2 = C9447a.a.m51566g(m51566g, "af", jSONArray2, false, 4, null);
            KSerializer serializer = ReplaceResult.Companion.serializer();
            this.f92095t = 1;
            Object m51581t = m51566g2.m51581t(serializer, this);
            if (m51581t == m142578e) {
                return m142578e;
            }
            return m51581t;
        }

        /* renamed from: r */
        public final Continuation m96770r(Continuation continuation) {
            return new n1(this.f92097v, this.f92098w, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((n1) m96770r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: e10.h$o */
    /* loaded from: classes5.dex */
    static final class o extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        Object f92099t;

        /* renamed from: u */
        int f92100u;

        /* renamed from: w */
        final /* synthetic */ String f92102w;

        /* renamed from: x */
        final /* synthetic */ LoadMoreInfo f92103x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(String str, LoadMoreInfo loadMoreInfo, Continuation continuation) {
            super(1, continuation);
            this.f92102w = str;
            this.f92103x = loadMoreInfo;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            C18171h c18171h;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f92100u;
            if (i11 != 0) {
                if (i11 == 1) {
                    c18171h = (C18171h) this.f92099t;
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C18171h c18171h2 = C18171h.this;
                C9447a.a m51579p = C9447a.a.m51566g(C9447a.Companion.m51593a(c18171h2, "v1/notification/channel/get/list"), ZinstantMetaConstant.IMPRESSION_META_TYPE, this.f92102w, false, 4, null).m51579p(this.f92103x);
                Section.C9424a c9424a = new Section.C9424a(Notification.Companion.serializer());
                this.f92099t = c18171h2;
                this.f92100u = 1;
                Object m51581t = m51579p.m51581t(c9424a, this);
                if (m51581t == m142578e) {
                    return m142578e;
                }
                c18171h = c18171h2;
                obj = m51581t;
            }
            return c18171h.m96660U0((Section) obj);
        }

        /* renamed from: r */
        public final Continuation m96772r(Continuation continuation) {
            return new o(this.f92102w, this.f92103x, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((o) m96772r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: e10.h$o0 */
    /* loaded from: classes5.dex */
    static final class o0 extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f92104t;

        o0(Continuation continuation) {
            super(1, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            int m131511r;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f92104t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C9447a.a m51583v = C9447a.Companion.m51593a(C18171h.this, "v1/search/core/get/keyword_trending").m51583v(880065);
                Section.C9424a c9424a = new Section.C9424a(SearchSuggest.Companion.serializer());
                this.f92104t = 1;
                obj = m51583v.m51581t(c9424a, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            List m51168m = ((Section) obj).m51168m();
            m131511r = AbstractC25370t.m131511r(m51168m, 10);
            ArrayList arrayList = new ArrayList(m131511r);
            Iterator it = m51168m.iterator();
            while (it.hasNext()) {
                arrayList.add(((SearchSuggest) it.next()).m51152a());
            }
            return arrayList;
        }

        /* renamed from: r */
        public final Continuation m96774r(Continuation continuation) {
            return new o0(continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((o0) m96774r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: e10.h$o1 */
    /* loaded from: classes5.dex */
    static final class o1 extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f92106t;

        /* renamed from: v */
        final /* synthetic */ String f92108v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o1(String str, Continuation continuation) {
            super(1, continuation);
            this.f92108v = str;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f92106t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C9447a.a m51566g = C9447a.a.m51566g(C9447a.Companion.m51596d(C18171h.this, "v1/comment/user/remove/by_id").m51583v(880050), "id", this.f92108v, false, 4, null);
                this.f92106t = 1;
                obj = m51566g.m51580s(this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            return obj;
        }

        /* renamed from: r */
        public final Continuation m96776r(Continuation continuation) {
            return new o1(this.f92108v, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((o1) m96776r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: e10.h$p */
    /* loaded from: classes5.dex */
    static final class p extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f92109t;

        /* renamed from: v */
        final /* synthetic */ List f92111v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(List list, Continuation continuation) {
            super(1, continuation);
            this.f92111v = list;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            String m131214n0;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f92109t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C9447a.a m51583v = C9447a.Companion.m51593a(C18171h.this, "v1/channel/user/get/list_channel_personal").m51583v(880027);
                m131214n0 = AbstractC25332a0.m131214n0(this.f92111v, ",", null, null, 0, null, null, 62, null);
                C9447a.a m51566g = C9447a.a.m51566g(m51583v, "channel_ids", m131214n0, false, 4, null);
                KSerializer m133617h = AbstractC25935a.m133617h(PersonalizeChannel.Companion.serializer());
                this.f92109t = 1;
                obj = m51566g.m51581t(m133617h, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            InterfaceC29283d m143692z = AbstractC28684a.Companion.m143692z();
            for (PersonalizeChannel personalizeChannel : (List) obj) {
                if (personalizeChannel.m51104c()) {
                    m143692z.mo146375n(personalizeChannel.m51102a(), true);
                }
            }
            return obj;
        }

        /* renamed from: r */
        public final Continuation m96778r(Continuation continuation) {
            return new p(this.f92111v, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((p) m96778r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: e10.h$p0 */
    /* loaded from: classes5.dex */
    static final class p0 extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f92112t;

        /* renamed from: v */
        final /* synthetic */ String f92114v;

        /* renamed from: w */
        final /* synthetic */ LoadMoreInfo f92115w;

        /* renamed from: x */
        final /* synthetic */ String f92116x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p0(String str, LoadMoreInfo loadMoreInfo, String str2, Continuation continuation) {
            super(1, continuation);
            this.f92114v = str;
            this.f92115w = loadMoreInfo;
            this.f92116x = str2;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            int m131511r;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f92112t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C9447a.a m51593a = C9447a.Companion.m51593a(C18171h.this, "v1/search/video/get/list_by_keyword");
                if (this.f92115w != null) {
                    m51593a.m51583v(880062);
                }
                C9447a.a m51579p = C9447a.a.m51566g(m51593a, "keyword", this.f92114v, false, 4, null).m51579p(this.f92115w);
                Section.C9424a c9424a = new Section.C9424a(new VideoData.C9437b());
                this.f92112t = 1;
                obj = m51579p.m51581t(c9424a, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            Section section = (Section) obj;
            List m51168m = section.m51168m();
            m131511r = AbstractC25370t.m131511r(m51168m, 10);
            ArrayList arrayList = new ArrayList(m131511r);
            Iterator it = m51168m.iterator();
            while (it.hasNext()) {
                arrayList.add(new Video((VideoData) it.next()));
            }
            Section section2 = new Section(arrayList, section.m51170o(), section.m51169n());
            String str = this.f92116x;
            String str2 = this.f92114v;
            List m51168m2 = section2.m51168m();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : m51168m2) {
                if (((Video) obj2).m52905o0()) {
                    arrayList2.add(obj2);
                }
            }
            section2.m51172q(arrayList2);
            Iterator it2 = section2.m51168m().iterator();
            while (it2.hasNext()) {
                ((Video) it2.next()).m52868T0(str);
            }
            C19205a.f95429a.m100717R(section2.m51168m(), str, str2);
            return section2;
        }

        /* renamed from: r */
        public final Continuation m96780r(Continuation continuation) {
            return new p0(this.f92114v, this.f92115w, this.f92116x, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((p0) m96780r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: e10.h$p1 */
    /* loaded from: classes5.dex */
    static final class p1 extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f92117t;

        /* renamed from: v */
        final /* synthetic */ String f92119v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p1(String str, Continuation continuation) {
            super(1, continuation);
            this.f92119v = str;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f92117t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C9447a.a m51583v = C9447a.a.m51566g(C9447a.Companion.m51596d(C18171h.this, "v1/video/my/remove/by_id"), "id", this.f92119v, false, 4, null).m51583v(880012);
                this.f92117t = 1;
                obj = m51583v.m51580s(this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            return obj;
        }

        /* renamed from: r */
        public final Continuation m96782r(Continuation continuation) {
            return new p1(this.f92119v, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((p1) m96782r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: e10.h$q */
    /* loaded from: classes5.dex */
    static final class q extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f92120t;

        /* renamed from: v */
        final /* synthetic */ LoadMoreInfo f92122v;

        /* renamed from: w */
        final /* synthetic */ String f92123w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(LoadMoreInfo loadMoreInfo, String str, Continuation continuation) {
            super(1, continuation);
            this.f92122v = loadMoreInfo;
            this.f92123w = str;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            int i11;
            m142578e = AbstractC28298d.m142578e();
            int i12 = this.f92120t;
            if (i12 != 0) {
                if (i12 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C9447a.a m51593a = C9447a.Companion.m51593a(C18171h.this, "v1/comment/core/get/list_latest_reply");
                if (this.f92122v != null) {
                    i11 = 880082;
                } else {
                    i11 = 880081;
                }
                C9447a.a m51579p = C9447a.a.m51566g(m51593a.m51583v(i11), "commentId", this.f92123w, false, 4, null).m51579p(this.f92122v);
                Section.C9424a c9424a = new Section.C9424a(new Comment.C9387b());
                this.f92120t = 1;
                obj = m51579p.m51581t(c9424a, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            return obj;
        }

        /* renamed from: r */
        public final Continuation m96784r(Continuation continuation) {
            return new q(this.f92122v, this.f92123w, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((q) m96784r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: e10.h$q0 */
    /* loaded from: classes5.dex */
    static final class q0 extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f92124t;

        /* renamed from: v */
        final /* synthetic */ String f92126v;

        /* renamed from: w */
        final /* synthetic */ String f92127w;

        /* renamed from: x */
        final /* synthetic */ LoadMoreInfo f92128x;

        /* renamed from: y */
        final /* synthetic */ String f92129y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q0(String str, String str2, LoadMoreInfo loadMoreInfo, String str3, Continuation continuation) {
            super(1, continuation);
            this.f92126v = str;
            this.f92127w = str2;
            this.f92128x = loadMoreInfo;
            this.f92129y = str3;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            Object m51581t;
            int m131511r;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f92124t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                    m51581t = obj;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C9447a.a m51579p = C9447a.a.m51566g(C9447a.a.m51566g(C9447a.Companion.m51593a(C18171h.this, "v1/search/video/get/list_by_keyword_in_channel"), "keyword", this.f92126v, false, 4, null), "channelId", this.f92127w, false, 4, null).m51579p(this.f92128x);
                Section.C9424a c9424a = new Section.C9424a(new VideoData.C9437b());
                this.f92124t = 1;
                m51581t = m51579p.m51581t(c9424a, this);
                if (m51581t == m142578e) {
                    return m142578e;
                }
            }
            Section section = (Section) m51581t;
            List m51168m = section.m51168m();
            m131511r = AbstractC25370t.m131511r(m51168m, 10);
            ArrayList arrayList = new ArrayList(m131511r);
            Iterator it = m51168m.iterator();
            while (it.hasNext()) {
                arrayList.add(new Video((VideoData) it.next()));
            }
            Section section2 = new Section(arrayList, section.m51170o(), section.m51169n());
            String str = this.f92129y;
            String str2 = this.f92126v;
            List m51168m2 = section2.m51168m();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : m51168m2) {
                if (((Video) obj2).m52905o0()) {
                    arrayList2.add(obj2);
                }
            }
            section2.m51172q(arrayList2);
            Iterator it2 = section2.m51168m().iterator();
            while (it2.hasNext()) {
                ((Video) it2.next()).m52868T0(str);
            }
            C19205a.f95429a.m100717R(section2.m51168m(), str, str2);
            return section2;
        }

        /* renamed from: r */
        public final Continuation m96786r(Continuation continuation) {
            return new q0(this.f92126v, this.f92127w, this.f92128x, this.f92129y, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((q0) m96786r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: e10.h$q1 */
    /* loaded from: classes5.dex */
    static final class q1 extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f92130t;

        /* renamed from: v */
        final /* synthetic */ String f92132v;

        /* renamed from: w */
        final /* synthetic */ String f92133w;

        /* renamed from: x */
        final /* synthetic */ String f92134x;

        /* renamed from: y */
        final /* synthetic */ String f92135y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q1(String str, String str2, String str3, String str4, Continuation continuation) {
            super(1, continuation);
            this.f92132v = str;
            this.f92133w = str2;
            this.f92134x = str3;
            this.f92135y = str4;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f92130t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C9447a.a m51583v = C9447a.Companion.m51596d(C18171h.this, "v1/feedback/user/put/detail").m51583v(880041);
                String str = this.f92132v;
                String str2 = this.f92133w;
                String str3 = this.f92134x;
                String str4 = this.f92135y;
                C9447a.a.m51566g(m51583v, "objectType", str, false, 4, null);
                C9447a.a.m51566g(m51583v, "objectId", str2, false, 4, null);
                C9447a.a.m51566g(m51583v, ZinstantMetaConstant.IMPRESSION_META_TYPE, str3, false, 4, null);
                if (AbstractC19074t.m100204b(str3, "6") && str4.length() > 0) {
                    C9447a.a.m51566g(m51583v, "message", str4, false, 4, null);
                }
                this.f92130t = 1;
                obj = m51583v.m51580s(this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            return obj;
        }

        /* renamed from: r */
        public final Continuation m96788r(Continuation continuation) {
            return new q1(this.f92132v, this.f92133w, this.f92134x, this.f92135y, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((q1) m96788r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: e10.h$r */
    /* loaded from: classes5.dex */
    static final class r extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f92136t;

        /* renamed from: v */
        final /* synthetic */ LoadMoreInfo f92138v;

        /* renamed from: w */
        final /* synthetic */ String f92139w;

        /* renamed from: x */
        final /* synthetic */ String f92140x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(LoadMoreInfo loadMoreInfo, String str, String str2, Continuation continuation) {
            super(1, continuation);
            this.f92138v = loadMoreInfo;
            this.f92139w = str;
            this.f92140x = str2;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            int i11;
            m142578e = AbstractC28298d.m142578e();
            int i12 = this.f92136t;
            if (i12 != 0) {
                if (i12 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C9447a.a m51593a = C9447a.Companion.m51593a(C18171h.this, "v1/comment/core/get/list_latest");
                LoadMoreInfo loadMoreInfo = this.f92138v;
                String str = this.f92139w;
                String str2 = this.f92140x;
                if (loadMoreInfo != null) {
                    i11 = 880043;
                } else {
                    i11 = 880042;
                }
                m51593a.m51583v(i11);
                C9447a.a.m51566g(m51593a, "videoId", str, false, 4, null);
                if (str2 != null) {
                    C9447a.a.m51566g(m51593a, "commentId", str2, false, 4, null);
                }
                C9447a.a m51579p = m51593a.m51579p(this.f92138v);
                Section.C9424a c9424a = new Section.C9424a(new Comment.C9387b());
                this.f92136t = 1;
                obj = m51579p.m51581t(c9424a, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            return obj;
        }

        /* renamed from: r */
        public final Continuation m96790r(Continuation continuation) {
            return new r(this.f92138v, this.f92139w, this.f92140x, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((r) m96790r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: e10.h$r0 */
    /* loaded from: classes5.dex */
    static final class r0 extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f92141t;

        /* renamed from: v */
        final /* synthetic */ String f92143v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r0(String str, Continuation continuation) {
            super(1, continuation);
            this.f92143v = str;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f92141t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C9447a.a m51566g = C9447a.a.m51566g(C9447a.Companion.m51596d(C18171h.this, "v1/shortlink/core/get/by_full_link").m51583v(880060), "link", this.f92143v, false, 4, null);
                KSerializer serializer = ShortLink.Companion.serializer();
                this.f92141t = 1;
                obj = m51566g.m51581t(serializer, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            return ((ShortLink) obj).m51196a();
        }

        /* renamed from: r */
        public final Continuation m96792r(Continuation continuation) {
            return new r0(this.f92143v, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((r0) m96792r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e10.h$r1 */
    /* loaded from: classes5.dex */
    public static final class r1 extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f92144t;

        /* renamed from: v */
        final /* synthetic */ InterfaceC18505l f92146v;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: e10.h$r1$a */
        /* loaded from: classes5.dex */
        public static final class a extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f92147t;

            /* renamed from: u */
            /* synthetic */ Object f92148u;

            a(Continuation continuation) {
                super(2, continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                a aVar = new a(continuation);
                aVar.f92148u = obj;
                return aVar;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                AbstractC28298d.m142578e();
                if (this.f92147t == 0) {
                    AbstractC24862s.m129228b(obj);
                    return AbstractC29094b.m145339a(!AbstractC19074t.m100204b((AbstractC18166c) this.f92148u, AbstractC18166c.c.f91848a));
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public final Object mo240pC(AbstractC18166c abstractC18166c, Continuation continuation) {
                return ((a) mo238a(abstractC18166c, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r1(InterfaceC18505l interfaceC18505l, Continuation continuation) {
            super(1, continuation);
            this.f92146v = interfaceC18505l;
        }

        /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0008. Please report as an issue. */
        /* JADX WARN: Finally extract failed */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0161  */
        /* JADX WARN: Removed duplicated region for block: B:13:0x01a7 A[PHI: r7
  0x01a7: PHI (r7v24 java.lang.Object) = (r7v8 java.lang.Object), (r7v23 java.lang.Object), (r7v0 java.lang.Object), (r7v34 java.lang.Object) binds: [B:71:0x01a4, B:37:0x00c8, B:24:0x0018, B:11:0x016a] A[DONT_GENERATE, DONT_INLINE], RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:14:0x016d  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0091 A[Catch: all -> 0x00a5, TryCatch #1 {all -> 0x00a5, blocks: (B:28:0x0070, B:30:0x0091, B:31:0x0095, B:35:0x00ba, B:41:0x00a7, B:42:0x00ab), top: B:27:0x0070 }] */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00ca A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00a7 A[Catch: all -> 0x00a5, TryCatch #1 {all -> 0x00a5, blocks: (B:28:0x0070, B:30:0x0091, B:31:0x0095, B:35:0x00ba, B:41:0x00a7, B:42:0x00ab), top: B:27:0x0070 }] */
        /* JADX WARN: Removed duplicated region for block: B:53:0x0064 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:57:0x0056 A[RETURN] */
        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo239o(Object obj) {
            Object m142578e;
            ReentrantLock reentrantLock;
            Object value;
            Object value2;
            C18171h c18171h;
            C27417l c27417l;
            Object value3;
            Object value4;
            AbstractC18166c abstractC18166c;
            m142578e = AbstractC28298d.m142578e();
            try {
                switch (this.f92144t) {
                    case 0:
                        AbstractC24862s.m129228b(obj);
                        AbstractC18166c m96658S0 = C18171h.this.m96658S0();
                        if (AbstractC19074t.m100204b(m96658S0, AbstractC18166c.a.f91846a)) {
                            C18171h c18171h2 = C18171h.this;
                            this.f92144t = 1;
                            obj = c18171h2.m96659T0(this);
                            if (obj == m142578e) {
                                return m142578e;
                            }
                            C18171h c18171h3 = C18171h.this;
                            this.f92144t = 2;
                            obj = c18171h3.m96666a1((OauthToken) obj, this);
                            if (obj == m142578e) {
                                return m142578e;
                            }
                            c18171h = C18171h.this;
                            this.f92144t = 3;
                            if (c18171h.m96663X0((AuthInfo) obj, this) == m142578e) {
                                return m142578e;
                            }
                            reentrantLock = C18171h.this.f91894d;
                            C18171h c18171h4 = C18171h.this;
                            reentrantLock.lock();
                            try {
                                c27417l = C27417l.f129055a;
                                String m51234g = c27417l.m140378b().m51234g();
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("current userId is ");
                                sb2.append(m51234g);
                                if (AbstractC19074t.m100204b(c27417l.m140378b(), User.Anonymous.f50006J)) {
                                    MutableStateFlow mutableStateFlow = c18171h4.f91893c;
                                    do {
                                        value4 = mutableStateFlow.getValue();
                                    } while (!mutableStateFlow.mo113436i(value4, AbstractC18166c.b.f91847a));
                                } else {
                                    MutableStateFlow mutableStateFlow2 = c18171h4.f91893c;
                                    do {
                                        value3 = mutableStateFlow2.getValue();
                                    } while (!mutableStateFlow2.mo113436i(value3, AbstractC18166c.a.f91846a));
                                }
                                C24848g0 c24848g0 = C24848g0.f119245a;
                                reentrantLock.unlock();
                                InterfaceC18505l interfaceC18505l = this.f92146v;
                                this.f92144t = 4;
                                obj = interfaceC18505l.mo205i9(this);
                                if (obj != m142578e) {
                                    return m142578e;
                                }
                                return obj;
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        if (AbstractC19074t.m100204b(m96658S0, AbstractC18166c.c.f91848a)) {
                            MutableStateFlow mutableStateFlow3 = C18171h.this.f91893c;
                            a aVar = new a(null);
                            this.f92144t = 5;
                            if (FlowKt.m113303u(mutableStateFlow3, aVar, this) == m142578e) {
                                return m142578e;
                            }
                            abstractC18166c = (AbstractC18166c) C18171h.this.f91893c.getValue();
                            if (!AbstractC19074t.m100204b(abstractC18166c, AbstractC18166c.b.f91847a)) {
                                InterfaceC18505l interfaceC18505l2 = this.f92146v;
                                this.f92144t = 6;
                                obj = interfaceC18505l2.mo205i9(this);
                                if (obj == m142578e) {
                                    return m142578e;
                                }
                            } else {
                                if (!AbstractC19074t.m100204b(abstractC18166c, AbstractC18166c.a.f91846a)) {
                                    if (AbstractC19074t.m100204b(abstractC18166c, AbstractC18166c.c.f91848a)) {
                                        throw new RestException("Impossible.");
                                    }
                                    throw new NoWhenBranchMatchedException();
                                }
                                throw new RestException("Failed to login.");
                            }
                        } else if (AbstractC19074t.m100204b(m96658S0, AbstractC18166c.b.f91847a)) {
                            InterfaceC18505l interfaceC18505l3 = this.f92146v;
                            this.f92144t = 7;
                            obj = interfaceC18505l3.mo205i9(this);
                            if (obj == m142578e) {
                                return m142578e;
                            }
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    case 1:
                        AbstractC24862s.m129228b(obj);
                        C18171h c18171h32 = C18171h.this;
                        this.f92144t = 2;
                        obj = c18171h32.m96666a1((OauthToken) obj, this);
                        if (obj == m142578e) {
                        }
                        c18171h = C18171h.this;
                        this.f92144t = 3;
                        if (c18171h.m96663X0((AuthInfo) obj, this) == m142578e) {
                        }
                        reentrantLock = C18171h.this.f91894d;
                        C18171h c18171h42 = C18171h.this;
                        reentrantLock.lock();
                        c27417l = C27417l.f129055a;
                        String m51234g2 = c27417l.m140378b().m51234g();
                        StringBuilder sb22 = new StringBuilder();
                        sb22.append("current userId is ");
                        sb22.append(m51234g2);
                        if (AbstractC19074t.m100204b(c27417l.m140378b(), User.Anonymous.f50006J)) {
                        }
                        C24848g0 c24848g02 = C24848g0.f119245a;
                        reentrantLock.unlock();
                        InterfaceC18505l interfaceC18505l4 = this.f92146v;
                        this.f92144t = 4;
                        obj = interfaceC18505l4.mo205i9(this);
                        if (obj != m142578e) {
                        }
                        break;
                    case 2:
                        AbstractC24862s.m129228b(obj);
                        c18171h = C18171h.this;
                        this.f92144t = 3;
                        if (c18171h.m96663X0((AuthInfo) obj, this) == m142578e) {
                        }
                        reentrantLock = C18171h.this.f91894d;
                        C18171h c18171h422 = C18171h.this;
                        reentrantLock.lock();
                        c27417l = C27417l.f129055a;
                        String m51234g22 = c27417l.m140378b().m51234g();
                        StringBuilder sb222 = new StringBuilder();
                        sb222.append("current userId is ");
                        sb222.append(m51234g22);
                        if (AbstractC19074t.m100204b(c27417l.m140378b(), User.Anonymous.f50006J)) {
                        }
                        C24848g0 c24848g022 = C24848g0.f119245a;
                        reentrantLock.unlock();
                        InterfaceC18505l interfaceC18505l42 = this.f92146v;
                        this.f92144t = 4;
                        obj = interfaceC18505l42.mo205i9(this);
                        if (obj != m142578e) {
                        }
                        break;
                    case 3:
                        AbstractC24862s.m129228b(obj);
                        reentrantLock = C18171h.this.f91894d;
                        C18171h c18171h4222 = C18171h.this;
                        reentrantLock.lock();
                        c27417l = C27417l.f129055a;
                        String m51234g222 = c27417l.m140378b().m51234g();
                        StringBuilder sb2222 = new StringBuilder();
                        sb2222.append("current userId is ");
                        sb2222.append(m51234g222);
                        if (AbstractC19074t.m100204b(c27417l.m140378b(), User.Anonymous.f50006J)) {
                        }
                        C24848g0 c24848g0222 = C24848g0.f119245a;
                        reentrantLock.unlock();
                        InterfaceC18505l interfaceC18505l422 = this.f92146v;
                        this.f92144t = 4;
                        obj = interfaceC18505l422.mo205i9(this);
                        if (obj != m142578e) {
                        }
                        break;
                    case 4:
                    case 6:
                    case 7:
                        AbstractC24862s.m129228b(obj);
                        return obj;
                    case 5:
                        AbstractC24862s.m129228b(obj);
                        abstractC18166c = (AbstractC18166c) C18171h.this.f91893c.getValue();
                        if (!AbstractC19074t.m100204b(abstractC18166c, AbstractC18166c.b.f91847a)) {
                        }
                        break;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } catch (Throwable th3) {
                reentrantLock = C18171h.this.f91894d;
                C18171h c18171h5 = C18171h.this;
                reentrantLock.lock();
                try {
                    C27417l c27417l2 = C27417l.f129055a;
                    String m51234g3 = c27417l2.m140378b().m51234g();
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("current userId is ");
                    sb3.append(m51234g3);
                    if (!AbstractC19074t.m100204b(c27417l2.m140378b(), User.Anonymous.f50006J)) {
                        MutableStateFlow mutableStateFlow4 = c18171h5.f91893c;
                        do {
                            value2 = mutableStateFlow4.getValue();
                        } while (!mutableStateFlow4.mo113436i(value2, AbstractC18166c.b.f91847a));
                    } else {
                        MutableStateFlow mutableStateFlow5 = c18171h5.f91893c;
                        do {
                            value = mutableStateFlow5.getValue();
                        } while (!mutableStateFlow5.mo113436i(value, AbstractC18166c.a.f91846a));
                    }
                    C24848g0 c24848g03 = C24848g0.f119245a;
                    reentrantLock.unlock();
                    throw th3;
                } finally {
                    reentrantLock.unlock();
                }
            }
        }

        /* renamed from: r */
        public final Continuation m96794r(Continuation continuation) {
            return new r1(this.f92146v, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((r1) m96794r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: e10.h$s */
    /* loaded from: classes5.dex */
    static final class s extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f92149t;

        /* renamed from: v */
        final /* synthetic */ List f92151v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(List list, Continuation continuation) {
            super(1, continuation);
            this.f92151v = list;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            String m131214n0;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f92149t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C9447a.a m51583v = C9447a.Companion.m51593a(C18171h.this, "v1/comment/user/get/list_cmt_personal").m51583v(880049);
                m131214n0 = AbstractC25332a0.m131214n0(this.f92151v, ",", null, null, 0, null, null, 62, null);
                C9447a.a m51566g = C9447a.a.m51566g(m51583v, "cmt_ids", m131214n0, false, 4, null);
                KSerializer m133617h = AbstractC25935a.m133617h(PersonalizeComment.Companion.serializer());
                this.f92149t = 1;
                obj = m51566g.m51581t(m133617h, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            return obj;
        }

        /* renamed from: r */
        public final Continuation m96797r(Continuation continuation) {
            return new s(this.f92151v, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((s) m96797r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: e10.h$s0 */
    /* loaded from: classes5.dex */
    static final class s0 extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f92152t;

        /* renamed from: v */
        final /* synthetic */ String f92154v;

        /* renamed from: w */
        final /* synthetic */ LoadMoreInfo f92155w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s0(String str, LoadMoreInfo loadMoreInfo, Continuation continuation) {
            super(1, continuation);
            this.f92154v = str;
            this.f92155w = loadMoreInfo;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f92152t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C9447a.a m51579p = C9447a.a.m51566g(C9447a.Companion.m51593a(C18171h.this, "v1/search/hashtag/get/auto_complete").m51583v(880067), "keyword", this.f92154v, false, 4, null).m51579p(this.f92155w);
                Section.C9424a c9424a = new Section.C9424a(new SearchHashTag.C9422b());
                this.f92152t = 1;
                obj = m51579p.m51581t(c9424a, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            return obj;
        }

        /* renamed from: r */
        public final Continuation m96799r(Continuation continuation) {
            return new s0(this.f92154v, this.f92155w, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((s0) m96799r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e10.h$s1 */
    /* loaded from: classes5.dex */
    public static final class s1 extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: r */
        final /* synthetic */ InterfaceC18494a f92157r;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: e10.h$s1$a */
        /* loaded from: classes5.dex */
        public static final class a extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f92158t;

            /* renamed from: u */
            final /* synthetic */ C18171h f92159u;

            /* renamed from: v */
            final /* synthetic */ InterfaceC18494a f92160v;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: e10.h$s1$a$a, reason: collision with other inner class name */
            /* loaded from: classes5.dex */
            public static final class C32811a extends AbstractC29104l implements InterfaceC18509p {

                /* renamed from: t */
                int f92161t;

                /* renamed from: u */
                final /* synthetic */ Exception f92162u;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C32811a(Exception exc, Continuation continuation) {
                    super(2, continuation);
                    this.f92162u = exc;
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: a */
                public final Continuation mo238a(Object obj, Continuation continuation) {
                    return new C32811a(this.f92162u, continuation);
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: o */
                public final Object mo239o(Object obj) {
                    AbstractC28298d.m142578e();
                    if (this.f92161t != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC24862s.m129228b(obj);
                    throw this.f92162u;
                }

                @Override // en0.InterfaceC18509p
                /* renamed from: r, reason: merged with bridge method [inline-methods] */
                public final Object mo240pC(FlowCollector flowCollector, Continuation continuation) {
                    return ((C32811a) mo238a(flowCollector, continuation)).mo239o(C24848g0.f119245a);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: e10.h$s1$a$b */
            /* loaded from: classes5.dex */
            public static final class b extends AbstractC29104l implements InterfaceC18509p {

                /* renamed from: t */
                int f92163t;

                /* renamed from: u */
                /* synthetic */ Object f92164u;

                b(Continuation continuation) {
                    super(2, continuation);
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: a */
                public final Continuation mo238a(Object obj, Continuation continuation) {
                    b bVar = new b(continuation);
                    bVar.f92164u = obj;
                    return bVar;
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: o */
                public final Object mo239o(Object obj) {
                    AbstractC28298d.m142578e();
                    if (this.f92163t == 0) {
                        AbstractC24862s.m129228b(obj);
                        return AbstractC29094b.m145339a(!AbstractC19074t.m100204b((AbstractC18166c) this.f92164u, AbstractC18166c.c.f91848a));
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }

                @Override // en0.InterfaceC18509p
                /* renamed from: r, reason: merged with bridge method [inline-methods] */
                public final Object mo240pC(AbstractC18166c abstractC18166c, Continuation continuation) {
                    return ((b) mo238a(abstractC18166c, continuation)).mo239o(C24848g0.f119245a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C18171h c18171h, InterfaceC18494a interfaceC18494a, Continuation continuation) {
                super(2, continuation);
                this.f92159u = c18171h;
                this.f92160v = interfaceC18494a;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new a(this.f92159u, this.f92160v, continuation);
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x01c9  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x01d2  */
            /* JADX WARN: Removed duplicated region for block: B:31:0x0098 A[Catch: all -> 0x00ac, TryCatch #4 {all -> 0x00ac, blocks: (B:29:0x0077, B:31:0x0098, B:32:0x009c, B:36:0x00c1, B:42:0x00ae, B:43:0x00b2), top: B:28:0x0077 }] */
            /* JADX WARN: Removed duplicated region for block: B:42:0x00ae A[Catch: all -> 0x00ac, TryCatch #4 {all -> 0x00ac, blocks: (B:29:0x0077, B:31:0x0098, B:32:0x009c, B:36:0x00c1, B:42:0x00ae, B:43:0x00b2), top: B:28:0x0077 }] */
            /* JADX WARN: Removed duplicated region for block: B:58:0x005e A[RETURN] */
            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object mo239o(Object obj) {
                Object m142578e;
                ReentrantLock reentrantLock;
                Object value;
                Object value2;
                Object value3;
                Object value4;
                ReentrantLock reentrantLock2;
                C27417l c27417l;
                Object value5;
                Object value6;
                AbstractC18166c abstractC18166c;
                m142578e = AbstractC28298d.m142578e();
                int i11 = this.f92158t;
                try {
                    try {
                    } catch (Exception e11) {
                        FlowKt.m113265A(new C32811a(e11, null));
                        reentrantLock = this.f92159u.f91894d;
                        C18171h c18171h = this.f92159u;
                        reentrantLock.lock();
                        try {
                            C27417l c27417l2 = C27417l.f129055a;
                            String m51234g = c27417l2.m140378b().m51234g();
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("(flow) current userId is ");
                            sb2.append(m51234g);
                            if (!AbstractC19074t.m100204b(c27417l2.m140378b(), User.Anonymous.f50006J)) {
                                MutableStateFlow mutableStateFlow = c18171h.f91893c;
                                do {
                                    value4 = mutableStateFlow.getValue();
                                } while (!mutableStateFlow.mo113436i(value4, AbstractC18166c.b.f91847a));
                            } else {
                                MutableStateFlow mutableStateFlow2 = c18171h.f91893c;
                                do {
                                    value3 = mutableStateFlow2.getValue();
                                } while (!mutableStateFlow2.mo113436i(value3, AbstractC18166c.a.f91846a));
                            }
                            C24848g0 c24848g0 = C24848g0.f119245a;
                        } finally {
                        }
                    }
                    try {
                        if (i11 != 0) {
                            if (i11 != 1) {
                                if (i11 != 2) {
                                    if (i11 != 3) {
                                        if (i11 == 4) {
                                            AbstractC24862s.m129228b(obj);
                                            abstractC18166c = (AbstractC18166c) this.f92159u.f91893c.getValue();
                                            if (!AbstractC19074t.m100204b(abstractC18166c, AbstractC18166c.b.f91847a)) {
                                                return (Flow) this.f92160v.mo12V4();
                                            }
                                            if (!AbstractC19074t.m100204b(abstractC18166c, AbstractC18166c.a.f91846a)) {
                                                if (AbstractC19074t.m100204b(abstractC18166c, AbstractC18166c.c.f91848a)) {
                                                    throw new RestException("Impossible.");
                                                }
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            throw new RestException("Failed to login.");
                                        }
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    AbstractC24862s.m129228b(obj);
                                    reentrantLock = this.f92159u.f91894d;
                                    C18171h c18171h2 = this.f92159u;
                                    reentrantLock.lock();
                                    c27417l = C27417l.f129055a;
                                    String m51234g2 = c27417l.m140378b().m51234g();
                                    StringBuilder sb3 = new StringBuilder();
                                    sb3.append("(flow) current userId is ");
                                    sb3.append(m51234g2);
                                    if (AbstractC19074t.m100204b(c27417l.m140378b(), User.Anonymous.f50006J)) {
                                        MutableStateFlow mutableStateFlow3 = c18171h2.f91893c;
                                        do {
                                            value6 = mutableStateFlow3.getValue();
                                        } while (!mutableStateFlow3.mo113436i(value6, AbstractC18166c.b.f91847a));
                                    } else {
                                        MutableStateFlow mutableStateFlow4 = c18171h2.f91893c;
                                        do {
                                            value5 = mutableStateFlow4.getValue();
                                        } while (!mutableStateFlow4.mo113436i(value5, AbstractC18166c.a.f91846a));
                                    }
                                    C24848g0 c24848g02 = C24848g0.f119245a;
                                    reentrantLock2.unlock();
                                    return (Flow) this.f92160v.mo12V4();
                                }
                                AbstractC24862s.m129228b(obj);
                            } else {
                                AbstractC24862s.m129228b(obj);
                                C18171h c18171h3 = this.f92159u;
                                this.f92158t = 2;
                                obj = c18171h3.m96666a1((OauthToken) obj, this);
                                if (obj == m142578e) {
                                    return m142578e;
                                }
                            }
                        } else {
                            AbstractC24862s.m129228b(obj);
                            AbstractC18166c m96658S0 = this.f92159u.m96658S0();
                            if (AbstractC19074t.m100204b(m96658S0, AbstractC18166c.a.f91846a)) {
                                C18171h c18171h4 = this.f92159u;
                                this.f92158t = 1;
                                obj = c18171h4.m96659T0(this);
                                if (obj == m142578e) {
                                    return m142578e;
                                }
                                C18171h c18171h32 = this.f92159u;
                                this.f92158t = 2;
                                obj = c18171h32.m96666a1((OauthToken) obj, this);
                                if (obj == m142578e) {
                                }
                            } else if (AbstractC19074t.m100204b(m96658S0, AbstractC18166c.c.f91848a)) {
                                MutableStateFlow mutableStateFlow5 = this.f92159u.f91893c;
                                b bVar = new b(null);
                                this.f92158t = 4;
                                if (FlowKt.m113303u(mutableStateFlow5, bVar, this) == m142578e) {
                                    return m142578e;
                                }
                                abstractC18166c = (AbstractC18166c) this.f92159u.f91893c.getValue();
                                if (!AbstractC19074t.m100204b(abstractC18166c, AbstractC18166c.b.f91847a)) {
                                }
                            } else {
                                if (AbstractC19074t.m100204b(m96658S0, AbstractC18166c.b.f91847a)) {
                                    return (Flow) this.f92160v.mo12V4();
                                }
                                throw new NoWhenBranchMatchedException();
                            }
                        }
                        c27417l = C27417l.f129055a;
                        String m51234g22 = c27417l.m140378b().m51234g();
                        StringBuilder sb32 = new StringBuilder();
                        sb32.append("(flow) current userId is ");
                        sb32.append(m51234g22);
                        if (AbstractC19074t.m100204b(c27417l.m140378b(), User.Anonymous.f50006J)) {
                        }
                        C24848g0 c24848g022 = C24848g0.f119245a;
                        reentrantLock2.unlock();
                        return (Flow) this.f92160v.mo12V4();
                    } finally {
                    }
                    C18171h c18171h5 = this.f92159u;
                    this.f92158t = 3;
                    if (c18171h5.m96663X0((AuthInfo) obj, this) == m142578e) {
                        return m142578e;
                    }
                    reentrantLock = this.f92159u.f91894d;
                    C18171h c18171h22 = this.f92159u;
                    reentrantLock.lock();
                } catch (Throwable th2) {
                    reentrantLock = this.f92159u.f91894d;
                    C18171h c18171h6 = this.f92159u;
                    reentrantLock.lock();
                    try {
                        C27417l c27417l3 = C27417l.f129055a;
                        String m51234g3 = c27417l3.m140378b().m51234g();
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("(flow) current userId is ");
                        sb4.append(m51234g3);
                        if (!AbstractC19074t.m100204b(c27417l3.m140378b(), User.Anonymous.f50006J)) {
                            MutableStateFlow mutableStateFlow6 = c18171h6.f91893c;
                            do {
                                value2 = mutableStateFlow6.getValue();
                            } while (!mutableStateFlow6.mo113436i(value2, AbstractC18166c.b.f91847a));
                        } else {
                            MutableStateFlow mutableStateFlow7 = c18171h6.f91893c;
                            do {
                                value = mutableStateFlow7.getValue();
                            } while (!mutableStateFlow7.mo113436i(value, AbstractC18166c.a.f91846a));
                        }
                        C24848g0 c24848g03 = C24848g0.f119245a;
                        reentrantLock.unlock();
                        throw th2;
                    } finally {
                        reentrantLock.unlock();
                    }
                }
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s1(InterfaceC18494a interfaceC18494a) {
            super(0);
            this.f92157r = interfaceC18494a;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Flow mo12V4() {
            return (Flow) BuildersKt.m112532e(Dispatchers.m112680b(), new a(C18171h.this, this.f92157r, null));
        }
    }

    /* renamed from: e10.h$t */
    /* loaded from: classes5.dex */
    static final class t extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f92165t;

        /* renamed from: v */
        final /* synthetic */ LoadMoreInfo f92167v;

        /* renamed from: w */
        final /* synthetic */ int f92168w;

        /* renamed from: x */
        final /* synthetic */ List f92169x;

        /* renamed from: y */
        final /* synthetic */ int f92170y;

        /* renamed from: z */
        final /* synthetic */ int f92171z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        t(LoadMoreInfo loadMoreInfo, int i11, List list, int i12, int i13, Continuation continuation) {
            super(1, continuation);
            this.f92167v = loadMoreInfo;
            this.f92168w = i11;
            this.f92169x = list;
            this.f92170y = i12;
            this.f92171z = i13;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            String m131214n0;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f92165t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC24862s.m129228b(obj);
            C9447a.a m51579p = C9447a.Companion.m51593a(C18171h.this, "v1/user/core/get/adsv2").m51579p(this.f92167v);
            int i12 = this.f92168w;
            List list = this.f92169x;
            int i13 = this.f92170y;
            int i14 = this.f92171z;
            C9447a.a.m51566g(m51579p, "numShowedAds", String.valueOf(i12), false, 4, null);
            m131214n0 = AbstractC25332a0.m131214n0(list, ",", null, null, 0, null, null, 62, null);
            C9447a.a.m51566g(m51579p, "listIndexAds", m131214n0, false, 4, null);
            C9447a.a.m51566g(m51579p, "numCalledAds", String.valueOf(i13), false, 4, null);
            C9447a.a.m51566g(m51579p, "currentIndex", String.valueOf(i14), false, 4, null);
            KSerializer serializer = ComplexAds.Companion.serializer();
            this.f92165t = 1;
            Object m51581t = m51579p.m51581t(serializer, this);
            if (m51581t == m142578e) {
                return m142578e;
            }
            return m51581t;
        }

        /* renamed from: r */
        public final Continuation m96805r(Continuation continuation) {
            return new t(this.f92167v, this.f92168w, this.f92169x, this.f92170y, this.f92171z, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((t) m96805r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: e10.h$t0 */
    /* loaded from: classes5.dex */
    static final class t0 extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        Object f92172t;

        /* renamed from: u */
        int f92173u;

        /* renamed from: w */
        final /* synthetic */ String f92175w;

        /* renamed from: x */
        final /* synthetic */ LoadMoreInfo f92176x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        t0(String str, LoadMoreInfo loadMoreInfo, Continuation continuation) {
            super(1, continuation);
            this.f92175w = str;
            this.f92176x = loadMoreInfo;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            C18171h c18171h;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f92173u;
            if (i11 != 0) {
                if (i11 == 1) {
                    c18171h = (C18171h) this.f92172t;
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C18171h c18171h2 = C18171h.this;
                C9447a.a m51579p = C9447a.a.m51566g(C9447a.Companion.m51593a(c18171h2, "v1/notification/user/get/list"), ZinstantMetaConstant.IMPRESSION_META_TYPE, this.f92175w, false, 4, null).m51579p(this.f92176x);
                Section.C9424a c9424a = new Section.C9424a(Notification.Companion.serializer());
                this.f92172t = c18171h2;
                this.f92173u = 1;
                Object m51581t = m51579p.m51581t(c9424a, this);
                if (m51581t == m142578e) {
                    return m142578e;
                }
                c18171h = c18171h2;
                obj = m51581t;
            }
            return c18171h.m96660U0((Section) obj);
        }

        /* renamed from: r */
        public final Continuation m96807r(Continuation continuation) {
            return new t0(this.f92175w, this.f92176x, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((t0) m96807r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e10.h$t1 */
    /* loaded from: classes5.dex */
    public static final class t1 extends AbstractC29096d {

        /* renamed from: s */
        Object f92177s;

        /* renamed from: t */
        Object f92178t;

        /* renamed from: u */
        /* synthetic */ Object f92179u;

        /* renamed from: w */
        int f92181w;

        t1(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f92179u = obj;
            this.f92181w |= Integer.MIN_VALUE;
            return C18171h.this.m96663X0(null, this);
        }
    }

    /* renamed from: e10.h$u */
    /* loaded from: classes5.dex */
    static final class u extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f92182t;

        /* renamed from: v */
        final /* synthetic */ LoadMoreInfo f92184v;

        /* renamed from: w */
        final /* synthetic */ Integer f92185w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        u(LoadMoreInfo loadMoreInfo, Integer num, Continuation continuation) {
            super(1, continuation);
            this.f92184v = loadMoreInfo;
            this.f92185w = num;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            int i11;
            m142578e = AbstractC28298d.m142578e();
            int i12 = this.f92182t;
            if (i12 != 0) {
                if (i12 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C9447a.a m51593a = C9447a.Companion.m51593a(C18171h.this, "v1/channel/my/get/list_follower");
                if (this.f92184v != null) {
                    i11 = 880029;
                } else {
                    i11 = 880028;
                }
                C9447a.a m51579p = m51593a.m51583v(i11).m51579p(this.f92184v);
                Integer num = this.f92185w;
                if (num != null) {
                    C9447a.a.m51566g(m51579p, "value", num.toString(), false, 4, null);
                }
                Section.C9424a c9424a = new Section.C9424a(new User.C9432b());
                this.f92182t = 1;
                obj = m51579p.m51581t(c9424a, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            return obj;
        }

        /* renamed from: r */
        public final Continuation m96809r(Continuation continuation) {
            return new u(this.f92184v, this.f92185w, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((u) m96809r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: e10.h$u0 */
    /* loaded from: classes5.dex */
    static final class u0 extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        Object f92186t;

        /* renamed from: u */
        int f92187u;

        u0(Continuation continuation) {
            super(1, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f92187u;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        UserProfileResult userProfileResult = (UserProfileResult) this.f92186t;
                        AbstractC24862s.m129228b(obj);
                        return userProfileResult;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                C9447a.a m51566g = C9447a.a.m51566g(C9447a.Companion.m51593a(C18171h.this, "v1/user/core/get/user").m51583v(880052), "id", C27417l.f129055a.m140378b().m51234g(), false, 4, null);
                UserProfileResult.C9433a c9433a = new UserProfileResult.C9433a();
                this.f92187u = 1;
                obj = m51566g.m51581t(c9433a, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            UserProfileResult userProfileResult2 = (UserProfileResult) obj;
            C18171h c18171h = C18171h.this;
            User m51258b = userProfileResult2.m51258b();
            Channel m51257a = userProfileResult2.m51257a();
            this.f92186t = userProfileResult2;
            this.f92187u = 2;
            if (c18171h.m96667b1(m51258b, m51257a, this) == m142578e) {
                return m142578e;
            }
            return userProfileResult2;
        }

        /* renamed from: r */
        public final Continuation m96811r(Continuation continuation) {
            return new u0(continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((u0) m96811r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e10.h$u1 */
    /* loaded from: classes5.dex */
    public static final class u1 extends AbstractC29096d {

        /* renamed from: s */
        Object f92189s;

        /* renamed from: t */
        Object f92190t;

        /* renamed from: u */
        int f92191u;

        /* renamed from: v */
        int f92192v;

        /* renamed from: w */
        /* synthetic */ Object f92193w;

        /* renamed from: y */
        int f92195y;

        u1(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f92193w = obj;
            this.f92195y |= Integer.MIN_VALUE;
            return C18171h.this.m96665Z0(0, null, this);
        }
    }

    /* renamed from: e10.h$v */
    /* loaded from: classes5.dex */
    static final class v extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f92196t;

        /* renamed from: v */
        final /* synthetic */ LoadMoreInfo f92198v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        v(LoadMoreInfo loadMoreInfo, Continuation continuation) {
            super(1, continuation);
            this.f92198v = loadMoreInfo;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            int i11;
            m142578e = AbstractC28298d.m142578e();
            int i12 = this.f92196t;
            if (i12 != 0) {
                if (i12 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C9447a.a m51593a = C9447a.Companion.m51593a(C18171h.this, "v1/user/my/get/list_following");
                if (this.f92198v != null) {
                    i11 = 880031;
                } else {
                    i11 = 880030;
                }
                C9447a.a m51579p = m51593a.m51583v(i11).m51579p(this.f92198v);
                Section.C9424a c9424a = new Section.C9424a(new Channel.C9382b());
                this.f92196t = 1;
                obj = m51579p.m51581t(c9424a, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            InterfaceC29283d m143692z = AbstractC28684a.Companion.m143692z();
            Iterator it = ((Section) obj).m51168m().iterator();
            while (it.hasNext()) {
                m143692z.mo146375n(((Channel) it.next()).m50769l(), true);
            }
            return obj;
        }

        /* renamed from: r */
        public final Continuation m96813r(Continuation continuation) {
            return new v(this.f92198v, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((v) m96813r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: e10.h$v0 */
    /* loaded from: classes5.dex */
    static final class v0 extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f92199t;

        v0(Continuation continuation) {
            super(1, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f92199t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C9447a.a m51583v = C9447a.Companion.m51593a(C18171h.this, "v1/user/my/get/list_topics").m51583v(880015);
                BreakSlot.C9379b c9379b = new BreakSlot.C9379b();
                this.f92199t = 1;
                obj = m51583v.m51581t(c9379b, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            return obj;
        }

        /* renamed from: r */
        public final Continuation m96815r(Continuation continuation) {
            return new v0(continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((v0) m96815r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: e10.h$v1 */
    /* loaded from: classes5.dex */
    static final class v1 extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: A */
        final /* synthetic */ Integer f92201A;

        /* renamed from: B */
        final /* synthetic */ String f92202B;

        /* renamed from: C */
        final /* synthetic */ Integer f92203C;

        /* renamed from: D */
        final /* synthetic */ String f92204D;

        /* renamed from: E */
        final /* synthetic */ String f92205E;

        /* renamed from: F */
        final /* synthetic */ Integer f92206F;

        /* renamed from: G */
        final /* synthetic */ Integer f92207G;

        /* renamed from: t */
        int f92208t;

        /* renamed from: v */
        final /* synthetic */ String f92210v;

        /* renamed from: w */
        final /* synthetic */ String f92211w;

        /* renamed from: x */
        final /* synthetic */ int f92212x;

        /* renamed from: y */
        final /* synthetic */ String f92213y;

        /* renamed from: z */
        final /* synthetic */ String f92214z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        v1(String str, String str2, int i11, String str3, String str4, Integer num, String str5, Integer num2, String str6, String str7, Integer num3, Integer num4, Continuation continuation) {
            super(1, continuation);
            this.f92210v = str;
            this.f92211w = str2;
            this.f92212x = i11;
            this.f92213y = str3;
            this.f92214z = str4;
            this.f92201A = num;
            this.f92202B = str5;
            this.f92203C = num2;
            this.f92204D = str6;
            this.f92205E = str7;
            this.f92206F = num3;
            this.f92207G = num4;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f92208t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC24862s.m129228b(obj);
            C9447a.a m51583v = C9447a.Companion.m51596d(C18171h.this, "v1/comment/user/add/comment").m51583v(880046);
            String str = this.f92210v;
            String str2 = this.f92211w;
            int i12 = this.f92212x;
            String str3 = this.f92213y;
            String str4 = this.f92214z;
            Integer num = this.f92201A;
            String str5 = this.f92202B;
            Integer num2 = this.f92203C;
            String str6 = this.f92204D;
            String str7 = this.f92205E;
            Integer num3 = this.f92206F;
            Integer num4 = this.f92207G;
            C9447a.a.m51566g(m51583v, "videoId", str, false, 4, null);
            C9447a.a.m51566g(m51583v, "ownerId", str2, false, 4, null);
            C9447a.a.m51566g(m51583v, "ownerType", String.valueOf(i12), false, 4, null);
            C9447a.a.m51566g(m51583v, "content", str3, false, 4, null);
            if (str4 != null) {
                C9447a.a.m51566g(m51583v, "mentionId", str4, false, 4, null);
            }
            if (num != null) {
                C9447a.a.m51566g(m51583v, "mentionType", String.valueOf(num.intValue()), false, 4, null);
            }
            if (str5 != null) {
                C9447a.a.m51566g(m51583v, "attachmentId", str5, false, 4, null);
            }
            if (num2 != null) {
                C9447a.a.m51566g(m51583v, "attachmentType", String.valueOf(num2.intValue()), false, 4, null);
            }
            if (str6 != null) {
                C9447a.a.m51566g(m51583v, "adId", str6, false, 4, null);
            }
            if (str7 != null) {
                C9447a.a.m51566g(m51583v, "adSrc", str7, false, 4, null);
            }
            if (num3 != null) {
                C9447a.a.m51566g(m51583v, "adIndex", String.valueOf(num3.intValue()), false, 4, null);
            }
            if (num4 != null) {
                C9447a.a.m51566g(m51583v, "numShowedAd", String.valueOf(num4.intValue()), false, 4, null);
            }
            Comment.C9387b c9387b = new Comment.C9387b();
            this.f92208t = 1;
            Object m51581t = m51583v.m51581t(c9387b, this);
            if (m51581t == m142578e) {
                return m142578e;
            }
            return m51581t;
        }

        /* renamed from: r */
        public final Continuation m96817r(Continuation continuation) {
            return new v1(this.f92210v, this.f92211w, this.f92212x, this.f92213y, this.f92214z, this.f92201A, this.f92202B, this.f92203C, this.f92204D, this.f92205E, this.f92206F, this.f92207G, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((v1) m96817r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: e10.h$w */
    /* loaded from: classes5.dex */
    static final class w extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f92215t;

        w(Continuation continuation) {
            super(1, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f92215t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C9447a.a m51583v = C9447a.Companion.m51593a(C18171h.this, "v1/home/following/get/boxes").m51583v(880094);
                KSerializer m133617h = AbstractC25935a.m133617h(new SectionBoxData.C9427b());
                this.f92215t = 1;
                obj = m51583v.m51581t(m133617h, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            return obj;
        }

        /* renamed from: r */
        public final Continuation m96819r(Continuation continuation) {
            return new w(continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((w) m96819r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: e10.h$w0 */
    /* loaded from: classes5.dex */
    static final class w0 extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f92217t;

        /* renamed from: v */
        final /* synthetic */ String f92219v;

        /* renamed from: w */
        final /* synthetic */ LoadMoreInfo f92220w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w0(String str, LoadMoreInfo loadMoreInfo, Continuation continuation) {
            super(1, continuation);
            this.f92219v = str;
            this.f92220w = loadMoreInfo;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            int m131511r;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f92217t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C9447a.a m51583v = C9447a.a.m51566g(C9447a.Companion.m51593a(C18171h.this, "v1/video/core/get/list_by_location"), "data", this.f92219v, false, 4, null).m51579p(this.f92220w).m51583v(880092);
                Section.C9424a c9424a = new Section.C9424a(new VideoData.C9437b());
                this.f92217t = 1;
                obj = m51583v.m51581t(c9424a, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            Section section = (Section) obj;
            List m51168m = section.m51168m();
            m131511r = AbstractC25370t.m131511r(m51168m, 10);
            ArrayList arrayList = new ArrayList(m131511r);
            Iterator it = m51168m.iterator();
            while (it.hasNext()) {
                arrayList.add(new Video((VideoData) it.next()));
            }
            Section section2 = new Section(arrayList, section.m51170o(), section.m51169n());
            List m51168m2 = section2.m51168m();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : m51168m2) {
                if (((Video) obj2).m52905o0()) {
                    arrayList2.add(obj2);
                }
            }
            section2.m51172q(arrayList2);
            Iterator it2 = section2.m51168m().iterator();
            while (it2.hasNext()) {
                ((Video) it2.next()).m52868T0(ZVideoUtilMetadata.ZMETADATA_KEY_LOCATION);
            }
            C19205a.m100677S(C19205a.f95429a, section2.m51168m(), ZVideoUtilMetadata.ZMETADATA_KEY_LOCATION, null, 4, null);
            return section2;
        }

        /* renamed from: r */
        public final Continuation m96821r(Continuation continuation) {
            return new w0(this.f92219v, this.f92220w, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((w0) m96821r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: e10.h$w1 */
    /* loaded from: classes5.dex */
    static final class w1 extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f92221t;

        /* renamed from: u */
        final /* synthetic */ C19205a.b f92222u;

        /* renamed from: v */
        final /* synthetic */ C18171h f92223v;

        /* renamed from: w */
        final /* synthetic */ String f92224w;

        /* renamed from: e10.h$w1$a */
        /* loaded from: classes5.dex */
        public /* synthetic */ class a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f92225a;

            static {
                int[] iArr = new int[C19205a.b.values().length];
                try {
                    iArr[C19205a.b.f95464p.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[C19205a.b.f95465q.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[C19205a.b.f95467s.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[C19205a.b.f95468t.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[C19205a.b.f95466r.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[C19205a.b.f95469u.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[C19205a.b.f95470v.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[C19205a.b.f95472x.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[C19205a.b.f95471w.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[C19205a.b.f95474z.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[C19205a.b.f95473y.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                f92225a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w1(C19205a.b bVar, C18171h c18171h, String str, Continuation continuation) {
            super(1, continuation);
            this.f92222u = bVar;
            this.f92223v = c18171h;
            this.f92224w = str;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            String str;
            int i11;
            m142578e = AbstractC28298d.m142578e();
            int i12 = this.f92221t;
            if (i12 != 0) {
                if (i12 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                switch (a.f92225a[this.f92222u.ordinal()]) {
                    case 1:
                        str = "v1/view";
                        i11 = 886001;
                        break;
                    case 2:
                        str = "v1/upload";
                        i11 = 886006;
                        break;
                    case 3:
                        str = "v1/impression";
                        i11 = 886003;
                        break;
                    case 4:
                        str = "v1/session";
                        i11 = 886004;
                        break;
                    case 5:
                        str = "v1/event";
                        i11 = 886002;
                        break;
                    case 6:
                        str = "v1/listing";
                        i11 = 886005;
                        break;
                    case 7:
                        str = "v1/ads/view";
                        i11 = 886007;
                        break;
                    case 8:
                        str = "v1/ads/impression";
                        i11 = 886009;
                        break;
                    case 9:
                        str = "v1/ads/event";
                        i11 = 886008;
                        break;
                    case 10:
                        str = "v1/live/event";
                        i11 = 886010;
                        break;
                    case 11:
                        str = "v1/live/view";
                        i11 = 886011;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                C9447a.a m51577f = C9447a.Companion.m51597e(this.f92223v, str).m51583v(i11).m51577f("data", this.f92224w, false);
                LogResultInfo.C9406a c9406a = new LogResultInfo.C9406a();
                this.f92221t = 1;
                obj = m51577f.m51581t(c9406a, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            return obj;
        }

        /* renamed from: r */
        public final Continuation m96823r(Continuation continuation) {
            return new w1(this.f92222u, this.f92223v, this.f92224w, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((w1) m96823r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: e10.h$x */
    /* loaded from: classes5.dex */
    static final class x extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f92226t;

        x(Continuation continuation) {
            super(1, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f92226t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C9447a.a m51583v = C9447a.Companion.m51593a(C18171h.this, "v1/home/trending/get/boxes").m51583v(880093);
                KSerializer m133617h = AbstractC25935a.m133617h(new SectionBoxData.C9427b());
                this.f92226t = 1;
                obj = m51583v.m51581t(m133617h, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            return obj;
        }

        /* renamed from: r */
        public final Continuation m96825r(Continuation continuation) {
            return new x(continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((x) m96825r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: e10.h$x0 */
    /* loaded from: classes5.dex */
    static final class x0 extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f92228t;

        /* renamed from: v */
        final /* synthetic */ String f92230v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        x0(String str, Continuation continuation) {
            super(1, continuation);
            this.f92230v = str;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f92228t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C9447a.a m51583v = C9447a.a.m51566g(C9447a.Companion.m51593a(C18171h.this, "v1/video/core/get/detail"), "id", this.f92230v, false, 4, null).m51583v(880013);
                VideoData.C9437b c9437b = new VideoData.C9437b();
                this.f92228t = 1;
                obj = m51583v.m51581t(c9437b, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            return new Video((VideoData) obj);
        }

        /* renamed from: r */
        public final Continuation m96827r(Continuation continuation) {
            return new x0(this.f92230v, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((x0) m96827r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: e10.h$x1 */
    /* loaded from: classes5.dex */
    static final class x1 extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: A */
        final /* synthetic */ Integer f92231A;

        /* renamed from: B */
        final /* synthetic */ String f92232B;

        /* renamed from: C */
        final /* synthetic */ Integer f92233C;

        /* renamed from: D */
        final /* synthetic */ String f92234D;

        /* renamed from: E */
        final /* synthetic */ String f92235E;

        /* renamed from: F */
        final /* synthetic */ Integer f92236F;

        /* renamed from: G */
        final /* synthetic */ Integer f92237G;

        /* renamed from: H */
        final /* synthetic */ String f92238H;

        /* renamed from: t */
        int f92239t;

        /* renamed from: v */
        final /* synthetic */ String f92241v;

        /* renamed from: w */
        final /* synthetic */ String f92242w;

        /* renamed from: x */
        final /* synthetic */ int f92243x;

        /* renamed from: y */
        final /* synthetic */ String f92244y;

        /* renamed from: z */
        final /* synthetic */ String f92245z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        x1(String str, String str2, int i11, String str3, String str4, Integer num, String str5, Integer num2, String str6, String str7, Integer num3, Integer num4, String str8, Continuation continuation) {
            super(1, continuation);
            this.f92241v = str;
            this.f92242w = str2;
            this.f92243x = i11;
            this.f92244y = str3;
            this.f92245z = str4;
            this.f92231A = num;
            this.f92232B = str5;
            this.f92233C = num2;
            this.f92234D = str6;
            this.f92235E = str7;
            this.f92236F = num3;
            this.f92237G = num4;
            this.f92238H = str8;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f92239t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC24862s.m129228b(obj);
            C9447a.a m51583v = C9447a.Companion.m51596d(C18171h.this, "v1/comment/user/add/reply").m51583v(880083);
            String str = this.f92241v;
            String str2 = this.f92242w;
            int i12 = this.f92243x;
            String str3 = this.f92244y;
            String str4 = this.f92245z;
            Integer num = this.f92231A;
            String str5 = this.f92232B;
            Integer num2 = this.f92233C;
            String str6 = this.f92234D;
            String str7 = this.f92235E;
            Integer num3 = this.f92236F;
            Integer num4 = this.f92237G;
            String str8 = this.f92238H;
            C9447a.a.m51566g(m51583v, "parentId", str, false, 4, null);
            C9447a.a.m51566g(m51583v, "ownerId", str2, false, 4, null);
            C9447a.a.m51566g(m51583v, "ownerType", String.valueOf(i12), false, 4, null);
            C9447a.a.m51566g(m51583v, "content", str3, false, 4, null);
            if (str4 != null) {
                C9447a.a.m51566g(m51583v, "mentionId", str4, false, 4, null);
            }
            if (num != null) {
                C9447a.a.m51566g(m51583v, "mentionType", String.valueOf(num.intValue()), false, 4, null);
            }
            if (str5 != null) {
                C9447a.a.m51566g(m51583v, "attachmentId", str5, false, 4, null);
            }
            if (num2 != null) {
                C9447a.a.m51566g(m51583v, "attachmentType", String.valueOf(num2.intValue()), false, 4, null);
            }
            if (str6 != null) {
                C9447a.a.m51566g(m51583v, "adId", str6, false, 4, null);
            }
            if (str7 != null) {
                C9447a.a.m51566g(m51583v, "adSrc", str7, false, 4, null);
            }
            if (num3 != null) {
                C9447a.a.m51566g(m51583v, "adIndex", String.valueOf(num3.intValue()), false, 4, null);
            }
            if (num4 != null) {
                C9447a.a.m51566g(m51583v, "numShowedAd", String.valueOf(num4.intValue()), false, 4, null);
            }
            if (str8 != null) {
                C9447a.a.m51566g(m51583v, "fromSrcId", str8, false, 4, null);
            }
            Comment.C9387b c9387b = new Comment.C9387b();
            this.f92239t = 1;
            Object m51581t = m51583v.m51581t(c9387b, this);
            if (m51581t == m142578e) {
                return m142578e;
            }
            return m51581t;
        }

        /* renamed from: r */
        public final Continuation m96829r(Continuation continuation) {
            return new x1(this.f92241v, this.f92242w, this.f92243x, this.f92244y, this.f92245z, this.f92231A, this.f92232B, this.f92233C, this.f92234D, this.f92235E, this.f92236F, this.f92237G, this.f92238H, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((x1) m96829r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: e10.h$y */
    /* loaded from: classes5.dex */
    static final class y extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f92246t;

        y(Continuation continuation) {
            super(1, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f92246t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C9447a.a m51583v = C9447a.Companion.m51593a(C18171h.this, "v1/home/friend/get/boxes").m51583v(880095);
                KSerializer m133617h = AbstractC25935a.m133617h(new SectionBoxData.C9427b());
                this.f92246t = 1;
                obj = m51583v.m51581t(m133617h, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            return obj;
        }

        /* renamed from: r */
        public final Continuation m96831r(Continuation continuation) {
            return new y(continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((y) m96831r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: e10.h$y0 */
    /* loaded from: classes5.dex */
    static final class y0 extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f92248t;

        /* renamed from: v */
        final /* synthetic */ LoadMoreInfo f92250v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        y0(LoadMoreInfo loadMoreInfo, Continuation continuation) {
            super(1, continuation);
            this.f92250v = loadMoreInfo;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            int i11;
            int m131511r;
            m142578e = AbstractC28298d.m142578e();
            int i12 = this.f92248t;
            if (i12 != 0) {
                if (i12 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C9447a.a m51593a = C9447a.Companion.m51593a(C18171h.this, "v1/user/my/get/list_bookmarked_video");
                if (this.f92250v != null) {
                    i11 = 880059;
                } else {
                    i11 = 880058;
                }
                C9447a.a m51579p = m51593a.m51583v(i11).m51579p(this.f92250v);
                Section.C9424a c9424a = new Section.C9424a(new VideoData.C9437b());
                this.f92248t = 1;
                obj = m51579p.m51581t(c9424a, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            Section section = (Section) obj;
            List m51168m = section.m51168m();
            m131511r = AbstractC25370t.m131511r(m51168m, 10);
            ArrayList arrayList = new ArrayList(m131511r);
            Iterator it = m51168m.iterator();
            while (it.hasNext()) {
                arrayList.add(new Video((VideoData) it.next()));
            }
            Section section2 = new Section(arrayList, section.m51170o(), section.m51169n());
            List m51168m2 = section2.m51168m();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : m51168m2) {
                if (((Video) obj2).m52905o0()) {
                    arrayList2.add(obj2);
                }
            }
            section2.m51172q(arrayList2);
            InterfaceC29283d m143692z = AbstractC28684a.Companion.m143692z();
            for (Video video : section2.m51168m()) {
                video.m52868T0("saved_video");
                m143692z.mo146383v(video.m52911t(), AbstractC29094b.m145339a(true), AbstractC29094b.m145342d(video.m52835B()));
            }
            return section2;
        }

        /* renamed from: r */
        public final Continuation m96833r(Continuation continuation) {
            return new y0(this.f92250v, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((y0) m96833r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: e10.h$y1 */
    /* loaded from: classes5.dex */
    static final class y1 extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f92251t;

        /* renamed from: v */
        final /* synthetic */ BreakSlot f92253v;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: e10.h$y1$a */
        /* loaded from: classes5.dex */
        public static final class a extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            public static final a f92254q = new a();

            a() {
                super(1);
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CharSequence mo205i9(BreakSlot.Option option) {
                AbstractC19074t.m100208f(option, "it");
                return option.m50700a();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        y1(BreakSlot breakSlot, Continuation continuation) {
            super(1, continuation);
            this.f92253v = breakSlot;
        }

        /* JADX WARN: Code restructure failed: missing block: B:31:0x007e, code lost:            if (com.zing.zalo.shortvideo.data.remote.common.C9447a.a.m51566g(r14, "topicIds", r5, false, 4, null) != null) goto L28;     */
        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo239o(Object obj) {
            Object m142578e;
            ArrayList m50685f;
            String m131214n0;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f92251t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C9447a.a m51583v = C9447a.Companion.m51596d(C18171h.this, "v1/feedback/user/put/topic").m51583v(880017);
                BreakSlot breakSlot = this.f92253v;
                if (breakSlot != null && (m50685f = breakSlot.m50685f()) != null) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : m50685f) {
                        if (((BreakSlot.Option) obj2).m50702c()) {
                            arrayList.add(obj2);
                        }
                    }
                    if (!(!arrayList.isEmpty())) {
                        arrayList = null;
                    }
                    ArrayList arrayList2 = arrayList;
                    if (arrayList2 != null) {
                        m131214n0 = AbstractC25332a0.m131214n0(arrayList2, ",", null, null, 0, null, a.f92254q, 30, null);
                        if (m131214n0 != null) {
                        }
                    }
                }
                C9447a.a.m51566g(m51583v, "topicIds", "", false, 4, null);
                this.f92251t = 1;
                obj = m51583v.m51580s(this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            return obj;
        }

        /* renamed from: r */
        public final Continuation m96835r(Continuation continuation) {
            return new y1(this.f92253v, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((y1) m96835r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: e10.h$z */
    /* loaded from: classes5.dex */
    static final class z extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f92255t;

        /* renamed from: v */
        final /* synthetic */ LoadMoreInfo f92257v;

        /* renamed from: w */
        final /* synthetic */ String f92258w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        z(LoadMoreInfo loadMoreInfo, String str, Continuation continuation) {
            super(1, continuation);
            this.f92257v = loadMoreInfo;
            this.f92258w = str;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            int i11;
            boolean m127128x;
            m142578e = AbstractC28298d.m142578e();
            int i12 = this.f92255t;
            if (i12 != 0) {
                if (i12 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C9447a.a m51579p = C9447a.Companion.m51593a(C18171h.this, "v1/home/for_you/get/list_video_following").m51579p(this.f92257v);
                LoadMoreInfo loadMoreInfo = this.f92257v;
                String str = this.f92258w;
                if (loadMoreInfo == null && str != null) {
                    m127128x = AbstractC24341v.m127128x(str);
                    if (!m127128x) {
                        C9447a.a.m51566g(m51579p, "sourceVideoId", str, false, 4, null);
                    }
                }
                if (this.f92257v != null) {
                    i11 = 880004;
                } else {
                    i11 = 880003;
                }
                C9447a.a m51583v = m51579p.m51583v(i11);
                FollowingData.C9397b c9397b = new FollowingData.C9397b();
                this.f92255t = 1;
                obj = m51583v.m51581t(c9397b, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            FollowingData followingData = (FollowingData) obj;
            Section m50926d = followingData.m50926d();
            List m51168m = followingData.m50926d().m51168m();
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : m51168m) {
                if (((Video) obj2).m52905o0()) {
                    arrayList.add(obj2);
                }
            }
            m50926d.m51172q(arrayList);
            Iterator it = followingData.m50926d().m51168m().iterator();
            while (it.hasNext()) {
                ((Video) it.next()).m52868T0("following");
            }
            C19205a.m100677S(C19205a.f95429a, followingData.m50926d().m51168m(), "following", null, 4, null);
            return obj;
        }

        /* renamed from: r */
        public final Continuation m96838r(Continuation continuation) {
            return new z(this.f92257v, this.f92258w, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((z) m96838r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: e10.h$z0 */
    /* loaded from: classes5.dex */
    static final class z0 extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f92259t;

        /* renamed from: v */
        final /* synthetic */ String f92261v;

        /* renamed from: w */
        final /* synthetic */ LoadMoreInfo f92262w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        z0(String str, LoadMoreInfo loadMoreInfo, Continuation continuation) {
            super(1, continuation);
            this.f92261v = str;
            this.f92262w = loadMoreInfo;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            int m131511r;
            String str;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f92259t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C9447a.a m51593a = C9447a.Companion.m51593a(C18171h.this, "v1/video/core/get/list_by_channel");
                if (this.f92262w != null) {
                    m51593a.m51583v(880026);
                }
                C9447a.a m51579p = C9447a.a.m51566g(m51593a, "id", this.f92261v, false, 4, null).m51579p(this.f92262w);
                Section.C9424a c9424a = new Section.C9424a(new VideoData.C9437b());
                this.f92259t = 1;
                obj = m51579p.m51581t(c9424a, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            Section section = (Section) obj;
            List m51168m = section.m51168m();
            m131511r = AbstractC25370t.m131511r(m51168m, 10);
            ArrayList arrayList = new ArrayList(m131511r);
            Iterator it = m51168m.iterator();
            while (it.hasNext()) {
                arrayList.add(new Video((VideoData) it.next()));
            }
            Section section2 = new Section(arrayList, section.m51170o(), section.m51169n());
            String str2 = this.f92261v;
            Channel m140377a = C27417l.f129055a.m140377a();
            if (m140377a != null) {
                str = m140377a.m50769l();
            } else {
                str = null;
            }
            if (!AbstractC19074t.m100204b(str, str2)) {
                List m51168m2 = section2.m51168m();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : m51168m2) {
                    if (((Video) obj2).m52905o0()) {
                        arrayList2.add(obj2);
                    }
                }
                section2.m51172q(arrayList2);
                Iterator it2 = section2.m51168m().iterator();
                while (it2.hasNext()) {
                    ((Video) it2.next()).m52868T0("channel_profile_full");
                }
                C19205a.m100677S(C19205a.f95429a, section2.m51168m(), "channel_profile_full", null, 4, null);
            } else {
                Iterator it3 = section2.m51168m().iterator();
                while (it3.hasNext()) {
                    ((Video) it3.next()).m52868T0("my_profile");
                }
                C19205a.m100677S(C19205a.f95429a, section2.m51168m(), "my_profile", null, 4, null);
            }
            return section2;
        }

        /* renamed from: r */
        public final Continuation m96840r(Continuation continuation) {
            return new z0(this.f92261v, this.f92262w, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((z0) m96840r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: e10.h$z1 */
    /* loaded from: classes5.dex */
    static final class z1 extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f92263t;

        /* renamed from: v */
        final /* synthetic */ BreakSlot f92265v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        z1(BreakSlot breakSlot, Continuation continuation) {
            super(1, continuation);
            this.f92265v = breakSlot;
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x00aa A[RETURN] */
        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo239o(Object obj) {
            Object m142578e;
            String str;
            String str2;
            Object obj2;
            String m50700a;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f92263t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C9447a.a m51583v = C9447a.Companion.m51596d(C18171h.this, "v1/feedback/user/put/survey").m51583v(880018);
                BreakSlot breakSlot = this.f92265v;
                if (breakSlot.m50683d() >= 0) {
                    C9447a.a.m51566g(m51583v, "index", String.valueOf(breakSlot.m50683d()), false, 4, null);
                }
                if (breakSlot.m50691l() != null) {
                    C9447a.a.m51566g(m51583v, "videoId", breakSlot.m50691l(), false, 4, null);
                }
                String m50687h = breakSlot.m50687h();
                if (m50687h == null) {
                    str = "";
                } else {
                    str = m50687h;
                }
                C9447a.a.m51566g(m51583v, "templateId", str, false, 4, null);
                ArrayList m50685f = breakSlot.m50685f();
                if (m50685f != null) {
                    Iterator it = m50685f.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj2 = it.next();
                            if (((BreakSlot.Option) obj2).m50702c()) {
                                break;
                            }
                        } else {
                            obj2 = null;
                            break;
                        }
                    }
                    BreakSlot.Option option = (BreakSlot.Option) obj2;
                    if (option != null && (m50700a = option.m50700a()) != null) {
                        str2 = m50700a;
                        C9447a.a.m51566g(m51583v, "optionId", str2, false, 4, null);
                        this.f92263t = 1;
                        obj = m51583v.m51580s(this);
                        if (obj != m142578e) {
                            return m142578e;
                        }
                    }
                }
                str2 = "";
                C9447a.a.m51566g(m51583v, "optionId", str2, false, 4, null);
                this.f92263t = 1;
                obj = m51583v.m51580s(this);
                if (obj != m142578e) {
                }
            }
            return obj;
        }

        /* renamed from: r */
        public final Continuation m96842r(Continuation continuation) {
            return new z1(this.f92265v, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo205i9(Continuation continuation) {
            return ((z1) m96842r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    public C18171h(InterfaceC29280a interfaceC29280a, InterfaceC30248b interfaceC30248b) {
        AbstractC19074t.m100208f(interfaceC29280a, "cacheRepo");
        AbstractC19074t.m100208f(interfaceC30248b, "dbRepo");
        this.f91891a = interfaceC29280a;
        this.f91892b = interfaceC30248b;
        this.f91894d = new ReentrantLock();
        if (AbstractC19074t.m100204b(C27417l.f129055a.m140378b(), User.Anonymous.f50006J)) {
            this.f91893c = StateFlowKt.m113503a(AbstractC18166c.a.f91846a);
        } else {
            this.f91893c = StateFlowKt.m113503a(AbstractC18166c.b.f91847a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: S0 */
    public final AbstractC18166c m96658S0() {
        AbstractC18166c abstractC18166c;
        Object value;
        boolean m127128x;
        Object value2;
        ReentrantLock reentrantLock = this.f91894d;
        reentrantLock.lock();
        try {
            if (AbstractC19074t.m100204b(this.f91893c.getValue(), AbstractC18166c.b.f91847a)) {
                m127128x = AbstractC24341v.m127128x(C27417l.f129055a.m140388l());
                if (m127128x) {
                    MutableStateFlow mutableStateFlow = this.f91893c;
                    do {
                        value2 = mutableStateFlow.getValue();
                    } while (!mutableStateFlow.mo113436i(value2, AbstractC18166c.a.f91846a));
                    this.f91891a.mo146307I();
                }
            }
            AbstractC18166c abstractC18166c2 = (AbstractC18166c) this.f91893c.getValue();
            if (AbstractC19074t.m100204b(abstractC18166c2, AbstractC18166c.a.f91846a)) {
                MutableStateFlow mutableStateFlow2 = this.f91893c;
                do {
                    value = mutableStateFlow2.getValue();
                } while (!mutableStateFlow2.mo113436i(value, AbstractC18166c.c.f91848a));
                abstractC18166c = AbstractC18166c.a.f91846a;
            } else {
                AbstractC18166c abstractC18166c3 = AbstractC18166c.c.f91848a;
                if (!AbstractC19074t.m100204b(abstractC18166c2, abstractC18166c3)) {
                    abstractC18166c3 = AbstractC18166c.b.f91847a;
                    if (!AbstractC19074t.m100204b(abstractC18166c2, abstractC18166c3)) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                abstractC18166c = abstractC18166c3;
            }
            return abstractC18166c;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: T0 */
    public final Object m96659T0(Continuation continuation) {
        Continuation m142576c;
        Map m131404i;
        Object m142578e;
        m142576c = AbstractC28297c.m142576c(continuation);
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(m142576c, 1);
        cancellableContinuationImpl.m112574F();
        j0 j0Var = new j0(cancellableContinuationImpl);
        InterfaceC21766a m112296a = AbstractC21767b.f105718a.m112296a();
        String str = m112296a.mo1370f("shortvideo_platform_s") + "/token";
        m131404i = AbstractC25363p0.m131404i();
        InterfaceC21766a.a.m112290a(m112296a, str, 888888, false, m131404i, j0Var, 4, null);
        Object m112571A = cancellableContinuationImpl.m112571A();
        m142578e = AbstractC28298d.m142578e();
        if (m112571A == m142578e) {
            AbstractC29100h.m145355c(continuation);
        }
        return m112571A;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: U0 */
    public final Section m96660U0(Section section) {
        for (Notification notification : section.m51168m()) {
            long m51050b = notification.m51050b() * 1000;
            if (AbstractC26105g.m134350q(m51050b)) {
                notification.m51062n(0);
            } else if (AbstractC26105g.m134349p(m51050b)) {
                notification.m51062n(1);
            } else if (AbstractC26105g.m134348o(m51050b)) {
                notification.m51062n(2);
            } else {
                notification.m51062n(3);
            }
        }
        return section;
    }

    /* renamed from: V0 */
    private final Object m96661V0(InterfaceC18505l interfaceC18505l, Continuation continuation) {
        return m96665Z0(2, new r1(interfaceC18505l, null), continuation);
    }

    /* renamed from: W0 */
    private final Flow m96662W0(InterfaceC18494a interfaceC18494a) {
        return m96664Y0(2, new s1(interfaceC18494a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0090 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: X0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m96663X0(AuthInfo authInfo, Continuation continuation) {
        t1 t1Var;
        Object m142578e;
        int i11;
        C18171h c18171h;
        InterfaceC30248b interfaceC30248b;
        User m51521c;
        InterfaceC30248b interfaceC30248b2;
        Channel m51519a;
        if (continuation instanceof t1) {
            t1Var = (t1) continuation;
            int i12 = t1Var.f92181w;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                t1Var.f92181w = i12 - Integer.MIN_VALUE;
                Object obj = t1Var.f92179u;
                m142578e = AbstractC28298d.m142578e();
                i11 = t1Var.f92181w;
                if (i11 == 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 == 3) {
                                AbstractC24862s.m129228b(obj);
                                return C24848g0.f119245a;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        authInfo = (AuthInfo) t1Var.f92178t;
                        c18171h = (C18171h) t1Var.f92177s;
                        AbstractC24862s.m129228b(obj);
                        interfaceC30248b2 = c18171h.f91892b;
                        m51519a = authInfo.m51519a();
                        t1Var.f92177s = null;
                        t1Var.f92178t = null;
                        t1Var.f92181w = 3;
                        if (interfaceC30248b2.mo50571v(m51519a, t1Var) == m142578e) {
                            return m142578e;
                        }
                        return C24848g0.f119245a;
                    }
                    authInfo = (AuthInfo) t1Var.f92178t;
                    c18171h = (C18171h) t1Var.f92177s;
                    AbstractC24862s.m129228b(obj);
                } else {
                    AbstractC24862s.m129228b(obj);
                    if (this.f91891a.mo146310L(authInfo)) {
                        InterfaceC30248b interfaceC30248b3 = this.f91892b;
                        t1Var.f92177s = this;
                        t1Var.f92178t = authInfo;
                        t1Var.f92181w = 1;
                        if (interfaceC30248b3.mo50551d(t1Var) == m142578e) {
                            return m142578e;
                        }
                    }
                    c18171h = this;
                }
                interfaceC30248b = c18171h.f91892b;
                m51521c = authInfo.m51521c();
                t1Var.f92177s = c18171h;
                t1Var.f92178t = authInfo;
                t1Var.f92181w = 2;
                if (interfaceC30248b.mo50550c(m51521c, t1Var) == m142578e) {
                    return m142578e;
                }
                interfaceC30248b2 = c18171h.f91892b;
                m51519a = authInfo.m51519a();
                t1Var.f92177s = null;
                t1Var.f92178t = null;
                t1Var.f92181w = 3;
                if (interfaceC30248b2.mo50571v(m51519a, t1Var) == m142578e) {
                }
                return C24848g0.f119245a;
            }
        }
        t1Var = new t1(continuation);
        Object obj2 = t1Var.f92179u;
        m142578e = AbstractC28298d.m142578e();
        i11 = t1Var.f92181w;
        if (i11 == 0) {
        }
        interfaceC30248b = c18171h.f91892b;
        m51521c = authInfo.m51521c();
        t1Var.f92177s = c18171h;
        t1Var.f92178t = authInfo;
        t1Var.f92181w = 2;
        if (interfaceC30248b.mo50550c(m51521c, t1Var) == m142578e) {
        }
        interfaceC30248b2 = c18171h.f91892b;
        m51519a = authInfo.m51519a();
        t1Var.f92177s = null;
        t1Var.f92178t = null;
        t1Var.f92181w = 3;
        if (interfaceC30248b2.mo50571v(m51519a, t1Var) == m142578e) {
        }
        return C24848g0.f119245a;
    }

    /* renamed from: Y0 */
    private final Flow m96664Y0(int i11, InterfaceC18494a interfaceC18494a) {
        Object value;
        for (int i12 = 0; i12 < i11; i12++) {
            try {
                return (Flow) interfaceC18494a.mo12V4();
            } catch (Throwable th2) {
                if (th2 instanceof UnauthorizedException) {
                    ReentrantLock reentrantLock = this.f91894d;
                    reentrantLock.lock();
                    try {
                        if (AbstractC19074t.m100204b(this.f91893c.getValue(), AbstractC18166c.b.f91847a)) {
                            MutableStateFlow mutableStateFlow = this.f91893c;
                            do {
                                value = mutableStateFlow.getValue();
                            } while (!mutableStateFlow.mo113436i(value, AbstractC18166c.a.f91846a));
                            this.f91891a.mo146307I();
                        }
                        C24848g0 c24848g0 = C24848g0.f119245a;
                        reentrantLock.unlock();
                    } catch (Throwable th3) {
                        reentrantLock.unlock();
                        throw th3;
                    }
                } else if (!(th2 instanceof InvalidTimeException)) {
                    throw th2;
                }
            }
        }
        return (Flow) interfaceC18494a.mo12V4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0051 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x0064 -> B:21:0x0067). Please report as a decompilation issue!!! */
    /* renamed from: Z0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m96665Z0(int i11, InterfaceC18505l interfaceC18505l, Continuation continuation) {
        u1 u1Var;
        Object m142578e;
        int i12;
        C18171h c18171h;
        InterfaceC18505l interfaceC18505l2;
        int i13;
        int i14;
        InterfaceC18505l interfaceC18505l3;
        Throwable th2;
        Object value;
        if (continuation instanceof u1) {
            u1Var = (u1) continuation;
            int i15 = u1Var.f92195y;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                u1Var.f92195y = i15 - Integer.MIN_VALUE;
                Object obj = u1Var.f92193w;
                m142578e = AbstractC28298d.m142578e();
                i12 = u1Var.f92195y;
                if (i12 == 0) {
                    if (i12 != 1) {
                        if (i12 == 2) {
                            AbstractC24862s.m129228b(obj);
                            return obj;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i14 = u1Var.f92192v;
                    i13 = u1Var.f92191u;
                    interfaceC18505l3 = (InterfaceC18505l) u1Var.f92190t;
                    c18171h = (C18171h) u1Var.f92189s;
                    try {
                        AbstractC24862s.m129228b(obj);
                    } catch (Throwable th3) {
                        th2 = th3;
                        if (!(th2 instanceof UnauthorizedException)) {
                        }
                        i14++;
                        interfaceC18505l2 = interfaceC18505l3;
                        if (i14 < i13) {
                        }
                    }
                    return obj;
                }
                AbstractC24862s.m129228b(obj);
                c18171h = this;
                interfaceC18505l2 = interfaceC18505l;
                i13 = i11;
                i14 = 0;
                if (i14 < i13) {
                    try {
                    } catch (Throwable th4) {
                        interfaceC18505l3 = interfaceC18505l2;
                        th2 = th4;
                        if (!(th2 instanceof UnauthorizedException)) {
                            ReentrantLock reentrantLock = c18171h.f91894d;
                            reentrantLock.lock();
                            try {
                                if (AbstractC19074t.m100204b(c18171h.f91893c.getValue(), AbstractC18166c.b.f91847a)) {
                                    MutableStateFlow mutableStateFlow = c18171h.f91893c;
                                    do {
                                        value = mutableStateFlow.getValue();
                                    } while (!mutableStateFlow.mo113436i(value, AbstractC18166c.a.f91846a));
                                    c18171h.f91891a.mo146307I();
                                }
                                C24848g0 c24848g0 = C24848g0.f119245a;
                                reentrantLock.unlock();
                            } catch (Throwable th5) {
                                reentrantLock.unlock();
                                throw th5;
                            }
                        } else if (!(th2 instanceof InvalidTimeException)) {
                            throw th2;
                        }
                        i14++;
                        interfaceC18505l2 = interfaceC18505l3;
                        if (i14 < i13) {
                        }
                    }
                    u1Var.f92189s = c18171h;
                    u1Var.f92190t = interfaceC18505l2;
                    u1Var.f92191u = i13;
                    u1Var.f92192v = i14;
                    u1Var.f92195y = 1;
                    obj = interfaceC18505l2.mo205i9(u1Var);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                    return obj;
                }
                u1Var.f92189s = null;
                u1Var.f92190t = null;
                u1Var.f92195y = 2;
                obj = interfaceC18505l2.mo205i9(u1Var);
                if (obj == m142578e) {
                    return m142578e;
                }
                return obj;
            }
        }
        u1Var = new u1(continuation);
        Object obj2 = u1Var.f92193w;
        m142578e = AbstractC28298d.m142578e();
        i12 = u1Var.f92195y;
        if (i12 == 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a1 */
    public final Object m96666a1(OauthToken oauthToken, Continuation continuation) {
        return C9447a.a.m51566g(C9447a.a.m51566g(C9447a.Companion.m51596d(this, "v1/auth/my/login/by_token").m51583v(880022), "accessToken", oauthToken.m51527a(), false, 4, null), "refreshToken", oauthToken.m51528b(), false, 4, null).m51581t(new AuthInfo.C9445a(), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: b1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m96667b1(User user, Channel channel, Continuation continuation) {
        a2 a2Var;
        Object m142578e;
        int i11;
        Channel channel2;
        C18171h c18171h;
        InterfaceC30248b interfaceC30248b;
        Channel channel3;
        if (continuation instanceof a2) {
            a2Var = (a2) continuation;
            int i12 = a2Var.f91919x;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                a2Var.f91919x = i12 - Integer.MIN_VALUE;
                Object obj = a2Var.f91917v;
                m142578e = AbstractC28298d.m142578e();
                i11 = a2Var.f91919x;
                if (i11 == 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            channel3 = (Channel) a2Var.f91915t;
                            c18171h = (C18171h) a2Var.f91914s;
                            AbstractC24862s.m129228b(obj);
                            c18171h.f91891a.mo146311M(channel3);
                            return C24848g0.f119245a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Channel channel4 = (Channel) a2Var.f91916u;
                    user = (User) a2Var.f91915t;
                    C18171h c18171h2 = (C18171h) a2Var.f91914s;
                    AbstractC24862s.m129228b(obj);
                    channel2 = channel4;
                    c18171h = c18171h2;
                } else {
                    AbstractC24862s.m129228b(obj);
                    InterfaceC30248b interfaceC30248b2 = this.f91892b;
                    a2Var.f91914s = this;
                    a2Var.f91915t = user;
                    a2Var.f91916u = channel;
                    a2Var.f91919x = 1;
                    if (interfaceC30248b2.mo50550c(user, a2Var) == m142578e) {
                        return m142578e;
                    }
                    channel2 = channel;
                    c18171h = this;
                }
                c18171h.f91891a.mo146336k(user);
                interfaceC30248b = c18171h.f91892b;
                a2Var.f91914s = c18171h;
                a2Var.f91915t = channel2;
                a2Var.f91916u = null;
                a2Var.f91919x = 2;
                if (interfaceC30248b.mo50571v(channel2, a2Var) != m142578e) {
                    return m142578e;
                }
                channel3 = channel2;
                c18171h.f91891a.mo146311M(channel3);
                return C24848g0.f119245a;
            }
        }
        a2Var = new a2(continuation);
        Object obj2 = a2Var.f91917v;
        m142578e = AbstractC28298d.m142578e();
        i11 = a2Var.f91919x;
        if (i11 == 0) {
        }
        c18171h.f91891a.mo146336k(user);
        interfaceC30248b = c18171h.f91892b;
        a2Var.f91914s = c18171h;
        a2Var.f91915t = channel2;
        a2Var.f91916u = null;
        a2Var.f91919x = 2;
        if (interfaceC30248b.mo50571v(channel2, a2Var) != m142578e) {
        }
    }

    @Override // e10.InterfaceC18170g
    /* renamed from: A */
    public Object mo96547A(String str, Continuation continuation) {
        return m96661V0(new b(str, null), continuation);
    }

    @Override // e10.InterfaceC18170g
    /* renamed from: A0 */
    public Object mo96548A0(String str, Continuation continuation) {
        return m96661V0(new d(str, null), continuation);
    }

    @Override // e10.InterfaceC18170g
    /* renamed from: B */
    public Object mo96549B(Continuation continuation) {
        return m96661V0(new x(null), continuation);
    }

    @Override // e10.InterfaceC18170g
    /* renamed from: B0 */
    public Object mo96550B0(String str, Continuation continuation) {
        return m96661V0(new n(str, null), continuation);
    }

    @Override // e10.InterfaceC18170g
    /* renamed from: C */
    public Object mo96551C(String str, Continuation continuation) {
        return m96661V0(new a(str, null), continuation);
    }

    @Override // e10.InterfaceC18170g
    /* renamed from: C0 */
    public Object mo96552C0(String str, LoadMoreInfo loadMoreInfo, Continuation continuation) {
        return m96661V0(new t0(str, loadMoreInfo, null), continuation);
    }

    @Override // e10.InterfaceC18170g
    /* renamed from: D */
    public Object mo96553D(String str, boolean z11, Continuation continuation) {
        return m96661V0(new i1(z11, str, null), continuation);
    }

    @Override // e10.InterfaceC18170g
    /* renamed from: D0 */
    public Object mo96554D0(JSONArray jSONArray, JSONArray jSONArray2, Continuation continuation) {
        return m96661V0(new n1(jSONArray, jSONArray2, null), continuation);
    }

    @Override // e10.InterfaceC18170g
    /* renamed from: E */
    public Object mo96555E(List list, Continuation continuation) {
        return m96661V0(new g0(list, null), continuation);
    }

    @Override // e10.InterfaceC18170g
    /* renamed from: E0 */
    public Object mo96556E0(String str, Continuation continuation) {
        return m96661V0(new h(str, null), continuation);
    }

    @Override // e10.InterfaceC18170g
    /* renamed from: F */
    public Object mo96557F(String str, Continuation continuation) {
        return m96661V0(new d0(str, null), continuation);
    }

    @Override // e10.InterfaceC18170g
    /* renamed from: F0 */
    public Object mo96558F0(Continuation continuation) {
        return m96661V0(new c0(null), continuation);
    }

    @Override // e10.InterfaceC18170g
    /* renamed from: G */
    public Object mo96559G(BreakSlot breakSlot, Continuation continuation) {
        return m96661V0(new y1(breakSlot, null), continuation);
    }

    @Override // e10.InterfaceC18170g
    /* renamed from: G0 */
    public Object mo96560G0(List list, Continuation continuation) {
        return m96661V0(new p(list, null), continuation);
    }

    @Override // e10.InterfaceC18170g
    /* renamed from: H */
    public Object mo96561H(String str, LoadMoreInfo loadMoreInfo, String str2, Integer num, Continuation continuation) {
        return m96661V0(new c1(str, loadMoreInfo, str2, num, null), continuation);
    }

    @Override // e10.InterfaceC18170g
    /* renamed from: I */
    public Object mo96562I(String str, Continuation continuation) {
        return m96661V0(new h0(str, null), continuation);
    }

    @Override // e10.InterfaceC18170g
    /* renamed from: J */
    public Object mo96563J(String str, String str2, String str3, Continuation continuation) {
        return m96661V0(new h2(str, str2, str3, null), continuation);
    }

    @Override // e10.InterfaceC18170g
    /* renamed from: K */
    public Object mo96564K(String str, Continuation continuation) {
        return m96661V0(new e(str, null), continuation);
    }

    @Override // e10.InterfaceC18170g
    /* renamed from: L */
    public Object mo96565L(String str, LoadMoreInfo loadMoreInfo, Continuation continuation) {
        return m96661V0(new w0(str, loadMoreInfo, null), continuation);
    }

    @Override // e10.InterfaceC18170g
    /* renamed from: M */
    public Object mo96566M(String str, LoadMoreInfo loadMoreInfo, Continuation continuation) {
        return m96661V0(new o(str, loadMoreInfo, null), continuation);
    }

    @Override // e10.InterfaceC18170g
    /* renamed from: N */
    public Object mo96567N(String str, Continuation continuation) {
        return m96661V0(new l1(str, null), continuation);
    }

    @Override // e10.InterfaceC18170g
    /* renamed from: O */
    public Object mo96568O(String str, LoadMoreInfo loadMoreInfo, Continuation continuation) {
        return m96661V0(new s0(str, loadMoreInfo, null), continuation);
    }

    @Override // e10.InterfaceC18170g
    /* renamed from: P */
    public Object mo96569P(String str, C19205a.b bVar, Continuation continuation) {
        return m96661V0(new w1(bVar, this, str, null), continuation);
    }

    @Override // e10.InterfaceC18170g
    /* renamed from: Q */
    public Object mo96570Q(Continuation continuation) {
        return m96661V0(new o0(null), continuation);
    }

    @Override // e10.InterfaceC18170g
    /* renamed from: R */
    public Object mo96571R(String str, LoadMoreInfo loadMoreInfo, Continuation continuation) {
        return m96661V0(new k0(str, loadMoreInfo, null), continuation);
    }

    @Override // e10.InterfaceC18170g
    /* renamed from: S */
    public Object mo96572S(int i11, int i12, int i13, List list, LoadMoreInfo loadMoreInfo, Continuation continuation) {
        return m96661V0(new t(loadMoreInfo, i11, list, i12, i13, null), continuation);
    }

    @Override // e10.InterfaceC18170g
    /* renamed from: T */
    public Object mo96573T(String str, Continuation continuation) {
        return m96661V0(new p1(str, null), continuation);
    }

    @Override // e10.InterfaceC18170g
    /* renamed from: U */
    public Object mo96574U(String str, String str2, int i11, String str3, Integer num, String str4, Integer num2, String str5, String str6, String str7, Integer num3, Integer num4, String str8, Continuation continuation) {
        return m96661V0(new x1(str, str2, i11, str4, str3, num, str5, num2, str6, str7, num3, num4, str8, null), continuation);
    }

    @Override // e10.InterfaceC18170g
    /* renamed from: V */
    public Flow mo96575V(String str) {
        AbstractC19074t.m100208f(str, "path");
        return m96662W0(new l2(str, this));
    }

    @Override // e10.InterfaceC18170g
    /* renamed from: W */
    public Object mo96576W(String str, Continuation continuation) {
        return m96661V0(new g2(str, null), continuation);
    }

    @Override // e10.InterfaceC18170g
    /* renamed from: X */
    public Object mo96577X(String str, String str2, String str3, String str4, Continuation continuation) {
        return m96661V0(new d2(str, str2, str3, str4, null), continuation);
    }

    @Override // e10.InterfaceC18170g
    /* renamed from: Y */
    public Object mo96578Y(LoadMoreInfo loadMoreInfo, Continuation continuation) {
        return m96661V0(new v(loadMoreInfo, null), continuation);
    }

    @Override // e10.InterfaceC18170g
    /* renamed from: Z */
    public Object mo96579Z(String str, LoadMoreInfo loadMoreInfo, Continuation continuation) {
        return m96661V0(new z0(str, loadMoreInfo, null), continuation);
    }

    @Override // e10.InterfaceC18170g
    /* renamed from: a */
    public Object mo96580a(String str, Continuation continuation) {
        return m96661V0(new k1(str, null), continuation);
    }

    @Override // e10.InterfaceC18170g
    /* renamed from: a0 */
    public Object mo96581a0(String str, Continuation continuation) {
        return m96661V0(new o1(str, null), continuation);
    }

    @Override // e10.InterfaceC18170g
    /* renamed from: b */
    public Object mo96582b(LoadMoreInfo loadMoreInfo, String str, String str2, Continuation continuation) {
        return m96661V0(new a0(loadMoreInfo, str, str2, null), continuation);
    }

    @Override // e10.InterfaceC18170g
    /* renamed from: b0 */
    public Object mo96583b0(LoadMoreInfo loadMoreInfo, Continuation continuation) {
        return m96661V0(new d1(loadMoreInfo, null), continuation);
    }

    @Override // e10.InterfaceC18170g
    /* renamed from: c */
    public Object mo96584c(String str, String str2, Continuation continuation) {
        return m96661V0(new m(str, str2, null), continuation);
    }

    @Override // e10.InterfaceC18170g
    /* renamed from: c0 */
    public Object mo96585c0(String str, String str2, String str3, Continuation continuation) {
        return m96661V0(new f2(str, str2, str3, null), continuation);
    }

    @Override // e10.InterfaceC18170g
    /* renamed from: d */
    public Object mo96586d(String str, String str2, LoadMoreInfo loadMoreInfo, Continuation continuation) {
        return m96661V0(new r(loadMoreInfo, str, str2, null), continuation);
    }

    @Override // e10.InterfaceC18170g
    /* renamed from: d0 */
    public Object mo96587d0(String str, Continuation continuation) {
        return m96661V0(new e2(str, null), continuation);
    }

    @Override // e10.InterfaceC18170g
    /* renamed from: e */
    public Object mo96588e(List list, Continuation continuation) {
        return m96661V0(new e1(list, null), continuation);
    }

    @Override // e10.InterfaceC18170g
    /* renamed from: e0 */
    public Object mo96589e0(String str, Continuation continuation) {
        return m96661V0(new b2(str, null), continuation);
    }

    @Override // e10.InterfaceC18170g
    /* renamed from: f */
    public Object mo96590f(LoadMoreInfo loadMoreInfo, Continuation continuation) {
        return m96661V0(new l(loadMoreInfo, null), continuation);
    }

    @Override // e10.InterfaceC18170g
    /* renamed from: f0 */
    public Object mo96591f0(LoadMoreInfo loadMoreInfo, Continuation continuation) {
        return m96661V0(new b0(loadMoreInfo, null), continuation);
    }

    @Override // e10.InterfaceC18170g
    /* renamed from: g */
    public Object mo96592g(String str, String str2, LoadMoreInfo loadMoreInfo, Continuation continuation) {
        return m96661V0(new f1(str, loadMoreInfo, str2, null), continuation);
    }

    @Override // e10.InterfaceC18170g
    /* renamed from: g0 */
    public Object mo96593g0(LoadMoreInfo loadMoreInfo, Continuation continuation) {
        return m96661V0(new e0(loadMoreInfo, null), continuation);
    }

    @Override // e10.InterfaceC18170g
    /* renamed from: h */
    public Object mo96594h(Continuation continuation) {
        return m96661V0(new u0(null), continuation);
    }

    @Override // e10.InterfaceC18170g
    /* renamed from: h0 */
    public Object mo96595h0(Continuation continuation) {
        return m96661V0(new v0(null), continuation);
    }

    @Override // e10.InterfaceC18170g
    /* renamed from: i */
    public Object mo96596i(LoadMoreInfo loadMoreInfo, Integer num, Continuation continuation) {
        return m96661V0(new u(loadMoreInfo, num, null), continuation);
    }

    @Override // e10.InterfaceC18170g
    /* renamed from: i0 */
    public Object mo96597i0(String str, Continuation continuation) {
        return m96661V0(new x0(str, null), continuation);
    }

    @Override // e10.InterfaceC18170g
    /* renamed from: j */
    public Object mo96598j(String str, String str2, int i11, String str3, Integer num, String str4, Integer num2, String str5, String str6, String str7, Integer num3, Integer num4, Continuation continuation) {
        return m96661V0(new v1(str, str2, i11, str4, str3, num, str5, num2, str6, str7, num3, num4, null), continuation);
    }

    @Override // e10.InterfaceC18170g
    /* renamed from: j0 */
    public Object mo96599j0(String str, String str2, boolean z11, Continuation continuation) {
        return m96661V0(new m1(z11, str, str2, null), continuation);
    }

    @Override // e10.InterfaceC18170g
    /* renamed from: k */
    public Object mo96600k(String str, Continuation continuation) {
        return m96661V0(new f0(str, null), continuation);
    }

    @Override // e10.InterfaceC18170g
    /* renamed from: k0 */
    public Object mo96601k0(String str, Continuation continuation) {
        return m96661V0(new l0(str, null), continuation);
    }

    @Override // e10.InterfaceC18170g
    /* renamed from: l */
    public Object mo96602l(String str, Continuation continuation) {
        return m96661V0(new g(str, null), continuation);
    }

    @Override // e10.InterfaceC18170g
    /* renamed from: l0 */
    public Object mo96603l0(String str, Continuation continuation) {
        return m96661V0(new f(str, null), continuation);
    }

    @Override // e10.InterfaceC18170g
    /* renamed from: m */
    public Object mo96604m(String str, Continuation continuation) {
        return m96661V0(new g1(str, null), continuation);
    }

    @Override // e10.InterfaceC18170g
    /* renamed from: m0 */
    public Object mo96605m0(Continuation continuation) {
        return m96661V0(new j1(null), continuation);
    }

    @Override // e10.InterfaceC18170g
    /* renamed from: n */
    public Object mo96606n(Continuation continuation) {
        return m96661V0(new y(null), continuation);
    }

    @Override // e10.InterfaceC18170g
    /* renamed from: n0 */
    public Object mo96607n0(LoadMoreInfo loadMoreInfo, Continuation continuation) {
        return m96661V0(new k(loadMoreInfo, null), continuation);
    }

    @Override // e10.InterfaceC18170g
    /* renamed from: o */
    public Object mo96608o(LoadMoreInfo loadMoreInfo, Continuation continuation) {
        return m96661V0(new j(loadMoreInfo, null), continuation);
    }

    @Override // e10.InterfaceC18170g
    /* renamed from: o0 */
    public Object mo96609o0(String str, String str2, LoadMoreInfo loadMoreInfo, Continuation continuation) {
        return m96661V0(new p0(str2, loadMoreInfo, str, null), continuation);
    }

    @Override // e10.InterfaceC18170g
    /* renamed from: p */
    public Object mo96610p(String str, LoadMoreInfo loadMoreInfo, Continuation continuation) {
        return m96661V0(new z(loadMoreInfo, str, null), continuation);
    }

    @Override // e10.InterfaceC18170g
    /* renamed from: p0 */
    public Object mo96611p0(String str, Continuation continuation) {
        return m96661V0(new j2(str, null), continuation);
    }

    @Override // e10.InterfaceC18170g
    /* renamed from: q */
    public Object mo96612q(String str, boolean z11, Continuation continuation) {
        return m96661V0(new c(z11, str, null), continuation);
    }

    @Override // e10.InterfaceC18170g
    /* renamed from: q0 */
    public Object mo96613q0(List list, Continuation continuation) {
        return m96661V0(new s(list, null), continuation);
    }

    @Override // e10.InterfaceC18170g
    /* renamed from: r */
    public Object mo96614r(String str, Continuation continuation) {
        return m96661V0(new i2(str, null), continuation);
    }

    @Override // f10.InterfaceC18689a
    /* renamed from: r0 */
    public Map mo96668r0() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = CoreUtility.f89234j;
        AbstractC19074t.m100207e(str, "versionName");
        linkedHashMap.put("appVersion", str);
        linkedHashMap.put("versionCode", String.valueOf(CoreUtility.f89236l));
        linkedHashMap.put("featureVersion", "240401");
        linkedHashMap.put("appId", "com.zing.zalo.zchannel");
        linkedHashMap.put("os", "android");
        linkedHashMap.put("osVersion", String.valueOf(Build.VERSION.SDK_INT));
        C27417l c27417l = C27417l.f129055a;
        linkedHashMap.put("deviceId", c27417l.m140383g());
        linkedHashMap.put("model", c27417l.m140385i());
        String str2 = Build.MANUFACTURER;
        AbstractC19074t.m100207e(str2, "MANUFACTURER");
        linkedHashMap.put("manufacturer", str2);
        String str3 = AbstractC18458a.f93019a;
        AbstractC19074t.m100207e(str3, "defaultLanguage");
        linkedHashMap.put("language", str3);
        linkedHashMap.put("publicKey", C18164a.f91843a.m96475d());
        User m140378b = c27417l.m140378b();
        if (!(!AbstractC19074t.m100204b(m140378b, User.Anonymous.f50006J))) {
            m140378b = null;
        }
        if (m140378b != null) {
            linkedHashMap.put("userId", m140378b.m51234g());
            linkedHashMap.put("session", c27417l.m140388l());
        }
        return linkedHashMap;
    }

    @Override // e10.InterfaceC18170g
    /* renamed from: s */
    public Object mo96615s(String str, Continuation continuation) {
        return m96661V0(new r0(str, null), continuation);
    }

    @Override // e10.InterfaceC18170g
    /* renamed from: s0 */
    public Object mo96616s0(BreakSlot breakSlot, Continuation continuation) {
        return m96661V0(new z1(breakSlot, null), continuation);
    }

    @Override // e10.InterfaceC18170g
    /* renamed from: t */
    public Flow mo96617t(String str) {
        AbstractC19074t.m100208f(str, "path");
        return m96662W0(new k2(str, this));
    }

    @Override // e10.InterfaceC18170g
    /* renamed from: t0 */
    public Object mo96618t0(LoadMoreInfo loadMoreInfo, Continuation continuation) {
        return m96661V0(new y0(loadMoreInfo, null), continuation);
    }

    @Override // e10.InterfaceC18170g
    /* renamed from: u */
    public Object mo96619u(String str, LoadMoreInfo loadMoreInfo, Continuation continuation) {
        return m96661V0(new a1(loadMoreInfo, str, null), continuation);
    }

    @Override // e10.InterfaceC18170g
    /* renamed from: u0 */
    public Object mo96620u0(String str, String str2, String str3, String str4, Continuation continuation) {
        return m96661V0(new q1(str, str2, str3, str4, null), continuation);
    }

    @Override // e10.InterfaceC18170g
    /* renamed from: v */
    public Object mo96621v(String str, LoadMoreInfo loadMoreInfo, Continuation continuation) {
        return m96661V0(new q(loadMoreInfo, str, null), continuation);
    }

    @Override // e10.InterfaceC18170g
    /* renamed from: v0 */
    public Object mo96622v0(String str, LoadMoreInfo loadMoreInfo, Continuation continuation) {
        return m96661V0(new m0(str, loadMoreInfo, null), continuation);
    }

    @Override // e10.InterfaceC18170g
    /* renamed from: w */
    public Object mo96623w(String str, String str2, String str3, String str4, Integer num, Integer num2, Continuation continuation) {
        return m96661V0(new i(str, str2, str3, str4, num, num2, null), continuation);
    }

    @Override // e10.InterfaceC18170g
    /* renamed from: w0 */
    public Object mo96624w0(Continuation continuation) {
        return m96661V0(new i0(null), continuation);
    }

    @Override // e10.InterfaceC18170g
    /* renamed from: x */
    public Object mo96625x(String str, String str2, String str3, LoadMoreInfo loadMoreInfo, Continuation continuation) {
        return m96661V0(new q0(str2, str3, loadMoreInfo, str, null), continuation);
    }

    @Override // e10.InterfaceC18170g
    /* renamed from: x0 */
    public Object mo96626x0(String str, Continuation continuation) {
        return m96661V0(new c2(str, null), continuation);
    }

    @Override // e10.InterfaceC18170g
    /* renamed from: y */
    public Object mo96627y(String str, LoadMoreInfo loadMoreInfo, Continuation continuation) {
        return m96661V0(new n0(str, loadMoreInfo, null), continuation);
    }

    @Override // e10.InterfaceC18170g
    /* renamed from: y0 */
    public Object mo96628y0(String str, LoadMoreInfo loadMoreInfo, Continuation continuation) {
        return m96661V0(new b1(loadMoreInfo, str, null), continuation);
    }

    @Override // e10.InterfaceC18170g
    /* renamed from: z */
    public Object mo96629z(Continuation continuation) {
        return m96661V0(new w(null), continuation);
    }

    @Override // e10.InterfaceC18170g
    /* renamed from: z0 */
    public Object mo96630z0(String str, String str2, String str3, Integer num, Integer num2, Continuation continuation) {
        return m96661V0(new h1(str, str2, str3, num, num2, null), continuation);
    }
}
