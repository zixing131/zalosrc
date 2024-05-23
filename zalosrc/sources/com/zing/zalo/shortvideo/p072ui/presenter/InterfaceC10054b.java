package com.zing.zalo.shortvideo.p072ui.presenter;

import com.zing.zalo.shortvideo.data.model.Channel;
import com.zing.zalo.shortvideo.data.model.LoadMoreInfo;
import com.zing.zalo.shortvideo.data.model.SimilarChannel;

/* renamed from: com.zing.zalo.shortvideo.ui.presenter.b */
/* loaded from: classes5.dex */
public interface InterfaceC10054b extends InterfaceC10053a {

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.b$a */
    /* loaded from: classes5.dex */
    public static final class a {
        /* renamed from: a */
        public static /* synthetic */ void m53671a(InterfaceC10054b interfaceC10054b, boolean z11, boolean z12, boolean z13, int i11, Object obj) {
            if (obj == null) {
                if ((i11 & 2) != 0) {
                    z12 = false;
                }
                if ((i11 & 4) != 0) {
                    z13 = false;
                }
                interfaceC10054b.mo53064fD(z11, z12, z13);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestFollow");
        }
    }

    /* renamed from: Nr */
    void mo53060Nr();

    /* renamed from: Q9 */
    void mo53061Q9(String str);

    /* renamed from: Qk */
    void mo53062Qk(String str, String str2, boolean z11);

    /* renamed from: dp */
    String mo53063dp();

    /* renamed from: fD */
    void mo53064fD(boolean z11, boolean z12, boolean z13);

    /* renamed from: fa */
    void mo53065fa(SimilarChannel similarChannel, int i11);

    /* renamed from: jH */
    void mo53066jH();

    /* renamed from: q */
    Channel mo53067q();

    /* renamed from: q1 */
    void mo53068q1(LoadMoreInfo loadMoreInfo);

    /* renamed from: qs */
    void mo53069qs(boolean z11);

    /* renamed from: re */
    void mo53070re(String str);

    void release();

    /* renamed from: yd */
    boolean mo53071yd();
}
