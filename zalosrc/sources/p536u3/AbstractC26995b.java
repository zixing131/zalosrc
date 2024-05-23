package p536u3;

import android.util.JsonReader;
import java.util.List;

/* renamed from: u3.b */
/* loaded from: classes2.dex */
public abstract class AbstractC26995b {

    /* renamed from: a */
    public static final AbstractC26994a f127638a = new a();

    /* renamed from: b */
    static final AbstractC26994a f127639b = new b();

    /* renamed from: c */
    static final AbstractC26994a f127640c = new c();

    /* renamed from: d */
    private static final AbstractC26994a f127641d = new d();

    /* renamed from: u3.b$a */
    /* loaded from: classes2.dex */
    class a extends AbstractC26994a {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // p536u3.AbstractC26994a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public String mo139107b(JsonReader jsonReader) {
            return jsonReader.nextString();
        }
    }

    /* renamed from: u3.b$b */
    /* loaded from: classes2.dex */
    class b extends AbstractC26994a {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // p536u3.AbstractC26994a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Float mo139107b(JsonReader jsonReader) {
            return Float.valueOf((float) jsonReader.nextDouble());
        }
    }

    /* renamed from: u3.b$c */
    /* loaded from: classes2.dex */
    class c extends AbstractC26994a {
        c() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // p536u3.AbstractC26994a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public List mo139107b(JsonReader jsonReader) {
            return AbstractC26995b.f127639b.m139106a(jsonReader);
        }
    }

    /* renamed from: u3.b$d */
    /* loaded from: classes2.dex */
    class d extends AbstractC26994a {
        d() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // p536u3.AbstractC26994a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public List mo139107b(JsonReader jsonReader) {
            return AbstractC26995b.f127640c.m139106a(jsonReader);
        }
    }

    /* renamed from: a */
    private static float[][][] m139108a(List list) {
        float[][][] fArr = new float[list.size()][];
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            int size2 = ((List) list.get(0)).size();
            float[][] fArr2 = new float[size2];
            for (int i12 = 0; i12 < size2; i12++) {
                fArr2[i12] = m139109b((List) ((List) list.get(i11)).get(i12));
            }
            fArr[i11] = fArr2;
        }
        return fArr;
    }

    /* renamed from: b */
    private static float[] m139109b(List list) {
        float[] fArr = new float[list.size()];
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            fArr[i11] = ((Float) list.get(i11)).floatValue();
        }
        return fArr;
    }

    /* renamed from: c */
    public static float[][][] m139110c(JsonReader jsonReader) {
        return m139108a(f127641d.m139106a(jsonReader));
    }

    /* renamed from: d */
    public static float[] m139111d(JsonReader jsonReader) {
        return m139109b(f127639b.m139106a(jsonReader));
    }
}
