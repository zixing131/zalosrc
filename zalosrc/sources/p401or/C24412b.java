package p401or;

import ag0.C0815e1;
import android.text.TextUtils;
import androidx.lifecycle.C1761c0;
import androidx.lifecycle.LiveData;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.InviteContactProfile;
import com.zing.zalo.feed.models.PrivacyInfo;
import com.zing.zalo.feed.mvp.storyprivacy.C8806b;
import com.zing.zalo.social.controls.LikeContactItem;
import fn0.AbstractC19074t;
import ge0.C19431d;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me0.AbstractC23136l9;
import org.json.JSONObject;
import p205hc.AbstractC19963b;
import p205hc.C19964c;
import p361nb.C23648e;
import p458qr.C25470c;
import pm0.C24848g0;

/* renamed from: or.b */
/* loaded from: classes4.dex */
public final class C24412b extends AbstractC19963b {

    /* renamed from: A */
    private List f117890A;

    /* renamed from: B */
    private PrivacyInfo f117891B;

    /* renamed from: C */
    private PrivacyInfo f117892C;

    /* renamed from: t */
    private final C1761c0 f117893t = new C1761c0();

    /* renamed from: u */
    private final C1761c0 f117894u = new C1761c0();

    /* renamed from: v */
    private final C1761c0 f117895v = new C1761c0();

    /* renamed from: w */
    private final C1761c0 f117896w = new C1761c0();

    /* renamed from: x */
    private final C1761c0 f117897x = new C1761c0();

    /* renamed from: y */
    private PrivacyInfo f117898y = new PrivacyInfo();

    /* renamed from: z */
    private PrivacyInfo f117899z = new PrivacyInfo();

    /* renamed from: V */
    private final int m127675V(PrivacyInfo privacyInfo) {
        int i11 = privacyInfo.f45973p;
        if (i11 != 2) {
            if (i11 == 3) {
                return 2;
            }
            return 0;
        }
        return 1;
    }

    /* renamed from: a0 */
    private final void m127676a0() {
        JSONObject jSONObject;
        int m127675V = m127675V(this.f117898y);
        int m127675V2 = m127675V(this.f117899z);
        String str = null;
        if (m127675V != m127675V2) {
            jSONObject = new JSONObject();
            jSONObject.put("before", m127675V);
            jSONObject.put("after", m127675V2);
        } else {
            jSONObject = null;
        }
        String[] strArr = new String[1];
        if (jSONObject != null) {
            str = jSONObject.toString();
        }
        strArr[0] = str;
        C0815e1.m2075D().m2100V(new C23648e(38, "option_bottom_sheet", 0, "story_setting_option_save", strArr), false);
    }

    /* renamed from: g0 */
    private final void m127677g0(ArrayList arrayList) {
        this.f117896w.mo9224q(new C19964c(arrayList));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("tt", arrayList.size());
        C0815e1.m2075D().m2100V(new C23648e(38, "choose_friend_list", 1, "story_setting_friends_except", jSONObject.toString()), false);
    }

    /* renamed from: h0 */
    private final void m127678h0(ArrayList arrayList) {
        this.f117895v.mo9224q(new C19964c(arrayList));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("tt", arrayList.size());
        C0815e1.m2075D().m2100V(new C23648e(38, "choose_friend_list", 1, "story_setting_specific_friends", jSONObject.toString()), false);
    }

    /* renamed from: O */
    public final void m127679O() {
        m127684T(this.f117898y);
    }

    /* renamed from: P */
    public final LiveData m127680P() {
        return this.f117896w;
    }

    /* renamed from: Q */
    public final LiveData m127681Q() {
        return this.f117895v;
    }

    /* renamed from: R */
    public final LiveData m127682R() {
        return this.f117894u;
    }

    /* renamed from: S */
    public final LiveData m127683S() {
        return this.f117897x;
    }

