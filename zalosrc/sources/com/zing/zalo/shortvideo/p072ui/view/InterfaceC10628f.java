package com.zing.zalo.shortvideo.p072ui.view;

import com.zing.zalo.shortvideo.data.model.Channel;
import com.zing.zalo.shortvideo.data.model.LoadMoreInfo;
import com.zing.zalo.shortvideo.data.model.Section;
import com.zing.zalo.shortvideo.data.model.VideoAdsData;
import com.zing.zalo.shortvideo.p072ui.model.Video;
import java.util.List;
import java.util.Map;
import m20.InterfaceC22717a;
import q20.C25093p;
import u10.C26947a;
import z10.C31179n0;

/* renamed from: com.zing.zalo.shortvideo.ui.view.f */
/* loaded from: classes5.dex */
public interface InterfaceC10628f extends InterfaceC22717a {

    /* renamed from: com.zing.zalo.shortvideo.ui.view.f$a */
    /* loaded from: classes5.dex */
    public static final class a {
        /* renamed from: a */
        public static /* synthetic */ void m55557a(InterfaceC10628f interfaceC10628f, Video video, Throwable th2, int i11, Object obj) {
            if (obj == null) {
                if ((i11 & 2) != 0) {
                    th2 = null;
                }
                interfaceC10628f.mo55379Jf(video, th2);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: doOnReceiveDeleteResult");
        }

        /* renamed from: b */
        public static /* synthetic */ void m55558b(InterfaceC10628f interfaceC10628f, Video video, boolean z11, Throwable th2, int i11, Object obj) {
            if (obj == null) {
                if ((i11 & 4) != 0) {
                    th2 = null;
                }
                interfaceC10628f.mo55376Fd(video, z11, th2);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: doOnReceivePinResult");
        }

        /* renamed from: c */
        public static /* synthetic */ void m55559c(InterfaceC10628f interfaceC10628f, Section section, List list, List list2, int i11, Object obj) {
            if (obj == null) {
                if ((i11 & 2) != 0) {
                    list = null;
                }
                interfaceC10628f.mo55380MD(section, list, list2);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: doOnReceiveVideos");
        }

        /* renamed from: d */
        public static /* synthetic */ void m55560d(InterfaceC10628f interfaceC10628f, Section section, Throwable th2, int i11, Object obj) {
            if (obj == null) {
                if ((i11 & 1) != 0) {
                    section = null;
                }
                if ((i11 & 2) != 0) {
                    th2 = null;
                }
                interfaceC10628f.mo55390fo(section, th2);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: doOnReceiveVideosSimilar");
        }
    }

    /* renamed from: Ao */
    int mo55374Ao();

    /* renamed from: Ea */
    void mo55375Ea(String str, boolean z11, Throwable th2);

    /* renamed from: Fd */
    void mo55376Fd(Video video, boolean z11, Throwable th2);

    /* renamed from: J8 */
    void mo55377J8(String str, boolean z11, Throwable th2);

    /* renamed from: Ja */
    void mo55378Ja(Map map);

    /* renamed from: Jf */
    void mo55379Jf(Video video, Throwable th2);

    /* renamed from: MD */
    void mo55380MD(Section section, List list, List list2);

    /* renamed from: Rg */
    void mo55381Rg(Section section, Throwable th2);

    /* renamed from: SH */
    void mo55382SH(Channel channel, boolean z11, boolean z12, Object obj);

    /* renamed from: W0 */
    void mo55383W0(boolean z11);

    /* renamed from: Wh */
    int mo55384Wh(int i11, VideoAdsData videoAdsData);

    /* renamed from: X2 */
    void mo55385X2(String str, boolean z11, Throwable th2);

    /* renamed from: Zd */
    void mo55386Zd(Map map);

    /* renamed from: b */
    void mo55387b(boolean z11);

    /* renamed from: d */
    void mo55388d(Throwable th2);

    /* renamed from: fi */
    void mo55389fi(List list);

    /* renamed from: fo */
    void mo55390fo(Section section, Throwable th2);

    /* renamed from: gD */
    C26947a.c mo55391gD();

    /* renamed from: hp */
    void mo55392hp(Video video);

    /* renamed from: ir */
    void mo55393ir(List list, LoadMoreInfo loadMoreInfo);

    /* renamed from: jd */
    C25093p.c mo55394jd();

    /* renamed from: sC */
    C31179n0 mo55400sC();

    /* renamed from: xw */
    void mo55403xw(Section section, List list, boolean z11, List list2);
}
