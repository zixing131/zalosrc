package p228i4;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import om0.InterfaceC24312a;
import p010a4.AbstractC0116i;
import p010a4.AbstractC0123p;
import p010a4.C0115h;
import p091d4.C17730a;
import p091d4.C17731b;
import p091d4.C17732c;
import p091d4.C17733d;
import p091d4.C17734e;
import p091d4.C17735f;
import p121e4.AbstractC18197a;
import p255j4.InterfaceC20913a;
import p288k4.InterfaceC21460a;
import p314l4.AbstractC22060a;
import p668y3.C30276b;
import p668y3.EnumC30278d;

/* renamed from: i4.m0 */
/* loaded from: classes.dex */
public class C20249m0 implements InterfaceC20230d, InterfaceC20913a, InterfaceC20228c {

    /* renamed from: u */
    private static final C30276b f100126u = C30276b.m149414b("proto");

    /* renamed from: p */
    private final C20263t0 f100127p;

    /* renamed from: q */
    private final InterfaceC21460a f100128q;

    /* renamed from: r */
    private final InterfaceC21460a f100129r;

    /* renamed from: s */
    private final AbstractC20232e f100130s;

    /* renamed from: t */
    private final InterfaceC24312a f100131t;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i4.m0$b */
    /* loaded from: classes.dex */
    public interface b {
        Object apply(Object obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i4.m0$c */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a */
        final String f100132a;

        /* renamed from: b */
        final String f100133b;

        private c(String str, String str2) {
            this.f100132a = str;
            this.f100133b = str2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i4.m0$d */
    /* loaded from: classes.dex */
    public interface d {
        /* renamed from: a */
        Object mo105737a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C20249m0(InterfaceC21460a interfaceC21460a, InterfaceC21460a interfaceC21460a2, AbstractC20232e abstractC20232e, C20263t0 c20263t0, InterfaceC24312a interfaceC24312a) {
        this.f100127p = c20263t0;
        this.f100128q = interfaceC21460a;
        this.f100129r = interfaceC21460a2;
        this.f100130s = abstractC20232e;
        this.f100131t = interfaceC24312a;
    }

    /* renamed from: D0 */
    private boolean m105751D0() {
        if (m105811r0() * m105813s0() >= this.f100130s.mo105706f()) {
            return true;
        }
        return false;
    }

    /* renamed from: E0 */
    private List m105753E0(List list, Map map) {
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            AbstractC20244k abstractC20244k = (AbstractC20244k) listIterator.next();
            if (map.containsKey(Long.valueOf(abstractC20244k.mo105714c()))) {
                AbstractC0116i.a m536l = abstractC20244k.mo105713b().m536l();
                for (c cVar : (Set) map.get(Long.valueOf(abstractC20244k.mo105714c()))) {
                    m536l.m539c(cVar.f100132a, cVar.f100133b);
                }
                listIterator.set(AbstractC20244k.m105749a(abstractC20244k.mo105714c(), abstractC20244k.mo105715d(), m536l.mo494d()));
            }
        }
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F0 */
    public /* synthetic */ Object m105755F0(Cursor cursor) {
        while (cursor.moveToNext()) {
            mo105717b(cursor.getInt(0), C17732c.b.MESSAGE_TOO_OLD, cursor.getString(1));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: G0 */
    public /* synthetic */ Integer m105757G0(long j11, SQLiteDatabase sQLiteDatabase) {
        String[] strArr = {String.valueOf(j11)};
        m105806m1(sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new b() { // from class: i4.r
            @Override // p228i4.C20249m0.b
            public final Object apply(Object obj) {
                Object m105755F0;
                m105755F0 = C20249m0.this.m105755F0((Cursor) obj);
                return m105755F0;
            }
        });
        return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", strArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: H0 */
    public static /* synthetic */ Object m105758H0(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.beginTransaction();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: I0 */
    public static /* synthetic */ Object m105759I0(Throwable th2) {
        throw new SynchronizationException("Timed out while trying to acquire the lock.", th2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J0 */
    public static /* synthetic */ SQLiteDatabase m105761J0(Throwable th2) {
        throw new SynchronizationException("Timed out while trying to open db.", th2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K0 */
    public static /* synthetic */ Long m105763K0(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L0 */
    public static /* synthetic */ C17735f m105765L0(long j11, Cursor cursor) {
        cursor.moveToNext();
        return C17735f.m93882c().m93887c(cursor.getLong(0)).m93886b(j11).m93885a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M0 */
    public static /* synthetic */ C17735f m105767M0(final long j11, SQLiteDatabase sQLiteDatabase) {
        return (C17735f) m105806m1(sQLiteDatabase.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new b() { // from class: i4.d0
            @Override // p228i4.C20249m0.b
            public final Object apply(Object obj) {
                C17735f m105765L0;
                m105765L0 = C20249m0.m105765L0(j11, (Cursor) obj);
                return m105765L0;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N0 */
    public static /* synthetic */ Long m105769N0(Cursor cursor) {
        if (!cursor.moveToNext()) {
            return null;
        }
        return Long.valueOf(cursor.getLong(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O0 */
    public /* synthetic */ Boolean m105771O0(AbstractC0123p abstractC0123p, SQLiteDatabase sQLiteDatabase) {
        Long m105818y0 = m105818y0(sQLiteDatabase, abstractC0123p);
        if (m105818y0 == null) {
            return Boolean.FALSE;
        }
        return (Boolean) m105806m1(m105821i0().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{m105818y0.toString()}), new b() { // from class: i4.y
            @Override // p228i4.C20249m0.b
            public final Object apply(Object obj) {
                return Boolean.valueOf(((Cursor) obj).moveToNext());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P0 */
    public static /* synthetic */ List m105773P0(SQLiteDatabase sQLiteDatabase) {
        return (List) m105806m1(sQLiteDatabase.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new b() { // from class: i4.j0
            @Override // p228i4.C20249m0.b
            public final Object apply(Object obj) {
                List m105775Q0;
                m105775Q0 = C20249m0.m105775Q0((Cursor) obj);
                return m105775Q0;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Q0 */
    public static /* synthetic */ List m105775Q0(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            arrayList.add(AbstractC0123p.m549a().mo517b(cursor.getString(1)).mo519d(AbstractC22060a.m115181b(cursor.getInt(2))).mo518c(m105798g1(cursor.getString(3))).mo516a());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: R0 */
    public /* synthetic */ List m105777R0(AbstractC0123p abstractC0123p, SQLiteDatabase sQLiteDatabase) {
        List m105794e1 = m105794e1(sQLiteDatabase, abstractC0123p, this.f100130s.mo105704d());
        for (EnumC30278d enumC30278d : EnumC30278d.values()) {
            if (enumC30278d != abstractC0123p.mo515d()) {
                int mo105704d = this.f100130s.mo105704d() - m105794e1.size();
                if (mo105704d <= 0) {
                    break;
                }
                m105794e1.addAll(m105794e1(sQLiteDatabase, abstractC0123p.m551f(enumC30278d), mo105704d));
            }
        }
        return m105753E0(m105794e1, m105797f1(sQLiteDatabase, m105794e1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: S0 */
    public /* synthetic */ C17730a m105778S0(Map map, C17730a.a aVar, Cursor cursor) {
        while (cursor.moveToNext()) {
            String string = cursor.getString(0);
            C17732c.b m105790c0 = m105790c0(cursor.getInt(1));
            long j11 = cursor.getLong(2);
            if (!map.containsKey(string)) {
                map.put(string, new ArrayList());
            }
            ((List) map.get(string)).add(C17732c.m93863c().m93868c(m105790c0).m93867b(j11).m93866a());
        }
        m105800h1(aVar, map);
        aVar.m93858e(m105816w0());
        aVar.m93857d(m105808o0());
        aVar.m93856c((String) this.f100131t.get());
        return aVar.m93855b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: T0 */
    public /* synthetic */ C17730a m105780T0(String str, final Map map, final C17730a.a aVar, SQLiteDatabase sQLiteDatabase) {
        return (C17730a) m105806m1(sQLiteDatabase.rawQuery(str, new String[0]), new b() { // from class: i4.b0
            @Override // p228i4.C20249m0.b
            public final Object apply(Object obj) {
                C17730a m105778S0;
                m105778S0 = C20249m0.this.m105778S0(map, aVar, (Cursor) obj);
                return m105778S0;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: U0 */
    public /* synthetic */ Object m105781U0(List list, AbstractC0123p abstractC0123p, Cursor cursor) {
        while (cursor.moveToNext()) {
            boolean z11 = false;
            long j11 = cursor.getLong(0);
            if (cursor.getInt(7) != 0) {
                z11 = true;
            }
            AbstractC0116i.a mo501k = AbstractC0116i.m531a().mo500j(cursor.getString(1)).mo499i(cursor.getLong(2)).mo501k(cursor.getLong(3));
            if (z11) {
                mo501k.mo498h(new C0115h(m105804k1(cursor.getString(4)), cursor.getBlob(5)));
            } else {
                mo501k.mo498h(new C0115h(m105804k1(cursor.getString(4)), m105802i1(j11)));
            }
            if (!cursor.isNull(6)) {
                mo501k.mo497g(Integer.valueOf(cursor.getInt(6)));
            }
            list.add(AbstractC20244k.m105749a(j11, abstractC0123p, mo501k.mo494d()));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: V0 */
    public static /* synthetic */ Object m105782V0(Map map, Cursor cursor) {
        while (true) {
            if (!cursor.moveToNext()) {
                return null;
            }
            long j11 = cursor.getLong(0);
            Set set = (Set) map.get(Long.valueOf(j11));
            if (set == null) {
                set = new HashSet();
                map.put(Long.valueOf(j11), set);
            }
            set.add(new c(cursor.getString(1), cursor.getString(2)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: W0 */
    public /* synthetic */ Long m105783W0(AbstractC0116i abstractC0116i, AbstractC0123p abstractC0123p, SQLiteDatabase sQLiteDatabase) {
        boolean z11;
        byte[] bArr;
        if (m105751D0()) {
            mo105717b(1L, C17732c.b.CACHE_FULL, abstractC0116i.mo492j());
            return -1L;
        }
        long m105796f0 = m105796f0(sQLiteDatabase, abstractC0123p);
        int mo105705e = this.f100130s.mo105705e();
        byte[] m529a = abstractC0116i.mo490e().m529a();
        if (m529a.length <= mo105705e) {
            z11 = true;
        } else {
            z11 = false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("context_id", Long.valueOf(m105796f0));
        contentValues.put("transport_name", abstractC0116i.mo492j());
        contentValues.put("timestamp_ms", Long.valueOf(abstractC0116i.mo491f()));
        contentValues.put("uptime_ms", Long.valueOf(abstractC0116i.mo493k()));
        contentValues.put("payload_encoding", abstractC0116i.mo490e().m530b().m149415a());
        contentValues.put("code", abstractC0116i.mo489d());
        contentValues.put("num_attempts", (Integer) 0);
        contentValues.put("inline", Boolean.valueOf(z11));
        if (z11) {
            bArr = m529a;
        } else {
            bArr = new byte[0];
        }
        contentValues.put("payload", bArr);
        long insert = sQLiteDatabase.insert("events", null, contentValues);
        if (!z11) {
            int ceil = (int) Math.ceil(m529a.length / mo105705e);
            for (int i11 = 1; i11 <= ceil; i11++) {
                byte[] copyOfRange = Arrays.copyOfRange(m529a, (i11 - 1) * mo105705e, Math.min(i11 * mo105705e, m529a.length));
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("event_id", Long.valueOf(insert));
                contentValues2.put("sequence_num", Integer.valueOf(i11));
                contentValues2.put(ZMediaPlayer.OnNativeInvokeListener.ARG_BYTES, copyOfRange);
                sQLiteDatabase.insert("event_payloads", null, contentValues2);
            }
        }
        for (Map.Entry entry : abstractC0116i.m535i().entrySet()) {
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("event_id", Long.valueOf(insert));
            contentValues3.put("name", (String) entry.getKey());
            contentValues3.put("value", (String) entry.getValue());
            sQLiteDatabase.insert("event_metadata", null, contentValues3);
        }
        return Long.valueOf(insert);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: X0 */
    public static /* synthetic */ byte[] m105784X0(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        while (cursor.moveToNext()) {
            byte[] blob = cursor.getBlob(0);
            arrayList.add(blob);
            i11 += blob.length;
        }
        byte[] bArr = new byte[i11];
        int i12 = 0;
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            byte[] bArr2 = (byte[]) arrayList.get(i13);
            System.arraycopy(bArr2, 0, bArr, i12, bArr2.length);
            i12 += bArr2.length;
        }
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Y0 */
    public /* synthetic */ Object m105785Y0(Cursor cursor) {
        while (cursor.moveToNext()) {
            mo105717b(cursor.getInt(0), C17732c.b.MAX_RETRIES_REACHED, cursor.getString(1));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Z0 */
    public /* synthetic */ Object m105787Z0(String str, String str2, SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement(str).execute();
        m105806m1(sQLiteDatabase.rawQuery(str2, null), new b() { // from class: i4.v
            @Override // p228i4.C20249m0.b
            public final Object apply(Object obj) {
                Object m105785Y0;
                m105785Y0 = C20249m0.this.m105785Y0((Cursor) obj);
                return m105785Y0;
            }
        });
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a1 */
    public static /* synthetic */ Boolean m105788a1(Cursor cursor) {
        boolean z11;
        if (cursor.getCount() > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        return Boolean.valueOf(z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b1 */
    public static /* synthetic */ Object m105789b1(String str, C17732c.b bVar, long j11, SQLiteDatabase sQLiteDatabase) {
        if (!((Boolean) m105806m1(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.mo93869a())}), new b() { // from class: i4.u
            @Override // p228i4.C20249m0.b
            public final Object apply(Object obj) {
                Boolean m105788a1;
                m105788a1 = C20249m0.m105788a1((Cursor) obj);
                return m105788a1;
            }
        })).booleanValue()) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(bVar.mo93869a()));
            contentValues.put("events_dropped_count", Long.valueOf(j11));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
        } else {
            sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j11 + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.mo93869a())});
        }
        return null;
    }

    /* renamed from: c0 */
    private C17732c.b m105790c0(int i11) {
        C17732c.b bVar = C17732c.b.REASON_UNKNOWN;
        if (i11 == bVar.mo93869a()) {
            return bVar;
        }
        C17732c.b bVar2 = C17732c.b.MESSAGE_TOO_OLD;
        if (i11 == bVar2.mo93869a()) {
            return bVar2;
        }
        C17732c.b bVar3 = C17732c.b.CACHE_FULL;
        if (i11 == bVar3.mo93869a()) {
            return bVar3;
        }
        C17732c.b bVar4 = C17732c.b.PAYLOAD_TOO_BIG;
        if (i11 == bVar4.mo93869a()) {
            return bVar4;
        }
        C17732c.b bVar5 = C17732c.b.MAX_RETRIES_REACHED;
        if (i11 == bVar5.mo93869a()) {
            return bVar5;
        }
        C17732c.b bVar6 = C17732c.b.INVALID_PAYLOD;
        if (i11 == bVar6.mo93869a()) {
            return bVar6;
        }
        C17732c.b bVar7 = C17732c.b.SERVER_ERROR;
        if (i11 == bVar7.mo93869a()) {
            return bVar7;
        }
        AbstractC18197a.m96964b("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i11));
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c1 */
    public static /* synthetic */ Object m105791c1(long j11, AbstractC0123p abstractC0123p, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j11));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{abstractC0123p.mo513b(), String.valueOf(AbstractC22060a.m115180a(abstractC0123p.mo515d()))}) < 1) {
            contentValues.put("backend_name", abstractC0123p.mo513b());
            contentValues.put("priority", Integer.valueOf(AbstractC22060a.m115180a(abstractC0123p.mo515d())));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    /* renamed from: d0 */
    private void m105792d0(final SQLiteDatabase sQLiteDatabase) {
        m105803j1(new d() { // from class: i4.g0
            @Override // p228i4.C20249m0.d
            /* renamed from: a */
            public final Object mo105737a() {
                Object m105758H0;
                m105758H0 = C20249m0.m105758H0(sQLiteDatabase);
                return m105758H0;
            }
        }, new b() { // from class: i4.h0
            @Override // p228i4.C20249m0.b
            public final Object apply(Object obj) {
                Object m105759I0;
                m105759I0 = C20249m0.m105759I0((Throwable) obj);
                return m105759I0;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d1 */
    public /* synthetic */ Object m105793d1(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
        sQLiteDatabase.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + this.f100128q.mo111045a()).execute();
        return null;
    }

    /* renamed from: e1 */
    private List m105794e1(SQLiteDatabase sQLiteDatabase, final AbstractC0123p abstractC0123p, int i11) {
        final ArrayList arrayList = new ArrayList();
        Long m105818y0 = m105818y0(sQLiteDatabase, abstractC0123p);
        if (m105818y0 == null) {
            return arrayList;
        }
        m105806m1(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{m105818y0.toString()}, null, null, null, String.valueOf(i11)), new b() { // from class: i4.x
            @Override // p228i4.C20249m0.b
            public final Object apply(Object obj) {
                Object m105781U0;
                m105781U0 = C20249m0.this.m105781U0(arrayList, abstractC0123p, (Cursor) obj);
                return m105781U0;
            }
        });
        return arrayList;
    }

    /* renamed from: f0 */
    private long m105796f0(SQLiteDatabase sQLiteDatabase, AbstractC0123p abstractC0123p) {
        Long m105818y0 = m105818y0(sQLiteDatabase, abstractC0123p);
        if (m105818y0 != null) {
            return m105818y0.longValue();
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("backend_name", abstractC0123p.mo513b());
        contentValues.put("priority", Integer.valueOf(AbstractC22060a.m115180a(abstractC0123p.mo515d())));
        contentValues.put("next_request_ms", (Integer) 0);
        if (abstractC0123p.mo514c() != null) {
            contentValues.put("extras", Base64.encodeToString(abstractC0123p.mo514c(), 0));
        }
        return sQLiteDatabase.insert("transport_contexts", null, contentValues);
    }

    /* renamed from: f1 */
    private Map m105797f1(SQLiteDatabase sQLiteDatabase, List list) {
        final HashMap hashMap = new HashMap();
        StringBuilder sb2 = new StringBuilder("event_id IN (");
        for (int i11 = 0; i11 < list.size(); i11++) {
            sb2.append(((AbstractC20244k) list.get(i11)).mo105714c());
            if (i11 < list.size() - 1) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        m105806m1(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb2.toString(), null, null, null, null), new b() { // from class: i4.s
            @Override // p228i4.C20249m0.b
            public final Object apply(Object obj) {
                Object m105782V0;
                m105782V0 = C20249m0.m105782V0(hashMap, (Cursor) obj);
                return m105782V0;
            }
        });
        return hashMap;
    }

    /* renamed from: g1 */
    private static byte[] m105798g1(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    /* renamed from: h1 */
    private void m105800h1(C17730a.a aVar, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            aVar.m93854a(C17733d.m93870c().m93875c((String) entry.getKey()).m93874b((List) entry.getValue()).m93873a());
        }
    }

    /* renamed from: i1 */
    private byte[] m105802i1(long j11) {
        return (byte[]) m105806m1(m105821i0().query("event_payloads", new String[]{ZMediaPlayer.OnNativeInvokeListener.ARG_BYTES}, "event_id = ?", new String[]{String.valueOf(j11)}, null, null, "sequence_num"), new b() { // from class: i4.a0
            @Override // p228i4.C20249m0.b
            public final Object apply(Object obj) {
                byte[] m105784X0;
                m105784X0 = C20249m0.m105784X0((Cursor) obj);
                return m105784X0;
            }
        });
    }

    /* renamed from: j1 */
    private Object m105803j1(d dVar, b bVar) {
        long mo111045a = this.f100129r.mo111045a();
        while (true) {
            try {
                return dVar.mo105737a();
            } catch (SQLiteDatabaseLockedException e11) {
                if (this.f100129r.mo111045a() >= this.f100130s.mo105702b() + mo111045a) {
                    return bVar.apply(e11);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    /* renamed from: k1 */
    private static C30276b m105804k1(String str) {
        if (str == null) {
            return f100126u;
        }
        return C30276b.m149414b(str);
    }

    /* renamed from: l1 */
    private static String m105805l1(Iterable iterable) {
        StringBuilder sb2 = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb2.append(((AbstractC20244k) it.next()).mo105714c());
            if (it.hasNext()) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        return sb2.toString();
    }

    /* renamed from: m1 */
    static Object m105806m1(Cursor cursor, b bVar) {
        try {
            return bVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    /* renamed from: o0 */
    private C17731b m105808o0() {
        return C17731b.m93859b().m93862b(C17734e.m93876c().m93880b(m105820g0()).m93881c(AbstractC20232e.f100110a.mo105706f()).m93879a()).m93861a();
    }

    /* renamed from: r0 */
    private long m105811r0() {
        return m105821i0().compileStatement("PRAGMA page_count").simpleQueryForLong();
    }

    /* renamed from: s0 */
    private long m105813s0() {
        return m105821i0().compileStatement("PRAGMA page_size").simpleQueryForLong();
    }

    /* renamed from: w0 */
    private C17735f m105816w0() {
        final long mo111045a = this.f100128q.mo111045a();
        return (C17735f) m105822z0(new b() { // from class: i4.c0
            @Override // p228i4.C20249m0.b
            public final Object apply(Object obj) {
                C17735f m105767M0;
                m105767M0 = C20249m0.m105767M0(mo111045a, (SQLiteDatabase) obj);
                return m105767M0;
            }
        });
    }

    /* renamed from: y0 */
    private Long m105818y0(SQLiteDatabase sQLiteDatabase, AbstractC0123p abstractC0123p) {
        StringBuilder sb2 = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(abstractC0123p.mo513b(), String.valueOf(AbstractC22060a.m115180a(abstractC0123p.mo515d()))));
        if (abstractC0123p.mo514c() != null) {
            sb2.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(abstractC0123p.mo514c(), 0));
        } else {
            sb2.append(" and extras is null");
        }
        return (Long) m105806m1(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb2.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null), new b() { // from class: i4.z
            @Override // p228i4.C20249m0.b
            public final Object apply(Object obj) {
                Long m105769N0;
                m105769N0 = C20249m0.m105769N0((Cursor) obj);
                return m105769N0;
            }
        });
    }

    @Override // p228i4.InterfaceC20230d
    /* renamed from: I */
    public void mo105719I(final AbstractC0123p abstractC0123p, final long j11) {
        m105822z0(new b() { // from class: i4.n
            @Override // p228i4.C20249m0.b
            public final Object apply(Object obj) {
                Object m105791c1;
                m105791c1 = C20249m0.m105791c1(j11, abstractC0123p, (SQLiteDatabase) obj);
                return m105791c1;
            }
        });
    }

    @Override // p228i4.InterfaceC20230d
    /* renamed from: S */
    public void mo105720S(Iterable iterable) {
        if (!iterable.iterator().hasNext()) {
            return;
        }
        final String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + m105805l1(iterable);
        final String str2 = "SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name";
        m105822z0(new b() { // from class: i4.q
            @Override // p228i4.C20249m0.b
            public final Object apply(Object obj) {
                Object m105787Z0;
                m105787Z0 = C20249m0.this.m105787Z0(str, str2, (SQLiteDatabase) obj);
                return m105787Z0;
            }
        });
    }

    @Override // p228i4.InterfaceC20230d
    /* renamed from: V */
    public Iterable mo105721V(final AbstractC0123p abstractC0123p) {
        return (Iterable) m105822z0(new b() { // from class: i4.p
            @Override // p228i4.C20249m0.b
            public final Object apply(Object obj) {
                List m105777R0;
                m105777R0 = C20249m0.this.m105777R0(abstractC0123p, (SQLiteDatabase) obj);
                return m105777R0;
            }
        });
    }

    @Override // p228i4.InterfaceC20228c
    /* renamed from: a */
    public void mo105716a() {
        m105822z0(new b() { // from class: i4.o
            @Override // p228i4.C20249m0.b
            public final Object apply(Object obj) {
                Object m105793d1;
                m105793d1 = C20249m0.this.m105793d1((SQLiteDatabase) obj);
                return m105793d1;
            }
        });
    }

    @Override // p228i4.InterfaceC20228c
    /* renamed from: b */
    public void mo105717b(final long j11, final C17732c.b bVar, final String str) {
        m105822z0(new b() { // from class: i4.m
            @Override // p228i4.C20249m0.b
            public final Object apply(Object obj) {
                Object m105789b1;
                m105789b1 = C20249m0.m105789b1(str, bVar, j11, (SQLiteDatabase) obj);
                return m105789b1;
            }
        });
    }

    @Override // p228i4.InterfaceC20228c
    /* renamed from: c */
    public C17730a mo105718c() {
        final C17730a.a m93848e = C17730a.m93848e();
        final HashMap hashMap = new HashMap();
        final String str = "SELECT log_source, reason, events_dropped_count FROM log_event_dropped";
        return (C17730a) m105822z0(new b() { // from class: i4.t
            @Override // p228i4.C20249m0.b
            public final Object apply(Object obj) {
                C17730a m105780T0;
                m105780T0 = C20249m0.this.m105780T0(str, hashMap, m93848e, (SQLiteDatabase) obj);
                return m105780T0;
            }
        });
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f100127p.close();
    }

    @Override // p255j4.InterfaceC20913a
    /* renamed from: d */
    public Object mo105819d(InterfaceC20913a.a aVar) {
        SQLiteDatabase m105821i0 = m105821i0();
        m105792d0(m105821i0);
        try {
            Object mo100860d = aVar.mo100860d();
            m105821i0.setTransactionSuccessful();
            return mo100860d;
        } finally {
            m105821i0.endTransaction();
        }
    }

    /* renamed from: g0 */
    long m105820g0() {
        return m105811r0() * m105813s0();
    }

    @Override // p228i4.InterfaceC20230d
    /* renamed from: h0 */
    public AbstractC20244k mo105722h0(final AbstractC0123p abstractC0123p, final AbstractC0116i abstractC0116i) {
        AbstractC18197a.m96965c("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", abstractC0123p.mo515d(), abstractC0116i.mo492j(), abstractC0123p.mo513b());
        long longValue = ((Long) m105822z0(new b() { // from class: i4.l0
            @Override // p228i4.C20249m0.b
            public final Object apply(Object obj) {
                Long m105783W0;
                m105783W0 = C20249m0.this.m105783W0(abstractC0116i, abstractC0123p, (SQLiteDatabase) obj);
                return m105783W0;
            }
        })).longValue();
        if (longValue < 1) {
            return null;
        }
        return AbstractC20244k.m105749a(longValue, abstractC0123p, abstractC0116i);
    }

    /* renamed from: i0 */
    SQLiteDatabase m105821i0() {
        final C20263t0 c20263t0 = this.f100127p;
        Objects.requireNonNull(c20263t0);
        return (SQLiteDatabase) m105803j1(new d() { // from class: i4.w
            @Override // p228i4.C20249m0.d
            /* renamed from: a */
            public final Object mo105737a() {
                return C20263t0.this.getWritableDatabase();
            }
        }, new b() { // from class: i4.e0
            @Override // p228i4.C20249m0.b
            public final Object apply(Object obj) {
                SQLiteDatabase m105761J0;
                m105761J0 = C20249m0.m105761J0((Throwable) obj);
                return m105761J0;
            }
        });
    }

    @Override // p228i4.InterfaceC20230d
    /* renamed from: j0 */
    public boolean mo105723j0(final AbstractC0123p abstractC0123p) {
        return ((Boolean) m105822z0(new b() { // from class: i4.k0
            @Override // p228i4.C20249m0.b
            public final Object apply(Object obj) {
                Boolean m105771O0;
                m105771O0 = C20249m0.this.m105771O0(abstractC0123p, (SQLiteDatabase) obj);
                return m105771O0;
            }
        })).booleanValue();
    }

    @Override // p228i4.InterfaceC20230d
    /* renamed from: k0 */
    public long mo105724k0(AbstractC0123p abstractC0123p) {
        return ((Long) m105806m1(m105821i0().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{abstractC0123p.mo513b(), String.valueOf(AbstractC22060a.m115180a(abstractC0123p.mo515d()))}), new b() { // from class: i4.f0
            @Override // p228i4.C20249m0.b
            public final Object apply(Object obj) {
                Long m105763K0;
                m105763K0 = C20249m0.m105763K0((Cursor) obj);
                return m105763K0;
            }
        })).longValue();
    }

    @Override // p228i4.InterfaceC20230d
    /* renamed from: n */
    public int mo105725n() {
        final long mo111045a = this.f100128q.mo111045a() - this.f100130s.mo105703c();
        return ((Integer) m105822z0(new b() { // from class: i4.i0
            @Override // p228i4.C20249m0.b
            public final Object apply(Object obj) {
                Integer m105757G0;
                m105757G0 = C20249m0.this.m105757G0(mo111045a, (SQLiteDatabase) obj);
                return m105757G0;
            }
        })).intValue();
    }

    @Override // p228i4.InterfaceC20230d
    /* renamed from: p */
    public void mo105726p(Iterable iterable) {
        if (!iterable.iterator().hasNext()) {
            return;
        }
        m105821i0().compileStatement("DELETE FROM events WHERE _id in " + m105805l1(iterable)).execute();
    }

    @Override // p228i4.InterfaceC20230d
    /* renamed from: z */
    public Iterable mo105727z() {
        return (Iterable) m105822z0(new b() { // from class: i4.l
            @Override // p228i4.C20249m0.b
            public final Object apply(Object obj) {
                List m105773P0;
                m105773P0 = C20249m0.m105773P0((SQLiteDatabase) obj);
                return m105773P0;
            }
        });
    }

    /* renamed from: z0 */
    Object m105822z0(b bVar) {
        SQLiteDatabase m105821i0 = m105821i0();
        m105821i0.beginTransaction();
        try {
            Object apply = bVar.apply(m105821i0);
            m105821i0.setTransactionSuccessful();
            return apply;
        } finally {
            m105821i0.endTransaction();
        }
    }
}
