package p147f2;

import android.database.sqlite.SQLiteStatement;
import fn0.AbstractC19074t;
import p119e2.InterfaceC18186k;

/* renamed from: f2.h */
/* loaded from: classes.dex */
public final class C18702h extends C18701g implements InterfaceC18186k {

    /* renamed from: q */
    private final SQLiteStatement f93957q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18702h(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        AbstractC19074t.m100208f(sQLiteStatement, "delegate");
        this.f93957q = sQLiteStatement;
    }

    @Override // p119e2.InterfaceC18186k
    /* renamed from: W */
    public long mo218W() {
        return this.f93957q.executeInsert();
    }

    @Override // p119e2.InterfaceC18186k
    /* renamed from: w */
    public int mo223w() {
        return this.f93957q.executeUpdateDelete();
    }
}
