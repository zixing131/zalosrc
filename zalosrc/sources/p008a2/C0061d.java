package p008a2;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import en0.InterfaceC18505l;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19071q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p119e2.C18178c;
import p119e2.C18180e;
import p119e2.C18181f;
import p119e2.InterfaceC18182g;
import p119e2.InterfaceC18183h;
import p119e2.InterfaceC18185j;
import p119e2.InterfaceC18186k;
import pm0.C24848g0;
import qm0.AbstractC25368s;

/* renamed from: a2.d */
/* loaded from: classes.dex */
public final class C0061d implements InterfaceC18183h, InterfaceC0071i {

    /* renamed from: p */
    private final InterfaceC18183h f231p;

    /* renamed from: q */
    public final C0059c f232q;

    /* renamed from: r */
    private final a f233r;

    /* renamed from: a2.d$a */
    /* loaded from: classes2.dex */
    public static final class a implements InterfaceC18182g {

        /* renamed from: p */
        private final C0059c f234p;

        /* renamed from: a2.d$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        static final class C32610a extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            public static final C32610a f235q = new C32610a();

            C32610a() {
                super(1);
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List mo205i9(InterfaceC18182g interfaceC18182g) {
                AbstractC19074t.m100208f(interfaceC18182g, "obj");
                return interfaceC18182g.mo195g();
            }
        }

        /* renamed from: a2.d$a$b */
        /* loaded from: classes2.dex */
        static final class b extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            final /* synthetic */ String f236q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(String str) {
                super(1);
                this.f236q = str;
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo205i9(InterfaceC18182g interfaceC18182g) {
                AbstractC19074t.m100208f(interfaceC18182g, "db");
                interfaceC18182g.mo201u(this.f236q);
                return null;
            }
        }

        /* renamed from: a2.d$a$c */
        /* loaded from: classes2.dex */
        static final class c extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            final /* synthetic */ String f237q;

            /* renamed from: r */
            final /* synthetic */ Object[] f238r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(String str, Object[] objArr) {
                super(1);
                this.f237q = str;
                this.f238r = objArr;
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo205i9(InterfaceC18182g interfaceC18182g) {
                AbstractC19074t.m100208f(interfaceC18182g, "db");
                interfaceC18182g.mo189C(this.f237q, this.f238r);
                return null;
            }
        }

