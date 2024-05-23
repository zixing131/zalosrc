package p361nb;

import android.util.SparseArray;
import android.util.SparseIntArray;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.Arrays;
import org.json.JSONObject;

/* renamed from: nb.x */
/* loaded from: classes3.dex */
public final class C23667x extends C23669z {
    public static final a Companion = new a(null);

    /* renamed from: l */
    private static final SparseArray f114648l;

    /* renamed from: i */
    public final JSONObject f114649i;

    /* renamed from: j */
    public int f114650j;

    /* renamed from: k */
    public String f114651k;

    /* renamed from: nb.x$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final int m123991a(int i11, int i12, int i13) {
            if (C23667x.f114648l.get(i11) != null) {
                Object obj = C23667x.f114648l.get(i11);
                AbstractC19074t.m100205c(obj);
                if (((SparseArray) obj).get(i12) != null) {
                    Object obj2 = C23667x.f114648l.get(i11);
                    AbstractC19074t.m100205c(obj2);
                    Object obj3 = ((SparseArray) obj2).get(i12);
                    AbstractC19074t.m100205c(obj3);
                    return ((SparseIntArray) obj3).get(i13);
                }
            }
            return 0;
        }
    }

    static {
        SparseArray sparseArray = new SparseArray();
        f114648l = sparseArray;
        SparseIntArray sparseIntArray = new SparseIntArray();
        sparseIntArray.put(1, 4);
        sparseIntArray.put(2, 6);
        sparseIntArray.put(3, 4);
        sparseIntArray.put(4, 4);
        sparseIntArray.put(5, 6);
        sparseIntArray.put(7, 8);
        sparseIntArray.put(8, 4);
        sparseIntArray.put(6, 4);
        sparseIntArray.put(9, 5);
        sparseIntArray.put(10, 6);
        sparseIntArray.put(11, 5);
        sparseIntArray.put(12, 1);
        sparseIntArray.put(13, 1);
        sparseIntArray.put(14, 3);
        sparseIntArray.put(15, 2);
        sparseIntArray.put(16, 3);
        SparseArray sparseArray2 = new SparseArray();
        sparseArray2.put(0, sparseIntArray);
        sparseArray.put(8, sparseArray2);
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        sparseIntArray2.put(1, 3);
        SparseArray sparseArray3 = new SparseArray();
        sparseArray3.put(1, sparseIntArray2);
        sparseArray.put(13, sparseArray3);
    }

    public C23667x(int i11, int i12, int i13, JSONObject jSONObject) {
        this.f114654a = i11;
        this.f114655b = i12;
        this.f114657d = i13;
        this.f114649i = jSONObject == null ? new JSONObject() : jSONObject;
        this.f114650j = 0;
        this.f114651k = "";
        int m123991a = Companion.m123991a(this.f114654a, this.f114655b, this.f114657d);
        this.f114658e = m123991a;
        this.f114659f = new String[m123991a];
    }

    @Override // p361nb.C23669z
    /* renamed from: f */
    public void mo123890f() {
        super.mo123890f();
        int m123991a = Companion.m123991a(this.f114654a, this.f114655b, this.f114657d);
        int i11 = this.f114658e;
        if (m123991a != i11) {
            return;
        }
        int i12 = 0;
        while (i12 < i11) {
            int i13 = i12 + 1;
            this.f114659f[i12] = this.f114649i.optString("param" + i13);
            i12 = i13;
        }
    }

    @Override // p361nb.C23669z
    public String toString() {
        return "TrackingLogChatInfo{currentParams=" + this.f114649i + ", infoType=" + this.f114650j + ", oldParams='" + this.f114651k + "', typeLog=" + this.f114654a + ", subTypeLog=" + this.f114655b + ", time=" + this.f114656c + ", source=" + this.f114657d + ", paramSize=" + this.f114658e + ", params=" + Arrays.toString(this.f114659f) + ", visible=" + this.f114660g + "}";
    }

    public C23667x(C23667x c23667x) {
        AbstractC19074t.m100208f(c23667x, "input");
        this.f114654a = c23667x.f114654a;
        this.f114655b = c23667x.f114655b;
        this.f114657d = c23667x.f114657d;
        this.f114649i = new JSONObject(c23667x.f114649i.toString());
        this.f114651k = c23667x.f114651k;
        this.f114650j = c23667x.f114650j;
        int i11 = c23667x.f114658e;
        this.f114658e = i11;
        String[] strArr = new String[i11];
        this.f114659f = strArr;
        System.arraycopy(c23667x.f114659f, 0, strArr, 0, strArr.length);
    }
}
