package aj0;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.android.billingclient.api.C3878a;
import com.android.billingclient.api.C3940r;
import com.zing.zalo.ziap.data.p080db.ZIAPDatabase;
import dj0.InterfaceC18016a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.coroutines.Continuation;
import lj0.C22501b;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29096d;

/* renamed from: aj0.d */
/* loaded from: classes7.dex */
public final class C0881d {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final C22501b f3317a;

    /* renamed from: aj0.d$a */
    /* loaded from: classes7.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: aj0.d$b */
    /* loaded from: classes7.dex */
    public static final class b extends AbstractC29096d {

        /* renamed from: A */
        int f3318A;

        /* renamed from: s */
        Object f3319s;

        /* renamed from: t */
        Object f3320t;

        /* renamed from: u */
        Object f3321u;

        /* renamed from: v */
        Object f3322v;

        /* renamed from: w */
        Object f3323w;

        /* renamed from: x */
        Object f3324x;

        /* renamed from: y */
        /* synthetic */ Object f3325y;

        b(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f3325y = obj;
            this.f3318A |= Integer.MIN_VALUE;
            return C0881d.this.m2711b(null, null, null, this);
        }
    }

    public C0881d(C22501b c22501b) {
        AbstractC19074t.m100208f(c22501b, "iapLogger");
        this.f3317a = c22501b;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0165 A[Catch: Exception -> 0x0169, TryCatch #1 {Exception -> 0x0169, blocks: (B:63:0x015f, B:65:0x0165, B:67:0x016d), top: B:62:0x015f }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x016d A[Catch: Exception -> 0x0169, TRY_LEAVE, TryCatch #1 {Exception -> 0x0169, blocks: (B:63:0x015f, B:65:0x0165, B:67:0x016d), top: B:62:0x015f }] */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2710a(AbstractC0878a abstractC0878a, SQLiteDatabase sQLiteDatabase) {
        Throwable th2;
        Cursor cursor;
        String string;
        String str;
        String string2;
        String str2;
        String string3;
        String str3;
        AbstractC19074t.m100208f(abstractC0878a, "billingDao");
        AbstractC19074t.m100208f(sQLiteDatabase, "zaloDb");
        String format = String.format(Locale.US, "select * from %s", Arrays.copyOf(new Object[]{"play_billing"}, 1));
        AbstractC19074t.m100207e(format, "format(locale, this, *args)");
        ArrayList arrayList = new ArrayList();
        this.f3317a.m116345w("Start migrate from zaloDb", new Object[0]);
        try {
            try {
                sQLiteDatabase.beginTransaction();
                Cursor rawQuery = sQLiteDatabase.rawQuery(format, new String[0]);
                if (rawQuery != null) {
                    try {
                        if (rawQuery.getCount() > 0) {
                            int columnIndex = rawQuery.getColumnIndex("tranx_id");
                            int columnIndex2 = rawQuery.getColumnIndex("sku_id");
                            int columnIndex3 = rawQuery.getColumnIndex("purchase_data");
                            int columnIndex4 = rawQuery.getColumnIndex("purchase_token");
                            int columnIndex5 = rawQuery.getColumnIndex("purchase_sig");
                            int columnIndex6 = rawQuery.getColumnIndex("tranxid_request_time");
                            int columnIndex7 = rawQuery.getColumnIndex("verification_url");
                            int columnIndex8 = rawQuery.getColumnIndex("is_already_submit_to_server");
                            while (rawQuery.moveToNext()) {
                                String string4 = rawQuery.getString(columnIndex);
                                AbstractC19074t.m100207e(string4, "cursor.getString(colTranxId)");
                                String string5 = rawQuery.getString(columnIndex2);
                                int i11 = columnIndex;
                                AbstractC19074t.m100207e(string5, "cursor.getString(colSkuId)");
                                if (rawQuery.isNull(columnIndex3)) {
                                    string = null;
                                } else {
                                    string = rawQuery.getString(columnIndex3);
                                }
                                if (string == null) {
                                    str = "";
                                } else {
                                    str = string;
                                }
                                if (rawQuery.isNull(columnIndex4)) {
                                    string2 = null;
                                } else {
                                    string2 = rawQuery.getString(columnIndex4);
                                }
                                if (string2 == null) {
                                    str2 = "";
                                } else {
                                    str2 = string2;
                                }
                                if (rawQuery.isNull(columnIndex5)) {
                                    string3 = null;
                                } else {
                                    string3 = rawQuery.getString(columnIndex5);
                                }
                                if (string3 == null) {
                                    str3 = "";
                                } else {
                                    str3 = string3;
                                }
                                long j11 = rawQuery.getLong(columnIndex6);
                                String string6 = rawQuery.getString(columnIndex7);
                                AbstractC19074t.m100207e(string6, "cursor.getString(colVerifyUrl)");
                                arrayList.add(new C0880c(0, string4, string5, str, str2, str3, j11, string6, rawQuery.getInt(columnIndex8), null, null, null, 3585, null));
                                columnIndex = i11;
                                columnIndex2 = columnIndex2;
                            }
                            sQLiteDatabase.execSQL("delete from play_billing");
                            sQLiteDatabase.execSQL("drop table if exists play_billing");
                            sQLiteDatabase.setTransactionSuccessful();
                        }
                    } catch (Exception e11) {
                        e = e11;
                        cursor = rawQuery;
                        try {
                            this.f3317a.mo104552e(e);
                            if (sQLiteDatabase.isOpen()) {
                                sQLiteDatabase.endTransaction();
                            }
                            if (cursor != null) {
                                cursor.close();
                            }
                            if (!arrayList.isEmpty()) {
                            }
                            this.f3317a.m116345w("Migrate done.", new Object[0]);
                        } catch (Throwable th3) {
                            th2 = th3;
                            try {
                                if (sQLiteDatabase.isOpen()) {
                                    sQLiteDatabase.endTransaction();
                                }
                                if (cursor == null) {
                                    cursor.close();
                                    throw th2;
                                }
                                throw th2;
                            } catch (Exception e12) {
                                e12.printStackTrace();
                                throw th2;
                            }
                        }
                    } catch (Throwable th4) {
                        th2 = th4;
                        cursor = rawQuery;
                        if (sQLiteDatabase.isOpen()) {
                        }
                        if (cursor == null) {
                        }
                    }
                }
                if (sQLiteDatabase.isOpen()) {
                    sQLiteDatabase.endTransaction();
                }
                if (rawQuery != null) {
                    rawQuery.close();
                }
            } catch (Exception e13) {
                e = e13;
                cursor = null;
            } catch (Throwable th5) {
                th2 = th5;
                cursor = null;
            }
        } catch (Exception e14) {
            e14.printStackTrace();
        }
        if (!arrayList.isEmpty()) {
            abstractC0878a.mo2669i(arrayList);
        }
        this.f3317a.m116345w("Migrate done.", new Object[0]);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00b1 -> B:10:0x00b5). Please report as a decompilation issue!!! */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m2711b(ZIAPDatabase zIAPDatabase, List list, InterfaceC18016a interfaceC18016a, Continuation continuation) {
        b bVar;
        Object m142578e;
        int i11;
        C0881d c0881d;
        AbstractC0878a mo91399I;
        InterfaceC18016a interfaceC18016a2;
        Iterator it;
        String str;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i12 = bVar.f3318A;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                bVar.f3318A = i12 - Integer.MIN_VALUE;
                Object obj = bVar.f3325y;
                m142578e = AbstractC28298d.m142578e();
                i11 = bVar.f3318A;
                if (i11 == 0) {
                    if (i11 == 1) {
                        String str2 = (String) bVar.f3324x;
                        String str3 = (String) bVar.f3323w;
                        it = (Iterator) bVar.f3322v;
                        mo91399I = (AbstractC0878a) bVar.f3321u;
                        InterfaceC18016a interfaceC18016a3 = (InterfaceC18016a) bVar.f3320t;
                        c0881d = (C0881d) bVar.f3319s;
                        AbstractC24862s.m129228b(obj);
                        c0881d.f3317a.m116345w("ZIAPDbMigration: Filled obfuscatedAccountId " + str3 + " to billing item with purchaseToken = " + str2, new Object[0]);
                        interfaceC18016a2 = interfaceC18016a3;
                        while (it.hasNext()) {
                            C3940r c3940r = (C3940r) it.next();
                            C3878a m18686a = c3940r.m18686a();
                            if (m18686a != null) {
                                str = m18686a.m18521a();
                            } else {
                                str = null;
                            }
                            String m18691f = c3940r.m18691f();
                            AbstractC19074t.m100207e(m18691f, "purchase.purchaseToken");
                            if (m18691f.length() != 0 && str != null && str.length() != 0) {
                                String m18691f2 = c3940r.m18691f();
                                AbstractC19074t.m100207e(m18691f2, "purchase.purchaseToken");
                                bVar.f3319s = c0881d;
                                bVar.f3320t = interfaceC18016a2;
                                bVar.f3321u = mo91399I;
                                bVar.f3322v = it;
                                bVar.f3323w = str;
                                bVar.f3324x = m18691f;
                                bVar.f3318A = 1;
                                if (mo91399I.mo2671k(m18691f2, str, bVar) == m142578e) {
                                    return m142578e;
                                }
                                str3 = str;
                                interfaceC18016a3 = interfaceC18016a2;
                                str2 = m18691f;
                                c0881d.f3317a.m116345w("ZIAPDbMigration: Filled obfuscatedAccountId " + str3 + " to billing item with purchaseToken = " + str2, new Object[0]);
                                interfaceC18016a2 = interfaceC18016a3;
                                while (it.hasNext()) {
                                }
                            }
                        }
                        interfaceC18016a2.mo95801a(false);
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
                if (interfaceC18016a != null && interfaceC18016a.mo95802b()) {
                    c0881d = this;
                    mo91399I = zIAPDatabase.mo91399I();
                    interfaceC18016a2 = interfaceC18016a;
                    it = list.iterator();
                    while (it.hasNext()) {
                    }
                    interfaceC18016a2.mo95801a(false);
                    return C24848g0.f119245a;
                }
                return C24848g0.f119245a;
            }
        }
        bVar = new b(continuation);
        Object obj2 = bVar.f3325y;
        m142578e = AbstractC28298d.m142578e();
        i11 = bVar.f3318A;
        if (i11 == 0) {
        }
    }
}
