package fo0;

import java.util.Hashtable;

/* renamed from: fo0.b */
/* loaded from: classes7.dex */
public class C19091b {

    /* renamed from: a */
    private final String f95029a;

    /* renamed from: b */
    private final Hashtable f95030b = new Hashtable();

    public C19091b(String str) {
        this.f95029a = str;
    }

    /* renamed from: a */
    public String m100287a(int i11) {
        String str = (String) this.f95030b.get(Integer.valueOf(i11));
        if (str == null) {
            return this.f95029a;
        }
        return str;
    }

    /* renamed from: b */
    public void m100288b(int i11, String str) {
        if (str != null && str.equals(this.f95029a)) {
            this.f95030b.remove(Integer.valueOf(i11));
        } else {
            this.f95030b.put(Integer.valueOf(i11), str);
        }
    }
}
