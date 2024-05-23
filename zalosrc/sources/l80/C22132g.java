package l80;

import android.content.Context;
import android.text.TextUtils;
import au.C2343e;
import com.androidquery.util.AbstractC3972e;
import com.androidquery.util.C3977j;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.uicontrol.C16640q2;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalocore.CoreUtility;
import gg0.AbstractC19444a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l80.C22132g;
import me0.AbstractC23136l9;
import me0.AbstractC23184q2;
import me0.AbstractC23222t7;
import me0.AbstractC23268y2;
import me0.C23212s8;
import me0.C23278z2;
import p348mi.C23302b;
import p354n3.C23528a;
import p379o3.C24003n;
import vg.AbstractRunnableC28185s6;
import vg.C28203u6;

/* renamed from: l80.g */
/* loaded from: classes6.dex */
public class C22132g extends C16716d implements AbstractRunnableC28185s6.b {

    /* renamed from: M0 */
    C3977j[] f108970M0;

    /* renamed from: N0 */
    C24003n f108971N0;

    /* renamed from: O0 */
    C22128d0[] f108972O0;

    /* renamed from: P0 */
    C22126c0 f108973P0;

    /* renamed from: Q0 */
    int f108974Q0;

    /* renamed from: R0 */
    int f108975R0;

    /* renamed from: S0 */
    int f108976S0;

    /* renamed from: T0 */
    int f108977T0;

    /* renamed from: U0 */
    int f108978U0;

    /* renamed from: V0 */
    int f108979V0;

    /* renamed from: W0 */
    ArrayList f108980W0;

    /* renamed from: X0 */
    C23528a f108981X0;

    /* renamed from: Y0 */
    boolean f108982Y0;

    /* renamed from: l80.g$a */
    /* loaded from: classes6.dex */
    public class a extends AbstractRunnableC28185s6 {

        /* renamed from: z */
        final /* synthetic */ List f108984z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(AbstractRunnableC28185s6.b bVar, List list, int i11, List list2) {
            super(bVar, list, i11);
            this.f108984z = list2;
        }

