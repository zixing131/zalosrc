package me0;

import android.text.TextUtils;
import com.zing.zalo.control.ContactProfile;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import p664y.AbstractC30228a;

/* renamed from: me0.d6 */
/* loaded from: classes4.dex */
public class C23045d6 {

    /* renamed from: a */
    StringBuilder f112049a = new StringBuilder();

    /* renamed from: b */
    Map f112050b = new HashMap();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: me0.d6$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a */
        static final C23045d6 f112051a = new C23045d6();
    }

    C23045d6() {
    }

    /* renamed from: c */
    public static C23045d6 m118234c() {
        return a.f112051a;
    }

    /* renamed from: a */
    boolean m118235a(char c11) {
        return c11 >= '0' && c11 <= '9';
    }

    /* renamed from: b */
    String m118236b(String str) {
        StringBuilder sb2 = new StringBuilder();
        int length = str.length();
        for (int i11 = 0; i11 < length; i11++) {
            char charAt = str.charAt(i11);
            if (m118235a(charAt)) {
                sb2.append(charAt);
            }
        }
        return sb2.toString();
    }

    /* renamed from: d */
    public void m118237d(String str, ArrayList arrayList, boolean z11) {
        try {
            String m118236b = m118236b(str);
            if (TextUtils.isEmpty(m118236b)) {
                return;
            }
            HashSet hashSet = new HashSet();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                hashSet.add(((ContactProfile) it.next()).f42434r);
            }
            int indexOf = this.f112049a.indexOf(m118236b);
            int length = m118236b.length();
            while (indexOf >= 0) {
                int i11 = indexOf;
                while (true) {
                    if (i11 >= 0) {
                        if (this.f112050b.containsKey(Integer.valueOf(i11))) {
                            AbstractC30228a.m149044a(this.f112050b.get(Integer.valueOf(i11)));
                            break;
                        } else {
                            i11--;
                            if (z11) {
                                break;
                            }
                        }
                    }
                }
                indexOf = this.f112049a.indexOf(m118236b, indexOf + length);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