    /* renamed from: T */
    public final void m127684T(PrivacyInfo privacyInfo) {
        boolean z11;
        boolean z12;
        boolean z13;
        PrivacyInfo privacyInfo2;
        PrivacyInfo privacyInfo3;
        PrivacyInfo privacyInfo4;
        AbstractC19074t.m100208f(privacyInfo, "selectedPrivacy");
        List<C24411a> list = this.f117890A;
        if (list == null) {
            int i11 = privacyInfo.f45973p;
            if (i11 == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (i11 == 2) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (i11 == 3) {
                z13 = true;
            } else {
                z13 = false;
            }
            PrivacyInfo privacyInfo5 = new PrivacyInfo(0);
            PrivacyInfo privacyInfo6 = this.f117891B;
            if (privacyInfo6 == null) {
                privacyInfo6 = C24417g.f117907a.m127704f(2, false);
            }
            PrivacyInfo privacyInfo7 = this.f117892C;
            if (privacyInfo7 == null) {
                privacyInfo7 = C24417g.f117907a.m127704f(3, false);
            }
            PrivacyInfo privacyInfo8 = privacyInfo7;
            ArrayList arrayList = new ArrayList();
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_story_privacy_header_info);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            arrayList.add(new C24411a(1, null, m118743r0, false, false, false, 58, null));
            if (z11) {
                privacyInfo2 = privacyInfo;
            } else {
                privacyInfo2 = privacyInfo5;
            }
            PrivacyInfo privacyInfo9 = privacyInfo6;
            arrayList.add(new C24411a(2, privacyInfo2, null, z11, false, true, 20, null));
            if (z12) {
                privacyInfo3 = privacyInfo;
            } else {
                privacyInfo3 = privacyInfo9;
            }
            arrayList.add(new C24411a(2, privacyInfo3, null, z12, true, true, 4, null));
            if (z13) {
                privacyInfo4 = privacyInfo;
            } else {
                privacyInfo4 = privacyInfo8;
            }
            arrayList.add(new C24411a(2, privacyInfo4, null, z13, true, false, 4, null));
            this.f117890A = arrayList;
        } else if (list != null) {
            for (C24411a c24411a : list) {
                PrivacyInfo m127668a = c24411a.m127668a();
                if (m127668a != null && m127668a.f45973p == privacyInfo.f45973p) {
                    c24411a.m127674g(new PrivacyInfo(privacyInfo));
                    c24411a.m127673f(true);
                } else {
                    c24411a.m127673f(false);
                }
            }
        }
        this.f117893t.mo9224q(this.f117890A);
    }

    /* renamed from: U */
    public final LiveData m127685U() {
        return this.f117893t;
    }

