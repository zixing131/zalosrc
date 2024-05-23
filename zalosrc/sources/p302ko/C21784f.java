package p302ko;

import bo.C3000l0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p062db.C7960e;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
import p348mi.AbstractC23309i;
import tr.C26878b;

/* renamed from: ko.f */
/* loaded from: classes4.dex */
public final class C21784f implements InterfaceC21783e {
    @Override // p302ko.InterfaceC21783e
    /* renamed from: A */
    public String mo112386A() {
        String m121046Id = AbstractC23309i.m121046Id();
        AbstractC19074t.m100207e(m121046Id, "getUpdateNewProfileStatus(...)");
        return m121046Id;
    }

    @Override // p302ko.InterfaceC21783e
    /* renamed from: E */
    public void mo112387E(String str, boolean z11) {
        AbstractC19074t.m100208f(str, "uid");
        C7960e.m41971c6().m42136Gd(str, z11);
    }

    @Override // p302ko.InterfaceC21783e
    /* renamed from: G */
    public void mo112388G(ContactProfile contactProfile) {
        AbstractC19074t.m100208f(contactProfile, "contactprofile");
        C7960e.m41971c6().m42248Qd(contactProfile);
    }

    @Override // p302ko.InterfaceC21783e
    /* renamed from: H */
    public void mo112389H(String str, String str2, String str3) {
        AbstractC19074t.m100208f(str, "uid");
        AbstractC19074t.m100208f(str2, "fid");
        AbstractC19074t.m100208f(str3, "content");
        C7960e.m41971c6().m42395fe(str, str2, str3);
    }

    @Override // p302ko.InterfaceC21783e
    /* renamed from: K */
    public void mo112390K(JSONObject jSONObject) {
        AbstractC19074t.m100208f(jSONObject, "json");
        AbstractC23309i.m122037iz(jSONObject.toString());
    }

    @Override // p302ko.InterfaceC21783e
    /* renamed from: L */
    public void mo112391L(String str, int i11) {
        AbstractC19074t.m100208f(str, "userID");
        C7960e.m41971c6().m42078Bd(str, i11);
    }

    @Override // p302ko.InterfaceC21783e
    /* renamed from: M */
    public void mo112392M(JSONObject jSONObject) {
        AbstractC19074t.m100208f(jSONObject, "json");
        AbstractC23309i.m121962gz(jSONObject.toString());
    }

    @Override // p302ko.InterfaceC21783e
    /* renamed from: N */
    public void mo112393N(String str) {
        AbstractC19074t.m100208f(str, "extendProfileString");
        AbstractC23309i.m122097kj(str);
    }

    @Override // p302ko.InterfaceC21783e
    /* renamed from: P */
    public void mo112394P(int i11) {
        AbstractC23309i.m121105Jz(i11);
    }

    @Override // p302ko.InterfaceC21783e
    /* renamed from: Q */
    public void mo112395Q(String str, int i11) {
        AbstractC19074t.m100208f(str, "uid");
        C7960e.m41971c6().m42609zd(str, i11);
    }

    @Override // p302ko.InterfaceC21783e
    /* renamed from: R */
    public int mo112396R() {
        return AbstractC23309i.m122496v8();
    }

    @Override // p302ko.InterfaceC21783e
    /* renamed from: S */
    public void mo112397S(String str, int i11) {
        AbstractC19074t.m100208f(str, "uid");
        C7960e.m41971c6().m42278Tc(str, i11);
    }

    @Override // p302ko.InterfaceC21783e
    /* renamed from: T */
    public boolean mo112398T() {
        return AbstractC23309i.m120788Be();
    }

    @Override // p302ko.InterfaceC21783e
    /* renamed from: U */
    public void mo112399U(ContactProfile contactProfile) {
        AbstractC19074t.m100208f(contactProfile, "friend");
        C7960e.m41971c6().m42349b8(contactProfile);
    }

    @Override // p302ko.InterfaceC21783e
    /* renamed from: V */
    public void mo112400V(String str, String str2, String str3, String str4) {
        AbstractC19074t.m100208f(str, "cUid");
        AbstractC19074t.m100208f(str2, "id");
        AbstractC19074t.m100208f(str3, "content");
        AbstractC19074t.m100208f(str4, "feedComment");
        C7960e.m41971c6().m42523r9(str, str2, str3, str4);
    }

    @Override // p302ko.InterfaceC21783e
    /* renamed from: W */
    public void mo112401W(ContactProfile contactProfile, boolean z11) {
        AbstractC19074t.m100208f(contactProfile, "friend");
        C7960e.m41971c6().m42131G7(contactProfile, z11);
    }

    @Override // p302ko.InterfaceC21783e
    /* renamed from: a */
    public boolean mo112402a() {
        return AbstractC23309i.m122305q2();
    }

    @Override // p302ko.InterfaceC21783e
    /* renamed from: b */
    public void mo112403b(String str) {
        AbstractC19074t.m100208f(str, "uid");
        C7960e.m41971c6().m42234Pb(str);
    }

    @Override // p302ko.InterfaceC21783e
    /* renamed from: c */
    public void mo112404c(String str) {
        AbstractC19074t.m100208f(str, "uidFriend");
        C7960e.m41971c6().m42413h8(str);
    }

