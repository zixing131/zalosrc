package com.google.android.gms.dynamic;

import android.os.IBinder;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.dynamic.InterfaceC4271b;
import java.lang.reflect.Field;

/* renamed from: com.google.android.gms.dynamic.d */
/* loaded from: classes.dex */
public final class BinderC4273d extends InterfaceC4271b.a {

    /* renamed from: p */
    private final Object f16807p;

    private BinderC4273d(Object obj) {
        this.f16807p = obj;
    }

    /* renamed from: I3 */
    public static InterfaceC4271b m19913I3(Object obj) {
        return new BinderC4273d(obj);
    }

    /* renamed from: Q */
    public static Object m19914Q(InterfaceC4271b interfaceC4271b) {
        if (interfaceC4271b instanceof BinderC4273d) {
            return ((BinderC4273d) interfaceC4271b).f16807p;
        }
        IBinder asBinder = interfaceC4271b.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i11 = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i11++;
                field = field2;
            }
        }
        if (i11 == 1) {
            AbstractC4205o.m19722k(field);
            if (!field.isAccessible()) {
                field.setAccessible(true);
                try {
                    return field.get(asBinder);
                } catch (IllegalAccessException e11) {
                    throw new IllegalArgumentException("Could not access the field in remoteBinder.", e11);
                } catch (NullPointerException e12) {
                    throw new IllegalArgumentException("Binder object is null.", e12);
                }
            }
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        throw new IllegalArgumentException("Unexpected number of IObjectWrapper declared fields: " + declaredFields.length);
    }
}