        /* renamed from: a2.d$a$d */
        /* loaded from: classes2.dex */
        /* synthetic */ class d extends C19071q implements InterfaceC18505l {

            /* renamed from: y */
            public static final d f239y = new d();

            d() {
                super(1, InterfaceC18182g.class, "inTransaction", "inTransaction()Z", 0);
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public final Boolean mo205i9(InterfaceC18182g interfaceC18182g) {
                AbstractC19074t.m100208f(interfaceC18182g, "p0");
                return Boolean.valueOf(interfaceC18182g.mo202v0());
            }
        }

        /* renamed from: a2.d$a$e */
        /* loaded from: classes2.dex */
        static final class e extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            public static final e f240q = new e();

            e() {
                super(1);
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean mo205i9(InterfaceC18182g interfaceC18182g) {
                AbstractC19074t.m100208f(interfaceC18182g, "db");
                return Boolean.valueOf(interfaceC18182g.mo203x0());
            }
        }

        /* renamed from: a2.d$a$f */
        /* loaded from: classes2.dex */
        static final class f extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            public static final f f241q = new f();

            f() {
                super(1);
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String mo205i9(InterfaceC18182g interfaceC18182g) {
                AbstractC19074t.m100208f(interfaceC18182g, "obj");
                return interfaceC18182g.mo198m();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a2.d$a$g */
        /* loaded from: classes2.dex */
        public static final class g extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            public static final g f242q = new g();

            g() {
                super(1);
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo205i9(InterfaceC18182g interfaceC18182g) {
                AbstractC19074t.m100208f(interfaceC18182g, "it");
                return null;
            }
        }

        /* renamed from: a2.d$a$h */
        /* loaded from: classes2.dex */
        static final class h extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            final /* synthetic */ String f243q;

            /* renamed from: r */
            final /* synthetic */ int f244r;

            /* renamed from: s */
            final /* synthetic */ ContentValues f245s;

            /* renamed from: t */
            final /* synthetic */ String f246t;

            /* renamed from: u */
            final /* synthetic */ Object[] f247u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            h(String str, int i11, ContentValues contentValues, String str2, Object[] objArr) {
                super(1);
                this.f243q = str;
                this.f244r = i11;
                this.f245s = contentValues;
                this.f246t = str2;
                this.f247u = objArr;
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Integer mo205i9(InterfaceC18182g interfaceC18182g) {
                AbstractC19074t.m100208f(interfaceC18182g, "db");
                return Integer.valueOf(interfaceC18182g.mo199m0(this.f243q, this.f244r, this.f245s, this.f246t, this.f247u));
            }
        }

        public a(C0059c c0059c) {
            AbstractC19074t.m100208f(c0059c, "autoCloser");
            this.f234p = c0059c;
        }

        @Override // p119e2.InterfaceC18182g
        /* renamed from: B0 */
        public Cursor mo188B0(InterfaceC18185j interfaceC18185j) {
            AbstractC19074t.m100208f(interfaceC18185j, "query");
            try {
                return new c(this.f234p.m172j().mo188B0(interfaceC18185j), this.f234p);
            } catch (Throwable th2) {
                this.f234p.m168e();
                throw th2;
            }
        }

        @Override // p119e2.InterfaceC18182g
        /* renamed from: C */
        public void mo189C(String str, Object[] objArr) {
            AbstractC19074t.m100208f(str, "sql");
            AbstractC19074t.m100208f(objArr, "bindArgs");
            this.f234p.m169g(new c(str, objArr));
        }

        @Override // p119e2.InterfaceC18182g
        /* renamed from: D */
        public void mo190D() {
            try {
                this.f234p.m172j().mo190D();
            } catch (Throwable th2) {
                this.f234p.m168e();
                throw th2;
            }
        }

        @Override // p119e2.InterfaceC18182g
        /* renamed from: H */
        public Cursor mo191H(InterfaceC18185j interfaceC18185j, CancellationSignal cancellationSignal) {
            AbstractC19074t.m100208f(interfaceC18185j, "query");
            try {
                return new c(this.f234p.m172j().mo191H(interfaceC18185j, cancellationSignal), this.f234p);
            } catch (Throwable th2) {
                this.f234p.m168e();
                throw th2;
            }
        }

        /* renamed from: a */
        public final void m192a() {
            this.f234p.m169g(g.f242q);
        }

        @Override // p119e2.InterfaceC18182g
        /* renamed from: b0 */
        public InterfaceC18186k mo193b0(String str) {
            AbstractC19074t.m100208f(str, "sql");
            return new b(str, this.f234p);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f234p.m167d();
        }

        @Override // p119e2.InterfaceC18182g
        /* renamed from: e */
        public void mo194e() {
            try {
                this.f234p.m172j().mo194e();
            } catch (Throwable th2) {
                this.f234p.m168e();
                throw th2;
            }
        }

        @Override // p119e2.InterfaceC18182g
        /* renamed from: g */
        public List mo195g() {
            return (List) this.f234p.m169g(C32610a.f235q);
        }

        @Override // p119e2.InterfaceC18182g
        public boolean isOpen() {
            InterfaceC18182g m170h = this.f234p.m170h();
            if (m170h == null) {
                return false;
            }
            return m170h.isOpen();
        }

        @Override // p119e2.InterfaceC18182g
        /* renamed from: k */
        public void mo196k() {
            C24848g0 c24848g0;
            InterfaceC18182g m170h = this.f234p.m170h();
            if (m170h != null) {
                m170h.mo196k();
                c24848g0 = C24848g0.f119245a;
            } else {
                c24848g0 = null;
            }
            if (c24848g0 != null) {
            } else {
                throw new IllegalStateException("setTransactionSuccessful called but delegateDb is null".toString());
            }
        }

        @Override // p119e2.InterfaceC18182g
        /* renamed from: l */
        public void mo197l() {
            if (this.f234p.m170h() != null) {
                try {
                    InterfaceC18182g m170h = this.f234p.m170h();
                    AbstractC19074t.m100205c(m170h);
                    m170h.mo197l();
                    return;
                } finally {
                    this.f234p.m168e();
                }
            }
            throw new IllegalStateException("End transaction called but delegateDb is null".toString());
        }

        @Override // p119e2.InterfaceC18182g
        /* renamed from: m */
        public String mo198m() {
            return (String) this.f234p.m169g(f.f241q);
        }

        @Override // p119e2.InterfaceC18182g
        /* renamed from: m0 */
        public int mo199m0(String str, int i11, ContentValues contentValues, String str2, Object[] objArr) {
            AbstractC19074t.m100208f(str, "table");
            AbstractC19074t.m100208f(contentValues, "values");
            return ((Number) this.f234p.m169g(new h(str, i11, contentValues, str2, objArr))).intValue();
        }

        @Override // p119e2.InterfaceC18182g
        /* renamed from: q0 */
        public Cursor mo200q0(String str) {
            AbstractC19074t.m100208f(str, "query");
            try {
                return new c(this.f234p.m172j().mo200q0(str), this.f234p);
            } catch (Throwable th2) {
                this.f234p.m168e();
                throw th2;
            }
        }

        @Override // p119e2.InterfaceC18182g
        /* renamed from: u */
        public void mo201u(String str) {
            AbstractC19074t.m100208f(str, "sql");
            this.f234p.m169g(new b(str));
        }

        @Override // p119e2.InterfaceC18182g
        /* renamed from: v0 */
        public boolean mo202v0() {
            if (this.f234p.m170h() == null) {
                return false;
            }
            return ((Boolean) this.f234p.m169g(d.f239y)).booleanValue();
        }

        @Override // p119e2.InterfaceC18182g
        /* renamed from: x0 */
        public boolean mo203x0() {
            return ((Boolean) this.f234p.m169g(e.f240q)).booleanValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a2.d$b */
    /* loaded from: classes2.dex */
    public static final class b implements InterfaceC18186k {

        /* renamed from: p */
        private final String f248p;

        /* renamed from: q */
        private final C0059c f249q;

        /* renamed from: r */
        private final ArrayList f250r;

        /* renamed from: a2.d$b$a */
        /* loaded from: classes2.dex */
        static final class a extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            public static final a f251q = new a();

            a() {
                super(1);
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Long mo205i9(InterfaceC18186k interfaceC18186k) {
                AbstractC19074t.m100208f(interfaceC18186k, "obj");
                return Long.valueOf(interfaceC18186k.mo218W());
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a2.d$b$b, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C32611b extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: r */
            final /* synthetic */ InterfaceC18505l f253r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C32611b(InterfaceC18505l interfaceC18505l) {
                super(1);
                this.f253r = interfaceC18505l;
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo205i9(InterfaceC18182g interfaceC18182g) {
                AbstractC19074t.m100208f(interfaceC18182g, "db");
                InterfaceC18186k mo193b0 = interfaceC18182g.mo193b0(b.this.f248p);
                b.this.m215c(mo193b0);
                return this.f253r.mo205i9(mo193b0);
            }
        }

        /* renamed from: a2.d$b$c */
        /* loaded from: classes2.dex */
        static final class c extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            public static final c f254q = new c();

            c() {
                super(1);
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Integer mo205i9(InterfaceC18186k interfaceC18186k) {
                AbstractC19074t.m100208f(interfaceC18186k, "obj");
                return Integer.valueOf(interfaceC18186k.mo223w());
            }
        }

        public b(String str, C0059c c0059c) {
            AbstractC19074t.m100208f(str, "sql");
            AbstractC19074t.m100208f(c0059c, "autoCloser");
            this.f248p = str;
            this.f249q = c0059c;
            this.f250r = new ArrayList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public final void m215c(InterfaceC18186k interfaceC18186k) {
            Iterator it = this.f250r.iterator();
            int i11 = 0;
            while (it.hasNext()) {
                it.next();
                int i12 = i11 + 1;
                if (i11 < 0) {
                    AbstractC25368s.m131509q();
                }
                Object obj = this.f250r.get(i11);
                if (obj == null) {
                    interfaceC18186k.mo222u0(i12);
                } else if (obj instanceof Long) {
                    interfaceC18186k.mo220l0(i12, ((Number) obj).longValue());
                } else if (obj instanceof Double) {
                    interfaceC18186k.mo224x(i12, ((Number) obj).doubleValue());
                } else if (obj instanceof String) {
                    interfaceC18186k.mo219a0(i12, (String) obj);
                } else if (obj instanceof byte[]) {
                    interfaceC18186k.mo221n0(i12, (byte[]) obj);
                }
                i11 = i12;
            }
        }

        /* renamed from: d */
        private final Object m216d(InterfaceC18505l interfaceC18505l) {
            return this.f249q.m169g(new C32611b(interfaceC18505l));
        }

        /* renamed from: f */
        private final void m217f(int i11, Object obj) {
            int size;
            int i12 = i11 - 1;
            if (i12 >= this.f250r.size() && (size = this.f250r.size()) <= i12) {
                while (true) {
                    this.f250r.add(null);
                    if (size == i12) {
                        break;
                    } else {
                        size++;
                    }
                }
            }
            this.f250r.set(i12, obj);
        }

        @Override // p119e2.InterfaceC18186k
        /* renamed from: W */
        public long mo218W() {
            return ((Number) m216d(a.f251q)).longValue();
        }

        @Override // p119e2.InterfaceC18184i
        /* renamed from: a0 */
        public void mo219a0(int i11, String str) {
            AbstractC19074t.m100208f(str, "value");
            m217f(i11, str);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // p119e2.InterfaceC18184i
        /* renamed from: l0 */
        public void mo220l0(int i11, long j11) {
            m217f(i11, Long.valueOf(j11));
        }

        @Override // p119e2.InterfaceC18184i
        /* renamed from: n0 */
        public void mo221n0(int i11, byte[] bArr) {
            AbstractC19074t.m100208f(bArr, "value");
            m217f(i11, bArr);
        }

        @Override // p119e2.InterfaceC18184i
        /* renamed from: u0 */
        public void mo222u0(int i11) {
            m217f(i11, null);
        }

        @Override // p119e2.InterfaceC18186k
        /* renamed from: w */
        public int mo223w() {
            return ((Number) m216d(c.f254q)).intValue();
        }

        @Override // p119e2.InterfaceC18184i
        /* renamed from: x */
        public void mo224x(int i11, double d11) {
            m217f(i11, Double.valueOf(d11));
        }
    }

    /* renamed from: a2.d$c */
    /* loaded from: classes2.dex */
    private static final class c implements Cursor {

        /* renamed from: p */
        private final Cursor f255p;

        /* renamed from: q */
        private final C0059c f256q;

        public c(Cursor cursor, C0059c c0059c) {
            AbstractC19074t.m100208f(cursor, "delegate");
            AbstractC19074t.m100208f(c0059c, "autoCloser");
            this.f255p = cursor;
            this.f256q = c0059c;
        }

        @Override // android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f255p.close();
            this.f256q.m168e();
        }

        @Override // android.database.Cursor
        public void copyStringToBuffer(int i11, CharArrayBuffer charArrayBuffer) {
            this.f255p.copyStringToBuffer(i11, charArrayBuffer);
        }

        @Override // android.database.Cursor
        public void deactivate() {
            this.f255p.deactivate();
        }

        @Override // android.database.Cursor
        public byte[] getBlob(int i11) {
            return this.f255p.getBlob(i11);
        }

        @Override // android.database.Cursor
        public int getColumnCount() {
            return this.f255p.getColumnCount();
        }

        @Override // android.database.Cursor
        public int getColumnIndex(String str) {
            return this.f255p.getColumnIndex(str);
        }

        @Override // android.database.Cursor
        public int getColumnIndexOrThrow(String str) {
            return this.f255p.getColumnIndexOrThrow(str);
        }

        @Override // android.database.Cursor
        public String getColumnName(int i11) {
            return this.f255p.getColumnName(i11);
        }

        @Override // android.database.Cursor
        public String[] getColumnNames() {
            return this.f255p.getColumnNames();
        }

        @Override // android.database.Cursor
        public int getCount() {
            return this.f255p.getCount();
        }

        @Override // android.database.Cursor
        public double getDouble(int i11) {
            return this.f255p.getDouble(i11);
        }

        @Override // android.database.Cursor
        public Bundle getExtras() {
            return this.f255p.getExtras();
        }

        @Override // android.database.Cursor
        public float getFloat(int i11) {
            return this.f255p.getFloat(i11);
        }

        @Override // android.database.Cursor
        public int getInt(int i11) {
            return this.f255p.getInt(i11);
        }

        @Override // android.database.Cursor
        public long getLong(int i11) {
            return this.f255p.getLong(i11);
        }

        @Override // android.database.Cursor
        public Uri getNotificationUri() {
            return C18178c.m96920a(this.f255p);
        }

        @Override // android.database.Cursor
        public List getNotificationUris() {
            return C18181f.m96924a(this.f255p);
        }

        @Override // android.database.Cursor
        public int getPosition() {
            return this.f255p.getPosition();
        }

        @Override // android.database.Cursor
        public short getShort(int i11) {
            return this.f255p.getShort(i11);
        }

        @Override // android.database.Cursor
        public String getString(int i11) {
            return this.f255p.getString(i11);
        }

        @Override // android.database.Cursor
        public int getType(int i11) {
            return this.f255p.getType(i11);
        }

        @Override // android.database.Cursor
        public boolean getWantsAllOnMoveCalls() {
            return this.f255p.getWantsAllOnMoveCalls();
        }

        @Override // android.database.Cursor
        public boolean isAfterLast() {
            return this.f255p.isAfterLast();
        }

        @Override // android.database.Cursor
        public boolean isBeforeFirst() {
            return this.f255p.isBeforeFirst();
        }

        @Override // android.database.Cursor
        public boolean isClosed() {
            return this.f255p.isClosed();
        }

        @Override // android.database.Cursor
        public boolean isFirst() {
            return this.f255p.isFirst();
        }

        @Override // android.database.Cursor
        public boolean isLast() {
            return this.f255p.isLast();
        }

        @Override // android.database.Cursor
        public boolean isNull(int i11) {
            return this.f255p.isNull(i11);
        }

        @Override // android.database.Cursor
        public boolean move(int i11) {
            return this.f255p.move(i11);
        }

        @Override // android.database.Cursor
        public boolean moveToFirst() {
            return this.f255p.moveToFirst();
        }

        @Override // android.database.Cursor
        public boolean moveToLast() {
            return this.f255p.moveToLast();
        }

        @Override // android.database.Cursor
        public boolean moveToNext() {
            return this.f255p.moveToNext();
        }

        @Override // android.database.Cursor
        public boolean moveToPosition(int i11) {
            return this.f255p.moveToPosition(i11);
        }

        @Override // android.database.Cursor
        public boolean moveToPrevious() {
            return this.f255p.moveToPrevious();
        }

        @Override // android.database.Cursor
        public void registerContentObserver(ContentObserver contentObserver) {
            this.f255p.registerContentObserver(contentObserver);
        }

        @Override // android.database.Cursor
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            this.f255p.registerDataSetObserver(dataSetObserver);
        }

        @Override // android.database.Cursor
        public boolean requery() {
            return this.f255p.requery();
        }

        @Override // android.database.Cursor
        public Bundle respond(Bundle bundle) {
            return this.f255p.respond(bundle);
        }

        @Override // android.database.Cursor
        public void setExtras(Bundle bundle) {
            AbstractC19074t.m100208f(bundle, "extras");
            C18180e.m96923a(this.f255p, bundle);
        }

        @Override // android.database.Cursor
        public void setNotificationUri(ContentResolver contentResolver, Uri uri) {
            this.f255p.setNotificationUri(contentResolver, uri);
        }

        @Override // android.database.Cursor
        public void setNotificationUris(ContentResolver contentResolver, List list) {
            AbstractC19074t.m100208f(contentResolver, "cr");
            AbstractC19074t.m100208f(list, "uris");
            C18181f.m96925b(this.f255p, contentResolver, list);
        }

        @Override // android.database.Cursor
        public void unregisterContentObserver(ContentObserver contentObserver) {
            this.f255p.unregisterContentObserver(contentObserver);
        }

        @Override // android.database.Cursor
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            this.f255p.unregisterDataSetObserver(dataSetObserver);
        }
    }

    public C0061d(InterfaceC18183h interfaceC18183h, C0059c c0059c) {
        AbstractC19074t.m100208f(interfaceC18183h, "delegate");
        AbstractC19074t.m100208f(c0059c, "autoCloser");
        this.f231p = interfaceC18183h;
        this.f232q = c0059c;
        c0059c.m173k(mo186a());
        this.f233r = new a(c0059c);
    }

    @Override // p008a2.InterfaceC0071i
    /* renamed from: a */
    public InterfaceC18183h mo186a() {
        return this.f231p;
    }

    @Override // p119e2.InterfaceC18183h, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f233r.close();
    }

    @Override // p119e2.InterfaceC18183h
    public String getDatabaseName() {
        return this.f231p.getDatabaseName();
    }

    @Override // p119e2.InterfaceC18183h
    /* renamed from: p0 */
    public InterfaceC18182g mo187p0() {
        this.f233r.m192a();
        return this.f233r;
    }

    @Override // p119e2.InterfaceC18183h
    public void setWriteAheadLoggingEnabled(boolean z11) {
        this.f231p.setWriteAheadLoggingEnabled(z11);
    }
}