        /* renamed from: h */
        public /* synthetic */ void m115451h(List list) {
            String str;
            String str2;
            try {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    int intValue = ((Integer) it.next()).intValue();
                    AbstractC3972e.m18783g0(C22132g.this.f108970M0[intValue]);
                    String str3 = (String) C22132g.this.f108980W0.get(intValue);
                    ContactProfile m141811g = C28203u6.f131407a.m141811g(str3);
                    int i11 = 1;
                    String str4 = null;
                    if (m141811g != null) {
                        String str5 = m141811g.f42446v;
                        if (TextUtils.isEmpty(str5)) {
                            str2 = str5;
                        } else if (C23302b.f113247a.m120523d(str5) && !CoreUtility.f89233i.equals(str3)) {
                            i11 = 3;
                            str4 = str3;
                            str2 = str5;
                            str = m141811g.m40418n0();
                        } else {
                            str2 = str5;
                            i11 = 2;
                        }
                        str = null;
                    } else {
                        str = null;
                        str2 = null;
                    }
                    C22132g.this.m115448q1(i11, str4, str, str2, intValue);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // vg.AbstractRunnableC28185s6
        /* renamed from: c */
        public void mo61137c(ArrayList arrayList) {
            AbstractC19444a.m101695c(new Runnable() { // from class: l80.f

                /* renamed from: q */
                public final /* synthetic */ List f108969q;

                public /* synthetic */ RunnableC22131f(List list) {
                    r2 = list;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C22132g.a.this.m115451h(r2);
                }
            });
        }
    }

    public C22132g(Context context, int i11, int i12, float f11, int i13) {
        super(context);
        this.f108971N0 = C23278z2.m120143n();
        this.f108974Q0 = 4;
        int i14 = 0;
        this.f108975R0 = 0;
        this.f108979V0 = 0;
        this.f108980W0 = new ArrayList();
        this.f108982Y0 = false;
        this.f108981X0 = new C23528a(context);
        this.f108974Q0 = i12;
        this.f108975R0 = i13;
        this.f108977T0 = AbstractC23222t7.f112550b;
        this.f108976S0 = C23212s8.m119607o(context, AbstractC16781w.PrimaryBackgroundColor);
        int i15 = this.f108974Q0;
        this.f108970M0 = new C3977j[i15 - 1];
        this.f108972O0 = new C22128d0[i15 - 1];
        int i16 = 0;
        while (true) {
            C3977j[] c3977jArr = this.f108970M0;
            if (i16 >= c3977jArr.length) {
                break;
            }
            c3977jArr[i16] = new C3977j(context);
            i16++;
        }
        this.f108978U0 = ((int) ((((int) (f11 * i11)) - r6) / this.f108974Q0)) + this.f108975R0;
        while (true) {
            C22128d0[] c22128d0Arr = this.f108972O0;
            if (i14 >= c22128d0Arr.length) {
                break;
            }
            c22128d0Arr[i14] = new C22128d0(context);
            this.f108972O0[i14].m111929z1(5);
            C16718f m89106L = this.f108972O0[i14].m89106L();
            int i17 = this.f108978U0;
            m89106L.m89028L(i17, i17);
            C22128d0 c22128d0 = this.f108972O0[i14];
            c22128d0.f108917W0 = this.f108976S0;
            c22128d0.f108918X0 = this.f108977T0;
            m89001g1(c22128d0);
            i14++;
        }
        int i18 = 1;
        while (true) {
            C22128d0[] c22128d0Arr2 = this.f108972O0;
            if (i18 < c22128d0Arr2.length) {
                c22128d0Arr2[i18].m89106L().m89034R(-this.f108975R0).m89054h0(this.f108972O0[i18 - 1]);
                i18++;
            } else {
                C22126c0 c22126c0 = new C22126c0(context);
                this.f108973P0 = c22126c0;
                c22126c0.m115422R1();
                this.f108973P0.mo111965M1(1);
                this.f108973P0.mo111964L1(this.f108978U0 / 3.0f);
                this.f108973P0.m111962J1(AbstractC23136l9.m118641B(context, AbstractC16801x.white));
                C16718f m89106L2 = this.f108973P0.m89106L();
                int i19 = this.f108978U0;
                m89106L2.m89028L(i19, i19).m89029M(15);
                this.f108973P0.m89087B0(AbstractC16803z.bg_count_see_more_white_border_circle);
                m89001g1(this.f108973P0);
                return;
            }
        }
    }

    /* renamed from: o1 */
    void m115446o1() {
        ContactProfile contactProfile;
        String str;
        String str2;
        int i11;
        for (int i12 = 0; i12 < this.f108970M0.length; i12++) {
            try {
                this.f108972O0[i12].mo44614b1(8);
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
        int min = Math.min(this.f108980W0.size(), this.f108970M0.length);
        if (min <= 0) {
            this.f108973P0.m89106L().m89073z(Boolean.TRUE).m89034R(0);
        } else {
            this.f108973P0.m89106L().m89054h0(this.f108972O0[min - 1]).m89034R(-this.f108975R0);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i13 = 0; i13 < min; i13++) {
            Object obj = this.f108980W0.get(i13);
            this.f108972O0[i13].mo44614b1(0);
            AbstractC3972e.m18783g0(this.f108970M0[i13]);
            String str3 = null;
            if (obj instanceof ContactProfile) {
                contactProfile = (ContactProfile) obj;
            } else if (obj instanceof String) {
                contactProfile = C28203u6.f131407a.m141811g((String) obj);
            } else {
                contactProfile = null;
            }
            if (contactProfile != null) {
                String str4 = contactProfile.f42446v;
                if (TextUtils.isEmpty(str4)) {
                    str2 = str4;
                    str = null;
                } else {
                    if (C23302b.f113247a.m120523d(str4) && !CoreUtility.f89233i.equals(contactProfile.f42434r)) {
                        str2 = str4;
                        str = contactProfile.m40418n0();
                        str3 = contactProfile.f42434r;
                        i11 = 3;
                    } else {
                        i11 = 2;
                        str2 = str4;
                        str = null;
                    }
                    m115448q1(i11, str3, str, str2, i13);
                }
            } else {
                if (obj instanceof String) {
                    arrayList.add((String) obj);
                    arrayList2.add(Integer.valueOf(i13));
                }
                str = null;
                str2 = null;
            }
            i11 = 1;
            m115448q1(i11, str3, str, str2, i13);
        }
        if (arrayList.size() > 0) {
            new a(this, arrayList, 1053, arrayList2).m141750b();
        }
    }

    /* renamed from: p1 */
    void m115447p1() {
        int i11 = this.f108979V0;
        if (i11 > 0) {
            String m119455m = AbstractC23184q2.m119455m(i11);
            if (m119455m.length() <= 2) {
                this.f108973P0.mo111964L1(this.f108978U0 / 2.4f);
            } else if (m119455m.length() <= 3) {
                this.f108973P0.mo111964L1(this.f108978U0 / 2.8f);
            } else {
                this.f108973P0.mo111964L1(this.f108978U0 / 3.2f);
            }
            this.f108973P0.m111959G1(m119455m);
            this.f108973P0.mo44614b1(0);
        } else {
            this.f108973P0.mo44614b1(8);
        }
        m115446o1();
    }

    /* renamed from: q1 */
    void m115448q1(int i11, String str, String str2, String str3, int i12) {
        if (i11 == 3 && str != null && str2 != null) {
            this.f108972O0[i12].mo111925v1(C16640q2.m88404a().mo88412f(str2, C2343e.m12307a(str, false)));
        } else if (i11 == 2) {
            AbstractC23268y2.m120033g(this.f108981X0, this.f108970M0[i12], this.f108972O0[i12], str3, this.f108971N0, this.f108982Y0);
        } else {
            this.f108972O0[i12].mo111925v1(this.f108971N0.f116261b);
        }
    }

    /* renamed from: r1 */
    public void m115449r1(List list, int i11, boolean z11) {
        this.f108982Y0 = z11;
        this.f108980W0.clear();
        this.f108980W0.addAll(list);
        this.f108979V0 = i11 - Math.min(this.f108980W0.size(), this.f108974Q0 - 1);
        m115447p1();
    }

    public C22132g(Context context, int i11, int i12, int i13) {
        super(context);
        this.f108971N0 = C23278z2.m120143n();
        this.f108974Q0 = 4;
        int i14 = 0;
        this.f108975R0 = 0;
        this.f108979V0 = 0;
        this.f108980W0 = new ArrayList();
        this.f108982Y0 = false;
        this.f108981X0 = new C23528a(context);
        this.f108974Q0 = i12;
        this.f108975R0 = i13;
        this.f108977T0 = AbstractC23222t7.f112552c;
        this.f108976S0 = C23212s8.m119607o(context, AbstractC16781w.RecentlyLikeStrokeColor);
        int i15 = this.f108974Q0;
        this.f108970M0 = new C3977j[i15 - 1];
        this.f108972O0 = new C22128d0[i15 - 1];
        int i16 = 0;
        while (true) {
            C3977j[] c3977jArr = this.f108970M0;
            if (i16 >= c3977jArr.length) {
                break;
            }
            c3977jArr[i16] = new C3977j(context);
            i16++;
        }
        this.f108978U0 = i11 + this.f108977T0;
        while (true) {
            C22128d0[] c22128d0Arr = this.f108972O0;
            if (i14 >= c22128d0Arr.length) {
                break;
            }
            c22128d0Arr[i14] = new C22128d0(context);
            this.f108972O0[i14].m111929z1(5);
            C16718f m89106L = this.f108972O0[i14].m89106L();
            int i17 = this.f108978U0;
            m89106L.m89028L(i17, i17);
            C22128d0 c22128d0 = this.f108972O0[i14];
            c22128d0.f108917W0 = this.f108976S0;
            c22128d0.f108918X0 = this.f108977T0;
            m89001g1(c22128d0);
            i14++;
        }
        int i18 = 1;
        while (true) {
            C22128d0[] c22128d0Arr2 = this.f108972O0;
            if (i18 < c22128d0Arr2.length) {
                c22128d0Arr2[i18].m89106L().m89034R(-this.f108975R0).m89054h0(this.f108972O0[i18 - 1]);
                i18++;
            } else {
                C22126c0 c22126c0 = new C22126c0(context);
                this.f108973P0 = c22126c0;
                c22126c0.m115422R1();
                this.f108973P0.mo111965M1(1);
                this.f108973P0.mo111964L1(this.f108978U0 / 3.0f);
                this.f108973P0.m111962J1(C23212s8.m119607o(context, AbstractC16781w.RecentlyLikeCountTextColor));
                C16718f m89106L2 = this.f108973P0.m89106L();
                int i19 = this.f108978U0;
                m89106L2.m89028L(i19, i19).m89029M(15);
                this.f108973P0.m89087B0(AbstractC16803z.bg_count_recent_like_white_border_circle);
                m89001g1(this.f108973P0);
                return;
            }
        }
    }
}
