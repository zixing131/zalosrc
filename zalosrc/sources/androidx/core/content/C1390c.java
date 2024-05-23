package androidx.core.content;

import android.content.LocusId;
import android.os.Build;
import androidx.core.util.AbstractC1487i;

/* renamed from: androidx.core.content.c */
/* loaded from: classes2.dex */
public final class C1390c {

    /* renamed from: a */
    private final String f6111a;

    /* renamed from: b */
    private final LocusId f6112b;

    /* renamed from: androidx.core.content.c$a */
    /* loaded from: classes2.dex */
    private static class a {
        /* renamed from: a */
        static LocusId m6997a(String str) {
            return new LocusId(str);
        }
    }

    public C1390c(String str) {
        this.f6111a = (String) AbstractC1487i.m7495j(str, "id cannot be empty");
        if (Build.VERSION.SDK_INT >= 29) {
            this.f6112b = a.m6997a(str);
        } else {
            this.f6112b = null;
        }
    }

    /* renamed from: a */
    private String m6995a() {
        return this.f6111a.length() + "_chars";
    }

    /* renamed from: b */
    public LocusId m6996b() {
        return this.f6112b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1390c.class != obj.getClass()) {
            return false;
        }
        C1390c c1390c = (C1390c) obj;
        String str = this.f6111a;
        if (str == null) {
            if (c1390c.f6111a == null) {
                return true;
            }
            return false;
        }
        return str.equals(c1390c.f6111a);
    }

    public int hashCode() {
        int hashCode;
        String str = this.f6111a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return 31 + hashCode;
    }

    public String toString() {
        return "LocusIdCompat[" + m6995a() + "]";
    }
}
