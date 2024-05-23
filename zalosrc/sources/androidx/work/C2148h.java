package androidx.work;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: androidx.work.h */
/* loaded from: classes.dex */
public final class C2148h {

    /* renamed from: b */
    private static final String f9114b = AbstractC2253u.m11897i("Data");

    /* renamed from: c */
    public static final C2148h f9115c = new a().m11534a();

    /* renamed from: a */
    Map f9116a;

    /* renamed from: androidx.work.h$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private Map f9117a = new HashMap();

        /* renamed from: a */
        public C2148h m11534a() {
            C2148h c2148h = new C2148h(this.f9117a);
            C2148h.m11529l(c2148h);
            return c2148h;
        }

        /* renamed from: b */
        public a m11535b(String str, Object obj) {
            if (obj == null) {
                this.f9117a.put(str, null);
            } else {
                Class<?> cls = obj.getClass();
                if (cls != Boolean.class && cls != Byte.class && cls != Integer.class && cls != Long.class && cls != Float.class && cls != Double.class && cls != String.class && cls != Boolean[].class && cls != Byte[].class && cls != Integer[].class && cls != Long[].class && cls != Float[].class && cls != Double[].class && cls != String[].class) {
                    if (cls == boolean[].class) {
                        this.f9117a.put(str, C2148h.m11522a((boolean[]) obj));
                    } else if (cls == byte[].class) {
                        this.f9117a.put(str, C2148h.m11523b((byte[]) obj));
                    } else if (cls == int[].class) {
                        this.f9117a.put(str, C2148h.m11526e((int[]) obj));
                    } else if (cls == long[].class) {
                        this.f9117a.put(str, C2148h.m11527f((long[]) obj));
                    } else if (cls == float[].class) {
                        this.f9117a.put(str, C2148h.m11525d((float[]) obj));
                    } else if (cls == double[].class) {
                        this.f9117a.put(str, C2148h.m11524c((double[]) obj));
                    } else {
                        throw new IllegalArgumentException("Key " + str + " has invalid type " + cls);
                    }
                } else {
                    this.f9117a.put(str, obj);
                }
            }
            return this;
        }

        /* renamed from: c */
        public a m11536c(C2148h c2148h) {
            m11537d(c2148h.f9116a);
            return this;
        }

        /* renamed from: d */
        public a m11537d(Map map) {
            for (Map.Entry entry : map.entrySet()) {
                m11535b((String) entry.getKey(), entry.getValue());
            }
            return this;
        }

        /* renamed from: e */
        public a m11538e(String str, float f11) {
            this.f9117a.put(str, Float.valueOf(f11));
            return this;
        }

