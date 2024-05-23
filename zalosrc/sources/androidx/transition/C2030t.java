package androidx.transition;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: androidx.transition.t */
/* loaded from: classes2.dex */
public class C2030t {

    /* renamed from: b */
    public View f8616b;

    /* renamed from: a */
    public final Map f8615a = new HashMap();

    /* renamed from: c */
    final ArrayList f8617c = new ArrayList();

    public C2030t(View view) {
        this.f8616b = view;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C2030t) {
            C2030t c2030t = (C2030t) obj;
            if (this.f8616b == c2030t.f8616b && this.f8615a.equals(c2030t.f8615a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return (this.f8616b.hashCode() * 31) + this.f8615a.hashCode();
    }

    public String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f8616b + "\n") + "    values:";
        for (String str2 : this.f8615a.keySet()) {
            str = str + "    " + str2 + ": " + this.f8615a.get(str2) + "\n";
        }
        return str;
    }
}
