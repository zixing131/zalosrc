package zm.voip.widgets.moduleviews;

import android.content.Context;
import bp0.AbstractC3104p;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.uidrawing.ModulesView;
import fp0.C19101b;
import jo0.C21329g;
import ko0.C21791f;
import me0.AbstractC23136l9;

/* loaded from: classes7.dex */
public class MemberGCallModuleView extends ModulesView {

    /* renamed from: K */
    private final C19101b f150193K;

    /* renamed from: L */
    private final C21329g f150194L;

    public MemberGCallModuleView(Context context, C21329g c21329g) {
        super(context);
        this.f150194L = c21329g;
        int m118655I = AbstractC23136l9.m118655I(AbstractC16802y.avt_S);
        int m118742r = AbstractC23136l9.m118742r(2.0f);
        int i11 = m118655I + m118742r;
        m88987U(AbstractC3104p.m15663g0(), -1);
        C19101b c19101b = new C19101b(context, m118655I, m118742r);
        this.f150193K = c19101b;
        c19101b.m89106L().m89025I(true).m89028L(i11, i11);
        mo69681L(c19101b);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x007a A[Catch: Exception -> 0x001e, TRY_LEAVE, TryCatch #0 {Exception -> 0x001e, blocks: (B:13:0x0005, B:15:0x000b, B:17:0x0012, B:6:0x0025, B:8:0x0068, B:10:0x007a, B:5:0x0020), top: B:12:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0068 A[Catch: Exception -> 0x001e, TryCatch #0 {Exception -> 0x001e, blocks: (B:13:0x0005, B:15:0x000b, B:17:0x0012, B:6:0x0025, B:8:0x0068, B:10:0x007a, B:5:0x0020), top: B:12:0x0005 }] */
    /* renamed from: V */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m157449V(C21791f c21791f, boolean z11, int i11) {
        if (c21791f == null) {
            return;
        }
        if (i11 == 0) {
            try {
                C21329g c21329g = this.f150194L;
                if (!c21329g.f103850v && c21329g.mo10003k() > 1) {
                    this.f150193K.m100337s1(this.f150194L.mo10003k());
                    this.f150193K.m89106L().m89031O(AbstractC23136l9.m118742r(4.0f));
                    ContactProfile contactProfile = new ContactProfile(String.valueOf(c21791f.m112477l()));
                    contactProfile.f42446v = c21791f.m112467b();
                    contactProfile.f42437s = c21791f.m112471f();
                    C19101b c19101b = this.f150193K;
                    c19101b.f95091T0 = z11;
                    c19101b.m100336q1(contactProfile);
                    if (!this.f150194L.m110441P().contains(Integer.valueOf(c21791f.m112477l()))) {
                        C19101b c19101b2 = this.f150193K;
                        c19101b2.m100338t1(AbstractC23136l9.m118641B(c19101b2.getContext(), AbstractC16801x.white), 1.0f);
                        return;
                    } else {
                        C19101b c19101b3 = this.f150193K;
                        c19101b3.m100338t1(AbstractC23136l9.m118641B(c19101b3.getContext(), AbstractC16801x.white), 0.0f);
                        return;
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
        this.f150193K.m100335o1();
        this.f150193K.m89106L().m89031O(AbstractC23136l9.m118742r(4.0f));
        ContactProfile contactProfile2 = new ContactProfile(String.valueOf(c21791f.m112477l()));
        contactProfile2.f42446v = c21791f.m112467b();
        contactProfile2.f42437s = c21791f.m112471f();
        C19101b c19101b4 = this.f150193K;
        c19101b4.f95091T0 = z11;
        c19101b4.m100336q1(contactProfile2);
        if (!this.f150194L.m110441P().contains(Integer.valueOf(c21791f.m112477l()))) {
        }
    }
}
