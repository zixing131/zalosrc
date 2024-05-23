package m20;

import com.zing.zalo.shortvideo.data.model.Comment;
import com.zing.zalo.shortvideo.data.model.Section;

/* renamed from: m20.w */
/* loaded from: classes5.dex */
public interface InterfaceC22809w extends InterfaceC22717a {

    /* renamed from: m20.w$a */
    /* loaded from: classes5.dex */
    public static final class a {
        /* renamed from: a */
        public static /* synthetic */ void m117529a(InterfaceC22809w interfaceC22809w, boolean z11, String str, int i11, Integer num, String str2, Throwable th2, int i12, Object obj) {
            if (obj == null) {
                if ((i12 & 32) != 0) {
                    th2 = null;
                }
                interfaceC22809w.mo54165pz(z11, str, i11, num, str2, th2);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: doOnPinCommentResult");
        }

        /* renamed from: b */
        public static /* synthetic */ void m117530b(InterfaceC22809w interfaceC22809w, Comment comment, Throwable th2, int i11, Object obj) {
            if (obj == null) {
                if ((i11 & 2) != 0) {
                    th2 = null;
                }
                interfaceC22809w.mo54159YF(comment, th2);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: doOnReceiveRemoveResult");
        }
    }

    /* renamed from: Uj */
    void mo54156Uj(Comment comment, Comment comment2, boolean z11, boolean z12);

    /* renamed from: Vw */
    void mo54157Vw(Throwable th2, Comment comment);

    /* renamed from: X2 */
    void mo54158X2(String str, boolean z11, Throwable th2);

    /* renamed from: YF */
    void mo54159YF(Comment comment, Throwable th2);

    /* renamed from: b */
    void mo54161b(boolean z11);

    /* renamed from: d */
    void mo54162d(Throwable th2);

    /* renamed from: pz */
    void mo54165pz(boolean z11, String str, int i11, Integer num, String str2, Throwable th2);

    /* renamed from: vE */
    void mo54166vE(Section section, Comment comment);

    /* renamed from: xd */
    void mo54167xd(Throwable th2);

    /* renamed from: xn */
    void mo54168xn(Section section);
}
