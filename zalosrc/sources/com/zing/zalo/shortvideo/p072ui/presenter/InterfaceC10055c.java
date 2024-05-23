package com.zing.zalo.shortvideo.p072ui.presenter;

import com.zing.zalo.shortvideo.data.model.Comment;
import com.zing.zalo.shortvideo.data.model.LoadMoreInfo;
import com.zing.zalo.shortvideo.utils.other.CommentSource;

/* renamed from: com.zing.zalo.shortvideo.ui.presenter.c */
/* loaded from: classes5.dex */
public interface InterfaceC10055c extends InterfaceC10053a {

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.c$a */
    /* loaded from: classes5.dex */
    public static final class a {
        /* renamed from: a */
        public static /* synthetic */ void m53672a(InterfaceC10055c interfaceC10055c, LoadMoreInfo loadMoreInfo, String str, int i11, Object obj) {
            if (obj == null) {
                if ((i11 & 1) != 0) {
                    loadMoreInfo = null;
                }
                if ((i11 & 2) != 0) {
                    str = null;
                }
                interfaceC10055c.mo53123HF(loadMoreInfo, str);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadComments");
        }

        /* renamed from: b */
        public static /* synthetic */ void m53673b(InterfaceC10055c interfaceC10055c, boolean z11, String str, int i11, Integer num, String str2, int i12, Object obj) {
            Integer num2;
            String str3;
            if (obj == null) {
                if ((i12 & 8) != 0) {
                    num2 = null;
                } else {
                    num2 = num;
                }
                if ((i12 & 16) != 0) {
                    str3 = null;
                } else {
                    str3 = str2;
                }
                interfaceC10055c.mo53120AA(z11, str, i11, num2, str3);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestPinComment");
        }
    }

    /* renamed from: AA */
    void mo53120AA(boolean z11, String str, int i11, Integer num, String str2);

    /* renamed from: Ct */
    void mo53121Ct(Comment comment, boolean z11, boolean z12);

    /* renamed from: H4 */
    void mo53122H4(Comment comment, LoadMoreInfo loadMoreInfo);

    /* renamed from: HF */
    void mo53123HF(LoadMoreInfo loadMoreInfo, String str);

    /* renamed from: Of */
    void mo53125Of(Comment comment);

    /* renamed from: h */
    CommentSource mo53126h();

    /* renamed from: tI */
    void mo53127tI(String str, boolean z11);
}
