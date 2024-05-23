package com.zing.zalo.shortvideo.p072ui.presenter;

import a10.C0054s;
import com.zing.zalo.shortvideo.data.model.BreakSlot;
import com.zing.zalo.shortvideo.data.model.Channel;
import com.zing.zalo.shortvideo.data.model.LoadMoreInfo;
import com.zing.zalo.shortvideo.p072ui.model.Video;
import com.zing.zalo.shortvideo.p072ui.model.VideoAdsInfo;
import en0.InterfaceC18505l;
import java.util.Map;
import kotlin.coroutines.Continuation;
import q20.C25093p;
import u10.C26947a;

/* renamed from: com.zing.zalo.shortvideo.ui.presenter.f */
/* loaded from: classes5.dex */
public interface InterfaceC10058f extends InterfaceC10053a {

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.f$a */
    /* loaded from: classes5.dex */
    public static final class a {
        /* renamed from: a */
        public static /* synthetic */ void m53676a(InterfaceC10058f interfaceC10058f, boolean z11, LoadMoreInfo loadMoreInfo, int i11, Object obj) {
            if (obj == null) {
                if ((i11 & 2) != 0) {
                    loadMoreInfo = null;
                }
                interfaceC10058f.mo53568La(z11, loadMoreInfo);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadAds");
        }

        /* renamed from: b */
        public static /* synthetic */ void m53677b(InterfaceC10058f interfaceC10058f, LoadMoreInfo loadMoreInfo, int i11, Object obj) {
            if (obj == null) {
                if ((i11 & 1) != 0) {
                    loadMoreInfo = null;
                }
                interfaceC10058f.mo53588q1(loadMoreInfo);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadVideos");
        }

        /* renamed from: c */
        public static /* synthetic */ void m53678c(InterfaceC10058f interfaceC10058f, String str, LoadMoreInfo loadMoreInfo, int i11, Object obj) {
            if (obj == null) {
                if ((i11 & 2) != 0) {
                    loadMoreInfo = null;
                }
                interfaceC10058f.mo53581gl(str, loadMoreInfo);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadVideosSimilar");
        }

        /* renamed from: d */
        public static /* synthetic */ void m53679d(InterfaceC10058f interfaceC10058f, Channel channel, boolean z11, boolean z12, Video video, int i11, Object obj) {
            if (obj == null) {
                if ((i11 & 4) != 0) {
                    z12 = false;
                }
                if ((i11 & 8) != 0) {
                    video = null;
                }
                interfaceC10058f.mo53573Wf(channel, z11, z12, video);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestFollow");
        }

        /* renamed from: e */
        public static /* synthetic */ void m53680e(InterfaceC10058f interfaceC10058f, BreakSlot breakSlot, boolean z11, boolean z12, int i11, Object obj) {
            if (obj == null) {
                if ((i11 & 4) != 0) {
                    z12 = false;
                }
                interfaceC10058f.mo53585nb(breakSlot, z11, z12);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestSubmitOnboarding");
        }

        /* renamed from: f */
        public static /* synthetic */ void m53681f(InterfaceC10058f interfaceC10058f, String str, String str2, String str3, int i11, Object obj) {
            if (obj == null) {
                if ((i11 & 2) != 0) {
                    str2 = null;
                }
                if ((i11 & 4) != 0) {
                    str3 = null;
                }
                interfaceC10058f.mo53583in(str, str2, str3);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestUninterestedVideo");
        }
    }

    /* renamed from: Ab */
    void mo53562Ab(String str);

    /* renamed from: Bu */
    void mo53563Bu(Map map);

    /* renamed from: DA */
    void mo53564DA(Video video, boolean z11);

    /* renamed from: G2 */
    void mo53565G2(String str, String str2, String str3, InterfaceC18505l interfaceC18505l);

    /* renamed from: J3 */
    Object mo53566J3(int i11, Continuation continuation);

    /* renamed from: Jk */
    void mo53567Jk(Video video, boolean z11, VideoAdsInfo videoAdsInfo);

    /* renamed from: La */
    void mo53568La(boolean z11, LoadMoreInfo loadMoreInfo);

    /* renamed from: O2 */
    Object mo53569O2(String str, Continuation continuation);

    /* renamed from: Sn */
    String mo53570Sn();

    /* renamed from: UD */
    C26947a mo53571UD();

    /* renamed from: Up */
    void mo53572Up(Map map, boolean z11);

    /* renamed from: Wf */
    void mo53573Wf(Channel channel, boolean z11, boolean z12, Video video);

    /* renamed from: Zn */
    C25093p mo53574Zn();

    /* renamed from: aE */
    void mo53575aE();

    /* renamed from: aw */
    void mo53576aw();

    /* renamed from: d0 */
    void mo53577d0();

    /* renamed from: dv */
    Video mo53578dv();

    /* renamed from: eE */
    void mo53579eE(Map map);

    /* renamed from: f3 */
    Object mo53580f3(C0054s c0054s, Continuation continuation);

    /* renamed from: gl */
    void mo53581gl(String str, LoadMoreInfo loadMoreInfo);

    /* renamed from: h */
    String mo53582h();

    /* renamed from: in */
    void mo53583in(String str, String str2, String str3);

    /* renamed from: lB */
    void mo53584lB(Video video);

    /* renamed from: nb */
    void mo53585nb(BreakSlot breakSlot, boolean z11, boolean z12);

    /* renamed from: oC */
    void mo53586oC(String str, InterfaceC18505l interfaceC18505l, InterfaceC18505l interfaceC18505l2);

    /* renamed from: p1 */
    Object mo53587p1(String str, Continuation continuation);

    /* renamed from: q1 */
    void mo53588q1(LoadMoreInfo loadMoreInfo);

    /* renamed from: qn */
    String mo53589qn();

    /* renamed from: sA */
    void mo53590sA(BreakSlot breakSlot, boolean z11);

    /* renamed from: ss */
    void mo53591ss(Video video, boolean z11);

    /* renamed from: tH */
    void mo53592tH(Video video, boolean z11);

    /* renamed from: ws */
    void mo53593ws(Map map);

    /* renamed from: yk */
    void mo53594yk(String str, String str2);
}
