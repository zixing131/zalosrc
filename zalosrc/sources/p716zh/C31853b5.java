package p716zh;

import com.zing.zalo.control.ContactProfile;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: zh.b5 */
/* loaded from: classes.dex */
public class C31853b5 extends ArrayList {
    private static final long serialVersionUID = 2963755199959921000L;

    /* renamed from: p */
    private final HashMap f146275p = new HashMap();

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        Iterator it = collection.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            ContactProfile contactProfile = (ContactProfile) it.next();
            if (contactProfile != null && this.f146275p.put(contactProfile.f42434r, contactProfile) == null) {
                z11 = super.add(contactProfile);
            }
        }
        return z11;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f146275p.clear();
        super.clear();
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: e */
    public boolean add(ContactProfile contactProfile) {
        if (this.f146275p.put(contactProfile.f42434r, contactProfile) == null) {
            return super.add(contactProfile);
        }
        return false;
    }

    /* renamed from: g */
    public boolean m153137g(String str) {
        return this.f146275p.containsKey(str);
    }

    /* renamed from: j */
    public ContactProfile m153138j(String str) {
        return (ContactProfile) this.f146275p.get(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    /* renamed from: k */
    public ContactProfile remove(int i11) {
        this.f146275p.remove(((ContactProfile) get(i11)).f42434r);
        return (ContactProfile) super.remove(i11);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        if (obj instanceof ContactProfile) {
            this.f146275p.remove(((ContactProfile) obj).f42434r);
        }
        return super.remove(obj);
    }
}
