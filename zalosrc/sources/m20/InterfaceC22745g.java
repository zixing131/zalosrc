package m20;

import com.zing.zalo.shortvideo.data.model.Channel;
import com.zing.zalo.shortvideo.data.model.Section;
import com.zing.zalo.shortvideo.p072ui.model.Video;
import java.util.List;

/* renamed from: m20.g */
/* loaded from: classes5.dex */
public interface InterfaceC22745g extends InterfaceC22717a {

    /* renamed from: m20.g$a */
    /* loaded from: classes5.dex */
    public static final class a {
        /* renamed from: a */
        public static /* synthetic */ void m117527a(InterfaceC22745g interfaceC22745g, Section section, Throwable th2, int i11, Object obj) {
            if (obj == null) {
                if ((i11 & 2) != 0) {
                    th2 = null;
                }
                interfaceC22745g.mo54063Fg(section, th2);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: doOnFindJustWatchedVideoResult");
        }

        /* renamed from: b */
        public static /* synthetic */ void m117528b(InterfaceC22745g interfaceC22745g, boolean z11, Object obj, boolean z12, int i11, Object obj2) {
            if (obj2 == null) {
                if ((i11 & 4) != 0) {
                    z12 = false;
                }
                interfaceC22745g.mo54065Jc(z11, obj, z12);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: doOnReceiveBlockResult");
        }
    }

    /* renamed from: Fg */
    void mo54063Fg(Section section, Throwable th2);

    /* renamed from: Ft */
    void mo54064Ft(Channel channel);

    /* renamed from: Jc */
    void mo54065Jc(boolean z11, Object obj, boolean z12);

    /* renamed from: O4 */
    void mo54066O4(Object obj, String str, boolean z11);

    /* renamed from: b */
    void mo54073b(boolean z11);

    /* renamed from: bF */
    void mo54074bF(Section section);

    /* renamed from: d */
    void mo54075d(Throwable th2);

    /* renamed from: nl */
    void mo54076nl(Video video);

    /* renamed from: om */
    void mo54077om(List list);

    /* renamed from: oy */
    void mo54078oy(boolean z11, Object obj, boolean z12, boolean z13);
}
