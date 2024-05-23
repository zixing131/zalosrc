package ep0;

import android.text.TextUtils;
import com.zing.zalo.control.ContactProfile;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: ep0.q */
/* loaded from: classes7.dex */
public class C18557q {

    /* renamed from: a */
    private final HashSet f93271a = new HashSet();

    /* renamed from: b */
    private final ArrayList f93272b = new ArrayList();

    /* renamed from: i */
    private void m97960i(String str) {
        Iterator it = this.f93272b.iterator();
        while (it.hasNext()) {
            ContactProfile contactProfile = (ContactProfile) it.next();
            if (TextUtils.equals(str, contactProfile.mo2478b())) {
                this.f93272b.remove(contactProfile);
                return;
            }
        }
    }

    /* renamed from: a */
    public void m97961a(ContactProfile contactProfile) {
        if (contactProfile != null && !this.f93271a.contains(contactProfile.f42434r)) {
            this.f93271a.add(contactProfile.f42434r);
            this.f93272b.add(contactProfile);
        }
    }

    /* renamed from: b */
    public void m97962b() {
        this.f93271a.clear();
        this.f93272b.clear();
    }

    /* renamed from: c */
    public boolean m97963c(ContactProfile contactProfile) {
        if (contactProfile == null) {
            return false;
        }
        return this.f93271a.contains(contactProfile.f42434r);
    }

    /* renamed from: d */
    public ArrayList m97964d() {
        return new ArrayList(this.f93272b);
    }

    /* renamed from: e */
    public HashSet m97965e() {
        return this.f93271a;
    }

    /* renamed from: f */
    public boolean m97966f() {
        return this.f93272b.isEmpty();
    }

    /* renamed from: g */
    public void m97967g(ContactProfile contactProfile) {
        if (contactProfile != null && this.f93271a.contains(contactProfile.f42434r)) {
            this.f93271a.remove(contactProfile.f42434r);
            this.f93272b.remove(contactProfile);
        }
    }

    /* renamed from: h */
    public void m97968h(String str) {
        if (!TextUtils.isEmpty(str) && this.f93271a.contains(str)) {
            this.f93271a.remove(str);
            m97960i(str);
        }
    }

    /* renamed from: j */
    public int m97969j() {
        return this.f93272b.size();
    }
}
