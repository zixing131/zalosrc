package e10;

import com.zing.zalo.shortvideo.data.model.BreakSlot;
import com.zing.zalo.shortvideo.data.model.LoadMoreInfo;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import g20.C19205a;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import org.json.JSONArray;

/* renamed from: e10.g */
/* loaded from: classes5.dex */
public interface InterfaceC18170g {

    /* renamed from: e10.g$a */
    /* loaded from: classes5.dex */
    public static final class a {
        /* renamed from: a */
        public static /* synthetic */ Object m96631a(InterfaceC18170g interfaceC18170g, String str, String str2, String str3, String str4, Integer num, Integer num2, Continuation continuation, int i11, Object obj) {
            String str5;
            String str6;
            String str7;
            Integer num3;
            Integer num4;
            if (obj == null) {
                if ((i11 & 2) != 0) {
                    str5 = null;
                } else {
                    str5 = str2;
                }
                if ((i11 & 4) != 0) {
                    str6 = null;
                } else {
                    str6 = str3;
                }
                if ((i11 & 8) != 0) {
                    str7 = null;
                } else {
                    str7 = str4;
                }
                if ((i11 & 16) != 0) {
                    num3 = null;
                } else {
                    num3 = num;
                }
                if ((i11 & 32) != 0) {
                    num4 = null;
                } else {
                    num4 = num2;
                }
                return interfaceC18170g.mo96623w(str, str5, str6, str7, num3, num4, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: followChannel");
        }

        /* renamed from: b */
        public static /* synthetic */ Object m96632b(InterfaceC18170g interfaceC18170g, LoadMoreInfo loadMoreInfo, Continuation continuation, int i11, Object obj) {
            if (obj == null) {
                if ((i11 & 1) != 0) {
                    loadMoreInfo = null;
                }
                return interfaceC18170g.mo96607n0(loadMoreInfo, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getBlockChannels");
        }

        /* renamed from: c */
        public static /* synthetic */ Object m96633c(InterfaceC18170g interfaceC18170g, LoadMoreInfo loadMoreInfo, Continuation continuation, int i11, Object obj) {
            if (obj == null) {
                if ((i11 & 1) != 0) {
                    loadMoreInfo = null;
                }
                return interfaceC18170g.mo96590f(loadMoreInfo, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getBlockUsers");
        }

        /* renamed from: d */
        public static /* synthetic */ Object m96634d(InterfaceC18170g interfaceC18170g, String str, LoadMoreInfo loadMoreInfo, Continuation continuation, int i11, Object obj) {
            if (obj == null) {
                if ((i11 & 2) != 0) {
                    loadMoreInfo = null;
                }
                return interfaceC18170g.mo96566M(str, loadMoreInfo, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getChannelNotification");
        }

        /* renamed from: e */
        public static /* synthetic */ Object m96635e(InterfaceC18170g interfaceC18170g, String str, LoadMoreInfo loadMoreInfo, Continuation continuation, int i11, Object obj) {
            if (obj == null) {
                if ((i11 & 2) != 0) {
                    loadMoreInfo = null;
                }
                return interfaceC18170g.mo96571R(str, loadMoreInfo, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSearchAll");
        }

        /* renamed from: f */
        public static /* synthetic */ Object m96636f(InterfaceC18170g interfaceC18170g, String str, String str2, String str3, LoadMoreInfo loadMoreInfo, Continuation continuation, int i11, Object obj) {
            if (obj == null) {
                if ((i11 & 8) != 0) {
                    loadMoreInfo = null;
                }
                return interfaceC18170g.mo96625x(str, str2, str3, loadMoreInfo, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSearchVideoChannel");
        }

        /* renamed from: g */
        public static /* synthetic */ Object m96637g(InterfaceC18170g interfaceC18170g, String str, LoadMoreInfo loadMoreInfo, Continuation continuation, int i11, Object obj) {
            if (obj == null) {
                if ((i11 & 2) != 0) {
                    loadMoreInfo = null;
                }
                return interfaceC18170g.mo96568O(str, loadMoreInfo, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSuggestionHashtag");
        }

        /* renamed from: h */
        public static /* synthetic */ Object m96638h(InterfaceC18170g interfaceC18170g, String str, LoadMoreInfo loadMoreInfo, Continuation continuation, int i11, Object obj) {
            if (obj == null) {
                if ((i11 & 2) != 0) {
                    loadMoreInfo = null;
                }
                return interfaceC18170g.mo96552C0(str, loadMoreInfo, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getUserNotification");
        }

        /* renamed from: i */
        public static /* synthetic */ Object m96639i(InterfaceC18170g interfaceC18170g, LoadMoreInfo loadMoreInfo, Continuation continuation, int i11, Object obj) {
            if (obj == null) {
                if ((i11 & 1) != 0) {
                    loadMoreInfo = null;
                }
                return interfaceC18170g.mo96618t0(loadMoreInfo, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getVideosByBookmark");
        }

        /* renamed from: j */
        public static /* synthetic */ Object m96640j(InterfaceC18170g interfaceC18170g, String str, LoadMoreInfo loadMoreInfo, Continuation continuation, int i11, Object obj) {
            if (obj == null) {
                if ((i11 & 2) != 0) {
                    loadMoreInfo = null;
                }
                return interfaceC18170g.mo96619u(str, loadMoreInfo, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getVideosByCollection");
        }

        /* renamed from: k */
        public static /* synthetic */ Object m96641k(InterfaceC18170g interfaceC18170g, String str, LoadMoreInfo loadMoreInfo, Continuation continuation, int i11, Object obj) {
            if (obj == null) {
                if ((i11 & 2) != 0) {
                    loadMoreInfo = null;
                }
                return interfaceC18170g.mo96628y0(str, loadMoreInfo, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getVideosByHashtag");
        }

        /* renamed from: l */
        public static /* synthetic */ Object m96642l(InterfaceC18170g interfaceC18170g, String str, LoadMoreInfo loadMoreInfo, String str2, Integer num, Continuation continuation, int i11, Object obj) {
            LoadMoreInfo loadMoreInfo2;
            String str3;
            Integer num2;
            if (obj == null) {
                if ((i11 & 2) != 0) {
                    loadMoreInfo2 = null;
                } else {
                    loadMoreInfo2 = loadMoreInfo;
                }
                if ((i11 & 4) != 0) {
                    str3 = null;
                } else {
                    str3 = str2;
                }
                if ((i11 & 8) != 0) {
                    num2 = null;
                } else {
                    num2 = num;
                }
                return interfaceC18170g.mo96561H(str, loadMoreInfo2, str3, num2, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getVideosByJustWatched");
        }

        /* renamed from: m */
        public static /* synthetic */ Object m96643m(InterfaceC18170g interfaceC18170g, LoadMoreInfo loadMoreInfo, Continuation continuation, int i11, Object obj) {
            if (obj == null) {
                if ((i11 & 1) != 0) {
                    loadMoreInfo = null;
                }
                return interfaceC18170g.mo96583b0(loadMoreInfo, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getVideosByLiked");
        }

        /* renamed from: n */
        public static /* synthetic */ Object m96644n(InterfaceC18170g interfaceC18170g, String str, String str2, int i11, String str3, Integer num, String str4, Integer num2, String str5, String str6, String str7, Integer num3, Integer num4, String str8, Continuation continuation, int i12, Object obj) {
            if (obj == null) {
                return interfaceC18170g.mo96574U(str, str2, i11, str3, num, str4, (i12 & 64) != 0 ? null : num2, (i12 & 128) != 0 ? null : str5, (i12 & 256) != 0 ? null : str6, (i12 & 512) != 0 ? null : str7, (i12 & 1024) != 0 ? null : num3, (i12 & ZVideoUtilMetadata.FF_PROFILE_H264_INTRA) != 0 ? null : num4, (i12 & 4096) != 0 ? null : str8, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendReply");
        }

        /* renamed from: o */
        public static /* synthetic */ Object m96645o(InterfaceC18170g interfaceC18170g, String str, String str2, String str3, String str4, Continuation continuation, int i11, Object obj) {
            String str5;
            String str6;
            String str7;
            if (obj == null) {
                if ((i11 & 2) != 0) {
                    str5 = null;
                } else {
                    str5 = str2;
                }
                if ((i11 & 4) != 0) {
                    str6 = null;
                } else {
                    str6 = str3;
                }
                if ((i11 & 8) != 0) {
                    str7 = null;
                } else {
                    str7 = str4;
                }
                return interfaceC18170g.mo96577X(str, str5, str6, str7, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: unfollowChannel");
        }

        /* renamed from: p */
        public static /* synthetic */ Object m96646p(InterfaceC18170g interfaceC18170g, String str, String str2, String str3, Continuation continuation, int i11, Object obj) {
            if (obj == null) {
                if ((i11 & 2) != 0) {
                    str2 = null;
                }
                if ((i11 & 4) != 0) {
                    str3 = null;
                }
                return interfaceC18170g.mo96585c0(str, str2, str3, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: uninterestedVideo");
        }
    }

    /* renamed from: A */
    Object mo96547A(String str, Continuation continuation);

    /* renamed from: A0 */
    Object mo96548A0(String str, Continuation continuation);

    /* renamed from: B */
    Object mo96549B(Continuation continuation);

    /* renamed from: B0 */
    Object mo96550B0(String str, Continuation continuation);

    /* renamed from: C */
    Object mo96551C(String str, Continuation continuation);

    /* renamed from: C0 */
    Object mo96552C0(String str, LoadMoreInfo loadMoreInfo, Continuation continuation);

    /* renamed from: D */
    Object mo96553D(String str, boolean z11, Continuation continuation);

    /* renamed from: D0 */
    Object mo96554D0(JSONArray jSONArray, JSONArray jSONArray2, Continuation continuation);

    /* renamed from: E */
    Object mo96555E(List list, Continuation continuation);

    /* renamed from: E0 */
    Object mo96556E0(String str, Continuation continuation);

    /* renamed from: F */
    Object mo96557F(String str, Continuation continuation);

    /* renamed from: F0 */
    Object mo96558F0(Continuation continuation);

    /* renamed from: G */
    Object mo96559G(BreakSlot breakSlot, Continuation continuation);

    /* renamed from: G0 */
    Object mo96560G0(List list, Continuation continuation);

    /* renamed from: H */
    Object mo96561H(String str, LoadMoreInfo loadMoreInfo, String str2, Integer num, Continuation continuation);

    /* renamed from: I */
    Object mo96562I(String str, Continuation continuation);

    /* renamed from: J */
    Object mo96563J(String str, String str2, String str3, Continuation continuation);

    /* renamed from: K */
    Object mo96564K(String str, Continuation continuation);

    /* renamed from: L */
    Object mo96565L(String str, LoadMoreInfo loadMoreInfo, Continuation continuation);

    /* renamed from: M */
    Object mo96566M(String str, LoadMoreInfo loadMoreInfo, Continuation continuation);

    /* renamed from: N */
    Object mo96567N(String str, Continuation continuation);

    /* renamed from: O */
    Object mo96568O(String str, LoadMoreInfo loadMoreInfo, Continuation continuation);

    /* renamed from: P */
    Object mo96569P(String str, C19205a.b bVar, Continuation continuation);

    /* renamed from: Q */
    Object mo96570Q(Continuation continuation);

    /* renamed from: R */
    Object mo96571R(String str, LoadMoreInfo loadMoreInfo, Continuation continuation);

    /* renamed from: S */
    Object mo96572S(int i11, int i12, int i13, List list, LoadMoreInfo loadMoreInfo, Continuation continuation);

    /* renamed from: T */
    Object mo96573T(String str, Continuation continuation);

    /* renamed from: U */
    Object mo96574U(String str, String str2, int i11, String str3, Integer num, String str4, Integer num2, String str5, String str6, String str7, Integer num3, Integer num4, String str8, Continuation continuation);

    /* renamed from: V */
    Flow mo96575V(String str);

    /* renamed from: W */
    Object mo96576W(String str, Continuation continuation);

    /* renamed from: X */
    Object mo96577X(String str, String str2, String str3, String str4, Continuation continuation);

    /* renamed from: Y */
    Object mo96578Y(LoadMoreInfo loadMoreInfo, Continuation continuation);

    /* renamed from: Z */
    Object mo96579Z(String str, LoadMoreInfo loadMoreInfo, Continuation continuation);

    /* renamed from: a */
    Object mo96580a(String str, Continuation continuation);

    /* renamed from: a0 */
    Object mo96581a0(String str, Continuation continuation);

    /* renamed from: b */
    Object mo96582b(LoadMoreInfo loadMoreInfo, String str, String str2, Continuation continuation);

    /* renamed from: b0 */
    Object mo96583b0(LoadMoreInfo loadMoreInfo, Continuation continuation);

    /* renamed from: c */
    Object mo96584c(String str, String str2, Continuation continuation);

    /* renamed from: c0 */
    Object mo96585c0(String str, String str2, String str3, Continuation continuation);

    /* renamed from: d */
    Object mo96586d(String str, String str2, LoadMoreInfo loadMoreInfo, Continuation continuation);

    /* renamed from: d0 */
    Object mo96587d0(String str, Continuation continuation);

    /* renamed from: e */
    Object mo96588e(List list, Continuation continuation);

    /* renamed from: e0 */
    Object mo96589e0(String str, Continuation continuation);

    /* renamed from: f */
    Object mo96590f(LoadMoreInfo loadMoreInfo, Continuation continuation);

    /* renamed from: f0 */
    Object mo96591f0(LoadMoreInfo loadMoreInfo, Continuation continuation);

    /* renamed from: g */
    Object mo96592g(String str, String str2, LoadMoreInfo loadMoreInfo, Continuation continuation);

    /* renamed from: g0 */
    Object mo96593g0(LoadMoreInfo loadMoreInfo, Continuation continuation);

    /* renamed from: h */
    Object mo96594h(Continuation continuation);

    /* renamed from: h0 */
    Object mo96595h0(Continuation continuation);

    /* renamed from: i */
    Object mo96596i(LoadMoreInfo loadMoreInfo, Integer num, Continuation continuation);

    /* renamed from: i0 */
    Object mo96597i0(String str, Continuation continuation);

    /* renamed from: j */
    Object mo96598j(String str, String str2, int i11, String str3, Integer num, String str4, Integer num2, String str5, String str6, String str7, Integer num3, Integer num4, Continuation continuation);

    /* renamed from: j0 */
    Object mo96599j0(String str, String str2, boolean z11, Continuation continuation);

    /* renamed from: k */
    Object mo96600k(String str, Continuation continuation);

    /* renamed from: k0 */
    Object mo96601k0(String str, Continuation continuation);

    /* renamed from: l */
    Object mo96602l(String str, Continuation continuation);

    /* renamed from: l0 */
    Object mo96603l0(String str, Continuation continuation);

    /* renamed from: m */
    Object mo96604m(String str, Continuation continuation);

    /* renamed from: m0 */
    Object mo96605m0(Continuation continuation);

    /* renamed from: n */
    Object mo96606n(Continuation continuation);

    /* renamed from: n0 */
    Object mo96607n0(LoadMoreInfo loadMoreInfo, Continuation continuation);

    /* renamed from: o */
    Object mo96608o(LoadMoreInfo loadMoreInfo, Continuation continuation);

    /* renamed from: o0 */
    Object mo96609o0(String str, String str2, LoadMoreInfo loadMoreInfo, Continuation continuation);

    /* renamed from: p */
    Object mo96610p(String str, LoadMoreInfo loadMoreInfo, Continuation continuation);

    /* renamed from: p0 */
    Object mo96611p0(String str, Continuation continuation);

    /* renamed from: q */
    Object mo96612q(String str, boolean z11, Continuation continuation);

    /* renamed from: q0 */
    Object mo96613q0(List list, Continuation continuation);

    /* renamed from: r */
    Object mo96614r(String str, Continuation continuation);

    /* renamed from: s */
    Object mo96615s(String str, Continuation continuation);

    /* renamed from: s0 */
    Object mo96616s0(BreakSlot breakSlot, Continuation continuation);

    /* renamed from: t */
    Flow mo96617t(String str);

    /* renamed from: t0 */
    Object mo96618t0(LoadMoreInfo loadMoreInfo, Continuation continuation);

    /* renamed from: u */
    Object mo96619u(String str, LoadMoreInfo loadMoreInfo, Continuation continuation);

    /* renamed from: u0 */
    Object mo96620u0(String str, String str2, String str3, String str4, Continuation continuation);

    /* renamed from: v */
    Object mo96621v(String str, LoadMoreInfo loadMoreInfo, Continuation continuation);

    /* renamed from: v0 */
    Object mo96622v0(String str, LoadMoreInfo loadMoreInfo, Continuation continuation);

    /* renamed from: w */
    Object mo96623w(String str, String str2, String str3, String str4, Integer num, Integer num2, Continuation continuation);

    /* renamed from: w0 */
    Object mo96624w0(Continuation continuation);

    /* renamed from: x */
    Object mo96625x(String str, String str2, String str3, LoadMoreInfo loadMoreInfo, Continuation continuation);

    /* renamed from: x0 */
    Object mo96626x0(String str, Continuation continuation);

    /* renamed from: y */
    Object mo96627y(String str, LoadMoreInfo loadMoreInfo, Continuation continuation);

    /* renamed from: y0 */
    Object mo96628y0(String str, LoadMoreInfo loadMoreInfo, Continuation continuation);

    /* renamed from: z */
    Object mo96629z(Continuation continuation);

    /* renamed from: z0 */
    Object mo96630z0(String str, String str2, String str3, Integer num, Integer num2, Continuation continuation);
}
