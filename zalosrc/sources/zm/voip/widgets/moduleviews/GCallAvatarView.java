package zm.voip.widgets.moduleviews;

import android.content.Context;
import android.text.TextUtils;
import au.C2343e;
import bp0.AbstractC3104p;
import com.androidquery.util.AbstractC3972e;
import com.androidquery.util.C3977j;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.uicontrol.C16640q2;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.ModulesView;
import com.zing.zalocore.CoreUtility;
import fp0.C19100a;
import gg0.AbstractC19444a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
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
import zm.voip.widgets.moduleviews.GCallAvatarView;

/* loaded from: classes7.dex */
public class GCallAvatarView extends ModulesView implements AbstractRunnableC28185s6.b {

    /* renamed from: K */
    private final C24003n f150162K;

    /* renamed from: L */
    private C3977j[] f150163L;

    /* renamed from: M */
    private C19100a[] f150164M;

    /* renamed from: N */
    private final int f150165N;

    /* renamed from: O */
    private int f150166O;

    /* renamed from: P */
    private int f150167P;

    /* renamed from: Q */
    private int f150168Q;

    /* renamed from: R */
    private final ArrayList f150169R;

    /* renamed from: S */
    private C23528a f150170S;

    /* renamed from: T */
    private int f150171T;

    /* renamed from: U */
    private int f150172U;

    /* renamed from: V */
    private final boolean f150173V;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zm.voip.widgets.moduleviews.GCallAvatarView$a */
    /* loaded from: classes7.dex */
    public class C32508a extends AbstractRunnableC28185s6 {

