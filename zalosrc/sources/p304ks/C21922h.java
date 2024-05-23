package p304ks;

import am.AbstractC0924m0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p062db.C7960e;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.List;
import on0.AbstractC24341v;

/* renamed from: ks.h */
/* loaded from: classes.dex */
public final class C21922h implements InterfaceC21921g {

    /* renamed from: a */
    private final C7960e f107767a;

    public C21922h(C7960e c7960e) {
        AbstractC19074t.m100208f(c7960e, "dbHelper");
        this.f107767a = c7960e;
    }

    @Override // p304ks.InterfaceC21921g
    /* renamed from: a */
    public int mo114274a(List list) {
        AbstractC19074t.m100208f(list, "listUid");
        C21918d m42262S5 = this.f107767a.m42262S5();
        AbstractC19074t.m100207e(m42262S5, "getDatabaseFriendHelper(...)");
        String m114239m = C21918d.m114239m(m42262S5, false, 1, null);
        if (m114239m == null) {
            return 0;
        }
        return this.f107767a.m42262S5().m114244f(list, m114239m);
    }

    @Override // p304ks.InterfaceC21921g
    /* renamed from: b */
    public int mo114275b(String str, String str2) {
        AbstractC19074t.m100208f(str, "uid");
        AbstractC19074t.m100208f(str2, "phone");
        C21918d m42262S5 = this.f107767a.m42262S5();
        AbstractC19074t.m100207e(m42262S5, "getDatabaseFriendHelper(...)");
        String m114239m = C21918d.m114239m(m42262S5, false, 1, null);
        if (m114239m == null) {
            return 0;
        }
        return this.f107767a.m42262S5().m114243B(str, str2, m114239m);
    }

    @Override // p304ks.InterfaceC21921g
    /* renamed from: c */
    public void mo114276c() {
        this.f107767a.m42262S5().m114246h();
    }

    @Override // p304ks.InterfaceC21921g
    /* renamed from: d */
    public long mo114277d(List list, boolean z11, int i11, boolean z12) {
        boolean m127120J;
        AbstractC19074t.m100208f(list, "friendList");
        String m114249l = this.f107767a.m42262S5().m114249l(z12);
        if (m114249l != null) {
            long m114251p = this.f107767a.m42262S5().m114251p(list, z11, i11, z12, m114249l);
            C21923i.m114291c("insertUpdateZaloFriends: size=" + list.size() + ", isOverride=" + z11 + ", retCodeInsert=" + i11 + ", isFromHttpGet=" + z12 + ", table=" + m114249l);
            if (z12) {
                m127120J = AbstractC24341v.m127120J(m114249l, "contact_profile_friend_", false, 2, null);
                if (m127120J) {
                    if (!AbstractC0924m0.m3538W8()) {
                        AbstractC0924m0.m3931jf(true);
                        C21923i.m114291c("Done migrate DB when get list friend http");
                    }
                    C7960e.m41971c6().m42161J4();
                }
            }
            return m114251p;
        }
        return 0L;
    }

    @Override // p304ks.InterfaceC21921g
    /* renamed from: e */
    public long mo114278e(ContactProfile contactProfile) {
        AbstractC19074t.m100208f(contactProfile, "profileFriend");
        C21918d m42262S5 = this.f107767a.m42262S5();
        AbstractC19074t.m100207e(m42262S5, "getDatabaseFriendHelper(...)");
        String m114239m = C21918d.m114239m(m42262S5, false, 1, null);
        if (m114239m != null) {
            return this.f107767a.m42262S5().m114252q(contactProfile, m114239m);
        }
        return 0L;
    }

    @Override // p304ks.InterfaceC21921g
    /* renamed from: f */
    public ArrayList mo114279f() {
        ArrayList m114247i;
        C21918d m42262S5 = this.f107767a.m42262S5();
        AbstractC19074t.m100207e(m42262S5, "getDatabaseFriendHelper(...)");
        String m114239m = C21918d.m114239m(m42262S5, false, 1, null);
        if (m114239m == null || (m114247i = this.f107767a.m42262S5().m114247i(m114239m)) == null) {
            return new ArrayList();
        }
        return m114247i;
    }

