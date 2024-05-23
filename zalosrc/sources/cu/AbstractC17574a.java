package cu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: cu.a */
/* loaded from: classes4.dex */
public abstract class AbstractC17574a {
    /* renamed from: a */
    public static int m93594a(List list, Object obj) {
        int size = list.size();
        int i11 = 0;
        if (size == 0 || ((Comparable) list.get(0)).compareTo(obj) > 0) {
            return 0;
        }
        if (((Comparable) list.get(size - 1)).compareTo(obj) < 0) {
            return size;
        }
        while (i11 < size) {
            int i12 = (i11 + size) >>> 1;
            if (((Comparable) list.get(i12)).compareTo(obj) > 0) {
                size = i12;
            } else {
                i11 = i12 + 1;
            }
        }
        return i11;
    }

    /* renamed from: b */
    public static List m93595b(List list, int i11) {
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        int i12 = 0;
        while (i12 < size) {
            int i13 = i12 + i11;
            arrayList.add(new ArrayList(list.subList(i12, Math.min(size, i13))));
            i12 = i13;
        }
        return arrayList;
    }

    /* renamed from: c */
    public static byte[] m93596c(byte[] bArr, byte[] bArr2) {
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length + bArr2.length);
        System.arraycopy(bArr2, 0, copyOf, bArr.length, bArr2.length);
        return copyOf;
    }

    /* renamed from: d */
    public static Map m93597d(Collection collection) {
        HashMap hashMap = new HashMap();
        for (Object obj : collection) {
            Integer num = (Integer) hashMap.get(obj);
            if (num == null) {
                hashMap.put(obj, 1);
            } else {
                hashMap.put(obj, Integer.valueOf(num.intValue() + 1));
            }
        }
        return hashMap;
    }

    /* renamed from: e */
    private static int m93598e(Object obj, Map map) {
        Integer num = (Integer) map.get(obj);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    /* renamed from: f */
    public static Collection m93599f(Collection collection, Collection collection2) {
        ArrayList arrayList = new ArrayList();
        Map m93597d = m93597d(collection);
        Map m93597d2 = m93597d(collection2);
        HashSet hashSet = new HashSet(collection);
        hashSet.addAll(collection2);
        for (Object obj : hashSet) {
            int min = Math.min(m93598e(obj, m93597d), m93598e(obj, m93597d2));
            for (int i11 = 0; i11 < min; i11++) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* renamed from: g */
    public static int m93600g(byte[] bArr, byte[] bArr2) {
        if (bArr.length == 0 || bArr2.length == 0 || bArr2.length > bArr.length) {
            return -1;
        }
        for (int length = bArr.length - 1; length >= 0; length--) {
            if (bArr[length] == bArr2[0]) {
                for (int i11 = 0; i11 < bArr2.length; i11++) {
                    int i12 = length + i11;
                    if (bArr.length > i12 && bArr2[i11] == bArr[i12]) {
                    }
                }
                return length;
            }
        }
        return -1;
    }

    /* renamed from: h */
    public static String m93601h(List list, boolean z11) {
        StringBuilder sb2 = new StringBuilder(64);
        Iterator it = list.iterator();
        boolean z12 = true;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!z12) {
                sb2.append(",");
            } else {
                z12 = false;
            }
            if (z11) {
                sb2.append("'");
                sb2.append(str);
                sb2.append("'");
            } else {
                sb2.append(str);
            }
        }
        return sb2.toString();
    }

    /* renamed from: i */
    public static List m93602i(Map map) {
        return new ArrayList(map.keySet());
    }

    /* renamed from: j */
    public static Collection m93603j(Collection collection, Collection collection2) {
        ArrayList arrayList = new ArrayList(collection);
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.remove(it.next());
        }
        return arrayList;
    }
}
