package p304ks;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p716zh.C31934gb;

/* renamed from: ks.b0 */
/* loaded from: classes4.dex */
public class C21915b0 extends ArrayList {

    /* renamed from: p */
    private final HashMap f107743p = new HashMap();

    public C21915b0() {
    }

    /* renamed from: k */
    private boolean m114204k(Collection collection) {
        Iterator it = collection.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            C31934gb c31934gb = (C31934gb) it.next();
            if (c31934gb != null && this.f107743p.put(c31934gb.f146729a, c31934gb) == null) {
                z11 = super.add(c31934gb);
            }
        }
        return z11;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        return m114204k(collection);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f107743p.clear();
        super.clear();
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public boolean add(C31934gb c31934gb) {
        if (this.f107743p.put(c31934gb.f146729a, c31934gb) == null) {
            return super.add(c31934gb);
        }
        return false;
    }

    /* renamed from: g */
    public boolean m114206g(String str) {
        return this.f107743p.containsKey(str);
    }

    /* renamed from: j */
    public C31934gb m114207j(String str) {
        return (C31934gb) this.f107743p.get(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public C31934gb remove(int i11) {
        this.f107743p.remove(((C31934gb) get(i11)).f146729a);
        return (C31934gb) super.remove(i11);
    }

    /* renamed from: m */
    public boolean m114209m(String str) {
        if (!TextUtils.isEmpty(str) && this.f107743p.containsKey(str)) {
            return super.remove((C31934gb) this.f107743p.remove(str));
        }
        return false;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        if (obj instanceof C31934gb) {
            this.f107743p.remove(((C31934gb) obj).f146729a);
        }
        return super.remove(obj);
    }

    public C21915b0(List list) {
        m114204k(list);
    }
}
