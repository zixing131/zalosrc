package pl;

import android.content.Context;
import android.content.ContextWrapper;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import androidx.core.content.AbstractC1388a;
import bn0.AbstractC2942k;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.io.File;
import on0.AbstractC24341v;
import tg0.C26676b;

/* renamed from: pl.d */
/* loaded from: classes3.dex */
public final class C24813d extends ContextWrapper {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final String f119088a;

    /* renamed from: pl.d$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24813d(Context context, String str) {
        super(context);
        AbstractC19074t.m100208f(context, "base");
        AbstractC19074t.m100208f(str, "userUid");
        this.f119088a = str;
    }

    /* renamed from: a */
    private final File m129013a(File file) {
        if (!file.exists()) {
            String absolutePath = file.getAbsolutePath();
            try {
                Os.mkdir(absolutePath, 505);
                Os.chmod(absolutePath, 505);
            } catch (ErrnoException e11) {
                C26676b.m136953c(e11);
                if (e11.errno != OsConstants.EEXIST) {
                    C26676b.m136955e("SMLZCloudDBContext", "Failed to ensure " + file + ": " + e11.getMessage(), C26676b.b.f126335t);
                }
            }
        }
        return file;
    }

    /* renamed from: b */
    private final File m129014b(String str) {
        File m13928o;
        m13928o = AbstractC2942k.m13928o(new File(AbstractC1388a.m6963e(this), "databases"), str);
        return m129013a(m13928o);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public File getDatabasePath(String str) {
        boolean m127128x;
        AbstractC19074t.m100208f(str, "name");
        m127128x = AbstractC24341v.m127128x(this.f119088a);
        if (!m127128x) {
            return new File(m129014b(this.f119088a), str);
        }
        throw new IllegalArgumentException("User UID is required. Please ensure it is available before accessing ZaloCloud's database.".toString());
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public SQLiteDatabase openOrCreateDatabase(String str, int i11, SQLiteDatabase.CursorFactory cursorFactory, DatabaseErrorHandler databaseErrorHandler) {
        AbstractC19074t.m100208f(str, "name");
        SQLiteDatabase openOrCreateDatabase = SQLiteDatabase.openOrCreateDatabase(getDatabasePath(str).getPath(), cursorFactory, databaseErrorHandler);
        AbstractC19074t.m100207e(openOrCreateDatabase, "openOrCreateDatabase(...)");
        return openOrCreateDatabase;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public SQLiteDatabase openOrCreateDatabase(String str, int i11, SQLiteDatabase.CursorFactory cursorFactory) {
        AbstractC19074t.m100208f(str, "name");
        return openOrCreateDatabase(str, i11, cursorFactory, null);
    }
}
