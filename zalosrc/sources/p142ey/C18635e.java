package p142ey;

import android.text.TextUtils;
import com.zing.zalo.control.ContactProfile;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: ey.e */
/* loaded from: classes.dex */
public class C18635e extends ArrayList {

    /* renamed from: p */
    private final HashMap f93788p = new HashMap();

    public C18635e() {
    }

    /* renamed from: k */
    private boolean m98488k(Collection collection) {
        Iterator it = collection.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            ContactProfile contactProfile = (ContactProfile) it.next();
            if (contactProfile != null && !this.f93788p.containsKey(contactProfile.f42434r)) {
                this.f93788p.put(contactProfile.f42434r, contactProfile);
                z11 = super.add(contactProfile);
            }
        }
        return z11;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        return m98488k(collection);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f93788p.clear();
        super.clear();
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: e */
    public boolean add(ContactProfile contactProfile) {
        if (!this.f93788p.containsKey(contactProfile.f42434r)) {
            this.f93788p.put(contactProfile.f42434r, contactProfile);
            return super.add(contactProfile);
        }
        return false;
    }

    /* renamed from: g */
    public boolean mo98490g(String str) {
        return this.f93788p.containsKey(str);
    }

    /* renamed from: j */
    public ContactProfile mo98491j(String str) {
        return (ContactProfile) this.f93788p.get(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    /* renamed from: l */
    public ContactProfile remove(int i11) {
        this.f93788p.remove(((ContactProfile) get(i11)).f42434r);
        return (ContactProfile) super.remove(i11);
    }

    /* renamed from: m */
    public boolean m98493m(String str) {
        if (!TextUtils.isEmpty(str) && this.f93788p.containsKey(str)) {
            return super.remove((ContactProfile) this.f93788p.remove(str));
        }
        return false;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        if (obj instanceof ContactProfile) {
            this.f93788p.remove(((ContactProfile) obj).f42434r);
        }
        return super.remove(obj);
    }

    public C18635e(List list) {
        m98488k(list);
    }
}
