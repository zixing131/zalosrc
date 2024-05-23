package p142ey;

import com.zing.zalo.control.ContactProfile;
import java.util.Collection;
import java.util.List;

/* renamed from: ey.g */
/* loaded from: classes.dex */
public class C18637g extends C18635e {

    /* renamed from: r */
    public static int f93790r;

    /* renamed from: q */
    private boolean f93791q;

    public C18637g(List list) {
        super(list);
        this.f93791q = true;
    }

    @Override // p142ey.C18635e, java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        f93790r++;
        return super.addAll(collection);
    }

    @Override // p142ey.C18635e, java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        f93790r++;
        super.clear();
    }

    @Override // p142ey.C18635e, java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: e */
    public boolean add(ContactProfile contactProfile) {
        f93790r++;
        return super.add(contactProfile);
    }

    @Override // p142ey.C18635e, java.util.ArrayList, java.util.AbstractList, java.util.List
    /* renamed from: l */
    public ContactProfile remove(int i11) {
        f93790r++;
        return super.remove(i11);
    }

    @Override // p142ey.C18635e, java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        f93790r++;
        return super.remove(obj);
    }
}
