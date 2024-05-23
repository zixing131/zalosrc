package x00;

import com.zing.zalo.shortvideo.data.model.Section;
import com.zing.zalo.shortvideo.p072ui.model.Video;
import java.util.List;
import pm0.C24860q;

/* renamed from: x00.d */
/* loaded from: classes5.dex */
public interface InterfaceC29283d {

    /* renamed from: x00.d$a */
    /* loaded from: classes5.dex */
    public static final class a {
        /* renamed from: a */
        public static /* synthetic */ void m146384a(InterfaceC29283d interfaceC29283d, String str, Boolean bool, Long l11, int i11, Object obj) {
            if (obj == null) {
                if ((i11 & 2) != 0) {
                    bool = null;
                }
                if ((i11 & 4) != 0) {
                    l11 = null;
                }
                interfaceC29283d.mo146383v(str, bool, l11);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: putVideoBookmarkState");
        }

        /* renamed from: b */
        public static /* synthetic */ void m146385b(InterfaceC29283d interfaceC29283d, String str, Boolean bool, Long l11, int i11, Object obj) {
            if (obj == null) {
                if ((i11 & 2) != 0) {
                    bool = null;
                }
                if ((i11 & 4) != 0) {
                    l11 = null;
                }
                interfaceC29283d.mo146382u(str, bool, l11);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: putVideoLikeState");
        }
    }

    /* renamed from: a */
    List mo146362a();

    /* renamed from: b */
    void mo146363b(boolean z11);

    /* renamed from: c */
    void mo146364c(Video video);

    void clear();

    /* renamed from: d */
    List mo146365d();

    /* renamed from: e */
    void mo146366e(Video video);

    /* renamed from: f */
    boolean mo146367f();

    /* renamed from: g */
    void mo146368g(Video video);

    /* renamed from: h */
    List mo146369h();

    /* renamed from: i */
    List mo146370i();

    /* renamed from: j */
    void mo146371j(String str, Section section);

    /* renamed from: k */
    void mo146372k(boolean z11);

    /* renamed from: l */
    void mo146373l(Video video);

    /* renamed from: m */
    boolean mo146374m();

    /* renamed from: n */
    void mo146375n(String str, boolean z11);

    /* renamed from: o */
    void mo146376o(boolean z11);

    /* renamed from: p */
    Boolean mo146377p(String str);

    /* renamed from: q */
    void mo146378q(boolean z11);

    /* renamed from: r */
    C24860q mo146379r(String str);

    /* renamed from: s */
    C24860q mo146380s(String str);

    /* renamed from: t */
    Section mo146381t(String str);

    /* renamed from: u */
    void mo146382u(String str, Boolean bool, Long l11);

    /* renamed from: v */
    void mo146383v(String str, Boolean bool, Long l11);
}