    @Override // p304ks.InterfaceC21921g
    /* renamed from: g */
    public ContactProfile mo114280g(String str) {
        AbstractC19074t.m100208f(str, "uid");
        C21918d m42262S5 = this.f107767a.m42262S5();
        AbstractC19074t.m100207e(m42262S5, "getDatabaseFriendHelper(...)");
        String m114239m = C21918d.m114239m(m42262S5, false, 1, null);
        if (m114239m == null) {
            return null;
        }
        return this.f107767a.m42199M5(str, m114239m);
    }

    @Override // p304ks.InterfaceC21921g
    /* renamed from: h */
    public List mo114281h() {
        List m114250o;
        C21918d m42262S5 = this.f107767a.m42262S5();
        AbstractC19074t.m100207e(m42262S5, "getDatabaseFriendHelper(...)");
        String m114239m = C21918d.m114239m(m42262S5, false, 1, null);
        if (m114239m == null || (m114250o = this.f107767a.m42262S5().m114250o(m114239m)) == null) {
            return new ArrayList();
        }
        return m114250o;
    }

    @Override // p304ks.InterfaceC21921g
    /* renamed from: i */
    public int mo114282i(String str, int i11) {
        C21918d m42262S5 = this.f107767a.m42262S5();
        AbstractC19074t.m100207e(m42262S5, "getDatabaseFriendHelper(...)");
        String m114239m = C21918d.m114239m(m42262S5, false, 1, null);
        if (m114239m == null) {
            return 0;
        }
        return this.f107767a.m42335Zd(m114239m, str, i11);
    }

    @Override // p304ks.InterfaceC21921g
    /* renamed from: j */
    public long mo114283j(List list) {
        C21918d m42262S5 = this.f107767a.m42262S5();
        AbstractC19074t.m100207e(m42262S5, "getDatabaseFriendHelper(...)");
        String m114239m = C21918d.m114239m(m42262S5, false, 1, null);
        if (m114239m != null) {
            return this.f107767a.m42262S5().m114260z(list, m114239m);
        }
        return 0L;
    }

    @Override // p304ks.InterfaceC21921g
    /* renamed from: k */
    public int mo114284k(String str) {
        C21918d m42262S5 = this.f107767a.m42262S5();
        AbstractC19074t.m100207e(m42262S5, "getDatabaseFriendHelper(...)");
        String m114239m = C21918d.m114239m(m42262S5, false, 1, null);
        if (m114239m == null) {
            return 0;
        }
        return this.f107767a.m42262S5().m114259y(str, m114239m);
    }

    @Override // p304ks.InterfaceC21921g
    /* renamed from: l */
    public boolean mo114285l() {
        return this.f107767a.m42262S5().m114253r();
    }

    @Override // p304ks.InterfaceC21921g
    /* renamed from: m */
    public int mo114286m(String str, String str2) {
        C21918d m42262S5 = this.f107767a.m42262S5();
        AbstractC19074t.m100207e(m42262S5, "getDatabaseFriendHelper(...)");
        String m114239m = C21918d.m114239m(m42262S5, false, 1, null);
        if (m114239m == null) {
            return 0;
        }
        return this.f107767a.m42262S5().m114242A(str, str2, m114239m);
    }

    @Override // p304ks.InterfaceC21921g
    /* renamed from: n */
    public ContactProfile mo114287n(String str) {
        C21918d m42262S5 = this.f107767a.m42262S5();
        AbstractC19074t.m100207e(m42262S5, "getDatabaseFriendHelper(...)");
        String m114239m = C21918d.m114239m(m42262S5, false, 1, null);
        if (m114239m == null) {
            return null;
        }
        return this.f107767a.m42219O5(str, m114239m);
    }

    @Override // p304ks.InterfaceC21921g
    /* renamed from: o */
    public boolean mo114288o(String str) {
        C21918d m42262S5 = this.f107767a.m42262S5();
        AbstractC19074t.m100207e(m42262S5, "getDatabaseFriendHelper(...)");
        String m114239m = C21918d.m114239m(m42262S5, false, 1, null);
        if (m114239m == null) {
            return false;
        }
        return this.f107767a.m42262S5().m114254t(str, m114239m);
    }
}
