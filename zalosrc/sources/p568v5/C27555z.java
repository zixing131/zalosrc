package p568v5;

import android.content.Context;
import android.location.Location;
import android.os.Build;
import com.google.android.gms.common.api.AbstractC4073c;
import java.lang.reflect.InvocationTargetException;
import p093d6.AbstractC17764e;
import p093d6.InterfaceC17756a;

/* renamed from: v5.z */
/* loaded from: classes2.dex */
public final class C27555z implements InterfaceC17756a {
    @Override // p093d6.InterfaceC17756a
    /* renamed from: a */
    public final Location mo93904a(AbstractC4073c abstractC4073c) {
        String str;
        C27536g m93912b = AbstractC17764e.m93912b(abstractC4073c);
        Context mo19261j = abstractC4073c.mo19261j();
        try {
            if (Build.VERSION.SDK_INT >= 30 && mo19261j != null) {
                try {
                    str = (String) Context.class.getMethod("getAttributionTag", new Class[0]).invoke(mo19261j, new Object[0]);
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                }
                return m93912b.m140743m(str);
            }
            return m93912b.m140743m(str);
        } catch (Exception unused2) {
            return null;
        }
        str = null;
    }
}
