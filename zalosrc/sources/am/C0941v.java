package am;

import com.zing.zalo.p062db.SQLiteDatabase;
import com.zing.zalo.p062db.SQLiteException;
import java.io.File;
import java.util.Iterator;
import java.util.List;

/* renamed from: am.v */
/* loaded from: classes.dex */
public class C0941v implements InterfaceC0911g {
    /* renamed from: c */
    private void m4460c(String str) {
        if (!str.equalsIgnoreCase(":memory:") && str.trim().length() != 0) {
            AbstractC0900b0.m2786b("DDErrorHandler", "deleting the database file: " + str);
            try {
                SQLiteDatabase.m41411f(new File(str));
            } catch (Exception e11) {
                AbstractC0900b0.m2789e("DDErrorHandler", "delete failed: " + e11.getMessage());
            }
        }
    }

    @Override // am.InterfaceC0911g
    /* renamed from: a */
    public void mo2831a(InterfaceC0947y interfaceC0947y, SQLiteException sQLiteException) {
        AbstractC0900b0.m2786b("DDErrorHandler", "Corruption reported by sqlite-custom on database: " + interfaceC0947y.mo2856w());
        if (!interfaceC0947y.isOpen()) {
            m4460c(interfaceC0947y.mo2856w());
            return;
        }
        List list = null;
        try {
            try {
                list = interfaceC0947y.mo2846g();
            } finally {
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        m4460c((String) it.next());
                    }
                } else {
                    m4460c(interfaceC0947y.mo2856w());
                }
            }
        } catch (SQLiteException unused) {
        }
        try {
            interfaceC0947y.close();
        } catch (SQLiteException unused2) {
        }
    }

    @Override // am.InterfaceC0911g
    /* renamed from: b */
    public void mo2832b(InterfaceC0947y interfaceC0947y, SQLiteException sQLiteException) {
        AbstractC0900b0.m2790f("DDErrorHandler", "onException:", sQLiteException);
    }
}
