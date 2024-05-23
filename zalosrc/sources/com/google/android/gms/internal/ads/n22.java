package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzbr;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.dynamic.BinderC4273d;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class n22 extends SQLiteOpenHelper {

    /* renamed from: p */
    private final Context f24978p;

    /* renamed from: q */
    private final uc3 f24979q;

    public n22(Context context, uc3 uc3Var) {
        super(context, "AdMobOfflineBufferedPings.db", (SQLiteDatabase.CursorFactory) null, ((Integer) zzay.zzc().m21823b(AbstractC4554gx.f21284j7)).intValue());
        this.f24978p = context;
        this.f24979q = uc3Var;
    }

    /* renamed from: b */
    public static /* synthetic */ Void m24794b(cl0 cl0Var, SQLiteDatabase sQLiteDatabase) {
        m24797r(sQLiteDatabase, cl0Var);
        return null;
    }

    /* renamed from: h */
    public static /* synthetic */ void m24795h(SQLiteDatabase sQLiteDatabase, String str, cl0 cl0Var) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("event_state", (Integer) 1);
        sQLiteDatabase.update("offline_buffered_pings", contentValues, "gws_query_id = ?", new String[]{str});
        m24797r(sQLiteDatabase, cl0Var);
    }

    /* renamed from: q */
    public static final void m24796q(SQLiteDatabase sQLiteDatabase, String str) {
        sQLiteDatabase.delete("offline_buffered_pings", "gws_query_id = ? AND event_state = ?", new String[]{str, Integer.toString(0)});
    }

    /* renamed from: r */
    private static void m24797r(SQLiteDatabase sQLiteDatabase, cl0 cl0Var) {
        sQLiteDatabase.beginTransaction();
        try {
            Cursor query = sQLiteDatabase.query("offline_buffered_pings", new String[]{ZMediaPlayer.OnNativeInvokeListener.ARG_URL}, "event_state = 1", null, null, null, "timestamp ASC", null);
            int count = query.getCount();
            String[] strArr = new String[count];
            int i11 = 0;
            while (query.moveToNext()) {
                int columnIndex = query.getColumnIndex(ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
                if (columnIndex != -1) {
                    strArr[i11] = query.getString(columnIndex);
                }
                i11++;
            }
            query.close();
            sQLiteDatabase.delete("offline_buffered_pings", "event_state = ?", new String[]{Integer.toString(1)});
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
            for (int i12 = 0; i12 < count; i12++) {
                cl0Var.zza(strArr[i12]);
            }
        } catch (Throwable th2) {
            sQLiteDatabase.endTransaction();
            throw th2;
        }
    }

    /* renamed from: a */
    public final /* synthetic */ Void m24798a(p22 p22Var, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("timestamp", Long.valueOf(p22Var.f26041a));
        contentValues.put("gws_query_id", p22Var.f26042b);
        contentValues.put(ZMediaPlayer.OnNativeInvokeListener.ARG_URL, p22Var.f26043c);
        contentValues.put("event_state", Integer.valueOf(p22Var.f26044d - 1));
        sQLiteDatabase.insert("offline_buffered_pings", null, contentValues);
        zzt.zzp();
        zzbr zzw = zzs.zzw(this.f24978p);
        if (zzw != null) {
            try {
                zzw.zze(BinderC4273d.m19913I3(this.f24978p));
            } catch (RemoteException e11) {
                zze.zzb("Failed to schedule offline ping sender.", e11);
            }
        }
        return null;
    }

    /* renamed from: c */
    public final void m24799c(String str) {
        m24801f(new ju2() { // from class: com.google.android.gms.internal.ads.k22

            /* renamed from: b */
            public final /* synthetic */ String f23079b;

            public /* synthetic */ k22(String str2) {
                r2 = str2;
            }

            @Override // com.google.android.gms.internal.ads.ju2
            public final Object zza(Object obj) {
                n22.m24796q((SQLiteDatabase) obj, r2);
                return null;
            }
        });
    }

    /* renamed from: d */
    public final void m24800d(p22 p22Var) {
        m24801f(new ju2() { // from class: com.google.android.gms.internal.ads.i22

            /* renamed from: b */
            public final /* synthetic */ p22 f22022b;

            public /* synthetic */ i22(p22 p22Var2) {
                r2 = p22Var2;
            }

            @Override // com.google.android.gms.internal.ads.ju2
            public final Object zza(Object obj) {
                n22.this.m24798a(r2, (SQLiteDatabase) obj);
                return null;
            }
        });
    }

    /* renamed from: f */
    public final void m24801f(ju2 ju2Var) {
        kc3.m23886r(this.f24979q.mo21339R(new Callable() { // from class: com.google.android.gms.internal.ads.g22
            public /* synthetic */ g22() {
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return n22.this.getWritableDatabase();
            }
        }), new m22(this, ju2Var), this.f24979q);
    }

    /* renamed from: i */
    public final void m24802i(SQLiteDatabase sQLiteDatabase, cl0 cl0Var, String str) {
        this.f24979q.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.h22

            /* renamed from: p */
            public final /* synthetic */ SQLiteDatabase f21507p;

            /* renamed from: q */
            public final /* synthetic */ String f21508q;

            /* renamed from: r */
            public final /* synthetic */ cl0 f21509r;

            public /* synthetic */ h22(SQLiteDatabase sQLiteDatabase2, String str2, cl0 cl0Var2) {
                r1 = sQLiteDatabase2;
                r2 = str2;
                r3 = cl0Var2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                n22.m24795h(r1, r2, r3);
            }
        });
    }

    /* renamed from: o */
    public final void m24803o(cl0 cl0Var, String str) {
        m24801f(new ju2() { // from class: com.google.android.gms.internal.ads.l22

            /* renamed from: b */
            public final /* synthetic */ cl0 f23699b;

            /* renamed from: c */
            public final /* synthetic */ String f23700c;

            public /* synthetic */ l22(cl0 cl0Var2, String str2) {
                r2 = cl0Var2;
                r3 = str2;
            }

            @Override // com.google.android.gms.internal.ads.ju2
            public final Object zza(Object obj) {
                n22.this.m24802i((SQLiteDatabase) obj, r2, r3);
                return null;
            }
        });
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE offline_buffered_pings (timestamp INTEGER PRIMARY_KEY, gws_query_id TEXT, url TEXT, event_state INTEGER)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i11, int i12) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i11, int i12) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }
}
