package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class q93 extends f83 {

    /* renamed from: v */
    static final f83 f26693v = new q93(null, new Object[0], 0);

    /* renamed from: s */
    private final transient Object f26694s;

    /* renamed from: t */
    final transient Object[] f26695t;

    /* renamed from: u */
    private final transient int f26696u;

    private q93(Object obj, Object[] objArr, int i11) {
        this.f26694s = obj;
        this.f26695t = objArr;
        this.f26696u = i11;
    }

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [short[], byte[]], vars: [r5v3 ??, r5v10 ??, r5v6 short[], r5v11 byte[]]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.rerun(InitCodeVariables.java:36)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:553)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
        */
    /* renamed from: i */
    static com.google.android.gms.internal.ads.q93 m25674i(int r17, java.lang.Object[] r18, com.google.android.gms.internal.ads.e83 r19) {
        /*
            Method dump skipped, instructions count: 431
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.q93.m25674i(int, java.lang.Object[], com.google.android.gms.internal.ads.e83):com.google.android.gms.internal.ads.q93");
    }

    @Override // com.google.android.gms.internal.ads.f83
    /* renamed from: a */
    final x73 mo21968a() {
        return new p93(this.f26695t, 1, this.f26696u);
    }

    @Override // com.google.android.gms.internal.ads.f83
    /* renamed from: e */
    final h83 mo21970e() {
        return new m93(this, this.f26695t, 0, this.f26696u);
    }

    @Override // com.google.android.gms.internal.ads.f83
    /* renamed from: f */
    final h83 mo21971f() {
        return new n93(this, new p93(this.f26695t, 0, this.f26696u));
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x009f A[RETURN] */
    @Override // com.google.android.gms.internal.ads.f83, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(Object obj) {
        Object obj2;
        Object obj3 = this.f26694s;
        Object[] objArr = this.f26695t;
        int i11 = this.f26696u;
        if (obj != null) {
            if (i11 == 1) {
                Object obj4 = objArr[0];
                obj4.getClass();
                if (obj4.equals(obj)) {
                    obj2 = objArr[1];
                    obj2.getClass();
                }
            } else if (obj3 != null) {
                if (obj3 instanceof byte[]) {
                    byte[] bArr = (byte[]) obj3;
                    int length = bArr.length - 1;
                    int m26863a = u73.m26863a(obj.hashCode());
                    while (true) {
                        int i12 = m26863a & length;
                        int i13 = bArr[i12] & 255;
                        if (i13 == 255) {
                            break;
                        }
                        if (obj.equals(objArr[i13])) {
                            obj2 = objArr[i13 ^ 1];
                            break;
                        }
                        m26863a = i12 + 1;
                    }
                } else if (obj3 instanceof short[]) {
                    short[] sArr = (short[]) obj3;
                    int length2 = sArr.length - 1;
                    int m26863a2 = u73.m26863a(obj.hashCode());
                    while (true) {
                        int i14 = m26863a2 & length2;
                        char c11 = (char) sArr[i14];
                        if (c11 == 65535) {
                            break;
                        }
                        if (obj.equals(objArr[c11])) {
                            obj2 = objArr[c11 ^ 1];
                            break;
                        }
                        m26863a2 = i14 + 1;
                    }
                } else {
                    int[] iArr = (int[]) obj3;
                    int length3 = iArr.length - 1;
                    int m26863a3 = u73.m26863a(obj.hashCode());
                    while (true) {
                        int i15 = m26863a3 & length3;
                        int i16 = iArr[i15];
                        if (i16 == -1) {
                            break;
                        }
                        if (obj.equals(objArr[i16])) {
                            obj2 = objArr[i16 ^ 1];
                            break;
                        }
                        m26863a3 = i15 + 1;
                    }
                }
            }
            if (obj2 != null) {
                return null;
            }
            return obj2;
        }
        obj2 = null;
        if (obj2 != null) {
        }
    }

    @Override // java.util.Map
    public final int size() {
        return this.f26696u;
    }
}
