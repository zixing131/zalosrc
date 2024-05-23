package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class s73 extends t73 implements Map {
    @Override // java.util.Map
    public final void clear() {
        mo26254d().clear();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return mo26254d().containsKey(obj);
    }

    /* renamed from: d */
    protected abstract Map mo26254d();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public final int m26255e() {
        return x93.m27868a(entrySet());
    }

    @Override // java.util.Map
    public abstract Set entrySet();

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:12:?, code lost:            return false;     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0023, code lost:            if (r1.hasNext() == false) goto L18;     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002d, code lost:            if (r5.equals(r1.next()) == false) goto L20;     */
    /* JADX WARN: Code restructure failed: missing block: B:20:?, code lost:            return false;     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x000f, code lost:            if (r5 == null) goto L4;     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0015, code lost:            if (r1.hasNext() == false) goto L15;     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001b, code lost:            if (r1.next() != null) goto L17;     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:            return true;     */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m26256g(Object obj) {
        r83 r83Var = new r83(entrySet().iterator());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: h */
    public final boolean m26257h(Object obj) {
        return w83.m27580b(this, obj);
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return mo26254d().put(obj, obj2);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        mo26254d().putAll(map);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return mo26254d().remove(obj);
    }

    @Override // java.util.Map
    public int size() {
        return mo26254d().size();
    }

    @Override // java.util.Map
    public final Collection values() {
        return mo26254d().values();
    }
}
