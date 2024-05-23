package p401or;

import am.AbstractC0924m0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.feed.models.PrivacyInfo;
import com.zing.zalo.social.controls.LikeContactItem;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;
import p304ks.AbstractC21935u;
import p304ks.C21927m;
import vg.C28203u6;

/* renamed from: or.g */
/* loaded from: classes4.dex */
public final class C24417g {

    /* renamed from: b */
    private static boolean f117908b;

    /* renamed from: c */
    private static boolean f117909c;

    /* renamed from: e */
    private static PrivacyInfo f117911e;

    /* renamed from: f */
    private static PrivacyInfo f117912f;

    /* renamed from: a */
    public static final C24417g f117907a = new C24417g();

    /* renamed from: d */
    private static int f117910d = -1;

    private C24417g() {
    }

    /* renamed from: c */
    private final void m127698c() {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        PrivacyInfo privacyInfo = f117911e;
        ArrayList arrayList4 = null;
        if (privacyInfo != null) {
            if (privacyInfo != null && (arrayList3 = privacyInfo.f45974q) != null) {
                arrayList2 = new ArrayList();
                for (Object obj : arrayList3) {
                    if (AbstractC21935u.m114558y(((LikeContactItem) obj).m56333d())) {
                        arrayList2.add(obj);
                    }
                }
            } else {
                arrayList2 = null;
            }
            privacyInfo.m45136H(arrayList2);
        }
        PrivacyInfo privacyInfo2 = f117912f;
        if (privacyInfo2 != null) {
            if (privacyInfo2 != null && (arrayList = privacyInfo2.f45974q) != null) {
                arrayList4 = new ArrayList();
                for (Object obj2 : arrayList) {
                    if (AbstractC21935u.m114558y(((LikeContactItem) obj2).m56333d())) {
                        arrayList4.add(obj2);
                    }
                }
            }
            privacyInfo2.m45136H(arrayList4);
        }
    }

    /* renamed from: j */
    private final synchronized void m127699j(int i11, ArrayList arrayList) {
        try {
            try {
                Iterator it = arrayList.iterator();
                boolean z11 = false;
                while (it.hasNext()) {
                    LikeContactItem likeContactItem = (LikeContactItem) it.next();
                    boolean m153137g = C21927m.m114302u().m114312J().m153137g(likeContactItem.m56333d());
                    boolean m114558y = AbstractC21935u.m114558y(likeContactItem.m56333d());
                    if (m153137g || !m114558y) {
                        arrayList.remove(likeContactItem);
                        z11 = true;
                    }
                }
                if (z11) {
                    m127706h(i11, arrayList);
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: a */
    public final void m127700a() {
        f117912f = null;
    }

    /* renamed from: b */
    public final void m127701b() {
        f117911e = null;
    }

    /* renamed from: d */
    public final boolean m127702d() {
        return f117908b;
    }

    /* renamed from: e */
    public final boolean m127703e() {
        return f117909c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0016, code lost:            if (r11 != false) goto L88;     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0014, code lost:            if (p401or.C24417g.f117912f == null) goto L88;     */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized PrivacyInfo m127704f(int i11, boolean z11) {
        PrivacyInfo privacyInfo;
        String m3012E4;
        PrivacyInfo privacyInfo2;
        try {
            if (i11 == 2) {
                try {
                    if (f117911e != null) {
                    }
                    if (i11 != 2) {
                        if (i11 == 3) {
                            f117912f = new PrivacyInfo(3);
                        }
                    } else {
                        f117911e = new PrivacyInfo(2);
                    }
                    if (i11 != 2) {
                        if (i11 != 3) {
                            m3012E4 = "";
                        } else {
                            m3012E4 = AbstractC0924m0.m2983D4();
                        }
                    } else {
                        m3012E4 = AbstractC0924m0.m3012E4();
                    }
                    AbstractC19074t.m100205c(m3012E4);
                    if (m3012E4.length() > 0) {
                        ArrayList m45122C = PrivacyInfo.m45122C(new JSONArray(m3012E4));
                        ArrayList arrayList = new ArrayList();
                        Iterator it = m45122C.iterator();
                        while (it.hasNext()) {
                            LikeContactItem likeContactItem = (LikeContactItem) it.next();
                            if (AbstractC21935u.m114558y(likeContactItem.m56333d())) {
                                if (z11) {
                                    ContactProfile m141798e = C28203u6.m141798e(C28203u6.f131407a, likeContactItem.m56333d(), null, 2, null);
                                    if (m141798e != null) {
                                        arrayList.add(new LikeContactItem(m141798e.f42434r, m141798e.m40383Q(true, false), m141798e.f42446v));
                                    }
                                } else {
                                    arrayList.add(likeContactItem);
                                }
                            }
                        }
                        m127699j(i11, arrayList);
                        if (z11) {
                            m127706h(i11, arrayList);
                        }
                        if (i11 != 2) {
                            if (i11 == 3 && (privacyInfo2 = f117912f) != null) {
                                privacyInfo2.m45136H(arrayList);
                            }
                        } else {
                            PrivacyInfo privacyInfo3 = f117911e;
                            if (privacyInfo3 != null) {
                                privacyInfo3.m45136H(arrayList);
                            }
                        }
                    }
                } catch (Exception e11) {
                    AbstractC20110a.f98889a.mo104552e(e11);
                }
                m127698c();
                if (i11 == 2) {
                    privacyInfo = f117911e;
                } else {
                    privacyInfo = f117912f;
                }
            }
            if (i11 == 3) {
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return privacyInfo;
    }

    /* renamed from: g */
    public final int m127705g(boolean z11) {
        if (f117910d == -1 || z11) {
            f117910d = AbstractC0924m0.m3502V1();
        }
        return f117910d;
    }

    /* renamed from: h */
    public final void m127706h(int i11, ArrayList arrayList) {
        AbstractC19074t.m100208f(arrayList, "friendList");
        try {
            if (!arrayList.isEmpty()) {
                JSONArray m45132d = PrivacyInfo.m45132d(arrayList);
                if (i11 != 2) {
                    if (i11 == 3) {
                        PrivacyInfo privacyInfo = f117912f;
                        if (privacyInfo != null) {
                            privacyInfo.m45136H(arrayList);
                        }
                        AbstractC0924m0.m4088om(m45132d.toString());
                        return;
                    }
                    return;
                }
                PrivacyInfo privacyInfo2 = f117911e;
                if (privacyInfo2 != null) {
                    privacyInfo2.m45136H(arrayList);
                }
                AbstractC0924m0.m4118pm(m45132d.toString());
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: i */
    public final void m127707i(int i11, boolean z11) {
        f117910d = i11;
        if (z11) {
            AbstractC0924m0.m3490Ui(i11);
        }
    }

    /* renamed from: k */
    public final void m127708k(JSONObject jSONObject, boolean z11) {
        boolean z12;
        AbstractC19074t.m100208f(jSONObject, "json");
        boolean z13 = false;
        if (jSONObject.optInt("enable", 0) == 1) {
            z12 = true;
        } else {
            z12 = false;
        }
        f117908b = z12;
        if (jSONObject.optInt("save_last_posted_privacy", 0) == 1) {
            z13 = true;
        }
        f117909c = z13;
        if (z11) {
            AbstractC0924m0.m3061Fo(jSONObject.toString());
        }
    }
}