    /* renamed from: W */
    public final void m127686W(int i11, ArrayList arrayList) {
        try {
            ArrayList arrayList2 = new ArrayList();
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    InviteContactProfile inviteContactProfile = (InviteContactProfile) it.next();
                    if (!TextUtils.isEmpty(inviteContactProfile.f42434r)) {
                        arrayList2.add(new LikeContactItem(inviteContactProfile.f42434r, inviteContactProfile.m40383Q(true, false), inviteContactProfile.f42446v));
                    }
                }
            }
            PrivacyInfo privacyInfo = this.f117899z;
            privacyInfo.f45973p = i11;
            privacyInfo.m45136H(arrayList2);
            m127684T(this.f117899z);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: X */
    public final void m127687X(PrivacyInfo privacyInfo) {
        AbstractC19074t.m100208f(privacyInfo, "privacyInfo");
        int i11 = privacyInfo.f45973p;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 == 3) {
                    List m45138e = privacyInfo.m45138e();
                    AbstractC19074t.m100206d(m45138e, "null cannot be cast to non-null type java.util.ArrayList<com.zing.zalo.control.InviteContactProfile>{ kotlin.collections.TypeAliasesKt.ArrayList<com.zing.zalo.control.InviteContactProfile> }");
                    ArrayList arrayList = (ArrayList) m45138e;
                    if (privacyInfo.f45973p == this.f117899z.f45973p) {
                        m127677g0(arrayList);
                        return;
                    } else if (arrayList.isEmpty()) {
                        m127677g0(arrayList);
                        return;
                    } else {
                        m127686W(3, arrayList);
                        return;
                    }
                }
                return;
            }
            List m45138e2 = privacyInfo.m45138e();
            AbstractC19074t.m100206d(m45138e2, "null cannot be cast to non-null type java.util.ArrayList<com.zing.zalo.control.InviteContactProfile>{ kotlin.collections.TypeAliasesKt.ArrayList<com.zing.zalo.control.InviteContactProfile> }");
            ArrayList arrayList2 = (ArrayList) m45138e2;
            if (privacyInfo.f45973p == this.f117899z.f45973p) {
                m127678h0(arrayList2);
                return;
            } else if (arrayList2.isEmpty()) {
                m127678h0(arrayList2);
                return;
            } else {
                m127686W(2, arrayList2);
                return;
            }
        }
        this.f117894u.mo9224q(new C19964c(C24848g0.f119245a));
    }

    /* renamed from: Y */
    public final void m127688Y(boolean z11) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("changed", z11 ? 1 : 0);
        C0815e1.m2075D().m2100V(new C23648e(38, "choose_friend_list", 0, "story_setting_friends_except_save", jSONObject.toString()), false);
    }

    /* renamed from: Z */
    public final void m127689Z(boolean z11) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("changed", z11 ? 1 : 0);
        C0815e1.m2075D().m2100V(new C23648e(38, "choose_friend_list", 0, "story_setting_specific_friends_save", jSONObject.toString()), false);
    }

    /* renamed from: b0 */
    public final void m127690b0(C25470c c25470c) {
        AbstractC19074t.m100208f(c25470c, "dataRetain");
        try {
            this.f117891B = (PrivacyInfo) c25470c.m131941d("savedSelectFriendPrivacy");
            this.f117892C = (PrivacyInfo) c25470c.m131941d("savedExceptFriendPrivacy");
            PrivacyInfo privacyInfo = (PrivacyInfo) c25470c.m131941d("currentSelectedPrivacy");
            if (privacyInfo != null) {
                this.f117899z = privacyInfo;
                m127684T(new PrivacyInfo(this.f117899z));
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: c0 */
    public final void m127691c0() {
        if (AbstractC19074t.m100204b(new C19431d().m101509a(new C19431d.a(this.f117898y, this.f117899z)), Boolean.TRUE)) {
            C24417g c24417g = C24417g.f117907a;
            c24417g.m127707i(this.f117899z.f45973p, true);
            PrivacyInfo privacyInfo = this.f117899z;
            int i11 = privacyInfo.f45973p;
            ArrayList arrayList = privacyInfo.f45974q;
            AbstractC19074t.m100207e(arrayList, "friendInfoList");
            c24417g.m127706h(i11, arrayList);
            this.f117897x.mo9224q(new C19964c(this.f117899z));
            m127676a0();
        }
    }

    /* renamed from: e0 */
    public final C25470c m127692e0() {
        C25470c c25470c = new C25470c();
        c25470c.m131947j("currentSelectedPrivacy", this.f117899z);
        List<C24411a> list = this.f117890A;
        if (list != null) {
            for (C24411a c24411a : list) {
                PrivacyInfo m127668a = c24411a.m127668a();
                if (m127668a != null && m127668a.f45973p == 2) {
                    c25470c.m131947j("savedSelectFriendPrivacy", new PrivacyInfo(c24411a.m127668a()));
                } else {
                    PrivacyInfo m127668a2 = c24411a.m127668a();
                    if (m127668a2 != null && m127668a2.f45973p == 3) {
                        c25470c.m131947j("savedExceptFriendPrivacy", new PrivacyInfo(c24411a.m127668a()));
                    }
                }
            }
        }
        return c25470c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x002b, code lost:            if ((!r3.isEmpty()) == true) goto L15;     */
    /* renamed from: f0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m127693f0(C8806b c8806b) {
        ArrayList arrayList;
        super.m103748N(c8806b);
        if (c8806b != null) {
            C24417g c24417g = C24417g.f117907a;
            int m127705g = c24417g.m127705g(false);
            PrivacyInfo privacyInfo = new PrivacyInfo(m127705g);
            if (m127705g == 2 || m127705g == 3) {
                PrivacyInfo m127704f = c24417g.m127704f(m127705g, false);
                if (m127704f != null && (arrayList = m127704f.f45974q) != null) {
                    AbstractC19074t.m100205c(arrayList);
                }
                m127704f = new PrivacyInfo(0);
                privacyInfo = m127704f;
            }
            if (!c24417g.m127703e()) {
                privacyInfo = new PrivacyInfo(0);
            }
            PrivacyInfo m47063b = c8806b.m47063b();
            if (m47063b != null) {
                privacyInfo = m47063b;
            }
            this.f117898y = new PrivacyInfo(privacyInfo);
            this.f117899z = new PrivacyInfo(this.f117898y);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("before", m127675V(this.f117898y));
            C0815e1.m2075D().m2100V(new C23648e(38, c8806b.m47062a(), 0, "story_setting_open", jSONObject.toString()), false);
        }
    }
}
