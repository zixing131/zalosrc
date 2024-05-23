package fp0;

import android.content.Context;
import android.text.TextUtils;
import au.C2343e;
import com.androidquery.util.AbstractC3972e;
import com.androidquery.util.C3977j;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.uicontrol.C16640q2;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalocore.CoreUtility;
import me0.AbstractC23136l9;
import me0.AbstractC23184q2;
import me0.AbstractC23268y2;
import me0.C23278z2;
import p348mi.C23302b;
import p354n3.C23528a;
import p379o3.C24003n;
import vg.AbstractRunnableC28185s6;

/* renamed from: fp0.b */
/* loaded from: classes7.dex */
public class C19101b extends C16716d implements AbstractRunnableC28185s6.b {

    /* renamed from: M0 */
    private final C24003n f95084M0;

    /* renamed from: N0 */
    private C3977j f95085N0;

    /* renamed from: O0 */
    private C19100a f95086O0;

    /* renamed from: P0 */
    private int f95087P0;

    /* renamed from: Q0 */
    private int f95088Q0;

    /* renamed from: R0 */
    private C23528a f95089R0;

    /* renamed from: S0 */
    private int f95090S0;

    /* renamed from: T0 */
    public boolean f95091T0;

    public C19101b(Context context, int i11, int i12) {
        super(context);
        this.f95084M0 = C23278z2.m120143n();
        this.f95091T0 = false;
        m100333p1(context, i11, i12);
    }

    /* renamed from: p1 */
    private void m100333p1(Context context, int i11, int i12) {
        this.f95089R0 = new C23528a(context);
        this.f95088Q0 = i12;
        this.f95087P0 = AbstractC23136l9.m118641B(context, AbstractC16801x.white);
        this.f95090S0 = i11 + this.f95088Q0;
        C19100a c19100a = new C19100a(context);
        this.f95086O0 = c19100a;
        c19100a.m111929z1(5);
        C16718f m89106L = this.f95086O0.m89106L();
        int i13 = this.f95090S0;
        m89106L.m89028L(i13, i13);
        C19100a c19100a2 = this.f95086O0;
        c19100a2.f95075W0 = this.f95087P0;
        c19100a2.f95076X0 = this.f95088Q0;
        c19100a2.f95082d1 = false;
        m89001g1(c19100a2);
        this.f95085N0 = new C3977j(context);
    }

    /* renamed from: r1 */
    private void m100334r1(int i11, String str, String str2, String str3) {
        if (i11 == 3 && str != null && str2 != null) {
            this.f95086O0.mo111925v1(C16640q2.m88404a().mo88412f(str2, C2343e.m12307a(str, false)));
        } else if (i11 == 2) {
            AbstractC23268y2.m120033g(this.f95089R0, this.f95085N0, this.f95086O0, str3, this.f95084M0, this.f95091T0);
        } else {
            this.f95086O0.mo111925v1(this.f95084M0.f116261b);
        }
    }

    /* renamed from: o1 */
    public void m100335o1() {
        this.f95086O0.m100330F1();
    }

    /* renamed from: q1 */
    public void m100336q1(ContactProfile contactProfile) {
        int i11;
        String m40418n0;
        try {
            this.f95086O0.mo44614b1(0);
            AbstractC3972e.m18783g0(this.f95085N0);
            if (contactProfile != null) {
                String str = contactProfile.f42446v;
                String str2 = null;
                if (TextUtils.isEmpty(str)) {
                    i11 = 1;
                } else {
                    if (C23302b.f113247a.m120523d(str) && !CoreUtility.f89233i.equals(contactProfile.f42434r)) {
                        m40418n0 = contactProfile.m40418n0();
                        str2 = contactProfile.f42434r;
                        i11 = 3;
                        m100334r1(i11, str2, m40418n0, str);
                    }
                    i11 = 2;
                }
                m40418n0 = null;
                m100334r1(i11, str2, m40418n0, str);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: s1 */
    public void m100337s1(int i11) {
        if (i11 > 0) {
            this.f95086O0.m100332H1(AbstractC23184q2.m119455m(i11), true, this.f95090S0);
        } else {
            m100335o1();
        }
    }

    /* renamed from: t1 */
    public void m100338t1(int i11, float f11) {
        this.f95087P0 = i11;
        C19100a c19100a = this.f95086O0;
        c19100a.f95075W0 = i11;
        c19100a.m100331G1(f11);
        invalidate();
    }
}
