package pw;

import android.content.Context;
import java.util.ArrayList;

/* renamed from: pw.b */
/* loaded from: classes4.dex */
public class C24913b implements InterfaceC24912a {

    /* renamed from: b */
    private static C24913b f119529b;

    /* renamed from: a */
    private InterfaceC24912a f119530a;

    private C24913b() {
        ArrayList<InterfaceC24912a> arrayList = new ArrayList();
        arrayList.add(new C24914c());
        arrayList.add(new C24915d());
        for (InterfaceC24912a interfaceC24912a : arrayList) {
            if (interfaceC24912a.mo129581a()) {
                this.f119530a = interfaceC24912a;
            }
        }
    }

    /* renamed from: c */
    public static C24913b m129583c() {
        if (f119529b == null) {
            f119529b = new C24913b();
        }
        return f119529b;
    }

    @Override // pw.InterfaceC24912a
    /* renamed from: a */
    public boolean mo129581a() {
        return this.f119530a != null;
    }

    @Override // pw.InterfaceC24912a
    /* renamed from: b */
    public int mo129582b(Context context) {
        InterfaceC24912a interfaceC24912a = this.f119530a;
        if (interfaceC24912a != null) {
            return interfaceC24912a.mo129582b(context);
        }
        return 0;
    }
}
