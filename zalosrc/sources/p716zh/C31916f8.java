package p716zh;

import com.zing.zalo.control.InviteContactProfile;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: zh.f8 */
/* loaded from: classes3.dex */
public class C31916f8 extends ArrayList {
    private static final long serialVersionUID = -4334966582946796800L;

    /* renamed from: p */
    private final HashMap f146628p = new HashMap();

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        Iterator it = collection.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            InviteContactProfile inviteContactProfile = (InviteContactProfile) it.next();
            if (this.f146628p.put(inviteContactProfile.f42539c2, inviteContactProfile) == null) {
                z11 = super.add(inviteContactProfile);
            }
        }
        return z11;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f146628p.clear();
        super.clear();
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public boolean add(InviteContactProfile inviteContactProfile) {
        if (this.f146628p.put(inviteContactProfile.f42539c2, inviteContactProfile) == null) {
            return super.add(inviteContactProfile);
        }
        return false;
    }

    /* renamed from: g */
    public boolean m153376g(String str) {
        return this.f146628p.containsKey(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public InviteContactProfile remove(int i11) {
        this.f146628p.remove(((InviteContactProfile) get(i11)).f42539c2);
        return (InviteContactProfile) super.remove(i11);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        if (obj instanceof InviteContactProfile) {
            this.f146628p.remove(((InviteContactProfile) obj).f42539c2);
        }
        return super.remove(obj);
    }
}
