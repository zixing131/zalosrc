package p142ey;

import com.zing.zalo.control.ContactProfile;
import java.util.Collection;
import mm0.AbstractC23355j;

/* renamed from: ey.f */
/* loaded from: classes.dex */
public class C18636f extends C18635e {

    /* renamed from: q */
    private final C18635e f93789q;

    public C18636f(C18635e c18635e) {
        this.f93789q = c18635e;
    }

    @Override // p142ey.C18635e, java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        AbstractC23355j.m122794b(new UnsupportedOperationException("addAll"));
        return false;
    }

    @Override // p142ey.C18635e, java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        AbstractC23355j.m122794b(new UnsupportedOperationException("clear"));
    }

    @Override // p142ey.C18635e, java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: e */
    public boolean add(ContactProfile contactProfile) {
        AbstractC23355j.m122794b(new UnsupportedOperationException("add"));
        return false;
    }

    @Override // p142ey.C18635e
    /* renamed from: g */
    public boolean mo98490g(String str) {
        return this.f93789q.mo98490g(str);
    }

    @Override // p142ey.C18635e
    /* renamed from: j */
    public ContactProfile mo98491j(String str) {
        return this.f93789q.mo98491j(str);
    }

    @Override // p142ey.C18635e, java.util.ArrayList, java.util.AbstractList, java.util.List
    /* renamed from: l */
    public ContactProfile remove(int i11) {
        AbstractC23355j.m122794b(new UnsupportedOperationException("remove"));
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public ContactProfile get(int i11) {
        return (ContactProfile) this.f93789q.get(i11);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f93789q.size();
    }

    @Override // p142ey.C18635e, java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        AbstractC23355j.m122794b(new UnsupportedOperationException("remove"));
        return false;
    }
}
