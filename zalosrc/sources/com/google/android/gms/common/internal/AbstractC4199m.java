package com.google.android.gms.common.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.gms.common.internal.m */
/* loaded from: classes.dex */
public abstract class AbstractC4199m {

    /* renamed from: com.google.android.gms.common.internal.m$a */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a */
        private final List f16627a;

        /* renamed from: b */
        private final Object f16628b;

        /* synthetic */ a(Object obj, AbstractC4236y0 abstractC4236y0) {
            AbstractC4205o.m19722k(obj);
            this.f16628b = obj;
            this.f16627a = new ArrayList();
        }

        /* renamed from: a */
        public a m19704a(String str, Object obj) {
            List list = this.f16627a;
            AbstractC4205o.m19722k(str);
            list.add(str + "=" + String.valueOf(obj));
            return this;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder(100);
            sb2.append(this.f16628b.getClass().getSimpleName());
            sb2.append('{');
            int size = this.f16627a.size();
            for (int i11 = 0; i11 < size; i11++) {
                sb2.append((String) this.f16627a.get(i11));
                if (i11 < size - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append('}');
            return sb2.toString();
        }
    }

    /* renamed from: a */
    public static boolean m19701a(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null && obj.equals(obj2)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static int m19702b(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    /* renamed from: c */
    public static a m19703c(Object obj) {
        return new a(obj, null);
    }
}
