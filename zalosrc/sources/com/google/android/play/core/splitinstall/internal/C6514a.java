package com.google.android.play.core.splitinstall.internal;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: com.google.android.play.core.splitinstall.internal.a */
/* loaded from: classes3.dex */
public final class C6514a extends C6515b {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C6514a(Object obj, Field field, Class cls) {
        super(obj, field, Array.newInstance((Class<?>) cls, 0).getClass());
    }

    /* renamed from: f */
    private final Class m33387f() {
        return m33391b().getType().getComponentType();
    }

    /* renamed from: d */
    public final void m33388d(Collection collection) {
        int length;
        Object[] objArr = (Object[]) m33390a();
        if (objArr == null) {
            length = 0;
        } else {
            length = objArr.length;
        }
        Object[] objArr2 = (Object[]) Array.newInstance((Class<?>) m33387f(), collection.size() + length);
        if (objArr != null) {
            System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            objArr2[length] = it.next();
            length++;
        }
        m33392c(objArr2);
    }

    /* renamed from: e */
    public final void m33389e(Collection collection) {
        int length;
        Object[] objArr = (Object[]) m33390a();
        int i11 = 0;
        if (objArr == null) {
            length = 0;
        } else {
            length = objArr.length;
        }
        Object[] objArr2 = (Object[]) Array.newInstance((Class<?>) m33387f(), length + collection.size());
        if (objArr != null) {
            System.arraycopy(objArr, 0, objArr2, collection.size(), objArr.length);
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            objArr2[i11] = it.next();
            i11++;
        }
        m33392c(objArr2);
    }
}