        /* renamed from: f */
        public a m11539f(String str, String str2) {
            this.f9117a.put(str, str2);
            return this;
        }
    }

    public C2148h(C2148h c2148h) {
        this.f9116a = new HashMap(c2148h.f9116a);
    }

    /* renamed from: a */
    public static Boolean[] m11522a(boolean[] zArr) {
        Boolean[] boolArr = new Boolean[zArr.length];
        for (int i11 = 0; i11 < zArr.length; i11++) {
            boolArr[i11] = Boolean.valueOf(zArr[i11]);
        }
        return boolArr;
    }

    /* renamed from: b */
    public static Byte[] m11523b(byte[] bArr) {
        Byte[] bArr2 = new Byte[bArr.length];
        for (int i11 = 0; i11 < bArr.length; i11++) {
            bArr2[i11] = Byte.valueOf(bArr[i11]);
        }
        return bArr2;
    }

    /* renamed from: c */
    public static Double[] m11524c(double[] dArr) {
        Double[] dArr2 = new Double[dArr.length];
        for (int i11 = 0; i11 < dArr.length; i11++) {
            dArr2[i11] = Double.valueOf(dArr[i11]);
        }
        return dArr2;
    }

    /* renamed from: d */
    public static Float[] m11525d(float[] fArr) {
        Float[] fArr2 = new Float[fArr.length];
        for (int i11 = 0; i11 < fArr.length; i11++) {
            fArr2[i11] = Float.valueOf(fArr[i11]);
        }
        return fArr2;
    }

    /* renamed from: e */
    public static Integer[] m11526e(int[] iArr) {
        Integer[] numArr = new Integer[iArr.length];
        for (int i11 = 0; i11 < iArr.length; i11++) {
            numArr[i11] = Integer.valueOf(iArr[i11]);
        }
        return numArr;
    }

    /* renamed from: f */
    public static Long[] m11527f(long[] jArr) {
        Long[] lArr = new Long[jArr.length];
        for (int i11 = 0; i11 < jArr.length; i11++) {
            lArr[i11] = Long.valueOf(jArr[i11]);
        }
        return lArr;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:19:0x0031
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
        */
    /* renamed from: g */
    public static androidx.work.C2148h m11528g(byte[] r5) {
        /*
            int r0 = r5.length
            r1 = 10240(0x2800, float:1.4349E-41)
            if (r0 > r1) goto L50
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
            r1.<init>(r5)
            r5 = 0
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L35 java.lang.Throwable -> L39
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L35 java.lang.Throwable -> L39
            int r5 = r2.readInt()     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L2b
        L19:
            if (r5 <= 0) goto L2e
            java.lang.String r3 = r2.readUTF()     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L2b
            java.lang.Object r4 = r2.readObject()     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L2b
            r0.put(r3, r4)     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L2b
            int r5 = r5 + (-1)
            goto L19
        L29:
            r5 = move-exception
            goto L3b
        L2b:
            r5 = r2
            goto L44
        L2e:
            r2.close()     // Catch: java.io.IOException -> L31
        L31:
            r1.close()     // Catch: java.io.IOException -> L4a
            goto L4a
        L35:
            r0 = move-exception
            r2 = r5
            r5 = r0
            goto L3b
        L39:
            goto L44
        L3b:
            if (r2 == 0) goto L40
            r2.close()     // Catch: java.io.IOException -> L40
        L40:
            r1.close()     // Catch: java.io.IOException -> L43
        L43:
            throw r5
        L44:
            if (r5 == 0) goto L31
            r5.close()     // Catch: java.io.IOException -> L31
            goto L31
        L4a:
            androidx.work.h r5 = new androidx.work.h
            r5.<init>(r0)
            return r5
        L50:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Data cannot occupy more than 10240 bytes when serialized"
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.C2148h.m11528g(byte[]):androidx.work.h");
    }

    /* renamed from: l */
    public static byte[] m11529l(C2148h c2148h) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = null;
        try {
            try {
                ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(byteArrayOutputStream);
                try {
                    objectOutputStream2.writeInt(c2148h.m11533k());
                    for (Map.Entry entry : c2148h.f9116a.entrySet()) {
                        objectOutputStream2.writeUTF((String) entry.getKey());
                        objectOutputStream2.writeObject(entry.getValue());
                    }
                    try {
                        objectOutputStream2.close();
                    } catch (IOException unused) {
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException unused2) {
                    }
                    if (byteArrayOutputStream.size() <= 10240) {
                        return byteArrayOutputStream.toByteArray();
                    }
                    throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
                } catch (IOException unused3) {
                    objectOutputStream = objectOutputStream2;
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    if (objectOutputStream != null) {
                        try {
                            objectOutputStream.close();
                        } catch (IOException unused4) {
                        }
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException unused5) {
                    }
                    return byteArray;
                } catch (Throwable th2) {
                    th = th2;
                    objectOutputStream = objectOutputStream2;
                    if (objectOutputStream != null) {
                        try {
                            objectOutputStream.close();
                        } catch (IOException unused6) {
                        }
                    }
                    try {
                        byteArrayOutputStream.close();
                        throw th;
                    } catch (IOException unused7) {
                        throw th;
                    }
                }
            } catch (IOException unused8) {
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public boolean equals(Object obj) {
        boolean equals;
        if (this == obj) {
            return true;
        }
        if (obj == null || C2148h.class != obj.getClass()) {
            return false;
        }
        C2148h c2148h = (C2148h) obj;
        Set<String> keySet = this.f9116a.keySet();
        if (!keySet.equals(c2148h.f9116a.keySet())) {
            return false;
        }
        for (String str : keySet) {
            Object obj2 = this.f9116a.get(str);
            Object obj3 = c2148h.f9116a.get(str);
            if (obj2 != null && obj3 != null) {
                if ((obj2 instanceof Object[]) && (obj3 instanceof Object[])) {
                    equals = Arrays.deepEquals((Object[]) obj2, (Object[]) obj3);
                } else {
                    equals = obj2.equals(obj3);
                }
                if (!equals) {
                    return false;
                }
            } else if (obj2 != obj3) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: h */
    public float m11530h(String str, float f11) {
        Object obj = this.f9116a.get(str);
        if (obj instanceof Float) {
            return ((Float) obj).floatValue();
        }
        return f11;
    }

    public int hashCode() {
        return this.f9116a.hashCode() * 31;
    }

    /* renamed from: i */
    public Map m11531i() {
        return Collections.unmodifiableMap(this.f9116a);
    }

    /* renamed from: j */
    public String m11532j(String str) {
        Object obj = this.f9116a.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    /* renamed from: k */
    public int m11533k() {
        return this.f9116a.size();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Data {");
        if (!this.f9116a.isEmpty()) {
            for (String str : this.f9116a.keySet()) {
                sb2.append(str);
                sb2.append(" : ");
                Object obj = this.f9116a.get(str);
                if (obj instanceof Object[]) {
                    sb2.append(Arrays.toString((Object[]) obj));
                } else {
                    sb2.append(obj);
                }
                sb2.append(", ");
            }
        }
        sb2.append("}");
        return sb2.toString();
    }

    public C2148h(Map map) {
        this.f9116a = new HashMap(map);
    }
}