    @Override // p302ko.InterfaceC21783e
    /* renamed from: c0 */
    public void mo112405c0(String str) {
        AbstractC19074t.m100208f(str, "userID");
        C7960e.m41971c6().m42343ac(str);
    }

    @Override // p302ko.InterfaceC21783e
    /* renamed from: d */
    public void mo112406d(String str) {
        AbstractC19074t.m100208f(str, "uinfo");
        AbstractC23309i.m121068Iz(str);
    }

    @Override // p302ko.InterfaceC21783e
    /* renamed from: h */
    public boolean mo112407h(String str) {
        AbstractC19074t.m100208f(str, "uid");
        return C7960e.m41971c6().m42096D9(str);
    }

    @Override // p302ko.InterfaceC21783e
    /* renamed from: h0 */
    public String mo112408h0() {
        String m121120Kd = AbstractC23309i.m121120Kd();
        AbstractC19074t.m100207e(m121120Kd, "getUpdateProfileStatus(...)");
        return m121120Kd;
    }

    @Override // p302ko.InterfaceC21783e
    /* renamed from: i */
    public String mo112409i() {
        String m121700a1 = AbstractC23309i.m121700a1();
        AbstractC19074t.m100207e(m121700a1, "getCurrentUserExtendProfile(...)");
        return m121700a1;
    }

    @Override // p302ko.InterfaceC21783e
    /* renamed from: j */
    public C3000l0 mo112410j(String str) {
        AbstractC19074t.m100208f(str, "feedId");
        return C26878b.f127183a.m138451c(str);
    }

    @Override // p302ko.InterfaceC21783e
    /* renamed from: j0 */
    public void mo112411j0(String str) {
        AbstractC19074t.m100208f(str, "uidFriend");
        C7960e.m41971c6().m42415hc(str);
    }

    @Override // p302ko.InterfaceC21783e
    /* renamed from: k0 */
    public void mo112412k0(String str, String str2, String str3) {
        AbstractC19074t.m100208f(str, "cUid");
        AbstractC19074t.m100208f(str2, "id");
        AbstractC19074t.m100208f(str3, "content");
        C7960e.m41971c6().m42438je(str, str2, str3);
    }

    @Override // p302ko.InterfaceC21783e
    /* renamed from: l0 */
    public boolean mo112413l0() {
        return AbstractC23309i.m122155m2();
    }

    @Override // p302ko.InterfaceC21783e
    /* renamed from: n */
    public boolean mo112414n() {
        return AbstractC23309i.m121815d3();
    }

    @Override // p302ko.InterfaceC21783e
    /* renamed from: n0 */
    public boolean mo112415n0() {
        return AbstractC23309i.m121566Wf();
    }

    @Override // p302ko.InterfaceC21783e
    /* renamed from: o */
    public List mo112416o(String str) {
        AbstractC19074t.m100208f(str, "currentUid");
        ArrayList m42412h7 = C7960e.m41971c6().m42412h7(str);
        AbstractC19074t.m100207e(m42412h7, "getUserFeedList(...)");
        return m42412h7;
    }

    @Override // p302ko.InterfaceC21783e
    /* renamed from: p0 */
    public void mo112417p0(String str) {
        AbstractC19074t.m100208f(str, "uid");
        C7960e.m41971c6().m42376e4(str);
    }

    @Override // p302ko.InterfaceC21783e
    /* renamed from: q */
    public boolean mo112418q() {
        if (AbstractC23309i.m122342r2() == 1) {
            return true;
        }
        return false;
    }

    @Override // p302ko.InterfaceC21783e
    /* renamed from: r0 */
    public int mo112419r0() {
        return AbstractC23309i.m121115K8();
    }

    @Override // p302ko.InterfaceC21783e
    /* renamed from: u0 */
    public boolean mo112420u0() {
        return AbstractC23309i.m120825Ce();
    }

    @Override // p302ko.InterfaceC21783e
    /* renamed from: v */
    public String mo112421v() {
        String m121675Zd = AbstractC23309i.m121675Zd();
        AbstractC19074t.m100207e(m121675Zd, "getUserInfo(...)");
        return m121675Zd;
    }

    @Override // p302ko.InterfaceC21783e
    /* renamed from: v0 */
    public void mo112422v0(String str, String str2) {
        AbstractC19074t.m100208f(str, "currentUserId");
        AbstractC19074t.m100208f(str2, "feedId");
        C7960e.m41971c6().m42128G4(str, str2);
    }

    @Override // p302ko.InterfaceC21783e
    /* renamed from: x0 */
    public void mo112423x0(ContactProfile contactProfile, boolean z11) {
        AbstractC19074t.m100208f(contactProfile, "profile");
        C7960e.m41971c6().m42221O7(contactProfile, z11);
    }

    @Override // p302ko.InterfaceC21783e
    /* renamed from: y */
    public void mo112424y(String str) {
        AbstractC19074t.m100208f(str, "currentUserId");
        C7960e.m41971c6().m42568w3(str);
    }

    @Override // p302ko.InterfaceC21783e
    /* renamed from: y0 */
    public int mo112425y0() {
        return AbstractC23309i.m121070J0(MainApplication.Companion.m35500c());
    }

    @Override // p302ko.InterfaceC21783e
    /* renamed from: z0 */
    public boolean mo112426z0() {
        return AbstractC23309i.m121344Qf();
    }
}
