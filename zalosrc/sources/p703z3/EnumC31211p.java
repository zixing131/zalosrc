package p703z3;

import android.util.SparseArray;

/* renamed from: z3.p */
/* loaded from: classes.dex */
public enum EnumC31211p {
    DEFAULT(0),
    UNMETERED_ONLY(1),
    UNMETERED_OR_DAILY(2),
    FAST_IF_RADIO_AWAKE(3),
    NEVER(4),
    UNRECOGNIZED(-1);


    /* renamed from: w */
    private static final SparseArray f144217w;

    /* renamed from: p */
    private final int f144219p;

    static {
        EnumC31211p enumC31211p = DEFAULT;
        EnumC31211p enumC31211p2 = UNMETERED_ONLY;
        EnumC31211p enumC31211p3 = UNMETERED_OR_DAILY;
        EnumC31211p enumC31211p4 = FAST_IF_RADIO_AWAKE;
        EnumC31211p enumC31211p5 = NEVER;
        EnumC31211p enumC31211p6 = UNRECOGNIZED;
        SparseArray sparseArray = new SparseArray();
        f144217w = sparseArray;
        sparseArray.put(0, enumC31211p);
        sparseArray.put(1, enumC31211p2);
        sparseArray.put(2, enumC31211p3);
        sparseArray.put(3, enumC31211p4);
        sparseArray.put(4, enumC31211p5);
        sparseArray.put(-1, enumC31211p6);
    }

    EnumC31211p(int i11) {
        this.f144219p = i11;
    }
}
