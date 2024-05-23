package p720zl;

import android.text.TextUtils;
import com.zing.zalo.control.InviteContactProfile;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: zl.a */
/* loaded from: classes3.dex */
public class C32223a {

    /* renamed from: a */
    private final HashSet f148623a = new HashSet();

    /* renamed from: b */
    private final ArrayList f148624b = new ArrayList();

    /* renamed from: a */
    public void m155387a(InviteContactProfile inviteContactProfile) {
        if (inviteContactProfile != null && !this.f148623a.contains(inviteContactProfile.f42434r)) {
            this.f148623a.add(inviteContactProfile.f42434r);
            this.f148624b.add(inviteContactProfile);
        }
    }

    /* renamed from: b */
    public void m155388b(ArrayList arrayList) {
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                m155387a((InviteContactProfile) it.next());
            }
        }
    }

    /* renamed from: c */
    public void m155389c() {
        this.f148623a.clear();
        this.f148624b.clear();
    }

    /* renamed from: d */
    public boolean m155390d(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return this.f148623a.contains(str);
    }

    /* renamed from: e */
    public boolean m155391e(InviteContactProfile inviteContactProfile) {
        if (inviteContactProfile == null) {
            return false;
        }
        return this.f148623a.contains(inviteContactProfile.f42434r);
    }

    /* renamed from: f */
    public ArrayList m155392f() {
        return this.f148624b;
    }

    /* renamed from: g */
    public InviteContactProfile m155393g(String str) {
        if (!m155390d(str)) {
            return null;
        }
        Iterator it = this.f148624b.iterator();
        while (it.hasNext()) {
            InviteContactProfile inviteContactProfile = (InviteContactProfile) it.next();
            if (inviteContactProfile != null && inviteContactProfile.f42434r.equals(str)) {
                return inviteContactProfile;
            }
        }
        return null;
    }

    /* renamed from: h */
    public HashSet m155394h() {
        return this.f148623a;
    }

    /* renamed from: i */
    public boolean m155395i() {
        return this.f148624b.isEmpty();
    }

    /* renamed from: j */
    public void m155396j(InviteContactProfile inviteContactProfile) {
        if (inviteContactProfile != null && this.f148623a.contains(inviteContactProfile.f42434r)) {
            this.f148623a.remove(inviteContactProfile.f42434r);
            this.f148624b.remove(inviteContactProfile);
        }
    }

    /* renamed from: k */
    public int m155397k() {
        return this.f148623a.size();
    }
}
