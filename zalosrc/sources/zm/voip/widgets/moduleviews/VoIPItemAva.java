package zm.voip.widgets.moduleviews;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import au.C2343e;
import bp0.AbstractC3096i0;
import com.androidquery.util.AbstractC3972e;
import com.androidquery.util.C3977j;
import com.androidquery.util.InterfaceC3968a;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.uicontrol.C16640q2;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.uidrawing.ModulesView;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fp0.C19100a;
import java.util.ArrayList;
import java.util.List;
import kd0.C21693c;
import ko0.C21791f;
import me0.AbstractC23136l9;
import me0.AbstractC23184q2;
import me0.AbstractC23222t7;
import me0.AbstractC23268y2;
import me0.C23278z2;
import p348mi.C23302b;
import p354n3.C23528a;
import p379o3.C24003n;
import vg.AbstractRunnableC28185s6;
import vg.C28203u6;

/* loaded from: classes7.dex */
public final class VoIPItemAva extends ModulesView implements AbstractRunnableC28185s6.b {

    /* renamed from: V */
    public static final C32510a f150210V = new C32510a(null);

    /* renamed from: K */
    private final C24003n f150211K;

    /* renamed from: L */
    private List f150212L;

    /* renamed from: M */
    private List f150213M;

    /* renamed from: N */
    private int f150214N;

    /* renamed from: O */
    private int f150215O;

    /* renamed from: P */
    private int f150216P;

    /* renamed from: Q */
    private final ArrayList f150217Q;

    /* renamed from: R */
    private C23528a f150218R;

    /* renamed from: S */
    private int f150219S;

    /* renamed from: T */
    private int f150220T;

    /* renamed from: U */
    private final boolean f150221U;

    /* renamed from: zm.voip.widgets.moduleviews.VoIPItemAva$a */
    /* loaded from: classes7.dex */
    public static final class C32510a {
        private C32510a() {
        }

        public /* synthetic */ C32510a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VoIPItemAva(Context context) {
        this(context, null);
        AbstractC19074t.m100208f(context, "context");
    }

    /* renamed from: V */
    private final void m157462V() {
        String m40418n0;
        String str;
        int i11;
        try {
            int size = this.f150212L.size();
            for (int i12 = 0; i12 < size; i12++) {
                ((C19100a) this.f150213M.get(i12)).mo44614b1(8);
            }
            int m15529b0 = AbstractC3096i0.m15529b0(this.f150217Q.size(), 3);
            if (m15529b0 == 0) {
                return;
            }
            for (int i13 = 0; i13 < m15529b0; i13++) {
                Object obj = this.f150217Q.get(i13);
                AbstractC19074t.m100207e(obj, "get(...)");
                C21791f c21791f = (C21791f) obj;
                ((C19100a) this.f150213M.get(i13)).mo44614b1(0);
                if (m157463X(i13)) {
                    String m119455m = AbstractC23184q2.m119455m(this.f150220T);
                    AbstractC19074t.m100207e(m119455m, "getTextMore(...)");
                    ((C19100a) this.f150213M.get(i13)).m100332H1(m119455m, true, this.f150219S);
                }
                AbstractC3972e.m18783g0((InterfaceC3968a) this.f150212L.get(i13));
                ContactProfile m141800i = C28203u6.m141800i(C28203u6.f131407a, String.valueOf(c21791f.m112477l()), false, 2, null);
                if (m141800i == null) {
                    m141800i = new ContactProfile(String.valueOf(c21791f.m112477l()));
                }
                String str2 = m141800i.f42446v;
                AbstractC19074t.m100207e(str2, "avt");
                if (str2.length() == 0) {
                    m141800i.f42446v = c21791f.m112467b();
                }
                String str3 = m141800i.f42437s;
                AbstractC19074t.m100207e(str3, "dpn");
                if (str3.length() == 0) {
                    m141800i.f42437s = c21791f.m112471f();
                }
                String str4 = m141800i.f42446v;
                if (!TextUtils.isEmpty(str4) && !C23302b.f113247a.m120523d(str4)) {
                    str = null;
                    m40418n0 = null;
                    i11 = 2;
                    m157464a0(i11, str, m40418n0, str4, i13);
                }
                m40418n0 = m141800i.m40418n0();
                str = m141800i.f42434r;
                i11 = 3;
                m157464a0(i11, str, m40418n0, str4, i13);
            }
            if (m15529b0 == 0) {
                ((C19100a) this.f150213M.get(0)).mo44614b1(0);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: X */
    private final boolean m157463X(int i11) {
        return i11 == 2 && this.f150220T > 0;
    }

    /* renamed from: a0 */
    private final void m157464a0(int i11, String str, String str2, String str3, int i12) {
        if (i11 == 3 && str != null && str2 != null) {
            ((C19100a) this.f150213M.get(i12)).mo111925v1(C16640q2.m88404a().mo88412f(str2, C2343e.m12307a(str, false)));
        } else if (i11 == 2) {
            AbstractC23268y2.m120033g(this.f150218R, (C3977j) this.f150212L.get(i12), (C21693c) this.f150213M.get(i12), str3, this.f150211K, this.f150221U);
        } else {
            ((C19100a) this.f150213M.get(i12)).mo111925v1(this.f150211K.f116261b);
        }
    }

    /* renamed from: W */
    public final void m157465W(int i11) {
        this.f150218R = new C23528a(getContext());
        this.f150214N = i11 / 3;
        this.f150216P = AbstractC23222t7.f112554d;
        this.f150215O = AbstractC23136l9.m118641B(getContext(), AbstractC16801x.white);
        this.f150219S = i11 + this.f150216P;
        for (int i12 = 0; i12 < 4; i12++) {
            List list = this.f150212L;
            Context context = getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            list.add(i12, new C3977j(context));
        }
        for (int i13 = 0; i13 < 4; i13++) {
            this.f150213M.add(i13, new C19100a(getContext()));
            C19100a c19100a = (C19100a) this.f150213M.get(i13);
            c19100a.m111929z1(5);
            C16718f m89106L = c19100a.m89106L();
            int i14 = this.f150219S;
            m89106L.m89028L(i14, i14);
            c19100a.f95075W0 = this.f150215O;
            c19100a.f95076X0 = this.f150216P;
            c19100a.mo111926w1(AbstractC16803z.default_avatar);
            c19100a.m100331G1(0.05f);
            c19100a.mo44614b1(8);
            mo69681L(c19100a);
        }
        int size = this.f150213M.size();
        for (int i15 = 1; i15 < size; i15++) {
            ((C19100a) this.f150213M.get(i15)).m89106L().m89034R(-this.f150214N).m89054h0((C16719g) this.f150213M.get(i15 - 1));
        }
    }

    /* renamed from: Y */
    public final void m157466Y(C21791f c21791f) {
        AbstractC19074t.m100208f(c21791f, "participantInfo");
        this.f150217Q.clear();
        this.f150217Q.add(c21791f);
        m157462V();
    }

    public final void setStrokeColor(int i11) {
        this.f150215O = i11;
    }

    public final void setStrokeWidth(int i11) {
        this.f150216P = i11;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VoIPItemAva(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        AbstractC19074t.m100208f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoIPItemAva(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
        this.f150211K = C23278z2.m120143n();
        this.f150212L = new ArrayList();
        this.f150213M = new ArrayList();
        this.f150217Q = new ArrayList();
    }
}
