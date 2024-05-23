package p008a2;

import fn0.AbstractC19074t;

/* renamed from: a2.x */
/* loaded from: classes2.dex */
public final class C0087x {

    /* renamed from: a */
    public static final C0087x f411a = new C0087x();

    private C0087x() {
    }

    /* renamed from: a */
    public static final String m383a(String str) {
        AbstractC19074t.m100208f(str, "hash");
        return "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + str + "')";
    }
}