        /* renamed from: z */
        final /* synthetic */ List f150175z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C32508a(AbstractRunnableC28185s6.b bVar, List list, int i11, List list2) {
            super(bVar, list, i11);
            this.f150175z = list2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: h */
        public /* synthetic */ void m157443h(List list) {
            String str;
            String str2;
            try {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    int intValue = ((Integer) it.next()).intValue();
                    AbstractC3972e.m18783g0(GCallAvatarView.this.f150163L[intValue]);
                    String str3 = (String) GCallAvatarView.this.f150169R.get(intValue);
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
                    GCallAvatarView.this.m157440b0(i11, str4, str, str2, intValue);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // vg.AbstractRunnableC28185s6
        /* renamed from: c */
        public void mo61137c(ArrayList arrayList) {
            final List list = this.f150175z;
            AbstractC19444a.m101695c(new Runnable() { // from class: zm.voip.widgets.moduleviews.a
                @Override // java.lang.Runnable
                public final void run() {
                    GCallAvatarView.C32508a.this.m157443h(list);
                }
            });
        }
    }

    public GCallAvatarView(Context context) {
        super(context);
        this.f150162K = C23278z2.m120143n();
        this.f150165N = 3;
        this.f150169R = new ArrayList();
        this.f150172U = 0;
        this.f150173V = false;
        m157439a0(context, AbstractC3104p.m15656d());
    }

    /* renamed from: Y */
    private void m157438Y() {
        ContactProfile contactProfile;
        String str;
        String str2;
        String str3;
        int i11;
        int i12;
        for (int i13 = 0; i13 < this.f150163L.length; i13++) {
            try {
                this.f150164M[i13].mo44614b1(8);
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
        int min = Math.min(this.f150169R.size(), this.f150163L.length);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i14 = 0; i14 < min; i14++) {
            Object obj = this.f150169R.get(i14);
            this.f150164M[i14].mo44614b1(0);
            if (i14 == min - 1 && (i12 = this.f150172U) > 0) {
                this.f150164M[i14].m100332H1(AbstractC23184q2.m119455m(i12), true, this.f150171T);
            }
            AbstractC3972e.m18783g0(this.f150163L[i14]);
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
                    str3 = str4;
                    str = null;
                    str2 = null;
                } else {
                    if (C23302b.f113247a.m120523d(str4) && !CoreUtility.f89233i.equals(contactProfile.f42434r)) {
                        String m40418n0 = contactProfile.m40418n0();
                        str3 = str4;
                        str = contactProfile.f42434r;
                        str2 = m40418n0;
                        i11 = 3;
                    } else {
                        str3 = str4;
                        str = null;
                        str2 = null;
                        i11 = 2;
                    }
                    m157440b0(i11, str, str2, str3, i14);
                }
            } else {
                if (obj instanceof String) {
                    arrayList.add((String) obj);
                    arrayList2.add(Integer.valueOf(i14));
                }
                str = null;
                str2 = null;
                str3 = null;
            }
            i11 = 1;
            m157440b0(i11, str, str2, str3, i14);
        }
        if (min == 0) {
            this.f150164M[0].mo44614b1(0);
        }
        if (arrayList.size() > 0) {
            new C32508a(this, arrayList, 1058, arrayList2).m141750b();
        }
    }

    /* renamed from: a0 */
    private void m157439a0(Context context, int i11) {
        this.f150170S = new C23528a(context);
        this.f150166O = i11 / 3;
        this.f150168Q = AbstractC23222t7.f112554d;
        this.f150167P = AbstractC23136l9.m118641B(context, AbstractC16801x.white);
        this.f150163L = new C3977j[3];
        this.f150164M = new C19100a[3];
        this.f150171T = i11 + this.f150168Q;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            C3977j[] c3977jArr = this.f150163L;
            if (i13 >= c3977jArr.length) {
                break;
            }
            c3977jArr[i13] = new C3977j(context);
            i13++;
        }
        while (true) {
            C19100a[] c19100aArr = this.f150164M;
            if (i12 >= c19100aArr.length) {
                break;
            }
            c19100aArr[i12] = new C19100a(context);
            this.f150164M[i12].m111929z1(5);
            C16718f m89106L = this.f150164M[i12].m89106L();
            int i14 = this.f150171T;
            m89106L.m89028L(i14, i14);
            C19100a c19100a = this.f150164M[i12];
            c19100a.f95075W0 = this.f150167P;
            c19100a.f95076X0 = this.f150168Q;
            c19100a.mo111926w1(AbstractC16803z.default_avatar);
            this.f150164M[i12].m100331G1(0.05f);
            this.f150164M[i12].mo44614b1(8);
            mo69681L(this.f150164M[i12]);
            i12++;
        }
        int i15 = 1;
        while (true) {
            C19100a[] c19100aArr2 = this.f150164M;
            if (i15 < c19100aArr2.length) {
                c19100aArr2[i15].m89106L().m89034R(-this.f150166O).m89054h0(this.f150164M[i15 - 1]);
                i15++;
            } else {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b0 */
    public void m157440b0(int i11, String str, String str2, String str3, int i12) {
        if (i11 == 3 && str != null && str2 != null) {
            this.f150164M[i12].mo111925v1(C16640q2.m88404a().mo88412f(str2, C2343e.m12307a(str, false)));
        } else if (i11 == 2) {
            AbstractC23268y2.m120033g(this.f150170S, this.f150163L[i12], this.f150164M[i12], str3, this.f150162K, false);
        } else {
            this.f150164M[i12].mo111925v1(this.f150162K.f116261b);
        }
    }

    /* renamed from: c0 */
    public void m157441c0(List list, int i11) {
        this.f150169R.clear();
        this.f150169R.addAll(list);
        C3977j[] c3977jArr = this.f150163L;
        if (i11 <= c3977jArr.length) {
            this.f150172U = 0;
        } else {
            this.f150172U = Math.max((i11 - c3977jArr.length) + 1, 0);
        }
        m157438Y();
    }

    public void setStrokeColor(int i11) {
        this.f150167P = i11;
    }

    public void setStrokeWidth(int i11) {
        this.f150168Q = i11;
    }
}
