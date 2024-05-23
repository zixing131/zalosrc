package com.zing.zalo.shortvideo.p072ui.presenter;

import com.zing.zalo.shortvideo.data.model.Channel;
import com.zing.zalo.shortvideo.data.model.Comment;
import com.zing.zalo.shortvideo.data.model.LivestreamData;
import com.zing.zalo.shortvideo.data.model.LoadMoreInfo;
import en0.InterfaceC18505l;

/* renamed from: com.zing.zalo.shortvideo.ui.presenter.d */
/* loaded from: classes5.dex */
public interface InterfaceC10056d extends InterfaceC10053a {

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.d$a */
    /* loaded from: classes5.dex */
    public static final class a {
        /* renamed from: a */
        public static /* synthetic */ void m53674a(InterfaceC10056d interfaceC10056d, LoadMoreInfo loadMoreInfo, int i11, Object obj) {
            if (obj == null) {
                if ((i11 & 1) != 0) {
                    loadMoreInfo = null;
                }
                interfaceC10056d.mo53270ej(loadMoreInfo);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadLivestreams");
        }
    }

    /* renamed from: A9 */
    void mo53257A9(String str, Channel channel, boolean z11, boolean z12);

    /* renamed from: BG */
    void mo53258BG();

    /* renamed from: G2 */
    void mo53259G2(String str, String str2, String str3, InterfaceC18505l interfaceC18505l);

    /* renamed from: Ho */
    void mo53260Ho(String str);

    /* renamed from: Lu */
    void mo53261Lu(String str, String str2);

    /* renamed from: Ma */
    void mo53262Ma(String str, String str2, String str3);

    /* renamed from: Oy */
    void mo53263Oy(String str, InterfaceC18505l interfaceC18505l, InterfaceC18505l interfaceC18505l2);

    /* renamed from: VA */
    void mo53264VA(String str, String str2);

    /* renamed from: aa */
    void mo53265aa(String str, String str2, String str3, Comment.Identity identity, boolean z11);

    /* renamed from: ej */
    void mo53270ej(LoadMoreInfo loadMoreInfo);

    /* renamed from: kk */
    void mo53274kk(String str, String str2, String str3, String str4, String str5);

    /* renamed from: xv */
    LivestreamData mo53277xv();

    /* renamed from: zs */
    void mo53278zs(String str, String str2, String str3);

    /* renamed from: zx */
    void mo53279zx(String str, String str2, int i11);
}
