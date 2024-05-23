package e90;

import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import java.util.HashMap;
import p666y1.C30256b;

/* renamed from: e90.d */
/* loaded from: classes6.dex */
public class C18311d {

    /* renamed from: b */
    public Drawable f92605b;

    /* renamed from: a */
    private final SparseArray f92604a = new SparseArray(5);

    /* renamed from: c */
    private final HashMap f92606c = new HashMap(5);

    /* renamed from: a */
    public int m97233a(int i11) {
        try {
            if (!this.f92606c.containsKey(Integer.valueOf(i11))) {
                return 0;
            }
            return ((Integer) this.f92606c.get(Integer.valueOf(i11))).intValue();
        } catch (Exception e11) {
            e11.printStackTrace();
            return 0;
        }
    }

    /* renamed from: b */
    public C30256b m97234b(int i11) {
        return (C30256b) this.f92604a.get(i11);
    }

    /* renamed from: c */
    public void m97235c(int i11, int i12) {
        this.f92606c.put(Integer.valueOf(i11), Integer.valueOf(i12));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m97236d(int i11, C30256b c30256b) {
        this.f92604a.put(i11, c30256b);
    }
}
