package p119e2;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import fn0.AbstractC19074t;
import java.util.List;

/* renamed from: e2.f */
/* loaded from: classes2.dex */
public final class C18181f {

    /* renamed from: a */
    public static final C18181f f92341a = new C18181f();

    private C18181f() {
    }

    /* renamed from: a */
    public static final List m96924a(Cursor cursor) {
        AbstractC19074t.m100208f(cursor, "cursor");
        List<Uri> notificationUris = cursor.getNotificationUris();
        AbstractC19074t.m100205c(notificationUris);
        return notificationUris;
    }

    /* renamed from: b */
    public static final void m96925b(Cursor cursor, ContentResolver contentResolver, List list) {
        AbstractC19074t.m100208f(cursor, "cursor");
        AbstractC19074t.m100208f(contentResolver, "cr");
        AbstractC19074t.m100208f(list, "uris");
        cursor.setNotificationUris(contentResolver, list);
    }
}
