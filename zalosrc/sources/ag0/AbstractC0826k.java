package ag0;

import am.C0943w;
import android.util.Pair;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.p062db.C7959d;
import com.zing.zalo.p062db.C7960e;
import gw.C19637j;
import me0.AbstractC23184q2;
import org.json.JSONObject;
import p161fg.C18922m;
import p304ks.AbstractC21935u;
import p716zh.C31973j5;
import p716zh.C31986k3;
import p716zh.C32076q5;

/* renamed from: ag0.k */
/* loaded from: classes6.dex */
public abstract class AbstractC0826k {

    /* renamed from: a */
    protected int f2902a;

    /* renamed from: b */
    protected String f2903b;

    /* renamed from: c */
    protected TrackingSource f2904c;

    /* renamed from: ag0.k$a */
    /* loaded from: classes6.dex */
    public static class a extends AbstractC0826k {

        /* renamed from: d */
        int f2905d;

        public a(String str, int i11) {
            this.f2902a = 1;
            this.f2903b = str;
            this.f2905d = i11;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ag0.AbstractC0826k
        /* renamed from: a */
        public void mo2158a(Object obj) {
            String str;
            try {
                Pair m102835R = C19637j.f97466a.m102835R(new JSONObject(obj.toString()).getJSONObject("data"));
                C31973j5 c31973j5 = (C31973j5) m102835R.first;
                C0943w.m4462l().m4477n(c31973j5, (C32076q5) m102835R.second);
                if (c31973j5.m153793y() != null) {
                    str = c31973j5.m153793y();
                } else {
                    str = "";
                }
                C7959d.m41638d1().m41787g3(this.f2903b, str);
                AbstractC23184q2.m119439D(c31973j5.m153781r(), this.f2905d);
                C18922m.m99141t().m99151U("group_" + c31973j5.m153781r(), c31973j5.m153756e());
                if (c31973j5.m153750a0()) {
                    C31986k3 c31986k3 = C31986k3.f147083a;
                    if (c31986k3.m154114W1(true) && !c31986k3.m154108R1(c31973j5.m153730N())) {
                        c31986k3.m154151z0(c31973j5.m153730N());
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: ag0.k$b */
    /* loaded from: classes6.dex */
    public static class b extends AbstractC0826k {
        public b(String str, TrackingSource trackingSource) {
            this.f2902a = 0;
            this.f2903b = str;
            this.f2904c = trackingSource;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ag0.AbstractC0826k
        /* renamed from: a */
        public void mo2158a(Object obj) {
            ContactProfile contactProfile;
            if (obj != null) {
                try {
                    contactProfile = new ContactProfile((JSONObject) obj);
                } catch (Exception e11) {
                    e11.printStackTrace();
                    return;
                }
            } else {
                contactProfile = null;
            }
            if (contactProfile != null) {
                String str = contactProfile.f42434r;
                if (C7960e.m41971c6() != null && str.length() > 0 && !str.equalsIgnoreCase("null")) {
                    C7960e.m41971c6().m42221O7(contactProfile, AbstractC21935u.m114558y(str));
                }
                C7959d.m41638d1().m41766Y2(contactProfile.f42434r, contactProfile.f42446v, contactProfile.f42437s);
            }
        }
    }

    /* renamed from: ag0.k$c */
    /* loaded from: classes6.dex */
    public static class c extends AbstractC0826k {
        public c(String str, TrackingSource trackingSource) {
            this.f2902a = 0;
            this.f2903b = str;
            this.f2904c = trackingSource;
        }

        @Override // ag0.AbstractC0826k
        /* renamed from: a */
        public void mo2158a(Object obj) {
            ContactProfile contactProfile;
            if (obj != null) {
                try {
                    contactProfile = new ContactProfile((JSONObject) obj);
                } catch (Exception e11) {
                    e11.printStackTrace();
                    return;
                }
            } else {
                contactProfile = null;
            }
            if (contactProfile != null) {
                String str = contactProfile.f42434r;
                if (C7960e.m41971c6() != null && str.length() > 0 && !str.equalsIgnoreCase("null")) {
                    C7960e.m41971c6().m42221O7(contactProfile, AbstractC21935u.m114558y(str));
                }
            }
        }
    }

    /* renamed from: a */
    public abstract void mo2158a(Object obj);
}
